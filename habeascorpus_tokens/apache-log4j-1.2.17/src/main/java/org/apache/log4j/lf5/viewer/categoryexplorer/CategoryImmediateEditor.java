/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
.	TokenNameDOT	
categoryexplorer	TokenNameIdentifier	 categoryexplorer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Dimension	TokenNameIdentifier	 Dimension
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseEvent	TokenNameIdentifier	 Mouse Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventObject	TokenNameIdentifier	 Event Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
Icon	TokenNameIdentifier	 Icon
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTree	TokenNameIdentifier	 J Tree
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
DefaultTreeCellEditor	TokenNameIdentifier	 Default Tree Cell Editor
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
TreePath	TokenNameIdentifier	 Tree Path
;	TokenNameSEMICOLON	
/** * CategoryImmediateEditor * * @author Michael J. Sikorsky * @author Robert Shaw */	TokenNameCOMMENT_JAVADOC	 CategoryImmediateEditor * @author Michael J. Sikorsky @author Robert Shaw 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryImmediateEditor	TokenNameIdentifier	 Category Immediate Editor
extends	TokenNameextends	
DefaultTreeCellEditor	TokenNameIdentifier	 Default Tree Cell Editor
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
CategoryNodeRenderer	TokenNameIdentifier	 Category Node Renderer
renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Icon	TokenNameIdentifier	 Icon
editingIcon	TokenNameIdentifier	 editing Icon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
CategoryImmediateEditor	TokenNameIdentifier	 Category Immediate Editor
(	TokenNameLPAREN	
JTree	TokenNameIdentifier	 J Tree
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
CategoryNodeRenderer	TokenNameIdentifier	 Category Node Renderer
renderer	TokenNameIdentifier	 renderer
,	TokenNameCOMMA	
CategoryNodeEditor	TokenNameIdentifier	 Category Node Editor
editor	TokenNameIdentifier	 editor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
renderer	TokenNameIdentifier	 renderer
,	TokenNameCOMMA	
editor	TokenNameIdentifier	 editor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
setIcon	TokenNameIdentifier	 set Icon
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
setLeafIcon	TokenNameIdentifier	 set Leaf Icon
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
setOpenIcon	TokenNameIdentifier	 set Open Icon
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
setClosedIcon	TokenNameIdentifier	 set Closed Icon
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
editingIcon	TokenNameIdentifier	 editing Icon
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldSelectCell	TokenNameIdentifier	 should Select Cell
(	TokenNameLPAREN	
EventObject	TokenNameIdentifier	 Event Object
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
rv	TokenNameIdentifier	 rv
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// only mouse events 	TokenNameCOMMENT_LINE	only mouse events 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MouseEvent	TokenNameIdentifier	 Mouse Event
me	TokenNameIdentifier	 me
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
TreePath	TokenNameIdentifier	 Tree Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
getPathForLocation	TokenNameIdentifier	 get Path For Location
(	TokenNameLPAREN	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
me	TokenNameIdentifier	 me
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getLastPathComponent	TokenNameIdentifier	 get Last Path Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rv	TokenNameIdentifier	 rv
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/*|| !inCheckBoxHitRegion(me)*/	TokenNameCOMMENT_BLOCK	|| !inCheckBoxHitRegion(me)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
rv	TokenNameIdentifier	 rv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
inCheckBoxHitRegion	TokenNameIdentifier	 in Check Box Hit Region
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreePath	TokenNameIdentifier	 Tree Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
getPathForLocation	TokenNameIdentifier	 get Path For Location
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getLastPathComponent	TokenNameIdentifier	 get Last Path Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
rv	TokenNameIdentifier	 rv
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// offset and lastRow DefaultTreeCellEditor 	TokenNameCOMMENT_LINE	offset and lastRow DefaultTreeCellEditor 
// protected members 	TokenNameCOMMENT_LINE	protected members 
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
getRowBounds	TokenNameIdentifier	 get Row Bounds
(	TokenNameLPAREN	
lastRow	TokenNameIdentifier	 last Row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dimension	TokenNameIdentifier	 Dimension
checkBoxOffset	TokenNameIdentifier	 check Box Offset
=	TokenNameEQUAL	
renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
getCheckBoxOffset	TokenNameIdentifier	 get Check Box Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
checkBoxOffset	TokenNameIdentifier	 check Box Offset
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
checkBoxOffset	TokenNameIdentifier	 check Box Offset
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rv	TokenNameIdentifier	 rv
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getPoint	TokenNameIdentifier	 get Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
boolean	TokenNameboolean	
canEditImmediately	TokenNameIdentifier	 can Edit Immediately
(	TokenNameLPAREN	
EventObject	TokenNameIdentifier	 Event Object
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
rv	TokenNameIdentifier	 rv
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
instanceof	TokenNameinstanceof	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MouseEvent	TokenNameIdentifier	 Mouse Event
me	TokenNameIdentifier	 me
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
rv	TokenNameIdentifier	 rv
=	TokenNameEQUAL	
inCheckBoxHitRegion	TokenNameIdentifier	 in Check Box Hit Region
(	TokenNameLPAREN	
me	TokenNameIdentifier	 me
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
rv	TokenNameIdentifier	 rv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
determineOffset	TokenNameIdentifier	 determine Offset
(	TokenNameLPAREN	
JTree	TokenNameIdentifier	 J Tree
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
,	TokenNameCOMMA	
boolean	TokenNameboolean	
expanded	TokenNameIdentifier	 expanded
,	TokenNameCOMMA	
boolean	TokenNameboolean	
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
int	TokenNameint	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Very important: means that the tree won't jump around. 	TokenNameCOMMENT_LINE	Very important: means that the tree won't jump around. 
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
