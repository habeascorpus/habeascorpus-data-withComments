/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: UnresolvedRef.java 476471 2006-11-18 08:36:27Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: UnresolvedRef.java 476471 2006-11-18 08:36:27Z minchau $ 
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
/** * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen 
final	TokenNamefinal	
class	TokenNameclass	
UnresolvedRef	TokenNameIdentifier	 Unresolved Ref
extends	TokenNameextends	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
{	TokenNameLBRACE	
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
_variableName	TokenNameIdentifier	 variable Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
_ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UnresolvedRef	TokenNameIdentifier	 Unresolved Ref
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_variableName	TokenNameIdentifier	 variable Name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
QName	TokenNameIdentifier	 Q Name
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_variableName	TokenNameIdentifier	 variable Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ErrorMsg	TokenNameIdentifier	 Error Msg
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
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
VARIABLE_UNDEF_ERR	TokenNameIdentifier	 VARIABLE  UNDEF  ERR
,	TokenNameCOMMA	
_variableName	TokenNameIdentifier	 variable Name
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
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
SymbolTable	TokenNameIdentifier	 Symbol Table
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// At this point the AST is already built and we should be able to 	TokenNameCOMMENT_LINE	At this point the AST is already built and we should be able to 
// find any declared global variable or parameter 	TokenNameCOMMENT_LINE	find any declared global variable or parameter 
VariableBase	TokenNameIdentifier	 Variable Base
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
lookupVariable	TokenNameIdentifier	 lookup Variable
(	TokenNameLPAREN	
_variableName	TokenNameIdentifier	 variable Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
VariableBase	TokenNameIdentifier	 Variable Base
)	TokenNameRPAREN	
stable	TokenNameIdentifier	 stable
.	TokenNameDOT	
lookupName	TokenNameIdentifier	 lookup Name
(	TokenNameLPAREN	
_variableName	TokenNameIdentifier	 variable Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If in a top-level element, create dependency to the referenced var 	TokenNameCOMMENT_LINE	If in a top-level element, create dependency to the referenced var 
_variable	TokenNameIdentifier	 variable
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
addParentDependency	TokenNameIdentifier	 add Parent Dependency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
instanceof	TokenNameinstanceof	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
VariableRef	TokenNameIdentifier	 Variable Ref
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
instanceof	TokenNameinstanceof	
Param	TokenNameIdentifier	 Param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParameterRef	TokenNameIdentifier	 Parameter Ref
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Param	TokenNameIdentifier	 Param
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
_ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
_variableName	TokenNameIdentifier	 variable Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorMsg	TokenNameIdentifier	 Error Msg
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
new	TokenNamenew	
ErrorMsg	TokenNameIdentifier	 Error Msg
(	TokenNameLPAREN	
ErrorMsg	TokenNameIdentifier	 Error Msg
.	TokenNameDOT	
CIRCULAR_VARIABLE_ERR	TokenNameIdentifier	 CIRCULAR  VARIABLE  ERR
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
_ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
getParser	TokenNameIdentifier	 get Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TypeCheckError	TokenNameIdentifier	 Type Check Error
(	TokenNameLPAREN	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
_ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
_ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
classGen	TokenNameIdentifier	 class Gen
,	TokenNameCOMMA	
methodGen	TokenNameIdentifier	 method Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
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
"unresolved-ref()"	TokenNameStringLiteral	unresolved-ref()
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
