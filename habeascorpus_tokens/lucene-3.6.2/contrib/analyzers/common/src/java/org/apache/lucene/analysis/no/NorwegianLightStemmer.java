package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
no	TokenNameIdentifier	 no
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * This algorithm is updated based on code located at: * http://members.unine.ch/jacques.savoy/clef/ * * Full copyright for that code follows: */	TokenNameCOMMENT_BLOCK	 This algorithm is updated based on code located at: http://members.unine.ch/jacques.savoy/clef/ * Full copyright for that code follows: 
/* * Copyright (c) 2005, Jacques Savoy * All rights reserved. * * Redistribution and use in source and binary forms, with or without * modification, are permitted provided that the following conditions are met: * * Redistributions of source code must retain the above copyright notice, this * list of conditions and the following disclaimer. Redistributions in binary * form must reproduce the above copyright notice, this list of conditions and * the following disclaimer in the documentation and/or other materials * provided with the distribution. Neither the name of the author nor the names * of its contributors may be used to endorse or promote products derived from * this software without specific prior written permission. * * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE * POSSIBILITY OF SUCH DAMAGE. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2005, Jacques Savoy All rights reserved. * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following conditions are met: * Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following disclaimer in the documentation and/or other materials provided with the distribution. Neither the name of the author nor the names of its contributors may be used to endorse or promote products derived from this software without specific prior written permission. * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE. 
import	TokenNameimport	
static	TokenNamestatic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StemmerUtil	TokenNameIdentifier	 Stemmer Util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
/** * Light Stemmer for Norwegian. * <p> * Parts of this stemmer is adapted from SwedishLightStemFilter, except * that while the Swedish one has a pre-defined rule set and a corresponding * corpus to validate against whereas the Norwegian one is hand crafted. */	TokenNameCOMMENT_JAVADOC	 Light Stemmer for Norwegian. <p> Parts of this stemmer is adapted from SwedishLightStemFilter, except that while the Swedish one has a pre-defined rule set and a corresponding corpus to validate against whereas the Norwegian one is hand crafted. 
public	TokenNamepublic	
class	TokenNameclass	
NorwegianLightStemmer	TokenNameIdentifier	 Norwegian Light Stemmer
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Remove posessive -s (bilens -> bilen) and continue checking 	TokenNameCOMMENT_LINE	Remove posessive -s (bilens -> bilen) and continue checking 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
's'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
len	TokenNameIdentifier	 len
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// Remove common endings, single-pass 	TokenNameCOMMENT_LINE	Remove common endings, single-pass 
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
7	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"heter"	TokenNameStringLiteral	heter
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// general ending (hemmelig-heter -> hemmelig) 	TokenNameCOMMENT_LINE	general ending (hemmelig-heter -> hemmelig) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"heten"	TokenNameStringLiteral	heten
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// general ending (hemmelig-heten -> hemmelig) 	TokenNameCOMMENT_LINE	general ending (hemmelig-heten -> hemmelig) 
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
5	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"dom"	TokenNameStringLiteral	dom
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// general ending (kristen-dom -> kristen) 	TokenNameCOMMENT_LINE	general ending (kristen-dom -> kristen) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"het"	TokenNameStringLiteral	het
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// general ending (hemmelig-het -> hemmelig) 	TokenNameCOMMENT_LINE	general ending (hemmelig-het -> hemmelig) 
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
7	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"elser"	TokenNameStringLiteral	elser
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// general ending (føl-elser -> føl) 	TokenNameCOMMENT_LINE	general ending (føl-elser -> føl) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"elsen"	TokenNameStringLiteral	elsen
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// general ending (føl-elsen -> føl) 	TokenNameCOMMENT_LINE	general ending (føl-elsen -> føl) 
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
6	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ende"	TokenNameStringLiteral	ende
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// (sov-ende -> sov) 	TokenNameCOMMENT_LINE	(sov-ende -> sov) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"else"	TokenNameStringLiteral	else
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// general ending (føl-else -> føl) 	TokenNameCOMMENT_LINE	general ending (føl-else -> føl) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"este"	TokenNameStringLiteral	este
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// adj (fin-este -> fin) 	TokenNameCOMMENT_LINE	adj (fin-este -> fin) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"eren"	TokenNameStringLiteral	eren
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// masc 	TokenNameCOMMENT_LINE	masc 
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
5	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ere"	TokenNameStringLiteral	ere
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// adj (fin-ere -> fin) 	TokenNameCOMMENT_LINE	adj (fin-ere -> fin) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"est"	TokenNameStringLiteral	est
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// adj (fin-est -> fin) 	TokenNameCOMMENT_LINE	adj (fin-est -> fin) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ene"	TokenNameStringLiteral	ene
)	TokenNameRPAREN	
// masc/fem/neutr pl definite (hus-ene) 	TokenNameCOMMENT_LINE	masc/fem/neutr pl definite (hus-ene) 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"er"	TokenNameStringLiteral	er
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// masc/fem indefinite 	TokenNameCOMMENT_LINE	masc/fem indefinite 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"en"	TokenNameStringLiteral	en
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// masc/fem definite 	TokenNameCOMMENT_LINE	masc/fem definite 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"et"	TokenNameStringLiteral	et
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// neutr definite 	TokenNameCOMMENT_LINE	neutr definite 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"st"	TokenNameStringLiteral	st
)	TokenNameRPAREN	
||	TokenNameOR_OR	
// adj (billig-st -> billig) 	TokenNameCOMMENT_LINE	adj (billig-st -> billig) 
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"te"	TokenNameStringLiteral	te
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
switch	TokenNameswitch	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
'a'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// fem definite 	TokenNameCOMMENT_LINE	fem definite 
case	TokenNamecase	
'e'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
// to get correct stem for nouns ending in -e (kake -> kak, kaker -> kak) 	TokenNameCOMMENT_LINE	to get correct stem for nouns ending in -e (kake -> kak, kaker -> kak) 
case	TokenNamecase	
'n'	TokenNameCharacterLiteral	
:	TokenNameCOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
