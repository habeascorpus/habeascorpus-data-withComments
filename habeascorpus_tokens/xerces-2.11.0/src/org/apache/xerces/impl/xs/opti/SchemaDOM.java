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
opti	TokenNameIdentifier	 opti
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
XMLString	TokenNameIdentifier	 XML String
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
DOMImplementation	TokenNameIdentifier	 DOM Implementation
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
/** * @xerces.internal * * @author Rahul Srivastava, Sun Microsystems Inc. * @author Sandy Gao, IBM * * @version $Id: SchemaDOM.java 982713 2010-08-05 17:54:01Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Rahul Srivastava, Sun Microsystems Inc. @author Sandy Gao, IBM * @version $Id: SchemaDOM.java 982713 2010-08-05 17:54:01Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
SchemaDOM	TokenNameIdentifier	 Schema DOM
extends	TokenNameextends	
DefaultDocument	TokenNameIdentifier	 Default Document
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
relationsRowResizeFactor	TokenNameIdentifier	 relations Row Resize Factor
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
relationsColResizeFactor	TokenNameIdentifier	 relations Col Resize Factor
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
NodeImpl	TokenNameIdentifier	 Node Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
relations	TokenNameIdentifier	 relations
;	TokenNameSEMICOLON	
// parent must be an element in this scheme 	TokenNameCOMMENT_LINE	parent must be an element in this scheme 
ElementImpl	TokenNameIdentifier	 Element Impl
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
int	TokenNameint	
currLoc	TokenNameIdentifier	 curr Loc
;	TokenNameSEMICOLON	
int	TokenNameint	
nextFreeLoc	TokenNameIdentifier	 next Free Loc
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hidden	TokenNameIdentifier	 hidden
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
inCDATA	TokenNameIdentifier	 in CDATA
;	TokenNameSEMICOLON	
// for annotation support: 	TokenNameCOMMENT_LINE	for annotation support: 
private	TokenNameprivate	
StringBuffer	TokenNameIdentifier	 String Buffer
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SchemaDOM	TokenNameIdentifier	 Schema DOM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElementImpl	TokenNameIdentifier	 Element Impl
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
ElementImpl	TokenNameIdentifier	 Element Impl
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processElement	TokenNameIdentifier	 process Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now the current node added, becomes the parent 	TokenNameCOMMENT_LINE	now the current node added, becomes the parent 
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElementImpl	TokenNameIdentifier	 Element Impl
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
new	TokenNamenew	
ElementImpl	TokenNameIdentifier	 Element Impl
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processElement	TokenNameIdentifier	 process Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ElementImpl	TokenNameIdentifier	 Element Impl
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
processElement	TokenNameIdentifier	 process Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
ElementImpl	TokenNameIdentifier	 Element Impl
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// populate node 	TokenNameCOMMENT_LINE	populate node 
node	TokenNameIdentifier	 node
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
schemaDOM	TokenNameIdentifier	 schema DOM
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
// set the attributes 	TokenNameCOMMENT_LINE	set the attributes 
Attr	TokenNameIdentifier	 Attr
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
new	TokenNamenew	
Attr	TokenNameIdentifier	 Attr
[	TokenNameLBRACKET	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrs	TokenNameIdentifier	 attrs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
AttrImpl	TokenNameIdentifier	 Attr Impl
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
attrs	TokenNameIdentifier	 attrs
;	TokenNameSEMICOLON	
// check if array needs to be resized 	TokenNameCOMMENT_LINE	check if array needs to be resized 
if	TokenNameif	
(	TokenNameLPAREN	
nextFreeLoc	TokenNameIdentifier	 next Free Loc
==	TokenNameEQUAL_EQUAL	
relations	TokenNameIdentifier	 relations
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resizeRelations	TokenNameIdentifier	 resize Relations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// store the current parent 	TokenNameCOMMENT_LINE	store the current parent 
//if (relations[currLoc][0] == null || relations[currLoc][0] != parent) { 	TokenNameCOMMENT_LINE	if (relations[currLoc][0] == null || relations[currLoc][0] != parent) { 
if	TokenNameif	
(	TokenNameLPAREN	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
currLoc	TokenNameIdentifier	 curr Loc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
nextFreeLoc	TokenNameIdentifier	 next Free Loc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
currLoc	TokenNameIdentifier	 curr Loc
=	TokenNameEQUAL	
nextFreeLoc	TokenNameIdentifier	 next Free Loc
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add the current node as child of parent 	TokenNameCOMMENT_LINE	add the current node as child of parent 
boolean	TokenNameboolean	
foundPlace	TokenNameIdentifier	 found Place
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
currLoc	TokenNameIdentifier	 curr Loc
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
currLoc	TokenNameIdentifier	 curr Loc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundPlace	TokenNameIdentifier	 found Place
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundPlace	TokenNameIdentifier	 found Place
)	TokenNameRPAREN	
{	TokenNameLBRACE	
resizeRelations	TokenNameIdentifier	 resize Relations
(	TokenNameLPAREN	
currLoc	TokenNameIdentifier	 curr Loc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
currLoc	TokenNameIdentifier	 curr Loc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
parentRow	TokenNameIdentifier	 parent Row
=	TokenNameEQUAL	
currLoc	TokenNameIdentifier	 curr Loc
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
row	TokenNameIdentifier	 row
=	TokenNameEQUAL	
currLoc	TokenNameIdentifier	 curr Loc
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the parent of current parent node becomes the parent 	TokenNameCOMMENT_LINE	the parent of current parent node becomes the parent 
// for the next node. 	TokenNameCOMMENT_LINE	for the next node. 
currLoc	TokenNameIdentifier	 curr Loc
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
row	TokenNameIdentifier	 row
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
currLoc	TokenNameIdentifier	 curr Loc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// note that this will only be called within appinfo/documentation 	TokenNameCOMMENT_LINE	note that this will only be called within appinfo/documentation 
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<!--"	TokenNameStringLiteral	<!--
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"-->"	TokenNameStringLiteral	-->
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// note that this will only be called within appinfo/documentation 	TokenNameCOMMENT_LINE	note that this will only be called within appinfo/documentation 
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<?"	TokenNameStringLiteral	<?
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// note that this will only be called within appinfo/documentation 	TokenNameCOMMENT_LINE	note that this will only be called within appinfo/documentation 
void	TokenNamevoid	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// escape characters if necessary 	TokenNameCOMMENT_LINE	escape characters if necessary 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
inCDATA	TokenNameIdentifier	 in CDATA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
annotationBuffer	TokenNameIdentifier	 annotation Buffer
=	TokenNameEQUAL	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotationBuffer	TokenNameIdentifier	 annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotationBuffer	TokenNameIdentifier	 annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// character sequence "]]>" cannot appear in content, 	TokenNameCOMMENT_LINE	character sequence "]]>" cannot appear in content, 
// therefore we should escape '>'. 	TokenNameCOMMENT_LINE	therefore we should escape '>'. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotationBuffer	TokenNameIdentifier	 annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If CR is part of the document's content, it 	TokenNameCOMMENT_LINE	If CR is part of the document's content, it 
// must not be printed as a literal otherwise 	TokenNameCOMMENT_LINE	must not be printed as a literal otherwise 
// it would be normalized to LF when the document 	TokenNameCOMMENT_LINE	it would be normalized to LF when the document 
// is reparsed. 	TokenNameCOMMENT_LINE	is reparsed. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
annotationBuffer	TokenNameIdentifier	 annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&#xD;"	TokenNameStringLiteral	&#xD;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
annotationBuffer	TokenNameIdentifier	 annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// note that this will only be called within appinfo/documentation 	TokenNameCOMMENT_LINE	note that this will only be called within appinfo/documentation 
void	TokenNamevoid	
charactersRaw	TokenNameIdentifier	 characters Raw
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
endAnnotation	TokenNameIdentifier	 end Annotation
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
ElementImpl	TokenNameIdentifier	 Element Impl
annotation	TokenNameIdentifier	 annotation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" </"	TokenNameStringLiteral	 </
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
annotation	TokenNameIdentifier	 annotation
.	TokenNameDOT	
fAnnotation	TokenNameIdentifier	 f Annotation
=	TokenNameEQUAL	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// apparently, there is no sensible way of resetting these things 	TokenNameCOMMENT_LINE	apparently, there is no sensible way of resetting these things 
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
endAnnotationElement	TokenNameIdentifier	 end Annotation Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
elemName	TokenNameIdentifier	 elem Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endAnnotationElement	TokenNameIdentifier	 end Annotation Element
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
endAnnotationElement	TokenNameIdentifier	 end Annotation Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemRawName	TokenNameIdentifier	 elem Raw Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</"	TokenNameStringLiteral	</
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elemRawName	TokenNameIdentifier	 elem Raw Name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
endSyntheticAnnotationElement	TokenNameIdentifier	 end Synthetic Annotation Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endSyntheticAnnotationElement	TokenNameIdentifier	 end Synthetic Annotation Element
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
complete	TokenNameIdentifier	 complete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
endSyntheticAnnotationElement	TokenNameIdentifier	 end Synthetic Annotation Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemRawName	TokenNameIdentifier	 elem Raw Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
complete	TokenNameIdentifier	 complete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" </"	TokenNameStringLiteral	 </
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elemRawName	TokenNameIdentifier	 elem Raw Name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// note that this is always called after endElement on <annotation>'s 	TokenNameCOMMENT_LINE	note that this is always called after endElement on <annotation>'s 
// child and before endElement on annotation. 	TokenNameCOMMENT_LINE	child and before endElement on annotation. 
// hence, we must make this the child of the current 	TokenNameCOMMENT_LINE	hence, we must make this the child of the current 
// parent's only child. 	TokenNameCOMMENT_LINE	parent's only child. 
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
fSyntheticAnnotation	TokenNameIdentifier	 f Synthetic Annotation
=	TokenNameEQUAL	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// apparently, there is no sensible way of resetting 	TokenNameCOMMENT_LINE	apparently, there is no sensible way of resetting 
// these things 	TokenNameCOMMENT_LINE	these things 
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
//capturing character calls 	TokenNameCOMMENT_LINE	capturing character calls 
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"</"	TokenNameStringLiteral	</
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elemRawName	TokenNameIdentifier	 elem Raw Name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
startAnnotationCDATA	TokenNameIdentifier	 start Annotation CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
inCDATA	TokenNameIdentifier	 in CDATA
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<![CDATA["	TokenNameStringLiteral	<![CDATA[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
endAnnotationCDATA	TokenNameIdentifier	 end Annotation CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]]>"	TokenNameStringLiteral	]]>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
inCDATA	TokenNameIdentifier	 in CDATA
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
resizeRelations	TokenNameIdentifier	 resize Relations
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
NodeImpl	TokenNameIdentifier	 Node Impl
[	TokenNameLBRACKET	
relations	TokenNameIdentifier	 relations
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
relationsRowResizeFactor	TokenNameIdentifier	 relations Row Resize Factor
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
relations	TokenNameIdentifier	 relations
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
relations	TokenNameIdentifier	 relations
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
relations	TokenNameIdentifier	 relations
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
temp	TokenNameIdentifier	 temp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
temp	TokenNameIdentifier	 temp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
NodeImpl	TokenNameIdentifier	 Node Impl
[	TokenNameLBRACKET	
relationsColResizeFactor	TokenNameIdentifier	 relations Col Resize Factor
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
relations	TokenNameIdentifier	 relations
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
resizeRelations	TokenNameIdentifier	 resize Relations
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeImpl	TokenNameIdentifier	 Node Impl
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
new	TokenNamenew	
NodeImpl	TokenNameIdentifier	 Node Impl
[	TokenNameLBRACKET	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
relationsColResizeFactor	TokenNameIdentifier	 relations Col Resize Factor
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
temp	TokenNameIdentifier	 temp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// help out the garbage collector 	TokenNameCOMMENT_LINE	help out the garbage collector 
if	TokenNameif	
(	TokenNameLPAREN	
relations	TokenNameIdentifier	 relations
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
relations	TokenNameIdentifier	 relations
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
relations	TokenNameIdentifier	 relations
=	TokenNameEQUAL	
new	TokenNamenew	
NodeImpl	TokenNameIdentifier	 Node Impl
[	TokenNameLBRACKET	
relationsRowResizeFactor	TokenNameIdentifier	 relations Row Resize Factor
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
new	TokenNamenew	
ElementImpl	TokenNameIdentifier	 Element Impl
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
"DOCUMENT_NODE"	TokenNameStringLiteral	DOCUMENT_NODE
;	TokenNameSEMICOLON	
currLoc	TokenNameIdentifier	 curr Loc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
nextFreeLoc	TokenNameIdentifier	 next Free Loc
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
inCDATA	TokenNameIdentifier	 in CDATA
=	TokenNameEQUAL	
false	TokenNamefalse	
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
relationsRowResizeFactor	TokenNameIdentifier	 relations Row Resize Factor
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
NodeImpl	TokenNameIdentifier	 Node Impl
[	TokenNameLBRACKET	
relationsColResizeFactor	TokenNameIdentifier	 relations Col Resize Factor
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
currLoc	TokenNameIdentifier	 curr Loc
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printDOM	TokenNameIdentifier	 print DOM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* for (int i=0; i<relations.length; i++) { if (relations[i][0] != null) { for (int j=0; j<relations[i].length; j++) { if (relations[i][j] != null) { System.out.print(relations[i][j].nodeType+"-"+relations[i][j].parentRow+" "); } } System.out.println(""); } } */	TokenNameCOMMENT_BLOCK	 for (int i=0; i<relations.length; i++) { if (relations[i][0] != null) { for (int j=0; j<relations[i].length; j++) { if (relations[i][j] != null) { System.out.print(relations[i][j].nodeType+"-"+relations[i][j].parentRow+" "); } } System.out.println(""); } } 
//traverse(getDocumentElement(), 0); 	TokenNameCOMMENT_LINE	traverse(getDocumentElement(), 0); 
}	TokenNameRBRACE	
// debug methods 	TokenNameCOMMENT_LINE	debug methods 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hasAttributes	TokenNameIdentifier	 has Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NamedNodeMap	TokenNameIdentifier	 Named Node Map
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getAttributes	TokenNameIdentifier	 get Attributes
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
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"=""	TokenNameStringLiteral	="
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depth	TokenNameIdentifier	 depth
+=	TokenNamePLUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
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
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
depth	TokenNameIdentifier	 depth
-=	TokenNameMINUS_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"</"	TokenNameStringLiteral	</
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"/>"	TokenNameStringLiteral	/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
int	TokenNameint	
amount	TokenNameIdentifier	 amount
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
amount	TokenNameIdentifier	 amount
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// org.w3c.dom methods 	TokenNameCOMMENT_LINE	org.w3c.dom methods 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getDocumentElement	TokenNameIdentifier	 get Document Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this returns a parent node, known to be an ElementImpl 	TokenNameCOMMENT_LINE	this returns a parent node, known to be an ElementImpl 
return	TokenNamereturn	
(	TokenNameLPAREN	
ElementImpl	TokenNameIdentifier	 Element Impl
)	TokenNameRPAREN	
relations	TokenNameIdentifier	 relations
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DOMImplementation	TokenNameIdentifier	 DOM Implementation
getImplementation	TokenNameIdentifier	 get Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SchemaDOMImplementation	TokenNameIdentifier	 Schema DOM Implementation
.	TokenNameDOT	
getDOMImplementation	TokenNameIdentifier	 get DOM Implementation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// commence the serialization of an annotation 	TokenNameCOMMENT_LINE	commence the serialization of an annotation 
void	TokenNamevoid	
startAnnotation	TokenNameIdentifier	 start Annotation
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
NamespaceContext	TokenNameIdentifier	 Namespace Context
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startAnnotation	TokenNameIdentifier	 start Annotation
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
startAnnotation	TokenNameIdentifier	 start Annotation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemRawName	TokenNameIdentifier	 elem Raw Name
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
NamespaceContext	TokenNameIdentifier	 Namespace Context
namespaceContext	TokenNameIdentifier	 namespace Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
256	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elemRawName	TokenNameIdentifier	 elem Raw Name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// attributes are a bit of a pain. To get this right, we have to keep track 	TokenNameCOMMENT_LINE	attributes are a bit of a pain. To get this right, we have to keep track 
// of the namespaces we've seen declared, then examine the namespace context 	TokenNameCOMMENT_LINE	of the namespaces we've seen declared, then examine the namespace context 
// for other namespaces so that we can also include them. 	TokenNameCOMMENT_LINE	for other namespaces so that we can also include them. 
// optimized for simplicity and the case that not many 	TokenNameCOMMENT_LINE	optimized for simplicity and the case that not many 
// namespaces are declared on this annotation... 	TokenNameCOMMENT_LINE	namespaces are declared on this annotation... 
ArrayList	TokenNameIdentifier	 Array List
namespaces	TokenNameIdentifier	 namespaces
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
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
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
aValue	TokenNameIdentifier	 a Value
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
aPrefix	TokenNameIdentifier	 a Prefix
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
aQName	TokenNameIdentifier	 a Q Name
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if it's xmlns:* or xmlns, must be a namespace decl 	TokenNameCOMMENT_LINE	if it's xmlns:* or xmlns, must be a namespace decl 
if	TokenNameif	
(	TokenNameLPAREN	
aPrefix	TokenNameIdentifier	 a Prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
||	TokenNameOR_OR	
aQName	TokenNameIdentifier	 a Q Name
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
namespaces	TokenNameIdentifier	 namespaces
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
aPrefix	TokenNameIdentifier	 a Prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
?	TokenNameQUESTION	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
aQName	TokenNameIdentifier	 a Q Name
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
processAttValue	TokenNameIdentifier	 process Att Value
(	TokenNameLPAREN	
aValue	TokenNameIdentifier	 a Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// now we have to look through currently in-scope namespaces to see what 	TokenNameCOMMENT_LINE	now we have to look through currently in-scope namespaces to see what 
// wasn't declared here 	TokenNameCOMMENT_LINE	wasn't declared here 
Enumeration	TokenNameIdentifier	 Enumeration
currPrefixes	TokenNameIdentifier	 curr Prefixes
=	TokenNameEQUAL	
namespaceContext	TokenNameIdentifier	 namespace Context
.	TokenNameDOT	
getAllPrefixes	TokenNameIdentifier	 get All Prefixes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
currPrefixes	TokenNameIdentifier	 curr Prefixes
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
currPrefixes	TokenNameIdentifier	 curr Prefixes
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
namespaceContext	TokenNameIdentifier	 namespace Context
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
namespaces	TokenNameIdentifier	 namespaces
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// have to declare this one 	TokenNameCOMMENT_LINE	have to declare this one 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
processAttValue	TokenNameIdentifier	 process Att Value
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
processAttValue	TokenNameIdentifier	 process Att Value
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"" "	TokenNameStringLiteral	" 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"> "	TokenNameStringLiteral	> 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
startAnnotationElement	TokenNameIdentifier	 start Annotation Element
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
elemName	TokenNameIdentifier	 elem Name
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startAnnotationElement	TokenNameIdentifier	 start Annotation Element
(	TokenNameLPAREN	
elemName	TokenNameIdentifier	 elem Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
startAnnotationElement	TokenNameIdentifier	 start Annotation Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
elemRawName	TokenNameIdentifier	 elem Raw Name
,	TokenNameCOMMA	
XMLAttributes	TokenNameIdentifier	 XML Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"<"	TokenNameStringLiteral	<
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
elemRawName	TokenNameIdentifier	 elem Raw Name
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
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
aValue	TokenNameIdentifier	 a Value
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"=""	TokenNameStringLiteral	="
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
processAttValue	TokenNameIdentifier	 process Att Value
(	TokenNameLPAREN	
aValue	TokenNameIdentifier	 a Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAnnotationBuffer	TokenNameIdentifier	 f Annotation Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
processAttValue	TokenNameIdentifier	 process Att Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
original	TokenNameIdentifier	 original
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// normally, nothing will happen 	TokenNameCOMMENT_LINE	normally, nothing will happen 
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
char	TokenNamechar	
currChar	TokenNameIdentifier	 curr Char
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
'"'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
0x09	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
0x0A	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
escapeAttValue	TokenNameIdentifier	 escape Att Value
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
original	TokenNameIdentifier	 original
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
escapeAttValue	TokenNameIdentifier	 escape Att Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
original	TokenNameIdentifier	 original
,	TokenNameCOMMA	
int	TokenNameint	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
newVal	TokenNameIdentifier	 new Val
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
currChar	TokenNameIdentifier	 curr Char
=	TokenNameEQUAL	
original	TokenNameIdentifier	 original
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&quot;"	TokenNameStringLiteral	&quot;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Must escape 0x09, 0x0A and 0x0D if they appear in attribute 	TokenNameCOMMENT_LINE	Must escape 0x09, 0x0A and 0x0D if they appear in attribute 
// value so that they may be round-tripped. They would otherwise 	TokenNameCOMMENT_LINE	value so that they may be round-tripped. They would otherwise 
// be transformed to a 0x20 during attribute value normalization. 	TokenNameCOMMENT_LINE	be transformed to a 0x20 during attribute value normalization. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
0x09	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&#x9;"	TokenNameStringLiteral	&#x9;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
0x0A	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&#xA;"	TokenNameStringLiteral	&#xA;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
==	TokenNameEQUAL_EQUAL	
0x0D	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&#xD;"	TokenNameStringLiteral	&#xD;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
currChar	TokenNameIdentifier	 curr Char
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
newVal	TokenNameIdentifier	 new Val
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
