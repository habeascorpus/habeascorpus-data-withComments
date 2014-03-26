/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSEngine	TokenNameIdentifier	 CSS Engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGColorManager	TokenNameIdentifier	 SVG Color Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGPaintManager	TokenNameIdentifier	 SVG Paint Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSValue	TokenNameIdentifier	 CSS Value
;	TokenNameSEMICOLON	
/** * This class represents the computed style of an SVG element. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSOMSVGComputedStyle.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents the computed style of an SVG element. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSOMSVGComputedStyle.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
CSSOMSVGComputedStyle	TokenNameIdentifier	 CSSOMSVG Computed Style
extends	TokenNameextends	
CSSOMComputedStyle	TokenNameIdentifier	 CSSOM Computed Style
{	TokenNameLBRACE	
/** * Creates a new computed style. */	TokenNameCOMMENT_JAVADOC	 Creates a new computed style. 
public	TokenNamepublic	
CSSOMSVGComputedStyle	TokenNameIdentifier	 CSSOMSVG Computed Style
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
pseudoElt	TokenNameIdentifier	 pseudo Elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
pseudoElt	TokenNameIdentifier	 pseudo Elt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a CSSValue to manage the value at the given index. */	TokenNameCOMMENT_JAVADOC	 Creates a CSSValue to manage the value at the given index. 
protected	TokenNameprotected	
CSSValue	TokenNameIdentifier	 CSS Value
createCSSValue	TokenNameIdentifier	 create CSS Value
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FINAL_INDEX	TokenNameIdentifier	 FINAL  INDEX
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getValueManagers	TokenNameIdentifier	 get Value Managers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
SVGPaintManager	TokenNameIdentifier	 SVG Paint Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ComputedCSSPaintValue	TokenNameIdentifier	 Computed CSS Paint Value
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getValueManagers	TokenNameIdentifier	 get Value Managers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
instanceof	TokenNameinstanceof	
SVGColorManager	TokenNameIdentifier	 SVG Color Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ComputedCSSColorValue	TokenNameIdentifier	 Computed CSS Color Value
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FILL_INDEX	TokenNameIdentifier	 FILL  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STROKE_INDEX	TokenNameIdentifier	 STROKE  INDEX
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
ComputedCSSPaintValue	TokenNameIdentifier	 Computed CSS Paint Value
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FLOOD_COLOR_INDEX	TokenNameIdentifier	 FLOOD  COLOR  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
LIGHTING_COLOR_INDEX	TokenNameIdentifier	 LIGHTING  COLOR  INDEX
:	TokenNameCOLON	
case	TokenNamecase	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
STOP_COLOR_INDEX	TokenNameIdentifier	 STOP  COLOR  INDEX
:	TokenNameCOLON	
return	TokenNamereturn	
new	TokenNamenew	
ComputedCSSColorValue	TokenNameIdentifier	 Computed CSS Color Value
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
createCSSValue	TokenNameIdentifier	 create CSS Value
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To manage a computed color CSSValue. */	TokenNameCOMMENT_JAVADOC	 To manage a computed color CSSValue. 
protected	TokenNameprotected	
class	TokenNameclass	
ComputedCSSColorValue	TokenNameIdentifier	 Computed CSS Color Value
extends	TokenNameextends	
CSSOMSVGColor	TokenNameIdentifier	 CSSOMSVG Color
implements	TokenNameimplements	
CSSOMSVGColor	TokenNameIdentifier	 CSSOMSVG Color
.	TokenNameDOT	
ValueProvider	TokenNameIdentifier	 Value Provider
{	TokenNameLBRACE	
/** * The index of the associated value. */	TokenNameCOMMENT_JAVADOC	 The index of the associated value. 
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Creates a new ComputedCSSColorValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new ComputedCSSColorValue. 
public	TokenNamepublic	
ComputedCSSColorValue	TokenNameIdentifier	 Computed CSS Color Value
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valueProvider	TokenNameIdentifier	 value Provider
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Value associated with this object. */	TokenNameCOMMENT_JAVADOC	 Returns the Value associated with this object. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
pseudoElement	TokenNameIdentifier	 pseudo Element
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To manage a computed paint CSSValue. */	TokenNameCOMMENT_JAVADOC	 To manage a computed paint CSSValue. 
public	TokenNamepublic	
class	TokenNameclass	
ComputedCSSPaintValue	TokenNameIdentifier	 Computed CSS Paint Value
extends	TokenNameextends	
CSSOMSVGPaint	TokenNameIdentifier	 CSSOMSVG Paint
implements	TokenNameimplements	
CSSOMSVGPaint	TokenNameIdentifier	 CSSOMSVG Paint
.	TokenNameDOT	
ValueProvider	TokenNameIdentifier	 Value Provider
{	TokenNameLBRACE	
/** * The index of the associated value. */	TokenNameCOMMENT_JAVADOC	 The index of the associated value. 
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Creates a new ComputedCSSPaintValue. */	TokenNameCOMMENT_JAVADOC	 Creates a new ComputedCSSPaintValue. 
public	TokenNamepublic	
ComputedCSSPaintValue	TokenNameIdentifier	 Computed CSS Paint Value
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
valueProvider	TokenNameIdentifier	 value Provider
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Value associated with this object. */	TokenNameCOMMENT_JAVADOC	 Returns the Value associated with this object. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cssEngine	TokenNameIdentifier	 css Engine
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
pseudoElement	TokenNameIdentifier	 pseudo Element
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
