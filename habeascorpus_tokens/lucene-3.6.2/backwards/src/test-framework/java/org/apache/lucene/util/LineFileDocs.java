package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Closeable	TokenNameIdentifier	 Closeable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
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
BufferedReader	TokenNameIdentifier	 Buffered Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
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
/** Minimal port of contrib/benchmark's LneDocSource + * DocMaker, so tests can enum docs from a line file created * by contrib/benchmark's WriteLineDoc task */	TokenNameCOMMENT_JAVADOC	 Minimal port of contrib/benchmark's LneDocSource + DocMaker, so tests can enum docs from a line file created by contrib/benchmark's WriteLineDoc task 
public	TokenNamepublic	
class	TokenNameclass	
LineFileDocs	TokenNameIdentifier	 Line File Docs
implements	TokenNameimplements	
Closeable	TokenNameIdentifier	 Closeable
{	TokenNameLBRACE	
private	TokenNameprivate	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 64K 	TokenNameCOMMENT_LINE	64K 
private	TokenNameprivate	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
/** If forever is true, we rewind the file at EOF (repeat * the docs over and over) */	TokenNameCOMMENT_JAVADOC	 If forever is true, we rewind the file at EOF (repeat the docs over and over) 
public	TokenNamepublic	
LineFileDocs	TokenNameIdentifier	 Line File Docs
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
LineFileDocs	TokenNameIdentifier	 Line File Docs
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
TEST_LINE_DOCS_FILE	TokenNameIdentifier	 TEST  LINE  DOCS  FILE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getResourceAsStream	TokenNameIdentifier	 get Resource As Stream
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if its not in classpath, we load it as absolute filesystem path (e.g. Hudson's home dir) 	TokenNameCOMMENT_LINE	if its not in classpath, we load it as absolute filesystem path (e.g. Hudson's home dir) 
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
file	TokenNameIdentifier	 file
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
available	TokenNameIdentifier	 available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
".gz"	TokenNameStringLiteral	.gz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// guestimate: 	TokenNameCOMMENT_LINE	guestimate: 
size	TokenNameIdentifier	 size
*=	TokenNameMULTIPLY_EQUAL	
2.8	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
,	TokenNameCOMMA	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Override sizes for currently "known" line files: 	TokenNameCOMMENT_LINE	Override sizes for currently "known" line files: 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"europarl.lines.txt.gz"	TokenNameStringLiteral	europarl.lines.txt.gz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
15129506L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"/home/hudson/lucene-data/enwiki.random.lines.txt.gz"	TokenNameStringLiteral	/home/hudson/lucene-data/enwiki.random.lines.txt.gz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
3038178822L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Randomly seek to starting point: 	TokenNameCOMMENT_LINE	Randomly seek to starting point: 
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
long	TokenNamelong	
seekTo	TokenNameIdentifier	 seek To
=	TokenNameEQUAL	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextLong	TokenNameIdentifier	 next Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: LineFileDocs: seek to fp="	TokenNameStringLiteral	TEST: LineFileDocs: seek to fp=
+	TokenNamePLUS	
seekTo	TokenNameIdentifier	 seek To
+	TokenNamePLUS	
" on open"	TokenNameStringLiteral	 on open
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
skip	TokenNameIdentifier	 skip
(	TokenNameLPAREN	
seekTo	TokenNameIdentifier	 seek To
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
SEP	TokenNameIdentifier	 SEP
=	TokenNameEQUAL	
'\t'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DocState	TokenNameIdentifier	 Doc State
{	TokenNameLBRACE	
final	TokenNamefinal	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
titleTokenized	TokenNameIdentifier	 title Tokenized
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
title	TokenNameIdentifier	 title
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
body	TokenNameIdentifier	 body
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
id	TokenNameIdentifier	 id
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Field	TokenNameIdentifier	 Field
date	TokenNameIdentifier	 date
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocState	TokenNameIdentifier	 Doc State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"title"	TokenNameStringLiteral	title
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
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
NOT_ANALYZED_NO_NORMS	TokenNameIdentifier	 NOT  ANALYZED  NO  NORMS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
titleTokenized	TokenNameIdentifier	 title Tokenized
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"titleTokenized"	TokenNameStringLiteral	titleTokenized
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
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
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_POSITIONS_OFFSETS	TokenNameIdentifier	 WITH  POSITIONS  OFFSETS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
titleTokenized	TokenNameIdentifier	 title Tokenized
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
body	TokenNameIdentifier	 body
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"body"	TokenNameStringLiteral	body
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
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
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
TermVector	TokenNameIdentifier	 Term Vector
.	TokenNameDOT	
WITH_POSITIONS_OFFSETS	TokenNameIdentifier	 WITH  POSITIONS  OFFSETS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
body	TokenNameIdentifier	 body
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"docid"	TokenNameStringLiteral	docid
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
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
NOT_ANALYZED_NO_NORMS	TokenNameIdentifier	 NOT  ANALYZED  NO  NORMS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
"date"	TokenNameStringLiteral	date
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
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
NOT_ANALYZED_NO_NORMS	TokenNameIdentifier	 NOT  ANALYZED  NO  NORMS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
DocState	TokenNameIdentifier	 Doc State
>	TokenNameGREATER	
threadDocs	TokenNameIdentifier	 thread Docs
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
DocState	TokenNameIdentifier	 Doc State
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Note: Document instance is re-used per-thread */	TokenNameCOMMENT_JAVADOC	 Note: Document instance is re-used per-thread 
public	TokenNamepublic	
Document	TokenNameIdentifier	 Document
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Always rewind at end: 	TokenNameCOMMENT_LINE	Always rewind at end: 
if	TokenNameif	
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: LineFileDocs: now rewind file..."	TokenNameStringLiteral	TEST: LineFileDocs: now rewind file...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
threadDocs	TokenNameIdentifier	 thread Docs
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
new	TokenNamenew	
DocState	TokenNameIdentifier	 Doc State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadDocs	TokenNameIdentifier	 thread Docs
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
spot	TokenNameIdentifier	 spot
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
SEP	TokenNameIdentifier	 SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spot	TokenNameIdentifier	 spot
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"line: ["	TokenNameStringLiteral	line: [
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"] is in an invalid format !"	TokenNameStringLiteral	] is in an invalid format !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
spot2	TokenNameIdentifier	 spot2
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
SEP	TokenNameIdentifier	 SEP
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
spot	TokenNameIdentifier	 spot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
spot2	TokenNameIdentifier	 spot2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"line: ["	TokenNameStringLiteral	line: [
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"] is in an invalid format !"	TokenNameStringLiteral	] is in an invalid format !
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
body	TokenNameIdentifier	 body
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
spot2	TokenNameIdentifier	 spot2
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
spot	TokenNameIdentifier	 spot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
title	TokenNameIdentifier	 title
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
titleTokenized	TokenNameIdentifier	 title Tokenized
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
date	TokenNameIdentifier	 date
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
spot	TokenNameIdentifier	 spot
,	TokenNameCOMMA	
spot2	TokenNameIdentifier	 spot2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
.	TokenNameDOT	
getAndIncrement	TokenNameIdentifier	 get And Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
