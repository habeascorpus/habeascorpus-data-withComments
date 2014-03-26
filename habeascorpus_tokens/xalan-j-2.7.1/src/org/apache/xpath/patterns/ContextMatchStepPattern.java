/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ContextMatchStepPattern.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ContextMatchStepPattern.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
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
Axis	TokenNameIdentifier	 Axis
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
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
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
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
WalkerFactory	TokenNameIdentifier	 Walker Factory
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
/** * Special context node pattern matcher. */	TokenNameCOMMENT_JAVADOC	 Special context node pattern matcher. 
public	TokenNamepublic	
class	TokenNameclass	
ContextMatchStepPattern	TokenNameIdentifier	 Context Match Step Pattern
extends	TokenNameextends	
StepPattern	TokenNameIdentifier	 Step Pattern
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
1888092779313211942L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct a ContextMatchStepPattern. * */	TokenNameCOMMENT_JAVADOC	 Construct a ContextMatchStepPattern. 
public	TokenNamepublic	
ContextMatchStepPattern	TokenNameIdentifier	 Context Match Step Pattern
(	TokenNameLPAREN	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
int	TokenNameint	
paxis	TokenNameIdentifier	 paxis
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
,	TokenNameCOMMA	
axis	TokenNameIdentifier	 axis
,	TokenNameCOMMA	
paxis	TokenNameIdentifier	 paxis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute this pattern step, including predicates. * * * @param xctxt XPath runtime context. * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute this pattern step, including predicates. * @param xctxt XPath runtime context. * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getIteratorRoot	TokenNameIdentifier	 get Iterator Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
getStaticScore	TokenNameIdentifier	 get Static Score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the match pattern step relative to another step. * * * @param xctxt The XPath runtime context. * NEEDSDOC @param prevStep * * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, * {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or * {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the match pattern step relative to another step. * @param xctxt The XPath runtime context. NEEDSDOC @param prevStep * @return {@link org.apache.xpath.patterns.NodeTest#SCORE_NODETEST}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NONE}, {@link org.apache.xpath.patterns.NodeTest#SCORE_NSWILD}, {@link org.apache.xpath.patterns.NodeTest#SCORE_QNAME}, or {@link org.apache.xpath.patterns.NodeTest#SCORE_OTHER}. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
executeRelativePathPattern	TokenNameIdentifier	 execute Relative Path Pattern
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
StepPattern	TokenNameIdentifier	 Step Pattern
prevStep	TokenNameIdentifier	 prev Step
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XObject	TokenNameIdentifier	 X Object
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
int	TokenNameint	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
predContext	TokenNameIdentifier	 pred Context
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
traverser	TokenNameIdentifier	 traverser
;	TokenNameSEMICOLON	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
m_axis	TokenNameIdentifier	 m axis
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
needToTraverseAttrs	TokenNameIdentifier	 need To Traverse Attrs
=	TokenNameEQUAL	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
isDownwardAxisOfMany	TokenNameIdentifier	 is Downward Axis Of Many
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
iterRootIsAttr	TokenNameIdentifier	 iter Root Is Attr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getIteratorRoot	TokenNameIdentifier	 get Iterator Root
(	TokenNameLPAREN	
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
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDING	TokenNameIdentifier	 PRECEDING
==	TokenNameEQUAL_EQUAL	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
iterRootIsAttr	TokenNameIdentifier	 iter Root Is Attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
PRECEDINGANDANCESTOR	TokenNameIdentifier	 PRECEDINGANDANCESTOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
traverser	TokenNameIdentifier	 traverser
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
relative	TokenNameIdentifier	 relative
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
relative	TokenNameIdentifier	 relative
;	TokenNameSEMICOLON	
relative	TokenNameIdentifier	 relative
=	TokenNameEQUAL	
traverser	TokenNameIdentifier	 traverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
relative	TokenNameIdentifier	 relative
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
relative	TokenNameIdentifier	 relative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
!=	TokenNameNOT_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//score = executePredicates( xctxt, prevStep, SCORE_OTHER, 	TokenNameCOMMENT_LINE	score = executePredicates( xctxt, prevStep, SCORE_OTHER, 
// predContext, relative); 	TokenNameCOMMENT_LINE	predContext, relative); 
if	TokenNameif	
(	TokenNameLPAREN	
executePredicates	TokenNameIdentifier	 execute Predicates
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needToTraverseAttrs	TokenNameIdentifier	 need To Traverse Attrs
&&	TokenNameAND_AND	
iterRootIsAttr	TokenNameIdentifier	 iter Root Is Attr
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
==	TokenNameEQUAL_EQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
relative	TokenNameIdentifier	 relative
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
xaxis	TokenNameIdentifier	 xaxis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
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
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTMAxisTraverser	TokenNameIdentifier	 DTM Axis Traverser
atraverser	TokenNameIdentifier	 atraverser
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getAxisTraverser	TokenNameIdentifier	 get Axis Traverser
(	TokenNameLPAREN	
xaxis	TokenNameIdentifier	 xaxis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
arelative	TokenNameIdentifier	 arelative
=	TokenNameEQUAL	
atraverser	TokenNameIdentifier	 atraverser
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
relative	TokenNameIdentifier	 relative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
arelative	TokenNameIdentifier	 arelative
;	TokenNameSEMICOLON	
arelative	TokenNameIdentifier	 arelative
=	TokenNameEQUAL	
atraverser	TokenNameIdentifier	 atraverser
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
relative	TokenNameIdentifier	 relative
,	TokenNameCOMMA	
arelative	TokenNameIdentifier	 arelative
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
arelative	TokenNameIdentifier	 arelative
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
!=	TokenNameNOT_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//score = executePredicates( xctxt, prevStep, SCORE_OTHER, 	TokenNameCOMMENT_LINE	score = executePredicates( xctxt, prevStep, SCORE_OTHER, 
// predContext, arelative); 	TokenNameCOMMENT_LINE	predContext, arelative); 
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
!=	TokenNameNOT_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
xaxis	TokenNameIdentifier	 xaxis
=	TokenNameEQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
score	TokenNameIdentifier	 score
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
