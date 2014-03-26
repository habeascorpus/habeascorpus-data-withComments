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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
/** * Used by <code>Execute</code> to handle input and output stream of * subprocesses. * * @since Ant 1.2 */	TokenNameCOMMENT_JAVADOC	 Used by <code>Execute</code> to handle input and output stream of subprocesses. * @since Ant 1.2 
public	TokenNamepublic	
interface	TokenNameinterface	
ExecuteStreamHandler	TokenNameIdentifier	 Execute Stream Handler
{	TokenNameLBRACE	
/** * Install a handler for the input stream of the subprocess. * * @param os output stream to write to the standard input stream of the * subprocess * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Install a handler for the input stream of the subprocess. * @param os output stream to write to the standard input stream of the subprocess @throws IOException on error 
void	TokenNamevoid	
setProcessInputStream	TokenNameIdentifier	 set Process Input Stream
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
os	TokenNameIdentifier	 os
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Install a handler for the error stream of the subprocess. * * @param is input stream to read from the error stream from the subprocess * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Install a handler for the error stream of the subprocess. * @param is input stream to read from the error stream from the subprocess @throws IOException on error 
void	TokenNamevoid	
setProcessErrorStream	TokenNameIdentifier	 set Process Error Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Install a handler for the output stream of the subprocess. * * @param is input stream to read from the error stream from the subprocess * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Install a handler for the output stream of the subprocess. * @param is input stream to read from the error stream from the subprocess @throws IOException on error 
void	TokenNamevoid	
setProcessOutputStream	TokenNameIdentifier	 set Process Output Stream
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Start handling of the streams. * @throws IOException on error */	TokenNameCOMMENT_JAVADOC	 Start handling of the streams. @throws IOException on error 
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Stop handling of the streams - will not be restarted. */	TokenNameCOMMENT_JAVADOC	 Stop handling of the streams - will not be restarted. 
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
