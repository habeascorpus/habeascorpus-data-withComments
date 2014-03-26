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
BuildException	TokenNameIdentifier	 Build Exception
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
/** * Logs standard output and error of a subprocess to the log system of ant. * * @since Ant 1.2 */	TokenNameCOMMENT_JAVADOC	 Logs standard output and error of a subprocess to the log system of ant. * @since Ant 1.2 
public	TokenNamepublic	
class	TokenNameclass	
LogStreamHandler	TokenNameIdentifier	 Log Stream Handler
extends	TokenNameextends	
PumpStreamHandler	TokenNameIdentifier	 Pump Stream Handler
{	TokenNameLBRACE	
/** * Creates log stream handler * * @param task the task for whom to log * @param outlevel the loglevel used to log standard output * @param errlevel the loglevel used to log standard error */	TokenNameCOMMENT_JAVADOC	 Creates log stream handler * @param task the task for whom to log @param outlevel the loglevel used to log standard output @param errlevel the loglevel used to log standard error 
public	TokenNamepublic	
LogStreamHandler	TokenNameIdentifier	 Log Stream Handler
(	TokenNameLPAREN	
Task	TokenNameIdentifier	 Task
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
int	TokenNameint	
outlevel	TokenNameIdentifier	 outlevel
,	TokenNameCOMMA	
int	TokenNameint	
errlevel	TokenNameIdentifier	 errlevel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
)	TokenNameRPAREN	
task	TokenNameIdentifier	 task
,	TokenNameCOMMA	
outlevel	TokenNameIdentifier	 outlevel
,	TokenNameCOMMA	
errlevel	TokenNameIdentifier	 errlevel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates log stream handler * * @param pc the project component for whom to log * @param outlevel the loglevel used to log standard output * @param errlevel the loglevel used to log standard error */	TokenNameCOMMENT_JAVADOC	 Creates log stream handler * @param pc the project component for whom to log @param outlevel the loglevel used to log standard output @param errlevel the loglevel used to log standard error 
public	TokenNamepublic	
LogStreamHandler	TokenNameIdentifier	 Log Stream Handler
(	TokenNameLPAREN	
ProjectComponent	TokenNameIdentifier	 Project Component
pc	TokenNameIdentifier	 pc
,	TokenNameCOMMA	
int	TokenNameint	
outlevel	TokenNameIdentifier	 outlevel
,	TokenNameCOMMA	
int	TokenNameint	
errlevel	TokenNameIdentifier	 errlevel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
,	TokenNameCOMMA	
outlevel	TokenNameIdentifier	 outlevel
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
LogOutputStream	TokenNameIdentifier	 Log Output Stream
(	TokenNameLPAREN	
pc	TokenNameIdentifier	 pc
,	TokenNameCOMMA	
errlevel	TokenNameIdentifier	 errlevel
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stop the log stream handler. */	TokenNameCOMMENT_JAVADOC	 Stop the log stream handler. 
public	TokenNamepublic	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
getErr	TokenNameIdentifier	 get Err
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getOut	TokenNameIdentifier	 get Out
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
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
// plain impossible 	TokenNameCOMMENT_LINE	plain impossible 
throw	TokenNamethrow	
new	TokenNamenew	
BuildException	TokenNameIdentifier	 Build Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
