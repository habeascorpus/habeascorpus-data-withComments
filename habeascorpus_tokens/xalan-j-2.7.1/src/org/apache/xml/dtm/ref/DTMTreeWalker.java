/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMTreeWalker.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMTreeWalker.java 468653 2006-10-28 07:07:05Z minchau $ 
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
NodeConsumer	TokenNameIdentifier	 Node Consumer
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
;	TokenNameSEMICOLON	
/** * This class does a pre-order walk of the DTM tree, calling a ContentHandler * interface as it goes. As such, it's more like the Visitor design pattern * than like the DOM's TreeWalker. * * I think normally this class should not be needed, because * of DTM#dispatchToEvents. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class does a pre-order walk of the DTM tree, calling a ContentHandler interface as it goes. As such, it's more like the Visitor design pattern than like the DOM's TreeWalker. * I think normally this class should not be needed, because of DTM#dispatchToEvents. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
DTMTreeWalker	TokenNameIdentifier	 DTM Tree Walker
{	TokenNameLBRACE	
/** Local reference to a ContentHandler */	TokenNameCOMMENT_JAVADOC	 Local reference to a ContentHandler 
private	TokenNameprivate	
ContentHandler	TokenNameIdentifier	 Content Handler
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** DomHelper for this TreeWalker */	TokenNameCOMMENT_JAVADOC	 DomHelper for this TreeWalker 
protected	TokenNameprotected	
DTM	TokenNameIdentifier	 DTM
m_dtm	TokenNameIdentifier	 m dtm
;	TokenNameSEMICOLON	
/** * Set the DTM to be traversed. * * @param dtm The Document Table Model to be used. */	TokenNameCOMMENT_JAVADOC	 Set the DTM to be traversed. * @param dtm The Document Table Model to be used. 
public	TokenNamepublic	
void	TokenNamevoid	
setDTM	TokenNameIdentifier	 set DTM
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_dtm	TokenNameIdentifier	 m dtm
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the ContentHandler used for the tree walk. * * @return the ContentHandler used for the tree walk */	TokenNameCOMMENT_JAVADOC	 Get the ContentHandler used for the tree walk. * @return the ContentHandler used for the tree walk 
public	TokenNamepublic	
ContentHandler	TokenNameIdentifier	 Content Handler
getcontentHandler	TokenNameIdentifier	 getcontent Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_contentHandler	TokenNameIdentifier	 m content Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the ContentHandler used for the tree walk. * * @param ch the ContentHandler to be the result of the tree walk. */	TokenNameCOMMENT_JAVADOC	 Set the ContentHandler used for the tree walk. * @param ch the ContentHandler to be the result of the tree walk. 
public	TokenNamepublic	
void	TokenNamevoid	
setcontentHandler	TokenNameIdentifier	 setcontent Handler
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
DTMTreeWalker	TokenNameIdentifier	 DTM Tree Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Constructor. * @param contentHandler The implemention of the * contentHandler operation (toXMLString, digest, ...) */	TokenNameCOMMENT_JAVADOC	 Constructor. @param contentHandler The implemention of the contentHandler operation (toXMLString, digest, ...) 
public	TokenNamepublic	
DTMTreeWalker	TokenNameIdentifier	 DTM Tree Walker
(	TokenNameLPAREN	
ContentHandler	TokenNameIdentifier	 Content Handler
contentHandler	TokenNameIdentifier	 content Handler
,	TokenNameCOMMA	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
=	TokenNameEQUAL	
contentHandler	TokenNameIdentifier	 content Handler
;	TokenNameSEMICOLON	
m_dtm	TokenNameIdentifier	 m dtm
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Perform a non-recursive pre-order/post-order traversal, * operating as a Visitor. startNode (preorder) and endNode * (postorder) are invoked for each node as we traverse over them, * with the result that the node is written out to m_contentHandler. * * @param pos Node in the tree at which to start (and end) traversal -- * in other words, the root of the subtree to traverse over. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Perform a non-recursive pre-order/post-order traversal, operating as a Visitor. startNode (preorder) and endNode (postorder) are invoked for each node as we traverse over them, with the result that the node is written out to m_contentHandler. * @param pos Node in the tree at which to start (and end) traversal -- in other words, the root of the subtree to traverse over. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// %REVIEW% Why isn't this just traverse(pos,pos)? 	TokenNameCOMMENT_LINE	%REVIEW% Why isn't this just traverse(pos,pos)? 
int	TokenNameint	
top	TokenNameIdentifier	 top
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
// Remember the root of this subtree 	TokenNameCOMMENT_LINE	Remember the root of this subtree 
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startNode	TokenNameIdentifier	 start Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endNode	TokenNameIdentifier	 end Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% This condition isn't tested in traverse(pos,top) 	TokenNameCOMMENT_LINE	%REVIEW% This condition isn't tested in traverse(pos,top) 
// -- bug? 	TokenNameCOMMENT_LINE	-- bug? 
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
endNode	TokenNameIdentifier	 end Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Perform a non-recursive pre-order/post-order traversal, * operating as a Visitor. startNode (preorder) and endNode * (postorder) are invoked for each node as we traverse over them, * with the result that the node is written out to m_contentHandler. * * @param pos Node in the tree where to start traversal * @param top Node in the tree where to end traversal. * If top==DTM.NULL, run through end of document. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Perform a non-recursive pre-order/post-order traversal, operating as a Visitor. startNode (preorder) and endNode (postorder) are invoked for each node as we traverse over them, with the result that the node is written out to m_contentHandler. * @param pos Node in the tree where to start traversal @param top Node in the tree where to end traversal. If top==DTM.NULL, run through end of document. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
traverse	TokenNameIdentifier	 traverse
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
int	TokenNameint	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// %OPT% Can we simplify the loop conditionals by adding: 	TokenNameCOMMENT_LINE	%OPT% Can we simplify the loop conditionals by adding: 
// if(top==DTM.NULL) top=0 	TokenNameCOMMENT_LINE	if(top==DTM.NULL) top=0 
// -- or by simply ignoring this case and relying on the fact that 	TokenNameCOMMENT_LINE	-- or by simply ignoring this case and relying on the fact that 
// pos will never equal DTM.NULL until we're ready to exit? 	TokenNameCOMMENT_LINE	pos will never equal DTM.NULL until we're ready to exit? 
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startNode	TokenNameIdentifier	 start Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
endNode	TokenNameIdentifier	 end Node
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
top	TokenNameIdentifier	 top
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
top	TokenNameIdentifier	 top
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextNode	TokenNameIdentifier	 next Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Flag indicating whether following text to be processed is raw text */	TokenNameCOMMENT_JAVADOC	 Flag indicating whether following text to be processed is raw text 
boolean	TokenNameboolean	
nextIsRaw	TokenNameIdentifier	 next Is Raw
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Optimized dispatch of characters. */	TokenNameCOMMENT_JAVADOC	 Optimized dispatch of characters. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
dispatachChars	TokenNameIdentifier	 dispatach Chars
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
m_contentHandler	TokenNameIdentifier	 m content Handler
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Start processing given node * * * @param node Node to process * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Start processing given node * @param node Node to process * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
startNode	TokenNameIdentifier	 start Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
NodeConsumer	TokenNameIdentifier	 Node Consumer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %TBD% 	TokenNameCOMMENT_LINE	%TBD% 
// ((NodeConsumer) m_contentHandler).setOriginatingNode(node); 	TokenNameCOMMENT_LINE	((NodeConsumer) m_contentHandler).setOriginatingNode(node); 
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lh	TokenNameIdentifier	 lh
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
dispatchAsComment	TokenNameIdentifier	 dispatch As Comment
(	TokenNameLPAREN	
lh	TokenNameIdentifier	 lh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
:	TokenNameCOLON	
// ??; 	TokenNameCOMMENT_LINE	??; 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nsn	TokenNameIdentifier	 nsn
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
nsn	TokenNameIdentifier	 nsn
;	TokenNameSEMICOLON	
nsn	TokenNameIdentifier	 nsn
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
nsn	TokenNameIdentifier	 nsn
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// String prefix = dtm.getPrefix(nsn); 	TokenNameCOMMENT_LINE	String prefix = dtm.getPrefix(nsn); 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
nsn	TokenNameIdentifier	 nsn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startPrefixMapping	TokenNameIdentifier	 start Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
nsn	TokenNameIdentifier	 nsn
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("m_dh.getNamespaceOfNode(node): "+m_dh.getNamespaceOfNode(node)); 	TokenNameCOMMENT_LINE	System.out.println("m_dh.getNamespaceOfNode(node): "+m_dh.getNamespaceOfNode(node)); 
// System.out.println("m_dh.getLocalNameOfNode(node): "+m_dh.getLocalNameOfNode(node)); 	TokenNameCOMMENT_LINE	System.out.println("m_dh.getLocalNameOfNode(node): "+m_dh.getLocalNameOfNode(node)); 
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// %OPT% !! 	TokenNameCOMMENT_LINE	%OPT% !! 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
attrs	TokenNameIdentifier	 attrs
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
AttributesImpl	TokenNameIdentifier	 Attributes Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getFirstAttribute	TokenNameIdentifier	 get First Attribute
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNextAttribute	TokenNameIdentifier	 get Next Attribute
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrs	TokenNameIdentifier	 attrs
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"CDATA"	TokenNameStringLiteral	CDATA
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrs	TokenNameIdentifier	 attrs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// String data = pi.getData(); 	TokenNameCOMMENT_LINE	String data = pi.getData(); 
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"xslt-next-is-raw"	TokenNameStringLiteral	xslt-next-is-raw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextIsRaw	TokenNameIdentifier	 next Is Raw
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isLexH	TokenNameIdentifier	 is Lex H
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lh	TokenNameIdentifier	 lh
=	TokenNameEQUAL	
isLexH	TokenNameIdentifier	 is Lex H
?	TokenNameQUESTION	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isLexH	TokenNameIdentifier	 is Lex H
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
startCDATA	TokenNameIdentifier	 start CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dispatachChars	TokenNameIdentifier	 dispatach Chars
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isLexH	TokenNameIdentifier	 is Lex H
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
endCDATA	TokenNameIdentifier	 end CDATA
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextIsRaw	TokenNameIdentifier	 next Is Raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextIsRaw	TokenNameIdentifier	 next Is Raw
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_DISABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  DISABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dispatachChars	TokenNameIdentifier	 dispatach Chars
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
processingInstruction	TokenNameIdentifier	 processing Instruction
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Result	TokenNameIdentifier	 Result
.	TokenNameDOT	
PI_ENABLE_OUTPUT_ESCAPING	TokenNameIdentifier	 PI  ENABLE  OUTPUT  ESCAPING
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dispatachChars	TokenNameIdentifier	 dispatach Chars
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// warning("Can not output entity to a pure SAX ContentHandler"); 	TokenNameCOMMENT_LINE	warning("Can not output entity to a pure SAX ContentHandler"); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * End processing of given node * * * @param node Node we just finished processing * * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 End processing of given node * @param node Node we just finished processing * @throws org.xml.sax.SAXException 
protected	TokenNameprotected	
void	TokenNamevoid	
endNode	TokenNameIdentifier	 end Node
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endDocument	TokenNameIdentifier	 end Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
ns	TokenNameIdentifier	 ns
)	TokenNameRPAREN	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
,	TokenNameCOMMA	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
nsn	TokenNameIdentifier	 nsn
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getFirstNamespaceNode	TokenNameIdentifier	 get First Namespace Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
nsn	TokenNameIdentifier	 nsn
;	TokenNameSEMICOLON	
nsn	TokenNameIdentifier	 nsn
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNextNamespaceNode	TokenNameIdentifier	 get Next Namespace Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
nsn	TokenNameIdentifier	 nsn
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// String prefix = m_dtm.getPrefix(nsn); 	TokenNameCOMMENT_LINE	String prefix = m_dtm.getPrefix(nsn); 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeNameX	TokenNameIdentifier	 get Node Name X
(	TokenNameLPAREN	
nsn	TokenNameIdentifier	 nsn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
.	TokenNameDOT	
endPrefixMapping	TokenNameIdentifier	 end Prefix Mapping
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_contentHandler	TokenNameIdentifier	 m content Handler
instanceof	TokenNameinstanceof	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
lh	TokenNameIdentifier	 lh
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LexicalHandler	TokenNameIdentifier	 Lexical Handler
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_contentHandler	TokenNameIdentifier	 m content Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lh	TokenNameIdentifier	 lh
.	TokenNameDOT	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
m_dtm	TokenNameIdentifier	 m dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//TreeWalker 	TokenNameCOMMENT_LINE	TreeWalker 
