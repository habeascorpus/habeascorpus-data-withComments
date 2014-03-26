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
AWTEventMulticaster	TokenNameIdentifier	 AWT Event Multicaster
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
SwingUtilities	TokenNameIdentifier	 Swing Utilities
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
DefaultTreeModel	TokenNameIdentifier	 Default Tree Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
TreeNode	TokenNameIdentifier	 Tree Node
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
LogRecord	TokenNameIdentifier	 Log Record
;	TokenNameSEMICOLON	
/** * CategoryExplorerModel * * @author Michael J. Sikorsky * @author Robert Shaw * @author Brent Sprecher * @author Richard Hurst */	TokenNameCOMMENT_JAVADOC	 CategoryExplorerModel * @author Michael J. Sikorsky @author Robert Shaw @author Brent Sprecher @author Richard Hurst 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
extends	TokenNameextends	
DefaultTreeModel	TokenNameIdentifier	 Default Tree Model
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
3413887384316015901L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
boolean	TokenNameboolean	
_renderFatal	TokenNameIdentifier	 render Fatal
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ActionListener	TokenNameIdentifier	 Action Listener
_listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ActionEvent	TokenNameIdentifier	 Action Event
_event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
ActionEvent	TokenNameIdentifier	 Action Event
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
ActionEvent	TokenNameIdentifier	 Action Event
.	TokenNameDOT	
ACTION_PERFORMED	TokenNameIdentifier	 ACTION  PERFORMED
,	TokenNameCOMMA	
"Nodes Selection changed"	TokenNameStringLiteral	Nodes Selection changed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
CategoryExplorerModel	TokenNameIdentifier	 Category Explorer Model
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
void	TokenNamevoid	
addLogRecord	TokenNameIdentifier	 add Log Record
(	TokenNameLPAREN	
LogRecord	TokenNameIdentifier	 Log Record
lr	TokenNameIdentifier	 lr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create category path if it is new 	TokenNameCOMMENT_LINE	create category path if it is new 
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
getCategoryNode	TokenNameIdentifier	 get Category Node
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
addRecord	TokenNameIdentifier	 add Record
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// update category node 	TokenNameCOMMENT_LINE	update category node 
if	TokenNameif	
(	TokenNameLPAREN	
_renderFatal	TokenNameIdentifier	 render Fatal
&&	TokenNameAND_AND	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
isFatal	TokenNameIdentifier	 is Fatal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeNode	TokenNameIdentifier	 Tree Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
getPathToRoot	TokenNameIdentifier	 get Path To Root
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
// i = 0 gives root node 	TokenNameCOMMENT_LINE	i = 0 gives root node 
// skip node and root, loop through "parents" in between 	TokenNameCOMMENT_LINE	skip node and root, loop through "parents" in between 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setHasFatalChildren	TokenNameIdentifier	 set Has Fatal Children
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeChanged	TokenNameIdentifier	 node Changed
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
setHasFatalRecords	TokenNameIdentifier	 set Has Fatal Records
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeChanged	TokenNameIdentifier	 node Changed
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
CategoryNode	TokenNameIdentifier	 Category Node
getRootCategoryNode	TokenNameIdentifier	 get Root Category Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CategoryNode	TokenNameIdentifier	 Category Node
getCategoryNode	TokenNameIdentifier	 get Category Node
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
category	TokenNameIdentifier	 category
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
getCategoryNode	TokenNameIdentifier	 get Category Node
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns null if no CategoryNode exists. */	TokenNameCOMMENT_JAVADOC	 returns null if no CategoryNode exists. 
public	TokenNamepublic	
CategoryNode	TokenNameIdentifier	 Category Node
getCategoryNode	TokenNameIdentifier	 get Category Node
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryNode	TokenNameIdentifier	 Category Node
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
// Start condition. 	TokenNameCOMMENT_LINE	Start condition. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryElement	TokenNameIdentifier	 Category Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
categoryElementAt	TokenNameIdentifier	 category Element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the two nodes have matching titles they are considered equal. 	TokenNameCOMMENT_LINE	If the two nodes have matching titles they are considered equal. 
Enumeration	TokenNameIdentifier	 Enumeration
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
children	TokenNameIdentifier	 children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
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
children	TokenNameIdentifier	 children
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pathLC	TokenNameIdentifier	 path LC
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pathLC	TokenNameIdentifier	 path LC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// This is now the new parent node. 	TokenNameCOMMENT_LINE	This is now the new parent node. 
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// out of the while, and back to the for(). 	TokenNameCOMMENT_LINE	out of the while, and back to the for(). 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Didn't find the Node. 	TokenNameCOMMENT_LINE	Didn't find the Node. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if all the nodes in the specified CategoryPath are * selected. */	TokenNameCOMMENT_JAVADOC	 @return true if all the nodes in the specified CategoryPath are selected. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isCategoryPathActive	TokenNameIdentifier	 is Category Path Active
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryNode	TokenNameIdentifier	 Category Node
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
// Start condition. 	TokenNameCOMMENT_LINE	Start condition. 
boolean	TokenNameboolean	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
false	TokenNamefalse	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryElement	TokenNameIdentifier	 Category Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
categoryElementAt	TokenNameIdentifier	 category Element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the two nodes have matching titles they are considered equal. 	TokenNameCOMMENT_LINE	If the two nodes have matching titles they are considered equal. 
Enumeration	TokenNameIdentifier	 Enumeration
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
children	TokenNameIdentifier	 children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
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
children	TokenNameIdentifier	 children
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pathLC	TokenNameIdentifier	 path LC
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pathLC	TokenNameIdentifier	 path LC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// This is now the new parent node. 	TokenNameCOMMENT_LINE	This is now the new parent node. 
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// out of the while, and back to the for(). 	TokenNameCOMMENT_LINE	out of the while, and back to the for(). 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
||	TokenNameOR_OR	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p>Method altered by Richard Hurst such that it returns the CategoryNode * corresponding to the CategoryPath</p> * * @param path category path. * @return CategoryNode */	TokenNameCOMMENT_JAVADOC	 <p>Method altered by Richard Hurst such that it returns the CategoryNode corresponding to the CategoryPath</p> * @param path category path. @return CategoryNode 
public	TokenNamepublic	
CategoryNode	TokenNameIdentifier	 Category Node
addCategory	TokenNameIdentifier	 add Category
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryNode	TokenNameIdentifier	 Category Node
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
// Start condition. 	TokenNameCOMMENT_LINE	Start condition. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryElement	TokenNameIdentifier	 Category Element
element	TokenNameIdentifier	 element
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
categoryElementAt	TokenNameIdentifier	 category Element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the two nodes have matching titles they are considered equal. 	TokenNameCOMMENT_LINE	If the two nodes have matching titles they are considered equal. 
Enumeration	TokenNameIdentifier	 Enumeration
children	TokenNameIdentifier	 children
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
children	TokenNameIdentifier	 children
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
children	TokenNameIdentifier	 children
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
children	TokenNameIdentifier	 children
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pathLC	TokenNameIdentifier	 path LC
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pathLC	TokenNameIdentifier	 path LC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// This is now the new parent node. 	TokenNameCOMMENT_LINE	This is now the new parent node. 
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
categoryAlreadyExists	TokenNameIdentifier	 category Already Exists
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We need to add the node. 	TokenNameCOMMENT_LINE	We need to add the node. 
CategoryNode	TokenNameIdentifier	 Category Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryNode	TokenNameIdentifier	 Category Node
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//This method of adding a new node cause parent roots to be 	TokenNameCOMMENT_LINE	This method of adding a new node cause parent roots to be 
// collapsed. 	TokenNameCOMMENT_LINE	collapsed. 
//parent.add( newNode ); 	TokenNameCOMMENT_LINE	parent.add( newNode ); 
//reload(parent); 	TokenNameCOMMENT_LINE	reload(parent); 
// This doesn't force the nodes to collapse. 	TokenNameCOMMENT_LINE	This doesn't force the nodes to collapse. 
insertNodeInto	TokenNameIdentifier	 insert Node Into
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getChildCount	TokenNameIdentifier	 get Child Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The newly added node is now the parent. 	TokenNameCOMMENT_LINE	The newly added node is now the parent. 
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
newNode	TokenNameIdentifier	 new Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// nothing was changed, nothing to do 	TokenNameCOMMENT_LINE	nothing was changed, nothing to do 
}	TokenNameRBRACE	
// select parents or deselect children 	TokenNameCOMMENT_LINE	select parents or deselect children 
if	TokenNameif	
(	TokenNameLPAREN	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setParentSelection	TokenNameIdentifier	 set Parent Selection
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setDescendantSelection	TokenNameIdentifier	 set Descendant Selection
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setDescendantSelection	TokenNameIdentifier	 set Descendant Selection
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
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
// does the current node need to be changed? 	TokenNameCOMMENT_LINE	does the current node need to be changed? 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeChanged	TokenNameIdentifier	 node Changed
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
notifyActionListeners	TokenNameIdentifier	 notify Action Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setParentSelection	TokenNameIdentifier	 set Parent Selection
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
boolean	TokenNameboolean	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeNode	TokenNameIdentifier	 Tree Node
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
getPathToRoot	TokenNameIdentifier	 get Path To Root
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
CategoryNode	TokenNameIdentifier	 Category Node
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
// i = 0 gives root node, i=len-1 gives this node 	TokenNameCOMMENT_LINE	i = 0 gives root node, i=len-1 gives this node 
// skip the root node 	TokenNameCOMMENT_LINE	skip the root node 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
)	TokenNameRPAREN	
nodes	TokenNameIdentifier	 nodes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
selected	TokenNameIdentifier	 selected
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeChanged	TokenNameIdentifier	 node Changed
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
notifyActionListeners	TokenNameIdentifier	 notify Action Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
ActionListener	TokenNameIdentifier	 Action Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
AWTEventMulticaster	TokenNameIdentifier	 AWT Event Multicaster
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
_listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
removeActionListener	TokenNameIdentifier	 remove Action Listener
(	TokenNameLPAREN	
ActionListener	TokenNameIdentifier	 Action Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_listener	TokenNameIdentifier	 listener
=	TokenNameEQUAL	
AWTEventMulticaster	TokenNameIdentifier	 AWT Event Multicaster
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
_listener	TokenNameIdentifier	 listener
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
resetAllNodeCounts	TokenNameIdentifier	 reset All Node Counts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
nodes	TokenNameIdentifier	 nodes
=	TokenNameEQUAL	
getRootCategoryNode	TokenNameIdentifier	 get Root Category Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
nodes	TokenNameIdentifier	 nodes
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
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
resetNumberOfContainedRecords	TokenNameIdentifier	 reset Number Of Contained Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nodeChanged	TokenNameIdentifier	 node Changed
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <p>Returns the CategoryPath to the specified CategoryNode</p> * * @param node The target CategoryNode * @return CategoryPath */	TokenNameCOMMENT_JAVADOC	 <p>Returns the CategoryPath to the specified CategoryNode</p> * @param node The target CategoryNode @return CategoryPath 
public	TokenNamepublic	
TreePath	TokenNameIdentifier	 Tree Path
getTreePathToRoot	TokenNameIdentifier	 get Tree Path To Root
(	TokenNameLPAREN	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
new	TokenNamenew	
TreePath	TokenNameIdentifier	 Tree Path
(	TokenNameLPAREN	
getPathToRoot	TokenNameIdentifier	 get Path To Root
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
void	TokenNamevoid	
notifyActionListeners	TokenNameIdentifier	 notify Action Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_listener	TokenNameIdentifier	 listener
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_listener	TokenNameIdentifier	 listener
.	TokenNameDOT	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
_event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires a nodechanged event on the SwingThread. */	TokenNameCOMMENT_JAVADOC	 Fires a nodechanged event on the SwingThread. 
protected	TokenNameprotected	
void	TokenNamevoid	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
final	TokenNamefinal	
CategoryNode	TokenNameIdentifier	 Category Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SwingUtilities	TokenNameIdentifier	 Swing Utilities
.	TokenNameDOT	
invokeLater	TokenNameIdentifier	 invoke Later
(	TokenNameLPAREN	
new	TokenNamenew	
Runnable	TokenNameIdentifier	 Runnable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nodeChanged	TokenNameIdentifier	 node Changed
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remind the tree to render the new node 	TokenNameCOMMENT_LINE	remind the tree to render the new node 
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
