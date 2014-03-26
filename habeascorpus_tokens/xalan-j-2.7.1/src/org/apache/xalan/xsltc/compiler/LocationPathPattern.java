/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: LocationPathPattern.java 468650 2006-10-28 07:03:30Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: LocationPathPattern.java 468650 2006-10-28 07:03:30Z minchau $ 
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
Axis	TokenNameIdentifier	 Axis
;	TokenNameSEMICOLON	
/** * @author Jacek Ambroziak * @author Santiago Pericas-Geertsen * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 @author Jacek Ambroziak @author Santiago Pericas-Geertsen @author Morten Jorgensen 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
extends	TokenNameextends	
Pattern	TokenNameIdentifier	 Pattern
{	TokenNameLBRACE	
private	TokenNameprivate	
Template	TokenNameIdentifier	 Template
_template	TokenNameIdentifier	 template
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_importPrecedence	TokenNameIdentifier	 import Precedence
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
_priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
return	TokenNamereturn	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
Void	TokenNameIdentifier	 Void
;	TokenNameSEMICOLON	
// TODO 	TokenNameCOMMENT_LINE	TODO 
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
// TODO: What does it mean to translate a Pattern ? 	TokenNameCOMMENT_LINE	TODO: What does it mean to translate a Pattern ? 
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setTemplate	TokenNameIdentifier	 set Template
(	TokenNameLPAREN	
final	TokenNamefinal	
Template	TokenNameIdentifier	 Template
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
;	TokenNameSEMICOLON	
_priority	TokenNameIdentifier	 priority
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_importPrecedence	TokenNameIdentifier	 import Precedence
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getImportPrecedence	TokenNameIdentifier	 get Import Precedence
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Template	TokenNameIdentifier	 Template
getTemplate	TokenNameIdentifier	 get Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_template	TokenNameIdentifier	 template
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
double	TokenNamedouble	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
_priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getDefaultPriority	TokenNameIdentifier	 get Default Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
_priority	TokenNameIdentifier	 priority
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getDefaultPriority	TokenNameIdentifier	 get Default Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method is used by the Mode class to prioritise patterns and * template. This method is called for templates that are in the same * mode and that match on the same core pattern. The rules used are: * o) first check precedence - highest precedence wins * o) then check priority - highest priority wins * o) then check the position - the template that occured last wins */	TokenNameCOMMENT_JAVADOC	 This method is used by the Mode class to prioritise patterns and template. This method is called for templates that are in the same mode and that match on the same core pattern. The rules used are: o) first check precedence - highest precedence wins o) then check priority - highest priority wins o) then check the position - the template that occured last wins 
public	TokenNamepublic	
boolean	TokenNameboolean	
noSmallerThan	TokenNameIdentifier	 no Smaller Than
(	TokenNameLPAREN	
LocationPathPattern	TokenNameIdentifier	 Location Path Pattern
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_importPrecedence	TokenNameIdentifier	 import Precedence
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_importPrecedence	TokenNameIdentifier	 import Precedence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_importPrecedence	TokenNameIdentifier	 import Precedence
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_importPrecedence	TokenNameIdentifier	 import Precedence
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_priority	TokenNameIdentifier	 priority
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
_priority	TokenNameIdentifier	 priority
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_priority	TokenNameIdentifier	 priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_position	TokenNameIdentifier	 position
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
_position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
StepPattern	TokenNameIdentifier	 Step Pattern
getKernelPattern	TokenNameIdentifier	 get Kernel Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
reduceKernelPattern	TokenNameIdentifier	 reduce Kernel Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
isWildcard	TokenNameIdentifier	 is Wildcard
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StepPattern	TokenNameIdentifier	 Step Pattern
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
getKernelPattern	TokenNameIdentifier	 get Kernel Pattern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
CHILD	TokenNameIdentifier	 CHILD
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"root()"	TokenNameStringLiteral	root()
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
