/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: FuncPosition.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: FuncPosition.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
functions	TokenNameIdentifier	 functions
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
SubContextList	TokenNameIdentifier	 Sub Context List
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
XNumber	TokenNameIdentifier	 X Number
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
/** * Execute the Position() function. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Execute the Position() function. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
FuncPosition	TokenNameIdentifier	 Func Position
extends	TokenNameextends	
Function	TokenNameIdentifier	 Function
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
9092846348197271582L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
;	TokenNameSEMICOLON	
/** * Figure out if we're executing a toplevel expression. * If so, we can't be inside of a predicate. */	TokenNameCOMMENT_JAVADOC	 Figure out if we're executing a toplevel expression. If so, we can't be inside of a predicate. 
public	TokenNamepublic	
void	TokenNamevoid	
postCompileStep	TokenNameIdentifier	 post Compile Step
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
=	TokenNameEQUAL	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
getLocationPathDepth	TokenNameIdentifier	 get Location Path Depth
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the position in the current context node list. * * @param xctxt Runtime XPath context. * * @return The current position of the itteration in the context node list, * or -1 if there is no active context node list. */	TokenNameCOMMENT_JAVADOC	 Get the position in the current context node list. * @param xctxt Runtime XPath context. * @return The current position of the itteration in the context node list, or -1 if there is no active context node list. 
public	TokenNamepublic	
int	TokenNameint	
getPositionInContextNodeList	TokenNameIdentifier	 get Position In Context Node List
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("FuncPosition- entry"); 	TokenNameCOMMENT_LINE	System.out.println("FuncPosition- entry"); 
// If we're in a predicate, then this will return non-null. 	TokenNameCOMMENT_LINE	If we're in a predicate, then this will return non-null. 
SubContextList	TokenNameIdentifier	 Sub Context List
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getSubContextList	TokenNameIdentifier	 get Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prox	TokenNameIdentifier	 prox
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("FuncPosition- prox: "+prox); 	TokenNameCOMMENT_LINE	System.out.println("FuncPosition- prox: "+prox); 
return	TokenNamereturn	
prox	TokenNameIdentifier	 prox
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cnl	TokenNameIdentifier	 cnl
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cnl	TokenNameIdentifier	 cnl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
cnl	TokenNameIdentifier	 cnl
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cnl	TokenNameIdentifier	 cnl
.	TokenNameDOT	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Then I think we're in a sort. See sort21.xsl. So the iterator has 	TokenNameCOMMENT_LINE	Then I think we're in a sort. See sort21.xsl. So the iterator has 
// already been spent, and is not on the node we're processing. 	TokenNameCOMMENT_LINE	already been spent, and is not on the node we're processing. 
// It's highly possible that this is an issue for other context-list 	TokenNameCOMMENT_LINE	It's highly possible that this is an issue for other context-list 
// functions. Shouldn't be a problem for last(), and it shouldn't be 	TokenNameCOMMENT_LINE	functions. Shouldn't be a problem for last(), and it shouldn't be 
// a problem for current(). 	TokenNameCOMMENT_LINE	a problem for current(). 
try	TokenNametry	
{	TokenNameLBRACE	
cnl	TokenNameIdentifier	 cnl
=	TokenNameEQUAL	
cnl	TokenNameIdentifier	 cnl
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
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
int	TokenNameint	
currentNode	TokenNameIdentifier	 current Node
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("currentNode: "+currentNode); 	TokenNameCOMMENT_LINE	System.out.println("currentNode: "+currentNode); 
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
cnl	TokenNameIdentifier	 cnl
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
currentNode	TokenNameIdentifier	 current Node
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("n: "+n); 	TokenNameCOMMENT_LINE	System.out.println("n: "+n); 
// System.out.println("FuncPosition- cnl.getCurrentPos(): "+cnl.getCurrentPos()); 	TokenNameCOMMENT_LINE	System.out.println("FuncPosition- cnl.getCurrentPos(): "+cnl.getCurrentPos()); 
return	TokenNamereturn	
cnl	TokenNameIdentifier	 cnl
.	TokenNameDOT	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("FuncPosition - out of guesses: -1"); 	TokenNameCOMMENT_LINE	System.out.println("FuncPosition - out of guesses: -1"); 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute the function. The function must return * a valid object. * @param xctxt The current execution context. * @return A valid XObject. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute the function. The function must return a valid object. @param xctxt The current execution context. @return A valid XObject. * @throws javax.xml.transform.TransformerException 
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
double	TokenNamedouble	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
getPositionInContextNodeList	TokenNameIdentifier	 get Position In Context Node List
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
XNumber	TokenNameIdentifier	 X Number
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * No arguments to process, so this does nothing. */	TokenNameCOMMENT_JAVADOC	 No arguments to process, so this does nothing. 
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
// no-op 	TokenNameCOMMENT_LINE	no-op 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
