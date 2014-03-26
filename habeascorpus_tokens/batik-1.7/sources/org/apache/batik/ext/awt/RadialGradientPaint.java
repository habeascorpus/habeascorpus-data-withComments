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
/** * <p> * This class provides a way to fill a shape with a circular radial color * gradient pattern. The user may specify 2 or more gradient colors, and this * paint will provide an interpolation between each color. * <p> * * The user must provide an array of floats specifying how to distribute the * colors along the gradient. These values should range from 0.0 to 1.0 and * act like keyframes along the gradient (they mark where the gradient should * be exactly a particular color). * * <p> * This paint will map the first color of the gradient to a focus point within * the circle, and the last color to the perimeter of the circle, interpolating * smoothly for any inbetween colors specified by the user. Any line drawn * from the focus point to the circumference will span the all the gradient * colors. By default the focus is set to be the center of the circle. * * <p> * Specifying a focus point outside of the circle's radius will result in the * focus being set to the intersection point of the focus-center line and the * perimenter of the circle. * <p> * * Specifying a cycle method allows the user to control the painting behavior * outside of the bounds of the circle's radius. See LinearGradientPaint for * more details. * * <p> * The following code demonstrates typical usage of RadialGradientPaint: * <p> * <code> * Point2D center = new Point2D.Float(0, 0);<br> * float radius = 20; * float[] dist = {0.0, 0.2, 1.0};<br> * Color[] colors = {Color.red, Color.white, Color.blue};<br> * RadialGradientPaint p = new RadialGradientPaint(center, radius, * dist, colors); * </code> * * <p> In the event that the user does not set the first keyframe value equal * to 0 and the last keyframe value equal to 1, keyframes will be created at * these positions and the first and last colors will be replicated there. * So, if a user specifies the following arrays to construct a gradient:<br> * {Color.blue, Color.red}, {.3, .7}<br> * this will be converted to a gradient with the following keyframes: * {Color.blue, Color.blue, Color.red, Color.red}, {0, .3, .7, 1} * * * <p> * <img src = "radial.jpg"> * <p> * This image demonstrates a radial gradient with NO_CYCLE and default focus. * <p> * * <img src = "radial2.jpg"> * <p> * This image demonstrates a radial gradient with NO_CYCLE and non-centered * focus. * <p> * * <img src = "radial3.jpg"> * <p> * This image demonstrates a radial gradient with REFLECT and non-centered * focus. * * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: RadialGradientPaint.java 479573 2006-11-27 10:13:36Z dvholten $ * */	TokenNameCOMMENT_JAVADOC	 <p> This class provides a way to fill a shape with a circular radial color gradient pattern. The user may specify 2 or more gradient colors, and this paint will provide an interpolation between each color. <p> * The user must provide an array of floats specifying how to distribute the colors along the gradient. These values should range from 0.0 to 1.0 and act like keyframes along the gradient (they mark where the gradient should be exactly a particular color). * <p> This paint will map the first color of the gradient to a focus point within the circle, and the last color to the perimeter of the circle, interpolating smoothly for any inbetween colors specified by the user. Any line drawn from the focus point to the circumference will span the all the gradient colors. By default the focus is set to be the center of the circle. * <p> Specifying a focus point outside of the circle's radius will result in the focus being set to the intersection point of the focus-center line and the perimenter of the circle. <p> * Specifying a cycle method allows the user to control the painting behavior outside of the bounds of the circle's radius. See LinearGradientPaint for more details. * <p> The following code demonstrates typical usage of RadialGradientPaint: <p> <code> Point2D center = new Point2D.Float(0, 0);<br> float radius = 20; float[] dist = {0.0, 0.2, 1.0};<br> Color[] colors = {Color.red, Color.white, Color.blue};<br> RadialGradientPaint p = new RadialGradientPaint(center, radius, dist, colors); </code> * <p> In the event that the user does not set the first keyframe value equal to 0 and the last keyframe value equal to 1, keyframes will be created at these positions and the first and last colors will be replicated there. So, if a user specifies the following arrays to construct a gradient:<br> {Color.blue, Color.red}, {.3, .7}<br> this will be converted to a gradient with the following keyframes: {Color.blue, Color.blue, Color.red, Color.red}, {0, .3, .7, 1} * <p> <img src = "radial.jpg"> <p> This image demonstrates a radial gradient with NO_CYCLE and default focus. <p> * <img src = "radial2.jpg"> <p> This image demonstrates a radial gradient with NO_CYCLE and non-centered focus. <p> * <img src = "radial3.jpg"> <p> This image demonstrates a radial gradient with REFLECT and non-centered focus. * @author Nicholas Talian, Vincent Hardy, Jim Graham, Jerry Evans @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: RadialGradientPaint.java 479573 2006-11-27 10:13:36Z dvholten $ 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
extends	TokenNameextends	
MultipleGradientPaint	TokenNameIdentifier	 Multiple Gradient Paint
{	TokenNameLBRACE	
/** Focus point which defines the 0% gradient stop x coordinate. */	TokenNameCOMMENT_JAVADOC	 Focus point which defines the 0% gradient stop x coordinate. 
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
focus	TokenNameIdentifier	 focus
;	TokenNameSEMICOLON	
/** Center of the circle defining the 100% gradient stop x coordinate. */	TokenNameCOMMENT_JAVADOC	 Center of the circle defining the 100% gradient stop x coordinate. 
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
center	TokenNameIdentifier	 center
;	TokenNameSEMICOLON	
/** Radius of the outermost circle defining the 100% gradient stop. */	TokenNameCOMMENT_JAVADOC	 Radius of the outermost circle defining the 100% gradient stop. 
private	TokenNameprivate	
float	TokenNamefloat	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
/** * <p> * * Constructs a <code>RadialGradientPaint</code>, using the center as the * focus point. * * @param cx the x coordinate in user space of the center point of the * circle defining the gradient. The last color of the gradient is mapped * to the perimeter of this circle * * @param cy the y coordinate in user space of the center point of the * circle defining the gradient. The last color of the gradient is mapped * to the perimeter of this circle * * @param radius the radius of the circle defining the extents of the * color gradient * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors to use in the gradient. The first color * is used at the focus point, the last color around the perimeter of the * circle. * * * @throws IllegalArgumentException * if fractions.length != colors.length, or if colors is less * than 2 in size, or if radius < 0 * * */	TokenNameCOMMENT_JAVADOC	 <p> * Constructs a <code>RadialGradientPaint</code>, using the center as the focus point. * @param cx the x coordinate in user space of the center point of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle * @param cy the y coordinate in user space of the center point of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle * @param radius the radius of the circle defining the extents of the color gradient * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors to use in the gradient. The first color is used at the focus point, the last color around the perimeter of the circle. * @throws IllegalArgumentException if fractions.length != colors.length, or if colors is less than 2 in size, or if radius < 0 * 
public	TokenNamepublic	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
(	TokenNameLPAREN	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
,	TokenNameCOMMA	
float	TokenNamefloat	
radius	TokenNameIdentifier	 radius
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
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
,	TokenNameCOMMA	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> * * Constructs a <code>RadialGradientPaint</code>, using the center as the * focus point. * * @param center the center point, in user space, of the circle defining * the gradient * * @param radius the radius of the circle defining the extents of the * color gradient * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors to use in the gradient. The first color * is used at the focus point, the last color around the perimeter of the * circle. * * @throws NullPointerException if center point is null * * @throws IllegalArgumentException * if fractions.length != colors.length, or if colors is less * than 2 in size, or if radius < 0 * * */	TokenNameCOMMENT_JAVADOC	 <p> * Constructs a <code>RadialGradientPaint</code>, using the center as the focus point. * @param center the center point, in user space, of the circle defining the gradient * @param radius the radius of the circle defining the extents of the color gradient * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors to use in the gradient. The first color is used at the focus point, the last color around the perimeter of the circle. * @throws NullPointerException if center point is null * @throws IllegalArgumentException if fractions.length != colors.length, or if colors is less than 2 in size, or if radius < 0 * 
public	TokenNamepublic	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
float	TokenNamefloat	
radius	TokenNameIdentifier	 radius
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
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> * * Constructs a <code>RadialGradientPaint</code>. * * @param cx the x coordinate in user space of the center point of the * circle defining the gradient. The last color of the gradient is mapped * to the perimeter of this circle * * @param cy the y coordinate in user space of the center point of the * circle defining the gradient. The last color of the gradient is mapped * to the perimeter of this circle * * @param radius the radius of the circle defining the extents of the * color gradient * * @param fx the x coordinate of the point in user space to which the * first color is mapped * * @param fy the y coordinate of the point in user space to which the * first color is mapped * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors to use in the gradient. The first color * is used at the focus point, the last color around the perimeter of the * circle. * * @throws IllegalArgumentException * if fractions.length != colors.length, or if colors is less * than 2 in size, or if radius < 0 * * */	TokenNameCOMMENT_JAVADOC	 <p> * Constructs a <code>RadialGradientPaint</code>. * @param cx the x coordinate in user space of the center point of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle * @param cy the y coordinate in user space of the center point of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle * @param radius the radius of the circle defining the extents of the color gradient * @param fx the x coordinate of the point in user space to which the first color is mapped * @param fy the y coordinate of the point in user space to which the first color is mapped * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors to use in the gradient. The first color is used at the focus point, the last color around the perimeter of the circle. * @throws IllegalArgumentException if fractions.length != colors.length, or if colors is less than 2 in size, or if radius < 0 * 
public	TokenNamepublic	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
(	TokenNameLPAREN	
float	TokenNamefloat	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
float	TokenNamefloat	
cy	TokenNameIdentifier	 cy
,	TokenNameCOMMA	
float	TokenNamefloat	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
float	TokenNamefloat	
fx	TokenNameIdentifier	 fx
,	TokenNameCOMMA	
float	TokenNamefloat	
fy	TokenNameIdentifier	 fy
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
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
,	TokenNameCOMMA	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
fx	TokenNameIdentifier	 fx
,	TokenNameCOMMA	
fy	TokenNameIdentifier	 fy
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
/** * <p> * * Constructs a <code>RadialGradientPaint</code>. * * @param center the center point, in user space, of the circle defining * the gradient. The last color of the gradient is mapped to the perimeter * of this circle * * @param radius the radius of the circle defining the extents of the color * gradient * * @param focus the point, in user space, to which the first color is * mapped * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors to use in the gradient. The first color * is used at the focus point, the last color around the perimeter of the * circle. * * @throws NullPointerException if one of the points is null * * @throws IllegalArgumentException * if fractions.length != colors.length, or if colors is less * than 2 in size, or if radius < 0 * */	TokenNameCOMMENT_JAVADOC	 <p> * Constructs a <code>RadialGradientPaint</code>. * @param center the center point, in user space, of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle * @param radius the radius of the circle defining the extents of the color gradient * @param focus the point, in user space, to which the first color is mapped * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors to use in the gradient. The first color is used at the focus point, the last color around the perimeter of the circle. * @throws NullPointerException if one of the points is null * @throws IllegalArgumentException if fractions.length != colors.length, or if colors is less than 2 in size, or if radius < 0 
public	TokenNamepublic	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
float	TokenNamefloat	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
focus	TokenNameIdentifier	 focus
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
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
focus	TokenNameIdentifier	 focus
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
/** * <p> * * Constructs a <code>RadialGradientPaint</code>. * * @param center the center point in user space of the circle defining the * gradient. The last color of the gradient is mapped to the perimeter of * this circle * * @param radius the radius of the circle defining the extents of the color * gradient * * @param focus the point in user space to which the first color is mapped * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors to use in the gradient. The first color is * used at the focus point, the last color around the perimeter of the * circle. * * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * * @param colorSpace which colorspace to use for interpolation, * either SRGB or LINEAR_RGB * * @throws NullPointerException if one of the points is null * * @throws IllegalArgumentException * if fractions.length != colors.length, or if colors is less * than 2 in size, or if radius < 0 * */	TokenNameCOMMENT_JAVADOC	 <p> * Constructs a <code>RadialGradientPaint</code>. * @param center the center point in user space of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle * @param radius the radius of the circle defining the extents of the color gradient * @param focus the point in user space to which the first color is mapped * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors to use in the gradient. The first color is used at the focus point, the last color around the perimeter of the circle. * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * @param colorSpace which colorspace to use for interpolation, either SRGB or LINEAR_RGB * @throws NullPointerException if one of the points is null * @throws IllegalArgumentException if fractions.length != colors.length, or if colors is less than 2 in size, or if radius < 0 
public	TokenNamepublic	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
float	TokenNamefloat	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
focus	TokenNameIdentifier	 focus
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
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
focus	TokenNameIdentifier	 focus
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
/** * <p> * * Constructs a <code>RadialGradientPaint</code>. * * @param center the center point in user space of the circle defining the * gradient. The last color of the gradient is mapped to the perimeter of * this circle * * @param radius the radius of the circle defining the extents of the color * gradient. * * @param focus the point in user space to which the first color is mapped * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors to use in the gradient. The first color is * used at the focus point, the last color around the perimeter of the * circle. * * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * * @param colorSpace which colorspace to use for interpolation, * either SRGB or LINEAR_RGB * * @param gradientTransform transform to apply to the gradient * * @throws NullPointerException if one of the points is null, * or gradientTransform is null * * @throws IllegalArgumentException * if fractions.length != colors.length, or if colors is less * than 2 in size, or if radius < 0 * */	TokenNameCOMMENT_JAVADOC	 <p> * Constructs a <code>RadialGradientPaint</code>. * @param center the center point in user space of the circle defining the gradient. The last color of the gradient is mapped to the perimeter of this circle * @param radius the radius of the circle defining the extents of the color gradient. * @param focus the point in user space to which the first color is mapped * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors to use in the gradient. The first color is used at the focus point, the last color around the perimeter of the circle. * @param cycleMethod either NO_CYCLE, REFLECT, or REPEAT * @param colorSpace which colorspace to use for interpolation, either SRGB or LINEAR_RGB * @param gradientTransform transform to apply to the gradient * @throws NullPointerException if one of the points is null, or gradientTransform is null * @throws IllegalArgumentException if fractions.length != colors.length, or if colors is less than 2 in size, or if radius < 0 
public	TokenNamepublic	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
center	TokenNameIdentifier	 center
,	TokenNameCOMMA	
float	TokenNamefloat	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
focus	TokenNameIdentifier	 focus
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
// Check input arguments 	TokenNameCOMMENT_LINE	Check input arguments 
if	TokenNameif	
(	TokenNameLPAREN	
center	TokenNameIdentifier	 center
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"Center point should not be null."	TokenNameStringLiteral	Center point should not be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
focus	TokenNameIdentifier	 focus
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
"Focus point should not be null."	TokenNameStringLiteral	Focus point should not be null.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
radius	TokenNameIdentifier	 radius
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"radius should be greater than zero"	TokenNameStringLiteral	radius should be greater than zero
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//copy parameters 	TokenNameCOMMENT_LINE	copy parameters 
this	TokenNamethis	
.	TokenNameDOT	
center	TokenNameIdentifier	 center
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
)	TokenNameRPAREN	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
focus	TokenNameIdentifier	 focus
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
)	TokenNameRPAREN	
focus	TokenNameIdentifier	 focus
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
radius	TokenNameIdentifier	 radius
=	TokenNameEQUAL	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * <p> * * Constructs a <code>RadialGradientPaint</code>, the gradient circle is * defined by a bounding box. * * @param gradientBounds the bounding box, in user space, of the circle * defining outermost extent of the gradient. * * @param fractions numbers ranging from 0.0 to 1.0 specifying the * distribution of colors along the gradient * * @param colors array of colors to use in the gradient. The first color * is used at the focus point, the last color around the perimeter of the * circle. * * @throws NullPointerException if the gradientBounds is null * * @throws IllegalArgumentException * if fractions.length != colors.length, or if colors is less * than 2 in size, or if radius < 0 * */	TokenNameCOMMENT_JAVADOC	 <p> * Constructs a <code>RadialGradientPaint</code>, the gradient circle is defined by a bounding box. * @param gradientBounds the bounding box, in user space, of the circle defining outermost extent of the gradient. * @param fractions numbers ranging from 0.0 to 1.0 specifying the distribution of colors along the gradient * @param colors array of colors to use in the gradient. The first color is used at the focus point, the last color around the perimeter of the circle. * @throws NullPointerException if the gradientBounds is null * @throws IllegalArgumentException if fractions.length != colors.length, or if colors is less than 2 in size, or if radius < 0 
public	TokenNamepublic	
RadialGradientPaint	TokenNameIdentifier	 Radial Gradient Paint
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
gradientBounds	TokenNameIdentifier	 gradient Bounds
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
//calculate center point and radius based on bounding box coordinates. 	TokenNameCOMMENT_LINE	calculate center point and radius based on bounding box coordinates. 
this	TokenNamethis	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gradientBounds	TokenNameIdentifier	 gradient Bounds
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gradientBounds	TokenNameIdentifier	 gradient Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gradientBounds	TokenNameIdentifier	 gradient Bounds
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gradientBounds	TokenNameIdentifier	 gradient Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
gradientBounds	TokenNameIdentifier	 gradient Bounds
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** <p> * Creates and returns a PaintContext used to generate the color pattern, * for use by the internal rendering engine. * * @param cm {@link ColorModel} that receives * the <code>Paint</code> data. This is used only as a hint. * * @param deviceBounds the device space bounding box of the * graphics primitive being rendered * * @param userBounds the user space bounding box of the * graphics primitive being rendered * * @param transform the {@link AffineTransform} from user * space into device space * * @param hints the hints that the context object uses to choose * between rendering alternatives * * @return the {@link PaintContext} that generates color patterns. * * @throws IllegalArgumentException if the transform is not invertible * * @see PaintContext */	TokenNameCOMMENT_JAVADOC	 <p> Creates and returns a PaintContext used to generate the color pattern, for use by the internal rendering engine. * @param cm {@link ColorModel} that receives the <code>Paint</code> data. This is used only as a hint. * @param deviceBounds the device space bounding box of the graphics primitive being rendered * @param userBounds the user space bounding box of the graphics primitive being rendered * @param transform the {@link AffineTransform} from user space into device space * @param hints the hints that the context object uses to choose between rendering alternatives * @return the {@link PaintContext} that generates color patterns. * @throws IllegalArgumentException if the transform is not invertible * @see PaintContext 
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
// incorporate the gradient transform 	TokenNameCOMMENT_LINE	incorporate the gradient transform 
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
RadialGradientPaintContext	TokenNameIdentifier	 Radial Gradient Paint Context
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
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
radius	TokenNameIdentifier	 radius
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
focus	TokenNameIdentifier	 focus
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
focus	TokenNameIdentifier	 focus
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fractions	TokenNameIdentifier	 fractions
,	TokenNameCOMMA	
colors	TokenNameIdentifier	 colors
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
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"transform should be "	TokenNameStringLiteral	transform should be 
+	TokenNamePLUS	
"invertible"	TokenNameStringLiteral	invertible
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns a copy of the center point of the radial gradient. * @return a {@link Point2D} object that is a copy of the center point */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the center point of the radial gradient. @return a {@link Point2D} object that is a copy of the center point 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getCenterPoint	TokenNameIdentifier	 get Center Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
center	TokenNameIdentifier	 center
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a copy of the end point of the gradient axis. * @return a {@link Point2D} object that is a copy of the focus point */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the end point of the gradient axis. @return a {@link Point2D} object that is a copy of the focus point 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getFocusPoint	TokenNameIdentifier	 get Focus Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
focus	TokenNameIdentifier	 focus
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
focus	TokenNameIdentifier	 focus
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the radius of the circle defining the radial gradient. * @return the radius of the circle defining the radial gradient */	TokenNameCOMMENT_JAVADOC	 Returns the radius of the circle defining the radial gradient. @return the radius of the circle defining the radial gradient 
public	TokenNamepublic	
float	TokenNamefloat	
getRadius	TokenNameIdentifier	 get Radius
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
radius	TokenNameIdentifier	 radius
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
