/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
/** * @xerces.internal * * @version $Id: CaseInsensitiveMap.java 834653 2009-11-10 20:32:39Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 @xerces.internal * @version $Id: CaseInsensitiveMap.java 834653 2009-11-10 20:32:39Z mrglavas $ 
final	TokenNamefinal	
class	TokenNameclass	
CaseInsensitiveMap	TokenNameIdentifier	 Case Insensitive Map
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* 2^10 = 1k */	TokenNameCOMMENT_BLOCK	 2^10 = 1k 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
=	TokenNameEQUAL	
64	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/* up to 0xFFFF */	TokenNameCOMMENT_BLOCK	 up to 0xFFFF 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
caseInsensitiveMap	TokenNameIdentifier	 case Insensitive Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
LOWER_CASE_MATCH	TokenNameIdentifier	 LOWER  CASE  MATCH
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
UPPER_CASE_MATCH	TokenNameIdentifier	 UPPER  CASE  MATCH
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
buildCaseInsensitiveMap	TokenNameIdentifier	 build Case Insensitive Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a list of code point characters (not including the input value) * that can be substituted in a case insensitive match */	TokenNameCOMMENT_JAVADOC	 Return a list of code point characters (not including the input value) that can be substituted in a case insensitive match 
static	TokenNamestatic	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
<	TokenNameLESS	
0x10000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
return	TokenNamereturn	
caseInsensitiveMap	TokenNameIdentifier	 case Insensitive Map
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
buildCaseInsensitiveMap	TokenNameIdentifier	 build Case Insensitive Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
caseInsensitiveMap	TokenNameIdentifier	 case Insensitive Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
INITIAL_CHUNK_COUNT	TokenNameIdentifier	 INITIAL  CHUNK  COUNT
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHUNK_SIZE	TokenNameIdentifier	 CHUNK  SIZE
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
lc	TokenNameIdentifier	 lc
,	TokenNameCOMMA	
uc	TokenNameIdentifier	 uc
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
0x10000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lc	TokenNameIdentifier	 lc
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
uc	TokenNameIdentifier	 uc
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lower/upper case value is not the same as code point 	TokenNameCOMMENT_LINE	lower/upper case value is not the same as code point 
if	TokenNameif	
(	TokenNameLPAREN	
lc	TokenNameIdentifier	 lc
!=	TokenNameNOT_EQUAL	
uc	TokenNameIdentifier	 uc
||	TokenNameOR_OR	
lc	TokenNameIdentifier	 lc
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lc	TokenNameIdentifier	 lc
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lc	TokenNameIdentifier	 lc
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
LOWER_CASE_MATCH	TokenNameIdentifier	 LOWER  CASE  MATCH
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lcMap	TokenNameIdentifier	 lc Map
=	TokenNameEQUAL	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
lc	TokenNameIdentifier	 lc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lcMap	TokenNameIdentifier	 lc Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
updateMap	TokenNameIdentifier	 update Map
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
lc	TokenNameIdentifier	 lc
,	TokenNameCOMMA	
lcMap	TokenNameIdentifier	 lc Map
,	TokenNameCOMMA	
LOWER_CASE_MATCH	TokenNameIdentifier	 LOWER  CASE  MATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uc	TokenNameIdentifier	 uc
!=	TokenNameNOT_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
expandMap	TokenNameIdentifier	 expand Map
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
uc	TokenNameIdentifier	 uc
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
UPPER_CASE_MATCH	TokenNameIdentifier	 UPPER  CASE  MATCH
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ucMap	TokenNameIdentifier	 uc Map
=	TokenNameEQUAL	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
uc	TokenNameIdentifier	 uc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ucMap	TokenNameIdentifier	 uc Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
updateMap	TokenNameIdentifier	 update Map
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
uc	TokenNameIdentifier	 uc
,	TokenNameCOMMA	
ucMap	TokenNameIdentifier	 uc Map
,	TokenNameCOMMA	
UPPER_CASE_MATCH	TokenNameIdentifier	 UPPER  CASE  MATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expandMap	TokenNameIdentifier	 expand Map
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcMap	TokenNameIdentifier	 src Map
,	TokenNameCOMMA	
int	TokenNameint	
expandBy	TokenNameIdentifier	 expand By
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
oldLen	TokenNameIdentifier	 old Len
=	TokenNameEQUAL	
srcMap	TokenNameIdentifier	 src Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
oldLen	TokenNameIdentifier	 old Len
+	TokenNamePLUS	
expandBy	TokenNameIdentifier	 expand By
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
srcMap	TokenNameIdentifier	 src Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
oldLen	TokenNameIdentifier	 old Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
map	TokenNameIdentifier	 map
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
chunk	TokenNameIdentifier	 chunk
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
CHUNK_SHIFT	TokenNameIdentifier	 CHUNK  SHIFT
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
&	TokenNameAND	
CHUNK_MASK	TokenNameIdentifier	 CHUNK  MASK
;	TokenNameSEMICOLON	
caseInsensitiveMap	TokenNameIdentifier	 case Insensitive Map
[	TokenNameLBRACKET	
chunk	TokenNameIdentifier	 chunk
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
updateMap	TokenNameIdentifier	 update Map
(	TokenNameLPAREN	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
codePointMap	TokenNameIdentifier	 code Point Map
,	TokenNameCOMMA	
int	TokenNameint	
ciCodePoint	TokenNameIdentifier	 ci Code Point
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ciCodePointMap	TokenNameIdentifier	 ci Code Point Map
,	TokenNameCOMMA	
int	TokenNameint	
matchType	TokenNameIdentifier	 match Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ciCodePointMap	TokenNameIdentifier	 ci Code Point Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
ciCodePointMap	TokenNameIdentifier	 ci Code Point Map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cMap	TokenNameIdentifier	 c Map
=	TokenNameEQUAL	
getMapping	TokenNameIdentifier	 get Mapping
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cMap	TokenNameIdentifier	 c Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
cMap	TokenNameIdentifier	 c Map
,	TokenNameCOMMA	
ciCodePoint	TokenNameIdentifier	 ci Code Point
,	TokenNameCOMMA	
matchType	TokenNameIdentifier	 match Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
cMap	TokenNameIdentifier	 c Map
,	TokenNameCOMMA	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cMap	TokenNameIdentifier	 c Map
=	TokenNameEQUAL	
expandAndAdd	TokenNameIdentifier	 expand And Add
(	TokenNameLPAREN	
cMap	TokenNameIdentifier	 c Map
,	TokenNameCOMMA	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
matchType	TokenNameIdentifier	 match Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
cMap	TokenNameIdentifier	 c Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
codePointMap	TokenNameIdentifier	 code Point Map
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codePointMap	TokenNameIdentifier	 code Point Map
=	TokenNameEQUAL	
expandAndAdd	TokenNameIdentifier	 expand And Add
(	TokenNameLPAREN	
codePointMap	TokenNameIdentifier	 code Point Map
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
matchType	TokenNameIdentifier	 match Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
ciCodePointMap	TokenNameIdentifier	 ci Code Point Map
,	TokenNameCOMMA	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ciCodePointMap	TokenNameIdentifier	 ci Code Point Map
=	TokenNameEQUAL	
expandAndAdd	TokenNameIdentifier	 expand And Add
(	TokenNameLPAREN	
ciCodePointMap	TokenNameIdentifier	 ci Code Point Map
,	TokenNameCOMMA	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
matchType	TokenNameIdentifier	 match Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ciCodePoint	TokenNameIdentifier	 ci Code Point
,	TokenNameCOMMA	
ciCodePointMap	TokenNameIdentifier	 ci Code Point Map
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
codePointMap	TokenNameIdentifier	 code Point Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
codePoint	TokenNameIdentifier	 code Point
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
int	TokenNameint	
matchType	TokenNameIdentifier	 match Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
codePoint	TokenNameIdentifier	 code Point
&&	TokenNameAND_AND	
map	TokenNameIdentifier	 map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
matchType	TokenNameIdentifier	 match Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expandAndAdd	TokenNameIdentifier	 expand And Add
(	TokenNameLPAREN	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
srcMap	TokenNameIdentifier	 src Map
,	TokenNameCOMMA	
int	TokenNameint	
codePoint	TokenNameIdentifier	 code Point
,	TokenNameCOMMA	
int	TokenNameint	
matchType	TokenNameIdentifier	 match Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
oldLen	TokenNameIdentifier	 old Len
=	TokenNameEQUAL	
srcMap	TokenNameIdentifier	 src Map
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newMap	TokenNameIdentifier	 new Map
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
oldLen	TokenNameIdentifier	 old Len
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
srcMap	TokenNameIdentifier	 src Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
oldLen	TokenNameIdentifier	 old Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
oldLen	TokenNameIdentifier	 old Len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
codePoint	TokenNameIdentifier	 code Point
;	TokenNameSEMICOLON	
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
oldLen	TokenNameIdentifier	 old Len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
matchType	TokenNameIdentifier	 match Type
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
