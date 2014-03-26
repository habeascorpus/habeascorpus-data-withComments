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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGAnimatedPoints	TokenNameIdentifier	 SVG Animated Points
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
SVGPointList	TokenNameIdentifier	 SVG Point List
;	TokenNameSEMICOLON	
/** * This class provides a common superclass for shape elements that are * defined with a 'points' attribute (i.e., polygon and polyline). * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: SVGPointShapeElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides a common superclass for shape elements that are defined with a 'points' attribute (i.e., polygon and polyline). * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: SVGPointShapeElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SVGPointShapeElement	TokenNameIdentifier	 SVG Point Shape Element
extends	TokenNameextends	
SVGGraphicsElement	TokenNameIdentifier	 SVG Graphics Element
implements	TokenNameimplements	
SVGAnimatedPoints	TokenNameIdentifier	 SVG Animated Points
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
SVG_POINTS_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  ATTRIBUTE
,	TokenNameCOMMA	
new	TokenNamenew	
TraitInformation	TokenNameIdentifier	 Trait Information
(	TokenNameLPAREN	
true	TokenNametrue	
,	TokenNameCOMMA	
SVGTypes	TokenNameIdentifier	 SVG Types
.	TokenNameDOT	
TYPE_POINTS_VALUE	TokenNameIdentifier	 TYPE  POINTS  VALUE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xmlTraitInformation	TokenNameIdentifier	 xml Trait Information
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The 'points' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'points' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedPoints	TokenNameIdentifier	 SVGOM Animated Points
points	TokenNameIdentifier	 points
;	TokenNameSEMICOLON	
/** * Creates a new SVGPointShapeElement object. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGPointShapeElement object. 
protected	TokenNameprotected	
SVGPointShapeElement	TokenNameIdentifier	 SVG Point Shape Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGPointShapeElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGPointShapeElement object. @param prefix The namespace prefix. @param owner The owner document. 
public	TokenNamepublic	
SVGPointShapeElement	TokenNameIdentifier	 SVG Point Shape Element
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
points	TokenNameIdentifier	 points
=	TokenNameEQUAL	
createLiveAnimatedPoints	TokenNameIdentifier	 create Live Animated Points
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_POINTS_ATTRIBUTE	TokenNameIdentifier	 SVG  POINTS  ATTRIBUTE
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the {@link SVGOMAnimatedPoints} object that manages the * point list for this element. */	TokenNameCOMMENT_JAVADOC	 Gets the {@link SVGOMAnimatedPoints} object that manages the point list for this element. 
public	TokenNamepublic	
SVGOMAnimatedPoints	TokenNameIdentifier	 SVGOM Animated Points
getSVGOMAnimatedPoints	TokenNameIdentifier	 get SVGOM Animated Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
points	TokenNameIdentifier	 points
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGAnimatedPoints#getPoints()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGAnimatedPoints#getPoints()}. 
public	TokenNamepublic	
SVGPointList	TokenNameIdentifier	 SVG Point List
getPoints	TokenNameIdentifier	 get Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
getPoints	TokenNameIdentifier	 get Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGAnimatedPoints#getAnimatedPoints()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGAnimatedPoints#getAnimatedPoints()}. 
public	TokenNamepublic	
SVGPointList	TokenNameIdentifier	 SVG Point List
getAnimatedPoints	TokenNameIdentifier	 get Animated Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
points	TokenNameIdentifier	 points
.	TokenNameDOT	
getAnimatedPoints	TokenNameIdentifier	 get Animated Points
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
