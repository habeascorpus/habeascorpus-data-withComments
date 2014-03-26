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
Composite	TokenNameIdentifier	 Composite
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics2D	TokenNameIdentifier	 Graphics2 D
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
PadMode	TokenNameIdentifier	 Pad Mode
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
SVGComposite	TokenNameIdentifier	 SVG Composite
;	TokenNameSEMICOLON	
/** * Implements a filter chain. A filter chain is defined by its * filter region (i.e., the bounding box of its input/output), its * filter resolution and its source. Its source cannot be null, * but its resolution can. <br /> * The filter chain decomposes as follows: * <ul> * <li>A pad operation that makes the input image a big as the * filter region.</li> * <li>If there is a filterResolution specified along at least * one of the axis, a <tt>AffineRable</tt> * </ul> * * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> * @version $Id: FilterChainRable8Bit.java 594379 2007-11-13 01:08:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 Implements a filter chain. A filter chain is defined by its filter region (i.e., the bounding box of its input/output), its filter resolution and its source. Its source cannot be null, but its resolution can. <br /> The filter chain decomposes as follows: <ul> <li>A pad operation that makes the input image a big as the filter region.</li> <li>If there is a filterResolution specified along at least one of the axis, a <tt>AffineRable</tt> </ul> * @author <a href="mailto:vincent.hardy@eng.sun.com">Vincent Hardy</a> @version $Id: FilterChainRable8Bit.java 594379 2007-11-13 01:08:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
FilterChainRable8Bit	TokenNameIdentifier	 Filter Chain Rable8 Bit
extends	TokenNameextends	
AbstractRable	TokenNameIdentifier	 Abstract Rable
implements	TokenNameimplements	
FilterChainRable	TokenNameIdentifier	 Filter Chain Rable
,	TokenNameCOMMA	
PaintRable	TokenNameIdentifier	 Paint Rable
{	TokenNameLBRACE	
/** * Resolution along the X axis */	TokenNameCOMMENT_JAVADOC	 Resolution along the X axis 
private	TokenNameprivate	
int	TokenNameint	
filterResolutionX	TokenNameIdentifier	 filter Resolution X
;	TokenNameSEMICOLON	
/** * Resolution along the Y axis */	TokenNameCOMMENT_JAVADOC	 Resolution along the Y axis 
private	TokenNameprivate	
int	TokenNameint	
filterResolutionY	TokenNameIdentifier	 filter Resolution Y
;	TokenNameSEMICOLON	
/** * The chain's source */	TokenNameCOMMENT_JAVADOC	 The chain's source 
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
chainSource	TokenNameIdentifier	 chain Source
;	TokenNameSEMICOLON	
/** * Scale operation. May be null */	TokenNameCOMMENT_JAVADOC	 Scale operation. May be null 
private	TokenNameprivate	
FilterResRable	TokenNameIdentifier	 Filter Res Rable
filterRes	TokenNameIdentifier	 filter Res
;	TokenNameSEMICOLON	
/** * Crop operation. */	TokenNameCOMMENT_JAVADOC	 Crop operation. 
private	TokenNameprivate	
PadRable	TokenNameIdentifier	 Pad Rable
crop	TokenNameIdentifier	 crop
;	TokenNameSEMICOLON	
/** * Filter region */	TokenNameCOMMENT_JAVADOC	 Filter region 
private	TokenNameprivate	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
filterRegion	TokenNameIdentifier	 filter Region
;	TokenNameSEMICOLON	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
FilterChainRable8Bit	TokenNameIdentifier	 Filter Chain Rable8 Bit
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
filterRegion	TokenNameIdentifier	 filter Region
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filterRegion	TokenNameIdentifier	 filter Region
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Build crop with chain source and dummy region (will be lazily evaluated 	TokenNameCOMMENT_LINE	Build crop with chain source and dummy region (will be lazily evaluated 
// later on). 	TokenNameCOMMENT_LINE	later on). 
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
padRect	TokenNameIdentifier	 pad Rect
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
filterRegion	TokenNameIdentifier	 filter Region
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
crop	TokenNameIdentifier	 crop
=	TokenNameEQUAL	
new	TokenNamenew	
PadRable8Bit	TokenNameIdentifier	 Pad Rable8 Bit
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
padRect	TokenNameIdentifier	 pad Rect
,	TokenNameCOMMA	
PadMode	TokenNameIdentifier	 Pad Mode
.	TokenNameDOT	
ZERO_PAD	TokenNameIdentifier	 ZERO  PAD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Keep a reference to the chain source and filter 	TokenNameCOMMENT_LINE	Keep a reference to the chain source and filter 
// regions. 	TokenNameCOMMENT_LINE	regions. 
this	TokenNamethis	
.	TokenNameDOT	
chainSource	TokenNameIdentifier	 chain Source
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filterRegion	TokenNameIdentifier	 filter Region
=	TokenNameEQUAL	
filterRegion	TokenNameIdentifier	 filter Region
;	TokenNameSEMICOLON	
// crop is the real shource for this filter 	TokenNameCOMMENT_LINE	crop is the real shource for this filter 
// The filter chain is a simple passthrough to its 	TokenNameCOMMENT_LINE	The filter chain is a simple passthrough to its 
// crop node. 	TokenNameCOMMENT_LINE	crop node. 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
crop	TokenNameIdentifier	 crop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the resolution along the X axis. */	TokenNameCOMMENT_JAVADOC	 Returns the resolution along the X axis. 
public	TokenNamepublic	
int	TokenNameint	
getFilterResolutionX	TokenNameIdentifier	 get Filter Resolution X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filterResolutionX	TokenNameIdentifier	 filter Resolution X
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the resolution along the X axis, i.e., the maximum * size for intermediate images along that axis. * If filterResolutionX is less than zero, no filter resolution * is forced on the filter chain. If filterResolutionX is zero, * then the filter returns null. If filterResolutionX is positive, * then the filter resolution is applied. */	TokenNameCOMMENT_JAVADOC	 Sets the resolution along the X axis, i.e., the maximum size for intermediate images along that axis. If filterResolutionX is less than zero, no filter resolution is forced on the filter chain. If filterResolutionX is zero, then the filter returns null. If filterResolutionX is positive, then the filter resolution is applied. 
public	TokenNamepublic	
void	TokenNamevoid	
setFilterResolutionX	TokenNameIdentifier	 set Filter Resolution X
(	TokenNameLPAREN	
int	TokenNameint	
filterResolutionX	TokenNameIdentifier	 filter Resolution X
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filterResolutionX	TokenNameIdentifier	 filter Resolution X
=	TokenNameEQUAL	
filterResolutionX	TokenNameIdentifier	 filter Resolution X
;	TokenNameSEMICOLON	
setupFilterRes	TokenNameIdentifier	 setup Filter Res
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the resolution along the Y axis. */	TokenNameCOMMENT_JAVADOC	 Returns the resolution along the Y axis. 
public	TokenNamepublic	
int	TokenNameint	
getFilterResolutionY	TokenNameIdentifier	 get Filter Resolution Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filterResolutionY	TokenNameIdentifier	 filter Resolution Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the resolution along the Y axis, i.e., the maximum * size for intermediate images along that axis. * If filterResolutionY is zero or less, the value of * filterResolutionX is used. */	TokenNameCOMMENT_JAVADOC	 Sets the resolution along the Y axis, i.e., the maximum size for intermediate images along that axis. If filterResolutionY is zero or less, the value of filterResolutionX is used. 
public	TokenNamepublic	
void	TokenNamevoid	
setFilterResolutionY	TokenNameIdentifier	 set Filter Resolution Y
(	TokenNameLPAREN	
int	TokenNameint	
filterResolutionY	TokenNameIdentifier	 filter Resolution Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filterResolutionY	TokenNameIdentifier	 filter Resolution Y
=	TokenNameEQUAL	
filterResolutionY	TokenNameIdentifier	 filter Resolution Y
;	TokenNameSEMICOLON	
setupFilterRes	TokenNameIdentifier	 setup Filter Res
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implementation. Checks the current value of the * filterResolutionX and filterResolutionY attribute and * setup the filterRes operation accordingly. */	TokenNameCOMMENT_JAVADOC	 Implementation. Checks the current value of the filterResolutionX and filterResolutionY attribute and setup the filterRes operation accordingly. 
private	TokenNameprivate	
void	TokenNamevoid	
setupFilterRes	TokenNameIdentifier	 setup Filter Res
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filterResolutionX	TokenNameIdentifier	 filter Resolution X
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filterRes	TokenNameIdentifier	 filter Res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
filterRes	TokenNameIdentifier	 filter Res
=	TokenNameEQUAL	
new	TokenNamenew	
FilterResRable8Bit	TokenNameIdentifier	 Filter Res Rable8 Bit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterRes	TokenNameIdentifier	 filter Res
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
chainSource	TokenNameIdentifier	 chain Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
filterRes	TokenNameIdentifier	 filter Res
.	TokenNameDOT	
setFilterResolutionX	TokenNameIdentifier	 set Filter Resolution X
(	TokenNameLPAREN	
filterResolutionX	TokenNameIdentifier	 filter Resolution X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
filterRes	TokenNameIdentifier	 filter Res
.	TokenNameDOT	
setFilterResolutionY	TokenNameIdentifier	 set Filter Resolution Y
(	TokenNameLPAREN	
filterResolutionY	TokenNameIdentifier	 filter Resolution Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// X is negative, this disables the resolution filter. 	TokenNameCOMMENT_LINE	X is negative, this disables the resolution filter. 
filterRes	TokenNameIdentifier	 filter Res
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now, update the crop source to reflect the filterRes 	TokenNameCOMMENT_LINE	Now, update the crop source to reflect the filterRes 
// settings. 	TokenNameCOMMENT_LINE	settings. 
if	TokenNameif	
(	TokenNameLPAREN	
filterRes	TokenNameIdentifier	 filter Res
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
crop	TokenNameIdentifier	 crop
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
filterRes	TokenNameIdentifier	 filter Res
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
crop	TokenNameIdentifier	 crop
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
chainSource	TokenNameIdentifier	 chain Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Sets the filter output area, in user space. * A null value is illegal. */	TokenNameCOMMENT_JAVADOC	 Sets the filter output area, in user space. A null value is illegal. 
public	TokenNamepublic	
void	TokenNamevoid	
setFilterRegion	TokenNameIdentifier	 set Filter Region
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
filterRegion	TokenNameIdentifier	 filter Region
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
filterRegion	TokenNameIdentifier	 filter Region
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
filterRegion	TokenNameIdentifier	 filter Region
=	TokenNameEQUAL	
filterRegion	TokenNameIdentifier	 filter Region
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the filter output area, in user space */	TokenNameCOMMENT_JAVADOC	 Returns the filter output area, in user space 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getFilterRegion	TokenNameIdentifier	 get Filter Region
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
filterRegion	TokenNameIdentifier	 filter Region
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the source of the chain. Note that a crop and * affine operation may be inserted before the source, * depending on the filterRegion and filterResolution * parameters. */	TokenNameCOMMENT_JAVADOC	 Returns the source of the chain. Note that a crop and affine operation may be inserted before the source, depending on the filterRegion and filterResolution parameters. 
public	TokenNamepublic	
Filter	TokenNameIdentifier	 Filter
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
crop	TokenNameIdentifier	 crop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the source to be src. * @param chainSource image to the chain. */	TokenNameCOMMENT_JAVADOC	 Sets the source to be src. @param chainSource image to the chain. 
public	TokenNamepublic	
void	TokenNamevoid	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
chainSource	TokenNameIdentifier	 chain Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chainSource	TokenNameIdentifier	 chain Source
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Null Source for Filter Chain"	TokenNameStringLiteral	Null Source for Filter Chain
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
chainSource	TokenNameIdentifier	 chain Source
=	TokenNameEQUAL	
chainSource	TokenNameIdentifier	 chain Source
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
filterRes	TokenNameIdentifier	 filter Res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
crop	TokenNameIdentifier	 crop
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
chainSource	TokenNameIdentifier	 chain Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
filterRes	TokenNameIdentifier	 filter Res
.	TokenNameDOT	
setSource	TokenNameIdentifier	 set Source
(	TokenNameLPAREN	
chainSource	TokenNameIdentifier	 chain Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns this filter's bounds */	TokenNameCOMMENT_JAVADOC	 Returns this filter's bounds 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
)	TokenNameRPAREN	
filterRegion	TokenNameIdentifier	 filter Region
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Should perform the equivilent action as * createRendering followed by drawing the RenderedImage to * Graphics2D, or return false. * * @param g2d The Graphics2D to draw to. * @return true if the paint call succeeded, false if * for some reason the paint failed (in which * case a createRendering should be used). */	TokenNameCOMMENT_JAVADOC	 Should perform the equivilent action as createRendering followed by drawing the RenderedImage to Graphics2D, or return false. * @param g2d The Graphics2D to draw to. @return true if the paint call succeeded, false if for some reason the paint failed (in which case a createRendering should be used). 
public	TokenNamepublic	
boolean	TokenNameboolean	
paintRable	TokenNameIdentifier	 paint Rable
(	TokenNameLPAREN	
Graphics2D	TokenNameIdentifier	 Graphics2 D
g2d	TokenNameIdentifier	 g2d
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This optimization only apply if we are using 	TokenNameCOMMENT_LINE	This optimization only apply if we are using 
// SrcOver. Otherwise things break... 	TokenNameCOMMENT_LINE	SrcOver. Otherwise things break... 
Composite	TokenNameIdentifier	 Composite
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
g2d	TokenNameIdentifier	 g2d
.	TokenNameDOT	
getComposite	TokenNameIdentifier	 get Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
SVGComposite	TokenNameIdentifier	 SVG Composite
.	TokenNameDOT	
OVER	TokenNameIdentifier	 OVER
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
drawImage	TokenNameIdentifier	 draw Image
(	TokenNameLPAREN	
g2d	TokenNameIdentifier	 g2d
,	TokenNameCOMMA	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RenderedImage	TokenNameIdentifier	 Rendered Image
createRendering	TokenNameIdentifier	 create Rendering
(	TokenNameLPAREN	
RenderContext	TokenNameIdentifier	 Render Context
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
crop	TokenNameIdentifier	 crop
.	TokenNameDOT	
createRendering	TokenNameIdentifier	 create Rendering
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
