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
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
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
Date	TokenNameIdentifier	 Date
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
feeds	TokenNameIdentifier	 feeds
.	TokenNameDOT	
TrecDocParser	TokenNameIdentifier	 Trec Doc Parser
.	TokenNameDOT	
ParsePathType	TokenNameIdentifier	 Parse Path Type
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
DateTools	TokenNameIdentifier	 Date Tools
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TrecContentSourceTest	TokenNameIdentifier	 Trec Content Source Test
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** A TrecDocMaker which works on a String and not files. */	TokenNameCOMMENT_JAVADOC	 A TrecDocMaker which works on a String and not files. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
extends	TokenNameextends	
TrecContentSource	TokenNameIdentifier	 Trec Content Source
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
boolean	TokenNameboolean	
forever	TokenNameIdentifier	 forever
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
forever	TokenNameIdentifier	 forever
=	TokenNameEQUAL	
forever	TokenNameIdentifier	 forever
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
openNextFile	TokenNameIdentifier	 open Next File
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
,	TokenNameCOMMA	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
!=	TokenNameNOT_EQUAL	
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
++	TokenNamePLUS_PLUS	
iteration	TokenNameIdentifier	 iteration
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
)	TokenNameRPAREN	
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
htmlParser	TokenNameIdentifier	 html Parser
=	TokenNameEQUAL	
new	TokenNamenew	
DemoHTMLParser	TokenNameIdentifier	 Demo HTML Parser
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
DocData	TokenNameIdentifier	 Doc Data
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expName	TokenNameIdentifier	 exp Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expTitle	TokenNameIdentifier	 exp Title
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expBody	TokenNameIdentifier	 exp Body
,	TokenNameCOMMA	
Date	TokenNameIdentifier	 Date
expDate	TokenNameIdentifier	 exp Date
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expName	TokenNameIdentifier	 exp Name
,	TokenNameCOMMA	
dd	TokenNameIdentifier	 dd
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expTitle	TokenNameIdentifier	 exp Title
,	TokenNameCOMMA	
dd	TokenNameIdentifier	 dd
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
.	TokenNameDOT	
getBody	TokenNameIdentifier	 get Body
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
expBody	TokenNameIdentifier	 exp Body
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Date	TokenNameIdentifier	 Date
date	TokenNameIdentifier	 date
=	TokenNameEQUAL	
dd	TokenNameIdentifier	 dd
.	TokenNameDOT	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
DateTools	TokenNameIdentifier	 Date Tools
.	TokenNameDOT	
stringToDate	TokenNameIdentifier	 string To Date
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
.	TokenNameDOT	
getDate	TokenNameIdentifier	 get Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expDate	TokenNameIdentifier	 exp Date
,	TokenNameCOMMA	
date	TokenNameIdentifier	 date
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertNoMoreDataException	TokenNameIdentifier	 assert No More Data Exception
(	TokenNameLPAREN	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
stdm	TokenNameIdentifier	 stdm
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
boolean	TokenNameboolean	
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
stdm	TokenNameIdentifier	 stdm
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thrown	TokenNameIdentifier	 thrown
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Expecting NoMoreDataException"	TokenNameStringLiteral	Expecting NoMoreDataException
,	TokenNameCOMMA	
thrown	TokenNameIdentifier	 thrown
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testOneDocument	TokenNameIdentifier	 test One Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
"<DOC> "	TokenNameStringLiteral	<DOC> 
+	TokenNamePLUS	
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral	<DOCNO>TEST-000</DOCNO> 
+	TokenNamePLUS	
"<DOCHDR> "	TokenNameStringLiteral	<DOCHDR> 
+	TokenNamePLUS	
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral	http://lucene.apache.org.trecdocmaker.test 
+	TokenNamePLUS	
"HTTP/1.1 200 OK "	TokenNameStringLiteral	HTTP/1.1 200 OK 
+	TokenNamePLUS	
"Date: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral	Date: Sun, 11 Jan 2009 08:00:00 GMT 
+	TokenNamePLUS	
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral	Server: Apache/1.3.27 (Unix) 
+	TokenNamePLUS	
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral	Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT 
+	TokenNamePLUS	
"Content-Length: 614 "	TokenNameStringLiteral	Content-Length: 614 
+	TokenNamePLUS	
"Connection: close "	TokenNameStringLiteral	Connection: close 
+	TokenNamePLUS	
"Content-Type: text/html "	TokenNameStringLiteral	Content-Type: text/html 
+	TokenNamePLUS	
"</DOCHDR> "	TokenNameStringLiteral	</DOCHDR> 
+	TokenNamePLUS	
"<html> "	TokenNameStringLiteral	<html> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<head> "	TokenNameStringLiteral	<head> 
+	TokenNamePLUS	
"<title> "	TokenNameStringLiteral	<title> 
+	TokenNamePLUS	
"TEST-000 title "	TokenNameStringLiteral	TEST-000 title 
+	TokenNamePLUS	
"</title> "	TokenNameStringLiteral	</title> 
+	TokenNamePLUS	
"</head> "	TokenNameStringLiteral	</head> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<body> "	TokenNameStringLiteral	<body> 
+	TokenNamePLUS	
"TEST-000 text "	TokenNameStringLiteral	TEST-000 text 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</body> "	TokenNameStringLiteral	</body> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</DOC>"	TokenNameStringLiteral	</DOC>
;	TokenNameSEMICOLON	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocData	TokenNameIdentifier	 Doc Data
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-000_0"	TokenNameStringLiteral	TEST-000_0
,	TokenNameCOMMA	
"TEST-000 title"	TokenNameStringLiteral	TEST-000 title
,	TokenNameCOMMA	
"TEST-000 text"	TokenNameStringLiteral	TEST-000 text
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral	Sun, 11 Jan 2009 08:00:00 GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoMoreDataException	TokenNameIdentifier	 assert No More Data Exception
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTwoDocuments	TokenNameIdentifier	 test Two Documents
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
"<DOC> "	TokenNameStringLiteral	<DOC> 
+	TokenNamePLUS	
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral	<DOCNO>TEST-000</DOCNO> 
+	TokenNamePLUS	
"<DOCHDR> "	TokenNameStringLiteral	<DOCHDR> 
+	TokenNamePLUS	
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral	http://lucene.apache.org.trecdocmaker.test 
+	TokenNamePLUS	
"HTTP/1.1 200 OK "	TokenNameStringLiteral	HTTP/1.1 200 OK 
+	TokenNamePLUS	
"Date: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral	Date: Sun, 11 Jan 2009 08:00:00 GMT 
+	TokenNamePLUS	
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral	Server: Apache/1.3.27 (Unix) 
+	TokenNamePLUS	
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral	Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT 
+	TokenNamePLUS	
"Content-Length: 614 "	TokenNameStringLiteral	Content-Length: 614 
+	TokenNamePLUS	
"Connection: close "	TokenNameStringLiteral	Connection: close 
+	TokenNamePLUS	
"Content-Type: text/html "	TokenNameStringLiteral	Content-Type: text/html 
+	TokenNamePLUS	
"</DOCHDR> "	TokenNameStringLiteral	</DOCHDR> 
+	TokenNamePLUS	
"<html> "	TokenNameStringLiteral	<html> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<head> "	TokenNameStringLiteral	<head> 
+	TokenNamePLUS	
"<title> "	TokenNameStringLiteral	<title> 
+	TokenNamePLUS	
"TEST-000 title "	TokenNameStringLiteral	TEST-000 title 
+	TokenNamePLUS	
"</title> "	TokenNameStringLiteral	</title> 
+	TokenNamePLUS	
"</head> "	TokenNameStringLiteral	</head> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<body> "	TokenNameStringLiteral	<body> 
+	TokenNamePLUS	
"TEST-000 text "	TokenNameStringLiteral	TEST-000 text 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</body> "	TokenNameStringLiteral	</body> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</DOC> "	TokenNameStringLiteral	</DOC> 
+	TokenNamePLUS	
"<DOC> "	TokenNameStringLiteral	<DOC> 
+	TokenNamePLUS	
"<DOCNO>TEST-001</DOCNO> "	TokenNameStringLiteral	<DOCNO>TEST-001</DOCNO> 
+	TokenNamePLUS	
"<DOCHDR> "	TokenNameStringLiteral	<DOCHDR> 
+	TokenNamePLUS	
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral	http://lucene.apache.org.trecdocmaker.test 
+	TokenNamePLUS	
"HTTP/1.1 200 OK "	TokenNameStringLiteral	HTTP/1.1 200 OK 
+	TokenNamePLUS	
"Date: Sun, 11 Jan 2009 08:01:00 GMT "	TokenNameStringLiteral	Date: Sun, 11 Jan 2009 08:01:00 GMT 
+	TokenNamePLUS	
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral	Server: Apache/1.3.27 (Unix) 
+	TokenNamePLUS	
"Last-Modified: Sun, 11 Jan 2008 08:01:00 GMT "	TokenNameStringLiteral	Last-Modified: Sun, 11 Jan 2008 08:01:00 GMT 
+	TokenNamePLUS	
"Content-Length: 614 "	TokenNameStringLiteral	Content-Length: 614 
+	TokenNamePLUS	
"Connection: close "	TokenNameStringLiteral	Connection: close 
+	TokenNamePLUS	
"Content-Type: text/html "	TokenNameStringLiteral	Content-Type: text/html 
+	TokenNamePLUS	
"</DOCHDR> "	TokenNameStringLiteral	</DOCHDR> 
+	TokenNamePLUS	
"<html> "	TokenNameStringLiteral	<html> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<head> "	TokenNameStringLiteral	<head> 
+	TokenNamePLUS	
"<title> "	TokenNameStringLiteral	<title> 
+	TokenNamePLUS	
"TEST-001 title "	TokenNameStringLiteral	TEST-001 title 
+	TokenNamePLUS	
"</title> "	TokenNameStringLiteral	</title> 
+	TokenNamePLUS	
"</head> "	TokenNameStringLiteral	</head> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<body> "	TokenNameStringLiteral	<body> 
+	TokenNamePLUS	
"TEST-001 text "	TokenNameStringLiteral	TEST-001 text 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</body> "	TokenNameStringLiteral	</body> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</DOC>"	TokenNameStringLiteral	</DOC>
;	TokenNameSEMICOLON	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocData	TokenNameIdentifier	 Doc Data
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-000_0"	TokenNameStringLiteral	TEST-000_0
,	TokenNameCOMMA	
"TEST-000 title"	TokenNameStringLiteral	TEST-000 title
,	TokenNameCOMMA	
"TEST-000 text"	TokenNameStringLiteral	TEST-000 text
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral	Sun, 11 Jan 2009 08:00:00 GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-001_0"	TokenNameStringLiteral	TEST-001_0
,	TokenNameCOMMA	
"TEST-001 title"	TokenNameStringLiteral	TEST-001 title
,	TokenNameCOMMA	
"TEST-001 text"	TokenNameStringLiteral	TEST-001 text
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"Sun, 11 Jan 2009 08:01:00 GMT"	TokenNameStringLiteral	Sun, 11 Jan 2009 08:01:00 GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoMoreDataException	TokenNameIdentifier	 assert No More Data Exception
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If a Date: attribute is missing, make sure the document is not skipped, but 	TokenNameCOMMENT_LINE	If a Date: attribute is missing, make sure the document is not skipped, but 
// rather that null Data is assigned. 	TokenNameCOMMENT_LINE	rather that null Data is assigned. 
public	TokenNamepublic	
void	TokenNamevoid	
testMissingDate	TokenNameIdentifier	 test Missing Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
"<DOC> "	TokenNameStringLiteral	<DOC> 
+	TokenNamePLUS	
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral	<DOCNO>TEST-000</DOCNO> 
+	TokenNamePLUS	
"<DOCHDR> "	TokenNameStringLiteral	<DOCHDR> 
+	TokenNamePLUS	
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral	http://lucene.apache.org.trecdocmaker.test 
+	TokenNamePLUS	
"HTTP/1.1 200 OK "	TokenNameStringLiteral	HTTP/1.1 200 OK 
+	TokenNamePLUS	
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral	Server: Apache/1.3.27 (Unix) 
+	TokenNamePLUS	
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral	Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT 
+	TokenNamePLUS	
"Content-Length: 614 "	TokenNameStringLiteral	Content-Length: 614 
+	TokenNamePLUS	
"Connection: close "	TokenNameStringLiteral	Connection: close 
+	TokenNamePLUS	
"Content-Type: text/html "	TokenNameStringLiteral	Content-Type: text/html 
+	TokenNamePLUS	
"</DOCHDR> "	TokenNameStringLiteral	</DOCHDR> 
+	TokenNamePLUS	
"<html> "	TokenNameStringLiteral	<html> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<head> "	TokenNameStringLiteral	<head> 
+	TokenNamePLUS	
"<title> "	TokenNameStringLiteral	<title> 
+	TokenNamePLUS	
"TEST-000 title "	TokenNameStringLiteral	TEST-000 title 
+	TokenNamePLUS	
"</title> "	TokenNameStringLiteral	</title> 
+	TokenNamePLUS	
"</head> "	TokenNameStringLiteral	</head> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<body> "	TokenNameStringLiteral	<body> 
+	TokenNamePLUS	
"TEST-000 text "	TokenNameStringLiteral	TEST-000 text 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</body> "	TokenNameStringLiteral	</body> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</DOC> "	TokenNameStringLiteral	</DOC> 
+	TokenNamePLUS	
"<DOC> "	TokenNameStringLiteral	<DOC> 
+	TokenNamePLUS	
"<DOCNO>TEST-001</DOCNO> "	TokenNameStringLiteral	<DOCNO>TEST-001</DOCNO> 
+	TokenNamePLUS	
"<DOCHDR> "	TokenNameStringLiteral	<DOCHDR> 
+	TokenNamePLUS	
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral	http://lucene.apache.org.trecdocmaker.test 
+	TokenNamePLUS	
"HTTP/1.1 200 OK "	TokenNameStringLiteral	HTTP/1.1 200 OK 
+	TokenNamePLUS	
"Date: Sun, 11 Jan 2009 08:01:00 GMT "	TokenNameStringLiteral	Date: Sun, 11 Jan 2009 08:01:00 GMT 
+	TokenNamePLUS	
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral	Server: Apache/1.3.27 (Unix) 
+	TokenNamePLUS	
"Last-Modified: Sun, 11 Jan 2009 08:01:00 GMT "	TokenNameStringLiteral	Last-Modified: Sun, 11 Jan 2009 08:01:00 GMT 
+	TokenNamePLUS	
"Content-Length: 614 "	TokenNameStringLiteral	Content-Length: 614 
+	TokenNamePLUS	
"Connection: close "	TokenNameStringLiteral	Connection: close 
+	TokenNamePLUS	
"Content-Type: text/html "	TokenNameStringLiteral	Content-Type: text/html 
+	TokenNamePLUS	
"</DOCHDR> "	TokenNameStringLiteral	</DOCHDR> 
+	TokenNamePLUS	
"<html> "	TokenNameStringLiteral	<html> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<head> "	TokenNameStringLiteral	<head> 
+	TokenNamePLUS	
"<title> "	TokenNameStringLiteral	<title> 
+	TokenNamePLUS	
"TEST-001 title "	TokenNameStringLiteral	TEST-001 title 
+	TokenNamePLUS	
"</title> "	TokenNameStringLiteral	</title> 
+	TokenNamePLUS	
"</head> "	TokenNameStringLiteral	</head> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<body> "	TokenNameStringLiteral	<body> 
+	TokenNamePLUS	
"TEST-001 text "	TokenNameStringLiteral	TEST-001 text 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</body> "	TokenNameStringLiteral	</body> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</DOC>"	TokenNameStringLiteral	</DOC>
;	TokenNameSEMICOLON	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocData	TokenNameIdentifier	 Doc Data
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-000_0"	TokenNameStringLiteral	TEST-000_0
,	TokenNameCOMMA	
"TEST-000 title"	TokenNameStringLiteral	TEST-000 title
,	TokenNameCOMMA	
"TEST-000 text"	TokenNameStringLiteral	TEST-000 text
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-001_0"	TokenNameStringLiteral	TEST-001_0
,	TokenNameCOMMA	
"TEST-001 title"	TokenNameStringLiteral	TEST-001 title
,	TokenNameCOMMA	
"TEST-001 text"	TokenNameStringLiteral	TEST-001 text
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"Sun, 11 Jan 2009 08:01:00 GMT"	TokenNameStringLiteral	Sun, 11 Jan 2009 08:01:00 GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoMoreDataException	TokenNameIdentifier	 assert No More Data Exception
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// When a 'bad date' is input (unparsable date), make sure the DocData date is 	TokenNameCOMMENT_LINE	When a 'bad date' is input (unparsable date), make sure the DocData date is 
// assigned null. 	TokenNameCOMMENT_LINE	assigned null. 
public	TokenNamepublic	
void	TokenNamevoid	
testBadDate	TokenNameIdentifier	 test Bad Date
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
"<DOC> "	TokenNameStringLiteral	<DOC> 
+	TokenNamePLUS	
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral	<DOCNO>TEST-000</DOCNO> 
+	TokenNamePLUS	
"<DOCHDR> "	TokenNameStringLiteral	<DOCHDR> 
+	TokenNamePLUS	
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral	http://lucene.apache.org.trecdocmaker.test 
+	TokenNamePLUS	
"HTTP/1.1 200 OK "	TokenNameStringLiteral	HTTP/1.1 200 OK 
+	TokenNamePLUS	
"Date: Bad Date "	TokenNameStringLiteral	Date: Bad Date 
+	TokenNamePLUS	
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral	Server: Apache/1.3.27 (Unix) 
+	TokenNamePLUS	
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral	Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT 
+	TokenNamePLUS	
"Content-Length: 614 "	TokenNameStringLiteral	Content-Length: 614 
+	TokenNamePLUS	
"Connection: close "	TokenNameStringLiteral	Connection: close 
+	TokenNamePLUS	
"Content-Type: text/html "	TokenNameStringLiteral	Content-Type: text/html 
+	TokenNamePLUS	
"</DOCHDR> "	TokenNameStringLiteral	</DOCHDR> 
+	TokenNamePLUS	
"<html> "	TokenNameStringLiteral	<html> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<head> "	TokenNameStringLiteral	<head> 
+	TokenNamePLUS	
"<title> "	TokenNameStringLiteral	<title> 
+	TokenNamePLUS	
"TEST-000 title "	TokenNameStringLiteral	TEST-000 title 
+	TokenNamePLUS	
"</title> "	TokenNameStringLiteral	</title> 
+	TokenNamePLUS	
"</head> "	TokenNameStringLiteral	</head> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<body> "	TokenNameStringLiteral	<body> 
+	TokenNamePLUS	
"TEST-000 text "	TokenNameStringLiteral	TEST-000 text 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</body> "	TokenNameStringLiteral	</body> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</DOC>"	TokenNameStringLiteral	</DOC>
;	TokenNameSEMICOLON	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocData	TokenNameIdentifier	 Doc Data
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-000_0"	TokenNameStringLiteral	TEST-000_0
,	TokenNameCOMMA	
"TEST-000 title"	TokenNameStringLiteral	TEST-000 title
,	TokenNameCOMMA	
"TEST-000 text"	TokenNameStringLiteral	TEST-000 text
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNoMoreDataException	TokenNameIdentifier	 assert No More Data Exception
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testForever	TokenNameIdentifier	 test Forever
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
"<DOC> "	TokenNameStringLiteral	<DOC> 
+	TokenNamePLUS	
"<DOCNO>TEST-000</DOCNO> "	TokenNameStringLiteral	<DOCNO>TEST-000</DOCNO> 
+	TokenNamePLUS	
"<DOCHDR> "	TokenNameStringLiteral	<DOCHDR> 
+	TokenNamePLUS	
"http://lucene.apache.org.trecdocmaker.test "	TokenNameStringLiteral	http://lucene.apache.org.trecdocmaker.test 
+	TokenNamePLUS	
"HTTP/1.1 200 OK "	TokenNameStringLiteral	HTTP/1.1 200 OK 
+	TokenNamePLUS	
"Date: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral	Date: Sun, 11 Jan 2009 08:00:00 GMT 
+	TokenNamePLUS	
"Server: Apache/1.3.27 (Unix) "	TokenNameStringLiteral	Server: Apache/1.3.27 (Unix) 
+	TokenNamePLUS	
"Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT "	TokenNameStringLiteral	Last-Modified: Sun, 11 Jan 2009 08:00:00 GMT 
+	TokenNamePLUS	
"Content-Length: 614 "	TokenNameStringLiteral	Content-Length: 614 
+	TokenNamePLUS	
"Connection: close "	TokenNameStringLiteral	Connection: close 
+	TokenNamePLUS	
"Content-Type: text/html "	TokenNameStringLiteral	Content-Type: text/html 
+	TokenNamePLUS	
"</DOCHDR> "	TokenNameStringLiteral	</DOCHDR> 
+	TokenNamePLUS	
"<html> "	TokenNameStringLiteral	<html> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<head> "	TokenNameStringLiteral	<head> 
+	TokenNamePLUS	
"<title> "	TokenNameStringLiteral	<title> 
+	TokenNamePLUS	
"TEST-000 title "	TokenNameStringLiteral	TEST-000 title 
+	TokenNamePLUS	
"</title> "	TokenNameStringLiteral	</title> 
+	TokenNamePLUS	
"</head> "	TokenNameStringLiteral	</head> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"<body> "	TokenNameStringLiteral	<body> 
+	TokenNamePLUS	
"TEST-000 text "	TokenNameStringLiteral	TEST-000 text 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</body> "	TokenNameStringLiteral	</body> 
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
"</DOC>"	TokenNameStringLiteral	</DOC>
;	TokenNameSEMICOLON	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
StringableTrecSource	TokenNameIdentifier	 Stringable Trec Source
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocData	TokenNameIdentifier	 Doc Data
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-000_0"	TokenNameStringLiteral	TEST-000_0
,	TokenNameCOMMA	
"TEST-000 title"	TokenNameStringLiteral	TEST-000 title
,	TokenNameCOMMA	
"TEST-000 text"	TokenNameStringLiteral	TEST-000 text
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral	Sun, 11 Jan 2009 08:00:00 GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// same document, but the second iteration changes the name. 	TokenNameCOMMENT_LINE	same document, but the second iteration changes the name. 
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-000_1"	TokenNameStringLiteral	TEST-000_1
,	TokenNameCOMMA	
"TEST-000 title"	TokenNameStringLiteral	TEST-000 title
,	TokenNameCOMMA	
"TEST-000 text"	TokenNameStringLiteral	TEST-000 text
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral	Sun, 11 Jan 2009 08:00:00 GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Don't test that NoMoreDataException is thrown, since the forever flag is 	TokenNameCOMMENT_LINE	Don't test that NoMoreDataException is thrown, since the forever flag is 
// turned on. 	TokenNameCOMMENT_LINE	turned on. 
}	TokenNameRBRACE	
/** * Open a trec content source over a directory with files of all trec path types and all * supported formats - bzip, gzip, txt. */	TokenNameCOMMENT_JAVADOC	 Open a trec content source over a directory with files of all trec path types and all supported formats - bzip, gzip, txt. 
public	TokenNamepublic	
void	TokenNamevoid	
testTrecFeedDirAllTypes	TokenNameIdentifier	 test Trec Feed Dir All Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
File	TokenNameIdentifier	 File
dataDir	TokenNameIdentifier	 data Dir
=	TokenNameEQUAL	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
getTempDir	TokenNameIdentifier	 get Temp Dir
(	TokenNameLPAREN	
"trecFeedAllTypes"	TokenNameStringLiteral	trecFeedAllTypes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
unzip	TokenNameIdentifier	 unzip
(	TokenNameLPAREN	
getDataFile	TokenNameIdentifier	 get Data File
(	TokenNameLPAREN	
"trecdocs.zip"	TokenNameStringLiteral	trecdocs.zip
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dataDir	TokenNameIdentifier	 data Dir
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TrecContentSource	TokenNameIdentifier	 Trec Content Source
tcs	TokenNameIdentifier	 tcs
=	TokenNameEQUAL	
new	TokenNamenew	
TrecContentSource	TokenNameIdentifier	 Trec Content Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
props	TokenNameIdentifier	 props
=	TokenNameEQUAL	
new	TokenNamenew	
Properties	TokenNameIdentifier	 Properties
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"print.props"	TokenNameStringLiteral	print.props
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"content.source.verbose"	TokenNameStringLiteral	content.source.verbose
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"content.source.excludeIteration"	TokenNameStringLiteral	content.source.excludeIteration
,	TokenNameCOMMA	
"true"	TokenNameStringLiteral	true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"doc.maker.forever"	TokenNameStringLiteral	doc.maker.forever
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"docs.dir"	TokenNameStringLiteral	docs.dir
,	TokenNameCOMMA	
dataDir	TokenNameIdentifier	 data Dir
.	TokenNameDOT	
getCanonicalPath	TokenNameIdentifier	 get Canonical Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
replace	TokenNameIdentifier	 replace
(	TokenNameLPAREN	
'\\'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"trec.doc.parser"	TokenNameStringLiteral	trec.doc.parser
,	TokenNameCOMMA	
TrecParserByPath	TokenNameIdentifier	 Trec Parser By Path
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
props	TokenNameIdentifier	 props
.	TokenNameDOT	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
"content.source.forever"	TokenNameStringLiteral	content.source.forever
,	TokenNameCOMMA	
"false"	TokenNameStringLiteral	false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
new	TokenNamenew	
Config	TokenNameIdentifier	 Config
(	TokenNameLPAREN	
props	TokenNameIdentifier	 props
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DocData	TokenNameIdentifier	 Doc Data
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
new	TokenNamenew	
DocData	TokenNameIdentifier	 Doc Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
gotExpectedException	TokenNameIdentifier	 got Expected Exception
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
ParsePathType	TokenNameIdentifier	 Parse Path Type
>	TokenNameGREATER	
unseenTypes	TokenNameIdentifier	 unseen Types
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
ParsePathType	TokenNameIdentifier	 Parse Path Type
>	TokenNameGREATER	
(	TokenNameLPAREN	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
ParsePathType	TokenNameIdentifier	 Parse Path Type
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// arbiterary limit to prevent looping forever in case of test failure 	TokenNameCOMMENT_LINE	arbiterary limit to prevent looping forever in case of test failure 
dd	TokenNameIdentifier	 dd
=	TokenNameEQUAL	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
getNextDocData	TokenNameIdentifier	 get Next Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"doc data "	TokenNameStringLiteral	doc data 
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
" should not be null!"	TokenNameStringLiteral	 should not be null!
,	TokenNameCOMMA	
dd	TokenNameIdentifier	 dd
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unseenTypes	TokenNameIdentifier	 unseen Types
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
currPathType	TokenNameIdentifier	 curr Path Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
currPathType	TokenNameIdentifier	 curr Path Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
GOV2	TokenNameIdentifier	 GO V2
:	TokenNameCOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-000"	TokenNameStringLiteral	TEST-000
,	TokenNameCOMMA	
"TEST-000 title"	TokenNameStringLiteral	TEST-000 title
,	TokenNameCOMMA	
"TEST-000 text"	TokenNameStringLiteral	TEST-000 text
,	TokenNameCOMMA	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"Sun, 11 Jan 2009 08:00:00 GMT"	TokenNameStringLiteral	Sun, 11 Jan 2009 08:00:00 GMT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FBIS	TokenNameIdentifier	 FBIS
:	TokenNameCOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-001"	TokenNameStringLiteral	TEST-001
,	TokenNameCOMMA	
"TEST-001 Title"	TokenNameStringLiteral	TEST-001 Title
,	TokenNameCOMMA	
"TEST-001 text"	TokenNameStringLiteral	TEST-001 text
,	TokenNameCOMMA	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"1 January 1991"	TokenNameStringLiteral	1 January 1991
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FR94	TokenNameIdentifier	 F R94
:	TokenNameCOLON	
// no title extraction in this source for now 	TokenNameCOMMENT_LINE	no title extraction in this source for now 
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-002"	TokenNameStringLiteral	TEST-002
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
"DEPARTMENT OF SOMETHING"	TokenNameStringLiteral	DEPARTMENT OF SOMETHING
,	TokenNameCOMMA	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"February 3, 1994"	TokenNameStringLiteral	February 3, 1994
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
FT	TokenNameIdentifier	 FT
:	TokenNameCOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-003"	TokenNameStringLiteral	TEST-003
,	TokenNameCOMMA	
"Test-003 title"	TokenNameStringLiteral	Test-003 title
,	TokenNameCOMMA	
"Some pub text"	TokenNameStringLiteral	Some pub text
,	TokenNameCOMMA	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"980424"	TokenNameStringLiteral	980424
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
LATIMES	TokenNameIdentifier	 LATIMES
:	TokenNameCOLON	
assertDocData	TokenNameIdentifier	 assert Doc Data
(	TokenNameLPAREN	
dd	TokenNameIdentifier	 dd
,	TokenNameCOMMA	
"TEST-004"	TokenNameStringLiteral	TEST-004
,	TokenNameCOMMA	
"Test-004 Title"	TokenNameStringLiteral	Test-004 Title
,	TokenNameCOMMA	
"Some paragraph"	TokenNameStringLiteral	Some paragraph
,	TokenNameCOMMA	
tcs	TokenNameIdentifier	 tcs
.	TokenNameDOT	
parseDate	TokenNameIdentifier	 parse Date
(	TokenNameLPAREN	
"January 17, 1997, Sunday"	TokenNameStringLiteral	January 17, 1997, Sunday
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Should never get here!"	TokenNameStringLiteral	Should never get here!
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoMoreDataException	TokenNameIdentifier	 No More Data Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
gotExpectedException	TokenNameIdentifier	 got Expected Exception
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Should have gotten NoMoreDataException!"	TokenNameStringLiteral	Should have gotten NoMoreDataException!
,	TokenNameCOMMA	
gotExpectedException	TokenNameIdentifier	 got Expected Exception
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrong number of documents created by source!"	TokenNameStringLiteral	Wrong number of documents created by source!
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Did not see all types!"	TokenNameStringLiteral	Did not see all types!
,	TokenNameCOMMA	
unseenTypes	TokenNameIdentifier	 unseen Types
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
