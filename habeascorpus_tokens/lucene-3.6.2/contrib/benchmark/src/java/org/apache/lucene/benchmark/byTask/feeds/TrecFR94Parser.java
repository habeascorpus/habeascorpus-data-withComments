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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Date	TokenNameIdentifier	 Date
;	TokenNameSEMICOLON	
/** * Parser for the FR94 docs in trec disks 4+5 collection format */	TokenNameCOMMENT_JAVADOC	 Parser for the FR94 docs in trec disks 4+5 collection format 
public	TokenNamepublic	
class	TokenNameclass	
TrecFR94Parser	TokenNameIdentifier	 Trec F R94 Parser
extends	TokenNameextends	
TrecDocParser	TokenNameIdentifier	 Trec Doc Parser
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT	TokenNameIdentifier	 TEXT
=	TokenNameEQUAL	
"<TEXT>"	TokenNameStringLiteral	<TEXT>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TEXT_LENGTH	TokenNameIdentifier	 TEXT  LENGTH
=	TokenNameEQUAL	
TEXT	TokenNameIdentifier	 TEXT
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT_END	TokenNameIdentifier	 TEXT  END
=	TokenNameEQUAL	
"</TEXT>"	TokenNameStringLiteral	</TEXT>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE	TokenNameIdentifier	 DATE
=	TokenNameEQUAL	
"<DATE>"	TokenNameStringLiteral	<DATE>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
DATE_NOISE_PREFIXES	TokenNameIdentifier	 DATE  NOISE  PREFIXES
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"DATE:"	TokenNameStringLiteral	DATE:
,	TokenNameCOMMA	
"date:"	TokenNameStringLiteral	date:
,	TokenNameCOMMA	
//TODO improve date extraction for this format 	TokenNameCOMMENT_LINE	TODO improve date extraction for this format 
"t.c."	TokenNameStringLiteral	t.c.
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE_END	TokenNameIdentifier	 DATE  END
=	TokenNameEQUAL	
"</DATE>"	TokenNameStringLiteral	</DATE>
;	TokenNameSEMICOLON	
//TODO can we also extract title for this format? 	TokenNameCOMMENT_LINE	TODO can we also extract title for this format? 
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
int	TokenNameint	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// that much is skipped 	TokenNameCOMMENT_LINE	that much is skipped 
// optionally skip some of the text, set date (no title?) 	TokenNameCOMMENT_LINE	optionally skip some of the text, set date (no title?) 
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
TEXT	TokenNameIdentifier	 TEXT
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
TEXT_END	TokenNameIdentifier	 TEXT  END
,	TokenNameCOMMA	
h1	TokenNameIdentifier	 h1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
h1	TokenNameIdentifier	 h1
+	TokenNamePLUS	
TEXT_LENGTH	TokenNameIdentifier	 TEXT  LENGTH
;	TokenNameSEMICOLON	
// date... 	TokenNameCOMMENT_LINE	date... 
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
DATE_NOISE_PREFIXES	TokenNameIdentifier	 DATE  NOISE  PREFIXES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dateStr	TokenNameIdentifier	 date Str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateStr	TokenNameIdentifier	 date Str
=	TokenNameEQUAL	
stripTags	TokenNameIdentifier	 strip Tags
(	TokenNameLPAREN	
dateStr	TokenNameIdentifier	 date Str
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
trecSrc	TokenNameIdentifier	 trec Src
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
dateStr	TokenNameIdentifier	 date Str
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setName	TokenNameIdentifier	 set Name
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setDate	TokenNameIdentifier	 set Date
(	TokenNameLPAREN	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docData	TokenNameIdentifier	 doc Data
.	TokenNameDOT	
setBody	TokenNameIdentifier	 set Body
(	TokenNameLPAREN	
stripTags	TokenNameIdentifier	 strip Tags
(	TokenNameLPAREN	
docBuf	TokenNameIdentifier	 doc Buf
,	TokenNameCOMMA	
mark	TokenNameIdentifier	 mark
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
docData	TokenNameIdentifier	 doc Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
