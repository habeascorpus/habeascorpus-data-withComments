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
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
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
/** * Parses output from jikes and * passes errors and warnings * into the right logging channels of Project. * * <p><strong>As of Ant 1.2, this class is considered to be dead code * by the Ant developers and is unmaintained. Don't use * it.</strong></p> * * @deprecated since 1.2. * Use Jikes' exit value to detect compilation failure. */	TokenNameCOMMENT_JAVADOC	 Parses output from jikes and passes errors and warnings into the right logging channels of Project. * <p><strong>As of Ant 1.2, this class is considered to be dead code by the Ant developers and is unmaintained. Don't use it.</strong></p> * @deprecated since 1.2. Use Jikes' exit value to detect compilation failure. 
public	TokenNamepublic	
class	TokenNameclass	
JikesOutputParser	TokenNameIdentifier	 Jikes Output Parser
implements	TokenNameimplements	
ExecuteStreamHandler	TokenNameIdentifier	 Execute Stream Handler
{	TokenNameLBRACE	
// CheckStyle:VisibilityModifier OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier OFF - bc 
protected	TokenNameprotected	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
errorFlag	TokenNameIdentifier	 error Flag
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// no errors so far 	TokenNameCOMMENT_LINE	no errors so far 
protected	TokenNameprotected	
int	TokenNameint	
errors	TokenNameIdentifier	 errors
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
warnings	TokenNameIdentifier	 warnings
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
emacsMode	TokenNameIdentifier	 emacs Mode
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
;	TokenNameSEMICOLON	
// CheckStyle:VisibilityModifier ON 	TokenNameCOMMENT_LINE	CheckStyle:VisibilityModifier ON 
/** * Ignore. * @param os ignored */	TokenNameCOMMENT_JAVADOC	 Ignore. @param os ignored 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessInputStream	TokenNameIdentifier	 set Process Input Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Ignore. * @param is ignored */	TokenNameCOMMENT_JAVADOC	 Ignore. @param is ignored 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessErrorStream	TokenNameIdentifier	 set Process Error Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Set the inputstream * @param is the input stream * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Set the inputstream @param is the input stream @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
setProcessOutputStream	TokenNameIdentifier	 set Process Output Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invokes parseOutput. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Invokes parseOutput. @throws IOException on error 
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
parseOutput	TokenNameIdentifier	 parse Output
(	TokenNameLPAREN	
br	TokenNameIdentifier	 br
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ignore. */	TokenNameCOMMENT_JAVADOC	 Ignore. 
public	TokenNamepublic	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Construct a new Parser object * @param task task in which context we are called * @param emacsMode if true output in emacs mode */	TokenNameCOMMENT_JAVADOC	 Construct a new Parser object @param task task in which context we are called @param emacsMode if true output in emacs mode 
protected	TokenNameprotected	
JikesOutputParser	TokenNameIdentifier	 Jikes Output Parser
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
boolean	TokenNameboolean	
emacsMode	TokenNameIdentifier	 emacs Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"As of Ant 1.2 released in October 2000, the "	TokenNameStringLiteral	As of Ant 1.2 released in October 2000, the 
+	TokenNamePLUS	
"JikesOutputParser class"	TokenNameStringLiteral	JikesOutputParser class
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
emacsMode	TokenNameIdentifier	 emacs Mode
=	TokenNameEQUAL	
emacsMode	TokenNameIdentifier	 emacs Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the output of a jikes compiler * @param reader - Reader used to read jikes's output * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Parse the output of a jikes compiler @param reader - Reader used to read jikes's output @throws IOException on error 
protected	TokenNameprotected	
void	TokenNamevoid	
parseOutput	TokenNameIdentifier	 parse Output
(	TokenNameLPAREN	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
emacsMode	TokenNameIdentifier	 emacs Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parseEmacsOutput	TokenNameIdentifier	 parse Emacs Output
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parseStandardOutput	TokenNameIdentifier	 parse Standard Output
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parseStandardOutput	TokenNameIdentifier	 parse Standard Output
(	TokenNameLPAREN	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lower	TokenNameIdentifier	 lower
;	TokenNameSEMICOLON	
// We assume, that every output, jikes does, stands for an error/warning 	TokenNameCOMMENT_LINE	We assume, that every output, jikes does, stands for an error/warning 
// XXX 	TokenNameCOMMENT_LINE	XXX 
// Is this correct? 	TokenNameCOMMENT_LINE	Is this correct? 
// TODO: 	TokenNameCOMMENT_LINE	TODO: 
// A warning line, that shows code, which contains a variable 	TokenNameCOMMENT_LINE	A warning line, that shows code, which contains a variable 
// error will cause some trouble. The parser should definitely 	TokenNameCOMMENT_LINE	error will cause some trouble. The parser should definitely 
// be much better. 	TokenNameCOMMENT_LINE	be much better. 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"error"	TokenNameStringLiteral	error
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"warning"	TokenNameStringLiteral	warning
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// If we don't know the type of the line 	TokenNameCOMMENT_LINE	If we don't know the type of the line 
// and we are in emacs mode, it will be 	TokenNameCOMMENT_LINE	and we are in emacs mode, it will be 
// an error, because in this mode, jikes won't 	TokenNameCOMMENT_LINE	an error, because in this mode, jikes won't 
// always print "error", but sometimes other 	TokenNameCOMMENT_LINE	always print "error", but sometimes other 
// keywords like "Syntax". We should look for 	TokenNameCOMMENT_LINE	keywords like "Syntax". We should look for 
// all those keywords. 	TokenNameCOMMENT_LINE	all those keywords. 
if	TokenNameif	
(	TokenNameLPAREN	
emacsMode	TokenNameIdentifier	 emacs Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
parseEmacsOutput	TokenNameIdentifier	 parse Emacs Output
(	TokenNameLPAREN	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// This may change, if we add advanced parsing capabilities. 	TokenNameCOMMENT_LINE	This may change, if we add advanced parsing capabilities. 
parseStandardOutput	TokenNameIdentifier	 parse Standard Output
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setError	TokenNameIdentifier	 set Error
(	TokenNameLPAREN	
boolean	TokenNameboolean	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
=	TokenNameEQUAL	
err	TokenNameIdentifier	 err
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorFlag	TokenNameIdentifier	 error Flag
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
emacsMode	TokenNameIdentifier	 emacs Mode
)	TokenNameRPAREN	
{	TokenNameLBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
?	TokenNameQUESTION	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
:	TokenNameCOLON	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
task	TokenNameIdentifier	 task
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
(	TokenNameLPAREN	
error	TokenNameIdentifier	 error
?	TokenNameQUESTION	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_ERR	TokenNameIdentifier	 MSG  ERR
:	TokenNameCOLON	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_WARN	TokenNameIdentifier	 MSG  WARN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicate if there were errors during the compile * @return if errors occurred */	TokenNameCOMMENT_JAVADOC	 Indicate if there were errors during the compile @return if errors occurred 
protected	TokenNameprotected	
boolean	TokenNameboolean	
getErrorFlag	TokenNameIdentifier	 get Error Flag
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
errorFlag	TokenNameIdentifier	 error Flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
