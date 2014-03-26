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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Color	TokenNameIdentifier	 Color
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
PaintContext	TokenNameIdentifier	 Paint Context
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
RenderingHints	TokenNameIdentifier	 Rendering Hints
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
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
ColorModel	TokenNameIdentifier	 Color Model
;	TokenNameSEMICOLON	
/** * The <code>LinearGradientPaint</code> class provides a way to fill * a {@link java.awt.Shape} with a linear color gradient pattern. The user may * specify 2 or more gradient colors, and this paint will provide an * interpolation between each color. The user also specifies start and end * points which define where in user space the color gradient should begin * and end. * <p> * The user must provide an array of floats specifying how to distribute the * colors along the gradient. These values should range from 0.0 to 1.0 and * act like keyframes along the gradient (they mark where the gradient should * be exactly a particular color). * <p> * For example: * <br> * <code> * <p> * Point2D start = new Point2D.Float(0, 0);<br> * Point2D end = new Point2D.Float(100,100);<br> * float[] dist = {0.0, 0.2, 1.0};<br> * Color[] colors = {Color.red, Color.white, Color.blue};<br> * LinearGradientPaint p = new LinearGradientPaint(start, end, dist, colors); * </code> *<p> * This code will create a LinearGradientPaint which interpolates between * red and white for the first 20% of the gradient and between white and blue * for the remaining 80%. * * <p> In the event that the user does not set the first keyframe value equal * to 0 and the last keyframe value equal to 1, keyframes will be created at * these positions and the first and last colors will be replicated there. * So, if a user specifies the following arrays to construct a gradient:<br> * {Color.blue, Color.red}, {.3, .7}<br> * this will be converted to a gradient with the following keyframes: * {Color.blue, Color.blue, Color.red, Color.red}, {0, .3, .7, 1} * * <p> * The user may also select what action the LinearGradientPaint should take * when filling color outside the start and end points. If no cycle method is * specified, NO_CYCLE will be chosen by default, so the endpoint colors * will be used to fill the remaining area. * * <p> The following image demonstrates the options NO_CYCLE and REFLECT. * * <p> * <img src = "cyclic.jpg"> * * <p> The colorSpace parameter allows the user to specify in which colorspace * the interpolation should be performed, default sRGB or linearized RGB. * * * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: LinearGradientPaint.java 475685 2006-11-16 11:16:05Z cam $ * @see java.awt.Paint * @see java.awt.Graphics2D#setPaint * */	TokenNameCOMMENT_JAVADOC	 The <code>LinearGradientPaint</code> class provides a way to fill a {@link java.awt.Shape} with a linear color gradient pattern. The user may specify 2 or more gradient colors, and this paint will provide an interpolation between each color. The user also specifies start and end points which define where in user space the color gradient should begin and end. <p> The user must provide an array of floats specifying how to distribute the colors along the gradient. These values should range from 0.0 to 1.0 and act like keyframes along the gradient (they mark where the gradient should be exactly a particular color). <p> For example: <br> <code> <p> Point2D start = new Point2D.Float(0, 0);<br> Point2D end = new Point2D.Float(100,100);<br> float[] dist = {0.0, 0.2, 1.0};<br> Color[] colors = {Color.red, Color.white, Color.blue};<br> LinearGradientPaint p = new LinearGradientPaint(start, end, dist, colors); </code> *<p> This code will create a LinearGradientPaint which interpolates between red and white for the first 20% of the gradient and between white and blue for the remaining 80%. * <p> In the event that the user does not set the first keyframe value equal to 0 and the last keyframe value equal to 1, keyframes will be created at these positions and the first and last colors will be replicated there. So, if a user specifies the following arrays to construct a gradient:<br> {Color.blue, Color.red}, {.3, .7}<br> this will be converted to a gradient with the following keyframes: {Color.blue, Color.blue, Color.red, Color.red}, {0, .3, .7, 1} * <p> The user may also select what action the LinearGradientPaint should take when filling color outside the start and end points. If no cycle method is specified, NO_CYCLE will be chosen by default, so the endpoint colors will be used to fill the remaining area. * <p> The following image demonstrates the options NO_CYCLE and REFLECT. * <p> <img src = "cyclic.jpg"> * <p> The colorSpace parameter allows the user to specify in which colorspace the interpolation should be performed, default sRGB or linearized RGB. * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: LinearGradientPaint.java 475685 2006-11-16 11:16:05Z cam $ @see java.awt.Paint @see java.awt.Graphics2D#setPaint 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LinearGradientPaint	TokenNameIdentifier	 Linear Gradient Paint
extends	TokenNameextends	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
{	TokenNameLBRACE	
/** Gradient start and end points. */	TokenNameCOMMENT_JAVADOC	 Gradient start and end points. 
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
/**<p> * Constructs an <code>LinearGradientPaint</code> with the default * NO_CYCLE repeating method and SRGB colorspace. * * @param startX the x coordinate of the gradient axis start point * in user space * * @param startY the y coordinate of the gradient axis start point * in user space * * @param endX the x coordinate of the gradient axis end point * in user space * * @param endY the y coordinate of the gradient axis end point * in user space * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors corresponding to each fractional value * * * @throws IllegalArgumentException if start and end points are the * same points, or if fractions.length != colors.length, or if colors * is less than 2 in size. * */	TokenNameCOMMENT_JAVADOC	<p> Constructs an <code>LinearGradientPaint</code> with the default NO_CYCLE repeating method and SRGB colorspace. * @param startX the x coordinate of the gradient axis start point in user space * @param startY the y coordinate of the gradient axis start point in user space * @param endX the x coordinate of the gradient axis end point in user space * @param endY the y coordinate of the gradient axis end point in user space * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors corresponding to each fractional value * @throws IllegalArgumentException if start and end points are the same points, or if fractions.length != colors.length, or if colors is less than 2 in size. 
public	TokenNamepublic	
LinearGradientPaint	TokenNameIdentifier	 Linear Gradient Paint
(	TokenNameLPAREN	
float	TokenNamefloat	
startX	TokenNameIdentifier	 start X
,	TokenNameCOMMA	
float	TokenNamefloat	
startY	TokenNameIdentifier	 start Y
,	TokenNameCOMMA	
float	TokenNamefloat	
endX	TokenNameIdentifier	 end X
,	TokenNameCOMMA	
float	TokenNamefloat	
endY	TokenNameIdentifier	 end Y
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
startX	TokenNameIdentifier	 start X
,	TokenNameCOMMA	
startY	TokenNameIdentifier	 start Y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
endX	TokenNameIdentifier	 end X
,	TokenNameCOMMA	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
,	TokenNameCOMMA	
SRGB	TokenNameIdentifier	 SRGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/**<p> * Constructs an <code>LinearGradientPaint</code> with default SRGB * colorspace. * * @param startX the x coordinate of the gradient axis start point * in user space * * @param startY the y coordinate of the gradient axis start point * in user space * * @param endX the x coordinate of the gradient axis end point * in user space * * @param endY the y coordinate of the gradient axis end point * in user space * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors corresponding to each fractional value * * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * * @throws IllegalArgumentException if start and end points are the * same points, or if fractions.length != colors.length, or if colors * is less than 2 in size. * */	TokenNameCOMMENT_JAVADOC	<p> Constructs an <code>LinearGradientPaint</code> with default SRGB colorspace. * @param startX the x coordinate of the gradient axis start point in user space * @param startY the y coordinate of the gradient axis start point in user space * @param endX the x coordinate of the gradient axis end point in user space * @param endY the y coordinate of the gradient axis end point in user space * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors corresponding to each fractional value * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * @throws IllegalArgumentException if start and end points are the same points, or if fractions.length != colors.length, or if colors is less than 2 in size. 
public	TokenNamepublic	
LinearGradientPaint	TokenNameIdentifier	 Linear Gradient Paint
(	TokenNameLPAREN	
float	TokenNamefloat	
startX	TokenNameIdentifier	 start X
,	TokenNameCOMMA	
float	TokenNamefloat	
startY	TokenNameIdentifier	 start Y
,	TokenNameCOMMA	
float	TokenNamefloat	
endX	TokenNameIdentifier	 end X
,	TokenNameCOMMA	
float	TokenNamefloat	
endY	TokenNameIdentifier	 end Y
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
cycleMethod	TokenNameIdentifier	 cycle Method
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
startX	TokenNameIdentifier	 start X
,	TokenNameCOMMA	
startY	TokenNameIdentifier	 start Y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
endX	TokenNameIdentifier	 end X
,	TokenNameCOMMA	
endY	TokenNameIdentifier	 end Y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
SRGB	TokenNameIdentifier	 SRGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/**<p> * Constructs a <code>LinearGradientPaint</code> with the default * NO_CYCLE repeating method and SRGB colorspace. * * @param start the gradient axis start <code>Point</code> in user space * * @param end the gradient axis end <code>Point</code> in user space * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors corresponding to each fractional value * * @throws NullPointerException if one of the points is null * * @throws IllegalArgumentException if start and end points are the * same points, or if fractions.length != colors.length, or if colors * is less than 2 in size. * */	TokenNameCOMMENT_JAVADOC	<p> Constructs a <code>LinearGradientPaint</code> with the default NO_CYCLE repeating method and SRGB colorspace. * @param start the gradient axis start <code>Point</code> in user space * @param end the gradient axis end <code>Point</code> in user space * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors corresponding to each fractional value * @throws NullPointerException if one of the points is null * @throws IllegalArgumentException if start and end points are the same points, or if fractions.length != colors.length, or if colors is less than 2 in size. 
public	TokenNamepublic	
LinearGradientPaint	TokenNameIdentifier	 Linear Gradient Paint
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
NO_CYCLE	TokenNameIdentifier	 NO  CYCLE
,	TokenNameCOMMA	
SRGB	TokenNameIdentifier	 SRGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/**<p> * Constructs a <code>LinearGradientPaint</code>. * * @param start the gradient axis start <code>Point</code> in user space * * @param end the gradient axis end <code>Point</code> in user space * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors corresponding to each fractional value * * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * * @param colorSpace which colorspace to use for interpolation, * either SRGB or LINEAR_RGB * * @throws NullPointerException if one of the points is null * * @throws IllegalArgumentException if start and end points are the * same points, or if fractions.length != colors.length, or if colors * is less than 2 in size. * */	TokenNameCOMMENT_JAVADOC	<p> Constructs a <code>LinearGradientPaint</code>. * @param start the gradient axis start <code>Point</code> in user space * @param end the gradient axis end <code>Point</code> in user space * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors corresponding to each fractional value * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * @param colorSpace which colorspace to use for interpolation, either SRGB or LINEAR_RGB * @throws NullPointerException if one of the points is null * @throws IllegalArgumentException if start and end points are the same points, or if fractions.length != colors.length, or if colors is less than 2 in size. 
public	TokenNamepublic	
LinearGradientPaint	TokenNameIdentifier	 Linear Gradient Paint
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
colorSpace	TokenNameIdentifier	 color Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
colorSpace	TokenNameIdentifier	 color Space
,	TokenNameCOMMA	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/**<p> * Constructs a <code>LinearGradientPaint</code>. * * @param start the gradient axis start <code>Point</code> in user space * * @param end the gradient axis end <code>Point</code> in user space * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors corresponding to each fractional value * * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * * @param colorSpace which colorspace to use for interpolation, * either SRGB or LINEAR_RGB * * @param gradientTransform transform to apply to the gradient * * @throws NullPointerException if one of the points is null, * or gradientTransform is null * * @throws IllegalArgumentException if start and end points are the * same points, or if fractions.length != colors.length, or if colors * is less than 2 in size. * */	TokenNameCOMMENT_JAVADOC	<p> Constructs a <code>LinearGradientPaint</code>. * @param start the gradient axis start <code>Point</code> in user space * @param end the gradient axis end <code>Point</code> in user space * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors corresponding to each fractional value * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * @param colorSpace which colorspace to use for interpolation, either SRGB or LINEAR_RGB * @param gradientTransform transform to apply to the gradient * @throws NullPointerException if one of the points is null, or gradientTransform is null * @throws IllegalArgumentException if start and end points are the same points, or if fractions.length != colors.length, or if colors is less than 2 in size. 
public	TokenNamepublic	
LinearGradientPaint	TokenNameIdentifier	 Linear Gradient Paint
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
Color	TokenNameIdentifier	 Color
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
CycleMethodEnum	TokenNameIdentifier	 Cycle Method Enum
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
ColorSpaceEnum	TokenNameIdentifier	 Color Space Enum
colorSpace	TokenNameIdentifier	 color Space
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
gradientTransform	TokenNameIdentifier	 gradient Transform
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
,	TokenNameCOMMA	
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
colorSpace	TokenNameIdentifier	 color Space
,	TokenNameCOMMA	
gradientTransform	TokenNameIdentifier	 gradient Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Check input parameters 	TokenNameCOMMENT_LINE	Check input parameters 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
end	TokenNameIdentifier	 end
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"Start and end points must be"	TokenNameStringLiteral	Start and end points must be
+	TokenNamePLUS	
"non-null"	TokenNameStringLiteral	non-null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Start point cannot equal"	TokenNameStringLiteral	Start point cannot equal
+	TokenNamePLUS	
"endpoint"	TokenNameStringLiteral	endpoint
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//copy the points... 	TokenNameCOMMENT_LINE	copy the points... 
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
)	TokenNameRPAREN	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates and returns a PaintContext used to generate the color pattern, * for use by the internal rendering engine. * * @param cm {@link ColorModel} that receives * the <code>Paint</code> data. This is used only as a hint. * * @param deviceBounds the device space bounding box of the * graphics primitive being rendered * * @param userBounds the user space bounding box of the * graphics primitive being rendered * * @param transform the {@link AffineTransform} from user * space into device space * * @param hints the hints that the context object uses to choose * between rendering alternatives * * @return the {@link PaintContext} that generates color patterns. * * @see PaintContext */	TokenNameCOMMENT_JAVADOC	 Creates and returns a PaintContext used to generate the color pattern, for use by the internal rendering engine. * @param cm {@link ColorModel} that receives the <code>Paint</code> data. This is used only as a hint. * @param deviceBounds the device space bounding box of the graphics primitive being rendered * @param userBounds the user space bounding box of the graphics primitive being rendered * @param transform the {@link AffineTransform} from user space into device space * @param hints the hints that the context object uses to choose between rendering alternatives * @return the {@link PaintContext} that generates color patterns. * @see PaintContext 
public	TokenNamepublic	
PaintContext	TokenNameIdentifier	 Paint Context
createContext	TokenNameIdentifier	 create Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
deviceBounds	TokenNameIdentifier	 device Bounds
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
userBounds	TokenNameIdentifier	 user Bounds
,	TokenNameCOMMA	
AffineTransform	TokenNameIdentifier	 Affine Transform
transform	TokenNameIdentifier	 transform
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Can't modify the transform passed in... 	TokenNameCOMMENT_LINE	Can't modify the transform passed in... 
transform	TokenNameIdentifier	 transform
=	TokenNameEQUAL	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
transform	TokenNameIdentifier	 transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//incorporate the gradient transform 	TokenNameCOMMENT_LINE	incorporate the gradient transform 
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
concatenate	TokenNameIdentifier	 concatenate
(	TokenNameLPAREN	
gradientTransform	TokenNameIdentifier	 gradient Transform
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
LinearGradientPaintContext	TokenNameIdentifier	 Linear Gradient Paint Context
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
,	TokenNameCOMMA	
deviceBounds	TokenNameIdentifier	 device Bounds
,	TokenNameCOMMA	
userBounds	TokenNameIdentifier	 user Bounds
,	TokenNameCOMMA	
transform	TokenNameIdentifier	 transform
,	TokenNameCOMMA	
hints	TokenNameIdentifier	 hints
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
getColors	TokenNameIdentifier	 get Colors
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cycleMethod	TokenNameIdentifier	 cycle Method
,	TokenNameCOMMA	
colorSpace	TokenNameIdentifier	 color Space
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoninvertibleTransformException	TokenNameIdentifier	 Noninvertible Transform Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"transform should be"	TokenNameStringLiteral	transform should be
+	TokenNamePLUS	
"invertible"	TokenNameStringLiteral	invertible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a copy of the start point of the gradient axis * @return a {@link Point2D} object that is a copy of the point * that anchors the first color of this * <code>LinearGradientPaint</code>. */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the start point of the gradient axis @return a {@link Point2D} object that is a copy of the point that anchors the first color of this <code>LinearGradientPaint</code>. 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getStartPoint	TokenNameIdentifier	 get Start Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a copy of the end point of the gradient axis * @return a {@link Point2D} object that is a copy of the point * that anchors the last color of this * <code>LinearGradientPaint</code>. */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the end point of the gradient axis @return a {@link Point2D} object that is a copy of the point that anchors the last color of this <code>LinearGradientPaint</code>. 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getEndPoint	TokenNameIdentifier	 get End Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
