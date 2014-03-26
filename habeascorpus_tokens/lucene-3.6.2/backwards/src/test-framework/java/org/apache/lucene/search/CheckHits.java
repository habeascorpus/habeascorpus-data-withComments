package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeSet	TokenNameIdentifier	 Tree Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
Assert	TokenNameIdentifier	 Assert
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
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
CheckHits	TokenNameIdentifier	 Check Hits
{	TokenNameLBRACE	
/** * Some explains methods calculate their values though a slightly * different order of operations from the actual scoring method ... * this allows for a small amount of variation */	TokenNameCOMMENT_JAVADOC	 Some explains methods calculate their values though a slightly different order of operations from the actual scoring method ... this allows for a small amount of variation 
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
EXPLAIN_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 EXPLAIN  SCORE  TOLERANCE  DELTA
=	TokenNameEQUAL	
0.0002f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * Tests that all documents up to maxDoc which are *not* in the * expected result set, have an explanation which indicates that * the document does not match */	TokenNameCOMMENT_JAVADOC	 Tests that all documents up to maxDoc which are *not* in the expected result set, have an explanation which indicates that the document does not match 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkNoMatchExplanations	TokenNameIdentifier	 check No Match Explanations
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
defaultFieldName	TokenNameIdentifier	 default Field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
ignore	TokenNameIdentifier	 ignore
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ignore	TokenNameIdentifier	 ignore
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ignore	TokenNameIdentifier	 ignore
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Explanation of [["	TokenNameStringLiteral	Explanation of [[
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
"]] for #"	TokenNameStringLiteral	]] for #
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" is null"	TokenNameStringLiteral	 is null
,	TokenNameCOMMA	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertFalse	TokenNameIdentifier	 assert False
(	TokenNameLPAREN	
"Explanation of [["	TokenNameStringLiteral	Explanation of [[
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
"]] for #"	TokenNameStringLiteral	]] for #
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" doesn't indicate non-match: "	TokenNameStringLiteral	 doesn't indicate non-match: 
+	TokenNamePLUS	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests that a query matches the an expected set of documents using a * HitCollector. * * <p> * Note that when using the HitCollector API, documents will be collected * if they "match" regardless of what their score is. * </p> * @param query the query to test * @param searcher the searcher to test the query against * @param defaultFieldName used for displaying the query in assertion messages * @param results a list of documentIds that must match the query * @see Searcher#search(Query,Collector) * @see #checkHits */	TokenNameCOMMENT_JAVADOC	 Tests that a query matches the an expected set of documents using a HitCollector. * <p> Note that when using the HitCollector API, documents will be collected if they "match" regardless of what their score is. </p> @param query the query to test @param searcher the searcher to test the query against @param defaultFieldName used for displaying the query in assertion messages @param results a list of documentIds that must match the query @see Searcher#search(Query,Collector) @see #checkHits 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkHitCollector	TokenNameIdentifier	 check Hit Collector
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
correct	TokenNameIdentifier	 correct
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
correct	TokenNameIdentifier	 correct
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
SetCollector	TokenNameIdentifier	 Set Collector
(	TokenNameLPAREN	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Simple: "	TokenNameStringLiteral	Simple: 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
defaultFieldName	TokenNameIdentifier	 default Field Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correct	TokenNameIdentifier	 correct
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
wrapSearcher	TokenNameIdentifier	 wrap Searcher
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrap Searcher "	TokenNameStringLiteral	Wrap Searcher 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
defaultFieldName	TokenNameIdentifier	 default Field Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correct	TokenNameIdentifier	 correct
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
instanceof	TokenNameinstanceof	
IndexSearcher	TokenNameIdentifier	 Index Searcher
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
wrapUnderlyingReader	TokenNameIdentifier	 wrap Underlying Reader
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
(	TokenNameLPAREN	
IndexSearcher	TokenNameIdentifier	 Index Searcher
)	TokenNameRPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Wrap Reader "	TokenNameStringLiteral	Wrap Reader 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
defaultFieldName	TokenNameIdentifier	 default Field Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correct	TokenNameIdentifier	 correct
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SetCollector	TokenNameIdentifier	 Set Collector
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
bag	TokenNameIdentifier	 bag
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SetCollector	TokenNameIdentifier	 Set Collector
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
bag	TokenNameIdentifier	 bag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bag	TokenNameIdentifier	 bag
=	TokenNameEQUAL	
bag	TokenNameIdentifier	 bag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bag	TokenNameIdentifier	 bag
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
base	TokenNameIdentifier	 base
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tests that a query matches the an expected set of documents using Hits. * * <p> * Note that when using the Hits API, documents will only be returned * if they have a positive normalized score. * </p> * @param query the query to test * @param searcher the searcher to test the query against * @param defaultFieldName used for displaing the query in assertion messages * @param results a list of documentIds that must match the query * @see Searcher#search(Query, int) * @see #checkHitCollector */	TokenNameCOMMENT_JAVADOC	 Tests that a query matches the an expected set of documents using Hits. * <p> Note that when using the Hits API, documents will only be returned if they have a positive normalized score. </p> @param query the query to test @param searcher the searcher to test the query against @param defaultFieldName used for displaing the query in assertion messages @param results a list of documentIds that must match the query @see Searcher#search(Query, int) @see #checkHitCollector 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkHits	TokenNameIdentifier	 check Hits
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
=	TokenNameEQUAL	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
correct	TokenNameIdentifier	 correct
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
correct	TokenNameIdentifier	 correct
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
actual	TokenNameIdentifier	 actual
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
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
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
actual	TokenNameIdentifier	 actual
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
defaultFieldName	TokenNameIdentifier	 default Field Name
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correct	TokenNameIdentifier	 correct
,	TokenNameCOMMA	
actual	TokenNameIdentifier	 actual
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryUtils	TokenNameIdentifier	 Query Utils
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Tests that a Hits has an expected order of documents */	TokenNameCOMMENT_JAVADOC	 Tests that a Hits has an expected order of documents 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkDocIds	TokenNameIdentifier	 check Doc Ids
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
mes	TokenNameIdentifier	 mes
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits	TokenNameIdentifier	 hits
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
mes	TokenNameIdentifier	 mes
+	TokenNamePLUS	
" nr of hits"	TokenNameStringLiteral	 nr of hits
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
results	TokenNameIdentifier	 results
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
mes	TokenNameIdentifier	 mes
+	TokenNamePLUS	
" doc nrs for hit "	TokenNameStringLiteral	 doc nrs for hit 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
hits	TokenNameIdentifier	 hits
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Tests that two queries have an expected order of documents, * and that the two queries have the same score values. */	TokenNameCOMMENT_JAVADOC	 Tests that two queries have an expected order of documents, and that the two queries have the same score values. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkHitsQuery	TokenNameIdentifier	 check Hits Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits1	TokenNameIdentifier	 hits1
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits2	TokenNameIdentifier	 hits2
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkDocIds	TokenNameIdentifier	 check Doc Ids
(	TokenNameLPAREN	
"hits1"	TokenNameStringLiteral	hits1
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
hits1	TokenNameIdentifier	 hits1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkDocIds	TokenNameIdentifier	 check Doc Ids
(	TokenNameLPAREN	
"hits2"	TokenNameStringLiteral	hits2
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
,	TokenNameCOMMA	
hits2	TokenNameIdentifier	 hits2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkEqual	TokenNameIdentifier	 check Equal
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
hits1	TokenNameIdentifier	 hits1
,	TokenNameCOMMA	
hits2	TokenNameIdentifier	 hits2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkEqual	TokenNameIdentifier	 check Equal
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits1	TokenNameIdentifier	 hits1
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits2	TokenNameIdentifier	 hits2
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
float	TokenNamefloat	
scoreTolerance	TokenNameIdentifier	 score Tolerance
=	TokenNameEQUAL	
1.0e-6f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hits1	TokenNameIdentifier	 hits1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
hits2	TokenNameIdentifier	 hits2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Unequal lengths: hits1="	TokenNameStringLiteral	Unequal lengths: hits1=
+	TokenNamePLUS	
hits1	TokenNameIdentifier	 hits1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
",hits2="	TokenNameStringLiteral	,hits2=
+	TokenNamePLUS	
hits2	TokenNameIdentifier	 hits2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
hits1	TokenNameIdentifier	 hits1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hits1	TokenNameIdentifier	 hits1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
hits2	TokenNameIdentifier	 hits2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Hit "	TokenNameStringLiteral	Hit 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" docnumbers don't match "	TokenNameStringLiteral	 docnumbers don't match 
+	TokenNamePLUS	
hits2str	TokenNameIdentifier	 hits2str
(	TokenNameLPAREN	
hits1	TokenNameIdentifier	 hits1
,	TokenNameCOMMA	
hits2	TokenNameIdentifier	 hits2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"for query:"	TokenNameStringLiteral	for query:
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
hits1	TokenNameIdentifier	 hits1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
hits2	TokenNameIdentifier	 hits2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
hits1	TokenNameIdentifier	 hits1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
-	TokenNameMINUS	
hits2	TokenNameIdentifier	 hits2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
>	TokenNameGREATER	
scoreTolerance	TokenNameIdentifier	 score Tolerance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"Hit "	TokenNameStringLiteral	Hit 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
", doc nrs "	TokenNameStringLiteral	, doc nrs 
+	TokenNamePLUS	
hits1	TokenNameIdentifier	 hits1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" and "	TokenNameStringLiteral	 and 
+	TokenNamePLUS	
hits2	TokenNameIdentifier	 hits2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" unequal : "	TokenNameStringLiteral	 unequal : 
+	TokenNamePLUS	
hits1	TokenNameIdentifier	 hits1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
" and: "	TokenNameStringLiteral	 and: 
+	TokenNamePLUS	
hits2	TokenNameIdentifier	 hits2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
" for query:"	TokenNameStringLiteral	 for query:
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
hits2str	TokenNameIdentifier	 hits2str
(	TokenNameLPAREN	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits1	TokenNameIdentifier	 hits1
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hits2	TokenNameIdentifier	 hits2
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len1	TokenNameIdentifier	 len1
=	TokenNameEQUAL	
hits1	TokenNameIdentifier	 hits1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
hits1	TokenNameIdentifier	 hits1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
len2	TokenNameIdentifier	 len2
=	TokenNameEQUAL	
hits2	TokenNameIdentifier	 hits2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
hits2	TokenNameIdentifier	 hits2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
,	TokenNameCOMMA	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"Hits length1="	TokenNameStringLiteral	Hits length1=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" length2="	TokenNameStringLiteral	 length2=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"hit="	TokenNameStringLiteral	hit=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len1	TokenNameIdentifier	 len1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" doc"	TokenNameStringLiteral	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hits1	TokenNameIdentifier	 hits1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hits1	TokenNameIdentifier	 hits1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" doc"	TokenNameStringLiteral	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hits2	TokenNameIdentifier	 hits2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
hits2	TokenNameIdentifier	 hits2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
topdocsString	TokenNameIdentifier	 topdocs String
(	TokenNameLPAREN	
TopDocs	TokenNameIdentifier	 Top Docs
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"TopDocs totalHits="	TokenNameStringLiteral	TopDocs totalHits=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" top="	TokenNameStringLiteral	 top=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
else	TokenNameelse	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
") doc="	TokenNameStringLiteral	) doc=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" score="	TokenNameStringLiteral	 score=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Asserts that the explanation value for every document matching a * query corresponds with the true score. * * @see ExplanationAsserter * @see #checkExplanations(Query, String, Searcher, boolean) for a * "deep" testing of the explanation details. * * @param query the query to test * @param searcher the searcher to test the query against * @param defaultFieldName used for displaing the query in assertion messages */	TokenNameCOMMENT_JAVADOC	 Asserts that the explanation value for every document matching a query corresponds with the true score. * @see ExplanationAsserter @see #checkExplanations(Query, String, Searcher, boolean) for a "deep" testing of the explanation details. * @param query the query to test @param searcher the searcher to test the query against @param defaultFieldName used for displaing the query in assertion messages 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkExplanations	TokenNameIdentifier	 check Explanations
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkExplanations	TokenNameIdentifier	 check Explanations
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Asserts that the explanation value for every document matching a * query corresponds with the true score. Optionally does "deep" * testing of the explanation details. * * @see ExplanationAsserter * @param query the query to test * @param searcher the searcher to test the query against * @param defaultFieldName used for displaing the query in assertion messages * @param deep indicates whether a deep comparison of sub-Explanation details should be executed */	TokenNameCOMMENT_JAVADOC	 Asserts that the explanation value for every document matching a query corresponds with the true score. Optionally does "deep" testing of the explanation details. * @see ExplanationAsserter @param query the query to test @param searcher the searcher to test the query against @param defaultFieldName used for displaing the query in assertion messages @param deep indicates whether a deep comparison of sub-Explanation details should be executed 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
checkExplanations	TokenNameIdentifier	 check Explanations
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
searcher	TokenNameIdentifier	 searcher
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
new	TokenNamenew	
ExplanationAsserter	TokenNameIdentifier	 Explanation Asserter
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assert that an explanation has the expected score, and optionally that its * sub-details max/sum/factor match to that score. * * @param q String representation of the query for assertion messages * @param doc Document ID for assertion messages * @param score Real score value of doc with query q * @param deep indicates whether a deep comparison of sub-Explanation details should be executed * @param expl The Explanation to match against score */	TokenNameCOMMENT_JAVADOC	 Assert that an explanation has the expected score, and optionally that its sub-details max/sum/factor match to that score. * @param q String representation of the query for assertion messages @param doc Document ID for assertion messages @param score Real score value of doc with query q @param deep indicates whether a deep comparison of sub-Explanation details should be executed @param expl The Explanation to match against score 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
verifyExplanation	TokenNameIdentifier	 verify Explanation
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
,	TokenNameCOMMA	
Explanation	TokenNameIdentifier	 Explanation
expl	TokenNameIdentifier	 expl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
expl	TokenNameIdentifier	 expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
": score(doc="	TokenNameStringLiteral	: score(doc=
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
")="	TokenNameStringLiteral	)=
+	TokenNamePLUS	
score	TokenNameIdentifier	 score
+	TokenNamePLUS	
" != explanationScore="	TokenNameStringLiteral	 != explanationScore=
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" Explanation: "	TokenNameStringLiteral	 Explanation: 
+	TokenNamePLUS	
expl	TokenNameIdentifier	 expl
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
EXPLAIN_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 EXPLAIN  SCORE  TOLERANCE  DELTA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
detail	TokenNameIdentifier	 detail
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
expl	TokenNameIdentifier	 expl
.	TokenNameDOT	
getDetails	TokenNameIdentifier	 get Details
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
detail	TokenNameIdentifier	 detail
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
detail	TokenNameIdentifier	 detail
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// simple containment, no matter what the description says, 	TokenNameCOMMENT_LINE	simple containment, no matter what the description says, 
// just verify contained expl has same score 	TokenNameCOMMENT_LINE	just verify contained expl has same score 
verifyExplanation	TokenNameIdentifier	 verify Explanation
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
,	TokenNameCOMMA	
detail	TokenNameIdentifier	 detail
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// explanation must either: 	TokenNameCOMMENT_LINE	explanation must either: 
// - end with one of: "product of:", "sum of:", "max of:", or 	TokenNameCOMMENT_LINE	- end with one of: "product of:", "sum of:", "max of:", or 
// - have "max plus <x> times others" (where <x> is float). 	TokenNameCOMMENT_LINE	- have "max plus <x> times others" (where <x> is float). 
float	TokenNamefloat	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
descr	TokenNameIdentifier	 descr
=	TokenNameEQUAL	
expl	TokenNameIdentifier	 expl
.	TokenNameDOT	
getDescription	TokenNameIdentifier	 get Description
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
productOf	TokenNameIdentifier	 product Of
=	TokenNameEQUAL	
descr	TokenNameIdentifier	 descr
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"product of:"	TokenNameStringLiteral	product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
sumOf	TokenNameIdentifier	 sum Of
=	TokenNameEQUAL	
descr	TokenNameIdentifier	 descr
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"sum of:"	TokenNameStringLiteral	sum of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
maxOf	TokenNameIdentifier	 max Of
=	TokenNameEQUAL	
descr	TokenNameIdentifier	 descr
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
"max of:"	TokenNameStringLiteral	max of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
maxTimesOthers	TokenNameIdentifier	 max Times Others
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
productOf	TokenNameIdentifier	 product Of
||	TokenNameOR_OR	
sumOf	TokenNameIdentifier	 sum Of
||	TokenNameOR_OR	
maxOf	TokenNameIdentifier	 max Of
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// maybe 'max plus x times others' 	TokenNameCOMMENT_LINE	maybe 'max plus x times others' 
int	TokenNameint	
k1	TokenNameIdentifier	 k1
=	TokenNameEQUAL	
descr	TokenNameIdentifier	 descr
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
"max plus "	TokenNameStringLiteral	max plus 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k1	TokenNameIdentifier	 k1
+=	TokenNamePLUS_EQUAL	
"max plus "	TokenNameStringLiteral	max plus 
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
k2	TokenNameIdentifier	 k2
=	TokenNameEQUAL	
descr	TokenNameIdentifier	 descr
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
,	TokenNameCOMMA	
k1	TokenNameIdentifier	 k1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
descr	TokenNameIdentifier	 descr
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k1	TokenNameIdentifier	 k1
,	TokenNameCOMMA	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
descr	TokenNameIdentifier	 descr
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k2	TokenNameIdentifier	 k2
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"times others of:"	TokenNameStringLiteral	times others of:
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
maxTimesOthers	TokenNameIdentifier	 max Times Others
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
": multi valued explanation description=""	TokenNameStringLiteral	: multi valued explanation description="
+	TokenNamePLUS	
descr	TokenNameIdentifier	 descr
+	TokenNamePLUS	
"" must be 'max of plus x times others' or end with 'product of'"	TokenNameStringLiteral	" must be 'max of plus x times others' or end with 'product of'
+	TokenNamePLUS	
" or 'sum of:' or 'max of:' - "	TokenNameStringLiteral	 or 'sum of:' or 'max of:' - 
+	TokenNamePLUS	
expl	TokenNameIdentifier	 expl
,	TokenNameCOMMA	
productOf	TokenNameIdentifier	 product Of
||	TokenNameOR_OR	
sumOf	TokenNameIdentifier	 sum Of
||	TokenNameOR_OR	
maxOf	TokenNameIdentifier	 max Of
||	TokenNameOR_OR	
maxTimesOthers	TokenNameIdentifier	 max Times Others
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
product	TokenNameIdentifier	 product
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
detail	TokenNameIdentifier	 detail
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
dval	TokenNameIdentifier	 dval
=	TokenNameEQUAL	
detail	TokenNameIdentifier	 detail
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verifyExplanation	TokenNameIdentifier	 verify Explanation
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
dval	TokenNameIdentifier	 dval
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
,	TokenNameCOMMA	
detail	TokenNameIdentifier	 detail
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
product	TokenNameIdentifier	 product
*=	TokenNameMULTIPLY_EQUAL	
dval	TokenNameIdentifier	 dval
;	TokenNameSEMICOLON	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
dval	TokenNameIdentifier	 dval
;	TokenNameSEMICOLON	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
dval	TokenNameIdentifier	 dval
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
combined	TokenNameIdentifier	 combined
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
productOf	TokenNameIdentifier	 product Of
)	TokenNameRPAREN	
{	TokenNameLBRACE	
combined	TokenNameIdentifier	 combined
=	TokenNameEQUAL	
product	TokenNameIdentifier	 product
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sumOf	TokenNameIdentifier	 sum Of
)	TokenNameRPAREN	
{	TokenNameLBRACE	
combined	TokenNameIdentifier	 combined
=	TokenNameEQUAL	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
maxOf	TokenNameIdentifier	 max Of
)	TokenNameRPAREN	
{	TokenNameLBRACE	
combined	TokenNameIdentifier	 combined
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
maxTimesOthers	TokenNameIdentifier	 max Times Others
)	TokenNameRPAREN	
{	TokenNameLBRACE	
combined	TokenNameIdentifier	 combined
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
+	TokenNamePLUS	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
sum	TokenNameIdentifier	 sum
-	TokenNameMINUS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"should never get here!"	TokenNameStringLiteral	should never get here!
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
+	TokenNamePLUS	
": actual subDetails combined=="	TokenNameStringLiteral	: actual subDetails combined==
+	TokenNamePLUS	
combined	TokenNameIdentifier	 combined
+	TokenNamePLUS	
" != value="	TokenNameStringLiteral	 != value=
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
+	TokenNamePLUS	
" Explanation: "	TokenNameStringLiteral	 Explanation: 
+	TokenNamePLUS	
expl	TokenNameIdentifier	 expl
,	TokenNameCOMMA	
combined	TokenNameIdentifier	 combined
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
EXPLAIN_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 EXPLAIN  SCORE  TOLERANCE  DELTA
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * an IndexSearcher that implicitly checks hte explanation of every match * whenever it executes a search. * * @see ExplanationAsserter */	TokenNameCOMMENT_JAVADOC	 an IndexSearcher that implicitly checks hte explanation of every match whenever it executes a search. * @see ExplanationAsserter 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ExplanationAssertingSearcher	TokenNameIdentifier	 Explanation Asserting Searcher
extends	TokenNameextends	
IndexSearcher	TokenNameIdentifier	 Index Searcher
{	TokenNameLBRACE	
public	TokenNamepublic	
ExplanationAssertingSearcher	TokenNameIdentifier	 Explanation Asserting Searcher
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
checkExplanations	TokenNameIdentifier	 check Explanations
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
new	TokenNamenew	
ExplanationAsserter	TokenNameIdentifier	 Explanation Asserter
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TopFieldDocs	TokenNameIdentifier	 Top Field Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkExplanations	TokenNameIdentifier	 check Explanations
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
sort	TokenNameIdentifier	 sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkExplanations	TokenNameIdentifier	 check Explanations
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Collector	TokenNameIdentifier	 Collector
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkExplanations	TokenNameIdentifier	 check Explanations
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
TopDocs	TokenNameIdentifier	 Top Docs
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
checkExplanations	TokenNameIdentifier	 check Explanations
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Asserts that the score explanation for every document matching a * query corresponds with the true score. * * NOTE: this HitCollector should only be used with the Query and Searcher * specified at when it is constructed. * * @see CheckHits#verifyExplanation */	TokenNameCOMMENT_JAVADOC	 Asserts that the score explanation for every document matching a query corresponds with the true score. * NOTE: this HitCollector should only be used with the Query and Searcher specified at when it is constructed. * @see CheckHits#verifyExplanation 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
ExplanationAsserter	TokenNameIdentifier	 Explanation Asserter
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
/** * @deprecated * @see CheckHits#EXPLAIN_SCORE_TOLERANCE_DELTA */	TokenNameCOMMENT_JAVADOC	 @deprecated @see CheckHits#EXPLAIN_SCORE_TOLERANCE_DELTA 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
static	TokenNamestatic	
float	TokenNamefloat	
SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 SCORE  TOLERANCE  DELTA
=	TokenNameEQUAL	
0.00005f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
Searcher	TokenNameIdentifier	 Searcher
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constructs an instance which does shallow tests on the Explanation */	TokenNameCOMMENT_JAVADOC	 Constructs an instance which does shallow tests on the Explanation 
public	TokenNamepublic	
ExplanationAsserter	TokenNameIdentifier	 Explanation Asserter
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExplanationAsserter	TokenNameIdentifier	 Explanation Asserter
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
defaultFieldName	TokenNameIdentifier	 default Field Name
,	TokenNameCOMMA	
Searcher	TokenNameIdentifier	 Searcher
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
boolean	TokenNameboolean	
deep	TokenNameIdentifier	 deep
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
defaultFieldName	TokenNameIdentifier	 default Field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
deep	TokenNameIdentifier	 deep
=	TokenNameEQUAL	
deep	TokenNameIdentifier	 deep
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
base	TokenNameIdentifier	 base
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
exp	TokenNameIdentifier	 exp
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
q	TokenNameIdentifier	 q
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"exception in hitcollector of [["	TokenNameStringLiteral	exception in hitcollector of [[
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
"]] for #"	TokenNameStringLiteral	]] for #
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
"Explanation of [["	TokenNameStringLiteral	Explanation of [[
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
"]] for #"	TokenNameStringLiteral	]] for #
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" is null"	TokenNameStringLiteral	 is null
,	TokenNameCOMMA	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
verifyExplanation	TokenNameIdentifier	 verify Explanation
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
deep	TokenNameIdentifier	 deep
,	TokenNameCOMMA	
exp	TokenNameIdentifier	 exp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Assert	TokenNameIdentifier	 Assert
.	TokenNameDOT	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
"Explanation of [["	TokenNameStringLiteral	Explanation of [[
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
+	TokenNamePLUS	
"]] for #"	TokenNameStringLiteral	]] for #
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
" does not indicate match: "	TokenNameStringLiteral	 does not indicate match: 
+	TokenNamePLUS	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
exp	TokenNameIdentifier	 exp
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
base	TokenNameIdentifier	 base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
acceptsDocsOutOfOrder	TokenNameIdentifier	 accepts Docs Out Of Order
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
