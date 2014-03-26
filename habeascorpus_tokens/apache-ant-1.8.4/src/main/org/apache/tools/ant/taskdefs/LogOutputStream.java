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
ProjectComponent	TokenNameIdentifier	 Project Component
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LineOrientedOutputStream	TokenNameIdentifier	 Line Oriented Output Stream
;	TokenNameSEMICOLON	
/** * Logs each line written to this stream to the log system of ant. * * Tries to be smart about line separators.<br> * * @since Ant 1.2 */	TokenNameCOMMENT_JAVADOC	 Logs each line written to this stream to the log system of ant. * Tries to be smart about line separators.<br> * @since Ant 1.2 
public	TokenNamepublic	
class	TokenNameclass	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
extends	TokenNameextends	
LineOrientedOutputStream	TokenNameIdentifier	 Line Oriented Output Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
ProjectComponent	TokenNameIdentifier	 Project Component
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
MSG_INFO	TokenNameIdentifier	 MSG  INFO
;	TokenNameSEMICOLON	
/** * Create a new LogOutputStream for the specified ProjectComponent. * * @param pc the project component for whom to log * @since Ant 1.7.1 */	TokenNameCOMMENT_JAVADOC	 Create a new LogOutputStream for the specified ProjectComponent. * @param pc the project component for whom to log @since Ant 1.7.1 
public	TokenNamepublic	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pc	TokenNameIdentifier	 pc
=	TokenNameEQUAL	
pc	TokenNameIdentifier	 pc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new instance of this class. * * @param task the task for whom to log * @param level loglevel used to log data written to this stream. */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of this class. * @param task the task for whom to log @param level loglevel used to log data written to this stream. 
public	TokenNamepublic	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new instance of this class. * * @param pc the project component for whom to log * @param level loglevel used to log data written to this stream. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Creates a new instance of this class. * @param pc the project component for whom to log @param level loglevel used to log data written to this stream. @since Ant 1.6.3 
public	TokenNamepublic	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
pc	TokenNameIdentifier	 pc
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
level	TokenNameIdentifier	 level
=	TokenNameEQUAL	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the buffer to a string and sends it to <code>processLine</code> */	TokenNameCOMMENT_JAVADOC	 Converts the buffer to a string and sends it to <code>processLine</code> 
protected	TokenNameprotected	
void	TokenNamevoid	
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
processBuffer	TokenNameIdentifier	 process Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// impossible since *our* processLine doesn't throw an IOException 	TokenNameCOMMENT_LINE	impossible since *our* processLine doesn't throw an IOException 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Impossible IOException caught: "	TokenNameStringLiteral	Impossible IOException caught: 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Logs a line to the log system of ant. * * @param line the line to log. */	TokenNameCOMMENT_JAVADOC	 Logs a line to the log system of ant. * @param line the line to log. 
protected	TokenNameprotected	
void	TokenNamevoid	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Logs a line to the log system of ant. * * @param line the line to log. * @param level the logging level to use. */	TokenNameCOMMENT_JAVADOC	 Logs a line to the log system of ant. * @param line the line to log. @param level the logging level to use. 
protected	TokenNameprotected	
void	TokenNamevoid	
processLine	TokenNameIdentifier	 process Line
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pc	TokenNameIdentifier	 pc
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the level. * @return the log level. */	TokenNameCOMMENT_JAVADOC	 Get the level. @return the log level. 
public	TokenNamepublic	
int	TokenNameint	
getMessageLevel	TokenNameIdentifier	 get Message Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
level	TokenNameIdentifier	 level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
