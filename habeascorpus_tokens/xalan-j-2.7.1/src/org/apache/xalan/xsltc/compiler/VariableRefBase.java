/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: VariableRefBase.java 476471 2006-11-18 08:36:27Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: VariableRefBase.java 476471 2006-11-18 08:36:27Z minchau $ 
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
/** * @author Morten Jorgensen * @author Santiago Pericas-Geertsen */	TokenNameCOMMENT_JAVADOC	 @author Morten Jorgensen @author Santiago Pericas-Geertsen 
class	TokenNameclass	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
extends	TokenNameextends	
Expression	TokenNameIdentifier	 Expression
{	TokenNameLBRACE	
/** * A reference to the associated variable. */	TokenNameCOMMENT_JAVADOC	 A reference to the associated variable. 
protected	TokenNameprotected	
VariableBase	TokenNameIdentifier	 Variable Base
_variable	TokenNameIdentifier	 variable
;	TokenNameSEMICOLON	
/** * A reference to the enclosing expression/instruction for which a * closure is needed (Predicate, Number or Sort). */	TokenNameCOMMENT_JAVADOC	 A reference to the enclosing expression/instruction for which a closure is needed (Predicate, Number or Sort). 
protected	TokenNameprotected	
Closure	TokenNameIdentifier	 Closure
_closure	TokenNameIdentifier	 closure
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
(	TokenNameLPAREN	
VariableBase	TokenNameIdentifier	 Variable Base
variable	TokenNameIdentifier	 variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_variable	TokenNameIdentifier	 variable
=	TokenNameEQUAL	
variable	TokenNameIdentifier	 variable
;	TokenNameSEMICOLON	
variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
addReference	TokenNameIdentifier	 add Reference
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_variable	TokenNameIdentifier	 variable
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a reference to the associated variable */	TokenNameCOMMENT_JAVADOC	 Returns a reference to the associated variable 
public	TokenNamepublic	
VariableBase	TokenNameIdentifier	 Variable Base
getVariable	TokenNameIdentifier	 get Variable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_variable	TokenNameIdentifier	 variable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If this variable reference is in a top-level element like * another variable, param or key, add a dependency between * that top-level element and the referenced variable. For * example, * * <xsl:variable name="x" .../> * <xsl:variable name="y" select="$x + 1"/> * * and assuming this class represents "$x", add a reference * between variable y and variable x. */	TokenNameCOMMENT_JAVADOC	 If this variable reference is in a top-level element like another variable, param or key, add a dependency between that top-level element and the referenced variable. For example, * <xsl:variable name="x" .../> <xsl:variable name="y" select="$x + 1"/> * and assuming this class represents "$x", add a reference between variable y and variable x. 
public	TokenNamepublic	
void	TokenNamevoid	
addParentDependency	TokenNameIdentifier	 add Parent Dependency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
TopLevelElement	TokenNameIdentifier	 Top Level Element
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TopLevelElement	TokenNameIdentifier	 Top Level Element
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TopLevelElement	TokenNameIdentifier	 Top Level Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
VariableBase	TokenNameIdentifier	 Variable Base
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
_variable	TokenNameIdentifier	 variable
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
_ignore	TokenNameIdentifier	 ignore
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
instanceof	TokenNameinstanceof	
Variable	TokenNameIdentifier	 Variable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getSymbolTable	TokenNameIdentifier	 get Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupVariable	TokenNameIdentifier	 lookup Variable
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
_name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
instanceof	TokenNameinstanceof	
Param	TokenNameIdentifier	 Param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
var	TokenNameIdentifier	 var
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getSymbolTable	TokenNameIdentifier	 get Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
lookupParam	TokenNameIdentifier	 lookup Param
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
_name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
addDependency	TokenNameIdentifier	 add Dependency
(	TokenNameLPAREN	
var	TokenNameIdentifier	 var
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Two variable references are deemed equal if they refer to the * same variable. */	TokenNameCOMMENT_JAVADOC	 Two variable references are deemed equal if they refer to the same variable. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
VariableRefBase	TokenNameIdentifier	 Variable Ref Base
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
.	TokenNameDOT	
_variable	TokenNameIdentifier	 variable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassCastException	TokenNameIdentifier	 Class Cast Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a string representation of this variable reference on the * format 'variable-ref(<var-name>)'. * @return Variable reference description */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this variable reference on the format 'variable-ref(<var-name>)'. @return Variable reference description 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"variable-ref("	TokenNameStringLiteral	variable-ref(
+	TokenNamePLUS	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
'/'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
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
// Returned cached type if available 	TokenNameCOMMENT_LINE	Returned cached type if available 
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
// Find nearest closure to add a variable reference 	TokenNameCOMMENT_LINE	Find nearest closure to add a variable reference 
if	TokenNameif	
(	TokenNameLPAREN	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
isLocal	TokenNameIdentifier	 is Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SyntaxTreeNode	TokenNameIdentifier	 Syntax Tree Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
Closure	TokenNameIdentifier	 Closure
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_closure	TokenNameIdentifier	 closure
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Closure	TokenNameIdentifier	 Closure
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
TopLevelElement	TokenNameIdentifier	 Top Level Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// way up in the tree 	TokenNameCOMMENT_LINE	way up in the tree 
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_closure	TokenNameIdentifier	 closure
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_closure	TokenNameIdentifier	 closure
.	TokenNameDOT	
addVariable	TokenNameIdentifier	 add Variable
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Attempt to get the cached variable type 	TokenNameCOMMENT_LINE	Attempt to get the cached variable type 
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If that does not work we must force a type-check (this is normally 	TokenNameCOMMENT_LINE	If that does not work we must force a type-check (this is normally 
// only needed for globals in included/imported stylesheets 	TokenNameCOMMENT_LINE	only needed for globals in included/imported stylesheets 
if	TokenNameif	
(	TokenNameLPAREN	
_type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
typeCheck	TokenNameIdentifier	 type Check
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
_variable	TokenNameIdentifier	 variable
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If in a top-level element, create dependency to the referenced var 	TokenNameCOMMENT_LINE	If in a top-level element, create dependency to the referenced var 
addParentDependency	TokenNameIdentifier	 add Parent Dependency
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Return the type of the referenced variable 	TokenNameCOMMENT_LINE	Return the type of the referenced variable 
return	TokenNamereturn	
_type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
