/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
tier	TokenNameIdentifier	 tier
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
WhitespaceAnalyzer	TokenNameIdentifier	 Whitespace Analyzer
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexWriter	TokenNameIdentifier	 Index Writer
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
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
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
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
NumericUtils	TokenNameIdentifier	 Numeric Utils
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
TestDistance	TokenNameIdentifier	 Test Distance
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
Directory	TokenNameIdentifier	 Directory
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
// reston va 	TokenNameCOMMENT_LINE	reston va 
private	TokenNameprivate	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
=	TokenNameEQUAL	
38.969398	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
=	TokenNameEQUAL	
-	TokenNameMINUS	
77.386398	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
latField	TokenNameIdentifier	 lat Field
=	TokenNameEQUAL	
"lat"	TokenNameStringLiteral	lat
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
lngField	TokenNameIdentifier	 lng Field
=	TokenNameEQUAL	
"lng"	TokenNameStringLiteral	lng
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setUp	TokenNameIdentifier	 set Up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
directory	TokenNameIdentifier	 directory
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addData	TokenNameIdentifier	 add Data
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
directory	TokenNameIdentifier	 directory
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
tearDown	TokenNameIdentifier	 tear Down
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
double	TokenNamedouble	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
double	TokenNamedouble	
lng	TokenNameIdentifier	 lng
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
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
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert the lat / long to lucene fields 	TokenNameCOMMENT_LINE	convert the lat / long to lucene fields 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
latField	TokenNameIdentifier	 lat Field
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToPrefixCoded	TokenNameIdentifier	 double To Prefix Coded
(	TokenNameLPAREN	
lat	TokenNameIdentifier	 lat
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Field	TokenNameIdentifier	 Field
(	TokenNameLPAREN	
lngField	TokenNameIdentifier	 lng Field
,	TokenNameCOMMA	
NumericUtils	TokenNameIdentifier	 Numeric Utils
.	TokenNameDOT	
doubleToPrefixCoded	TokenNameIdentifier	 double To Prefix Coded
(	TokenNameLPAREN	
lng	TokenNameIdentifier	 lng
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
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// add a default meta field to make searching all documents easy 	TokenNameCOMMENT_LINE	add a default meta field to make searching all documents easy 
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"metafile"	TokenNameStringLiteral	metafile
,	TokenNameCOMMA	
"doc"	TokenNameStringLiteral	doc
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
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addData	TokenNameIdentifier	 add Data
(	TokenNameLPAREN	
IndexWriter	TokenNameIdentifier	 Index Writer
writer	TokenNameIdentifier	 writer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"McCormick &amp; Schmick's Seafood Restaurant"	TokenNameStringLiteral	McCormick &amp; Schmick's Seafood Restaurant
,	TokenNameCOMMA	
38.9579000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.3572000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Jimmy's Old Town Tavern"	TokenNameStringLiteral	Jimmy's Old Town Tavern
,	TokenNameCOMMA	
38.9690000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.3862000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Ned Devine's"	TokenNameStringLiteral	Ned Devine's
,	TokenNameCOMMA	
38.9510000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.4107000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Old Brogue Irish Pub"	TokenNameStringLiteral	Old Brogue Irish Pub
,	TokenNameCOMMA	
38.9955000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.2884000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Alf Laylah Wa Laylah"	TokenNameStringLiteral	Alf Laylah Wa Laylah
,	TokenNameCOMMA	
38.8956000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.4258000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Sully's Restaurant &amp; Supper"	TokenNameStringLiteral	Sully's Restaurant &amp; Supper
,	TokenNameCOMMA	
38.9003000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.4467000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"TGIFriday"	TokenNameStringLiteral	TGIFriday
,	TokenNameCOMMA	
38.8725000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.3829000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Potomac Swing Dance Club"	TokenNameStringLiteral	Potomac Swing Dance Club
,	TokenNameCOMMA	
38.9027000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.2639000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"White Tiger Restaurant"	TokenNameStringLiteral	White Tiger Restaurant
,	TokenNameCOMMA	
38.9027000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.2638000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Jammin' Java"	TokenNameStringLiteral	Jammin' Java
,	TokenNameCOMMA	
38.9039000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.2622000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Potomac Swing Dance Club"	TokenNameStringLiteral	Potomac Swing Dance Club
,	TokenNameCOMMA	
38.9027000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.2639000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"WiseAcres Comedy Club"	TokenNameStringLiteral	WiseAcres Comedy Club
,	TokenNameCOMMA	
38.9248000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.2344000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Glen Echo Spanish Ballroom"	TokenNameStringLiteral	Glen Echo Spanish Ballroom
,	TokenNameCOMMA	
38.9691000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.1400000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Whitlow's on Wilson"	TokenNameStringLiteral	Whitlow's on Wilson
,	TokenNameCOMMA	
38.8889000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.0926000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Iota Club and Cafe"	TokenNameStringLiteral	Iota Club and Cafe
,	TokenNameCOMMA	
38.8890000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.0923000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"Hilton Washington Embassy Row"	TokenNameStringLiteral	Hilton Washington Embassy Row
,	TokenNameCOMMA	
38.9103000	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.0451000	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addPoint	TokenNameIdentifier	 add Point
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
"HorseFeathers, Bar & Grill"	TokenNameStringLiteral	HorseFeathers, Bar & Grill
,	TokenNameCOMMA	
39.01220000000001	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
-	TokenNameMINUS	
77.3942	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
commit	TokenNameIdentifier	 commit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLatLongFilterOnDeletedDocs	TokenNameIdentifier	 test Lat Long Filter On Deleted Docs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
deleteDocuments	TokenNameIdentifier	 delete Documents
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"name"	TokenNameStringLiteral	name
,	TokenNameCOMMA	
"Potomac"	TokenNameStringLiteral	Potomac
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
writer	TokenNameIdentifier	 writer
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LatLongDistanceFilter	TokenNameIdentifier	 Lat Long Distance Filter
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
new	TokenNamenew	
LatLongDistanceFilter	TokenNameIdentifier	 Lat Long Distance Filter
(	TokenNameLPAREN	
new	TokenNamenew	
QueryWrapperFilter	TokenNameIdentifier	 Query Wrapper Filter
(	TokenNameLPAREN	
new	TokenNamenew	
MatchAllDocsQuery	TokenNameIdentifier	 Match All Docs Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lat	TokenNameIdentifier	 lat
,	TokenNameCOMMA	
lng	TokenNameIdentifier	 lng
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
latField	TokenNameIdentifier	 lat Field
,	TokenNameCOMMA	
lngField	TokenNameIdentifier	 lng Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readers	TokenNameIdentifier	 readers
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
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
readers	TokenNameIdentifier	 readers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
f	TokenNameIdentifier	 f
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
readers	TokenNameIdentifier	 readers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* these tests do not test anything, as no assertions: public void testMiles() { double LLM = DistanceUtils.getInstance().getLLMDistance(lat, lng,39.012200001, -77.3942); System.out.println(LLM); System.out.println("-->"+DistanceUtils.getInstance().getDistanceMi(lat, lng, 39.0122, -77.3942)); } public void testMiles2(){ System.out.println("Test Miles 2"); double LLM = DistanceUtils.getInstance().getLLMDistance(44.30073, -78.32131,43.687267, -79.39842); System.out.println(LLM); System.out.println("-->"+DistanceUtils.getInstance().getDistanceMi(44.30073, -78.32131, 43.687267, -79.39842)); } */	TokenNameCOMMENT_BLOCK	 these tests do not test anything, as no assertions: public void testMiles() { double LLM = DistanceUtils.getInstance().getLLMDistance(lat, lng,39.012200001, -77.3942); System.out.println(LLM); System.out.println("-->"+DistanceUtils.getInstance().getDistanceMi(lat, lng, 39.0122, -77.3942)); } public void testMiles2(){ System.out.println("Test Miles 2"); double LLM = DistanceUtils.getInstance().getLLMDistance(44.30073, -78.32131,43.687267, -79.39842); System.out.println(LLM); System.out.println("-->"+DistanceUtils.getInstance().getDistanceMi(44.30073, -78.32131, 43.687267, -79.39842)); } 
// public void testDistanceQueryCacheable() throws IOException { 	TokenNameCOMMENT_LINE	public void testDistanceQueryCacheable() throws IOException { 
// 	TokenNameCOMMENT_LINE	 
// // create two of the same distance queries 	TokenNameCOMMENT_LINE	// create two of the same distance queries 
// double miles = 6.0; 	TokenNameCOMMENT_LINE	double miles = 6.0; 
// DistanceQuery dq1 = new DistanceQuery(lat, lng, miles, latField, lngField, true); 	TokenNameCOMMENT_LINE	DistanceQuery dq1 = new DistanceQuery(lat, lng, miles, latField, lngField, true); 
// DistanceQuery dq2 = new DistanceQuery(lat, lng, miles, latField, lngField, true); 	TokenNameCOMMENT_LINE	DistanceQuery dq2 = new DistanceQuery(lat, lng, miles, latField, lngField, true); 
// 	TokenNameCOMMENT_LINE	 
// /* ensure that they hash to the same code, which will cause a cache hit in solr */ 	TokenNameCOMMENT_LINE	/* ensure that they hash to the same code, which will cause a cache hit in solr */ 
// System.out.println("hash differences?"); 	TokenNameCOMMENT_LINE	System.out.println("hash differences?"); 
// assertEquals(dq1.getQuery().hashCode(), dq2.getQuery().hashCode()); 	TokenNameCOMMENT_LINE	assertEquals(dq1.getQuery().hashCode(), dq2.getQuery().hashCode()); 
// 	TokenNameCOMMENT_LINE	 
// /* ensure that changing the radius makes a different hash code, creating a cache miss in solr */ 	TokenNameCOMMENT_LINE	/* ensure that changing the radius makes a different hash code, creating a cache miss in solr */ 
// DistanceQuery widerQuery = new DistanceQuery(lat, lng, miles + 5.0, latField, lngField, false); 	TokenNameCOMMENT_LINE	DistanceQuery widerQuery = new DistanceQuery(lat, lng, miles + 5.0, latField, lngField, false); 
// assertTrue(dq1.getQuery().hashCode() != widerQuery.getQuery().hashCode()); 	TokenNameCOMMENT_LINE	assertTrue(dq1.getQuery().hashCode() != widerQuery.getQuery().hashCode()); 
// } 	TokenNameCOMMENT_LINE	} 
}	TokenNameRBRACE	
