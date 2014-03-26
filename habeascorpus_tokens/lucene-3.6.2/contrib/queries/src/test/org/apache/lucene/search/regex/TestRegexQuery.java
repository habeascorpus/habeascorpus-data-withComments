package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
IndexSearcher	TokenNameIdentifier	 Index Searcher
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
SpanQuery	TokenNameIdentifier	 Span Query
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
TestRegexQuery	TokenNameIdentifier	 Test Regex Query
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FN	TokenNameIdentifier	 FN
=	TokenNameEQUAL	
"field"	TokenNameStringLiteral	field
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
FN	TokenNameIdentifier	 FN
,	TokenNameCOMMA	
"the quick brown fox jumps over the lazy dog"	TokenNameStringLiteral	the quick brown fox jumps over the lazy dog
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
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
searcher	TokenNameIdentifier	 searcher
=	TokenNameEQUAL	
newSearcher	TokenNameIdentifier	 new Searcher
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
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
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
Term	TokenNameIdentifier	 Term
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
FN	TokenNameIdentifier	 FN
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
regexQueryNrHits	TokenNameIdentifier	 regex Query Nr Hits
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
regex	TokenNameIdentifier	 regex
,	TokenNameCOMMA	
RegexCapabilities	TokenNameIdentifier	 Regex Capabilities
capability	TokenNameIdentifier	 capability
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
RegexQuery	TokenNameIdentifier	 Regex Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
RegexQuery	TokenNameIdentifier	 Regex Query
(	TokenNameLPAREN	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
regex	TokenNameIdentifier	 regex
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
capability	TokenNameIdentifier	 capability
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
setRegexImplementation	TokenNameIdentifier	 set Regex Implementation
(	TokenNameLPAREN	
capability	TokenNameIdentifier	 capability
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
spanRegexQueryNrHits	TokenNameIdentifier	 span Regex Query Nr Hits
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
regex1	TokenNameIdentifier	 regex1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
regex2	TokenNameIdentifier	 regex2
,	TokenNameCOMMA	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
boolean	TokenNameboolean	
ordered	TokenNameIdentifier	 ordered
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
SpanRegexQuery	TokenNameIdentifier	 Span Regex Query
srq1	TokenNameIdentifier	 srq1
=	TokenNameEQUAL	
new	TokenNamenew	
SpanRegexQuery	TokenNameIdentifier	 Span Regex Query
(	TokenNameLPAREN	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
regex1	TokenNameIdentifier	 regex1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanRegexQuery	TokenNameIdentifier	 Span Regex Query
srq2	TokenNameIdentifier	 srq2
=	TokenNameEQUAL	
new	TokenNamenew	
SpanRegexQuery	TokenNameIdentifier	 Span Regex Query
(	TokenNameLPAREN	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
regex2	TokenNameIdentifier	 regex2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
SpanNearQuery	TokenNameIdentifier	 Span Near Query
(	TokenNameLPAREN	
new	TokenNamenew	
SpanQuery	TokenNameIdentifier	 Span Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
srq1	TokenNameIdentifier	 srq1
,	TokenNameCOMMA	
srq2	TokenNameIdentifier	 srq2
}	TokenNameRBRACE	
,	TokenNameCOMMA	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
ordered	TokenNameIdentifier	 ordered
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMatchAll	TokenNameIdentifier	 test Match All
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TermEnum	TokenNameIdentifier	 Term Enum
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
RegexQuery	TokenNameIdentifier	 Regex Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
FN	TokenNameIdentifier	 FN
,	TokenNameCOMMA	
"jum."	TokenNameStringLiteral	jum.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getEnum	TokenNameIdentifier	 get Enum
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
getIndexReader	TokenNameIdentifier	 get Index Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// no term should match 	TokenNameCOMMENT_LINE	no term should match 
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRegex1	TokenNameIdentifier	 test Regex1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
regexQueryNrHits	TokenNameIdentifier	 regex Query Nr Hits
(	TokenNameLPAREN	
"^q.[aeiou]c.*$"	TokenNameStringLiteral	^q.[aeiou]c.*$
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRegex2	TokenNameIdentifier	 test Regex2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
regexQueryNrHits	TokenNameIdentifier	 regex Query Nr Hits
(	TokenNameLPAREN	
"^.[aeiou]c.*$"	TokenNameStringLiteral	^.[aeiou]c.*$
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRegex3	TokenNameIdentifier	 test Regex3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
regexQueryNrHits	TokenNameIdentifier	 regex Query Nr Hits
(	TokenNameLPAREN	
"^q.[aeiou]c$"	TokenNameStringLiteral	^q.[aeiou]c$
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSpanRegex1	TokenNameIdentifier	 test Span Regex1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
spanRegexQueryNrHits	TokenNameIdentifier	 span Regex Query Nr Hits
(	TokenNameLPAREN	
"^q.[aeiou]c.*$"	TokenNameStringLiteral	^q.[aeiou]c.*$
,	TokenNameCOMMA	
"dog"	TokenNameStringLiteral	dog
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSpanRegex2	TokenNameIdentifier	 test Span Regex2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
spanRegexQueryNrHits	TokenNameIdentifier	 span Regex Query Nr Hits
(	TokenNameLPAREN	
"^q.[aeiou]c.*$"	TokenNameStringLiteral	^q.[aeiou]c.*$
,	TokenNameCOMMA	
"dog"	TokenNameStringLiteral	dog
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEquals	TokenNameIdentifier	 test Equals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
RegexQuery	TokenNameIdentifier	 Regex Query
query1	TokenNameIdentifier	 query1
=	TokenNameEQUAL	
new	TokenNamenew	
RegexQuery	TokenNameIdentifier	 Regex Query
(	TokenNameLPAREN	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
"foo.*"	TokenNameStringLiteral	foo.*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query1	TokenNameIdentifier	 query1
.	TokenNameDOT	
setRegexImplementation	TokenNameIdentifier	 set Regex Implementation
(	TokenNameLPAREN	
new	TokenNamenew	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RegexQuery	TokenNameIdentifier	 Regex Query
query2	TokenNameIdentifier	 query2
=	TokenNameEQUAL	
new	TokenNamenew	
RegexQuery	TokenNameIdentifier	 Regex Query
(	TokenNameLPAREN	
newTerm	TokenNameIdentifier	 new Term
(	TokenNameLPAREN	
"foo.*"	TokenNameStringLiteral	foo.*
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
query1	TokenNameIdentifier	 query1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
query2	TokenNameIdentifier	 query2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJakartaCaseSensativeFail	TokenNameIdentifier	 test Jakarta Case Sensative Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
regexQueryNrHits	TokenNameIdentifier	 regex Query Nr Hits
(	TokenNameLPAREN	
"^.*DOG.*$"	TokenNameStringLiteral	^.*DOG.*$
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJavaUtilCaseSensativeFail	TokenNameIdentifier	 test Java Util Case Sensative Fail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
regexQueryNrHits	TokenNameIdentifier	 regex Query Nr Hits
(	TokenNameLPAREN	
"^.*DOG.*$"	TokenNameStringLiteral	^.*DOG.*$
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJakartaCaseInsensative	TokenNameIdentifier	 test Jakarta Case Insensative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
regexQueryNrHits	TokenNameIdentifier	 regex Query Nr Hits
(	TokenNameLPAREN	
"^.*DOG.*$"	TokenNameStringLiteral	^.*DOG.*$
,	TokenNameCOMMA	
new	TokenNamenew	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
(	TokenNameLPAREN	
JakartaRegexpCapabilities	TokenNameIdentifier	 Jakarta Regexp Capabilities
.	TokenNameDOT	
FLAG_MATCH_CASEINDEPENDENT	TokenNameIdentifier	 FLAG  MATCH  CASEINDEPENDENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testJavaUtilCaseInsensative	TokenNameIdentifier	 test Java Util Case Insensative
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
regexQueryNrHits	TokenNameIdentifier	 regex Query Nr Hits
(	TokenNameLPAREN	
"^.*DOG.*$"	TokenNameStringLiteral	^.*DOG.*$
,	TokenNameCOMMA	
new	TokenNamenew	
JavaUtilRegexCapabilities	TokenNameIdentifier	 Java Util Regex Capabilities
(	TokenNameLPAREN	
JavaUtilRegexCapabilities	TokenNameIdentifier	 Java Util Regex Capabilities
.	TokenNameDOT	
FLAG_CASE_INSENSITIVE	TokenNameIdentifier	 FLAG  CASE  INSENSITIVE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
