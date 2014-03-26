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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
SoftReference	TokenNameIdentifier	 Soft Reference
;	TokenNameSEMICOLON	
/** * This symbol table uses SoftReferences to its String entries, which means that table entries * that have no references to them can be garbage collected when memory is needed. Thus, in * documents with very very large numbers of unique strings, using this SymbolTable will prevent * an out of memory error from occuring. * * @see SymbolTable * * @author Peter McCracken, IBM * * @version $Id: SoftReferenceSymbolTable.java 924298 2010-03-17 13:57:20Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This symbol table uses SoftReferences to its String entries, which means that table entries that have no references to them can be garbage collected when memory is needed. Thus, in documents with very very large numbers of unique strings, using this SymbolTable will prevent an out of memory error from occuring. * @see SymbolTable * @author Peter McCracken, IBM * @version $Id: SoftReferenceSymbolTable.java 924298 2010-03-17 13:57:20Z mrglavas $ 
/* * This class extends SymbolTable. Logically, it would make more sense if it and SymbolTable * shared a common interface, because despite almost identical logic, SoftReferenceSymbolTable * shares almost no code with SymbolTable (because of necessary checks for null table entries * in the code). I've chosen to avoid making the interface because we don't want to slow down * the vastly more common case of using the regular SymbolTable. We also don't want to change * SymbolTable, since it's a public class that's probably commonly in use by many applications. * -PJM */	TokenNameCOMMENT_BLOCK	 This class extends SymbolTable. Logically, it would make more sense if it and SymbolTable shared a common interface, because despite almost identical logic, SoftReferenceSymbolTable shares almost no code with SymbolTable (because of necessary checks for null table entries in the code). I've chosen to avoid making the interface because we don't want to slow down the vastly more common case of using the regular SymbolTable. We also don't want to change SymbolTable, since it's a public class that's probably commonly in use by many applications. -PJM 
public	TokenNamepublic	
class	TokenNameclass	
SoftReferenceSymbolTable	TokenNameIdentifier	 Soft Reference Symbol Table
extends	TokenNameextends	
SymbolTable	TokenNameIdentifier	 Symbol Table
{	TokenNameLBRACE	
/* * This variable masks the fBuckets variable used by SymbolTable. */	TokenNameCOMMENT_BLOCK	 This variable masks the fBuckets variable used by SymbolTable. 
protected	TokenNameprotected	
SREntry	TokenNameIdentifier	 SR Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fBuckets	TokenNameIdentifier	 f Buckets
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a new, empty SymbolTable with the specified initial * capacity and the specified load factor. * * @param initialCapacity the initial capacity of the SymbolTable. * @param loadFactor the load factor of the SymbolTable. * @throws IllegalArgumentException if the initial capacity is less * than zero, or if the load factor is nonpositive. */	TokenNameCOMMENT_JAVADOC	 Constructs a new, empty SymbolTable with the specified initial capacity and the specified load factor. * @param initialCapacity the initial capacity of the SymbolTable. @param loadFactor the load factor of the SymbolTable. @throws IllegalArgumentException if the initial capacity is less than zero, or if the load factor is nonpositive. 
public	TokenNamepublic	
SoftReferenceSymbolTable	TokenNameIdentifier	 Soft Reference Symbol Table
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* * Not calling super() because we don't want to initialize the Entry buckets * used by the base class. */	TokenNameCOMMENT_BLOCK	 Not calling super() because we don't want to initialize the Entry buckets used by the base class. 
if	TokenNameif	
(	TokenNameLPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal Capacity: "	TokenNameStringLiteral	Illegal Capacity: 
+	TokenNamePLUS	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
loadFactor	TokenNameIdentifier	 load Factor
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
isNaN	TokenNameIdentifier	 is Na N
(	TokenNameLPAREN	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Illegal Load: "	TokenNameStringLiteral	Illegal Load: 
+	TokenNamePLUS	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialCapacity	TokenNameIdentifier	 initial Capacity
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fLoadFactor	TokenNameIdentifier	 f Load Factor
=	TokenNameEQUAL	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
fTableSize	TokenNameIdentifier	 f Table Size
=	TokenNameEQUAL	
initialCapacity	TokenNameIdentifier	 initial Capacity
;	TokenNameSEMICOLON	
fBuckets	TokenNameIdentifier	 f Buckets
=	TokenNameEQUAL	
new	TokenNamenew	
SREntry	TokenNameIdentifier	 SR Entry
[	TokenNameLBRACKET	
fTableSize	TokenNameIdentifier	 f Table Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fThreshold	TokenNameIdentifier	 f Threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
fTableSize	TokenNameIdentifier	 f Table Size
*	TokenNameMULTIPLY	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCount	TokenNameIdentifier	 f Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
=	TokenNameEQUAL	
new	TokenNamenew	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new, empty SymbolTable with the specified initial capacity * and default load factor, which is <tt>0.75</tt>. * * @param initialCapacity the initial capacity of the hashtable. * @throws IllegalArgumentException if the initial capacity is less * than zero. */	TokenNameCOMMENT_JAVADOC	 Constructs a new, empty SymbolTable with the specified initial capacity and default load factor, which is <tt>0.75</tt>. * @param initialCapacity the initial capacity of the hashtable. @throws IllegalArgumentException if the initial capacity is less than zero. 
public	TokenNamepublic	
SoftReferenceSymbolTable	TokenNameIdentifier	 Soft Reference Symbol Table
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
/** * Constructs a new, empty SymbolTable with a default initial capacity (101) * and load factor, which is <tt>0.75</tt>. */	TokenNameCOMMENT_JAVADOC	 Constructs a new, empty SymbolTable with a default initial capacity (101) and load factor, which is <tt>0.75</tt>. 
public	TokenNamepublic	
SoftReferenceSymbolTable	TokenNameIdentifier	 Soft Reference Symbol Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
TABLE_SIZE	TokenNameIdentifier	 TABLE  SIZE
,	TokenNameCOMMA	
0.75f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Public methods 	TokenNameCOMMENT_LINE	Public methods 
// 	TokenNameCOMMENT_LINE	 
/** * Adds the specified symbol to the symbol table and returns a * reference to the unique symbol. If the symbol already exists, * the previous symbol reference is returned instead, in order * guarantee that symbol references remain unique. * * @param symbol The new symbol. */	TokenNameCOMMENT_JAVADOC	 Adds the specified symbol to the symbol table and returns a reference to the unique symbol. If the symbol already exists, the previous symbol reference is returned instead, in order guarantee that symbol references remain unique. * @param symbol The new symbol. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search for identical symbol 	TokenNameCOMMENT_LINE	search for identical symbol 
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SREntry	TokenNameIdentifier	 SR Entry
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
SREntryData	TokenNameIdentifier	 SR Entry Data
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SREntryData	TokenNameIdentifier	 SR Entry Data
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCount	TokenNameIdentifier	 f Count
>=	TokenNameGREATER_EQUAL	
fThreshold	TokenNameIdentifier	 f Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Rehash the table if the threshold is exceeded 	TokenNameCOMMENT_LINE	Rehash the table if the threshold is exceeded 
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add new entry 	TokenNameCOMMENT_LINE	add new entry 
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SREntry	TokenNameIdentifier	 SR Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
SREntry	TokenNameIdentifier	 SR Entry
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
,	TokenNameCOMMA	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
,	TokenNameCOMMA	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
fCount	TokenNameIdentifier	 f Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addSymbol(String):String 	TokenNameCOMMENT_LINE	addSymbol(String):String 
/** * Adds the specified symbol to the symbol table and returns a * reference to the unique symbol. If the symbol already exists, * the previous symbol reference is returned instead, in order * guarantee that symbol references remain unique. * * @param buffer The buffer containing the new symbol. * @param offset The offset into the buffer of the new symbol. * @param length The length of the new symbol in the buffer. */	TokenNameCOMMENT_JAVADOC	 Adds the specified symbol to the symbol table and returns a reference to the unique symbol. If the symbol already exists, the previous symbol reference is returned instead, in order guarantee that symbol references remain unique. * @param buffer The buffer containing the new symbol. @param offset The offset into the buffer of the new symbol. @param length The length of the new symbol in the buffer. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// search for identical symbol 	TokenNameCOMMENT_LINE	search for identical symbol 
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
OUTER	TokenNameIdentifier	 OUTER
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SREntry	TokenNameIdentifier	 SR Entry
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
SREntryData	TokenNameIdentifier	 SR Entry Data
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SREntryData	TokenNameIdentifier	 SR Entry Data
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
OUTER	TokenNameIdentifier	 OUTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCount	TokenNameIdentifier	 f Count
>=	TokenNameGREATER_EQUAL	
fThreshold	TokenNameIdentifier	 f Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Rehash the table if the threshold is exceeded 	TokenNameCOMMENT_LINE	Rehash the table if the threshold is exceeded 
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add new entry 	TokenNameCOMMENT_LINE	add new entry 
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SREntry	TokenNameIdentifier	 SR Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
SREntry	TokenNameIdentifier	 SR Entry
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
,	TokenNameCOMMA	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
,	TokenNameCOMMA	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
fCount	TokenNameIdentifier	 f Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addSymbol(char[],int,int):String 	TokenNameCOMMENT_LINE	addSymbol(char[],int,int):String 
/** * Increases the capacity of and internally reorganizes this * SymbolTable, in order to accommodate and access its entries more * efficiently. This method is called automatically when the * number of keys in the SymbolTable exceeds this hashtable's capacity * and load factor. */	TokenNameCOMMENT_JAVADOC	 Increases the capacity of and internally reorganizes this SymbolTable, in order to accommodate and access its entries more efficiently. This method is called automatically when the number of keys in the SymbolTable exceeds this hashtable's capacity and load factor. 
protected	TokenNameprotected	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oldCapacity	TokenNameIdentifier	 old Capacity
=	TokenNameEQUAL	
fBuckets	TokenNameIdentifier	 f Buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
SREntry	TokenNameIdentifier	 SR Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldTable	TokenNameIdentifier	 old Table
=	TokenNameEQUAL	
fBuckets	TokenNameIdentifier	 f Buckets
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
SREntry	TokenNameIdentifier	 SR Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTable	TokenNameIdentifier	 new Table
=	TokenNameEQUAL	
new	TokenNamenew	
SREntry	TokenNameIdentifier	 SR Entry
[	TokenNameLBRACKET	
newCapacity	TokenNameIdentifier	 new Capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fThreshold	TokenNameIdentifier	 f Threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
newCapacity	TokenNameIdentifier	 new Capacity
*	TokenNameMULTIPLY	
fLoadFactor	TokenNameIdentifier	 f Load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fBuckets	TokenNameIdentifier	 f Buckets
=	TokenNameEQUAL	
newTable	TokenNameIdentifier	 new Table
;	TokenNameSEMICOLON	
fTableSize	TokenNameIdentifier	 f Table Size
=	TokenNameEQUAL	
fBuckets	TokenNameIdentifier	 f Buckets
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
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
SREntry	TokenNameIdentifier	 SR Entry
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
SREntry	TokenNameIdentifier	 SR Entry
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
SREntryData	TokenNameIdentifier	 SR Entry Data
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SREntryData	TokenNameIdentifier	 SR Entry Data
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
newCapacity	TokenNameIdentifier	 new Capacity
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newTable	TokenNameIdentifier	 new Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newTable	TokenNameIdentifier	 new Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
newTable	TokenNameIdentifier	 new Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
newTable	TokenNameIdentifier	 new Table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCount	TokenNameIdentifier	 f Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if the symbol table already contains the specified * symbol. * * @param symbol The symbol to look for. */	TokenNameCOMMENT_JAVADOC	 Returns true if the symbol table already contains the specified symbol. * @param symbol The symbol to look for. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsSymbol	TokenNameIdentifier	 contains Symbol
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for identical symbol 	TokenNameCOMMENT_LINE	search for identical symbol 
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OUTER	TokenNameIdentifier	 OUTER
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SREntry	TokenNameIdentifier	 SR Entry
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
SREntryData	TokenNameIdentifier	 SR Entry Data
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SREntryData	TokenNameIdentifier	 SR Entry Data
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
OUTER	TokenNameIdentifier	 OUTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// containsSymbol(String):boolean 	TokenNameCOMMENT_LINE	containsSymbol(String):boolean 
/** * Returns true if the symbol table already contains the specified * symbol. * * @param buffer The buffer containing the symbol to look for. * @param offset The offset into the buffer. * @param length The length of the symbol in the buffer. */	TokenNameCOMMENT_JAVADOC	 Returns true if the symbol table already contains the specified symbol. * @param buffer The buffer containing the symbol to look for. @param offset The offset into the buffer. @param length The length of the symbol in the buffer. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsSymbol	TokenNameIdentifier	 contains Symbol
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// search for identical symbol 	TokenNameCOMMENT_LINE	search for identical symbol 
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
%	TokenNameREMAINDER	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
OUTER	TokenNameIdentifier	 OUTER
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SREntry	TokenNameIdentifier	 SR Entry
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
SREntryData	TokenNameIdentifier	 SR Entry Data
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SREntryData	TokenNameIdentifier	 SR Entry Data
)	TokenNameRPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
data	TokenNameIdentifier	 data
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
OUTER	TokenNameIdentifier	 OUTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// containsSymbol(char[],int,int):boolean 	TokenNameCOMMENT_LINE	containsSymbol(char[],int,int):boolean 
private	TokenNameprivate	
void	TokenNamevoid	
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
SREntry	TokenNameIdentifier	 SR Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fBuckets	TokenNameIdentifier	 f Buckets
[	TokenNameLBRACKET	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
bucket	TokenNameIdentifier	 bucket
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCount	TokenNameIdentifier	 f Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes stale symbols from the table. */	TokenNameCOMMENT_JAVADOC	 Removes stale symbols from the table. 
private	TokenNameprivate	
void	TokenNamevoid	
clean	TokenNameIdentifier	 clean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SREntry	TokenNameIdentifier	 SR Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SREntry	TokenNameIdentifier	 SR Entry
)	TokenNameRPAREN	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SREntry	TokenNameIdentifier	 SR Entry
)	TokenNameRPAREN	
fReferenceQueue	TokenNameIdentifier	 f Reference Queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * This class is a symbol table entry. Each entry acts as a node * in a doubly-linked list. * * The "SR" stands for SoftReference. */	TokenNameCOMMENT_JAVADOC	 This class is a symbol table entry. Each entry acts as a node in a doubly-linked list. * The "SR" stands for SoftReference. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
SREntry	TokenNameIdentifier	 SR Entry
extends	TokenNameextends	
SoftReference	TokenNameIdentifier	 Soft Reference
{	TokenNameLBRACE	
/** The next entry. */	TokenNameCOMMENT_JAVADOC	 The next entry. 
public	TokenNamepublic	
SREntry	TokenNameIdentifier	 SR Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
/** The previous entry. */	TokenNameCOMMENT_JAVADOC	 The previous entry. 
public	TokenNamepublic	
SREntry	TokenNameIdentifier	 SR Entry
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a new entry from the specified symbol and next entry * reference. */	TokenNameCOMMENT_JAVADOC	 Constructs a new entry from the specified symbol and next entry reference. 
public	TokenNamepublic	
SREntry	TokenNameIdentifier	 SR Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
internedSymbol	TokenNameIdentifier	 interned Symbol
,	TokenNameCOMMA	
SREntry	TokenNameIdentifier	 SR Entry
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
,	TokenNameCOMMA	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
SREntryData	TokenNameIdentifier	 SR Entry Data
(	TokenNameLPAREN	
internedSymbol	TokenNameIdentifier	 interned Symbol
)	TokenNameRPAREN	
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new entry from the specified symbol information and * next entry reference. */	TokenNameCOMMENT_JAVADOC	 Constructs a new entry from the specified symbol information and next entry reference. 
public	TokenNamepublic	
SREntry	TokenNameIdentifier	 SR Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
internedSymbol	TokenNameIdentifier	 interned Symbol
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
SREntry	TokenNameIdentifier	 SR Entry
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
,	TokenNameCOMMA	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
new	TokenNamenew	
SREntryData	TokenNameIdentifier	 SR Entry Data
(	TokenNameLPAREN	
internedSymbol	TokenNameIdentifier	 interned Symbol
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
,	TokenNameCOMMA	
q	TokenNameIdentifier	 q
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
SREntry	TokenNameIdentifier	 SR Entry
next	TokenNameIdentifier	 next
,	TokenNameCOMMA	
int	TokenNameint	
bucket	TokenNameIdentifier	 bucket
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
bucket	TokenNameIdentifier	 bucket
=	TokenNameEQUAL	
bucket	TokenNameIdentifier	 bucket
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class Entry 	TokenNameCOMMENT_LINE	class Entry 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
SREntryData	TokenNameIdentifier	 SR Entry Data
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
characters	TokenNameIdentifier	 characters
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SREntryData	TokenNameIdentifier	 SR Entry Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
internedSymbol	TokenNameIdentifier	 interned Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
internedSymbol	TokenNameIdentifier	 interned Symbol
;	TokenNameSEMICOLON	
characters	TokenNameIdentifier	 characters
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SREntryData	TokenNameIdentifier	 SR Entry Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
internedSymbol	TokenNameIdentifier	 interned Symbol
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
internedSymbol	TokenNameIdentifier	 interned Symbol
;	TokenNameSEMICOLON	
characters	TokenNameIdentifier	 characters
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class SoftReferenceSymbolTable 	TokenNameCOMMENT_LINE	class SoftReferenceSymbolTable 
