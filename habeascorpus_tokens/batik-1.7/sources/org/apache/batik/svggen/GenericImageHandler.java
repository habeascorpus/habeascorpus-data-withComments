/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Image	TokenNameIdentifier	 Image
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
RenderedImage	TokenNameIdentifier	 Rendered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
RenderableImage	TokenNameIdentifier	 Renderable Image
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
/** * Extends the default ImageHandler interface with calls to * allow caching of raster images in generated SVG content. * * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> * @version $Id: GenericImageHandler.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Extends the default ImageHandler interface with calls to allow caching of raster images in generated SVG content. * @author <a href="mailto:vincent.hardy@sun.com">Vincent Hardy</a> @version $Id: GenericImageHandler.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
GenericImageHandler	TokenNameIdentifier	 Generic Image Handler
{	TokenNameLBRACE	
/** * Sets the DomTreeManager this image handler may need to * interact with. */	TokenNameCOMMENT_JAVADOC	 Sets the DomTreeManager this image handler may need to interact with. 
void	TokenNamevoid	
setDOMTreeManager	TokenNameIdentifier	 set DOM Tree Manager
(	TokenNameLPAREN	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates an Element suitable for referring to images. * Note that no assumptions can be made about the name of this Element. */	TokenNameCOMMENT_JAVADOC	 Creates an Element suitable for referring to images. Note that no assumptions can be made about the name of this Element. 
Element	TokenNameIdentifier	 Element
createElement	TokenNameIdentifier	 create Element
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The handler should set the xlink:href and return a transform * * @param image the image under consideration * @param imageElement the DOM Element for this image * @param x x coordinate * @param y y coordinate * @param width width for rendering * @param height height for rendering * @param generatorContext the SVGGeneratorContext * * @return transform converting the image dimension to rendered dimension */	TokenNameCOMMENT_JAVADOC	 The handler should set the xlink:href and return a transform * @param image the image under consideration @param imageElement the DOM Element for this image @param x x coordinate @param y y coordinate @param width width for rendering @param height height for rendering @param generatorContext the SVGGeneratorContext * @return transform converting the image dimension to rendered dimension 
AffineTransform	TokenNameIdentifier	 Affine Transform
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
Image	TokenNameIdentifier	 Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The handler should set the xlink:href tag and return a transform * * @param image the image under consideration * @param imageElement the DOM Element for this image * @param x x coordinate * @param y y coordinate * @param width width for rendering * @param height height for rendering * @param generatorContext the SVGGeneratorContext * * @return transform converting the image dimension to rendered dimension */	TokenNameCOMMENT_JAVADOC	 The handler should set the xlink:href tag and return a transform * @param image the image under consideration @param imageElement the DOM Element for this image @param x x coordinate @param y y coordinate @param width width for rendering @param height height for rendering @param generatorContext the SVGGeneratorContext * @return transform converting the image dimension to rendered dimension 
AffineTransform	TokenNameIdentifier	 Affine Transform
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The handler should set the xlink:href tag and return a transform * * @param image the image under consideration * @param imageElement the DOM Element for this image * @param x x coordinate * @param y y coordinate * @param width width for rendering * @param height height for rendering * @param generatorContext the SVGGeneratorContext * * @return transform converting the image dimension to rendered dimension */	TokenNameCOMMENT_JAVADOC	 The handler should set the xlink:href tag and return a transform * @param image the image under consideration @param imageElement the DOM Element for this image @param x x coordinate @param y y coordinate @param width width for rendering @param height height for rendering @param generatorContext the SVGGeneratorContext * @return transform converting the image dimension to rendered dimension 
AffineTransform	TokenNameIdentifier	 Affine Transform
handleImage	TokenNameIdentifier	 handle Image
(	TokenNameLPAREN	
RenderableImage	TokenNameIdentifier	 Renderable Image
image	TokenNameIdentifier	 image
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
imageElement	TokenNameIdentifier	 image Element
,	TokenNameCOMMA	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
double	TokenNamedouble	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
