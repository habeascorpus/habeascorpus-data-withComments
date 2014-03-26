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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
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
AbstractButton	TokenNameIdentifier	 Abstract Button
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
Action	TokenNameIdentifier	 Action
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
ButtonGroup	TokenNameIdentifier	 Button Group
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
ImageIcon	TokenNameIdentifier	 Image Icon
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JCheckBoxMenuItem	TokenNameIdentifier	 J Check Box Menu Item
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComponent	TokenNameIdentifier	 J Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JMenu	TokenNameIdentifier	 J Menu
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JMenuBar	TokenNameIdentifier	 J Menu Bar
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JMenuItem	TokenNameIdentifier	 J Menu Item
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JSeparator	TokenNameIdentifier	 J Separator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
KeyStroke	TokenNameIdentifier	 Key Stroke
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
/** * This class represents a menu factory which builds * menubars and menus from the content of a resource file. <br> * * The resource entries format is (for a menubar named 'MenuBar'):<br> * <pre> * MenuBar = Menu1 Menu2 ... * * Menu1.type = RADIO | CHECK | MENU | ITEM * Menu1 = Item1 Item2 - Item3 ... * Menu1.text = text * Menu1.icon = icon_name * Menu1.mnemonic = mnemonic * Menu1.accelerator = accelerator * Menu1.action = action_name * Menu1.selected = true | false * Menu1.enabled = true | false * ... * mnemonic is a single character * accelerator is of the form described in {@link javax.swing.KeyStroke#getKeyStroke(String)}. * '-' represents a separator * </pre> * All entries are optional except the '.type' entry * Consecutive RADIO items are put in a ButtonGroup * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: MenuFactory.java 592619 2007-11-07 05:47:24Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a menu factory which builds menubars and menus from the content of a resource file. <br> * The resource entries format is (for a menubar named 'MenuBar'):<br> <pre> MenuBar = Menu1 Menu2 ... * Menu1.type = RADIO | CHECK | MENU | ITEM Menu1 = Item1 Item2 - Item3 ... Menu1.text = text Menu1.icon = icon_name Menu1.mnemonic = mnemonic Menu1.accelerator = accelerator Menu1.action = action_name Menu1.selected = true | false Menu1.enabled = true | false ... mnemonic is a single character accelerator is of the form described in {@link javax.swing.KeyStroke#getKeyStroke(String)}. '-' represents a separator </pre> All entries are optional except the '.type' entry Consecutive RADIO items are put in a ButtonGroup * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: MenuFactory.java 592619 2007-11-07 05:47:24Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
MenuFactory	TokenNameIdentifier	 Menu Factory
extends	TokenNameextends	
ResourceManager	TokenNameIdentifier	 Resource Manager
{	TokenNameLBRACE	
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_MENU	TokenNameIdentifier	 TYPE  MENU
=	TokenNameEQUAL	
"MENU"	TokenNameStringLiteral	MENU
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_ITEM	TokenNameIdentifier	 TYPE  ITEM
=	TokenNameEQUAL	
"ITEM"	TokenNameStringLiteral	ITEM
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_RADIO	TokenNameIdentifier	 TYPE  RADIO
=	TokenNameEQUAL	
"RADIO"	TokenNameStringLiteral	RADIO
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_CHECK	TokenNameIdentifier	 TYPE  CHECK
=	TokenNameEQUAL	
"CHECK"	TokenNameStringLiteral	CHECK
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SEPARATOR	TokenNameIdentifier	 SEPARATOR
=	TokenNameEQUAL	
"-"	TokenNameStringLiteral	-
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TYPE_SUFFIX	TokenNameIdentifier	 TYPE  SUFFIX
=	TokenNameEQUAL	
".type"	TokenNameStringLiteral	.type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
=	TokenNameEQUAL	
".text"	TokenNameStringLiteral	.text
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
MNEMONIC_SUFFIX	TokenNameIdentifier	 MNEMONIC  SUFFIX
=	TokenNameEQUAL	
".mnemonic"	TokenNameStringLiteral	.mnemonic
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ACCELERATOR_SUFFIX	TokenNameIdentifier	 ACCELERATOR  SUFFIX
=	TokenNameEQUAL	
".accelerator"	TokenNameStringLiteral	.accelerator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ACTION_SUFFIX	TokenNameIdentifier	 ACTION  SUFFIX
=	TokenNameEQUAL	
".action"	TokenNameStringLiteral	.action
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SELECTED_SUFFIX	TokenNameIdentifier	 SELECTED  SUFFIX
=	TokenNameEQUAL	
".selected"	TokenNameStringLiteral	.selected
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENABLED_SUFFIX	TokenNameIdentifier	 ENABLED  SUFFIX
=	TokenNameEQUAL	
".enabled"	TokenNameStringLiteral	.enabled
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ICON_SUFFIX	TokenNameIdentifier	 ICON  SUFFIX
=	TokenNameEQUAL	
".icon"	TokenNameStringLiteral	.icon
;	TokenNameSEMICOLON	
/** * The table which contains the actions */	TokenNameCOMMENT_JAVADOC	 The table which contains the actions 
private	TokenNameprivate	
ActionMap	TokenNameIdentifier	 Action Map
actions	TokenNameIdentifier	 actions
;	TokenNameSEMICOLON	
/** * The current radio group */	TokenNameCOMMENT_JAVADOC	 The current radio group 
private	TokenNameprivate	
ButtonGroup	TokenNameIdentifier	 Button Group
buttonGroup	TokenNameIdentifier	 button Group
;	TokenNameSEMICOLON	
/** * Creates a new menu factory * @param rb the resource bundle that contains the menu bar * description. * @param am the actions to add to menu items */	TokenNameCOMMENT_JAVADOC	 Creates a new menu factory @param rb the resource bundle that contains the menu bar description. @param am the actions to add to menu items 
public	TokenNamepublic	
MenuFactory	TokenNameIdentifier	 Menu Factory
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
actions	TokenNameIdentifier	 actions
=	TokenNameEQUAL	
am	TokenNameIdentifier	 am
;	TokenNameSEMICOLON	
buttonGroup	TokenNameIdentifier	 button Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a swing menu bar * @param name the name of the menu bar in the resource bundle * @throws MissingResourceException if one of the keys that compose the * menu is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character and if the accelerator is malformed * @throws MissingListenerException if an item action is not found in the * action map */	TokenNameCOMMENT_JAVADOC	 Creates and returns a swing menu bar @param name the name of the menu bar in the resource bundle @throws MissingResourceException if one of the keys that compose the menu is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character and if the accelerator is malformed @throws MissingListenerException if an item action is not found in the action map 
public	TokenNamepublic	
JMenuBar	TokenNameIdentifier	 J Menu Bar
createJMenuBar	TokenNameIdentifier	 create J Menu Bar
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
createJMenuBar	TokenNameIdentifier	 create J Menu Bar
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a swing menu bar * @param name the name of the menu bar in the resource bundle * @param specialization the name of the specialization to look for * @throws MissingResourceException if one of the keys that compose the * menu is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character and if the accelerator is malformed * @throws MissingListenerException if an item action is not found in the * action map */	TokenNameCOMMENT_JAVADOC	 Creates and returns a swing menu bar @param name the name of the menu bar in the resource bundle @param specialization the name of the specialization to look for @throws MissingResourceException if one of the keys that compose the menu is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character and if the accelerator is malformed @throws MissingListenerException if an item action is not found in the action map 
public	TokenNamepublic	
JMenuBar	TokenNameIdentifier	 J Menu Bar
createJMenuBar	TokenNameIdentifier	 create J Menu Bar
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
JMenuBar	TokenNameIdentifier	 J Menu Bar
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuBar	TokenNameIdentifier	 J Menu Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
menus	TokenNameIdentifier	 menus
=	TokenNameEQUAL	
getSpecializedStringList	TokenNameIdentifier	 get Specialized String List
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
menus	TokenNameIdentifier	 menus
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createJMenuComponent	TokenNameIdentifier	 create J Menu Component
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a possibly specialized resource string. * This will first look for * <code>name + '.' + specialization</code>, and if that resource * doesn't exist, <code>name</code>. */	TokenNameCOMMENT_JAVADOC	 Gets a possibly specialized resource string. This will first look for <code>name + '.' + specialization</code>, and if that resource doesn't exist, <code>name</code>. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
mre	TokenNameIdentifier	 mre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a possibly specialized resource string list. * This will first look for * <code>name + '.' + specialization</code>, and if that resource * doesn't exist, <code>name</code>. */	TokenNameCOMMENT_JAVADOC	 Gets a possibly specialized resource string list. This will first look for <code>name + '.' + specialization</code>, and if that resource doesn't exist, <code>name</code>. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
getSpecializedStringList	TokenNameIdentifier	 get Specialized String List
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
getStringList	TokenNameIdentifier	 get String List
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
mre	TokenNameIdentifier	 mre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
getStringList	TokenNameIdentifier	 get String List
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets a possibly specialized resource boolean. * This will first look for * <code>name + '.' + specialization</code>, and if that resource * doesn't exist, <code>name</code>. */	TokenNameCOMMENT_JAVADOC	 Gets a possibly specialized resource boolean. This will first look for <code>name + '.' + specialization</code>, and if that resource doesn't exist, <code>name</code>. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
getSpecializedBoolean	TokenNameIdentifier	 get Specialized Boolean
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
'.'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
mre	TokenNameIdentifier	 mre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a menu item or a separator * @param name the name of the menu item or "-" to create a separator * @param specialization the name of the specialization to look for * @throws MissingResourceException if key is not the name of a menu item. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException in case of malformed entry * @throws MissingListenerException if an item action is not found in the * action map */	TokenNameCOMMENT_JAVADOC	 Creates and returns a menu item or a separator @param name the name of the menu item or "-" to create a separator @param specialization the name of the specialization to look for @throws MissingResourceException if key is not the name of a menu item. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException in case of malformed entry @throws MissingListenerException if an item action is not found in the action map 
protected	TokenNameprotected	
JComponent	TokenNameIdentifier	 J Component
createJMenuComponent	TokenNameIdentifier	 create J Menu Component
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SEPARATOR	TokenNameIdentifier	 SEPARATOR
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buttonGroup	TokenNameIdentifier	 button Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
JSeparator	TokenNameIdentifier	 J Separator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TYPE_SUFFIX	TokenNameIdentifier	 TYPE  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JComponent	TokenNameIdentifier	 J Component
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TYPE_RADIO	TokenNameIdentifier	 TYPE  RADIO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buttonGroup	TokenNameIdentifier	 button Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buttonGroup	TokenNameIdentifier	 button Group
=	TokenNameEQUAL	
new	TokenNamenew	
ButtonGroup	TokenNameIdentifier	 Button Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buttonGroup	TokenNameIdentifier	 button Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TYPE_MENU	TokenNameIdentifier	 TYPE  MENU
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
createJMenu	TokenNameIdentifier	 create J Menu
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TYPE_ITEM	TokenNameIdentifier	 TYPE  ITEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
createJMenuItem	TokenNameIdentifier	 create J Menu Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TYPE_RADIO	TokenNameIdentifier	 TYPE  RADIO
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
createJRadioButtonMenuItem	TokenNameIdentifier	 create J Radio Button Menu Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buttonGroup	TokenNameIdentifier	 button Group
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractButton	TokenNameIdentifier	 Abstract Button
)	TokenNameRPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
TYPE_CHECK	TokenNameIdentifier	 TYPE  CHECK
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
createJCheckBoxMenuItem	TokenNameIdentifier	 create J Check Box Menu Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
(	TokenNameLPAREN	
"Malformed resource"	TokenNameStringLiteral	Malformed resource
,	TokenNameCOMMA	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TYPE_SUFFIX	TokenNameIdentifier	 TYPE  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
item	TokenNameIdentifier	 item
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing menu * @param name the name of the menu bar in the resource bundle * @throws MissingResourceException if one of the keys that compose the * menu is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if a item action is not found in the * action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing menu @param name the name of the menu bar in the resource bundle @throws MissingResourceException if one of the keys that compose the menu is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if a item action is not found in the action map. 
public	TokenNamepublic	
JMenu	TokenNameIdentifier	 J Menu
createJMenu	TokenNameIdentifier	 create J Menu
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
createJMenu	TokenNameIdentifier	 create J Menu
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing menu * @param name the name of the menu bar in the resource bundle * @param specialization the name of the specialization to look for * @throws MissingResourceException if one of the keys that compose the * menu is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if a item action is not found in the * action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing menu @param name the name of the menu bar in the resource bundle @param specialization the name of the specialization to look for @throws MissingResourceException if one of the keys that compose the menu is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if a item action is not found in the action map. 
public	TokenNamepublic	
JMenu	TokenNameIdentifier	 J Menu
createJMenu	TokenNameIdentifier	 create J Menu
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
JMenu	TokenNameIdentifier	 J Menu
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JMenu	TokenNameIdentifier	 J Menu
(	TokenNameLPAREN	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeJMenuItem	TokenNameIdentifier	 initialize J Menu Item
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
items	TokenNameIdentifier	 items
=	TokenNameEQUAL	
getSpecializedStringList	TokenNameIdentifier	 get Specialized String List
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
items	TokenNameIdentifier	 items
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
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createJMenuComponent	TokenNameIdentifier	 create J Menu Component
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing menu item * @param name the name of the menu item * @throws MissingResourceException if one of the keys that compose the * menu item is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if then item action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing menu item @param name the name of the menu item @throws MissingResourceException if one of the keys that compose the menu item is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if then item action is not found in the action map. 
public	TokenNamepublic	
JMenuItem	TokenNameIdentifier	 J Menu Item
createJMenuItem	TokenNameIdentifier	 create J Menu Item
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
createJMenuItem	TokenNameIdentifier	 create J Menu Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing menu item * @param name the name of the menu item * @param specialization the name of the specialization to look for * @throws MissingResourceException if one of the keys that compose the * menu item is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if then item action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing menu item @param name the name of the menu item @param specialization the name of the specialization to look for @throws MissingResourceException if one of the keys that compose the menu item is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if then item action is not found in the action map. 
public	TokenNamepublic	
JMenuItem	TokenNameIdentifier	 J Menu Item
createJMenuItem	TokenNameIdentifier	 create J Menu Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JMenuItem	TokenNameIdentifier	 J Menu Item
(	TokenNameLPAREN	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeJMenuItem	TokenNameIdentifier	 initialize J Menu Item
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing radio button menu item * @param name the name of the menu item * @throws MissingResourceException if one of the keys that compose the * menu item is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if then item action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing radio button menu item @param name the name of the menu item @throws MissingResourceException if one of the keys that compose the menu item is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if then item action is not found in the action map. 
public	TokenNamepublic	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
createJRadioButtonMenuItem	TokenNameIdentifier	 create J Radio Button Menu Item
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
createJRadioButtonMenuItem	TokenNameIdentifier	 create J Radio Button Menu Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing radio button menu item * @param name the name of the menu item * @param specialization the name of the specialization to look for * @throws MissingResourceException if one of the keys that compose the * menu item is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if then item action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing radio button menu item @param name the name of the menu item @param specialization the name of the specialization to look for @throws MissingResourceException if one of the keys that compose the menu item is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if then item action is not found in the action map. 
public	TokenNamepublic	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
createJRadioButtonMenuItem	TokenNameIdentifier	 create J Radio Button Menu Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
(	TokenNameLPAREN	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeJMenuItem	TokenNameIdentifier	 initialize J Menu Item
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// is the item selected? 	TokenNameCOMMENT_LINE	is the item selected? 
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
getSpecializedBoolean	TokenNameIdentifier	 get Specialized Boolean
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
SELECTED_SUFFIX	TokenNameIdentifier	 SELECTED  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing check box menu item * @param name the name of the menu item * @throws MissingResourceException if one of the keys that compose the * menu item is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if then item action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing check box menu item @param name the name of the menu item @throws MissingResourceException if one of the keys that compose the menu item is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if then item action is not found in the action map. 
public	TokenNamepublic	
JCheckBoxMenuItem	TokenNameIdentifier	 J Check Box Menu Item
createJCheckBoxMenuItem	TokenNameIdentifier	 create J Check Box Menu Item
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
createJCheckBoxMenuItem	TokenNameIdentifier	 create J Check Box Menu Item
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing check box menu item * @param name the name of the menu item * @param specialization the name of the specialization to look for * @throws MissingResourceException if one of the keys that compose the * menu item is missing. * It is not thrown if the mnemonic, the accelerator and the * action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if then item action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing check box menu item @param name the name of the menu item @param specialization the name of the specialization to look for @throws MissingResourceException if one of the keys that compose the menu item is missing. It is not thrown if the mnemonic, the accelerator and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if then item action is not found in the action map. 
public	TokenNamepublic	
JCheckBoxMenuItem	TokenNameIdentifier	 J Check Box Menu Item
createJCheckBoxMenuItem	TokenNameIdentifier	 create J Check Box Menu Item
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
throws	TokenNamethrows	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
,	TokenNameCOMMA	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
JCheckBoxMenuItem	TokenNameIdentifier	 J Check Box Menu Item
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JCheckBoxMenuItem	TokenNameIdentifier	 J Check Box Menu Item
(	TokenNameLPAREN	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeJMenuItem	TokenNameIdentifier	 initialize J Menu Item
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// is the item selected? 	TokenNameCOMMENT_LINE	is the item selected? 
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
getSpecializedBoolean	TokenNameIdentifier	 get Specialized Boolean
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
SELECTED_SUFFIX	TokenNameIdentifier	 SELECTED  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes a swing menu item * @param item the menu item to initialize * @param name the name of the menu item * @param specialization the name of the specialization to look for * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if then item action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Initializes a swing menu item @param item the menu item to initialize @param name the name of the menu item @param specialization the name of the specialization to look for @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if then item action is not found in the action map. 
protected	TokenNameprotected	
void	TokenNamevoid	
initializeJMenuItem	TokenNameIdentifier	 initialize J Menu Item
(	TokenNameLPAREN	
JMenuItem	TokenNameIdentifier	 J Menu Item
item	TokenNameIdentifier	 item
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
throws	TokenNamethrows	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
,	TokenNameCOMMA	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
{	TokenNameLBRACE	
// Action 	TokenNameCOMMENT_LINE	Action 
try	TokenNametry	
{	TokenNameLBRACE	
Action	TokenNameIdentifier	 Action
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
actions	TokenNameIdentifier	 actions
.	TokenNameDOT	
getAction	TokenNameIdentifier	 get Action
(	TokenNameLPAREN	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
ACTION_SUFFIX	TokenNameIdentifier	 ACTION  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
MissingListenerException	TokenNameIdentifier	 Missing Listener Exception
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
"Action"	TokenNameStringLiteral	Action
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
ACTION_SUFFIX	TokenNameIdentifier	 ACTION  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setAction	TokenNameIdentifier	 set Action
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
instanceof	TokenNameinstanceof	
JComponentModifier	TokenNameIdentifier	 J Component Modifier
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JComponentModifier	TokenNameIdentifier	 J Component Modifier
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
.	TokenNameDOT	
addJComponent	TokenNameIdentifier	 add J Component
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Icon 	TokenNameCOMMENT_LINE	Icon 
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
ICON_SUFFIX	TokenNameIdentifier	 ICON  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
actions	TokenNameIdentifier	 actions
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResource	TokenNameIdentifier	 get Resource
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setIcon	TokenNameIdentifier	 set Icon
(	TokenNameLPAREN	
new	TokenNamenew	
ImageIcon	TokenNameIdentifier	 Image Icon
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Mnemonic 	TokenNameCOMMENT_LINE	Mnemonic 
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
MNEMONIC_SUFFIX	TokenNameIdentifier	 MNEMONIC  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setMnemonic	TokenNameIdentifier	 set Mnemonic
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
(	TokenNameLPAREN	
"Malformed mnemonic"	TokenNameStringLiteral	Malformed mnemonic
,	TokenNameCOMMA	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
MNEMONIC_SUFFIX	TokenNameIdentifier	 MNEMONIC  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// Accelerator 	TokenNameCOMMENT_LINE	Accelerator 
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
instanceof	TokenNameinstanceof	
JMenu	TokenNameIdentifier	 J Menu
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
getSpecializedString	TokenNameIdentifier	 get Specialized String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
ACCELERATOR_SUFFIX	TokenNameIdentifier	 ACCELERATOR  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
KeyStroke	TokenNameIdentifier	 Key Stroke
ks	TokenNameIdentifier	 ks
=	TokenNameEQUAL	
KeyStroke	TokenNameIdentifier	 Key Stroke
.	TokenNameDOT	
getKeyStroke	TokenNameIdentifier	 get Key Stroke
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setAccelerator	TokenNameIdentifier	 set Accelerator
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ResourceFormatException	TokenNameIdentifier	 Resource Format Exception
(	TokenNameLPAREN	
"Malformed accelerator"	TokenNameStringLiteral	Malformed accelerator
,	TokenNameCOMMA	
bundle	TokenNameIdentifier	 bundle
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
ACCELERATOR_SUFFIX	TokenNameIdentifier	 ACCELERATOR  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// is the item enabled? 	TokenNameCOMMENT_LINE	is the item enabled? 
try	TokenNametry	
{	TokenNameLBRACE	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
setEnabled	TokenNameIdentifier	 set Enabled
(	TokenNameLPAREN	
getSpecializedBoolean	TokenNameIdentifier	 get Specialized Boolean
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
ENABLED_SUFFIX	TokenNameIdentifier	 ENABLED  SUFFIX
,	TokenNameCOMMA	
specialization	TokenNameIdentifier	 specialization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
