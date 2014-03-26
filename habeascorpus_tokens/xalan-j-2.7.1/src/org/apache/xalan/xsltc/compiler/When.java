/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: When.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: When.java 468650 2006-10-28 07:03:30Z minchau $ 
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
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BooleanType	TokenNameIdentifier	 Boolean Type
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
Util	TokenNameIdentifier	 Util
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
final	TokenNamefinal	
class	TokenNameclass	
When	TokenNameIdentifier	 When
extends	TokenNameextends	
Instruction	TokenNameIdentifier	 Instruction
{	TokenNameLBRACE	
private	TokenNameprivate	
Expression	TokenNameIdentifier	 Expression
_test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
_ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
display	TokenNameIdentifier	 display
(	TokenNameLPAREN	
int	TokenNameint	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"When"	TokenNameStringLiteral	When
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
IndentIncrement	TokenNameIdentifier	 Indent Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"test "	TokenNameStringLiteral	test 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
_test	TokenNameIdentifier	 test
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
displayContents	TokenNameIdentifier	 display Contents
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
IndentIncrement	TokenNameIdentifier	 Indent Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Expression	TokenNameIdentifier	 Expression
getTest	TokenNameIdentifier	 get Test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_test	TokenNameIdentifier	 test
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
ignore	TokenNameIdentifier	 ignore
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
parseContents	TokenNameIdentifier	 parse Contents
(	TokenNameLPAREN	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parseExpression	TokenNameIdentifier	 parse Expression
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Ignore xsl:if when test is false (function-available() and 	TokenNameCOMMENT_LINE	Ignore xsl:if when test is false (function-available() and 
// element-available()) 	TokenNameCOMMENT_LINE	element-available()) 
Object	TokenNameIdentifier	 Object
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
_test	TokenNameIdentifier	 test
.	TokenNameDOT	
evaluateAtCompileTime	TokenNameIdentifier	 evaluate At Compile Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
result	TokenNameIdentifier	 result
instanceof	TokenNameinstanceof	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
!	TokenNameNOT	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
parseChildren	TokenNameIdentifier	 parse Children
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure required attribute(s) have been set 	TokenNameCOMMENT_LINE	Make sure required attribute(s) have been set 
if	TokenNameif	
(	TokenNameLPAREN	
_test	TokenNameIdentifier	 test
.	TokenNameDOT	
isDummy	TokenNameIdentifier	 is Dummy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
REQUIRED_ATTR_ERR	TokenNameIdentifier	 REQUIRED  ATTR  ERR
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Type-check this when element. The test should always be type checked, * while we do not bother with the contents if we know the test fails. * This is important in cases where the "test" expression tests for * the support of a non-available element, and the <xsl:when> body contains * this non-available element. */	TokenNameCOMMENT_JAVADOC	 Type-check this when element. The test should always be type checked, while we do not bother with the contents if we know the test fails. This is important in cases where the "test" expression tests for the support of a non-available element, and the <xsl:when> body contains this non-available element. 
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
// Type-check the test expression 	TokenNameCOMMENT_LINE	Type-check the test expression 
if	TokenNameif	
(	TokenNameLPAREN	
_test	TokenNameIdentifier	 test
.	TokenNameDOT	
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
BooleanType	TokenNameIdentifier	 Boolean Type
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
new	TokenNamenew	
CastExpr	TokenNameIdentifier	 Cast Expr
(	TokenNameLPAREN	
_test	TokenNameIdentifier	 test
,	TokenNameCOMMA	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Boolean	TokenNameIdentifier	 Boolean
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Type-check the contents (if necessary) 	TokenNameCOMMENT_LINE	Type-check the contents (if necessary) 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
_ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
typeCheckContents	TokenNameIdentifier	 type Check Contents
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Void	TokenNameIdentifier	 Void
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method should never be called. An Otherwise object will explicitly * translate the "test" expression and and contents of this element. */	TokenNameCOMMENT_JAVADOC	 This method should never be called. An Otherwise object will explicitly translate the "test" expression and and contents of this element. 
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
ErrorMsg	TokenNameIdentifier	 Error Msg
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
STRAY_WHEN_ERR	TokenNameIdentifier	 STRAY  WHEN  ERR
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
