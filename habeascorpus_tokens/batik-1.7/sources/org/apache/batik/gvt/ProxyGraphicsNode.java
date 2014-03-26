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
/** * A graphics node which provides a placeholder for another graphics node. This * node is self defined except that it delegates to the enclosed (proxied) * graphics node, its paint routine and bounds computation. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: ProxyGraphicsNode.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A graphics node which provides a placeholder for another graphics node. This node is self defined except that it delegates to the enclosed (proxied) graphics node, its paint routine and bounds computation. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: ProxyGraphicsNode.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
extends	TokenNameextends	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
{	TokenNameLBRACE	
/** * The graphics node to proxy. */	TokenNameCOMMENT_JAVADOC	 The graphics node to proxy. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
/** * Constructs a new empty proxy graphics node. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty proxy graphics node. 
public	TokenNamepublic	
ProxyGraphicsNode	TokenNameIdentifier	 Proxy Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Sets the graphics node to proxy to the specified graphics node. * * @param source the graphics node to proxy */	TokenNameCOMMENT_JAVADOC	 Sets the graphics node to proxy to the specified graphics node. * @param source the graphics node to proxy 
public	TokenNamepublic	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the proxied graphics node. */	TokenNameCOMMENT_JAVADOC	 Returns the proxied graphics node. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
source	TokenNameIdentifier	 source
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this node's primitive paint. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node's primitive paint. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of this node's primitivePaint after applying * the input transform (if any), concatenated with this node's * transform (if any). * * @param txf the affine transform with which this node's transform should * be concatenated. Should not be null. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of this node's primitivePaint after applying the input transform (if any), concatenated with this node's transform (if any). * @param txf the affine transform with which this node's transform should be concatenated. Should not be null. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedPrimitiveBounds	TokenNameIdentifier	 get Transformed Primitive Bounds
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
txf	TokenNameIdentifier	 txf
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getTransformedPrimitiveBounds	TokenNameIdentifier	 get Transformed Primitive Bounds
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this node, without * taking any of its rendering attribute into account. That is, * exclusive of any clipping, masking, filtering or stroking, for * example. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node, without taking any of its rendering attribute into account. That is, exclusive of any clipping, masking, filtering or stroking, for example. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the sensitive area covered by this node, * This includes the stroked area but does not include the effects * of clipping, masking or filtering. The returned value is * transformed by the concatenation of the input transform and * this node's transform. * * @param txf the affine transform with which this node's * transform should be concatenated. Should not be null. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the sensitive area covered by this node, This includes the stroked area but does not include the effects of clipping, masking or filtering. The returned value is transformed by the concatenation of the input transform and this node's transform. * @param txf the affine transform with which this node's transform should be concatenated. Should not be null. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedGeometryBounds	TokenNameIdentifier	 get Transformed Geometry Bounds
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
txf	TokenNameIdentifier	 txf
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getTransformedGeometryBounds	TokenNameIdentifier	 get Transformed Geometry Bounds
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
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
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
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
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
