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
JTable	TokenNameIdentifier	 J Table
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
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ChangeEvent	TokenNameIdentifier	 Change Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
EventListenerList	TokenNameIdentifier	 Event Listener List
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
TableCellEditor	TokenNameIdentifier	 Table Cell Editor
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
TreeCellEditor	TokenNameIdentifier	 Tree Cell Editor
;	TokenNameSEMICOLON	
/** * CategoryAbstractCellEditor. Base class to handle the some common * details of cell editing. * * @author Michael J. Sikorsky * @author Robert Shaw */	TokenNameCOMMENT_JAVADOC	 CategoryAbstractCellEditor. Base class to handle the some common details of cell editing. * @author Michael J. Sikorsky @author Robert Shaw 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
CategoryAbstractCellEditor	TokenNameIdentifier	 Category Abstract Cell Editor
implements	TokenNameimplements	
TableCellEditor	TokenNameIdentifier	 Table Cell Editor
,	TokenNameCOMMA	
TreeCellEditor	TokenNameIdentifier	 Tree Cell Editor
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
EventListenerList	TokenNameIdentifier	 Event Listener List
_listenerList	TokenNameIdentifier	 listener List
=	TokenNameEQUAL	
new	TokenNamenew	
EventListenerList	TokenNameIdentifier	 Event Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
ChangeEvent	TokenNameIdentifier	 Change Event
_changeEvent	TokenNameIdentifier	 change Event
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_clickCountToStart	TokenNameIdentifier	 click Count To Start
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getCellEditorValue	TokenNameIdentifier	 get Cell Editor Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCellEditorValue	TokenNameIdentifier	 set Cell Editor Value
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setClickCountToStart	TokenNameIdentifier	 set Click Count To Start
(	TokenNameLPAREN	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_clickCountToStart	TokenNameIdentifier	 click Count To Start
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getClickCountToStart	TokenNameIdentifier	 get Click Count To Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_clickCountToStart	TokenNameIdentifier	 click Count To Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isCellEditable	TokenNameIdentifier	 is Cell Editable
(	TokenNameLPAREN	
EventObject	TokenNameIdentifier	 Event Object
anEvent	TokenNameIdentifier	 an Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anEvent	TokenNameIdentifier	 an Event
instanceof	TokenNameinstanceof	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
anEvent	TokenNameIdentifier	 an Event
)	TokenNameRPAREN	
.	TokenNameDOT	
getClickCount	TokenNameIdentifier	 get Click Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
_clickCountToStart	TokenNameIdentifier	 click Count To Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldSelectCell	TokenNameIdentifier	 should Select Cell
(	TokenNameLPAREN	
EventObject	TokenNameIdentifier	 Event Object
anEvent	TokenNameIdentifier	 an Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
isCellEditable	TokenNameIdentifier	 is Cell Editable
(	TokenNameLPAREN	
anEvent	TokenNameIdentifier	 an Event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
anEvent	TokenNameIdentifier	 an Event
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
)	TokenNameRPAREN	
anEvent	TokenNameIdentifier	 an Event
)	TokenNameRPAREN	
.	TokenNameDOT	
getClickCount	TokenNameIdentifier	 get Click Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
_clickCountToStart	TokenNameIdentifier	 click Count To Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
stopCellEditing	TokenNameIdentifier	 stop Cell Editing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireEditingStopped	TokenNameIdentifier	 fire Editing Stopped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cancelCellEditing	TokenNameIdentifier	 cancel Cell Editing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fireEditingCanceled	TokenNameIdentifier	 fire Editing Canceled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addCellEditorListener	TokenNameIdentifier	 add Cell Editor Listener
(	TokenNameLPAREN	
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_listenerList	TokenNameIdentifier	 listener List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeCellEditorListener	TokenNameIdentifier	 remove Cell Editor Listener
(	TokenNameLPAREN	
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_listenerList	TokenNameIdentifier	 listener List
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Component	TokenNameIdentifier	 Component
getTableCellEditorComponent	TokenNameIdentifier	 get Table Cell Editor Component
(	TokenNameLPAREN	
JTable	TokenNameIdentifier	 J Table
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isSelected	TokenNameIdentifier	 is Selected
,	TokenNameCOMMA	
int	TokenNameint	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
void	TokenNamevoid	
fireEditingStopped	TokenNameIdentifier	 fire Editing Stopped
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
_listenerList	TokenNameIdentifier	 listener List
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_changeEvent	TokenNameIdentifier	 change Event
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_changeEvent	TokenNameIdentifier	 change Event
=	TokenNameEQUAL	
new	TokenNamenew	
ChangeEvent	TokenNameIdentifier	 Change Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
editingStopped	TokenNameIdentifier	 editing Stopped
(	TokenNameLPAREN	
_changeEvent	TokenNameIdentifier	 change Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
fireEditingCanceled	TokenNameIdentifier	 fire Editing Canceled
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
_listenerList	TokenNameIdentifier	 listener List
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_changeEvent	TokenNameIdentifier	 change Event
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_changeEvent	TokenNameIdentifier	 change Event
=	TokenNameEQUAL	
new	TokenNamenew	
ChangeEvent	TokenNameIdentifier	 Change Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CellEditorListener	TokenNameIdentifier	 Cell Editor Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
editingCanceled	TokenNameIdentifier	 editing Canceled
(	TokenNameLPAREN	
_changeEvent	TokenNameIdentifier	 change Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
