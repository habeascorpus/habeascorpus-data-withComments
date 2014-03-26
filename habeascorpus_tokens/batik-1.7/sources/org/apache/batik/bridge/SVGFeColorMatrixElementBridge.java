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
Map	TokenNameIdentifier	 Map
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
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
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
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
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
/** * Bridge class for the &lt;feColorMatrix> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGFeColorMatrixElementBridge.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;feColorMatrix> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGFeColorMatrixElementBridge.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFeColorMatrixElementBridge	TokenNameIdentifier	 SVG Fe Color Matrix Element Bridge
extends	TokenNameextends	
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier	 Abstract SVG Filter Primitive Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;feColorMatrix> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;feColorMatrix> element. 
public	TokenNamepublic	
SVGFeColorMatrixElementBridge	TokenNameIdentifier	 SVG Fe Color Matrix Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'feColorMatrix'. */	TokenNameCOMMENT_JAVADOC	 Returns 'feColorMatrix'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FE_COLOR_MATRIX_TAG	TokenNameIdentifier	 SVG  FE  COLOR  MATRIX  TAG
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
// Default region is the size of in (if in is SourceGraphic or 	TokenNameCOMMENT_LINE	Default region is the size of in (if in is SourceGraphic or 
// SourceAlpha it will already include a pad/crop to the 	TokenNameCOMMENT_LINE	SourceAlpha it will already include a pad/crop to the 
// proper filter region size). 	TokenNameCOMMENT_LINE	proper filter region size). 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
defaultRegion	TokenNameIdentifier	 default Region
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
convertType	TokenNameIdentifier	 convert Type
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
colorMatrix	TokenNameIdentifier	 color Matrix
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_HUE_ROTATE	TokenNameIdentifier	 TYPE  HUE  ROTATE
:	TokenNameCOLON	
float	TokenNamefloat	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
convertValuesToHueRotate	TokenNameIdentifier	 convert Values To Hue Rotate
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMatrix	TokenNameIdentifier	 color Matrix
=	TokenNameEQUAL	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
.	TokenNameDOT	
buildHueRotate	TokenNameIdentifier	 build Hue Rotate
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_LUMINANCE_TO_ALPHA	TokenNameIdentifier	 TYPE  LUMINANCE  TO  ALPHA
:	TokenNameCOLON	
colorMatrix	TokenNameIdentifier	 color Matrix
=	TokenNameEQUAL	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
.	TokenNameDOT	
buildLuminanceToAlpha	TokenNameIdentifier	 build Luminance To Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_MATRIX	TokenNameIdentifier	 TYPE  MATRIX
:	TokenNameCOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
convertValuesToMatrix	TokenNameIdentifier	 convert Values To Matrix
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMatrix	TokenNameIdentifier	 color Matrix
=	TokenNameEQUAL	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
.	TokenNameDOT	
buildMatrix	TokenNameIdentifier	 build Matrix
(	TokenNameLPAREN	
matrix	TokenNameIdentifier	 matrix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_SATURATE	TokenNameIdentifier	 TYPE  SATURATE
:	TokenNameCOLON	
float	TokenNamefloat	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
convertValuesToSaturate	TokenNameIdentifier	 convert Values To Saturate
(	TokenNameLPAREN	
filterElement	TokenNameIdentifier	 filter Element
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colorMatrix	TokenNameIdentifier	 color Matrix
=	TokenNameEQUAL	
ColorMatrixRable8Bit	TokenNameIdentifier	 Color Matrix Rable8 Bit
.	TokenNameDOT	
buildSaturate	TokenNameIdentifier	 build Saturate
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"invalid convertType:"	TokenNameStringLiteral	invalid convertType:
+	TokenNamePLUS	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// can't be reached 	TokenNameCOMMENT_LINE	can't be reached 
}	TokenNameRBRACE	
colorMatrix	TokenNameIdentifier	 color Matrix
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// handle the 'color-interpolation-filters' property 	TokenNameCOMMENT_LINE	handle the 'color-interpolation-filters' property 
handleColorInterpolationFilters	TokenNameIdentifier	 handle Color Interpolation Filters
(	TokenNameLPAREN	
colorMatrix	TokenNameIdentifier	 color Matrix
,	TokenNameCOMMA	
filterElement	TokenNameIdentifier	 filter Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
PadRable8Bit	TokenNameIdentifier	 Pad Rable8 Bit
(	TokenNameLPAREN	
colorMatrix	TokenNameIdentifier	 color Matrix
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
/** * Converts the 'values' attribute of the specified feColorMatrix * filter primitive element for the 'matrix' type. * * @param filterElement the filter element * @param ctx the BridgeContext to use for error information */	TokenNameCOMMENT_JAVADOC	 Converts the 'values' attribute of the specified feColorMatrix filter primitive element for the 'matrix' type. * @param filterElement the filter element @param ctx the BridgeContext to use for error information 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
convertValuesToMatrix	TokenNameIdentifier	 convert Values To Matrix
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
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matrix	TokenNameIdentifier	 matrix
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
matrix	TokenNameIdentifier	 matrix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
20	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
/	TokenNameDIVIDE	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
%	TokenNameREMAINDER	
5	TokenNameIntegerLiteral	
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
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
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
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
20	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matrix	TokenNameIdentifier	 matrix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
matrix	TokenNameIdentifier	 matrix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the 'values' attribute of the specified feColorMatrix * filter primitive element for the 'saturate' type. * * @param filterElement the filter element * @param ctx the BridgeContext to use for error information */	TokenNameCOMMENT_JAVADOC	 Converts the 'values' attribute of the specified feColorMatrix filter primitive element for the 'saturate' type. * @param filterElement the filter element @param ctx the BridgeContext to use for error information 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
convertValuesToSaturate	TokenNameIdentifier	 convert Values To Saturate
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
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
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
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// default is 1 	TokenNameCOMMENT_LINE	default is 1 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts the 'values' attribute of the specified feColorMatrix * filter primitive element for the 'hueRotate' type. * * @param filterElement the filter element * @param ctx the BridgeContext to use for error information */	TokenNameCOMMENT_JAVADOC	 Converts the 'values' attribute of the specified feColorMatrix filter primitive element for the 'hueRotate' type. * @param filterElement the filter element @param ctx the BridgeContext to use for error information 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
convertValuesToHueRotate	TokenNameIdentifier	 convert Values To Hue Rotate
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
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
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
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// default is 0 	TokenNameCOMMENT_LINE	default is 0 
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
SVG_VALUES_ATTRIBUTE	TokenNameIdentifier	 SVG  VALUES  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts the type of the specified color matrix filter primitive. * * @param filterElement the filter element * @param ctx the BridgeContext to use for error information */	TokenNameCOMMENT_JAVADOC	 Converts the type of the specified color matrix filter primitive. * @param filterElement the filter element @param ctx the BridgeContext to use for error information 
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
convertType	TokenNameIdentifier	 convert Type
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
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
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
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_MATRIX	TokenNameIdentifier	 TYPE  MATRIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_HUE_ROTATE_VALUE	TokenNameIdentifier	 SVG  HUE  ROTATE  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_HUE_ROTATE	TokenNameIdentifier	 TYPE  HUE  ROTATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_LUMINANCE_TO_ALPHA_VALUE	TokenNameIdentifier	 SVG  LUMINANCE  TO  ALPHA  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_LUMINANCE_TO_ALPHA	TokenNameIdentifier	 TYPE  LUMINANCE  TO  ALPHA
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_MATRIX_VALUE	TokenNameIdentifier	 SVG  MATRIX  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_MATRIX	TokenNameIdentifier	 TYPE  MATRIX
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
SVG_SATURATE_VALUE	TokenNameIdentifier	 SVG  SATURATE  VALUE
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ColorMatrixRable	TokenNameIdentifier	 Color Matrix Rable
.	TokenNameDOT	
TYPE_SATURATE	TokenNameIdentifier	 TYPE  SATURATE
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
SVG_TYPE_ATTRIBUTE	TokenNameIdentifier	 SVG  TYPE  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
