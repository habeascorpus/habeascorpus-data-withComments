package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
analyzing	TokenNameIdentifier	 analyzing
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
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
LowerCaseFilter	TokenNameIdentifier	 Lower Case Filter
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
TokenStream	TokenNameIdentifier	 Token Stream
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardFilter	TokenNameIdentifier	 Standard Filter
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
ParseException	TokenNameIdentifier	 Parse Exception
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
Version	TokenNameIdentifier	 Version
;	TokenNameSEMICOLON	
/** * @version $Revision$, $Date$ */	TokenNameCOMMENT_JAVADOC	 @version $Revision$, $Date$ 
public	TokenNamepublic	
class	TokenNameclass	
TestAnalyzingQueryParser	TokenNameIdentifier	 Test Analyzing Query Parser
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wildcardInput	TokenNameIdentifier	 wildcard Input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wildcardExpected	TokenNameIdentifier	 wildcard Expected
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixInput	TokenNameIdentifier	 prefix Input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prefixExpected	TokenNameIdentifier	 prefix Expected
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rangeInput	TokenNameIdentifier	 range Input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rangeExpected	TokenNameIdentifier	 range Expected
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fuzzyInput	TokenNameIdentifier	 fuzzy Input
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fuzzyExpected	TokenNameIdentifier	 fuzzy Expected
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wildcardInput	TokenNameIdentifier	 wildcard Input
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"übersetzung über*ung"	TokenNameStringLiteral	übersetzung über*ung
,	TokenNameCOMMA	
"Mötley Cr�e Mötl?* Crü?"	TokenNameStringLiteral	Mötley Cr�e Mötl?* Crü?
,	TokenNameCOMMA	
"Renée Zellweger Ren?? Zellw?ger"	TokenNameStringLiteral	Renée Zellweger Ren?? Zellw?ger
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
wildcardExpected	TokenNameIdentifier	 wildcard Expected
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ubersetzung uber*ung"	TokenNameStringLiteral	ubersetzung uber*ung
,	TokenNameCOMMA	
"motley crue motl?* cru?"	TokenNameStringLiteral	motley crue motl?* cru?
,	TokenNameCOMMA	
"renee zellweger ren?? zellw?ger"	TokenNameStringLiteral	renee zellweger ren?? zellw?ger
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
prefixInput	TokenNameIdentifier	 prefix Input
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"übersetzung übersetz*"	TokenNameStringLiteral	übersetzung übersetz*
,	TokenNameCOMMA	
"Mötley Crüe Mötl* crü*"	TokenNameStringLiteral	Mötley Crüe Mötl* crü*
,	TokenNameCOMMA	
"René? Zellw*"	TokenNameStringLiteral	René? Zellw*
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
prefixExpected	TokenNameIdentifier	 prefix Expected
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ubersetzung ubersetz*"	TokenNameStringLiteral	ubersetzung ubersetz*
,	TokenNameCOMMA	
"motley crue motl* cru*"	TokenNameStringLiteral	motley crue motl* cru*
,	TokenNameCOMMA	
"rene? zellw*"	TokenNameStringLiteral	rene? zellw*
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
rangeInput	TokenNameIdentifier	 range Input
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"[aa TO bb]"	TokenNameStringLiteral	[aa TO bb]
,	TokenNameCOMMA	
"{Anaïs TO Zoé}"	TokenNameStringLiteral	{Anaïs TO Zoé}
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
rangeExpected	TokenNameIdentifier	 range Expected
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"[aa TO bb]"	TokenNameStringLiteral	[aa TO bb]
,	TokenNameCOMMA	
"{anais TO zoe}"	TokenNameStringLiteral	{anais TO zoe}
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fuzzyInput	TokenNameIdentifier	 fuzzy Input
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"Übersetzung Übersetzung~0.9"	TokenNameStringLiteral	Übersetzung Übersetzung~0.9
,	TokenNameCOMMA	
"Mötley Crüe Mötley~0.75 Crüe~0.5"	TokenNameStringLiteral	Mötley Crüe Mötley~0.75 Crüe~0.5
,	TokenNameCOMMA	
"Renée Zellweger Renée~0.9 Zellweger~"	TokenNameStringLiteral	Renée Zellweger Renée~0.9 Zellweger~
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
fuzzyExpected	TokenNameIdentifier	 fuzzy Expected
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"ubersetzung ubersetzung~0.9"	TokenNameStringLiteral	ubersetzung ubersetzung~0.9
,	TokenNameCOMMA	
"motley crue motley~0.75 crue~0.5"	TokenNameStringLiteral	motley crue motley~0.75 crue~0.5
,	TokenNameCOMMA	
"renee zellweger renee~0.9 zellweger~0.5"	TokenNameStringLiteral	renee zellweger renee~0.9 zellweger~0.5
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ASCIIAnalyzer	TokenNameIdentifier	 ASCII Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testWildCardQuery	TokenNameIdentifier	 test Wild Card Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
wildcardInput	TokenNameIdentifier	 wildcard Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Testing wildcards with analyzer "	TokenNameStringLiteral	Testing wildcards with analyzer 
+	TokenNamePLUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", input string: "	TokenNameStringLiteral	, input string: 
+	TokenNamePLUS	
wildcardInput	TokenNameIdentifier	 wildcard Input
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
wildcardExpected	TokenNameIdentifier	 wildcard Expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
parseWithAnalyzingQueryParser	TokenNameIdentifier	 parse With Analyzing Query Parser
(	TokenNameLPAREN	
wildcardInput	TokenNameIdentifier	 wildcard Input
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testPrefixQuery	TokenNameIdentifier	 test Prefix Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
prefixInput	TokenNameIdentifier	 prefix Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Testing prefixes with analyzer "	TokenNameStringLiteral	Testing prefixes with analyzer 
+	TokenNamePLUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", input string: "	TokenNameStringLiteral	, input string: 
+	TokenNamePLUS	
prefixInput	TokenNameIdentifier	 prefix Input
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
prefixExpected	TokenNameIdentifier	 prefix Expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
parseWithAnalyzingQueryParser	TokenNameIdentifier	 parse With Analyzing Query Parser
(	TokenNameLPAREN	
prefixInput	TokenNameIdentifier	 prefix Input
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testRangeQuery	TokenNameIdentifier	 test Range Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
rangeInput	TokenNameIdentifier	 range Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Testing ranges with analyzer "	TokenNameStringLiteral	Testing ranges with analyzer 
+	TokenNamePLUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", input string: "	TokenNameStringLiteral	, input string: 
+	TokenNamePLUS	
rangeInput	TokenNameIdentifier	 range Input
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
rangeExpected	TokenNameIdentifier	 range Expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
parseWithAnalyzingQueryParser	TokenNameIdentifier	 parse With Analyzing Query Parser
(	TokenNameLPAREN	
rangeInput	TokenNameIdentifier	 range Input
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testFuzzyQuery	TokenNameIdentifier	 test Fuzzy Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fuzzyInput	TokenNameIdentifier	 fuzzy Input
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Testing fuzzys with analyzer "	TokenNameStringLiteral	Testing fuzzys with analyzer 
+	TokenNamePLUS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", input string: "	TokenNameStringLiteral	, input string: 
+	TokenNamePLUS	
fuzzyInput	TokenNameIdentifier	 fuzzy Input
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
fuzzyExpected	TokenNameIdentifier	 fuzzy Expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
parseWithAnalyzingQueryParser	TokenNameIdentifier	 parse With Analyzing Query Parser
(	TokenNameLPAREN	
fuzzyInput	TokenNameIdentifier	 fuzzy Input
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
parseWithAnalyzingQueryParser	TokenNameIdentifier	 parse With Analyzing Query Parser
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
throws	TokenNamethrows	
ParseException	TokenNameIdentifier	 Parse Exception
{	TokenNameLBRACE	
AnalyzingQueryParser	TokenNameIdentifier	 Analyzing Query Parser
qp	TokenNameIdentifier	 qp
=	TokenNameEQUAL	
new	TokenNamenew	
AnalyzingQueryParser	TokenNameIdentifier	 Analyzing Query Parser
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
qp	TokenNameIdentifier	 qp
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
class	TokenNameclass	
ASCIIAnalyzer	TokenNameIdentifier	 ASCII Analyzer
extends	TokenNameextends	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
Analyzer	TokenNameIdentifier	 Analyzer
{	TokenNameLBRACE	
public	TokenNamepublic	
ASCIIAnalyzer	TokenNameIdentifier	 ASCII Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TokenStream	TokenNameIdentifier	 Token Stream
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StandardTokenizer	TokenNameIdentifier	 Standard Tokenizer
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StandardFilter	TokenNameIdentifier	 Standard Filter
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_31	TokenNameIdentifier	 LUCENE 31
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ASCIIFoldingFilter	TokenNameIdentifier	 ASCII Folding Filter
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
LowerCaseFilter	TokenNameIdentifier	 Lower Case Filter
(	TokenNameLPAREN	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
.	TokenNameDOT	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
