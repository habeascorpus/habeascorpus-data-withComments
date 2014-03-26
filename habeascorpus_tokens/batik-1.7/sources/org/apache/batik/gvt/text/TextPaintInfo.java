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
text	TokenNameIdentifier	 text
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
Paint	TokenNameIdentifier	 Paint
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Stroke	TokenNameIdentifier	 Stroke
;	TokenNameSEMICOLON	
/** * One line Class Desc * * Complete Class Desc * * @author <a href="mailto:deweese@apache.org">deweese</a> * @version $Id: TextPaintInfo.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 One line Class Desc * Complete Class Desc * @author <a href="mailto:deweese@apache.org">deweese</a> @version $Id: TextPaintInfo.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
visible	TokenNameIdentifier	 visible
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
fillPaint	TokenNameIdentifier	 fill Paint
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
strokePaint	TokenNameIdentifier	 stroke Paint
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Stroke	TokenNameIdentifier	 Stroke
strokeStroke	TokenNameIdentifier	 stroke Stroke
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Composite	TokenNameIdentifier	 Composite
composite	TokenNameIdentifier	 composite
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
underlinePaint	TokenNameIdentifier	 underline Paint
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
underlineStrokePaint	TokenNameIdentifier	 underline Stroke Paint
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Stroke	TokenNameIdentifier	 Stroke
underlineStroke	TokenNameIdentifier	 underline Stroke
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
overlinePaint	TokenNameIdentifier	 overline Paint
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
overlineStrokePaint	TokenNameIdentifier	 overline Stroke Paint
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Stroke	TokenNameIdentifier	 Stroke
overlineStroke	TokenNameIdentifier	 overline Stroke
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
strikethroughPaint	TokenNameIdentifier	 strikethrough Paint
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Paint	TokenNameIdentifier	 Paint
strikethroughStrokePaint	TokenNameIdentifier	 strikethrough Stroke Paint
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Stroke	TokenNameIdentifier	 Stroke
strikethroughStroke	TokenNameIdentifier	 strikethrough Stroke
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
startChar	TokenNameIdentifier	 start Char
,	TokenNameCOMMA	
endChar	TokenNameIdentifier	 end Char
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
(	TokenNameLPAREN	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
pi	TokenNameIdentifier	 pi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
pi	TokenNameIdentifier	 pi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fillPaint	TokenNameIdentifier	 fill Paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strokePaint	TokenNameIdentifier	 stroke Paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
composite	TokenNameIdentifier	 composite
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlinePaint	TokenNameIdentifier	 underline Paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineStrokePaint	TokenNameIdentifier	 underline Stroke Paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineStroke	TokenNameIdentifier	 underline Stroke
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlinePaint	TokenNameIdentifier	 overline Paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineStrokePaint	TokenNameIdentifier	 overline Stroke Paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineStroke	TokenNameIdentifier	 overline Stroke
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughPaint	TokenNameIdentifier	 strikethrough Paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughStrokePaint	TokenNameIdentifier	 strikethrough Stroke Paint
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughStroke	TokenNameIdentifier	 strikethrough Stroke
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
visible	TokenNameIdentifier	 visible
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fillPaint	TokenNameIdentifier	 fill Paint
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
fillPaint	TokenNameIdentifier	 fill Paint
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strokePaint	TokenNameIdentifier	 stroke Paint
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
strokePaint	TokenNameIdentifier	 stroke Paint
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
composite	TokenNameIdentifier	 composite
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
composite	TokenNameIdentifier	 composite
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlinePaint	TokenNameIdentifier	 underline Paint
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
underlinePaint	TokenNameIdentifier	 underline Paint
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineStrokePaint	TokenNameIdentifier	 underline Stroke Paint
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
underlineStrokePaint	TokenNameIdentifier	 underline Stroke Paint
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
underlineStroke	TokenNameIdentifier	 underline Stroke
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
underlineStroke	TokenNameIdentifier	 underline Stroke
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlinePaint	TokenNameIdentifier	 overline Paint
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
overlinePaint	TokenNameIdentifier	 overline Paint
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineStrokePaint	TokenNameIdentifier	 overline Stroke Paint
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
overlineStrokePaint	TokenNameIdentifier	 overline Stroke Paint
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
overlineStroke	TokenNameIdentifier	 overline Stroke
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
overlineStroke	TokenNameIdentifier	 overline Stroke
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughPaint	TokenNameIdentifier	 strikethrough Paint
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
strikethroughPaint	TokenNameIdentifier	 strikethrough Paint
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughStrokePaint	TokenNameIdentifier	 strikethrough Stroke Paint
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
strikethroughStrokePaint	TokenNameIdentifier	 strikethrough Stroke Paint
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
strikethroughStroke	TokenNameIdentifier	 strikethrough Stroke
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
strikethroughStroke	TokenNameIdentifier	 strikethrough Stroke
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
visible	TokenNameIdentifier	 visible
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
visible	TokenNameIdentifier	 visible
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
equivilent	TokenNameIdentifier	 equivilent
(	TokenNameLPAREN	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
tpi1	TokenNameIdentifier	 tpi1
,	TokenNameCOMMA	
TextPaintInfo	TokenNameIdentifier	 Text Paint Info
tpi2	TokenNameIdentifier	 tpi2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tpi1	TokenNameIdentifier	 tpi1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tpi2	TokenNameIdentifier	 tpi2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tpi2	TokenNameIdentifier	 tpi2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tpi1	TokenNameIdentifier	 tpi1
.	TokenNameDOT	
fillPaint	TokenNameIdentifier	 fill Paint
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
tpi2	TokenNameIdentifier	 tpi2
.	TokenNameDOT	
fillPaint	TokenNameIdentifier	 fill Paint
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tpi1	TokenNameIdentifier	 tpi1
.	TokenNameDOT	
visible	TokenNameIdentifier	 visible
!=	TokenNameNOT_EQUAL	
tpi2	TokenNameIdentifier	 tpi2
.	TokenNameDOT	
visible	TokenNameIdentifier	 visible
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
tpi1Stroke	TokenNameIdentifier	 tpi1 Stroke
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tpi1	TokenNameIdentifier	 tpi1
.	TokenNameDOT	
strokePaint	TokenNameIdentifier	 stroke Paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tpi1	TokenNameIdentifier	 tpi1
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
tpi2Stroke	TokenNameIdentifier	 tpi2 Stroke
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tpi2	TokenNameIdentifier	 tpi2
.	TokenNameDOT	
strokePaint	TokenNameIdentifier	 stroke Paint
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
tpi2	TokenNameIdentifier	 tpi2
.	TokenNameDOT	
strokeStroke	TokenNameIdentifier	 stroke Stroke
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
tpi1Stroke	TokenNameIdentifier	 tpi1 Stroke
==	TokenNameEQUAL_EQUAL	
tpi2Stroke	TokenNameIdentifier	 tpi2 Stroke
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
