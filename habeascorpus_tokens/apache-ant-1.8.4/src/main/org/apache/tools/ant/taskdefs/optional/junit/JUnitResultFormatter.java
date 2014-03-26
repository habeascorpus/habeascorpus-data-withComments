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
.	TokenNameDOT	
optional	TokenNameIdentifier	 optional
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestListener	TokenNameIdentifier	 Test Listener
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
/** * This Interface describes classes that format the results of a JUnit * testrun. * */	TokenNameCOMMENT_JAVADOC	 This Interface describes classes that format the results of a JUnit testrun. 
public	TokenNamepublic	
interface	TokenNameinterface	
JUnitResultFormatter	TokenNameIdentifier	 J Unit Result Formatter
extends	TokenNameextends	
TestListener	TokenNameIdentifier	 Test Listener
,	TokenNameCOMMA	
JUnitTaskMirror	TokenNameIdentifier	 J Unit Task Mirror
.	TokenNameDOT	
JUnitResultFormatterMirror	TokenNameIdentifier	 J Unit Result Formatter Mirror
{	TokenNameLBRACE	
/** * The whole testsuite started. * @param suite the suite. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 The whole testsuite started. @param suite the suite. @throws BuildException on error. 
void	TokenNamevoid	
startTestSuite	TokenNameIdentifier	 start Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * The whole testsuite ended. * @param suite the suite. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 The whole testsuite ended. @param suite the suite. @throws BuildException on error. 
void	TokenNamevoid	
endTestSuite	TokenNameIdentifier	 end Test Suite
(	TokenNameLPAREN	
JUnitTest	TokenNameIdentifier	 J Unit Test
suite	TokenNameIdentifier	 suite
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
/** * Sets the stream the formatter is supposed to write its results to. * @param out the output stream to use. */	TokenNameCOMMENT_JAVADOC	 Sets the stream the formatter is supposed to write its results to. @param out the output stream to use. 
void	TokenNamevoid	
setOutput	TokenNameIdentifier	 set Output
(	TokenNameLPAREN	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This is what the test has written to System.out * @param out the string to write. */	TokenNameCOMMENT_JAVADOC	 This is what the test has written to System.out @param out the string to write. 
void	TokenNamevoid	
setSystemOutput	TokenNameIdentifier	 set System Output
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This is what the test has written to System.err * @param err the string to write. */	TokenNameCOMMENT_JAVADOC	 This is what the test has written to System.err @param err the string to write. 
void	TokenNamevoid	
setSystemError	TokenNameIdentifier	 set System Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
