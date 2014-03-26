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
opti	TokenNameIdentifier	 opti
.	TokenNameDOT	
ElementImpl	TokenNameIdentifier	 Element Impl
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
NamespaceSupport	TokenNameIdentifier	 Namespace Support
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
SymbolTable	TokenNameIdentifier	 Symbol Table
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
/** * This class customizes the behaviour of the util.NamespaceSupport * class in order to easily implement some features that we need for * efficient schema handling. It will not be generally useful. * * @xerces.internal * * @author Neil Graham, IBM * * @version $Id: SchemaNamespaceSupport.java 446734 2006-09-15 20:51:23Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class customizes the behaviour of the util.NamespaceSupport class in order to easily implement some features that we need for efficient schema handling. It will not be generally useful. * @xerces.internal * @author Neil Graham, IBM * @version $Id: SchemaNamespaceSupport.java 446734 2006-09-15 20:51:23Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
extends	TokenNameextends	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
{	TokenNameLBRACE	
private	TokenNameprivate	
SchemaRootContext	TokenNameIdentifier	 Schema Root Context
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
schemaRoot	TokenNameIdentifier	 schema Root
,	TokenNameCOMMA	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
schemaRoot	TokenNameIdentifier	 schema Root
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
schemaRoot	TokenNameIdentifier	 schema Root
instanceof	TokenNameinstanceof	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
ownerDocument	TokenNameIdentifier	 owner Document
=	TokenNameEQUAL	
schemaRoot	TokenNameIdentifier	 schema Root
.	TokenNameDOT	
getOwnerDocument	TokenNameIdentifier	 get Owner Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ownerDocument	TokenNameIdentifier	 owner Document
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
schemaRoot	TokenNameIdentifier	 schema Root
!=	TokenNameNOT_EQUAL	
ownerDocument	TokenNameIdentifier	 owner Document
.	TokenNameDOT	
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
=	TokenNameEQUAL	
new	TokenNamenew	
SchemaRootContext	TokenNameIdentifier	 Schema Root Context
(	TokenNameLPAREN	
schemaRoot	TokenNameIdentifier	 schema Root
,	TokenNameCOMMA	
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// constructor 	TokenNameCOMMENT_LINE	constructor 
// more effecient than NamespaceSupport(NamespaceContext) 	TokenNameCOMMENT_LINE	more effecient than NamespaceSupport(NamespaceContext) 
public	TokenNamepublic	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
(	TokenNameLPAREN	
SchemaNamespaceSupport	TokenNameIdentifier	 Schema Namespace Support
nSupport	TokenNameIdentifier	 n Support
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
=	TokenNameEQUAL	
nSupport	TokenNameIdentifier	 n Support
.	TokenNameDOT	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
;	TokenNameSEMICOLON	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
=	TokenNameEQUAL	
nSupport	TokenNameIdentifier	 n Support
.	TokenNameDOT	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
)	TokenNameRPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
nSupport	TokenNameIdentifier	 n Support
.	TokenNameDOT	
fNamespace	TokenNameIdentifier	 f Namespace
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fNamespace	TokenNameIdentifier	 f Namespace
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentContext	TokenNameIdentifier	 f Current Context
=	TokenNameEQUAL	
nSupport	TokenNameIdentifier	 n Support
.	TokenNameDOT	
fCurrentContext	TokenNameIdentifier	 f Current Context
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fContext	TokenNameIdentifier	 f Context
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
fCurrentContext	TokenNameIdentifier	 f Current Context
)	TokenNameRPAREN	
fContext	TokenNameIdentifier	 f Context
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
fCurrentContext	TokenNameIdentifier	 f Current Context
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
nSupport	TokenNameIdentifier	 n Support
.	TokenNameDOT	
fContext	TokenNameIdentifier	 f Context
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fContext	TokenNameIdentifier	 f Context
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fCurrentContext	TokenNameIdentifier	 f Current Context
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end constructor 	TokenNameCOMMENT_LINE	end constructor 
/** * This method takes a set of Strings, as stored in a * NamespaceSupport object, and "fools" the object into thinking * that this is one unified context. This is meant to be used in * conjunction with things like local elements, whose declarations * may be deeply nested but which for all practical purposes may * be regarded as being one level below the global <schema> * element--at least with regard to namespace declarations. * It's worth noting that the context from which the strings are * being imported had better be using the same SymbolTable. */	TokenNameCOMMENT_JAVADOC	 This method takes a set of Strings, as stored in a NamespaceSupport object, and "fools" the object into thinking that this is one unified context. This is meant to be used in conjunction with things like local elements, whose declarations may be deeply nested but which for all practical purposes may be regarded as being one level below the global <schema> element--at least with regard to namespace declarations. It's worth noting that the context from which the strings are being imported had better be using the same SymbolTable. 
public	TokenNamepublic	
void	TokenNamevoid	
setEffectiveContext	TokenNameIdentifier	 set Effective Context
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
namespaceDecls	TokenNameIdentifier	 namespace Decls
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
namespaceDecls	TokenNameIdentifier	 namespace Decls
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
namespaceDecls	TokenNameIdentifier	 namespace Decls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
+	TokenNamePLUS	
namespaceDecls	TokenNameIdentifier	 namespace Decls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
newSize	TokenNameIdentifier	 new Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// expand namespace's size... 	TokenNameCOMMENT_LINE	expand namespace's size... 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tempNSArray	TokenNameIdentifier	 temp NS Array
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tempNSArray	TokenNameIdentifier	 temp NS Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fNamespace	TokenNameIdentifier	 f Namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
tempNSArray	TokenNameIdentifier	 temp NS Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
namespaceDecls	TokenNameIdentifier	 namespace Decls
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fNamespace	TokenNameIdentifier	 f Namespace
,	TokenNameCOMMA	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
,	TokenNameCOMMA	
namespaceDecls	TokenNameIdentifier	 namespace Decls
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setEffectiveContext(String):void 	TokenNameCOMMENT_LINE	setEffectiveContext(String):void 
/** * This method returns an array of Strings, as would be stored in * a NamespaceSupport object. This array contains all * declarations except those at the global level. */	TokenNameCOMMENT_JAVADOC	 This method returns an array of Strings, as would be stored in a NamespaceSupport object. This array contains all declarations except those at the global level. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEffectiveLocalContext	TokenNameIdentifier	 get Effective Local Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the trick here is to recognize that all local contexts 	TokenNameCOMMENT_LINE	the trick here is to recognize that all local contexts 
// happen to start at fContext[3]. 	TokenNameCOMMENT_LINE	happen to start at fContext[3]. 
// context 1: empty 	TokenNameCOMMENT_LINE	context 1: empty 
// context 2: decls for xml and xmlns; 	TokenNameCOMMENT_LINE	context 2: decls for xml and xmlns; 
// context 3: decls on <xs:schema>: the global ones 	TokenNameCOMMENT_LINE	context 3: decls on <xs:schema>: the global ones 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
returnVal	TokenNameIdentifier	 return Val
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentContext	TokenNameIdentifier	 f Current Context
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bottomLocalContext	TokenNameIdentifier	 bottom Local Context
=	TokenNameEQUAL	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
copyCount	TokenNameIdentifier	 copy Count
=	TokenNameEQUAL	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
-	TokenNameMINUS	
bottomLocalContext	TokenNameIdentifier	 bottom Local Context
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
copyCount	TokenNameIdentifier	 copy Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
returnVal	TokenNameIdentifier	 return Val
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
copyCount	TokenNameIdentifier	 copy Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
,	TokenNameCOMMA	
bottomLocalContext	TokenNameIdentifier	 bottom Local Context
,	TokenNameCOMMA	
returnVal	TokenNameIdentifier	 return Val
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
copyCount	TokenNameIdentifier	 copy Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
returnVal	TokenNameIdentifier	 return Val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getEffectiveLocalContext():String 	TokenNameCOMMENT_LINE	getEffectiveLocalContext():String 
// This method removes from this object all the namespaces 	TokenNameCOMMENT_LINE	This method removes from this object all the namespaces 
// returned by getEffectiveLocalContext. 	TokenNameCOMMENT_LINE	returned by getEffectiveLocalContext. 
public	TokenNamepublic	
void	TokenNamevoid	
makeGlobal	TokenNameIdentifier	 make Global
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentContext	TokenNameIdentifier	 f Current Context
>=	TokenNameGREATER_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentContext	TokenNameIdentifier	 f Current Context
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
=	TokenNameEQUAL	
fContext	TokenNameIdentifier	 f Context
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// makeGlobal 	TokenNameCOMMENT_LINE	makeGlobal 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
.	TokenNameDOT	
fDOMContextBuilt	TokenNameIdentifier	 f DOM Context Built
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
.	TokenNameDOT	
fillNamespaceContext	TokenNameIdentifier	 fill Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
.	TokenNameDOT	
fDOMContextBuilt	TokenNameIdentifier	 f DOM Context Built
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
.	TokenNameDOT	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
containsPrefix	TokenNameIdentifier	 contains Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fSchemaRootContext	TokenNameIdentifier	 f Schema Root Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class keeps track of the namespace bindings * declared on ancestors of the schema root. */	TokenNameCOMMENT_JAVADOC	 This class keeps track of the namespace bindings declared on ancestors of the schema root. 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
SchemaRootContext	TokenNameIdentifier	 Schema Root Context
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** * Namespace binding information. This array is composed of a * series of tuples containing the namespace binding information: * &lt;prefix, uri&gt;. */	TokenNameCOMMENT_JAVADOC	 Namespace binding information. This array is composed of a series of tuples containing the namespace binding information: &lt;prefix, uri&gt;. 
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** The size of the namespace information array. */	TokenNameCOMMENT_JAVADOC	 The size of the namespace information array. 
int	TokenNameint	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Flag indicating whether the namespace context * has been from the root node's ancestors. */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether the namespace context has been from the root node's ancestors. 
boolean	TokenNameboolean	
fDOMContextBuilt	TokenNameIdentifier	 f DOM Context Built
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Schema root. **/	TokenNameCOMMENT_JAVADOC	 Schema root. *
private	TokenNameprivate	
final	TokenNamefinal	
Element	TokenNameIdentifier	 Element
fSchemaRoot	TokenNameIdentifier	 f Schema Root
;	TokenNameSEMICOLON	
/** Symbol table. **/	TokenNameCOMMENT_JAVADOC	 Symbol table. *
private	TokenNameprivate	
final	TokenNamefinal	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
/** Temporary storage for attribute QNames. **/	TokenNameCOMMENT_JAVADOC	 Temporary storage for attribute QNames. *
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
SchemaRootContext	TokenNameIdentifier	 Schema Root Context
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
schemaRoot	TokenNameIdentifier	 schema Root
,	TokenNameCOMMA	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSchemaRoot	TokenNameIdentifier	 f Schema Root
=	TokenNameEQUAL	
schemaRoot	TokenNameIdentifier	 schema Root
;	TokenNameSEMICOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
fillNamespaceContext	TokenNameIdentifier	 fill Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fSchemaRoot	TokenNameIdentifier	 f Schema Root
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
fSchemaRoot	TokenNameIdentifier	 f Schema Root
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currentNode	TokenNameIdentifier	 current Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attributes	TokenNameIdentifier	 attributes
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
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
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fillQName	TokenNameIdentifier	 fill Q Name
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: Should we be looking at non-namespace attributes 	TokenNameCOMMENT_LINE	REVISIT: Should we be looking at non-namespace attributes 
// for additional mappings? Should we detect illegal namespace 	TokenNameCOMMENT_LINE	for additional mappings? Should we detect illegal namespace 
// declarations and exclude them from the context? -- mrglavas 	TokenNameCOMMENT_LINE	declarations and exclude them from the context? -- mrglavas 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// process namespace attribute 	TokenNameCOMMENT_LINE	process namespace attribute 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
currentNode	TokenNameIdentifier	 current Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// find prefix in the DOM context 	TokenNameCOMMENT_LINE	find prefix in the DOM context 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// prefix not found 	TokenNameCOMMENT_LINE	prefix not found 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// resize array, if needed 	TokenNameCOMMENT_LINE	resize array, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
==	TokenNameEQUAL_EQUAL	
fNamespace	TokenNameIdentifier	 f Namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
namespacearray	TokenNameIdentifier	 namespacearray
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fNamespace	TokenNameIdentifier	 f Namespace
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
namespacearray	TokenNameIdentifier	 namespacearray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
=	TokenNameEQUAL	
namespacearray	TokenNameIdentifier	 namespacearray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bind prefix to uri in current context 	TokenNameCOMMENT_LINE	bind prefix to uri in current context 
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
fNamespace	TokenNameIdentifier	 f Namespace
[	TokenNameLBRACKET	
fNamespaceSize	TokenNameIdentifier	 f Namespace Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
fillQName	TokenNameIdentifier	 fill Q Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
toFill	TokenNameIdentifier	 to Fill
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toFill	TokenNameIdentifier	 to Fill
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
toFill	TokenNameIdentifier	 to Fill
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
toFill	TokenNameIdentifier	 to Fill
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
toFill	TokenNameIdentifier	 to Fill
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class NamespaceSupport 	TokenNameCOMMENT_LINE	class NamespaceSupport 
