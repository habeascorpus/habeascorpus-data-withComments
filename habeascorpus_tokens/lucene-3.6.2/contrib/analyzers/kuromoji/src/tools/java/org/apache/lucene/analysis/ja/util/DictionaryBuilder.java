package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
File	TokenNameIdentifier	 File
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
DictionaryBuilder	TokenNameIdentifier	 Dictionary Builder
{	TokenNameLBRACE	
public	TokenNamepublic	
enum	TokenNameenum	
DictionaryFormat	TokenNameIdentifier	 Dictionary Format
{	TokenNameLBRACE	
IPADIC	TokenNameIdentifier	 IPADIC
,	TokenNameCOMMA	
UNIDIC	TokenNameIdentifier	 UNIDIC
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DictionaryBuilder	TokenNameIdentifier	 Dictionary Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
DictionaryFormat	TokenNameIdentifier	 Dictionary Format
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
inputDirname	TokenNameIdentifier	 input Dirname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
outputDirname	TokenNameIdentifier	 output Dirname
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
boolean	TokenNameboolean	
normalizeEntry	TokenNameIdentifier	 normalize Entry
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"building tokeninfo dict..."	TokenNameStringLiteral	building tokeninfo dict...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenInfoDictionaryBuilder	TokenNameIdentifier	 Token Info Dictionary Builder
tokenInfoBuilder	TokenNameIdentifier	 token Info Builder
=	TokenNameEQUAL	
new	TokenNamenew	
TokenInfoDictionaryBuilder	TokenNameIdentifier	 Token Info Dictionary Builder
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
normalizeEntry	TokenNameIdentifier	 normalize Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TokenInfoDictionaryWriter	TokenNameIdentifier	 Token Info Dictionary Writer
tokenInfoDictionary	TokenNameIdentifier	 token Info Dictionary
=	TokenNameEQUAL	
tokenInfoBuilder	TokenNameIdentifier	 token Info Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
inputDirname	TokenNameIdentifier	 input Dirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenInfoDictionary	TokenNameIdentifier	 token Info Dictionary
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
outputDirname	TokenNameIdentifier	 output Dirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenInfoDictionary	TokenNameIdentifier	 token Info Dictionary
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
tokenInfoBuilder	TokenNameIdentifier	 token Info Builder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"done"	TokenNameStringLiteral	done
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"building unknown word dict..."	TokenNameStringLiteral	building unknown word dict...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnknownDictionaryBuilder	TokenNameIdentifier	 Unknown Dictionary Builder
unkBuilder	TokenNameIdentifier	 unk Builder
=	TokenNameEQUAL	
new	TokenNamenew	
UnknownDictionaryBuilder	TokenNameIdentifier	 Unknown Dictionary Builder
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnknownDictionaryWriter	TokenNameIdentifier	 Unknown Dictionary Writer
unkDictionary	TokenNameIdentifier	 unk Dictionary
=	TokenNameEQUAL	
unkBuilder	TokenNameIdentifier	 unk Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
inputDirname	TokenNameIdentifier	 input Dirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDictionary	TokenNameIdentifier	 unk Dictionary
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
outputDirname	TokenNameIdentifier	 output Dirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
unkDictionary	TokenNameIdentifier	 unk Dictionary
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
unkBuilder	TokenNameIdentifier	 unk Builder
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"done"	TokenNameStringLiteral	done
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"building connection costs..."	TokenNameStringLiteral	building connection costs...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ConnectionCostsWriter	TokenNameIdentifier	 Connection Costs Writer
connectionCosts	TokenNameIdentifier	 connection Costs
=	TokenNameEQUAL	
ConnectionCostsBuilder	TokenNameIdentifier	 Connection Costs Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
inputDirname	TokenNameIdentifier	 input Dirname
+	TokenNamePLUS	
File	TokenNameIdentifier	 File
.	TokenNameDOT	
separator	TokenNameIdentifier	 separator
+	TokenNamePLUS	
"matrix.def"	TokenNameStringLiteral	matrix.def
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
connectionCosts	TokenNameIdentifier	 connection Costs
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
outputDirname	TokenNameIdentifier	 output Dirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"done"	TokenNameStringLiteral	done
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
DictionaryFormat	TokenNameIdentifier	 Dictionary Format
format	TokenNameIdentifier	 format
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"ipadic"	TokenNameStringLiteral	ipadic
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
DictionaryFormat	TokenNameIdentifier	 Dictionary Format
.	TokenNameDOT	
IPADIC	TokenNameIdentifier	 IPADIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
"unidic"	TokenNameStringLiteral	unidic
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
DictionaryFormat	TokenNameIdentifier	 Dictionary Format
.	TokenNameDOT	
UNIDIC	TokenNameIdentifier	 UNIDIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Illegal format "	TokenNameStringLiteral	Illegal format 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" using unidic instead"	TokenNameStringLiteral	 using unidic instead
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
format	TokenNameIdentifier	 format
=	TokenNameEQUAL	
DictionaryFormat	TokenNameIdentifier	 Dictionary Format
.	TokenNameDOT	
IPADIC	TokenNameIdentifier	 IPADIC
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
inputDirname	TokenNameIdentifier	 input Dirname
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
outputDirname	TokenNameIdentifier	 output Dirname
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
inputEncoding	TokenNameIdentifier	 input Encoding
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
normalizeEntries	TokenNameIdentifier	 normalize Entries
=	TokenNameEQUAL	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
parseBoolean	TokenNameIdentifier	 parse Boolean
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"dictionary builder"	TokenNameStringLiteral	dictionary builder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"dictionary format: "	TokenNameStringLiteral	dictionary format: 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"input directory: "	TokenNameStringLiteral	input directory: 
+	TokenNamePLUS	
inputDirname	TokenNameIdentifier	 input Dirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"output directory: "	TokenNameStringLiteral	output directory: 
+	TokenNamePLUS	
outputDirname	TokenNameIdentifier	 output Dirname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"input encoding: "	TokenNameStringLiteral	input encoding: 
+	TokenNamePLUS	
inputEncoding	TokenNameIdentifier	 input Encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"normalize entries: "	TokenNameStringLiteral	normalize entries: 
+	TokenNamePLUS	
normalizeEntries	TokenNameIdentifier	 normalize Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DictionaryBuilder	TokenNameIdentifier	 Dictionary Builder
.	TokenNameDOT	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
format	TokenNameIdentifier	 format
,	TokenNameCOMMA	
inputDirname	TokenNameIdentifier	 input Dirname
,	TokenNameCOMMA	
outputDirname	TokenNameIdentifier	 output Dirname
,	TokenNameCOMMA	
inputEncoding	TokenNameIdentifier	 input Encoding
,	TokenNameCOMMA	
normalizeEntries	TokenNameIdentifier	 normalize Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
