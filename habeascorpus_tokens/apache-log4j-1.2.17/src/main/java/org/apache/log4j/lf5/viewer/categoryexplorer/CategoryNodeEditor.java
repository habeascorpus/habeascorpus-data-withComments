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
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionEvent	TokenNameIdentifier	 Action Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ActionListener	TokenNameIdentifier	 Action Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseAdapter	TokenNameIdentifier	 Mouse Adapter
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JCheckBox	TokenNameIdentifier	 J Check Box
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JMenuItem	TokenNameIdentifier	 J Menu Item
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JOptionPane	TokenNameIdentifier	 J Option Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JPopupMenu	TokenNameIdentifier	 J Popup Menu
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
TreePath	TokenNameIdentifier	 Tree Path
;	TokenNameSEMICOLON	
/** * CategoryNodeEditor * * @author Michael J. Sikorsky * @author Robert Shaw */	TokenNameCOMMENT_JAVADOC	 CategoryNodeEditor * @author Michael J. Sikorsky @author Robert Shaw 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryNodeEditor	TokenNameIdentifier	 Category Node Editor
extends	TokenNameextends	
CategoryAbstractCellEditor	TokenNameIdentifier	 Category Abstract Cell Editor
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
CategoryNodeEditorRenderer	TokenNameIdentifier	 Category Node Editor Renderer
_renderer	TokenNameIdentifier	 renderer
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
CategoryNode	TokenNameIdentifier	 Category Node
_lastEditedNode	TokenNameIdentifier	 last Edited Node
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
JCheckBox	TokenNameIdentifier	 J Check Box
_checkBox	TokenNameIdentifier	 check Box
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
_categoryModel	TokenNameIdentifier	 category Model
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
JTree	TokenNameIdentifier	 J Tree
_tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
CategoryNodeEditor	TokenNameIdentifier	 Category Node Editor
(	TokenNameLPAREN	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryNodeEditorRenderer	TokenNameIdentifier	 Category Node Editor Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_checkBox	TokenNameIdentifier	 check Box
=	TokenNameEQUAL	
_renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
getCheckBox	TokenNameIdentifier	 get Check Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_categoryModel	TokenNameIdentifier	 category Model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
_checkBox	TokenNameIdentifier	 check Box
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_categoryModel	TokenNameIdentifier	 category Model
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
_lastEditedNode	TokenNameIdentifier	 last Edited Node
,	TokenNameCOMMA	
_checkBox	TokenNameIdentifier	 check Box
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stopCellEditing	TokenNameIdentifier	 stop Cell Editing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
addMouseListener	TokenNameIdentifier	 add Mouse Listener
(	TokenNameLPAREN	
new	TokenNamenew	
MouseAdapter	TokenNameIdentifier	 Mouse Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mousePressed	TokenNameIdentifier	 mouse Pressed
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getModifiers	TokenNameIdentifier	 get Modifiers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
MouseEvent	TokenNameIdentifier	 Mouse Event
.	TokenNameDOT	
BUTTON3_MASK	TokenNameIdentifier	 BUTTO N3  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
showPopup	TokenNameIdentifier	 show Popup
(	TokenNameLPAREN	
_lastEditedNode	TokenNameIdentifier	 last Edited Node
,	TokenNameCOMMA	
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
}	TokenNameRBRACE	
stopCellEditing	TokenNameIdentifier	 stop Cell Editing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
Component	TokenNameIdentifier	 Component
getTreeCellEditorComponent	TokenNameIdentifier	 get Tree Cell Editor Component
(	TokenNameLPAREN	
JTree	TokenNameIdentifier	 J Tree
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
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
_lastEditedNode	TokenNameIdentifier	 last Edited Node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
_tree	TokenNameIdentifier	 tree
=	TokenNameEQUAL	
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
return	TokenNamereturn	
_renderer	TokenNameIdentifier	 renderer
.	TokenNameDOT	
getTreeCellRendererComponent	TokenNameIdentifier	 get Tree Cell Renderer Component
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
selected	TokenNameIdentifier	 selected
,	TokenNameCOMMA	
expanded	TokenNameIdentifier	 expanded
,	TokenNameCOMMA	
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hasFocus ignored 	TokenNameCOMMENT_LINE	hasFocus ignored 
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getCellEditorValue	TokenNameIdentifier	 get Cell Editor Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_lastEditedNode	TokenNameIdentifier	 last Edited Node
.	TokenNameDOT	
getUserObject	TokenNameIdentifier	 get User Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
JMenuItem	TokenNameIdentifier	 J Menu Item
createPropertiesMenuItem	TokenNameIdentifier	 create Properties Menu Item
(	TokenNameLPAREN	
final	TokenNamefinal	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
"Properties"	TokenNameStringLiteral	Properties
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
showPropertiesDialog	TokenNameIdentifier	 show Properties Dialog
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
showPropertiesDialog	TokenNameIdentifier	 show Properties Dialog
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showMessageDialog	TokenNameIdentifier	 show Message Dialog
(	TokenNameLPAREN	
_tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
getDisplayedProperties	TokenNameIdentifier	 get Displayed Properties
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Category Properties: "	TokenNameStringLiteral	Category Properties: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
PLAIN_MESSAGE	TokenNameIdentifier	 PLAIN  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
getDisplayedProperties	TokenNameIdentifier	 get Displayed Properties
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Category: "	TokenNameStringLiteral	Category: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hasFatalRecords	TokenNameIdentifier	 has Fatal Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Contains at least one fatal LogRecord."	TokenNameStringLiteral	Contains at least one fatal LogRecord.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hasFatalChildren	TokenNameIdentifier	 has Fatal Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Contains descendants with a fatal LogRecord."	TokenNameStringLiteral	Contains descendants with a fatal LogRecord.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"LogRecords in this category alone: "	TokenNameStringLiteral	LogRecords in this category alone: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNumberOfContainedRecords	TokenNameIdentifier	 get Number Of Contained Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"LogRecords in descendant categories: "	TokenNameStringLiteral	LogRecords in descendant categories: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNumberOfRecordsFromChildren	TokenNameIdentifier	 get Number Of Records From Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"LogRecords in this category including descendants: "	TokenNameStringLiteral	LogRecords in this category including descendants: 
+	TokenNamePLUS	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTotalNumberOfRecords	TokenNameIdentifier	 get Total Number Of Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
showPopup	TokenNameIdentifier	 show Popup
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JPopupMenu	TokenNameIdentifier	 J Popup Menu
popup	TokenNameIdentifier	 popup
=	TokenNameEQUAL	
new	TokenNamenew	
JPopupMenu	TokenNameIdentifier	 J Popup Menu
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
150	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
400	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Configure the Popup 	TokenNameCOMMENT_LINE	Configure the Popup 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createRemoveMenuItem	TokenNameIdentifier	 create Remove Menu Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
addSeparator	TokenNameIdentifier	 add Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createSelectDescendantsMenuItem	TokenNameIdentifier	 create Select Descendants Menu Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createUnselectDescendantsMenuItem	TokenNameIdentifier	 create Unselect Descendants Menu Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
addSeparator	TokenNameIdentifier	 add Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createExpandMenuItem	TokenNameIdentifier	 create Expand Menu Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createCollapseMenuItem	TokenNameIdentifier	 create Collapse Menu Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
addSeparator	TokenNameIdentifier	 add Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createPropertiesMenuItem	TokenNameIdentifier	 create Properties Menu Item
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
popup	TokenNameIdentifier	 popup
.	TokenNameDOT	
show	TokenNameIdentifier	 show
(	TokenNameLPAREN	
_renderer	TokenNameIdentifier	 renderer
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
JMenuItem	TokenNameIdentifier	 J Menu Item
createSelectDescendantsMenuItem	TokenNameIdentifier	 create Select Descendants Menu Item
(	TokenNameLPAREN	
final	TokenNamefinal	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
selectDescendants	TokenNameIdentifier	 select Descendants
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
"Select All Descendant Categories"	TokenNameStringLiteral	Select All Descendant Categories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectDescendants	TokenNameIdentifier	 select Descendants
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_categoryModel	TokenNameIdentifier	 category Model
.	TokenNameDOT	
setDescendantSelection	TokenNameIdentifier	 set Descendant Selection
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
selectDescendants	TokenNameIdentifier	 select Descendants
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
JMenuItem	TokenNameIdentifier	 J Menu Item
createUnselectDescendantsMenuItem	TokenNameIdentifier	 create Unselect Descendants Menu Item
(	TokenNameLPAREN	
final	TokenNamefinal	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
unselectDescendants	TokenNameIdentifier	 unselect Descendants
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
"Deselect All Descendant Categories"	TokenNameStringLiteral	Deselect All Descendant Categories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unselectDescendants	TokenNameIdentifier	 unselect Descendants
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_categoryModel	TokenNameIdentifier	 category Model
.	TokenNameDOT	
setDescendantSelection	TokenNameIdentifier	 set Descendant Selection
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
unselectDescendants	TokenNameIdentifier	 unselect Descendants
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
JMenuItem	TokenNameIdentifier	 J Menu Item
createExpandMenuItem	TokenNameIdentifier	 create Expand Menu Item
(	TokenNameLPAREN	
final	TokenNamefinal	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
"Expand All Descendant Categories"	TokenNameStringLiteral	Expand All Descendant Categories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expandDescendants	TokenNameIdentifier	 expand Descendants
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
JMenuItem	TokenNameIdentifier	 J Menu Item
createCollapseMenuItem	TokenNameIdentifier	 create Collapse Menu Item
(	TokenNameLPAREN	
final	TokenNamefinal	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
"Collapse All Descendant Categories"	TokenNameStringLiteral	Collapse All Descendant Categories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
collapseDescendants	TokenNameIdentifier	 collapse Descendants
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This featured was moved from the LogBrokerMonitor class * to the CategoryNodeExplorer so that the Category tree * could be pruned from the Category Explorer popup menu. * This menu option only appears when a user right clicks on * the Category parent node. * * See removeUnusedNodes() */	TokenNameCOMMENT_JAVADOC	 This featured was moved from the LogBrokerMonitor class to the CategoryNodeExplorer so that the Category tree could be pruned from the Category Explorer popup menu. This menu option only appears when a user right clicks on the Category parent node. * See removeUnusedNodes() 
protected	TokenNameprotected	
JMenuItem	TokenNameIdentifier	 J Menu Item
createRemoveMenuItem	TokenNameIdentifier	 create Remove Menu Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
"Remove All Empty Categories"	TokenNameStringLiteral	Remove All Empty Categories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
ActionListener	TokenNameIdentifier	 Action Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
removeUnusedNodes	TokenNameIdentifier	 remove Unused Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
expandDescendants	TokenNameIdentifier	 expand Descendants
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
descendants	TokenNameIdentifier	 descendants
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
depthFirstEnumeration	TokenNameIdentifier	 depth First Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
descendants	TokenNameIdentifier	 descendants
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
descendants	TokenNameIdentifier	 descendants
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
collapseDescendants	TokenNameIdentifier	 collapse Descendants
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
descendants	TokenNameIdentifier	 descendants
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
depthFirstEnumeration	TokenNameIdentifier	 depth First Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
descendants	TokenNameIdentifier	 descendants
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
descendants	TokenNameIdentifier	 descendants
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Removes any inactive nodes from the Category tree. */	TokenNameCOMMENT_JAVADOC	 Removes any inactive nodes from the Category tree. 
protected	TokenNameprotected	
int	TokenNameint	
removeUnusedNodes	TokenNameIdentifier	 remove Unused Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
_categoryModel	TokenNameIdentifier	 category Model
.	TokenNameDOT	
getRootCategoryNode	TokenNameIdentifier	 get Root Category Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
enumeration	TokenNameIdentifier	 enumeration
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
depthFirstEnumeration	TokenNameIdentifier	 depth First Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
enumeration	TokenNameIdentifier	 enumeration
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isLeaf	TokenNameIdentifier	 is Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNumberOfContainedRecords	TokenNameIdentifier	 get Number Of Contained Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getParent	TokenNameIdentifier	 get Parent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_categoryModel	TokenNameIdentifier	 category Model
.	TokenNameDOT	
removeNodeFromParent	TokenNameIdentifier	 remove Node From Parent
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
expand	TokenNameIdentifier	 expand
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
expandPath	TokenNameIdentifier	 expand Path
(	TokenNameLPAREN	
getTreePath	TokenNameIdentifier	 get Tree Path
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
TreePath	TokenNameIdentifier	 Tree Path
getTreePath	TokenNameIdentifier	 get Tree Path
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TreePath	TokenNameIdentifier	 Tree Path
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
collapse	TokenNameIdentifier	 collapse
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
collapsePath	TokenNameIdentifier	 collapse Path
(	TokenNameLPAREN	
getTreePath	TokenNameIdentifier	 get Tree Path
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//----------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	----------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
