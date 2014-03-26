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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
BorderLayout	TokenNameIdentifier	 Border Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Component	TokenNameIdentifier	 Component
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
FlowLayout	TokenNameIdentifier	 Flow Layout
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
LayoutManager	TokenNameIdentifier	 Layout Manager
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
AbstractAction	TokenNameIdentifier	 Abstract Action
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JPanel	TokenNameIdentifier	 J Panel
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
/** * This class represents a panel to present users with options. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: OptionPanel.java 592619 2007-11-07 05:47:24Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a panel to present users with options. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: OptionPanel.java 592619 2007-11-07 05:47:24Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
OptionPanel	TokenNameIdentifier	 Option Panel
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
{	TokenNameLBRACE	
/** * The gui resources file name */	TokenNameCOMMENT_JAVADOC	 The gui resources file name 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESOURCES	TokenNameIdentifier	 RESOURCES
=	TokenNameEQUAL	
"org.apache.batik.apps.svgbrowser.resources.GUI"	TokenNameStringLiteral	org.apache.batik.apps.svgbrowser.resources.GUI
;	TokenNameSEMICOLON	
/** * The resource bundle */	TokenNameCOMMENT_JAVADOC	 The resource bundle 
protected	TokenNameprotected	
static	TokenNamestatic	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
bundle	TokenNameIdentifier	 bundle
;	TokenNameSEMICOLON	
/** * The resource manager */	TokenNameCOMMENT_JAVADOC	 The resource manager 
protected	TokenNameprotected	
static	TokenNamestatic	
ResourceManager	TokenNameIdentifier	 Resource Manager
resources	TokenNameIdentifier	 resources
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
bundle	TokenNameIdentifier	 bundle
=	TokenNameEQUAL	
ResourceBundle	TokenNameIdentifier	 Resource Bundle
.	TokenNameDOT	
getBundle	TokenNameIdentifier	 get Bundle
(	TokenNameLPAREN	
RESOURCES	TokenNameIdentifier	 RESOURCES
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
getDefault	TokenNameIdentifier	 get Default
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceManager	TokenNameIdentifier	 Resource Manager
(	TokenNameLPAREN	
bundle	TokenNameIdentifier	 bundle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new panel. */	TokenNameCOMMENT_JAVADOC	 Creates a new panel. 
public	TokenNamepublic	
OptionPanel	TokenNameIdentifier	 Option Panel
(	TokenNameLPAREN	
LayoutManager	TokenNameIdentifier	 Layout Manager
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
layout	TokenNameIdentifier	 layout
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class is modal dialog to choose the jpeg encoding quality. */	TokenNameCOMMENT_JAVADOC	 This class is modal dialog to choose the jpeg encoding quality. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Dialog	TokenNameIdentifier	 Dialog
extends	TokenNameextends	
JDialog	TokenNameIdentifier	 J Dialog
{	TokenNameLBRACE	
/** * The 'ok' button. */	TokenNameCOMMENT_JAVADOC	 The 'ok' button. 
protected	TokenNameprotected	
JButton	TokenNameIdentifier	 J Button
ok	TokenNameIdentifier	 ok
;	TokenNameSEMICOLON	
/** * The 'ok' button. */	TokenNameCOMMENT_JAVADOC	 The 'ok' button. 
protected	TokenNameprotected	
JPanel	TokenNameIdentifier	 J Panel
panel	TokenNameIdentifier	 panel
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Dialog	TokenNameIdentifier	 Dialog
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
JPanel	TokenNameIdentifier	 J Panel
panel	TokenNameIdentifier	 panel
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
JOptionPane	TokenNameIdentifier	 J Option Pane
.	TokenNameDOT	
getFrameForComponent	TokenNameIdentifier	 get Frame For Component
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
,	TokenNameCOMMA	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setModal	TokenNameIdentifier	 set Modal
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
panel	TokenNameIdentifier	 panel
=	TokenNameEQUAL	
panel	TokenNameIdentifier	 panel
;	TokenNameSEMICOLON	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
panel	TokenNameIdentifier	 panel
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getContentPane	TokenNameIdentifier	 get Content Pane
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
createButtonPanel	TokenNameIdentifier	 create Button Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
SOUTH	TokenNameIdentifier	 SOUTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates the button panel. */	TokenNameCOMMENT_JAVADOC	 Creates the button panel. 
protected	TokenNameprotected	
JPanel	TokenNameIdentifier	 J Panel
createButtonPanel	TokenNameIdentifier	 create Button Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JPanel	TokenNameIdentifier	 J Panel
panel	TokenNameIdentifier	 panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
new	TokenNamenew	
FlowLayout	TokenNameIdentifier	 Flow Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ok	TokenNameIdentifier	 ok
=	TokenNameEQUAL	
new	TokenNamenew	
JButton	TokenNameIdentifier	 J Button
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"OKButton.text"	TokenNameStringLiteral	OKButton.text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ok	TokenNameIdentifier	 ok
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
new	TokenNamenew	
OKButtonAction	TokenNameIdentifier	 OK Button Action
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ok	TokenNameIdentifier	 ok
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
panel	TokenNameIdentifier	 panel
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The action associated to the 'ok' button. */	TokenNameCOMMENT_JAVADOC	 The action associated to the 'ok' button. 
protected	TokenNameprotected	
class	TokenNameclass	
OKButtonAction	TokenNameIdentifier	 OK Button Action
extends	TokenNameextends	
AbstractAction	TokenNameIdentifier	 Abstract Action
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
evt	TokenNameIdentifier	 evt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
