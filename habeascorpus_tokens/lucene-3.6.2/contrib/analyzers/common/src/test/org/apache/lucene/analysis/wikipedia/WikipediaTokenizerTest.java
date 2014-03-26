/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
wikipedia	TokenNameIdentifier	 wikipedia
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Tokenizer	TokenNameIdentifier	 Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
wikipedia	TokenNameIdentifier	 wikipedia
.	TokenNameDOT	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Basic Tests for {@link WikipediaTokenizer} **/	TokenNameCOMMENT_JAVADOC	 Basic Tests for {@link WikipediaTokenizer} *
public	TokenNamepublic	
class	TokenNameclass	
WikipediaTokenizerTest	TokenNameIdentifier	 Wikipedia Tokenizer Test
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
LINK_PHRASES	TokenNameIdentifier	 LINK  PHRASES
=	TokenNameEQUAL	
"click [[link here again]] click [http://lucene.apache.org here again] [[Category:a b c d]]"	TokenNameStringLiteral	click [[link here again]] click [http://lucene.apache.org here again] [[Category:a b c d]]
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
testSimple	TokenNameIdentifier	 test Simple
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
"This is a [[Category:foo]]"	TokenNameStringLiteral	This is a [[Category:foo]]
;	TokenNameSEMICOLON	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"This"	TokenNameStringLiteral	This
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
21	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
4	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
9	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
24	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testHandwritten	TokenNameIdentifier	 test Handwritten
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// make sure all tokens are in only one type 	TokenNameCOMMENT_LINE	make sure all tokens are in only one type 
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"[[link]] This is a [[Category:foo]] Category This is a linked [[:Category:bar none withstanding]] "	TokenNameStringLiteral	[[link]] This is a [[Category:foo]] Category This is a linked [[:Category:bar none withstanding]] 
+	TokenNamePLUS	
"Category This is (parens) This is a [[link]] This is an external URL [http://lucene.apache.org] "	TokenNameStringLiteral	Category This is (parens) This is a [[link]] This is an external URL [http://lucene.apache.org] 
+	TokenNamePLUS	
"Here is ''italics'' and ''more italics'', '''bold''' and '''''five quotes''''' "	TokenNameStringLiteral	Here is ''italics'' and ''more italics'', '''bold''' and '''''five quotes''''' 
+	TokenNamePLUS	
" This is a [[link|display info]] This is a period. Here is $3.25 and here is 3.50. Here's Johnny. "	TokenNameStringLiteral	 This is a [[link|display info]] This is a period. Here is $3.25 and here is 3.50. Here's Johnny. 
+	TokenNamePLUS	
"==heading== ===sub head=== followed by some text [[Category:blah| ]] "	TokenNameStringLiteral	==heading== ===sub head=== followed by some text [[Category:blah| ]] 
+	TokenNamePLUS	
"''[[Category:ital_cat]]'' here is some that is ''italics [[Category:foo]] but is never closed."	TokenNameStringLiteral	''[[Category:ital_cat]]'' here is some that is ''italics [[Category:foo]] but is never closed.
+	TokenNamePLUS	
"'''same [[Category:foo]] goes for this '''''and2 [[Category:foo]] and this"	TokenNameStringLiteral	'''same [[Category:foo]] goes for this '''''and2 [[Category:foo]] and this
+	TokenNamePLUS	
" [http://foo.boo.com/test/test/ Test Test] [http://foo.boo.com/test/test/test.html Test Test]"	TokenNameStringLiteral	 [http://foo.boo.com/test/test/ Test Test] [http://foo.boo.com/test/test/test.html Test Test]
+	TokenNamePLUS	
" [http://foo.boo.com/test/test/test.html?g=b&c=d Test Test] <ref>Citation</ref> <sup>martian</sup> <span class="glue">code</span>"	TokenNameStringLiteral	 [http://foo.boo.com/test/test/test.html?g=b&c=d Test Test] <ref>Citation</ref> <sup>martian</sup> <span class="glue">code</span>
;	TokenNameSEMICOLON	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"link"	TokenNameStringLiteral	link
,	TokenNameCOMMA	
"This"	TokenNameStringLiteral	This
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"Category"	TokenNameStringLiteral	Category
,	TokenNameCOMMA	
"This"	TokenNameStringLiteral	This
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"linked"	TokenNameStringLiteral	linked
,	TokenNameCOMMA	
"bar"	TokenNameStringLiteral	bar
,	TokenNameCOMMA	
"none"	TokenNameStringLiteral	none
,	TokenNameCOMMA	
"withstanding"	TokenNameStringLiteral	withstanding
,	TokenNameCOMMA	
"Category"	TokenNameStringLiteral	Category
,	TokenNameCOMMA	
"This"	TokenNameStringLiteral	This
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"parens"	TokenNameStringLiteral	parens
,	TokenNameCOMMA	
"This"	TokenNameStringLiteral	This
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"link"	TokenNameStringLiteral	link
,	TokenNameCOMMA	
"This"	TokenNameStringLiteral	This
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"an"	TokenNameStringLiteral	an
,	TokenNameCOMMA	
"external"	TokenNameStringLiteral	external
,	TokenNameCOMMA	
"URL"	TokenNameStringLiteral	URL
,	TokenNameCOMMA	
"http://lucene.apache.org"	TokenNameStringLiteral	http://lucene.apache.org
,	TokenNameCOMMA	
"Here"	TokenNameStringLiteral	Here
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"italics"	TokenNameStringLiteral	italics
,	TokenNameCOMMA	
"and"	TokenNameStringLiteral	and
,	TokenNameCOMMA	
"more"	TokenNameStringLiteral	more
,	TokenNameCOMMA	
"italics"	TokenNameStringLiteral	italics
,	TokenNameCOMMA	
"bold"	TokenNameStringLiteral	bold
,	TokenNameCOMMA	
"and"	TokenNameStringLiteral	and
,	TokenNameCOMMA	
"five"	TokenNameStringLiteral	five
,	TokenNameCOMMA	
"quotes"	TokenNameStringLiteral	quotes
,	TokenNameCOMMA	
"This"	TokenNameStringLiteral	This
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"link"	TokenNameStringLiteral	link
,	TokenNameCOMMA	
"display"	TokenNameStringLiteral	display
,	TokenNameCOMMA	
"info"	TokenNameStringLiteral	info
,	TokenNameCOMMA	
"This"	TokenNameStringLiteral	This
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"period"	TokenNameStringLiteral	period
,	TokenNameCOMMA	
"Here"	TokenNameStringLiteral	Here
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"3.25"	TokenNameStringLiteral	3.25
,	TokenNameCOMMA	
"and"	TokenNameStringLiteral	and
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"3.50"	TokenNameStringLiteral	3.50
,	TokenNameCOMMA	
"Here's"	TokenNameStringLiteral	Here's
,	TokenNameCOMMA	
"Johnny"	TokenNameStringLiteral	Johnny
,	TokenNameCOMMA	
"heading"	TokenNameStringLiteral	heading
,	TokenNameCOMMA	
"sub"	TokenNameStringLiteral	sub
,	TokenNameCOMMA	
"head"	TokenNameStringLiteral	head
,	TokenNameCOMMA	
"followed"	TokenNameStringLiteral	followed
,	TokenNameCOMMA	
"by"	TokenNameStringLiteral	by
,	TokenNameCOMMA	
"some"	TokenNameStringLiteral	some
,	TokenNameCOMMA	
"text"	TokenNameStringLiteral	text
,	TokenNameCOMMA	
"blah"	TokenNameStringLiteral	blah
,	TokenNameCOMMA	
"ital"	TokenNameStringLiteral	ital
,	TokenNameCOMMA	
"cat"	TokenNameStringLiteral	cat
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"some"	TokenNameStringLiteral	some
,	TokenNameCOMMA	
"that"	TokenNameStringLiteral	that
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"italics"	TokenNameStringLiteral	italics
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"but"	TokenNameStringLiteral	but
,	TokenNameCOMMA	
"is"	TokenNameStringLiteral	is
,	TokenNameCOMMA	
"never"	TokenNameStringLiteral	never
,	TokenNameCOMMA	
"closed"	TokenNameStringLiteral	closed
,	TokenNameCOMMA	
"same"	TokenNameStringLiteral	same
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"goes"	TokenNameStringLiteral	goes
,	TokenNameCOMMA	
"for"	TokenNameStringLiteral	for
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"and2"	TokenNameStringLiteral	and2
,	TokenNameCOMMA	
"foo"	TokenNameStringLiteral	foo
,	TokenNameCOMMA	
"and"	TokenNameStringLiteral	and
,	TokenNameCOMMA	
"this"	TokenNameStringLiteral	this
,	TokenNameCOMMA	
"http://foo.boo.com/test/test/"	TokenNameStringLiteral	http://foo.boo.com/test/test/
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
"http://foo.boo.com/test/test/test.html"	TokenNameStringLiteral	http://foo.boo.com/test/test/test.html
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
"http://foo.boo.com/test/test/test.html?g=b&c=d"	TokenNameStringLiteral	http://foo.boo.com/test/test/test.html?g=b&c=d
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
"Test"	TokenNameStringLiteral	Test
,	TokenNameCOMMA	
"Citation"	TokenNameStringLiteral	Citation
,	TokenNameCOMMA	
"martian"	TokenNameStringLiteral	martian
,	TokenNameCOMMA	
"code"	TokenNameStringLiteral	code
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
INTERNAL_LINK	TokenNameIdentifier	 INTERNAL  LINK
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
INTERNAL_LINK	TokenNameIdentifier	 INTERNAL  LINK
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
ITALICS	TokenNameIdentifier	 ITALICS
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
ITALICS	TokenNameIdentifier	 ITALICS
,	TokenNameCOMMA	
ITALICS	TokenNameIdentifier	 ITALICS
,	TokenNameCOMMA	
BOLD	TokenNameIdentifier	 BOLD
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
BOLD_ITALICS	TokenNameIdentifier	 BOLD  ITALICS
,	TokenNameCOMMA	
BOLD_ITALICS	TokenNameIdentifier	 BOLD  ITALICS
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
INTERNAL_LINK	TokenNameIdentifier	 INTERNAL  LINK
,	TokenNameCOMMA	
INTERNAL_LINK	TokenNameIdentifier	 INTERNAL  LINK
,	TokenNameCOMMA	
INTERNAL_LINK	TokenNameIdentifier	 INTERNAL  LINK
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<NUM>"	TokenNameStringLiteral	<NUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<NUM>"	TokenNameStringLiteral	<NUM>
,	TokenNameCOMMA	
"<APOSTROPHE>"	TokenNameStringLiteral	<APOSTROPHE>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
HEADING	TokenNameIdentifier	 HEADING
,	TokenNameCOMMA	
SUB_HEADING	TokenNameIdentifier	 SUB  HEADING
,	TokenNameCOMMA	
SUB_HEADING	TokenNameIdentifier	 SUB  HEADING
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
ITALICS	TokenNameIdentifier	 ITALICS
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
BOLD	TokenNameIdentifier	 BOLD
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
BOLD_ITALICS	TokenNameIdentifier	 BOLD  ITALICS
,	TokenNameCOMMA	
CATEGORY	TokenNameIdentifier	 CATEGORY
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
CITATION	TokenNameIdentifier	 CITATION
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
,	TokenNameCOMMA	
"<ALPHANUM>"	TokenNameStringLiteral	<ALPHANUM>
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLinkPhrases	TokenNameIdentifier	 test Link Phrases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
LINK_PHRASES	TokenNameIdentifier	 LINK  PHRASES
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkLinkPhrases	TokenNameIdentifier	 check Link Phrases
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
checkLinkPhrases	TokenNameIdentifier	 check Link Phrases
(	TokenNameLPAREN	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
tf	TokenNameIdentifier	 tf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"click"	TokenNameStringLiteral	click
,	TokenNameCOMMA	
"link"	TokenNameStringLiteral	link
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"again"	TokenNameStringLiteral	again
,	TokenNameCOMMA	
"click"	TokenNameStringLiteral	click
,	TokenNameCOMMA	
"http://lucene.apache.org"	TokenNameStringLiteral	http://lucene.apache.org
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"again"	TokenNameStringLiteral	again
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLinks	TokenNameIdentifier	 test Links
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"[http://lucene.apache.org/java/docs/index.html#news here] [http://lucene.apache.org/java/docs/index.html?b=c here] [https://lucene.apache.org/java/docs/index.html?b=c here]"	TokenNameStringLiteral	[http://lucene.apache.org/java/docs/index.html#news here] [http://lucene.apache.org/java/docs/index.html?b=c here] [https://lucene.apache.org/java/docs/index.html?b=c here]
;	TokenNameSEMICOLON	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"http://lucene.apache.org/java/docs/index.html#news"	TokenNameStringLiteral	http://lucene.apache.org/java/docs/index.html#news
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"http://lucene.apache.org/java/docs/index.html?b=c"	TokenNameStringLiteral	http://lucene.apache.org/java/docs/index.html?b=c
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"https://lucene.apache.org/java/docs/index.html?b=c"	TokenNameStringLiteral	https://lucene.apache.org/java/docs/index.html?b=c
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
EXTERNAL_LINK_URL	TokenNameIdentifier	 EXTERNAL  LINK  URL
,	TokenNameCOMMA	
EXTERNAL_LINK	TokenNameIdentifier	 EXTERNAL  LINK
,	TokenNameCOMMA	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLucene1133	TokenNameIdentifier	 test Lucene1133
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
untoks	TokenNameIdentifier	 untoks
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
untoks	TokenNameIdentifier	 untoks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
CATEGORY	TokenNameIdentifier	 CATEGORY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
untoks	TokenNameIdentifier	 untoks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
ITALICS	TokenNameIdentifier	 ITALICS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//should be exactly the same, regardless of untoks 	TokenNameCOMMENT_LINE	should be exactly the same, regardless of untoks 
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
LINK_PHRASES	TokenNameIdentifier	 LINK  PHRASES
)	TokenNameRPAREN	
,	TokenNameCOMMA	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
TOKENS_ONLY	TokenNameIdentifier	 TOKENS  ONLY
,	TokenNameCOMMA	
untoks	TokenNameIdentifier	 untoks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkLinkPhrases	TokenNameIdentifier	 check Link Phrases
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"[[Category:a b c d]] [[Category:e f g]] [[link here]] [[link there]] ''italics here'' something ''more italics'' [[Category:h i j]]"	TokenNameStringLiteral	[[Category:a b c d]] [[Category:e f g]] [[link here]] [[link there]] ''italics here'' something ''more italics'' [[Category:h i j]]
;	TokenNameSEMICOLON	
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
UNTOKENIZED_ONLY	TokenNameIdentifier	 UNTOKENIZED  ONLY
,	TokenNameCOMMA	
untoks	TokenNameIdentifier	 untoks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a b c d"	TokenNameStringLiteral	a b c d
,	TokenNameCOMMA	
"e f g"	TokenNameStringLiteral	e f g
,	TokenNameCOMMA	
"link"	TokenNameStringLiteral	link
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"link"	TokenNameStringLiteral	link
,	TokenNameCOMMA	
"there"	TokenNameStringLiteral	there
,	TokenNameCOMMA	
"italics here"	TokenNameStringLiteral	italics here
,	TokenNameCOMMA	
"something"	TokenNameStringLiteral	something
,	TokenNameCOMMA	
"more italics"	TokenNameStringLiteral	more italics
,	TokenNameCOMMA	
"h i j"	TokenNameStringLiteral	h i j
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
124	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
133	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testBoth	TokenNameIdentifier	 test Both
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
untoks	TokenNameIdentifier	 untoks
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
untoks	TokenNameIdentifier	 untoks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
CATEGORY	TokenNameIdentifier	 CATEGORY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
untoks	TokenNameIdentifier	 untoks
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
ITALICS	TokenNameIdentifier	 ITALICS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"[[Category:a b c d]] [[Category:e f g]] [[link here]] [[link there]] ''italics here'' something ''more italics'' [[Category:h i j]]"	TokenNameStringLiteral	[[Category:a b c d]] [[Category:e f g]] [[link here]] [[link there]] ''italics here'' something ''more italics'' [[Category:h i j]]
;	TokenNameSEMICOLON	
//should output all the indivual tokens plus the untokenized tokens as well. Untokenized tokens 	TokenNameCOMMENT_LINE	should output all the indivual tokens plus the untokenized tokens as well. Untokenized tokens 
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
BOTH	TokenNameIdentifier	 BOTH
,	TokenNameCOMMA	
untoks	TokenNameIdentifier	 untoks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTokenStreamContents	TokenNameIdentifier	 assert Token Stream Contents
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"a b c d"	TokenNameStringLiteral	a b c d
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"b"	TokenNameStringLiteral	b
,	TokenNameCOMMA	
"c"	TokenNameStringLiteral	c
,	TokenNameCOMMA	
"d"	TokenNameStringLiteral	d
,	TokenNameCOMMA	
"e f g"	TokenNameStringLiteral	e f g
,	TokenNameCOMMA	
"e"	TokenNameStringLiteral	e
,	TokenNameCOMMA	
"f"	TokenNameStringLiteral	f
,	TokenNameCOMMA	
"g"	TokenNameStringLiteral	g
,	TokenNameCOMMA	
"link"	TokenNameStringLiteral	link
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"link"	TokenNameStringLiteral	link
,	TokenNameCOMMA	
"there"	TokenNameStringLiteral	there
,	TokenNameCOMMA	
"italics here"	TokenNameStringLiteral	italics here
,	TokenNameCOMMA	
"italics"	TokenNameStringLiteral	italics
,	TokenNameCOMMA	
"here"	TokenNameStringLiteral	here
,	TokenNameCOMMA	
"something"	TokenNameStringLiteral	something
,	TokenNameCOMMA	
"more italics"	TokenNameStringLiteral	more italics
,	TokenNameCOMMA	
"more"	TokenNameStringLiteral	more
,	TokenNameCOMMA	
"italics"	TokenNameStringLiteral	italics
,	TokenNameCOMMA	
"h i j"	TokenNameStringLiteral	h i j
,	TokenNameCOMMA	
"h"	TokenNameStringLiteral	h
,	TokenNameCOMMA	
"i"	TokenNameStringLiteral	i
,	TokenNameCOMMA	
"j"	TokenNameStringLiteral	j
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
11	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
15	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
17	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
32	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
34	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
36	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
42	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
47	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
56	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
61	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
71	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
79	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
86	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
98	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
103	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
124	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
124	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
128	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
132	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
12	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
14	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
18	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
33	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
35	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
37	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
46	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
51	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
66	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
78	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
83	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
95	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
102	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
110	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
133	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
125	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
129	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
133	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// now check the flags, TODO: add way to check flags from BaseTokenStreamTestCase? 	TokenNameCOMMENT_LINE	now check the flags, TODO: add way to check flags from BaseTokenStreamTestCase? 
tf	TokenNameIdentifier	 tf
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
.	TokenNameDOT	
BOTH	TokenNameIdentifier	 BOTH
,	TokenNameCOMMA	
untoks	TokenNameIdentifier	 untoks
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expectedFlags	TokenNameIdentifier	 expected Flags
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier	 UNTOKENIZED  TOKEN  FLAG
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier	 UNTOKENIZED  TOKEN  FLAG
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier	 UNTOKENIZED  TOKEN  FLAG
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier	 UNTOKENIZED  TOKEN  FLAG
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
UNTOKENIZED_TOKEN_FLAG	TokenNameIdentifier	 UNTOKENIZED  TOKEN  FLAG
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
flagsAtt	TokenNameIdentifier	 flags Att
=	TokenNameEQUAL	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
expectedFlags	TokenNameIdentifier	 expected Flags
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"flags "	TokenNameStringLiteral	flags 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
expectedFlags	TokenNameIdentifier	 expected Flags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tf	TokenNameIdentifier	 tf
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** blast some random strings through the analyzer */	TokenNameCOMMENT_JAVADOC	 blast some random strings through the analyzer 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomStrings	TokenNameIdentifier	 test Random Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tokenizer	TokenNameIdentifier	 Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** blast some random large strings through the analyzer */	TokenNameCOMMENT_JAVADOC	 blast some random large strings through the analyzer 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomHugeStrings	TokenNameIdentifier	 test Random Huge Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Tokenizer	TokenNameIdentifier	 Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
WikipediaTokenizer	TokenNameIdentifier	 Wikipedia Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
tokenizer	TokenNameIdentifier	 tokenizer
,	TokenNameCOMMA	
tokenizer	TokenNameIdentifier	 tokenizer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
,	TokenNameCOMMA	
8192	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
