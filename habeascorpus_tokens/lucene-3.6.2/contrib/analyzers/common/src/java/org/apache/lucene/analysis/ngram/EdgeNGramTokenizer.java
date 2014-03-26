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
/** * Tokenizes the input from an edge into n-grams of given size(s). * <p> * This {@link Tokenizer} create n-grams from the beginning edge or ending edge of a input token. * MaxGram can't be larger than 1024 because of limitation. * </p> */	TokenNameCOMMENT_JAVADOC	 Tokenizes the input from an edge into n-grams of given size(s). <p> This {@link Tokenizer} create n-grams from the beginning edge or ending edge of a input token. MaxGram can't be larger than 1024 because of limitation. </p> 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
EdgeNGramTokenizer	TokenNameIdentifier	 Edge N Gram Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
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
int	TokenNameint	
minGram	TokenNameIdentifier	 min Gram
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxGram	TokenNameIdentifier	 max Gram
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
gramSize	TokenNameIdentifier	 gram Size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Side	TokenNameIdentifier	 Side
side	TokenNameIdentifier	 side
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
started	TokenNameIdentifier	 started
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
/** * Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * * @param input {@link Reader} holding the input to be tokenized * @param side the {@link Side} from which to chop off an n-gram * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * @param input {@link Reader} holding the input to be tokenized @param side the {@link Side} from which to chop off an n-gram @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
EdgeNGramTokenizer	TokenNameIdentifier	 Edge N Gram Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
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
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
side	TokenNameIdentifier	 side
,	TokenNameCOMMA	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * * @param source {@link AttributeSource} to use * @param input {@link Reader} holding the input to be tokenized * @param side the {@link Side} from which to chop off an n-gram * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * @param source {@link AttributeSource} to use @param input {@link Reader} holding the input to be tokenized @param side the {@link Side} from which to chop off an n-gram @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
EdgeNGramTokenizer	TokenNameIdentifier	 Edge N Gram Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
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
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
side	TokenNameIdentifier	 side
,	TokenNameCOMMA	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * * @param factory {@link org.apache.lucene.util.AttributeSource.AttributeFactory} to use * @param input {@link Reader} holding the input to be tokenized * @param side the {@link Side} from which to chop off an n-gram * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * @param factory {@link org.apache.lucene.util.AttributeSource.AttributeFactory} to use @param input {@link Reader} holding the input to be tokenized @param side the {@link Side} from which to chop off an n-gram @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
EdgeNGramTokenizer	TokenNameIdentifier	 Edge N Gram Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
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
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
side	TokenNameIdentifier	 side
,	TokenNameCOMMA	
minGram	TokenNameIdentifier	 min Gram
,	TokenNameCOMMA	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * * @param input {@link Reader} holding the input to be tokenized * @param sideLabel the name of the {@link Side} from which to chop off an n-gram * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * @param input {@link Reader} holding the input to be tokenized @param sideLabel the name of the {@link Side} from which to chop off an n-gram @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
EdgeNGramTokenizer	TokenNameIdentifier	 Edge N Gram Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
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
/** * Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * * @param source {@link AttributeSource} to use * @param input {@link Reader} holding the input to be tokenized * @param sideLabel the name of the {@link Side} from which to chop off an n-gram * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * @param source {@link AttributeSource} to use @param input {@link Reader} holding the input to be tokenized @param sideLabel the name of the {@link Side} from which to chop off an n-gram @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
EdgeNGramTokenizer	TokenNameIdentifier	 Edge N Gram Tokenizer
(	TokenNameLPAREN	
AttributeSource	TokenNameIdentifier	 Attribute Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
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
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
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
/** * Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * * @param factory {@link org.apache.lucene.util.AttributeSource.AttributeFactory} to use * @param input {@link Reader} holding the input to be tokenized * @param sideLabel the name of the {@link Side} from which to chop off an n-gram * @param minGram the smallest n-gram to generate * @param maxGram the largest n-gram to generate */	TokenNameCOMMENT_JAVADOC	 Creates EdgeNGramTokenizer that can generate n-grams in the sizes of the given range * @param factory {@link org.apache.lucene.util.AttributeSource.AttributeFactory} to use @param input {@link Reader} holding the input to be tokenized @param sideLabel the name of the {@link Side} from which to chop off an n-gram @param minGram the smallest n-gram to generate @param maxGram the largest n-gram to generate 
public	TokenNamepublic	
EdgeNGramTokenizer	TokenNameIdentifier	 Edge N Gram Tokenizer
(	TokenNameLPAREN	
AttributeFactory	TokenNameIdentifier	 Attribute Factory
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
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
factory	TokenNameIdentifier	 factory
,	TokenNameCOMMA	
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
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
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
// if we are just starting, read the whole input 	TokenNameCOMMENT_LINE	if we are just starting, read the whole input 
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
final	TokenNamefinal	
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
// if the remaining input is too short, we can't generate any n-grams 	TokenNameCOMMENT_LINE	if the remaining input is too short, we can't generate any n-grams 
if	TokenNameif	
(	TokenNameLPAREN	
gramSize	TokenNameIdentifier	 gram Size
>	TokenNameGREATER	
inLen	TokenNameIdentifier	 in Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if we have hit the end of our n-gram size range, quit 	TokenNameCOMMENT_LINE	if we have hit the end of our n-gram size range, quit 
if	TokenNameif	
(	TokenNameLPAREN	
gramSize	TokenNameIdentifier	 gram Size
>	TokenNameGREATER	
maxGram	TokenNameIdentifier	 max Gram
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
inLen	TokenNameIdentifier	 in Len
-	TokenNameMINUS	
gramSize	TokenNameIdentifier	 gram Size
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
gramSize	TokenNameIdentifier	 gram Size
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
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
gramSize	TokenNameIdentifier	 gram Size
++	TokenNamePLUS_PLUS	
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
}	TokenNameRBRACE	
}	TokenNameRBRACE	
