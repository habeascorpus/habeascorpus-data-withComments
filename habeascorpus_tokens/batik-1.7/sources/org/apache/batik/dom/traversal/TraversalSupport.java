/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
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
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeFilter	TokenNameIdentifier	 Node Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
TreeWalker	TokenNameIdentifier	 Tree Walker
;	TokenNameSEMICOLON	
/** * This class provides support for traversal. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: TraversalSupport.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides support for traversal. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: TraversalSupport.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TraversalSupport	TokenNameIdentifier	 Traversal Support
{	TokenNameLBRACE	
/** * The iterators list. */	TokenNameCOMMENT_JAVADOC	 The iterators list. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
iterators	TokenNameIdentifier	 iterators
;	TokenNameSEMICOLON	
/** * Creates a new TraversalSupport. */	TokenNameCOMMENT_JAVADOC	 Creates a new TraversalSupport. 
public	TokenNamepublic	
TraversalSupport	TokenNameIdentifier	 Traversal Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new tree walker. */	TokenNameCOMMENT_JAVADOC	 Creates a new tree walker. 
public	TokenNamepublic	
static	TokenNamestatic	
TreeWalker	TokenNameIdentifier	 Tree Walker
createTreeWalker	TokenNameIdentifier	 create Tree Walker
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
NodeFilter	TokenNameIdentifier	 Node Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"null.root"	TokenNameStringLiteral	null.root
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DOMTreeWalker	TokenNameIdentifier	 DOM Tree Walker
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new node iterator. */	TokenNameCOMMENT_JAVADOC	 Creates a new node iterator. 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
createNodeIterator	TokenNameIdentifier	 create Node Iterator
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
NodeFilter	TokenNameIdentifier	 Node Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"null.root"	TokenNameStringLiteral	null.root
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
NodeIterator	TokenNameIdentifier	 Node Iterator
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
DOMNodeIterator	TokenNameIdentifier	 DOM Node Iterator
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iterators	TokenNameIdentifier	 iterators
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iterators	TokenNameIdentifier	 iterators
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iterators	TokenNameIdentifier	 iterators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called by the DOM when a node will be removed from the current document. */	TokenNameCOMMENT_JAVADOC	 Called by the DOM when a node will be removed from the current document. 
public	TokenNamepublic	
void	TokenNamevoid	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
removedNode	TokenNameIdentifier	 removed Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
iterators	TokenNameIdentifier	 iterators
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
iterators	TokenNameIdentifier	 iterators
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DOMNodeIterator	TokenNameIdentifier	 DOM Node Iterator
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
nodeToBeRemoved	TokenNameIdentifier	 node To Be Removed
(	TokenNameLPAREN	
removedNode	TokenNameIdentifier	 removed Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Detaches the given node iterator. */	TokenNameCOMMENT_JAVADOC	 Detaches the given node iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
detachNodeIterator	TokenNameIdentifier	 detach Node Iterator
(	TokenNameLPAREN	
NodeIterator	TokenNameIdentifier	 Node Iterator
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iterators	TokenNameIdentifier	 iterators
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
