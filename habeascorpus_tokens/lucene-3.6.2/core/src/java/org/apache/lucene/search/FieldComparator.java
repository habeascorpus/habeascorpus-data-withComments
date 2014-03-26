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
.	TokenNameDOT	
DoubleParser	TokenNameIdentifier	 Double Parser
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
LongParser	TokenNameIdentifier	 Long Parser
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
ByteParser	TokenNameIdentifier	 Byte Parser
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
FloatParser	TokenNameIdentifier	 Float Parser
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
IntParser	TokenNameIdentifier	 Int Parser
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
ShortParser	TokenNameIdentifier	 Short Parser
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
StringIndex	TokenNameIdentifier	 String Index
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
Bits	TokenNameIdentifier	 Bits
;	TokenNameSEMICOLON	
/** * Expert: a FieldComparator compares hits so as to determine their * sort order when collecting the top results with {@link * TopFieldCollector}. The concrete public FieldComparator * classes here correspond to the SortField types. * * <p>This API is designed to achieve high performance * sorting, by exposing a tight interaction with {@link * FieldValueHitQueue} as it visits hits. Whenever a hit is * competitive, it's enrolled into a virtual slot, which is * an int ranging from 0 to numHits-1. The {@link * FieldComparator} is made aware of segment transitions * during searching in case any internal state it's tracking * needs to be recomputed during these transitions.</p> * * <p>A comparator must define these functions:</p> * * <ul> * * <li> {@link #compare} Compare a hit at 'slot a' * with hit 'slot b'. * * <li> {@link #setBottom} This method is called by * {@link FieldValueHitQueue} to notify the * FieldComparator of the current weakest ("bottom") * slot. Note that this slot may not hold the weakest * value according to your comparator, in cases where * your comparator is not the primary one (ie, is only * used to break ties from the comparators before it). * * <li> {@link #compareBottom} Compare a new hit (docID) * against the "weakest" (bottom) entry in the queue. * * <li> {@link #copy} Installs a new hit into the * priority queue. The {@link FieldValueHitQueue} * calls this method when a new hit is competitive. * * <li> {@link #setNextReader} Invoked * when the search is switching to the next segment. * You may need to update internal state of the * comparator, for example retrieving new values from * the {@link FieldCache}. * * <li> {@link #value} Return the sort value stored in * the specified slot. This is only called at the end * of the search, in order to populate {@link * FieldDoc#fields} when returning the top results. * </ul> * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Expert: a FieldComparator compares hits so as to determine their sort order when collecting the top results with {@link TopFieldCollector}. The concrete public FieldComparator classes here correspond to the SortField types. * <p>This API is designed to achieve high performance sorting, by exposing a tight interaction with {@link FieldValueHitQueue} as it visits hits. Whenever a hit is competitive, it's enrolled into a virtual slot, which is an int ranging from 0 to numHits-1. The {@link FieldComparator} is made aware of segment transitions during searching in case any internal state it's tracking needs to be recomputed during these transitions.</p> * <p>A comparator must define these functions:</p> * <ul> * <li> {@link #compare} Compare a hit at 'slot a' with hit 'slot b'. * <li> {@link #setBottom} This method is called by {@link FieldValueHitQueue} to notify the FieldComparator of the current weakest ("bottom") slot. Note that this slot may not hold the weakest value according to your comparator, in cases where your comparator is not the primary one (ie, is only used to break ties from the comparators before it). * <li> {@link #compareBottom} Compare a new hit (docID) against the "weakest" (bottom) entry in the queue. * <li> {@link #copy} Installs a new hit into the priority queue. The {@link FieldValueHitQueue} calls this method when a new hit is competitive. * <li> {@link #setNextReader} Invoked when the search is switching to the next segment. You may need to update internal state of the comparator, for example retrieving new values from the {@link FieldCache}. * <li> {@link #value} Return the sort value stored in the specified slot. This is only called at the end of the search, in order to populate {@link FieldDoc#fields} when returning the top results. </ul> * @lucene.experimental 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * Compare hit at slot1 with hit at slot2. * * @param slot1 first slot to compare * @param slot2 second slot to compare * @return any N < 0 if slot2's value is sorted after * slot1, any N > 0 if the slot2's value is sorted before * slot1 and 0 if they are equal */	TokenNameCOMMENT_JAVADOC	 Compare hit at slot1 with hit at slot2. * @param slot1 first slot to compare @param slot2 second slot to compare @return any N < 0 if slot2's value is sorted after slot1, any N > 0 if the slot2's value is sorted before slot1 and 0 if they are equal 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the bottom slot, ie the "weakest" (sorted last) * entry in the queue. When {@link #compareBottom} is * called, you should compare against this slot. This * will always be called before {@link #compareBottom}. * * @param slot the currently weakest (sorted last) slot in the queue */	TokenNameCOMMENT_JAVADOC	 Set the bottom slot, ie the "weakest" (sorted last) entry in the queue. When {@link #compareBottom} is called, you should compare against this slot. This will always be called before {@link #compareBottom}. * @param slot the currently weakest (sorted last) slot in the queue 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Compare the bottom of the queue with doc. This will * only invoked after setBottom has been called. This * should return the same result as {@link * #compare(int,int)}} as if bottom were slot1 and the new * document were slot 2. * * <p>For a search that hits many results, this method * will be the hotspot (invoked by far the most * frequently).</p> * * @param doc that was hit * @return any N < 0 if the doc's value is sorted after * the bottom entry (not competitive), any N > 0 if the * doc's value is sorted before the bottom entry and 0 if * they are equal. */	TokenNameCOMMENT_JAVADOC	 Compare the bottom of the queue with doc. This will only invoked after setBottom has been called. This should return the same result as {@link #compare(int,int)}} as if bottom were slot1 and the new document were slot 2. * <p>For a search that hits many results, this method will be the hotspot (invoked by far the most frequently).</p> * @param doc that was hit @return any N < 0 if the doc's value is sorted after the bottom entry (not competitive), any N > 0 if the doc's value is sorted before the bottom entry and 0 if they are equal. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * This method is called when a new hit is competitive. * You should copy any state associated with this document * that will be required for future comparisons, into the * specified slot. * * @param slot which slot to copy the hit to * @param doc docID relative to current reader */	TokenNameCOMMENT_JAVADOC	 This method is called when a new hit is competitive. You should copy any state associated with this document that will be required for future comparisons, into the specified slot. * @param slot which slot to copy the hit to @param doc docID relative to current reader 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Set a new Reader. All doc correspond to the current Reader. * * @param reader current reader * @param docBase docBase of this reader * @throws IOException * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Set a new Reader. All doc correspond to the current Reader. * @param reader current reader @param docBase docBase of this reader @throws IOException @throws IOException 
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** Sets the Scorer to use in case a document's score is * needed. * * @param scorer Scorer instance that you should use to * obtain the current hit's score, if necessary. */	TokenNameCOMMENT_JAVADOC	 Sets the Scorer to use in case a document's score is needed. * @param scorer Scorer instance that you should use to obtain the current hit's score, if necessary. 
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Empty implementation since most comparators don't need the score. This 	TokenNameCOMMENT_LINE	Empty implementation since most comparators don't need the score. This 
// can be overridden by those that need it. 	TokenNameCOMMENT_LINE	can be overridden by those that need it. 
}	TokenNameRBRACE	
/** * Return the actual value in the slot. * * @param slot the value * @return value in this slot */	TokenNameCOMMENT_JAVADOC	 Return the actual value in the slot. * @param slot the value @return value in this slot 
public	TokenNamepublic	
abstract	TokenNameabstract	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Returns -1 if first is less than second. Default * impl to assume the type implements Comparable and * invoke .compareTo; be sure to override this method if * your FieldComparator's type isn't a Comparable or * if your values may sometimes be null */	TokenNameCOMMENT_JAVADOC	 Returns -1 if first is less than second. Default impl to assume the type implements Comparable and invoke .compareTo; be sure to override this method if your FieldComparator's type isn't a Comparable or if your values may sometimes be null 
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
public	TokenNamepublic	
int	TokenNameint	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
)	TokenNameRPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
NumericComparator	TokenNameIdentifier	 Numeric Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
Number	TokenNameIdentifier	 Number
>	TokenNameGREATER	
extends	TokenNameextends	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Bits	TokenNameIdentifier	 Bits
docsWithField	TokenNameIdentifier	 docs With Field
;	TokenNameSEMICOLON	
public	TokenNamepublic	
NumericComparator	TokenNameIdentifier	 Numeric Comparator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
missingValue	TokenNameIdentifier	 missing Value
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
missingValue	TokenNameIdentifier	 missing Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docsWithField	TokenNameIdentifier	 docs With Field
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getDocsWithField	TokenNameIdentifier	 get Docs With Field
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// optimization to remove unneeded checks on the bit interface: 	TokenNameCOMMENT_LINE	optimization to remove unneeded checks on the bit interface: 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
instanceof	TokenNameinstanceof	
Bits	TokenNameIdentifier	 Bits
.	TokenNameDOT	
MatchAllBits	TokenNameIdentifier	 Match All Bits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docsWithField	TokenNameIdentifier	 docs With Field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
docsWithField	TokenNameIdentifier	 docs With Field
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Parses field's values as byte (using {@link * FieldCache#getBytes} and sorts by ascending value */	TokenNameCOMMENT_JAVADOC	 Parses field's values as byte (using {@link FieldCache#getBytes} and sorts by ascending value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ByteComparator	TokenNameIdentifier	 Byte Comparator
extends	TokenNameextends	
NumericComparator	TokenNameIdentifier	 Numeric Comparator
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ByteParser	TokenNameIdentifier	 Byte Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentReaderValues	TokenNameIdentifier	 current Reader Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
byte	TokenNamebyte	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
ByteComparator	TokenNameIdentifier	 Byte Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Byte	TokenNameIdentifier	 Byte
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ByteParser	TokenNameIdentifier	 Byte Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
-	TokenNameMINUS	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bottom	TokenNameIdentifier	 bottom
-	TokenNameMINUS	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: must do this before calling super otherwise 	TokenNameCOMMENT_LINE	NOTE: must do this before calling super otherwise 
// we compute the docsWithField Bits twice! 	TokenNameCOMMENT_LINE	we compute the docsWithField Bits twice! 
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Byte	TokenNameIdentifier	 Byte
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sorts by ascending docID */	TokenNameCOMMENT_JAVADOC	 Sorts by ascending docID 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DocComparator	TokenNameIdentifier	 Doc Comparator
extends	TokenNameextends	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docIDs	TokenNameIdentifier	 doc I Ds
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
DocComparator	TokenNameIdentifier	 Doc Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docIDs	TokenNameIdentifier	 doc I Ds
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No overflow risk because docIDs are non-negative 	TokenNameCOMMENT_LINE	No overflow risk because docIDs are non-negative 
return	TokenNamereturn	
docIDs	TokenNameIdentifier	 doc I Ds
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
-	TokenNameMINUS	
docIDs	TokenNameIdentifier	 doc I Ds
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No overflow risk because docIDs are non-negative 	TokenNameCOMMENT_LINE	No overflow risk because docIDs are non-negative 
return	TokenNamereturn	
bottom	TokenNameIdentifier	 bottom
-	TokenNameMINUS	
(	TokenNameLPAREN	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
docIDs	TokenNameIdentifier	 doc I Ds
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: can we "map" our docIDs to the current 	TokenNameCOMMENT_LINE	TODO: can we "map" our docIDs to the current 
// reader? saves having to then subtract on every 	TokenNameCOMMENT_LINE	reader? saves having to then subtract on every 
// compare call 	TokenNameCOMMENT_LINE	compare call 
this	TokenNamethis	
.	TokenNameDOT	
docBase	TokenNameIdentifier	 doc Base
=	TokenNameEQUAL	
docBase	TokenNameIdentifier	 doc Base
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
docIDs	TokenNameIdentifier	 doc I Ds
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
docIDs	TokenNameIdentifier	 doc I Ds
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Parses field's values as double (using {@link * FieldCache#getDoubles} and sorts by ascending value */	TokenNameCOMMENT_JAVADOC	 Parses field's values as double (using {@link FieldCache#getDoubles} and sorts by ascending value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
DoubleComparator	TokenNameIdentifier	 Double Comparator
extends	TokenNameextends	
NumericComparator	TokenNameIdentifier	 Numeric Comparator
<	TokenNameLESS	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
DoubleParser	TokenNameIdentifier	 Double Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentReaderValues	TokenNameIdentifier	 current Reader Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
DoubleComparator	TokenNameIdentifier	 Double Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DoubleParser	TokenNameIdentifier	 Double Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
double	TokenNamedouble	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
double	TokenNamedouble	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: must do this before calling super otherwise 	TokenNameCOMMENT_LINE	NOTE: must do this before calling super otherwise 
// we compute the docsWithField Bits twice! 	TokenNameCOMMENT_LINE	we compute the docsWithField Bits twice! 
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getDoubles	TokenNameIdentifier	 get Doubles
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Double	TokenNameIdentifier	 Double
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Parses field's values as float (using {@link * FieldCache#getFloats} and sorts by ascending value */	TokenNameCOMMENT_JAVADOC	 Parses field's values as float (using {@link FieldCache#getFloats} and sorts by ascending value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
FloatComparator	TokenNameIdentifier	 Float Comparator
extends	TokenNameextends	
NumericComparator	TokenNameIdentifier	 Numeric Comparator
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FloatParser	TokenNameIdentifier	 Float Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentReaderValues	TokenNameIdentifier	 current Reader Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
FloatComparator	TokenNameIdentifier	 Float Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
FloatParser	TokenNameIdentifier	 Float Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: are there sneaky non-branch ways to compute 	TokenNameCOMMENT_LINE	TODO: are there sneaky non-branch ways to compute 
// sign of float? 	TokenNameCOMMENT_LINE	sign of float? 
final	TokenNamefinal	
float	TokenNamefloat	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: are there sneaky non-branch ways to compute 	TokenNameCOMMENT_LINE	TODO: are there sneaky non-branch ways to compute 
// sign of float? 	TokenNameCOMMENT_LINE	sign of float? 
float	TokenNamefloat	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: must do this before calling super otherwise 	TokenNameCOMMENT_LINE	NOTE: must do this before calling super otherwise 
// we compute the docsWithField Bits twice! 	TokenNameCOMMENT_LINE	we compute the docsWithField Bits twice! 
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getFloats	TokenNameIdentifier	 get Floats
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Float	TokenNameIdentifier	 Float
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Parses field's values as int (using {@link * FieldCache#getInts} and sorts by ascending value */	TokenNameCOMMENT_JAVADOC	 Parses field's values as int (using {@link FieldCache#getInts} and sorts by ascending value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
IntComparator	TokenNameIdentifier	 Int Comparator
extends	TokenNameextends	
NumericComparator	TokenNameIdentifier	 Numeric Comparator
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
IntParser	TokenNameIdentifier	 Int Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentReaderValues	TokenNameIdentifier	 current Reader Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
// Value of bottom of queue 	TokenNameCOMMENT_LINE	Value of bottom of queue 
IntComparator	TokenNameIdentifier	 Int Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntParser	TokenNameIdentifier	 Int Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: there are sneaky non-branch ways to compute 	TokenNameCOMMENT_LINE	TODO: there are sneaky non-branch ways to compute 
// -1/+1/0 sign 	TokenNameCOMMENT_LINE	-1/+1/0 sign 
// Cannot return values[slot1] - values[slot2] because that 	TokenNameCOMMENT_LINE	Cannot return values[slot1] - values[slot2] because that 
// may overflow 	TokenNameCOMMENT_LINE	may overflow 
final	TokenNamefinal	
int	TokenNameint	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: there are sneaky non-branch ways to compute 	TokenNameCOMMENT_LINE	TODO: there are sneaky non-branch ways to compute 
// -1/+1/0 sign 	TokenNameCOMMENT_LINE	-1/+1/0 sign 
// Cannot return bottom - values[slot2] because that 	TokenNameCOMMENT_LINE	Cannot return bottom - values[slot2] because that 
// may overflow 	TokenNameCOMMENT_LINE	may overflow 
int	TokenNameint	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: must do this before calling super otherwise 	TokenNameCOMMENT_LINE	NOTE: must do this before calling super otherwise 
// we compute the docsWithField Bits twice! 	TokenNameCOMMENT_LINE	we compute the docsWithField Bits twice! 
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getInts	TokenNameIdentifier	 get Ints
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Integer	TokenNameIdentifier	 Integer
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Parses field's values as long (using {@link * FieldCache#getLongs} and sorts by ascending value */	TokenNameCOMMENT_JAVADOC	 Parses field's values as long (using {@link FieldCache#getLongs} and sorts by ascending value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
LongComparator	TokenNameIdentifier	 Long Comparator
extends	TokenNameextends	
NumericComparator	TokenNameIdentifier	 Numeric Comparator
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
LongParser	TokenNameIdentifier	 Long Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentReaderValues	TokenNameIdentifier	 current Reader Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
LongComparator	TokenNameIdentifier	 Long Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Long	TokenNameIdentifier	 Long
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
long	TokenNamelong	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LongParser	TokenNameIdentifier	 Long Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: there are sneaky non-branch ways to compute 	TokenNameCOMMENT_LINE	TODO: there are sneaky non-branch ways to compute 
// -1/+1/0 sign 	TokenNameCOMMENT_LINE	-1/+1/0 sign 
final	TokenNamefinal	
long	TokenNamelong	
v1	TokenNameIdentifier	 v1
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
long	TokenNamelong	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: there are sneaky non-branch ways to compute 	TokenNameCOMMENT_LINE	TODO: there are sneaky non-branch ways to compute 
// -1/+1/0 sign 	TokenNameCOMMENT_LINE	-1/+1/0 sign 
long	TokenNamelong	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
>	TokenNameGREATER	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
<	TokenNameLESS	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
long	TokenNamelong	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: must do this before calling super otherwise 	TokenNameCOMMENT_LINE	NOTE: must do this before calling super otherwise 
// we compute the docsWithField Bits twice! 	TokenNameCOMMENT_LINE	we compute the docsWithField Bits twice! 
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getLongs	TokenNameIdentifier	 get Longs
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Long	TokenNameIdentifier	 Long
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Long	TokenNameIdentifier	 Long
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sorts by descending relevance. NOTE: if you are * sorting only by descending relevance and then * secondarily by ascending docID, performance is faster * using {@link TopScoreDocCollector} directly (which {@link * IndexSearcher#search} uses when no {@link Sort} is * specified). */	TokenNameCOMMENT_JAVADOC	 Sorts by descending relevance. NOTE: if you are sorting only by descending relevance and then secondarily by ascending docID, performance is faster using {@link TopScoreDocCollector} directly (which {@link IndexSearcher#search} uses when no {@link Sort} is specified). 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
RelevanceComparator	TokenNameIdentifier	 Relevance Comparator
extends	TokenNameextends	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
Float	TokenNameIdentifier	 Float
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scores	TokenNameIdentifier	 scores
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
RelevanceComparator	TokenNameIdentifier	 Relevance Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scores	TokenNameIdentifier	 scores
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
float	TokenNamefloat	
score1	TokenNameIdentifier	 score1
=	TokenNameEQUAL	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
float	TokenNamefloat	
score2	TokenNameIdentifier	 score2
=	TokenNameEQUAL	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
score1	TokenNameIdentifier	 score1
>	TokenNameGREATER	
score2	TokenNameIdentifier	 score2
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
score1	TokenNameIdentifier	 score1
<	TokenNameLESS	
score2	TokenNameIdentifier	 score2
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bottom	TokenNameIdentifier	 bottom
>	TokenNameGREATER	
score	TokenNameIdentifier	 score
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
<	TokenNameLESS	
score	TokenNameIdentifier	 score
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// wrap with a ScoreCachingWrappingScorer so that successive calls to 	TokenNameCOMMENT_LINE	wrap with a ScoreCachingWrappingScorer so that successive calls to 
// score() will not incur score computation over and 	TokenNameCOMMENT_LINE	score() will not incur score computation over and 
// over again. 	TokenNameCOMMENT_LINE	over again. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
instanceof	TokenNameinstanceof	
ScoreCachingWrappingScorer	TokenNameIdentifier	 Score Caching Wrapping Scorer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
new	TokenNamenew	
ScoreCachingWrappingScorer	TokenNameIdentifier	 Score Caching Wrapping Scorer
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Float	TokenNameIdentifier	 Float
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
scores	TokenNameIdentifier	 scores
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Override because we sort reverse of natural Float order: 	TokenNameCOMMENT_LINE	Override because we sort reverse of natural Float order: 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
Float	TokenNameIdentifier	 Float
first	TokenNameIdentifier	 first
,	TokenNameCOMMA	
Float	TokenNameIdentifier	 Float
second	TokenNameIdentifier	 second
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Reversed intentionally because relevance by default 	TokenNameCOMMENT_LINE	Reversed intentionally because relevance by default 
// sorts descending: 	TokenNameCOMMENT_LINE	sorts descending: 
return	TokenNamereturn	
second	TokenNameIdentifier	 second
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Parses field's values as short (using {@link * FieldCache#getShorts} and sorts by ascending value */	TokenNameCOMMENT_JAVADOC	 Parses field's values as short (using {@link FieldCache#getShorts} and sorts by ascending value 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
ShortComparator	TokenNameIdentifier	 Short Comparator
extends	TokenNameextends	
NumericComparator	TokenNameIdentifier	 Numeric Comparator
<	TokenNameLESS	
Short	TokenNameIdentifier	 Short
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ShortParser	TokenNameIdentifier	 Short Parser
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentReaderValues	TokenNameIdentifier	 current Reader Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
short	TokenNameshort	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
ShortComparator	TokenNameIdentifier	 Short Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
Parser	TokenNameIdentifier	 Parser
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
Short	TokenNameIdentifier	 Short
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ShortParser	TokenNameIdentifier	 Short Parser
)	TokenNameRPAREN	
parser	TokenNameIdentifier	 parser
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
-	TokenNameMINUS	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bottom	TokenNameIdentifier	 bottom
-	TokenNameMINUS	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Test for v2 == 0 to save Bits.get method call for 	TokenNameCOMMENT_LINE	Test for v2 == 0 to save Bits.get method call for 
// the common case (doc has value and value is non-zero): 	TokenNameCOMMENT_LINE	the common case (doc has value and value is non-zero): 
if	TokenNameif	
(	TokenNameLPAREN	
docsWithField	TokenNameIdentifier	 docs With Field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
docsWithField	TokenNameIdentifier	 docs With Field
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v2	TokenNameIdentifier	 v2
=	TokenNameEQUAL	
missingValue	TokenNameIdentifier	 missing Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
v2	TokenNameIdentifier	 v2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// NOTE: must do this before calling super otherwise 	TokenNameCOMMENT_LINE	NOTE: must do this before calling super otherwise 
// we compute the docsWithField Bits twice! 	TokenNameCOMMENT_LINE	we compute the docsWithField Bits twice! 
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getShorts	TokenNameIdentifier	 get Shorts
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
parser	TokenNameIdentifier	 parser
,	TokenNameCOMMA	
missingValue	TokenNameIdentifier	 missing Value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Short	TokenNameIdentifier	 Short
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Short	TokenNameIdentifier	 Short
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sorts by a field's value using the Collator for a * given Locale.*/	TokenNameCOMMENT_JAVADOC	 Sorts by a field's value using the Collator for a given Locale.
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
StringComparatorLocale	TokenNameIdentifier	 String Comparator Locale
extends	TokenNameextends	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentReaderValues	TokenNameIdentifier	 current Reader Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Collator	TokenNameIdentifier	 Collator
collator	TokenNameIdentifier	 collator
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
StringComparatorLocale	TokenNameIdentifier	 String Comparator Locale
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
Locale	TokenNameIdentifier	 Locale
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
collator	TokenNameIdentifier	 collator
=	TokenNameEQUAL	
Collator	TokenNameIdentifier	 Collator
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
locale	TokenNameIdentifier	 locale
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
,	TokenNameCOMMA	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStrings	TokenNameIdentifier	 get Strings
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
collator	TokenNameIdentifier	 collator
.	TokenNameDOT	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sorts by field's natural String sort order, using * ordinals. This is functionally equivalent to {@link * StringValComparator}, but it first resolves the string * to their relative ordinal positions (using the index * returned by {@link FieldCache#getStringIndex}), and * does most comparisons using the ordinals. For medium * to large results, this comparator will be much faster * than {@link StringValComparator}. For very small * result sets it may be slower. */	TokenNameCOMMENT_JAVADOC	 Sorts by field's natural String sort order, using ordinals. This is functionally equivalent to {@link StringValComparator}, but it first resolves the string to their relative ordinal positions (using the index returned by {@link FieldCache#getStringIndex}), and does most comparisons using the ordinals. For medium to large results, this comparator will be much faster than {@link StringValComparator}. For very small result sets it may be slower. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
StringOrdValComparator	TokenNameIdentifier	 String Ord Val Comparator
extends	TokenNameextends	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ords	TokenNameIdentifier	 ords
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readerGen	TokenNameIdentifier	 reader Gen
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentReaderGen	TokenNameIdentifier	 current Reader Gen
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookup	TokenNameIdentifier	 lookup
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
order	TokenNameIdentifier	 order
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bottomSlot	TokenNameIdentifier	 bottom Slot
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
bottomOrd	TokenNameIdentifier	 bottom Ord
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
bottomSameReader	TokenNameIdentifier	 bottom Same Reader
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
bottomValue	TokenNameIdentifier	 bottom Value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
StringOrdValComparator	TokenNameIdentifier	 String Ord Val Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
int	TokenNameint	
sortPos	TokenNameIdentifier	 sort Pos
,	TokenNameCOMMA	
boolean	TokenNameboolean	
reversed	TokenNameIdentifier	 reversed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ords	TokenNameIdentifier	 ords
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
readerGen	TokenNameIdentifier	 reader Gen
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
readerGen	TokenNameIdentifier	 reader Gen
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
readerGen	TokenNameIdentifier	 reader Gen
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
-	TokenNameMINUS	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
val1	TokenNameIdentifier	 val1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
bottomSlot	TokenNameIdentifier	 bottom Slot
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
docOrd	TokenNameIdentifier	 doc Ord
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bottomSameReader	TokenNameIdentifier	 bottom Same Reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ord is precisely comparable, even in the equal case 	TokenNameCOMMENT_LINE	ord is precisely comparable, even in the equal case 
return	TokenNamereturn	
bottomOrd	TokenNameIdentifier	 bottom Ord
-	TokenNameMINUS	
docOrd	TokenNameIdentifier	 doc Ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
bottomOrd	TokenNameIdentifier	 bottom Ord
>=	TokenNameGREATER_EQUAL	
docOrd	TokenNameIdentifier	 doc Ord
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the equals case always means bottom is > doc 	TokenNameCOMMENT_LINE	the equals case always means bottom is > doc 
// (because we set bottomOrd to the lower bound in 	TokenNameCOMMENT_LINE	(because we set bottomOrd to the lower bound in 
// setBottom): 	TokenNameCOMMENT_LINE	setBottom): 
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
order	TokenNameIdentifier	 order
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ord	TokenNameIdentifier	 ord
;	TokenNameSEMICOLON	
assert	TokenNameassert	
ord	TokenNameIdentifier	 ord
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lookup	TokenNameIdentifier	 lookup
[	TokenNameLBRACKET	
ord	TokenNameIdentifier	 ord
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
readerGen	TokenNameIdentifier	 reader Gen
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentReaderGen	TokenNameIdentifier	 current Reader Gen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
StringIndex	TokenNameIdentifier	 String Index
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStringIndex	TokenNameIdentifier	 get String Index
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentReaderGen	TokenNameIdentifier	 current Reader Gen
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
order	TokenNameIdentifier	 order
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
.	TokenNameDOT	
order	TokenNameIdentifier	 order
;	TokenNameSEMICOLON	
lookup	TokenNameIdentifier	 lookup
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
.	TokenNameDOT	
lookup	TokenNameIdentifier	 lookup
;	TokenNameSEMICOLON	
assert	TokenNameassert	
lookup	TokenNameIdentifier	 lookup
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bottomSlot	TokenNameIdentifier	 bottom Slot
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
bottomSlot	TokenNameIdentifier	 bottom Slot
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottomSlot	TokenNameIdentifier	 bottom Slot
=	TokenNameEQUAL	
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
bottomValue	TokenNameIdentifier	 bottom Value
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottomSlot	TokenNameIdentifier	 bottom Slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentReaderGen	TokenNameIdentifier	 current Reader Gen
==	TokenNameEQUAL_EQUAL	
readerGen	TokenNameIdentifier	 reader Gen
[	TokenNameLBRACKET	
bottomSlot	TokenNameIdentifier	 bottom Slot
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottomOrd	TokenNameIdentifier	 bottom Ord
=	TokenNameEQUAL	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
bottomSlot	TokenNameIdentifier	 bottom Slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
bottomSameReader	TokenNameIdentifier	 bottom Same Reader
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bottomValue	TokenNameIdentifier	 bottom Value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
bottomSlot	TokenNameIdentifier	 bottom Slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bottomOrd	TokenNameIdentifier	 bottom Ord
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bottomSameReader	TokenNameIdentifier	 bottom Same Reader
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
readerGen	TokenNameIdentifier	 reader Gen
[	TokenNameLBRACKET	
bottomSlot	TokenNameIdentifier	 bottom Slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentReaderGen	TokenNameIdentifier	 current Reader Gen
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
lookup	TokenNameIdentifier	 lookup
,	TokenNameCOMMA	
bottomValue	TokenNameIdentifier	 bottom Value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bottomOrd	TokenNameIdentifier	 bottom Ord
=	TokenNameEQUAL	
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bottomSameReader	TokenNameIdentifier	 bottom Same Reader
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
bottomOrd	TokenNameIdentifier	 bottom Ord
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// exact value match 	TokenNameCOMMENT_LINE	exact value match 
bottomSameReader	TokenNameIdentifier	 bottom Same Reader
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
readerGen	TokenNameIdentifier	 reader Gen
[	TokenNameLBRACKET	
bottomSlot	TokenNameIdentifier	 bottom Slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentReaderGen	TokenNameIdentifier	 current Reader Gen
;	TokenNameSEMICOLON	
ords	TokenNameIdentifier	 ords
[	TokenNameLBRACKET	
bottomSlot	TokenNameIdentifier	 bottom Slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
bottomOrd	TokenNameIdentifier	 bottom Ord
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
val1	TokenNameIdentifier	 val1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getValues	TokenNameIdentifier	 get Values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getBottomSlot	TokenNameIdentifier	 get Bottom Slot
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bottomSlot	TokenNameIdentifier	 bottom Slot
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** Sorts by field's natural String sort order. All * comparisons are done using String.compareTo, which is * slow for medium to large result sets but possibly * very fast for very small results sets. */	TokenNameCOMMENT_JAVADOC	 Sorts by field's natural String sort order. All comparisons are done using String.compareTo, which is slow for medium to large result sets but possibly very fast for very small results sets. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
StringValComparator	TokenNameIdentifier	 String Val Comparator
extends	TokenNameextends	
FieldComparator	TokenNameIdentifier	 Field Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
currentReaderValues	TokenNameIdentifier	 current Reader Values
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
bottom	TokenNameIdentifier	 bottom
;	TokenNameSEMICOLON	
StringValComparator	TokenNameIdentifier	 String Val Comparator
(	TokenNameLPAREN	
int	TokenNameint	
numHits	TokenNameIdentifier	 num Hits
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
numHits	TokenNameIdentifier	 num Hits
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
int	TokenNameint	
slot1	TokenNameIdentifier	 slot1
,	TokenNameCOMMA	
int	TokenNameint	
slot2	TokenNameIdentifier	 slot2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val1	TokenNameIdentifier	 val1
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot1	TokenNameIdentifier	 slot1
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot2	TokenNameIdentifier	 slot2
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
val1	TokenNameIdentifier	 val1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareBottom	TokenNameIdentifier	 compare Bottom
(	TokenNameLPAREN	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bottom	TokenNameIdentifier	 bottom
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bottom	TokenNameIdentifier	 bottom
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
currentReaderValues	TokenNameIdentifier	 current Reader Values
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setNextReader	TokenNameIdentifier	 set Next Reader
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
docBase	TokenNameIdentifier	 doc Base
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
currentReaderValues	TokenNameIdentifier	 current Reader Values
=	TokenNameEQUAL	
FieldCache	TokenNameIdentifier	 Field Cache
.	TokenNameDOT	
DEFAULT	TokenNameIdentifier	 DEFAULT
.	TokenNameDOT	
getStrings	TokenNameIdentifier	 get Strings
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
setBottom	TokenNameIdentifier	 set Bottom
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
bottom	TokenNameIdentifier	 bottom
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bottom	TokenNameIdentifier	 bottom
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
bottom	TokenNameIdentifier	 bottom
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
(	TokenNameLPAREN	
int	TokenNameint	
slot	TokenNameIdentifier	 slot
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
compareValues	TokenNameIdentifier	 compare Values
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
val1	TokenNameIdentifier	 val1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val1	TokenNameIdentifier	 val1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
val1	TokenNameIdentifier	 val1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
val2	TokenNameIdentifier	 val2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
protected	TokenNameprotected	
static	TokenNamestatic	
int	TokenNameint	
binarySearch	TokenNameIdentifier	 binary Search
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
low	TokenNameIdentifier	 low
,	TokenNameCOMMA	
int	TokenNameint	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
<=	TokenNameLESS_EQUAL	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
mid	TokenNameIdentifier	 mid
=	TokenNameEQUAL	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
midVal	TokenNameIdentifier	 mid Val
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
mid	TokenNameIdentifier	 mid
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
midVal	TokenNameIdentifier	 mid Val
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
midVal	TokenNameIdentifier	 mid Val
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
cmp	TokenNameIdentifier	 cmp
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
mid	TokenNameIdentifier	 mid
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
mid	TokenNameIdentifier	 mid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
