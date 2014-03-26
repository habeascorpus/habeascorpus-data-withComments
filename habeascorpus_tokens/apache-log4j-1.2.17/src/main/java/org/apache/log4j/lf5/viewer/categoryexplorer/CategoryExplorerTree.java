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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseEvent	TokenNameIdentifier	 Mouse Event
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
TreeModelEvent	TokenNameIdentifier	 Tree Model Event
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
/** * CategoryExplorerTree * * @author Michael J. Sikorsky * @author Robert Shaw * @author Brent Sprecher * @author Brad Marlborough */	TokenNameCOMMENT_JAVADOC	 CategoryExplorerTree * @author Michael J. Sikorsky @author Robert Shaw @author Brent Sprecher @author Brad Marlborough 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryExplorerTree	TokenNameIdentifier	 Category Explorer Tree
extends	TokenNameextends	
JTree	TokenNameIdentifier	 J Tree
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
8066257446951323576L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
_model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
_rootAlreadyExpanded	TokenNameIdentifier	 root Already Expanded
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Construct a CategoryExplorerTree with a specific model. */	TokenNameCOMMENT_JAVADOC	 Construct a CategoryExplorerTree with a specific model. 
public	TokenNamepublic	
CategoryExplorerTree	TokenNameIdentifier	 Category Explorer Tree
(	TokenNameLPAREN	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
model	TokenNameIdentifier	 model
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a CategoryExplorerTree and create a default CategoryExplorerModel. */	TokenNameCOMMENT_JAVADOC	 Construct a CategoryExplorerTree and create a default CategoryExplorerModel. 
public	TokenNamepublic	
CategoryExplorerTree	TokenNameIdentifier	 Category Explorer Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
rootNode	TokenNameIdentifier	 root Node
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryNode	TokenNameIdentifier	 Category Node
(	TokenNameLPAREN	
"Categories"	TokenNameStringLiteral	Categories
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
(	TokenNameLPAREN	
rootNode	TokenNameIdentifier	 root Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setModel	TokenNameIdentifier	 set Model
(	TokenNameLPAREN	
_model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
getExplorerModel	TokenNameIdentifier	 get Explorer Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getToolTipText	TokenNameIdentifier	 get Tool Tip Text
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
getToolTipText	TokenNameIdentifier	 get Tool Tip Text
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Put visible lines on the JTree. 	TokenNameCOMMENT_LINE	Put visible lines on the JTree. 
putClientProperty	TokenNameIdentifier	 put Client Property
(	TokenNameLPAREN	
"JTree.lineStyle"	TokenNameStringLiteral	JTree.lineStyle
,	TokenNameCOMMA	
"Angled"	TokenNameStringLiteral	Angled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Configure the Tree with the appropriate Renderers and Editors. 	TokenNameCOMMENT_LINE	Configure the Tree with the appropriate Renderers and Editors. 
CategoryNodeRenderer	TokenNameIdentifier	 Category Node Renderer
renderer	TokenNameIdentifier	 renderer
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryNodeRenderer	TokenNameIdentifier	 Category Node Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setEditable	TokenNameIdentifier	 set Editable
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCellRenderer	TokenNameIdentifier	 set Cell Renderer
(	TokenNameLPAREN	
renderer	TokenNameIdentifier	 renderer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNodeEditor	TokenNameIdentifier	 Category Node Editor
editor	TokenNameIdentifier	 editor
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryNodeEditor	TokenNameIdentifier	 Category Node Editor
(	TokenNameLPAREN	
_model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCellEditor	TokenNameIdentifier	 set Cell Editor
(	TokenNameLPAREN	
new	TokenNamenew	
CategoryImmediateEditor	TokenNameIdentifier	 Category Immediate Editor
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
new	TokenNamenew	
CategoryNodeRenderer	TokenNameIdentifier	 Category Node Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
editor	TokenNameIdentifier	 editor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setShowsRootHandles	TokenNameIdentifier	 set Shows Root Handles
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setToolTipText	TokenNameIdentifier	 set Tool Tip Text
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ensureRootExpansion	TokenNameIdentifier	 ensure Root Expansion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
expandRootNode	TokenNameIdentifier	 expand Root Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_rootAlreadyExpanded	TokenNameIdentifier	 root Already Expanded
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_rootAlreadyExpanded	TokenNameIdentifier	 root Already Expanded
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
TreePath	TokenNameIdentifier	 Tree Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
TreePath	TokenNameIdentifier	 Tree Path
(	TokenNameLPAREN	
_model	TokenNameIdentifier	 model
.	TokenNameDOT	
getRootCategoryNode	TokenNameIdentifier	 get Root Category Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expandPath	TokenNameIdentifier	 expand Path
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
ensureRootExpansion	TokenNameIdentifier	 ensure Root Expansion
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_model	TokenNameIdentifier	 model
.	TokenNameDOT	
addTreeModelListener	TokenNameIdentifier	 add Tree Model Listener
(	TokenNameLPAREN	
new	TokenNamenew	
TreeModelAdapter	TokenNameIdentifier	 Tree Model Adapter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
treeNodesInserted	TokenNameIdentifier	 tree Nodes Inserted
(	TokenNameLPAREN	
TreeModelEvent	TokenNameIdentifier	 Tree Model Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
expandRootNode	TokenNameIdentifier	 expand Root Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
