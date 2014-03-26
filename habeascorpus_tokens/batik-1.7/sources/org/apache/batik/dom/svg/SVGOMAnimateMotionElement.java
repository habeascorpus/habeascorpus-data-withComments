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
SVGAnimateMotionElement	TokenNameIdentifier	 SVG Animate Motion Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGAnimateMotionElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMAnimateMotionElement.java 489964 2006-12-24 01:30:23Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGAnimateMotionElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMAnimateMotionElement.java 489964 2006-12-24 01:30:23Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMAnimateMotionElement	TokenNameIdentifier	 SVGOM Animate Motion Element
extends	TokenNameextends	
SVGOMAnimationElement	TokenNameIdentifier	 SVGOM Animation Element
implements	TokenNameimplements	
SVGAnimateMotionElement	TokenNameIdentifier	 SVG Animate Motion Element
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
1	TokenNameIntegerLiteral	
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
SVG_CALC_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  CALC  MODE  ATTRIBUTE
,	TokenNameCOMMA	
SVG_PACED_VALUE	TokenNameIdentifier	 SVG  PACED  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Table mapping XML attribute names to TraitInformation objects. 	TokenNameCOMMENT_LINE	* Table mapping XML attribute names to TraitInformation objects. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected static DoublyIndexedTable xmlTraitInformation; 	TokenNameCOMMENT_LINE	protected static DoublyIndexedTable xmlTraitInformation; 
// static { 	TokenNameCOMMENT_LINE	static { 
// DoublyIndexedTable t = 	TokenNameCOMMENT_LINE	DoublyIndexedTable t = 
// new DoublyIndexedTable(SVGOMAnimationElement.xmlTraitInformation); 	TokenNameCOMMENT_LINE	new DoublyIndexedTable(SVGOMAnimationElement.xmlTraitInformation); 
// t.put(null, SVG_ACCUMULATE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ACCUMULATE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_ADDITIVE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ADDITIVE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_ATTRIBUTE_TYPE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ATTRIBUTE_TYPE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_CALC_MODE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_CALC_MODE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_FILL_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FILL_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_ORIGIN_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ORIGIN_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_RESTART_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_RESTART_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_IDENT)); 
// t.put(null, SVG_ATTRIBUTE_NAME_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ATTRIBUTE_NAME_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_BY_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_BY_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_FROM_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_FROM_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_MAX_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_MAX_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_MIN_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_MIN_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_TO_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_TO_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_VALUES_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_VALUES_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_CDATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_CDATA)); 
// t.put(null, SVG_BEGIN_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_BEGIN_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_TIMING_SPECIFIER_LIST)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_TIMING_SPECIFIER_LIST)); 
// t.put(null, SVG_END_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_END_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_TIMING_SPECIFIER_LIST)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_TIMING_SPECIFIER_LIST)); 
// t.put(null, SVG_DUR_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_DUR_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_TIME)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_TIME)); 
// t.put(null, SVG_REPEAT_DUR_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_REPEAT_DUR_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_TIME)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_TIME)); 
// t.put(null, SVG_KEY_POINTS_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_KEY_POINTS_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_NUMBER_LIST)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_NUMBER_LIST)); 
// t.put(null, SVG_KEY_SPLINES_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_KEY_SPLINES_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_NUMBER_LIST)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_NUMBER_LIST)); 
// t.put(null, SVG_KEY_TIMES_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_KEY_TIMES_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_NUMBER_LIST)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_NUMBER_LIST)); 
// t.put(null, SVG_ROTATE_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_ROTATE_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_ANGLE_OR_IDENT)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_ANGLE_OR_IDENT)); 
// t.put(null, SVG_REPEAT_COUNT_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_REPEAT_COUNT_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_INTEGER)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_INTEGER)); 
// t.put(null, SVG_D_ATTRIBUTE, 	TokenNameCOMMENT_LINE	t.put(null, SVG_D_ATTRIBUTE, 
// new TraitInformation(false, SVGTypes.TYPE_PATH_DATA)); 	TokenNameCOMMENT_LINE	new TraitInformation(false, SVGTypes.TYPE_PATH_DATA)); 
// xmlTraitInformation = t; 	TokenNameCOMMENT_LINE	xmlTraitInformation = t; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Creates a new SVGOMAnimateMotionElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimateMotionElement object. 
protected	TokenNameprotected	
SVGOMAnimateMotionElement	TokenNameIdentifier	 SVGOM Animate Motion Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMAnimateMotionElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimateMotionElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMAnimateMotionElement	TokenNameIdentifier	 SVGOM Animate Motion Element
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
SVG_ANIMATE_MOTION_TAG	TokenNameIdentifier	 SVG  ANIMATE  MOTION  TAG
;	TokenNameSEMICOLON	
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
SVGOMAnimateMotionElement	TokenNameIdentifier	 SVGOM Animate Motion Element
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
