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
ArrayList	TokenNameIdentifier	 Array List
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
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
PhraseQuery	TokenNameIdentifier	 Phrase Query
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
/** * Create sloppy phrase queries for performance test, in an index created using simple doc maker. */	TokenNameCOMMENT_JAVADOC	 Create sloppy phrase queries for performance test, in an index created using simple doc maker. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleSloppyPhraseQueryMaker	TokenNameIdentifier	 Simple Sloppy Phrase Query Maker
extends	TokenNameextends	
SimpleQueryMaker	TokenNameIdentifier	 Simple Query Maker
{	TokenNameLBRACE	
/* (non-Javadoc) * @see org.apache.lucene.benchmark.byTask.feeds.SimpleQueryMaker#prepareQueries() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.benchmark.byTask.feeds.SimpleQueryMaker#prepareQueries() 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
prepareQueries	TokenNameIdentifier	 prepare Queries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
// extract some 100 words from doc text to an array 	TokenNameCOMMENT_LINE	extract some 100 words from doc text to an array 
String	TokenNameIdentifier	 String
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
SingleDocSource	TokenNameIdentifier	 Single Doc Source
.	TokenNameDOT	
DOC_TEXT	TokenNameIdentifier	 DOC  TEXT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
words	TokenNameIdentifier	 words
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// create queries (that would find stuff) with varying slops 	TokenNameCOMMENT_LINE	create queries (that would find stuff) with varying slops 
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
queries	TokenNameIdentifier	 queries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
slop	TokenNameIdentifier	 slop
<	TokenNameLESS	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
slop	TokenNameIdentifier	 slop
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
qlen	TokenNameIdentifier	 qlen
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
qlen	TokenNameIdentifier	 qlen
<	TokenNameLESS	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
qlen	TokenNameIdentifier	 qlen
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
wd	TokenNameIdentifier	 wd
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
wd	TokenNameIdentifier	 wd
<	TokenNameLESS	
words	TokenNameIdentifier	 words
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
qlen	TokenNameIdentifier	 qlen
-	TokenNameMINUS	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
wd	TokenNameIdentifier	 wd
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ordered 	TokenNameCOMMENT_LINE	ordered 
int	TokenNameint	
remainedSlop	TokenNameIdentifier	 remained Slop
=	TokenNameEQUAL	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
PhraseQuery	TokenNameIdentifier	 Phrase Query
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
slop	TokenNameIdentifier	 slop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
wind	TokenNameIdentifier	 wind
=	TokenNameEQUAL	
wd	TokenNameIdentifier	 wd
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
qlen	TokenNameIdentifier	 qlen
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
,	TokenNameCOMMA	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
wind	TokenNameIdentifier	 wind
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remainedSlop	TokenNameIdentifier	 remained Slop
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remainedSlop	TokenNameIdentifier	 remained Slop
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
wind	TokenNameIdentifier	 wind
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reversed 	TokenNameCOMMENT_LINE	reversed 
remainedSlop	TokenNameIdentifier	 remained Slop
=	TokenNameEQUAL	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
slop	TokenNameIdentifier	 slop
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
qlen	TokenNameIdentifier	 qlen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wind	TokenNameIdentifier	 wind
=	TokenNameEQUAL	
wd	TokenNameIdentifier	 wd
+	TokenNamePLUS	
qlen	TokenNameIdentifier	 qlen
+	TokenNamePLUS	
remainedSlop	TokenNameIdentifier	 remained Slop
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
qlen	TokenNameIdentifier	 qlen
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
DocMaker	TokenNameIdentifier	 Doc Maker
.	TokenNameDOT	
BODY_FIELD	TokenNameIdentifier	 BODY  FIELD
,	TokenNameCOMMA	
words	TokenNameIdentifier	 words
[	TokenNameLBRACKET	
wind	TokenNameIdentifier	 wind
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
remainedSlop	TokenNameIdentifier	 remained Slop
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
remainedSlop	TokenNameIdentifier	 remained Slop
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
wind	TokenNameIdentifier	 wind
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
