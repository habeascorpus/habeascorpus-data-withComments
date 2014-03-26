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
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashSet	TokenNameIdentifier	 Hash Set
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
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Fieldable	TokenNameIdentifier	 Fieldable
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
/** * Gathers all Fieldables for a document under the same * name, updates FieldInfos, and calls per-field consumers * to process field by field. * * Currently, only a single thread visits the fields, * sequentially, for processing. */	TokenNameCOMMENT_JAVADOC	 Gathers all Fieldables for a document under the same name, updates FieldInfos, and calls per-field consumers to process field by field. * Currently, only a single thread visits the fields, sequentially, for processing. 
final	TokenNamefinal	
class	TokenNameclass	
DocFieldProcessorPerThread	TokenNameIdentifier	 Doc Field Processor Per Thread
extends	TokenNameextends	
DocConsumerPerThread	TokenNameIdentifier	 Doc Consumer Per Thread
{	TokenNameLBRACE	
float	TokenNamefloat	
docBoost	TokenNameIdentifier	 doc Boost
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldGen	TokenNameIdentifier	 field Gen
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocFieldProcessor	TokenNameIdentifier	 Doc Field Processor
docFieldProcessor	TokenNameIdentifier	 doc Field Processor
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FieldInfos	TokenNameIdentifier	 Field Infos
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocFieldConsumerPerThread	TokenNameIdentifier	 Doc Field Consumer Per Thread
consumer	TokenNameIdentifier	 consumer
;	TokenNameSEMICOLON	
// Holds all fields seen in current doc 	TokenNameCOMMENT_LINE	Holds all fields seen in current doc 
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
fieldCount	TokenNameIdentifier	 field Count
;	TokenNameSEMICOLON	
// Hash table for all fields ever seen 	TokenNameCOMMENT_LINE	Hash table for all fields ever seen 
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fieldHash	TokenNameIdentifier	 field Hash
=	TokenNameEQUAL	
new	TokenNamenew	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
hashMask	TokenNameIdentifier	 hash Mask
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
totalFieldCount	TokenNameIdentifier	 total Field Count
;	TokenNameSEMICOLON	
final	TokenNamefinal	
StoredFieldsWriterPerThread	TokenNameIdentifier	 Stored Fields Writer Per Thread
fieldsWriter	TokenNameIdentifier	 fields Writer
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocState	TokenNameIdentifier	 Doc State
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DocFieldProcessorPerThread	TokenNameIdentifier	 Doc Field Processor Per Thread
(	TokenNameLPAREN	
DocumentsWriterThreadState	TokenNameIdentifier	 Documents Writer Thread State
threadState	TokenNameIdentifier	 thread State
,	TokenNameCOMMA	
DocFieldProcessor	TokenNameIdentifier	 Doc Field Processor
docFieldProcessor	TokenNameIdentifier	 doc Field Processor
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
=	TokenNameEQUAL	
threadState	TokenNameIdentifier	 thread State
.	TokenNameDOT	
docState	TokenNameIdentifier	 doc State
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docFieldProcessor	TokenNameIdentifier	 doc Field Processor
=	TokenNameEQUAL	
docFieldProcessor	TokenNameIdentifier	 doc Field Processor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
=	TokenNameEQUAL	
docFieldProcessor	TokenNameIdentifier	 doc Field Processor
.	TokenNameDOT	
fieldInfos	TokenNameIdentifier	 field Infos
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
=	TokenNameEQUAL	
docFieldProcessor	TokenNameIdentifier	 doc Field Processor
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsWriter	TokenNameIdentifier	 fields Writer
=	TokenNameEQUAL	
docFieldProcessor	TokenNameIdentifier	 doc Field Processor
.	TokenNameDOT	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
addThread	TokenNameIdentifier	 add Thread
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Throwable	TokenNameIdentifier	 Throwable
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fieldHash	TokenNameIdentifier	 field Hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Throwable	TokenNameIdentifier	 Throwable
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
th	TokenNameIdentifier	 th
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If any errors occured, throw it. 	TokenNameCOMMENT_LINE	If any errors occured, throw it. 
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
RuntimeException	TokenNameIdentifier	 Runtime Exception
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
instanceof	TokenNameinstanceof	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
throw	TokenNamethrow	
(	TokenNameLPAREN	
Error	TokenNameIdentifier	 Error
)	TokenNameRPAREN	
th	TokenNameIdentifier	 th
;	TokenNameSEMICOLON	
// defensive code - we should not hit unchecked exceptions 	TokenNameCOMMENT_LINE	defensive code - we should not hit unchecked exceptions 
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
th	TokenNameIdentifier	 th
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
>	TokenNameGREATER	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
DocFieldConsumerPerField	TokenNameIdentifier	 Doc Field Consumer Per Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
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
fieldHash	TokenNameIdentifier	 field Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fieldHash	TokenNameIdentifier	 field Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
totalFieldCount	TokenNameIdentifier	 total Field Count
;	TokenNameSEMICOLON	
return	TokenNamereturn	
fields	TokenNameIdentifier	 fields
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** If there are fields we've seen but did not see again * in the last run, then free them up. */	TokenNameCOMMENT_JAVADOC	 If there are fields we've seen but did not see again in the last run, then free them up. 
void	TokenNamevoid	
trimFields	TokenNameIdentifier	 trim Fields
(	TokenNameLPAREN	
SegmentWriteState	TokenNameIdentifier	 Segment Write State
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fieldHash	TokenNameIdentifier	 field Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
perField	TokenNameIdentifier	 per Field
=	TokenNameEQUAL	
fieldHash	TokenNameIdentifier	 field Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
lastPerField	TokenNameIdentifier	 last Per Field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
lastGen	TokenNameIdentifier	 last Gen
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This field was not seen since the previous 	TokenNameCOMMENT_LINE	This field was not seen since the previous 
// flush, so, free up its resources now 	TokenNameCOMMENT_LINE	flush, so, free up its resources now 
// Unhash 	TokenNameCOMMENT_LINE	Unhash 
if	TokenNameif	
(	TokenNameLPAREN	
lastPerField	TokenNameIdentifier	 last Per Field
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fieldHash	TokenNameIdentifier	 field Hash
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
else	TokenNameelse	
lastPerField	TokenNameIdentifier	 last Per Field
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
state	TokenNameIdentifier	 state
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" purge field="	TokenNameStringLiteral	 purge field=
+	TokenNamePLUS	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalFieldCount	TokenNameIdentifier	 total Field Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// Reset 	TokenNameCOMMENT_LINE	Reset 
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
lastGen	TokenNameIdentifier	 last Gen
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lastPerField	TokenNameIdentifier	 last Per Field
=	TokenNameEQUAL	
perField	TokenNameIdentifier	 per Field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
perField	TokenNameIdentifier	 per Field
=	TokenNameEQUAL	
perField	TokenNameIdentifier	 per Field
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
newHashSize	TokenNameIdentifier	 new Hash Size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
fieldHash	TokenNameIdentifier	 field Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
newHashSize	TokenNameIdentifier	 new Hash Size
>	TokenNameGREATER	
fieldHash	TokenNameIdentifier	 field Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
newHashArray	TokenNameIdentifier	 new Hash Array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
[	TokenNameLBRACKET	
newHashSize	TokenNameIdentifier	 new Hash Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Rehash 	TokenNameCOMMENT_LINE	Rehash 
int	TokenNameint	
newHashMask	TokenNameIdentifier	 new Hash Mask
=	TokenNameEQUAL	
newHashSize	TokenNameIdentifier	 new Hash Size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
fieldHash	TokenNameIdentifier	 field Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
fp0	TokenNameIdentifier	 fp0
=	TokenNameEQUAL	
fieldHash	TokenNameIdentifier	 field Hash
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fp0	TokenNameIdentifier	 fp0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
hashPos2	TokenNameIdentifier	 hash Pos2
=	TokenNameEQUAL	
fp0	TokenNameIdentifier	 fp0
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
newHashMask	TokenNameIdentifier	 new Hash Mask
;	TokenNameSEMICOLON	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
nextFP0	TokenNameIdentifier	 next F P0
=	TokenNameEQUAL	
fp0	TokenNameIdentifier	 fp0
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
fp0	TokenNameIdentifier	 fp0
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
newHashArray	TokenNameIdentifier	 new Hash Array
[	TokenNameLBRACKET	
hashPos2	TokenNameIdentifier	 hash Pos2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
newHashArray	TokenNameIdentifier	 new Hash Array
[	TokenNameLBRACKET	
hashPos2	TokenNameIdentifier	 hash Pos2
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fp0	TokenNameIdentifier	 fp0
;	TokenNameSEMICOLON	
fp0	TokenNameIdentifier	 fp0
=	TokenNameEQUAL	
nextFP0	TokenNameIdentifier	 next F P0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fieldHash	TokenNameIdentifier	 field Hash
=	TokenNameEQUAL	
newHashArray	TokenNameIdentifier	 new Hash Array
;	TokenNameSEMICOLON	
hashMask	TokenNameIdentifier	 hash Mask
=	TokenNameEQUAL	
newHashMask	TokenNameIdentifier	 new Hash Mask
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
processDocument	TokenNameIdentifier	 process Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
startDocument	TokenNameIdentifier	 start Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
assert	TokenNameassert	
docFieldProcessor	TokenNameIdentifier	 doc Field Processor
.	TokenNameDOT	
docWriter	TokenNameIdentifier	 doc Writer
.	TokenNameDOT	
writer	TokenNameIdentifier	 writer
.	TokenNameDOT	
testPoint	TokenNameIdentifier	 test Point
(	TokenNameLPAREN	
"DocumentsWriter.ThreadState.init start"	TokenNameStringLiteral	DocumentsWriter.ThreadState.init start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldCount	TokenNameIdentifier	 field Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
thisFieldGen	TokenNameIdentifier	 this Field Gen
=	TokenNameEQUAL	
fieldGen	TokenNameIdentifier	 field Gen
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Fieldable	TokenNameIdentifier	 Fieldable
>	TokenNameGREATER	
docFields	TokenNameIdentifier	 doc Fields
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
getFields	TokenNameIdentifier	 get Fields
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
numDocFields	TokenNameIdentifier	 num Doc Fields
=	TokenNameEQUAL	
docFields	TokenNameIdentifier	 doc Fields
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Absorb any new fields first seen in this document. 	TokenNameCOMMENT_LINE	Absorb any new fields first seen in this document. 
// Also absorb any changes to fields we had already 	TokenNameCOMMENT_LINE	Also absorb any changes to fields we had already 
// seen before (eg suddenly turning on norms or 	TokenNameCOMMENT_LINE	seen before (eg suddenly turning on norms or 
// vectors, etc.): 	TokenNameCOMMENT_LINE	vectors, etc.): 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
numDocFields	TokenNameIdentifier	 num Doc Fields
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Fieldable	TokenNameIdentifier	 Fieldable
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
docFields	TokenNameIdentifier	 doc Fields
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make sure we have a PerField allocated 	TokenNameCOMMENT_LINE	Make sure we have a PerField allocated 
final	TokenNamefinal	
int	TokenNameint	
hashPos	TokenNameIdentifier	 hash Pos
=	TokenNameEQUAL	
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&	TokenNameAND	
hashMask	TokenNameIdentifier	 hash Mask
;	TokenNameSEMICOLON	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
fieldHash	TokenNameIdentifier	 field Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO FI: we need to genericize the "flags" that a 	TokenNameCOMMENT_LINE	TODO FI: we need to genericize the "flags" that a 
// field holds, and, how these flags are merged; it 	TokenNameCOMMENT_LINE	field holds, and, how these flags are merged; it 
// needs to be more "pluggable" such that if I want 	TokenNameCOMMENT_LINE	needs to be more "pluggable" such that if I want 
// to have a new "thing" my Fields can do, I can 	TokenNameCOMMENT_LINE	to have a new "thing" my Fields can do, I can 
// easily add it 	TokenNameCOMMENT_LINE	easily add it 
FieldInfo	TokenNameIdentifier	 Field Info
fi	TokenNameIdentifier	 fi
=	TokenNameEQUAL	
fieldInfos	TokenNameIdentifier	 field Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isTermVectorStored	TokenNameIdentifier	 is Term Vector Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getOmitNorms	TokenNameIdentifier	 get Omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getIndexOptions	TokenNameIdentifier	 get Index Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fp	TokenNameIdentifier	 fp
=	TokenNameEQUAL	
new	TokenNamenew	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
fi	TokenNameIdentifier	 fi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
fieldHash	TokenNameIdentifier	 field Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
fieldHash	TokenNameIdentifier	 field Hash
[	TokenNameLBRACKET	
hashPos	TokenNameIdentifier	 hash Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
;	TokenNameSEMICOLON	
totalFieldCount	TokenNameIdentifier	 total Field Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
totalFieldCount	TokenNameIdentifier	 total Field Count
>=	TokenNameGREATER_EQUAL	
fieldHash	TokenNameIdentifier	 field Hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
update	TokenNameIdentifier	 update
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isIndexed	TokenNameIdentifier	 is Indexed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isTermVectorStored	TokenNameIdentifier	 is Term Vector Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getOmitNorms	TokenNameIdentifier	 get Omit Norms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
getIndexOptions	TokenNameIdentifier	 get Index Options
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
thisFieldGen	TokenNameIdentifier	 this Field Gen
!=	TokenNameNOT_EQUAL	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
lastGen	TokenNameIdentifier	 last Gen
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time we're seeing this field for this doc 	TokenNameCOMMENT_LINE	First time we're seeing this field for this doc 
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fieldCount	TokenNameIdentifier	 field Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fieldCount	TokenNameIdentifier	 field Count
==	TokenNameEQUAL_EQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
newSize	TokenNameIdentifier	 new Size
=	TokenNameEQUAL	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
newArray	TokenNameIdentifier	 new Array
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
[	TokenNameLBRACKET	
newSize	TokenNameIdentifier	 new Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
fieldCount	TokenNameIdentifier	 field Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fp	TokenNameIdentifier	 fp
;	TokenNameSEMICOLON	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
lastGen	TokenNameIdentifier	 last Gen
=	TokenNameEQUAL	
thisFieldGen	TokenNameIdentifier	 this Field Gen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fieldCount	TokenNameIdentifier	 field Count
==	TokenNameEQUAL_EQUAL	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
Fieldable	TokenNameIdentifier	 Fieldable
[	TokenNameLBRACKET	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fieldCount	TokenNameIdentifier	 field Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
isStored	TokenNameIdentifier	 is Stored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
addField	TokenNameIdentifier	 add Field
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
fp	TokenNameIdentifier	 fp
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// If we are writing vectors then we must visit 	TokenNameCOMMENT_LINE	If we are writing vectors then we must visit 
// fields in sorted order so they are written in 	TokenNameCOMMENT_LINE	fields in sorted order so they are written in 
// sorted order. TODO: we actually only need to 	TokenNameCOMMENT_LINE	sorted order. TODO: we actually only need to 
// sort the subset of fields that have vectors 	TokenNameCOMMENT_LINE	sort the subset of fields that have vectors 
// enabled; we could save [small amount of] CPU 	TokenNameCOMMENT_LINE	enabled; we could save [small amount of] CPU 
// here. 	TokenNameCOMMENT_LINE	here. 
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
quickSort	TokenNameIdentifier	 quick Sort
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fieldCount	TokenNameIdentifier	 field Count
,	TokenNameCOMMA	
fieldsComp	TokenNameIdentifier	 fields Comp
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
fieldCount	TokenNameIdentifier	 field Count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
processFields	TokenNameIdentifier	 process Fields
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fields	TokenNameIdentifier	 fields
,	TokenNameCOMMA	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
fieldCount	TokenNameIdentifier	 field Count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
maxTermPrefix	TokenNameIdentifier	 max Term Prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
infoStream	TokenNameIdentifier	 info Stream
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"WARNING: document contains at least one immense term (longer than the max length "	TokenNameStringLiteral	WARNING: document contains at least one immense term (longer than the max length 
+	TokenNamePLUS	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
MAX_TERM_LENGTH	TokenNameIdentifier	 MAX  TERM  LENGTH
+	TokenNamePLUS	
"), all of which were skipped. Please correct the analyzer to not produce such terms. The prefix of the first immense term is: '"	TokenNameStringLiteral	), all of which were skipped. Please correct the analyzer to not produce such terms. The prefix of the first immense term is: '
+	TokenNamePLUS	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
maxTermPrefix	TokenNameIdentifier	 max Term Prefix
+	TokenNamePLUS	
"...'"	TokenNameStringLiteral	...'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
maxTermPrefix	TokenNameIdentifier	 max Term Prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
fieldsWriter	TokenNameIdentifier	 fields Writer
.	TokenNameDOT	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
two	TokenNameIdentifier	 two
=	TokenNameEQUAL	
consumer	TokenNameIdentifier	 consumer
.	TokenNameDOT	
finishDocument	TokenNameIdentifier	 finish Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
one	TokenNameIdentifier	 one
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
two	TokenNameIdentifier	 two
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
two	TokenNameIdentifier	 two
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
PerDoc	TokenNameIdentifier	 Per Doc
both	TokenNameIdentifier	 both
=	TokenNameEQUAL	
getPerDoc	TokenNameIdentifier	 get Per Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
both	TokenNameIdentifier	 both
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
=	TokenNameEQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
assert	TokenNameassert	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
==	TokenNameEQUAL_EQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
assert	TokenNameassert	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
==	TokenNameEQUAL_EQUAL	
docState	TokenNameIdentifier	 doc State
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
;	TokenNameSEMICOLON	
both	TokenNameIdentifier	 both
.	TokenNameDOT	
one	TokenNameIdentifier	 one
=	TokenNameEQUAL	
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
both	TokenNameIdentifier	 both
.	TokenNameDOT	
two	TokenNameIdentifier	 two
=	TokenNameEQUAL	
two	TokenNameIdentifier	 two
;	TokenNameSEMICOLON	
return	TokenNamereturn	
both	TokenNameIdentifier	 both
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
>	TokenNameGREATER	
fieldsComp	TokenNameIdentifier	 fields Comp
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
DocFieldProcessorPerField	TokenNameIdentifier	 Doc Field Processor Per Field
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
fieldInfo	TokenNameIdentifier	 field Info
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
PerDoc	TokenNameIdentifier	 Per Doc
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docFreeList	TokenNameIdentifier	 doc Free List
=	TokenNameEQUAL	
new	TokenNamenew	
PerDoc	TokenNameIdentifier	 Per Doc
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
freeCount	TokenNameIdentifier	 free Count
;	TokenNameSEMICOLON	
int	TokenNameint	
allocCount	TokenNameIdentifier	 alloc Count
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
PerDoc	TokenNameIdentifier	 Per Doc
getPerDoc	TokenNameIdentifier	 get Per Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
freeCount	TokenNameIdentifier	 free Count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
allocCount	TokenNameIdentifier	 alloc Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
allocCount	TokenNameIdentifier	 alloc Count
>	TokenNameGREATER	
docFreeList	TokenNameIdentifier	 doc Free List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Grow our free list up front to make sure we have 	TokenNameCOMMENT_LINE	Grow our free list up front to make sure we have 
// enough space to recycle all outstanding PerDoc 	TokenNameCOMMENT_LINE	enough space to recycle all outstanding PerDoc 
// instances 	TokenNameCOMMENT_LINE	instances 
assert	TokenNameassert	
allocCount	TokenNameIdentifier	 alloc Count
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
docFreeList	TokenNameIdentifier	 doc Free List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
docFreeList	TokenNameIdentifier	 doc Free List
=	TokenNameEQUAL	
new	TokenNamenew	
PerDoc	TokenNameIdentifier	 Per Doc
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
allocCount	TokenNameIdentifier	 alloc Count
,	TokenNameCOMMA	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_OBJECT_REF	TokenNameIdentifier	 NUM  BYTES  OBJECT  REF
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PerDoc	TokenNameIdentifier	 Per Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
docFreeList	TokenNameIdentifier	 doc Free List
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
freeCount	TokenNameIdentifier	 free Count
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
freePerDoc	TokenNameIdentifier	 free Per Doc
(	TokenNameLPAREN	
PerDoc	TokenNameIdentifier	 Per Doc
perDoc	TokenNameIdentifier	 per Doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
freeCount	TokenNameIdentifier	 free Count
<	TokenNameLESS	
docFreeList	TokenNameIdentifier	 doc Free List
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
docFreeList	TokenNameIdentifier	 doc Free List
[	TokenNameLBRACKET	
freeCount	TokenNameIdentifier	 free Count
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
perDoc	TokenNameIdentifier	 per Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
class	TokenNameclass	
PerDoc	TokenNameIdentifier	 Per Doc
extends	TokenNameextends	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
{	TokenNameLBRACE	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
one	TokenNameIdentifier	 one
;	TokenNameSEMICOLON	
DocumentsWriter	TokenNameIdentifier	 Documents Writer
.	TokenNameDOT	
DocWriter	TokenNameIdentifier	 Doc Writer
two	TokenNameIdentifier	 two
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
long	TokenNamelong	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
sizeInBytes	TokenNameIdentifier	 size In Bytes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
freePerDoc	TokenNameIdentifier	 free Per Doc
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
one	TokenNameIdentifier	 one
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
two	TokenNameIdentifier	 two
.	TokenNameDOT	
abort	TokenNameIdentifier	 abort
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
freePerDoc	TokenNameIdentifier	 free Per Doc
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
