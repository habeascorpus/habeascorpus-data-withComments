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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
FloatValue	TokenNameIdentifier	 Float Value
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
ICCColor	TokenNameIdentifier	 ICC Color
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
CSSConstants	TokenNameIdentifier	 CSS Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DOMException	TokenNameIdentifier	 DOM Exception
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
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGPaint	TokenNameIdentifier	 SVG Paint
;	TokenNameSEMICOLON	
/** * This class implements the {@link SVGPaint} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: CSSOMSVGPaint.java 476924 2006-11-19 21:13:26Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class implements the {@link SVGPaint} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: CSSOMSVGPaint.java 476924 2006-11-19 21:13:26Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
CSSOMSVGPaint	TokenNameIdentifier	 CSSOMSVG Paint
extends	TokenNameextends	
CSSOMSVGColor	TokenNameIdentifier	 CSSOMSVG Color
implements	TokenNameimplements	
SVGPaint	TokenNameIdentifier	 SVG Paint
{	TokenNameLBRACE	
/** * Creates a new CSSOMSVGPaint. */	TokenNameCOMMENT_JAVADOC	 Creates a new CSSOMSVGPaint. 
public	TokenNamepublic	
CSSOMSVGPaint	TokenNameIdentifier	 CSSOMSVG Paint
(	TokenNameLPAREN	
ValueProvider	TokenNameIdentifier	 Value Provider
vp	TokenNameIdentifier	 vp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
vp	TokenNameIdentifier	 vp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the modification handler of this value. */	TokenNameCOMMENT_JAVADOC	 Sets the modification handler of this value. 
public	TokenNamepublic	
void	TokenNamevoid	
setModificationHandler	TokenNameIdentifier	 set Modification Handler
(	TokenNameLPAREN	
ModificationHandler	TokenNameIdentifier	 Modification Handler
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
instanceof	TokenNameinstanceof	
PaintModificationHandler	TokenNameIdentifier	 Paint Modification Handler
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setModificationHandler	TokenNameIdentifier	 set Modification Handler
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGColor#getColorType()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGColor#getColorType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getColorType	TokenNameIdentifier	 get Color Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
INVALID_ACCESS_ERR	TokenNameIdentifier	 INVALID  ACCESS  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGPaint#getPaintType()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGPaint#getPaintType()}. 
public	TokenNamepublic	
short	TokenNameshort	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
valueProvider	TokenNameIdentifier	 value Provider
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getCssValueType	TokenNameIdentifier	 get Css Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CSSValue	TokenNameIdentifier	 CSS Value
.	TokenNameDOT	
CSS_PRIMITIVE_VALUE	TokenNameIdentifier	 CSS  PRIMITIVE  VALUE
:	TokenNameCOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NONE_VALUE	TokenNameIdentifier	 CSS  NONE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_PAINTTYPE_NONE	TokenNameIdentifier	 SVG  PAINTTYPE  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CURRENTCOLOR_VALUE	TokenNameIdentifier	 CSS  CURRENTCOLOR  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_PAINTTYPE_CURRENTCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  CURRENTCOLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_RGBCOLOR	TokenNameIdentifier	 CSS  RGBCOLOR
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_URI	TokenNameIdentifier	 CSS  URI
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_PAINTTYPE_URI	TokenNameIdentifier	 SVG  PAINTTYPE  URI
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSValue	TokenNameIdentifier	 CSS Value
.	TokenNameDOT	
CSS_VALUE_LIST	TokenNameIdentifier	 CSS  VALUE  LIST
:	TokenNameCOLON	
Value	TokenNameIdentifier	 Value
v0	TokenNameIdentifier	 v0
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Value	TokenNameIdentifier	 Value
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
v0	TokenNameIdentifier	 v0
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
;	TokenNameSEMICOLON	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_URI	TokenNameIdentifier	 CSS  URI
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
getCssValueType	TokenNameIdentifier	 get Css Value Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CSSValue	TokenNameIdentifier	 CSS Value
.	TokenNameDOT	
CSS_VALUE_LIST	TokenNameIdentifier	 CSS  VALUE  LIST
)	TokenNameRPAREN	
// Should probably check this more deeply... 	TokenNameCOMMENT_LINE	Should probably check this more deeply... 
return	TokenNamereturn	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_NONE_VALUE	TokenNameIdentifier	 CSS  NONE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_PAINTTYPE_URI_NONE	TokenNameIdentifier	 SVG  PAINTTYPE  URI  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
CSSConstants	TokenNameIdentifier	 CSS Constants
.	TokenNameDOT	
CSS_CURRENTCOLOR_VALUE	TokenNameIdentifier	 CSS  CURRENTCOLOR  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_PAINTTYPE_URI_CURRENTCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  CURRENTCOLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_RGBCOLOR	TokenNameIdentifier	 CSS  RGBCOLOR
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_RGBCOLOR	TokenNameIdentifier	 CSS  RGBCOLOR
:	TokenNameCOLON	
return	TokenNamereturn	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
SVG_PAINTTYPE_UNKNOWN	TokenNameIdentifier	 SVG  PAINTTYPE  UNKNOWN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGPaint#getUri()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGPaint#getUri()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getUri	TokenNameIdentifier	 get Uri
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_URI	TokenNameIdentifier	 SVG  PAINTTYPE  URI
:	TokenNameCOLON	
return	TokenNamereturn	
valueProvider	TokenNameIdentifier	 value Provider
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_NONE	TokenNameIdentifier	 SVG  PAINTTYPE  URI  NONE
:	TokenNameCOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_CURRENTCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  CURRENTCOLOR
:	TokenNameCOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
return	TokenNamereturn	
valueProvider	TokenNameIdentifier	 value Provider
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
InternalError	TokenNameIdentifier	 Internal Error
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGPaint#setUri(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGPaint#setUri(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setUri	TokenNameIdentifier	 set Uri
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PaintModificationHandler	TokenNameIdentifier	 Paint Modification Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
.	TokenNameDOT	
uriChanged	TokenNameIdentifier	 uri Changed
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGPaint#setPaint(short,String,String,String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGPaint#setPaint(short,String,String,String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setPaint	TokenNameIdentifier	 set Paint
(	TokenNameLPAREN	
short	TokenNameshort	
paintType	TokenNameIdentifier	 paint Type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rgbColor	TokenNameIdentifier	 rgb Color
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
iccColor	TokenNameIdentifier	 icc Color
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
PaintModificationHandler	TokenNameIdentifier	 Paint Modification Handler
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
.	TokenNameDOT	
paintChanged	TokenNameIdentifier	 paint Changed
(	TokenNameLPAREN	
paintType	TokenNameIdentifier	 paint Type
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
rgbColor	TokenNameIdentifier	 rgb Color
,	TokenNameCOMMA	
iccColor	TokenNameIdentifier	 icc Color
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To manage the modifications on a SVGPaint value. */	TokenNameCOMMENT_JAVADOC	 To manage the modifications on a SVGPaint value. 
public	TokenNamepublic	
interface	TokenNameinterface	
PaintModificationHandler	TokenNameIdentifier	 Paint Modification Handler
extends	TokenNameextends	
ModificationHandler	TokenNameIdentifier	 Modification Handler
{	TokenNameLBRACE	
/** * Called when the URI has been modified. */	TokenNameCOMMENT_JAVADOC	 Called when the URI has been modified. 
void	TokenNamevoid	
uriChanged	TokenNameIdentifier	 uri Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the paint value has beem modified. */	TokenNameCOMMENT_JAVADOC	 Called when the paint value has beem modified. 
void	TokenNamevoid	
paintChanged	TokenNameIdentifier	 paint Changed
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Provides an abstract implementation of a PaintModificationHandler. */	TokenNameCOMMENT_JAVADOC	 Provides an abstract implementation of a PaintModificationHandler. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractModificationHandler	TokenNameIdentifier	 Abstract Modification Handler
implements	TokenNameimplements	
PaintModificationHandler	TokenNameIdentifier	 Paint Modification Handler
{	TokenNameLBRACE	
/** * Returns the associated value. */	TokenNameCOMMENT_JAVADOC	 Returns the associated value. 
protected	TokenNameprotected	
abstract	TokenNameabstract	
Value	TokenNameIdentifier	 Value
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called when the red value text has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the red value text has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
redTextChanged	TokenNameIdentifier	 red Text Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the red float value has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the red float value has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
redFloatValueChanged	TokenNameIdentifier	 red Float Value Changed
(	TokenNameLPAREN	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the green value text has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the green value text has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
greenTextChanged	TokenNameIdentifier	 green Text Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the green float value has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the green float value has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
greenFloatValueChanged	TokenNameIdentifier	 green Float Value Changed
(	TokenNameLPAREN	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBlue	TokenNameIdentifier	 get Blue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the blue value text has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the blue value text has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
blueTextChanged	TokenNameIdentifier	 blue Text Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the blue float value has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the blue float value has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
blueFloatValueChanged	TokenNameIdentifier	 blue Float Value Changed
(	TokenNameLPAREN	
short	TokenNameshort	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"rgb("	TokenNameStringLiteral	rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" rgb("	TokenNameStringLiteral	 rgb(
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRed	TokenNameIdentifier	 get Red
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getGreen	TokenNameIdentifier	 get Green
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
FloatValue	TokenNameIdentifier	 Float Value
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
unit	TokenNameIdentifier	 unit
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the RGBColor text has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the RGBColor text has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
rgbColorChanged	TokenNameIdentifier	 rgb Color Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
+=	TokenNamePLUS_EQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the RGBColor and the ICCColor text has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the RGBColor and the ICCColor text has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
rgbColorICCColorChanged	TokenNameIdentifier	 rgb Color ICC Color Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
rgb	TokenNameIdentifier	 rgb
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the SVGColor has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the SVGColor has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
colorChanged	TokenNameIdentifier	 color Changed
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_CURRENTCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  CURRENTCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"currentcolor"	TokenNameStringLiteral	currentcolor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the ICC color profile has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the ICC color profile has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
colorProfileChanged	TokenNameIdentifier	 color Profile Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICCColor	TokenNameIdentifier	 ICC Color
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
cp	TokenNameIdentifier	 cp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
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
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the ICC colors has changed. */	TokenNameCOMMENT_JAVADOC	 Called when the ICC colors has changed. 
public	TokenNamepublic	
void	TokenNamevoid	
colorsCleared	TokenNameIdentifier	 colors Cleared
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICCColor	TokenNameIdentifier	 ICC Color
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the ICC colors has been initialized. */	TokenNameCOMMENT_JAVADOC	 Called when the ICC colors has been initialized. 
public	TokenNamepublic	
void	TokenNamevoid	
colorsInitialized	TokenNameIdentifier	 colors Initialized
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICCColor	TokenNameIdentifier	 ICC Color
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the ICC color has been inserted. */	TokenNameCOMMENT_JAVADOC	 Called when the ICC color has been inserted. 
public	TokenNamepublic	
void	TokenNamevoid	
colorInsertedBefore	TokenNameIdentifier	 color Inserted Before
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICCColor	TokenNameIdentifier	 ICC Color
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the ICC color has been replaced. */	TokenNameCOMMENT_JAVADOC	 Called when the ICC color has been replaced. 
public	TokenNamepublic	
void	TokenNamevoid	
colorReplaced	TokenNameIdentifier	 color Replaced
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICCColor	TokenNameIdentifier	 ICC Color
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the ICC color has been removed. */	TokenNameCOMMENT_JAVADOC	 Called when the ICC color has been removed. 
public	TokenNamepublic	
void	TokenNamevoid	
colorRemoved	TokenNameIdentifier	 color Removed
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICCColor	TokenNameIdentifier	 ICC Color
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the ICC color has been append. */	TokenNameCOMMENT_JAVADOC	 Called when the ICC color has been append. 
public	TokenNamepublic	
void	TokenNamevoid	
colorAppend	TokenNameIdentifier	 color Append
(	TokenNameLPAREN	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getPaintType	TokenNameIdentifier	 get Paint Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ICCColor	TokenNameIdentifier	 ICC Color
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCssText	TokenNameIdentifier	 get Css Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" icc-color("	TokenNameStringLiteral	 icc-color(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iccc	TokenNameIdentifier	 iccc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ICCColor	TokenNameIdentifier	 ICC Color
)	TokenNameRPAREN	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColorProfile	TokenNameIdentifier	 get Color Profile
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
iccc	TokenNameIdentifier	 iccc
.	TokenNameDOT	
getColor	TokenNameIdentifier	 get Color
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
DOMException	TokenNameIdentifier	 DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NO_MODIFICATION_ALLOWED_ERR	TokenNameIdentifier	 NO  MODIFICATION  ALLOWED  ERR
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when the URI has been modified. */	TokenNameCOMMENT_JAVADOC	 Called when the URI has been modified. 
public	TokenNamepublic	
void	TokenNamevoid	
uriChanged	TokenNameIdentifier	 uri Changed
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
") none"	TokenNameStringLiteral	) none
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Called when the paint value has beem modified. */	TokenNameCOMMENT_JAVADOC	 Called when the paint value has beem modified. 
public	TokenNamepublic	
void	TokenNamevoid	
paintChanged	TokenNameIdentifier	 paint Changed
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rgb	TokenNameIdentifier	 rgb
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SVG_PAINTTYPE_NONE	TokenNameIdentifier	 SVG  PAINTTYPE  NONE
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"none"	TokenNameStringLiteral	none
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_CURRENTCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  CURRENTCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"currentcolor"	TokenNameStringLiteral	currentcolor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
rgb	TokenNameIdentifier	 rgb
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI	TokenNameIdentifier	 SVG  PAINTTYPE  URI
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_NONE	TokenNameIdentifier	 SVG  PAINTTYPE  URI  NONE
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
") none"	TokenNameStringLiteral	) none
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_CURRENTCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  CURRENTCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
") currentcolor"	TokenNameStringLiteral	) currentcolor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
rgb	TokenNameIdentifier	 rgb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SVG_PAINTTYPE_URI_RGBCOLOR_ICCCOLOR	TokenNameIdentifier	 SVG  PAINTTYPE  URI  RGBCOLOR  ICCCOLOR
:	TokenNameCOLON	
textChanged	TokenNameIdentifier	 text Changed
(	TokenNameLPAREN	
"url("	TokenNameStringLiteral	url(
+	TokenNamePLUS	
uri	TokenNameIdentifier	 uri
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
+	TokenNamePLUS	
rgb	TokenNameIdentifier	 rgb
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
icc	TokenNameIdentifier	 icc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
