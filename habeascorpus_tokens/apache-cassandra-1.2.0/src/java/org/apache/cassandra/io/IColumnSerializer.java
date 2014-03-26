/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
io	TokenNameIdentifier	 io
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
IColumn	TokenNameIdentifier	 I Column
;	TokenNameSEMICOLON	
public	TokenNamepublic	
interface	TokenNameinterface	
IColumnSerializer	TokenNameIdentifier	 I Column Serializer
extends	TokenNameextends	
ISerializer	TokenNameIdentifier	 I Serializer
<	TokenNameLESS	
IColumn	TokenNameIdentifier	 I Column
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Flag affecting deserialization behavior. * - LOCAL: for deserialization of local data (Expired columns are * converted to tombstones (to gain disk space)). * - FROM_REMOTE: for deserialization of data received from remote hosts * (Expired columns are converted to tombstone and counters have * their delta cleared) * - PRESERVE_SIZE: used when no transformation must be performed, i.e, * when we must ensure that deserializing and reserializing the * result yield the exact same bytes. Streaming uses this. */	TokenNameCOMMENT_JAVADOC	 Flag affecting deserialization behavior. - LOCAL: for deserialization of local data (Expired columns are converted to tombstones (to gain disk space)). - FROM_REMOTE: for deserialization of data received from remote hosts (Expired columns are converted to tombstone and counters have their delta cleared) - PRESERVE_SIZE: used when no transformation must be performed, i.e, when we must ensure that deserializing and reserializing the result yield the exact same bytes. Streaming uses this. 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Flag	TokenNameIdentifier	 Flag
{	TokenNameLBRACE	
LOCAL	TokenNameIdentifier	 LOCAL
,	TokenNameCOMMA	
FROM_REMOTE	TokenNameIdentifier	 FROM  REMOTE
,	TokenNameCOMMA	
PRESERVE_SIZE	TokenNameIdentifier	 PRESERVE  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Flag	TokenNameIdentifier	 Flag
flag	TokenNameIdentifier	 flag
,	TokenNameCOMMA	
int	TokenNameint	
expireBefore	TokenNameIdentifier	 expire Before
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
