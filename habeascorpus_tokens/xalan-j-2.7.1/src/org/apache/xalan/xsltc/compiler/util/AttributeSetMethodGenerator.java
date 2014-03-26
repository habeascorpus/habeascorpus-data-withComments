/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: AttributeSetMethodGenerator.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: AttributeSetMethodGenerator.java 468649 2006-10-28 07:00:55Z minchau $ 
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
ClassGen	TokenNameIdentifier	 Class Gen
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
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
AttributeSetMethodGenerator	TokenNameIdentifier	 Attribute Set Method Generator
extends	TokenNameextends	
MethodGenerator	TokenNameIdentifier	 Method Generator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOM_INDEX	TokenNameIdentifier	 DOM  INDEX
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HANDLER_INDEX	TokenNameIdentifier	 HANDLER  INDEX
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argTypes	TokenNameIdentifier	 arg Types
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
argNames	TokenNameIdentifier	 arg Names
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
argTypes	TokenNameIdentifier	 arg Types
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getJCRefType	TokenNameIdentifier	 get JC Ref Type
(	TokenNameLPAREN	
DOM_INTF_SIG	TokenNameIdentifier	 DOM  INTF  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argNames	TokenNameIdentifier	 arg Names
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
DOM_PNAME	TokenNameIdentifier	 DOM  PNAME
;	TokenNameSEMICOLON	
argTypes	TokenNameIdentifier	 arg Types
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getJCRefType	TokenNameIdentifier	 get JC Ref Type
(	TokenNameLPAREN	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argNames	TokenNameIdentifier	 arg Names
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ITERATOR_PNAME	TokenNameIdentifier	 ITERATOR  PNAME
;	TokenNameSEMICOLON	
argTypes	TokenNameIdentifier	 arg Types
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getJCRefType	TokenNameIdentifier	 get JC Ref Type
(	TokenNameLPAREN	
TRANSLET_OUTPUT_SIG	TokenNameIdentifier	 TRANSLET  OUTPUT  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
argNames	TokenNameIdentifier	 arg Names
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
TRANSLET_OUTPUT_PNAME	TokenNameIdentifier	 TRANSLET  OUTPUT  PNAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_aloadDom	TokenNameIdentifier	 aload Dom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_astoreDom	TokenNameIdentifier	 astore Dom
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
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_astoreHandler	TokenNameIdentifier	 astore Handler
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Instruction	TokenNameIdentifier	 Instruction
_aloadHandler	TokenNameIdentifier	 aload Handler
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AttributeSetMethodGenerator	TokenNameIdentifier	 Attribute Set Method Generator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
ClassGen	TokenNameIdentifier	 Class Gen
classGen	TokenNameIdentifier	 class Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ACC_PRIVATE	TokenNameIdentifier	 ACC  PRIVATE
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
VOID	TokenNameIdentifier	 VOID
,	TokenNameCOMMA	
argTypes	TokenNameIdentifier	 arg Types
,	TokenNameCOMMA	
argNames	TokenNameIdentifier	 arg Names
,	TokenNameCOMMA	
methodName	TokenNameIdentifier	 method Name
,	TokenNameCOMMA	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
InstructionList	TokenNameIdentifier	 Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_aloadDom	TokenNameIdentifier	 aload Dom
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
DOM_INDEX	TokenNameIdentifier	 DOM  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_astoreDom	TokenNameIdentifier	 astore Dom
=	TokenNameEQUAL	
new	TokenNamenew	
ASTORE	TokenNameIdentifier	 ASTORE
(	TokenNameLPAREN	
DOM_INDEX	TokenNameIdentifier	 DOM  INDEX
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
_astoreHandler	TokenNameIdentifier	 astore Handler
=	TokenNameEQUAL	
new	TokenNamenew	
ASTORE	TokenNameIdentifier	 ASTORE
(	TokenNameLPAREN	
HANDLER_INDEX	TokenNameIdentifier	 HANDLER  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_aloadHandler	TokenNameIdentifier	 aload Handler
=	TokenNameEQUAL	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
HANDLER_INDEX	TokenNameIdentifier	 HANDLER  INDEX
)	TokenNameRPAREN	
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
getIteratorIndex	TokenNameIdentifier	 get Iterator Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ITERATOR_INDEX	TokenNameIdentifier	 ITERATOR  INDEX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
storeHandler	TokenNameIdentifier	 store Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_astoreHandler	TokenNameIdentifier	 astore Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
loadHandler	TokenNameIdentifier	 load Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_aloadHandler	TokenNameIdentifier	 aload Handler
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
return	TokenNamereturn	
INVALID_INDEX	TokenNameIdentifier	 INVALID  INDEX
;	TokenNameSEMICOLON	
// not available 	TokenNameCOMMENT_LINE	not available 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
