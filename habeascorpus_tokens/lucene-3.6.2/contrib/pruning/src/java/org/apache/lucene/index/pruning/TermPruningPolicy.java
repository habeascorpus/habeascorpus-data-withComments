package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
pruning	TokenNameIdentifier	 pruning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
IndexWriter	TokenNameIdentifier	 Index Writer
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
IndexReader	TokenNameIdentifier	 Index Reader
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
Term	TokenNameIdentifier	 Term
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
TermEnum	TokenNameIdentifier	 Term Enum
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
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
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
TermPositions	TokenNameIdentifier	 Term Positions
;	TokenNameSEMICOLON	
/** * Policy for producing smaller index out of an input index, by examining its terms * and removing from the index some or all of their data as follows: * <ul> * <li>all terms of a certain field - see {@link #pruneAllFieldPostings(String)}</li> * <li>all data of a certain term - see {@link #pruneTermEnum(TermEnum)}</li> * <li>all positions of a certain term in a certain document - see #pruneAllPositions(TermPositions, Term)</li> * <li>some positions of a certain term in a certain document - see #pruneSomePositions(int, int[], Term)</li> * </ul> * <p> * The pruned, smaller index would, for many types of queries return nearly * identical top-N results as compared with the original index, but with increased performance. * <p> * Pruning of indexes is handy for producing small first-tier indexes that fit * completely in RAM, and store these indexes using {@link IndexWriter#addIndexes(IndexReader...)} * <p> * Interestingly, if the input index is optimized (i.e. doesn't contain deletions), * then the index produced via {@link IndexWriter#addIndexes(IndexReader[])} will preserve internal document * id-s so that they are in sync with the original index. This means that * all other auxiliary information not necessary for first-tier processing, such * as some stored fields, can also be removed, to be quickly retrieved on-demand * from the original index using the same internal document id. See * {@link StorePruningPolicy} for information about removing stored fields. * <p> * Please note that while this family of policies method produces good results for term queries it * often leads to poor results for phrase queries (because postings are removed * without considering whether they belong to an important phrase). * <p> * Aggressive pruning policies produce smaller indexes - * search performance increases, and recall decreases (i.e. search quality * deteriorates). * <p> * See the following papers for a discussion of this problem and the * proposed solutions to improve the quality of a pruned index (not implemented * here): * <small> * <ul> * <li><a href="http://portal.acm.org/citation.cfm?id=1148235">Pruned query * evaluation using pre-computed impacts, V. Anh et al, ACM SIGIR 2006</a></li> * <li><a href="http://portal.acm.org/citation.cfm?id=1183614.1183644"> A * document-centric approach to static index pruning in text retrieval systems, * S. Buettcher et al, ACM SIGIR 2006</a></li> * <li><a href=" http://oak.cs.ucla.edu/~cho/papers/ntoulas-sigir07.pdf"> * Pruning Policies for Two-Tiered Inverted Index with Correctness Guarantee, A. * Ntoulas et al, ACM SIGIR 2007.</a></li> * </ul> * </small> */	TokenNameCOMMENT_JAVADOC	 Policy for producing smaller index out of an input index, by examining its terms and removing from the index some or all of their data as follows: <ul> <li>all terms of a certain field - see {@link #pruneAllFieldPostings(String)}</li> <li>all data of a certain term - see {@link #pruneTermEnum(TermEnum)}</li> <li>all positions of a certain term in a certain document - see #pruneAllPositions(TermPositions, Term)</li> <li>some positions of a certain term in a certain document - see #pruneSomePositions(int, int[], Term)</li> </ul> <p> The pruned, smaller index would, for many types of queries return nearly identical top-N results as compared with the original index, but with increased performance. <p> Pruning of indexes is handy for producing small first-tier indexes that fit completely in RAM, and store these indexes using {@link IndexWriter#addIndexes(IndexReader...)} <p> Interestingly, if the input index is optimized (i.e. doesn't contain deletions), then the index produced via {@link IndexWriter#addIndexes(IndexReader[])} will preserve internal document id-s so that they are in sync with the original index. This means that all other auxiliary information not necessary for first-tier processing, such as some stored fields, can also be removed, to be quickly retrieved on-demand from the original index using the same internal document id. See {@link StorePruningPolicy} for information about removing stored fields. <p> Please note that while this family of policies method produces good results for term queries it often leads to poor results for phrase queries (because postings are removed without considering whether they belong to an important phrase). <p> Aggressive pruning policies produce smaller indexes - search performance increases, and recall decreases (i.e. search quality deteriorates). <p> See the following papers for a discussion of this problem and the proposed solutions to improve the quality of a pruned index (not implemented here): <small> <ul> <li><a href="http://portal.acm.org/citation.cfm?id=1148235">Pruned query evaluation using pre-computed impacts, V. Anh et al, ACM SIGIR 2006</a></li> <li><a href="http://portal.acm.org/citation.cfm?id=1183614.1183644"> A document-centric approach to static index pruning in text retrieval systems, S. Buettcher et al, ACM SIGIR 2006</a></li> <li><a href=" http://oak.cs.ucla.edu/~cho/papers/ntoulas-sigir07.pdf"> Pruning Policies for Two-Tiered Inverted Index with Correctness Guarantee, A. Ntoulas et al, ACM SIGIR 2007.</a></li> </ul> </small> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TermPruningPolicy	TokenNameIdentifier	 Term Pruning Policy
extends	TokenNameextends	
PruningPolicy	TokenNameIdentifier	 Pruning Policy
{	TokenNameLBRACE	
/** Pruning operations to be conducted on fields. */	TokenNameCOMMENT_JAVADOC	 Pruning operations to be conducted on fields. 
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
fieldFlags	TokenNameIdentifier	 field Flags
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
/** * Construct a policy. * @param in input reader * @param fieldFlags a map, where keys are field names and values * are bitwise-OR flags of operations to be performed (see * {@link PruningPolicy} for more details). */	TokenNameCOMMENT_JAVADOC	 Construct a policy. @param in input reader @param fieldFlags a map, where keys are field names and values are bitwise-OR flags of operations to be performed (see {@link PruningPolicy} for more details). 
protected	TokenNameprotected	
TermPruningPolicy	TokenNameIdentifier	 Term Pruning Policy
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
fieldFlags	TokenNameIdentifier	 field Flags
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldFlags	TokenNameIdentifier	 field Flags
=	TokenNameEQUAL	
fieldFlags	TokenNameIdentifier	 field Flags
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fieldFlags	TokenNameIdentifier	 field Flags
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Term vector pruning. * @param docNumber document number * @param field field name * @return true if the complete term vector for this field should be * removed (as specified by {@link PruningPolicy#DEL_VECTOR} flag). * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Term vector pruning. @param docNumber document number @param field field name @return true if the complete term vector for this field should be removed (as specified by {@link PruningPolicy#DEL_VECTOR} flag). @throws IOException 
public	TokenNamepublic	
boolean	TokenNameboolean	
pruneWholeTermVector	TokenNameIdentifier	 prune Whole Term Vector
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
&	TokenNameAND	
DEL_VECTOR	TokenNameIdentifier	 DEL  VECTOR
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Pruning of all postings for a field * @param field field name * @return true if all postings for all terms in this field should be * removed (as specified by {@link PruningPolicy#DEL_POSTINGS}). * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Pruning of all postings for a field @param field field name @return true if all postings for all terms in this field should be removed (as specified by {@link PruningPolicy#DEL_POSTINGS}). @throws IOException 
public	TokenNamepublic	
boolean	TokenNameboolean	
pruneAllFieldPostings	TokenNameIdentifier	 prune All Field Postings
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
&	TokenNameAND	
DEL_POSTINGS	TokenNameIdentifier	 DEL  POSTINGS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Called when moving {@link TermPositions} to a new {@link Term}. * @param in input term positions * @param t current term * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Called when moving {@link TermPositions} to a new {@link Term}. @param in input term positions @param t current term @throws IOException 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
initPositionsTerm	TokenNameIdentifier	 init Positions Term
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Called when checking for the presence of payload for the current * term at a current position * @param in positioned term positions * @param curTerm current term associated with these positions * @return true if the payload should be removed, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Called when checking for the presence of payload for the current term at a current position @param in positioned term positions @param curTerm current term associated with these positions @return true if the payload should be removed, false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
prunePayload	TokenNameIdentifier	 prune Payload
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
curTerm	TokenNameIdentifier	 cur Term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
curTerm	TokenNameIdentifier	 cur Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fieldFlags	TokenNameIdentifier	 field Flags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
curTerm	TokenNameIdentifier	 cur Term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
DEL_PAYLOADS	TokenNameIdentifier	 DEL  PAYLOADS
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pruning of individual terms in term vectors. * @param docNumber document number * @param field field name * @param terms array of terms * @param freqs array of term frequencies * @param v the original term frequency vector * @return 0 if no terms are to be removed, positive number to indicate * how many terms need to be removed. The same number of entries in the terms * array must be set to null to indicate which terms to remove. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Pruning of individual terms in term vectors. @param docNumber document number @param field field name @param terms array of terms @param freqs array of term frequencies @param v the original term frequency vector @return 0 if no terms are to be removed, positive number to indicate how many terms need to be removed. The same number of entries in the terms array must be set to null to indicate which terms to remove. @throws IOException 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
pruneTermVectorTerms	TokenNameIdentifier	 prune Term Vector Terms
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
,	TokenNameCOMMA	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Pruning of all postings for a term (invoked once per term). * @param te positioned term enum. * @return true if all postings for this term should be removed, false * otherwise. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Pruning of all postings for a term (invoked once per term). @param te positioned term enum. @return true if all postings for this term should be removed, false otherwise. @throws IOException 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
pruneTermEnum	TokenNameIdentifier	 prune Term Enum
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Prune <b>all</b> postings per term (invoked once per term per doc) * @param termPositions positioned term positions. Implementations MUST NOT * advance this by calling {@link TermPositions} methods that advance either * the position pointer (next, skipTo) or term pointer (seek). * @param t current term * @return true if the current posting should be removed, false otherwise. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Prune <b>all</b> postings per term (invoked once per term per doc) @param termPositions positioned term positions. Implementations MUST NOT advance this by calling {@link TermPositions} methods that advance either the position pointer (next, skipTo) or term pointer (seek). @param t current term @return true if the current posting should be removed, false otherwise. @throws IOException 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
pruneAllPositions	TokenNameIdentifier	 prune All Positions
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Prune <b>some</b> postings per term (invoked once per term per doc). * @param docNum current document number * @param positions original term positions in the document (and indirectly * term frequency) * @param curTerm current term * @return 0 if no postings are to be removed, or positive number to indicate * how many postings need to be removed. The same number of entries in the * positions array must be set to -1 to indicate which positions to remove. */	TokenNameCOMMENT_JAVADOC	 Prune <b>some</b> postings per term (invoked once per term per doc). @param docNum current document number @param positions original term positions in the document (and indirectly term frequency) @param curTerm current term @return 0 if no postings are to be removed, or positive number to indicate how many postings need to be removed. The same number of entries in the positions array must be set to -1 to indicate which positions to remove. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
pruneSomePositions	TokenNameIdentifier	 prune Some Positions
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
curTerm	TokenNameIdentifier	 cur Term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
