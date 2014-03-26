/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: RtMethodGenerator.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: RtMethodGenerator.java 468649 2006-10-28 07:00:55Z minchau $ 
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
/** * This class is used for result trees implemented as methods. These * methods take a reference to the DOM and to the handler only. * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 This class is used for result trees implemented as methods. These methods take a reference to the DOM and to the handler only. @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
RtMethodGenerator	TokenNameIdentifier	 Rt Method Generator
extends	TokenNameextends	
MethodGenerator	TokenNameIdentifier	 Method Generator
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HANDLER_INDEX	TokenNameIdentifier	 HANDLER  INDEX
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
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
RtMethodGenerator	TokenNameIdentifier	 Rt Method Generator
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
int	TokenNameint	
getIteratorIndex	TokenNameIdentifier	 get Iterator Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
INVALID_INDEX	TokenNameIdentifier	 INVALID  INDEX
;	TokenNameSEMICOLON	
// not available 	TokenNameCOMMENT_LINE	not available 
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
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
final	TokenNamefinal	
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
