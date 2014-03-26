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
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
/** * Parser for the GOV2 collection format */	TokenNameCOMMENT_JAVADOC	 Parser for the GOV2 collection format 
public	TokenNamepublic	
class	TokenNameclass	
TrecGov2Parser	TokenNameIdentifier	 Trec Gov2 Parser
extends	TokenNameextends	
TrecDocParser	TokenNameIdentifier	 Trec Doc Parser
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE	TokenNameIdentifier	 DATE
=	TokenNameEQUAL	
"Date: "	TokenNameStringLiteral	Date: 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE_END	TokenNameIdentifier	 DATE  END
=	TokenNameEQUAL	
TrecContentSource	TokenNameIdentifier	 Trec Content Source
.	TokenNameDOT	
NEW_LINE	TokenNameIdentifier	 NEW  LINE
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOCHDR	TokenNameIdentifier	 DOCHDR
=	TokenNameEQUAL	
"<DOCHDR>"	TokenNameStringLiteral	<DOCHDR>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TERMINATING_DOCHDR	TokenNameIdentifier	 TERMINATING  DOCHDR
=	TokenNameEQUAL	
"</DOCHDR>"	TokenNameStringLiteral	</DOCHDR>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TERMINATING_DOCHDR_LENGTH	TokenNameIdentifier	 TERMINATING  DOCHDR  LENGTH
=	TokenNameEQUAL	
TERMINATING_DOCHDR	TokenNameIdentifier	 TERMINATING  DOCHDR
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
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
{	TokenNameLBRACE	
// Set up a (per-thread) reused Reader over the read content, reset it to re-read from docBuf 	TokenNameCOMMENT_LINE	Set up a (per-thread) reused Reader over the read content, reset it to re-read from docBuf 
Reader	TokenNameIdentifier	 Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
trecSrc	TokenNameIdentifier	 trec Src
.	TokenNameDOT	
getTrecDocReader	TokenNameIdentifier	 get Trec Doc Reader
(	TokenNameLPAREN	
docBuf	TokenNameIdentifier	 doc Buf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip some of the text, optionally set date 	TokenNameCOMMENT_LINE	skip some of the text, optionally set date 
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
h1	TokenNameIdentifier	 h1
=	TokenNameEQUAL	
docBuf	TokenNameIdentifier	 doc Buf
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
DOCHDR	TokenNameIdentifier	 DOCHDR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
h1	TokenNameIdentifier	 h1
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
h2	TokenNameIdentifier	 h2
=	TokenNameEQUAL	
docBuf	TokenNameIdentifier	 doc Buf
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
TERMINATING_DOCHDR	TokenNameIdentifier	 TERMINATING  DOCHDR
,	TokenNameCOMMA	
h1	TokenNameIdentifier	 h1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
dateStr	TokenNameIdentifier	 date Str
=	TokenNameEQUAL	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
docBuf	TokenNameIdentifier	 doc Buf
,	TokenNameCOMMA	
DATE	TokenNameIdentifier	 DATE
,	TokenNameCOMMA	
DATE_END	TokenNameIdentifier	 DATE  END
,	TokenNameCOMMA	
h2	TokenNameIdentifier	 h2
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dateStr	TokenNameIdentifier	 date Str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
trecSrc	TokenNameIdentifier	 trec Src
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
dateStr	TokenNameIdentifier	 date Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
h2	TokenNameIdentifier	 h2
+	TokenNamePLUS	
TERMINATING_DOCHDR_LENGTH	TokenNameIdentifier	 TERMINATING  DOCHDR  LENGTH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
htmlParser	TokenNameIdentifier	 html Parser
=	TokenNameEQUAL	
trecSrc	TokenNameIdentifier	 trec Src
.	TokenNameDOT	
getHtmlParser	TokenNameIdentifier	 get Html Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
htmlParser	TokenNameIdentifier	 html Parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
docData	TokenNameIdentifier	 doc Data
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
