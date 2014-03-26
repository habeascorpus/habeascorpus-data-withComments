/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ObjectType.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ObjectType.java 468649 2006-10-28 07:00:55Z minchau $ 
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
BranchHandle	TokenNameIdentifier	 Branch Handle
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
IFNULL	TokenNameIdentifier	 IFNULL
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
INVOKEVIRTUAL	TokenNameIdentifier	 INVOKEVIRTUAL
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
/** * @author Todd Miller * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Todd Miller @author Santiago Pericas-Geertsen 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ObjectType	TokenNameIdentifier	 Object Type
extends	TokenNameextends	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
_javaClassName	TokenNameIdentifier	 java Class Name
=	TokenNameEQUAL	
"java.lang.Object"	TokenNameStringLiteral	java.lang.Object
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Class	TokenNameIdentifier	 Class
_clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
/** * Used to represent a Java Class type such is required to support * non-static java functions. * @param javaClassName name of the class such as 'com.foo.Processor' */	TokenNameCOMMENT_JAVADOC	 Used to represent a Java Class type such is required to support non-static java functions. @param javaClassName name of the class such as 'com.foo.Processor' 
protected	TokenNameprotected	
ObjectType	TokenNameIdentifier	 Object Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaClassName	TokenNameIdentifier	 java Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_javaClassName	TokenNameIdentifier	 java Class Name
=	TokenNameEQUAL	
javaClassName	TokenNameIdentifier	 java Class Name
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
_clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findProviderClass	TokenNameIdentifier	 find Provider Class
(	TokenNameLPAREN	
javaClassName	TokenNameIdentifier	 java Class Name
,	TokenNameCOMMA	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
findClassLoader	TokenNameIdentifier	 find Class Loader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
ObjectType	TokenNameIdentifier	 Object Type
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
_javaClassName	TokenNameIdentifier	 java Class Name
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Must return the same value for all ObjectType instances. This is * needed in CastExpr to ensure the mapping table is used correctly. */	TokenNameCOMMENT_JAVADOC	 Must return the same value for all ObjectType instances. This is needed in CastExpr to ensure the mapping table is used correctly. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
ObjectType	TokenNameIdentifier	 Object Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getJavaClassName	TokenNameIdentifier	 get Java Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_javaClassName	TokenNameIdentifier	 java Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
getJavaClass	TokenNameIdentifier	 get Java Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_clazz	TokenNameIdentifier	 clazz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_javaClassName	TokenNameIdentifier	 java Class Name
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
final	TokenNamefinal	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
"L"	TokenNameStringLiteral	L
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_javaClassName	TokenNameIdentifier	 java Class Name
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
getJCRefType	TokenNameIdentifier	 get JC Ref Type
(	TokenNameLPAREN	
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
/** * Expects an integer on the stack and pushes its string value by calling * <code>Integer.toString(int i)</code>. * * @see org.apache.xalan.xsltc.compiler.util.Type#translateTo */	TokenNameCOMMENT_JAVADOC	 Expects an integer on the stack and pushes its string value by calling <code>Integer.toString(int i)</code>. * @see org.apache.xalan.xsltc.compiler.util.Type#translateTo 
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
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
DUP	TokenNameIdentifier	 DUP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BranchHandle	TokenNameIdentifier	 Branch Handle
ifNull	TokenNameIdentifier	 if Null
=	TokenNameEQUAL	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
IFNULL	TokenNameIdentifier	 IFNULL
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEVIRTUAL	TokenNameIdentifier	 INVOKEVIRTUAL
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addMethodref	TokenNameIdentifier	 add Methodref
(	TokenNameLPAREN	
_javaClassName	TokenNameIdentifier	 java Class Name
,	TokenNameCOMMA	
"toString"	TokenNameStringLiteral	toString
,	TokenNameCOMMA	
"()"	TokenNameStringLiteral	()
+	TokenNamePLUS	
STRING_SIG	TokenNameIdentifier	 STRING  SIG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
BranchHandle	TokenNameIdentifier	 Branch Handle
gotobh	TokenNameIdentifier	 gotobh
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
ifNull	TokenNameIdentifier	 if Null
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
POP	TokenNameIdentifier	 POP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
PUSH	TokenNameIdentifier	 PUSH
(	TokenNameLPAREN	
cpg	TokenNameIdentifier	 cpg
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gotobh	TokenNameIdentifier	 gotobh
.	TokenNameDOT	
setTarget	TokenNameIdentifier	 set Target
(	TokenNameLPAREN	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NOP	TokenNameIdentifier	 NOP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Translates an object of this type to the external (Java) type denoted * by <code>clazz</code>. This method is used to translate parameters * when external functions are called. */	TokenNameCOMMENT_JAVADOC	 Translates an object of this type to the external (Java) type denoted by <code>clazz</code>. This method is used to translate parameters when external functions are called. 
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
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
isAssignableFrom	TokenNameIdentifier	 is Assignable From
(	TokenNameLPAREN	
_clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NOP	TokenNameIdentifier	 NOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
/** * Translates an external Java type into an Object type */	TokenNameCOMMENT_JAVADOC	 Translates an external Java type into an Object type 
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
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getInstructionList	TokenNameIdentifier	 get Instruction List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
NOP	TokenNameIdentifier	 NOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
LOAD	TokenNameIdentifier	 LOAD
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ALOAD	TokenNameIdentifier	 ALOAD
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
STORE	TokenNameIdentifier	 STORE
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ASTORE	TokenNameIdentifier	 ASTORE
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
