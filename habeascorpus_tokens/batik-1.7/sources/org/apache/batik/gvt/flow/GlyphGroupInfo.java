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
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
;	TokenNameSEMICOLON	
/** * One line Class Desc * * Complete Class Desc * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: GlyphGroupInfo.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 One line Class Desc * Complete Class Desc * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: GlyphGroupInfo.java 475477 2006-11-15 22:44:28Z cam $ 
class	TokenNameclass	
GlyphGroupInfo	TokenNameIdentifier	 Glyph Group Info
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
int	TokenNameint	
glyphCount	TokenNameIdentifier	 glyph Count
,	TokenNameCOMMA	
lastGlyphCount	TokenNameIdentifier	 last Glyph Count
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hideLast	TokenNameIdentifier	 hide Last
;	TokenNameSEMICOLON	
float	TokenNamefloat	
advance	TokenNameIdentifier	 advance
,	TokenNameCOMMA	
lastAdvance	TokenNameIdentifier	 last Advance
;	TokenNameSEMICOLON	
int	TokenNameint	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hide	TokenNameIdentifier	 hide
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GlyphGroupInfo	TokenNameIdentifier	 Glyph Group Info
(	TokenNameLPAREN	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
gv	TokenNameIdentifier	 gv
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphHide	TokenNameIdentifier	 glyph Hide
,	TokenNameCOMMA	
boolean	TokenNameboolean	
glyphGroupHideLast	TokenNameIdentifier	 glyph Group Hide Last
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
glyphPos	TokenNameIdentifier	 glyph Pos
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
advAdj	TokenNameIdentifier	 adv Adj
,	TokenNameCOMMA	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lastAdvAdj	TokenNameIdentifier	 last Adv Adj
,	TokenNameCOMMA	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
space	TokenNameIdentifier	 space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
gv	TokenNameIdentifier	 gv
=	TokenNameEQUAL	
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hide	TokenNameIdentifier	 hide
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hideLast	TokenNameIdentifier	 hide Last
=	TokenNameEQUAL	
glyphGroupHideLast	TokenNameIdentifier	 glyph Group Hide Last
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
glyphHide	TokenNameIdentifier	 glyph Hide
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
hide	TokenNameIdentifier	 hide
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
hide	TokenNameIdentifier	 hide
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
adv	TokenNameIdentifier	 adv
=	TokenNameEQUAL	
glyphPos	TokenNameIdentifier	 glyph Pos
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
glyphPos	TokenNameIdentifier	 glyph Pos
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
ladv	TokenNameIdentifier	 ladv
=	TokenNameEQUAL	
adv	TokenNameIdentifier	 adv
;	TokenNameSEMICOLON	
adv	TokenNameIdentifier	 adv
+=	TokenNamePLUS_EQUAL	
advAdj	TokenNameIdentifier	 adv Adj
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
glyphCount	TokenNameIdentifier	 glyph Count
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
glyphHide	TokenNameIdentifier	 glyph Hide
[	TokenNameLBRACKET	
g	TokenNameIdentifier	 g
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
glyphCount	TokenNameIdentifier	 glyph Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
lastGlyphCount	TokenNameIdentifier	 last Glyph Count
=	TokenNameEQUAL	
glyphCount	TokenNameIdentifier	 glyph Count
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
g	TokenNameIdentifier	 g
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
>=	TokenNameGREATER_EQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
g	TokenNameIdentifier	 g
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ladv	TokenNameIdentifier	 ladv
+=	TokenNamePLUS_EQUAL	
lastAdvAdj	TokenNameIdentifier	 last Adv Adj
[	TokenNameLBRACKET	
g	TokenNameIdentifier	 g
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
space	TokenNameIdentifier	 space
[	TokenNameLBRACKET	
g	TokenNameIdentifier	 g
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
lastGlyphCount	TokenNameIdentifier	 last Glyph Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hideLast	TokenNameIdentifier	 hide Last
)	TokenNameRPAREN	
lastGlyphCount	TokenNameIdentifier	 last Glyph Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
glyphCount	TokenNameIdentifier	 glyph Count
=	TokenNameEQUAL	
glyphCount	TokenNameIdentifier	 glyph Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lastGlyphCount	TokenNameIdentifier	 last Glyph Count
=	TokenNameEQUAL	
lastGlyphCount	TokenNameIdentifier	 last Glyph Count
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
=	TokenNameEQUAL	
adv	TokenNameIdentifier	 adv
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lastAdvance	TokenNameIdentifier	 last Advance
=	TokenNameEQUAL	
ladv	TokenNameIdentifier	 ladv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the GlyphVector for this GlyphGroup. */	TokenNameCOMMENT_JAVADOC	 Get the GlyphVector for this GlyphGroup. 
public	TokenNamepublic	
GVTGlyphVector	TokenNameIdentifier	 GVT Glyph Vector
getGlyphVector	TokenNameIdentifier	 get Glyph Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gv	TokenNameIdentifier	 gv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the start glyph index for this glyph group. */	TokenNameCOMMENT_JAVADOC	 get the start glyph index for this glyph group. 
public	TokenNamepublic	
int	TokenNameint	
getStart	TokenNameIdentifier	 get Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the end glyph index for this glyph group. */	TokenNameCOMMENT_JAVADOC	 get the end glyph index for this glyph group. 
public	TokenNamepublic	
int	TokenNameint	
getEnd	TokenNameIdentifier	 get End
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the number of glyphs that count when it's not the * last in the line (basically end-start+1-sum(hide) ). */	TokenNameCOMMENT_JAVADOC	 get the number of glyphs that count when it's not the last in the line (basically end-start+1-sum(hide) ). 
public	TokenNamepublic	
int	TokenNameint	
getGlyphCount	TokenNameIdentifier	 get Glyph Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
glyphCount	TokenNameIdentifier	 glyph Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** get the number of glyphs that 'cout' when it is the * last in the line. This is glyphCount minus any * trailing spaces, and minus the last glyph if hideLast * is true. */	TokenNameCOMMENT_JAVADOC	 get the number of glyphs that 'cout' when it is the last in the line. This is glyphCount minus any trailing spaces, and minus the last glyph if hideLast is true. 
public	TokenNamepublic	
int	TokenNameint	
getLastGlyphCount	TokenNameIdentifier	 get Last Glyph Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastGlyphCount	TokenNameIdentifier	 last Glyph Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getHide	TokenNameIdentifier	 get Hide
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hide	TokenNameIdentifier	 hide
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** return true if 'end' glyph should be hidden in cases * where this is not the last glyph group in a span */	TokenNameCOMMENT_JAVADOC	 return true if 'end' glyph should be hidden in cases where this is not the last glyph group in a span 
public	TokenNamepublic	
boolean	TokenNameboolean	
getHideLast	TokenNameIdentifier	 get Hide Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hideLast	TokenNameIdentifier	 hide Last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns the advance to use when this glyphGroup is * not the last glyph group in a span. */	TokenNameCOMMENT_JAVADOC	 returns the advance to use when this glyphGroup is not the last glyph group in a span. 
public	TokenNamepublic	
float	TokenNamefloat	
getAdvance	TokenNameIdentifier	 get Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
advance	TokenNameIdentifier	 advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * returns the advance to use when this glyphGroup is * the last glyph group in a span. This generally includes * the width of the last glyph if 'HideLast' is true. Also * in Japanese some glyphs should not be counted for line * width (they may go outside the flow area). */	TokenNameCOMMENT_JAVADOC	 returns the advance to use when this glyphGroup is the last glyph group in a span. This generally includes the width of the last glyph if 'HideLast' is true. Also in Japanese some glyphs should not be counted for line width (they may go outside the flow area). 
public	TokenNamepublic	
float	TokenNamefloat	
getLastAdvance	TokenNameIdentifier	 get Last Advance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastAdvance	TokenNameIdentifier	 last Advance
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setRange	TokenNameIdentifier	 set Range
(	TokenNameLPAREN	
int	TokenNameint	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getRange	TokenNameIdentifier	 get Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
