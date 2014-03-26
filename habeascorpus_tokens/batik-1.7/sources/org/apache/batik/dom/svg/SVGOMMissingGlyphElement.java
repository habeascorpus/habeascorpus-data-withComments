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
SVGMissingGlyphElement	TokenNameIdentifier	 SVG Missing Glyph Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGMissingGlyphElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMMissingGlyphElement.java 489964 2006-12-24 01:30:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGMissingGlyphElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMMissingGlyphElement.java 489964 2006-12-24 01:30:23Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMMissingGlyphElement	TokenNameIdentifier	 SVGOM Missing Glyph Element
extends	TokenNameextends	
SVGStylableElement	TokenNameIdentifier	 SVG Stylable Element
implements	TokenNameimplements	
SVGMissingGlyphElement	TokenNameIdentifier	 SVG Missing Glyph Element
{	TokenNameLBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Table mapping XML attribute names to TraitInformation objects. 	TokenNameCOMMENT_LINE	* Table mapping XML attribute names to TraitInformation objects. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected static DoublyIndexedTable xmlTraitInformation; 	TokenNameCOMMENT_LINE	protected static DoublyIndexedTable xmlTraitInformation; 
// static { 	TokenNameCOMMENT_LINE	static { 
// DoublyIndexedTable t = new DoublyIndexedTable(SVGStylableElement.xmlTraitInformation); 	TokenNameCOMMENT_LINE	DoublyIndexedTable t = new DoublyIndexedTable(SVGStylableElement.xmlTraitInformation); 
// t.put(XLINK_NAMESPACE_URI, XLINK_HREF_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(XLINK_NAMESPACE_URI, XLINK_HREF_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_URI)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_URI)); 
// t.put(null, SVG_D_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_D_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_PATH_DATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_PATH_DATA)); 
// t.put(null, SVG_HORIZ_ADV_X_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_HORIZ_ADV_X_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_NUMBER)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_NUMBER)); 
// t.put(null, SVG_VERT_ORIGIN_X_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_VERT_ORIGIN_X_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_NUMBER)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_NUMBER)); 
// t.put(null, SVG_VERT_ORIGIN_Y_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_VERT_ORIGIN_Y_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_NUMBER)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_NUMBER)); 
// t.put(null, SVG_VERT_ADV_Y_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_VERT_ADV_Y_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_NUMBER)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_NUMBER)); 
// xmlTraitInformation = t; 	TokenNameCOMMENT_LINE	xmlTraitInformation = t; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Creates a new SVGOMMissingGlyphElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMMissingGlyphElement object. 
protected	TokenNameprotected	
SVGOMMissingGlyphElement	TokenNameIdentifier	 SVGOM Missing Glyph Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMMissingGlyphElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMMissingGlyphElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMMissingGlyphElement	TokenNameIdentifier	 SVGOM Missing Glyph Element
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
SVG_MISSING_GLYPH_TAG	TokenNameIdentifier	 SVG  MISSING  GLYPH  TAG
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
SVGOMMissingGlyphElement	TokenNameIdentifier	 SVGOM Missing Glyph Element
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