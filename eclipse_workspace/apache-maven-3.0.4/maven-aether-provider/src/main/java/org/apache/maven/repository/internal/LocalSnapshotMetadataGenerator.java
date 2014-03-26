package org.apache.maven.repository.internal;

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

import java.util.Collection;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

import org.sonatype.aether.ConfigurationProperties;
import org.sonatype.aether.RepositorySystemSession;
import org.sonatype.aether.artifact.Artifact;
import org.sonatype.aether.impl.MetadataGenerator;
import org.sonatype.aether.installation.InstallRequest;
import org.sonatype.aether.metadata.Metadata;

/**
 * @author Benjamin Bentmann
 */
class LocalSnapshotMetadataGenerator
    implements MetadataGenerator
{

    private Map<Object, LocalSnapshotMetadata> snapshots;

    private final boolean legacyFormat;

    public LocalSnapshotMetadataGenerator( RepositorySystemSession session, InstallRequest request )
    {
        legacyFormat = ConfigurationProperties.get( session.getConfigProperties(), "maven.metadata.legacy", false );

        snapshots = new LinkedHashMap<Object, LocalSnapshotMetadata>();
    }

    public Collection<? extends Metadata> prepare( Collection<? extends Artifact> artifacts )
    {
        for ( Artifact artifact : artifacts )
        {
            if ( artifact.isSnapshot() )
            {
                Object key = LocalSnapshotMetadata.getKey( artifact );
                LocalSnapshotMetadata snapshotMetadata = snapshots.get( key );
                if ( snapshotMetadata == null )
                {
                    snapshotMetadata = new LocalSnapshotMetadata( artifact, legacyFormat );
                    snapshots.put( key, snapshotMetadata );
                }
                snapshotMetadata.bind( artifact );
            }
        }

        return Collections.emptyList();
    }

    public Artifact transformArtifact( Artifact artifact )
    {
        return artifact;
    }

    public Collection<? extends Metadata> finish( Collection<? extends Artifact> artifacts )
    {
        return snapshots.values();
    }

}
