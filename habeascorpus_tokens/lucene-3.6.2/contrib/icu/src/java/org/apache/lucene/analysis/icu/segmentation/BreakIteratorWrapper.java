package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
segmentation	TokenNameIdentifier	 segmentation
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
CharacterIterator	TokenNameIdentifier	 Character Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UCharacter	TokenNameIdentifier	 U Character
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
BreakIterator	TokenNameIdentifier	 Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
DictionaryBasedBreakIterator	TokenNameIdentifier	 Dictionary Based Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
UTF16	TokenNameIdentifier	 UT F16
;	TokenNameSEMICOLON	
/** * Contain all the issues surrounding BreakIterators in ICU in one place. * Basically this boils down to the fact that they aren't very friendly to any * sort of OO design. * <p> * http://bugs.icu-project.org/trac/ticket/5901: RBBI.getRuleStatus(), hoist to * BreakIterator from RuleBasedBreakIterator * <p> * DictionaryBasedBreakIterator is a subclass of RuleBasedBreakIterator, but * doesn't actually behave as a subclass: it always returns 0 for * getRuleStatus(): * http://bugs.icu-project.org/trac/ticket/4730: Thai RBBI, no boundary type * tags * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 Contain all the issues surrounding BreakIterators in ICU in one place. Basically this boils down to the fact that they aren't very friendly to any sort of OO design. <p> http://bugs.icu-project.org/trac/ticket/5901: RBBI.getRuleStatus(), hoist to BreakIterator from RuleBasedBreakIterator <p> DictionaryBasedBreakIterator is a subclass of RuleBasedBreakIterator, but doesn't actually behave as a subclass: it always returns 0 for getRuleStatus(): http://bugs.icu-project.org/trac/ticket/4730: Thai RBBI, no boundary type tags @lucene.experimental 
abstract	TokenNameabstract	
class	TokenNameclass	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
textIterator	TokenNameIdentifier	 text Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
CharArrayIterator	TokenNameIdentifier	 Char Array Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
int	TokenNameint	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
int	TokenNameint	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
abstract	TokenNameabstract	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
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
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
textIterator	TokenNameIdentifier	 text Iterator
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
textIterator	TokenNameIdentifier	 text Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If its a DictionaryBasedBreakIterator, it doesn't return rulestatus, so * treat it like a generic BreakIterator If its any other * RuleBasedBreakIterator, the rule status can be used for token type. If its * any other BreakIterator, the rulestatus method is not available, so treat * it like a generic BreakIterator. */	TokenNameCOMMENT_JAVADOC	 If its a DictionaryBasedBreakIterator, it doesn't return rulestatus, so treat it like a generic BreakIterator If its any other RuleBasedBreakIterator, the rule status can be used for token type. If its any other BreakIterator, the rulestatus method is not available, so treat it like a generic BreakIterator. 
static	TokenNamestatic	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
breakIterator	TokenNameIdentifier	 break Iterator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
breakIterator	TokenNameIdentifier	 break Iterator
instanceof	TokenNameinstanceof	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
breakIterator	TokenNameIdentifier	 break Iterator
instanceof	TokenNameinstanceof	
DictionaryBasedBreakIterator	TokenNameIdentifier	 Dictionary Based Break Iterator
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
RBBIWrapper	TokenNameIdentifier	 RBBI Wrapper
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
)	TokenNameRPAREN	
breakIterator	TokenNameIdentifier	 break Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
new	TokenNamenew	
BIWrapper	TokenNameIdentifier	 BI Wrapper
(	TokenNameLPAREN	
breakIterator	TokenNameIdentifier	 break Iterator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * RuleBasedBreakIterator wrapper: RuleBasedBreakIterator (as long as its not * a DictionaryBasedBreakIterator) behaves correctly. */	TokenNameCOMMENT_JAVADOC	 RuleBasedBreakIterator wrapper: RuleBasedBreakIterator (as long as its not a DictionaryBasedBreakIterator) behaves correctly. 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
RBBIWrapper	TokenNameIdentifier	 RBBI Wrapper
extends	TokenNameextends	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
rbbi	TokenNameIdentifier	 rbbi
;	TokenNameSEMICOLON	
RBBIWrapper	TokenNameIdentifier	 RBBI Wrapper
(	TokenNameLPAREN	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
rbbi	TokenNameIdentifier	 rbbi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rbbi	TokenNameIdentifier	 rbbi
=	TokenNameEQUAL	
rbbi	TokenNameIdentifier	 rbbi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Generic BreakIterator wrapper: Either the rulestatus method is not * available or always returns 0. Calculate a rulestatus here so it behaves * like RuleBasedBreakIterator. * * Note: This is slower than RuleBasedBreakIterator. */	TokenNameCOMMENT_JAVADOC	 Generic BreakIterator wrapper: Either the rulestatus method is not available or always returns 0. Calculate a rulestatus here so it behaves like RuleBasedBreakIterator. * Note: This is slower than RuleBasedBreakIterator. 
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
BIWrapper	TokenNameIdentifier	 BI Wrapper
extends	TokenNameextends	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
BIWrapper	TokenNameIdentifier	 BI Wrapper
(	TokenNameLPAREN	
BreakIterator	TokenNameIdentifier	 Break Iterator
bi	TokenNameIdentifier	 bi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
bi	TokenNameIdentifier	 bi
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
getRuleStatus	TokenNameIdentifier	 get Rule Status
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
status	TokenNameIdentifier	 status
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
calcStatus	TokenNameIdentifier	 calc Status
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
calcStatus	TokenNameIdentifier	 calc Status
(	TokenNameLPAREN	
int	TokenNameint	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
int	TokenNameint	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
||	TokenNameOR_OR	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
return	TokenNamereturn	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_NONE	TokenNameIdentifier	 WORD  NONE
;	TokenNameSEMICOLON	
int	TokenNameint	
begin	TokenNameIdentifier	 begin
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
int	TokenNameint	
codepoint	TokenNameIdentifier	 codepoint
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
begin	TokenNameIdentifier	 begin
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
+=	TokenNamePLUS_EQUAL	
UTF16	TokenNameIdentifier	 UT F16
.	TokenNameDOT	
getCharCount	TokenNameIdentifier	 get Char Count
(	TokenNameLPAREN	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
codepoint	TokenNameIdentifier	 codepoint
=	TokenNameEQUAL	
UTF16	TokenNameIdentifier	 UT F16
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
begin	TokenNameIdentifier	 begin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
UCharacter	TokenNameIdentifier	 U Character
.	TokenNameDOT	
isDigit	TokenNameIdentifier	 is Digit
(	TokenNameLPAREN	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_NUMBER	TokenNameIdentifier	 WORD  NUMBER
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
UCharacter	TokenNameIdentifier	 U Character
.	TokenNameDOT	
isLetter	TokenNameIdentifier	 is Letter
(	TokenNameLPAREN	
codepoint	TokenNameIdentifier	 codepoint
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: try to separately specify ideographic, kana? 	TokenNameCOMMENT_LINE	TODO: try to separately specify ideographic, kana? 
// [currently all bundled as letter for this case] 	TokenNameCOMMENT_LINE	[currently all bundled as letter for this case] 
return	TokenNamereturn	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_LETTER	TokenNameIdentifier	 WORD  LETTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_NONE	TokenNameIdentifier	 WORD  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
CharacterIterator	TokenNameIdentifier	 Character Iterator
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bi	TokenNameIdentifier	 bi
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
status	TokenNameIdentifier	 status
=	TokenNameEQUAL	
RuleBasedBreakIterator	TokenNameIdentifier	 Rule Based Break Iterator
.	TokenNameDOT	
WORD_NONE	TokenNameIdentifier	 WORD  NONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
