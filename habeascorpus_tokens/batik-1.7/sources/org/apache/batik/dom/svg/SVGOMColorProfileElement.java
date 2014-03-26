/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
svg	TokenNameIdentifier	 svg
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
AbstractDocument	TokenNameIdentifier	 Abstract Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XLinkSupport	TokenNameIdentifier	 X Link Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSupport	TokenNameIdentifier	 XML Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
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
Node	TokenNameIdentifier	 Node
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
SVGColorProfileElement	TokenNameIdentifier	 SVG Color Profile Element
;	TokenNameSEMICOLON	
/** * This class implements {@link org.w3c.dom.svg.SVGColorProfileElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMColorProfileElement.java 489964 2006-12-24 01:30:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link org.w3c.dom.svg.SVGColorProfileElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMColorProfileElement.java 489964 2006-12-24 01:30:23Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMColorProfileElement	TokenNameIdentifier	 SVGOM Color Profile Element
extends	TokenNameextends	
SVGOMURIReferenceElement	TokenNameIdentifier	 SVGOMURI Reference Element
implements	TokenNameimplements	
SVGColorProfileElement	TokenNameIdentifier	 SVG Color Profile Element
{	TokenNameLBRACE	
/** * The attribute initializer. */	TokenNameCOMMENT_JAVADOC	 The attribute initializer. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
attributeInitializer	TokenNameIdentifier	 attribute Initializer
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
=	TokenNameEQUAL	
new	TokenNamenew	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
XMLSupport	TokenNameIdentifier	 XML Support
.	TokenNameDOT	
XMLNS_NAMESPACE_URI	TokenNameIdentifier	 XMLNS  NAMESPACE  URI
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"xmlns:xlink"	TokenNameStringLiteral	xmlns:xlink
,	TokenNameCOMMA	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"xlink"	TokenNameStringLiteral	xlink
,	TokenNameCOMMA	
"type"	TokenNameStringLiteral	type
,	TokenNameCOMMA	
"simple"	TokenNameStringLiteral	simple
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"xlink"	TokenNameStringLiteral	xlink
,	TokenNameCOMMA	
"show"	TokenNameStringLiteral	show
,	TokenNameCOMMA	
"other"	TokenNameStringLiteral	other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
XLINK_NAMESPACE_URI	TokenNameIdentifier	 XLINK  NAMESPACE  URI
,	TokenNameCOMMA	
"xlink"	TokenNameStringLiteral	xlink
,	TokenNameCOMMA	
"actuate"	TokenNameStringLiteral	actuate
,	TokenNameCOMMA	
"onLoad"	TokenNameStringLiteral	onLoad
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Table mapping XML attribute names to TraitInformation objects. 	TokenNameCOMMENT_LINE	* Table mapping XML attribute names to TraitInformation objects. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected static DoublyIndexedTable xmlTraitInformation; 	TokenNameCOMMENT_LINE	protected static DoublyIndexedTable xmlTraitInformation; 
// static { 	TokenNameCOMMENT_LINE	static { 
// DoublyIndexedTable t = 	TokenNameCOMMENT_LINE	DoublyIndexedTable t = 
// new DoublyIndexedTable(SVGOMURIReferenceElement.xmlTraitInformation); 	TokenNameCOMMENT_LINE	new DoublyIndexedTable(SVGOMURIReferenceElement.xmlTraitInformation); 
// t.put(XLINK_NAMESPACE_URI, XLINK_HREF_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(XLINK_NAMESPACE_URI, XLINK_HREF_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_URI)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_URI)); 
// t.put(null, SVG_NAME_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_NAME_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_LOCAL_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_LOCAL_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_RENDERING_INTENT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_RENDERING_INTENT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// xmlTraitInformation = t; 	TokenNameCOMMENT_LINE	xmlTraitInformation = t; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Creates a new SVGOMColorProfileElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMColorProfileElement object. 
protected	TokenNameprotected	
SVGOMColorProfileElement	TokenNameIdentifier	 SVGOM Color Profile Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMColorProfileElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMColorProfileElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMColorProfileElement	TokenNameIdentifier	 SVGOM Color Profile Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link Node#getLocalName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link Node#getLocalName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_COLOR_PROFILE_TAG	TokenNameIdentifier	 SVG  COLOR  PROFILE  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGColorProfileElement#getLocal()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGColorProfileElement#getLocal()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocal	TokenNameIdentifier	 get Local
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_LOCAL_ATTRIBUTE	TokenNameIdentifier	 SVG  LOCAL  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGColorProfileElement#setLocal(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGColorProfileElement#setLocal(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocal	TokenNameIdentifier	 set Local
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_LOCAL_ATTRIBUTE	TokenNameIdentifier	 SVG  LOCAL  ATTRIBUTE
,	TokenNameCOMMA	
local	TokenNameIdentifier	 local
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGColorProfileElement#getName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGColorProfileElement#getName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_NAME_ATTRIBUTE	TokenNameIdentifier	 SVG  NAME  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGColorProfileElement#setName(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGColorProfileElement#setName(String)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_NAME_ATTRIBUTE	TokenNameIdentifier	 SVG  NAME  ATTRIBUTE
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGColorProfileElement#getRenderingIntent()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGColorProfileElement#getRenderingIntent()}. 
public	TokenNamepublic	
short	TokenNameshort	
getRenderingIntent	TokenNameIdentifier	 get Rendering Intent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Attr	TokenNameIdentifier	 Attr
attr	TokenNameIdentifier	 attr
=	TokenNameEQUAL	
getAttributeNodeNS	TokenNameIdentifier	 get Attribute Node NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
attr	TokenNameIdentifier	 attr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RENDERING_INTENT_AUTO	TokenNameIdentifier	 RENDERING  INTENT  AUTO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
attr	TokenNameIdentifier	 attr
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
4	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RENDERING_INTENT_AUTO	TokenNameIdentifier	 RENDERING  INTENT  AUTO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
10	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_PERCEPTUAL_VALUE	TokenNameIdentifier	 SVG  PERCEPTUAL  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RENDERING_INTENT_PERCEPTUAL	TokenNameIdentifier	 RENDERING  INTENT  PERCEPTUAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_SATURATE_VALUE	TokenNameIdentifier	 SVG  SATURATE  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RENDERING_INTENT_SATURATION	TokenNameIdentifier	 RENDERING  INTENT  SATURATION
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
21	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_ABSOLUTE_COLORIMETRIC_VALUE	TokenNameIdentifier	 SVG  ABSOLUTE  COLORIMETRIC  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RENDERING_INTENT_ABSOLUTE_COLORIMETRIC	TokenNameIdentifier	 RENDERING  INTENT  ABSOLUTE  COLORIMETRIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_RELATIVE_COLORIMETRIC_VALUE	TokenNameIdentifier	 SVG  RELATIVE  COLORIMETRIC  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RENDERING_INTENT_RELATIVE_COLORIMETRIC	TokenNameIdentifier	 RENDERING  INTENT  RELATIVE  COLORIMETRIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
RENDERING_INTENT_UNKNOWN	TokenNameIdentifier	 RENDERING  INTENT  UNKNOWN
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGColorProfileElement#setRenderingIntent(short)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGColorProfileElement#setRenderingIntent(short)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setRenderingIntent	TokenNameIdentifier	 set Rendering Intent
(	TokenNameLPAREN	
short	TokenNameshort	
renderingIntent	TokenNameIdentifier	 rendering Intent
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
renderingIntent	TokenNameIdentifier	 rendering Intent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
RENDERING_INTENT_AUTO	TokenNameIdentifier	 RENDERING  INTENT  AUTO
:	TokenNameCOLON	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_AUTO_VALUE	TokenNameIdentifier	 SVG  AUTO  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RENDERING_INTENT_PERCEPTUAL	TokenNameIdentifier	 RENDERING  INTENT  PERCEPTUAL
:	TokenNameCOLON	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_PERCEPTUAL_VALUE	TokenNameIdentifier	 SVG  PERCEPTUAL  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RENDERING_INTENT_RELATIVE_COLORIMETRIC	TokenNameIdentifier	 RENDERING  INTENT  RELATIVE  COLORIMETRIC
:	TokenNameCOLON	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_RELATIVE_COLORIMETRIC_VALUE	TokenNameIdentifier	 SVG  RELATIVE  COLORIMETRIC  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RENDERING_INTENT_SATURATION	TokenNameIdentifier	 RENDERING  INTENT  SATURATION
:	TokenNameCOLON	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_SATURATE_VALUE	TokenNameIdentifier	 SVG  SATURATE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
RENDERING_INTENT_ABSOLUTE_COLORIMETRIC	TokenNameIdentifier	 RENDERING  INTENT  ABSOLUTE  COLORIMETRIC
:	TokenNameCOLON	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RENDERING_INTENT_ATTRIBUTE	TokenNameIdentifier	 SVG  RENDERING  INTENT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_ABSOLUTE_COLORIMETRIC_VALUE	TokenNameIdentifier	 SVG  ABSOLUTE  COLORIMETRIC  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the AttributeInitializer for this element type. * @return null if this element has no attribute with a default value. */	TokenNameCOMMENT_JAVADOC	 Returns the AttributeInitializer for this element type. @return null if this element has no attribute with a default value. 
protected	TokenNameprotected	
AttributeInitializer	TokenNameIdentifier	 Attribute Initializer
getAttributeInitializer	TokenNameIdentifier	 get Attribute Initializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
attributeInitializer	TokenNameIdentifier	 attribute Initializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new uninitialized instance of this object's class. */	TokenNameCOMMENT_JAVADOC	 Returns a new uninitialized instance of this object's class. 
protected	TokenNameprotected	
Node	TokenNameIdentifier	 Node
newNode	TokenNameIdentifier	 new Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SVGOMColorProfileElement	TokenNameIdentifier	 SVGOM Color Profile Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns the table of TraitInformation objects for this element. 	TokenNameCOMMENT_LINE	* Returns the table of TraitInformation objects for this element. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected DoublyIndexedTable getTraitInformationTable() { 	TokenNameCOMMENT_LINE	protected DoublyIndexedTable getTraitInformationTable() { 
// return xmlTraitInformation; 	TokenNameCOMMENT_LINE	return xmlTraitInformation; 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
