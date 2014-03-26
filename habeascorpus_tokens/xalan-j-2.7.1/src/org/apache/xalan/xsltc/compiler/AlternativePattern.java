/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AlternativePattern.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AlternativePattern.java 468650 2006-10-28 07:03:30Z minchau $ 
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
AlternativePattern	TokenNameIdentifier	 Alternative Pattern
extends	TokenNameextends	
Pattern	TokenNameIdentifier	 Pattern
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Pattern	TokenNameIdentifier	 Pattern
_left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Pattern	TokenNameIdentifier	 Pattern
_right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
/** * Construct an alternative pattern. The method <code>setParent</code> * should not be called in this case. */	TokenNameCOMMENT_JAVADOC	 Construct an alternative pattern. The method <code>setParent</code> should not be called in this case. 
public	TokenNamepublic	
AlternativePattern	TokenNameIdentifier	 Alternative Pattern
(	TokenNameLPAREN	
Pattern	TokenNameIdentifier	 Pattern
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
Pattern	TokenNameIdentifier	 Pattern
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
_right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
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
Pattern	TokenNameIdentifier	 Pattern
getLeft	TokenNameIdentifier	 get Left
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Pattern	TokenNameIdentifier	 Pattern
getRight	TokenNameIdentifier	 get Right
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The type of an '|' is not really defined, hence null is returned. */	TokenNameCOMMENT_JAVADOC	 The type of an '|' is not really defined, hence null is returned. 
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
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
<	TokenNameLESS	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"alternative("	TokenNameStringLiteral	alternative(
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
final	TokenNamefinal	
InstructionHandle	TokenNameIdentifier	 Instruction Handle
gotot	TokenNameIdentifier	 gotot
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
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadContextNode	TokenNameIdentifier	 load Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
_trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
backPatch	TokenNameIdentifier	 back Patch
(	TokenNameLPAREN	
gotot	TokenNameIdentifier	 gotot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_left	TokenNameIdentifier	 left
.	TokenNameDOT	
_falseList	TokenNameIdentifier	 false List
.	TokenNameDOT	
backPatch	TokenNameIdentifier	 back Patch
(	TokenNameLPAREN	
gotot	TokenNameIdentifier	 gotot
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_right	TokenNameIdentifier	 right
.	TokenNameDOT	
_trueList	TokenNameIdentifier	 true List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gotot	TokenNameIdentifier	 gotot
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
