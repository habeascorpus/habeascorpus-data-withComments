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
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
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
/** * This class provides methods to convert SVG length and coordinate to * float in user units. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> * @version $Id: UnitProcessor.java 501922 2007-01-31 17:47:47Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This class provides methods to convert SVG length and coordinate to float in user units. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @author <a href="mailto:tkormann@apache.org">Thierry Kormann</a> @version $Id: UnitProcessor.java 501922 2007-01-31 17:47:47Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
UnitProcessor	TokenNameIdentifier	 Unit Processor
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
UnitProcessor	TokenNameIdentifier	 Unit Processor
{	TokenNameLBRACE	
/** * Creates a context for the specified element. * * @param ctx the bridge context that contains the user agent and * viewport definition * @param e the element interested in its context */	TokenNameCOMMENT_JAVADOC	 Creates a context for the specified element. * @param ctx the bridge context that contains the user agent and viewport definition @param e the element interested in its context 
public	TokenNamepublic	
static	TokenNamestatic	
Context	TokenNameIdentifier	 Context
createContext	TokenNameIdentifier	 create Context
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DefaultContext	TokenNameIdentifier	 Default Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG methods - objectBoundingBox 	TokenNameCOMMENT_LINE	SVG methods - objectBoundingBox 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
/** * Returns the specified horizontal coordinate in object bounding box * coordinate system. * * @param s the horizontal coordinate * @param attr the attribute name that represents the coordinate * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified horizontal coordinate in object bounding box coordinate system. * @param s the horizontal coordinate @param attr the attribute name that represents the coordinate @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgHorizontalCoordinateToObjectBoundingBox	TokenNameIdentifier	 svg Horizontal Coordinate To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified vertical coordinate in object bounding box * coordinate system. * * @param s the vertical coordinate * @param attr the attribute name that represents the coordinate * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified vertical coordinate in object bounding box coordinate system. * @param s the vertical coordinate @param attr the attribute name that represents the coordinate @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgVerticalCoordinateToObjectBoundingBox	TokenNameIdentifier	 svg Vertical Coordinate To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified 'other' coordinate in object bounding box * coordinate system. * * @param s the 'other' coordinate * @param attr the attribute name that represents the coordinate * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified 'other' coordinate in object bounding box coordinate system. * @param s the 'other' coordinate @param attr the attribute name that represents the coordinate @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgOtherCoordinateToObjectBoundingBox	TokenNameIdentifier	 svg Other Coordinate To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
OTHER_LENGTH	TokenNameIdentifier	 OTHER  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified horizontal length in object bounding box * coordinate system. A length must be greater than 0. * * @param s the 'other' length * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified horizontal length in object bounding box coordinate system. A length must be greater than 0. * @param s the 'other' length @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgHorizontalLengthToObjectBoundingBox	TokenNameIdentifier	 svg Horizontal Length To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgLengthToObjectBoundingBox	TokenNameIdentifier	 svg Length To Object Bounding Box
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified vertical length in object bounding box * coordinate system. A length must be greater than 0. * * @param s the vertical length * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified vertical length in object bounding box coordinate system. A length must be greater than 0. * @param s the vertical length @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgVerticalLengthToObjectBoundingBox	TokenNameIdentifier	 svg Vertical Length To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgLengthToObjectBoundingBox	TokenNameIdentifier	 svg Length To Object Bounding Box
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified 'other' length in object bounding box * coordinate system. A length must be greater than 0. * * @param s the 'other' length * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified 'other' length in object bounding box coordinate system. A length must be greater than 0. * @param s the 'other' length @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgOtherLengthToObjectBoundingBox	TokenNameIdentifier	 svg Other Length To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgLengthToObjectBoundingBox	TokenNameIdentifier	 svg Length To Object Bounding Box
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
OTHER_LENGTH	TokenNameIdentifier	 OTHER  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified length with the specified direction in * user units. A length must be greater than 0. * * @param s the length * @param attr the attribute name that represents the length * @param d the direction of the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified length with the specified direction in user units. A length must be greater than 0. * @param s the length @param attr the attribute name that represents the length @param d the direction of the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgLengthToObjectBoundingBox	TokenNameIdentifier	 svg Length To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
getBridgeContext	TokenNameIdentifier	 get Bridge Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_LENGTH_NEGATIVE	TokenNameIdentifier	 ERR  LENGTH  NEGATIVE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified value with the specified direction in * objectBoundingBox units. * * @param s the value * @param attr the attribute name that represents the value * @param d the direction of the value * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified value with the specified direction in objectBoundingBox units. * @param s the value @param attr the attribute name that represents the value @param d the direction of the value @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
svgToObjectBoundingBox	TokenNameIdentifier	 svg To Object Bounding Box
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
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
getBridgeContext	TokenNameIdentifier	 get Bridge Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pEx	TokenNameIdentifier	 p Ex
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
pEx	TokenNameIdentifier	 p Ex
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
// SVG methods - userSpace 	TokenNameCOMMENT_LINE	SVG methods - userSpace 
///////////////////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	/////////////////////////////////////////////////////////////////////// 
/** * Returns the specified horizontal length in user units. A length * must be greater than 0. * * @param s the horizontal length * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified horizontal length in user units. A length must be greater than 0. * @param s the horizontal length @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgHorizontalLengthToUserSpace	TokenNameIdentifier	 svg Horizontal Length To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgLengthToUserSpace	TokenNameIdentifier	 svg Length To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified vertical length in user units. A length * must be greater than 0. * * @param s the vertical length * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified vertical length in user units. A length must be greater than 0. * @param s the vertical length @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgVerticalLengthToUserSpace	TokenNameIdentifier	 svg Vertical Length To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgLengthToUserSpace	TokenNameIdentifier	 svg Length To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified 'other' length in user units. A length * must be greater than 0. * * @param s the 'other' length * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified 'other' length in user units. A length must be greater than 0. * @param s the 'other' length @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgOtherLengthToUserSpace	TokenNameIdentifier	 svg Other Length To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgLengthToUserSpace	TokenNameIdentifier	 svg Length To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
OTHER_LENGTH	TokenNameIdentifier	 OTHER  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified horizontal coordinate in user units. * * @param s the horizontal coordinate * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified horizontal coordinate in user units. * @param s the horizontal coordinate @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgHorizontalCoordinateToUserSpace	TokenNameIdentifier	 svg Horizontal Coordinate To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
HORIZONTAL_LENGTH	TokenNameIdentifier	 HORIZONTAL  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified vertical coordinate in user units. * * @param s the vertical coordinate * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified vertical coordinate in user units. * @param s the vertical coordinate @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgVerticalCoordinateToUserSpace	TokenNameIdentifier	 svg Vertical Coordinate To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
VERTICAL_LENGTH	TokenNameIdentifier	 VERTICAL  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified 'other' coordinate in user units. * * @param s the 'other' coordinate * @param attr the attribute name that represents the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified 'other' coordinate in user units. * @param s the 'other' coordinate @param attr the attribute name that represents the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgOtherCoordinateToUserSpace	TokenNameIdentifier	 svg Other Coordinate To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
OTHER_LENGTH	TokenNameIdentifier	 OTHER  LENGTH
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the specified length with the specified direction in * user units. A length must be greater than 0. * * @param s the 'other' coordinate * @param attr the attribute name that represents the length * @param d the direction of the length * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified length with the specified direction in user units. A length must be greater than 0. * @param s the 'other' coordinate @param attr the attribute name that represents the length @param d the direction of the length @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgLengthToUserSpace	TokenNameIdentifier	 svg Length To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
BridgeException	TokenNameIdentifier	 Bridge Exception
(	TokenNameLPAREN	
getBridgeContext	TokenNameIdentifier	 get Bridge Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_LENGTH_NEGATIVE	TokenNameIdentifier	 ERR  LENGTH  NEGATIVE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the specified coordinate with the specified direction * in user units. * * @param s the 'other' coordinate * @param attr the attribute name that represents the length * @param d the direction of the coordinate * @param ctx the context used to resolve relative value */	TokenNameCOMMENT_JAVADOC	 Returns the specified coordinate with the specified direction in user units. * @param s the 'other' coordinate @param attr the attribute name that represents the length @param d the direction of the coordinate @param ctx the context used to resolve relative value 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
short	TokenNameshort	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
UnitProcessor	TokenNameIdentifier	 Unit Processor
.	TokenNameDOT	
svgToUserSpace	TokenNameIdentifier	 svg To User Space
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
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
getBridgeContext	TokenNameIdentifier	 get Bridge Context
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
pEx	TokenNameIdentifier	 p Ex
,	TokenNameCOMMA	
ErrorConstants	TokenNameIdentifier	 Error Constants
.	TokenNameDOT	
ERR_ATTRIBUTE_VALUE_MALFORMED	TokenNameIdentifier	 ERR  ATTRIBUTE  VALUE  MALFORMED
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
attr	TokenNameIdentifier	 attr
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
pEx	TokenNameIdentifier	 p Ex
,	TokenNameCOMMA	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the {@link BridgeContext} from the given {@link Context} * if it is a {@link DefaultContext}, or null otherwise. */	TokenNameCOMMENT_JAVADOC	 Returns the {@link BridgeContext} from the given {@link Context} if it is a {@link DefaultContext}, or null otherwise. 
protected	TokenNameprotected	
static	TokenNamestatic	
BridgeContext	TokenNameIdentifier	 Bridge Context
getBridgeContext	TokenNameIdentifier	 get Bridge Context
(	TokenNameLPAREN	
Context	TokenNameIdentifier	 Context
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ctx	TokenNameIdentifier	 ctx
instanceof	TokenNameinstanceof	
DefaultContext	TokenNameIdentifier	 Default Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DefaultContext	TokenNameIdentifier	 Default Context
)	TokenNameRPAREN	
ctx	TokenNameIdentifier	 ctx
)	TokenNameRPAREN	
.	TokenNameDOT	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class is the default context for a particular element. Information * not available on the element are obtained from the bridge context (such * as the viewport or the pixel to millimeter factor). */	TokenNameCOMMENT_JAVADOC	 This class is the default context for a particular element. Information not available on the element are obtained from the bridge context (such as the viewport or the pixel to millimeter factor). 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DefaultContext	TokenNameIdentifier	 Default Context
implements	TokenNameimplements	
Context	TokenNameIdentifier	 Context
{	TokenNameLBRACE	
/** * The element. */	TokenNameCOMMENT_JAVADOC	 The element. 
protected	TokenNameprotected	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
/** * The bridge context. */	TokenNameCOMMENT_JAVADOC	 The bridge context. 
protected	TokenNameprotected	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
/** * Creates a new DefaultContext. */	TokenNameCOMMENT_JAVADOC	 Creates a new DefaultContext. 
public	TokenNamepublic	
DefaultContext	TokenNameIdentifier	 Default Context
(	TokenNameLPAREN	
BridgeContext	TokenNameIdentifier	 Bridge Context
ctx	TokenNameIdentifier	 ctx
,	TokenNameCOMMA	
Element	TokenNameIdentifier	 Element
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ctx	TokenNameIdentifier	 ctx
=	TokenNameEQUAL	
ctx	TokenNameIdentifier	 ctx
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the element. */	TokenNameCOMMENT_JAVADOC	 Returns the element. 
public	TokenNamepublic	
Element	TokenNameIdentifier	 Element
getElement	TokenNameIdentifier	 get Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of a px CSS unit in millimeters. */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getUserAgent	TokenNameIdentifier	 get User Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of a px CSS unit in millimeters. * This will be removed after next release. * @see #getPixelUnitToMillimeter() */	TokenNameCOMMENT_JAVADOC	 Returns the size of a px CSS unit in millimeters. This will be removed after next release. @see #getPixelUnitToMillimeter() 
public	TokenNamepublic	
float	TokenNamefloat	
getPixelToMM	TokenNameIdentifier	 get Pixel To MM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getPixelUnitToMillimeter	TokenNameIdentifier	 get Pixel Unit To Millimeter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the font-size value. */	TokenNameCOMMENT_JAVADOC	 Returns the font-size value. 
public	TokenNamepublic	
float	TokenNamefloat	
getFontSize	TokenNameIdentifier	 get Font Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
.	TokenNameDOT	
getFloatValue	TokenNameIdentifier	 get Float Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the x-height value. */	TokenNameCOMMENT_JAVADOC	 Returns the x-height value. 
public	TokenNamepublic	
float	TokenNamefloat	
getXHeight	TokenNameIdentifier	 get X Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0.5f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport width used to compute units. */	TokenNameCOMMENT_JAVADOC	 Returns the viewport width used to compute units. 
public	TokenNamepublic	
float	TokenNamefloat	
getViewportWidth	TokenNameIdentifier	 get Viewport Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewport	TokenNameIdentifier	 get Viewport
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the viewport height used to compute units. */	TokenNameCOMMENT_JAVADOC	 Returns the viewport height used to compute units. 
public	TokenNamepublic	
float	TokenNamefloat	
getViewportHeight	TokenNameIdentifier	 get Viewport Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ctx	TokenNameIdentifier	 ctx
.	TokenNameDOT	
getViewport	TokenNameIdentifier	 get Viewport
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
