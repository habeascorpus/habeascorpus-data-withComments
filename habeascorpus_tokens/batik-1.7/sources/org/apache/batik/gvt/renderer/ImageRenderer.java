/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
renderer	TokenNameIdentifier	 renderer
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
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
RenderingHints	TokenNameIdentifier	 Rendering Hints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
BufferedImage	TokenNameIdentifier	 Buffered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
/** * Interface for GVT Renderers that render into raster images. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: ImageRenderer.java 504760 2007-02-08 01:40:53Z deweese $ */	TokenNameCOMMENT_JAVADOC	 Interface for GVT Renderers that render into raster images. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: ImageRenderer.java 504760 2007-02-08 01:40:53Z deweese $ 
public	TokenNamepublic	
interface	TokenNameinterface	
ImageRenderer	TokenNameIdentifier	 Image Renderer
extends	TokenNameextends	
Renderer	TokenNameIdentifier	 Renderer
{	TokenNameLBRACE	
/** * release resources associated with this object. */	TokenNameCOMMENT_JAVADOC	 release resources associated with this object. 
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Update the required size of the offscreen buffer. */	TokenNameCOMMENT_JAVADOC	 Update the required size of the offscreen buffer. 
void	TokenNamevoid	
updateOffScreen	TokenNameIdentifier	 update Off Screen
(	TokenNameLPAREN	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
int	TokenNameint	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the transform from the current user space (as defined by * the top node of the GVT tree, to the associated device space. * * @param usr2dev the new user space to device space transform. If null, * the identity transform will be set. */	TokenNameCOMMENT_JAVADOC	 Sets the transform from the current user space (as defined by the top node of the GVT tree, to the associated device space. * @param usr2dev the new user space to device space transform. If null, the identity transform will be set. 
void	TokenNamevoid	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
usr2dev	TokenNameIdentifier	 usr2dev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the transform from the current user space (as defined * by the top node of the GVT tree) to the device space. */	TokenNameCOMMENT_JAVADOC	 Returns the transform from the current user space (as defined by the top node of the GVT tree) to the device space. 
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the specified rendering hints to be used for future renderings. * This replaces current set of rendering hints. * @param rh the rendering hints to use */	TokenNameCOMMENT_JAVADOC	 Sets the specified rendering hints to be used for future renderings. This replaces current set of rendering hints. @param rh the rendering hints to use 
void	TokenNamevoid	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the rendering hints this ImageRenderer is using for its * rendering. * @return the rendering hints being used */	TokenNameCOMMENT_JAVADOC	 Returns the rendering hints this ImageRenderer is using for its rendering. @return the rendering hints being used 
RenderingHints	TokenNameIdentifier	 Rendering Hints
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the Current offscreen buffer used for rendering */	TokenNameCOMMENT_JAVADOC	 Get the Current offscreen buffer used for rendering 
BufferedImage	TokenNameIdentifier	 Buffered Image
getOffScreen	TokenNameIdentifier	 get Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tells renderer to clear current contents of offscreen buffer */	TokenNameCOMMENT_JAVADOC	 Tells renderer to clear current contents of offscreen buffer 
void	TokenNamevoid	
clearOffScreen	TokenNameIdentifier	 clear Off Screen
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Flush any cached image data (preliminary interface). */	TokenNameCOMMENT_JAVADOC	 Flush any cached image data (preliminary interface). 
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Flush a rectangle of cached image data (preliminary interface). */	TokenNameCOMMENT_JAVADOC	 Flush a rectangle of cached image data (preliminary interface). 
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Flush a list of rectangles of cached image data (preliminary * interface). Each area are transformed via the usr2dev's renderer * transform before the flush(Rectangle) is called. */	TokenNameCOMMENT_JAVADOC	 Flush a list of rectangles of cached image data (preliminary interface). Each area are transformed via the usr2dev's renderer transform before the flush(Rectangle) is called. 
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
areas	TokenNameIdentifier	 areas
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
