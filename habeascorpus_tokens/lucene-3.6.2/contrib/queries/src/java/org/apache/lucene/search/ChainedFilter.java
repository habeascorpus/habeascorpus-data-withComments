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
DocIdSet	TokenNameIdentifier	 Doc Id Set
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
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
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
Filter	TokenNameIdentifier	 Filter
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
OpenBitSet	TokenNameIdentifier	 Open Bit Set
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
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
;	TokenNameSEMICOLON	
/** * <p> * Allows multiple {@link Filter}s to be chained. * Logical operations such as <b>NOT</b> and <b>XOR</b> * are applied between filters. One operation can be used * for all filters, or a specific operation can be declared * for each filter. * </p> * <p> * Order in which filters are called depends on * the position of the filter in the chain. It's probably * more efficient to place the most restrictive filters * /least computationally-intensive filters first. * </p> * */	TokenNameCOMMENT_JAVADOC	 <p> Allows multiple {@link Filter}s to be chained. Logical operations such as <b>NOT</b> and <b>XOR</b> are applied between filters. One operation can be used for all filters, or a specific operation can be declared for each filter. </p> <p> Order in which filters are called depends on the position of the filter in the chain. It's probably more efficient to place the most restrictive filters /least computationally-intensive filters first. </p> 
public	TokenNamepublic	
class	TokenNameclass	
ChainedFilter	TokenNameIdentifier	 Chained Filter
extends	TokenNameextends	
Filter	TokenNameIdentifier	 Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
OR	TokenNameIdentifier	 OR
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
AND	TokenNameIdentifier	 AND
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ANDNOT	TokenNameIdentifier	 ANDNOT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
XOR	TokenNameIdentifier	 XOR
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Logical operation when none is declared. Defaults to * OR. */	TokenNameCOMMENT_JAVADOC	 Logical operation when none is declared. Defaults to OR. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
DEFAULT	TokenNameIdentifier	 DEFAULT
=	TokenNameEQUAL	
OR	TokenNameIdentifier	 OR
;	TokenNameSEMICOLON	
/** The filter chain */	TokenNameCOMMENT_JAVADOC	 The filter chain 
private	TokenNameprivate	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chain	TokenNameIdentifier	 chain
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logicArray	TokenNameIdentifier	 logic Array
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
logic	TokenNameIdentifier	 logic
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Ctor. * @param chain The chain of filters */	TokenNameCOMMENT_JAVADOC	 Ctor. @param chain The chain of filters 
public	TokenNamepublic	
ChainedFilter	TokenNameIdentifier	 Chained Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chain	TokenNameIdentifier	 chain
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chain	TokenNameIdentifier	 chain
=	TokenNameEQUAL	
chain	TokenNameIdentifier	 chain
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ctor. * @param chain The chain of filters * @param logicArray Logical operations to apply between filters */	TokenNameCOMMENT_JAVADOC	 Ctor. @param chain The chain of filters @param logicArray Logical operations to apply between filters 
public	TokenNamepublic	
ChainedFilter	TokenNameIdentifier	 Chained Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chain	TokenNameIdentifier	 chain
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logicArray	TokenNameIdentifier	 logic Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chain	TokenNameIdentifier	 chain
=	TokenNameEQUAL	
chain	TokenNameIdentifier	 chain
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
logicArray	TokenNameIdentifier	 logic Array
=	TokenNameEQUAL	
logicArray	TokenNameIdentifier	 logic Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ctor. * @param chain The chain of filters * @param logic Logical operation to apply to ALL filters */	TokenNameCOMMENT_JAVADOC	 Ctor. @param chain The chain of filters @param logic Logical operation to apply to ALL filters 
public	TokenNamepublic	
ChainedFilter	TokenNameIdentifier	 Chained Filter
(	TokenNameLPAREN	
Filter	TokenNameIdentifier	 Filter
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chain	TokenNameIdentifier	 chain
,	TokenNameCOMMA	
int	TokenNameint	
logic	TokenNameIdentifier	 logic
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chain	TokenNameIdentifier	 chain
=	TokenNameEQUAL	
chain	TokenNameIdentifier	 chain
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
logic	TokenNameIdentifier	 logic
=	TokenNameEQUAL	
logic	TokenNameIdentifier	 logic
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * {@link Filter#getDocIdSet}. */	TokenNameCOMMENT_JAVADOC	 {@link Filter#getDocIdSet}. 
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
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// use array as reference to modifiable int; 	TokenNameCOMMENT_LINE	use array as reference to modifiable int; 
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// an object attribute would not be thread safe. 	TokenNameCOMMENT_LINE	an object attribute would not be thread safe. 
if	TokenNameif	
(	TokenNameLPAREN	
logic	TokenNameIdentifier	 logic
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
logic	TokenNameIdentifier	 logic
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logicArray	TokenNameIdentifier	 logic Array
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
logicArray	TokenNameIdentifier	 logic Array
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
DEFAULT	TokenNameIdentifier	 DEFAULT
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
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
DocIdSet	TokenNameIdentifier	 Doc Id Set
docIdSet	TokenNameIdentifier	 doc Id Set
=	TokenNameEQUAL	
filter	TokenNameIdentifier	 filter
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docIdSet	TokenNameIdentifier	 doc Id Set
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
docIdSet	TokenNameIdentifier	 doc Id Set
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
initialResult	TokenNameIdentifier	 initial Result
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
logic	TokenNameIdentifier	 logic
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
/** * First AND operation takes place against a completely false * bitset and will always return zero results. */	TokenNameCOMMENT_JAVADOC	 First AND operation takes place against a completely false bitset and will always return zero results. 
if	TokenNameif	
(	TokenNameLPAREN	
logic	TokenNameIdentifier	 logic
==	TokenNameEQUAL_EQUAL	
AND	TokenNameIdentifier	 AND
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
(	TokenNameLPAREN	
getDISI	TokenNameIdentifier	 get DISI
(	TokenNameLPAREN	
chain	TokenNameIdentifier	 chain
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
logic	TokenNameIdentifier	 logic
==	TokenNameEQUAL_EQUAL	
ANDNOT	TokenNameIdentifier	 ANDNOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
(	TokenNameLPAREN	
getDISI	TokenNameIdentifier	 get DISI
(	TokenNameLPAREN	
chain	TokenNameIdentifier	 chain
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
flip	TokenNameIdentifier	 flip
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
// NOTE: may set bits for deleted docs. 	TokenNameCOMMENT_LINE	NOTE: may set bits for deleted docs. 
++	TokenNamePLUS_PLUS	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Provide a SortedVIntList when it is definitely * smaller than an OpenBitSet * @deprecated Either use CachingWrapperFilter, or * switch to a different DocIdSet implementation yourself. * This method will be removed in Lucene 4.0 **/	TokenNameCOMMENT_JAVADOC	 Provide a SortedVIntList when it is definitely smaller than an OpenBitSet @deprecated Either use CachingWrapperFilter, or switch to a different DocIdSet implementation yourself. This method will be removed in Lucene 4.0 *
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
protected	TokenNameprotected	
final	TokenNamefinal	
DocIdSet	TokenNameIdentifier	 Doc Id Set
finalResult	TokenNameIdentifier	 final Result
(	TokenNameLPAREN	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
int	TokenNameint	
maxDocs	TokenNameIdentifier	 max Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to each filter in the chain. * @param reader IndexReader * @param logic Logical operation * @return DocIdSet */	TokenNameCOMMENT_JAVADOC	 Delegates to each filter in the chain. @param reader IndexReader @param logic Logical operation @return DocIdSet 
private	TokenNameprivate	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
logic	TokenNameIdentifier	 logic
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
initialResult	TokenNameIdentifier	 initial Result
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
logic	TokenNameIdentifier	 logic
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
chain	TokenNameIdentifier	 chain
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doChain	TokenNameIdentifier	 do Chain
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
logic	TokenNameIdentifier	 logic
,	TokenNameCOMMA	
chain	TokenNameIdentifier	 chain
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
finalResult	TokenNameIdentifier	 final Result
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Delegates to each filter in the chain. * @param reader IndexReader * @param logic Logical operation * @return DocIdSet */	TokenNameCOMMENT_JAVADOC	 Delegates to each filter in the chain. @param reader IndexReader @param logic Logical operation @return DocIdSet 
private	TokenNameprivate	
DocIdSet	TokenNameIdentifier	 Doc Id Set
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
logic	TokenNameIdentifier	 logic
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
logic	TokenNameIdentifier	 logic
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
chain	TokenNameIdentifier	 chain
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Invalid number of elements in logic array"	TokenNameStringLiteral	Invalid number of elements in logic array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
initialResult	TokenNameIdentifier	 initial Result
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
logic	TokenNameIdentifier	 logic
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
<	TokenNameLESS	
chain	TokenNameIdentifier	 chain
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doChain	TokenNameIdentifier	 do Chain
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
logic	TokenNameIdentifier	 logic
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
chain	TokenNameIdentifier	 chain
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
.	TokenNameDOT	
getDocIdSet	TokenNameIdentifier	 get Doc Id Set
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
finalResult	TokenNameIdentifier	 final Result
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"ChainedFilter: ["	TokenNameStringLiteral	ChainedFilter: [
)	TokenNameRPAREN	
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
chain	TokenNameIdentifier	 chain
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chain	TokenNameIdentifier	 chain
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
doChain	TokenNameIdentifier	 do Chain
(	TokenNameLPAREN	
OpenBitSetDISI	TokenNameIdentifier	 Open Bit Set DISI
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
int	TokenNameint	
logic	TokenNameIdentifier	 logic
,	TokenNameCOMMA	
DocIdSet	TokenNameIdentifier	 Doc Id Set
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
instanceof	TokenNameinstanceof	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// optimized case for OpenBitSets 	TokenNameCOMMENT_LINE	optimized case for OpenBitSets 
switch	TokenNameswitch	
(	TokenNameLPAREN	
logic	TokenNameIdentifier	 logic
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
OR	TokenNameIdentifier	 OR
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
or	TokenNameIdentifier	 or
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AND	TokenNameIdentifier	 AND
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
and	TokenNameIdentifier	 and
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ANDNOT	TokenNameIdentifier	 ANDNOT
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
andNot	TokenNameIdentifier	 and Not
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XOR	TokenNameIdentifier	 XOR
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
xor	TokenNameIdentifier	 xor
(	TokenNameLPAREN	
(	TokenNameLPAREN	
OpenBitSet	TokenNameIdentifier	 Open Bit Set
)	TokenNameRPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
doChain	TokenNameIdentifier	 do Chain
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
DEFAULT	TokenNameIdentifier	 DEFAULT
,	TokenNameCOMMA	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
DocIdSetIterator	TokenNameIdentifier	 Doc Id Set Iterator
disi	TokenNameIdentifier	 disi
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
disi	TokenNameIdentifier	 disi
=	TokenNameEQUAL	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
disi	TokenNameIdentifier	 disi
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
disi	TokenNameIdentifier	 disi
=	TokenNameEQUAL	
DocIdSet	TokenNameIdentifier	 Doc Id Set
.	TokenNameDOT	
EMPTY_DOCIDSET	TokenNameIdentifier	 EMPTY  DOCIDSET
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
logic	TokenNameIdentifier	 logic
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
OR	TokenNameIdentifier	 OR
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
inPlaceOr	TokenNameIdentifier	 in Place Or
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
AND	TokenNameIdentifier	 AND
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
inPlaceAnd	TokenNameIdentifier	 in Place And
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ANDNOT	TokenNameIdentifier	 ANDNOT
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
inPlaceNot	TokenNameIdentifier	 in Place Not
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
XOR	TokenNameIdentifier	 XOR
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
inPlaceXor	TokenNameIdentifier	 in Place Xor
(	TokenNameLPAREN	
disi	TokenNameIdentifier	 disi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
doChain	TokenNameIdentifier	 do Chain
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
DEFAULT	TokenNameIdentifier	 DEFAULT
,	TokenNameCOMMA	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
