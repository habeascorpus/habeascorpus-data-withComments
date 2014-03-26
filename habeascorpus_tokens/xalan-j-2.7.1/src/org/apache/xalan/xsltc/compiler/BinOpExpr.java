/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: BinOpExpr.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: BinOpExpr.java 468650 2006-10-28 07:03:30Z minchau $ 
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
ErrorMsg	TokenNameIdentifier	 Error Msg
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
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
final	TokenNamefinal	
class	TokenNameclass	
BinOpExpr	TokenNameIdentifier	 Bin Op Expr
extends	TokenNameextends	
Expression	TokenNameIdentifier	 Expression
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PLUS	TokenNameIdentifier	 PLUS
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MINUS	TokenNameIdentifier	 MINUS
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TIMES	TokenNameIdentifier	 TIMES
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DIV	TokenNameIdentifier	 DIV
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MOD	TokenNameIdentifier	 MOD
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
Ops	TokenNameIdentifier	 Ops
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"+"	TokenNameStringLiteral	+
,	TokenNameCOMMA	
"-"	TokenNameStringLiteral	-
,	TokenNameCOMMA	
"*"	TokenNameStringLiteral	*
,	TokenNameCOMMA	
"/"	TokenNameStringLiteral	/
,	TokenNameCOMMA	
"%"	TokenNameStringLiteral	%
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_op	TokenNameIdentifier	 op
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Expression	TokenNameIdentifier	 Expression
_left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
_right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BinOpExpr	TokenNameIdentifier	 Bin Op Expr
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
if	TokenNameif	
(	TokenNameLPAREN	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
hasPositionCall	TokenNameIdentifier	 has Position Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
hasPositionCall	TokenNameIdentifier	 has Position Call
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
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
final	TokenNamefinal	
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
final	TokenNamefinal	
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
final	TokenNamefinal	
MethodType	TokenNameIdentifier	 Method Type
ptype	TokenNameIdentifier	 ptype
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ptype	TokenNameIdentifier	 ptype
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
arg1	TokenNameIdentifier	 arg1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
ptype	TokenNameIdentifier	 ptype
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
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
arg2	TokenNameIdentifier	 arg2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
)	TokenNameRPAREN	
ptype	TokenNameIdentifier	 ptype
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
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
return	TokenNamereturn	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
ptype	TokenNameIdentifier	 ptype
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
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
_op	TokenNameIdentifier	 op
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PLUS	TokenNameIdentifier	 PLUS
:	TokenNameCOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
.	TokenNameDOT	
ADD	TokenNameIdentifier	 ADD
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MINUS	TokenNameIdentifier	 MINUS
:	TokenNameCOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
.	TokenNameDOT	
SUB	TokenNameIdentifier	 SUB
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TIMES	TokenNameIdentifier	 TIMES
:	TokenNameCOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
.	TokenNameDOT	
MUL	TokenNameIdentifier	 MUL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DIV	TokenNameIdentifier	 DIV
:	TokenNameCOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
.	TokenNameDOT	
DIV	TokenNameIdentifier	 DIV
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
MOD	TokenNameIdentifier	 MOD
:	TokenNameCOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
.	TokenNameDOT	
REM	TokenNameIdentifier	 REM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
ErrorMsg	TokenNameIdentifier	 Error Msg
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
ILLEGAL_BINARY_OP_ERR	TokenNameIdentifier	 ILLEGAL  BINARY  OP  ERR
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
}	TokenNameRBRACE	
