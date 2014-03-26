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
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
GraphicContext	TokenNameIdentifier	 Graphic Context
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
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
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
/** * This class is used by the Graphics2D SVG Generator to manage * a group of Nodes that can later be added to the SVG DOM Tree * managed by the DOMTreeManager. * * There are two rules that control how children nodes are * added to the group managed by this class: * * + Children node are added to the group as long as * there is no more than n graphic context overrides needed to * describe the children style. A graphic context override * happens when style attributes need to be added to a child * node to reflect the state of the graphic context at the * time the child was added. Note that the opacity is never * reflected in a group node and therefore, is not accounted * for in the number of overrides. The number of overrides can * be configured and defaults to 2. * + Children nodes are added to the current group as long as * the associated GraphicContext's transform stack is valid. * * When children nodes can no longer be added, the group is considered * complete and the associated DOMTreeManager is notified of the * availability of a completed group. Then, a new group is started. * <br> * The DOMTreeManager is also notified every thime a new element * is added to the current group. This is needed to let the * DOMTreeManager handle group managers that would be used concurrently. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: DOMGroupManager.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class is used by the Graphics2D SVG Generator to manage a group of Nodes that can later be added to the SVG DOM Tree managed by the DOMTreeManager. * There are two rules that control how children nodes are added to the group managed by this class: * + Children node are added to the group as long as there is no more than n graphic context overrides needed to describe the children style. A graphic context override happens when style attributes need to be added to a child node to reflect the state of the graphic context at the time the child was added. Note that the opacity is never reflected in a group node and therefore, is not accounted for in the number of overrides. The number of overrides can be configured and defaults to 2. + Children nodes are added to the current group as long as the associated GraphicContext's transform stack is valid. * When children nodes can no longer be added, the group is considered complete and the associated DOMTreeManager is notified of the availability of a completed group. Then, a new group is started. <br> The DOMTreeManager is also notified every thime a new element is added to the current group. This is needed to let the DOMTreeManager handle group managers that would be used concurrently. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: DOMGroupManager.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
implements	TokenNameimplements	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
DRAW	TokenNameIdentifier	 DRAW
=	TokenNameEQUAL	
0x01	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FILL	TokenNameIdentifier	 FILL
=	TokenNameEQUAL	
0x10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Reference to the GraphicContext this manager will use to * reflect style attributes in the tree nodes. */	TokenNameCOMMENT_JAVADOC	 Reference to the GraphicContext this manager will use to reflect style attributes in the tree nodes. 
protected	TokenNameprotected	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
;	TokenNameSEMICOLON	
/** * DOMTreeManager that this group manager cooperates with */	TokenNameCOMMENT_JAVADOC	 DOMTreeManager that this group manager cooperates with 
protected	TokenNameprotected	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
domTreeManager	TokenNameIdentifier	 dom Tree Manager
;	TokenNameSEMICOLON	
/** * Current group's SVG GraphicContext state */	TokenNameCOMMENT_JAVADOC	 Current group's SVG GraphicContext state 
protected	TokenNameprotected	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
groupGC	TokenNameIdentifier	 group GC
;	TokenNameSEMICOLON	
/** * Current group node */	TokenNameCOMMENT_JAVADOC	 Current group node 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
currentGroup	TokenNameIdentifier	 current Group
;	TokenNameSEMICOLON	
/** * Constructor * @param gc graphic context whose state will be reflected in the * element's style attributes. * @param domTreeManager DOMTreeManager instance this group manager * cooperates with. */	TokenNameCOMMENT_JAVADOC	 Constructor @param gc graphic context whose state will be reflected in the element's style attributes. @param domTreeManager DOMTreeManager instance this group manager cooperates with. 
public	TokenNamepublic	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
,	TokenNameCOMMA	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
domTreeManager	TokenNameIdentifier	 dom Tree Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_GC_NULL	TokenNameIdentifier	 ERR  GC  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_DOMTREEMANAGER_NULL	TokenNameIdentifier	 ERR  DOMTREEMANAGER  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gc	TokenNameIdentifier	 gc
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
;	TokenNameSEMICOLON	
// Start with a new Top Level Group 	TokenNameCOMMENT_LINE	Start with a new Top Level Group 
recycleCurrentGroup	TokenNameIdentifier	 recycle Current Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Build the default GC descriptor 	TokenNameCOMMENT_LINE	Build the default GC descriptor 
groupGC	TokenNameIdentifier	 group GC
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
gcConverter	TokenNameIdentifier	 gc Converter
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the state of this object to handle a new currentGroup */	TokenNameCOMMENT_JAVADOC	 Reset the state of this object to handle a new currentGroup 
void	TokenNamevoid	
recycleCurrentGroup	TokenNameIdentifier	 recycle Current Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Create new initial current group node 	TokenNameCOMMENT_LINE	Create new initial current group node 
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getDOMFactory	TokenNameIdentifier	 get DOM Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a node to the current group, if possible * @param element child Element to add to the group */	TokenNameCOMMENT_JAVADOC	 Adds a node to the current group, if possible @param element child Element to add to the group 
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
DRAW	TokenNameIdentifier	 DRAW
|	TokenNameOR	
FILL	TokenNameIdentifier	 FILL
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a node to the current group, if possible * @param element child Element to add to the group */	TokenNameCOMMENT_JAVADOC	 Adds a node to the current group, if possible @param element child Element to add to the group 
public	TokenNamepublic	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
short	TokenNameshort	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// If this is the first child to be added to the 	TokenNameCOMMENT_LINE	If this is the first child to be added to the 
// currentGroup, 'freeze' the style attributes. 	TokenNameCOMMENT_LINE	currentGroup, 'freeze' the style attributes. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
currentGroup	TokenNameIdentifier	 current Group
.	TokenNameDOT	
hasChildNodes	TokenNameIdentifier	 has Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentGroup	TokenNameIdentifier	 current Group
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
groupGC	TokenNameIdentifier	 group GC
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
gcConverter	TokenNameIdentifier	 gc Converter
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
deltaGC	TokenNameIdentifier	 delta GC
;	TokenNameSEMICOLON	
deltaGC	TokenNameIdentifier	 delta GC
=	TokenNameEQUAL	
processDeltaGC	TokenNameIdentifier	 process Delta GC
(	TokenNameLPAREN	
groupGC	TokenNameIdentifier	 group GC
,	TokenNameCOMMA	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
defaultGC	TokenNameIdentifier	 default GC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getStyleHandler	TokenNameIdentifier	 get Style Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setStyle	TokenNameIdentifier	 set Style
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
,	TokenNameCOMMA	
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getGroupContext	TokenNameIdentifier	 get Group Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getGeneratorContext	TokenNameIdentifier	 get Generator Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
&	TokenNameAND	
DRAW	TokenNameIdentifier	 DRAW
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// force stroke:none 	TokenNameCOMMENT_LINE	force stroke:none 
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getGraphicElementContext	TokenNameIdentifier	 get Graphic Element Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_STROKE_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  ATTRIBUTE
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
&	TokenNameAND	
FILL	TokenNameIdentifier	 FILL
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// force fill:none 	TokenNameCOMMENT_LINE	force fill:none 
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getGraphicElementContext	TokenNameIdentifier	 get Graphic Element Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_FILL_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  ATTRIBUTE
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getStyleHandler	TokenNameIdentifier	 get Style Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setStyle	TokenNameIdentifier	 set Style
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getGraphicElementContext	TokenNameIdentifier	 get Graphic Element Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getGeneratorContext	TokenNameIdentifier	 get Generator Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
,	TokenNameCOMMA	
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getTransformStack	TokenNameIdentifier	 get Transform Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
appendGroup	TokenNameIdentifier	 append Group
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
isTransformStackValid	TokenNameIdentifier	 is Transform Stack Valid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// There are children nodes already. Find 	TokenNameCOMMENT_LINE	There are children nodes already. Find 
// out delta between current gc and group 	TokenNameCOMMENT_LINE	out delta between current gc and group 
// context 	TokenNameCOMMENT_LINE	context 
// 	TokenNameCOMMENT_LINE	 
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
elementGC	TokenNameIdentifier	 element GC
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
gcConverter	TokenNameIdentifier	 gc Converter
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
deltaGC	TokenNameIdentifier	 delta GC
=	TokenNameEQUAL	
processDeltaGC	TokenNameIdentifier	 process Delta GC
(	TokenNameLPAREN	
elementGC	TokenNameIdentifier	 element GC
,	TokenNameCOMMA	
groupGC	TokenNameIdentifier	 group GC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If there are less than the maximum number 	TokenNameCOMMENT_LINE	If there are less than the maximum number 
// of differences, then add the node to the current 	TokenNameCOMMENT_LINE	of differences, then add the node to the current 
// group and set its attributes 	TokenNameCOMMENT_LINE	group and set its attributes 
trimContextForElement	TokenNameIdentifier	 trim Context For Element
(	TokenNameLPAREN	
deltaGC	TokenNameIdentifier	 delta GC
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
countOverrides	TokenNameIdentifier	 count Overrides
(	TokenNameLPAREN	
deltaGC	TokenNameIdentifier	 delta GC
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
maxGCOverrides	TokenNameIdentifier	 max GC Overrides
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentGroup	TokenNameIdentifier	 current Group
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// as there already are children we put all 	TokenNameCOMMENT_LINE	as there already are children we put all 
// attributes (group + element) on the element itself. 	TokenNameCOMMENT_LINE	attributes (group + element) on the element itself. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
&	TokenNameAND	
DRAW	TokenNameIdentifier	 DRAW
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// force stroke:none 	TokenNameCOMMENT_LINE	force stroke:none 
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_STROKE_ATTRIBUTE	TokenNameIdentifier	 SVG  STROKE  ATTRIBUTE
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
method	TokenNameIdentifier	 method
&	TokenNameAND	
FILL	TokenNameIdentifier	 FILL
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// force fill:none 	TokenNameCOMMENT_LINE	force fill:none 
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_FILL_ATTRIBUTE	TokenNameIdentifier	 SVG  FILL  ATTRIBUTE
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getStyleHandler	TokenNameIdentifier	 get Style Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setStyle	TokenNameIdentifier	 set Style
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getGeneratorContext	TokenNameIdentifier	 get Generator Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getTransformStack	TokenNameIdentifier	 get Transform Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Need to create a new current group 	TokenNameCOMMENT_LINE	Need to create a new current group 
// 	TokenNameCOMMENT_LINE	 
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getDOMFactory	TokenNameIdentifier	 get DOM Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Transform stack is invalid. Create a new current 	TokenNameCOMMENT_LINE	Transform stack is invalid. Create a new current 
// group and validate the stack 	TokenNameCOMMENT_LINE	group and validate the stack 
// 	TokenNameCOMMENT_LINE	 
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
getDOMFactory	TokenNameIdentifier	 get DOM Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
validateTransformStack	TokenNameIdentifier	 validate Transform Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
method	TokenNameIdentifier	 method
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Analyses the Map to define how many attributes constitute * overrides. Only differences in the group context are considered * overrides. */	TokenNameCOMMENT_JAVADOC	 Analyses the Map to define how many attributes constitute overrides. Only differences in the group context are considered overrides. 
protected	TokenNameprotected	
int	TokenNameint	
countOverrides	TokenNameIdentifier	 count Overrides
(	TokenNameLPAREN	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
deltaGC	TokenNameIdentifier	 delta GC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
deltaGC	TokenNameIdentifier	 delta GC
.	TokenNameDOT	
getGroupContext	TokenNameIdentifier	 get Group Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes properties that do not apply for a specific element */	TokenNameCOMMENT_JAVADOC	 Removes properties that do not apply for a specific element 
protected	TokenNameprotected	
void	TokenNamevoid	
trimContextForElement	TokenNameIdentifier	 trim Context For Element
(	TokenNameLPAREN	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
svgGC	TokenNameIdentifier	 svg GC
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tag	TokenNameIdentifier	 tag
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
groupAttrMap	TokenNameIdentifier	 group Attr Map
=	TokenNameEQUAL	
svgGC	TokenNameIdentifier	 svg GC
.	TokenNameDOT	
getGroupContext	TokenNameIdentifier	 get Group Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// For each attribute, check if there is an attribute 	TokenNameCOMMENT_LINE	For each attribute, check if there is an attribute 
// descriptor. If there is, check if the attribute 	TokenNameCOMMENT_LINE	descriptor. If there is, check if the attribute 
// applies to the input element. If there is none, 	TokenNameCOMMENT_LINE	applies to the input element. If there is none, 
// assume the attribute applies to the element. 	TokenNameCOMMENT_LINE	assume the attribute applies to the element. 
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
groupAttrMap	TokenNameIdentifier	 group Attr Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGAttribute	TokenNameIdentifier	 SVG Attribute
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
SVGAttributeMap	TokenNameIdentifier	 SVG Attribute Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
appliesTo	TokenNameIdentifier	 applies To
(	TokenNameLPAREN	
tag	TokenNameIdentifier	 tag
)	TokenNameRPAREN	
)	TokenNameRPAREN	
groupAttrMap	TokenNameIdentifier	 group Attr Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
attrName	TokenNameIdentifier	 attr Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Processes the transform attribute value corresponding to a * given transform stack */	TokenNameCOMMENT_JAVADOC	 Processes the transform attribute value corresponding to a given transform stack 
protected	TokenNameprotected	
void	TokenNamevoid	
setTransform	TokenNameIdentifier	 set Transform
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
transformStack	TokenNameIdentifier	 transform Stack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
domTreeManager	TokenNameIdentifier	 dom Tree Manager
.	TokenNameDOT	
gcConverter	TokenNameIdentifier	 gc Converter
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
transformStack	TokenNameIdentifier	 transform Stack
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  TRANSFORM  ATTRIBUTE
,	TokenNameCOMMA	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Processes the difference between two graphic contexts. The values * in gc that are different from the values in referenceGc will be * present in the delta. Other values will no. */	TokenNameCOMMENT_JAVADOC	 Processes the difference between two graphic contexts. The values in gc that are different from the values in referenceGc will be present in the delta. Other values will no. 
static	TokenNamestatic	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
processDeltaGC	TokenNameIdentifier	 process Delta GC
(	TokenNameLPAREN	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
gc	TokenNameIdentifier	 gc
,	TokenNameCOMMA	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
referenceGc	TokenNameIdentifier	 reference Gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
groupDelta	TokenNameIdentifier	 group Delta
=	TokenNameEQUAL	
processDeltaMap	TokenNameIdentifier	 process Delta Map
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getGroupContext	TokenNameIdentifier	 get Group Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
referenceGc	TokenNameIdentifier	 reference Gc
.	TokenNameDOT	
getGroupContext	TokenNameIdentifier	 get Group Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
graphicElementDelta	TokenNameIdentifier	 graphic Element Delta
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getGraphicElementContext	TokenNameIdentifier	 get Graphic Element Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
gcTransformStack	TokenNameIdentifier	 gc Transform Stack
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getTransformStack	TokenNameIdentifier	 get Transform Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
referenceStack	TokenNameIdentifier	 reference Stack
=	TokenNameEQUAL	
referenceGc	TokenNameIdentifier	 reference Gc
.	TokenNameDOT	
getTransformStack	TokenNameIdentifier	 get Transform Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
deltaStackLength	TokenNameIdentifier	 delta Stack Length
=	TokenNameEQUAL	
gcTransformStack	TokenNameIdentifier	 gc Transform Stack
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
referenceStack	TokenNameIdentifier	 reference Stack
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
deltaTransformStack	TokenNameIdentifier	 delta Transform Stack
=	TokenNameEQUAL	
new	TokenNamenew	
TransformStackElement	TokenNameIdentifier	 Transform Stack Element
[	TokenNameLBRACKET	
deltaStackLength	TokenNameIdentifier	 delta Stack Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
gcTransformStack	TokenNameIdentifier	 gc Transform Stack
,	TokenNameCOMMA	
referenceStack	TokenNameIdentifier	 reference Stack
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
deltaTransformStack	TokenNameIdentifier	 delta Transform Stack
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
deltaStackLength	TokenNameIdentifier	 delta Stack Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** System.err.println("gc transform stack length: " + gc.getTransformStack().length); System.err.println("reference stack length : " + referenceGc.getTransformStack().length); System.err.println("delta stack length : " + deltaTransformStack.length); */	TokenNameCOMMENT_JAVADOC	 System.err.println("gc transform stack length: " + gc.getTransformStack().length); System.err.println("reference stack length : " + referenceGc.getTransformStack().length); System.err.println("delta stack length : " + deltaTransformStack.length); 
/* TransformStackElement gcStack[] = gc.getTransformStack(); for(int i=0; i<gcStack.length; i++) System.err.println("gcStack[" + i + "] = " + gcStack[i].toString()); TransformStackElement refStack[] = referenceGc.getTransformStack(); for(int i=0; i<refStack.length; i++) System.err.println("refStack[" + i + "] = " + refStack[i].toString()); for(int i=0; i<deltaTransformStack.length; i++) System.err.println("deltaStack[" + i + "] = " + deltaTransformStack[i].toString()); */	TokenNameCOMMENT_BLOCK	 TransformStackElement gcStack[] = gc.getTransformStack(); for(int i=0; i<gcStack.length; i++) System.err.println("gcStack[" + i + "] = " + gcStack[i].toString()); TransformStackElement refStack[] = referenceGc.getTransformStack(); for(int i=0; i<refStack.length; i++) System.err.println("refStack[" + i + "] = " + refStack[i].toString()); for(int i=0; i<deltaTransformStack.length; i++) System.err.println("deltaStack[" + i + "] = " + deltaTransformStack[i].toString()); 
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
deltaGC	TokenNameIdentifier	 delta GC
=	TokenNameEQUAL	
new	TokenNamenew	
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
(	TokenNameLPAREN	
groupDelta	TokenNameIdentifier	 group Delta
,	TokenNameCOMMA	
graphicElementDelta	TokenNameIdentifier	 graphic Element Delta
,	TokenNameCOMMA	
deltaTransformStack	TokenNameIdentifier	 delta Transform Stack
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
deltaGC	TokenNameIdentifier	 delta GC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Processes the difference between two Maps. The code assumes * that the input Maps have the same key sets. Values in map that * are different from values in referenceMap are place in the * returned delta Map. */	TokenNameCOMMENT_JAVADOC	 Processes the difference between two Maps. The code assumes that the input Maps have the same key sets. Values in map that are different from values in referenceMap are place in the returned delta Map. 
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
processDeltaMap	TokenNameIdentifier	 process Delta Map
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
referenceMap	TokenNameIdentifier	 reference Map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no need to be synch => HashMap 	TokenNameCOMMENT_LINE	no need to be synch => HashMap 
Map	TokenNameIdentifier	 Map
mapDelta	TokenNameIdentifier	 map Delta
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
refValue	TokenNameIdentifier	 ref Value
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
referenceMap	TokenNameIdentifier	 reference Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
refValue	TokenNameIdentifier	 ref Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/*if(key.equals(SVG_TRANSFORM_ATTRIBUTE)){ // Special handling for the transform attribute. // At this point in the processing, the transform // in map has to be a substring of the one in // referenceMap. see the addElement member. value = value.substring(refValue.length()).trim(); }*/	TokenNameCOMMENT_BLOCK	if(key.equals(SVG_TRANSFORM_ATTRIBUTE)){ // Special handling for the transform attribute. // At this point in the processing, the transform // in map has to be a substring of the one in // referenceMap. see the addElement member. value = value.substring(refValue.length()).trim(); }
mapDelta	TokenNameIdentifier	 map Delta
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
mapDelta	TokenNameIdentifier	 map Delta
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
