package org.apache.maven.plugin;

/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.apache.maven.execution.MavenSession;
import org.apache.maven.model.Plugin;
import org.apache.maven.plugin.descriptor.MojoDescriptor;
import org.apache.maven.plugin.descriptor.PluginDescriptor;
import org.apache.maven.project.MavenProject;
import org.codehaus.plexus.classworlds.realm.ClassRealm;
import org.codehaus.plexus.component.annotations.Component;
import org.codehaus.plexus.component.annotations.Requirement;
import org.sonatype.aether.RepositorySystemSession;
import org.sonatype.aether.repository.RemoteRepository;

// TODO: the antrun plugin has its own configurator, the only plugin that does. might need to think about how that works
// TODO: remove the coreArtifactFilterManager

@Component(role = BuildPluginManager.class)
public class DefaultBuildPluginManager
    implements BuildPluginManager
{

    @Requirement
    private MavenPluginManager mavenPluginManager;

    @Requirement
    private LegacySupport legacySupport;

    /**
     * 
     * @param plugin
     * @param repositoryRequest
     * @return PluginDescriptor The component descriptor for the Maven plugin.
     * @throws PluginNotFoundException The plugin could not be found in any repositories.
     * @throws PluginResolutionException The plugin could be found but could not be resolved.
     * @throws InvalidPluginDescriptorException 
     */
    public PluginDescriptor loadPlugin( Plugin plugin, List<RemoteRepository> repositories, RepositorySystemSession session )
        throws PluginNotFoundException, PluginResolutionException, PluginDescriptorParsingException, InvalidPluginDescriptorException
    {
        return mavenPluginManager.getPluginDescriptor( plugin, repositories, session );
    }

    // ----------------------------------------------------------------------
    // Mojo execution
    // ----------------------------------------------------------------------

    public void executeMojo( MavenSession session, MojoExecution mojoExecution )
        throws MojoFailureException, MojoExecutionException, PluginConfigurationException, PluginManagerException
    {
        MavenProject project = session.getCurrentProject();

        MojoDescriptor mojoDescriptor = mojoExecution.getMojoDescriptor();

        Mojo mojo = null;

        ClassRealm pluginRealm;
        try
        {
            pluginRealm = getPluginRealm( session, mojoDescriptor.getPluginDescriptor() );
        }
        catch ( PluginResolutionException e )
        {
            throw new PluginExecutionException( mojoExecution, project, e );
        }

        ClassLoader oldClassLoader = Thread.currentThread().getContextClassLoader();
        Thread.currentThread().setContextClassLoader( pluginRealm );

        MavenSession oldSession = legacySupport.getSession();

        try
        {
            mojo = mavenPluginManager.getConfiguredMojo( Mojo.class, session, mojoExecution );

            legacySupport.setSession( session );

            // NOTE: DuplicateArtifactAttachmentException is currently unchecked, so be careful removing this try/catch!
            // This is necessary to avoid creating compatibility problems for existing plugins that use
            // MavenProjectHelper.attachArtifact(..).
            try
            {
                mojo.execute();
            }
            catch ( ClassCastException e )
            {
                // to be processed in the outer catch block
                throw e;
            }
            catch ( RuntimeException e )
            {
                throw new PluginExecutionException( mojoExecution, project, e );
            }
        }
        catch ( PluginContainerException e )
        {
            throw new PluginExecutionException( mojoExecution, project, e );
        }
        catch ( NoClassDefFoundError e )
        {
            ByteArrayOutputStream os = new ByteArrayOutputStream( 1024 );
            PrintStream ps = new PrintStream( os );
            ps.println( "A required class was missing while executing " + mojoDescriptor.getId() + ": "
                + e.getMessage() );
            pluginRealm.display( ps );

            Exception wrapper = new PluginContainerException( mojoDescriptor, pluginRealm, os.toString(), e );

            throw new PluginExecutionException( mojoExecution, project, wrapper );
        }
        catch ( LinkageError e )
        {
            ByteArrayOutputStream os = new ByteArrayOutputStream( 1024 );
            PrintStream ps = new PrintStream( os );
            ps.println( "An API incompatibility was encountered while executing " + mojoDescriptor.getId() + ": "
                + e.getClass().getName() + ": " + e.getMessage() );
            pluginRealm.display( ps );

            Exception wrapper = new PluginContainerException( mojoDescriptor, pluginRealm, os.toString(), e );

            throw new PluginExecutionException( mojoExecution, project, wrapper );
        }
        catch ( ClassCastException e )
        {
            ByteArrayOutputStream os = new ByteArrayOutputStream( 1024 );
            PrintStream ps = new PrintStream( os );
            ps.println( "A type incompatibility occured while executing " + mojoDescriptor.getId() + ": "
                + e.getMessage() );
            pluginRealm.display( ps );

            throw new PluginExecutionException( mojoExecution, project, os.toString(), e );
        }
        finally
        {
            mavenPluginManager.releaseMojo( mojo, mojoExecution );

            Thread.currentThread().setContextClassLoader( oldClassLoader );

            legacySupport.setSession( oldSession );
        }
    }

    /**
     * TODO pluginDescriptor classRealm and artifacts are set as a side effect of this
     *      call, which is not nice.
     * @throws PluginResolutionException 
     */
    public ClassRealm getPluginRealm( MavenSession session, PluginDescriptor pluginDescriptor ) 
        throws PluginResolutionException, PluginManagerException
    {
        ClassRealm pluginRealm = pluginDescriptor.getClassRealm();
        if ( pluginRealm != null )
        {
            return pluginRealm;
        }

        mavenPluginManager.setupPluginRealm( pluginDescriptor, session, null, null, null );

        return pluginDescriptor.getClassRealm();
    }

    public MojoDescriptor getMojoDescriptor( Plugin plugin, String goal, List<RemoteRepository> repositories,
                                             RepositorySystemSession session )
        throws PluginNotFoundException, PluginResolutionException, PluginDescriptorParsingException,
        MojoNotFoundException, InvalidPluginDescriptorException
    {
        return mavenPluginManager.getMojoDescriptor( plugin, goal, repositories, session );
    }

}
