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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
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
/** * Redirects text written to a stream thru the standard * ant logging mechanism. This class is useful for integrating * with tools that write to System.out and System.err. For example, * the following will cause all text written to System.out to be * logged with "info" priority: * <pre>System.setOut(new PrintStream(new TaskOutputStream(project, Project.MSG_INFO)));</pre> * * <p><strong>As of Ant 1.2, this class is considered to be dead code * by the Ant developers and is unmaintained. Don't use * it.</strong></p> * * @deprecated since 1.2.x. * Use LogOutputStream instead. */	TokenNameCOMMENT_JAVADOC	 Redirects text written to a stream thru the standard ant logging mechanism. This class is useful for integrating with tools that write to System.out and System.err. For example, the following will cause all text written to System.out to be logged with "info" priority: <pre>System.setOut(new PrintStream(new TaskOutputStream(project, Project.MSG_INFO)));</pre> * <p><strong>As of Ant 1.2, this class is considered to be dead code by the Ant developers and is unmaintained. Don't use it.</strong></p> * @deprecated since 1.2.x. Use LogOutputStream instead. 
public	TokenNamepublic	
class	TokenNameclass	
TaskOutputStream	TokenNameIdentifier	 Task Output Stream
extends	TokenNameextends	
OutputStream	TokenNameIdentifier	 Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
msgOutputLevel	TokenNameIdentifier	 msg Output Level
;	TokenNameSEMICOLON	
/** * Constructs a new JavacOutputStream with the given project * as the output source for messages. */	TokenNameCOMMENT_JAVADOC	 Constructs a new JavacOutputStream with the given project as the output source for messages. 
TaskOutputStream	TokenNameIdentifier	 Task Output Stream
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
int	TokenNameint	
msgOutputLevel	TokenNameIdentifier	 msg Output Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"As of Ant 1.2 released in October 2000, the "	TokenNameStringLiteral	As of Ant 1.2 released in October 2000, the 
+	TokenNamePLUS	
"TaskOutputStream class"	TokenNameStringLiteral	TaskOutputStream class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"is considered to be dead code by the Ant "	TokenNameStringLiteral	is considered to be dead code by the Ant 
+	TokenNamePLUS	
"developers and is unmaintained."	TokenNameStringLiteral	developers and is unmaintained.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Don't use it!"	TokenNameStringLiteral	Don't use it!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
task	TokenNameIdentifier	 task
=	TokenNameEQUAL	
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
msgOutputLevel	TokenNameIdentifier	 msg Output Level
=	TokenNameEQUAL	
msgOutputLevel	TokenNameIdentifier	 msg Output Level
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a character to the output stream. This method looks * to make sure that there isn't an error being reported and * will flush each line of input out to the project's log stream. * @param c the character to write * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Write a character to the output stream. This method looks to make sure that there isn't an error being reported and will flush each line of input out to the project's log stream. @param c the character to write @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
char	TokenNamechar	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// line feed 	TokenNameCOMMENT_LINE	line feed 
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Processes a line of input and determines if an error occurred. */	TokenNameCOMMENT_JAVADOC	 Processes a line of input and determines if an error occurred. 
private	TokenNameprivate	
void	TokenNamevoid	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
msgOutputLevel	TokenNameIdentifier	 msg Output Level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
