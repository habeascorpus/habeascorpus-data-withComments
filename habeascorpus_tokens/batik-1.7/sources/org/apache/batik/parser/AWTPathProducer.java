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
Point2D	TokenNameIdentifier	 Point2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
/** * This class provides an implementation of the PathHandler that initializes * a Shape from the value of a path's 'd' attribute. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: AWTPathProducer.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class provides an implementation of the PathHandler that initializes a Shape from the value of a path's 'd' attribute. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: AWTPathProducer.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AWTPathProducer	TokenNameIdentifier	 AWT Path Producer
implements	TokenNameimplements	
PathHandler	TokenNameIdentifier	 Path Handler
,	TokenNameCOMMA	
ShapeProducer	TokenNameIdentifier	 Shape Producer
{	TokenNameLBRACE	
/** * The temporary value of extendedGeneralPath. */	TokenNameCOMMENT_JAVADOC	 The temporary value of extendedGeneralPath. 
protected	TokenNameprotected	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
/** * The current x position. */	TokenNameCOMMENT_JAVADOC	 The current x position. 
protected	TokenNameprotected	
float	TokenNamefloat	
currentX	TokenNameIdentifier	 current X
;	TokenNameSEMICOLON	
/** * The current y position. */	TokenNameCOMMENT_JAVADOC	 The current y position. 
protected	TokenNameprotected	
float	TokenNamefloat	
currentY	TokenNameIdentifier	 current Y
;	TokenNameSEMICOLON	
/** * The reference x point for smooth arcs. */	TokenNameCOMMENT_JAVADOC	 The reference x point for smooth arcs. 
protected	TokenNameprotected	
float	TokenNamefloat	
xCenter	TokenNameIdentifier	 x Center
;	TokenNameSEMICOLON	
/** * The reference y point for smooth arcs. */	TokenNameCOMMENT_JAVADOC	 The reference y point for smooth arcs. 
protected	TokenNameprotected	
float	TokenNamefloat	
yCenter	TokenNameIdentifier	 y Center
;	TokenNameSEMICOLON	
/** * The winding rule to use to construct the path. */	TokenNameCOMMENT_JAVADOC	 The winding rule to use to construct the path. 
protected	TokenNameprotected	
int	TokenNameint	
windingRule	TokenNameIdentifier	 winding Rule
;	TokenNameSEMICOLON	
/** * Utility method for creating an ExtendedGeneralPath. * @param r The reader used to read the path specification. * @param wr The winding rule to use for creating the path. */	TokenNameCOMMENT_JAVADOC	 Utility method for creating an ExtendedGeneralPath. @param r The reader used to read the path specification. @param wr The winding rule to use for creating the path. 
public	TokenNamepublic	
static	TokenNamestatic	
Shape	TokenNameIdentifier	 Shape
createShape	TokenNameIdentifier	 create Shape
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
PathParser	TokenNameIdentifier	 Path Parser
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
PathParser	TokenNameIdentifier	 Path Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AWTPathProducer	TokenNameIdentifier	 AWT Path Producer
ph	TokenNameIdentifier	 ph
=	TokenNameEQUAL	
new	TokenNamenew	
AWTPathProducer	TokenNameIdentifier	 AWT Path Producer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
setWindingRule	TokenNameIdentifier	 set Winding Rule
(	TokenNameLPAREN	
wr	TokenNameIdentifier	 wr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setPathHandler	TokenNameIdentifier	 set Path Handler
(	TokenNameLPAREN	
ph	TokenNameIdentifier	 ph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ph	TokenNameIdentifier	 ph
.	TokenNameDOT	
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the winding rule used to construct the path. */	TokenNameCOMMENT_JAVADOC	 Sets the winding rule used to construct the path. 
public	TokenNamepublic	
void	TokenNamevoid	
setWindingRule	TokenNameIdentifier	 set Winding Rule
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
windingRule	TokenNameIdentifier	 winding Rule
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current winding rule. */	TokenNameCOMMENT_JAVADOC	 Returns the current winding rule. 
public	TokenNamepublic	
int	TokenNameint	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
windingRule	TokenNameIdentifier	 winding Rule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Shape object initialized during the last parsing. * @return the shape or null if this handler has not been used by * a parser. */	TokenNameCOMMENT_JAVADOC	 Returns the Shape object initialized during the last parsing. @return the shape or null if this handler has not been used by a parser. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getShape	TokenNameIdentifier	 get Shape
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
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
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
ExtendedGeneralPath	TokenNameIdentifier	 Extended General Path
(	TokenNameLPAREN	
windingRule	TokenNameIdentifier	 winding Rule
)	TokenNameRPAREN	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getCurrentPoint	TokenNameIdentifier	 get Current Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
curveTo	TokenNameIdentifier	 curve To
(	TokenNameLPAREN	
currentX	TokenNameIdentifier	 current X
+	TokenNamePLUS	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
+	TokenNamePLUS	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
+	TokenNamePLUS	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
+	TokenNamePLUS	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
curveTo	TokenNameIdentifier	 curve To
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements * {@link PathHandler#curvetoCubicSmoothRel(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoCubicSmoothRel(float,float,float,float)}. 
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
curveTo	TokenNameIdentifier	 curve To
(	TokenNameLPAREN	
currentX	TokenNameIdentifier	 current X
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
xCenter	TokenNameIdentifier	 x Center
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
yCenter	TokenNameIdentifier	 y Center
,	TokenNameCOMMA	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
+	TokenNamePLUS	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
+	TokenNamePLUS	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements * {@link PathHandler#curvetoCubicSmoothAbs(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoCubicSmoothAbs(float,float,float,float)}. 
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
curveTo	TokenNameIdentifier	 curve To
(	TokenNameLPAREN	
currentX	TokenNameIdentifier	 current X
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
xCenter	TokenNameIdentifier	 x Center
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
yCenter	TokenNameIdentifier	 y Center
,	TokenNameCOMMA	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements * {@link PathHandler#curvetoQuadraticRel(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoQuadraticRel(float,float,float,float)}. 
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
quadTo	TokenNameIdentifier	 quad To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
+	TokenNamePLUS	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
+	TokenNamePLUS	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implements * {@link PathHandler#curvetoQuadraticAbs(float,float,float,float)}. */	TokenNameCOMMENT_JAVADOC	 Implements {@link PathHandler#curvetoQuadraticAbs(float,float,float,float)}. 
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
quadTo	TokenNameIdentifier	 quad To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
quadTo	TokenNameIdentifier	 quad To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
xCenter	TokenNameIdentifier	 x Center
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
yCenter	TokenNameIdentifier	 y Center
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
quadTo	TokenNameIdentifier	 quad To
(	TokenNameLPAREN	
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
xCenter	TokenNameIdentifier	 x Center
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
yCenter	TokenNameIdentifier	 y Center
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arcTo	TokenNameIdentifier	 arc To
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
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
+=	TokenNamePLUS_EQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
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
path	TokenNameIdentifier	 path
.	TokenNameDOT	
arcTo	TokenNameIdentifier	 arc To
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
xCenter	TokenNameIdentifier	 x Center
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
yCenter	TokenNameIdentifier	 y Center
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
