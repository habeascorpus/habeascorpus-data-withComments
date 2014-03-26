/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
.	TokenNameDOT	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
CommandController	TokenNameIdentifier	 Command Controller
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
apps	TokenNameIdentifier	 apps
.	TokenNameDOT	
svgbrowser	TokenNameIdentifier	 svgbrowser
.	TokenNameDOT	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
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
SVGConstants	TokenNameIdentifier	 SVG Constants
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
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * The wrapper for the history browser. The commands for the historyBrowser * are implemented here * * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 The wrapper for the history browser. The commands for the historyBrowser are implemented here * @version $Id$ 
public	TokenNamepublic	
class	TokenNameclass	
HistoryBrowserInterface	TokenNameIdentifier	 History Browser Interface
{	TokenNameLBRACE	
// ATOM COMMANDS 	TokenNameCOMMENT_LINE	ATOM COMMANDS 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_ADDED_COMMAND	TokenNameIdentifier	 ATTRIBUTE  ADDED  COMMAND
=	TokenNameEQUAL	
"Attribute added: "	TokenNameStringLiteral	Attribute added: 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_REMOVED_COMMAND	TokenNameIdentifier	 ATTRIBUTE  REMOVED  COMMAND
=	TokenNameEQUAL	
"Attribute removed: "	TokenNameStringLiteral	Attribute removed: 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ATTRIBUTE_MODIFIED_COMMAND	TokenNameIdentifier	 ATTRIBUTE  MODIFIED  COMMAND
=	TokenNameEQUAL	
"Attribute modified: "	TokenNameStringLiteral	Attribute modified: 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_INSERTED_COMMAND	TokenNameIdentifier	 NODE  INSERTED  COMMAND
=	TokenNameEQUAL	
"Node inserted: "	TokenNameStringLiteral	Node inserted: 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NODE_REMOVED_COMMAND	TokenNameIdentifier	 NODE  REMOVED  COMMAND
=	TokenNameEQUAL	
"Node removed: "	TokenNameStringLiteral	Node removed: 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHAR_DATA_MODIFIED_COMMAND	TokenNameIdentifier	 CHAR  DATA  MODIFIED  COMMAND
=	TokenNameEQUAL	
"Node value changed: "	TokenNameStringLiteral	Node value changed: 
;	TokenNameSEMICOLON	
// OTHER COMMANDS 	TokenNameCOMMENT_LINE	OTHER COMMANDS 
/** * The changes being performed outside of the DOMViewer. */	TokenNameCOMMENT_JAVADOC	 The changes being performed outside of the DOMViewer. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
OUTER_EDIT_COMMAND	TokenNameIdentifier	 OUTER  EDIT  COMMAND
=	TokenNameEQUAL	
"Document changed outside DOM Viewer"	TokenNameStringLiteral	Document changed outside DOM Viewer
;	TokenNameSEMICOLON	
/** * Compound tree node dropped command name. */	TokenNameCOMMENT_JAVADOC	 Compound tree node dropped command name. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
COMPOUND_TREE_NODE_DROP	TokenNameIdentifier	 COMPOUND  TREE  NODE  DROP
=	TokenNameEQUAL	
"Node moved"	TokenNameStringLiteral	Node moved
;	TokenNameSEMICOLON	
/** * Remove selected nodes command name. */	TokenNameCOMMENT_JAVADOC	 Remove selected nodes command name. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
REMOVE_SELECTED_NODES	TokenNameIdentifier	 REMOVE  SELECTED  NODES
=	TokenNameEQUAL	
"Nodes removed"	TokenNameStringLiteral	Nodes removed
;	TokenNameSEMICOLON	
/** * The history browser. */	TokenNameCOMMENT_JAVADOC	 The history browser. 
protected	TokenNameprotected	
HistoryBrowser	TokenNameIdentifier	 History Browser
historyBrowser	TokenNameIdentifier	 history Browser
;	TokenNameSEMICOLON	
/** * Used to group custom number of changes into a single command. */	TokenNameCOMMENT_JAVADOC	 Used to group custom number of changes into a single command. 
protected	TokenNameprotected	
AbstractCompoundCommand	TokenNameIdentifier	 Abstract Compound Command
currentCompoundCommand	TokenNameIdentifier	 current Compound Command
;	TokenNameSEMICOLON	
/** * Constructor. Creates the history browser. */	TokenNameCOMMENT_JAVADOC	 Constructor. Creates the history browser. 
public	TokenNamepublic	
HistoryBrowserInterface	TokenNameIdentifier	 History Browser Interface
(	TokenNameLPAREN	
CommandController	TokenNameIdentifier	 Command Controller
commandController	TokenNameIdentifier	 command Controller
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
=	TokenNameEQUAL	
new	TokenNamenew	
HistoryBrowser	TokenNameIdentifier	 History Browser
(	TokenNameLPAREN	
commandController	TokenNameIdentifier	 command Controller
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the history browser's command controller. * * @param newCommandController * The commandController to set */	TokenNameCOMMENT_JAVADOC	 Sets the history browser's command controller. * @param newCommandController The commandController to set 
public	TokenNamepublic	
void	TokenNamevoid	
setCommmandController	TokenNameIdentifier	 set Commmand Controller
(	TokenNameLPAREN	
CommandController	TokenNameIdentifier	 Command Controller
newCommandController	TokenNameIdentifier	 new Command Controller
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
setCommandController	TokenNameIdentifier	 set Command Controller
(	TokenNameLPAREN	
newCommandController	TokenNameIdentifier	 new Command Controller
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the compound update command, that consists of custom number of * commands. * * @param commandName * Compound command name * @return CompoundUpdateCommand */	TokenNameCOMMENT_JAVADOC	 Creates the compound update command, that consists of custom number of commands. * @param commandName Compound command name @return CompoundUpdateCommand 
public	TokenNamepublic	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
createCompoundUpdateCommand	TokenNameIdentifier	 create Compound Update Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
new	TokenNamenew	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cmd	TokenNameIdentifier	 cmd
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the compound NodeChangedCommand. Used to create the 'dynamic' * NodeChangedCommand name * * @return the CompoundUpdateCommand */	TokenNameCOMMENT_JAVADOC	 Creates the compound NodeChangedCommand. Used to create the 'dynamic' NodeChangedCommand name * @return the CompoundUpdateCommand 
public	TokenNamepublic	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
createNodeChangedCommand	TokenNameIdentifier	 create Node Changed Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
(	TokenNameLPAREN	
getNodeChangedCommandName	TokenNameIdentifier	 get Node Changed Command Name
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the compound NodesDroppedCommand. Used to create the 'dynamic' * NodesDroppedCommand name * * @param nodes * The list of the nodes that are being dropped * @return the CompoundUpdateCommand */	TokenNameCOMMENT_JAVADOC	 Creates the compound NodesDroppedCommand. Used to create the 'dynamic' NodesDroppedCommand name * @param nodes The list of the nodes that are being dropped @return the CompoundUpdateCommand 
public	TokenNamepublic	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
createNodesDroppedCommand	TokenNameIdentifier	 create Nodes Dropped Command
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
(	TokenNameLPAREN	
COMPOUND_TREE_NODE_DROP	TokenNameIdentifier	 COMPOUND  TREE  NODE  DROP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the compound RemoveSelectedTreeNodesCommand. Used to create the * 'dynamic' RemoveSelectedTreeNodesCommand name * * @param nodes * The list of the nodes that are selected and should be removed * @return the RemoveSelectedTreeNodesCommand */	TokenNameCOMMENT_JAVADOC	 Creates the compound RemoveSelectedTreeNodesCommand. Used to create the 'dynamic' RemoveSelectedTreeNodesCommand name * @param nodes The list of the nodes that are selected and should be removed @return the RemoveSelectedTreeNodesCommand 
public	TokenNamepublic	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
createRemoveSelectedTreeNodesCommand	TokenNameIdentifier	 create Remove Selected Tree Nodes Command
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
nodes	TokenNameIdentifier	 nodes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
(	TokenNameLPAREN	
REMOVE_SELECTED_NODES	TokenNameIdentifier	 REMOVE  SELECTED  NODES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Executes the given compound update command. * * @param command * The given compound update command */	TokenNameCOMMENT_JAVADOC	 Executes the given compound update command. * @param command The given compound update command 
public	TokenNamepublic	
void	TokenNamevoid	
performCompoundUpdateCommand	TokenNameIdentifier	 perform Compound Update Command
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The compound command. */	TokenNameCOMMENT_JAVADOC	 The compound command. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
extends	TokenNameextends	
AbstractCompoundCommand	TokenNameIdentifier	 Abstract Compound Command
{	TokenNameLBRACE	
/** * Constructor. * * @param commandName * The compound command name */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param commandName The compound command name 
public	TokenNamepublic	
CompoundUpdateCommand	TokenNameIdentifier	 Compound Update Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the history browser. * * @return the historyBrowser */	TokenNameCOMMENT_JAVADOC	 Gets the history browser. * @return the historyBrowser 
public	TokenNamepublic	
HistoryBrowser	TokenNameIdentifier	 History Browser
getHistoryBrowser	TokenNameIdentifier	 get History Browser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
historyBrowser	TokenNameIdentifier	 history Browser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ATOM COMMANDS 	TokenNameCOMMENT_LINE	ATOM COMMANDS 
/** * Adds the NodeInsertedCommand to historyBrowser. * * @param newParent * New parent node * @param newSibling * New (next) sibling node * @param contextNode * The node to be appended */	TokenNameCOMMENT_JAVADOC	 Adds the NodeInsertedCommand to historyBrowser. * @param newParent New parent node @param newSibling New (next) sibling node @param contextNode The node to be appended 
public	TokenNamepublic	
void	TokenNamevoid	
nodeInserted	TokenNameIdentifier	 node Inserted
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newParent	TokenNameIdentifier	 new Parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
newSibling	TokenNameIdentifier	 new Sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createNodeInsertedCommand	TokenNameIdentifier	 create Node Inserted Command
(	TokenNameLPAREN	
newParent	TokenNameIdentifier	 new Parent
,	TokenNameCOMMA	
newSibling	TokenNameIdentifier	 new Sibling
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the NodeInserted command. * * @param newParent * New parent node * @param newSibling * New (next) sibling node * @param contextNode * The node to be appended */	TokenNameCOMMENT_JAVADOC	 Creates the NodeInserted command. * @param newParent New parent node @param newSibling New (next) sibling node @param contextNode The node to be appended 
public	TokenNamepublic	
NodeInsertedCommand	TokenNameIdentifier	 Node Inserted Command
createNodeInsertedCommand	TokenNameIdentifier	 create Node Inserted Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newParent	TokenNameIdentifier	 new Parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
newSibling	TokenNameIdentifier	 new Sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NodeInsertedCommand	TokenNameIdentifier	 Node Inserted Command
(	TokenNameLPAREN	
NODE_INSERTED_COMMAND	TokenNameIdentifier	 NODE  INSERTED  COMMAND
+	TokenNamePLUS	
getBracketedNodeName	TokenNameIdentifier	 get Bracketed Node Name
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
newParent	TokenNameIdentifier	 new Parent
,	TokenNameCOMMA	
newSibling	TokenNameIdentifier	 new Sibling
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the given node as a child of another. */	TokenNameCOMMENT_JAVADOC	 Inserts the given node as a child of another. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NodeInsertedCommand	TokenNameIdentifier	 Node Inserted Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The node's next sibling. */	TokenNameCOMMENT_JAVADOC	 The node's next sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newSibling	TokenNameIdentifier	 new Sibling
;	TokenNameSEMICOLON	
/** * The node's new parent. */	TokenNameCOMMENT_JAVADOC	 The node's new parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newParent	TokenNameIdentifier	 new Parent
;	TokenNameSEMICOLON	
/** * The node to be appended. */	TokenNameCOMMENT_JAVADOC	 The node to be appended. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
NodeInsertedCommand	TokenNameIdentifier	 Node Inserted Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newParent	TokenNameIdentifier	 new Parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
contextNode	TokenNameIdentifier	 context Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newSibling	TokenNameIdentifier	 new Sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newParent	TokenNameIdentifier	 new Parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newSibling	TokenNameIdentifier	 new Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newParent	TokenNameIdentifier	 new Parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
newSibling	TokenNameIdentifier	 new Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
newParent	TokenNameIdentifier	 new Parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newParent	TokenNameIdentifier	 new Parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
contextNode	TokenNameIdentifier	 context Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the NodeRemovedCommand to historyBrowser. * * @param oldParent * The node's old parent * @param oldSibling * The node's old next sibling * @param contextNode * The node to be removed */	TokenNameCOMMENT_JAVADOC	 Adds the NodeRemovedCommand to historyBrowser. * @param oldParent The node's old parent @param oldSibling The node's old next sibling @param contextNode The node to be removed 
public	TokenNamepublic	
void	TokenNamevoid	
nodeRemoved	TokenNameIdentifier	 node Removed
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
oldParent	TokenNameIdentifier	 old Parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
oldSibling	TokenNameIdentifier	 old Sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createNodeRemovedCommand	TokenNameIdentifier	 create Node Removed Command
(	TokenNameLPAREN	
oldParent	TokenNameIdentifier	 old Parent
,	TokenNameCOMMA	
oldSibling	TokenNameIdentifier	 old Sibling
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the NodeRemoved command. * * @param oldParent * The node's old parent * @param oldSibling * The node's old next sibling * @param contextNode * The node to be removed */	TokenNameCOMMENT_JAVADOC	 Creates the NodeRemoved command. * @param oldParent The node's old parent @param oldSibling The node's old next sibling @param contextNode The node to be removed 
public	TokenNamepublic	
NodeRemovedCommand	TokenNameIdentifier	 Node Removed Command
createNodeRemovedCommand	TokenNameIdentifier	 create Node Removed Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
oldParent	TokenNameIdentifier	 old Parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
oldSibling	TokenNameIdentifier	 old Sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NodeRemovedCommand	TokenNameIdentifier	 Node Removed Command
(	TokenNameLPAREN	
NODE_REMOVED_COMMAND	TokenNameIdentifier	 NODE  REMOVED  COMMAND
+	TokenNamePLUS	
getBracketedNodeName	TokenNameIdentifier	 get Bracketed Node Name
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
oldParent	TokenNameIdentifier	 old Parent
,	TokenNameCOMMA	
oldSibling	TokenNameIdentifier	 old Sibling
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the node from its parent node. */	TokenNameCOMMENT_JAVADOC	 Removes the node from its parent node. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
NodeRemovedCommand	TokenNameIdentifier	 Node Removed Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The node's old sibling. */	TokenNameCOMMENT_JAVADOC	 The node's old sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
oldSibling	TokenNameIdentifier	 old Sibling
;	TokenNameSEMICOLON	
/** * The node's new parent. */	TokenNameCOMMENT_JAVADOC	 The node's new parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
oldParent	TokenNameIdentifier	 old Parent
;	TokenNameSEMICOLON	
/** * The node to be appended. */	TokenNameCOMMENT_JAVADOC	 The node to be appended. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
NodeRemovedCommand	TokenNameIdentifier	 Node Removed Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
oldParent	TokenNameIdentifier	 old Parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
oldSibling	TokenNameIdentifier	 old Sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldParent	TokenNameIdentifier	 old Parent
=	TokenNameEQUAL	
oldParent	TokenNameIdentifier	 old Parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
contextNode	TokenNameIdentifier	 context Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldSibling	TokenNameIdentifier	 old Sibling
=	TokenNameEQUAL	
oldSibling	TokenNameIdentifier	 old Sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldSibling	TokenNameIdentifier	 old Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldParent	TokenNameIdentifier	 old Parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
oldSibling	TokenNameIdentifier	 old Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
oldParent	TokenNameIdentifier	 old Parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldParent	TokenNameIdentifier	 old Parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldParent	TokenNameIdentifier	 old Parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
contextNode	TokenNameIdentifier	 context Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the AttributeAddedCommand to historyBrowser. * * @param contextElement * The context element * @param attributeName * The attribute name * @param newAttributeValue * The attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Adds the AttributeAddedCommand to historyBrowser. * @param contextElement The context element @param attributeName The attribute name @param newAttributeValue The attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
void	TokenNamevoid	
attributeAdded	TokenNameIdentifier	 attribute Added
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createAttributeAddedCommand	TokenNameIdentifier	 create Attribute Added Command
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the AttributeAdded command. * * @param contextElement * The context element * @param attributeName * The attribute name * @param newAttributeValue * The attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Creates the AttributeAdded command. * @param contextElement The context element @param attributeName The attribute name @param newAttributeValue The attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
AttributeAddedCommand	TokenNameIdentifier	 Attribute Added Command
createAttributeAddedCommand	TokenNameIdentifier	 create Attribute Added Command
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AttributeAddedCommand	TokenNameIdentifier	 Attribute Added Command
(	TokenNameLPAREN	
ATTRIBUTE_ADDED_COMMAND	TokenNameIdentifier	 ATTRIBUTE  ADDED  COMMAND
+	TokenNamePLUS	
getBracketedNodeName	TokenNameIdentifier	 get Bracketed Node Name
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
)	TokenNameRPAREN	
,	TokenNameCOMMA	
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the attribute to an element (MutationEvent.ADDITION) */	TokenNameCOMMENT_JAVADOC	 Adds the attribute to an element (MutationEvent.ADDITION) 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AttributeAddedCommand	TokenNameIdentifier	 Attribute Added Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The context element. */	TokenNameCOMMENT_JAVADOC	 The context element. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
;	TokenNameSEMICOLON	
/** * The attribute name. */	TokenNameCOMMENT_JAVADOC	 The attribute name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
;	TokenNameSEMICOLON	
/** * The attribute value. */	TokenNameCOMMENT_JAVADOC	 The attribute value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
/** * The namespaceURI. */	TokenNameCOMMENT_JAVADOC	 The namespaceURI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * Constructor. * * @param commandName * The name of this command. * @param contextElement * The context element * @param attributeName * The attribute name * @param newAttributeValue * The attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param commandName The name of this command. @param contextElement The context element @param attributeName The attribute name @param newAttributeValue The attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
AttributeAddedCommand	TokenNameIdentifier	 Attribute Added Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contextElement	TokenNameIdentifier	 context Element
=	TokenNameEQUAL	
contextElement	TokenNameIdentifier	 context Element
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attributeName	TokenNameIdentifier	 attribute Name
=	TokenNameEQUAL	
attributeName	TokenNameIdentifier	 attribute Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
newAttributeValue	TokenNameIdentifier	 new Attribute Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextElement	TokenNameIdentifier	 context Element
.	TokenNameDOT	
removeAttributeNS	TokenNameIdentifier	 remove Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextElement	TokenNameIdentifier	 context Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
attributeName	TokenNameIdentifier	 attribute Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the AttributeRemovedCommand to historyBrowser. * * @param contextElement * The context element * @param attributeName * The attribute name * @param prevAttributeValue * The previous attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Adds the AttributeRemovedCommand to historyBrowser. * @param contextElement The context element @param attributeName The attribute name @param prevAttributeValue The previous attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
void	TokenNamevoid	
attributeRemoved	TokenNameIdentifier	 attribute Removed
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createAttributeRemovedCommand	TokenNameIdentifier	 create Attribute Removed Command
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the AttributeRemoved command. * * @param contextElement * The context element * @param attributeName * The attribute name * @param prevAttributeValue * The previous attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Creates the AttributeRemoved command. * @param contextElement The context element @param attributeName The attribute name @param prevAttributeValue The previous attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
AttributeRemovedCommand	TokenNameIdentifier	 Attribute Removed Command
createAttributeRemovedCommand	TokenNameIdentifier	 create Attribute Removed Command
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AttributeRemovedCommand	TokenNameIdentifier	 Attribute Removed Command
(	TokenNameLPAREN	
ATTRIBUTE_REMOVED_COMMAND	TokenNameIdentifier	 ATTRIBUTE  REMOVED  COMMAND
+	TokenNamePLUS	
getBracketedNodeName	TokenNameIdentifier	 get Bracketed Node Name
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
)	TokenNameRPAREN	
,	TokenNameCOMMA	
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the attribute of an element (MutationEvent.REMOVAL) */	TokenNameCOMMENT_JAVADOC	 Removes the attribute of an element (MutationEvent.REMOVAL) 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AttributeRemovedCommand	TokenNameIdentifier	 Attribute Removed Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The context element. */	TokenNameCOMMENT_JAVADOC	 The context element. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
;	TokenNameSEMICOLON	
/** * The attribute name. */	TokenNameCOMMENT_JAVADOC	 The attribute name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
;	TokenNameSEMICOLON	
/** * The previous attribute value. */	TokenNameCOMMENT_JAVADOC	 The previous attribute value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
prevValue	TokenNameIdentifier	 prev Value
;	TokenNameSEMICOLON	
/** * The namespaceURI. */	TokenNameCOMMENT_JAVADOC	 The namespaceURI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * Constructor. * * @param commandName * The name of this command. * @param contextElement * The context element * @param attributeName * The attribute name * @param prevAttributeValue * The previous attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param commandName The name of this command. @param contextElement The context element @param attributeName The attribute name @param prevAttributeValue The previous attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
AttributeRemovedCommand	TokenNameIdentifier	 Attribute Removed Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contextElement	TokenNameIdentifier	 context Element
=	TokenNameEQUAL	
contextElement	TokenNameIdentifier	 context Element
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attributeName	TokenNameIdentifier	 attribute Name
=	TokenNameEQUAL	
attributeName	TokenNameIdentifier	 attribute Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevValue	TokenNameIdentifier	 prev Value
=	TokenNameEQUAL	
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextElement	TokenNameIdentifier	 context Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
prevValue	TokenNameIdentifier	 prev Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextElement	TokenNameIdentifier	 context Element
.	TokenNameDOT	
removeAttributeNS	TokenNameIdentifier	 remove Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
attributeName	TokenNameIdentifier	 attribute Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the AttributeModifiedCommand to historyBrowser. * * @param contextElement * The context element * @param attributeName * The attribute name * @param prevAttributeValue * The previous attribute value * @param newAttributeValue * The new attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Adds the AttributeModifiedCommand to historyBrowser. * @param contextElement The context element @param attributeName The attribute name @param prevAttributeValue The previous attribute value @param newAttributeValue The new attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
void	TokenNamevoid	
attributeModified	TokenNameIdentifier	 attribute Modified
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createAttributeModifiedCommand	TokenNameIdentifier	 create Attribute Modified Command
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the AttributeModified command. * * @param contextElement * The context element * @param attributeName * The attribute name * @param prevAttributeValue * The previous attribute value * @param newAttributeValue * The new attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Creates the AttributeModified command. * @param contextElement The context element @param attributeName The attribute name @param prevAttributeValue The previous attribute value @param newAttributeValue The new attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
AttributeModifiedCommand	TokenNameIdentifier	 Attribute Modified Command
createAttributeModifiedCommand	TokenNameIdentifier	 create Attribute Modified Command
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AttributeModifiedCommand	TokenNameIdentifier	 Attribute Modified Command
(	TokenNameLPAREN	
ATTRIBUTE_MODIFIED_COMMAND	TokenNameIdentifier	 ATTRIBUTE  MODIFIED  COMMAND
+	TokenNamePLUS	
getBracketedNodeName	TokenNameIdentifier	 get Bracketed Node Name
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
)	TokenNameRPAREN	
,	TokenNameCOMMA	
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Modifies the attribute of an element (MutationEvent.MODIFICATION) */	TokenNameCOMMENT_JAVADOC	 Modifies the attribute of an element (MutationEvent.MODIFICATION) 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AttributeModifiedCommand	TokenNameIdentifier	 Attribute Modified Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The context element. */	TokenNameCOMMENT_JAVADOC	 The context element. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
;	TokenNameSEMICOLON	
/** * The attribute name. */	TokenNameCOMMENT_JAVADOC	 The attribute name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
;	TokenNameSEMICOLON	
/** * Previous attribute value. */	TokenNameCOMMENT_JAVADOC	 Previous attribute value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
;	TokenNameSEMICOLON	
/** * New attribute value. */	TokenNameCOMMENT_JAVADOC	 New attribute value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
newAttributeValue	TokenNameIdentifier	 new Attribute Value
;	TokenNameSEMICOLON	
/** * The namespaceURI. */	TokenNameCOMMENT_JAVADOC	 The namespaceURI. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
/** * Constructor. * * @param commandName * The name of this command. * @param contextElement * The context element * @param attributeName * The attribute name * @param prevAttributeValue * The previous attribute value * @param newAttributeValue * The new attribute value * @param namespaceURI * The namespaceURI */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param commandName The name of this command. @param contextElement The context element @param attributeName The attribute name @param prevAttributeValue The previous attribute value @param newAttributeValue The new attribute value @param namespaceURI The namespaceURI 
public	TokenNamepublic	
AttributeModifiedCommand	TokenNameIdentifier	 Attribute Modified Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
contextElement	TokenNameIdentifier	 context Element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newAttributeValue	TokenNameIdentifier	 new Attribute Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
namespaceURI	TokenNameIdentifier	 namespace URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contextElement	TokenNameIdentifier	 context Element
=	TokenNameEQUAL	
contextElement	TokenNameIdentifier	 context Element
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
attributeName	TokenNameIdentifier	 attribute Name
=	TokenNameEQUAL	
attributeName	TokenNameIdentifier	 attribute Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
=	TokenNameEQUAL	
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newAttributeValue	TokenNameIdentifier	 new Attribute Value
=	TokenNameEQUAL	
newAttributeValue	TokenNameIdentifier	 new Attribute Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
namespaceURI	TokenNameIdentifier	 namespace URI
=	TokenNameEQUAL	
namespaceURI	TokenNameIdentifier	 namespace URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextElement	TokenNameIdentifier	 context Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
prevAttributeValue	TokenNameIdentifier	 prev Attribute Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextElement	TokenNameIdentifier	 context Element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
namespaceURI	TokenNameIdentifier	 namespace URI
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
newAttributeValue	TokenNameIdentifier	 new Attribute Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contextElement	TokenNameIdentifier	 context Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
attributeName	TokenNameIdentifier	 attribute Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds CharDataModifiedCommand to historyBrowser. * * @param contextNode * The node whose nodeValue changed * @param oldValue * The old node value * @param newValue * The new node value */	TokenNameCOMMENT_JAVADOC	 Adds CharDataModifiedCommand to historyBrowser. * @param contextNode The node whose nodeValue changed @param oldValue The old node value @param newValue The new node value 
public	TokenNamepublic	
void	TokenNamevoid	
charDataModified	TokenNameIdentifier	 char Data Modified
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
oldValue	TokenNameIdentifier	 old Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createCharDataModifiedCommand	TokenNameIdentifier	 create Char Data Modified Command
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
oldValue	TokenNameIdentifier	 old Value
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the CharDataModified command. * * @param contextNode * The node whose nodeValue changed * @param oldValue * The old node value * @param newValue * The new node value */	TokenNameCOMMENT_JAVADOC	 Creates the CharDataModified command. * @param contextNode The node whose nodeValue changed @param oldValue The old node value @param newValue The new node value 
public	TokenNamepublic	
CharDataModifiedCommand	TokenNameIdentifier	 Char Data Modified Command
createCharDataModifiedCommand	TokenNameIdentifier	 create Char Data Modified Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
oldValue	TokenNameIdentifier	 old Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CharDataModifiedCommand	TokenNameIdentifier	 Char Data Modified Command
(	TokenNameLPAREN	
CHAR_DATA_MODIFIED_COMMAND	TokenNameIdentifier	 CHAR  DATA  MODIFIED  COMMAND
+	TokenNamePLUS	
getBracketedNodeName	TokenNameIdentifier	 get Bracketed Node Name
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
oldValue	TokenNameIdentifier	 old Value
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the node value. */	TokenNameCOMMENT_JAVADOC	 Sets the node value. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CharDataModifiedCommand	TokenNameIdentifier	 Char Data Modified Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The node whose value changed. */	TokenNameCOMMENT_JAVADOC	 The node whose value changed. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
;	TokenNameSEMICOLON	
/** * Old node value. */	TokenNameCOMMENT_JAVADOC	 Old node value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
oldValue	TokenNameIdentifier	 old Value
;	TokenNameSEMICOLON	
/** * New node value. */	TokenNameCOMMENT_JAVADOC	 New node value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
/** * Constructor. * * @param commandName * The command name * @param contextNode * Context node * @param oldValue * Old node value * @param newValue * New node value */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param commandName The command name @param contextNode Context node @param oldValue Old node value @param newValue New node value 
public	TokenNamepublic	
CharDataModifiedCommand	TokenNameIdentifier	 Char Data Modified Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
oldValue	TokenNameIdentifier	 old Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
contextNode	TokenNameIdentifier	 context Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldValue	TokenNameIdentifier	 old Value
=	TokenNameEQUAL	
oldValue	TokenNameIdentifier	 old Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextNode	TokenNameIdentifier	 context Node
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
oldValue	TokenNameIdentifier	 old Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contextNode	TokenNameIdentifier	 context Node
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// OTHER COMMANDS 	TokenNameCOMMENT_LINE	OTHER COMMANDS 
/** * Adds and executes the AppendChildCommand to historyBrowser. * * @param parent * The given parent * @param child * The node to be appended */	TokenNameCOMMENT_JAVADOC	 Adds and executes the AppendChildCommand to historyBrowser. * @param parent The given parent @param child The node to be appended 
public	TokenNamepublic	
void	TokenNamevoid	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createAppendChildCommand	TokenNameIdentifier	 create Append Child Command
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and return the AppendChild command. * * @param parent * The given parent * @param child * The node to be appended * @return the AppendChild command */	TokenNameCOMMENT_JAVADOC	 Creates and return the AppendChild command. * @param parent The given parent @param child The node to be appended @return the AppendChild command 
public	TokenNamepublic	
AppendChildCommand	TokenNameIdentifier	 Append Child Command
createAppendChildCommand	TokenNameIdentifier	 create Append Child Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AppendChildCommand	TokenNameIdentifier	 Append Child Command
(	TokenNameLPAREN	
getAppendChildCommandName	TokenNameIdentifier	 get Append Child Command Name
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The AppendChild command. Appends the given node to the given parent node * as a last child. */	TokenNameCOMMENT_JAVADOC	 The AppendChild command. Appends the given node to the given parent node as a last child. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AppendChildCommand	TokenNameIdentifier	 Append Child Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The node's previous parent. */	TokenNameCOMMENT_JAVADOC	 The node's previous parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
oldParentNode	TokenNameIdentifier	 old Parent Node
;	TokenNameSEMICOLON	
/** * The node's previous next sibling. */	TokenNameCOMMENT_JAVADOC	 The node's previous next sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
oldNextSibling	TokenNameIdentifier	 old Next Sibling
;	TokenNameSEMICOLON	
/** * The node's new parent. */	TokenNameCOMMENT_JAVADOC	 The node's new parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
;	TokenNameSEMICOLON	
/** * The node to be appended. */	TokenNameCOMMENT_JAVADOC	 The node to be appended. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
childNode	TokenNameIdentifier	 child Node
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
AppendChildCommand	TokenNameIdentifier	 Append Child Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldParentNode	TokenNameIdentifier	 old Parent Node
=	TokenNameEQUAL	
childNode	TokenNameIdentifier	 child Node
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldNextSibling	TokenNameIdentifier	 old Next Sibling
=	TokenNameEQUAL	
childNode	TokenNameIdentifier	 child Node
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parentNode	TokenNameIdentifier	 parent Node
=	TokenNameEQUAL	
parentNode	TokenNameIdentifier	 parent Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
childNode	TokenNameIdentifier	 child Node
=	TokenNameEQUAL	
childNode	TokenNameIdentifier	 child Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldParentNode	TokenNameIdentifier	 old Parent Node
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldParentNode	TokenNameIdentifier	 old Parent Node
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
,	TokenNameCOMMA	
oldNextSibling	TokenNameIdentifier	 old Next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parentNode	TokenNameIdentifier	 parent Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
childNode	TokenNameIdentifier	 child Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds and executes the InsertNodeBeforeCommand to historyBrowser. * * @param parent * The given parent * @param sibling * Points where to be inserted * @param child * The node to insert */	TokenNameCOMMENT_JAVADOC	 Adds and executes the InsertNodeBeforeCommand to historyBrowser. * @param parent The given parent @param sibling Points where to be inserted @param child The node to insert 
public	TokenNamepublic	
void	TokenNamevoid	
insertChildBefore	TokenNameIdentifier	 insert Child Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createAppendChildCommand	TokenNameIdentifier	 create Append Child Command
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createInsertNodeBeforeCommand	TokenNameIdentifier	 create Insert Node Before Command
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates InsertChildBefore or AppendChild command, depending on the value * of siblingNode. * * @param parent * The parent node * @param sibling * The sibling node * @param child * The child node * @return AppendChild command if sibling node is null, InsertChildBefore * otherwise */	TokenNameCOMMENT_JAVADOC	 Creates InsertChildBefore or AppendChild command, depending on the value of siblingNode. * @param parent The parent node @param sibling The sibling node @param child The child node @return AppendChild command if sibling node is null, InsertChildBefore otherwise 
public	TokenNamepublic	
UndoableCommand	TokenNameIdentifier	 Undoable Command
createInsertChildCommand	TokenNameIdentifier	 create Insert Child Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sibling	TokenNameIdentifier	 sibling
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
createAppendChildCommand	TokenNameIdentifier	 create Append Child Command
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
createInsertNodeBeforeCommand	TokenNameIdentifier	 create Insert Node Before Command
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Creates and returns the InsertNodeBeforeCommand. * * @param parent * The given parent * @param sibling * Points where to be inserted * @param child * The node to insert * @return the InsertNodeBeforeCommand */	TokenNameCOMMENT_JAVADOC	 Creates and returns the InsertNodeBeforeCommand. * @param parent The given parent @param sibling Points where to be inserted @param child The node to insert @return the InsertNodeBeforeCommand 
public	TokenNamepublic	
InsertNodeBeforeCommand	TokenNameIdentifier	 Insert Node Before Command
createInsertNodeBeforeCommand	TokenNameIdentifier	 create Insert Node Before Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
InsertNodeBeforeCommand	TokenNameIdentifier	 Insert Node Before Command
(	TokenNameLPAREN	
getInsertBeforeCommandName	TokenNameIdentifier	 get Insert Before Command Name
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
sibling	TokenNameIdentifier	 sibling
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inserts the given node as a child to the given parent node before the * specified sibling node, or as the last child of the given parent, if the * sibling node is null. */	TokenNameCOMMENT_JAVADOC	 Inserts the given node as a child to the given parent node before the specified sibling node, or as the last child of the given parent, if the sibling node is null. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InsertNodeBeforeCommand	TokenNameIdentifier	 Insert Node Before Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The node's previous parent. */	TokenNameCOMMENT_JAVADOC	 The node's previous parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
oldParent	TokenNameIdentifier	 old Parent
;	TokenNameSEMICOLON	
/** * The node's previous next sibling. */	TokenNameCOMMENT_JAVADOC	 The node's previous next sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
oldNextSibling	TokenNameIdentifier	 old Next Sibling
;	TokenNameSEMICOLON	
/** * The node's new next sibling. */	TokenNameCOMMENT_JAVADOC	 The node's new next sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNextSibling	TokenNameIdentifier	 new Next Sibling
;	TokenNameSEMICOLON	
/** * The node's new parent. */	TokenNameCOMMENT_JAVADOC	 The node's new parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
/** * The node to be appended. */	TokenNameCOMMENT_JAVADOC	 The node to be appended. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
InsertNodeBeforeCommand	TokenNameIdentifier	 Insert Node Before Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldParent	TokenNameIdentifier	 old Parent
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldNextSibling	TokenNameIdentifier	 old Next Sibling
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newNextSibling	TokenNameIdentifier	 new Next Sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newNextSibling	TokenNameIdentifier	 new Next Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
newNextSibling	TokenNameIdentifier	 new Next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.batik.util.gui.AbstractUndoableCommand#undo() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.batik.util.gui.AbstractUndoableCommand#undo() 
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldParent	TokenNameIdentifier	 old Parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldParent	TokenNameIdentifier	 old Parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
oldNextSibling	TokenNameIdentifier	 old Next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds and executes the ReplaceChild command to historyBrowser. * * @param parent * The parent node * @param newChild * Points where to be inserted * @param oldChild * The node to be appended */	TokenNameCOMMENT_JAVADOC	 Adds and executes the ReplaceChild command to historyBrowser. * @param parent The parent node @param newChild Points where to be inserted @param oldChild The node to be appended 
public	TokenNamepublic	
void	TokenNamevoid	
replaceChild	TokenNameIdentifier	 replace Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
newChild	TokenNameIdentifier	 new Child
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
oldChild	TokenNameIdentifier	 old Child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (sibling == null) { 	TokenNameCOMMENT_LINE	if (sibling == null) { 
// historyBrowser.addCommand(new AppendChildCommand( 	TokenNameCOMMENT_LINE	historyBrowser.addCommand(new AppendChildCommand( 
// APPEND_CHILD_COMMAND, parent, child)); 	TokenNameCOMMENT_LINE	APPEND_CHILD_COMMAND, parent, child)); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// historyBrowser.addCommand(new InsertNodeBeforeCommand( 	TokenNameCOMMENT_LINE	historyBrowser.addCommand(new InsertNodeBeforeCommand( 
// REPLACE_CHILD_COMMAND, parent, sibling, child)); 	TokenNameCOMMENT_LINE	REPLACE_CHILD_COMMAND, parent, sibling, child)); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
/** * insertBefore */	TokenNameCOMMENT_JAVADOC	 insertBefore 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ReplaceChildCommand	TokenNameIdentifier	 Replace Child Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The node's previous parent. */	TokenNameCOMMENT_JAVADOC	 The node's previous parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
oldParent	TokenNameIdentifier	 old Parent
;	TokenNameSEMICOLON	
/** * The node's previous next sibling. */	TokenNameCOMMENT_JAVADOC	 The node's previous next sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
oldNextSibling	TokenNameIdentifier	 old Next Sibling
;	TokenNameSEMICOLON	
/** * The node's new next sibling. */	TokenNameCOMMENT_JAVADOC	 The node's new next sibling. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNextSibling	TokenNameIdentifier	 new Next Sibling
;	TokenNameSEMICOLON	
/** * The node's new parent. */	TokenNameCOMMENT_JAVADOC	 The node's new parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
/** * The node to be appended. */	TokenNameCOMMENT_JAVADOC	 The node to be appended. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
ReplaceChildCommand	TokenNameIdentifier	 Replace Child Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sibling	TokenNameIdentifier	 sibling
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldParent	TokenNameIdentifier	 old Parent
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getParentNode	TokenNameIdentifier	 get Parent Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
oldNextSibling	TokenNameIdentifier	 old Next Sibling
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newNextSibling	TokenNameIdentifier	 new Next Sibling
=	TokenNameEQUAL	
sibling	TokenNameIdentifier	 sibling
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newNextSibling	TokenNameIdentifier	 new Next Sibling
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
newNextSibling	TokenNameIdentifier	 new Next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
oldParent	TokenNameIdentifier	 old Parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oldParent	TokenNameIdentifier	 old Parent
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
oldNextSibling	TokenNameIdentifier	 old Next Sibling
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds and executes the RemoveChild command to the History Browser. * * @param parent * The given parent * @param child * The given child */	TokenNameCOMMENT_JAVADOC	 Adds and executes the RemoveChild command to the History Browser. * @param parent The given parent @param child The given child 
public	TokenNamepublic	
void	TokenNamevoid	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createRemoveChildCommand	TokenNameIdentifier	 create Remove Child Command
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns the RemoveChild command. * * @param parent * The parent node * @param child * The child node * @return The RemoveChild command */	TokenNameCOMMENT_JAVADOC	 Creates and returns the RemoveChild command. * @param parent The parent node @param child The child node @return The RemoveChild command 
public	TokenNamepublic	
RemoveChildCommand	TokenNameIdentifier	 Remove Child Command
createRemoveChildCommand	TokenNameIdentifier	 create Remove Child Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RemoveChildCommand	TokenNameIdentifier	 Remove Child Command
(	TokenNameLPAREN	
getRemoveChildCommandName	TokenNameIdentifier	 get Remove Child Command Name
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The RemoveChild command. Removes the given child node from its given * parent node. */	TokenNameCOMMENT_JAVADOC	 The RemoveChild command. Removes the given child node from its given parent node. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
RemoveChildCommand	TokenNameIdentifier	 Remove Child Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * Node's previous parent. */	TokenNameCOMMENT_JAVADOC	 Node's previous parent. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
;	TokenNameSEMICOLON	
/** * The node to be removed. */	TokenNameCOMMENT_JAVADOC	 The node to be removed. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
childNode	TokenNameIdentifier	 child Node
;	TokenNameSEMICOLON	
/** * Node's index in parent's children array. */	TokenNameCOMMENT_JAVADOC	 Node's index in parent's children array. 
protected	TokenNameprotected	
int	TokenNameint	
indexInChildrenArray	TokenNameIdentifier	 index In Children Array
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
RemoveChildCommand	TokenNameIdentifier	 Remove Child Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parentNode	TokenNameIdentifier	 parent Node
=	TokenNameEQUAL	
parentNode	TokenNameIdentifier	 parent Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
childNode	TokenNameIdentifier	 child Node
=	TokenNameEQUAL	
childNode	TokenNameIdentifier	 child Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexInChildrenArray	TokenNameIdentifier	 index In Children Array
=	TokenNameEQUAL	
DOMUtilities	TokenNameIdentifier	 DOM Utilities
.	TokenNameDOT	
getChildIndex	TokenNameIdentifier	 get Child Index
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
,	TokenNameCOMMA	
parentNode	TokenNameIdentifier	 parent Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
refChild	TokenNameIdentifier	 ref Child
=	TokenNameEQUAL	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
getChildNodes	TokenNameIdentifier	 get Child Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
indexInChildrenArray	TokenNameIdentifier	 index In Children Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
,	TokenNameCOMMA	
refChild	TokenNameIdentifier	 ref Child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentNode	TokenNameIdentifier	 parent Node
.	TokenNameDOT	
removeChild	TokenNameIdentifier	 remove Child
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parentNode	TokenNameIdentifier	 parent Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
childNode	TokenNameIdentifier	 child Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds and executes the ChangeNodeValueCommand to historyBrowser. * * @param contextNode * The node whose nodeValue changed * @param newValue * The new node value */	TokenNameCOMMENT_JAVADOC	 Adds and executes the ChangeNodeValueCommand to historyBrowser. * @param contextNode The node whose nodeValue changed @param newValue The new node value 
public	TokenNamepublic	
void	TokenNamevoid	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
createChangeNodeValueCommand	TokenNameIdentifier	 create Change Node Value Command
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns the ChangeNodeValue command. * * @param contextNode * The node whose nodeValue changed * @param newValue * The new node value * @return the ChangeNodeValue command */	TokenNameCOMMENT_JAVADOC	 Creates and returns the ChangeNodeValue command. * @param contextNode The node whose nodeValue changed @param newValue The new node value @return the ChangeNodeValue command 
public	TokenNamepublic	
ChangeNodeValueCommand	TokenNameIdentifier	 Change Node Value Command
createChangeNodeValueCommand	TokenNameIdentifier	 create Change Node Value Command
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ChangeNodeValueCommand	TokenNameIdentifier	 Change Node Value Command
(	TokenNameLPAREN	
getChangeNodeValueCommandName	TokenNameIdentifier	 get Change Node Value Command Name
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
,	TokenNameCOMMA	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The Change Node Value command. Sets the given node value to the given * node. */	TokenNameCOMMENT_JAVADOC	 The Change Node Value command. Sets the given node value to the given node. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ChangeNodeValueCommand	TokenNameIdentifier	 Change Node Value Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The node whose value changed. */	TokenNameCOMMENT_JAVADOC	 The node whose value changed. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
;	TokenNameSEMICOLON	
/** * New node value. */	TokenNameCOMMENT_JAVADOC	 New node value. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
ChangeNodeValueCommand	TokenNameIdentifier	 Change Node Value Command
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
commandName	TokenNameIdentifier	 command Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
contextNode	TokenNameIdentifier	 context Node
=	TokenNameEQUAL	
contextNode	TokenNameIdentifier	 context Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
oldNodeValue	TokenNameIdentifier	 old Node Value
=	TokenNameEQUAL	
contextNode	TokenNameIdentifier	 context Node
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contextNode	TokenNameIdentifier	 context Node
.	TokenNameDOT	
setNodeValue	TokenNameIdentifier	 set Node Value
(	TokenNameLPAREN	
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newValue	TokenNameIdentifier	 new Value
=	TokenNameEQUAL	
oldNodeValue	TokenNameIdentifier	 old Node Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the current compound command. * * @return the currentCompoundCommand */	TokenNameCOMMENT_JAVADOC	 Gets the current compound command. * @return the currentCompoundCommand 
public	TokenNamepublic	
AbstractCompoundCommand	TokenNameIdentifier	 Abstract Compound Command
getCurrentCompoundCommand	TokenNameIdentifier	 get Current Compound Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentCompoundCommand	TokenNameIdentifier	 current Compound Command
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentCompoundCommand	TokenNameIdentifier	 current Compound Command
=	TokenNameEQUAL	
createCompoundUpdateCommand	TokenNameIdentifier	 create Compound Update Command
(	TokenNameLPAREN	
OUTER_EDIT_COMMAND	TokenNameIdentifier	 OUTER  EDIT  COMMAND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
currentCompoundCommand	TokenNameIdentifier	 current Compound Command
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the given command to current compound command. * * @param cmd * The command to add */	TokenNameCOMMENT_JAVADOC	 Adds the given command to current compound command. * @param cmd The command to add 
public	TokenNamepublic	
void	TokenNamevoid	
addToCurrentCompoundCommand	TokenNameIdentifier	 add To Current Compound Command
(	TokenNameLPAREN	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getCurrentCompoundCommand	TokenNameIdentifier	 get Current Compound Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
cmd	TokenNameIdentifier	 cmd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fire the 'doCompoundEdit' event 	TokenNameCOMMENT_LINE	Fire the 'doCompoundEdit' event 
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
fireDoCompoundEdit	TokenNameIdentifier	 fire Do Compound Edit
(	TokenNameLPAREN	
new	TokenNamenew	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
(	TokenNameLPAREN	
getCurrentCompoundCommand	TokenNameIdentifier	 get Current Compound Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds and executes the current compound command to history browser. */	TokenNameCOMMENT_JAVADOC	 Adds and executes the current compound command to history browser. 
public	TokenNamepublic	
void	TokenNamevoid	
performCurrentCompoundCommand	TokenNameIdentifier	 perform Current Compound Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getCurrentCompoundCommand	TokenNameIdentifier	 get Current Compound Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCommandNumber	TokenNameIdentifier	 get Command Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
getCurrentCompoundCommand	TokenNameIdentifier	 get Current Compound Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Fire the 'compoundEditPerformed' event 	TokenNameCOMMENT_LINE	Fire the 'compoundEditPerformed' event 
historyBrowser	TokenNameIdentifier	 history Browser
.	TokenNameDOT	
fireCompoundEditPerformed	TokenNameIdentifier	 fire Compound Edit Performed
(	TokenNameLPAREN	
new	TokenNamenew	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
(	TokenNameLPAREN	
currentCompoundCommand	TokenNameIdentifier	 current Compound Command
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Reset the current compound command 	TokenNameCOMMENT_LINE	Reset the current compound command 
currentCompoundCommand	TokenNameIdentifier	 current Compound Command
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Command names 	TokenNameCOMMENT_LINE	Command names 
/** * Gets the node name and the nodes id (nodeName + "nodeId"). * * @param node * The given node * @return e.g. node name with quoted node id or node name if id is empty * String */	TokenNameCOMMENT_JAVADOC	 Gets the node name and the nodes id (nodeName + "nodeId"). * @param node The given node @return e.g. node name with quoted node id or node name if id is empty String 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
.	TokenNameDOT	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" ""	TokenNameStringLiteral	 "
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the node info in brackets. * * @param node * The given node * @return e.g (rect "23") */	TokenNameCOMMENT_JAVADOC	 Gets the node info in brackets. * @param node The given node @return e.g (rect "23") 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getBracketedNodeName	TokenNameIdentifier	 get Bracketed Node Name
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generates the "Append Child" command name. * * @param parentNode * The parent node * @param childNode * The child node * @return The command name */	TokenNameCOMMENT_JAVADOC	 Generates the "Append Child" command name. * @param parentNode The parent node @param childNode The child node @return The command name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getAppendChildCommandName	TokenNameIdentifier	 get Append Child Command Name
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Append "	TokenNameStringLiteral	Append 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
parentNode	TokenNameIdentifier	 parent Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generates the "Insert Child Before" command name. * * @param parentNode * The parentNode * @param childNode * The node being inserted * @param siblingNode * The new sibling node * @return The command name */	TokenNameCOMMENT_JAVADOC	 Generates the "Insert Child Before" command name. * @param parentNode The parentNode @param childNode The node being inserted @param siblingNode The new sibling node @return The command name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getInsertBeforeCommandName	TokenNameIdentifier	 get Insert Before Command Name
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parentNode	TokenNameIdentifier	 parent Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
childNode	TokenNameIdentifier	 child Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
siblingNode	TokenNameIdentifier	 sibling Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Insert "	TokenNameStringLiteral	Insert 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
childNode	TokenNameIdentifier	 child Node
)	TokenNameRPAREN	
+	TokenNamePLUS	
" to "	TokenNameStringLiteral	 to 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
parentNode	TokenNameIdentifier	 parent Node
)	TokenNameRPAREN	
+	TokenNamePLUS	
" before "	TokenNameStringLiteral	 before 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
siblingNode	TokenNameIdentifier	 sibling Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generates the "Remove Child" command name. * * @param parent * The parent node * @param child * The child node * @return The command name */	TokenNameCOMMENT_JAVADOC	 Generates the "Remove Child" command name. * @param parent The parent node @param child The child node @return The command name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getRemoveChildCommandName	TokenNameIdentifier	 get Remove Child Command Name
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Remove "	TokenNameStringLiteral	Remove 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
+	TokenNamePLUS	
" from "	TokenNameStringLiteral	 from 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generates the "Change Node Value" command name. * * @param contextNode * The node whose value is to be changed * @param newValue * The new node value * @return The command name */	TokenNameCOMMENT_JAVADOC	 Generates the "Change Node Value" command name. * @param contextNode The node whose value is to be changed @param newValue The new node value @return The command name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getChangeNodeValueCommandName	TokenNameIdentifier	 get Change Node Value Command Name
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
newValue	TokenNameIdentifier	 new Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Change "	TokenNameStringLiteral	Change 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
+	TokenNamePLUS	
" value to "	TokenNameStringLiteral	 value to 
+	TokenNamePLUS	
newValue	TokenNameIdentifier	 new Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Generates the "Node Changed" command name. * @return The command name */	TokenNameCOMMENT_JAVADOC	 Generates the "Node Changed" command name. @return The command name 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getNodeChangedCommandName	TokenNameIdentifier	 get Node Changed Command Name
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Node "	TokenNameStringLiteral	Node 
+	TokenNamePLUS	
getNodeAsString	TokenNameIdentifier	 get Node As String
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
+	TokenNamePLUS	
" changed"	TokenNameStringLiteral	 changed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
