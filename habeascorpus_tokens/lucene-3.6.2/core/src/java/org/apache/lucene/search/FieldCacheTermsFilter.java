package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
IndexReader	TokenNameIdentifier	 Index Reader
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
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
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
TermDocs	TokenNameIdentifier	 Term Docs
;	TokenNameSEMICOLON	
// for javadocs 	TokenNameCOMMENT_LINE	for javadocs 
/** * A {@link Filter} that only accepts documents whose single * term value in the specified field is contained in the * provided set of allowed terms. * * <p/> * * This is the same functionality as TermsFilter (from * contrib/queries), except this filter requires that the * field contains only a single term for all documents. * Because of drastically different implementations, they * also have different performance characteristics, as * described below. * * <p/> * * The first invocation of this filter on a given field will * be slower, since a {@link FieldCache.StringIndex} must be * created. Subsequent invocations using the same field * will re-use this cache. However, as with all * functionality based on {@link FieldCache}, persistent RAM * is consumed to hold the cache, and is not freed until the * {@link IndexReader} is closed. In contrast, TermsFilter * has no persistent RAM consumption. * * * <p/> * * With each search, this filter translates the specified * set of Terms into a private {@link FixedBitSet} keyed by * term number per unique {@link IndexReader} (normally one * reader per segment). Then, during matching, the term * number for each docID is retrieved from the cache and * then checked for inclusion using the {@link FixedBitSet}. * Since all testing is done using RAM resident data * structures, performance should be very fast, most likely * fast enough to not require further caching of the * DocIdSet for each possible combination of terms. * However, because docIDs are simply scanned linearly, an * index with a great many small documents may find this * linear scan too costly. * * <p/> * * In contrast, TermsFilter builds up an {@link FixedBitSet}, * keyed by docID, every time it's created, by enumerating * through all matching docs using {@link TermDocs} to seek * and scan through each term's docID list. While there is * no linear scan of all docIDs, besides the allocation of * the underlying array in the {@link FixedBitSet}, this * approach requires a number of "disk seeks" in proportion * to the number of terms, which can be exceptionally costly * when there are cache misses in the OS's IO cache. * * <p/> * * Generally, this filter will be slower on the first * invocation for a given field, but subsequent invocations, * even if you change the allowed set of Terms, should be * faster than TermsFilter, especially as the number of * Terms being matched increases. If you are matching only * a very small number of terms, and those terms in turn * match a very small number of documents, TermsFilter may * perform faster. * * <p/> * * Which filter is best is very application dependent. */	TokenNameCOMMENT_JAVADOC	 A {@link Filter} that only accepts documents whose single term value in the specified field is contained in the provided set of allowed terms. * <p/> * This is the same functionality as TermsFilter (from contrib/queries), except this filter requires that the field contains only a single term for all documents. Because of drastically different implementations, they also have different performance characteristics, as described below. * <p/> * The first invocation of this filter on a given field will be slower, since a {@link FieldCache.StringIndex} must be created. Subsequent invocations using the same field will re-use this cache. However, as with all functionality based on {@link FieldCache}, persistent RAM is consumed to hold the cache, and is not freed until the {@link IndexReader} is closed. In contrast, TermsFilter has no persistent RAM consumption. * <p/> * With each search, this filter translates the specified set of Terms into a private {@link FixedBitSet} keyed by term number per unique {@link IndexReader} (normally one reader per segment). Then, during matching, the term number for each docID is retrieved from the cache and then checked for inclusion using the {@link FixedBitSet}. Since all testing is done using RAM resident data structures, performance should be very fast, most likely fast enough to not require further caching of the DocIdSet for each possible combination of terms. However, because docIDs are simply scanned linearly, an index with a great many small documents may find this linear scan too costly. * <p/> * In contrast, TermsFilter builds up an {@link FixedBitSet}, keyed by docID, every time it's created, by enumerating through all matching docs using {@link TermDocs} to seek and scan through each term's docID list. While there is no linear scan of all docIDs, besides the allocation of the underlying array in the {@link FixedBitSet}, this approach requires a number of "disk seeks" in proportion to the number of terms, which can be exceptionally costly when there are cache misses in the OS's IO cache. * <p/> * Generally, this filter will be slower on the first invocation for a given field, but subsequent invocations, even if you change the allowed set of Terms, should be faster than TermsFilter, especially as the number of Terms being matched increases. If you are matching only a very small number of terms, and those terms in turn match a very small number of documents, TermsFilter may perform faster. * <p/> * Which filter is best is very application dependent. 
public	TokenNamepublic	
class	TokenNameclass	
FieldCacheTermsFilter	TokenNameIdentifier	 Field Cache Terms Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FieldCacheTermsFilter	TokenNameIdentifier	 Field Cache Terms Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
...	TokenNameELLIPSIS	
terms	TokenNameIdentifier	 terms
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
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldCache	TokenNameIdentifier	 Field Cache
getFieldCache	TokenNameIdentifier	 get Field Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
fcsi	TokenNameIdentifier	 fcsi
=	TokenNameEQUAL	
getFieldCache	TokenNameIdentifier	 get Field Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
bits	TokenNameIdentifier	 bits
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
fcsi	TokenNameIdentifier	 fcsi
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
termNumber	TokenNameIdentifier	 term Number
=	TokenNameEQUAL	
fcsi	TokenNameIdentifier	 fcsi
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
termNumber	TokenNameIdentifier	 term Number
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
termNumber	TokenNameIdentifier	 term Number
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FieldCacheDocIdSet	TokenNameIdentifier	 Field Cache Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
matchDoc	TokenNameIdentifier	 match Doc
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bits	TokenNameIdentifier	 bits
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
fcsi	TokenNameIdentifier	 fcsi
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
