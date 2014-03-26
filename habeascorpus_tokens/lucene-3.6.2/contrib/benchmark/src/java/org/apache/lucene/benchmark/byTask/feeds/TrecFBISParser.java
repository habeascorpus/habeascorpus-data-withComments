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
/** * Parser for the FBIS docs in trec disks 4+5 collection format */	TokenNameCOMMENT_JAVADOC	 Parser for the FBIS docs in trec disks 4+5 collection format 
public	TokenNamepublic	
class	TokenNameclass	
TrecFBISParser	TokenNameIdentifier	 Trec FBIS Parser
extends	TokenNameextends	
TrecDocParser	TokenNameIdentifier	 Trec Doc Parser
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEADER	TokenNameIdentifier	 HEADER
=	TokenNameEQUAL	
"<HEADER>"	TokenNameStringLiteral	<HEADER>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEADER_END	TokenNameIdentifier	 HEADER  END
=	TokenNameEQUAL	
"</HEADER>"	TokenNameStringLiteral	</HEADER>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
HEADER_END_LENGTH	TokenNameIdentifier	 HEADER  END  LENGTH
=	TokenNameEQUAL	
HEADER_END	TokenNameIdentifier	 HEADER  END
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE1	TokenNameIdentifier	 DAT E1
=	TokenNameEQUAL	
"<DATE1>"	TokenNameStringLiteral	<DATE1>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE1_END	TokenNameIdentifier	 DAT E1  END
=	TokenNameEQUAL	
"</DATE1>"	TokenNameStringLiteral	</DATE1>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TI	TokenNameIdentifier	 TI
=	TokenNameEQUAL	
"<TI>"	TokenNameStringLiteral	<TI>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TI_END	TokenNameIdentifier	 TI  END
=	TokenNameEQUAL	
"</TI>"	TokenNameStringLiteral	</TI>
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
int	TokenNameint	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// that much is skipped 	TokenNameCOMMENT_LINE	that much is skipped 
// optionally skip some of the text, set date, title 	TokenNameCOMMENT_LINE	optionally skip some of the text, set date, title 
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
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
HEADER	TokenNameIdentifier	 HEADER
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
HEADER_END	TokenNameIdentifier	 HEADER  END
,	TokenNameCOMMA	
h1	TokenNameIdentifier	 h1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mark	TokenNameIdentifier	 mark
=	TokenNameEQUAL	
h2	TokenNameIdentifier	 h2
+	TokenNamePLUS	
HEADER_END_LENGTH	TokenNameIdentifier	 HEADER  END  LENGTH
;	TokenNameSEMICOLON	
// date... 	TokenNameCOMMENT_LINE	date... 
String	TokenNameIdentifier	 String
dateStr	TokenNameIdentifier	 date Str
=	TokenNameEQUAL	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
docBuf	TokenNameIdentifier	 doc Buf
,	TokenNameCOMMA	
DATE1	TokenNameIdentifier	 DAT E1
,	TokenNameCOMMA	
DATE1_END	TokenNameIdentifier	 DAT E1  END
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
// title... 	TokenNameCOMMENT_LINE	title... 
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
docBuf	TokenNameIdentifier	 doc Buf
,	TokenNameCOMMA	
TI	TokenNameIdentifier	 TI
,	TokenNameCOMMA	
TI_END	TokenNameIdentifier	 TI  END
,	TokenNameCOMMA	
h2	TokenNameIdentifier	 h2
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
setTitle	TokenNameIdentifier	 set Title
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
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
