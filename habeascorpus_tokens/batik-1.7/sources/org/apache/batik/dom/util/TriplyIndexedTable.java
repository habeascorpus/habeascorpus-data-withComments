/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * This class represents a triply indexed hash table. * <br>Note: This implementation is not Thread-safe. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: TriplyIndexedTable.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a triply indexed hash table. <br>Note: This implementation is not Thread-safe. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: TriplyIndexedTable.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
TriplyIndexedTable	TokenNameIdentifier	 Triply Indexed Table
{	TokenNameLBRACE	
/** * The initial capacity */	TokenNameCOMMENT_JAVADOC	 The initial capacity 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_CAPACITY	TokenNameIdentifier	 INITIAL  CAPACITY
=	TokenNameEQUAL	
11	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The underlying array */	TokenNameCOMMENT_JAVADOC	 The underlying array 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
/** * The number of entries */	TokenNameCOMMENT_JAVADOC	 The number of entries 
protected	TokenNameprotected	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * Creates a new TriplyIndexedTable. */	TokenNameCOMMENT_JAVADOC	 Creates a new TriplyIndexedTable. 
public	TokenNamepublic	
TriplyIndexedTable	TokenNameIdentifier	 Triply Indexed Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
INITIAL_CAPACITY	TokenNameIdentifier	 INITIAL  CAPACITY
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new TriplyIndexedTable. * @param c The inital capacity. */	TokenNameCOMMENT_JAVADOC	 Creates a new TriplyIndexedTable. @param c The inital capacity. 
public	TokenNamepublic	
TriplyIndexedTable	TokenNameIdentifier	 Triply Indexed Table
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of this table. */	TokenNameCOMMENT_JAVADOC	 Returns the size of this table. 
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
/** * Puts a value in the table. * @return the old value or null */	TokenNameCOMMENT_JAVADOC	 Puts a value in the table. @return the old value or null 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o3	TokenNameIdentifier	 o3
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
o3	TokenNameIdentifier	 o3
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
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
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
o3	TokenNameIdentifier	 o3
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
// The key is not in the hash table 	TokenNameCOMMENT_LINE	The key is not in the hash table 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// more than 75% loaded: grow 	TokenNameCOMMENT_LINE	more than 75% loaded: grow 
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
o3	TokenNameIdentifier	 o3
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the value of an entry * @return the value or null */	TokenNameCOMMENT_JAVADOC	 Gets the value of an entry @return the value or null 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o3	TokenNameIdentifier	 o3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
o3	TokenNameIdentifier	 o3
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
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
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
o3	TokenNameIdentifier	 o3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
/** * Rehash the table */	TokenNameCOMMENT_JAVADOC	 Rehash the table 
protected	TokenNameprotected	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldTable	TokenNameIdentifier	 old Table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
oldTable	TokenNameIdentifier	 old Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
oldTable	TokenNameIdentifier	 old Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Computes a hash code corresponding to the given objects. */	TokenNameCOMMENT_JAVADOC	 Computes a hash code corresponding to the given objects. 
protected	TokenNameprotected	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o3	TokenNameIdentifier	 o3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
(	TokenNameLPAREN	
o3	TokenNameIdentifier	 o3
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
o3	TokenNameIdentifier	 o3
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * To manage collisions */	TokenNameCOMMENT_JAVADOC	 To manage collisions 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
/** * The hash code */	TokenNameCOMMENT_JAVADOC	 The hash code 
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
/** * The first key */	TokenNameCOMMENT_JAVADOC	 The first key 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
key1	TokenNameIdentifier	 key1
;	TokenNameSEMICOLON	
/** * The second key */	TokenNameCOMMENT_JAVADOC	 The second key 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
key2	TokenNameIdentifier	 key2
;	TokenNameSEMICOLON	
/** * The third key */	TokenNameCOMMENT_JAVADOC	 The third key 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
key3	TokenNameIdentifier	 key3
;	TokenNameSEMICOLON	
/** * The value */	TokenNameCOMMENT_JAVADOC	 The value 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * The next entry */	TokenNameCOMMENT_JAVADOC	 The next entry 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
/** * Creates a new entry */	TokenNameCOMMENT_JAVADOC	 Creates a new entry 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
key1	TokenNameIdentifier	 key1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
key2	TokenNameIdentifier	 key2
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
key3	TokenNameIdentifier	 key3
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
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key1	TokenNameIdentifier	 key1
=	TokenNameEQUAL	
key1	TokenNameIdentifier	 key1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key2	TokenNameIdentifier	 key2
=	TokenNameEQUAL	
key2	TokenNameIdentifier	 key2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key3	TokenNameIdentifier	 key3
=	TokenNameEQUAL	
key3	TokenNameIdentifier	 key3
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
/** * Whether this entry matches the given keys. */	TokenNameCOMMENT_JAVADOC	 Whether this entry matches the given keys. 
public	TokenNamepublic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o3	TokenNameIdentifier	 o3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key1	TokenNameIdentifier	 key1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
key1	TokenNameIdentifier	 key1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key2	TokenNameIdentifier	 key2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
key2	TokenNameIdentifier	 key2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
key3	TokenNameIdentifier	 key3
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key3	TokenNameIdentifier	 key3
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o3	TokenNameIdentifier	 o3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o3	TokenNameIdentifier	 o3
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
