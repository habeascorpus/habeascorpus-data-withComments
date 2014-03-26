/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
MockBuildListener	TokenNameIdentifier	 Mock Build Listener
extends	TokenNameextends	
Assert	TokenNameIdentifier	 Assert
implements	TokenNameimplements	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Vector	TokenNameIdentifier	 Vector
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MockBuildListener	TokenNameIdentifier	 Mock Build Listener
(	TokenNameLPAREN	
final	TokenNamefinal	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
project	TokenNameIdentifier	 project
=	TokenNameEQUAL	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildStarted	TokenNameIdentifier	 build Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
buildFinished	TokenNameIdentifier	 build Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetStarted	TokenNameIdentifier	 target Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
targetFinished	TokenNameIdentifier	 target Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskStarted	TokenNameIdentifier	 task Started
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
taskFinished	TokenNameIdentifier	 task Finished
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
messageLogged	TokenNameIdentifier	 message Logged
(	TokenNameLPAREN	
final	TokenNamefinal	
BuildEvent	TokenNameIdentifier	 Build Event
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"unexpected messageLogged: "	TokenNameStringLiteral	unexpected messageLogged: 
+	TokenNamePLUS	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
!	TokenNameNOT	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unexpected project "	TokenNameStringLiteral	unexpected project 
,	TokenNameCOMMA	
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BuildEvent	TokenNameIdentifier	 Build Event
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BuildEvent	TokenNameIdentifier	 Build Event
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
removeElementAt	TokenNameIdentifier	 remove Element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unexpected messageLogged "	TokenNameStringLiteral	unexpected messageLogged 
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"unexpected priority "	TokenNameStringLiteral	unexpected priority 
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
assertEmpty	TokenNameIdentifier	 assert Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"MockBuildListener is not empty"	TokenNameStringLiteral	MockBuildListener is not empty
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addBuildEvent	TokenNameIdentifier	 add Build Event
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
BuildEvent	TokenNameIdentifier	 Build Event
be	TokenNameIdentifier	 be
=	TokenNameEQUAL	
new	TokenNamenew	
BuildEvent	TokenNameIdentifier	 Build Event
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
be	TokenNameIdentifier	 be
.	TokenNameDOT	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
be	TokenNameIdentifier	 be
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
