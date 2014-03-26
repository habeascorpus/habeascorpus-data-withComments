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
/** * The undoable/redoable command. * * @version $Id$ */	TokenNameCOMMENT_JAVADOC	 The undoable/redoable command. * @version $Id$ 
public	TokenNamepublic	
interface	TokenNameinterface	
UndoableCommand	TokenNameIdentifier	 Undoable Command
{	TokenNameLBRACE	
/** * Executes this command. */	TokenNameCOMMENT_JAVADOC	 Executes this command. 
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Performs undo for this command. */	TokenNameCOMMENT_JAVADOC	 Performs undo for this command. 
void	TokenNamevoid	
undo	TokenNameIdentifier	 undo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Performs redo for this command. */	TokenNameCOMMENT_JAVADOC	 Performs redo for this command. 
void	TokenNamevoid	
redo	TokenNameIdentifier	 redo
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Gets the command name. */	TokenNameCOMMENT_JAVADOC	 Gets the command name. 
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Tests if the command can be executed. * * @return True if command should be executed */	TokenNameCOMMENT_JAVADOC	 Tests if the command can be executed. * @return True if command should be executed 
boolean	TokenNameboolean	
shouldExecute	TokenNameIdentifier	 should Execute
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
