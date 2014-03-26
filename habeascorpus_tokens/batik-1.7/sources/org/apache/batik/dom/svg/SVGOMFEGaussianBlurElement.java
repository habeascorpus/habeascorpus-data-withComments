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
SVGFEGaussianBlurElement	TokenNameIdentifier	 SVGFE Gaussian Blur Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGFEGaussianBlurElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMFEGaussianBlurElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGFEGaussianBlurElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMFEGaussianBlurElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMFEGaussianBlurElement	TokenNameIdentifier	 SVGOMFE Gaussian Blur Element
extends	TokenNameextends	
SVGOMFilterPrimitiveStandardAttributes	TokenNameIdentifier	 SVGOM Filter Primitive Standard Attributes
implements	TokenNameimplements	
SVGFEGaussianBlurElement	TokenNameIdentifier	 SVGFE Gaussian Blur Element
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
SVG_STD_DEVIATION_ATTRIBUTE	TokenNameIdentifier	 SVG  STD  DEVIATION  ATTRIBUTE
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
/** * The 'in' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'in' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMFEGaussianBlurElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFEGaussianBlurElement object. 
protected	TokenNameprotected	
SVGOMFEGaussianBlurElement	TokenNameIdentifier	 SVGOMFE Gaussian Blur Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMFEGaussianBlurElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFEGaussianBlurElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMFEGaussianBlurElement	TokenNameIdentifier	 SVGOMFE Gaussian Blur Element
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
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link Node#getLocalName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link Node#getLocalName()}. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_FE_GAUSSIAN_BLUR_TAG	TokenNameIdentifier	 SVG  FE  GAUSSIAN  BLUR  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEGaussianBlurElement#getIn1()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEGaussianBlurElement#getIn1()}. 
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
/** * <b>DOM</b>: Implements {@link * SVGFEGaussianBlurElement#getStdDeviationX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEGaussianBlurElement#getStdDeviationX()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getStdDeviationX	TokenNameIdentifier	 get Std Deviation X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEGaussianBlurElement.getStdDeviationX is not implemented"	TokenNameStringLiteral	SVGFEGaussianBlurElement.getStdDeviationX is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGFEGaussianBlurElement#getStdDeviationY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEGaussianBlurElement#getStdDeviationY()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getStdDeviationY	TokenNameIdentifier	 get Std Deviation Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEGaussianBlurElement.getStdDeviationY is not implemented"	TokenNameStringLiteral	SVGFEGaussianBlurElement.getStdDeviationY is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * SVGFEGaussianBlurElement#setStdDeviation(float,float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEGaussianBlurElement#setStdDeviation(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
setStdDeviation	TokenNameIdentifier	 set Std Deviation
(	TokenNameLPAREN	
float	TokenNamefloat	
devX	TokenNameIdentifier	 dev X
,	TokenNameCOMMA	
float	TokenNamefloat	
devY	TokenNameIdentifier	 dev Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_STD_DEVIATION_ATTRIBUTE	TokenNameIdentifier	 SVG  STD  DEVIATION  ATTRIBUTE
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
devX	TokenNameIdentifier	 dev X
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
devY	TokenNameIdentifier	 dev Y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
SVGOMFEGaussianBlurElement	TokenNameIdentifier	 SVGOMFE Gaussian Blur Element
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
// 	TokenNameCOMMENT_LINE	 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Updates an attribute value in this target. 	TokenNameCOMMENT_LINE	* Updates an attribute value in this target. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void updateAttributeValue(String ns, String ln, 	TokenNameCOMMENT_LINE	public void updateAttributeValue(String ns, String ln, 
// AnimatableValue val) { 	TokenNameCOMMENT_LINE	AnimatableValue val) { 
// if (ns == null) { 	TokenNameCOMMENT_LINE	if (ns == null) { 
// if (ln.equals(SVG_STD_DEVIATION_ATTRIBUTE)) { 	TokenNameCOMMENT_LINE	if (ln.equals(SVG_STD_DEVIATION_ATTRIBUTE)) { 
// // XXX Needs testing. 	TokenNameCOMMENT_LINE	// XXX Needs testing. 
// if (val == null) { 	TokenNameCOMMENT_LINE	if (val == null) { 
// updateNumberAttributeValue(getStdDeviationX(), null); 	TokenNameCOMMENT_LINE	updateNumberAttributeValue(getStdDeviationX(), null); 
// updateNumberAttributeValue(getStdDeviationY(), null); 	TokenNameCOMMENT_LINE	updateNumberAttributeValue(getStdDeviationY(), null); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// AnimatableNumberOptionalNumberValue anonv = 	TokenNameCOMMENT_LINE	AnimatableNumberOptionalNumberValue anonv = 
// (AnimatableNumberOptionalNumberValue) val; 	TokenNameCOMMENT_LINE	(AnimatableNumberOptionalNumberValue) val; 
// SVGOMAnimatedNumber an = 	TokenNameCOMMENT_LINE	SVGOMAnimatedNumber an = 
// (SVGOMAnimatedNumber) getStdDeviationX(); 	TokenNameCOMMENT_LINE	(SVGOMAnimatedNumber) getStdDeviationX(); 
// an.setAnimatedValue(anonv.getNumber()); 	TokenNameCOMMENT_LINE	an.setAnimatedValue(anonv.getNumber()); 
// an = (SVGOMAnimatedNumber) getStdDeviationY(); 	TokenNameCOMMENT_LINE	an = (SVGOMAnimatedNumber) getStdDeviationY(); 
// if (anonv.hasOptionalNumber()) { 	TokenNameCOMMENT_LINE	if (anonv.hasOptionalNumber()) { 
// an.setAnimatedValue(anonv.getOptionalNumber()); 	TokenNameCOMMENT_LINE	an.setAnimatedValue(anonv.getOptionalNumber()); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// an.setAnimatedValue(anonv.getNumber()); 	TokenNameCOMMENT_LINE	an.setAnimatedValue(anonv.getNumber()); 
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
// if (ln.equals(SVG_STD_DEVIATION_ATTRIBUTE)) { 	TokenNameCOMMENT_LINE	if (ln.equals(SVG_STD_DEVIATION_ATTRIBUTE)) { 
// return getBaseValue(getStdDeviationX(), getStdDeviationY()); 	TokenNameCOMMENT_LINE	return getBaseValue(getStdDeviationX(), getStdDeviationY()); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// return super.getUnderlyingValue(ns, ln); 	TokenNameCOMMENT_LINE	return super.getUnderlyingValue(ns, ln); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
