/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Type.java 468649 2006-10-28 07:00:55Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Type.java 468649 2006-10-28 07:00:55Z minchau $ 
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
BranchInstruction	TokenNameIdentifier	 Branch Instruction
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Constants	TokenNameIdentifier	 Constants
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
FlowList	TokenNameIdentifier	 Flow List
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
NodeTest	TokenNameIdentifier	 Node Test
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
Type	TokenNameIdentifier	 Type
implements	TokenNameimplements	
Constants	TokenNameIdentifier	 Constants
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Int	TokenNameIdentifier	 Int
=	TokenNameEQUAL	
new	TokenNamenew	
IntType	TokenNameIdentifier	 Int Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Real	TokenNameIdentifier	 Real
=	TokenNameEQUAL	
new	TokenNamenew	
RealType	TokenNameIdentifier	 Real Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Boolean	TokenNameIdentifier	 Boolean
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanType	TokenNameIdentifier	 Boolean Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
NodeSet	TokenNameIdentifier	 Node Set
=	TokenNameEQUAL	
new	TokenNamenew	
NodeSetType	TokenNameIdentifier	 Node Set Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
String	TokenNameIdentifier	 String
=	TokenNameEQUAL	
new	TokenNamenew	
StringType	TokenNameIdentifier	 String Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
ResultTree	TokenNameIdentifier	 Result Tree
=	TokenNameEQUAL	
new	TokenNamenew	
ResultTreeType	TokenNameIdentifier	 Result Tree Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Reference	TokenNameIdentifier	 Reference
=	TokenNameEQUAL	
new	TokenNamenew	
ReferenceType	TokenNameIdentifier	 Reference Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Void	TokenNameIdentifier	 Void
=	TokenNameEQUAL	
new	TokenNamenew	
VoidType	TokenNameIdentifier	 Void Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Object	TokenNameIdentifier	 Object
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectType	TokenNameIdentifier	 Object Type
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Node	TokenNameIdentifier	 Node
=	TokenNameEQUAL	
new	TokenNamenew	
NodeType	TokenNameIdentifier	 Node Type
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
ANODE	TokenNameIdentifier	 ANODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Root	TokenNameIdentifier	 Root
=	TokenNameEQUAL	
new	TokenNamenew	
NodeType	TokenNameIdentifier	 Node Type
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
ROOT	TokenNameIdentifier	 ROOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Element	TokenNameIdentifier	 Element
=	TokenNameEQUAL	
new	TokenNamenew	
NodeType	TokenNameIdentifier	 Node Type
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
ELEMENT	TokenNameIdentifier	 ELEMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Attribute	TokenNameIdentifier	 Attribute
=	TokenNameEQUAL	
new	TokenNamenew	
NodeType	TokenNameIdentifier	 Node Type
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Text	TokenNameIdentifier	 Text
=	TokenNameEQUAL	
new	TokenNamenew	
NodeType	TokenNameIdentifier	 Node Type
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
TEXT	TokenNameIdentifier	 TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Comment	TokenNameIdentifier	 Comment
=	TokenNameEQUAL	
new	TokenNamenew	
NodeType	TokenNameIdentifier	 Node Type
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
COMMENT	TokenNameIdentifier	 COMMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Type	TokenNameIdentifier	 Type
Processing_Instruction	TokenNameIdentifier	 Processing  Instruction
=	TokenNameEQUAL	
new	TokenNamenew	
NodeType	TokenNameIdentifier	 Node Type
(	TokenNameLPAREN	
NodeTest	TokenNameIdentifier	 Node Test
.	TokenNameDOT	
PI	TokenNameIdentifier	 PI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Factory method to instantiate object types. Returns a pre-defined * instance for "java.lang.Object" and "java.lang.String". */	TokenNameCOMMENT_JAVADOC	 Factory method to instantiate object types. Returns a pre-defined instance for "java.lang.Object" and "java.lang.String". 
public	TokenNamepublic	
static	TokenNamestatic	
Type	TokenNameIdentifier	 Type
newObjectType	TokenNameIdentifier	 new Object Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
javaClassName	TokenNameIdentifier	 java Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
javaClassName	TokenNameIdentifier	 java Class Name
==	TokenNameEQUAL_EQUAL	
"java.lang.Object"	TokenNameStringLiteral	java.lang.Object
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
javaClassName	TokenNameIdentifier	 java Class Name
==	TokenNameEQUAL_EQUAL	
"java.lang.String"	TokenNameStringLiteral	java.lang.String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
String	TokenNameIdentifier	 String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ObjectType	TokenNameIdentifier	 Object Type
(	TokenNameLPAREN	
javaClassName	TokenNameIdentifier	 java Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Factory method to instantiate object types. Returns a pre-defined * instance for java.lang.Object.class and java.lang.String.class. */	TokenNameCOMMENT_JAVADOC	 Factory method to instantiate object types. Returns a pre-defined instance for java.lang.Object.class and java.lang.String.class. 
public	TokenNamepublic	
static	TokenNamestatic	
Type	TokenNameIdentifier	 Type
newObjectType	TokenNameIdentifier	 new Object Type
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Object	TokenNameIdentifier	 Object
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
==	TokenNameEQUAL_EQUAL	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
String	TokenNameIdentifier	 String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ObjectType	TokenNameIdentifier	 Object Type
(	TokenNameLPAREN	
clazz	TokenNameIdentifier	 clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a string representation of this type. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this type. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if this and other are identical types. */	TokenNameCOMMENT_JAVADOC	 Returns true if this and other are identical types. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
identicalTo	TokenNameIdentifier	 identical To
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if this type is a numeric type. Redefined in NumberType. */	TokenNameCOMMENT_JAVADOC	 Returns true if this type is a numeric type. Redefined in NumberType. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNumber	TokenNameIdentifier	 is Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this type has no object representaion. Redefined in * ResultTreeType. */	TokenNameCOMMENT_JAVADOC	 Returns true if this type has no object representaion. Redefined in ResultTreeType. 
public	TokenNamepublic	
boolean	TokenNameboolean	
implementedAsMethod	TokenNameIdentifier	 implemented As Method
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this type is a simple type. Redefined in NumberType, * BooleanType and StringType. */	TokenNameCOMMENT_JAVADOC	 Returns true if this type is a simple type. Redefined in NumberType, BooleanType and StringType. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSimple	TokenNameIdentifier	 is Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * Returns the distance between two types. This measure is used to select * overloaded functions/operators. This method is typically redefined by * the subclasses. */	TokenNameCOMMENT_JAVADOC	 Returns the distance between two types. This measure is used to select overloaded functions/operators. This method is typically redefined by the subclasses. 
public	TokenNamepublic	
int	TokenNameint	
distanceTo	TokenNameIdentifier	 distance To
(	TokenNameLPAREN	
Type	TokenNameIdentifier	 Type
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the signature of an internal type's external representation. */	TokenNameCOMMENT_JAVADOC	 Returns the signature of an internal type's external representation. 
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
toSignature	TokenNameIdentifier	 to Signature
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Translates an object of this type to an object of type * <code>type</code>. * Expects an object of the former type and pushes an object of the latter. */	TokenNameCOMMENT_JAVADOC	 Translates an object of this type to an object of type <code>type</code>. Expects an object of the former type and pushes an object of the latter. 
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
/** * Translates object of this type to an object of type <code>type</code>. * Expects an object of the former type and pushes an object of the latter * if not boolean. If type <code>type</code> is boolean then a branchhandle * list (to be appended to the false list) is returned. */	TokenNameCOMMENT_JAVADOC	 Translates object of this type to an object of type <code>type</code>. Expects an object of the former type and pushes an object of the latter if not boolean. If type <code>type</code> is boolean then a branchhandle list (to be appended to the false list) is returned. 
public	TokenNamepublic	
FlowList	TokenNameIdentifier	 Flow List
translateToDesynthesized	TokenNameIdentifier	 translate To Desynthesized
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
FlowList	TokenNameIdentifier	 Flow List
fl	TokenNameIdentifier	 fl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fl	TokenNameIdentifier	 fl
=	TokenNameEQUAL	
translateToDesynthesized	TokenNameIdentifier	 translate To Desynthesized
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
,	TokenNameCOMMA	
(	TokenNameLPAREN	
BooleanType	TokenNameIdentifier	 Boolean Type
)	TokenNameRPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
translateTo	TokenNameIdentifier	 translate To
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fl	TokenNameIdentifier	 fl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Translates an object of this type to an non-synthesized boolean. It * does not push a 0 or a 1 but instead returns branchhandle list to be * appended to the false list. */	TokenNameCOMMENT_JAVADOC	 Translates an object of this type to an non-synthesized boolean. It does not push a 0 or a 1 but instead returns branchhandle list to be appended to the false list. 
public	TokenNamepublic	
FlowList	TokenNameIdentifier	 Flow List
translateToDesynthesized	TokenNameIdentifier	 translate To Desynthesized
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
,	TokenNameCOMMA	
BooleanType	TokenNameIdentifier	 Boolean Type
type	TokenNameIdentifier	 type
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
return	TokenNamereturn	
null	TokenNamenull	
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
/** * Translates an external (Java) type denoted by <code>clazz</code> to * an object of this type. This method is used to translate return values * when external functions are called. */	TokenNameCOMMENT_JAVADOC	 Translates an external (Java) type denoted by <code>clazz</code> to an object of this type. This method is used to translate return values when external functions are called. 
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
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
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
/** * Translates an object of this type to its boxed representation. */	TokenNameCOMMENT_JAVADOC	 Translates an object of this type to its boxed representation. 
public	TokenNamepublic	
void	TokenNamevoid	
translateBox	TokenNameIdentifier	 translate Box
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
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
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
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
/** * Translates an object of this type to its unboxed representation. */	TokenNameCOMMENT_JAVADOC	 Translates an object of this type to its unboxed representation. 
public	TokenNamepublic	
void	TokenNamevoid	
translateUnBox	TokenNameIdentifier	 translate Un Box
(	TokenNameLPAREN	
ClassGenerator	TokenNameIdentifier	 Class Generator
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
MethodGenerator	TokenNameIdentifier	 Method Generator
methodGen	TokenNameIdentifier	 method Gen
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
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
,	TokenNameCOMMA	
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
/** * Returns the class name of an internal type's external representation. */	TokenNameCOMMENT_JAVADOC	 Returns the class name of an internal type's external representation. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
EMPTYSTRING	TokenNameIdentifier	 EMPTYSTRING
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
ADD	TokenNameIdentifier	 ADD
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
SUB	TokenNameIdentifier	 SUB
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
MUL	TokenNameIdentifier	 MUL
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
DIV	TokenNameIdentifier	 DIV
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
REM	TokenNameIdentifier	 REM
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
NEG	TokenNameIdentifier	 NEG
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
LOAD	TokenNameIdentifier	 LOAD
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// should never be called 	TokenNameCOMMENT_LINE	should never be called 
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
POP	TokenNameIdentifier	 POP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
GT	TokenNameIdentifier	 GT
(	TokenNameLPAREN	
boolean	TokenNameboolean	
tozero	TokenNameIdentifier	 tozero
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// should never be called 	TokenNameCOMMENT_LINE	should never be called 
}	TokenNameRBRACE	
public	TokenNamepublic	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
GE	TokenNameIdentifier	 GE
(	TokenNameLPAREN	
boolean	TokenNameboolean	
tozero	TokenNameIdentifier	 tozero
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// should never be called 	TokenNameCOMMENT_LINE	should never be called 
}	TokenNameRBRACE	
public	TokenNamepublic	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
LT	TokenNameIdentifier	 LT
(	TokenNameLPAREN	
boolean	TokenNameboolean	
tozero	TokenNameIdentifier	 tozero
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// should never be called 	TokenNameCOMMENT_LINE	should never be called 
}	TokenNameRBRACE	
public	TokenNamepublic	
BranchInstruction	TokenNameIdentifier	 Branch Instruction
LE	TokenNameIdentifier	 LE
(	TokenNameLPAREN	
boolean	TokenNameboolean	
tozero	TokenNameIdentifier	 tozero
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// should never be called 	TokenNameCOMMENT_LINE	should never be called 
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
CMP	TokenNameIdentifier	 CMP
(	TokenNameLPAREN	
boolean	TokenNameboolean	
less	TokenNameIdentifier	 less
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// should never be called 	TokenNameCOMMENT_LINE	should never be called 
}	TokenNameRBRACE	
public	TokenNamepublic	
Instruction	TokenNameIdentifier	 Instruction
DUP	TokenNameIdentifier	 DUP
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DUP	TokenNameIdentifier	 DUP
;	TokenNameSEMICOLON	
// default 	TokenNameCOMMENT_LINE	default 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
