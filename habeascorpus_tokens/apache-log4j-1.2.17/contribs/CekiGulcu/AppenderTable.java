/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
CyclicBuffer	TokenNameIdentifier	 Cyclic Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Level	TokenNameIdentifier	 Level
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
Layout	TokenNameIdentifier	 Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
PatternLayout	TokenNameIdentifier	 Pattern Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
spi	TokenNameIdentifier	 spi
.	TokenNameDOT	
LoggingEvent	TokenNameIdentifier	 Logging Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JFrame	TokenNameIdentifier	 J Frame
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JButton	TokenNameIdentifier	 J Button
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
table	TokenNameIdentifier	 table
.	TokenNameDOT	
AbstractTableModel	TokenNameIdentifier	 Abstract Table Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
TableCellRenderer	TokenNameIdentifier	 Table Cell Renderer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
BoxLayout	TokenNameIdentifier	 Box Layout
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
Dimension	TokenNameIdentifier	 Dimension
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
ActionEvent	TokenNameIdentifier	 Action Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Container	TokenNameIdentifier	 Container
;	TokenNameSEMICOLON	
/** The AppenderTable illustrates one possible implementation of an Table possibly containing a great many number of rows. <p>In this particular example we use a fixed size buffer (CyclicBuffer) although this data structure could be easily replaced by dynamically growing one, such as a Vector. The required properties of the data structure is 1) support for indexed element access 2) support for the insertion of new elements at the end. <p>Experimentation on my 1400Mhz AMD machine show that it takes about 45 micro-seconds to insert an element in the table. This number does not depend on the size of the buffer. It takes as much (or as little) time to insert one million elements to a buffer of size 10 as to a buffer of size 10'000. It takes about 4 seconds to insert a total of 100'000 elements into the table. <p>On windows NT the test will run about twice as fast if you give the focus to the window that runs "java AppenderTable" and not the window that contains the Swing JFrame. */	TokenNameCOMMENT_JAVADOC	 The AppenderTable illustrates one possible implementation of an Table possibly containing a great many number of rows. <p>In this particular example we use a fixed size buffer (CyclicBuffer) although this data structure could be easily replaced by dynamically growing one, such as a Vector. The required properties of the data structure is 1) support for indexed element access 2) support for the insertion of new elements at the end. <p>Experimentation on my 1400Mhz AMD machine show that it takes about 45 micro-seconds to insert an element in the table. This number does not depend on the size of the buffer. It takes as much (or as little) time to insert one million elements to a buffer of size 10 as to a buffer of size 10'000. It takes about 4 seconds to insert a total of 100'000 elements into the table. <p>On windows NT the test will run about twice as fast if you give the focus to the window that runs "java AppenderTable" and not the window that contains the Swing JFrame. 
public	TokenNamepublic	
class	TokenNameclass	
AppenderTable	TokenNameIdentifier	 Appender Table
extends	TokenNameextends	
JTable	TokenNameIdentifier	 J Table
{	TokenNameLBRACE	
static	TokenNamestatic	
Logger	TokenNameIdentifier	 Logger
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
AppenderTable	TokenNameIdentifier	 Appender Table
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Usage: java AppenderTable bufferSize runLength "	TokenNameStringLiteral	Usage: java AppenderTable bufferSize runLength 
+	TokenNamePLUS	
" where bufferSize is the size of the cyclic buffer in the TableModel "	TokenNameStringLiteral	 where bufferSize is the size of the cyclic buffer in the TableModel 
+	TokenNamePLUS	
" and runLength is the total number of elements to add to the table in "	TokenNameStringLiteral	 and runLength is the total number of elements to add to the table in 
+	TokenNamePLUS	
" this test run."	TokenNameStringLiteral	 this test run.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JFrame	TokenNameIdentifier	 J Frame
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
new	TokenNamenew	
JFrame	TokenNameIdentifier	 J Frame
(	TokenNameLPAREN	
"JTableAppennder test"	TokenNameStringLiteral	JTableAppennder test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Container	TokenNameIdentifier	 Container
container	TokenNameIdentifier	 container
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AppenderTable	TokenNameIdentifier	 Appender Table
tableAppender	TokenNameIdentifier	 table Appender
=	TokenNameEQUAL	
new	TokenNamenew	
AppenderTable	TokenNameIdentifier	 Appender Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferSize	TokenNameIdentifier	 buffer Size
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AppenderTableModel	TokenNameIdentifier	 Appender Table Model
model	TokenNameIdentifier	 model
=	TokenNameEQUAL	
new	TokenNamenew	
AppenderTableModel	TokenNameIdentifier	 Appender Table Model
(	TokenNameLPAREN	
bufferSize	TokenNameIdentifier	 buffer Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tableAppender	TokenNameIdentifier	 table Appender
.	TokenNameDOT	
setModel	TokenNameIdentifier	 set Model
(	TokenNameLPAREN	
model	TokenNameIdentifier	 model
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
runLength	TokenNameIdentifier	 run Length
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
tableAppender	TokenNameIdentifier	 table Appender
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
.	TokenNameDOT	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
250	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
BoxLayout	TokenNameIdentifier	 Box Layout
(	TokenNameLPAREN	
container	TokenNameIdentifier	 container
,	TokenNameCOMMA	
BoxLayout	TokenNameIdentifier	 Box Layout
.	TokenNameDOT	
X_AXIS	TokenNameIdentifier	 X  AXIS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The "ADD" button is intended for manual testing. It will 	TokenNameCOMMENT_LINE	The "ADD" button is intended for manual testing. It will 
// add one new logging event to the table. 	TokenNameCOMMENT_LINE	add one new logging event to the table. 
JButton	TokenNameIdentifier	 J Button
button	TokenNameIdentifier	 button
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
"ADD"	TokenNameStringLiteral	ADD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
button	TokenNameIdentifier	 button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
button	TokenNameIdentifier	 button
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
JTableAddAction	TokenNameIdentifier	 J Table Add Action
(	TokenNameLPAREN	
tableAppender	TokenNameIdentifier	 table Appender
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
500	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
before	TokenNameIdentifier	 before
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
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
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
<	TokenNameLESS	
runLength	TokenNameIdentifier	 run Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
,	TokenNameCOMMA	
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tableAppender	TokenNameIdentifier	 table Appender
.	TokenNameDOT	
doAppend	TokenNameIdentifier	 do Append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
totalTime	TokenNameIdentifier	 total Time
=	TokenNameEQUAL	
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
-	TokenNameMINUS	
before	TokenNameIdentifier	 before
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Total time :"	TokenNameStringLiteral	Total time :
+	TokenNamePLUS	
totalTime	TokenNameIdentifier	 total Time
+	TokenNamePLUS	
" milliseconds for "	TokenNameStringLiteral	 milliseconds for 
+	TokenNamePLUS	
"runLength insertions."	TokenNameStringLiteral	runLength insertions.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Average time per insertion :"	TokenNameStringLiteral	Average time per insertion :
+	TokenNamePLUS	
(	TokenNameLPAREN	
totalTime	TokenNameIdentifier	 total Time
*	TokenNameMULTIPLY	
1000	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
runLength	TokenNameIdentifier	 run Length
)	TokenNameRPAREN	
+	TokenNamePLUS	
" micro-seconds."	TokenNameStringLiteral	 micro-seconds.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AppenderTable	TokenNameIdentifier	 Appender Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
setDefaultRenderer	TokenNameIdentifier	 set Default Renderer
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
new	TokenNamenew	
Renderer	TokenNameIdentifier	 Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** When asked to append we just insert directly into the model. In a real appender we would use two buffers one for accumulating events and another to accumalte events but after filtering. Only the second buffer would be displayed in the table and made visible to the user.*/	TokenNameCOMMENT_JAVADOC	 When asked to append we just insert directly into the model. In a real appender we would use two buffers one for accumulating events and another to accumalte events but after filtering. Only the second buffer would be displayed in the table and made visible to the user.
public	TokenNamepublic	
void	TokenNamevoid	
doAppend	TokenNameIdentifier	 do Append
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AppenderTableModel	TokenNameIdentifier	 Appender Table Model
)	TokenNameRPAREN	
getModel	TokenNameIdentifier	 get Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The Renderer is required to display object in a friendlier from. This particular renderer is just a JTextArea. <p>The important point to note is that we only need *one* renderer. */	TokenNameCOMMENT_JAVADOC	 The Renderer is required to display object in a friendlier from. This particular renderer is just a JTextArea. <p>The important point to note is that we only need *one* renderer. 
class	TokenNameclass	
Renderer	TokenNameIdentifier	 Renderer
extends	TokenNameextends	
JTextArea	TokenNameIdentifier	 J Text Area
implements	TokenNameimplements	
TableCellRenderer	TokenNameIdentifier	 Table Cell Renderer
{	TokenNameLBRACE	
PatternLayout	TokenNameIdentifier	 Pattern Layout
layout	TokenNameIdentifier	 layout
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Renderer	TokenNameIdentifier	 Renderer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
layout	TokenNameIdentifier	 layout
=	TokenNameEQUAL	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%r %p %c [%t] - %m"	TokenNameStringLiteral	%r %p %c [%t] - %m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Component	TokenNameIdentifier	 Component
getTableCellRendererComponent	TokenNameIdentifier	 get Table Cell Renderer Component
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
boolean	TokenNameboolean	
hasFocus	TokenNameIdentifier	 has Focus
,	TokenNameCOMMA	
int	TokenNameint	
row	TokenNameIdentifier	 row
,	TokenNameCOMMA	
int	TokenNameint	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If its a LoggingEvent than format it using our layout. 	TokenNameCOMMENT_LINE	If its a LoggingEvent than format it using our layout. 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
layout	TokenNameIdentifier	 layout
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
AppenderTableModel	TokenNameIdentifier	 Appender Table Model
extends	TokenNameextends	
AbstractTableModel	TokenNameIdentifier	 Abstract Table Model
{	TokenNameLBRACE	
CyclicBuffer	TokenNameIdentifier	 Cyclic Buffer
cb	TokenNameIdentifier	 cb
;	TokenNameSEMICOLON	
AppenderTableModel	TokenNameIdentifier	 Appender Table Model
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cb	TokenNameIdentifier	 cb
=	TokenNameEQUAL	
new	TokenNamenew	
CyclicBuffer	TokenNameIdentifier	 Cyclic Buffer
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Insertion to the model always results in a fireTableDataChanged method call. Suprisingly enough this has no crippling impact on performance. */	TokenNameCOMMENT_JAVADOC	 Insertion to the model always results in a fireTableDataChanged method call. Suprisingly enough this has no crippling impact on performance. 
public	TokenNamepublic	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTableDataChanged	TokenNameIdentifier	 fire Table Data Changed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** We assume only one column. */	TokenNameCOMMENT_JAVADOC	 We assume only one column. 
public	TokenNamepublic	
int	TokenNameint	
getColumnCount	TokenNameIdentifier	 get Column Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The row count is given by the number of elements in the buffer. This number is guaranteed to be between 0 and the buffer size (inclusive). */	TokenNameCOMMENT_JAVADOC	 The row count is given by the number of elements in the buffer. This number is guaranteed to be between 0 and the buffer size (inclusive). 
public	TokenNamepublic	
int	TokenNameint	
getRowCount	TokenNameIdentifier	 get Row Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Get the value in a given row and column. We suppose that there is only one colemn so we are only concerned with the row. <p>Interesting enough this method returns an object. This leaves the door open for a TableCellRenderer to render the object in a variety of ways. */	TokenNameCOMMENT_JAVADOC	 Get the value in a given row and column. We suppose that there is only one colemn so we are only concerned with the row. <p>Interesting enough this method returns an object. This leaves the door open for a TableCellRenderer to render the object in a variety of ways. 
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
return	TokenNamereturn	
cb	TokenNameIdentifier	 cb
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
row	TokenNameIdentifier	 row
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The JTableAddAction is called when the user clicks on the "ADD" button. */	TokenNameCOMMENT_JAVADOC	 The JTableAddAction is called when the user clicks on the "ADD" button. 
class	TokenNameclass	
JTableAddAction	TokenNameIdentifier	 J Table Add Action
implements	TokenNameimplements	
ActionListener	TokenNameIdentifier	 Action Listener
{	TokenNameLBRACE	
AppenderTable	TokenNameIdentifier	 Appender Table
appenderTable	TokenNameIdentifier	 appender Table
;	TokenNameSEMICOLON	
Logger	TokenNameIdentifier	 Logger
dummy	TokenNameIdentifier	 dummy
=	TokenNameEQUAL	
Logger	TokenNameIdentifier	 Logger
.	TokenNameDOT	
getLogger	TokenNameIdentifier	 get Logger
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
JTableAddAction	TokenNameIdentifier	 J Table Add Action
(	TokenNameLPAREN	
AppenderTable	TokenNameIdentifier	 Appender Table
appenderTable	TokenNameIdentifier	 appender Table
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
appenderTable	TokenNameIdentifier	 appender Table
=	TokenNameEQUAL	
appenderTable	TokenNameIdentifier	 appender Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
LoggingEvent	TokenNameIdentifier	 Logging Event
event	TokenNameIdentifier	 event
=	TokenNameEQUAL	
new	TokenNamenew	
LoggingEvent	TokenNameIdentifier	 Logging Event
(	TokenNameLPAREN	
"x"	TokenNameStringLiteral	x
,	TokenNameCOMMA	
dummy	TokenNameIdentifier	 dummy
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
"Message "	TokenNameStringLiteral	Message 
+	TokenNamePLUS	
counter	TokenNameIdentifier	 counter
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
appenderTable	TokenNameIdentifier	 appender Table
.	TokenNameDOT	
doAppend	TokenNameIdentifier	 do Append
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
