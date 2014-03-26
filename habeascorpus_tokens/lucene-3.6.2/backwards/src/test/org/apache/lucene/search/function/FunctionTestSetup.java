package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
function	TokenNameIdentifier	 function
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
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Fieldable	TokenNameIdentifier	 Fieldable
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
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
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
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
_TestUtil	TokenNameIdentifier	 Test Util
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
AfterClass	TokenNameIdentifier	 After Class
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Ignore	TokenNameIdentifier	 Ignore
;	TokenNameSEMICOLON	
/** * Setup for function tests */	TokenNameCOMMENT_JAVADOC	 Setup for function tests 
@	TokenNameAT	
Ignore	TokenNameIdentifier	 Ignore
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FunctionTestSetup	TokenNameIdentifier	 Function Test Setup
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
/** * Actual score computation order is slightly different than assumptios * this allows for a small amount of variation */	TokenNameCOMMENT_JAVADOC	 Actual score computation order is slightly different than assumptios this allows for a small amount of variation 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
TEST_SCORE_TOLERANCE_DELTA	TokenNameIdentifier	 TEST  SCORE  TOLERANCE  DELTA
=	TokenNameEQUAL	
0.001f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
N_DOCS	TokenNameIdentifier	 N  DOCS
=	TokenNameEQUAL	
17	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// select a primary number > 2 	TokenNameCOMMENT_LINE	select a primary number > 2 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ID_FIELD	TokenNameIdentifier	 ID  FIELD
=	TokenNameEQUAL	
"id"	TokenNameStringLiteral	id
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
TEXT_FIELD	TokenNameIdentifier	 TEXT  FIELD
=	TokenNameEQUAL	
"text"	TokenNameStringLiteral	text
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
INT_FIELD	TokenNameIdentifier	 INT  FIELD
=	TokenNameEQUAL	
"iii"	TokenNameStringLiteral	iii
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
FLOAT_FIELD	TokenNameIdentifier	 FLOAT  FIELD
=	TokenNameEQUAL	
"fff"	TokenNameStringLiteral	fff
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DOC_TEXT_LINES	TokenNameIdentifier	 DOC  TEXT  LINES
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
{	TokenNameLBRACE	
"Well, this is just some plain text we use for creating the "	TokenNameStringLiteral	Well, this is just some plain text we use for creating the 
,	TokenNameCOMMA	
"test documents. It used to be a text from an online collection "	TokenNameStringLiteral	test documents. It used to be a text from an online collection 
,	TokenNameCOMMA	
"devoted to first aid, but if there was there an (online) lawyers "	TokenNameStringLiteral	devoted to first aid, but if there was there an (online) lawyers 
,	TokenNameCOMMA	
"first aid collection with legal advices, "it" might have quite "	TokenNameStringLiteral	first aid collection with legal advices, "it" might have quite 
,	TokenNameCOMMA	
"probably advised one not to include "it"'s text or the text of "	TokenNameStringLiteral	probably advised one not to include "it"'s text or the text of 
,	TokenNameCOMMA	
"any other online collection in one's code, unless one has money "	TokenNameStringLiteral	any other online collection in one's code, unless one has money 
,	TokenNameCOMMA	
"that one don't need and one is happy to donate for lawyers "	TokenNameStringLiteral	that one don't need and one is happy to donate for lawyers 
,	TokenNameCOMMA	
"charity. Anyhow at some point, rechecking the usage of this text, "	TokenNameStringLiteral	charity. Anyhow at some point, rechecking the usage of this text, 
,	TokenNameCOMMA	
"it became uncertain that this text is free to use, because "	TokenNameStringLiteral	it became uncertain that this text is free to use, because 
,	TokenNameCOMMA	
"the web site in the disclaimer of he eBook containing that text "	TokenNameStringLiteral	the web site in the disclaimer of he eBook containing that text 
,	TokenNameCOMMA	
"was not responding anymore, and at the same time, in projGut, "	TokenNameStringLiteral	was not responding anymore, and at the same time, in projGut, 
,	TokenNameCOMMA	
"searching for first aid no longer found that eBook as well. "	TokenNameStringLiteral	searching for first aid no longer found that eBook as well. 
,	TokenNameCOMMA	
"So here we are, with a perhaps much less interesting "	TokenNameStringLiteral	So here we are, with a perhaps much less interesting 
,	TokenNameCOMMA	
"text for the test, but oh much much safer. "	TokenNameStringLiteral	text for the test, but oh much much safer. 
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
Analyzer	TokenNameIdentifier	 Analyzer
anlzr	TokenNameIdentifier	 anlzr
;	TokenNameSEMICOLON	
@	TokenNameAT	
AfterClass	TokenNameIdentifier	 After Class
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
afterClassFunctionTestSetup	TokenNameIdentifier	 after Class Function Test Setup
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
anlzr	TokenNameIdentifier	 anlzr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
createIndex	TokenNameIdentifier	 create Index
(	TokenNameLPAREN	
boolean	TokenNameboolean	
doMultiSegment	TokenNameIdentifier	 do Multi Segment
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: setUp"	TokenNameStringLiteral	TEST: setUp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// prepare a small index with just a few documents. 	TokenNameCOMMENT_LINE	prepare a small index with just a few documents. 
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
anlzr	TokenNameIdentifier	 anlzr
=	TokenNameEQUAL	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriterConfig	TokenNameIdentifier	 Index Writer Config
iwc	TokenNameIdentifier	 iwc
=	TokenNameEQUAL	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
anlzr	TokenNameIdentifier	 anlzr
)	TokenNameRPAREN	
.	TokenNameDOT	
setMergePolicy	TokenNameIdentifier	 set Merge Policy
(	TokenNameLPAREN	
newLogMergePolicy	TokenNameIdentifier	 new Log Merge Policy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
iw	TokenNameIdentifier	 iw
=	TokenNameEQUAL	
new	TokenNamenew	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
iwc	TokenNameIdentifier	 iwc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
doMultiSegment	TokenNameIdentifier	 do Multi Segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
setMaxBufferedDocs	TokenNameIdentifier	 set Max Buffered Docs
(	TokenNameLPAREN	
_TestUtil	TokenNameIdentifier	 Test Util
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
setInfoStream	TokenNameIdentifier	 set Info Stream
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
?	TokenNameQUESTION	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add docs not exactly in natural ID order, to verify we do check the order of docs by scores 	TokenNameCOMMENT_LINE	add docs not exactly in natural ID order, to verify we do check the order of docs by scores 
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
N_DOCS	TokenNameIdentifier	 N  DOCS
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
N_DOCS	TokenNameIdentifier	 N  DOCS
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
remaining	TokenNameIdentifier	 remaining
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
done	TokenNameIdentifier	 done
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
Exception	TokenNameIdentifier	 Exception
(	TokenNameLPAREN	
"to set this test correctly N_DOCS="	TokenNameStringLiteral	to set this test correctly N_DOCS=
+	TokenNamePLUS	
N_DOCS	TokenNameIdentifier	 N  DOCS
+	TokenNamePLUS	
" must be primary and greater than 2!"	TokenNameStringLiteral	 must be primary and greater than 2!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
iw	TokenNameIdentifier	 iw
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
done	TokenNameIdentifier	 done
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
N_DOCS	TokenNameIdentifier	 N  DOCS
;	TokenNameSEMICOLON	
remaining	TokenNameIdentifier	 remaining
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
doMultiSegment	TokenNameIdentifier	 do Multi Segment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: setUp full merge"	TokenNameStringLiteral	TEST: setUp full merge
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
forceMerge	TokenNameIdentifier	 force Merge
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"TEST: setUp done close"	TokenNameStringLiteral	TEST: setUp done close
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
addDoc	TokenNameIdentifier	 add Doc
(	TokenNameLPAREN	
RandomIndexWriter	TokenNameIdentifier	 Random Index Writer
iw	TokenNameIdentifier	 iw
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Fieldable	TokenNameIdentifier	 Fieldable
f	TokenNameIdentifier	 f
;	TokenNameSEMICOLON	
int	TokenNameint	
scoreAndID	TokenNameIdentifier	 score And ID
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
ID_FIELD	TokenNameIdentifier	 ID  FIELD
,	TokenNameCOMMA	
id2String	TokenNameIdentifier	 id2 String
(	TokenNameLPAREN	
scoreAndID	TokenNameIdentifier	 score And ID
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for debug purposes 	TokenNameCOMMENT_LINE	for debug purposes 
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setOmitNorms	TokenNameIdentifier	 set Omit Norms
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
TEXT_FIELD	TokenNameIdentifier	 TEXT  FIELD
,	TokenNameCOMMA	
"text of doc"	TokenNameStringLiteral	text of doc
+	TokenNamePLUS	
scoreAndID	TokenNameIdentifier	 score And ID
+	TokenNamePLUS	
textLine	TokenNameIdentifier	 text Line
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for regular search 	TokenNameCOMMENT_LINE	for regular search 
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setOmitNorms	TokenNameIdentifier	 set Omit Norms
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
INT_FIELD	TokenNameIdentifier	 INT  FIELD
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
scoreAndID	TokenNameIdentifier	 score And ID
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for function scoring 	TokenNameCOMMENT_LINE	for function scoring 
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setOmitNorms	TokenNameIdentifier	 set Omit Norms
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
FLOAT_FIELD	TokenNameIdentifier	 FLOAT  FIELD
,	TokenNameCOMMA	
scoreAndID	TokenNameIdentifier	 score And ID
+	TokenNamePLUS	
".000"	TokenNameStringLiteral	.000
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
NOT_ANALYZED	TokenNameIdentifier	 NOT  ANALYZED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// for function scoring 	TokenNameCOMMENT_LINE	for function scoring 
f	TokenNameIdentifier	 f
.	TokenNameDOT	
setOmitNorms	TokenNameIdentifier	 set Omit Norms
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iw	TokenNameIdentifier	 iw
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
"added: "	TokenNameStringLiteral	added: 
+	TokenNamePLUS	
d	TokenNameIdentifier	 d
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 17 --> ID00017 	TokenNameCOMMENT_LINE	17 --> ID00017 
protected	TokenNameprotected	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
id2String	TokenNameIdentifier	 id2 String
(	TokenNameLPAREN	
int	TokenNameint	
scoreAndID	TokenNameIdentifier	 score And ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"000000000"	TokenNameStringLiteral	000000000
+	TokenNamePLUS	
scoreAndID	TokenNameIdentifier	 score And ID
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
N_DOCS	TokenNameIdentifier	 N  DOCS
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
"ID"	TokenNameStringLiteral	ID
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// some text line for regular search 	TokenNameCOMMENT_LINE	some text line for regular search 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
textLine	TokenNameIdentifier	 text Line
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DOC_TEXT_LINES	TokenNameIdentifier	 DOC  TEXT  LINES
[	TokenNameLBRACKET	
docNum	TokenNameIdentifier	 doc Num
%	TokenNameREMAINDER	
DOC_TEXT_LINES	TokenNameIdentifier	 DOC  TEXT  LINES
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// extract expected doc score from its ID Field: "ID7" --> 7.0 	TokenNameCOMMENT_LINE	extract expected doc score from its ID Field: "ID7" --> 7.0 
protected	TokenNameprotected	
static	TokenNamestatic	
float	TokenNamefloat	
expectedFieldScore	TokenNameIdentifier	 expected Field Score
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
docIDFieldVal	TokenNameIdentifier	 doc ID Field Val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
parseFloat	TokenNameIdentifier	 parse Float
(	TokenNameLPAREN	
docIDFieldVal	TokenNameIdentifier	 doc ID Field Val
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// debug messages (change DBG to true for anything to print) 	TokenNameCOMMENT_LINE	debug messages (change DBG to true for anything to print) 
protected	TokenNameprotected	
static	TokenNamestatic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
