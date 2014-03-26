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
Tokenizer	TokenNameIdentifier	 Tokenizer
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
AttributeSource	TokenNameIdentifier	 Attribute Source
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
/** * Tokenizes the input into n-grams of the given size(s). */	TokenNameCOMMENT_JAVADOC	 Tokenizes the input into n-grams of the given size(s). 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
NGramTokenizer	TokenNameIdentifier	 N Gram Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MIN_NGRAM_SIZE	TokenNameIdentifier	 DEFAULT  MIN  NGRAM  SIZE
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DEFAULT_MAX_NGRAM_SIZE	TokenNameIdentifier	 DEFAULT  MAX  NGRAM  SIZE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
gramSize	TokenNameIdentifier	 gram Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
inLen	TokenNameIdentifier	 in Len
;	TokenNameSEMICOLON	
// length of the input AFTER trim() 	TokenNameCOMMENT_LINE	length of the input AFTER trim() 
private	TokenNameprivate	
int	TokenNameint	
charsRead	TokenNameIdentifier	 chars Read
;	TokenNameSEMICOLON	
// length of the input 	TokenNameCOMMENT_LINE	length of the input 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
inStr	TokenNameIdentifier	 in Str
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
started	TokenNameIdentifier	 started
;	TokenNameSEMICOLON	
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
/** * Creates NGramTokenizer with given min and max n-grams. * @param input {@link Reader} holding the input to be tokenized * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates NGramTokenizer with given min and max n-grams. @param input {@link Reader} holding the input to be tokenized @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
NGramTokenizer	TokenNameIdentifier	 N Gram Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
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
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates NGramTokenizer with given min and max n-grams. * @param source {@link AttributeSource} to use * @param input {@link Reader} holding the input to be tokenized * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates NGramTokenizer with given min and max n-grams. @param source {@link AttributeSource} to use @param input {@link Reader} holding the input to be tokenized @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
NGramTokenizer	TokenNameIdentifier	 N Gram Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
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
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates NGramTokenizer with given min and max n-grams. * @param factory {@link org.apache.lucene.util.AttributeSource.AttributeFactory} to use * @param input {@link Reader} holding the input to be tokenized * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates NGramTokenizer with given min and max n-grams. @param factory {@link org.apache.lucene.util.AttributeSource.AttributeFactory} to use @param input {@link Reader} holding the input to be tokenized @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
NGramTokenizer	TokenNameIdentifier	 N Gram Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
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
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates NGramTokenizer with default min and max n-grams. * @param input {@link Reader} holding the input to be tokenized */	TokenNameCOMMENT_JAVADOC	 Creates NGramTokenizer with default min and max n-grams. @param input {@link Reader} holding the input to be tokenized 
public	TokenNamepublic	
NGramTokenizer	TokenNameIdentifier	 N Gram Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
,	TokenNameCOMMA	
DEFAULT_MIN_NGRAM_SIZE	TokenNameIdentifier	 DEFAULT  MIN  NGRAM  SIZE
,	TokenNameCOMMA	
DEFAULT_MAX_NGRAM_SIZE	TokenNameIdentifier	 DEFAULT  MAX  NGRAM  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
int	TokenNameint	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
int	TokenNameint	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
/** Returns the next token in the stream, or null at EOS. */	TokenNameCOMMENT_JAVADOC	 Returns the next token in the stream, or null at EOS. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
started	TokenNameIdentifier	 started
)	TokenNameRPAREN	
{	TokenNameLBRACE	
started	TokenNameIdentifier	 started
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
gramSize	TokenNameIdentifier	 gram Size
=	TokenNameEQUAL	
minGram	TokenNameIdentifier	 min Gram
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
charsRead	TokenNameIdentifier	 chars Read
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// TODO: refactor to a shared readFully somewhere: 	TokenNameCOMMENT_LINE	TODO: refactor to a shared readFully somewhere: 
while	TokenNamewhile	
(	TokenNameLPAREN	
charsRead	TokenNameIdentifier	 chars Read
<	TokenNameLESS	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
charsRead	TokenNameIdentifier	 chars Read
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
charsRead	TokenNameIdentifier	 chars Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inc	TokenNameIdentifier	 inc
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
charsRead	TokenNameIdentifier	 chars Read
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
inStr	TokenNameIdentifier	 in Str
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
charsRead	TokenNameIdentifier	 chars Read
)	TokenNameRPAREN	
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remove any trailing empty strings 	TokenNameCOMMENT_LINE	remove any trailing empty strings 
if	TokenNameif	
(	TokenNameLPAREN	
charsRead	TokenNameIdentifier	 chars Read
==	TokenNameEQUAL_EQUAL	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Read extra throwaway chars so that on end() we 	TokenNameCOMMENT_LINE	Read extra throwaway chars so that on end() we 
// report the correct offset: 	TokenNameCOMMENT_LINE	report the correct offset: 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
throwaway	TokenNameIdentifier	 throwaway
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
1024	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
inc	TokenNameIdentifier	 inc
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
throwaway	TokenNameIdentifier	 throwaway
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
throwaway	TokenNameIdentifier	 throwaway
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inc	TokenNameIdentifier	 inc
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
charsRead	TokenNameIdentifier	 chars Read
+=	TokenNamePLUS_EQUAL	
inc	TokenNameIdentifier	 inc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
inLen	TokenNameIdentifier	 in Len
=	TokenNameEQUAL	
inStr	TokenNameIdentifier	 in Str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
inLen	TokenNameIdentifier	 in Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
gramSize	TokenNameIdentifier	 gram Size
>	TokenNameGREATER	
inLen	TokenNameIdentifier	 in Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we hit the end of the string 	TokenNameCOMMENT_LINE	if we hit the end of the string 
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// reset to beginning of string 	TokenNameCOMMENT_LINE	reset to beginning of string 
gramSize	TokenNameIdentifier	 gram Size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// increase n-gram size 	TokenNameCOMMENT_LINE	increase n-gram size 
if	TokenNameif	
(	TokenNameLPAREN	
gramSize	TokenNameIdentifier	 gram Size
>	TokenNameGREATER	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
// we are done 	TokenNameCOMMENT_LINE	we are done 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
gramSize	TokenNameIdentifier	 gram Size
>	TokenNameGREATER	
inLen	TokenNameIdentifier	 in Len
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
oldPos	TokenNameIdentifier	 old Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
setEmpty	TokenNameIdentifier	 set Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
inStr	TokenNameIdentifier	 in Str
,	TokenNameCOMMA	
oldPos	TokenNameIdentifier	 old Pos
,	TokenNameCOMMA	
oldPos	TokenNameIdentifier	 old Pos
+	TokenNamePLUS	
gramSize	TokenNameIdentifier	 gram Size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
oldPos	TokenNameIdentifier	 old Pos
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
oldPos	TokenNameIdentifier	 old Pos
+	TokenNamePLUS	
gramSize	TokenNameIdentifier	 gram Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// set final offset 	TokenNameCOMMENT_LINE	set final offset 
final	TokenNamefinal	
int	TokenNameint	
finalOffset	TokenNameIdentifier	 final Offset
=	TokenNameEQUAL	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
charsRead	TokenNameIdentifier	 chars Read
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
finalOffset	TokenNameIdentifier	 final Offset
,	TokenNameCOMMA	
finalOffset	TokenNameIdentifier	 final Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
started	TokenNameIdentifier	 started
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
