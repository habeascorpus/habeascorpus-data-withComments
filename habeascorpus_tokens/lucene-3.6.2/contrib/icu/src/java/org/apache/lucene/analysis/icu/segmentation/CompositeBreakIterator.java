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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
ibm	TokenNameIdentifier	 ibm
.	TokenNameDOT	
icu	TokenNameIdentifier	 icu
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
UScript	TokenNameIdentifier	 U Script
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
/** * An internal BreakIterator for multilingual text, following recommendations * from: UAX #29: Unicode Text Segmentation. (http://unicode.org/reports/tr29/) * <p> * See http://unicode.org/reports/tr29/#Tailoring for the motivation of this * design. * <p> * Text is first divided into script boundaries. The processing is then * delegated to the appropriate break iterator for that specific script. * <p> * This break iterator also allows you to retrieve the ISO 15924 script code * associated with a piece of text. * <p> * See also UAX #29, UTR #24 * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 An internal BreakIterator for multilingual text, following recommendations from: UAX #29: Unicode Text Segmentation. (http://unicode.org/reports/tr29/) <p> See http://unicode.org/reports/tr29/#Tailoring for the motivation of this design. <p> Text is first divided into script boundaries. The processing is then delegated to the appropriate break iterator for that specific script. <p> This break iterator also allows you to retrieve the ISO 15924 script code associated with a piece of text. <p> See also UAX #29, UTR #24 @lucene.experimental 
final	TokenNamefinal	
class	TokenNameclass	
CompositeBreakIterator	TokenNameIdentifier	 Composite Break Iterator
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ICUTokenizerConfig	TokenNameIdentifier	 ICU Tokenizer Config
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
wordBreakers	TokenNameIdentifier	 word Breakers
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
[	TokenNameLBRACKET	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
CODE_LIMIT	TokenNameIdentifier	 CODE  LIMIT
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
rbbi	TokenNameIdentifier	 rbbi
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
ScriptIterator	TokenNameIdentifier	 Script Iterator
scriptIterator	TokenNameIdentifier	 script Iterator
=	TokenNameEQUAL	
new	TokenNamenew	
ScriptIterator	TokenNameIdentifier	 Script Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
char	TokenNamechar	
text	TokenNameIdentifier	 text
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CompositeBreakIterator	TokenNameIdentifier	 Composite Break Iterator
(	TokenNameLPAREN	
ICUTokenizerConfig	TokenNameIdentifier	 ICU Tokenizer Config
config	TokenNameIdentifier	 config
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
config	TokenNameIdentifier	 config
=	TokenNameEQUAL	
config	TokenNameIdentifier	 config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the next break position. If the RBBI range is exhausted within the * script boundary, examine the next script boundary. * * @return the next break position or BreakIterator.DONE */	TokenNameCOMMENT_JAVADOC	 Retrieve the next break position. If the RBBI range is exhausted within the script boundary, examine the next script boundary. * @return the next break position or BreakIterator.DONE 
int	TokenNameint	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
&&	TokenNameAND_AND	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rbbi	TokenNameIdentifier	 rbbi
=	TokenNameEQUAL	
getBreakIterator	TokenNameIdentifier	 get Break Iterator
(	TokenNameLPAREN	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptCode	TokenNameIdentifier	 get Script Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptStart	TokenNameIdentifier	 get Script Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptLimit	TokenNameIdentifier	 get Script Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptStart	TokenNameIdentifier	 get Script Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
:	TokenNameCOLON	
next	TokenNameIdentifier	 next
+	TokenNamePLUS	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptStart	TokenNameIdentifier	 get Script Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the current break position. * * @return the current break position or BreakIterator.DONE */	TokenNameCOMMENT_JAVADOC	 Retrieve the current break position. * @return the current break position or BreakIterator.DONE 
int	TokenNameint	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
current	TokenNameIdentifier	 current
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
==	TokenNameEQUAL_EQUAL	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
)	TokenNameRPAREN	
?	TokenNameQUESTION	
BreakIterator	TokenNameIdentifier	 Break Iterator
.	TokenNameDOT	
DONE	TokenNameIdentifier	 DONE
:	TokenNameCOLON	
current	TokenNameIdentifier	 current
+	TokenNamePLUS	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptStart	TokenNameIdentifier	 get Script Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Retrieve the rule status code (token type) from the underlying break * iterator * * @return rule status code (see RuleBasedBreakIterator constants) */	TokenNameCOMMENT_JAVADOC	 Retrieve the rule status code (token type) from the underlying break iterator * @return rule status code (see RuleBasedBreakIterator constants) 
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
/** * Retrieve the UScript script code for the current token. This code can be * decoded with UScript into a name or ISO 15924 code. * * @return UScript script code for the current token. */	TokenNameCOMMENT_JAVADOC	 Retrieve the UScript script code for the current token. This code can be decoded with UScript into a name or ISO 15924 code. * @return UScript script code for the current token. 
int	TokenNameint	
getScriptCode	TokenNameIdentifier	 get Script Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptCode	TokenNameIdentifier	 get Script Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a new region of text to be examined by this iterator * * @param text buffer of text * @param start offset into buffer * @param length maximum length to examine */	TokenNameCOMMENT_JAVADOC	 Set a new region of text to be examined by this iterator * @param text buffer of text @param start offset into buffer @param length maximum length to examine 
void	TokenNamevoid	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
final	TokenNamefinal	
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
scriptIterator	TokenNameIdentifier	 script Iterator
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
if	TokenNameif	
(	TokenNameLPAREN	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rbbi	TokenNameIdentifier	 rbbi
=	TokenNameEQUAL	
getBreakIterator	TokenNameIdentifier	 get Break Iterator
(	TokenNameLPAREN	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptCode	TokenNameIdentifier	 get Script Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptStart	TokenNameIdentifier	 get Script Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptLimit	TokenNameIdentifier	 get Script Limit
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
scriptIterator	TokenNameIdentifier	 script Iterator
.	TokenNameDOT	
getScriptStart	TokenNameIdentifier	 get Script Start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rbbi	TokenNameIdentifier	 rbbi
=	TokenNameEQUAL	
getBreakIterator	TokenNameIdentifier	 get Break Iterator
(	TokenNameLPAREN	
UScript	TokenNameIdentifier	 U Script
.	TokenNameDOT	
COMMON	TokenNameIdentifier	 COMMON
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rbbi	TokenNameIdentifier	 rbbi
.	TokenNameDOT	
setText	TokenNameIdentifier	 set Text
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
getBreakIterator	TokenNameIdentifier	 get Break Iterator
(	TokenNameLPAREN	
int	TokenNameint	
scriptCode	TokenNameIdentifier	 script Code
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
wordBreakers	TokenNameIdentifier	 word Breakers
[	TokenNameLBRACKET	
scriptCode	TokenNameIdentifier	 script Code
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
wordBreakers	TokenNameIdentifier	 word Breakers
[	TokenNameLBRACKET	
scriptCode	TokenNameIdentifier	 script Code
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
BreakIteratorWrapper	TokenNameIdentifier	 Break Iterator Wrapper
.	TokenNameDOT	
wrap	TokenNameIdentifier	 wrap
(	TokenNameLPAREN	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
getBreakIterator	TokenNameIdentifier	 get Break Iterator
(	TokenNameLPAREN	
scriptCode	TokenNameIdentifier	 script Code
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
wordBreakers	TokenNameIdentifier	 word Breakers
[	TokenNameLBRACKET	
scriptCode	TokenNameIdentifier	 script Code
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
