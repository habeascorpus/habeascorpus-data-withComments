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
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
PerfRunData	TokenNameIdentifier	 Perf Run Data
;	TokenNameSEMICOLON	
/** * Task to support benchmarking collation. * <p> * <ul> * <li> <code>NewCollationAnalyzer</code> with the default jdk impl * <li> <code>NewCollationAnalyzer(impl:icu)</code> specify an impl (jdk,icu) * </ul> * </p> */	TokenNameCOMMENT_JAVADOC	 Task to support benchmarking collation. <p> <ul> <li> <code>NewCollationAnalyzer</code> with the default jdk impl <li> <code>NewCollationAnalyzer(impl:icu)</code> specify an impl (jdk,icu) </ul> </p> 
public	TokenNamepublic	
class	TokenNameclass	
NewCollationAnalyzerTask	TokenNameIdentifier	 New Collation Analyzer Task
extends	TokenNameextends	
PerfTask	TokenNameIdentifier	 Perf Task
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
Implementation	TokenNameIdentifier	 Implementation
{	TokenNameLBRACE	
JDK	TokenNameIdentifier	 JDK
(	TokenNameLPAREN	
"org.apache.lucene.collation.CollationKeyAnalyzer"	TokenNameStringLiteral	org.apache.lucene.collation.CollationKeyAnalyzer
,	TokenNameCOMMA	
"java.text.Collator"	TokenNameStringLiteral	java.text.Collator
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ICU	TokenNameIdentifier	 ICU
(	TokenNameLPAREN	
"org.apache.lucene.collation.ICUCollationKeyAnalyzer"	TokenNameStringLiteral	org.apache.lucene.collation.ICUCollationKeyAnalyzer
,	TokenNameCOMMA	
"com.ibm.icu.text.Collator"	TokenNameStringLiteral	com.ibm.icu.text.Collator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
collatorClassName	TokenNameIdentifier	 collator Class Name
;	TokenNameSEMICOLON	
Implementation	TokenNameIdentifier	 Implementation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
className	TokenNameIdentifier	 class Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
collatorClassName	TokenNameIdentifier	 collator Class Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
className	TokenNameIdentifier	 class Name
=	TokenNameEQUAL	
className	TokenNameIdentifier	 class Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
collatorClassName	TokenNameIdentifier	 collator Class Name
=	TokenNameEQUAL	
collatorClassName	TokenNameIdentifier	 collator Class Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Implementation	TokenNameIdentifier	 Implementation
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
Implementation	TokenNameIdentifier	 Implementation
.	TokenNameDOT	
JDK	TokenNameIdentifier	 JDK
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NewCollationAnalyzerTask	TokenNameIdentifier	 New Collation Analyzer Task
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
static	TokenNamestatic	
Analyzer	TokenNameIdentifier	 Analyzer
createAnalyzer	TokenNameIdentifier	 create Analyzer
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
Implementation	TokenNameIdentifier	 Implementation
impl	TokenNameIdentifier	 impl
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
collatorClazz	TokenNameIdentifier	 collator Clazz
=	TokenNameEQUAL	
Class	TokenNameIdentifier	 Class
.	TokenNameDOT	
forName	TokenNameIdentifier	 for Name
(	TokenNameLPAREN	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
collatorClassName	TokenNameIdentifier	 collator Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Method	TokenNameIdentifier	 Method
collatorMethod	TokenNameIdentifier	 collator Method
=	TokenNameEQUAL	
collatorClazz	TokenNameIdentifier	 collator Clazz
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getInstance"	TokenNameStringLiteral	getInstance
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
collatorMethod	TokenNameIdentifier	 collator Method
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
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
collatorClazz	TokenNameIdentifier	 collator Clazz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ctor	TokenNameIdentifier	 ctor
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
collator	TokenNameIdentifier	 collator
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
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
getRunData	TokenNameIdentifier	 get Run Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Locale must be set with the NewLocale task!"	TokenNameStringLiteral	Locale must be set with the NewLocale task!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Analyzer	TokenNameIdentifier	 Analyzer
analyzer	TokenNameIdentifier	 analyzer
=	TokenNameEQUAL	
createAnalyzer	TokenNameIdentifier	 create Analyzer
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
,	TokenNameCOMMA	
impl	TokenNameIdentifier	 impl
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Changed Analyzer to: "	TokenNameStringLiteral	Changed Analyzer to: 
+	TokenNamePLUS	
analyzer	TokenNameIdentifier	 analyzer
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
locale	TokenNameIdentifier	 locale
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
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
"Error creating Analyzer: impl="	TokenNameStringLiteral	Error creating Analyzer: impl=
+	TokenNamePLUS	
impl	TokenNameIdentifier	 impl
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
// for now we only support the "impl" parameter. 	TokenNameCOMMENT_LINE	for now we only support the "impl" parameter. 
// TODO: add strength, decomposition, etc 	TokenNameCOMMENT_LINE	TODO: add strength, decomposition, etc 
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"impl"	TokenNameStringLiteral	impl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"icu"	TokenNameStringLiteral	icu
)	TokenNameRPAREN	
)	TokenNameRPAREN	
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
Implementation	TokenNameIdentifier	 Implementation
.	TokenNameDOT	
ICU	TokenNameIdentifier	 ICU
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"jdk"	TokenNameStringLiteral	jdk
)	TokenNameRPAREN	
)	TokenNameRPAREN	
impl	TokenNameIdentifier	 impl
=	TokenNameEQUAL	
Implementation	TokenNameIdentifier	 Implementation
.	TokenNameDOT	
JDK	TokenNameIdentifier	 JDK
;	TokenNameSEMICOLON	
else	TokenNameelse	
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
