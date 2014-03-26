/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSAnnotation	TokenNameIdentifier	 XS Annotation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSConstants	TokenNameIdentifier	 XS Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSModelGroup	TokenNameIdentifier	 XS Model Group
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSModelGroupDefinition	TokenNameIdentifier	 XS Model Group Definition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xs	TokenNameIdentifier	 xs
.	TokenNameDOT	
XSObjectList	TokenNameIdentifier	 XS Object List
;	TokenNameSEMICOLON	
/** * The XML representation for a group declaration * schema component is a global &lt;group&gt; element information item * * @xerces.internal * * @author Sandy Gao, IBM * @version $Id: XSGroupDecl.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The XML representation for a group declaration schema component is a global &lt;group&gt; element information item * @xerces.internal * @author Sandy Gao, IBM @version $Id: XSGroupDecl.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSGroupDecl	TokenNameIdentifier	 XS Group Decl
implements	TokenNameimplements	
XSModelGroupDefinition	TokenNameIdentifier	 XS Model Group Definition
{	TokenNameLBRACE	
// name of the group 	TokenNameCOMMENT_LINE	name of the group 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fName	TokenNameIdentifier	 f Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// target namespace of the group 	TokenNameCOMMENT_LINE	target namespace of the group 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// model group of the group 	TokenNameCOMMENT_LINE	model group of the group 
public	TokenNamepublic	
XSModelGroupImpl	TokenNameIdentifier	 XS Model Group Impl
fModelGroup	TokenNameIdentifier	 f Model Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// optional annotations 	TokenNameCOMMENT_LINE	optional annotations 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
fAnnotations	TokenNameIdentifier	 f Annotations
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// The namespace schema information item corresponding to the target namespace 	TokenNameCOMMENT_LINE	The namespace schema information item corresponding to the target namespace 
// of the model group definition, if it is globally declared; or null otherwise. 	TokenNameCOMMENT_LINE	of the model group definition, if it is globally declared; or null otherwise. 
private	TokenNameprivate	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
fNamespaceItem	TokenNameIdentifier	 f Namespace Item
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Get the type of the object, i.e ELEMENT_DECLARATION. */	TokenNameCOMMENT_JAVADOC	 Get the type of the object, i.e ELEMENT_DECLARATION. 
public	TokenNamepublic	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XSConstants	TokenNameIdentifier	 XS Constants
.	TokenNameDOT	
MODEL_GROUP_DEFINITION	TokenNameIdentifier	 MODEL  GROUP  DEFINITION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The <code>name</code> of this <code>XSObject</code> depending on the * <code>XSObject</code> type. */	TokenNameCOMMENT_JAVADOC	 The <code>name</code> of this <code>XSObject</code> depending on the <code>XSObject</code> type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fName	TokenNameIdentifier	 f Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The namespace URI of this node, or <code>null</code> if it is * unspecified. defines how a namespace URI is attached to schema * components. */	TokenNameCOMMENT_JAVADOC	 The namespace URI of this node, or <code>null</code> if it is unspecified. defines how a namespace URI is attached to schema components. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fTargetNamespace	TokenNameIdentifier	 f Target Namespace
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {model group} A model group. */	TokenNameCOMMENT_JAVADOC	 {model group} A model group. 
public	TokenNamepublic	
XSModelGroup	TokenNameIdentifier	 XS Model Group
getModelGroup	TokenNameIdentifier	 get Model Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fModelGroup	TokenNameIdentifier	 f Model Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Optional. Annotation. */	TokenNameCOMMENT_JAVADOC	 Optional. Annotation. 
public	TokenNamepublic	
XSAnnotation	TokenNameIdentifier	 XS Annotation
getAnnotation	TokenNameIdentifier	 get Annotation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
XSAnnotation	TokenNameIdentifier	 XS Annotation
)	TokenNameRPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Optional. Annotations. */	TokenNameCOMMENT_JAVADOC	 Optional. Annotations. 
public	TokenNamepublic	
XSObjectList	TokenNameIdentifier	 XS Object List
getAnnotations	TokenNameIdentifier	 get Annotations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fAnnotations	TokenNameIdentifier	 f Annotations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fAnnotations	TokenNameIdentifier	 f Annotations
:	TokenNameCOLON	
XSObjectListImpl	TokenNameIdentifier	 XS Object List Impl
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xerces.xs.XSObject#getNamespaceItem() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xerces.xs.XSObject#getNamespaceItem() 
public	TokenNamepublic	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
getNamespaceItem	TokenNameIdentifier	 get Namespace Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespaceItem	TokenNameIdentifier	 f Namespace Item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
setNamespaceItem	TokenNameIdentifier	 set Namespace Item
(	TokenNameLPAREN	
XSNamespaceItem	TokenNameIdentifier	 XS Namespace Item
namespaceItem	TokenNameIdentifier	 namespace Item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceItem	TokenNameIdentifier	 f Namespace Item
=	TokenNameEQUAL	
namespaceItem	TokenNameIdentifier	 namespace Item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSGroupDecl 	TokenNameCOMMENT_LINE	class XSGroupDecl 
