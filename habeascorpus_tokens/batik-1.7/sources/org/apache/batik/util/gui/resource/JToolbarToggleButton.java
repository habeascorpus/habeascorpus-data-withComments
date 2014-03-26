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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Insets	TokenNameIdentifier	 Insets
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseAdapter	TokenNameIdentifier	 Mouse Adapter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
event	TokenNameIdentifier	 event
.	TokenNameDOT	
MouseEvent	TokenNameIdentifier	 Mouse Event
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JToggleButton	TokenNameIdentifier	 J Toggle Button
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
UIManager	TokenNameIdentifier	 UI Manager
;	TokenNameSEMICOLON	
/** * This class represents the buttons used in toolbars. * * @version $Id: JToolbarButton.java 498555 2007-01-22 08:09:33Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents the buttons used in toolbars. * @version $Id: JToolbarButton.java 498555 2007-01-22 08:09:33Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
JToolbarToggleButton	TokenNameIdentifier	 J Toolbar Toggle Button
extends	TokenNameextends	
JToggleButton	TokenNameIdentifier	 J Toggle Button
{	TokenNameLBRACE	
/** * Creates a new toolbar button. */	TokenNameCOMMENT_JAVADOC	 Creates a new toolbar button. 
public	TokenNamepublic	
JToolbarToggleButton	TokenNameIdentifier	 J Toolbar Toggle Button
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new toolbar button. * @param txt The button text. */	TokenNameCOMMENT_JAVADOC	 Creates a new toolbar button. @param txt The button text. 
public	TokenNamepublic	
JToolbarToggleButton	TokenNameIdentifier	 J Toolbar Toggle Button
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
txt	TokenNameIdentifier	 txt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
txt	TokenNameIdentifier	 txt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the button. */	TokenNameCOMMENT_JAVADOC	 Initializes the button. 
protected	TokenNameprotected	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"java.version"	TokenNameStringLiteral	java.version
)	TokenNameRPAREN	
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"1.3"	TokenNameStringLiteral	1.3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setOpaque	TokenNameIdentifier	 set Opaque
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setBackground	TokenNameIdentifier	 set Background
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setBorderPainted	TokenNameIdentifier	 set Border Painted
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMargin	TokenNameIdentifier	 set Margin
(	TokenNameLPAREN	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Windows XP look and feel seems to have a bug due to which the 	TokenNameCOMMENT_LINE	Windows XP look and feel seems to have a bug due to which the 
// size of the parent container changes when the border painted 	TokenNameCOMMENT_LINE	size of the parent container changes when the border painted 
// property is set. Temporary fix: disable mouseover behavior if 	TokenNameCOMMENT_LINE	property is set. Temporary fix: disable mouseover behavior if 
// installed lnf is Windows XP 	TokenNameCOMMENT_LINE	installed lnf is Windows XP 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
UIManager	TokenNameIdentifier	 UI Manager
.	TokenNameDOT	
getLookAndFeel	TokenNameIdentifier	 get Look And Feel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"Windows"	TokenNameStringLiteral	Windows
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addMouseListener	TokenNameIdentifier	 add Mouse Listener
(	TokenNameLPAREN	
new	TokenNamenew	
MouseListener	TokenNameIdentifier	 Mouse Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To manage the mouse interactions. */	TokenNameCOMMENT_JAVADOC	 To manage the mouse interactions. 
protected	TokenNameprotected	
class	TokenNameclass	
MouseListener	TokenNameIdentifier	 Mouse Listener
extends	TokenNameextends	
MouseAdapter	TokenNameIdentifier	 Mouse Adapter
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mouseEntered	TokenNameIdentifier	 mouse Entered
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setBorderPainted	TokenNameIdentifier	 set Border Painted
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mouseExited	TokenNameIdentifier	 mouse Exited
(	TokenNameLPAREN	
MouseEvent	TokenNameIdentifier	 Mouse Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setBorderPainted	TokenNameIdentifier	 set Border Painted
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
