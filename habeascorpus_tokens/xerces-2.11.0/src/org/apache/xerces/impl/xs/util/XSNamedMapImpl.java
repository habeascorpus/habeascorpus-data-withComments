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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AbstractMap	TokenNameIdentifier	 Abstract Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AbstractSet	TokenNameIdentifier	 Abstract Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
XMLConstants	TokenNameIdentifier	 XML Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
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
XSNamedMap	TokenNameIdentifier	 XS Named Map
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
/** * Contains the map between qnames and XSObject's. * * @xerces.internal * * @author Sandy Gao, IBM * @author Michael Glavassevich, IBM * * @version $Id: XSNamedMapImpl.java 965315 2010-07-18 23:06:35Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Contains the map between qnames and XSObject's. * @xerces.internal * @author Sandy Gao, IBM @author Michael Glavassevich, IBM * @version $Id: XSNamedMapImpl.java 965315 2010-07-18 23:06:35Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XSNamedMapImpl	TokenNameIdentifier	 XS Named Map Impl
extends	TokenNameextends	
AbstractMap	TokenNameIdentifier	 Abstract Map
implements	TokenNameimplements	
XSNamedMap	TokenNameIdentifier	 XS Named Map
{	TokenNameLBRACE	
/** * An immutable empty map. */	TokenNameCOMMENT_JAVADOC	 An immutable empty map. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
XSNamedMapImpl	TokenNameIdentifier	 XS Named Map Impl
EMPTY_MAP	TokenNameIdentifier	 EMPTY  MAP
=	TokenNameEQUAL	
new	TokenNamenew	
XSNamedMapImpl	TokenNameIdentifier	 XS Named Map Impl
(	TokenNameLPAREN	
new	TokenNamenew	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// components of these namespaces are stored in this map 	TokenNameCOMMENT_LINE	components of these namespaces are stored in this map 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fNamespaces	TokenNameIdentifier	 f Namespaces
;	TokenNameSEMICOLON	
// number of namespaces 	TokenNameCOMMENT_LINE	number of namespaces 
final	TokenNamefinal	
int	TokenNameint	
fNSNum	TokenNameIdentifier	 f NS Num
;	TokenNameSEMICOLON	
// each entry contains components in one namespace 	TokenNameCOMMENT_LINE	each entry contains components in one namespace 
final	TokenNamefinal	
SymbolHash	TokenNameIdentifier	 Symbol Hash
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fMaps	TokenNameIdentifier	 f Maps
;	TokenNameSEMICOLON	
// store all components from all namespace. 	TokenNameCOMMENT_LINE	store all components from all namespace. 
// used when this map is accessed as a list. 	TokenNameCOMMENT_LINE	used when this map is accessed as a list. 
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// store the number of components. 	TokenNameCOMMENT_LINE	store the number of components. 
// used when this map is accessed as a list. 	TokenNameCOMMENT_LINE	used when this map is accessed as a list. 
int	TokenNameint	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Set of Map.Entry<QName,XSObject> for the java.util.Map methods 	TokenNameCOMMENT_LINE	Set of Map.Entry<QName,XSObject> for the java.util.Map methods 
private	TokenNameprivate	
Set	TokenNameIdentifier	 Set
fEntrySet	TokenNameIdentifier	 f Entry Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Construct an XSNamedMap implementation for one namespace * * @param namespace the namespace to which the components belong * @param map the map from local names to components */	TokenNameCOMMENT_JAVADOC	 Construct an XSNamedMap implementation for one namespace * @param namespace the namespace to which the components belong @param map the map from local names to components 
public	TokenNamepublic	
XSNamedMapImpl	TokenNameIdentifier	 XS Named Map Impl
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
SymbolHash	TokenNameIdentifier	 Symbol Hash
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
namespace	TokenNameIdentifier	 namespace
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fMaps	TokenNameIdentifier	 f Maps
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolHash	TokenNameIdentifier	 Symbol Hash
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fNSNum	TokenNameIdentifier	 f NS Num
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an XSNamedMap implementation for a list of namespaces * * @param namespaces the namespaces to which the components belong * @param maps the maps from local names to components * @param num the number of namespaces */	TokenNameCOMMENT_JAVADOC	 Construct an XSNamedMap implementation for a list of namespaces * @param namespaces the namespaces to which the components belong @param maps the maps from local names to components @param num the number of namespaces 
public	TokenNamepublic	
XSNamedMapImpl	TokenNameIdentifier	 XS Named Map Impl
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
namespaces	TokenNameIdentifier	 namespaces
;	TokenNameSEMICOLON	
fMaps	TokenNameIdentifier	 f Maps
=	TokenNameEQUAL	
maps	TokenNameIdentifier	 maps
;	TokenNameSEMICOLON	
fNSNum	TokenNameIdentifier	 f NS Num
=	TokenNameEQUAL	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an XSNamedMap implementation one namespace from an array * * @param array containing all components * @param length number of components */	TokenNameCOMMENT_JAVADOC	 Construct an XSNamedMap implementation one namespace from an array * @param array containing all components @param length number of components 
public	TokenNamepublic	
XSNamedMapImpl	TokenNameIdentifier	 XS Named Map Impl
(	TokenNameLPAREN	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fMaps	TokenNameIdentifier	 f Maps
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fNSNum	TokenNameIdentifier	 f NS Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// because all components are from the same target namesapce, 	TokenNameCOMMENT_LINE	because all components are from the same target namesapce, 
// get the namespace from the first one. 	TokenNameCOMMENT_LINE	get the namespace from the first one. 
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fMaps	TokenNameIdentifier	 f Maps
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fNSNum	TokenNameIdentifier	 f NS Num
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// copy elements to the Vector 	TokenNameCOMMENT_LINE	copy elements to the Vector 
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
fLength	TokenNameIdentifier	 f Length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of <code>XSObjects</code> in the <code>XSObjectList</code>. * The range of valid child object indices is 0 to <code>length-1</code> * inclusive. */	TokenNameCOMMENT_JAVADOC	 The number of <code>XSObjects</code> in the <code>XSObjectList</code>. The range of valid child object indices is 0 to <code>length-1</code> inclusive. 
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
fLength	TokenNameIdentifier	 f Length
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
fLength	TokenNameIdentifier	 f Length
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
}	TokenNameRBRACE	
return	TokenNamereturn	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieves an <code>XSObject</code> specified by local name and * namespace URI. * <br>Per XML Namespaces, applications must use the value <code>null</code> as the * <code>namespace</code> parameter for methods if they wish to specify * no namespace. * @param namespace The namespace URI of the <code>XSObject</code> to * retrieve, or <code>null</code> if the <code>XSObject</code> has no * namespace. * @param localName The local name of the <code>XSObject</code> to * retrieve. * @return A <code>XSObject</code> (of any type) with the specified local * name and namespace URI, or <code>null</code> if they do not * identify any object in this map. */	TokenNameCOMMENT_JAVADOC	 Retrieves an <code>XSObject</code> specified by local name and namespace URI. <br>Per XML Namespaces, applications must use the value <code>null</code> as the <code>namespace</code> parameter for methods if they wish to specify no namespace. @param namespace The namespace URI of the <code>XSObject</code> to retrieve, or <code>null</code> if the <code>XSObject</code> has no namespace. @param localName The local name of the <code>XSObject</code> to retrieve. @return A <code>XSObject</code> (of any type) with the specified local name and namespace URI, or <code>null</code> if they do not identify any object in this map. 
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
// when this map is created from SymbolHash's 	TokenNameCOMMENT_LINE	when this map is created from SymbolHash's 
// get the component from SymbolHash 	TokenNameCOMMENT_LINE	get the component from SymbolHash 
if	TokenNameif	
(	TokenNameLPAREN	
fMaps	TokenNameIdentifier	 f Maps
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XSObject	TokenNameIdentifier	 XS Object
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
}	TokenNameRBRACE	
// Otherwise (it's created from an array) 	TokenNameCOMMENT_LINE	Otherwise (it's created from an array) 
// go through the array to find a matching name 	TokenNameCOMMENT_LINE	go through the array to find a matching name 
XSObject	TokenNameIdentifier	 XS Object
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
fLength	TokenNameIdentifier	 f Length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
fArray	TokenNameIdentifier	 f Array
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
/** * Returns the <code>index</code>th item in the collection or * <code>null</code> if <code>index</code> is greater than or equal to * the number of objects in the list. The index starts at 0. * @param index index into the collection. * @return The <code>XSObject</code> at the <code>index</code>th * position in the <code>XSObjectList</code>, or <code>null</code> if * the index specified is not valid. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code>th item in the collection or <code>null</code> if <code>index</code> is greater than or equal to the number of objects in the list. The index starts at 0. @param index index into the collection. @return The <code>XSObject</code> at the <code>index</code>th position in the <code>XSObjectList</code>, or <code>null</code> if the index specified is not valid. 
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
// calculate the total number of elements 	TokenNameCOMMENT_LINE	calculate the total number of elements 
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fArray	TokenNameIdentifier	 f Array
=	TokenNameEQUAL	
new	TokenNamenew	
XSObject	TokenNameIdentifier	 XS Object
[	TokenNameLBRACKET	
fLength	TokenNameIdentifier	 f Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// get components from all SymbolHashes 	TokenNameCOMMENT_LINE	get components from all SymbolHashes 
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
fArray	TokenNameIdentifier	 f Array
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
static	TokenNamestatic	
boolean	TokenNameboolean	
isEqual	TokenNameIdentifier	 is Equal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
one	TokenNameIdentifier	 one
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * java.util.Map methods */	TokenNameCOMMENT_BLOCK	 java.util.Map methods 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
instanceof	TokenNameinstanceof	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XMLConstants	TokenNameIdentifier	 XML Constants
.	TokenNameDOT	
NULL_NS_URI	TokenNameIdentifier	 NULL  NS  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
localPart	TokenNameIdentifier	 local Part
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
itemByName	TokenNameIdentifier	 item By Name
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
localPart	TokenNameIdentifier	 local Part
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Set	TokenNameIdentifier	 Set
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Defer creation of the entry set until it is actually needed. 	TokenNameCOMMENT_LINE	Defer creation of the entry set until it is actually needed. 
if	TokenNameif	
(	TokenNameLPAREN	
fEntrySet	TokenNameIdentifier	 f Entry Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
XSNamedMapEntry	TokenNameIdentifier	 XS Named Map Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
XSNamedMapEntry	TokenNameIdentifier	 XS Named Map Entry
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XSObject	TokenNameIdentifier	 XS Object
xso	TokenNameIdentifier	 xso
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
XSNamedMapEntry	TokenNameIdentifier	 XS Named Map Entry
(	TokenNameLPAREN	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
xso	TokenNameIdentifier	 xso
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xso	TokenNameIdentifier	 xso
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xso	TokenNameIdentifier	 xso
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create a view of this immutable map. 	TokenNameCOMMENT_LINE	Create a view of this immutable map. 
fEntrySet	TokenNameIdentifier	 f Entry Set
=	TokenNameEQUAL	
new	TokenNamenew	
AbstractSet	TokenNameIdentifier	 Abstract Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fEntrySet	TokenNameIdentifier	 f Entry Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** An entry in the XSNamedMap. **/	TokenNameCOMMENT_JAVADOC	 An entry in the XSNamedMap. *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
XSNamedMapEntry	TokenNameIdentifier	 XS Named Map Entry
implements	TokenNameimplements	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
XSObject	TokenNameIdentifier	 XS Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
XSNamedMapEntry	TokenNameIdentifier	 XS Named Map Entry
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
XSObject	TokenNameIdentifier	 XS Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
otherKey	TokenNameIdentifier	 other Key
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
otherValue	TokenNameIdentifier	 other Value
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
otherKey	TokenNameIdentifier	 other Key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherKey	TokenNameIdentifier	 other Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
otherValue	TokenNameIdentifier	 other Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
otherValue	TokenNameIdentifier	 other Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XSNamedMapImpl 	TokenNameCOMMENT_LINE	class XSNamedMapImpl 
