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
/** * Abstract compound command. Supports the execute / undo / redo of more than * one command * * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 Abstract compound command. Supports the execute / undo / redo of more than one command * @version $Id$ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractCompoundCommand	TokenNameIdentifier	 Abstract Compound Command
extends	TokenNameextends	
AbstractUndoableCommand	TokenNameIdentifier	 Abstract Undoable Command
{	TokenNameLBRACE	
/** * The atom UndoableCommand command list. */	TokenNameCOMMENT_JAVADOC	 The atom UndoableCommand command list. 
protected	TokenNameprotected	
ArrayList	TokenNameIdentifier	 Array List
atomCommands	TokenNameIdentifier	 atom Commands
;	TokenNameSEMICOLON	
/** * Constructor. */	TokenNameCOMMENT_JAVADOC	 Constructor. 
public	TokenNamepublic	
AbstractCompoundCommand	TokenNameIdentifier	 Abstract Compound Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
atomCommands	TokenNameIdentifier	 atom Commands
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the given command to the atomCommand list. * * @param command * The given command */	TokenNameCOMMENT_JAVADOC	 Adds the given command to the atomCommand list. * @param command The given command 
public	TokenNamepublic	
void	TokenNamevoid	
addCommand	TokenNameIdentifier	 add Command
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
atomCommands	TokenNameIdentifier	 atom Commands
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
command	TokenNameIdentifier	 command
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
atomCommands	TokenNameIdentifier	 atom Commands
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UndoableCommand	TokenNameIdentifier	 Undoable Command
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
)	TokenNameRPAREN	
atomCommands	TokenNameIdentifier	 atom Commands
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
atomCommands	TokenNameIdentifier	 atom Commands
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
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
)	TokenNameRPAREN	
atomCommands	TokenNameIdentifier	 atom Commands
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
atomCommands	TokenNameIdentifier	 atom Commands
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UndoableCommand	TokenNameIdentifier	 Undoable Command
cmd	TokenNameIdentifier	 cmd
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
)	TokenNameRPAREN	
atomCommands	TokenNameIdentifier	 atom Commands
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmd	TokenNameIdentifier	 cmd
.	TokenNameDOT	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
atomCommands	TokenNameIdentifier	 atom Commands
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shouldExecute	TokenNameIdentifier	 should Execute
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
atomCommands	TokenNameIdentifier	 atom Commands
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
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
n	TokenNameIdentifier	 n
&&	TokenNameAND_AND	
shouldExecute	TokenNameIdentifier	 should Execute
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
UndoableCommand	TokenNameIdentifier	 Undoable Command
command	TokenNameIdentifier	 command
=	TokenNameEQUAL	
(	TokenNameLPAREN	
UndoableCommand	TokenNameIdentifier	 Undoable Command
)	TokenNameRPAREN	
atomCommands	TokenNameIdentifier	 atom Commands
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shouldExecute	TokenNameIdentifier	 should Execute
=	TokenNameEQUAL	
command	TokenNameIdentifier	 command
.	TokenNameDOT	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
shouldExecute	TokenNameIdentifier	 should Execute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
shouldExecute	TokenNameIdentifier	 should Execute
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the command number that this compound command contains. * * @return The atom command number */	TokenNameCOMMENT_JAVADOC	 Returns the command number that this compound command contains. * @return The atom command number 
public	TokenNamepublic	
int	TokenNameint	
getCommandNumber	TokenNameIdentifier	 get Command Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
atomCommands	TokenNameIdentifier	 atom Commands
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
