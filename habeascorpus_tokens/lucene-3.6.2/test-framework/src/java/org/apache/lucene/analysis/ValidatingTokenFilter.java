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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Attribute	TokenNameIdentifier	 Attribute
;	TokenNameSEMICOLON	
// TODO: rename to OffsetsXXXTF? ie we only validate 	TokenNameCOMMENT_LINE	TODO: rename to OffsetsXXXTF? ie we only validate 
// offsets (now anyway...) 	TokenNameCOMMENT_LINE	offsets (now anyway...) 
// TODO: also make a DebuggingTokenFilter, that just prints 	TokenNameCOMMENT_LINE	TODO: also make a DebuggingTokenFilter, that just prints 
// all att values that come through it... 	TokenNameCOMMENT_LINE	all att values that come through it... 
// TODO: BTSTC should just append this to the chain 	TokenNameCOMMENT_LINE	TODO: BTSTC should just append this to the chain 
// instead of checking itself: 	TokenNameCOMMENT_LINE	instead of checking itself: 
/** A TokenFilter that checks consistency of the tokens (eg * offsets are consistent with one another). */	TokenNameCOMMENT_JAVADOC	 A TokenFilter that checks consistency of the tokens (eg offsets are consistent with one another). 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ValidatingTokenFilter	TokenNameIdentifier	 Validating Token Filter
extends	TokenNameextends	
TokenFilter	TokenNameIdentifier	 Token Filter
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastStartOffset	TokenNameIdentifier	 last Start Offset
;	TokenNameSEMICOLON	
// Maps position to the start/end offset: 	TokenNameCOMMENT_LINE	Maps position to the start/end offset: 
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
posToStartOffset	TokenNameIdentifier	 pos To Start Offset
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
posToEndOffset	TokenNameIdentifier	 pos To End Offset
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncAtt	TokenNameIdentifier	 pos Inc Att
=	TokenNameEQUAL	
getAttrIfExists	TokenNameIdentifier	 get Attr If Exists
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
posLenAtt	TokenNameIdentifier	 pos Len Att
=	TokenNameEQUAL	
getAttrIfExists	TokenNameIdentifier	 get Attr If Exists
(	TokenNameLPAREN	
PositionLengthAttribute	TokenNameIdentifier	 Position Length Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
getAttrIfExists	TokenNameIdentifier	 get Attr If Exists
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
getAttrIfExists	TokenNameIdentifier	 get Attr If Exists
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
boolean	TokenNameboolean	
offsetsAreCorrect	TokenNameIdentifier	 offsets Are Correct
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
// Returns null if the attr wasn't already added 	TokenNameCOMMENT_LINE	Returns null if the attr wasn't already added 
private	TokenNameprivate	
<	TokenNameLESS	
A	TokenNameIdentifier	 A
extends	TokenNameextends	
Attribute	TokenNameIdentifier	 Attribute
>	TokenNameGREATER	
A	TokenNameIdentifier	 A
getAttrIfExists	TokenNameIdentifier	 get Attr If Exists
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
<	TokenNameLESS	
A	TokenNameIdentifier	 A
>	TokenNameGREATER	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasAttribute	TokenNameIdentifier	 has Attribute
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getAttribute	TokenNameIdentifier	 get Attribute
(	TokenNameLPAREN	
att	TokenNameIdentifier	 att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** The name arg is used to identify this stage when * throwing exceptions (useful if you have more than one * instance in your chain). */	TokenNameCOMMENT_JAVADOC	 The name arg is used to identify this stage when throwing exceptions (useful if you have more than one instance in your chain). 
public	TokenNamepublic	
ValidatingTokenFilter	TokenNameIdentifier	 Validating Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
offsetsAreCorrect	TokenNameIdentifier	 offsets Are Correct
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
offsetsAreCorrect	TokenNameIdentifier	 offsets Are Correct
=	TokenNameEQUAL	
offsetsAreCorrect	TokenNameIdentifier	 offsets Are Correct
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
int	TokenNameint	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
posLen	TokenNameIdentifier	 pos Len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
posIncAtt	TokenNameIdentifier	 pos Inc Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
+=	TokenNamePLUS_EQUAL	
posIncAtt	TokenNameIdentifier	 pos Inc Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"first posInc must be > 0"	TokenNameStringLiteral	first posInc must be > 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// System.out.println(" got token=" + termAtt + " pos=" + pos); 	TokenNameCOMMENT_LINE	System.out.println(" got token=" + termAtt + " pos=" + pos); 
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
startOffset	TokenNameIdentifier	 start Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
endOffset	TokenNameIdentifier	 end Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
startOffset	TokenNameIdentifier	 start Offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": startOffset="	TokenNameStringLiteral	: startOffset=
+	TokenNamePLUS	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
" is < 0"	TokenNameStringLiteral	 is < 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": endOffset="	TokenNameStringLiteral	: endOffset=
+	TokenNamePLUS	
endOffset	TokenNameIdentifier	 end Offset
+	TokenNamePLUS	
" is < 0"	TokenNameStringLiteral	 is < 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
endOffset	TokenNameIdentifier	 end Offset
<	TokenNameLESS	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": startOffset="	TokenNameStringLiteral	: startOffset=
+	TokenNamePLUS	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
" is > endOffset="	TokenNameStringLiteral	 is > endOffset=
+	TokenNamePLUS	
endOffset	TokenNameIdentifier	 end Offset
+	TokenNamePLUS	
" pos="	TokenNameStringLiteral	 pos=
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
"; token="	TokenNameStringLiteral	; token=
+	TokenNamePLUS	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
offsetsAreCorrect	TokenNameIdentifier	 offsets Are Correct
&&	TokenNameAND_AND	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
lastStartOffset	TokenNameIdentifier	 last Start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": offsets must not go backwards startOffset="	TokenNameStringLiteral	: offsets must not go backwards startOffset=
+	TokenNamePLUS	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
" is < lastStartOffset="	TokenNameStringLiteral	 is < lastStartOffset=
+	TokenNamePLUS	
lastStartOffset	TokenNameIdentifier	 last Start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lastStartOffset	TokenNameIdentifier	 last Start Offset
=	TokenNameEQUAL	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
posLen	TokenNameIdentifier	 pos Len
=	TokenNameEQUAL	
posLenAtt	TokenNameIdentifier	 pos Len Att
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
posLenAtt	TokenNameIdentifier	 pos Len Att
.	TokenNameDOT	
getPositionLength	TokenNameIdentifier	 get Position Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
posIncAtt	TokenNameIdentifier	 pos Inc Att
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
offsetsAreCorrect	TokenNameIdentifier	 offsets Are Correct
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
posToStartOffset	TokenNameIdentifier	 pos To Start Offset
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time we've seen a token leaving from this position: 	TokenNameCOMMENT_LINE	First time we've seen a token leaving from this position: 
posToStartOffset	TokenNameIdentifier	 pos To Start Offset
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
,	TokenNameCOMMA	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" + s " + pos + " -> " + startOffset); 	TokenNameCOMMENT_LINE	System.out.println(" + s " + pos + " -> " + startOffset); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We've seen a token leaving from this position 	TokenNameCOMMENT_LINE	We've seen a token leaving from this position 
// before; verify the startOffset is the same: 	TokenNameCOMMENT_LINE	before; verify the startOffset is the same: 
//System.out.println(" + vs " + pos + " -> " + startOffset); 	TokenNameCOMMENT_LINE	System.out.println(" + vs " + pos + " -> " + startOffset); 
final	TokenNamefinal	
int	TokenNameint	
oldStartOffset	TokenNameIdentifier	 old Start Offset
=	TokenNameEQUAL	
posToStartOffset	TokenNameIdentifier	 pos To Start Offset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldStartOffset	TokenNameIdentifier	 old Start Offset
!=	TokenNameNOT_EQUAL	
startOffset	TokenNameIdentifier	 start Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": inconsistent startOffset at pos="	TokenNameStringLiteral	: inconsistent startOffset at pos=
+	TokenNamePLUS	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
oldStartOffset	TokenNameIdentifier	 old Start Offset
+	TokenNamePLUS	
" vs "	TokenNameStringLiteral	 vs 
+	TokenNamePLUS	
startOffset	TokenNameIdentifier	 start Offset
+	TokenNamePLUS	
"; token="	TokenNameStringLiteral	; token=
+	TokenNamePLUS	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
final	TokenNamefinal	
int	TokenNameint	
endPos	TokenNameIdentifier	 end Pos
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
+	TokenNamePLUS	
posLen	TokenNameIdentifier	 pos Len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
posToEndOffset	TokenNameIdentifier	 pos To End Offset
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
endPos	TokenNameIdentifier	 end Pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// First time we've seen a token arriving to this position: 	TokenNameCOMMENT_LINE	First time we've seen a token arriving to this position: 
posToEndOffset	TokenNameIdentifier	 pos To End Offset
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
endPos	TokenNameIdentifier	 end Pos
,	TokenNameCOMMA	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//System.out.println(" + e " + endPos + " -> " + endOffset); 	TokenNameCOMMENT_LINE	System.out.println(" + e " + endPos + " -> " + endOffset); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// We've seen a token arriving to this position 	TokenNameCOMMENT_LINE	We've seen a token arriving to this position 
// before; verify the endOffset is the same: 	TokenNameCOMMENT_LINE	before; verify the endOffset is the same: 
//System.out.println(" + ve " + endPos + " -> " + endOffset); 	TokenNameCOMMENT_LINE	System.out.println(" + ve " + endPos + " -> " + endOffset); 
final	TokenNamefinal	
int	TokenNameint	
oldEndOffset	TokenNameIdentifier	 old End Offset
=	TokenNameEQUAL	
posToEndOffset	TokenNameIdentifier	 pos To End Offset
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
endPos	TokenNameIdentifier	 end Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldEndOffset	TokenNameIdentifier	 old End Offset
!=	TokenNameNOT_EQUAL	
endOffset	TokenNameIdentifier	 end Offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
+	TokenNamePLUS	
": inconsistent endOffset at pos="	TokenNameStringLiteral	: inconsistent endOffset at pos=
+	TokenNamePLUS	
endPos	TokenNameIdentifier	 end Pos
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
oldEndOffset	TokenNameIdentifier	 old End Offset
+	TokenNamePLUS	
" vs "	TokenNameStringLiteral	 vs 
+	TokenNamePLUS	
endOffset	TokenNameIdentifier	 end Offset
+	TokenNamePLUS	
"; token="	TokenNameStringLiteral	; token=
+	TokenNamePLUS	
termAtt	TokenNameIdentifier	 term Att
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
// TODO: what else to validate 	TokenNameCOMMENT_LINE	TODO: what else to validate 
// TODO: check that endOffset is >= max(endOffset) 	TokenNameCOMMENT_LINE	TODO: check that endOffset is >= max(endOffset) 
// we've seen 	TokenNameCOMMENT_LINE	we've seen 
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
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
posToStartOffset	TokenNameIdentifier	 pos To Start Offset
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posToEndOffset	TokenNameIdentifier	 pos To End Offset
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lastStartOffset	TokenNameIdentifier	 last Start Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
