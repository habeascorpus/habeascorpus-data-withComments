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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
events	TokenNameIdentifier	 events
.	TokenNameDOT	
Namespace	TokenNameIdentifier	 Namespace
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @author Lucian Holland * @author Michael Glavassevich, IBM * * @version $Id: ElementImpl.java 956312 2010-06-20 00:47:28Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @author Lucian Holland @author Michael Glavassevich, IBM * @version $Id: ElementImpl.java 956312 2010-06-20 00:47:28Z mrglavas $ 
abstract	TokenNameabstract	
class	TokenNameclass	
ElementImpl	TokenNameIdentifier	 Element Impl
extends	TokenNameextends	
XMLEventImpl	TokenNameIdentifier	 XML Event Impl
{	TokenNameLBRACE	
/** * The qualified name of the element that is being closed. */	TokenNameCOMMENT_JAVADOC	 The qualified name of the element that is being closed. 
private	TokenNameprivate	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
fName	TokenNameIdentifier	 f Name
;	TokenNameSEMICOLON	
/** * Namespaces declared in the current scope. */	TokenNameCOMMENT_JAVADOC	 Namespaces declared in the current scope. 
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
fNamespaces	TokenNameIdentifier	 f Namespaces
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
ElementImpl	TokenNameIdentifier	 Element Impl
(	TokenNameLPAREN	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
isStartElement	TokenNameIdentifier	 is Start Element
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
namespaces	TokenNameIdentifier	 namespaces
,	TokenNameCOMMA	
final	TokenNamefinal	
Location	TokenNameIdentifier	 Location
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
isStartElement	TokenNameIdentifier	 is Start Element
?	TokenNameQUESTION	
START_ELEMENT	TokenNameIdentifier	 START  ELEMENT
:	TokenNameCOLON	
END_ELEMENT	TokenNameIdentifier	 END  ELEMENT
,	TokenNameCOMMA	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fName	TokenNameIdentifier	 f Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
namespaces	TokenNameIdentifier	 namespaces
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
namespaces	TokenNameIdentifier	 namespaces
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
Namespace	TokenNameIdentifier	 Namespace
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Namespace	TokenNameIdentifier	 Namespace
)	TokenNameRPAREN	
namespaces	TokenNameIdentifier	 namespaces
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fNamespaces	TokenNameIdentifier	 f Namespaces
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
namespaces	TokenNameIdentifier	 namespaces
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartElement#getName() * @see javax.xml.stream.events.EndElement#getName() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartElement#getName() @see javax.xml.stream.events.EndElement#getName() 
public	TokenNamepublic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fName	TokenNameIdentifier	 f Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see javax.xml.stream.events.StartElement#getNamespaces() * @see javax.xml.stream.events.EndElement#getNamespaces() */	TokenNameCOMMENT_JAVADOC	 @see javax.xml.stream.events.StartElement#getNamespaces() @see javax.xml.stream.events.EndElement#getNamespaces() 
public	TokenNamepublic	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
getNamespaces	TokenNameIdentifier	 get Namespaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createImmutableIterator	TokenNameIdentifier	 create Immutable Iterator
(	TokenNameLPAREN	
fNamespaces	TokenNameIdentifier	 f Namespaces
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
Iterator	TokenNameIdentifier	 Iterator
createImmutableIterator	TokenNameIdentifier	 create Immutable Iterator
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NoRemoveIterator	TokenNameIdentifier	 No Remove Iterator
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
NoRemoveIterator	TokenNameIdentifier	 No Remove Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
fWrapped	TokenNameIdentifier	 f Wrapped
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NoRemoveIterator	TokenNameIdentifier	 No Remove Iterator
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
wrapped	TokenNameIdentifier	 wrapped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fWrapped	TokenNameIdentifier	 f Wrapped
=	TokenNameEQUAL	
wrapped	TokenNameIdentifier	 wrapped
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.util.Iterator#hasNext() */	TokenNameCOMMENT_JAVADOC	 @see java.util.Iterator#hasNext() 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fWrapped	TokenNameIdentifier	 f Wrapped
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.util.Iterator#next() */	TokenNameCOMMENT_JAVADOC	 @see java.util.Iterator#next() 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fWrapped	TokenNameIdentifier	 f Wrapped
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see java.util.Iterator#remove() */	TokenNameCOMMENT_JAVADOC	 @see java.util.Iterator#remove() 
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
"Attributes iterator is read-only."	TokenNameStringLiteral	Attributes iterator is read-only.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
