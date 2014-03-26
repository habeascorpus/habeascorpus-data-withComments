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
AffineTransform	TokenNameIdentifier	 Affine Transform
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
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
Mask	TokenNameIdentifier	 Mask
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
MaskRable8Bit	TokenNameIdentifier	 Mask Rable8 Bit
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
/** * Bridge class for the &lt;mask> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGMaskElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;mask> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGMaskElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGMaskElementBridge	TokenNameIdentifier	 SVG Mask Element Bridge
extends	TokenNameextends	
AnimatableGenericSVGBridge	TokenNameIdentifier	 Animatable Generic SVG Bridge
implements	TokenNameimplements	
MaskBridge	TokenNameIdentifier	 Mask Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;mask> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;mask> element. 
public	TokenNamepublic	
SVGMaskElementBridge	TokenNameIdentifier	 SVG Mask Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'mask'. */	TokenNameCOMMENT_JAVADOC	 Returns 'mask'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_MASK_TAG	TokenNameIdentifier	 SVG  MASK  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a <tt>Mask</tt> according to the specified parameters. * * @param ctx the bridge context to use * @param maskElement the element that defines the mask * @param maskedElement the element that references the mask element * @param maskedNode the graphics node to mask */	TokenNameCOMMENT_JAVADOC	 Creates a <tt>Mask</tt> according to the specified parameters. * @param ctx the bridge context to use @param maskElement the element that defines the mask @param maskedElement the element that references the mask element @param maskedNode the graphics node to mask 
public	TokenNamepublic	
Mask	TokenNameIdentifier	 Mask
createMask	TokenNameIdentifier	 create Mask
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
maskElement	TokenNameIdentifier	 mask Element
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
maskedElement	TokenNameIdentifier	 masked Element
,	TokenNameCOMMA	
GraphicsNode	TokenNameIdentifier	 Graphics Node
maskedNode	TokenNameIdentifier	 masked Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
// get mask region using 'maskUnits' 	TokenNameCOMMENT_LINE	get mask region using 'maskUnits' 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
maskRegion	TokenNameIdentifier	 mask Region
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertMaskRegion	TokenNameIdentifier	 convert Mask Region
(	TokenNameLPAREN	
maskElement	TokenNameIdentifier	 mask Element
,	TokenNameCOMMA	
maskedElement	TokenNameIdentifier	 masked Element
,	TokenNameCOMMA	
maskedNode	TokenNameIdentifier	 masked Node
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Build the GVT tree that represents the mask 	TokenNameCOMMENT_LINE	Build the GVT tree that represents the mask 
// 	TokenNameCOMMENT_LINE	 
GVTBuilder	TokenNameIdentifier	 GVT Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getGVTBuilder	TokenNameIdentifier	 get GVT Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
maskNode	TokenNameIdentifier	 mask Node
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
maskNodeContent	TokenNameIdentifier	 mask Node Content
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
maskNode	TokenNameIdentifier	 mask Node
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
maskNodeContent	TokenNameIdentifier	 mask Node Content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasChildren	TokenNameIdentifier	 has Children
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
maskElement	TokenNameIdentifier	 mask Element
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check if the node is a valid Element 	TokenNameCOMMENT_LINE	check if the node is a valid Element 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
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
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hasChildren	TokenNameIdentifier	 has Children
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
maskNodeContent	TokenNameIdentifier	 mask Node Content
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasChildren	TokenNameIdentifier	 has Children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// empty mask 	TokenNameCOMMENT_LINE	empty mask 
}	TokenNameRBRACE	
// 'transform' attribute 	TokenNameCOMMENT_LINE	'transform' attribute 
AffineTransform	TokenNameIdentifier	 Affine Transform
Tx	TokenNameIdentifier	 Tx
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
maskElement	TokenNameIdentifier	 mask Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  TRANSFORM  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tx	TokenNameIdentifier	 Tx
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertTransform	TokenNameIdentifier	 convert Transform
(	TokenNameLPAREN	
maskElement	TokenNameIdentifier	 mask Element
,	TokenNameCOMMA	
SVG_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  TRANSFORM  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Tx	TokenNameIdentifier	 Tx
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 'maskContentUnits' attribute - default is userSpaceOnUse 	TokenNameCOMMENT_LINE	'maskContentUnits' attribute - default is userSpaceOnUse 
short	TokenNameshort	
coordSystemType	TokenNameIdentifier	 coord System Type
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
maskElement	TokenNameIdentifier	 mask Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_MASK_CONTENT_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  MASK  CONTENT  UNITS  ATTRIBUTE
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
coordSystemType	TokenNameIdentifier	 coord System Type
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
USER_SPACE_ON_USE	TokenNameIdentifier	 USER  SPACE  ON  USE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
coordSystemType	TokenNameIdentifier	 coord System Type
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
parseCoordinateSystem	TokenNameIdentifier	 parse Coordinate System
(	TokenNameLPAREN	
maskElement	TokenNameIdentifier	 mask Element
,	TokenNameCOMMA	
SVG_MASK_CONTENT_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  MASK  CONTENT  UNITS  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// additional transform to move to objectBoundingBox coordinate system 	TokenNameCOMMENT_LINE	additional transform to move to objectBoundingBox coordinate system 
if	TokenNameif	
(	TokenNameLPAREN	
coordSystemType	TokenNameIdentifier	 coord System Type
==	TokenNameEQUAL_EQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
OBJECT_BOUNDING_BOX	TokenNameIdentifier	 OBJECT  BOUNDING  BOX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tx	TokenNameIdentifier	 Tx
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
toObjectBBox	TokenNameIdentifier	 to Object B Box
(	TokenNameLPAREN	
Tx	TokenNameIdentifier	 Tx
,	TokenNameCOMMA	
maskedNode	TokenNameIdentifier	 masked Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maskNodeContent	TokenNameIdentifier	 mask Node Content
.	TokenNameDOT	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
Tx	TokenNameIdentifier	 Tx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
maskedNode	TokenNameIdentifier	 masked Node
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make the initial source as a RenderableImage 	TokenNameCOMMENT_LINE	Make the initial source as a RenderableImage 
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
maskedNode	TokenNameIdentifier	 masked Node
.	TokenNameDOT	
getGraphicsNodeRable	TokenNameIdentifier	 get Graphics Node Rable
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MaskRable8Bit	TokenNameIdentifier	 Mask Rable8 Bit
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
maskNode	TokenNameIdentifier	 mask Node
,	TokenNameCOMMA	
maskRegion	TokenNameIdentifier	 mask Region
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
