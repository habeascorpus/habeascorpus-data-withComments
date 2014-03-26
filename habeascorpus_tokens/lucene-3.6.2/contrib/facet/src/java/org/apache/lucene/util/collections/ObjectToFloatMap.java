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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * An Array-based hashtable which maps Objects of generic type * T to primitive float values.<br> * The hashtable is constructed with a given capacity, or 16 as a default. In * case there's not enough room for new pairs, the hashtable grows. <br> * Capacity is adjusted to a power of 2, and there are 2 * capacity entries for * the hash. * * The pre allocated arrays (for keys, values) are at length of capacity + 1, * when index 0 is used as 'Ground' or 'NULL'.<br> * * The arrays are allocated ahead of hash operations, and form an 'empty space' * list, to which the key,value pair is allocated. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An Array-based hashtable which maps Objects of generic type T to primitive float values.<br> The hashtable is constructed with a given capacity, or 16 as a default. In case there's not enough room for new pairs, the hashtable grows. <br> Capacity is adjusted to a power of 2, and there are 2 capacity entries for the hash. * The pre allocated arrays (for keys, values) are at length of capacity + 1, when index 0 is used as 'Ground' or 'NULL'.<br> * The arrays are allocated ahead of hash operations, and form an 'empty space' list, to which the key,value pair is allocated. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
ObjectToFloatMap	TokenNameIdentifier	 Object To Float Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Implements an IntIterator which iterates over all the allocated indexes. */	TokenNameCOMMENT_JAVADOC	 Implements an IntIterator which iterates over all the allocated indexes. 
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
IndexIterator	TokenNameIdentifier	 Index Iterator
implements	TokenNameimplements	
IntIterator	TokenNameIdentifier	 Int Iterator
{	TokenNameLBRACE	
/** * The last used baseHashIndex. Needed for "jumping" from one hash entry * to another. */	TokenNameCOMMENT_JAVADOC	 The last used baseHashIndex. Needed for "jumping" from one hash entry to another. 
private	TokenNameprivate	
int	TokenNameint	
baseHashIndex	TokenNameIdentifier	 base Hash Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The next not-yet-visited index. */	TokenNameCOMMENT_JAVADOC	 The next not-yet-visited index. 
private	TokenNameprivate	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Index of the last visited pair. Used in {@link #remove()}. */	TokenNameCOMMENT_JAVADOC	 Index of the last visited pair. Used in {@link #remove()}. 
private	TokenNameprivate	
int	TokenNameint	
lastIndex	TokenNameIdentifier	 last Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Create the Iterator, make <code>index</code> point to the "first" * index which is not empty. If such does not exist (eg. the map is * empty) it would be zero. */	TokenNameCOMMENT_JAVADOC	 Create the Iterator, make <code>index</code> point to the "first" index which is not empty. If such does not exist (eg. the map is empty) it would be zero. 
public	TokenNamepublic	
IndexIterator	TokenNameIdentifier	 Index Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
baseHashIndex	TokenNameIdentifier	 base Hash Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
baseHashIndex	TokenNameIdentifier	 base Hash Index
<	TokenNameLESS	
baseHash	TokenNameIdentifier	 base Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
baseHashIndex	TokenNameIdentifier	 base Hash Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
baseHashIndex	TokenNameIdentifier	 base Hash Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Save the last index visited 	TokenNameCOMMENT_LINE	Save the last index visited 
lastIndex	TokenNameIdentifier	 last Index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// next the index 	TokenNameCOMMENT_LINE	next the index 
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// if the next index points to the 'Ground' it means we're done with 	TokenNameCOMMENT_LINE	if the next index points to the 'Ground' it means we're done with 
// the current hash entry and we need to jump to the next one. This 	TokenNameCOMMENT_LINE	the current hash entry and we need to jump to the next one. This 
// is done until all the hash entries had been visited. 	TokenNameCOMMENT_LINE	is done until all the hash entries had been visited. 
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
++	TokenNamePLUS_PLUS	
baseHashIndex	TokenNameIdentifier	 base Hash Index
<	TokenNameLESS	
baseHash	TokenNameIdentifier	 base Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
baseHashIndex	TokenNameIdentifier	 base Hash Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastIndex	TokenNameIdentifier	 last Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ObjectToFloatMap	TokenNameIdentifier	 Object To Float Map
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
lastIndex	TokenNameIdentifier	 last Index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements an IntIterator, used for iteration over the map's keys. */	TokenNameCOMMENT_JAVADOC	 Implements an IntIterator, used for iteration over the map's keys. 
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
KeyIterator	TokenNameIdentifier	 Key Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
IntIterator	TokenNameIdentifier	 Int Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
IndexIterator	TokenNameIdentifier	 Index Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
KeyIterator	TokenNameIdentifier	 Key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
K	TokenNameIdentifier	 K
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
)	TokenNameRPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Implements an Iterator of a generic type T used for iteration over the * map's values. */	TokenNameCOMMENT_JAVADOC	 Implements an Iterator of a generic type T used for iteration over the map's values. 
private	TokenNameprivate	
final	TokenNamefinal	
class	TokenNameclass	
ValueIterator	TokenNameIdentifier	 Value Iterator
implements	TokenNameimplements	
FloatIterator	TokenNameIdentifier	 Float Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
IntIterator	TokenNameIdentifier	 Int Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
IndexIterator	TokenNameIdentifier	 Index Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ValueIterator	TokenNameIdentifier	 Value Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Default capacity - in case no capacity was specified in the constructor */	TokenNameCOMMENT_JAVADOC	 Default capacity - in case no capacity was specified in the constructor 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
defaultCapacity	TokenNameIdentifier	 default Capacity
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Holds the base hash entries. if the capacity is 2^N, than the base hash * holds 2^(N+1). It can hold */	TokenNameCOMMENT_JAVADOC	 Holds the base hash entries. if the capacity is 2^N, than the base hash holds 2^(N+1). It can hold 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
baseHash	TokenNameIdentifier	 base Hash
;	TokenNameSEMICOLON	
/** * The current capacity of the map. Always 2^N and never less than 16. We * never use the zero index. It is needed to improve performance and is also * used as "ground". */	TokenNameCOMMENT_JAVADOC	 The current capacity of the map. Always 2^N and never less than 16. We never use the zero index. It is needed to improve performance and is also used as "ground". 
private	TokenNameprivate	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
/** * All objects are being allocated at map creation. Those objects are "free" * or empty. Whenever a new pair comes along, a pair is being "allocated" or * taken from the free-linked list. as this is just a free list. */	TokenNameCOMMENT_JAVADOC	 All objects are being allocated at map creation. Those objects are "free" or empty. Whenever a new pair comes along, a pair is being "allocated" or taken from the free-linked list. as this is just a free list. 
private	TokenNameprivate	
int	TokenNameint	
firstEmpty	TokenNameIdentifier	 first Empty
;	TokenNameSEMICOLON	
/** * hashFactor is always (2^(N+1)) - 1. Used for faster hashing. */	TokenNameCOMMENT_JAVADOC	 hashFactor is always (2^(N+1)) - 1. Used for faster hashing. 
private	TokenNameprivate	
int	TokenNameint	
hashFactor	TokenNameIdentifier	 hash Factor
;	TokenNameSEMICOLON	
/** * This array holds the unique keys */	TokenNameCOMMENT_JAVADOC	 This array holds the unique keys 
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
/** * In case of collisions, we implement a double linked list of the colliding * hash's with the following next[] and prev[]. Those are also used to store * the "empty" list. */	TokenNameCOMMENT_JAVADOC	 In case of collisions, we implement a double linked list of the colliding hash's with the following next[] and prev[]. Those are also used to store the "empty" list. 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
/** * Number of currently objects in the map. */	TokenNameCOMMENT_JAVADOC	 Number of currently objects in the map. 
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
/** * This array holds the values */	TokenNameCOMMENT_JAVADOC	 This array holds the values 
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
/** * Constructs a map with default capacity. */	TokenNameCOMMENT_JAVADOC	 Constructs a map with default capacity. 
public	TokenNamepublic	
ObjectToFloatMap	TokenNameIdentifier	 Object To Float Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
defaultCapacity	TokenNameIdentifier	 default Capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a map with given capacity. Capacity is adjusted to a native * power of 2, with minimum of 16. * * @param capacity * minimum capacity for the map. */	TokenNameCOMMENT_JAVADOC	 Constructs a map with given capacity. Capacity is adjusted to a native power of 2, with minimum of 16. * @param capacity minimum capacity for the map. 
public	TokenNamepublic	
ObjectToFloatMap	TokenNameIdentifier	 Object To Float Map
(	TokenNameLPAREN	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Minimum capacity is 16.. 	TokenNameCOMMENT_LINE	Minimum capacity is 16.. 
while	TokenNamewhile	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
<	TokenNameLESS	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Multiply by 2 as long as we're still under the requested capacity 	TokenNameCOMMENT_LINE	Multiply by 2 as long as we're still under the requested capacity 
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
<<=	TokenNameLEFT_SHIFT_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// As mentioned, we use the first index (0) as 'Ground', so we need the 	TokenNameCOMMENT_LINE	As mentioned, we use the first index (0) as 'Ground', so we need the 
// length of the arrays to be one more than the capacity 	TokenNameCOMMENT_LINE	length of the arrays to be one more than the capacity 
int	TokenNameint	
arrayLength	TokenNameIdentifier	 array Length
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
arrayLength	TokenNameIdentifier	 array Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
arrayLength	TokenNameIdentifier	 array Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
arrayLength	TokenNameIdentifier	 array Length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Hash entries are twice as big as the capacity. 	TokenNameCOMMENT_LINE	Hash entries are twice as big as the capacity. 
int	TokenNameint	
baseHashSize	TokenNameIdentifier	 base Hash Size
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseHash	TokenNameIdentifier	 base Hash
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
baseHashSize	TokenNameIdentifier	 base Hash Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// The has factor is 2^M - 1 which is used as an "AND" hashing operator. 	TokenNameCOMMENT_LINE	The has factor is 2^M - 1 which is used as an "AND" hashing operator. 
// {@link #calcBaseHash()} 	TokenNameCOMMENT_LINE	{@link #calcBaseHash()} 
this	TokenNamethis	
.	TokenNameDOT	
hashFactor	TokenNameIdentifier	 hash Factor
=	TokenNameEQUAL	
baseHashSize	TokenNameIdentifier	 base Hash Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a pair to the map. Takes the first empty position from the * empty-linked-list's head - {@link firstEmpty}. * * New pairs are always inserted to baseHash, and are followed by the old * colliding pair. * * @param key * integer which maps the given Object * @param e * element which is being mapped using the given key */	TokenNameCOMMENT_JAVADOC	 Adds a pair to the map. Takes the first empty position from the empty-linked-list's head - {@link firstEmpty}. * New pairs are always inserted to baseHash, and are followed by the old colliding pair. * @param key integer which maps the given Object @param e element which is being mapped using the given key 
private	TokenNameprivate	
void	TokenNamevoid	
prvt_put	TokenNameIdentifier	 prvt put
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Hash entry to which the new pair would be inserted 	TokenNameCOMMENT_LINE	Hash entry to which the new pair would be inserted 
int	TokenNameint	
hashIndex	TokenNameIdentifier	 hash Index
=	TokenNameEQUAL	
calcBaseHashIndex	TokenNameIdentifier	 calc Base Hash Index
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 'Allocating' a pair from the "Empty" list. 	TokenNameCOMMENT_LINE	'Allocating' a pair from the "Empty" list. 
int	TokenNameint	
objectIndex	TokenNameIdentifier	 object Index
=	TokenNameEQUAL	
firstEmpty	TokenNameIdentifier	 first Empty
;	TokenNameSEMICOLON	
// Setting data 	TokenNameCOMMENT_LINE	Setting data 
firstEmpty	TokenNameIdentifier	 first Empty
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
firstEmpty	TokenNameIdentifier	 first Empty
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
objectIndex	TokenNameIdentifier	 object Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
objectIndex	TokenNameIdentifier	 object Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
// Inserting the new pair as the first node in the specific hash entry 	TokenNameCOMMENT_LINE	Inserting the new pair as the first node in the specific hash entry 
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
objectIndex	TokenNameIdentifier	 object Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
hashIndex	TokenNameIdentifier	 hash Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
hashIndex	TokenNameIdentifier	 hash Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
objectIndex	TokenNameIdentifier	 object Index
;	TokenNameSEMICOLON	
// Announcing a new pair was added! 	TokenNameCOMMENT_LINE	Announcing a new pair was added! 
++	TokenNamePLUS_PLUS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculating the baseHash index using the internal <code>hashFactor</code>. * * @param key */	TokenNameCOMMENT_JAVADOC	 Calculating the baseHash index using the internal <code>hashFactor</code>. * @param key 
protected	TokenNameprotected	
int	TokenNameint	
calcBaseHashIndex	TokenNameIdentifier	 calc Base Hash Index
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
hashFactor	TokenNameIdentifier	 hash Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Empties the map. Generates the "Empty" space list for later allocation. */	TokenNameCOMMENT_JAVADOC	 Empties the map. Generates the "Empty" space list for later allocation. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Clears the hash entries 	TokenNameCOMMENT_LINE	Clears the hash entries 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
baseHash	TokenNameIdentifier	 base Hash
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Set size to zero 	TokenNameCOMMENT_LINE	Set size to zero 
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
// Mark all array entries as empty. This is done with 	TokenNameCOMMENT_LINE	Mark all array entries as empty. This is done with 
// <code>firstEmpty</code> pointing to the first valid index (1 as 0 is 	TokenNameCOMMENT_LINE	<code>firstEmpty</code> pointing to the first valid index (1 as 0 is 
// used as 'Ground'). 	TokenNameCOMMENT_LINE	used as 'Ground'). 
firstEmpty	TokenNameIdentifier	 first Empty
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// And setting all the <code>next[i]</code> to point at 	TokenNameCOMMENT_LINE	And setting all the <code>next[i]</code> to point at 
// <code>i+1</code>. 	TokenNameCOMMENT_LINE	<code>i+1</code>. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Surly, the last one should point to the 'Ground'. 	TokenNameCOMMENT_LINE	Surly, the last one should point to the 'Ground'. 
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if a given key exists in the map. * * @param key * that is checked against the map data. * @return true if the key exists in the map. false otherwise. */	TokenNameCOMMENT_JAVADOC	 Checks if a given key exists in the map. * @param key that is checked against the map data. @return true if the key exists in the map. false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the given object exists in the map.<br> * This method iterates over the collection, trying to find an equal object. * * @param o * object that is checked against the map data. * @return true if the object exists in the map (in .equals() meaning). * false otherwise. */	TokenNameCOMMENT_JAVADOC	 Checks if the given object exists in the map.<br> This method iterates over the collection, trying to find an equal object. * @param o object that is checked against the map data. @return true if the object exists in the map (in .equals() meaning). false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsValue	TokenNameIdentifier	 contains Value
(	TokenNameLPAREN	
float	TokenNamefloat	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
FloatIterator	TokenNameIdentifier	 Float Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the actual index of a given key. * * @param key * @return index of the key. zero if the key wasn't found. */	TokenNameCOMMENT_JAVADOC	 Find the actual index of a given key. * @param key @return index of the key. zero if the key wasn't found. 
protected	TokenNameprotected	
int	TokenNameint	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Calculate the hash entry. 	TokenNameCOMMENT_LINE	Calculate the hash entry. 
int	TokenNameint	
baseHashIndex	TokenNameIdentifier	 base Hash Index
=	TokenNameEQUAL	
calcBaseHashIndex	TokenNameIdentifier	 calc Base Hash Index
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Start from the hash entry. 	TokenNameCOMMENT_LINE	Start from the hash entry. 
int	TokenNameint	
localIndex	TokenNameIdentifier	 local Index
=	TokenNameEQUAL	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
baseHashIndex	TokenNameIdentifier	 base Hash Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// while the index does not point to the 'Ground' 	TokenNameCOMMENT_LINE	while the index does not point to the 'Ground' 
while	TokenNamewhile	
(	TokenNameLPAREN	
localIndex	TokenNameIdentifier	 local Index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// returns the index found in case of of a matching key. 	TokenNameCOMMENT_LINE	returns the index found in case of of a matching key. 
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
localIndex	TokenNameIdentifier	 local Index
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
localIndex	TokenNameIdentifier	 local Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// next the local index 	TokenNameCOMMENT_LINE	next the local index 
localIndex	TokenNameIdentifier	 local Index
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
localIndex	TokenNameIdentifier	 local Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we got this far, it could only mean we did not find the key we 	TokenNameCOMMENT_LINE	If we got this far, it could only mean we did not find the key we 
// were asked for. return 'Ground' index. 	TokenNameCOMMENT_LINE	were asked for. return 'Ground' index. 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the actual index of a given key with it's baseHashIndex.<br> * Some methods use the baseHashIndex. If those call {@link #find()} there's * no need to re-calculate that hash. * * @param key * @param baseHashIndex * @return the index of the given key, or 0 as 'Ground' if the key wasn't * found. */	TokenNameCOMMENT_JAVADOC	 Find the actual index of a given key with it's baseHashIndex.<br> Some methods use the baseHashIndex. If those call {@link #find()} there's no need to re-calculate that hash. * @param key @param baseHashIndex @return the index of the given key, or 0 as 'Ground' if the key wasn't found. 
private	TokenNameprivate	
int	TokenNameint	
findForRemove	TokenNameIdentifier	 find For Remove
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
baseHashIndex	TokenNameIdentifier	 base Hash Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Start from the hash entry. 	TokenNameCOMMENT_LINE	Start from the hash entry. 
this	TokenNamethis	
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
baseHashIndex	TokenNameIdentifier	 base Hash Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// while the index does not point to the 'Ground' 	TokenNameCOMMENT_LINE	while the index does not point to the 'Ground' 
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// returns the index found in case of of a matching key. 	TokenNameCOMMENT_LINE	returns the index found in case of of a matching key. 
if	TokenNameif	
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// next the local index 	TokenNameCOMMENT_LINE	next the local index 
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If we got this far, it could only mean we did not find the key we 	TokenNameCOMMENT_LINE	If we got this far, it could only mean we did not find the key we 
// were asked for. return 'Ground' index. 	TokenNameCOMMENT_LINE	were asked for. return 'Ground' index. 
this	TokenNamethis	
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the float mapped with the given key. * * @param key * object who's mapped float we're interested in. * @return a float mapped by the given key. Float.NaN if the key wasn't found. */	TokenNameCOMMENT_JAVADOC	 Returns the float mapped with the given key. * @param key object who's mapped float we're interested in. @return a float mapped by the given key. Float.NaN if the key wasn't found. 
public	TokenNamepublic	
float	TokenNamefloat	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Grows the map. Allocates a new map of double the capacity, and * fast-insert the old key-value pairs. */	TokenNameCOMMENT_JAVADOC	 Grows the map. Allocates a new map of double the capacity, and fast-insert the old key-value pairs. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
protected	TokenNameprotected	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ObjectToFloatMap	TokenNameIdentifier	 Object To Float Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectToFloatMap	TokenNameIdentifier	 Object To Float Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Iterates fast over the collection. Any valid pair is put into the new 	TokenNameCOMMENT_LINE	Iterates fast over the collection. Any valid pair is put into the new 
// map without checking for duplicates or if there's enough space for 	TokenNameCOMMENT_LINE	map without checking for duplicates or if there's enough space for 
// it. 	TokenNameCOMMENT_LINE	it. 
for	TokenNamefor	
(	TokenNameLPAREN	
IndexIterator	TokenNameIdentifier	 Index Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
new	TokenNamenew	
IndexIterator	TokenNameIdentifier	 Index Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
prvt_put	TokenNameIdentifier	 prvt put
(	TokenNameLPAREN	
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Copy that's data into this. 	TokenNameCOMMENT_LINE	Copy that's data into this. 
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
firstEmpty	TokenNameIdentifier	 first Empty
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
firstEmpty	TokenNameIdentifier	 first Empty
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
baseHash	TokenNameIdentifier	 base Hash
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
baseHash	TokenNameIdentifier	 base Hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hashFactor	TokenNameIdentifier	 hash Factor
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
hashFactor	TokenNameIdentifier	 hash Factor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * * @return true if the map is empty. false otherwise. */	TokenNameCOMMENT_JAVADOC	 * @return true if the map is empty. false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a new iterator for the mapped floats. */	TokenNameCOMMENT_JAVADOC	 Returns a new iterator for the mapped floats. 
public	TokenNamepublic	
FloatIterator	TokenNameIdentifier	 Float Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ValueIterator	TokenNameIdentifier	 Value Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an iterator on the map keys. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator on the map keys. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keyIterator	TokenNameIdentifier	 key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
KeyIterator	TokenNameIdentifier	 Key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Prints the baseHash array, used for debug purposes. */	TokenNameCOMMENT_JAVADOC	 Prints the baseHash array, used for debug purposes. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unused"	TokenNameStringLiteral	unused
)	TokenNameRPAREN	
private	TokenNameprivate	
void	TokenNamevoid	
printBaseHash	TokenNameIdentifier	 print Base Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
baseHash	TokenNameIdentifier	 base Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
+	TokenNamePLUS	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Inserts the &lt;key,value&gt; pair into the map. If the key already exists, * this method updates the mapped value to the given one, returning the old * mapped value. * * @return the old mapped value, or {@link Float#NaN} if the key didn't exist. */	TokenNameCOMMENT_JAVADOC	 Inserts the &lt;key,value&gt; pair into the map. If the key already exists, this method updates the mapped value to the given one, returning the old mapped value. * @return the old mapped value, or {@link Float#NaN} if the key didn't exist. 
public	TokenNamepublic	
float	TokenNamefloat	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
float	TokenNamefloat	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Does key exists? 	TokenNameCOMMENT_LINE	Does key exists? 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Yes! 	TokenNameCOMMENT_LINE	Yes! 
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set new data and exit. 	TokenNameCOMMENT_LINE	Set new data and exit. 
float	TokenNamefloat	
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
return	TokenNamereturn	
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Is there enough room for a new pair? 	TokenNameCOMMENT_LINE	Is there enough room for a new pair? 
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No? Than grow up! 	TokenNameCOMMENT_LINE	No? Than grow up! 
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now that everything is set, the pair can be just put inside with no 	TokenNameCOMMENT_LINE	Now that everything is set, the pair can be just put inside with no 
// worries. 	TokenNameCOMMENT_LINE	worries. 
prvt_put	TokenNameIdentifier	 prvt put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a &lt;key,value&gt; pair from the map and returns the mapped value, * or {@link Float#NaN} if the none existed. * * @param key used to find the value to remove * @return the removed value or {@link Float#NaN} if none existed. */	TokenNameCOMMENT_JAVADOC	 Removes a &lt;key,value&gt; pair from the map and returns the mapped value, or {@link Float#NaN} if the none existed. * @param key used to find the value to remove @return the removed value or {@link Float#NaN} if none existed. 
public	TokenNamepublic	
float	TokenNamefloat	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
baseHashIndex	TokenNameIdentifier	 base Hash Index
=	TokenNameEQUAL	
calcBaseHashIndex	TokenNameIdentifier	 calc Base Hash Index
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
findForRemove	TokenNameIdentifier	 find For Remove
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
baseHashIndex	TokenNameIdentifier	 base Hash Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If it is the first in the collision list, we should promote its 	TokenNameCOMMENT_LINE	If it is the first in the collision list, we should promote its 
// next colliding element. 	TokenNameCOMMENT_LINE	next colliding element. 
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
baseHashIndex	TokenNameIdentifier	 base Hash Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
prev	TokenNameIdentifier	 prev
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
firstEmpty	TokenNameIdentifier	 first Empty
;	TokenNameSEMICOLON	
firstEmpty	TokenNameIdentifier	 first Empty
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return number of pairs currently in the map */	TokenNameCOMMENT_JAVADOC	 @return number of pairs currently in the map 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Translates the mapped pairs' values into an array of Objects * * @return an object array of all the values currently in the map. */	TokenNameCOMMENT_JAVADOC	 Translates the mapped pairs' values into an array of Objects * @return an object array of all the values currently in the map. 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Iterates over the values, adding them to the array. 	TokenNameCOMMENT_LINE	Iterates over the values, adding them to the array. 
for	TokenNamefor	
(	TokenNameLPAREN	
FloatIterator	TokenNameIdentifier	 Float Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
array	TokenNameIdentifier	 array
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
array	TokenNameIdentifier	 array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Translates the mapped pairs' values into an array of T * * @param a * the array into which the elements of the list are to be * stored, if it is big enough; otherwise, use as much space as it can. * * @return an array containing the elements of the list * */	TokenNameCOMMENT_JAVADOC	 Translates the mapped pairs' values into an array of T * @param a the array into which the elements of the list are to be stored, if it is big enough; otherwise, use as much space as it can. * @return an array containing the elements of the list 
public	TokenNamepublic	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Iterates over the values, adding them to the array. 	TokenNameCOMMENT_LINE	Iterates over the values, adding them to the array. 
for	TokenNamefor	
(	TokenNameLPAREN	
FloatIterator	TokenNameIdentifier	 Float Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
NaN	TokenNameIdentifier	 Na N
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
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
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'{'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
keyIterator	TokenNameIdentifier	 key Iterator
=	TokenNameEQUAL	
keyIterator	TokenNameIdentifier	 key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
keyIterator	TokenNameIdentifier	 key Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
keyIterator	TokenNameIdentifier	 key Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
keyIterator	TokenNameIdentifier	 key Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'}'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
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
ObjectToFloatMap	TokenNameIdentifier	 Object To Float Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectToFloatMap	TokenNameIdentifier	 Object To Float Map
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
K	TokenNameIdentifier	 K
>	TokenNameGREATER	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
keyIterator	TokenNameIdentifier	 key Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
K	TokenNameIdentifier	 K
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
that	TokenNameIdentifier	 that
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
