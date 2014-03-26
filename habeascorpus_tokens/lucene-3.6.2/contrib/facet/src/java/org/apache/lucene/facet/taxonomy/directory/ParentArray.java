package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
directory	TokenNameIdentifier	 directory
;	TokenNameSEMICOLON	
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Term	TokenNameIdentifier	 Term
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
TermPositions	TokenNameIdentifier	 Term Positions
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
// getParent() needs to be extremely efficient, to the point that we need 	TokenNameCOMMENT_LINE	getParent() needs to be extremely efficient, to the point that we need 
// to fetch all the data in advance into memory, and answer these calls 	TokenNameCOMMENT_LINE	to fetch all the data in advance into memory, and answer these calls 
// from memory. Currently we use a large integer array, which is 	TokenNameCOMMENT_LINE	from memory. Currently we use a large integer array, which is 
// initialized when the taxonomy is opened, and potentially enlarged 	TokenNameCOMMENT_LINE	initialized when the taxonomy is opened, and potentially enlarged 
// when it is refresh()ed. 	TokenNameCOMMENT_LINE	when it is refresh()ed. 
/** * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 @lucene.experimental 
class	TokenNameclass	
ParentArray	TokenNameIdentifier	 Parent Array
{	TokenNameLBRACE	
// These arrays are not syncrhonized. Rather, the reference to the array 	TokenNameCOMMENT_LINE	These arrays are not syncrhonized. Rather, the reference to the array 
// is volatile, and the only writing operation (refreshPrefetchArrays) 	TokenNameCOMMENT_LINE	is volatile, and the only writing operation (refreshPrefetchArrays) 
// simply creates a new array and replaces the reference. The volatility 	TokenNameCOMMENT_LINE	simply creates a new array and replaces the reference. The volatility 
// of the reference ensures the correct atomic replacement and its 	TokenNameCOMMENT_LINE	of the reference ensures the correct atomic replacement and its 
// visibility properties (the content of the array is visible when the 	TokenNameCOMMENT_LINE	visibility properties (the content of the array is visible when the 
// new reference is visible). 	TokenNameCOMMENT_LINE	new reference is visible). 
private	TokenNameprivate	
volatile	TokenNamevolatile	
int	TokenNameint	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * refreshPrefetch() refreshes the parent array. Initially, it fills the * array from the positions of an appropriate posting list. If called during * a refresh(), when the arrays already exist, only values for new documents * (those beyond the last one in the array) are read from the positions and * added to the arrays (that are appropriately enlarged). We assume (and * this is indeed a correct assumption in our case) that existing categories * are never modified or deleted. */	TokenNameCOMMENT_JAVADOC	 refreshPrefetch() refreshes the parent array. Initially, it fills the array from the positions of an appropriate posting list. If called during a refresh(), when the arrays already exist, only values for new documents (those beyond the last one in the array) are read from the positions and added to the arrays (that are appropriately enlarged). We assume (and this is indeed a correct assumption in our case) that existing categories are never modified or deleted. 
void	TokenNamevoid	
refresh	TokenNameIdentifier	 refresh
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
indexReader	TokenNameIdentifier	 index Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Note that it is not necessary for us to obtain the read lock. 	TokenNameCOMMENT_LINE	Note that it is not necessary for us to obtain the read lock. 
// The reason is that we are only called from refresh() (precluding 	TokenNameCOMMENT_LINE	The reason is that we are only called from refresh() (precluding 
// another concurrent writer) or from the constructor (when no method 	TokenNameCOMMENT_LINE	another concurrent writer) or from the constructor (when no method 
// could be running). 	TokenNameCOMMENT_LINE	could be running). 
// The write lock is also not held during the following code, meaning 	TokenNameCOMMENT_LINE	The write lock is also not held during the following code, meaning 
// that reads *can* happen while this code is running. The "volatile" 	TokenNameCOMMENT_LINE	that reads *can* happen while this code is running. The "volatile" 
// property of the prefetchParentOrdinal and prefetchDepth array 	TokenNameCOMMENT_LINE	property of the prefetchParentOrdinal and prefetchDepth array 
// references ensure the correct visibility property of the assignment 	TokenNameCOMMENT_LINE	references ensure the correct visibility property of the assignment 
// but other than that, we do *not* guarantee that a reader will not 	TokenNameCOMMENT_LINE	but other than that, we do *not* guarantee that a reader will not 
// use an old version of one of these arrays (or both) while a refresh 	TokenNameCOMMENT_LINE	use an old version of one of these arrays (or both) while a refresh 
// is going on. But we find this acceptable - until a refresh has 	TokenNameCOMMENT_LINE	is going on. But we find this acceptable - until a refresh has 
// finished, the reader should not expect to see new information 	TokenNameCOMMENT_LINE	finished, the reader should not expect to see new information 
// (and the old information is the same in the old and new versions). 	TokenNameCOMMENT_LINE	(and the old information is the same in the old and new versions). 
int	TokenNameint	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
num	TokenNameIdentifier	 num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Starting Lucene 2.9, following the change LUCENE-1542, we can 	TokenNameCOMMENT_LINE	Starting Lucene 2.9, following the change LUCENE-1542, we can 
// no longer reliably read the parent "-1" (see comment in 	TokenNameCOMMENT_LINE	no longer reliably read the parent "-1" (see comment in 
// LuceneTaxonomyWriter.SinglePositionTokenStream). We have no way 	TokenNameCOMMENT_LINE	LuceneTaxonomyWriter.SinglePositionTokenStream). We have no way 
// to fix this in indexing without breaking backward-compatibility 	TokenNameCOMMENT_LINE	to fix this in indexing without breaking backward-compatibility 
// with existing indexes, so what we'll do instead is just 	TokenNameCOMMENT_LINE	with existing indexes, so what we'll do instead is just 
// hard-code the parent of ordinal 0 to be -1, and assume (as is 	TokenNameCOMMENT_LINE	hard-code the parent of ordinal 0 to be -1, and assume (as is 
// indeed the case) that no other parent can be -1. 	TokenNameCOMMENT_LINE	indeed the case) that no other parent can be -1. 
if	TokenNameif	
(	TokenNameLPAREN	
num	TokenNameIdentifier	 num
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
TaxonomyReader	TokenNameIdentifier	 Taxonomy Reader
.	TokenNameDOT	
INVALID_ORDINAL	TokenNameIdentifier	 INVALID  ORDINAL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// nothing to do - no category was added 	TokenNameCOMMENT_LINE	nothing to do - no category was added 
}	TokenNameRBRACE	
// In Java 6, we could just do Arrays.copyOf()... 	TokenNameCOMMENT_LINE	In Java 6, we could just do Arrays.copyOf()... 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newarray	TokenNameIdentifier	 newarray
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
num	TokenNameIdentifier	 num
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
=	TokenNameEQUAL	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Read the new part of the parents array from the positions: 	TokenNameCOMMENT_LINE	Read the new part of the parents array from the positions: 
TermPositions	TokenNameIdentifier	 Term Positions
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
indexReader	TokenNameIdentifier	 index Reader
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
Consts	TokenNameIdentifier	 Consts
.	TokenNameDOT	
FIELD_PAYLOADS	TokenNameIdentifier	 FIELD  PAYLOADS
,	TokenNameCOMMA	
Consts	TokenNameIdentifier	 Consts
.	TokenNameDOT	
PAYLOAD_PARENT	TokenNameIdentifier	 PAYLOAD  PARENT
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
first	TokenNameIdentifier	 first
<	TokenNameLESS	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"Missing parent data for category "	TokenNameStringLiteral	Missing parent data for category 
+	TokenNamePLUS	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note that we know positions.doc() >= i (this is an 	TokenNameCOMMENT_LINE	Note that we know positions.doc() >= i (this is an 
// invariant kept throughout this loop) 	TokenNameCOMMENT_LINE	invariant kept throughout this loop) 
if	TokenNameif	
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// shouldn't happen 	TokenNameCOMMENT_LINE	shouldn't happen 
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"Missing parent data for category "	TokenNameStringLiteral	Missing parent data for category 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO (Facet): keep a local (non-volatile) copy of the prefetchParentOrdinal 	TokenNameCOMMENT_LINE	TODO (Facet): keep a local (non-volatile) copy of the prefetchParentOrdinal 
// reference, because access to volatile reference is slower (?). 	TokenNameCOMMENT_LINE	reference, because access to volatile reference is slower (?). 
// Note: The positions we get here are one less than the position 	TokenNameCOMMENT_LINE	Note: The positions we get here are one less than the position 
// increment we added originally, so we get here the right numbers: 	TokenNameCOMMENT_LINE	increment we added originally, so we get here the right numbers: 
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
nextPosition	TokenNameIdentifier	 next Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
num	TokenNameIdentifier	 num
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"Missing parent data for category "	TokenNameStringLiteral	Missing parent data for category 
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// this shouldn't happen 	TokenNameCOMMENT_LINE	this shouldn't happen 
throw	TokenNamethrow	
new	TokenNamenew	
CorruptIndexException	TokenNameIdentifier	 Corrupt Index Exception
(	TokenNameLPAREN	
"Missing parent data for category "	TokenNameStringLiteral	Missing parent data for category 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// to be on the safe side. 	TokenNameCOMMENT_LINE	to be on the safe side. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * add() is used in LuceneTaxonomyWriter, not in LuceneTaxonomyReader. * It is only called from a synchronized method, so it is not reentrant, * and also doesn't need to worry about reads happening at the same time. * * NOTE: add() and refresh() CANNOT be used together. If you call add(), * this changes the arrays and refresh() can no longer be used. */	TokenNameCOMMENT_JAVADOC	 add() is used in LuceneTaxonomyWriter, not in LuceneTaxonomyReader. It is only called from a synchronized method, so it is not reentrant, and also doesn't need to worry about reads happening at the same time. * NOTE: add() and refresh() CANNOT be used together. If you call add(), this changes the arrays and refresh() can no longer be used. 
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
,	TokenNameCOMMA	
int	TokenNameint	
parentOrdinal	TokenNameIdentifier	 parent Ordinal
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
>=	TokenNameGREATER_EQUAL	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// grow the array, if necessary. 	TokenNameCOMMENT_LINE	grow the array, if necessary. 
// In Java 6, we could just do Arrays.copyOf()... 	TokenNameCOMMENT_LINE	In Java 6, we could just do Arrays.copyOf()... 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newarray	TokenNameIdentifier	 newarray
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newarray	TokenNameIdentifier	 newarray
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
=	TokenNameEQUAL	
newarray	TokenNameIdentifier	 newarray
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prefetchParentOrdinal	TokenNameIdentifier	 prefetch Parent Ordinal
[	TokenNameLBRACKET	
ordinal	TokenNameIdentifier	 ordinal
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parentOrdinal	TokenNameIdentifier	 parent Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
