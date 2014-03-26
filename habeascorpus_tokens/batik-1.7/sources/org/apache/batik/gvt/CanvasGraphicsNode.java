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
Paint	TokenNameIdentifier	 Paint
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
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
;	TokenNameSEMICOLON	
/** * The graphics node container with a background color. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: CanvasGraphicsNode.java 504084 2007-02-06 11:24:46Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The graphics node container with a background color. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: CanvasGraphicsNode.java 504084 2007-02-06 11:24:46Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
CanvasGraphicsNode	TokenNameIdentifier	 Canvas Graphics Node
extends	TokenNameextends	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
{	TokenNameLBRACE	
/** * This is the position transform for this graphics node. * This is needed because getCTM returns the transform * to the viewport coordinate system which is after viewing but * before positioning. */	TokenNameCOMMENT_JAVADOC	 This is the position transform for this graphics node. This is needed because getCTM returns the transform to the viewport coordinate system which is after viewing but before positioning. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
positionTransform	TokenNameIdentifier	 position Transform
;	TokenNameSEMICOLON	
/** * This is the viewing transform for this graphics node. * This is needed because getCTM returns the transform * to the viewport coordinate system which is after viewing but * before positioning. */	TokenNameCOMMENT_JAVADOC	 This is the viewing transform for this graphics node. This is needed because getCTM returns the transform to the viewport coordinate system which is after viewing but before positioning. 
protected	TokenNameprotected	
AffineTransform	TokenNameIdentifier	 Affine Transform
viewingTransform	TokenNameIdentifier	 viewing Transform
;	TokenNameSEMICOLON	
/** * The background of this canvas graphics node. */	TokenNameCOMMENT_JAVADOC	 The background of this canvas graphics node. 
protected	TokenNameprotected	
Paint	TokenNameIdentifier	 Paint
backgroundPaint	TokenNameIdentifier	 background Paint
;	TokenNameSEMICOLON	
/** * Constructs a new empty <tt>CanvasGraphicsNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>CanvasGraphicsNode</tt>. 
public	TokenNamepublic	
CanvasGraphicsNode	TokenNameIdentifier	 Canvas Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Properties methods 	TokenNameCOMMENT_LINE	Properties methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the background paint of this canvas graphics node. * * @param newBackgroundPaint the new background paint */	TokenNameCOMMENT_JAVADOC	 Sets the background paint of this canvas graphics node. * @param newBackgroundPaint the new background paint 
public	TokenNamepublic	
void	TokenNamevoid	
setBackgroundPaint	TokenNameIdentifier	 set Background Paint
(	TokenNameLPAREN	
Paint	TokenNameIdentifier	 Paint
newBackgroundPaint	TokenNameIdentifier	 new Background Paint
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
backgroundPaint	TokenNameIdentifier	 background Paint
=	TokenNameEQUAL	
newBackgroundPaint	TokenNameIdentifier	 new Background Paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the background paint of this canvas graphics node. */	TokenNameCOMMENT_JAVADOC	 Returns the background paint of this canvas graphics node. 
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
getBackgroundPaint	TokenNameIdentifier	 get Background Paint
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
backgroundPaint	TokenNameIdentifier	 background Paint
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPositionTransform	TokenNameIdentifier	 set Position Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
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
positionTransform	TokenNameIdentifier	 position Transform
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
positionTransform	TokenNameIdentifier	 position Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
positionTransform	TokenNameIdentifier	 position Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
viewingTransform	TokenNameIdentifier	 viewing Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
viewingTransform	TokenNameIdentifier	 viewing Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
viewingTransform	TokenNameIdentifier	 viewing Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
viewingTransform	TokenNameIdentifier	 viewing Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getDeterminant	TokenNameIdentifier	 get Determinant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
inverseTransform	TokenNameIdentifier	 inverse Transform
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
createInverse	TokenNameIdentifier	 create Inverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should never happen. 	TokenNameCOMMENT_LINE	Should never happen. 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The transform is not invertible. Use the same 	TokenNameCOMMENT_LINE	The transform is not invertible. Use the same 
// transform. 	TokenNameCOMMENT_LINE	transform. 
inverseTransform	TokenNameIdentifier	 inverse Transform
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getPositionTransform	TokenNameIdentifier	 get Position Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
positionTransform	TokenNameIdentifier	 position Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setViewingTransform	TokenNameIdentifier	 set Viewing Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
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
viewingTransform	TokenNameIdentifier	 viewing Transform
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
positionTransform	TokenNameIdentifier	 position Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
positionTransform	TokenNameIdentifier	 position Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
viewingTransform	TokenNameIdentifier	 viewing Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
viewingTransform	TokenNameIdentifier	 viewing Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
viewingTransform	TokenNameIdentifier	 viewing Transform
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
viewingTransform	TokenNameIdentifier	 viewing Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
getDeterminant	TokenNameIdentifier	 get Determinant
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
inverseTransform	TokenNameIdentifier	 inverse Transform
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
createInverse	TokenNameIdentifier	 create Inverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Should never happen. 	TokenNameCOMMENT_LINE	Should never happen. 
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// The transform is not invertible. Use the same 	TokenNameCOMMENT_LINE	The transform is not invertible. Use the same 
// transform. 	TokenNameCOMMENT_LINE	transform. 
inverseTransform	TokenNameIdentifier	 inverse Transform
=	TokenNameEQUAL	
transform	TokenNameIdentifier	 transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AffineTransform	TokenNameIdentifier	 Affine Transform
getViewingTransform	TokenNameIdentifier	 get Viewing Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
viewingTransform	TokenNameIdentifier	 viewing Transform
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Drawing methods 	TokenNameCOMMENT_LINE	Drawing methods 
// 	TokenNameCOMMENT_LINE	 
/** * Paints this node without applying Filter, Mask, Composite, and clip. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints this node without applying Filter, Mask, Composite, and clip. * @param g2d the Graphics2D to use 
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
backgroundPaint	TokenNameIdentifier	 background Paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
setPaint	TokenNameIdentifier	 set Paint
(	TokenNameLPAREN	
backgroundPaint	TokenNameIdentifier	 background Paint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
getClip	TokenNameIdentifier	 get Clip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fast paint for huge background area 	TokenNameCOMMENT_LINE	Fast paint for huge background area 
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
primitivePaint	TokenNameIdentifier	 primitive Paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
