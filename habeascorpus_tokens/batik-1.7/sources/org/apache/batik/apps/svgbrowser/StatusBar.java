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
Dimension	TokenNameIdentifier	 Dimension
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
JLabel	TokenNameIdentifier	 J Label
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JPanel	TokenNameIdentifier	 J Panel
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
border	TokenNameIdentifier	 border
.	TokenNameDOT	
BevelBorder	TokenNameIdentifier	 Bevel Border
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
/** * This class represents a viewer status bar. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: StatusBar.java 592619 2007-11-07 05:47:24Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a viewer status bar. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: StatusBar.java 592619 2007-11-07 05:47:24Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
StatusBar	TokenNameIdentifier	 Status Bar
extends	TokenNameextends	
JPanel	TokenNameIdentifier	 J Panel
{	TokenNameLBRACE	
/** * The gui resources file name */	TokenNameCOMMENT_JAVADOC	 The gui resources file name 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
RESOURCES	TokenNameIdentifier	 RESOURCES
=	TokenNameEQUAL	
"org.apache.batik.apps.svgbrowser.resources.StatusBarMessages"	TokenNameStringLiteral	org.apache.batik.apps.svgbrowser.resources.StatusBarMessages
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
rManager	TokenNameIdentifier	 r Manager
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
rManager	TokenNameIdentifier	 r Manager
=	TokenNameEQUAL	
new	TokenNamenew	
ResourceManager	TokenNameIdentifier	 Resource Manager
(	TokenNameLPAREN	
bundle	TokenNameIdentifier	 bundle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The x position/width label. */	TokenNameCOMMENT_JAVADOC	 The x position/width label. 
protected	TokenNameprotected	
JLabel	TokenNameIdentifier	 J Label
xPosition	TokenNameIdentifier	 x Position
;	TokenNameSEMICOLON	
/** * The y position/height label. */	TokenNameCOMMENT_JAVADOC	 The y position/height label. 
protected	TokenNameprotected	
JLabel	TokenNameIdentifier	 J Label
yPosition	TokenNameIdentifier	 y Position
;	TokenNameSEMICOLON	
/** * The zoom label. */	TokenNameCOMMENT_JAVADOC	 The zoom label. 
protected	TokenNameprotected	
JLabel	TokenNameIdentifier	 J Label
zoom	TokenNameIdentifier	 zoom
;	TokenNameSEMICOLON	
/** * The message label */	TokenNameCOMMENT_JAVADOC	 The message label 
protected	TokenNameprotected	
JLabel	TokenNameIdentifier	 J Label
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
/** * The main message */	TokenNameCOMMENT_JAVADOC	 The main message 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
mainMessage	TokenNameIdentifier	 main Message
;	TokenNameSEMICOLON	
/** * The temporary message */	TokenNameCOMMENT_JAVADOC	 The temporary message 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
temporaryMessage	TokenNameIdentifier	 temporary Message
;	TokenNameSEMICOLON	
/** * The current display thread. */	TokenNameCOMMENT_JAVADOC	 The current display thread. 
protected	TokenNameprotected	
DisplayThread	TokenNameIdentifier	 Display Thread
displayThread	TokenNameIdentifier	 display Thread
;	TokenNameSEMICOLON	
/** * Creates a new status bar. */	TokenNameCOMMENT_JAVADOC	 Creates a new status bar. 
public	TokenNamepublic	
StatusBar	TokenNameIdentifier	 Status Bar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
BorderLayout	TokenNameIdentifier	 Border Layout
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPanel	TokenNameIdentifier	 J Panel
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
new	TokenNamenew	
BorderLayout	TokenNameIdentifier	 Border Layout
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"West"	TokenNameStringLiteral	West
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xPosition	TokenNameIdentifier	 x Position
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
BevelBorder	TokenNameIdentifier	 Bevel Border
bb	TokenNameIdentifier	 bb
;	TokenNameSEMICOLON	
bb	TokenNameIdentifier	 bb
=	TokenNameEQUAL	
new	TokenNamenew	
BevelBorder	TokenNameIdentifier	 Bevel Border
(	TokenNameLPAREN	
BevelBorder	TokenNameIdentifier	 Bevel Border
.	TokenNameDOT	
LOWERED	TokenNameIdentifier	 LOWERED
,	TokenNameCOMMA	
getBackground	TokenNameIdentifier	 get Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
brighter	TokenNameIdentifier	 brighter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
brighter	TokenNameIdentifier	 brighter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getBackground	TokenNameIdentifier	 get Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getBackground	TokenNameIdentifier	 get Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
darker	TokenNameIdentifier	 darker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
darker	TokenNameIdentifier	 darker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
getBackground	TokenNameIdentifier	 get Background
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xPosition	TokenNameIdentifier	 x Position
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xPosition	TokenNameIdentifier	 x Position
.	TokenNameDOT	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"West"	TokenNameStringLiteral	West
,	TokenNameCOMMA	
xPosition	TokenNameIdentifier	 x Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yPosition	TokenNameIdentifier	 y Position
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yPosition	TokenNameIdentifier	 y Position
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
yPosition	TokenNameIdentifier	 y Position
.	TokenNameDOT	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"Center"	TokenNameStringLiteral	Center
,	TokenNameCOMMA	
yPosition	TokenNameIdentifier	 y Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zoom	TokenNameIdentifier	 zoom
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zoom	TokenNameIdentifier	 zoom
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zoom	TokenNameIdentifier	 zoom
.	TokenNameDOT	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"East"	TokenNameStringLiteral	East
,	TokenNameCOMMA	
zoom	TokenNameIdentifier	 zoom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
JPanel	TokenNameIdentifier	 J Panel
(	TokenNameLPAREN	
new	TokenNamenew	
BorderLayout	TokenNameIdentifier	 Border Layout
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setMainMessage	TokenNameIdentifier	 set Main Message
(	TokenNameLPAREN	
rManager	TokenNameIdentifier	 r Manager
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"Panel.default_message"	TokenNameStringLiteral	Panel.default_message
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the x position. */	TokenNameCOMMENT_JAVADOC	 Sets the x position. 
public	TokenNamepublic	
void	TokenNamevoid	
setXPosition	TokenNameIdentifier	 set X Position
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xPosition	TokenNameIdentifier	 x Position
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"x: "	TokenNameStringLiteral	x: 
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the width. */	TokenNameCOMMENT_JAVADOC	 Sets the width. 
public	TokenNamepublic	
void	TokenNamevoid	
setWidth	TokenNameIdentifier	 set Width
(	TokenNameLPAREN	
float	TokenNamefloat	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xPosition	TokenNameIdentifier	 x Position
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
rManager	TokenNameIdentifier	 r Manager
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"Position.width_letters"	TokenNameStringLiteral	Position.width_letters
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
w	TokenNameIdentifier	 w
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the y position. */	TokenNameCOMMENT_JAVADOC	 Sets the y position. 
public	TokenNamepublic	
void	TokenNamevoid	
setYPosition	TokenNameIdentifier	 set Y Position
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yPosition	TokenNameIdentifier	 y Position
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"y: "	TokenNameStringLiteral	y: 
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the height. */	TokenNameCOMMENT_JAVADOC	 Sets the height. 
public	TokenNamepublic	
void	TokenNamevoid	
setHeight	TokenNameIdentifier	 set Height
(	TokenNameLPAREN	
float	TokenNamefloat	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yPosition	TokenNameIdentifier	 y Position
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
rManager	TokenNameIdentifier	 r Manager
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"Position.height_letters"	TokenNameStringLiteral	Position.height_letters
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the zoom factor. */	TokenNameCOMMENT_JAVADOC	 Sets the zoom factor. 
public	TokenNamepublic	
void	TokenNamevoid	
setZoom	TokenNameIdentifier	 set Zoom
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
-	TokenNameMINUS	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
zoom	TokenNameIdentifier	 zoom
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"1:1"	TokenNameStringLiteral	1:1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
zoom	TokenNameIdentifier	 zoom
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
"1:"	TokenNameStringLiteral	1:
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
zoom	TokenNameIdentifier	 zoom
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
":1"	TokenNameStringLiteral	:1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets a temporary message * @param s the message */	TokenNameCOMMENT_JAVADOC	 Sets a temporary message @param s the message 
public	TokenNamepublic	
void	TokenNamevoid	
setMessage	TokenNameIdentifier	 set Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getPreferredSize	TokenNameIdentifier	 get Preferred Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
displayThread	TokenNameIdentifier	 display Thread
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
displayThread	TokenNameIdentifier	 display Thread
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
temporaryMessage	TokenNameIdentifier	 temporary Message
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
displayThread	TokenNameIdentifier	 display Thread
;	TokenNameSEMICOLON	
displayThread	TokenNameIdentifier	 display Thread
=	TokenNameEQUAL	
new	TokenNamenew	
DisplayThread	TokenNameIdentifier	 Display Thread
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
displayThread	TokenNameIdentifier	 display Thread
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the main message * @param s the message */	TokenNameCOMMENT_JAVADOC	 Sets the main message @param s the message 
public	TokenNamepublic	
void	TokenNamevoid	
setMainMessage	TokenNameIdentifier	 set Main Message
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mainMessage	TokenNameIdentifier	 main Message
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
mainMessage	TokenNameIdentifier	 main Message
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
displayThread	TokenNameIdentifier	 display Thread
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
displayThread	TokenNameIdentifier	 display Thread
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
displayThread	TokenNameIdentifier	 display Thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
getPreferredSize	TokenNameIdentifier	 get Preferred Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To display the main message */	TokenNameCOMMENT_JAVADOC	 To display the main message 
protected	TokenNameprotected	
class	TokenNameclass	
DisplayThread	TokenNameIdentifier	 Display Thread
extends	TokenNameextends	
Thread	TokenNameIdentifier	 Thread
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
DEFAULT_DURATION	TokenNameIdentifier	 DEFAULT  DURATION
=	TokenNameEQUAL	
5000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
long	TokenNamelong	
duration	TokenNameIdentifier	 duration
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
toJoin	TokenNameIdentifier	 to Join
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DisplayThread	TokenNameIdentifier	 Display Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_DURATION	TokenNameIdentifier	 DEFAULT  DURATION
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DisplayThread	TokenNameIdentifier	 Display Thread
(	TokenNameLPAREN	
long	TokenNamelong	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DisplayThread	TokenNameIdentifier	 Display Thread
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
toJoin	TokenNameIdentifier	 to Join
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
DEFAULT_DURATION	TokenNameIdentifier	 DEFAULT  DURATION
,	TokenNameCOMMA	
toJoin	TokenNameIdentifier	 to Join
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
DisplayThread	TokenNameIdentifier	 Display Thread
(	TokenNameLPAREN	
long	TokenNamelong	
duration	TokenNameIdentifier	 duration
,	TokenNameCOMMA	
Thread	TokenNameIdentifier	 Thread
toJoin	TokenNameIdentifier	 to Join
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
duration	TokenNameIdentifier	 duration
=	TokenNameEQUAL	
duration	TokenNameIdentifier	 duration
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
toJoin	TokenNameIdentifier	 to Join
=	TokenNameEQUAL	
toJoin	TokenNameIdentifier	 to Join
;	TokenNameSEMICOLON	
setPriority	TokenNameIdentifier	 set Priority
(	TokenNameLPAREN	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
MIN_PRIORITY	TokenNameIdentifier	 MIN  PRIORITY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
duration	TokenNameIdentifier	 duration
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
notifyAll	TokenNameIdentifier	 notify All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toJoin	TokenNameIdentifier	 to Join
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
toJoin	TokenNameIdentifier	 to Join
.	TokenNameDOT	
isAlive	TokenNameIdentifier	 is Alive
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
toJoin	TokenNameIdentifier	 to Join
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
toJoin	TokenNameIdentifier	 to Join
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
temporaryMessage	TokenNameIdentifier	 temporary Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
lTime	TokenNameIdentifier	 l Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
duration	TokenNameIdentifier	 duration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
long	TokenNamelong	
cTime	TokenNameIdentifier	 c Time
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
duration	TokenNameIdentifier	 duration
-=	TokenNameMINUS_EQUAL	
(	TokenNameLPAREN	
cTime	TokenNameIdentifier	 c Time
-	TokenNameMINUS	
lTime	TokenNameIdentifier	 l Time
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lTime	TokenNameIdentifier	 l Time
=	TokenNameEQUAL	
cTime	TokenNameIdentifier	 c Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
mainMessage	TokenNameIdentifier	 main Message
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
