/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: WalkingIteratorSorted.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: WalkingIteratorSorted.java 468655 2006-10-28 07:12:06Z minchau $ 
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Compiler	TokenNameIdentifier	 Compiler
;	TokenNameSEMICOLON	
/** * This class iterates over set of nodes that needs to be sorted. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 This class iterates over set of nodes that needs to be sorted. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
WalkingIteratorSorted	TokenNameIdentifier	 Walking Iterator Sorted
extends	TokenNameextends	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4512512007542368213L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// /** True if the nodes will be found in document order */ 	TokenNameCOMMENT_LINE	/** True if the nodes will be found in document order */ 
// protected boolean m_inNaturalOrder = false; 	TokenNameCOMMENT_LINE	protected boolean m_inNaturalOrder = false; 
/** True if the nodes will be found in document order, and this can * be determined statically. */	TokenNameCOMMENT_JAVADOC	 True if the nodes will be found in document order, and this can be determined statically. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_inNaturalOrderStatic	TokenNameIdentifier	 m in Natural Order Static
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Create a WalkingIteratorSorted object. * * @param nscontext The namespace context for this iterator, * should be OK if null. */	TokenNameCOMMENT_JAVADOC	 Create a WalkingIteratorSorted object. * @param nscontext The namespace context for this iterator, should be OK if null. 
public	TokenNamepublic	
WalkingIteratorSorted	TokenNameIdentifier	 Walking Iterator Sorted
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nscontext	TokenNameIdentifier	 nscontext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
nscontext	TokenNameIdentifier	 nscontext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a WalkingIterator iterator, including creation * of step walkers from the opcode list, and call back * into the Compiler to create predicate expressions. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * @param shouldLoadWalkers True if walkers should be * loaded, or false if this is a derived iterator and * it doesn't wish to load child walkers. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a WalkingIterator iterator, including creation of step walkers from the opcode list, and call back into the Compiler to create predicate expressions. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. @param shouldLoadWalkers True if walkers should be loaded, or false if this is a derived iterator and it doesn't wish to load child walkers. * @throws javax.xml.transform.TransformerException 
WalkingIteratorSorted	TokenNameIdentifier	 Walking Iterator Sorted
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
analysis	TokenNameIdentifier	 analysis
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldLoadWalkers	TokenNameIdentifier	 should Load Walkers
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
super	TokenNamesuper	
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
analysis	TokenNameIdentifier	 analysis
,	TokenNameCOMMA	
shouldLoadWalkers	TokenNameIdentifier	 should Load Walkers
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if all the nodes in the iteration well be returned in document * order. * * @return true as a default. */	TokenNameCOMMENT_JAVADOC	 Returns true if all the nodes in the iteration well be returned in document order. * @return true as a default. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_inNaturalOrderStatic	TokenNameIdentifier	 m in Natural Order Static
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the nodeset can be walked in doc order, via static analysis. * * * @return true if the nodeset can be walked in doc order, without sorting. */	TokenNameCOMMENT_JAVADOC	 Tell if the nodeset can be walked in doc order, via static analysis. * @return true if the nodeset can be walked in doc order, without sorting. 
boolean	TokenNameboolean	
canBeWalkedInNaturalDocOrderStatic	TokenNameIdentifier	 can Be Walked In Natural Doc Order Static
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
m_firstWalker	TokenNameIdentifier	 m first Walker
;	TokenNameSEMICOLON	
int	TokenNameint	
prevAxis	TokenNameIdentifier	 prev Axis
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
prevIsSimpleDownAxis	TokenNameIdentifier	 prev Is Simple Down Axis
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker	TokenNameIdentifier	 walker
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isSimpleDownAxis	TokenNameIdentifier	 is Simple Down Axis
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Catching the filtered list here is only OK because 	TokenNameCOMMENT_LINE	Catching the filtered list here is only OK because 
// FilterExprWalker#isDocOrdered() did the right thing. 	TokenNameCOMMENT_LINE	FilterExprWalker#isDocOrdered() did the right thing. 
if	TokenNameif	
(	TokenNameLPAREN	
isSimpleDownAxis	TokenNameIdentifier	 is Simple Down Axis
||	TokenNameOR_OR	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isLastWalker	TokenNameIdentifier	 is Last Walker
=	TokenNameEQUAL	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isLastWalker	TokenNameIdentifier	 is Last Walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANT	TokenNameIdentifier	 DESCENDANT
||	TokenNameOR_OR	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTORSELF	TokenNameIdentifier	 DESCENDANTORSELF
||	TokenNameOR_OR	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTSFROMROOT	TokenNameIdentifier	 DESCENDANTSFROMROOT
||	TokenNameOR_OR	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
DESCENDANTSORSELFFROMROOT	TokenNameIdentifier	 DESCENDANTSORSELFFROMROOT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
==	TokenNameEQUAL_EQUAL	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * NEEDSDOC Method canBeWalkedInNaturalDocOrder 	TokenNameCOMMENT_LINE	* NEEDSDOC Method canBeWalkedInNaturalDocOrder 
// * 	TokenNameCOMMENT_LINE	* 
// * 	TokenNameCOMMENT_LINE	* 
// * NEEDSDOC (canBeWalkedInNaturalDocOrder) @return 	TokenNameCOMMENT_LINE	* NEEDSDOC (canBeWalkedInNaturalDocOrder) @return 
// */ 	TokenNameCOMMENT_LINE	*/ 
// boolean canBeWalkedInNaturalDocOrder() 	TokenNameCOMMENT_LINE	boolean canBeWalkedInNaturalDocOrder() 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// if (null != m_firstWalker) 	TokenNameCOMMENT_LINE	if (null != m_firstWalker) 
// { 	TokenNameCOMMENT_LINE	{ 
// AxesWalker walker = m_firstWalker; 	TokenNameCOMMENT_LINE	AxesWalker walker = m_firstWalker; 
// int prevAxis = -1; 	TokenNameCOMMENT_LINE	int prevAxis = -1; 
// boolean prevIsSimpleDownAxis = true; 	TokenNameCOMMENT_LINE	boolean prevIsSimpleDownAxis = true; 
// 	TokenNameCOMMENT_LINE	 
// for(int i = 0; null != walker; i++) 	TokenNameCOMMENT_LINE	for(int i = 0; null != walker; i++) 
// { 	TokenNameCOMMENT_LINE	{ 
// int axis = walker.getAxis(); 	TokenNameCOMMENT_LINE	int axis = walker.getAxis(); 
// 	TokenNameCOMMENT_LINE	 
// if(walker.isDocOrdered()) 	TokenNameCOMMENT_LINE	if(walker.isDocOrdered()) 
// { 	TokenNameCOMMENT_LINE	{ 
// boolean isSimpleDownAxis = ((axis == Axis.CHILD) 	TokenNameCOMMENT_LINE	boolean isSimpleDownAxis = ((axis == Axis.CHILD) 
// || (axis == Axis.SELF) 	TokenNameCOMMENT_LINE	|| (axis == Axis.SELF) 
// || (axis == Axis.ROOT)); 	TokenNameCOMMENT_LINE	|| (axis == Axis.ROOT)); 
// // Catching the filtered list here is only OK because 	TokenNameCOMMENT_LINE	// Catching the filtered list here is only OK because 
// // FilterExprWalker#isDocOrdered() did the right thing. 	TokenNameCOMMENT_LINE	// FilterExprWalker#isDocOrdered() did the right thing. 
// if(isSimpleDownAxis || (axis == -1)) 	TokenNameCOMMENT_LINE	if(isSimpleDownAxis || (axis == -1)) 
// walker = walker.getNextWalker(); 	TokenNameCOMMENT_LINE	walker = walker.getNextWalker(); 
// else 	TokenNameCOMMENT_LINE	else 
// { 	TokenNameCOMMENT_LINE	{ 
// boolean isLastWalker = (null == walker.getNextWalker()); 	TokenNameCOMMENT_LINE	boolean isLastWalker = (null == walker.getNextWalker()); 
// if(isLastWalker) 	TokenNameCOMMENT_LINE	if(isLastWalker) 
// { 	TokenNameCOMMENT_LINE	{ 
// if(walker.isDocOrdered() && (axis == Axis.DESCENDANT || 	TokenNameCOMMENT_LINE	if(walker.isDocOrdered() && (axis == Axis.DESCENDANT || 
// axis == Axis.DESCENDANTORSELF || axis == Axis.DESCENDANTSFROMROOT 	TokenNameCOMMENT_LINE	axis == Axis.DESCENDANTORSELF || axis == Axis.DESCENDANTSFROMROOT 
// || axis == Axis.DESCENDANTSORSELFFROMROOT) || (axis == Axis.ATTRIBUTE)) 	TokenNameCOMMENT_LINE	|| axis == Axis.DESCENDANTSORSELFFROMROOT) || (axis == Axis.ATTRIBUTE)) 
// return true; 	TokenNameCOMMENT_LINE	return true; 
// } 	TokenNameCOMMENT_LINE	} 
// return false; 	TokenNameCOMMENT_LINE	return false; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// else 	TokenNameCOMMENT_LINE	else 
// return false; 	TokenNameCOMMENT_LINE	return false; 
// } 	TokenNameCOMMENT_LINE	} 
// return true; 	TokenNameCOMMENT_LINE	return true; 
// } 	TokenNameCOMMENT_LINE	} 
// return false; 	TokenNameCOMMENT_LINE	return false; 
// } 	TokenNameCOMMENT_LINE	} 
/** * This function is used to perform some extra analysis of the iterator. * * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). */	TokenNameCOMMENT_JAVADOC	 This function is used to perform some extra analysis of the iterator. * @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). 
public	TokenNamepublic	
void	TokenNamevoid	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
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
int	TokenNameint	
analysis	TokenNameIdentifier	 analysis
=	TokenNameEQUAL	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
isNaturalDocOrder	TokenNameIdentifier	 is Natural Doc Order
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_inNaturalOrderStatic	TokenNameIdentifier	 m in Natural Order Static
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_inNaturalOrderStatic	TokenNameIdentifier	 m in Natural Order Static
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// System.out.println("Setting natural doc order to false: "+ 	TokenNameCOMMENT_LINE	System.out.println("Setting natural doc order to false: "+ 
// WalkerFactory.getAnalysisString(analysis)); 	TokenNameCOMMENT_LINE	WalkerFactory.getAnalysisString(analysis)); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
