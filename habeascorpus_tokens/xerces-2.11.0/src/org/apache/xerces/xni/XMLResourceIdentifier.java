/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
;	TokenNameSEMICOLON	
/** * <p> This represents the basic physical description of the location of any * XML resource (a Schema grammar, a DTD, a general entity etc.) </p> * * @author Neil Graham, IBM * @version $Id: XMLResourceIdentifier.java 570132 2007-08-27 14:12:43Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 <p> This represents the basic physical description of the location of any XML resource (a Schema grammar, a DTD, a general entity etc.) </p> * @author Neil Graham, IBM @version $Id: XMLResourceIdentifier.java 570132 2007-08-27 14:12:43Z mrglavas $ 
public	TokenNamepublic	
interface	TokenNameinterface	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
{	TokenNameLBRACE	
/** Sets the public identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the public identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setPublicId	TokenNameIdentifier	 set Public Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the public identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the public identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Sets the expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the expanded system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setExpandedSystemId	TokenNameIdentifier	 set Expanded System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the expanded system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the expanded system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Sets the literal system identifier. */	TokenNameCOMMENT_JAVADOC	 Sets the literal system identifier. 
public	TokenNamepublic	
void	TokenNamevoid	
setLiteralSystemId	TokenNameIdentifier	 set Literal System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the literal system identifier. */	TokenNameCOMMENT_JAVADOC	 Returns the literal system identifier. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Sets the base URI against which the literal SystemId is to be resolved.*/	TokenNameCOMMENT_JAVADOC	 Sets the base URI against which the literal SystemId is to be resolved.
public	TokenNamepublic	
void	TokenNamevoid	
setBaseSystemId	TokenNameIdentifier	 set Base System Id
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** <p> Returns the base URI against which the literal SystemId is to be resolved. </p> */	TokenNameCOMMENT_JAVADOC	 <p> Returns the base URI against which the literal SystemId is to be resolved. </p> 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Sets the namespace of the resource. */	TokenNameCOMMENT_JAVADOC	 Sets the namespace of the resource. 
public	TokenNamepublic	
void	TokenNamevoid	
setNamespace	TokenNameIdentifier	 set Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns the namespace of the resource. */	TokenNameCOMMENT_JAVADOC	 Returns the namespace of the resource. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// XMLResourceIdentifier 	TokenNameCOMMENT_LINE	XMLResourceIdentifier 
