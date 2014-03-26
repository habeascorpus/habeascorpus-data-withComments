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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
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
/** * Expert: A hit queue for sorting by hits by terms in more than one field. * Uses <code>FieldCache.DEFAULT</code> for maintaining * internal term lookup tables. * * @lucene.experimental * @since 2.9 * @see Searcher#search(Query,Filter,int,Sort) * @see FieldCache */	TokenNameCOMMENT_JAVADOC	 Expert: A hit queue for sorting by hits by terms in more than one field. Uses <code>FieldCache.DEFAULT</code> for maintaining internal term lookup tables. * @lucene.experimental @since 2.9 @see Searcher#search(Query,Filter,int,Sort) @see FieldCache 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
extends	TokenNameextends	
PriorityQueue	TokenNameIdentifier	 Priority Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
extends	TokenNameextends	
ScoreDoc	TokenNameIdentifier	 Score Doc
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
score	TokenNameIdentifier	 score
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
slot	TokenNameIdentifier	 slot
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
return	TokenNamereturn	
"slot:"	TokenNameStringLiteral	slot:
+	TokenNamePLUS	
slot	TokenNameIdentifier	 slot
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An implementation of {@link FieldValueHitQueue} which is optimized in case * there is just one comparator. */	TokenNameCOMMENT_JAVADOC	 An implementation of {@link FieldValueHitQueue} which is optimized in case there is just one comparator. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
OneComparatorFieldValueHitQueue	TokenNameIdentifier	 One Comparator Field Value Hit Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
extends	TokenNameextends	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
oneReverseMul	TokenNameIdentifier	 one Reverse Mul
;	TokenNameSEMICOLON	
public	TokenNamepublic	
OneComparatorFieldValueHitQueue	TokenNameIdentifier	 One Comparator Field Value Hit Queue
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SortField	TokenNameIdentifier	 Sort Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
oneReverseMul	TokenNameIdentifier	 one Reverse Mul
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
oneReverseMul	TokenNameIdentifier	 one Reverse Mul
;	TokenNameSEMICOLON	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns whether <code>a</code> is less relevant than <code>b</code>. * @param a ScoreDoc * @param b ScoreDoc * @return <code>true</code> if document <code>a</code> should be sorted after document <code>b</code>. */	TokenNameCOMMENT_JAVADOC	 Returns whether <code>a</code> is less relevant than <code>b</code>. @param a ScoreDoc @param b ScoreDoc @return <code>true</code> if document <code>a</code> should be sorted after document <code>b</code>. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
final	TokenNamefinal	
Entry	TokenNameIdentifier	 Entry
hitA	TokenNameIdentifier	 hit A
,	TokenNameCOMMA	
final	TokenNamefinal	
Entry	TokenNameIdentifier	 Entry
hitB	TokenNameIdentifier	 hit B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
hitA	TokenNameIdentifier	 hit A
!=	TokenNameNOT_EQUAL	
hitB	TokenNameIdentifier	 hit B
;	TokenNameSEMICOLON	
assert	TokenNameassert	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
!=	TokenNameNOT_EQUAL	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
oneReverseMul	TokenNameIdentifier	 one Reverse Mul
*	TokenNameMULTIPLY	
comparator	TokenNameIdentifier	 comparator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// avoid random sort order that could lead to duplicates (bug #31241): 	TokenNameCOMMENT_LINE	avoid random sort order that could lead to duplicates (bug #31241): 
return	TokenNamereturn	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An implementation of {@link FieldValueHitQueue} which is optimized in case * there is more than one comparator. */	TokenNameCOMMENT_JAVADOC	 An implementation of {@link FieldValueHitQueue} which is optimized in case there is more than one comparator. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
MultiComparatorsFieldValueHitQueue	TokenNameIdentifier	 Multi Comparators Field Value Hit Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
extends	TokenNameextends	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
MultiComparatorsFieldValueHitQueue	TokenNameIdentifier	 Multi Comparators Field Value Hit Queue
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
numComparators	TokenNameIdentifier	 num Comparators
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
numComparators	TokenNameIdentifier	 num Comparators
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SortField	TokenNameIdentifier	 Sort Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
reverse	TokenNameIdentifier	 reverse
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getComparator	TokenNameIdentifier	 get Comparator
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initialize	TokenNameIdentifier	 initialize
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
final	TokenNamefinal	
Entry	TokenNameIdentifier	 Entry
hitA	TokenNameIdentifier	 hit A
,	TokenNameCOMMA	
final	TokenNamefinal	
Entry	TokenNameIdentifier	 Entry
hitB	TokenNameIdentifier	 hit B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
hitA	TokenNameIdentifier	 hit A
!=	TokenNameNOT_EQUAL	
hitB	TokenNameIdentifier	 hit B
;	TokenNameSEMICOLON	
assert	TokenNameassert	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
!=	TokenNameNOT_EQUAL	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
;	TokenNameSEMICOLON	
int	TokenNameint	
numComparators	TokenNameIdentifier	 num Comparators
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
numComparators	TokenNameIdentifier	 num Comparators
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
reverseMul	TokenNameIdentifier	 reverse Mul
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Short circuit 	TokenNameCOMMENT_LINE	Short circuit 
return	TokenNamereturn	
c	TokenNameIdentifier	 c
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// avoid random sort order that could lead to duplicates (bug #31241): 	TokenNameCOMMENT_LINE	avoid random sort order that could lead to duplicates (bug #31241): 
return	TokenNamereturn	
hitA	TokenNameIdentifier	 hit A
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
>	TokenNameGREATER	
hitB	TokenNameIdentifier	 hit B
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// prevent instantiation and extension. 	TokenNameCOMMENT_LINE	prevent instantiation and extension. 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
{	TokenNameLBRACE	
"unchecked"	TokenNameStringLiteral	unchecked
,	TokenNameCOMMA	
"rawtypes"	TokenNameStringLiteral	rawtypes
}	TokenNameRBRACE	
)	TokenNameRPAREN	
private	TokenNameprivate	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// When we get here, fields.length is guaranteed to be > 0, therefore no 	TokenNameCOMMENT_LINE	When we get here, fields.length is guaranteed to be > 0, therefore no 
// need to check it again. 	TokenNameCOMMENT_LINE	need to check it again. 
// All these are required by this class's API - need to return arrays. 	TokenNameCOMMENT_LINE	All these are required by this class's API - need to return arrays. 
// Therefore even in the case of a single comparator, create an array 	TokenNameCOMMENT_LINE	Therefore even in the case of a single comparator, create an array 
// anyway. 	TokenNameCOMMENT_LINE	anyway. 
this	TokenNamethis	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
int	TokenNameint	
numComparators	TokenNameIdentifier	 num Comparators
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
comparators	TokenNameIdentifier	 comparators
=	TokenNameEQUAL	
new	TokenNamenew	
FieldComparator	TokenNameIdentifier	 Field Comparator
[	TokenNameLBRACKET	
numComparators	TokenNameIdentifier	 num Comparators
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
reverseMul	TokenNameIdentifier	 reverse Mul
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numComparators	TokenNameIdentifier	 num Comparators
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a hit queue sorted by the given list of fields. * * <p><b>NOTE</b>: The instances returned by this method * pre-allocate a full array of length <code>numHits</code>. * * @param fields * SortField array we are sorting by in priority order (highest * priority first); cannot be <code>null</code> or empty * @param size * The number of hits to retain. Must be greater than zero. * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Creates a hit queue sorted by the given list of fields. * <p><b>NOTE</b>: The instances returned by this method pre-allocate a full array of length <code>numHits</code>. * @param fields SortField array we are sorting by in priority order (highest priority first); cannot be <code>null</code> or empty @param size The number of hits to retain. Must be greater than zero. @throws IOException 
public	TokenNamepublic	
static	TokenNamestatic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
FieldValueHitQueue	TokenNameIdentifier	 Field Value Hit Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Sort must contain at least one field"	TokenNameStringLiteral	Sort must contain at least one field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
OneComparatorFieldValueHitQueue	TokenNameIdentifier	 One Comparator Field Value Hit Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
MultiComparatorsFieldValueHitQueue	TokenNameIdentifier	 Multi Comparators Field Value Hit Queue
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getComparators	TokenNameIdentifier	 get Comparators
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
comparators	TokenNameIdentifier	 comparators
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getReverseMul	TokenNameIdentifier	 get Reverse Mul
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
reverseMul	TokenNameIdentifier	 reverse Mul
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Stores the sort criteria being used. */	TokenNameCOMMENT_JAVADOC	 Stores the sort criteria being used. 
protected	TokenNameprotected	
final	TokenNamefinal	
SortField	TokenNameIdentifier	 Sort Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
comparators	TokenNameIdentifier	 comparators
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
reverseMul	TokenNameIdentifier	 reverse Mul
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
lessThan	TokenNameIdentifier	 less Than
(	TokenNameLPAREN	
final	TokenNamefinal	
Entry	TokenNameIdentifier	 Entry
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
final	TokenNamefinal	
Entry	TokenNameIdentifier	 Entry
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a queue Entry, creates a corresponding FieldDoc * that contains the values used to sort the given document. * These values are not the raw values out of the index, but the internal * representation of them. This is so the given search hit can be collated by * a MultiSearcher with other search hits. * * @param entry The Entry used to create a FieldDoc * @return The newly created FieldDoc * @see Searchable#search(Weight,Filter,int,Sort) */	TokenNameCOMMENT_JAVADOC	 Given a queue Entry, creates a corresponding FieldDoc that contains the values used to sort the given document. These values are not the raw values out of the index, but the internal representation of them. This is so the given search hit can be collated by a MultiSearcher with other search hits. * @param entry The Entry used to create a FieldDoc @return The newly created FieldDoc @see Searchable#search(Weight,Filter,int,Sort) 
FieldDoc	TokenNameIdentifier	 Field Doc
fillFields	TokenNameIdentifier	 fill Fields
(	TokenNameLPAREN	
final	TokenNamefinal	
Entry	TokenNameIdentifier	 Entry
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
comparators	TokenNameIdentifier	 comparators
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//if (maxscore > 1.0f) doc.score /= maxscore; // normalize scores 	TokenNameCOMMENT_LINE	if (maxscore > 1.0f) doc.score /= maxscore; // normalize scores 
return	TokenNamereturn	
new	TokenNamenew	
FieldDoc	TokenNameIdentifier	 Field Doc
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
score	TokenNameIdentifier	 score
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the SortFields being used by this hit queue. */	TokenNameCOMMENT_JAVADOC	 Returns the SortFields being used by this hit queue. 
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
}	TokenNameRBRACE	
