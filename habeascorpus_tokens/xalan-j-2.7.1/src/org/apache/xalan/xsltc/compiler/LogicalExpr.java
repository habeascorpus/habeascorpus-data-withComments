/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: LogicalExpr.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: LogicalExpr.java 468650 2006-10-28 07:03:30Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
GOTO	TokenNameIdentifier	 GOTO
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
InstructionList	TokenNameIdentifier	 Instruction List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ClassGenerator	TokenNameIdentifier	 Class Generator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MethodGenerator	TokenNameIdentifier	 Method Generator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
MethodType	TokenNameIdentifier	 Method Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TypeCheckError	TokenNameIdentifier	 Type Check Error
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
final	TokenNamefinal	
class	TokenNameclass	
LogicalExpr	TokenNameIdentifier	 Logical Expr
extends	TokenNameextends	
Expression	TokenNameIdentifier	 Expression
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OR	TokenNameIdentifier	 OR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
AND	TokenNameIdentifier	 AND
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
_op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
// operator 	TokenNameCOMMENT_LINE	operator 
private	TokenNameprivate	
Expression	TokenNameIdentifier	 Expression
_left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
// first operand 	TokenNameCOMMENT_LINE	first operand 
private	TokenNameprivate	
Expression	TokenNameIdentifier	 Expression
_right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
// second operand 	TokenNameCOMMENT_LINE	second operand 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
Ops	TokenNameIdentifier	 Ops
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"or"	TokenNameStringLiteral	or
,	TokenNameCOMMA	
"and"	TokenNameStringLiteral	and
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Creates a new logical expression - either OR or AND. Note that the * left- and right-hand side expressions can also be logical expressions, * thus creating logical trees representing structures such as * (a and (b or c) and d), etc... */	TokenNameCOMMENT_JAVADOC	 Creates a new logical expression - either OR or AND. Note that the left- and right-hand side expressions can also be logical expressions, thus creating logical trees representing structures such as (a and (b or c) and d), etc... 
public	TokenNamepublic	
LogicalExpr	TokenNameIdentifier	 Logical Expr
(	TokenNameLPAREN	
int	TokenNameint	
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
Expression	TokenNameIdentifier	 Expression
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
Expression	TokenNameIdentifier	 Expression
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_op	TokenNameIdentifier	 op
=	TokenNameEQUAL	
op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this expressions contains a call to position(). This is * needed for context changes in node steps containing multiple predicates. */	TokenNameCOMMENT_JAVADOC	 Returns true if this expressions contains a call to position(). This is needed for context changes in node steps containing multiple predicates. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasPositionCall	TokenNameIdentifier	 has Position Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
hasPositionCall	TokenNameIdentifier	 has Position Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
hasPositionCall	TokenNameIdentifier	 has Position Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this expressions contains a call to last() */	TokenNameCOMMENT_JAVADOC	 Returns true if this expressions contains a call to last() 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasLastCall	TokenNameIdentifier	 has Last Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
hasLastCall	TokenNameIdentifier	 has Last Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
hasLastCall	TokenNameIdentifier	 has Last Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an object representing the compile-time evaluation * of an expression. We are only using this for function-available * and element-available at this time. */	TokenNameCOMMENT_JAVADOC	 Returns an object representing the compile-time evaluation of an expression. We are only using this for function-available and element-available at this time. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluateAtCompileTime	TokenNameIdentifier	 evaluate At Compile Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
leftb	TokenNameIdentifier	 leftb
=	TokenNameEQUAL	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
evaluateAtCompileTime	TokenNameIdentifier	 evaluate At Compile Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
rightb	TokenNameIdentifier	 rightb
=	TokenNameEQUAL	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
evaluateAtCompileTime	TokenNameIdentifier	 evaluate At Compile Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Return null if we can't evaluate at compile time 	TokenNameCOMMENT_LINE	Return null if we can't evaluate at compile time 
if	TokenNameif	
(	TokenNameLPAREN	
leftb	TokenNameIdentifier	 leftb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
rightb	TokenNameIdentifier	 rightb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_op	TokenNameIdentifier	 op
==	TokenNameEQUAL_EQUAL	
AND	TokenNameIdentifier	 AND
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
leftb	TokenNameIdentifier	 leftb
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
&&	TokenNameAND_AND	
rightb	TokenNameIdentifier	 rightb
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
leftb	TokenNameIdentifier	 leftb
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
||	TokenNameOR_OR	
rightb	TokenNameIdentifier	 rightb
==	TokenNameEQUAL_EQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns this logical expression's operator - OR or AND represented * by 0 and 1 respectively. */	TokenNameCOMMENT_JAVADOC	 Returns this logical expression's operator - OR or AND represented by 0 and 1 respectively. 
public	TokenNamepublic	
int	TokenNameint	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Override the SyntaxTreeNode.setParser() method to make sure that the * parser is set for sub-expressions */	TokenNameCOMMENT_JAVADOC	 Override the SyntaxTreeNode.setParser() method to make sure that the parser is set for sub-expressions 
public	TokenNamepublic	
void	TokenNamevoid	
setParser	TokenNameIdentifier	 set Parser
(	TokenNameLPAREN	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParser	TokenNameIdentifier	 set Parser
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
setParser	TokenNameIdentifier	 set Parser
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
setParser	TokenNameIdentifier	 set Parser
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string describing this expression */	TokenNameCOMMENT_JAVADOC	 Returns a string describing this expression 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Ops	TokenNameIdentifier	 Ops
[	TokenNameLBRACKET	
_op	TokenNameIdentifier	 op
]	TokenNameRBRACKET	
+	TokenNamePLUS	
'('	TokenNameCharacterLiteral	
+	TokenNamePLUS	
_left	TokenNameIdentifier	 left
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
_right	TokenNameIdentifier	 right
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Type-check this expression, and possibly child expressions. */	TokenNameCOMMENT_JAVADOC	 Type-check this expression, and possibly child expressions. 
public	TokenNamepublic	
Type	TokenNameIdentifier	 Type
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
throws	TokenNamethrows	
TypeCheckError	TokenNameIdentifier	 Type Check Error
{	TokenNameLBRACE	
// Get the left and right operand types 	TokenNameCOMMENT_LINE	Get the left and right operand types 
Type	TokenNameIdentifier	 Type
tleft	TokenNameIdentifier	 tleft
=	TokenNameEQUAL	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Type	TokenNameIdentifier	 Type
tright	TokenNameIdentifier	 tright
=	TokenNameEQUAL	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the operator supports the two operand types 	TokenNameCOMMENT_LINE	Check if the operator supports the two operand types 
MethodType	TokenNameIdentifier	 Method Type
wantType	TokenNameIdentifier	 want Type
=	TokenNameEQUAL	
new	TokenNamenew	
MethodType	TokenNameIdentifier	 Method Type
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Void	TokenNameIdentifier	 Void
,	TokenNameCOMMA	
tleft	TokenNameIdentifier	 tleft
,	TokenNameCOMMA	
tright	TokenNameIdentifier	 tright
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MethodType	TokenNameIdentifier	 Method Type
haveType	TokenNameIdentifier	 have Type
=	TokenNameEQUAL	
lookupPrimop	TokenNameIdentifier	 lookup Primop
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
,	TokenNameCOMMA	
Ops	TokenNameIdentifier	 Ops
[	TokenNameLBRACKET	
_op	TokenNameIdentifier	 op
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
wantType	TokenNameIdentifier	 want Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Yes, the operation is supported 	TokenNameCOMMENT_LINE	Yes, the operation is supported 
if	TokenNameif	
(	TokenNameLPAREN	
haveType	TokenNameIdentifier	 have Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check if left-hand side operand must be type casted 	TokenNameCOMMENT_LINE	Check if left-hand side operand must be type casted 
Type	TokenNameIdentifier	 Type
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
haveType	TokenNameIdentifier	 have Type
.	TokenNameDOT	
argsType	TokenNameIdentifier	 args Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
arg1	TokenNameIdentifier	 arg1
.	TokenNameDOT	
identicalTo	TokenNameIdentifier	 identical To
(	TokenNameLPAREN	
tleft	TokenNameIdentifier	 tleft
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
new	TokenNamenew	
CastExpr	TokenNameIdentifier	 Cast Expr
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if right-hand side operand must be type casted 	TokenNameCOMMENT_LINE	Check if right-hand side operand must be type casted 
Type	TokenNameIdentifier	 Type
arg2	TokenNameIdentifier	 arg2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
haveType	TokenNameIdentifier	 have Type
.	TokenNameDOT	
argsType	TokenNameIdentifier	 args Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
arg2	TokenNameIdentifier	 arg2
.	TokenNameDOT	
identicalTo	TokenNameIdentifier	 identical To
(	TokenNameLPAREN	
tright	TokenNameIdentifier	 tright
)	TokenNameRPAREN	
)	TokenNameRPAREN	
_right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
new	TokenNamenew	
CastExpr	TokenNameIdentifier	 Cast Expr
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Return the result type for the operator we will use 	TokenNameCOMMENT_LINE	Return the result type for the operator we will use 
return	TokenNamereturn	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
haveType	TokenNameIdentifier	 have Type
.	TokenNameDOT	
resultType	TokenNameIdentifier	 result Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TypeCheckError	TokenNameIdentifier	 Type Check Error
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compile the expression - leave boolean expression on stack */	TokenNameCOMMENT_JAVADOC	 Compile the expression - leave boolean expression on stack 
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translateDesynthesized	TokenNameIdentifier	 translate Desynthesized
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synthesize	TokenNameIdentifier	 synthesize
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compile expression and update true/false-lists */	TokenNameCOMMENT_JAVADOC	 Compile expression and update true/false-lists 
public	TokenNamepublic	
void	TokenNamevoid	
translateDesynthesized	TokenNameIdentifier	 translate Desynthesized
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
=	TokenNameEQUAL	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compile AND-expression 	TokenNameCOMMENT_LINE	Compile AND-expression 
if	TokenNameif	
(	TokenNameLPAREN	
_op	TokenNameIdentifier	 op
==	TokenNameEQUAL_EQUAL	
AND	TokenNameIdentifier	 AND
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Translate left hand side - must be true 	TokenNameCOMMENT_LINE	Translate left hand side - must be true 
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
translateDesynthesized	TokenNameIdentifier	 translate Desynthesized
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need this for chaining any OR-expression children 	TokenNameCOMMENT_LINE	Need this for chaining any OR-expression children 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
middle	TokenNameIdentifier	 middle
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NOP	TokenNameIdentifier	 NOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Translate left right side - must be true 	TokenNameCOMMENT_LINE	Translate left right side - must be true 
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
translateDesynthesized	TokenNameIdentifier	 translate Desynthesized
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Need this for chaining any OR-expression children 	TokenNameCOMMENT_LINE	Need this for chaining any OR-expression children 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NOP	TokenNameIdentifier	 NOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Append child expression false-lists to our false-list 	TokenNameCOMMENT_LINE	Append child expression false-lists to our false-list 
_falseList	TokenNameIdentifier	 false List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
_falseList	TokenNameIdentifier	 false List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
_falseList	TokenNameIdentifier	 false List
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Special case for OR-expression as a left child of AND. 	TokenNameCOMMENT_LINE	Special case for OR-expression as a left child of AND. 
// The true-list of OR must point to second clause of AND. 	TokenNameCOMMENT_LINE	The true-list of OR must point to second clause of AND. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
LogicalExpr	TokenNameIdentifier	 Logical Expr
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogicalExpr	TokenNameIdentifier	 Logical Expr
)	TokenNameRPAREN	
_left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
OR	TokenNameIdentifier	 OR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
backPatchTrueList	TokenNameIdentifier	 back Patch True List
(	TokenNameLPAREN	
middle	TokenNameIdentifier	 middle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
NotCall	TokenNameIdentifier	 Not Call
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
backPatchTrueList	TokenNameIdentifier	 back Patch True List
(	TokenNameLPAREN	
middle	TokenNameIdentifier	 middle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
_trueList	TokenNameIdentifier	 true List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Special case for OR-expression as a right child of AND 	TokenNameCOMMENT_LINE	Special case for OR-expression as a right child of AND 
// The true-list of OR must point to true-list of AND. 	TokenNameCOMMENT_LINE	The true-list of OR must point to true-list of AND. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
instanceof	TokenNameinstanceof	
LogicalExpr	TokenNameIdentifier	 Logical Expr
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogicalExpr	TokenNameIdentifier	 Logical Expr
)	TokenNameRPAREN	
_right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
.	TokenNameDOT	
getOp	TokenNameIdentifier	 get Op
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
OR	TokenNameIdentifier	 OR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
backPatchTrueList	TokenNameIdentifier	 back Patch True List
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
instanceof	TokenNameinstanceof	
NotCall	TokenNameIdentifier	 Not Call
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
backPatchTrueList	TokenNameIdentifier	 back Patch True List
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
_trueList	TokenNameIdentifier	 true List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Compile OR-expression 	TokenNameCOMMENT_LINE	Compile OR-expression 
else	TokenNameelse	
{	TokenNameLBRACE	
// Translate left-hand side expression and produce true/false list 	TokenNameCOMMENT_LINE	Translate left-hand side expression and produce true/false list 
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
translateDesynthesized	TokenNameIdentifier	 translate Desynthesized
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This GOTO is used to skip over the code for the last test 	TokenNameCOMMENT_LINE	This GOTO is used to skip over the code for the last test 
// in the case where the the first test succeeds 	TokenNameCOMMENT_LINE	in the case where the the first test succeeds 
InstructionHandle	TokenNameIdentifier	 Instruction Handle
ih	TokenNameIdentifier	 ih
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
GOTO	TokenNameIdentifier	 GOTO
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Translate right-hand side expression and produce true/false list 	TokenNameCOMMENT_LINE	Translate right-hand side expression and produce true/false list 
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
translateDesynthesized	TokenNameIdentifier	 translate Desynthesized
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
_trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
backPatch	TokenNameIdentifier	 back Patch
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
_falseList	TokenNameIdentifier	 false List
.	TokenNameDOT	
backPatch	TokenNameIdentifier	 back Patch
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_falseList	TokenNameIdentifier	 false List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
_falseList	TokenNameIdentifier	 false List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ih	TokenNameIdentifier	 ih
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
_trueList	TokenNameIdentifier	 true List
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
