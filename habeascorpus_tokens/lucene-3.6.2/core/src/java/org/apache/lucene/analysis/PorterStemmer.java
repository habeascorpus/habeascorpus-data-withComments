package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* Porter stemmer in Java. The original paper is in Porter, 1980, An algorithm for suffix stripping, Program, Vol. 14, no. 3, pp 130-137, See also http://www.tartarus.org/~martin/PorterStemmer/index.html Bug 1 (reported by Gonzalo Parra 16/10/99) fixed as marked below. Tthe words 'aed', 'eed', 'oed' leave k at 'a' for step 3, and b[k-1] is then out outside the bounds of b. Similarly, Bug 2 (reported by Steve Dyrdahl 22/2/00) fixed as marked below. 'ion' by itself leaves j = -1 in the test for 'ion' in step 5, and b[j] is then outside the bounds of b. Release 3. [ This version is derived from Release 3, modified by Brian Goetz to optimize for fewer object creations. ] */	TokenNameCOMMENT_BLOCK	 Porter stemmer in Java. The original paper is in Porter, 1980, An algorithm for suffix stripping, Program, Vol. 14, no. 3, pp 130-137, See also http://www.tartarus.org/~martin/PorterStemmer/index.html Bug 1 (reported by Gonzalo Parra 16/10/99) fixed as marked below. Tthe words 'aed', 'eed', 'oed' leave k at 'a' for step 3, and b[k-1] is then out outside the bounds of b. Similarly, Bug 2 (reported by Steve Dyrdahl 22/2/00) fixed as marked below. 'ion' by itself leaves j = -1 in the test for 'ion' in step 5, and b[j] is then outside the bounds of b. Release 3. [ This version is derived from Release 3, modified by Brian Goetz to optimize for fewer object creations. ] 
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
InputStream	TokenNameIdentifier	 Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileInputStream	TokenNameIdentifier	 File Input Stream
;	TokenNameSEMICOLON	
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
RamUsageEstimator	TokenNameIdentifier	 Ram Usage Estimator
.	TokenNameDOT	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
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
/** * * Stemmer, implementing the Porter Stemming Algorithm * * The Stemmer class transforms a word into its root form. The input * word can be provided a character at time (by calling add()), or at once * by calling one of the various stem(something) methods. */	TokenNameCOMMENT_JAVADOC	 * Stemmer, implementing the Porter Stemming Algorithm * The Stemmer class transforms a word into its root form. The input word can be provided a character at time (by calling add()), or at once by calling one of the various stem(something) methods. 
class	TokenNameclass	
PorterStemmer	TokenNameIdentifier	 Porter Stemmer
{	TokenNameLBRACE	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
/* offset into b */	TokenNameCOMMENT_BLOCK	 offset into b 
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
k0	TokenNameIdentifier	 k0
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_SIZE	TokenNameIdentifier	 INITIAL  SIZE
=	TokenNameEQUAL	
50	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PorterStemmer	TokenNameIdentifier	 Porter Stemmer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
INITIAL_SIZE	TokenNameIdentifier	 INITIAL  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * reset() resets the stemmer so it can stem another word. If you invoke * the stemmer by calling add(char) and then stem(), you must call reset() * before starting another word. */	TokenNameCOMMENT_JAVADOC	 reset() resets the stemmer so it can stem another word. If you invoke the stemmer by calling add(char) and then stem(), you must call reset() before starting another word. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a character to the word being stemmed. When you are finished * adding characters, you can call stem(void) to process the word. */	TokenNameCOMMENT_JAVADOC	 Add a character to the word being stemmed. When you are finished adding characters, you can call stem(void) to process the word. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<=	TokenNameLESS_EQUAL	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * After a word has been stemmed, it can be retrieved by toString(), * or a reference to the internal buffer can be retrieved by getResultBuffer * and getResultLength (which is generally more efficient.) */	TokenNameCOMMENT_JAVADOC	 After a word has been stemmed, it can be retrieved by toString(), or a reference to the internal buffer can be retrieved by getResultBuffer and getResultLength (which is generally more efficient.) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the length of the word resulting from the stemming process. */	TokenNameCOMMENT_JAVADOC	 Returns the length of the word resulting from the stemming process. 
public	TokenNamepublic	
int	TokenNameint	
getResultLength	TokenNameIdentifier	 get Result Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a reference to a character buffer containing the results of * the stemming process. You also need to consult getResultLength() * to determine the length of the result. */	TokenNameCOMMENT_JAVADOC	 Returns a reference to a character buffer containing the results of the stemming process. You also need to consult getResultLength() to determine the length of the result. 
public	TokenNamepublic	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getResultBuffer	TokenNameIdentifier	 get Result Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* cons(i) is true <=> b[i] is a consonant. */	TokenNameCOMMENT_BLOCK	 cons(i) is true <=> b[i] is a consonant. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'o'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'y'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
k0	TokenNameIdentifier	 k0
)	TokenNameRPAREN	
?	TokenNameQUESTION	
true	TokenNametrue	
:	TokenNameCOLON	
!	TokenNameNOT	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* m() measures the number of consonant sequences between k0 and j. if c is a consonant sequence and v a vowel sequence, and <..> indicates arbitrary presence, <c><v> gives 0 <c>vc<v> gives 1 <c>vcvc<v> gives 2 <c>vcvcvc<v> gives 3 .... */	TokenNameCOMMENT_BLOCK	 m() measures the number of consonant sequences between k0 and j. if c is a consonant sequence and v a vowel sequence, and <..> indicates arbitrary presence, <c><v> gives 0 <c>vc<v> gives 1 <c>vcvc<v> gives 2 <c>vcvcvc<v> gives 3 .... 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
m	TokenNameIdentifier	 m
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
k0	TokenNameIdentifier	 k0
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
return	TokenNamereturn	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* vowelinstem() is true <=> k0,...j contains a vowel */	TokenNameCOMMENT_BLOCK	 vowelinstem() is true <=> k0,...j contains a vowel 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
vowelinstem	TokenNameIdentifier	 vowelinstem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
k0	TokenNameIdentifier	 k0
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* doublec(j) is true <=> j,(j-1) contain a double consonant. */	TokenNameCOMMENT_BLOCK	 doublec(j) is true <=> j,(j-1) contain a double consonant. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
doublec	TokenNameIdentifier	 doublec
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
k0	TokenNameIdentifier	 k0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* cvc(i) is true <=> i-2,i-1,i has the form consonant - vowel - consonant and also if the second c is not w,x or y. this is used when trying to restore an e at the end of a short word. e.g. cav(e), lov(e), hop(e), crim(e), but snow, box, tray. */	TokenNameCOMMENT_BLOCK	 cvc(i) is true <=> i-2,i-1,i has the form consonant - vowel - consonant and also if the second c is not w,x or y. this is used when trying to restore an e at the end of a short word. e.g. cav(e), lov(e), hop(e), crim(e), but snow, box, tray. 
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
cvc	TokenNameIdentifier	 cvc
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
k0	TokenNameIdentifier	 k0
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
||	TokenNameOR_OR	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
cons	TokenNameIdentifier	 cons
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'w'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'x'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'y'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
<	TokenNameLESS	
k0	TokenNameIdentifier	 k0
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* setto(s) sets (j+1),...k to the characters in the string s, readjusting k. */	TokenNameCOMMENT_BLOCK	 setto(s) sets (j+1),...k to the characters in the string s, readjusting k. 
void	TokenNamevoid	
setto	TokenNameIdentifier	 setto
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
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
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
o	TokenNameIdentifier	 o
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* r(s) is used further down. */	TokenNameCOMMENT_BLOCK	 r(s) is used further down. 
void	TokenNamevoid	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
setto	TokenNameIdentifier	 setto
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* step1() gets rid of plurals and -ed or -ing. e.g. caresses -> caress ponies -> poni ties -> ti caress -> caress cats -> cat feed -> feed agreed -> agree disabled -> disable matting -> mat mating -> mate meeting -> meet milling -> mill messing -> mess meetings -> meet */	TokenNameCOMMENT_BLOCK	 step1() gets rid of plurals and -ed or -ing. e.g. caresses -> caress ponies -> poni ties -> ti caress -> caress cats -> cat feed -> feed agreed -> agree disabled -> disable matting -> mat mating -> mate meeting -> meet milling -> mill messing -> mess meetings -> meet 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
step1	TokenNameIdentifier	 step1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"sses"	TokenNameStringLiteral	sses
)	TokenNameRPAREN	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
-=	TokenNameMINUS_EQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ies"	TokenNameStringLiteral	ies
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setto	TokenNameIdentifier	 setto
(	TokenNameLPAREN	
"i"	TokenNameStringLiteral	i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"eed"	TokenNameStringLiteral	eed
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ed"	TokenNameStringLiteral	ed
)	TokenNameRPAREN	
||	TokenNameOR_OR	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ing"	TokenNameStringLiteral	ing
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
vowelinstem	TokenNameIdentifier	 vowelinstem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"at"	TokenNameStringLiteral	at
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setto	TokenNameIdentifier	 setto
(	TokenNameLPAREN	
"ate"	TokenNameStringLiteral	ate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"bl"	TokenNameStringLiteral	bl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setto	TokenNameIdentifier	 setto
(	TokenNameLPAREN	
"ble"	TokenNameStringLiteral	ble
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"iz"	TokenNameStringLiteral	iz
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setto	TokenNameIdentifier	 setto
(	TokenNameLPAREN	
"ize"	TokenNameStringLiteral	ize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
doublec	TokenNameIdentifier	 doublec
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
'z'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
cvc	TokenNameIdentifier	 cvc
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
)	TokenNameRPAREN	
setto	TokenNameIdentifier	 setto
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* step2() turns terminal y to i when there is another vowel in the stem. */	TokenNameCOMMENT_BLOCK	 step2() turns terminal y to i when there is another vowel in the stem. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
step2	TokenNameIdentifier	 step2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"y"	TokenNameStringLiteral	y
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
vowelinstem	TokenNameIdentifier	 vowelinstem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'i'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* step3() maps double suffices to single ones. so -ization ( = -ize plus -ation) maps to -ize etc. note that the string before the suffix must give m() > 0. */	TokenNameCOMMENT_BLOCK	 step3() maps double suffices to single ones. so -ization ( = -ize plus -ation) maps to -ize etc. note that the string before the suffix must give m() > 0. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
step3	TokenNameIdentifier	 step3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
k0	TokenNameIdentifier	 k0
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* For Bug 1 */	TokenNameCOMMENT_BLOCK	 For Bug 1 
switch	TokenNameswitch	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ational"	TokenNameStringLiteral	ational
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ate"	TokenNameStringLiteral	ate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"tional"	TokenNameStringLiteral	tional
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"tion"	TokenNameStringLiteral	tion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"enci"	TokenNameStringLiteral	enci
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ence"	TokenNameStringLiteral	ence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"anci"	TokenNameStringLiteral	anci
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ance"	TokenNameStringLiteral	ance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"izer"	TokenNameStringLiteral	izer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ize"	TokenNameStringLiteral	ize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'l'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"bli"	TokenNameStringLiteral	bli
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ble"	TokenNameStringLiteral	ble
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"alli"	TokenNameStringLiteral	alli
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"entli"	TokenNameStringLiteral	entli
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ent"	TokenNameStringLiteral	ent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"eli"	TokenNameStringLiteral	eli
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"e"	TokenNameStringLiteral	e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ousli"	TokenNameStringLiteral	ousli
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ous"	TokenNameStringLiteral	ous
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'o'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ization"	TokenNameStringLiteral	ization
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ize"	TokenNameStringLiteral	ize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ation"	TokenNameStringLiteral	ation
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ate"	TokenNameStringLiteral	ate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ator"	TokenNameStringLiteral	ator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ate"	TokenNameStringLiteral	ate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"alism"	TokenNameStringLiteral	alism
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"iveness"	TokenNameStringLiteral	iveness
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ive"	TokenNameStringLiteral	ive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"fulness"	TokenNameStringLiteral	fulness
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ful"	TokenNameStringLiteral	ful
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ousness"	TokenNameStringLiteral	ousness
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ous"	TokenNameStringLiteral	ous
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"aliti"	TokenNameStringLiteral	aliti
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"iviti"	TokenNameStringLiteral	iviti
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ive"	TokenNameStringLiteral	ive
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"biliti"	TokenNameStringLiteral	biliti
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ble"	TokenNameStringLiteral	ble
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'g'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"logi"	TokenNameStringLiteral	logi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"log"	TokenNameStringLiteral	log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* step4() deals with -ic-, -full, -ness etc. similar strategy to step3. */	TokenNameCOMMENT_BLOCK	 step4() deals with -ic-, -full, -ness etc. similar strategy to step3. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
step4	TokenNameIdentifier	 step4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"icate"	TokenNameStringLiteral	icate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ic"	TokenNameStringLiteral	ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ative"	TokenNameStringLiteral	ative
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"alize"	TokenNameStringLiteral	alize
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"iciti"	TokenNameStringLiteral	iciti
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ic"	TokenNameStringLiteral	ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'l'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ical"	TokenNameStringLiteral	ical
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
"ic"	TokenNameStringLiteral	ic
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ful"	TokenNameStringLiteral	ful
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ness"	TokenNameStringLiteral	ness
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* step5() takes off -ant, -ence etc., in context <c>vcvc<v>. */	TokenNameCOMMENT_BLOCK	 step5() takes off -ant, -ence etc., in context <c>vcvc<v>. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
step5	TokenNameIdentifier	 step5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
==	TokenNameEQUAL_EQUAL	
k0	TokenNameIdentifier	 k0
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* for Bug 1 */	TokenNameCOMMENT_BLOCK	 for Bug 1 
switch	TokenNameswitch	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"al"	TokenNameStringLiteral	al
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'c'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ance"	TokenNameStringLiteral	ance
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ence"	TokenNameStringLiteral	ence
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"er"	TokenNameStringLiteral	er
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'i'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ic"	TokenNameStringLiteral	ic
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'l'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"able"	TokenNameStringLiteral	able
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ible"	TokenNameStringLiteral	ible
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ant"	TokenNameStringLiteral	ant
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ement"	TokenNameStringLiteral	ement
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ment"	TokenNameStringLiteral	ment
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
/* element etc. not stripped before the m */	TokenNameCOMMENT_BLOCK	 element etc. not stripped before the m 
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ent"	TokenNameStringLiteral	ent
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'o'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ion"	TokenNameStringLiteral	ion
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
j	TokenNameIdentifier	 j
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
't'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
/* j >= 0 fixes Bug 2 */	TokenNameCOMMENT_BLOCK	 j >= 0 fixes Bug 2 
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ou"	TokenNameStringLiteral	ou
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
/* takes care of -ous */	TokenNameCOMMENT_BLOCK	 takes care of -ous 
case	TokenNamecase	
's'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ism"	TokenNameStringLiteral	ism
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
't'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ate"	TokenNameStringLiteral	ate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"iti"	TokenNameStringLiteral	iti
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'u'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ous"	TokenNameStringLiteral	ous
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'v'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ive"	TokenNameStringLiteral	ive
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
case	TokenNamecase	
'z'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
(	TokenNameLPAREN	
"ize"	TokenNameStringLiteral	ize
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* step6() removes a final -e if m() > 1. */	TokenNameCOMMENT_BLOCK	 step6() removes a final -e if m() > 1. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
step6	TokenNameIdentifier	 step6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'e'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
m	TokenNameIdentifier	 m
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
!	TokenNameNOT	
cvc	TokenNameIdentifier	 cvc
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
doublec	TokenNameIdentifier	 doublec
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
m	TokenNameIdentifier	 m
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stem a word provided as a String. Returns the result as a String. */	TokenNameCOMMENT_JAVADOC	 Stem a word provided as a String. Returns the result as a String. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Stem a word contained in a char[]. Returns true if the stemming process * resulted in a word different from the input. You can retrieve the * result with getResultLength()/getResultBuffer() or toString(). */	TokenNameCOMMENT_JAVADOC	 Stem a word contained in a char[]. Returns true if the stemming process resulted in a word different from the input. You can retrieve the result with getResultLength()/getResultBuffer() or toString(). 
public	TokenNamepublic	
boolean	TokenNameboolean	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
word	TokenNameIdentifier	 word
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
word	TokenNameIdentifier	 word
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Stem a word contained in a portion of a char[] array. Returns * true if the stemming process resulted in a word different from * the input. You can retrieve the result with * getResultLength()/getResultBuffer() or toString(). */	TokenNameCOMMENT_JAVADOC	 Stem a word contained in a portion of a char[] array. Returns true if the stemming process resulted in a word different from the input. You can retrieve the result with getResultLength()/getResultBuffer() or toString(). 
public	TokenNamepublic	
boolean	TokenNameboolean	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
wordBuffer	TokenNameIdentifier	 word Buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
wordLen	TokenNameIdentifier	 word Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
wordLen	TokenNameIdentifier	 word Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
oversize	TokenNameIdentifier	 oversize
(	TokenNameLPAREN	
wordLen	TokenNameIdentifier	 word Len
,	TokenNameCOMMA	
NUM_BYTES_CHAR	TokenNameIdentifier	 NUM  BYTES  CHAR
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
wordBuffer	TokenNameIdentifier	 word Buffer
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordLen	TokenNameIdentifier	 word Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
wordLen	TokenNameIdentifier	 word Len
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Stem a word contained in a leading portion of a char[] array. * Returns true if the stemming process resulted in a word different * from the input. You can retrieve the result with * getResultLength()/getResultBuffer() or toString(). */	TokenNameCOMMENT_JAVADOC	 Stem a word contained in a leading portion of a char[] array. Returns true if the stemming process resulted in a word different from the input. You can retrieve the result with getResultLength()/getResultBuffer() or toString(). 
public	TokenNamepublic	
boolean	TokenNameboolean	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
int	TokenNameint	
wordLen	TokenNameIdentifier	 word Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
word	TokenNameIdentifier	 word
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
wordLen	TokenNameIdentifier	 word Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Stem the word placed into the Stemmer buffer through calls to add(). * Returns true if the stemming process resulted in a word different * from the input. You can retrieve the result with * getResultLength()/getResultBuffer() or toString(). */	TokenNameCOMMENT_JAVADOC	 Stem the word placed into the Stemmer buffer through calls to add(). Returns true if the stemming process resulted in a word different from the input. You can retrieve the result with getResultLength()/getResultBuffer() or toString(). 
public	TokenNamepublic	
boolean	TokenNameboolean	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
int	TokenNameint	
i0	TokenNameIdentifier	 i0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k0	TokenNameIdentifier	 k0
=	TokenNameEQUAL	
i0	TokenNameIdentifier	 i0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
>	TokenNameGREATER	
k0	TokenNameIdentifier	 k0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
step1	TokenNameIdentifier	 step1
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
step2	TokenNameIdentifier	 step2
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
step3	TokenNameIdentifier	 step3
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
step4	TokenNameIdentifier	 step4
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
step5	TokenNameIdentifier	 step5
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
step6	TokenNameIdentifier	 step6
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Also, a word is considered dirty if we lopped off letters 	TokenNameCOMMENT_LINE	Also, a word is considered dirty if we lopped off letters 
// Thanks to Ifigenia Vairelles for pointing this out. 	TokenNameCOMMENT_LINE	Thanks to Ifigenia Vairelles for pointing this out. 
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
dirty	TokenNameIdentifier	 dirty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
k	TokenNameIdentifier	 k
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
dirty	TokenNameIdentifier	 dirty
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Test program for demonstrating the Stemmer. It reads a file and * stems each word, writing the result to standard out. * Usage: Stemmer file-name */	TokenNameCOMMENT_JAVADOC	 Test program for demonstrating the Stemmer. It reads a file and stems each word, writing the result to standard out. Usage: Stemmer file-name 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PorterStemmer	TokenNameIdentifier	 Porter Stemmer
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
PorterStemmer	TokenNameIdentifier	 Porter Stemmer
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
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
InputStream	TokenNameIdentifier	 Input Stream
in	TokenNameIdentifier	 in
=	TokenNameEQUAL	
new	TokenNamenew	
FileInputStream	TokenNameIdentifier	 File Input Stream
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
bufferLen	TokenNameIdentifier	 buffer Len
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
bufferLen	TokenNameIdentifier	 buffer Len
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
<	TokenNameLESS	
bufferLen	TokenNameIdentifier	 buffer Len
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
bufferLen	TokenNameIdentifier	 buffer Len
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bufferLen	TokenNameIdentifier	 buffer Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"error reading "	TokenNameStringLiteral	error reading 
+	TokenNamePLUS	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
