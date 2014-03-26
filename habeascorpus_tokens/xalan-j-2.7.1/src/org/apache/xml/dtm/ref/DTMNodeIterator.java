/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMNodeIterator.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMNodeIterator.java 468653 2006-10-28 07:07:05Z minchau $ 
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
DTMDOMException	TokenNameIdentifier	 DTMDOM Exception
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
/** * <code>DTMNodeIterator</code> gives us an implementation of the * DTMNodeIterator which returns DOM nodes. * * Please note that this is not necessarily equivlaent to a DOM * NodeIterator operating over the same document. In particular: * <ul> * * <li>If there are several Text nodes in logical succession (ie, * across CDATASection and EntityReference boundaries), we will return * only the first; the caller is responsible for stepping through * them. * (%REVIEW% Provide a convenience routine here to assist, pending * proposed DOM Level 3 getAdjacentText() operation?) </li> * * <li>Since the whole XPath/XSLT architecture assumes that the source * document is not altered while we're working with it, we do not * promise to implement the DOM NodeIterator's "maintain current * position" response to document mutation. </li> * * <li>Since our design for XPath NodeIterators builds a stateful * filter directly into the traversal object, getNodeFilter() is not * supported.</li> * * </ul> * * <p>State: In progress!!</p> * */	TokenNameCOMMENT_JAVADOC	 <code>DTMNodeIterator</code> gives us an implementation of the DTMNodeIterator which returns DOM nodes. * Please note that this is not necessarily equivlaent to a DOM NodeIterator operating over the same document. In particular: <ul> * <li>If there are several Text nodes in logical succession (ie, across CDATASection and EntityReference boundaries), we will return only the first; the caller is responsible for stepping through them. (%REVIEW% Provide a convenience routine here to assist, pending proposed DOM Level 3 getAdjacentText() operation?) </li> * <li>Since the whole XPath/XSLT architecture assumes that the source document is not altered while we're working with it, we do not promise to implement the DOM NodeIterator's "maintain current position" response to document mutation. </li> * <li>Since our design for XPath NodeIterators builds a stateful filter directly into the traversal object, getNodeFilter() is not supported.</li> * </ul> * <p>State: In progress!!</p> 
public	TokenNamepublic	
class	TokenNameclass	
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
implements	TokenNameimplements	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
DTMIterator	TokenNameIdentifier	 DTM Iterator
dtm_iter	TokenNameIdentifier	 dtm iter
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// Methods unique to this class 	TokenNameCOMMENT_LINE	Methods unique to this class 
/** Public constructor: Wrap a DTMNodeIterator around an existing * and preconfigured DTMIterator * */	TokenNameCOMMENT_JAVADOC	 Public constructor: Wrap a DTMNodeIterator around an existing and preconfigured DTMIterator 
public	TokenNamepublic	
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
dtmIterator	TokenNameIdentifier	 dtm Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
dtm_iter	TokenNameIdentifier	 dtm iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
dtmIterator	TokenNameIdentifier	 dtm Iterator
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Access the wrapped DTMIterator. I'm not sure whether anyone will * need this or not, but let's write it and think about it. * */	TokenNameCOMMENT_JAVADOC	 Access the wrapped DTMIterator. I'm not sure whether anyone will need this or not, but let's write it and think about it. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
getDTMIterator	TokenNameIdentifier	 get DTM Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dtm_iter	TokenNameIdentifier	 dtm iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//================================================================ 	TokenNameCOMMENT_LINE	================================================================ 
// org.w3c.dom.traversal.NodeFilter API follows 	TokenNameCOMMENT_LINE	org.w3c.dom.traversal.NodeFilter API follows 
/** Detaches the NodeIterator from the set which it iterated over, * releasing any computational resources and placing the iterator in * the INVALID state. * */	TokenNameCOMMENT_JAVADOC	 Detaches the NodeIterator from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Theoretically, we could release dtm_iter at this point. But 	TokenNameCOMMENT_LINE	Theoretically, we could release dtm_iter at this point. But 
// some of the operations may still want to consult it even though 	TokenNameCOMMENT_LINE	some of the operations may still want to consult it even though 
// navigation is now invalid. 	TokenNameCOMMENT_LINE	navigation is now invalid. 
valid	TokenNameIdentifier	 valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The value of this flag determines whether the children * of entity reference nodes are visible to the iterator. * * @return false, always (the DTM model flattens entity references) * */	TokenNameCOMMENT_JAVADOC	 The value of this flag determines whether the children of entity reference nodes are visible to the iterator. * @return false, always (the DTM model flattens entity references) 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return a handle to the filter used to screen nodes. * * This is ill-defined in Xalan's usage of Nodeiterator, where we have * built stateful XPath-based filtering directly into the traversal * object. We could return something which supports the NodeFilter interface * and allows querying whether a given node would be permitted if it appeared * as our next node, but in the current implementation that would be very * complex -- and just isn't all that useful. * * @throws DOMException -- NOT_SUPPORTED_ERROR because I can't think * of anything more useful to do in this case * */	TokenNameCOMMENT_JAVADOC	 Return a handle to the filter used to screen nodes. * This is ill-defined in Xalan's usage of Nodeiterator, where we have built stateful XPath-based filtering directly into the traversal object. We could return something which supports the NodeFilter interface and allows querying whether a given node would be permitted if it appeared as our next node, but in the current implementation that would be very complex -- and just isn't all that useful. * @throws DOMException -- NOT_SUPPORTED_ERROR because I can't think of anything more useful to do in this case 
public	TokenNamepublic	
NodeFilter	TokenNameIdentifier	 Node Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMDOMException	TokenNameIdentifier	 DTMDOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return The root node of the NodeIterator, as specified * when it was created. * */	TokenNameCOMMENT_JAVADOC	 @return The root node of the NodeIterator, as specified when it was created. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
dtm_iter	TokenNameIdentifier	 dtm iter
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm_iter	TokenNameIdentifier	 dtm iter
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Return a mask describing which node types are presented via the * iterator. **/	TokenNameCOMMENT_JAVADOC	 Return a mask describing which node types are presented via the iterator. *
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
dtm_iter	TokenNameIdentifier	 dtm iter
.	TokenNameDOT	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return the next node in the set and advance the position of the * iterator in the set. * * @throws DOMException - INVALID_STATE_ERR Raised if this method is * called after the detach method was invoked. * */	TokenNameCOMMENT_JAVADOC	 @return the next node in the set and advance the position of the iterator in the set. * @throws DOMException - INVALID_STATE_ERR Raised if this method is called after the detach method was invoked. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
DTMDOMException	TokenNameIdentifier	 DTMDOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
dtm_iter	TokenNameIdentifier	 dtm iter
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm_iter	TokenNameIdentifier	 dtm iter
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @return the next previous in the set and advance the position of the * iterator in the set. * * @throws DOMException - INVALID_STATE_ERR Raised if this method is * called after the detach method was invoked. * */	TokenNameCOMMENT_JAVADOC	 @return the next previous in the set and advance the position of the iterator in the set. * @throws DOMException - INVALID_STATE_ERR Raised if this method is called after the detach method was invoked. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
valid	TokenNameIdentifier	 valid
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
DTMDOMException	TokenNameIdentifier	 DTMDOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_STATE_ERR	TokenNameIdentifier	 INVALID  STATE  ERR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
handle	TokenNameIdentifier	 handle
=	TokenNameEQUAL	
dtm_iter	TokenNameIdentifier	 dtm iter
.	TokenNameDOT	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm_iter	TokenNameIdentifier	 dtm iter
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
handle	TokenNameIdentifier	 handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
