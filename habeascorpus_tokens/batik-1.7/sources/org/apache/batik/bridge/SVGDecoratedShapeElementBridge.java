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
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
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
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
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
ShapeNode	TokenNameIdentifier	 Shape Node
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
ShapePainter	TokenNameIdentifier	 Shape Painter
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
/** * The base bridge class for decorated shapes. Decorated shapes can be * filled, stroked and can have markers. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGDecoratedShapeElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 The base bridge class for decorated shapes. Decorated shapes can be filled, stroked and can have markers. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGDecoratedShapeElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SVGDecoratedShapeElementBridge	TokenNameIdentifier	 SVG Decorated Shape Element Bridge
extends	TokenNameextends	
SVGShapeElementBridge	TokenNameIdentifier	 SVG Shape Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for SVG decorated shapes. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for SVG decorated shapes. 
protected	TokenNameprotected	
SVGDecoratedShapeElementBridge	TokenNameIdentifier	 SVG Decorated Shape Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
ShapePainter	TokenNameIdentifier	 Shape Painter
createFillStrokePainter	TokenNameIdentifier	 create Fill Stroke Painter
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 'fill' 	TokenNameCOMMENT_LINE	'fill' 
// 'fill-opacity' 	TokenNameCOMMENT_LINE	'fill-opacity' 
// 'stroke' 	TokenNameCOMMENT_LINE	'stroke' 
// 'stroke-opacity', 	TokenNameCOMMENT_LINE	'stroke-opacity', 
// 'stroke-width' 	TokenNameCOMMENT_LINE	'stroke-width' 
// 'stroke-linecap' 	TokenNameCOMMENT_LINE	'stroke-linecap' 
// 'stroke-linejoin' 	TokenNameCOMMENT_LINE	'stroke-linejoin' 
// 'stroke-miterlimit' 	TokenNameCOMMENT_LINE	'stroke-miterlimit' 
// 'stroke-dasharray' 	TokenNameCOMMENT_LINE	'stroke-dasharray' 
// 'stroke-dashoffset' 	TokenNameCOMMENT_LINE	'stroke-dashoffset' 
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
createShapePainter	TokenNameIdentifier	 create Shape Painter
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ShapePainter	TokenNameIdentifier	 Shape Painter
createMarkerPainter	TokenNameIdentifier	 create Marker Painter
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// marker-start 	TokenNameCOMMENT_LINE	marker-start 
// marker-mid 	TokenNameCOMMENT_LINE	marker-mid 
// marker-end 	TokenNameCOMMENT_LINE	marker-end 
return	TokenNamereturn	
PaintServer	TokenNameIdentifier	 Paint Server
.	TokenNameDOT	
convertMarkers	TokenNameIdentifier	 convert Markers
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the shape painter associated to the specified element. * This implementation creates a shape painter considering the * various fill and stroke properties in addition to the marker * properties. * * @param ctx the bridge context to use * @param e the element that describes the shape painter to use * @param shapeNode the shape node that is interested in its shape painter */	TokenNameCOMMENT_JAVADOC	 Creates the shape painter associated to the specified element. This implementation creates a shape painter considering the various fill and stroke properties in addition to the marker properties. * @param ctx the bridge context to use @param e the element that describes the shape painter to use @param shapeNode the shape node that is interested in its shape painter 
protected	TokenNameprotected	
ShapePainter	TokenNameIdentifier	 Shape Painter
createShapePainter	TokenNameIdentifier	 create Shape Painter
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ShapePainter	TokenNameIdentifier	 Shape Painter
fillAndStroke	TokenNameIdentifier	 fill And Stroke
;	TokenNameSEMICOLON	
fillAndStroke	TokenNameIdentifier	 fill And Stroke
=	TokenNameEQUAL	
createFillStrokePainter	TokenNameIdentifier	 create Fill Stroke Painter
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ShapePainter	TokenNameIdentifier	 Shape Painter
markerPainter	TokenNameIdentifier	 marker Painter
=	TokenNameEQUAL	
createMarkerPainter	TokenNameIdentifier	 create Marker Painter
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ShapePainter	TokenNameIdentifier	 Shape Painter
painter	TokenNameIdentifier	 painter
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
markerPainter	TokenNameIdentifier	 marker Painter
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fillAndStroke	TokenNameIdentifier	 fill And Stroke
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
new	TokenNamenew	
CompositeShapePainter	TokenNameIdentifier	 Composite Shape Painter
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
addShapePainter	TokenNameIdentifier	 add Shape Painter
(	TokenNameLPAREN	
fillAndStroke	TokenNameIdentifier	 fill And Stroke
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
.	TokenNameDOT	
addShapePainter	TokenNameIdentifier	 add Shape Painter
(	TokenNameLPAREN	
markerPainter	TokenNameIdentifier	 marker Painter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
painter	TokenNameIdentifier	 painter
=	TokenNameEQUAL	
cp	TokenNameIdentifier	 cp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
painter	TokenNameIdentifier	 painter
=	TokenNameEQUAL	
markerPainter	TokenNameIdentifier	 marker Painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
painter	TokenNameIdentifier	 painter
=	TokenNameEQUAL	
fillAndStroke	TokenNameIdentifier	 fill And Stroke
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
painter	TokenNameIdentifier	 painter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
handleCSSPropertyChanged	TokenNameIdentifier	 handle CSS Property Changed
(	TokenNameLPAREN	
int	TokenNameint	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
MARKER_START_INDEX	TokenNameIdentifier	 MARKER  START  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
MARKER_MID_INDEX	TokenNameIdentifier	 MARKER  MID  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
MARKER_END_INDEX	TokenNameIdentifier	 MARKER  END  INDEX
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasNewShapePainter	TokenNameIdentifier	 has New Shape Painter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasNewShapePainter	TokenNameIdentifier	 has New Shape Painter
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
ShapeNode	TokenNameIdentifier	 Shape Node
shapeNode	TokenNameIdentifier	 shape Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ShapeNode	TokenNameIdentifier	 Shape Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
shapeNode	TokenNameIdentifier	 shape Node
.	TokenNameDOT	
setShapePainter	TokenNameIdentifier	 set Shape Painter
(	TokenNameLPAREN	
createShapePainter	TokenNameIdentifier	 create Shape Painter
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
shapeNode	TokenNameIdentifier	 shape Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
super	TokenNamesuper	
.	TokenNameDOT	
handleCSSPropertyChanged	TokenNameIdentifier	 handle CSS Property Changed
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
