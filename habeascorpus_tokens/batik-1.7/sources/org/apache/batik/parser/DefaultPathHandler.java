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
/** * The class provides an adapter for PathHandler. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DefaultPathHandler.java 478188 2006-11-22 15:19:17Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 The class provides an adapter for PathHandler. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DefaultPathHandler.java 478188 2006-11-22 15:19:17Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
DefaultPathHandler	TokenNameIdentifier	 Default Path Handler
implements	TokenNameimplements	
PathHandler	TokenNameIdentifier	 Path Handler
{	TokenNameLBRACE	
/** * The only instance of this class. */	TokenNameCOMMENT_JAVADOC	 The only instance of this class. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
PathHandler	TokenNameIdentifier	 Path Handler
INSTANCE	TokenNameIdentifier	 INSTANCE
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultPathHandler	TokenNameIdentifier	 Default Path Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * This class does not need to be instantiated. */	TokenNameCOMMENT_JAVADOC	 This class does not need to be instantiated. 
protected	TokenNameprotected	
DefaultPathHandler	TokenNameIdentifier	 Default Path Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Implements {@link PathHandler#startPath()}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#startPath()}. 
public	TokenNamepublic	
void	TokenNamevoid	
startPath	TokenNameIdentifier	 start Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
