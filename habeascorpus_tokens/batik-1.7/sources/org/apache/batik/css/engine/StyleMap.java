/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
css	TokenNameIdentifier	 css
.	TokenNameDOT	
engine	TokenNameIdentifier	 engine
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
Value	TokenNameIdentifier	 Value
;	TokenNameSEMICOLON	
/** * This class represents objects which contains property/value mappings. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: StyleMap.java 498515 2007-01-22 03:19:02Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents objects which contains property/value mappings. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: StyleMap.java 498515 2007-01-22 03:19:02Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
StyleMap	TokenNameIdentifier	 Style Map
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// The masks, still have 2 free bits: 0x0800, & 0x1000, could also 	TokenNameCOMMENT_LINE	The masks, still have 2 free bits: 0x0800, & 0x1000, could also 
// go to int if needed. 	TokenNameCOMMENT_LINE	go to int if needed. 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
IMPORTANT_MASK	TokenNameIdentifier	 IMPORTANT  MASK
=	TokenNameEQUAL	
0x0001	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
COMPUTED_MASK	TokenNameIdentifier	 COMPUTED  MASK
=	TokenNameEQUAL	
0x0002	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NULL_CASCADED_MASK	TokenNameIdentifier	 NULL  CASCADED  MASK
=	TokenNameEQUAL	
0x0004	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INHERITED_MASK	TokenNameIdentifier	 INHERITED  MASK
=	TokenNameEQUAL	
0x0008	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
LINE_HEIGHT_RELATIVE_MASK	TokenNameIdentifier	 LINE  HEIGHT  RELATIVE  MASK
=	TokenNameEQUAL	
0x0010	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
FONT_SIZE_RELATIVE_MASK	TokenNameIdentifier	 FONT  SIZE  RELATIVE  MASK
=	TokenNameEQUAL	
0x0020	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
COLOR_RELATIVE_MASK	TokenNameIdentifier	 COLOR  RELATIVE  MASK
=	TokenNameEQUAL	
0x0040	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
PARENT_RELATIVE_MASK	TokenNameIdentifier	 PARENT  RELATIVE  MASK
=	TokenNameEQUAL	
0x0080	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
BLOCK_WIDTH_RELATIVE_MASK	TokenNameIdentifier	 BLOCK  WIDTH  RELATIVE  MASK
=	TokenNameEQUAL	
0x0100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
BLOCK_HEIGHT_RELATIVE_MASK	TokenNameIdentifier	 BLOCK  HEIGHT  RELATIVE  MASK
=	TokenNameEQUAL	
0x0200	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
BOX_RELATIVE_MASK	TokenNameIdentifier	 BOX  RELATIVE  MASK
=	TokenNameEQUAL	
0x0400	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
ORIGIN_MASK	TokenNameIdentifier	 ORIGIN  MASK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0xE000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 3 last bits 	TokenNameCOMMENT_LINE	3 last bits 
// 	TokenNameCOMMENT_LINE	 
// The origin values. 	TokenNameCOMMENT_LINE	The origin values. 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
USER_AGENT_ORIGIN	TokenNameIdentifier	 USER  AGENT  ORIGIN
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
USER_ORIGIN	TokenNameIdentifier	 USER  ORIGIN
=	TokenNameEQUAL	
0x2000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 0010 	TokenNameCOMMENT_LINE	0010 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
NON_CSS_ORIGIN	TokenNameIdentifier	 NON  CSS  ORIGIN
=	TokenNameEQUAL	
0x4000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 0100 	TokenNameCOMMENT_LINE	0100 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
AUTHOR_ORIGIN	TokenNameIdentifier	 AUTHOR  ORIGIN
=	TokenNameEQUAL	
0x6000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 0110 	TokenNameCOMMENT_LINE	0110 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
INLINE_AUTHOR_ORIGIN	TokenNameIdentifier	 INLINE  AUTHOR  ORIGIN
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0x8000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1000 	TokenNameCOMMENT_LINE	1000 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
short	TokenNameshort	
OVERRIDE_ORIGIN	TokenNameIdentifier	 OVERRIDE  ORIGIN
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
0xA000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1010 	TokenNameCOMMENT_LINE	1010 
/** * The values. */	TokenNameCOMMENT_JAVADOC	 The values. 
protected	TokenNameprotected	
Value	TokenNameIdentifier	 Value
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
/** * To store the value masks. */	TokenNameCOMMENT_JAVADOC	 To store the value masks. 
protected	TokenNameprotected	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
masks	TokenNameIdentifier	 masks
;	TokenNameSEMICOLON	
/** * Whether the values of this map cannot be re-cascaded. */	TokenNameCOMMENT_JAVADOC	 Whether the values of this map cannot be re-cascaded. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fixedCascadedValues	TokenNameIdentifier	 fixed Cascaded Values
;	TokenNameSEMICOLON	
/** * Creates a new StyleMap. */	TokenNameCOMMENT_JAVADOC	 Creates a new StyleMap. 
public	TokenNamepublic	
StyleMap	TokenNameIdentifier	 Style Map
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
Value	TokenNameIdentifier	 Value
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether this map has fixed cascaded value. */	TokenNameCOMMENT_JAVADOC	 Whether this map has fixed cascaded value. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasFixedCascadedValues	TokenNameIdentifier	 has Fixed Cascaded Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fixedCascadedValues	TokenNameIdentifier	 fixed Cascaded Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the fixedCascadedValues property. */	TokenNameCOMMENT_JAVADOC	 Sets the fixedCascadedValues property. 
public	TokenNamepublic	
void	TokenNamevoid	
setFixedCascadedStyle	TokenNameIdentifier	 set Fixed Cascaded Style
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fixedCascadedValues	TokenNameIdentifier	 fixed Cascaded Values
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value at the given index, null if unspecified. */	TokenNameCOMMENT_JAVADOC	 Returns the value at the given index, null if unspecified. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the mask of the given property value. */	TokenNameCOMMENT_JAVADOC	 Returns the mask of the given property value. 
public	TokenNamepublic	
short	TokenNameshort	
getMask	TokenNameIdentifier	 get Mask
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given property value is important. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given property value is important. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isImportant	TokenNameIdentifier	 is Important
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
IMPORTANT_MASK	TokenNameIdentifier	 IMPORTANT  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given property value is computed. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given property value is computed. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isComputed	TokenNameIdentifier	 is Computed
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
COMPUTED_MASK	TokenNameIdentifier	 COMPUTED  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given cascaded property value is null. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given cascaded property value is null. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNullCascaded	TokenNameIdentifier	 is Null Cascaded
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
NULL_CASCADED_MASK	TokenNameIdentifier	 NULL  CASCADED  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given cascaded property value was * inherited from it's parent or set locally. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given cascaded property value was inherited from it's parent or set locally. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isInherited	TokenNameIdentifier	 is Inherited
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
INHERITED_MASK	TokenNameIdentifier	 INHERITED  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the origin value. */	TokenNameCOMMENT_JAVADOC	 Returns the origin value. 
public	TokenNamepublic	
short	TokenNameshort	
getOrigin	TokenNameIdentifier	 get Origin
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
ORIGIN_MASK	TokenNameIdentifier	 ORIGIN  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given property value is relative to 'color'. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given property value is relative to 'color'. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isColorRelative	TokenNameIdentifier	 is Color Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
COLOR_RELATIVE_MASK	TokenNameIdentifier	 COLOR  RELATIVE  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given property value is relative to the parent's * property value. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given property value is relative to the parent's property value. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isParentRelative	TokenNameIdentifier	 is Parent Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
PARENT_RELATIVE_MASK	TokenNameIdentifier	 PARENT  RELATIVE  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given property value is relative to 'line-height'. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given property value is relative to 'line-height'. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isLineHeightRelative	TokenNameIdentifier	 is Line Height Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
LINE_HEIGHT_RELATIVE_MASK	TokenNameIdentifier	 LINE  HEIGHT  RELATIVE  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given property value is relative to 'font-size'. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given property value is relative to 'font-size'. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFontSizeRelative	TokenNameIdentifier	 is Font Size Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
FONT_SIZE_RELATIVE_MASK	TokenNameIdentifier	 FONT  SIZE  RELATIVE  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given property value is relative to the * width of the containing block. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given property value is relative to the width of the containing block. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBlockWidthRelative	TokenNameIdentifier	 is Block Width Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
BLOCK_WIDTH_RELATIVE_MASK	TokenNameIdentifier	 BLOCK  WIDTH  RELATIVE  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells whether the given property value is relative to the * height of the containing block. */	TokenNameCOMMENT_JAVADOC	 Tells whether the given property value is relative to the height of the containing block. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isBlockHeightRelative	TokenNameIdentifier	 is Block Height Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&	TokenNameAND	
BLOCK_HEIGHT_RELATIVE_MASK	TokenNameIdentifier	 BLOCK  HEIGHT  RELATIVE  MASK
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Puts a property value, given the property index. * @param i The property index. * @param v The property value. */	TokenNameCOMMENT_JAVADOC	 Puts a property value, given the property index. @param i The property index. @param v The property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putValue	TokenNameIdentifier	 put Value
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Puts a property mask, given the property index. * @param i The property index. * @param m The property mask. */	TokenNameCOMMENT_JAVADOC	 Puts a property mask, given the property index. @param i The property index. @param m The property mask. 
public	TokenNamepublic	
void	TokenNamevoid	
putMask	TokenNameIdentifier	 put Mask
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
short	TokenNameshort	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
{	TokenNameLBRACE	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the priority of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the priority of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putImportant	TokenNameIdentifier	 put Important
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
IMPORTANT_MASK	TokenNameIdentifier	 IMPORTANT  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
IMPORTANT_MASK	TokenNameIdentifier	 IMPORTANT  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the origin of the given value. */	TokenNameCOMMENT_JAVADOC	 Sets the origin of the given value. 
public	TokenNamepublic	
void	TokenNamevoid	
putOrigin	TokenNameIdentifier	 put Origin
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
short	TokenNameshort	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
ORIGIN_MASK	TokenNameIdentifier	 ORIGIN  MASK
;	TokenNameSEMICOLON	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
&	TokenNameAND	
ORIGIN_MASK	TokenNameIdentifier	 ORIGIN  MASK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the computed flag of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the computed flag of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putComputed	TokenNameIdentifier	 put Computed
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
COMPUTED_MASK	TokenNameIdentifier	 COMPUTED  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
COMPUTED_MASK	TokenNameIdentifier	 COMPUTED  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the null-cascaded flag of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the null-cascaded flag of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putNullCascaded	TokenNameIdentifier	 put Null Cascaded
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
NULL_CASCADED_MASK	TokenNameIdentifier	 NULL  CASCADED  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
NULL_CASCADED_MASK	TokenNameIdentifier	 NULL  CASCADED  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the inherited flag of a property value. * If true this computed value was inherited from it's parent. */	TokenNameCOMMENT_JAVADOC	 Sets the inherited flag of a property value. If true this computed value was inherited from it's parent. 
public	TokenNamepublic	
void	TokenNamevoid	
putInherited	TokenNameIdentifier	 put Inherited
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
INHERITED_MASK	TokenNameIdentifier	 INHERITED  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
INHERITED_MASK	TokenNameIdentifier	 INHERITED  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the color-relative flag of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the color-relative flag of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putColorRelative	TokenNameIdentifier	 put Color Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
COLOR_RELATIVE_MASK	TokenNameIdentifier	 COLOR  RELATIVE  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
COLOR_RELATIVE_MASK	TokenNameIdentifier	 COLOR  RELATIVE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the parent-relative flag of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the parent-relative flag of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putParentRelative	TokenNameIdentifier	 put Parent Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
PARENT_RELATIVE_MASK	TokenNameIdentifier	 PARENT  RELATIVE  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
PARENT_RELATIVE_MASK	TokenNameIdentifier	 PARENT  RELATIVE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the line-height-relative flag of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the line-height-relative flag of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putLineHeightRelative	TokenNameIdentifier	 put Line Height Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
LINE_HEIGHT_RELATIVE_MASK	TokenNameIdentifier	 LINE  HEIGHT  RELATIVE  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
LINE_HEIGHT_RELATIVE_MASK	TokenNameIdentifier	 LINE  HEIGHT  RELATIVE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the font-size-relative flag of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the font-size-relative flag of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putFontSizeRelative	TokenNameIdentifier	 put Font Size Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
FONT_SIZE_RELATIVE_MASK	TokenNameIdentifier	 FONT  SIZE  RELATIVE  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
FONT_SIZE_RELATIVE_MASK	TokenNameIdentifier	 FONT  SIZE  RELATIVE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the block-width-relative flag of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the block-width-relative flag of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putBlockWidthRelative	TokenNameIdentifier	 put Block Width Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
BLOCK_WIDTH_RELATIVE_MASK	TokenNameIdentifier	 BLOCK  WIDTH  RELATIVE  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
BLOCK_WIDTH_RELATIVE_MASK	TokenNameIdentifier	 BLOCK  WIDTH  RELATIVE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the block-height-relative flag of a property value. */	TokenNameCOMMENT_JAVADOC	 Sets the block-height-relative flag of a property value. 
public	TokenNamepublic	
void	TokenNamevoid	
putBlockHeightRelative	TokenNameIdentifier	 put Block Height Relative
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
|=	TokenNameOR_EQUAL	
BLOCK_HEIGHT_RELATIVE_MASK	TokenNameIdentifier	 BLOCK  HEIGHT  RELATIVE  MASK
;	TokenNameSEMICOLON	
else	TokenNameelse	
masks	TokenNameIdentifier	 masks
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
&=	TokenNameAND_EQUAL	
~	TokenNameTWIDDLE	
BLOCK_HEIGHT_RELATIVE_MASK	TokenNameIdentifier	 BLOCK  HEIGHT  RELATIVE  MASK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a printable representation of this style map. */	TokenNameCOMMENT_JAVADOC	 Returns a printable representation of this style map. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
CSSEngine	TokenNameIdentifier	 CSS Engine
eng	TokenNameIdentifier	 eng
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note that values.length should always be equal to 	TokenNameCOMMENT_LINE	Note that values.length should always be equal to 
// eng.getNumberOfProperties() for StyleMaps that were created 	TokenNameCOMMENT_LINE	eng.getNumberOfProperties() for StyleMaps that were created 
// by that CSSEngine. 	TokenNameCOMMENT_LINE	by that CSSEngine. 
int	TokenNameint	
nSlots	TokenNameIdentifier	 n Slots
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
nSlots	TokenNameIdentifier	 n Slots
*	TokenNameMULTIPLY	
8	TokenNameIntegerLiteral	
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
nSlots	TokenNameIdentifier	 n Slots
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
eng	TokenNameIdentifier	 eng
.	TokenNameDOT	
getPropertyName	TokenNameIdentifier	 get Property Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isImportant	TokenNameIdentifier	 is Important
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" !important"	TokenNameStringLiteral	 !important
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"; "	TokenNameStringLiteral	; 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
