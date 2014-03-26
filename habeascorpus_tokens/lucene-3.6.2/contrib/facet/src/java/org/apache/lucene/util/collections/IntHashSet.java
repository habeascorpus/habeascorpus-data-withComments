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
/** * A Set or primitive int. Implemented as a HashMap of int->int. * * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A Set or primitive int. Implemented as a HashMap of int->int. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
IntHashSet	TokenNameIdentifier	 Int Hash Set
{	TokenNameLBRACE	
// TODO (Facet): This is wasteful as the "values" are actually the "keys" and 	TokenNameCOMMENT_LINE	TODO (Facet): This is wasteful as the "values" are actually the "keys" and 
// we could spare this amount of space (capacity * sizeof(int)). Perhaps even 	TokenNameCOMMENT_LINE	we could spare this amount of space (capacity * sizeof(int)). Perhaps even 
// though it is not OOP, we should re-implement the hash for just that cause. 	TokenNameCOMMENT_LINE	though it is not OOP, we should re-implement the hash for just that cause. 
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
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IntHashSet	TokenNameIdentifier	 Int Hash Set
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
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
IntIterator	TokenNameIdentifier	 Int Iterator
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
public	TokenNamepublic	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
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
int	TokenNameint	
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
/** * Constructs a map with default capacity. */	TokenNameCOMMENT_JAVADOC	 Constructs a map with default capacity. 
public	TokenNamepublic	
IntHashSet	TokenNameIdentifier	 Int Hash Set
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
IntHashSet	TokenNameIdentifier	 Int Hash Set
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
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
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
/** * Adds a pair to the map. Takes the first empty position from the * empty-linked-list's head - {@link firstEmpty}. * * New pairs are always inserted to baseHash, and are followed by the old * colliding pair. * * @param key * integer which maps the given value * @param e * value which is being mapped using the given key */	TokenNameCOMMENT_JAVADOC	 Adds a pair to the map. Takes the first empty position from the empty-linked-list's head - {@link firstEmpty}. * New pairs are always inserted to baseHash, and are followed by the old colliding pair. * @param key integer which maps the given value @param e value which is being mapped using the given key 
private	TokenNameprivate	
void	TokenNamevoid	
prvt_add	TokenNameIdentifier	 prvt add
(	TokenNameLPAREN	
int	TokenNameint	
key	TokenNameIdentifier	 key
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
/** * Calculating the baseHash index using the internal <code>hashFactor</code> * . * * @param key */	TokenNameCOMMENT_JAVADOC	 Calculating the baseHash index using the internal <code>hashFactor</code> . * @param key 
protected	TokenNameprotected	
int	TokenNameint	
calcBaseHashIndex	TokenNameIdentifier	 calc Base Hash Index
(	TokenNameLPAREN	
int	TokenNameint	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
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
/** * Checks if a given key exists in the map. * * @param value * that is checked against the map data. * @return true if the key exists in the map. false otherwise. */	TokenNameCOMMENT_JAVADOC	 Checks if a given key exists in the map. * @param value that is checked against the map data. @return true if the key exists in the map. false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the actual index of a given key. * * @param key * @return index of the key. zero if the key wasn't found. */	TokenNameCOMMENT_JAVADOC	 Find the actual index of a given key. * @param key @return index of the key. zero if the key wasn't found. 
protected	TokenNameprotected	
int	TokenNameint	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
int	TokenNameint	
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
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
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
int	TokenNameint	
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
==	TokenNameEQUAL_EQUAL	
key	TokenNameIdentifier	 key
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
/** * Grows the map. Allocates a new map of double the capacity, and * fast-insert the old key-value pairs. */	TokenNameCOMMENT_JAVADOC	 Grows the map. Allocates a new map of double the capacity, and fast-insert the old key-value pairs. 
protected	TokenNameprotected	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IntHashSet	TokenNameIdentifier	 Int Hash Set
that	TokenNameIdentifier	 that
=	TokenNameEQUAL	
new	TokenNamenew	
IntHashSet	TokenNameIdentifier	 Int Hash Set
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
prvt_add	TokenNameIdentifier	 prvt add
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// for (int i = capacity; i > 0; --i) { 	TokenNameCOMMENT_LINE	for (int i = capacity; i > 0; --i) { 
// 	TokenNameCOMMENT_LINE	 
// that._add(this.keys[i]); 	TokenNameCOMMENT_LINE	that._add(this.keys[i]); 
// 	TokenNameCOMMENT_LINE	 
// } 	TokenNameCOMMENT_LINE	} 
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
/** * Returns a new iterator for the mapped objects. */	TokenNameCOMMENT_JAVADOC	 Returns a new iterator for the mapped objects. 
public	TokenNamepublic	
IntIterator	TokenNameIdentifier	 Int Iterator
iterator	TokenNameIdentifier	 iterator
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
public	TokenNamepublic	
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
if	TokenNameif	
(	TokenNameLPAREN	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
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
}	TokenNameRBRACE	
/** * Add a mapping int key -> int value. * <p> * If the key was already inside just * updating the value it refers to as the given object. * <p> * Otherwise if the map is full, first {@link #grow()} the map. * * @param value * integer which maps the given value * @return true always. */	TokenNameCOMMENT_JAVADOC	 Add a mapping int key -> int value. <p> If the key was already inside just updating the value it refers to as the given object. <p> Otherwise if the map is full, first {@link #grow()} the map. * @param value integer which maps the given value @return true always. 
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Does key exists? 	TokenNameCOMMENT_LINE	Does key exists? 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
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
return	TokenNamereturn	
true	TokenNametrue	
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
prvt_add	TokenNameIdentifier	 prvt add
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove a pair from the map, specified by it's key. * * @param value * specify the value to be removed * * @return true if the map was changed (the key was found and removed). * false otherwise. */	TokenNameCOMMENT_JAVADOC	 Remove a pair from the map, specified by it's key. * @param value specify the value to be removed * @return true if the map was changed (the key was found and removed). false otherwise. 
public	TokenNamepublic	
boolean	TokenNameboolean	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
baseHashIndex	TokenNameIdentifier	 base Hash Index
=	TokenNameEQUAL	
calcBaseHashIndex	TokenNameIdentifier	 calc Base Hash Index
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
findForRemove	TokenNameIdentifier	 find For Remove
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
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
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
int	TokenNameint	
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Iterates over the values, adding them to the array. 	TokenNameCOMMENT_LINE	Iterates over the values, adding them to the array. 
for	TokenNamefor	
(	TokenNameLPAREN	
IntIterator	TokenNameIdentifier	 Int Iterator
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
/** * Translates the mapped pairs' values into an array of ints * * @param a * the array into which the elements of the map are to be stored, * if it is big enough; otherwise, a new array of the same * runtime type is allocated for this purpose. * * @return an array containing the values stored in the map * */	TokenNameCOMMENT_JAVADOC	 Translates the mapped pairs' values into an array of ints * @param a the array into which the elements of the map are to be stored, if it is big enough; otherwise, a new array of the same runtime type is allocated for this purpose. * @return an array containing the values stored in the map 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
int	TokenNameint	
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
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Iterates over the values, adding them to the array. 	TokenNameCOMMENT_LINE	Iterates over the values, adding them to the array. 
for	TokenNamefor	
(	TokenNameLPAREN	
IntIterator	TokenNameIdentifier	 Int Iterator
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
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * I have no idea why would anyone call it - but for debug purposes.<br> * Prints the entire map, including the index, key, object, next and prev. */	TokenNameCOMMENT_JAVADOC	 I have no idea why would anyone call it - but for debug purposes.<br> Prints the entire map, including the index, key, object, next and prev. 
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
IntIterator	TokenNameIdentifier	 Int Iterator
iterator	TokenNameIdentifier	 iterator
=	TokenNameEQUAL	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
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
iterator	TokenNameIdentifier	 iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iterator	TokenNameIdentifier	 iterator
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
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toHashString	TokenNameIdentifier	 to Hash String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
string	TokenNameIdentifier	 string
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
StringBuffer	TokenNameIdentifier	 String Buffer
sb2	TokenNameIdentifier	 sb2
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
shouldAppend	TokenNameIdentifier	 should Append
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
sb2	TokenNameIdentifier	 sb2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
". "	TokenNameStringLiteral	. 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
baseHash	TokenNameIdentifier	 base Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb2	TokenNameIdentifier	 sb2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
keys	TokenNameIdentifier	 keys
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
+	TokenNamePLUS	
"@"	TokenNameStringLiteral	@
+	TokenNamePLUS	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
shouldAppend	TokenNameIdentifier	 should Append
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
shouldAppend	TokenNameIdentifier	 should Append
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sb2	TokenNameIdentifier	 sb2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
string	TokenNameIdentifier	 string
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
