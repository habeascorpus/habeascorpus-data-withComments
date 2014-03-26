/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StackGuard.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StackGuard.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
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
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplate	TokenNameIdentifier	 Elem Template
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ObjectStack	TokenNameIdentifier	 Object Stack
;	TokenNameSEMICOLON	
/** * Class to guard against recursion getting too deep. */	TokenNameCOMMENT_JAVADOC	 Class to guard against recursion getting too deep. 
public	TokenNamepublic	
class	TokenNameclass	
StackGuard	TokenNameIdentifier	 Stack Guard
{	TokenNameLBRACE	
/** * Used for infinite loop check. If the value is -1, do not * check for infinite loops. Anyone who wants to enable that * check should change the value of this variable to be the * level of recursion that they want to check. Be careful setting * this variable, if the number is too low, it may report an * infinite loop situation, when there is none. * Post version 1.0.0, we'll make this a runtime feature. */	TokenNameCOMMENT_JAVADOC	 Used for infinite loop check. If the value is -1, do not check for infinite loops. Anyone who wants to enable that check should change the value of this variable to be the level of recursion that they want to check. Be careful setting this variable, if the number is too low, it may report an infinite loop situation, when there is none. Post version 1.0.0, we'll make this a runtime feature. 
private	TokenNameprivate	
int	TokenNameint	
m_recursionLimit	TokenNameIdentifier	 m recursion Limit
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
/** * Get the recursion limit. * Used for infinite loop check. If the value is -1, do not * check for infinite loops. Anyone who wants to enable that * check should change the value of this variable to be the * level of recursion that they want to check. Be careful setting * this variable, if the number is too low, it may report an * infinite loop situation, when there is none. * Post version 1.0.0, we'll make this a runtime feature. * * @return The recursion limit. */	TokenNameCOMMENT_JAVADOC	 Get the recursion limit. Used for infinite loop check. If the value is -1, do not check for infinite loops. Anyone who wants to enable that check should change the value of this variable to be the level of recursion that they want to check. Be careful setting this variable, if the number is too low, it may report an infinite loop situation, when there is none. Post version 1.0.0, we'll make this a runtime feature. * @return The recursion limit. 
public	TokenNamepublic	
int	TokenNameint	
getRecursionLimit	TokenNameIdentifier	 get Recursion Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_recursionLimit	TokenNameIdentifier	 m recursion Limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the recursion limit. * Used for infinite loop check. If the value is -1, do not * check for infinite loops. Anyone who wants to enable that * check should change the value of this variable to be the * level of recursion that they want to check. Be careful setting * this variable, if the number is too low, it may report an * infinite loop situation, when there is none. * Post version 1.0.0, we'll make this a runtime feature. * * @param limit The recursion limit. */	TokenNameCOMMENT_JAVADOC	 Set the recursion limit. Used for infinite loop check. If the value is -1, do not check for infinite loops. Anyone who wants to enable that check should change the value of this variable to be the level of recursion that they want to check. Be careful setting this variable, if the number is too low, it may report an infinite loop situation, when there is none. Post version 1.0.0, we'll make this a runtime feature. * @param limit The recursion limit. 
public	TokenNamepublic	
void	TokenNamevoid	
setRecursionLimit	TokenNameIdentifier	 set Recursion Limit
(	TokenNameLPAREN	
int	TokenNameint	
limit	TokenNameIdentifier	 limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_recursionLimit	TokenNameIdentifier	 m recursion Limit
=	TokenNameEQUAL	
limit	TokenNameIdentifier	 limit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor StackGuard * */	TokenNameCOMMENT_JAVADOC	 Constructor StackGuard 
public	TokenNamepublic	
StackGuard	TokenNameIdentifier	 Stack Guard
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformerImpl	TokenNameIdentifier	 transformer Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
transformerImpl	TokenNameIdentifier	 transformer Impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overide equal method for StackGuard objects * */	TokenNameCOMMENT_JAVADOC	 Overide equal method for StackGuard objects 
public	TokenNamepublic	
int	TokenNameint	
countLikeTemplates	TokenNameIdentifier	 count Like Templates
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
templ	TokenNameIdentifier	 templ
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ObjectStack	TokenNameIdentifier	 Object Stack
elems	TokenNameIdentifier	 elems
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentTemplateElements	TokenNameIdentifier	 get Current Template Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
elems	TokenNameIdentifier	 elems
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
templ	TokenNameIdentifier	 templ
)	TokenNameRPAREN	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the next named or match template down from and including * the given position. * @param pos the current index position in the stack. * @return null if no matched or named template found, otherwise * the next named or matched template at or below the position. */	TokenNameCOMMENT_JAVADOC	 Get the next named or match template down from and including the given position. @param pos the current index position in the stack. @return null if no matched or named template found, otherwise the next named or matched template at or below the position. 
private	TokenNameprivate	
ElemTemplate	TokenNameIdentifier	 Elem Template
getNextMatchOrNamedTemplate	TokenNameIdentifier	 get Next Match Or Named Template
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ObjectStack	TokenNameIdentifier	 Object Stack
elems	TokenNameIdentifier	 elems
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentTemplateElements	TokenNameIdentifier	 get Current Template Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
elems	TokenNameIdentifier	 elems
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
elem	TokenNameIdentifier	 elem
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check if we are in an infinite loop * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Check if we are in an infinite loop * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
checkForInfinateLoop	TokenNameIdentifier	 check For Infinate Loop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
int	TokenNameint	
nTemplates	TokenNameIdentifier	 n Templates
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getCurrentTemplateElementsCount	TokenNameIdentifier	 get Current Template Elements Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nTemplates	TokenNameIdentifier	 n Templates
<	TokenNameLESS	
m_recursionLimit	TokenNameIdentifier	 m recursion Limit
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_recursionLimit	TokenNameIdentifier	 m recursion Limit
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Safety check. 	TokenNameCOMMENT_LINE	Safety check. 
// loop from the top index down to the recursion limit (I don't think 	TokenNameCOMMENT_LINE	loop from the top index down to the recursion limit (I don't think 
// there's any need to go below that). 	TokenNameCOMMENT_LINE	there's any need to go below that). 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
nTemplates	TokenNameIdentifier	 n Templates
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
m_recursionLimit	TokenNameIdentifier	 m recursion Limit
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplate	TokenNameIdentifier	 Elem Template
template	TokenNameIdentifier	 template
=	TokenNameEQUAL	
getNextMatchOrNamedTemplate	TokenNameIdentifier	 get Next Match Or Named Template
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
template	TokenNameIdentifier	 template
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
int	TokenNameint	
loopCount	TokenNameIdentifier	 loop Count
=	TokenNameEQUAL	
countLikeTemplates	TokenNameIdentifier	 count Like Templates
(	TokenNameLPAREN	
template	TokenNameIdentifier	 template
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loopCount	TokenNameIdentifier	 loop Count
>=	TokenNameGREATER_EQUAL	
m_recursionLimit	TokenNameIdentifier	 m recursion Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// throw new TransformerException("Template nesting too deep. nesting = "+loopCount+ 	TokenNameCOMMENT_LINE	throw new TransformerException("Template nesting too deep. nesting = "+loopCount+ 
// ", template "+((null == template.getName()) ? "name = " : "match = ")+ 	TokenNameCOMMENT_LINE	", template "+((null == template.getName()) ? "name = " : "match = ")+ 
// ((null != template.getName()) ? template.getName().toString() 	TokenNameCOMMENT_LINE	((null != template.getName()) ? template.getName().toString() 
// : template.getMatch().getPatternString())); 	TokenNameCOMMENT_LINE	: template.getMatch().getPatternString())); 
String	TokenNameIdentifier	 String
idIs	TokenNameIdentifier	 id Is
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"nameIs"	TokenNameStringLiteral	nameIs
:	TokenNameCOLON	
"matchPatternIs"	TokenNameStringLiteral	matchPatternIs
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
msgArgs	TokenNameIdentifier	 msg Args
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
loopCount	TokenNameIdentifier	 loop Count
)	TokenNameRPAREN	
,	TokenNameCOMMA	
idIs	TokenNameIdentifier	 id Is
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
template	TokenNameIdentifier	 template
.	TokenNameDOT	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
"recursionTooDeep"	TokenNameStringLiteral	recursionTooDeep
,	TokenNameCOMMA	
msgArgs	TokenNameIdentifier	 msg Args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
