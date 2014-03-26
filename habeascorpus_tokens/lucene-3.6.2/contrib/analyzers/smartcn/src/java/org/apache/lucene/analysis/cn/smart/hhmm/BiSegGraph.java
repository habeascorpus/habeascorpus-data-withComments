/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
hhmm	TokenNameIdentifier	 hhmm
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
cn	TokenNameIdentifier	 cn
.	TokenNameDOT	
smart	TokenNameIdentifier	 smart
.	TokenNameDOT	
Utility	TokenNameIdentifier	 Utility
;	TokenNameSEMICOLON	
/** * Graph representing possible token pairs (bigrams) at each start offset in the sentence. * <p> * For each start offset, a list of possible token pairs is stored. * </p> * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Graph representing possible token pairs (bigrams) at each start offset in the sentence. <p> For each start offset, a list of possible token pairs is stored. </p> @lucene.experimental 
class	TokenNameclass	
BiSegGraph	TokenNameIdentifier	 Bi Seg Graph
{	TokenNameLBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>>	TokenNameRIGHT_SHIFT	
tokenPairListTable	TokenNameIdentifier	 token Pair List Table
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>>	TokenNameRIGHT_SHIFT	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
segTokenList	TokenNameIdentifier	 seg Token List
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
BigramDictionary	TokenNameIdentifier	 Bigram Dictionary
bigramDict	TokenNameIdentifier	 bigram Dict
=	TokenNameEQUAL	
BigramDictionary	TokenNameIdentifier	 Bigram Dictionary
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
BiSegGraph	TokenNameIdentifier	 Bi Seg Graph
(	TokenNameLPAREN	
SegGraph	TokenNameIdentifier	 Seg Graph
segGraph	TokenNameIdentifier	 seg Graph
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segTokenList	TokenNameIdentifier	 seg Token List
=	TokenNameEQUAL	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
makeIndex	TokenNameIdentifier	 make Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
generateBiSegGraph	TokenNameIdentifier	 generate Bi Seg Graph
(	TokenNameLPAREN	
segGraph	TokenNameIdentifier	 seg Graph
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* * Generate a BiSegGraph based upon a SegGraph */	TokenNameCOMMENT_BLOCK	 Generate a BiSegGraph based upon a SegGraph 
private	TokenNameprivate	
void	TokenNamevoid	
generateBiSegGraph	TokenNameIdentifier	 generate Bi Seg Graph
(	TokenNameLPAREN	
SegGraph	TokenNameIdentifier	 Seg Graph
segGraph	TokenNameIdentifier	 seg Graph
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
smooth	TokenNameIdentifier	 smooth
=	TokenNameEQUAL	
0.1	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
wordPairFreq	TokenNameIdentifier	 word Pair Freq
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxStart	TokenNameIdentifier	 max Start
=	TokenNameEQUAL	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
getMaxStart	TokenNameIdentifier	 get Max Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
oneWordFreq	TokenNameIdentifier	 one Word Freq
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
tinyDouble	TokenNameIdentifier	 tiny Double
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
MAX_FREQUENCE	TokenNameIdentifier	 MAX  FREQUENCE
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
idBuffer	TokenNameIdentifier	 id Buffer
;	TokenNameSEMICOLON	
// get the list of tokens ordered and indexed 	TokenNameCOMMENT_LINE	get the list of tokens ordered and indexed 
segTokenList	TokenNameIdentifier	 seg Token List
=	TokenNameEQUAL	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
makeIndex	TokenNameIdentifier	 make Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Because the beginning position of startToken is -1, therefore startToken can be obtained when key = -1 	TokenNameCOMMENT_LINE	Because the beginning position of startToken is -1, therefore startToken can be obtained when key = -1 
int	TokenNameint	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
nextTokens	TokenNameIdentifier	 next Tokens
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
<	TokenNameLESS	
maxStart	TokenNameIdentifier	 max Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
isStartExist	TokenNameIdentifier	 is Start Exist
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
tokenList	TokenNameIdentifier	 token List
=	TokenNameEQUAL	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
getStartList	TokenNameIdentifier	 get Start List
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Calculate all tokens for a given key. 	TokenNameCOMMENT_LINE	Calculate all tokens for a given key. 
for	TokenNamefor	
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
t1	TokenNameIdentifier	 t1
:	TokenNameCOLON	
tokenList	TokenNameIdentifier	 token List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
oneWordFreq	TokenNameIdentifier	 one Word Freq
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
nextTokens	TokenNameIdentifier	 next Tokens
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Find the next corresponding Token. 	TokenNameCOMMENT_LINE	Find the next corresponding Token. 
// For example: "Sunny seashore", the present Token is "sunny", next one should be "sea" or "seashore". 	TokenNameCOMMENT_LINE	For example: "Sunny seashore", the present Token is "sunny", next one should be "sea" or "seashore". 
// If we cannot find the next Token, then go to the end and repeat the same cycle. 	TokenNameCOMMENT_LINE	If we cannot find the next Token, then go to the end and repeat the same cycle. 
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
<=	TokenNameLESS_EQUAL	
maxStart	TokenNameIdentifier	 max Start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Because the beginning position of endToken is sentenceLen, so equal to sentenceLen can find endToken. 	TokenNameCOMMENT_LINE	Because the beginning position of endToken is sentenceLen, so equal to sentenceLen can find endToken. 
if	TokenNameif	
(	TokenNameLPAREN	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
isStartExist	TokenNameIdentifier	 is Start Exist
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextTokens	TokenNameIdentifier	 next Tokens
=	TokenNameEQUAL	
segGraph	TokenNameIdentifier	 seg Graph
.	TokenNameDOT	
getStartList	TokenNameIdentifier	 get Start List
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
next	TokenNameIdentifier	 next
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nextTokens	TokenNameIdentifier	 next Tokens
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
t2	TokenNameIdentifier	 t2
:	TokenNameCOLON	
nextTokens	TokenNameIdentifier	 next Tokens
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idBuffer	TokenNameIdentifier	 id Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idBuffer	TokenNameIdentifier	 id Buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idBuffer	TokenNameIdentifier	 id Buffer
[	TokenNameLBRACKET	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
BigramDictionary	TokenNameIdentifier	 Bigram Dictionary
.	TokenNameDOT	
WORD_SEGMENT_CHAR	TokenNameIdentifier	 WORD  SEGMENT  CHAR
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idBuffer	TokenNameIdentifier	 id Buffer
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Two linked Words frequency 	TokenNameCOMMENT_LINE	Two linked Words frequency 
wordPairFreq	TokenNameIdentifier	 word Pair Freq
=	TokenNameEQUAL	
bigramDict	TokenNameIdentifier	 bigram Dict
.	TokenNameDOT	
getFrequency	TokenNameIdentifier	 get Frequency
(	TokenNameLPAREN	
idBuffer	TokenNameIdentifier	 id Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Smoothing 	TokenNameCOMMENT_LINE	Smoothing 
// -log{a*P(Ci-1)+(1-a)P(Ci|Ci-1)} Note 0<a<1 	TokenNameCOMMENT_LINE	-log{a*P(Ci-1)+(1-a)P(Ci|Ci-1)} Note 0<a<1 
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
smooth	TokenNameIdentifier	 smooth
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
oneWordFreq	TokenNameIdentifier	 one Word Freq
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
Utility	TokenNameIdentifier	 Utility
.	TokenNameDOT	
MAX_FREQUENCE	TokenNameIdentifier	 MAX  FREQUENCE
+	TokenNamePLUS	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
smooth	TokenNameIdentifier	 smooth
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
-	TokenNameMINUS	
tinyDouble	TokenNameIdentifier	 tiny Double
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
wordPairFreq	TokenNameIdentifier	 word Pair Freq
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
1.0	TokenNameDoubleLiteral	
+	TokenNamePLUS	
oneWordFreq	TokenNameIdentifier	 one Word Freq
)	TokenNameRPAREN	
+	TokenNamePLUS	
tinyDouble	TokenNameIdentifier	 tiny Double
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
tokenPair	TokenNameIdentifier	 token Pair
=	TokenNameEQUAL	
new	TokenNamenew	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
(	TokenNameLPAREN	
idBuffer	TokenNameIdentifier	 id Buffer
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
addSegTokenPair	TokenNameIdentifier	 add Seg Token Pair
(	TokenNameLPAREN	
tokenPair	TokenNameIdentifier	 token Pair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
key	TokenNameIdentifier	 key
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns true if their is a list of token pairs at this offset (index of the second token) * * @param to index of the second token in the token pair * @return true if a token pair exists */	TokenNameCOMMENT_JAVADOC	 Returns true if their is a list of token pairs at this offset (index of the second token) * @param to index of the second token in the token pair @return true if a token pair exists 
public	TokenNamepublic	
boolean	TokenNameboolean	
isToExist	TokenNameIdentifier	 is To Exist
(	TokenNameLPAREN	
int	TokenNameint	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenPairListTable	TokenNameIdentifier	 token Pair List Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return a {@link List} of all token pairs at this offset (index of the second token) * * @param to index of the second token in the token pair * @return {@link List} of token pairs. */	TokenNameCOMMENT_JAVADOC	 Return a {@link List} of all token pairs at this offset (index of the second token) * @param to index of the second token in the token pair @return {@link List} of token pairs. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>	TokenNameGREATER	
getToList	TokenNameIdentifier	 get To List
(	TokenNameLPAREN	
int	TokenNameint	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenPairListTable	TokenNameIdentifier	 token Pair List Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a {@link SegTokenPair} * * @param tokenPair {@link SegTokenPair} */	TokenNameCOMMENT_JAVADOC	 Add a {@link SegTokenPair} * @param tokenPair {@link SegTokenPair} 
public	TokenNamepublic	
void	TokenNamevoid	
addSegTokenPair	TokenNameIdentifier	 add Seg Token Pair
(	TokenNameLPAREN	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
tokenPair	TokenNameIdentifier	 token Pair
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
tokenPair	TokenNameIdentifier	 token Pair
.	TokenNameDOT	
to	TokenNameIdentifier	 to
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isToExist	TokenNameIdentifier	 is To Exist
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>	TokenNameGREATER	
newlist	TokenNameIdentifier	 newlist
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newlist	TokenNameIdentifier	 newlist
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tokenPair	TokenNameIdentifier	 token Pair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenPairListTable	TokenNameIdentifier	 token Pair List Table
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
,	TokenNameCOMMA	
newlist	TokenNameIdentifier	 newlist
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>	TokenNameGREATER	
tokenPairList	TokenNameIdentifier	 token Pair List
=	TokenNameEQUAL	
tokenPairListTable	TokenNameIdentifier	 token Pair List Table
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokenPairList	TokenNameIdentifier	 token Pair List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
tokenPair	TokenNameIdentifier	 token Pair
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the number of {@link SegTokenPair} entries in the table. * @return number of {@link SegTokenPair} entries */	TokenNameCOMMENT_JAVADOC	 Get the number of {@link SegTokenPair} entries in the table. @return number of {@link SegTokenPair} entries 
public	TokenNamepublic	
int	TokenNameint	
getToCount	TokenNameIdentifier	 get To Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
tokenPairListTable	TokenNameIdentifier	 token Pair List Table
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the shortest path with the Viterbi algorithm. * @return {@link List} */	TokenNameCOMMENT_JAVADOC	 Find the shortest path with the Viterbi algorithm. @return {@link List} 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
getShortPath	TokenNameIdentifier	 get Short Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
int	TokenNameint	
nodeCount	TokenNameIdentifier	 node Count
=	TokenNameEQUAL	
getToCount	TokenNameIdentifier	 get To Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PathNode	TokenNameIdentifier	 Path Node
>	TokenNameGREATER	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
PathNode	TokenNameIdentifier	 Path Node
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PathNode	TokenNameIdentifier	 Path Node
zeroPath	TokenNameIdentifier	 zero Path
=	TokenNameEQUAL	
new	TokenNamenew	
PathNode	TokenNameIdentifier	 Path Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
zeroPath	TokenNameIdentifier	 zero Path
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
zeroPath	TokenNameIdentifier	 zero Path
.	TokenNameDOT	
preNode	TokenNameIdentifier	 pre Node
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
zeroPath	TokenNameIdentifier	 zero Path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
<=	TokenNameLESS_EQUAL	
nodeCount	TokenNameIdentifier	 node Count
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>	TokenNameGREATER	
edges	TokenNameIdentifier	 edges
=	TokenNameEQUAL	
getToList	TokenNameIdentifier	 get To List
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
minWeight	TokenNameIdentifier	 min Weight
=	TokenNameEQUAL	
Double	TokenNameIdentifier	 Double
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
minEdge	TokenNameIdentifier	 min Edge
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
edge	TokenNameIdentifier	 edge
:	TokenNameCOLON	
edges	TokenNameIdentifier	 edges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
PathNode	TokenNameIdentifier	 Path Node
preNode	TokenNameIdentifier	 pre Node
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
edge	TokenNameIdentifier	 edge
.	TokenNameDOT	
from	TokenNameIdentifier	 from
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
preNode	TokenNameIdentifier	 pre Node
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
+	TokenNamePLUS	
weight	TokenNameIdentifier	 weight
<	TokenNameLESS	
minWeight	TokenNameIdentifier	 min Weight
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minWeight	TokenNameIdentifier	 min Weight
=	TokenNameEQUAL	
preNode	TokenNameIdentifier	 pre Node
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
+	TokenNamePLUS	
weight	TokenNameIdentifier	 weight
;	TokenNameSEMICOLON	
minEdge	TokenNameIdentifier	 min Edge
=	TokenNameEQUAL	
edge	TokenNameIdentifier	 edge
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
PathNode	TokenNameIdentifier	 Path Node
newNode	TokenNameIdentifier	 new Node
=	TokenNameEQUAL	
new	TokenNamenew	
PathNode	TokenNameIdentifier	 Path Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
weight	TokenNameIdentifier	 weight
=	TokenNameEQUAL	
minWeight	TokenNameIdentifier	 min Weight
;	TokenNameSEMICOLON	
newNode	TokenNameIdentifier	 new Node
.	TokenNameDOT	
preNode	TokenNameIdentifier	 pre Node
=	TokenNameEQUAL	
minEdge	TokenNameIdentifier	 min Edge
.	TokenNameDOT	
from	TokenNameIdentifier	 from
;	TokenNameSEMICOLON	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newNode	TokenNameIdentifier	 new Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Calculate PathNodes 	TokenNameCOMMENT_LINE	Calculate PathNodes 
int	TokenNameint	
preNode	TokenNameIdentifier	 pre Node
,	TokenNameCOMMA	
lastNode	TokenNameIdentifier	 last Node
;	TokenNameSEMICOLON	
lastNode	TokenNameIdentifier	 last Node
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
lastNode	TokenNameIdentifier	 last Node
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
rpath	TokenNameIdentifier	 rpath
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
resultPath	TokenNameIdentifier	 result Path
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rpath	TokenNameIdentifier	 rpath
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PathNode	TokenNameIdentifier	 Path Node
currentPathNode	TokenNameIdentifier	 current Path Node
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
preNode	TokenNameIdentifier	 pre Node
=	TokenNameEQUAL	
currentPathNode	TokenNameIdentifier	 current Path Node
.	TokenNameDOT	
preNode	TokenNameIdentifier	 pre Node
;	TokenNameSEMICOLON	
rpath	TokenNameIdentifier	 rpath
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
preNode	TokenNameIdentifier	 pre Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
preNode	TokenNameIdentifier	 pre Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
rpath	TokenNameIdentifier	 rpath
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
idInteger	TokenNameIdentifier	 id Integer
=	TokenNameEQUAL	
rpath	TokenNameIdentifier	 rpath
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
idInteger	TokenNameIdentifier	 id Integer
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SegToken	TokenNameIdentifier	 Seg Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
segTokenList	TokenNameIdentifier	 seg Token List
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultPath	TokenNameIdentifier	 result Path
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
resultPath	TokenNameIdentifier	 result Path
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
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>>	TokenNameRIGHT_SHIFT	
values	TokenNameIdentifier	 values
=	TokenNameEQUAL	
tokenPairListTable	TokenNameIdentifier	 token Pair List Table
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
>	TokenNameGREATER	
segList	TokenNameIdentifier	 seg List
:	TokenNameCOLON	
values	TokenNameIdentifier	 values
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
SegTokenPair	TokenNameIdentifier	 Seg Token Pair
pair	TokenNameIdentifier	 pair
:	TokenNameCOLON	
segList	TokenNameIdentifier	 seg List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
pair	TokenNameIdentifier	 pair
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
