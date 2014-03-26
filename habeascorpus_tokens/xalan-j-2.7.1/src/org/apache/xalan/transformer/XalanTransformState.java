/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XalanTransformState.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XalanTransformState.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplate	TokenNameIdentifier	 Elem Template
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
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
DTMIterator	TokenNameIdentifier	 DTM Iterator
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
NodeIterator	TokenNameIdentifier	 Node Iterator
;	TokenNameSEMICOLON	
/** * Before the serializer merge, the TransformState interface was * implemented by ResultTreeHandler. */	TokenNameCOMMENT_JAVADOC	 Before the serializer merge, the TransformState interface was implemented by ResultTreeHandler. 
public	TokenNamepublic	
class	TokenNameclass	
XalanTransformState	TokenNameIdentifier	 Xalan Transform State
implements	TokenNameimplements	
TransformState	TokenNameIdentifier	 Transform State
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
m_node	TokenNameIdentifier	 m node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
m_currentElement	TokenNameIdentifier	 m current Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ElemTemplate	TokenNameIdentifier	 Elem Template
m_currentTemplate	TokenNameIdentifier	 m current Template
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ElemTemplate	TokenNameIdentifier	 Elem Template
m_matchedTemplate	TokenNameIdentifier	 m matched Template
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
m_currentNodeHandle	TokenNameIdentifier	 m current Node Handle
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
m_matchedNode	TokenNameIdentifier	 m matched Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
DTMIterator	TokenNameIdentifier	 DTM Iterator
m_contextNodeList	TokenNameIdentifier	 m context Node List
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
m_elemPending	TokenNameIdentifier	 m elem Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * @see org.apache.xml.serializer.TransformStateSetter#setCurrentNode(Node) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xml.serializer.TransformStateSetter#setCurrentNode(Node) 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentNode	TokenNameIdentifier	 set Current Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_node	TokenNameIdentifier	 m node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xml.serializer.TransformStateSetter#resetState(Transformer) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xml.serializer.TransformStateSetter#resetState(Transformer) 
public	TokenNamepublic	
void	TokenNamevoid	
resetState	TokenNameIdentifier	 reset State
(	TokenNameLPAREN	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
instanceof	TokenNameinstanceof	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
m_currentElement	TokenNameIdentifier	 m current Element
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentElement	TokenNameIdentifier	 get Current Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentTemplate	TokenNameIdentifier	 m current Template
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentTemplate	TokenNameIdentifier	 get Current Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_matchedTemplate	TokenNameIdentifier	 m matched Template
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getMatchedTemplate	TokenNameIdentifier	 get Matched Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentNodeHandle	TokenNameIdentifier	 current Node Handle
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
currentNodeHandle	TokenNameIdentifier	 current Node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentNode	TokenNameIdentifier	 m current Node
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
currentNodeHandle	TokenNameIdentifier	 current Node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_matchedNode	TokenNameIdentifier	 m matched Node
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getMatchedNode	TokenNameIdentifier	 get Matched Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_contextNodeList	TokenNameIdentifier	 m context Node List
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.transformer.TransformState#getCurrentElement() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.transformer.TransformState#getCurrentElement() 
public	TokenNamepublic	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
getCurrentElement	TokenNameIdentifier	 get Current Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemPending	TokenNameIdentifier	 m elem Pending
)	TokenNameRPAREN	
return	TokenNamereturn	
m_currentElement	TokenNameIdentifier	 m current Element
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentElement	TokenNameIdentifier	 get Current Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.transformer.TransformState#getCurrentNode() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.transformer.TransformState#getCurrentNode() 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_currentNode	TokenNameIdentifier	 m current Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentNode	TokenNameIdentifier	 m current Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.transformer.TransformState#getCurrentTemplate() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.transformer.TransformState#getCurrentTemplate() 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getCurrentTemplate	TokenNameIdentifier	 get Current Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemPending	TokenNameIdentifier	 m elem Pending
)	TokenNameRPAREN	
return	TokenNamereturn	
m_currentTemplate	TokenNameIdentifier	 m current Template
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentTemplate	TokenNameIdentifier	 get Current Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.transformer.TransformState#getMatchedTemplate() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.transformer.TransformState#getMatchedTemplate() 
public	TokenNamepublic	
ElemTemplate	TokenNameIdentifier	 Elem Template
getMatchedTemplate	TokenNameIdentifier	 get Matched Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemPending	TokenNameIdentifier	 m elem Pending
)	TokenNameRPAREN	
return	TokenNamereturn	
m_matchedTemplate	TokenNameIdentifier	 m matched Template
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getMatchedTemplate	TokenNameIdentifier	 get Matched Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.transformer.TransformState#getMatchedNode() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.transformer.TransformState#getMatchedNode() 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getMatchedNode	TokenNameIdentifier	 get Matched Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemPending	TokenNameIdentifier	 m elem Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
m_matchedNode	TokenNameIdentifier	 m matched Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
m_matchedNode	TokenNameIdentifier	 m matched Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getMatchedNode	TokenNameIdentifier	 get Matched Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getMatchedNode	TokenNameIdentifier	 get Matched Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.transformer.TransformState#getContextNodeList() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.transformer.TransformState#getContextNodeList() 
public	TokenNamepublic	
NodeIterator	TokenNameIdentifier	 Node Iterator
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_elemPending	TokenNameIdentifier	 m elem Pending
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
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
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
(	TokenNameLPAREN	
m_contextNodeList	TokenNameIdentifier	 m context Node List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
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
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see org.apache.xalan.transformer.TransformState#getTransformer() */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xalan.transformer.TransformState#getTransformer() 
public	TokenNamepublic	
Transformer	TokenNameIdentifier	 Transformer
getTransformer	TokenNameIdentifier	 get Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
