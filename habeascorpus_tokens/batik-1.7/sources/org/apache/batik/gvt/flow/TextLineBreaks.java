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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
AttributedString	TokenNameIdentifier	 Attributed String
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
;	TokenNameSEMICOLON	
/** * * @version $Id: TextLineBreaks.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: TextLineBreaks.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
TextLineBreaks	TokenNameIdentifier	 Text Line Breaks
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
WORD_LIMIT	TokenNameIdentifier	 WORD  LIMIT
=	TokenNameEQUAL	
new	TokenNamenew	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
(	TokenNameLPAREN	
"WORD_LIMIT"	TokenNameStringLiteral	WORD_LIMIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
FLOW_PARAGRAPH	TokenNameIdentifier	 FLOW  PARAGRAPH
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
FLOW_PARAGRAPH	TokenNameIdentifier	 FLOW  PARAGRAPH
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
FLOW_LINE_BREAK	TokenNameIdentifier	 FLOW  LINE  BREAK
=	TokenNameEQUAL	
GVTAttributedCharacterIterator	TokenNameIdentifier	 GVT Attributed Character Iterator
.	TokenNameDOT	
TextAttribute	TokenNameIdentifier	 Text Attribute
.	TokenNameDOT	
FLOW_LINE_BREAK	TokenNameIdentifier	 FLOW  LINE  BREAK
;	TokenNameSEMICOLON	
static	TokenNamestatic	
Set	TokenNameIdentifier	 Set
lineBrks	TokenNameIdentifier	 line Brks
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
lineBrks	TokenNameIdentifier	 line Brks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FLOW_PARAGRAPH	TokenNameIdentifier	 FLOW  PARAGRAPH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineBrks	TokenNameIdentifier	 line Brks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FLOW_LINE_BREAK	TokenNameIdentifier	 FLOW  LINE  BREAK
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// placeholder function for complex break analysis 	TokenNameCOMMENT_LINE	placeholder function for complex break analysis 
static	TokenNamestatic	
int	TokenNameint	
findComplexBreak	TokenNameIdentifier	 find Complex Break
(	TokenNameLPAREN	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cnt	TokenNameIdentifier	 cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// .. do complex break analysis here Right now we aren't 	TokenNameCOMMENT_LINE	.. do complex break analysis here Right now we aren't 
// do any, we just find the end of the run of 	TokenNameCOMMENT_LINE	do any, we just find the end of the run of 
// CHAR_CLASS_SA. 	TokenNameCOMMENT_LINE	CHAR_CLASS_SA. 
if	TokenNameif	
(	TokenNameLPAREN	
getCharCharClass	TokenNameIdentifier	 get Char Char Class
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle spaces separately, all others by table 	TokenNameCOMMENT_LINE	handle spaces separately, all others by table 
// as - Attributed string to attribute with Word extents. 	TokenNameCOMMENT_LINE	as - Attributed string to attribute with Word extents. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
findLineBrk	TokenNameIdentifier	 find Line Brk
(	TokenNameLPAREN	
AttributedString	TokenNameIdentifier	 Attributed String
as	TokenNameIdentifier	 as
)	TokenNameRPAREN	
{	TokenNameLBRACE	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
aci	TokenNameIdentifier	 aci
=	TokenNameEQUAL	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
getIterator	TokenNameIdentifier	 get Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getEndIndex	TokenNameIdentifier	 get End Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prevCh	TokenNameIdentifier	 prev Ch
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
getCharCharClass	TokenNameIdentifier	 get Char Char Class
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cls	TokenNameIdentifier	 cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_LF	TokenNameIdentifier	 CHAR  CLASS  LF
)	TokenNameRPAREN	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
CHAR_CLASS_BK	TokenNameIdentifier	 CHAR  CLASS  BK
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
curCls	TokenNameIdentifier	 cur Cls
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
prevCls	TokenNameIdentifier	 prev Cls
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
prevPrevCls	TokenNameIdentifier	 prev Prev Cls
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
wordCnt	TokenNameIdentifier	 word Cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
wordBegin	TokenNameIdentifier	 word Begin
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getBeginIndex	TokenNameIdentifier	 get Begin Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// loop over all pairs in the string 	TokenNameCOMMENT_LINE	loop over all pairs in the string 
int	TokenNameint	
ich	TokenNameIdentifier	 ich
=	TokenNameEQUAL	
wordBegin	TokenNameIdentifier	 word Begin
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
lineBrks	TokenNameIdentifier	 line Brks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// handle case where input starts with an LF 	TokenNameCOMMENT_LINE	handle case where input starts with an LF 
if	TokenNameif	
(	TokenNameLPAREN	
cls	TokenNameIdentifier	 cls
>=	TokenNameGREATER_EQUAL	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
)	TokenNameRPAREN	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
;	TokenNameSEMICOLON	
ich	TokenNameIdentifier	 ich
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
prevCh	TokenNameIdentifier	 prev Ch
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
prevPrevCls	TokenNameIdentifier	 prev Prev Cls
=	TokenNameEQUAL	
prevCls	TokenNameIdentifier	 prev Cls
,	TokenNameCOMMA	
prevCls	TokenNameIdentifier	 prev Cls
=	TokenNameEQUAL	
curCls	TokenNameIdentifier	 cur Cls
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ich	TokenNameIdentifier	 ich
==	TokenNameEQUAL_EQUAL	
lineEnd	TokenNameIdentifier	 line End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
WORD_LIMIT	TokenNameIdentifier	 WORD  LIMIT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
wordCnt	TokenNameIdentifier	 word Cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wordBegin	TokenNameIdentifier	 word Begin
,	TokenNameCOMMA	
ich	TokenNameIdentifier	 ich
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordBegin	TokenNameIdentifier	 word Begin
=	TokenNameEQUAL	
ich	TokenNameIdentifier	 ich
;	TokenNameSEMICOLON	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
getCharCharClass	TokenNameIdentifier	 get Char Char Class
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curCls	TokenNameIdentifier	 cur Cls
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
;	TokenNameSEMICOLON	
prevCls	TokenNameIdentifier	 prev Cls
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cls	TokenNameIdentifier	 cls
>=	TokenNameGREATER_EQUAL	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
)	TokenNameRPAREN	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
;	TokenNameSEMICOLON	
lineEnd	TokenNameIdentifier	 line End
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
getRunLimit	TokenNameIdentifier	 get Run Limit
(	TokenNameLPAREN	
lineBrks	TokenNameIdentifier	 line Brks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle spaces 	TokenNameCOMMENT_LINE	handle spaces 
curCls	TokenNameIdentifier	 cur Cls
=	TokenNameEQUAL	
getCharCharClass	TokenNameIdentifier	 get Char Char Class
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curCls	TokenNameIdentifier	 cur Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_SP	TokenNameIdentifier	 CHAR  CLASS  SP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// pbrk[ich-1] = BREAK_ACTION_PROHIBITED; 	TokenNameCOMMENT_LINE	pbrk[ich-1] = BREAK_ACTION_PROHIBITED; 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle complex scripts 	TokenNameCOMMENT_LINE	handle complex scripts 
if	TokenNameif	
(	TokenNameLPAREN	
curCls	TokenNameIdentifier	 cur Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ich	TokenNameIdentifier	 ich
+=	TokenNamePLUS_EQUAL	
findComplexBreak	TokenNameIdentifier	 find Complex Break
(	TokenNameLPAREN	
aci	TokenNameIdentifier	 aci
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
prevCls	TokenNameIdentifier	 prev Cls
=	TokenNameEQUAL	
getCharCharClass	TokenNameIdentifier	 get Char Char Class
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
aci	TokenNameIdentifier	 aci
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
AttributedCharacterIterator	TokenNameIdentifier	 Attributed Character Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
curCls	TokenNameIdentifier	 cur Cls
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
getCharCharClass	TokenNameIdentifier	 get Char Char Class
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This isn't in the Unicode line breaking alg. but it 	TokenNameCOMMENT_LINE	This isn't in the Unicode line breaking alg. but it 
// seems needed as otherwise it does produce a break. 	TokenNameCOMMENT_LINE	seems needed as otherwise it does produce a break. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
CHAR_ZERO_WIDTH_JOINER	TokenNameIdentifier	 CHAR  ZERO  WIDTH  JOINER
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
prevCh	TokenNameIdentifier	 prev Ch
==	TokenNameEQUAL_EQUAL	
CHAR_ZERO_WIDTH_JOINER	TokenNameIdentifier	 CHAR  ZERO  WIDTH  JOINER
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Don't allow break around JOINER. 	TokenNameCOMMENT_LINE	Don't allow break around JOINER. 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
curCls	TokenNameIdentifier	 cur Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_BK	TokenNameIdentifier	 CHAR  CLASS  BK
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
curCls	TokenNameIdentifier	 cur Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_LF	TokenNameIdentifier	 CHAR  CLASS  LF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
WORD_LIMIT	TokenNameIdentifier	 WORD  LIMIT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
wordCnt	TokenNameIdentifier	 word Cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wordBegin	TokenNameIdentifier	 word Begin
,	TokenNameCOMMA	
ich	TokenNameIdentifier	 ich
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordBegin	TokenNameIdentifier	 word Begin
=	TokenNameEQUAL	
ich	TokenNameIdentifier	 ich
;	TokenNameSEMICOLON	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
CHAR_CLASS_BK	TokenNameIdentifier	 CHAR  CLASS  BK
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prevCls	TokenNameIdentifier	 prev Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_CR	TokenNameIdentifier	 CHAR  CLASS  CR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
WORD_LIMIT	TokenNameIdentifier	 WORD  LIMIT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
wordCnt	TokenNameIdentifier	 word Cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wordBegin	TokenNameIdentifier	 word Begin
,	TokenNameCOMMA	
ich	TokenNameIdentifier	 ich
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordBegin	TokenNameIdentifier	 word Begin
=	TokenNameEQUAL	
ich	TokenNameIdentifier	 ich
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
CHAR_CLASS_BK	TokenNameIdentifier	 CHAR  CLASS  BK
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curCls	TokenNameIdentifier	 cur Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_CR	TokenNameIdentifier	 CHAR  CLASS  CR
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle combining marks 	TokenNameCOMMENT_LINE	handle combining marks 
if	TokenNameif	
(	TokenNameLPAREN	
curCls	TokenNameIdentifier	 cur Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prevCls	TokenNameIdentifier	 prev Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_SP	TokenNameIdentifier	 CHAR  CLASS  SP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevPrevCls	TokenNameIdentifier	 prev Prev Cls
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
brkPairs	TokenNameIdentifier	 brk Pairs
[	TokenNameLBRACKET	
prevPrevCls	TokenNameIdentifier	 prev Prev Cls
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
BREAK_ACTION_DIRECT	TokenNameIdentifier	 BREAK  ACTION  DIRECT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
WORD_LIMIT	TokenNameIdentifier	 WORD  LIMIT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
wordCnt	TokenNameIdentifier	 word Cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wordBegin	TokenNameIdentifier	 word Begin
,	TokenNameCOMMA	
ich	TokenNameIdentifier	 ich
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordBegin	TokenNameIdentifier	 word Begin
=	TokenNameEQUAL	
ich	TokenNameIdentifier	 ich
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// pbrk[ich-2] = BREAK_ACTION_DIRECT; 	TokenNameCOMMENT_LINE	pbrk[ich-2] = BREAK_ACTION_DIRECT; 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// pbrk[ich-2] = BREAK_ACTION_PROHIBITED; 	TokenNameCOMMENT_LINE	pbrk[ich-2] = BREAK_ACTION_PROHIBITED; 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// pbrk[ich-1] = BREAK_ACTION_PROHIBITED; 	TokenNameCOMMENT_LINE	pbrk[ich-1] = BREAK_ACTION_PROHIBITED; 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cls	TokenNameIdentifier	 cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_BK	TokenNameIdentifier	 CHAR  CLASS  BK
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
curCls	TokenNameIdentifier	 cur Cls
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// lookup pair table information 	TokenNameCOMMENT_LINE	lookup pair table information 
byte	TokenNamebyte	
brk	TokenNameIdentifier	 brk
=	TokenNameEQUAL	
brkPairs	TokenNameIdentifier	 brk Pairs
[	TokenNameLBRACKET	
cls	TokenNameIdentifier	 cls
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
curCls	TokenNameIdentifier	 cur Cls
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
brk	TokenNameIdentifier	 brk
==	TokenNameEQUAL_EQUAL	
BREAK_ACTION_DIRECT	TokenNameIdentifier	 BREAK  ACTION  DIRECT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
WORD_LIMIT	TokenNameIdentifier	 WORD  LIMIT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
wordCnt	TokenNameIdentifier	 word Cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wordBegin	TokenNameIdentifier	 word Begin
,	TokenNameCOMMA	
ich	TokenNameIdentifier	 ich
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordBegin	TokenNameIdentifier	 word Begin
=	TokenNameEQUAL	
ich	TokenNameIdentifier	 ich
;	TokenNameSEMICOLON	
// pbrk[ich-1] = brk; 	TokenNameCOMMENT_LINE	pbrk[ich-1] = brk; 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
brk	TokenNameIdentifier	 brk
==	TokenNameEQUAL_EQUAL	
BREAK_ACTION_INDIRECT	TokenNameIdentifier	 BREAK  ACTION  INDIRECT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prevCls	TokenNameIdentifier	 prev Cls
==	TokenNameEQUAL_EQUAL	
CHAR_CLASS_SP	TokenNameIdentifier	 CHAR  CLASS  SP
)	TokenNameRPAREN	
{	TokenNameLBRACE	
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
WORD_LIMIT	TokenNameIdentifier	 WORD  LIMIT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
wordCnt	TokenNameIdentifier	 word Cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wordBegin	TokenNameIdentifier	 word Begin
,	TokenNameCOMMA	
ich	TokenNameIdentifier	 ich
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordBegin	TokenNameIdentifier	 word Begin
=	TokenNameEQUAL	
ich	TokenNameIdentifier	 ich
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// pbrk[ich-1] = ((prevCls == CHAR_CLASS_SP) ? 	TokenNameCOMMENT_LINE	pbrk[ich-1] = ((prevCls == CHAR_CLASS_SP) ? 
// BREAK_ACTION_INDIRECT : 	TokenNameCOMMENT_LINE	BREAK_ACTION_INDIRECT : 
// BREAK_ACTION_PROHIBITED); 	TokenNameCOMMENT_LINE	BREAK_ACTION_PROHIBITED); 
}	TokenNameRBRACE	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
curCls	TokenNameIdentifier	 cur Cls
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// always break at the end 	TokenNameCOMMENT_LINE	always break at the end 
as	TokenNameIdentifier	 as
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
WORD_LIMIT	TokenNameIdentifier	 WORD  LIMIT
,	TokenNameCOMMA	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
wordCnt	TokenNameIdentifier	 word Cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
wordBegin	TokenNameIdentifier	 word Begin
,	TokenNameCOMMA	
ich	TokenNameIdentifier	 ich
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordBegin	TokenNameIdentifier	 word Begin
=	TokenNameEQUAL	
ich	TokenNameIdentifier	 ich
;	TokenNameSEMICOLON	
// pbrk[ich-1] = BREAK_ACTION_DIRECT; 	TokenNameCOMMENT_LINE	pbrk[ich-1] = BREAK_ACTION_DIRECT; 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stringToLineBreakClasses	TokenNameIdentifier	 string To Line Break Classes
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getCharCharClass	TokenNameIdentifier	 get Char Char Class
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
byte	TokenNamebyte	
getCharCharClass	TokenNameIdentifier	 get Char Char Class
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
QUICK_LUT_SIZE	TokenNameIdentifier	 QUICK  LUT  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
quickLut	TokenNameIdentifier	 quick Lut
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buildQuickLut	TokenNameIdentifier	 build Quick Lut
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
quickLut	TokenNameIdentifier	 quick Lut
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
raw_data	TokenNameIdentifier	 raw data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
<=	TokenNameLESS_EQUAL	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
raw_data	TokenNameIdentifier	 raw data
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
entry	TokenNameIdentifier	 entry
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
raw_data	TokenNameIdentifier	 raw data
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
entry	TokenNameIdentifier	 entry
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
min	TokenNameIdentifier	 min
)	TokenNameRPAREN	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>	TokenNameGREATER	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
raw_classes	TokenNameIdentifier	 raw classes
[	TokenNameLBRACKET	
entry	TokenNameIdentifier	 entry
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
CHAR_ZERO_WIDTH_JOINER	TokenNameIdentifier	 CHAR  ZERO  WIDTH  JOINER
=	TokenNameEQUAL	
0x200D	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
QUICK_LUT_SIZE	TokenNameIdentifier	 QUICK  LUT  SIZE
=	TokenNameEQUAL	
256	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
buildQuickLut	TokenNameIdentifier	 build Quick Lut
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
quickLut	TokenNameIdentifier	 quick Lut
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
QUICK_LUT_SIZE	TokenNameIdentifier	 QUICK  LUT  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
QUICK_LUT_SIZE	TokenNameIdentifier	 QUICK  LUT  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
raw_data	TokenNameIdentifier	 raw data
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
entry	TokenNameIdentifier	 entry
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
cls	TokenNameIdentifier	 cls
=	TokenNameEQUAL	
raw_classes	TokenNameIdentifier	 raw classes
[	TokenNameLBRACKET	
entry	TokenNameIdentifier	 entry
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
quickLut	TokenNameIdentifier	 quick Lut
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cls	TokenNameIdentifier	 cls
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
QUICK_LUT_SIZE	TokenNameIdentifier	 QUICK  LUT  SIZE
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
entry	TokenNameIdentifier	 entry
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// direct break (blank in table) 	TokenNameCOMMENT_LINE	direct break (blank in table) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
BREAK_ACTION_DIRECT	TokenNameIdentifier	 BREAK  ACTION  DIRECT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// indirect break (% in table) 	TokenNameCOMMENT_LINE	indirect break (% in table) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
BREAK_ACTION_INDIRECT	TokenNameIdentifier	 BREAK  ACTION  INDIRECT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// prohibited break (^ in table) 	TokenNameCOMMENT_LINE	prohibited break (^ in table) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
BREAK_ACTION_PROHIBITED	TokenNameIdentifier	 BREAK  ACTION  PROHIBITED
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
brkStrs	TokenNameIdentifier	 brk Strs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"DB"	TokenNameStringLiteral	DB
,	TokenNameCOMMA	
"IB"	TokenNameStringLiteral	IB
,	TokenNameCOMMA	
"PB"	TokenNameStringLiteral	PB
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_GL	TokenNameIdentifier	 CHAR  CLASS  GL
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
=	TokenNameEQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_EX	TokenNameIdentifier	 CHAR  CLASS  EX
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_SY	TokenNameIdentifier	 CHAR  CLASS  SY
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_IS	TokenNameIdentifier	 CHAR  CLASS  IS
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
=	TokenNameEQUAL	
9	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_IN	TokenNameIdentifier	 CHAR  CLASS  IN
=	TokenNameEQUAL	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_HY	TokenNameIdentifier	 CHAR  CLASS  HY
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
=	TokenNameEQUAL	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_BB	TokenNameIdentifier	 CHAR  CLASS  BB
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_B2	TokenNameIdentifier	 CHAR  CLASS  B2
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_ZW	TokenNameIdentifier	 CHAR  CLASS  ZW
=	TokenNameEQUAL	
18	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_SP	TokenNameIdentifier	 CHAR  CLASS  SP
=	TokenNameEQUAL	
21	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_BK	TokenNameIdentifier	 CHAR  CLASS  BK
=	TokenNameEQUAL	
22	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
=	TokenNameEQUAL	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
;	TokenNameSEMICOLON	
// 23; 	TokenNameCOMMENT_LINE	23; 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_CR	TokenNameIdentifier	 CHAR  CLASS  CR
=	TokenNameEQUAL	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Can't occur (space res) 	TokenNameCOMMENT_LINE	Can't occur (space res) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_LF	TokenNameIdentifier	 CHAR  CLASS  LF
=	TokenNameEQUAL	
25	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Can't occur (space res) 	TokenNameCOMMENT_LINE	Can't occur (space res) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_SG	TokenNameIdentifier	 CHAR  CLASS  SG
=	TokenNameEQUAL	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
;	TokenNameSEMICOLON	
// 26; 	TokenNameCOMMENT_LINE	26; 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_XX	TokenNameIdentifier	 CHAR  CLASS  XX
=	TokenNameEQUAL	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
;	TokenNameSEMICOLON	
// 27; 	TokenNameCOMMENT_LINE	27; 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
CHAR_CLASS_CB	TokenNameIdentifier	 CHAR  CLASS  CB
=	TokenNameEQUAL	
28	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
clsStrs	TokenNameIdentifier	 cls Strs
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"OP"	TokenNameStringLiteral	OP
,	TokenNameCOMMA	
"CL"	TokenNameStringLiteral	CL
,	TokenNameCOMMA	
"QU"	TokenNameStringLiteral	QU
,	TokenNameCOMMA	
"GL"	TokenNameStringLiteral	GL
,	TokenNameCOMMA	
"NS"	TokenNameStringLiteral	NS
,	TokenNameCOMMA	
"EX"	TokenNameStringLiteral	EX
,	TokenNameCOMMA	
"SY"	TokenNameStringLiteral	SY
,	TokenNameCOMMA	
"IS"	TokenNameStringLiteral	IS
,	TokenNameCOMMA	
"PR"	TokenNameStringLiteral	PR
,	TokenNameCOMMA	
"PO"	TokenNameStringLiteral	PO
,	TokenNameCOMMA	
"NU"	TokenNameStringLiteral	NU
,	TokenNameCOMMA	
"AL"	TokenNameStringLiteral	AL
,	TokenNameCOMMA	
"ID"	TokenNameStringLiteral	ID
,	TokenNameCOMMA	
"IN"	TokenNameStringLiteral	IN
,	TokenNameCOMMA	
"HY"	TokenNameStringLiteral	HY
,	TokenNameCOMMA	
"BA"	TokenNameStringLiteral	BA
,	TokenNameCOMMA	
"BB"	TokenNameStringLiteral	BB
,	TokenNameCOMMA	
"B2"	TokenNameStringLiteral	B2
,	TokenNameCOMMA	
"ZW"	TokenNameStringLiteral	ZW
,	TokenNameCOMMA	
"CM"	TokenNameStringLiteral	CM
,	TokenNameCOMMA	
"SA"	TokenNameStringLiteral	SA
,	TokenNameCOMMA	
"SP"	TokenNameStringLiteral	SP
,	TokenNameCOMMA	
"BK"	TokenNameStringLiteral	BK
,	TokenNameCOMMA	
"AI"	TokenNameStringLiteral	AI
,	TokenNameCOMMA	
"CR"	TokenNameStringLiteral	CR
,	TokenNameCOMMA	
"LF"	TokenNameStringLiteral	LF
,	TokenNameCOMMA	
"SG"	TokenNameStringLiteral	SG
,	TokenNameCOMMA	
"XX"	TokenNameStringLiteral	XX
,	TokenNameCOMMA	
"CB"	TokenNameStringLiteral	CB
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
brkPairs	TokenNameIdentifier	 brk Pairs
=	TokenNameEQUAL	
// ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, % 	TokenNameCOMMENT_LINE	^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, ^, % 
{	TokenNameLBRACE	
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 0 	TokenNameCOMMENT_LINE	0 
// _, ^, %, %, ^, ^, ^, ^, _, %, _, _, _, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, ^, ^, ^, ^, _, %, _, _, _, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 1 	TokenNameCOMMENT_LINE	1 
// ^, ^, %, %, %, ^, ^, ^, %, %, %, %, %, %, %, %, %, %, ^, % 	TokenNameCOMMENT_LINE	^, ^, %, %, %, ^, ^, ^, %, %, %, %, %, %, %, %, %, %, ^, % 
{	TokenNameLBRACE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 2 	TokenNameCOMMENT_LINE	2 
// %, ^, %, %, %, ^, ^, ^, %, %, %, %, %, %, %, %, %, %, ^, % 	TokenNameCOMMENT_LINE	%, ^, %, %, %, ^, ^, ^, %, %, %, %, %, %, %, %, %, %, ^, % 
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 3 	TokenNameCOMMENT_LINE	3 
// _, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 4 	TokenNameCOMMENT_LINE	4 
// _, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 5 	TokenNameCOMMENT_LINE	5 
// _, ^, %, %, %, ^, ^, ^, _, _, %, _, _, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, %, _, _, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 6 	TokenNameCOMMENT_LINE	6 
// _, ^, %, %, %, ^, ^, ^, _, _, %, _, _, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, %, _, _, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 7 	TokenNameCOMMENT_LINE	7 
// %, ^, %, %, %, ^, ^, ^, _, _, %, %, %, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	%, ^, %, %, %, ^, ^, ^, _, _, %, %, %, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 8 	TokenNameCOMMENT_LINE	8 
// _, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 9 	TokenNameCOMMENT_LINE	9 
// _, ^, %, %, %, ^, ^, ^, _, %, %, %, _, %, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, %, %, %, _, %, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 10 	TokenNameCOMMENT_LINE	10 
// _, ^, %, %, %, ^, ^, ^, _, _, %, %, _, %, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, %, %, _, %, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 11 	TokenNameCOMMENT_LINE	11 
// _, ^, %, %, %, ^, ^, ^, _, %, _, _, _, %, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, %, _, _, _, %, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 12 	TokenNameCOMMENT_LINE	12 
// _, ^, %, %, %, ^, ^, ^, _, _, _, _, _, %, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, _, _, _, %, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 13 	TokenNameCOMMENT_LINE	13 
// _, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 14 	TokenNameCOMMENT_LINE	14 
// _, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 15 	TokenNameCOMMENT_LINE	15 
// %, ^, %, %, %, ^, ^, ^, %, %, %, %, %, %, %, %, %, %, ^, % 	TokenNameCOMMENT_LINE	%, ^, %, %, %, ^, ^, ^, %, %, %, %, %, %, %, %, %, %, ^, % 
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 16 	TokenNameCOMMENT_LINE	16 
// _, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, ^, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, _, _, _, _, %, %, _, ^, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 17 	TokenNameCOMMENT_LINE	17 
// _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, ^, % 	TokenNameCOMMENT_LINE	_, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
// 18 	TokenNameCOMMENT_LINE	18 
// _, ^, %, %, %, ^, ^, ^, _, _, %, %, _, %, %, %, _, _, ^, % 	TokenNameCOMMENT_LINE	_, ^, %, %, %, ^, ^, ^, _, _, %, %, _, %, %, %, _, _, ^, % 
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 19 	TokenNameCOMMENT_LINE	19 
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
quickLut	TokenNameIdentifier	 quick Lut
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
raw_data	TokenNameIdentifier	 raw data
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0009	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0009	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x000E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x001F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0021	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0021	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0022	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0022	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0023	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0023	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0024	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0024	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0025	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0025	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0026	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0026	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0028	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0028	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0029	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0029	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x002F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0030	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0039	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x003F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x005E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x007F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x009F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00AF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00B6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00BA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00BB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00BB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00BC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00C5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00C6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00C6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00C7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00CF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00D9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00DD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00DE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00E1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00E2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00E5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00E7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00E7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00E8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00EB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00EB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00EC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00ED	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00EE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00EF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00F7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x00FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0111	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0111	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0112	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0112	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0114	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x011A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x011B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x011B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x011C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0125	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0126	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0127	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x012A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x012B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x012B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x012C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0130	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0131	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0133	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0134	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0137	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0138	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0138	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0139	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x013E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x013F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0142	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0143	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0143	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0144	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0144	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0145	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0147	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0148	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x014A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x014B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x014C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x014D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x014D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x014E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0151	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0152	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0153	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0154	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0165	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0166	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0167	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0168	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x016A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x016B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x016B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x016C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01CD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01CE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01CE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01CF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01CF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01D9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01DA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01DA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01DB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01DB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x01DD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0250	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0251	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0251	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0252	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0260	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0261	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0261	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0262	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02C6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02C7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02C7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02C8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02C8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02C9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02CB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02CC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02CC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02CD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02CD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02CE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02CF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02D1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02D7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02D8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02DB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02DD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02DD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02DE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x02EE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0300	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x036F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0374	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0390	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0391	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03AA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03B0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03B1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03C1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03C2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03C2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03C3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03C9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x03CA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0400	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0401	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0401	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0402	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x040F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0410	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x044F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0450	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0450	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0451	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0451	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0452	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0482	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0483	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0489	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x048A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0587	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0589	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0589	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x058A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x058A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0591	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05BD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05BE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05BE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05C4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x05D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x064A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x064B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0655	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0660	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0669	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x066A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x066F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0670	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0670	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0671	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06D5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06E9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06ED	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06F9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x06FA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x070D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x070F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x070F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0710	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0710	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0711	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0711	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0712	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x072C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0730	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x074A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0780	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x07A5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x07A6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x07B0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x07B1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x07B1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0901	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0903	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0905	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0939	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x093C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x093C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x093D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x093D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x093E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x094D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0950	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0950	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0951	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0954	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0958	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0961	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0962	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0963	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0964	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0965	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0966	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x096F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0970	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0981	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0983	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0985	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09B9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09BC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09D7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09E1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09E2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09E3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09EF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09F1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09F2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09F3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09F4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x09FA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A02	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A02	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A4D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A5E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0A85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ABC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ABC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ABD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ABD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ABE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ACD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AD0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AE0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AE6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0AEF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0B83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BBE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BD7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BE7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BEF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BF0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0BF2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0C85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CB9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CBE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CD6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CDE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CE1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CE6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0CEF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D02	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D6F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0D85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0DC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0DCA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0DF3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0DF4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0DF4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E3A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E4E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E4F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E4F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E5A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E5B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0E81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EB4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EBC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EBD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EC8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ECD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ED0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0ED9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EDC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0EDD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F0B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F0B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F0D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F1A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F1F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F29	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F2A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F6A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F88	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F8B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0F90	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FBC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FBE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FC5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FC6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FC7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x0FCF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x102A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x102C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1039	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1040	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1049	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x104A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x104F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1050	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1055	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1056	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1059	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10A0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x10FB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x115F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1160	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x11F9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x135A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1361	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1361	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1362	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1368	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1369	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1371	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1372	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1676	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1680	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1680	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1681	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x169A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x169B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x169B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x169C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x169C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x16A0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1711	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1712	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1714	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1720	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1731	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1732	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1734	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1735	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1751	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1752	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1753	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1760	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1770	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1772	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1773	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1780	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17B3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17B4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17D3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17D4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17D4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17D5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17D5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17D6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17DA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17DB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17DB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17E0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x17E9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1805	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1806	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1806	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1807	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x180A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x180B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x180E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1810	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1819	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1820	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x18A8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x18A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x18A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1E00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1FFE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2006	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2007	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2007	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x200A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x200B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x200B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x200C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x200F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2010	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2010	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2011	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2011	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2012	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2013	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2014	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2014	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2015	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2016	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2017	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2017	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2018	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2019	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x201A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x201A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x201B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x201D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x201E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x201E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x201F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x201F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2021	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2022	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2023	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2024	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2026	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2027	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2028	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2029	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x202A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x202E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x202F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x202F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2030	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2037	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2038	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2038	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2039	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x203A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x203B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x203B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x203C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x203C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x203D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2043	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2044	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2044	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2045	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2045	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2046	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2046	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2047	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2057	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x205F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x205F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2060	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2060	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2061	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2063	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x206A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x206F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2070	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2071	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2074	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2074	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2075	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x207C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x207D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x207D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x207E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x207E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x207F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x207F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2080	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2080	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2081	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2084	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2085	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x208C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x208D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x208D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x208E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x208E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20A0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20A6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20A7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20A7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20A8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20B1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x20EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2100	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2103	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2103	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2104	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2105	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2105	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2106	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2108	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2109	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2109	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x210A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2112	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2113	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2114	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2115	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2116	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2116	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2117	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2120	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2121	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2122	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2123	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2125	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2126	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2126	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2127	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x212A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x212B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x212B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x212C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x213F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2140	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2140	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2141	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2153	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2154	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2155	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2156	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x215F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2160	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x216B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x216C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x216F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2170	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2179	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x217A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2183	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2190	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2199	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x219A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21D1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21D2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21D2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21D3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21D3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21D4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21D4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21D5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2201	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2201	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2202	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2203	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2204	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2206	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2207	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2208	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2209	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x220A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x220B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x220B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x220C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x220E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x220F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x220F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2210	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2210	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2211	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2211	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2212	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2213	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2214	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2214	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2215	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2215	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2216	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2219	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x221A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x221A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x221B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x221C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x221D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2220	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2221	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2222	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2223	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2223	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2224	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2224	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2225	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2226	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2226	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2227	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x222C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x222D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x222D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x222E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x222E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x222F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2233	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2234	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2237	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2238	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x223B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x223C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x223D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x223E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2247	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2248	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2248	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2249	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x224B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x224C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x224C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x224D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2251	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2252	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2252	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2253	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x225F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2260	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2261	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2262	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2263	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2264	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2267	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2268	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2269	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x226A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x226B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x226C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x226D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x226E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x226F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2270	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2281	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2282	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2283	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2284	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2285	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2286	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2287	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2288	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2294	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2295	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2295	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2296	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2298	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2299	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2299	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x229A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22A4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22A5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22A5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22A6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22BE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x22C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2311	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2312	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2312	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2313	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2328	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2329	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2329	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x232A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x232A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x232B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23B3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23B4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23B4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23B5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23B5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23B6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23B6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x23B7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x244A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2460	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24CF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24D0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24E9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x24EB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x254B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x254C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x254F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2550	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2574	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2575	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x257F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2580	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x258F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2590	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2591	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2592	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2595	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2596	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x259F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25A0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25A1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25A2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25A2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25A3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25AA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25B1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25B2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25B3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25B4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25B5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25B6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25B7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25B8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25BB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25BC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25BD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25BE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25BF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25C0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25C1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25C2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25C5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25C6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25C8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25C9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25CA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25CB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25CB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25CC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25CD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25CE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25D1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25D2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25E1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25E2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25E5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25EE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25EF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25EF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x25F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2604	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2605	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2606	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2607	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2608	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2609	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2609	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x260A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x260D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x260E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x260F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2610	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2613	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2616	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2617	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2619	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x261B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x261C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x261C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x261D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x261D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x261E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x261E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x261F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x263F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2640	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2641	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2641	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2642	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2642	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2643	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x265F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2660	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2661	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2662	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2662	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2663	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2665	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2666	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2666	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2667	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x266F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2670	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x275A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x275B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x275E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2761	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2761	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2762	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2763	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2764	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2767	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2768	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2768	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2769	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2769	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x276F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2770	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2770	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2771	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2771	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2772	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2772	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2773	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2773	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2774	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2774	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2775	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2775	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2776	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27E9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27EA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27EB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27EB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x27F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2982	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2983	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2983	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2984	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2984	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2985	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2985	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2986	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2986	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2987	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2987	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2988	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2988	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2989	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2989	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x298F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2990	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2990	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2991	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2991	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2992	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2992	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2993	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2993	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2994	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2994	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2995	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2995	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2996	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2996	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2997	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2997	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2998	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2998	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2999	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29D7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29D8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29D8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29D9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29D9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29DA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29DA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29DB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29DB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29DC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29FB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29FC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29FC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29FD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29FD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x29FE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2AFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2E80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3001	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3002	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3003	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3004	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3005	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3005	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3006	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3007	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3008	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3009	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3009	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x300F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3010	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3010	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3011	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3011	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3012	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3013	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3014	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3014	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3015	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3015	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3016	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3016	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3017	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3017	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3018	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3018	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3019	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3019	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x301F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3020	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3029	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x302A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x302F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3030	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x303A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x303B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x303C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x303D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x303F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3041	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3041	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3042	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3042	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3043	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3043	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3044	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3044	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3045	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3045	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3046	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3046	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3047	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3047	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3048	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3048	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3049	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3049	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x304A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3062	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3063	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3063	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3064	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3082	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3083	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3083	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3084	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3084	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3085	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3085	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3086	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3086	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3087	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3087	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3088	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x308D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x308E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x308E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x308F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3094	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3095	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3096	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3099	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x309A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x309B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x309E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x309F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x309F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30A9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30AA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30C2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30C3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30C3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30C4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30E8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30ED	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30EE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30EE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30EF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30F4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30F5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30F6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30F7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FA	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x30FE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x31B7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x31F0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x31FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xD7A3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xD800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xDFFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xE000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xF8FF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xF900	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFA6A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFB00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFB1D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFB1E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFB1E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFB1F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFD3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFD3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFD3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFD3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFD3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFD50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFDFB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFDFC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFDFC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE23	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE30	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE38	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE39	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE3F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE40	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE44	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE45	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE4F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE50	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE54	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE55	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE57	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE58	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE59	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE5F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE68	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE69	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE6A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE6A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE6B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE6B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFE70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEFC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFEFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF01	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF02	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF03	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF04	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF04	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF05	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF06	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF07	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF08	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF08	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF09	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF09	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF0F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF19	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF1A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF1B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF1C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF1E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF1F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF1F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF3A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF3B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF3B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF3C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF3D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF3E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5A	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5B	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5C	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF5F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF67	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF70	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF9D	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF9E	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFF9F	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFA0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFDC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFE8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFEE	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFF9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFB	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFC	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFD	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xFFFF	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
raw_classes	TokenNameIdentifier	 raw classes
=	TokenNameEQUAL	
{	TokenNameLBRACE	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_LF	TokenNameIdentifier	 CHAR  CLASS  LF
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_BK	TokenNameIdentifier	 CHAR  CLASS  BK
,	TokenNameCOMMA	
CHAR_CLASS_CR	TokenNameIdentifier	 CHAR  CLASS  CR
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_SP	TokenNameIdentifier	 CHAR  CLASS  SP
,	TokenNameCOMMA	
CHAR_CLASS_EX	TokenNameIdentifier	 CHAR  CLASS  EX
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_IS	TokenNameIdentifier	 CHAR  CLASS  IS
,	TokenNameCOMMA	
CHAR_CLASS_HY	TokenNameIdentifier	 CHAR  CLASS  HY
,	TokenNameCOMMA	
CHAR_CLASS_IS	TokenNameIdentifier	 CHAR  CLASS  IS
,	TokenNameCOMMA	
CHAR_CLASS_SY	TokenNameIdentifier	 CHAR  CLASS  SY
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_IS	TokenNameIdentifier	 CHAR  CLASS  IS
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_EX	TokenNameIdentifier	 CHAR  CLASS  EX
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_GL	TokenNameIdentifier	 CHAR  CLASS  GL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_BB	TokenNameIdentifier	 CHAR  CLASS  BB
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_BB	TokenNameIdentifier	 CHAR  CLASS  BB
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_BB	TokenNameIdentifier	 CHAR  CLASS  BB
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_IS	TokenNameIdentifier	 CHAR  CLASS  IS
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_GL	TokenNameIdentifier	 CHAR  CLASS  GL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_SA	TokenNameIdentifier	 CHAR  CLASS  SA
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_BB	TokenNameIdentifier	 CHAR  CLASS  BB
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NU	TokenNameIdentifier	 CHAR  CLASS  NU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_GL	TokenNameIdentifier	 CHAR  CLASS  GL
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_ZW	TokenNameIdentifier	 CHAR  CLASS  ZW
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_GL	TokenNameIdentifier	 CHAR  CLASS  GL
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_B2	TokenNameIdentifier	 CHAR  CLASS  B2
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_IN	TokenNameIdentifier	 CHAR  CLASS  IN
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_BK	TokenNameIdentifier	 CHAR  CLASS  BK
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_GL	TokenNameIdentifier	 CHAR  CLASS  GL
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_BA	TokenNameIdentifier	 CHAR  CLASS  BA
,	TokenNameCOMMA	
CHAR_CLASS_GL	TokenNameIdentifier	 CHAR  CLASS  GL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_QU	TokenNameIdentifier	 CHAR  CLASS  QU
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_EX	TokenNameIdentifier	 CHAR  CLASS  EX
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_SG	TokenNameIdentifier	 CHAR  CLASS  SG
,	TokenNameCOMMA	
CHAR_CLASS_XX	TokenNameIdentifier	 CHAR  CLASS  XX
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_EX	TokenNameIdentifier	 CHAR  CLASS  EX
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_GL	TokenNameIdentifier	 CHAR  CLASS  GL
,	TokenNameCOMMA	
CHAR_CLASS_EX	TokenNameIdentifier	 CHAR  CLASS  EX
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_EX	TokenNameIdentifier	 CHAR  CLASS  EX
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_OP	TokenNameIdentifier	 CHAR  CLASS  OP
,	TokenNameCOMMA	
CHAR_CLASS_CL	TokenNameIdentifier	 CHAR  CLASS  CL
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_NS	TokenNameIdentifier	 CHAR  CLASS  NS
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_PO	TokenNameIdentifier	 CHAR  CLASS  PO
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_ID	TokenNameIdentifier	 CHAR  CLASS  ID
,	TokenNameCOMMA	
CHAR_CLASS_PR	TokenNameIdentifier	 CHAR  CLASS  PR
,	TokenNameCOMMA	
CHAR_CLASS_AL	TokenNameIdentifier	 CHAR  CLASS  AL
,	TokenNameCOMMA	
CHAR_CLASS_CM	TokenNameIdentifier	 CHAR  CLASS  CM
,	TokenNameCOMMA	
CHAR_CLASS_CB	TokenNameIdentifier	 CHAR  CLASS  CB
,	TokenNameCOMMA	
CHAR_CLASS_AI	TokenNameIdentifier	 CHAR  CLASS  AI
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
