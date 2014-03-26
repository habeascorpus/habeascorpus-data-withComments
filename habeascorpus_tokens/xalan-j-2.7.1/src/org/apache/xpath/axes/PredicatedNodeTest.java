/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: PredicatedNodeTest.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: PredicatedNodeTest.java 468655 2006-10-28 07:12:06Z minchau $ 
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
Expression	TokenNameIdentifier	 Expression
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
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
XPathVisitor	TokenNameIdentifier	 X Path Visitor
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
patterns	TokenNameIdentifier	 patterns
.	TokenNameDOT	
NodeTest	TokenNameIdentifier	 Node Test
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
extends	TokenNameextends	
NodeTest	TokenNameIdentifier	 Node Test
implements	TokenNameimplements	
SubContextList	TokenNameIdentifier	 Sub Context List
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6193530757296377351L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Construct an AxesWalker using a LocPathIterator. * * @param locPathIterator non-null reference to the parent iterator. */	TokenNameCOMMENT_JAVADOC	 Construct an AxesWalker using a LocPathIterator. * @param locPathIterator non-null reference to the parent iterator. 
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
locPathIterator	TokenNameIdentifier	 loc Path Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lpi	TokenNameIdentifier	 m lpi
=	TokenNameEQUAL	
locPathIterator	TokenNameIdentifier	 loc Path Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an AxesWalker. The location path iterator will have to be set * before use. */	TokenNameCOMMENT_JAVADOC	 Construct an AxesWalker. The location path iterator will have to be set before use. 
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Read the object from a serialization stream. * * @param stream Input stream to read from * * @throws java.io.IOException * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Read the object from a serialization stream. * @param stream Input stream to read from * @throws java.io.IOException @throws javax.xml.transform.TransformerException 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
resetProximityPositions	TokenNameIdentifier	 reset Proximity Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a cloned PrdicatedNodeTest. * * @return A new PredicatedNodeTest that can be used without mutating this one. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned PrdicatedNodeTest. * @return A new PredicatedNodeTest that can be used without mutating this one. * @throws CloneNotSupportedException 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
// Do not access the location path itterator during this operation! 	TokenNameCOMMENT_LINE	Do not access the location path itterator during this operation! 
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
==	TokenNameEQUAL_EQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_lpi	TokenNameIdentifier	 m lpi
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_lpi	TokenNameIdentifier	 m lpi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only for clones for findLastPos. See bug4638. 	TokenNameCOMMENT_LINE	Only for clones for findLastPos. See bug4638. 
protected	TokenNameprotected	
int	TokenNameint	
m_predCount	TokenNameIdentifier	 m pred Count
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Get the number of predicates that this walker has. * * @return the number of predicates that this walker has. */	TokenNameCOMMENT_JAVADOC	 Get the number of predicates that this walker has. * @return the number of predicates that this walker has. 
public	TokenNamepublic	
int	TokenNameint	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_predCount	TokenNameIdentifier	 m pred Count
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
m_predCount	TokenNameIdentifier	 m pred Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the number of predicates that this walker has. This does more * that one would think, as it creates a new predicate array of the * size of the count argument, and copies count predicates into the new * one from the old, and then reassigns the predicates value. All this * to keep from having to have a predicate count value. * * @param count The number of predicates, which must be equal or less * than the existing count. */	TokenNameCOMMENT_JAVADOC	 Set the number of predicates that this walker has. This does more that one would think, as it creates a new predicate array of the size of the count argument, and copies count predicates into the new one from the old, and then reassigns the predicates value. All this to keep from having to have a predicate count value. * @param count The number of predicates, which must be equal or less than the existing count. 
public	TokenNamepublic	
void	TokenNamevoid	
setPredicateCount	TokenNameIdentifier	 set Predicate Count
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newPredicates	TokenNameIdentifier	 new Predicates
=	TokenNameEQUAL	
new	TokenNamenew	
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newPredicates	TokenNameIdentifier	 new Predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_predicates	TokenNameIdentifier	 m predicates
=	TokenNameEQUAL	
newPredicates	TokenNameIdentifier	 new Predicates
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
m_predicates	TokenNameIdentifier	 m predicates
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Init predicate info. * * @param compiler The Compiler object that has information about this * walker in the op map. * @param opPos The op code position of this location step. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Init predicate info. * @param compiler The Compiler object that has information about this walker in the op map. @param opPos The op code position of this location step. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
void	TokenNamevoid	
initPredicateInfo	TokenNameIdentifier	 init Predicate Info
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
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
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getFirstPredicateOpPos	TokenNameIdentifier	 get First Predicate Op Pos
(	TokenNameLPAREN	
opPos	TokenNameIdentifier	 op Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicates	TokenNameIdentifier	 m predicates
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getCompiledPredicates	TokenNameIdentifier	 get Compiled Predicates
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a predicate expression at the given index. * * * @param index Index of the predicate. * * @return A predicate expression. */	TokenNameCOMMENT_JAVADOC	 Get a predicate expression at the given index. * @param index Index of the predicate. * @return A predicate expression. 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getPredicate	TokenNameIdentifier	 get Predicate
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current sub-context position. * * @return The node position of this walker in the sub-context node list. */	TokenNameCOMMENT_JAVADOC	 Get the current sub-context position. * @return The node position of this walker in the sub-context node list. 
public	TokenNamepublic	
int	TokenNameint	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("getProximityPosition - m_predicateIndex: "+m_predicateIndex); 	TokenNameCOMMENT_LINE	System.out.println("getProximityPosition - m_predicateIndex: "+m_predicateIndex); 
return	TokenNamereturn	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current sub-context position. * * @param xctxt The XPath runtime context. * * @return The node position of this walker in the sub-context node list. */	TokenNameCOMMENT_JAVADOC	 Get the current sub-context position. * @param xctxt The XPath runtime context. * @return The node position of this walker in the sub-context node list. 
public	TokenNamepublic	
int	TokenNameint	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the index of the last node that can be itterated to. * * * @param xctxt XPath runtime context. * * @return the index of the last node that can be itterated to. */	TokenNameCOMMENT_JAVADOC	 Get the index of the last node that can be itterated to. * @param xctxt XPath runtime context. * @return the index of the last node that can be itterated to. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getLastPos	TokenNameIdentifier	 get Last Pos
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current sub-context position. * * @param predicateIndex The index of the predicate where the proximity * should be taken from. * * @return The node position of this walker in the sub-context node list. */	TokenNameCOMMENT_JAVADOC	 Get the current sub-context position. * @param predicateIndex The index of the predicate where the proximity should be taken from. * @return The node position of this walker in the sub-context node list. 
protected	TokenNameprotected	
int	TokenNameint	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
int	TokenNameint	
predicateIndex	TokenNameIdentifier	 predicate Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
predicateIndex	TokenNameIdentifier	 predicate Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
[	TokenNameLBRACKET	
predicateIndex	TokenNameIdentifier	 predicate Index
]	TokenNameRBRACKET	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the proximity positions counts. */	TokenNameCOMMENT_JAVADOC	 Reset the proximity positions counts. 
public	TokenNamepublic	
void	TokenNamevoid	
resetProximityPositions	TokenNameIdentifier	 reset Proximity Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nPredicates	TokenNameIdentifier	 n Predicates
=	TokenNameEQUAL	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nPredicates	TokenNameIdentifier	 n Predicates
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
)	TokenNameRPAREN	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
nPredicates	TokenNameIdentifier	 n Predicates
]	TokenNameRBRACKET	
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
nPredicates	TokenNameIdentifier	 n Predicates
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
initProximityPosition	TokenNameIdentifier	 init Proximity Position
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Fix this... 	TokenNameCOMMENT_LINE	TODO: Fix this... 
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
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Init the proximity position to zero for a forward axes. * * @param i The index into the m_proximityPositions array. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Init the proximity position to zero for a forward axes. * @param i The index into the m_proximityPositions array. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
initProximityPosition	TokenNameIdentifier	 init Proximity Position
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
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
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Count forward one proximity position. * * @param i The index into the m_proximityPositions array, where the increment * will occur. */	TokenNameCOMMENT_JAVADOC	 Count forward one proximity position. * @param i The index into the m_proximityPositions array, where the increment will occur. 
protected	TokenNameprotected	
void	TokenNamevoid	
countProximityPosition	TokenNameIdentifier	 count Proximity Position
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note that in the case of a UnionChildIterator, this may be a 	TokenNameCOMMENT_LINE	Note that in the case of a UnionChildIterator, this may be a 
// static object and so m_proximityPositions may indeed be null! 	TokenNameCOMMENT_LINE	static object and so m_proximityPositions may indeed be null! 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pp	TokenNameIdentifier	 pp
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pp	TokenNameIdentifier	 pp
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
pp	TokenNameIdentifier	 pp
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this is a reverse axes. * * @return false, unless a derived class overrides. */	TokenNameCOMMENT_JAVADOC	 Tells if this is a reverse axes. * @return false, unless a derived class overrides. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isReverseAxes	TokenNameIdentifier	 is Reverse Axes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get which predicate is executing. * * @return The current predicate index, or -1 if no predicate is executing. */	TokenNameCOMMENT_JAVADOC	 Get which predicate is executing. * @return The current predicate index, or -1 if no predicate is executing. 
public	TokenNamepublic	
int	TokenNameint	
getPredicateIndex	TokenNameIdentifier	 get Predicate Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the predicates. * * @param context The current context node. * @param xctxt The XPath runtime context. * * @return the result of executing the predicate expressions. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Process the predicates. * @param context The current context node. @param xctxt The XPath runtime context. * @return the result of executing the predicate expressions. * @throws javax.xml.transform.TransformerException 
boolean	TokenNameboolean	
executePredicates	TokenNameIdentifier	 execute Predicates
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
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
int	TokenNameint	
nPredicates	TokenNameIdentifier	 n Predicates
=	TokenNameEQUAL	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("nPredicates: "+nPredicates); 	TokenNameCOMMENT_LINE	System.out.println("nPredicates: "+nPredicates); 
if	TokenNameif	
(	TokenNameLPAREN	
nPredicates	TokenNameIdentifier	 n Predicates
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
savedResolver	TokenNameIdentifier	 saved Resolver
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushSubContextList	TokenNameIdentifier	 push Sub Context List
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushNamespaceContext	TokenNameIdentifier	 push Namespace Context
(	TokenNameLPAREN	
m_lpi	TokenNameIdentifier	 m lpi
.	TokenNameDOT	
getPrefixResolver	TokenNameIdentifier	 get Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
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
nPredicates	TokenNameIdentifier	 n Predicates
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Executing predicate expression - waiting count: "+m_lpi.getWaitingCount()); 	TokenNameCOMMENT_LINE	System.out.println("Executing predicate expression - waiting count: "+m_lpi.getWaitingCount()); 
XObject	TokenNameIdentifier	 X Object
pred	TokenNameIdentifier	 pred
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("\nBack from executing predicate expression - waiting count: "+m_lpi.getWaitingCount()); 	TokenNameCOMMENT_LINE	System.out.println("\nBack from executing predicate expression - waiting count: "+m_lpi.getWaitingCount()); 
// System.out.println("pred.getType(): "+pred.getType()); 	TokenNameCOMMENT_LINE	System.out.println("pred.getType(): "+pred.getType()); 
if	TokenNameif	
(	TokenNameLPAREN	
XObject	TokenNameIdentifier	 X Object
.	TokenNameDOT	
CLASS_NUMBER	TokenNameIdentifier	 CLASS  NUMBER
==	TokenNameEQUAL_EQUAL	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_PREDICATECOUNTING	TokenNameIdentifier	 DEBUG  PREDICATECOUNTING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" ===== start predicate count ========"	TokenNameStringLiteral	 ===== start predicate count ========
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"m_predicateIndex: "	TokenNameStringLiteral	m_predicateIndex: 
+	TokenNamePLUS	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("getProximityPosition(m_predicateIndex): " 	TokenNameCOMMENT_LINE	System.out.println("getProximityPosition(m_predicateIndex): " 
// + getProximityPosition(m_predicateIndex)); 	TokenNameCOMMENT_LINE	+ getProximityPosition(m_predicateIndex)); 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"pred.num(): "	TokenNameStringLiteral	pred.num(): 
+	TokenNamePLUS	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
proxPos	TokenNameIdentifier	 prox Pos
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
predIndex	TokenNameIdentifier	 pred Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
proxPos	TokenNameIdentifier	 prox Pos
!=	TokenNameNOT_EQUAL	
predIndex	TokenNameIdentifier	 pred Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_PREDICATECOUNTING	TokenNameIdentifier	 DEBUG  PREDICATECOUNTING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" node context: "	TokenNameStringLiteral	 node context: 
+	TokenNamePLUS	
nodeToString	TokenNameIdentifier	 node To String
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"index predicate is false: "	TokenNameStringLiteral	index predicate is false: 
+	TokenNamePLUS	
proxPos	TokenNameIdentifier	 prox Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" ===== end predicate count ========"	TokenNameStringLiteral	 ===== end predicate count ========
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_PREDICATECOUNTING	TokenNameIdentifier	 DEBUG  PREDICATECOUNTING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" node context: "	TokenNameStringLiteral	 node context: 
+	TokenNamePLUS	
nodeToString	TokenNameIdentifier	 node To String
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"index predicate is true: "	TokenNameStringLiteral	index predicate is true: 
+	TokenNamePLUS	
proxPos	TokenNameIdentifier	 prox Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" ===== end predicate count ========"	TokenNameStringLiteral	 ===== end predicate count ========
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If there is a proximity index that will not change during the 	TokenNameCOMMENT_LINE	If there is a proximity index that will not change during the 
// course of itteration, then we know there can be no more true 	TokenNameCOMMENT_LINE	course of itteration, then we know there can be no more true 
// occurances of this predicate, so flag that we're done after 	TokenNameCOMMENT_LINE	occurances of this predicate, so flag that we're done after 
// this. 	TokenNameCOMMENT_LINE	this. 
// 	TokenNameCOMMENT_LINE	 
// bugzilla 14365 	TokenNameCOMMENT_LINE	bugzilla 14365 
// We can't set m_foundLast = true unless we're sure that -all- 	TokenNameCOMMENT_LINE	We can't set m_foundLast = true unless we're sure that -all- 
// remaining parameters are stable, or else last() fails. Fixed so 	TokenNameCOMMENT_LINE	remaining parameters are stable, or else last() fails. Fixed so 
// only sets m_foundLast if on the last predicate 	TokenNameCOMMENT_LINE	only sets m_foundLast if on the last predicate 
if	TokenNameif	
(	TokenNameLPAREN	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isStableNumber	TokenNameIdentifier	 is Stable Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
nPredicates	TokenNameIdentifier	 n Predicates
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
countProximityPosition	TokenNameIdentifier	 count Proximity Position
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
)	TokenNameRPAREN	
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
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popNamespaceContext	TokenNameIdentifier	 pop Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
popSubContextList	TokenNameIdentifier	 pop Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This function is used to fixup variables from QNames to stack frame * indexes at stylesheet build time. * @param vars List of QNames that correspond to variables. This list * should be searched backwards for the first qualified name that * corresponds to the variable reference qname. The position of the * QName in the vector from the start of the vector will be its position * in the stack frame (but variables above the globalsTop value will need * to be offset to the current stack frame). */	TokenNameCOMMENT_JAVADOC	 This function is used to fixup variables from QNames to stack frame indexes at stylesheet build time. @param vars List of QNames that correspond to variables. This list should be searched backwards for the first qualified name that corresponds to the variable reference qname. The position of the QName in the vector from the start of the vector will be its position in the stack frame (but variables above the globalsTop value will need to be offset to the current stack frame). 
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
nPredicates	TokenNameIdentifier	 n Predicates
=	TokenNameEQUAL	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
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
nPredicates	TokenNameIdentifier	 n Predicates
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fixupVariables	TokenNameIdentifier	 fixup Variables
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
,	TokenNameCOMMA	
globalsSize	TokenNameIdentifier	 globals Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Diagnostics. * * @param n Node to give diagnostic information about, or null. * * @return Informative string about the argument. */	TokenNameCOMMENT_JAVADOC	 Diagnostics. * @param n Node to give diagnostic information about, or null. * @return Informative string about the argument. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
nodeToString	TokenNameIdentifier	 node To String
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_lpi	TokenNameIdentifier	 m lpi
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
+	TokenNamePLUS	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"}"	TokenNameStringLiteral	}
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
"null"	TokenNameStringLiteral	null
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//=============== NodeFilter Implementation =============== 	TokenNameCOMMENT_LINE	=============== NodeFilter Implementation =============== 
/** * Test whether a specified node is visible in the logical view of a * TreeWalker or NodeIterator. This function will be called by the * implementation of TreeWalker and NodeIterator; it is not intended to * be called directly from user code. * @param n The node to check to see if it passes the filter or not. * @return a constant to determine whether the node is accepted, * rejected, or skipped, as defined above . */	TokenNameCOMMENT_JAVADOC	 Test whether a specified node is visible in the logical view of a TreeWalker or NodeIterator. This function will be called by the implementation of TreeWalker and NodeIterator; it is not intended to be called directly from user code. @param n The node to check to see if it passes the filter or not. @return a constant to determine whether the node is accepted, rejected, or skipped, as defined above . 
public	TokenNamepublic	
short	TokenNameshort	
acceptNode	TokenNameIdentifier	 accept Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
m_lpi	TokenNameIdentifier	 m lpi
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XObject	TokenNameIdentifier	 X Object
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("\n::acceptNode - score: "+score.num()+"::"); 	TokenNameCOMMENT_LINE	System.out.println("\n::acceptNode - score: "+score.num()+"::"); 
if	TokenNameif	
(	TokenNameLPAREN	
score	TokenNameIdentifier	 score
!=	TokenNameNOT_EQUAL	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
SCORE_NONE	TokenNameIdentifier	 SCORE  NONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
countProximityPosition	TokenNameIdentifier	 count Proximity Position
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
executePredicates	TokenNameIdentifier	 execute Predicates
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_ACCEPT	TokenNameIdentifier	 FILTER  ACCEPT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: Fix this. 	TokenNameCOMMENT_LINE	TODO: Fix this. 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
DTMIterator	TokenNameIdentifier	 DTM Iterator
.	TokenNameDOT	
FILTER_SKIP	TokenNameIdentifier	 FILTER  SKIP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the owning location path iterator. * * @return the owning location path iterator, which should not be null. */	TokenNameCOMMENT_JAVADOC	 Get the owning location path iterator. * @return the owning location path iterator, which should not be null. 
public	TokenNamepublic	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
getLocPathIterator	TokenNameIdentifier	 get Loc Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lpi	TokenNameIdentifier	 m lpi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the location path iterator owner for this walker. Besides * initialization, this function is called during cloning operations. * * @param li non-null reference to the owning location path iterator. */	TokenNameCOMMENT_JAVADOC	 Set the location path iterator owner for this walker. Besides initialization, this function is called during cloning operations. * @param li non-null reference to the owning location path iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocPathIterator	TokenNameIdentifier	 set Loc Path Iterator
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
li	TokenNameIdentifier	 li
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_lpi	TokenNameIdentifier	 m lpi
=	TokenNameEQUAL	
li	TokenNameIdentifier	 li
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
!=	TokenNameNOT_EQUAL	
li	TokenNameIdentifier	 li
)	TokenNameRPAREN	
li	TokenNameIdentifier	 li
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if this expression or it's subexpressions can traverse outside * the current subtree. * * @return true if traversal outside the context node's subtree can occur. */	TokenNameCOMMENT_JAVADOC	 Tell if this expression or it's subexpressions can traverse outside the current subtree. * @return true if traversal outside the context node's subtree can occur. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
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
if	TokenNameif	
(	TokenNameLPAREN	
getPredicate	TokenNameIdentifier	 get Predicate
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
canTraverseOutsideSubtree	TokenNameIdentifier	 can Traverse Outside Subtree
(	TokenNameLPAREN	
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
/** * This will traverse the heararchy, calling the visitor for * each member. If the called visitor method returns * false, the subtree should not be called. * * @param visitor The visitor whose appropriate method will be called. */	TokenNameCOMMENT_JAVADOC	 This will traverse the heararchy, calling the visitor for each member. If the called visitor method returns false, the subtree should not be called. * @param visitor The visitor whose appropriate method will be called. 
public	TokenNamepublic	
void	TokenNamevoid	
callPredicateVisitors	TokenNameIdentifier	 call Predicate Visitors
(	TokenNameLPAREN	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
ExpressionOwner	TokenNameIdentifier	 Expression Owner
predOwner	TokenNameIdentifier	 pred Owner
=	TokenNameEQUAL	
new	TokenNamenew	
PredOwner	TokenNameIdentifier	 Pred Owner
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitPredicate	TokenNameIdentifier	 visit Predicate
(	TokenNameLPAREN	
predOwner	TokenNameIdentifier	 pred Owner
,	TokenNameCOMMA	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
predOwner	TokenNameIdentifier	 pred Owner
,	TokenNameCOMMA	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see Expression#deepEquals(Expression) */	TokenNameCOMMENT_JAVADOC	 @see Expression#deepEquals(Expression) 
public	TokenNamepublic	
boolean	TokenNameboolean	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
super	TokenNamesuper	
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
pnt	TokenNameIdentifier	 pnt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
pnt	TokenNameIdentifier	 pnt
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pnt	TokenNameIdentifier	 pnt
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
pnt	TokenNameIdentifier	 pnt
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
pnt	TokenNameIdentifier	 pnt
.	TokenNameDOT	
m_predicates	TokenNameIdentifier	 m predicates
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This is true if nextNode returns null. */	TokenNameCOMMENT_JAVADOC	 This is true if nextNode returns null. 
transient	TokenNametransient	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The owning location path iterator. * @serial */	TokenNameCOMMENT_JAVADOC	 The owning location path iterator. @serial 
protected	TokenNameprotected	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
m_lpi	TokenNameIdentifier	 m lpi
;	TokenNameSEMICOLON	
/** * Which predicate we are executing. */	TokenNameCOMMENT_JAVADOC	 Which predicate we are executing. 
transient	TokenNametransient	
int	TokenNameint	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** The list of predicate expressions. Is static and does not need * to be deep cloned. * @serial */	TokenNameCOMMENT_JAVADOC	 The list of predicate expressions. Is static and does not need to be deep cloned. @serial 
private	TokenNameprivate	
Expression	TokenNameIdentifier	 Expression
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_predicates	TokenNameIdentifier	 m predicates
;	TokenNameSEMICOLON	
/** * An array of counts that correspond to the number * of predicates the step contains. */	TokenNameCOMMENT_JAVADOC	 An array of counts that correspond to the number of predicates the step contains. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_proximityPositions	TokenNameIdentifier	 m proximity Positions
;	TokenNameSEMICOLON	
/** If true, diagnostic messages about predicate execution will be posted. */	TokenNameCOMMENT_JAVADOC	 If true, diagnostic messages about predicate execution will be posted. 
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_PREDICATECOUNTING	TokenNameIdentifier	 DEBUG  PREDICATECOUNTING
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
class	TokenNameclass	
PredOwner	TokenNameIdentifier	 Pred Owner
implements	TokenNameimplements	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
{	TokenNameLBRACE	
int	TokenNameint	
m_index	TokenNameIdentifier	 m index
;	TokenNameSEMICOLON	
PredOwner	TokenNameIdentifier	 Pred Owner
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_index	TokenNameIdentifier	 m index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#getExpression() */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#getExpression() 
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see ExpressionOwner#setExpression(Expression) */	TokenNameCOMMENT_JAVADOC	 @see ExpressionOwner#setExpression(Expression) 
public	TokenNamepublic	
void	TokenNamevoid	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
.	TokenNameDOT	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_predicates	TokenNameIdentifier	 m predicates
[	TokenNameLBRACKET	
m_index	TokenNameIdentifier	 m index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
exp	TokenNameIdentifier	 exp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
