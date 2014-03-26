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
BorderLayout	TokenNameIdentifier	 Border Layout
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
JCheckBox	TokenNameIdentifier	 J Check Box
;	TokenNameSEMICOLON	
/** * This class represents a panel to control svg encoding options. * * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: SVGOptionPanel.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a panel to control svg encoding options. * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: SVGOptionPanel.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOptionPanel	TokenNameIdentifier	 SVG Option Panel
extends	TokenNameextends	
OptionPanel	TokenNameIdentifier	 Option Panel
{	TokenNameLBRACE	
/** * The svg encoding options. */	TokenNameCOMMENT_JAVADOC	 The svg encoding options. 
protected	TokenNameprotected	
JCheckBox	TokenNameIdentifier	 J Check Box
xmlbaseCB	TokenNameIdentifier	 xmlbase CB
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
JCheckBox	TokenNameIdentifier	 J Check Box
prettyPrintCB	TokenNameIdentifier	 pretty Print CB
;	TokenNameSEMICOLON	
/** * Creates a new panel. */	TokenNameCOMMENT_JAVADOC	 Creates a new panel. 
public	TokenNamepublic	
SVGOptionPanel	TokenNameIdentifier	 SVG Option Panel
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
BorderLayout	TokenNameIdentifier	 Border Layout
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"SVGOptionPanel.label"	TokenNameStringLiteral	SVGOptionPanel.label
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
NORTH	TokenNameIdentifier	 NORTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlbaseCB	TokenNameIdentifier	 xmlbase CB
=	TokenNameEQUAL	
new	TokenNamenew	
JCheckBox	TokenNameIdentifier	 J Check Box
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"SVGOptionPanel.UseXMLBase"	TokenNameStringLiteral	SVGOptionPanel.UseXMLBase
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlbaseCB	TokenNameIdentifier	 xmlbase CB
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
"SVGOptionPanel.UseXMLBaseDefault"	TokenNameStringLiteral	SVGOptionPanel.UseXMLBaseDefault
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
xmlbaseCB	TokenNameIdentifier	 xmlbase CB
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
CENTER	TokenNameIdentifier	 CENTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prettyPrintCB	TokenNameIdentifier	 pretty Print CB
=	TokenNameEQUAL	
new	TokenNamenew	
JCheckBox	TokenNameIdentifier	 J Check Box
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
"SVGOptionPanel.PrettyPrint"	TokenNameStringLiteral	SVGOptionPanel.PrettyPrint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prettyPrintCB	TokenNameIdentifier	 pretty Print CB
.	TokenNameDOT	
setSelected	TokenNameIdentifier	 set Selected
(	TokenNameLPAREN	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
getBoolean	TokenNameIdentifier	 get Boolean
(	TokenNameLPAREN	
"SVGOptionPanel.PrettyPrintDefault"	TokenNameStringLiteral	SVGOptionPanel.PrettyPrintDefault
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
prettyPrintCB	TokenNameIdentifier	 pretty Print CB
,	TokenNameCOMMA	
BorderLayout	TokenNameIdentifier	 Border Layout
.	TokenNameDOT	
SOUTH	TokenNameIdentifier	 SOUTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the output should use xml:base. */	TokenNameCOMMENT_JAVADOC	 Returns true if the output should use xml:base. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getUseXMLBase	TokenNameIdentifier	 get Use XML Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xmlbaseCB	TokenNameIdentifier	 xmlbase CB
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the output should use xml:base. */	TokenNameCOMMENT_JAVADOC	 Returns true if the output should use xml:base. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getPrettyPrint	TokenNameIdentifier	 get Pretty Print
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prettyPrintCB	TokenNameIdentifier	 pretty Print CB
.	TokenNameDOT	
isSelected	TokenNameIdentifier	 is Selected
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Shows a dialog to choose the jpeg encoding quality and return * the quality as a float. */	TokenNameCOMMENT_JAVADOC	 Shows a dialog to choose the jpeg encoding quality and return the quality as a float. 
public	TokenNamepublic	
static	TokenNamestatic	
SVGOptionPanel	TokenNameIdentifier	 SVG Option Panel
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
"SVGOptionPanel.dialog.title"	TokenNameStringLiteral	SVGOptionPanel.dialog.title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGOptionPanel	TokenNameIdentifier	 SVG Option Panel
panel	TokenNameIdentifier	 panel
=	TokenNameEQUAL	
new	TokenNamenew	
SVGOptionPanel	TokenNameIdentifier	 SVG Option Panel
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
