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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
/** * Parser for trec doc content, invoked on doc text excluding <DOC> and <DOCNO> * which are handled in TrecContentSource. Required to be stateless and hence thread safe. */	TokenNameCOMMENT_JAVADOC	 Parser for trec doc content, invoked on doc text excluding <DOC> and <DOCNO> which are handled in TrecContentSource. Required to be stateless and hence thread safe. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
TrecDocParser	TokenNameIdentifier	 Trec Doc Parser
{	TokenNameLBRACE	
/** Types of trec parse paths, */	TokenNameCOMMENT_JAVADOC	 Types of trec parse paths, 
public	TokenNamepublic	
enum	TokenNameenum	
ParsePathType	TokenNameIdentifier	 Parse Path Type
{	TokenNameLBRACE	
GOV2	TokenNameIdentifier	 GO V2
,	TokenNameCOMMA	
FBIS	TokenNameIdentifier	 FBIS
,	TokenNameCOMMA	
FT	TokenNameIdentifier	 FT
,	TokenNameCOMMA	
FR94	TokenNameIdentifier	 F R94
,	TokenNameCOMMA	
LATIMES	TokenNameIdentifier	 LATIMES
}	TokenNameRBRACE	
/** trec parser type used for unknown extensions */	TokenNameCOMMENT_JAVADOC	 trec parser type used for unknown extensions 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
ParsePathType	TokenNameIdentifier	 Parse Path Type
DEFAULT_PATH_TYPE	TokenNameIdentifier	 DEFAULT  PATH  TYPE
=	TokenNameEQUAL	
ParsePathType	TokenNameIdentifier	 Parse Path Type
.	TokenNameDOT	
GOV2	TokenNameIdentifier	 GO V2
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ParsePathType	TokenNameIdentifier	 Parse Path Type
,	TokenNameCOMMA	
TrecDocParser	TokenNameIdentifier	 Trec Doc Parser
>	TokenNameGREATER	
pathType2parser	TokenNameIdentifier	 path Type2parser
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
ParsePathType	TokenNameIdentifier	 Parse Path Type
,	TokenNameCOMMA	
TrecDocParser	TokenNameIdentifier	 Trec Doc Parser
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
pathType2parser	TokenNameIdentifier	 path Type2parser
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ParsePathType	TokenNameIdentifier	 Parse Path Type
.	TokenNameDOT	
GOV2	TokenNameIdentifier	 GO V2
,	TokenNameCOMMA	
new	TokenNamenew	
TrecGov2Parser	TokenNameIdentifier	 Trec Gov2 Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathType2parser	TokenNameIdentifier	 path Type2parser
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ParsePathType	TokenNameIdentifier	 Parse Path Type
.	TokenNameDOT	
FBIS	TokenNameIdentifier	 FBIS
,	TokenNameCOMMA	
new	TokenNamenew	
TrecFBISParser	TokenNameIdentifier	 Trec FBIS Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathType2parser	TokenNameIdentifier	 path Type2parser
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ParsePathType	TokenNameIdentifier	 Parse Path Type
.	TokenNameDOT	
FR94	TokenNameIdentifier	 F R94
,	TokenNameCOMMA	
new	TokenNamenew	
TrecFR94Parser	TokenNameIdentifier	 Trec F R94 Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathType2parser	TokenNameIdentifier	 path Type2parser
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ParsePathType	TokenNameIdentifier	 Parse Path Type
.	TokenNameDOT	
FT	TokenNameIdentifier	 FT
,	TokenNameCOMMA	
new	TokenNamenew	
TrecFTParser	TokenNameIdentifier	 Trec FT Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pathType2parser	TokenNameIdentifier	 path Type2parser
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ParsePathType	TokenNameIdentifier	 Parse Path Type
.	TokenNameDOT	
LATIMES	TokenNameIdentifier	 LATIMES
,	TokenNameCOMMA	
new	TokenNamenew	
TrecLATimesParser	TokenNameIdentifier	 Trec LA Times Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ParsePathType	TokenNameIdentifier	 Parse Path Type
>	TokenNameGREATER	
pathName2Type	TokenNameIdentifier	 path Name2 Type
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
ParsePathType	TokenNameIdentifier	 Parse Path Type
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
ParsePathType	TokenNameIdentifier	 Parse Path Type
ppt	TokenNameIdentifier	 ppt
:	TokenNameCOLON	
ParsePathType	TokenNameIdentifier	 Parse Path Type
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pathName2Type	TokenNameIdentifier	 path Name2 Type
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ppt	TokenNameIdentifier	 ppt
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ppt	TokenNameIdentifier	 ppt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** max length of walk up from file to its ancestors when looking for a known path type */	TokenNameCOMMENT_JAVADOC	 max length of walk up from file to its ancestors when looking for a known path type 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_PATH_LENGTH	TokenNameIdentifier	 MAX  PATH  LENGTH
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Compute the path type of a file by inspecting name of file and its parents */	TokenNameCOMMENT_JAVADOC	 Compute the path type of a file by inspecting name of file and its parents 
public	TokenNamepublic	
static	TokenNamestatic	
ParsePathType	TokenNameIdentifier	 Parse Path Type
pathType	TokenNameIdentifier	 path Type
(	TokenNameLPAREN	
File	TokenNameIdentifier	 File
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pathLength	TokenNameIdentifier	 path Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
++	TokenNamePLUS_PLUS	
pathLength	TokenNameIdentifier	 path Length
<	TokenNameLESS	
MAX_PATH_LENGTH	TokenNameIdentifier	 MAX  PATH  LENGTH
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ParsePathType	TokenNameIdentifier	 Parse Path Type
ppt	TokenNameIdentifier	 ppt
=	TokenNameEQUAL	
pathName2Type	TokenNameIdentifier	 path Name2 Type
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ppt	TokenNameIdentifier	 ppt
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ppt	TokenNameIdentifier	 ppt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getParentFile	TokenNameIdentifier	 get Parent File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
DEFAULT_PATH_TYPE	TokenNameIdentifier	 DEFAULT  PATH  TYPE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * parse the text prepared in docBuf into a result DocData, * no synchronization is required. * @param docData reusable result * @param name name that should be set to the result * @param trecSrc calling trec content source * @param docBuf text to parse * @param pathType type of parsed file, or null if unknown - may be used by * parsers to alter their behavior according to the file path type. */	TokenNameCOMMENT_JAVADOC	 parse the text prepared in docBuf into a result DocData, no synchronization is required. @param docData reusable result @param name name that should be set to the result @param trecSrc calling trec content source @param docBuf text to parse @param pathType type of parsed file, or null if unknown - may be used by parsers to alter their behavior according to the file path type. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DocData	TokenNameIdentifier	 Doc Data
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
TrecContentSource	TokenNameIdentifier	 Trec Content Source
trecSrc	TokenNameIdentifier	 trec Src
,	TokenNameCOMMA	
StringBuilder	TokenNameIdentifier	 String Builder
docBuf	TokenNameIdentifier	 doc Buf
,	TokenNameCOMMA	
ParsePathType	TokenNameIdentifier	 Parse Path Type
pathType	TokenNameIdentifier	 path Type
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
;	TokenNameSEMICOLON	
/** * strip tags from <code>buf</code>: each tag is replaced by a single blank. * @return text obtained when stripping all tags from <code>buf</code> (Input StringBuilder is unmodified). */	TokenNameCOMMENT_JAVADOC	 strip tags from <code>buf</code>: each tag is replaced by a single blank. @return text obtained when stripping all tags from <code>buf</code> (Input StringBuilder is unmodified). 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stripTags	TokenNameIdentifier	 strip Tags
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stripTags	TokenNameIdentifier	 strip Tags
(	TokenNameLPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * strip tags from input. * @see #stripTags(StringBuilder, int) */	TokenNameCOMMENT_JAVADOC	 strip tags from input. @see #stripTags(StringBuilder, int) 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
stripTags	TokenNameIdentifier	 strip Tags
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"<[^>]*>"	TokenNameStringLiteral	<[^>]*>
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Extract from <code>buf</code> the text of interest within specified tags * @param buf entire input text * @param startTag tag marking start of text of interest * @param endTag tag marking end of text of interest * @param maxPos if &ge; 0 sets a limit on start of text of interest * @return text of interest or null if not found */	TokenNameCOMMENT_JAVADOC	 Extract from <code>buf</code> the text of interest within specified tags @param buf entire input text @param startTag tag marking start of text of interest @param endTag tag marking end of text of interest @param maxPos if &ge; 0 sets a limit on start of text of interest @return text of interest or null if not found 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
startTag	TokenNameIdentifier	 start Tag
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
endTag	TokenNameIdentifier	 end Tag
,	TokenNameCOMMA	
int	TokenNameint	
maxPos	TokenNameIdentifier	 max Pos
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
noisePrefixes	TokenNameIdentifier	 noise Prefixes
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
startTag	TokenNameIdentifier	 start Tag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
maxPos	TokenNameIdentifier	 max Pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
k1	TokenNameIdentifier	 k1
<	TokenNameLESS	
maxPos	TokenNameIdentifier	 max Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k1	TokenNameIdentifier	 k1
+=	TokenNamePLUS_EQUAL	
startTag	TokenNameIdentifier	 start Tag
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
endTag	TokenNameIdentifier	 end Tag
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
maxPos	TokenNameIdentifier	 max Pos
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
k2	TokenNameIdentifier	 k2
<	TokenNameLESS	
maxPos	TokenNameIdentifier	 max Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found end tag with allowed range 	TokenNameCOMMENT_LINE	found end tag with allowed range 
if	TokenNameif	
(	TokenNameLPAREN	
noisePrefixes	TokenNameIdentifier	 noise Prefixes
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
noise	TokenNameIdentifier	 noise
:	TokenNameCOLON	
noisePrefixes	TokenNameIdentifier	 noise Prefixes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k1a	TokenNameIdentifier	 k1a
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
noise	TokenNameIdentifier	 noise
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k1a	TokenNameIdentifier	 k1a
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
k1a	TokenNameIdentifier	 k1a
<	TokenNameLESS	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
k1a	TokenNameIdentifier	 k1a
+	TokenNamePLUS	
noise	TokenNameIdentifier	 noise
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//public static void main(String[] args) { 	TokenNameCOMMENT_LINE	public static void main(String[] args) { 
// System.out.println(stripTags("is it true that<space>2<<second space>><almost last space>1<one more space>?",0)); 	TokenNameCOMMENT_LINE	System.out.println(stripTags("is it true that<space>2<<second space>><almost last space>1<one more space>?",0)); 
//} 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
