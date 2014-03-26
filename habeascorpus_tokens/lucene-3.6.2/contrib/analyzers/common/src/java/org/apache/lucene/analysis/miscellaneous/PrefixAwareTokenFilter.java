package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
miscellaneous	TokenNameIdentifier	 miscellaneous
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
Token	TokenNameIdentifier	 Token
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
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
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
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
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
TypeAttribute	TokenNameIdentifier	 Type Attribute
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
Payload	TokenNameIdentifier	 Payload
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
/** * Joins two token streams and leaves the last token of the first stream available * to be used when updating the token values in the second stream based on that token. * * The default implementation adds last prefix token end offset to the suffix token start and end offsets. * <p/> * <b>NOTE:</b> This filter might not behave correctly if used with custom Attributes, i.e. Attributes other than * the ones located in org.apache.lucene.analysis.tokenattributes. */	TokenNameCOMMENT_JAVADOC	 Joins two token streams and leaves the last token of the first stream available to be used when updating the token values in the second stream based on that token. * The default implementation adds last prefix token end offset to the suffix token start and end offsets. <p/> <b>NOTE:</b> This filter might not behave correctly if used with custom Attributes, i.e. Attributes other than the ones located in org.apache.lucene.analysis.tokenattributes. 
public	TokenNamepublic	
class	TokenNameclass	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
extends	TokenNameextends	
TokenStream	TokenNameIdentifier	 Token Stream
{	TokenNameLBRACE	
private	TokenNameprivate	
TokenStream	TokenNameIdentifier	 Token Stream
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TokenStream	TokenNameIdentifier	 Token Stream
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
termAtt	TokenNameIdentifier	 term Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
posIncrAtt	TokenNameIdentifier	 pos Incr Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
payloadAtt	TokenNameIdentifier	 payload Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
offsetAtt	TokenNameIdentifier	 offset Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TypeAttribute	TokenNameIdentifier	 Type Attribute
typeAtt	TokenNameIdentifier	 type Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
flagsAtt	TokenNameIdentifier	 flags Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
p_termAtt	TokenNameIdentifier	 p term Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
p_posIncrAtt	TokenNameIdentifier	 p pos Incr Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
p_payloadAtt	TokenNameIdentifier	 p payload Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
p_offsetAtt	TokenNameIdentifier	 p offset Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
TypeAttribute	TokenNameIdentifier	 Type Attribute
p_typeAtt	TokenNameIdentifier	 p type Att
;	TokenNameSEMICOLON	
private	TokenNameprivate	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
p_flagsAtt	TokenNameIdentifier	 p flags Att
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PrefixAwareTokenFilter	TokenNameIdentifier	 Prefix Aware Token Filter
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
TokenStream	TokenNameIdentifier	 Token Stream
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
prefixExhausted	TokenNameIdentifier	 prefix Exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadAtt	TokenNameIdentifier	 payload Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flagsAtt	TokenNameIdentifier	 flags Att
=	TokenNameEQUAL	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p_termAtt	TokenNameIdentifier	 p term Att
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
CharTermAttribute	TokenNameIdentifier	 Char Term Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p_posIncrAtt	TokenNameIdentifier	 p pos Incr Att
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PositionIncrementAttribute	TokenNameIdentifier	 Position Increment Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p_payloadAtt	TokenNameIdentifier	 p payload Att
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
PayloadAttribute	TokenNameIdentifier	 Payload Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p_offsetAtt	TokenNameIdentifier	 p offset Att
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
OffsetAttribute	TokenNameIdentifier	 Offset Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p_typeAtt	TokenNameIdentifier	 p type Att
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
TypeAttribute	TokenNameIdentifier	 Type Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p_flagsAtt	TokenNameIdentifier	 p flags Att
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
FlagsAttribute	TokenNameIdentifier	 Flags Attribute
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
previousPrefixToken	TokenNameIdentifier	 previous Prefix Token
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
reusableToken	TokenNameIdentifier	 reusable Token
=	TokenNameEQUAL	
new	TokenNamenew	
Token	TokenNameIdentifier	 Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
prefixExhausted	TokenNameIdentifier	 prefix Exhausted
;	TokenNameSEMICOLON	
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prefixExhausted	TokenNameIdentifier	 prefix Exhausted
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
nextToken	TokenNameIdentifier	 next Token
=	TokenNameEQUAL	
getNextPrefixInputToken	TokenNameIdentifier	 get Next Prefix Input Token
(	TokenNameLPAREN	
reusableToken	TokenNameIdentifier	 reusable Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixExhausted	TokenNameIdentifier	 prefix Exhausted
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
previousPrefixToken	TokenNameIdentifier	 previous Prefix Token
.	TokenNameDOT	
reinit	TokenNameIdentifier	 reinit
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Make it a deep copy 	TokenNameCOMMENT_LINE	Make it a deep copy 
Payload	TokenNameIdentifier	 Payload
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
previousPrefixToken	TokenNameIdentifier	 previous Prefix Token
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
previousPrefixToken	TokenNameIdentifier	 previous Prefix Token
.	TokenNameDOT	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Payload	TokenNameIdentifier	 Payload
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
setCurrentToken	TokenNameIdentifier	 set Current Token
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
nextToken	TokenNameIdentifier	 next Token
=	TokenNameEQUAL	
getNextSuffixInputToken	TokenNameIdentifier	 get Next Suffix Input Token
(	TokenNameLPAREN	
reusableToken	TokenNameIdentifier	 reusable Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nextToken	TokenNameIdentifier	 next Token
=	TokenNameEQUAL	
updateSuffixToken	TokenNameIdentifier	 update Suffix Token
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
,	TokenNameCOMMA	
previousPrefixToken	TokenNameIdentifier	 previous Prefix Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setCurrentToken	TokenNameIdentifier	 set Current Token
(	TokenNameLPAREN	
nextToken	TokenNameIdentifier	 next Token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
setCurrentToken	TokenNameIdentifier	 set Current Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
clearAttributes	TokenNameIdentifier	 clear Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
payloadAtt	TokenNameIdentifier	 payload Att
.	TokenNameDOT	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
getNextPrefixInputToken	TokenNameIdentifier	 get Next Prefix Input Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
p_termAtt	TokenNameIdentifier	 p term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p_termAtt	TokenNameIdentifier	 p term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
p_posIncrAtt	TokenNameIdentifier	 p pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
p_flagsAtt	TokenNameIdentifier	 p flags Att
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
p_offsetAtt	TokenNameIdentifier	 p offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p_offsetAtt	TokenNameIdentifier	 p offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
p_typeAtt	TokenNameIdentifier	 p type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
p_payloadAtt	TokenNameIdentifier	 p payload Att
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Token	TokenNameIdentifier	 Token
getNextSuffixInputToken	TokenNameIdentifier	 get Next Suffix Input Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
incrementToken	TokenNameIdentifier	 increment Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
copyBuffer	TokenNameIdentifier	 copy Buffer
(	TokenNameLPAREN	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
buffer	TokenNameIdentifier	 buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
termAtt	TokenNameIdentifier	 term Att
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setPositionIncrement	TokenNameIdentifier	 set Position Increment
(	TokenNameLPAREN	
posIncrAtt	TokenNameIdentifier	 pos Incr Att
.	TokenNameDOT	
getPositionIncrement	TokenNameIdentifier	 get Position Increment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setFlags	TokenNameIdentifier	 set Flags
(	TokenNameLPAREN	
flagsAtt	TokenNameIdentifier	 flags Att
.	TokenNameDOT	
getFlags	TokenNameIdentifier	 get Flags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setOffset	TokenNameIdentifier	 set Offset
(	TokenNameLPAREN	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
offsetAtt	TokenNameIdentifier	 offset Att
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setType	TokenNameIdentifier	 set Type
(	TokenNameLPAREN	
typeAtt	TokenNameIdentifier	 type Att
.	TokenNameDOT	
type	TokenNameIdentifier	 type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
setPayload	TokenNameIdentifier	 set Payload
(	TokenNameLPAREN	
payloadAtt	TokenNameIdentifier	 payload Att
.	TokenNameDOT	
getPayload	TokenNameIdentifier	 get Payload
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The default implementation adds last prefix token end offset to the suffix token start and end offsets. * * @param suffixToken a token from the suffix stream * @param lastPrefixToken the last token from the prefix stream * @return consumer token */	TokenNameCOMMENT_JAVADOC	 The default implementation adds last prefix token end offset to the suffix token start and end offsets. * @param suffixToken a token from the suffix stream @param lastPrefixToken the last token from the prefix stream @return consumer token 
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
updateSuffixToken	TokenNameIdentifier	 update Suffix Token
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
suffixToken	TokenNameIdentifier	 suffix Token
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
lastPrefixToken	TokenNameIdentifier	 last Prefix Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suffixToken	TokenNameIdentifier	 suffix Token
.	TokenNameDOT	
setStartOffset	TokenNameIdentifier	 set Start Offset
(	TokenNameLPAREN	
lastPrefixToken	TokenNameIdentifier	 last Prefix Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffixToken	TokenNameIdentifier	 suffix Token
.	TokenNameDOT	
startOffset	TokenNameIdentifier	 start Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suffixToken	TokenNameIdentifier	 suffix Token
.	TokenNameDOT	
setEndOffset	TokenNameIdentifier	 set End Offset
(	TokenNameLPAREN	
lastPrefixToken	TokenNameIdentifier	 last Prefix Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
suffixToken	TokenNameIdentifier	 suffix Token
.	TokenNameDOT	
endOffset	TokenNameIdentifier	 end Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
suffixToken	TokenNameIdentifier	 suffix Token
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
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixExhausted	TokenNameIdentifier	 prefix Exhausted
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
suffix	TokenNameIdentifier	 suffix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
suffix	TokenNameIdentifier	 suffix
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
getPrefix	TokenNameIdentifier	 get Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setPrefix	TokenNameIdentifier	 set Prefix
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
TokenStream	TokenNameIdentifier	 Token Stream
getSuffix	TokenNameIdentifier	 get Suffix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setSuffix	TokenNameIdentifier	 set Suffix
(	TokenNameLPAREN	
TokenStream	TokenNameIdentifier	 Token Stream
suffix	TokenNameIdentifier	 suffix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
suffix	TokenNameIdentifier	 suffix
=	TokenNameEQUAL	
suffix	TokenNameIdentifier	 suffix
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
