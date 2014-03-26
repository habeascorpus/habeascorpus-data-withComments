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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
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
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
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
Document	TokenNameIdentifier	 Document
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
Field	TokenNameIdentifier	 Field
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
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
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
Directory	TokenNameIdentifier	 Directory
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
BooleanFilterTest	TokenNameIdentifier	 Boolean Filter Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//Add series of docs with filterable fields : acces rights, prices, dates and "in-stock" flags 	TokenNameCOMMENT_LINE	Add series of docs with filterable fields : acces rights, prices, dates and "in-stock" flags 
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"admin guest"	TokenNameStringLiteral	admin guest
,	TokenNameCOMMA	
"010"	TokenNameStringLiteral	010
,	TokenNameCOMMA	
"20040101"	TokenNameStringLiteral	20040101
,	TokenNameCOMMA	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"guest"	TokenNameStringLiteral	guest
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"20040101"	TokenNameStringLiteral	20040101
,	TokenNameCOMMA	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"guest"	TokenNameStringLiteral	guest
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"20050101"	TokenNameStringLiteral	20050101
,	TokenNameCOMMA	
"Y"	TokenNameStringLiteral	Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"20050101"	TokenNameStringLiteral	20050101
,	TokenNameCOMMA	
"Maybe"	TokenNameStringLiteral	Maybe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"admin guest"	TokenNameStringLiteral	admin guest
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
,	TokenNameCOMMA	
"20050101"	TokenNameStringLiteral	20050101
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
accessRights	TokenNameIdentifier	 access Rights
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
price	TokenNameIdentifier	 price
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
inStock	TokenNameIdentifier	 in Stock
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
accessRights	TokenNameIdentifier	 access Rights
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
price	TokenNameIdentifier	 price
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
inStock	TokenNameIdentifier	 in Stock
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
lowerPrice	TokenNameIdentifier	 lower Price
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
upperPrice	TokenNameIdentifier	 upper Price
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Filter	TokenNameIdentifier	 Filter
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
TermRangeFilter	TokenNameIdentifier	 Term Range Filter
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
lowerPrice	TokenNameIdentifier	 lower Price
,	TokenNameCOMMA	
upperPrice	TokenNameIdentifier	 upper Price
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermsFilter	TokenNameIdentifier	 Terms Filter
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
TermsFilter	TokenNameIdentifier	 Terms Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tf	TokenNameIdentifier	 tf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
getEmptyFilter	TokenNameIdentifier	 get Empty Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
getNullDISFilter	TokenNameIdentifier	 get Null DIS Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
getNullDISIFilter	TokenNameIdentifier	 get Null DISI Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Filter	TokenNameIdentifier	 Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
DocIdSet	TokenNameIdentifier	 Doc Id Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
isCacheable	TokenNameIdentifier	 is Cacheable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mes	TokenNameIdentifier	 mes
,	TokenNameCOMMA	
int	TokenNameint	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filt	TokenNameIdentifier	 filt
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// BooleanFilter never returns null DIS or null DISI! 	TokenNameCOMMENT_LINE	BooleanFilter never returns null DIS or null DISI! 
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
=	TokenNameEQUAL	
filt	TokenNameIdentifier	 filt
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
.	TokenNameDOT	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actual	TokenNameIdentifier	 actual
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
mes	TokenNameIdentifier	 mes
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShould	TokenNameIdentifier	 test Should
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Should retrieves only 1 doc"	TokenNameStringLiteral	Should retrieves only 1 doc
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same with a real DISI (no OpenBitSetIterator) 	TokenNameCOMMENT_LINE	same with a real DISI (no OpenBitSetIterator) 
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Should retrieves only 1 doc"	TokenNameStringLiteral	Should retrieves only 1 doc
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShoulds	TokenNameIdentifier	 test Shoulds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"010"	TokenNameStringLiteral	010
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds are Ored together"	TokenNameStringLiteral	Shoulds are Ored together
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldsAndMustNot	TokenNameIdentifier	 test Shoulds And Must Not
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"010"	TokenNameStringLiteral	010
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but AndNot"	TokenNameStringLiteral	Shoulds Ored but AndNot
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"Maybe"	TokenNameStringLiteral	Maybe
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but AndNots"	TokenNameStringLiteral	Shoulds Ored but AndNots
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same with a real DISI (no OpenBitSetIterator) 	TokenNameCOMMENT_LINE	same with a real DISI (no OpenBitSetIterator) 
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"010"	TokenNameStringLiteral	010
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but AndNot"	TokenNameStringLiteral	Shoulds Ored but AndNot
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"Maybe"	TokenNameStringLiteral	Maybe
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but AndNots"	TokenNameStringLiteral	Shoulds Ored but AndNots
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldsAndMust	TokenNameIdentifier	 test Shoulds And Must
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"010"	TokenNameStringLiteral	010
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but MUST"	TokenNameStringLiteral	Shoulds Ored but MUST
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same with a real DISI (no OpenBitSetIterator) 	TokenNameCOMMENT_LINE	same with a real DISI (no OpenBitSetIterator) 
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"010"	TokenNameStringLiteral	010
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but MUST"	TokenNameStringLiteral	Shoulds Ored but MUST
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldsAndMusts	TokenNameIdentifier	 test Shoulds And Musts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"010"	TokenNameStringLiteral	010
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"020"	TokenNameStringLiteral	020
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
"20040101"	TokenNameStringLiteral	20040101
,	TokenNameCOMMA	
"20041231"	TokenNameStringLiteral	20041231
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but MUSTs ANDED"	TokenNameStringLiteral	Shoulds Ored but MUSTs ANDED
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testShouldsAndMustsAndMustNot	TokenNameIdentifier	 test Shoulds And Musts And Must Not
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
,	TokenNameCOMMA	
"040"	TokenNameStringLiteral	040
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
"20050101"	TokenNameStringLiteral	20050101
,	TokenNameCOMMA	
"20051231"	TokenNameStringLiteral	20051231
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but MUSTs ANDED and MustNot"	TokenNameStringLiteral	Shoulds Ored but MUSTs ANDED and MustNot
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same with a real DISI (no OpenBitSetIterator) 	TokenNameCOMMENT_LINE	same with a real DISI (no OpenBitSetIterator) 
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
,	TokenNameCOMMA	
"040"	TokenNameStringLiteral	040
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getRangeFilter	TokenNameIdentifier	 get Range Filter
(	TokenNameLPAREN	
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
"20050101"	TokenNameStringLiteral	20050101
,	TokenNameCOMMA	
"20051231"	TokenNameStringLiteral	20051231
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"Shoulds Ored but MUSTs ANDED and MustNot"	TokenNameStringLiteral	Shoulds Ored but MUSTs ANDED and MustNot
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJustMust	TokenNameIdentifier	 test Just Must
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"MUST"	TokenNameStringLiteral	MUST
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same with a real DISI (no OpenBitSetIterator) 	TokenNameCOMMENT_LINE	same with a real DISI (no OpenBitSetIterator) 
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"MUST"	TokenNameStringLiteral	MUST
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJustMustNot	TokenNameIdentifier	 test Just Must Not
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"MUST_NOT"	TokenNameStringLiteral	MUST_NOT
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same with a real DISI (no OpenBitSetIterator) 	TokenNameCOMMENT_LINE	same with a real DISI (no OpenBitSetIterator) 
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"MUST_NOT"	TokenNameStringLiteral	MUST_NOT
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMustAndMustNot	TokenNameIdentifier	 test Must And Must Not
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"MUST_NOT wins over MUST for same docs"	TokenNameStringLiteral	MUST_NOT wins over MUST for same docs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same with a real DISI (no OpenBitSetIterator) 	TokenNameCOMMENT_LINE	same with a real DISI (no OpenBitSetIterator) 
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"inStock"	TokenNameStringLiteral	inStock
,	TokenNameCOMMA	
"N"	TokenNameStringLiteral	N
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getWrappedTermQuery	TokenNameIdentifier	 get Wrapped Term Query
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"MUST_NOT wins over MUST for same docs"	TokenNameStringLiteral	MUST_NOT wins over MUST for same docs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmpty	TokenNameIdentifier	 test Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"empty BooleanFilter returns no results"	TokenNameStringLiteral	empty BooleanFilter returns no results
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCombinedNullDocIdSets	TokenNameIdentifier	 test Combined Null Doc Id Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISFilter	TokenNameIdentifier	 get Null DIS Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A MUST filter that returns a null DIS should never return documents"	TokenNameStringLiteral	A MUST filter that returns a null DIS should never return documents
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISIFilter	TokenNameIdentifier	 get Null DISI Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A MUST filter that returns a null DISI should never return documents"	TokenNameStringLiteral	A MUST filter that returns a null DISI should never return documents
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISFilter	TokenNameIdentifier	 get Null DIS Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A SHOULD filter that returns a null DIS should be invisible"	TokenNameStringLiteral	A SHOULD filter that returns a null DIS should be invisible
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISIFilter	TokenNameIdentifier	 get Null DISI Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A SHOULD filter that returns a null DISI should be invisible"	TokenNameStringLiteral	A SHOULD filter that returns a null DISI should be invisible
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISFilter	TokenNameIdentifier	 get Null DIS Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A MUST_NOT filter that returns a null DIS should be invisible"	TokenNameStringLiteral	A MUST_NOT filter that returns a null DIS should be invisible
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"price"	TokenNameStringLiteral	price
,	TokenNameCOMMA	
"030"	TokenNameStringLiteral	030
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISIFilter	TokenNameIdentifier	 get Null DISI Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A MUST_NOT filter that returns a null DISI should be invisible"	TokenNameStringLiteral	A MUST_NOT filter that returns a null DISI should be invisible
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJustNullDocIdSets	TokenNameIdentifier	 test Just Null Doc Id Sets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISFilter	TokenNameIdentifier	 get Null DIS Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A MUST filter that returns a null DIS should never return documents"	TokenNameStringLiteral	A MUST filter that returns a null DIS should never return documents
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISIFilter	TokenNameIdentifier	 get Null DISI Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A MUST filter that returns a null DISI should never return documents"	TokenNameStringLiteral	A MUST filter that returns a null DISI should never return documents
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISFilter	TokenNameIdentifier	 get Null DIS Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A single SHOULD filter that returns a null DIS should never return documents"	TokenNameStringLiteral	A single SHOULD filter that returns a null DIS should never return documents
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISIFilter	TokenNameIdentifier	 get Null DISI Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A single SHOULD filter that returns a null DISI should never return documents"	TokenNameStringLiteral	A single SHOULD filter that returns a null DISI should never return documents
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISFilter	TokenNameIdentifier	 get Null DIS Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A single MUST_NOT filter that returns a null DIS should be invisible"	TokenNameStringLiteral	A single MUST_NOT filter that returns a null DIS should be invisible
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISIFilter	TokenNameIdentifier	 get Null DISI Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
"A single MUST_NOT filter that returns a null DIS should be invisible"	TokenNameStringLiteral	A single MUST_NOT filter that returns a null DIS should be invisible
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testNonMatchingShouldsAndMusts	TokenNameIdentifier	 test Non Matching Shoulds And Musts
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getEmptyFilter	TokenNameIdentifier	 get Empty Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
">0 shoulds with no matches should return no docs"	TokenNameStringLiteral	>0 shoulds with no matches should return no docs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISFilter	TokenNameIdentifier	 get Null DIS Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
">0 shoulds with no matches should return no docs"	TokenNameStringLiteral	>0 shoulds with no matches should return no docs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
=	TokenNameEQUAL	
new	TokenNamenew	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getNullDISIFilter	TokenNameIdentifier	 get Null DISI Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
booleanFilter	TokenNameIdentifier	 boolean Filter
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
getTermsFilter	TokenNameIdentifier	 get Terms Filter
(	TokenNameLPAREN	
"accessRights"	TokenNameStringLiteral	accessRights
,	TokenNameCOMMA	
"admin"	TokenNameStringLiteral	admin
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tstFilterCard	TokenNameIdentifier	 tst Filter Card
(	TokenNameLPAREN	
">0 shoulds with no matches should return no docs"	TokenNameStringLiteral	>0 shoulds with no matches should return no docs
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
booleanFilter	TokenNameIdentifier	 boolean Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
