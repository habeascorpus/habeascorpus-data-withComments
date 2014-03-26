/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
taskdefs	TokenNameIdentifier	 taskdefs
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
DefaultLogger	TokenNameIdentifier	 Default Logger
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
;	TokenNameSEMICOLON	
/** * Test Java-dependent parts of the Echo task. */	TokenNameCOMMENT_JAVADOC	 Test Java-dependent parts of the Echo task. 
public	TokenNamepublic	
class	TokenNameclass	
EchoTest	TokenNameIdentifier	 Echo Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Create a new EchoTest. * @param name */	TokenNameCOMMENT_JAVADOC	 Create a new EchoTest. @param name 
public	TokenNamepublic	
EchoTest	TokenNameIdentifier	 Echo Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLogBlankEcho	TokenNameIdentifier	 test Log Blank Echo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Project	TokenNameIdentifier	 Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
EchoTestLogger	TokenNameIdentifier	 Echo Test Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
new	TokenNamenew	
EchoTestLogger	TokenNameIdentifier	 Echo Test Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
addBuildListener	TokenNameIdentifier	 add Build Listener
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Echo	TokenNameIdentifier	 Echo
echo	TokenNameIdentifier	 echo
=	TokenNameEQUAL	
new	TokenNamenew	
Echo	TokenNameIdentifier	 Echo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
echo	TokenNameIdentifier	 echo
.	TokenNameDOT	
setProject	TokenNameIdentifier	 set Project
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
echo	TokenNameIdentifier	 echo
.	TokenNameDOT	
setTaskName	TokenNameIdentifier	 set Task Name
(	TokenNameLPAREN	
"testLogBlankEcho"	TokenNameStringLiteral	testLogBlankEcho
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
echo	TokenNameIdentifier	 echo
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"[testLogBlankEcho] "	TokenNameStringLiteral	[testLogBlankEcho] 
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
lastLoggedMessage	TokenNameIdentifier	 last Logged Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
EchoTestLogger	TokenNameIdentifier	 Echo Test Logger
extends	TokenNameextends	
DefaultLogger	TokenNameIdentifier	 Default Logger
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
lastLoggedMessage	TokenNameIdentifier	 last Logged Message
;	TokenNameSEMICOLON	
/** * Create a new EchoTestLogger. */	TokenNameCOMMENT_JAVADOC	 Create a new EchoTestLogger. 
public	TokenNamepublic	
EchoTestLogger	TokenNameIdentifier	 Echo Test Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setMessageOutputLevel	TokenNameIdentifier	 set Message Output Level
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_DEBUG	TokenNameIdentifier	 MSG  DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setOutputPrintStream	TokenNameIdentifier	 set Output Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setErrorPrintStream	TokenNameIdentifier	 set Error Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
PrintStream	TokenNameIdentifier	 Print Stream
(	TokenNameLPAREN	
new	TokenNamenew	
ByteArrayOutputStream	TokenNameIdentifier	 Byte Array Output Stream
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
protected	TokenNameprotected	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lastLoggedMessage	TokenNameIdentifier	 last Logged Message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
