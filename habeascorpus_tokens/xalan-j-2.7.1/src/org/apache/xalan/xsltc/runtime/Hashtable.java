/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Hashtable.java 468652 2006-10-28 07:05:17Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Hashtable.java 468652 2006-10-28 07:05:17Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
xsltc	TokenNameIdentifier	 xsltc
.	TokenNameDOT	
runtime	TokenNameIdentifier	 runtime
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
/** * IMPORTANT NOTE: * This code was taken from Sun's Java1.1 JDK java.util.HashTable.java * All "synchronized" keywords and some methods we do not need have been * all been removed. */	TokenNameCOMMENT_JAVADOC	 IMPORTANT NOTE: This code was taken from Sun's Java1.1 JDK java.util.HashTable.java All "synchronized" keywords and some methods we do not need have been all been removed. 
/** * Object that wraps entries in the hash-table * @author Morten Jorgensen */	TokenNameCOMMENT_JAVADOC	 Object that wraps entries in the hash-table @author Morten Jorgensen 
class	TokenNameclass	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
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
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
)	TokenNameRPAREN	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The main hash-table implementation */	TokenNameCOMMENT_JAVADOC	 The main hash-table implementation 
public	TokenNamepublic	
class	TokenNameclass	
Hashtable	TokenNameIdentifier	 Hashtable
{	TokenNameLBRACE	
private	TokenNameprivate	
transient	TokenNametransient	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// hash-table entries 	TokenNameCOMMENT_LINE	hash-table entries 
private	TokenNameprivate	
transient	TokenNametransient	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
// number of entries 	TokenNameCOMMENT_LINE	number of entries 
private	TokenNameprivate	
int	TokenNameint	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
// current size of hash-tabke 	TokenNameCOMMENT_LINE	current size of hash-tabke 
private	TokenNameprivate	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
// load factor 	TokenNameCOMMENT_LINE	load factor 
/** * Constructs a new, empty hashtable with the specified initial * capacity and the specified load factor. */	TokenNameCOMMENT_JAVADOC	 Constructs a new, empty hashtable with the specified initial capacity and the specified load factor. 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
loadFactor	TokenNameIdentifier	 load Factor
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
loadFactor	TokenNameIdentifier	 load Factor
=	TokenNameEQUAL	
0.75f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
=	TokenNameEQUAL	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
[	TokenNameLBRACKET	
initialCapacity	TokenNameIdentifier	 initial Capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
*	TokenNameMULTIPLY	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new, empty hashtable with the specified initial capacity * and default load factor. */	TokenNameCOMMENT_JAVADOC	 Constructs a new, empty hashtable with the specified initial capacity and default load factor. 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
0.75f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new, empty hashtable with a default capacity and load * factor. */	TokenNameCOMMENT_JAVADOC	 Constructs a new, empty hashtable with a default capacity and load factor. 
public	TokenNamepublic	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
101	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.75f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of keys in this hashtable. */	TokenNameCOMMENT_JAVADOC	 Returns the number of keys in this hashtable. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if this hashtable maps no keys to values. */	TokenNameCOMMENT_JAVADOC	 Tests if this hashtable maps no keys to values. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an enumeration of the keys in this hashtable. */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the keys in this hashtable. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
HashtableEnumerator	TokenNameIdentifier	 Hashtable Enumerator
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an enumeration of the values in this hashtable. * Use the Enumeration methods on the returned object to fetch the elements * sequentially. */	TokenNameCOMMENT_JAVADOC	 Returns an enumeration of the values in this hashtable. Use the Enumeration methods on the returned object to fetch the elements sequentially. 
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
HashtableEnumerator	TokenNameIdentifier	 Hashtable Enumerator
(	TokenNameLPAREN	
table	TokenNameIdentifier	 table
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if some key maps into the specified value in this hashtable. * This operation is more expensive than the <code>containsKey</code> * method. */	TokenNameCOMMENT_JAVADOC	 Tests if some key maps into the specified value in this hashtable. This operation is more expensive than the <code>containsKey</code> method. 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
tab	TokenNameIdentifier	 tab
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests if the specified object is a key in this hashtable. */	TokenNameCOMMENT_JAVADOC	 Tests if the specified object is a key in this hashtable. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
tab	TokenNameIdentifier	 tab
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the value to which the specified key is mapped in this hashtable. */	TokenNameCOMMENT_JAVADOC	 Returns the value to which the specified key is mapped in this hashtable. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
tab	TokenNameIdentifier	 tab
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Rehashes the contents of the hashtable into a hashtable with a * larger capacity. This method is called automatically when the * number of keys in the hashtable exceeds this hashtable's capacity * and load factor. */	TokenNameCOMMENT_JAVADOC	 Rehashes the contents of the hashtable into a hashtable with a larger capacity. This method is called automatically when the number of keys in the hashtable exceeds this hashtable's capacity and load factor. 
protected	TokenNameprotected	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
int	TokenNameint	
oldCapacity	TokenNameIdentifier	 old Capacity
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
oldTable	TokenNameIdentifier	 old Table
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
int	TokenNameint	
newCapacity	TokenNameIdentifier	 new Capacity
=	TokenNameEQUAL	
oldCapacity	TokenNameIdentifier	 old Capacity
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
newTable	TokenNameIdentifier	 new Table
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
[	TokenNameLBRACKET	
newCapacity	TokenNameIdentifier	 new Capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
newCapacity	TokenNameIdentifier	 new Capacity
*	TokenNameMULTIPLY	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
newTable	TokenNameIdentifier	 new Table
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
oldCapacity	TokenNameIdentifier	 old Capacity
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
oldTable	TokenNameIdentifier	 old Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
old	TokenNameIdentifier	 old
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
newCapacity	TokenNameIdentifier	 new Capacity
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
newTable	TokenNameIdentifier	 new Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
newTable	TokenNameIdentifier	 new Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Maps the specified <code>key</code> to the specified * <code>value</code> in this hashtable. Neither the key nor the * value can be <code>null</code>. * <p> * The value can be retrieved by calling the <code>get</code> method * with a key that is equal to the original key. */	TokenNameCOMMENT_JAVADOC	 Maps the specified <code>key</code> to the specified <code>value</code> in this hashtable. Neither the key nor the value can be <code>null</code>. <p> The value can be retrieved by calling the <code>get</code> method with a key that is equal to the original key. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make sure the value is not null 	TokenNameCOMMENT_LINE	Make sure the value is not null 
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NullPointerException	TokenNameIdentifier	 Null Pointer Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Makes sure the key is not already in the hashtable. 	TokenNameCOMMENT_LINE	Makes sure the key is not already in the hashtable. 
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
tab	TokenNameIdentifier	 tab
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
return	TokenNamereturn	
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Rehash the table if the threshold is exceeded 	TokenNameCOMMENT_LINE	Rehash the table if the threshold is exceeded 
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
>=	TokenNameGREATER_EQUAL	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Creates the new entry. 	TokenNameCOMMENT_LINE	Creates the new entry. 
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the key (and its corresponding value) from this * hashtable. This method does nothing if the key is not in the hashtable. */	TokenNameCOMMENT_JAVADOC	 Removes the key (and its corresponding value) from this hashtable. This method does nothing if the key is not in the hashtable. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
tab	TokenNameIdentifier	 tab
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
else	TokenNameelse	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears this hashtable so that it contains no keys. */	TokenNameCOMMENT_JAVADOC	 Clears this hashtable so that it contains no keys. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
tab	TokenNameIdentifier	 tab
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
tab	TokenNameIdentifier	 tab
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a rather long string representation of this hashtable. * Handy for debugging - leave it here!!! */	TokenNameCOMMENT_JAVADOC	 Returns a rather long string representation of this hashtable. Handy for debugging - leave it here!!! 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"}"	TokenNameStringLiteral	}
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A hashtable enumerator class. This class should remain opaque * to the client. It will use the Enumeration interface. */	TokenNameCOMMENT_JAVADOC	 A hashtable enumerator class. This class should remain opaque to the client. It will use the Enumeration interface. 
class	TokenNameclass	
HashtableEnumerator	TokenNameIdentifier	 Hashtable Enumerator
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
boolean	TokenNameboolean	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
HashtableEnumerator	TokenNameIdentifier	 Hashtable Enumerator
(	TokenNameLPAREN	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
boolean	TokenNameboolean	
keys	TokenNameIdentifier	 keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
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
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
HashtableEntry	TokenNameIdentifier	 Hashtable Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
return	TokenNamereturn	
keys	TokenNameIdentifier	 keys
?	TokenNameQUESTION	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key	TokenNameIdentifier	 key
:	TokenNameCOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
