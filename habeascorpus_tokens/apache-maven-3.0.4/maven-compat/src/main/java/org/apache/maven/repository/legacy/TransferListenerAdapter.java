package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
legacy	TokenNameIdentifier	 legacy
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactTransferListener	TokenNameIdentifier	 Artifact Transfer Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
TransferEvent	TokenNameIdentifier	 Transfer Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
TransferListener	TokenNameIdentifier	 Transfer Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
wagon	TokenNameIdentifier	 wagon
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TransferListenerAdapter	TokenNameIdentifier	 Transfer Listener Adapter
implements	TokenNameimplements	
TransferListener	TokenNameIdentifier	 Transfer Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ArtifactTransferListener	TokenNameIdentifier	 Artifact Transfer Listener
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Resource	TokenNameIdentifier	 Resource
,	TokenNameCOMMA	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
>	TokenNameGREATER	
artifacts	TokenNameIdentifier	 artifacts
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Resource	TokenNameIdentifier	 Resource
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
transfers	TokenNameIdentifier	 transfers
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
TransferListener	TokenNameIdentifier	 Transfer Listener
newAdapter	TokenNameIdentifier	 new Adapter
(	TokenNameLPAREN	
ArtifactTransferListener	TokenNameIdentifier	 Artifact Transfer Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TransferListenerAdapter	TokenNameIdentifier	 Transfer Listener Adapter
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
TransferListenerAdapter	TokenNameIdentifier	 Transfer Listener Adapter
(	TokenNameLPAREN	
ArtifactTransferListener	TokenNameIdentifier	 Artifact Transfer Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifacts	TokenNameIdentifier	 artifacts
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Resource	TokenNameIdentifier	 Resource
,	TokenNameCOMMA	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
transfers	TokenNameIdentifier	 transfers
=	TokenNameEQUAL	
new	TokenNamenew	
IdentityHashMap	TokenNameIdentifier	 Identity Hash Map
<	TokenNameLESS	
Resource	TokenNameIdentifier	 Resource
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
transferCompleted	TokenNameIdentifier	 transfer Completed
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Long	TokenNameIdentifier	 Long
transferred	TokenNameIdentifier	 transferred
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
transfers	TokenNameIdentifier	 transfers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transferred	TokenNameIdentifier	 transferred
=	TokenNameEQUAL	
transfers	TokenNameIdentifier	 transfers
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
transferred	TokenNameIdentifier	 transferred
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
setTransferredBytes	TokenNameIdentifier	 set Transferred Bytes
(	TokenNameLPAREN	
transferred	TokenNameIdentifier	 transferred
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
transferCompleted	TokenNameIdentifier	 transfer Completed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
transferError	TokenNameIdentifier	 transfer Error
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
transfers	TokenNameIdentifier	 transfers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transfers	TokenNameIdentifier	 transfers
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
transferInitiated	TokenNameIdentifier	 transfer Initiated
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
transferInitiated	TokenNameIdentifier	 transfer Initiated
(	TokenNameLPAREN	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
transferProgress	TokenNameIdentifier	 transfer Progress
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Long	TokenNameIdentifier	 Long
transferred	TokenNameIdentifier	 transferred
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
transfers	TokenNameIdentifier	 transfers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transferred	TokenNameIdentifier	 transferred
=	TokenNameEQUAL	
transfers	TokenNameIdentifier	 transfers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transferred	TokenNameIdentifier	 transferred
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transferred	TokenNameIdentifier	 transferred
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
transferred	TokenNameIdentifier	 transferred
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
transferred	TokenNameIdentifier	 transferred
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transfers	TokenNameIdentifier	 transfers
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
transferred	TokenNameIdentifier	 transferred
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
setDataBuffer	TokenNameIdentifier	 set Data Buffer
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
setDataOffset	TokenNameIdentifier	 set Data Offset
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
setDataLength	TokenNameIdentifier	 set Data Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
setTransferredBytes	TokenNameIdentifier	 set Transferred Bytes
(	TokenNameLPAREN	
transferred	TokenNameIdentifier	 transferred
.	TokenNameDOT	
longValue	TokenNameIdentifier	 long Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
transferProgress	TokenNameIdentifier	 transfer Progress
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
transferStarted	TokenNameIdentifier	 transfer Started
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
transferStarted	TokenNameIdentifier	 transfer Started
(	TokenNameLPAREN	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
transferEvent	TokenNameIdentifier	 transfer Event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
TransferEvent	TokenNameIdentifier	 Transfer Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
wagon	TokenNameIdentifier	 wagon
=	TokenNameEQUAL	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getWagon	TokenNameIdentifier	 get Wagon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getWagon	TokenNameIdentifier	 get Wagon
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRepository	TokenNameIdentifier	 get Repository
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
(	TokenNameLPAREN	
wagon	TokenNameIdentifier	 wagon
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRequestType	TokenNameIdentifier	 get Request Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
evt	TokenNameIdentifier	 evt
=	TokenNameEQUAL	
new	TokenNamenew	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
(	TokenNameLPAREN	
wagon	TokenNameIdentifier	 wagon
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getEventType	TokenNameIdentifier	 get Event Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getRequestType	TokenNameIdentifier	 get Request Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
evt	TokenNameIdentifier	 evt
.	TokenNameDOT	
setLocalFile	TokenNameIdentifier	 set Local File
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getLocalFile	TokenNameIdentifier	 get Local File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
evt	TokenNameIdentifier	 evt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
,	TokenNameCOMMA	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
artifacts	TokenNameIdentifier	 artifacts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
artifact	TokenNameIdentifier	 artifact
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
new	TokenNamenew	
MavenArtifact	TokenNameIdentifier	 Maven Artifact
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
.	TokenNameDOT	
getUrl	TokenNameIdentifier	 get Url
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
artifacts	TokenNameIdentifier	 artifacts
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
