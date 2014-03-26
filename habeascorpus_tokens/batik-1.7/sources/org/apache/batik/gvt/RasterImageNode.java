/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
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
GraphicsUtil	TokenNameIdentifier	 Graphics Util
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
/** * A graphics node that represents a raster image. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @author <a href="mailto:Thomas.DeWeese@Kodak.com">Thomas DeWeese</a> * @version $Id: RasterImageNode.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A graphics node that represents a raster image. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @author <a href="mailto:Thomas.DeWeese@Kodak.com">Thomas DeWeese</a> @version $Id: RasterImageNode.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
RasterImageNode	TokenNameIdentifier	 Raster Image Node
extends	TokenNameextends	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
{	TokenNameLBRACE	
/** * The renderable image that represents this image node. */	TokenNameCOMMENT_JAVADOC	 The renderable image that represents this image node. 
protected	TokenNameprotected	
Filter	TokenNameIdentifier	 Filter
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
/** * Constructs a new empty <tt>RasterImageNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>RasterImageNode</tt>. 
public	TokenNamepublic	
RasterImageNode	TokenNameIdentifier	 Raster Image Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Properties methods 	TokenNameCOMMENT_LINE	Properties methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the raster image of this raster image node. * * @param newImage the new raster image of this raster image node */	TokenNameCOMMENT_JAVADOC	 Sets the raster image of this raster image node. * @param newImage the new raster image of this raster image node 
public	TokenNamepublic	
void	TokenNamevoid	
setImage	TokenNameIdentifier	 set Image
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
newImage	TokenNameIdentifier	 new Image
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireGraphicsNodeChangeStarted	TokenNameIdentifier	 fire Graphics Node Change Started
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
image	TokenNameIdentifier	 image
=	TokenNameEQUAL	
newImage	TokenNameIdentifier	 new Image
;	TokenNameSEMICOLON	
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the raster image of this raster image node. * * @return the raster image of this raster image node */	TokenNameCOMMENT_JAVADOC	 Returns the raster image of this raster image node. * @return the raster image of this raster image node 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getImage	TokenNameIdentifier	 get Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of this raster image node. * * @return the bounds of this raster image node */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of this raster image node. * @return the bounds of this raster image node 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getImageBounds	TokenNameIdentifier	 get Image Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the RenderableImage for this node. The returned * RenderableImage this node before any of the filter operations * have been applied. */	TokenNameCOMMENT_JAVADOC	 Returns the RenderableImage for this node. The returned RenderableImage this node before any of the filter operations have been applied. 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getGraphicsNodeRable	TokenNameIdentifier	 get Graphics Node Rable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Drawing methods 	TokenNameCOMMENT_LINE	Drawing methods 
// 	TokenNameCOMMENT_LINE	 
/** * Paints this node without applying Filter, Mask, Composite and clip. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints this node without applying Filter, Mask, Composite and clip. * @param g2d the Graphics2D to use 
public	TokenNamepublic	
void	TokenNamevoid	
primitivePaint	TokenNameIdentifier	 primitive Paint
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
image	TokenNameIdentifier	 image
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Geometric methods 	TokenNameCOMMENT_LINE	Geometric methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the bounds of the area covered by this node's primitive paint. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node's primitive paint. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this node, without taking any * of its rendering attribute into account. That is, exclusive of any clipping, * masking, filtering or stroking, for example. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node, without taking any of its rendering attribute into account. That is, exclusive of any clipping, masking, filtering or stroking, for example. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the sensitive area covered by this node, * This includes the stroked area but does not include the effects * of clipping, masking or filtering. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the sensitive area covered by this node, This includes the stroked area but does not include the effects of clipping, masking or filtering. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the outline of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the outline of this node. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
image	TokenNameIdentifier	 image
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
