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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
BitVector	TokenNameIdentifier	 Bit Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FieldInfo	TokenNameIdentifier	 Field Info
.	TokenNameDOT	
IndexOptions	TokenNameIdentifier	 Index Options
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
class	TokenNameclass	
SegmentTermDocs	TokenNameIdentifier	 Segment Term Docs
implements	TokenNameimplements	
TermDocs	TokenNameIdentifier	 Term Docs
{	TokenNameLBRACE	
protected	TokenNameprotected	
SegmentReader	TokenNameIdentifier	 Segment Reader
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexInput	TokenNameIdentifier	 Index Input
freqStream	TokenNameIdentifier	 freq Stream
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
df	TokenNameIdentifier	 df
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
BitVector	TokenNameIdentifier	 Bit Vector
deletedDocs	TokenNameIdentifier	 deleted Docs
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
skipInterval	TokenNameIdentifier	 skip Interval
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DefaultSkipListReader	TokenNameIdentifier	 Default Skip List Reader
skipListReader	TokenNameIdentifier	 skip List Reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
freqBasePointer	TokenNameIdentifier	 freq Base Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
proxBasePointer	TokenNameIdentifier	 prox Base Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
skipPointer	TokenNameIdentifier	 skip Pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
haveSkipped	TokenNameIdentifier	 have Skipped
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
currentFieldStoresPayloads	TokenNameIdentifier	 current Field Stores Payloads
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SegmentTermDocs	TokenNameIdentifier	 Segment Term Docs
(	TokenNameLPAREN	
SegmentReader	TokenNameIdentifier	 Segment Reader
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
freqStream	TokenNameIdentifier	 freq Stream
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
skipInterval	TokenNameIdentifier	 skip Interval
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
getTermsReader	TokenNameIdentifier	 get Terms Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSkipInterval	TokenNameIdentifier	 get Skip Interval
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
getTermsReader	TokenNameIdentifier	 get Terms Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMaxSkipLevels	TokenNameIdentifier	 get Max Skip Levels
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
SegmentTermDocs	TokenNameIdentifier	 Segment Term Docs
(	TokenNameLPAREN	
SegmentReader	TokenNameIdentifier	 Segment Reader
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
getTermsReader	TokenNameIdentifier	 get Terms Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
;	TokenNameSEMICOLON	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
;	TokenNameSEMICOLON	
// use comparison of fieldinfos to verify that termEnum belongs to the same segment as this SegmentTermDocs 	TokenNameCOMMENT_LINE	use comparison of fieldinfos to verify that termEnum belongs to the same segment as this SegmentTermDocs 
if	TokenNameif	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
instanceof	TokenNameinstanceof	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
)	TokenNameRPAREN	
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
==	TokenNameEQUAL_EQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// optimized case 	TokenNameCOMMENT_LINE	optimized case 
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
segmentTermEnum	TokenNameIdentifier	 segment Term Enum
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SegmentTermEnum	TokenNameIdentifier	 Segment Term Enum
)	TokenNameRPAREN	
termEnum	TokenNameIdentifier	 term Enum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
segmentTermEnum	TokenNameIdentifier	 segment Term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
segmentTermEnum	TokenNameIdentifier	 segment Term Enum
.	TokenNameDOT	
termInfo	TokenNameIdentifier	 term Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// punt case 	TokenNameCOMMENT_LINE	punt case 
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
getTermsReader	TokenNameIdentifier	 get Terms Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
:	TokenNameCOLON	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
;	TokenNameSEMICOLON	
currentFieldStoresPayloads	TokenNameIdentifier	 current Field Stores Payloads
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fi	TokenNameIdentifier	 fi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fi	TokenNameIdentifier	 fi
.	TokenNameDOT	
storePayloads	TokenNameIdentifier	 store Payloads
:	TokenNameCOLON	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
df	TokenNameIdentifier	 df
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
freqBasePointer	TokenNameIdentifier	 freq Base Pointer
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
freqPointer	TokenNameIdentifier	 freq Pointer
;	TokenNameSEMICOLON	
proxBasePointer	TokenNameIdentifier	 prox Base Pointer
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
proxPointer	TokenNameIdentifier	 prox Pointer
;	TokenNameSEMICOLON	
skipPointer	TokenNameIdentifier	 skip Pointer
=	TokenNameEQUAL	
freqBasePointer	TokenNameIdentifier	 freq Base Pointer
+	TokenNamePLUS	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
skipOffset	TokenNameIdentifier	 skip Offset
;	TokenNameSEMICOLON	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
freqBasePointer	TokenNameIdentifier	 freq Base Pointer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveSkipped	TokenNameIdentifier	 have Skipped
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipListReader	TokenNameIdentifier	 skip List Reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
skipListReader	TokenNameIdentifier	 skip List Reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
skippingDoc	TokenNameIdentifier	 skipping Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
docCode	TokenNameIdentifier	 doc Code
=	TokenNameEQUAL	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
docCode	TokenNameIdentifier	 doc Code
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
docCode	TokenNameIdentifier	 doc Code
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// shift off low bit 	TokenNameCOMMENT_LINE	shift off low bit 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
docCode	TokenNameIdentifier	 doc Code
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// if low bit is set 	TokenNameCOMMENT_LINE	if low bit is set 
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// freq is one 	TokenNameCOMMENT_LINE	freq is one 
else	TokenNameelse	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// else read freq 	TokenNameCOMMENT_LINE	else read freq 
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deletedDocs	TokenNameIdentifier	 deleted Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
skippingDoc	TokenNameIdentifier	 skipping Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Optimized implementation. */	TokenNameCOMMENT_JAVADOC	 Optimized implementation. 
public	TokenNamepublic	
int	TokenNameint	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
readNoTf	TokenNameIdentifier	 read No Tf
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
freqs	TokenNameIdentifier	 freqs
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// manually inlined call to next() for speed 	TokenNameCOMMENT_LINE	manually inlined call to next() for speed 
final	TokenNamefinal	
int	TokenNameint	
docCode	TokenNameIdentifier	 doc Code
=	TokenNameEQUAL	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
docCode	TokenNameIdentifier	 doc Code
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// shift off low bit 	TokenNameCOMMENT_LINE	shift off low bit 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
docCode	TokenNameIdentifier	 doc Code
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// if low bit is set 	TokenNameCOMMENT_LINE	if low bit is set 
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// freq is one 	TokenNameCOMMENT_LINE	freq is one 
else	TokenNameelse	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// else read freq 	TokenNameCOMMENT_LINE	else read freq 
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deletedDocs	TokenNameIdentifier	 deleted Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docs	TokenNameIdentifier	 docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
readNoTf	TokenNameIdentifier	 read No Tf
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
count	TokenNameIdentifier	 count
<	TokenNameLESS	
df	TokenNameIdentifier	 df
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// manually inlined call to next() for speed 	TokenNameCOMMENT_LINE	manually inlined call to next() for speed 
doc	TokenNameIdentifier	 doc
+=	TokenNamePLUS_EQUAL	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
deletedDocs	TokenNameIdentifier	 deleted Docs
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
deletedDocs	TokenNameIdentifier	 deleted Docs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docs	TokenNameIdentifier	 docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
// Hardware freq to 1 when term freqs were not 	TokenNameCOMMENT_LINE	Hardware freq to 1 when term freqs were not 
// stored in the index 	TokenNameCOMMENT_LINE	stored in the index 
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Overridden by SegmentTermPositions to skip in prox stream. */	TokenNameCOMMENT_JAVADOC	 Overridden by SegmentTermPositions to skip in prox stream. 
protected	TokenNameprotected	
void	TokenNamevoid	
skipProx	TokenNameIdentifier	 skip Prox
(	TokenNameLPAREN	
long	TokenNamelong	
proxPointer	TokenNameIdentifier	 prox Pointer
,	TokenNameCOMMA	
int	TokenNameint	
payloadLength	TokenNameIdentifier	 payload Length
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Optimized implementation. */	TokenNameCOMMENT_JAVADOC	 Optimized implementation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
-	TokenNameMINUS	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
doc	TokenNameIdentifier	 doc
&&	TokenNameAND_AND	
df	TokenNameIdentifier	 df
>=	TokenNameGREATER_EQUAL	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// optimized case 	TokenNameCOMMENT_LINE	optimized case 
if	TokenNameif	
(	TokenNameLPAREN	
skipListReader	TokenNameIdentifier	 skip List Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
skipListReader	TokenNameIdentifier	 skip List Reader
=	TokenNameEQUAL	
new	TokenNamenew	
DefaultSkipListReader	TokenNameIdentifier	 Default Skip List Reader
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IndexInput	TokenNameIdentifier	 Index Input
)	TokenNameRPAREN	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
maxSkipLevels	TokenNameIdentifier	 max Skip Levels
,	TokenNameCOMMA	
skipInterval	TokenNameIdentifier	 skip Interval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// lazily clone 	TokenNameCOMMENT_LINE	lazily clone 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
haveSkipped	TokenNameIdentifier	 have Skipped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// lazily initialize skip stream 	TokenNameCOMMENT_LINE	lazily initialize skip stream 
skipListReader	TokenNameIdentifier	 skip List Reader
.	TokenNameDOT	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
skipPointer	TokenNameIdentifier	 skip Pointer
,	TokenNameCOMMA	
freqBasePointer	TokenNameIdentifier	 freq Base Pointer
,	TokenNameCOMMA	
proxBasePointer	TokenNameIdentifier	 prox Base Pointer
,	TokenNameCOMMA	
df	TokenNameIdentifier	 df
,	TokenNameCOMMA	
currentFieldStoresPayloads	TokenNameIdentifier	 current Field Stores Payloads
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
haveSkipped	TokenNameIdentifier	 have Skipped
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
newCount	TokenNameIdentifier	 new Count
=	TokenNameEQUAL	
skipListReader	TokenNameIdentifier	 skip List Reader
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newCount	TokenNameIdentifier	 new Count
>	TokenNameGREATER	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freqStream	TokenNameIdentifier	 freq Stream
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
skipListReader	TokenNameIdentifier	 skip List Reader
.	TokenNameDOT	
getFreqPointer	TokenNameIdentifier	 get Freq Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipProx	TokenNameIdentifier	 skip Prox
(	TokenNameLPAREN	
skipListReader	TokenNameIdentifier	 skip List Reader
.	TokenNameDOT	
getProxPointer	TokenNameIdentifier	 get Prox Pointer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
skipListReader	TokenNameIdentifier	 skip List Reader
.	TokenNameDOT	
getPayloadLength	TokenNameIdentifier	 get Payload Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
skipListReader	TokenNameIdentifier	 skip List Reader
.	TokenNameDOT	
getDoc	TokenNameIdentifier	 get Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
newCount	TokenNameIdentifier	 new Count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// done skipping, now just scan 	TokenNameCOMMENT_LINE	done skipping, now just scan 
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
>	TokenNameGREATER	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
