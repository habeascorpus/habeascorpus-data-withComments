package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
/** * Light Stemmer for Hindi. * <p> * Implements the algorithm specified in: * <i>A Lightweight Stemmer for Hindi</i> * Ananthakrishnan Ramanathan and Durgesh D Rao. * http://computing.open.ac.uk/Sites/EACLSouthAsia/Papers/p6-Ramanathan.pdf * </p> */	TokenNameCOMMENT_JAVADOC	 Light Stemmer for Hindi. <p> Implements the algorithm specified in: <i>A Lightweight Stemmer for Hindi</i> Ananthakrishnan Ramanathan and Durgesh D Rao. http://computing.open.ac.uk/Sites/EACLSouthAsia/Papers/p6-Ramanathan.pdf </p> 
public	TokenNamepublic	
class	TokenNameclass	
HindiStemmer	TokenNameIdentifier	 Hindi Stemmer
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
stem	TokenNameIdentifier	 stem
(	TokenNameLPAREN	
char	TokenNamechar	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// 5 	TokenNameCOMMENT_LINE	5 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाएंगी"	TokenNameStringLiteral	ाएंगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाएंगे"	TokenNameStringLiteral	ाएंगे
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाऊंगी"	TokenNameStringLiteral	ाऊंगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाऊंगा"	TokenNameStringLiteral	ाऊंगा
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाइयाँ"	TokenNameStringLiteral	ाइयाँ
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाइयों"	TokenNameStringLiteral	ाइयों
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाइयां"	TokenNameStringLiteral	ाइयां
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
5	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 4 	TokenNameCOMMENT_LINE	4 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाएगी"	TokenNameStringLiteral	ाएगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाएगा"	TokenNameStringLiteral	ाएगा
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाओगी"	TokenNameStringLiteral	ाओगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाओगे"	TokenNameStringLiteral	ाओगे
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"एंगी"	TokenNameStringLiteral	एंगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ेंगी"	TokenNameStringLiteral	ेंगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"एंगे"	TokenNameStringLiteral	एंगे
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ेंगे"	TokenNameStringLiteral	ेंगे
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ूंगी"	TokenNameStringLiteral	ूंगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ूंगा"	TokenNameStringLiteral	ूंगा
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ातीं"	TokenNameStringLiteral	ातीं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"नाओं"	TokenNameStringLiteral	नाओं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"नाएं"	TokenNameStringLiteral	नाएं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ताओं"	TokenNameStringLiteral	ताओं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ताएं"	TokenNameStringLiteral	ताएं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ियाँ"	TokenNameStringLiteral	ियाँ
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ियों"	TokenNameStringLiteral	ियों
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ियां"	TokenNameStringLiteral	ियां
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 3 	TokenNameCOMMENT_LINE	3 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाकर"	TokenNameStringLiteral	ाकर
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाइए"	TokenNameStringLiteral	ाइए
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाईं"	TokenNameStringLiteral	ाईं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाया"	TokenNameStringLiteral	ाया
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ेगी"	TokenNameStringLiteral	ेगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ेगा"	TokenNameStringLiteral	ेगा
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ोगी"	TokenNameStringLiteral	ोगी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ोगे"	TokenNameStringLiteral	ोगे
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाने"	TokenNameStringLiteral	ाने
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाना"	TokenNameStringLiteral	ाना
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाते"	TokenNameStringLiteral	ाते
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाती"	TokenNameStringLiteral	ाती
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाता"	TokenNameStringLiteral	ाता
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"तीं"	TokenNameStringLiteral	तीं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाओं"	TokenNameStringLiteral	ाओं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाएं"	TokenNameStringLiteral	ाएं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ुओं"	TokenNameStringLiteral	ुओं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ुएं"	TokenNameStringLiteral	ुएं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ुआं"	TokenNameStringLiteral	ुआं
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 2 	TokenNameCOMMENT_LINE	2 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"कर"	TokenNameStringLiteral	कर
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाओ"	TokenNameStringLiteral	ाओ
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"िए"	TokenNameStringLiteral	िए
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाई"	TokenNameStringLiteral	ाई
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाए"	TokenNameStringLiteral	ाए
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ने"	TokenNameStringLiteral	ने
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"नी"	TokenNameStringLiteral	नी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ना"	TokenNameStringLiteral	ना
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ते"	TokenNameStringLiteral	ते
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ीं"	TokenNameStringLiteral	ीं
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ती"	TokenNameStringLiteral	ती
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ता"	TokenNameStringLiteral	ता
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ाँ"	TokenNameStringLiteral	ाँ
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ां"	TokenNameStringLiteral	ां
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ों"	TokenNameStringLiteral	ों
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ें"	TokenNameStringLiteral	ें
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// 1 	TokenNameCOMMENT_LINE	1 
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ो"	TokenNameStringLiteral	ो
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"े"	TokenNameStringLiteral	े
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ू"	TokenNameStringLiteral	ू
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ु"	TokenNameStringLiteral	ु
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ी"	TokenNameStringLiteral	ी
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ि"	TokenNameStringLiteral	ि
)	TokenNameRPAREN	
||	TokenNameOR_OR	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
"ा"	TokenNameStringLiteral	ा
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
