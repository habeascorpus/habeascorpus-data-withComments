package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
byTask	TokenNameIdentifier	 by Task
.	TokenNameDOT	
feeds	TokenNameIdentifier	 feeds
.	TokenNameDOT	
demohtml	TokenNameIdentifier	 demohtml
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
public	TokenNamepublic	
class	TokenNameclass	
Entities	TokenNameIdentifier	 Entities
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
decoder	TokenNameIdentifier	 decoder
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
300	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
encoder	TokenNameIdentifier	 encoder
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
0x100	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
decode	TokenNameIdentifier	 decode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
// remove trailing semicolon 	TokenNameCOMMENT_LINE	remove trailing semicolon 
entity	TokenNameIdentifier	 entity
=	TokenNameEQUAL	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
radix	TokenNameIdentifier	 radix
=	TokenNameEQUAL	
10	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'X'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
radix	TokenNameIdentifier	 radix
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Character	TokenNameIdentifier	 Character
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
,	TokenNameCOMMA	
radix	TokenNameIdentifier	 radix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
encode	TokenNameIdentifier	 encode
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
0x100	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
encoder	TokenNameIdentifier	 encoder
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
encoder	TokenNameIdentifier	 encoder
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// have a named encoding 	TokenNameCOMMENT_LINE	have a named encoding 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use ASCII value 	TokenNameCOMMENT_LINE	use ASCII value 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&#"	TokenNameStringLiteral	&#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use numeric encoding 	TokenNameCOMMENT_LINE	use numeric encoding 
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
decoder	TokenNameIdentifier	 decoder
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
entity	TokenNameIdentifier	 entity
,	TokenNameCOMMA	
(	TokenNameLPAREN	
new	TokenNamenew	
Character	TokenNameIdentifier	 Character
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
<	TokenNameLESS	
0x100	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
encoder	TokenNameIdentifier	 encoder
[	TokenNameLBRACKET	
value	TokenNameIdentifier	 value
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entity	TokenNameIdentifier	 entity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&nbsp"	TokenNameStringLiteral	&nbsp
,	TokenNameCOMMA	
160	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&iexcl"	TokenNameStringLiteral	&iexcl
,	TokenNameCOMMA	
161	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&cent"	TokenNameStringLiteral	&cent
,	TokenNameCOMMA	
162	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&pound"	TokenNameStringLiteral	&pound
,	TokenNameCOMMA	
163	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&curren"	TokenNameStringLiteral	&curren
,	TokenNameCOMMA	
164	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&yen"	TokenNameStringLiteral	&yen
,	TokenNameCOMMA	
165	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&brvbar"	TokenNameStringLiteral	&brvbar
,	TokenNameCOMMA	
166	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sect"	TokenNameStringLiteral	&sect
,	TokenNameCOMMA	
167	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&uml"	TokenNameStringLiteral	&uml
,	TokenNameCOMMA	
168	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&copy"	TokenNameStringLiteral	&copy
,	TokenNameCOMMA	
169	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ordf"	TokenNameStringLiteral	&ordf
,	TokenNameCOMMA	
170	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&laquo"	TokenNameStringLiteral	&laquo
,	TokenNameCOMMA	
171	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&not"	TokenNameStringLiteral	&not
,	TokenNameCOMMA	
172	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&shy"	TokenNameStringLiteral	&shy
,	TokenNameCOMMA	
173	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&reg"	TokenNameStringLiteral	&reg
,	TokenNameCOMMA	
174	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&macr"	TokenNameStringLiteral	&macr
,	TokenNameCOMMA	
175	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&deg"	TokenNameStringLiteral	&deg
,	TokenNameCOMMA	
176	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&plusmn"	TokenNameStringLiteral	&plusmn
,	TokenNameCOMMA	
177	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sup2"	TokenNameStringLiteral	&sup2
,	TokenNameCOMMA	
178	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sup3"	TokenNameStringLiteral	&sup3
,	TokenNameCOMMA	
179	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&acute"	TokenNameStringLiteral	&acute
,	TokenNameCOMMA	
180	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&micro"	TokenNameStringLiteral	&micro
,	TokenNameCOMMA	
181	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&para"	TokenNameStringLiteral	&para
,	TokenNameCOMMA	
182	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&middot"	TokenNameStringLiteral	&middot
,	TokenNameCOMMA	
183	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&cedil"	TokenNameStringLiteral	&cedil
,	TokenNameCOMMA	
184	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sup1"	TokenNameStringLiteral	&sup1
,	TokenNameCOMMA	
185	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ordm"	TokenNameStringLiteral	&ordm
,	TokenNameCOMMA	
186	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&raquo"	TokenNameStringLiteral	&raquo
,	TokenNameCOMMA	
187	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&frac14"	TokenNameStringLiteral	&frac14
,	TokenNameCOMMA	
188	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&frac12"	TokenNameStringLiteral	&frac12
,	TokenNameCOMMA	
189	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&frac34"	TokenNameStringLiteral	&frac34
,	TokenNameCOMMA	
190	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&iquest"	TokenNameStringLiteral	&iquest
,	TokenNameCOMMA	
191	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Agrave"	TokenNameStringLiteral	&Agrave
,	TokenNameCOMMA	
192	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Aacute"	TokenNameStringLiteral	&Aacute
,	TokenNameCOMMA	
193	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Acirc"	TokenNameStringLiteral	&Acirc
,	TokenNameCOMMA	
194	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Atilde"	TokenNameStringLiteral	&Atilde
,	TokenNameCOMMA	
195	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Auml"	TokenNameStringLiteral	&Auml
,	TokenNameCOMMA	
196	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Aring"	TokenNameStringLiteral	&Aring
,	TokenNameCOMMA	
197	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&AElig"	TokenNameStringLiteral	&AElig
,	TokenNameCOMMA	
198	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Ccedil"	TokenNameStringLiteral	&Ccedil
,	TokenNameCOMMA	
199	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Egrave"	TokenNameStringLiteral	&Egrave
,	TokenNameCOMMA	
200	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Eacute"	TokenNameStringLiteral	&Eacute
,	TokenNameCOMMA	
201	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Ecirc"	TokenNameStringLiteral	&Ecirc
,	TokenNameCOMMA	
202	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Euml"	TokenNameStringLiteral	&Euml
,	TokenNameCOMMA	
203	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Igrave"	TokenNameStringLiteral	&Igrave
,	TokenNameCOMMA	
204	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Iacute"	TokenNameStringLiteral	&Iacute
,	TokenNameCOMMA	
205	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Icirc"	TokenNameStringLiteral	&Icirc
,	TokenNameCOMMA	
206	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Iuml"	TokenNameStringLiteral	&Iuml
,	TokenNameCOMMA	
207	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ETH"	TokenNameStringLiteral	&ETH
,	TokenNameCOMMA	
208	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Ntilde"	TokenNameStringLiteral	&Ntilde
,	TokenNameCOMMA	
209	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Ograve"	TokenNameStringLiteral	&Ograve
,	TokenNameCOMMA	
210	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Oacute"	TokenNameStringLiteral	&Oacute
,	TokenNameCOMMA	
211	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Ocirc"	TokenNameStringLiteral	&Ocirc
,	TokenNameCOMMA	
212	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Otilde"	TokenNameStringLiteral	&Otilde
,	TokenNameCOMMA	
213	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Ouml"	TokenNameStringLiteral	&Ouml
,	TokenNameCOMMA	
214	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&times"	TokenNameStringLiteral	&times
,	TokenNameCOMMA	
215	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Oslash"	TokenNameStringLiteral	&Oslash
,	TokenNameCOMMA	
216	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Ugrave"	TokenNameStringLiteral	&Ugrave
,	TokenNameCOMMA	
217	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Uacute"	TokenNameStringLiteral	&Uacute
,	TokenNameCOMMA	
218	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Ucirc"	TokenNameStringLiteral	&Ucirc
,	TokenNameCOMMA	
219	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Uuml"	TokenNameStringLiteral	&Uuml
,	TokenNameCOMMA	
220	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Yacute"	TokenNameStringLiteral	&Yacute
,	TokenNameCOMMA	
221	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&THORN"	TokenNameStringLiteral	&THORN
,	TokenNameCOMMA	
222	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&szlig"	TokenNameStringLiteral	&szlig
,	TokenNameCOMMA	
223	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&agrave"	TokenNameStringLiteral	&agrave
,	TokenNameCOMMA	
224	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&aacute"	TokenNameStringLiteral	&aacute
,	TokenNameCOMMA	
225	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&acirc"	TokenNameStringLiteral	&acirc
,	TokenNameCOMMA	
226	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&atilde"	TokenNameStringLiteral	&atilde
,	TokenNameCOMMA	
227	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&auml"	TokenNameStringLiteral	&auml
,	TokenNameCOMMA	
228	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&aring"	TokenNameStringLiteral	&aring
,	TokenNameCOMMA	
229	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&aelig"	TokenNameStringLiteral	&aelig
,	TokenNameCOMMA	
230	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ccedil"	TokenNameStringLiteral	&ccedil
,	TokenNameCOMMA	
231	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&egrave"	TokenNameStringLiteral	&egrave
,	TokenNameCOMMA	
232	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&eacute"	TokenNameStringLiteral	&eacute
,	TokenNameCOMMA	
233	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ecirc"	TokenNameStringLiteral	&ecirc
,	TokenNameCOMMA	
234	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&euml"	TokenNameStringLiteral	&euml
,	TokenNameCOMMA	
235	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&igrave"	TokenNameStringLiteral	&igrave
,	TokenNameCOMMA	
236	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&iacute"	TokenNameStringLiteral	&iacute
,	TokenNameCOMMA	
237	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&icirc"	TokenNameStringLiteral	&icirc
,	TokenNameCOMMA	
238	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&iuml"	TokenNameStringLiteral	&iuml
,	TokenNameCOMMA	
239	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&eth"	TokenNameStringLiteral	&eth
,	TokenNameCOMMA	
240	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ntilde"	TokenNameStringLiteral	&ntilde
,	TokenNameCOMMA	
241	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ograve"	TokenNameStringLiteral	&ograve
,	TokenNameCOMMA	
242	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&oacute"	TokenNameStringLiteral	&oacute
,	TokenNameCOMMA	
243	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ocirc"	TokenNameStringLiteral	&ocirc
,	TokenNameCOMMA	
244	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&otilde"	TokenNameStringLiteral	&otilde
,	TokenNameCOMMA	
245	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ouml"	TokenNameStringLiteral	&ouml
,	TokenNameCOMMA	
246	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&divide"	TokenNameStringLiteral	&divide
,	TokenNameCOMMA	
247	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&oslash"	TokenNameStringLiteral	&oslash
,	TokenNameCOMMA	
248	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ugrave"	TokenNameStringLiteral	&ugrave
,	TokenNameCOMMA	
249	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&uacute"	TokenNameStringLiteral	&uacute
,	TokenNameCOMMA	
250	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ucirc"	TokenNameStringLiteral	&ucirc
,	TokenNameCOMMA	
251	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&uuml"	TokenNameStringLiteral	&uuml
,	TokenNameCOMMA	
252	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&yacute"	TokenNameStringLiteral	&yacute
,	TokenNameCOMMA	
253	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&thorn"	TokenNameStringLiteral	&thorn
,	TokenNameCOMMA	
254	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&yuml"	TokenNameStringLiteral	&yuml
,	TokenNameCOMMA	
255	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&fnof"	TokenNameStringLiteral	&fnof
,	TokenNameCOMMA	
402	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Alpha"	TokenNameStringLiteral	&Alpha
,	TokenNameCOMMA	
913	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Beta"	TokenNameStringLiteral	&Beta
,	TokenNameCOMMA	
914	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Gamma"	TokenNameStringLiteral	&Gamma
,	TokenNameCOMMA	
915	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Delta"	TokenNameStringLiteral	&Delta
,	TokenNameCOMMA	
916	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Epsilon"	TokenNameStringLiteral	&Epsilon
,	TokenNameCOMMA	
917	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Zeta"	TokenNameStringLiteral	&Zeta
,	TokenNameCOMMA	
918	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Eta"	TokenNameStringLiteral	&Eta
,	TokenNameCOMMA	
919	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Theta"	TokenNameStringLiteral	&Theta
,	TokenNameCOMMA	
920	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Iota"	TokenNameStringLiteral	&Iota
,	TokenNameCOMMA	
921	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Kappa"	TokenNameStringLiteral	&Kappa
,	TokenNameCOMMA	
922	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Lambda"	TokenNameStringLiteral	&Lambda
,	TokenNameCOMMA	
923	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Mu"	TokenNameStringLiteral	&Mu
,	TokenNameCOMMA	
924	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Nu"	TokenNameStringLiteral	&Nu
,	TokenNameCOMMA	
925	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Xi"	TokenNameStringLiteral	&Xi
,	TokenNameCOMMA	
926	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Omicron"	TokenNameStringLiteral	&Omicron
,	TokenNameCOMMA	
927	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Pi"	TokenNameStringLiteral	&Pi
,	TokenNameCOMMA	
928	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Rho"	TokenNameStringLiteral	&Rho
,	TokenNameCOMMA	
929	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Sigma"	TokenNameStringLiteral	&Sigma
,	TokenNameCOMMA	
931	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Tau"	TokenNameStringLiteral	&Tau
,	TokenNameCOMMA	
932	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Upsilon"	TokenNameStringLiteral	&Upsilon
,	TokenNameCOMMA	
933	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Phi"	TokenNameStringLiteral	&Phi
,	TokenNameCOMMA	
934	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Chi"	TokenNameStringLiteral	&Chi
,	TokenNameCOMMA	
935	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Psi"	TokenNameStringLiteral	&Psi
,	TokenNameCOMMA	
936	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Omega"	TokenNameStringLiteral	&Omega
,	TokenNameCOMMA	
937	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&alpha"	TokenNameStringLiteral	&alpha
,	TokenNameCOMMA	
945	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&beta"	TokenNameStringLiteral	&beta
,	TokenNameCOMMA	
946	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&gamma"	TokenNameStringLiteral	&gamma
,	TokenNameCOMMA	
947	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&delta"	TokenNameStringLiteral	&delta
,	TokenNameCOMMA	
948	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&epsilon"	TokenNameStringLiteral	&epsilon
,	TokenNameCOMMA	
949	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&zeta"	TokenNameStringLiteral	&zeta
,	TokenNameCOMMA	
950	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&eta"	TokenNameStringLiteral	&eta
,	TokenNameCOMMA	
951	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&theta"	TokenNameStringLiteral	&theta
,	TokenNameCOMMA	
952	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&iota"	TokenNameStringLiteral	&iota
,	TokenNameCOMMA	
953	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&kappa"	TokenNameStringLiteral	&kappa
,	TokenNameCOMMA	
954	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lambda"	TokenNameStringLiteral	&lambda
,	TokenNameCOMMA	
955	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&mu"	TokenNameStringLiteral	&mu
,	TokenNameCOMMA	
956	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&nu"	TokenNameStringLiteral	&nu
,	TokenNameCOMMA	
957	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&xi"	TokenNameStringLiteral	&xi
,	TokenNameCOMMA	
958	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&omicron"	TokenNameStringLiteral	&omicron
,	TokenNameCOMMA	
959	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&pi"	TokenNameStringLiteral	&pi
,	TokenNameCOMMA	
960	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rho"	TokenNameStringLiteral	&rho
,	TokenNameCOMMA	
961	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sigmaf"	TokenNameStringLiteral	&sigmaf
,	TokenNameCOMMA	
962	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sigma"	TokenNameStringLiteral	&sigma
,	TokenNameCOMMA	
963	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&tau"	TokenNameStringLiteral	&tau
,	TokenNameCOMMA	
964	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&upsilon"	TokenNameStringLiteral	&upsilon
,	TokenNameCOMMA	
965	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&phi"	TokenNameStringLiteral	&phi
,	TokenNameCOMMA	
966	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&chi"	TokenNameStringLiteral	&chi
,	TokenNameCOMMA	
967	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&psi"	TokenNameStringLiteral	&psi
,	TokenNameCOMMA	
968	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&omega"	TokenNameStringLiteral	&omega
,	TokenNameCOMMA	
969	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&thetasym"	TokenNameStringLiteral	&thetasym
,	TokenNameCOMMA	
977	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&upsih"	TokenNameStringLiteral	&upsih
,	TokenNameCOMMA	
978	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&piv"	TokenNameStringLiteral	&piv
,	TokenNameCOMMA	
982	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&bull"	TokenNameStringLiteral	&bull
,	TokenNameCOMMA	
8226	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&hellip"	TokenNameStringLiteral	&hellip
,	TokenNameCOMMA	
8230	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&prime"	TokenNameStringLiteral	&prime
,	TokenNameCOMMA	
8242	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Prime"	TokenNameStringLiteral	&Prime
,	TokenNameCOMMA	
8243	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&oline"	TokenNameStringLiteral	&oline
,	TokenNameCOMMA	
8254	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&frasl"	TokenNameStringLiteral	&frasl
,	TokenNameCOMMA	
8260	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&weierp"	TokenNameStringLiteral	&weierp
,	TokenNameCOMMA	
8472	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&image"	TokenNameStringLiteral	&image
,	TokenNameCOMMA	
8465	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&real"	TokenNameStringLiteral	&real
,	TokenNameCOMMA	
8476	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&trade"	TokenNameStringLiteral	&trade
,	TokenNameCOMMA	
8482	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&alefsym"	TokenNameStringLiteral	&alefsym
,	TokenNameCOMMA	
8501	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&larr"	TokenNameStringLiteral	&larr
,	TokenNameCOMMA	
8592	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&uarr"	TokenNameStringLiteral	&uarr
,	TokenNameCOMMA	
8593	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rarr"	TokenNameStringLiteral	&rarr
,	TokenNameCOMMA	
8594	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&darr"	TokenNameStringLiteral	&darr
,	TokenNameCOMMA	
8595	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&harr"	TokenNameStringLiteral	&harr
,	TokenNameCOMMA	
8596	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&crarr"	TokenNameStringLiteral	&crarr
,	TokenNameCOMMA	
8629	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lArr"	TokenNameStringLiteral	&lArr
,	TokenNameCOMMA	
8656	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&uArr"	TokenNameStringLiteral	&uArr
,	TokenNameCOMMA	
8657	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rArr"	TokenNameStringLiteral	&rArr
,	TokenNameCOMMA	
8658	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&dArr"	TokenNameStringLiteral	&dArr
,	TokenNameCOMMA	
8659	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&hArr"	TokenNameStringLiteral	&hArr
,	TokenNameCOMMA	
8660	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&forall"	TokenNameStringLiteral	&forall
,	TokenNameCOMMA	
8704	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&part"	TokenNameStringLiteral	&part
,	TokenNameCOMMA	
8706	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&exist"	TokenNameStringLiteral	&exist
,	TokenNameCOMMA	
8707	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&empty"	TokenNameStringLiteral	&empty
,	TokenNameCOMMA	
8709	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&nabla"	TokenNameStringLiteral	&nabla
,	TokenNameCOMMA	
8711	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&isin"	TokenNameStringLiteral	&isin
,	TokenNameCOMMA	
8712	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&notin"	TokenNameStringLiteral	&notin
,	TokenNameCOMMA	
8713	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ni"	TokenNameStringLiteral	&ni
,	TokenNameCOMMA	
8715	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&prod"	TokenNameStringLiteral	&prod
,	TokenNameCOMMA	
8719	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sum"	TokenNameStringLiteral	&sum
,	TokenNameCOMMA	
8721	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&minus"	TokenNameStringLiteral	&minus
,	TokenNameCOMMA	
8722	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lowast"	TokenNameStringLiteral	&lowast
,	TokenNameCOMMA	
8727	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&radic"	TokenNameStringLiteral	&radic
,	TokenNameCOMMA	
8730	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&prop"	TokenNameStringLiteral	&prop
,	TokenNameCOMMA	
8733	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&infin"	TokenNameStringLiteral	&infin
,	TokenNameCOMMA	
8734	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ang"	TokenNameStringLiteral	&ang
,	TokenNameCOMMA	
8736	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&and"	TokenNameStringLiteral	&and
,	TokenNameCOMMA	
8743	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&or"	TokenNameStringLiteral	&or
,	TokenNameCOMMA	
8744	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&cap"	TokenNameStringLiteral	&cap
,	TokenNameCOMMA	
8745	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&cup"	TokenNameStringLiteral	&cup
,	TokenNameCOMMA	
8746	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&int"	TokenNameStringLiteral	&int
,	TokenNameCOMMA	
8747	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&there4"	TokenNameStringLiteral	&there4
,	TokenNameCOMMA	
8756	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sim"	TokenNameStringLiteral	&sim
,	TokenNameCOMMA	
8764	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&cong"	TokenNameStringLiteral	&cong
,	TokenNameCOMMA	
8773	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&asymp"	TokenNameStringLiteral	&asymp
,	TokenNameCOMMA	
8776	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ne"	TokenNameStringLiteral	&ne
,	TokenNameCOMMA	
8800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&equiv"	TokenNameStringLiteral	&equiv
,	TokenNameCOMMA	
8801	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&le"	TokenNameStringLiteral	&le
,	TokenNameCOMMA	
8804	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ge"	TokenNameStringLiteral	&ge
,	TokenNameCOMMA	
8805	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sub"	TokenNameStringLiteral	&sub
,	TokenNameCOMMA	
8834	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sup"	TokenNameStringLiteral	&sup
,	TokenNameCOMMA	
8835	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&nsub"	TokenNameStringLiteral	&nsub
,	TokenNameCOMMA	
8836	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sube"	TokenNameStringLiteral	&sube
,	TokenNameCOMMA	
8838	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&supe"	TokenNameStringLiteral	&supe
,	TokenNameCOMMA	
8839	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&oplus"	TokenNameStringLiteral	&oplus
,	TokenNameCOMMA	
8853	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&otimes"	TokenNameStringLiteral	&otimes
,	TokenNameCOMMA	
8855	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&perp"	TokenNameStringLiteral	&perp
,	TokenNameCOMMA	
8869	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sdot"	TokenNameStringLiteral	&sdot
,	TokenNameCOMMA	
8901	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lceil"	TokenNameStringLiteral	&lceil
,	TokenNameCOMMA	
8968	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rceil"	TokenNameStringLiteral	&rceil
,	TokenNameCOMMA	
8969	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lfloor"	TokenNameStringLiteral	&lfloor
,	TokenNameCOMMA	
8970	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rfloor"	TokenNameStringLiteral	&rfloor
,	TokenNameCOMMA	
8971	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lang"	TokenNameStringLiteral	&lang
,	TokenNameCOMMA	
9001	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rang"	TokenNameStringLiteral	&rang
,	TokenNameCOMMA	
9002	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&loz"	TokenNameStringLiteral	&loz
,	TokenNameCOMMA	
9674	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&spades"	TokenNameStringLiteral	&spades
,	TokenNameCOMMA	
9824	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&clubs"	TokenNameStringLiteral	&clubs
,	TokenNameCOMMA	
9827	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&hearts"	TokenNameStringLiteral	&hearts
,	TokenNameCOMMA	
9829	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&diams"	TokenNameStringLiteral	&diams
,	TokenNameCOMMA	
9830	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&quot"	TokenNameStringLiteral	&quot
,	TokenNameCOMMA	
34	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&amp"	TokenNameStringLiteral	&amp
,	TokenNameCOMMA	
38	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lt"	TokenNameStringLiteral	&lt
,	TokenNameCOMMA	
60	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&gt"	TokenNameStringLiteral	&gt
,	TokenNameCOMMA	
62	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&OElig"	TokenNameStringLiteral	&OElig
,	TokenNameCOMMA	
338	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&oelig"	TokenNameStringLiteral	&oelig
,	TokenNameCOMMA	
339	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Scaron"	TokenNameStringLiteral	&Scaron
,	TokenNameCOMMA	
352	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&scaron"	TokenNameStringLiteral	&scaron
,	TokenNameCOMMA	
353	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Yuml"	TokenNameStringLiteral	&Yuml
,	TokenNameCOMMA	
376	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&circ"	TokenNameStringLiteral	&circ
,	TokenNameCOMMA	
710	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&tilde"	TokenNameStringLiteral	&tilde
,	TokenNameCOMMA	
732	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ensp"	TokenNameStringLiteral	&ensp
,	TokenNameCOMMA	
8194	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&emsp"	TokenNameStringLiteral	&emsp
,	TokenNameCOMMA	
8195	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&thinsp"	TokenNameStringLiteral	&thinsp
,	TokenNameCOMMA	
8201	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&zwnj"	TokenNameStringLiteral	&zwnj
,	TokenNameCOMMA	
8204	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&zwj"	TokenNameStringLiteral	&zwj
,	TokenNameCOMMA	
8205	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lrm"	TokenNameStringLiteral	&lrm
,	TokenNameCOMMA	
8206	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rlm"	TokenNameStringLiteral	&rlm
,	TokenNameCOMMA	
8207	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ndash"	TokenNameStringLiteral	&ndash
,	TokenNameCOMMA	
8211	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&mdash"	TokenNameStringLiteral	&mdash
,	TokenNameCOMMA	
8212	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lsquo"	TokenNameStringLiteral	&lsquo
,	TokenNameCOMMA	
8216	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rsquo"	TokenNameStringLiteral	&rsquo
,	TokenNameCOMMA	
8217	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&sbquo"	TokenNameStringLiteral	&sbquo
,	TokenNameCOMMA	
8218	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&ldquo"	TokenNameStringLiteral	&ldquo
,	TokenNameCOMMA	
8220	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rdquo"	TokenNameStringLiteral	&rdquo
,	TokenNameCOMMA	
8221	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&bdquo"	TokenNameStringLiteral	&bdquo
,	TokenNameCOMMA	
8222	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&dagger"	TokenNameStringLiteral	&dagger
,	TokenNameCOMMA	
8224	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&Dagger"	TokenNameStringLiteral	&Dagger
,	TokenNameCOMMA	
8225	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&permil"	TokenNameStringLiteral	&permil
,	TokenNameCOMMA	
8240	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&lsaquo"	TokenNameStringLiteral	&lsaquo
,	TokenNameCOMMA	
8249	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&rsaquo"	TokenNameStringLiteral	&rsaquo
,	TokenNameCOMMA	
8250	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
"&euro"	TokenNameStringLiteral	&euro
,	TokenNameCOMMA	
8364	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
