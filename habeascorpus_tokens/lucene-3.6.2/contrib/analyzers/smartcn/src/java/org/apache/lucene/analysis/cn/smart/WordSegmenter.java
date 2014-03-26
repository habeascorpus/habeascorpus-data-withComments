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
List	TokenNameIdentifier	 List
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
hhmm	TokenNameIdentifier	 hhmm
.	TokenNameDOT	
HHMMSegmenter	TokenNameIdentifier	 HHMM Segmenter
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
hhmm	TokenNameIdentifier	 hhmm
.	TokenNameDOT	
SegToken	TokenNameIdentifier	 Seg Token
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
hhmm	TokenNameIdentifier	 hhmm
.	TokenNameDOT	
SegTokenFilter	TokenNameIdentifier	 Seg Token Filter
;	TokenNameSEMICOLON	
/** * Segment a sentence of Chinese text into words. * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Segment a sentence of Chinese text into words. @lucene.experimental 
class	TokenNameclass	
WordSegmenter	TokenNameIdentifier	 Word Segmenter
{	TokenNameLBRACE	
private	TokenNameprivate	
HHMMSegmenter	TokenNameIdentifier	 HHMM Segmenter
hhmmSegmenter	TokenNameIdentifier	 hhmm Segmenter
=	TokenNameEQUAL	
new	TokenNamenew	
HHMMSegmenter	TokenNameIdentifier	 HHMM Segmenter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
SegTokenFilter	TokenNameIdentifier	 Seg Token Filter
tokenFilter	TokenNameIdentifier	 token Filter
=	TokenNameEQUAL	
new	TokenNamenew	
SegTokenFilter	TokenNameIdentifier	 Seg Token Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Segment a sentence into words with {@link HHMMSegmenter} * * @param sentence input sentence * @param startOffset start offset of sentence * @return {@link List} of {@link SegToken} */	TokenNameCOMMENT_JAVADOC	 Segment a sentence into words with {@link HHMMSegmenter} * @param sentence input sentence @param startOffset start offset of sentence @return {@link List} of {@link SegToken} 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
segmentSentence	TokenNameIdentifier	 segment Sentence
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
segTokenList	TokenNameIdentifier	 seg Token List
=	TokenNameEQUAL	
hhmmSegmenter	TokenNameIdentifier	 hhmm Segmenter
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
sentence	TokenNameIdentifier	 sentence
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// tokens from sentence, excluding WordType.SENTENCE_BEGIN and WordType.SENTENCE_END 	TokenNameCOMMENT_LINE	tokens from sentence, excluding WordType.SENTENCE_BEGIN and WordType.SENTENCE_END 
List	TokenNameIdentifier	 List
<	TokenNameLESS	
SegToken	TokenNameIdentifier	 Seg Token
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyList	TokenNameIdentifier	 empty List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segTokenList	TokenNameIdentifier	 seg Token List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// if its not an empty sentence 	TokenNameCOMMENT_LINE	if its not an empty sentence 
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
segTokenList	TokenNameIdentifier	 seg Token List
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
segTokenList	TokenNameIdentifier	 seg Token List
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
st	TokenNameIdentifier	 st
:	TokenNameCOLON	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
convertSegToken	TokenNameIdentifier	 convert Seg Token
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
,	TokenNameCOMMA	
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a {@link SegToken} so that it is ready for indexing. * * This method calculates offsets and normalizes the token with {@link SegTokenFilter}. * * @param st input {@link SegToken} * @param sentence associated Sentence * @param sentenceStartOffset offset into sentence * @return Lucene {@link SegToken} */	TokenNameCOMMENT_JAVADOC	 Process a {@link SegToken} so that it is ready for indexing. * This method calculates offsets and normalizes the token with {@link SegTokenFilter}. * @param st input {@link SegToken} @param sentence associated Sentence @param sentenceStartOffset offset into sentence @return Lucene {@link SegToken} 
public	TokenNamepublic	
SegToken	TokenNameIdentifier	 Seg Token
convertSegToken	TokenNameIdentifier	 convert Seg Token
(	TokenNameLPAREN	
SegToken	TokenNameIdentifier	 Seg Token
st	TokenNameIdentifier	 st
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sentence	TokenNameIdentifier	 sentence
,	TokenNameCOMMA	
int	TokenNameint	
sentenceStartOffset	TokenNameIdentifier	 sentence Start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
wordType	TokenNameIdentifier	 word Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
STRING	TokenNameIdentifier	 STRING
:	TokenNameCOLON	
case	TokenNamecase	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
NUMBER	TokenNameIdentifier	 NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
FULLWIDTH_NUMBER	TokenNameIdentifier	 FULLWIDTH  NUMBER
:	TokenNameCOLON	
case	TokenNamecase	
WordType	TokenNameIdentifier	 Word Type
.	TokenNameDOT	
FULLWIDTH_STRING	TokenNameIdentifier	 FULLWIDTH  STRING
:	TokenNameCOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
charArray	TokenNameIdentifier	 char Array
=	TokenNameEQUAL	
sentence	TokenNameIdentifier	 sentence
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
,	TokenNameCOMMA	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
st	TokenNameIdentifier	 st
=	TokenNameEQUAL	
tokenFilter	TokenNameIdentifier	 token Filter
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
(	TokenNameLPAREN	
st	TokenNameIdentifier	 st
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
+=	TokenNamePLUS_EQUAL	
sentenceStartOffset	TokenNameIdentifier	 sentence Start Offset
;	TokenNameSEMICOLON	
st	TokenNameIdentifier	 st
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
+=	TokenNamePLUS_EQUAL	
sentenceStartOffset	TokenNameIdentifier	 sentence Start Offset
;	TokenNameSEMICOLON	
return	TokenNamereturn	
st	TokenNameIdentifier	 st
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
