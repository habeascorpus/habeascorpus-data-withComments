package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Map	TokenNameIdentifier	 Map
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
Query	TokenNameIdentifier	 Query
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
ArrayUtil	TokenNameIdentifier	 Array Util
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
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
BufferedDeletesStream	TokenNameIdentifier	 Buffered Deletes Stream
.	TokenNameDOT	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
;	TokenNameSEMICOLON	
/** Holds buffered deletes by term or query, once pushed. * Pushed deletes are write-once, so we shift to more * memory efficient data structure to hold them. We don't * hold docIDs because these are applied on flush. */	TokenNameCOMMENT_JAVADOC	 Holds buffered deletes by term or query, once pushed. Pushed deletes are write-once, so we shift to more memory efficient data structure to hold them. We don't hold docIDs because these are applied on flush. 
class	TokenNameclass	
FrozenBufferedDeletes	TokenNameIdentifier	 Frozen Buffered Deletes
{	TokenNameLBRACE	
/* Query we often undercount (say 24 bytes), plus int. */	TokenNameCOMMENT_BLOCK	 Query we often undercount (say 24 bytes), plus int. 
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BYTES_PER_DEL_QUERY	TokenNameIdentifier	 BYTES  PER  DEL  QUERY
=	TokenNameEQUAL	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
+	TokenNamePLUS	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
+	TokenNamePLUS	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Terms, in sorted order: 	TokenNameCOMMENT_LINE	Terms, in sorted order: 
final	TokenNamefinal	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
int	TokenNameint	
termCount	TokenNameIdentifier	 term Count
;	TokenNameSEMICOLON	
// just for debugging 	TokenNameCOMMENT_LINE	just for debugging 
// Parallel array of deleted query, and the docIDUpto for 	TokenNameCOMMENT_LINE	Parallel array of deleted query, and the docIDUpto for 
// each 	TokenNameCOMMENT_LINE	each 
final	TokenNamefinal	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
queries	TokenNameIdentifier	 queries
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
queryLimits	TokenNameIdentifier	 query Limits
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FrozenBufferedDeletes	TokenNameIdentifier	 Frozen Buffered Deletes
(	TokenNameLPAREN	
BufferedDeletes	TokenNameIdentifier	 Buffered Deletes
deletes	TokenNameIdentifier	 deletes
,	TokenNameCOMMA	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
termsArray	TokenNameIdentifier	 terms Array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termCount	TokenNameIdentifier	 term Count
=	TokenNameEQUAL	
termsArray	TokenNameIdentifier	 terms Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
termsArray	TokenNameIdentifier	 terms Array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
builder	TokenNameIdentifier	 builder
=	TokenNameEQUAL	
new	TokenNamenew	
PrefixCodedTerms	TokenNameIdentifier	 Prefix Coded Terms
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
:	TokenNameCOLON	
termsArray	TokenNameIdentifier	 terms Array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
builder	TokenNameIdentifier	 builder
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queries	TokenNameIdentifier	 queries
=	TokenNameEQUAL	
new	TokenNamenew	
Query	TokenNameIdentifier	 Query
[	TokenNameLBRACKET	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
queryLimits	TokenNameIdentifier	 query Limits
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
ent	TokenNameIdentifier	 ent
:	TokenNameCOLON	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queries	TokenNameIdentifier	 queries
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryLimits	TokenNameIdentifier	 query Limits
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
getSizeInBytes	TokenNameIdentifier	 get Size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
BYTES_PER_DEL_QUERY	TokenNameIdentifier	 BYTES  PER  DEL  QUERY
;	TokenNameSEMICOLON	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
=	TokenNameEQUAL	
deletes	TokenNameIdentifier	 deletes
.	TokenNameDOT	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gen	TokenNameIdentifier	 gen
=	TokenNameEQUAL	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
termsIterable	TokenNameIdentifier	 terms Iterable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// @Override -- not until Java 1.6 	TokenNameCOMMENT_LINE	@Override -- not until Java 1.6 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
>	TokenNameGREATER	
queriesIterable	TokenNameIdentifier	 queries Iterable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// @Override -- not until Java 1.6 	TokenNameCOMMENT_LINE	@Override -- not until Java 1.6 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
// @Override -- not until Java 1.6 	TokenNameCOMMENT_LINE	@Override -- not until Java 1.6 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
upto	TokenNameIdentifier	 upto
<	TokenNameLESS	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// @Override -- not until Java 1.6 	TokenNameCOMMENT_LINE	@Override -- not until Java 1.6 
public	TokenNamepublic	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
QueryAndLimit	TokenNameIdentifier	 Query And Limit
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
queryLimits	TokenNameIdentifier	 query Limits
[	TokenNameLBRACKET	
upto	TokenNameIdentifier	 upto
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// @Override -- not until Java 1.6 	TokenNameCOMMENT_LINE	@Override -- not until Java 1.6 
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
+	TokenNamePLUS	
" deleted terms (unique count="	TokenNameStringLiteral	 deleted terms (unique count=
+	TokenNamePLUS	
termCount	TokenNameIdentifier	 term Count
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
" deleted queries"	TokenNameStringLiteral	 deleted queries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytesUsed	TokenNameIdentifier	 bytes Used
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
" bytesUsed="	TokenNameStringLiteral	 bytesUsed=
+	TokenNamePLUS	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termCount	TokenNameIdentifier	 term Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
