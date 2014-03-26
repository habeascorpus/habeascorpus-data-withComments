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
/** * Bridge class for the &lt;feComposite> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGFeCompositeElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;feComposite> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGFeCompositeElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFeCompositeElementBridge	TokenNameIdentifier	 SVG Fe Composite Element Bridge
extends	TokenNameextends	
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier	 Abstract SVG Filter Primitive Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;feComposite> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;feComposite> element. 
public	TokenNamepublic	
SVGFeCompositeElementBridge	TokenNameIdentifier	 SVG Fe Composite Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'feComposite'. */	TokenNameCOMMENT_JAVADOC	 Returns 'feComposite'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FE_COMPOSITE_TAG	TokenNameIdentifier	 SVG  FE  COMPOSITE  TAG
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
// 'operator' attribute - default is 'over' 	TokenNameCOMMENT_LINE	'operator' attribute - default is 'over' 
CompositeRule	TokenNameIdentifier	 Composite Rule
rule	TokenNameIdentifier	 rule
=	TokenNameEQUAL	
convertOperator	TokenNameIdentifier	 convert Operator
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
/** * Converts the 'operator' attribute of the specified feComposite * filter primitive element. * * @param filterElement the feComposite filter element * @param ctx the BridgeContext to use for error information */	TokenNameCOMMENT_JAVADOC	 Converts the 'operator' attribute of the specified feComposite filter primitive element. * @param filterElement the feComposite filter element @param ctx the BridgeContext to use for error information 
protected	TokenNameprotected	
static	TokenNamestatic	
CompositeRule	TokenNameIdentifier	 Composite Rule
convertOperator	TokenNameIdentifier	 convert Operator
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
filterElement	TokenNameIdentifier	 filter Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OPERATOR_ATTRIBUTE	TokenNameIdentifier	 SVG  OPERATOR  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
// default is over 	TokenNameCOMMENT_LINE	default is over 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_ATOP_VALUE	TokenNameIdentifier	 SVG  ATOP  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
ATOP	TokenNameIdentifier	 ATOP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_IN_VALUE	TokenNameIdentifier	 SVG  IN  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
IN	TokenNameIdentifier	 IN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_OVER_VALUE	TokenNameIdentifier	 SVG  OVER  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
SVG_OUT_VALUE	TokenNameIdentifier	 SVG  OUT  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
OUT	TokenNameIdentifier	 OUT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_XOR_VALUE	TokenNameIdentifier	 SVG  XOR  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
XOR	TokenNameIdentifier	 XOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_ARITHMETIC_VALUE	TokenNameIdentifier	 SVG  ARITHMETIC  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
SVG_K1_ATTRIBUTE	TokenNameIdentifier	 SVG  K1  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
SVG_K2_ATTRIBUTE	TokenNameIdentifier	 SVG  K2  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
k3	TokenNameIdentifier	 k3
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
SVG_K3_ATTRIBUTE	TokenNameIdentifier	 SVG  K3  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
k4	TokenNameIdentifier	 k4
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
SVG_K4_ATTRIBUTE	TokenNameIdentifier	 SVG  K4  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
ARITHMETIC	TokenNameIdentifier	 ARITHMETIC
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
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
SVG_OPERATOR_ATTRIBUTE	TokenNameIdentifier	 SVG  OPERATOR  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
