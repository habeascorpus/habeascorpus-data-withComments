/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
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
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
DomExtension	TokenNameIdentifier	 Dom Extension
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
ExtensibleDOMImplementation	TokenNameIdentifier	 Extensible DOM Implementation
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGDOMImplementation	TokenNameIdentifier	 SVGDOM Implementation
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
/** * This is a Service interface for classes that want to extend the * functionality of the Dom, to support new tags in the rendering tree. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: BatikDomExtension.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This is a Service interface for classes that want to extend the functionality of the Dom, to support new tags in the rendering tree. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: BatikDomExtension.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
BatikDomExtension	TokenNameIdentifier	 Batik Dom Extension
implements	TokenNameimplements	
DomExtension	TokenNameIdentifier	 Dom Extension
,	TokenNameCOMMA	
BatikExtConstants	TokenNameIdentifier	 Batik Ext Constants
{	TokenNameLBRACE	
/** * Return the priority of this Extension. Extensions are * registered from lowest to highest priority. So if for some * reason you need to come before/after another existing extension * make sure your priority is lower/higher than theirs. */	TokenNameCOMMENT_JAVADOC	 Return the priority of this Extension. Extensions are registered from lowest to highest priority. So if for some reason you need to come before/after another existing extension make sure your priority is lower/higher than theirs. 
public	TokenNamepublic	
float	TokenNamefloat	
getPriority	TokenNameIdentifier	 get Priority
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return the individual or company name responsible * for the this implementation of the extension. */	TokenNameCOMMENT_JAVADOC	 This should return the individual or company name responsible for the this implementation of the extension. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAuthor	TokenNameIdentifier	 get Author
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Thomas DeWeese"	TokenNameStringLiteral	Thomas DeWeese
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should contain a contact address (usually an e-mail address). */	TokenNameCOMMENT_JAVADOC	 This should contain a contact address (usually an e-mail address). 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContactAddress	TokenNameIdentifier	 get Contact Address
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"deweese@apache.org"	TokenNameStringLiteral	deweese@apache.org
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This should return a URL where information can be obtained on * this extension. */	TokenNameCOMMENT_JAVADOC	 This should return a URL where information can be obtained on this extension. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getURL	TokenNameIdentifier	 get URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"http://xml.apache.org/batik"	TokenNameStringLiteral	http://xml.apache.org/batik
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Human readable description of the extension. * Perhaps that should be a resource for internationalization? * (although I suppose it could be done internally) */	TokenNameCOMMENT_JAVADOC	 Human readable description of the extension. Perhaps that should be a resource for internationalization? (although I suppose it could be done internally) 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Example extension to standard SVG shape tags"	TokenNameStringLiteral	Example extension to standard SVG shape tags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method should update the DomContext with support * for the tags in this extension. In some rare cases it may * be necessary to replace existing tag handlers, although this * is discouraged. * * @param di The ExtensibleDOMImplementation to register the * extension elements with. */	TokenNameCOMMENT_JAVADOC	 This method should update the DomContext with support for the tags in this extension. In some rare cases it may be necessary to replace existing tag handlers, although this is discouraged. * @param di The ExtensibleDOMImplementation to register the extension elements with. 
public	TokenNamepublic	
void	TokenNamevoid	
registerTags	TokenNameIdentifier	 register Tags
(	TokenNameLPAREN	
ExtensibleDOMImplementation	TokenNameIdentifier	 Extensible DOM Implementation
di	TokenNameIdentifier	 di
)	TokenNameRPAREN	
{	TokenNameLBRACE	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier	 BATIK  EXT  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_REGULAR_POLYGON_TAG	TokenNameIdentifier	 BATIK  EXT  REGULAR  POLYGON  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
BatikRegularPolygonElementFactory	TokenNameIdentifier	 Batik Regular Polygon Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier	 BATIK  EXT  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_STAR_TAG	TokenNameIdentifier	 BATIK  EXT  STAR  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
BatikStarElementFactory	TokenNameIdentifier	 Batik Star Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier	 BATIK  EXT  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_HISTOGRAM_NORMALIZATION_TAG	TokenNameIdentifier	 BATIK  EXT  HISTOGRAM  NORMALIZATION  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
BatikHistogramNormalizationElementFactory	TokenNameIdentifier	 Batik Histogram Normalization Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_EXT_NAMESPACE_URI	TokenNameIdentifier	 BATIK  EXT  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_COLOR_SWITCH_TAG	TokenNameIdentifier	 BATIK  EXT  COLOR  SWITCH  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
ColorSwitchElementFactory	TokenNameIdentifier	 Color Switch Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_12_NAMESPACE_URI	TokenNameIdentifier	 BATIK 12  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_FLOW_TEXT_TAG	TokenNameIdentifier	 BATIK  EXT  FLOW  TEXT  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
FlowTextElementFactory	TokenNameIdentifier	 Flow Text Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_12_NAMESPACE_URI	TokenNameIdentifier	 BATIK 12  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_FLOW_DIV_TAG	TokenNameIdentifier	 BATIK  EXT  FLOW  DIV  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
FlowDivElementFactory	TokenNameIdentifier	 Flow Div Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_12_NAMESPACE_URI	TokenNameIdentifier	 BATIK 12  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_FLOW_PARA_TAG	TokenNameIdentifier	 BATIK  EXT  FLOW  PARA  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
FlowParaElementFactory	TokenNameIdentifier	 Flow Para Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_12_NAMESPACE_URI	TokenNameIdentifier	 BATIK 12  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_FLOW_REGION_BREAK_TAG	TokenNameIdentifier	 BATIK  EXT  FLOW  REGION  BREAK  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
FlowRegionBreakElementFactory	TokenNameIdentifier	 Flow Region Break Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_12_NAMESPACE_URI	TokenNameIdentifier	 BATIK 12  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_FLOW_REGION_TAG	TokenNameIdentifier	 BATIK  EXT  FLOW  REGION  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
FlowRegionElementFactory	TokenNameIdentifier	 Flow Region Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_12_NAMESPACE_URI	TokenNameIdentifier	 BATIK 12  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_FLOW_LINE_TAG	TokenNameIdentifier	 BATIK  EXT  FLOW  LINE  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
FlowLineElementFactory	TokenNameIdentifier	 Flow Line Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
di	TokenNameIdentifier	 di
.	TokenNameDOT	
registerCustomElementFactory	TokenNameIdentifier	 register Custom Element Factory
(	TokenNameLPAREN	
BATIK_12_NAMESPACE_URI	TokenNameIdentifier	 BATIK 12  NAMESPACE  URI
,	TokenNameCOMMA	
BATIK_EXT_FLOW_SPAN_TAG	TokenNameIdentifier	 BATIK  EXT  FLOW  SPAN  TAG
,	TokenNameCOMMA	
new	TokenNamenew	
FlowSpanElementFactory	TokenNameIdentifier	 Flow Span Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To create a 'regularPolygon' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'regularPolygon' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
BatikRegularPolygonElementFactory	TokenNameIdentifier	 Batik Regular Polygon Element Factory
implements	TokenNameimplements	
ExtensibleDOMImplementation	TokenNameIdentifier	 Extensible DOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
BatikRegularPolygonElementFactory	TokenNameIdentifier	 Batik Regular Polygon Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BatikRegularPolygonElement	TokenNameIdentifier	 Batik Regular Polygon Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'star' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'star' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
BatikStarElementFactory	TokenNameIdentifier	 Batik Star Element Factory
implements	TokenNameimplements	
ExtensibleDOMImplementation	TokenNameIdentifier	 Extensible DOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
BatikStarElementFactory	TokenNameIdentifier	 Batik Star Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BatikStarElement	TokenNameIdentifier	 Batik Star Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'histogramNormalization' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'histogramNormalization' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
BatikHistogramNormalizationElementFactory	TokenNameIdentifier	 Batik Histogram Normalization Element Factory
implements	TokenNameimplements	
ExtensibleDOMImplementation	TokenNameIdentifier	 Extensible DOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
BatikHistogramNormalizationElementFactory	TokenNameIdentifier	 Batik Histogram Normalization Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
BatikHistogramNormalizationElement	TokenNameIdentifier	 Batik Histogram Normalization Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'colorSwitch' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'colorSwitch' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
ColorSwitchElementFactory	TokenNameIdentifier	 Color Switch Element Factory
implements	TokenNameimplements	
ExtensibleDOMImplementation	TokenNameIdentifier	 Extensible DOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
ColorSwitchElementFactory	TokenNameIdentifier	 Color Switch Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ColorSwitchElement	TokenNameIdentifier	 Color Switch Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'flowText' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'flowText' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FlowTextElementFactory	TokenNameIdentifier	 Flow Text Element Factory
implements	TokenNameimplements	
SVGDOMImplementation	TokenNameIdentifier	 SVGDOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowTextElementFactory	TokenNameIdentifier	 Flow Text Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FlowTextElement	TokenNameIdentifier	 Flow Text Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'flowDiv' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'flowDiv' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FlowDivElementFactory	TokenNameIdentifier	 Flow Div Element Factory
implements	TokenNameimplements	
SVGDOMImplementation	TokenNameIdentifier	 SVGDOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowDivElementFactory	TokenNameIdentifier	 Flow Div Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FlowDivElement	TokenNameIdentifier	 Flow Div Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'flowPara' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'flowPara' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FlowParaElementFactory	TokenNameIdentifier	 Flow Para Element Factory
implements	TokenNameimplements	
SVGDOMImplementation	TokenNameIdentifier	 SVGDOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowParaElementFactory	TokenNameIdentifier	 Flow Para Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FlowParaElement	TokenNameIdentifier	 Flow Para Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'flowRegionBreak' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'flowRegionBreak' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FlowRegionBreakElementFactory	TokenNameIdentifier	 Flow Region Break Element Factory
implements	TokenNameimplements	
SVGDOMImplementation	TokenNameIdentifier	 SVGDOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowRegionBreakElementFactory	TokenNameIdentifier	 Flow Region Break Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FlowRegionBreakElement	TokenNameIdentifier	 Flow Region Break Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'flowRegion' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'flowRegion' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FlowRegionElementFactory	TokenNameIdentifier	 Flow Region Element Factory
implements	TokenNameimplements	
SVGDOMImplementation	TokenNameIdentifier	 SVGDOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowRegionElementFactory	TokenNameIdentifier	 Flow Region Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FlowRegionElement	TokenNameIdentifier	 Flow Region Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'flowLine' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'flowLine' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FlowLineElementFactory	TokenNameIdentifier	 Flow Line Element Factory
implements	TokenNameimplements	
SVGDOMImplementation	TokenNameIdentifier	 SVGDOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowLineElementFactory	TokenNameIdentifier	 Flow Line Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FlowLineElement	TokenNameIdentifier	 Flow Line Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To create a 'flowSpan' element. */	TokenNameCOMMENT_JAVADOC	 To create a 'flowSpan' element. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
FlowSpanElementFactory	TokenNameIdentifier	 Flow Span Element Factory
implements	TokenNameimplements	
SVGDOMImplementation	TokenNameIdentifier	 SVGDOM Implementation
.	TokenNameDOT	
ElementFactory	TokenNameIdentifier	 Element Factory
{	TokenNameLBRACE	
public	TokenNamepublic	
FlowSpanElementFactory	TokenNameIdentifier	 Flow Span Element Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Creates an instance of the associated element type. */	TokenNameCOMMENT_JAVADOC	 Creates an instance of the associated element type. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FlowSpanElement	TokenNameIdentifier	 Flow Span Element
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
(	TokenNameLPAREN	
AbstractDocument	TokenNameIdentifier	 Abstract Document
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
