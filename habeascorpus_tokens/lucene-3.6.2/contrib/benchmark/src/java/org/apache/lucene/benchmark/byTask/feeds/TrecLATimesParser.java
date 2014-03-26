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
/** * Parser for the FT docs in trec disks 4+5 collection format */	TokenNameCOMMENT_JAVADOC	 Parser for the FT docs in trec disks 4+5 collection format 
public	TokenNamepublic	
class	TokenNameclass	
TrecLATimesParser	TokenNameIdentifier	 Trec LA Times Parser
extends	TokenNameextends	
TrecDocParser	TokenNameIdentifier	 Trec Doc Parser
{	TokenNameLBRACE	
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
DATE_END	TokenNameIdentifier	 DATE  END
=	TokenNameEQUAL	
"</DATE>"	TokenNameStringLiteral	</DATE>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATE_NOISE	TokenNameIdentifier	 DATE  NOISE
=	TokenNameEQUAL	
"day,"	TokenNameStringLiteral	day,
;	TokenNameSEMICOLON	
// anything aftre the ',' 	TokenNameCOMMENT_LINE	anything aftre the ',' 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SUBJECT	TokenNameIdentifier	 SUBJECT
=	TokenNameEQUAL	
"<SUBJECT>"	TokenNameStringLiteral	<SUBJECT>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SUBJECT_END	TokenNameIdentifier	 SUBJECT  END
=	TokenNameEQUAL	
"</SUBJECT>"	TokenNameStringLiteral	</SUBJECT>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEADLINE	TokenNameIdentifier	 HEADLINE
=	TokenNameEQUAL	
"<HEADLINE>"	TokenNameStringLiteral	<HEADLINE>
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HEADLINE_END	TokenNameIdentifier	 HEADLINE  END
=	TokenNameEQUAL	
"</HEADLINE>"	TokenNameStringLiteral	</HEADLINE>
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
// date... 	TokenNameCOMMENT_LINE	date... 
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
null	TokenNamenull	
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
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
int	TokenNameint	
d2a	TokenNameIdentifier	 d2a
=	TokenNameEQUAL	
dateStr	TokenNameIdentifier	 date Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
DATE_NOISE	TokenNameIdentifier	 DATE  NOISE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d2a	TokenNameIdentifier	 d2a
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dateStr	TokenNameIdentifier	 date Str
=	TokenNameEQUAL	
dateStr	TokenNameIdentifier	 date Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
d2a	TokenNameIdentifier	 d2a
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// we need the "day" part 	TokenNameCOMMENT_LINE	we need the "day" part 
}	TokenNameRBRACE	
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
// title... first try with SUBJECT, them with HEADLINE 	TokenNameCOMMENT_LINE	title... first try with SUBJECT, them with HEADLINE 
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
docBuf	TokenNameIdentifier	 doc Buf
,	TokenNameCOMMA	
SUBJECT	TokenNameIdentifier	 SUBJECT
,	TokenNameCOMMA	
SUBJECT_END	TokenNameIdentifier	 SUBJECT  END
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
extract	TokenNameIdentifier	 extract
(	TokenNameLPAREN	
docBuf	TokenNameIdentifier	 doc Buf
,	TokenNameCOMMA	
HEADLINE	TokenNameIdentifier	 HEADLINE
,	TokenNameCOMMA	
HEADLINE_END	TokenNameIdentifier	 HEADLINE  END
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
title	TokenNameIdentifier	 title
=	TokenNameEQUAL	
stripTags	TokenNameIdentifier	 strip Tags
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
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
