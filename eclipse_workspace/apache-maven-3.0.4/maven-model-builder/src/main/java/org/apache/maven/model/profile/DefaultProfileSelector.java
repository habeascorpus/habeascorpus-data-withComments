package org.apache.maven.model.profile;

/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

import org.apache.maven.model.Activation;
import org.apache.maven.model.Profile;
import org.apache.maven.model.building.ModelProblemCollector;
import org.apache.maven.model.building.ModelProblem.Severity;
import org.apache.maven.model.profile.activation.ProfileActivator;
import org.codehaus.plexus.component.annotations.Component;
import org.codehaus.plexus.component.annotations.Requirement;

/**
 * Calculates the active profiles among a given collection of profiles.
 * 
 * @author Benjamin Bentmann
 */
@Component( role = ProfileSelector.class )
public class DefaultProfileSelector
    implements ProfileSelector
{

    @Requirement( role = ProfileActivator.class )
    private List<ProfileActivator> activators = new ArrayList<ProfileActivator>();

    public DefaultProfileSelector addProfileActivator( ProfileActivator profileActivator )
    {
        if ( profileActivator != null )
        {
            activators.add( profileActivator );
        }
        return this;
    }

    public List<Profile> getActiveProfiles( Collection<Profile> profiles, ProfileActivationContext context,
                                            ModelProblemCollector problems )
    {
        Collection<String> activatedIds = new HashSet<String>( context.getActiveProfileIds() );
        Collection<String> deactivatedIds = new HashSet<String>( context.getInactiveProfileIds() );

        List<Profile> activeProfiles = new ArrayList<Profile>( profiles.size() );
        List<Profile> activePomProfilesByDefault = new ArrayList<Profile>();
        boolean activatedPomProfileNotByDefault = false;

        for ( Profile profile : profiles )
        {
            if ( !deactivatedIds.contains( profile.getId() ) )
            {
                if ( activatedIds.contains( profile.getId() ) || isActive( profile, context, problems ) )
                {
                    activeProfiles.add( profile );

                    if ( Profile.SOURCE_POM.equals( profile.getSource() ) )
                    {
                        activatedPomProfileNotByDefault = true;
                    }
                }
                else if ( isActiveByDefault( profile ) )
                {
                    if ( Profile.SOURCE_POM.equals( profile.getSource() ) )
                    {
                        activePomProfilesByDefault.add( profile );
                    }
                    else
                    {
                        activeProfiles.add( profile );
                    }
                }

            }
        }

        if ( !activatedPomProfileNotByDefault )
        {
            activeProfiles.addAll( activePomProfilesByDefault );
        }

        return activeProfiles;
    }

    private boolean isActive( Profile profile, ProfileActivationContext context, ModelProblemCollector problems )
    {
        for ( ProfileActivator activator : activators )
        {
            try
            {
                if ( activator.isActive( profile, context, problems ) )
                {
                    return true;
                }
            }
            catch ( RuntimeException e )
            {
                problems.add( Severity.ERROR, "Failed to determine activation for profile " + profile.getId(),
                              profile.getLocation( "" ), e );
                return false;
            }
        }
        return false;
    }

    private boolean isActiveByDefault( Profile profile )
    {
        Activation activation = profile.getActivation();
        return activation != null && activation.isActiveByDefault();
    }

}
