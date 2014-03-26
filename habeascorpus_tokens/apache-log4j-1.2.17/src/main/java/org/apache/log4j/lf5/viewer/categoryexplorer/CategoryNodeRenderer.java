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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
DefaultTreeCellRenderer	TokenNameIdentifier	 Default Tree Cell Renderer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
/** * CategoryNodeRenderer * * @author Michael J. Sikorsky * @author Robert Shaw */	TokenNameCOMMENT_JAVADOC	 CategoryNodeRenderer * @author Michael J. Sikorsky @author Robert Shaw 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryNodeRenderer	TokenNameIdentifier	 Category Node Renderer
extends	TokenNameextends	
DefaultTreeCellRenderer	TokenNameIdentifier	 Default Tree Cell Renderer
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6046702673278595048L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Color	TokenNameIdentifier	 Color
FATAL_CHILDREN	TokenNameIdentifier	 FATAL  CHILDREN
=	TokenNameEQUAL	
new	TokenNamenew	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
189	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
JCheckBox	TokenNameIdentifier	 J Check Box
_checkBox	TokenNameIdentifier	 check Box
=	TokenNameEQUAL	
new	TokenNamenew	
JCheckBox	TokenNameIdentifier	 J Check Box
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
JPanel	TokenNameIdentifier	 J Panel
_panel	TokenNameIdentifier	 panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
ImageIcon	TokenNameIdentifier	 Image Icon
_sat	TokenNameIdentifier	 sat
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// protected JLabel _label = new JLabel(); 	TokenNameCOMMENT_LINE	protected JLabel _label = new JLabel(); 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
CategoryNodeRenderer	TokenNameIdentifier	 Category Node Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
setBackground	TokenNameIdentifier	 set Background
(	TokenNameLPAREN	
UIManager	TokenNameIdentifier	 UI Manager
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
"Tree.textBackground"	TokenNameStringLiteral	Tree.textBackground
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_sat	TokenNameIdentifier	 sat
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Load the satellite image. 	TokenNameCOMMENT_LINE	Load the satellite image. 
String	TokenNameIdentifier	 String
resource	TokenNameIdentifier	 resource
=	TokenNameEQUAL	
"/org/apache/log4j/lf5/viewer/images/channelexplorer_satellite.gif"	TokenNameStringLiteral	/org/apache/log4j/lf5/viewer/images/channelexplorer_satellite.gif
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
satURL	TokenNameIdentifier	 sat URL
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
resource	TokenNameIdentifier	 resource
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_sat	TokenNameIdentifier	 sat
=	TokenNameEQUAL	
new	TokenNamenew	
ImageIcon	TokenNameIdentifier	 Image Icon
(	TokenNameLPAREN	
satURL	TokenNameIdentifier	 sat URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setOpaque	TokenNameIdentifier	 set Opaque
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_checkBox	TokenNameIdentifier	 check Box
.	TokenNameDOT	
setOpaque	TokenNameIdentifier	 set Opaque
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
setOpaque	TokenNameIdentifier	 set Opaque
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The flowlayout set to LEFT is very important so that the editor 	TokenNameCOMMENT_LINE	The flowlayout set to LEFT is very important so that the editor 
// doesn't jump around. 	TokenNameCOMMENT_LINE	doesn't jump around. 
_panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
FlowLayout	TokenNameIdentifier	 Flow Layout
(	TokenNameLPAREN	
FlowLayout	TokenNameIdentifier	 Flow Layout
.	TokenNameDOT	
LEFT	TokenNameIdentifier	 LEFT
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
_checkBox	TokenNameIdentifier	 check Box
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setOpenIcon	TokenNameIdentifier	 set Open Icon
(	TokenNameLPAREN	
_sat	TokenNameIdentifier	 sat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setClosedIcon	TokenNameIdentifier	 set Closed Icon
(	TokenNameLPAREN	
_sat	TokenNameIdentifier	 sat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLeafIcon	TokenNameIdentifier	 set Leaf Icon
(	TokenNameLPAREN	
_sat	TokenNameIdentifier	 sat
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
Component	TokenNameIdentifier	 Component
getTreeCellRendererComponent	TokenNameIdentifier	 get Tree Cell Renderer Component
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
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasFocus	TokenNameIdentifier	 has Focus
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
//FileNode node = (FileNode)value; 	TokenNameCOMMENT_LINE	FileNode node = (FileNode)value; 
//String s = tree.convertValueToText(value, selected, 	TokenNameCOMMENT_LINE	String s = tree.convertValueToText(value, selected, 
// expanded, leaf, row, hasFocus); 	TokenNameCOMMENT_LINE	expanded, leaf, row, hasFocus); 
super	TokenNamesuper	
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
hasFocus	TokenNameIdentifier	 has Focus
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Root row -- no check box 	TokenNameCOMMENT_LINE	Root row -- no check box 
_checkBox	TokenNameIdentifier	 check Box
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_checkBox	TokenNameIdentifier	 check Box
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_checkBox	TokenNameIdentifier	 check Box
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
toolTip	TokenNameIdentifier	 tool Tip
=	TokenNameEQUAL	
buildToolTip	TokenNameIdentifier	 build Tool Tip
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
setToolTipText	TokenNameIdentifier	 set Tool Tip Text
(	TokenNameLPAREN	
toolTip	TokenNameIdentifier	 tool Tip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hasFatalChildren	TokenNameIdentifier	 has Fatal Children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setForeground	TokenNameIdentifier	 set Foreground
(	TokenNameLPAREN	
FATAL_CHILDREN	TokenNameIdentifier	 FATAL  CHILDREN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hasFatalRecords	TokenNameIdentifier	 has Fatal Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setForeground	TokenNameIdentifier	 set Foreground
(	TokenNameLPAREN	
Color	TokenNameIdentifier	 Color
.	TokenNameDOT	
red	TokenNameIdentifier	 red
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_panel	TokenNameIdentifier	 panel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Dimension	TokenNameIdentifier	 Dimension
getCheckBoxOffset	TokenNameIdentifier	 get Check Box Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
buildToolTip	TokenNameIdentifier	 build Tool Tip
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" contains a total of "	TokenNameStringLiteral	 contains a total of 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTotalNumberOfRecords	TokenNameIdentifier	 get Total Number Of Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" LogRecords."	TokenNameStringLiteral	 LogRecords.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" Right-click for more info."	TokenNameStringLiteral	 Right-click for more info.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
