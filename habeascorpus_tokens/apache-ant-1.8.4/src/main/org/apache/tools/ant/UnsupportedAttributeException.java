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
/** * Used to report attempts to set an unsupported attribute * * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Used to report attempts to set an unsupported attribute * @since Ant 1.6.3 
public	TokenNamepublic	
class	TokenNameclass	
UnsupportedAttributeException	TokenNameIdentifier	 Unsupported Attribute Exception
extends	TokenNameextends	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
attribute	TokenNameIdentifier	 attribute
;	TokenNameSEMICOLON	
/** * Constructs an unsupported attribute exception. * @param msg The string containing the message. * @param attribute The unsupported attribute. */	TokenNameCOMMENT_JAVADOC	 Constructs an unsupported attribute exception. @param msg The string containing the message. @param attribute The unsupported attribute. 
public	TokenNamepublic	
UnsupportedAttributeException	TokenNameIdentifier	 Unsupported Attribute Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attribute	TokenNameIdentifier	 attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attribute	TokenNameIdentifier	 attribute
=	TokenNameEQUAL	
attribute	TokenNameIdentifier	 attribute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the attribute that is wrong. * * @return the attribute name. */	TokenNameCOMMENT_JAVADOC	 Get the attribute that is wrong. * @return the attribute name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attribute	TokenNameIdentifier	 attribute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
