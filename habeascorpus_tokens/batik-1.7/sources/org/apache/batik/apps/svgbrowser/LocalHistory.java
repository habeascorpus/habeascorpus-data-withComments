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
List	TokenNameIdentifier	 List
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
/** * This class represents an history of the files visited by a single * browser frame. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: LocalHistory.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents an history of the files visited by a single browser frame. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: LocalHistory.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
LocalHistory	TokenNameIdentifier	 Local History
{	TokenNameLBRACE	
/** * The frame to manage. */	TokenNameCOMMENT_JAVADOC	 The frame to manage. 
protected	TokenNameprotected	
JSVGViewerFrame	TokenNameIdentifier	 JSVG Viewer Frame
svgFrame	TokenNameIdentifier	 svg Frame
;	TokenNameSEMICOLON	
/** * The menu which contains the history. */	TokenNameCOMMENT_JAVADOC	 The menu which contains the history. 
protected	TokenNameprotected	
JMenu	TokenNameIdentifier	 J Menu
menu	TokenNameIdentifier	 menu
;	TokenNameSEMICOLON	
/** * The index of the first history item in this menu. */	TokenNameCOMMENT_JAVADOC	 The index of the first history item in this menu. 
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * The visited URIs. */	TokenNameCOMMENT_JAVADOC	 The visited URIs. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
visitedURIs	TokenNameIdentifier	 visited UR Is
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The index of the current URI. */	TokenNameCOMMENT_JAVADOC	 The index of the current URI. 
protected	TokenNameprotected	
int	TokenNameint	
currentURI	TokenNameIdentifier	 current URI
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The button group for the menu items. */	TokenNameCOMMENT_JAVADOC	 The button group for the menu items. 
protected	TokenNameprotected	
ButtonGroup	TokenNameIdentifier	 Button Group
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
new	TokenNamenew	
ButtonGroup	TokenNameIdentifier	 Button Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The action listener. */	TokenNameCOMMENT_JAVADOC	 The action listener. 
protected	TokenNameprotected	
ActionListener	TokenNameIdentifier	 Action Listener
actionListener	TokenNameIdentifier	 action Listener
=	TokenNameEQUAL	
new	TokenNamenew	
RadioListener	TokenNameIdentifier	 Radio Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The current state. */	TokenNameCOMMENT_JAVADOC	 The current state. 
protected	TokenNameprotected	
int	TokenNameint	
state	TokenNameIdentifier	 state
;	TokenNameSEMICOLON	
// States 	TokenNameCOMMENT_LINE	States 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
STABLE_STATE	TokenNameIdentifier	 STABLE  STATE
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BACK_PENDING_STATE	TokenNameIdentifier	 BACK  PENDING  STATE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FORWARD_PENDING_STATE	TokenNameIdentifier	 FORWARD  PENDING  STATE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RELOAD_PENDING_STATE	TokenNameIdentifier	 RELOAD  PENDING  STATE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Creates a new local history. * @param mb The menubar used to display the history. It must * contain one '@@@' item used as marker to place the * history items. * @param svgFrame The frame to manage. */	TokenNameCOMMENT_JAVADOC	 Creates a new local history. @param mb The menubar used to display the history. It must contain one '@@@' item used as marker to place the history items. @param svgFrame The frame to manage. 
public	TokenNamepublic	
LocalHistory	TokenNameIdentifier	 Local History
(	TokenNameLPAREN	
JMenuBar	TokenNameIdentifier	 J Menu Bar
mb	TokenNameIdentifier	 mb
,	TokenNameCOMMA	
JSVGViewerFrame	TokenNameIdentifier	 JSVG Viewer Frame
svgFrame	TokenNameIdentifier	 svg Frame
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
svgFrame	TokenNameIdentifier	 svg Frame
=	TokenNameEQUAL	
svgFrame	TokenNameIdentifier	 svg Frame
;	TokenNameSEMICOLON	
// Find the marker. 	TokenNameCOMMENT_LINE	Find the marker. 
int	TokenNameint	
mc	TokenNameIdentifier	 mc
=	TokenNameEQUAL	
mb	TokenNameIdentifier	 mb
.	TokenNameDOT	
getMenuCount	TokenNameIdentifier	 get Menu Count
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
mc	TokenNameIdentifier	 mc
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenu	TokenNameIdentifier	 J Menu
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
mb	TokenNameIdentifier	 mb
.	TokenNameDOT	
getMenu	TokenNameIdentifier	 get Menu
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ic	TokenNameIdentifier	 ic
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getItemCount	TokenNameIdentifier	 get Item Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
ic	TokenNameIdentifier	 ic
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
"@@@"	TokenNameStringLiteral	@@@
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
menu	TokenNameIdentifier	 menu
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
m	TokenNameIdentifier	 m
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"No '@@@' marker found"	TokenNameStringLiteral	No '@@@' marker found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Goes back of one position in the history. * Assumes that <tt>canGoBack()</tt> is true. */	TokenNameCOMMENT_JAVADOC	 Goes back of one position in the history. Assumes that <tt>canGoBack()</tt> is true. 
public	TokenNamepublic	
void	TokenNamevoid	
back	TokenNameIdentifier	 back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
BACK_PENDING_STATE	TokenNameIdentifier	 BACK  PENDING  STATE
;	TokenNameSEMICOLON	
currentURI	TokenNameIdentifier	 current URI
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
svgFrame	TokenNameIdentifier	 svg Frame
.	TokenNameDOT	
showSVGDocument	TokenNameIdentifier	 show SVG Document
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentURI	TokenNameIdentifier	 current URI
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether it is possible to go back. */	TokenNameCOMMENT_JAVADOC	 Whether it is possible to go back. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canGoBack	TokenNameIdentifier	 can Go Back
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentURI	TokenNameIdentifier	 current URI
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Goes forward of one position in the history. * Assumes that <tt>canGoForward()</tt> is true. */	TokenNameCOMMENT_JAVADOC	 Goes forward of one position in the history. Assumes that <tt>canGoForward()</tt> is true. 
public	TokenNamepublic	
void	TokenNamevoid	
forward	TokenNameIdentifier	 forward
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
FORWARD_PENDING_STATE	TokenNameIdentifier	 FORWARD  PENDING  STATE
;	TokenNameSEMICOLON	
svgFrame	TokenNameIdentifier	 svg Frame
.	TokenNameDOT	
showSVGDocument	TokenNameIdentifier	 show SVG Document
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentURI	TokenNameIdentifier	 current URI
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether it is possible to go forward. */	TokenNameCOMMENT_JAVADOC	 Whether it is possible to go forward. 
public	TokenNamepublic	
boolean	TokenNameboolean	
canGoForward	TokenNameIdentifier	 can Go Forward
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentURI	TokenNameIdentifier	 current URI
<	TokenNameLESS	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Reloads the current document. */	TokenNameCOMMENT_JAVADOC	 Reloads the current document. 
public	TokenNamepublic	
void	TokenNamevoid	
reload	TokenNameIdentifier	 reload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
RELOAD_PENDING_STATE	TokenNameIdentifier	 RELOAD  PENDING  STATE
;	TokenNameSEMICOLON	
currentURI	TokenNameIdentifier	 current URI
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
svgFrame	TokenNameIdentifier	 svg Frame
.	TokenNameDOT	
showSVGDocument	TokenNameIdentifier	 show SVG Document
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentURI	TokenNameIdentifier	 current URI
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Updates the history. * @param uri The URI of the document just loaded. */	TokenNameCOMMENT_JAVADOC	 Updates the history. @param uri The URI of the document just loaded. 
public	TokenNamepublic	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentURI	TokenNameIdentifier	 current URI
<	TokenNameLESS	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Unexpected currentURI:"	TokenNameStringLiteral	Unexpected currentURI:
+	TokenNamePLUS	
currentURI	TokenNameIdentifier	 current URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
STABLE_STATE	TokenNameIdentifier	 STABLE  STATE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
currentURI	TokenNameIdentifier	 current URI
<	TokenNameLESS	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentURI	TokenNameIdentifier	 current URI
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
getItemCount	TokenNameIdentifier	 get Item Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
currentURI	TokenNameIdentifier	 current URI
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
visitedURIs	TokenNameIdentifier	 visited UR Is
=	TokenNameEQUAL	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentURI	TokenNameIdentifier	 current URI
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
currentURI	TokenNameIdentifier	 current URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
currentURI	TokenNameIdentifier	 current URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
currentURI	TokenNameIdentifier	 current URI
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
15	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JMenuItem	TokenNameIdentifier	 J Menu Item
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentURI	TokenNameIdentifier	 current URI
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
visitedURIs	TokenNameIdentifier	 visited UR Is
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Computes the button text. 	TokenNameCOMMENT_LINE	Computes the button text. 
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
JMenuItem	TokenNameIdentifier	 J Menu Item
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
new	TokenNamenew	
JRadioButtonMenuItem	TokenNameIdentifier	 J Radio Button Menu Item
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
setToolTipText	TokenNameIdentifier	 set Tool Tip Text
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
setActionCommand	TokenNameIdentifier	 set Action Command
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
addActionListener	TokenNameIdentifier	 add Action Listener
(	TokenNameLPAREN	
actionListener	TokenNameIdentifier	 action Listener
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
currentURI	TokenNameIdentifier	 current URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Updates the state of this history. */	TokenNameCOMMENT_JAVADOC	 Updates the state of this history. 
protected	TokenNameprotected	
void	TokenNamevoid	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
BACK_PENDING_STATE	TokenNameIdentifier	 BACK  PENDING  STATE
:	TokenNameCOLON	
currentURI	TokenNameIdentifier	 current URI
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RELOAD_PENDING_STATE	TokenNameIdentifier	 RELOAD  PENDING  STATE
:	TokenNameCOLON	
currentURI	TokenNameIdentifier	 current URI
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FORWARD_PENDING_STATE	TokenNameIdentifier	 FORWARD  PENDING  STATE
:	TokenNameCOLON	
// fall-through intended 	TokenNameCOMMENT_LINE	fall-through intended 
case	TokenNamecase	
STABLE_STATE	TokenNameIdentifier	 STABLE  STATE
:	TokenNameCOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To listen to the radio buttons. */	TokenNameCOMMENT_JAVADOC	 To listen to the radio buttons. 
protected	TokenNameprotected	
class	TokenNameclass	
RadioListener	TokenNameIdentifier	 Radio Listener
implements	TokenNameimplements	
ActionListener	TokenNameIdentifier	 Action Listener
{	TokenNameLBRACE	
protected	TokenNameprotected	
RadioListener	TokenNameIdentifier	 Radio Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
actionPerformed	TokenNameIdentifier	 action Performed
(	TokenNameLPAREN	
ActionEvent	TokenNameIdentifier	 Action Event
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getActionCommand	TokenNameIdentifier	 get Action Command
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentURI	TokenNameIdentifier	 current URI
=	TokenNameEQUAL	
getItemIndex	TokenNameIdentifier	 get Item Index
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JMenuItem	TokenNameIdentifier	 J Menu Item
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
svgFrame	TokenNameIdentifier	 svg Frame
.	TokenNameDOT	
showSVGDocument	TokenNameIdentifier	 show SVG Document
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getItemIndex	TokenNameIdentifier	 get Item Index
(	TokenNameLPAREN	
JMenuItem	TokenNameIdentifier	 J Menu Item
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ic	TokenNameIdentifier	 ic
=	TokenNameEQUAL	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
getItemCount	TokenNameIdentifier	 get Item Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ic	TokenNameIdentifier	 ic
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
menu	TokenNameIdentifier	 menu
.	TokenNameDOT	
getItem	TokenNameIdentifier	 get Item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"MenuItem is not from my menu!"	TokenNameStringLiteral	MenuItem is not from my menu!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
