package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
repository	TokenNameIdentifier	 repository
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
;	TokenNameSEMICOLON	
/** * TransferEvent is used to notify TransferListeners about progress * in transfer of resources form/to the repository * * @author <a href="michal.maczka@dimatics.com">Michal Maczka</a> */	TokenNameCOMMENT_JAVADOC	 TransferEvent is used to notify TransferListeners about progress in transfer of resources form/to the repository * @author <a href="michal.maczka@dimatics.com">Michal Maczka</a> 
public	TokenNamepublic	
class	TokenNameclass	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** * A transfer was attempted, but has not yet commenced. */	TokenNameCOMMENT_JAVADOC	 A transfer was attempted, but has not yet commenced. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFER_INITIATED	TokenNameIdentifier	 TRANSFER  INITIATED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A transfer was started. */	TokenNameCOMMENT_JAVADOC	 A transfer was started. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFER_STARTED	TokenNameIdentifier	 TRANSFER  STARTED
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A transfer is completed. */	TokenNameCOMMENT_JAVADOC	 A transfer is completed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFER_COMPLETED	TokenNameIdentifier	 TRANSFER  COMPLETED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A transfer is in progress. */	TokenNameCOMMENT_JAVADOC	 A transfer is in progress. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFER_PROGRESS	TokenNameIdentifier	 TRANSFER  PROGRESS
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * An error occurred during transfer */	TokenNameCOMMENT_JAVADOC	 An error occurred during transfer 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TRANSFER_ERROR	TokenNameIdentifier	 TRANSFER  ERROR
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates GET transfer (from the repository) */	TokenNameCOMMENT_JAVADOC	 Indicates GET transfer (from the repository) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REQUEST_GET	TokenNameIdentifier	 REQUEST  GET
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates PUT transfer (to the repository) */	TokenNameCOMMENT_JAVADOC	 Indicates PUT transfer (to the repository) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REQUEST_PUT	TokenNameIdentifier	 REQUEST  PUT
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
requestType	TokenNameIdentifier	 request Type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
transferredBytes	TokenNameIdentifier	 transferred Bytes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dataBuffer	TokenNameIdentifier	 data Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
dataOffset	TokenNameIdentifier	 data Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
dataLength	TokenNameIdentifier	 data Length
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
wagon	TokenNameIdentifier	 wagon
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
requestType	TokenNameIdentifier	 request Type
,	TokenNameCOMMA	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
wagon	TokenNameIdentifier	 wagon
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEventType	TokenNameIdentifier	 set Event Type
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRequestType	TokenNameIdentifier	 set Request Type
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
=	TokenNameEQUAL	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
wagon	TokenNameIdentifier	 wagon
,	TokenNameCOMMA	
final	TokenNamefinal	
Exception	TokenNameIdentifier	 Exception
exception	TokenNameIdentifier	 exception
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
requestType	TokenNameIdentifier	 request Type
,	TokenNameCOMMA	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
wagon	TokenNameIdentifier	 wagon
,	TokenNameCOMMA	
TRANSFER_ERROR	TokenNameIdentifier	 TRANSFER  ERROR
,	TokenNameCOMMA	
requestType	TokenNameIdentifier	 request Type
,	TokenNameCOMMA	
artifact	TokenNameIdentifier	 artifact
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
=	TokenNameEQUAL	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ArtifactTransferResource	TokenNameIdentifier	 Artifact Transfer Resource
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
artifact	TokenNameIdentifier	 artifact
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the exception. */	TokenNameCOMMENT_JAVADOC	 @return Returns the exception. 
public	TokenNamepublic	
Exception	TokenNameIdentifier	 Exception
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
exception	TokenNameIdentifier	 exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the request type. * * @return Returns the request type. The Request type is one of * <code>TransferEvent.REQUEST_GET<code> or <code>TransferEvent.REQUEST_PUT<code> */	TokenNameCOMMENT_JAVADOC	 Returns the request type. * @return Returns the request type. The Request type is one of <code>TransferEvent.REQUEST_GET<code> or <code>TransferEvent.REQUEST_PUT<code> 
public	TokenNamepublic	
int	TokenNameint	
getRequestType	TokenNameIdentifier	 get Request Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
requestType	TokenNameIdentifier	 request Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the request type * * @param requestType The requestType to set. * The Request type value should be either * <code>TransferEvent.REQUEST_GET<code> or <code>TransferEvent.REQUEST_PUT<code>. * @throws IllegalArgumentException when */	TokenNameCOMMENT_JAVADOC	 Sets the request type * @param requestType The requestType to set. The Request type value should be either <code>TransferEvent.REQUEST_GET<code> or <code>TransferEvent.REQUEST_PUT<code>. @throws IllegalArgumentException when 
public	TokenNamepublic	
void	TokenNamevoid	
setRequestType	TokenNameIdentifier	 set Request Type
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
requestType	TokenNameIdentifier	 request Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
REQUEST_PUT	TokenNameIdentifier	 REQUEST  PUT
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
REQUEST_GET	TokenNameIdentifier	 REQUEST  GET
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal request type: "	TokenNameStringLiteral	Illegal request type: 
+	TokenNamePLUS	
requestType	TokenNameIdentifier	 request Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
requestType	TokenNameIdentifier	 request Type
=	TokenNameEQUAL	
requestType	TokenNameIdentifier	 request Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the eventType. */	TokenNameCOMMENT_JAVADOC	 @return Returns the eventType. 
public	TokenNamepublic	
int	TokenNameint	
getEventType	TokenNameIdentifier	 get Event Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eventType	TokenNameIdentifier	 event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param eventType The eventType to set. */	TokenNameCOMMENT_JAVADOC	 @param eventType The eventType to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setEventType	TokenNameIdentifier	 set Event Type
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TRANSFER_INITIATED	TokenNameIdentifier	 TRANSFER  INITIATED
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFER_STARTED	TokenNameIdentifier	 TRANSFER  STARTED
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFER_COMPLETED	TokenNameIdentifier	 TRANSFER  COMPLETED
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFER_PROGRESS	TokenNameIdentifier	 TRANSFER  PROGRESS
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFER_ERROR	TokenNameIdentifier	 TRANSFER  ERROR
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal event type: "	TokenNameStringLiteral	Illegal event type: 
+	TokenNamePLUS	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
eventType	TokenNameIdentifier	 event Type
=	TokenNameEQUAL	
eventType	TokenNameIdentifier	 event Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return Returns the local file. */	TokenNameCOMMENT_JAVADOC	 @return Returns the local file. 
public	TokenNamepublic	
File	TokenNameIdentifier	 File
getLocalFile	TokenNameIdentifier	 get Local File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localFile	TokenNameIdentifier	 local File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param localFile The local file to set. */	TokenNameCOMMENT_JAVADOC	 @param localFile The local file to set. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocalFile	TokenNameIdentifier	 set Local File
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
localFile	TokenNameIdentifier	 local File
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
localFile	TokenNameIdentifier	 local File
=	TokenNameEQUAL	
localFile	TokenNameIdentifier	 local File
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
getTransferredBytes	TokenNameIdentifier	 get Transferred Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
transferredBytes	TokenNameIdentifier	 transferred Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTransferredBytes	TokenNameIdentifier	 set Transferred Bytes
(	TokenNameLPAREN	
long	TokenNamelong	
transferredBytes	TokenNameIdentifier	 transferred Bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
transferredBytes	TokenNameIdentifier	 transferred Bytes
=	TokenNameEQUAL	
transferredBytes	TokenNameIdentifier	 transferred Bytes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataBuffer	TokenNameIdentifier	 data Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDataBuffer	TokenNameIdentifier	 set Data Buffer
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dataBuffer	TokenNameIdentifier	 data Buffer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dataBuffer	TokenNameIdentifier	 data Buffer
=	TokenNameEQUAL	
dataBuffer	TokenNameIdentifier	 data Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDataOffset	TokenNameIdentifier	 get Data Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataOffset	TokenNameIdentifier	 data Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDataOffset	TokenNameIdentifier	 set Data Offset
(	TokenNameLPAREN	
int	TokenNameint	
dataOffset	TokenNameIdentifier	 data Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dataOffset	TokenNameIdentifier	 data Offset
=	TokenNameEQUAL	
dataOffset	TokenNameIdentifier	 data Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getDataLength	TokenNameIdentifier	 get Data Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dataLength	TokenNameIdentifier	 data Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDataLength	TokenNameIdentifier	 set Data Length
(	TokenNameLPAREN	
int	TokenNameint	
dataLength	TokenNameIdentifier	 data Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
dataLength	TokenNameIdentifier	 data Length
=	TokenNameEQUAL	
dataLength	TokenNameIdentifier	 data Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"TransferEvent["	TokenNameStringLiteral	TransferEvent[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getRequestType	TokenNameIdentifier	 get Request Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
REQUEST_GET	TokenNameIdentifier	 REQUEST  GET
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"GET"	TokenNameStringLiteral	GET
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
REQUEST_PUT	TokenNameIdentifier	 REQUEST  PUT
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"PUT"	TokenNameStringLiteral	PUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getRequestType	TokenNameIdentifier	 get Request Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getEventType	TokenNameIdentifier	 get Event Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
TRANSFER_COMPLETED	TokenNameIdentifier	 TRANSFER  COMPLETED
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"COMPLETED"	TokenNameStringLiteral	COMPLETED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFER_ERROR	TokenNameIdentifier	 TRANSFER  ERROR
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ERROR"	TokenNameStringLiteral	ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFER_INITIATED	TokenNameIdentifier	 TRANSFER  INITIATED
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"INITIATED"	TokenNameStringLiteral	INITIATED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFER_PROGRESS	TokenNameIdentifier	 TRANSFER  PROGRESS
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"PROGRESS"	TokenNameStringLiteral	PROGRESS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TRANSFER_STARTED	TokenNameIdentifier	 TRANSFER  STARTED
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"STARTED"	TokenNameStringLiteral	STARTED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getEventType	TokenNameIdentifier	 get Event Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getLocalFile	TokenNameIdentifier	 get Local File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"|"	TokenNameStringLiteral	|
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
eventType	TokenNameIdentifier	 event Type
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
localFile	TokenNameIdentifier	 local File
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
localFile	TokenNameIdentifier	 local File
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
requestType	TokenNameIdentifier	 request Type
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ArtifactTransferEvent	TokenNameIdentifier	 Artifact Transfer Event
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eventType	TokenNameIdentifier	 event Type
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
eventType	TokenNameIdentifier	 event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
exception	TokenNameIdentifier	 exception
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
exception	TokenNameIdentifier	 exception
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
requestType	TokenNameIdentifier	 request Type
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
requestType	TokenNameIdentifier	 request Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
