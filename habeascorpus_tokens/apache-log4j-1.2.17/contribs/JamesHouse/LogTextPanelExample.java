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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
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
TextPanelAppender	TokenNameIdentifier	 Text Panel Appender
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LogTextPanelExample	TokenNameIdentifier	 Log Text Panel Example
{	TokenNameLBRACE	
boolean	TokenNameboolean	
packFrame	TokenNameIdentifier	 pack Frame
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
catName	TokenNameIdentifier	 cat Name
=	TokenNameEQUAL	
"dum.cat.name"	TokenNameStringLiteral	dum.cat.name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LogTextPanelExample	TokenNameIdentifier	 Log Text Panel Example
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// setup the logging 	TokenNameCOMMENT_LINE	setup the logging 
TextPanelAppender	TokenNameIdentifier	 Text Panel Appender
tpa	TokenNameIdentifier	 tpa
=	TokenNameEQUAL	
new	TokenNamenew	
TextPanelAppender	TokenNameIdentifier	 Text Panel Appender
(	TokenNameLPAREN	
new	TokenNamenew	
PatternLayout	TokenNameIdentifier	 Pattern Layout
(	TokenNameLPAREN	
"%-5p %d [%t]: %m%n"	TokenNameStringLiteral	%-5p %d [%t]: %m%n
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"logTextPanel"	TokenNameStringLiteral	logTextPanel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tpa	TokenNameIdentifier	 tpa
.	TokenNameDOT	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
catName	TokenNameIdentifier	 cat Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
addAppender	TokenNameIdentifier	 add Appender
(	TokenNameLPAREN	
tpa	TokenNameIdentifier	 tpa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LogFrame	TokenNameIdentifier	 Log Frame
frame	TokenNameIdentifier	 frame
=	TokenNameEQUAL	
new	TokenNamenew	
LogFrame	TokenNameIdentifier	 Log Frame
(	TokenNameLPAREN	
tpa	TokenNameIdentifier	 tpa
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Center the frame (window), and show it 	TokenNameCOMMENT_LINE	Center the frame (window), and show it 
Dimension	TokenNameIdentifier	 Dimension
screenSize	TokenNameIdentifier	 screen Size
=	TokenNameEQUAL	
Toolkit	TokenNameIdentifier	 Toolkit
.	TokenNameDOT	
getDefaultToolkit	TokenNameIdentifier	 get Default Toolkit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScreenSize	TokenNameIdentifier	 get Screen Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dimension	TokenNameIdentifier	 Dimension
frameSize	TokenNameIdentifier	 frame Size
=	TokenNameEQUAL	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
frameSize	TokenNameIdentifier	 frame Size
.	TokenNameDOT	
height	TokenNameIdentifier	 height
>	TokenNameGREATER	
screenSize	TokenNameIdentifier	 screen Size
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frameSize	TokenNameIdentifier	 frame Size
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
screenSize	TokenNameIdentifier	 screen Size
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
frameSize	TokenNameIdentifier	 frame Size
.	TokenNameDOT	
width	TokenNameIdentifier	 width
>	TokenNameGREATER	
screenSize	TokenNameIdentifier	 screen Size
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
frameSize	TokenNameIdentifier	 frame Size
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
screenSize	TokenNameIdentifier	 screen Size
.	TokenNameDOT	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
(	TokenNameLPAREN	
screenSize	TokenNameIdentifier	 screen Size
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
frameSize	TokenNameIdentifier	 frame Size
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
screenSize	TokenNameIdentifier	 screen Size
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
frameSize	TokenNameIdentifier	 frame Size
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frame	TokenNameIdentifier	 frame
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/**Main method*/	TokenNameCOMMENT_JAVADOC	Main method
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
UIManager	TokenNameIdentifier	 UI Manager
.	TokenNameDOT	
setLookAndFeel	TokenNameIdentifier	 set Look And Feel
(	TokenNameLPAREN	
UIManager	TokenNameIdentifier	 UI Manager
.	TokenNameDOT	
getSystemLookAndFeelClassName	TokenNameIdentifier	 get System Look And Feel Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LogTextPanelExample	TokenNameIdentifier	 Log Text Panel Example
foo	TokenNameIdentifier	 foo
=	TokenNameEQUAL	
new	TokenNamenew	
LogTextPanelExample	TokenNameIdentifier	 Log Text Panel Example
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
new	TokenNamenew	
LogTextPanelExampleGenThread	TokenNameIdentifier	 Log Text Panel Example Gen Thread
(	TokenNameLPAREN	
foo	TokenNameIdentifier	 foo
.	TokenNameDOT	
catName	TokenNameIdentifier	 cat Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
class	TokenNameclass	
LogFrame	TokenNameIdentifier	 Log Frame
extends	TokenNameextends	
JFrame	TokenNameIdentifier	 J Frame
{	TokenNameLBRACE	
public	TokenNamepublic	
LogFrame	TokenNameIdentifier	 Log Frame
(	TokenNameLPAREN	
TextPanelAppender	TokenNameIdentifier	 Text Panel Appender
tpa	TokenNameIdentifier	 tpa
)	TokenNameRPAREN	
{	TokenNameLBRACE	
enableEvents	TokenNameIdentifier	 enable Events
(	TokenNameLPAREN	
AWTEvent	TokenNameIdentifier	 AWT Event
.	TokenNameDOT	
WINDOW_EVENT_MASK	TokenNameIdentifier	 WINDOW  EVENT  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
contentPane	TokenNameIdentifier	 content Pane
=	TokenNameEQUAL	
(	TokenNameLPAREN	
JPanel	TokenNameIdentifier	 J Panel
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contentPane	TokenNameIdentifier	 content Pane
.	TokenNameDOT	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
new	TokenNamenew	
BorderLayout	TokenNameIdentifier	 Border Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
600	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
400	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
"LogTextPanel Example"	TokenNameStringLiteral	LogTextPanel Example
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contentPane	TokenNameIdentifier	 content Pane
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tpa	TokenNameIdentifier	 tpa
.	TokenNameDOT	
getLogTextPanel	TokenNameIdentifier	 get Log Text Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// exit when window is closed 	TokenNameCOMMENT_LINE	exit when window is closed 
protected	TokenNameprotected	
void	TokenNamevoid	
processWindowEvent	TokenNameIdentifier	 process Window Event
(	TokenNameLPAREN	
WindowEvent	TokenNameIdentifier	 Window Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
processWindowEvent	TokenNameIdentifier	 process Window Event
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getID	TokenNameIdentifier	 get ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
WindowEvent	TokenNameIdentifier	 Window Event
.	TokenNameDOT	
WINDOW_CLOSING	TokenNameIdentifier	 WINDOW  CLOSING
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
}	TokenNameRBRACE	
class	TokenNameclass	
LogTextPanelExampleGenThread	TokenNameIdentifier	 Log Text Panel Example Gen Thread
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
catName	TokenNameIdentifier	 cat Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LogTextPanelExampleGenThread	TokenNameIdentifier	 Log Text Panel Example Gen Thread
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
catName	TokenNameIdentifier	 cat Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
catName	TokenNameIdentifier	 cat Name
=	TokenNameEQUAL	
catName	TokenNameIdentifier	 cat Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
NORM_PRIORITY	TokenNameIdentifier	 NORM  PRIORITY
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Category	TokenNameIdentifier	 Category
cat	TokenNameIdentifier	 cat
=	TokenNameEQUAL	
Category	TokenNameIdentifier	 Category
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
catName	TokenNameIdentifier	 cat Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cnt	TokenNameIdentifier	 cnt
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
randEvt	TokenNameIdentifier	 rand Evt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
random	TokenNameIdentifier	 random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
125	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
fatal	TokenNameIdentifier	 fatal
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} Something screwed up bad."	TokenNameStringLiteral	} Something screwed up bad.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} An error occured while trying to delete all of your files."	TokenNameStringLiteral	} An error occured while trying to delete all of your files.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
25	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} It seems as if your hard disk is getting full."	TokenNameStringLiteral	} It seems as if your hard disk is getting full.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
55	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
info	TokenNameIdentifier	 info
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} It is now time for tea."	TokenNameStringLiteral	} It is now time for tea.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
65	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} Something bad is happening on line 565 of com.foo.Crap"	TokenNameStringLiteral	} Something bad is happening on line 565 of com.foo.Crap
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
75	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} Input value for xe343dd is not equal to xe39dfd!"	TokenNameStringLiteral	} Input value for xe343dd is not equal to xe39dfd!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
85	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} Successfully reached line 2312 of com.foo.Goo"	TokenNameStringLiteral	} Successfully reached line 2312 of com.foo.Goo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
105	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} Here is some extra handy debugging information for you."	TokenNameStringLiteral	} Here is some extra handy debugging information for you.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
115	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} The file you are about to write to is not open."	TokenNameStringLiteral	} The file you are about to write to is not open.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
randEvt	TokenNameIdentifier	 rand Evt
<	TokenNameLESS	
125	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
cat	TokenNameIdentifier	 cat
.	TokenNameDOT	
debug	TokenNameIdentifier	 debug
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
+	TokenNamePLUS	
cnt	TokenNameIdentifier	 cnt
+	TokenNamePLUS	
"} The input value to the method was <null>."	TokenNameStringLiteral	} The input value to the method was <null>.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
