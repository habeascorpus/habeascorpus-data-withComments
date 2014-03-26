/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: NameCall.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: NameCall.java 468650 2006-10-28 07:03:30Z minchau $ 
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
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
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
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
final	TokenNamefinal	
class	TokenNameclass	
NameCall	TokenNameIdentifier	 Name Call
extends	TokenNameextends	
NameBase	TokenNameIdentifier	 Name Base
{	TokenNameLBRACE	
/** * Handles calls with no parameter (current node is implicit parameter). */	TokenNameCOMMENT_JAVADOC	 Handles calls with no parameter (current node is implicit parameter). 
public	TokenNamepublic	
NameCall	TokenNameIdentifier	 Name Call
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
fname	TokenNameIdentifier	 fname
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fname	TokenNameIdentifier	 fname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Handles calls with one parameter (either node or node-set). */	TokenNameCOMMENT_JAVADOC	 Handles calls with one parameter (either node or node-set). 
public	TokenNamepublic	
NameCall	TokenNameIdentifier	 Name Call
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
fname	TokenNameIdentifier	 fname
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fname	TokenNameIdentifier	 fname
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Translate code that leaves a node's QName (as a String) on the stack */	TokenNameCOMMENT_JAVADOC	 Translate code that leaves a node's QName (as a String) on the stack 
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
ConstantPoolGen	TokenNameIdentifier	 Constant Pool Gen
cpg	TokenNameIdentifier	 cpg
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
int	TokenNameint	
getName	TokenNameIdentifier	 get Name
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
DOM_INTF	TokenNameIdentifier	 DOM  INTF
,	TokenNameCOMMA	
GET_NODE_NAME	TokenNameIdentifier	 GET  NODE  NAME
,	TokenNameCOMMA	
GET_NODE_NAME_SIG	TokenNameIdentifier	 GET  NODE  NAME  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
getName	TokenNameIdentifier	 get Name
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
