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
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
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
SVGLineElement	TokenNameIdentifier	 SVG Line Element
;	TokenNameSEMICOLON	
/** * This class implements {@link SVGLineElement}. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMLineElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements {@link SVGLineElement}. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMLineElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGOMLineElement	TokenNameIdentifier	 SVGOM Line Element
extends	TokenNameextends	
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
implements	TokenNameimplements	
SVGLineElement	TokenNameIdentifier	 SVG Line Element
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
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
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
SVG_X1_ATTRIBUTE	TokenNameIdentifier	 SVG  X1  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y1_ATTRIBUTE	TokenNameIdentifier	 SVG  Y1  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X2_ATTRIBUTE	TokenNameIdentifier	 SVG  X2  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_WIDTH	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  WIDTH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y2_ATTRIBUTE	TokenNameIdentifier	 SVG  Y2  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_LENGTH	TokenNameIdentifier	 TYPE  LENGTH
,	TokenNameCOMMA	
PERCENTAGE_VIEWPORT_HEIGHT	TokenNameIdentifier	 PERCENTAGE  VIEWPORT  HEIGHT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'x1' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'x1' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
/** * The 'y1' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'y1' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
/** * The 'x2' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'x2' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
/** * The 'y2' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'y2' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMLineElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMLineElement object. 
protected	TokenNameprotected	
SVGOMLineElement	TokenNameIdentifier	 SVGOM Line Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMLineElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMLineElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGOMLineElement	TokenNameIdentifier	 SVGOM Line Element
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
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X1_ATTRIBUTE	TokenNameIdentifier	 SVG  X1  ATTRIBUTE
,	TokenNameCOMMA	
SVG_LINE_X1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINE  X1  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y1_ATTRIBUTE	TokenNameIdentifier	 SVG  Y1  ATTRIBUTE
,	TokenNameCOMMA	
SVG_LINE_Y1_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINE  Y1  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X2_ATTRIBUTE	TokenNameIdentifier	 SVG  X2  ATTRIBUTE
,	TokenNameCOMMA	
SVG_LINE_X2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINE  X2  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
createLiveAnimatedLength	TokenNameIdentifier	 create Live Animated Length
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y2_ATTRIBUTE	TokenNameIdentifier	 SVG  Y2  ATTRIBUTE
,	TokenNameCOMMA	
SVG_LINE_Y2_DEFAULT_VALUE	TokenNameIdentifier	 SVG  LINE  Y2  DEFAULT  VALUE
,	TokenNameCOMMA	
SVGOMAnimatedLength	TokenNameIdentifier	 SVGOM Animated Length
.	TokenNameDOT	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
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
SVG_LINE_TAG	TokenNameIdentifier	 SVG  LINE  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGLineElement#getX1()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGLineElement#getX1()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getX1	TokenNameIdentifier	 get X1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGLineElement#getY1()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGLineElement#getY1()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getY1	TokenNameIdentifier	 get Y1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGLineElement#getX2()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGLineElement#getX2()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getX2	TokenNameIdentifier	 get X2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGLineElement#getY2()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGLineElement#getY2()}. 
public	TokenNamepublic	
SVGAnimatedLength	TokenNameIdentifier	 SVG Animated Length
getY2	TokenNameIdentifier	 get Y2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y2	TokenNameIdentifier	 y2
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
SVGOMLineElement	TokenNameIdentifier	 SVGOM Line Element
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
