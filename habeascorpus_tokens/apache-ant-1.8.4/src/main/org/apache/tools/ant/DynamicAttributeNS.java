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
/** * Enables a task to control unknown attributes. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 Enables a task to control unknown attributes. * @since Ant 1.7 
public	TokenNamepublic	
interface	TokenNameinterface	
DynamicAttributeNS	TokenNameIdentifier	 Dynamic Attribute NS
{	TokenNameLBRACE	
/** * Set a named attribute to the given value * * @param uri The namespace uri for this attribute, "" is * used if there is no namespace uri. * @param localName The localname of this attribute. * @param qName The qualified name for this attribute * @param value The value of this attribute. * @throws BuildException when any error occurs */	TokenNameCOMMENT_JAVADOC	 Set a named attribute to the given value * @param uri The namespace uri for this attribute, "" is used if there is no namespace uri. @param localName The localname of this attribute. @param qName The qualified name for this attribute @param value The value of this attribute. @throws BuildException when any error occurs 
void	TokenNamevoid	
setDynamicAttribute	TokenNameIdentifier	 set Dynamic Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
