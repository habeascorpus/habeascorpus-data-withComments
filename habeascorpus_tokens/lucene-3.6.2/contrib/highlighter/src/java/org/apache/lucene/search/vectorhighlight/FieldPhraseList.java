package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
vectorhighlight	TokenNameIdentifier	 vectorhighlight
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
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
vectorhighlight	TokenNameIdentifier	 vectorhighlight
.	TokenNameDOT	
FieldQuery	TokenNameIdentifier	 Field Query
.	TokenNameDOT	
QueryPhraseMap	TokenNameIdentifier	 Query Phrase Map
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
vectorhighlight	TokenNameIdentifier	 vectorhighlight
.	TokenNameDOT	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
.	TokenNameDOT	
TermInfo	TokenNameIdentifier	 Term Info
;	TokenNameSEMICOLON	
/** * FieldPhraseList has a list of WeightedPhraseInfo that is used by FragListBuilder * to create a FieldFragList object. */	TokenNameCOMMENT_JAVADOC	 FieldPhraseList has a list of WeightedPhraseInfo that is used by FragListBuilder to create a FieldFragList object. 
public	TokenNamepublic	
class	TokenNameclass	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
{	TokenNameLBRACE	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
phraseList	TokenNameIdentifier	 phrase List
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * create a FieldPhraseList that has no limit on the number of phrases to analyze * * @param fieldTermStack FieldTermStack object * @param fieldQuery FieldQuery object */	TokenNameCOMMENT_JAVADOC	 create a FieldPhraseList that has no limit on the number of phrases to analyze * @param fieldTermStack FieldTermStack object @param fieldQuery FieldQuery object 
public	TokenNamepublic	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
fieldTermStack	TokenNameIdentifier	 field Term Stack
,	TokenNameCOMMA	
FieldQuery	TokenNameIdentifier	 Field Query
fieldQuery	TokenNameIdentifier	 field Query
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
fieldTermStack	TokenNameIdentifier	 field Term Stack
,	TokenNameCOMMA	
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * a constructor. * * @param fieldTermStack FieldTermStack object * @param fieldQuery FieldQuery object * @param phraseLimit maximum size of phraseList */	TokenNameCOMMENT_JAVADOC	 a constructor. * @param fieldTermStack FieldTermStack object @param fieldQuery FieldQuery object @param phraseLimit maximum size of phraseList 
public	TokenNamepublic	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
(	TokenNameLPAREN	
FieldTermStack	TokenNameIdentifier	 Field Term Stack
fieldTermStack	TokenNameIdentifier	 field Term Stack
,	TokenNameCOMMA	
FieldQuery	TokenNameIdentifier	 Field Query
fieldQuery	TokenNameIdentifier	 field Query
,	TokenNameCOMMA	
int	TokenNameint	
phraseLimit	TokenNameIdentifier	 phrase Limit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
fieldTermStack	TokenNameIdentifier	 field Term Stack
.	TokenNameDOT	
getFieldName	TokenNameIdentifier	 get Field Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
TermInfo	TokenNameIdentifier	 Term Info
>	TokenNameGREATER	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
TermInfo	TokenNameIdentifier	 Term Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
QueryPhraseMap	TokenNameIdentifier	 Query Phrase Map
currMap	TokenNameIdentifier	 curr Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
QueryPhraseMap	TokenNameIdentifier	 Query Phrase Map
nextMap	TokenNameIdentifier	 next Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
fieldTermStack	TokenNameIdentifier	 field Term Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
phraseLimit	TokenNameIdentifier	 phrase Limit
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
fieldTermStack	TokenNameIdentifier	 field Term Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currMap	TokenNameIdentifier	 curr Map
=	TokenNameEQUAL	
fieldQuery	TokenNameIdentifier	 field Query
.	TokenNameDOT	
getFieldTermMap	TokenNameIdentifier	 get Field Term Map
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if not found, discard top TermInfo from stack, then try next element 	TokenNameCOMMENT_LINE	if not found, discard top TermInfo from stack, then try next element 
if	TokenNameif	
(	TokenNameLPAREN	
currMap	TokenNameIdentifier	 curr Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// if found, search the longest phrase 	TokenNameCOMMENT_LINE	if found, search the longest phrase 
phraseCandidate	TokenNameIdentifier	 phrase Candidate
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
fieldTermStack	TokenNameIdentifier	 field Term Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nextMap	TokenNameIdentifier	 next Map
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
nextMap	TokenNameIdentifier	 next Map
=	TokenNameEQUAL	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
getTermMap	TokenNameIdentifier	 get Term Map
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
nextMap	TokenNameIdentifier	 next Map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
fieldTermStack	TokenNameIdentifier	 field Term Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
isValidTermOrPhrase	TokenNameIdentifier	 is Valid Term Or Phrase
(	TokenNameLPAREN	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addIfNoOverlap	TokenNameIdentifier	 add If No Overlap
(	TokenNameLPAREN	
new	TokenNamenew	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
(	TokenNameLPAREN	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
,	TokenNameCOMMA	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
getTermOrPhraseNumber	TokenNameIdentifier	 get Term Or Phrase Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fieldTermStack	TokenNameIdentifier	 field Term Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
.	TokenNameDOT	
removeLast	TokenNameIdentifier	 remove Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currMap	TokenNameIdentifier	 curr Map
=	TokenNameEQUAL	
fieldQuery	TokenNameIdentifier	 field Query
.	TokenNameDOT	
searchPhrase	TokenNameIdentifier	 search Phrase
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currMap	TokenNameIdentifier	 curr Map
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
addIfNoOverlap	TokenNameIdentifier	 add If No Overlap
(	TokenNameLPAREN	
new	TokenNamenew	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
(	TokenNameLPAREN	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
,	TokenNameCOMMA	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
currMap	TokenNameIdentifier	 curr Map
.	TokenNameDOT	
getTermOrPhraseNumber	TokenNameIdentifier	 get Term Or Phrase Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
phraseCandidate	TokenNameIdentifier	 phrase Candidate
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currMap	TokenNameIdentifier	 curr Map
=	TokenNameEQUAL	
nextMap	TokenNameIdentifier	 next Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
void	TokenNamevoid	
addIfNoOverlap	TokenNameIdentifier	 add If No Overlap
(	TokenNameLPAREN	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
wpi	TokenNameIdentifier	 wpi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
existWpi	TokenNameIdentifier	 exist Wpi
:	TokenNameCOLON	
phraseList	TokenNameIdentifier	 phrase List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
existWpi	TokenNameIdentifier	 exist Wpi
.	TokenNameDOT	
isOffsetOverlap	TokenNameIdentifier	 is Offset Overlap
(	TokenNameLPAREN	
wpi	TokenNameIdentifier	 wpi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
wpi	TokenNameIdentifier	 wpi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
// unnecessary member, just exists for debugging purpose 	TokenNameCOMMENT_LINE	unnecessary member, just exists for debugging purpose 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Toffs	TokenNameIdentifier	 Toffs
>	TokenNameGREATER	
termsOffsets	TokenNameIdentifier	 terms Offsets
;	TokenNameSEMICOLON	
// usually termsOffsets.size() == 1, 	TokenNameCOMMENT_LINE	usually termsOffsets.size() == 1, 
// but if position-gap > 1 and slop > 0 then size() could be greater than 1 	TokenNameCOMMENT_LINE	but if position-gap > 1 and slop > 0 then size() could be greater than 1 
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
// query boost 	TokenNameCOMMENT_LINE	query boost 
int	TokenNameint	
seqnum	TokenNameIdentifier	 seqnum
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
(	TokenNameLPAREN	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
TermInfo	TokenNameIdentifier	 Term Info
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
boost	TokenNameIdentifier	 boost
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
(	TokenNameLPAREN	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
TermInfo	TokenNameIdentifier	 Term Info
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
float	TokenNamefloat	
boost	TokenNameIdentifier	 boost
,	TokenNameCOMMA	
int	TokenNameint	
number	TokenNameIdentifier	 number
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
=	TokenNameEQUAL	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
seqnum	TokenNameIdentifier	 seqnum
=	TokenNameEQUAL	
number	TokenNameIdentifier	 number
;	TokenNameSEMICOLON	
termsOffsets	TokenNameIdentifier	 terms Offsets
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Toffs	TokenNameIdentifier	 Toffs
>	TokenNameGREATER	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermInfo	TokenNameIdentifier	 Term Info
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termsOffsets	TokenNameIdentifier	 terms Offsets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Toffs	TokenNameIdentifier	 Toffs
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
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
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getText	TokenNameIdentifier	 get Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Toffs	TokenNameIdentifier	 Toffs
to	TokenNameIdentifier	 to
=	TokenNameEQUAL	
termsOffsets	TokenNameIdentifier	 terms Offsets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
termsOffsets	TokenNameIdentifier	 terms Offsets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
setEndOffset	TokenNameIdentifier	 set End Offset
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
termsOffsets	TokenNameIdentifier	 terms Offsets
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Toffs	TokenNameIdentifier	 Toffs
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
ti	TokenNameIdentifier	 ti
.	TokenNameDOT	
getPosition	TokenNameIdentifier	 get Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termsOffsets	TokenNameIdentifier	 terms Offsets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termsOffsets	TokenNameIdentifier	 terms Offsets
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
termsOffsets	TokenNameIdentifier	 terms Offsets
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isOffsetOverlap	TokenNameIdentifier	 is Offset Overlap
(	TokenNameLPAREN	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
so	TokenNameIdentifier	 so
=	TokenNameEQUAL	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
eo	TokenNameIdentifier	 eo
=	TokenNameEQUAL	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
oso	TokenNameIdentifier	 oso
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
oeo	TokenNameIdentifier	 oeo
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
so	TokenNameIdentifier	 so
<=	TokenNameLESS_EQUAL	
oso	TokenNameIdentifier	 oso
&&	TokenNameAND_AND	
oso	TokenNameIdentifier	 oso
<	TokenNameLESS	
eo	TokenNameIdentifier	 eo
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
so	TokenNameIdentifier	 so
<	TokenNameLESS	
oeo	TokenNameIdentifier	 oeo
&&	TokenNameAND_AND	
oeo	TokenNameIdentifier	 oeo
<=	TokenNameLESS_EQUAL	
eo	TokenNameIdentifier	 eo
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oso	TokenNameIdentifier	 oso
<=	TokenNameLESS_EQUAL	
so	TokenNameIdentifier	 so
&&	TokenNameAND_AND	
so	TokenNameIdentifier	 so
<	TokenNameLESS	
oeo	TokenNameIdentifier	 oeo
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oso	TokenNameIdentifier	 oso
<	TokenNameLESS	
eo	TokenNameIdentifier	 eo
&&	TokenNameAND_AND	
eo	TokenNameIdentifier	 eo
<=	TokenNameLESS_EQUAL	
oeo	TokenNameIdentifier	 oeo
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
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
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
boost	TokenNameIdentifier	 boost
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")("	TokenNameStringLiteral	)(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Toffs	TokenNameIdentifier	 Toffs
to	TokenNameIdentifier	 to
:	TokenNameCOLON	
termsOffsets	TokenNameIdentifier	 terms Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
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
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Toffs	TokenNameIdentifier	 Toffs
{	TokenNameLBRACE	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Toffs	TokenNameIdentifier	 Toffs
(	TokenNameLPAREN	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setEndOffset	TokenNameIdentifier	 set End Offset
(	TokenNameLPAREN	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
endOffset	TokenNameIdentifier	 end Offset
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
'('	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
','	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
')'	TokenNameCharacterLiteral	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
