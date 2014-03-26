/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: VariableRef.java 528589 2007-04-13 18:50:56Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: VariableRef.java 528589 2007-04-13 18:50:56Z zongaro $ 
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
CHECKCAST	TokenNameIdentifier	 CHECKCAST
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
GETFIELD	TokenNameIdentifier	 GETFIELD
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
NodeSetType	TokenNameIdentifier	 Node Set Type
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen * @author Erwin Bolwidt <ejb@klomp.org> */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen @author Erwin Bolwidt <ejb@klomp.org> 
final	TokenNamefinal	
class	TokenNameclass	
VariableRef	TokenNameIdentifier	 Variable Ref
extends	TokenNameextends	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
{	TokenNameLBRACE	
public	TokenNamepublic	
VariableRef	TokenNameIdentifier	 Variable Ref
(	TokenNameLPAREN	
Variable	TokenNameIdentifier	 Variable
variable	TokenNameIdentifier	 variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
variable	TokenNameIdentifier	 variable
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
// Fall-through for variables that are implemented as methods 	TokenNameCOMMENT_LINE	Fall-through for variables that are implemented as methods 
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
.	TokenNameDOT	
implementedAsMethod	TokenNameIdentifier	 implemented As Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getEscapedName	TokenNameIdentifier	 get Escaped Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
signature	TokenNameIdentifier	 signature
=	TokenNameEQUAL	
_type	TokenNameIdentifier	 type
.	TokenNameDOT	
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
isLocal	TokenNameIdentifier	 is Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Closure	TokenNameIdentifier	 Closure
variableClosure	TokenNameIdentifier	 variable Closure
=	TokenNameEQUAL	
_closure	TokenNameIdentifier	 closure
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
variableClosure	TokenNameIdentifier	 variable Closure
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
variableClosure	TokenNameIdentifier	 variable Closure
.	TokenNameDOT	
inInnerClass	TokenNameIdentifier	 in Inner Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
variableClosure	TokenNameIdentifier	 variable Closure
=	TokenNameEQUAL	
variableClosure	TokenNameIdentifier	 variable Closure
.	TokenNameDOT	
getParentClosure	TokenNameIdentifier	 get Parent Closure
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
variableClosure	TokenNameIdentifier	 variable Closure
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ALOAD_0	TokenNameIdentifier	 ALOAD 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
GETFIELD	TokenNameIdentifier	 GETFIELD
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addFieldref	TokenNameIdentifier	 add Fieldref
(	TokenNameLPAREN	
variableClosure	TokenNameIdentifier	 variable Closure
.	TokenNameDOT	
getInnerClassName	TokenNameIdentifier	 get Inner Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
signature	TokenNameIdentifier	 signature
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
loadInstruction	TokenNameIdentifier	 load Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
loadInstruction	TokenNameIdentifier	 load Instruction
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
loadTranslet	TokenNameIdentifier	 load Translet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
CHECKCAST	TokenNameIdentifier	 CHECKCAST
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addClass	TokenNameIdentifier	 add Class
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
GETFIELD	TokenNameIdentifier	 GETFIELD
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addFieldref	TokenNameIdentifier	 add Fieldref
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
signature	TokenNameIdentifier	 signature
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
NodeSetType	TokenNameIdentifier	 Node Set Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The method cloneIterator() also does resetting 	TokenNameCOMMENT_LINE	The method cloneIterator() also does resetting 
final	TokenNamefinal	
int	TokenNameint	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addInterfaceMethodref	TokenNameIdentifier	 add Interface Methodref
(	TokenNameLPAREN	
NODE_ITERATOR	TokenNameIdentifier	 NODE  ITERATOR
,	TokenNameCOMMA	
"cloneIterator"	TokenNameStringLiteral	cloneIterator
,	TokenNameCOMMA	
"()"	TokenNameStringLiteral	()
+	TokenNamePLUS	
NODE_ITERATOR_SIG	TokenNameIdentifier	 NODE  ITERATOR  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEINTERFACE	TokenNameIdentifier	 INVOKEINTERFACE
(	TokenNameLPAREN	
clone	TokenNameIdentifier	 clone
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
