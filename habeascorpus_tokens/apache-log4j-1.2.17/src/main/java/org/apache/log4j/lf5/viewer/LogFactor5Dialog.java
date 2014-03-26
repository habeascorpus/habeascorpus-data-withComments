/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
log4j	TokenNameIdentifier	 log4j
.	TokenNameDOT	
lf5	TokenNameIdentifier	 lf5
.	TokenNameDOT	
viewer	TokenNameIdentifier	 viewer
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
Container	TokenNameIdentifier	 Container
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Font	TokenNameIdentifier	 Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
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
Label	TokenNameIdentifier	 Label
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Toolkit	TokenNameIdentifier	 Toolkit
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Window	TokenNameIdentifier	 Window
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
JFrame	TokenNameIdentifier	 J Frame
;	TokenNameSEMICOLON	
/** * LogFactor5Dialog * * @author Richard Hurst * @author Brad Marlborough */	TokenNameCOMMENT_JAVADOC	 LogFactor5Dialog * @author Richard Hurst @author Brad Marlborough 
// Contributed by ThoughtWorks Inc. 	TokenNameCOMMENT_LINE	Contributed by ThoughtWorks Inc. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LogFactor5Dialog	TokenNameIdentifier	 Log Factor5 Dialog
extends	TokenNameextends	
JDialog	TokenNameIdentifier	 J Dialog
{	TokenNameLBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constants: 	TokenNameCOMMENT_LINE	Constants: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
Font	TokenNameIdentifier	 Font
DISPLAY_FONT	TokenNameIdentifier	 DISPLAY  FONT
=	TokenNameEQUAL	
new	TokenNamenew	
Font	TokenNameIdentifier	 Font
(	TokenNameLPAREN	
"Arial"	TokenNameStringLiteral	Arial
,	TokenNameCOMMA	
Font	TokenNameIdentifier	 Font
.	TokenNameDOT	
BOLD	TokenNameIdentifier	 BOLD
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Variables: 	TokenNameCOMMENT_LINE	Protected Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Variables: 	TokenNameCOMMENT_LINE	Private Variables: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Constructors: 	TokenNameCOMMENT_LINE	Constructors: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
LogFactor5Dialog	TokenNameIdentifier	 Log Factor5 Dialog
(	TokenNameLPAREN	
JFrame	TokenNameIdentifier	 J Frame
jframe	TokenNameIdentifier	 jframe
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
boolean	TokenNameboolean	
modal	TokenNameIdentifier	 modal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
jframe	TokenNameIdentifier	 jframe
,	TokenNameCOMMA	
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
modal	TokenNameIdentifier	 modal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Public Methods: 	TokenNameCOMMENT_LINE	Public Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
public	TokenNamepublic	
void	TokenNamevoid	
show	TokenNameIdentifier	 show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pack	TokenNameIdentifier	 pack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minimumSizeDialog	TokenNameIdentifier	 minimum Size Dialog
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
centerWindow	TokenNameIdentifier	 center Window
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
show	TokenNameIdentifier	 show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Protected Methods: 	TokenNameCOMMENT_LINE	Protected Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Private Methods: 	TokenNameCOMMENT_LINE	Private Methods: 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
protected	TokenNameprotected	
void	TokenNamevoid	
centerWindow	TokenNameIdentifier	 center Window
(	TokenNameLPAREN	
Window	TokenNameIdentifier	 Window
win	TokenNameIdentifier	 win
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dimension	TokenNameIdentifier	 Dimension
screenDim	TokenNameIdentifier	 screen Dim
=	TokenNameEQUAL	
Toolkit	TokenNameIdentifier	 Toolkit
.	TokenNameDOT	
getDefaultToolkit	TokenNameIdentifier	 get Default Toolkit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getScreenSize	TokenNameIdentifier	 get Screen Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If larger than screen, reduce window width or height 	TokenNameCOMMENT_LINE	If larger than screen, reduce window width or height 
if	TokenNameif	
(	TokenNameLPAREN	
screenDim	TokenNameIdentifier	 screen Dim
.	TokenNameDOT	
width	TokenNameIdentifier	 width
<	TokenNameLESS	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
{	TokenNameLBRACE	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
screenDim	TokenNameIdentifier	 screen Dim
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
screenDim	TokenNameIdentifier	 screen Dim
.	TokenNameDOT	
height	TokenNameIdentifier	 height
<	TokenNameLESS	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
screenDim	TokenNameIdentifier	 screen Dim
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Center Frame, Dialogue or Window on screen 	TokenNameCOMMENT_LINE	Center Frame, Dialogue or Window on screen 
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
screenDim	TokenNameIdentifier	 screen Dim
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
screenDim	TokenNameIdentifier	 screen Dim
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
win	TokenNameIdentifier	 win
.	TokenNameDOT	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
wrapStringOnPanel	TokenNameIdentifier	 wrap String On Panel
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
message	TokenNameIdentifier	 message
,	TokenNameCOMMA	
Container	TokenNameIdentifier	 Container
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getDefaultConstraints	TokenNameIdentifier	 get Default Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
gridwidth	TokenNameIdentifier	 gridwidth
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
REMAINDER	TokenNameIdentifier	 REMAINDER
;	TokenNameSEMICOLON	
// Insets() args are top, left, bottom, right 	TokenNameCOMMENT_LINE	Insets() args are top, left, bottom, right 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
insets	TokenNameIdentifier	 insets
=	TokenNameEQUAL	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
gbLayout	TokenNameIdentifier	 gb Layout
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
)	TokenNameRPAREN	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
getLayout	TokenNameIdentifier	 get Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newLineIndex	TokenNameIdentifier	 new Line Index
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newLineIndex	TokenNameIdentifier	 new Line Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newLineIndex	TokenNameIdentifier	 new Line Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
newLineIndex	TokenNameIdentifier	 new Line Index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
message	TokenNameIdentifier	 message
;	TokenNameSEMICOLON	
message	TokenNameIdentifier	 message
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Label	TokenNameIdentifier	 Label
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
new	TokenNamenew	
Label	TokenNameIdentifier	 Label
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
DISPLAY_FONT	TokenNameIdentifier	 DISPLAY  FONT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gbLayout	TokenNameIdentifier	 gb Layout
.	TokenNameDOT	
setConstraints	TokenNameIdentifier	 set Constraints
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
getDefaultConstraints	TokenNameIdentifier	 get Default Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
constraints	TokenNameIdentifier	 constraints
=	TokenNameEQUAL	
new	TokenNamenew	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
gridheight	TokenNameIdentifier	 gridheight
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// One row high 	TokenNameCOMMENT_LINE	One row high 
// Insets() args are top, left, bottom, right 	TokenNameCOMMENT_LINE	Insets() args are top, left, bottom, right 
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
insets	TokenNameIdentifier	 insets
=	TokenNameEQUAL	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fill of NONE means do not change size 	TokenNameCOMMENT_LINE	fill of NONE means do not change size 
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
;	TokenNameSEMICOLON	
// WEST means align left 	TokenNameCOMMENT_LINE	WEST means align left 
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
anchor	TokenNameIdentifier	 anchor
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
WEST	TokenNameIdentifier	 WEST
;	TokenNameSEMICOLON	
return	TokenNamereturn	
constraints	TokenNameIdentifier	 constraints
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
minimumSizeDialog	TokenNameIdentifier	 minimum Size Dialog
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
component	TokenNameIdentifier	 component
,	TokenNameCOMMA	
int	TokenNameint	
minWidth	TokenNameIdentifier	 min Width
,	TokenNameCOMMA	
int	TokenNameint	
minHeight	TokenNameIdentifier	 min Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set the min width 	TokenNameCOMMENT_LINE	set the min width 
if	TokenNameif	
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
<	TokenNameLESS	
minWidth	TokenNameIdentifier	 min Width
)	TokenNameRPAREN	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
minWidth	TokenNameIdentifier	 min Width
,	TokenNameCOMMA	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the min height 	TokenNameCOMMENT_LINE	set the min height 
if	TokenNameif	
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
<	TokenNameLESS	
minHeight	TokenNameIdentifier	 min Height
)	TokenNameRPAREN	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
minHeight	TokenNameIdentifier	 min Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
// Nested Top-Level Classes or Interfaces 	TokenNameCOMMENT_LINE	Nested Top-Level Classes or Interfaces 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
}	TokenNameRBRACE	
