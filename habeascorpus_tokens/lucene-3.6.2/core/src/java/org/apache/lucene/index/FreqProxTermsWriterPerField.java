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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Fieldable	TokenNameIdentifier	 Fieldable
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
// TODO: break into separate freq and prox writers as 	TokenNameCOMMENT_LINE	TODO: break into separate freq and prox writers as 
// codecs; make separate container (tii/tis/skip/*) that can 	TokenNameCOMMENT_LINE	codecs; make separate container (tii/tis/skip/*) that can 
// be configured as any number of files 1..N 	TokenNameCOMMENT_LINE	be configured as any number of files 1..N 
final	TokenNamefinal	
class	TokenNameclass	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
extends	TokenNameextends	
TermsHashConsumerPerField	TokenNameIdentifier	 Terms Hash Consumer Per Field
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
>	TokenNameGREATER	
{	TokenNameLBRACE	
final	TokenNamefinal	
FreqProxTermsWriterPerThread	TokenNameIdentifier	 Freq Prox Terms Writer Per Thread
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInvertState	TokenNameIdentifier	 Field Invert State
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
IndexOptions	TokenNameIdentifier	 Index Options
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
payloadAttribute	TokenNameIdentifier	 payload Attribute
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
(	TokenNameLPAREN	
TermsHashPerField	TokenNameIdentifier	 Terms Hash Per Field
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
,	TokenNameCOMMA	
FreqProxTermsWriterPerThread	TokenNameIdentifier	 Freq Prox Terms Writer Per Thread
perThread	TokenNameIdentifier	 per Thread
,	TokenNameCOMMA	
FieldInfo	TokenNameIdentifier	 Field Info
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
=	TokenNameEQUAL	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
perThread	TokenNameIdentifier	 per Thread
=	TokenNameEQUAL	
perThread	TokenNameIdentifier	 per Thread
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
=	TokenNameEQUAL	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
fieldState	TokenNameIdentifier	 field State
;	TokenNameSEMICOLON	
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
getStreamCount	TokenNameIdentifier	 get Stream Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
!=	TokenNameNOT_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
hasPayloads	TokenNameIdentifier	 has Payloads
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
skippingLongTerm	TokenNameIdentifier	 skipping Long Term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
FreqProxTermsWriterPerField	TokenNameIdentifier	 Freq Prox Terms Writer Per Field
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Record, up front, whether our in-RAM format will be 	TokenNameCOMMENT_LINE	Record, up front, whether our in-RAM format will be 
// with or without term freqs: 	TokenNameCOMMENT_LINE	with or without term freqs: 
indexOptions	TokenNameIdentifier	 index Options
=	TokenNameEQUAL	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
indexOptions	TokenNameIdentifier	 index Options
;	TokenNameSEMICOLON	
payloadAttribute	TokenNameIdentifier	 payload Attribute
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
boolean	TokenNameboolean	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
Fieldable	TokenNameIdentifier	 Fieldable
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
attributeSource	TokenNameIdentifier	 attribute Source
.	TokenNameDOT	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
payloadAttribute	TokenNameIdentifier	 payload Attribute
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
attributeSource	TokenNameIdentifier	 attribute Source
.	TokenNameDOT	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
payloadAttribute	TokenNameIdentifier	 payload Attribute
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
writeProx	TokenNameIdentifier	 write Prox
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
int	TokenNameint	
proxCode	TokenNameIdentifier	 prox Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Payload	TokenNameIdentifier	 Payload
payload	TokenNameIdentifier	 payload
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
payloadAttribute	TokenNameIdentifier	 payload Attribute
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
payload	TokenNameIdentifier	 payload
=	TokenNameEQUAL	
payloadAttribute	TokenNameIdentifier	 payload Attribute
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
proxCode	TokenNameIdentifier	 prox Code
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeBytes	TokenNameIdentifier	 write Bytes
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasPayloads	TokenNameIdentifier	 has Payloads
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
proxCode	TokenNameIdentifier	 prox Code
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
)	TokenNameRPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastPositions	TokenNameIdentifier	 last Positions
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time we're seeing this term since the last 	TokenNameCOMMENT_LINE	First time we're seeing this term since the last 
// flush 	TokenNameCOMMENT_LINE	flush 
assert	TokenNameassert	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"FreqProxTermsWriterPerField.newTerm start"	TokenNameStringLiteral	FreqProxTermsWriterPerField.newTerm start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
)	TokenNameRPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
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
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeProx	TokenNameIdentifier	 write Prox
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
uniqueTermCount	TokenNameIdentifier	 unique Term Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
termID	TokenNameIdentifier	 term ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"FreqProxTermsWriterPerField.addTerm start"	TokenNameStringLiteral	FreqProxTermsWriterPerField.addTerm start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
)	TokenNameRPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
postingsArray	TokenNameIdentifier	 postings Array
;	TokenNameSEMICOLON	
assert	TokenNameassert	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
||	TokenNameOR_OR	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
!=	TokenNameNOT_EQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
>	TokenNameGREATER	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
-	TokenNameMINUS	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
uniqueTermCount	TokenNameIdentifier	 unique Term Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
!=	TokenNameNOT_EQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
>	TokenNameGREATER	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Term not yet seen in the current doc but previously 	TokenNameCOMMENT_LINE	Term not yet seen in the current doc but previously 
// seen in other doc(s) since the last flush 	TokenNameCOMMENT_LINE	seen in other doc(s) since the last flush 
// Now that we know doc freq for previous doc, 	TokenNameCOMMENT_LINE	Now that we know doc freq for previous doc, 
// write it & lastDocCode 	TokenNameCOMMENT_LINE	write it & lastDocCode 
if	TokenNameif	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
|	TokenNameOR	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsHashPerField	TokenNameIdentifier	 terms Hash Per Field
.	TokenNameDOT	
writeVInt	TokenNameIdentifier	 write V Int
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
-	TokenNameMINUS	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeProx	TokenNameIdentifier	 write Prox
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
uniqueTermCount	TokenNameIdentifier	 unique Term Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
maxTermFrequency	TokenNameIdentifier	 max Term Frequency
,	TokenNameCOMMA	
++	TokenNamePLUS_PLUS	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
indexOptions	TokenNameIdentifier	 index Options
==	TokenNameEQUAL_EQUAL	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_AND_FREQS_AND_POSITIONS	TokenNameIdentifier	 DOCS  AND  FREQS  AND  POSITIONS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
writeProx	TokenNameIdentifier	 write Prox
(	TokenNameLPAREN	
termID	TokenNameIdentifier	 term ID
,	TokenNameCOMMA	
fieldState	TokenNameIdentifier	 field State
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
postings	TokenNameIdentifier	 postings
.	TokenNameDOT	
lastPositions	TokenNameIdentifier	 last Positions
[	TokenNameLBRACKET	
termID	TokenNameIdentifier	 term ID
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
createPostingsArray	TokenNameIdentifier	 create Postings Array
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
extends	TokenNameextends	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
{	TokenNameLBRACE	
public	TokenNamepublic	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFreqs	TokenNameIdentifier	 doc Freqs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastPositions	TokenNameIdentifier	 last Positions
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
docFreqs	TokenNameIdentifier	 doc Freqs
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// # times this term occurs in the current doc 	TokenNameCOMMENT_LINE	# times this term occurs in the current doc 
int	TokenNameint	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Last docID where this term occurred 	TokenNameCOMMENT_LINE	Last docID where this term occurred 
int	TokenNameint	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Code for prior doc 	TokenNameCOMMENT_LINE	Code for prior doc 
int	TokenNameint	
lastPositions	TokenNameIdentifier	 last Positions
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Last position where this term occurred 	TokenNameCOMMENT_LINE	Last position where this term occurred 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
toArray	TokenNameIdentifier	 to Array
,	TokenNameCOMMA	
int	TokenNameint	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
toArray	TokenNameIdentifier	 to Array
instanceof	TokenNameinstanceof	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
;	TokenNameSEMICOLON	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FreqProxPostingsArray	TokenNameIdentifier	 Freq Prox Postings Array
)	TokenNameRPAREN	
toArray	TokenNameIdentifier	 to Array
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
copyTo	TokenNameIdentifier	 copy To
(	TokenNameLPAREN	
toArray	TokenNameIdentifier	 to Array
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
docFreqs	TokenNameIdentifier	 doc Freqs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
docFreqs	TokenNameIdentifier	 doc Freqs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
lastDocIDs	TokenNameIdentifier	 last Doc I Ds
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
lastDocCodes	TokenNameIdentifier	 last Doc Codes
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
lastPositions	TokenNameIdentifier	 last Positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
lastPositions	TokenNameIdentifier	 last Positions
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numToCopy	TokenNameIdentifier	 num To Copy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
bytesPerPosting	TokenNameIdentifier	 bytes Per Posting
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ParallelPostingsArray	TokenNameIdentifier	 Parallel Postings Array
.	TokenNameDOT	
BYTES_PER_POSTING	TokenNameIdentifier	 BYTES  PER  POSTING
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
