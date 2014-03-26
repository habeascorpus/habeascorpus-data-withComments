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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
LogRecordFilter	TokenNameIdentifier	 Log Record Filter
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
PassingLogRecordFilter	TokenNameIdentifier	 Passing Log Record Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
AbstractTableModel	TokenNameIdentifier	 Abstract Table Model
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
Date	TokenNameIdentifier	 Date
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
/** * A TableModel for LogRecords which includes filtering support. * * @author Richard Wan * @author Brent Sprecher */	TokenNameCOMMENT_JAVADOC	 A TableModel for LogRecords which includes filtering support. * @author Richard Wan @author Brent Sprecher 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
class	TokenNameclass	
FilteredLogTableModel	TokenNameIdentifier	 Filtered Log Table Model
extends	TokenNameextends	
AbstractTableModel	TokenNameIdentifier	 Abstract Table Model
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
LogRecordFilter	TokenNameIdentifier	 Log Record Filter
_filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
new	TokenNamenew	
PassingLogRecordFilter	TokenNameIdentifier	 Passing Log Record Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
_allRecords	TokenNameIdentifier	 all Records
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
_filteredRecords	TokenNameIdentifier	 filtered Records
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
_maxNumberOfLogRecords	TokenNameIdentifier	 max Number Of Log Records
=	TokenNameEQUAL	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
_colNames	TokenNameIdentifier	 col Names
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Date"	TokenNameStringLiteral	Date
,	TokenNameCOMMA	
"Thread"	TokenNameStringLiteral	Thread
,	TokenNameCOMMA	
"Message #"	TokenNameStringLiteral	Message #
,	TokenNameCOMMA	
"Level"	TokenNameStringLiteral	Level
,	TokenNameCOMMA	
"NDC"	TokenNameStringLiteral	NDC
,	TokenNameCOMMA	
"Category"	TokenNameStringLiteral	Category
,	TokenNameCOMMA	
"Message"	TokenNameStringLiteral	Message
,	TokenNameCOMMA	
"Location"	TokenNameStringLiteral	Location
,	TokenNameCOMMA	
"Thrown"	TokenNameStringLiteral	Thrown
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
FilteredLogTableModel	TokenNameIdentifier	 Filtered Log Table Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
void	TokenNamevoid	
setLogRecordFilter	TokenNameIdentifier	 set Log Record Filter
(	TokenNameLPAREN	
LogRecordFilter	TokenNameIdentifier	 Log Record Filter
filter	TokenNameIdentifier	 filter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_filter	TokenNameIdentifier	 filter
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LogRecordFilter	TokenNameIdentifier	 Log Record Filter
getLogRecordFilter	TokenNameIdentifier	 get Log Record Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnName	TokenNameIdentifier	 get Column Name
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_colNames	TokenNameIdentifier	 col Names
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_colNames	TokenNameIdentifier	 col Names
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRowCount	TokenNameIdentifier	 get Row Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFilteredRecords	TokenNameIdentifier	 get Filtered Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getTotalRowCount	TokenNameIdentifier	 get Total Row Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_allRecords	TokenNameIdentifier	 all Records
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getValueAt	TokenNameIdentifier	 get Value At
(	TokenNameLPAREN	
int	TokenNameint	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
int	TokenNameint	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LogRecord	TokenNameIdentifier	 Log Record
record	TokenNameIdentifier	 record
=	TokenNameEQUAL	
getFilteredRecord	TokenNameIdentifier	 get Filtered Record
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
,	TokenNameCOMMA	
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setMaxNumberOfLogRecords	TokenNameIdentifier	 set Max Number Of Log Records
(	TokenNameLPAREN	
int	TokenNameint	
maxNumRecords	TokenNameIdentifier	 max Num Records
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxNumRecords	TokenNameIdentifier	 max Num Records
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_maxNumberOfLogRecords	TokenNameIdentifier	 max Number Of Log Records
=	TokenNameEQUAL	
maxNumRecords	TokenNameIdentifier	 max Num Records
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
boolean	TokenNameboolean	
addLogRecord	TokenNameIdentifier	 add Log Record
(	TokenNameLPAREN	
LogRecord	TokenNameIdentifier	 Log Record
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_allRecords	TokenNameIdentifier	 all Records
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
passes	TokenNameIdentifier	 passes
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getFilteredRecords	TokenNameIdentifier	 get Filtered Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
record	TokenNameIdentifier	 record
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTableRowsInserted	TokenNameIdentifier	 fire Table Rows Inserted
(	TokenNameLPAREN	
getRowCount	TokenNameIdentifier	 get Row Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getRowCount	TokenNameIdentifier	 get Row Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trimRecords	TokenNameIdentifier	 trim Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Forces the LogTableModel to requery its filters to determine * which records to display. */	TokenNameCOMMENT_JAVADOC	 Forces the LogTableModel to requery its filters to determine which records to display. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_filteredRecords	TokenNameIdentifier	 filtered Records
=	TokenNameEQUAL	
createFilteredRecordsList	TokenNameIdentifier	 create Filtered Records List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTableDataChanged	TokenNameIdentifier	 fire Table Data Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
fastRefresh	TokenNameIdentifier	 fast Refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_filteredRecords	TokenNameIdentifier	 filtered Records
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTableRowsDeleted	TokenNameIdentifier	 fire Table Rows Deleted
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears all records from the LogTableModel */	TokenNameCOMMENT_JAVADOC	 Clears all records from the LogTableModel 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
_allRecords	TokenNameIdentifier	 all Records
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_filteredRecords	TokenNameIdentifier	 filtered Records
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTableDataChanged	TokenNameIdentifier	 fire Table Data Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
getFilteredRecords	TokenNameIdentifier	 get Filtered Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_filteredRecords	TokenNameIdentifier	 filtered Records
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
_filteredRecords	TokenNameIdentifier	 filtered Records
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
createFilteredRecordsList	TokenNameIdentifier	 create Filtered Records List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
records	TokenNameIdentifier	 records
=	TokenNameEQUAL	
_allRecords	TokenNameIdentifier	 all Records
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogRecord	TokenNameIdentifier	 Log Record
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LogRecord	TokenNameIdentifier	 Log Record
)	TokenNameRPAREN	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
passes	TokenNameIdentifier	 passes
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
LogRecord	TokenNameIdentifier	 Log Record
getFilteredRecord	TokenNameIdentifier	 get Filtered Record
(	TokenNameLPAREN	
int	TokenNameint	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
records	TokenNameIdentifier	 records
=	TokenNameEQUAL	
getFilteredRecords	TokenNameIdentifier	 get Filtered Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
LogRecord	TokenNameIdentifier	 Log Record
)	TokenNameRPAREN	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// a minor problem has happened. JTable has asked for 	TokenNameCOMMENT_LINE	a minor problem has happened. JTable has asked for 
// a row outside the bounds, because the size of 	TokenNameCOMMENT_LINE	a row outside the bounds, because the size of 
// _filteredRecords has changed while it was looping. 	TokenNameCOMMENT_LINE	_filteredRecords has changed while it was looping. 
// return the last row. 	TokenNameCOMMENT_LINE	return the last row. 
return	TokenNamereturn	
(	TokenNameLPAREN	
LogRecord	TokenNameIdentifier	 Log Record
)	TokenNameRPAREN	
records	TokenNameIdentifier	 records
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
getColumn	TokenNameIdentifier	 get Column
(	TokenNameLPAREN	
int	TokenNameint	
col	TokenNameIdentifier	 col
,	TokenNameCOMMA	
LogRecord	TokenNameIdentifier	 Log Record
lr	TokenNameIdentifier	 lr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lr	TokenNameIdentifier	 lr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"NULL Column"	TokenNameStringLiteral	NULL Column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getMillis	TokenNameIdentifier	 get Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
date	TokenNameIdentifier	 date
+	TokenNamePLUS	
" ("	TokenNameStringLiteral	 (
+	TokenNamePLUS	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getMillis	TokenNameIdentifier	 get Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getThreadDescription	TokenNameIdentifier	 get Thread Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
Long	TokenNameIdentifier	 Long
(	TokenNameLPAREN	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getSequenceNumber	TokenNameIdentifier	 get Sequence Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
3	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getLevel	TokenNameIdentifier	 get Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
5	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getCategory	TokenNameIdentifier	 get Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
6	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
7	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getLocation	TokenNameIdentifier	 get Location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
8	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
lr	TokenNameIdentifier	 lr
.	TokenNameDOT	
getThrownStackTrace	TokenNameIdentifier	 get Thrown Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
"The column number "	TokenNameStringLiteral	The column number 
+	TokenNamePLUS	
col	TokenNameIdentifier	 col
+	TokenNamePLUS	
"must be between 0 and 8"	TokenNameStringLiteral	must be between 0 and 8
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// We don't want the amount of rows to grow without bound, 	TokenNameCOMMENT_LINE	We don't want the amount of rows to grow without bound, 
// leading to a out-of-memory-exception. Especially not good 	TokenNameCOMMENT_LINE	leading to a out-of-memory-exception. Especially not good 
// in a production environment :) 	TokenNameCOMMENT_LINE	in a production environment :) 
// This method & clearLogRecords() are synchronized so we don't 	TokenNameCOMMENT_LINE	This method & clearLogRecords() are synchronized so we don't 
// delete rows that don't exist. 	TokenNameCOMMENT_LINE	delete rows that don't exist. 
protected	TokenNameprotected	
void	TokenNamevoid	
trimRecords	TokenNameIdentifier	 trim Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
needsTrimming	TokenNameIdentifier	 needs Trimming
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
trimOldestRecords	TokenNameIdentifier	 trim Oldest Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
needsTrimming	TokenNameIdentifier	 needs Trimming
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
_allRecords	TokenNameIdentifier	 all Records
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
_maxNumberOfLogRecords	TokenNameIdentifier	 max Number Of Log Records
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
trimOldestRecords	TokenNameIdentifier	 trim Oldest Records
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
_allRecords	TokenNameIdentifier	 all Records
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
trim	TokenNameIdentifier	 trim
=	TokenNameEQUAL	
numberOfRecordsToTrim	TokenNameIdentifier	 number Of Records To Trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
trim	TokenNameIdentifier	 trim
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
oldRecords	TokenNameIdentifier	 old Records
=	TokenNameEQUAL	
_allRecords	TokenNameIdentifier	 all Records
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
trim	TokenNameIdentifier	 trim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oldRecords	TokenNameIdentifier	 old Records
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
_allRecords	TokenNameIdentifier	 all Records
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fastRefresh	TokenNameIdentifier	 fast Refresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
private	TokenNameprivate	
int	TokenNameint	
numberOfRecordsToTrim	TokenNameIdentifier	 number Of Records To Trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
_allRecords	TokenNameIdentifier	 all Records
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
_maxNumberOfLogRecords	TokenNameIdentifier	 max Number Of Log Records
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
