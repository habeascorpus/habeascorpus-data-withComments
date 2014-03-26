package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
streaming	TokenNameIdentifier	 streaming
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
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
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenStream	TokenNameIdentifier	 Token Stream
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
OrdinalProperty	TokenNameIdentifier	 Ordinal Property
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
CategoryListParams	TokenNameIdentifier	 Category List Params
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
params	TokenNameIdentifier	 params
.	TokenNameDOT	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
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
CategoryPath	TokenNameIdentifier	 Category Path
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
PartitionsUtils	TokenNameIdentifier	 Partitions Utils
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
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
IntEncoder	TokenNameIdentifier	 Int Encoder
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * {@link CategoryListTokenizer} for facet counting * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 {@link CategoryListTokenizer} for facet counting * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CountingListTokenizer	TokenNameIdentifier	 Counting List Tokenizer
extends	TokenNameextends	
CategoryListTokenizer	TokenNameIdentifier	 Category List Tokenizer
{	TokenNameLBRACE	
/** A table for retrieving payload streams by category-list name. */	TokenNameCOMMENT_JAVADOC	 A table for retrieving payload streams by category-list name. 
protected	TokenNameprotected	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
>	TokenNameGREATER	
payloadStreamsByName	TokenNameIdentifier	 payload Streams By Name
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** An iterator over the payload streams */	TokenNameCOMMENT_JAVADOC	 An iterator over the payload streams 
protected	TokenNameprotected	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
>>	TokenNameRIGHT_SHIFT	
payloadStreamIterator	TokenNameIdentifier	 payload Stream Iterator
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CountingListTokenizer	TokenNameIdentifier	 Counting List Tokenizer
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
FacetIndexingParams	TokenNameIdentifier	 Facet Indexing Params
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
indexingParams	TokenNameIdentifier	 indexing Params
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
payloadStreamsByName	TokenNameIdentifier	 payload Streams By Name
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
void	TokenNamevoid	
handleStartOfInput	TokenNameIdentifier	 handle Start Of Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
payloadStreamsByName	TokenNameIdentifier	 payload Streams By Name
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadStreamIterator	TokenNameIdentifier	 payload Stream Iterator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
categoryAttribute	TokenNameIdentifier	 category Attribute
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
OrdinalProperty	TokenNameIdentifier	 Ordinal Property
ordinalProperty	TokenNameIdentifier	 ordinal Property
=	TokenNameEQUAL	
(	TokenNameLPAREN	
OrdinalProperty	TokenNameIdentifier	 Ordinal Property
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
categoryAttribute	TokenNameIdentifier	 category Attribute
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
OrdinalProperty	TokenNameIdentifier	 Ordinal Property
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ordinalProperty	TokenNameIdentifier	 ordinal Property
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
legalCategory	TokenNameIdentifier	 legal Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
categoryAttribute	TokenNameIdentifier	 category Attribute
.	TokenNameDOT	
getCategoryPath	TokenNameIdentifier	 get Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
=	TokenNameEQUAL	
ordinalProperty	TokenNameIdentifier	 ordinal Property
.	TokenNameDOT	
getOrdinal	TokenNameIdentifier	 get Ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
payloadStream	TokenNameIdentifier	 payload Stream
=	TokenNameEQUAL	
getPayloadStream	TokenNameIdentifier	 get Payload Stream
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
partitionSize	TokenNameIdentifier	 partition Size
=	TokenNameEQUAL	
indexingParams	TokenNameIdentifier	 indexing Params
.	TokenNameDOT	
getPartitionSize	TokenNameIdentifier	 get Partition Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadStream	TokenNameIdentifier	 payload Stream
.	TokenNameDOT	
appendIntToStream	TokenNameIdentifier	 append Int To Stream
(	TokenNameLPAREN	
ordinal	TokenNameIdentifier	 ordinal
%	TokenNameREMAINDER	
partitionSize	TokenNameIdentifier	 partition Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
payloadStreamIterator	TokenNameIdentifier	 payload Stream Iterator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
handleEndOfInput	TokenNameIdentifier	 handle End Of Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
payloadStreamIterator	TokenNameIdentifier	 payload Stream Iterator
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
payloadStreamsByName	TokenNameIdentifier	 payload Streams By Name
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
payloadStreamIterator	TokenNameIdentifier	 payload Stream Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
>	TokenNameGREATER	
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
payloadStreamIterator	TokenNameIdentifier	 payload Stream Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
countingListName	TokenNameIdentifier	 counting List Name
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
countingListName	TokenNameIdentifier	 counting List Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termAttribute	TokenNameIdentifier	 term Attribute
.	TokenNameDOT	
resizeBuffer	TokenNameIdentifier	 resize Buffer
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
countingListName	TokenNameIdentifier	 counting List Name
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
termAttribute	TokenNameIdentifier	 term Attribute
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termAttribute	TokenNameIdentifier	 term Attribute
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
payloadStream	TokenNameIdentifier	 payload Stream
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payload	TokenNameIdentifier	 payload
.	TokenNameDOT	
setData	TokenNameIdentifier	 set Data
(	TokenNameLPAREN	
payloadStream	TokenNameIdentifier	 payload Stream
.	TokenNameDOT	
convertStreamToByteArray	TokenNameIdentifier	 convert Stream To Byte Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
payloadAttribute	TokenNameIdentifier	 payload Attribute
.	TokenNameDOT	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
payload	TokenNameIdentifier	 payload
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A method which allows extending classes to filter the categories going * into the counting list. * * @return By default returns {@code true}, meaning the current category is * to be part of the counting list. For categories that should be * filtered, return {@code false}. */	TokenNameCOMMENT_JAVADOC	 A method which allows extending classes to filter the categories going into the counting list. * @return By default returns {@code true}, meaning the current category is to be part of the counting list. For categories that should be filtered, return {@code false}. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
legalCategory	TokenNameIdentifier	 legal Category
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
getPayloadStream	TokenNameIdentifier	 get Payload Stream
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
categoryPath	TokenNameIdentifier	 category Path
,	TokenNameCOMMA	
int	TokenNameint	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
CategoryListParams	TokenNameIdentifier	 Category List Params
clParams	TokenNameIdentifier	 cl Params
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
indexingParams	TokenNameIdentifier	 indexing Params
.	TokenNameDOT	
getCategoryListParams	TokenNameIdentifier	 get Category List Params
(	TokenNameLPAREN	
categoryPath	TokenNameIdentifier	 category Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
PartitionsUtils	TokenNameIdentifier	 Partitions Utils
.	TokenNameDOT	
partitionNameByOrdinal	TokenNameIdentifier	 partition Name By Ordinal
(	TokenNameLPAREN	
indexingParams	TokenNameIdentifier	 indexing Params
,	TokenNameCOMMA	
clParams	TokenNameIdentifier	 cl Params
,	TokenNameCOMMA	
ordinal	TokenNameIdentifier	 ordinal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
fps	TokenNameIdentifier	 fps
=	TokenNameEQUAL	
payloadStreamsByName	TokenNameIdentifier	 payload Streams By Name
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fps	TokenNameIdentifier	 fps
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
IntEncoder	TokenNameIdentifier	 Int Encoder
encoder	TokenNameIdentifier	 encoder
=	TokenNameEQUAL	
clParams	TokenNameIdentifier	 cl Params
.	TokenNameDOT	
createEncoder	TokenNameIdentifier	 create Encoder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fps	TokenNameIdentifier	 fps
=	TokenNameEQUAL	
new	TokenNamenew	
CategoryListPayloadStream	TokenNameIdentifier	 Category List Payload Stream
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadStreamsByName	TokenNameIdentifier	 payload Streams By Name
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
fps	TokenNameIdentifier	 fps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
fps	TokenNameIdentifier	 fps
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
