/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
trec	TokenNameIdentifier	 trec
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
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
HashMap	TokenNameIdentifier	 Hash Map
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
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
Judge	TokenNameIdentifier	 Judge
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
quality	TokenNameIdentifier	 quality
.	TokenNameDOT	
QualityQuery	TokenNameIdentifier	 Quality Query
;	TokenNameSEMICOLON	
/** * Judge if given document is relevant to given quality query, based on Trec format for judgements. */	TokenNameCOMMENT_JAVADOC	 Judge if given document is relevant to given quality query, based on Trec format for judgements. 
public	TokenNamepublic	
class	TokenNameclass	
TrecJudge	TokenNameIdentifier	 Trec Judge
implements	TokenNameimplements	
Judge	TokenNameIdentifier	 Judge
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
>	TokenNameGREATER	
judgements	TokenNameIdentifier	 judgements
;	TokenNameSEMICOLON	
/** * Constructor from a reader. * <p> * Expected input format: * <pre> * qnum 0 doc-name is-relevant * </pre> * Two sample lines: * <pre> * 19 0 doc303 1 * 19 0 doc7295 0 * </pre> * @param reader where judgments are read from. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Constructor from a reader. <p> Expected input format: <pre> qnum 0 doc-name is-relevant </pre> Two sample lines: <pre> 19 0 doc303 1 19 0 doc7295 0 </pre> @param reader where judgments are read from. @throws IOException 
public	TokenNamepublic	
TrecJudge	TokenNameIdentifier	 Trec Judge
(	TokenNameLPAREN	
BufferedReader	TokenNameIdentifier	 Buffered Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
judgements	TokenNameIdentifier	 judgements
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
zero	TokenNameIdentifier	 zero
=	TokenNameEQUAL	
"0"	TokenNameStringLiteral	0
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
'#'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
queryID	TokenNameIdentifier	 query ID
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
docName	TokenNameIdentifier	 doc Name
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
relevant	TokenNameIdentifier	 relevant
=	TokenNameEQUAL	
!	TokenNameNOT	
zero	TokenNameIdentifier	 zero
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
!	TokenNameNOT	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
"wrong format: "	TokenNameStringLiteral	wrong format: 
+	TokenNamePLUS	
line	TokenNameIdentifier	 line
+	TokenNamePLUS	
" next: "	TokenNameStringLiteral	 next: 
+	TokenNamePLUS	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
relevant	TokenNameIdentifier	 relevant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only keep relevant docs 	TokenNameCOMMENT_LINE	only keep relevant docs 
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
queryID	TokenNameIdentifier	 query ID
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
queryID	TokenNameIdentifier	 query ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
judgements	TokenNameIdentifier	 judgements
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
queryID	TokenNameIdentifier	 query ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
new	TokenNamenew	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
(	TokenNameLPAREN	
queryID	TokenNameIdentifier	 query ID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
judgements	TokenNameIdentifier	 judgements
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
queryID	TokenNameIdentifier	 query ID
,	TokenNameCOMMA	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
addRelevandDoc	TokenNameIdentifier	 add Relevand Doc
(	TokenNameLPAREN	
docName	TokenNameIdentifier	 doc Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// inherit javadocs 	TokenNameCOMMENT_LINE	inherit javadocs 
public	TokenNamepublic	
boolean	TokenNameboolean	
isRelevant	TokenNameIdentifier	 is Relevant
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docName	TokenNameIdentifier	 doc Name
,	TokenNameCOMMA	
QualityQuery	TokenNameIdentifier	 Quality Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
qrj	TokenNameIdentifier	 qrj
=	TokenNameEQUAL	
judgements	TokenNameIdentifier	 judgements
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getQueryID	TokenNameIdentifier	 get Query ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
qrj	TokenNameIdentifier	 qrj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
qrj	TokenNameIdentifier	 qrj
.	TokenNameDOT	
isRelevant	TokenNameIdentifier	 is Relevant
(	TokenNameLPAREN	
docName	TokenNameIdentifier	 doc Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** single Judgement of a trec quality query */	TokenNameCOMMENT_JAVADOC	 single Judgement of a trec quality query 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
queryID	TokenNameIdentifier	 query ID
;	TokenNameSEMICOLON	
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
relevantDocs	TokenNameIdentifier	 relevant Docs
;	TokenNameSEMICOLON	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
queryID	TokenNameIdentifier	 query ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryID	TokenNameIdentifier	 query ID
=	TokenNameEQUAL	
queryID	TokenNameIdentifier	 query ID
;	TokenNameSEMICOLON	
relevantDocs	TokenNameIdentifier	 relevant Docs
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addRelevandDoc	TokenNameIdentifier	 add Relevand Doc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docName	TokenNameIdentifier	 doc Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
relevantDocs	TokenNameIdentifier	 relevant Docs
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
docName	TokenNameIdentifier	 doc Name
,	TokenNameCOMMA	
docName	TokenNameIdentifier	 doc Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isRelevant	TokenNameIdentifier	 is Relevant
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docName	TokenNameIdentifier	 doc Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
relevantDocs	TokenNameIdentifier	 relevant Docs
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
docName	TokenNameIdentifier	 doc Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
maxRecall	TokenNameIdentifier	 max Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
relevantDocs	TokenNameIdentifier	 relevant Docs
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// inherit javadocs 	TokenNameCOMMENT_LINE	inherit javadocs 
public	TokenNamepublic	
boolean	TokenNameboolean	
validateData	TokenNameIdentifier	 validate Data
(	TokenNameLPAREN	
QualityQuery	TokenNameIdentifier	 Quality Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
qq	TokenNameIdentifier	 qq
,	TokenNameCOMMA	
PrintWriter	TokenNameIdentifier	 Print Writer
logger	TokenNameIdentifier	 logger
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
>	TokenNameGREATER	
missingQueries	TokenNameIdentifier	 missing Queries
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
>	TokenNameGREATER	
(	TokenNameLPAREN	
judgements	TokenNameIdentifier	 judgements
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
missingJudgements	TokenNameIdentifier	 missing Judgements
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
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
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
qq	TokenNameIdentifier	 qq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getQueryID	TokenNameIdentifier	 get Query ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
missingQueries	TokenNameIdentifier	 missing Queries
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
missingQueries	TokenNameIdentifier	 missing Queries
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
missingJudgements	TokenNameIdentifier	 missing Judgements
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isValid	TokenNameIdentifier	 is Valid
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
missingJudgements	TokenNameIdentifier	 missing Judgements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isValid	TokenNameIdentifier	 is Valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARNING: "	TokenNameStringLiteral	WARNING: 
+	TokenNamePLUS	
missingJudgements	TokenNameIdentifier	 missing Judgements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" queries have no judgments! - "	TokenNameStringLiteral	 queries have no judgments! - 
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
missingJudgements	TokenNameIdentifier	 missing Judgements
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
missingJudgements	TokenNameIdentifier	 missing Judgements
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
missingQueries	TokenNameIdentifier	 missing Queries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isValid	TokenNameIdentifier	 is Valid
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARNING: "	TokenNameStringLiteral	WARNING: 
+	TokenNamePLUS	
missingQueries	TokenNameIdentifier	 missing Queries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" judgments match no query! - "	TokenNameStringLiteral	 judgments match no query! - 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
id	TokenNameIdentifier	 id
:	TokenNameCOLON	
missingQueries	TokenNameIdentifier	 missing Queries
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
isValid	TokenNameIdentifier	 is Valid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// inherit javadocs 	TokenNameCOMMENT_LINE	inherit javadocs 
public	TokenNamepublic	
int	TokenNameint	
maxRecall	TokenNameIdentifier	 max Recall
(	TokenNameLPAREN	
QualityQuery	TokenNameIdentifier	 Quality Query
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QRelJudgement	TokenNameIdentifier	 Q Rel Judgement
qrj	TokenNameIdentifier	 qrj
=	TokenNameEQUAL	
judgements	TokenNameIdentifier	 judgements
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
getQueryID	TokenNameIdentifier	 get Query ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
qrj	TokenNameIdentifier	 qrj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
qrj	TokenNameIdentifier	 qrj
.	TokenNameDOT	
maxRecall	TokenNameIdentifier	 max Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
