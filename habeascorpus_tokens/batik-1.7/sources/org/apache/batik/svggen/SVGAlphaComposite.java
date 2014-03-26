/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
GraphicContext	TokenNameIdentifier	 Graphic Context
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
/** * Utility class that converts an AlphaComposite object into * a set of SVG properties and definitions. Here is * how AlphaComposites are mapped to SVG: * + AlphaComposite.SRC_OVER with extra alpha is mapped * to the opacity attribute * + AlphaComposite's other rules are translated into * predefined filter effects. * One of the big differences between AlphaComposite and * the SVG feComposite filter is that feComposite does not * have the notion of extra alpha applied to the source. * The extra alpha equivalent is obtained by setting the * opacity property on the nodes to be composited. * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGAlphaComposite.java 504084 2007-02-06 11:24:46Z dvholten $ * @see org.apache.batik.svggen.SVGAlphaComposite */	TokenNameCOMMENT_JAVADOC	 Utility class that converts an AlphaComposite object into a set of SVG properties and definitions. Here is how AlphaComposites are mapped to SVG: + AlphaComposite.SRC_OVER with extra alpha is mapped to the opacity attribute + AlphaComposite's other rules are translated into predefined filter effects. One of the big differences between AlphaComposite and the SVG feComposite filter is that feComposite does not have the notion of extra alpha applied to the source. The extra alpha equivalent is obtained by setting the opacity property on the nodes to be composited. * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGAlphaComposite.java 504084 2007-02-06 11:24:46Z dvholten $ @see org.apache.batik.svggen.SVGAlphaComposite 
public	TokenNamepublic	
class	TokenNameclass	
SVGAlphaComposite	TokenNameIdentifier	 SVG Alpha Composite
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * Map of all possible AlphaComposite filter equivalents */	TokenNameCOMMENT_JAVADOC	 Map of all possible AlphaComposite filter equivalents 
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * By default, access to the background is not required. */	TokenNameCOMMENT_JAVADOC	 By default, access to the background is not required. 
private	TokenNameprivate	
boolean	TokenNameboolean	
backgroundAccessRequired	TokenNameIdentifier	 background Access Required
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * @param generatorContext for use by SVGAlphaComposite to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext for use by SVGAlphaComposite to build Elements 
public	TokenNamepublic	
SVGAlphaComposite	TokenNameIdentifier	 SVG Alpha Composite
(	TokenNameLPAREN	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Initialize map of AlphaComposite filter definitions 	TokenNameCOMMENT_LINE	Initialize map of AlphaComposite filter definitions 
// 	TokenNameCOMMENT_LINE	 
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Src	TokenNameIdentifier	 Src
,	TokenNameCOMMA	
compositeToSVG	TokenNameIdentifier	 composite To SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Src	TokenNameIdentifier	 Src
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcIn	TokenNameIdentifier	 Src In
,	TokenNameCOMMA	
compositeToSVG	TokenNameIdentifier	 composite To SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcIn	TokenNameIdentifier	 Src In
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcOut	TokenNameIdentifier	 Src Out
,	TokenNameCOMMA	
compositeToSVG	TokenNameIdentifier	 composite To SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcOut	TokenNameIdentifier	 Src Out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DstIn	TokenNameIdentifier	 Dst In
,	TokenNameCOMMA	
compositeToSVG	TokenNameIdentifier	 composite To SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DstIn	TokenNameIdentifier	 Dst In
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DstOut	TokenNameIdentifier	 Dst Out
,	TokenNameCOMMA	
compositeToSVG	TokenNameIdentifier	 composite To SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DstOut	TokenNameIdentifier	 Dst Out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DstOver	TokenNameIdentifier	 Dst Over
,	TokenNameCOMMA	
compositeToSVG	TokenNameIdentifier	 composite To SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DstOver	TokenNameIdentifier	 Dst Over
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Clear	TokenNameIdentifier	 Clear
,	TokenNameCOMMA	
compositeToSVG	TokenNameIdentifier	 composite To SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
Clear	TokenNameIdentifier	 Clear
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return set of all AlphaComposite filter definitions */	TokenNameCOMMENT_JAVADOC	 @return set of all AlphaComposite filter definitions 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
getAlphaCompositeFilterSet	TokenNameIdentifier	 get Alpha Composite Filter Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return true if background access is required for any * of the converted AlphaComposite rules */	TokenNameCOMMENT_JAVADOC	 @return true if background access is required for any of the converted AlphaComposite rules 
public	TokenNamepublic	
boolean	TokenNameboolean	
requiresBackgroundAccess	TokenNameIdentifier	 requires Background Access
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
backgroundAccessRequired	TokenNameIdentifier	 background Access Required
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts part or all of the input GraphicContext into * a set of attribute/value pairs and related definitions * * @param gc GraphicContext to be converted * @return descriptor of the attributes required to represent * some or all of the GraphicContext state, along * with the related definitions * @see org.apache.batik.svggen.SVGDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts part or all of the input GraphicContext into a set of attribute/value pairs and related definitions * @param gc GraphicContext to be converted @return descriptor of the attributes required to represent some or all of the GraphicContext state, along with the related definitions @see org.apache.batik.svggen.SVGDescriptor 
public	TokenNamepublic	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
)	TokenNameRPAREN	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getComposite	TokenNameIdentifier	 get Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param composite the AlphaComposite object to convert to SVG * @return an SVGCompositeDescriptor that defines how to map the * input composite in SVG */	TokenNameCOMMENT_JAVADOC	 @param composite the AlphaComposite object to convert to SVG @return an SVGCompositeDescriptor that defines how to map the input composite in SVG 
public	TokenNamepublic	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
composite	TokenNameIdentifier	 composite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
compositeDesc	TokenNameIdentifier	 composite Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
)	TokenNameRPAREN	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compositeDesc	TokenNameIdentifier	 composite Desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Process the composite opacity 	TokenNameCOMMENT_LINE	Process the composite opacity 
String	TokenNameIdentifier	 String
opacityValue	TokenNameIdentifier	 opacity Value
=	TokenNameEQUAL	
doubleString	TokenNameIdentifier	 double String
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
getAlpha	TokenNameIdentifier	 get Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For all rules different than SRC_OVER, a filter is 	TokenNameCOMMENT_LINE	For all rules different than SRC_OVER, a filter is 
// needed to represent the composition rule. 	TokenNameCOMMENT_LINE	needed to represent the composition rule. 
String	TokenNameIdentifier	 String
filterValue	TokenNameIdentifier	 filter Value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
filterDef	TokenNameIdentifier	 filter Def
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SRC_OVER	TokenNameIdentifier	 SRC  OVER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note that the extra alpha is ignored by using the 	TokenNameCOMMENT_LINE	Note that the extra alpha is ignored by using the 
// majorComposite. The extra alpha is already represented 	TokenNameCOMMENT_LINE	majorComposite. The extra alpha is already represented 
// by the SVG_OPACITY_ATTRIBUTE value. 	TokenNameCOMMENT_LINE	by the SVG_OPACITY_ATTRIBUTE value. 
AlphaComposite	TokenNameIdentifier	 Alpha Composite
majorComposite	TokenNameIdentifier	 major Composite
=	TokenNameEQUAL	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterDef	TokenNameIdentifier	 filter Def
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
compositeDefsMap	TokenNameIdentifier	 composite Defs Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
majorComposite	TokenNameIdentifier	 major Composite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
filterDef	TokenNameIdentifier	 filter Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Process the filter value 	TokenNameCOMMENT_LINE	Process the filter value 
StringBuffer	TokenNameIdentifier	 String Buffer
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
URL_PREFIX	TokenNameIdentifier	 URL  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SIGN_POUND	TokenNameIdentifier	 SIGN  POUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
filterDef	TokenNameIdentifier	 filter Def
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
URL_SUFFIX	TokenNameIdentifier	 URL  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterValue	TokenNameIdentifier	 filter Value
=	TokenNameEQUAL	
filterAttrBuf	TokenNameIdentifier	 filter Attr Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
filterValue	TokenNameIdentifier	 filter Value
=	TokenNameEQUAL	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
;	TokenNameSEMICOLON	
compositeDesc	TokenNameIdentifier	 composite Desc
=	TokenNameEQUAL	
new	TokenNamenew	
SVGCompositeDescriptor	TokenNameIdentifier	 SVG Composite Descriptor
(	TokenNameLPAREN	
opacityValue	TokenNameIdentifier	 opacity Value
,	TokenNameCOMMA	
filterValue	TokenNameIdentifier	 filter Value
,	TokenNameCOMMA	
filterDef	TokenNameIdentifier	 filter Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
,	TokenNameCOMMA	
compositeDesc	TokenNameIdentifier	 composite Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SRC_OVER	TokenNameIdentifier	 SRC  OVER
)	TokenNameRPAREN	
backgroundAccessRequired	TokenNameIdentifier	 background Access Required
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compositeDesc	TokenNameIdentifier	 composite Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param composite AlphaComposite to convert to a filter effect * @exception Error if an AlphaComposite with SRC_OVER rule in passed to * this method. */	TokenNameCOMMENT_JAVADOC	 @param composite AlphaComposite to convert to a filter effect @exception Error if an AlphaComposite with SRC_OVER rule in passed to this method. 
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
compositeToSVG	TokenNameIdentifier	 composite To SVG
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
composite	TokenNameIdentifier	 composite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// operator is equivalent to rule 	TokenNameCOMMENT_LINE	operator is equivalent to rule 
String	TokenNameIdentifier	 String
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// input1 is equivalent to Src 	TokenNameCOMMENT_LINE	input1 is equivalent to Src 
String	TokenNameIdentifier	 String
input1	TokenNameIdentifier	 input1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// input2 is equivalent to Dst 	TokenNameCOMMENT_LINE	input2 is equivalent to Dst 
String	TokenNameIdentifier	 String
input2	TokenNameIdentifier	 input2
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// k2 is used only for arithmetic 	TokenNameCOMMENT_LINE	k2 is used only for arithmetic 
// to obtain the equivalent of SRC 	TokenNameCOMMENT_LINE	to obtain the equivalent of SRC 
String	TokenNameIdentifier	 String
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
// ID used to identify the composite 	TokenNameCOMMENT_LINE	ID used to identify the composite 
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
CLEAR	TokenNameIdentifier	 CLEAR
:	TokenNameCOLON	
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
SVG_ARITHMETIC_VALUE	TokenNameIdentifier	 SVG  ARITHMETIC  VALUE
;	TokenNameSEMICOLON	
input1	TokenNameIdentifier	 input1
=	TokenNameEQUAL	
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier	 SVG  SOURCE  GRAPHIC  VALUE
;	TokenNameSEMICOLON	
input2	TokenNameIdentifier	 input2
=	TokenNameEQUAL	
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  IMAGE  VALUE
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
ID_PREFIX_ALPHA_COMPOSITE_CLEAR	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  CLEAR
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SRC	TokenNameIdentifier	 SRC
:	TokenNameCOLON	
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
SVG_ARITHMETIC_VALUE	TokenNameIdentifier	 SVG  ARITHMETIC  VALUE
;	TokenNameSEMICOLON	
input1	TokenNameIdentifier	 input1
=	TokenNameEQUAL	
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier	 SVG  SOURCE  GRAPHIC  VALUE
;	TokenNameSEMICOLON	
input2	TokenNameIdentifier	 input2
=	TokenNameEQUAL	
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  IMAGE  VALUE
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
ID_PREFIX_ALPHA_COMPOSITE_SRC	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  SRC
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
SVG_DIGIT_ONE_VALUE	TokenNameIdentifier	 SVG  DIGIT  ONE  VALUE
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SRC_IN	TokenNameIdentifier	 SRC  IN
:	TokenNameCOLON	
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
SVG_IN_VALUE	TokenNameIdentifier	 SVG  IN  VALUE
;	TokenNameSEMICOLON	
input1	TokenNameIdentifier	 input1
=	TokenNameEQUAL	
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier	 SVG  SOURCE  GRAPHIC  VALUE
;	TokenNameSEMICOLON	
input2	TokenNameIdentifier	 input2
=	TokenNameEQUAL	
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  IMAGE  VALUE
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
ID_PREFIX_ALPHA_COMPOSITE_SRC_IN	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  SRC  IN
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SRC_OUT	TokenNameIdentifier	 SRC  OUT
:	TokenNameCOLON	
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
SVG_OUT_VALUE	TokenNameIdentifier	 SVG  OUT  VALUE
;	TokenNameSEMICOLON	
input1	TokenNameIdentifier	 input1
=	TokenNameEQUAL	
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier	 SVG  SOURCE  GRAPHIC  VALUE
;	TokenNameSEMICOLON	
input2	TokenNameIdentifier	 input2
=	TokenNameEQUAL	
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  IMAGE  VALUE
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
ID_PREFIX_ALPHA_COMPOSITE_SRC_OUT	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  SRC  OUT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DST_IN	TokenNameIdentifier	 DST  IN
:	TokenNameCOLON	
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
SVG_IN_VALUE	TokenNameIdentifier	 SVG  IN  VALUE
;	TokenNameSEMICOLON	
input2	TokenNameIdentifier	 input2
=	TokenNameEQUAL	
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier	 SVG  SOURCE  GRAPHIC  VALUE
;	TokenNameSEMICOLON	
input1	TokenNameIdentifier	 input1
=	TokenNameEQUAL	
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  IMAGE  VALUE
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
ID_PREFIX_ALPHA_COMPOSITE_DST_IN	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  DST  IN
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DST_OUT	TokenNameIdentifier	 DST  OUT
:	TokenNameCOLON	
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
SVG_OUT_VALUE	TokenNameIdentifier	 SVG  OUT  VALUE
;	TokenNameSEMICOLON	
input2	TokenNameIdentifier	 input2
=	TokenNameEQUAL	
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier	 SVG  SOURCE  GRAPHIC  VALUE
;	TokenNameSEMICOLON	
input1	TokenNameIdentifier	 input1
=	TokenNameEQUAL	
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  IMAGE  VALUE
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
ID_PREFIX_ALPHA_COMPOSITE_DST_OUT	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  DST  OUT
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
DST_OVER	TokenNameIdentifier	 DST  OVER
:	TokenNameCOLON	
operator	TokenNameIdentifier	 operator
=	TokenNameEQUAL	
SVG_OVER_VALUE	TokenNameIdentifier	 SVG  OVER  VALUE
;	TokenNameSEMICOLON	
input2	TokenNameIdentifier	 input2
=	TokenNameEQUAL	
SVG_SOURCE_GRAPHIC_VALUE	TokenNameIdentifier	 SVG  SOURCE  GRAPHIC  VALUE
;	TokenNameSEMICOLON	
input1	TokenNameIdentifier	 input1
=	TokenNameEQUAL	
SVG_BACKGROUND_IMAGE_VALUE	TokenNameIdentifier	 SVG  BACKGROUND  IMAGE  VALUE
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
ID_PREFIX_ALPHA_COMPOSITE_DST_OVER	TokenNameIdentifier	 ID  PREFIX  ALPHA  COMPOSITE  DST  OVER
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
Error	TokenNameIdentifier	 Error
(	TokenNameLPAREN	
"invalid rule:"	TokenNameStringLiteral	invalid rule:
+	TokenNamePLUS	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Element	TokenNameIdentifier	 Element
compositeFilter	TokenNameIdentifier	 composite Filter
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FILTER_TAG	TokenNameIdentifier	 SVG  FILTER  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FILTER_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  FILTER  UNITS  ATTRIBUTE
,	TokenNameCOMMA	
SVG_OBJECT_BOUNDING_BOX_VALUE	TokenNameIdentifier	 SVG  OBJECT  BOUNDING  BOX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_X_ATTRIBUTE	TokenNameIdentifier	 SVG  X  ATTRIBUTE
,	TokenNameCOMMA	
SVG_ZERO_PERCENT_VALUE	TokenNameIdentifier	 SVG  ZERO  PERCENT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_Y_ATTRIBUTE	TokenNameIdentifier	 SVG  Y  ATTRIBUTE
,	TokenNameCOMMA	
SVG_ZERO_PERCENT_VALUE	TokenNameIdentifier	 SVG  ZERO  PERCENT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_WIDTH_ATTRIBUTE	TokenNameIdentifier	 SVG  WIDTH  ATTRIBUTE
,	TokenNameCOMMA	
SVG_HUNDRED_PERCENT_VALUE	TokenNameIdentifier	 SVG  HUNDRED  PERCENT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_HEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  HEIGHT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_HUNDRED_PERCENT_VALUE	TokenNameIdentifier	 SVG  HUNDRED  PERCENT  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feComposite	TokenNameIdentifier	 fe Composite
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_COMPOSITE_TAG	TokenNameIdentifier	 SVG  FE  COMPOSITE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feComposite	TokenNameIdentifier	 fe Composite
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_OPERATOR_ATTRIBUTE	TokenNameIdentifier	 SVG  OPERATOR  ATTRIBUTE
,	TokenNameCOMMA	
operator	TokenNameIdentifier	 operator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feComposite	TokenNameIdentifier	 fe Composite
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_IN_ATTRIBUTE	TokenNameIdentifier	 SVG  IN  ATTRIBUTE
,	TokenNameCOMMA	
input1	TokenNameIdentifier	 input1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feComposite	TokenNameIdentifier	 fe Composite
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_IN2_ATTRIBUTE	TokenNameIdentifier	 SVG  I N2  ATTRIBUTE
,	TokenNameCOMMA	
input2	TokenNameIdentifier	 input2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feComposite	TokenNameIdentifier	 fe Composite
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_K2_ATTRIBUTE	TokenNameIdentifier	 SVG  K2  ATTRIBUTE
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feComposite	TokenNameIdentifier	 fe Composite
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RESULT_ATTRIBUTE	TokenNameIdentifier	 SVG  RESULT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_COMPOSITE_VALUE	TokenNameIdentifier	 SVG  COMPOSITE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feFlood	TokenNameIdentifier	 fe Flood
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_FLOOD_TAG	TokenNameIdentifier	 SVG  FE  FLOOD  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFlood	TokenNameIdentifier	 fe Flood
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FLOOD_COLOR_ATTRIBUTE	TokenNameIdentifier	 SVG  FLOOD  COLOR  ATTRIBUTE
,	TokenNameCOMMA	
"white"	TokenNameStringLiteral	white
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFlood	TokenNameIdentifier	 fe Flood
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_FLOOD_OPACITY_ATTRIBUTE	TokenNameIdentifier	 SVG  FLOOD  OPACITY  ATTRIBUTE
,	TokenNameCOMMA	
"1"	TokenNameStringLiteral	1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feFlood	TokenNameIdentifier	 fe Flood
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_RESULT_ATTRIBUTE	TokenNameIdentifier	 SVG  RESULT  ATTRIBUTE
,	TokenNameCOMMA	
SVG_FLOOD_VALUE	TokenNameIdentifier	 SVG  FLOOD  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feMerge	TokenNameIdentifier	 fe Merge
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_MERGE_TAG	TokenNameIdentifier	 SVG  FE  MERGE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feMergeNodeFlood	TokenNameIdentifier	 fe Merge Node Flood
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_MERGE_NODE_TAG	TokenNameIdentifier	 SVG  FE  MERGE  NODE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feMergeNodeFlood	TokenNameIdentifier	 fe Merge Node Flood
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_IN_ATTRIBUTE	TokenNameIdentifier	 SVG  IN  ATTRIBUTE
,	TokenNameCOMMA	
SVG_FLOOD_VALUE	TokenNameIdentifier	 SVG  FLOOD  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
feMergeNodeComposite	TokenNameIdentifier	 fe Merge Node Composite
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_FE_MERGE_NODE_TAG	TokenNameIdentifier	 SVG  FE  MERGE  NODE  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feMergeNodeComposite	TokenNameIdentifier	 fe Merge Node Composite
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_IN_ATTRIBUTE	TokenNameIdentifier	 SVG  IN  ATTRIBUTE
,	TokenNameCOMMA	
SVG_COMPOSITE_VALUE	TokenNameIdentifier	 SVG  COMPOSITE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feMerge	TokenNameIdentifier	 fe Merge
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feMergeNodeFlood	TokenNameIdentifier	 fe Merge Node Flood
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
feMerge	TokenNameIdentifier	 fe Merge
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feMergeNodeComposite	TokenNameIdentifier	 fe Merge Node Composite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feFlood	TokenNameIdentifier	 fe Flood
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feComposite	TokenNameIdentifier	 fe Composite
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compositeFilter	TokenNameIdentifier	 composite Filter
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
feMerge	TokenNameIdentifier	 fe Merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
compositeFilter	TokenNameIdentifier	 composite Filter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
