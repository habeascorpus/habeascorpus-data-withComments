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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintStream	TokenNameIdentifier	 Print Stream
;	TokenNameSEMICOLON	
/** * Interface used by Ant to log the build output. * * A build logger is a build listener which has the 'right' to send output to * the ant log, which is usually <code>System.out</code> unless redirected by * the <code>-logfile</code> option. * */	TokenNameCOMMENT_JAVADOC	 Interface used by Ant to log the build output. * A build logger is a build listener which has the 'right' to send output to the ant log, which is usually <code>System.out</code> unless redirected by the <code>-logfile</code> option. 
public	TokenNamepublic	
interface	TokenNameinterface	
BuildLogger	TokenNameIdentifier	 Build Logger
extends	TokenNameextends	
BuildListener	TokenNameIdentifier	 Build Listener
{	TokenNameLBRACE	
/** * Sets the highest level of message this logger should respond to. * * Only messages with a message level lower than or equal to the * given level should be written to the log. * <P> * Constants for the message levels are in the * {@link Project Project} class. The order of the levels, from least * to most verbose, is <code>MSG_ERR</code>, <code>MSG_WARN</code>, * <code>MSG_INFO</code>, <code>MSG_VERBOSE</code>, * <code>MSG_DEBUG</code>. * * @param level the logging level for the logger. */	TokenNameCOMMENT_JAVADOC	 Sets the highest level of message this logger should respond to. * Only messages with a message level lower than or equal to the given level should be written to the log. <P> Constants for the message levels are in the {@link Project Project} class. The order of the levels, from least to most verbose, is <code>MSG_ERR</code>, <code>MSG_WARN</code>, <code>MSG_INFO</code>, <code>MSG_VERBOSE</code>, <code>MSG_DEBUG</code>. * @param level the logging level for the logger. 
void	TokenNamevoid	
setMessageOutputLevel	TokenNameIdentifier	 set Message Output Level
(	TokenNameLPAREN	
int	TokenNameint	
level	TokenNameIdentifier	 level
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the output stream to which this logger is to send its output. * * @param output The output stream for the logger. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the output stream to which this logger is to send its output. * @param output The output stream for the logger. Must not be <code>null</code>. 
void	TokenNamevoid	
setOutputPrintStream	TokenNameIdentifier	 set Output Print Stream
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
output	TokenNameIdentifier	 output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets this logger to produce emacs (and other editor) friendly output. * * @param emacsMode <code>true</code> if output is to be unadorned so that * emacs and other editors can parse files names, etc. */	TokenNameCOMMENT_JAVADOC	 Sets this logger to produce emacs (and other editor) friendly output. * @param emacsMode <code>true</code> if output is to be unadorned so that emacs and other editors can parse files names, etc. 
void	TokenNamevoid	
setEmacsMode	TokenNameIdentifier	 set Emacs Mode
(	TokenNameLPAREN	
boolean	TokenNameboolean	
emacsMode	TokenNameIdentifier	 emacs Mode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the output stream to which this logger is to send error messages. * * @param err The error stream for the logger. * Must not be <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Sets the output stream to which this logger is to send error messages. * @param err The error stream for the logger. Must not be <code>null</code>. 
void	TokenNamevoid	
setErrorPrintStream	TokenNameIdentifier	 set Error Print Stream
(	TokenNameLPAREN	
PrintStream	TokenNameIdentifier	 Print Stream
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
