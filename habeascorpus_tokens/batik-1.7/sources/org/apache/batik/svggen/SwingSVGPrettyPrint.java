/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
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
Rectangle	TokenNameIdentifier	 Rectangle
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
JComboBox	TokenNameIdentifier	 J Combo Box
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JComponent	TokenNameIdentifier	 J Component
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
JPopupMenu	TokenNameIdentifier	 J Popup Menu
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JProgressBar	TokenNameIdentifier	 J Progress Bar
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JScrollBar	TokenNameIdentifier	 J Scroll Bar
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
JToolBar	TokenNameIdentifier	 J Tool Bar
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
UIManager	TokenNameIdentifier	 UI Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
border	TokenNameIdentifier	 border
.	TokenNameDOT	
Border	TokenNameIdentifier	 Border
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
swing	TokenNameIdentifier	 swing
.	TokenNameDOT	
plaf	TokenNameIdentifier	 plaf
.	TokenNameDOT	
ComponentUI	TokenNameIdentifier	 Component UI
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This class offers a way to create an SVG document with grouping * that reflects the Swing composite structure (container/components). * * @author Vincent Hardy * @version $Id: SwingSVGPrettyPrint.java 478176 2006-11-22 14:50:50Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class offers a way to create an SVG document with grouping that reflects the Swing composite structure (container/components). * @author Vincent Hardy @version $Id: SwingSVGPrettyPrint.java 478176 2006-11-22 14:50:50Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SwingSVGPrettyPrint	TokenNameIdentifier	 Swing SVG Pretty Print
implements	TokenNameimplements	
SVGSyntax	TokenNameIdentifier	 SVG Syntax
{	TokenNameLBRACE	
/** * @param cmp Swing component to be converted to SVG * @param svgGen SVGraphics2D to use to paint Swing components */	TokenNameCOMMENT_JAVADOC	 @param cmp Swing component to be converted to SVG @param svgGen SVGraphics2D to use to paint Swing components 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
JComponent	TokenNameIdentifier	 J Component
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
svgGen	TokenNameIdentifier	 svg Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JComboBox	TokenNameIdentifier	 J Combo Box
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JScrollBar	TokenNameIdentifier	 J Scroll Bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This is a work around unresolved issue with JComboBox 	TokenNameCOMMENT_LINE	This is a work around unresolved issue with JComboBox 
// and JScrollBar 	TokenNameCOMMENT_LINE	and JScrollBar 
printHack	TokenNameIdentifier	 print Hack
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
svgGen	TokenNameIdentifier	 svg Gen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Spawn a new Graphics2D for this component 	TokenNameCOMMENT_LINE	Spawn a new Graphics2D for this component 
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
)	TokenNameRPAREN	
svgGen	TokenNameIdentifier	 svg Gen
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getForeground	TokenNameIdentifier	 get Foreground
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
topLevelGroup	TokenNameIdentifier	 top Level Group
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getTopLevelGroup	TokenNameIdentifier	 get Top Level Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If there is no area to be painted, return here 	TokenNameCOMMENT_LINE	If there is no area to be painted, return here 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
clipRect	TokenNameIdentifier	 clip Rect
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getClipBounds	TokenNameIdentifier	 get Clip Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clipRect	TokenNameIdentifier	 clip Rect
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setClip	TokenNameIdentifier	 set Clip
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintComponent	TokenNameIdentifier	 paint Component
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintBorder	TokenNameIdentifier	 paint Border
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
paintChildren	TokenNameIdentifier	 paint Children
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now, structure DOM tree to reflect this component's structure 	TokenNameCOMMENT_LINE	Now, structure DOM tree to reflect this component's structure 
Element	TokenNameIdentifier	 Element
cmpGroup	TokenNameIdentifier	 cmp Group
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getTopLevelGroup	TokenNameIdentifier	 get Top Level Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmpGroup	TokenNameIdentifier	 cmp Group
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
svgGen	TokenNameIdentifier	 svg Gen
.	TokenNameDOT	
getGeneratorContext	TokenNameIdentifier	 get Generator Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topLevelGroup	TokenNameIdentifier	 top Level Group
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
cmpGroup	TokenNameIdentifier	 cmp Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgGen	TokenNameIdentifier	 svg Gen
.	TokenNameDOT	
setTopLevelGroup	TokenNameIdentifier	 set Top Level Group
(	TokenNameLPAREN	
topLevelGroup	TokenNameIdentifier	 top Level Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param cmp Swing component to be converted to SVG * @param svgGen SVGraphics2D to use to paint Swing components */	TokenNameCOMMENT_JAVADOC	 @param cmp Swing component to be converted to SVG @param svgGen SVGraphics2D to use to paint Swing components 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
printHack	TokenNameIdentifier	 print Hack
(	TokenNameLPAREN	
JComponent	TokenNameIdentifier	 J Component
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
svgGen	TokenNameIdentifier	 svg Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Spawn a new Graphics2D for this component 	TokenNameCOMMENT_LINE	Spawn a new Graphics2D for this component 
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
)	TokenNameRPAREN	
svgGen	TokenNameIdentifier	 svg Gen
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getForeground	TokenNameIdentifier	 get Foreground
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
topLevelGroup	TokenNameIdentifier	 top Level Group
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getTopLevelGroup	TokenNameIdentifier	 get Top Level Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If there is no area to be painted, return here 	TokenNameCOMMENT_LINE	If there is no area to be painted, return here 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
clipRect	TokenNameIdentifier	 clip Rect
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getClipBounds	TokenNameIdentifier	 get Clip Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clipRect	TokenNameIdentifier	 clip Rect
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
setClip	TokenNameIdentifier	 set Clip
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now, structure DOM tree to reflect this component's structure 	TokenNameCOMMENT_LINE	Now, structure DOM tree to reflect this component's structure 
Element	TokenNameIdentifier	 Element
cmpGroup	TokenNameIdentifier	 cmp Group
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
.	TokenNameDOT	
getTopLevelGroup	TokenNameIdentifier	 get Top Level Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cmpGroup	TokenNameIdentifier	 cmp Group
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"id"	TokenNameStringLiteral	id
,	TokenNameCOMMA	
svgGen	TokenNameIdentifier	 svg Gen
.	TokenNameDOT	
getGeneratorContext	TokenNameIdentifier	 get Generator Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
topLevelGroup	TokenNameIdentifier	 top Level Group
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
cmpGroup	TokenNameIdentifier	 cmp Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
svgGen	TokenNameIdentifier	 svg Gen
.	TokenNameDOT	
setTopLevelGroup	TokenNameIdentifier	 set Top Level Group
(	TokenNameLPAREN	
topLevelGroup	TokenNameIdentifier	 top Level Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
paintComponent	TokenNameIdentifier	 paint Component
(	TokenNameLPAREN	
JComponent	TokenNameIdentifier	 J Component
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
svgGen	TokenNameIdentifier	 svg Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ComponentUI	TokenNameIdentifier	 Component UI
ui	TokenNameIdentifier	 ui
=	TokenNameEQUAL	
UIManager	TokenNameIdentifier	 UI Manager
.	TokenNameDOT	
getUI	TokenNameIdentifier	 get UI
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ui	TokenNameIdentifier	 ui
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ui	TokenNameIdentifier	 ui
.	TokenNameDOT	
installUI	TokenNameIdentifier	 install UI
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ui	TokenNameIdentifier	 ui
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
svgGen	TokenNameIdentifier	 svg Gen
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * WARNING: The following code does some special case processing * depending on the class of the input JComponent. This is needed * because there is no generic way I could find to determine whether * a component should be painted or not. */	TokenNameCOMMENT_JAVADOC	 WARNING: The following code does some special case processing depending on the class of the input JComponent. This is needed because there is no generic way I could find to determine whether a component should be painted or not. 
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
paintBorder	TokenNameIdentifier	 paint Border
(	TokenNameLPAREN	
JComponent	TokenNameIdentifier	 J Component
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
svgGen	TokenNameIdentifier	 svg Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Border	TokenNameIdentifier	 Border
border	TokenNameIdentifier	 border
=	TokenNameEQUAL	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getBorder	TokenNameIdentifier	 get Border
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
border	TokenNameIdentifier	 border
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
AbstractButton	TokenNameIdentifier	 Abstract Button
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JPopupMenu	TokenNameIdentifier	 J Popup Menu
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JToolBar	TokenNameIdentifier	 J Tool Bar
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JMenuBar	TokenNameIdentifier	 J Menu Bar
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JProgressBar	TokenNameIdentifier	 J Progress Bar
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
AbstractButton	TokenNameIdentifier	 Abstract Button
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AbstractButton	TokenNameIdentifier	 Abstract Button
)	TokenNameRPAREN	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
.	TokenNameDOT	
isBorderPainted	TokenNameIdentifier	 is Border Painted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JPopupMenu	TokenNameIdentifier	 J Popup Menu
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JPopupMenu	TokenNameIdentifier	 J Popup Menu
)	TokenNameRPAREN	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
.	TokenNameDOT	
isBorderPainted	TokenNameIdentifier	 is Border Painted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JToolBar	TokenNameIdentifier	 J Tool Bar
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JToolBar	TokenNameIdentifier	 J Tool Bar
)	TokenNameRPAREN	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
.	TokenNameDOT	
isBorderPainted	TokenNameIdentifier	 is Border Painted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JMenuBar	TokenNameIdentifier	 J Menu Bar
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JMenuBar	TokenNameIdentifier	 J Menu Bar
)	TokenNameRPAREN	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
.	TokenNameDOT	
isBorderPainted	TokenNameIdentifier	 is Border Painted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
instanceof	TokenNameinstanceof	
JProgressBar	TokenNameIdentifier	 J Progress Bar
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JProgressBar	TokenNameIdentifier	 J Progress Bar
)	TokenNameRPAREN	
cmp	TokenNameIdentifier	 cmp
)	TokenNameRPAREN	
.	TokenNameDOT	
isBorderPainted	TokenNameIdentifier	 is Border Painted
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
border	TokenNameIdentifier	 border
.	TokenNameDOT	
paintBorder	TokenNameIdentifier	 paint Border
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
svgGen	TokenNameIdentifier	 svg Gen
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
border	TokenNameIdentifier	 border
.	TokenNameDOT	
paintBorder	TokenNameIdentifier	 paint Border
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
svgGen	TokenNameIdentifier	 svg Gen
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
paintChildren	TokenNameIdentifier	 paint Children
(	TokenNameLPAREN	
JComponent	TokenNameIdentifier	 J Component
cmp	TokenNameIdentifier	 cmp
,	TokenNameCOMMA	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
svgGen	TokenNameIdentifier	 svg Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getComponentCount	TokenNameIdentifier	 get Component Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
tmpRect	TokenNameIdentifier	 tmp Rect
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Component	TokenNameIdentifier	 Component
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
cmp	TokenNameIdentifier	 cmp
.	TokenNameDOT	
getComponent	TokenNameIdentifier	 get Component
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
JComponent	TokenNameIdentifier	 J Component
.	TokenNameDOT	
isLightweightComponent	TokenNameIdentifier	 is Lightweight Component
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
isVisible	TokenNameIdentifier	 is Visible
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isJComponent	TokenNameIdentifier	 is J Component
=	TokenNameEQUAL	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
instanceof	TokenNameinstanceof	
JComponent	TokenNameIdentifier	 J Component
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isJComponent	TokenNameIdentifier	 is J Component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
tmpRect	TokenNameIdentifier	 tmp Rect
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JComponent	TokenNameIdentifier	 J Component
)	TokenNameRPAREN	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
hitClip	TokenNameIdentifier	 hit Clip
=	TokenNameEQUAL	
svgGen	TokenNameIdentifier	 svg Gen
.	TokenNameDOT	
hitClip	TokenNameIdentifier	 hit Clip
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hitClip	TokenNameIdentifier	 hit Clip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
cg	TokenNameIdentifier	 cg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGGraphics2D	TokenNameIdentifier	 SVG Graphics2 D
)	TokenNameRPAREN	
svgGen	TokenNameIdentifier	 svg Gen
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cg	TokenNameIdentifier	 cg
.	TokenNameDOT	
setColor	TokenNameIdentifier	 set Color
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getForeground	TokenNameIdentifier	 get Foreground
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cg	TokenNameIdentifier	 cg
.	TokenNameDOT	
setFont	TokenNameIdentifier	 set Font
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getFont	TokenNameIdentifier	 get Font
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
instanceof	TokenNameinstanceof	
JComponent	TokenNameIdentifier	 J Component
)	TokenNameRPAREN	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
(	TokenNameLPAREN	
JComponent	TokenNameIdentifier	 J Component
)	TokenNameRPAREN	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
cg	TokenNameIdentifier	 cg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
cg	TokenNameIdentifier	 cg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
