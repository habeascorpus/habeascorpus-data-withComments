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
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Constructor	TokenNameIdentifier	 Constructor
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
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
shingle	TokenNameIdentifier	 shingle
.	TokenNameDOT	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
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
shingle	TokenNameIdentifier	 shingle
.	TokenNameDOT	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
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
/** * Task to support benchmarking ShingleFilter / ShingleAnalyzerWrapper * <p> * <ul> * <li> <code>NewShingleAnalyzer</code> (constructs with all defaults) * <li> <code>NewShingleAnalyzer(analyzer:o.a.l.analysis.StandardAnalyzer,maxShingleSize:2,outputUnigrams:true)</code> * </ul> * </p> */	TokenNameCOMMENT_JAVADOC	 Task to support benchmarking ShingleFilter / ShingleAnalyzerWrapper <p> <ul> <li> <code>NewShingleAnalyzer</code> (constructs with all defaults) <li> <code>NewShingleAnalyzer(analyzer:o.a.l.analysis.StandardAnalyzer,maxShingleSize:2,outputUnigrams:true)</code> </ul> </p> 
public	TokenNamepublic	
class	TokenNameclass	
NewShingleAnalyzerTask	TokenNameIdentifier	 New Shingle Analyzer Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
=	TokenNameEQUAL	
"standard.StandardAnalyzer"	TokenNameStringLiteral	standard.StandardAnalyzer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
outputUnigrams	TokenNameIdentifier	 output Unigrams
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NewShingleAnalyzerTask	TokenNameIdentifier	 New Shingle Analyzer Task
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
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
>	TokenNameGREATER	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Analyzer	TokenNameIdentifier	 Analyzer
wrappedAnalyzer	TokenNameIdentifier	 wrapped Analyzer
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
=	TokenNameEQUAL	
"org.apache.lucene.analysis.standard.StandardAnalyzer"	TokenNameStringLiteral	org.apache.lucene.analysis.standard.StandardAnalyzer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"standard."	TokenNameStringLiteral	standard.
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//there is no package name, assume o.a.l.analysis 	TokenNameCOMMENT_LINE	there is no package name, assume o.a.l.analysis 
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
=	TokenNameEQUAL	
"org.apache.lucene.analysis."	TokenNameStringLiteral	org.apache.lucene.analysis.
+	TokenNamePLUS	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
clazz	TokenNameIdentifier	 clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
)	TokenNameRPAREN	
.	TokenNameDOT	
asSubclass	TokenNameIdentifier	 as Subclass
(	TokenNameLPAREN	
Analyzer	TokenNameIdentifier	 Analyzer
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// first try to use a ctor with version parameter (needed for many new 	TokenNameCOMMENT_LINE	first try to use a ctor with version parameter (needed for many new 
// Analyzers that have no default one anymore) 	TokenNameCOMMENT_LINE	Analyzers that have no default one anymore) 
Constructor	TokenNameIdentifier	 Constructor
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
Analyzer	TokenNameIdentifier	 Analyzer
>	TokenNameGREATER	
ctor	TokenNameIdentifier	 ctor
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
wrappedAnalyzer	TokenNameIdentifier	 wrapped Analyzer
=	TokenNameEQUAL	
ctor	TokenNameIdentifier	 ctor
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
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// otherwise use default ctor 	TokenNameCOMMENT_LINE	otherwise use default ctor 
wrappedAnalyzer	TokenNameIdentifier	 wrapped Analyzer
=	TokenNameEQUAL	
clazz	TokenNameIdentifier	 clazz
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
new	TokenNamenew	
ShingleAnalyzerWrapper	TokenNameIdentifier	 Shingle Analyzer Wrapper
(	TokenNameLPAREN	
wrappedAnalyzer	TokenNameIdentifier	 wrapped Analyzer
,	TokenNameCOMMA	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
DEFAULT_MIN_SHINGLE_SIZE	TokenNameIdentifier	 DEFAULT  MIN  SHINGLE  SIZE
,	TokenNameCOMMA	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
,	TokenNameCOMMA	
ShingleFilter	TokenNameIdentifier	 Shingle Filter
.	TokenNameDOT	
TOKEN_SEPARATOR	TokenNameIdentifier	 TOKEN  SEPARATOR
,	TokenNameCOMMA	
outputUnigrams	TokenNameIdentifier	 output Unigrams
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
analyzer	TokenNameIdentifier	 analyzer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
doLogic	TokenNameIdentifier	 do Logic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
setAnalyzer	TokenNameIdentifier	 set Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Changed Analyzer to: ShingleAnalyzerWrapper, wrapping ShingleFilter over"	TokenNameStringLiteral	Changed Analyzer to: ShingleAnalyzerWrapper, wrapping ShingleFilter over
+	TokenNamePLUS	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
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
"Error creating Analyzer"	TokenNameStringLiteral	Error creating Analyzer
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
params	TokenNameIdentifier	 params
,	TokenNameCOMMA	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
expr	TokenNameIdentifier	 expr
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
,	TokenNameCOMMA	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
expr	TokenNameIdentifier	 expr
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"analyzer"	TokenNameStringLiteral	analyzer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
analyzerClassName	TokenNameIdentifier	 analyzer Class Name
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"outputUnigrams"	TokenNameStringLiteral	outputUnigrams
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
outputUnigrams	TokenNameIdentifier	 output Unigrams
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"maxShingleSize"	TokenNameStringLiteral	maxShingleSize
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxShingleSize	TokenNameIdentifier	 max Shingle Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
parseDouble	TokenNameIdentifier	 parse Double
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Unknown parameter "	TokenNameStringLiteral	Unknown parameter 
+	TokenNamePLUS	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
