package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
collections	TokenNameIdentifier	 collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A Class wrapper for a grow-able int[] which can be sorted and intersect with * other IntArrays. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A Class wrapper for a grow-able int[] which can be sorted and intersect with other IntArrays. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
IntArray	TokenNameIdentifier	 Int Array
{	TokenNameLBRACE	
/** * The int[] which holds the data */	TokenNameCOMMENT_JAVADOC	 The int[] which holds the data 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
data	TokenNameIdentifier	 data
;	TokenNameSEMICOLON	
/** * Holds the number of items in the array. */	TokenNameCOMMENT_JAVADOC	 Holds the number of items in the array. 
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/** * A flag which indicates whether a sort should occur of the array is * already sorted. */	TokenNameCOMMENT_JAVADOC	 A flag which indicates whether a sort should occur of the array is already sorted. 
private	TokenNameprivate	
boolean	TokenNameboolean	
shouldSort	TokenNameIdentifier	 should Sort
;	TokenNameSEMICOLON	
/** * Construct a default IntArray, size 0 and surly a sort should not occur. */	TokenNameCOMMENT_JAVADOC	 Construct a default IntArray, size 0 and surly a sort should not occur. 
public	TokenNamepublic	
IntArray	TokenNameIdentifier	 Int Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
boolean	TokenNameboolean	
realloc	TokenNameIdentifier	 realloc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
realloc	TokenNameIdentifier	 realloc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
shouldSort	TokenNameIdentifier	 should Sort
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Intersects the data with a given {@link IntHashSet}. * * @param set * A given ArrayHashSetInt which holds the data to be intersected * against */	TokenNameCOMMENT_JAVADOC	 Intersects the data with a given {@link IntHashSet}. * @param set A given ArrayHashSetInt which holds the data to be intersected against 
public	TokenNamepublic	
void	TokenNamevoid	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
IntHashSet	TokenNameIdentifier	 Int Hash Set
set	TokenNameIdentifier	 set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Intersects the data with a given IntArray * * @param other * A given IntArray which holds the data to be intersected agains */	TokenNameCOMMENT_JAVADOC	 Intersects the data with a given IntArray * @param other A given IntArray which holds the data to be intersected agains 
public	TokenNamepublic	
void	TokenNamevoid	
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
IntArray	TokenNameIdentifier	 Int Array
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
myIndex	TokenNameIdentifier	 my Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
otherIndex	TokenNameIdentifier	 other Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
otherIndex	TokenNameIdentifier	 other Index
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
myIndex	TokenNameIdentifier	 my Index
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
otherIndex	TokenNameIdentifier	 other Index
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
otherIndex	TokenNameIdentifier	 other Index
]	TokenNameRBRACKET	
<	TokenNameLESS	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
myIndex	TokenNameIdentifier	 my Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
otherIndex	TokenNameIdentifier	 other Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
otherIndex	TokenNameIdentifier	 other Index
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
myIndex	TokenNameIdentifier	 my Index
<	TokenNameLESS	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
otherIndex	TokenNameIdentifier	 other Index
]	TokenNameRBRACKET	
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
myIndex	TokenNameIdentifier	 my Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
myIndex	TokenNameIdentifier	 my Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
otherIndex	TokenNameIdentifier	 other Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
myIndex	TokenNameIdentifier	 my Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
myIndex	TokenNameIdentifier	 my Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
otherIndex	TokenNameIdentifier	 other Index
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
myIndex	TokenNameIdentifier	 my Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
otherIndex	TokenNameIdentifier	 other Index
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
myIndex	TokenNameIdentifier	 my Index
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
myIndex	TokenNameIdentifier	 my Index
<	TokenNameLESS	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
otherIndex	TokenNameIdentifier	 other Index
]	TokenNameRBRACKET	
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
myIndex	TokenNameIdentifier	 my Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
myIndex	TokenNameIdentifier	 my Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
myIndex	TokenNameIdentifier	 my Index
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
otherIndex	TokenNameIdentifier	 other Index
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
size	TokenNameIdentifier	 size
&&	TokenNameAND_AND	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
otherIndex	TokenNameIdentifier	 other Index
]	TokenNameRBRACKET	
<	TokenNameLESS	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
myIndex	TokenNameIdentifier	 my Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
++	TokenNamePLUS_PLUS	
otherIndex	TokenNameIdentifier	 other Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
otherIndex	TokenNameIdentifier	 other Index
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
myIndex	TokenNameIdentifier	 my Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
myIndex	TokenNameIdentifier	 my Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
otherIndex	TokenNameIdentifier	 other Index
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
myIndex	TokenNameIdentifier	 my Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
newSize	TokenNameIdentifier	 new Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the size of the Array. Not the allocated size, but the number of * values actually set. * * @return the (filled) size of the array */	TokenNameCOMMENT_JAVADOC	 Return the size of the Array. Not the allocated size, but the number of values actually set. * @return the (filled) size of the array 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a value to the array. * * @param value * value to be added */	TokenNameCOMMENT_JAVADOC	 Adds a value to the array. * @param value value to be added 
public	TokenNamepublic	
void	TokenNamevoid	
addToArray	TokenNameIdentifier	 add To Array
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
shouldSort	TokenNameIdentifier	 should Sort
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Equals method. Checking the sizes, than the values from the last index to * the first (Statistically for random should be the same but for our * specific use would find differences faster). */	TokenNameCOMMENT_JAVADOC	 Equals method. Checking the sizes, than the values from the last index to the first (Statistically for random should be the same but for our specific use would find differences faster). 
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
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
IntArray	TokenNameIdentifier	 Int Array
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
IntArray	TokenNameIdentifier	 Int Array
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntArray	TokenNameIdentifier	 Int Array
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
size	TokenNameIdentifier	 size
!=	TokenNameNOT_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
equal	TokenNameIdentifier	 equal
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
equal	TokenNameIdentifier	 equal
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
equal	TokenNameIdentifier	 equal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
equal	TokenNameIdentifier	 equal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sorts the data. If it is needed. */	TokenNameCOMMENT_JAVADOC	 Sorts the data. If it is needed. 
public	TokenNamepublic	
void	TokenNamevoid	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldSort	TokenNameIdentifier	 should Sort
)	TokenNameRPAREN	
{	TokenNameLBRACE	
shouldSort	TokenNameIdentifier	 should Sort
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Calculates a hash-code for HashTables */	TokenNameCOMMENT_JAVADOC	 Calculates a hash-code for HashTables 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
^	TokenNameXOR	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an element from a specific index. * * @param i * index of which element should be retrieved. */	TokenNameCOMMENT_JAVADOC	 Get an element from a specific index. * @param i index of which element should be retrieved. 
public	TokenNamepublic	
int	TokenNameint	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
ArrayIndexOutOfBoundsException	TokenNameIdentifier	 Array Index Out Of Bounds Exception
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * toString or not toString. That is the question! */	TokenNameCOMMENT_JAVADOC	 toString or not toString. That is the question! 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
") "	TokenNameStringLiteral	) 
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
""	TokenNameStringLiteral	 
+	TokenNamePLUS	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clear the IntArray (set all elements to zero). * @param resize - if resize is true, then clear actually allocates * a new array of size 0, essentially 'clearing' the array and freeing * memory. */	TokenNameCOMMENT_JAVADOC	 Clear the IntArray (set all elements to zero). @param resize - if resize is true, then clear actually allocates a new array of size 0, essentially 'clearing' the array and freeing memory. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
boolean	TokenNameboolean	
resize	TokenNameIdentifier	 resize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
resize	TokenNameIdentifier	 resize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
