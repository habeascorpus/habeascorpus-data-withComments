package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
BufferedReader	TokenNameIdentifier	 Buffered Reader
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Reader	TokenNameIdentifier	 Reader
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
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
TreeMap	TokenNameIdentifier	 Tree Map
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
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CSVUtil	TokenNameIdentifier	 CSV Util
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
IntsRef	TokenNameIdentifier	 Ints Ref
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
FST	TokenNameIdentifier	 FST
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
PositiveIntOutputs	TokenNameIdentifier	 Positive Int Outputs
;	TokenNameSEMICOLON	
/** * Class for building a User Dictionary. * This class allows for custom segmentation of phrases. */	TokenNameCOMMENT_JAVADOC	 Class for building a User Dictionary. This class allows for custom segmentation of phrases. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
UserDictionary	TokenNameIdentifier	 User Dictionary
implements	TokenNameimplements	
Dictionary	TokenNameIdentifier	 Dictionary
{	TokenNameLBRACE	
// phrase text -> phrase ID 	TokenNameCOMMENT_LINE	phrase text -> phrase ID 
private	TokenNameprivate	
final	TokenNamefinal	
TokenInfoFST	TokenNameIdentifier	 Token Info FST
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
// holds wordid, length, length... indexed by phrase ID 	TokenNameCOMMENT_LINE	holds wordid, length, length... indexed by phrase ID 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
segmentations	TokenNameIdentifier	 segmentations
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// holds readings and POS, indexed by wordid 	TokenNameCOMMENT_LINE	holds readings and POS, indexed by wordid 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CUSTOM_DICTIONARY_WORD_ID_OFFSET	TokenNameIdentifier	 CUSTOM  DICTIONARY  WORD  ID  OFFSET
=	TokenNameEQUAL	
100000000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
WORD_COST	TokenNameIdentifier	 WORD  COST
=	TokenNameEQUAL	
-	TokenNameMINUS	
100000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
LEFT_ID	TokenNameIdentifier	 LEFT  ID
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RIGHT_ID	TokenNameIdentifier	 RIGHT  ID
=	TokenNameEQUAL	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
UserDictionary	TokenNameIdentifier	 User Dictionary
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
BufferedReader	TokenNameIdentifier	 Buffered Reader
br	TokenNameIdentifier	 br
=	TokenNameEQUAL	
new	TokenNamenew	
BufferedReader	TokenNameIdentifier	 Buffered Reader
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
=	TokenNameEQUAL	
CUSTOM_DICTIONARY_WORD_ID_OFFSET	TokenNameIdentifier	 CUSTOM  DICTIONARY  WORD  ID  OFFSET
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
featureEntries	TokenNameIdentifier	 feature Entries
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// text, segmentation, readings, POS 	TokenNameCOMMENT_LINE	text, segmentation, readings, POS 
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
br	TokenNameIdentifier	 br
.	TokenNameDOT	
readLine	TokenNameIdentifier	 read Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove comments 	TokenNameCOMMENT_LINE	Remove comments 
line	TokenNameIdentifier	 line
=	TokenNameEQUAL	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
"#.*$"	TokenNameStringLiteral	#.*$
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Skip empty lines or comment lines 	TokenNameCOMMENT_LINE	Skip empty lines or comment lines 
if	TokenNameif	
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
parse	TokenNameIdentifier	 parse
(	TokenNameLPAREN	
line	TokenNameIdentifier	 line
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
featureEntries	TokenNameIdentifier	 feature Entries
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// TODO: should we allow multiple segmentations per input 'phrase'? 	TokenNameCOMMENT_LINE	TODO: should we allow multiple segmentations per input 'phrase'? 
// the old treemap didn't support this either, and i'm not sure if its needed/useful? 	TokenNameCOMMENT_LINE	the old treemap didn't support this either, and i'm not sure if its needed/useful? 
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
featureEntries	TokenNameIdentifier	 feature Entries
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
featureEntries	TokenNameIdentifier	 feature Entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
segmentations	TokenNameIdentifier	 segmentations
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
featureEntries	TokenNameIdentifier	 feature Entries
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PositiveIntOutputs	TokenNameIdentifier	 Positive Int Outputs
fstOutput	TokenNameIdentifier	 fst Output
=	TokenNameEQUAL	
PositiveIntOutputs	TokenNameIdentifier	 Positive Int Outputs
.	TokenNameDOT	
getSingleton	TokenNameIdentifier	 get Singleton
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fstBuilder	TokenNameIdentifier	 fst Builder
=	TokenNameEQUAL	
new	TokenNamenew	
Builder	TokenNameIdentifier	 Builder
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
INPUT_TYPE	TokenNameIdentifier	 INPUT  TYPE
.	TokenNameDOT	
BYTE2	TokenNameIdentifier	 BYT E2
,	TokenNameCOMMA	
fstOutput	TokenNameIdentifier	 fst Output
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IntsRef	TokenNameIdentifier	 Ints Ref
scratch	TokenNameIdentifier	 scratch
=	TokenNameEQUAL	
new	TokenNamenew	
IntsRef	TokenNameIdentifier	 Ints Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
ord	TokenNameIdentifier	 ord
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
values	TokenNameIdentifier	 values
:	TokenNameCOLON	
featureEntries	TokenNameIdentifier	 feature Entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segmentation	TokenNameIdentifier	 segmentation
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
" *"	TokenNameStringLiteral	 *
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
readings	TokenNameIdentifier	 readings
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
replaceAll	TokenNameIdentifier	 replace All
(	TokenNameLPAREN	
" *"	TokenNameStringLiteral	 *
,	TokenNameCOMMA	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segmentation	TokenNameIdentifier	 segmentation
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
readings	TokenNameIdentifier	 readings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
"Illegal user dictionary entry "	TokenNameStringLiteral	Illegal user dictionary entry 
+	TokenNamePLUS	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
" - the number of segmentations ("	TokenNameStringLiteral	 - the number of segmentations (
+	TokenNamePLUS	
segmentation	TokenNameIdentifier	 segmentation
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
+	TokenNamePLUS	
" does not the match number of readings ("	TokenNameStringLiteral	 does not the match number of readings (
+	TokenNamePLUS	
readings	TokenNameIdentifier	 readings
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wordIdAndLength	TokenNameIdentifier	 word Id And Length
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
segmentation	TokenNameIdentifier	 segmentation
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// wordId offset, length, length.... 	TokenNameCOMMENT_LINE	wordId offset, length, length.... 
wordIdAndLength	TokenNameIdentifier	 word Id And Length
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
wordId	TokenNameIdentifier	 word Id
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
segmentation	TokenNameIdentifier	 segmentation
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
wordIdAndLength	TokenNameIdentifier	 word Id And Length
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
segmentation	TokenNameIdentifier	 segmentation
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
readings	TokenNameIdentifier	 readings
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
INTERNAL_SEPARATOR	TokenNameIdentifier	 INTERNAL  SEPARATOR
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wordId	TokenNameIdentifier	 word Id
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// add mapping to FST 	TokenNameCOMMENT_LINE	add mapping to FST 
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
values	TokenNameIdentifier	 values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scratch	TokenNameIdentifier	 scratch
.	TokenNameDOT	
ints	TokenNameIdentifier	 ints
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fstBuilder	TokenNameIdentifier	 fst Builder
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
scratch	TokenNameIdentifier	 scratch
,	TokenNameCOMMA	
ord	TokenNameIdentifier	 ord
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segmentations	TokenNameIdentifier	 segmentations
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
wordIdAndLength	TokenNameIdentifier	 word Id And Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ord	TokenNameIdentifier	 ord
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
new	TokenNamenew	
TokenInfoFST	TokenNameIdentifier	 Token Info FST
(	TokenNameLPAREN	
fstBuilder	TokenNameIdentifier	 fst Builder
.	TokenNameDOT	
finish	TokenNameIdentifier	 finish
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
segmentations	TokenNameIdentifier	 segmentations
=	TokenNameEQUAL	
segmentations	TokenNameIdentifier	 segmentations
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
segmentations	TokenNameIdentifier	 segmentations
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Lookup words in text * @param chars text * @param off offset into text * @param len length of text * @return array of {wordId, position, length} */	TokenNameCOMMENT_JAVADOC	 Lookup words in text @param chars text @param off offset into text @param len length of text @return array of {wordId, position, length} 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookup	TokenNameIdentifier	 lookup
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// TODO: can we avoid this treemap/toIndexArray? 	TokenNameCOMMENT_LINE	TODO: can we avoid this treemap/toIndexArray? 
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// index, [length, length...] 	TokenNameCOMMENT_LINE	index, [length, length...] 
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// true if we found any results 	TokenNameCOMMENT_LINE	true if we found any results 
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
fstReader	TokenNameIdentifier	 fst Reader
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
off	TokenNameIdentifier	 off
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
output	TokenNameIdentifier	 output
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
remaining	TokenNameIdentifier	 remaining
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
startOffset	TokenNameIdentifier	 start Offset
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
remaining	TokenNameIdentifier	 remaining
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
findTargetArc	TokenNameIdentifier	 find Target Arc
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fstReader	TokenNameIdentifier	 fst Reader
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// continue to next position 	TokenNameCOMMENT_LINE	continue to next position 
}	TokenNameRBRACE	
output	TokenNameIdentifier	 output
+=	TokenNamePLUS_EQUAL	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
output	TokenNameIdentifier	 output
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
isFinal	TokenNameIdentifier	 is Final
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
finalOutput	TokenNameIdentifier	 final Output
=	TokenNameEQUAL	
output	TokenNameIdentifier	 output
+	TokenNamePLUS	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
nextFinalOutput	TokenNameIdentifier	 next Final Output
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
-	TokenNameMINUS	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
segmentations	TokenNameIdentifier	 segmentations
[	TokenNameLBRACKET	
finalOutput	TokenNameIdentifier	 final Output
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
found	TokenNameIdentifier	 found
?	TokenNameQUESTION	
toIndexArray	TokenNameIdentifier	 to Index Array
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
:	TokenNameCOLON	
EMPTY_RESULT	TokenNameIdentifier	 EMPTY  RESULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TokenInfoFST	TokenNameIdentifier	 Token Info FST
getFST	TokenNameIdentifier	 get FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
EMPTY_RESULT	TokenNameIdentifier	 EMPTY  RESULT
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Convert Map of index and wordIdAndLength to array of {wordId, index, length} * @param input * @return array of {wordId, index, length} */	TokenNameCOMMENT_JAVADOC	 Convert Map of index and wordIdAndLength to array of {wordId, index, length} @param input @return array of {wordId, index, length} 
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toIndexArray	TokenNameIdentifier	 to Index Array
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
:	TokenNameCOLON	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
keySet	TokenNameIdentifier	 key Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wordIdAndLength	TokenNameIdentifier	 word Id And Length
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
=	TokenNameEQUAL	
wordIdAndLength	TokenNameIdentifier	 word Id And Length
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// convert length to index 	TokenNameCOMMENT_LINE	convert length to index 
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
wordIdAndLength	TokenNameIdentifier	 word Id And Length
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first entry is wordId offset 	TokenNameCOMMENT_LINE	first entry is wordId offset 
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
{	TokenNameLBRACE	
wordId	TokenNameIdentifier	 word Id
+	TokenNamePLUS	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
wordIdAndLength	TokenNameIdentifier	 word Id And Length
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
+=	TokenNamePLUS_EQUAL	
wordIdAndLength	TokenNameIdentifier	 word Id And Length
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lookupSegmentation	TokenNameIdentifier	 lookup Segmentation
(	TokenNameLPAREN	
int	TokenNameint	
phraseID	TokenNameIdentifier	 phrase ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segmentations	TokenNameIdentifier	 segmentations
[	TokenNameLBRACKET	
phraseID	TokenNameIdentifier	 phrase ID
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
getLeftId	TokenNameIdentifier	 get Left Id
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LEFT_ID	TokenNameIdentifier	 LEFT  ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
getRightId	TokenNameIdentifier	 get Right Id
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RIGHT_ID	TokenNameIdentifier	 RIGHT  ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
int	TokenNameint	
getWordCost	TokenNameIdentifier	 get Word Cost
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
WORD_COST	TokenNameIdentifier	 WORD  COST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getReading	TokenNameIdentifier	 get Reading
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPartOfSpeech	TokenNameIdentifier	 get Part Of Speech
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getBaseForm	TokenNameIdentifier	 get Base Form
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// TODO: add support? 	TokenNameCOMMENT_LINE	TODO: add support? 
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getPronunciation	TokenNameIdentifier	 get Pronunciation
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
char	TokenNamechar	
surface	TokenNameIdentifier	 surface
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// TODO: add support? 	TokenNameCOMMENT_LINE	TODO: add support? 
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionType	TokenNameIdentifier	 get Inflection Type
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// TODO: add support? 	TokenNameCOMMENT_LINE	TODO: add support? 
}	TokenNameRBRACE	
//@Override 	TokenNameCOMMENT_LINE	@Override 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getInflectionForm	TokenNameIdentifier	 get Inflection Form
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// TODO: add support? 	TokenNameCOMMENT_LINE	TODO: add support? 
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getAllFeaturesArray	TokenNameIdentifier	 get All Features Array
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
allFeatures	TokenNameIdentifier	 all Features
=	TokenNameEQUAL	
data	TokenNameIdentifier	 data
[	TokenNameLBRACKET	
wordId	TokenNameIdentifier	 word Id
-	TokenNameMINUS	
CUSTOM_DICTIONARY_WORD_ID_OFFSET	TokenNameIdentifier	 CUSTOM  DICTIONARY  WORD  ID  OFFSET
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
allFeatures	TokenNameIdentifier	 all Features
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
allFeatures	TokenNameIdentifier	 all Features
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
INTERNAL_SEPARATOR	TokenNameIdentifier	 INTERNAL  SEPARATOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
int	TokenNameint	
wordId	TokenNameIdentifier	 word Id
,	TokenNameCOMMA	
int	TokenNameint	
...	TokenNameELLIPSIS	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
allFeatures	TokenNameIdentifier	 all Features
=	TokenNameEQUAL	
getAllFeaturesArray	TokenNameIdentifier	 get All Features Array
(	TokenNameLPAREN	
wordId	TokenNameIdentifier	 word Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
allFeatures	TokenNameIdentifier	 all Features
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All features 	TokenNameCOMMENT_LINE	All features 
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
feature	TokenNameIdentifier	 feature
:	TokenNameCOLON	
allFeatures	TokenNameIdentifier	 all Features
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
quoteEscape	TokenNameIdentifier	 quote Escape
(	TokenNameLPAREN	
feature	TokenNameIdentifier	 feature
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fields	TokenNameIdentifier	 fields
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// One feature doesn't need to escape value 	TokenNameCOMMENT_LINE	One feature doesn't need to escape value 
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
allFeatures	TokenNameIdentifier	 all Features
[	TokenNameLBRACKET	
fields	TokenNameIdentifier	 fields
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
field	TokenNameIdentifier	 field
:	TokenNameCOLON	
fields	TokenNameIdentifier	 fields
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
CSVUtil	TokenNameIdentifier	 CSV Util
.	TokenNameDOT	
quoteEscape	TokenNameIdentifier	 quote Escape
(	TokenNameLPAREN	
allFeatures	TokenNameIdentifier	 all Features
[	TokenNameLBRACKET	
field	TokenNameIdentifier	 field
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
deleteCharAt	TokenNameIdentifier	 delete Char At
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
