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
.	TokenNameDOT	
Toffs	TokenNameIdentifier	 Toffs
;	TokenNameSEMICOLON	
/** * FieldFragList has a list of "frag info" that is used by FragmentsBuilder class * to create fragments (snippets). */	TokenNameCOMMENT_JAVADOC	 FieldFragList has a list of "frag info" that is used by FragmentsBuilder class to create fragments (snippets). 
public	TokenNamepublic	
class	TokenNameclass	
FieldFragList	TokenNameIdentifier	 Field Frag List
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
>	TokenNameGREATER	
fragInfos	TokenNameIdentifier	 frag Infos
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * a constructor. * * @param fragCharSize the length (number of chars) of a fragment */	TokenNameCOMMENT_JAVADOC	 a constructor. * @param fragCharSize the length (number of chars) of a fragment 
public	TokenNamepublic	
FieldFragList	TokenNameIdentifier	 Field Frag List
(	TokenNameLPAREN	
int	TokenNameint	
fragCharSize	TokenNameIdentifier	 frag Char Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * convert the list of WeightedPhraseInfo to WeightedFragInfo, then add it to the fragInfos * * @param startOffset start offset of the fragment * @param endOffset end offset of the fragment * @param phraseInfoList list of WeightedPhraseInfo objects */	TokenNameCOMMENT_JAVADOC	 convert the list of WeightedPhraseInfo to WeightedFragInfo, then add it to the fragInfos * @param startOffset start offset of the fragment @param endOffset end offset of the fragment @param phraseInfoList list of WeightedPhraseInfo objects 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
phraseInfoList	TokenNameIdentifier	 phrase Info List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fragInfos	TokenNameIdentifier	 frag Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
phraseInfoList	TokenNameIdentifier	 phrase Info List
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * return the list of WeightedFragInfos. * * @return fragInfos. */	TokenNameCOMMENT_JAVADOC	 return the list of WeightedFragInfos. * @return fragInfos. 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
>	TokenNameGREATER	
getFragInfos	TokenNameIdentifier	 get Frag Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fragInfos	TokenNameIdentifier	 frag Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SubInfo	TokenNameIdentifier	 Sub Info
>	TokenNameGREATER	
subInfos	TokenNameIdentifier	 sub Infos
;	TokenNameSEMICOLON	
float	TokenNamefloat	
totalBoost	TokenNameIdentifier	 total Boost
;	TokenNameSEMICOLON	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
;	TokenNameSEMICOLON	
public	TokenNamepublic	
WeightedFragInfo	TokenNameIdentifier	 Weighted Frag Info
(	TokenNameLPAREN	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
>	TokenNameGREATER	
phraseInfoList	TokenNameIdentifier	 phrase Info List
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
subInfos	TokenNameIdentifier	 sub Infos
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
SubInfo	TokenNameIdentifier	 Sub Info
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
WeightedPhraseInfo	TokenNameIdentifier	 Weighted Phrase Info
phraseInfo	TokenNameIdentifier	 phrase Info
:	TokenNameCOLON	
phraseInfoList	TokenNameIdentifier	 phrase Info List
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SubInfo	TokenNameIdentifier	 Sub Info
subInfo	TokenNameIdentifier	 sub Info
=	TokenNameEQUAL	
new	TokenNamenew	
SubInfo	TokenNameIdentifier	 Sub Info
(	TokenNameLPAREN	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
termsOffsets	TokenNameIdentifier	 terms Offsets
,	TokenNameCOMMA	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
seqnum	TokenNameIdentifier	 seqnum
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
subInfos	TokenNameIdentifier	 sub Infos
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
subInfo	TokenNameIdentifier	 sub Info
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
totalBoost	TokenNameIdentifier	 total Boost
+=	TokenNamePLUS_EQUAL	
phraseInfo	TokenNameIdentifier	 phrase Info
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SubInfo	TokenNameIdentifier	 Sub Info
>	TokenNameGREATER	
getSubInfos	TokenNameIdentifier	 get Sub Infos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
subInfos	TokenNameIdentifier	 sub Infos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getTotalBoost	TokenNameIdentifier	 get Total Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
totalBoost	TokenNameIdentifier	 total Boost
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
"subInfos=("	TokenNameStringLiteral	subInfos=(
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SubInfo	TokenNameIdentifier	 Sub Info
si	TokenNameIdentifier	 si
:	TokenNameCOLON	
subInfos	TokenNameIdentifier	 sub Infos
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
si	TokenNameIdentifier	 si
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
")/"	TokenNameStringLiteral	)/
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
totalBoost	TokenNameIdentifier	 total Boost
)	TokenNameRPAREN	
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
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
SubInfo	TokenNameIdentifier	 Sub Info
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
// unnecessary member, just exists for debugging purpose 	TokenNameCOMMENT_LINE	unnecessary member, just exists for debugging purpose 
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Toffs	TokenNameIdentifier	 Toffs
>	TokenNameGREATER	
termsOffsets	TokenNameIdentifier	 terms Offsets
;	TokenNameSEMICOLON	
// usually termsOffsets.size() == 1, 	TokenNameCOMMENT_LINE	usually termsOffsets.size() == 1, 
// but if position-gap > 1 and slop > 0 then size() could be greater than 1 	TokenNameCOMMENT_LINE	but if position-gap > 1 and slop > 0 then size() could be greater than 1 
int	TokenNameint	
seqnum	TokenNameIdentifier	 seqnum
;	TokenNameSEMICOLON	
SubInfo	TokenNameIdentifier	 Sub Info
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Toffs	TokenNameIdentifier	 Toffs
>	TokenNameGREATER	
termsOffsets	TokenNameIdentifier	 terms Offsets
,	TokenNameCOMMA	
int	TokenNameint	
seqnum	TokenNameIdentifier	 seqnum
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termsOffsets	TokenNameIdentifier	 terms Offsets
=	TokenNameEQUAL	
termsOffsets	TokenNameIdentifier	 terms Offsets
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
seqnum	TokenNameIdentifier	 seqnum
=	TokenNameEQUAL	
seqnum	TokenNameIdentifier	 seqnum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Toffs	TokenNameIdentifier	 Toffs
>	TokenNameGREATER	
getTermsOffsets	TokenNameIdentifier	 get Terms Offsets
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
termsOffsets	TokenNameIdentifier	 terms Offsets
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getSeqnum	TokenNameIdentifier	 get Seqnum
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
seqnum	TokenNameIdentifier	 seqnum
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
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Toffs	TokenNameIdentifier	 Toffs
to	TokenNameIdentifier	 to
:	TokenNameCOLON	
termsOffsets	TokenNameIdentifier	 terms Offsets
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
to	TokenNameIdentifier	 to
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
