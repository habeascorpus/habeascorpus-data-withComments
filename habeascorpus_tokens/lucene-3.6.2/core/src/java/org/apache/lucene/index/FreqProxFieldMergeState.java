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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
.	TokenNameDOT	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
;	TokenNameSEMICOLON	
// TODO FI: some of this is "generic" to TermsHash* so we 	TokenNameCOMMENT_LINE	TODO FI: some of this is "generic" to TermsHash* so we 
// should factor it out so other consumers don't have to 	TokenNameCOMMENT_LINE	should factor it out so other consumers don't have to 
// duplicate this code 	TokenNameCOMMENT_LINE	duplicate this code 
/** Used by DocumentsWriter to merge the postings from * multiple ThreadStates when creating a segment */	TokenNameCOMMENT_JAVADOC	 Used by DocumentsWriter to merge the postings from multiple ThreadStates when creating a segment 
final	TokenNamefinal	
class	TokenNameclass	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
{	TokenNameLBRACE	
final	TokenNamefinal	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CharBlockPool	TokenNameIdentifier	 Char Block Pool
charPool	TokenNameIdentifier	 char Pool
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
termIDs	TokenNameIdentifier	 term I Ds
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
postings	TokenNameIdentifier	 postings
;	TokenNameSEMICOLON	
int	TokenNameint	
currentTermID	TokenNameIdentifier	 current Term ID
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
int	TokenNameint	
textOffset	TokenNameIdentifier	 text Offset
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
postingUpto	TokenNameIdentifier	 posting Upto
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
prox	TokenNameIdentifier	 prox
=	TokenNameEQUAL	
new	TokenNamenew	
ByteSliceReader	TokenNameIdentifier	 Byte Slice Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
int	TokenNameint	
termFreq	TokenNameIdentifier	 term Freq
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FreqProxFieldMergeState	TokenNameIdentifier	 Freq Prox Field Merge State
(	TokenNameLPAREN	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
charPool	TokenNameIdentifier	 char Pool
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
perThread	TokenNameIdentifier	 per Thread
.	TokenNameDOT	
termsHashPerThread	TokenNameIdentifier	 terms Hash Per Thread
.	TokenNameDOT	
charPool	TokenNameIdentifier	 char Pool
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numPostings	TokenNameIdentifier	 num Postings
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
numPostings	TokenNameIdentifier	 num Postings
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termIDs	TokenNameIdentifier	 term I Ds
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
sortPostings	TokenNameIdentifier	 sort Postings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
nextTerm	TokenNameIdentifier	 next Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
postingUpto	TokenNameIdentifier	 posting Upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
postingUpto	TokenNameIdentifier	 posting Upto
==	TokenNameEQUAL_EQUAL	
numPostings	TokenNameIdentifier	 num Postings
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
currentTermID	TokenNameIdentifier	 current Term ID
=	TokenNameEQUAL	
termIDs	TokenNameIdentifier	 term I Ds
[	TokenNameLBRACKET	
postingUpto	TokenNameIdentifier	 posting Upto
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
textStart	TokenNameIdentifier	 text Start
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
textStarts	TokenNameIdentifier	 text Starts
[	TokenNameLBRACKET	
currentTermID	TokenNameIdentifier	 current Term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
charPool	TokenNameIdentifier	 char Pool
.	TokenNameDOT	
buffers	TokenNameIdentifier	 buffers
[	TokenNameLBRACKET	
textStart	TokenNameIdentifier	 text Start
>>	TokenNameRIGHT_SHIFT	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_SHIFT	TokenNameIdentifier	 CHAR  BLOCK  SHIFT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
textOffset	TokenNameIdentifier	 text Offset
=	TokenNameEQUAL	
textStart	TokenNameIdentifier	 text Start
&	TokenNameAND	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
CHAR_BLOCK_MASK	TokenNameIdentifier	 CHAR  BLOCK  MASK
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
initReader	TokenNameIdentifier	 init Reader
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
,	TokenNameCOMMA	
currentTermID	TokenNameIdentifier	 current Term ID
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
initReader	TokenNameIdentifier	 init Reader
(	TokenNameLPAREN	
prox	TokenNameIdentifier	 prox
,	TokenNameCOMMA	
currentTermID	TokenNameIdentifier	 current Term ID
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Should always be true 	TokenNameCOMMENT_LINE	Should always be true 
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
termText	TokenNameIdentifier	 term Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
textOffset	TokenNameIdentifier	 text Offset
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
textOffset	TokenNameIdentifier	 text Offset
,	TokenNameCOMMA	
upto	TokenNameIdentifier	 upto
-	TokenNameMINUS	
textOffset	TokenNameIdentifier	 text Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
.	TokenNameDOT	
eof	TokenNameIdentifier	 eof
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
currentTermID	TokenNameIdentifier	 current Term ID
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Return last doc 	TokenNameCOMMENT_LINE	Return last doc 
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
currentTermID	TokenNameIdentifier	 current Term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
!=	TokenNameNOT_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
)	TokenNameRPAREN	
termFreq	TokenNameIdentifier	 term Freq
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
[	TokenNameLBRACKET	
currentTermID	TokenNameIdentifier	 current Term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
currentTermID	TokenNameIdentifier	 current Term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// EOF 	TokenNameCOMMENT_LINE	EOF 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
freq	TokenNameIdentifier	 freq
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
)	TokenNameRPAREN	
docID	TokenNameIdentifier	 doc ID
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
docID	TokenNameIdentifier	 doc ID
+=	TokenNamePLUS_EQUAL	
code	TokenNameIdentifier	 code
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
code	TokenNameIdentifier	 code
&	TokenNameAND	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
termFreq	TokenNameIdentifier	 term Freq
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
termFreq	TokenNameIdentifier	 term Freq
=	TokenNameEQUAL	
freq	TokenNameIdentifier	 freq
.	TokenNameDOT	
readVInt	TokenNameIdentifier	 read V Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
docID	TokenNameIdentifier	 doc ID
!=	TokenNameNOT_EQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
currentTermID	TokenNameIdentifier	 current Term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
