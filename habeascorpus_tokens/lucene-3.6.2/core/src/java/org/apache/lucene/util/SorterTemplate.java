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
/** * This class was inspired by CGLIB, but provides a better * QuickSort algorithm without additional InsertionSort * at the end. * To use, subclass and override the four abstract methods * which compare and modify your data. * Allows custom swap so that two arrays can be sorted * at the same time. * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 This class was inspired by CGLIB, but provides a better QuickSort algorithm without additional InsertionSort at the end. To use, subclass and override the four abstract methods which compare and modify your data. Allows custom swap so that two arrays can be sorted at the same time. @lucene.internal 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
SorterTemplate	TokenNameIdentifier	 Sorter Template
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MERGESORT_THRESHOLD	TokenNameIdentifier	 MERGESORT  THRESHOLD
=	TokenNameEQUAL	
12	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
QUICKSORT_THRESHOLD	TokenNameIdentifier	 QUICKSORT  THRESHOLD
=	TokenNameEQUAL	
7	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Implement this method, that swaps slots {@code i} and {@code j} in your data */	TokenNameCOMMENT_JAVADOC	 Implement this method, that swaps slots {@code i} and {@code j} in your data 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Compares slots {@code i} and {@code j} of you data. * Should be implemented like <code><em>valueOf(i)</em>.compareTo(<em>valueOf(j)</em>)</code> */	TokenNameCOMMENT_JAVADOC	 Compares slots {@code i} and {@code j} of you data. Should be implemented like <code><em>valueOf(i)</em>.compareTo(<em>valueOf(j)</em>)</code> 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Implement this method, that stores the value of slot {@code i} as pivot value */	TokenNameCOMMENT_JAVADOC	 Implement this method, that stores the value of slot {@code i} as pivot value 
protected	TokenNameprotected	
abstract	TokenNameabstract	
void	TokenNamevoid	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Implements the compare function for the previously stored pivot value. * Should be implemented like <code>pivot.compareTo(<em>valueOf(j)</em>)</code> */	TokenNameCOMMENT_JAVADOC	 Implements the compare function for the previously stored pivot value. Should be implemented like <code>pivot.compareTo(<em>valueOf(j)</em>)</code> 
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Sorts via stable in-place InsertionSort algorithm *(ideal for small collections which are mostly presorted). */	TokenNameCOMMENT_JAVADOC	 Sorts via stable in-place InsertionSort algorithm *(ideal for small collections which are mostly presorted). 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>	TokenNameGREATER	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sorts via in-place, but unstable, QuickSort algorithm. * For small collections falls back to {@link #insertionSort(int,int)}. */	TokenNameCOMMENT_JAVADOC	 Sorts via in-place, but unstable, QuickSort algorithm. For small collections falls back to {@link #insertionSort(int,int)}. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
final	TokenNamefinal	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
<=	TokenNameLESS_EQUAL	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// from Integer's Javadocs: ceil(log2(x)) = 32 - numberOfLeadingZeros(x - 1) 	TokenNameCOMMENT_LINE	from Integer's Javadocs: ceil(log2(x)) = 32 - numberOfLeadingZeros(x - 1) 
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
SIZE	TokenNameIdentifier	 SIZE
-	TokenNameMINUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
numberOfLeadingZeros	TokenNameIdentifier	 number Of Leading Zeros
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
int	TokenNameint	
maxDepth	TokenNameIdentifier	 max Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// fall back to insertion when array has short length 	TokenNameCOMMENT_LINE	fall back to insertion when array has short length 
final	TokenNamefinal	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<=	TokenNameLESS_EQUAL	
QUICKSORT_THRESHOLD	TokenNameIdentifier	 QUICKSORT  THRESHOLD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fall back to merge sort when recursion depth gets too big 	TokenNameCOMMENT_LINE	fall back to merge sort when recursion depth gets too big 
if	TokenNameif	
(	TokenNameLPAREN	
--	TokenNameMINUS_MINUS	
maxDepth	TokenNameIdentifier	 max Depth
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
setPivot	TokenNameIdentifier	 set Pivot
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
--	TokenNameMINUS_MINUS	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
<	TokenNameLESS	
right	TokenNameIdentifier	 right
&&	TokenNameAND_AND	
comparePivot	TokenNameIdentifier	 compare Pivot
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
++	TokenNamePLUS_PLUS	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
<	TokenNameLESS	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
maxDepth	TokenNameIdentifier	 max Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
maxDepth	TokenNameIdentifier	 max Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Sorts via stable in-place MergeSort algorithm * For small collections falls back to {@link #insertionSort(int,int)}. */	TokenNameCOMMENT_JAVADOC	 Sorts via stable in-place MergeSort algorithm For small collections falls back to {@link #insertionSort(int,int)}. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
<=	TokenNameLESS_EQUAL	
MERGESORT_THRESHOLD	TokenNameIdentifier	 MERGESORT  THRESHOLD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
insertionSort	TokenNameIdentifier	 insertion Sort
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
(	TokenNameLPAREN	
diff	TokenNameIdentifier	 diff
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
int	TokenNameint	
len1	TokenNameIdentifier	 len1
,	TokenNameCOMMA	
int	TokenNameint	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
len2	TokenNameIdentifier	 len2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
+	TokenNamePLUS	
len2	TokenNameIdentifier	 len2
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
first_cut	TokenNameIdentifier	 first cut
,	TokenNameCOMMA	
second_cut	TokenNameIdentifier	 second cut
;	TokenNameSEMICOLON	
int	TokenNameint	
len11	TokenNameIdentifier	 len11
,	TokenNameCOMMA	
len22	TokenNameIdentifier	 len22
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len1	TokenNameIdentifier	 len1
>	TokenNameGREATER	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len11	TokenNameIdentifier	 len11
=	TokenNameEQUAL	
len1	TokenNameIdentifier	 len1
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
first_cut	TokenNameIdentifier	 first cut
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
len11	TokenNameIdentifier	 len11
;	TokenNameSEMICOLON	
second_cut	TokenNameIdentifier	 second cut
=	TokenNameEQUAL	
lower	TokenNameIdentifier	 lower
(	TokenNameLPAREN	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
first_cut	TokenNameIdentifier	 first cut
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len22	TokenNameIdentifier	 len22
=	TokenNameEQUAL	
second_cut	TokenNameIdentifier	 second cut
-	TokenNameMINUS	
pivot	TokenNameIdentifier	 pivot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
len22	TokenNameIdentifier	 len22
=	TokenNameEQUAL	
len2	TokenNameIdentifier	 len2
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
second_cut	TokenNameIdentifier	 second cut
=	TokenNameEQUAL	
pivot	TokenNameIdentifier	 pivot
+	TokenNamePLUS	
len22	TokenNameIdentifier	 len22
;	TokenNameSEMICOLON	
first_cut	TokenNameIdentifier	 first cut
=	TokenNameEQUAL	
upper	TokenNameIdentifier	 upper
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
second_cut	TokenNameIdentifier	 second cut
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
len11	TokenNameIdentifier	 len11
=	TokenNameEQUAL	
first_cut	TokenNameIdentifier	 first cut
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
first_cut	TokenNameIdentifier	 first cut
,	TokenNameCOMMA	
pivot	TokenNameIdentifier	 pivot
,	TokenNameCOMMA	
second_cut	TokenNameIdentifier	 second cut
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
new_mid	TokenNameIdentifier	 new mid
=	TokenNameEQUAL	
first_cut	TokenNameIdentifier	 first cut
+	TokenNamePLUS	
len22	TokenNameIdentifier	 len22
;	TokenNameSEMICOLON	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
first_cut	TokenNameIdentifier	 first cut
,	TokenNameCOMMA	
new_mid	TokenNameIdentifier	 new mid
,	TokenNameCOMMA	
len11	TokenNameIdentifier	 len11
,	TokenNameCOMMA	
len22	TokenNameIdentifier	 len22
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
new_mid	TokenNameIdentifier	 new mid
,	TokenNameCOMMA	
second_cut	TokenNameIdentifier	 second cut
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
len1	TokenNameIdentifier	 len1
-	TokenNameMINUS	
len11	TokenNameIdentifier	 len11
,	TokenNameCOMMA	
len2	TokenNameIdentifier	 len2
-	TokenNameMINUS	
len22	TokenNameIdentifier	 len22
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
rotate	TokenNameIdentifier	 rotate
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lot	TokenNameIdentifier	 lot
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
int	TokenNameint	
hit	TokenNameIdentifier	 hit
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lot	TokenNameIdentifier	 lot
<	TokenNameLESS	
hit	TokenNameIdentifier	 hit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
lot	TokenNameIdentifier	 lot
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
hit	TokenNameIdentifier	 hit
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lot	TokenNameIdentifier	 lot
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
hit	TokenNameIdentifier	 hit
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lot	TokenNameIdentifier	 lot
<	TokenNameLESS	
hit	TokenNameIdentifier	 hit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
lot	TokenNameIdentifier	 lot
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
hit	TokenNameIdentifier	 hit
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lot	TokenNameIdentifier	 lot
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
hit	TokenNameIdentifier	 hit
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lot	TokenNameIdentifier	 lot
<	TokenNameLESS	
hit	TokenNameIdentifier	 hit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
swap	TokenNameIdentifier	 swap
(	TokenNameLPAREN	
lot	TokenNameIdentifier	 lot
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
hit	TokenNameIdentifier	 hit
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
lower	TokenNameIdentifier	 lower
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
half	TokenNameIdentifier	 half
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
half	TokenNameIdentifier	 half
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
mid	TokenNameIdentifier	 mid
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
half	TokenNameIdentifier	 half
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
half	TokenNameIdentifier	 half
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
upper	TokenNameIdentifier	 upper
(	TokenNameLPAREN	
int	TokenNameint	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
int	TokenNameint	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
int	TokenNameint	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
-	TokenNameMINUS	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
half	TokenNameIdentifier	 half
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
+	TokenNamePLUS	
half	TokenNameIdentifier	 half
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
,	TokenNameCOMMA	
mid	TokenNameIdentifier	 mid
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
half	TokenNameIdentifier	 half
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
half	TokenNameIdentifier	 half
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
