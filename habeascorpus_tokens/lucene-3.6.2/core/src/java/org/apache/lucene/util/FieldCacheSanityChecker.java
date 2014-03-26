package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Copyright 2009 The Apache Software Foundation * * Licensed under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Copyright 2009 The Apache Software Foundation * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Collection	TokenNameIdentifier	 Collection
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
FieldCache	TokenNameIdentifier	 Field Cache
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
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
CacheEntry	TokenNameIdentifier	 Cache Entry
;	TokenNameSEMICOLON	
/** * Provides methods for sanity checking that entries in the FieldCache * are not wasteful or inconsistent. * </p> * <p> * Lucene 2.9 Introduced numerous enhancements into how the FieldCache * is used by the low levels of Lucene searching (for Sorting and * ValueSourceQueries) to improve both the speed for Sorting, as well * as reopening of IndexReaders. But these changes have shifted the * usage of FieldCache from "top level" IndexReaders (frequently a * MultiReader or DirectoryReader) down to the leaf level SegmentReaders. * As a result, existing applications that directly access the FieldCache * may find RAM usage increase significantly when upgrading to 2.9 or * Later. This class provides an API for these applications (or their * Unit tests) to check at run time if the FieldCache contains "insane" * usages of the FieldCache. * </p> * @lucene.experimental * @see FieldCache * @see FieldCacheSanityChecker.Insanity * @see FieldCacheSanityChecker.InsanityType */	TokenNameCOMMENT_JAVADOC	 Provides methods for sanity checking that entries in the FieldCache are not wasteful or inconsistent. </p> <p> Lucene 2.9 Introduced numerous enhancements into how the FieldCache is used by the low levels of Lucene searching (for Sorting and ValueSourceQueries) to improve both the speed for Sorting, as well as reopening of IndexReaders. But these changes have shifted the usage of FieldCache from "top level" IndexReaders (frequently a MultiReader or DirectoryReader) down to the leaf level SegmentReaders. As a result, existing applications that directly access the FieldCache may find RAM usage increase significantly when upgrading to 2.9 or Later. This class provides an API for these applications (or their Unit tests) to check at run time if the FieldCache contains "insane" usages of the FieldCache. </p> @lucene.experimental @see FieldCache @see FieldCacheSanityChecker.Insanity @see FieldCacheSanityChecker.InsanityType 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
{	TokenNameLBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
estimateRam	TokenNameIdentifier	 estimate Ram
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/* NOOP */	TokenNameCOMMENT_BLOCK	 NOOP 
}	TokenNameRBRACE	
/** * If set, estimate size for all CacheEntry objects will be calculateed. */	TokenNameCOMMENT_JAVADOC	 If set, estimate size for all CacheEntry objects will be calculateed. 
public	TokenNamepublic	
void	TokenNamevoid	
setRamUsageEstimator	TokenNameIdentifier	 set Ram Usage Estimator
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
estimateRam	TokenNameIdentifier	 estimate Ram
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Quick and dirty convenience method * @see #check */	TokenNameCOMMENT_JAVADOC	 Quick and dirty convenience method @see #check 
public	TokenNamepublic	
static	TokenNamestatic	
Insanity	TokenNameIdentifier	 Insanity
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
checkSanity	TokenNameIdentifier	 check Sanity
(	TokenNameLPAREN	
FieldCache	TokenNameIdentifier	 Field Cache
cache	TokenNameIdentifier	 cache
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
checkSanity	TokenNameIdentifier	 check Sanity
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Quick and dirty convenience method that instantiates an instance with * "good defaults" and uses it to test the CacheEntrys * @see #check */	TokenNameCOMMENT_JAVADOC	 Quick and dirty convenience method that instantiates an instance with "good defaults" and uses it to test the CacheEntrys @see #check 
public	TokenNamepublic	
static	TokenNamestatic	
Insanity	TokenNameIdentifier	 Insanity
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
checkSanity	TokenNameIdentifier	 check Sanity
(	TokenNameLPAREN	
CacheEntry	TokenNameIdentifier	 Cache Entry
...	TokenNameELLIPSIS	
cacheEntries	TokenNameIdentifier	 cache Entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
sanityChecker	TokenNameIdentifier	 sanity Checker
=	TokenNameEQUAL	
new	TokenNamenew	
FieldCacheSanityChecker	TokenNameIdentifier	 Field Cache Sanity Checker
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sanityChecker	TokenNameIdentifier	 sanity Checker
.	TokenNameDOT	
setRamUsageEstimator	TokenNameIdentifier	 set Ram Usage Estimator
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sanityChecker	TokenNameIdentifier	 sanity Checker
.	TokenNameDOT	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
cacheEntries	TokenNameIdentifier	 cache Entries
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tests a CacheEntry[] for indication of "insane" cache usage. * <p> * <B>NOTE:</b>FieldCache CreationPlaceholder objects are ignored. * (:TODO: is this a bad idea? are we masking a real problem?) * </p> */	TokenNameCOMMENT_JAVADOC	 Tests a CacheEntry[] for indication of "insane" cache usage. <p> <B>NOTE:</b>FieldCache CreationPlaceholder objects are ignored. (:TODO: is this a bad idea? are we masking a real problem?) </p> 
public	TokenNamepublic	
Insanity	TokenNameIdentifier	 Insanity
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
check	TokenNameIdentifier	 check
(	TokenNameLPAREN	
CacheEntry	TokenNameIdentifier	 Cache Entry
...	TokenNameELLIPSIS	
cacheEntries	TokenNameIdentifier	 cache Entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
cacheEntries	TokenNameIdentifier	 cache Entries
||	TokenNameOR_OR	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
cacheEntries	TokenNameIdentifier	 cache Entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Insanity	TokenNameIdentifier	 Insanity
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
estimateRam	TokenNameIdentifier	 estimate Ram
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
cacheEntries	TokenNameIdentifier	 cache Entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cacheEntries	TokenNameIdentifier	 cache Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
estimateSize	TokenNameIdentifier	 estimate Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// the indirect mapping lets MapOfSet dedup identical valIds for us 	TokenNameCOMMENT_LINE	the indirect mapping lets MapOfSet dedup identical valIds for us 
// 	TokenNameCOMMENT_LINE	 
// maps the (valId) identityhashCode of cache values to 	TokenNameCOMMENT_LINE	maps the (valId) identityhashCode of cache values to 
// sets of CacheEntry instances 	TokenNameCOMMENT_LINE	sets of CacheEntry instances 
final	TokenNamefinal	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
CacheEntry	TokenNameIdentifier	 Cache Entry
>	TokenNameGREATER	
valIdToItems	TokenNameIdentifier	 val Id To Items
=	TokenNameEQUAL	
new	TokenNamenew	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
CacheEntry	TokenNameIdentifier	 Cache Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
CacheEntry	TokenNameIdentifier	 Cache Entry
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// maps ReaderField keys to Sets of ValueIds 	TokenNameCOMMENT_LINE	maps ReaderField keys to Sets of ValueIds 
final	TokenNamefinal	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
readerFieldToValIds	TokenNameIdentifier	 reader Field To Val Ids
=	TokenNameEQUAL	
new	TokenNamenew	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// any keys that we know result in more then one valId 	TokenNameCOMMENT_LINE	any keys that we know result in more then one valId 
final	TokenNamefinal	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// iterate over all the cacheEntries to get the mappings we'll need 	TokenNameCOMMENT_LINE	iterate over all the cacheEntries to get the mappings we'll need 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
cacheEntries	TokenNameIdentifier	 cache Entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
CacheEntry	TokenNameIdentifier	 Cache Entry
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
cacheEntries	TokenNameIdentifier	 cache Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
val	TokenNameIdentifier	 val
=	TokenNameEQUAL	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// It's OK to have dup entries, where one is eg 	TokenNameCOMMENT_LINE	It's OK to have dup entries, where one is eg 
// float[] and the other is the Bits (from 	TokenNameCOMMENT_LINE	float[] and the other is the Bits (from 
// getDocWithField()) 	TokenNameCOMMENT_LINE	getDocWithField()) 
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
instanceof	TokenNameinstanceof	
Bits	TokenNameIdentifier	 Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
instanceof	TokenNameinstanceof	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
CreationPlaceholder	TokenNameIdentifier	 Creation Placeholder
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
ReaderField	TokenNameIdentifier	 Reader Field
rf	TokenNameIdentifier	 rf
=	TokenNameEQUAL	
new	TokenNamenew	
ReaderField	TokenNameIdentifier	 Reader Field
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getReaderKey	TokenNameIdentifier	 get Reader Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
.	TokenNameDOT	
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
valId	TokenNameIdentifier	 val Id
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
identityHashCode	TokenNameIdentifier	 identity Hash Code
(	TokenNameLPAREN	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// indirect mapping, so the MapOfSet will dedup identical valIds for us 	TokenNameCOMMENT_LINE	indirect mapping, so the MapOfSet will dedup identical valIds for us 
valIdToItems	TokenNameIdentifier	 val Id To Items
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
valId	TokenNameIdentifier	 val Id
,	TokenNameCOMMA	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
readerFieldToValIds	TokenNameIdentifier	 reader Field To Val Ids
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
,	TokenNameCOMMA	
valId	TokenNameIdentifier	 val Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Insanity	TokenNameIdentifier	 Insanity
>	TokenNameGREATER	
insanity	TokenNameIdentifier	 insanity
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Insanity	TokenNameIdentifier	 Insanity
>	TokenNameGREATER	
(	TokenNameLPAREN	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
checkValueMismatch	TokenNameIdentifier	 check Value Mismatch
(	TokenNameLPAREN	
valIdToItems	TokenNameIdentifier	 val Id To Items
,	TokenNameCOMMA	
readerFieldToValIds	TokenNameIdentifier	 reader Field To Val Ids
,	TokenNameCOMMA	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
checkSubreaders	TokenNameIdentifier	 check Subreaders
(	TokenNameLPAREN	
valIdToItems	TokenNameIdentifier	 val Id To Items
,	TokenNameCOMMA	
readerFieldToValIds	TokenNameIdentifier	 reader Field To Val Ids
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Insanity	TokenNameIdentifier	 Insanity
[	TokenNameLBRACKET	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Internal helper method used by check that iterates over * valMismatchKeys and generates a Collection of Insanity * instances accordingly. The MapOfSets are used to populate * the Insanity objects. * @see InsanityType#VALUEMISMATCH */	TokenNameCOMMENT_JAVADOC	 Internal helper method used by check that iterates over valMismatchKeys and generates a Collection of Insanity instances accordingly. The MapOfSets are used to populate the Insanity objects. @see InsanityType#VALUEMISMATCH 
private	TokenNameprivate	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Insanity	TokenNameIdentifier	 Insanity
>	TokenNameGREATER	
checkValueMismatch	TokenNameIdentifier	 check Value Mismatch
(	TokenNameLPAREN	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
CacheEntry	TokenNameIdentifier	 Cache Entry
>	TokenNameGREATER	
valIdToItems	TokenNameIdentifier	 val Id To Items
,	TokenNameCOMMA	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
readerFieldToValIds	TokenNameIdentifier	 reader Field To Val Ids
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Insanity	TokenNameIdentifier	 Insanity
>	TokenNameGREATER	
insanity	TokenNameIdentifier	 insanity
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Insanity	TokenNameIdentifier	 Insanity
>	TokenNameGREATER	
(	TokenNameLPAREN	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have multiple values for some ReaderFields 	TokenNameCOMMENT_LINE	we have multiple values for some ReaderFields 
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>>	TokenNameRIGHT_SHIFT	
rfMap	TokenNameIdentifier	 rf Map
=	TokenNameEQUAL	
readerFieldToValIds	TokenNameIdentifier	 reader Field To Val Ids
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
CacheEntry	TokenNameIdentifier	 Cache Entry
>>	TokenNameRIGHT_SHIFT	
valMap	TokenNameIdentifier	 val Map
=	TokenNameEQUAL	
valIdToItems	TokenNameIdentifier	 val Id To Items
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
ReaderField	TokenNameIdentifier	 Reader Field
rf	TokenNameIdentifier	 rf
:	TokenNameCOLON	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CacheEntry	TokenNameIdentifier	 Cache Entry
>	TokenNameGREATER	
badEntries	TokenNameIdentifier	 bad Entries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CacheEntry	TokenNameIdentifier	 Cache Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
valMismatchKeys	TokenNameIdentifier	 val Mismatch Keys
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
rfMap	TokenNameIdentifier	 rf Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
CacheEntry	TokenNameIdentifier	 Cache Entry
cacheEntry	TokenNameIdentifier	 cache Entry
:	TokenNameCOLON	
valMap	TokenNameIdentifier	 val Map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
badEntries	TokenNameIdentifier	 bad Entries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
cacheEntry	TokenNameIdentifier	 cache Entry
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
CacheEntry	TokenNameIdentifier	 Cache Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
badness	TokenNameIdentifier	 badness
=	TokenNameEQUAL	
new	TokenNamenew	
CacheEntry	TokenNameIdentifier	 Cache Entry
[	TokenNameLBRACKET	
badEntries	TokenNameIdentifier	 bad Entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
badness	TokenNameIdentifier	 badness
=	TokenNameEQUAL	
badEntries	TokenNameIdentifier	 bad Entries
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
badness	TokenNameIdentifier	 badness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Insanity	TokenNameIdentifier	 Insanity
(	TokenNameLPAREN	
InsanityType	TokenNameIdentifier	 Insanity Type
.	TokenNameDOT	
VALUEMISMATCH	TokenNameIdentifier	 VALUEMISMATCH
,	TokenNameCOMMA	
"Multiple distinct value objects for "	TokenNameStringLiteral	Multiple distinct value objects for 
+	TokenNamePLUS	
rf	TokenNameIdentifier	 rf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
badness	TokenNameIdentifier	 badness
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
insanity	TokenNameIdentifier	 insanity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Internal helper method used by check that iterates over * the keys of readerFieldToValIds and generates a Collection * of Insanity instances whenever two (or more) ReaderField instances are * found that have an ancestry relationships. * * @see InsanityType#SUBREADER */	TokenNameCOMMENT_JAVADOC	 Internal helper method used by check that iterates over the keys of readerFieldToValIds and generates a Collection of Insanity instances whenever two (or more) ReaderField instances are found that have an ancestry relationships. * @see InsanityType#SUBREADER 
private	TokenNameprivate	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Insanity	TokenNameIdentifier	 Insanity
>	TokenNameGREATER	
checkSubreaders	TokenNameIdentifier	 check Subreaders
(	TokenNameLPAREN	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
CacheEntry	TokenNameIdentifier	 Cache Entry
>	TokenNameGREATER	
valIdToItems	TokenNameIdentifier	 val Id To Items
,	TokenNameCOMMA	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
readerFieldToValIds	TokenNameIdentifier	 reader Field To Val Ids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Insanity	TokenNameIdentifier	 Insanity
>	TokenNameGREATER	
insanity	TokenNameIdentifier	 insanity
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Insanity	TokenNameIdentifier	 Insanity
>	TokenNameGREATER	
(	TokenNameLPAREN	
23	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>>	TokenNameRIGHT_SHIFT	
badChildren	TokenNameIdentifier	 bad Children
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
badKids	TokenNameIdentifier	 bad Kids
=	TokenNameEQUAL	
new	TokenNamenew	
MapOfSets	TokenNameIdentifier	 Map Of Sets
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
badChildren	TokenNameIdentifier	 bad Children
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// wrapper 	TokenNameCOMMENT_LINE	wrapper 
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
CacheEntry	TokenNameIdentifier	 Cache Entry
>>	TokenNameRIGHT_SHIFT	
viToItemSets	TokenNameIdentifier	 vi To Item Sets
=	TokenNameEQUAL	
valIdToItems	TokenNameIdentifier	 val Id To Items
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
,	TokenNameCOMMA	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>>	TokenNameRIGHT_SHIFT	
rfToValIdSets	TokenNameIdentifier	 rf To Val Id Sets
=	TokenNameEQUAL	
readerFieldToValIds	TokenNameIdentifier	 reader Field To Val Ids
.	TokenNameDOT	
getMap	TokenNameIdentifier	 get Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
seen	TokenNameIdentifier	 seen
=	TokenNameEQUAL	
new	TokenNamenew	
HashSet	TokenNameIdentifier	 Hash Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
readerFields	TokenNameIdentifier	 reader Fields
=	TokenNameEQUAL	
rfToValIdSets	TokenNameIdentifier	 rf To Val Id Sets
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
ReaderField	TokenNameIdentifier	 Reader Field
rf	TokenNameIdentifier	 rf
:	TokenNameCOLON	
readerFields	TokenNameIdentifier	 reader Fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
kids	TokenNameIdentifier	 kids
=	TokenNameEQUAL	
getAllDescendantReaderKeys	TokenNameIdentifier	 get All Descendant Reader Keys
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
.	TokenNameDOT	
readerKey	TokenNameIdentifier	 reader Key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
kidKey	TokenNameIdentifier	 kid Key
:	TokenNameCOLON	
kids	TokenNameIdentifier	 kids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ReaderField	TokenNameIdentifier	 Reader Field
kid	TokenNameIdentifier	 kid
=	TokenNameEQUAL	
new	TokenNamenew	
ReaderField	TokenNameIdentifier	 Reader Field
(	TokenNameLPAREN	
kidKey	TokenNameIdentifier	 kid Key
,	TokenNameCOMMA	
rf	TokenNameIdentifier	 rf
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
badChildren	TokenNameIdentifier	 bad Children
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we've already process this kid as RF and found other problems 	TokenNameCOMMENT_LINE	we've already process this kid as RF and found other problems 
// track those problems as our own 	TokenNameCOMMENT_LINE	track those problems as our own 
badKids	TokenNameIdentifier	 bad Kids
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
,	TokenNameCOMMA	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
badKids	TokenNameIdentifier	 bad Kids
.	TokenNameDOT	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
,	TokenNameCOMMA	
badChildren	TokenNameIdentifier	 bad Children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
badChildren	TokenNameIdentifier	 bad Children
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rfToValIdSets	TokenNameIdentifier	 rf To Val Id Sets
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we have cache entries for the kid 	TokenNameCOMMENT_LINE	we have cache entries for the kid 
badKids	TokenNameIdentifier	 bad Kids
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
,	TokenNameCOMMA	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
seen	TokenNameIdentifier	 seen
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rf	TokenNameIdentifier	 rf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// every mapping in badKids represents an Insanity 	TokenNameCOMMENT_LINE	every mapping in badKids represents an Insanity 
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
ReaderField	TokenNameIdentifier	 Reader Field
parent	TokenNameIdentifier	 parent
:	TokenNameCOLON	
badChildren	TokenNameIdentifier	 bad Children
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
ReaderField	TokenNameIdentifier	 Reader Field
>	TokenNameGREATER	
kids	TokenNameIdentifier	 kids
=	TokenNameEQUAL	
badChildren	TokenNameIdentifier	 bad Children
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
CacheEntry	TokenNameIdentifier	 Cache Entry
>	TokenNameGREATER	
badEntries	TokenNameIdentifier	 bad Entries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
CacheEntry	TokenNameIdentifier	 Cache Entry
>	TokenNameGREATER	
(	TokenNameLPAREN	
kids	TokenNameIdentifier	 kids
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// put parent entr(ies) in first 	TokenNameCOMMENT_LINE	put parent entr(ies) in first 
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
rfToValIdSets	TokenNameIdentifier	 rf To Val Id Sets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
badEntries	TokenNameIdentifier	 bad Entries
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
viToItemSets	TokenNameIdentifier	 vi To Item Sets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// now the entries for the descendants 	TokenNameCOMMENT_LINE	now the entries for the descendants 
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
ReaderField	TokenNameIdentifier	 Reader Field
kid	TokenNameIdentifier	 kid
:	TokenNameCOLON	
kids	TokenNameIdentifier	 kids
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
final	TokenNamefinal	
Integer	TokenNameIdentifier	 Integer
value	TokenNameIdentifier	 value
:	TokenNameCOLON	
rfToValIdSets	TokenNameIdentifier	 rf To Val Id Sets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
kid	TokenNameIdentifier	 kid
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
badEntries	TokenNameIdentifier	 bad Entries
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
viToItemSets	TokenNameIdentifier	 vi To Item Sets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
CacheEntry	TokenNameIdentifier	 Cache Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
badness	TokenNameIdentifier	 badness
=	TokenNameEQUAL	
new	TokenNamenew	
CacheEntry	TokenNameIdentifier	 Cache Entry
[	TokenNameLBRACKET	
badEntries	TokenNameIdentifier	 bad Entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
badness	TokenNameIdentifier	 badness
=	TokenNameEQUAL	
badEntries	TokenNameIdentifier	 bad Entries
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
badness	TokenNameIdentifier	 badness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insanity	TokenNameIdentifier	 insanity
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Insanity	TokenNameIdentifier	 Insanity
(	TokenNameLPAREN	
InsanityType	TokenNameIdentifier	 Insanity Type
.	TokenNameDOT	
SUBREADER	TokenNameIdentifier	 SUBREADER
,	TokenNameCOMMA	
"Found caches for descendants of "	TokenNameStringLiteral	Found caches for descendants of 
+	TokenNamePLUS	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
badness	TokenNameIdentifier	 badness
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
insanity	TokenNameIdentifier	 insanity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Checks if the seed is an IndexReader, and if so will walk * the hierarchy of subReaders building up a list of the objects * returned by obj.getFieldCacheKey() */	TokenNameCOMMENT_JAVADOC	 Checks if the seed is an IndexReader, and if so will walk the hierarchy of subReaders building up a list of the objects returned by obj.getFieldCacheKey() 
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
getAllDescendantReaderKeys	TokenNameIdentifier	 get All Descendant Reader Keys
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
seed	TokenNameIdentifier	 seed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
all	TokenNameIdentifier	 all
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Object	TokenNameIdentifier	 Object
>	TokenNameGREATER	
(	TokenNameLPAREN	
17	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// will grow as we iter 	TokenNameCOMMENT_LINE	will grow as we iter 
all	TokenNameIdentifier	 all
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
seed	TokenNameIdentifier	 seed
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
all	TokenNameIdentifier	 all
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IndexReader	TokenNameIdentifier	 Index Reader
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
subs	TokenNameIdentifier	 subs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
.	TokenNameDOT	
getSequentialSubReaders	TokenNameIdentifier	 get Sequential Sub Readers
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
subs	TokenNameIdentifier	 subs
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
subs	TokenNameIdentifier	 subs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subs	TokenNameIdentifier	 subs
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
getCoreCacheKey	TokenNameIdentifier	 get Core Cache Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// need to skip the first, because it was the seed 	TokenNameCOMMENT_LINE	need to skip the first, because it was the seed 
return	TokenNamereturn	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
all	TokenNameIdentifier	 all
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Simple pair object for using "readerKey + fieldName" a Map key */	TokenNameCOMMENT_JAVADOC	 Simple pair object for using "readerKey + fieldName" a Map key 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
ReaderField	TokenNameIdentifier	 Reader Field
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Object	TokenNameIdentifier	 Object
readerKey	TokenNameIdentifier	 reader Key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ReaderField	TokenNameIdentifier	 Reader Field
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
readerKey	TokenNameIdentifier	 reader Key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
readerKey	TokenNameIdentifier	 reader Key
=	TokenNameEQUAL	
readerKey	TokenNameIdentifier	 reader Key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
=	TokenNameEQUAL	
fieldName	TokenNameIdentifier	 field Name
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
System	TokenNameIdentifier	 System
.	TokenNameDOT	
identityHashCode	TokenNameIdentifier	 identity Hash Code
(	TokenNameLPAREN	
readerKey	TokenNameIdentifier	 reader Key
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
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
that	TokenNameIdentifier	 that
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
that	TokenNameIdentifier	 that
instanceof	TokenNameinstanceof	
ReaderField	TokenNameIdentifier	 Reader Field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ReaderField	TokenNameIdentifier	 Reader Field
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ReaderField	TokenNameIdentifier	 Reader Field
)	TokenNameRPAREN	
that	TokenNameIdentifier	 that
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
readerKey	TokenNameIdentifier	 reader Key
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
readerKey	TokenNameIdentifier	 reader Key
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
fieldName	TokenNameIdentifier	 field Name
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
return	TokenNamereturn	
readerKey	TokenNameIdentifier	 reader Key
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"+"	TokenNameStringLiteral	+
+	TokenNamePLUS	
fieldName	TokenNameIdentifier	 field Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Simple container for a collection of related CacheEntry objects that * in conjunction with each other represent some "insane" usage of the * FieldCache. */	TokenNameCOMMENT_JAVADOC	 Simple container for a collection of related CacheEntry objects that in conjunction with each other represent some "insane" usage of the FieldCache. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
Insanity	TokenNameIdentifier	 Insanity
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
InsanityType	TokenNameIdentifier	 Insanity Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CacheEntry	TokenNameIdentifier	 Cache Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Insanity	TokenNameIdentifier	 Insanity
(	TokenNameLPAREN	
InsanityType	TokenNameIdentifier	 Insanity Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
CacheEntry	TokenNameIdentifier	 Cache Entry
...	TokenNameELLIPSIS	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Insanity requires non-null InsanityType"	TokenNameStringLiteral	Insanity requires non-null InsanityType
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
entries	TokenNameIdentifier	 entries
||	TokenNameOR_OR	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Insanity requires non-null/non-empty CacheEntry[]"	TokenNameStringLiteral	Insanity requires non-null/non-empty CacheEntry[]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
msg	TokenNameIdentifier	 msg
=	TokenNameEQUAL	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Type of insane behavior this object represents */	TokenNameCOMMENT_JAVADOC	 Type of insane behavior this object represents 
public	TokenNamepublic	
InsanityType	TokenNameIdentifier	 Insanity Type
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Description of hte insane behavior */	TokenNameCOMMENT_JAVADOC	 Description of hte insane behavior 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getMsg	TokenNameIdentifier	 get Msg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
msg	TokenNameIdentifier	 msg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * CacheEntry objects which suggest a problem */	TokenNameCOMMENT_JAVADOC	 CacheEntry objects which suggest a problem 
public	TokenNamepublic	
CacheEntry	TokenNameIdentifier	 Cache Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Multi-Line representation of this Insanity object, starting with * the Type and Msg, followed by each CacheEntry.toString() on it's * own line prefaced by a tab character */	TokenNameCOMMENT_JAVADOC	 Multi-Line representation of this Insanity object, starting with the Type and Msg, followed by each CacheEntry.toString() on it's own line prefaced by a tab character 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
getMsg	TokenNameIdentifier	 get Msg
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CacheEntry	TokenNameIdentifier	 Cache Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ce	TokenNameIdentifier	 ce
=	TokenNameEQUAL	
getCacheEntries	TokenNameIdentifier	 get Cache Entries
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
ce	TokenNameIdentifier	 ce
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\t'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ce	TokenNameIdentifier	 ce
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An Enumeration of the different types of "insane" behavior that * may be detected in a FieldCache. * * @see InsanityType#SUBREADER * @see InsanityType#VALUEMISMATCH * @see InsanityType#EXPECTED */	TokenNameCOMMENT_JAVADOC	 An Enumeration of the different types of "insane" behavior that may be detected in a FieldCache. * @see InsanityType#SUBREADER @see InsanityType#VALUEMISMATCH @see InsanityType#EXPECTED 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
InsanityType	TokenNameIdentifier	 Insanity Type
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
private	TokenNameprivate	
InsanityType	TokenNameIdentifier	 Insanity Type
(	TokenNameLPAREN	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
label	TokenNameIdentifier	 label
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
label	TokenNameIdentifier	 label
=	TokenNameEQUAL	
label	TokenNameIdentifier	 label
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
label	TokenNameIdentifier	 label
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Indicates an overlap in cache usage on a given field * in sub/super readers. */	TokenNameCOMMENT_JAVADOC	 Indicates an overlap in cache usage on a given field in sub/super readers. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
InsanityType	TokenNameIdentifier	 Insanity Type
SUBREADER	TokenNameIdentifier	 SUBREADER
=	TokenNameEQUAL	
new	TokenNamenew	
InsanityType	TokenNameIdentifier	 Insanity Type
(	TokenNameLPAREN	
"SUBREADER"	TokenNameStringLiteral	SUBREADER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * <p> * Indicates entries have the same reader+fieldname but * different cached values. This can happen if different datatypes, * or parsers are used -- and while it's not necessarily a bug * it's typically an indication of a possible problem. * </p> * <p> * <bPNOTE:</b> Only the reader, fieldname, and cached value are actually * tested -- if two cache entries have different parsers or datatypes but * the cached values are the same Object (== not just equal()) this method * does not consider that a red flag. This allows for subtle variations * in the way a Parser is specified (null vs DEFAULT_LONG_PARSER, etc...) * </p> */	TokenNameCOMMENT_JAVADOC	 <p> Indicates entries have the same reader+fieldname but different cached values. This can happen if different datatypes, or parsers are used -- and while it's not necessarily a bug it's typically an indication of a possible problem. </p> <p> <bPNOTE:</b> Only the reader, fieldname, and cached value are actually tested -- if two cache entries have different parsers or datatypes but the cached values are the same Object (== not just equal()) this method does not consider that a red flag. This allows for subtle variations in the way a Parser is specified (null vs DEFAULT_LONG_PARSER, etc...) </p> 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
InsanityType	TokenNameIdentifier	 Insanity Type
VALUEMISMATCH	TokenNameIdentifier	 VALUEMISMATCH
=	TokenNameEQUAL	
new	TokenNamenew	
InsanityType	TokenNameIdentifier	 Insanity Type
(	TokenNameLPAREN	
"VALUEMISMATCH"	TokenNameStringLiteral	VALUEMISMATCH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Indicates an expected bit of "insanity". This may be useful for * clients that wish to preserve/log information about insane usage * but indicate that it was expected. */	TokenNameCOMMENT_JAVADOC	 Indicates an expected bit of "insanity". This may be useful for clients that wish to preserve/log information about insane usage but indicate that it was expected. 
public	TokenNamepublic	
final	TokenNamefinal	
static	TokenNamestatic	
InsanityType	TokenNameIdentifier	 Insanity Type
EXPECTED	TokenNameIdentifier	 EXPECTED
=	TokenNameEQUAL	
new	TokenNamenew	
InsanityType	TokenNameIdentifier	 Insanity Type
(	TokenNameLPAREN	
"EXPECTED"	TokenNameStringLiteral	EXPECTED
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
