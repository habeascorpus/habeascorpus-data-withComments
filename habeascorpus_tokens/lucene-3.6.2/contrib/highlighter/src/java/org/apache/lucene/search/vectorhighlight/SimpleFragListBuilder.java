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
Iterator	TokenNameIdentifier	 Iterator
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
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
.	TokenNameDOT	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
;	TokenNameSEMICOLON	
/** * A simple implementation of {@link FragListBuilder}. */	TokenNameCOMMENT_JAVADOC	 A simple implementation of {@link FragListBuilder}. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
implements	TokenNameimplements	
FragListBuilder	TokenNameIdentifier	 Frag List Builder
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MARGIN_DEFAULT	TokenNameIdentifier	 MARGIN  DEFAULT
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MIN_FRAG_CHAR_SIZE_FACTOR	TokenNameIdentifier	 MIN  FRAG  CHAR  SIZE  FACTOR
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
margin	TokenNameIdentifier	 margin
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
minFragCharSize	TokenNameIdentifier	 min Frag Char Size
;	TokenNameSEMICOLON	
public	TokenNamepublic	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
(	TokenNameLPAREN	
int	TokenNameint	
margin	TokenNameIdentifier	 margin
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
margin	TokenNameIdentifier	 margin
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"margin("	TokenNameStringLiteral	margin(
+	TokenNamePLUS	
margin	TokenNameIdentifier	 margin
+	TokenNamePLUS	
") is too small. It must be 0 or higher."	TokenNameStringLiteral	) is too small. It must be 0 or higher.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
margin	TokenNameIdentifier	 margin
=	TokenNameEQUAL	
margin	TokenNameIdentifier	 margin
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
minFragCharSize	TokenNameIdentifier	 min Frag Char Size
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
margin	TokenNameIdentifier	 margin
*	TokenNameMULTIPLY	
MIN_FRAG_CHAR_SIZE_FACTOR	TokenNameIdentifier	 MIN  FRAG  CHAR  SIZE  FACTOR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
SimpleFragListBuilder	TokenNameIdentifier	 Simple Frag List Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
MARGIN_DEFAULT	TokenNameIdentifier	 MARGIN  DEFAULT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FieldFragList	TokenNameIdentifier	 Field Frag List
createFieldFragList	TokenNameIdentifier	 create Field Frag List
(	TokenNameLPAREN	
FieldPhraseList	TokenNameIdentifier	 Field Phrase List
fieldPhraseList	TokenNameIdentifier	 field Phrase List
,	TokenNameCOMMA	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fragCharSize	TokenNameIdentifier	 frag Char Size
<	TokenNameLESS	
minFragCharSize	TokenNameIdentifier	 min Frag Char Size
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"fragCharSize("	TokenNameStringLiteral	fragCharSize(
+	TokenNamePLUS	
fragCharSize	TokenNameIdentifier	 frag Char Size
+	TokenNamePLUS	
") is too small. It must be "	TokenNameStringLiteral	) is too small. It must be 
+	TokenNamePLUS	
minFragCharSize	TokenNameIdentifier	 min Frag Char Size
+	TokenNamePLUS	
" or higher."	TokenNameStringLiteral	 or higher.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FieldFragList	TokenNameIdentifier	 Field Frag List
ffl	TokenNameIdentifier	 ffl
=	TokenNameEQUAL	
new	TokenNamenew	
FieldFragList	TokenNameIdentifier	 Field Frag List
(	TokenNameLPAREN	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
wpil	TokenNameIdentifier	 wpil
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
ite	TokenNameIdentifier	 ite
=	TokenNameEQUAL	
fieldPhraseList	TokenNameIdentifier	 field Phrase List
.	TokenNameDOT	
phraseList	TokenNameIdentifier	 phrase List
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
phraseInfo	TokenNameIdentifier	 phrase Info
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
taken	TokenNameIdentifier	 taken
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
taken	TokenNameIdentifier	 taken
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
phraseInfo	TokenNameIdentifier	 phrase Info
=	TokenNameEQUAL	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
taken	TokenNameIdentifier	 taken
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// if the phrase violates the border of previous fragment, discard it and try next phrase 	TokenNameCOMMENT_LINE	if the phrase violates the border of previous fragment, discard it and try next phrase 
if	TokenNameif	
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
wpil	TokenNameIdentifier	 wpil
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
wpil	TokenNameIdentifier	 wpil
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
margin	TokenNameIdentifier	 margin
<	TokenNameLESS	
startOffset	TokenNameIdentifier	 start Offset
?	TokenNameQUESTION	
startOffset	TokenNameIdentifier	 start Offset
:	TokenNameCOLON	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
getStartOffset	TokenNameIdentifier	 get Start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
margin	TokenNameIdentifier	 margin
;	TokenNameSEMICOLON	
int	TokenNameint	
en	TokenNameIdentifier	 en
=	TokenNameEQUAL	
st	TokenNameIdentifier	 st
+	TokenNamePLUS	
fragCharSize	TokenNameIdentifier	 frag Char Size
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
en	TokenNameIdentifier	 en
)	TokenNameRPAREN	
en	TokenNameIdentifier	 en
=	TokenNameEQUAL	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
en	TokenNameIdentifier	 en
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
phraseInfo	TokenNameIdentifier	 phrase Info
=	TokenNameEQUAL	
ite	TokenNameIdentifier	 ite
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
taken	TokenNameIdentifier	 taken
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
getEndOffset	TokenNameIdentifier	 get End Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
en	TokenNameIdentifier	 en
)	TokenNameRPAREN	
wpil	TokenNameIdentifier	 wpil
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ffl	TokenNameIdentifier	 ffl
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
,	TokenNameCOMMA	
en	TokenNameIdentifier	 en
,	TokenNameCOMMA	
wpil	TokenNameIdentifier	 wpil
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ffl	TokenNameIdentifier	 ffl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
