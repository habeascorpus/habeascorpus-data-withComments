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
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
GeneralPath	TokenNameIdentifier	 General Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Line2D	TokenNameIdentifier	 Line2 D
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
/** * Utility class that converts a Path object into an SVG clip * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: SVGClip.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Utility class that converts a Path object into an SVG clip * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: SVGClip.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGClip	TokenNameIdentifier	 SVG Clip
extends	TokenNameextends	
AbstractSVGConverter	TokenNameIdentifier	 Abstract SVG Converter
{	TokenNameLBRACE	
/** * Constant used for some degenerate cases */	TokenNameCOMMENT_JAVADOC	 Constant used for some degenerate cases 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Shape	TokenNameIdentifier	 Shape
ORIGIN	TokenNameIdentifier	 ORIGIN
=	TokenNameEQUAL	
new	TokenNamenew	
Line2D	TokenNameIdentifier	 Line2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Descriptor to use where there is no clip on an element */	TokenNameCOMMENT_JAVADOC	 Descriptor to use where there is no clip on an element 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGClipDescriptor	TokenNameIdentifier	 SVG Clip Descriptor
NO_CLIP	TokenNameIdentifier	 NO  CLIP
=	TokenNameEQUAL	
new	TokenNamenew	
SVGClipDescriptor	TokenNameIdentifier	 SVG Clip Descriptor
(	TokenNameLPAREN	
SVG_NONE_VALUE	TokenNameIdentifier	 SVG  NONE  VALUE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Used to convert clip object to SVG elements */	TokenNameCOMMENT_JAVADOC	 Used to convert clip object to SVG elements 
private	TokenNameprivate	
SVGShape	TokenNameIdentifier	 SVG Shape
shapeConverter	TokenNameIdentifier	 shape Converter
;	TokenNameSEMICOLON	
/** * @param generatorContext used to build Elements */	TokenNameCOMMENT_JAVADOC	 @param generatorContext used to build Elements 
public	TokenNamepublic	
SVGClip	TokenNameIdentifier	 SVG Clip
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
this	TokenNamethis	
.	TokenNameDOT	
shapeConverter	TokenNameIdentifier	 shape Converter
=	TokenNameEQUAL	
new	TokenNamenew	
SVGShape	TokenNameIdentifier	 SVG Shape
(	TokenNameLPAREN	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts part or all of the input GraphicContext into * a set of attribute/value pairs and related definitions. * @param gc GraphicContext to be converted * @return descriptor of the attributes required to represent * some or all of the GraphicContext state, along * with the related definitions * @see org.apache.batik.svggen.SVGDescriptor */	TokenNameCOMMENT_JAVADOC	 Converts part or all of the input GraphicContext into a set of attribute/value pairs and related definitions. @param gc GraphicContext to be converted @return descriptor of the attributes required to represent some or all of the GraphicContext state, along with the related definitions @see org.apache.batik.svggen.SVGDescriptor 
public	TokenNamepublic	
SVGDescriptor	TokenNameIdentifier	 SVG Descriptor
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
GraphicContext	TokenNameIdentifier	 Graphic Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
clip	TokenNameIdentifier	 clip
=	TokenNameEQUAL	
gc	TokenNameIdentifier	 gc
.	TokenNameDOT	
getClip	TokenNameIdentifier	 get Clip
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SVGClipDescriptor	TokenNameIdentifier	 SVG Clip Descriptor
clipDesc	TokenNameIdentifier	 clip Desc
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clip	TokenNameIdentifier	 clip
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
clipPathAttrBuf	TokenNameIdentifier	 clip Path Attr Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
URL_PREFIX	TokenNameIdentifier	 URL  PREFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// First, convert to a GeneralPath so that the 	TokenNameCOMMENT_LINE	First, convert to a GeneralPath so that the 
GeneralPath	TokenNameIdentifier	 General Path
clipPath	TokenNameIdentifier	 clip Path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
clip	TokenNameIdentifier	 clip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if this object is already in the Map 	TokenNameCOMMENT_LINE	Check if this object is already in the Map 
ClipKey	TokenNameIdentifier	 Clip Key
clipKey	TokenNameIdentifier	 clip Key
=	TokenNameEQUAL	
new	TokenNamenew	
ClipKey	TokenNameIdentifier	 Clip Key
(	TokenNameLPAREN	
clipPath	TokenNameIdentifier	 clip Path
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clipDesc	TokenNameIdentifier	 clip Desc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGClipDescriptor	TokenNameIdentifier	 SVG Clip Descriptor
)	TokenNameRPAREN	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
clipKey	TokenNameIdentifier	 clip Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clipDesc	TokenNameIdentifier	 clip Desc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
clipDef	TokenNameIdentifier	 clip Def
=	TokenNameEQUAL	
clipToSVG	TokenNameIdentifier	 clip To SVG
(	TokenNameLPAREN	
clip	TokenNameIdentifier	 clip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
clipDef	TokenNameIdentifier	 clip Def
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
clipDesc	TokenNameIdentifier	 clip Desc
=	TokenNameEQUAL	
NO_CLIP	TokenNameIdentifier	 NO  CLIP
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
clipPathAttrBuf	TokenNameIdentifier	 clip Path Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SIGN_POUND	TokenNameIdentifier	 SIGN  POUND
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clipPathAttrBuf	TokenNameIdentifier	 clip Path Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
clipDef	TokenNameIdentifier	 clip Def
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clipPathAttrBuf	TokenNameIdentifier	 clip Path Attr Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
URL_SUFFIX	TokenNameIdentifier	 URL  SUFFIX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clipDesc	TokenNameIdentifier	 clip Desc
=	TokenNameEQUAL	
new	TokenNamenew	
SVGClipDescriptor	TokenNameIdentifier	 SVG Clip Descriptor
(	TokenNameLPAREN	
clipPathAttrBuf	TokenNameIdentifier	 clip Path Attr Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
clipDef	TokenNameIdentifier	 clip Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
descMap	TokenNameIdentifier	 desc Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
clipKey	TokenNameIdentifier	 clip Key
,	TokenNameCOMMA	
clipDesc	TokenNameIdentifier	 clip Desc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
defSet	TokenNameIdentifier	 def Set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
clipDef	TokenNameIdentifier	 clip Def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
clipDesc	TokenNameIdentifier	 clip Desc
=	TokenNameEQUAL	
NO_CLIP	TokenNameIdentifier	 NO  CLIP
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clipDesc	TokenNameIdentifier	 clip Desc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * In the following method, an clipping Shape is converted to * an SVG clipPath. * * @param clip path to convert to an SVG clipPath * element */	TokenNameCOMMENT_JAVADOC	 In the following method, an clipping Shape is converted to an SVG clipPath. * @param clip path to convert to an SVG clipPath element 
private	TokenNameprivate	
Element	TokenNameIdentifier	 Element
clipToSVG	TokenNameIdentifier	 clip To SVG
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
clip	TokenNameIdentifier	 clip
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Element	TokenNameIdentifier	 Element
clipDef	TokenNameIdentifier	 clip Def
=	TokenNameEQUAL	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
domFactory	TokenNameIdentifier	 dom Factory
.	TokenNameDOT	
createElementNS	TokenNameIdentifier	 create Element NS
(	TokenNameLPAREN	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
,	TokenNameCOMMA	
SVG_CLIP_PATH_TAG	TokenNameIdentifier	 SVG  CLIP  PATH  TAG
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clipDef	TokenNameIdentifier	 clip Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_CLIP_PATH_UNITS_ATTRIBUTE	TokenNameIdentifier	 SVG  CLIP  PATH  UNITS  ATTRIBUTE
,	TokenNameCOMMA	
SVG_USER_SPACE_ON_USE_VALUE	TokenNameIdentifier	 SVG  USER  SPACE  ON  USE  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clipDef	TokenNameIdentifier	 clip Def
.	TokenNameDOT	
setAttributeNS	TokenNameIdentifier	 set Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_ID_ATTRIBUTE	TokenNameIdentifier	 SVG  ID  ATTRIBUTE
,	TokenNameCOMMA	
generatorContext	TokenNameIdentifier	 generator Context
.	TokenNameDOT	
idGenerator	TokenNameIdentifier	 id Generator
.	TokenNameDOT	
generateID	TokenNameIdentifier	 generate ID
(	TokenNameLPAREN	
ID_PREFIX_CLIP_PATH	TokenNameIdentifier	 ID  PREFIX  CLIP  PATH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
clipPath	TokenNameIdentifier	 clip Path
=	TokenNameEQUAL	
shapeConverter	TokenNameIdentifier	 shape Converter
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
clip	TokenNameIdentifier	 clip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unfortunately it may be null because of SVGPath that may produce null 	TokenNameCOMMENT_LINE	unfortunately it may be null because of SVGPath that may produce null 
// SVG elements. 	TokenNameCOMMENT_LINE	SVG elements. 
if	TokenNameif	
(	TokenNameLPAREN	
clipPath	TokenNameIdentifier	 clip Path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clipDef	TokenNameIdentifier	 clip Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
clipPath	TokenNameIdentifier	 clip Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clipDef	TokenNameIdentifier	 clip Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Here, we know clip is not null but we got a 	TokenNameCOMMENT_LINE	Here, we know clip is not null but we got a 
// null clipDef. This means we ran into a degenerate 	TokenNameCOMMENT_LINE	null clipDef. This means we ran into a degenerate 
// case which in Java 2D means everything is clippped. 	TokenNameCOMMENT_LINE	case which in Java 2D means everything is clippped. 
// To provide an equivalent behavior, we clip to a point 	TokenNameCOMMENT_LINE	To provide an equivalent behavior, we clip to a point 
clipDef	TokenNameIdentifier	 clip Def
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
shapeConverter	TokenNameIdentifier	 shape Converter
.	TokenNameDOT	
toSVG	TokenNameIdentifier	 to SVG
(	TokenNameLPAREN	
ORIGIN	TokenNameIdentifier	 ORIGIN
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clipDef	TokenNameIdentifier	 clip Def
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Inner class used to key clip definitions in a Map. * This is needed because we need to test equality * on the value of GeneralPath and GeneralPath's equal * method does not implement that behavior. */	TokenNameCOMMENT_JAVADOC	 Inner class used to key clip definitions in a Map. This is needed because we need to test equality on the value of GeneralPath and GeneralPath's equal method does not implement that behavior. 
class	TokenNameclass	
ClipKey	TokenNameIdentifier	 Clip Key
{	TokenNameLBRACE	
/** * This clip hash code. Based on the serialized path * data */	TokenNameCOMMENT_JAVADOC	 This clip hash code. Based on the serialized path data 
int	TokenNameint	
hashCodeValue	TokenNameIdentifier	 hash Code Value
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * @param proxiedPath path used as an index in the Map */	TokenNameCOMMENT_JAVADOC	 @param proxiedPath path used as an index in the Map 
public	TokenNamepublic	
ClipKey	TokenNameIdentifier	 Clip Key
(	TokenNameLPAREN	
GeneralPath	TokenNameIdentifier	 General Path
proxiedPath	TokenNameIdentifier	 proxied Path
,	TokenNameCOMMA	
SVGGeneratorContext	TokenNameIdentifier	 SVG Generator Context
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
pathData	TokenNameIdentifier	 path Data
=	TokenNameEQUAL	
SVGPath	TokenNameIdentifier	 SVG Path
.	TokenNameDOT	
toSVGPathData	TokenNameIdentifier	 to SVG Path Data
(	TokenNameLPAREN	
proxiedPath	TokenNameIdentifier	 proxied Path
,	TokenNameCOMMA	
gc	TokenNameIdentifier	 gc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hashCodeValue	TokenNameIdentifier	 hash Code Value
=	TokenNameEQUAL	
pathData	TokenNameIdentifier	 path Data
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return this object's hashcode */	TokenNameCOMMENT_JAVADOC	 @return this object's hashcode 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hashCodeValue	TokenNameIdentifier	 hash Code Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param clipKey object to compare * @return true if equal, false otherwise */	TokenNameCOMMENT_JAVADOC	 @param clipKey object to compare @return true if equal, false otherwise 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
clipKey	TokenNameIdentifier	 clip Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clipKey	TokenNameIdentifier	 clip Key
instanceof	TokenNameinstanceof	
ClipKey	TokenNameIdentifier	 Clip Key
&&	TokenNameAND_AND	
hashCodeValue	TokenNameIdentifier	 hash Code Value
==	TokenNameEQUAL_EQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ClipKey	TokenNameIdentifier	 Clip Key
)	TokenNameRPAREN	
clipKey	TokenNameIdentifier	 clip Key
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCodeValue	TokenNameIdentifier	 hash Code Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
