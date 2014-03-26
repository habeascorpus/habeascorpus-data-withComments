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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Comment	TokenNameIdentifier	 Comment
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * This class is used by the SVGGraphics2D SVG Generator to manage * addition of new Nodes to the SVG DOM Tree. This class handles * a set of DOMGroupManager objects that can all append to the * top level group managed by this class. This allows multiple * SVGGraphics2D instances, created from the same SVGGraphics2D * through the various create methods, to append to the same * SVG document and keep the rendering order correct. * * The root node managed by this DOMTreeManager contains two children: * a top level group node and a top level defs node. The top level * defs node contains the definition of common SVG entities such as * the various AlphaComposite rules. Note that other defs can also be * created under the top level group, for example to represent * gradient or pattern paints. * <br> * [svg] * | * +-- [defs] Contain generic definitions * +-- [g] Top level group * | * +-- [defs] Contains definitions specific to rendering * +-- [g] Group 1 * +-- ... * +-- [g] Group n * * @author <a href="mailto:cjolif">Christophe Jolif</a> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: DOMTreeManager.java 522302 2007-03-25 17:04:48Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class is used by the SVGGraphics2D SVG Generator to manage addition of new Nodes to the SVG DOM Tree. This class handles a set of DOMGroupManager objects that can all append to the top level group managed by this class. This allows multiple SVGGraphics2D instances, created from the same SVGGraphics2D through the various create methods, to append to the same SVG document and keep the rendering order correct. * The root node managed by this DOMTreeManager contains two children: a top level group node and a top level defs node. The top level defs node contains the definition of common SVG entities such as the various AlphaComposite rules. Note that other defs can also be created under the top level group, for example to represent gradient or pattern paints. <br> [svg] | +-- [defs] Contain generic definitions +-- [g] Top level group | +-- [defs] Contains definitions specific to rendering +-- [g] Group 1 +-- ... +-- [g] Group n * @author <a href="mailto:cjolif">Christophe Jolif</a> @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: DOMTreeManager.java 522302 2007-03-25 17:04:48Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
implements	TokenNameimplements	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
/** * Maximum of Graphic Context attributes overrides * in children of the current group. */	TokenNameCOMMENT_JAVADOC	 Maximum of Graphic Context attributes overrides in children of the current group. 
int	TokenNameint	
maxGCOverrides	TokenNameIdentifier	 max GC Overrides
;	TokenNameSEMICOLON	
/** * Set of group managers that build groups for * this manager. * The synchronizedList is part of the fix for bug #40686 */	TokenNameCOMMENT_JAVADOC	 Set of group managers that build groups for this manager. The synchronizedList is part of the fix for bug #40686 
protected	TokenNameprotected	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
groupManagers	TokenNameIdentifier	 group Managers
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
synchronizedList	TokenNameIdentifier	 synchronized List
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set of definitions that are to be placed at the top of the * document tree */	TokenNameCOMMENT_JAVADOC	 Set of definitions that are to be placed at the top of the document tree 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
genericDefSet	TokenNameIdentifier	 generic Def Set
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Default SVG GraphicContext state */	TokenNameCOMMENT_JAVADOC	 Default SVG GraphicContext state 
SVGGraphicContext	TokenNameIdentifier	 SVG Graphic Context
defaultGC	TokenNameIdentifier	 default GC
;	TokenNameSEMICOLON	
/** * Top level group */	TokenNameCOMMENT_JAVADOC	 Top level group 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
topLevelGroup	TokenNameIdentifier	 top Level Group
;	TokenNameSEMICOLON	
/** * Used to convert the Java 2D API graphic context state * into the SVG equivalent set of attributes and related * definitions */	TokenNameCOMMENT_JAVADOC	 Used to convert the Java 2D API graphic context state into the SVG equivalent set of attributes and related definitions 
SVGGraphicContextConverter	TokenNameIdentifier	 SVG Graphic Context Converter
gcConverter	TokenNameIdentifier	 gc Converter
;	TokenNameSEMICOLON	
/** * The context that stores the domFactory, the imageHandler * and the extensionHandler. */	TokenNameCOMMENT_JAVADOC	 The context that stores the domFactory, the imageHandler and the extensionHandler. 
protected	TokenNameprotected	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
;	TokenNameSEMICOLON	
/** * Converters used bVy this object to translate graphic context * attributes */	TokenNameCOMMENT_JAVADOC	 Converters used bVy this object to translate graphic context attributes 
protected	TokenNameprotected	
SVGBufferedImageOp	TokenNameIdentifier	 SVG Buffered Image Op
filterConverter	TokenNameIdentifier	 filter Converter
;	TokenNameSEMICOLON	
/** * Set of definitions which can be used by custom extensions */	TokenNameCOMMENT_JAVADOC	 Set of definitions which can be used by custom extensions 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
otherDefs	TokenNameIdentifier	 other Defs
;	TokenNameSEMICOLON	
/** * Constructor * @param gc default graphic context state * @param generatorContext the SVG generator context * @param maxGCOverrides defines how many overrides are allowed * in children nodes of the current group. */	TokenNameCOMMENT_JAVADOC	 Constructor @param gc default graphic context state @param generatorContext the SVG generator context @param maxGCOverrides defines how many overrides are allowed in children nodes of the current group. 
public	TokenNamepublic	
DOMTreeManager	TokenNameIdentifier	 DOM Tree Manager
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
,	TokenNameCOMMA	
int	TokenNameint	
maxGCOverrides	TokenNameIdentifier	 max GC Overrides
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
maxGCOverrides	TokenNameIdentifier	 max GC Overrides
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_MAXGCOVERRIDES_OUTOFRANGE	TokenNameIdentifier	 ERR  MAXGCOVERRIDES  OUTOFRANGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_CONTEXT_NULL	TokenNameIdentifier	 ERR  CONTEXT  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
generatorContext	TokenNameIdentifier	 generator Context
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxGCOverrides	TokenNameIdentifier	 max GC Overrides
=	TokenNameEQUAL	
maxGCOverrides	TokenNameIdentifier	 max GC Overrides
;	TokenNameSEMICOLON	
// Start with a new Top Level Group 	TokenNameCOMMENT_LINE	Start with a new Top Level Group 
recycleTopLevelGroup	TokenNameIdentifier	 recycle Top Level Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Build the default GC descriptor 	TokenNameCOMMENT_LINE	Build the default GC descriptor 
defaultGC	TokenNameIdentifier	 default GC
=	TokenNameEQUAL	
gcConverter	TokenNameIdentifier	 gc Converter
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param groupManager new DOMGroupManager to add to the list of * managers that collaborate with this tree manager. */	TokenNameCOMMENT_JAVADOC	 @param groupManager new DOMGroupManager to add to the list of managers that collaborate with this tree manager. 
public	TokenNamepublic	
void	TokenNamevoid	
addGroupManager	TokenNameIdentifier	 add Group Manager
(	TokenNameLPAREN	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
groupManager	TokenNameIdentifier	 group Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupManager	TokenNameIdentifier	 group Manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
groupManagers	TokenNameIdentifier	 group Managers
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
groupManager	TokenNameIdentifier	 group Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param groupManager DOMGroupManager to remove from the list of * managers that collaborate with this tree manager */	TokenNameCOMMENT_JAVADOC	 @param groupManager DOMGroupManager to remove from the list of managers that collaborate with this tree manager 
public	TokenNamepublic	
void	TokenNamevoid	
removeGroupManager	TokenNameIdentifier	 remove Group Manager
(	TokenNameLPAREN	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
groupManager	TokenNameIdentifier	 group Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupManager	TokenNameIdentifier	 group Manager
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
groupManagers	TokenNameIdentifier	 group Managers
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
groupManager	TokenNameIdentifier	 group Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * When a group is appended to the tree by this call, all the * other group managers are requested to start new groups, in * order to preserve the Z-order. * * @param group new group to be appended to the topLevelGroup * @param groupManager DOMTreeManager that produced the group. */	TokenNameCOMMENT_JAVADOC	 When a group is appended to the tree by this call, all the other group managers are requested to start new groups, in order to preserve the Z-order. * @param group new group to be appended to the topLevelGroup @param groupManager DOMTreeManager that produced the group. 
public	TokenNamepublic	
void	TokenNamevoid	
appendGroup	TokenNameIdentifier	 append Group
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
groupManager	TokenNameIdentifier	 group Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
topLevelGroup	TokenNameIdentifier	 top Level Group
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
groupManagers	TokenNameIdentifier	 group Managers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we want to prevent that the groupManagers-list changes while 	TokenNameCOMMENT_LINE	we want to prevent that the groupManagers-list changes while 
// we iterate over it. If that would happen, we might skip entries 	TokenNameCOMMENT_LINE	we iterate over it. If that would happen, we might skip entries 
// within the list or ignore new entries at the end. Fix #40686 	TokenNameCOMMENT_LINE	within the list or ignore new entries at the end. Fix #40686 
int	TokenNameint	
nManagers	TokenNameIdentifier	 n Managers
=	TokenNameEQUAL	
groupManagers	TokenNameIdentifier	 group Managers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
nManagers	TokenNameIdentifier	 n Managers
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
gm	TokenNameIdentifier	 gm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
)	TokenNameRPAREN	
groupManagers	TokenNameIdentifier	 group Managers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
gm	TokenNameIdentifier	 gm
!=	TokenNameNOT_EQUAL	
groupManager	TokenNameIdentifier	 group Manager
)	TokenNameRPAREN	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
recycleCurrentGroup	TokenNameIdentifier	 recycle Current Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reset the state of this object to handler a new topLevelGroup */	TokenNameCOMMENT_JAVADOC	 Reset the state of this object to handler a new topLevelGroup 
protected	TokenNameprotected	
void	TokenNamevoid	
recycleTopLevelGroup	TokenNameIdentifier	 recycle Top Level Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
recycleTopLevelGroup	TokenNameIdentifier	 recycle Top Level Group
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reset the state of this object to handler a new topLevelGroup */	TokenNameCOMMENT_JAVADOC	 Reset the state of this object to handler a new topLevelGroup 
protected	TokenNameprotected	
void	TokenNamevoid	
recycleTopLevelGroup	TokenNameIdentifier	 recycle Top Level Group
(	TokenNameLPAREN	
boolean	TokenNameboolean	
recycleConverters	TokenNameIdentifier	 recycle Converters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First, recycle group managers 	TokenNameCOMMENT_LINE	First, recycle group managers 
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
groupManagers	TokenNameIdentifier	 group Managers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we want to prevent that the groupManagers-list changes while 	TokenNameCOMMENT_LINE	we want to prevent that the groupManagers-list changes while 
// we iterate over it. If that would happen, we might skip entries 	TokenNameCOMMENT_LINE	we iterate over it. If that would happen, we might skip entries 
// within the list or ignore new entries at the end. Fix #40686 	TokenNameCOMMENT_LINE	within the list or ignore new entries at the end. Fix #40686 
int	TokenNameint	
nManagers	TokenNameIdentifier	 n Managers
=	TokenNameEQUAL	
groupManagers	TokenNameIdentifier	 group Managers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
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
nManagers	TokenNameIdentifier	 n Managers
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
gm	TokenNameIdentifier	 gm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DOMGroupManager	TokenNameIdentifier	 DOM Group Manager
)	TokenNameRPAREN	
groupManagers	TokenNameIdentifier	 group Managers
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gm	TokenNameIdentifier	 gm
.	TokenNameDOT	
recycleCurrentGroup	TokenNameIdentifier	 recycle Current Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Create top level group node 	TokenNameCOMMENT_LINE	Create top level group node 
topLevelGroup	TokenNameIdentifier	 top Level Group
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Build new converters 	TokenNameCOMMENT_LINE	Build new converters 
if	TokenNameif	
(	TokenNameLPAREN	
recycleConverters	TokenNameIdentifier	 recycle Converters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filterConverter	TokenNameIdentifier	 filter Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGBufferedImageOp	TokenNameIdentifier	 SVG Buffered Image Op
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gcConverter	TokenNameIdentifier	 gc Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGGraphicContextConverter	TokenNameIdentifier	 SVG Graphic Context Converter
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the topLevelGroup to the input element. This will throw an * exception if the input element is not of type 'g' or if it is * null. */	TokenNameCOMMENT_JAVADOC	 Sets the topLevelGroup to the input element. This will throw an exception if the input element is not of type 'g' or if it is null. 
public	TokenNamepublic	
void	TokenNamevoid	
setTopLevelGroup	TokenNameIdentifier	 set Top Level Group
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
topLevelGroup	TokenNameIdentifier	 top Level Group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
topLevelGroup	TokenNameIdentifier	 top Level Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_TOP_LEVEL_GROUP_NULL	TokenNameIdentifier	 ERR  TOP  LEVEL  GROUP  NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
SVG_G_TAG	TokenNameIdentifier	 SVG  G  TAG
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
topLevelGroup	TokenNameIdentifier	 top Level Group
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
SVGGraphics2DRuntimeException	TokenNameIdentifier	 SVG Graphics2 D Runtime Exception
(	TokenNameLPAREN	
ERR_TOP_LEVEL_GROUP_NOT_G	TokenNameIdentifier	 ERR  TOP  LEVEL  GROUP  NOT  G
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
recycleTopLevelGroup	TokenNameIdentifier	 recycle Top Level Group
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
topLevelGroup	TokenNameIdentifier	 top Level Group
=	TokenNameEQUAL	
topLevelGroup	TokenNameIdentifier	 top Level Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the root element with the generic definitions and * the topLevelGroup. */	TokenNameCOMMENT_JAVADOC	 Returns the root element with the generic definitions and the topLevelGroup. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the root element with the generic definitions and * the topLevelGroup. */	TokenNameCOMMENT_JAVADOC	 Returns the root element with the generic definitions and the topLevelGroup. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
svgElement	TokenNameIdentifier	 svg Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
svg	TokenNameIdentifier	 svg
=	TokenNameEQUAL	
svgElement	TokenNameIdentifier	 svg Element
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
svg	TokenNameIdentifier	 svg
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
svg	TokenNameIdentifier	 svg
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_SVG_TAG	TokenNameIdentifier	 SVG  SVG  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Enable background if required by AlphaComposite convertion 	TokenNameCOMMENT_LINE	Enable background if required by AlphaComposite convertion 
if	TokenNameif	
(	TokenNameLPAREN	
gcConverter	TokenNameIdentifier	 gc Converter
.	TokenNameDOT	
getCompositeConverter	TokenNameIdentifier	 get Composite Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getAlphaCompositeConverter	TokenNameIdentifier	 get Alpha Composite Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
requiresBackgroundAccess	TokenNameIdentifier	 requires Background Access
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ENABLE_BACKGROUND_ATTRIBUTE	TokenNameIdentifier	 SVG  ENABLE  BACKGROUND  ATTRIBUTE
,	TokenNameCOMMA	
SVG_NEW_VALUE	TokenNameIdentifier	 SVG  NEW  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
generatorComment	TokenNameIdentifier	 generator Comment
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Comment	TokenNameIdentifier	 Comment
generatorComment	TokenNameIdentifier	 generator Comment
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createComment	TokenNameIdentifier	 create Comment
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
generatorComment	TokenNameIdentifier	 generator Comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
generatorComment	TokenNameIdentifier	 generator Comment
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Set default rendering context attributes in node 	TokenNameCOMMENT_LINE	Set default rendering context attributes in node 
applyDefaultRenderingStyle	TokenNameIdentifier	 apply Default Rendering Style
(	TokenNameLPAREN	
svg	TokenNameIdentifier	 svg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
getGenericDefinitions	TokenNameIdentifier	 get Generic Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
getTopLevelGroup	TokenNameIdentifier	 get Top Level Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
applyDefaultRenderingStyle	TokenNameIdentifier	 apply Default Rendering Style
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
groupDefaults	TokenNameIdentifier	 group Defaults
=	TokenNameEQUAL	
defaultGC	TokenNameIdentifier	 default GC
.	TokenNameDOT	
getGroupContext	TokenNameIdentifier	 get Group Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
styleHandler	TokenNameIdentifier	 style Handler
.	TokenNameDOT	
setStyle	TokenNameIdentifier	 set Style
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
groupDefaults	TokenNameIdentifier	 group Defaults
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return a defs element that contains all the generic * definitions */	TokenNameCOMMENT_JAVADOC	 @return a defs element that contains all the generic definitions 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getGenericDefinitions	TokenNameIdentifier	 get Generic Definitions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// when called several times, this will create several generic 	TokenNameCOMMENT_LINE	when called several times, this will create several generic 
// definition elements... not sure it is desired behavior... 	TokenNameCOMMENT_LINE	definition elements... not sure it is desired behavior... 
Element	TokenNameIdentifier	 Element
genericDefs	TokenNameIdentifier	 generic Defs
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_DEFS_TAG	TokenNameIdentifier	 SVG  DEFS  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
genericDefSet	TokenNameIdentifier	 generic Def Set
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
genericDefs	TokenNameIdentifier	 generic Defs
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
genericDefs	TokenNameIdentifier	 generic Defs
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
ID_PREFIX_GENERIC_DEFS	TokenNameIdentifier	 ID  PREFIX  GENERIC  DEFS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
genericDefs	TokenNameIdentifier	 generic Defs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return the extension handler used by the DOMTreeManager. */	TokenNameCOMMENT_JAVADOC	 @return the extension handler used by the DOMTreeManager. 
public	TokenNamepublic	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
getExtensionHandler	TokenNameIdentifier	 get Extension Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
getExtensionHandler	TokenNameIdentifier	 get Extension Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This will change the extension handler on the * <code>SVGGeneratorContext</code>. * @param extensionHandler new extension handler this object should use */	TokenNameCOMMENT_JAVADOC	 This will change the extension handler on the <code>SVGGeneratorContext</code>. @param extensionHandler new extension handler this object should use 
void	TokenNamevoid	
setExtensionHandler	TokenNameIdentifier	 set Extension Handler
(	TokenNameLPAREN	
ExtensionHandler	TokenNameIdentifier	 Extension Handler
extensionHandler	TokenNameIdentifier	 extension Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
setExtensionHandler	TokenNameIdentifier	 set Extension Handler
(	TokenNameLPAREN	
extensionHandler	TokenNameIdentifier	 extension Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoking this method will return a set of definition element that * contain all the definitions referenced by the attributes generated by * the various converters. This also resets the converters. */	TokenNameCOMMENT_JAVADOC	 Invoking this method will return a set of definition element that contain all the definitions referenced by the attributes generated by the various converters. This also resets the converters. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// The definition set contains all the definitions minus 	TokenNameCOMMENT_LINE	The definition set contains all the definitions minus 
// any definition that has been placed in the generic definition set 	TokenNameCOMMENT_LINE	any definition that has been placed in the generic definition set 
// 	TokenNameCOMMENT_LINE	 
List	TokenNameIdentifier	 List
defSet	TokenNameIdentifier	 def Set
=	TokenNameEQUAL	
gcConverter	TokenNameIdentifier	 gc Converter
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
genericDefSet	TokenNameIdentifier	 generic Def Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
filterConverter	TokenNameIdentifier	 filter Converter
.	TokenNameDOT	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
otherDefs	TokenNameIdentifier	 other Defs
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
otherDefs	TokenNameIdentifier	 other Defs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
otherDefs	TokenNameIdentifier	 other Defs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Build new converters 	TokenNameCOMMENT_LINE	Build new converters 
filterConverter	TokenNameIdentifier	 filter Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGBufferedImageOp	TokenNameIdentifier	 SVG Buffered Image Op
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gcConverter	TokenNameIdentifier	 gc Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGGraphicContextConverter	TokenNameIdentifier	 SVG Graphic Context Converter
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
defSet	TokenNameIdentifier	 def Set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lets custom implementations for various extensions add * elements to the <defs> sections. */	TokenNameCOMMENT_JAVADOC	 Lets custom implementations for various extensions add elements to the <defs> sections. 
public	TokenNamepublic	
void	TokenNamevoid	
addOtherDef	TokenNameIdentifier	 add Other Def
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
definition	TokenNameIdentifier	 definition
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherDefs	TokenNameIdentifier	 other Defs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
otherDefs	TokenNameIdentifier	 other Defs
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
otherDefs	TokenNameIdentifier	 other Defs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
definition	TokenNameIdentifier	 definition
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoking this method will return a reference to the topLevelGroup * Element managed by this object. It will also cause this object * to start working with a new topLevelGroup. * * @return top level group */	TokenNameCOMMENT_JAVADOC	 Invoking this method will return a reference to the topLevelGroup Element managed by this object. It will also cause this object to start working with a new topLevelGroup. * @return top level group 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getTopLevelGroup	TokenNameIdentifier	 get Top Level Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
includeDefinitionSet	TokenNameIdentifier	 include Definition Set
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getTopLevelGroup	TokenNameIdentifier	 get Top Level Group
(	TokenNameLPAREN	
includeDefinitionSet	TokenNameIdentifier	 include Definition Set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invoking this method will return a reference to the topLevelGroup * Element managed by this object. It will also cause this object * to start working with a new topLevelGroup. * * @param includeDefinitionSet if true, the definition set is included and * the converters are reset (i.e., they start with an empty set * of definitions). * @return top level group */	TokenNameCOMMENT_JAVADOC	 Invoking this method will return a reference to the topLevelGroup Element managed by this object. It will also cause this object to start working with a new topLevelGroup. * @param includeDefinitionSet if true, the definition set is included and the converters are reset (i.e., they start with an empty set of definitions). @return top level group 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getTopLevelGroup	TokenNameIdentifier	 get Top Level Group
(	TokenNameLPAREN	
boolean	TokenNameboolean	
includeDefinitionSet	TokenNameIdentifier	 include Definition Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
topLevelGroup	TokenNameIdentifier	 top Level Group
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
topLevelGroup	TokenNameIdentifier	 top Level Group
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Include definition set if requested 	TokenNameCOMMENT_LINE	Include definition set if requested 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
includeDefinitionSet	TokenNameIdentifier	 include Definition Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
defSet	TokenNameIdentifier	 def Set
=	TokenNameEQUAL	
getDefinitionSet	TokenNameIdentifier	 get Definition Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
defElement	TokenNameIdentifier	 def Element
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
NodeList	TokenNameIdentifier	 Node List
defsElements	TokenNameIdentifier	 defs Elements
=	TokenNameEQUAL	
topLevelGroup	TokenNameIdentifier	 top Level Group
.	TokenNameDOT	
getElementsByTagName	TokenNameIdentifier	 get Elements By Tag Name
(	TokenNameLPAREN	
SVG_DEFS_TAG	TokenNameIdentifier	 SVG  DEFS  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defsElements	TokenNameIdentifier	 defs Elements
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
defElement	TokenNameIdentifier	 def Element
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
defsElements	TokenNameIdentifier	 defs Elements
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
defElement	TokenNameIdentifier	 def Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
defElement	TokenNameIdentifier	 def Element
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_DEFS_TAG	TokenNameIdentifier	 SVG  DEFS  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defElement	TokenNameIdentifier	 def Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
ID_PREFIX_DEFS	TokenNameIdentifier	 ID  PREFIX  DEFS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topLevelGroup	TokenNameIdentifier	 top Level Group
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
defElement	TokenNameIdentifier	 def Element
,	TokenNameCOMMA	
topLevelGroup	TokenNameIdentifier	 top Level Group
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
defSet	TokenNameIdentifier	 def Set
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
defElement	TokenNameIdentifier	 def Element
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If the definition set is included, then the converters have already 	TokenNameCOMMENT_LINE	If the definition set is included, then the converters have already 
// been recycled in getDefinitionSet. Otherwise, they should not be 	TokenNameCOMMENT_LINE	been recycled in getDefinitionSet. Otherwise, they should not be 
// recycled. So, in all cases, do not recycle the converters here. 	TokenNameCOMMENT_LINE	recycled. So, in all cases, do not recycle the converters here. 
recycleTopLevelGroup	TokenNameIdentifier	 recycle Top Level Group
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
topLevelGroup	TokenNameIdentifier	 top Level Group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGBufferedImageOp	TokenNameIdentifier	 SVG Buffered Image Op
getFilterConverter	TokenNameIdentifier	 get Filter Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filterConverter	TokenNameIdentifier	 filter Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGGraphicContextConverter	TokenNameIdentifier	 SVG Graphic Context Converter
getGraphicContextConverter	TokenNameIdentifier	 get Graphic Context Converter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gcConverter	TokenNameIdentifier	 gc Converter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
getGeneratorContext	TokenNameIdentifier	 get Generator Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
generatorContext	TokenNameIdentifier	 generator Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
getDOMFactory	TokenNameIdentifier	 get DOM Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StyleHandler	TokenNameIdentifier	 Style Handler
getStyleHandler	TokenNameIdentifier	 get Style Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
styleHandler	TokenNameIdentifier	 style Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
