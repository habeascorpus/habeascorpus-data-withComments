/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
StyleDeclarationProvider	TokenNameIdentifier	 Style Declaration Provider
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
StyleMap	TokenNameIdentifier	 Style Map
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
ParsedURL	TokenNameIdentifier	 Parsed URL
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
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSStyleDeclaration	TokenNameIdentifier	 CSS Style Declaration
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
CSSValue	TokenNameIdentifier	 CSS Value
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
SVGStylable	TokenNameIdentifier	 SVG Stylable
;	TokenNameSEMICOLON	
/** * This class implements the basic features an element must have in * order to be usable as a foreign element within an SVGOMDocument, * and the support for both the 'style' attribute and the style * attributes (ie: fill="red", ...). * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: StylableExtensionElement.java 579230 2007-09-25 12:52:48Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class implements the basic features an element must have in order to be usable as a foreign element within an SVGOMDocument, and the support for both the 'style' attribute and the style attributes (ie: fill="red", ...). * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: StylableExtensionElement.java 579230 2007-09-25 12:52:48Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
StylableExtensionElement	TokenNameIdentifier	 Stylable Extension Element
extends	TokenNameextends	
ExtensionElement	TokenNameIdentifier	 Extension Element
implements	TokenNameimplements	
CSSStylableElement	TokenNameIdentifier	 CSS Stylable Element
,	TokenNameCOMMA	
SVGStylable	TokenNameIdentifier	 SVG Stylable
{	TokenNameLBRACE	
/** * The base URL. */	TokenNameCOMMENT_JAVADOC	 The base URL. 
protected	TokenNameprotected	
ParsedURL	TokenNameIdentifier	 Parsed URL
cssBase	TokenNameIdentifier	 css Base
;	TokenNameSEMICOLON	
/** * The computed style map. */	TokenNameCOMMENT_JAVADOC	 The computed style map. 
protected	TokenNameprotected	
StyleMap	TokenNameIdentifier	 Style Map
computedStyleMap	TokenNameIdentifier	 computed Style Map
;	TokenNameSEMICOLON	
/** * Creates a new Element object. */	TokenNameCOMMENT_JAVADOC	 Creates a new Element object. 
protected	TokenNameprotected	
StylableExtensionElement	TokenNameIdentifier	 Stylable Extension Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates a new Element object. * @param name The element name, for validation purposes. * @param owner The owner document. */	TokenNameCOMMENT_JAVADOC	 Creates a new Element object. @param name The element name, for validation purposes. @param owner The owner document. 
protected	TokenNameprotected	
StylableExtensionElement	TokenNameIdentifier	 Stylable Extension Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
AbstractDocument	TokenNameIdentifier	 Abstract Document
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// CSSStylableElement ////////////////////////////////////////// 	TokenNameCOMMENT_LINE	CSSStylableElement ////////////////////////////////////////// 
/** * Returns the computed style of this element/pseudo-element. */	TokenNameCOMMENT_JAVADOC	 Returns the computed style of this element/pseudo-element. 
public	TokenNamepublic	
StyleMap	TokenNameIdentifier	 Style Map
getComputedStyleMap	TokenNameIdentifier	 get Computed Style Map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pseudoElement	TokenNameIdentifier	 pseudo Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
computedStyleMap	TokenNameIdentifier	 computed Style Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the computed style of this element/pseudo-element. */	TokenNameCOMMENT_JAVADOC	 Sets the computed style of this element/pseudo-element. 
public	TokenNamepublic	
void	TokenNamevoid	
setComputedStyleMap	TokenNameIdentifier	 set Computed Style Map
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pseudoElement	TokenNameIdentifier	 pseudo Element
,	TokenNameCOMMA	
StyleMap	TokenNameIdentifier	 Style Map
sm	TokenNameIdentifier	 sm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
computedStyleMap	TokenNameIdentifier	 computed Style Map
=	TokenNameEQUAL	
sm	TokenNameIdentifier	 sm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the ID of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the ID of this element. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getXMLId	TokenNameIdentifier	 get XML Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"id"	TokenNameStringLiteral	id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the class of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the class of this element. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getCSSClass	TokenNameIdentifier	 get CSS Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
"class"	TokenNameStringLiteral	class
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the CSS base URL of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the CSS base URL of this element. 
public	TokenNamepublic	
ParsedURL	TokenNameIdentifier	 Parsed URL
getCSSBase	TokenNameIdentifier	 get CSS Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cssBase	TokenNameIdentifier	 css Base
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
bu	TokenNameIdentifier	 bu
=	TokenNameEQUAL	
getBaseURI	TokenNameIdentifier	 get Base URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bu	TokenNameIdentifier	 bu
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cssBase	TokenNameIdentifier	 css Base
=	TokenNameEQUAL	
new	TokenNamenew	
ParsedURL	TokenNameIdentifier	 Parsed URL
(	TokenNameLPAREN	
bu	TokenNameIdentifier	 bu
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cssBase	TokenNameIdentifier	 css Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether this element is an instance of the given pseudo * class. */	TokenNameCOMMENT_JAVADOC	 Tells whether this element is an instance of the given pseudo class. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isPseudoInstanceOf	TokenNameIdentifier	 is Pseudo Instance Of
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pseudoClass	TokenNameIdentifier	 pseudo Class
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pseudoClass	TokenNameIdentifier	 pseudo Class
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"first-child"	TokenNameStringLiteral	first-child
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getPreviousSibling	TokenNameIdentifier	 get Previous Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the object that gives access to the underlying * {@link org.apache.batik.css.engine.StyleDeclaration} for the override * style of this element. */	TokenNameCOMMENT_JAVADOC	 Returns the object that gives access to the underlying {@link org.apache.batik.css.engine.StyleDeclaration} for the override style of this element. 
public	TokenNamepublic	
StyleDeclarationProvider	TokenNameIdentifier	 Style Declaration Provider
getOverrideStyleDeclarationProvider	TokenNameIdentifier	 get Override Style Declaration Provider
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// SVGStylable ////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	SVGStylable ////////////////////////////////////////////////// 
/** * <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGStylable#getStyle()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGStylable#getStyle()}. 
public	TokenNamepublic	
CSSStyleDeclaration	TokenNameIdentifier	 CSS Style Declaration
getStyle	TokenNameIdentifier	 get Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Not implemented"	TokenNameStringLiteral	Not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGStylable#getPresentationAttribute(String)}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGStylable#getPresentationAttribute(String)}. 
public	TokenNamepublic	
CSSValue	TokenNameIdentifier	 CSS Value
getPresentationAttribute	TokenNameIdentifier	 get Presentation Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Not implemented"	TokenNameStringLiteral	Not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <b>DOM</b>: Implements {@link * org.w3c.dom.svg.SVGStylable#getClassName()}. */	TokenNameCOMMENT_JAVADOC	 <b>DOM</b>: Implements {@link org.w3c.dom.svg.SVGStylable#getClassName()}. 
public	TokenNamepublic	
SVGAnimatedString	TokenNameIdentifier	 SVG Animated String
getClassName	TokenNameIdentifier	 get Class Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Not implemented"	TokenNameStringLiteral	Not implemented
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
