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
SVGFECompositeElement	TokenNameIdentifier	 SVGFE Composite Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGFECompositeElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMFECompositeElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGFECompositeElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMFECompositeElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMFECompositeElement	TokenNameIdentifier	 SVGOMFE Composite Element
extends	TokenNameextends	
SVGOMFilterPrimitiveStandardAttributes	TokenNameIdentifier	 SVGOM Filter Primitive Standard Attributes
implements	TokenNameimplements	
SVGFECompositeElement	TokenNameIdentifier	 SVGFE Composite Element
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
SVG_IN2_ATTRIBUTE	TokenNameIdentifier	 SVG  I N2  ATTRIBUTE
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
SVG_K1_ATTRIBUTE	TokenNameIdentifier	 SVG  K1  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER	TokenNameIdentifier	 TYPE  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K2_ATTRIBUTE	TokenNameIdentifier	 SVG  K2  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER	TokenNameIdentifier	 TYPE  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K3_ATTRIBUTE	TokenNameIdentifier	 SVG  K3  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER	TokenNameIdentifier	 TYPE  NUMBER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K4_ATTRIBUTE	TokenNameIdentifier	 SVG  K4  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER	TokenNameIdentifier	 TYPE  NUMBER
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
SVG_OVER_VALUE	TokenNameIdentifier	 SVG  OVER  VALUE
,	TokenNameCOMMA	
SVG_IN_VALUE	TokenNameIdentifier	 SVG  IN  VALUE
,	TokenNameCOMMA	
SVG_OUT_VALUE	TokenNameIdentifier	 SVG  OUT  VALUE
,	TokenNameCOMMA	
SVG_ATOP_VALUE	TokenNameIdentifier	 SVG  ATOP  VALUE
,	TokenNameCOMMA	
SVG_XOR_VALUE	TokenNameIdentifier	 SVG  XOR  VALUE
,	TokenNameCOMMA	
SVG_ARITHMETIC_VALUE	TokenNameIdentifier	 SVG  ARITHMETIC  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The 'in' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'in' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
/** * The 'in2' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'in2' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
in2	TokenNameIdentifier	 in2
;	TokenNameSEMICOLON	
/** * The 'operator' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'operator' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedEnumeration	TokenNameIdentifier	 SVGOM Animated Enumeration
operator	TokenNameIdentifier	 operator
;	TokenNameSEMICOLON	
/** * The 'k1' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'k1' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
k1	TokenNameIdentifier	 k1
;	TokenNameSEMICOLON	
/** * The 'k2' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'k2' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
/** * The 'k3' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'k3' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
k3	TokenNameIdentifier	 k3
;	TokenNameSEMICOLON	
/** * The 'k4' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'k4' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
k4	TokenNameIdentifier	 k4
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMFECompositeElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFECompositeElement object. 
protected	TokenNameprotected	
SVGOMFECompositeElement	TokenNameIdentifier	 SVGOMFE Composite Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMFECompositeElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFECompositeElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMFECompositeElement	TokenNameIdentifier	 SVGOMFE Composite Element
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
in2	TokenNameIdentifier	 in2
=	TokenNameEQUAL	
createLiveAnimatedString	TokenNameIdentifier	 create Live Animated String
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_IN2_ATTRIBUTE	TokenNameIdentifier	 SVG  I N2  ATTRIBUTE
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
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K1_ATTRIBUTE	TokenNameIdentifier	 SVG  K1  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K2_ATTRIBUTE	TokenNameIdentifier	 SVG  K2  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k3	TokenNameIdentifier	 k3
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K3_ATTRIBUTE	TokenNameIdentifier	 SVG  K3  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k4	TokenNameIdentifier	 k4
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K4_ATTRIBUTE	TokenNameIdentifier	 SVG  K4  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
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
SVG_FE_COMPOSITE_TAG	TokenNameIdentifier	 SVG  FE  COMPOSITE  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFECompositeElement#getIn1()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFECompositeElement#getIn1()}. 
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
/** * <b>DOM</b>: Implements {@link SVGFECompositeElement#getIn2()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFECompositeElement#getIn2()}. 
public	TokenNamepublic	
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
getIn2	TokenNameIdentifier	 get In2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
in2	TokenNameIdentifier	 in2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFECompositeElement#getOperator()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFECompositeElement#getOperator()}. 
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
/** * <b>DOM</b>: Implements {@link SVGFECompositeElement#getK1()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFECompositeElement#getK1()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getK1	TokenNameIdentifier	 get K1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
k1	TokenNameIdentifier	 k1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFECompositeElement#getK2()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFECompositeElement#getK2()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getK2	TokenNameIdentifier	 get K2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFECompositeElement#getK3()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFECompositeElement#getK3()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getK3	TokenNameIdentifier	 get K3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
k3	TokenNameIdentifier	 k3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFECompositeElement#getK4()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFECompositeElement#getK4()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getK4	TokenNameIdentifier	 get K4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
k4	TokenNameIdentifier	 k4
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
SVGOMFECompositeElement	TokenNameIdentifier	 SVGOMFE Composite Element
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
}	TokenNameRBRACE	
