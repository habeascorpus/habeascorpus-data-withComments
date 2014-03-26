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
/** * Used to report attempts to set an unsupported element * When the attempt to set the element is made, * the code does not not know the name of the task/type * based on a mapping from the classname to the task/type. * However one class may be used by a lot of task/types. * This exception may be caught by code that does know * the task/type and it will reset the message to the * correct message. * This will be done once (in the case of a recursive * call to handlechildren). * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Used to report attempts to set an unsupported element When the attempt to set the element is made, the code does not not know the name of the task/type based on a mapping from the classname to the task/type. However one class may be used by a lot of task/types. This exception may be caught by code that does know the task/type and it will reset the message to the correct message. This will be done once (in the case of a recursive call to handlechildren). * @since Ant 1.6.3 
public	TokenNamepublic	
class	TokenNameclass	
UnsupportedElementException	TokenNameIdentifier	 Unsupported Element Exception
extends	TokenNameextends	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
/** * Constructs an unsupported element exception. * @param msg The string containing the message. * @param element The name of the incorrect element. */	TokenNameCOMMENT_JAVADOC	 Constructs an unsupported element exception. @param msg The string containing the message. @param element The name of the incorrect element. 
public	TokenNamepublic	
UnsupportedElementException	TokenNameIdentifier	 Unsupported Element Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the element that is wrong. * * @return the element name. */	TokenNameCOMMENT_JAVADOC	 Get the element that is wrong. * @return the element name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
element	TokenNameIdentifier	 element
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
