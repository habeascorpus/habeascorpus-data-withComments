/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ApplyImports.java 469276 2006-10-30 21:09:47Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ApplyImports.java 469276 2006-10-30 21:09:47Z minchau $ 
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
final	TokenNamefinal	
class	TokenNameclass	
ApplyImports	TokenNameIdentifier	 Apply Imports
extends	TokenNameextends	
Instruction	TokenNameIdentifier	 Instruction
{	TokenNameLBRACE	
private	TokenNameprivate	
QName	TokenNameIdentifier	 Q Name
_modeName	TokenNameIdentifier	 mode Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_precedence	TokenNameIdentifier	 precedence
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
"ApplyTemplates"	TokenNameStringLiteral	ApplyTemplates
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
IndentIncrement	TokenNameIdentifier	 Indent Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_modeName	TokenNameIdentifier	 mode Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indent	TokenNameIdentifier	 indent
(	TokenNameLPAREN	
indent	TokenNameIdentifier	 indent
+	TokenNamePLUS	
IndentIncrement	TokenNameIdentifier	 Indent Increment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Util	TokenNameIdentifier	 Util
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"mode "	TokenNameStringLiteral	mode 
+	TokenNamePLUS	
_modeName	TokenNameIdentifier	 mode Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if this <xsl:apply-imports/> element has parameters */	TokenNameCOMMENT_JAVADOC	 Returns true if this <xsl:apply-imports/> element has parameters 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasWithParams	TokenNameIdentifier	 has With Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasContents	TokenNameIdentifier	 has Contents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determine the lowest import precedence for any stylesheet imported * or included by the stylesheet in which this <xsl:apply-imports/> * element occured. The templates that are imported by the stylesheet in * which this element occured will all have higher import precedence than * the integer returned by this method. */	TokenNameCOMMENT_JAVADOC	 Determine the lowest import precedence for any stylesheet imported or included by the stylesheet in which this <xsl:apply-imports/> element occured. The templates that are imported by the stylesheet in which this element occured will all have higher import precedence than the integer returned by this method. 
private	TokenNameprivate	
int	TokenNameint	
getMinPrecedence	TokenNameIdentifier	 get Min Precedence
(	TokenNameLPAREN	
int	TokenNameint	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Move to root of include tree 	TokenNameCOMMENT_LINE	Move to root of include tree 
Stylesheet	TokenNameIdentifier	 Stylesheet
includeRoot	TokenNameIdentifier	 include Root
=	TokenNameEQUAL	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
includeRoot	TokenNameIdentifier	 include Root
.	TokenNameDOT	
_includedFrom	TokenNameIdentifier	 included From
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
includeRoot	TokenNameIdentifier	 include Root
=	TokenNameEQUAL	
includeRoot	TokenNameIdentifier	 include Root
.	TokenNameDOT	
_includedFrom	TokenNameIdentifier	 included From
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
includeRoot	TokenNameIdentifier	 include Root
.	TokenNameDOT	
getMinimumDescendantPrecedence	TokenNameIdentifier	 get Minimum Descendant Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the attributes and contents of an <xsl:apply-imports/> element. */	TokenNameCOMMENT_JAVADOC	 Parse the attributes and contents of an <xsl:apply-imports/> element. 
public	TokenNamepublic	
void	TokenNamevoid	
parseContents	TokenNameIdentifier	 parse Contents
(	TokenNameLPAREN	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Indicate to the top-level stylesheet that all templates must be 	TokenNameCOMMENT_LINE	Indicate to the top-level stylesheet that all templates must be 
// compiled into separate methods. 	TokenNameCOMMENT_LINE	compiled into separate methods. 
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setTemplateInlining	TokenNameIdentifier	 set Template Inlining
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the mode we are currently in (might not be any) 	TokenNameCOMMENT_LINE	Get the mode we are currently in (might not be any) 
Template	TokenNameIdentifier	 Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_modeName	TokenNameIdentifier	 mode Name
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getModeName	TokenNameIdentifier	 get Mode Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_precedence	TokenNameIdentifier	 precedence
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getImportPrecedence	TokenNameIdentifier	 get Import Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parseChildren	TokenNameIdentifier	 parse Children
(	TokenNameLPAREN	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// with-params 	TokenNameCOMMENT_LINE	with-params 
}	TokenNameRBRACE	
/** * Type-check the attributes/contents of an <xsl:apply-imports/> element. */	TokenNameCOMMENT_JAVADOC	 Type-check the attributes/contents of an <xsl:apply-imports/> element. 
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
typeCheckContents	TokenNameIdentifier	 type Check Contents
(	TokenNameLPAREN	
stable	TokenNameIdentifier	 stable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// with-params 	TokenNameCOMMENT_LINE	with-params 
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Void	TokenNameIdentifier	 Void
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Translate call-template. A parameter frame is pushed only if * some template in the stylesheet uses parameters. */	TokenNameCOMMENT_JAVADOC	 Translate call-template. A parameter frame is pushed only if some template in the stylesheet uses parameters. 
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
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
getLocalIndex	TokenNameIdentifier	 get Local Index
(	TokenNameLPAREN	
"current"	TokenNameStringLiteral	current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Push the arguments that are passed to applyTemplates() 	TokenNameCOMMENT_LINE	Push the arguments that are passed to applyTemplates() 
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
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadDOM	TokenNameIdentifier	 load DOM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadIterator	TokenNameIdentifier	 load Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadHandler	TokenNameIdentifier	 load Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
methodGen	TokenNameIdentifier	 method Gen
.	TokenNameDOT	
loadCurrentNode	TokenNameIdentifier	 load Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Push a new parameter frame in case imported template might expect 	TokenNameCOMMENT_LINE	Push a new parameter frame in case imported template might expect 
// parameters. The apply-imports has nothing that it can pass. 	TokenNameCOMMENT_LINE	parameters. The apply-imports has nothing that it can pass. 
if	TokenNameif	
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
hasLocalParams	TokenNameIdentifier	 has Local Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
final	TokenNamefinal	
int	TokenNameint	
pushFrame	TokenNameIdentifier	 push Frame
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addMethodref	TokenNameIdentifier	 add Methodref
(	TokenNameLPAREN	
TRANSLET_CLASS	TokenNameIdentifier	 TRANSLET  CLASS
,	TokenNameCOMMA	
PUSH_PARAM_FRAME	TokenNameIdentifier	 PUSH  PARAM  FRAME
,	TokenNameCOMMA	
PUSH_PARAM_FRAME_SIG	TokenNameIdentifier	 PUSH  PARAM  FRAME  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEVIRTUAL	TokenNameIdentifier	 INVOKEVIRTUAL
(	TokenNameLPAREN	
pushFrame	TokenNameIdentifier	 push Frame
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the [min,max> precedence of all templates imported under the 	TokenNameCOMMENT_LINE	Get the [min,max> precedence of all templates imported under the 
// current stylesheet 	TokenNameCOMMENT_LINE	current stylesheet 
final	TokenNamefinal	
int	TokenNameint	
maxPrecedence	TokenNameIdentifier	 max Precedence
=	TokenNameEQUAL	
_precedence	TokenNameIdentifier	 precedence
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
minPrecedence	TokenNameIdentifier	 min Precedence
=	TokenNameEQUAL	
getMinPrecedence	TokenNameIdentifier	 get Min Precedence
(	TokenNameLPAREN	
maxPrecedence	TokenNameIdentifier	 max Precedence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Mode	TokenNameIdentifier	 Mode
mode	TokenNameIdentifier	 mode
=	TokenNameEQUAL	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
_modeName	TokenNameIdentifier	 mode Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get name of appropriate apply-templates function for this 	TokenNameCOMMENT_LINE	Get name of appropriate apply-templates function for this 
// xsl:apply-imports instruction 	TokenNameCOMMENT_LINE	xsl:apply-imports instruction 
String	TokenNameIdentifier	 String
functionName	TokenNameIdentifier	 function Name
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
.	TokenNameDOT	
functionName	TokenNameIdentifier	 function Name
(	TokenNameLPAREN	
minPrecedence	TokenNameIdentifier	 min Precedence
,	TokenNameCOMMA	
maxPrecedence	TokenNameIdentifier	 max Precedence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Construct the translet class-name and the signature of the method 	TokenNameCOMMENT_LINE	Construct the translet class-name and the signature of the method 
final	TokenNamefinal	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
signature	TokenNameIdentifier	 signature
=	TokenNameEQUAL	
classGen	TokenNameIdentifier	 class Gen
.	TokenNameDOT	
getApplyTemplatesSigForImport	TokenNameIdentifier	 get Apply Templates Sig For Import
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
applyTemplates	TokenNameIdentifier	 apply Templates
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addMethodref	TokenNameIdentifier	 add Methodref
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
functionName	TokenNameIdentifier	 function Name
,	TokenNameCOMMA	
signature	TokenNameIdentifier	 signature
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEVIRTUAL	TokenNameIdentifier	 INVOKEVIRTUAL
(	TokenNameLPAREN	
applyTemplates	TokenNameIdentifier	 apply Templates
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pop any parameter frame that was pushed above. 	TokenNameCOMMENT_LINE	Pop any parameter frame that was pushed above. 
if	TokenNameif	
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
hasLocalParams	TokenNameIdentifier	 has Local Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
final	TokenNamefinal	
int	TokenNameint	
pushFrame	TokenNameIdentifier	 push Frame
=	TokenNameEQUAL	
cpg	TokenNameIdentifier	 cpg
.	TokenNameDOT	
addMethodref	TokenNameIdentifier	 add Methodref
(	TokenNameLPAREN	
TRANSLET_CLASS	TokenNameIdentifier	 TRANSLET  CLASS
,	TokenNameCOMMA	
POP_PARAM_FRAME	TokenNameIdentifier	 POP  PARAM  FRAME
,	TokenNameCOMMA	
POP_PARAM_FRAME_SIG	TokenNameIdentifier	 POP  PARAM  FRAME  SIG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
il	TokenNameIdentifier	 il
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
new	TokenNamenew	
INVOKEVIRTUAL	TokenNameIdentifier	 INVOKEVIRTUAL
(	TokenNameLPAREN	
pushFrame	TokenNameIdentifier	 push Frame
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
