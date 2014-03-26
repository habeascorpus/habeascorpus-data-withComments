package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
simple	TokenNameIdentifier	 simple
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
WhitespaceAnalyzer	TokenNameIdentifier	 Whitespace Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
example	TokenNameIdentifier	 example
.	TokenNameDOT	
ExampleUtils	TokenNameIdentifier	 Example Utils
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Some definitions for the Simple Sample. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Some definitions for the Simple Sample. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SimpleUtils	TokenNameIdentifier	 Simple Utils
{	TokenNameLBRACE	
/** * Documents text field. */	TokenNameCOMMENT_JAVADOC	 Documents text field. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT	TokenNameIdentifier	 TEXT
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
;	TokenNameSEMICOLON	
/** * Documents title field. */	TokenNameCOMMENT_JAVADOC	 Documents title field. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TITLE	TokenNameIdentifier	 TITLE
=	TokenNameEQUAL	
"title"	TokenNameStringLiteral	title
;	TokenNameSEMICOLON	
/** * sample documents text (for the text field). */	TokenNameCOMMENT_JAVADOC	 sample documents text (for the text field). 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docTexts	TokenNameIdentifier	 doc Texts
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"the white car is the one I want."	TokenNameStringLiteral	the white car is the one I want.
,	TokenNameCOMMA	
"the white dog does not belong to anyone."	TokenNameStringLiteral	the white dog does not belong to anyone.
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * sample documents titles (for the title field). */	TokenNameCOMMENT_JAVADOC	 sample documents titles (for the title field). 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docTitles	TokenNameIdentifier	 doc Titles
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"white car"	TokenNameStringLiteral	white car
,	TokenNameCOMMA	
"white dog"	TokenNameStringLiteral	white dog
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Categories: categories[D][N] == category-path no. N for document no. D. */	TokenNameCOMMENT_JAVADOC	 Categories: categories[D][N] == category-path no. N for document no. D. 
public	TokenNamepublic	
static	TokenNamestatic	
CategoryPath	TokenNameIdentifier	 Category Path
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
categories	TokenNameIdentifier	 categories
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"f1"	TokenNameStringLiteral	f1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"f2"	TokenNameStringLiteral	f2
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"f1"	TokenNameStringLiteral	f1
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
"root"	TokenNameStringLiteral	root
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
"f3"	TokenNameStringLiteral	f3
)	TokenNameRPAREN	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Analyzer used in the simple sample. */	TokenNameCOMMENT_JAVADOC	 Analyzer used in the simple sample. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
WhitespaceAnalyzer	TokenNameIdentifier	 Whitespace Analyzer
(	TokenNameLPAREN	
ExampleUtils	TokenNameIdentifier	 Example Utils
.	TokenNameDOT	
EXAMPLE_VER	TokenNameIdentifier	 EXAMPLE  VER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Utility method: List of category paths out of an array of them... * @param categoryPaths input array of category paths. */	TokenNameCOMMENT_JAVADOC	 Utility method: List of category paths out of an array of them... @param categoryPaths input array of category paths. 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
categoryPathArrayToList	TokenNameIdentifier	 category Path Array To List
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
...	TokenNameELLIPSIS	
categoryPaths	TokenNameIdentifier	 category Paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
:	TokenNameCOLON	
categoryPaths	TokenNameIdentifier	 category Paths
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
