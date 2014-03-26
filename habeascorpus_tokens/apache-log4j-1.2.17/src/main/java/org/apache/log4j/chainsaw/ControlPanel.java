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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
BorderFactory	TokenNameIdentifier	 Border Factory
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
JComboBox	TokenNameIdentifier	 J Combo Box
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JLabel	TokenNameIdentifier	 J Label
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JPanel	TokenNameIdentifier	 J Panel
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JTextField	TokenNameIdentifier	 J Text Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
DocumentEvent	TokenNameIdentifier	 Document Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
DocumentListener	TokenNameIdentifier	 Document Listener
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
Priority	TokenNameIdentifier	 Priority
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
/** * Represents the controls for filtering, pausing, exiting, etc. * * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> */	TokenNameCOMMENT_JAVADOC	 Represents the controls for filtering, pausing, exiting, etc. * @author <a href="mailto:oliver@puppycrawl.com">Oliver Burn</a> 
class	TokenNameclass	
ControlPanel	TokenNameIdentifier	 Control Panel
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
{	TokenNameLBRACE	
/** use the log messages **/	TokenNameCOMMENT_JAVADOC	 use the log messages *
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
ControlPanel	TokenNameIdentifier	 Control Panel
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new <code>ControlPanel</code> instance. * * @param aModel the model to control */	TokenNameCOMMENT_JAVADOC	 Creates a new <code>ControlPanel</code> instance. * @param aModel the model to control 
ControlPanel	TokenNameIdentifier	 Control Panel
(	TokenNameLPAREN	
final	TokenNamefinal	
MyTableModel	TokenNameIdentifier	 My Table Model
aModel	TokenNameIdentifier	 a Model
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
BorderFactory	TokenNameIdentifier	 Border Factory
.	TokenNameDOT	
createTitledBorder	TokenNameIdentifier	 create Titled Border
(	TokenNameLPAREN	
"Controls: "	TokenNameStringLiteral	Controls: 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
gridbag	TokenNameIdentifier	 gridbag
=	TokenNameEQUAL	
new	TokenNamenew	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setLayout	TokenNameIdentifier	 set Layout
(	TokenNameLPAREN	
gridbag	TokenNameIdentifier	 gridbag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pad everything 	TokenNameCOMMENT_LINE	Pad everything 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ipadx	TokenNameIdentifier	 ipadx
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
ipady	TokenNameIdentifier	 ipady
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Add the 1st column of labels 	TokenNameCOMMENT_LINE	Add the 1st column of labels 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
anchor	TokenNameIdentifier	 anchor
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
EAST	TokenNameIdentifier	 EAST
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
JLabel	TokenNameIdentifier	 J Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
"Filter Level:"	TokenNameStringLiteral	Filter Level:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
"Filter Thread:"	TokenNameStringLiteral	Filter Thread:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
"Filter Logger:"	TokenNameStringLiteral	Filter Logger:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
"Filter NDC:"	TokenNameStringLiteral	Filter NDC:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
"Filter Message:"	TokenNameStringLiteral	Filter Message:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the 2nd column of filters 	TokenNameCOMMENT_LINE	Add the 2nd column of filters 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//c.weighty = 1; 	TokenNameCOMMENT_LINE	c.weighty = 1; 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
anchor	TokenNameIdentifier	 anchor
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
WEST	TokenNameIdentifier	 WEST
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allPriorities	TokenNameIdentifier	 all Priorities
=	TokenNameEQUAL	
new	TokenNamenew	
Level	TokenNameIdentifier	 Level
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
FATAL	TokenNameIdentifier	 FATAL
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
ERROR	TokenNameIdentifier	 ERROR
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
WARN	TokenNameIdentifier	 WARN
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
INFO	TokenNameIdentifier	 INFO
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
DEBUG	TokenNameIdentifier	 DEBUG
,	TokenNameCOMMA	
Level	TokenNameIdentifier	 Level
.	TokenNameDOT	
TRACE	TokenNameIdentifier	 TRACE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JComboBox	TokenNameIdentifier	 J Combo Box
priorities	TokenNameIdentifier	 priorities
=	TokenNameEQUAL	
new	TokenNamenew	
JComboBox	TokenNameIdentifier	 J Combo Box
(	TokenNameLPAREN	
allPriorities	TokenNameIdentifier	 all Priorities
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Level	TokenNameIdentifier	 Level
lowest	TokenNameIdentifier	 lowest
=	TokenNameEQUAL	
allPriorities	TokenNameIdentifier	 all Priorities
[	TokenNameLBRACKET	
allPriorities	TokenNameIdentifier	 all Priorities
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
priorities	TokenNameIdentifier	 priorities
.	TokenNameDOT	
setSelectedItem	TokenNameIdentifier	 set Selected Item
(	TokenNameLPAREN	
lowest	TokenNameIdentifier	 lowest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setPriorityFilter	TokenNameIdentifier	 set Priority Filter
(	TokenNameLPAREN	
lowest	TokenNameIdentifier	 lowest
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
priorities	TokenNameIdentifier	 priorities
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
priorities	TokenNameIdentifier	 priorities
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
priorities	TokenNameIdentifier	 priorities
.	TokenNameDOT	
setEditable	TokenNameIdentifier	 set Editable
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
priorities	TokenNameIdentifier	 priorities
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
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setPriorityFilter	TokenNameIdentifier	 set Priority Filter
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Priority	TokenNameIdentifier	 Priority
)	TokenNameRPAREN	
priorities	TokenNameIdentifier	 priorities
.	TokenNameDOT	
getSelectedItem	TokenNameIdentifier	 get Selected Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JTextField	TokenNameIdentifier	 J Text Field
threadField	TokenNameIdentifier	 thread Field
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadField	TokenNameIdentifier	 thread Field
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addDocumentListener	TokenNameIdentifier	 add Document Listener
(	TokenNameLPAREN	
new	TokenNamenew	
DocumentListener	TokenNameIdentifier	 Document Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
insertUpdate	TokenNameIdentifier	 insert Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setThreadFilter	TokenNameIdentifier	 set Thread Filter
(	TokenNameLPAREN	
threadField	TokenNameIdentifier	 thread Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeUpdate	TokenNameIdentifier	 remove Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvente	TokenNameIdentifier	 a Evente
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setThreadFilter	TokenNameIdentifier	 set Thread Filter
(	TokenNameLPAREN	
threadField	TokenNameIdentifier	 thread Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
changedUpdate	TokenNameIdentifier	 changed Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setThreadFilter	TokenNameIdentifier	 set Thread Filter
(	TokenNameLPAREN	
threadField	TokenNameIdentifier	 thread Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
threadField	TokenNameIdentifier	 thread Field
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
threadField	TokenNameIdentifier	 thread Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JTextField	TokenNameIdentifier	 J Text Field
catField	TokenNameIdentifier	 cat Field
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
catField	TokenNameIdentifier	 cat Field
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addDocumentListener	TokenNameIdentifier	 add Document Listener
(	TokenNameLPAREN	
new	TokenNamenew	
DocumentListener	TokenNameIdentifier	 Document Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
insertUpdate	TokenNameIdentifier	 insert Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setCategoryFilter	TokenNameIdentifier	 set Category Filter
(	TokenNameLPAREN	
catField	TokenNameIdentifier	 cat Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeUpdate	TokenNameIdentifier	 remove Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setCategoryFilter	TokenNameIdentifier	 set Category Filter
(	TokenNameLPAREN	
catField	TokenNameIdentifier	 cat Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
changedUpdate	TokenNameIdentifier	 changed Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setCategoryFilter	TokenNameIdentifier	 set Category Filter
(	TokenNameLPAREN	
catField	TokenNameIdentifier	 cat Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
catField	TokenNameIdentifier	 cat Field
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
catField	TokenNameIdentifier	 cat Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JTextField	TokenNameIdentifier	 J Text Field
ndcField	TokenNameIdentifier	 ndc Field
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ndcField	TokenNameIdentifier	 ndc Field
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addDocumentListener	TokenNameIdentifier	 add Document Listener
(	TokenNameLPAREN	
new	TokenNamenew	
DocumentListener	TokenNameIdentifier	 Document Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
insertUpdate	TokenNameIdentifier	 insert Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setNDCFilter	TokenNameIdentifier	 set NDC Filter
(	TokenNameLPAREN	
ndcField	TokenNameIdentifier	 ndc Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeUpdate	TokenNameIdentifier	 remove Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setNDCFilter	TokenNameIdentifier	 set NDC Filter
(	TokenNameLPAREN	
ndcField	TokenNameIdentifier	 ndc Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
changedUpdate	TokenNameIdentifier	 changed Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setNDCFilter	TokenNameIdentifier	 set NDC Filter
(	TokenNameLPAREN	
ndcField	TokenNameIdentifier	 ndc Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
ndcField	TokenNameIdentifier	 ndc Field
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ndcField	TokenNameIdentifier	 ndc Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JTextField	TokenNameIdentifier	 J Text Field
msgField	TokenNameIdentifier	 msg Field
=	TokenNameEQUAL	
new	TokenNamenew	
JTextField	TokenNameIdentifier	 J Text Field
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
msgField	TokenNameIdentifier	 msg Field
.	TokenNameDOT	
getDocument	TokenNameIdentifier	 get Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
addDocumentListener	TokenNameIdentifier	 add Document Listener
(	TokenNameLPAREN	
new	TokenNamenew	
DocumentListener	TokenNameIdentifier	 Document Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
insertUpdate	TokenNameIdentifier	 insert Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setMessageFilter	TokenNameIdentifier	 set Message Filter
(	TokenNameLPAREN	
msgField	TokenNameIdentifier	 msg Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
removeUpdate	TokenNameIdentifier	 remove Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setMessageFilter	TokenNameIdentifier	 set Message Filter
(	TokenNameLPAREN	
msgField	TokenNameIdentifier	 msg Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
changedUpdate	TokenNameIdentifier	 changed Update
(	TokenNameLPAREN	
DocumentEvent	TokenNameIdentifier	 Document Event
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
setMessageFilter	TokenNameIdentifier	 set Message Filter
(	TokenNameLPAREN	
msgField	TokenNameIdentifier	 msg Field
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
msgField	TokenNameIdentifier	 msg Field
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
msgField	TokenNameIdentifier	 msg Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the 3rd column of buttons 	TokenNameCOMMENT_LINE	Add the 3rd column of buttons 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
anchor	TokenNameIdentifier	 anchor
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
EAST	TokenNameIdentifier	 EAST
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridx	TokenNameIdentifier	 gridx
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JButton	TokenNameIdentifier	 J Button
exitButton	TokenNameIdentifier	 exit Button
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
"Exit"	TokenNameStringLiteral	Exit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exitButton	TokenNameIdentifier	 exit Button
.	TokenNameDOT	
setMnemonic	TokenNameIdentifier	 set Mnemonic
(	TokenNameLPAREN	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
exitButton	TokenNameIdentifier	 exit Button
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
ExitAction	TokenNameIdentifier	 Exit Action
.	TokenNameDOT	
INSTANCE	TokenNameIdentifier	 INSTANCE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
exitButton	TokenNameIdentifier	 exit Button
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
exitButton	TokenNameIdentifier	 exit Button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JButton	TokenNameIdentifier	 J Button
clearButton	TokenNameIdentifier	 clear Button
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
"Clear"	TokenNameStringLiteral	Clear
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearButton	TokenNameIdentifier	 clear Button
.	TokenNameDOT	
setMnemonic	TokenNameIdentifier	 set Mnemonic
(	TokenNameLPAREN	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clearButton	TokenNameIdentifier	 clear Button
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
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
clearButton	TokenNameIdentifier	 clear Button
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clearButton	TokenNameIdentifier	 clear Button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridy	TokenNameIdentifier	 gridy
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
JButton	TokenNameIdentifier	 J Button
toggleButton	TokenNameIdentifier	 toggle Button
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
"Pause"	TokenNameStringLiteral	Pause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toggleButton	TokenNameIdentifier	 toggle Button
.	TokenNameDOT	
setMnemonic	TokenNameIdentifier	 set Mnemonic
(	TokenNameLPAREN	
'p'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toggleButton	TokenNameIdentifier	 toggle Button
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
aEvent	TokenNameIdentifier	 a Event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
toggle	TokenNameIdentifier	 toggle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toggleButton	TokenNameIdentifier	 toggle Button
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
aModel	TokenNameIdentifier	 a Model
.	TokenNameDOT	
isPaused	TokenNameIdentifier	 is Paused
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
"Resume"	TokenNameStringLiteral	Resume
:	TokenNameCOLON	
"Pause"	TokenNameStringLiteral	Pause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gridbag	TokenNameIdentifier	 gridbag
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
toggleButton	TokenNameIdentifier	 toggle Button
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
toggleButton	TokenNameIdentifier	 toggle Button
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
