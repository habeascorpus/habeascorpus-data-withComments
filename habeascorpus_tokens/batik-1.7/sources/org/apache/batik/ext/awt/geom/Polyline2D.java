/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Point	TokenNameIdentifier	 Point
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Rectangle	TokenNameIdentifier	 Rectangle
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Line2D	TokenNameIdentifier	 Line2 D
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * This class has the same behavior than {@link Polygon2D}, except that * the figure is not closed. * * @version $Id: Polyline2D.java 594018 2007-11-12 04:17:41Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class has the same behavior than {@link Polygon2D}, except that the figure is not closed. * @version $Id: Polyline2D.java 594018 2007-11-12 04:17:41Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
Polyline2D	TokenNameIdentifier	 Polyline2 D
implements	TokenNameimplements	
Shape	TokenNameIdentifier	 Shape
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
float	TokenNamefloat	
ASSUME_ZERO	TokenNameIdentifier	 ASSUME  ZERO
=	TokenNameEQUAL	
0.001f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * The total number of points. The value of <code>npoints</code> * represents the number of points in this <code>Polyline2D</code>. * */	TokenNameCOMMENT_JAVADOC	 The total number of points. The value of <code>npoints</code> represents the number of points in this <code>Polyline2D</code>. 
public	TokenNamepublic	
int	TokenNameint	
npoints	TokenNameIdentifier	 npoints
;	TokenNameSEMICOLON	
/** * The array of <i>x</i> coordinates. The value of {@link #npoints npoints} is equal to the * number of points in this <code>Polyline2D</code>. * */	TokenNameCOMMENT_JAVADOC	 The array of <i>x</i> coordinates. The value of {@link #npoints npoints} is equal to the number of points in this <code>Polyline2D</code>. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xpoints	TokenNameIdentifier	 xpoints
;	TokenNameSEMICOLON	
/** * The array of <i>x</i> coordinates. The value of {@link #npoints npoints} is equal to the * number of points in this <code>Polyline2D</code>. * */	TokenNameCOMMENT_JAVADOC	 The array of <i>x</i> coordinates. The value of {@link #npoints npoints} is equal to the number of points in this <code>Polyline2D</code>. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ypoints	TokenNameIdentifier	 ypoints
;	TokenNameSEMICOLON	
/** * Bounds of the Polyline2D. * @see #getBounds() */	TokenNameCOMMENT_JAVADOC	 Bounds of the Polyline2D. @see #getBounds() 
protected	TokenNameprotected	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GeneralPath	TokenNameIdentifier	 General Path
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
GeneralPath	TokenNameIdentifier	 General Path
closedPath	TokenNameIdentifier	 closed Path
;	TokenNameSEMICOLON	
/** * Creates an empty Polyline2D. */	TokenNameCOMMENT_JAVADOC	 Creates an empty Polyline2D. 
public	TokenNamepublic	
Polyline2D	TokenNameIdentifier	 Polyline2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
xpoints	TokenNameIdentifier	 xpoints
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ypoints	TokenNameIdentifier	 ypoints
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs and initializes a <code>Polyline2D</code> from the specified * parameters. * @param xpoints an array of <i>x</i> coordinates * @param ypoints an array of <i>y</i> coordinates * @param npoints the total number of points in the * <code>Polyline2D</code> * @exception NegativeArraySizeException if the value of * <code>npoints</code> is negative. * @exception IndexOutOfBoundsException if <code>npoints</code> is * greater than the length of <code>xpoints</code> * or the length of <code>ypoints</code>. * @exception NullPointerException if <code>xpoints</code> or * <code>ypoints</code> is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs and initializes a <code>Polyline2D</code> from the specified parameters. @param xpoints an array of <i>x</i> coordinates @param ypoints an array of <i>y</i> coordinates @param npoints the total number of points in the <code>Polyline2D</code> @exception NegativeArraySizeException if the value of <code>npoints</code> is negative. @exception IndexOutOfBoundsException if <code>npoints</code> is greater than the length of <code>xpoints</code> or the length of <code>ypoints</code>. @exception NullPointerException if <code>xpoints</code> or <code>ypoints</code> is <code>null</code>. 
public	TokenNamepublic	
Polyline2D	TokenNameIdentifier	 Polyline2 D
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xpoints	TokenNameIdentifier	 xpoints
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ypoints	TokenNameIdentifier	 ypoints
,	TokenNameCOMMA	
int	TokenNameint	
npoints	TokenNameIdentifier	 npoints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
npoints	TokenNameIdentifier	 npoints
>	TokenNameGREATER	
xpoints	TokenNameIdentifier	 xpoints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
npoints	TokenNameIdentifier	 npoints
>	TokenNameGREATER	
ypoints	TokenNameIdentifier	 ypoints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"npoints > xpoints.length || npoints > ypoints.length"	TokenNameStringLiteral	npoints > xpoints.length || npoints > ypoints.length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
npoints	TokenNameIdentifier	 npoints
=	TokenNameEQUAL	
npoints	TokenNameIdentifier	 npoints
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
xpoints	TokenNameIdentifier	 xpoints
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// make space for one more to close the polyline 	TokenNameCOMMENT_LINE	make space for one more to close the polyline 
this	TokenNamethis	
.	TokenNameDOT	
ypoints	TokenNameIdentifier	 ypoints
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// make space for one more to close the polyline 	TokenNameCOMMENT_LINE	make space for one more to close the polyline 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
xpoints	TokenNameIdentifier	 xpoints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
npoints	TokenNameIdentifier	 npoints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ypoints	TokenNameIdentifier	 ypoints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ypoints	TokenNameIdentifier	 ypoints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
npoints	TokenNameIdentifier	 npoints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calculatePath	TokenNameIdentifier	 calculate Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs and initializes a <code>Polyline2D</code> from the specified * parameters. * @param xpoints an array of <i>x</i> coordinates * @param ypoints an array of <i>y</i> coordinates * @param npoints the total number of points in the <code>Polyline2D</code> * @exception NegativeArraySizeException if the value of * <code>npoints</code> is negative. * @exception IndexOutOfBoundsException if <code>npoints</code> is * greater than the length of <code>xpoints</code> * or the length of <code>ypoints</code>. * @exception NullPointerException if <code>xpoints</code> or * <code>ypoints</code> is <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Constructs and initializes a <code>Polyline2D</code> from the specified parameters. @param xpoints an array of <i>x</i> coordinates @param ypoints an array of <i>y</i> coordinates @param npoints the total number of points in the <code>Polyline2D</code> @exception NegativeArraySizeException if the value of <code>npoints</code> is negative. @exception IndexOutOfBoundsException if <code>npoints</code> is greater than the length of <code>xpoints</code> or the length of <code>ypoints</code>. @exception NullPointerException if <code>xpoints</code> or <code>ypoints</code> is <code>null</code>. 
public	TokenNamepublic	
Polyline2D	TokenNameIdentifier	 Polyline2 D
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
xpoints	TokenNameIdentifier	 xpoints
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ypoints	TokenNameIdentifier	 ypoints
,	TokenNameCOMMA	
int	TokenNameint	
npoints	TokenNameIdentifier	 npoints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
npoints	TokenNameIdentifier	 npoints
>	TokenNameGREATER	
xpoints	TokenNameIdentifier	 xpoints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
||	TokenNameOR_OR	
npoints	TokenNameIdentifier	 npoints
>	TokenNameGREATER	
ypoints	TokenNameIdentifier	 ypoints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IndexOutOfBoundsException	TokenNameIdentifier	 Index Out Of Bounds Exception
(	TokenNameLPAREN	
"npoints > xpoints.length || npoints > ypoints.length"	TokenNameStringLiteral	npoints > xpoints.length || npoints > ypoints.length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
npoints	TokenNameIdentifier	 npoints
=	TokenNameEQUAL	
npoints	TokenNameIdentifier	 npoints
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
xpoints	TokenNameIdentifier	 xpoints
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ypoints	TokenNameIdentifier	 ypoints
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
npoints	TokenNameIdentifier	 npoints
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
calculatePath	TokenNameIdentifier	 calculate Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Polyline2D	TokenNameIdentifier	 Polyline2 D
(	TokenNameLPAREN	
Line2D	TokenNameIdentifier	 Line2 D
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
npoints	TokenNameIdentifier	 npoints
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
xpoints	TokenNameIdentifier	 xpoints
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ypoints	TokenNameIdentifier	 ypoints
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getX1	TokenNameIdentifier	 get X1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getX2	TokenNameIdentifier	 get X2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getY1	TokenNameIdentifier	 get Y1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
getY2	TokenNameIdentifier	 get Y2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
calculatePath	TokenNameIdentifier	 calculate Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Resets this <code>Polyline2D</code> object to an empty polygon. * The coordinate arrays and the data in them are left untouched * but the number of points is reset to zero to mark the old * vertex data as invalid and to start accumulating new vertex * data at the beginning. * All internally-cached data relating to the old vertices * are discarded. * Note that since the coordinate arrays from before the reset * are reused, creating a new empty <code>Polyline2D</code> might * be more memory efficient than resetting the current one if * the number of vertices in the new polyline data is significantly * smaller than the number of vertices in the data from before the * reset. */	TokenNameCOMMENT_JAVADOC	 Resets this <code>Polyline2D</code> object to an empty polygon. The coordinate arrays and the data in them are left untouched but the number of points is reset to zero to mark the old vertex data as invalid and to start accumulating new vertex data at the beginning. All internally-cached data relating to the old vertices are discarded. Note that since the coordinate arrays from before the reset are reused, creating a new empty <code>Polyline2D</code> might be more memory efficient than resetting the current one if the number of vertices in the new polyline data is significantly smaller than the number of vertices in the data from before the reset. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
npoints	TokenNameIdentifier	 npoints
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closedPath	TokenNameIdentifier	 closed Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Polyline2D	TokenNameIdentifier	 Polyline2 D
pol	TokenNameIdentifier	 pol
=	TokenNameEQUAL	
new	TokenNamenew	
Polyline2D	TokenNameIdentifier	 Polyline2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
npoints	TokenNameIdentifier	 npoints
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pol	TokenNameIdentifier	 pol
.	TokenNameDOT	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pol	TokenNameIdentifier	 pol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
calculatePath	TokenNameIdentifier	 calculate Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
npoints	TokenNameIdentifier	 npoints
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closedPath	TokenNameIdentifier	 closed Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
updatePath	TokenNameIdentifier	 update Path
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closedPath	TokenNameIdentifier	 closed Path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
GeneralPath	TokenNameIdentifier	 General Path
(	TokenNameLPAREN	
GeneralPath	TokenNameIdentifier	 General Path
.	TokenNameDOT	
WIND_EVEN_ODD	TokenNameIdentifier	 WIND  EVEN  ODD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
moveTo	TokenNameIdentifier	 move To
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lineTo	TokenNameIdentifier	 line To
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_xmax	TokenNameIdentifier	 xmax
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
getMaxX	TokenNameIdentifier	 get Max X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_ymax	TokenNameIdentifier	 ymax
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
getMaxY	TokenNameIdentifier	 get Max Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_xmin	TokenNameIdentifier	 xmin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
_ymin	TokenNameIdentifier	 ymin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
_xmin	TokenNameIdentifier	 xmin
)	TokenNameRPAREN	
_xmin	TokenNameIdentifier	 xmin
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
_xmax	TokenNameIdentifier	 xmax
)	TokenNameRPAREN	
_xmax	TokenNameIdentifier	 xmax
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
_ymin	TokenNameIdentifier	 ymin
)	TokenNameRPAREN	
_ymin	TokenNameIdentifier	 ymin
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
>	TokenNameGREATER	
_ymax	TokenNameIdentifier	 ymax
)	TokenNameRPAREN	
_ymax	TokenNameIdentifier	 ymax
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
_xmin	TokenNameIdentifier	 xmin
,	TokenNameCOMMA	
_ymin	TokenNameIdentifier	 ymin
,	TokenNameCOMMA	
_xmax	TokenNameIdentifier	 xmax
-	TokenNameMINUS	
_xmin	TokenNameIdentifier	 xmin
,	TokenNameCOMMA	
_ymax	TokenNameIdentifier	 ymax
-	TokenNameMINUS	
_ymin	TokenNameIdentifier	 ymin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Appends the specified coordinates to this <code>Polyline2D</code>. * <p> * If an operation that calculates the bounding box of this * <code>Polyline2D</code> has already been performed, such as * <code>getBounds</code> or <code>contains</code>, then this * method updates the bounding box. * @param x the specified x coordinate * @param y the specified y coordinate * @see java.awt.Polygon#getBounds * @see java.awt.Polygon#contains(double,double) */	TokenNameCOMMENT_JAVADOC	 Appends the specified coordinates to this <code>Polyline2D</code>. <p> If an operation that calculates the bounding box of this <code>Polyline2D</code> has already been performed, such as <code>getBounds</code> or <code>contains</code>, then this method updates the bounding box. @param x the specified x coordinate @param y the specified y coordinate @see java.awt.Polygon#getBounds @see java.awt.Polygon#contains(double,double) 
public	TokenNamepublic	
void	TokenNamevoid	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
npoints	TokenNameIdentifier	 npoints
==	TokenNameEQUAL_EQUAL	
xpoints	TokenNameIdentifier	 xpoints
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
npoints	TokenNameIdentifier	 npoints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpoints	TokenNameIdentifier	 xpoints
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ypoints	TokenNameIdentifier	 ypoints
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
npoints	TokenNameIdentifier	 npoints
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ypoints	TokenNameIdentifier	 ypoints
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
npoints	TokenNameIdentifier	 npoints
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
updatePath	TokenNameIdentifier	 update Path
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the bounding box of this <code>Polyline2D</code>. * The bounding box is the smallest {@link Rectangle} whose * sides are parallel to the x and y axes of the * coordinate space, and can completely contain the <code>Polyline2D</code>. * @return a <code>Rectangle</code> that defines the bounds of this * <code>Polyline2D</code>. */	TokenNameCOMMENT_JAVADOC	 Gets the bounding box of this <code>Polyline2D</code>. The bounding box is the smallest {@link Rectangle} whose sides are parallel to the x and y axes of the coordinate space, and can completely contain the <code>Polyline2D</code>. @return a <code>Rectangle</code> that defines the bounds of this <code>Polyline2D</code>. 
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
updateComputingPath	TokenNameIdentifier	 update Computing Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
npoints	TokenNameIdentifier	 npoints
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
closedPath	TokenNameIdentifier	 closed Path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
closedPath	TokenNameIdentifier	 closed Path
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GeneralPath	TokenNameIdentifier	 General Path
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
closedPath	TokenNameIdentifier	 closed Path
.	TokenNameDOT	
closePath	TokenNameIdentifier	 close Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Determines whether the specified {@link Point} is inside this * <code>Polyline2D</code>. * This method is required to implement the Shape interface, * but in the case of Line2D objects it always returns false since a line contains no area. */	TokenNameCOMMENT_JAVADOC	 Determines whether the specified {@link Point} is inside this <code>Polyline2D</code>. This method is required to implement the Shape interface, but in the case of Line2D objects it always returns false since a line contains no area. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point	TokenNameIdentifier	 Point
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines if the specified coordinates are inside this * <code>Polyline2D</code>. * This method is required to implement the Shape interface, * but in the case of Line2D objects it always returns false since a line contains no area. */	TokenNameCOMMENT_JAVADOC	 Determines if the specified coordinates are inside this <code>Polyline2D</code>. This method is required to implement the Shape interface, but in the case of Line2D objects it always returns false since a line contains no area. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Determines whether the specified coordinates are inside this * <code>Polyline2D</code>. * This method is required to implement the Shape interface, * but in the case of Line2D objects it always returns false since a line contains no area. */	TokenNameCOMMENT_JAVADOC	 Determines whether the specified coordinates are inside this <code>Polyline2D</code>. This method is required to implement the Shape interface, but in the case of Line2D objects it always returns false since a line contains no area. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
int	TokenNameint	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the high precision bounding box of the {@link Shape}. * @return a {@link Rectangle2D} that precisely * bounds the <code>Shape</code>. */	TokenNameCOMMENT_JAVADOC	 Returns the high precision bounding box of the {@link Shape}. @return a {@link Rectangle2D} that precisely bounds the <code>Shape</code>. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if a specified {@link Point2D} is inside the boundary of this * <code>Polyline2D</code>. * This method is required to implement the Shape interface, * but in the case of Line2D objects it always returns false since a line contains no area. */	TokenNameCOMMENT_JAVADOC	 Tests if a specified {@link Point2D} is inside the boundary of this <code>Polyline2D</code>. This method is required to implement the Shape interface, but in the case of Line2D objects it always returns false since a line contains no area. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if the interior of this <code>Polygon</code> intersects the * interior of a specified set of rectangular coordinates. * @param x the x coordinate of the specified rectangular * shape's top-left corner * @param y the y coordinate of the specified rectangular * shape's top-left corner * @param w the width of the specified rectangular shape * @param h the height of the specified rectangular shape * @return <code>true</code> if the interior of this * <code>Polygon</code> and the interior of the * specified set of rectangular * coordinates intersect each other; * <code>false</code> otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests if the interior of this <code>Polygon</code> intersects the interior of a specified set of rectangular coordinates. @param x the x coordinate of the specified rectangular shape's top-left corner @param y the y coordinate of the specified rectangular shape's top-left corner @param w the width of the specified rectangular shape @param h the height of the specified rectangular shape @return <code>true</code> if the interior of this <code>Polygon</code> and the interior of the specified set of rectangular coordinates intersect each other; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
npoints	TokenNameIdentifier	 npoints
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
updateComputingPath	TokenNameIdentifier	 update Computing Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
closedPath	TokenNameIdentifier	 closed Path
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if the interior of this <code>Polygon</code> intersects the * interior of a specified <code>Rectangle2D</code>. * @param r a specified <code>Rectangle2D</code> * @return <code>true</code> if this <code>Polygon</code> and the * interior of the specified <code>Rectangle2D</code> * intersect each other; <code>false</code> * otherwise. */	TokenNameCOMMENT_JAVADOC	 Tests if the interior of this <code>Polygon</code> intersects the interior of a specified <code>Rectangle2D</code>. @param r a specified <code>Rectangle2D</code> @return <code>true</code> if this <code>Polygon</code> and the interior of the specified <code>Rectangle2D</code> intersect each other; <code>false</code> otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if the interior of this <code>Polyline2D</code> entirely * contains the specified set of rectangular coordinates. * This method is required to implement the Shape interface, * but in the case of Line2D objects it always returns false since a line contains no area. */	TokenNameCOMMENT_JAVADOC	 Tests if the interior of this <code>Polyline2D</code> entirely contains the specified set of rectangular coordinates. This method is required to implement the Shape interface, but in the case of Line2D objects it always returns false since a line contains no area. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if the interior of this <code>Polyline2D</code> entirely * contains the specified <code>Rectangle2D</code>. * This method is required to implement the Shape interface, * but in the case of Line2D objects it always returns false since a line contains no area. */	TokenNameCOMMENT_JAVADOC	 Tests if the interior of this <code>Polyline2D</code> entirely contains the specified <code>Rectangle2D</code>. This method is required to implement the Shape interface, but in the case of Line2D objects it always returns false since a line contains no area. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an iterator object that iterates along the boundary of this * <code>Polygon</code> and provides access to the geometry * of the outline of this <code>Polygon</code>. An optional * {@link AffineTransform} can be specified so that the coordinates * returned in the iteration are transformed accordingly. * @param at an optional <code>AffineTransform</code> to be applied to the * coordinates as they are returned in the iteration, or * <code>null</code> if untransformed coordinates are desired * @return a {@link PathIterator} object that provides access to the * geometry of this <code>Polygon</code>. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator object that iterates along the boundary of this <code>Polygon</code> and provides access to the geometry of the outline of this <code>Polygon</code>. An optional {@link AffineTransform} can be specified so that the coordinates returned in the iteration are transformed accordingly. @param at an optional <code>AffineTransform</code> to be applied to the coordinates as they are returned in the iteration, or <code>null</code> if untransformed coordinates are desired @return a {@link PathIterator} object that provides access to the geometry of this <code>Polygon</code>. 
public	TokenNamepublic	
PathIterator	TokenNameIdentifier	 Path Iterator
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* get the associated {@link Polygon2D}. * This method take care that may be the last point can * be equal to the first. In that case it must not be included in the Polygon, * as polygons declare their first point only once. */	TokenNameCOMMENT_BLOCK	 get the associated {@link Polygon2D}. This method take care that may be the last point can be equal to the first. In that case it must not be included in the Polygon, as polygons declare their first point only once. 
public	TokenNamepublic	
Polygon2D	TokenNameIdentifier	 Polygon2 D
getPolygon2D	TokenNameIdentifier	 get Polygon2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Polygon2D	TokenNameIdentifier	 Polygon2 D
pol	TokenNameIdentifier	 pol
=	TokenNameEQUAL	
new	TokenNamenew	
Polygon2D	TokenNameIdentifier	 Polygon2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
npoints	TokenNameIdentifier	 npoints
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pol	TokenNameIdentifier	 pol
.	TokenNameDOT	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p0	TokenNameIdentifier	 p0
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p0	TokenNameIdentifier	 p0
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
>	TokenNameGREATER	
ASSUME_ZERO	TokenNameIdentifier	 ASSUME  ZERO
)	TokenNameRPAREN	
pol	TokenNameIdentifier	 pol
.	TokenNameDOT	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
xpoints	TokenNameIdentifier	 xpoints
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ypoints	TokenNameIdentifier	 ypoints
[	TokenNameLBRACKET	
npoints	TokenNameIdentifier	 npoints
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pol	TokenNameIdentifier	 pol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an iterator object that iterates along the boundary of * the <code>Shape</code> and provides access to the geometry of the * outline of the <code>Shape</code>. Only SEG_MOVETO and SEG_LINETO, point types * are returned by the iterator. * Since polylines are already flat, the <code>flatness</code> parameter * is ignored. * @param at an optional <code>AffineTransform</code> to be applied to the * coordinates as they are returned in the iteration, or * <code>null</code> if untransformed coordinates are desired * @param flatness the maximum amount that the control points * for a given curve can vary from colinear before a subdivided * curve is replaced by a straight line connecting the * endpoints. Since polygons are already flat the * <code>flatness</code> parameter is ignored. * @return a <code>PathIterator</code> object that provides access to the * <code>Shape</code> object's geometry. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator object that iterates along the boundary of the <code>Shape</code> and provides access to the geometry of the outline of the <code>Shape</code>. Only SEG_MOVETO and SEG_LINETO, point types are returned by the iterator. Since polylines are already flat, the <code>flatness</code> parameter is ignored. @param at an optional <code>AffineTransform</code> to be applied to the coordinates as they are returned in the iteration, or <code>null</code> if untransformed coordinates are desired @param flatness the maximum amount that the control points for a given curve can vary from colinear before a subdivided curve is replaced by a straight line connecting the endpoints. Since polygons are already flat the <code>flatness</code> parameter is ignored. @return a <code>PathIterator</code> object that provides access to the <code>Shape</code> object's geometry. 
public	TokenNamepublic	
PathIterator	TokenNameIdentifier	 Path Iterator
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
double	TokenNamedouble	
flatness	TokenNameIdentifier	 flatness
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
