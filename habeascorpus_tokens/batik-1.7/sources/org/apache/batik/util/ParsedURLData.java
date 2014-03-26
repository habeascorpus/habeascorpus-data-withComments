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
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
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
net	TokenNameIdentifier	 net
.	TokenNameDOT	
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URLConnection	TokenNameIdentifier	 URL Connection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
InflaterInputStream	TokenNameIdentifier	 Inflater Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
zip	TokenNameIdentifier	 zip
.	TokenNameDOT	
ZipException	TokenNameIdentifier	 Zip Exception
;	TokenNameSEMICOLON	
/** * Holds the data for more URLs. * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: ParsedURLData.java 501495 2007-01-30 18:00:36Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 Holds the data for more URLs. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: ParsedURLData.java 501495 2007-01-30 18:00:36Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_USER_AGENT_HEADER	TokenNameIdentifier	 HTTP  USER  AGENT  HEADER
=	TokenNameEQUAL	
"User-Agent"	TokenNameStringLiteral	User-Agent
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_ACCEPT_HEADER	TokenNameIdentifier	 HTTP  ACCEPT  HEADER
=	TokenNameEQUAL	
"Accept"	TokenNameStringLiteral	Accept
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_ACCEPT_LANGUAGE_HEADER	TokenNameIdentifier	 HTTP  ACCEPT  LANGUAGE  HEADER
=	TokenNameEQUAL	
"Accept-Language"	TokenNameStringLiteral	Accept-Language
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
HTTP_ACCEPT_ENCODING_HEADER	TokenNameIdentifier	 HTTP  ACCEPT  ENCODING  HEADER
=	TokenNameEQUAL	
"Accept-Encoding"	TokenNameStringLiteral	Accept-Encoding
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
acceptedEncodings	TokenNameIdentifier	 accepted Encodings
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
acceptedEncodings	TokenNameIdentifier	 accepted Encodings
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"gzip"	TokenNameStringLiteral	gzip
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * GZIP header magic number bytes, like found in a gzipped * files, which are encoded in Intel format (i&#x2e;e&#x2e; little indian). */	TokenNameCOMMENT_JAVADOC	 GZIP header magic number bytes, like found in a gzipped files, which are encoded in Intel format (i&#x2e;e&#x2e; little indian). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
GZIP_MAGIC	TokenNameIdentifier	 GZIP  MAGIC
=	TokenNameEQUAL	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x1f	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0x8b	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * This is a utility function others can call that checks if * is is a GZIP stream if so it returns a GZIPInputStream that * will decode the contents, otherwise it returns (or a * buffered version of is) untouched. * @param is Stream that may potentially be a GZIP stream. */	TokenNameCOMMENT_JAVADOC	 This is a utility function others can call that checks if is is a GZIP stream if so it returns a GZIPInputStream that will decode the contents, otherwise it returns (or a buffered version of is) untouched. @param is Stream that may potentially be a GZIP stream. 
public	TokenNamepublic	
static	TokenNamestatic	
InputStream	TokenNameIdentifier	 Input Stream
checkGZIP	TokenNameIdentifier	 check GZIP
(	TokenNameLPAREN	
InputStream	TokenNameIdentifier	 Input Stream
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
is	TokenNameIdentifier	 is
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
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
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
GZIP_MAGIC	TokenNameIdentifier	 GZIP  MAGIC
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
GZIP_MAGIC	TokenNameIdentifier	 GZIP  MAGIC
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
GZIPInputStream	TokenNameIdentifier	 GZIP Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
&	TokenNameAND	
0x0F	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Check for a zlib (deflate) stream 	TokenNameCOMMENT_LINE	Check for a zlib (deflate) stream 
int	TokenNameint	
chk	TokenNameIdentifier	 chk
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
256	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
&	TokenNameAND	
0xFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
chk	TokenNameIdentifier	 chk
%	TokenNameREMAINDER	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// I'm not really as certain of this check 	TokenNameCOMMENT_LINE	I'm not really as certain of this check 
// as I would like so I want to force it 	TokenNameCOMMENT_LINE	as I would like so I want to force it 
// to decode part of the stream. 	TokenNameCOMMENT_LINE	to decode part of the stream. 
is	TokenNameIdentifier	 is
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
InputStream	TokenNameIdentifier	 Input Stream
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
InflaterInputStream	TokenNameIdentifier	 Inflater Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
markSupported	TokenNameIdentifier	 mark Supported
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedInputStream	TokenNameIdentifier	 Buffered Input Stream
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
mark	TokenNameIdentifier	 mark
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
InflaterInputStream	TokenNameIdentifier	 Inflater Input Stream
(	TokenNameLPAREN	
is	TokenNameIdentifier	 is
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ZipException	TokenNameIdentifier	 Zip Exception
ze	TokenNameIdentifier	 ze
)	TokenNameRPAREN	
{	TokenNameLBRACE	
is	TokenNameIdentifier	 is
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
is	TokenNameIdentifier	 is
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Since the Data instance is 'hidden' in the ParsedURL * instance we make all our methods public. This makes it * easy for the various Protocol Handlers to update an * instance as parsing proceeds. */	TokenNameCOMMENT_JAVADOC	 Since the Data instance is 'hidden' in the ParsedURL instance we make all our methods public. This makes it easy for the various Protocol Handlers to update an instance as parsing proceeds. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
contentEncoding	TokenNameIdentifier	 content Encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasBeenOpened	TokenNameIdentifier	 has Been Opened
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The extracted type/subtype from the Content-Type header. */	TokenNameCOMMENT_JAVADOC	 The extracted type/subtype from the Content-Type header. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
;	TokenNameSEMICOLON	
/** * The extracted charset parameter from the Content-Type header. */	TokenNameCOMMENT_JAVADOC	 The extracted charset parameter from the Content-Type header. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
contentTypeCharset	TokenNameIdentifier	 content Type Charset
;	TokenNameSEMICOLON	
/** * Void constructor */	TokenNameCOMMENT_JAVADOC	 Void constructor 
public	TokenNamepublic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Build from an existing URL. */	TokenNameCOMMENT_JAVADOC	 Build from an existing URL. 
public	TokenNamepublic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getHost	TokenNameIdentifier	 get Host
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getPort	TokenNameIdentifier	 get Port
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getFile	TokenNameIdentifier	 get File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
getRef	TokenNameIdentifier	 get Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ref	TokenNameIdentifier	 ref
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Attempts to build a normal java.net.URL instance from this * URL. */	TokenNameCOMMENT_JAVADOC	 Attempts to build a normal java.net.URL instance from this URL. 
protected	TokenNameprotected	
URL	TokenNameIdentifier	 URL
buildURL	TokenNameIdentifier	 build URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
{	TokenNameLBRACE	
// System.out.println("File: " + file); 	TokenNameCOMMENT_LINE	System.out.println("File: " + file); 
// if (ref != null) 	TokenNameCOMMENT_LINE	if (ref != null) 
// file += "#" + ref; 	TokenNameCOMMENT_LINE	file += "#" + ref; 
// System.err.println("Building: " + protocol + " - " + 	TokenNameCOMMENT_LINE	System.err.println("Building: " + protocol + " - " + 
// host + " - " + path); 	TokenNameCOMMENT_LINE	host + " - " + path); 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
file	TokenNameIdentifier	 file
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
,	TokenNameCOMMA	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
,	TokenNameCOMMA	
host	TokenNameIdentifier	 host
,	TokenNameCOMMA	
port	TokenNameIdentifier	 port
,	TokenNameCOMMA	
file	TokenNameIdentifier	 file
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement Object.hashCode. */	TokenNameCOMMENT_JAVADOC	 Implement Object.hashCode. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hc	TokenNameIdentifier	 hc
=	TokenNameEQUAL	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hc	TokenNameIdentifier	 hc
^=	TokenNameXOR_EQUAL	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hc	TokenNameIdentifier	 hc
^=	TokenNameXOR_EQUAL	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For some URLs path and ref can get fairly long 	TokenNameCOMMENT_LINE	For some URLs path and ref can get fairly long 
// and the most unique part is towards the end 	TokenNameCOMMENT_LINE	and the most unique part is towards the end 
// so we grab that part for HC purposes 	TokenNameCOMMENT_LINE	so we grab that part for HC purposes 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hc	TokenNameIdentifier	 hc
^=	TokenNameXOR_EQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
hc	TokenNameIdentifier	 hc
^=	TokenNameXOR_EQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
hc	TokenNameIdentifier	 hc
^=	TokenNameXOR_EQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
hc	TokenNameIdentifier	 hc
^=	TokenNameXOR_EQUAL	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hc	TokenNameIdentifier	 hc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Implement Object.equals for ParsedURLData. */	TokenNameCOMMENT_JAVADOC	 Implement Object.equals for ParsedURLData. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
ud	TokenNameIdentifier	 ud
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
port	TokenNameIdentifier	 port
!=	TokenNameNOT_EQUAL	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
host	TokenNameIdentifier	 host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ud	TokenNameIdentifier	 ud
.	TokenNameDOT	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
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
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
contentType	TokenNameIdentifier	 content Type
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasBeenOpened	TokenNameIdentifier	 has Been Opened
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
openStreamInternal	TokenNameIdentifier	 open Stream Internal
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* nothing */	TokenNameCOMMENT_BLOCK	 nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
contentType	TokenNameIdentifier	 content Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content type's type/subtype, if available. This is * only available for some protocols. */	TokenNameCOMMENT_JAVADOC	 Returns the content type's type/subtype, if available. This is only available for some protocols. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentTypeMediaType	TokenNameIdentifier	 get Content Type Media Type
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
extractContentTypeParts	TokenNameIdentifier	 extract Content Type Parts
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the content type's charset parameter, if available. This is * only available for some protocols. */	TokenNameCOMMENT_JAVADOC	 Returns the content type's charset parameter, if available. This is only available for some protocols. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getContentTypeCharset	TokenNameIdentifier	 get Content Type Charset
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
contentTypeCharset	TokenNameIdentifier	 content Type Charset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
extractContentTypeParts	TokenNameIdentifier	 extract Content Type Parts
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
contentTypeCharset	TokenNameIdentifier	 content Type Charset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether the Content-Type header has the given parameter. */	TokenNameCOMMENT_JAVADOC	 Returns whether the Content-Type header has the given parameter. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasContentTypeParameter	TokenNameIdentifier	 has Content Type Parameter
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
plen	TokenNameIdentifier	 plen
=	TokenNameEQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop1	TokenNameIdentifier	 loop1
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
';'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop1	TokenNameIdentifier	 loop1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
=	TokenNameEQUAL	
contentType	TokenNameIdentifier	 content Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
=	TokenNameEQUAL	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
loop2	TokenNameIdentifier	 loop2
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
plen	TokenNameIdentifier	 plen
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
plen	TokenNameIdentifier	 plen
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
param	TokenNameIdentifier	 param
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
loop2	TokenNameIdentifier	 loop2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Extracts the type/subtype and charset parameter from the Content-Type * header. */	TokenNameCOMMENT_JAVADOC	 Extracts the type/subtype and charset parameter from the Content-Type header. 
protected	TokenNameprotected	
void	TokenNamevoid	
extractContentTypeParts	TokenNameIdentifier	 extract Content Type Parts
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
loop1	TokenNameIdentifier	 loop1
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
';'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop1	TokenNameIdentifier	 loop1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
=	TokenNameEQUAL	
contentType	TokenNameIdentifier	 content Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
contentTypeMediaType	TokenNameIdentifier	 content Type Media Type
=	TokenNameEQUAL	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
&&	TokenNameAND_AND	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'c'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'h'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
loop2	TokenNameIdentifier	 loop2
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
' '	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
';'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
break	TokenNamebreak	
loop2	TokenNameIdentifier	 loop2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
contentTypeCharset	TokenNameIdentifier	 content Type Charset
=	TokenNameEQUAL	
contentType	TokenNameIdentifier	 content Type
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
contentEncoding	TokenNameIdentifier	 content Encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
contentEncoding	TokenNameIdentifier	 content Encoding
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasBeenOpened	TokenNameIdentifier	 has Been Opened
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
openStreamInternal	TokenNameIdentifier	 open Stream Internal
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
ioe	TokenNameIdentifier	 ioe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* nothing */	TokenNameCOMMENT_BLOCK	 nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
contentEncoding	TokenNameIdentifier	 content Encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if the URL looks well formed and complete. * This does not garuntee that the stream can be opened but * is a good indication that things aren't totally messed up. */	TokenNameCOMMENT_JAVADOC	 Returns true if the URL looks well formed and complete. This does not garuntee that the stream can be opened but is a good indication that things aren't totally messed up. 
public	TokenNamepublic	
boolean	TokenNameboolean	
complete	TokenNameIdentifier	 complete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
buildURL	TokenNameIdentifier	 build URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Open the stream and check for common compression types. If * the stream is found to be compressed with a standard * compression type it is automatically decompressed. * @param userAgent The user agent opening the stream (may be null). * @param mimeTypes The expected mime types of the content * in the returned InputStream (mapped to Http accept * header among other possability). The elements of * the iterator must be strings (may be null) */	TokenNameCOMMENT_JAVADOC	 Open the stream and check for common compression types. If the stream is found to be compressed with a standard compression type it is automatically decompressed. @param userAgent The user agent opening the stream (may be null). @param mimeTypes The expected mime types of the content in the returned InputStream (mapped to Http accept header among other possability). The elements of the iterator must be strings (may be null) 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStream	TokenNameIdentifier	 open Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
raw	TokenNameIdentifier	 raw
=	TokenNameEQUAL	
openStreamInternal	TokenNameIdentifier	 open Stream Internal
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
acceptedEncodings	TokenNameIdentifier	 accepted Encodings
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
checkGZIP	TokenNameIdentifier	 check GZIP
(	TokenNameLPAREN	
raw	TokenNameIdentifier	 raw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Open the stream and returns it. No checks are made to see * if the stream is compressed or encoded in any way. * @param userAgent The user agent opening the stream (may be null). * @param mimeTypes The expected mime types of the content * in the returned InputStream (mapped to Http accept * header among other possability). The elements of * the iterator must be strings (may be null) */	TokenNameCOMMENT_JAVADOC	 Open the stream and returns it. No checks are made to see if the stream is compressed or encoded in any way. @param userAgent The user agent opening the stream (may be null). @param mimeTypes The expected mime types of the content in the returned InputStream (mapped to Http accept header among other possability). The elements of the iterator must be strings (may be null) 
public	TokenNamepublic	
InputStream	TokenNameIdentifier	 Input Stream
openStreamRaw	TokenNameIdentifier	 open Stream Raw
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
Iterator	TokenNameIdentifier	 Iterator
mimeTypes	TokenNameIdentifier	 mime Types
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
openStreamInternal	TokenNameIdentifier	 open Stream Internal
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
,	TokenNameCOMMA	
mimeTypes	TokenNameIdentifier	 mime Types
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
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
if	TokenNameif	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
stream	TokenNameIdentifier	 stream
;	TokenNameSEMICOLON	
hasBeenOpened	TokenNameIdentifier	 has Been Opened
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
buildURL	TokenNameIdentifier	 build URL
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Unable to make sense of URL for connection"	TokenNameStringLiteral	Unable to make sense of URL for connection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
URLConnection	TokenNameIdentifier	 URL Connection
urlC	TokenNameIdentifier	 url C
=	TokenNameEQUAL	
url	TokenNameIdentifier	 url
.	TokenNameDOT	
openConnection	TokenNameIdentifier	 open Connection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
urlC	TokenNameIdentifier	 url C
instanceof	TokenNameinstanceof	
HttpURLConnection	TokenNameIdentifier	 Http URL Connection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
userAgent	TokenNameIdentifier	 user Agent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
urlC	TokenNameIdentifier	 url C
.	TokenNameDOT	
setRequestProperty	TokenNameIdentifier	 set Request Property
(	TokenNameLPAREN	
HTTP_USER_AGENT_HEADER	TokenNameIdentifier	 HTTP  USER  AGENT  HEADER
,	TokenNameCOMMA	
userAgent	TokenNameIdentifier	 user Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
acceptHeader	TokenNameIdentifier	 accept Header
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
acceptHeader	TokenNameIdentifier	 accept Header
+=	TokenNamePLUS_EQUAL	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
mimeTypes	TokenNameIdentifier	 mime Types
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
acceptHeader	TokenNameIdentifier	 accept Header
+=	TokenNamePLUS_EQUAL	
","	TokenNameStringLiteral	,
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
urlC	TokenNameIdentifier	 url C
.	TokenNameDOT	
setRequestProperty	TokenNameIdentifier	 set Request Property
(	TokenNameLPAREN	
HTTP_ACCEPT_HEADER	TokenNameIdentifier	 HTTP  ACCEPT  HEADER
,	TokenNameCOMMA	
acceptHeader	TokenNameIdentifier	 accept Header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
encodingTypes	TokenNameIdentifier	 encoding Types
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
encodingHeader	TokenNameIdentifier	 encoding Header
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
encodingTypes	TokenNameIdentifier	 encoding Types
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
encodingHeader	TokenNameIdentifier	 encoding Header
+=	TokenNamePLUS_EQUAL	
encodingTypes	TokenNameIdentifier	 encoding Types
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
encodingTypes	TokenNameIdentifier	 encoding Types
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
encodingHeader	TokenNameIdentifier	 encoding Header
+=	TokenNamePLUS_EQUAL	
","	TokenNameStringLiteral	,
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
urlC	TokenNameIdentifier	 url C
.	TokenNameDOT	
setRequestProperty	TokenNameIdentifier	 set Request Property
(	TokenNameLPAREN	
HTTP_ACCEPT_ENCODING_HEADER	TokenNameIdentifier	 HTTP  ACCEPT  ENCODING  HEADER
,	TokenNameCOMMA	
encodingHeader	TokenNameIdentifier	 encoding Header
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
contentType	TokenNameIdentifier	 content Type
=	TokenNameEQUAL	
urlC	TokenNameIdentifier	 url C
.	TokenNameDOT	
getContentType	TokenNameIdentifier	 get Content Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
contentEncoding	TokenNameIdentifier	 content Encoding
=	TokenNameEQUAL	
urlC	TokenNameIdentifier	 url C
.	TokenNameDOT	
getContentEncoding	TokenNameIdentifier	 get Content Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
stream	TokenNameIdentifier	 stream
=	TokenNameEQUAL	
urlC	TokenNameIdentifier	 url C
.	TokenNameDOT	
getInputStream	TokenNameIdentifier	 get Input Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the URL up to and include the port number on * the host. Does not include the path or fragment pieces. */	TokenNameCOMMENT_JAVADOC	 Returns the URL up to and include the port number on the host. Does not include the path or fragment pieces. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPortStr	TokenNameIdentifier	 get Port Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
portStr	TokenNameIdentifier	 port Str
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
portStr	TokenNameIdentifier	 port Str
+=	TokenNamePLUS_EQUAL	
protocol	TokenNameIdentifier	 protocol
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
portStr	TokenNameIdentifier	 port Str
+=	TokenNamePLUS_EQUAL	
"//"	TokenNameStringLiteral	//
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
portStr	TokenNameIdentifier	 port Str
+=	TokenNamePLUS_EQUAL	
host	TokenNameIdentifier	 host
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
portStr	TokenNameIdentifier	 port Str
+=	TokenNamePLUS_EQUAL	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
port	TokenNameIdentifier	 port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
portStr	TokenNameIdentifier	 port Str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
boolean	TokenNameboolean	
sameFile	TokenNameIdentifier	 same File
(	TokenNameLPAREN	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Check if the rest of the two PURLs matche other than 	TokenNameCOMMENT_LINE	Check if the rest of the two PURLs matche other than 
// the 'ref' 	TokenNameCOMMENT_LINE	the 'ref' 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
port	TokenNameIdentifier	 port
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
port	TokenNameIdentifier	 port
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
host	TokenNameIdentifier	 host
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
host	TokenNameIdentifier	 host
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a string representation of the data. */	TokenNameCOMMENT_JAVADOC	 Return a string representation of the data. 
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
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ref	TokenNameIdentifier	 ref
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
+=	TokenNamePLUS_EQUAL	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
