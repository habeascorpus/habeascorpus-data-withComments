package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ngram	TokenNameIdentifier	 ngram
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
TokenFilter	TokenNameIdentifier	 Token Filter
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
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Tokenizes the given token into n-grams of given size(s). * <p> * This {@link TokenFilter} create n-grams from the beginning edge or ending edge of a input token. * </p> */	TokenNameCOMMENT_JAVADOC	 Tokenizes the given token into n-grams of given size(s). <p> This {@link TokenFilter} create n-grams from the beginning edge or ending edge of a input token. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
EdgeNGramTokenFilter	TokenNameIdentifier	 Edge N Gram Token Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Side	TokenNameIdentifier	 Side
DEFAULT_SIDE	TokenNameIdentifier	 DEFAULT  SIDE
=	TokenNameEQUAL	
Side	TokenNameIdentifier	 Side
.	TokenNameDOT	
FRONT	TokenNameIdentifier	 FRONT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_GRAM_SIZE	TokenNameIdentifier	 DEFAULT  MAX  GRAM  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_GRAM_SIZE	TokenNameIdentifier	 DEFAULT  MIN  GRAM  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Specifies which side of the input the n-gram should be generated from */	TokenNameCOMMENT_JAVADOC	 Specifies which side of the input the n-gram should be generated from 
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Side	TokenNameIdentifier	 Side
{	TokenNameLBRACE	
/** Get the n-gram from the front of the input */	TokenNameCOMMENT_JAVADOC	 Get the n-gram from the front of the input 
FRONT	TokenNameIdentifier	 FRONT
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"front"	TokenNameStringLiteral	front
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
,	TokenNameCOMMA	
/** Get the n-gram from the end of the input */	TokenNameCOMMENT_JAVADOC	 Get the n-gram from the end of the input 
BACK	TokenNameIdentifier	 BACK
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"back"	TokenNameStringLiteral	back
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Get the appropriate Side from a string 	TokenNameCOMMENT_LINE	Get the appropriate Side from a string 
public	TokenNamepublic	
static	TokenNamestatic	
Side	TokenNameIdentifier	 Side
getSide	TokenNameIdentifier	 get Side
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
sideName	TokenNameIdentifier	 side Name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
FRONT	TokenNameIdentifier	 FRONT
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sideName	TokenNameIdentifier	 side Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FRONT	TokenNameIdentifier	 FRONT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
BACK	TokenNameIdentifier	 BACK
.	TokenNameDOT	
getLabel	TokenNameIdentifier	 get Label
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
sideName	TokenNameIdentifier	 side Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
BACK	TokenNameIdentifier	 BACK
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
minGram	TokenNameIdentifier	 min Gram
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxGram	TokenNameIdentifier	 max Gram
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Side	TokenNameIdentifier	 Side
side	TokenNameIdentifier	 side
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curTermLength	TokenNameIdentifier	 cur Term Length
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
curGramSize	TokenNameIdentifier	 cur Gram Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tokStart	TokenNameIdentifier	 tok Start
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
tokEnd	TokenNameIdentifier	 tok End
;	TokenNameSEMICOLON	
// only used if the length changed before this filter 	TokenNameCOMMENT_LINE	only used if the length changed before this filter 
private	TokenNameprivate	
boolean	TokenNameboolean	
hasIllegalOffsets	TokenNameIdentifier	 has Illegal Offsets
;	TokenNameSEMICOLON	
// only if the length changed before this filter 	TokenNameCOMMENT_LINE	only if the length changed before this filter 
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates EdgeNGramTokenFilter that can generate n-grams in the sizes of the given range * * @param input {@link TokenStream} holding the input to be tokenized * @param side the {@link Side} from which to chop off an n-gram * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates EdgeNGramTokenFilter that can generate n-grams in the sizes of the given range * @param input {@link TokenStream} holding the input to be tokenized @param side the {@link Side} from which to chop off an n-gram @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
EdgeNGramTokenFilter	TokenNameIdentifier	 Edge N Gram Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Side	TokenNameIdentifier	 Side
side	TokenNameIdentifier	 side
,	TokenNameCOMMA	
int	TokenNameint	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
int	TokenNameint	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
side	TokenNameIdentifier	 side
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"sideLabel must be either front or back"	TokenNameStringLiteral	sideLabel must be either front or back
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minGram	TokenNameIdentifier	 min Gram
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minGram must be greater than zero"	TokenNameStringLiteral	minGram must be greater than zero
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
minGram	TokenNameIdentifier	 min Gram
>	TokenNameGREATER	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"minGram must not be greater than maxGram"	TokenNameStringLiteral	minGram must not be greater than maxGram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
minGram	TokenNameIdentifier	 min Gram
=	TokenNameEQUAL	
minGram	TokenNameIdentifier	 min Gram
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxGram	TokenNameIdentifier	 max Gram
=	TokenNameEQUAL	
maxGram	TokenNameIdentifier	 max Gram
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
side	TokenNameIdentifier	 side
=	TokenNameEQUAL	
side	TokenNameIdentifier	 side
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates EdgeNGramTokenFilter that can generate n-grams in the sizes of the given range * * @param input {@link TokenStream} holding the input to be tokenized * @param sideLabel the name of the {@link Side} from which to chop off an n-gram * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates EdgeNGramTokenFilter that can generate n-grams in the sizes of the given range * @param input {@link TokenStream} holding the input to be tokenized @param sideLabel the name of the {@link Side} from which to chop off an n-gram @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
EdgeNGramTokenFilter	TokenNameIdentifier	 Edge N Gram Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
sideLabel	TokenNameIdentifier	 side Label
,	TokenNameCOMMA	
int	TokenNameint	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
int	TokenNameint	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
Side	TokenNameIdentifier	 Side
.	TokenNameDOT	
getSide	TokenNameIdentifier	 get Side
(	TokenNameLPAREN	
sideLabel	TokenNameIdentifier	 side Label
)	TokenNameRPAREN	
,	TokenNameCOMMA	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
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
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curTermLength	TokenNameIdentifier	 cur Term Length
=	TokenNameEQUAL	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curGramSize	TokenNameIdentifier	 cur Gram Size
=	TokenNameEQUAL	
minGram	TokenNameIdentifier	 min Gram
;	TokenNameSEMICOLON	
tokStart	TokenNameIdentifier	 tok Start
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokEnd	TokenNameIdentifier	 tok End
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// if length by start + end offsets doesn't match the term text then assume 	TokenNameCOMMENT_LINE	if length by start + end offsets doesn't match the term text then assume 
// this is a synonym and don't adjust the offsets. 	TokenNameCOMMENT_LINE	this is a synonym and don't adjust the offsets. 
hasIllegalOffsets	TokenNameIdentifier	 has Illegal Offsets
=	TokenNameEQUAL	
(	TokenNameLPAREN	
tokStart	TokenNameIdentifier	 tok Start
+	TokenNamePLUS	
curTermLength	TokenNameIdentifier	 cur Term Length
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
tokEnd	TokenNameIdentifier	 tok End
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
curGramSize	TokenNameIdentifier	 cur Gram Size
<=	TokenNameLESS_EQUAL	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
curGramSize	TokenNameIdentifier	 cur Gram Size
>	TokenNameGREATER	
curTermLength	TokenNameIdentifier	 cur Term Length
// if the remaining input is too short, we can't generate any n-grams 	TokenNameCOMMENT_LINE	if the remaining input is too short, we can't generate any n-grams 
||	TokenNameOR_OR	
curGramSize	TokenNameIdentifier	 cur Gram Size
>	TokenNameGREATER	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we have hit the end of our n-gram size range, quit 	TokenNameCOMMENT_LINE	if we have hit the end of our n-gram size range, quit 
// grab gramSize chars from front or back 	TokenNameCOMMENT_LINE	grab gramSize chars from front or back 
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
side	TokenNameIdentifier	 side
==	TokenNameEQUAL_EQUAL	
Side	TokenNameIdentifier	 Side
.	TokenNameDOT	
FRONT	TokenNameIdentifier	 FRONT
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
curTermLength	TokenNameIdentifier	 cur Term Length
-	TokenNameMINUS	
curGramSize	TokenNameIdentifier	 cur Gram Size
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
curGramSize	TokenNameIdentifier	 cur Gram Size
;	TokenNameSEMICOLON	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasIllegalOffsets	TokenNameIdentifier	 has Illegal Offsets
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
tokStart	TokenNameIdentifier	 tok Start
,	TokenNameCOMMA	
tokEnd	TokenNameIdentifier	 tok End
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
tokStart	TokenNameIdentifier	 tok Start
+	TokenNamePLUS	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
tokStart	TokenNameIdentifier	 tok Start
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
curGramSize	TokenNameIdentifier	 cur Gram Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curGramSize	TokenNameIdentifier	 cur Gram Size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
curTermBuffer	TokenNameIdentifier	 cur Term Buffer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
