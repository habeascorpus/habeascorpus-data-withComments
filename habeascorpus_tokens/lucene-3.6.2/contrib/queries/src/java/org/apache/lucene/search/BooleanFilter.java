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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
BooleanClause	TokenNameIdentifier	 Boolean Clause
.	TokenNameDOT	
Occur	TokenNameIdentifier	 Occur
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
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
;	TokenNameSEMICOLON	
/** * A container Filter that allows Boolean composition of Filters. * Filters are allocated into one of three logical constructs; * SHOULD, MUST NOT, MUST * The results Filter BitSet is constructed as follows: * SHOULD Filters are OR'd together * The resulting Filter is NOT'd with the NOT Filters * The resulting Filter is AND'd with the MUST Filters */	TokenNameCOMMENT_JAVADOC	 A container Filter that allows Boolean composition of Filters. Filters are allocated into one of three logical constructs; SHOULD, MUST NOT, MUST The results Filter BitSet is constructed as follows: SHOULD Filters are OR'd together The resulting Filter is NOT'd with the NOT Filters The resulting Filter is AND'd with the MUST Filters 
public	TokenNamepublic	
class	TokenNameclass	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
FilterClause	TokenNameIdentifier	 Filter Clause
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FilterClause	TokenNameIdentifier	 Filter Clause
>	TokenNameGREATER	
clauses	TokenNameIdentifier	 clauses
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
FilterClause	TokenNameIdentifier	 Filter Clause
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Returns the a DocIdSetIterator representing the Boolean composition * of the filters that have been added. */	TokenNameCOMMENT_JAVADOC	 Returns the a DocIdSetIterator representing the Boolean composition of the filters that have been added. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasShouldClauses	TokenNameIdentifier	 has Should Clauses
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
FilterClause	TokenNameIdentifier	 Filter Clause
fc	TokenNameIdentifier	 fc
:	TokenNameCOLON	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
SHOULD	TokenNameIdentifier	 SHOULD
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hasShouldClauses	TokenNameIdentifier	 has Should Clauses
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
=	TokenNameEQUAL	
getDISI	TokenNameIdentifier	 get DISI
(	TokenNameLPAREN	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasShouldClauses	TokenNameIdentifier	 has Should Clauses
&&	TokenNameAND_AND	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
FilterClause	TokenNameIdentifier	 Filter Clause
fc	TokenNameIdentifier	 fc
:	TokenNameCOLON	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST_NOT	TokenNameIdentifier	 MUST  NOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
hasShouldClauses	TokenNameIdentifier	 has Should Clauses
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: may set bits on deleted docs 	TokenNameCOMMENT_LINE	NOTE: may set bits on deleted docs 
}	TokenNameRBRACE	
final	TokenNamefinal	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
=	TokenNameEQUAL	
getDISI	TokenNameIdentifier	 get DISI
(	TokenNameLPAREN	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
FilterClause	TokenNameIdentifier	 Filter Clause
fc	TokenNameIdentifier	 fc
:	TokenNameCOLON	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
getOccur	TokenNameIdentifier	 get Occur
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
Occur	TokenNameIdentifier	 Occur
.	TokenNameDOT	
MUST	TokenNameIdentifier	 MUST
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
=	TokenNameEQUAL	
getDISI	TokenNameIdentifier	 get DISI
(	TokenNameLPAREN	
fc	TokenNameIdentifier	 fc
.	TokenNameDOT	
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
// no documents can match 	TokenNameCOMMENT_LINE	no documents can match 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
FixedBitSet	TokenNameIdentifier	 Fixed Bit Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
res	TokenNameIdentifier	 res
:	TokenNameCOLON	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
getDISI	TokenNameIdentifier	 get DISI
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
DocIdSet	TokenNameIdentifier	 Doc Id Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
set	TokenNameIdentifier	 set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
set	TokenNameIdentifier	 set
==	TokenNameEQUAL_EQUAL	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a new FilterClause to the Boolean Filter container * @param filterClause A FilterClause object containing a Filter and an Occur parameter */	TokenNameCOMMENT_JAVADOC	 Adds a new FilterClause to the Boolean Filter container @param filterClause A FilterClause object containing a Filter and an Occur parameter 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
FilterClause	TokenNameIdentifier	 Filter Clause
filterClause	TokenNameIdentifier	 filter Clause
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
filterClause	TokenNameIdentifier	 filter Clause
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
Occur	TokenNameIdentifier	 Occur
occur	TokenNameIdentifier	 occur
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
FilterClause	TokenNameIdentifier	 Filter Clause
(	TokenNameLPAREN	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
occur	TokenNameIdentifier	 occur
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the list of clauses */	TokenNameCOMMENT_JAVADOC	 Returns the list of clauses 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
FilterClause	TokenNameIdentifier	 Filter Clause
>	TokenNameGREATER	
clauses	TokenNameIdentifier	 clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clauses	TokenNameIdentifier	 clauses
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns an iterator on the clauses in this query. It implements the {@link Iterable} interface to * make it possible to do: * <pre>for (FilterClause clause : booleanFilter) {}</pre> */	TokenNameCOMMENT_JAVADOC	 Returns an iterator on the clauses in this query. It implements the {@link Iterable} interface to make it possible to do: <pre>for (FilterClause clause : booleanFilter) {}</pre> 
public	TokenNamepublic	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
FilterClause	TokenNameIdentifier	 Filter Clause
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
clauses	TokenNameIdentifier	 clauses
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BooleanFilter	TokenNameIdentifier	 Boolean Filter
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
657153718	TokenNameIntegerLiteral	
^	TokenNameXOR	
clauses	TokenNameIdentifier	 clauses
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints a user-readable version of this Filter. */	TokenNameCOMMENT_JAVADOC	 Prints a user-readable version of this Filter. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"BooleanFilter("	TokenNameStringLiteral	BooleanFilter(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
minLen	TokenNameIdentifier	 min Len
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
FilterClause	TokenNameIdentifier	 Filter Clause
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
clauses	TokenNameIdentifier	 clauses
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
minLen	TokenNameIdentifier	 min Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
