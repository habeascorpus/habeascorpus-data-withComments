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
color	TokenNameIdentifier	 color
.	TokenNameDOT	
ColorSpace	TokenNameIdentifier	 Color Space
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
GraphicsUtil	TokenNameIdentifier	 Graphics Util
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
/** * This is an abstract base class that adds the ability to specify the * Color Space that the operation should take place in (linear sRGB or * gamma corrected sRBG). * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: AbstractColorInterpolationRable.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This is an abstract base class that adds the ability to specify the Color Space that the operation should take place in (linear sRGB or gamma corrected sRBG). * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: AbstractColorInterpolationRable.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
extends	TokenNameextends	
AbstractRable	TokenNameIdentifier	 Abstract Rable
{	TokenNameLBRACE	
/** * Indicates if the operation should be done in linear or gamma * corrected sRGB. */	TokenNameCOMMENT_JAVADOC	 Indicates if the operation should be done in linear or gamma corrected sRGB. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
csLinear	TokenNameIdentifier	 cs Linear
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * void constructor. The subclass must call one of the * flavors of init before the object becomes usable. * This is useful when the proper parameters to the init * method need to be computed in the subclasses constructor. */	TokenNameCOMMENT_JAVADOC	 void constructor. The subclass must call one of the flavors of init before the object becomes usable. This is useful when the proper parameters to the init method need to be computed in the subclasses constructor. 
protected	TokenNameprotected	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract Rable from src. * @param src will be the first (and only) member of the srcs * Vector. The bounds of src are also used to set the bounds of * this renderable. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract Rable from src. @param src will be the first (and only) member of the srcs Vector. The bounds of src are also used to set the bounds of this renderable. 
protected	TokenNameprotected	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract Rable from src and props. * @param src will also be set as the first (and only) member of * the srcs Vector. * @param props use to initialize the properties on this renderable image. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract Rable from src and props. @param src will also be set as the first (and only) member of the srcs Vector. @param props use to initialize the properties on this renderable image. 
protected	TokenNameprotected	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract Rable from a list of sources. * @param srcs This is used to initialize the srcs Vector. * The bounds of this renderable will be the union of the bounds * of all the sources in srcs. All the members of srcs must be * CachableRable otherwise an error will be thrown. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract Rable from a list of sources. @param srcs This is used to initialize the srcs Vector. The bounds of this renderable will be the union of the bounds of all the sources in srcs. All the members of srcs must be CachableRable otherwise an error will be thrown. 
protected	TokenNameprotected	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an Abstract Rable from a list of sources, and bounds. * @param srcs This is used to initialize the srcs Vector. All * the members of srcs must be CachableRable otherwise an error * will be thrown. * @param props use to initialize the properties on this renderable image. */	TokenNameCOMMENT_JAVADOC	 Construct an Abstract Rable from a list of sources, and bounds. @param srcs This is used to initialize the srcs Vector. All the members of srcs must be CachableRable otherwise an error will be thrown. @param props use to initialize the properties on this renderable image. 
protected	TokenNameprotected	
AbstractColorInterpolationRable	TokenNameIdentifier	 Abstract Color Interpolation Rable
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcs	TokenNameIdentifier	 srcs
,	TokenNameCOMMA	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this operation is to be performed in * the linear sRGB colorspace, returns false if the * operation is performed in gamma corrected sRGB. */	TokenNameCOMMENT_JAVADOC	 Returns true if this operation is to be performed in the linear sRGB colorspace, returns false if the operation is performed in gamma corrected sRGB. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isColorSpaceLinear	TokenNameIdentifier	 is Color Space Linear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
csLinear	TokenNameIdentifier	 cs Linear
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the colorspace the operation will be performed in. * @param csLinear if true this operation will be performed in the * linear sRGB colorspace, if false the operation will be performed in * gamma corrected sRGB. */	TokenNameCOMMENT_JAVADOC	 Sets the colorspace the operation will be performed in. @param csLinear if true this operation will be performed in the linear sRGB colorspace, if false the operation will be performed in gamma corrected sRGB. 
public	TokenNamepublic	
void	TokenNamevoid	
setColorSpaceLinear	TokenNameIdentifier	 set Color Space Linear
(	TokenNameLPAREN	
boolean	TokenNameboolean	
csLinear	TokenNameIdentifier	 cs Linear
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
csLinear	TokenNameIdentifier	 cs Linear
=	TokenNameEQUAL	
csLinear	TokenNameIdentifier	 cs Linear
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColorSpace	TokenNameIdentifier	 Color Space
getOperationColorSpace	TokenNameIdentifier	 get Operation Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
csLinear	TokenNameIdentifier	 cs Linear
)	TokenNameRPAREN	
return	TokenNamereturn	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_LINEAR_RGB	TokenNameIdentifier	 CS  LINEAR  RGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_sRGB	TokenNameIdentifier	 CS s RGB
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
CachableRed	TokenNameIdentifier	 Cachable Red
convertSourceCS	TokenNameIdentifier	 convert Source CS
(	TokenNameLPAREN	
CachableRed	TokenNameIdentifier	 Cachable Red
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
csLinear	TokenNameIdentifier	 cs Linear
)	TokenNameRPAREN	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
convertToLsRGB	TokenNameIdentifier	 convert To Ls RGB
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
convertTosRGB	TokenNameIdentifier	 convert Tos RGB
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
CachableRed	TokenNameIdentifier	 Cachable Red
convertSourceCS	TokenNameIdentifier	 convert Source CS
(	TokenNameLPAREN	
RenderedImage	TokenNameIdentifier	 Rendered Image
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
convertSourceCS	TokenNameIdentifier	 convert Source CS
(	TokenNameLPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
ri	TokenNameIdentifier	 ri
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
