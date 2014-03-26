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
/** * The default protocol handler this handles the most common * protocols, such as 'file' 'http' 'ftp'. * The parsing should be general enought to support most * 'normal' URL formats, so in many cases * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: ParsedURLDefaultProtocolHandler.java 578680 2007-09-24 07:20:03Z cam $ */	TokenNameCOMMENT_JAVADOC	 The default protocol handler this handles the most common protocols, such as 'file' 'http' 'ftp'. The parsing should be general enought to support most 'normal' URL formats, so in many cases * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: ParsedURLDefaultProtocolHandler.java 578680 2007-09-24 07:20:03Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ParsedURLDefaultProtocolHandler	TokenNameIdentifier	 Parsed URL Default Protocol Handler
extends	TokenNameextends	
AbstractParsedURLProtocolHandler	TokenNameIdentifier	 Abstract Parsed URL Protocol Handler
{	TokenNameLBRACE	
/** * Default constructor sets no protocol so this becomes * default handler. */	TokenNameCOMMENT_JAVADOC	 Default constructor sets no protocol so this becomes default handler. 
public	TokenNamepublic	
ParsedURLDefaultProtocolHandler	TokenNameIdentifier	 Parsed URL Default Protocol Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subclass constructor allows subclasses to provide protocol, * to be handled. */	TokenNameCOMMENT_JAVADOC	 Subclass constructor allows subclasses to provide protocol, to be handled. 
protected	TokenNameprotected	
ParsedURLDefaultProtocolHandler	TokenNameIdentifier	 Parsed URL Default Protocol Handler
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subclasses can override these method to construct alternate * subclasses of ParsedURLData. */	TokenNameCOMMENT_JAVADOC	 Subclasses can override these method to construct alternate subclasses of ParsedURLData. 
protected	TokenNameprotected	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
constructParsedURLData	TokenNameIdentifier	 construct Parsed URL Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subclasses can override these method to construct alternate * subclasses of ParsedURLData. * @param url the java.net.URL class we reference. */	TokenNameCOMMENT_JAVADOC	 Subclasses can override these method to construct alternate subclasses of ParsedURLData. @param url the java.net.URL class we reference. 
protected	TokenNameprotected	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
constructParsedURLData	TokenNameIdentifier	 construct Parsed URL Data
(	TokenNameLPAREN	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Parses the string and returns the results of parsing in the * ParsedURLData object. * @param urlStr the string to parse as a URL. */	TokenNameCOMMENT_JAVADOC	 Parses the string and returns the results of parsing in the ParsedURLData object. @param urlStr the string to parse as a URL. 
public	TokenNamepublic	
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
url	TokenNameIdentifier	 url
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("System Parse: " + urlStr); 	TokenNameCOMMENT_LINE	System.err.println("System Parse: " + urlStr); 
return	TokenNamereturn	
constructParsedURLData	TokenNameIdentifier	 construct Parsed URL Data
(	TokenNameLPAREN	
url	TokenNameIdentifier	 url
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
mue	TokenNameIdentifier	 mue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Built in URL wouldn't take it... 	TokenNameCOMMENT_LINE	Built in URL wouldn't take it... 
// mue.printStackTrace(); 	TokenNameCOMMENT_LINE	mue.printStackTrace(); 
}	TokenNameRBRACE	
// new Exception("Custom Parse: " + urlStr).printStackTrace(); 	TokenNameCOMMENT_LINE	new Exception("Custom Parse: " + urlStr).printStackTrace(); 
// System.err.println("Custom Parse: " + urlStr); 	TokenNameCOMMENT_LINE	System.err.println("Custom Parse: " + urlStr); 
ParsedURLData	TokenNameIdentifier	 Parsed URL Data
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
constructParsedURLData	TokenNameIdentifier	 construct Parsed URL Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
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
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// Protocol is only allowed to include -+.a-zA-Z 	TokenNameCOMMENT_LINE	Protocol is only allowed to include -+.a-zA-Z 
// So as soon as we hit something else we know we 	TokenNameCOMMENT_LINE	So as soon as we hit something else we know we 
// are done (if it is a ':' then we have protocol otherwise 	TokenNameCOMMENT_LINE	are done (if it is a ':' then we have protocol otherwise 
// we don't. 	TokenNameCOMMENT_LINE	we don't. 
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Has a protocol spec... 	TokenNameCOMMENT_LINE	Has a protocol spec... 
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
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pidx	TokenNameIdentifier	 pidx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Skip ':' 	TokenNameCOMMENT_LINE	Skip ':' 
}	TokenNameRBRACE	
// See if we have host/port spec. 	TokenNameCOMMENT_LINE	See if we have host/port spec. 
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No slashes (apache.org) or a double slash 	TokenNameCOMMENT_LINE	No slashes (apache.org) or a double slash 
// (//apache.org/....) so 	TokenNameCOMMENT_LINE	(//apache.org/....) so 
// we should have host[:port] before next slash. 	TokenNameCOMMENT_LINE	we should have host[:port] before next slash. 
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
pidx	TokenNameIdentifier	 pidx
+=	TokenNamePLUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Skip double slash... 	TokenNameCOMMENT_LINE	Skip double slash... 
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
pidx	TokenNameIdentifier	 pidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// find end of host:Port spec 	TokenNameCOMMENT_LINE	find end of host:Port spec 
String	TokenNameIdentifier	 String
hostPort	TokenNameIdentifier	 host Port
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Just host and port nothing following... 	TokenNameCOMMENT_LINE	Just host and port nothing following... 
hostPort	TokenNameIdentifier	 host Port
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
// Path spec follows... 	TokenNameCOMMENT_LINE	Path spec follows... 
hostPort	TokenNameIdentifier	 host Port
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
int	TokenNameint	
hidx	TokenNameIdentifier	 hidx
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
// Remember location of '/' 	TokenNameCOMMENT_LINE	Remember location of '/' 
// pull apart host and port number... 	TokenNameCOMMENT_LINE	pull apart host and port number... 
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
hostPort	TokenNameIdentifier	 host Port
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Just Host... 	TokenNameCOMMENT_LINE	Just Host... 
if	TokenNameif	
(	TokenNameLPAREN	
hostPort	TokenNameIdentifier	 host Port
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
hostPort	TokenNameIdentifier	 host Port
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Host and port 	TokenNameCOMMENT_LINE	Host and port 
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
hostPort	TokenNameIdentifier	 host Port
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
hostPort	TokenNameIdentifier	 host Port
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
portStr	TokenNameIdentifier	 port Str
=	TokenNameEQUAL	
hostPort	TokenNameIdentifier	 host Port
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
port	TokenNameIdentifier	 port
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
portStr	TokenNameIdentifier	 port Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
nfe	TokenNameIdentifier	 nfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad port leave as '-1' 	TokenNameCOMMENT_LINE	bad port leave as '-1' 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
port	TokenNameIdentifier	 port
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// no '.' in a host spec??? and no port, probably 	TokenNameCOMMENT_LINE	no '.' in a host spec??? and no port, probably 
// just a path. 	TokenNameCOMMENT_LINE	just a path. 
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
host	TokenNameIdentifier	 host
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
pidx	TokenNameIdentifier	 pidx
=	TokenNameEQUAL	
hidx	TokenNameIdentifier	 hidx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
pidx	TokenNameIdentifier	 pidx
>=	TokenNameGREATER_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
// Nothing follows 	TokenNameCOMMENT_LINE	Nothing follows 
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
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
unescapeStr	TokenNameIdentifier	 unescape Str
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
// quick out.. 	TokenNameCOMMENT_LINE	quick out.. 
int	TokenNameint	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
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
!=	TokenNameNOT_EQUAL	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'%'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch1	TokenNameIdentifier	 ch1
=	TokenNameEQUAL	
charToHex	TokenNameIdentifier	 char To Hex
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch2	TokenNameIdentifier	 ch2
=	TokenNameEQUAL	
charToHex	TokenNameIdentifier	 char To Hex
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch2	TokenNameIdentifier	 ch2
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
ch1	TokenNameIdentifier	 ch1
<<	TokenNameLEFT_SHIFT	
4	TokenNameIntegerLiteral	
|	TokenNameOR	
ch2	TokenNameIdentifier	 ch2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
charToHex	TokenNameIdentifier	 char To Hex
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'0'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'1'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'2'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'3'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'4'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'5'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'6'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'7'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'8'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'9'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
'0'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'A'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'b'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'B'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'C'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'd'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'D'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
13	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'E'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'f'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'F'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
15	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Parses the string as a sub URL of baseURL, and returns the * results of parsing in the ParsedURLData object. * @param baseURL the base url for parsing. * @param urlStr the string to parse as a URL. */	TokenNameCOMMENT_JAVADOC	 Parses the string as a sub URL of baseURL, and returns the results of parsing in the ParsedURLData object. @param baseURL the base url for parsing. @param urlStr the string to parse as a URL. 
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
// Reference to same document (including fragment, and query). 	TokenNameCOMMENT_LINE	Reference to same document (including fragment, and query). 
if	TokenNameif	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
// System.err.println("Base: " + baseURL + "\n" + 	TokenNameCOMMENT_LINE	System.err.println("Base: " + baseURL + "\n" + 
// "Sub: " + urlStr); 	TokenNameCOMMENT_LINE	"Sub: " + urlStr); 
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
// Protocol is only allowed to include -+.a-zA-Z 	TokenNameCOMMENT_LINE	Protocol is only allowed to include -+.a-zA-Z 
// So as soon as we hit something else we know we 	TokenNameCOMMENT_LINE	So as soon as we hit something else we know we 
// are done (if it is a ':' then we have protocol otherwise 	TokenNameCOMMENT_LINE	are done (if it is a ':' then we have protocol otherwise 
// we don't. 	TokenNameCOMMENT_LINE	we don't. 
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'-'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'+'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
'Z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Has a protocol spec... 	TokenNameCOMMENT_LINE	Has a protocol spec... 
protocol	TokenNameIdentifier	 protocol
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
protocol	TokenNameIdentifier	 protocol
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Temporary if we have a protocol then assume absolute 	TokenNameCOMMENT_LINE	Temporary if we have a protocol then assume absolute 
// URL. Technically this is the correct handling but much 	TokenNameCOMMENT_LINE	URL. Technically this is the correct handling but much 
// software supports relative URLs with a protocol that 	TokenNameCOMMENT_LINE	software supports relative URLs with a protocol that 
// matches the base URL's protocol. 	TokenNameCOMMENT_LINE	matches the base URL's protocol. 
// if (true) 	TokenNameCOMMENT_LINE	if (true) 
// return parseURL(urlStr); 	TokenNameCOMMENT_LINE	return parseURL(urlStr); 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
protocol	TokenNameIdentifier	 protocol
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// Different protocols, assume absolute URL ignore base... 	TokenNameCOMMENT_LINE	Different protocols, assume absolute URL ignore base... 
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Same protocols, if char after ':' is a '/' then it's 	TokenNameCOMMENT_LINE	Same protocols, if char after ':' is a '/' then it's 
// still absolute... 	TokenNameCOMMENT_LINE	still absolute... 
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// Just a Protocol??? 	TokenNameCOMMENT_LINE	Just a Protocol??? 
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
// Absolute URL... 	TokenNameCOMMENT_LINE	Absolute URL... 
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Still relative just drop the protocol (we will pick it 	TokenNameCOMMENT_LINE	Still relative just drop the protocol (we will pick it 
// back up from the baseURL later...). 	TokenNameCOMMENT_LINE	back up from the baseURL later...). 
urlStr	TokenNameIdentifier	 url Str
=	TokenNameEQUAL	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Relative but only uses protocol from base 	TokenNameCOMMENT_LINE	Relative but only uses protocol from base 
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getProtocol	TokenNameIdentifier	 get Protocol
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Relative 'absolute' path, uses protocol and authority 	TokenNameCOMMENT_LINE	Relative 'absolute' path, uses protocol and authority 
// (host) from base 	TokenNameCOMMENT_LINE	(host) from base 
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getPortStr	TokenNameIdentifier	 get Port Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
urlStr	TokenNameIdentifier	 url Str
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getPortStr	TokenNameIdentifier	 get Port Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
base	TokenNameIdentifier	 base
+=	TokenNamePLUS_EQUAL	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
base	TokenNameIdentifier	 base
+	TokenNamePLUS	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// No path? well we will treat this as being relative to it's self. 	TokenNameCOMMENT_LINE	No path? well we will treat this as being relative to it's self. 
if	TokenNameif	
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// baseURL is just a filename (in current dir) so use current dir 	TokenNameCOMMENT_LINE	baseURL is just a filename (in current dir) so use current dir 
// as base of new URL. 	TokenNameCOMMENT_LINE	as base of new URL. 
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
else	TokenNameelse	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("Base Path: " + path); 	TokenNameCOMMENT_LINE	System.err.println("Base Path: " + path); 
// System.err.println("Base PortStr: " + baseURL.getPortStr()); 	TokenNameCOMMENT_LINE	System.err.println("Base PortStr: " + baseURL.getPortStr()); 
return	TokenNamereturn	
parseURL	TokenNameIdentifier	 parse URL
(	TokenNameLPAREN	
baseURL	TokenNameIdentifier	 base URL
.	TokenNameDOT	
getPortStr	TokenNameIdentifier	 get Port Str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
path	TokenNameIdentifier	 path
+	TokenNamePLUS	
urlStr	TokenNameIdentifier	 url Str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
