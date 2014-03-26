/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
.	TokenNameDOT	
events	TokenNameIdentifier	 events
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Writer	TokenNameIdentifier	 Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
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
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
Location	TokenNameIdentifier	 Location
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Namespace	TokenNameIdentifier	 Namespace
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
events	TokenNameIdentifier	 events
.	TokenNameDOT	
StartElement	TokenNameIdentifier	 Start Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
stax	TokenNameIdentifier	 stax
.	TokenNameDOT	
DefaultNamespaceContext	TokenNameIdentifier	 Default Namespace Context
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Lucian Holland * * @version $Id: StartElementImpl.java 730796 2009-01-02 17:36:23Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Lucian Holland * @version $Id: StartElementImpl.java 730796 2009-01-02 17:36:23Z mrglavas $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
StartElementImpl	TokenNameIdentifier	 Start Element Impl
extends	TokenNameextends	
ElementImpl	TokenNameIdentifier	 Element Impl
implements	TokenNameimplements	
StartElement	TokenNameIdentifier	 Start Element
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
QNAME_COMPARATOR	TokenNameIdentifier	 QNAME  COMPARATOR
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
QName	TokenNameIdentifier	 Q Name
name1	TokenNameIdentifier	 name1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
name2	TokenNameIdentifier	 name2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
)	TokenNameRPAREN	
o2	TokenNameIdentifier	 o2
;	TokenNameSEMICOLON	
return	TokenNamereturn	
name1	TokenNameIdentifier	 name1
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
name2	TokenNameIdentifier	 name2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
fAttributes	TokenNameIdentifier	 f Attributes
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
NamespaceContext	TokenNameIdentifier	 Namespace Context
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
;	TokenNameSEMICOLON	
/** * @param location * @param schemaType */	TokenNameCOMMENT_JAVADOC	 @param location @param schemaType 
public	TokenNamepublic	
StartElementImpl	TokenNameIdentifier	 Start Element Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
namespaces	TokenNameIdentifier	 namespaces
,	TokenNameCOMMA	
final	TokenNamefinal	
NamespaceContext	TokenNameIdentifier	 Namespace Context
namespaceContext	TokenNameIdentifier	 namespace Context
,	TokenNameCOMMA	
final	TokenNamefinal	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
namespaces	TokenNameIdentifier	 namespaces
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
(	TokenNameLPAREN	
QNAME_COMPARATOR	TokenNameIdentifier	 QNAME  COMPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
)	TokenNameRPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_MAP	TokenNameIdentifier	 EMPTY  MAP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
=	TokenNameEQUAL	
(	TokenNameLPAREN	
namespaceContext	TokenNameIdentifier	 namespace Context
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
namespaceContext	TokenNameIdentifier	 namespace Context
:	TokenNameCOLON	
DefaultNamespaceContext	TokenNameIdentifier	 Default Namespace Context
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartElement#getAttributes() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartElement#getAttributes() 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createImmutableIterator	TokenNameIdentifier	 create Immutable Iterator
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartElement#getAttributeByName(javax.xml.namespace.QName) */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartElement#getAttributeByName(javax.xml.namespace.QName) 
public	TokenNamepublic	
Attribute	TokenNameIdentifier	 Attribute
getAttributeByName	TokenNameIdentifier	 get Attribute By Name
(	TokenNameLPAREN	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
)	TokenNameRPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartElement#getNamespaceContext() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartElement#getNamespaceContext() 
public	TokenNamepublic	
NamespaceContext	TokenNameIdentifier	 Namespace Context
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartElement#getNamespaceURI(java.lang.String) */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartElement#getNamespaceURI(java.lang.String) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
writeAsEncodedUnicode	TokenNameIdentifier	 write As Encoded Unicode
(	TokenNameLPAREN	
Writer	TokenNameIdentifier	 Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Write start tag. 	TokenNameCOMMENT_LINE	Write start tag. 
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
getLocalPart	TokenNameIdentifier	 get Local Part
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Write namespace declarations. 	TokenNameCOMMENT_LINE	Write namespace declarations. 
Iterator	TokenNameIdentifier	 Iterator
nsIter	TokenNameIdentifier	 ns Iter
=	TokenNameEQUAL	
getNamespaces	TokenNameIdentifier	 get Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nsIter	TokenNameIdentifier	 ns Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Namespace	TokenNameIdentifier	 Namespace
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Namespace	TokenNameIdentifier	 Namespace
)	TokenNameRPAREN	
nsIter	TokenNameIdentifier	 ns Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
writeAsEncodedUnicode	TokenNameIdentifier	 write As Encoded Unicode
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Write attributes 	TokenNameCOMMENT_LINE	Write attributes 
Iterator	TokenNameIdentifier	 Iterator
attrIter	TokenNameIdentifier	 attr Iter
=	TokenNameEQUAL	
getAttributes	TokenNameIdentifier	 get Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
attrIter	TokenNameIdentifier	 attr Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attribute	TokenNameIdentifier	 Attribute
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Attribute	TokenNameIdentifier	 Attribute
)	TokenNameRPAREN	
attrIter	TokenNameIdentifier	 attr Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
writeAsEncodedUnicode	TokenNameIdentifier	 write As Encoded Unicode
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XMLStreamException	TokenNameIdentifier	 XML Stream Exception
(	TokenNameLPAREN	
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
