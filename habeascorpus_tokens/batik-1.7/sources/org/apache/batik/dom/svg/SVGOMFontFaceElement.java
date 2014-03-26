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
SVGFontFaceElement	TokenNameIdentifier	 SVG Font Face Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGFontFaceElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMFontFaceElement.java 489964 2006-12-24 01:30:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGFontFaceElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMFontFaceElement.java 489964 2006-12-24 01:30:23Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMFontFaceElement	TokenNameIdentifier	 SVGOM Font Face Element
extends	TokenNameextends	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
implements	TokenNameimplements	
SVGFontFaceElement	TokenNameIdentifier	 SVG Font Face Element
{	TokenNameLBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Table mapping XML attribute names to TraitInformation objects. 	TokenNameCOMMENT_LINE	* Table mapping XML attribute names to TraitInformation objects. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected static DoublyIndexedTable xmlTraitInformation; 	TokenNameCOMMENT_LINE	protected static DoublyIndexedTable xmlTraitInformation; 
// static { 	TokenNameCOMMENT_LINE	static { 
// DoublyIndexedTable t = new DoublyIndexedTable(SVGOMElement.xmlTraitInformation); 	TokenNameCOMMENT_LINE	DoublyIndexedTable t = new DoublyIndexedTable(SVGOMElement.xmlTraitInformation); 
// t.put(null, SVG_FONT_FAMILY_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FONT_FAMILY_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_FONT_STYLE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FONT_STYLE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_FONT_VARIANT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FONT_VARIANT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_FONT_WEIGHT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FONT_WEIGHT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_FONT_STRETCH_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FONT_STRETCH_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_FONT_SIZE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FONT_SIZE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_UNICODE_RANGE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_UNICODE_RANGE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_UNITS_PER_EM_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_UNITS_PER_EM_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_PANOSE_1_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_PANOSE_1_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_STEMV_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_STEMV_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_STEMH_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_STEMH_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_SLOPE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_SLOPE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_CAP_HEIGHT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_CAP_HEIGHT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_X_HEIGHT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_X_HEIGHT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_ACCENT_HEIGHT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ACCENT_HEIGHT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_ASCENT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ASCENT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_DESCENT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_DESCENT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_WIDTHS_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_WIDTHS_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_BBOX_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_BBOX_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_IDEOGRAPHIC_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_IDEOGRAPHIC_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_ALPHABETIC_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ALPHABETIC_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_MATHEMATICAL_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_MATHEMATICAL_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_HANGING_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_HANGING_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_V_IDEOGRAPHIC_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_V_IDEOGRAPHIC_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_V_ALPHABETIC_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_V_ALPHABETIC_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_V_MATHEMATICAL_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_V_MATHEMATICAL_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_V_HANGING_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_V_HANGING_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_UNDERLINE_POSITION_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_UNDERLINE_POSITION_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_UNDERLINE_THICKNESS_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_UNDERLINE_THICKNESS_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_STRIKETHROUGH_POSITION_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_STRIKETHROUGH_POSITION_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_STRIKETHROUGH_THICKNESS_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_STRIKETHROUGH_THICKNESS_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_OVERLINE_POSITION_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_OVERLINE_POSITION_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_OVERLINE_THICKNESS_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_OVERLINE_THICKNESS_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// xmlTraitInformation = t; 	TokenNameCOMMENT_LINE	xmlTraitInformation = t; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Creates a new SVGOMFontFaceElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFontFaceElement object. 
protected	TokenNameprotected	
SVGOMFontFaceElement	TokenNameIdentifier	 SVGOM Font Face Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMFontFaceElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFontFaceElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMFontFaceElement	TokenNameIdentifier	 SVGOM Font Face Element
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
SVG_FONT_FACE_TAG	TokenNameIdentifier	 SVG  FONT  FACE  TAG
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
SVGOMFontFaceElement	TokenNameIdentifier	 SVGOM Font Face Element
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
