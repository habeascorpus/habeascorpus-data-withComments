/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
svggen	TokenNameIdentifier	 svggen
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * Glyph description for composite glyphs. Composite glyphs are made up of one * or more simple glyphs, usually with some sort of transformation applied to * each. * * @version $Id: GlyfCompositeDescript.java 475477 2006-11-15 22:44:28Z cam $ * @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> */	TokenNameCOMMENT_JAVADOC	 Glyph description for composite glyphs. Composite glyphs are made up of one or more simple glyphs, usually with some sort of transformation applied to each. * @version $Id: GlyfCompositeDescript.java 475477 2006-11-15 22:44:28Z cam $ @author <a href="mailto:david@steadystate.co.uk">David Schweinsberg</a> 
public	TokenNamepublic	
class	TokenNameclass	
GlyfCompositeDescript	TokenNameIdentifier	 Glyf Composite Descript
extends	TokenNameextends	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
components	TokenNameIdentifier	 components
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
beingResolved	TokenNameIdentifier	 being Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GlyfCompositeDescript	TokenNameIdentifier	 Glyf Composite Descript
(	TokenNameLPAREN	
GlyfTable	TokenNameIdentifier	 Glyf Table
parentTable	TokenNameIdentifier	 parent Table
,	TokenNameCOMMA	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
parentTable	TokenNameIdentifier	 parent Table
,	TokenNameCOMMA	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get all of the composite components 	TokenNameCOMMENT_LINE	Get all of the composite components 
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
comp	TokenNameIdentifier	 comp
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
new	TokenNamenew	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
.	TokenNameDOT	
MORE_COMPONENTS	TokenNameIdentifier	 MORE  COMPONENTS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Are there hinting intructions to read? 	TokenNameCOMMENT_LINE	Are there hinting intructions to read? 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
.	TokenNameDOT	
WE_HAVE_INSTRUCTIONS	TokenNameIdentifier	 WE  HAVE  INSTRUCTIONS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
readInstructions	TokenNameIdentifier	 read Instructions
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
,	TokenNameCOMMA	
(	TokenNameLPAREN	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
8	TokenNameIntegerLiteral	
|	TokenNameOR	
bais	TokenNameIdentifier	 bais
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
beingResolved	TokenNameIdentifier	 being Resolved
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Circular reference in GlyfCompositeDesc"	TokenNameStringLiteral	Circular reference in GlyfCompositeDesc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
beingResolved	TokenNameIdentifier	 being Resolved
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstIndex	TokenNameIdentifier	 first Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
firstContour	TokenNameIdentifier	 first Contour
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
setFirstIndex	TokenNameIdentifier	 set First Index
(	TokenNameLPAREN	
firstIndex	TokenNameIdentifier	 first Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
setFirstContour	TokenNameIdentifier	 set First Contour
(	TokenNameLPAREN	
firstContour	TokenNameIdentifier	 first Contour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyfDescript	TokenNameIdentifier	 Glyf Descript
desc	TokenNameIdentifier	 desc
;	TokenNameSEMICOLON	
desc	TokenNameIdentifier	 desc
=	TokenNameEQUAL	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
desc	TokenNameIdentifier	 desc
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
resolve	TokenNameIdentifier	 resolve
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstIndex	TokenNameIdentifier	 first Index
+=	TokenNamePLUS_EQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstContour	TokenNameIdentifier	 first Contour
+=	TokenNamePLUS_EQUAL	
desc	TokenNameIdentifier	 desc
.	TokenNameDOT	
getContourCount	TokenNameIdentifier	 get Contour Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
resolved	TokenNameIdentifier	 resolved
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
beingResolved	TokenNameIdentifier	 being Resolved
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getEndPtOfContours	TokenNameIdentifier	 get End Pt Of Contours
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getCompositeCompEndPt	TokenNameIdentifier	 get Composite Comp End Pt
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyphDescription	TokenNameIdentifier	 Glyph Description
gd	TokenNameIdentifier	 gd
=	TokenNameEQUAL	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getEndPtOfContours	TokenNameIdentifier	 get End Pt Of Contours
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstContour	TokenNameIdentifier	 get First Contour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getCompositeComp	TokenNameIdentifier	 get Composite Comp
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyphDescription	TokenNameIdentifier	 Glyph Description
gd	TokenNameIdentifier	 gd
=	TokenNameEQUAL	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getXCoordinate	TokenNameIdentifier	 get X Coordinate
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getCompositeComp	TokenNameIdentifier	 get Composite Comp
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyphDescription	TokenNameIdentifier	 Glyph Description
gd	TokenNameIdentifier	 gd
=	TokenNameEQUAL	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getXCoordinate	TokenNameIdentifier	 get X Coordinate
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getYCoordinate	TokenNameIdentifier	 get Y Coordinate
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
scaleX	TokenNameIdentifier	 scale X
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
x1	TokenNameIdentifier	 x1
+=	TokenNamePLUS_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getXTranslate	TokenNameIdentifier	 get X Translate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
x1	TokenNameIdentifier	 x1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
short	TokenNameshort	
getYCoordinate	TokenNameIdentifier	 get Y Coordinate
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
getCompositeComp	TokenNameIdentifier	 get Composite Comp
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyphDescription	TokenNameIdentifier	 Glyph Description
gd	TokenNameIdentifier	 gd
=	TokenNameEQUAL	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getXCoordinate	TokenNameIdentifier	 get X Coordinate
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getYCoordinate	TokenNameIdentifier	 get Y Coordinate
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
short	TokenNameshort	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
scaleY	TokenNameIdentifier	 scale Y
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
+=	TokenNamePLUS_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getYTranslate	TokenNameIdentifier	 get Y Translate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isComposite	TokenNameIdentifier	 is Composite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"getPointCount called on unresolved GlyfCompositeDescript"	TokenNameStringLiteral	getPointCount called on unresolved GlyfCompositeDescript
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
)	TokenNameRPAREN	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("C: " + c + " Idx: " + c.getGlyphIndex()); 	TokenNameCOMMENT_LINE	System.err.println("C: " + c + " Idx: " + c.getGlyphIndex()); 
// System.err.println("Ptbl: " + parentTable); 	TokenNameCOMMENT_LINE	System.err.println("Ptbl: " + parentTable); 
return	TokenNamereturn	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getContourCount	TokenNameIdentifier	 get Contour Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
resolved	TokenNameIdentifier	 resolved
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"getContourCount called on unresolved GlyfCompositeDescript"	TokenNameStringLiteral	getContourCount called on unresolved GlyfCompositeDescript
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
)	TokenNameRPAREN	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstContour	TokenNameIdentifier	 get First Contour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getContourCount	TokenNameIdentifier	 get Contour Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getComponentIndex	TokenNameIdentifier	 get Component Index
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
)	TokenNameRPAREN	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getComponentCount	TokenNameIdentifier	 get Component Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
getCompositeComp	TokenNameIdentifier	 get Composite Comp
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
)	TokenNameRPAREN	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyphDescription	TokenNameIdentifier	 Glyph Description
gd	TokenNameIdentifier	 gd
=	TokenNameEQUAL	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstIndex	TokenNameIdentifier	 get First Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getPointCount	TokenNameIdentifier	 get Point Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
getCompositeCompEndPt	TokenNameIdentifier	 get Composite Comp End Pt
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
GlyfCompositeComp	TokenNameIdentifier	 Glyf Composite Comp
)	TokenNameRPAREN	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
GlyphDescription	TokenNameIdentifier	 Glyph Description
gd	TokenNameIdentifier	 gd
=	TokenNameEQUAL	
parentTable	TokenNameIdentifier	 parent Table
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getGlyphIndex	TokenNameIdentifier	 get Glyph Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstContour	TokenNameIdentifier	 get First Contour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
i	TokenNameIdentifier	 i
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getFirstContour	TokenNameIdentifier	 get First Contour
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
gd	TokenNameIdentifier	 gd
.	TokenNameDOT	
getContourCount	TokenNameIdentifier	 get Contour Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
