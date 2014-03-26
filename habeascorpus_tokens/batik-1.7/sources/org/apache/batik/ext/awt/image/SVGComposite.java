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
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
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
CompositeContext	TokenNameIdentifier	 Composite Context
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
ColorModel	TokenNameIdentifier	 Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
PackedColorModel	TokenNameIdentifier	 Packed Color Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
Raster	TokenNameIdentifier	 Raster
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
WritableRaster	TokenNameIdentifier	 Writable Raster
;	TokenNameSEMICOLON	
/** * This provides an implementation of all the composite rules in SVG. * * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> * @version $Id: SVGComposite.java 478363 2006-11-22 23:01:13Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 This provides an implementation of all the composite rules in SVG. * @author <a href="mailto:Thomas.DeWeeese@Kodak.com">Thomas DeWeese</a> @version $Id: SVGComposite.java 478363 2006-11-22 23:01:13Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
SVGComposite	TokenNameIdentifier	 SVG Composite
implements	TokenNameimplements	
Composite	TokenNameIdentifier	 Composite
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
OVER	TokenNameIdentifier	 OVER
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
OVER	TokenNameIdentifier	 OVER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
IN	TokenNameIdentifier	 IN
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
IN	TokenNameIdentifier	 IN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
OUT	TokenNameIdentifier	 OUT
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
OUT	TokenNameIdentifier	 OUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
ATOP	TokenNameIdentifier	 ATOP
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
ATOP	TokenNameIdentifier	 ATOP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
XOR	TokenNameIdentifier	 XOR
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
XOR	TokenNameIdentifier	 XOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
MULTIPLY	TokenNameIdentifier	 MULTIPLY
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
MULTIPLY	TokenNameIdentifier	 MULTIPLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
SCREEN	TokenNameIdentifier	 SCREEN
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
SCREEN	TokenNameIdentifier	 SCREEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
DARKEN	TokenNameIdentifier	 DARKEN
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
DARKEN	TokenNameIdentifier	 DARKEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
SVGComposite	TokenNameIdentifier	 SVG Composite
LIGHTEN	TokenNameIdentifier	 LIGHTEN
=	TokenNameEQUAL	
new	TokenNamenew	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
LIGHTEN	TokenNameIdentifier	 LIGHTEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CompositeRule	TokenNameIdentifier	 Composite Rule
rule	TokenNameIdentifier	 rule
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompositeRule	TokenNameIdentifier	 Composite Rule
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rule	TokenNameIdentifier	 rule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SVGComposite	TokenNameIdentifier	 SVG Composite
(	TokenNameLPAREN	
CompositeRule	TokenNameIdentifier	 Composite Rule
rule	TokenNameIdentifier	 rule
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rule	TokenNameIdentifier	 rule
=	TokenNameEQUAL	
rule	TokenNameIdentifier	 rule
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
SVGComposite	TokenNameIdentifier	 SVG Composite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SVGComposite	TokenNameIdentifier	 SVG Composite
svgc	TokenNameIdentifier	 svgc
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SVGComposite	TokenNameIdentifier	 SVG Composite
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
svgc	TokenNameIdentifier	 svgc
.	TokenNameDOT	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
ac	TokenNameIdentifier	 ac
=	TokenNameEQUAL	
(	TokenNameLPAREN	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_OVER	TokenNameIdentifier	 RULE  OVER
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ac	TokenNameIdentifier	 ac
==	TokenNameEQUAL_EQUAL	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcOver	TokenNameIdentifier	 Src Over
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_IN	TokenNameIdentifier	 RULE  IN
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ac	TokenNameIdentifier	 ac
==	TokenNameEQUAL_EQUAL	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcIn	TokenNameIdentifier	 Src In
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_OUT	TokenNameIdentifier	 RULE  OUT
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ac	TokenNameIdentifier	 ac
==	TokenNameEQUAL_EQUAL	
AlphaComposite	TokenNameIdentifier	 Alpha Composite
.	TokenNameDOT	
SrcOut	TokenNameIdentifier	 Src Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
is_INT_PACK	TokenNameIdentifier	 is  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
cm	TokenNameIdentifier	 cm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check ColorModel is of type DirectColorModel 	TokenNameCOMMENT_LINE	Check ColorModel is of type DirectColorModel 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
cm	TokenNameIdentifier	 cm
instanceof	TokenNameinstanceof	
PackedColorModel	TokenNameIdentifier	 Packed Color Model
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
PackedColorModel	TokenNameIdentifier	 Packed Color Model
pcm	TokenNameIdentifier	 pcm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PackedColorModel	TokenNameIdentifier	 Packed Color Model
)	TokenNameRPAREN	
cm	TokenNameIdentifier	 cm
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
pcm	TokenNameIdentifier	 pcm
.	TokenNameDOT	
getMasks	TokenNameIdentifier	 get Masks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check transfer type 	TokenNameCOMMENT_LINE	Check transfer type 
if	TokenNameif	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0x00ff0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0x0000ff00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0x000000ff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0xff000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CompositeContext	TokenNameIdentifier	 Composite Context
createContext	TokenNameIdentifier	 create Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
RenderingHints	TokenNameIdentifier	 Rendering Hints
hints	TokenNameIdentifier	 hints
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorSpace	TokenNameIdentifier	 Color Space
srcCS	TokenNameIdentifier	 src CS
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorSpace	TokenNameIdentifier	 Color Space
dstCS	TokenNameIdentifier	 dst CS
=	TokenNameEQUAL	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
getColorSpace	TokenNameIdentifier	 get Color Space
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"srcCS: "	TokenNameStringLiteral	srcCS: 
+	TokenNamePLUS	
srcCS	TokenNameIdentifier	 src CS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"dstCS: "	TokenNameStringLiteral	dstCS: 
+	TokenNamePLUS	
dstCS	TokenNameIdentifier	 dst CS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"lRGB: "	TokenNameStringLiteral	lRGB: 
+	TokenNamePLUS	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_LINEAR_RGB	TokenNameIdentifier	 CS  LINEAR  RGB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"sRGB: "	TokenNameStringLiteral	sRGB: 
+	TokenNamePLUS	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ColorSpace	TokenNameIdentifier	 Color Space
.	TokenNameDOT	
CS_sRGB	TokenNameIdentifier	 CS s RGB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Orig Time no int_pack = 51792 	TokenNameCOMMENT_LINE	Orig Time no int_pack = 51792 
// Simple int_pack = 19600 	TokenNameCOMMENT_LINE	Simple int_pack = 19600 
boolean	TokenNameboolean	
use_int_pack	TokenNameIdentifier	 use int pack
=	TokenNameEQUAL	
(	TokenNameLPAREN	
is_INT_PACK	TokenNameIdentifier	 is  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
is_INT_PACK	TokenNameIdentifier	 is  INT  PACK
(	TokenNameLPAREN	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use_int_pack = false; 	TokenNameCOMMENT_LINE	use_int_pack = false; 
switch	TokenNameswitch	
(	TokenNameLPAREN	
rule	TokenNameIdentifier	 rule
.	TokenNameDOT	
getRule	TokenNameIdentifier	 get Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_OVER	TokenNameIdentifier	 RULE  OVER
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
hasAlpha	TokenNameIdentifier	 has Alpha
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
OverCompositeContext_INT_PACK_NA	TokenNameIdentifier	 Over Composite Context  INT  PACK  NA
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
OverCompositeContext_NA	TokenNameIdentifier	 Over Composite Context  NA
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
OverCompositeContext	TokenNameIdentifier	 Over Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
OverCompositeContext_INT_PACK	TokenNameIdentifier	 Over Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
OverCompositeContext_INT_PACK_UNPRE	TokenNameIdentifier	 Over Composite Context  INT  PACK  UNPRE
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_IN	TokenNameIdentifier	 RULE  IN
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
InCompositeContext_INT_PACK	TokenNameIdentifier	 In Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
InCompositeContext	TokenNameIdentifier	 In Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_OUT	TokenNameIdentifier	 RULE  OUT
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
OutCompositeContext_INT_PACK	TokenNameIdentifier	 Out Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
OutCompositeContext	TokenNameIdentifier	 Out Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_ATOP	TokenNameIdentifier	 RULE  ATOP
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
AtopCompositeContext_INT_PACK	TokenNameIdentifier	 Atop Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
AtopCompositeContext	TokenNameIdentifier	 Atop Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_XOR	TokenNameIdentifier	 RULE  XOR
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
XorCompositeContext_INT_PACK	TokenNameIdentifier	 Xor Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
XorCompositeContext	TokenNameIdentifier	 Xor Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_ARITHMETIC	TokenNameIdentifier	 RULE  ARITHMETIC
:	TokenNameCOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coeff	TokenNameIdentifier	 coeff
=	TokenNameEQUAL	
rule	TokenNameIdentifier	 rule
.	TokenNameDOT	
getCoefficients	TokenNameIdentifier	 get Coefficients
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
ArithCompositeContext_INT_PACK_LUT	TokenNameIdentifier	 Arith Composite Context  INT  PACK  LUT
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
coeff	TokenNameIdentifier	 coeff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coeff	TokenNameIdentifier	 coeff
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coeff	TokenNameIdentifier	 coeff
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coeff	TokenNameIdentifier	 coeff
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
ArithCompositeContext	TokenNameIdentifier	 Arith Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
coeff	TokenNameIdentifier	 coeff
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coeff	TokenNameIdentifier	 coeff
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coeff	TokenNameIdentifier	 coeff
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
coeff	TokenNameIdentifier	 coeff
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_MULTIPLY	TokenNameIdentifier	 RULE  MULTIPLY
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
MultiplyCompositeContext_INT_PACK	TokenNameIdentifier	 Multiply Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
MultiplyCompositeContext	TokenNameIdentifier	 Multiply Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_SCREEN	TokenNameIdentifier	 RULE  SCREEN
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
ScreenCompositeContext_INT_PACK	TokenNameIdentifier	 Screen Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
ScreenCompositeContext	TokenNameIdentifier	 Screen Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_DARKEN	TokenNameIdentifier	 RULE  DARKEN
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
DarkenCompositeContext_INT_PACK	TokenNameIdentifier	 Darken Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
DarkenCompositeContext	TokenNameIdentifier	 Darken Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
case	TokenNamecase	
CompositeRule	TokenNameIdentifier	 Composite Rule
.	TokenNameDOT	
RULE_LIGHTEN	TokenNameIdentifier	 RULE  LIGHTEN
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
use_int_pack	TokenNameIdentifier	 use int pack
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
LightenCompositeContext_INT_PACK	TokenNameIdentifier	 Lighten Composite Context  INT  PACK
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
LightenCompositeContext	TokenNameIdentifier	 Lighten Composite Context
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"Unknown composite rule requested."	TokenNameStringLiteral	Unknown composite rule requested.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
implements	TokenNameimplements	
CompositeContext	TokenNameIdentifier	 Composite Context
{	TokenNameLBRACE	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
;	TokenNameSEMICOLON	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
dstCM	TokenNameIdentifier	 dst CM
=	TokenNameEQUAL	
dstCM	TokenNameIdentifier	 dst CM
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
dispose	TokenNameIdentifier	 dispose
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcCM	TokenNameIdentifier	 src CM
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
dstCM	TokenNameIdentifier	 dst CM
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorModel	TokenNameIdentifier	 Color Model
srcPreCM	TokenNameIdentifier	 src Pre CM
=	TokenNameEQUAL	
srcCM	TokenNameIdentifier	 src CM
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
srcPreCM	TokenNameIdentifier	 src Pre CM
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ColorModel	TokenNameIdentifier	 Color Model
dstPreCM	TokenNameIdentifier	 dst Pre CM
=	TokenNameEQUAL	
dstCM	TokenNameIdentifier	 dst CM
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
dstPreCM	TokenNameIdentifier	 dst Pre CM
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
)	TokenNameRPAREN	
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
srcPreCM	TokenNameIdentifier	 src Pre CM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
dstOut	TokenNameIdentifier	 dst Out
,	TokenNameCOMMA	
dstPreCM	TokenNameIdentifier	 dst Pre CM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstIn	TokenNameIdentifier	 dst In
!=	TokenNameNOT_EQUAL	
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
)	TokenNameRPAREN	
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
dstPreCM	TokenNameIdentifier	 dst Pre CM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
static	TokenNamestatic	
class	TokenNameclass	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x0	TokenNameIdentifier	 x0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
srcSPPSM	TokenNameIdentifier	 src SPPSM
;	TokenNameSEMICOLON	
srcSPPSM	TokenNameIdentifier	 src SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
srcScanStride	TokenNameIdentifier	 src Scan Stride
=	TokenNameEQUAL	
srcSPPSM	TokenNameIdentifier	 src SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
srcDB	TokenNameIdentifier	 src DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
=	TokenNameEQUAL	
srcDB	TokenNameIdentifier	 src DB
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
srcBase	TokenNameIdentifier	 src Base
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcDB	TokenNameIdentifier	 src DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcSPPSM	TokenNameIdentifier	 src SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
-	TokenNameMINUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
-	TokenNameMINUS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
dstInSPPSM	TokenNameIdentifier	 dst In SPPSM
;	TokenNameSEMICOLON	
dstInSPPSM	TokenNameIdentifier	 dst In SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstInScanStride	TokenNameIdentifier	 dst In Scan Stride
=	TokenNameEQUAL	
dstInSPPSM	TokenNameIdentifier	 dst In SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dstInDB	TokenNameIdentifier	 dst In DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
=	TokenNameEQUAL	
dstInDB	TokenNameIdentifier	 dst In DB
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstInBase	TokenNameIdentifier	 dst In Base
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstInDB	TokenNameIdentifier	 dst In DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstInSPPSM	TokenNameIdentifier	 dst In SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
-	TokenNameMINUS	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
-	TokenNameMINUS	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
dstOutSPPSM	TokenNameIdentifier	 dst Out SPPSM
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SinglePixelPackedSampleModel	TokenNameIdentifier	 Single Pixel Packed Sample Model
)	TokenNameRPAREN	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getSampleModel	TokenNameIdentifier	 get Sample Model
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstOutScanStride	TokenNameIdentifier	 dst Out Scan Stride
=	TokenNameEQUAL	
dstOutSPPSM	TokenNameIdentifier	 dst Out SPPSM
.	TokenNameDOT	
getScanlineStride	TokenNameIdentifier	 get Scanline Stride
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
dstOutDB	TokenNameIdentifier	 dst Out DB
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DataBufferInt	TokenNameIdentifier	 Data Buffer Int
)	TokenNameRPAREN	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getDataBuffer	TokenNameIdentifier	 get Data Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
=	TokenNameEQUAL	
dstOutDB	TokenNameIdentifier	 dst Out DB
.	TokenNameDOT	
getBankData	TokenNameIdentifier	 get Bank Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstOutBase	TokenNameIdentifier	 dst Out Base
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstOutDB	TokenNameIdentifier	 dst Out DB
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstOutSPPSM	TokenNameIdentifier	 dst Out SPPSM
.	TokenNameDOT	
getOffset	TokenNameIdentifier	 get Offset
(	TokenNameLPAREN	
x0	TokenNameIdentifier	 x0
-	TokenNameMINUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getSampleModelTranslateX	TokenNameIdentifier	 get Sample Model Translate X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
y0	TokenNameIdentifier	 y0
-	TokenNameMINUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getSampleModelTranslateY	TokenNameIdentifier	 get Sample Model Translate Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
=	TokenNameEQUAL	
srcScanStride	TokenNameIdentifier	 src Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
=	TokenNameEQUAL	
dstInScanStride	TokenNameIdentifier	 dst In Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
=	TokenNameEQUAL	
dstOutScanStride	TokenNameIdentifier	 dst Out Scan Stride
-	TokenNameMINUS	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
srcBase	TokenNameIdentifier	 src Base
,	TokenNameCOMMA	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
dstInBase	TokenNameIdentifier	 dst In Base
,	TokenNameCOMMA	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
dstOutBase	TokenNameIdentifier	 dst Out Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This implements SRC_OVER for 4 band byte data. */	TokenNameCOMMENT_JAVADOC	 This implements SRC_OVER for 4 band byte data. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OverCompositeContext	TokenNameIdentifier	 Over Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
OverCompositeContext	TokenNameIdentifier	 Over Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This implements SRC_OVER for 4 band byte src data and * 3 band byte dst data. */	TokenNameCOMMENT_JAVADOC	 This implements SRC_OVER for 4 band byte src data and 3 band byte dst data. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OverCompositeContext_NA	TokenNameIdentifier	 Over Composite Context  NA
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
OverCompositeContext_NA	TokenNameIdentifier	 Over Composite Context  NA
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcSP	TokenNameIdentifier	 src SP
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstSP	TokenNameIdentifier	 dst SP
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
srcSP	TokenNameIdentifier	 src SP
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
srcSP	TokenNameIdentifier	 src SP
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
dstSP	TokenNameIdentifier	 dst SP
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
srcSP	TokenNameIdentifier	 src SP
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
dstSP	TokenNameIdentifier	 dst SP
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
srcSP	TokenNameIdentifier	 src SP
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
dstSP	TokenNameIdentifier	 dst SP
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
dstSP	TokenNameIdentifier	 dst SP
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
srcSP	TokenNameIdentifier	 src SP
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
dstSP	TokenNameIdentifier	 dst SP
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
srcSP	TokenNameIdentifier	 src SP
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
dstSP	TokenNameIdentifier	 dst SP
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
dstSP	TokenNameIdentifier	 dst SP
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
srcSP	TokenNameIdentifier	 src SP
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
dstSP	TokenNameIdentifier	 dst SP
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcSP	TokenNameIdentifier	 src SP
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
dstSP	TokenNameIdentifier	 dst SP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This implements SRC_OVER for Int packed data where the src is * premultiplied. */	TokenNameCOMMENT_JAVADOC	 This implements SRC_OVER for Int packed data where the src is premultiplied. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OverCompositeContext_INT_PACK	TokenNameIdentifier	 Over Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
OverCompositeContext_INT_PACK	TokenNameIdentifier	 Over Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
dstInP	TokenNameIdentifier	 dst In P
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstInP	TokenNameIdentifier	 dst In P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstInP	TokenNameIdentifier	 dst In P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0x00FF0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstInP	TokenNameIdentifier	 dst In P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0x0000FF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstInP	TokenNameIdentifier	 dst In P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0x000000FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstInP	TokenNameIdentifier	 dst In P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This implements SRC_OVER for Int packed data and dest has no Alpha... */	TokenNameCOMMENT_JAVADOC	 This implements SRC_OVER for Int packed data and dest has no Alpha... 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OverCompositeContext_INT_PACK_NA	TokenNameIdentifier	 Over Composite Context  INT  PACK  NA
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
OverCompositeContext_INT_PACK_NA	TokenNameIdentifier	 Over Composite Context  INT  PACK  NA
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// When we get here src data has been premultiplied. 	TokenNameCOMMENT_LINE	When we get here src data has been premultiplied. 
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
dstInP	TokenNameIdentifier	 dst In P
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstInP	TokenNameIdentifier	 dst In P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0x00FF0000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstInP	TokenNameIdentifier	 dst In P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0x0000FF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstInP	TokenNameIdentifier	 dst In P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0x000000FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstInP	TokenNameIdentifier	 dst In P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This implements SRC_OVER for Int packed data where the src is * unpremultiplied. This avoids having to multiply the alpha on the * the source then divide it out again. */	TokenNameCOMMENT_JAVADOC	 This implements SRC_OVER for Int packed data where the src is unpremultiplied. This avoids having to multiply the alpha on the the source then divide it out again. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OverCompositeContext_INT_PACK_UNPRE	TokenNameIdentifier	 Over Composite Context  INT  PACK  UNPRE
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
OverCompositeContext_INT_PACK_UNPRE	TokenNameIdentifier	 Over Composite Context  INT  PACK  UNPRE
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"OverCompositeContext_INT_PACK_UNPRE is only for"	TokenNameStringLiteral	OverCompositeContext_INT_PACK_UNPRE is only for
+	TokenNamePLUS	
"sources with unpremultiplied alpha"	TokenNameStringLiteral	sources with unpremultiplied alpha
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
compose	TokenNameIdentifier	 compose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColorModel	TokenNameIdentifier	 Color Model
dstPreCM	TokenNameIdentifier	 dst Pre CM
=	TokenNameEQUAL	
dstCM	TokenNameIdentifier	 dst CM
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
dstPreCM	TokenNameIdentifier	 dst Pre CM
=	TokenNameEQUAL	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
)	TokenNameRPAREN	
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dstCM	TokenNameIdentifier	 dst CM
.	TokenNameDOT	
isAlphaPremultiplied	TokenNameIdentifier	 is Alpha Premultiplied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
dstOut	TokenNameIdentifier	 dst Out
,	TokenNameCOMMA	
dstPreCM	TokenNameIdentifier	 dst Pre CM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstIn	TokenNameIdentifier	 dst In
!=	TokenNameNOT_EQUAL	
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
GraphicsUtil	TokenNameIdentifier	 Graphics Util
.	TokenNameDOT	
coerceData	TokenNameIdentifier	 coerce Data
(	TokenNameLPAREN	
(	TokenNameLPAREN	
WritableRaster	TokenNameIdentifier	 Writable Raster
)	TokenNameRPAREN	
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
dstPreCM	TokenNameIdentifier	 dst Pre CM
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
,	TokenNameCOMMA	
dstP	TokenNameIdentifier	 dst P
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InCompositeContext	TokenNameIdentifier	 In Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
InCompositeContext	TokenNameIdentifier	 In Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
InCompositeContext_INT_PACK	TokenNameIdentifier	 In Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
InCompositeContext_INT_PACK	TokenNameIdentifier	 In Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OutCompositeContext	TokenNameIdentifier	 Out Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
OutCompositeContext	TokenNameIdentifier	 Out Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
OutCompositeContext_INT_PACK	TokenNameIdentifier	 Out Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
OutCompositeContext_INT_PACK	TokenNameIdentifier	 Out Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AtopCompositeContext	TokenNameIdentifier	 Atop Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
AtopCompositeContext	TokenNameIdentifier	 Atop Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AtopCompositeContext_INT_PACK	TokenNameIdentifier	 Atop Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
AtopCompositeContext_INT_PACK	TokenNameIdentifier	 Atop Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
,	TokenNameCOMMA	
dstP	TokenNameIdentifier	 dst P
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
XorCompositeContext	TokenNameIdentifier	 Xor Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
XorCompositeContext	TokenNameIdentifier	 Xor Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
XorCompositeContext_INT_PACK	TokenNameIdentifier	 Xor Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
XorCompositeContext_INT_PACK	TokenNameIdentifier	 Xor Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
,	TokenNameCOMMA	
dstP	TokenNameIdentifier	 dst P
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ArithCompositeContext	TokenNameIdentifier	 Arith Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
k4	TokenNameIdentifier	 k4
;	TokenNameSEMICOLON	
ArithCompositeContext	TokenNameIdentifier	 Arith Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
float	TokenNamefloat	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
float	TokenNamefloat	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
float	TokenNamefloat	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k3	TokenNameIdentifier	 k3
=	TokenNameEQUAL	
k3	TokenNameIdentifier	 k3
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k4	TokenNameIdentifier	 k4
=	TokenNameEQUAL	
k4	TokenNameIdentifier	 k4
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bands	TokenNameIdentifier	 bands
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getNumBands	TokenNameIdentifier	 get Num Bands
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
kk1	TokenNameIdentifier	 kk1
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
/	TokenNameDIVIDE	
255.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
kk4	TokenNameIdentifier	 kk4
=	TokenNameEQUAL	
k4	TokenNameIdentifier	 k4
*	TokenNameMULTIPLY	
255.0f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
srcPix	TokenNameIdentifier	 src Pix
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
bands	TokenNameIdentifier	 bands
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
kk1	TokenNameIdentifier	 kk1
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
k2	TokenNameIdentifier	 k2
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
k3	TokenNameIdentifier	 k3
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
kk4	TokenNameIdentifier	 kk4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
kk1	TokenNameIdentifier	 kk1
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
k2	TokenNameIdentifier	 k2
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
k3	TokenNameIdentifier	 k3
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
kk4	TokenNameIdentifier	 kk4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
else	TokenNameelse	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ArithCompositeContext_INT_PACK	TokenNameIdentifier	 Arith Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
k4	TokenNameIdentifier	 k4
;	TokenNameSEMICOLON	
ArithCompositeContext_INT_PACK	TokenNameIdentifier	 Arith Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
float	TokenNamefloat	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
float	TokenNamefloat	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
float	TokenNamefloat	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
/	TokenNameDIVIDE	
255.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k3	TokenNameIdentifier	 k3
=	TokenNameEQUAL	
k3	TokenNameIdentifier	 k3
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
k4	TokenNameIdentifier	 k4
=	TokenNameEQUAL	
k4	TokenNameIdentifier	 k4
*	TokenNameMULTIPLY	
255.0f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
dstP	TokenNameIdentifier	 dst P
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
g	TokenNameIdentifier	 g
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k3	TokenNameIdentifier	 k3
+	TokenNamePLUS	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k3	TokenNameIdentifier	 k3
+	TokenNamePLUS	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k3	TokenNameIdentifier	 k3
+	TokenNamePLUS	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k3	TokenNameIdentifier	 k3
+	TokenNamePLUS	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// long endTime = System.currentTimeMillis(); 	TokenNameCOMMENT_LINE	long endTime = System.currentTimeMillis(); 
// System.out.println("Arith Time: " + (endTime-startTime)); 	TokenNameCOMMENT_LINE	System.out.println("Arith Time: " + (endTime-startTime)); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ArithCompositeContext_INT_PACK_LUT	TokenNameIdentifier	 Arith Composite Context  INT  PACK  LUT
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lut	TokenNameIdentifier	 lut
;	TokenNameSEMICOLON	
ArithCompositeContext_INT_PACK_LUT	TokenNameIdentifier	 Arith Composite Context  INT  PACK  LUT
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
,	TokenNameCOMMA	
float	TokenNamefloat	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
float	TokenNamefloat	
k2	TokenNameIdentifier	 k2
,	TokenNameCOMMA	
float	TokenNamefloat	
k3	TokenNameIdentifier	 k3
,	TokenNameCOMMA	
float	TokenNamefloat	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k1	TokenNameIdentifier	 k1
/	TokenNameDIVIDE	
255.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
k4	TokenNameIdentifier	 k4
=	TokenNameEQUAL	
k4	TokenNameIdentifier	 k4
*	TokenNameMULTIPLY	
255.0f	TokenNameFloatingPointLiteral	
+	TokenNamePLUS	
0.5f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lut	TokenNameIdentifier	 lut
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
sz	TokenNameIdentifier	 sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
val	TokenNameIdentifier	 val
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
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k1	TokenNameIdentifier	 k1
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
k3	TokenNameIdentifier	 k3
+	TokenNamePLUS	
k4	TokenNameIdentifier	 k4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0xFFFFFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
0x80000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lut	TokenNameIdentifier	 lut
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
workTbl	TokenNameIdentifier	 work Tbl
=	TokenNameEQUAL	
lut	TokenNameIdentifier	 lut
;	TokenNameSEMICOLON	
// local is cheaper 	TokenNameCOMMENT_LINE	local is cheaper 
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
dstP	TokenNameIdentifier	 dst P
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
&	TokenNameAND	
workTbl	TokenNameIdentifier	 work Tbl
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
&	TokenNameAND	
workTbl	TokenNameIdentifier	 work Tbl
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
&	TokenNameAND	
workTbl	TokenNameIdentifier	 work Tbl
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
0xFF	TokenNameIntegerLiteral	
&	TokenNameAND	
workTbl	TokenNameIdentifier	 work Tbl
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
)	TokenNameRPAREN	
&	TokenNameAND	
0x00FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
g	TokenNameIdentifier	 g
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
>	TokenNameGREATER	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
g	TokenNameIdentifier	 g
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// long endTime = System.currentTimeMillis(); 	TokenNameCOMMENT_LINE	long endTime = System.currentTimeMillis(); 
// System.out.println("ArithLut Time: " + (endTime-startTime)); 	TokenNameCOMMENT_LINE	System.out.println("ArithLut Time: " + (endTime-startTime)); 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The following classes implement the various blend modes from SVG. */	TokenNameCOMMENT_JAVADOC	 The following classes implement the various blend modes from SVG. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MultiplyCompositeContext	TokenNameIdentifier	 Multiply Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
MultiplyCompositeContext	TokenNameIdentifier	 Multiply Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcM	TokenNameIdentifier	 src M
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MultiplyCompositeContext_INT_PACK	TokenNameIdentifier	 Multiply Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
MultiplyCompositeContext_INT_PACK	TokenNameIdentifier	 Multiply Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcA	TokenNameIdentifier	 src A
,	TokenNameCOMMA	
srcR	TokenNameIdentifier	 src R
,	TokenNameCOMMA	
srcG	TokenNameIdentifier	 src G
,	TokenNameCOMMA	
srcB	TokenNameIdentifier	 src B
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
;	TokenNameSEMICOLON	
int	TokenNameint	
dstP	TokenNameIdentifier	 dst P
,	TokenNameCOMMA	
dstA	TokenNameIdentifier	 dst A
,	TokenNameCOMMA	
dstR	TokenNameIdentifier	 dst R
,	TokenNameCOMMA	
dstG	TokenNameIdentifier	 dst G
,	TokenNameCOMMA	
dstB	TokenNameIdentifier	 dst B
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
srcA	TokenNameIdentifier	 src A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstA	TokenNameIdentifier	 dst A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcR	TokenNameIdentifier	 src R
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstR	TokenNameIdentifier	 dst R
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
srcG	TokenNameIdentifier	 src G
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstG	TokenNameIdentifier	 dst G
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
srcB	TokenNameIdentifier	 src B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstB	TokenNameIdentifier	 dst B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
dstA	TokenNameIdentifier	 dst A
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcA	TokenNameIdentifier	 src A
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstR	TokenNameIdentifier	 dst R
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
srcR	TokenNameIdentifier	 src R
*	TokenNameMULTIPLY	
dstR	TokenNameIdentifier	 dst R
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcG	TokenNameIdentifier	 src G
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstG	TokenNameIdentifier	 dst G
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
srcG	TokenNameIdentifier	 src G
*	TokenNameMULTIPLY	
dstG	TokenNameIdentifier	 dst G
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcB	TokenNameIdentifier	 src B
*	TokenNameMULTIPLY	
srcM	TokenNameIdentifier	 src M
+	TokenNamePLUS	
dstB	TokenNameIdentifier	 dst B
*	TokenNameMULTIPLY	
dstM	TokenNameIdentifier	 dst M
+	TokenNamePLUS	
srcB	TokenNameIdentifier	 src B
*	TokenNameMULTIPLY	
dstB	TokenNameIdentifier	 dst B
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcA	TokenNameIdentifier	 src A
+	TokenNamePLUS	
dstA	TokenNameIdentifier	 dst A
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcA	TokenNameIdentifier	 src A
*	TokenNameMULTIPLY	
dstA	TokenNameIdentifier	 dst A
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ScreenCompositeContext	TokenNameIdentifier	 Screen Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
ScreenCompositeContext	TokenNameIdentifier	 Screen Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
iSrcPix	TokenNameIdentifier	 i Src Pix
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
iDstPix	TokenNameIdentifier	 i Dst Pix
=	TokenNameEQUAL	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
iSrcPix	TokenNameIdentifier	 i Src Pix
+	TokenNamePLUS	
iDstPix	TokenNameIdentifier	 i Dst Pix
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
iDstPix	TokenNameIdentifier	 i Dst Pix
*	TokenNameMULTIPLY	
iSrcPix	TokenNameIdentifier	 i Src Pix
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
iSrcPix	TokenNameIdentifier	 i Src Pix
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
iDstPix	TokenNameIdentifier	 i Dst Pix
=	TokenNameEQUAL	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
iSrcPix	TokenNameIdentifier	 i Src Pix
+	TokenNamePLUS	
iDstPix	TokenNameIdentifier	 i Dst Pix
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
iDstPix	TokenNameIdentifier	 i Dst Pix
*	TokenNameMULTIPLY	
iSrcPix	TokenNameIdentifier	 i Src Pix
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
iSrcPix	TokenNameIdentifier	 i Src Pix
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
iDstPix	TokenNameIdentifier	 i Dst Pix
=	TokenNameEQUAL	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
iSrcPix	TokenNameIdentifier	 i Src Pix
+	TokenNamePLUS	
iDstPix	TokenNameIdentifier	 i Dst Pix
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
iDstPix	TokenNameIdentifier	 i Dst Pix
*	TokenNameMULTIPLY	
iSrcPix	TokenNameIdentifier	 i Src Pix
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
iSrcPix	TokenNameIdentifier	 i Src Pix
=	TokenNameEQUAL	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
iDstPix	TokenNameIdentifier	 i Dst Pix
=	TokenNameEQUAL	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
iSrcPix	TokenNameIdentifier	 i Src Pix
+	TokenNamePLUS	
iDstPix	TokenNameIdentifier	 i Dst Pix
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
iDstPix	TokenNameIdentifier	 i Dst Pix
*	TokenNameMULTIPLY	
iSrcPix	TokenNameIdentifier	 i Src Pix
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ScreenCompositeContext_INT_PACK	TokenNameIdentifier	 Screen Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
ScreenCompositeContext_INT_PACK	TokenNameIdentifier	 Screen Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcA	TokenNameIdentifier	 src A
,	TokenNameCOMMA	
srcR	TokenNameIdentifier	 src R
,	TokenNameCOMMA	
srcG	TokenNameIdentifier	 src G
,	TokenNameCOMMA	
srcB	TokenNameIdentifier	 src B
;	TokenNameSEMICOLON	
int	TokenNameint	
dstP	TokenNameIdentifier	 dst P
,	TokenNameCOMMA	
dstA	TokenNameIdentifier	 dst A
,	TokenNameCOMMA	
dstR	TokenNameIdentifier	 dst R
,	TokenNameCOMMA	
dstG	TokenNameIdentifier	 dst G
,	TokenNameCOMMA	
dstB	TokenNameIdentifier	 dst B
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
srcA	TokenNameIdentifier	 src A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstA	TokenNameIdentifier	 dst A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcR	TokenNameIdentifier	 src R
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstR	TokenNameIdentifier	 dst R
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
srcG	TokenNameIdentifier	 src G
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstG	TokenNameIdentifier	 dst G
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
srcB	TokenNameIdentifier	 src B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstB	TokenNameIdentifier	 dst B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
+	TokenNamePLUS	
dstR	TokenNameIdentifier	 dst R
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcR	TokenNameIdentifier	 src R
*	TokenNameMULTIPLY	
dstR	TokenNameIdentifier	 dst R
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcG	TokenNameIdentifier	 src G
+	TokenNamePLUS	
dstG	TokenNameIdentifier	 dst G
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcG	TokenNameIdentifier	 src G
*	TokenNameMULTIPLY	
dstG	TokenNameIdentifier	 dst G
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcB	TokenNameIdentifier	 src B
+	TokenNamePLUS	
dstB	TokenNameIdentifier	 dst B
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcB	TokenNameIdentifier	 src B
*	TokenNameMULTIPLY	
dstB	TokenNameIdentifier	 dst B
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcA	TokenNameIdentifier	 src A
+	TokenNamePLUS	
dstA	TokenNameIdentifier	 dst A
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcA	TokenNameIdentifier	 src A
*	TokenNameMULTIPLY	
dstA	TokenNameIdentifier	 dst A
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DarkenCompositeContext	TokenNameIdentifier	 Darken Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
DarkenCompositeContext	TokenNameIdentifier	 Darken Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
else	TokenNameelse	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
else	TokenNameelse	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
else	TokenNameelse	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
DarkenCompositeContext_INT_PACK	TokenNameIdentifier	 Darken Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
DarkenCompositeContext_INT_PACK	TokenNameIdentifier	 Darken Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
;	TokenNameSEMICOLON	
int	TokenNameint	
dstP	TokenNameIdentifier	 dst P
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
,	TokenNameCOMMA	
dstA	TokenNameIdentifier	 dst A
,	TokenNameCOMMA	
dstR	TokenNameIdentifier	 dst R
,	TokenNameCOMMA	
dstG	TokenNameIdentifier	 dst G
,	TokenNameCOMMA	
dstB	TokenNameIdentifier	 dst B
;	TokenNameSEMICOLON	
int	TokenNameint	
srcV	TokenNameIdentifier	 src V
,	TokenNameCOMMA	
dstV	TokenNameIdentifier	 dst V
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
srcV	TokenNameIdentifier	 src V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstV	TokenNameIdentifier	 dst V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
dstV	TokenNameIdentifier	 dst V
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcV	TokenNameIdentifier	 src V
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstA	TokenNameIdentifier	 dst A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcV	TokenNameIdentifier	 src V
+	TokenNamePLUS	
dstV	TokenNameIdentifier	 dst V
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcV	TokenNameIdentifier	 src V
*	TokenNameMULTIPLY	
dstV	TokenNameIdentifier	 dst V
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcV	TokenNameIdentifier	 src V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstV	TokenNameIdentifier	 dst V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstR	TokenNameIdentifier	 dst R
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcV	TokenNameIdentifier	 src V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstV	TokenNameIdentifier	 dst V
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstV	TokenNameIdentifier	 dst V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcV	TokenNameIdentifier	 src V
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstR	TokenNameIdentifier	 dst R
>	TokenNameGREATER	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
dstR	TokenNameIdentifier	 dst R
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
srcV	TokenNameIdentifier	 src V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstV	TokenNameIdentifier	 dst V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstG	TokenNameIdentifier	 dst G
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcV	TokenNameIdentifier	 src V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstV	TokenNameIdentifier	 dst V
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstV	TokenNameIdentifier	 dst V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcV	TokenNameIdentifier	 src V
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstG	TokenNameIdentifier	 dst G
>	TokenNameGREATER	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
dstG	TokenNameIdentifier	 dst G
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
srcV	TokenNameIdentifier	 src V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstV	TokenNameIdentifier	 dst V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstB	TokenNameIdentifier	 dst B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcV	TokenNameIdentifier	 src V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstV	TokenNameIdentifier	 dst V
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstV	TokenNameIdentifier	 dst V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcV	TokenNameIdentifier	 src V
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstB	TokenNameIdentifier	 dst B
>	TokenNameGREATER	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
dstB	TokenNameIdentifier	 dst B
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
dstA	TokenNameIdentifier	 dst A
&=	TokenNameAND_EQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// trim to 8 bit 	TokenNameCOMMENT_LINE	trim to 8 bit 
dstR	TokenNameIdentifier	 dst R
&=	TokenNameAND_EQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstG	TokenNameIdentifier	 dst G
&=	TokenNameAND_EQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstB	TokenNameIdentifier	 dst B
&=	TokenNameAND_EQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstA	TokenNameIdentifier	 dst A
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
dstR	TokenNameIdentifier	 dst R
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
dstG	TokenNameIdentifier	 dst G
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
dstB	TokenNameIdentifier	 dst B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
LightenCompositeContext	TokenNameIdentifier	 Lighten Composite Context
extends	TokenNameextends	
AlphaPreCompositeContext	TokenNameIdentifier	 Alpha Pre Composite Context
{	TokenNameLBRACE	
LightenCompositeContext	TokenNameIdentifier	 Lighten Composite Context
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose	TokenNameIdentifier	 precompose
(	TokenNameLPAREN	
Raster	TokenNameIdentifier	 Raster
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
Raster	TokenNameIdentifier	 Raster
dstIn	TokenNameIdentifier	 dst In
,	TokenNameCOMMA	
WritableRaster	TokenNameIdentifier	 Writable Raster
dstOut	TokenNameIdentifier	 dst Out
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinX	TokenNameIdentifier	 get Min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getWidth	TokenNameIdentifier	 get Width
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getMinY	TokenNameIdentifier	 get Min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
+	TokenNamePLUS	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
sp	TokenNameIdentifier	 sp
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcPix	TokenNameIdentifier	 src Pix
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
srcPix	TokenNameIdentifier	 src Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
=	TokenNameEQUAL	
dstIn	TokenNameIdentifier	 dst In
.	TokenNameDOT	
getPixels	TokenNameIdentifier	 get Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sp	TokenNameIdentifier	 sp
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
sp	TokenNameIdentifier	 sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
else	TokenNameelse	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
else	TokenNameelse	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
else	TokenNameelse	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t2	TokenNameIdentifier	 t2
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
+	TokenNamePLUS	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstPix	TokenNameIdentifier	 dst Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
srcPix	TokenNameIdentifier	 src Pix
[	TokenNameLBRACKET	
sp	TokenNameIdentifier	 sp
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
sp	TokenNameIdentifier	 sp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstOut	TokenNameIdentifier	 dst Out
.	TokenNameDOT	
setPixels	TokenNameIdentifier	 set Pixels
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dstPix	TokenNameIdentifier	 dst Pix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
LightenCompositeContext_INT_PACK	TokenNameIdentifier	 Lighten Composite Context  INT  PACK
extends	TokenNameextends	
AlphaPreCompositeContext_INT_PACK	TokenNameIdentifier	 Alpha Pre Composite Context  INT  PACK
{	TokenNameLBRACE	
LightenCompositeContext_INT_PACK	TokenNameIdentifier	 Lighten Composite Context  INT  PACK
(	TokenNameLPAREN	
ColorModel	TokenNameIdentifier	 Color Model
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
ColorModel	TokenNameIdentifier	 Color Model
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
srcCM	TokenNameIdentifier	 src CM
,	TokenNameCOMMA	
dstCM	TokenNameIdentifier	 dst CM
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
precompose_INT_PACK	TokenNameIdentifier	 precompose  INT  PACK
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcPixels	TokenNameIdentifier	 src Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
srcAdjust	TokenNameIdentifier	 src Adjust
,	TokenNameCOMMA	
int	TokenNameint	
srcSp	TokenNameIdentifier	 src Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstInPixels	TokenNameIdentifier	 dst In Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstInSp	TokenNameIdentifier	 dst In Sp
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
,	TokenNameCOMMA	
int	TokenNameint	
dstOutSp	TokenNameIdentifier	 dst Out Sp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
norm	TokenNameIdentifier	 norm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
255	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
pt5	TokenNameIdentifier	 pt5
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
srcP	TokenNameIdentifier	 src P
,	TokenNameCOMMA	
srcM	TokenNameIdentifier	 src M
;	TokenNameSEMICOLON	
int	TokenNameint	
dstP	TokenNameIdentifier	 dst P
,	TokenNameCOMMA	
dstM	TokenNameIdentifier	 dst M
,	TokenNameCOMMA	
dstA	TokenNameIdentifier	 dst A
,	TokenNameCOMMA	
dstR	TokenNameIdentifier	 dst R
,	TokenNameCOMMA	
dstG	TokenNameIdentifier	 dst G
,	TokenNameCOMMA	
dstB	TokenNameIdentifier	 dst B
;	TokenNameSEMICOLON	
int	TokenNameint	
srcV	TokenNameIdentifier	 src V
,	TokenNameCOMMA	
dstV	TokenNameIdentifier	 dst V
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
y	TokenNameIdentifier	 y
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+	TokenNamePLUS	
width	TokenNameIdentifier	 width
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstOutSp	TokenNameIdentifier	 dst Out Sp
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
srcP	TokenNameIdentifier	 src P
=	TokenNameEQUAL	
srcPixels	TokenNameIdentifier	 src Pixels
[	TokenNameLBRACKET	
srcSp	TokenNameIdentifier	 src Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dstP	TokenNameIdentifier	 dst P
=	TokenNameEQUAL	
dstInPixels	TokenNameIdentifier	 dst In Pixels
[	TokenNameLBRACKET	
dstInSp	TokenNameIdentifier	 dst In Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
srcV	TokenNameIdentifier	 src V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dstV	TokenNameIdentifier	 dst V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcM	TokenNameIdentifier	 src M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
dstV	TokenNameIdentifier	 dst V
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstM	TokenNameIdentifier	 dst M
=	TokenNameEQUAL	
(	TokenNameLPAREN	
255	TokenNameIntegerLiteral	
-	TokenNameMINUS	
srcV	TokenNameIdentifier	 src V
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
;	TokenNameSEMICOLON	
dstA	TokenNameIdentifier	 dst A
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcV	TokenNameIdentifier	 src V
+	TokenNamePLUS	
dstV	TokenNameIdentifier	 dst V
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcV	TokenNameIdentifier	 src V
*	TokenNameMULTIPLY	
dstV	TokenNameIdentifier	 dst V
*	TokenNameMULTIPLY	
norm	TokenNameIdentifier	 norm
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
srcV	TokenNameIdentifier	 src V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstV	TokenNameIdentifier	 dst V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstR	TokenNameIdentifier	 dst R
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcV	TokenNameIdentifier	 src V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstV	TokenNameIdentifier	 dst V
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstV	TokenNameIdentifier	 dst V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcV	TokenNameIdentifier	 src V
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstR	TokenNameIdentifier	 dst R
<	TokenNameLESS	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
dstR	TokenNameIdentifier	 dst R
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
srcV	TokenNameIdentifier	 src V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstV	TokenNameIdentifier	 dst V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
>>	TokenNameRIGHT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstG	TokenNameIdentifier	 dst G
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcV	TokenNameIdentifier	 src V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstV	TokenNameIdentifier	 dst V
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstV	TokenNameIdentifier	 dst V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcV	TokenNameIdentifier	 src V
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstG	TokenNameIdentifier	 dst G
<	TokenNameLESS	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
dstG	TokenNameIdentifier	 dst G
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
srcV	TokenNameIdentifier	 src V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
srcP	TokenNameIdentifier	 src P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstV	TokenNameIdentifier	 dst V
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dstP	TokenNameIdentifier	 dst P
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstB	TokenNameIdentifier	 dst B
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
srcM	TokenNameIdentifier	 src M
*	TokenNameMULTIPLY	
srcV	TokenNameIdentifier	 src V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
dstV	TokenNameIdentifier	 dst V
;	TokenNameSEMICOLON	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstM	TokenNameIdentifier	 dst M
*	TokenNameMULTIPLY	
dstV	TokenNameIdentifier	 dst V
+	TokenNamePLUS	
pt5	TokenNameIdentifier	 pt5
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
srcV	TokenNameIdentifier	 src V
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dstB	TokenNameIdentifier	 dst B
<	TokenNameLESS	
tmp	TokenNameIdentifier	 tmp
)	TokenNameRPAREN	
dstB	TokenNameIdentifier	 dst B
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
dstA	TokenNameIdentifier	 dst A
&=	TokenNameAND_EQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// trim to 8 bit 	TokenNameCOMMENT_LINE	trim to 8 bit 
dstR	TokenNameIdentifier	 dst R
&=	TokenNameAND_EQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstG	TokenNameIdentifier	 dst G
&=	TokenNameAND_EQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstB	TokenNameIdentifier	 dst B
&=	TokenNameAND_EQUAL	
0xFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dstOutPixels	TokenNameIdentifier	 dst Out Pixels
[	TokenNameLBRACKET	
dstOutSp	TokenNameIdentifier	 dst Out Sp
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
dstA	TokenNameIdentifier	 dst A
<<	TokenNameLEFT_SHIFT	
24	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
dstR	TokenNameIdentifier	 dst R
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
(	TokenNameLPAREN	
dstG	TokenNameIdentifier	 dst G
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
dstB	TokenNameIdentifier	 dst B
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
srcSp	TokenNameIdentifier	 src Sp
+=	TokenNamePLUS_EQUAL	
srcAdjust	TokenNameIdentifier	 src Adjust
;	TokenNameSEMICOLON	
dstInSp	TokenNameIdentifier	 dst In Sp
+=	TokenNamePLUS_EQUAL	
dstInAdjust	TokenNameIdentifier	 dst In Adjust
;	TokenNameSEMICOLON	
dstOutSp	TokenNameIdentifier	 dst Out Sp
+=	TokenNamePLUS_EQUAL	
dstOutAdjust	TokenNameIdentifier	 dst Out Adjust
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
