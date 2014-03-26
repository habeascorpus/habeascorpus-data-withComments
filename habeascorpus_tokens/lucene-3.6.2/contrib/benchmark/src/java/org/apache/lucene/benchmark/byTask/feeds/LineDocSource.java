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
feeds	TokenNameIdentifier	 feeds
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
File	TokenNameIdentifier	 File
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
InputStream	TokenNameIdentifier	 Input Stream
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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
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
Properties	TokenNameIdentifier	 Properties
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
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
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
/** * A {@link ContentSource} reading one line at a time as a * {@link org.apache.lucene.document.Document} from a single file. This saves IO * cost (over DirContentSource) of recursing through a directory and opening a * new file for every document.<br> * The expected format of each line is (arguments are separated by &lt;TAB&gt;): * <i>title, date, body</i>. If a line is read in a different format, a * {@link RuntimeException} will be thrown. In general, you should use this * content source for files that were created with {@link WriteLineDocTask}.<br> * <br> * Config properties: * <ul> * <li>docs.file=&lt;path to the file&gt; * <li>content.source.encoding - default to UTF-8. * <li>line.parser - default to {@link HeaderLineParser} if a header line exists which differs * from {@link WriteLineDocTask#DEFAULT_FIELDS} and to {@link SimpleLineParser} otherwise. * </ul> */	TokenNameCOMMENT_JAVADOC	 A {@link ContentSource} reading one line at a time as a {@link org.apache.lucene.document.Document} from a single file. This saves IO cost (over DirContentSource) of recursing through a directory and opening a new file for every document.<br> The expected format of each line is (arguments are separated by &lt;TAB&gt;): <i>title, date, body</i>. If a line is read in a different format, a {@link RuntimeException} will be thrown. In general, you should use this content source for files that were created with {@link WriteLineDocTask}.<br> <br> Config properties: <ul> <li>docs.file=&lt;path to the file&gt; <li>content.source.encoding - default to UTF-8. <li>line.parser - default to {@link HeaderLineParser} if a header line exists which differs from {@link WriteLineDocTask#DEFAULT_FIELDS} and to {@link SimpleLineParser} otherwise. </ul> 
public	TokenNamepublic	
class	TokenNameclass	
LineDocSource	TokenNameIdentifier	 Line Doc Source
extends	TokenNameextends	
ContentSource	TokenNameIdentifier	 Content Source
{	TokenNameLBRACE	
/** Reader of a single input line into {@link DocData}. */	TokenNameCOMMENT_JAVADOC	 Reader of a single input line into {@link DocData}. 
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
LineParser	TokenNameIdentifier	 Line Parser
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
header	TokenNameIdentifier	 header
;	TokenNameSEMICOLON	
/** Construct with the header * @param header header line found in the input file, or null if none */	TokenNameCOMMENT_JAVADOC	 Construct with the header @param header header line found in the input file, or null if none 
public	TokenNamepublic	
LineParser	TokenNameIdentifier	 Line Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
header	TokenNameIdentifier	 header
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** parse an input line and fill doc data appropriately */	TokenNameCOMMENT_JAVADOC	 parse an input line and fill doc data appropriately 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
parseLine	TokenNameIdentifier	 parse Line
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@link LineParser} which ignores the header passed to its constructor * and assumes simply that field names and their order are the same * as in {@link WriteLineDocTask#DEFAULT_FIELDS} */	TokenNameCOMMENT_JAVADOC	 {@link LineParser} which ignores the header passed to its constructor and assumes simply that field names and their order are the same as in {@link WriteLineDocTask#DEFAULT_FIELDS} 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SimpleLineParser	TokenNameIdentifier	 Simple Line Parser
extends	TokenNameextends	
LineParser	TokenNameIdentifier	 Line Parser
{	TokenNameLBRACE	
public	TokenNamepublic	
SimpleLineParser	TokenNameIdentifier	 Simple Line Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
parseLine	TokenNameIdentifier	 parse Line
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
SEP	TokenNameIdentifier	 SEP
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
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
"] is in an invalid format (missing: separator title::date)!"	TokenNameStringLiteral	] is in an invalid format (missing: separator title::date)!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
SEP	TokenNameIdentifier	 SEP
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
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
"] is in an invalid format (missing: separator date::body)!"	TokenNameStringLiteral	] is in an invalid format (missing: separator date::body)!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setDate	TokenNameIdentifier	 set Date
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
SEP	TokenNameIdentifier	 SEP
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
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
"] is in an invalid format (too many separators)!"	TokenNameStringLiteral	] is in an invalid format (too many separators)!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// last one 	TokenNameCOMMENT_LINE	last one 
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setBody	TokenNameIdentifier	 set Body
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * {@link LineParser} which sets field names and order by * the header - any header - of the lines file. * It is less efficient than {@link SimpleLineParser} but more powerful. */	TokenNameCOMMENT_JAVADOC	 {@link LineParser} which sets field names and order by the header - any header - of the lines file. It is less efficient than {@link SimpleLineParser} but more powerful. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
HeaderLineParser	TokenNameIdentifier	 Header Line Parser
extends	TokenNameextends	
LineParser	TokenNameIdentifier	 Line Parser
{	TokenNameLBRACE	
private	TokenNameprivate	
enum	TokenNameenum	
FieldName	TokenNameIdentifier	 Field Name
{	TokenNameLBRACE	
NAME	TokenNameIdentifier	 NAME
,	TokenNameCOMMA	
TITLE	TokenNameIdentifier	 TITLE
,	TokenNameCOMMA	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
BODY	TokenNameIdentifier	 BODY
,	TokenNameCOMMA	
PROP	TokenNameIdentifier	 PROP
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FieldName	TokenNameIdentifier	 Field Name
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
posToF	TokenNameIdentifier	 pos To F
;	TokenNameSEMICOLON	
public	TokenNamepublic	
HeaderLineParser	TokenNameIdentifier	 Header Line Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posToF	TokenNameIdentifier	 pos To F
=	TokenNameEQUAL	
new	TokenNamenew	
FieldName	TokenNameIdentifier	 Field Name
[	TokenNameLBRACKET	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
header	TokenNameIdentifier	 header
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
NAME_FIELD	TokenNameIdentifier	 NAME  FIELD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posToF	TokenNameIdentifier	 pos To F
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
FieldName	TokenNameIdentifier	 Field Name
.	TokenNameDOT	
NAME	TokenNameIdentifier	 NAME
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
TITLE_FIELD	TokenNameIdentifier	 TITLE  FIELD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posToF	TokenNameIdentifier	 pos To F
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
FieldName	TokenNameIdentifier	 Field Name
.	TokenNameDOT	
TITLE	TokenNameIdentifier	 TITLE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
DATE_FIELD	TokenNameIdentifier	 DATE  FIELD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posToF	TokenNameIdentifier	 pos To F
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
FieldName	TokenNameIdentifier	 Field Name
.	TokenNameDOT	
DATE	TokenNameIdentifier	 DATE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
posToF	TokenNameIdentifier	 pos To F
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
FieldName	TokenNameIdentifier	 Field Name
.	TokenNameDOT	
BODY	TokenNameIdentifier	 BODY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
posToF	TokenNameIdentifier	 pos To F
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
FieldName	TokenNameIdentifier	 Field Name
.	TokenNameDOT	
PROP	TokenNameIdentifier	 PROP
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
parseLine	TokenNameIdentifier	 parse Line
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
k2	TokenNameIdentifier	 k2
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
SEP	TokenNameIdentifier	 SEP
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>=	TokenNameGREATER_EQUAL	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"input line has invalid format: "	TokenNameStringLiteral	input line has invalid format: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" fields instead of "	TokenNameStringLiteral	 fields instead of 
+	TokenNamePLUS	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" :: ["	TokenNameStringLiteral	 :: [
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setDocDataField	TokenNameIdentifier	 set Doc Data Field
(	TokenNameLPAREN	
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k2	TokenNameIdentifier	 k2
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
!=	TokenNameNOT_EQUAL	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"input line has invalid format: "	TokenNameStringLiteral	input line has invalid format: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" fields instead of "	TokenNameStringLiteral	 fields instead of 
+	TokenNamePLUS	
header	TokenNameIdentifier	 header
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" :: ["	TokenNameStringLiteral	 :: [
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// last one 	TokenNameCOMMENT_LINE	last one 
setDocDataField	TokenNameIdentifier	 set Doc Data Field
(	TokenNameLPAREN	
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setDocDataField	TokenNameIdentifier	 set Doc Data Field
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
posToF	TokenNameIdentifier	 pos To F
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
NAME	TokenNameIdentifier	 NAME
:	TokenNameCOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
TITLE	TokenNameIdentifier	 TITLE
:	TokenNameCOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
DATE	TokenNameIdentifier	 DATE
:	TokenNameCOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setDate	TokenNameIdentifier	 set Date
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
BODY	TokenNameIdentifier	 BODY
:	TokenNameCOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setBody	TokenNameIdentifier	 set Body
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PROP	TokenNameIdentifier	 PROP
:	TokenNameCOLON	
Properties	TokenNameIdentifier	 Properties
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
getProps	TokenNameIdentifier	 get Props
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setProps	TokenNameIdentifier	 set Props
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
[	TokenNameLBRACKET	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
File	TokenNameIdentifier	 File
file	TokenNameIdentifier	 file
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
readCount	TokenNameIdentifier	 read Count
;	TokenNameSEMICOLON	
private	TokenNameprivate	
LineParser	TokenNameIdentifier	 Line Parser
docDataLineReader	TokenNameIdentifier	 doc Data Line Reader
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
skipHeaderLine	TokenNameIdentifier	 skip Header Line
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
openFile	TokenNameIdentifier	 open File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
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
}	TokenNameRBRACE	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
StreamUtils	TokenNameIdentifier	 Stream Utils
.	TokenNameDOT	
inputStream	TokenNameIdentifier	 input Stream
(	TokenNameLPAREN	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
,	TokenNameCOMMA	
StreamUtils	TokenNameIdentifier	 Stream Utils
.	TokenNameDOT	
BUFFER_SIZE	TokenNameIdentifier	 BUFFER  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipHeaderLine	TokenNameIdentifier	 skip Header Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip one line - the header line - already handled that info 	TokenNameCOMMENT_LINE	skip one line - the header line - already handled that info 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocData	TokenNameIdentifier	 Doc Data
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
myID	TokenNameIdentifier	 my ID
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
forever	TokenNameIdentifier	 forever
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Reset the file 	TokenNameCOMMENT_LINE	Reset the file 
openFile	TokenNameIdentifier	 open File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
docData	TokenNameIdentifier	 doc Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docDataLineReader	TokenNameIdentifier	 doc Data Line Reader
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first line ever, one time initialization, 	TokenNameCOMMENT_LINE	first line ever, one time initialization, 
docDataLineReader	TokenNameIdentifier	 doc Data Line Reader
=	TokenNameEQUAL	
createDocDataLineReader	TokenNameIdentifier	 create Doc Data Line Reader
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
skipHeaderLine	TokenNameIdentifier	 skip Header Line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
docData	TokenNameIdentifier	 doc Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// increment IDS only once... 	TokenNameCOMMENT_LINE	increment IDS only once... 
myID	TokenNameIdentifier	 my ID
=	TokenNameEQUAL	
readCount	TokenNameIdentifier	 read Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// The date String was written in the format of DateTools.dateToString. 	TokenNameCOMMENT_LINE	The date String was written in the format of DateTools.dateToString. 
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setID	TokenNameIdentifier	 set ID
(	TokenNameLPAREN	
myID	TokenNameIdentifier	 my ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docDataLineReader	TokenNameIdentifier	 doc Data Line Reader
.	TokenNameDOT	
parseLine	TokenNameIdentifier	 parse Line
(	TokenNameLPAREN	
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docData	TokenNameIdentifier	 doc Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
LineParser	TokenNameIdentifier	 Line Parser
createDocDataLineReader	TokenNameIdentifier	 create Doc Data Line Reader
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
header	TokenNameIdentifier	 header
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
headIndicator	TokenNameIdentifier	 head Indicator
=	TokenNameEQUAL	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
FIELDS_HEADER_INDICATOR	TokenNameIdentifier	 FIELDS  HEADER  INDICATOR
+	TokenNamePLUS	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
SEP	TokenNameIdentifier	 SEP
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
headIndicator	TokenNameIdentifier	 head Indicator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
headIndicator	TokenNameIdentifier	 head Indicator
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
SEP	TokenNameIdentifier	 SEP
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipHeaderLine	TokenNameIdentifier	 skip Header Line
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// mark to skip the header line when input file is reopened 	TokenNameCOMMENT_LINE	mark to skip the header line when input file is reopened 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
header	TokenNameIdentifier	 header
=	TokenNameEQUAL	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
DEFAULT_FIELDS	TokenNameIdentifier	 DEFAULT  FIELDS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if a specific DocDataLineReader was configured, must respect it 	TokenNameCOMMENT_LINE	if a specific DocDataLineReader was configured, must respect it 
String	TokenNameIdentifier	 String
docDataLineReaderClassName	TokenNameIdentifier	 doc Data Line Reader Class Name
=	TokenNameEQUAL	
getConfig	TokenNameIdentifier	 get Config
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"line.parser"	TokenNameStringLiteral	line.parser
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docDataLineReaderClassName	TokenNameIdentifier	 doc Data Line Reader Class Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
LineParser	TokenNameIdentifier	 Line Parser
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
docDataLineReaderClassName	TokenNameIdentifier	 doc Data Line Reader Class Name
)	TokenNameRPAREN	
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
LineParser	TokenNameIdentifier	 Line Parser
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Constructor	TokenNameIdentifier	 Constructor
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
LineParser	TokenNameIdentifier	 Line Parser
>	TokenNameGREATER	
cnstr	TokenNameIdentifier	 cnstr
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cnstr	TokenNameIdentifier	 cnstr
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
)	TokenNameRPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Failed to instantiate "	TokenNameStringLiteral	Failed to instantiate 
+	TokenNamePLUS	
docDataLineReaderClassName	TokenNameIdentifier	 doc Data Line Reader Class Name
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// if this the simple case, 	TokenNameCOMMENT_LINE	if this the simple case, 
if	TokenNameif	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
deepEquals	TokenNameIdentifier	 deep Equals
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
,	TokenNameCOMMA	
WriteLineDocTask	TokenNameIdentifier	 Write Line Doc Task
.	TokenNameDOT	
DEFAULT_FIELDS	TokenNameIdentifier	 DEFAULT  FIELDS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SimpleLineParser	TokenNameIdentifier	 Simple Line Parser
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
HeaderLineParser	TokenNameIdentifier	 Header Line Parser
(	TokenNameLPAREN	
header	TokenNameIdentifier	 header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
openFile	TokenNameIdentifier	 open File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"docs.file"	TokenNameStringLiteral	docs.file
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"docs.file must be set"	TokenNameStringLiteral	docs.file must be set
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
new	TokenNamenew	
File	TokenNameIdentifier	 File
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
)	TokenNameRPAREN	
.	TokenNameDOT	
getAbsoluteFile	TokenNameIdentifier	 get Absolute File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
"UTF-8"	TokenNameStringLiteral	UTF-8
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
