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
font	TokenNameIdentifier	 font
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
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
value	TokenNameIdentifier	 value
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
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
TextNode	TokenNameIdentifier	 Text Node
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
CSSConstants	TokenNameIdentifier	 CSS Constants
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
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
;	TokenNameSEMICOLON	
/** * A collection of utility method for text. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> * @version $Id: TextUtilities.java 501922 2007-01-31 17:47:47Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A collection of utility method for text. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @author <a href="mailto:bill.haneman@ireland.sun.com">Bill Haneman</a> @version $Id: TextUtilities.java 501922 2007-01-31 17:47:47Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TextUtilities	TokenNameIdentifier	 Text Utilities
implements	TokenNameimplements	
CSSConstants	TokenNameIdentifier	 CSS Constants
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
{	TokenNameLBRACE	
/** * Returns the content of the given element. */	TokenNameCOMMENT_JAVADOC	 Returns the content of the given element. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
getElementContent	TokenNameIdentifier	 get Element Content
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getElementContent	TokenNameIdentifier	 get Element Content
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
:	TokenNameCOLON	
case	TokenNamecase	
Node	TokenNameIdentifier	 Node
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the float list that represents a set of horizontal * values or percentage. * * @param element the element that defines the specified coordinates * @param attrName the name of the attribute (used by error handling) * @param valueStr the delimited string containing values of the coordinate * @param ctx the bridge context */	TokenNameCOMMENT_JAVADOC	 Returns the float list that represents a set of horizontal values or percentage. * @param element the element that defines the specified coordinates @param attrName the name of the attribute (used by error handling) @param valueStr the delimited string containing values of the coordinate @param ctx the bridge context 
public	TokenNamepublic	
static	TokenNamestatic	
ArrayList	TokenNameIdentifier	 Array List
svgHorizontalCoordinateArrayToUserSpace	TokenNameIdentifier	 svg Horizontal Coordinate Array To User Space
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
valueStr	TokenNameIdentifier	 value Str
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
valueStr	TokenNameIdentifier	 value Str
,	TokenNameCOMMA	
", "	TokenNameStringLiteral	, 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
svgHorizontalCoordinateToUserSpace	TokenNameIdentifier	 svg Horizontal Coordinate To User Space
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
uctx	TokenNameIdentifier	 uctx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the float list that represents a set of values or percentage. * * * @param element the element that defines the specified coordinates * @param attrName the name of the attribute (used by error handling) * @param valueStr the delimited string containing values of the coordinate * @param ctx the bridge context */	TokenNameCOMMENT_JAVADOC	 Returns the float list that represents a set of values or percentage. * @param element the element that defines the specified coordinates @param attrName the name of the attribute (used by error handling) @param valueStr the delimited string containing values of the coordinate @param ctx the bridge context 
public	TokenNamepublic	
static	TokenNamestatic	
ArrayList	TokenNameIdentifier	 Array List
svgVerticalCoordinateArrayToUserSpace	TokenNameIdentifier	 svg Vertical Coordinate Array To User Space
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
valueStr	TokenNameIdentifier	 value Str
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
valueStr	TokenNameIdentifier	 value Str
,	TokenNameCOMMA	
", "	TokenNameStringLiteral	, 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
svgVerticalCoordinateToUserSpace	TokenNameIdentifier	 svg Vertical Coordinate To User Space
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
uctx	TokenNameIdentifier	 uctx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
ArrayList	TokenNameIdentifier	 Array List
svgRotateArrayToFloats	TokenNameIdentifier	 svg Rotate Array To Floats
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
valueStr	TokenNameIdentifier	 value Str
,	TokenNameCOMMA	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
valueStr	TokenNameIdentifier	 value Str
,	TokenNameCOMMA	
", "	TokenNameStringLiteral	, 
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
SVGUtilities	TokenNameIdentifier	 SVG Utilities
.	TokenNameDOT	
convertSVGNumber	TokenNameIdentifier	 convert SVG Number
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfEx	TokenNameIdentifier	 nf Ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
nfEx	TokenNameIdentifier	 nf Ex
,	TokenNameCOMMA	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
valueStr	TokenNameIdentifier	 value Str
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the font-size CSS value to a float value. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts the font-size CSS value to a float value. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
Float	TokenNameIdentifier	 Float
convertFontSize	TokenNameIdentifier	 convert Font Size
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FONT_SIZE_INDEX	TokenNameIdentifier	 FONT  SIZE  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts the font-style CSS value to a float value. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts the font-style CSS value to a float value. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
Float	TokenNameIdentifier	 Float
convertFontStyle	TokenNameIdentifier	 convert Font Style
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FONT_STYLE_INDEX	TokenNameIdentifier	 FONT  STYLE  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE_REGULAR	TokenNameIdentifier	 POSTURE  REGULAR
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
POSTURE_OBLIQUE	TokenNameIdentifier	 POSTURE  OBLIQUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts the font-stretch CSS value to a float value. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts the font-stretch CSS value to a float value. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
Float	TokenNameIdentifier	 Float
convertFontStretch	TokenNameIdentifier	 convert Font Stretch
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FONT_STRETCH_INDEX	TokenNameIdentifier	 FONT  STRETCH  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WIDTH_CONDENSED	TokenNameIdentifier	 WIDTH  CONDENSED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WIDTH_EXTENDED	TokenNameIdentifier	 WIDTH  EXTENDED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WIDTH_CONDENSED	TokenNameIdentifier	 WIDTH  CONDENSED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WIDTH_SEMI_EXTENDED	TokenNameIdentifier	 WIDTH  SEMI  EXTENDED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WIDTH_EXTENDED	TokenNameIdentifier	 WIDTH  EXTENDED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WIDTH_SEMI_CONDENSED	TokenNameIdentifier	 WIDTH  SEMI  CONDENSED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WIDTH_SEMI_EXTENDED	TokenNameIdentifier	 WIDTH  SEMI  EXTENDED
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WIDTH_REGULAR	TokenNameIdentifier	 WIDTH  REGULAR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts the font-weight CSS value to a float value. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts the font-weight CSS value to a float value. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
Float	TokenNameIdentifier	 Float
convertFontWeight	TokenNameIdentifier	 convert Font Weight
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
FONT_WEIGHT_INDEX	TokenNameIdentifier	 FONT  WEIGHT  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
100	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_EXTRA_LIGHT	TokenNameIdentifier	 WEIGHT  EXTRA  LIGHT
;	TokenNameSEMICOLON	
case	TokenNamecase	
200	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_LIGHT	TokenNameIdentifier	 WEIGHT  LIGHT
;	TokenNameSEMICOLON	
case	TokenNamecase	
300	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_DEMILIGHT	TokenNameIdentifier	 WEIGHT  DEMILIGHT
;	TokenNameSEMICOLON	
case	TokenNamecase	
400	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_REGULAR	TokenNameIdentifier	 WEIGHT  REGULAR
;	TokenNameSEMICOLON	
case	TokenNamecase	
500	TokenNameIntegerLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_SEMIBOLD	TokenNameIdentifier	 WEIGHT  SEMIBOLD
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
WEIGHT_BOLD	TokenNameIdentifier	 WEIGHT  BOLD
;	TokenNameSEMICOLON	
/* Would like to do this but the JDK 1.3 & 1.4 seems to drop back to 'REGULAR' instead of 'BOLD' if there is not a match. case 700: return TextAttribute.WEIGHT_HEAVY; case 800: return TextAttribute.WEIGHT_EXTRABOLD; case 900: return TextAttribute.WEIGHT_ULTRABOLD; */	TokenNameCOMMENT_BLOCK	 Would like to do this but the JDK 1.3 & 1.4 seems to drop back to 'REGULAR' instead of 'BOLD' if there is not a match. case 700: return TextAttribute.WEIGHT_HEAVY; case 800: return TextAttribute.WEIGHT_EXTRABOLD; case 900: return TextAttribute.WEIGHT_ULTRABOLD; 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts the text-anchor CSS value to a TextNode.Anchor. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts the text-anchor CSS value to a TextNode.Anchor. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
TextNode	TokenNameIdentifier	 Text Node
.	TokenNameDOT	
Anchor	TokenNameIdentifier	 Anchor
convertTextAnchor	TokenNameIdentifier	 convert Text Anchor
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
TEXT_ANCHOR_INDEX	TokenNameIdentifier	 TEXT  ANCHOR  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
TextNode	TokenNameIdentifier	 Text Node
.	TokenNameDOT	
Anchor	TokenNameIdentifier	 Anchor
.	TokenNameDOT	
START	TokenNameIdentifier	 START
;	TokenNameSEMICOLON	
case	TokenNamecase	
'm'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
TextNode	TokenNameIdentifier	 Text Node
.	TokenNameDOT	
Anchor	TokenNameIdentifier	 Anchor
.	TokenNameDOT	
MIDDLE	TokenNameIdentifier	 MIDDLE
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
TextNode	TokenNameIdentifier	 Text Node
.	TokenNameDOT	
Anchor	TokenNameIdentifier	 Anchor
.	TokenNameDOT	
END	TokenNameIdentifier	 END
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts a baseline-shift CSS value to a value usable as a text * attribute, or null. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts a baseline-shift CSS value to a value usable as a text attribute, or null. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
Object	TokenNameIdentifier	 Object
convertBaselineShift	TokenNameIdentifier	 convert Baseline Shift
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
BASELINE_SHIFT_INDEX	TokenNameIdentifier	 BASELINE  SHIFT  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'p'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
//suPerscript 	TokenNameCOMMENT_LINE	suPerscript 
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
SUPERSCRIPT_SUPER	TokenNameIdentifier	 SUPERSCRIPT  SUPER
;	TokenNameSEMICOLON	
case	TokenNamecase	
'b'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
//suBscript 	TokenNameCOMMENT_LINE	suBscript 
return	TokenNamereturn	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
SUPERSCRIPT_SUB	TokenNameIdentifier	 SUPERSCRIPT  SUB
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Converts a kerning CSS value to a value usable as a text * attribute, or null. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts a kerning CSS value to a value usable as a text attribute, or null. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
Float	TokenNameIdentifier	 Float
convertKerning	TokenNameIdentifier	 convert Kerning
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
KERNING_INDEX	TokenNameIdentifier	 KERNING  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a letter-spacing CSS value to a value usable as a text * attribute, or null. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts a letter-spacing CSS value to a value usable as a text attribute, or null. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
Float	TokenNameIdentifier	 Float
convertLetterSpacing	TokenNameIdentifier	 convert Letter Spacing
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
LETTER_SPACING_INDEX	TokenNameIdentifier	 LETTER  SPACING  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Converts a word-spacing CSS value to a value usable as a text * attribute, or null. * @param e the element */	TokenNameCOMMENT_JAVADOC	 Converts a word-spacing CSS value to a value usable as a text attribute, or null. @param e the element 
public	TokenNamepublic	
static	TokenNamestatic	
Float	TokenNameIdentifier	 Float
convertWordSpacing	TokenNameIdentifier	 convert Word Spacing
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
CSSUtilities	TokenNameIdentifier	 CSS Utilities
.	TokenNameDOT	
getComputedStyle	TokenNameIdentifier	 get Computed Style
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
SVGCSSEngine	TokenNameIdentifier	 SVGCSS Engine
.	TokenNameDOT	
WORD_SPACING_INDEX	TokenNameIdentifier	 WORD  SPACING  INDEX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getPrimitiveType	TokenNameIdentifier	 get Primitive Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
CSSPrimitiveValue	TokenNameIdentifier	 CSS Primitive Value
.	TokenNameDOT	
CSS_IDENT	TokenNameIdentifier	 CSS  IDENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
