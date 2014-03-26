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
tasks	TokenNameIdentifier	 tasks
;	TokenNameSEMICOLON	
/** * Copyright 2005 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2005 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
PerfRunData	TokenNameIdentifier	 Perf Run Data
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
/** * Create a new {@link org.apache.lucene.analysis.Analyzer} and set it it in the getRunData() for use by all future tasks. * */	TokenNameCOMMENT_JAVADOC	 Create a new {@link org.apache.lucene.analysis.Analyzer} and set it it in the getRunData() for use by all future tasks. 
public	TokenNamepublic	
class	TokenNameclass	
NewAnalyzerTask	TokenNameIdentifier	 New Analyzer Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
analyzerClassNames	TokenNameIdentifier	 analyzer Class Names
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NewAnalyzerTask	TokenNameIdentifier	 New Analyzer Task
(	TokenNameLPAREN	
PerfRunData	TokenNameIdentifier	 Perf Run Data
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
runData	TokenNameIdentifier	 run Data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
analyzerClassNames	TokenNameIdentifier	 analyzer Class Names
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
createAnalyzer	TokenNameIdentifier	 create Analyzer
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
// first try to use a ctor with version parameter (needed for many new Analyzers that have no default one anymore 	TokenNameCOMMENT_LINE	first try to use a ctor with version parameter (needed for many new Analyzers that have no default one anymore 
Constructor	TokenNameIdentifier	 Constructor
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
>	TokenNameGREATER	
cnstr	TokenNameIdentifier	 cnstr
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
getConstructor	TokenNameIdentifier	 get Constructor
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cnstr	TokenNameIdentifier	 cnstr
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
Version	TokenNameIdentifier	 Version
.	TokenNameDOT	
LUCENE_CURRENT	TokenNameIdentifier	 LUCENE  CURRENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// otherwise use default ctor 	TokenNameCOMMENT_LINE	otherwise use default ctor 
return	TokenNamereturn	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
>=	TokenNameGREATER_EQUAL	
analyzerClassNames	TokenNameIdentifier	 analyzer Class Names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
analyzerClassNames	TokenNameIdentifier	 analyzer Class Names
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
"org.apache.lucene.analysis.standard.StandardAnalyzer"	TokenNameStringLiteral	org.apache.lucene.analysis.standard.StandardAnalyzer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
className	TokenNameIdentifier	 class Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"standard."	TokenNameStringLiteral	standard.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
//there is no package name, assume o.a.l.analysis 	TokenNameCOMMENT_LINE	there is no package name, assume o.a.l.analysis 
{	TokenNameLBRACE	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
"org.apache.lucene.analysis."	TokenNameStringLiteral	org.apache.lucene.analysis.
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
createAnalyzer	TokenNameIdentifier	 create Analyzer
(	TokenNameLPAREN	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Changed Analyzer to: "	TokenNameStringLiteral	Changed Analyzer to: 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Error creating Analyzer: "	TokenNameStringLiteral	Error creating Analyzer: 
+	TokenNamePLUS	
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the params (analyzerClassName only), Comma-separate list of Analyzer class names. If the Analyzer lives in * org.apache.lucene.analysis, the name can be shortened by dropping the o.a.l.a part of the Fully Qualified Class Name. * <p/> * Example Declaration: {"NewAnalyzer" NewAnalyzer(WhitespaceAnalyzer, SimpleAnalyzer, StopAnalyzer, standard.StandardAnalyzer) > * @param params analyzerClassName, or empty for the StandardAnalyzer */	TokenNameCOMMENT_JAVADOC	 Set the params (analyzerClassName only), Comma-separate list of Analyzer class names. If the Analyzer lives in org.apache.lucene.analysis, the name can be shortened by dropping the o.a.l.a part of the Fully Qualified Class Name. <p/> Example Declaration: {"NewAnalyzer" NewAnalyzer(WhitespaceAnalyzer, SimpleAnalyzer, StopAnalyzer, standard.StandardAnalyzer) > @param params analyzerClassName, or empty for the StandardAnalyzer 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setParams	TokenNameIdentifier	 set Params
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
tokenizer	TokenNameIdentifier	 tokenizer
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
tokenizer	TokenNameIdentifier	 tokenizer
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
analyzerClassNames	TokenNameIdentifier	 analyzer Class Names
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.benchmark.byTask.tasks.PerfTask#supportsParams() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.benchmark.byTask.tasks.PerfTask#supportsParams() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
supportsParams	TokenNameIdentifier	 supports Params
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
