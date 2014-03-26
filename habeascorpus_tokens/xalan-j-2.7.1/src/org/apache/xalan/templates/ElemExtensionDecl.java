/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemExtensionDecl.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemExtensionDecl.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExtensionNamespacesManager	TokenNameIdentifier	 Extension Namespaces Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
StringVector	TokenNameIdentifier	 String Vector
;	TokenNameSEMICOLON	
/** * Implement the declaration of an extension element * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Implement the declaration of an extension element @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ElemExtensionDecl	TokenNameIdentifier	 Elem Extension Decl
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4692738885172766789L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Constructor ElemExtensionDecl * */	TokenNameCOMMENT_JAVADOC	 Constructor ElemExtensionDecl 
public	TokenNamepublic	
ElemExtensionDecl	TokenNameIdentifier	 Elem Extension Decl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("ElemExtensionDecl ctor"); 	TokenNameCOMMENT_LINE	System.out.println("ElemExtensionDecl ctor"); 
}	TokenNameRBRACE	
/** Prefix string for this extension element. * @serial */	TokenNameCOMMENT_JAVADOC	 Prefix string for this extension element. @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_prefix	TokenNameIdentifier	 m prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set the prefix for this extension element * * * @param v Prefix to set for this extension element */	TokenNameCOMMENT_JAVADOC	 Set the prefix for this extension element * @param v Prefix to set for this extension element 
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefix	TokenNameIdentifier	 m prefix
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the prefix for this extension element * * * @return Prefix for this extension element */	TokenNameCOMMENT_JAVADOC	 Get the prefix for this extension element * @return Prefix for this extension element 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_prefix	TokenNameIdentifier	 m prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** StringVector holding the names of functions defined in this extension. * @serial */	TokenNameCOMMENT_JAVADOC	 StringVector holding the names of functions defined in this extension. @serial 
private	TokenNameprivate	
StringVector	TokenNameIdentifier	 String Vector
m_functions	TokenNameIdentifier	 m functions
=	TokenNameEQUAL	
new	TokenNamenew	
StringVector	TokenNameIdentifier	 String Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the names of functions defined in this extension * * * @param v StringVector holding the names of functions defined in this extension */	TokenNameCOMMENT_JAVADOC	 Set the names of functions defined in this extension * @param v StringVector holding the names of functions defined in this extension 
public	TokenNamepublic	
void	TokenNamevoid	
setFunctions	TokenNameIdentifier	 set Functions
(	TokenNameLPAREN	
StringVector	TokenNameIdentifier	 String Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_functions	TokenNameIdentifier	 m functions
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the names of functions defined in this extension * * * @return StringVector holding the names of functions defined in this extension */	TokenNameCOMMENT_JAVADOC	 Get the names of functions defined in this extension * @return StringVector holding the names of functions defined in this extension 
public	TokenNamepublic	
StringVector	TokenNameIdentifier	 String Vector
getFunctions	TokenNameIdentifier	 get Functions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_functions	TokenNameIdentifier	 m functions
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a function at a given index in this extension element * * * @param i Index of function to get * * @return Name of Function at given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get a function at a given index in this extension element * @param i Index of function to get * @return Name of Function at given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getFunction	TokenNameIdentifier	 get Function
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_functions	TokenNameIdentifier	 m functions
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_functions	TokenNameIdentifier	 m functions
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get count of functions defined in this extension element * * * @return count of functions defined in this extension element */	TokenNameCOMMENT_JAVADOC	 Get count of functions defined in this extension element * @return count of functions defined in this extension element 
public	TokenNamepublic	
int	TokenNameint	
getFunctionCount	TokenNameIdentifier	 get Function Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_functions	TokenNameIdentifier	 m functions
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_functions	TokenNameIdentifier	 m functions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** StringVector of elements defined in this extension. * @serial */	TokenNameCOMMENT_JAVADOC	 StringVector of elements defined in this extension. @serial 
private	TokenNameprivate	
StringVector	TokenNameIdentifier	 String Vector
m_elements	TokenNameIdentifier	 m elements
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Set StringVector of elements for this extension * * * @param v StringVector of elements to set */	TokenNameCOMMENT_JAVADOC	 Set StringVector of elements for this extension * @param v StringVector of elements to set 
public	TokenNamepublic	
void	TokenNamevoid	
setElements	TokenNameIdentifier	 set Elements
(	TokenNameLPAREN	
StringVector	TokenNameIdentifier	 String Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elements	TokenNameIdentifier	 m elements
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get StringVector of elements defined for this extension * * * @return StringVector of elements defined for this extension */	TokenNameCOMMENT_JAVADOC	 Get StringVector of elements defined for this extension * @return StringVector of elements defined for this extension 
public	TokenNamepublic	
StringVector	TokenNameIdentifier	 String Vector
getElements	TokenNameIdentifier	 get Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_elements	TokenNameIdentifier	 m elements
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the element at the given index * * * @param i Index of element to get * * @return The element at the given index * * @throws ArrayIndexOutOfBoundsException */	TokenNameCOMMENT_JAVADOC	 Get the element at the given index * @param i Index of element to get * @return The element at the given index * @throws ArrayIndexOutOfBoundsException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_elements	TokenNameIdentifier	 m elements
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_elements	TokenNameIdentifier	 m elements
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the count of elements defined for this extension element * * * @return the count of elements defined for this extension element */	TokenNameCOMMENT_JAVADOC	 Return the count of elements defined for this extension element * @return the count of elements defined for this extension element 
public	TokenNamepublic	
int	TokenNameint	
getElementCount	TokenNameIdentifier	 get Element Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_elements	TokenNameIdentifier	 m elements
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_elements	TokenNameIdentifier	 m elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return The token ID for this element */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return The token ID for this element 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_EXTENSIONDECL	TokenNameIdentifier	 ELEMNAME  EXTENSIONDECL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
sroot	TokenNameIdentifier	 sroot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
declNamespace	TokenNameIdentifier	 decl Namespace
=	TokenNameEQUAL	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
lang	TokenNameIdentifier	 lang
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
srcURL	TokenNameIdentifier	 src URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
scriptSrc	TokenNameIdentifier	 script Src
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
declNamespace	TokenNameIdentifier	 decl Namespace
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_NO_NAMESPACE_DECL	TokenNameIdentifier	 ER  NO  NAMESPACE  DECL
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Prefix " + prefix does not have a corresponding namespace declaration"); 	TokenNameCOMMENT_LINE	"Prefix " + prefix does not have a corresponding namespace declaration"); 
for	TokenNamefor	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_EXTENSIONSCRIPT	TokenNameIdentifier	 ELEMNAME  EXTENSIONSCRIPT
==	TokenNameEQUAL_EQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemExtensionScript	TokenNameIdentifier	 Elem Extension Script
sdecl	TokenNameIdentifier	 sdecl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemExtensionScript	TokenNameIdentifier	 Elem Extension Script
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
lang	TokenNameIdentifier	 lang
=	TokenNameEQUAL	
sdecl	TokenNameIdentifier	 sdecl
.	TokenNameDOT	
getLang	TokenNameIdentifier	 get Lang
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcURL	TokenNameIdentifier	 src URL
=	TokenNameEQUAL	
sdecl	TokenNameIdentifier	 sdecl
.	TokenNameDOT	
getSrc	TokenNameIdentifier	 get Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
childOfSDecl	TokenNameIdentifier	 child Of S Decl
=	TokenNameEQUAL	
sdecl	TokenNameIdentifier	 sdecl
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
childOfSDecl	TokenNameIdentifier	 child Of S Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEXTLITERALRESULT	TokenNameIdentifier	 ELEMNAME  TEXTLITERALRESULT
==	TokenNameEQUAL_EQUAL	
childOfSDecl	TokenNameIdentifier	 child Of S Decl
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
)	TokenNameRPAREN	
childOfSDecl	TokenNameIdentifier	 child Of S Decl
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scriptSrc	TokenNameIdentifier	 script Src
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scriptSrc	TokenNameIdentifier	 script Src
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
scriptSrc	TokenNameIdentifier	 script Src
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
lang	TokenNameIdentifier	 lang
)	TokenNameRPAREN	
lang	TokenNameIdentifier	 lang
=	TokenNameEQUAL	
"javaclass"	TokenNameStringLiteral	javaclass
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"javaclass"	TokenNameStringLiteral	javaclass
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
scriptSrc	TokenNameIdentifier	 script Src
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ELEM_CONTENT_NOT_ALLOWED	TokenNameIdentifier	 ER  ELEM  CONTENT  NOT  ALLOWED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
scriptSrc	TokenNameIdentifier	 script Src
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Element content not allowed for lang=javaclass " + scriptSrc); 	TokenNameCOMMENT_LINE	"Element content not allowed for lang=javaclass " + scriptSrc); 
// Register the extension namespace if it has not already been registered. 	TokenNameCOMMENT_LINE	Register the extension namespace if it has not already been registered. 
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
extNsSpt	TokenNameIdentifier	 ext Ns Spt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ExtensionNamespacesManager	TokenNameIdentifier	 Extension Namespaces Manager
extNsMgr	TokenNameIdentifier	 ext Ns Mgr
=	TokenNameEQUAL	
sroot	TokenNameIdentifier	 sroot
.	TokenNameDOT	
getExtensionNamespacesManager	TokenNameIdentifier	 get Extension Namespaces Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extNsMgr	TokenNameIdentifier	 ext Ns Mgr
.	TokenNameDOT	
namespaceIndex	TokenNameIdentifier	 namespace Index
(	TokenNameLPAREN	
declNamespace	TokenNameIdentifier	 decl Namespace
,	TokenNameCOMMA	
extNsMgr	TokenNameIdentifier	 ext Ns Mgr
.	TokenNameDOT	
getExtensions	TokenNameIdentifier	 get Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"javaclass"	TokenNameStringLiteral	javaclass
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
srcURL	TokenNameIdentifier	 src URL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
=	TokenNameEQUAL	
extNsMgr	TokenNameIdentifier	 ext Ns Mgr
.	TokenNameDOT	
defineJavaNamespace	TokenNameIdentifier	 define Java Namespace
(	TokenNameLPAREN	
declNamespace	TokenNameIdentifier	 decl Namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
extNsMgr	TokenNameIdentifier	 ext Ns Mgr
.	TokenNameDOT	
namespaceIndex	TokenNameIdentifier	 namespace Index
(	TokenNameLPAREN	
srcURL	TokenNameIdentifier	 src URL
,	TokenNameCOMMA	
extNsMgr	TokenNameIdentifier	 ext Ns Mgr
.	TokenNameDOT	
getExtensions	TokenNameIdentifier	 get Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
=	TokenNameEQUAL	
extNsMgr	TokenNameIdentifier	 ext Ns Mgr
.	TokenNameDOT	
defineJavaNamespace	TokenNameIdentifier	 define Java Namespace
(	TokenNameLPAREN	
declNamespace	TokenNameIdentifier	 decl Namespace
,	TokenNameCOMMA	
srcURL	TokenNameIdentifier	 src URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
// not java 	TokenNameCOMMENT_LINE	not java 
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
"org.apache.xalan.extensions.ExtensionHandlerGeneral"	TokenNameStringLiteral	org.apache.xalan.extensions.ExtensionHandlerGeneral
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
=	TokenNameEQUAL	
{	TokenNameLBRACE	
declNamespace	TokenNameIdentifier	 decl Namespace
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
m_elements	TokenNameIdentifier	 m elements
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
m_functions	TokenNameIdentifier	 m functions
,	TokenNameCOMMA	
lang	TokenNameIdentifier	 lang
,	TokenNameCOMMA	
srcURL	TokenNameIdentifier	 src URL
,	TokenNameCOMMA	
scriptSrc	TokenNameIdentifier	 script Src
,	TokenNameCOMMA	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionNamespaceSupport	TokenNameIdentifier	 Extension Namespace Support
(	TokenNameLPAREN	
declNamespace	TokenNameIdentifier	 decl Namespace
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
extNsMgr	TokenNameIdentifier	 ext Ns Mgr
.	TokenNameDOT	
registerExtension	TokenNameIdentifier	 register Extension
(	TokenNameLPAREN	
extNsSpt	TokenNameIdentifier	 ext Ns Spt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function will be called on top-level elements * only, just before the transform begins. * * @param transformer The XSLT TransformerFactory. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 This function will be called on top-level elements only, just before the transform begins. * @param transformer The XSLT TransformerFactory. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
runtimeInit	TokenNameIdentifier	 runtime Init
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
/* //System.out.println("ElemExtensionDecl.runtimeInit()"); String lang = null; String srcURL = null; String scriptSrc = null; String prefix = getPrefix(); String declNamespace = getNamespaceForPrefix(prefix); if (null == declNamespace) throw new TransformerException(XSLMessages.createMessage(XSLTErrorResources.ER_NO_NAMESPACE_DECL, new Object[]{prefix})); //"Prefix " + prefix does not have a corresponding namespace declaration"); for (ElemTemplateElement child = getFirstChildElem(); child != null; child = child.getNextSiblingElem()) { if (Constants.ELEMNAME_EXTENSIONSCRIPT == child.getXSLToken()) { ElemExtensionScript sdecl = (ElemExtensionScript) child; lang = sdecl.getLang(); srcURL = sdecl.getSrc(); ElemTemplateElement childOfSDecl = sdecl.getFirstChildElem(); if (null != childOfSDecl) { if (Constants.ELEMNAME_TEXTLITERALRESULT == childOfSDecl.getXSLToken()) { ElemTextLiteral tl = (ElemTextLiteral) childOfSDecl; char[] chars = tl.getChars(); scriptSrc = new String(chars); if (scriptSrc.trim().length() == 0) scriptSrc = null; } } } } if (null == lang) lang = "javaclass"; if (lang.equals("javaclass") && (scriptSrc != null)) throw new TransformerException(XSLMessages.createMessage(XSLTErrorResources.ER_ELEM_CONTENT_NOT_ALLOWED, new Object[]{scriptSrc})); //"Element content not allowed for lang=javaclass " + scriptSrc); // Instantiate a handler for this extension namespace. ExtensionsTable etable = transformer.getExtensionsTable(); ExtensionHandler nsh = etable.get(declNamespace); // If we have no prior ExtensionHandler for this namespace, we need to // create one. // If the script element is for javaclass, this is our special compiled java. // Element content is not supported for this so we throw an exception if // it is provided. Otherwise, we look up the srcURL to see if we already have // an ExtensionHandler. if (null == nsh) { if (lang.equals("javaclass")) { if (null == srcURL) { nsh = etable.makeJavaNamespace(declNamespace); } else { nsh = etable.get(srcURL); if (null == nsh) { nsh = etable.makeJavaNamespace(srcURL); } } } else // not java { nsh = new ExtensionHandlerGeneral(declNamespace, this.m_elements, this.m_functions, lang, srcURL, scriptSrc, getSystemId()); // System.out.println("Adding NS Handler: declNamespace = "+ // declNamespace+", lang = "+lang+", srcURL = "+ // srcURL+", scriptSrc="+scriptSrc); } etable.addExtensionNamespace(declNamespace, nsh); }*/	TokenNameCOMMENT_BLOCK	 //System.out.println("ElemExtensionDecl.runtimeInit()"); String lang = null; String srcURL = null; String scriptSrc = null; String prefix = getPrefix(); String declNamespace = getNamespaceForPrefix(prefix); if (null == declNamespace) throw new TransformerException(XSLMessages.createMessage(XSLTErrorResources.ER_NO_NAMESPACE_DECL, new Object[]{prefix})); //"Prefix " + prefix does not have a corresponding namespace declaration"); for (ElemTemplateElement child = getFirstChildElem(); child != null; child = child.getNextSiblingElem()) { if (Constants.ELEMNAME_EXTENSIONSCRIPT == child.getXSLToken()) { ElemExtensionScript sdecl = (ElemExtensionScript) child; lang = sdecl.getLang(); srcURL = sdecl.getSrc(); ElemTemplateElement childOfSDecl = sdecl.getFirstChildElem(); if (null != childOfSDecl) { if (Constants.ELEMNAME_TEXTLITERALRESULT == childOfSDecl.getXSLToken()) { ElemTextLiteral tl = (ElemTextLiteral) childOfSDecl; char[] chars = tl.getChars(); scriptSrc = new String(chars); if (scriptSrc.trim().length() == 0) scriptSrc = null; } } } } if (null == lang) lang = "javaclass"; if (lang.equals("javaclass") && (scriptSrc != null)) throw new TransformerException(XSLMessages.createMessage(XSLTErrorResources.ER_ELEM_CONTENT_NOT_ALLOWED, new Object[]{scriptSrc})); //"Element content not allowed for lang=javaclass " + scriptSrc); // Instantiate a handler for this extension namespace. ExtensionsTable etable = transformer.getExtensionsTable(); ExtensionHandler nsh = etable.get(declNamespace); // If we have no prior ExtensionHandler for this namespace, we need to // create one. // If the script element is for javaclass, this is our special compiled java. // Element content is not supported for this so we throw an exception if // it is provided. Otherwise, we look up the srcURL to see if we already have // an ExtensionHandler. if (null == nsh) { if (lang.equals("javaclass")) { if (null == srcURL) { nsh = etable.makeJavaNamespace(declNamespace); } else { nsh = etable.get(srcURL); if (null == nsh) { nsh = etable.makeJavaNamespace(srcURL); } } } else // not java { nsh = new ExtensionHandlerGeneral(declNamespace, this.m_elements, this.m_functions, lang, srcURL, scriptSrc, getSystemId()); // System.out.println("Adding NS Handler: declNamespace = "+ // declNamespace+", lang = "+lang+", srcURL = "+ // srcURL+", scriptSrc="+scriptSrc); } etable.addExtensionNamespace(declNamespace, nsh); }
}	TokenNameRBRACE	
}	TokenNameRBRACE	
