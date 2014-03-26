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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
standard	TokenNameIdentifier	 standard
.	TokenNameDOT	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
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
tasks	TokenNameIdentifier	 tasks
.	TokenNameDOT	
NewAnalyzerTask	TokenNameIdentifier	 New Analyzer Task
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
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
QueryParser	TokenNameIdentifier	 Query Parser
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Query	TokenNameIdentifier	 Query
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
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
RuleBasedNumberFormat	TokenNameIdentifier	 Rule Based Number Format
;	TokenNameSEMICOLON	
/** * Creates queries whose content is a spelled-out <code>long</code> number * starting from <code>{@link Long#MIN_VALUE} + 10</code>. */	TokenNameCOMMENT_JAVADOC	 Creates queries whose content is a spelled-out <code>long</code> number starting from <code>{@link Long#MIN_VALUE} + 10</code>. 
public	TokenNamepublic	
class	TokenNameclass	
LongToEnglishQueryMaker	TokenNameIdentifier	 Long To English Query Maker
implements	TokenNameimplements	
QueryMaker	TokenNameIdentifier	 Query Maker
{	TokenNameLBRACE	
long	TokenNamelong	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
QueryParser	TokenNameIdentifier	 Query Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
// TODO: we could take param to specify locale... 	TokenNameCOMMENT_LINE	TODO: we could take param to specify locale... 
private	TokenNameprivate	
final	TokenNamefinal	
RuleBasedNumberFormat	TokenNameIdentifier	 Rule Based Number Format
rnbf	TokenNameIdentifier	 rnbf
=	TokenNameEQUAL	
new	TokenNamenew	
RuleBasedNumberFormat	TokenNameIdentifier	 Rule Based Number Format
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
,	TokenNameCOMMA	
RuleBasedNumberFormat	TokenNameIdentifier	 Rule Based Number Format
.	TokenNameDOT	
SPELLOUT	TokenNameIdentifier	 SPELLOUT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
makeQuery	TokenNameIdentifier	 make Query
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
Query	TokenNameIdentifier	 Query
makeQuery	TokenNameIdentifier	 make Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
rnbf	TokenNameIdentifier	 rnbf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getNextCounter	TokenNameIdentifier	 get Next Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
synchronized	TokenNamesynchronized	
long	TokenNamelong	
getNextCounter	TokenNameIdentifier	 get Next Counter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
counter	TokenNameIdentifier	 counter
==	TokenNameEQUAL_EQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
counter	TokenNameIdentifier	 counter
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setConfig	TokenNameIdentifier	 set Config
(	TokenNameLPAREN	
Config	TokenNameIdentifier	 Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Analyzer	TokenNameIdentifier	 Analyzer
anlzr	TokenNameIdentifier	 anlzr
=	TokenNameEQUAL	
NewAnalyzerTask	TokenNameIdentifier	 New Analyzer Task
.	TokenNameDOT	
createAnalyzer	TokenNameIdentifier	 create Analyzer
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"analyzer"	TokenNameStringLiteral	analyzer
,	TokenNameCOMMA	
StandardAnalyzer	TokenNameIdentifier	 Standard Analyzer
.	TokenNameDOT	
class	TokenNameclass	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
new	TokenNamenew	
QueryParser	TokenNameIdentifier	 Query Parser
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
,	TokenNameCOMMA	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
,	TokenNameCOMMA	
anlzr	TokenNameIdentifier	 anlzr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
resetInputs	TokenNameIdentifier	 reset Inputs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
counter	TokenNameIdentifier	 counter
=	TokenNameEQUAL	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
printQueries	TokenNameIdentifier	 print Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"LongToEnglish: ["	TokenNameStringLiteral	LongToEnglish: [
+	TokenNamePLUS	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
MIN_VALUE	TokenNameIdentifier	 MIN  VALUE
+	TokenNamePLUS	
" TO "	TokenNameStringLiteral	 TO 
+	TokenNamePLUS	
counter	TokenNameIdentifier	 counter
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
