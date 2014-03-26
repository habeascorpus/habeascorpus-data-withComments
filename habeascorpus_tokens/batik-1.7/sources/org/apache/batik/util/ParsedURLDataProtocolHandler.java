/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * Protocol Handler for the 'data' protocol. * RFC: 2397 * http://www.ietf.org/rfc/rfc2397.txt * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: ParsedURLDataProtocolHandler.java 578680 2007-09-24 07:20:03Z cam $ */	TokenNameCOMMENT_JAVADOC	 Protocol Handler for the 'data' protocol. RFC: 2397 http://www.ietf.org/rfc/rfc2397.txt * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: ParsedURLDataProtocolHandler.java 578680 2007-09-24 07:20:03Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ParsedURLDataProtocolHandler	TokenNameIdentifier	 Parsed URL Data Protocol Handler
extends	TokenNameextends	
AbstractParsedURLProtocolHandler	TokenNameIdentifier	 Abstract Parsed URL Protocol Handler
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DATA_PROTOCOL	TokenNameIdentifier	 DATA  PROTOCOL
=	TokenNameEQUAL	
"data"	TokenNameStringLiteral	data
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
BASE64	TokenNameIdentifier	 BAS E64
=	TokenNameEQUAL	
"base64"	TokenNameStringLiteral	base64
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
CHARSET	TokenNameIdentifier	 CHARSET
=	TokenNameEQUAL	
"charset"	TokenNameStringLiteral	charset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ParsedURLDataProtocolHandler	TokenNameIdentifier	 Parsed URL Data Protocol Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
DATA_PROTOCOL	TokenNameIdentifier	 DATA  PROTOCOL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
ParsedURL	TokenNameIdentifier	 Parsed URL
baseURL	TokenNameIdentifier	 base URL
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No relative form... 	TokenNameCOMMENT_LINE	No relative form... 
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DataParsedURLData	TokenNameIdentifier	 Data Parsed URL Data
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
DataParsedURLData	TokenNameIdentifier	 Data Parsed URL Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pidx	TokenNameIdentifier	 pidx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Pull fragment id off first... 	TokenNameCOMMENT_LINE	Pull fragment id off first... 
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
urlStr	TokenNameIdentifier	 url Str
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// May have a protocol spec... 	TokenNameCOMMENT_LINE	May have a protocol spec... 
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
pidx	TokenNameIdentifier	 pidx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
// Got a slash in protocol probably means 	TokenNameCOMMENT_LINE	Got a slash in protocol probably means 
// no protocol given, (host and port?) 	TokenNameCOMMENT_LINE	no protocol given, (host and port?) 
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
pidx	TokenNameIdentifier	 pidx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
pidx	TokenNameIdentifier	 pidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
pidx	TokenNameIdentifier	 pidx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pidx	TokenNameIdentifier	 pidx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
aidx	TokenNameIdentifier	 aidx
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
aidx	TokenNameIdentifier	 aidx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
aidx	TokenNameIdentifier	 aidx
==	TokenNameEQUAL_EQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
enc	TokenNameIdentifier	 enc
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
aidx	TokenNameIdentifier	 aidx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It is an encoding. 	TokenNameCOMMENT_LINE	It is an encoding. 
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentEncoding	TokenNameIdentifier	 content Encoding
=	TokenNameEQUAL	
enc	TokenNameIdentifier	 enc
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
aidx	TokenNameIdentifier	 aidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if theres a charset pull it out. 	TokenNameCOMMENT_LINE	if theres a charset pull it out. 
aidx	TokenNameIdentifier	 aidx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
aidx	TokenNameIdentifier	 aidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
aidx	TokenNameIdentifier	 aidx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
aidx	TokenNameIdentifier	 aidx
<	TokenNameLESS	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
aidx	TokenNameIdentifier	 aidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
aidx	TokenNameIdentifier	 aidx
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
eqIdx	TokenNameIdentifier	 eq Idx
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
eqIdx	TokenNameIdentifier	 eq Idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
CHARSET	TokenNameIdentifier	 CHARSET
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
eqIdx	TokenNameIdentifier	 eq Idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
charset	TokenNameIdentifier	 charset
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
eqIdx	TokenNameIdentifier	 eq Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
aidx	TokenNameIdentifier	 aidx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
<	TokenNameLESS	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overrides some of the methods to support data protocol weirdness */	TokenNameCOMMENT_JAVADOC	 Overrides some of the methods to support data protocol weirdness 
static	TokenNamestatic	
class	TokenNameclass	
DataParsedURLData	TokenNameIdentifier	 Data Parsed URL Data
extends	TokenNameextends	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
charset	TokenNameIdentifier	 charset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPortStr	TokenNameIdentifier	 get Port Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
portStr	TokenNameIdentifier	 port Str
=	TokenNameEQUAL	
"data:"	TokenNameStringLiteral	data:
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
portStr	TokenNameIdentifier	 port Str
+=	TokenNamePLUS_EQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
portStr	TokenNameIdentifier	 port Str
+=	TokenNamePLUS_EQUAL	
","	TokenNameStringLiteral	,
;	TokenNameSEMICOLON	
return	TokenNamereturn	
portStr	TokenNameIdentifier	 port Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
getPortStr	TokenNameIdentifier	 get Port Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
'#'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content type if available. This is only available * for some protocols. */	TokenNameCOMMENT_JAVADOC	 Returns the content type if available. This is only available for some protocols. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contentType	TokenNameIdentifier	 content Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content encoding if available. This is only available * for some protocols. */	TokenNameCOMMENT_JAVADOC	 Returns the content encoding if available. This is only available for some protocols. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentEncoding	TokenNameIdentifier	 get Content Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contentEncoding	TokenNameIdentifier	 content Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
InputStream	TokenNameIdentifier	 Input Stream
openStreamInternal	TokenNameIdentifier	 open Stream Internal
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
encodingTypes	TokenNameIdentifier	 encoding Types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
BASE64	TokenNameIdentifier	 BAS E64
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
contentEncoding	TokenNameIdentifier	 content Encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
new	TokenNamenew	
Base64DecodeStream	TokenNameIdentifier	 Base64 Decode Stream
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
InputStream	TokenNameIdentifier	 Input Stream
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'%'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
char	TokenNamechar	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c1	TokenNameIdentifier	 c1
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c1	TokenNameIdentifier	 c1
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
-	TokenNameMINUS	
'a'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c1	TokenNameIdentifier	 c1
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
-	TokenNameMINUS	
'A'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
b	TokenNameIdentifier	 b
*=	TokenNameMULTIPLY_EQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c2	TokenNameIdentifier	 c2
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c2	TokenNameIdentifier	 c2
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
-	TokenNameMINUS	
'a'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c2	TokenNameIdentifier	 c2
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
c2	TokenNameIdentifier	 c2
-	TokenNameMINUS	
'A'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ByteArrayInputStream	TokenNameIdentifier	 Byte Array Input Stream
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
