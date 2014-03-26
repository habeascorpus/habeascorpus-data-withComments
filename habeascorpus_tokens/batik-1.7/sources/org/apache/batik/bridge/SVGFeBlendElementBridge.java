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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
CompositeRule	TokenNameIdentifier	 Composite Rule
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
PadMode	TokenNameIdentifier	 Pad Mode
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
CompositeRable8Bit	TokenNameIdentifier	 Composite Rable8 Bit
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
Filter	TokenNameIdentifier	 Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
PadRable8Bit	TokenNameIdentifier	 Pad Rable8 Bit
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
GraphicsNode	TokenNameIdentifier	 Graphics Node
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * Bridge class for the &lt;feBlend> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGFeBlendElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;feBlend> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGFeBlendElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFeBlendElementBridge	TokenNameIdentifier	 SVG Fe Blend Element Bridge
extends	TokenNameextends	
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier	 Abstract SVG Filter Primitive Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;feBlend> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;feBlend> element. 
public	TokenNamepublic	
SVGFeBlendElementBridge	TokenNameIdentifier	 SVG Fe Blend Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'feBlend'. */	TokenNameCOMMENT_JAVADOC	 Returns 'feBlend'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FE_BLEND_TAG	TokenNameIdentifier	 SVG  FE  BLEND  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>Filter</tt> primitive according to the specified * parameters. * * @param ctx the bridge context to use * @param filterElement the element that defines a filter * @param filteredElement the element that references the filter * @param filteredNode the graphics node to filter * * @param inputFilter the <tt>Filter</tt> that represents the current * filter input if the filter chain. * @param filterRegion the filter area defined for the filter chain * the new node will be part of. * @param filterMap a map where the mediator can map a name to the * <tt>Filter</tt> it creates. Other <tt>FilterBridge</tt>s * can then access a filter node from the filterMap if they * know its name. */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>Filter</tt> primitive according to the specified parameters. * @param ctx the bridge context to use @param filterElement the element that defines a filter @param filteredElement the element that references the filter @param filteredNode the graphics node to filter * @param inputFilter the <tt>Filter</tt> that represents the current filter input if the filter chain. @param filterRegion the filter area defined for the filter chain the new node will be part of. @param filterMap a map where the mediator can map a name to the <tt>Filter</tt> it creates. Other <tt>FilterBridge</tt>s can then access a filter node from the filterMap if they know its name. 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
createFilter	TokenNameIdentifier	 create Filter
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
filteredElement	TokenNameIdentifier	 filtered Element
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
filteredNode	TokenNameIdentifier	 filtered Node
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
inputFilter	TokenNameIdentifier	 input Filter
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
filterRegion	TokenNameIdentifier	 filter Region
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
filterMap	TokenNameIdentifier	 filter Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'mode' attribute - default is 'normal' 	TokenNameCOMMENT_LINE	'mode' attribute - default is 'normal' 
CompositeRule	TokenNameIdentifier	 Composite Rule
rule	TokenNameIdentifier	 rule
=	TokenNameEQUAL	
convertMode	TokenNameIdentifier	 convert Mode
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'in' attribute 	TokenNameCOMMENT_LINE	'in' attribute 
Filter	TokenNameIdentifier	 Filter
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
getIn	TokenNameIdentifier	 get In
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
filteredElement	TokenNameIdentifier	 filtered Element
,	TokenNameCOMMA	
filteredNode	TokenNameIdentifier	 filtered Node
,	TokenNameCOMMA	
inputFilter	TokenNameIdentifier	 input Filter
,	TokenNameCOMMA	
filterMap	TokenNameIdentifier	 filter Map
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// disable the filter 	TokenNameCOMMENT_LINE	disable the filter 
}	TokenNameRBRACE	
// 'in2' attribute - required 	TokenNameCOMMENT_LINE	'in2' attribute - required 
Filter	TokenNameIdentifier	 Filter
in2	TokenNameIdentifier	 in2
=	TokenNameEQUAL	
getIn2	TokenNameIdentifier	 get In2
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
filteredElement	TokenNameIdentifier	 filtered Element
,	TokenNameCOMMA	
filteredNode	TokenNameIdentifier	 filtered Node
,	TokenNameCOMMA	
inputFilter	TokenNameIdentifier	 input Filter
,	TokenNameCOMMA	
filterMap	TokenNameIdentifier	 filter Map
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
in2	TokenNameIdentifier	 in2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// disable the filter 	TokenNameCOMMENT_LINE	disable the filter 
}	TokenNameRBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
defaultRegion	TokenNameIdentifier	 default Region
;	TokenNameSEMICOLON	
defaultRegion	TokenNameIdentifier	 default Region
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defaultRegion	TokenNameIdentifier	 default Region
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
in2	TokenNameIdentifier	 in2
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get filter primitive chain region 	TokenNameCOMMENT_LINE	get filter primitive chain region 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
primitiveRegion	TokenNameIdentifier	 primitive Region
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertFilterPrimitiveRegion	TokenNameIdentifier	 convert Filter Primitive Region
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
filteredElement	TokenNameIdentifier	 filtered Element
,	TokenNameCOMMA	
filteredNode	TokenNameIdentifier	 filtered Node
,	TokenNameCOMMA	
defaultRegion	TokenNameIdentifier	 default Region
,	TokenNameCOMMA	
filterRegion	TokenNameIdentifier	 filter Region
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// build the blend filter 	TokenNameCOMMENT_LINE	build the blend filter 
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcs	TokenNameIdentifier	 srcs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
in2	TokenNameIdentifier	 in2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcs	TokenNameIdentifier	 srcs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeRable8Bit	TokenNameIdentifier	 Composite Rable8 Bit
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
rule	TokenNameIdentifier	 rule
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// handle the 'color-interpolation-filters' property 	TokenNameCOMMENT_LINE	handle the 'color-interpolation-filters' property 
handleColorInterpolationFilters	TokenNameIdentifier	 handle Color Interpolation Filters
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
filterElement	TokenNameIdentifier	 filter Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
PadRable8Bit	TokenNameIdentifier	 Pad Rable8 Bit
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
primitiveRegion	TokenNameIdentifier	 primitive Region
,	TokenNameCOMMA	
PadMode	TokenNameIdentifier	 Pad Mode
.	TokenNameDOT	
ZERO_PAD	TokenNameIdentifier	 ZERO  PAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update the filter Map 	TokenNameCOMMENT_LINE	update the filter Map 
updateFilterMap	TokenNameIdentifier	 update Filter Map
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
filterMap	TokenNameIdentifier	 filter Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the 'mode' of the specified feBlend filter primitive. * * @param filterElement the filter feBlend element */	TokenNameCOMMENT_JAVADOC	 Converts the 'mode' of the specified feBlend filter primitive. * @param filterElement the filter feBlend element 
protected	TokenNameprotected	
static	TokenNamestatic	
CompositeRule	TokenNameIdentifier	 Composite Rule
convertMode	TokenNameIdentifier	 convert Mode
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
rule	TokenNameIdentifier	 rule
=	TokenNameEQUAL	
filterElement	TokenNameIdentifier	 filter Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  MODE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
OVER	TokenNameIdentifier	 OVER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_NORMAL_VALUE	TokenNameIdentifier	 SVG  NORMAL  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
OVER	TokenNameIdentifier	 OVER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_MULTIPLY_VALUE	TokenNameIdentifier	 SVG  MULTIPLY  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
MULTIPLY	TokenNameIdentifier	 MULTIPLY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_SCREEN_VALUE	TokenNameIdentifier	 SVG  SCREEN  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
SCREEN	TokenNameIdentifier	 SCREEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_DARKEN_VALUE	TokenNameIdentifier	 SVG  DARKEN  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
DARKEN	TokenNameIdentifier	 DARKEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_LIGHTEN_VALUE	TokenNameIdentifier	 SVG  LIGHTEN  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
LIGHTEN	TokenNameIdentifier	 LIGHTEN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  MODE  ATTRIBUTE
,	TokenNameCOMMA	
rule	TokenNameIdentifier	 rule
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
