/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: RedundentExprEliminator.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: RedundentExprEliminator.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
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
QName	TokenNameIdentifier	 Q Name
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
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
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
ExpressionNode	TokenNameIdentifier	 Expression Node
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
XPath	TokenNameIdentifier	 X Path
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
AxesWalker	TokenNameIdentifier	 Axes Walker
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
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
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
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
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
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
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
SelfIteratorNoPredicate	TokenNameIdentifier	 Self Iterator No Predicate
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
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
Variable	TokenNameIdentifier	 Variable
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
operations	TokenNameIdentifier	 operations
.	TokenNameDOT	
VariableSafeAbsRef	TokenNameIdentifier	 Variable Safe Abs Ref
;	TokenNameSEMICOLON	
/** * This class eleminates redundent XPaths from a given subtree, * and also collects all absolute paths within the subtree. First * it must be called as a visitor to the subtree, and then * eleminateRedundent must be called. */	TokenNameCOMMENT_JAVADOC	 This class eleminates redundent XPaths from a given subtree, and also collects all absolute paths within the subtree. First it must be called as a visitor to the subtree, and then eleminateRedundent must be called. 
public	TokenNamepublic	
class	TokenNameclass	
RedundentExprEliminator	TokenNameIdentifier	 Redundent Expr Eliminator
extends	TokenNameextends	
XSLTVisitor	TokenNameIdentifier	 XSLT Visitor
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
m_paths	TokenNameIdentifier	 m paths
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
m_absPaths	TokenNameIdentifier	 m abs Paths
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
m_isSameContext	TokenNameIdentifier	 m is Same Context
;	TokenNameSEMICOLON	
AbsPathChecker	TokenNameIdentifier	 Abs Path Checker
m_absPathChecker	TokenNameIdentifier	 m abs Path Checker
=	TokenNameEQUAL	
new	TokenNamenew	
AbsPathChecker	TokenNameIdentifier	 Abs Path Checker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
m_uniquePseudoVarID	TokenNameIdentifier	 m unique Pseudo Var ID
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PSUEDOVARNAMESPACE	TokenNameIdentifier	 PSUEDOVARNAMESPACE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
S_VENDORURL	TokenNameIdentifier	 S  VENDORURL
+	TokenNamePLUS	
"/xalan/psuedovar"	TokenNameStringLiteral	/xalan/psuedovar
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG	TokenNameIdentifier	 DEBUG
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DIAGNOSE_NUM_PATHS_REDUCED	TokenNameIdentifier	 DIAGNOSE  NUM  PATHS  REDUCED
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DIAGNOSE_MULTISTEPLIST	TokenNameIdentifier	 DIAGNOSE  MULTISTEPLIST
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * So we can reuse it over and over again. */	TokenNameCOMMENT_JAVADOC	 So we can reuse it over and over again. 
VarNameCollector	TokenNameIdentifier	 Var Name Collector
m_varNameCollector	TokenNameIdentifier	 m var Name Collector
=	TokenNameEQUAL	
new	TokenNamenew	
VarNameCollector	TokenNameIdentifier	 Var Name Collector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct a RedundentExprEliminator. */	TokenNameCOMMENT_JAVADOC	 Construct a RedundentExprEliminator. 
public	TokenNamepublic	
RedundentExprEliminator	TokenNameIdentifier	 Redundent Expr Eliminator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isSameContext	TokenNameIdentifier	 m is Same Context
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_absPaths	TokenNameIdentifier	 m abs Paths
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_paths	TokenNameIdentifier	 m paths
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method to be called after the all expressions within an * node context have been visited. It eliminates redundent * expressions by creating a variable in the psuedoVarRecipient * for each redundent expression, and then rewriting the redundent * expression to be a variable reference. * * @param psuedoVarRecipient The recipient of the psuedo vars. The * variables will be inserted as first children of the element, before * any existing variables. */	TokenNameCOMMENT_JAVADOC	 Method to be called after the all expressions within an node context have been visited. It eliminates redundent expressions by creating a variable in the psuedoVarRecipient for each redundent expression, and then rewriting the redundent expression to be a variable reference. * @param psuedoVarRecipient The recipient of the psuedo vars. The variables will be inserted as first children of the element, before any existing variables. 
public	TokenNamepublic	
void	TokenNamevoid	
eleminateRedundentLocals	TokenNameIdentifier	 eleminate Redundent Locals
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eleminateRedundent	TokenNameIdentifier	 eleminate Redundent
(	TokenNameLPAREN	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
m_paths	TokenNameIdentifier	 m paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method to be called after the all global expressions within a stylesheet * have been collected. It eliminates redundent * expressions by creating a variable in the psuedoVarRecipient * for each redundent expression, and then rewriting the redundent * expression to be a variable reference. * */	TokenNameCOMMENT_JAVADOC	 Method to be called after the all global expressions within a stylesheet have been collected. It eliminates redundent expressions by creating a variable in the psuedoVarRecipient for each redundent expression, and then rewriting the redundent expression to be a variable reference. 
public	TokenNamepublic	
void	TokenNamevoid	
eleminateRedundentGlobals	TokenNameIdentifier	 eleminate Redundent Globals
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eleminateRedundent	TokenNameIdentifier	 eleminate Redundent
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
,	TokenNameCOMMA	
m_absPaths	TokenNameIdentifier	 m abs Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method to be called after the all expressions within an * node context have been visited. It eliminates redundent * expressions by creating a variable in the psuedoVarRecipient * for each redundent expression, and then rewriting the redundent * expression to be a variable reference. * * @param psuedoVarRecipient The owner of the subtree from where the * paths were collected. * @param paths A vector of paths that hold ExpressionOwner objects, * which must yield LocationPathIterators. */	TokenNameCOMMENT_JAVADOC	 Method to be called after the all expressions within an node context have been visited. It eliminates redundent expressions by creating a variable in the psuedoVarRecipient for each redundent expression, and then rewriting the redundent expression to be a variable reference. * @param psuedoVarRecipient The owner of the subtree from where the paths were collected. @param paths A vector of paths that hold ExpressionOwner objects, which must yield LocationPathIterators. 
protected	TokenNameprotected	
void	TokenNamevoid	
eleminateRedundent	TokenNameIdentifier	 eleminate Redundent
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numPathsEliminated	TokenNameIdentifier	 num Paths Eliminated
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
numUniquePathsEliminated	TokenNameIdentifier	 num Unique Paths Eliminated
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
)	TokenNameRPAREN	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
findAndEliminateRedundant	TokenNameIdentifier	 find And Eliminate Redundant
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
numUniquePathsEliminated	TokenNameIdentifier	 num Unique Paths Eliminated
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
numPathsEliminated	TokenNameIdentifier	 num Paths Eliminated
+=	TokenNamePLUS_EQUAL	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
eleminateSharedPartialPaths	TokenNameIdentifier	 eleminate Shared Partial Paths
(	TokenNameLPAREN	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DIAGNOSE_NUM_PATHS_REDUCED	TokenNameIdentifier	 DIAGNOSE  NUM  PATHS  REDUCED
)	TokenNameRPAREN	
diagnoseNumPaths	TokenNameIdentifier	 diagnose Num Paths
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
,	TokenNameCOMMA	
numPathsEliminated	TokenNameIdentifier	 num Paths Eliminated
,	TokenNameCOMMA	
numUniquePathsEliminated	TokenNameIdentifier	 num Unique Paths Eliminated
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Eliminate the shared partial paths in the expression list. * * @param psuedoVarRecipient The recipient of the psuedo vars. * * @param paths A vector of paths that hold ExpressionOwner objects, * which must yield LocationPathIterators. */	TokenNameCOMMENT_JAVADOC	 Eliminate the shared partial paths in the expression list. * @param psuedoVarRecipient The recipient of the psuedo vars. * @param paths A vector of paths that hold ExpressionOwner objects, which must yield LocationPathIterators. 
protected	TokenNameprotected	
void	TokenNamevoid	
eleminateSharedPartialPaths	TokenNameIdentifier	 eleminate Shared Partial Paths
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
createMultistepExprList	TokenNameIdentifier	 create Multistep Expr List
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DIAGNOSE_MULTISTEPLIST	TokenNameIdentifier	 DIAGNOSE  MULTISTEPLIST
)	TokenNameRPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
diagnose	TokenNameIdentifier	 diagnose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
=	TokenNameEQUAL	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
==	TokenNameEQUAL_EQUAL	
m_absPaths	TokenNameIdentifier	 m abs Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Iterate over the list, starting with the most number of paths, 	TokenNameCOMMENT_LINE	Iterate over the list, starting with the most number of paths, 
// trying to find the longest matches first. 	TokenNameCOMMENT_LINE	trying to find the longest matches first. 
int	TokenNameint	
longestStepsCount	TokenNameIdentifier	 longest Steps Count
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
m_stepCount	TokenNameIdentifier	 m step Count
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
longestStepsCount	TokenNameIdentifier	 longest Steps Count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_stepCount	TokenNameIdentifier	 m step Count
<	TokenNameLESS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
list	TokenNameIdentifier	 list
=	TokenNameEQUAL	
matchAndEliminatePartialPaths	TokenNameIdentifier	 match And Eliminate Partial Paths
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
isGlobal	TokenNameIdentifier	 is Global
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * For a given path, see if there are any partitial matches in the list, * and, if there are, replace those partial paths with psuedo variable refs, * and create the psuedo variable decl. * * @return The head of the list, which may have changed. */	TokenNameCOMMENT_JAVADOC	 For a given path, see if there are any partitial matches in the list, and, if there are, replace those partial paths with psuedo variable refs, and create the psuedo variable decl. * @return The head of the list, which may have changed. 
protected	TokenNameprotected	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
matchAndEliminatePartialPaths	TokenNameIdentifier	 match And Eliminate Partial Paths
(	TokenNameLPAREN	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
testee	TokenNameIdentifier	 testee
,	TokenNameCOMMA	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
,	TokenNameCOMMA	
int	TokenNameint	
lengthToTest	TokenNameIdentifier	 length To Test
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
varScope	TokenNameIdentifier	 var Scope
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
testee	TokenNameIdentifier	 testee
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
)	TokenNameRPAREN	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
// Start with the longest possible match, and move down. 	TokenNameCOMMENT_LINE	Start with the longest possible match, and move down. 
WalkingIterator	TokenNameIdentifier	 Walking Iterator
iter1	TokenNameIdentifier	 iter1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
testee	TokenNameIdentifier	 testee
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
partialIsVariable	TokenNameIdentifier	 partial Is Variable
(	TokenNameLPAREN	
testee	TokenNameIdentifier	 testee
,	TokenNameCOMMA	
lengthToTest	TokenNameIdentifier	 length To Test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
matchedPaths	TokenNameIdentifier	 matched Paths
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
matchedPathsTail	TokenNameIdentifier	 matched Paths Tail
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
meh	TokenNameIdentifier	 meh
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
meh	TokenNameIdentifier	 meh
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
meh	TokenNameIdentifier	 meh
!=	TokenNameNOT_EQUAL	
testee	TokenNameIdentifier	 testee
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
meh	TokenNameIdentifier	 meh
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
iter2	TokenNameIdentifier	 iter2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
meh	TokenNameIdentifier	 meh
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stepsEqual	TokenNameIdentifier	 steps Equal
(	TokenNameLPAREN	
iter1	TokenNameIdentifier	 iter1
,	TokenNameCOMMA	
iter2	TokenNameIdentifier	 iter2
,	TokenNameCOMMA	
lengthToTest	TokenNameIdentifier	 length To Test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
matchedPaths	TokenNameIdentifier	 matched Paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
matchedPaths	TokenNameIdentifier	 matched Paths
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
)	TokenNameRPAREN	
testee	TokenNameIdentifier	 testee
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testee	TokenNameIdentifier	 testee
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// So it won't be processed again. 	TokenNameCOMMENT_LINE	So it won't be processed again. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
matchedPathsTail	TokenNameIdentifier	 matched Paths Tail
=	TokenNameEQUAL	
matchedPaths	TokenNameIdentifier	 matched Paths
;	TokenNameSEMICOLON	
matchedPathsTail	TokenNameIdentifier	 matched Paths Tail
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
matchedPathsTail	TokenNameIdentifier	 matched Paths Tail
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
)	TokenNameRPAREN	
meh	TokenNameIdentifier	 meh
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
meh	TokenNameIdentifier	 meh
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// So it won't be processed again. 	TokenNameCOMMENT_LINE	So it won't be processed again. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
matchedPathsTail	TokenNameIdentifier	 matched Paths Tail
=	TokenNameEQUAL	
matchedPathsTail	TokenNameIdentifier	 matched Paths Tail
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
matchedPathsTail	TokenNameIdentifier	 matched Paths Tail
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
meh	TokenNameIdentifier	 meh
=	TokenNameEQUAL	
meh	TokenNameIdentifier	 meh
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
matchCount	TokenNameIdentifier	 match Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
matchedPaths	TokenNameIdentifier	 matched Paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
isGlobal	TokenNameIdentifier	 is Global
?	TokenNameQUESTION	
varScope	TokenNameIdentifier	 var Scope
:	TokenNameCOLON	
findCommonAncestor	TokenNameIdentifier	 find Common Ancestor
(	TokenNameLPAREN	
matchedPaths	TokenNameIdentifier	 matched Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
sharedIter	TokenNameIdentifier	 shared Iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
matchedPaths	TokenNameIdentifier	 matched Paths
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
newIter	TokenNameIdentifier	 new Iter
=	TokenNameEQUAL	
createIteratorFromSteps	TokenNameIdentifier	 create Iterator From Steps
(	TokenNameLPAREN	
sharedIter	TokenNameIdentifier	 shared Iter
,	TokenNameCOMMA	
lengthToTest	TokenNameIdentifier	 length To Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
createPseudoVarDecl	TokenNameIdentifier	 create Pseudo Var Decl
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
newIter	TokenNameIdentifier	 new Iter
,	TokenNameCOMMA	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DIAGNOSE_MULTISTEPLIST	TokenNameIdentifier	 DIAGNOSE  MULTISTEPLIST
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Created var: "	TokenNameStringLiteral	Created var: 
+	TokenNamePLUS	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
isGlobal	TokenNameIdentifier	 is Global
?	TokenNameQUESTION	
"(Global)"	TokenNameStringLiteral	(Global)
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
matchedPaths	TokenNameIdentifier	 matched Paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
matchedPaths	TokenNameIdentifier	 matched Paths
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
;	TokenNameSEMICOLON	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DIAGNOSE_MULTISTEPLIST	TokenNameIdentifier	 DIAGNOSE  MULTISTEPLIST
)	TokenNameRPAREN	
diagnoseLineNumber	TokenNameIdentifier	 diagnose Line Number
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
newIter2	TokenNameIdentifier	 new Iter2
=	TokenNameEQUAL	
changePartToRef	TokenNameIdentifier	 change Part To Ref
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
iter	TokenNameIdentifier	 iter
,	TokenNameCOMMA	
lengthToTest	TokenNameIdentifier	 length To Test
,	TokenNameCOMMA	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
newIter2	TokenNameIdentifier	 new Iter2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
matchedPaths	TokenNameIdentifier	 matched Paths
=	TokenNameEQUAL	
matchedPaths	TokenNameIdentifier	 matched Paths
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DIAGNOSE_MULTISTEPLIST	TokenNameIdentifier	 DIAGNOSE  MULTISTEPLIST
)	TokenNameRPAREN	
diagnoseMultistepList	TokenNameIdentifier	 diagnose Multistep List
(	TokenNameLPAREN	
matchCount	TokenNameIdentifier	 match Count
,	TokenNameCOMMA	
lengthToTest	TokenNameIdentifier	 length To Test
,	TokenNameCOMMA	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if results of partial reduction will just be a variable, in * which case, skip it. */	TokenNameCOMMENT_JAVADOC	 Check if results of partial reduction will just be a variable, in which case, skip it. 
boolean	TokenNameboolean	
partialIsVariable	TokenNameIdentifier	 partial Is Variable
(	TokenNameLPAREN	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
testee	TokenNameIdentifier	 testee
,	TokenNameCOMMA	
int	TokenNameint	
lengthToTest	TokenNameIdentifier	 length To Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
lengthToTest	TokenNameIdentifier	 length To Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
wi	TokenNameIdentifier	 wi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
testee	TokenNameIdentifier	 testee
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
getFirstWalker	TokenNameIdentifier	 get First Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell what line number belongs to a given expression. */	TokenNameCOMMENT_JAVADOC	 Tell what line number belongs to a given expression. 
protected	TokenNameprotected	
void	TokenNamevoid	
diagnoseLineNumber	TokenNameIdentifier	 diagnose Line Number
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
getElemFromExpression	TokenNameIdentifier	 get Elem From Expression
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Line "	TokenNameStringLiteral	 Line 
+	TokenNamePLUS	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a linked list of expressions, find the common ancestor that is * suitable for holding a psuedo variable for shared access. */	TokenNameCOMMENT_JAVADOC	 Given a linked list of expressions, find the common ancestor that is suitable for holding a psuedo variable for shared access. 
protected	TokenNameprotected	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
findCommonAncestor	TokenNameIdentifier	 find Common Ancestor
(	TokenNameLPAREN	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Not sure this algorithm is the best, but will do for the moment. 	TokenNameCOMMENT_LINE	Not sure this algorithm is the best, but will do for the moment. 
int	TokenNameint	
numExprs	TokenNameIdentifier	 num Exprs
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The following could be made cheaper by pre-allocating large arrays, 	TokenNameCOMMENT_LINE	The following could be made cheaper by pre-allocating large arrays, 
// but then we would have to assume a max number of reductions, 	TokenNameCOMMENT_LINE	but then we would have to assume a max number of reductions, 
// which I am not inclined to do right now. 	TokenNameCOMMENT_LINE	which I am not inclined to do right now. 
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elems	TokenNameIdentifier	 elems
=	TokenNameEQUAL	
new	TokenNamenew	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
[	TokenNameLBRACKET	
numExprs	TokenNameIdentifier	 num Exprs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ancestorCounts	TokenNameIdentifier	 ancestor Counts
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numExprs	TokenNameIdentifier	 num Exprs
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Loop through, getting the parent elements, and counting the 	TokenNameCOMMENT_LINE	Loop through, getting the parent elements, and counting the 
// ancestors. 	TokenNameCOMMENT_LINE	ancestors. 
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
int	TokenNameint	
shortestAncestorCount	TokenNameIdentifier	 shortest Ancestor Count
=	TokenNameEQUAL	
10000	TokenNameIntegerLiteral	
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
numExprs	TokenNameIdentifier	 num Exprs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
getElemFromExpression	TokenNameIdentifier	 get Elem From Expression
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
int	TokenNameint	
numAncestors	TokenNameIdentifier	 num Ancestors
=	TokenNameEQUAL	
countAncestors	TokenNameIdentifier	 count Ancestors
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ancestorCounts	TokenNameIdentifier	 ancestor Counts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
numAncestors	TokenNameIdentifier	 num Ancestors
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numAncestors	TokenNameIdentifier	 num Ancestors
<	TokenNameLESS	
shortestAncestorCount	TokenNameIdentifier	 shortest Ancestor Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shortestAncestorCount	TokenNameIdentifier	 shortest Ancestor Count
=	TokenNameEQUAL	
numAncestors	TokenNameIdentifier	 num Ancestors
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now loop through and "correct" the elements that have more ancestors. 	TokenNameCOMMENT_LINE	Now loop through and "correct" the elements that have more ancestors. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numExprs	TokenNameIdentifier	 num Exprs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ancestorCounts	TokenNameIdentifier	 ancestor Counts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>	TokenNameGREATER	
shortestAncestorCount	TokenNameIdentifier	 shortest Ancestor Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
numStepCorrection	TokenNameIdentifier	 num Step Correction
=	TokenNameEQUAL	
ancestorCounts	TokenNameIdentifier	 ancestor Counts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
shortestAncestorCount	TokenNameIdentifier	 shortest Ancestor Count
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
numStepCorrection	TokenNameIdentifier	 num Step Correction
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now everyone has an equal number of ancestors. Walk up from here 	TokenNameCOMMENT_LINE	Now everyone has an equal number of ancestors. Walk up from here 
// equally until all are equal. 	TokenNameCOMMENT_LINE	equally until all are equal. 
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
shortestAncestorCount	TokenNameIdentifier	 shortest Ancestor Count
--	TokenNameMINUS_MINUS	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
areEqual	TokenNameIdentifier	 are Equal
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numExprs	TokenNameIdentifier	 num Exprs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
!=	TokenNameNOT_EQUAL	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
areEqual	TokenNameIdentifier	 are Equal
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This second check is to make sure we have a common ancestor that is not the same 	TokenNameCOMMENT_LINE	This second check is to make sure we have a common ancestor that is not the same 
// as the expression owner... i.e. the var decl has to go above the expression owner. 	TokenNameCOMMENT_LINE	as the expression owner... i.e. the var decl has to go above the expression owner. 
if	TokenNameif	
(	TokenNameLPAREN	
areEqual	TokenNameIdentifier	 are Equal
&&	TokenNameAND_AND	
isNotSameAsOwner	TokenNameIdentifier	 is Not Same As Owner
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
canAcceptVariables	TokenNameIdentifier	 can Accept Variables
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DIAGNOSE_MULTISTEPLIST	TokenNameIdentifier	 DIAGNOSE  MULTISTEPLIST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" at "	TokenNameStringLiteral	 at 
+	TokenNamePLUS	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Line "	TokenNameStringLiteral	 Line 
+	TokenNamePLUS	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numExprs	TokenNameIdentifier	 num Exprs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
elems	TokenNameIdentifier	 elems
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"Could not find common ancestor!!!"	TokenNameStringLiteral	Could not find common ancestor!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find out if the given ElemTemplateElement is not the same as one of * the ElemTemplateElement owners of the expressions. * * @param head Head of linked list of expression owners. * @param ete The ElemTemplateElement that is a candidate for a psuedo * variable parent. * @return true if the given ElemTemplateElement is not the same as one of * the ElemTemplateElement owners of the expressions. This is to make sure * we find an ElemTemplateElement that is in a viable position to hold * psuedo variables that are visible to the references. */	TokenNameCOMMENT_JAVADOC	 Find out if the given ElemTemplateElement is not the same as one of the ElemTemplateElement owners of the expressions. * @param head Head of linked list of expression owners. @param ete The ElemTemplateElement that is a candidate for a psuedo variable parent. @return true if the given ElemTemplateElement is not the same as one of the ElemTemplateElement owners of the expressions. This is to make sure we find an ElemTemplateElement that is in a viable position to hold psuedo variables that are visible to the references. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isNotSameAsOwner	TokenNameIdentifier	 is Not Same As Owner
(	TokenNameLPAREN	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
head	TokenNameIdentifier	 head
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
ete	TokenNameIdentifier	 ete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elemOwner	TokenNameIdentifier	 elem Owner
=	TokenNameEQUAL	
getElemFromExpression	TokenNameIdentifier	 get Elem From Expression
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
elemOwner	TokenNameIdentifier	 elem Owner
==	TokenNameEQUAL_EQUAL	
ete	TokenNameIdentifier	 ete
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Count the number of ancestors that a ElemTemplateElement has. * * @param elem An representation of an element in an XSLT stylesheet. * @return The number of ancestors of elem (including the element itself). */	TokenNameCOMMENT_JAVADOC	 Count the number of ancestors that a ElemTemplateElement has. * @param elem An representation of an element in an XSLT stylesheet. @return The number of ancestors of elem (including the element itself). 
protected	TokenNameprotected	
int	TokenNameint	
countAncestors	TokenNameIdentifier	 count Ancestors
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print out diagnostics about partial multistep evaluation. */	TokenNameCOMMENT_JAVADOC	 Print out diagnostics about partial multistep evaluation. 
protected	TokenNameprotected	
void	TokenNamevoid	
diagnoseMultistepList	TokenNameIdentifier	 diagnose Multistep List
(	TokenNameLPAREN	
int	TokenNameint	
matchCount	TokenNameIdentifier	 match Count
,	TokenNameCOMMA	
int	TokenNameint	
lengthToTest	TokenNameIdentifier	 length To Test
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchCount	TokenNameIdentifier	 match Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Found multistep matches: "	TokenNameStringLiteral	Found multistep matches: 
+	TokenNamePLUS	
matchCount	TokenNameIdentifier	 match Count
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
lengthToTest	TokenNameIdentifier	 length To Test
+	TokenNamePLUS	
" length"	TokenNameStringLiteral	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" (global)"	TokenNameStringLiteral	 (global)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Change a given number of steps to a single variable reference. * * @param uniquePseudoVarName The name of the variable reference. * @param wi The walking iterator that is to be changed. * @param numSteps The number of steps to be changed. * @param isGlobal true if this will be a global reference. */	TokenNameCOMMENT_JAVADOC	 Change a given number of steps to a single variable reference. * @param uniquePseudoVarName The name of the variable reference. @param wi The walking iterator that is to be changed. @param numSteps The number of steps to be changed. @param isGlobal true if this will be a global reference. 
protected	TokenNameprotected	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
changePartToRef	TokenNameIdentifier	 change Part To Ref
(	TokenNameLPAREN	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
wi	TokenNameIdentifier	 wi
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
numSteps	TokenNameIdentifier	 num Steps
,	TokenNameCOMMA	
final	TokenNamefinal	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Variable	TokenNameIdentifier	 Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
new	TokenNamenew	
Variable	TokenNameIdentifier	 Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
setQName	TokenNameIdentifier	 set Q Name
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
setIsGlobal	TokenNameIdentifier	 set Is Global
(	TokenNameLPAREN	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
getElemFromExpression	TokenNameIdentifier	 get Elem From Expression
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
vars	TokenNameIdentifier	 vars
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getVariablesAndParamsComposed	TokenNameIdentifier	 get Variables And Params Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
vars	TokenNameIdentifier	 vars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Walk to the first walker after the one's we are replacing. 	TokenNameCOMMENT_LINE	Walk to the first walker after the one's we are replacing. 
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
getFirstWalker	TokenNameIdentifier	 get First Walker
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
numSteps	TokenNameIdentifier	 num Steps
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker	TokenNameIdentifier	 walker
,	TokenNameCOMMA	
"Walker should not be null!"	TokenNameStringLiteral	Walker should not be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
few	TokenNameIdentifier	 few
=	TokenNameEQUAL	
new	TokenNamenew	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
few	TokenNameIdentifier	 few
.	TokenNameDOT	
setInnerExpression	TokenNameIdentifier	 set Inner Expression
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
few	TokenNameIdentifier	 few
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
few	TokenNameIdentifier	 few
.	TokenNameDOT	
setNextWalker	TokenNameIdentifier	 set Next Walker
(	TokenNameLPAREN	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
setPrevWalker	TokenNameIdentifier	 set Prev Walker
(	TokenNameLPAREN	
few	TokenNameIdentifier	 few
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
setFirstWalker	TokenNameIdentifier	 set First Walker
(	TokenNameLPAREN	
few	TokenNameIdentifier	 few
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wi	TokenNameIdentifier	 wi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
feis	TokenNameIdentifier	 feis
=	TokenNameEQUAL	
new	TokenNamenew	
FilterExprIteratorSimple	TokenNameIdentifier	 Filter Expr Iterator Simple
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feis	TokenNameIdentifier	 feis
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
feis	TokenNameIdentifier	 feis
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create a new WalkingIterator from the steps in another WalkingIterator. * * @param wi The iterator from where the steps will be taken. * @param numSteps The number of steps from the first to copy into the new * iterator. * @return The new iterator. */	TokenNameCOMMENT_JAVADOC	 Create a new WalkingIterator from the steps in another WalkingIterator. * @param wi The iterator from where the steps will be taken. @param numSteps The number of steps from the first to copy into the new iterator. @return The new iterator. 
protected	TokenNameprotected	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
createIteratorFromSteps	TokenNameIdentifier	 create Iterator From Steps
(	TokenNameLPAREN	
final	TokenNamefinal	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
wi	TokenNameIdentifier	 wi
,	TokenNameCOMMA	
int	TokenNameint	
numSteps	TokenNameIdentifier	 num Steps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
newIter	TokenNameIdentifier	 new Iter
=	TokenNameEQUAL	
new	TokenNamenew	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
(	TokenNameLPAREN	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
getPrefixResolver	TokenNameIdentifier	 get Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
AxesWalker	TokenNameIdentifier	 Axes Walker
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
getFirstWalker	TokenNameIdentifier	 get First Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newIter	TokenNameIdentifier	 new Iter
.	TokenNameDOT	
setFirstWalker	TokenNameIdentifier	 set First Walker
(	TokenNameLPAREN	
walker	TokenNameIdentifier	 walker
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
setLocPathIterator	TokenNameIdentifier	 set Loc Path Iterator
(	TokenNameLPAREN	
newIter	TokenNameIdentifier	 new Iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numSteps	TokenNameIdentifier	 num Steps
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AxesWalker	TokenNameIdentifier	 Axes Walker
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AxesWalker	TokenNameIdentifier	 Axes Walker
)	TokenNameRPAREN	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
setNextWalker	TokenNameIdentifier	 set Next Walker
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
setLocPathIterator	TokenNameIdentifier	 set Loc Path Iterator
(	TokenNameLPAREN	
newIter	TokenNameIdentifier	 new Iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
walker	TokenNameIdentifier	 walker
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
walker	TokenNameIdentifier	 walker
.	TokenNameDOT	
setNextWalker	TokenNameIdentifier	 set Next Walker
(	TokenNameLPAREN	
null	TokenNamenull	
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
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newIter	TokenNameIdentifier	 new Iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare a given number of steps between two iterators, to see if they are equal. * * @param iter1 The first iterator to compare. * @param iter2 The second iterator to compare. * @param numSteps The number of steps to compare. * @return true If the given number of steps are equal. * */	TokenNameCOMMENT_JAVADOC	 Compare a given number of steps between two iterators, to see if they are equal. * @param iter1 The first iterator to compare. @param iter2 The second iterator to compare. @param numSteps The number of steps to compare. @return true If the given number of steps are equal. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
stepsEqual	TokenNameIdentifier	 steps Equal
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
iter1	TokenNameIdentifier	 iter1
,	TokenNameCOMMA	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
iter2	TokenNameIdentifier	 iter2
,	TokenNameCOMMA	
int	TokenNameint	
numSteps	TokenNameIdentifier	 num Steps
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AxesWalker	TokenNameIdentifier	 Axes Walker
aw1	TokenNameIdentifier	 aw1
=	TokenNameEQUAL	
iter1	TokenNameIdentifier	 iter1
.	TokenNameDOT	
getFirstWalker	TokenNameIdentifier	 get First Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
aw2	TokenNameIdentifier	 aw2
=	TokenNameEQUAL	
iter2	TokenNameIdentifier	 iter2
.	TokenNameDOT	
getFirstWalker	TokenNameIdentifier	 get First Walker
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
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numSteps	TokenNameIdentifier	 num Steps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
aw1	TokenNameIdentifier	 aw1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
aw2	TokenNameIdentifier	 aw2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
aw1	TokenNameIdentifier	 aw1
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
aw2	TokenNameIdentifier	 aw2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
aw1	TokenNameIdentifier	 aw1
=	TokenNameEQUAL	
aw1	TokenNameIdentifier	 aw1
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aw2	TokenNameIdentifier	 aw2
=	TokenNameEQUAL	
aw2	TokenNameIdentifier	 aw2
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
aw1	TokenNameIdentifier	 aw1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
aw2	TokenNameIdentifier	 aw2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Total match is incorrect!"	TokenNameStringLiteral	Total match is incorrect!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For the reduction of location path parts, create a list of all * the multistep paths with more than one step, sorted by the * number of steps, with the most steps occuring earlier in the list. * If the list is only one member, don't bother returning it. * * @param paths Vector of ExpressionOwner objects, which may contain null entries. * The ExpressionOwner objects must own LocPathIterator objects. * @return null if no multipart paths are found or the list is only of length 1, * otherwise the first MultistepExprHolder in a linked list of these objects. */	TokenNameCOMMENT_JAVADOC	 For the reduction of location path parts, create a list of all the multistep paths with more than one step, sorted by the number of steps, with the most steps occuring earlier in the list. If the list is only one member, don't bother returning it. * @param paths Vector of ExpressionOwner objects, which may contain null entries. The ExpressionOwner objects must own LocPathIterator objects. @return null if no multipart paths are found or the list is only of length 1, otherwise the first MultistepExprHolder in a linked list of these objects. 
protected	TokenNameprotected	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
createMultistepExprList	TokenNameIdentifier	 create Multistep Expr List
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
ExpressionOwner	TokenNameIdentifier	 Expression Owner
eo	TokenNameIdentifier	 eo
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
)	TokenNameRPAREN	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
eo	TokenNameIdentifier	 eo
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Assuming location path iterators should be OK. 	TokenNameCOMMENT_LINE	Assuming location path iterators should be OK. 
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
eo	TokenNameIdentifier	 eo
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numPaths	TokenNameIdentifier	 num Paths
=	TokenNameEQUAL	
countSteps	TokenNameIdentifier	 count Steps
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numPaths	TokenNameIdentifier	 num Paths
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
new	TokenNamenew	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
(	TokenNameLPAREN	
eo	TokenNameIdentifier	 eo
,	TokenNameCOMMA	
numPaths	TokenNameIdentifier	 num Paths
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
addInSortedOrder	TokenNameIdentifier	 add In Sorted Order
(	TokenNameLPAREN	
eo	TokenNameIdentifier	 eo
,	TokenNameCOMMA	
numPaths	TokenNameIdentifier	 num Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Look through the vector from start point, looking for redundant occurances. * When one or more are found, create a psuedo variable declaration, insert * it into the stylesheet, and replace the occurance with a reference to * the psuedo variable. When a redundent variable is found, it's slot in * the vector will be replaced by null. * * @param start The position to start looking in the vector. * @param firstOccuranceIndex The position of firstOccuranceOwner. * @param firstOccuranceOwner The owner of the expression we are looking for. * @param psuedoVarRecipient Where to put the psuedo variables. * * @return The number of expression occurances that were modified. */	TokenNameCOMMENT_JAVADOC	 Look through the vector from start point, looking for redundant occurances. When one or more are found, create a psuedo variable declaration, insert it into the stylesheet, and replace the occurance with a reference to the psuedo variable. When a redundent variable is found, it's slot in the vector will be replaced by null. * @param start The position to start looking in the vector. @param firstOccuranceIndex The position of firstOccuranceOwner. @param firstOccuranceOwner The owner of the expression we are looking for. @param psuedoVarRecipient Where to put the psuedo variables. * @return The number of expression occurances that were modified. 
protected	TokenNameprotected	
int	TokenNameint	
findAndEliminateRedundant	TokenNameIdentifier	 find And Eliminate Redundant
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
firstOccuranceIndex	TokenNameIdentifier	 first Occurance Index
,	TokenNameCOMMA	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
numPathsFound	TokenNameIdentifier	 num Paths Found
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expression	TokenNameIdentifier	 Expression
expr1	TokenNameIdentifier	 expr1
=	TokenNameEQUAL	
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
assertIsLocPathIterator	TokenNameIdentifier	 assert Is Loc Path Iterator
(	TokenNameLPAREN	
expr1	TokenNameIdentifier	 expr1
,	TokenNameCOMMA	
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
=	TokenNameEQUAL	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
==	TokenNameEQUAL_EQUAL	
m_absPaths	TokenNameIdentifier	 m abs Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
expr1	TokenNameIdentifier	 expr1
;	TokenNameSEMICOLON	
int	TokenNameint	
stepCount	TokenNameIdentifier	 step Count
=	TokenNameEQUAL	
countSteps	TokenNameIdentifier	 count Steps
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner2	TokenNameIdentifier	 owner2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
)	TokenNameRPAREN	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
owner2	TokenNameIdentifier	 owner2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
expr2	TokenNameIdentifier	 expr2
=	TokenNameEQUAL	
owner2	TokenNameIdentifier	 owner2
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isEqual	TokenNameIdentifier	 is Equal
=	TokenNameEQUAL	
expr2	TokenNameIdentifier	 expr2
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqual	TokenNameIdentifier	 is Equal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi2	TokenNameIdentifier	 lpi2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
expr2	TokenNameIdentifier	 expr2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
new	TokenNamenew	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
(	TokenNameLPAREN	
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
,	TokenNameCOMMA	
stepCount	TokenNameIdentifier	 step Count
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
numPathsFound	TokenNameIdentifier	 num Paths Found
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tail	TokenNameIdentifier	 tail
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
new	TokenNamenew	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
(	TokenNameLPAREN	
owner2	TokenNameIdentifier	 owner2
,	TokenNameCOMMA	
stepCount	TokenNameIdentifier	 step Count
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tail	TokenNameIdentifier	 tail
=	TokenNameEQUAL	
tail	TokenNameIdentifier	 tail
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
// Null out the occurance, so we don't have to test it again. 	TokenNameCOMMENT_LINE	Null out the occurance, so we don't have to test it again. 
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// foundFirst = true; 	TokenNameCOMMENT_LINE	foundFirst = true; 
numPathsFound	TokenNameIdentifier	 num Paths Found
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Change all globals in xsl:templates, etc, to global vars no matter what. 	TokenNameCOMMENT_LINE	Change all globals in xsl:templates, etc, to global vars no matter what. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
numPathsFound	TokenNameIdentifier	 num Paths Found
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
{	TokenNameLBRACE	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
new	TokenNamenew	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
(	TokenNameLPAREN	
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
,	TokenNameCOMMA	
stepCount	TokenNameIdentifier	 step Count
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numPathsFound	TokenNameIdentifier	 num Paths Found
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
isGlobal	TokenNameIdentifier	 is Global
?	TokenNameQUESTION	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
:	TokenNameCOLON	
findCommonAncestor	TokenNameIdentifier	 find Common Ancestor
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
sharedIter	TokenNameIdentifier	 shared Iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
createPseudoVarDecl	TokenNameIdentifier	 create Pseudo Var Decl
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
sharedIter	TokenNameIdentifier	 shared Iter
,	TokenNameCOMMA	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DIAGNOSE_MULTISTEPLIST	TokenNameIdentifier	 DIAGNOSE  MULTISTEPLIST
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Created var: "	TokenNameStringLiteral	Created var: 
+	TokenNamePLUS	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
isGlobal	TokenNameIdentifier	 is Global
?	TokenNameQUESTION	
"(Global)"	TokenNameStringLiteral	(Global)
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QName	TokenNameIdentifier	 Q Name
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
=	TokenNameEQUAL	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
m_exprOwner	TokenNameIdentifier	 m expr Owner
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DIAGNOSE_MULTISTEPLIST	TokenNameIdentifier	 DIAGNOSE  MULTISTEPLIST
)	TokenNameRPAREN	
diagnoseLineNumber	TokenNameIdentifier	 diagnose Line Number
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changeToVarRef	TokenNameIdentifier	 change To Var Ref
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Replace the first occurance with the variable's XPath, so 	TokenNameCOMMENT_LINE	Replace the first occurance with the variable's XPath, so 
// that further reduction may take place if needed. 	TokenNameCOMMENT_LINE	that further reduction may take place if needed. 
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
firstOccuranceIndex	TokenNameIdentifier	 first Occurance Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numPathsFound	TokenNameIdentifier	 num Paths Found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To be removed. */	TokenNameCOMMENT_JAVADOC	 To be removed. 
protected	TokenNameprotected	
int	TokenNameint	
oldFindAndEliminateRedundant	TokenNameIdentifier	 old Find And Eliminate Redundant
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
firstOccuranceIndex	TokenNameIdentifier	 first Occurance Index
,	TokenNameCOMMA	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
paths	TokenNameIdentifier	 paths
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
foundFirst	TokenNameIdentifier	 found First
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
numPathsFound	TokenNameIdentifier	 num Paths Found
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Expression	TokenNameIdentifier	 Expression
expr1	TokenNameIdentifier	 expr1
=	TokenNameEQUAL	
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
assertIsLocPathIterator	TokenNameIdentifier	 assert Is Loc Path Iterator
(	TokenNameLPAREN	
expr1	TokenNameIdentifier	 expr1
,	TokenNameCOMMA	
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
=	TokenNameEQUAL	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
==	TokenNameEQUAL_EQUAL	
m_absPaths	TokenNameIdentifier	 m abs Paths
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
expr1	TokenNameIdentifier	 expr1
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner2	TokenNameIdentifier	 owner2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
)	TokenNameRPAREN	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
owner2	TokenNameIdentifier	 owner2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Expression	TokenNameIdentifier	 Expression
expr2	TokenNameIdentifier	 expr2
=	TokenNameEQUAL	
owner2	TokenNameIdentifier	 owner2
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isEqual	TokenNameIdentifier	 is Equal
=	TokenNameEQUAL	
expr2	TokenNameIdentifier	 expr2
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isEqual	TokenNameIdentifier	 is Equal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi2	TokenNameIdentifier	 lpi2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
expr2	TokenNameIdentifier	 expr2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
foundFirst	TokenNameIdentifier	 found First
)	TokenNameRPAREN	
{	TokenNameLBRACE	
foundFirst	TokenNameIdentifier	 found First
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Insert variable decl into psuedoVarRecipient 	TokenNameCOMMENT_LINE	Insert variable decl into psuedoVarRecipient 
// We want to insert this into the first legitimate 	TokenNameCOMMENT_LINE	We want to insert this into the first legitimate 
// position for a variable. 	TokenNameCOMMENT_LINE	position for a variable. 
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
createPseudoVarDecl	TokenNameIdentifier	 create Pseudo Var Decl
(	TokenNameLPAREN	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
lpi	TokenNameIdentifier	 lpi
,	TokenNameCOMMA	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
=	TokenNameEQUAL	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changeToVarRef	TokenNameIdentifier	 change To Var Ref
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
,	TokenNameCOMMA	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Replace the first occurance with the variable's XPath, so 	TokenNameCOMMENT_LINE	Replace the first occurance with the variable's XPath, so 
// that further reduction may take place if needed. 	TokenNameCOMMENT_LINE	that further reduction may take place if needed. 
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
firstOccuranceIndex	TokenNameIdentifier	 first Occurance Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numPathsFound	TokenNameIdentifier	 num Paths Found
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
changeToVarRef	TokenNameIdentifier	 change To Var Ref
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
owner2	TokenNameIdentifier	 owner2
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
,	TokenNameCOMMA	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Null out the occurance, so we don't have to test it again. 	TokenNameCOMMENT_LINE	Null out the occurance, so we don't have to test it again. 
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// foundFirst = true; 	TokenNameCOMMENT_LINE	foundFirst = true; 
numPathsFound	TokenNameIdentifier	 num Paths Found
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Change all globals in xsl:templates, etc, to global vars no matter what. 	TokenNameCOMMENT_LINE	Change all globals in xsl:templates, etc, to global vars no matter what. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
numPathsFound	TokenNameIdentifier	 num Paths Found
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
==	TokenNameEQUAL_EQUAL	
m_absPaths	TokenNameIdentifier	 m abs Paths
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
createPseudoVarDecl	TokenNameIdentifier	 create Pseudo Var Decl
(	TokenNameLPAREN	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
lpi	TokenNameIdentifier	 lpi
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
=	TokenNameEQUAL	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
changeToVarRef	TokenNameIdentifier	 change To Var Ref
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
firstOccuranceOwner	TokenNameIdentifier	 first Occurance Owner
,	TokenNameCOMMA	
paths	TokenNameIdentifier	 paths
,	TokenNameCOMMA	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
setElementAt	TokenNameIdentifier	 set Element At
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
.	TokenNameDOT	
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
firstOccuranceIndex	TokenNameIdentifier	 first Occurance Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numPathsFound	TokenNameIdentifier	 num Paths Found
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
numPathsFound	TokenNameIdentifier	 num Paths Found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Count the steps in a given location path. * * @param lpi The location path iterator that owns the steps. * @return The number of steps in the given location path. */	TokenNameCOMMENT_JAVADOC	 Count the steps in a given location path. * @param lpi The location path iterator that owns the steps. @return The number of steps in the given location path. 
protected	TokenNameprotected	
int	TokenNameint	
countSteps	TokenNameIdentifier	 count Steps
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
instanceof	TokenNameinstanceof	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
wi	TokenNameIdentifier	 wi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
lpi	TokenNameIdentifier	 lpi
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
aw	TokenNameIdentifier	 aw
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
getFirstWalker	TokenNameIdentifier	 get First Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
aw	TokenNameIdentifier	 aw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
aw	TokenNameIdentifier	 aw
=	TokenNameEQUAL	
aw	TokenNameIdentifier	 aw
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Change the expression owned by the owner argument to a variable reference * of the given name. * * Warning: For global vars, this function relies on the variable declaration * to which it refers having been added just prior to this function being called, * so that the reference index can be determined from the size of the global variables * list minus one. * * @param varName The name of the variable which will be referenced. * @param owner The owner of the expression which will be replaced by a variable ref. * @param paths The paths list that the iterator came from, mainly to determine * if this is a local or global reduction. * @param psuedoVarRecipient The element within whose scope the variable is * being inserted, possibly a StylesheetRoot. */	TokenNameCOMMENT_JAVADOC	 Change the expression owned by the owner argument to a variable reference of the given name. * Warning: For global vars, this function relies on the variable declaration to which it refers having been added just prior to this function being called, so that the reference index can be determined from the size of the global variables list minus one. * @param varName The name of the variable which will be referenced. @param owner The owner of the expression which will be replaced by a variable ref. @param paths The paths list that the iterator came from, mainly to determine if this is a local or global reduction. @param psuedoVarRecipient The element within whose scope the variable is being inserted, possibly a StylesheetRoot. 
protected	TokenNameprotected	
void	TokenNamevoid	
changeToVarRef	TokenNameIdentifier	 change To Var Ref
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
varName	TokenNameIdentifier	 var Name
,	TokenNameCOMMA	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
paths	TokenNameIdentifier	 paths
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Variable	TokenNameIdentifier	 Variable
varRef	TokenNameIdentifier	 var Ref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
==	TokenNameEQUAL_EQUAL	
m_absPaths	TokenNameIdentifier	 m abs Paths
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
VariableSafeAbsRef	TokenNameIdentifier	 Variable Safe Abs Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
Variable	TokenNameIdentifier	 Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
varRef	TokenNameIdentifier	 var Ref
.	TokenNameDOT	
setQName	TokenNameIdentifier	 set Q Name
(	TokenNameLPAREN	
varName	TokenNameIdentifier	 var Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
==	TokenNameEQUAL_EQUAL	
m_absPaths	TokenNameIdentifier	 m abs Paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
)	TokenNameRPAREN	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
globalVars	TokenNameIdentifier	 global Vars
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
getVariablesAndParamsComposed	TokenNameIdentifier	 get Variables And Params Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Assume this operation is occuring just after the decl has 	TokenNameCOMMENT_LINE	Assume this operation is occuring just after the decl has 
// been added. 	TokenNameCOMMENT_LINE	been added. 
varRef	TokenNameIdentifier	 var Ref
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
globalVars	TokenNameIdentifier	 global Vars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
varRef	TokenNameIdentifier	 var Ref
.	TokenNameDOT	
setIsGlobal	TokenNameIdentifier	 set Is Global
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
setExpression	TokenNameIdentifier	 set Expression
(	TokenNameLPAREN	
varRef	TokenNameIdentifier	 var Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
static	TokenNamestatic	
int	TokenNameint	
getPseudoVarID	TokenNameIdentifier	 get Pseudo Var ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_uniquePseudoVarID	TokenNameIdentifier	 m unique Pseudo Var ID
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a psuedo variable reference that will represent the * shared redundent XPath, and add it to the stylesheet. * * @param psuedoVarRecipient The broadest scope of where the variable * should be inserted, usually an xsl:template or xsl:for-each. * @param lpi The LocationPathIterator that the variable should represent. * @param isGlobal true if the paths are global. * @return The new psuedo var element. */	TokenNameCOMMENT_JAVADOC	 Create a psuedo variable reference that will represent the shared redundent XPath, and add it to the stylesheet. * @param psuedoVarRecipient The broadest scope of where the variable should be inserted, usually an xsl:template or xsl:for-each. @param lpi The LocationPathIterator that the variable should represent. @param isGlobal true if the paths are global. @return The new psuedo var element. 
protected	TokenNameprotected	
ElemVariable	TokenNameIdentifier	 Elem Variable
createPseudoVarDecl	TokenNameIdentifier	 create Pseudo Var Decl
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
=	TokenNameEQUAL	
new	TokenNamenew	
QName	TokenNameIdentifier	 Q Name
(	TokenNameLPAREN	
PSUEDOVARNAMESPACE	TokenNameIdentifier	 PSUEDOVARNAMESPACE
,	TokenNameCOMMA	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
getPseudoVarID	TokenNameIdentifier	 get Pseudo Var ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isGlobal	TokenNameIdentifier	 is Global
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createGlobalPseudoVarDecl	TokenNameIdentifier	 create Global Pseudo Var Decl
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
)	TokenNameRPAREN	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
createLocalPseudoVarDecl	TokenNameIdentifier	 create Local Pseudo Var Decl
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a psuedo variable reference that will represent the * shared redundent XPath, for a local reduction. * * @param uniquePseudoVarName The name of the new variable. * @param stylesheetRoot The broadest scope of where the variable * should be inserted, which must be a StylesheetRoot element in this case. * @param lpi The LocationPathIterator that the variable should represent. * @return null if the decl was not created, otherwise the new Pseudo var * element. */	TokenNameCOMMENT_JAVADOC	 Create a psuedo variable reference that will represent the shared redundent XPath, for a local reduction. * @param uniquePseudoVarName The name of the new variable. @param stylesheetRoot The broadest scope of where the variable should be inserted, which must be a StylesheetRoot element in this case. @param lpi The LocationPathIterator that the variable should represent. @return null if the decl was not created, otherwise the new Pseudo var element. 
protected	TokenNameprotected	
ElemVariable	TokenNameIdentifier	 Elem Variable
createGlobalPseudoVarDecl	TokenNameIdentifier	 create Global Pseudo Var Decl
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheetRoot	TokenNameIdentifier	 stylesheet Root
,	TokenNameCOMMA	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
psuedoVar	TokenNameIdentifier	 psuedo Var
=	TokenNameEQUAL	
new	TokenNamenew	
ElemVariable	TokenNameIdentifier	 Elem Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psuedoVar	TokenNameIdentifier	 psuedo Var
.	TokenNameDOT	
setIsTopLevel	TokenNameIdentifier	 set Is Top Level
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psuedoVar	TokenNameIdentifier	 psuedo Var
.	TokenNameDOT	
setSelect	TokenNameIdentifier	 set Select
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psuedoVar	TokenNameIdentifier	 psuedo Var
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
globalVars	TokenNameIdentifier	 global Vars
=	TokenNameEQUAL	
stylesheetRoot	TokenNameIdentifier	 stylesheet Root
.	TokenNameDOT	
getVariablesAndParamsComposed	TokenNameIdentifier	 get Variables And Params Composed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psuedoVar	TokenNameIdentifier	 psuedo Var
.	TokenNameDOT	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
globalVars	TokenNameIdentifier	 global Vars
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
globalVars	TokenNameIdentifier	 global Vars
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
psuedoVar	TokenNameIdentifier	 psuedo Var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
psuedoVar	TokenNameIdentifier	 psuedo Var
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a psuedo variable reference that will represent the * shared redundent XPath, for a local reduction. * * @param uniquePseudoVarName The name of the new variable. * @param psuedoVarRecipient The broadest scope of where the variable * should be inserted, usually an xsl:template or xsl:for-each. * @param lpi The LocationPathIterator that the variable should represent. * @return null if the decl was not created, otherwise the new Pseudo var * element. */	TokenNameCOMMENT_JAVADOC	 Create a psuedo variable reference that will represent the shared redundent XPath, for a local reduction. * @param uniquePseudoVarName The name of the new variable. @param psuedoVarRecipient The broadest scope of where the variable should be inserted, usually an xsl:template or xsl:for-each. @param lpi The LocationPathIterator that the variable should represent. @return null if the decl was not created, otherwise the new Pseudo var element. 
protected	TokenNameprotected	
ElemVariable	TokenNameIdentifier	 Elem Variable
createLocalPseudoVarDecl	TokenNameIdentifier	 create Local Pseudo Var Decl
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
psuedoVar	TokenNameIdentifier	 psuedo Var
=	TokenNameEQUAL	
new	TokenNamenew	
ElemVariablePsuedo	TokenNameIdentifier	 Elem Variable Psuedo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
=	TokenNameEQUAL	
new	TokenNamenew	
XPath	TokenNameIdentifier	 X Path
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psuedoVar	TokenNameIdentifier	 psuedo Var
.	TokenNameDOT	
setSelect	TokenNameIdentifier	 set Select
(	TokenNameLPAREN	
xpath	TokenNameIdentifier	 xpath
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
psuedoVar	TokenNameIdentifier	 psuedo Var
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
uniquePseudoVarName	TokenNameIdentifier	 unique Pseudo Var Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemVariable	TokenNameIdentifier	 Elem Variable
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
addVarDeclToElem	TokenNameIdentifier	 add Var Decl To Elem
(	TokenNameLPAREN	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
lpi	TokenNameIdentifier	 lpi
,	TokenNameCOMMA	
psuedoVar	TokenNameIdentifier	 psuedo Var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpi	TokenNameIdentifier	 lpi
.	TokenNameDOT	
exprSetParent	TokenNameIdentifier	 expr Set Parent
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
var	TokenNameIdentifier	 var
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the given variable to the psuedoVarRecipient. */	TokenNameCOMMENT_JAVADOC	 Add the given variable to the psuedoVarRecipient. 
protected	TokenNameprotected	
ElemVariable	TokenNameIdentifier	 Elem Variable
addVarDeclToElem	TokenNameIdentifier	 add Var Decl To Elem
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
,	TokenNameCOMMA	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
lpi	TokenNameIdentifier	 lpi
,	TokenNameCOMMA	
ElemVariable	TokenNameIdentifier	 Elem Variable
psuedoVar	TokenNameIdentifier	 psuedo Var
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
// Create psuedo variable element 	TokenNameCOMMENT_LINE	Create psuedo variable element 
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
ete	TokenNameIdentifier	 ete
=	TokenNameEQUAL	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
.	TokenNameDOT	
getFirstChildElem	TokenNameIdentifier	 get First Child Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lpi	TokenNameIdentifier	 lpi
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
m_varNameCollector	TokenNameIdentifier	 m var Name Collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the location path contains variables, we have to insert the 	TokenNameCOMMENT_LINE	If the location path contains variables, we have to insert the 
// psuedo variable after the reference. (Otherwise, we want to 	TokenNameCOMMENT_LINE	psuedo variable after the reference. (Otherwise, we want to 
// insert it as close as possible to the top, so we'll be sure 	TokenNameCOMMENT_LINE	insert it as close as possible to the top, so we'll be sure 
// it is in scope for any other vars. 	TokenNameCOMMENT_LINE	it is in scope for any other vars. 
if	TokenNameif	
(	TokenNameLPAREN	
m_varNameCollector	TokenNameIdentifier	 m var Name Collector
.	TokenNameDOT	
getVarCount	TokenNameIdentifier	 get Var Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
baseElem	TokenNameIdentifier	 base Elem
=	TokenNameEQUAL	
getElemFromExpression	TokenNameIdentifier	 get Elem From Expression
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemVariable	TokenNameIdentifier	 Elem Variable
varElem	TokenNameIdentifier	 var Elem
=	TokenNameEQUAL	
getPrevVariableElem	TokenNameIdentifier	 get Prev Variable Elem
(	TokenNameLPAREN	
baseElem	TokenNameIdentifier	 base Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
varElem	TokenNameIdentifier	 var Elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_varNameCollector	TokenNameIdentifier	 m var Name Collector
.	TokenNameDOT	
doesOccur	TokenNameIdentifier	 does Occur
(	TokenNameLPAREN	
varElem	TokenNameIdentifier	 var Elem
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
=	TokenNameEQUAL	
varElem	TokenNameIdentifier	 var Elem
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ete	TokenNameIdentifier	 ete
=	TokenNameEQUAL	
varElem	TokenNameIdentifier	 var Elem
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
varElem	TokenNameIdentifier	 var Elem
=	TokenNameEQUAL	
getPrevVariableElem	TokenNameIdentifier	 get Prev Variable Elem
(	TokenNameLPAREN	
varElem	TokenNameIdentifier	 var Elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ete	TokenNameIdentifier	 ete
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
==	TokenNameEQUAL_EQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Can't stick something in front of a param, so abandon! (see variable13.xsl) 	TokenNameCOMMENT_LINE	Can't stick something in front of a param, so abandon! (see variable13.xsl) 
if	TokenNameif	
(	TokenNameLPAREN	
isParam	TokenNameIdentifier	 is Param
(	TokenNameLPAREN	
lpi	TokenNameIdentifier	 lpi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ete	TokenNameIdentifier	 ete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ete	TokenNameIdentifier	 ete
=	TokenNameEQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getNextSiblingElem	TokenNameIdentifier	 get Next Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ete	TokenNameIdentifier	 ete
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
!=	TokenNameNOT_EQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
psuedoVarRecipient	TokenNameIdentifier	 psuedo Var Recipient
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
psuedoVar	TokenNameIdentifier	 psuedo Var
,	TokenNameCOMMA	
ete	TokenNameIdentifier	 ete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_varNameCollector	TokenNameIdentifier	 m var Name Collector
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
psuedoVar	TokenNameIdentifier	 psuedo Var
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the expr param is contained within an xsl:param. */	TokenNameCOMMENT_JAVADOC	 Tell if the expr param is contained within an xsl:param. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isParam	TokenNameIdentifier	 is Param
(	TokenNameLPAREN	
ExpressionNode	TokenNameIdentifier	 Expression Node
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
expr	TokenNameIdentifier	 expr
instanceof	TokenNameinstanceof	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
ete	TokenNameIdentifier	 ete
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
expr	TokenNameIdentifier	 expr
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
ete	TokenNameIdentifier	 ete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_STYLESHEET	TokenNameIdentifier	 ELEMNAME  STYLESHEET
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ete	TokenNameIdentifier	 ete
=	TokenNameEQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the previous occurance of a xsl:variable. Stop * the search when a xsl:for-each, xsl:template, or xsl:stylesheet is * encountered. * * @param elem Should be non-null template element. * @return The first previous occurance of an xsl:variable or xsl:param, * or null if none is found. */	TokenNameCOMMENT_JAVADOC	 Find the previous occurance of a xsl:variable. Stop the search when a xsl:for-each, xsl:template, or xsl:stylesheet is encountered. * @param elem Should be non-null template element. @return The first previous occurance of an xsl:variable or xsl:param, or null if none is found. 
protected	TokenNameprotected	
ElemVariable	TokenNameIdentifier	 Elem Variable
getPrevVariableElem	TokenNameIdentifier	 get Prev Variable Elem
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This could be somewhat optimized. since getPreviousSiblingElem is a 	TokenNameCOMMENT_LINE	This could be somewhat optimized. since getPreviousSiblingElem is a 
// fairly expensive operation. 	TokenNameCOMMENT_LINE	fairly expensive operation. 
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
getPrevElementWithinContext	TokenNameIdentifier	 get Prev Element Within Context
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_VARIABLE	TokenNameIdentifier	 ELEMNAME  VARIABLE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_PARAMVARIABLE	TokenNameIdentifier	 ELEMNAME  PARAMVARIABLE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the previous sibling or parent of the given template, stopping at * xsl:for-each, xsl:template, or xsl:stylesheet. * * @param elem Should be non-null template element. * @return previous sibling or parent, or null if previous is xsl:for-each, * xsl:template, or xsl:stylesheet. */	TokenNameCOMMENT_JAVADOC	 Get the previous sibling or parent of the given template, stopping at xsl:for-each, xsl:template, or xsl:stylesheet. * @param elem Should be non-null template element. @return previous sibling or parent, or null if previous is xsl:for-each, xsl:template, or xsl:stylesheet. 
protected	TokenNameprotected	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
getPrevElementWithinContext	TokenNameIdentifier	 get Prev Element Within Context
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getPreviousSiblingElem	TokenNameIdentifier	 get Previous Sibling Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_FOREACH	TokenNameIdentifier	 ELEMNAME  FOREACH
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_STYLESHEET	TokenNameIdentifier	 ELEMNAME  STYLESHEET
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * From an XPath expression component, get the ElemTemplateElement * owner. * * @param expr Should be static expression with proper parentage. * @return Valid ElemTemplateElement, or throw a runtime exception * if it is not found. */	TokenNameCOMMENT_JAVADOC	 From an XPath expression component, get the ElemTemplateElement owner. * @param expr Should be static expression with proper parentage. @return Valid ElemTemplateElement, or throw a runtime exception if it is not found. 
protected	TokenNameprotected	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
getElemFromExpression	TokenNameIdentifier	 get Elem From Expression
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExpressionNode	TokenNameIdentifier	 Expression Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
instanceof	TokenNameinstanceof	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ASSERT_NO_TEMPLATE_PARENT	TokenNameIdentifier	 ER  ASSERT  NO  TEMPLATE  PARENT
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Programmer's error! expr has no ElemTemplateElement parent!"); 	TokenNameCOMMENT_LINE	"Programmer's error! expr has no ElemTemplateElement parent!"); 
}	TokenNameRBRACE	
/** * Tell if the given LocPathIterator is relative to an absolute path, i.e. * in not dependent on the context. * * @return true if the LocPathIterator is not dependent on the context node. */	TokenNameCOMMENT_JAVADOC	 Tell if the given LocPathIterator is relative to an absolute path, i.e. in not dependent on the context. * @return true if the LocPathIterator is not dependent on the context node. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isAbsolute	TokenNameIdentifier	 is Absolute
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
analysis	TokenNameIdentifier	 analysis
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isAbs	TokenNameIdentifier	 is Abs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
,	TokenNameCOMMA	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_ROOT	TokenNameIdentifier	 BIT  ROOT
)	TokenNameRPAREN	
||	TokenNameOR_OR	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
isSet	TokenNameIdentifier	 is Set
(	TokenNameLPAREN	
analysis	TokenNameIdentifier	 analysis
,	TokenNameCOMMA	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
BIT_ANY_DESCENDANT_FROM_ROOT	TokenNameIdentifier	 BIT  ANY  DESCENDANT  FROM  ROOT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isAbs	TokenNameIdentifier	 is Abs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isAbs	TokenNameIdentifier	 is Abs
=	TokenNameEQUAL	
m_absPathChecker	TokenNameIdentifier	 m abs Path Checker
.	TokenNameDOT	
checkAbsolute	TokenNameIdentifier	 check Absolute
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isAbs	TokenNameIdentifier	 is Abs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a LocationPath. * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param path The LocationPath object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a LocationPath. @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param path The LocationPath object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitLocationPath	TokenNameIdentifier	 visit Location Path
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't optimize "." or single step variable paths. 	TokenNameCOMMENT_LINE	Don't optimize "." or single step variable paths. 
// Both of these cases could use some further optimization by themselves. 	TokenNameCOMMENT_LINE	Both of these cases could use some further optimization by themselves. 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
instanceof	TokenNameinstanceof	
SelfIteratorNoPredicate	TokenNameIdentifier	 Self Iterator No Predicate
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
instanceof	TokenNameinstanceof	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
wi	TokenNameIdentifier	 wi
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WalkingIterator	TokenNameIdentifier	 Walking Iterator
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
AxesWalker	TokenNameIdentifier	 Axes Walker
aw	TokenNameIdentifier	 aw
=	TokenNameEQUAL	
wi	TokenNameIdentifier	 wi
.	TokenNameDOT	
getFirstWalker	TokenNameIdentifier	 get First Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aw	TokenNameIdentifier	 aw
instanceof	TokenNameinstanceof	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
aw	TokenNameIdentifier	 aw
.	TokenNameDOT	
getNextWalker	TokenNameIdentifier	 get Next Walker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
few	TokenNameIdentifier	 few
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FilterExprWalker	TokenNameIdentifier	 Filter Expr Walker
)	TokenNameRPAREN	
aw	TokenNameIdentifier	 aw
;	TokenNameSEMICOLON	
Expression	TokenNameIdentifier	 Expression
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
few	TokenNameIdentifier	 few
.	TokenNameDOT	
getInnerExpression	TokenNameIdentifier	 get Inner Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
exp	TokenNameIdentifier	 exp
instanceof	TokenNameinstanceof	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isAbsolute	TokenNameIdentifier	 is Absolute
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_absPaths	TokenNameIdentifier	 m abs Paths
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
validateNewAddition	TokenNameIdentifier	 validate New Addition
(	TokenNameLPAREN	
m_absPaths	TokenNameIdentifier	 m abs Paths
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_absPaths	TokenNameIdentifier	 m abs Paths
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_isSameContext	TokenNameIdentifier	 m is Same Context
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_paths	TokenNameIdentifier	 m paths
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
validateNewAddition	TokenNameIdentifier	 validate New Addition
(	TokenNameLPAREN	
m_paths	TokenNameIdentifier	 m paths
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_paths	TokenNameIdentifier	 m paths
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit a predicate within a location path. Note that there isn't a * proper unique component for predicates, and that the expression will * be called also for whatever type Expression is. * * @param owner The owner of the expression, to which the expression can * be reset if rewriting takes place. * @param pred The predicate object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit a predicate within a location path. Note that there isn't a proper unique component for predicates, and that the expression will be called also for whatever type Expression is. * @param owner The owner of the expression, to which the expression can be reset if rewriting takes place. @param pred The predicate object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitPredicate	TokenNameIdentifier	 visit Predicate
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
Expression	TokenNameIdentifier	 Expression
pred	TokenNameIdentifier	 pred
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
savedIsSame	TokenNameIdentifier	 saved Is Same
=	TokenNameEQUAL	
m_isSameContext	TokenNameIdentifier	 m is Same Context
;	TokenNameSEMICOLON	
m_isSameContext	TokenNameIdentifier	 m is Same Context
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Any further down, just collect the absolute paths. 	TokenNameCOMMENT_LINE	Any further down, just collect the absolute paths. 
pred	TokenNameIdentifier	 pred
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_isSameContext	TokenNameIdentifier	 m is Same Context
=	TokenNameEQUAL	
savedIsSame	TokenNameIdentifier	 saved Is Same
;	TokenNameSEMICOLON	
// We've already gone down the subtree, so don't go have the caller 	TokenNameCOMMENT_LINE	We've already gone down the subtree, so don't go have the caller 
// go any further. 	TokenNameCOMMENT_LINE	go any further. 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Visit an XSLT top-level instruction. * * @param elem The xsl instruction element object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an XSLT top-level instruction. * @param elem The xsl instruction element object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitTopLevelInstruction	TokenNameIdentifier	 visit Top Level Instruction
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
:	TokenNameCOLON	
return	TokenNamereturn	
visitInstruction	TokenNameIdentifier	 visit Instruction
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Visit an XSLT instruction. Any element that isn't called by one * of the other visit methods, will be called by this method. * * @param elem The xsl instruction element object. * @return true if the sub expressions should be traversed. */	TokenNameCOMMENT_JAVADOC	 Visit an XSLT instruction. Any element that isn't called by one of the other visit methods, will be called by this method. * @param elem The xsl instruction element object. @return true if the sub expressions should be traversed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
visitInstruction	TokenNameIdentifier	 visit Instruction
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_CALLTEMPLATE	TokenNameIdentifier	 ELEMNAME  CALLTEMPLATE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_FOREACH	TokenNameIdentifier	 ELEMNAME  FOREACH
:	TokenNameCOLON	
{	TokenNameLBRACE	
// Just get the select value. 	TokenNameCOMMENT_LINE	Just get the select value. 
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_FOREACH	TokenNameIdentifier	 ELEMNAME  FOREACH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemForEach	TokenNameIdentifier	 Elem For Each
efe	TokenNameIdentifier	 efe
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemForEach	TokenNameIdentifier	 Elem For Each
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
Expression	TokenNameIdentifier	 Expression
select	TokenNameIdentifier	 select
=	TokenNameEQUAL	
efe	TokenNameIdentifier	 efe
.	TokenNameDOT	
getSelect	TokenNameIdentifier	 get Select
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
select	TokenNameIdentifier	 select
.	TokenNameDOT	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
efe	TokenNameIdentifier	 efe
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Vector	TokenNameIdentifier	 Vector
savedPaths	TokenNameIdentifier	 saved Paths
=	TokenNameEQUAL	
m_paths	TokenNameIdentifier	 m paths
;	TokenNameSEMICOLON	
m_paths	TokenNameIdentifier	 m paths
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Visit children. Call the superclass callChildVisitors, because 	TokenNameCOMMENT_LINE	Visit children. Call the superclass callChildVisitors, because 
// we don't want to visit the xsl:for-each select attribute, or, for 	TokenNameCOMMENT_LINE	we don't want to visit the xsl:for-each select attribute, or, for 
// that matter, the xsl:template's match attribute. 	TokenNameCOMMENT_LINE	that matter, the xsl:template's match attribute. 
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eleminateRedundentLocals	TokenNameIdentifier	 eleminate Redundent Locals
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_paths	TokenNameIdentifier	 m paths
=	TokenNameEQUAL	
savedPaths	TokenNameIdentifier	 saved Paths
;	TokenNameSEMICOLON	
// select.callVisitors(efe, this); 	TokenNameCOMMENT_LINE	select.callVisitors(efe, this); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_NUMBER	TokenNameIdentifier	 ELEMNAME  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_SORT	TokenNameIdentifier	 ELEMNAME  SORT
:	TokenNameCOLON	
// Just collect absolute paths until and unless we can fully 	TokenNameCOMMENT_LINE	Just collect absolute paths until and unless we can fully 
// analyze these cases. 	TokenNameCOMMENT_LINE	analyze these cases. 
boolean	TokenNameboolean	
savedIsSame	TokenNameIdentifier	 saved Is Same
=	TokenNameEQUAL	
m_isSameContext	TokenNameIdentifier	 m is Same Context
;	TokenNameSEMICOLON	
m_isSameContext	TokenNameIdentifier	 m is Same Context
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
callChildVisitors	TokenNameIdentifier	 call Child Visitors
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_isSameContext	TokenNameIdentifier	 m is Same Context
=	TokenNameEQUAL	
savedIsSame	TokenNameIdentifier	 saved Is Same
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// ==== DIAGNOSTIC AND DEBUG FUNCTIONS ==== 	TokenNameCOMMENT_LINE	==== DIAGNOSTIC AND DEBUG FUNCTIONS ==== 
/** * Print out to std err the number of paths reduced. */	TokenNameCOMMENT_JAVADOC	 Print out to std err the number of paths reduced. 
protected	TokenNameprotected	
void	TokenNamevoid	
diagnoseNumPaths	TokenNameIdentifier	 diagnose Num Paths
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
paths	TokenNameIdentifier	 paths
,	TokenNameCOMMA	
int	TokenNameint	
numPathsEliminated	TokenNameIdentifier	 num Paths Eliminated
,	TokenNameCOMMA	
int	TokenNameint	
numUniquePathsEliminated	TokenNameIdentifier	 num Unique Paths Eliminated
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numPathsEliminated	TokenNameIdentifier	 num Paths Eliminated
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
paths	TokenNameIdentifier	 paths
==	TokenNameEQUAL_EQUAL	
m_paths	TokenNameIdentifier	 m paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Eliminated "	TokenNameStringLiteral	Eliminated 
+	TokenNamePLUS	
numPathsEliminated	TokenNameIdentifier	 num Paths Eliminated
+	TokenNamePLUS	
" total paths!"	TokenNameStringLiteral	 total paths!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Consolodated "	TokenNameStringLiteral	Consolodated 
+	TokenNamePLUS	
numUniquePathsEliminated	TokenNameIdentifier	 num Unique Paths Eliminated
+	TokenNamePLUS	
" redundent paths!"	TokenNameStringLiteral	 redundent paths!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Eliminated "	TokenNameStringLiteral	Eliminated 
+	TokenNamePLUS	
numPathsEliminated	TokenNameIdentifier	 num Paths Eliminated
+	TokenNamePLUS	
" total global paths!"	TokenNameStringLiteral	 total global paths!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Consolodated "	TokenNameStringLiteral	Consolodated 
+	TokenNamePLUS	
numUniquePathsEliminated	TokenNameIdentifier	 num Unique Paths Eliminated
+	TokenNamePLUS	
" redundent global paths!"	TokenNameStringLiteral	 redundent global paths!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Assert that the expression is a LocPathIterator, and, if * not, try to give some diagnostic info. */	TokenNameCOMMENT_JAVADOC	 Assert that the expression is a LocPathIterator, and, if not, try to give some diagnostic info. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
assertIsLocPathIterator	TokenNameIdentifier	 assert Is Loc Path Iterator
(	TokenNameLPAREN	
Expression	TokenNameIdentifier	 Expression
expr1	TokenNameIdentifier	 expr1
,	TokenNameCOMMA	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
eo	TokenNameIdentifier	 eo
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
expr1	TokenNameIdentifier	 expr1
instanceof	TokenNameinstanceof	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
errMsg	TokenNameIdentifier	 err Msg
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
expr1	TokenNameIdentifier	 expr1
instanceof	TokenNameinstanceof	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errMsg	TokenNameIdentifier	 err Msg
=	TokenNameEQUAL	
"Programmer's assertion: expr1 not an iterator: "	TokenNameStringLiteral	Programmer's assertion: expr1 not an iterator: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
expr1	TokenNameIdentifier	 expr1
)	TokenNameRPAREN	
.	TokenNameDOT	
getQName	TokenNameIdentifier	 get Q Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
errMsg	TokenNameIdentifier	 err Msg
=	TokenNameEQUAL	
"Programmer's assertion: expr1 not an iterator: "	TokenNameStringLiteral	Programmer's assertion: expr1 not an iterator: 
+	TokenNamePLUS	
expr1	TokenNameIdentifier	 expr1
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
errMsg	TokenNameIdentifier	 err Msg
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
eo	TokenNameIdentifier	 eo
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
expr1	TokenNameIdentifier	 expr1
.	TokenNameDOT	
exprGetParent	TokenNameIdentifier	 expr Get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Validate some assumptions about the new LocPathIterator and it's * owner and the state of the list. */	TokenNameCOMMENT_JAVADOC	 Validate some assumptions about the new LocPathIterator and it's owner and the state of the list. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
validateNewAddition	TokenNameIdentifier	 validate New Addition
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
paths	TokenNameIdentifier	 paths
,	TokenNameCOMMA	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
throws	TokenNamethrows	
RuntimeException	TokenNameIdentifier	 Runtime Exception
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
"owner.getExpression() != path!!!"	TokenNameStringLiteral	owner.getExpression() != path!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// There should never be any duplicates in the list! 	TokenNameCOMMENT_LINE	There should never be any duplicates in the list! 
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
ew	TokenNameIdentifier	 ew
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
)	TokenNameRPAREN	
paths	TokenNameIdentifier	 paths
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
ew	TokenNameIdentifier	 ew
!=	TokenNameNOT_EQUAL	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
"duplicate owner on the list!!!"	TokenNameStringLiteral	duplicate owner on the list!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
ew	TokenNameIdentifier	 ew
.	TokenNameDOT	
getExpression	TokenNameIdentifier	 get Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
path	TokenNameIdentifier	 path
,	TokenNameCOMMA	
"duplicate expression on the list!!!"	TokenNameStringLiteral	duplicate expression on the list!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Simple assertion. */	TokenNameCOMMENT_JAVADOC	 Simple assertion. 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_ASSERT_REDUNDENT_EXPR_ELIMINATOR	TokenNameIdentifier	 ER  ASSERT  REDUNDENT  EXPR  ELIMINATOR
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// "Programmer's assertion in RundundentExprEliminator: "+msg); 	TokenNameCOMMENT_LINE	"Programmer's assertion in RundundentExprEliminator: "+msg); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Since we want to sort multistep expressions by length, use * a linked list with elements of type MultistepExprHolder. */	TokenNameCOMMENT_JAVADOC	 Since we want to sort multistep expressions by length, use a linked list with elements of type MultistepExprHolder. 
class	TokenNameclass	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
m_exprOwner	TokenNameIdentifier	 m expr Owner
;	TokenNameSEMICOLON	
// Will change to null once we have processed this item. 	TokenNameCOMMENT_LINE	Will change to null once we have processed this item. 
final	TokenNamefinal	
int	TokenNameint	
m_stepCount	TokenNameIdentifier	 m step Count
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
/** * Clone this object. */	TokenNameCOMMENT_JAVADOC	 Clone this object. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a MultistepExprHolder. * * @param exprOwner the owner of the expression we are holding. * It must hold a LocationPathIterator. * @param stepCount The number of steps in the location path. */	TokenNameCOMMENT_JAVADOC	 Create a MultistepExprHolder. * @param exprOwner the owner of the expression we are holding. It must hold a LocationPathIterator. @param stepCount The number of steps in the location path. 
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
exprOwner	TokenNameIdentifier	 expr Owner
,	TokenNameCOMMA	
int	TokenNameint	
stepCount	TokenNameIdentifier	 step Count
,	TokenNameCOMMA	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_exprOwner	TokenNameIdentifier	 m expr Owner
=	TokenNameEQUAL	
exprOwner	TokenNameIdentifier	 expr Owner
;	TokenNameSEMICOLON	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_exprOwner	TokenNameIdentifier	 m expr Owner
,	TokenNameCOMMA	
"exprOwner can not be null!"	TokenNameStringLiteral	exprOwner can not be null!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_stepCount	TokenNameIdentifier	 m step Count
=	TokenNameEQUAL	
stepCount	TokenNameIdentifier	 step Count
;	TokenNameSEMICOLON	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a new MultistepExprHolder in sorted order in the list. * * @param exprOwner the owner of the expression we are holding. * It must hold a LocationPathIterator. * @param stepCount The number of steps in the location path. * @return The new head of the linked list. */	TokenNameCOMMENT_JAVADOC	 Add a new MultistepExprHolder in sorted order in the list. * @param exprOwner the owner of the expression we are holding. It must hold a LocationPathIterator. @param stepCount The number of steps in the location path. @return The new head of the linked list. 
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
addInSortedOrder	TokenNameIdentifier	 add In Sorted Order
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
exprOwner	TokenNameIdentifier	 expr Owner
,	TokenNameCOMMA	
int	TokenNameint	
stepCount	TokenNameIdentifier	 step Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stepCount	TokenNameIdentifier	 step Count
>=	TokenNameGREATER_EQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_stepCount	TokenNameIdentifier	 m step Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
newholder	TokenNameIdentifier	 newholder
=	TokenNameEQUAL	
new	TokenNamenew	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
(	TokenNameLPAREN	
exprOwner	TokenNameIdentifier	 expr Owner
,	TokenNameCOMMA	
stepCount	TokenNameIdentifier	 step Count
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
newholder	TokenNameIdentifier	 newholder
;	TokenNameSEMICOLON	
else	TokenNameelse	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
newholder	TokenNameIdentifier	 newholder
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
new	TokenNamenew	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
(	TokenNameLPAREN	
exprOwner	TokenNameIdentifier	 expr Owner
,	TokenNameCOMMA	
stepCount	TokenNameIdentifier	 step Count
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove the given element from the list. 'this' should * be the head of the list. If the item to be removed is not * found, an assertion will be made. * * @param itemToRemove The item to remove from the list. * @return The head of the list, which may have changed if itemToRemove * is the same as this element. Null if the item to remove is the * only item in the list. */	TokenNameCOMMENT_JAVADOC	 Remove the given element from the list. 'this' should be the head of the list. If the item to be removed is not found, an assertion will be made. * @param itemToRemove The item to remove from the list. @return The head of the list, which may have changed if itemToRemove is the same as this element. Null if the item to remove is the only item in the list. 
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
itemToRemove	TokenNameIdentifier	 item To Remove
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
itemToRemove	TokenNameIdentifier	 item To Remove
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
else	TokenNameelse	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"unlink failed!!!"	TokenNameStringLiteral	unlink failed!!!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of linked list items. */	TokenNameCOMMENT_JAVADOC	 Get the number of linked list items. 
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Print diagnostics out for the multistep list. */	TokenNameCOMMENT_JAVADOC	 Print diagnostics out for the multistep list. 
protected	TokenNameprotected	
void	TokenNamevoid	
diagnose	TokenNameIdentifier	 diagnose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"Found multistep iterators: "	TokenNameStringLiteral	Found multistep iterators: 
+	TokenNamePLUS	
this	TokenNamethis	
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MultistepExprHolder	TokenNameIdentifier	 Multistep Expr Holder
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_stepCount	TokenNameIdentifier	 m step Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
m_next	TokenNameIdentifier	 m next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
