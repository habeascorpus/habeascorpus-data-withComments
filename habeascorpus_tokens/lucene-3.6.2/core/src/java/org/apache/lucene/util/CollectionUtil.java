package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RandomAccess	TokenNameIdentifier	 Random Access
;	TokenNameSEMICOLON	
/** * Methods for manipulating (sorting) collections. * Sort methods work directly on the supplied lists and don't copy to/from arrays * before/after. For medium size collections as used in the Lucene indexer that is * much more efficient. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Methods for manipulating (sorting) collections. Sort methods work directly on the supplied lists and don't copy to/from arrays before/after. For medium size collections as used in the Lucene indexer that is much more efficient. * @lucene.internal 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
CollectionUtil	TokenNameIdentifier	 Collection Util
{	TokenNameLBRACE	
private	TokenNameprivate	
CollectionUtil	TokenNameIdentifier	 Collection Util
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// no instance 	TokenNameCOMMENT_LINE	no instance 
/** SorterTemplate with custom {@link Comparator} */	TokenNameCOMMENT_JAVADOC	 SorterTemplate with custom {@link Comparator} 
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
SorterTemplate	TokenNameIdentifier	 Sorter Template
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
instanceof	TokenNameinstanceof	
RandomAccess	TokenNameIdentifier	 Random Access
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"CollectionUtil can only sort random access lists in-place."	TokenNameStringLiteral	CollectionUtil can only sort random access lists in-place.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SorterTemplate	TokenNameIdentifier	 Sorter Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
T	TokenNameIdentifier	 T
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Natural SorterTemplate */	TokenNameCOMMENT_JAVADOC	 Natural SorterTemplate 
private	TokenNameprivate	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
SorterTemplate	TokenNameIdentifier	 Sorter Template
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
instanceof	TokenNameinstanceof	
RandomAccess	TokenNameIdentifier	 Random Access
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"CollectionUtil can only sort random access lists in-place."	TokenNameStringLiteral	CollectionUtil can only sort random access lists in-place.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
SorterTemplate	TokenNameIdentifier	 Sorter Template
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pivot	TokenNameIdentifier	 pivot
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
int	TokenNameint	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pivot	TokenNameIdentifier	 pivot
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
T	TokenNameIdentifier	 T
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given random access {@link List} using the {@link Comparator}. * The list must implement {@link RandomAccess}. This method uses the quick sort * algorithm, but falls back to insertion sort for small lists. * @throws IllegalArgumentException if list is e.g. a linked list without random access. */	TokenNameCOMMENT_JAVADOC	 Sorts the given random access {@link List} using the {@link Comparator}. The list must implement {@link RandomAccess}. This method uses the quick sort algorithm, but falls back to insertion sort for small lists. @throws IllegalArgumentException if list is e.g. a linked list without random access. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given random access {@link List} in natural order. * The list must implement {@link RandomAccess}. This method uses the quick sort * algorithm, but falls back to insertion sort for small lists. * @throws IllegalArgumentException if list is e.g. a linked list without random access. */	TokenNameCOMMENT_JAVADOC	 Sorts the given random access {@link List} in natural order. The list must implement {@link RandomAccess}. This method uses the quick sort algorithm, but falls back to insertion sort for small lists. @throws IllegalArgumentException if list is e.g. a linked list without random access. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// mergeSorts: 	TokenNameCOMMENT_LINE	mergeSorts: 
/** * Sorts the given random access {@link List} using the {@link Comparator}. * The list must implement {@link RandomAccess}. This method uses the merge sort * algorithm, but falls back to insertion sort for small lists. * @throws IllegalArgumentException if list is e.g. a linked list without random access. */	TokenNameCOMMENT_JAVADOC	 Sorts the given random access {@link List} using the {@link Comparator}. The list must implement {@link RandomAccess}. This method uses the merge sort algorithm, but falls back to insertion sort for small lists. @throws IllegalArgumentException if list is e.g. a linked list without random access. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given random access {@link List} in natural order. * The list must implement {@link RandomAccess}. This method uses the merge sort * algorithm, but falls back to insertion sort for small lists. * @throws IllegalArgumentException if list is e.g. a linked list without random access. */	TokenNameCOMMENT_JAVADOC	 Sorts the given random access {@link List} in natural order. The list must implement {@link RandomAccess}. This method uses the merge sort algorithm, but falls back to insertion sort for small lists. @throws IllegalArgumentException if list is e.g. a linked list without random access. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// insertionSorts: 	TokenNameCOMMENT_LINE	insertionSorts: 
/** * Sorts the given random access {@link List} using the {@link Comparator}. * The list must implement {@link RandomAccess}. This method uses the insertion sort * algorithm. It is only recommended to use this algorithm for partially sorted small lists! * @throws IllegalArgumentException if list is e.g. a linked list without random access. */	TokenNameCOMMENT_JAVADOC	 Sorts the given random access {@link List} using the {@link Comparator}. The list must implement {@link RandomAccess}. This method uses the insertion sort algorithm. It is only recommended to use this algorithm for partially sorted small lists! @throws IllegalArgumentException if list is e.g. a linked list without random access. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
void	TokenNamevoid	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
.	TokenNameDOT	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the given random access {@link List} in natural order. * The list must implement {@link RandomAccess}. This method uses the insertion sort * algorithm. It is only recommended to use this algorithm for partially sorted small lists! * @throws IllegalArgumentException if list is e.g. a linked list without random access. */	TokenNameCOMMENT_JAVADOC	 Sorts the given random access {@link List} in natural order. The list must implement {@link RandomAccess}. This method uses the insertion sort algorithm. It is only recommended to use this algorithm for partially sorted small lists! @throws IllegalArgumentException if list is e.g. a linked list without random access. 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
?	TokenNameQUESTION	
super	TokenNamesuper	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
void	TokenNamevoid	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
list	TokenNameIdentifier	 list
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
getSorter	TokenNameIdentifier	 get Sorter
(	TokenNameLPAREN	
list	TokenNameIdentifier	 list
)	TokenNameRPAREN	
.	TokenNameDOT	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
