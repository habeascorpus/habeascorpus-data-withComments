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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
AfterClass	TokenNameIdentifier	 After Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
BeforeClass	TokenNameIdentifier	 Before Class
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestNGramPhraseQuery	TokenNameIdentifier	 Test N Gram Phrase Query
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
@	TokenNameAT	
BeforeClass	TokenNameIdentifier	 Before Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
beforeClass	TokenNameIdentifier	 before Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
afterClass	TokenNameIdentifier	 after Class
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
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRewrite	TokenNameIdentifier	 test Rewrite
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// bi-gram test ABC => AB/BC => AB/BC 	TokenNameCOMMENT_LINE	bi-gram test ABC => AB/BC => AB/BC 
PhraseQuery	TokenNameIdentifier	 Phrase Query
pq1	TokenNameIdentifier	 pq1
=	TokenNameEQUAL	
new	TokenNamenew	
NGramPhraseQuery	TokenNameIdentifier	 N Gram Phrase Query
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq1	TokenNameIdentifier	 pq1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"AB"	TokenNameStringLiteral	AB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq1	TokenNameIdentifier	 pq1
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"BC"	TokenNameStringLiteral	BC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
pq1	TokenNameIdentifier	 pq1
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
instanceof	TokenNameinstanceof	
NGramPhraseQuery	TokenNameIdentifier	 N Gram Phrase Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertSame	TokenNameIdentifier	 assert Same
(	TokenNameLPAREN	
pq1	TokenNameIdentifier	 pq1
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq1	TokenNameIdentifier	 pq1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NGramPhraseQuery	TokenNameIdentifier	 N Gram Phrase Query
)	TokenNameRPAREN	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
assertArrayEquals	TokenNameIdentifier	 assert Array Equals
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"AB"	TokenNameStringLiteral	AB
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"BC"	TokenNameStringLiteral	BC
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
pq1	TokenNameIdentifier	 pq1
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertArrayEquals	TokenNameIdentifier	 assert Array Equals
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
pq1	TokenNameIdentifier	 pq1
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// bi-gram test ABCD => AB/BC/CD => AB//CD 	TokenNameCOMMENT_LINE	bi-gram test ABCD => AB/BC/CD => AB//CD 
PhraseQuery	TokenNameIdentifier	 Phrase Query
pq2	TokenNameIdentifier	 pq2
=	TokenNameEQUAL	
new	TokenNamenew	
NGramPhraseQuery	TokenNameIdentifier	 N Gram Phrase Query
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq2	TokenNameIdentifier	 pq2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"AB"	TokenNameStringLiteral	AB
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq2	TokenNameIdentifier	 pq2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"BC"	TokenNameStringLiteral	BC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq2	TokenNameIdentifier	 pq2
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"CD"	TokenNameStringLiteral	CD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
pq2	TokenNameIdentifier	 pq2
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
instanceof	TokenNameinstanceof	
PhraseQuery	TokenNameIdentifier	 Phrase Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
pq2	TokenNameIdentifier	 pq2
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq2	TokenNameIdentifier	 pq2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PhraseQuery	TokenNameIdentifier	 Phrase Query
)	TokenNameRPAREN	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
assertArrayEquals	TokenNameIdentifier	 assert Array Equals
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"AB"	TokenNameStringLiteral	AB
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"CD"	TokenNameStringLiteral	CD
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
pq2	TokenNameIdentifier	 pq2
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertArrayEquals	TokenNameIdentifier	 assert Array Equals
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
pq2	TokenNameIdentifier	 pq2
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tri-gram test ABCDEFGH => ABC/BCD/CDE/DEF/EFG/FGH => ABC///DEF//FGH 	TokenNameCOMMENT_LINE	tri-gram test ABCDEFGH => ABC/BCD/CDE/DEF/EFG/FGH => ABC///DEF//FGH 
PhraseQuery	TokenNameIdentifier	 Phrase Query
pq3	TokenNameIdentifier	 pq3
=	TokenNameEQUAL	
new	TokenNamenew	
NGramPhraseQuery	TokenNameIdentifier	 N Gram Phrase Query
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"ABC"	TokenNameStringLiteral	ABC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"BCD"	TokenNameStringLiteral	BCD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"CDE"	TokenNameStringLiteral	CDE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"DEF"	TokenNameStringLiteral	DEF
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"EFG"	TokenNameStringLiteral	EFG
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"FGH"	TokenNameStringLiteral	FGH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
instanceof	TokenNameinstanceof	
PhraseQuery	TokenNameIdentifier	 Phrase Query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotSame	TokenNameIdentifier	 assert Not Same
(	TokenNameLPAREN	
pq3	TokenNameIdentifier	 pq3
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pq3	TokenNameIdentifier	 pq3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PhraseQuery	TokenNameIdentifier	 Phrase Query
)	TokenNameRPAREN	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
assertArrayEquals	TokenNameIdentifier	 assert Array Equals
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"ABC"	TokenNameStringLiteral	ABC
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"DEF"	TokenNameStringLiteral	DEF
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"FGH"	TokenNameStringLiteral	FGH
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertArrayEquals	TokenNameIdentifier	 assert Array Equals
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
pq3	TokenNameIdentifier	 pq3
.	TokenNameDOT	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
