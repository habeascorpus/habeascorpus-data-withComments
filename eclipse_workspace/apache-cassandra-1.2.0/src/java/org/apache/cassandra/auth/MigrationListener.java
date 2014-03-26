/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.cassandra.auth;

import org.apache.cassandra.config.DatabaseDescriptor;
import org.apache.cassandra.service.IMigrationListener;

/**
 * IMigrationListener implementation that cleans up permissions on dropped resources.
 */
public class MigrationListener implements IMigrationListener
{
    public void onDropKeyspace(String ksName)
    {
        DatabaseDescriptor.getAuthorizer().revokeAll(DataResource.keyspace(ksName));
    }

    public void onDropColumnFamly(String ksName, String cfName)
    {
        DatabaseDescriptor.getAuthorizer().revokeAll(DataResource.columnFamily(ksName, cfName));
    }

    public void onCreateKeyspace(String ksName)
    {
    }

    public void onCreateColumnFamly(String ksName, String cfName)
    {
    }

    public void onUpdateKeyspace(String ksName)
    {
    }

    public void onUpdateColumnFamly(String ksName, String cfName)
    {
    }
}
