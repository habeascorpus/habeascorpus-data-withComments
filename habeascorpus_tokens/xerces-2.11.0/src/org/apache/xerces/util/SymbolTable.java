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
/** * This class is a symbol table implementation that guarantees that * strings used as identifiers are unique references. Multiple calls * to <code>addSymbol</code> will always return the same string * reference. * <p> * The symbol table performs the same task as <code>String.intern()</code> * with the following differences: * <ul> * <li> * A new string object does not need to be created in order to * retrieve a unique reference. Symbols can be added by using * a series of characters in a character array. * </li> * <li> * Users of the symbol table can provide their own symbol hashing * implementation. For example, a simple string hashing algorithm * may fail to produce a balanced set of hashcodes for symbols * that are <em>mostly</em> unique. Strings with similar leading * characters are especially prone to this poor hashing behavior. * </li> * </ul> * * An instance of <code>SymbolTable</code> has two parameters that affect its * performance: <i>initial capacity</i> and <i>load factor</i>. The * <i>capacity</i> is the number of <i>buckets</i> in the SymbolTable, and the * <i>initial capacity</i> is simply the capacity at the time the SymbolTable * is created. Note that the SymbolTable is <i>open</i>: in the case of a "hash * collision", a single bucket stores multiple entries, which must be searched * sequentially. The <i>load factor</i> is a measure of how full the SymbolTable * is allowed to get before its capacity is automatically increased. * When the number of entries in the SymbolTable exceeds the product of the load * factor and the current capacity, the capacity is increased by calling the * <code>rehash</code> method.<p> * * Generally, the default load factor (.75) offers a good tradeoff between * time and space costs. Higher values decrease the space overhead but * increase the time cost to look up an entry (which is reflected in most * <tt>SymbolTable</tt> operations, including <tt>addSymbol</tt> and <tt>containsSymbol</tt>).<p> * * The initial capacity controls a tradeoff between wasted space and the * need for <code>rehash</code> operations, which are time-consuming. * No <code>rehash</code> operations will <i>ever</i> occur if the initial * capacity is greater than the maximum number of entries the * <tt>Hashtable</tt> will contain divided by its load factor. However, * setting the initial capacity too high can waste space.<p> * * If many entries are to be made into a <code>SymbolTable</code>, * creating it with a sufficiently large capacity may allow the * entries to be inserted more efficiently than letting it perform * automatic rehashing as needed to grow the table. <p> * @see SymbolHash * * @author Andy Clark * @author John Kim, IBM * * @version $Id: SymbolTable.java 985518 2010-08-14 16:02:52Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is a symbol table implementation that guarantees that strings used as identifiers are unique references. Multiple calls to <code>addSymbol</code> will always return the same string reference. <p> The symbol table performs the same task as <code>String.intern()</code> with the following differences: <ul> <li> A new string object does not need to be created in order to retrieve a unique reference. Symbols can be added by using a series of characters in a character array. </li> <li> Users of the symbol table can provide their own symbol hashing implementation. For example, a simple string hashing algorithm may fail to produce a balanced set of hashcodes for symbols that are <em>mostly</em> unique. Strings with similar leading characters are especially prone to this poor hashing behavior. </li> </ul> * An instance of <code>SymbolTable</code> has two parameters that affect its performance: <i>initial capacity</i> and <i>load factor</i>. The <i>capacity</i> is the number of <i>buckets</i> in the SymbolTable, and the <i>initial capacity</i> is simply the capacity at the time the SymbolTable is created. Note that the SymbolTable is <i>open</i>: in the case of a "hash collision", a single bucket stores multiple entries, which must be searched sequentially. The <i>load factor</i> is a measure of how full the SymbolTable is allowed to get before its capacity is automatically increased. When the number of entries in the SymbolTable exceeds the product of the load factor and the current capacity, the capacity is increased by calling the <code>rehash</code> method.<p> * Generally, the default load factor (.75) offers a good tradeoff between time and space costs. Higher values decrease the space overhead but increase the time cost to look up an entry (which is reflected in most <tt>SymbolTable</tt> operations, including <tt>addSymbol</tt> and <tt>containsSymbol</tt>).<p> * The initial capacity controls a tradeoff between wasted space and the need for <code>rehash</code> operations, which are time-consuming. No <code>rehash</code> operations will <i>ever</i> occur if the initial capacity is greater than the maximum number of entries the <tt>Hashtable</tt> will contain divided by its load factor. However, setting the initial capacity too high can waste space.<p> * If many entries are to be made into a <code>SymbolTable</code>, creating it with a sufficiently large capacity may allow the entries to be inserted more efficiently than letting it perform automatic rehashing as needed to grow the table. <p> @see SymbolHash * @author Andy Clark @author John Kim, IBM * @version $Id: SymbolTable.java 985518 2010-08-14 16:02:52Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
SymbolTable	TokenNameIdentifier	 Symbol Table
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
/** Default table size. */	TokenNameCOMMENT_JAVADOC	 Default table size. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TABLE_SIZE	TokenNameIdentifier	 TABLE  SIZE
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
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** actual table size **/	TokenNameCOMMENT_JAVADOC	 actual table size *
protected	TokenNameprotected	
int	TokenNameint	
fTableSize	TokenNameIdentifier	 f Table Size
;	TokenNameSEMICOLON	
/** The total number of entries in the hash table. */	TokenNameCOMMENT_JAVADOC	 The total number of entries in the hash table. 
protected	TokenNameprotected	
transient	TokenNametransient	
int	TokenNameint	
fCount	TokenNameIdentifier	 f Count
;	TokenNameSEMICOLON	
/** The table is rehashed when its size exceeds this threshold. (The * value of this field is (int)(capacity * loadFactor).) */	TokenNameCOMMENT_JAVADOC	 The table is rehashed when its size exceeds this threshold. (The value of this field is (int)(capacity loadFactor).) 
protected	TokenNameprotected	
int	TokenNameint	
fThreshold	TokenNameIdentifier	 f Threshold
;	TokenNameSEMICOLON	
/** The load factor for the SymbolTable. */	TokenNameCOMMENT_JAVADOC	 The load factor for the SymbolTable. 
protected	TokenNameprotected	
float	TokenNamefloat	
fLoadFactor	TokenNameIdentifier	 f Load Factor
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a new, empty SymbolTable with the specified initial * capacity and the specified load factor. * * @param initialCapacity the initial capacity of the SymbolTable. * @param loadFactor the load factor of the SymbolTable. * @throws IllegalArgumentException if the initial capacity is less * than zero, or if the load factor is nonpositive. */	TokenNameCOMMENT_JAVADOC	 Constructs a new, empty SymbolTable with the specified initial capacity and the specified load factor. * @param initialCapacity the initial capacity of the SymbolTable. @param loadFactor the load factor of the SymbolTable. @throws IllegalArgumentException if the initial capacity is less than zero, or if the load factor is nonpositive. 
public	TokenNamepublic	
SymbolTable	TokenNameIdentifier	 Symbol Table
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
Entry	TokenNameIdentifier	 Entry
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
}	TokenNameRBRACE	
/** * Constructs a new, empty SymbolTable with the specified initial capacity * and default load factor, which is <tt>0.75</tt>. * * @param initialCapacity the initial capacity of the hashtable. * @throws IllegalArgumentException if the initial capacity is less * than zero. */	TokenNameCOMMENT_JAVADOC	 Constructs a new, empty SymbolTable with the specified initial capacity and default load factor, which is <tt>0.75</tt>. * @param initialCapacity the initial capacity of the hashtable. @throws IllegalArgumentException if the initial capacity is less than zero. 
public	TokenNamepublic	
SymbolTable	TokenNameIdentifier	 Symbol Table
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
SymbolTable	TokenNameIdentifier	 Symbol Table
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
entry	TokenNameIdentifier	 entry
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
entry	TokenNameIdentifier	 entry
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
// create new entry 	TokenNameCOMMENT_LINE	create new entry 
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
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
++	TokenNamePLUS_PLUS	
fCount	TokenNameIdentifier	 f Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
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
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
entry	TokenNameIdentifier	 entry
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
entry	TokenNameIdentifier	 entry
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
entry	TokenNameIdentifier	 entry
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
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
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
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// addSymbol(char[],int,int):String 	TokenNameCOMMENT_LINE	addSymbol(char[],int,int):String 
/** * Returns a hashcode value for the specified symbol. The value * returned by this method must be identical to the value returned * by the <code>hash(char[],int,int)</code> method when called * with the character array that comprises the symbol string. * * @param symbol The symbol to hash. */	TokenNameCOMMENT_JAVADOC	 Returns a hashcode value for the specified symbol. The value returned by this method must be identical to the value returned by the <code>hash(char[],int,int)</code> method when called with the character array that comprises the symbol string. * @param symbol The symbol to hash. 
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hash(String):int 	TokenNameCOMMENT_LINE	hash(String):int 
/** * Returns a hashcode value for the specified symbol information. * The value returned by this method must be identical to the value * returned by the <code>hash(String)</code> method when called * with the string object created from the symbol information. * * @param buffer The character buffer containing the symbol. * @param offset The offset into the character buffer of the start * of the symbol. * @param length The length of the symbol. */	TokenNameCOMMENT_JAVADOC	 Returns a hashcode value for the specified symbol information. The value returned by this method must be identical to the value returned by the <code>hash(String)</code> method when called with the string object created from the symbol information. * @param buffer The character buffer containing the symbol. @param offset The offset into the character buffer of the start of the symbol. @param length The length of the symbol. 
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
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
int	TokenNameint	
code	TokenNameIdentifier	 code
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
code	TokenNameIdentifier	 code
=	TokenNameEQUAL	
code	TokenNameIdentifier	 code
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
code	TokenNameIdentifier	 code
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// hash(char[],int,int):int 	TokenNameCOMMENT_LINE	hash(char[],int,int):int 
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
Entry	TokenNameIdentifier	 Entry
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
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newTable	TokenNameIdentifier	 new Table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
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
Entry	TokenNameIdentifier	 Entry
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
Entry	TokenNameIdentifier	 Entry
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
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
entry	TokenNameIdentifier	 entry
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
entry	TokenNameIdentifier	 entry
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
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
entry	TokenNameIdentifier	 entry
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
entry	TokenNameIdentifier	 entry
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
// 	TokenNameCOMMENT_LINE	 
// Classes 	TokenNameCOMMENT_LINE	Classes 
// 	TokenNameCOMMENT_LINE	 
/** * This class is a symbol table entry. Each entry acts as a node * in a linked list. */	TokenNameCOMMENT_JAVADOC	 This class is a symbol table entry. Each entry acts as a node in a linked list. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Symbol. */	TokenNameCOMMENT_JAVADOC	 Symbol. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
/** * Symbol characters. This information is duplicated here for * comparison performance. */	TokenNameCOMMENT_JAVADOC	 Symbol characters. This information is duplicated here for comparison performance. 
public	TokenNamepublic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
characters	TokenNameIdentifier	 characters
;	TokenNameSEMICOLON	
/** The next entry. */	TokenNameCOMMENT_JAVADOC	 The next entry. 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** * Constructs a new entry from the specified symbol and next entry * reference. */	TokenNameCOMMENT_JAVADOC	 Constructs a new entry from the specified symbol and next entry reference. 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
symbol	TokenNameIdentifier	 symbol
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Constructs a new entry from the specified symbol information and * next entry reference. */	TokenNameCOMMENT_JAVADOC	 Constructs a new entry from the specified symbol information and next entry reference. 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
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
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
characters	TokenNameIdentifier	 characters
)	TokenNameRPAREN	
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class Entry 	TokenNameCOMMENT_LINE	class Entry 
}	TokenNameRBRACE	
// class SymbolTable 	TokenNameCOMMENT_LINE	class SymbolTable 
