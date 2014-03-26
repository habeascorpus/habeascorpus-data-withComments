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
ImageIcon	TokenNameIdentifier	 Image Icon
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
JCheckBox	TokenNameIdentifier	 J Check Box
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JRadioButton	TokenNameIdentifier	 J Radio Button
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JToggleButton	TokenNameIdentifier	 J Toggle Button
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
/** * This class represents a button factory which builds * buttons from the content of a resource bundle. <br> * * The resource entries format is (for a button named 'Button'):<br> * <pre> * Button.text = text * Button.icon = icon_name * Button.mnemonic = mnemonic * Button.action = action_name * Button.selected = true | false * Button.tooltip = tool tip text * where * text, icon_name and action_name are strings * mnemonic is a character * </pre> * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: ButtonFactory.java 594367 2007-11-13 00:40:53Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a button factory which builds buttons from the content of a resource bundle. <br> * The resource entries format is (for a button named 'Button'):<br> <pre> Button.text = text Button.icon = icon_name Button.mnemonic = mnemonic Button.action = action_name Button.selected = true | false Button.tooltip = tool tip text where text, icon_name and action_name are strings mnemonic is a character </pre> * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: ButtonFactory.java 594367 2007-11-13 00:40:53Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ButtonFactory	TokenNameIdentifier	 Button Factory
extends	TokenNameextends	
ResourceManager	TokenNameIdentifier	 Resource Manager
{	TokenNameLBRACE	
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ICON_SUFFIX	TokenNameIdentifier	 ICON  SUFFIX
=	TokenNameEQUAL	
".icon"	TokenNameStringLiteral	.icon
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
TOOLTIP_SUFFIX	TokenNameIdentifier	 TOOLTIP  SUFFIX
=	TokenNameEQUAL	
".tooltip"	TokenNameStringLiteral	.tooltip
;	TokenNameSEMICOLON	
/** The table which contains the actions */	TokenNameCOMMENT_JAVADOC	 The table which contains the actions 
private	TokenNameprivate	
ActionMap	TokenNameIdentifier	 Action Map
actions	TokenNameIdentifier	 actions
;	TokenNameSEMICOLON	
/** * Creates a new button factory * @param rb the resource bundle that contains the buttons * description. * @param am the actions to bind to the button */	TokenNameCOMMENT_JAVADOC	 Creates a new button factory @param rb the resource bundle that contains the buttons description. @param am the actions to bind to the button 
public	TokenNamepublic	
ButtonFactory	TokenNameIdentifier	 Button Factory
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
}	TokenNameRBRACE	
/** * Creates and returns a new swing button * @param name the name of the button in the resource bundle * @throws MissingResourceException if key is not the name of a button. * It is not thrown if the mnemonic and the action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character * @throws MissingListenerException if the button action is not found in * the action map */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing button @param name the name of the button in the resource bundle @throws MissingResourceException if key is not the name of a button. It is not thrown if the mnemonic and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character @throws MissingListenerException if the button action is not found in the action map 
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
JButton	TokenNameIdentifier	 J Button
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
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
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initializeButton	TokenNameIdentifier	 initialize Button
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing button initialised * to be used as a toolbar button * @param name the name of the button in the resource bundle * @throws MissingResourceException if key is not the name of a button. * It is not thrown if the mnemonic and the action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character * @throws MissingListenerException if the button action is not found in * the action map */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing button initialised to be used as a toolbar button @param name the name of the button in the resource bundle @throws MissingResourceException if key is not the name of a button. It is not thrown if the mnemonic and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character @throws MissingListenerException if the button action is not found in the action map 
public	TokenNamepublic	
JButton	TokenNameIdentifier	 J Button
createJToolbarButton	TokenNameIdentifier	 create J Toolbar Button
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
JButton	TokenNameIdentifier	 J Button
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JToolbarButton	TokenNameIdentifier	 J Toolbar Button
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
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
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JToolbarButton	TokenNameIdentifier	 J Toolbar Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initializeButton	TokenNameIdentifier	 initialize Button
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing button initialised * to be used as a toolbar toggle button * @param name the name of the button in the resource bundle * @throws MissingResourceException if key is not the name of a button. * It is not thrown if the mnemonic and the action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character * @throws MissingListenerException if the button action is not found in * the action map */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing button initialised to be used as a toolbar toggle button @param name the name of the button in the resource bundle @throws MissingResourceException if key is not the name of a button. It is not thrown if the mnemonic and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character @throws MissingListenerException if the button action is not found in the action map 
public	TokenNamepublic	
JToggleButton	TokenNameIdentifier	 J Toggle Button
createJToolbarToggleButton	TokenNameIdentifier	 create J Toolbar Toggle Button
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
JToggleButton	TokenNameIdentifier	 J Toggle Button
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JToolbarToggleButton	TokenNameIdentifier	 J Toolbar Toggle Button
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
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
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JToolbarToggleButton	TokenNameIdentifier	 J Toolbar Toggle Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initializeButton	TokenNameIdentifier	 initialize Button
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a new swing radio button * @param name the name of the button in the resource bundle * @throws MissingResourceException if key is not the name of a button. * It is not thrown if the mnemonic and the action keys are * missing. * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if the button action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing radio button @param name the name of the button in the resource bundle @throws MissingResourceException if key is not the name of a button. It is not thrown if the mnemonic and the action keys are missing. @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if the button action is not found in the action map. 
public	TokenNamepublic	
JRadioButton	TokenNameIdentifier	 J Radio Button
createJRadioButton	TokenNameIdentifier	 create J Radio Button
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
JRadioButton	TokenNameIdentifier	 J Radio Button
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JRadioButton	TokenNameIdentifier	 J Radio Button
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeButton	TokenNameIdentifier	 initialize Button
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// is the button selected? 	TokenNameCOMMENT_LINE	is the button selected? 
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
SELECTED_SUFFIX	TokenNameIdentifier	 SELECTED  SUFFIX
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
/** * Creates and returns a new swing check box * @param name the name of the button in the resource bundle * @throws MissingResourceException if key is not the name of a button. * It is not thrown if the mnemonic and the action keys are missing * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if the button action is not found in * the action map. */	TokenNameCOMMENT_JAVADOC	 Creates and returns a new swing check box @param name the name of the button in the resource bundle @throws MissingResourceException if key is not the name of a button. It is not thrown if the mnemonic and the action keys are missing @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if the button action is not found in the action map. 
public	TokenNamepublic	
JCheckBox	TokenNameIdentifier	 J Check Box
createJCheckBox	TokenNameIdentifier	 create J Check Box
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
JCheckBox	TokenNameIdentifier	 J Check Box
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
JCheckBox	TokenNameIdentifier	 J Check Box
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeButton	TokenNameIdentifier	 initialize Button
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// is the button selected? 	TokenNameCOMMENT_LINE	is the button selected? 
try	TokenNametry	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
SELECTED_SUFFIX	TokenNameIdentifier	 SELECTED  SUFFIX
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
/** * Initializes a button * @param b the button to initialize * @param name the button's name * @throws ResourceFormatException if the mnemonic is not a single * character. * @throws MissingListenerException if the button action is not found * in the action map. */	TokenNameCOMMENT_JAVADOC	 Initializes a button @param b the button to initialize @param name the button's name @throws ResourceFormatException if the mnemonic is not a single character. @throws MissingListenerException if the button action is not found in the action map. 
private	TokenNameprivate	
void	TokenNamevoid	
initializeButton	TokenNameIdentifier	 initialize Button
(	TokenNameLPAREN	
AbstractButton	TokenNameIdentifier	 Abstract Button
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
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
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
ACTION_SUFFIX	TokenNameIdentifier	 ACTION  SUFFIX
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
b	TokenNameIdentifier	 b
.	TokenNameDOT	
setAction	TokenNameIdentifier	 set Action
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TEXT_SUFFIX	TokenNameIdentifier	 TEXT  SUFFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MissingResourceException	TokenNameIdentifier	 Missing Resource Exception
mre	TokenNameIdentifier	 mre
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// not all buttons have text defined so just 	TokenNameCOMMENT_LINE	not all buttons have text defined so just 
// ignore this exception. 	TokenNameCOMMENT_LINE	ignore this exception. 
}	TokenNameRBRACE	
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
b	TokenNameIdentifier	 b
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
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
ICON_SUFFIX	TokenNameIdentifier	 ICON  SUFFIX
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
b	TokenNameIdentifier	 b
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
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
MNEMONIC_SUFFIX	TokenNameIdentifier	 MNEMONIC  SUFFIX
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
b	TokenNameIdentifier	 b
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
// ToolTip 	TokenNameCOMMENT_LINE	ToolTip 
try	TokenNametry	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
TOOLTIP_SUFFIX	TokenNameIdentifier	 TOOLTIP  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
setToolTipText	TokenNameIdentifier	 set Tool Tip Text
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
