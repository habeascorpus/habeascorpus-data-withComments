/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TestGenerator.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TestGenerator.java 468649 2006-10-28 07:00:55Z minchau $ 
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
.	TokenNameDOT	
util	TokenNameIdentifier	 util
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
ALOAD	TokenNameIdentifier	 ALOAD
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
ASTORE	TokenNameIdentifier	 ASTORE
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
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
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
ILOAD	TokenNameIdentifier	 ILOAD
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
ISTORE	TokenNameIdentifier	 ISTORE
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
Instruction	TokenNameIdentifier	 Instruction
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
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TestGenerator	TokenNameIdentifier	 Test Generator
extends	TokenNameextends	
MethodGenerator	TokenNameIdentifier	 Method Generator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
CONTEXT_NODE_INDEX	TokenNameIdentifier	 CONTEXT  NODE  INDEX
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
CURRENT_NODE_INDEX	TokenNameIdentifier	 CURRENT  NODE  INDEX
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Instruction	TokenNameIdentifier	 Instruction
_aloadDom	TokenNameIdentifier	 aload Dom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_iloadCurrent	TokenNameIdentifier	 iload Current
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_iloadContext	TokenNameIdentifier	 iload Context
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_istoreCurrent	TokenNameIdentifier	 istore Current
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_istoreContext	TokenNameIdentifier	 istore Context
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_astoreIterator	TokenNameIdentifier	 astore Iterator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_aloadIterator	TokenNameIdentifier	 aload Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TestGenerator	TokenNameIdentifier	 Test Generator
(	TokenNameLPAREN	
int	TokenNameint	
access_flags	TokenNameIdentifier	 access flags
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
return_type	TokenNameIdentifier	 return type
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arg_types	TokenNameIdentifier	 arg types
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arg_names	TokenNameIdentifier	 arg names
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
method_name	TokenNameIdentifier	 method name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
class_name	TokenNameIdentifier	 class name
,	TokenNameCOMMA	
InstructionList	TokenNameIdentifier	 Instruction List
il	TokenNameIdentifier	 il
,	TokenNameCOMMA	
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
access_flags	TokenNameIdentifier	 access flags
,	TokenNameCOMMA	
return_type	TokenNameIdentifier	 return type
,	TokenNameCOMMA	
arg_types	TokenNameIdentifier	 arg types
,	TokenNameCOMMA	
arg_names	TokenNameIdentifier	 arg names
,	TokenNameCOMMA	
method_name	TokenNameIdentifier	 method name
,	TokenNameCOMMA	
class_name	TokenNameIdentifier	 class name
,	TokenNameCOMMA	
il	TokenNameIdentifier	 il
,	TokenNameCOMMA	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_iloadCurrent	TokenNameIdentifier	 iload Current
=	TokenNameEQUAL	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
CURRENT_NODE_INDEX	TokenNameIdentifier	 CURRENT  NODE  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_istoreCurrent	TokenNameIdentifier	 istore Current
=	TokenNameEQUAL	
new	TokenNamenew	
ISTORE	TokenNameIdentifier	 ISTORE
(	TokenNameLPAREN	
CURRENT_NODE_INDEX	TokenNameIdentifier	 CURRENT  NODE  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_iloadContext	TokenNameIdentifier	 iload Context
=	TokenNameEQUAL	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
CONTEXT_NODE_INDEX	TokenNameIdentifier	 CONTEXT  NODE  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_istoreContext	TokenNameIdentifier	 istore Context
=	TokenNameEQUAL	
new	TokenNamenew	
ILOAD	TokenNameIdentifier	 ILOAD
(	TokenNameLPAREN	
CONTEXT_NODE_INDEX	TokenNameIdentifier	 CONTEXT  NODE  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_astoreIterator	TokenNameIdentifier	 astore Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
ASTORE	TokenNameIdentifier	 ASTORE
(	TokenNameLPAREN	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_aloadIterator	TokenNameIdentifier	 aload Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getHandlerIndex	TokenNameIdentifier	 get Handler Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INVALID_INDEX	TokenNameIdentifier	 INVALID  INDEX
;	TokenNameSEMICOLON	
// not available 	TokenNameCOMMENT_LINE	not available 
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getIteratorIndex	TokenNameIdentifier	 get Iterator Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
;	TokenNameSEMICOLON	
// not available 	TokenNameCOMMENT_LINE	not available 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDomIndex	TokenNameIdentifier	 set Dom Index
(	TokenNameLPAREN	
int	TokenNameint	
domIndex	TokenNameIdentifier	 dom Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_aloadDom	TokenNameIdentifier	 aload Dom
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
domIndex	TokenNameIdentifier	 dom Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadDOM	TokenNameIdentifier	 load DOM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_aloadDom	TokenNameIdentifier	 aload Dom
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadCurrentNode	TokenNameIdentifier	 load Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_iloadCurrent	TokenNameIdentifier	 iload Current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** by default context node is the same as current node. MK437 */	TokenNameCOMMENT_JAVADOC	 by default context node is the same as current node. MK437 
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadContextNode	TokenNameIdentifier	 load Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_iloadContext	TokenNameIdentifier	 iload Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeContextNode	TokenNameIdentifier	 store Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_istoreContext	TokenNameIdentifier	 istore Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeCurrentNode	TokenNameIdentifier	 store Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_istoreCurrent	TokenNameIdentifier	 istore Current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeIterator	TokenNameIdentifier	 store Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_astoreIterator	TokenNameIdentifier	 astore Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadIterator	TokenNameIdentifier	 load Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_aloadIterator	TokenNameIdentifier	 aload Iterator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getLocalIndex	TokenNameIdentifier	 get Local Index
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"current"	TokenNameStringLiteral	current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CURRENT_NODE_INDEX	TokenNameIdentifier	 CURRENT  NODE  INDEX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getLocalIndex	TokenNameIdentifier	 get Local Index
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
