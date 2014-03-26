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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Point2D	TokenNameIdentifier	 Point2 D
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
/** * A graphics node that represents an image described as a graphics node. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: ImageNode.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 A graphics node that represents an image described as a graphics node. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: ImageNode.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ImageNode	TokenNameIdentifier	 Image Node
extends	TokenNameextends	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
{	TokenNameLBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
hitCheckChildren	TokenNameIdentifier	 hit Check Children
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Constructs a new empty <tt>ImageNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>ImageNode</tt>. 
public	TokenNamepublic	
ImageNode	TokenNameIdentifier	 Image Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isVisible	TokenNameIdentifier	 is Visible
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireGraphicsNodeChangeStarted	TokenNameIdentifier	 fire Graphics Node Change Started
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
isVisible	TokenNameIdentifier	 is Visible
=	TokenNameEQUAL	
isVisible	TokenNameIdentifier	 is Visible
;	TokenNameSEMICOLON	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isVisible	TokenNameIdentifier	 is Visible
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If hitCheckChildren is true then nodeHitAt will return * child nodes of this image. Otherwise it will only * return this node (if the point is in the image). */	TokenNameCOMMENT_JAVADOC	 If hitCheckChildren is true then nodeHitAt will return child nodes of this image. Otherwise it will only return this node (if the point is in the image). 
public	TokenNamepublic	
void	TokenNamevoid	
setHitCheckChildren	TokenNameIdentifier	 set Hit Check Children
(	TokenNameLPAREN	
boolean	TokenNameboolean	
hitCheckChildren	TokenNameIdentifier	 hit Check Children
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hitCheckChildren	TokenNameIdentifier	 hit Check Children
=	TokenNameEQUAL	
hitCheckChildren	TokenNameIdentifier	 hit Check Children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
getHitCheckChildren	TokenNameIdentifier	 get Hit Check Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hitCheckChildren	TokenNameIdentifier	 hit Check Children
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Paints this node. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints this node. * @param g2d the Graphics2D to use 
public	TokenNamepublic	
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isVisible	TokenNameIdentifier	 is Visible
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if the specified Point2D is inside the boundary of this * node, false otherwise. * * @param p the specified Point2D in the user space */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified Point2D is inside the boundary of this node, false otherwise. * @param p the specified Point2D in the user space 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
pointerEventType	TokenNameIdentifier	 pointer Event Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
VISIBLE_PAINTED	TokenNameIdentifier	 VISIBLE  PAINTED
:	TokenNameCOLON	
case	TokenNamecase	
VISIBLE_FILL	TokenNameIdentifier	 VISIBLE  FILL
:	TokenNameCOLON	
case	TokenNamecase	
VISIBLE_STROKE	TokenNameIdentifier	 VISIBLE  STROKE
:	TokenNameCOLON	
case	TokenNamecase	
VISIBLE	TokenNameIdentifier	 VISIBLE
:	TokenNameCOLON	
return	TokenNamereturn	
isVisible	TokenNameIdentifier	 is Visible
&&	TokenNameAND_AND	
super	TokenNamesuper	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PAINTED	TokenNameIdentifier	 PAINTED
:	TokenNameCOLON	
case	TokenNamecase	
FILL	TokenNameIdentifier	 FILL
:	TokenNameCOLON	
case	TokenNamecase	
STROKE	TokenNameIdentifier	 STROKE
:	TokenNameCOLON	
case	TokenNamecase	
ALL	TokenNameIdentifier	 ALL
:	TokenNameCOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
NONE	TokenNameIdentifier	 NONE
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the GraphicsNode containing point p if this node or one of its * children is sensitive to mouse events at p. * * @param p the specified Point2D in the user space */	TokenNameCOMMENT_JAVADOC	 Returns the GraphicsNode containing point p if this node or one of its children is sensitive to mouse events at p. * @param p the specified Point2D in the user space 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
nodeHitAt	TokenNameIdentifier	 node Hit At
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hitCheckChildren	TokenNameIdentifier	 hit Check Children
)	TokenNameRPAREN	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
nodeHitAt	TokenNameIdentifier	 node Hit At
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Properties methods 	TokenNameCOMMENT_LINE	Properties methods 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the graphics node that represents the image. * * @param newImage the new graphics node that represents the image */	TokenNameCOMMENT_JAVADOC	 Sets the graphics node that represents the image. * @param newImage the new graphics node that represents the image 
public	TokenNamepublic	
void	TokenNamevoid	
setImage	TokenNameIdentifier	 set Image
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
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
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newImage	TokenNameIdentifier	 new Image
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
newImage	TokenNameIdentifier	 new Image
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
newImage	TokenNameIdentifier	 new Image
)	TokenNameRPAREN	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the graphics node that represents the image. */	TokenNameCOMMENT_JAVADOC	 Returns the graphics node that represents the image. 
public	TokenNamepublic	
GraphicsNode	TokenNameIdentifier	 Graphics Node
getImage	TokenNameIdentifier	 get Image
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
