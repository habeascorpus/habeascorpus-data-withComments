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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
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
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
RenderedImage	TokenNameIdentifier	 Rendered Image
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
renderable	TokenNameIdentifier	 renderable
.	TokenNameDOT	
RenderContext	TokenNameIdentifier	 Render Context
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
rendered	TokenNameIdentifier	 rendered
.	TokenNameDOT	
AffineRed	TokenNameIdentifier	 Affine Red
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
rendered	TokenNameIdentifier	 rendered
.	TokenNameDOT	
CachableRed	TokenNameIdentifier	 Cachable Red
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
image	TokenNameIdentifier	 image
.	TokenNameDOT	
rendered	TokenNameIdentifier	 rendered
.	TokenNameDOT	
TranslateRed	TokenNameIdentifier	 Translate Red
;	TokenNameSEMICOLON	
/** * RasterRable This is used to wrap a Rendered Image back into the * RenderableImage world. * * @author <a href="mailto:Thomas.DeWeese@Kodak.com">Thomas DeWeese</a> * @version $Id: RedRable.java 478276 2006-11-22 18:33:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 RasterRable This is used to wrap a Rendered Image back into the RenderableImage world. * @author <a href="mailto:Thomas.DeWeese@Kodak.com">Thomas DeWeese</a> @version $Id: RedRable.java 478276 2006-11-22 18:33:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
RedRable	TokenNameIdentifier	 Red Rable
extends	TokenNameextends	
AbstractRable	TokenNameIdentifier	 Abstract Rable
{	TokenNameLBRACE	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RedRable	TokenNameIdentifier	 Red Rable
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
)	TokenNameRPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CachableRed	TokenNameIdentifier	 Cachable Red
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPropertyNames	TokenNameIdentifier	 get Property Names
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RenderedImage	TokenNameIdentifier	 Rendered Image
createDefaultRendering	TokenNameIdentifier	 create Default Rendering
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RenderedImage	TokenNameIdentifier	 Rendered Image
createRendering	TokenNameIdentifier	 create Rendering
(	TokenNameLPAREN	
RenderContext	TokenNameIdentifier	 Render Context
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("RedRable Create Rendering: " + this); 	TokenNameCOMMENT_LINE	System.out.println("RedRable Create Rendering: " + this); 
// Just copy over the rendering hints. 	TokenNameCOMMENT_LINE	Just copy over the rendering hints. 
RenderingHints	TokenNameIdentifier	 Rendering Hints
rh	TokenNameIdentifier	 rh
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getRenderingHints	TokenNameIdentifier	 get Rendering Hints
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rh	TokenNameIdentifier	 rh
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
rh	TokenNameIdentifier	 rh
=	TokenNameEQUAL	
new	TokenNamenew	
RenderingHints	TokenNameIdentifier	 Rendering Hints
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Shape	TokenNameIdentifier	 Shape
aoi	TokenNameIdentifier	 aoi
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getAreaOfInterest	TokenNameIdentifier	 get Area Of Interest
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
aoiR	TokenNameIdentifier	 aoi R
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aoi	TokenNameIdentifier	 aoi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
aoiR	TokenNameIdentifier	 aoi R
=	TokenNameEQUAL	
aoi	TokenNameIdentifier	 aoi
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
aoiR	TokenNameIdentifier	 aoi R
=	TokenNameEQUAL	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// get the current affine transform 	TokenNameCOMMENT_LINE	get the current affine transform 
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
getTransform	TokenNameIdentifier	 get Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For high quality output we should really apply a Gaussian 	TokenNameCOMMENT_LINE	For high quality output we should really apply a Gaussian 
// Blur when we are scaling the image down significantly this 	TokenNameCOMMENT_LINE	Blur when we are scaling the image down significantly this 
// helps to prevent aliasing in the result image. 	TokenNameCOMMENT_LINE	helps to prevent aliasing in the result image. 
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
aoiR	TokenNameIdentifier	 aoi R
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
isIdentity	TokenNameIdentifier	 is Identity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Using as is"); 	TokenNameCOMMENT_LINE	System.out.println("Using as is"); 
return	TokenNamereturn	
cr	TokenNameIdentifier	 cr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleX	TokenNameIdentifier	 get Scale X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getScaleY	TokenNameIdentifier	 get Scale Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearX	TokenNameIdentifier	 get Shear X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getShearY	TokenNameIdentifier	 get Shear Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
xloc	TokenNameIdentifier	 xloc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
yloc	TokenNameIdentifier	 yloc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
xloc	TokenNameIdentifier	 xloc
-	TokenNameMINUS	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateX	TokenNameIdentifier	 get Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
yloc	TokenNameIdentifier	 yloc
-	TokenNameMINUS	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
at	TokenNameIdentifier	 at
.	TokenNameDOT	
getTranslateY	TokenNameIdentifier	 get Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
>	TokenNameGREATER	
-	TokenNameMINUS	
0.0001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
<	TokenNameLESS	
0.0001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
>	TokenNameGREATER	
-	TokenNameMINUS	
0.0001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
dy	TokenNameIdentifier	 dy
<	TokenNameLESS	
0.0001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println("Using TranslateRed"); 	TokenNameCOMMENT_LINE	System.out.println("Using TranslateRed"); 
return	TokenNamereturn	
new	TokenNamenew	
TranslateRed	TokenNameIdentifier	 Translate Red
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
xloc	TokenNameIdentifier	 xloc
,	TokenNameCOMMA	
yloc	TokenNameIdentifier	 yloc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println("Using Full affine: " + at); 	TokenNameCOMMENT_LINE	System.out.println("Using Full affine: " + at); 
return	TokenNamereturn	
new	TokenNamenew	
AffineRed	TokenNameIdentifier	 Affine Red
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
rh	TokenNameIdentifier	 rh
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
