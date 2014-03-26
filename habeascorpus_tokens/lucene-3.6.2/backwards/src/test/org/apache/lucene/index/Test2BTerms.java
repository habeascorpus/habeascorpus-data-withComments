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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Ignore	TokenNameIdentifier	 Ignore
;	TokenNameSEMICOLON	
// Best to run this test w/ plenty of RAM (because of the 	TokenNameCOMMENT_LINE	Best to run this test w/ plenty of RAM (because of the 
// terms index): 	TokenNameCOMMENT_LINE	terms index): 
// 	TokenNameCOMMENT_LINE	 
// ant compile-test 	TokenNameCOMMENT_LINE	ant compile-test 
// 	TokenNameCOMMENT_LINE	 
// java -server -Xmx8g -d64 -cp .:lib/junit-4.7.jar:./build/classes/test:./build/classes/test-framework:./build/classes/java -Dlucene.version=4.0-dev -Dtests.directory=MMapDirectory -DtempDir=build -ea org.junit.runner.JUnitCore org.apache.lucene.index.Test2BTerms 	TokenNameCOMMENT_LINE	java -server -Xmx8g -d64 -cp .:lib/junit-4.7.jar:./build/classes/test:./build/classes/test-framework:./build/classes/java -Dlucene.version=4.0-dev -Dtests.directory=MMapDirectory -DtempDir=build -ea org.junit.runner.JUnitCore org.apache.lucene.index.Test2BTerms 
// 	TokenNameCOMMENT_LINE	 
public	TokenNamepublic	
class	TokenNameclass	
Test2BTerms	TokenNameIdentifier	 Test2 B Terms
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
MyTokenStream	TokenNameIdentifier	 My Token Stream
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
tokensPerDoc	TokenNameIdentifier	 tokens Per Doc
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tokenCount	TokenNameIdentifier	 token Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
charTerm	TokenNameIdentifier	 char Term
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
TOKEN_LEN	TokenNameIdentifier	 TOKEN  LEN
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
savedTerms	TokenNameIdentifier	 saved Terms
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nextSave	TokenNameIdentifier	 next Save
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MyTokenStream	TokenNameIdentifier	 My Token Stream
(	TokenNameLPAREN	
int	TokenNameint	
tokensPerDoc	TokenNameIdentifier	 tokens Per Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tokensPerDoc	TokenNameIdentifier	 tokens Per Doc
=	TokenNameEQUAL	
tokensPerDoc	TokenNameIdentifier	 tokens Per Doc
;	TokenNameSEMICOLON	
charTerm	TokenNameIdentifier	 char Term
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
charTerm	TokenNameIdentifier	 char Term
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
TOKEN_LEN	TokenNameIdentifier	 TOKEN  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
charTerm	TokenNameIdentifier	 char Term
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
TOKEN_LEN	TokenNameIdentifier	 TOKEN  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextSave	TokenNameIdentifier	 next Save
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
500000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
tokenCount	TokenNameIdentifier	 token Count
>=	TokenNameGREATER_EQUAL	
tokensPerDoc	TokenNameIdentifier	 tokens Per Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
randomFixedLengthUnicodeString	TokenNameIdentifier	 random Fixed Length Unicode String
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TOKEN_LEN	TokenNameIdentifier	 TOKEN  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenCount	TokenNameIdentifier	 token Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
nextSave	TokenNameIdentifier	 next Save
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
TOKEN_LEN	TokenNameIdentifier	 TOKEN  LEN
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: save term="	TokenNameStringLiteral	TEST: save term=
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
" ["	TokenNameStringLiteral	 [
+	TokenNamePLUS	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
savedTerms	TokenNameIdentifier	 saved Terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextSave	TokenNameIdentifier	 next Save
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
500000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tokenCount	TokenNameIdentifier	 token Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
(	TokenNameLPAREN	
"Takes ~4 hours to run on a fast machine!!"	TokenNameStringLiteral	Takes ~4 hours to run on a fast machine!!
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
test2BTerms	TokenNameIdentifier	 test2 B Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
TERM_COUNT	TokenNameIdentifier	 TERM  COUNT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
+	TokenNamePLUS	
100000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
TERMS_PER_DOC	TokenNameIdentifier	 TERMS  PER  DOC
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
100000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
savedTerms	TokenNameIdentifier	 saved Terms
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newFSDirectory	TokenNameIdentifier	 new FS Directory
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
getTempDir	TokenNameIdentifier	 get Temp Dir
(	TokenNameLPAREN	
"2BTerms"	TokenNameStringLiteral	2BTerms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
setThrottling	TokenNameIdentifier	 set Throttling
(	TokenNameLPAREN	
MockDirectoryWrapper	TokenNameIdentifier	 Mock Directory Wrapper
.	TokenNameDOT	
Throttling	TokenNameIdentifier	 Throttling
.	TokenNameDOT	
NEVER	TokenNameIdentifier	 NEVER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
setCheckIndexOnClose	TokenNameIdentifier	 set Check Index On Close
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// don't double-checkindex 	TokenNameCOMMENT_LINE	don't double-checkindex 
//Directory dir = newFSDirectory(new File("/p/lucene/indices/2bindex")); 	TokenNameCOMMENT_LINE	Directory dir = newFSDirectory(new File("/p/lucene/indices/2bindex")); 
if	TokenNameif	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
new	TokenNamenew	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
DISABLE_AUTO_FLUSH	TokenNameIdentifier	 DISABLE  AUTO  FLUSH
)	TokenNameRPAREN	
.	TokenNameDOT	
setRAMBufferSizeMB	TokenNameIdentifier	 set RAM Buffer Size MB
(	TokenNameLPAREN	
256.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergeScheduler	TokenNameIdentifier	 set Merge Scheduler
(	TokenNameLPAREN	
new	TokenNamenew	
ConcurrentMergeScheduler	TokenNameIdentifier	 Concurrent Merge Scheduler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setOpenMode	TokenNameIdentifier	 set Open Mode
(	TokenNameLPAREN	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
.	TokenNameDOT	
OpenMode	TokenNameIdentifier	 Open Mode
.	TokenNameDOT	
CREATE	TokenNameIdentifier	 CREATE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MergePolicy	TokenNameIdentifier	 Merge Policy
mp	TokenNameIdentifier	 mp
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMergePolicy	TokenNameIdentifier	 get Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mp	TokenNameIdentifier	 mp
instanceof	TokenNameinstanceof	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 1 petabyte: 	TokenNameCOMMENT_LINE	1 petabyte: 
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LogByteSizeMergePolicy	TokenNameIdentifier	 Log Byte Size Merge Policy
)	TokenNameRPAREN	
mp	TokenNameIdentifier	 mp
)	TokenNameRPAREN	
.	TokenNameDOT	
setMaxMergeMB	TokenNameIdentifier	 set Max Merge MB
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
MyTokenStream	TokenNameIdentifier	 My Token Stream
ts	TokenNameIdentifier	 ts
=	TokenNameEQUAL	
new	TokenNamenew	
MyTokenStream	TokenNameIdentifier	 My Token Stream
(	TokenNameLPAREN	
TERMS_PER_DOC	TokenNameIdentifier	 TERMS  PER  DOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Field	TokenNameIdentifier	 Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
ts	TokenNameIdentifier	 ts
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
setIndexOptions	TokenNameIdentifier	 set Index Options
(	TokenNameLPAREN	
IndexOptions	TokenNameIdentifier	 Index Options
.	TokenNameDOT	
DOCS_ONLY	TokenNameIdentifier	 DOCS  ONLY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
setOmitNorms	TokenNameIdentifier	 set Omit Norms
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//w.setInfoStream(System.out); 	TokenNameCOMMENT_LINE	w.setInfoStream(System.out); 
final	TokenNamefinal	
int	TokenNameint	
numDocs	TokenNameIdentifier	 num Docs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
TERM_COUNT	TokenNameIdentifier	 TERM  COUNT
/	TokenNameDIVIDE	
TERMS_PER_DOC	TokenNameIdentifier	 TERMS  PER  DOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TERMS_PER_DOC="	TokenNameStringLiteral	TERMS_PER_DOC=
+	TokenNamePLUS	
TERMS_PER_DOC	TokenNameIdentifier	 TERMS  PER  DOC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"numDocs="	TokenNameStringLiteral	numDocs=
+	TokenNamePLUS	
numDocs	TokenNameIdentifier	 num Docs
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
numDocs	TokenNameIdentifier	 num Docs
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" of "	TokenNameStringLiteral	 of 
+	TokenNamePLUS	
numDocs	TokenNameIdentifier	 num Docs
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
t0	TokenNameIdentifier	 t0
)	TokenNameRPAREN	
+	TokenNamePLUS	
" msec"	TokenNameStringLiteral	 msec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
savedTerms	TokenNameIdentifier	 saved Terms
=	TokenNameEQUAL	
ts	TokenNameIdentifier	 ts
.	TokenNameDOT	
savedTerms	TokenNameIdentifier	 saved Terms
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: full merge"	TokenNameStringLiteral	TEST: full merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: close writer"	TokenNameStringLiteral	TEST: close writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: open reader"	TokenNameStringLiteral	TEST: open reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
savedTerms	TokenNameIdentifier	 saved Terms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
savedTerms	TokenNameIdentifier	 saved Terms
=	TokenNameEQUAL	
findTerms	TokenNameIdentifier	 find Terms
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
numSavedTerms	TokenNameIdentifier	 num Saved Terms
=	TokenNameEQUAL	
savedTerms	TokenNameIdentifier	 saved Terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
bigOrdTerms	TokenNameIdentifier	 big Ord Terms
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
savedTerms	TokenNameIdentifier	 saved Terms
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
numSavedTerms	TokenNameIdentifier	 num Saved Terms
-	TokenNameMINUS	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numSavedTerms	TokenNameIdentifier	 num Saved Terms
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: test big ord terms..."	TokenNameStringLiteral	TEST: test big ord terms...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSavedTerms	TokenNameIdentifier	 test Saved Terms
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
bigOrdTerms	TokenNameIdentifier	 big Ord Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: test all saved terms..."	TokenNameStringLiteral	TEST: test all saved terms...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
testSavedTerms	TokenNameIdentifier	 test Saved Terms
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
savedTerms	TokenNameIdentifier	 saved Terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: now CheckIndex..."	TokenNameStringLiteral	TEST: now CheckIndex...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CheckIndex	TokenNameIdentifier	 Check Index
.	TokenNameDOT	
Status	TokenNameIdentifier	 Status
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
checkIndex	TokenNameIdentifier	 check Index
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
tc	TokenNameIdentifier	 tc
=	TokenNameEQUAL	
status	TokenNameIdentifier	 status
.	TokenNameDOT	
segmentInfos	TokenNameIdentifier	 segment Infos
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
termIndexStatus	TokenNameIdentifier	 term Index Status
.	TokenNameDOT	
termCount	TokenNameIdentifier	 term Count
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"count "	TokenNameStringLiteral	count 
+	TokenNamePLUS	
tc	TokenNameIdentifier	 tc
+	TokenNamePLUS	
" is not > "	TokenNameStringLiteral	 is not > 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
tc	TokenNameIdentifier	 tc
>	TokenNameGREATER	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
findTerms	TokenNameIdentifier	 find Terms
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: findTerms"	TokenNameStringLiteral	TEST: findTerms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
savedTerms	TokenNameIdentifier	 saved Terms
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
nextSave	TokenNameIdentifier	 next Save
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
500000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
nextSave	TokenNameIdentifier	 next Save
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
savedTerms	TokenNameIdentifier	 saved Terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: add "	TokenNameStringLiteral	TEST: add 
+	TokenNamePLUS	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextSave	TokenNameIdentifier	 next Save
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
500000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1000000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
savedTerms	TokenNameIdentifier	 saved Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes	TokenNameIdentifier	 bytes
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
bytes	TokenNameIdentifier	 bytes
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
UnsupportedEncodingException	TokenNameIdentifier	 Unsupported Encoding Exception
uee	TokenNameIdentifier	 uee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
uee	TokenNameIdentifier	 uee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
:	TokenNameCOLON	
bytes	TokenNameIdentifier	 bytes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
testSavedTerms	TokenNameIdentifier	 test Saved Terms
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: run "	TokenNameStringLiteral	TEST: run 
+	TokenNamePLUS	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" terms on reader="	TokenNameStringLiteral	 terms on reader=
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexSearcher	TokenNameIdentifier	 Index Searcher
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
IndexSearcher	TokenNameIdentifier	 Index Searcher
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
shuffle	TokenNameIdentifier	 shuffle
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: search "	TokenNameStringLiteral	TEST: search 
+	TokenNamePLUS	
term	TokenNameIdentifier	 term
+	TokenNamePLUS	
" ["	TokenNameStringLiteral	 [
+	TokenNamePLUS	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" FAILED: count="	TokenNameStringLiteral	 FAILED: count=
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
long	TokenNamelong	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
currentTimeMillis	TokenNameIdentifier	 current Time Millis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" took "	TokenNameStringLiteral	 took 
+	TokenNamePLUS	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
-	TokenNameMINUS	
t0	TokenNameIdentifier	 t0
)	TokenNameRPAREN	
+	TokenNamePLUS	
" millis"	TokenNameStringLiteral	 millis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TermEnum	TokenNameIdentifier	 Term Enum
termEnum	TokenNameIdentifier	 term Enum
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
termEnum	TokenNameIdentifier	 term Enum
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" FAILED: wrong term: got "	TokenNameStringLiteral	 FAILED: wrong term: got 
+	TokenNamePLUS	
text	TokenNameIdentifier	 text
+	TokenNamePLUS	
" ["	TokenNameStringLiteral	 [
+	TokenNamePLUS	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
failed	TokenNameIdentifier	 failed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
failed	TokenNameIdentifier	 failed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
