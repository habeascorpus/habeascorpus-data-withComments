/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationEngine	TokenNameIdentifier	 Animation Engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
AnimationTarget	TokenNameIdentifier	 Animation Target
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
AnimatableValue	TokenNameIdentifier	 Animatable Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SMILConstants	TokenNameIdentifier	 SMIL Constants
;	TokenNameSEMICOLON	
/** * Bridge class for the 'animate' animation element. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGAnimateElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the 'animate' animation element. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGAnimateElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGAnimateElementBridge	TokenNameIdentifier	 SVG Animate Element Bridge
extends	TokenNameextends	
SVGAnimationElementBridge	TokenNameIdentifier	 SVG Animation Element Bridge
{	TokenNameLBRACE	
/** * Returns 'animate'. */	TokenNameCOMMENT_JAVADOC	 Returns 'animate'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_ANIMATE_TAG	TokenNameIdentifier	 SVG  ANIMATE  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new instance of this bridge. */	TokenNameCOMMENT_JAVADOC	 Returns a new instance of this bridge. 
public	TokenNamepublic	
Bridge	TokenNameIdentifier	 Bridge
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGAnimateElementBridge	TokenNameIdentifier	 SVG Animate Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the animation object for the animation element. */	TokenNameCOMMENT_JAVADOC	 Creates the animation object for the animation element. 
protected	TokenNameprotected	
AbstractAnimation	TokenNameIdentifier	 Abstract Animation
createAnimation	TokenNameIdentifier	 create Animation
(	TokenNameLPAREN	
AnimationTarget	TokenNameIdentifier	 Animation Target
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AnimatableValue	TokenNameIdentifier	 Animatable Value
from	TokenNameIdentifier	 from
=	TokenNameEQUAL	
parseAnimatableValue	TokenNameIdentifier	 parse Animatable Value
(	TokenNameLPAREN	
SVG_FROM_ATTRIBUTE	TokenNameIdentifier	 SVG  FROM  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AnimatableValue	TokenNameIdentifier	 Animatable Value
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
parseAnimatableValue	TokenNameIdentifier	 parse Animatable Value
(	TokenNameLPAREN	
SVG_TO_ATTRIBUTE	TokenNameIdentifier	 SVG  TO  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AnimatableValue	TokenNameIdentifier	 Animatable Value
by	TokenNameIdentifier	 by
=	TokenNameEQUAL	
parseAnimatableValue	TokenNameIdentifier	 parse Animatable Value
(	TokenNameLPAREN	
SVG_BY_ATTRIBUTE	TokenNameIdentifier	 SVG  BY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
(	TokenNameLPAREN	
timedElement	TokenNameIdentifier	 timed Element
,	TokenNameCOMMA	
this	TokenNamethis	
,	TokenNameCOMMA	
parseCalcMode	TokenNameIdentifier	 parse Calc Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseKeyTimes	TokenNameIdentifier	 parse Key Times
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseKeySplines	TokenNameIdentifier	 parse Key Splines
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseAdditive	TokenNameIdentifier	 parse Additive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseAccumulate	TokenNameIdentifier	 parse Accumulate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parseValues	TokenNameIdentifier	 parse Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
from	TokenNameIdentifier	 from
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
by	TokenNameIdentifier	 by
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parsed 'calcMode' attribute from the animation element. */	TokenNameCOMMENT_JAVADOC	 Returns the parsed 'calcMode' attribute from the animation element. 
protected	TokenNameprotected	
int	TokenNameint	
parseCalcMode	TokenNameIdentifier	 parse Calc Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the attribute being animated has only non-additive values, take 	TokenNameCOMMENT_LINE	If the attribute being animated has only non-additive values, take 
// the animation as having calcMode="discrete". 	TokenNameCOMMENT_LINE	the animation as having calcMode="discrete". 
if	TokenNameif	
(	TokenNameLPAREN	
animationType	TokenNameIdentifier	 animation Type
==	TokenNameEQUAL_EQUAL	
AnimationEngine	TokenNameIdentifier	 Animation Engine
.	TokenNameDOT	
ANIM_TYPE_CSS	TokenNameIdentifier	 ANIM  TYPE  CSS
&&	TokenNameAND_AND	
!	TokenNameNOT	
targetElement	TokenNameIdentifier	 target Element
.	TokenNameDOT	
isPropertyAdditive	TokenNameIdentifier	 is Property Additive
(	TokenNameLPAREN	
attributeLocalName	TokenNameIdentifier	 attribute Local Name
)	TokenNameRPAREN	
||	TokenNameOR_OR	
animationType	TokenNameIdentifier	 animation Type
==	TokenNameEQUAL_EQUAL	
AnimationEngine	TokenNameIdentifier	 Animation Engine
.	TokenNameDOT	
ANIM_TYPE_XML	TokenNameIdentifier	 ANIM  TYPE  XML
&&	TokenNameAND_AND	
!	TokenNameNOT	
targetElement	TokenNameIdentifier	 target Element
.	TokenNameDOT	
isAttributeAdditive	TokenNameIdentifier	 is Attribute Additive
(	TokenNameLPAREN	
attributeNamespaceURI	TokenNameIdentifier	 attribute Namespace URI
,	TokenNameCOMMA	
attributeLocalName	TokenNameIdentifier	 attribute Local Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
.	TokenNameDOT	
CALC_MODE_DISCRETE	TokenNameIdentifier	 CALC  MODE  DISCRETE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
calcModeString	TokenNameIdentifier	 calc Mode String
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CALC_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  CALC  MODE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
calcModeString	TokenNameIdentifier	 calc Mode String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getDefaultCalcMode	TokenNameIdentifier	 get Default Calc Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
calcModeString	TokenNameIdentifier	 calc Mode String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_LINEAR_VALUE	TokenNameIdentifier	 SMIL  LINEAR  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
.	TokenNameDOT	
CALC_MODE_LINEAR	TokenNameIdentifier	 CALC  MODE  LINEAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
calcModeString	TokenNameIdentifier	 calc Mode String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_DISCRETE_VALUE	TokenNameIdentifier	 SMIL  DISCRETE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
.	TokenNameDOT	
CALC_MODE_DISCRETE	TokenNameIdentifier	 CALC  MODE  DISCRETE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
calcModeString	TokenNameIdentifier	 calc Mode String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_PACED_VALUE	TokenNameIdentifier	 SMIL  PACED  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
.	TokenNameDOT	
CALC_MODE_PACED	TokenNameIdentifier	 CALC  MODE  PACED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
calcModeString	TokenNameIdentifier	 calc Mode String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_SPLINE_VALUE	TokenNameIdentifier	 SMIL  SPLINE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
.	TokenNameDOT	
CALC_MODE_SPLINE	TokenNameIdentifier	 CALC  MODE  SPLINE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_CALC_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  CALC  MODE  ATTRIBUTE
,	TokenNameCOMMA	
calcModeString	TokenNameIdentifier	 calc Mode String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parsed 'additive' attribute from the animation element. */	TokenNameCOMMENT_JAVADOC	 Returns the parsed 'additive' attribute from the animation element. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
parseAdditive	TokenNameIdentifier	 parse Additive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
additiveString	TokenNameIdentifier	 additive String
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ADDITIVE_ATTRIBUTE	TokenNameIdentifier	 SVG  ADDITIVE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
additiveString	TokenNameIdentifier	 additive String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
additiveString	TokenNameIdentifier	 additive String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_REPLACE_VALUE	TokenNameIdentifier	 SMIL  REPLACE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
additiveString	TokenNameIdentifier	 additive String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_SUM_VALUE	TokenNameIdentifier	 SMIL  SUM  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_ADDITIVE_ATTRIBUTE	TokenNameIdentifier	 SVG  ADDITIVE  ATTRIBUTE
,	TokenNameCOMMA	
additiveString	TokenNameIdentifier	 additive String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parsed 'accumulate' attribute from the animation element. */	TokenNameCOMMENT_JAVADOC	 Returns the parsed 'accumulate' attribute from the animation element. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
parseAccumulate	TokenNameIdentifier	 parse Accumulate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
accumulateString	TokenNameIdentifier	 accumulate String
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ACCUMULATE_ATTRIBUTE	TokenNameIdentifier	 SVG  ACCUMULATE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
accumulateString	TokenNameIdentifier	 accumulate String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
accumulateString	TokenNameIdentifier	 accumulate String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_NONE_VALUE	TokenNameIdentifier	 SMIL  NONE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
accumulateString	TokenNameIdentifier	 accumulate String
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SMILConstants	TokenNameIdentifier	 SMIL Constants
.	TokenNameDOT	
SMIL_SUM_VALUE	TokenNameIdentifier	 SMIL  SUM  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_ACCUMULATE_ATTRIBUTE	TokenNameIdentifier	 SVG  ACCUMULATE  ATTRIBUTE
,	TokenNameCOMMA	
accumulateString	TokenNameIdentifier	 accumulate String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parsed 'values' attribute from the animation element. */	TokenNameCOMMENT_JAVADOC	 Returns the parsed 'values' attribute from the animation element. 
protected	TokenNameprotected	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseValues	TokenNameIdentifier	 parse Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isCSS	TokenNameIdentifier	 is CSS
=	TokenNameEQUAL	
animationType	TokenNameIdentifier	 animation Type
==	TokenNameEQUAL_EQUAL	
AnimationEngine	TokenNameIdentifier	 Animation Engine
.	TokenNameDOT	
ANIM_TYPE_CSS	TokenNameIdentifier	 ANIM  TYPE  CSS
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
valuesString	TokenNameIdentifier	 values String
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
outer	TokenNameIdentifier	 outer
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
AnimatableValue	TokenNameIdentifier	 Animatable Value
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
eng	TokenNameIdentifier	 eng
.	TokenNameDOT	
parseAnimatableValue	TokenNameIdentifier	 parse Animatable Value
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
animationTarget	TokenNameIdentifier	 animation Target
,	TokenNameCOMMA	
attributeNamespaceURI	TokenNameIdentifier	 attribute Namespace URI
,	TokenNameCOMMA	
attributeLocalName	TokenNameIdentifier	 attribute Local Name
,	TokenNameCOMMA	
isCSS	TokenNameIdentifier	 is CSS
,	TokenNameCOMMA	
valuesString	TokenNameIdentifier	 values String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
checkValueType	TokenNameIdentifier	 check Value Type
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
valuesString	TokenNameIdentifier	 values String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parsed 'keyTimes' attribute from the animation element. */	TokenNameCOMMENT_JAVADOC	 Returns the parsed 'keyTimes' attribute from the animation element. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseKeyTimes	TokenNameIdentifier	 parse Key Times
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
keyTimesString	TokenNameIdentifier	 key Times String
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_KEY_TIMES_ATTRIBUTE	TokenNameIdentifier	 SVG  KEY  TIMES  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
keyTimesString	TokenNameIdentifier	 key Times String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ArrayList	TokenNameIdentifier	 Array List
keyTimes	TokenNameIdentifier	 key Times
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
outer	TokenNameIdentifier	 outer
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
keyTimesString	TokenNameIdentifier	 key Times String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
keyTimesString	TokenNameIdentifier	 key Times String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
keyTimesString	TokenNameIdentifier	 key Times String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
float	TokenNamefloat	
keyTime	TokenNameIdentifier	 key Time
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
keyTimesString	TokenNameIdentifier	 key Times String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
keyTime	TokenNameIdentifier	 key Time
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_KEY_TIMES_ATTRIBUTE	TokenNameIdentifier	 SVG  KEY  TIMES  ATTRIBUTE
,	TokenNameCOMMA	
keyTimesString	TokenNameIdentifier	 key Times String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
keyTimes	TokenNameIdentifier	 key Times
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the parsed 'keySplines' attribute from the animation element. */	TokenNameCOMMENT_JAVADOC	 Returns the parsed 'keySplines' attribute from the animation element. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parseKeySplines	TokenNameIdentifier	 parse Key Splines
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
keySplinesString	TokenNameIdentifier	 key Splines String
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_KEY_SPLINES_ATTRIBUTE	TokenNameIdentifier	 SVG  KEY  SPLINES  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
keySplinesString	TokenNameIdentifier	 key Splines String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
keySplines	TokenNameIdentifier	 key Splines
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
outer	TokenNameIdentifier	 outer
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
keySplinesString	TokenNameIdentifier	 key Splines String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
outer	TokenNameIdentifier	 outer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
keySplinesString	TokenNameIdentifier	 key Splines String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
' '	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
','	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
keySplinesString	TokenNameIdentifier	 key Splines String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
keySplinesString	TokenNameIdentifier	 key Splines String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_KEY_SPLINES_ATTRIBUTE	TokenNameIdentifier	 SVG  KEY  SPLINES  ATTRIBUTE
,	TokenNameCOMMA	
keySplinesString	TokenNameIdentifier	 key Splines String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
float	TokenNamefloat	
keySplineValue	TokenNameIdentifier	 key Spline Value
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
keySplinesString	TokenNameIdentifier	 key Splines String
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
keySplines	TokenNameIdentifier	 key Splines
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
keySplineValue	TokenNameIdentifier	 key Spline Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_KEY_SPLINES_ATTRIBUTE	TokenNameIdentifier	 SVG  KEY  SPLINES  ATTRIBUTE
,	TokenNameCOMMA	
keySplinesString	TokenNameIdentifier	 key Splines String
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
keySplines	TokenNameIdentifier	 key Splines
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
)	TokenNameRPAREN	
keySplines	TokenNameIdentifier	 key Splines
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
floatValue	TokenNameIdentifier	 float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the calcMode that the animation defaults to if none is specified. */	TokenNameCOMMENT_JAVADOC	 Returns the calcMode that the animation defaults to if none is specified. 
protected	TokenNameprotected	
int	TokenNameint	
getDefaultCalcMode	TokenNameIdentifier	 get Default Calc Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SimpleAnimation	TokenNameIdentifier	 Simple Animation
.	TokenNameDOT	
CALC_MODE_LINEAR	TokenNameIdentifier	 CALC  MODE  LINEAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the animation element being handled by this bridge can * animate attributes of the specified type. * @param type one of the TYPE_ constants defined in {@link org.apache.batik.util.SVGTypes}. */	TokenNameCOMMENT_JAVADOC	 Returns whether the animation element being handled by this bridge can animate attributes of the specified type. @param type one of the TYPE_ constants defined in {@link org.apache.batik.util.SVGTypes}. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
canAnimateType	TokenNameIdentifier	 can Animate Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
