package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
highlight	TokenNameIdentifier	 highlight
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
TokenStream	TokenNameIdentifier	 Token Stream
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
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
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
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
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
Spans	TokenNameIdentifier	 Spans
;	TokenNameSEMICOLON	
/** * {@link Fragmenter} implementation which breaks text up into same-size * fragments but does not split up {@link Spans}. This is a simple sample class. */	TokenNameCOMMENT_JAVADOC	 {@link Fragmenter} implementation which breaks text up into same-size fragments but does not split up {@link Spans}. This is a simple sample class. 
public	TokenNamepublic	
class	TokenNameclass	
SimpleSpanFragmenter	TokenNameIdentifier	 Simple Span Fragmenter
implements	TokenNameimplements	
Fragmenter	TokenNameIdentifier	 Fragmenter
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_FRAGMENT_SIZE	TokenNameIdentifier	 DEFAULT  FRAGMENT  SIZE
=	TokenNameEQUAL	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
fragmentSize	TokenNameIdentifier	 fragment Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
currentNumFrags	TokenNameIdentifier	 current Num Frags
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
QueryScorer	TokenNameIdentifier	 Query Scorer
queryScorer	TokenNameIdentifier	 query Scorer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
waitForPos	TokenNameIdentifier	 wait For Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
textSize	TokenNameIdentifier	 text Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncAtt	TokenNameIdentifier	 pos Inc Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
;	TokenNameSEMICOLON	
/** * @param queryScorer QueryScorer that was used to score hits */	TokenNameCOMMENT_JAVADOC	 @param queryScorer QueryScorer that was used to score hits 
public	TokenNamepublic	
SimpleSpanFragmenter	TokenNameIdentifier	 Simple Span Fragmenter
(	TokenNameLPAREN	
QueryScorer	TokenNameIdentifier	 Query Scorer
queryScorer	TokenNameIdentifier	 query Scorer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
queryScorer	TokenNameIdentifier	 query Scorer
,	TokenNameCOMMA	
DEFAULT_FRAGMENT_SIZE	TokenNameIdentifier	 DEFAULT  FRAGMENT  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param queryScorer QueryScorer that was used to score hits * @param fragmentSize size in bytes of each fragment */	TokenNameCOMMENT_JAVADOC	 @param queryScorer QueryScorer that was used to score hits @param fragmentSize size in bytes of each fragment 
public	TokenNamepublic	
SimpleSpanFragmenter	TokenNameIdentifier	 Simple Span Fragmenter
(	TokenNameLPAREN	
QueryScorer	TokenNameIdentifier	 Query Scorer
queryScorer	TokenNameIdentifier	 query Scorer
,	TokenNameCOMMA	
int	TokenNameint	
fragmentSize	TokenNameIdentifier	 fragment Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fragmentSize	TokenNameIdentifier	 fragment Size
=	TokenNameEQUAL	
fragmentSize	TokenNameIdentifier	 fragment Size
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
queryScorer	TokenNameIdentifier	 query Scorer
=	TokenNameEQUAL	
queryScorer	TokenNameIdentifier	 query Scorer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Fragmenter#isNewFragment() */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Fragmenter#isNewFragment() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNewFragment	TokenNameIdentifier	 is New Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
+=	TokenNamePLUS_EQUAL	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
waitForPos	TokenNameIdentifier	 wait For Pos
==	TokenNameEQUAL_EQUAL	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
waitForPos	TokenNameIdentifier	 wait For Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
waitForPos	TokenNameIdentifier	 wait For Pos
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
WeightedSpanTerm	TokenNameIdentifier	 Weighted Span Term
wSpanTerm	TokenNameIdentifier	 w Span Term
=	TokenNameEQUAL	
queryScorer	TokenNameIdentifier	 query Scorer
.	TokenNameDOT	
getWeightedSpanTerm	TokenNameIdentifier	 get Weighted Span Term
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
wSpanTerm	TokenNameIdentifier	 w Span Term
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
PositionSpan	TokenNameIdentifier	 Position Span
>	TokenNameGREATER	
positionSpans	TokenNameIdentifier	 position Spans
=	TokenNameEQUAL	
wSpanTerm	TokenNameIdentifier	 w Span Term
.	TokenNameDOT	
getPositionSpans	TokenNameIdentifier	 get Position Spans
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
positionSpans	TokenNameIdentifier	 position Spans
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
positionSpans	TokenNameIdentifier	 position Spans
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
waitForPos	TokenNameIdentifier	 wait For Pos
=	TokenNameEQUAL	
positionSpans	TokenNameIdentifier	 position Spans
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
isNewFrag	TokenNameIdentifier	 is New Frag
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
fragmentSize	TokenNameIdentifier	 fragment Size
*	TokenNameMULTIPLY	
currentNumFrags	TokenNameIdentifier	 current Num Frags
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
textSize	TokenNameIdentifier	 text Size
-	TokenNameMINUS	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
fragmentSize	TokenNameIdentifier	 fragment Size
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isNewFrag	TokenNameIdentifier	 is New Frag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentNumFrags	TokenNameIdentifier	 current Num Frags
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
isNewFrag	TokenNameIdentifier	 is New Frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* (non-Javadoc) * @see org.apache.lucene.search.highlight.Fragmenter#start(java.lang.String, org.apache.lucene.analysis.TokenStream) */	TokenNameCOMMENT_BLOCK	 (non-Javadoc) @see org.apache.lucene.search.highlight.Fragmenter#start(java.lang.String, org.apache.lucene.analysis.TokenStream) 
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
originalText	TokenNameIdentifier	 original Text
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
tokenStream	TokenNameIdentifier	 token Stream
)	TokenNameRPAREN	
{	TokenNameLBRACE	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentNumFrags	TokenNameIdentifier	 current Num Frags
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
textSize	TokenNameIdentifier	 text Size
=	TokenNameEQUAL	
originalText	TokenNameIdentifier	 original Text
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncAtt	TokenNameIdentifier	 pos Inc Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
tokenStream	TokenNameIdentifier	 token Stream
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
