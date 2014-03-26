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
TileRable8Bit	TokenNameIdentifier	 Tile Rable8 Bit
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
/** * Bridge class for the &lt;feTile> element. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGFeTileElementBridge.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;feTile> element. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGFeTileElementBridge.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGFeTileElementBridge	TokenNameIdentifier	 SVG Fe Tile Element Bridge
extends	TokenNameextends	
AbstractSVGFilterPrimitiveElementBridge	TokenNameIdentifier	 Abstract SVG Filter Primitive Element Bridge
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;feTile> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;feTile> element. 
public	TokenNamepublic	
SVGFeTileElementBridge	TokenNameIdentifier	 SVG Fe Tile Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'feTile'. */	TokenNameCOMMENT_JAVADOC	 Returns 'feTile'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FE_TILE_TAG	TokenNameIdentifier	 SVG  FE  TILE  TAG
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
// Get the tiled region. For feTile, the default for the 	TokenNameCOMMENT_LINE	Get the tiled region. For feTile, the default for the 
// filter primitive subregion is the parent filter region. 	TokenNameCOMMENT_LINE	filter primitive subregion is the parent filter region. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
defaultRegion	TokenNameIdentifier	 default Region
=	TokenNameEQUAL	
filterRegion	TokenNameIdentifier	 filter Region
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
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
TileRable8Bit	TokenNameIdentifier	 Tile Rable8 Bit
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
primitiveRegion	TokenNameIdentifier	 primitive Region
,	TokenNameCOMMA	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
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
}	TokenNameRBRACE	
