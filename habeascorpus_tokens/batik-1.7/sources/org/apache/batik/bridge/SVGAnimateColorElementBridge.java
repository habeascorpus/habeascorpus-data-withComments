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
ColorAnimation	TokenNameIdentifier	 Color Animation
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
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
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
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
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
SVGTypes	TokenNameIdentifier	 SVG Types
;	TokenNameSEMICOLON	
/** * Bridge class for the 'animateColor' animation element. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGAnimateColorElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the 'animateColor' animation element. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGAnimateColorElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGAnimateColorElementBridge	TokenNameIdentifier	 SVG Animate Color Element Bridge
extends	TokenNameextends	
SVGAnimateElementBridge	TokenNameIdentifier	 SVG Animate Element Bridge
{	TokenNameLBRACE	
/** * Returns 'animateColor'. */	TokenNameCOMMENT_JAVADOC	 Returns 'animateColor'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_ANIMATE_COLOR_TAG	TokenNameIdentifier	 SVG  ANIMATE  COLOR  TAG
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
SVGAnimateColorElementBridge	TokenNameIdentifier	 SVG Animate Color Element Bridge
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
ColorAnimation	TokenNameIdentifier	 Color Animation
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
/** * Returns whether the animation element being handled by this bridge can * animate attributes of the specified type. * @param type one of the TYPE_ constants defined in {@link SVGTypes}. */	TokenNameCOMMENT_JAVADOC	 Returns whether the animation element being handled by this bridge can animate attributes of the specified type. @param type one of the TYPE_ constants defined in {@link SVGTypes}. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
canAnimateType	TokenNameIdentifier	 can Animate Type
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_COLOR	TokenNameIdentifier	 TYPE  COLOR
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_PAINT	TokenNameIdentifier	 TYPE  PAINT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the specified {@link AnimatableValue} is of a type allowed * by this animation. */	TokenNameCOMMENT_JAVADOC	 Returns whether the specified {@link AnimatableValue} is of a type allowed by this animation. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
checkValueType	TokenNameIdentifier	 check Value Type
(	TokenNameLPAREN	
AnimatableValue	TokenNameIdentifier	 Animatable Value
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
instanceof	TokenNameinstanceof	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
.	TokenNameDOT	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
AnimatablePaintValue	TokenNameIdentifier	 Animatable Paint Value
.	TokenNameDOT	
PAINT_COLOR	TokenNameIdentifier	 PAINT  COLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
instanceof	TokenNameinstanceof	
AnimatableColorValue	TokenNameIdentifier	 Animatable Color Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
