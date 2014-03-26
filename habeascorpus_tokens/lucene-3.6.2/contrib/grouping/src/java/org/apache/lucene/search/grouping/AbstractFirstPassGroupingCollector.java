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
*	TokenNameMULTIPLY	
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
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** FirstPassGroupingCollector is the first of two passes necessary * to collect grouped hits. This pass gathers the top N sorted * groups. Concrete subclasses define what a group is and how it * is internally collected. * * <p>See {@link org.apache.lucene.search.grouping} for more * details including a full code example.</p> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 FirstPassGroupingCollector is the first of two passes necessary to collect grouped hits. This pass gathers the top N sorted groups. Concrete subclasses define what a group is and how it is internally collected. * <p>See {@link org.apache.lucene.search.grouping} for more details including a full code example.</p> * @lucene.experimental 
abstract	TokenNameabstract	
public	TokenNamepublic	
class	TokenNameclass	
AbstractFirstPassGroupingCollector	TokenNameIdentifier	 Abstract First Pass Grouping Collector
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
extends	TokenNameextends	
Collector	TokenNameIdentifier	 Collector
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comparators	TokenNameIdentifier	 comparators
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reversed	TokenNameIdentifier	 reversed
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
topNGroups	TokenNameIdentifier	 top N Groups
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
,	TokenNameCOMMA	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
groupMap	TokenNameIdentifier	 group Map
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
compIDXEnd	TokenNameIdentifier	 comp IDX End
;	TokenNameSEMICOLON	
// Set once we reach topNGroups unique groups: 	TokenNameCOMMENT_LINE	Set once we reach topNGroups unique groups: 
private	TokenNameprivate	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
orderedGroups	TokenNameIdentifier	 ordered Groups
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
spareSlot	TokenNameIdentifier	 spare Slot
;	TokenNameSEMICOLON	
/** * Create the first pass collector. * * @param groupSort The {@link Sort} used to sort the * groups. The top sorted document within each group * according to groupSort, determines how that group * sorts against other groups. This must be non-null, * ie, if you want to groupSort by relevance use * Sort.RELEVANCE. * @param topNGroups How many top groups to keep. * @throws IOException If I/O related errors occur */	TokenNameCOMMENT_JAVADOC	 Create the first pass collector. * @param groupSort The {@link Sort} used to sort the groups. The top sorted document within each group according to groupSort, determines how that group sorts against other groups. This must be non-null, ie, if you want to groupSort by relevance use Sort.RELEVANCE. @param topNGroups How many top groups to keep. @throws IOException If I/O related errors occur 
public	TokenNamepublic	
AbstractFirstPassGroupingCollector	TokenNameIdentifier	 Abstract First Pass Grouping Collector
(	TokenNameLPAREN	
Sort	TokenNameIdentifier	 Sort
groupSort	TokenNameIdentifier	 group Sort
,	TokenNameCOMMA	
int	TokenNameint	
topNGroups	TokenNameIdentifier	 top N Groups
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
topNGroups	TokenNameIdentifier	 top N Groups
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"topNGroups must be >= 1 (got "	TokenNameStringLiteral	topNGroups must be >= 1 (got 
+	TokenNamePLUS	
topNGroups	TokenNameIdentifier	 top N Groups
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: allow null groupSort to mean "by relevance", 	TokenNameCOMMENT_LINE	TODO: allow null groupSort to mean "by relevance", 
// and specialize it? 	TokenNameCOMMENT_LINE	and specialize it? 
this	TokenNamethis	
.	TokenNameDOT	
groupSort	TokenNameIdentifier	 group Sort
=	TokenNameEQUAL	
groupSort	TokenNameIdentifier	 group Sort
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
topNGroups	TokenNameIdentifier	 top N Groups
=	TokenNameEQUAL	
topNGroups	TokenNameIdentifier	 top N Groups
;	TokenNameSEMICOLON	
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
compIDXEnd	TokenNameIdentifier	 comp IDX End
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sortFields	TokenNameIdentifier	 sort Fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
sortField	TokenNameIdentifier	 sort Field
=	TokenNameEQUAL	
sortFields	TokenNameIdentifier	 sort Fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// use topNGroups + 1 so we have a spare slot to use for comparing (tracked by this.spareSlot): 	TokenNameCOMMENT_LINE	use topNGroups + 1 so we have a spare slot to use for comparing (tracked by this.spareSlot): 
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sortField	TokenNameIdentifier	 sort Field
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
topNGroups	TokenNameIdentifier	 top N Groups
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
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
spareSlot	TokenNameIdentifier	 spare Slot
=	TokenNameEQUAL	
topNGroups	TokenNameIdentifier	 top N Groups
;	TokenNameSEMICOLON	
groupMap	TokenNameIdentifier	 group Map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
,	TokenNameCOMMA	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
topNGroups	TokenNameIdentifier	 top N Groups
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns top groups, starting from offset. This may * return null, if no groups were collected, or if the * number of unique groups collected is <= offset. * * @param groupOffset The offset in the collected groups * @param fillFields Whether to fill to {@link SearchGroup#sortValues} * @return top groups, starting from offset */	TokenNameCOMMENT_JAVADOC	 Returns top groups, starting from offset. This may return null, if no groups were collected, or if the number of unique groups collected is <= offset. * @param groupOffset The offset in the collected groups @param fillFields Whether to fill to {@link SearchGroup#sortValues} @return top groups, starting from offset 
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
getTopGroups	TokenNameIdentifier	 get Top Groups
(	TokenNameLPAREN	
int	TokenNameint	
groupOffset	TokenNameIdentifier	 group Offset
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println("FP.getTopGroups groupOffset=" + groupOffset + " fillFields=" + fillFields + " groupMap.size()=" + groupMap.size()); 	TokenNameCOMMENT_LINE	System.out.println("FP.getTopGroups groupOffset=" + groupOffset + " fillFields=" + fillFields + " groupMap.size()=" + groupMap.size()); 
if	TokenNameif	
(	TokenNameLPAREN	
groupOffset	TokenNameIdentifier	 group Offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"groupOffset must be >= 0 (got "	TokenNameStringLiteral	groupOffset must be >= 0 (got 
+	TokenNamePLUS	
groupOffset	TokenNameIdentifier	 group Offset
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
groupOffset	TokenNameIdentifier	 group Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
orderedGroups	TokenNameIdentifier	 ordered Groups
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buildSortedSet	TokenNameIdentifier	 build Sorted Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
sortFieldCount	TokenNameIdentifier	 sort Field Count
=	TokenNameEQUAL	
groupSort	TokenNameIdentifier	 group Sort
.	TokenNameDOT	
getSort	TokenNameIdentifier	 get Sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
:	TokenNameCOLON	
orderedGroups	TokenNameIdentifier	 ordered Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
<	TokenNameLESS	
groupOffset	TokenNameIdentifier	 group Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" group=" + (group.groupValue == null ? "null" : group.groupValue.utf8ToString())); 	TokenNameCOMMENT_LINE	System.out.println(" group=" + (group.groupValue == null ? "null" : group.groupValue.utf8ToString())); 
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
searchGroup	TokenNameIdentifier	 search Group
=	TokenNameEQUAL	
new	TokenNamenew	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
searchGroup	TokenNameIdentifier	 search Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fillFields	TokenNameIdentifier	 fill Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
searchGroup	TokenNameIdentifier	 search Group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
sortFieldCount	TokenNameIdentifier	 sort Field Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
sortFieldIDX	TokenNameIdentifier	 sort Field IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sortFieldIDX	TokenNameIdentifier	 sort Field IDX
<	TokenNameLESS	
sortFieldCount	TokenNameIdentifier	 sort Field Count
;	TokenNameSEMICOLON	
sortFieldIDX	TokenNameIdentifier	 sort Field IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
searchGroup	TokenNameIdentifier	 search Group
.	TokenNameDOT	
sortValues	TokenNameIdentifier	 sort Values
[	TokenNameLBRACKET	
sortFieldIDX	TokenNameIdentifier	 sort Field IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
sortFieldIDX	TokenNameIdentifier	 sort Field IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
searchGroup	TokenNameIdentifier	 search Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println(" return " + result.size() + " groups"); 	TokenNameCOMMENT_LINE	System.out.println(" return " + result.size() + " groups"); 
return	TokenNamereturn	
result	TokenNameIdentifier	 result
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
for	TokenNamefor	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
:	TokenNameCOLON	
comparators	TokenNameIdentifier	 comparators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
//System.out.println("FP.collect doc=" + doc); 	TokenNameCOMMENT_LINE	System.out.println("FP.collect doc=" + doc); 
// If orderedGroups != null we already have collected N groups and 	TokenNameCOMMENT_LINE	If orderedGroups != null we already have collected N groups and 
// can short circuit by comparing this document to the bottom group, 	TokenNameCOMMENT_LINE	can short circuit by comparing this document to the bottom group, 
// without having to find what group this document belongs to. 	TokenNameCOMMENT_LINE	without having to find what group this document belongs to. 
// Even if this document belongs to a group in the top N, we'll know that 	TokenNameCOMMENT_LINE	Even if this document belongs to a group in the top N, we'll know that 
// we don't have to update that group. 	TokenNameCOMMENT_LINE	we don't have to update that group. 
// Downside: if the number of unique groups is very low, this is 	TokenNameCOMMENT_LINE	Downside: if the number of unique groups is very low, this is 
// wasted effort as we will most likely be updating an existing group. 	TokenNameCOMMENT_LINE	wasted effort as we will most likely be updating an existing group. 
if	TokenNameif	
(	TokenNameLPAREN	
orderedGroups	TokenNameIdentifier	 ordered Groups
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely not competitive. So don't even bother to continue 	TokenNameCOMMENT_LINE	Definitely not competitive. So don't even bother to continue 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely competitive. 	TokenNameCOMMENT_LINE	Definitely competitive. 
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
compIDX	TokenNameIdentifier	 comp IDX
==	TokenNameEQUAL_EQUAL	
compIDXEnd	TokenNameIdentifier	 comp IDX End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Here c=0. If we're at the last comparator, this doc is not 	TokenNameCOMMENT_LINE	Here c=0. If we're at the last comparator, this doc is not 
// competitive, since docs are visited in doc Id order, which means 	TokenNameCOMMENT_LINE	competitive, since docs are visited in doc Id order, which means 
// this doc cannot compete with any other document in the queue. 	TokenNameCOMMENT_LINE	this doc cannot compete with any other document in the queue. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// TODO: should we add option to mean "ignore docs that 	TokenNameCOMMENT_LINE	TODO: should we add option to mean "ignore docs that 
// don't have the group field" (instead of stuffing them 	TokenNameCOMMENT_LINE	don't have the group field" (instead of stuffing them 
// under null group)? 	TokenNameCOMMENT_LINE	under null group)? 
final	TokenNamefinal	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
getDocGroupValue	TokenNameIdentifier	 get Doc Group Value
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
group	TokenNameIdentifier	 group
=	TokenNameEQUAL	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time we are seeing this group, or, we've seen 	TokenNameCOMMENT_LINE	First time we are seeing this group, or, we've seen 
// it before but it fell out of the top N and is now 	TokenNameCOMMENT_LINE	it before but it fell out of the top N and is now 
// coming back 	TokenNameCOMMENT_LINE	coming back 
if	TokenNameif	
(	TokenNameLPAREN	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
topNGroups	TokenNameIdentifier	 top N Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Still in startup transient: we have not 	TokenNameCOMMENT_LINE	Still in startup transient: we have not 
// seen enough unique groups to start pruning them; 	TokenNameCOMMENT_LINE	seen enough unique groups to start pruning them; 
// just keep collecting them 	TokenNameCOMMENT_LINE	just keep collecting them 
// Add a new CollectedSearchGroup: 	TokenNameCOMMENT_LINE	Add a new CollectedSearchGroup: 
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
sg	TokenNameIdentifier	 sg
=	TokenNameEQUAL	
new	TokenNamenew	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sg	TokenNameIdentifier	 sg
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
copyDocGroupValue	TokenNameIdentifier	 copy Doc Group Value
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sg	TokenNameIdentifier	 sg
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
=	TokenNameEQUAL	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sg	TokenNameIdentifier	 sg
.	TokenNameDOT	
topDoc	TokenNameIdentifier	 top Doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
fc	TokenNameIdentifier	 fc
:	TokenNameCOLON	
comparators	TokenNameIdentifier	 comparators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
sg	TokenNameIdentifier	 sg
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
sg	TokenNameIdentifier	 sg
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
sg	TokenNameIdentifier	 sg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topNGroups	TokenNameIdentifier	 top N Groups
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// End of startup transient: we now have max 	TokenNameCOMMENT_LINE	End of startup transient: we now have max 
// number of groups; from here on we will drop 	TokenNameCOMMENT_LINE	number of groups; from here on we will drop 
// bottom group when we insert new one: 	TokenNameCOMMENT_LINE	bottom group when we insert new one: 
buildSortedSet	TokenNameIdentifier	 build Sorted Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We already tested that the document is competitive, so replace 	TokenNameCOMMENT_LINE	We already tested that the document is competitive, so replace 
// the bottom group with this new group. 	TokenNameCOMMENT_LINE	the bottom group with this new group. 
// java 6-only: final CollectedSearchGroup bottomGroup = orderedGroups.pollLast(); 	TokenNameCOMMENT_LINE	java 6-only: final CollectedSearchGroup bottomGroup = orderedGroups.pollLast(); 
final	TokenNamefinal	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
bottomGroup	TokenNameIdentifier	 bottom Group
=	TokenNameEQUAL	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
bottomGroup	TokenNameIdentifier	 bottom Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topNGroups	TokenNameIdentifier	 top N Groups
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
bottomGroup	TokenNameIdentifier	 bottom Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reuse the removed CollectedSearchGroup 	TokenNameCOMMENT_LINE	reuse the removed CollectedSearchGroup 
bottomGroup	TokenNameIdentifier	 bottom Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
=	TokenNameEQUAL	
copyDocGroupValue	TokenNameIdentifier	 copy Doc Group Value
(	TokenNameLPAREN	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
bottomGroup	TokenNameIdentifier	 bottom Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bottomGroup	TokenNameIdentifier	 bottom Group
.	TokenNameDOT	
topDoc	TokenNameIdentifier	 top Doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
fc	TokenNameIdentifier	 fc
:	TokenNameCOLON	
comparators	TokenNameIdentifier	 comparators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
bottomGroup	TokenNameIdentifier	 bottom Group
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
bottomGroup	TokenNameIdentifier	 bottom Group
.	TokenNameDOT	
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
bottomGroup	TokenNameIdentifier	 bottom Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
bottomGroup	TokenNameIdentifier	 bottom Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topNGroups	TokenNameIdentifier	 top N Groups
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
lastComparatorSlot	TokenNameIdentifier	 last Comparator Slot
=	TokenNameEQUAL	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
fc	TokenNameIdentifier	 fc
:	TokenNameCOLON	
comparators	TokenNameIdentifier	 comparators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
lastComparatorSlot	TokenNameIdentifier	 last Comparator Slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Update existing group: 	TokenNameCOMMENT_LINE	Update existing group: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
fc	TokenNameIdentifier	 fc
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
spareSlot	TokenNameIdentifier	 spare Slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
,	TokenNameCOMMA	
spareSlot	TokenNameIdentifier	 spare Slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely not competitive. 	TokenNameCOMMENT_LINE	Definitely not competitive. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Definitely competitive; set remaining comparators: 	TokenNameCOMMENT_LINE	Definitely competitive; set remaining comparators: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX2	TokenNameIdentifier	 comp ID X2
=	TokenNameEQUAL	
compIDX	TokenNameIdentifier	 comp IDX
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
compIDX2	TokenNameIdentifier	 comp ID X2
<	TokenNameLESS	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
compIDX2	TokenNameIdentifier	 comp ID X2
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX2	TokenNameIdentifier	 comp ID X2
]	TokenNameRBRACKET	
.	TokenNameDOT	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
spareSlot	TokenNameIdentifier	 spare Slot
,	TokenNameCOMMA	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
compIDX	TokenNameIdentifier	 comp IDX
==	TokenNameEQUAL_EQUAL	
compIDXEnd	TokenNameIdentifier	 comp IDX End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Here c=0. If we're at the last comparator, this doc is not 	TokenNameCOMMENT_LINE	Here c=0. If we're at the last comparator, this doc is not 
// competitive, since docs are visited in doc Id order, which means 	TokenNameCOMMENT_LINE	competitive, since docs are visited in doc Id order, which means 
// this doc cannot compete with any other document in the queue. 	TokenNameCOMMENT_LINE	this doc cannot compete with any other document in the queue. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Remove before updating the group since lookup is done via comparators 	TokenNameCOMMENT_LINE	Remove before updating the group since lookup is done via comparators 
// TODO: optimize this 	TokenNameCOMMENT_LINE	TODO: optimize this 
final	TokenNamefinal	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>	TokenNameGREATER	
prevLast	TokenNameIdentifier	 prev Last
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
orderedGroups	TokenNameIdentifier	 ordered Groups
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prevLast	TokenNameIdentifier	 prev Last
=	TokenNameEQUAL	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topNGroups	TokenNameIdentifier	 top N Groups
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
prevLast	TokenNameIdentifier	 prev Last
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
topDoc	TokenNameIdentifier	 top Doc
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
// Swap slots 	TokenNameCOMMENT_LINE	Swap slots 
final	TokenNamefinal	
int	TokenNameint	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
spareSlot	TokenNameIdentifier	 spare Slot
;	TokenNameSEMICOLON	
spareSlot	TokenNameIdentifier	 spare Slot
=	TokenNameEQUAL	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
;	TokenNameSEMICOLON	
group	TokenNameIdentifier	 group
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
// Re-add the changed group 	TokenNameCOMMENT_LINE	Re-add the changed group 
if	TokenNameif	
(	TokenNameLPAREN	
orderedGroups	TokenNameIdentifier	 ordered Groups
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
topNGroups	TokenNameIdentifier	 top N Groups
;	TokenNameSEMICOLON	
final	TokenNamefinal	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
newLast	TokenNameIdentifier	 new Last
=	TokenNameEQUAL	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we changed the value of the last group, or changed which group was last, then update bottom: 	TokenNameCOMMENT_LINE	If we changed the value of the last group, or changed which group was last, then update bottom: 
if	TokenNameif	
(	TokenNameLPAREN	
group	TokenNameIdentifier	 group
==	TokenNameEQUAL_EQUAL	
newLast	TokenNameIdentifier	 new Last
||	TokenNameOR_OR	
prevLast	TokenNameIdentifier	 prev Last
!=	TokenNameNOT_EQUAL	
newLast	TokenNameIdentifier	 new Last
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
fc	TokenNameIdentifier	 fc
:	TokenNameCOLON	
comparators	TokenNameIdentifier	 comparators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
newLast	TokenNameIdentifier	 new Last
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
buildSortedSet	TokenNameIdentifier	 build Sorted Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
compIDX	TokenNameIdentifier	 comp IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
compIDX	TokenNameIdentifier	 comp IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
fc	TokenNameIdentifier	 fc
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reversed	TokenNameIdentifier	 reversed
[	TokenNameLBRACKET	
compIDX	TokenNameIdentifier	 comp IDX
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
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
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
compIDX	TokenNameIdentifier	 comp IDX
==	TokenNameEQUAL_EQUAL	
compIDXEnd	TokenNameIdentifier	 comp IDX End
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
topDoc	TokenNameIdentifier	 top Doc
-	TokenNameMINUS	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
topDoc	TokenNameIdentifier	 top Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
orderedGroups	TokenNameIdentifier	 ordered Groups
=	TokenNameEQUAL	
new	TokenNamenew	
TreeSet	TokenNameIdentifier	 Tree Set
<	TokenNameLESS	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
groupMap	TokenNameIdentifier	 group Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
fc	TokenNameIdentifier	 fc
:	TokenNameCOLON	
comparators	TokenNameIdentifier	 comparators
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
orderedGroups	TokenNameIdentifier	 ordered Groups
.	TokenNameDOT	
last	TokenNameIdentifier	 last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
comparatorSlot	TokenNameIdentifier	 comparator Slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
false	TokenNamefalse	
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
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
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
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the group value for the specified doc. * * @param doc The specified doc * @return the group value for the specified doc */	TokenNameCOMMENT_JAVADOC	 Returns the group value for the specified doc. * @param doc The specified doc @return the group value for the specified doc 
protected	TokenNameprotected	
abstract	TokenNameabstract	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
getDocGroupValue	TokenNameIdentifier	 get Doc Group Value
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns a copy of the specified group value by creating a new instance and copying the value from the specified * groupValue in the new instance. Or optionally the reuse argument can be used to copy the group value in. * * @param groupValue The group value to copy * @param reuse Optionally a reuse instance to prevent a new instance creation * @return a copy of the specified group value */	TokenNameCOMMENT_JAVADOC	 Returns a copy of the specified group value by creating a new instance and copying the value from the specified groupValue in the new instance. Or optionally the reuse argument can be used to copy the group value in. * @param groupValue The group value to copy @param reuse Optionally a reuse instance to prevent a new instance creation @return a copy of the specified group value 
protected	TokenNameprotected	
abstract	TokenNameabstract	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
copyDocGroupValue	TokenNameIdentifier	 copy Doc Group Value
(	TokenNameLPAREN	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
groupValue	TokenNameIdentifier	 group Value
,	TokenNameCOMMA	
GROUP_VALUE_TYPE	TokenNameIdentifier	 GROUP  VALUE  TYPE
reuse	TokenNameIdentifier	 reuse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
CollectedSearchGroup	TokenNameIdentifier	 Collected Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
extends	TokenNameextends	
SearchGroup	TokenNameIdentifier	 Search Group
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
int	TokenNameint	
topDoc	TokenNameIdentifier	 top Doc
;	TokenNameSEMICOLON	
int	TokenNameint	
comparatorSlot	TokenNameIdentifier	 comparator Slot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
