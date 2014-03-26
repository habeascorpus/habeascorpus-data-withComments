/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
resource	TokenNameIdentifier	 resource
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
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
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
JToolBar	TokenNameIdentifier	 J Tool Bar
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
ResourceManager	TokenNameIdentifier	 Resource Manager
;	TokenNameSEMICOLON	
/** * This class represents a tool bar factory which builds * tool bars from the content of a resource file. <br> * * The resource entries format is (for a tool bar named 'ToolBar'):<br> * <pre> * ToolBar = Item1 Item2 - Item3 ... * See ButtonFactory.java for details about the items * ... * '-' represents a separator * </pre> * All entries are optional. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ToolBarFactory.java 592619 2007-11-07 05:47:24Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a tool bar factory which builds tool bars from the content of a resource file. <br> * The resource entries format is (for a tool bar named 'ToolBar'):<br> <pre> ToolBar = Item1 Item2 - Item3 ... See ButtonFactory.java for details about the items ... '-' represents a separator </pre> All entries are optional. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ToolBarFactory.java 592619 2007-11-07 05:47:24Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ToolBarFactory	TokenNameIdentifier	 Tool Bar Factory
extends	TokenNameextends	
ResourceManager	TokenNameIdentifier	 Resource Manager
{	TokenNameLBRACE	
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SEPARATOR	TokenNameIdentifier	 SEPARATOR
=	TokenNameEQUAL	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
/** * The button factory */	TokenNameCOMMENT_JAVADOC	 The button factory 
private	TokenNameprivate	
ButtonFactory	TokenNameIdentifier	 Button Factory
buttonFactory	TokenNameIdentifier	 button Factory
;	TokenNameSEMICOLON	
/** * Creates a new tool bar factory * @param rb the resource bundle that contains the menu bar * description. * @param am the actions to add to menu items */	TokenNameCOMMENT_JAVADOC	 Creates a new tool bar factory @param rb the resource bundle that contains the menu bar description. @param am the actions to add to menu items 
public	TokenNamepublic	
ToolBarFactory	TokenNameIdentifier	 Tool Bar Factory
(	TokenNameLPAREN	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
rb	TokenNameIdentifier	 rb
,	TokenNameCOMMA	
ActionMap	TokenNameIdentifier	 Action Map
am	TokenNameIdentifier	 am
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
rb	TokenNameIdentifier	 rb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buttonFactory	TokenNameIdentifier	 button Factory
=	TokenNameEQUAL	
new	TokenNamenew	
ButtonFactory	TokenNameIdentifier	 Button Factory
(	TokenNameLPAREN	
rb	TokenNameIdentifier	 rb
,	TokenNameCOMMA	
am	TokenNameIdentifier	 am
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a tool bar * @param name the name of the menu bar in the resource bundle * @throws MissingResourceException if one of the keys that compose the * tool bar is missing. * It is not thrown if the action key is missing. * @throws ResourceFormatException if a boolean is malformed * @throws MissingListenerException if an item action is not found in the * action map. */	TokenNameCOMMENT_JAVADOC	 Creates a tool bar @param name the name of the menu bar in the resource bundle @throws MissingResourceException if one of the keys that compose the tool bar is missing. It is not thrown if the action key is missing. @throws ResourceFormatException if a boolean is malformed @throws MissingListenerException if an item action is not found in the action map. 
public	TokenNamepublic	
JToolBar	TokenNameIdentifier	 J Tool Bar
createJToolBar	TokenNameIdentifier	 create J Tool Bar
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
JToolBar	TokenNameIdentifier	 J Tool Bar
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JToolBar	TokenNameIdentifier	 J Tool Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
buttons	TokenNameIdentifier	 buttons
=	TokenNameEQUAL	
getStringList	TokenNameIdentifier	 get String List
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
buttons	TokenNameIdentifier	 buttons
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
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
JToolbarSeparator	TokenNameIdentifier	 J Toolbar Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createJButton	TokenNameIdentifier	 create J Button
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing button * @param name the name of the button in the resource bundle * @throws MissingResourceException if key is not the name of a button. * It is not thrown if the mnemonic and the action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character * @throws MissingListenerException if the button action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing button @param name the name of the button in the resource bundle @throws MissingResourceException if key is not the name of a button. It is not thrown if the mnemonic and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character @throws MissingListenerException if the button action is not found in the action map. 
public	TokenNamepublic	
JButton	TokenNameIdentifier	 J Button
createJButton	TokenNameIdentifier	 create J Button
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
buttonFactory	TokenNameIdentifier	 button Factory
.	TokenNameDOT	
createJToolbarButton	TokenNameIdentifier	 create J Toolbar Button
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
