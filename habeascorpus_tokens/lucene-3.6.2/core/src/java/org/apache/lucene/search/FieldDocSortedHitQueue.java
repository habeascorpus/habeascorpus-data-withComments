package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PriorityQueue	TokenNameIdentifier	 Priority Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
Collator	TokenNameIdentifier	 Collator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
;	TokenNameSEMICOLON	
/** * Expert: Collects sorted results from Searchable's and collates them. * The elements put into this queue must be of type FieldDoc. * * <p>Created: Feb 11, 2004 2:04:21 PM * * @since lucene 1.4 */	TokenNameCOMMENT_JAVADOC	 Expert: Collects sorted results from Searchable's and collates them. The elements put into this queue must be of type FieldDoc. * <p>Created: Feb 11, 2004 2:04:21 PM * @since lucene 1.4 
class	TokenNameclass	
FieldDocSortedHitQueue	TokenNameIdentifier	 Field Doc Sorted Hit Queue
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
FieldDoc	TokenNameIdentifier	 Field Doc
>	TokenNameGREATER	
{	TokenNameLBRACE	
volatile	TokenNamevolatile	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// used in the case where the fields are sorted by locale 	TokenNameCOMMENT_LINE	used in the case where the fields are sorted by locale 
// based strings 	TokenNameCOMMENT_LINE	based strings 
volatile	TokenNamevolatile	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
collators	TokenNameIdentifier	 collators
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
volatile	TokenNamevolatile	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comparators	TokenNameIdentifier	 comparators
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Creates a hit queue sorted by the given list of fields. * @param fields Fieldable names, in priority order (highest priority first). * @param size The number of hits to retain. Must be greater than zero. */	TokenNameCOMMENT_JAVADOC	 Creates a hit queue sorted by the given list of fields. @param fields Fieldable names, in priority order (highest priority first). @param size The number of hits to retain. Must be greater than zero. 
FieldDocSortedHitQueue	TokenNameIdentifier	 Field Doc Sorted Hit Queue
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Allows redefinition of sort fields if they are <code>null</code>. * This is to handle the case using ParallelMultiSearcher where the * original list contains AUTO and we don't know the actual sort * type until the values come back. The fields can only be set once. * This method should be synchronized external like all other PQ methods. * @param fields */	TokenNameCOMMENT_JAVADOC	 Allows redefinition of sort fields if they are <code>null</code>. This is to handle the case using ParallelMultiSearcher where the original list contains AUTO and we don't know the actual sort type until the values come back. The fields can only be set once. This method should be synchronized external like all other PQ methods. @param fields 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
void	TokenNamevoid	
setFields	TokenNameIdentifier	 set Fields
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
collators	TokenNameIdentifier	 collators
=	TokenNameEQUAL	
hasCollators	TokenNameIdentifier	 has Collators
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
=	TokenNameEQUAL	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
[	TokenNameLBRACKET	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
fieldIDX	TokenNameIdentifier	 field IDX
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fieldIDX	TokenNameIdentifier	 field IDX
<	TokenNameLESS	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
fieldIDX	TokenNameIdentifier	 field IDX
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
fieldIDX	TokenNameIdentifier	 field IDX
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
fieldIDX	TokenNameIdentifier	 field IDX
]	TokenNameRBRACKET	
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fieldIDX	TokenNameIdentifier	 field IDX
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Returns the fields being used to sort. */	TokenNameCOMMENT_JAVADOC	 Returns the fields being used to sort. 
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an array of collators, possibly <code>null</code>. The collators * correspond to any SortFields which were given a specific locale. * @param fields Array of sort fields. * @return Array, possibly <code>null</code>. */	TokenNameCOMMENT_JAVADOC	 Returns an array of collators, possibly <code>null</code>. The collators correspond to any SortFields which were given a specific locale. @param fields Array of sort fields. @return Array, possibly <code>null</code>. 
private	TokenNameprivate	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hasCollators	TokenNameIdentifier	 has Collators
(	TokenNameLPAREN	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
Collator	TokenNameIdentifier	 Collator
[	TokenNameLBRACKET	
fields	TokenNameIdentifier	 fields
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
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
ret	TokenNameIdentifier	 ret
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether <code>a</code> is less relevant than <code>b</code>. * @param a ScoreDoc * @param b ScoreDoc * @return <code>true</code> if document <code>a</code> should be sorted after document <code>b</code>. */	TokenNameCOMMENT_JAVADOC	 Returns whether <code>a</code> is less relevant than <code>b</code>. @param a ScoreDoc @param b ScoreDoc @return <code>true</code> if document <code>a</code> should be sorted after document <code>b</code>. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
protected	TokenNameprotected	
final	TokenNamefinal	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
final	TokenNamefinal	
FieldDoc	TokenNameIdentifier	 Field Doc
docA	TokenNameIdentifier	 doc A
,	TokenNameCOMMA	
final	TokenNamefinal	
FieldDoc	TokenNameIdentifier	 Field Doc
docB	TokenNameIdentifier	 doc B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
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
n	TokenNameIdentifier	 n
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
==	TokenNameEQUAL_EQUAL	
SortField	TokenNameIdentifier	 Sort Field
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
docA	TokenNameIdentifier	 doc A
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
docB	TokenNameIdentifier	 doc B
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// null values need to be sorted first, because of how FieldCache.getStringIndex() 	TokenNameCOMMENT_LINE	null values need to be sorted first, because of how FieldCache.getStringIndex() 
// works - in that routine, any documents without a value in the given field are 	TokenNameCOMMENT_LINE	works - in that routine, any documents without a value in the given field are 
// put first. If both are null, the next SortField is used 	TokenNameCOMMENT_LINE	put first. If both are null, the next SortField is used 
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocale	TokenNameIdentifier	 get Locale
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
collators	TokenNameIdentifier	 collators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
)	TokenNameRPAREN	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
docA	TokenNameIdentifier	 doc A
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
docB	TokenNameIdentifier	 doc B
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reverse sort 	TokenNameCOMMENT_LINE	reverse sort 
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getReverse	TokenNameIdentifier	 get Reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// avoid random sort order that could lead to duplicates (bug #31241): 	TokenNameCOMMENT_LINE	avoid random sort order that could lead to duplicates (bug #31241): 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
docA	TokenNameIdentifier	 doc A
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
docB	TokenNameIdentifier	 doc B
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
