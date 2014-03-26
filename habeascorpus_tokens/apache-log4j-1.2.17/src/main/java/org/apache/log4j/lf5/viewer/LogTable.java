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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
FontMetrics	TokenNameIdentifier	 Font Metrics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics	TokenNameIdentifier	 Graphics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
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
JTextArea	TokenNameIdentifier	 J Text Area
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ListSelectionEvent	TokenNameIdentifier	 List Selection Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
ListSelectionListener	TokenNameIdentifier	 List Selection Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
TableColumn	TokenNameIdentifier	 Table Column
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
TableColumnModel	TokenNameIdentifier	 Table Column Model
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
;	TokenNameSEMICOLON	
/** * LogTable. * * @author Michael J. Sikorsky * @author Robert Shaw * @author Brad Marlborough * @author Brent Sprecher */	TokenNameCOMMENT_JAVADOC	 LogTable. * @author Michael J. Sikorsky @author Robert Shaw @author Brad Marlborough @author Brent Sprecher 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
LogTable	TokenNameIdentifier	 Log Table
extends	TokenNameextends	
JTable	TokenNameIdentifier	 J Table
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
4867085140195148458L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
int	TokenNameint	
_rowHeight	TokenNameIdentifier	 row Height
=	TokenNameEQUAL	
30	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
JTextArea	TokenNameIdentifier	 J Text Area
_detailTextArea	TokenNameIdentifier	 detail Text Area
;	TokenNameSEMICOLON	
// For the columns: 	TokenNameCOMMENT_LINE	For the columns: 
protected	TokenNameprotected	
int	TokenNameint	
_numCols	TokenNameIdentifier	 num Cols
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
TableColumn	TokenNameIdentifier	 Table Column
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_tableColumns	TokenNameIdentifier	 table Columns
=	TokenNameEQUAL	
new	TokenNamenew	
TableColumn	TokenNameIdentifier	 Table Column
[	TokenNameLBRACKET	
_numCols	TokenNameIdentifier	 num Cols
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_colWidths	TokenNameIdentifier	 col Widths
=	TokenNameEQUAL	
{	TokenNameLBRACE	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
360	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
440	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
LogTableColumn	TokenNameIdentifier	 Log Table Column
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_colNames	TokenNameIdentifier	 col Names
=	TokenNameEQUAL	
LogTableColumn	TokenNameIdentifier	 Log Table Column
.	TokenNameDOT	
getLogTableColumnArray	TokenNameIdentifier	 get Log Table Column Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colDate	TokenNameIdentifier	 col Date
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colThread	TokenNameIdentifier	 col Thread
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colMessageNum	TokenNameIdentifier	 col Message Num
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colLevel	TokenNameIdentifier	 col Level
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colNDC	TokenNameIdentifier	 col NDC
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colCategory	TokenNameIdentifier	 col Category
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colMessage	TokenNameIdentifier	 col Message
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colLocation	TokenNameIdentifier	 col Location
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_colThrown	TokenNameIdentifier	 col Thrown
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
_dateFormatManager	TokenNameIdentifier	 date Format Manager
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
LogTable	TokenNameIdentifier	 Log Table
(	TokenNameLPAREN	
JTextArea	TokenNameIdentifier	 J Text Area
detailTextArea	TokenNameIdentifier	 detail Text Area
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_detailTextArea	TokenNameIdentifier	 detail Text Area
=	TokenNameEQUAL	
detailTextArea	TokenNameIdentifier	 detail Text Area
;	TokenNameSEMICOLON	
setModel	TokenNameIdentifier	 set Model
(	TokenNameLPAREN	
new	TokenNamenew	
FilteredLogTableModel	TokenNameIdentifier	 Filtered Log Table Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
getColumnModel	TokenNameIdentifier	 get Column Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getColumns	TokenNameIdentifier	 get Columns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TableColumn	TokenNameIdentifier	 Table Column
col	TokenNameIdentifier	 col
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TableColumn	TokenNameIdentifier	 Table Column
)	TokenNameRPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
setCellRenderer	TokenNameIdentifier	 set Cell Renderer
(	TokenNameLPAREN	
new	TokenNamenew	
LogTableRowRenderer	TokenNameIdentifier	 Log Table Row Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
col	TokenNameIdentifier	 col
.	TokenNameDOT	
setPreferredWidth	TokenNameIdentifier	 set Preferred Width
(	TokenNameLPAREN	
_colWidths	TokenNameIdentifier	 col Widths
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_tableColumns	TokenNameIdentifier	 table Columns
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
col	TokenNameIdentifier	 col
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
rowSM	TokenNameIdentifier	 row SM
=	TokenNameEQUAL	
getSelectionModel	TokenNameIdentifier	 get Selection Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rowSM	TokenNameIdentifier	 row SM
.	TokenNameDOT	
addListSelectionListener	TokenNameIdentifier	 add List Selection Listener
(	TokenNameLPAREN	
new	TokenNamenew	
LogTableListSelectionListener	TokenNameIdentifier	 Log Table List Selection Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 	TokenNameCOMMENT_LINE	setAutoResizeMode(JTable.AUTO_RESIZE_ALL_COLUMNS); 
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * Get the DateFormatManager for formatting dates. */	TokenNameCOMMENT_JAVADOC	 Get the DateFormatManager for formatting dates. 
public	TokenNamepublic	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
getDateFormatManager	TokenNameIdentifier	 get Date Format Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_dateFormatManager	TokenNameIdentifier	 date Format Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the date format manager for formatting dates. */	TokenNameCOMMENT_JAVADOC	 Set the date format manager for formatting dates. 
public	TokenNamepublic	
void	TokenNamevoid	
setDateFormatManager	TokenNameIdentifier	 set Date Format Manager
(	TokenNameLPAREN	
DateFormatManager	TokenNameIdentifier	 Date Format Manager
dfm	TokenNameIdentifier	 dfm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_dateFormatManager	TokenNameIdentifier	 date Format Manager
=	TokenNameEQUAL	
dfm	TokenNameIdentifier	 dfm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clearLogRecords	TokenNameIdentifier	 clear Log Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//For JDK1.3 	TokenNameCOMMENT_LINE	For JDK1.3 
//((DefaultTableModel)getModel()).setRowCount(0); 	TokenNameCOMMENT_LINE	((DefaultTableModel)getModel()).setRowCount(0); 
// For JDK1.2.x 	TokenNameCOMMENT_LINE	For JDK1.2.x 
getFilteredLogTableModel	TokenNameIdentifier	 get Filtered Log Table Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FilteredLogTableModel	TokenNameIdentifier	 Filtered Log Table Model
getFilteredLogTableModel	TokenNameIdentifier	 get Filtered Log Table Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
FilteredLogTableModel	TokenNameIdentifier	 Filtered Log Table Model
)	TokenNameRPAREN	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// default view if a view is not set and saved 	TokenNameCOMMENT_LINE	default view if a view is not set and saved 
public	TokenNamepublic	
void	TokenNamevoid	
setDetailedView	TokenNameIdentifier	 set Detailed View
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//TODO: Defineable Views. 	TokenNameCOMMENT_LINE	TODO: Defineable Views. 
TableColumnModel	TokenNameIdentifier	 Table Column Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
getColumnModel	TokenNameIdentifier	 get Column Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove all the columns: 	TokenNameCOMMENT_LINE	Remove all the columns: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
<	TokenNameLESS	
_numCols	TokenNameIdentifier	 num Cols
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
removeColumn	TokenNameIdentifier	 remove Column
(	TokenNameLPAREN	
_tableColumns	TokenNameIdentifier	 table Columns
[	TokenNameLBRACKET	
f	TokenNameIdentifier	 f
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Add them back in the correct order: 	TokenNameCOMMENT_LINE	Add them back in the correct order: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
_numCols	TokenNameIdentifier	 num Cols
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
_tableColumns	TokenNameIdentifier	 table Columns
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//SWING BUG: 	TokenNameCOMMENT_LINE	SWING BUG: 
sizeColumnsToFit	TokenNameIdentifier	 size Columns To Fit
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setView	TokenNameIdentifier	 set View
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
columns	TokenNameIdentifier	 columns
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TableColumnModel	TokenNameIdentifier	 Table Column Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
getColumnModel	TokenNameIdentifier	 get Column Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Remove all the columns: 	TokenNameCOMMENT_LINE	Remove all the columns: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
<	TokenNameLESS	
_numCols	TokenNameIdentifier	 num Cols
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
removeColumn	TokenNameIdentifier	 remove Column
(	TokenNameLPAREN	
_tableColumns	TokenNameIdentifier	 table Columns
[	TokenNameLBRACKET	
f	TokenNameIdentifier	 f
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
selectedColumns	TokenNameIdentifier	 selected Columns
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Vector	TokenNameIdentifier	 Vector
columnNameAndNumber	TokenNameIdentifier	 column Name And Number
=	TokenNameEQUAL	
getColumnNameAndNumber	TokenNameIdentifier	 get Column Name And Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
selectedColumns	TokenNameIdentifier	 selected Columns
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// add the column to the view 	TokenNameCOMMENT_LINE	add the column to the view 
model	TokenNameIdentifier	 model
.	TokenNameDOT	
addColumn	TokenNameIdentifier	 add Column
(	TokenNameLPAREN	
_tableColumns	TokenNameIdentifier	 table Columns
[	TokenNameLBRACKET	
columnNameAndNumber	TokenNameIdentifier	 column Name And Number
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
selectedColumns	TokenNameIdentifier	 selected Columns
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//SWING BUG: 	TokenNameCOMMENT_LINE	SWING BUG: 
sizeColumnsToFit	TokenNameIdentifier	 size Columns To Fit
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
Font	TokenNameIdentifier	 Font
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Graphics	TokenNameIdentifier	 Graphics
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getGraphics	TokenNameIdentifier	 get Graphics
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FontMetrics	TokenNameIdentifier	 Font Metrics
fm	TokenNameIdentifier	 fm
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getFontMetrics	TokenNameIdentifier	 get Font Metrics
(	TokenNameLPAREN	
font	TokenNameIdentifier	 font
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
fm	TokenNameIdentifier	 fm
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_rowHeight	TokenNameIdentifier	 row Height
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
+	TokenNamePLUS	
height	TokenNameIdentifier	 height
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setRowHeight	TokenNameIdentifier	 set Row Height
(	TokenNameLPAREN	
_rowHeight	TokenNameIdentifier	 row Height
)	TokenNameRPAREN	
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
setRowHeight	TokenNameIdentifier	 set Row Height
(	TokenNameLPAREN	
_rowHeight	TokenNameIdentifier	 row Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setSelectionMode	TokenNameIdentifier	 set Selection Mode
(	TokenNameLPAREN	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
.	TokenNameDOT	
SINGLE_SELECTION	TokenNameIdentifier	 SINGLE  SELECTION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assign a column number to a column name 	TokenNameCOMMENT_LINE	assign a column number to a column name 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
getColumnNameAndNumber	TokenNameIdentifier	 get Column Name And Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Vector	TokenNameIdentifier	 Vector
columnNameAndNumber	TokenNameIdentifier	 column Name And Number
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
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
_colNames	TokenNameIdentifier	 col Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
columnNameAndNumber	TokenNameIdentifier	 column Name And Number
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
_colNames	TokenNameIdentifier	 col Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
columnNameAndNumber	TokenNameIdentifier	 column Name And Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces: 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
class	TokenNameclass	
LogTableListSelectionListener	TokenNameIdentifier	 Log Table List Selection Listener
implements	TokenNameimplements	
ListSelectionListener	TokenNameIdentifier	 List Selection Listener
{	TokenNameLBRACE	
protected	TokenNameprotected	
JTable	TokenNameIdentifier	 J Table
_table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LogTableListSelectionListener	TokenNameIdentifier	 Log Table List Selection Listener
(	TokenNameLPAREN	
JTable	TokenNameIdentifier	 J Table
table	TokenNameIdentifier	 table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
valueChanged	TokenNameIdentifier	 value Changed
(	TokenNameLPAREN	
ListSelectionEvent	TokenNameIdentifier	 List Selection Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//Ignore extra messages. 	TokenNameCOMMENT_LINE	Ignore extra messages. 
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getValueIsAdjusting	TokenNameIdentifier	 get Value Is Adjusting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
lsm	TokenNameIdentifier	 lsm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ListSelectionModel	TokenNameIdentifier	 List Selection Model
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lsm	TokenNameIdentifier	 lsm
.	TokenNameDOT	
isSelectionEmpty	TokenNameIdentifier	 is Selection Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//no rows are selected 	TokenNameCOMMENT_LINE	no rows are selected 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
selectedRow	TokenNameIdentifier	 selected Row
=	TokenNameEQUAL	
lsm	TokenNameIdentifier	 lsm
.	TokenNameDOT	
getMinSelectionIndex	TokenNameIdentifier	 get Min Selection Index
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
_numCols	TokenNameIdentifier	 num Cols
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
_table	TokenNameIdentifier	 table
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValueAt	TokenNameIdentifier	 get Value At
(	TokenNameLPAREN	
selectedRow	TokenNameIdentifier	 selected Row
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_colNames	TokenNameIdentifier	 col Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
_colThread	TokenNameIdentifier	 col Thread
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
_colMessage	TokenNameIdentifier	 col Message
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
_colLevel	TokenNameIdentifier	 col Level
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pad out the date. 	TokenNameCOMMENT_LINE	pad out the date. 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
_colDate	TokenNameIdentifier	 col Date
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
_colNDC	TokenNameIdentifier	 col NDC
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pad out the date. 	TokenNameCOMMENT_LINE	pad out the date. 
}	TokenNameRBRACE	
// if( i == _colSequence) 	TokenNameCOMMENT_LINE	if( i == _colSequence) 
// { 	TokenNameCOMMENT_LINE	{ 
// buf.append("\t\t\t"); // pad out the Sequnce. 	TokenNameCOMMENT_LINE	buf.append("\t\t\t"); // pad out the Sequnce. 
// } 	TokenNameCOMMENT_LINE	} 
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
_colNames	TokenNameIdentifier	 col Names
[	TokenNameLBRACKET	
_numCols	TokenNameIdentifier	 num Cols
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
_table	TokenNameIdentifier	 table
.	TokenNameDOT	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValueAt	TokenNameIdentifier	 get Value At
(	TokenNameLPAREN	
selectedRow	TokenNameIdentifier	 selected Row
,	TokenNameCOMMA	
_numCols	TokenNameIdentifier	 num Cols
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_detailTextArea	TokenNameIdentifier	 detail Text Area
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
