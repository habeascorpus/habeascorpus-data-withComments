/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
examples	TokenNameIdentifier	 examples
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
BorderLayout	TokenNameIdentifier	 Border Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TextPaneAppenderExample	TokenNameIdentifier	 Text Pane Appender Example
implements	TokenNameimplements	
ActionListener	TokenNameIdentifier	 Action Listener
{	TokenNameLBRACE	
JFrame	TokenNameIdentifier	 J Frame
mainframe	TokenNameIdentifier	 mainframe
;	TokenNameSEMICOLON	
ButtonGroup	TokenNameIdentifier	 Button Group
priorities	TokenNameIdentifier	 priorities
;	TokenNameSEMICOLON	
TextPaneAppender	TokenNameIdentifier	 Text Pane Appender
tpa	TokenNameIdentifier	 tpa
;	TokenNameSEMICOLON	
Category	TokenNameIdentifier	 Category
gui	TokenNameIdentifier	 gui
;	TokenNameSEMICOLON	
Priority	TokenNameIdentifier	 Priority
prio	TokenNameIdentifier	 prio
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
logview	TokenNameIdentifier	 logview
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextPaneAppenderExample	TokenNameIdentifier	 Text Pane Appender Example
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mainframe	TokenNameIdentifier	 mainframe
=	TokenNameEQUAL	
new	TokenNamenew	
JFrame	TokenNameIdentifier	 J Frame
(	TokenNameLPAREN	
"Testing the TextPaneAppender..."	TokenNameStringLiteral	Testing the TextPaneAppender...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainframe	TokenNameIdentifier	 mainframe
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logview	TokenNameIdentifier	 logview
=	TokenNameEQUAL	
new	TokenNamenew	
JTabbedPane	TokenNameIdentifier	 J Tabbed Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createLogger	TokenNameIdentifier	 create Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createMenuBar	TokenNameIdentifier	 create Menu Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainframe	TokenNameIdentifier	 mainframe
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainframe	TokenNameIdentifier	 mainframe
.	TokenNameDOT	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
logview	TokenNameIdentifier	 logview
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
createLogger	TokenNameIdentifier	 create Logger
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tpa	TokenNameIdentifier	 tpa
=	TokenNameEQUAL	
new	TokenNamenew	
TextPaneAppender	TokenNameIdentifier	 Text Pane Appender
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%-5p %d [%t]: %m%n"	TokenNameStringLiteral	%-5p %d [%t]: %m%n
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"Debug"	TokenNameStringLiteral	Debug
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logview	TokenNameIdentifier	 logview
.	TokenNameDOT	
addTab	TokenNameIdentifier	 add Tab
(	TokenNameLPAREN	
"Events ..."	TokenNameStringLiteral	Events ...
,	TokenNameCOMMA	
new	TokenNamenew	
JScrollPane	TokenNameIdentifier	 J Scroll Pane
(	TokenNameLPAREN	
tpa	TokenNameIdentifier	 tpa
.	TokenNameDOT	
getTextPane	TokenNameIdentifier	 get Text Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gui	TokenNameIdentifier	 gui
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
tpa	TokenNameIdentifier	 tpa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
createMenuBar	TokenNameIdentifier	 create Menu Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenu	TokenNameIdentifier	 J Menu
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
JMenu	TokenNameIdentifier	 J Menu
(	TokenNameLPAREN	
"File"	TokenNameStringLiteral	File
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JMenuItem	TokenNameIdentifier	 J Menu Item
exit	TokenNameIdentifier	 exit
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
"Exit"	TokenNameStringLiteral	Exit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exit	TokenNameIdentifier	 exit
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
ae	TokenNameIdentifier	 ae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
exit	TokenNameIdentifier	 exit
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
exit	TokenNameIdentifier	 exit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JMenuBar	TokenNameIdentifier	 J Menu Bar
mb	TokenNameIdentifier	 mb
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuBar	TokenNameIdentifier	 J Menu Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mb	TokenNameIdentifier	 mb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JMenu	TokenNameIdentifier	 J Menu
logevent	TokenNameIdentifier	 logevent
=	TokenNameEQUAL	
new	TokenNamenew	
JMenu	TokenNameIdentifier	 J Menu
(	TokenNameLPAREN	
"LoggingEvents"	TokenNameStringLiteral	LoggingEvents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JMenu	TokenNameIdentifier	 J Menu
selectprio	TokenNameIdentifier	 selectprio
=	TokenNameEQUAL	
new	TokenNamenew	
JMenu	TokenNameIdentifier	 J Menu
(	TokenNameLPAREN	
"Priority"	TokenNameStringLiteral	Priority
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prio	TokenNameIdentifier	 prio
=	TokenNameEQUAL	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
getAllPossiblePriorities	TokenNameIdentifier	 get All Possible Priorities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
priority	TokenNameIdentifier	 priority
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
[	TokenNameLBRACKET	
prio	TokenNameIdentifier	 prio
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
priorities	TokenNameIdentifier	 priorities
=	TokenNameEQUAL	
new	TokenNamenew	
ButtonGroup	TokenNameIdentifier	 Button Group
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
prio	TokenNameIdentifier	 prio
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
priority	TokenNameIdentifier	 priority
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
(	TokenNameLPAREN	
prio	TokenNameIdentifier	 prio
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
priority	TokenNameIdentifier	 priority
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
(	TokenNameLPAREN	
prio	TokenNameIdentifier	 prio
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
priority	TokenNameIdentifier	 priority
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setActionCommand	TokenNameIdentifier	 set Action Command
(	TokenNameLPAREN	
prio	TokenNameIdentifier	 prio
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
selectprio	TokenNameIdentifier	 selectprio
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
priorities	TokenNameIdentifier	 priorities
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
priority	TokenNameIdentifier	 priority
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
logevent	TokenNameIdentifier	 logevent
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
selectprio	TokenNameIdentifier	 selectprio
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JMenuItem	TokenNameIdentifier	 J Menu Item
lognow	TokenNameIdentifier	 lognow
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
"LogIt!"	TokenNameStringLiteral	LogIt!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lognow	TokenNameIdentifier	 lognow
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logevent	TokenNameIdentifier	 logevent
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lognow	TokenNameIdentifier	 lognow
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mb	TokenNameIdentifier	 mb
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
logevent	TokenNameIdentifier	 logevent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mainframe	TokenNameIdentifier	 mainframe
.	TokenNameDOT	
setJMenuBar	TokenNameIdentifier	 set J Menu Bar
(	TokenNameLPAREN	
mb	TokenNameIdentifier	 mb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
ae	TokenNameIdentifier	 ae
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
logtext	TokenNameIdentifier	 logtext
=	TokenNameEQUAL	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showInputDialog	TokenNameIdentifier	 show Input Dialog
(	TokenNameLPAREN	
"Text to log"	TokenNameStringLiteral	Text to log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logtext	TokenNameIdentifier	 logtext
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
logtext	TokenNameIdentifier	 logtext
=	TokenNameEQUAL	
"NO Input"	TokenNameStringLiteral	NO Input
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
priorities	TokenNameIdentifier	 priorities
.	TokenNameDOT	
getSelection	TokenNameIdentifier	 get Selection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getActionCommand	TokenNameIdentifier	 get Action Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
prio	TokenNameIdentifier	 prio
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
prio	TokenNameIdentifier	 prio
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
logtext	TokenNameIdentifier	 logtext
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
public	TokenNamepublic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TextPaneAppenderExample	TokenNameIdentifier	 Text Pane Appender Example
tpex	TokenNameIdentifier	 tpex
=	TokenNameEQUAL	
new	TokenNamenew	
TextPaneAppenderExample	TokenNameIdentifier	 Text Pane Appender Example
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
