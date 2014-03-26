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
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
tokenattributes	TokenNameIdentifier	 tokenattributes
.	TokenNameDOT	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestGraphTokenizers	TokenNameIdentifier	 Test Graph Tokenizers
extends	TokenNameextends	
BaseTokenStreamTestCase	TokenNameIdentifier	 Base Token Stream Test Case
{	TokenNameLBRACE	
// Makes a graph TokenStream from the string; separate 	TokenNameCOMMENT_LINE	Makes a graph TokenStream from the string; separate 
// positions with single space, multiple tokens at the same 	TokenNameCOMMENT_LINE	positions with single space, multiple tokens at the same 
// position with /, and add optional position length with 	TokenNameCOMMENT_LINE	position with /, and add optional position length with 
// :. EG "a b c" is a simple chain, "a/x b c" adds 'x' 	TokenNameCOMMENT_LINE	:. EG "a b c" is a simple chain, "a/x b c" adds 'x' 
// over 'a' at position 0 with posLen=1, "a/x:3 b c" adds 	TokenNameCOMMENT_LINE	over 'a' at position 0 with posLen=1, "a/x:3 b c" adds 
// 'x' over a with posLen=3. Tokens are in normal-form! 	TokenNameCOMMENT_LINE	'x' over a with posLen=3. Tokens are in normal-form! 
// So, offsets are computed based on the first token at a 	TokenNameCOMMENT_LINE	So, offsets are computed based on the first token at a 
// given position. NOTE: each token must be a single 	TokenNameCOMMENT_LINE	given position. NOTE: each token must be a single 
// character! We assume this when computing offsets... 	TokenNameCOMMENT_LINE	character! We assume this when computing offsets... 
// NOTE: all input tokens must be length 1!!! This means 	TokenNameCOMMENT_LINE	NOTE: all input tokens must be length 1!!! This means 
// you cannot turn on MockCharFilter when random 	TokenNameCOMMENT_LINE	you cannot turn on MockCharFilter when random 
// testing... 	TokenNameCOMMENT_LINE	testing... 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
GraphTokenizer	TokenNameIdentifier	 Graph Tokenizer
extends	TokenNameextends	
Tokenizer	TokenNameIdentifier	 Tokenizer
{	TokenNameLBRACE	
private	TokenNameprivate	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
tokens	TokenNameIdentifier	 tokens
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
upto	TokenNameIdentifier	 upto
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
inputLength	TokenNameIdentifier	 input Length
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
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
posLengthAtt	TokenNameIdentifier	 pos Length Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
GraphTokenizer	TokenNameIdentifier	 Graph Tokenizer
(	TokenNameLPAREN	
Reader	TokenNameIdentifier	 Reader
input	TokenNameIdentifier	 input
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
input	TokenNameIdentifier	 input
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
{	TokenNameLBRACE	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
upto	TokenNameIdentifier	 upto
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fillTokens	TokenNameIdentifier	 fill Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//System.out.println("graphTokenizer: incr upto=" + upto + " vs " + tokens.size()); 	TokenNameCOMMENT_LINE	System.out.println("graphTokenizer: incr upto=" + upto + " vs " + tokens.size()); 
if	TokenNameif	
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
==	TokenNameEQUAL_EQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//System.out.println(" END @ " + tokens.size()); 	TokenNameCOMMENT_LINE	System.out.println(" END @ " + tokens.size()); 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
upto	TokenNameIdentifier	 upto
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" return token=" + t); 	TokenNameCOMMENT_LINE	System.out.println(" return token=" + t); 
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posLengthAtt	TokenNameIdentifier	 pos Length Att
.	TokenNameDOT	
setPositionLength	TokenNameIdentifier	 set Position Length
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getPositionLength	TokenNameIdentifier	 get Position Length
(	TokenNameLPAREN	
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
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: somewhat... hackish, but we need this to 	TokenNameCOMMENT_LINE	NOTE: somewhat... hackish, but we need this to 
// satisfy BTSTC: 	TokenNameCOMMENT_LINE	satisfy BTSTC: 
final	TokenNamefinal	
int	TokenNameint	
lastOffset	TokenNameIdentifier	 last Offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lastOffset	TokenNameIdentifier	 last Offset
=	TokenNameEQUAL	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lastOffset	TokenNameIdentifier	 last Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
lastOffset	TokenNameIdentifier	 last Offset
)	TokenNameRPAREN	
,	TokenNameCOMMA	
correctOffset	TokenNameIdentifier	 correct Offset
(	TokenNameLPAREN	
inputLength	TokenNameIdentifier	 input Length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
fillTokens	TokenNameIdentifier	 fill Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
final	TokenNamefinal	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
256	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println("got count=" + count); 	TokenNameCOMMENT_LINE	System.out.println("got count=" + count); 
}	TokenNameRBRACE	
//System.out.println("fillTokens: " + sb); 	TokenNameCOMMENT_LINE	System.out.println("fillTokens: " + sb); 
inputLength	TokenNameIdentifier	 input Length
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tokens	TokenNameIdentifier	 tokens
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
maxPos	TokenNameIdentifier	 max Pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//System.out.println("again"); 	TokenNameCOMMENT_LINE	System.out.println("again"); 
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
part	TokenNameIdentifier	 part
:	TokenNameCOLON	
parts	TokenNameIdentifier	 parts
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
overlapped	TokenNameIdentifier	 overlapped
=	TokenNameEQUAL	
part	TokenNameIdentifier	 part
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
"/"	TokenNameStringLiteral	/
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstAtPos	TokenNameIdentifier	 first At Pos
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
minPosLength	TokenNameIdentifier	 min Pos Length
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
part2	TokenNameIdentifier	 part2
:	TokenNameCOLON	
overlapped	TokenNameIdentifier	 overlapped
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
colonIndex	TokenNameIdentifier	 colon Index
=	TokenNameEQUAL	
part2	TokenNameIdentifier	 part2
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
posLength	TokenNameIdentifier	 pos Length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
colonIndex	TokenNameIdentifier	 colon Index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
part2	TokenNameIdentifier	 part2
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
colonIndex	TokenNameIdentifier	 colon Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posLength	TokenNameIdentifier	 pos Length
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
part2	TokenNameIdentifier	 part2
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
colonIndex	TokenNameIdentifier	 colon Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
part2	TokenNameIdentifier	 part2
;	TokenNameSEMICOLON	
posLength	TokenNameIdentifier	 pos Length
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxPos	TokenNameIdentifier	 max Pos
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
maxPos	TokenNameIdentifier	 max Pos
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
posLength	TokenNameIdentifier	 pos Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
minPosLength	TokenNameIdentifier	 min Pos Length
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
minPosLength	TokenNameIdentifier	 min Pos Length
,	TokenNameCOMMA	
posLength	TokenNameIdentifier	 pos Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
posLength	TokenNameIdentifier	 pos Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setPositionLength	TokenNameIdentifier	 set Position Length
(	TokenNameLPAREN	
posLength	TokenNameIdentifier	 pos Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
firstAtPos	TokenNameIdentifier	 first At Pos
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
firstAtPos	TokenNameIdentifier	 first At Pos
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
//System.out.println(" add token=" + t + " startOff=" + t.startOffset() + " endOff=" + t.endOffset()); 	TokenNameCOMMENT_LINE	System.out.println(" add token=" + t + " startOff=" + t.startOffset() + " endOff=" + t.endOffset()); 
tokens	TokenNameIdentifier	 tokens
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
minPosLength	TokenNameIdentifier	 min Pos Length
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
maxPos	TokenNameIdentifier	 max Pos
<=	TokenNameLESS_EQUAL	
pos	TokenNameIdentifier	 pos
:	TokenNameCOLON	
"input string mal-formed: posLength>1 tokens hang over the end"	TokenNameStringLiteral	input string mal-formed: posLength>1 tokens hang over the end
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMockGraphTokenFilterBasic	TokenNameIdentifier	 test Mock Graph Token Filter Basic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TEST: iter="	TokenNameStringLiteral	 TEST: iter=
+	TokenNamePLUS	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make new analyzer each time, because MGTF has fixed 	TokenNameCOMMENT_LINE	Make new analyzer each time, because MGTF has fixed 
// seed: 	TokenNameCOMMENT_LINE	seed: 
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"a b c d e f g h i j k"	TokenNameStringLiteral	a b c d e f g h i j k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMockGraphTokenFilterOnGraphInput	TokenNameIdentifier	 test Mock Graph Token Filter On Graph Input
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TEST: iter="	TokenNameStringLiteral	 TEST: iter=
+	TokenNamePLUS	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make new analyzer each time, because MGTF has fixed 	TokenNameCOMMENT_LINE	Make new analyzer each time, because MGTF has fixed 
// seed: 	TokenNameCOMMENT_LINE	seed: 
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
GraphTokenizer	TokenNameIdentifier	 Graph Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"a/x:3 c/y:2 d e f/z:4 g h i j k"	TokenNameStringLiteral	a/x:3 c/y:2 d e f/z:4 g h i j k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Just deletes (leaving hole) token 'a': 	TokenNameCOMMENT_LINE	Just deletes (leaving hole) token 'a': 
private	TokenNameprivate	
final	TokenNamefinal	
static	TokenNamestatic	
class	TokenNameclass	
RemoveATokens	TokenNameIdentifier	 Remove A Tokens
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
pendingPosInc	TokenNameIdentifier	 pending Pos Inc
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
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncAtt	TokenNameIdentifier	 pos Inc Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RemoveATokens	TokenNameIdentifier	 Remove A Tokens
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
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
pendingPosInc	TokenNameIdentifier	 pending Pos Inc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
pendingPosInc	TokenNameIdentifier	 pending Pos Inc
+	TokenNamePLUS	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
boolean	TokenNameboolean	
gotOne	TokenNameIdentifier	 got One
=	TokenNameEQUAL	
input	TokenNameIdentifier	 input
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
gotOne	TokenNameIdentifier	 got One
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"a"	TokenNameStringLiteral	a
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pendingPosInc	TokenNameIdentifier	 pending Pos Inc
+=	TokenNamePLUS_EQUAL	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
pendingPosInc	TokenNameIdentifier	 pending Pos Inc
+	TokenNamePLUS	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pendingPosInc	TokenNameIdentifier	 pending Pos Inc
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMockGraphTokenFilterBeforeHoles	TokenNameIdentifier	 test Mock Graph Token Filter Before Holes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TEST: iter="	TokenNameStringLiteral	 TEST: iter=
+	TokenNamePLUS	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make new analyzer each time, because MGTF has fixed 	TokenNameCOMMENT_LINE	Make new analyzer each time, because MGTF has fixed 
// seed: 	TokenNameCOMMENT_LINE	seed: 
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t3	TokenNameIdentifier	 t3
=	TokenNameEQUAL	
new	TokenNamenew	
RemoveATokens	TokenNameIdentifier	 Remove A Tokens
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t3	TokenNameIdentifier	 t3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"a b c d e f g h i j k"	TokenNameStringLiteral	a b c d e f g h i j k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"x y a b c d e f g h i j k"	TokenNameStringLiteral	x y a b c d e f g h i j k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"a b c d e f g h i j k a"	TokenNameStringLiteral	a b c d e f g h i j k a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"a b c d e f g h i j k a x y"	TokenNameStringLiteral	a b c d e f g h i j k a x y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMockGraphTokenFilterAfterHoles	TokenNameIdentifier	 test Mock Graph Token Filter After Holes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
100	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TEST: iter="	TokenNameStringLiteral	 TEST: iter=
+	TokenNamePLUS	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make new analyzer each time, because MGTF has fixed 	TokenNameCOMMENT_LINE	Make new analyzer each time, because MGTF has fixed 
// seed: 	TokenNameCOMMENT_LINE	seed: 
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
RemoveATokens	TokenNameIdentifier	 Remove A Tokens
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t3	TokenNameIdentifier	 t3
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t3	TokenNameIdentifier	 t3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"a b c d e f g h i j k"	TokenNameStringLiteral	a b c d e f g h i j k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"x y a b c d e f g h i j k"	TokenNameStringLiteral	x y a b c d e f g h i j k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"a b c d e f g h i j k a"	TokenNameStringLiteral	a b c d e f g h i j k a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
checkAnalysisConsistency	TokenNameIdentifier	 check Analysis Consistency
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
"a b c d e f g h i j k a x y"	TokenNameStringLiteral	a b c d e f g h i j k a x y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMockGraphTokenFilterRandom	TokenNameIdentifier	 test Mock Graph Token Filter Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TEST: iter="	TokenNameStringLiteral	 TEST: iter=
+	TokenNamePLUS	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make new analyzer each time, because MGTF has fixed 	TokenNameCOMMENT_LINE	Make new analyzer each time, because MGTF has fixed 
// seed: 	TokenNameCOMMENT_LINE	seed: 
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Two MockGraphTokenFilters 	TokenNameCOMMENT_LINE	Two MockGraphTokenFilters 
public	TokenNamepublic	
void	TokenNamevoid	
testDoubleMockGraphTokenFilterRandom	TokenNameIdentifier	 test Double Mock Graph Token Filter Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TEST: iter="	TokenNameStringLiteral	 TEST: iter=
+	TokenNamePLUS	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make new analyzer each time, because MGTF has fixed 	TokenNameCOMMENT_LINE	Make new analyzer each time, because MGTF has fixed 
// seed: 	TokenNameCOMMENT_LINE	seed: 
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMockGraphTokenFilterBeforeHolesRandom	TokenNameIdentifier	 test Mock Graph Token Filter Before Holes Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TEST: iter="	TokenNameStringLiteral	 TEST: iter=
+	TokenNamePLUS	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make new analyzer each time, because MGTF has fixed 	TokenNameCOMMENT_LINE	Make new analyzer each time, because MGTF has fixed 
// seed: 	TokenNameCOMMENT_LINE	seed: 
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
MockHoleInjectingTokenFilter	TokenNameIdentifier	 Mock Hole Injecting Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testMockGraphTokenFilterAfterHolesRandom	TokenNameIdentifier	 test Mock Graph Token Filter After Holes Random
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
10	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
RANDOM_MULTIPLIER	TokenNameIdentifier	 RANDOM  MULTIPLIER
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VERBOSE	TokenNameIdentifier	 VERBOSE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" TEST: iter="	TokenNameStringLiteral	 TEST: iter=
+	TokenNamePLUS	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make new analyzer each time, because MGTF has fixed 	TokenNameCOMMENT_LINE	Make new analyzer each time, because MGTF has fixed 
// seed: 	TokenNameCOMMENT_LINE	seed: 
final	TokenNamefinal	
Analyzer	TokenNameIdentifier	 Analyzer
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
ReusableAnalyzerBase	TokenNameIdentifier	 Reusable Analyzer Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
createComponents	TokenNameIdentifier	 create Components
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
fieldName	TokenNameIdentifier	 field Name
,	TokenNameCOMMA	
Reader	TokenNameIdentifier	 Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Tokenizer	TokenNameIdentifier	 Tokenizer
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
MockTokenizer	TokenNameIdentifier	 Mock Tokenizer
.	TokenNameDOT	
WHITESPACE	TokenNameIdentifier	 WHITESPACE
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
new	TokenNamenew	
MockHoleInjectingTokenFilter	TokenNameIdentifier	 Mock Hole Injecting Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
TokenStream	TokenNameIdentifier	 Token Stream
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
new	TokenNamenew	
MockGraphTokenFilter	TokenNameIdentifier	 Mock Graph Token Filter
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
TokenStreamComponents	TokenNameIdentifier	 Token Stream Components
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
t2	TokenNameIdentifier	 t2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
checkRandomData	TokenNameIdentifier	 check Random Data
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
