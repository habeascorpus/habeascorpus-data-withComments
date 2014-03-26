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
dtd	TokenNameIdentifier	 dtd
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
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
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
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSymbols	TokenNameIdentifier	 XML Symbols
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
Augmentations	TokenNameIdentifier	 Augmentations
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLAttributes	TokenNameIdentifier	 XML Attributes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
/** * The DTD validator. The validator implements a document * filter: receiving document events from the scanner; validating * the content and structure; augmenting the InfoSet, if applicable; * and notifying the parser of the information resulting from the * validation process. * <p> Formerly, this component also handled DTD events and grammar construction. * To facilitate the development of a meaningful DTD grammar caching/preparsing * framework, this functionality has been moved into the XMLDTDLoader * class. Therefore, this class no longer implements the DTDFilter * or DTDContentModelFilter interfaces. * <p> * This component requires the following features and properties from the * component manager that uses it: * <ul> * <li>http://xml.org/sax/features/namespaces</li> * <li>http://xml.org/sax/features/validation</li> * <li>http://apache.org/xml/features/validation/dynamic</li> * <li>http://apache.org/xml/properties/internal/symbol-table</li> * <li>http://apache.org/xml/properties/internal/error-reporter</li> * <li>http://apache.org/xml/properties/internal/grammar-pool</li> * <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li> * </ul> * * @xerces.internal * * @author Elena Litani, IBM * @author Michael Glavassevich, IBM * * @version $Id: XML11NSDTDValidator.java 572055 2007-09-02 17:55:43Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The DTD validator. The validator implements a document filter: receiving document events from the scanner; validating the content and structure; augmenting the InfoSet, if applicable; and notifying the parser of the information resulting from the validation process. <p> Formerly, this component also handled DTD events and grammar construction. To facilitate the development of a meaningful DTD grammar caching/preparsing framework, this functionality has been moved into the XMLDTDLoader class. Therefore, this class no longer implements the DTDFilter or DTDContentModelFilter interfaces. <p> This component requires the following features and properties from the component manager that uses it: <ul> <li>http://xml.org/sax/features/namespaces</li> <li>http://xml.org/sax/features/validation</li> <li>http://apache.org/xml/features/validation/dynamic</li> <li>http://apache.org/xml/properties/internal/symbol-table</li> <li>http://apache.org/xml/properties/internal/error-reporter</li> <li>http://apache.org/xml/properties/internal/grammar-pool</li> <li>http://apache.org/xml/properties/internal/datatype-validator-factory</li> </ul> * @xerces.internal * @author Elena Litani, IBM @author Michael Glavassevich, IBM * @version $Id: XML11NSDTDValidator.java 572055 2007-09-02 17:55:43Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11NSDTDValidator	TokenNameIdentifier	 XM L11 NSDTD Validator
extends	TokenNameextends	
XML11DTDValidator	TokenNameIdentifier	 XM L11 DTD Validator
{	TokenNameLBRACE	
/** Attribute QName. */	TokenNameCOMMENT_JAVADOC	 Attribute QName. 
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Bind namespaces */	TokenNameCOMMENT_JAVADOC	 Bind namespaces 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
startNamespaceScope	TokenNameIdentifier	 start Namespace Scope
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// add new namespace context 	TokenNameCOMMENT_LINE	add new namespace context 
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"ElementXMLNSPrefix"	TokenNameStringLiteral	ElementXMLNSPrefix
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// search for new namespace bindings 	TokenNameCOMMENT_LINE	search for new namespace bindings 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// when it's of form xmlns="..." or xmlns:prefix="...", 	TokenNameCOMMENT_LINE	when it's of form xmlns="..." or xmlns:prefix="...", 
// it's a namespace declaration. but prefix:xmlns="..." isn't. 	TokenNameCOMMENT_LINE	it's a namespace declaration. but prefix:xmlns="..." isn't. 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
&&	TokenNameAND_AND	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the internalized value of this attribute 	TokenNameCOMMENT_LINE	get the internalized value of this attribute 
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1. "xmlns" can't be bound to any namespace 	TokenNameCOMMENT_LINE	1. "xmlns" can't be bound to any namespace 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
&&	TokenNameAND_AND	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"CantBindXMLNS"	TokenNameStringLiteral	CantBindXMLNS
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2. the namespace for "xmlns" can't be bound to any prefix 	TokenNameCOMMENT_LINE	2. the namespace for "xmlns" can't be bound to any prefix 
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"CantBindXMLNS"	TokenNameStringLiteral	CantBindXMLNS
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3. "xml" can't be bound to any other namespace than it's own 	TokenNameCOMMENT_LINE	3. "xml" can't be bound to any other namespace than it's own 
if	TokenNameif	
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XML	TokenNameIdentifier	 PREFIX  XML
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XML_URI	TokenNameIdentifier	 XML  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"CantBindXML"	TokenNameStringLiteral	CantBindXML
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 4. the namespace for "xml" can't be bound to any other prefix 	TokenNameCOMMENT_LINE	4. the namespace for "xml" can't be bound to any other prefix 
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XML_URI	TokenNameIdentifier	 XML  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"CantBindXML"	TokenNameStringLiteral	CantBindXML
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
localpart	TokenNameIdentifier	 localpart
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
?	TokenNameQUESTION	
localpart	TokenNameIdentifier	 localpart
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
// Declare prefix in context. Removing the association between a prefix and a 	TokenNameCOMMENT_LINE	Declare prefix in context. Removing the association between a prefix and a 
// namespace name is permitted in XML 1.1, so if the uri value is the empty string, 	TokenNameCOMMENT_LINE	namespace name is permitted in XML 1.1, so if the uri value is the empty string, 
// the prefix is being unbound. -- mrglavas 	TokenNameCOMMENT_LINE	the prefix is being unbound. -- mrglavas 
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
uri	TokenNameIdentifier	 uri
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// bind the element 	TokenNameCOMMENT_LINE	bind the element 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"ElementPrefixUnbound"	TokenNameStringLiteral	ElementPrefixUnbound
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bind the attributes 	TokenNameCOMMENT_LINE	bind the attributes 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
aprefix	TokenNameIdentifier	 aprefix
=	TokenNameEQUAL	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
arawname	TokenNameIdentifier	 arawname
=	TokenNameEQUAL	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arawname	TokenNameIdentifier	 arawname
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
aprefix	TokenNameIdentifier	 aprefix
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
aprefix	TokenNameIdentifier	 aprefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"AttributePrefixUnbound"	TokenNameStringLiteral	AttributePrefixUnbound
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
arawname	TokenNameIdentifier	 arawname
,	TokenNameCOMMA	
aprefix	TokenNameIdentifier	 aprefix
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// verify that duplicate attributes don't exist 	TokenNameCOMMENT_LINE	verify that duplicate attributes don't exist 
// Example: <foo xmlns:a='NS' xmlns:b='NS' a:attr='v1' b:attr='v2'/> 	TokenNameCOMMENT_LINE	Example: <foo xmlns:a='NS' xmlns:b='NS' a:attr='v1' b:attr='v2'/> 
int	TokenNameint	
attrCount	TokenNameIdentifier	 attr Count
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
attrCount	TokenNameIdentifier	 attr Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
auri	TokenNameIdentifier	 auri
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
auri	TokenNameIdentifier	 auri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
auri	TokenNameIdentifier	 auri
==	TokenNameEQUAL_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
alocalpart	TokenNameIdentifier	 alocalpart
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
attrCount	TokenNameIdentifier	 attr Count
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
blocalpart	TokenNameIdentifier	 blocalpart
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
buri	TokenNameIdentifier	 buri
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
alocalpart	TokenNameIdentifier	 alocalpart
==	TokenNameEQUAL_EQUAL	
blocalpart	TokenNameIdentifier	 blocalpart
&&	TokenNameAND_AND	
auri	TokenNameIdentifier	 auri
==	TokenNameEQUAL_EQUAL	
buri	TokenNameIdentifier	 buri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"AttributeNSNotUnique"	TokenNameStringLiteral	AttributeNSNotUnique
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
alocalpart	TokenNameIdentifier	 alocalpart
,	TokenNameCOMMA	
auri	TokenNameIdentifier	 auri
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// startNamespaceScope(QName,XMLAttributes) 	TokenNameCOMMENT_LINE	startNamespaceScope(QName,XMLAttributes) 
/** Handles end element. */	TokenNameCOMMENT_JAVADOC	 Handles end element. 
protected	TokenNameprotected	
void	TokenNamevoid	
endNamespaceScope	TokenNameIdentifier	 end Namespace Scope
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// bind element 	TokenNameCOMMENT_LINE	bind element 
String	TokenNameIdentifier	 String
eprefix	TokenNameIdentifier	 eprefix
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
eprefix	TokenNameIdentifier	 eprefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
eprefix	TokenNameIdentifier	 eprefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// call handlers 	TokenNameCOMMENT_LINE	call handlers 
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isEmpty	TokenNameIdentifier	 is Empty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// pop context 	TokenNameCOMMENT_LINE	pop context 
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// endNamespaceScope(QName,boolean) 	TokenNameCOMMENT_LINE	endNamespaceScope(QName,boolean) 
}	TokenNameRBRACE	
