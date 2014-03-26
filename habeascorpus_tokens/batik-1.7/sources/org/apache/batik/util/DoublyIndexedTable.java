/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
/** * This class represents a doubly indexed hash table. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DoublyIndexedTable.java 592621 2007-11-07 05:58:12Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a doubly indexed hash table. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DoublyIndexedTable.java 592621 2007-11-07 05:58:12Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
{	TokenNameLBRACE	
/** * The initial capacity */	TokenNameCOMMENT_JAVADOC	 The initial capacity 
protected	TokenNameprotected	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
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
/** * Creates a new DoublyIndexedTable. */	TokenNameCOMMENT_JAVADOC	 Creates a new DoublyIndexedTable. 
public	TokenNamepublic	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new DoublyIndexedTable. * @param c The inital capacity. */	TokenNameCOMMENT_JAVADOC	 Creates a new DoublyIndexedTable. @param c The inital capacity. 
public	TokenNamepublic	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialCapacity	TokenNameIdentifier	 initial Capacity
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new DoublyIndexedTable initialized to contain all of * the entries of the specified other DoublyIndexedTable. */	TokenNameCOMMENT_JAVADOC	 Creates a new DoublyIndexedTable initialized to contain all of the entries of the specified other DoublyIndexedTable. 
public	TokenNamepublic	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
(	TokenNameLPAREN	
DoublyIndexedTable	TokenNameIdentifier	 Doubly Indexed Table
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialCapacity	TokenNameIdentifier	 initial Capacity
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
initialCapacity	TokenNameIdentifier	 initial Capacity
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
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
other	TokenNameIdentifier	 other
.	TokenNameDOT	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
newE	TokenNameIdentifier	 new E
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newE	TokenNameIdentifier	 new E
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key1	TokenNameIdentifier	 key1
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key2	TokenNameIdentifier	 key2
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
newE	TokenNameIdentifier	 new E
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newE	TokenNameIdentifier	 new E
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
count	TokenNameIdentifier	 count
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
/** * Removes an entry from the table. * @return the value or null */	TokenNameCOMMENT_JAVADOC	 Removes an entry from the table. @return the value or null 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
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
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
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
Entry	TokenNameIdentifier	 Entry
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
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
/** * Returns an array of all of the values in the table. */	TokenNameCOMMENT_JAVADOC	 Returns an array of all of the values in the table. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValuesArray	TokenNameIdentifier	 get Values Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
count	TokenNameIdentifier	 count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the table. */	TokenNameCOMMENT_JAVADOC	 Clears the table. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
initialCapacity	TokenNameIdentifier	 initial Capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an iterator on the entries of the table. */	TokenNameCOMMENT_JAVADOC	 Returns an iterator on the entries of the table. 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TableIterator	TokenNameIdentifier	 Table Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
o1	TokenNameIdentifier	 o1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
^	TokenNameXOR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * An entry in the {@link DoublyIndexedTable}. */	TokenNameCOMMENT_JAVADOC	 An entry in the {@link DoublyIndexedTable}. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
/** * The hash code. */	TokenNameCOMMENT_JAVADOC	 The hash code. 
protected	TokenNameprotected	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
/** * The first key. */	TokenNameCOMMENT_JAVADOC	 The first key. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
key1	TokenNameIdentifier	 key1
;	TokenNameSEMICOLON	
/** * The second key. */	TokenNameCOMMENT_JAVADOC	 The second key. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
key2	TokenNameIdentifier	 key2
;	TokenNameSEMICOLON	
/** * The value. */	TokenNameCOMMENT_JAVADOC	 The value. 
protected	TokenNameprotected	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
/** * The next entry. */	TokenNameCOMMENT_JAVADOC	 The next entry. 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
/** * Creates a new entry. */	TokenNameCOMMENT_JAVADOC	 Creates a new entry. 
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
/** * Returns this entry's first key. */	TokenNameCOMMENT_JAVADOC	 Returns this entry's first key. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getKey1	TokenNameIdentifier	 get Key1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key1	TokenNameIdentifier	 key1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns this entry's second key. */	TokenNameCOMMENT_JAVADOC	 Returns this entry's second key. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getKey2	TokenNameIdentifier	 get Key2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key2	TokenNameIdentifier	 key2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns this entry's value. */	TokenNameCOMMENT_JAVADOC	 Returns this entry's value. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether this entry match the given keys. */	TokenNameCOMMENT_JAVADOC	 Whether this entry match the given keys. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
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
return	TokenNamereturn	
key2	TokenNameIdentifier	 key2
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
o2	TokenNameIdentifier	 o2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An Iterator class for a {@link DoublyIndexedTable}. */	TokenNameCOMMENT_JAVADOC	 An Iterator class for a {@link DoublyIndexedTable}. 
protected	TokenNameprotected	
class	TokenNameclass	
TableIterator	TokenNameIdentifier	 Table Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
{	TokenNameLBRACE	
/** * The index of the next entry to return. */	TokenNameCOMMENT_JAVADOC	 The index of the next entry to return. 
private	TokenNameprivate	
int	TokenNameint	
nextIndex	TokenNameIdentifier	 next Index
;	TokenNameSEMICOLON	
/** * The next Entry to return. */	TokenNameCOMMENT_JAVADOC	 The next Entry to return. 
private	TokenNameprivate	
Entry	TokenNameIdentifier	 Entry
nextEntry	TokenNameIdentifier	 next Entry
;	TokenNameSEMICOLON	
/** * Whether the Iterator has run out of elements. */	TokenNameCOMMENT_JAVADOC	 Whether the Iterator has run out of elements. 
private	TokenNameprivate	
boolean	TokenNameboolean	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
/** * Creates a new TableIterator. */	TokenNameCOMMENT_JAVADOC	 Creates a new TableIterator. 
public	TokenNamepublic	
TableIterator	TokenNameIdentifier	 Table Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextIndex	TokenNameIdentifier	 next Index
<	TokenNameLESS	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextEntry	TokenNameIdentifier	 next Entry
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
nextIndex	TokenNameIdentifier	 next Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextEntry	TokenNameIdentifier	 next Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextIndex	TokenNameIdentifier	 next Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
nextEntry	TokenNameIdentifier	 next Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
finished	TokenNameIdentifier	 finished
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
finished	TokenNameIdentifier	 finished
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Entry	TokenNameIdentifier	 Entry
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
nextEntry	TokenNameIdentifier	 next Entry
;	TokenNameSEMICOLON	
findNext	TokenNameIdentifier	 find Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Searches for the next Entry in the table. */	TokenNameCOMMENT_JAVADOC	 Searches for the next Entry in the table. 
protected	TokenNameprotected	
void	TokenNamevoid	
findNext	TokenNameIdentifier	 find Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextEntry	TokenNameIdentifier	 next Entry
=	TokenNameEQUAL	
nextEntry	TokenNameIdentifier	 next Entry
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextEntry	TokenNameIdentifier	 next Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextIndex	TokenNameIdentifier	 next Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nextIndex	TokenNameIdentifier	 next Index
<	TokenNameLESS	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextEntry	TokenNameIdentifier	 next Entry
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
nextIndex	TokenNameIdentifier	 next Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextEntry	TokenNameIdentifier	 next Entry
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextIndex	TokenNameIdentifier	 next Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finished	TokenNameIdentifier	 finished
=	TokenNameEQUAL	
nextEntry	TokenNameIdentifier	 next Entry
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
