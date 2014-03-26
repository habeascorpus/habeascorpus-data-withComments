/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
bridge	TokenNameIdentifier	 bridge
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
AffineTransform	TokenNameIdentifier	 Affine Transform
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XLinkSupport	TokenNameIdentifier	 X Link Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
TextPath	TokenNameIdentifier	 Text Path
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
AWTPathProducer	TokenNameIdentifier	 AWT Path Producer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
PathParser	TokenNameIdentifier	 Path Parser
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
/** * Bridge class for the &lt;textPath> element. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: SVGTextPathElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Bridge class for the &lt;textPath> element. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: SVGTextPathElementBridge.java 501922 2007-01-31 17:47:47Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGTextPathElementBridge	TokenNameIdentifier	 SVG Text Path Element Bridge
extends	TokenNameextends	
AnimatableGenericSVGBridge	TokenNameIdentifier	 Animatable Generic SVG Bridge
implements	TokenNameimplements	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
/** * Constructs a new bridge for the &lt;textPath> element. */	TokenNameCOMMENT_JAVADOC	 Constructs a new bridge for the &lt;textPath> element. 
public	TokenNamepublic	
SVGTextPathElementBridge	TokenNameIdentifier	 SVG Text Path Element Bridge
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns 'textPath'. */	TokenNameCOMMENT_JAVADOC	 Returns 'textPath'. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
SVG_TEXT_PATH_TAG	TokenNameIdentifier	 SVG  TEXT  PATH  TAG
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
handleElement	TokenNameIdentifier	 handle Element
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We don't want to take over from the text content element. 	TokenNameCOMMENT_LINE	We don't want to take over from the text content element. 
}	TokenNameRBRACE	
/** * Creates a TextPath object that represents the path along which the text * is to be rendered. * * @param ctx The bridge context. * @param textPathElement The &lt;textPath> element. * * @return The new TextPath. */	TokenNameCOMMENT_JAVADOC	 Creates a TextPath object that represents the path along which the text is to be rendered. * @param ctx The bridge context. @param textPathElement The &lt;textPath> element. * @return The new TextPath. 
public	TokenNamepublic	
TextPath	TokenNameIdentifier	 Text Path
createTextPath	TokenNameIdentifier	 create Text Path
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
textPathElement	TokenNameIdentifier	 text Path Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the referenced element 	TokenNameCOMMENT_LINE	get the referenced element 
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
XLinkSupport	TokenNameIdentifier	 X Link Support
.	TokenNameDOT	
getXLinkHref	TokenNameIdentifier	 get X Link Href
(	TokenNameLPAREN	
textPathElement	TokenNameIdentifier	 text Path Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Element	TokenNameIdentifier	 Element
pathElement	TokenNameIdentifier	 path Element
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getReferencedElement	TokenNameIdentifier	 get Referenced Element
(	TokenNameLPAREN	
textPathElement	TokenNameIdentifier	 text Path Element
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pathElement	TokenNameIdentifier	 path Element
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
SVG_NAMESPACE_URI	TokenNameIdentifier	 SVG  NAMESPACE  URI
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pathElement	TokenNameIdentifier	 path Element
.	TokenNameDOT	
getNamespaceURI	TokenNameIdentifier	 get Namespace URI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
!	TokenNameNOT	
pathElement	TokenNameIdentifier	 path Element
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
SVG_PATH_TAG	TokenNameIdentifier	 SVG  PATH  TAG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// couldn't find the referenced element 	TokenNameCOMMENT_LINE	couldn't find the referenced element 
// or the referenced element was not a path 	TokenNameCOMMENT_LINE	or the referenced element was not a path 
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
textPathElement	TokenNameIdentifier	 text Path Element
,	TokenNameCOMMA	
ERR_URI_BAD_TARGET	TokenNameIdentifier	 ERR  URI  BAD  TARGET
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
uri	TokenNameIdentifier	 uri
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// construct a shape for the referenced path element 	TokenNameCOMMENT_LINE	construct a shape for the referenced path element 
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
pathElement	TokenNameIdentifier	 path Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_D_ATTRIBUTE	TokenNameIdentifier	 SVG  D  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
pathShape	TokenNameIdentifier	 path Shape
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AWTPathProducer	TokenNameIdentifier	 AWT Path Producer
app	TokenNameIdentifier	 app
=	TokenNameEQUAL	
new	TokenNamenew	
AWTPathProducer	TokenNameIdentifier	 AWT Path Producer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
app	TokenNameIdentifier	 app
.	TokenNameDOT	
setWindingRule	TokenNameIdentifier	 set Winding Rule
(	TokenNameLPAREN	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
convertFillRule	TokenNameIdentifier	 convert Fill Rule
(	TokenNameLPAREN	
pathElement	TokenNameIdentifier	 path Element
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
PathParser	TokenNameIdentifier	 Path Parser
pathParser	TokenNameIdentifier	 path Parser
=	TokenNameEQUAL	
new	TokenNamenew	
PathParser	TokenNameIdentifier	 Path Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathParser	TokenNameIdentifier	 path Parser
.	TokenNameDOT	
setPathHandler	TokenNameIdentifier	 set Path Handler
(	TokenNameLPAREN	
app	TokenNameIdentifier	 app
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathParser	TokenNameIdentifier	 path Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ParseException	TokenNameIdentifier	 Parse Exception
pEx	TokenNameIdentifier	 p Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
pathElement	TokenNameIdentifier	 path Element
,	TokenNameCOMMA	
pEx	TokenNameIdentifier	 p Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_D_ATTRIBUTE	TokenNameIdentifier	 SVG  D  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
pathShape	TokenNameIdentifier	 path Shape
=	TokenNameEQUAL	
app	TokenNameIdentifier	 app
.	TokenNameDOT	
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
pathElement	TokenNameIdentifier	 path Element
,	TokenNameCOMMA	
ERR_ATTRIBUTE_MISSING	TokenNameIdentifier	 ERR  ATTRIBUTE  MISSING
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_D_ATTRIBUTE	TokenNameIdentifier	 SVG  D  ATTRIBUTE
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if the reference path element has a transform apply the transform 	TokenNameCOMMENT_LINE	if the reference path element has a transform apply the transform 
// to the path shape 	TokenNameCOMMENT_LINE	to the path shape 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
pathElement	TokenNameIdentifier	 path Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  TRANSFORM  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AffineTransform	TokenNameIdentifier	 Affine Transform
tr	TokenNameIdentifier	 tr
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertTransform	TokenNameIdentifier	 convert Transform
(	TokenNameLPAREN	
pathElement	TokenNameIdentifier	 path Element
,	TokenNameCOMMA	
SVG_TRANSFORM_ATTRIBUTE	TokenNameIdentifier	 SVG  TRANSFORM  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathShape	TokenNameIdentifier	 path Shape
=	TokenNameEQUAL	
tr	TokenNameIdentifier	 tr
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
pathShape	TokenNameIdentifier	 path Shape
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create the TextPath object that we are going to return 	TokenNameCOMMENT_LINE	create the TextPath object that we are going to return 
TextPath	TokenNameIdentifier	 Text Path
textPath	TokenNameIdentifier	 text Path
=	TokenNameEQUAL	
new	TokenNamenew	
TextPath	TokenNameIdentifier	 Text Path
(	TokenNameLPAREN	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
pathShape	TokenNameIdentifier	 path Shape
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// set the start offset if specified 	TokenNameCOMMENT_LINE	set the start offset if specified 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
textPathElement	TokenNameIdentifier	 text Path Element
.	TokenNameDOT	
getAttributeNS	TokenNameIdentifier	 get Attribute NS
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
SVG_START_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  START  OFFSET  ATTRIBUTE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
percentIndex	TokenNameIdentifier	 percent Index
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
percentIndex	TokenNameIdentifier	 percent Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// its a percentage of the length of the path 	TokenNameCOMMENT_LINE	its a percentage of the length of the path 
float	TokenNamefloat	
pathLength	TokenNameIdentifier	 path Length
=	TokenNameEQUAL	
textPath	TokenNameIdentifier	 text Path
.	TokenNameDOT	
lengthOfPath	TokenNameIdentifier	 length Of Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
percentString	TokenNameIdentifier	 percent String
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
percentIndex	TokenNameIdentifier	 percent Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
startOffsetPercent	TokenNameIdentifier	 start Offset Percent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
startOffsetPercent	TokenNameIdentifier	 start Offset Percent
=	TokenNameEQUAL	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
percentString	TokenNameIdentifier	 percent String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startOffsetPercent	TokenNameIdentifier	 start Offset Percent
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
startOffsetPercent	TokenNameIdentifier	 start Offset Percent
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
textPathElement	TokenNameIdentifier	 text Path Element
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
SVG_START_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  START  OFFSET  ATTRIBUTE
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
startOffsetPercent	TokenNameIdentifier	 start Offset Percent
*	TokenNameMULTIPLY	
pathLength	TokenNameIdentifier	 path Length
/	TokenNameDIVIDE	
100.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// its an absolute length 	TokenNameCOMMENT_LINE	its an absolute length 
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
Context	TokenNameIdentifier	 Context
uctx	TokenNameIdentifier	 uctx
=	TokenNameEQUAL	
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
createContext	TokenNameIdentifier	 create Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
textPathElement	TokenNameIdentifier	 text Path Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
svgOtherLengthToUserSpace	TokenNameIdentifier	 svg Other Length To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
SVG_START_OFFSET_ATTRIBUTE	TokenNameIdentifier	 SVG  START  OFFSET  ATTRIBUTE
,	TokenNameCOMMA	
uctx	TokenNameIdentifier	 uctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
textPath	TokenNameIdentifier	 text Path
.	TokenNameDOT	
setStartOffset	TokenNameIdentifier	 set Start Offset
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
textPath	TokenNameIdentifier	 text Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
