/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NodeSequence.java 469367 2006-10-31 04:41:08Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NodeSequence.java 469367 2006-10-31 04:41:08Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
DTM	TokenNameIdentifier	 DTM
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
DTMFilter	TokenNameIdentifier	 DTM Filter
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
DTMIterator	TokenNameIdentifier	 DTM Iterator
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
DTMManager	TokenNameIdentifier	 DTM Manager
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
NodeVector	TokenNameIdentifier	 Node Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
/** * This class is the dynamic wrapper for a Xalan DTMIterator instance, and * provides random access capabilities. */	TokenNameCOMMENT_JAVADOC	 This class is the dynamic wrapper for a Xalan DTMIterator instance, and provides random access capabilities. 
public	TokenNamepublic	
class	TokenNameclass	
NodeSequence	TokenNameIdentifier	 Node Sequence
extends	TokenNameextends	
XObject	TokenNameIdentifier	 X Object
implements	TokenNameimplements	
DTMIterator	TokenNameIdentifier	 DTM Iterator
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
PathComponent	TokenNameIdentifier	 Path Component
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
3866261934726581044L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** The index of the last node in the iteration. */	TokenNameCOMMENT_JAVADOC	 The index of the last node in the iteration. 
protected	TokenNameprotected	
int	TokenNameint	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The index of the next node to be fetched. Useful if this * is a cached iterator, and is being used as random access * NodeList. */	TokenNameCOMMENT_JAVADOC	 The index of the next node to be fetched. Useful if this is a cached iterator, and is being used as random access NodeList. 
protected	TokenNameprotected	
int	TokenNameint	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * A cache of a list of nodes obtained from the iterator so far. * This list is appended to until the iterator is exhausted and * the cache is complete. * <p> * Multiple NodeSequence objects may share the same cache. */	TokenNameCOMMENT_JAVADOC	 A cache of a list of nodes obtained from the iterator so far. This list is appended to until the iterator is exhausted and the cache is complete. <p> Multiple NodeSequence objects may share the same cache. 
private	TokenNameprivate	
IteratorCache	TokenNameIdentifier	 Iterator Cache
m_cache	TokenNameIdentifier	 m cache
;	TokenNameSEMICOLON	
/** * If this iterator needs to cache nodes that are fetched, they * are stored in the Vector in the generic object. */	TokenNameCOMMENT_JAVADOC	 If this iterator needs to cache nodes that are fetched, they are stored in the Vector in the generic object. 
protected	TokenNameprotected	
NodeVector	TokenNameIdentifier	 Node Vector
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeVector	TokenNameIdentifier	 Node Vector
nv	TokenNameIdentifier	 nv
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_cache	TokenNameIdentifier	 m cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nv	TokenNameIdentifier	 nv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the cache (if any) of nodes obtained from * the iterator so far. Note that the cache keeps * growing until the iterator is walked to exhaustion, * at which point the cache is "complete". */	TokenNameCOMMENT_JAVADOC	 Get the cache (if any) of nodes obtained from the iterator so far. Note that the cache keeps growing until the iterator is walked to exhaustion, at which point the cache is "complete". 
private	TokenNameprivate	
IteratorCache	TokenNameIdentifier	 Iterator Cache
getCache	TokenNameIdentifier	 get Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_cache	TokenNameIdentifier	 m cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the vector where nodes will be cached. */	TokenNameCOMMENT_JAVADOC	 Set the vector where nodes will be cached. 
protected	TokenNameprotected	
void	TokenNamevoid	
SetVector	TokenNameIdentifier	 Set Vector
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If the iterator needs to cache nodes as they are fetched, * then this method returns true. */	TokenNameCOMMENT_JAVADOC	 If the iterator needs to cache nodes as they are fetched, then this method returns true. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
NodeVector	TokenNameIdentifier	 Node Vector
nv	TokenNameIdentifier	 nv
=	TokenNameEQUAL	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
nv	TokenNameIdentifier	 nv
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this NodeSequence has a cache, and that cache is * fully populated then this method returns true, otherwise * if there is no cache or it is not complete it returns false. */	TokenNameCOMMENT_JAVADOC	 If this NodeSequence has a cache, and that cache is fully populated then this method returns true, otherwise if there is no cache or it is not complete it returns false. 
private	TokenNameprivate	
boolean	TokenNameboolean	
cacheComplete	TokenNameIdentifier	 cache Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_cache	TokenNameIdentifier	 m cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
complete	TokenNameIdentifier	 complete
=	TokenNameEQUAL	
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
isComplete	TokenNameIdentifier	 is Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
complete	TokenNameIdentifier	 complete
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
complete	TokenNameIdentifier	 complete
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this NodeSequence has a cache, mark that it is complete. * This method should be called after the iterator is exhausted. */	TokenNameCOMMENT_JAVADOC	 If this NodeSequence has a cache, mark that it is complete. This method should be called after the iterator is exhausted. 
private	TokenNameprivate	
void	TokenNamevoid	
markCacheComplete	TokenNameIdentifier	 mark Cache Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeVector	TokenNameIdentifier	 Node Vector
nv	TokenNameIdentifier	 nv
=	TokenNameEQUAL	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nv	TokenNameIdentifier	 nv
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
setCacheComplete	TokenNameIdentifier	 set Cache Complete
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The functional iterator that fetches nodes. */	TokenNameCOMMENT_JAVADOC	 The functional iterator that fetches nodes. 
protected	TokenNameprotected	
DTMIterator	TokenNameIdentifier	 DTM Iterator
m_iter	TokenNameIdentifier	 m iter
;	TokenNameSEMICOLON	
/** * Set the functional iterator that fetches nodes. * @param iter The iterator that is to be contained. */	TokenNameCOMMENT_JAVADOC	 Set the functional iterator that fetches nodes. @param iter The iterator that is to be contained. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setIter	TokenNameIdentifier	 set Iter
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_iter	TokenNameIdentifier	 m iter
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the functional iterator that fetches nodes. * @return The contained iterator. */	TokenNameCOMMENT_JAVADOC	 Get the functional iterator that fetches nodes. @return The contained iterator. 
public	TokenNamepublic	
final	TokenNamefinal	
DTMIterator	TokenNameIdentifier	 DTM Iterator
getContainedIter	TokenNameIdentifier	 get Contained Iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_iter	TokenNameIdentifier	 m iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The DTMManager to use if we're using a NodeVector only. * We may well want to do away with this, and store it in the NodeVector. */	TokenNameCOMMENT_JAVADOC	 The DTMManager to use if we're using a NodeVector only. We may well want to do away with this, and store it in the NodeVector. 
protected	TokenNameprotected	
DTMManager	TokenNameIdentifier	 DTM Manager
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
;	TokenNameSEMICOLON	
// ==== Constructors ==== 	TokenNameCOMMENT_LINE	==== Constructors ==== 
/** * Create a new NodeSequence from a (already cloned) iterator. * * @param iter Cloned (not static) DTMIterator. * @param context The initial context node. * @param xctxt The execution context. * @param shouldCacheNodes True if this sequence can random access. */	TokenNameCOMMENT_JAVADOC	 Create a new NodeSequence from a (already cloned) iterator. * @param iter Cloned (not static) DTMIterator. @param context The initial context node. @param xctxt The execution context. @param shouldCacheNodes True if this sequence can random access. 
private	TokenNameprivate	
NodeSequence	TokenNameIdentifier	 Node Sequence
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldCacheNodes	TokenNameIdentifier	 should Cache Nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIter	TokenNameIdentifier	 set Iter
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
shouldCacheNodes	TokenNameIdentifier	 should Cache Nodes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new NodeSequence from a (already cloned) iterator. * * @param nodeVector */	TokenNameCOMMENT_JAVADOC	 Create a new NodeSequence from a (already cloned) iterator. * @param nodeVector 
public	TokenNamepublic	
NodeSequence	TokenNameIdentifier	 Node Sequence
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
nodeVector	TokenNameIdentifier	 node Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
nodeVector	TokenNameIdentifier	 node Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeVector	TokenNameIdentifier	 node Vector
instanceof	TokenNameinstanceof	
NodeVector	TokenNameIdentifier	 Node Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SetVector	TokenNameIdentifier	 Set Vector
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
)	TokenNameRPAREN	
nodeVector	TokenNameIdentifier	 node Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
nodeVector	TokenNameIdentifier	 node Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
nodeVector	TokenNameIdentifier	 node Vector
instanceof	TokenNameinstanceof	
NodeVector	TokenNameIdentifier	 Node Vector
,	TokenNameCOMMA	
"Must have a NodeVector as the object for NodeSequence!"	TokenNameStringLiteral	Must have a NodeVector as the object for NodeSequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeVector	TokenNameIdentifier	 node Vector
instanceof	TokenNameinstanceof	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setIter	TokenNameIdentifier	 set Iter
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
nodeVector	TokenNameIdentifier	 node Vector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
nodeVector	TokenNameIdentifier	 node Vector
)	TokenNameRPAREN	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct an empty XNodeSet object. This is used to create a mutable * nodeset to which random nodes may be added. */	TokenNameCOMMENT_JAVADOC	 Construct an empty XNodeSet object. This is used to create a mutable nodeset to which random nodes may be added. 
private	TokenNameprivate	
NodeSequence	TokenNameIdentifier	 Node Sequence
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
dtmMgr	TokenNameIdentifier	 dtm Mgr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
NodeVector	TokenNameIdentifier	 Node Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
=	TokenNameEQUAL	
dtmMgr	TokenNameIdentifier	 dtm Mgr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new NodeSequence in an invalid (null) state. */	TokenNameCOMMENT_JAVADOC	 Create a new NodeSequence in an invalid (null) state. 
public	TokenNamepublic	
NodeSequence	TokenNameIdentifier	 Node Sequence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#getDTM(int) */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getDTM(int) 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMManager	TokenNameIdentifier	 DTM Manager
mgr	TokenNameIdentifier	 mgr
=	TokenNameEQUAL	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
mgr	TokenNameIdentifier	 mgr
)	TokenNameRPAREN	
return	TokenNamereturn	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"Can not get a DTM Unless a DTMManager has been set!"	TokenNameStringLiteral	Can not get a DTM Unless a DTMManager has been set!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see DTMIterator#getDTMManager() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getDTMManager() 
public	TokenNamepublic	
DTMManager	TokenNameIdentifier	 DTM Manager
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#getRoot() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getRoot() 
public	TokenNamepublic	
int	TokenNameint	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
return	TokenNamereturn	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// NodeSetDTM will call this, and so it's not a good thing to throw 	TokenNameCOMMENT_LINE	NodeSetDTM will call this, and so it's not a good thing to throw 
// an assertion here. 	TokenNameCOMMENT_LINE	an assertion here. 
// assertion(false, "Can not get the root from a non-iterated NodeSequence!"); 	TokenNameCOMMENT_LINE	assertion(false, "Can not get the root from a non-iterated NodeSequence!"); 
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see DTMIterator#setRoot(int, Object) */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#setRoot(int, Object) 
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
)	TokenNameRPAREN	
environment	TokenNameIdentifier	 environment
;	TokenNameSEMICOLON	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"Can not setRoot on a non-iterated NodeSequence!"	TokenNameStringLiteral	Can not setRoot on a non-iterated NodeSequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#reset() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#reset() 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// not resetting the iterator on purpose!!! 	TokenNameCOMMENT_LINE	not resetting the iterator on purpose!!! 
}	TokenNameRBRACE	
/** * @see DTMIterator#getWhatToShow() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getWhatToShow() 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
&	TokenNameAND	
~	TokenNameTWIDDLE	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ENTITY_REFERENCE	TokenNameIdentifier	 SHOW  ENTITY  REFERENCE
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#getExpandEntityReferences() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getExpandEntityReferences() 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
return	TokenNamereturn	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#nextNode() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#nextNode() 
public	TokenNamepublic	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the cache is on, and the node has already been found, then 	TokenNameCOMMENT_LINE	If the cache is on, and the node has already been found, then 
// just return from the list. 	TokenNameCOMMENT_LINE	just return from the list. 
NodeVector	TokenNameIdentifier	 Node Vector
vec	TokenNameIdentifier	 vec
=	TokenNameEQUAL	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
vec	TokenNameIdentifier	 vec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// There is a cache 	TokenNameCOMMENT_LINE	There is a cache 
if	TokenNameif	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
<	TokenNameLESS	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The node is in the cache, so just return it. 	TokenNameCOMMENT_LINE	The node is in the cache, so just return it. 
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cacheComplete	TokenNameIdentifier	 cache Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
m_last	TokenNameIdentifier	 m last
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
insertIndex	TokenNameIdentifier	 insert Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_next	TokenNameIdentifier	 m next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
m_next	TokenNameIdentifier	 m next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We have exhausted the iterator, and if there is a cache 	TokenNameCOMMENT_LINE	We have exhausted the iterator, and if there is a cache 
// it must have all nodes in it by now, so let the cache 	TokenNameCOMMENT_LINE	it must have all nodes in it by now, so let the cache 
// know that it is complete. 	TokenNameCOMMENT_LINE	know that it is complete. 
markCacheComplete	TokenNameIdentifier	 mark Cache Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#previousNode() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#previousNode() 
public	TokenNamepublic	
int	TokenNameint	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see DTMIterator#detach() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#detach() 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calling this with a value of false will cause the nodeset * to be cached. * @see DTMIterator#allowDetachToRelease(boolean) */	TokenNameCOMMENT_JAVADOC	 Calling this with a value of false will cause the nodeset to be cached. @see DTMIterator#allowDetachToRelease(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
false	TokenNamefalse	
==	TokenNameEQUAL_EQUAL	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#getCurrentNode() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getCurrentNode() 
public	TokenNamepublic	
int	TokenNameint	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
m_next	TokenNameIdentifier	 m next
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
NodeVector	TokenNameIdentifier	 Node Vector
vec	TokenNameIdentifier	 vec
=	TokenNameEQUAL	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
<	TokenNameLESS	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#isFresh() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#isFresh() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFresh	TokenNameIdentifier	 is Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#setShouldCacheNodes(boolean) */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#setShouldCacheNodes(boolean) 
public	TokenNamepublic	
void	TokenNamevoid	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SetVector	TokenNameIdentifier	 Set Vector
(	TokenNameLPAREN	
new	TokenNamenew	
NodeVector	TokenNameIdentifier	 Node Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else 	TokenNameCOMMENT_LINE	else 
// getVector().RemoveAllNoClear(); // Is this good? 	TokenNameCOMMENT_LINE	getVector().RemoveAllNoClear(); // Is this good? 
}	TokenNameRBRACE	
else	TokenNameelse	
SetVector	TokenNameIdentifier	 Set Vector
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#isMutable() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#isMutable() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isMutable	TokenNameIdentifier	 is Mutable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// though may be surprising if it also has an iterator! 	TokenNameCOMMENT_LINE	though may be surprising if it also has an iterator! 
}	TokenNameRBRACE	
/** * @see DTMIterator#getCurrentPos() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getCurrentPos() 
public	TokenNamepublic	
int	TokenNameint	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#runTo(int) */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#runTo(int) 
public	TokenNamepublic	
void	TokenNamevoid	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
==	TokenNameEQUAL_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m_next	TokenNameIdentifier	 m next
<	TokenNameLESS	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
m_next	TokenNameIdentifier	 m next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
>=	TokenNameGREATER_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_next	TokenNameIdentifier	 m next
<	TokenNameLESS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see DTMIterator#setCurrentPos(int) */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#setCurrentPos(int) 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#item(int) */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#item(int) 
public	TokenNamepublic	
int	TokenNameint	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#setItem(int, int) */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#setItem(int, int) 
public	TokenNamepublic	
void	TokenNamevoid	
setItem	TokenNameIdentifier	 set Item
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NodeVector	TokenNameIdentifier	 Node Vector
vec	TokenNameIdentifier	 vec
=	TokenNameEQUAL	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
vec	TokenNameIdentifier	 vec
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oldNode	TokenNameIdentifier	 old Node
=	TokenNameEQUAL	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldNode	TokenNameIdentifier	 old Node
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
&&	TokenNameAND_AND	
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
useCount	TokenNameIdentifier	 use Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* If we are going to set the node at the given index * to a different value, and the cache is shared * (has a use count greater than 1) * then make a copy of the cache and use it * so we don't overwrite the value for other * users of the cache. */	TokenNameCOMMENT_BLOCK	 If we are going to set the node at the given index to a different value, and the cache is shared (has a use count greater than 1) then make a copy of the cache and use it so we don't overwrite the value for other users of the cache. 
IteratorCache	TokenNameIdentifier	 Iterator Cache
newCache	TokenNameIdentifier	 new Cache
=	TokenNameEQUAL	
new	TokenNamenew	
IteratorCache	TokenNameIdentifier	 Iterator Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
NodeVector	TokenNameIdentifier	 Node Vector
nv	TokenNameIdentifier	 nv
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
nv	TokenNameIdentifier	 nv
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
)	TokenNameRPAREN	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This should never happen 	TokenNameCOMMENT_LINE	This should never happen 
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RuntimeException	TokenNameIdentifier	 Runtime Exception
rte	TokenNameIdentifier	 rte
=	TokenNameEQUAL	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
rte	TokenNameIdentifier	 rte
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
newCache	TokenNameIdentifier	 new Cache
.	TokenNameDOT	
setVector	TokenNameIdentifier	 set Vector
(	TokenNameLPAREN	
nv	TokenNameIdentifier	 nv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newCache	TokenNameIdentifier	 new Cache
.	TokenNameDOT	
setCacheComplete	TokenNameIdentifier	 set Cache Complete
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_cache	TokenNameIdentifier	 m cache
=	TokenNameEQUAL	
newCache	TokenNameIdentifier	 new Cache
;	TokenNameSEMICOLON	
vec	TokenNameIdentifier	 vec
=	TokenNameEQUAL	
nv	TokenNameIdentifier	 nv
;	TokenNameSEMICOLON	
// Keep our superclass informed of the current NodeVector 	TokenNameCOMMENT_LINE	Keep our superclass informed of the current NodeVector 
super	TokenNamesuper	
.	TokenNameDOT	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
nv	TokenNameIdentifier	 nv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* When we get to here the new cache has * a use count of 1 and when setting a * bunch of values on the same NodeSequence, * such as when sorting, we will keep setting * values in that same copy which has a use count of 1. */	TokenNameCOMMENT_BLOCK	 When we get to here the new cache has a use count of 1 and when setting a bunch of values on the same NodeSequence, such as when sorting, we will keep setting values in that same copy which has a use count of 1. 
}	TokenNameRBRACE	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
setItem	TokenNameIdentifier	 set Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#getLength() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getLength() 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IteratorCache	TokenNameIdentifier	 Iterator Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
getCache	TokenNameIdentifier	 get Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nodes from the iterator are cached 	TokenNameCOMMENT_LINE	Nodes from the iterator are cached 
if	TokenNameif	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
isComplete	TokenNameIdentifier	 is Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All of the nodes from the iterator are cached 	TokenNameCOMMENT_LINE	All of the nodes from the iterator are cached 
// so just return the number of nodes in the cache 	TokenNameCOMMENT_LINE	so just return the number of nodes in the cache 
NodeVector	TokenNameIdentifier	 Node Vector
nv	TokenNameIdentifier	 nv
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nv	TokenNameIdentifier	 nv
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If this NodeSequence wraps a mutable nodeset, then 	TokenNameCOMMENT_LINE	If this NodeSequence wraps a mutable nodeset, then 
// m_last will not reflect the size of the nodeset if 	TokenNameCOMMENT_LINE	m_last will not reflect the size of the nodeset if 
// it has been mutated... 	TokenNameCOMMENT_LINE	it has been mutated... 
if	TokenNameif	
(	TokenNameLPAREN	
m_iter	TokenNameIdentifier	 m iter
instanceof	TokenNameinstanceof	
NodeSetDTM	TokenNameIdentifier	 Node Set DTM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_last	TokenNameIdentifier	 m last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_last	TokenNameIdentifier	 m last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_last	TokenNameIdentifier	 m last
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
m_last	TokenNameIdentifier	 m last
=	TokenNameEQUAL	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_last	TokenNameIdentifier	 m last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Note: Not a deep clone. * @see DTMIterator#cloneWithReset() */	TokenNameCOMMENT_JAVADOC	 Note: Not a deep clone. @see DTMIterator#cloneWithReset() 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NodeSequence	TokenNameIdentifier	 Node Sequence
seq	TokenNameIdentifier	 seq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSequence	TokenNameIdentifier	 Node Sequence
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seq	TokenNameIdentifier	 seq
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_cache	TokenNameIdentifier	 m cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In making this clone of an iterator we are making 	TokenNameCOMMENT_LINE	In making this clone of an iterator we are making 
// another NodeSequence object it has a reference 	TokenNameCOMMENT_LINE	another NodeSequence object it has a reference 
// to the same IteratorCache object as the original 	TokenNameCOMMENT_LINE	to the same IteratorCache object as the original 
// so we need to remember that more than one 	TokenNameCOMMENT_LINE	so we need to remember that more than one 
// NodeSequence object shares the cache. 	TokenNameCOMMENT_LINE	NodeSequence object shares the cache. 
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
increaseUseCount	TokenNameIdentifier	 increase Use Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
seq	TokenNameIdentifier	 seq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a clone of this iterator, but don't reset the iteration in the * process, so that it may be used from the current position. * Note: Not a deep clone. * * @return A clone of this object. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a clone of this iterator, but don't reset the iteration in the process, so that it may be used from the current position. Note: Not a deep clone. * @return A clone of this object. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
NodeSequence	TokenNameIdentifier	 Node Sequence
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeSequence	TokenNameIdentifier	 Node Sequence
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_iter	TokenNameIdentifier	 m iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_cache	TokenNameIdentifier	 m cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// In making this clone of an iterator we are making 	TokenNameCOMMENT_LINE	In making this clone of an iterator we are making 
// another NodeSequence object it has a reference 	TokenNameCOMMENT_LINE	another NodeSequence object it has a reference 
// to the same IteratorCache object as the original 	TokenNameCOMMENT_LINE	to the same IteratorCache object as the original 
// so we need to remember that more than one 	TokenNameCOMMENT_LINE	so we need to remember that more than one 
// NodeSequence object shares the cache. 	TokenNameCOMMENT_LINE	NodeSequence object shares the cache. 
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
increaseUseCount	TokenNameIdentifier	 increase Use Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see DTMIterator#isDocOrdered() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#isDocOrdered() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
return	TokenNamereturn	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// can't be sure? 	TokenNameCOMMENT_LINE	can't be sure? 
}	TokenNameRBRACE	
/** * @see DTMIterator#getAxis() */	TokenNameCOMMENT_JAVADOC	 @see DTMIterator#getAxis() 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
return	TokenNamereturn	
m_iter	TokenNameIdentifier	 m iter
.	TokenNameDOT	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"Can not getAxis from a non-iterated node sequence!"	TokenNameStringLiteral	Can not getAxis from a non-iterated node sequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see PathComponent#getAnalysisBits() */	TokenNameCOMMENT_JAVADOC	 @see PathComponent#getAnalysisBits() 
public	TokenNamepublic	
int	TokenNameint	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
m_iter	TokenNameIdentifier	 m iter
instanceof	TokenNameinstanceof	
PathComponent	TokenNameIdentifier	 Path Component
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PathComponent	TokenNameIdentifier	 Path Component
)	TokenNameRPAREN	
m_iter	TokenNameIdentifier	 m iter
)	TokenNameRPAREN	
.	TokenNameDOT	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xpath.Expression#fixupVariables(Vector, int) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.Expression#fixupVariables(Vector, int) 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
int	TokenNameint	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the node into a vector of nodes where it should occur in * document order. * @param node The node to be added. * @return insertIndex. * @throws RuntimeException thrown if this NodeSetDTM is not of * a mutable type. */	TokenNameCOMMENT_JAVADOC	 Add the node into a vector of nodes where it should occur in document order. @param node The node to be added. @return insertIndex. @throws RuntimeException thrown if this NodeSetDTM is not of a mutable type. 
protected	TokenNameprotected	
int	TokenNameint	
addNodeInDocOrder	TokenNameIdentifier	 add Node In Doc Order
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
hasCache	TokenNameIdentifier	 has Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"addNodeInDocOrder must be done on a mutable sequence!"	TokenNameStringLiteral	addNodeInDocOrder must be done on a mutable sequence!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
NodeVector	TokenNameIdentifier	 Node Vector
vec	TokenNameIdentifier	 vec
=	TokenNameEQUAL	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This needs to do a binary search, but a binary search 	TokenNameCOMMENT_LINE	This needs to do a binary search, but a binary search 
// is somewhat tough because the sequence test involves 	TokenNameCOMMENT_LINE	is somewhat tough because the sequence test involves 
// two nodes. 	TokenNameCOMMENT_LINE	two nodes. 
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Duplicate, suppress insert 	TokenNameCOMMENT_LINE	Duplicate, suppress insert 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_dtmMgr	TokenNameIdentifier	 m dtm Mgr
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
isNodeAfter	TokenNameIdentifier	 is Node After
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertIndex	TokenNameIdentifier	 insert Index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
vec	TokenNameIdentifier	 vec
.	TokenNameDOT	
insertElementAt	TokenNameIdentifier	 insert Element At
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
insertIndex	TokenNameIdentifier	 insert Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// checkDups(); 	TokenNameCOMMENT_LINE	checkDups(); 
return	TokenNamereturn	
insertIndex	TokenNameIdentifier	 insert Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end addNodeInDocOrder(Vector v, Object obj) 	TokenNameCOMMENT_LINE	end addNodeInDocOrder(Vector v, Object obj) 
/** * It used to be that many locations in the code simply * did an assignment to this.m_obj directly, rather than * calling the setObject(Object) method. The problem is * that our super-class would be updated on what the * cache associated with this NodeSequence, but * we wouldn't know ourselves. * <p> * All setting of m_obj is done through setObject() now, * and this method over-rides the super-class method. * So now we are in the loop have an opportunity * to update some caching information. * */	TokenNameCOMMENT_JAVADOC	 It used to be that many locations in the code simply did an assignment to this.m_obj directly, rather than calling the setObject(Object) method. The problem is that our super-class would be updated on what the cache associated with this NodeSequence, but we wouldn't know ourselves. <p> All setting of m_obj is done through setObject() now, and this method over-rides the super-class method. So now we are in the loop have an opportunity to update some caching information. 
protected	TokenNameprotected	
void	TokenNamevoid	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
NodeVector	TokenNameIdentifier	 Node Vector
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Keep our superclass informed of the current NodeVector 	TokenNameCOMMENT_LINE	Keep our superclass informed of the current NodeVector 
// ... if we don't the smoketest fails (don't know why). 	TokenNameCOMMENT_LINE	... if we don't the smoketest fails (don't know why). 
super	TokenNamesuper	
.	TokenNameDOT	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// A copy of the code of what SetVector() would do. 	TokenNameCOMMENT_LINE	A copy of the code of what SetVector() would do. 
NodeVector	TokenNameIdentifier	 Node Vector
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_cache	TokenNameIdentifier	 m cache
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
setVector	TokenNameIdentifier	 set Vector
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_cache	TokenNameIdentifier	 m cache
=	TokenNameEQUAL	
new	TokenNamenew	
IteratorCache	TokenNameIdentifier	 Iterator Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
setVector	TokenNameIdentifier	 set Vector
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
IteratorCache	TokenNameIdentifier	 Iterator Cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IteratorCache	TokenNameIdentifier	 Iterator Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IteratorCache	TokenNameIdentifier	 Iterator Cache
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
m_cache	TokenNameIdentifier	 m cache
=	TokenNameEQUAL	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
m_cache	TokenNameIdentifier	 m cache
.	TokenNameDOT	
increaseUseCount	TokenNameIdentifier	 increase Use Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Keep our superclass informed of the current NodeVector 	TokenNameCOMMENT_LINE	Keep our superclass informed of the current NodeVector 
super	TokenNamesuper	
.	TokenNameDOT	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setObject	TokenNameIdentifier	 set Object
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Each NodeSequence object has an iterator which is "walked". * As an iterator is walked one obtains nodes from it. * As those nodes are obtained they may be cached, making * the next walking of a copy or clone of the iterator faster. * This field (m_cache) is a reference to such a cache, * which is populated as the iterator is walked. * <p> * Note that multiple NodeSequence objects may hold a * reference to the same cache, and also * (and this is important) the same iterator. * The iterator and its cache may be shared among * many NodeSequence objects. * <p> * If one of the NodeSequence objects walks ahead * of the others it fills in the cache. * As the others NodeSequence objects catch up they * get their values from * the cache rather than the iterator itself, so * the iterator is only ever walked once and everyone * benefits from the cache. * <p> * At some point the cache may be * complete due to walking to the end of one of * the copies of the iterator, and the cache is * then marked as "complete". * and the cache will have no more nodes added to it. * <p> * Its use-count is the number of NodeSequence objects that use it. */	TokenNameCOMMENT_JAVADOC	 Each NodeSequence object has an iterator which is "walked". As an iterator is walked one obtains nodes from it. As those nodes are obtained they may be cached, making the next walking of a copy or clone of the iterator faster. This field (m_cache) is a reference to such a cache, which is populated as the iterator is walked. <p> Note that multiple NodeSequence objects may hold a reference to the same cache, and also (and this is important) the same iterator. The iterator and its cache may be shared among many NodeSequence objects. <p> If one of the NodeSequence objects walks ahead of the others it fills in the cache. As the others NodeSequence objects catch up they get their values from the cache rather than the iterator itself, so the iterator is only ever walked once and everyone benefits from the cache. <p> At some point the cache may be complete due to walking to the end of one of the copies of the iterator, and the cache is then marked as "complete". and the cache will have no more nodes added to it. <p> Its use-count is the number of NodeSequence objects that use it. 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
IteratorCache	TokenNameIdentifier	 Iterator Cache
{	TokenNameLBRACE	
/** * A list of nodes already obtained from the iterator. * As the iterator is walked the nodes obtained from * it are appended to this list. * <p> * Both an iterator and its corresponding cache can * be shared by multiple NodeSequence objects. * <p> * For example, consider three NodeSequence objects * ns1, ns2 and ns3 doing such sharing, and the * nodes to be obtaind from the iterator being * the sequence { 33, 11, 44, 22, 55 }. * <p> * If ns3.nextNode() is called 3 times the the * underlying iterator will have walked through * 33, 11, 55 and these three nodes will have been put * in the cache. * <p> * If ns2.nextNode() is called 2 times it will return * 33 and 11 from the cache, leaving the iterator alone. * <p> * If ns1.nextNode() is called 6 times it will return * 33 and 11 from the cache, then get 44, 22, 55 from * the iterator, and appending 44, 22, 55 to the cache. * On the sixth call it is found that the iterator is * exhausted and the cache is marked complete. * <p> * Should ns2 or ns3 have nextNode() called they will * know that the cache is complete, and they will * obtain all subsequent nodes from the cache. * <p> * Note that the underlying iterator, though shared * is only ever walked once. */	TokenNameCOMMENT_JAVADOC	 A list of nodes already obtained from the iterator. As the iterator is walked the nodes obtained from it are appended to this list. <p> Both an iterator and its corresponding cache can be shared by multiple NodeSequence objects. <p> For example, consider three NodeSequence objects ns1, ns2 and ns3 doing such sharing, and the nodes to be obtaind from the iterator being the sequence { 33, 11, 44, 22, 55 }. <p> If ns3.nextNode() is called 3 times the the underlying iterator will have walked through 33, 11, 55 and these three nodes will have been put in the cache. <p> If ns2.nextNode() is called 2 times it will return 33 and 11 from the cache, leaving the iterator alone. <p> If ns1.nextNode() is called 6 times it will return 33 and 11 from the cache, then get 44, 22, 55 from the iterator, and appending 44, 22, 55 to the cache. On the sixth call it is found that the iterator is exhausted and the cache is marked complete. <p> Should ns2 or ns3 have nextNode() called they will know that the cache is complete, and they will obtain all subsequent nodes from the cache. <p> Note that the underlying iterator, though shared is only ever walked once. 
private	TokenNameprivate	
NodeVector	TokenNameIdentifier	 Node Vector
m_vec2	TokenNameIdentifier	 m vec2
;	TokenNameSEMICOLON	
/** * true if the associated iterator is exhausted and * all nodes obtained from it are in the cache. */	TokenNameCOMMENT_JAVADOC	 true if the associated iterator is exhausted and all nodes obtained from it are in the cache. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isComplete2	TokenNameIdentifier	 m is Complete2
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
m_useCount2	TokenNameIdentifier	 m use Count2
;	TokenNameSEMICOLON	
IteratorCache	TokenNameIdentifier	 Iterator Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_vec2	TokenNameIdentifier	 m vec2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_isComplete2	TokenNameIdentifier	 m is Complete2
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_useCount2	TokenNameIdentifier	 m use Count2
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns count of how many NodeSequence objects share this * IteratorCache object. */	TokenNameCOMMENT_JAVADOC	 Returns count of how many NodeSequence objects share this IteratorCache object. 
private	TokenNameprivate	
int	TokenNameint	
useCount	TokenNameIdentifier	 use Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_useCount2	TokenNameIdentifier	 m use Count2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is called when yet another * NodeSequence object uses, or shares * this same cache. * */	TokenNameCOMMENT_JAVADOC	 This method is called when yet another NodeSequence object uses, or shares this same cache. 
private	TokenNameprivate	
void	TokenNamevoid	
increaseUseCount	TokenNameIdentifier	 increase Use Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_vec2	TokenNameIdentifier	 m vec2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_useCount2	TokenNameIdentifier	 m use Count2
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the NodeVector that holds the * growing list of nodes as they are appended * to the cached list. */	TokenNameCOMMENT_JAVADOC	 Sets the NodeVector that holds the growing list of nodes as they are appended to the cached list. 
private	TokenNameprivate	
void	TokenNamevoid	
setVector	TokenNameIdentifier	 set Vector
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
nv	TokenNameIdentifier	 nv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_vec2	TokenNameIdentifier	 m vec2
=	TokenNameEQUAL	
nv	TokenNameIdentifier	 nv
;	TokenNameSEMICOLON	
m_useCount2	TokenNameIdentifier	 m use Count2
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the cached list of nodes obtained from * the iterator so far. */	TokenNameCOMMENT_JAVADOC	 Get the cached list of nodes obtained from the iterator so far. 
private	TokenNameprivate	
NodeVector	TokenNameIdentifier	 Node Vector
getVector	TokenNameIdentifier	 get Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_vec2	TokenNameIdentifier	 m vec2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Call this method with 'true' if the * iterator is exhausted and the cached list * is complete, or no longer growing. */	TokenNameCOMMENT_JAVADOC	 Call this method with 'true' if the iterator is exhausted and the cached list is complete, or no longer growing. 
private	TokenNameprivate	
void	TokenNamevoid	
setCacheComplete	TokenNameIdentifier	 set Cache Complete
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isComplete2	TokenNameIdentifier	 m is Complete2
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if no cache is complete * and immutable. */	TokenNameCOMMENT_JAVADOC	 Returns true if no cache is complete and immutable. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isComplete	TokenNameIdentifier	 is Complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isComplete2	TokenNameIdentifier	 m is Complete2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the cached list of nodes appended with * values obtained from the iterator as * a NodeSequence is walked when its * nextNode() method is called. */	TokenNameCOMMENT_JAVADOC	 Get the cached list of nodes appended with values obtained from the iterator as a NodeSequence is walked when its nextNode() method is called. 
protected	TokenNameprotected	
IteratorCache	TokenNameIdentifier	 Iterator Cache
getIteratorCache	TokenNameIdentifier	 get Iterator Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_cache	TokenNameIdentifier	 m cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
