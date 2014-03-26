/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMDefaultBaseIterators.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMDefaultBaseIterators.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
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
XMLStringFactory	TokenNameIdentifier	 XML String Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeCounter	TokenNameIdentifier	 Node Counter
;	TokenNameSEMICOLON	
/** * This class implements the traversers for DTMDefaultBase. */	TokenNameCOMMENT_JAVADOC	 This class implements the traversers for DTMDefaultBase. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DTMDefaultBaseIterators	TokenNameIdentifier	 DTM Default Base Iterators
extends	TokenNameextends	
DTMDefaultBaseTraversers	TokenNameIdentifier	 DTM Default Base Traversers
{	TokenNameLBRACE	
/** * Construct a DTMDefaultBaseTraversers object from a DOM node. * * @param mgr The DTMManager who owns this DTM. * @param source The object that is used to specify the construction source. * @param dtmIdentity The DTM identity ID for this DTM. * @param whiteSpaceFilter The white space filter for this DTM, which may * be null. * @param xstringfactory The factory to use for creating XMLStrings. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. */	TokenNameCOMMENT_JAVADOC	 Construct a DTMDefaultBaseTraversers object from a DOM node. * @param mgr The DTMManager who owns this DTM. @param source The object that is used to specify the construction source. @param dtmIdentity The DTM identity ID for this DTM. @param whiteSpaceFilter The white space filter for this DTM, which may be null. @param xstringfactory The factory to use for creating XMLStrings. @param doIndexing true if the caller considers it worth it to use indexing schemes. 
public	TokenNamepublic	
DTMDefaultBaseIterators	TokenNameIdentifier	 DTM Default Base Iterators
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a DTMDefaultBaseTraversers object from a DOM node. * * @param mgr The DTMManager who owns this DTM. * @param source The object that is used to specify the construction source. * @param dtmIdentity The DTM identity ID for this DTM. * @param whiteSpaceFilter The white space filter for this DTM, which may * be null. * @param xstringfactory The factory to use for creating XMLStrings. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * @param blocksize The block size of the DTM. * @param usePrevsib true if we want to build the previous sibling node array. * @param newNameTable true if we want to use a new ExpandedNameTable for this DTM. */	TokenNameCOMMENT_JAVADOC	 Construct a DTMDefaultBaseTraversers object from a DOM node. * @param mgr The DTMManager who owns this DTM. @param source The object that is used to specify the construction source. @param dtmIdentity The DTM identity ID for this DTM. @param whiteSpaceFilter The white space filter for this DTM, which may be null. @param xstringfactory The factory to use for creating XMLStrings. @param doIndexing true if the caller considers it worth it to use indexing schemes. @param blocksize The block size of the DTM. @param usePrevsib true if we want to build the previous sibling node array. @param newNameTable true if we want to use a new ExpandedNameTable for this DTM. 
public	TokenNamepublic	
DTMDefaultBaseIterators	TokenNameIdentifier	 DTM Default Base Iterators
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
int	TokenNameint	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
boolean	TokenNameboolean	
usePrevsib	TokenNameIdentifier	 use Prevsib
,	TokenNameCOMMA	
boolean	TokenNameboolean	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
mgr	TokenNameIdentifier	 mgr
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
xstringfactory	TokenNameIdentifier	 xstringfactory
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
,	TokenNameCOMMA	
blocksize	TokenNameIdentifier	 blocksize
,	TokenNameCOMMA	
usePrevsib	TokenNameIdentifier	 use Prevsib
,	TokenNameCOMMA	
newNameTable	TokenNameIdentifier	 new Name Table
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an iterator that can navigate over an XPath Axis, predicated by * the extended type ID. * Returns an iterator that must be initialized * with a start node (using iterator.setStartNode()). * * @param axis One of Axes.ANCESTORORSELF, etc. * @param type An extended type ID. * * @return A DTMAxisIterator, or null if the given axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 Get an iterator that can navigate over an XPath Axis, predicated by the extended type ID. Returns an iterator that must be initialized with a start node (using iterator.setStartNode()). * @param axis One of Axes.ANCESTORORSELF, etc. @param type An extended type ID. * @return A DTMAxisIterator, or null if the given axis isn't supported. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getTypedAxisIterator	TokenNameIdentifier	 get Typed Axis Iterator
(	TokenNameLPAREN	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/* This causes an error when using patterns for elements that do not exist in the DOM (translet types which do not correspond to a DOM type are mapped to the DOM.ELEMENT type). */	TokenNameCOMMENT_BLOCK	 This causes an error when using patterns for elements that do not exist in the DOM (translet types which do not correspond to a DOM type are mapped to the DOM.ELEMENT type). 
// if (type == NO_TYPE) { 	TokenNameCOMMENT_LINE	if (type == NO_TYPE) { 
// return(EMPTYITERATOR); 	TokenNameCOMMENT_LINE	return(EMPTYITERATOR); 
// } 	TokenNameCOMMENT_LINE	} 
// else if (type == ELEMENT) { 	TokenNameCOMMENT_LINE	else if (type == ELEMENT) { 
// iterator = new FilterIterator(getAxisIterator(axis), 	TokenNameCOMMENT_LINE	iterator = new FilterIterator(getAxisIterator(axis), 
// getElementFilter()); 	TokenNameCOMMENT_LINE	getElementFilter()); 
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedSingletonIterator	TokenNameIdentifier	 Typed Singleton Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedChildrenIterator	TokenNameIdentifier	 Typed Children Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
ParentIterator	TokenNameIdentifier	 Parent Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNodeType	TokenNameIdentifier	 set Node Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ANCESTOR	TokenNameIdentifier	 ANCESTOR
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
TypedAncestorIterator	TokenNameIdentifier	 Typed Ancestor Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ANCESTORORSELF	TokenNameIdentifier	 ANCESTORORSELF
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
TypedAncestorIterator	TokenNameIdentifier	 Typed Ancestor Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
includeSelf	TokenNameIdentifier	 include Self
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
TypedAttributeIterator	TokenNameIdentifier	 Typed Attribute Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedDescendantIterator	TokenNameIdentifier	 Typed Descendant Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTORSELF	TokenNameIdentifier	 DESCENDANTORSELF
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
TypedDescendantIterator	TokenNameIdentifier	 Typed Descendant Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
includeSelf	TokenNameIdentifier	 include Self
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FOLLOWING	TokenNameIdentifier	 FOLLOWING
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedFollowingIterator	TokenNameIdentifier	 Typed Following Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDING	TokenNameIdentifier	 PRECEDING
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedPrecedingIterator	TokenNameIdentifier	 Typed Preceding Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FOLLOWINGSIBLING	TokenNameIdentifier	 FOLLOWINGSIBLING
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedFollowingSiblingIterator	TokenNameIdentifier	 Typed Following Sibling Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDINGSIBLING	TokenNameIdentifier	 PRECEDINGSIBLING
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedPrecedingSiblingIterator	TokenNameIdentifier	 Typed Preceding Sibling Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedNamespaceIterator	TokenNameIdentifier	 Typed Namespace Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
TypedRootIterator	TokenNameIdentifier	 Typed Root Iterator
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_TYPED_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  TYPED  ITERATOR  AXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
getNames	TokenNameIdentifier	 get Names
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Error: typed iterator for axis " 	TokenNameCOMMENT_LINE	"Error: typed iterator for axis " 
//+ Axis.names[axis] + "not implemented"); 	TokenNameCOMMENT_LINE	+ Axis.names[axis] + "not implemented"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is a shortcut to the iterators that implement the * XPath axes. * Returns a bare-bones iterator that must be initialized * with a start node (using iterator.setStartNode()). * * @param axis One of Axes.ANCESTORORSELF, etc. * * @return A DTMAxisIterator, or null if the given axis isn't supported. */	TokenNameCOMMENT_JAVADOC	 This is a shortcut to the iterators that implement the XPath axes. Returns a bare-bones iterator that must be initialized with a start node (using iterator.setStartNode()). * @param axis One of Axes.ANCESTORORSELF, etc. * @return A DTMAxisIterator, or null if the given axis isn't supported. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
getAxisIterator	TokenNameIdentifier	 get Axis Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
ChildrenIterator	TokenNameIdentifier	 Children Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PARENT	TokenNameIdentifier	 PARENT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
ParentIterator	TokenNameIdentifier	 Parent Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ANCESTOR	TokenNameIdentifier	 ANCESTOR
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
AncestorIterator	TokenNameIdentifier	 Ancestor Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ANCESTORORSELF	TokenNameIdentifier	 ANCESTORORSELF
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
new	TokenNamenew	
AncestorIterator	TokenNameIdentifier	 Ancestor Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
includeSelf	TokenNameIdentifier	 include Self
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
AttributeIterator	TokenNameIdentifier	 Attribute Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTORSELF	TokenNameIdentifier	 DESCENDANTORSELF
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
new	TokenNamenew	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
includeSelf	TokenNameIdentifier	 include Self
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FOLLOWING	TokenNameIdentifier	 FOLLOWING
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
FollowingIterator	TokenNameIdentifier	 Following Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDING	TokenNameIdentifier	 PRECEDING
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
PrecedingIterator	TokenNameIdentifier	 Preceding Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FOLLOWINGSIBLING	TokenNameIdentifier	 FOLLOWINGSIBLING
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
FollowingSiblingIterator	TokenNameIdentifier	 Following Sibling Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDINGSIBLING	TokenNameIdentifier	 PRECEDINGSIBLING
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
PrecedingSiblingIterator	TokenNameIdentifier	 Preceding Sibling Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceIterator	TokenNameIdentifier	 Namespace Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
:	TokenNameCOLON	
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
RootIterator	TokenNameIdentifier	 Root Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ITERATOR_AXIS_NOT_IMPLEMENTED	TokenNameIdentifier	 ER  ITERATOR  AXIS  NOT  IMPLEMENTED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
getNames	TokenNameIdentifier	 get Names
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Error: iterator for axis '" + Axis.names[axis] 	TokenNameCOMMENT_LINE	"Error: iterator for axis '" + Axis.names[axis] 
//+ "' not implemented"); 	TokenNameCOMMENT_LINE	+ "' not implemented"); 
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Abstract superclass defining behaviors shared by all DTMDefault's * internal implementations of DTMAxisIterator. Subclass this (and * override, if necessary) to implement the specifics of an * individual axis iterator. * * Currently there isn't a lot here */	TokenNameCOMMENT_JAVADOC	 Abstract superclass defining behaviors shared by all DTMDefault's internal implementations of DTMAxisIterator. Subclass this (and override, if necessary) to implement the specifics of an individual axis iterator. * Currently there isn't a lot here 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
extends	TokenNameextends	
DTMAxisIteratorBase	TokenNameIdentifier	 DTM Axis Iterator Base
{	TokenNameLBRACE	
// %REVIEW% We could opt to share _nodeType and setNodeType() as 	TokenNameCOMMENT_LINE	%REVIEW% We could opt to share _nodeType and setNodeType() as 
// well, and simply ignore them in iterators which don't use them. 	TokenNameCOMMENT_LINE	well, and simply ignore them in iterators which don't use them. 
// But Scott's worried about the overhead involved in cloning 	TokenNameCOMMENT_LINE	But Scott's worried about the overhead involved in cloning 
// these, and wants them to have as few fields as possible. Note 	TokenNameCOMMENT_LINE	these, and wants them to have as few fields as possible. Note 
// that we can't create a TypedInternalAxisIteratorBase because 	TokenNameCOMMENT_LINE	that we can't create a TypedInternalAxisIteratorBase because 
// those are often based on the untyped versions and Java doesn't 	TokenNameCOMMENT_LINE	those are often based on the untyped versions and Java doesn't 
// support multiple inheritance. <sigh/> 	TokenNameCOMMENT_LINE	support multiple inheritance. <sigh/> 
/** * Current iteration location. Usually this is the last location * returned (starting point for the next() search); for single-node * iterators it may instead be initialized to point to that single node. */	TokenNameCOMMENT_JAVADOC	 Current iteration location. Usually this is the last location returned (starting point for the next() search); for single-node iterators it may instead be initialized to point to that single node. 
protected	TokenNameprotected	
int	TokenNameint	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
/** * Remembers the current node for the next call to gotoMark(). * * %REVIEW% Should this save _position too? */	TokenNameCOMMENT_JAVADOC	 Remembers the current node for the next call to gotoMark(). * %REVIEW% Should this save _position too? 
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_markedNode	TokenNameIdentifier	 marked Node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Restores the current node remembered by setMark(). * * %REVEIW% Should this restore _position too? */	TokenNameCOMMENT_JAVADOC	 Restores the current node remembered by setMark(). * %REVEIW% Should this restore _position too? 
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of InternalAxisIteratorBase 	TokenNameCOMMENT_LINE	end of InternalAxisIteratorBase 
/** * Iterator that returns all immediate children of a given node */	TokenNameCOMMENT_JAVADOC	 Iterator that returns all immediate children of a given node 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ChildrenIterator	TokenNameIdentifier	 Children Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** * Setting start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * If the iterator is not restartable, this has no effect. * %REVIEW% Should it return/throw something in that case, * or set current node to END, to indicate request-not-honored? * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Setting start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * If the iterator is not restartable, this has no effect. %REVIEW% Should it return/throw something in that case, or set current node to END, to indicate request-not-honored? * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END if no more * are available. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END if no more are available. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of ChildrenIterator 	TokenNameCOMMENT_LINE	end of ChildrenIterator 
/** * Iterator that returns the parent of a given node. Note that * this delivers only a single node; if you want all the ancestors, * see AncestorIterator. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns the parent of a given node. Note that this delivers only a single node; if you want all the ancestors, see AncestorIterator. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ParentIterator	TokenNameIdentifier	 Parent Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the node type of the parent that we're looking for. * Note that this does _not_ mean "find the nearest ancestor of * this type", but "yield the parent if it is of this type". * * * @param type extended type ID. * * @return ParentIterator configured with the type filter set. */	TokenNameCOMMENT_JAVADOC	 Set the node type of the parent that we're looking for. Note that this does _not_ mean "find the nearest ancestor of this type", but "yield the parent if it is of this type". * @param type extended type ID. * @return ParentIterator configured with the type filter set. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setNodeType	TokenNameIdentifier	 set Node Type
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. In this case, we return * only the immediate parent, _if_ it matches the requested nodeType. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. In this case, we return only the immediate parent, _if_ it matches the requested nodeType. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_nodeType	TokenNameIdentifier	 node Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of ParentIterator 	TokenNameCOMMENT_LINE	end of ParentIterator 
/** * Iterator that returns children of a given type for a given node. * The functionality chould be achieved by putting a filter on top * of a basic child iterator, but a specialised iterator is used * for efficiency (both speed and size of translet). */	TokenNameCOMMENT_JAVADOC	 Iterator that returns children of a given type for a given node. The functionality chould be achieved by putting a filter on top of a basic child iterator, but a specialised iterator is used for efficiency (both speed and size of translet). 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedChildrenIterator	TokenNameIdentifier	 Typed Children Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedChildrenIterator * * * @param nodeType The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedChildrenIterator * @param nodeType The extended type ID being requested. 
public	TokenNamepublic	
TypedChildrenIterator	TokenNameIdentifier	 Typed Children Iterator
(	TokenNameLPAREN	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedChildrenIterator 	TokenNameCOMMENT_LINE	end of TypedChildrenIterator 
/** * Iterator that returns children within a given namespace for a * given node. The functionality chould be achieved by putting a * filter on top of a basic child iterator, but a specialised * iterator is used for efficiency (both speed and size of translet). */	TokenNameCOMMENT_JAVADOC	 Iterator that returns children within a given namespace for a given node. The functionality chould be achieved by putting a filter on top of a basic child iterator, but a specialised iterator is used for efficiency (both speed and size of translet). 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NamespaceChildrenIterator	TokenNameIdentifier	 Namespace Children Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID being requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nsType	TokenNameIdentifier	 ns Type
;	TokenNameSEMICOLON	
/** * Constructor NamespaceChildrenIterator * * * @param type The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor NamespaceChildrenIterator * @param type The extended type ID being requested. 
public	TokenNamepublic	
NamespaceChildrenIterator	TokenNameIdentifier	 Namespace Children Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nsType	TokenNameIdentifier	 ns Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NOTPROCESSED	TokenNameIdentifier	 NOTPROCESSED
==	TokenNameEQUAL_EQUAL	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
?	TokenNameQUESTION	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getNamespaceID	TokenNameIdentifier	 get Namespace ID
(	TokenNameLPAREN	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_nsType	TokenNameIdentifier	 ns Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of NamespaceChildrenIterator 	TokenNameCOMMENT_LINE	end of NamespaceChildrenIterator 
/** * Iterator that returns the namespace nodes as defined by the XPath data model * for a given node. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns the namespace nodes as defined by the XPath data model for a given node. 
public	TokenNamepublic	
class	TokenNameclass	
NamespaceIterator	TokenNameIdentifier	 Namespace Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** * Constructor NamespaceAttributeIterator */	TokenNameCOMMENT_JAVADOC	 Constructor NamespaceAttributeIterator 
public	TokenNamepublic	
NamespaceIterator	TokenNameIdentifier	 Namespace Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of NamespaceIterator 	TokenNameCOMMENT_LINE	end of NamespaceIterator 
/** * Iterator that returns the namespace nodes as defined by the XPath data model * for a given node, filtered by extended type ID. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns the namespace nodes as defined by the XPath data model for a given node, filtered by extended type ID. 
public	TokenNamepublic	
class	TokenNameclass	
TypedNamespaceIterator	TokenNameIdentifier	 Typed Namespace Iterator
extends	TokenNameextends	
NamespaceIterator	TokenNameIdentifier	 Namespace Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedNamespaceIterator * * * @param nodeType The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedNamespaceIterator * @param nodeType The extended type ID being requested. 
public	TokenNamepublic	
TypedNamespaceIterator	TokenNameIdentifier	 Typed Namespace Iterator
(	TokenNameLPAREN	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
||	TokenNameOR_OR	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
||	TokenNameOR_OR	
getNamespaceType	TokenNameIdentifier	 get Namespace Type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedNamespaceIterator 	TokenNameCOMMENT_LINE	end of TypedNamespaceIterator 
/** * Iterator that returns the the root node as defined by the XPath data model * for a given node. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns the the root node as defined by the XPath data model for a given node. 
public	TokenNamepublic	
class	TokenNameclass	
RootIterator	TokenNameIdentifier	 Root Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** * Constructor RootIterator */	TokenNameCOMMENT_JAVADOC	 Constructor RootIterator 
public	TokenNamepublic	
RootIterator	TokenNameIdentifier	 Root Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
getDocumentRoot	TokenNameIdentifier	 get Document Root
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of RootIterator 	TokenNameCOMMENT_LINE	end of RootIterator 
/** * Iterator that returns the namespace nodes as defined by the XPath data model * for a given node, filtered by extended type ID. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns the namespace nodes as defined by the XPath data model for a given node, filtered by extended type ID. 
public	TokenNamepublic	
class	TokenNameclass	
TypedRootIterator	TokenNameIdentifier	 Typed Root Iterator
extends	TokenNameextends	
RootIterator	TokenNameIdentifier	 Root Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedRootIterator * * @param nodeType The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedRootIterator * @param nodeType The extended type ID being requested. 
public	TokenNamepublic	
TypedRootIterator	TokenNameIdentifier	 Typed Root Iterator
(	TokenNameLPAREN	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedRootIterator 	TokenNameCOMMENT_LINE	end of TypedRootIterator 
/** * Iterator that returns attributes within a given namespace for a node. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns attributes within a given namespace for a node. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NamespaceAttributeIterator	TokenNameIdentifier	 Namespace Attribute Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID being requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nsType	TokenNameIdentifier	 ns Type
;	TokenNameSEMICOLON	
/** * Constructor NamespaceAttributeIterator * * * @param nsType The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor NamespaceAttributeIterator * @param nsType The extended type ID being requested. 
public	TokenNamepublic	
NamespaceAttributeIterator	TokenNameIdentifier	 Namespace Attribute Iterator
(	TokenNameLPAREN	
int	TokenNameint	
nsType	TokenNameIdentifier	 ns Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_nsType	TokenNameIdentifier	 ns Type
=	TokenNameEQUAL	
nsType	TokenNameIdentifier	 ns Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of NamespaceAttributeIterator 	TokenNameCOMMENT_LINE	end of NamespaceAttributeIterator 
/** * Iterator that returns all siblings of a given node. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns all siblings of a given node. 
public	TokenNamepublic	
class	TokenNameclass	
FollowingSiblingIterator	TokenNameIdentifier	 Following Sibling Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of FollowingSiblingIterator 	TokenNameCOMMENT_LINE	end of FollowingSiblingIterator 
/** * Iterator that returns all following siblings of a given node. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns all following siblings of a given node. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedFollowingSiblingIterator	TokenNameIdentifier	 Typed Following Sibling Iterator
extends	TokenNameextends	
FollowingSiblingIterator	TokenNameIdentifier	 Following Sibling Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedFollowingSiblingIterator * * * @param type The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedFollowingSiblingIterator * @param type The extended type ID being requested. 
public	TokenNamepublic	
TypedFollowingSiblingIterator	TokenNameIdentifier	 Typed Following Sibling Iterator
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedFollowingSiblingIterator 	TokenNameCOMMENT_LINE	end of TypedFollowingSiblingIterator 
/** * Iterator that returns attribute nodes (of what nodes?) */	TokenNameCOMMENT_JAVADOC	 Iterator that returns attribute nodes (of what nodes?) 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
AttributeIterator	TokenNameIdentifier	 Attribute Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
// assumes caller will pass element nodes 	TokenNameCOMMENT_LINE	assumes caller will pass element nodes 
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getFirstAttributeIdentity	TokenNameIdentifier	 get First Attribute Identity
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getNextAttributeIdentity	TokenNameIdentifier	 get Next Attribute Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of AttributeIterator 	TokenNameCOMMENT_LINE	end of AttributeIterator 
/** * Iterator that returns attribute nodes of a given type */	TokenNameCOMMENT_JAVADOC	 Iterator that returns attribute nodes of a given type 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedAttributeIterator	TokenNameIdentifier	 Typed Attribute Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedAttributeIterator * * * @param nodeType The extended type ID that is requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedAttributeIterator * @param nodeType The extended type ID that is requested. 
public	TokenNamepublic	
TypedAttributeIterator	TokenNameIdentifier	 Typed Attribute Iterator
(	TokenNameLPAREN	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assumes caller will pass element nodes 	TokenNameCOMMENT_LINE	assumes caller will pass element nodes 
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
getTypedAttribute	TokenNameIdentifier	 get Typed Attribute
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
_nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
// singleton iterator, since there can only be one attribute of 	TokenNameCOMMENT_LINE	singleton iterator, since there can only be one attribute of 
// a given type. 	TokenNameCOMMENT_LINE	a given type. 
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedAttributeIterator 	TokenNameCOMMENT_LINE	end of TypedAttributeIterator 
/** * Iterator that returns preceding siblings of a given node */	TokenNameCOMMENT_JAVADOC	 Iterator that returns preceding siblings of a given node 
public	TokenNamepublic	
class	TokenNameclass	
PrecedingSiblingIterator	TokenNameIdentifier	 Preceding Sibling Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** * The node identity of _startNode for this iterator */	TokenNameCOMMENT_JAVADOC	 The node identity of _startNode for this iterator 
protected	TokenNameprotected	
int	TokenNameint	
_startNodeID	TokenNameIdentifier	 start Node ID
;	TokenNameSEMICOLON	
/** * True if this iterator has a reversed axis. * * @return true. */	TokenNameCOMMENT_JAVADOC	 True if this iterator has a reversed axis. * @return true. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_startNodeID	TokenNameIdentifier	 start Node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
.	TokenNameDOT	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Be careful to handle the Document node properly 	TokenNameCOMMENT_LINE	Be careful to handle the Document node properly 
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
_startNodeID	TokenNameIdentifier	 start Node ID
||	TokenNameOR_OR	
_currentNode	TokenNameIdentifier	 current Node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of PrecedingSiblingIterator 	TokenNameCOMMENT_LINE	end of PrecedingSiblingIterator 
/** * Iterator that returns preceding siblings of a given type for * a given node */	TokenNameCOMMENT_JAVADOC	 Iterator that returns preceding siblings of a given type for a given node 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedPrecedingSiblingIterator	TokenNameIdentifier	 Typed Preceding Sibling Iterator
extends	TokenNameextends	
PrecedingSiblingIterator	TokenNameIdentifier	 Preceding Sibling Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedPrecedingSiblingIterator * * * @param type The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedPrecedingSiblingIterator * @param type The extended type ID being requested. 
public	TokenNamepublic	
TypedPrecedingSiblingIterator	TokenNameIdentifier	 Typed Preceding Sibling Iterator
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
int	TokenNameint	
startID	TokenNameIdentifier	 start ID
=	TokenNameEQUAL	
_startNodeID	TokenNameIdentifier	 start Node ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
startID	TokenNameIdentifier	 start ID
&&	TokenNameAND_AND	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
startID	TokenNameIdentifier	 start ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
||	TokenNameOR_OR	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
_startNodeID	TokenNameIdentifier	 start Node ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedPrecedingSiblingIterator 	TokenNameCOMMENT_LINE	end of TypedPrecedingSiblingIterator 
/** * Iterator that returns preceding nodes of a given node. * This includes the node set {root+1, start-1}, but excludes * all ancestors, attributes, and namespace nodes. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns preceding nodes of a given node. This includes the node set {root+1, start-1}, but excludes all ancestors, attributes, and namespace nodes. 
public	TokenNamepublic	
class	TokenNameclass	
PrecedingIterator	TokenNameIdentifier	 Preceding Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** The max ancestors, but it can grow... */	TokenNameCOMMENT_JAVADOC	 The max ancestors, but it can grow... 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_maxAncestors	TokenNameIdentifier	 max Ancestors
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The stack of start node + ancestors up to the root of the tree, * which we must avoid. */	TokenNameCOMMENT_JAVADOC	 The stack of start node + ancestors up to the root of the tree, which we must avoid. 
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
_maxAncestors	TokenNameIdentifier	 max Ancestors
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** (not sure yet... -sb) */	TokenNameCOMMENT_JAVADOC	 (not sure yet... -sb) 
protected	TokenNameprotected	
int	TokenNameint	
_sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
_oldsp	TokenNameIdentifier	 oldsp
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_markedsp	TokenNameIdentifier	 markedsp
,	TokenNameCOMMA	
_markedNode	TokenNameIdentifier	 marked Node
,	TokenNameCOMMA	
_markedDescendant	TokenNameIdentifier	 marked Descendant
;	TokenNameSEMICOLON	
/* _currentNode precedes candidates. This is the identity, not the handle! */	TokenNameCOMMENT_BLOCK	 _currentNode precedes candidates. This is the identity, not the handle! 
/** * True if this iterator has a reversed axis. * * @return true since this iterator is a reversed axis. */	TokenNameCOMMENT_JAVADOC	 True if this iterator has a reversed axis. * @return true since this iterator is a reversed axis. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a deep copy of this iterator. The cloned iterator is not reset. * * @return a deep copy of this iterator. */	TokenNameCOMMENT_JAVADOC	 Returns a deep copy of this iterator. The cloned iterator is not reset. * @return a deep copy of this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
PrecedingIterator	TokenNameIdentifier	 Preceding Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PrecedingIterator	TokenNameIdentifier	 Preceding Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stackCopy	TokenNameIdentifier	 stack Copy
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
_stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
_stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stackCopy	TokenNameIdentifier	 stack Copy
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
_stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
stackCopy	TokenNameIdentifier	 stack Copy
;	TokenNameSEMICOLON	
// return clone.reset(); 	TokenNameCOMMENT_LINE	return clone.reset(); 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ITERATOR_CLONE_NOT_SUPPORTED	TokenNameIdentifier	 ER  ITERATOR  CLONE  NOT  SUPPORTED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Iterator clone not supported."); 	TokenNameCOMMENT_LINE	"Iterator clone not supported."); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// iterator is not a clone 	TokenNameCOMMENT_LINE	iterator is not a clone 
int	TokenNameint	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_stack	TokenNameIdentifier	 stack
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
_stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
_stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stack	TokenNameIdentifier	 stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
stack	TokenNameIdentifier	 stack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_stack	TokenNameIdentifier	 stack
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// Pop actual root node (if not start) back off the stack 	TokenNameCOMMENT_LINE	Pop actual root node (if not start) back off the stack 
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_stack	TokenNameIdentifier	 stack
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Last parent before root node 	TokenNameCOMMENT_LINE	Last parent before root node 
_oldsp	TokenNameIdentifier	 oldsp
=	TokenNameEQUAL	
_sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Bugzilla 8324: We were forgetting to skip Attrs and NS nodes. 	TokenNameCOMMENT_LINE	Bugzilla 8324: We were forgetting to skip Attrs and NS nodes. 
// Also recoded the loop controls for clarity and to flatten out 	TokenNameCOMMENT_LINE	Also recoded the loop controls for clarity and to flatten out 
// the tail-recursion. 	TokenNameCOMMENT_LINE	the tail-recursion. 
for	TokenNamefor	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
_sp	TokenNameIdentifier	 sp
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
<	TokenNameLESS	
_stack	TokenNameIdentifier	 stack
[	TokenNameLBRACKET	
_sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
&&	TokenNameAND_AND	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
--	TokenNameMINUS_MINUS	
_sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// redefine DTMAxisIteratorBase's reset 	TokenNameCOMMENT_LINE	redefine DTMAxisIteratorBase's reset 
/** * Resets the iterator to the last start node. * * @return A DTMAxisIterator, which may or may not be the same as this * iterator. */	TokenNameCOMMENT_JAVADOC	 Resets the iterator to the last start node. * @return A DTMAxisIterator, which may or may not be the same as this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
_oldsp	TokenNameIdentifier	 oldsp
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_markedsp	TokenNameIdentifier	 markedsp
=	TokenNameEQUAL	
_sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
_markedNode	TokenNameIdentifier	 marked Node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
_markedDescendant	TokenNameIdentifier	 marked Descendant
=	TokenNameEQUAL	
_stack	TokenNameIdentifier	 stack
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
_markedsp	TokenNameIdentifier	 markedsp
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_markedNode	TokenNameIdentifier	 marked Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of PrecedingIterator 	TokenNameCOMMENT_LINE	end of PrecedingIterator 
/** * Iterator that returns preceding nodes of agiven type for a * given node. This includes the node set {root+1, start-1}, but * excludes all ancestors. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns preceding nodes of agiven type for a given node. This includes the node set {root+1, start-1}, but excludes all ancestors. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedPrecedingIterator	TokenNameIdentifier	 Typed Preceding Iterator
extends	TokenNameextends	
PrecedingIterator	TokenNameIdentifier	 Preceding Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedPrecedingIterator * * * @param type The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedPrecedingIterator * @param type The extended type ID being requested. 
public	TokenNamepublic	
TypedPrecedingIterator	TokenNameIdentifier	 Typed Preceding Iterator
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
>=	TokenNameGREATER_EQUAL	
_stack	TokenNameIdentifier	 stack
[	TokenNameLBRACKET	
_sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
_sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
>=	TokenNameGREATER_EQUAL	
_stack	TokenNameIdentifier	 stack
[	TokenNameLBRACKET	
_sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
_sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedPrecedingIterator 	TokenNameCOMMENT_LINE	end of TypedPrecedingIterator 
/** * Iterator that returns following nodes of for a given node. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns following nodes of for a given node. 
public	TokenNamepublic	
class	TokenNameclass	
FollowingIterator	TokenNameIdentifier	 Following Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
m_traverser	TokenNameIdentifier	 m traverser
;	TokenNameSEMICOLON	
// easier for now 	TokenNameCOMMENT_LINE	easier for now 
public	TokenNamepublic	
FollowingIterator	TokenNameIdentifier	 Following Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_traverser	TokenNameIdentifier	 m traverser
=	TokenNameEQUAL	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
FOLLOWING	TokenNameIdentifier	 FOLLOWING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// ?? -sb 	TokenNameCOMMENT_LINE	?? -sb 
// find rightmost descendant (or self) 	TokenNameCOMMENT_LINE	find rightmost descendant (or self) 
// int current; 	TokenNameCOMMENT_LINE	int current; 
// while ((node = getLastChild(current = node)) != NULL){} 	TokenNameCOMMENT_LINE	while ((node = getLastChild(current = node)) != NULL){} 
// _currentNode = current; 	TokenNameCOMMENT_LINE	_currentNode = current; 
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// _currentNode precedes possible following(node) nodes 	TokenNameCOMMENT_LINE	_currentNode precedes possible following(node) nodes 
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of FollowingIterator 	TokenNameCOMMENT_LINE	end of FollowingIterator 
/** * Iterator that returns following nodes of a given type for a given node. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns following nodes of a given type for a given node. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedFollowingIterator	TokenNameIdentifier	 Typed Following Iterator
extends	TokenNameextends	
FollowingIterator	TokenNameIdentifier	 Following Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedFollowingIterator * * * @param type The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedFollowingIterator * @param type The extended type ID being requested. 
public	TokenNamepublic	
TypedFollowingIterator	TokenNameIdentifier	 Typed Following Iterator
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
m_traverser	TokenNameIdentifier	 m traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
,	TokenNameCOMMA	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
&&	TokenNameAND_AND	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
?	TokenNameQUESTION	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
:	TokenNameCOLON	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedFollowingIterator 	TokenNameCOMMENT_LINE	end of TypedFollowingIterator 
/** * Iterator that returns the ancestors of a given node in document * order. (NOTE! This was changed from the XSLTC code!) */	TokenNameCOMMENT_JAVADOC	 Iterator that returns the ancestors of a given node in document order. (NOTE! This was changed from the XSLTC code!) 
public	TokenNamepublic	
class	TokenNameclass	
AncestorIterator	TokenNameIdentifier	 Ancestor Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
NodeVector	TokenNameIdentifier	 Node Vector
m_ancestors	TokenNameIdentifier	 m ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
NodeVector	TokenNameIdentifier	 Node Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
;	TokenNameSEMICOLON	
int	TokenNameint	
m_markedPos	TokenNameIdentifier	 m marked Pos
;	TokenNameSEMICOLON	
/** The real start node for this axes, since _startNode will be adjusted. */	TokenNameCOMMENT_JAVADOC	 The real start node for this axes, since _startNode will be adjusted. 
int	TokenNameint	
m_realStartNode	TokenNameIdentifier	 m real Start Node
;	TokenNameSEMICOLON	
/** * Get start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @return The root node of the iteration. */	TokenNameCOMMENT_JAVADOC	 Get start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @return The root node of the iteration. 
public	TokenNamepublic	
int	TokenNameint	
getStartNode	TokenNameIdentifier	 get Start Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_realStartNode	TokenNameIdentifier	 m real Start Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * True if this iterator has a reversed axis. * * @return true since this iterator is a reversed axis. */	TokenNameCOMMENT_JAVADOC	 True if this iterator has a reversed axis. * @return true since this iterator is a reversed axis. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isReverse	TokenNameIdentifier	 is Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a deep copy of this iterator. The cloned iterator is not reset. * * @return a deep copy of this iterator. */	TokenNameCOMMENT_JAVADOC	 Returns a deep copy of this iterator. The cloned iterator is not reset. * @return a deep copy of this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
cloneIterator	TokenNameIdentifier	 clone Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// must set to false for any clone 	TokenNameCOMMENT_LINE	must set to false for any clone 
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
AncestorIterator	TokenNameIdentifier	 Ancestor Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AncestorIterator	TokenNameIdentifier	 Ancestor Iterator
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
// return clone.reset(); 	TokenNameCOMMENT_LINE	return clone.reset(); 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMException	TokenNameIdentifier	 DTM Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_ITERATOR_CLONE_NOT_SUPPORTED	TokenNameIdentifier	 ER  ITERATOR  CLONE  NOT  SUPPORTED
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Iterator clone not supported."); 	TokenNameCOMMENT_LINE	"Iterator clone not supported."); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_realStartNode	TokenNameIdentifier	 m real Start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_includeSelf	TokenNameIdentifier	 include Self
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
=	TokenNameEQUAL	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
)	TokenNameRPAREN	
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the iterator to the last start node. * * @return A DTMAxisIterator, which may or may not be the same as this * iterator. */	TokenNameCOMMENT_JAVADOC	 Resets the iterator to the last start node. * @return A DTMAxisIterator, which may or may not be the same as this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
=	TokenNameEQUAL	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
)	TokenNameRPAREN	
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
--	TokenNameMINUS_MINUS	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
)	TokenNameRPAREN	
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_markedPos	TokenNameIdentifier	 m marked Pos
=	TokenNameEQUAL	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
=	TokenNameEQUAL	
m_markedPos	TokenNameIdentifier	 m marked Pos
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
)	TokenNameRPAREN	
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of AncestorIterator 	TokenNameCOMMENT_LINE	end of AncestorIterator 
/** * Typed iterator that returns the ancestors of a given node. */	TokenNameCOMMENT_JAVADOC	 Typed iterator that returns the ancestors of a given node. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedAncestorIterator	TokenNameIdentifier	 Typed Ancestor Iterator
extends	TokenNameextends	
AncestorIterator	TokenNameIdentifier	 Ancestor Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedAncestorIterator * * * @param type The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedAncestorIterator * @param type The extended type ID being requested. 
public	TokenNamepublic	
TypedAncestorIterator	TokenNameIdentifier	 Typed Ancestor Iterator
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_realStartNode	TokenNameIdentifier	 m real Start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_includeSelf	TokenNameIdentifier	 include Self
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
&&	TokenNameAND_AND	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
&&	TokenNameAND_AND	
eType	TokenNameIdentifier	 e Type
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
=	TokenNameEQUAL	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
)	TokenNameRPAREN	
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedAncestorIterator 	TokenNameCOMMENT_LINE	end of TypedAncestorIterator 
/** * Iterator that returns the descendants of a given node. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns the descendants of a given node. 
public	TokenNamepublic	
class	TokenNameclass	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_includeSelf	TokenNameIdentifier	 include Self
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this node identity is a descendant. Assumes that * the node info for the element has already been obtained. * * This one-sided test works only if the parent has been * previously tested and is known to be a descendent. It fails if * the parent is the _startNode's next sibling, or indeed any node * that follows _startNode in document order. That may suffice * for this iterator, but it's not really an isDescendent() test. * %REVIEW% rename? * * @param identity The index number of the node in question. * @return true if the index is a descendant of _startNode. */	TokenNameCOMMENT_JAVADOC	 Tell if this node identity is a descendant. Assumes that the node info for the element has already been obtained. * This one-sided test works only if the parent has been previously tested and is known to be a descendent. It fails if the parent is the _startNode's next sibling, or indeed any node that follows _startNode in document order. That may suffice for this iterator, but it's not really an isDescendent() test. %REVIEW% rename? * @param identity The index number of the node in question. @return true if the index is a descendant of _startNode. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isDescendant	TokenNameIdentifier	 is Descendant
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_includeSelf	TokenNameIdentifier	 include Self
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// | m_dtmIdent); 	TokenNameCOMMENT_LINE	| m_dtmIdent); 
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
!	TokenNameNOT	
isDescendant	TokenNameIdentifier	 is Descendant
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make handle. 	TokenNameCOMMENT_LINE	make handle. 
}	TokenNameRBRACE	
/** * Reset. * */	TokenNameCOMMENT_JAVADOC	 Reset. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_isRestartable	TokenNameIdentifier	 is Restartable
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of DescendantIterator 	TokenNameCOMMENT_LINE	end of DescendantIterator 
/** * Typed iterator that returns the descendants of a given node. */	TokenNameCOMMENT_JAVADOC	 Typed iterator that returns the descendants of a given node. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedDescendantIterator	TokenNameIdentifier	 Typed Descendant Iterator
extends	TokenNameextends	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedDescendantIterator * * * @param nodeType Extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedDescendantIterator * @param nodeType Extended type ID being requested. 
public	TokenNamepublic	
TypedDescendantIterator	TokenNameIdentifier	 Typed Descendant Iterator
(	TokenNameLPAREN	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
!	TokenNameNOT	
isDescendant	TokenNameIdentifier	 is Descendant
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
return	TokenNamereturn	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
&&	TokenNameAND_AND	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedDescendantIterator 	TokenNameCOMMENT_LINE	end of TypedDescendantIterator 
/** * Iterator that returns the descendants of a given node. * I'm not exactly clear about this one... -sb */	TokenNameCOMMENT_JAVADOC	 Iterator that returns the descendants of a given node. I'm not exactly clear about this one... -sb 
public	TokenNamepublic	
class	TokenNameclass	
NthDescendantIterator	TokenNameIdentifier	 Nth Descendant Iterator
extends	TokenNameextends	
DescendantIterator	TokenNameIdentifier	 Descendant Iterator
{	TokenNameLBRACE	
/** The current nth position. */	TokenNameCOMMENT_JAVADOC	 The current nth position. 
int	TokenNameint	
_pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
/** * Constructor NthDescendantIterator * * * @param pos The nth position being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor NthDescendantIterator * @param pos The nth position being requested. 
public	TokenNamepublic	
NthDescendantIterator	TokenNameIdentifier	 Nth Descendant Iterator
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// I'm not exactly clear yet what this is doing... -sb 	TokenNameCOMMENT_LINE	I'm not exactly clear yet what this is doing... -sb 
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
super	TokenNamesuper	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
_parent	TokenNameIdentifier	 parent
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
_firstch	TokenNameIdentifier	 firstch
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
<	TokenNameLESS	
_pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
_nextsib	TokenNameIdentifier	 nextsib
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of NthDescendantIterator 	TokenNameCOMMENT_LINE	end of NthDescendantIterator 
/** * Class SingletonIterator. */	TokenNameCOMMENT_JAVADOC	 Class SingletonIterator. 
public	TokenNamepublic	
class	TokenNameclass	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** (not sure yet what this is. -sb) (sc & sb remove final to compile in JDK 1.1.8) */	TokenNameCOMMENT_JAVADOC	 (not sure yet what this is. -sb) (sc & sb remove final to compile in JDK 1.1.8) 
private	TokenNameprivate	
boolean	TokenNameboolean	
_isConstant	TokenNameIdentifier	 is Constant
;	TokenNameSEMICOLON	
/** * Constructor SingletonIterator * */	TokenNameCOMMENT_JAVADOC	 Constructor SingletonIterator 
public	TokenNamepublic	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor SingletonIterator * * * @param node The node handle to return. */	TokenNameCOMMENT_JAVADOC	 Constructor SingletonIterator * @param node The node handle to return. 
public	TokenNamepublic	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor SingletonIterator * * * @param node the node handle to return. * @param constant (Not sure what this is yet. -sb) */	TokenNameCOMMENT_JAVADOC	 Constructor SingletonIterator * @param node the node handle to return. @param constant (Not sure what this is yet. -sb) 
public	TokenNamepublic	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
constant	TokenNameIdentifier	 constant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
_isConstant	TokenNameIdentifier	 is Constant
=	TokenNameEQUAL	
constant	TokenNameIdentifier	 constant
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Set start to END should 'close' the iterator, i.e. subsequent call to next() should return END. * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 	TokenNameCOMMENT_LINE	%HZ%: Added reference to DTMDefaultBase.ROOTNODE back in, temporarily 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_isConstant	TokenNameIdentifier	 is Constant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_isRestartable	TokenNameIdentifier	 is Restartable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets the iterator to the last start node. * * @return A DTMAxisIterator, which may or may not be the same as this * iterator. */	TokenNameCOMMENT_JAVADOC	 Resets the iterator to the last start node. * @return A DTMAxisIterator, which may or may not be the same as this iterator. 
public	TokenNamepublic	
DTMAxisIterator	TokenNameIdentifier	 DTM Axis Iterator
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_isConstant	TokenNameIdentifier	 is Constant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
temp	TokenNameIdentifier	 temp
=	TokenNameEQUAL	
_isRestartable	TokenNameIdentifier	 is Restartable
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
setStartNode	TokenNameIdentifier	 set Start Node
(	TokenNameLPAREN	
_startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_isRestartable	TokenNameIdentifier	 is Restartable
=	TokenNameEQUAL	
temp	TokenNameIdentifier	 temp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of SingletonIterator 	TokenNameCOMMENT_LINE	end of SingletonIterator 
/** * Iterator that returns a given node only if it is of a given type. */	TokenNameCOMMENT_JAVADOC	 Iterator that returns a given node only if it is of a given type. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TypedSingletonIterator	TokenNameIdentifier	 Typed Singleton Iterator
extends	TokenNameextends	
SingletonIterator	TokenNameIdentifier	 Singleton Iterator
{	TokenNameLBRACE	
/** The extended type ID that was requested. */	TokenNameCOMMENT_JAVADOC	 The extended type ID that was requested. 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
/** * Constructor TypedSingletonIterator * * * @param nodeType The extended type ID being requested. */	TokenNameCOMMENT_JAVADOC	 Constructor TypedSingletonIterator * @param nodeType The extended type ID being requested. 
public	TokenNamepublic	
TypedSingletonIterator	TokenNameIdentifier	 Typed Singleton Iterator
(	TokenNameLPAREN	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next node in the iteration. * * @return The next node handle in the iteration, or END. */	TokenNameCOMMENT_JAVADOC	 Get the next node in the iteration. * @return The next node handle in the iteration, or END. 
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//final int result = super.next(); 	TokenNameCOMMENT_LINE	final int result = super.next(); 
final	TokenNamefinal	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedSingletonIterator 	TokenNameCOMMENT_LINE	end of TypedSingletonIterator 
}	TokenNameRBRACE	
