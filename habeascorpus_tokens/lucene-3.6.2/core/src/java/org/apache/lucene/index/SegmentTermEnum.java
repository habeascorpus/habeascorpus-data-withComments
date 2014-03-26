package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
IndexInput	TokenNameIdentifier	 Index Input
;	TokenNameSEMICOLON	
final	TokenNamefinal	
class	TokenNameclass	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
extends	TokenNameextends	
TermEnum	TokenNameIdentifier	 Term Enum
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
private	TokenNameprivate	
IndexInput	TokenNameIdentifier	 Index Input
input	TokenNameIdentifier	 input
;	TokenNameSEMICOLON	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
long	TokenNamelong	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermBuffer	TokenNameIdentifier	 Term Buffer
termBuffer	TokenNameIdentifier	 term Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
TermBuffer	TokenNameIdentifier	 Term Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermBuffer	TokenNameIdentifier	 Term Buffer
prevBuffer	TokenNameIdentifier	 prev Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
TermBuffer	TokenNameIdentifier	 Term Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TermBuffer	TokenNameIdentifier	 Term Buffer
scanBuffer	TokenNameIdentifier	 scan Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
TermBuffer	TokenNameIdentifier	 Term Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// used for scanning 	TokenNameCOMMENT_LINE	used for scanning 
private	TokenNameprivate	
TermInfo	TokenNameIdentifier	 Term Info
termInfo	TokenNameIdentifier	 term Info
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
isIndex	TokenNameIdentifier	 is Index
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
long	TokenNamelong	
indexPointer	TokenNameIdentifier	 index Pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
indexInterval	TokenNameIdentifier	 index Interval
;	TokenNameSEMICOLON	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
int	TokenNameint	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
formatM1SkipInterval	TokenNameIdentifier	 format M1 Skip Interval
;	TokenNameSEMICOLON	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
FieldInfos	TokenNameIdentifier	 Field Infos
fis	TokenNameIdentifier	 fis
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isi	TokenNameIdentifier	 isi
)	TokenNameRPAREN	
throws	TokenNamethrows	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
fis	TokenNameIdentifier	 fis
;	TokenNameSEMICOLON	
isIndex	TokenNameIdentifier	 is Index
=	TokenNameEQUAL	
isi	TokenNameIdentifier	 isi
;	TokenNameSEMICOLON	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// use single-level skip lists for formats > -3 	TokenNameCOMMENT_LINE	use single-level skip lists for formats > -3 
int	TokenNameint	
firstInt	TokenNameIdentifier	 first Int
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstInt	TokenNameIdentifier	 first Int
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// original-format file, without explicit format version number 	TokenNameCOMMENT_LINE	original-format file, without explicit format version number 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
firstInt	TokenNameIdentifier	 first Int
;	TokenNameSEMICOLON	
// back-compatible settings 	TokenNameCOMMENT_LINE	back-compatible settings 
indexInterval	TokenNameIdentifier	 index Interval
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// switch off skipTo optimization 	TokenNameCOMMENT_LINE	switch off skipTo optimization 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we have a format version number 	TokenNameCOMMENT_LINE	we have a format version number 
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
firstInt	TokenNameIdentifier	 first Int
;	TokenNameSEMICOLON	
// check that it is a format we can understand 	TokenNameCOMMENT_LINE	check that it is a format we can understand 
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<	TokenNameLESS	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
.	TokenNameDOT	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IndexFormatTooNewException	TokenNameIdentifier	 Index Format Too New Exception
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
.	TokenNameDOT	
FORMAT_CURRENT	TokenNameIdentifier	 FORMAT  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read the size 	TokenNameCOMMENT_LINE	read the size 
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isIndex	TokenNameIdentifier	 is Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexInterval	TokenNameIdentifier	 index Interval
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
formatM1SkipInterval	TokenNameIdentifier	 format M1 Skip Interval
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// switch off skipTo optimization for file format prior to 1.4rc2 in order to avoid a bug in 	TokenNameCOMMENT_LINE	switch off skipTo optimization for file format prior to 1.4rc2 in order to avoid a bug in 
// skipTo implementation of these versions 	TokenNameCOMMENT_LINE	skipTo implementation of these versions 
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
indexInterval	TokenNameIdentifier	 index Interval
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
<=	TokenNameLESS_EQUAL	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
.	TokenNameDOT	
FORMAT	TokenNameIdentifier	 FORMAT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this new format introduces multi-level skipping 	TokenNameCOMMENT_LINE	this new format introduces multi-level skipping 
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
indexInterval	TokenNameIdentifier	 index Interval
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"indexInterval="	TokenNameStringLiteral	indexInterval=
+	TokenNamePLUS	
indexInterval	TokenNameIdentifier	 index Interval
+	TokenNamePLUS	
" is negative; must be > 0"	TokenNameStringLiteral	 is negative; must be > 0
;	TokenNameSEMICOLON	
assert	TokenNameassert	
skipInterval	TokenNameIdentifier	 skip Interval
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"skipInterval="	TokenNameStringLiteral	skipInterval=
+	TokenNamePLUS	
skipInterval	TokenNameIdentifier	 skip Interval
+	TokenNamePLUS	
" is negative; must be > 0"	TokenNameStringLiteral	 is negative; must be > 0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
>	TokenNameGREATER	
TermInfosWriter	TokenNameIdentifier	 Term Infos Writer
.	TokenNameDOT	
FORMAT_VERSION_UTF8_LENGTH_IN_BYTES	TokenNameIdentifier	 FORMAT  VERSION  UT F8  LENGTH  IN  BYTES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termBuffer	TokenNameIdentifier	 term Buffer
.	TokenNameDOT	
setPreUTF8Strings	TokenNameIdentifier	 set Pre UT F8 Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanBuffer	TokenNameIdentifier	 scan Buffer
.	TokenNameDOT	
setPreUTF8Strings	TokenNameIdentifier	 set Pre UT F8 Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevBuffer	TokenNameIdentifier	 prev Buffer
.	TokenNameDOT	
setPreUTF8Strings	TokenNameIdentifier	 set Pre UT F8 Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
)	TokenNameRPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
input	TokenNameIdentifier	 input
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
termInfo	TokenNameIdentifier	 term Info
=	TokenNameEQUAL	
new	TokenNamenew	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
termBuffer	TokenNameIdentifier	 term Buffer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermBuffer	TokenNameIdentifier	 Term Buffer
)	TokenNameRPAREN	
termBuffer	TokenNameIdentifier	 term Buffer
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
prevBuffer	TokenNameIdentifier	 prev Buffer
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TermBuffer	TokenNameIdentifier	 Term Buffer
)	TokenNameRPAREN	
prevBuffer	TokenNameIdentifier	 prev Buffer
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
scanBuffer	TokenNameIdentifier	 scan Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
TermBuffer	TokenNameIdentifier	 Term Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
long	TokenNamelong	
pointer	TokenNameIdentifier	 pointer
,	TokenNameCOMMA	
long	TokenNamelong	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
termBuffer	TokenNameIdentifier	 term Buffer
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prevBuffer	TokenNameIdentifier	 prev Buffer
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Increments the enumeration to the next element. True if one exists.*/	TokenNameCOMMENT_JAVADOC	 Increments the enumeration to the next element. True if one exists.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
>=	TokenNameGREATER_EQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prevBuffer	TokenNameIdentifier	 prev Buffer
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
termBuffer	TokenNameIdentifier	 term Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termBuffer	TokenNameIdentifier	 term Buffer
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prevBuffer	TokenNameIdentifier	 prev Buffer
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
termBuffer	TokenNameIdentifier	 term Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termBuffer	TokenNameIdentifier	 term Buffer
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read doc freq 	TokenNameCOMMENT_LINE	read doc freq 
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
+=	TokenNamePLUS_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read freq pointer 	TokenNameCOMMENT_LINE	read freq pointer 
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
+=	TokenNamePLUS_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read prox pointer 	TokenNameCOMMENT_LINE	read prox pointer 
if	TokenNameif	
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// just read skipOffset in order to increment file pointer; 	TokenNameCOMMENT_LINE	just read skipOffset in order to increment file pointer; 
// value is never used since skipTo is switched off 	TokenNameCOMMENT_LINE	value is never used since skipTo is switched off 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isIndex	TokenNameIdentifier	 is Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
>	TokenNameGREATER	
formatM1SkipInterval	TokenNameIdentifier	 format M1 Skip Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
>=	TokenNameGREATER_EQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isIndex	TokenNameIdentifier	 is Index
)	TokenNameRPAREN	
indexPointer	TokenNameIdentifier	 index Pointer
+=	TokenNamePLUS_EQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
readVLong	TokenNameIdentifier	 read V Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read index pointer 	TokenNameCOMMENT_LINE	read index pointer 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Optimized scan, without allocating new terms. * Return number of invocations to next(). * * NOTE: LUCENE-3183: if you pass Term("", "") here then this * will incorrectly return before positioning the enum, * and position will be -1; caller must detect this. */	TokenNameCOMMENT_BLOCK	 Optimized scan, without allocating new terms. Return number of invocations to next(). * NOTE: LUCENE-3183: if you pass Term("", "") here then this will incorrectly return before positioning the enum, and position will be -1; caller must detect this. 
final	TokenNamefinal	
int	TokenNameint	
scanTo	TokenNameIdentifier	 scan To
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
scanBuffer	TokenNameIdentifier	 scan Buffer
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Always force initial next() in case term is Term("", "") 	TokenNameCOMMENT_LINE	Always force initial next() in case term is Term("", "") 
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
scanBuffer	TokenNameIdentifier	 scan Buffer
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
termBuffer	TokenNameIdentifier	 term Buffer
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current Term in the enumeration. Initially invalid, valid after next() called for the first time.*/	TokenNameCOMMENT_JAVADOC	 Returns the current Term in the enumeration. Initially invalid, valid after next() called for the first time.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termBuffer	TokenNameIdentifier	 term Buffer
.	TokenNameDOT	
toTerm	TokenNameIdentifier	 to Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the previous Term enumerated. Initially null.*/	TokenNameCOMMENT_JAVADOC	 Returns the previous Term enumerated. Initially null.
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
prev	TokenNameIdentifier	 prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prevBuffer	TokenNameIdentifier	 prev Buffer
.	TokenNameDOT	
toTerm	TokenNameIdentifier	 to Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.*/	TokenNameCOMMENT_JAVADOC	 Returns the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.
final	TokenNamefinal	
TermInfo	TokenNameIdentifier	 Term Info
termInfo	TokenNameIdentifier	 term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TermInfo	TokenNameIdentifier	 Term Info
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sets the argument to the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.*/	TokenNameCOMMENT_JAVADOC	 Sets the argument to the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.
final	TokenNamefinal	
void	TokenNamevoid	
termInfo	TokenNameIdentifier	 term Info
(	TokenNameLPAREN	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
termInfo	TokenNameIdentifier	 term Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the docFreq from the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.*/	TokenNameCOMMENT_JAVADOC	 Returns the docFreq from the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Returns the freqPointer from the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.*/	TokenNameCOMMENT_BLOCK	 Returns the freqPointer from the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.
final	TokenNamefinal	
long	TokenNamelong	
freqPointer	TokenNameIdentifier	 freq Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* Returns the proxPointer from the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.*/	TokenNameCOMMENT_BLOCK	 Returns the proxPointer from the current TermInfo in the enumeration. Initially invalid, valid after next() called for the first time.
final	TokenNamefinal	
long	TokenNamelong	
proxPointer	TokenNameIdentifier	 prox Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termInfo	TokenNameIdentifier	 term Info
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Closes the enumeration to further activity, freeing resources. */	TokenNameCOMMENT_JAVADOC	 Closes the enumeration to further activity, freeing resources. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
