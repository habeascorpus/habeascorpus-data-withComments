/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * Created on Feb 19, 2003 */	TokenNameCOMMENT_BLOCK	 Created on Feb 19, 2003 
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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
public	TokenNamepublic	
class	TokenNameclass	
ProcessDestroyerTest	TokenNameIdentifier	 Process Destroyer Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
/** * Constructor for ProcessDestroyerTest. * @param arg0 */	TokenNameCOMMENT_JAVADOC	 Constructor for ProcessDestroyerTest. @param arg0 
public	TokenNamepublic	
ProcessDestroyerTest	TokenNameIdentifier	 Process Destroyer Test
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
arg0	TokenNameIdentifier	 arg0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testProcessDestroyer	TokenNameIdentifier	 test Process Destroyer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
ProcessDestroyer	TokenNameIdentifier	 Process Destroyer
processDestroyer	TokenNameIdentifier	 process Destroyer
=	TokenNameEQUAL	
new	TokenNamenew	
ProcessDestroyer	TokenNameIdentifier	 Process Destroyer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Process	TokenNameIdentifier	 Process
process	TokenNameIdentifier	 process
=	TokenNameEQUAL	
Runtime	TokenNameIdentifier	 Runtime
.	TokenNameDOT	
getRuntime	TokenNameIdentifier	 get Runtime
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
exec	TokenNameIdentifier	 exec
(	TokenNameLPAREN	
"java -cp "	TokenNameStringLiteral	java -cp 
+	TokenNamePLUS	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.class.path"	TokenNameStringLiteral	java.class.path
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Not registered as shutdown hook"	TokenNameStringLiteral	Not registered as shutdown hook
,	TokenNameCOMMA	
processDestroyer	TokenNameIdentifier	 process Destroyer
.	TokenNameDOT	
isAddedAsShutdownHook	TokenNameIdentifier	 is Added As Shutdown Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processDestroyer	TokenNameIdentifier	 process Destroyer
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Registered as shutdown hook"	TokenNameStringLiteral	Registered as shutdown hook
,	TokenNameCOMMA	
processDestroyer	TokenNameIdentifier	 process Destroyer
.	TokenNameDOT	
isAddedAsShutdownHook	TokenNameIdentifier	 is Added As Shutdown Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
process	TokenNameIdentifier	 process
.	TokenNameDOT	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
processDestroyer	TokenNameIdentifier	 process Destroyer
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
process	TokenNameIdentifier	 process
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Not registered as shutdown hook"	TokenNameStringLiteral	Not registered as shutdown hook
,	TokenNameCOMMA	
processDestroyer	TokenNameIdentifier	 process Destroyer
.	TokenNameDOT	
isAddedAsShutdownHook	TokenNameIdentifier	 is Added As Shutdown Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
ProcessDestroyerTest	TokenNameIdentifier	 Process Destroyer Test
(	TokenNameLPAREN	
"testProcessDestroyer"	TokenNameStringLiteral	testProcessDestroyer
)	TokenNameRPAREN	
.	TokenNameDOT	
testProcessDestroyer	TokenNameIdentifier	 test Process Destroyer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
60000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ie	TokenNameIdentifier	 ie
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
