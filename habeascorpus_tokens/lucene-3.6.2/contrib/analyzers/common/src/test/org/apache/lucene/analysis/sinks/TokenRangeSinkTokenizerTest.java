package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
sinks	TokenNameIdentifier	 sinks
;	TokenNameSEMICOLON	
/** * Copyright 2004 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2004 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
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
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
.	TokenNameDOT	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
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
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TokenRangeSinkTokenizerTest	TokenNameIdentifier	 Token Range Sink Tokenizer Test
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
test	TokenNameIdentifier	 test
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
TokenRangeSinkFilter	TokenNameIdentifier	 Token Range Sink Filter
sinkFilter	TokenNameIdentifier	 sink Filter
=	TokenNameEQUAL	
new	TokenNamenew	
TokenRangeSinkFilter	TokenNameIdentifier	 Token Range Sink Filter
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
"The quick red fox jumped over the lazy brown dogs"	TokenNameStringLiteral	The quick red fox jumped over the lazy brown dogs
;	TokenNameSEMICOLON	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
tee	TokenNameIdentifier	 tee
=	TokenNameEQUAL	
new	TokenNamenew	
TeeSinkTokenFilter	TokenNameIdentifier	 Tee Sink Token Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SinkTokenStream	TokenNameIdentifier	 Sink Token Stream
rangeToks	TokenNameIdentifier	 range Toks
=	TokenNameEQUAL	
tee	TokenNameIdentifier	 tee
.	TokenNameDOT	
newSinkTokenStream	TokenNameIdentifier	 new Sink Token Stream
(	TokenNameLPAREN	
sinkFilter	TokenNameIdentifier	 sink Filter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
tee	TokenNameIdentifier	 tee
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tee	TokenNameIdentifier	 tee
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
sinkCount	TokenNameIdentifier	 sink Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
rangeToks	TokenNameIdentifier	 range Toks
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
rangeToks	TokenNameIdentifier	 range Toks
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sinkCount	TokenNameIdentifier	 sink Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
" does not equal: "	TokenNameStringLiteral	 does not equal: 
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"rangeToks Size: "	TokenNameStringLiteral	rangeToks Size: 
+	TokenNamePLUS	
sinkCount	TokenNameIdentifier	 sink Count
+	TokenNamePLUS	
" is not: "	TokenNameStringLiteral	 is not: 
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sinkCount	TokenNameIdentifier	 sink Count
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	