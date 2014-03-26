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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventListener	TokenNameIdentifier	 Event Listener
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
event	TokenNameIdentifier	 event
.	TokenNameDOT	
EventListenerList	TokenNameIdentifier	 Event Listener List
;	TokenNameSEMICOLON	
/** * History browser. Manages perform of execute, undo and redo actions. */	TokenNameCOMMENT_JAVADOC	 History browser. Manages perform of execute, undo and redo actions. 
public	TokenNamepublic	
class	TokenNameclass	
HistoryBrowser	TokenNameIdentifier	 History Browser
{	TokenNameLBRACE	
// The history browser states. Show whether the history browser is busy 	TokenNameCOMMENT_LINE	The history browser states. Show whether the history browser is busy 
// performing execute, undo or redo, or whether is idle. 	TokenNameCOMMENT_LINE	performing execute, undo or redo, or whether is idle. 
/** * The history browser is executing the command(s). */	TokenNameCOMMENT_JAVADOC	 The history browser is executing the command(s). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
EXECUTING	TokenNameIdentifier	 EXECUTING
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The history browser is undoing the command(s). */	TokenNameCOMMENT_JAVADOC	 The history browser is undoing the command(s). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
UNDOING	TokenNameIdentifier	 UNDOING
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The history browser is redoing the command(s). */	TokenNameCOMMENT_JAVADOC	 The history browser is redoing the command(s). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
REDOING	TokenNameIdentifier	 REDOING
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The history browser is in idle state - no command is being executed, * undone or redone. */	TokenNameCOMMENT_JAVADOC	 The history browser is in idle state - no command is being executed, undone or redone. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IDLE	TokenNameIdentifier	 IDLE
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Listeners list. */	TokenNameCOMMENT_JAVADOC	 Listeners list. 
protected	TokenNameprotected	
EventListenerList	TokenNameIdentifier	 Event Listener List
eventListeners	TokenNameIdentifier	 event Listeners
=	TokenNameEQUAL	
new	TokenNamenew	
EventListenerList	TokenNameIdentifier	 Event Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Command history. */	TokenNameCOMMENT_JAVADOC	 Command history. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
history	TokenNameIdentifier	 history
;	TokenNameSEMICOLON	
/** * Current command pointer in history array. */	TokenNameCOMMENT_JAVADOC	 Current command pointer in history array. 
protected	TokenNameprotected	
int	TokenNameint	
currentCommandIndex	TokenNameIdentifier	 current Command Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * History size. */	TokenNameCOMMENT_JAVADOC	 History size. 
protected	TokenNameprotected	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The current state of the history browser. */	TokenNameCOMMENT_JAVADOC	 The current state of the history browser. 
protected	TokenNameprotected	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IDLE	TokenNameIdentifier	 IDLE
;	TokenNameSEMICOLON	
/** * Tells the history browser how to execute, undo and redo the commands. * Wraps the execute, undo and redo methods */	TokenNameCOMMENT_JAVADOC	 Tells the history browser how to execute, undo and redo the commands. Wraps the execute, undo and redo methods 
protected	TokenNameprotected	
CommandController	TokenNameIdentifier	 Command Controller
commandController	TokenNameIdentifier	 command Controller
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
HistoryBrowser	TokenNameIdentifier	 History Browser
(	TokenNameLPAREN	
CommandController	TokenNameIdentifier	 Command Controller
commandController	TokenNameIdentifier	 command Controller
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
history	TokenNameIdentifier	 history
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
commandController	TokenNameIdentifier	 command Controller
=	TokenNameEQUAL	
commandController	TokenNameIdentifier	 command Controller
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructor. * @param historySize History size */	TokenNameCOMMENT_JAVADOC	 Constructor. @param historySize History size 
public	TokenNamepublic	
HistoryBrowser	TokenNameIdentifier	 History Browser
(	TokenNameLPAREN	
int	TokenNameint	
historySize	TokenNameIdentifier	 history Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
history	TokenNameIdentifier	 history
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setHistorySize	TokenNameIdentifier	 set History Size
(	TokenNameLPAREN	
historySize	TokenNameIdentifier	 history Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Setter for the history size. * * @param size * New history size */	TokenNameCOMMENT_JAVADOC	 Setter for the history size. * @param size New history size 
protected	TokenNameprotected	
void	TokenNamevoid	
setHistorySize	TokenNameIdentifier	 set History Size
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
historySize	TokenNameIdentifier	 history Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the commandController. * * @param newCommandController * The newCommandController to set */	TokenNameCOMMENT_JAVADOC	 Sets the commandController. * @param newCommandController The newCommandController to set 
public	TokenNamepublic	
void	TokenNamevoid	
setCommandController	TokenNameIdentifier	 set Command Controller
(	TokenNameLPAREN	
CommandController	TokenNameIdentifier	 Command Controller
newCommandController	TokenNameIdentifier	 new Command Controller
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
commandController	TokenNameIdentifier	 command Controller
=	TokenNameEQUAL	
newCommandController	TokenNameIdentifier	 new Command Controller
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the given command to history array and executes it. * * @param command * The given command */	TokenNameCOMMENT_JAVADOC	 Adds the given command to history array and executes it. * @param command The given command 
public	TokenNamepublic	
void	TokenNamevoid	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// When the command is added to history array, the commands from the 	TokenNameCOMMENT_LINE	When the command is added to history array, the commands from the 
// current position to the end of the list are removed from history 	TokenNameCOMMENT_LINE	current position to the end of the list are removed from history 
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
currentCommandIndex	TokenNameIdentifier	 current Command Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Executes the command 	TokenNameCOMMENT_LINE	Executes the command 
if	TokenNameif	
(	TokenNameLPAREN	
commandController	TokenNameIdentifier	 command Controller
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandController	TokenNameIdentifier	 command Controller
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
EXECUTING	TokenNameIdentifier	 EXECUTING
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IDLE	TokenNameIdentifier	 IDLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Adds it to the history array 	TokenNameCOMMENT_LINE	Adds it to the history array 
history	TokenNameIdentifier	 history
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Updates the pointer to the current command 	TokenNameCOMMENT_LINE	Updates the pointer to the current command 
currentCommandIndex	TokenNameIdentifier	 current Command Index
=	TokenNameEQUAL	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentCommandIndex	TokenNameIdentifier	 current Command Index
>=	TokenNameGREATER_EQUAL	
historySize	TokenNameIdentifier	 history Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentCommandIndex	TokenNameIdentifier	 current Command Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireExecutePerformed	TokenNameIdentifier	 fire Execute Performed
(	TokenNameLPAREN	
new	TokenNamenew	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
(	TokenNameLPAREN	
new	TokenNamenew	
CommandNamesInfo	TokenNameIdentifier	 Command Names Info
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getLastUndoableCommandName	TokenNameIdentifier	 get Last Undoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getLastRedoableCommandName	TokenNameIdentifier	 get Last Redoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Undoes the last executed or 'redone' command. */	TokenNameCOMMENT_JAVADOC	 Undoes the last executed or 'redone' command. 
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If history is empty, or the current command index is out of bounds 	TokenNameCOMMENT_LINE	If history is empty, or the current command index is out of bounds 
if	TokenNameif	
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentCommandIndex	TokenNameIdentifier	 current Command Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Gets the command and performs undo 	TokenNameCOMMENT_LINE	Gets the command and performs undo 
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
)	TokenNameRPAREN	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentCommandIndex	TokenNameIdentifier	 current Command Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
commandController	TokenNameIdentifier	 command Controller
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandController	TokenNameIdentifier	 command Controller
.	TokenNameDOT	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
UNDOING	TokenNameIdentifier	 UNDOING
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IDLE	TokenNameIdentifier	 IDLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Updates the current command index 	TokenNameCOMMENT_LINE	Updates the current command index 
currentCommandIndex	TokenNameIdentifier	 current Command Index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
fireUndoPerformed	TokenNameIdentifier	 fire Undo Performed
(	TokenNameLPAREN	
new	TokenNamenew	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
(	TokenNameLPAREN	
new	TokenNamenew	
CommandNamesInfo	TokenNameIdentifier	 Command Names Info
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getLastUndoableCommandName	TokenNameIdentifier	 get Last Undoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getLastRedoableCommandName	TokenNameIdentifier	 get Last Redoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Redoes the last 'undone' command. */	TokenNameCOMMENT_JAVADOC	 Redoes the last 'undone' command. 
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If history is empty, or the current command index is out of bounds 	TokenNameCOMMENT_LINE	If history is empty, or the current command index is out of bounds 
if	TokenNameif	
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentCommandIndex	TokenNameIdentifier	 current Command Index
==	TokenNameEQUAL_EQUAL	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Increases the current command index and redoes the command 	TokenNameCOMMENT_LINE	Increases the current command index and redoes the command 
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
)	TokenNameRPAREN	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentCommandIndex	TokenNameIdentifier	 current Command Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
commandController	TokenNameIdentifier	 command Controller
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
commandController	TokenNameIdentifier	 command Controller
.	TokenNameDOT	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
REDOING	TokenNameIdentifier	 REDOING
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
IDLE	TokenNameIdentifier	 IDLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fireRedoPerformed	TokenNameIdentifier	 fire Redo Performed
(	TokenNameLPAREN	
new	TokenNamenew	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
(	TokenNameLPAREN	
new	TokenNamenew	
CommandNamesInfo	TokenNameIdentifier	 Command Names Info
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getLastUndoableCommandName	TokenNameIdentifier	 get Last Undoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getLastRedoableCommandName	TokenNameIdentifier	 get Last Redoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Performs undo action the given number of times. * * @param undoNumber * The given number of undo actions to perform */	TokenNameCOMMENT_JAVADOC	 Performs undo action the given number of times. * @param undoNumber The given number of undo actions to perform 
public	TokenNamepublic	
void	TokenNamevoid	
compoundUndo	TokenNameIdentifier	 compound Undo
(	TokenNameLPAREN	
int	TokenNameint	
undoNumber	TokenNameIdentifier	 undo Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
undoNumber	TokenNameIdentifier	 undo Number
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Performs redo action the given number of times. * * @param redoNumber * The given number of redo actions to perform */	TokenNameCOMMENT_JAVADOC	 Performs redo action the given number of times. * @param redoNumber The given number of redo actions to perform 
public	TokenNamepublic	
void	TokenNamevoid	
compoundRedo	TokenNameIdentifier	 compound Redo
(	TokenNameLPAREN	
int	TokenNameint	
redoNumber	TokenNameIdentifier	 redo Number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
redoNumber	TokenNameIdentifier	 redo Number
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets the last undoable command name. * * @return String or "" if there's no any */	TokenNameCOMMENT_JAVADOC	 Gets the last undoable command name. * @return String or "" if there's no any 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLastUndoableCommandName	TokenNameIdentifier	 get Last Undoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentCommandIndex	TokenNameIdentifier	 current Command Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
)	TokenNameRPAREN	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentCommandIndex	TokenNameIdentifier	 current Command Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the last redoable command name. * * @return String or "" if there's no any */	TokenNameCOMMENT_JAVADOC	 Gets the last redoable command name. * @return String or "" if there's no any 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLastRedoableCommandName	TokenNameIdentifier	 get Last Redoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
currentCommandIndex	TokenNameIdentifier	 current Command Index
==	TokenNameEQUAL_EQUAL	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
)	TokenNameRPAREN	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentCommandIndex	TokenNameIdentifier	 current Command Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the history array. */	TokenNameCOMMENT_JAVADOC	 Clears the history array. 
public	TokenNamepublic	
void	TokenNamevoid	
resetHistory	TokenNameIdentifier	 reset History
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
history	TokenNameIdentifier	 history
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentCommandIndex	TokenNameIdentifier	 current Command Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fireHistoryReset	TokenNameIdentifier	 fire History Reset
(	TokenNameLPAREN	
new	TokenNamenew	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
(	TokenNameLPAREN	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the state of this history browser. * * @return the state */	TokenNameCOMMENT_JAVADOC	 Gets the state of this history browser. * @return the state 
public	TokenNamepublic	
int	TokenNameint	
getState	TokenNameIdentifier	 get State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
commandController	TokenNameIdentifier	 command Controller
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
commandController	TokenNameIdentifier	 command Controller
.	TokenNameDOT	
getState	TokenNameIdentifier	 get State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Custom event support 	TokenNameCOMMENT_LINE	Custom event support 
/** * Event to pass to listener. */	TokenNameCOMMENT_JAVADOC	 Event to pass to listener. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
extends	TokenNameextends	
EventObject	TokenNameIdentifier	 Event Object
{	TokenNameLBRACE	
/** * @param source */	TokenNameCOMMENT_JAVADOC	 @param source 
public	TokenNamepublic	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The HistoryBrowserListener. */	TokenNameCOMMENT_JAVADOC	 The HistoryBrowserListener. 
public	TokenNamepublic	
static	TokenNamestatic	
interface	TokenNameinterface	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
extends	TokenNameextends	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
/** * The command has been executed. */	TokenNameCOMMENT_JAVADOC	 The command has been executed. 
void	TokenNamevoid	
executePerformed	TokenNameIdentifier	 execute Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The undo has been performed on the command. */	TokenNameCOMMENT_JAVADOC	 The undo has been performed on the command. 
void	TokenNamevoid	
undoPerformed	TokenNameIdentifier	 undo Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The redo has been performed on the command. */	TokenNameCOMMENT_JAVADOC	 The redo has been performed on the command. 
void	TokenNamevoid	
redoPerformed	TokenNameIdentifier	 redo Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * History has been reset, and all commands have been removed from the * history. */	TokenNameCOMMENT_JAVADOC	 History has been reset, and all commands have been removed from the history. 
void	TokenNamevoid	
historyReset	TokenNameIdentifier	 history Reset
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The the atom command that should be wrapped with the compound command * has been executed. */	TokenNameCOMMENT_JAVADOC	 The the atom command that should be wrapped with the compound command has been executed. 
void	TokenNamevoid	
doCompoundEdit	TokenNameIdentifier	 do Compound Edit
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The compound command has been made from the atom commands that were * executed and should be wrapped. */	TokenNameCOMMENT_JAVADOC	 The compound command has been made from the atom commands that were executed and should be wrapped. 
void	TokenNamevoid	
compoundEditPerformed	TokenNameIdentifier	 compound Edit Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The adapter to provide the default behavior. */	TokenNameCOMMENT_JAVADOC	 The adapter to provide the default behavior. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
HistoryBrowserAdapter	TokenNameIdentifier	 History Browser Adapter
implements	TokenNameimplements	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
executePerformed	TokenNameIdentifier	 execute Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undoPerformed	TokenNameIdentifier	 undo Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redoPerformed	TokenNameIdentifier	 redo Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
historyReset	TokenNameIdentifier	 history Reset
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
compoundEditPerformed	TokenNameIdentifier	 compound Edit Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
doCompoundEdit	TokenNameIdentifier	 do Compound Edit
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Adds the listener to the listener list. * * @param listener * The listener to add */	TokenNameCOMMENT_JAVADOC	 Adds the listener to the listener list. * @param listener The listener to add 
public	TokenNamepublic	
void	TokenNamevoid	
addListener	TokenNameIdentifier	 add Listener
(	TokenNameLPAREN	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eventListeners	TokenNameIdentifier	 event Listeners
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
.	TokenNameDOT	
class	TokenNameclass	
,	TokenNameCOMMA	
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fires the executePerformed event. * * @param event * The associated HistoryBrowserEvent event */	TokenNameCOMMENT_JAVADOC	 Fires the executePerformed event. * @param event The associated HistoryBrowserEvent event 
public	TokenNamepublic	
void	TokenNamevoid	
fireExecutePerformed	TokenNameIdentifier	 fire Execute Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
eventListeners	TokenNameIdentifier	 event Listeners
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
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
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
executePerformed	TokenNameIdentifier	 execute Performed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires the undoPerformed event. * * @param event * The associated HistoryBrowserEvent event */	TokenNameCOMMENT_JAVADOC	 Fires the undoPerformed event. * @param event The associated HistoryBrowserEvent event 
public	TokenNamepublic	
void	TokenNamevoid	
fireUndoPerformed	TokenNameIdentifier	 fire Undo Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
eventListeners	TokenNameIdentifier	 event Listeners
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
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
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
undoPerformed	TokenNameIdentifier	 undo Performed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires the redoPerformed event. * * @param event * The associated HistoryBrowserEvent event */	TokenNameCOMMENT_JAVADOC	 Fires the redoPerformed event. * @param event The associated HistoryBrowserEvent event 
public	TokenNamepublic	
void	TokenNamevoid	
fireRedoPerformed	TokenNameIdentifier	 fire Redo Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
eventListeners	TokenNameIdentifier	 event Listeners
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
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
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
redoPerformed	TokenNameIdentifier	 redo Performed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires the historyReset event. * * @param event * The associated HistoryBrowserEvent event */	TokenNameCOMMENT_JAVADOC	 Fires the historyReset event. * @param event The associated HistoryBrowserEvent event 
public	TokenNamepublic	
void	TokenNamevoid	
fireHistoryReset	TokenNameIdentifier	 fire History Reset
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
eventListeners	TokenNameIdentifier	 event Listeners
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
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
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
historyReset	TokenNameIdentifier	 history Reset
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires the doCompoundEdit event. * * @param event * The associated HistoryBrowserEvent event */	TokenNameCOMMENT_JAVADOC	 Fires the doCompoundEdit event. * @param event The associated HistoryBrowserEvent event 
public	TokenNamepublic	
void	TokenNamevoid	
fireDoCompoundEdit	TokenNameIdentifier	 fire Do Compound Edit
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
eventListeners	TokenNameIdentifier	 event Listeners
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
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
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
doCompoundEdit	TokenNameIdentifier	 do Compound Edit
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fires the compoundEditPerformed event. * * @param event * The associated HistoryBrowserEvent event */	TokenNameCOMMENT_JAVADOC	 Fires the compoundEditPerformed event. * @param event The associated HistoryBrowserEvent event 
public	TokenNamepublic	
void	TokenNamevoid	
fireCompoundEditPerformed	TokenNameIdentifier	 fire Compound Edit Performed
(	TokenNameLPAREN	
HistoryBrowserEvent	TokenNameIdentifier	 History Browser Event
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listeners	TokenNameIdentifier	 listeners
=	TokenNameEQUAL	
eventListeners	TokenNameIdentifier	 event Listeners
.	TokenNameDOT	
getListenerList	TokenNameIdentifier	 get Listener List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
listeners	TokenNameIdentifier	 listeners
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
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
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HistoryBrowserListener	TokenNameIdentifier	 History Browser Listener
)	TokenNameRPAREN	
listeners	TokenNameIdentifier	 listeners
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
compoundEditPerformed	TokenNameIdentifier	 compound Edit Performed
(	TokenNameLPAREN	
event	TokenNameIdentifier	 event
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Contains the info on the command name being executed, undone or redone and * last undoable and redoable command names. */	TokenNameCOMMENT_JAVADOC	 Contains the info on the command name being executed, undone or redone and last undoable and redoable command names. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
CommandNamesInfo	TokenNameIdentifier	 Command Names Info
{	TokenNameLBRACE	
/** * The name of the last undoable command in the history. */	TokenNameCOMMENT_JAVADOC	 The name of the last undoable command in the history. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lastUndoableCommandName	TokenNameIdentifier	 last Undoable Command Name
;	TokenNameSEMICOLON	
/** * The name of the last redoable command in the history. */	TokenNameCOMMENT_JAVADOC	 The name of the last redoable command in the history. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lastRedoableCommandName	TokenNameIdentifier	 last Redoable Command Name
;	TokenNameSEMICOLON	
/** * The command name being executed, undone or redone. */	TokenNameCOMMENT_JAVADOC	 The command name being executed, undone or redone. 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
;	TokenNameSEMICOLON	
/** * Constructor. * * @param commandName * The current command name being executed/undone/redone * @param lastUndoableCommandName * The last undoable command name * @param lastRedoableCommandName * The last redoable command name */	TokenNameCOMMENT_JAVADOC	 Constructor. * @param commandName The current command name being executed/undone/redone @param lastUndoableCommandName The last undoable command name @param lastRedoableCommandName The last redoable command name 
public	TokenNamepublic	
CommandNamesInfo	TokenNameIdentifier	 Command Names Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
commandName	TokenNameIdentifier	 command Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lastUndoableCommandName	TokenNameIdentifier	 last Undoable Command Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lastRedoableCommandName	TokenNameIdentifier	 last Redoable Command Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lastUndoableCommandName	TokenNameIdentifier	 last Undoable Command Name
=	TokenNameEQUAL	
lastUndoableCommandName	TokenNameIdentifier	 last Undoable Command Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lastRedoableCommandName	TokenNameIdentifier	 last Redoable Command Name
=	TokenNameEQUAL	
lastRedoableCommandName	TokenNameIdentifier	 last Redoable Command Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
commandName	TokenNameIdentifier	 command Name
=	TokenNameEQUAL	
commandName	TokenNameIdentifier	 command Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the name of the last undoable command. * * @return the lastUndoableCommandName */	TokenNameCOMMENT_JAVADOC	 Gets the name of the last undoable command. * @return the lastUndoableCommandName 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLastRedoableCommandName	TokenNameIdentifier	 get Last Redoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastRedoableCommandName	TokenNameIdentifier	 last Redoable Command Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the name of the last redoable command. * * @return the lastRedoableCommandName */	TokenNameCOMMENT_JAVADOC	 Gets the name of the last redoable command. * @return the lastRedoableCommandName 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLastUndoableCommandName	TokenNameIdentifier	 get Last Undoable Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastUndoableCommandName	TokenNameIdentifier	 last Undoable Command Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the command name. * * @return the command name */	TokenNameCOMMENT_JAVADOC	 Gets the command name. * @return the command name 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCommandName	TokenNameIdentifier	 get Command Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
commandName	TokenNameIdentifier	 command Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Wrapps the command's execute, undo and redo methods. */	TokenNameCOMMENT_JAVADOC	 Wrapps the command's execute, undo and redo methods. 
public	TokenNamepublic	
static	TokenNamestatic	
interface	TokenNameinterface	
CommandController	TokenNameIdentifier	 Command Controller
{	TokenNameLBRACE	
/** * Wrapps the execute method. */	TokenNameCOMMENT_JAVADOC	 Wrapps the execute method. 
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Wrapps the undo method. */	TokenNameCOMMENT_JAVADOC	 Wrapps the undo method. 
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Wrapps the redo method. */	TokenNameCOMMENT_JAVADOC	 Wrapps the redo method. 
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the state of the command controller. * @return HistoryBrowserState */	TokenNameCOMMENT_JAVADOC	 Gets the state of the command controller. @return HistoryBrowserState 
int	TokenNameint	
getState	TokenNameIdentifier	 get State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lets the DOMViewerController wrap the commands. */	TokenNameCOMMENT_JAVADOC	 Lets the DOMViewerController wrap the commands. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DocumentCommandController	TokenNameIdentifier	 Document Command Controller
implements	TokenNameimplements	
CommandController	TokenNameIdentifier	 Command Controller
{	TokenNameLBRACE	
/** * The DOMViewerController. */	TokenNameCOMMENT_JAVADOC	 The DOMViewerController. 
protected	TokenNameprotected	
DOMViewerController	TokenNameIdentifier	 DOM Viewer Controller
controller	TokenNameIdentifier	 controller
;	TokenNameSEMICOLON	
/** * The current state of the command controller. */	TokenNameCOMMENT_JAVADOC	 The current state of the command controller. 
protected	TokenNameprotected	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
IDLE	TokenNameIdentifier	 IDLE
;	TokenNameSEMICOLON	
/** * The constructor. * * @param controller * The DOMViewerController */	TokenNameCOMMENT_JAVADOC	 The constructor. * @param controller The DOMViewerController 
public	TokenNamepublic	
DocumentCommandController	TokenNameIdentifier	 Document Command Controller
(	TokenNameLPAREN	
DOMViewerController	TokenNameIdentifier	 DOM Viewer Controller
controller	TokenNameIdentifier	 controller
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
controller	TokenNameIdentifier	 controller
=	TokenNameEQUAL	
controller	TokenNameIdentifier	 controller
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
final	TokenNamefinal	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
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
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
EXECUTING	TokenNameIdentifier	 EXECUTING
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
IDLE	TokenNameIdentifier	 IDLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
performUpdate	TokenNameIdentifier	 perform Update
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
final	TokenNamefinal	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
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
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
UNDOING	TokenNameIdentifier	 UNDOING
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
IDLE	TokenNameIdentifier	 IDLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
performUpdate	TokenNameIdentifier	 perform Update
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
final	TokenNamefinal	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Runnable	TokenNameIdentifier	 Runnable
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
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
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
REDOING	TokenNameIdentifier	 REDOING
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
HistoryBrowser	TokenNameIdentifier	 History Browser
.	TokenNameDOT	
IDLE	TokenNameIdentifier	 IDLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
controller	TokenNameIdentifier	 controller
.	TokenNameDOT	
performUpdate	TokenNameIdentifier	 perform Update
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getState	TokenNameIdentifier	 get State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
