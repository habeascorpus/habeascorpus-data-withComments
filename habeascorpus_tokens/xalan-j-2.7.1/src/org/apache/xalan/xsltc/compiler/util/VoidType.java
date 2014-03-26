/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: VoidType.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: VoidType.java 468649 2006-10-28 07:00:55Z minchau $ 
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
PUSH	TokenNameIdentifier	 PUSH
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
Constants	TokenNameIdentifier	 Constants
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
VoidType	TokenNameIdentifier	 Void Type
extends	TokenNameextends	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
protected	TokenNameprotected	
VoidType	TokenNameIdentifier	 Void Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"void"	TokenNameStringLiteral	void
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
identicalTo	TokenNameIdentifier	 identical To
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"V"	TokenNameStringLiteral	V
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
bcel	TokenNameIdentifier	 bcel
.	TokenNameDOT	
generic	TokenNameIdentifier	 generic
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
toJCType	TokenNameIdentifier	 to JC Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// should never be called 	TokenNameCOMMENT_LINE	should never be called 
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
POP	TokenNameIdentifier	 POP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
NOP	TokenNameIdentifier	 NOP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Translates a void into an object of internal type <code>type</code>. * This translation is needed when calling external functions * that return void. * * @see org.apache.xalan.xsltc.compiler.util.Type#translateTo */	TokenNameCOMMENT_JAVADOC	 Translates a void into an object of internal type <code>type</code>. This translation is needed when calling external functions that return void. * @see org.apache.xalan.xsltc.compiler.util.Type#translateTo 
public	TokenNamepublic	
void	TokenNamevoid	
translateTo	TokenNameIdentifier	 translate To
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
translateTo	TokenNameIdentifier	 translate To
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
,	TokenNameCOMMA	
(	TokenNameLPAREN	
StringType	TokenNameIdentifier	 String Type
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
,	TokenNameCOMMA	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Translates a void into a string by pushing the empty string ''. * * @see org.apache.xalan.xsltc.compiler.util.Type#translateTo */	TokenNameCOMMENT_JAVADOC	 Translates a void into a string by pushing the empty string ''. * @see org.apache.xalan.xsltc.compiler.util.Type#translateTo 
public	TokenNamepublic	
void	TokenNamevoid	
translateTo	TokenNameIdentifier	 translate To
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
,	TokenNameCOMMA	
StringType	TokenNameIdentifier	 String Type
type	TokenNameIdentifier	 type
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
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUSH	TokenNameIdentifier	 PUSH
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getConstantPool	TokenNameIdentifier	 get Constant Pool
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Translates an external (primitive) Java type into a void. * Only an external "void" can be converted to this class. */	TokenNameCOMMENT_JAVADOC	 Translates an external (primitive) Java type into a void. Only an external "void" can be converted to this class. 
public	TokenNamepublic	
void	TokenNamevoid	
translateFrom	TokenNameIdentifier	 translate From
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
,	TokenNameCOMMA	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"void"	TokenNameStringLiteral	void
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
DATA_CONVERSION_ERR	TokenNameIdentifier	 DATA  CONVERSION  ERR
,	TokenNameCOMMA	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
