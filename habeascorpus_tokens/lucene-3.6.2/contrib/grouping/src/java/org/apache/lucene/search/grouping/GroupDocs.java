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
/** Represents one group in the results. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Represents one group in the results. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
GroupDocs	TokenNameIdentifier	 Group Docs
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** The groupField value for all docs in this group; this * may be null if hits did not have the groupField. */	TokenNameCOMMENT_JAVADOC	 The groupField value for all docs in this group; this may be null if hits did not have the groupField. 
public	TokenNamepublic	
final	TokenNamefinal	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
/** Max score in this group */	TokenNameCOMMENT_JAVADOC	 Max score in this group 
public	TokenNamepublic	
final	TokenNamefinal	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
/** Hits; this may be {@link * org.apache.lucene.search.FieldDoc} instances if the * withinGroupSort sorted by fields. */	TokenNameCOMMENT_JAVADOC	 Hits; this may be {@link org.apache.lucene.search.FieldDoc} instances if the withinGroupSort sorted by fields. 
public	TokenNamepublic	
final	TokenNamefinal	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
/** Total hits within this group */	TokenNameCOMMENT_JAVADOC	 Total hits within this group 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
/** Matches the groupSort passed to {@link * AbstractFirstPassGroupingCollector}. */	TokenNameCOMMENT_JAVADOC	 Matches the groupSort passed to {@link AbstractFirstPassGroupingCollector}. 
public	TokenNamepublic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupSortValues	TokenNameIdentifier	 group Sort Values
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GroupDocs	TokenNameIdentifier	 Group Docs
(	TokenNameLPAREN	
float	TokenNamefloat	
maxScore	TokenNameIdentifier	 max Score
,	TokenNameCOMMA	
int	TokenNameint	
totalHits	TokenNameIdentifier	 total Hits
,	TokenNameCOMMA	
ScoreDoc	TokenNameIdentifier	 Score Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreDocs	TokenNameIdentifier	 score Docs
,	TokenNameCOMMA	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupSortValues	TokenNameIdentifier	 group Sort Values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxScore	TokenNameIdentifier	 max Score
=	TokenNameEQUAL	
maxScore	TokenNameIdentifier	 max Score
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
totalHits	TokenNameIdentifier	 total Hits
=	TokenNameEQUAL	
totalHits	TokenNameIdentifier	 total Hits
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scoreDocs	TokenNameIdentifier	 score Docs
=	TokenNameEQUAL	
scoreDocs	TokenNameIdentifier	 score Docs
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupSortValues	TokenNameIdentifier	 group Sort Values
=	TokenNameEQUAL	
groupSortValues	TokenNameIdentifier	 group Sort Values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
