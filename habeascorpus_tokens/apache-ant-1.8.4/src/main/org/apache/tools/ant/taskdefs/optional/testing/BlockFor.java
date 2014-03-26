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
testing	TokenNameIdentifier	 testing
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
taskdefs	TokenNameIdentifier	 taskdefs
.	TokenNameDOT	
WaitFor	TokenNameIdentifier	 Wait For
;	TokenNameSEMICOLON	
/** * @since Ant 1.8 */	TokenNameCOMMENT_JAVADOC	 @since Ant 1.8 
public	TokenNamepublic	
class	TokenNameclass	
BlockFor	TokenNameIdentifier	 Block For
extends	TokenNameextends	
WaitFor	TokenNameIdentifier	 Wait For
{	TokenNameLBRACE	
/** * Text to include in a message */	TokenNameCOMMENT_JAVADOC	 Text to include in a message 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
/** * Constructor that takes the name of the task in the task name. * */	TokenNameCOMMENT_JAVADOC	 Constructor that takes the name of the task in the task name. 
public	TokenNamepublic	
BlockFor	TokenNameIdentifier	 Block For
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
"blockfor"	TokenNameStringLiteral	blockfor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getTaskName	TokenNameIdentifier	 get Task Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" timed out"	TokenNameStringLiteral	 timed out
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor that takes the name of the task in the task name. * * @param taskName the name of the task. */	TokenNameCOMMENT_JAVADOC	 Constructor that takes the name of the task in the task name. * @param taskName the name of the task. 
public	TokenNamepublic	
BlockFor	TokenNameIdentifier	 Block For
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
taskName	TokenNameIdentifier	 task Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
taskName	TokenNameIdentifier	 task Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the wait fails, a BuildException is thrown. All the superclasses actions are called first. * @throws BuildTimeoutException on timeout, using the text in {@link #text} * */	TokenNameCOMMENT_JAVADOC	 If the wait fails, a BuildException is thrown. All the superclasses actions are called first. @throws BuildTimeoutException on timeout, using the text in {@link #text} 
protected	TokenNameprotected	
void	TokenNamevoid	
processTimeout	TokenNameIdentifier	 process Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
processTimeout	TokenNameIdentifier	 process Timeout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
BuildTimeoutException	TokenNameIdentifier	 Build Timeout Exception
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the error text; all properties are expanded in the message. * * @param message the text to use in a failure message */	TokenNameCOMMENT_JAVADOC	 Set the error text; all properties are expanded in the message. * @param message the text to use in a failure message 
public	TokenNamepublic	
void	TokenNamevoid	
addText	TokenNameIdentifier	 add Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceProperties	TokenNameIdentifier	 replace Properties
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
