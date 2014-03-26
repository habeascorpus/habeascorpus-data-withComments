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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
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
SVGTypes	TokenNameIdentifier	 SVG Types
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
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
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
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
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
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
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
SVGFEMorphologyElement	TokenNameIdentifier	 SVGFE Morphology Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGFEMorphologyElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMFEMorphologyElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGFEMorphologyElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMFEMorphologyElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMFEMorphologyElement	TokenNameIdentifier	 SVGOMFE Morphology Element
extends	TokenNameextends	
SVGOMFilterPrimitiveStandardAttributes	TokenNameIdentifier	 SVGOM Filter Primitive Standard Attributes
implements	TokenNameimplements	
SVGFEMorphologyElement	TokenNameIdentifier	 SVGFE Morphology Element
{	TokenNameLBRACE	
/** * Table mapping XML attribute names to TraitInformation objects. */	TokenNameCOMMENT_JAVADOC	 Table mapping XML attribute names to TraitInformation objects. 
protected	TokenNameprotected	
static	TokenNamestatic	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
(	TokenNameLPAREN	
SVGOMFilterPrimitiveStandardAttributes	TokenNameIdentifier	 SVGOM Filter Primitive Standard Attributes
.	TokenNameDOT	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_IN_ATTRIBUTE	TokenNameIdentifier	 SVG  IN  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_CDATA	TokenNameIdentifier	 TYPE  CDATA
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OPERATOR_ATTRIBUTE	TokenNameIdentifier	 SVG  OPERATOR  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_IDENT	TokenNameIdentifier	 TYPE  IDENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RADIUS_ATTRIBUTE	TokenNameIdentifier	 SVG  RADIUS  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER_OPTIONAL_NUMBER	TokenNameIdentifier	 TYPE  NUMBER  OPTIONAL  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'operator' attribute values. */	TokenNameCOMMENT_JAVADOC	 The 'operator' attribute values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
OPERATOR_VALUES	TokenNameIdentifier	 OPERATOR  VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
SVG_ERODE_VALUE	TokenNameIdentifier	 SVG  ERODE  VALUE
,	TokenNameCOMMA	
SVG_DILATE_VALUE	TokenNameIdentifier	 SVG  DILATE  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The 'in' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'in' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
/** * The 'operator' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'operator' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedEnumeration	TokenNameIdentifier	 SVGOM Animated Enumeration
operator	TokenNameIdentifier	 operator
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMFEMorphologyElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFEMorphologyElement object. 
protected	TokenNameprotected	
SVGOMFEMorphologyElement	TokenNameIdentifier	 SVGOMFE Morphology Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMFEMorphologyElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFEMorphologyElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMFEMorphologyElement	TokenNameIdentifier	 SVGOMFE Morphology Element
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
initializeLiveAttributes	TokenNameIdentifier	 initialize Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes all live attributes for this element. */	TokenNameCOMMENT_JAVADOC	 Initializes all live attributes for this element. 
protected	TokenNameprotected	
void	TokenNamevoid	
initializeAllLiveAttributes	TokenNameIdentifier	 initialize All Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
initializeAllLiveAttributes	TokenNameIdentifier	 initialize All Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initializeLiveAttributes	TokenNameIdentifier	 initialize Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes the live attribute values of this element. */	TokenNameCOMMENT_JAVADOC	 Initializes the live attribute values of this element. 
private	TokenNameprivate	
void	TokenNamevoid	
initializeLiveAttributes	TokenNameIdentifier	 initialize Live Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
createLiveAnimatedString	TokenNameIdentifier	 create Live Animated String
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_IN_ATTRIBUTE	TokenNameIdentifier	 SVG  IN  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
createLiveAnimatedEnumeration	TokenNameIdentifier	 create Live Animated Enumeration
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OPERATOR_ATTRIBUTE	TokenNameIdentifier	 SVG  OPERATOR  ATTRIBUTE
,	TokenNameCOMMA	
OPERATOR_VALUES	TokenNameIdentifier	 OPERATOR  VALUES
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
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
SVG_FE_MORPHOLOGY_TAG	TokenNameIdentifier	 SVG  FE  MORPHOLOGY  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEMorphologyElement#getIn1()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEMorphologyElement#getIn1()}. 
public	TokenNamepublic	
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
getIn1	TokenNameIdentifier	 get In1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEMorphologyElement#getOperator()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEMorphologyElement#getOperator()}. 
public	TokenNamepublic	
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
getOperator	TokenNameIdentifier	 get Operator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
operator	TokenNameIdentifier	 operator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEMorphologyElement#getRadiusX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEMorphologyElement#getRadiusX()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getRadiusX	TokenNameIdentifier	 get Radius X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEMorphologyElement.getRadiusX is not implemented"	TokenNameStringLiteral	SVGFEMorphologyElement.getRadiusX is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEMorphologyElement#getRadiusY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEMorphologyElement#getRadiusY()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getRadiusY	TokenNameIdentifier	 get Radius Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEMorphologyElement.getRadiusY is not implemented"	TokenNameStringLiteral	SVGFEMorphologyElement.getRadiusY is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
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
SVGOMFEMorphologyElement	TokenNameIdentifier	 SVGOMFE Morphology Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the table of TraitInformation objects for this element. */	TokenNameCOMMENT_JAVADOC	 Returns the table of TraitInformation objects for this element. 
protected	TokenNameprotected	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
getTraitInformationTable	TokenNameIdentifier	 get Trait Information Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// AnimationTarget /////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	AnimationTarget /////////////////////////////////////////////////////// 
// XXX TBD 	TokenNameCOMMENT_LINE	XXX TBD 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Updates an attribute value in this target. 	TokenNameCOMMENT_LINE	* Updates an attribute value in this target. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void updateAttributeValue(String ns, String ln, 	TokenNameCOMMENT_LINE	public void updateAttributeValue(String ns, String ln, 
// AnimatableValue val) { 	TokenNameCOMMENT_LINE	AnimatableValue val) { 
// if (ns == null) { 	TokenNameCOMMENT_LINE	if (ns == null) { 
// if (ln.equals(SVG_RADIUS_ATTRIBUTE)) { 	TokenNameCOMMENT_LINE	if (ln.equals(SVG_RADIUS_ATTRIBUTE)) { 
// // XXX Needs testing. 	TokenNameCOMMENT_LINE	// XXX Needs testing. 
// if (val == null) { 	TokenNameCOMMENT_LINE	if (val == null) { 
// updateNumberAttributeValue(getRadiusX(), null); 	TokenNameCOMMENT_LINE	updateNumberAttributeValue(getRadiusX(), null); 
// updateNumberAttributeValue(getRadiusY(), null); 	TokenNameCOMMENT_LINE	updateNumberAttributeValue(getRadiusY(), null); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// AnimatableNumberOptionalNumberValue anonv = 	TokenNameCOMMENT_LINE	AnimatableNumberOptionalNumberValue anonv = 
// (AnimatableNumberOptionalNumberValue) val; 	TokenNameCOMMENT_LINE	(AnimatableNumberOptionalNumberValue) val; 
// SVGOMAnimatedNumber ai = 	TokenNameCOMMENT_LINE	SVGOMAnimatedNumber ai = 
// (SVGOMAnimatedNumber) getRadiusX(); 	TokenNameCOMMENT_LINE	(SVGOMAnimatedNumber) getRadiusX(); 
// ai.setAnimatedValue(anonv.getNumber()); 	TokenNameCOMMENT_LINE	ai.setAnimatedValue(anonv.getNumber()); 
// ai = (SVGOMAnimatedNumber) getRadiusY(); 	TokenNameCOMMENT_LINE	ai = (SVGOMAnimatedNumber) getRadiusY(); 
// if (anonv.hasOptionalNumber()) { 	TokenNameCOMMENT_LINE	if (anonv.hasOptionalNumber()) { 
// ai.setAnimatedValue(anonv.getOptionalNumber()); 	TokenNameCOMMENT_LINE	ai.setAnimatedValue(anonv.getOptionalNumber()); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// ai.setAnimatedValue(anonv.getNumber()); 	TokenNameCOMMENT_LINE	ai.setAnimatedValue(anonv.getNumber()); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// return; 	TokenNameCOMMENT_LINE	return; 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// super.updateAttributeValue(ns, ln, val); 	TokenNameCOMMENT_LINE	super.updateAttributeValue(ns, ln, val); 
// } 	TokenNameCOMMENT_LINE	} 
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Returns the underlying value of an animatable XML attribute. 	TokenNameCOMMENT_LINE	* Returns the underlying value of an animatable XML attribute. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public AnimatableValue getUnderlyingValue(String ns, String ln) { 	TokenNameCOMMENT_LINE	public AnimatableValue getUnderlyingValue(String ns, String ln) { 
// if (ns == null) { 	TokenNameCOMMENT_LINE	if (ns == null) { 
// if (ln.equals(SVG_RADIUS_ATTRIBUTE)) { 	TokenNameCOMMENT_LINE	if (ln.equals(SVG_RADIUS_ATTRIBUTE)) { 
// return getBaseValue(getRadiusX(), getRadiusY()); 	TokenNameCOMMENT_LINE	return getBaseValue(getRadiusX(), getRadiusY()); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// return super.getUnderlyingValue(ns, ln); 	TokenNameCOMMENT_LINE	return super.getUnderlyingValue(ns, ln); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
