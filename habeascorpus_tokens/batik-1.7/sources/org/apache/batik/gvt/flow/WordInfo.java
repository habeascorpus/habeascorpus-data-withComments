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
flow	TokenNameIdentifier	 flow
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GVTFont	TokenNameIdentifier	 GVT Font
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
font	TokenNameIdentifier	 font
.	TokenNameDOT	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
;	TokenNameSEMICOLON	
/** * One line Class Desc * * Complete Class Desc * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: WordInfo.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 One line Class Desc * Complete Class Desc * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: WordInfo.java 475477 2006-11-15 22:44:28Z cam $ 
class	TokenNameclass	
WordInfo	TokenNameIdentifier	 Word Info
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
GlyphGroupInfo	TokenNameIdentifier	 Glyph Group Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphGroups	TokenNameIdentifier	 glyph Groups
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
flowLine	TokenNameIdentifier	 flow Line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
WordInfo	TokenNameIdentifier	 Word Info
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
WordInfo	TokenNameIdentifier	 Word Info
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
,	TokenNameCOMMA	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
,	TokenNameCOMMA	
float	TokenNamefloat	
lineHeight	TokenNameIdentifier	 line Height
,	TokenNameCOMMA	
GlyphGroupInfo	TokenNameIdentifier	 Glyph Group Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphGroups	TokenNameIdentifier	 glyph Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
glyphGroups	TokenNameIdentifier	 glyph Groups
=	TokenNameEQUAL	
glyphGroups	TokenNameIdentifier	 glyph Groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
void	TokenNamevoid	
setAscent	TokenNameIdentifier	 set Ascent
(	TokenNameLPAREN	
float	TokenNamefloat	
ascent	TokenNameIdentifier	 ascent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
ascent	TokenNameIdentifier	 ascent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
public	TokenNamepublic	
void	TokenNamevoid	
setDescent	TokenNameIdentifier	 set Descent
(	TokenNameLPAREN	
float	TokenNamefloat	
descent	TokenNameIdentifier	 descent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
descent	TokenNameIdentifier	 descent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addLineMetrics	TokenNameIdentifier	 add Line Metrics
(	TokenNameLPAREN	
GVTFont	TokenNameIdentifier	 GVT Font
font	TokenNameIdentifier	 font
,	TokenNameCOMMA	
GVTLineMetrics	TokenNameIdentifier	 GVT Line Metrics
lm	TokenNameIdentifier	 lm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ascent	TokenNameIdentifier	 ascent
<	TokenNameLESS	
lm	TokenNameIdentifier	 lm
.	TokenNameDOT	
getAscent	TokenNameIdentifier	 get Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ascent	TokenNameIdentifier	 ascent
=	TokenNameEQUAL	
lm	TokenNameIdentifier	 lm
.	TokenNameDOT	
getAscent	TokenNameIdentifier	 get Ascent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
descent	TokenNameIdentifier	 descent
<	TokenNameLESS	
lm	TokenNameIdentifier	 lm
.	TokenNameDOT	
getDescent	TokenNameIdentifier	 get Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
descent	TokenNameIdentifier	 descent
=	TokenNameEQUAL	
lm	TokenNameIdentifier	 lm
.	TokenNameDOT	
getDescent	TokenNameIdentifier	 get Descent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getLineHeight	TokenNameIdentifier	 get Line Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setLineHeight	TokenNameIdentifier	 set Line Height
(	TokenNameLPAREN	
float	TokenNamefloat	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addLineHeight	TokenNameIdentifier	 add Line Height
(	TokenNameLPAREN	
float	TokenNamefloat	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lineHeight	TokenNameIdentifier	 line Height
<	TokenNameLESS	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getFlowLine	TokenNameIdentifier	 get Flow Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
flowLine	TokenNameIdentifier	 flow Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setFlowLine	TokenNameIdentifier	 set Flow Line
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
fl	TokenNameIdentifier	 fl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
flowLine	TokenNameIdentifier	 flow Line
=	TokenNameEQUAL	
fl	TokenNameIdentifier	 fl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumGlyphGroups	TokenNameIdentifier	 get Num Glyph Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphGroups	TokenNameIdentifier	 glyph Groups
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
glyphGroups	TokenNameIdentifier	 glyph Groups
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setGlyphGroups	TokenNameIdentifier	 set Glyph Groups
(	TokenNameLPAREN	
GlyphGroupInfo	TokenNameIdentifier	 Glyph Group Info
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphGroups	TokenNameIdentifier	 glyph Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
glyphGroups	TokenNameIdentifier	 glyph Groups
=	TokenNameEQUAL	
glyphGroups	TokenNameIdentifier	 glyph Groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
GlyphGroupInfo	TokenNameIdentifier	 Glyph Group Info
getGlyphGroup	TokenNameIdentifier	 get Glyph Group
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphGroups	TokenNameIdentifier	 glyph Groups
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
glyphGroups	TokenNameIdentifier	 glyph Groups
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
