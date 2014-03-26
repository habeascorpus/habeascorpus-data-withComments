package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
fa	TokenNameIdentifier	 fa
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
CharArraySet	TokenNameIdentifier	 Char Array Set
;	TokenNameSEMICOLON	
/** * Test the Persian Analyzer * */	TokenNameCOMMENT_JAVADOC	 Test the Persian Analyzer 
public	TokenNamepublic	
class	TokenNameclass	
TestPersianAnalyzer	TokenNameIdentifier	 Test Persian Analyzer
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
/** * This test fails with NPE when the stopwords file is missing in classpath */	TokenNameCOMMENT_JAVADOC	 This test fails with NPE when the stopwords file is missing in classpath 
public	TokenNamepublic	
void	TokenNamevoid	
testResourcesAvailable	TokenNameIdentifier	 test Resources Available
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
new	TokenNamenew	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This test shows how the combination of tokenization (breaking on zero-width * non-joiner), normalization (such as treating arabic YEH and farsi YEH the * same), and stopwords creates a light-stemming effect for verbs. * * These verb forms are from http://en.wikipedia.org/wiki/Persian_grammar */	TokenNameCOMMENT_JAVADOC	 This test shows how the combination of tokenization (breaking on zero-width non-joiner), normalization (such as treating arabic YEH and farsi YEH the same), and stopwords creates a light-stemming effect for verbs. * These verb forms are from http://en.wikipedia.org/wiki/Persian_grammar 
public	TokenNamepublic	
void	TokenNamevoid	
testBehaviorVerbs	TokenNameIdentifier	 test Behavior Verbs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active present indicative 	TokenNameCOMMENT_LINE	active present indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"می‌خورد"	TokenNameStringLiteral	می‌خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active preterite indicative 	TokenNameCOMMENT_LINE	active preterite indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورد"	TokenNameStringLiteral	خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective preterite indicative 	TokenNameCOMMENT_LINE	active imperfective preterite indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"می‌خورد"	TokenNameStringLiteral	می‌خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active future indicative 	TokenNameCOMMENT_LINE	active future indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خواهد خورد"	TokenNameStringLiteral	خواهد خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active present progressive indicative 	TokenNameCOMMENT_LINE	active present progressive indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"دارد می‌خورد"	TokenNameStringLiteral	دارد می‌خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active preterite progressive indicative 	TokenNameCOMMENT_LINE	active preterite progressive indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"داشت می‌خورد"	TokenNameStringLiteral	داشت می‌خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active perfect indicative 	TokenNameCOMMENT_LINE	active perfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده‌است"	TokenNameStringLiteral	خورده‌است
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective perfect indicative 	TokenNameCOMMENT_LINE	active imperfective perfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"می‌خورده‌است"	TokenNameStringLiteral	می‌خورده‌است
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active pluperfect indicative 	TokenNameCOMMENT_LINE	active pluperfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده بود"	TokenNameStringLiteral	خورده بود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective pluperfect indicative 	TokenNameCOMMENT_LINE	active imperfective pluperfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"می‌خورده بود"	TokenNameStringLiteral	می‌خورده بود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active preterite subjunctive 	TokenNameCOMMENT_LINE	active preterite subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده باشد"	TokenNameStringLiteral	خورده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective preterite subjunctive 	TokenNameCOMMENT_LINE	active imperfective preterite subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"می‌خورده باشد"	TokenNameStringLiteral	می‌خورده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active pluperfect subjunctive 	TokenNameCOMMENT_LINE	active pluperfect subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده بوده باشد"	TokenNameStringLiteral	خورده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective pluperfect subjunctive 	TokenNameCOMMENT_LINE	active imperfective pluperfect subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"می‌خورده بوده باشد"	TokenNameStringLiteral	می‌خورده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive present indicative 	TokenNameCOMMENT_LINE	passive present indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده می‌شود"	TokenNameStringLiteral	خورده می‌شود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive preterite indicative 	TokenNameCOMMENT_LINE	passive preterite indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شد"	TokenNameStringLiteral	خورده شد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective preterite indicative 	TokenNameCOMMENT_LINE	passive imperfective preterite indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده می‌شد"	TokenNameStringLiteral	خورده می‌شد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive perfect indicative 	TokenNameCOMMENT_LINE	passive perfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شده‌است"	TokenNameStringLiteral	خورده شده‌است
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective perfect indicative 	TokenNameCOMMENT_LINE	passive imperfective perfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده می‌شده‌است"	TokenNameStringLiteral	خورده می‌شده‌است
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive pluperfect indicative 	TokenNameCOMMENT_LINE	passive pluperfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شده بود"	TokenNameStringLiteral	خورده شده بود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective pluperfect indicative 	TokenNameCOMMENT_LINE	passive imperfective pluperfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده می‌شده بود"	TokenNameStringLiteral	خورده می‌شده بود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive future indicative 	TokenNameCOMMENT_LINE	passive future indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده خواهد شد"	TokenNameStringLiteral	خورده خواهد شد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive present progressive indicative 	TokenNameCOMMENT_LINE	passive present progressive indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"دارد خورده می‌شود"	TokenNameStringLiteral	دارد خورده می‌شود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive preterite progressive indicative 	TokenNameCOMMENT_LINE	passive preterite progressive indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"داشت خورده می‌شد"	TokenNameStringLiteral	داشت خورده می‌شد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive present subjunctive 	TokenNameCOMMENT_LINE	passive present subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شود"	TokenNameStringLiteral	خورده شود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive preterite subjunctive 	TokenNameCOMMENT_LINE	passive preterite subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شده باشد"	TokenNameStringLiteral	خورده شده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective preterite subjunctive 	TokenNameCOMMENT_LINE	passive imperfective preterite subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده می‌شده باشد"	TokenNameStringLiteral	خورده می‌شده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive pluperfect subjunctive 	TokenNameCOMMENT_LINE	passive pluperfect subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شده بوده باشد"	TokenNameStringLiteral	خورده شده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective pluperfect subjunctive 	TokenNameCOMMENT_LINE	passive imperfective pluperfect subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده می‌شده بوده باشد"	TokenNameStringLiteral	خورده می‌شده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active present subjunctive 	TokenNameCOMMENT_LINE	active present subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"بخورد"	TokenNameStringLiteral	بخورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"بخورد"	TokenNameStringLiteral	بخورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This test shows how the combination of tokenization and stopwords creates a * light-stemming effect for verbs. * * In this case, these forms are presented with alternative orthography, using * arabic yeh and whitespace. This yeh phenomenon is common for legacy text * due to some previous bugs in Microsoft Windows. * * These verb forms are from http://en.wikipedia.org/wiki/Persian_grammar */	TokenNameCOMMENT_JAVADOC	 This test shows how the combination of tokenization and stopwords creates a light-stemming effect for verbs. * In this case, these forms are presented with alternative orthography, using arabic yeh and whitespace. This yeh phenomenon is common for legacy text due to some previous bugs in Microsoft Windows. * These verb forms are from http://en.wikipedia.org/wiki/Persian_grammar 
public	TokenNamepublic	
void	TokenNamevoid	
testBehaviorVerbsDefective	TokenNameIdentifier	 test Behavior Verbs Defective
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active present indicative 	TokenNameCOMMENT_LINE	active present indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"مي خورد"	TokenNameStringLiteral	مي خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active preterite indicative 	TokenNameCOMMENT_LINE	active preterite indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورد"	TokenNameStringLiteral	خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective preterite indicative 	TokenNameCOMMENT_LINE	active imperfective preterite indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"مي خورد"	TokenNameStringLiteral	مي خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active future indicative 	TokenNameCOMMENT_LINE	active future indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خواهد خورد"	TokenNameStringLiteral	خواهد خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active present progressive indicative 	TokenNameCOMMENT_LINE	active present progressive indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"دارد مي خورد"	TokenNameStringLiteral	دارد مي خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active preterite progressive indicative 	TokenNameCOMMENT_LINE	active preterite progressive indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"داشت مي خورد"	TokenNameStringLiteral	داشت مي خورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورد"	TokenNameStringLiteral	خورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active perfect indicative 	TokenNameCOMMENT_LINE	active perfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده است"	TokenNameStringLiteral	خورده است
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective perfect indicative 	TokenNameCOMMENT_LINE	active imperfective perfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"مي خورده است"	TokenNameStringLiteral	مي خورده است
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active pluperfect indicative 	TokenNameCOMMENT_LINE	active pluperfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده بود"	TokenNameStringLiteral	خورده بود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective pluperfect indicative 	TokenNameCOMMENT_LINE	active imperfective pluperfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"مي خورده بود"	TokenNameStringLiteral	مي خورده بود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active preterite subjunctive 	TokenNameCOMMENT_LINE	active preterite subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده باشد"	TokenNameStringLiteral	خورده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective preterite subjunctive 	TokenNameCOMMENT_LINE	active imperfective preterite subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"مي خورده باشد"	TokenNameStringLiteral	مي خورده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active pluperfect subjunctive 	TokenNameCOMMENT_LINE	active pluperfect subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده بوده باشد"	TokenNameStringLiteral	خورده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active imperfective pluperfect subjunctive 	TokenNameCOMMENT_LINE	active imperfective pluperfect subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"مي خورده بوده باشد"	TokenNameStringLiteral	مي خورده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive present indicative 	TokenNameCOMMENT_LINE	passive present indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده مي شود"	TokenNameStringLiteral	خورده مي شود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive preterite indicative 	TokenNameCOMMENT_LINE	passive preterite indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شد"	TokenNameStringLiteral	خورده شد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective preterite indicative 	TokenNameCOMMENT_LINE	passive imperfective preterite indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده مي شد"	TokenNameStringLiteral	خورده مي شد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive perfect indicative 	TokenNameCOMMENT_LINE	passive perfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شده است"	TokenNameStringLiteral	خورده شده است
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective perfect indicative 	TokenNameCOMMENT_LINE	passive imperfective perfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده مي شده است"	TokenNameStringLiteral	خورده مي شده است
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive pluperfect indicative 	TokenNameCOMMENT_LINE	passive pluperfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شده بود"	TokenNameStringLiteral	خورده شده بود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective pluperfect indicative 	TokenNameCOMMENT_LINE	passive imperfective pluperfect indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده مي شده بود"	TokenNameStringLiteral	خورده مي شده بود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive future indicative 	TokenNameCOMMENT_LINE	passive future indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده خواهد شد"	TokenNameStringLiteral	خورده خواهد شد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive present progressive indicative 	TokenNameCOMMENT_LINE	passive present progressive indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"دارد خورده مي شود"	TokenNameStringLiteral	دارد خورده مي شود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive preterite progressive indicative 	TokenNameCOMMENT_LINE	passive preterite progressive indicative 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"داشت خورده مي شد"	TokenNameStringLiteral	داشت خورده مي شد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive present subjunctive 	TokenNameCOMMENT_LINE	passive present subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شود"	TokenNameStringLiteral	خورده شود
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive preterite subjunctive 	TokenNameCOMMENT_LINE	passive preterite subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شده باشد"	TokenNameStringLiteral	خورده شده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective preterite subjunctive 	TokenNameCOMMENT_LINE	passive imperfective preterite subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده مي شده باشد"	TokenNameStringLiteral	خورده مي شده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive pluperfect subjunctive 	TokenNameCOMMENT_LINE	passive pluperfect subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده شده بوده باشد"	TokenNameStringLiteral	خورده شده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// passive imperfective pluperfect subjunctive 	TokenNameCOMMENT_LINE	passive imperfective pluperfect subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده مي شده بوده باشد"	TokenNameStringLiteral	خورده مي شده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// active present subjunctive 	TokenNameCOMMENT_LINE	active present subjunctive 
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"بخورد"	TokenNameStringLiteral	بخورد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"بخورد"	TokenNameStringLiteral	بخورد
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This test shows how the combination of tokenization (breaking on zero-width * non-joiner or space) and stopwords creates a light-stemming effect for * nouns, removing the plural -ha. */	TokenNameCOMMENT_JAVADOC	 This test shows how the combination of tokenization (breaking on zero-width non-joiner or space) and stopwords creates a light-stemming effect for nouns, removing the plural -ha. 
public	TokenNamepublic	
void	TokenNamevoid	
testBehaviorNouns	TokenNameIdentifier	 test Behavior Nouns
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"برگ ها"	TokenNameStringLiteral	برگ ها
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"برگ"	TokenNameStringLiteral	برگ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"برگ‌ها"	TokenNameStringLiteral	برگ‌ها
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"برگ"	TokenNameStringLiteral	برگ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test showing that non-persian text is treated very much like SimpleAnalyzer * (lowercased, etc) */	TokenNameCOMMENT_JAVADOC	 Test showing that non-persian text is treated very much like SimpleAnalyzer (lowercased, etc) 
public	TokenNamepublic	
void	TokenNamevoid	
testBehaviorNonPersian	TokenNameIdentifier	 test Behavior Non Persian
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"English test."	TokenNameStringLiteral	English test.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"english"	TokenNameStringLiteral	english
,	TokenNameCOMMA	
"test"	TokenNameStringLiteral	test
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Basic test ensuring that reusableTokenStream works correctly. */	TokenNameCOMMENT_JAVADOC	 Basic test ensuring that reusableTokenStream works correctly. 
public	TokenNamepublic	
void	TokenNamevoid	
testReusableTokenStream	TokenNameIdentifier	 test Reusable Token Stream
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"خورده مي شده بوده باشد"	TokenNameStringLiteral	خورده مي شده بوده باشد
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"خورده"	TokenNameStringLiteral	خورده
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesToReuse	TokenNameIdentifier	 assert Analyzes To Reuse
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"برگ‌ها"	TokenNameStringLiteral	برگ‌ها
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"برگ"	TokenNameStringLiteral	برگ
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test that custom stopwords work, and are not case-sensitive. */	TokenNameCOMMENT_JAVADOC	 Test that custom stopwords work, and are not case-sensitive. 
public	TokenNamepublic	
void	TokenNamevoid	
testCustomStopwords	TokenNameIdentifier	 test Custom Stopwords
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
CharArraySet	TokenNameIdentifier	 Char Array Set
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
asSet	TokenNameIdentifier	 as Set
(	TokenNameLPAREN	
"the"	TokenNameStringLiteral	the
,	TokenNameCOMMA	
"and"	TokenNameStringLiteral	and
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertAnalyzesTo	TokenNameIdentifier	 assert Analyzes To
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"The quick brown fox."	TokenNameStringLiteral	The quick brown fox.
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
"quick"	TokenNameStringLiteral	quick
,	TokenNameCOMMA	
"brown"	TokenNameStringLiteral	brown
,	TokenNameCOMMA	
"fox"	TokenNameStringLiteral	fox
}	TokenNameRBRACE	
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
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
new	TokenNamenew	
PersianAnalyzer	TokenNameIdentifier	 Persian Analyzer
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
)	TokenNameRPAREN	
,	TokenNameCOMMA	
10000	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
