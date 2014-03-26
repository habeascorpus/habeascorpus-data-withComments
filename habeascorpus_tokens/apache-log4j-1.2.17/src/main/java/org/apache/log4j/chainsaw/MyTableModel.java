/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
chainsaw	TokenNameIdentifier	 chainsaw
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DateFormat	TokenNameIdentifier	 Date Format
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
Comparator	TokenNameIdentifier	 Comparator
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SortedSet	TokenNameIdentifier	 Sorted Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Priority	TokenNameIdentifier	 Priority
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Logger	TokenNameIdentifier	 Logger
;	TokenNameSEMICOLON	
/** * Represents a list of <code>EventDetails</code> objects that are sorted on * logging time. Methods are provided to filter the events that are visible. * * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> */	TokenNameCOMMENT_JAVADOC	 Represents a list of <code>EventDetails</code> objects that are sorted on logging time. Methods are provided to filter the events that are visible. * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> 
class	TokenNameclass	
MyTableModel	TokenNameIdentifier	 My Table Model
extends	TokenNameextends	
AbstractTableModel	TokenNameIdentifier	 Abstract Table Model
{	TokenNameLBRACE	
/** used to log messages **/	TokenNameCOMMENT_JAVADOC	 used to log messages *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Logger	TokenNameIdentifier	 Logger
LOG	TokenNameIdentifier	 LOG
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
MyTableModel	TokenNameIdentifier	 My Table Model
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** use the compare logging events **/	TokenNameCOMMENT_JAVADOC	 use the compare logging events *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
MY_COMP	TokenNameIdentifier	 MY  COMP
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** @see Comparator **/	TokenNameCOMMENT_JAVADOC	 @see Comparator *
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
aObj1	TokenNameIdentifier	 a Obj1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
aObj2	TokenNameIdentifier	 a Obj2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aObj1	TokenNameIdentifier	 a Obj1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
aObj2	TokenNameIdentifier	 a Obj2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// treat as equal 	TokenNameCOMMENT_LINE	treat as equal 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
aObj1	TokenNameIdentifier	 a Obj1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// null less than everything 	TokenNameCOMMENT_LINE	null less than everything 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
aObj2	TokenNameIdentifier	 a Obj2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// think about it. :-> 	TokenNameCOMMENT_LINE	think about it. :-> 
}	TokenNameRBRACE	
// will assume only have LoggingEvent 	TokenNameCOMMENT_LINE	will assume only have LoggingEvent 
final	TokenNamefinal	
EventDetails	TokenNameIdentifier	 Event Details
le1	TokenNameIdentifier	 le1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventDetails	TokenNameIdentifier	 Event Details
)	TokenNameRPAREN	
aObj1	TokenNameIdentifier	 a Obj1
;	TokenNameSEMICOLON	
final	TokenNamefinal	
EventDetails	TokenNameIdentifier	 Event Details
le2	TokenNameIdentifier	 le2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventDetails	TokenNameIdentifier	 Event Details
)	TokenNameRPAREN	
aObj2	TokenNameIdentifier	 a Obj2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
le1	TokenNameIdentifier	 le1
.	TokenNameDOT	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
le2	TokenNameIdentifier	 le2
.	TokenNameDOT	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// assume not two events are logged at exactly the same time 	TokenNameCOMMENT_LINE	assume not two events are logged at exactly the same time 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Helper that actually processes incoming events. * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> */	TokenNameCOMMENT_JAVADOC	 Helper that actually processes incoming events. @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> 
private	TokenNameprivate	
class	TokenNameclass	
Processor	TokenNameIdentifier	 Processor
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
/** loops getting the events **/	TokenNameCOMMENT_JAVADOC	 loops getting the events *
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ignore 	TokenNameCOMMENT_LINE	ignore 
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
mPaused	TokenNameIdentifier	 m Paused
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
toHead	TokenNameIdentifier	 to Head
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// were events added to head 	TokenNameCOMMENT_LINE	were events added to head 
boolean	TokenNameboolean	
needUpdate	TokenNameIdentifier	 need Update
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
mPendingEvents	TokenNameIdentifier	 m Pending Events
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
EventDetails	TokenNameIdentifier	 Event Details
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventDetails	TokenNameIdentifier	 Event Details
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mAllEvents	TokenNameIdentifier	 m All Events
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toHead	TokenNameIdentifier	 to Head
=	TokenNameEQUAL	
toHead	TokenNameIdentifier	 to Head
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
==	TokenNameEQUAL_EQUAL	
mAllEvents	TokenNameIdentifier	 m All Events
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
needUpdate	TokenNameIdentifier	 need Update
=	TokenNameEQUAL	
needUpdate	TokenNameIdentifier	 need Update
||	TokenNameOR_OR	
matchFilter	TokenNameIdentifier	 match Filter
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mPendingEvents	TokenNameIdentifier	 m Pending Events
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
needUpdate	TokenNameIdentifier	 need Update
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateFilteredEvents	TokenNameIdentifier	 update Filtered Events
(	TokenNameLPAREN	
toHead	TokenNameIdentifier	 to Head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** names of the columns in the table **/	TokenNameCOMMENT_JAVADOC	 names of the columns in the table *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
COL_NAMES	TokenNameIdentifier	 COL  NAMES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Time"	TokenNameStringLiteral	Time
,	TokenNameCOMMA	
"Priority"	TokenNameStringLiteral	Priority
,	TokenNameCOMMA	
"Trace"	TokenNameStringLiteral	Trace
,	TokenNameCOMMA	
"Category"	TokenNameStringLiteral	Category
,	TokenNameCOMMA	
"NDC"	TokenNameStringLiteral	NDC
,	TokenNameCOMMA	
"Message"	TokenNameStringLiteral	Message
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** definition of an empty list **/	TokenNameCOMMENT_JAVADOC	 definition of an empty list *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
EventDetails	TokenNameIdentifier	 Event Details
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
=	TokenNameEQUAL	
new	TokenNamenew	
EventDetails	TokenNameIdentifier	 Event Details
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** used to format dates **/	TokenNameCOMMENT_JAVADOC	 used to format dates *
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
DateFormat	TokenNameIdentifier	 Date Format
DATE_FORMATTER	TokenNameIdentifier	 DATE  FORMATTER
=	TokenNameEQUAL	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
getDateTimeInstance	TokenNameIdentifier	 get Date Time Instance
(	TokenNameLPAREN	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
SHORT	TokenNameIdentifier	 SHORT
,	TokenNameCOMMA	
DateFormat	TokenNameIdentifier	 Date Format
.	TokenNameDOT	
MEDIUM	TokenNameIdentifier	 MEDIUM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** the lock to control access **/	TokenNameCOMMENT_JAVADOC	 the lock to control access *
private	TokenNameprivate	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
mLock	TokenNameIdentifier	 m Lock
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** set of all logged events - not filtered **/	TokenNameCOMMENT_JAVADOC	 set of all logged events - not filtered *
private	TokenNameprivate	
final	TokenNamefinal	
SortedSet	TokenNameIdentifier	 Sorted Set
mAllEvents	TokenNameIdentifier	 m All Events
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
(	TokenNameLPAREN	
MY_COMP	TokenNameIdentifier	 MY  COMP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** events that are visible after filtering **/	TokenNameCOMMENT_JAVADOC	 events that are visible after filtering *
private	TokenNameprivate	
EventDetails	TokenNameIdentifier	 Event Details
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mFilteredEvents	TokenNameIdentifier	 m Filtered Events
=	TokenNameEQUAL	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
/** list of events that are buffered for processing **/	TokenNameCOMMENT_JAVADOC	 list of events that are buffered for processing *
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
mPendingEvents	TokenNameIdentifier	 m Pending Events
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** indicates whether event collection is paused to the UI **/	TokenNameCOMMENT_JAVADOC	 indicates whether event collection is paused to the UI *
private	TokenNameprivate	
boolean	TokenNameboolean	
mPaused	TokenNameIdentifier	 m Paused
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** filter for the thread **/	TokenNameCOMMENT_JAVADOC	 filter for the thread *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mThreadFilter	TokenNameIdentifier	 m Thread Filter
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** filter for the message **/	TokenNameCOMMENT_JAVADOC	 filter for the message *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mMessageFilter	TokenNameIdentifier	 m Message Filter
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** filter for the NDC **/	TokenNameCOMMENT_JAVADOC	 filter for the NDC *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mNDCFilter	TokenNameIdentifier	 m NDC Filter
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** filter for the category **/	TokenNameCOMMENT_JAVADOC	 filter for the category *
private	TokenNameprivate	
String	TokenNameIdentifier	 String
mCategoryFilter	TokenNameIdentifier	 m Category Filter
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
/** filter for the priority **/	TokenNameCOMMENT_JAVADOC	 filter for the priority *
private	TokenNameprivate	
Priority	TokenNameIdentifier	 Priority
mPriorityFilter	TokenNameIdentifier	 m Priority Filter
=	TokenNameEQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
;	TokenNameSEMICOLON	
/** * Creates a new <code>MyTableModel</code> instance. * */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>MyTableModel</code> instance. 
MyTableModel	TokenNameIdentifier	 My Table Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Thread	TokenNameIdentifier	 Thread
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
new	TokenNamenew	
Processor	TokenNameIdentifier	 Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setDaemon	TokenNameIdentifier	 set Daemon
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
// Table Methods 	TokenNameCOMMENT_LINE	Table Methods 
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
/** @see javax.swing.table.TableModel **/	TokenNameCOMMENT_JAVADOC	 @see javax.swing.table.TableModel *
public	TokenNamepublic	
int	TokenNameint	
getRowCount	TokenNameIdentifier	 get Row Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mFilteredEvents	TokenNameIdentifier	 m Filtered Events
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @see javax.swing.table.TableModel **/	TokenNameCOMMENT_JAVADOC	 @see javax.swing.table.TableModel *
public	TokenNamepublic	
int	TokenNameint	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// does not need to be synchronized 	TokenNameCOMMENT_LINE	does not need to be synchronized 
return	TokenNamereturn	
COL_NAMES	TokenNameIdentifier	 COL  NAMES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see javax.swing.table.TableModel **/	TokenNameCOMMENT_JAVADOC	 @see javax.swing.table.TableModel *
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getColumnName	TokenNameIdentifier	 get Column Name
(	TokenNameLPAREN	
int	TokenNameint	
aCol	TokenNameIdentifier	 a Col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// does not need to be synchronized 	TokenNameCOMMENT_LINE	does not need to be synchronized 
return	TokenNamereturn	
COL_NAMES	TokenNameIdentifier	 COL  NAMES
[	TokenNameLBRACKET	
aCol	TokenNameIdentifier	 a Col
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see javax.swing.table.TableModel **/	TokenNameCOMMENT_JAVADOC	 @see javax.swing.table.TableModel *
public	TokenNamepublic	
Class	TokenNameIdentifier	 Class
getColumnClass	TokenNameIdentifier	 get Column Class
(	TokenNameLPAREN	
int	TokenNameint	
aCol	TokenNameIdentifier	 a Col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// does not need to be synchronized 	TokenNameCOMMENT_LINE	does not need to be synchronized 
return	TokenNamereturn	
(	TokenNameLPAREN	
aCol	TokenNameIdentifier	 a Col
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
class	TokenNameclass	
:	TokenNameCOLON	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @see javax.swing.table.TableModel **/	TokenNameCOMMENT_JAVADOC	 @see javax.swing.table.TableModel *
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getValueAt	TokenNameIdentifier	 get Value At
(	TokenNameLPAREN	
int	TokenNameint	
aRow	TokenNameIdentifier	 a Row
,	TokenNameCOMMA	
int	TokenNameint	
aCol	TokenNameIdentifier	 a Col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
EventDetails	TokenNameIdentifier	 Event Details
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
mFilteredEvents	TokenNameIdentifier	 m Filtered Events
[	TokenNameLBRACKET	
aRow	TokenNameIdentifier	 a Row
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aCol	TokenNameIdentifier	 a Col
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DATE_FORMATTER	TokenNameIdentifier	 DATE  FORMATTER
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
new	TokenNamenew	
Date	TokenNameIdentifier	 Date
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getTimeStamp	TokenNameIdentifier	 get Time Stamp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
aCol	TokenNameIdentifier	 a Col
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
aCol	TokenNameIdentifier	 a Col
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getThrowableStrRep	TokenNameIdentifier	 get Throwable Str Rep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
FALSE	TokenNameIdentifier	 FALSE
:	TokenNameCOLON	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
TRUE	TokenNameIdentifier	 TRUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
aCol	TokenNameIdentifier	 a Col
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getCategoryName	TokenNameIdentifier	 get Category Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
aCol	TokenNameIdentifier	 a Col
==	TokenNameEQUAL_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
// Public Methods 	TokenNameCOMMENT_LINE	Public Methods 
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
/** * Sets the priority to filter events on. Only events of equal or higher * property are now displayed. * * @param aPriority the priority to filter on */	TokenNameCOMMENT_JAVADOC	 Sets the priority to filter events on. Only events of equal or higher property are now displayed. * @param aPriority the priority to filter on 
public	TokenNamepublic	
void	TokenNamevoid	
setPriorityFilter	TokenNameIdentifier	 set Priority Filter
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
aPriority	TokenNameIdentifier	 a Priority
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mPriorityFilter	TokenNameIdentifier	 m Priority Filter
=	TokenNameEQUAL	
aPriority	TokenNameIdentifier	 a Priority
;	TokenNameSEMICOLON	
updateFilteredEvents	TokenNameIdentifier	 update Filtered Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the filter for the thread field. * * @param aStr the string to match */	TokenNameCOMMENT_JAVADOC	 Set the filter for the thread field. * @param aStr the string to match 
public	TokenNamepublic	
void	TokenNamevoid	
setThreadFilter	TokenNameIdentifier	 set Thread Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aStr	TokenNameIdentifier	 a Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mThreadFilter	TokenNameIdentifier	 m Thread Filter
=	TokenNameEQUAL	
aStr	TokenNameIdentifier	 a Str
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateFilteredEvents	TokenNameIdentifier	 update Filtered Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the filter for the message field. * * @param aStr the string to match */	TokenNameCOMMENT_JAVADOC	 Set the filter for the message field. * @param aStr the string to match 
public	TokenNamepublic	
void	TokenNamevoid	
setMessageFilter	TokenNameIdentifier	 set Message Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aStr	TokenNameIdentifier	 a Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mMessageFilter	TokenNameIdentifier	 m Message Filter
=	TokenNameEQUAL	
aStr	TokenNameIdentifier	 a Str
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateFilteredEvents	TokenNameIdentifier	 update Filtered Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the filter for the NDC field. * * @param aStr the string to match */	TokenNameCOMMENT_JAVADOC	 Set the filter for the NDC field. * @param aStr the string to match 
public	TokenNamepublic	
void	TokenNamevoid	
setNDCFilter	TokenNameIdentifier	 set NDC Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aStr	TokenNameIdentifier	 a Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mNDCFilter	TokenNameIdentifier	 m NDC Filter
=	TokenNameEQUAL	
aStr	TokenNameIdentifier	 a Str
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateFilteredEvents	TokenNameIdentifier	 update Filtered Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the filter for the category field. * * @param aStr the string to match */	TokenNameCOMMENT_JAVADOC	 Set the filter for the category field. * @param aStr the string to match 
public	TokenNamepublic	
void	TokenNamevoid	
setCategoryFilter	TokenNameIdentifier	 set Category Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
aStr	TokenNameIdentifier	 a Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mCategoryFilter	TokenNameIdentifier	 m Category Filter
=	TokenNameEQUAL	
aStr	TokenNameIdentifier	 a Str
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
updateFilteredEvents	TokenNameIdentifier	 update Filtered Events
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Add an event to the list. * * @param aEvent a <code>EventDetails</code> value */	TokenNameCOMMENT_JAVADOC	 Add an event to the list. * @param aEvent a <code>EventDetails</code> value 
public	TokenNamepublic	
void	TokenNamevoid	
addEvent	TokenNameIdentifier	 add Event
(	TokenNameLPAREN	
EventDetails	TokenNameIdentifier	 Event Details
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mPendingEvents	TokenNameIdentifier	 m Pending Events
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Clear the list of all events. */	TokenNameCOMMENT_JAVADOC	 Clear the list of all events. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mAllEvents	TokenNameIdentifier	 m All Events
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mFilteredEvents	TokenNameIdentifier	 m Filtered Events
=	TokenNameEQUAL	
new	TokenNamenew	
EventDetails	TokenNameIdentifier	 Event Details
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
mPendingEvents	TokenNameIdentifier	 m Pending Events
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
}	TokenNameRBRACE	
/** Toggle whether collecting events **/	TokenNameCOMMENT_JAVADOC	 Toggle whether collecting events *
public	TokenNamepublic	
void	TokenNamevoid	
toggle	TokenNameIdentifier	 toggle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mPaused	TokenNameIdentifier	 m Paused
=	TokenNameEQUAL	
!	TokenNameNOT	
mPaused	TokenNameIdentifier	 m Paused
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** @return whether currently paused collecting events **/	TokenNameCOMMENT_JAVADOC	 @return whether currently paused collecting events *
public	TokenNamepublic	
boolean	TokenNameboolean	
isPaused	TokenNameIdentifier	 is Paused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mPaused	TokenNameIdentifier	 m Paused
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the throwable information at a specified row in the filtered events. * * @param aRow the row index of the event * @return the throwable information */	TokenNameCOMMENT_JAVADOC	 Get the throwable information at a specified row in the filtered events. * @param aRow the row index of the event @return the throwable information 
public	TokenNamepublic	
EventDetails	TokenNameIdentifier	 Event Details
getEventDetails	TokenNameIdentifier	 get Event Details
(	TokenNameLPAREN	
int	TokenNameint	
aRow	TokenNameIdentifier	 a Row
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
mLock	TokenNameIdentifier	 m Lock
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mFilteredEvents	TokenNameIdentifier	 m Filtered Events
[	TokenNameLBRACKET	
aRow	TokenNameIdentifier	 a Row
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
//////////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	////////////////////////////////////////////////////////////////////////// 
/** * Update the filtered events data structure. * @param aInsertedToFront indicates whether events were added to front of * the events. If true, then the current first event must still exist * in the list after the filter is applied. */	TokenNameCOMMENT_JAVADOC	 Update the filtered events data structure. @param aInsertedToFront indicates whether events were added to front of the events. If true, then the current first event must still exist in the list after the filter is applied. 
private	TokenNameprivate	
void	TokenNamevoid	
updateFilteredEvents	TokenNameIdentifier	 update Filtered Events
(	TokenNameLPAREN	
boolean	TokenNameboolean	
aInsertedToFront	TokenNameIdentifier	 a Inserted To Front
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
filtered	TokenNameIdentifier	 filtered
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
mAllEvents	TokenNameIdentifier	 m All Events
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
mAllEvents	TokenNameIdentifier	 m All Events
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
EventDetails	TokenNameIdentifier	 Event Details
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventDetails	TokenNameIdentifier	 Event Details
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matchFilter	TokenNameIdentifier	 match Filter
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filtered	TokenNameIdentifier	 filtered
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
EventDetails	TokenNameIdentifier	 Event Details
lastFirst	TokenNameIdentifier	 last First
=	TokenNameEQUAL	
(	TokenNameLPAREN	
mFilteredEvents	TokenNameIdentifier	 m Filtered Events
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
mFilteredEvents	TokenNameIdentifier	 m Filtered Events
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
mFilteredEvents	TokenNameIdentifier	 m Filtered Events
=	TokenNameEQUAL	
(	TokenNameLPAREN	
EventDetails	TokenNameIdentifier	 Event Details
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
filtered	TokenNameIdentifier	 filtered
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aInsertedToFront	TokenNameIdentifier	 a Inserted To Front
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
lastFirst	TokenNameIdentifier	 last First
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
filtered	TokenNameIdentifier	 filtered
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
lastFirst	TokenNameIdentifier	 last First
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"In strange state"	TokenNameStringLiteral	In strange state
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTableDataChanged	TokenNameIdentifier	 fire Table Data Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fireTableRowsInserted	TokenNameIdentifier	 fire Table Rows Inserted
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fireTableDataChanged	TokenNameIdentifier	 fire Table Data Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
long	TokenNamelong	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LOG	TokenNameIdentifier	 LOG
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"Total time [ms]: "	TokenNameStringLiteral	Total time [ms]: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in update, size: "	TokenNameStringLiteral	 in update, size: 
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether an event matches the filters. * * @param aEvent the event to check for a match * @return whether the event matches */	TokenNameCOMMENT_JAVADOC	 Returns whether an event matches the filters. * @param aEvent the event to check for a match @return whether the event matches 
private	TokenNameprivate	
boolean	TokenNameboolean	
matchFilter	TokenNameIdentifier	 match Filter
(	TokenNameLPAREN	
EventDetails	TokenNameIdentifier	 Event Details
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isGreaterOrEqual	TokenNameIdentifier	 is Greater Or Equal
(	TokenNameLPAREN	
mPriorityFilter	TokenNameIdentifier	 m Priority Filter
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getThreadName	TokenNameIdentifier	 get Thread Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
mThreadFilter	TokenNameIdentifier	 m Thread Filter
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getCategoryName	TokenNameIdentifier	 get Category Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
mCategoryFilter	TokenNameIdentifier	 m Category Filter
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
mNDCFilter	TokenNameIdentifier	 m NDC Filter
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getNDC	TokenNameIdentifier	 get NDC
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
mNDCFilter	TokenNameIdentifier	 m NDC Filter
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
rm	TokenNameIdentifier	 rm
=	TokenNameEQUAL	
aEvent	TokenNameIdentifier	 a Event
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only match if we have not filtering in place 	TokenNameCOMMENT_LINE	only match if we have not filtering in place 
return	TokenNamereturn	
(	TokenNameLPAREN	
mMessageFilter	TokenNameIdentifier	 m Message Filter
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
rm	TokenNameIdentifier	 rm
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
mMessageFilter	TokenNameIdentifier	 m Message Filter
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// by default not match 	TokenNameCOMMENT_LINE	by default not match 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
