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
utils	TokenNameIdentifier	 utils
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
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
ScoreDoc	TokenNameIdentifier	 Score Doc
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
IndexSearcher	TokenNameIdentifier	 Index Searcher
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
TopDocs	TokenNameIdentifier	 Top Docs
;	TokenNameSEMICOLON	
/** * Create a log ready for submission. * Extend this class and override * {@link #report(QualityQuery, TopDocs, String, IndexSearcher)} * to create different reports. */	TokenNameCOMMENT_JAVADOC	 Create a log ready for submission. Extend this class and override {@link #report(QualityQuery, TopDocs, String, IndexSearcher)} to create different reports. 
public	TokenNamepublic	
class	TokenNameclass	
SubmissionReport	TokenNameIdentifier	 Submission Report
{	TokenNameLBRACE	
private	TokenNameprivate	
NumberFormat	TokenNameIdentifier	 Number Format
nf	TokenNameIdentifier	 nf
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PrintWriter	TokenNameIdentifier	 Print Writer
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
/** * Constructor for SubmissionReport. * @param logger if null, no submission data is created. * @param name name of this run. */	TokenNameCOMMENT_JAVADOC	 Constructor for SubmissionReport. @param logger if null, no submission data is created. @param name name of this run. 
public	TokenNamepublic	
SubmissionReport	TokenNameIdentifier	 Submission Report
(	TokenNameLPAREN	
PrintWriter	TokenNameIdentifier	 Print Writer
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
logger	TokenNameIdentifier	 logger
=	TokenNameEQUAL	
logger	TokenNameIdentifier	 logger
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
nf	TokenNameIdentifier	 nf
=	TokenNameEQUAL	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
setMaximumFractionDigits	TokenNameIdentifier	 set Maximum Fraction Digits
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
setMinimumFractionDigits	TokenNameIdentifier	 set Minimum Fraction Digits
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Report a search result for a certain quality query. * @param qq quality query for which the results are reported. * @param td search results for the query. * @param docNameField stored field used for fetching the result doc name. * @param searcher index access for fetching doc name. * @throws IOException in case of a problem. */	TokenNameCOMMENT_JAVADOC	 Report a search result for a certain quality query. @param qq quality query for which the results are reported. @param td search results for the query. @param docNameField stored field used for fetching the result doc name. @param searcher index access for fetching doc name. @throws IOException in case of a problem. 
public	TokenNamepublic	
void	TokenNamevoid	
report	TokenNameIdentifier	 report
(	TokenNameLPAREN	
QualityQuery	TokenNameIdentifier	 Quality Query
qq	TokenNameIdentifier	 qq
,	TokenNameCOMMA	
TopDocs	TokenNameIdentifier	 Top Docs
td	TokenNameIdentifier	 td
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
docNameField	TokenNameIdentifier	 doc Name Field
,	TokenNameCOMMA	
IndexSearcher	TokenNameIdentifier	 Index Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ScoreDoc	TokenNameIdentifier	 Score Doc
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
sep	TokenNameIdentifier	 sep
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
DocNameExtractor	TokenNameIdentifier	 Doc Name Extractor
xt	TokenNameIdentifier	 xt
=	TokenNameEQUAL	
new	TokenNamenew	
DocNameExtractor	TokenNameIdentifier	 Doc Name Extractor
(	TokenNameLPAREN	
docNameField	TokenNameIdentifier	 doc Name Field
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
sd	TokenNameIdentifier	 sd
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
docName	TokenNameIdentifier	 doc Name
=	TokenNameEQUAL	
xt	TokenNameIdentifier	 xt
.	TokenNameDOT	
docName	TokenNameIdentifier	 doc Name
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
,	TokenNameCOMMA	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
qq	TokenNameIdentifier	 qq
.	TokenNameDOT	
getQueryID	TokenNameIdentifier	 get Query ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sep	TokenNameIdentifier	 sep
+	TokenNamePLUS	
"Q0"	TokenNameStringLiteral	Q0
+	TokenNamePLUS	
sep	TokenNameIdentifier	 sep
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
docName	TokenNameIdentifier	 doc Name
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sep	TokenNameIdentifier	 sep
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
sep	TokenNameIdentifier	 sep
+	TokenNamePLUS	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
sd	TokenNameIdentifier	 sd
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
+	TokenNamePLUS	
sep	TokenNameIdentifier	 sep
+	TokenNamePLUS	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logger	TokenNameIdentifier	 logger
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
padd	TokenNameIdentifier	 padd
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
minLen	TokenNameIdentifier	 min Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
padd	TokenNameIdentifier	 padd
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
