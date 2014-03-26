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
Component	TokenNameIdentifier	 Component
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
BorderFactory	TokenNameIdentifier	 Border Factory
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
JSlider	TokenNameIdentifier	 J Slider
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
ExtendedGridBagConstraints	TokenNameIdentifier	 Extended Grid Bag Constraints
;	TokenNameSEMICOLON	
/** * This class represents a panel to control jpeg encoding quality. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: JPEGOptionPanel.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a panel to control jpeg encoding quality. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: JPEGOptionPanel.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
JPEGOptionPanel	TokenNameIdentifier	 JPEG Option Panel
extends	TokenNameextends	
OptionPanel	TokenNameIdentifier	 Option Panel
{	TokenNameLBRACE	
/** * The jpeg encoding quality. */	TokenNameCOMMENT_JAVADOC	 The jpeg encoding quality. 
protected	TokenNameprotected	
JSlider	TokenNameIdentifier	 J Slider
quality	TokenNameIdentifier	 quality
;	TokenNameSEMICOLON	
/** * Creates a new panel. */	TokenNameCOMMENT_JAVADOC	 Creates a new panel. 
public	TokenNamepublic	
JPEGOptionPanel	TokenNameIdentifier	 JPEG Option Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
GridBagLayout	TokenNameIdentifier	 Grid Bag Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ExtendedGridBagConstraints	TokenNameIdentifier	 Extended Grid Bag Constraints
constraints	TokenNameIdentifier	 constraints
=	TokenNameEQUAL	
new	TokenNamenew	
ExtendedGridBagConstraints	TokenNameIdentifier	 Extended Grid Bag Constraints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
insets	TokenNameIdentifier	 insets
=	TokenNameEQUAL	
new	TokenNamenew	
Insets	TokenNameIdentifier	 Insets
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
weightx	TokenNameIdentifier	 weightx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
weighty	TokenNameIdentifier	 weighty
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
NONE	TokenNameIdentifier	 NONE
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
setGridBounds	TokenNameIdentifier	 set Grid Bounds
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"JPEGOptionPanel.label"	TokenNameStringLiteral	JPEGOptionPanel.label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
constraints	TokenNameIdentifier	 constraints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
=	TokenNameEQUAL	
new	TokenNamenew	
JSlider	TokenNameIdentifier	 J Slider
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setMinimum	TokenNameIdentifier	 set Minimum
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setMaximum	TokenNameIdentifier	 set Maximum
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setMajorTickSpacing	TokenNameIdentifier	 set Major Tick Spacing
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setMinorTickSpacing	TokenNameIdentifier	 set Minor Tick Spacing
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setPaintTicks	TokenNameIdentifier	 set Paint Ticks
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setPaintLabels	TokenNameIdentifier	 set Paint Labels
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setBorder	TokenNameIdentifier	 set Border
(	TokenNameLPAREN	
BorderFactory	TokenNameIdentifier	 Border Factory
.	TokenNameDOT	
createEmptyBorder	TokenNameIdentifier	 create Empty Border
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashtable	TokenNameIdentifier	 Hashtable
labels	TokenNameIdentifier	 labels
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
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
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
"0."	TokenNameStringLiteral	0.
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
/	TokenNameDIVIDE	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
labels	TokenNameIdentifier	 labels
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
JLabel	TokenNameIdentifier	 J Label
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setLabelTable	TokenNameIdentifier	 set Label Table
(	TokenNameLPAREN	
labels	TokenNameIdentifier	 labels
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dimension	TokenNameIdentifier	 Dimension
dim	TokenNameIdentifier	 dim
=	TokenNameEQUAL	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
getPreferredSize	TokenNameIdentifier	 get Preferred Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
setPreferredSize	TokenNameIdentifier	 set Preferred Size
(	TokenNameLPAREN	
new	TokenNamenew	
Dimension	TokenNameIdentifier	 Dimension
(	TokenNameLPAREN	
350	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dim	TokenNameIdentifier	 dim
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
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
fill	TokenNameIdentifier	 fill
=	TokenNameEQUAL	
GridBagConstraints	TokenNameIdentifier	 Grid Bag Constraints
.	TokenNameDOT	
HORIZONTAL	TokenNameIdentifier	 HORIZONTAL
;	TokenNameSEMICOLON	
constraints	TokenNameIdentifier	 constraints
.	TokenNameDOT	
setGridBounds	TokenNameIdentifier	 set Grid Bounds
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
quality	TokenNameIdentifier	 quality
,	TokenNameCOMMA	
constraints	TokenNameIdentifier	 constraints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the jpeg quality. */	TokenNameCOMMENT_JAVADOC	 Returns the jpeg quality. 
public	TokenNamepublic	
float	TokenNamefloat	
getQuality	TokenNameIdentifier	 get Quality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
100f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a dialog to choose the jpeg encoding quality and return * the quality as a float. */	TokenNameCOMMENT_JAVADOC	 Shows a dialog to choose the jpeg encoding quality and return the quality as a float. 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
showDialog	TokenNameIdentifier	 show Dialog
(	TokenNameLPAREN	
Component	TokenNameIdentifier	 Component
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"JPEGOptionPanel.dialog.title"	TokenNameStringLiteral	JPEGOptionPanel.dialog.title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
JPEGOptionPanel	TokenNameIdentifier	 JPEG Option Panel
panel	TokenNameIdentifier	 panel
=	TokenNameEQUAL	
new	TokenNamenew	
JPEGOptionPanel	TokenNameIdentifier	 JPEG Option Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Dialog	TokenNameIdentifier	 Dialog
dialog	TokenNameIdentifier	 dialog
=	TokenNameEQUAL	
new	TokenNamenew	
Dialog	TokenNameIdentifier	 Dialog
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
panel	TokenNameIdentifier	 panel
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dialog	TokenNameIdentifier	 dialog
.	TokenNameDOT	
pack	TokenNameIdentifier	 pack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dialog	TokenNameIdentifier	 dialog
.	TokenNameDOT	
setVisible	TokenNameIdentifier	 set Visible
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
panel	TokenNameIdentifier	 panel
.	TokenNameDOT	
getQuality	TokenNameIdentifier	 get Quality
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
