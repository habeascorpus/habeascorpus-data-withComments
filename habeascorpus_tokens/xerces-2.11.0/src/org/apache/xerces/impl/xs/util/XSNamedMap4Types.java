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
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
SymbolHash	TokenNameIdentifier	 Symbol Hash
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
XSObject	TokenNameIdentifier	 XS Object
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
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
;	TokenNameSEMICOLON	
/** * Contains the map between qnames and XSObject's. * * @xerces.internal * * @author Sandy Gao, IBM * * @version $Id: XSNamedMap4Types.java 726359 2008-12-14 05:04:10Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Contains the map between qnames and XSObject's. * @xerces.internal * @author Sandy Gao, IBM * @version $Id: XSNamedMap4Types.java 726359 2008-12-14 05:04:10Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
XSNamedMap4Types	TokenNameIdentifier	 XS Named Map4 Types
extends	TokenNameextends	
XSNamedMapImpl	TokenNameIdentifier	 XS Named Map Impl
{	TokenNameLBRACE	
// the type of component stored here: complex or simple type 	TokenNameCOMMENT_LINE	the type of component stored here: complex or simple type 
private	TokenNameprivate	
final	TokenNamefinal	
short	TokenNameshort	
fType	TokenNameIdentifier	 f Type
;	TokenNameSEMICOLON	
/** * Construct an XSNamedMap implementation for one namespace * * @param namespace the namespace to which the components belong * @param map the map from local names to components * @param type the type of components */	TokenNameCOMMENT_JAVADOC	 Construct an XSNamedMap implementation for one namespace * @param namespace the namespace to which the components belong @param map the map from local names to components @param type the type of components 
public	TokenNamepublic	
XSNamedMap4Types	TokenNameIdentifier	 XS Named Map4 Types
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
SymbolHash	TokenNameIdentifier	 Symbol Hash
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an XSNamedMap implementation for a list of namespaces * * @param namespaces the namespaces to which the components belong * @param maps the maps from local names to components * @param num the number of namespaces * @param type the type of components */	TokenNameCOMMENT_JAVADOC	 Construct an XSNamedMap implementation for a list of namespaces * @param namespaces the namespaces to which the components belong @param maps the maps from local names to components @param num the number of namespaces @param type the type of components 
public	TokenNamepublic	
XSNamedMap4Types	TokenNameIdentifier	 XS Named Map4 Types
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
namespaces	TokenNameIdentifier	 namespaces
,	TokenNameCOMMA	
SymbolHash	TokenNameIdentifier	 Symbol Hash
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
maps	TokenNameIdentifier	 maps
,	TokenNameCOMMA	
int	TokenNameint	
num	TokenNameIdentifier	 num
,	TokenNameCOMMA	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
namespaces	TokenNameIdentifier	 namespaces
,	TokenNameCOMMA	
maps	TokenNameIdentifier	 maps
,	TokenNameCOMMA	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fType	TokenNameIdentifier	 f Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of <code>XSObjects</code> in the <code>XSObjectList</code>. The * range of valid child node indices is 0 to <code>length-1</code> * inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of <code>XSObjects</code> in the <code>XSObjectList</code>. The range of valid child node indices is 0 to <code>length-1</code> inclusive. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fLength	TokenNameIdentifier	 f Length
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first get the number of components for all types 	TokenNameCOMMENT_LINE	first get the number of components for all types 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
fNSNum	TokenNameIdentifier	 f NS Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
fMaps	TokenNameIdentifier	 f Maps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// then copy all types to an temporary array 	TokenNameCOMMENT_LINE	then copy all types to an temporary array 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
fNSNum	TokenNameIdentifier	 f NS Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
fMaps	TokenNameIdentifier	 f Maps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// then copy either simple or complex types to fArray, 	TokenNameCOMMENT_LINE	then copy either simple or complex types to fArray, 
// depending on which kind is required 	TokenNameCOMMENT_LINE	depending on which kind is required 
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
new	TokenNamenew	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
type	TokenNameIdentifier	 type
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
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
)	TokenNameRPAREN	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
fType	TokenNameIdentifier	 f Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
fLength	TokenNameIdentifier	 f Length
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves an <code>XSObject</code> specified by local name and namespace * URI. * @param namespace The namespace URI of the <code>XSObject</code> to * retrieve. * @param localName The local name of the <code>XSObject</code> to retrieve. * @return A <code>XSObject</code> (of any type) with the specified local * name and namespace URI, or <code>null</code> if they do not * identify any <code>XSObject</code> in this map. */	TokenNameCOMMENT_JAVADOC	 Retrieves an <code>XSObject</code> specified by local name and namespace URI. @param namespace The namespace URI of the <code>XSObject</code> to retrieve. @param localName The local name of the <code>XSObject</code> to retrieve. @return A <code>XSObject</code> (of any type) with the specified local name and namespace URI, or <code>null</code> if they do not identify any <code>XSObject</code> in this map. 
public	TokenNamepublic	
XSObject	TokenNameIdentifier	 XS Object
itemByName	TokenNameIdentifier	 item By Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fNSNum	TokenNameIdentifier	 f NS Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
fNamespaces	TokenNameIdentifier	 f Namespaces
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XSTypeDefinition	TokenNameIdentifier	 XS Type Definition
)	TokenNameRPAREN	
fMaps	TokenNameIdentifier	 f Maps
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// only return it if it matches the required type 	TokenNameCOMMENT_LINE	only return it if it matches the required type 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
getTypeCategory	TokenNameIdentifier	 get Type Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
fType	TokenNameIdentifier	 f Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>index</code>th item in the map. The index starts at * 0. If <code>index</code> is greater than or equal to the number of * nodes in the list, this returns <code>null</code>. * @param index The position in the map from which the item is to be * retrieved. * @return The <code>XSObject</code> at the <code>index</code>th position * in the <code>XSNamedMap</code>, or <code>null</code> if that is * not a valid index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the map. The index starts at 0. If <code>index</code> is greater than or equal to the number of nodes in the list, this returns <code>null</code>. @param index The position in the map from which the item is to be retrieved. @return The <code>XSObject</code> at the <code>index</code>th position in the <code>XSNamedMap</code>, or <code>null</code> if that is not a valid index. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
XSObject	TokenNameIdentifier	 XS Object
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fArray	TokenNameIdentifier	 f Array
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
fLength	TokenNameIdentifier	 f Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSNamedMapImpl 	TokenNameCOMMENT_LINE	class XSNamedMapImpl 
