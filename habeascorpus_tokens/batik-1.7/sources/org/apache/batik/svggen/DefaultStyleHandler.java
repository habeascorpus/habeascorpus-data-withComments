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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
SVGConstants	TokenNameIdentifier	 SVG Constants
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
/** * The <code>DefaultStyleHandler</code> class provides the default * way to style an SVG <code>Element</code>. * * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> * @version $Id: DefaultStyleHandler.java 479559 2006-11-27 09:46:16Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The <code>DefaultStyleHandler</code> class provides the default way to style an SVG <code>Element</code>. * @author <a href="mailto:cjolif@ilog.fr">Christophe Jolif</a> @version $Id: DefaultStyleHandler.java 479559 2006-11-27 09:46:16Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultStyleHandler	TokenNameIdentifier	 Default Style Handler
implements	TokenNameimplements	
StyleHandler	TokenNameIdentifier	 Style Handler
,	TokenNameCOMMA	
SVGConstants	TokenNameIdentifier	 SVG Constants
{	TokenNameLBRACE	
/** * Static initializer for which attributes should be ignored on * some elements. * Map-key is a string like 'SVG_RECT_TAG' , * map-entry is a set of strings, which denote font-attributes to ignore. * The set is shared by all map-entries. */	TokenNameCOMMENT_JAVADOC	 Static initializer for which attributes should be ignored on some elements. Map-key is a string like 'SVG_RECT_TAG' , map-entry is a set of strings, which denote font-attributes to ignore. The set is shared by all map-entries. 
static	TokenNamestatic	
Map	TokenNameIdentifier	 Map
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
// this is just used for read-only 'contains'-tests 	TokenNameCOMMENT_LINE	this is just used for read-only 'contains'-tests 
Set	TokenNameIdentifier	 Set
textAttributes	TokenNameIdentifier	 text Attributes
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textAttributes	TokenNameIdentifier	 text Attributes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FONT_SIZE_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  SIZE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textAttributes	TokenNameIdentifier	 text Attributes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FONT_FAMILY_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  FAMILY  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textAttributes	TokenNameIdentifier	 text Attributes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FONT_STYLE_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  STYLE  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
textAttributes	TokenNameIdentifier	 text Attributes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
SVG_FONT_WEIGHT_ATTRIBUTE	TokenNameIdentifier	 SVG  FONT  WEIGHT  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_RECT_TAG	TokenNameIdentifier	 SVG  RECT  TAG
,	TokenNameCOMMA	
textAttributes	TokenNameIdentifier	 text Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_CIRCLE_TAG	TokenNameIdentifier	 SVG  CIRCLE  TAG
,	TokenNameCOMMA	
textAttributes	TokenNameIdentifier	 text Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_ELLIPSE_TAG	TokenNameIdentifier	 SVG  ELLIPSE  TAG
,	TokenNameCOMMA	
textAttributes	TokenNameIdentifier	 text Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_POLYGON_TAG	TokenNameIdentifier	 SVG  POLYGON  TAG
,	TokenNameCOMMA	
textAttributes	TokenNameIdentifier	 text Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_POLYGON_TAG	TokenNameIdentifier	 SVG  POLYGON  TAG
,	TokenNameCOMMA	
textAttributes	TokenNameIdentifier	 text Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_LINE_TAG	TokenNameIdentifier	 SVG  LINE  TAG
,	TokenNameCOMMA	
textAttributes	TokenNameIdentifier	 text Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
SVG_PATH_TAG	TokenNameIdentifier	 SVG  PATH  TAG
,	TokenNameCOMMA	
textAttributes	TokenNameIdentifier	 text Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the style described by <code>styleMap</code> on the given * <code>element</code>. That is sets the xml attributes with their * styled value. * @param element the SVG <code>Element</code> to be styled. * @param styleMap the <code>Map</code> containing pairs of style * property names, style values. */	TokenNameCOMMENT_JAVADOC	 Sets the style described by <code>styleMap</code> on the given <code>element</code>. That is sets the xml attributes with their styled value. @param element the SVG <code>Element</code> to be styled. @param styleMap the <code>Map</code> containing pairs of style property names, style values. 
public	TokenNamepublic	
void	TokenNamevoid	
setStyle	TokenNameIdentifier	 set Style
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
styleMap	TokenNameIdentifier	 style Map
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
=	TokenNameEQUAL	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getTagName	TokenNameIdentifier	 get Tag Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
styleMap	TokenNameIdentifier	 style Map
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
styleName	TokenNameIdentifier	 style Name
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
styleName	TokenNameIdentifier	 style Name
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
appliesTo	TokenNameIdentifier	 applies To
(	TokenNameLPAREN	
styleName	TokenNameIdentifier	 style Name
,	TokenNameCOMMA	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
element	TokenNameIdentifier	 element
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
styleName	TokenNameIdentifier	 style Name
,	TokenNameCOMMA	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
styleMap	TokenNameIdentifier	 style Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
styleName	TokenNameIdentifier	 style Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Controls whether or not a given attribute applies to a particular * element. */	TokenNameCOMMENT_JAVADOC	 Controls whether or not a given attribute applies to a particular element. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
appliesTo	TokenNameIdentifier	 applies To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
styleName	TokenNameIdentifier	 style Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
)	TokenNameRPAREN	
ignoreAttributes	TokenNameIdentifier	 ignore Attributes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tagName	TokenNameIdentifier	 tag Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
styleName	TokenNameIdentifier	 style Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
