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
SVGAnimatedBoolean	TokenNameIdentifier	 SVG Animated Boolean
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
SVGAnimatedInteger	TokenNameIdentifier	 SVG Animated Integer
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
SVGAnimatedNumberList	TokenNameIdentifier	 SVG Animated Number List
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
SVGFEConvolveMatrixElement	TokenNameIdentifier	 SVGFE Convolve Matrix Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGFEConvolveMatrixElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMFEConvolveMatrixElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGFEConvolveMatrixElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMFEConvolveMatrixElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMFEConvolveMatrixElement	TokenNameIdentifier	 SVGOMFE Convolve Matrix Element
extends	TokenNameextends	
SVGOMFilterPrimitiveStandardAttributes	TokenNameIdentifier	 SVGOM Filter Primitive Standard Attributes
implements	TokenNameimplements	
SVGFEConvolveMatrixElement	TokenNameIdentifier	 SVGFE Convolve Matrix Element
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
SVG_ORDER_ATTRIBUTE	TokenNameIdentifier	 SVG  ORDER  ATTRIBUTE
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
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNEL  UNIT  LENGTH  ATTRIBUTE
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
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_KERNEL_MATRIX_ATTRIBUTE	TokenNameIdentifier	 SVG  KERNEL  MATRIX  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_NUMBER_LIST	TokenNameIdentifier	 TYPE  NUMBER  LIST
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_DIVISOR_ATTRIBUTE	TokenNameIdentifier	 SVG  DIVISOR  ATTRIBUTE
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
SVG_BIAS_ATTRIBUTE	TokenNameIdentifier	 SVG  BIAS  ATTRIBUTE
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
SVG_TARGET_X_ATTRIBUTE	TokenNameIdentifier	 SVG  TARGET  X  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_INTEGER	TokenNameIdentifier	 TYPE  INTEGER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TARGET_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  TARGET  Y  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_INTEGER	TokenNameIdentifier	 TYPE  INTEGER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_EDGE_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  EDGE  MODE  ATTRIBUTE
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
SVG_PRESERVE_ALPHA_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ALPHA  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_BOOLEAN	TokenNameIdentifier	 TYPE  BOOLEAN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'edgeMode' attribute values. */	TokenNameCOMMENT_JAVADOC	 The 'edgeMode' attribute values. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EDGE_MODE_VALUES	TokenNameIdentifier	 EDGE  MODE  VALUES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
SVG_DUPLICATE_VALUE	TokenNameIdentifier	 SVG  DUPLICATE  VALUE
,	TokenNameCOMMA	
SVG_WRAP_VALUE	TokenNameIdentifier	 SVG  WRAP  VALUE
,	TokenNameCOMMA	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * The 'in' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'in' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedString	TokenNameIdentifier	 SVGOM Animated String
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
/** * The 'edgeMode' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'edgeMode' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedEnumeration	TokenNameIdentifier	 SVGOM Animated Enumeration
edgeMode	TokenNameIdentifier	 edge Mode
;	TokenNameSEMICOLON	
/** * The 'bias' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'bias' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedNumber	TokenNameIdentifier	 SVGOM Animated Number
bias	TokenNameIdentifier	 bias
;	TokenNameSEMICOLON	
/** * The 'preserveAlpha' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'preserveAlpha' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedBoolean	TokenNameIdentifier	 SVGOM Animated Boolean
preserveAlpha	TokenNameIdentifier	 preserve Alpha
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMFEConvolveMatrixElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFEConvolveMatrixElement object. 
protected	TokenNameprotected	
SVGOMFEConvolveMatrixElement	TokenNameIdentifier	 SVGOMFE Convolve Matrix Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMFEConvolveMatrixElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMFEConvolveMatrixElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMFEConvolveMatrixElement	TokenNameIdentifier	 SVGOMFE Convolve Matrix Element
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
edgeMode	TokenNameIdentifier	 edge Mode
=	TokenNameEQUAL	
createLiveAnimatedEnumeration	TokenNameIdentifier	 create Live Animated Enumeration
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_EDGE_MODE_ATTRIBUTE	TokenNameIdentifier	 SVG  EDGE  MODE  ATTRIBUTE
,	TokenNameCOMMA	
EDGE_MODE_VALUES	TokenNameIdentifier	 EDGE  MODE  VALUES
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bias	TokenNameIdentifier	 bias
=	TokenNameEQUAL	
createLiveAnimatedNumber	TokenNameIdentifier	 create Live Animated Number
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_BIAS_ATTRIBUTE	TokenNameIdentifier	 SVG  BIAS  ATTRIBUTE
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preserveAlpha	TokenNameIdentifier	 preserve Alpha
=	TokenNameEQUAL	
createLiveAnimatedBoolean	TokenNameIdentifier	 create Live Animated Boolean
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_PRESERVE_ALPHA_ATTRIBUTE	TokenNameIdentifier	 SVG  PRESERVE  ALPHA  ATTRIBUTE
,	TokenNameCOMMA	
false	TokenNamefalse	
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
SVG_FE_CONVOLVE_MATRIX_TAG	TokenNameIdentifier	 SVG  FE  CONVOLVE  MATRIX  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getIn1()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getIn1()}. 
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
/** * <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getEdgeMode()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getEdgeMode()}. 
public	TokenNamepublic	
SVGAnimatedEnumeration	TokenNameIdentifier	 SVG Animated Enumeration
getEdgeMode	TokenNameIdentifier	 get Edge Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
edgeMode	TokenNameIdentifier	 edge Mode
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getKernelMatrix()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getKernelMatrix()}. 
public	TokenNamepublic	
SVGAnimatedNumberList	TokenNameIdentifier	 SVG Animated Number List
getKernelMatrix	TokenNameIdentifier	 get Kernel Matrix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEConvolveMatrixElement.getKernelMatrix is not implemented"	TokenNameStringLiteral	SVGFEConvolveMatrixElement.getKernelMatrix is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getOrderX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getOrderX()}. 
public	TokenNamepublic	
SVGAnimatedInteger	TokenNameIdentifier	 SVG Animated Integer
getOrderX	TokenNameIdentifier	 get Order X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEConvolveMatrixElement.getOrderX is not implemented"	TokenNameStringLiteral	SVGFEConvolveMatrixElement.getOrderX is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getOrderY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getOrderY()}. 
public	TokenNamepublic	
SVGAnimatedInteger	TokenNameIdentifier	 SVG Animated Integer
getOrderY	TokenNameIdentifier	 get Order Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEConvolveMatrixElement.getOrderY is not implemented"	TokenNameStringLiteral	SVGFEConvolveMatrixElement.getOrderY is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getTargetX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getTargetX()}. 
public	TokenNamepublic	
SVGAnimatedInteger	TokenNameIdentifier	 SVG Animated Integer
getTargetX	TokenNameIdentifier	 get Target X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Default value relative to orderX... 	TokenNameCOMMENT_LINE	Default value relative to orderX... 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEConvolveMatrixElement.getTargetX is not implemented"	TokenNameStringLiteral	SVGFEConvolveMatrixElement.getTargetX is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getTargetY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getTargetY()}. 
public	TokenNamepublic	
SVGAnimatedInteger	TokenNameIdentifier	 SVG Animated Integer
getTargetY	TokenNameIdentifier	 get Target Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Default value relative to orderY... 	TokenNameCOMMENT_LINE	Default value relative to orderY... 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEConvolveMatrixElement.getTargetY is not implemented"	TokenNameStringLiteral	SVGFEConvolveMatrixElement.getTargetY is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getDivisor()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGFEConvolveMatrixElement#getDivisor()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getDivisor	TokenNameIdentifier	 get Divisor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Default value relative to kernel matrix... 	TokenNameCOMMENT_LINE	Default value relative to kernel matrix... 
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEConvolveMatrixElement.getDivisor is not implemented"	TokenNameStringLiteral	SVGFEConvolveMatrixElement.getDivisor is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGFEConvolveMatrixElement#getBias()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGFEConvolveMatrixElement#getBias()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getBias	TokenNameIdentifier	 get Bias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bias	TokenNameIdentifier	 bias
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGFEConvolveMatrixElement#getKernelUnitLengthX()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGFEConvolveMatrixElement#getKernelUnitLengthX()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getKernelUnitLengthX	TokenNameIdentifier	 get Kernel Unit Length X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEConvolveMatrixElement.getKernelUnitLengthX is not implemented"	TokenNameStringLiteral	SVGFEConvolveMatrixElement.getKernelUnitLengthX is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGFEConvolveMatrixElement#getKernelUnitLengthY()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGFEConvolveMatrixElement#getKernelUnitLengthY()}. 
public	TokenNamepublic	
SVGAnimatedNumber	TokenNameIdentifier	 SVG Animated Number
getKernelUnitLengthY	TokenNameIdentifier	 get Kernel Unit Length Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"SVGFEConvolveMatrixElement.getKernelUnitLengthY is not implemented"	TokenNameStringLiteral	SVGFEConvolveMatrixElement.getKernelUnitLengthY is not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// XXX 	TokenNameCOMMENT_LINE	XXX 
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGFEConvolveMatrixElement#getPreserveAlpha()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGFEConvolveMatrixElement#getPreserveAlpha()}. 
public	TokenNamepublic	
SVGAnimatedBoolean	TokenNameIdentifier	 SVG Animated Boolean
getPreserveAlpha	TokenNameIdentifier	 get Preserve Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
preserveAlpha	TokenNameIdentifier	 preserve Alpha
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
SVGOMFEConvolveMatrixElement	TokenNameIdentifier	 SVGOMFE Convolve Matrix Element
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
// if (ln.equals(SVG_ORDER_ATTRIBUTE)) { 	TokenNameCOMMENT_LINE	if (ln.equals(SVG_ORDER_ATTRIBUTE)) { 
// if (val == null) { 	TokenNameCOMMENT_LINE	if (val == null) { 
// // XXX Needs testing. 	TokenNameCOMMENT_LINE	// XXX Needs testing. 
// updateIntegerAttributeValue(getOrderX(), null); 	TokenNameCOMMENT_LINE	updateIntegerAttributeValue(getOrderX(), null); 
// updateIntegerAttributeValue(getOrderY(), null); 	TokenNameCOMMENT_LINE	updateIntegerAttributeValue(getOrderY(), null); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// AnimatableNumberOptionalNumberValue anonv = 	TokenNameCOMMENT_LINE	AnimatableNumberOptionalNumberValue anonv = 
// (AnimatableNumberOptionalNumberValue) val; 	TokenNameCOMMENT_LINE	(AnimatableNumberOptionalNumberValue) val; 
// SVGOMAnimatedInteger ai = 	TokenNameCOMMENT_LINE	SVGOMAnimatedInteger ai = 
// (SVGOMAnimatedInteger) getOrderX(); 	TokenNameCOMMENT_LINE	(SVGOMAnimatedInteger) getOrderX(); 
// ai.setAnimatedValue(Math.round(anonv.getNumber())); 	TokenNameCOMMENT_LINE	ai.setAnimatedValue(Math.round(anonv.getNumber())); 
// ai = (SVGOMAnimatedInteger) getOrderY(); 	TokenNameCOMMENT_LINE	ai = (SVGOMAnimatedInteger) getOrderY(); 
// if (anonv.hasOptionalNumber()) { 	TokenNameCOMMENT_LINE	if (anonv.hasOptionalNumber()) { 
// ai.setAnimatedValue 	TokenNameCOMMENT_LINE	ai.setAnimatedValue 
// (Math.round(anonv.getOptionalNumber())); 	TokenNameCOMMENT_LINE	(Math.round(anonv.getOptionalNumber())); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// ai.setAnimatedValue(Math.round(anonv.getNumber())); 	TokenNameCOMMENT_LINE	ai.setAnimatedValue(Math.round(anonv.getNumber())); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// return; 	TokenNameCOMMENT_LINE	return; 
// } else if (ln.equals(SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE)) { 	TokenNameCOMMENT_LINE	} else if (ln.equals(SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE)) { 
// // XXX Needs testing. 	TokenNameCOMMENT_LINE	// XXX Needs testing. 
// if (val == null) { 	TokenNameCOMMENT_LINE	if (val == null) { 
// updateNumberAttributeValue(getKernelUnitLengthX(), null); 	TokenNameCOMMENT_LINE	updateNumberAttributeValue(getKernelUnitLengthX(), null); 
// updateNumberAttributeValue(getKernelUnitLengthY(), null); 	TokenNameCOMMENT_LINE	updateNumberAttributeValue(getKernelUnitLengthY(), null); 
// } else { 	TokenNameCOMMENT_LINE	} else { 
// AnimatableNumberOptionalNumberValue anonv = 	TokenNameCOMMENT_LINE	AnimatableNumberOptionalNumberValue anonv = 
// (AnimatableNumberOptionalNumberValue) val; 	TokenNameCOMMENT_LINE	(AnimatableNumberOptionalNumberValue) val; 
// SVGOMAnimatedNumber an = 	TokenNameCOMMENT_LINE	SVGOMAnimatedNumber an = 
// (SVGOMAnimatedNumber) getKernelUnitLengthX(); 	TokenNameCOMMENT_LINE	(SVGOMAnimatedNumber) getKernelUnitLengthX(); 
// an.setAnimatedValue(anonv.getNumber()); 	TokenNameCOMMENT_LINE	an.setAnimatedValue(anonv.getNumber()); 
// an = (SVGOMAnimatedNumber) getKernelUnitLengthY(); 	TokenNameCOMMENT_LINE	an = (SVGOMAnimatedNumber) getKernelUnitLengthY(); 
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
// if (ln.equals(SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE)) { 	TokenNameCOMMENT_LINE	if (ln.equals(SVG_KERNEL_UNIT_LENGTH_ATTRIBUTE)) { 
// return getBaseValue(getKernelUnitLengthX(), 	TokenNameCOMMENT_LINE	return getBaseValue(getKernelUnitLengthX(), 
// getKernelUnitLengthY()); 	TokenNameCOMMENT_LINE	getKernelUnitLengthY()); 
// } else if (ln.equals(SVG_ORDER_ATTRIBUTE)) { 	TokenNameCOMMENT_LINE	} else if (ln.equals(SVG_ORDER_ATTRIBUTE)) { 
// return getBaseValue(getOrderX(), getOrderY()); 	TokenNameCOMMENT_LINE	return getBaseValue(getOrderX(), getOrderY()); 
// } 	TokenNameCOMMENT_LINE	} 
// } 	TokenNameCOMMENT_LINE	} 
// return super.getUnderlyingValue(ns, ln); 	TokenNameCOMMENT_LINE	return super.getUnderlyingValue(ns, ln); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
