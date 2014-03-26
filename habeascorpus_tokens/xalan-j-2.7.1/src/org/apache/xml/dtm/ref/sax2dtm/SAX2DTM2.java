/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SAX2DTM2.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SAX2DTM2.java 468653 2006-10-28 07:07:05Z minchau $ 
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
.	TokenNameDOT	
sax2dtm	TokenNameIdentifier	 sax2dtm
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
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
XMLString	TokenNameIdentifier	 XML String
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
XMLStringDefault	TokenNameIdentifier	 XML String Default
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
XMLMessages	TokenNameIdentifier	 XML Messages
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
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * SAX2DTM2 is an optimized version of SAX2DTM which is used in non-incremental situation. * It is used as the super class of the XSLTC SAXImpl. Many of the interfaces in SAX2DTM * and DTMDefaultBase are overridden in SAX2DTM2 in order to allow fast, efficient * access to the DTM model. Some nested iterators in DTMDefaultBaseIterators * are also overridden in SAX2DTM2 for performance reasons. * <p> * Performance is the biggest consideration in the design of SAX2DTM2. To make the code most * efficient, the incremental support is dropped in SAX2DTM2, which means that you should not * use it in incremental situation. To reduce the overhead of pulling data from the DTM model, * a few core interfaces in SAX2DTM2 have direct access to the internal arrays of the * SuballocatedIntVectors. * <p> * The design of SAX2DTM2 may limit its extensibilty. If you have a reason to extend the * SAX2DTM model, please extend from SAX2DTM instead of this class. * <p> * TODO: This class is currently only used by XSLTC. We need to investigate the possibility * of also using it in Xalan-J Interpretive. Xalan's performance is likely to get an instant * boost if we use SAX2DTM2 instead of SAX2DTM in non-incremental case. * <p> * %MK% The code in this class is critical to the XSLTC_DTM performance. Be very careful * when making changes here! */	TokenNameCOMMENT_JAVADOC	 SAX2DTM2 is an optimized version of SAX2DTM which is used in non-incremental situation. It is used as the super class of the XSLTC SAXImpl. Many of the interfaces in SAX2DTM and DTMDefaultBase are overridden in SAX2DTM2 in order to allow fast, efficient access to the DTM model. Some nested iterators in DTMDefaultBaseIterators are also overridden in SAX2DTM2 for performance reasons. <p> Performance is the biggest consideration in the design of SAX2DTM2. To make the code most efficient, the incremental support is dropped in SAX2DTM2, which means that you should not use it in incremental situation. To reduce the overhead of pulling data from the DTM model, a few core interfaces in SAX2DTM2 have direct access to the internal arrays of the SuballocatedIntVectors. <p> The design of SAX2DTM2 may limit its extensibilty. If you have a reason to extend the SAX2DTM model, please extend from SAX2DTM instead of this class. <p> TODO: This class is currently only used by XSLTC. We need to investigate the possibility of also using it in Xalan-J Interpretive. Xalan's performance is likely to get an instant boost if we use SAX2DTM2 instead of SAX2DTM in non-incremental case. <p> %MK% The code in this class is critical to the XSLTC_DTM performance. Be very careful when making changes here! 
public	TokenNamepublic	
class	TokenNameclass	
SAX2DTM2	TokenNameIdentifier	 SA X2 DT M2
extends	TokenNameextends	
SAX2DTM	TokenNameIdentifier	 SA X2 DTM
{	TokenNameLBRACE	
/**************************************************************** * Optimized version of the nested iterators ****************************************************************/	TokenNameCOMMENT_JAVADOC	************************************************************** Optimized version of the nested iterators ***************************************************************
/** * Iterator that returns all immediate children of a given node */	TokenNameCOMMENT_JAVADOC	 Iterator that returns all immediate children of a given node 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ChildrenIterator	TokenNameIdentifier	 Children Iterator
extends	TokenNameextends	
InternalAxisIteratorBase	TokenNameIdentifier	 Internal Axis Iterator Base
{	TokenNameLBRACE	
/** * Setting start to END should 'close' the iterator, * i.e. subsequent call to next() should return END. * <p> * If the iterator is not restartable, this has no effect. * %REVIEW% Should it return/throw something in that case, * or set current node to END, to indicate request-not-honored? * * @param node Sets the root of the iteration. * * @return A DTMAxisIterator set to the start of the iteration. */	TokenNameCOMMENT_JAVADOC	 Setting start to END should 'close' the iterator, i.e. subsequent call to next() should return END. <p> If the iterator is not restartable, this has no effect. %REVIEW% Should it return/throw something in that case, or set current node to END, to indicate request-not-honored? * @param node Sets the root of the iteration. * @return A DTMAxisIterator set to the start of the iteration. 
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
_firstch2	TokenNameIdentifier	 firstch2
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
_nextsib2	TokenNameIdentifier	 nextsib2
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
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
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
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
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
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
// %OPT% The most common case is handled first. 	TokenNameCOMMENT_LINE	%OPT% The most common case is handled first. 
if	TokenNameif	
(	TokenNameLPAREN	
_nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
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
==	TokenNameEQUAL_EQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_nodeType	TokenNameIdentifier	 node Type
==	TokenNameEQUAL_EQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
return	TokenNamereturn	
returnNode	TokenNameIdentifier	 return Node
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
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
_firstch2	TokenNameIdentifier	 firstch2
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
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
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
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// %OPT% If the nodeType is element (matching child::*), we only 	TokenNameCOMMENT_LINE	%OPT% If the nodeType is element (matching child::*), we only 
// need to compare the expType with DTM.NTYPES. A child node of 	TokenNameCOMMENT_LINE	need to compare the expType with DTM.NTYPES. A child node of 
// an element can be either an element, text, comment or 	TokenNameCOMMENT_LINE	an element can be either an element, text, comment or 
// processing instruction node. Only element node has an extended 	TokenNameCOMMENT_LINE	processing instruction node. Only element node has an extended 
// type greater than or equal to DTM.NTYPES. 	TokenNameCOMMENT_LINE	type greater than or equal to DTM.NTYPES. 
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
;	TokenNameSEMICOLON	
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
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
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
_nextsib2	TokenNameIdentifier	 nextsib2
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
/** * Return the node at the given position. */	TokenNameCOMMENT_JAVADOC	 Return the node at the given position. 
public	TokenNamepublic	
int	TokenNameint	
getNodeByPosition	TokenNameIdentifier	 get Node By Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedChildrenIterator 	TokenNameCOMMENT_LINE	end of TypedChildrenIterator 
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
final	TokenNamefinal	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
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
_nodeType	TokenNameIdentifier	 node Type
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
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
expType	TokenNameIdentifier	 exp Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
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
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of TypedRootIterator 	TokenNameCOMMENT_LINE	end of TypedRootIterator 
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
_nextsib2	TokenNameIdentifier	 nextsib2
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
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
node	TokenNameIdentifier	 node
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
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
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
_parent2	TokenNameIdentifier	 parent2
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
_firstch2	TokenNameIdentifier	 firstch2
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
_nextsib2	TokenNameIdentifier	 nextsib2
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
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
startNodeID	TokenNameIdentifier	 start Node ID
=	TokenNameEQUAL	
_startNodeID	TokenNameIdentifier	 start Node ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
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
startNodeID	TokenNameIdentifier	 start Node ID
&&	TokenNameAND_AND	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
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
startNodeID	TokenNameIdentifier	 start Node ID
&&	TokenNameAND_AND	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
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
startNodeID	TokenNameIdentifier	 start Node ID
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
_nextsib2	TokenNameIdentifier	 nextsib2
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
/** * Return the index of the last node in this iterator. */	TokenNameCOMMENT_JAVADOC	 Return the index of the last node in this iterator. 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_last	TokenNameIdentifier	 last
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
_last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
setMark	TokenNameIdentifier	 set Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
startNodeID	TokenNameIdentifier	 start Node ID
=	TokenNameEQUAL	
_startNodeID	TokenNameIdentifier	 start Node ID
;	TokenNameSEMICOLON	
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
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
startNodeID	TokenNameIdentifier	 start Node ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
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
startNodeID	TokenNameIdentifier	 start Node ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
last	TokenNameIdentifier	 last
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
gotoMark	TokenNameIdentifier	 goto Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
_last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
_type2	TokenNameIdentifier	 type2
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
_parent2	TokenNameIdentifier	 parent2
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
_parent2	TokenNameIdentifier	 parent2
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
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
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
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
&&	TokenNameAND_AND	
type	TokenNameIdentifier	 type
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
final	TokenNamefinal	
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
++	TokenNamePLUS_PLUS	
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
_exptype2	TokenNameIdentifier	 exptype2
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
++	TokenNamePLUS_PLUS	
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
_exptype2	TokenNameIdentifier	 exptype2
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
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
expType	TokenNameIdentifier	 exp Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
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
//DTMAxisTraverser m_traverser; // easier for now 	TokenNameCOMMENT_LINE	DTMAxisTraverser m_traverser; // easier for now 
public	TokenNamepublic	
FollowingIterator	TokenNameIdentifier	 Following Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//m_traverser = getAxisTraverser(Axis.FOLLOWING); 	TokenNameCOMMENT_LINE	m_traverser = getAxisTraverser(Axis.FOLLOWING); 
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
//_currentNode = m_traverser.first(node); 	TokenNameCOMMENT_LINE	_currentNode = m_traverser.first(node); 
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
_firstch2	TokenNameIdentifier	 firstch2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
resetPosition	TokenNameIdentifier	 reset Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
first	TokenNameIdentifier	 first
&&	TokenNameAND_AND	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
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
//_currentNode = m_traverser.next(_startNode, _currentNode); 	TokenNameCOMMENT_LINE	_currentNode = m_traverser.next(_startNode, _currentNode); 
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
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
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
int	TokenNameint	
currentNodeID	TokenNameIdentifier	 current Node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
_currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
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
currentNodeID	TokenNameIdentifier	 current Node ID
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentNodeID	TokenNameIdentifier	 current Node ID
=	TokenNameEQUAL	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
current	TokenNameIdentifier	 current
:	TokenNameCOLON	
NULL	TokenNameIdentifier	 NULL
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
_exptype2	TokenNameIdentifier	 exptype2
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
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
currentNodeID	TokenNameIdentifier	 current Node ID
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentNodeID	TokenNameIdentifier	 current Node ID
=	TokenNameEQUAL	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
?	TokenNameQUESTION	
current	TokenNameIdentifier	 current
:	TokenNameCOLON	
NULL	TokenNameIdentifier	 NULL
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
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
&&	TokenNameAND_AND	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
currentNodeID	TokenNameIdentifier	 current Node ID
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
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
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
// The initial size of the ancestor array 	TokenNameCOMMENT_LINE	The initial size of the ancestor array 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The array for ancestor nodes. This array will grow dynamically. 	TokenNameCOMMENT_LINE	The array for ancestor nodes. This array will grow dynamically. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_ancestors	TokenNameIdentifier	 m ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Number of ancestor nodes in the array 	TokenNameCOMMENT_LINE	Number of ancestor nodes in the array 
int	TokenNameint	
m_size	TokenNameIdentifier	 m size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
m_size	TokenNameIdentifier	 m size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
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
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Start from the current node's parent if 	TokenNameCOMMENT_LINE	Start from the current node's parent if 
// _includeSelf is false. 	TokenNameCOMMENT_LINE	_includeSelf is false. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_includeSelf	TokenNameIdentifier	 include Self
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent2	TokenNameIdentifier	 parent2
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
//m_ancestors.addElement(node); 	TokenNameCOMMENT_LINE	m_ancestors.addElement(node); 
if	TokenNameif	
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
>=	TokenNameGREATER_EQUAL	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newAncestors	TokenNameIdentifier	 new Ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_size	TokenNameIdentifier	 m size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_ancestors	TokenNameIdentifier	 m ancestors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newAncestors	TokenNameIdentifier	 new Ancestors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ancestors	TokenNameIdentifier	 m ancestors
=	TokenNameEQUAL	
newAncestors	TokenNameIdentifier	 new Ancestors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ancestors	TokenNameIdentifier	 m ancestors
[	TokenNameLBRACKET	
m_size	TokenNameIdentifier	 m size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent2	TokenNameIdentifier	 parent2
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
m_size	TokenNameIdentifier	 m size
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
[	TokenNameLBRACKET	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
]	TokenNameRBRACKET	
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
m_size	TokenNameIdentifier	 m size
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
[	TokenNameLBRACKET	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
]	TokenNameRBRACKET	
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
[	TokenNameLBRACKET	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
]	TokenNameRBRACKET	
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
[	TokenNameLBRACKET	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
]	TokenNameRBRACKET	
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
m_size	TokenNameIdentifier	 m size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
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
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_includeSelf	TokenNameIdentifier	 include Self
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent2	TokenNameIdentifier	 parent2
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
_exptype2	TokenNameIdentifier	 exptype2
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
if	TokenNameif	
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
>=	TokenNameGREATER_EQUAL	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newAncestors	TokenNameIdentifier	 new Ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_size	TokenNameIdentifier	 m size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_ancestors	TokenNameIdentifier	 m ancestors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newAncestors	TokenNameIdentifier	 new Ancestors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ancestors	TokenNameIdentifier	 m ancestors
=	TokenNameEQUAL	
newAncestors	TokenNameIdentifier	 new Ancestors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ancestors	TokenNameIdentifier	 m ancestors
[	TokenNameLBRACKET	
m_size	TokenNameIdentifier	 m size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent2	TokenNameIdentifier	 parent2
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
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
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
||	TokenNameOR_OR	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
>=	TokenNameGREATER_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
&&	TokenNameAND_AND	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
eType	TokenNameIdentifier	 e Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_size	TokenNameIdentifier	 m size
>=	TokenNameGREATER_EQUAL	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newAncestors	TokenNameIdentifier	 new Ancestors
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
m_size	TokenNameIdentifier	 m size
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_ancestors	TokenNameIdentifier	 m ancestors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newAncestors	TokenNameIdentifier	 new Ancestors
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_ancestors	TokenNameIdentifier	 m ancestors
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_ancestors	TokenNameIdentifier	 m ancestors
=	TokenNameEQUAL	
newAncestors	TokenNameIdentifier	 new Ancestors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_ancestors	TokenNameIdentifier	 m ancestors
[	TokenNameLBRACKET	
m_size	TokenNameIdentifier	 m size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
=	TokenNameEQUAL	
m_size	TokenNameIdentifier	 m size
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
[	TokenNameLBRACKET	
m_ancestorsPos	TokenNameIdentifier	 m ancestors Pos
]	TokenNameRBRACKET	
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
/** * Return the node at the given position. */	TokenNameCOMMENT_JAVADOC	 Return the node at the given position. 
public	TokenNamepublic	
int	TokenNameint	
getNodeByPosition	TokenNameIdentifier	 get Node By Position
(	TokenNameLPAREN	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
position	TokenNameIdentifier	 position
<=	TokenNameLESS_EQUAL	
m_size	TokenNameIdentifier	 m size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_ancestors	TokenNameIdentifier	 m ancestors
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the last node within the iteration, as * defined by XPath. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the last node within the iteration, as defined by XPath. 
public	TokenNamepublic	
int	TokenNameint	
getLast	TokenNameIdentifier	 get Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_size	TokenNameIdentifier	 m size
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
final	TokenNamefinal	
boolean	TokenNameboolean	
isDescendant	TokenNameIdentifier	 is Descendant
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_parent2	TokenNameIdentifier	 parent2
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
final	TokenNamefinal	
int	TokenNameint	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
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
startNode	TokenNameIdentifier	 start Node
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
// %OPT% If the startNode is the root node, do not need 	TokenNameCOMMENT_LINE	%OPT% If the startNode is the root node, do not need 
// to do the isDescendant() check. 	TokenNameCOMMENT_LINE	to do the isDescendant() check. 
if	TokenNameif	
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
eType	TokenNameIdentifier	 e Type
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
eType	TokenNameIdentifier	 e Type
==	TokenNameEQUAL_EQUAL	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
eType	TokenNameIdentifier	 e Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
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
}	TokenNameRBRACE	
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
final	TokenNamefinal	
int	TokenNameint	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
_startNode	TokenNameIdentifier	 start Node
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
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
_nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
expType	TokenNameIdentifier	 exp Type
||	TokenNameOR_OR	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
<	TokenNameLESS	
startNode	TokenNameIdentifier	 start Node
&&	TokenNameAND_AND	
startNode	TokenNameIdentifier	 start Node
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
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
expType	TokenNameIdentifier	 exp Type
!=	TokenNameNOT_EQUAL	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// %OPT% If the start node is root (e.g. in the case of //node), 	TokenNameCOMMENT_LINE	%OPT% If the start node is root (e.g. in the case of //node), 
// we can save the isDescendant() check, because all nodes are 	TokenNameCOMMENT_LINE	we can save the isDescendant() check, because all nodes are 
// descendants of root. 	TokenNameCOMMENT_LINE	descendants of root. 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
startNode	TokenNameIdentifier	 start Node
==	TokenNameEQUAL_EQUAL	
DTMDefaultBase	TokenNameIdentifier	 DTM Default Base
.	TokenNameDOT	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
expType	TokenNameIdentifier	 exp Type
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
expType	TokenNameIdentifier	 exp Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
||	TokenNameOR_OR	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
expType	TokenNameIdentifier	 exp Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
expType	TokenNameIdentifier	 exp Type
||	TokenNameOR_OR	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
<	TokenNameLESS	
startNode	TokenNameIdentifier	 start Node
&&	TokenNameAND_AND	
startNode	TokenNameIdentifier	 start Node
!=	TokenNameNOT_EQUAL	
node	TokenNameIdentifier	 node
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
expType	TokenNameIdentifier	 exp Type
<	TokenNameLESS	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
||	TokenNameOR_OR	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
expType	TokenNameIdentifier	 exp Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
final	TokenNamefinal	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
_currentNode	TokenNameIdentifier	 current Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
END	TokenNameIdentifier	 END
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
_currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
END	TokenNameIdentifier	 END
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
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
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
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
_nodeType	TokenNameIdentifier	 node Type
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
/******************************************************************* * End of nested iterators *******************************************************************/	TokenNameCOMMENT_JAVADOC	***************************************************************** End of nested iterators ******************************************************************
// %OPT% Array references which are used to cache the map0 arrays in 	TokenNameCOMMENT_LINE	%OPT% Array references which are used to cache the map0 arrays in 
// SuballocatedIntVectors. Using the cached arrays reduces the level 	TokenNameCOMMENT_LINE	SuballocatedIntVectors. Using the cached arrays reduces the level 
// of indirection and results in better performance than just calling 	TokenNameCOMMENT_LINE	of indirection and results in better performance than just calling 
// SuballocatedIntVector.elementAt(). 	TokenNameCOMMENT_LINE	SuballocatedIntVector.elementAt(). 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_exptype_map0	TokenNameIdentifier	 m exptype map0
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_nextsib_map0	TokenNameIdentifier	 m nextsib map0
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_firstch_map0	TokenNameIdentifier	 m firstch map0
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_parent_map0	TokenNameIdentifier	 m parent map0
;	TokenNameSEMICOLON	
// Double array references to the map arrays in SuballocatedIntVectors. 	TokenNameCOMMENT_LINE	Double array references to the map arrays in SuballocatedIntVectors. 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_exptype_map	TokenNameIdentifier	 m exptype map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_nextsib_map	TokenNameIdentifier	 m nextsib map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_firstch_map	TokenNameIdentifier	 m firstch map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_parent_map	TokenNameIdentifier	 m parent map
;	TokenNameSEMICOLON	
// %OPT% Cache the array of extended types in this class 	TokenNameCOMMENT_LINE	%OPT% Cache the array of extended types in this class 
protected	TokenNameprotected	
ExtendedType	TokenNameIdentifier	 Extended Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_extendedTypes	TokenNameIdentifier	 m extended Types
;	TokenNameSEMICOLON	
// A Vector which is used to store the values of attribute, namespace, 	TokenNameCOMMENT_LINE	A Vector which is used to store the values of attribute, namespace, 
// comment and PI nodes. 	TokenNameCOMMENT_LINE	comment and PI nodes. 
// 	TokenNameCOMMENT_LINE	 
// %OPT% These values are unlikely to be equal. Storing 	TokenNameCOMMENT_LINE	%OPT% These values are unlikely to be equal. Storing 
// them in a plain Vector is more efficient than storing in the 	TokenNameCOMMENT_LINE	them in a plain Vector is more efficient than storing in the 
// DTMStringPool because we can save the cost for hash calculation. 	TokenNameCOMMENT_LINE	DTMStringPool because we can save the cost for hash calculation. 
// 	TokenNameCOMMENT_LINE	 
// %REVISIT% Do we need a custom class (e.g. StringVector) here? 	TokenNameCOMMENT_LINE	%REVISIT% Do we need a custom class (e.g. StringVector) here? 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
m_values	TokenNameIdentifier	 m values
;	TokenNameSEMICOLON	
// The current index into the m_values Vector. 	TokenNameCOMMENT_LINE	The current index into the m_values Vector. 
private	TokenNameprivate	
int	TokenNameint	
m_valueIndex	TokenNameIdentifier	 m value Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The maximum value of the current node index. 	TokenNameCOMMENT_LINE	The maximum value of the current node index. 
private	TokenNameprivate	
int	TokenNameint	
m_maxNodeIndex	TokenNameIdentifier	 m max Node Index
;	TokenNameSEMICOLON	
// Cache the shift and mask values for the SuballocatedIntVectors. 	TokenNameCOMMENT_LINE	Cache the shift and mask values for the SuballocatedIntVectors. 
protected	TokenNameprotected	
int	TokenNameint	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
m_MASK	TokenNameIdentifier	 m  MASK
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
/** %OPT% If the offset and length of a Text node are within certain limits, * we store a bitwise encoded value into an int, using 10 bits (max. 1024) * for length and 21 bits for offset. We can save two SuballocatedIntVector * calls for each getStringValueX() and dispatchCharacterEvents() call by * doing this. */	TokenNameCOMMENT_JAVADOC	 %OPT% If the offset and length of a Text node are within certain limits, we store a bitwise encoded value into an int, using 10 bits (max. 1024) for length and 21 bits for offset. We can save two SuballocatedIntVector calls for each getStringValueX() and dispatchCharacterEvents() call by doing this. 
// The number of bits for the length of a Text node. 	TokenNameCOMMENT_LINE	The number of bits for the length of a Text node. 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The number of bits for the offset of a Text node. 	TokenNameCOMMENT_LINE	The number of bits for the offset of a Text node. 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TEXT_OFFSET_BITS	TokenNameIdentifier	 TEXT  OFFSET  BITS
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The maximum length value 	TokenNameCOMMENT_LINE	The maximum length value 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// The maximum offset value 	TokenNameCOMMENT_LINE	The maximum offset value 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TEXT_OFFSET_MAX	TokenNameIdentifier	 TEXT  OFFSET  MAX
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
TEXT_OFFSET_BITS	TokenNameIdentifier	 TEXT  OFFSET  BITS
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// True if we want to build the ID index table. 	TokenNameCOMMENT_LINE	True if we want to build the ID index table. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_buildIdIndex	TokenNameIdentifier	 m build Id Index
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Constant for empty String 	TokenNameCOMMENT_LINE	Constant for empty String 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// Constant for empty XMLString 	TokenNameCOMMENT_LINE	Constant for empty XMLString 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
XMLString	TokenNameIdentifier	 XML String
EMPTY_XML_STR	TokenNameIdentifier	 EMPTY  XML  STR
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct a SAX2DTM2 object using the default block size. */	TokenNameCOMMENT_JAVADOC	 Construct a SAX2DTM2 object using the default block size. 
public	TokenNamepublic	
SAX2DTM2	TokenNameIdentifier	 SA X2 DT M2
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
this	TokenNamethis	
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
DEFAULT_BLOCKSIZE	TokenNameIdentifier	 DEFAULT  BLOCKSIZE
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a SAX2DTM2 object using the given block size. */	TokenNameCOMMENT_JAVADOC	 Construct a SAX2DTM2 object using the given block size. 
public	TokenNamepublic	
SAX2DTM2	TokenNameIdentifier	 SA X2 DT M2
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
buildIdIndex	TokenNameIdentifier	 build Id Index
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
// Initialize the values of m_SHIFT and m_MASK. 	TokenNameCOMMENT_LINE	Initialize the values of m_SHIFT and m_MASK. 
int	TokenNameint	
shift	TokenNameIdentifier	 shift
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
shift	TokenNameIdentifier	 shift
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
blocksize	TokenNameIdentifier	 blocksize
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
shift	TokenNameIdentifier	 shift
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
shift	TokenNameIdentifier	 shift
;	TokenNameSEMICOLON	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
=	TokenNameEQUAL	
shift	TokenNameIdentifier	 shift
;	TokenNameSEMICOLON	
m_MASK	TokenNameIdentifier	 m  MASK
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_buildIdIndex	TokenNameIdentifier	 m build Id Index
=	TokenNameEQUAL	
buildIdIndex	TokenNameIdentifier	 build Id Index
;	TokenNameSEMICOLON	
// Some documents do not have attribute nodes. That is why 	TokenNameCOMMENT_LINE	Some documents do not have attribute nodes. That is why 
// we set the initial size of this Vector to be small and set 	TokenNameCOMMENT_LINE	we set the initial size of this Vector to be small and set 
// the increment to a bigger number. 	TokenNameCOMMENT_LINE	the increment to a bigger number. 
m_values	TokenNameIdentifier	 m values
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
512	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_maxNodeIndex	TokenNameIdentifier	 m max Node Index
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
;	TokenNameSEMICOLON	
// Set the map0 values in the constructor. 	TokenNameCOMMENT_LINE	Set the map0 values in the constructor. 
m_exptype_map0	TokenNameIdentifier	 m exptype map0
=	TokenNameEQUAL	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
getMap0	TokenNameIdentifier	 get Map0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextsib_map0	TokenNameIdentifier	 m nextsib map0
=	TokenNameEQUAL	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
getMap0	TokenNameIdentifier	 get Map0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstch_map0	TokenNameIdentifier	 m firstch map0
=	TokenNameEQUAL	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
getMap0	TokenNameIdentifier	 get Map0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parent_map0	TokenNameIdentifier	 m parent map0
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
getMap0	TokenNameIdentifier	 get Map0
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override DTMDefaultBase._exptype() by dropping the incremental code. * * <p>This one is less efficient than _exptype2. It is only used during * DTM building. _exptype2 is used after the document is fully built. */	TokenNameCOMMENT_JAVADOC	 Override DTMDefaultBase._exptype() by dropping the incremental code. * <p>This one is less efficient than _exptype2. It is only used during DTM building. _exptype2 is used after the document is fully built. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/************************************************************************ * DTM base accessor interfaces * * %OPT% The code in the following interfaces (e.g. _exptype2, etc.) are * very important to the DTM performance. To have the best performace, * these several interfaces have direct access to the internal arrays of * the SuballocatedIntVectors. The final modifier also has a noticeable * impact on performance. ***********************************************************************/	TokenNameCOMMENT_JAVADOC	********************************************************************** DTM base accessor interfaces * %OPT% The code in the following interfaces (e.g. _exptype2, etc.) are very important to the DTM performance. To have the best performace, these several interfaces have direct access to the internal arrays of the SuballocatedIntVectors. The final modifier also has a noticeable impact on performance. **********************************************************************
/** * The optimized version of DTMDefaultBase._exptype(). * * @param identity A node identity, which <em>must not</em> be equal to * <code>DTM.NULL</code> */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase._exptype(). * @param identity A node identity, which <em>must not</em> be equal to <code>DTM.NULL</code> 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//return m_exptype.elementAt(identity); 	TokenNameCOMMENT_LINE	return m_exptype.elementAt(identity); 
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
return	TokenNamereturn	
m_exptype_map0	TokenNameIdentifier	 m exptype map0
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_exptype_map	TokenNameIdentifier	 m exptype map
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase._nextsib(). * * @param identity A node identity, which <em>must not</em> be equal to * <code>DTM.NULL</code> */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase._nextsib(). * @param identity A node identity, which <em>must not</em> be equal to <code>DTM.NULL</code> 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//return m_nextsib.elementAt(identity); 	TokenNameCOMMENT_LINE	return m_nextsib.elementAt(identity); 
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
return	TokenNamereturn	
m_nextsib_map0	TokenNameIdentifier	 m nextsib map0
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_nextsib_map	TokenNameIdentifier	 m nextsib map
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase._firstch(). * * @param identity A node identity, which <em>must not</em> be equal to * <code>DTM.NULL</code> */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase._firstch(). * @param identity A node identity, which <em>must not</em> be equal to <code>DTM.NULL</code> 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
_firstch2	TokenNameIdentifier	 firstch2
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//return m_firstch.elementAt(identity); 	TokenNameCOMMENT_LINE	return m_firstch.elementAt(identity); 
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
return	TokenNamereturn	
m_firstch_map0	TokenNameIdentifier	 m firstch map0
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_firstch_map	TokenNameIdentifier	 m firstch map
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase._parent(). * * @param identity A node identity, which <em>must not</em> be equal to * <code>DTM.NULL</code> */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase._parent(). * @param identity A node identity, which <em>must not</em> be equal to <code>DTM.NULL</code> 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//return m_parent.elementAt(identity); 	TokenNameCOMMENT_LINE	return m_parent.elementAt(identity); 
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
return	TokenNamereturn	
m_parent_map0	TokenNameIdentifier	 m parent map0
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_parent_map	TokenNameIdentifier	 m parent map
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase._type(). * * @param identity A node identity, which <em>must not</em> be equal to * <code>DTM.NULL</code> */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase._type(). * @param identity A node identity, which <em>must not</em> be equal to <code>DTM.NULL</code> 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//int eType = _exptype2(identity); 	TokenNameCOMMENT_LINE	int eType = _exptype2(identity); 
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
m_exptype_map0	TokenNameIdentifier	 m exptype map0
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
m_exptype_map	TokenNameIdentifier	 m exptype map
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
identity	TokenNameIdentifier	 identity
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
eType	TokenNameIdentifier	 e Type
)	TokenNameRPAREN	
return	TokenNamereturn	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
eType	TokenNameIdentifier	 e Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase.getExpandedTypeID(int). * * <p>This one is only used by DOMAdapter.getExpandedTypeID(int), which * is mostly called from the compiled translets. */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase.getExpandedTypeID(int). * <p>This one is only used by DOMAdapter.getExpandedTypeID(int), which is mostly called from the compiled translets. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getExpandedTypeID2	TokenNameIdentifier	 get Expanded Type I D2
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//return (nodeID != NULL) ? _exptype2(nodeID) : NULL; 	TokenNameCOMMENT_LINE	return (nodeID != NULL) ? _exptype2(nodeID) : NULL; 
if	TokenNameif	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
!=	TokenNameNOT_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
<	TokenNameLESS	
m_blocksize	TokenNameIdentifier	 m blocksize
)	TokenNameRPAREN	
return	TokenNamereturn	
m_exptype_map0	TokenNameIdentifier	 m exptype map0
[	TokenNameLBRACKET	
nodeID	TokenNameIdentifier	 node ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_exptype_map	TokenNameIdentifier	 m exptype map
[	TokenNameLBRACKET	
nodeID	TokenNameIdentifier	 node ID
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
m_SHIFT	TokenNameIdentifier	 m  SHIFT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
nodeID	TokenNameIdentifier	 node ID
&	TokenNameAND	
m_MASK	TokenNameIdentifier	 m  MASK
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/************************************************************************* * END of DTM base accessor interfaces *************************************************************************/	TokenNameCOMMENT_JAVADOC	*********************************************************************** END of DTM base accessor interfaces ************************************************************************
/** * Return the node type from the expanded type */	TokenNameCOMMENT_JAVADOC	 Return the node type from the expanded type 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
_exptype2Type	TokenNameIdentifier	 exptype2 Type
(	TokenNameLPAREN	
int	TokenNameint	
exptype	TokenNameIdentifier	 exptype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
exptype	TokenNameIdentifier	 exptype
)	TokenNameRPAREN	
return	TokenNamereturn	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
exptype	TokenNameIdentifier	 exptype
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a prefix either from the uri mapping, or just make * one up! * * @param uri The namespace URI, which may be null. * * @return The prefix if there is one, or null. */	TokenNameCOMMENT_JAVADOC	 Get a prefix either from the uri mapping, or just make one up! * @param uri The namespace URI, which may be null. * @return The prefix if there is one, or null. 
public	TokenNamepublic	
int	TokenNameint	
getIdForNamespace	TokenNameIdentifier	 get Id For Namespace
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_valueIndex	TokenNameIdentifier	 m value Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override SAX2DTM.startElement() * * <p>Receive notification of the start of an element. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the start of * each element (such as allocating a new tree node or writing * output to a file).</p> * * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param qName The qualified name (with prefix), or the * empty string if qualified names are not available. * @param attributes The specified or defaulted attributes. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startElement */	TokenNameCOMMENT_JAVADOC	 Override SAX2DTM.startElement() * <p>Receive notification of the start of an element. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the start of each element (such as allocating a new tree node or writing output to a file).</p> * @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param qName The qualified name (with prefix), or the empty string if qualified names are not available. @param attributes The specified or defaulted attributes. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startElement 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
elemNode	TokenNameIdentifier	 elem Node
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
prefixIndex	TokenNameIdentifier	 prefix Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_indexing	TokenNameIdentifier	 m indexing
)	TokenNameRPAREN	
indexNode	TokenNameIdentifier	 index Node
(	TokenNameLPAREN	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
elemNode	TokenNameIdentifier	 elem Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
startDecls	TokenNameIdentifier	 start Decls
=	TokenNameEQUAL	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nDecls	TokenNameIdentifier	 n Decls
=	TokenNameEQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_pastFirstElement	TokenNameIdentifier	 m past First Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// SPECIAL CASE: Implied declaration at root element 	TokenNameCOMMENT_LINE	SPECIAL CASE: Implied declaration at root element 
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
"xml"	TokenNameStringLiteral	xml
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
declURL	TokenNameIdentifier	 decl URL
=	TokenNameEQUAL	
"http://www.w3.org/XML/1998/namespace"	TokenNameStringLiteral	http://www.w3.org/XML/1998/namespace
;	TokenNameSEMICOLON	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
declURL	TokenNameIdentifier	 decl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
m_valueIndex	TokenNameIdentifier	 m value Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pastFirstElement	TokenNameIdentifier	 m past First Element
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
startDecls	TokenNameIdentifier	 start Decls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nDecls	TokenNameIdentifier	 n Decls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
declURL	TokenNameIdentifier	 decl URL
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
declURL	TokenNameIdentifier	 decl URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
m_valueIndex	TokenNameIdentifier	 m value Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
attrUri	TokenNameIdentifier	 attr Uri
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrQName	TokenNameIdentifier	 attr Q Name
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
valString	TokenNameIdentifier	 val String
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeType	TokenNameIdentifier	 node Type
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
attrLocalName	TokenNameIdentifier	 attr Local Name
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
attrQName	TokenNameIdentifier	 attr Q Name
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
attrQName	TokenNameIdentifier	 attr Q Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xmlns"	TokenNameStringLiteral	xmlns
)	TokenNameRPAREN	
||	TokenNameOR_OR	
attrQName	TokenNameIdentifier	 attr Q Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"xmlns:"	TokenNameStringLiteral	xmlns:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
attrQName	TokenNameIdentifier	 attr Q Name
,	TokenNameCOMMA	
attrUri	TokenNameIdentifier	 attr Uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
declAlreadyDeclared	TokenNameIdentifier	 decl Already Declared
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// go to the next attribute. 	TokenNameCOMMENT_LINE	go to the next attribute. 
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nodeType	TokenNameIdentifier	 node Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_buildIdIndex	TokenNameIdentifier	 m build Id Index
&&	TokenNameAND_AND	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"ID"	TokenNameStringLiteral	ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setIDAttribute	TokenNameIdentifier	 set ID Attribute
(	TokenNameLPAREN	
valString	TokenNameIdentifier	 val String
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Bit of a hack... if somehow valString is null, stringToIndex will 	TokenNameCOMMENT_LINE	Bit of a hack... if somehow valString is null, stringToIndex will 
// return -1, which will make things very unhappy. 	TokenNameCOMMENT_LINE	return -1, which will make things very unhappy. 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
valString	TokenNameIdentifier	 val String
)	TokenNameRPAREN	
valString	TokenNameIdentifier	 val String
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
valString	TokenNameIdentifier	 val String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
m_valueIndex	TokenNameIdentifier	 m value Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attrLocalName	TokenNameIdentifier	 attr Local Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
attrQName	TokenNameIdentifier	 attr Q Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
attrQName	TokenNameIdentifier	 attr Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
exName	TokenNameIdentifier	 ex Name
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
attrUri	TokenNameIdentifier	 attr Uri
,	TokenNameCOMMA	
attrLocalName	TokenNameIdentifier	 attr Local Name
,	TokenNameCOMMA	
nodeType	TokenNameIdentifier	 node Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
nodeType	TokenNameIdentifier	 node Type
,	TokenNameCOMMA	
exName	TokenNameIdentifier	 ex Name
,	TokenNameCOMMA	
elemNode	TokenNameIdentifier	 elem Node
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_wsfilter	TokenNameIdentifier	 m wsfilter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
wsv	TokenNameIdentifier	 wsv
=	TokenNameEQUAL	
m_wsfilter	TokenNameIdentifier	 m wsfilter
.	TokenNameDOT	
getShouldStripSpace	TokenNameIdentifier	 get Should Strip Space
(	TokenNameLPAREN	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
elemNode	TokenNameIdentifier	 elem Node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
shouldStrip	TokenNameIdentifier	 should Strip
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
.	TokenNameDOT	
INHERIT	TokenNameIdentifier	 INHERIT
==	TokenNameEQUAL_EQUAL	
wsv	TokenNameIdentifier	 wsv
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getShouldStripWhitespace	TokenNameIdentifier	 get Should Strip Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
.	TokenNameDOT	
STRIP	TokenNameIdentifier	 STRIP
==	TokenNameEQUAL_EQUAL	
wsv	TokenNameIdentifier	 wsv
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pushShouldStripWhitespace	TokenNameIdentifier	 push Should Strip Whitespace
(	TokenNameLPAREN	
shouldStrip	TokenNameIdentifier	 should Strip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for the children. 	TokenNameCOMMENT_LINE	for the children. 
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * <p>By default, do nothing. Application writers may override this * method in a subclass to take specific actions at the end of * each element (such as finalising a tree node or writing * output to a file).</p> * * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param qName The qualified XML 1.0 name (with prefix), or the * empty string if qualified names are not available. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endElement */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * <p>By default, do nothing. Application writers may override this method in a subclass to take specific actions at the end of each element (such as finalising a tree node or writing output to a file).</p> * @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param qName The qualified XML 1.0 name (with prefix), or the empty string if qualified names are not available. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endElement 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If no one noticed, startPrefixMapping is a drag. 	TokenNameCOMMENT_LINE	If no one noticed, startPrefixMapping is a drag. 
// Pop the context for the last child (the one pushed by startElement) 	TokenNameCOMMENT_LINE	Pop the context for the last child (the one pushed by startElement) 
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do it again for this one (the one pushed by the last endElement). 	TokenNameCOMMENT_LINE	Do it again for this one (the one pushed by the last endElement). 
int	TokenNameint	
topContextIndex	TokenNameIdentifier	 top Context Index
=	TokenNameEQUAL	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
topContextIndex	TokenNameIdentifier	 top Context Index
!=	TokenNameNOT_EQUAL	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
topContextIndex	TokenNameIdentifier	 top Context Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popShouldStripWhitespace	TokenNameIdentifier	 pop Should Strip Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report an XML comment anywhere in the document. * * <p>This callback will be used for comments inside or outside the * document element, including comments in the external DTD * subset (if read).</p> * * @param ch An array holding the characters in the comment. * @param start The starting position in the array. * @param length The number of characters to use from the array. * @throws SAXException The application may raise an exception. */	TokenNameCOMMENT_JAVADOC	 Report an XML comment anywhere in the document. * <p>This callback will be used for comments inside or outside the document element, including comments in the external DTD subset (if read).</p> * @param ch An array holding the characters in the comment. @param start The starting position in the array. @param length The number of characters to use from the array. @throws SAXException The application may raise an exception. 
public	TokenNamepublic	
void	TokenNamevoid	
comment	TokenNameIdentifier	 comment
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_insideDTD	TokenNameIdentifier	 m inside DTD
)	TokenNameRPAREN	
// ignore comments if we're inside the DTD 	TokenNameCOMMENT_LINE	ignore comments if we're inside the DTD 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// %OPT% Saving the comment string in a Vector has a lower cost than 	TokenNameCOMMENT_LINE	%OPT% Saving the comment string in a Vector has a lower cost than 
// saving it in DTMStringPool. 	TokenNameCOMMENT_LINE	saving it in DTMStringPool. 
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_valueIndex	TokenNameIdentifier	 m value Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the beginning of the document. * * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#startDocument */	TokenNameCOMMENT_JAVADOC	 Receive notification of the beginning of the document. * @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#startDocument 
public	TokenNamepublic	
void	TokenNamevoid	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_contextIndexes	TokenNameIdentifier	 m context Indexes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_prefixMappings	TokenNameIdentifier	 m prefix Mappings
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for the next element. 	TokenNameCOMMENT_LINE	for the next element. 
}	TokenNameRBRACE	
/** * Receive notification of the end of the document. * * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#endDocument */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of the document. * @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#endDocument 
public	TokenNamepublic	
void	TokenNamevoid	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add a NULL entry to the end of the node arrays as 	TokenNameCOMMENT_LINE	Add a NULL entry to the end of the node arrays as 
// the end indication. 	TokenNameCOMMENT_LINE	the end indication. 
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the cached references after the document is built. 	TokenNameCOMMENT_LINE	Set the cached references after the document is built. 
m_extendedTypes	TokenNameIdentifier	 m extended Types
=	TokenNameEQUAL	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getExtendedTypes	TokenNameIdentifier	 get Extended Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exptype_map	TokenNameIdentifier	 m exptype map
=	TokenNameEQUAL	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextsib_map	TokenNameIdentifier	 m nextsib map
=	TokenNameEQUAL	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_firstch_map	TokenNameIdentifier	 m firstch map
=	TokenNameEQUAL	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parent_map	TokenNameIdentifier	 m parent map
=	TokenNameEQUAL	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct the node map from the node. * * @param type raw type ID, one of DTM.XXX_NODE. * @param expandedTypeID The expended type ID. * @param parentIndex The current parent index. * @param previousSibling The previous sibling index. * @param dataOrPrefix index into m_data table, or string handle. * @param canHaveFirstChild true if the node can have a first child, false * if it is atomic. * * @return The index identity of the node that was added. */	TokenNameCOMMENT_JAVADOC	 Construct the node map from the node. * @param type raw type ID, one of DTM.XXX_NODE. @param expandedTypeID The expended type ID. @param parentIndex The current parent index. @param previousSibling The previous sibling index. @param dataOrPrefix index into m_data table, or string handle. @param canHaveFirstChild true if the node can have a first child, false if it is atomic. * @return The index identity of the node that was added. 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
,	TokenNameCOMMA	
int	TokenNameint	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
int	TokenNameint	
previousSibling	TokenNameIdentifier	 previous Sibling
,	TokenNameCOMMA	
int	TokenNameint	
dataOrPrefix	TokenNameIdentifier	 data Or Prefix
,	TokenNameCOMMA	
boolean	TokenNameboolean	
canHaveFirstChild	TokenNameIdentifier	 can Have First Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Common to all nodes: 	TokenNameCOMMENT_LINE	Common to all nodes: 
int	TokenNameint	
nodeIndex	TokenNameIdentifier	 node Index
=	TokenNameEQUAL	
m_size	TokenNameIdentifier	 m size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Have we overflowed a DTM Identity's addressing range? 	TokenNameCOMMENT_LINE	Have we overflowed a DTM Identity's addressing range? 
//if(m_dtmIdent.size() == (nodeIndex>>>DTMManager.IDENT_DTM_NODE_BITS)) 	TokenNameCOMMENT_LINE	if(m_dtmIdent.size() == (nodeIndex>>>DTMManager.IDENT_DTM_NODE_BITS)) 
if	TokenNameif	
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
==	TokenNameEQUAL_EQUAL	
m_maxNodeIndex	TokenNameIdentifier	 m max Node Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addNewDTMID	TokenNameIdentifier	 add New DTMID
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_maxNodeIndex	TokenNameIdentifier	 m max Node Index
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_parent	TokenNameIdentifier	 m parent
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
parentIndex	TokenNameIdentifier	 parent Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_exptype	TokenNameIdentifier	 m exptype
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
expandedTypeID	TokenNameIdentifier	 expanded Type ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
dataOrPrefix	TokenNameIdentifier	 data Or Prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_prevsib	TokenNameIdentifier	 m prevsib
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prevsib	TokenNameIdentifier	 m prevsib
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
previousSibling	TokenNameIdentifier	 previous Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_locator	TokenNameIdentifier	 m locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_useSourceLocationProperty	TokenNameIdentifier	 m use Source Location Property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setSourceLocation	TokenNameIdentifier	 set Source Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Note that nextSibling is not processed until charactersFlush() 	TokenNameCOMMENT_LINE	Note that nextSibling is not processed until charactersFlush() 
// is called, to handle successive characters() events. 	TokenNameCOMMENT_LINE	is called, to handle successive characters() events. 
// Special handling by type: Declare namespaces, attach first child 	TokenNameCOMMENT_LINE	Special handling by type: Declare namespaces, attach first child 
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
:	TokenNameCOLON	
declareNamespaceInContext	TokenNameIdentifier	 declare Namespace In Context
(	TokenNameLPAREN	
parentIndex	TokenNameIdentifier	 parent Index
,	TokenNameCOMMA	
nodeIndex	TokenNameIdentifier	 node Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
previousSibling	TokenNameIdentifier	 previous Sibling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nextsib	TokenNameIdentifier	 m nextsib
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
previousSibling	TokenNameIdentifier	 previous Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
parentIndex	TokenNameIdentifier	 parent Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_firstch	TokenNameIdentifier	 m firstch
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
nodeIndex	TokenNameIdentifier	 node Index
,	TokenNameCOMMA	
parentIndex	TokenNameIdentifier	 parent Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nodeIndex	TokenNameIdentifier	 node Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check whether accumulated text should be stripped; if not, * append the appropriate flavor of text/cdata node. */	TokenNameCOMMENT_JAVADOC	 Check whether accumulated text should be stripped; if not, append the appropriate flavor of text/cdata node. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// -1 indicates no-text-in-progress 	TokenNameCOMMENT_LINE	-1 indicates no-text-in-progress 
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doStrip	TokenNameIdentifier	 do Strip
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getShouldStripWhitespace	TokenNameIdentifier	 get Should Strip Whitespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doStrip	TokenNameIdentifier	 do Strip
=	TokenNameEQUAL	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
isWhitespace	TokenNameIdentifier	 is Whitespace
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
doStrip	TokenNameIdentifier	 do Strip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Discard accumulated text 	TokenNameCOMMENT_LINE	Discard accumulated text 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Guard against characters/ignorableWhitespace events that 	TokenNameCOMMENT_LINE	Guard against characters/ignorableWhitespace events that 
// contained no characters. They should not result in a node. 	TokenNameCOMMENT_LINE	contained no characters. They should not result in a node. 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the offset and length do not exceed the given limits 	TokenNameCOMMENT_LINE	If the offset and length do not exceed the given limits 
// (offset < 2^21 and length < 2^10), then save both the offset 	TokenNameCOMMENT_LINE	(offset < 2^21 and length < 2^10), then save both the offset 
// and length in a bitwise encoded value. 	TokenNameCOMMENT_LINE	and length in a bitwise encoded value. 
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
&&	TokenNameAND_AND	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
<=	TokenNameLESS_EQUAL	
TEXT_OFFSET_MAX	TokenNameIdentifier	 TEXT  OFFSET  MAX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
m_coalescedTextType	TokenNameIdentifier	 m coalesced Text Type
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
<<	TokenNameLEFT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Store offset and length in the m_data array if one exceeds 	TokenNameCOMMENT_LINE	Store offset and length in the m_data array if one exceeds 
// the given limits. Use a negative dataIndex as an indication. 	TokenNameCOMMENT_LINE	the given limits. Use a negative dataIndex as an indication. 
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
m_coalescedTextType	TokenNameIdentifier	 m coalesced Text Type
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Reset for next text block 	TokenNameCOMMENT_LINE	Reset for next text block 
m_textPendingStart	TokenNameIdentifier	 m text Pending Start
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_textType	TokenNameIdentifier	 m text Type
=	TokenNameEQUAL	
m_coalescedTextType	TokenNameIdentifier	 m coalesced Text Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Override the processingInstruction() interface in SAX2DTM2. * <p> * %OPT% This one is different from SAX2DTM.processingInstruction() * in that we do not use extended types for PI nodes. The name of * the PI is saved in the DTMStringPool. * * Receive notification of a processing instruction. * * @param target The processing instruction target. * @param data The processing instruction data, or null if * none is supplied. * @throws SAXException Any SAX exception, possibly * wrapping another exception. * @see org.xml.sax.ContentHandler#processingInstruction */	TokenNameCOMMENT_JAVADOC	 Override the processingInstruction() interface in SAX2DTM2. <p> %OPT% This one is different from SAX2DTM.processingInstruction() in that we do not use extended types for PI nodes. The name of the PI is saved in the DTMStringPool. * Receive notification of a processing instruction. * @param target The processing instruction target. @param data The processing instruction data, or null if none is supplied. @throws SAXException Any SAX exception, possibly wrapping another exception. @see org.xml.sax.ContentHandler#processingInstruction 
public	TokenNamepublic	
void	TokenNamevoid	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
charactersFlush	TokenNameIdentifier	 characters Flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_previous	TokenNameIdentifier	 m previous
=	TokenNameEQUAL	
addNode	TokenNameIdentifier	 add Node
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
,	TokenNameCOMMA	
m_parents	TokenNameIdentifier	 m parents
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_previous	TokenNameIdentifier	 m previous
,	TokenNameCOMMA	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
stringToIndex	TokenNameIdentifier	 string To Index
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
m_valueIndex	TokenNameIdentifier	 m value Index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase.getFirstAttribute(). * <p> * Given a node handle, get the index of the node's first attribute. * * @param nodeHandle int Handle of the node. * @return Handle of first attribute, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase.getFirstAttribute(). <p> Given a node handle, get the index of the node's first attribute. * @param nodeHandle int Handle of the node. @return Handle of first attribute, or DTM.NULL to indicate none exists. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume that attributes and namespaces immediately follow the element. 	TokenNameCOMMENT_LINE	Assume that attributes and namespaces immediately follow the element. 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeID	TokenNameIdentifier	 node ID
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Assume this can not be null. 	TokenNameCOMMENT_LINE	Assume this can not be null. 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase.getFirstAttributeIdentity(int). * <p> * Given a node identity, get the index of the node's first attribute. * * @param identity int identity of the node. * @return Identity of first attribute, or DTM.NULL to indicate none exists. */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase.getFirstAttributeIdentity(int). <p> Given a node identity, get the index of the node's first attribute. * @param identity int identity of the node. @return Identity of first attribute, or DTM.NULL to indicate none exists. 
protected	TokenNameprotected	
int	TokenNameint	
getFirstAttributeIdentity	TokenNameIdentifier	 get First Attribute Identity
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume that attributes and namespaces immediately follow the element. 	TokenNameCOMMENT_LINE	Assume that attributes and namespaces immediately follow the element. 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
identity	TokenNameIdentifier	 identity
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Assume this can not be null. 	TokenNameCOMMENT_LINE	Assume this can not be null. 
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase.getNextAttributeIdentity(int). * <p> * Given a node identity for an attribute, advance to the next attribute. * * @param identity int identity of the attribute node. This * <strong>must</strong> be an attribute node. * * @return int DTM node-identity of the resolved attr, * or DTM.NULL to indicate none exists. * */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase.getNextAttributeIdentity(int). <p> Given a node identity for an attribute, advance to the next attribute. * @param identity int identity of the attribute node. This <strong>must</strong> be an attribute node. * @return int DTM node-identity of the resolved attr, or DTM.NULL to indicate none exists. 
protected	TokenNameprotected	
int	TokenNameint	
getNextAttributeIdentity	TokenNameIdentifier	 get Next Attribute Identity
(	TokenNameLPAREN	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Assume that attributes and namespace nodes immediately follow the element 	TokenNameCOMMENT_LINE	Assume that attributes and namespace nodes immediately follow the element 
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
identity	TokenNameIdentifier	 identity
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of DTMDefaultBase.getTypedAttribute(int, int). * <p> * Given a node handle and an expanded type ID, get the index of the node's * attribute of that type, if any. * * @param nodeHandle int Handle of the node. * @param attType int expanded type ID of the required attribute. * @return Handle of attribute of the required type, or DTM.NULL to indicate * none exists. */	TokenNameCOMMENT_JAVADOC	 The optimized version of DTMDefaultBase.getTypedAttribute(int, int). <p> Given a node handle and an expanded type ID, get the index of the node's attribute of that type, if any. * @param nodeHandle int Handle of the node. @param attType int expanded type ID of the required attribute. @return Handle of attribute of the required type, or DTM.NULL to indicate none exists. 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
getTypedAttribute	TokenNameIdentifier	 get Typed Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
int	TokenNameint	
attType	TokenNameIdentifier	 att Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeID	TokenNameIdentifier	 node ID
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
expType	TokenNameIdentifier	 exp Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
==	TokenNameEQUAL_EQUAL	
attType	TokenNameIdentifier	 att Type
)	TokenNameRPAREN	
return	TokenNamereturn	
makeNodeHandle	TokenNameIdentifier	 make Node Handle
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
!=	TokenNameNOT_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override SAX2DTM.getLocalName() in SAX2DTM2. * <p>Processing for PIs is different. * * Given a node handle, return its XPath- style localname. (As defined in * Namespaces, this is the portion of the name after any colon character). * * @param nodeHandle the id of the node. * @return String Local name of this node. */	TokenNameCOMMENT_JAVADOC	 Override SAX2DTM.getLocalName() in SAX2DTM2. <p>Processing for PIs is different. * Given a node handle, return its XPath- style localname. (As defined in Namespaces, this is the portion of the name after any colon character). * @param nodeHandle the id of the node. @return String Local name of this node. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
expType	TokenNameIdentifier	 exp Type
=	TokenNameEQUAL	
_exptype	TokenNameIdentifier	 exptype
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
m_expandedNameTable	TokenNameIdentifier	 m expanded Name Table
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
expType	TokenNameIdentifier	 exp Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of SAX2DTM.getNodeNameX(). * <p> * Given a node handle, return the XPath node name. This should be the name * as described by the XPath data model, NOT the DOM- style name. * * @param nodeHandle the id of the node. * @return String Name of this node, which may be an empty string. */	TokenNameCOMMENT_JAVADOC	 The optimized version of SAX2DTM.getNodeNameX(). <p> Given a node handle, return the XPath node name. This should be the name as described by the XPath data model, NOT the DOM- style name. * @param nodeHandle the id of the node. @return String Name of this node, which may be an empty string. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
eType	TokenNameIdentifier	 e Type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
ExtendedType	TokenNameIdentifier	 Extended Type
extType	TokenNameIdentifier	 ext Type
=	TokenNameEQUAL	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
eType	TokenNameIdentifier	 e Type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
qnameIndex	TokenNameIdentifier	 qname Index
;	TokenNameSEMICOLON	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The optimized version of SAX2DTM.getNodeName(). * <p> * Given a node handle, return its DOM-style node name. This will include * names such as #text or #document. * * @param nodeHandle the id of the node. * @return String Name of this node, which may be an empty string. * %REVIEW% Document when empty string is possible... * %REVIEW-COMMENT% It should never be empty, should it? */	TokenNameCOMMENT_JAVADOC	 The optimized version of SAX2DTM.getNodeName(). <p> Given a node handle, return its DOM-style node name. This will include names such as #text or #document. * @param nodeHandle the id of the node. @return String Name of this node, which may be an empty string. %REVIEW% Document when empty string is possible... %REVIEW-COMMENT% It should never be empty, should it? 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ExtendedType	TokenNameIdentifier	 Extended Type
extType	TokenNameIdentifier	 ext Type
=	TokenNameEQUAL	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
eType	TokenNameIdentifier	 e Type
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
"xmlns"	TokenNameStringLiteral	xmlns
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
"xmlns:"	TokenNameStringLiteral	xmlns:
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFixedNames	TokenNameIdentifier	 get Fixed Names
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
qnameIndex	TokenNameIdentifier	 qname Index
;	TokenNameSEMICOLON	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Override SAX2DTM.getStringValue(int) * <p> * This method is only used by Xalan-J Interpretive. It is not used by XSLTC. * <p> * If the caller supplies an XMLStringFactory, the getStringValue() interface * in SAX2DTM will be called. Otherwise just calls getStringValueX() and * wraps the returned String in an XMLString. * * Get the string-value of a node as a String object * (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). * * @param nodeHandle The node ID. * * @return A string object that represents the string-value of the given node. */	TokenNameCOMMENT_JAVADOC	 Override SAX2DTM.getStringValue(int) <p> This method is only used by Xalan-J Interpretive. It is not used by XSLTC. <p> If the caller supplies an XMLStringFactory, the getStringValue() interface in SAX2DTM will be called. Otherwise just calls getStringValueX() and wraps the returned String in an XMLString. * Get the string-value of a node as a String object (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). * @param nodeHandle The node ID. * @return A string object that represents the string-value of the given node. 
public	TokenNamepublic	
XMLString	TokenNameIdentifier	 XML String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_XML_STR	TokenNameIdentifier	 EMPTY  XML  STR
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
_firstch2	TokenNameIdentifier	 firstch2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
identity	TokenNameIdentifier	 identity
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_xstrf	TokenNameIdentifier	 m xstrf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_xstrf	TokenNameIdentifier	 m xstrf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
EMPTY_XML_STR	TokenNameIdentifier	 EMPTY  XML  STR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
EMPTY_XML_STR	TokenNameIdentifier	 EMPTY  XML  STR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_xstrf	TokenNameIdentifier	 m xstrf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_xstrf	TokenNameIdentifier	 m xstrf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_xstrf	TokenNameIdentifier	 m xstrf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_xstrf	TokenNameIdentifier	 m xstrf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_xstrf	TokenNameIdentifier	 m xstrf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_xstrf	TokenNameIdentifier	 m xstrf
.	TokenNameDOT	
newstr	TokenNameIdentifier	 newstr
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
XMLStringDefault	TokenNameIdentifier	 XML String Default
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The optimized version of SAX2DTM.getStringValue(int). * <p> * %OPT% This is one of the most often used interfaces. Performance is * critical here. This one is different from SAX2DTM.getStringValue(int) in * that it returns a String instead of a XMLString. * * Get the string- value of a node as a String object (see http: //www. w3. * org/TR/xpath#data- model for the definition of a node's string- value). * * @param nodeHandle The node ID. * * @return A string object that represents the string-value of the given node. */	TokenNameCOMMENT_JAVADOC	 The optimized version of SAX2DTM.getStringValue(int). <p> %OPT% This is one of the most often used interfaces. Performance is critical here. This one is different from SAX2DTM.getStringValue(int) in that it returns a String instead of a XMLString. * Get the string- value of a node as a String object (see http: //www. w3. org/TR/xpath#data- model for the definition of a node's string- value). * @param nodeHandle The node ID. * @return A string object that represents the string-value of the given node. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getStringValueX	TokenNameIdentifier	 get String Value X
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
_firstch2	TokenNameIdentifier	 firstch2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
identity	TokenNameIdentifier	 identity
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the string value of the entire tree */	TokenNameCOMMENT_JAVADOC	 Returns the string value of the entire tree 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
_firstch2	TokenNameIdentifier	 firstch2
(	TokenNameLPAREN	
ROOTNODE	TokenNameIdentifier	 ROOTNODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
;	TokenNameSEMICOLON	
// optimization: only create StringBuffer if > 1 child 	TokenNameCOMMENT_LINE	optimization: only create StringBuffer if > 1 child 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
_nextsib2	TokenNameIdentifier	 nextsib2
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
getStringValueX	TokenNameIdentifier	 get String Value X
(	TokenNameLPAREN	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The optimized version of SAX2DTM.dispatchCharactersEvents(int, ContentHandler, boolean). * <p> * Directly call the * characters method on the passed ContentHandler for the * string-value of the given node (see http://www.w3.org/TR/xpath#data-model * for the definition of a node's string-value). Multiple calls to the * ContentHandler's characters methods may well occur for a single call to * this method. * * @param nodeHandle The node ID. * @param ch A non-null reference to a ContentHandler. * @param normalize true if the content should be normalized according to * the rules for the XPath * <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a> * function. * * @throws SAXException */	TokenNameCOMMENT_JAVADOC	 The optimized version of SAX2DTM.dispatchCharactersEvents(int, ContentHandler, boolean). <p> Directly call the characters method on the passed ContentHandler for the string-value of the given node (see http://www.w3.org/TR/xpath#data-model for the definition of a node's string-value). Multiple calls to the ContentHandler's characters methods may well occur for a single call to this method. * @param nodeHandle The node ID. @param ch A non-null reference to a ContentHandler. @param normalize true if the content should be normalized according to the rules for the XPath <a href="http://www.w3.org/TR/xpath#function-normalize-space">normalize-space</a> function. * @throws SAXException 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
,	TokenNameCOMMA	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
boolean	TokenNameboolean	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
startNode	TokenNameIdentifier	 start Node
=	TokenNameEQUAL	
identity	TokenNameIdentifier	 identity
;	TokenNameSEMICOLON	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
_firstch2	TokenNameIdentifier	 firstch2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
length	TokenNameIdentifier	 length
+=	TokenNamePLUS_EQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
identity	TokenNameIdentifier	 identity
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
_parent2	TokenNameIdentifier	 parent2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
startNode	TokenNameIdentifier	 start Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
normalize	TokenNameIdentifier	 normalize
)	TokenNameRPAREN	
FastStringBuffer	TokenNameIdentifier	 Fast String Buffer
.	TokenNameDOT	
sendNormalizedSAXcharacters	TokenNameIdentifier	 send Normalized SA Xcharacters
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a node handle, return its node value. This is mostly * as defined by the DOM, but may ignore some conveniences. * <p> * * @param nodeHandle The node id. * @return String Value of this node, or null if not * meaningful for this node type. */	TokenNameCOMMENT_JAVADOC	 Given a node handle, return its node value. This is mostly as defined by the DOM, but may ignore some conveniences. <p> * @param nodeHandle The node id. @return String Value of this node, or null if not meaningful for this node type. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
identity	TokenNameIdentifier	 identity
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
||	TokenNameOR_OR	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
identity	TokenNameIdentifier	 identity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy the String value of a Text node to a SerializationHandler */	TokenNameCOMMENT_JAVADOC	 Copy the String value of a Text node to a SerializationHandler 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
copyTextNode	TokenNameIdentifier	 copy Text Node
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
TEXT_LENGTH_BITS	TokenNameIdentifier	 TEXT  LENGTH  BITS
,	TokenNameCOMMA	
dataIndex	TokenNameIdentifier	 data Index
&	TokenNameAND	
TEXT_LENGTH_MAX	TokenNameIdentifier	 TEXT  LENGTH  MAX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_chars	TokenNameIdentifier	 m chars
.	TokenNameDOT	
sendSAXcharacters	TokenNameIdentifier	 send SA Xcharacters
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy an Element node to a SerializationHandler. * * @param nodeID The node identity * @param exptype The expanded type of the Element node * @param handler The SerializationHandler * @return The qualified name of the Element node. */	TokenNameCOMMENT_JAVADOC	 Copy an Element node to a SerializationHandler. * @param nodeID The node identity @param exptype The expanded type of the Element node @param handler The SerializationHandler @return The qualified name of the Element node. 
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
copyElement	TokenNameIdentifier	 copy Element
(	TokenNameLPAREN	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
,	TokenNameCOMMA	
int	TokenNameint	
exptype	TokenNameIdentifier	 exptype
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
ExtendedType	TokenNameIdentifier	 Extended Type
extType	TokenNameIdentifier	 ext Type
=	TokenNameEQUAL	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
exptype	TokenNameIdentifier	 exptype
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
EMPTY_STR	TokenNameIdentifier	 EMPTY  STR
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
qnameIndex	TokenNameIdentifier	 qname Index
;	TokenNameSEMICOLON	
qnameIndex	TokenNameIdentifier	 qname Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
qName	TokenNameIdentifier	 q Name
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
qnameIndex	TokenNameIdentifier	 qname Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
qName	TokenNameIdentifier	 q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qName	TokenNameIdentifier	 q Name
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
qName	TokenNameIdentifier	 q Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy namespace nodes. * * @param nodeID The Element node identity * @param handler The SerializationHandler * @param inScope true if all namespaces in scope should be copied, * false if only the namespace declarations should be copied. */	TokenNameCOMMENT_JAVADOC	 Copy namespace nodes. * @param nodeID The Element node identity @param handler The SerializationHandler @param inScope true if all namespaces in scope should be copied, false if only the namespace declarations should be copied. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
copyNS	TokenNameIdentifier	 copy NS
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
boolean	TokenNameboolean	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// %OPT% Optimization for documents which does not have any explicit 	TokenNameCOMMENT_LINE	%OPT% Optimization for documents which does not have any explicit 
// namespace nodes. For these documents, there is an implicit 	TokenNameCOMMENT_LINE	namespace nodes. For these documents, there is an implicit 
// namespace node (xmlns:xml="http://www.w3.org/XML/1998/namespace") 	TokenNameCOMMENT_LINE	namespace node (xmlns:xml="http://www.w3.org/XML/1998/namespace") 
// declared on the root element node. In this case, there is no 	TokenNameCOMMENT_LINE	declared on the root element node. In this case, there is no 
// need to do namespace copying. We can safely return without 	TokenNameCOMMENT_LINE	need to do namespace copying. We can safely return without 
// doing anything. 	TokenNameCOMMENT_LINE	doing anything. 
if	TokenNameif	
(	TokenNameLPAREN	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_namespaceDeclSetElements	TokenNameIdentifier	 m namespace Decl Set Elements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
)	TokenNameRPAREN	
m_namespaceDeclSets	TokenNameIdentifier	 m namespace Decl Sets
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
SuballocatedIntVector	TokenNameIdentifier	 Suballocated Int Vector
nsContext	TokenNameIdentifier	 ns Context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextNSNode	TokenNameIdentifier	 next NS Node
;	TokenNameSEMICOLON	
// Find the first namespace node 	TokenNameCOMMENT_LINE	Find the first namespace node 
if	TokenNameif	
(	TokenNameLPAREN	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nsContext	TokenNameIdentifier	 ns Context
=	TokenNameEQUAL	
findNamespaceContext	TokenNameIdentifier	 find Namespace Context
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nsContext	TokenNameIdentifier	 ns Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
else	TokenNameelse	
nextNSNode	TokenNameIdentifier	 next NS Node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
nextNSNode	TokenNameIdentifier	 next NS Node
=	TokenNameEQUAL	
getNextNamespaceNode2	TokenNameIdentifier	 get Next Namespace Node2
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nsIndex	TokenNameIdentifier	 ns Index
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextNSNode	TokenNameIdentifier	 next NS Node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Retrieve the name of the namespace node 	TokenNameCOMMENT_LINE	Retrieve the name of the namespace node 
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
nextNSNode	TokenNameIdentifier	 next NS Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
eType	TokenNameIdentifier	 e Type
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Retrieve the node value of the namespace node 	TokenNameCOMMENT_LINE	Retrieve the node value of the namespace node 
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_dataOrQName	TokenNameIdentifier	 m data Or Q Name
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
nextNSNode	TokenNameIdentifier	 next NS Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
nodeValue	TokenNameIdentifier	 node Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
nodeValue	TokenNameIdentifier	 node Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inScope	TokenNameIdentifier	 in Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nsIndex	TokenNameIdentifier	 ns Index
<	TokenNameLESS	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextNSNode	TokenNameIdentifier	 next NS Node
=	TokenNameEQUAL	
makeNodeIdentity	TokenNameIdentifier	 make Node Identity
(	TokenNameLPAREN	
nsContext	TokenNameIdentifier	 ns Context
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
nsIndex	TokenNameIdentifier	 ns Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nsIndex	TokenNameIdentifier	 ns Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
nextNSNode	TokenNameIdentifier	 next NS Node
=	TokenNameEQUAL	
getNextNamespaceNode2	TokenNameIdentifier	 get Next Namespace Node2
(	TokenNameLPAREN	
nextNSNode	TokenNameIdentifier	 next NS Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Return the next namespace node following the given base node. * * @baseID The node identity of the base node, which can be an * element, attribute or namespace node. * @return The namespace node immediately following the base node. */	TokenNameCOMMENT_JAVADOC	 Return the next namespace node following the given base node. * @baseID The node identity of the base node, which can be an element, attribute or namespace node. @return The namespace node immediately following the base node. 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
getNextNamespaceNode2	TokenNameIdentifier	 get Next Namespace Node2
(	TokenNameLPAREN	
int	TokenNameint	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_type2	TokenNameIdentifier	 type2
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
baseID	TokenNameIdentifier	 base ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
return	TokenNamereturn	
baseID	TokenNameIdentifier	 base ID
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copy attribute nodes from an element . * * @param nodeID The Element node identity * @param handler The SerializationHandler */	TokenNameCOMMENT_JAVADOC	 Copy attribute nodes from an element . * @param nodeID The Element node identity @param handler The SerializationHandler 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
copyAttributes	TokenNameIdentifier	 copy Attributes
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getFirstAttributeIdentity	TokenNameIdentifier	 get First Attribute Identity
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
getNextAttributeIdentity	TokenNameIdentifier	 get Next Attribute Identity
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
eType	TokenNameIdentifier	 e Type
=	TokenNameEQUAL	
_exptype2	TokenNameIdentifier	 exptype2
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
copyAttribute	TokenNameIdentifier	 copy Attribute
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
eType	TokenNameIdentifier	 e Type
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Copy an Attribute node to a SerializationHandler * * @param nodeID The node identity * @param exptype The expanded type of the Element node * @param handler The SerializationHandler */	TokenNameCOMMENT_JAVADOC	 Copy an Attribute node to a SerializationHandler * @param nodeID The node identity @param exptype The expanded type of the Element node @param handler The SerializationHandler 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
copyAttribute	TokenNameIdentifier	 copy Attribute
(	TokenNameLPAREN	
int	TokenNameint	
nodeID	TokenNameIdentifier	 node ID
,	TokenNameCOMMA	
int	TokenNameint	
exptype	TokenNameIdentifier	 exptype
,	TokenNameCOMMA	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
/* final String uri = getNamespaceName(node); if (uri.length() != 0) { final String prefix = getPrefix(node); handler.namespaceAfterStartElement(prefix, uri); } handler.addAttribute(getNodeName(node), getNodeValue(node)); */	TokenNameCOMMENT_BLOCK	 final String uri = getNamespaceName(node); if (uri.length() != 0) { final String prefix = getPrefix(node); handler.namespaceAfterStartElement(prefix, uri); } handler.addAttribute(getNodeName(node), getNodeValue(node)); 
final	TokenNamefinal	
ExtendedType	TokenNameIdentifier	 Extended Type
extType	TokenNameIdentifier	 ext Type
=	TokenNameEQUAL	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
exptype	TokenNameIdentifier	 exptype
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
extType	TokenNameIdentifier	 ext Type
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
dataIndex	TokenNameIdentifier	 data Index
=	TokenNameEQUAL	
_dataOrQName	TokenNameIdentifier	 data Or Q Name
(	TokenNameLPAREN	
nodeID	TokenNameIdentifier	 node ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
valueIndex	TokenNameIdentifier	 value Index
=	TokenNameEQUAL	
dataIndex	TokenNameIdentifier	 data Index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dataIndex	TokenNameIdentifier	 data Index
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prefixIndex	TokenNameIdentifier	 prefix Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valueIndex	TokenNameIdentifier	 value Index
=	TokenNameEQUAL	
m_data	TokenNameIdentifier	 m data
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
-	TokenNameMINUS	
dataIndex	TokenNameIdentifier	 data Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qname	TokenNameIdentifier	 qname
=	TokenNameEQUAL	
m_valuesOrPrefixes	TokenNameIdentifier	 m values Or Prefixes
.	TokenNameDOT	
indexToString	TokenNameIdentifier	 index To String
(	TokenNameLPAREN	
prefixIndex	TokenNameIdentifier	 prefix Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
colonIndex	TokenNameIdentifier	 colon Index
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colonIndex	TokenNameIdentifier	 colon Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
namespaceAfterStartElement	TokenNameIdentifier	 namespace After Start Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
nodeName	TokenNameIdentifier	 node Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
qname	TokenNameIdentifier	 qname
:	TokenNameCOLON	
localName	TokenNameIdentifier	 local Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
nodeValue	TokenNameIdentifier	 node Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
m_values	TokenNameIdentifier	 m values
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
valueIndex	TokenNameIdentifier	 value Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
nodeName	TokenNameIdentifier	 node Name
,	TokenNameCOMMA	
nodeValue	TokenNameIdentifier	 node Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
