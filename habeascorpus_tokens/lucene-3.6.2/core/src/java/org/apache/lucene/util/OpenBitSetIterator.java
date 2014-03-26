/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
;	TokenNameSEMICOLON	
/** An iterator to iterate over set bits in an OpenBitSet. * This is faster than nextSetBit() for iterating over the complete set of bits, * especially when the density of the bits set is high. */	TokenNameCOMMENT_JAVADOC	 An iterator to iterate over set bits in an OpenBitSet. This is faster than nextSetBit() for iterating over the complete set of bits, especially when the density of the bits set is high. 
public	TokenNamepublic	
class	TokenNameclass	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
extends	TokenNameextends	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
{	TokenNameLBRACE	
// The General Idea: instead of having an array per byte that has 	TokenNameCOMMENT_LINE	The General Idea: instead of having an array per byte that has 
// the offsets of the next set bit, that array could be 	TokenNameCOMMENT_LINE	the offsets of the next set bit, that array could be 
// packed inside a 32 bit integer (8 4 bit numbers). That 	TokenNameCOMMENT_LINE	packed inside a 32 bit integer (8 4 bit numbers). That 
// should be faster than accessing an array for each index, and 	TokenNameCOMMENT_LINE	should be faster than accessing an array for each index, and 
// the total array size is kept smaller (256*sizeof(int))=1K 	TokenNameCOMMENT_LINE	the total array size is kept smaller (256*sizeof(int))=1K 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bitlist	TokenNameIdentifier	 bitlist
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0x0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x21	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x31	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x41	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x43	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x4321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x52	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x521	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x53	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x532	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x54	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x541	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x542	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x543	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x5432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x54321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x62	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x621	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x63	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x631	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x632	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x64	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x641	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x642	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x643	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x64321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x65	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x651	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x652	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6521	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x653	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6532	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x65321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6541	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6542	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x65421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x6543	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x65431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x65432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x654321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x72	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x721	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x73	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x731	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x732	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x74	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x741	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x742	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x743	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x74321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x75	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x751	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x752	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7521	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x753	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7532	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x75321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x754	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7541	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7542	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x75421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7543	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x75431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x75432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x754321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x761	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x762	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7621	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x763	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7631	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7632	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x764	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7641	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7642	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7643	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x764321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x765	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7651	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7652	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76521	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7653	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76532	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x765321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76541	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76542	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x765421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x76543	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x765431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x765432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x7654321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x81	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x82	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x821	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x831	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x832	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x84	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x841	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x842	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x843	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x84321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x85	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x851	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x852	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8521	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x853	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8532	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x85321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x854	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8541	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8542	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x85421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8543	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x85431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x85432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x854321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x861	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x862	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8621	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x863	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8631	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8632	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x864	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8641	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8642	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8643	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x864321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x865	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8651	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8652	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86521	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8653	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86532	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x865321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86541	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86542	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x865421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x86543	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x865431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x865432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8654321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x871	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x872	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8721	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x873	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8731	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8732	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x874	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8741	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8742	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8743	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x874321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x875	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8751	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8752	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87521	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8753	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87532	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x875321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8754	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87541	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87542	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x875421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87543	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x875431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x875432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8754321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8761	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8762	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87621	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8763	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87631	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87632	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8764	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87641	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87642	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87643	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8764321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8765	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87651	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87652	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876521	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87653	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876531	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876532	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8765321	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87654	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876541	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876542	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8765421	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x876543	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8765431	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x8765432	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x87654321	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/***** the python code that generated bitlist def bits2int(val): arr=0 for shift in range(8,0,-1): if val & 0x80: arr = (arr << 4) | shift val = val << 1 return arr def int_table(): tbl = [ hex(bits2int(val)).strip('L') for val in range(256) ] return ','.join(tbl) ******/	TokenNameCOMMENT_JAVADOC	*** the python code that generated bitlist def bits2int(val): arr=0 for shift in range(8,0,-1): if val & 0x80: arr = (arr << 4) | shift val = val << 1 return arr def int_table(): tbl = [ hex(bits2int(val)).strip('L') for val in range(256) ] return ','.join(tbl) *****
// hmmm, what about an iterator that finds zeros though, 	TokenNameCOMMENT_LINE	hmmm, what about an iterator that finds zeros though, 
// or a reverse iterator... should they be separate classes 	TokenNameCOMMENT_LINE	or a reverse iterator... should they be separate classes 
// for efficiency, or have a common root interface? (or 	TokenNameCOMMENT_LINE	for efficiency, or have a common root interface? (or 
// maybe both? could ask for a SetBitsIterator, etc... 	TokenNameCOMMENT_LINE	maybe both? could ask for a SetBitsIterator, etc... 
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arr	TokenNameIdentifier	 arr
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
words	TokenNameIdentifier	 words
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
word	TokenNameIdentifier	 word
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
wordShift	TokenNameIdentifier	 word Shift
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
indexArray	TokenNameIdentifier	 index Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curDocId	TokenNameIdentifier	 cur Doc Id
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
obs	TokenNameIdentifier	 obs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
getBits	TokenNameIdentifier	 get Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
obs	TokenNameIdentifier	 obs
.	TokenNameDOT	
getNumWords	TokenNameIdentifier	 get Num Words
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
OpenBitSetIterator	TokenNameIdentifier	 Open Bit Set Iterator
(	TokenNameLPAREN	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bits	TokenNameIdentifier	 bits
,	TokenNameCOMMA	
int	TokenNameint	
numWords	TokenNameIdentifier	 num Words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arr	TokenNameIdentifier	 arr
=	TokenNameEQUAL	
bits	TokenNameIdentifier	 bits
;	TokenNameSEMICOLON	
words	TokenNameIdentifier	 words
=	TokenNameEQUAL	
numWords	TokenNameIdentifier	 num Words
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 64 bit shifts 	TokenNameCOMMENT_LINE	64 bit shifts 
private	TokenNameprivate	
void	TokenNamevoid	
shift	TokenNameIdentifier	 shift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
word	TokenNameIdentifier	 word
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordShift	TokenNameIdentifier	 word Shift
+=	TokenNamePLUS_EQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
word	TokenNameIdentifier	 word
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
&	TokenNameAND	
0x0000FFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordShift	TokenNameIdentifier	 word Shift
+=	TokenNamePLUS_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
&	TokenNameAND	
0x000000FF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordShift	TokenNameIdentifier	 word Shift
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
indexArray	TokenNameIdentifier	 index Array
=	TokenNameEQUAL	
bitlist	TokenNameIdentifier	 bitlist
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
word	TokenNameIdentifier	 word
&	TokenNameAND	
0xff	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/***** alternate shift implementations // 32 bit shifts, but a long shift needed at the end private void shift2() { int y = (int)word; if (y==0) {wordShift +=32; y = (int)(word >>>32); } if ((y & 0x0000FFFF) == 0) { wordShift +=16; y>>>=16; } if ((y & 0x000000FF) == 0) { wordShift +=8; y>>>=8; } indexArray = bitlist[y & 0xff]; word >>>= (wordShift +1); } private void shift3() { int lower = (int)word; int lowByte = lower & 0xff; if (lowByte != 0) { indexArray=bitlist[lowByte]; return; } shift(); } ******/	TokenNameCOMMENT_JAVADOC	*** alternate shift implementations // 32 bit shifts, but a long shift needed at the end private void shift2() { int y = (int)word; if (y==0) {wordShift +=32; y = (int)(word >>>32); } if ((y & 0x0000FFFF) == 0) { wordShift +=16; y>>>=16; } if ((y & 0x000000FF) == 0) { wordShift +=8; y>>>=8; } indexArray = bitlist[y & 0xff]; word >>>= (wordShift +1); } private void shift3() { int lower = (int)word; int lowByte = lower & 0xff; if (lowByte != 0) { indexArray=bitlist[lowByte]; return; } shift(); } *****
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
indexArray	TokenNameIdentifier	 index Array
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wordShift	TokenNameIdentifier	 word Shift
+=	TokenNamePLUS_EQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
words	TokenNameIdentifier	 words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
curDocId	TokenNameIdentifier	 cur Doc Id
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
arr	TokenNameIdentifier	 arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
wordShift	TokenNameIdentifier	 word Shift
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// loop invariant code motion should move this 	TokenNameCOMMENT_LINE	loop invariant code motion should move this 
}	TokenNameRBRACE	
// after the first time, should I go with a linear search, or 	TokenNameCOMMENT_LINE	after the first time, should I go with a linear search, or 
// stick with the binary search in shift? 	TokenNameCOMMENT_LINE	stick with the binary search in shift? 
shift	TokenNameIdentifier	 shift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
bitIndex	TokenNameIdentifier	 bit Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
indexArray	TokenNameIdentifier	 index Array
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
wordShift	TokenNameIdentifier	 word Shift
;	TokenNameSEMICOLON	
indexArray	TokenNameIdentifier	 index Array
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// should i<<6 be cached as a separate variable? 	TokenNameCOMMENT_LINE	should i<<6 be cached as a separate variable? 
// it would only save one cycle in the best circumstances. 	TokenNameCOMMENT_LINE	it would only save one cycle in the best circumstances. 
return	TokenNamereturn	
curDocId	TokenNameIdentifier	 cur Doc Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bitIndex	TokenNameIdentifier	 bit Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
indexArray	TokenNameIdentifier	 index Array
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
>>	TokenNameRIGHT_SHIFT	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
words	TokenNameIdentifier	 words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// setup so next() will also return -1 	TokenNameCOMMENT_LINE	setup so next() will also return -1 
return	TokenNamereturn	
curDocId	TokenNameIdentifier	 cur Doc Id
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wordShift	TokenNameIdentifier	 word Shift
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
&	TokenNameAND	
0x3f	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
arr	TokenNameIdentifier	 arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
wordShift	TokenNameIdentifier	 word Shift
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordShift	TokenNameIdentifier	 word Shift
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// compensate for 1 based arrIndex 	TokenNameCOMMENT_LINE	compensate for 1 based arrIndex 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
words	TokenNameIdentifier	 words
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
curDocId	TokenNameIdentifier	 cur Doc Id
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
word	TokenNameIdentifier	 word
=	TokenNameEQUAL	
arr	TokenNameIdentifier	 arr
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
wordShift	TokenNameIdentifier	 word Shift
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
shift	TokenNameIdentifier	 shift
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bitIndex	TokenNameIdentifier	 bit Index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
indexArray	TokenNameIdentifier	 index Array
&	TokenNameAND	
0x0f	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
wordShift	TokenNameIdentifier	 word Shift
;	TokenNameSEMICOLON	
indexArray	TokenNameIdentifier	 index Array
>>>=	TokenNameUNSIGNED_RIGHT_SHIFT_EQUAL	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// should i<<6 be cached as a separate variable? 	TokenNameCOMMENT_LINE	should i<<6 be cached as a separate variable? 
// it would only save one cycle in the best circumstances. 	TokenNameCOMMENT_LINE	it would only save one cycle in the best circumstances. 
return	TokenNamereturn	
curDocId	TokenNameIdentifier	 cur Doc Id
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
bitIndex	TokenNameIdentifier	 bit Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
curDocId	TokenNameIdentifier	 cur Doc Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
