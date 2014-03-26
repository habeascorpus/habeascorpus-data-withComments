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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicLong	TokenNameIdentifier	 Atomic Long
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
concurrent	TokenNameIdentifier	 concurrent
.	TokenNameDOT	
atomic	TokenNameIdentifier	 atomic
.	TokenNameDOT	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
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
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
;	TokenNameSEMICOLON	
/* Holds buffered deletes, by docID, term or query for a * single segment. This is used to hold buffered pending * deletes against the to-be-flushed segment. Once the * deletes are pushed (on flush in DocumentsWriter), these * deletes are converted to a FrozenDeletes instance. */	TokenNameCOMMENT_BLOCK	 Holds buffered deletes, by docID, term or query for a single segment. This is used to hold buffered pending deletes against the to-be-flushed segment. Once the deletes are pushed (on flush in DocumentsWriter), these deletes are converted to a FrozenDeletes instance. 
// NOTE: we are sync'd by BufferedDeletes, ie, all access to 	TokenNameCOMMENT_LINE	NOTE: we are sync'd by BufferedDeletes, ie, all access to 
// instances of this class is via sync'd methods on 	TokenNameCOMMENT_LINE	instances of this class is via sync'd methods on 
// BufferedDeletes 	TokenNameCOMMENT_LINE	BufferedDeletes 
class	TokenNameclass	
BufferedDeletes	TokenNameIdentifier	 Buffered Deletes
{	TokenNameLBRACE	
/* Rough logic: HashMap has an array[Entry] w/ varying load factor (say 2 * POINTER). Entry is object w/ Term key, Integer val, int hash, Entry next (OBJ_HEADER + 3*POINTER + INT). Term is object w/ String field and String text (OBJ_HEADER + 2*POINTER). We don't count Term's field since it's interned. Term's text is String (OBJ_HEADER + 4*INT + POINTER + OBJ_HEADER + string.length*CHAR). Integer is OBJ_HEADER + INT. */	TokenNameCOMMENT_BLOCK	 Rough logic: HashMap has an array[Entry] w/ varying load factor (say 2 POINTER). Entry is object w/ Term key, Integer val, int hash, Entry next (OBJ_HEADER + 3*POINTER + INT). Term is object w/ String field and String text (OBJ_HEADER + 2*POINTER). We don't count Term's field since it's interned. Term's text is String (OBJ_HEADER + 4*INT + POINTER + OBJ_HEADER + string.length*CHAR). Integer is OBJ_HEADER + INT. 
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BYTES_PER_DEL_TERM	TokenNameIdentifier	 BYTES  PER  DEL  TERM
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
+	TokenNamePLUS	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier	 NUM  BYTES  OBJECT  HEADER
+	TokenNamePLUS	
6	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
;	TokenNameSEMICOLON	
/* Rough logic: del docIDs are List<Integer>. Say list allocates ~2X size (2*POINTER). Integer is OBJ_HEADER + int */	TokenNameCOMMENT_BLOCK	 Rough logic: del docIDs are List<Integer>. Say list allocates ~2X size (2*POINTER). Integer is OBJ_HEADER + int 
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BYTES_PER_DEL_DOCID	TokenNameIdentifier	 BYTES  PER  DEL  DOCID
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
+	TokenNamePLUS	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier	 NUM  BYTES  OBJECT  HEADER
+	TokenNamePLUS	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
;	TokenNameSEMICOLON	
/* Rough logic: HashMap has an array[Entry] w/ varying load factor (say 2 * POINTER). Entry is object w/ Query key, Integer val, int hash, Entry next (OBJ_HEADER + 3*POINTER + INT). Query we often undercount (say 24 bytes). Integer is OBJ_HEADER + INT. */	TokenNameCOMMENT_BLOCK	 Rough logic: HashMap has an array[Entry] w/ varying load factor (say 2 POINTER). Entry is object w/ Query key, Integer val, int hash, Entry next (OBJ_HEADER + 3*POINTER + INT). Query we often undercount (say 24 bytes). Integer is OBJ_HEADER + INT. 
final	TokenNamefinal	
static	TokenNamestatic	
int	TokenNameint	
BYTES_PER_DEL_QUERY	TokenNameIdentifier	 BYTES  PER  DEL  QUERY
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_HEADER	TokenNameIdentifier	 NUM  BYTES  OBJECT  HEADER
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_INT	TokenNameIdentifier	 NUM  BYTES  INT
+	TokenNamePLUS	
24	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
numTermDeletes	TokenNameIdentifier	 num Term Deletes
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicInteger	TokenNameIdentifier	 Atomic Integer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
queries	TokenNameIdentifier	 queries
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Query	TokenNameIdentifier	 Query
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
docIDs	TokenNameIdentifier	 doc I Ds
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
MAX_INT	TokenNameIdentifier	 MAX  INT
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
AtomicLong	TokenNameIdentifier	 Atomic Long
bytesUsed	TokenNameIdentifier	 bytes Used
=	TokenNameEQUAL	
new	TokenNamenew	
AtomicLong	TokenNameIdentifier	 Atomic Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
boolean	TokenNameboolean	
VERBOSE_DELETES	TokenNameIdentifier	 VERBOSE  DELETES
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
long	TokenNamelong	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE_DELETES	TokenNameIdentifier	 VERBOSE  DELETES
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"gen="	TokenNameStringLiteral	gen=
+	TokenNamePLUS	
gen	TokenNameIdentifier	 gen
+	TokenNamePLUS	
" numTerms="	TokenNameStringLiteral	 numTerms=
+	TokenNamePLUS	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
+	TokenNamePLUS	
", terms="	TokenNameStringLiteral	, terms=
+	TokenNamePLUS	
terms	TokenNameIdentifier	 terms
+	TokenNamePLUS	
", queries="	TokenNameStringLiteral	, queries=
+	TokenNamePLUS	
queries	TokenNameIdentifier	 queries
+	TokenNamePLUS	
", docIDs="	TokenNameStringLiteral	, docIDs=
+	TokenNamePLUS	
docIDs	TokenNameIdentifier	 doc I Ds
+	TokenNamePLUS	
", bytesUsed="	TokenNameStringLiteral	, bytesUsed=
+	TokenNamePLUS	
bytesUsed	TokenNameIdentifier	 bytes Used
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
"gen="	TokenNameStringLiteral	gen=
+	TokenNamePLUS	
gen	TokenNameIdentifier	 gen
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" deleted terms (unique count="	TokenNameStringLiteral	 deleted terms (unique count=
+	TokenNamePLUS	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" deleted queries"	TokenNameStringLiteral	 deleted queries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" deleted docIDs"	TokenNameStringLiteral	 deleted docIDs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
+=	TokenNamePLUS_EQUAL	
" bytesUsed="	TokenNameStringLiteral	 bytesUsed=
+	TokenNamePLUS	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addQuery	TokenNameIdentifier	 add Query
(	TokenNameLPAREN	
Query	TokenNameIdentifier	 Query
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
int	TokenNameint	
docIDUpto	TokenNameIdentifier	 doc ID Upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
query	TokenNameIdentifier	 query
,	TokenNameCOMMA	
docIDUpto	TokenNameIdentifier	 doc ID Upto
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// increment bytes used only if the query wasn't added so far. 	TokenNameCOMMENT_LINE	increment bytes used only if the query wasn't added so far. 
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
BYTES_PER_DEL_QUERY	TokenNameIdentifier	 BYTES  PER  DEL  QUERY
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addDocID	TokenNameIdentifier	 add Doc ID
(	TokenNameLPAREN	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
docID	TokenNameIdentifier	 doc ID
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
BYTES_PER_DEL_DOCID	TokenNameIdentifier	 BYTES  PER  DEL  DOCID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addTerm	TokenNameIdentifier	 add Term
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
docIDUpto	TokenNameIdentifier	 doc ID Upto
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
docIDUpto	TokenNameIdentifier	 doc ID Upto
<	TokenNameLESS	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Only record the new number if it's greater than the 	TokenNameCOMMENT_LINE	Only record the new number if it's greater than the 
// current one. This is important because if multiple 	TokenNameCOMMENT_LINE	current one. This is important because if multiple 
// threads are replacing the same doc at nearly the 	TokenNameCOMMENT_LINE	threads are replacing the same doc at nearly the 
// same time, it's possible that one thread that got a 	TokenNameCOMMENT_LINE	same time, it's possible that one thread that got a 
// higher docID is scheduled before the other 	TokenNameCOMMENT_LINE	higher docID is scheduled before the other 
// threads. If we blindly replace then we can 	TokenNameCOMMENT_LINE	threads. If we blindly replace then we can 
// incorrectly get both docs indexed. 	TokenNameCOMMENT_LINE	incorrectly get both docs indexed. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
docIDUpto	TokenNameIdentifier	 doc ID Upto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
.	TokenNameDOT	
incrementAndGet	TokenNameIdentifier	 increment And Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
BYTES_PER_DEL_TERM	TokenNameIdentifier	 BYTES  PER  DEL  TERM
+	TokenNamePLUS	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
numTermDeletes	TokenNameIdentifier	 num Term Deletes
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
clearDocIDs	TokenNameIdentifier	 clear Doc I Ds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytesUsed	TokenNameIdentifier	 bytes Used
.	TokenNameDOT	
addAndGet	TokenNameIdentifier	 add And Get
(	TokenNameLPAREN	
-	TokenNameMINUS	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
BYTES_PER_DEL_DOCID	TokenNameIdentifier	 BYTES  PER  DEL  DOCID
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
any	TokenNameIdentifier	 any
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
docIDs	TokenNameIdentifier	 doc I Ds
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
queries	TokenNameIdentifier	 queries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
