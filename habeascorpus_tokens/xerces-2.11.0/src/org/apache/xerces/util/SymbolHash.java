/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * This class is an unsynchronized hash table primary used for String * to Object mapping. * <p> * The hash code uses the same algorithm as SymbolTable class. * * @author Elena Litani * @version $Id: SymbolHash.java 819653 2009-09-28 17:29:56Z knoaman $ */	TokenNameCOMMENT_JAVADOC	 This class is an unsynchronized hash table primary used for String to Object mapping. <p> The hash code uses the same algorithm as SymbolTable class. * @author Elena Litani @version $Id: SymbolHash.java 819653 2009-09-28 17:29:56Z knoaman $ 
public	TokenNamepublic	
class	TokenNameclass	
SymbolHash	TokenNameIdentifier	 Symbol Hash
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default table size. */	TokenNameCOMMENT_JAVADOC	 Default table size. 
protected	TokenNameprotected	
int	TokenNameint	
fTableSize	TokenNameIdentifier	 f Table Size
=	TokenNameEQUAL	
101	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Buckets. */	TokenNameCOMMENT_JAVADOC	 Buckets. 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fBuckets	TokenNameIdentifier	 f Buckets
;	TokenNameSEMICOLON	
/** Number of elements. */	TokenNameCOMMENT_JAVADOC	 Number of elements. 
protected	TokenNameprotected	
int	TokenNameint	
fNum	TokenNameIdentifier	 f Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Constructs a key table with the default size. */	TokenNameCOMMENT_JAVADOC	 Constructs a key table with the default size. 
public	TokenNamepublic	
SymbolHash	TokenNameIdentifier	 Symbol Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuckets	TokenNameIdentifier	 f Buckets
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
fTableSize	TokenNameIdentifier	 f Table Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a key table with a given size. * * @param size the size of the key table. */	TokenNameCOMMENT_JAVADOC	 Constructs a key table with a given size. * @param size the size of the key table. 
public	TokenNamepublic	
SymbolHash	TokenNameIdentifier	 Symbol Hash
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fTableSize	TokenNameIdentifier	 f Table Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
fBuckets	TokenNameIdentifier	 f Buckets
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
fTableSize	TokenNameIdentifier	 f Table Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds the key/value mapping to the key table. If the key already exists, * the previous value associated with this key is overwritten by the new * value. * * @param key * @param value */	TokenNameCOMMENT_JAVADOC	 Adds the key/value mapping to the key table. If the key already exists, the previous value associated with this key is overwritten by the new value. * @param key @param value 
public	TokenNamepublic	
void	TokenNamevoid	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// replace old value 	TokenNameCOMMENT_LINE	replace old value 
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// create new entry 	TokenNameCOMMENT_LINE	create new entry 
else	TokenNameelse	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
fNum	TokenNameIdentifier	 f Num
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the value associated with the given key. * * @param key * @return the value associated with the given key. */	TokenNameCOMMENT_JAVADOC	 Get the value associated with the given key. * @param key @return the value associated with the given key. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the number of key/value pairs stored in this table. * * @return the number of key/value pairs stored in this table. */	TokenNameCOMMENT_JAVADOC	 Get the number of key/value pairs stored in this table. * @return the number of key/value pairs stored in this table. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNum	TokenNameIdentifier	 f Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add all values to the given array. The array must have enough entry. * * @param elements the array to store the elements * @param from where to start store element in the array * @return number of elements copied to the array */	TokenNameCOMMENT_JAVADOC	 Add all values to the given array. The array must have enough entry. * @param elements the array to store the elements @param from where to start store element in the array @return number of elements copied to the array 
public	TokenNamepublic	
int	TokenNameint	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
elements	TokenNameIdentifier	 elements
,	TokenNameCOMMA	
int	TokenNameint	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fTableSize	TokenNameIdentifier	 f Table Size
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
fNum	TokenNameIdentifier	 f Num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
elements	TokenNameIdentifier	 elements
[	TokenNameLBRACKET	
from	TokenNameIdentifier	 from
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
fNum	TokenNameIdentifier	 f Num
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return key/value pairs of all entries in the map */	TokenNameCOMMENT_JAVADOC	 Return key/value pairs of all entries in the map 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getEntries	TokenNameIdentifier	 get Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
fNum	TokenNameIdentifier	 f Num
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fTableSize	TokenNameIdentifier	 f Table Size
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
fNum	TokenNameIdentifier	 f Num
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Make a clone of this object. */	TokenNameCOMMENT_JAVADOC	 Make a clone of this object. 
public	TokenNamepublic	
SymbolHash	TokenNameIdentifier	 Symbol Hash
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SymbolHash	TokenNameIdentifier	 Symbol Hash
newTable	TokenNameIdentifier	 new Table
=	TokenNameEQUAL	
new	TokenNamenew	
SymbolHash	TokenNameIdentifier	 Symbol Hash
(	TokenNameLPAREN	
fTableSize	TokenNameIdentifier	 f Table Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newTable	TokenNameIdentifier	 new Table
.	TokenNameDOT	
fNum	TokenNameIdentifier	 f Num
=	TokenNameEQUAL	
fNum	TokenNameIdentifier	 f Num
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
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
newTable	TokenNameIdentifier	 new Table
.	TokenNameDOT	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
newTable	TokenNameIdentifier	 new Table
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove all key/value assocaition. This tries to save a bit of GC'ing * by at least keeping the fBuckets array around. */	TokenNameCOMMENT_JAVADOC	 Remove all key/value assocaition. This tries to save a bit of GC'ing by at least keeping the fBuckets array around. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
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
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fNum	TokenNameIdentifier	 f Num
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// clear(): void 	TokenNameCOMMENT_LINE	clear(): void 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
search	TokenNameIdentifier	 search
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for identical key 	TokenNameCOMMENT_LINE	search for identical key 
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * This class is a key table entry. Each entry acts as a node * in a linked list. */	TokenNameCOMMENT_JAVADOC	 This class is a key table entry. Each entry acts as a node in a linked list. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
// key/value 	TokenNameCOMMENT_LINE	key/value 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** The next entry. */	TokenNameCOMMENT_JAVADOC	 The next entry. 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
makeClone	TokenNameIdentifier	 make Clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// entry 	TokenNameCOMMENT_LINE	entry 
}	TokenNameRBRACE	
// class SymbolHash 	TokenNameCOMMENT_LINE	class SymbolHash 
