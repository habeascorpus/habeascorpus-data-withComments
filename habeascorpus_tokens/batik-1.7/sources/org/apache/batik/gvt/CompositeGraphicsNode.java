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
Rectangle	TokenNameIdentifier	 Rectangle
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
GeneralPath	TokenNameIdentifier	 General Path
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ConcurrentModificationException	TokenNameIdentifier	 Concurrent Modification Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HaltingThread	TokenNameIdentifier	 Halting Thread
;	TokenNameSEMICOLON	
/** * A CompositeGraphicsNode is a graphics node that can contain graphics nodes. * * <br>Note: this class is a 'little bit aware of' other threads, but not really threadsafe. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @version $Id: CompositeGraphicsNode.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 A CompositeGraphicsNode is a graphics node that can contain graphics nodes. * <br>Note: this class is a 'little bit aware of' other threads, but not really threadsafe. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @version $Id: CompositeGraphicsNode.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
extends	TokenNameextends	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
implements	TokenNameimplements	
List	TokenNameIdentifier	 List
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
VIEWPORT	TokenNameIdentifier	 VIEWPORT
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
NULL_RECT	TokenNameIdentifier	 NULL  RECT
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The children of this composite graphics node. */	TokenNameCOMMENT_JAVADOC	 The children of this composite graphics node. 
protected	TokenNameprotected	
GraphicsNode	TokenNameIdentifier	 Graphics Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
/** * The number of children of this composite graphics node. */	TokenNameCOMMENT_JAVADOC	 The number of children of this composite graphics node. 
protected	TokenNameprotected	
volatile	TokenNamevolatile	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * The number of times the children list has been structurally modified. */	TokenNameCOMMENT_JAVADOC	 The number of times the children list has been structurally modified. 
protected	TokenNameprotected	
volatile	TokenNamevolatile	
int	TokenNameint	
modCount	TokenNameIdentifier	 mod Count
;	TokenNameSEMICOLON	
/** * This flag indicates if this node has BackgroundEnable = 'new'. * If so traversal of the gvt tree can halt here. */	TokenNameCOMMENT_JAVADOC	 This flag indicates if this node has BackgroundEnable = 'new'. If so traversal of the gvt tree can halt here. 
protected	TokenNameprotected	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
backgroundEnableRgn	TokenNameIdentifier	 background Enable Rgn
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Internal Cache: Geometry bounds for this node, not taking into * account any of its children rendering attributes into account */	TokenNameCOMMENT_JAVADOC	 Internal Cache: Geometry bounds for this node, not taking into account any of its children rendering attributes into account 
private	TokenNameprivate	
volatile	TokenNamevolatile	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
geometryBounds	TokenNameIdentifier	 geometry Bounds
;	TokenNameSEMICOLON	
/** * Internal Cache: Primitive bounds. */	TokenNameCOMMENT_JAVADOC	 Internal Cache: Primitive bounds. 
private	TokenNameprivate	
volatile	TokenNamevolatile	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
primitiveBounds	TokenNameIdentifier	 primitive Bounds
;	TokenNameSEMICOLON	
/** * Internal Cache: Sensitive bounds. */	TokenNameCOMMENT_JAVADOC	 Internal Cache: Sensitive bounds. 
private	TokenNameprivate	
volatile	TokenNamevolatile	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
;	TokenNameSEMICOLON	
/** * Internal Cache: the outline. */	TokenNameCOMMENT_JAVADOC	 Internal Cache: the outline. 
private	TokenNameprivate	
Shape	TokenNameIdentifier	 Shape
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
/** * Constructs a new empty <tt>CompositeGraphicsNode</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new empty <tt>CompositeGraphicsNode</tt>. 
public	TokenNamepublic	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Structural methods 	TokenNameCOMMENT_LINE	Structural methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the list of children. */	TokenNameCOMMENT_JAVADOC	 Returns the list of children. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the enable background property to the specified rectangle. * * @param bgRgn the region that defines the background enable property */	TokenNameCOMMENT_JAVADOC	 Sets the enable background property to the specified rectangle. * @param bgRgn the region that defines the background enable property 
public	TokenNamepublic	
void	TokenNamevoid	
setBackgroundEnable	TokenNameIdentifier	 set Background Enable
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bgRgn	TokenNameIdentifier	 bg Rgn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
backgroundEnableRgn	TokenNameIdentifier	 background Enable Rgn
=	TokenNameEQUAL	
bgRgn	TokenNameIdentifier	 bg Rgn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the region defining the background enable property. */	TokenNameCOMMENT_JAVADOC	 Returns the region defining the background enable property. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBackgroundEnable	TokenNameIdentifier	 get Background Enable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
backgroundEnableRgn	TokenNameIdentifier	 background Enable Rgn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets if this node is visible or not depending on the specified value. * Don't fire a graphicsNodeChange event because this doesn't really * effect us (it effects our children through CSS inheritence). * * @param isVisible If true this node is visible */	TokenNameCOMMENT_JAVADOC	 Sets if this node is visible or not depending on the specified value. Don't fire a graphicsNodeChange event because this doesn't really effect us (it effects our children through CSS inheritence). * @param isVisible If true this node is visible 
public	TokenNamepublic	
void	TokenNamevoid	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isVisible	TokenNameIdentifier	 is Visible
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fireGraphicsNodeChangeStarted(); 	TokenNameCOMMENT_LINE	fireGraphicsNodeChangeStarted(); 
this	TokenNamethis	
.	TokenNameDOT	
isVisible	TokenNameIdentifier	 is Visible
=	TokenNameEQUAL	
isVisible	TokenNameIdentifier	 is Visible
;	TokenNameSEMICOLON	
// fireGraphicsNodeChangeCompleted(); 	TokenNameCOMMENT_LINE	fireGraphicsNodeChangeCompleted(); 
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
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Thread.currentThread() is potentially expensive, so reuse my instance in hasBeenHalted() 	TokenNameCOMMENT_LINE	Thread.currentThread() is potentially expensive, so reuse my instance in hasBeenHalted() 
Thread	TokenNameIdentifier	 Thread
currentThread	TokenNameIdentifier	 current Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Paint children 	TokenNameCOMMENT_LINE	Paint children 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Event support methods 	TokenNameCOMMENT_LINE	Event support methods 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// Geometric methods 	TokenNameCOMMENT_LINE	Geometric methods 
// 	TokenNameCOMMENT_LINE	 
/** * Invalidates the cached geometric bounds. This method is called * each time an attribute that affects the bounds of this node * changed. */	TokenNameCOMMENT_JAVADOC	 Invalidates the cached geometric bounds. This method is called each time an attribute that affects the bounds of this node changed. 
protected	TokenNameprotected	
void	TokenNamevoid	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
geometryBounds	TokenNameIdentifier	 geometry Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
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
primitiveBounds	TokenNameIdentifier	 primitive Bounds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
==	TokenNameEQUAL_EQUAL	
NULL_RECT	TokenNameIdentifier	 NULL  RECT
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Thread.currentThread() is potentially expensive, so reuse my instance in hasBeenHalted() 	TokenNameCOMMENT_LINE	Thread.currentThread() is potentially expensive, so reuse my instance in hasBeenHalted() 
Thread	TokenNameIdentifier	 Thread
currentThread	TokenNameIdentifier	 current Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedBounds	TokenNameIdentifier	 get Transformed Bounds
(	TokenNameLPAREN	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x0F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// check every 16 children if we have been interrupted. 	TokenNameCOMMENT_LINE	check every 16 children if we have been interrupted. 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
=	TokenNameEQUAL	
NULL_RECT	TokenNameIdentifier	 NULL  RECT
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
ctb	TokenNameIdentifier	 ctb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedBounds	TokenNameIdentifier	 get Transformed Bounds
(	TokenNameLPAREN	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ctb	TokenNameIdentifier	 ctb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// another thread has set the primitive bounds to null, 	TokenNameCOMMENT_LINE	another thread has set the primitive bounds to null, 
// need to recall this function 	TokenNameCOMMENT_LINE	need to recall this function 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ctb	TokenNameIdentifier	 ctb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0x0F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// check every 16 children if we have been interrupted. 	TokenNameCOMMENT_LINE	check every 16 children if we have been interrupted. 
}	TokenNameRBRACE	
// Check If we should halt early. 	TokenNameCOMMENT_LINE	Check If we should halt early. 
if	TokenNameif	
(	TokenNameLPAREN	
HaltingThread	TokenNameIdentifier	 Halting Thread
.	TokenNameDOT	
hasBeenHalted	TokenNameIdentifier	 has Been Halted
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The Thread has been halted. 	TokenNameCOMMENT_LINE	The Thread has been halted. 
// Invalidate any cached values and proceed. 	TokenNameCOMMENT_LINE	Invalidate any cached values and proceed. 
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
primitiveBounds	TokenNameIdentifier	 primitive Bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Transforms a Rectangle 2D by an affine transform. It assumes the transform * is only scale/translate so there is no loss of precision over transforming * the source geometry. */	TokenNameCOMMENT_JAVADOC	 Transforms a Rectangle 2D by an affine transform. It assumes the transform is only scale/translate so there is no loss of precision over transforming the source geometry. 
public	TokenNamepublic	
static	TokenNamestatic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedBBox	TokenNameIdentifier	 get Transformed B Box
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r2d	TokenNameIdentifier	 r2d
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
r2d	TokenNameIdentifier	 r2d
;	TokenNameSEMICOLON	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sx	TokenNameIdentifier	 sx
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sx	TokenNameIdentifier	 sx
=	TokenNameEQUAL	
-	TokenNameMINUS	
sx	TokenNameIdentifier	 sx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sy	TokenNameIdentifier	 sy
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sy	TokenNameIdentifier	 sy
=	TokenNameEQUAL	
-	TokenNameMINUS	
sy	TokenNameIdentifier	 sy
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
sx	TokenNameIdentifier	 sx
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
sy	TokenNameIdentifier	 sy
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
sx	TokenNameIdentifier	 sx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
*	TokenNameMULTIPLY	
sy	TokenNameIdentifier	 sy
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No rotation it's safe to simply transform our bounding box. 	TokenNameCOMMENT_LINE	No rotation it's safe to simply transform our bounding box. 
return	TokenNamereturn	
getTransformedBBox	TokenNameIdentifier	 get Transformed B Box
(	TokenNameLPAREN	
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
tpb	TokenNameIdentifier	 tpb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tpb	TokenNameIdentifier	 tpb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tpb	TokenNameIdentifier	 tpb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedBounds	TokenNameIdentifier	 get Transformed Bounds
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
ctb	TokenNameIdentifier	 ctb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedBounds	TokenNameIdentifier	 get Transformed Bounds
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ctb	TokenNameIdentifier	 ctb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tpb	TokenNameIdentifier	 tpb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ctb	TokenNameIdentifier	 ctb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
tpb	TokenNameIdentifier	 tpb
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this node, without * taking any of its rendering attributes into account. That is, * exclusive of any clipping, masking, filtering or stroking, for * example. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node, without taking any of its rendering attributes into account. That is, exclusive of any clipping, masking, filtering or stroking, for example. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
geometryBounds	TokenNameIdentifier	 geometry Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("geometryBounds are null"); 	TokenNameCOMMENT_LINE	System.err.println("geometryBounds are null"); 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
geometryBounds	TokenNameIdentifier	 geometry Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
geometryBounds	TokenNameIdentifier	 geometry Bounds
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedGeometryBounds	TokenNameIdentifier	 get Transformed Geometry Bounds
(	TokenNameLPAREN	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
cgb	TokenNameIdentifier	 cgb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedGeometryBounds	TokenNameIdentifier	 get Transformed Geometry Bounds
(	TokenNameLPAREN	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cgb	TokenNameIdentifier	 cgb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
geometryBounds	TokenNameIdentifier	 geometry Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// another thread has set the geometry bounds to null, 	TokenNameCOMMENT_LINE	another thread has set the geometry bounds to null, 
// need to recall this function 	TokenNameCOMMENT_LINE	need to recall this function 
return	TokenNamereturn	
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
geometryBounds	TokenNameIdentifier	 geometry Bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cgb	TokenNameIdentifier	 cgb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
geometryBounds	TokenNameIdentifier	 geometry Bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the area covered by this node, without taking any * of its rendering attribute into accoun. That is, exclusive of any clipping, * masking, filtering or stroking, for example. The returned value is * transformed by the concatenation of the input transform and this node's * transform. * * @param txf the affine transform with which this node's transform should * be concatenated. Should not be null. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node, without taking any of its rendering attribute into accoun. That is, exclusive of any clipping, masking, filtering or stroking, for example. The returned value is transformed by the concatenation of the input transform and this node's transform. * @param txf the affine transform with which this node's transform should be concatenated. Should not be null. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedGeometryBounds	TokenNameIdentifier	 get Transformed Geometry Bounds
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No rotation it's safe to simply transform our bounding box. 	TokenNameCOMMENT_LINE	No rotation it's safe to simply transform our bounding box. 
return	TokenNamereturn	
getTransformedBBox	TokenNameIdentifier	 get Transformed B Box
(	TokenNameLPAREN	
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
gb	TokenNameIdentifier	 gb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
gb	TokenNameIdentifier	 gb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gb	TokenNameIdentifier	 gb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedGeometryBounds	TokenNameIdentifier	 get Transformed Geometry Bounds
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
cgb	TokenNameIdentifier	 cgb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cgb	TokenNameIdentifier	 cgb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedGeometryBounds	TokenNameIdentifier	 get Transformed Geometry Bounds
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cgb	TokenNameIdentifier	 cgb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gb	TokenNameIdentifier	 gb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cgb	TokenNameIdentifier	 cgb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
gb	TokenNameIdentifier	 gb
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
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
;	TokenNameSEMICOLON	
// System.out.println("sensitiveBoundsBounds are null"); 	TokenNameCOMMENT_LINE	System.out.println("sensitiveBoundsBounds are null"); 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedSensitiveBounds	TokenNameIdentifier	 get Transformed Sensitive Bounds
(	TokenNameLPAREN	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
cgb	TokenNameIdentifier	 cgb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedSensitiveBounds	TokenNameIdentifier	 get Transformed Sensitive Bounds
(	TokenNameLPAREN	
IDENTITY	TokenNameIdentifier	 IDENTITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cgb	TokenNameIdentifier	 cgb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// another thread has set the geometry bounds to null, 	TokenNameCOMMENT_LINE	another thread has set the geometry bounds to null, 
// need to recall this function 	TokenNameCOMMENT_LINE	need to recall this function 
return	TokenNamereturn	
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cgb	TokenNameIdentifier	 cgb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sensitiveBounds	TokenNameIdentifier	 sensitive Bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the sensitive area covered by this node, * This includes the stroked area but does not include the effects * of clipping, masking or filtering. The returned value is * transformed by the concatenation of the input transform and * this node's transform. * * @param txf the affine transform with which this node's * transform should be concatenated. Should not be null. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the sensitive area covered by this node, This includes the stroked area but does not include the effects of clipping, masking or filtering. The returned value is transformed by the concatenation of the input transform and this node's transform. * @param txf the affine transform with which this node's transform should be concatenated. Should not be null. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedSensitiveBounds	TokenNameIdentifier	 get Transformed Sensitive Bounds
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No rotation it's safe to simply transform our bounding box. 	TokenNameCOMMENT_LINE	No rotation it's safe to simply transform our bounding box. 
return	TokenNamereturn	
getTransformedBBox	TokenNameIdentifier	 get Transformed B Box
(	TokenNameLPAREN	
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedSensitiveBounds	TokenNameIdentifier	 get Transformed Sensitive Bounds
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
csb	TokenNameIdentifier	 csb
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransformedSensitiveBounds	TokenNameIdentifier	 get Transformed Sensitive Bounds
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
csb	TokenNameIdentifier	 csb
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
csb	TokenNameIdentifier	 csb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
;	TokenNameSEMICOLON	
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
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bounds	TokenNameIdentifier	 bounds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Propagated to children 	TokenNameCOMMENT_LINE	Propagated to children 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getInverseTransform	TokenNameIdentifier	 get Inverse Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
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
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
bounds	TokenNameIdentifier	 bounds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Go backward because the children are in rendering order 	TokenNameCOMMENT_LINE	Go backward because the children are in rendering order 
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Propagated to children 	TokenNameCOMMENT_LINE	Propagated to children 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getInverseTransform	TokenNameIdentifier	 get Inverse Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
pt	TokenNameIdentifier	 pt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
pt	TokenNameIdentifier	 pt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cp	TokenNameIdentifier	 cp
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
nodeHitAt	TokenNameIdentifier	 node Hit At
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
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
outline	TokenNameIdentifier	 outline
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
childOutline	TokenNameIdentifier	 child Outline
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childOutline	TokenNameIdentifier	 child Outline
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GeneralPath	TokenNameIdentifier	 General Path
)	TokenNameRPAREN	
outline	TokenNameIdentifier	 outline
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
childOutline	TokenNameIdentifier	 child Outline
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GeneralPath	TokenNameIdentifier	 General Path
)	TokenNameRPAREN	
outline	TokenNameIdentifier	 outline
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
childOutline	TokenNameIdentifier	 child Outline
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Structural info 	TokenNameCOMMENT_LINE	Structural info 
// 	TokenNameCOMMENT_LINE	 
/** * Sets the root node of this grahics node and modify all its children. */	TokenNameCOMMENT_JAVADOC	 Sets the root node of this grahics node and modify all its children. 
protected	TokenNameprotected	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
newRoot	TokenNameIdentifier	 new Root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
newRoot	TokenNameIdentifier	 new Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
newRoot	TokenNameIdentifier	 new Root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// List implementation 	TokenNameCOMMENT_LINE	List implementation 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the number of children of this composite graphics node. */	TokenNameCOMMENT_JAVADOC	 Returns the number of children of this composite graphics node. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this composite graphics node does not contain * graphics node, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if this composite graphics node does not contain graphics node, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this composite graphics node contains the * specified graphics node, false otherwise. * @param node the node to check */	TokenNameCOMMENT_JAVADOC	 Returns true if this composite graphics node contains the specified graphics node, false otherwise. @param node the node to check 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an iterator over the children of this graphics node. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the children of this graphics node. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Itr	TokenNameIdentifier	 Itr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array containing all of the graphics node in the children list * of this composite graphics node in the correct order. */	TokenNameCOMMENT_JAVADOC	 Returns an array containing all of the graphics node in the children list of this composite graphics node in the correct order. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
GraphicsNode	TokenNameIdentifier	 Graphics Node
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an array containing all of the graphics node in the * children list of this composite graphics node in the correct * order. If the children list fits in the specified array, it is * returned therein. Otherwise, a new array is allocated. * * @param a the array to fit if possible */	TokenNameCOMMENT_JAVADOC	 Returns an array containing all of the graphics node in the children list of this composite graphics node in the correct order. If the children list fits in the specified array, it is returned therein. Otherwise, a new array is allocated. * @param a the array to fit if possible 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
GraphicsNode	TokenNameIdentifier	 Graphics Node
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the graphics node at the specified position in the children list. * * @param index the index of the graphics node to return * @exception IndexOutOfBoundsException if the index is out of range */	TokenNameCOMMENT_JAVADOC	 Returns the graphics node at the specified position in the children list. * @param index the index of the graphics node to return @exception IndexOutOfBoundsException if the index is out of range 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkRange	TokenNameIdentifier	 check Range
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Modification Operations 	TokenNameCOMMENT_LINE	Modification Operations 
/** * Replaces the graphics node at the specified position in the children list * with the specified graphics node. * * @param index the index of the graphics node to replace * @param o the graphics node to be stored at the specified position * @return the graphics node previously at the specified position * @exception IndexOutOfBoundsException if the index is out of range * @exception IllegalArgumentException if the node is not an * instance of GraphicsNode */	TokenNameCOMMENT_JAVADOC	 Replaces the graphics node at the specified position in the children list with the specified graphics node. * @param index the index of the graphics node to replace @param o the graphics node to be stored at the specified position @return the graphics node previously at the specified position @exception IndexOutOfBoundsException if the index is out of range @exception IllegalArgumentException if the node is not an instance of GraphicsNode 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check for correct arguments 	TokenNameCOMMENT_LINE	Check for correct arguments 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
" is not a GraphicsNode"	TokenNameStringLiteral	 is not a GraphicsNode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkRange	TokenNameIdentifier	 check Range
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
fireGraphicsNodeChangeStarted	TokenNameIdentifier	 fire Graphics Node Change Started
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reparent the graphics node and tidy up the tree's state 	TokenNameCOMMENT_LINE	Reparent the graphics node and tidy up the tree's state 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Replace the node to the children list 	TokenNameCOMMENT_LINE	Replace the node to the children list 
GraphicsNode	TokenNameIdentifier	 Graphics Node
oldNode	TokenNameIdentifier	 old Node
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// Set the parents of the graphics nodes 	TokenNameCOMMENT_LINE	Set the parents of the graphics nodes 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
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
oldNode	TokenNameIdentifier	 old Node
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the root of the graphics node 	TokenNameCOMMENT_LINE	Set the root of the graphics node 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
oldNode	TokenNameIdentifier	 old Node
)	TokenNameRPAREN	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Invalidates cached values 	TokenNameCOMMENT_LINE	Invalidates cached values 
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create and dispatch events 	TokenNameCOMMENT_LINE	Create and dispatch events 
// int id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_REMOVED; 	TokenNameCOMMENT_LINE	int id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_REMOVED; 
// dispatchEvent(new CompositeGraphicsNodeEvent(this, id, oldNode)); 	TokenNameCOMMENT_LINE	dispatchEvent(new CompositeGraphicsNodeEvent(this, id, oldNode)); 
// id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_ADDED; 	TokenNameCOMMENT_LINE	id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_ADDED; 
// dispatchEvent(new CompositeGraphicsNodeEvent(this, id, node)); 	TokenNameCOMMENT_LINE	dispatchEvent(new CompositeGraphicsNodeEvent(this, id, node)); 
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldNode	TokenNameIdentifier	 old Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the specified graphics node to this composite graphics node. * * @param o the graphics node to add * @return true (as per the general contract of Collection.add) * @exception IllegalArgumentException if the node is not an * instance of GraphicsNode */	TokenNameCOMMENT_JAVADOC	 Adds the specified graphics node to this composite graphics node. * @param o the graphics node to add @return true (as per the general contract of Collection.add) @exception IllegalArgumentException if the node is not an instance of GraphicsNode 
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check for correct argument 	TokenNameCOMMENT_LINE	Check for correct argument 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
" is not a GraphicsNode"	TokenNameStringLiteral	 is not a GraphicsNode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
fireGraphicsNodeChangeStarted	TokenNameIdentifier	 fire Graphics Node Change Started
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reparent the graphics node and tidy up the tree's state 	TokenNameCOMMENT_LINE	Reparent the graphics node and tidy up the tree's state 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add the graphics node to the children list 	TokenNameCOMMENT_LINE	Add the graphics node to the children list 
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Increments modCount!! 	TokenNameCOMMENT_LINE	Increments modCount!! 
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
// Set the parent of the graphics node 	TokenNameCOMMENT_LINE	Set the parent of the graphics node 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set the root of the graphics node 	TokenNameCOMMENT_LINE	Set the root of the graphics node 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Invalidates cached values 	TokenNameCOMMENT_LINE	Invalidates cached values 
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create and dispatch event 	TokenNameCOMMENT_LINE	Create and dispatch event 
// int id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_ADDED; 	TokenNameCOMMENT_LINE	int id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_ADDED; 
// dispatchEvent(new CompositeGraphicsNodeEvent(this, id, node)); 	TokenNameCOMMENT_LINE	dispatchEvent(new CompositeGraphicsNodeEvent(this, id, node)); 
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the specified graphics node at the specified position in this * children list. Shifts the graphics node currently at that position (if * any) and any subsequent graphics nodes to the right (adds one to their * indices). * * @param index the position at which the specified graphics node is to * be inserted. * @param o the graphics node to be inserted. * @exception IndexOutOfBoundsException if the index is out of range * @exception IllegalArgumentException if the node is not an * instance of GraphicsNode */	TokenNameCOMMENT_JAVADOC	 Inserts the specified graphics node at the specified position in this children list. Shifts the graphics node currently at that position (if any) and any subsequent graphics nodes to the right (adds one to their indices). * @param index the position at which the specified graphics node is to be inserted. @param o the graphics node to be inserted. @exception IndexOutOfBoundsException if the index is out of range @exception IllegalArgumentException if the node is not an instance of GraphicsNode 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check for correct arguments 	TokenNameCOMMENT_LINE	Check for correct arguments 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
" is not a GraphicsNode"	TokenNameStringLiteral	 is not a GraphicsNode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
count	TokenNameIdentifier	 count
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"Index: "	TokenNameStringLiteral	Index: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
", Size: "	TokenNameStringLiteral	, Size: 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
fireGraphicsNodeChangeStarted	TokenNameIdentifier	 fire Graphics Node Change Started
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reparent the graphics node and tidy up the tree's state 	TokenNameCOMMENT_LINE	Reparent the graphics node and tidy up the tree's state 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getChildren	TokenNameIdentifier	 get Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Insert the node to the children list 	TokenNameCOMMENT_LINE	Insert the node to the children list 
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Increments modCount!! 	TokenNameCOMMENT_LINE	Increments modCount!! 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// Set parent of the graphics node 	TokenNameCOMMENT_LINE	Set parent of the graphics node 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set root of the graphics node 	TokenNameCOMMENT_LINE	Set root of the graphics node 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Invalidates cached values 	TokenNameCOMMENT_LINE	Invalidates cached values 
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create and dispatch event 	TokenNameCOMMENT_LINE	Create and dispatch event 
// int id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_ADDED; 	TokenNameCOMMENT_LINE	int id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_ADDED; 
// dispatchEvent(new CompositeGraphicsNodeEvent(this, id, node)); 	TokenNameCOMMENT_LINE	dispatchEvent(new CompositeGraphicsNodeEvent(this, id, node)); 
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>Not supported</b> - * Throws <tt>UnsupportedOperationException</tt> exception. */	TokenNameCOMMENT_JAVADOC	 <b>Not supported</b> - Throws <tt>UnsupportedOperationException</tt> exception. 
public	TokenNamepublic	
boolean	TokenNameboolean	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>Not supported</b> - * Throws <tt>UnsupportedOperationException</tt> exception. */	TokenNameCOMMENT_JAVADOC	 <b>Not supported</b> - Throws <tt>UnsupportedOperationException</tt> exception. 
public	TokenNamepublic	
boolean	TokenNameboolean	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the first instance of the specified graphics node from the children list. * * @param o the node the remove * @return true if the children list contains the specified graphics node * @exception IllegalArgumentException if the node is not an * instance of GraphicsNode * @exception IndexOutOfBoundsException when o is not in children list */	TokenNameCOMMENT_JAVADOC	 Removes the first instance of the specified graphics node from the children list. * @param o the node the remove @return true if the children list contains the specified graphics node @exception IllegalArgumentException if the node is not an instance of GraphicsNode @exception IndexOutOfBoundsException when o is not in children list 
public	TokenNamepublic	
boolean	TokenNameboolean	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check for correct argument 	TokenNameCOMMENT_LINE	Check for correct argument 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
" is not a GraphicsNode"	TokenNameStringLiteral	 is not a GraphicsNode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Remove the node 	TokenNameCOMMENT_LINE	Remove the node 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fires exception when node not found! 	TokenNameCOMMENT_LINE	fires exception when node not found! 
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the graphics node at the specified position in the children list. * Shifts any subsequent graphics nodes to the left (subtracts one from * their indices). * * @param index the position of the graphics node to remove * @return the graphics node that was removed * @exception IndexOutOfBoundsException if index out of range <tt> */	TokenNameCOMMENT_JAVADOC	 Removes the graphics node at the specified position in the children list. Shifts any subsequent graphics nodes to the left (subtracts one from their indices). * @param index the position of the graphics node to remove @return the graphics node that was removed @exception IndexOutOfBoundsException if index out of range <tt> 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check for correct argument 	TokenNameCOMMENT_LINE	Check for correct argument 
checkRange	TokenNameIdentifier	 check Range
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
oldNode	TokenNameIdentifier	 old Node
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
fireGraphicsNodeChangeStarted	TokenNameIdentifier	 fire Graphics Node Change Started
(	TokenNameLPAREN	
oldNode	TokenNameIdentifier	 old Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Remove the node at the specified index 	TokenNameCOMMENT_LINE	Remove the node at the specified index 
modCount	TokenNameIdentifier	 mod Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
numMoved	TokenNameIdentifier	 num Moved
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numMoved	TokenNameIdentifier	 num Moved
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
numMoved	TokenNameIdentifier	 num Moved
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Let gc do its work 	TokenNameCOMMENT_LINE	Let gc do its work 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set parent of the node 	TokenNameCOMMENT_LINE	Set parent of the node 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
oldNode	TokenNameIdentifier	 old Node
)	TokenNameRPAREN	
.	TokenNameDOT	
setParent	TokenNameIdentifier	 set Parent
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set root of the node 	TokenNameCOMMENT_LINE	Set root of the node 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractGraphicsNode	TokenNameIdentifier	 Abstract Graphics Node
)	TokenNameRPAREN	
oldNode	TokenNameIdentifier	 old Node
)	TokenNameRPAREN	
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Invalidates cached values 	TokenNameCOMMENT_LINE	Invalidates cached values 
invalidateGeometryCache	TokenNameIdentifier	 invalidate Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Create and dispatch event 	TokenNameCOMMENT_LINE	Create and dispatch event 
// int id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_REMOVED; 	TokenNameCOMMENT_LINE	int id = CompositeGraphicsNodeEvent.GRAPHICS_NODE_REMOVED; 
// dispatchEvent(new CompositeGraphicsNodeEvent(this, id, oldNode)); 	TokenNameCOMMENT_LINE	dispatchEvent(new CompositeGraphicsNodeEvent(this, id, oldNode)); 
fireGraphicsNodeChangeCompleted	TokenNameIdentifier	 fire Graphics Node Change Completed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
oldNode	TokenNameIdentifier	 old Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>Not supported</b> - * Throws <tt>UnsupportedOperationException</tt> exception. */	TokenNameCOMMENT_JAVADOC	 <b>Not supported</b> - Throws <tt>UnsupportedOperationException</tt> exception. 
public	TokenNamepublic	
boolean	TokenNameboolean	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>Not supported</b> - * Throws <tt>UnsupportedOperationException</tt> exception. */	TokenNameCOMMENT_JAVADOC	 <b>Not supported</b> - Throws <tt>UnsupportedOperationException</tt> exception. 
public	TokenNamepublic	
boolean	TokenNameboolean	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>Not supported</b> - * Throws <tt>UnsupportedOperationException</tt> exception. */	TokenNameCOMMENT_JAVADOC	 <b>Not supported</b> - Throws <tt>UnsupportedOperationException</tt> exception. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this composite graphics node contains all the graphics * node in the specified collection, false otherwise. * * @param c the collection to be checked for containment */	TokenNameCOMMENT_JAVADOC	 Returns true if this composite graphics node contains all the graphics node in the specified collection, false otherwise. * @param c the collection to be checked for containment 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsAll	TokenNameIdentifier	 contains All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Search Operations 	TokenNameCOMMENT_LINE	Search Operations 
/** * Returns the index in the children list of the specified graphics node or * -1 if the children list does not contain this graphics node. * * @param node the graphics node to search for */	TokenNameCOMMENT_JAVADOC	 Returns the index in the children list of the specified graphics node or -1 if the children list does not contain this graphics node. * @param node the graphics node to search for 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
iCount	TokenNameIdentifier	 i Count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
GraphicsNode	TokenNameIdentifier	 Graphics Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
workList	TokenNameIdentifier	 work List
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iCount	TokenNameIdentifier	 i Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
workList	TokenNameIdentifier	 work List
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index in this children list of the last occurence of the * specified graphics node, or -1 if the list does not contain this graphics * node. * * @param node the graphics node to search for */	TokenNameCOMMENT_JAVADOC	 Returns the index in this children list of the last occurence of the specified graphics node, or -1 if the list does not contain this graphics node. * @param node the graphics node to search for 
public	TokenNamepublic	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
instanceof	TokenNameinstanceof	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
children	TokenNameIdentifier	 children
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// List Iterators 	TokenNameCOMMENT_LINE	List Iterators 
/** * Returns an iterator over the children of this graphics node. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the children of this graphics node. 
public	TokenNamepublic	
ListIterator	TokenNameIdentifier	 List Iterator
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an iterator over the children of this graphics node, starting at * the specified position in the children list. * * @param index the index of the first graphics node to return * from the children list */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the children of this graphics node, starting at the specified position in the children list. * @param index the index of the first graphics node to return from the children list 
public	TokenNamepublic	
ListIterator	TokenNameIdentifier	 List Iterator
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>	TokenNameGREATER	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"Index: "	TokenNameStringLiteral	Index: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ListItr	TokenNameIdentifier	 List Itr
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// View 	TokenNameCOMMENT_LINE	View 
/** * <b>Not supported</b> - * Throws <tt>UnsupportedOperationException</tt> exception. */	TokenNameCOMMENT_JAVADOC	 <b>Not supported</b> - Throws <tt>UnsupportedOperationException</tt> exception. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
int	TokenNameint	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the given index is in range. If not, throws an appropriate * runtime exception. * * @param index the index to check */	TokenNameCOMMENT_JAVADOC	 Checks if the given index is in range. If not, throws an appropriate runtime exception. * @param index the index to check 
private	TokenNameprivate	
void	TokenNamevoid	
checkRange	TokenNameIdentifier	 check Range
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
count	TokenNameIdentifier	 count
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"Index: "	TokenNameStringLiteral	Index: 
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
", Size: "	TokenNameStringLiteral	, Size: 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Increases the capacity of the children list, if necessary, to ensure that * it can hold at least the number of graphics nodes specified by the * minimum capacity argument. * * @param minCapacity the desired minimum capacity. */	TokenNameCOMMENT_JAVADOC	 Increases the capacity of the children list, if necessary, to ensure that it can hold at least the number of graphics nodes specified by the minimum capacity argument. * @param minCapacity the desired minimum capacity. 
public	TokenNamepublic	
void	TokenNamevoid	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
int	TokenNameint	
minCapacity	TokenNameIdentifier	 min Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
GraphicsNode	TokenNameIdentifier	 Graphics Node
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
modCount	TokenNameIdentifier	 mod Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
oldCapacity	TokenNameIdentifier	 old Capacity
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
minCapacity	TokenNameIdentifier	 min Capacity
>	TokenNameGREATER	
oldCapacity	TokenNameIdentifier	 old Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldData	TokenNameIdentifier	 old Data
=	TokenNameEQUAL	
children	TokenNameIdentifier	 children
;	TokenNameSEMICOLON	
int	TokenNameint	
newCapacity	TokenNameIdentifier	 new Capacity
=	TokenNameEQUAL	
oldCapacity	TokenNameIdentifier	 old Capacity
+	TokenNamePLUS	
oldCapacity	TokenNameIdentifier	 old Capacity
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newCapacity	TokenNameIdentifier	 new Capacity
<	TokenNameLESS	
minCapacity	TokenNameIdentifier	 min Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newCapacity	TokenNameIdentifier	 new Capacity
=	TokenNameEQUAL	
minCapacity	TokenNameIdentifier	 min Capacity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
new	TokenNamenew	
GraphicsNode	TokenNameIdentifier	 Graphics Node
[	TokenNameLBRACKET	
newCapacity	TokenNameIdentifier	 new Capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
oldData	TokenNameIdentifier	 old Data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
children	TokenNameIdentifier	 children
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An implementation of the java.util.Iterator interface. */	TokenNameCOMMENT_JAVADOC	 An implementation of the java.util.Iterator interface. 
private	TokenNameprivate	
class	TokenNameclass	
Itr	TokenNameIdentifier	 Itr
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
{	TokenNameLBRACE	
/** * Index of graphics node to be returned by subsequent call to next. */	TokenNameCOMMENT_JAVADOC	 Index of graphics node to be returned by subsequent call to next. 
int	TokenNameint	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Index of graphics node returned by most recent call to next or * previous. Reset to -1 if this graphics node is deleted by a call * to remove. */	TokenNameCOMMENT_JAVADOC	 Index of graphics node returned by most recent call to next or previous. Reset to -1 if this graphics node is deleted by a call to remove. 
int	TokenNameint	
lastRet	TokenNameIdentifier	 last Ret
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The modCount value that the iterator believes that the backing * List should have. If this expectation is violated, the iterator * has detected concurrent modification. */	TokenNameCOMMENT_JAVADOC	 The modCount value that the iterator believes that the backing List should have. If this expectation is violated, the iterator has detected concurrent modification. 
int	TokenNameint	
expectedModCount	TokenNameIdentifier	 expected Mod Count
=	TokenNameEQUAL	
modCount	TokenNameIdentifier	 mod Count
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cursor	TokenNameIdentifier	 cursor
!=	TokenNameNOT_EQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkForComodification	TokenNameIdentifier	 check For Comodification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastRet	TokenNameIdentifier	 last Ret
=	TokenNameEQUAL	
cursor	TokenNameIdentifier	 cursor
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkForComodification	TokenNameIdentifier	 check For Comodification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastRet	TokenNameIdentifier	 last Ret
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkForComodification	TokenNameIdentifier	 check For Comodification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
lastRet	TokenNameIdentifier	 last Ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastRet	TokenNameIdentifier	 last Ret
<	TokenNameLESS	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastRet	TokenNameIdentifier	 last Ret
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
expectedModCount	TokenNameIdentifier	 expected Mod Count
=	TokenNameEQUAL	
modCount	TokenNameIdentifier	 mod Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConcurrentModificationException	TokenNameIdentifier	 Concurrent Modification Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
checkForComodification	TokenNameIdentifier	 check For Comodification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
modCount	TokenNameIdentifier	 mod Count
!=	TokenNameNOT_EQUAL	
expectedModCount	TokenNameIdentifier	 expected Mod Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConcurrentModificationException	TokenNameIdentifier	 Concurrent Modification Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An implementation of the java.util.ListIterator interface. */	TokenNameCOMMENT_JAVADOC	 An implementation of the java.util.ListIterator interface. 
private	TokenNameprivate	
class	TokenNameclass	
ListItr	TokenNameIdentifier	 List Itr
extends	TokenNameextends	
Itr	TokenNameIdentifier	 Itr
implements	TokenNameimplements	
ListIterator	TokenNameIdentifier	 List Iterator
{	TokenNameLBRACE	
ListItr	TokenNameIdentifier	 List Itr
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasPrevious	TokenNameIdentifier	 has Previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cursor	TokenNameIdentifier	 cursor
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkForComodification	TokenNameIdentifier	 check For Comodification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastRet	TokenNameIdentifier	 last Ret
=	TokenNameEQUAL	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
return	TokenNamereturn	
previous	TokenNameIdentifier	 previous
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkForComodification	TokenNameIdentifier	 check For Comodification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
nextIndex	TokenNameIdentifier	 next Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cursor	TokenNameIdentifier	 cursor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
previousIndex	TokenNameIdentifier	 previous Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cursor	TokenNameIdentifier	 cursor
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastRet	TokenNameIdentifier	 last Ret
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
checkForComodification	TokenNameIdentifier	 check For Comodification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
lastRet	TokenNameIdentifier	 last Ret
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expectedModCount	TokenNameIdentifier	 expected Mod Count
=	TokenNameEQUAL	
modCount	TokenNameIdentifier	 mod Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConcurrentModificationException	TokenNameIdentifier	 Concurrent Modification Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkForComodification	TokenNameIdentifier	 check For Comodification
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastRet	TokenNameIdentifier	 last Ret
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
expectedModCount	TokenNameIdentifier	 expected Mod Count
=	TokenNameEQUAL	
modCount	TokenNameIdentifier	 mod Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ConcurrentModificationException	TokenNameIdentifier	 Concurrent Modification Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
