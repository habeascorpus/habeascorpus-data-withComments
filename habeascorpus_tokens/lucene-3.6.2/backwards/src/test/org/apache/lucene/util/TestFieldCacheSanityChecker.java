package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Copyright 2009 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2009 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
FieldCache	TokenNameIdentifier	 Field Cache
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
MultiReader	TokenNameIdentifier	 Multi Reader
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
.	TokenNameDOT	
Insanity	TokenNameIdentifier	 Insanity
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
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
.	TokenNameDOT	
InsanityType	TokenNameIdentifier	 Insanity Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestFieldCacheSanityChecker	TokenNameIdentifier	 Test Field Cache Sanity Checker
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
readerA	TokenNameIdentifier	 reader A
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
readerB	TokenNameIdentifier	 reader B
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
IndexReader	TokenNameIdentifier	 Index Reader
readerX	TokenNameIdentifier	 reader X
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Directory	TokenNameIdentifier	 Directory
dirA	TokenNameIdentifier	 dir A
,	TokenNameCOMMA	
dirB	TokenNameIdentifier	 dir B
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
=	TokenNameEQUAL	
1000	TokenNameIntegerLiteral	
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
dirA	TokenNameIdentifier	 dir A
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirB	TokenNameIdentifier	 dir B
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
wA	TokenNameIdentifier	 w A
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dirA	TokenNameIdentifier	 dir A
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
wB	TokenNameIdentifier	 w B
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dirB	TokenNameIdentifier	 dir B
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
theLong	TokenNameIdentifier	 the Long
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
double	TokenNamedouble	
theDouble	TokenNameIdentifier	 the Double
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
theByte	TokenNameIdentifier	 the Byte
=	TokenNameEQUAL	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
short	TokenNameshort	
theShort	TokenNameIdentifier	 the Short
=	TokenNameEQUAL	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
int	TokenNameint	
theInt	TokenNameIdentifier	 the Int
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
float	TokenNamefloat	
theFloat	TokenNameIdentifier	 the Float
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
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
NUM_DOCS	TokenNameIdentifier	 NUM  DOCS
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
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
"theLong"	TokenNameStringLiteral	theLong
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
theLong	TokenNameIdentifier	 the Long
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
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
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"theDouble"	TokenNameStringLiteral	theDouble
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
theDouble	TokenNameIdentifier	 the Double
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
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
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"theByte"	TokenNameStringLiteral	theByte
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
theByte	TokenNameIdentifier	 the Byte
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
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
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"theShort"	TokenNameStringLiteral	theShort
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
theShort	TokenNameIdentifier	 the Short
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
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
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"theInt"	TokenNameStringLiteral	theInt
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
theInt	TokenNameIdentifier	 the Int
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
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
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"theFloat"	TokenNameStringLiteral	theFloat
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
theFloat	TokenNameIdentifier	 the Float
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
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
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
%	TokenNameREMAINDER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wA	TokenNameIdentifier	 w A
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
wB	TokenNameIdentifier	 w B
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
wA	TokenNameIdentifier	 w A
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wB	TokenNameIdentifier	 w B
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readerA	TokenNameIdentifier	 reader A
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dirA	TokenNameIdentifier	 dir A
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readerB	TokenNameIdentifier	 reader B
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dirB	TokenNameIdentifier	 dir B
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readerX	TokenNameIdentifier	 reader X
=	TokenNameEQUAL	
new	TokenNamenew	
MultiReader	TokenNameIdentifier	 Multi Reader
(	TokenNameLPAREN	
new	TokenNamenew	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
readerA	TokenNameIdentifier	 reader A
,	TokenNameCOMMA	
readerB	TokenNameIdentifier	 reader B
}	TokenNameRBRACE	
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
readerA	TokenNameIdentifier	 reader A
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readerB	TokenNameIdentifier	 reader B
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
readerX	TokenNameIdentifier	 reader X
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirA	TokenNameIdentifier	 dir A
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dirB	TokenNameIdentifier	 dir B
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
public	TokenNamepublic	
void	TokenNamevoid	
testSanity	TokenNameIdentifier	 test Sanity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FieldCache	TokenNameIdentifier	 Field Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
purgeAllCaches	TokenNameIdentifier	 purge All Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
readerA	TokenNameIdentifier	 reader A
,	TokenNameCOMMA	
"theDouble"	TokenNameStringLiteral	theDouble
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
readerA	TokenNameIdentifier	 reader A
,	TokenNameCOMMA	
"theDouble"	TokenNameStringLiteral	theDouble
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT_DOUBLE_PARSER	TokenNameIdentifier	 DEFAULT  DOUBLE  PARSER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
readerB	TokenNameIdentifier	 reader B
,	TokenNameCOMMA	
"theDouble"	TokenNameStringLiteral	theDouble
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT_DOUBLE_PARSER	TokenNameIdentifier	 DEFAULT  DOUBLE  PARSER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
readerX	TokenNameIdentifier	 reader X
,	TokenNameCOMMA	
"theInt"	TokenNameStringLiteral	theInt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
readerX	TokenNameIdentifier	 reader X
,	TokenNameCOMMA	
"theInt"	TokenNameStringLiteral	theInt
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT_INT_PARSER	TokenNameIdentifier	 DEFAULT  INT  PARSER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// // // 	TokenNameCOMMENT_LINE	// // 
Insanity	TokenNameIdentifier	 Insanity
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
insanity	TokenNameIdentifier	 insanity
=	TokenNameEQUAL	
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
.	TokenNameDOT	
checkSanity	TokenNameIdentifier	 check Sanity
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
<	TokenNameLESS	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
dumpArray	TokenNameIdentifier	 dump Array
(	TokenNameLPAREN	
getTestLabel	TokenNameIdentifier	 get Test Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" INSANITY"	TokenNameStringLiteral	 INSANITY
,	TokenNameCOMMA	
insanity	TokenNameIdentifier	 insanity
,	TokenNameCOMMA	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"shouldn't be any cache insanity"	TokenNameStringLiteral	shouldn't be any cache insanity
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
purgeAllCaches	TokenNameIdentifier	 purge All Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInsanity1	TokenNameIdentifier	 test Insanity1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FieldCache	TokenNameIdentifier	 Field Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
purgeAllCaches	TokenNameIdentifier	 purge All Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
readerX	TokenNameIdentifier	 reader X
,	TokenNameCOMMA	
"theInt"	TokenNameStringLiteral	theInt
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT_INT_PARSER	TokenNameIdentifier	 DEFAULT  INT  PARSER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getStrings	TokenNameIdentifier	 get Strings
(	TokenNameLPAREN	
readerX	TokenNameIdentifier	 reader X
,	TokenNameCOMMA	
"theInt"	TokenNameStringLiteral	theInt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
readerX	TokenNameIdentifier	 reader X
,	TokenNameCOMMA	
"theByte"	TokenNameStringLiteral	theByte
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// // // 	TokenNameCOMMENT_LINE	// // 
Insanity	TokenNameIdentifier	 Insanity
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
insanity	TokenNameIdentifier	 insanity
=	TokenNameEQUAL	
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
.	TokenNameDOT	
checkSanity	TokenNameIdentifier	 check Sanity
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong number of cache errors"	TokenNameStringLiteral	wrong number of cache errors
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong type of cache error"	TokenNameStringLiteral	wrong type of cache error
,	TokenNameCOMMA	
InsanityType	TokenNameIdentifier	 Insanity Type
.	TokenNameDOT	
VALUEMISMATCH	TokenNameIdentifier	 VALUEMISMATCH
,	TokenNameCOMMA	
insanity	TokenNameIdentifier	 insanity
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong number of entries in cache error"	TokenNameStringLiteral	wrong number of entries in cache error
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
insanity	TokenNameIdentifier	 insanity
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we expect bad things, don't let tearDown complain about them 	TokenNameCOMMENT_LINE	we expect bad things, don't let tearDown complain about them 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
purgeAllCaches	TokenNameIdentifier	 purge All Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInsanity2	TokenNameIdentifier	 test Insanity2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FieldCache	TokenNameIdentifier	 Field Cache
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
purgeAllCaches	TokenNameIdentifier	 purge All Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getStrings	TokenNameIdentifier	 get Strings
(	TokenNameLPAREN	
readerA	TokenNameIdentifier	 reader A
,	TokenNameCOMMA	
"theString"	TokenNameStringLiteral	theString
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getStrings	TokenNameIdentifier	 get Strings
(	TokenNameLPAREN	
readerB	TokenNameIdentifier	 reader B
,	TokenNameCOMMA	
"theString"	TokenNameStringLiteral	theString
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getStrings	TokenNameIdentifier	 get Strings
(	TokenNameLPAREN	
readerX	TokenNameIdentifier	 reader X
,	TokenNameCOMMA	
"theString"	TokenNameStringLiteral	theString
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
readerX	TokenNameIdentifier	 reader X
,	TokenNameCOMMA	
"theByte"	TokenNameStringLiteral	theByte
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// // // 	TokenNameCOMMENT_LINE	// // 
Insanity	TokenNameIdentifier	 Insanity
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
insanity	TokenNameIdentifier	 insanity
=	TokenNameEQUAL	
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
.	TokenNameDOT	
checkSanity	TokenNameIdentifier	 check Sanity
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong number of cache errors"	TokenNameStringLiteral	wrong number of cache errors
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong type of cache error"	TokenNameStringLiteral	wrong type of cache error
,	TokenNameCOMMA	
InsanityType	TokenNameIdentifier	 Insanity Type
.	TokenNameDOT	
SUBREADER	TokenNameIdentifier	 SUBREADER
,	TokenNameCOMMA	
insanity	TokenNameIdentifier	 insanity
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"wrong number of entries in cache error"	TokenNameStringLiteral	wrong number of entries in cache error
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
insanity	TokenNameIdentifier	 insanity
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we expect bad things, don't let tearDown complain about them 	TokenNameCOMMENT_LINE	we expect bad things, don't let tearDown complain about them 
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
purgeAllCaches	TokenNameIdentifier	 purge All Caches
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testInsanity3	TokenNameIdentifier	 test Insanity3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// :TODO: subreader tree walking is really hairy ... add more crazy tests. 	TokenNameCOMMENT_LINE	:TODO: subreader tree walking is really hairy ... add more crazy tests. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
