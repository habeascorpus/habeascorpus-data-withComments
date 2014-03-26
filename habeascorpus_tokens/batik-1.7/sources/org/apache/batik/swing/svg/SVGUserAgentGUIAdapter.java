/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JDialog	TokenNameIdentifier	 J Dialog
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JOptionPane	TokenNameIdentifier	 J Option Pane
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
gui	TokenNameIdentifier	 gui
.	TokenNameDOT	
JErrorPane	TokenNameIdentifier	 J Error Pane
;	TokenNameSEMICOLON	
/** * One line Class Desc * * Methods users may want to implement: * displayMessage * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: SVGUserAgentGUIAdapter.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 One line Class Desc * Methods users may want to implement: displayMessage * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: SVGUserAgentGUIAdapter.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGUserAgentGUIAdapter	TokenNameIdentifier	 SVG User Agent GUI Adapter
extends	TokenNameextends	
SVGUserAgentAdapter	TokenNameIdentifier	 SVG User Agent Adapter
{	TokenNameLBRACE	
public	TokenNamepublic	
Component	TokenNameIdentifier	 Component
parentComponent	TokenNameIdentifier	 parent Component
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SVGUserAgentGUIAdapter	TokenNameIdentifier	 SVG User Agent GUI Adapter
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
parentComponent	TokenNameIdentifier	 parent Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parentComponent	TokenNameIdentifier	 parent Component
=	TokenNameEQUAL	
parentComponent	TokenNameIdentifier	 parent Component
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Displays an error message. */	TokenNameCOMMENT_JAVADOC	 Displays an error message. 
public	TokenNamepublic	
void	TokenNamevoid	
displayError	TokenNameIdentifier	 display Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JOptionPane	TokenNameIdentifier	 J Option Pane
pane	TokenNameIdentifier	 pane
=	TokenNameEQUAL	
new	TokenNamenew	
JOptionPane	TokenNameIdentifier	 J Option Pane
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
ERROR_MESSAGE	TokenNameIdentifier	 ERROR  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JDialog	TokenNameIdentifier	 J Dialog
dialog	TokenNameIdentifier	 dialog
=	TokenNameEQUAL	
pane	TokenNameIdentifier	 pane
.	TokenNameDOT	
createDialog	TokenNameIdentifier	 create Dialog
(	TokenNameLPAREN	
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
"ERROR"	TokenNameStringLiteral	ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dialog	TokenNameIdentifier	 dialog
.	TokenNameDOT	
setModal	TokenNameIdentifier	 set Modal
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dialog	TokenNameIdentifier	 dialog
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Displays an error resulting from the specified Exception. */	TokenNameCOMMENT_JAVADOC	 Displays an error resulting from the specified Exception. 
public	TokenNamepublic	
void	TokenNamevoid	
displayError	TokenNameIdentifier	 display Error
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JErrorPane	TokenNameIdentifier	 J Error Pane
pane	TokenNameIdentifier	 pane
=	TokenNameEQUAL	
new	TokenNamenew	
JErrorPane	TokenNameIdentifier	 J Error Pane
(	TokenNameLPAREN	
ex	TokenNameIdentifier	 ex
,	TokenNameCOMMA	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
ERROR_MESSAGE	TokenNameIdentifier	 ERROR  MESSAGE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JDialog	TokenNameIdentifier	 J Dialog
dialog	TokenNameIdentifier	 dialog
=	TokenNameEQUAL	
pane	TokenNameIdentifier	 pane
.	TokenNameDOT	
createDialog	TokenNameIdentifier	 create Dialog
(	TokenNameLPAREN	
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
"ERROR"	TokenNameStringLiteral	ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dialog	TokenNameIdentifier	 dialog
.	TokenNameDOT	
setModal	TokenNameIdentifier	 set Modal
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dialog	TokenNameIdentifier	 dialog
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Displays a message in the User Agent interface. * The given message is typically displayed in a status bar. */	TokenNameCOMMENT_JAVADOC	 Displays a message in the User Agent interface. The given message is typically displayed in a status bar. 
public	TokenNamepublic	
void	TokenNamevoid	
displayMessage	TokenNameIdentifier	 display Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Can't do anything don't have a status bar... 	TokenNameCOMMENT_LINE	Can't do anything don't have a status bar... 
}	TokenNameRBRACE	
/** * Shows an alert dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows an alert dialog box. 
public	TokenNamepublic	
void	TokenNamevoid	
showAlert	TokenNameIdentifier	 show Alert
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"Script alert: "	TokenNameStringLiteral	Script alert: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showMessageDialog	TokenNameIdentifier	 show Message Dialog
(	TokenNameLPAREN	
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a prompt dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a prompt dialog box. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
showPrompt	TokenNameIdentifier	 show Prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"Script prompt: "	TokenNameStringLiteral	Script prompt: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
return	TokenNamereturn	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showInputDialog	TokenNameIdentifier	 show Input Dialog
(	TokenNameLPAREN	
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a prompt dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a prompt dialog box. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
showPrompt	TokenNameIdentifier	 show Prompt
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"Script prompt: "	TokenNameStringLiteral	Script prompt: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showInputDialog	TokenNameIdentifier	 show Input Dialog
(	TokenNameLPAREN	
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
PLAIN_MESSAGE	TokenNameIdentifier	 PLAIN  MESSAGE
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
defaultValue	TokenNameIdentifier	 default Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a confirm dialog box. */	TokenNameCOMMENT_JAVADOC	 Shows a confirm dialog box. 
public	TokenNamepublic	
boolean	TokenNameboolean	
showConfirm	TokenNameIdentifier	 show Confirm
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
"Script confirm: "	TokenNameStringLiteral	Script confirm: 
+	TokenNamePLUS	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
return	TokenNamereturn	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
showConfirmDialog	TokenNameIdentifier	 show Confirm Dialog
(	TokenNameLPAREN	
parentComponent	TokenNameIdentifier	 parent Component
,	TokenNameCOMMA	
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
"Confirm"	TokenNameStringLiteral	Confirm
,	TokenNameCOMMA	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
YES_NO_OPTION	TokenNameIdentifier	 YES  NO  OPTION
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
YES_OPTION	TokenNameIdentifier	 YES  OPTION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
