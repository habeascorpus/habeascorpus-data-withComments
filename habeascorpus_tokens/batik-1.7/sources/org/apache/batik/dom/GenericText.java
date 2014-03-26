/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Text	TokenNameIdentifier	 Text
;	TokenNameSEMICOLON	
/** * This class provides a generic implementation of the {@link org.w3c.dom.Text} * interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: GenericText.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a generic implementation of the {@link org.w3c.dom.Text} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: GenericText.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GenericText	TokenNameIdentifier	 Generic Text
extends	TokenNameextends	
AbstractText	TokenNameIdentifier	 Abstract Text
{	TokenNameLBRACE	
/** * Is this element immutable? */	TokenNameCOMMENT_JAVADOC	 Is this element immutable? 
protected	TokenNameprotected	
boolean	TokenNameboolean	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
/** * Creates a new uninitialized Text object. */	TokenNameCOMMENT_JAVADOC	 Creates a new uninitialized Text object. 
protected	TokenNameprotected	
GenericText	TokenNameIdentifier	 Generic Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new Text object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Text object. 
public	TokenNamepublic	
GenericText	TokenNameIdentifier	 Generic Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeName()}. * @return {@link #getNodeName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeName()}. @return {@link #getNodeName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"#text"	TokenNameStringLiteral	#text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeType()}. * @return {@link org.w3c.dom.Node#TEXT_NODE} */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.Node#getNodeType()}. @return {@link org.w3c.dom.Node#TEXT_NODE} 
public	TokenNamepublic	
short	TokenNameshort	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests whether this node is readonly. */	TokenNameCOMMENT_JAVADOC	 Tests whether this node is readonly. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReadonly	TokenNameIdentifier	 is Readonly
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readonly	TokenNameIdentifier	 readonly
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets this node readonly attribute. */	TokenNameCOMMENT_JAVADOC	 Sets this node readonly attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setReadonly	TokenNameIdentifier	 set Readonly
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readonly	TokenNameIdentifier	 readonly
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a text node of the current type. */	TokenNameCOMMENT_JAVADOC	 Creates a text node of the current type. 
protected	TokenNameprotected	
Text	TokenNameIdentifier	 Text
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createTextNode	TokenNameIdentifier	 create Text Node
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GenericText	TokenNameIdentifier	 Generic Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
