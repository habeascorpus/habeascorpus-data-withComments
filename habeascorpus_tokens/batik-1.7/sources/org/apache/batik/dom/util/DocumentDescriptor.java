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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CleanerThread	TokenNameIdentifier	 Cleaner Thread
;	TokenNameSEMICOLON	
/** * This class contains informations about a document. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @version $Id: DocumentDescriptor.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class contains informations about a document. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @version $Id: DocumentDescriptor.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DocumentDescriptor	TokenNameIdentifier	 Document Descriptor
{	TokenNameLBRACE	
/** * The table initial capacity */	TokenNameCOMMENT_JAVADOC	 The table initial capacity 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_CAPACITY	TokenNameIdentifier	 INITIAL  CAPACITY
=	TokenNameEQUAL	
101	TokenNameIntegerLiteral	
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
/** * Creates a new table. */	TokenNameCOMMENT_JAVADOC	 Creates a new table. 
public	TokenNamepublic	
DocumentDescriptor	TokenNameIdentifier	 Document Descriptor
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
/** * Returns the number of elements in the document. */	TokenNameCOMMENT_JAVADOC	 Returns the number of elements in the document. 
public	TokenNamepublic	
int	TokenNameint	
getNumberOfElements	TokenNameIdentifier	 get Number Of Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the location line in the source file of the end element. * @return zero if the information is unknown. */	TokenNameCOMMENT_JAVADOC	 Returns the location line in the source file of the end element. @return zero if the information is unknown. 
public	TokenNamepublic	
int	TokenNameint	
getLocationLine	TokenNameIdentifier	 get Location Line
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
!=	TokenNameNOT_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
locationLine	TokenNameIdentifier	 location Line
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the location column in the source file of the end element. * @return zero if the information is unknown. */	TokenNameCOMMENT_JAVADOC	 Returns the location column in the source file of the end element. @return zero if the information is unknown. 
public	TokenNamepublic	
int	TokenNameint	
getLocationColumn	TokenNameIdentifier	 get Location Column
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
!=	TokenNameNOT_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
locationColumn	TokenNameIdentifier	 location Column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the location in the source file of the end element. */	TokenNameCOMMENT_JAVADOC	 Sets the location in the source file of the end element. 
public	TokenNamepublic	
void	TokenNamevoid	
setLocation	TokenNameIdentifier	 set Location
(	TokenNameLPAREN	
Element	TokenNameIdentifier	 Element
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
int	TokenNameint	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
int	TokenNameint	
col	TokenNameIdentifier	 col
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
elt	TokenNameIdentifier	 elt
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
!=	TokenNameNOT_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
elt	TokenNameIdentifier	 elt
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
locationLine	TokenNameIdentifier	 location Line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
;	TokenNameSEMICOLON	
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
elt	TokenNameIdentifier	 elt
,	TokenNameCOMMA	
line	TokenNameIdentifier	 line
,	TokenNameCOMMA	
col	TokenNameIdentifier	 col
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
}	TokenNameRBRACE	
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
protected	TokenNameprotected	
void	TokenNamevoid	
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
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
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
!=	TokenNameNOT_EQUAL	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
;	TokenNameSEMICOLON	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// already remove??? 	TokenNameCOMMENT_LINE	already remove??? 
if	TokenNameif	
(	TokenNameLPAREN	
prev	TokenNameIdentifier	 prev
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// First entry. 	TokenNameCOMMENT_LINE	First entry. 
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
else	TokenNameelse	
prev	TokenNameIdentifier	 prev
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To manage collisions */	TokenNameCOMMENT_JAVADOC	 To manage collisions 
protected	TokenNameprotected	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
extends	TokenNameextends	
CleanerThread	TokenNameIdentifier	 Cleaner Thread
.	TokenNameDOT	
WeakReferenceCleared	TokenNameIdentifier	 Weak Reference Cleared
{	TokenNameLBRACE	
/** * The hash code */	TokenNameCOMMENT_JAVADOC	 The hash code 
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
/** * The line number. */	TokenNameCOMMENT_JAVADOC	 The line number. 
public	TokenNamepublic	
int	TokenNameint	
locationLine	TokenNameIdentifier	 location Line
;	TokenNameSEMICOLON	
/** * The column number. */	TokenNameCOMMENT_JAVADOC	 The column number. 
public	TokenNamepublic	
int	TokenNameint	
locationColumn	TokenNameIdentifier	 location Column
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
Element	TokenNameIdentifier	 Element
element	TokenNameIdentifier	 element
,	TokenNameCOMMA	
int	TokenNameint	
locationLine	TokenNameIdentifier	 location Line
,	TokenNameCOMMA	
int	TokenNameint	
locationColumn	TokenNameIdentifier	 location Column
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
element	TokenNameIdentifier	 element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locationLine	TokenNameIdentifier	 location Line
=	TokenNameEQUAL	
locationLine	TokenNameIdentifier	 location Line
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
locationColumn	TokenNameIdentifier	 location Column
=	TokenNameEQUAL	
locationColumn	TokenNameIdentifier	 location Column
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
cleared	TokenNameIdentifier	 cleared
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeEntry	TokenNameIdentifier	 remove Entry
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
