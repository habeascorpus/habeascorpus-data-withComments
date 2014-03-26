package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
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
OutputStream	TokenNameIdentifier	 Output Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Matcher	TokenNameIdentifier	 Matcher
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
regex	TokenNameIdentifier	 regex
.	TokenNameDOT	
Pattern	TokenNameIdentifier	 Pattern
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
PerfRunData	TokenNameIdentifier	 Perf Run Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
.	TokenNameDOT	
DocMaker	TokenNameIdentifier	 Doc Maker
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Config	TokenNameIdentifier	 Config
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
StreamUtils	TokenNameIdentifier	 Stream Utils
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
Fieldable	TokenNameIdentifier	 Fieldable
;	TokenNameSEMICOLON	
/** * A task which writes documents, one line per document. Each line is in the * following format: title &lt;TAB&gt; date &lt;TAB&gt; body. The output of this * task can be consumed by * {@link org.apache.lucene.benchmark.byTask.feeds.LineDocSource} and is intended * to save the IO overhead of opening a file per document to be indexed. * <p> * The format of the output is set according to the output file extension. * Compression is recommended when the output file is expected to be large. * See info on file extensions in * {@link org.apache.lucene.benchmark.byTask.utils.StreamUtils.Type} * <p> * Supports the following parameters: * <ul> * <li><b>line.file.out</b> - the name of the file to write the output to. That * parameter is mandatory. <b>NOTE:</b> the file is re-created. * <li><b>line.fields</b> - which fields should be written in each line. * (optional, default: {@link #DEFAULT_FIELDS}). * <li><b>sufficient.fields</b> - list of field names, separated by comma, which, * if all of them are missing, the document will be skipped. For example, to require * that at least one of f1,f2 is not empty, specify: "f1,f2" in this field. To specify * that no field is required, i.e. that even empty docs should be emitted, specify <b>","</b>. * (optional, default: {@link #DEFAULT_SUFFICIENT_FIELDS}). * </ul> * <b>NOTE:</b> this class is not thread-safe and if used by multiple threads the * output is unspecified (as all will write to the same output file in a * non-synchronized way). */	TokenNameCOMMENT_JAVADOC	 A task which writes documents, one line per document. Each line is in the following format: title &lt;TAB&gt; date &lt;TAB&gt; body. The output of this task can be consumed by {@link org.apache.lucene.benchmark.byTask.feeds.LineDocSource} and is intended to save the IO overhead of opening a file per document to be indexed. <p> The format of the output is set according to the output file extension. Compression is recommended when the output file is expected to be large. See info on file extensions in {@link org.apache.lucene.benchmark.byTask.utils.StreamUtils.Type} <p> Supports the following parameters: <ul> <li><b>line.file.out</b> - the name of the file to write the output to. That parameter is mandatory. <b>NOTE:</b> the file is re-created. <li><b>line.fields</b> - which fields should be written in each line. (optional, default: {@link #DEFAULT_FIELDS}). <li><b>sufficient.fields</b> - list of field names, separated by comma, which, if all of them are missing, the document will be skipped. For example, to require that at least one of f1,f2 is not empty, specify: "f1,f2" in this field. To specify that no field is required, i.e. that even empty docs should be emitted, specify <b>","</b>. (optional, default: {@link #DEFAULT_SUFFICIENT_FIELDS}). </ul> <b>NOTE:</b> this class is not thread-safe and if used by multiple threads the output is unspecified (as all will write to the same output file in a non-synchronized way). 
public	TokenNamepublic	
class	TokenNameclass	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FIELDS_HEADER_INDICATOR	TokenNameIdentifier	 FIELDS  HEADER  INDICATOR
=	TokenNameEQUAL	
"FIELDS_HEADER_INDICATOR###"	TokenNameStringLiteral	FIELDS_HEADER_INDICATOR###
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
char	TokenNamechar	
SEP	TokenNameIdentifier	 SEP
=	TokenNameEQUAL	
'\t'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
/** * Fields to be written by default */	TokenNameCOMMENT_JAVADOC	 Fields to be written by default 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DEFAULT_FIELDS	TokenNameIdentifier	 DEFAULT  FIELDS
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
TITLE_FIELD	TokenNameIdentifier	 TITLE  FIELD
,	TokenNameCOMMA	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
DATE_FIELD	TokenNameIdentifier	 DATE  FIELD
,	TokenNameCOMMA	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Default fields which at least one of them is required to not skip the doc. */	TokenNameCOMMENT_JAVADOC	 Default fields which at least one of them is required to not skip the doc. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_SUFFICIENT_FIELDS	TokenNameIdentifier	 DEFAULT  SUFFICIENT  FIELDS
=	TokenNameEQUAL	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
TITLE_FIELD	TokenNameIdentifier	 TITLE  FIELD
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docSize	TokenNameIdentifier	 doc Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PrintWriter	TokenNameIdentifier	 Print Writer
lineFileOut	TokenNameIdentifier	 line File Out
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DocMaker	TokenNameIdentifier	 Doc Maker
docMaker	TokenNameIdentifier	 doc Maker
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
StringBuilder	TokenNameIdentifier	 String Builder
>	TokenNameGREATER	
threadBuffer	TokenNameIdentifier	 thread Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
StringBuilder	TokenNameIdentifier	 String Builder
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
Matcher	TokenNameIdentifier	 Matcher
>	TokenNameGREATER	
threadNormalizer	TokenNameIdentifier	 thread Normalizer
=	TokenNameEQUAL	
new	TokenNamenew	
ThreadLocal	TokenNameIdentifier	 Thread Local
<	TokenNameLESS	
Matcher	TokenNameIdentifier	 Matcher
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fieldsToWrite	TokenNameIdentifier	 fields To Write
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sufficientFields	TokenNameIdentifier	 sufficient Fields
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
checkSufficientFields	TokenNameIdentifier	 check Sufficient Fields
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fname	TokenNameIdentifier	 fname
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"line.file.out"	TokenNameStringLiteral	line.file.out
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fname	TokenNameIdentifier	 fname
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"line.file.out must be set"	TokenNameStringLiteral	line.file.out must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
OutputStream	TokenNameIdentifier	 Output Stream
out	TokenNameIdentifier	 out
=	TokenNameEQUAL	
StreamUtils	TokenNameIdentifier	 Stream Utils
.	TokenNameDOT	
outputStream	TokenNameIdentifier	 output Stream
(	TokenNameLPAREN	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fname	TokenNameIdentifier	 fname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lineFileOut	TokenNameIdentifier	 line File Out
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
new	TokenNamenew	
BufferedWriter	TokenNameIdentifier	 Buffered Writer
(	TokenNameLPAREN	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
,	TokenNameCOMMA	
StreamUtils	TokenNameIdentifier	 Stream Utils
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docMaker	TokenNameIdentifier	 doc Maker
=	TokenNameEQUAL	
runData	TokenNameIdentifier	 run Data
.	TokenNameDOT	
getDocMaker	TokenNameIdentifier	 get Doc Maker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// init fields 	TokenNameCOMMENT_LINE	init fields 
String	TokenNameIdentifier	 String
f2r	TokenNameIdentifier	 f2r
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"line.fields"	TokenNameStringLiteral	line.fields
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
f2r	TokenNameIdentifier	 f2r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldsToWrite	TokenNameIdentifier	 fields To Write
=	TokenNameEQUAL	
DEFAULT_FIELDS	TokenNameIdentifier	 DEFAULT  FIELDS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
f2r	TokenNameIdentifier	 f2r
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
SEP	TokenNameIdentifier	 SEP
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"line.fields "	TokenNameStringLiteral	line.fields 
+	TokenNamePLUS	
f2r	TokenNameIdentifier	 f2r
+	TokenNamePLUS	
" should not contain the separator char: "	TokenNameStringLiteral	 should not contain the separator char: 
+	TokenNamePLUS	
SEP	TokenNameIdentifier	 SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fieldsToWrite	TokenNameIdentifier	 fields To Write
=	TokenNameEQUAL	
f2r	TokenNameIdentifier	 f2r
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// init sufficient fields 	TokenNameCOMMENT_LINE	init sufficient fields 
sufficientFields	TokenNameIdentifier	 sufficient Fields
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
fieldsToWrite	TokenNameIdentifier	 fields To Write
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
suff	TokenNameIdentifier	 suff
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"sufficient.fields"	TokenNameStringLiteral	sufficient.fields
,	TokenNameCOMMA	
DEFAULT_SUFFICIENT_FIELDS	TokenNameIdentifier	 DEFAULT  SUFFICIENT  FIELDS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
suff	TokenNameIdentifier	 suff
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
checkSufficientFields	TokenNameIdentifier	 check Sufficient Fields
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
checkSufficientFields	TokenNameIdentifier	 check Sufficient Fields
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
sf	TokenNameIdentifier	 sf
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
suff	TokenNameIdentifier	 suff
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
fieldsToWrite	TokenNameIdentifier	 fields To Write
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sf	TokenNameIdentifier	 sf
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
fieldsToWrite	TokenNameIdentifier	 fields To Write
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sufficientFields	TokenNameIdentifier	 sufficient Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write a header to the lines file - indicating how to read the file later */	TokenNameCOMMENT_JAVADOC	 Write a header to the lines file - indicating how to read the file later 
private	TokenNameprivate	
void	TokenNamevoid	
writeHeader	TokenNameIdentifier	 write Header
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
threadBuffer	TokenNameIdentifier	 thread Buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadBuffer	TokenNameIdentifier	 thread Buffer
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
FIELDS_HEADER_INDICATOR	TokenNameIdentifier	 FIELDS  HEADER  INDICATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
:	TokenNameCOLON	
fieldsToWrite	TokenNameIdentifier	 fields To Write
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SEP	TokenNameIdentifier	 SEP
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lineFileOut	TokenNameIdentifier	 line File Out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getLogMessage	TokenNameIdentifier	 get Log Message
(	TokenNameLPAREN	
int	TokenNameint	
recsCount	TokenNameIdentifier	 recs Count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Wrote "	TokenNameStringLiteral	Wrote 
+	TokenNamePLUS	
recsCount	TokenNameIdentifier	 recs Count
+	TokenNamePLUS	
" line docs"	TokenNameStringLiteral	 line docs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docSize	TokenNameIdentifier	 doc Size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
docMaker	TokenNameIdentifier	 doc Maker
.	TokenNameDOT	
makeDocument	TokenNameIdentifier	 make Document
(	TokenNameLPAREN	
docSize	TokenNameIdentifier	 doc Size
)	TokenNameRPAREN	
:	TokenNameCOLON	
docMaker	TokenNameIdentifier	 doc Maker
.	TokenNameDOT	
makeDocument	TokenNameIdentifier	 make Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Matcher	TokenNameIdentifier	 Matcher
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
threadNormalizer	TokenNameIdentifier	 thread Normalizer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matcher	TokenNameIdentifier	 matcher
=	TokenNameEQUAL	
Pattern	TokenNameIdentifier	 Pattern
.	TokenNameDOT	
compile	TokenNameIdentifier	 compile
(	TokenNameLPAREN	
"[ ]+"	TokenNameStringLiteral	[ ]+
)	TokenNameRPAREN	
.	TokenNameDOT	
matcher	TokenNameIdentifier	 matcher
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadNormalizer	TokenNameIdentifier	 thread Normalizer
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
matcher	TokenNameIdentifier	 matcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
threadBuffer	TokenNameIdentifier	 thread Buffer
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
threadBuffer	TokenNameIdentifier	 thread Buffer
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
sufficient	TokenNameIdentifier	 sufficient
=	TokenNameEQUAL	
!	TokenNameNOT	
checkSufficientFields	TokenNameIdentifier	 check Sufficient Fields
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
fieldsToWrite	TokenNameIdentifier	 fields To Write
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Fieldable	TokenNameIdentifier	 Fieldable
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getFieldable	TokenNameIdentifier	 get Fieldable
(	TokenNameLPAREN	
fieldsToWrite	TokenNameIdentifier	 fields To Write
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
matcher	TokenNameIdentifier	 matcher
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
SEP	TokenNameIdentifier	 SEP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sufficient	TokenNameIdentifier	 sufficient
|=	TokenNameOR_EQUAL	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
sufficientFields	TokenNameIdentifier	 sufficient Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sufficient	TokenNameIdentifier	 sufficient
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove redundant last separator 	TokenNameCOMMENT_LINE	remove redundant last separator 
// lineFileOut is a PrintWriter, which synchronizes internally in println. 	TokenNameCOMMENT_LINE	lineFileOut is a PrintWriter, which synchronizes internally in println. 
lineFileOut	TokenNameIdentifier	 line File Out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
lineFileOut	TokenNameIdentifier	 line File Out
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the params (docSize only) * @param params docSize, or 0 for no limit. */	TokenNameCOMMENT_JAVADOC	 Set the params (docSize only) @param params docSize, or 0 for no limit. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docSize	TokenNameIdentifier	 doc Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsParams	TokenNameIdentifier	 supports Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
