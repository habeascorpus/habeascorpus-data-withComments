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
/** * Concrete implementation of {@link AbstractFirstPassGroupingCollector} that groups based on * field values and more specifically uses {@link org.apache.lucene.search.FieldCache.StringIndex} * to collect groups. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Concrete implementation of {@link AbstractFirstPassGroupingCollector} that groups based on field values and more specifically uses {@link org.apache.lucene.search.FieldCache.StringIndex} to collect groups. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
TermFirstPassGroupingCollector	TokenNameIdentifier	 Term First Pass Grouping Collector
extends	TokenNameextends	
AbstractFirstPassGroupingCollector	TokenNameIdentifier	 Abstract First Pass Grouping Collector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
;	TokenNameSEMICOLON	
/** * Create the first pass collector. * * @param groupField The field used to group * documents. This field must be single-valued and * indexed (FieldCache is used to access its value * per-document). * @param groupSort The {@link Sort} used to sort the * groups. The top sorted document within each group * according to groupSort, determines how that group * sorts against other groups. This must be non-null, * ie, if you want to groupSort by relevance use * Sort.RELEVANCE. * @param topNGroups How many top groups to keep. * @throws IOException When I/O related errors occur */	TokenNameCOMMENT_JAVADOC	 Create the first pass collector. * @param groupField The field used to group documents. This field must be single-valued and indexed (FieldCache is used to access its value per-document). @param groupSort The {@link Sort} used to sort the groups. The top sorted document within each group according to groupSort, determines how that group sorts against other groups. This must be non-null, ie, if you want to groupSort by relevance use Sort.RELEVANCE. @param topNGroups How many top groups to keep. @throws IOException When I/O related errors occur 
public	TokenNamepublic	
TermFirstPassGroupingCollector	TokenNameIdentifier	 Term First Pass Grouping Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
,	TokenNameCOMMA	
int	TokenNameint	
topNGroups	TokenNameIdentifier	 top N Groups
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
groupSort	TokenNameIdentifier	 group Sort
,	TokenNameCOMMA	
topNGroups	TokenNameIdentifier	 top N Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupField	TokenNameIdentifier	 group Field
=	TokenNameEQUAL	
groupField	TokenNameIdentifier	 group Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getDocGroupValue	TokenNameIdentifier	 get Doc Group Value
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ord	TokenNameIdentifier	 ord
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
copyDocGroupValue	TokenNameIdentifier	 copy Doc Group Value
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
reuse	TokenNameIdentifier	 reuse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupValue	TokenNameIdentifier	 group Value
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
