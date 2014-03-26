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
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
DistantLight	TokenNameIdentifier	 Distant Light
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
Light	TokenNameIdentifier	 Light
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
PointLight	TokenNameIdentifier	 Point Light
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
SpotLight	TokenNameIdentifier	 Spot Light
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * Bridge class for the &lt;feDiffuseLighting> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: AbstractSVGLightingElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;feDiffuseLighting> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: AbstractSVGLightingElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGLightingElementBridge	TokenNameIdentifier	 Abstract SVG Lighting Element Bridge
extends	TokenNameextends	
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier	 Abstract SVG Filter Primitive Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the lighting filter primitives. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the lighting filter primitives. 
protected	TokenNameprotected	
AbstractSVGLightingElementBridge	TokenNameIdentifier	 Abstract SVG Lighting Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the light from the specified lighting filter primitive * element or null if any * * @param filterElement the lighting filter primitive element * @param ctx the bridge context */	TokenNameCOMMENT_JAVADOC	 Returns the light from the specified lighting filter primitive element or null if any * @param filterElement the lighting filter primitive element @param ctx the bridge context 
protected	TokenNameprotected	
static	TokenNamestatic	
Light	TokenNameIdentifier	 Light
extractLight	TokenNameIdentifier	 extract Light
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertLightingColor	TokenNameIdentifier	 convert Lighting Color
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
filterElement	TokenNameIdentifier	 filter Element
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
Bridge	TokenNameIdentifier	 Bridge
bridge	TokenNameIdentifier	 bridge
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getBridge	TokenNameIdentifier	 get Bridge
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
bridge	TokenNameIdentifier	 bridge
instanceof	TokenNameinstanceof	
AbstractSVGLightElementBridge	TokenNameIdentifier	 Abstract SVG Light Element Bridge
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractSVGLightElementBridge	TokenNameIdentifier	 Abstract SVG Light Element Bridge
)	TokenNameRPAREN	
bridge	TokenNameIdentifier	 bridge
)	TokenNameRPAREN	
.	TokenNameDOT	
createLight	TokenNameIdentifier	 create Light
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convert the 'kernelUnitLength' attribute of the specified * feDiffuseLighting or feSpecularLighting filter primitive element. * * @param filterElement the filter primitive element * @param ctx the BridgeContext to use for error information */	TokenNameCOMMENT_JAVADOC	 Convert the 'kernelUnitLength' attribute of the specified feDiffuseLighting or feSpecularLighting filter primitive element. * @param filterElement the filter primitive element @param ctx the BridgeContext to use for error information 
protected	TokenNameprotected	
static	TokenNamestatic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
convertKernelUnitLength	TokenNameIdentifier	 convert Kernel Unit Length
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
SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNEL  UNIT  LENGTH  ATTRIBUTE
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
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
units	TokenNameIdentifier	 units
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
" ,"	TokenNameStringLiteral	 ,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
units	TokenNameIdentifier	 units
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
units	TokenNameIdentifier	 units
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
units	TokenNameIdentifier	 units
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
units	TokenNameIdentifier	 units
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNEL  UNIT  LENGTH  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
units	TokenNameIdentifier	 units
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
units	TokenNameIdentifier	 units
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNEL  UNIT  LENGTH  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
units	TokenNameIdentifier	 units
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The base bridge class for light element. */	TokenNameCOMMENT_JAVADOC	 The base bridge class for light element. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
AbstractSVGLightElementBridge	TokenNameIdentifier	 Abstract SVG Light Element Bridge
extends	TokenNameextends	
AnimatableGenericSVGBridge	TokenNameIdentifier	 Animatable Generic SVG Bridge
{	TokenNameLBRACE	
/** * Creates a <tt>Light</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param filterElement the lighting filter primitive element * @param lightElement the element describing a light * @param color the color of the light */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>Light</tt> according to the specified parameters. * @param ctx the bridge context to use @param filterElement the lighting filter primitive element @param lightElement the element describing a light @param color the color of the light 
public	TokenNamepublic	
abstract	TokenNameabstract	
Light	TokenNameIdentifier	 Light
createLight	TokenNameIdentifier	 create Light
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Bridge class for the &lt;feSpotLight> element. */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;feSpotLight> element. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SVGFeSpotLightElementBridge	TokenNameIdentifier	 SVG Fe Spot Light Element Bridge
extends	TokenNameextends	
AbstractSVGLightElementBridge	TokenNameIdentifier	 Abstract SVG Light Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for a light element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for a light element. 
public	TokenNamepublic	
SVGFeSpotLightElementBridge	TokenNameIdentifier	 SVG Fe Spot Light Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'feSpotLight'. */	TokenNameCOMMENT_JAVADOC	 Returns 'feSpotLight'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FE_SPOT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  SPOT  LIGHT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>Light</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param filterElement the lighting filter primitive element * @param lightElement the element describing a light * @param color the color of the light */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>Light</tt> according to the specified parameters. * @param ctx the bridge context to use @param filterElement the lighting filter primitive element @param lightElement the element describing a light @param color the color of the light 
public	TokenNamepublic	
Light	TokenNameIdentifier	 Light
createLight	TokenNameIdentifier	 create Light
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'x' attribute - default is 0 	TokenNameCOMMENT_LINE	'x' attribute - default is 0 
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'y' attribute - default is 0 	TokenNameCOMMENT_LINE	'y' attribute - default is 0 
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'z' attribute - default is 0 	TokenNameCOMMENT_LINE	'z' attribute - default is 0 
double	TokenNamedouble	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  Z  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'pointsAtX' attribute - default is 0 	TokenNameCOMMENT_LINE	'pointsAtX' attribute - default is 0 
double	TokenNamedouble	
px	TokenNameIdentifier	 px
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_POINTS_AT_X_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  X  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'pointsAtY' attribute - default is 0 	TokenNameCOMMENT_LINE	'pointsAtY' attribute - default is 0 
double	TokenNamedouble	
py	TokenNameIdentifier	 py
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_POINTS_AT_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  Y  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'pointsAtZ' attribute - default is 0 	TokenNameCOMMENT_LINE	'pointsAtZ' attribute - default is 0 
double	TokenNamedouble	
pz	TokenNameIdentifier	 pz
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_POINTS_AT_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  AT  Z  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'specularExponent' attribute - default is 1 	TokenNameCOMMENT_LINE	'specularExponent' attribute - default is 1 
double	TokenNamedouble	
specularExponent	TokenNameIdentifier	 specular Exponent
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_SPECULAR_EXPONENT_ATTRIBUTE	TokenNameIdentifier	 SVG  SPECULAR  EXPONENT  ATTRIBUTE
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'limitingConeAngle' attribute - default is 90 	TokenNameCOMMENT_LINE	'limitingConeAngle' attribute - default is 90 
double	TokenNamedouble	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_LIMITING_CONE_ANGLE_ATTRIBUTE	TokenNameIdentifier	 SVG  LIMITING  CONE  ANGLE  ATTRIBUTE
,	TokenNameCOMMA	
90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SpotLight	TokenNameIdentifier	 Spot Light
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
,	TokenNameCOMMA	
px	TokenNameIdentifier	 px
,	TokenNameCOMMA	
py	TokenNameIdentifier	 py
,	TokenNameCOMMA	
pz	TokenNameIdentifier	 pz
,	TokenNameCOMMA	
specularExponent	TokenNameIdentifier	 specular Exponent
,	TokenNameCOMMA	
limitingConeAngle	TokenNameIdentifier	 limiting Cone Angle
,	TokenNameCOMMA	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Bridge class for the &lt;feDistantLight> element. */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;feDistantLight> element. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SVGFeDistantLightElementBridge	TokenNameIdentifier	 SVG Fe Distant Light Element Bridge
extends	TokenNameextends	
AbstractSVGLightElementBridge	TokenNameIdentifier	 Abstract SVG Light Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for a light element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for a light element. 
public	TokenNamepublic	
SVGFeDistantLightElementBridge	TokenNameIdentifier	 SVG Fe Distant Light Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'feDistantLight'. */	TokenNameCOMMENT_JAVADOC	 Returns 'feDistantLight'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FE_DISTANT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  DISTANT  LIGHT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>Light</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param filterElement the lighting filter primitive element * @param lightElement the element describing a light * @param color the color of the light */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>Light</tt> according to the specified parameters. * @param ctx the bridge context to use @param filterElement the lighting filter primitive element @param lightElement the element describing a light @param color the color of the light 
public	TokenNamepublic	
Light	TokenNameIdentifier	 Light
createLight	TokenNameIdentifier	 create Light
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'azimuth' attribute - default is 0 	TokenNameCOMMENT_LINE	'azimuth' attribute - default is 0 
double	TokenNamedouble	
azimuth	TokenNameIdentifier	 azimuth
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_AZIMUTH_ATTRIBUTE	TokenNameIdentifier	 SVG  AZIMUTH  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'elevation' attribute - default is 0 	TokenNameCOMMENT_LINE	'elevation' attribute - default is 0 
double	TokenNamedouble	
elevation	TokenNameIdentifier	 elevation
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_ELEVATION_ATTRIBUTE	TokenNameIdentifier	 SVG  ELEVATION  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
DistantLight	TokenNameIdentifier	 Distant Light
(	TokenNameLPAREN	
azimuth	TokenNameIdentifier	 azimuth
,	TokenNameCOMMA	
elevation	TokenNameIdentifier	 elevation
,	TokenNameCOMMA	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Bridge class for the &lt;fePointLight> element. */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;fePointLight> element. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SVGFePointLightElementBridge	TokenNameIdentifier	 SVG Fe Point Light Element Bridge
extends	TokenNameextends	
AbstractSVGLightElementBridge	TokenNameIdentifier	 Abstract SVG Light Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for a light element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for a light element. 
public	TokenNamepublic	
SVGFePointLightElementBridge	TokenNameIdentifier	 SVG Fe Point Light Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'fePointLight'. */	TokenNameCOMMENT_JAVADOC	 Returns 'fePointLight'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FE_POINT_LIGHT_TAG	TokenNameIdentifier	 SVG  FE  POINT  LIGHT  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>Light</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param filterElement the lighting filter primitive element * @param lightElement the element describing a light * @param color the color of the light */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>Light</tt> according to the specified parameters. * @param ctx the bridge context to use @param filterElement the lighting filter primitive element @param lightElement the element describing a light @param color the color of the light 
public	TokenNamepublic	
Light	TokenNameIdentifier	 Light
createLight	TokenNameIdentifier	 create Light
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'x' attribute - default is 0 	TokenNameCOMMENT_LINE	'x' attribute - default is 0 
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'y' attribute - default is 0 	TokenNameCOMMENT_LINE	'y' attribute - default is 0 
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'z' attribute - default is 0 	TokenNameCOMMENT_LINE	'z' attribute - default is 0 
double	TokenNamedouble	
z	TokenNameIdentifier	 z
=	TokenNameEQUAL	
convertNumber	TokenNameIdentifier	 convert Number
(	TokenNameLPAREN	
lightElement	TokenNameIdentifier	 light Element
,	TokenNameCOMMA	
SVG_Z_ATTRIBUTE	TokenNameIdentifier	 SVG  Z  ATTRIBUTE
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
PointLight	TokenNameIdentifier	 Point Light
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
z	TokenNameIdentifier	 z
,	TokenNameCOMMA	
color	TokenNameIdentifier	 color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
