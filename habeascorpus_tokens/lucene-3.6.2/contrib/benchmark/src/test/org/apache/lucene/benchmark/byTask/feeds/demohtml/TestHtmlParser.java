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
.	TokenNameDOT	
demohtml	TokenNameIdentifier	 demohtml
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestHtmlParser	TokenNameIdentifier	 Test Html Parser
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testUnicode	TokenNameIdentifier	 test Unicode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><body>汉语</body></html>"	TokenNameStringLiteral	<html><body>汉语</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertReadsTo	TokenNameIdentifier	 assert Reads To
(	TokenNameLPAREN	
"汉语"	TokenNameStringLiteral	汉语
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEntities	TokenNameIdentifier	 test Entities
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><body>&#x6C49;&#x8BED;&yen;</body></html>"	TokenNameStringLiteral	<html><body>&#x6C49;&#x8BED;&yen;</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertReadsTo	TokenNameIdentifier	 assert Reads To
(	TokenNameLPAREN	
"汉语¥"	TokenNameStringLiteral	汉语¥
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testComments	TokenNameIdentifier	 test Comments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><body>foo<!-- bar --><! baz --></body></html>"	TokenNameStringLiteral	<html><body>foo<!-- bar --><! baz --></body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertReadsTo	TokenNameIdentifier	 assert Reads To
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testScript	TokenNameIdentifier	 test Script
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><body><script type="text/javascript">"	TokenNameStringLiteral	<html><body><script type="text/javascript">
+	TokenNamePLUS	
"document.write("test")</script>foo</body></html>"	TokenNameStringLiteral	document.write("test")</script>foo</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertReadsTo	TokenNameIdentifier	 assert Reads To
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testStyle	TokenNameIdentifier	 test Style
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><head><style type="text/css">"	TokenNameStringLiteral	<html><head><style type="text/css">
+	TokenNamePLUS	
"body{background-color:blue;}</style>"	TokenNameStringLiteral	body{background-color:blue;}</style>
+	TokenNamePLUS	
"</head><body>foo</body></html>"	TokenNameStringLiteral	</head><body>foo</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertReadsTo	TokenNameIdentifier	 assert Reads To
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testDoctype	TokenNameIdentifier	 test Doctype
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<!DOCTYPE HTML PUBLIC "	TokenNameStringLiteral	<!DOCTYPE HTML PUBLIC 
+	TokenNamePLUS	
""-//W3C//DTD HTML 4.01 Transitional//EN""	TokenNameStringLiteral	"-//W3C//DTD HTML 4.01 Transitional//EN"
+	TokenNamePLUS	
""http://www.w3.org/TR/html4/loose.dtd">"	TokenNameStringLiteral	"http://www.w3.org/TR/html4/loose.dtd">
+	TokenNamePLUS	
"<html><body>foo</body></html>"	TokenNameStringLiteral	<html><body>foo</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertReadsTo	TokenNameIdentifier	 assert Reads To
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMeta	TokenNameIdentifier	 test Meta
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><head>"	TokenNameStringLiteral	<html><head>
+	TokenNamePLUS	
"<meta name="a" content="1" />"	TokenNameStringLiteral	<meta name="a" content="1" />
+	TokenNamePLUS	
"<meta name="b" content="2" />"	TokenNameStringLiteral	<meta name="b" content="2" />
+	TokenNamePLUS	
"<meta name="keywords" content="this is a test" />"	TokenNameStringLiteral	<meta name="keywords" content="this is a test" />
+	TokenNamePLUS	
"<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />"	TokenNameStringLiteral	<meta http-equiv="Content-Type" content="text/html;charset=UTF-8" />
+	TokenNamePLUS	
"</head><body>foobar</body></html>"	TokenNameStringLiteral	</head><body>foobar</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Properties	TokenNameIdentifier	 Properties
tags	TokenNameIdentifier	 tags
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getMetaTags	TokenNameIdentifier	 get Meta Tags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"1"	TokenNameStringLiteral	1
,	TokenNameCOMMA	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"2"	TokenNameStringLiteral	2
,	TokenNameCOMMA	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"b"	TokenNameStringLiteral	b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"this is a test"	TokenNameStringLiteral	this is a test
,	TokenNameCOMMA	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"keywords"	TokenNameStringLiteral	keywords
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"text/html;charset=utf-8"	TokenNameStringLiteral	text/html;charset=utf-8
,	TokenNameCOMMA	
tags	TokenNameIdentifier	 tags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"content-type"	TokenNameStringLiteral	content-type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testTitle	TokenNameIdentifier	 test Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><head><TITLE>foo</TITLE><head><body>bar</body></html>"	TokenNameStringLiteral	<html><head><TITLE>foo</TITLE><head><body>bar</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getTitle	TokenNameIdentifier	 get Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testSummary	TokenNameIdentifier	 test Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><head><TITLE>foo</TITLE><head><body>"	TokenNameStringLiteral	<html><head><TITLE>foo</TITLE><head><body>
+	TokenNamePLUS	
"Summarize me. Summarize me. Summarize me. Summarize me. "	TokenNameStringLiteral	Summarize me. Summarize me. Summarize me. Summarize me. 
+	TokenNamePLUS	
"Summarize me. Summarize me. Summarize me. Summarize me. "	TokenNameStringLiteral	Summarize me. Summarize me. Summarize me. Summarize me. 
+	TokenNamePLUS	
"Summarize me. Summarize me. Summarize me. Summarize me. "	TokenNameStringLiteral	Summarize me. Summarize me. Summarize me. Summarize me. 
+	TokenNamePLUS	
"Summarize me. Summarize me. Summarize me. Summarize me. "	TokenNameStringLiteral	Summarize me. Summarize me. Summarize me. Summarize me. 
+	TokenNamePLUS	
"Summarize me. Summarize me. Summarize me. Summarize me. "	TokenNameStringLiteral	Summarize me. Summarize me. Summarize me. Summarize me. 
+	TokenNamePLUS	
"Summarize me. Summarize me. Summarize me. Summarize me. "	TokenNameStringLiteral	Summarize me. Summarize me. Summarize me. Summarize me. 
+	TokenNamePLUS	
"Summarize me. Summarize me. Summarize me. Summarize me. "	TokenNameStringLiteral	Summarize me. Summarize me. Summarize me. Summarize me. 
+	TokenNamePLUS	
"</body></html>"	TokenNameStringLiteral	</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
200	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getSummary	TokenNameIdentifier	 get Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-590 	TokenNameCOMMENT_LINE	LUCENE-590 
public	TokenNamepublic	
void	TokenNamevoid	
testSummaryTitle	TokenNameIdentifier	 test Summary Title
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><head><title>Summary</title></head><body>Summary of the document</body></html>"	TokenNameStringLiteral	<html><head><title>Summary</title></head><body>Summary of the document</body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Summary of the document"	TokenNameStringLiteral	Summary of the document
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getSummary	TokenNameIdentifier	 get Summary
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-2246 	TokenNameCOMMENT_LINE	LUCENE-2246 
public	TokenNamepublic	
void	TokenNamevoid	
testTurkish	TokenNameIdentifier	 test Turkish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"<html><body>"	TokenNameStringLiteral	<html><body>
+	TokenNamePLUS	
"<IMG SRC="../images/head.jpg" WIDTH=570 HEIGHT=47 BORDER=0 ALT="ş">"	TokenNameStringLiteral	<IMG SRC="../images/head.jpg" WIDTH=570 HEIGHT=47 BORDER=0 ALT="ş">
+	TokenNamePLUS	
"<a title="(ııı)"></body></html>"	TokenNameStringLiteral	<a title="(ııı)"></body></html>
;	TokenNameSEMICOLON	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
HTMLParser	TokenNameIdentifier	 HTML Parser
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertReadsTo	TokenNameIdentifier	 assert Reads To
(	TokenNameLPAREN	
"[ş]"	TokenNameStringLiteral	[ş]
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertReadsTo	TokenNameIdentifier	 assert Reads To
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
HTMLParser	TokenNameIdentifier	 HTML Parser
parser	TokenNameIdentifier	 parser
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
getReader	TokenNameIdentifier	 get Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
