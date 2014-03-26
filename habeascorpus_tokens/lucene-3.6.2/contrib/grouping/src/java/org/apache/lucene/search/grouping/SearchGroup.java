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
FieldComparator	TokenNameIdentifier	 Field Comparator
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
SortField	TokenNameIdentifier	 Sort Field
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Represents a group that is found during the first pass search. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Represents a group that is found during the first pass search. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** The value that defines this group */	TokenNameCOMMENT_JAVADOC	 The value that defines this group 
public	TokenNamepublic	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
/** The sort values used during sorting. These are the * groupSort field values of the highest rank document * (by the groupSort) within the group. Can be * <code>null</code> if <code>fillFields=false</code> had * been passed to {@link AbstractFirstPassGroupingCollector#getTopGroups} */	TokenNameCOMMENT_JAVADOC	 The sort values used during sorting. These are the groupSort field values of the highest rank document (by the groupSort) within the group. Can be <code>null</code> if <code>fillFields=false</code> had been passed to {@link AbstractFirstPassGroupingCollector#getTopGroups} 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortValues	TokenNameIdentifier	 sort Values
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
"SearchGroup(groupValue="	TokenNameStringLiteral	SearchGroup(groupValue=
+	TokenNamePLUS	
groupValue	TokenNameIdentifier	 group Value
+	TokenNamePLUS	
" sortValues="	TokenNameStringLiteral	 sortValues=
+	TokenNamePLUS	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
sortValues	TokenNameIdentifier	 sort Values
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
SearchGroup	TokenNameIdentifier	 Search Group
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SearchGroup	TokenNameIdentifier	 Search Group
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
groupValue	TokenNameIdentifier	 group Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupValue	TokenNameIdentifier	 group Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
groupValue	TokenNameIdentifier	 group Value
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
ShardIter	TokenNameIdentifier	 Shard Iter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
shardIndex	TokenNameIdentifier	 shard Index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ShardIter	TokenNameIdentifier	 Shard Iter
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
shard	TokenNameIdentifier	 shard
,	TokenNameCOMMA	
int	TokenNameint	
shardIndex	TokenNameIdentifier	 shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
=	TokenNameEQUAL	
shardIndex	TokenNameIdentifier	 shard Index
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"group.sortValues is null; you must pass fillFields=true to the first pass collector"	TokenNameStringLiteral	group.sortValues is null; you must pass fillFields=true to the first pass collector
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
group	TokenNameIdentifier	 group
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"ShardIter(shard="	TokenNameStringLiteral	ShardIter(shard=
+	TokenNamePLUS	
shardIndex	TokenNameIdentifier	 shard Index
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Holds all shards currently on the same group 	TokenNameCOMMENT_LINE	Holds all shards currently on the same group 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
// groupValue may be null! 	TokenNameCOMMENT_LINE	groupValue may be null! 
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
topValues	TokenNameIdentifier	 top Values
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ShardIter	TokenNameIdentifier	 Shard Iter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
shards	TokenNameIdentifier	 shards
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ShardIter	TokenNameIdentifier	 Shard Iter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
minShardIndex	TokenNameIdentifier	 min Shard Index
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
processed	TokenNameIdentifier	 processed
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
inQueue	TokenNameIdentifier	 in Queue
;	TokenNameSEMICOLON	
public	TokenNamepublic	
MergedGroup	TokenNameIdentifier	 Merged Group
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Only for assert 	TokenNameCOMMENT_LINE	Only for assert 
private	TokenNameprivate	
boolean	TokenNameboolean	
neverEquals	TokenNameIdentifier	 never Equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
_other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
MergedGroup	TokenNameIdentifier	 Merged Group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MergedGroup	TokenNameIdentifier	 Merged Group
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MergedGroup	TokenNameIdentifier	 Merged Group
)	TokenNameRPAREN	
_other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
groupValue	TokenNameIdentifier	 group Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
_other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We never have another MergedGroup instance with 	TokenNameCOMMENT_LINE	We never have another MergedGroup instance with 
// same groupValue 	TokenNameCOMMENT_LINE	same groupValue 
assert	TokenNameassert	
neverEquals	TokenNameIdentifier	 never Equals
(	TokenNameLPAREN	
_other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
_other	TokenNameIdentifier	 other
instanceof	TokenNameinstanceof	
MergedGroup	TokenNameIdentifier	 Merged Group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
MergedGroup	TokenNameIdentifier	 Merged Group
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
MergedGroup	TokenNameIdentifier	 Merged Group
)	TokenNameRPAREN	
_other	TokenNameIdentifier	 other
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupValue	TokenNameIdentifier	 group Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
groupValue	TokenNameIdentifier	 group Value
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
GroupComparator	TokenNameIdentifier	 Group Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comparators	TokenNameIdentifier	 comparators
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reversed	TokenNameIdentifier	 reversed
;	TokenNameSEMICOLON	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
GroupComparator	TokenNameIdentifier	 Group Comparator
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
=	TokenNameEQUAL	
groupSort	TokenNameIdentifier	 group Sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
=	TokenNameEQUAL	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
reversed	TokenNameIdentifier	 reversed
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
<	TokenNameLESS	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
sortField	TokenNameIdentifier	 sort Field
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortField	TokenNameIdentifier	 sort Field
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
compIDX	TokenNameIdentifier	 comp IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortField	TokenNameIdentifier	 sort Field
.	TokenNameDOT	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"rawtypes"	TokenNameStringLiteral	rawtypes
,	TokenNameCOMMA	
"unchecked"	TokenNameStringLiteral	unchecked
}	TokenNameRBRACE	
)	TokenNameRPAREN	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
,	TokenNameCOMMA	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("compare group=" + group + " other=" + other); 	TokenNameCOMMENT_LINE	System.out.println("compare group=" + group + " other=" + other); 
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
groupValues	TokenNameIdentifier	 group Values
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
topValues	TokenNameIdentifier	 top Values
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
otherValues	TokenNameIdentifier	 other Values
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
topValues	TokenNameIdentifier	 top Values
;	TokenNameSEMICOLON	
//System.out.println(" groupValues=" + groupValues + " otherValues=" + otherValues); 	TokenNameCOMMENT_LINE	System.out.println(" groupValues=" + groupValues + " otherValues=" + otherValues); 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
)	TokenNameRPAREN	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
groupValues	TokenNameIdentifier	 group Values
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
otherValues	TokenNameIdentifier	 other Values
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Tie break by min shard index: 	TokenNameCOMMENT_LINE	Tie break by min shard index: 
assert	TokenNameassert	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
minShardIndex	TokenNameIdentifier	 min Shard Index
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
minShardIndex	TokenNameIdentifier	 min Shard Index
;	TokenNameSEMICOLON	
return	TokenNamereturn	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
minShardIndex	TokenNameIdentifier	 min Shard Index
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
minShardIndex	TokenNameIdentifier	 min Shard Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
GroupMerger	TokenNameIdentifier	 Group Merger
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
GroupComparator	TokenNameIdentifier	 Group Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
groupComp	TokenNameIdentifier	 group Comp
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
SortedSet	TokenNameIdentifier	 Sorted Set
<	TokenNameLESS	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
queue	TokenNameIdentifier	 queue
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
groupsSeen	TokenNameIdentifier	 groups Seen
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GroupMerger	TokenNameIdentifier	 Group Merger
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
groupComp	TokenNameIdentifier	 group Comp
=	TokenNameEQUAL	
new	TokenNamenew	
GroupComparator	TokenNameIdentifier	 Group Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
groupSort	TokenNameIdentifier	 group Sort
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
groupComp	TokenNameIdentifier	 group Comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
groupsSeen	TokenNameIdentifier	 groups Seen
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
T	TokenNameIdentifier	 T
,	TokenNameCOMMA	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
private	TokenNameprivate	
void	TokenNamevoid	
updateNextGroup	TokenNameIdentifier	 update Next Group
(	TokenNameLPAREN	
int	TokenNameint	
topN	TokenNameIdentifier	 top N
,	TokenNameCOMMA	
ShardIter	TokenNameIdentifier	 Shard Iter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
shard	TokenNameIdentifier	 shard
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
mergedGroup	TokenNameIdentifier	 merged Group
=	TokenNameEQUAL	
groupsSeen	TokenNameIdentifier	 groups Seen
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
boolean	TokenNameboolean	
isNew	TokenNameIdentifier	 is New
=	TokenNameEQUAL	
mergedGroup	TokenNameIdentifier	 merged Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
//System.out.println(" next group=" + (group.groupValue == null ? "null" : ((BytesRef) group.groupValue).utf8ToString()) + " sort=" + Arrays.toString(group.sortValues)); 	TokenNameCOMMENT_LINE	System.out.println(" next group=" + (group.groupValue == null ? "null" : ((BytesRef) group.groupValue).utf8ToString()) + " sort=" + Arrays.toString(group.sortValues)); 
if	TokenNameif	
(	TokenNameLPAREN	
isNew	TokenNameIdentifier	 is New
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Start a new group: 	TokenNameCOMMENT_LINE	Start a new group: 
//System.out.println(" new"); 	TokenNameCOMMENT_LINE	System.out.println(" new"); 
mergedGroup	TokenNameIdentifier	 merged Group
=	TokenNameEQUAL	
new	TokenNamenew	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
minShardIndex	TokenNameIdentifier	 min Shard Index
=	TokenNameEQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
;	TokenNameSEMICOLON	
assert	TokenNameassert	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
topValues	TokenNameIdentifier	 top Values
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
;	TokenNameSEMICOLON	
groupsSeen	TokenNameIdentifier	 groups Seen
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
mergedGroup	TokenNameIdentifier	 merged Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
inQueue	TokenNameIdentifier	 in Queue
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mergedGroup	TokenNameIdentifier	 merged Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
processed	TokenNameIdentifier	 processed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This shard produced a group that we already 	TokenNameCOMMENT_LINE	This shard produced a group that we already 
// processed; move on to next group... 	TokenNameCOMMENT_LINE	processed; move on to next group... 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
//System.out.println(" old"); 	TokenNameCOMMENT_LINE	System.out.println(" old"); 
boolean	TokenNameboolean	
competes	TokenNameIdentifier	 competes
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
<	TokenNameLESS	
groupComp	TokenNameIdentifier	 group Comp
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
groupComp	TokenNameIdentifier	 group Comp
.	TokenNameDOT	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
)	TokenNameRPAREN	
groupComp	TokenNameIdentifier	 group Comp
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
topValues	TokenNameIdentifier	 top Values
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely competes 	TokenNameCOMMENT_LINE	Definitely competes 
competes	TokenNameIdentifier	 competes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely does not compete 	TokenNameCOMMENT_LINE	Definitely does not compete 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
compIDX	TokenNameIdentifier	 comp IDX
==	TokenNameEQUAL_EQUAL	
groupComp	TokenNameIdentifier	 group Comp
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
<	TokenNameLESS	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
minShardIndex	TokenNameIdentifier	 min Shard Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
competes	TokenNameIdentifier	 competes
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//System.out.println(" competes=" + competes); 	TokenNameCOMMENT_LINE	System.out.println(" competes=" + competes); 
if	TokenNameif	
(	TokenNameLPAREN	
competes	TokenNameIdentifier	 competes
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Group's sort changed -- remove & re-insert 	TokenNameCOMMENT_LINE	Group's sort changed -- remove & re-insert 
if	TokenNameif	
(	TokenNameLPAREN	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
inQueue	TokenNameIdentifier	 in Queue
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
mergedGroup	TokenNameIdentifier	 merged Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
topValues	TokenNameIdentifier	 top Values
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
;	TokenNameSEMICOLON	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
minShardIndex	TokenNameIdentifier	 min Shard Index
=	TokenNameEQUAL	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
shardIndex	TokenNameIdentifier	 shard Index
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
mergedGroup	TokenNameIdentifier	 merged Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
inQueue	TokenNameIdentifier	 in Queue
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
mergedGroup	TokenNameIdentifier	 merged Group
.	TokenNameDOT	
shards	TokenNameIdentifier	 shards
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
shard	TokenNameIdentifier	 shard
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Prune un-competitive groups: 	TokenNameCOMMENT_LINE	Prune un-competitive groups: 
while	TokenNamewhile	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO java 1.6: .pollLast 	TokenNameCOMMENT_LINE	TODO java 1.6: .pollLast 
final	TokenNamefinal	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("PRUNE: " + group); 	TokenNameCOMMENT_LINE	System.out.println("PRUNE: " + group); 
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
inQueue	TokenNameIdentifier	 in Queue
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
shards	TokenNameIdentifier	 shards
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
maxQueueSize	TokenNameIdentifier	 max Queue Size
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
topN	TokenNameIdentifier	 top N
;	TokenNameSEMICOLON	
//System.out.println("merge"); 	TokenNameCOMMENT_LINE	System.out.println("merge"); 
// Init queue: 	TokenNameCOMMENT_LINE	Init queue: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
shardIDX	TokenNameIdentifier	 shard IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
<	TokenNameLESS	
shards	TokenNameIdentifier	 shards
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shardIDX	TokenNameIdentifier	 shard IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
shard	TokenNameIdentifier	 shard
=	TokenNameEQUAL	
shards	TokenNameIdentifier	 shards
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
shardIDX	TokenNameIdentifier	 shard IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
shard	TokenNameIdentifier	 shard
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" insert shard=" + shardIDX); 	TokenNameCOMMENT_LINE	System.out.println(" insert shard=" + shardIDX); 
updateNextGroup	TokenNameIdentifier	 update Next Group
(	TokenNameLPAREN	
maxQueueSize	TokenNameIdentifier	 max Queue Size
,	TokenNameCOMMA	
new	TokenNamenew	
ShardIter	TokenNameIdentifier	 Shard Iter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
shard	TokenNameIdentifier	 shard
,	TokenNameCOMMA	
shardIDX	TokenNameIdentifier	 shard IDX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Pull merged topN groups: 	TokenNameCOMMENT_LINE	Pull merged topN groups: 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
newTopGroups	TokenNameIdentifier	 new Top Groups
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO Java 1.6: pollFirst() 	TokenNameCOMMENT_LINE	TODO Java 1.6: pollFirst() 
final	TokenNamefinal	
MergedGroup	TokenNameIdentifier	 Merged Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
first	TokenNameIdentifier	 first
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queue	TokenNameIdentifier	 queue
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
processed	TokenNameIdentifier	 processed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
//System.out.println(" pop: shards=" + group.shards + " group=" + (group.groupValue == null ? "null" : (((BytesRef) group.groupValue).utf8ToString())) + " sortValues=" + Arrays.toString(group.topValues)); 	TokenNameCOMMENT_LINE	System.out.println(" pop: shards=" + group.shards + " group=" + (group.groupValue == null ? "null" : (((BytesRef) group.groupValue).utf8ToString())) + " sortValues=" + Arrays.toString(group.topValues)); 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
>=	TokenNameGREATER_EQUAL	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
newGroup	TokenNameIdentifier	 new Group
=	TokenNameEQUAL	
new	TokenNamenew	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newGroup	TokenNameIdentifier	 new Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
newGroup	TokenNameIdentifier	 new Group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
topValues	TokenNameIdentifier	 top Values
;	TokenNameSEMICOLON	
newTopGroups	TokenNameIdentifier	 new Top Groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newGroup	TokenNameIdentifier	 new Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newTopGroups	TokenNameIdentifier	 new Top Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//} else { 	TokenNameCOMMENT_LINE	} else { 
// System.out.println(" skip < offset"); 	TokenNameCOMMENT_LINE	System.out.println(" skip < offset"); 
}	TokenNameRBRACE	
// Advance all iters in this group: 	TokenNameCOMMENT_LINE	Advance all iters in this group: 
for	TokenNamefor	
(	TokenNameLPAREN	
ShardIter	TokenNameIdentifier	 Shard Iter
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
shardIter	TokenNameIdentifier	 shard Iter
:	TokenNameCOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
shards	TokenNameIdentifier	 shards
)	TokenNameRPAREN	
{	TokenNameLBRACE	
updateNextGroup	TokenNameIdentifier	 update Next Group
(	TokenNameLPAREN	
maxQueueSize	TokenNameIdentifier	 max Queue Size
,	TokenNameCOMMA	
shardIter	TokenNameIdentifier	 shard Iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
newTopGroups	TokenNameIdentifier	 new Top Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
newTopGroups	TokenNameIdentifier	 new Top Groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Merges multiple collections of top groups, for example * obtained from separate index shards. The provided * groupSort must match how the groups were sorted, and * the provided SearchGroups must have been computed * with fillFields=true passed to {@link * AbstractFirstPassGroupingCollector#getTopGroups}. * * <p>NOTE: this returns null if the topGroups is empty. */	TokenNameCOMMENT_JAVADOC	 Merges multiple collections of top groups, for example obtained from separate index shards. The provided groupSort must match how the groups were sorted, and the provided SearchGroups must have been computed with fillFields=true passed to {@link AbstractFirstPassGroupingCollector#getTopGroups}. * <p>NOTE: this returns null if the topGroups is empty. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
topGroups	TokenNameIdentifier	 top Groups
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
topN	TokenNameIdentifier	 top N
,	TokenNameCOMMA	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
topGroups	TokenNameIdentifier	 top Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
GroupMerger	TokenNameIdentifier	 Group Merger
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
groupSort	TokenNameIdentifier	 group Sort
)	TokenNameRPAREN	
.	TokenNameDOT	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
topGroups	TokenNameIdentifier	 top Groups
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
topN	TokenNameIdentifier	 top N
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
