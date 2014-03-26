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
anim	TokenNameIdentifier	 anim
.	TokenNameDOT	
timing	TokenNameIdentifier	 timing
.	TokenNameDOT	
TimedElement	TokenNameIdentifier	 Timed Element
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
DOMException	TokenNameIdentifier	 DOM Exception
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
SVGAnimationElement	TokenNameIdentifier	 SVG Animation Element
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
SVGElement	TokenNameIdentifier	 SVG Element
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
SVGStringList	TokenNameIdentifier	 SVG String List
;	TokenNameSEMICOLON	
/** * This class provides an implementation of the {@link SVGAnimationElement} interface. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: SVGOMAnimationElement.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the {@link SVGAnimationElement} interface. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: SVGOMAnimationElement.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SVGOMAnimationElement	TokenNameIdentifier	 SVGOM Animation Element
extends	TokenNameextends	
SVGOMElement	TokenNameIdentifier	 SVGOM Element
implements	TokenNameimplements	
SVGAnimationElement	TokenNameIdentifier	 SVG Animation Element
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
SVGOMElement	TokenNameIdentifier	 SVGOM Element
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
SVG_EXTERNAL_RESOURCES_REQUIRED_ATTRIBUTE	TokenNameIdentifier	 SVG  EXTERNAL  RESOURCES  REQUIRED  ATTRIBUTE
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
/** * The 'externalResourcesRequired' attribute value. */	TokenNameCOMMENT_JAVADOC	 The 'externalResourcesRequired' attribute value. 
protected	TokenNameprotected	
SVGOMAnimatedBoolean	TokenNameIdentifier	 SVGOM Animated Boolean
externalResourcesRequired	TokenNameIdentifier	 external Resources Required
;	TokenNameSEMICOLON	
/** * Creates a new SVGOMAnimationElement. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimationElement. 
protected	TokenNameprotected	
SVGOMAnimationElement	TokenNameIdentifier	 SVGOM Animation Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new SVGOMAnimationElement object. * @param prefix The namespace prefix. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGOMAnimationElement object. @param prefix The namespace prefix. @param owner The owner document. 
protected	TokenNameprotected	
SVGOMAnimationElement	TokenNameIdentifier	 SVGOM Animation Element
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
externalResourcesRequired	TokenNameIdentifier	 external Resources Required
=	TokenNameEQUAL	
createLiveAnimatedBoolean	TokenNameIdentifier	 create Live Animated Boolean
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_EXTERNAL_RESOURCES_REQUIRED_ATTRIBUTE	TokenNameIdentifier	 SVG  EXTERNAL  RESOURCES  REQUIRED  ATTRIBUTE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimationElement#getTargetElement()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimationElement#getTargetElement()}. 
public	TokenNamepublic	
SVGElement	TokenNameIdentifier	 SVG Element
getTargetElement	TokenNameIdentifier	 get Target Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getTargetElement	TokenNameIdentifier	 get Target Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimationElement#getStartTime()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimationElement#getStartTime()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStartTime	TokenNameIdentifier	 get Start Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimationElement#getCurrentTime()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimationElement#getCurrentTime()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCurrentTime	TokenNameIdentifier	 get Current Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link SVGAnimationElement#getSimpleDuration()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link SVGAnimationElement#getSimpleDuration()}. 
public	TokenNamepublic	
float	TokenNamefloat	
getSimpleDuration	TokenNameIdentifier	 get Simple Duration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
dur	TokenNameIdentifier	 dur
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleDuration	TokenNameIdentifier	 get Simple Duration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dur	TokenNameIdentifier	 dur
==	TokenNameEQUAL_EQUAL	
TimedElement	TokenNameIdentifier	 Timed Element
.	TokenNameDOT	
INDEFINITE	TokenNameIdentifier	 INDEFINITE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
createDOMException	TokenNameIdentifier	 create DOM Exception
(	TokenNameLPAREN	
DOMException	TokenNameIdentifier	 DOM Exception
.	TokenNameDOT	
NOT_SUPPORTED_ERR	TokenNameIdentifier	 NOT  SUPPORTED  ERR
,	TokenNameCOMMA	
"animation.dur.indefinite"	TokenNameStringLiteral	animation.dur.indefinite
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
dur	TokenNameIdentifier	 dur
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the time that the document would seek to if this animation * element were hyperlinked to, or <code>NaN</code> if there is no * such begin time. */	TokenNameCOMMENT_JAVADOC	 Returns the time that the document would seek to if this animation element were hyperlinked to, or <code>NaN</code> if there is no such begin time. 
public	TokenNamepublic	
float	TokenNamefloat	
getHyperlinkBeginTime	TokenNameIdentifier	 get Hyperlink Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getHyperlinkBeginTime	TokenNameIdentifier	 get Hyperlink Begin Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ElementTimeControl //////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	ElementTimeControl //////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.smil.ElementTimeControl#beginElement()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.smil.ElementTimeControl#beginElement()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
beginElement	TokenNameIdentifier	 begin Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
beginElement	TokenNameIdentifier	 begin Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.smil.ElementTimeControl#beginElementAt(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.smil.ElementTimeControl#beginElementAt(float)}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
beginElementAt	TokenNameIdentifier	 begin Element At
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
beginElementAt	TokenNameIdentifier	 begin Element At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.smil.ElementTimeControl#endElement()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.smil.ElementTimeControl#endElement()}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.smil.ElementTimeControl#endElementAt(float)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.smil.ElementTimeControl#endElementAt(float)}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
endElementAt	TokenNameIdentifier	 end Element At
(	TokenNameLPAREN	
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
throws	TokenNamethrows	
DOMException	TokenNameIdentifier	 DOM Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SVGAnimationContext	TokenNameIdentifier	 SVG Animation Context
)	TokenNameRPAREN	
getSVGContext	TokenNameIdentifier	 get SVG Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
endElementAt	TokenNameIdentifier	 end Element At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SVGExternalResourcesRequired support ///////////////////////////// 	TokenNameCOMMENT_LINE	SVGExternalResourcesRequired support ///////////////////////////// 
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGExternalResourcesRequired#getExternalResourcesRequired()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGExternalResourcesRequired#getExternalResourcesRequired()}. 
public	TokenNamepublic	
SVGAnimatedBoolean	TokenNameIdentifier	 SVG Animated Boolean
getExternalResourcesRequired	TokenNameIdentifier	 get External Resources Required
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
externalResourcesRequired	TokenNameIdentifier	 external Resources Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SVGTests support /////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVGTests support /////////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGTests#getRequiredFeatures()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGTests#getRequiredFeatures()}. 
public	TokenNamepublic	
SVGStringList	TokenNameIdentifier	 SVG String List
getRequiredFeatures	TokenNameIdentifier	 get Required Features
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTestsSupport	TokenNameIdentifier	 SVG Tests Support
.	TokenNameDOT	
getRequiredFeatures	TokenNameIdentifier	 get Required Features
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGTests#getRequiredExtensions()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGTests#getRequiredExtensions()}. 
public	TokenNamepublic	
SVGStringList	TokenNameIdentifier	 SVG String List
getRequiredExtensions	TokenNameIdentifier	 get Required Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTestsSupport	TokenNameIdentifier	 SVG Tests Support
.	TokenNameDOT	
getRequiredExtensions	TokenNameIdentifier	 get Required Extensions
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGTests#getSystemLanguage()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGTests#getSystemLanguage()}. 
public	TokenNamepublic	
SVGStringList	TokenNameIdentifier	 SVG String List
getSystemLanguage	TokenNameIdentifier	 get System Language
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTestsSupport	TokenNameIdentifier	 SVG Tests Support
.	TokenNameDOT	
getSystemLanguage	TokenNameIdentifier	 get System Language
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGTests#hasExtension(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGTests#hasExtension(String)}. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasExtension	TokenNameIdentifier	 has Extension
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
extension	TokenNameIdentifier	 extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVGTestsSupport	TokenNameIdentifier	 SVG Tests Support
.	TokenNameDOT	
hasExtension	TokenNameIdentifier	 has Extension
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
extension	TokenNameIdentifier	 extension
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
