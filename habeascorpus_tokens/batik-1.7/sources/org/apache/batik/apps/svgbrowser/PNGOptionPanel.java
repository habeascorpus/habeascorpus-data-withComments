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
JLabel	TokenNameIdentifier	 J Label
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
/** * This class represents a panel to choose the color model * of the PNG, i.e. RGB or INDEXED. * * @author <a href="mailto:jun@oop-reserch.com">Jun Inamori</a> * @version $Id: PNGOptionPanel.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class represents a panel to choose the color model of the PNG, i.e. RGB or INDEXED. * @author <a href="mailto:jun@oop-reserch.com">Jun Inamori</a> @version $Id: PNGOptionPanel.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
PNGOptionPanel	TokenNameIdentifier	 PNG Option Panel
extends	TokenNameextends	
OptionPanel	TokenNameIdentifier	 Option Panel
{	TokenNameLBRACE	
/** * The check box for outputing an indexed PNG. */	TokenNameCOMMENT_JAVADOC	 The check box for outputing an indexed PNG. 
protected	TokenNameprotected	
JCheckBox	TokenNameIdentifier	 J Check Box
check	TokenNameIdentifier	 check
;	TokenNameSEMICOLON	
/** * Creates a new panel. */	TokenNameCOMMENT_JAVADOC	 Creates a new panel. 
public	TokenNamepublic	
PNGOptionPanel	TokenNameIdentifier	 PNG Option Panel
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
"PNGOptionPanel.label"	TokenNameStringLiteral	PNGOptionPanel.label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
constraints	TokenNameIdentifier	 constraints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
check	TokenNameIdentifier	 check
=	TokenNameEQUAL	
new	TokenNamenew	
JCheckBox	TokenNameIdentifier	 J Check Box
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
check	TokenNameIdentifier	 check
,	TokenNameCOMMA	
constraints	TokenNameIdentifier	 constraints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns if indexed or not */	TokenNameCOMMENT_JAVADOC	 Returns if indexed or not 
public	TokenNamepublic	
boolean	TokenNameboolean	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
check	TokenNameIdentifier	 check
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a dialog to choose the indexed PNG. */	TokenNameCOMMENT_JAVADOC	 Shows a dialog to choose the indexed PNG. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
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
"PNGOptionPanel.dialog.title"	TokenNameStringLiteral	PNGOptionPanel.dialog.title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PNGOptionPanel	TokenNameIdentifier	 PNG Option Panel
panel	TokenNameIdentifier	 panel
=	TokenNameEQUAL	
new	TokenNamenew	
PNGOptionPanel	TokenNameIdentifier	 PNG Option Panel
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
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
