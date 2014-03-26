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
util	TokenNameIdentifier	 util
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
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
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
Task	TokenNameIdentifier	 Task
;	TokenNameSEMICOLON	
/** * A simple utility class to take a piece of code (that implements * <code>Retryable</code> interface) and executes that with possibility to * retry the execution in case of IOException. */	TokenNameCOMMENT_JAVADOC	 A simple utility class to take a piece of code (that implements <code>Retryable</code> interface) and executes that with possibility to retry the execution in case of IOException. 
public	TokenNamepublic	
class	TokenNameclass	
RetryHandler	TokenNameIdentifier	 Retry Handler
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
retriesAllowed	TokenNameIdentifier	 retries Allowed
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
/** * Create a new RetryingHandler. * * @param retriesAllowed how many times to retry * @param task the Ant task that is is executed from, used for logging only */	TokenNameCOMMENT_JAVADOC	 Create a new RetryingHandler. * @param retriesAllowed how many times to retry @param task the Ant task that is is executed from, used for logging only 
public	TokenNamepublic	
RetryHandler	TokenNameIdentifier	 Retry Handler
(	TokenNameLPAREN	
int	TokenNameint	
retriesAllowed	TokenNameIdentifier	 retries Allowed
,	TokenNameCOMMA	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
retriesAllowed	TokenNameIdentifier	 retries Allowed
=	TokenNameEQUAL	
retriesAllowed	TokenNameIdentifier	 retries Allowed
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the <code>Retryable</code> code with specified number of retries. * * @param exe the code to execute * @param desc some descriptive text for this piece of code, used for logging * @throws IOException if the number of retries has exceeded the allowed limit */	TokenNameCOMMENT_JAVADOC	 Execute the <code>Retryable</code> code with specified number of retries. * @param exe the code to execute @param desc some descriptive text for this piece of code, used for logging @throws IOException if the number of retries has exceeded the allowed limit 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
Retryable	TokenNameIdentifier	 Retryable
exe	TokenNameIdentifier	 exe
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
desc	TokenNameIdentifier	 desc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
retries	TokenNameIdentifier	 retries
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
exe	TokenNameIdentifier	 exe
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
retries	TokenNameIdentifier	 retries
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
retries	TokenNameIdentifier	 retries
>	TokenNameGREATER	
this	TokenNamethis	
.	TokenNameDOT	
retriesAllowed	TokenNameIdentifier	 retries Allowed
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
retriesAllowed	TokenNameIdentifier	 retries Allowed
>	TokenNameGREATER	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"try #"	TokenNameStringLiteral	try #
+	TokenNamePLUS	
retries	TokenNameIdentifier	 retries
+	TokenNamePLUS	
": IO error ("	TokenNameStringLiteral	: IO error (
+	TokenNamePLUS	
desc	TokenNameIdentifier	 desc
+	TokenNamePLUS	
"), number of maximum retries reached ("	TokenNameStringLiteral	), number of maximum retries reached (
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
retriesAllowed	TokenNameIdentifier	 retries Allowed
+	TokenNamePLUS	
"), giving up"	TokenNameStringLiteral	), giving up
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"try #"	TokenNameStringLiteral	try #
+	TokenNamePLUS	
retries	TokenNameIdentifier	 retries
+	TokenNamePLUS	
": IO error ("	TokenNameStringLiteral	: IO error (
+	TokenNamePLUS	
desc	TokenNameIdentifier	 desc
+	TokenNamePLUS	
"), retrying"	TokenNameStringLiteral	), retrying
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
