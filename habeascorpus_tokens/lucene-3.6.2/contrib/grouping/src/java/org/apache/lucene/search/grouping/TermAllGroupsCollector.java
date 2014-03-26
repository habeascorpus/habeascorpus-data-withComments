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
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
/** * A collector that collects all groups that match the * query. Only the group value is collected, and the order * is undefined. This collector does not determine * the most relevant document of a group. * * <p/> * Implementation detail: an int hash set (SentinelIntSet) * is used to detect if a group is already added to the * total count. For each segment the int set is cleared and filled * with previous counted groups that occur in the new * segment. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A collector that collects all groups that match the query. Only the group value is collected, and the order is undefined. This collector does not determine the most relevant document of a group. * <p/> Implementation detail: an int hash set (SentinelIntSet) is used to detect if a group is already added to the total count. For each segment the int set is cleared and filled with previous counted groups that occur in the new segment. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
TermAllGroupsCollector	TokenNameIdentifier	 Term All Groups Collector
extends	TokenNameextends	
AbstractAllGroupsCollector	TokenNameIdentifier	 Abstract All Groups Collector
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_INITIAL_SIZE	TokenNameIdentifier	 DEFAULT  INITIAL  SIZE
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
ordSet	TokenNameIdentifier	 ord Set
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
StringIndex	TokenNameIdentifier	 String Index
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Expert: Constructs a {@link AbstractAllGroupsCollector} * * @param groupField The field to group by * @param initialSize The initial allocation size of the * internal int set and group list * which should roughly match the total * number of expected unique groups. Be aware that the * heap usage is 4 bytes * initialSize. */	TokenNameCOMMENT_JAVADOC	 Expert: Constructs a {@link AbstractAllGroupsCollector} * @param groupField The field to group by @param initialSize The initial allocation size of the internal int set and group list which should roughly match the total number of expected unique groups. Be aware that the heap usage is 4 bytes initialSize. 
public	TokenNamepublic	
TermAllGroupsCollector	TokenNameIdentifier	 Term All Groups Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
int	TokenNameint	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
=	TokenNameEQUAL	
new	TokenNamenew	
SentinelIntSet	TokenNameIdentifier	 Sentinel Int Set
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
groups	TokenNameIdentifier	 groups
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
initialSize	TokenNameIdentifier	 initial Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
groupField	TokenNameIdentifier	 group Field
=	TokenNameEQUAL	
groupField	TokenNameIdentifier	 group Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a {@link AbstractAllGroupsCollector}. This sets the * initial allocation size for the internal int set and group * list to 128. * * @param groupField The field to group by */	TokenNameCOMMENT_JAVADOC	 Constructs a {@link AbstractAllGroupsCollector}. This sets the initial allocation size for the internal int set and group list to 128. * @param groupField The field to group by 
public	TokenNamepublic	
TermAllGroupsCollector	TokenNameIdentifier	 Term All Groups Collector
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
groupField	TokenNameIdentifier	 group Field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
groupField	TokenNameIdentifier	 group Field
,	TokenNameCOMMA	
DEFAULT_INITIAL_SIZE	TokenNameIdentifier	 DEFAULT  INITIAL  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
int	TokenNameint	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
exists	TokenNameIdentifier	 exists
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
key	TokenNameIdentifier	 key
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * {@inheritDoc} */	TokenNameCOMMENT_JAVADOC	 {@inheritDoc} 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getGroups	TokenNameIdentifier	 get Groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
// Clear ordSet and fill it with previous encountered groups that can occur in the current segment. 	TokenNameCOMMENT_LINE	Clear ordSet and fill it with previous encountered groups that can occur in the current segment. 
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
countedGroup	TokenNameIdentifier	 counted Group
:	TokenNameCOLON	
groups	TokenNameIdentifier	 groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
binarySearchLookup	TokenNameIdentifier	 binary Search Lookup
(	TokenNameLPAREN	
countedGroup	TokenNameIdentifier	 counted Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ordSet	TokenNameIdentifier	 ord Set
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
