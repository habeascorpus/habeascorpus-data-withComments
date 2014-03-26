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
Arc2D	TokenNameIdentifier	 Arc2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
PathIterator	TokenNameIdentifier	 Path Iterator
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
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
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
DefaultPathHandler	TokenNameIdentifier	 Default Path Handler
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
svg	TokenNameIdentifier	 svg
.	TokenNameDOT	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
;	TokenNameSEMICOLON	
/** * This class is the implementation of the normalized * <code>SVGPathSegList</code>. * * @author <a href="mailto:andrest@world-affair.com">Andres Toussaint</a> * @version $Id: AbstractSVGNormPathSegList.java 2005-07-28$ */	TokenNameCOMMENT_JAVADOC	 This class is the implementation of the normalized <code>SVGPathSegList</code>. * @author <a href="mailto:andrest@world-affair.com">Andres Toussaint</a> @version $Id: AbstractSVGNormPathSegList.java 2005-07-28$ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSVGNormPathSegList	TokenNameIdentifier	 Abstract SVG Norm Path Seg List
extends	TokenNameextends	
AbstractSVGPathSegList	TokenNameIdentifier	 Abstract SVG Path Seg List
{	TokenNameLBRACE	
/** * Creates a new SVGNormPathSegList. */	TokenNameCOMMENT_JAVADOC	 Creates a new SVGNormPathSegList. 
protected	TokenNameprotected	
AbstractSVGNormPathSegList	TokenNameIdentifier	 Abstract SVG Norm Path Seg List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parse the 'd' attribute. * * @param value 'd' attribute value * @param handler : list handler */	TokenNameCOMMENT_JAVADOC	 Parse the 'd' attribute. * @param value 'd' attribute value @param handler : list handler 
protected	TokenNameprotected	
void	TokenNamevoid	
doParse	TokenNameIdentifier	 do Parse
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
ListHandler	TokenNameIdentifier	 List Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
PathParser	TokenNameIdentifier	 Path Parser
pathParser	TokenNameIdentifier	 path Parser
=	TokenNameEQUAL	
new	TokenNamenew	
PathParser	TokenNameIdentifier	 Path Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
NormalizedPathSegListBuilder	TokenNameIdentifier	 Normalized Path Seg List Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
NormalizedPathSegListBuilder	TokenNameIdentifier	 Normalized Path Seg List Builder
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathParser	TokenNameIdentifier	 path Parser
.	TokenNameDOT	
setPathHandler	TokenNameIdentifier	 set Path Handler
(	TokenNameLPAREN	
builder	TokenNameIdentifier	 builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathParser	TokenNameIdentifier	 path Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
class	TokenNameclass	
NormalizedPathSegListBuilder	TokenNameIdentifier	 Normalized Path Seg List Builder
extends	TokenNameextends	
DefaultPathHandler	TokenNameIdentifier	 Default Path Handler
{	TokenNameLBRACE	
protected	TokenNameprotected	
ListHandler	TokenNameIdentifier	 List Handler
listHandler	TokenNameIdentifier	 list Handler
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SVGPathSegGenericItem	TokenNameIdentifier	 SVG Path Seg Generic Item
lastAbs	TokenNameIdentifier	 last Abs
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NormalizedPathSegListBuilder	TokenNameIdentifier	 Normalized Path Seg List Builder
(	TokenNameLPAREN	
ListHandler	TokenNameIdentifier	 List Handler
listHandler	TokenNameIdentifier	 list Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
listHandler	TokenNameIdentifier	 list Handler
=	TokenNameEQUAL	
listHandler	TokenNameIdentifier	 list Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#startPath()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#startPath()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startPath	TokenNameIdentifier	 start Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
startList	TokenNameIdentifier	 start List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
=	TokenNameEQUAL	
new	TokenNamenew	
SVGPathSegGenericItem	TokenNameIdentifier	 SVG Path Seg Generic Item
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_MOVETO_ABS	TokenNameIdentifier	 PATHSEG  MOVETO  ABS
,	TokenNameCOMMA	
PATHSEG_MOVETO_ABS_LETTER	TokenNameIdentifier	 PATHSEG  MOVETO  ABS  LETTER
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#endPath()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#endPath()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endPath	TokenNameIdentifier	 end Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
endList	TokenNameIdentifier	 end List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#movetoRel(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#movetoRel(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
movetoRel	TokenNameIdentifier	 moveto Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
movetoAbs	TokenNameIdentifier	 moveto Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#movetoAbs(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#movetoAbs(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
movetoAbs	TokenNameIdentifier	 moveto Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPathSegMovetoLinetoItem	TokenNameIdentifier	 SVG Path Seg Moveto Lineto Item
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_MOVETO_ABS	TokenNameIdentifier	 PATHSEG  MOVETO  ABS
,	TokenNameCOMMA	
PATHSEG_MOVETO_ABS_LETTER	TokenNameIdentifier	 PATHSEG  MOVETO  ABS  LETTER
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setPathSegType	TokenNameIdentifier	 set Path Seg Type
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_MOVETO_ABS	TokenNameIdentifier	 PATHSEG  MOVETO  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#closePath()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#closePath()}. 
public	TokenNamepublic	
void	TokenNamevoid	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPathSegItem	TokenNameIdentifier	 SVG Path Seg Item
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CLOSEPATH	TokenNameIdentifier	 PATHSEG  CLOSEPATH
,	TokenNameCOMMA	
PATHSEG_CLOSEPATH_LETTER	TokenNameIdentifier	 PATHSEG  CLOSEPATH  LETTER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#linetoRel(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#linetoRel(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
linetoRel	TokenNameIdentifier	 lineto Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
linetoAbs	TokenNameIdentifier	 lineto Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#linetoAbs(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#linetoAbs(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
linetoAbs	TokenNameIdentifier	 lineto Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPathSegMovetoLinetoItem	TokenNameIdentifier	 SVG Path Seg Moveto Lineto Item
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_LINETO_ABS	TokenNameIdentifier	 PATHSEG  LINETO  ABS
,	TokenNameCOMMA	
PATHSEG_LINETO_ABS_LETTER	TokenNameIdentifier	 PATHSEG  LINETO  ABS  LETTER
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setPathSegType	TokenNameIdentifier	 set Path Seg Type
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_LINETO_ABS	TokenNameIdentifier	 PATHSEG  LINETO  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#linetoHorizontalRel(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#linetoHorizontalRel(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
linetoHorizontalRel	TokenNameIdentifier	 lineto Horizontal Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
linetoAbs	TokenNameIdentifier	 lineto Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#linetoHorizontalAbs(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#linetoHorizontalAbs(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
linetoHorizontalAbs	TokenNameIdentifier	 lineto Horizontal Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
linetoAbs	TokenNameIdentifier	 lineto Abs
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#linetoVerticalRel(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#linetoVerticalRel(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
linetoVerticalRel	TokenNameIdentifier	 lineto Vertical Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
linetoAbs	TokenNameIdentifier	 lineto Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#linetoVerticalAbs(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#linetoVerticalAbs(float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
linetoVerticalAbs	TokenNameIdentifier	 lineto Vertical Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
linetoAbs	TokenNameIdentifier	 lineto Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.parser.PathHandler#curvetoCubicRel(float,float,float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#curvetoCubicRel(float,float,float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
curvetoCubicRel	TokenNameIdentifier	 curveto Cubic Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
curvetoCubicAbs	TokenNameIdentifier	 curveto Cubic Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.parser.PathHandler#curvetoCubicAbs(float,float,float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#curvetoCubicAbs(float,float,float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
curvetoCubicAbs	TokenNameIdentifier	 curveto Cubic Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
listHandler	TokenNameIdentifier	 list Handler
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
new	TokenNamenew	
SVGPathSegCurvetoCubicItem	TokenNameIdentifier	 SVG Path Seg Curveto Cubic Item
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_CUBIC_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  CUBIC  ABS
,	TokenNameCOMMA	
PATHSEG_CURVETO_CUBIC_ABS_LETTER	TokenNameIdentifier	 PATHSEG  CURVETO  CUBIC  ABS  LETTER
,	TokenNameCOMMA	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setPathSegType	TokenNameIdentifier	 set Path Seg Type
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_CUBIC_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  CUBIC  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.parser.PathHandler#curvetoCubicSmoothRel(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#curvetoCubicSmoothRel(float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
curvetoCubicSmoothRel	TokenNameIdentifier	 curveto Cubic Smooth Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
curvetoCubicSmoothAbs	TokenNameIdentifier	 curveto Cubic Smooth Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.parser.PathHandler#curvetoCubicSmoothAbs(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#curvetoCubicSmoothAbs(float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
curvetoCubicSmoothAbs	TokenNameIdentifier	 curveto Cubic Smooth Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getPathSegType	TokenNameIdentifier	 get Path Seg Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_CUBIC_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  CUBIC  ABS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curvetoCubicAbs	TokenNameIdentifier	 curveto Cubic Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX2	TokenNameIdentifier	 get X2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY2	TokenNameIdentifier	 get Y2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
curvetoCubicAbs	TokenNameIdentifier	 curveto Cubic Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.parser.PathHandler#curvetoQuadraticRel(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#curvetoQuadraticRel(float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
curvetoQuadraticRel	TokenNameIdentifier	 curveto Quadratic Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
curvetoQuadraticAbs	TokenNameIdentifier	 curveto Quadratic Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.parser.PathHandler#curvetoQuadraticAbs(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#curvetoQuadraticAbs(float,float,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
curvetoQuadraticAbs	TokenNameIdentifier	 curveto Quadratic Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
curvetoCubicAbs	TokenNameIdentifier	 curveto Cubic Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
-	TokenNameMINUS	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
-	TokenNameMINUS	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
-	TokenNameMINUS	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setX1	TokenNameIdentifier	 set X1
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setY1	TokenNameIdentifier	 set Y1
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setPathSegType	TokenNameIdentifier	 set Path Seg Type
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_QUADRATIC_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  QUADRATIC  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#curvetoQuadraticSmoothRel(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#curvetoQuadraticSmoothRel(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
curvetoQuadraticSmoothRel	TokenNameIdentifier	 curveto Quadratic Smooth Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
curvetoQuadraticSmoothAbs	TokenNameIdentifier	 curveto Quadratic Smooth Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link org.apache.batik.parser.PathHandler#curvetoQuadraticSmoothAbs(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#curvetoQuadraticSmoothAbs(float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
curvetoQuadraticSmoothAbs	TokenNameIdentifier	 curveto Quadratic Smooth Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getPathSegType	TokenNameIdentifier	 get Path Seg Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_QUADRATIC_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  QUADRATIC  ABS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curvetoQuadraticAbs	TokenNameIdentifier	 curveto Quadratic Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX1	TokenNameIdentifier	 get X1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY1	TokenNameIdentifier	 get Y1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
curvetoQuadraticAbs	TokenNameIdentifier	 curveto Quadratic Abs
(	TokenNameLPAREN	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.parser.PathHandler#arcRel(float,float,float,boolean,boolean,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#arcRel(float,float,float,boolean,boolean,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
arcRel	TokenNameIdentifier	 arc Rel
(	TokenNameLPAREN	
float	TokenNamefloat	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
float	TokenNamefloat	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
float	TokenNamefloat	
xAxisRotation	TokenNameIdentifier	 x Axis Rotation
,	TokenNameCOMMA	
boolean	TokenNameboolean	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
,	TokenNameCOMMA	
boolean	TokenNameboolean	
sweepFlag	TokenNameIdentifier	 sweep Flag
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
arcAbs	TokenNameIdentifier	 arc Abs
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
xAxisRotation	TokenNameIdentifier	 x Axis Rotation
,	TokenNameCOMMA	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
,	TokenNameCOMMA	
sweepFlag	TokenNameIdentifier	 sweep Flag
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * org.apache.batik.parser.PathHandler#arcAbs(float,float,float,boolean,boolean,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link org.apache.batik.parser.PathHandler#arcAbs(float,float,float,boolean,boolean,float,float)}. 
public	TokenNamepublic	
void	TokenNamevoid	
arcAbs	TokenNameIdentifier	 arc Abs
(	TokenNameLPAREN	
float	TokenNamefloat	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
float	TokenNamefloat	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
float	TokenNamefloat	
xAxisRotation	TokenNameIdentifier	 x Axis Rotation
,	TokenNameCOMMA	
boolean	TokenNameboolean	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
,	TokenNameCOMMA	
boolean	TokenNameboolean	
sweepFlag	TokenNameIdentifier	 sweep Flag
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
// Ensure radii are valid 	TokenNameCOMMENT_LINE	Ensure radii are valid 
if	TokenNameif	
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
ry	TokenNameIdentifier	 ry
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
linetoAbs	TokenNameIdentifier	 lineto Abs
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Get the current (x, y) coordinates of the path 	TokenNameCOMMENT_LINE	Get the current (x, y) coordinates of the path 
double	TokenNamedouble	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
==	TokenNameEQUAL_EQUAL	
x	TokenNameIdentifier	 x
&&	TokenNameAND_AND	
y0	TokenNameIdentifier	 y0
==	TokenNameEQUAL_EQUAL	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If the endpoints (x, y) and (x0, y0) are identical, then this 	TokenNameCOMMENT_LINE	If the endpoints (x, y) and (x0, y0) are identical, then this 
// is equivalent to omitting the elliptical arc segment entirely. 	TokenNameCOMMENT_LINE	is equivalent to omitting the elliptical arc segment entirely. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Arc2D	TokenNameIdentifier	 Arc2 D
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
.	TokenNameDOT	
computeArc	TokenNameIdentifier	 compute Arc
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
,	TokenNameCOMMA	
rx	TokenNameIdentifier	 rx
,	TokenNameCOMMA	
ry	TokenNameIdentifier	 ry
,	TokenNameCOMMA	
xAxisRotation	TokenNameIdentifier	 x Axis Rotation
,	TokenNameCOMMA	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
,	TokenNameCOMMA	
sweepFlag	TokenNameIdentifier	 sweep Flag
,	TokenNameCOMMA	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
AffineTransform	TokenNameIdentifier	 Affine Transform
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
AffineTransform	TokenNameIdentifier	 Affine Transform
.	TokenNameDOT	
getRotateInstance	TokenNameIdentifier	 get Rotate Instance
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
toRadians	TokenNameIdentifier	 to Radians
(	TokenNameLPAREN	
xAxisRotation	TokenNameIdentifier	 x Axis Rotation
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getCenterX	TokenNameIdentifier	 get Center X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
getCenterY	TokenNameIdentifier	 get Center Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
createTransformedShape	TokenNameIdentifier	 create Transformed Shape
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PathIterator	TokenNameIdentifier	 Path Iterator
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CUBICTO	TokenNameIdentifier	 SEG  CUBICTO
:	TokenNameCOLON	
curvetoCubicAbs	TokenNameIdentifier	 curveto Cubic Abs
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
5	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastAbs	TokenNameIdentifier	 last Abs
.	TokenNameDOT	
setPathSegType	TokenNameIdentifier	 set Path Seg Type
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_ARC_ABS	TokenNameIdentifier	 PATHSEG  ARC  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
class	TokenNameclass	
SVGPathSegGenericItem	TokenNameIdentifier	 SVG Path Seg Generic Item
extends	TokenNameextends	
SVGPathSegItem	TokenNameIdentifier	 SVG Path Seg Item
{	TokenNameLBRACE	
public	TokenNamepublic	
SVGPathSegGenericItem	TokenNameIdentifier	 SVG Path Seg Generic Item
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
letter	TokenNameIdentifier	 letter
,	TokenNameCOMMA	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
letter	TokenNameIdentifier	 letter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
float	TokenNamefloat	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
float	TokenNamefloat	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
float	TokenNamefloat	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
float	TokenNamefloat	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPathSegType	TokenNameIdentifier	 set Path Seg Type
(	TokenNameLPAREN	
short	TokenNameshort	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getX1	TokenNameIdentifier	 get X1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getY1	TokenNameIdentifier	 get Y1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setX1	TokenNameIdentifier	 set X1
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setY1	TokenNameIdentifier	 set Y1
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getX2	TokenNameIdentifier	 get X2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x2	TokenNameIdentifier	 x2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getY2	TokenNameIdentifier	 get Y2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y2	TokenNameIdentifier	 y2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setX2	TokenNameIdentifier	 set X2
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setY2	TokenNameIdentifier	 set Y2
(	TokenNameLPAREN	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
y2	TokenNameIdentifier	 y2
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
