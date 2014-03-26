/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * NON-DOM CLASS: Describe one of the Elements (and its associated * Attributes) defined in this Document Type. * <p> * I've included this in Level 1 purely as an anchor point for default * attributes. In Level 2 it should enable the ChildRule support. * * @xerces.internal * * @version $Id: ElementDefinitionImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 NON-DOM CLASS: Describe one of the Elements (and its associated Attributes) defined in this Document Type. <p> I've included this in Level 1 purely as an anchor point for default attributes. In Level 2 it should enable the ChildRule support. * @xerces.internal * @version $Id: ElementDefinitionImpl.java 447266 2006-09-18 05:57:49Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
ElementDefinitionImpl	TokenNameIdentifier	 Element Definition Impl
extends	TokenNameextends	
ParentNode	TokenNameIdentifier	 Parent Node
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Serialization version. */	TokenNameCOMMENT_JAVADOC	 Serialization version. 
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
8373890672670022714L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Element definition name. */	TokenNameCOMMENT_JAVADOC	 Element definition name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** Default attributes. */	TokenNameCOMMENT_JAVADOC	 Default attributes. 
protected	TokenNameprotected	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Factory constructor. */	TokenNameCOMMENT_JAVADOC	 Factory constructor. 
public	TokenNamepublic	
ElementDefinitionImpl	TokenNameIdentifier	 Element Definition Impl
(	TokenNameLPAREN	
CoreDocumentImpl	TokenNameIdentifier	 Core Document Impl
ownerDocument	TokenNameIdentifier	 owner Document
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
new	TokenNamenew	
NamedNodeMapImpl	TokenNameIdentifier	 Named Node Map Impl
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Node methods 	TokenNameCOMMENT_LINE	Node methods 
// 	TokenNameCOMMENT_LINE	 
/** * A short integer indicating what type of node this is. The named * constants for this value are defined in the org.w3c.dom.Node interface. */	TokenNameCOMMENT_JAVADOC	 A short integer indicating what type of node this is. The named constants for this value are defined in the org.w3c.dom.Node interface. 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NodeImpl	TokenNameIdentifier	 Node Impl
.	TokenNameDOT	
ELEMENT_DEFINITION_NODE	TokenNameIdentifier	 ELEMENT  DEFINITION  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the element definition name */	TokenNameCOMMENT_JAVADOC	 Returns the element definition name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncData	TokenNameIdentifier	 needs Sync Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeData	TokenNameIdentifier	 synchronize Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Replicate this object. */	TokenNameCOMMENT_JAVADOC	 Replicate this object. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElementDefinitionImpl	TokenNameIdentifier	 Element Definition Impl
newnode	TokenNameIdentifier	 newnode
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementDefinitionImpl	TokenNameIdentifier	 Element Definition Impl
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
cloneNode	TokenNameIdentifier	 clone Node
(	TokenNameLPAREN	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NamedNodeMap must be explicitly replicated to avoid sharing 	TokenNameCOMMENT_LINE	NamedNodeMap must be explicitly replicated to avoid sharing 
newnode	TokenNameIdentifier	 newnode
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
cloneMap	TokenNameIdentifier	 clone Map
(	TokenNameLPAREN	
newnode	TokenNameIdentifier	 newnode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newnode	TokenNameIdentifier	 newnode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// cloneNode(boolean):Node 	TokenNameCOMMENT_LINE	cloneNode(boolean):Node 
/** * Query the attributes defined on this Element. * <p> * In the base implementation this Map simply contains Attribute objects * representing the defaults. In a more serious implementation, it would * contain AttributeDefinitionImpl objects for all declared Attributes, * indicating which are Default, DefaultFixed, Implicit and/or Required. * * @return org.w3c.dom.NamedNodeMap containing org.w3c.dom.Attribute */	TokenNameCOMMENT_JAVADOC	 Query the attributes defined on this Element. <p> In the base implementation this Map simply contains Attribute objects representing the defaults. In a more serious implementation, it would contain AttributeDefinitionImpl objects for all declared Attributes, indicating which are Default, DefaultFixed, Implicit and/or Required. * @return org.w3c.dom.NamedNodeMap containing org.w3c.dom.Attribute 
public	TokenNamepublic	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsSyncChildren	TokenNameIdentifier	 needs Sync Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronizeChildren	TokenNameIdentifier	 synchronize Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
attributes	TokenNameIdentifier	 attributes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getAttributes():NamedNodeMap 	TokenNameCOMMENT_LINE	getAttributes():NamedNodeMap 
}	TokenNameRBRACE	
// class ElementDefinitionImpl 	TokenNameCOMMENT_LINE	class ElementDefinitionImpl 
