/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
LineMetrics	TokenNameIdentifier	 Line Metrics
;	TokenNameSEMICOLON	
/** * GVTLineMetrics is a GVT version of java.awt.font.LineMetrics. * * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> * @version $Id: GVTLineMetrics.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 GVTLineMetrics is a GVT version of java.awt.font.LineMetrics. * @author <a href="mailto:bella.robinson@cmis.csiro.au">Bella Robinson</a> @version $Id: GVTLineMetrics.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
{	TokenNameLBRACE	
protected	TokenNameprotected	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
baselineIndex	TokenNameIdentifier	 baseline Index
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
baselineOffsets	TokenNameIdentifier	 baseline Offsets
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
leading	TokenNameIdentifier	 leading
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
strikethroughOffset	TokenNameIdentifier	 strikethrough Offset
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
underlineOffset	TokenNameIdentifier	 underline Offset
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
overlineOffset	TokenNameIdentifier	 overline Offset
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
overlineThickness	TokenNameIdentifier	 overline Thickness
;	TokenNameSEMICOLON	
/** * Constructs a GVTLineMetrics object based on the specified line metrics. * * @param lineMetrics The lineMetrics object that this metrics object will * be based upon. */	TokenNameCOMMENT_JAVADOC	 Constructs a GVTLineMetrics object based on the specified line metrics. * @param lineMetrics The lineMetrics object that this metrics object will be based upon. 
public	TokenNamepublic	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
(	TokenNameLPAREN	
LineMetrics	TokenNameIdentifier	 Line Metrics
lineMetrics	TokenNameIdentifier	 line Metrics
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getAscent	TokenNameIdentifier	 get Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baselineIndex	TokenNameIdentifier	 baseline Index
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getBaselineIndex	TokenNameIdentifier	 get Baseline Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baselineOffsets	TokenNameIdentifier	 baseline Offsets
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getBaselineOffsets	TokenNameIdentifier	 get Baseline Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getDescent	TokenNameIdentifier	 get Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
leading	TokenNameIdentifier	 leading
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getLeading	TokenNameIdentifier	 get Leading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numChars	TokenNameIdentifier	 num Chars
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getNumChars	TokenNameIdentifier	 get Num Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughOffset	TokenNameIdentifier	 strikethrough Offset
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getStrikethroughOffset	TokenNameIdentifier	 get Strikethrough Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getStrikethroughThickness	TokenNameIdentifier	 get Strikethrough Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineOffset	TokenNameIdentifier	 underline Offset
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getUnderlineOffset	TokenNameIdentifier	 get Underline Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineThickness	TokenNameIdentifier	 underline Thickness
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getUnderlineThickness	TokenNameIdentifier	 get Underline Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineOffset	TokenNameIdentifier	 overline Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineThickness	TokenNameIdentifier	 overline Thickness
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a GVTLineMetrics object based on the specified line metrics * with a scale factor applied. * * @param lineMetrics The lineMetrics object that this metrics object will * be based upon. * @param scaleFactor The scale factor to apply to all metrics. */	TokenNameCOMMENT_JAVADOC	 Constructs a GVTLineMetrics object based on the specified line metrics with a scale factor applied. * @param lineMetrics The lineMetrics object that this metrics object will be based upon. @param scaleFactor The scale factor to apply to all metrics. 
public	TokenNamepublic	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
(	TokenNameLPAREN	
LineMetrics	TokenNameIdentifier	 Line Metrics
lineMetrics	TokenNameIdentifier	 line Metrics
,	TokenNameCOMMA	
float	TokenNamefloat	
scaleFactor	TokenNameIdentifier	 scale Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getAscent	TokenNameIdentifier	 get Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scaleFactor	TokenNameIdentifier	 scale Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baselineIndex	TokenNameIdentifier	 baseline Index
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getBaselineIndex	TokenNameIdentifier	 get Baseline Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baselineOffsets	TokenNameIdentifier	 baseline Offsets
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getBaselineOffsets	TokenNameIdentifier	 get Baseline Offsets
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
baselineOffsets	TokenNameIdentifier	 baseline Offsets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
baselineOffsets	TokenNameIdentifier	 baseline Offsets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*=	TokenNameMULTIPLY_EQUAL	
scaleFactor	TokenNameIdentifier	 scale Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getDescent	TokenNameIdentifier	 get Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scaleFactor	TokenNameIdentifier	 scale Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scaleFactor	TokenNameIdentifier	 scale Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
leading	TokenNameIdentifier	 leading
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getLeading	TokenNameIdentifier	 get Leading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numChars	TokenNameIdentifier	 num Chars
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getNumChars	TokenNameIdentifier	 get Num Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughOffset	TokenNameIdentifier	 strikethrough Offset
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getStrikethroughOffset	TokenNameIdentifier	 get Strikethrough Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scaleFactor	TokenNameIdentifier	 scale Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getStrikethroughThickness	TokenNameIdentifier	 get Strikethrough Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scaleFactor	TokenNameIdentifier	 scale Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineOffset	TokenNameIdentifier	 underline Offset
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getUnderlineOffset	TokenNameIdentifier	 get Underline Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scaleFactor	TokenNameIdentifier	 scale Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineThickness	TokenNameIdentifier	 underline Thickness
=	TokenNameEQUAL	
lineMetrics	TokenNameIdentifier	 line Metrics
.	TokenNameDOT	
getUnderlineThickness	TokenNameIdentifier	 get Underline Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
scaleFactor	TokenNameIdentifier	 scale Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineOffset	TokenNameIdentifier	 overline Offset
=	TokenNameEQUAL	
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineThickness	TokenNameIdentifier	 overline Thickness
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a GVTLineMetrics object with the specified attributes. */	TokenNameCOMMENT_JAVADOC	 Constructs a GVTLineMetrics object with the specified attributes. 
public	TokenNamepublic	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
(	TokenNameLPAREN	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
,	TokenNameCOMMA	
int	TokenNameint	
baselineIndex	TokenNameIdentifier	 baseline Index
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
baselineOffsets	TokenNameIdentifier	 baseline Offsets
,	TokenNameCOMMA	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
,	TokenNameCOMMA	
float	TokenNamefloat	
height	TokenNameIdentifier	 height
,	TokenNameCOMMA	
float	TokenNamefloat	
leading	TokenNameIdentifier	 leading
,	TokenNameCOMMA	
int	TokenNameint	
numChars	TokenNameIdentifier	 num Chars
,	TokenNameCOMMA	
float	TokenNamefloat	
strikethroughOffset	TokenNameIdentifier	 strikethrough Offset
,	TokenNameCOMMA	
float	TokenNamefloat	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
,	TokenNameCOMMA	
float	TokenNamefloat	
underlineOffset	TokenNameIdentifier	 underline Offset
,	TokenNameCOMMA	
float	TokenNamefloat	
underlineThickness	TokenNameIdentifier	 underline Thickness
,	TokenNameCOMMA	
float	TokenNamefloat	
overlineOffset	TokenNameIdentifier	 overline Offset
,	TokenNameCOMMA	
float	TokenNamefloat	
overlineThickness	TokenNameIdentifier	 overline Thickness
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baselineIndex	TokenNameIdentifier	 baseline Index
=	TokenNameEQUAL	
baselineIndex	TokenNameIdentifier	 baseline Index
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baselineOffsets	TokenNameIdentifier	 baseline Offsets
=	TokenNameEQUAL	
baselineOffsets	TokenNameIdentifier	 baseline Offsets
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
leading	TokenNameIdentifier	 leading
=	TokenNameEQUAL	
leading	TokenNameIdentifier	 leading
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numChars	TokenNameIdentifier	 num Chars
=	TokenNameEQUAL	
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughOffset	TokenNameIdentifier	 strikethrough Offset
=	TokenNameEQUAL	
strikethroughOffset	TokenNameIdentifier	 strikethrough Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
=	TokenNameEQUAL	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineOffset	TokenNameIdentifier	 underline Offset
=	TokenNameEQUAL	
underlineOffset	TokenNameIdentifier	 underline Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineThickness	TokenNameIdentifier	 underline Thickness
=	TokenNameEQUAL	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineOffset	TokenNameIdentifier	 overline Offset
=	TokenNameEQUAL	
overlineOffset	TokenNameIdentifier	 overline Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineThickness	TokenNameIdentifier	 overline Thickness
=	TokenNameEQUAL	
overlineThickness	TokenNameIdentifier	 overline Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the ascent of the text. */	TokenNameCOMMENT_JAVADOC	 Returns the ascent of the text. 
public	TokenNamepublic	
float	TokenNamefloat	
getAscent	TokenNameIdentifier	 get Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the baseline index of the text. */	TokenNameCOMMENT_JAVADOC	 Returns the baseline index of the text. 
public	TokenNamepublic	
int	TokenNameint	
getBaselineIndex	TokenNameIdentifier	 get Baseline Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baselineIndex	TokenNameIdentifier	 baseline Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the baseline offsets of the text, relative to the baseline of * the text. */	TokenNameCOMMENT_JAVADOC	 Returns the baseline offsets of the text, relative to the baseline of the text. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getBaselineOffsets	TokenNameIdentifier	 get Baseline Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
baselineOffsets	TokenNameIdentifier	 baseline Offsets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the descent of the text. */	TokenNameCOMMENT_JAVADOC	 Returns the descent of the text. 
public	TokenNamepublic	
float	TokenNamefloat	
getDescent	TokenNameIdentifier	 get Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the height of the text. */	TokenNameCOMMENT_JAVADOC	 Returns the height of the text. 
public	TokenNamepublic	
float	TokenNamefloat	
getHeight	TokenNameIdentifier	 get Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the leading of the text. */	TokenNameCOMMENT_JAVADOC	 Returns the leading of the text. 
public	TokenNamepublic	
float	TokenNamefloat	
getLeading	TokenNameIdentifier	 get Leading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
leading	TokenNameIdentifier	 leading
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of characters in the text whose metrics are * encapsulated by this LineMetrics object. */	TokenNameCOMMENT_JAVADOC	 Returns the number of characters in the text whose metrics are encapsulated by this LineMetrics object. 
public	TokenNamepublic	
int	TokenNameint	
getNumChars	TokenNameIdentifier	 get Num Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numChars	TokenNameIdentifier	 num Chars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the strike-through line relative to the baseline. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the strike-through line relative to the baseline. 
public	TokenNamepublic	
float	TokenNamefloat	
getStrikethroughOffset	TokenNameIdentifier	 get Strikethrough Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strikethroughOffset	TokenNameIdentifier	 strikethrough Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the thickness of the strike-through line. */	TokenNameCOMMENT_JAVADOC	 Returns the thickness of the strike-through line. 
public	TokenNamepublic	
float	TokenNamefloat	
getStrikethroughThickness	TokenNameIdentifier	 get Strikethrough Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strikethroughThickness	TokenNameIdentifier	 strikethrough Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the underline relative to the baseline. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the underline relative to the baseline. 
public	TokenNamepublic	
float	TokenNamefloat	
getUnderlineOffset	TokenNameIdentifier	 get Underline Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
underlineOffset	TokenNameIdentifier	 underline Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the thickness of the underline. */	TokenNameCOMMENT_JAVADOC	 Returns the thickness of the underline. 
public	TokenNamepublic	
float	TokenNamefloat	
getUnderlineThickness	TokenNameIdentifier	 get Underline Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
underlineThickness	TokenNameIdentifier	 underline Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the position of the overline relative to the baseline. */	TokenNameCOMMENT_JAVADOC	 Returns the position of the overline relative to the baseline. 
public	TokenNamepublic	
float	TokenNamefloat	
getOverlineOffset	TokenNameIdentifier	 get Overline Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
overlineOffset	TokenNameIdentifier	 overline Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the thickness of the overline. */	TokenNameCOMMENT_JAVADOC	 Returns the thickness of the overline. 
public	TokenNamepublic	
float	TokenNamefloat	
getOverlineThickness	TokenNameIdentifier	 get Overline Thickness
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
overlineThickness	TokenNameIdentifier	 overline Thickness
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
