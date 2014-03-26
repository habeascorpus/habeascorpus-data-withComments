/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
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
LinkedList	TokenNameIdentifier	 Linked List
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
/** * A handler class that generates an array of shorts and an array floats from * parsing path data. * * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> * @version $Id: PathArrayProducer.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 A handler class that generates an array of shorts and an array floats from parsing path data. * @author <a href="mailto:cam%40mcc%2eid%2eau">Cameron McCormack</a> @version $Id: PathArrayProducer.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
PathArrayProducer	TokenNameIdentifier	 Path Array Producer
implements	TokenNameimplements	
PathHandler	TokenNameIdentifier	 Path Handler
{	TokenNameLBRACE	
/** * List of <code>float[]</code> objects. */	TokenNameCOMMENT_JAVADOC	 List of <code>float[]</code> objects. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
ps	TokenNameIdentifier	 ps
;	TokenNameSEMICOLON	
/** * The current <code>float[]</code> object. */	TokenNameCOMMENT_JAVADOC	 The current <code>float[]</code> object. 
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
/** * List of <code>short[]</code> objects. */	TokenNameCOMMENT_JAVADOC	 List of <code>short[]</code> objects. 
protected	TokenNameprotected	
LinkedList	TokenNameIdentifier	 Linked List
cs	TokenNameIdentifier	 cs
;	TokenNameSEMICOLON	
/** * The current <code>short[]</code> object. */	TokenNameCOMMENT_JAVADOC	 The current <code>short[]</code> object. 
protected	TokenNameprotected	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
/** * The index in which to store the next path command. */	TokenNameCOMMENT_JAVADOC	 The index in which to store the next path command. 
protected	TokenNameprotected	
int	TokenNameint	
cindex	TokenNameIdentifier	 cindex
;	TokenNameSEMICOLON	
/** * The index in which to store the next path parameter. */	TokenNameCOMMENT_JAVADOC	 The index in which to store the next path parameter. 
protected	TokenNameprotected	
int	TokenNameint	
pindex	TokenNameIdentifier	 pindex
;	TokenNameSEMICOLON	
/** * The total number of path commands accumulated. */	TokenNameCOMMENT_JAVADOC	 The total number of path commands accumulated. 
protected	TokenNameprotected	
int	TokenNameint	
ccount	TokenNameIdentifier	 ccount
;	TokenNameSEMICOLON	
/** * The total number of path parameters accumulated. */	TokenNameCOMMENT_JAVADOC	 The total number of path parameters accumulated. 
protected	TokenNameprotected	
int	TokenNameint	
pcount	TokenNameIdentifier	 pcount
;	TokenNameSEMICOLON	
/** * Returns the array of path commands accumulated. */	TokenNameCOMMENT_JAVADOC	 Returns the array of path commands accumulated. 
public	TokenNamepublic	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPathCommands	TokenNameIdentifier	 get Path Commands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the array of path parameters accumulated. */	TokenNameCOMMENT_JAVADOC	 Returns the array of path parameters accumulated. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPathParameters	TokenNameIdentifier	 get Path Parameters
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// PathHandler /////////////////////////////////////////////////////////// 	TokenNameCOMMENT_LINE	PathHandler /////////////////////////////////////////////////////////// 
/** * Implements {@link PathHandler#startPath()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#startPath()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startPath	TokenNameIdentifier	 start Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
11	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ccount	TokenNameIdentifier	 ccount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pcount	TokenNameIdentifier	 pcount
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cindex	TokenNameIdentifier	 cindex
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#movetoRel(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#movetoRel(float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_MOVETO_REL	TokenNameIdentifier	 PATHSEG  MOVETO  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#movetoAbs(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#movetoAbs(float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_MOVETO_ABS	TokenNameIdentifier	 PATHSEG  MOVETO  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#closePath()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#closePath()}. 
public	TokenNamepublic	
void	TokenNamevoid	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CLOSEPATH	TokenNameIdentifier	 PATHSEG  CLOSEPATH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#linetoRel(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#linetoRel(float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_LINETO_REL	TokenNameIdentifier	 PATHSEG  LINETO  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#linetoAbs(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#linetoAbs(float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_LINETO_ABS	TokenNameIdentifier	 PATHSEG  LINETO  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#linetoHorizontalRel(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#linetoHorizontalRel(float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_LINETO_HORIZONTAL_REL	TokenNameIdentifier	 PATHSEG  LINETO  HORIZONTAL  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#linetoHorizontalAbs(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#linetoHorizontalAbs(float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_LINETO_HORIZONTAL_ABS	TokenNameIdentifier	 PATHSEG  LINETO  HORIZONTAL  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#linetoVerticalRel(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#linetoVerticalRel(float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_LINETO_VERTICAL_REL	TokenNameIdentifier	 PATHSEG  LINETO  VERTICAL  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#linetoVerticalAbs(float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#linetoVerticalAbs(float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_LINETO_VERTICAL_ABS	TokenNameIdentifier	 PATHSEG  LINETO  VERTICAL  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * PathHandler#curvetoCubicRel(float,float,float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoCubicRel(float,float,float,float,float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_CUBIC_REL	TokenNameIdentifier	 PATHSEG  CURVETO  CUBIC  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * PathHandler#curvetoCubicAbs(float,float,float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoCubicAbs(float,float,float,float,float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_CUBIC_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  CUBIC  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * PathHandler#curvetoCubicSmoothRel(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoCubicSmoothRel(float,float,float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_CUBIC_SMOOTH_REL	TokenNameIdentifier	 PATHSEG  CURVETO  CUBIC  SMOOTH  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * PathHandler#curvetoCubicSmoothAbs(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoCubicSmoothAbs(float,float,float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_CUBIC_SMOOTH_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  CUBIC  SMOOTH  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * PathHandler#curvetoQuadraticRel(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoQuadraticRel(float,float,float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_QUADRATIC_REL	TokenNameIdentifier	 PATHSEG  CURVETO  QUADRATIC  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * PathHandler#curvetoQuadraticAbs(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoQuadraticAbs(float,float,float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_QUADRATIC_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  QUADRATIC  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#curvetoQuadraticSmoothRel(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoQuadraticSmoothRel(float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_QUADRATIC_SMOOTH_REL	TokenNameIdentifier	 PATHSEG  CURVETO  QUADRATIC  SMOOTH  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#curvetoQuadraticSmoothAbs(float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoQuadraticSmoothAbs(float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_CURVETO_QUADRATIC_SMOOTH_ABS	TokenNameIdentifier	 PATHSEG  CURVETO  QUADRATIC  SMOOTH  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * PathHandler#arcRel(float,float,float,boolean,boolean,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#arcRel(float,float,float,boolean,boolean,float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_ARC_REL	TokenNameIdentifier	 PATHSEG  ARC  REL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
ry	TokenNameIdentifier	 ry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
xAxisRotation	TokenNameIdentifier	 x Axis Rotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
sweepFlag	TokenNameIdentifier	 sweep Flag
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link * PathHandler#arcAbs(float,float,float,boolean,boolean,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#arcAbs(float,float,float,boolean,boolean,float,float)}. 
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
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
SVGPathSeg	TokenNameIdentifier	 SVG Path Seg
.	TokenNameDOT	
PATHSEG_ARC_ABS	TokenNameIdentifier	 PATHSEG  ARC  ABS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
rx	TokenNameIdentifier	 rx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
ry	TokenNameIdentifier	 ry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
xAxisRotation	TokenNameIdentifier	 x Axis Rotation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
largeArcFlag	TokenNameIdentifier	 large Arc Flag
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
sweepFlag	TokenNameIdentifier	 sweep Flag
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a path command to the list. */	TokenNameCOMMENT_JAVADOC	 Adds a path command to the list. 
protected	TokenNameprotected	
void	TokenNamevoid	
command	TokenNameIdentifier	 command
(	TokenNameLPAREN	
short	TokenNameshort	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cindex	TokenNameIdentifier	 cindex
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
cindex	TokenNameIdentifier	 cindex
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
cindex	TokenNameIdentifier	 cindex
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
ccount	TokenNameIdentifier	 ccount
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a path parameter to the list. */	TokenNameCOMMENT_JAVADOC	 Adds a path parameter to the list. 
protected	TokenNameprotected	
void	TokenNamevoid	
param	TokenNameIdentifier	 param
(	TokenNameLPAREN	
float	TokenNamefloat	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pindex	TokenNameIdentifier	 pindex
==	TokenNameEQUAL_EQUAL	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pindex	TokenNameIdentifier	 pindex
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
pindex	TokenNameIdentifier	 pindex
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
pcount	TokenNameIdentifier	 pcount
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#endPath()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#endPath()}. 
public	TokenNamepublic	
void	TokenNamevoid	
endPath	TokenNameIdentifier	 end Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allCommands	TokenNameIdentifier	 all Commands
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
ccount	TokenNameIdentifier	 ccount
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allCommands	TokenNameIdentifier	 all Commands
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allCommands	TokenNameIdentifier	 all Commands
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
cindex	TokenNameIdentifier	 cindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
allCommands	TokenNameIdentifier	 all Commands
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allParams	TokenNameIdentifier	 all Params
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
pcount	TokenNameIdentifier	 pcount
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allParams	TokenNameIdentifier	 all Params
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
allParams	TokenNameIdentifier	 all Params
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
pindex	TokenNameIdentifier	 pindex
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
allParams	TokenNameIdentifier	 all Params
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
