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
Shape	TokenNameIdentifier	 Shape
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
HashMap	TokenNameIdentifier	 Hash Map
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
LinkedList	TokenNameIdentifier	 Linked List
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
GraphicsNodeChangeAdapter	TokenNameIdentifier	 Graphics Node Change Adapter
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
GraphicsNodeChangeEvent	TokenNameIdentifier	 Graphics Node Change Event
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
/** * This class tracks the changes on a GVT tree * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: UpdateTracker.java 479559 2006-11-27 09:46:16Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class tracks the changes on a GVT tree * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: UpdateTracker.java 479559 2006-11-27 09:46:16Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
UpdateTracker	TokenNameIdentifier	 Update Tracker
extends	TokenNameextends	
GraphicsNodeChangeAdapter	TokenNameIdentifier	 Graphics Node Change Adapter
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
dirtyNodes	TokenNameIdentifier	 dirty Nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
fromBounds	TokenNameIdentifier	 from Bounds
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
NULL_RECT	TokenNameIdentifier	 NULL  RECT
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UpdateTracker	TokenNameIdentifier	 Update Tracker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Tells whether the GVT tree has changed. */	TokenNameCOMMENT_JAVADOC	 Tells whether the GVT tree has changed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasChanged	TokenNameIdentifier	 has Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the list of dirty areas on GVT. */	TokenNameCOMMENT_JAVADOC	 Returns the list of dirty areas on GVT. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDirtyAreas	TokenNameIdentifier	 get Dirty Areas
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
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
WeakReference	TokenNameIdentifier	 Weak Reference
gnWRef	TokenNameIdentifier	 gn W Ref
=	TokenNameEQUAL	
(	TokenNameLPAREN	
WeakReference	TokenNameIdentifier	 Weak Reference
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// GraphicsNode srcGN = gn; 	TokenNameCOMMENT_LINE	GraphicsNode srcGN = gn; 
// if the weak ref has been cleared then this node is no 	TokenNameCOMMENT_LINE	if the weak ref has been cleared then this node is no 
// longer part of the GVT tree (and the change should be 	TokenNameCOMMENT_LINE	longer part of the GVT tree (and the change should be 
// reflected in some ancestor that should also be in the 	TokenNameCOMMENT_LINE	reflected in some ancestor that should also be in the 
// dirty list). 	TokenNameCOMMENT_LINE	dirty list). 
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
oat	TokenNameIdentifier	 oat
;	TokenNameSEMICOLON	
oat	TokenNameIdentifier	 oat
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oat	TokenNameIdentifier	 oat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oat	TokenNameIdentifier	 oat
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
oat	TokenNameIdentifier	 oat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
srcORgn	TokenNameIdentifier	 src O Rgn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
fromBounds	TokenNameIdentifier	 from Bounds
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
srcNRgn	TokenNameIdentifier	 src N Rgn
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
srcORgn	TokenNameIdentifier	 src O Rgn
instanceof	TokenNameinstanceof	
ChngSrcRect	TokenNameIdentifier	 Chng Src Rect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For change srcs don't use the new bounds of parent node. 	TokenNameCOMMENT_LINE	For change srcs don't use the new bounds of parent node. 
srcNRgn	TokenNameIdentifier	 src N Rgn
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// System.out.println("Rgns: " + srcORgn + " - " + srcNRgn); 	TokenNameCOMMENT_LINE	System.out.println("Rgns: " + srcORgn + " - " + srcNRgn); 
// System.out.println("ATs: " + oat + " - " + nat); 	TokenNameCOMMENT_LINE	System.out.println("ATs: " + oat + " - " + nat); 
do	TokenNamedo	
{	TokenNameLBRACE	
// f.invalidateCache(oRng); 	TokenNameCOMMENT_LINE	f.invalidateCache(oRng); 
// f.invalidateCache(nRng); 	TokenNameCOMMENT_LINE	f.invalidateCache(nRng); 
// f = gn.getEnableBackgroundGraphicsNodeRable(false); 	TokenNameCOMMENT_LINE	f = gn.getEnableBackgroundGraphicsNodeRable(false); 
// (need to push rgn through filter chain if any...) 	TokenNameCOMMENT_LINE	(need to push rgn through filter chain if any...) 
// f.invalidateCache(oRng); 	TokenNameCOMMENT_LINE	f.invalidateCache(oRng); 
// f.invalidateCache(nRng); 	TokenNameCOMMENT_LINE	f.invalidateCache(nRng); 
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// We reached the top of the tree 	TokenNameCOMMENT_LINE	We reached the top of the tree 
Filter	TokenNameIdentifier	 Filter
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcNRgn	TokenNameIdentifier	 src N Rgn
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the parent's current Affine 	TokenNameCOMMENT_LINE	Get the parent's current Affine 
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the parent's Affine last time we rendered. 	TokenNameCOMMENT_LINE	Get the parent's Affine last time we rendered. 
gnWRef	TokenNameIdentifier	 gn W Ref
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getWeakReference	TokenNameIdentifier	 get Weak Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
poat	TokenNameIdentifier	 poat
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
poat	TokenNameIdentifier	 poat
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
poat	TokenNameIdentifier	 poat
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
poat	TokenNameIdentifier	 poat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oat	TokenNameIdentifier	 oat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
oat	TokenNameIdentifier	 oat
.	TokenNameDOT	
preConcatenate	TokenNameIdentifier	 pre Concatenate
(	TokenNameLPAREN	
poat	TokenNameIdentifier	 poat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
oat	TokenNameIdentifier	 oat
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
poat	TokenNameIdentifier	 poat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nat	TokenNameIdentifier	 nat
.	TokenNameDOT	
preConcatenate	TokenNameIdentifier	 pre Concatenate
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We made it to the root graphics node so add them. 	TokenNameCOMMENT_LINE	We made it to the root graphics node so add them. 
// System.out.println 	TokenNameCOMMENT_LINE	System.out.println 
// ("Adding: " + oat + " - " + nat + "\n" + 	TokenNameCOMMENT_LINE	("Adding: " + oat + " - " + nat + "\n" + 
// srcORgn + "\n" + srcNRgn + "\n"); 	TokenNameCOMMENT_LINE	srcORgn + "\n" + srcNRgn + "\n"); 
// <!> 	TokenNameCOMMENT_LINE	<!> 
Shape	TokenNameIdentifier	 Shape
oRgn	TokenNameIdentifier	 o Rgn
=	TokenNameEQUAL	
srcORgn	TokenNameIdentifier	 src O Rgn
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
oRgn	TokenNameIdentifier	 o Rgn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
oRgn	TokenNameIdentifier	 o Rgn
!=	TokenNameNOT_EQUAL	
NULL_RECT	TokenNameIdentifier	 NULL  RECT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oat	TokenNameIdentifier	 oat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
oRgn	TokenNameIdentifier	 o Rgn
=	TokenNameEQUAL	
oat	TokenNameIdentifier	 oat
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
srcORgn	TokenNameIdentifier	 src O Rgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("GN: " + srcGN); 	TokenNameCOMMENT_LINE	System.err.println("GN: " + srcGN); 
// System.err.println("Src: " + oRgn.getBounds2D()); 	TokenNameCOMMENT_LINE	System.err.println("Src: " + oRgn.getBounds2D()); 
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
oRgn	TokenNameIdentifier	 o Rgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
srcNRgn	TokenNameIdentifier	 src N Rgn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
nRgn	TokenNameIdentifier	 n Rgn
=	TokenNameEQUAL	
srcNRgn	TokenNameIdentifier	 src N Rgn
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nRgn	TokenNameIdentifier	 n Rgn
=	TokenNameEQUAL	
nat	TokenNameIdentifier	 nat
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
srcNRgn	TokenNameIdentifier	 src N Rgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nRgn	TokenNameIdentifier	 n Rgn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nRgn	TokenNameIdentifier	 n Rgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fromBounds	TokenNameIdentifier	 from Bounds
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This returns the dirty region for gn in the coordinate system * given by <code>at</code>. * @param gn Node tree to return dirty region for. * @param at Affine transform to coordinate space to accumulate * dirty regions in. */	TokenNameCOMMENT_JAVADOC	 This returns the dirty region for gn in the coordinate system given by <code>at</code>. @param gn Node tree to return dirty region for. @param at Affine transform to coordinate space to accumulate dirty regions in. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getNodeDirtyRegion	TokenNameIdentifier	 get Node Dirty Region
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
WeakReference	TokenNameIdentifier	 Weak Reference
gnWRef	TokenNameIdentifier	 gn W Ref
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getWeakReference	TokenNameIdentifier	 get Weak Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nat	TokenNameIdentifier	 nat
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
nat	TokenNameIdentifier	 nat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Filter	TokenNameIdentifier	 Filter
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
instanceof	TokenNameinstanceof	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
cgn	TokenNameIdentifier	 cgn
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeGraphicsNode	TokenNameIdentifier	 Composite Graphics Node
)	TokenNameRPAREN	
gn	TokenNameIdentifier	 gn
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
cgn	TokenNameIdentifier	 cgn
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
childGN	TokenNameIdentifier	 child GN
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r2d	TokenNameIdentifier	 r2d
=	TokenNameEQUAL	
getNodeDirtyRegion	TokenNameIdentifier	 get Node Dirty Region
(	TokenNameLPAREN	
childGN	TokenNameIdentifier	 child GN
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If we have a filter and a change region 	TokenNameCOMMENT_LINE	If we have a filter and a change region 
// Update our full filter extents. 	TokenNameCOMMENT_LINE	Update our full filter extents. 
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
NULL_RECT	TokenNameIdentifier	 NULL  RECT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
r2d	TokenNameIdentifier	 r2d
;	TokenNameSEMICOLON	
//else ret = ret.createUnion(r2d); 	TokenNameCOMMENT_LINE	else ret = ret.createUnion(r2d); 
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
fromBounds	TokenNameIdentifier	 from Bounds
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
==	TokenNameEQUAL_EQUAL	
NULL_RECT	TokenNameIdentifier	 NULL  RECT
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getNodeDirtyRegion	TokenNameIdentifier	 get Node Dirty Region
(	TokenNameLPAREN	
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNodeDirtyRegion	TokenNameIdentifier	 get Node Dirty Region
(	TokenNameLPAREN	
gn	TokenNameIdentifier	 gn
,	TokenNameCOMMA	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receives notification of a change to a GraphicsNode. * @param gnce The event object describing the GraphicsNode change. */	TokenNameCOMMENT_JAVADOC	 Receives notification of a change to a GraphicsNode. @param gnce The event object describing the GraphicsNode change. 
public	TokenNamepublic	
void	TokenNamevoid	
changeStarted	TokenNameIdentifier	 change Started
(	TokenNameLPAREN	
GraphicsNodeChangeEvent	TokenNameIdentifier	 Graphics Node Change Event
gnce	TokenNameIdentifier	 gnce
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("A node has changed for: " + this); 	TokenNameCOMMENT_LINE	System.out.println("A node has changed for: " + this); 
GraphicsNode	TokenNameIdentifier	 Graphics Node
gn	TokenNameIdentifier	 gn
=	TokenNameEQUAL	
gnce	TokenNameIdentifier	 gnce
.	TokenNameDOT	
getGraphicsNode	TokenNameIdentifier	 get Graphics Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WeakReference	TokenNameIdentifier	 Weak Reference
gnWRef	TokenNameIdentifier	 gn W Ref
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getWeakReference	TokenNameIdentifier	 get Weak Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
doPut	TokenNameIdentifier	 do Put
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doPut	TokenNameIdentifier	 do Put
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
doPut	TokenNameIdentifier	 do Put
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doPut	TokenNameIdentifier	 do Put
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
)	TokenNameRPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
GraphicsNode	TokenNameIdentifier	 Graphics Node
chngSrc	TokenNameIdentifier	 chng Src
=	TokenNameEQUAL	
gnce	TokenNameIdentifier	 gnce
.	TokenNameDOT	
getChangeSrc	TokenNameIdentifier	 get Change Src
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
rgn	TokenNameIdentifier	 rgn
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chngSrc	TokenNameIdentifier	 chng Src
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A child node is moving in the tree so assign it's dirty 	TokenNameCOMMENT_LINE	A child node is moving in the tree so assign it's dirty 
// regions to this node before it moves. 	TokenNameCOMMENT_LINE	regions to this node before it moves. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
drgn	TokenNameIdentifier	 drgn
=	TokenNameEQUAL	
getNodeDirtyRegion	TokenNameIdentifier	 get Node Dirty Region
(	TokenNameLPAREN	
chngSrc	TokenNameIdentifier	 chng Src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
drgn	TokenNameIdentifier	 drgn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
rgn	TokenNameIdentifier	 rgn
=	TokenNameEQUAL	
new	TokenNamenew	
ChngSrcRect	TokenNameIdentifier	 Chng Src Rect
(	TokenNameLPAREN	
drgn	TokenNameIdentifier	 drgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Otherwise just use gn's current region. 	TokenNameCOMMENT_LINE	Otherwise just use gn's current region. 
rgn	TokenNameIdentifier	 rgn
=	TokenNameEQUAL	
gn	TokenNameIdentifier	 gn
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add this dirty region to any existing dirty region. 	TokenNameCOMMENT_LINE	Add this dirty region to any existing dirty region. 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r2d	TokenNameIdentifier	 r2d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
fromBounds	TokenNameIdentifier	 from Bounds
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rgn	TokenNameIdentifier	 rgn
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
!=	TokenNameNOT_EQUAL	
NULL_RECT	TokenNameIdentifier	 NULL  RECT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("GN: " + gn); 	TokenNameCOMMENT_LINE	System.err.println("GN: " + gn); 
// System.err.println("R2d: " + r2d); 	TokenNameCOMMENT_LINE	System.err.println("R2d: " + r2d); 
// System.err.println("Rgn: " + rgn); 	TokenNameCOMMENT_LINE	System.err.println("Rgn: " + rgn); 
//r2d = r2d.createUnion(rgn); 	TokenNameCOMMENT_LINE	r2d = r2d.createUnion(rgn); 
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rgn	TokenNameIdentifier	 rgn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("Union: " + r2d); 	TokenNameCOMMENT_LINE	System.err.println("Union: " + r2d); 
}	TokenNameRBRACE	
else	TokenNameelse	
r2d	TokenNameIdentifier	 r2d
=	TokenNameEQUAL	
rgn	TokenNameIdentifier	 rgn
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if ((gn instanceof CompositeGraphicsNode) && 	TokenNameCOMMENT_LINE	if ((gn instanceof CompositeGraphicsNode) && 
// (r2d.getWidth() > 200)) { 	TokenNameCOMMENT_LINE	(r2d.getWidth() > 200)) { 
// new Exception("Adding Large: " + gn).printStackTrace(); 	TokenNameCOMMENT_LINE	new Exception("Adding Large: " + gn).printStackTrace(); 
// } 	TokenNameCOMMENT_LINE	} 
// Store the bounds for the future. 	TokenNameCOMMENT_LINE	Store the bounds for the future. 
if	TokenNameif	
(	TokenNameLPAREN	
r2d	TokenNameIdentifier	 r2d
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
r2d	TokenNameIdentifier	 r2d
=	TokenNameEQUAL	
NULL_RECT	TokenNameIdentifier	 NULL  RECT
;	TokenNameSEMICOLON	
fromBounds	TokenNameIdentifier	 from Bounds
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
gnWRef	TokenNameIdentifier	 gn W Ref
,	TokenNameCOMMA	
r2d	TokenNameIdentifier	 r2d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
ChngSrcRect	TokenNameIdentifier	 Chng Src Rect
extends	TokenNameextends	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
{	TokenNameLBRACE	
ChngSrcRect	TokenNameIdentifier	 Chng Src Rect
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r2d	TokenNameIdentifier	 r2d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
r2d	TokenNameIdentifier	 r2d
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Clears the tracker. */	TokenNameCOMMENT_JAVADOC	 Clears the tracker. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dirtyNodes	TokenNameIdentifier	 dirty Nodes
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
