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
Composite	TokenNameIdentifier	 Composite
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
RenderingHints	TokenNameIdentifier	 Rendering Hints
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
WeakReference	TokenNameIdentifier	 Weak Reference
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
ClipRable	TokenNameIdentifier	 Clip Rable
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
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
Mask	TokenNameIdentifier	 Mask
;	TokenNameSEMICOLON	
/** * The base class for all graphics nodes. A GraphicsNode encapsulates * graphical attributes and can perform atomic operations of a complex * rendering. * * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> * @author <a href="mailto:etissandier@ilog.fr">Emmanuel Tissandier</a> * @version $Id: GraphicsNode.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The base class for all graphics nodes. A GraphicsNode encapsulates graphical attributes and can perform atomic operations of a complex rendering. * @author <a href="mailto:Thierry.Kormann@sophia.inria.fr">Thierry Kormann</a> @author <a href="mailto:etissandier@ilog.fr">Emmanuel Tissandier</a> @version $Id: GraphicsNode.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
interface	TokenNameinterface	
GraphicsNode	TokenNameIdentifier	 Graphics Node
{	TokenNameLBRACE	
/** * Indicates that this graphics node can be the target for events when it * is visible and when the mouse is over the "painted" area. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can be the target for events when it is visible and when the mouse is over the "painted" area. 
int	TokenNameint	
VISIBLE_PAINTED	TokenNameIdentifier	 VISIBLE  PAINTED
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that this graphics node can be the target for events when it * is visible and when the mouse is over the filled area if any. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can be the target for events when it is visible and when the mouse is over the filled area if any. 
int	TokenNameint	
VISIBLE_FILL	TokenNameIdentifier	 VISIBLE  FILL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that this graphics node can be the target for events when it * is visible and when the mouse is over the stroked area if any. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can be the target for events when it is visible and when the mouse is over the stroked area if any. 
int	TokenNameint	
VISIBLE_STROKE	TokenNameIdentifier	 VISIBLE  STROKE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that this graphics node can be the target for events when it * is visible and whatever is the filled and stroked area. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can be the target for events when it is visible and whatever is the filled and stroked area. 
int	TokenNameint	
VISIBLE	TokenNameIdentifier	 VISIBLE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that this graphics node can be the target for events when the * mouse is over the painted area whatever or not it is the visible. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can be the target for events when the mouse is over the painted area whatever or not it is the visible. 
int	TokenNameint	
PAINTED	TokenNameIdentifier	 PAINTED
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that this graphics node can be the target for events when the * mouse is over the filled area whatever or not it is the visible. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can be the target for events when the mouse is over the filled area whatever or not it is the visible. 
int	TokenNameint	
FILL	TokenNameIdentifier	 FILL
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that this graphics node can be the target for events when the * mouse is over the stroked area whatever or not it is the visible. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can be the target for events when the mouse is over the stroked area whatever or not it is the visible. 
int	TokenNameint	
STROKE	TokenNameIdentifier	 STROKE
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that this graphics node can be the target for events if any * cases. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can be the target for events if any cases. 
int	TokenNameint	
ALL	TokenNameIdentifier	 ALL
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Indicates that this graphics node can not be the target for events. */	TokenNameCOMMENT_JAVADOC	 Indicates that this graphics node can not be the target for events. 
int	TokenNameint	
NONE	TokenNameIdentifier	 NONE
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The identity affine transform matrix used to draw renderable images. */	TokenNameCOMMENT_JAVADOC	 The identity affine transform matrix used to draw renderable images. 
AffineTransform	TokenNameIdentifier	 Affine Transform
IDENTITY	TokenNameIdentifier	 IDENTITY
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a canonical WeakReference to this GraphicsNode. * This is suitable for use as a key value in a hash map */	TokenNameCOMMENT_JAVADOC	 Returns a canonical WeakReference to this GraphicsNode. This is suitable for use as a key value in a hash map 
WeakReference	TokenNameIdentifier	 Weak Reference
getWeakReference	TokenNameIdentifier	 get Weak Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Properties methods 	TokenNameCOMMENT_LINE	Properties methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the type that describes how this graphics node reacts to events. * * @return VISIBLE_PAINTED | VISIBLE_FILL | VISIBLE_STROKE | VISIBLE | * PAINTED | FILL | STROKE | ALL | NONE */	TokenNameCOMMENT_JAVADOC	 Returns the type that describes how this graphics node reacts to events. * @return VISIBLE_PAINTED | VISIBLE_FILL | VISIBLE_STROKE | VISIBLE | PAINTED | FILL | STROKE | ALL | NONE 
int	TokenNameint	
getPointerEventType	TokenNameIdentifier	 get Pointer Event Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the type that describes how this graphics node reacts to events. * * @param pointerEventType VISIBLE_PAINTED | VISIBLE_FILL | VISIBLE_STROKE | * VISIBLE | PAINTED | FILL | STROKE | ALL | NONE */	TokenNameCOMMENT_JAVADOC	 Sets the type that describes how this graphics node reacts to events. * @param pointerEventType VISIBLE_PAINTED | VISIBLE_FILL | VISIBLE_STROKE | VISIBLE | PAINTED | FILL | STROKE | ALL | NONE 
void	TokenNamevoid	
setPointerEventType	TokenNameIdentifier	 set Pointer Event Type
(	TokenNameLPAREN	
int	TokenNameint	
pointerEventType	TokenNameIdentifier	 pointer Event Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the transform of this node. * * @param newTransform the new transform of this node */	TokenNameCOMMENT_JAVADOC	 Sets the transform of this node. * @param newTransform the new transform of this node 
void	TokenNamevoid	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
newTransform	TokenNameIdentifier	 new Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the transform of this node or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the transform of this node or null if any. 
AffineTransform	TokenNameIdentifier	 Affine Transform
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the inverse transform for this node. */	TokenNameCOMMENT_JAVADOC	 Returns the inverse transform for this node. 
AffineTransform	TokenNameIdentifier	 Affine Transform
getInverseTransform	TokenNameIdentifier	 get Inverse Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the concatenated transform of this node. That is, this * node's transform preconcatenated with it's parent's transforms. */	TokenNameCOMMENT_JAVADOC	 Returns the concatenated transform of this node. That is, this node's transform preconcatenated with it's parent's transforms. 
AffineTransform	TokenNameIdentifier	 Affine Transform
getGlobalTransform	TokenNameIdentifier	 get Global Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the composite of this node. * * @param newComposite the composite of this node */	TokenNameCOMMENT_JAVADOC	 Sets the composite of this node. * @param newComposite the composite of this node 
void	TokenNamevoid	
setComposite	TokenNameIdentifier	 set Composite
(	TokenNameLPAREN	
Composite	TokenNameIdentifier	 Composite
newComposite	TokenNameIdentifier	 new Composite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the composite of this node or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the composite of this node or null if any. 
Composite	TokenNameIdentifier	 Composite
getComposite	TokenNameIdentifier	 get Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets if this node is visible or not depending on the specified value. * * @param isVisible If true this node is visible */	TokenNameCOMMENT_JAVADOC	 Sets if this node is visible or not depending on the specified value. * @param isVisible If true this node is visible 
void	TokenNamevoid	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
boolean	TokenNameboolean	
isVisible	TokenNameIdentifier	 is Visible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if this node is visible, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns true if this node is visible, false otherwise. 
boolean	TokenNameboolean	
isVisible	TokenNameIdentifier	 is Visible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the clipping filter of this node. * * @param newClipper the new clipping filter of this node */	TokenNameCOMMENT_JAVADOC	 Sets the clipping filter of this node. * @param newClipper the new clipping filter of this node 
void	TokenNamevoid	
setClip	TokenNameIdentifier	 set Clip
(	TokenNameLPAREN	
ClipRable	TokenNameIdentifier	 Clip Rable
newClipper	TokenNameIdentifier	 new Clipper
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the clipping filter of this node or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the clipping filter of this node or null if any. 
ClipRable	TokenNameIdentifier	 Clip Rable
getClip	TokenNameIdentifier	 get Clip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Maps the specified key to the specified value in the rendering hints of * this node. * * @param key the key of the hint to be set * @param value the value indicating preferences for the specified * hint category. */	TokenNameCOMMENT_JAVADOC	 Maps the specified key to the specified value in the rendering hints of this node. * @param key the key of the hint to be set @param value the value indicating preferences for the specified hint category. 
void	TokenNamevoid	
setRenderingHint	TokenNameIdentifier	 set Rendering Hint
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
.	TokenNameDOT	
Key	TokenNameIdentifier	 Key
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Copies all of the mappings from the specified Map to the * rendering hints of this node. * * @param hints the rendering hints to be set */	TokenNameCOMMENT_JAVADOC	 Copies all of the mappings from the specified Map to the rendering hints of this node. * @param hints the rendering hints to be set 
void	TokenNamevoid	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the rendering hints of this node. * * @param newHints the new rendering hints of this node */	TokenNameCOMMENT_JAVADOC	 Sets the rendering hints of this node. * @param newHints the new rendering hints of this node 
void	TokenNamevoid	
setRenderingHints	TokenNameIdentifier	 set Rendering Hints
(	TokenNameLPAREN	
RenderingHints	TokenNameIdentifier	 Rendering Hints
newHints	TokenNameIdentifier	 new Hints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the rendering hints of this node or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the rendering hints of this node or null if any. 
RenderingHints	TokenNameIdentifier	 Rendering Hints
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the mask of this node. * * @param newMask the new mask of this node */	TokenNameCOMMENT_JAVADOC	 Sets the mask of this node. * @param newMask the new mask of this node 
void	TokenNamevoid	
setMask	TokenNameIdentifier	 set Mask
(	TokenNameLPAREN	
Mask	TokenNameIdentifier	 Mask
newMask	TokenNameIdentifier	 new Mask
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the mask of this node or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the mask of this node or null if any. 
Mask	TokenNameIdentifier	 Mask
getMask	TokenNameIdentifier	 get Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sets the filter of this node. * * @param newFilter the new filter of this node */	TokenNameCOMMENT_JAVADOC	 Sets the filter of this node. * @param newFilter the new filter of this node 
void	TokenNamevoid	
setFilter	TokenNameIdentifier	 set Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
newFilter	TokenNameIdentifier	 new Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the filter of this node or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the filter of this node or null if any. 
Filter	TokenNameIdentifier	 Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the GraphicsNodeRable for this node. This * GraphicsNodeRable is the Renderable (Filter) before any of the * filter operations have been applied. */	TokenNameCOMMENT_JAVADOC	 Returns the GraphicsNodeRable for this node. This GraphicsNodeRable is the Renderable (Filter) before any of the filter operations have been applied. 
Filter	TokenNameIdentifier	 Filter
getGraphicsNodeRable	TokenNameIdentifier	 get Graphics Node Rable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
createIfNeeded	TokenNameIdentifier	 create If Needed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the GraphicsNodeRable for this node. This * GraphicsNodeRable is the Renderable (Filter) after all of the * filter operations have been applied. */	TokenNameCOMMENT_JAVADOC	 Returns the GraphicsNodeRable for this node. This GraphicsNodeRable is the Renderable (Filter) after all of the filter operations have been applied. 
Filter	TokenNameIdentifier	 Filter
getEnableBackgroundGraphicsNodeRable	TokenNameIdentifier	 get Enable Background Graphics Node Rable
(	TokenNameLPAREN	
boolean	TokenNameboolean	
createIfNeeded	TokenNameIdentifier	 create If Needed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Drawing methods 	TokenNameCOMMENT_LINE	Drawing methods 
// 	TokenNameCOMMENT_LINE	 
/** * Paints this node. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints this node. * @param g2d the Graphics2D to use 
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Paints this node without applying Filter, Mask, Composite, and clip. * * @param g2d the Graphics2D to use */	TokenNameCOMMENT_JAVADOC	 Paints this node without applying Filter, Mask, Composite, and clip. * @param g2d the Graphics2D to use 
void	TokenNamevoid	
primitivePaint	TokenNameIdentifier	 primitive Paint
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Event support methods 	TokenNameCOMMENT_LINE	Event support methods 
// 	TokenNameCOMMENT_LINE	 
/** * Dispatches the specified event to the interested registered listeners. * @param evt the event to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches the specified event to the interested registered listeners. @param evt the event to dispatch 
// void dispatchEvent(GraphicsNodeEvent evt); 	TokenNameCOMMENT_LINE	void dispatchEvent(GraphicsNodeEvent evt); 
/** * Adds the specified graphics node mouse listener to receive graphics node * mouse events from this node. * * @param l the graphics node mouse listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the specified graphics node mouse listener to receive graphics node mouse events from this node. * @param l the graphics node mouse listener to add 
// void addGraphicsNodeMouseListener(GraphicsNodeMouseListener l); 	TokenNameCOMMENT_LINE	void addGraphicsNodeMouseListener(GraphicsNodeMouseListener l); 
/** * Removes the specified graphics node mouse listener so that it no longer * receives graphics node mouse events from this node. * * @param l the graphics node mouse listener to remove */	TokenNameCOMMENT_JAVADOC	 Removes the specified graphics node mouse listener so that it no longer receives graphics node mouse events from this node. * @param l the graphics node mouse listener to remove 
// void removeGraphicsNodeMouseListener(GraphicsNodeMouseListener l); 	TokenNameCOMMENT_LINE	void removeGraphicsNodeMouseListener(GraphicsNodeMouseListener l); 
/** * Adds the specified graphics node key listener to receive graphics node * key events from this node. * * @param l the graphics node key listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the specified graphics node key listener to receive graphics node key events from this node. * @param l the graphics node key listener to add 
// void addGraphicsNodeKeyListener(GraphicsNodeKeyListener l); 	TokenNameCOMMENT_LINE	void addGraphicsNodeKeyListener(GraphicsNodeKeyListener l); 
/** * Removes the specified graphics node key listener so that it no longer * receives graphics node key events from this node. * * @param l the graphics node key listener to remove */	TokenNameCOMMENT_JAVADOC	 Removes the specified graphics node key listener so that it no longer receives graphics node key events from this node. * @param l the graphics node key listener to remove 
// void removeGraphicsNodeKeyListener(GraphicsNodeKeyListener l); 	TokenNameCOMMENT_LINE	void removeGraphicsNodeKeyListener(GraphicsNodeKeyListener l); 
/** * Dispatches a graphics node mouse event to this node or one of its child. * * @param evt the evt to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches a graphics node mouse event to this node or one of its child. * @param evt the evt to dispatch 
// void processMouseEvent(GraphicsNodeMouseEvent evt); 	TokenNameCOMMENT_LINE	void processMouseEvent(GraphicsNodeMouseEvent evt); 
/** * Dispatches a graphics node key event to this node or one of its child. * * @param evt the evt to dispatch */	TokenNameCOMMENT_JAVADOC	 Dispatches a graphics node key event to this node or one of its child. * @param evt the evt to dispatch 
// void processKeyEvent(GraphicsNodeKeyEvent evt); 	TokenNameCOMMENT_LINE	void processKeyEvent(GraphicsNodeKeyEvent evt); 
/** * Returns an array of listeners that were added to this node and of the * specified type. * * @param listenerType the type of the listeners to return */	TokenNameCOMMENT_JAVADOC	 Returns an array of listeners that were added to this node and of the specified type. * @param listenerType the type of the listeners to return 
// EventListener [] getListeners(Class listenerType); 	TokenNameCOMMENT_LINE	EventListener [] getListeners(Class listenerType); 
// 	TokenNameCOMMENT_LINE	 
// Structural methods 	TokenNameCOMMENT_LINE	Structural methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the parent of this node or null if any. */	TokenNameCOMMENT_JAVADOC	 Returns the parent of this node or null if any. 
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the root of the GVT tree or null if the node is not part of a GVT * tree. */	TokenNameCOMMENT_JAVADOC	 Returns the root of the GVT tree or null if the node is not part of a GVT tree. 
RootGraphicsNode	TokenNameIdentifier	 Root Graphics Node
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Geometric methods 	TokenNameCOMMENT_LINE	Geometric methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the bounds of this node in user space. This includes primitive * paint, filtering, clipping and masking. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of this node in user space. This includes primitive paint, filtering, clipping and masking. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of this node after applying the input transform * (if any), concatenated with this node's transform (if any). * * @param txf the affine transform with which this node's transform should * be concatenated. Should not be null. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of this node after applying the input transform (if any), concatenated with this node's transform (if any). * @param txf the affine transform with which this node's transform should be concatenated. Should not be null. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedBounds	TokenNameIdentifier	 get Transformed Bounds
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of the area covered by this node's primitive * paint. This is the painted region of fill and stroke but does * not account for clipping, masking or filtering. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node's primitive paint. This is the painted region of fill and stroke but does not account for clipping, masking or filtering. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getPrimitiveBounds	TokenNameIdentifier	 get Primitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of this node's primitivePaint after applying * the input transform (if any), concatenated with this node's * transform (if any). * * @param txf the affine transform with which this node's transform should * be concatenated. Should not be null. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of this node's primitivePaint after applying the input transform (if any), concatenated with this node's transform (if any). * @param txf the affine transform with which this node's transform should be concatenated. Should not be null. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedPrimitiveBounds	TokenNameIdentifier	 get Transformed Primitive Bounds
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of the area covered by this node, without * taking any of its rendering attribute into account. That is, * exclusive of any clipping, masking, filtering or stroking, for * example. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node, without taking any of its rendering attribute into account. That is, exclusive of any clipping, masking, filtering or stroking, for example. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getGeometryBounds	TokenNameIdentifier	 get Geometry Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of the area covered by this node, without * taking any of its rendering attribute into accoun. That is, * exclusive of any clipping, masking, filtering or stroking, for * example. The returned value is transformed by the concatenation * of the input transform and this node's transform. * * @param txf the affine transform with which this node's transform should * be concatenated. Should not be null. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the area covered by this node, without taking any of its rendering attribute into accoun. That is, exclusive of any clipping, masking, filtering or stroking, for example. The returned value is transformed by the concatenation of the input transform and this node's transform. * @param txf the affine transform with which this node's transform should be concatenated. Should not be null. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedGeometryBounds	TokenNameIdentifier	 get Transformed Geometry Bounds
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of the sensitive area covered by this node, * This includes the stroked area but does not include the effects * of clipping, masking or filtering. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the sensitive area covered by this node, This includes the stroked area but does not include the effects of clipping, masking or filtering. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getSensitiveBounds	TokenNameIdentifier	 get Sensitive Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the bounds of the sensitive area covered by this node, * This includes the stroked area but does not include the effects * of clipping, masking or filtering. The returned value is * transformed by the concatenation of the input transform and * this node's transform. * * @param txf the affine transform with which this node's * transform should be concatenated. Should not be null. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the sensitive area covered by this node, This includes the stroked area but does not include the effects of clipping, masking or filtering. The returned value is transformed by the concatenation of the input transform and this node's transform. * @param txf the affine transform with which this node's transform should be concatenated. Should not be null. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getTransformedSensitiveBounds	TokenNameIdentifier	 get Transformed Sensitive Bounds
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
txf	TokenNameIdentifier	 txf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the specified Point2D is inside the boundary of this * node, false otherwise. * * @param p the specified Point2D in the user space */	TokenNameCOMMENT_JAVADOC	 Returns true if the specified Point2D is inside the boundary of this node, false otherwise. * @param p the specified Point2D in the user space 
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns true if the interior of this node intersects the interior of a * specified Rectangle2D, false otherwise. * * @param r the specified Rectangle2D in the user node space */	TokenNameCOMMENT_JAVADOC	 Returns true if the interior of this node intersects the interior of a specified Rectangle2D, false otherwise. * @param r the specified Rectangle2D in the user node space 
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the GraphicsNode containing point p if this node or one of its * children is sensitive to mouse events at p. * * @param p the specified Point2D in the user space */	TokenNameCOMMENT_JAVADOC	 Returns the GraphicsNode containing point p if this node or one of its children is sensitive to mouse events at p. * @param p the specified Point2D in the user space 
GraphicsNode	TokenNameIdentifier	 Graphics Node
nodeHitAt	TokenNameIdentifier	 node Hit At
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the outline of this node. */	TokenNameCOMMENT_JAVADOC	 Returns the outline of this node. 
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
