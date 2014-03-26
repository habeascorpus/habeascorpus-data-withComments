package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
artifact	TokenNameIdentifier	 artifact
.	TokenNameDOT	
resolver	TokenNameIdentifier	 resolver
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
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
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
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
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
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
authorization	TokenNameIdentifier	 authorization
.	TokenNameDOT	
AuthorizationException	TokenNameIdentifier	 Authorization Exception
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
providers	TokenNameIdentifier	 providers
.	TokenNameDOT	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
FileWagon	TokenNameIdentifier	 File Wagon
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
/** * Wagon used for test cases that annotates some methods. Note that this is not a thread-safe implementation. */	TokenNameCOMMENT_JAVADOC	 Wagon used for test cases that annotates some methods. Note that this is not a thread-safe implementation. 
public	TokenNamepublic	
class	TokenNameclass	
TestFileWagon	TokenNameIdentifier	 Test File Wagon
extends	TokenNameextends	
FileWagon	TokenNameIdentifier	 File Wagon
{	TokenNameLBRACE	
private	TokenNameprivate	
TestTransferListener	TokenNameIdentifier	 Test Transfer Listener
testTransferListener	TokenNameIdentifier	 test Transfer Listener
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
insideGet	TokenNameIdentifier	 inside Get
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
getTransfer	TokenNameIdentifier	 get Transfer
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
InputStream	TokenNameIdentifier	 Input Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
boolean	TokenNameboolean	
closeInput	TokenNameIdentifier	 close Input
,	TokenNameCOMMA	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
{	TokenNameLBRACE	
addTransfer	TokenNameIdentifier	 add Transfer
(	TokenNameLPAREN	
"getTransfer "	TokenNameStringLiteral	getTransfer 
+	TokenNamePLUS	
resource	TokenNameIdentifier	 resource
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
getTransfer	TokenNameIdentifier	 get Transfer
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
,	TokenNameCOMMA	
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
closeInput	TokenNameIdentifier	 close Input
,	TokenNameCOMMA	
maxSize	TokenNameIdentifier	 max Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceName	TokenNameIdentifier	 resource Name
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
,	TokenNameCOMMA	
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
,	TokenNameCOMMA	
AuthorizationException	TokenNameIdentifier	 Authorization Exception
{	TokenNameLBRACE	
addTransfer	TokenNameIdentifier	 add Transfer
(	TokenNameLPAREN	
"get "	TokenNameStringLiteral	get 
+	TokenNamePLUS	
resourceName	TokenNameIdentifier	 resource Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insideGet	TokenNameIdentifier	 inside Get
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
resourceName	TokenNameIdentifier	 resource Name
,	TokenNameCOMMA	
destination	TokenNameIdentifier	 destination
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insideGet	TokenNameIdentifier	 inside Get
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addTransfer	TokenNameIdentifier	 add Transfer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceName	TokenNameIdentifier	 resource Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
testTransferListener	TokenNameIdentifier	 test Transfer Listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testTransferListener	TokenNameIdentifier	 test Transfer Listener
.	TokenNameDOT	
addTransfer	TokenNameIdentifier	 add Transfer
(	TokenNameLPAREN	
resourceName	TokenNameIdentifier	 resource Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getIfNewer	TokenNameIdentifier	 get If Newer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
resourceName	TokenNameIdentifier	 resource Name
,	TokenNameCOMMA	
File	TokenNameIdentifier	 File
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
long	TokenNamelong	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransferFailedException	TokenNameIdentifier	 Transfer Failed Exception
,	TokenNameCOMMA	
ResourceDoesNotExistException	TokenNameIdentifier	 Resource Does Not Exist Exception
,	TokenNameCOMMA	
AuthorizationException	TokenNameIdentifier	 Authorization Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
insideGet	TokenNameIdentifier	 inside Get
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addTransfer	TokenNameIdentifier	 add Transfer
(	TokenNameLPAREN	
"getIfNewer "	TokenNameStringLiteral	getIfNewer 
+	TokenNamePLUS	
resourceName	TokenNameIdentifier	 resource Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getIfNewer	TokenNameIdentifier	 get If Newer
(	TokenNameLPAREN	
resourceName	TokenNameIdentifier	 resource Name
,	TokenNameCOMMA	
destination	TokenNameIdentifier	 destination
,	TokenNameCOMMA	
timestamp	TokenNameIdentifier	 timestamp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTransferListener	TokenNameIdentifier	 add Transfer Listener
(	TokenNameLPAREN	
TransferListener	TokenNameIdentifier	 Transfer Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
instanceof	TokenNameinstanceof	
TestTransferListener	TokenNameIdentifier	 Test Transfer Listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
testTransferListener	TokenNameIdentifier	 test Transfer Listener
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TestTransferListener	TokenNameIdentifier	 Test Transfer Listener
)	TokenNameRPAREN	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
addTransferListener	TokenNameIdentifier	 add Transfer Listener
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
