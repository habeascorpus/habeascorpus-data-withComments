package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
grouping	TokenNameIdentifier	 grouping
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
Collection	TokenNameIdentifier	 Collection
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
FieldCache	TokenNameIdentifier	 Field Cache
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
Sort	TokenNameIdentifier	 Sort
;	TokenNameSEMICOLON	
/** * Concrete implementation of {@link AbstractSecondPassGroupingCollector} that groups based on * field values and more specifically uses {@link org.apache.lucene.search.FieldCache.StringIndex} * to collect grouped docs. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Concrete implementation of {@link AbstractSecondPassGroupingCollector} that groups based on field values and more specifically uses {@link org.apache.lucene.search.FieldCache.StringIndex} to collect grouped docs. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
TermSecondPassGroupingCollector	TokenNameIdentifier	 Term Second Pass Grouping Collector
extends	TokenNameextends	
AbstractSecondPassGroupingCollector	TokenNameIdentifier	 Abstract Second Pass Grouping Collector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
ordSet	TokenNameIdentifier	 ord Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
TermSecondPassGroupingCollector	TokenNameIdentifier	 Term Second Pass Grouping Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>>	TokenNameRIGHT_SHIFT	
groups	TokenNameIdentifier	 groups
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
withinGroupSort	TokenNameIdentifier	 within Group Sort
,	TokenNameCOMMA	
int	TokenNameint	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
,	TokenNameCOMMA	
boolean	TokenNameboolean	
getScores	TokenNameIdentifier	 get Scores
,	TokenNameCOMMA	
boolean	TokenNameboolean	
getMaxScores	TokenNameIdentifier	 get Max Scores
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillSortFields	TokenNameIdentifier	 fill Sort Fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groups	TokenNameIdentifier	 groups
,	TokenNameCOMMA	
groupSort	TokenNameIdentifier	 group Sort
,	TokenNameCOMMA	
withinGroupSort	TokenNameIdentifier	 within Group Sort
,	TokenNameCOMMA	
maxDocsPerGroup	TokenNameIdentifier	 max Docs Per Group
,	TokenNameCOMMA	
getScores	TokenNameIdentifier	 get Scores
,	TokenNameCOMMA	
getMaxScores	TokenNameIdentifier	 get Max Scores
,	TokenNameCOMMA	
fillSortFields	TokenNameIdentifier	 fill Sort Fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ordSet	TokenNameIdentifier	 ord Set
=	TokenNameEQUAL	
new	TokenNamenew	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
(	TokenNameLPAREN	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupField	TokenNameIdentifier	 group Field
=	TokenNameEQUAL	
groupField	TokenNameIdentifier	 group Field
;	TokenNameSEMICOLON	
groupDocs	TokenNameIdentifier	 group Docs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
new	TokenNamenew	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
[	TokenNameLBRACKET	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
groupField	TokenNameIdentifier	 group Field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Rebuild ordSet 	TokenNameCOMMENT_LINE	Rebuild ordSet 
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
:	TokenNameCOLON	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.println(" group=" + (group.groupValue == null ? "null" : group.groupValue.utf8ToString())); 	TokenNameCOMMENT_LINE	System.out.println(" group=" + (group.groupValue == null ? "null" : group.groupValue.utf8ToString())); 
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groupDocs	TokenNameIdentifier	 group Docs
[	TokenNameLBRACKET	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
SearchGroupDocs	TokenNameIdentifier	 Search Group Docs
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
retrieveGroup	TokenNameIdentifier	 retrieve Group
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slot	TokenNameIdentifier	 slot
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupDocs	TokenNameIdentifier	 group Docs
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
