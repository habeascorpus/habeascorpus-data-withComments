package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
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
HashSet	TokenNameIdentifier	 Hash Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Random	TokenNameIdentifier	 Random
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
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
MockAnalyzer	TokenNameIdentifier	 Mock Analyzer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Document	TokenNameIdentifier	 Document
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
document	TokenNameIdentifier	 document
.	TokenNameDOT	
Field	TokenNameIdentifier	 Field
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
store	TokenNameIdentifier	 store
.	TokenNameDOT	
Directory	TokenNameIdentifier	 Directory
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
BytesRef	TokenNameIdentifier	 Bytes Ref
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
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
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
UnicodeUtil	TokenNameIdentifier	 Unicode Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
TestIndexWriterUnicode	TokenNameIdentifier	 Test Index Writer Unicode
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
utf8Data	TokenNameIdentifier	 utf8 Data
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
// unpaired low surrogate 	TokenNameCOMMENT_LINE	unpaired low surrogate 
"ab?cd"	TokenNameStringLiteral	ab?cd
,	TokenNameCOMMA	
"ab?cd"	TokenNameStringLiteral	ab?cd
,	TokenNameCOMMA	
"?abcd"	TokenNameStringLiteral	?abcd
,	TokenNameCOMMA	
"?abcd"	TokenNameStringLiteral	?abcd
,	TokenNameCOMMA	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
"ab??cd"	TokenNameStringLiteral	ab??cd
,	TokenNameCOMMA	
"ab??cd"	TokenNameStringLiteral	ab??cd
,	TokenNameCOMMA	
"??abcd"	TokenNameStringLiteral	??abcd
,	TokenNameCOMMA	
"??abcd"	TokenNameStringLiteral	??abcd
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
// unpaired high surrogate 	TokenNameCOMMENT_LINE	unpaired high surrogate 
"ab?cd"	TokenNameStringLiteral	ab?cd
,	TokenNameCOMMA	
"ab?cd"	TokenNameStringLiteral	ab?cd
,	TokenNameCOMMA	
"?abcd"	TokenNameStringLiteral	?abcd
,	TokenNameCOMMA	
"?abcd"	TokenNameStringLiteral	?abcd
,	TokenNameCOMMA	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
"?"	TokenNameStringLiteral	?
,	TokenNameCOMMA	
"ab??cd"	TokenNameStringLiteral	ab??cd
,	TokenNameCOMMA	
"ab??cd"	TokenNameStringLiteral	ab??cd
,	TokenNameCOMMA	
"??abcd"	TokenNameStringLiteral	??abcd
,	TokenNameCOMMA	
"??abcd"	TokenNameStringLiteral	??abcd
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
// backwards surrogates 	TokenNameCOMMENT_LINE	backwards surrogates 
"ab??cd"	TokenNameStringLiteral	ab??cd
,	TokenNameCOMMA	
"ab??cd"	TokenNameStringLiteral	ab??cd
,	TokenNameCOMMA	
"??abcd"	TokenNameStringLiteral	??abcd
,	TokenNameCOMMA	
"??abcd"	TokenNameStringLiteral	??abcd
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
"??"	TokenNameStringLiteral	??
,	TokenNameCOMMA	
"ab???cd"	TokenNameStringLiteral	ab???cd
,	TokenNameCOMMA	
"ab???cd"	TokenNameStringLiteral	ab???cd
,	TokenNameCOMMA	
"???abcd"	TokenNameStringLiteral	???abcd
,	TokenNameCOMMA	
"???abcd"	TokenNameStringLiteral	???abcd
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
,	TokenNameCOMMA	
"???"	TokenNameStringLiteral	???
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
int	TokenNameint	
lim	TokenNameIdentifier	 lim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
lim	TokenNameIdentifier	 lim
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
boolean	TokenNameboolean	
fillUnicode	TokenNameIdentifier	 fill Unicode
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasIllegal	TokenNameIdentifier	 has Illegal
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
0xdc00	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
<	TokenNameLESS	
0xe000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Don't start in the middle of a valid surrogate pair 	TokenNameCOMMENT_LINE	Don't start in the middle of a valid surrogate pair 
offset	TokenNameIdentifier	 offset
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Make a surrogate pair 	TokenNameCOMMENT_LINE	Make a surrogate pair 
// High surrogate 	TokenNameCOMMENT_LINE	High surrogate 
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0xd800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xdc00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Low surrogate 	TokenNameCOMMENT_LINE	Low surrogate 
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0xdc00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xe000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
<=	TokenNameLESS_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x80	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0x800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0xe000	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
5	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
t	TokenNameIdentifier	 t
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Illegal unpaired surrogate 	TokenNameCOMMENT_LINE	Illegal unpaired surrogate 
if	TokenNameif	
(	TokenNameLPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
7	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
random	TokenNameIdentifier	 random
.	TokenNameDOT	
nextBoolean	TokenNameIdentifier	 next Boolean
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0xd800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xdc00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0xdc00	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xe000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xfffd	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasIllegal	TokenNameIdentifier	 has Illegal
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
0x800	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
hasIllegal	TokenNameIdentifier	 has Illegal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// both start & end are inclusive 	TokenNameCOMMENT_LINE	both start & end are inclusive 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
getInt	TokenNameIdentifier	 get Int
(	TokenNameLPAREN	
Random	TokenNameIdentifier	 Random
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
asUnicodeChar	TokenNameIdentifier	 as Unicode Char
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"U+"	TokenNameStringLiteral	U+
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
termDesc	TokenNameIdentifier	 term Desc
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
s0	TokenNameIdentifier	 s0
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s0	TokenNameIdentifier	 s0
=	TokenNameEQUAL	
asUnicodeChar	TokenNameIdentifier	 as Unicode Char
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
s0	TokenNameIdentifier	 s0
=	TokenNameEQUAL	
asUnicodeChar	TokenNameIdentifier	 as Unicode Char
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
asUnicodeChar	TokenNameIdentifier	 as Unicode Char
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s0	TokenNameIdentifier	 s0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-510 	TokenNameCOMMENT_LINE	LUCENE-510 
public	TokenNamepublic	
void	TokenNamevoid	
testRandomUnicodeStrings	TokenNameIdentifier	 test Random Unicode Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
utf8	TokenNameIdentifier	 utf8
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
utf16	TokenNameIdentifier	 utf16
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
100000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
hasIllegal	TokenNameIdentifier	 has Illegal
=	TokenNameEQUAL	
fillUnicode	TokenNameIdentifier	 fill Unicode
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasIllegal	TokenNameIdentifier	 has Illegal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
utf16	TokenNameIdentifier	 utf16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
utf16	TokenNameIdentifier	 utf16
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
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
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
utf16	TokenNameIdentifier	 utf16
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// LUCENE-510 	TokenNameCOMMENT_LINE	LUCENE-510 
public	TokenNamepublic	
void	TokenNamevoid	
testAllUnicodeChars	TokenNameIdentifier	 test All Unicode Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
utf8	TokenNameIdentifier	 utf8
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
utf16	TokenNameIdentifier	 utf16
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0x0010FFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
==	TokenNameEQUAL_EQUAL	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// Skip invalid code points 	TokenNameCOMMENT_LINE	Skip invalid code points 
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0xe000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
0xffff	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
0x0010000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_SUR_HIGH_START	TokenNameIdentifier	 UNI  SUR  HIGH  START
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
0x0010000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&	TokenNameAND	
0x3FFL	TokenNameLongLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UNI_SUR_LOW_START	TokenNameIdentifier	 UNI  SUR  LOW  START
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"codepoint "	TokenNameStringLiteral	codepoint 
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
utf16	TokenNameIdentifier	 utf16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"codepoint "	TokenNameStringLiteral	codepoint 
+	TokenNamePLUS	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
utf16	TokenNameIdentifier	 utf16
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf16	TokenNameIdentifier	 utf16
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testEmbeddedFFFF	TokenNameIdentifier	 test Embedded FFFF
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
TestIndexWriter	TokenNameIdentifier	 Test Index Writer
.	TokenNameDOT	
StringSplitAnalyzer	TokenNameIdentifier	 String Split Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"a a?b"	TokenNameStringLiteral	a a?b
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"field"	TokenNameStringLiteral	field
,	TokenNameCOMMA	
"a"	TokenNameStringLiteral	a
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
NO	TokenNameIdentifier	 NO
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-510 	TokenNameCOMMENT_LINE	LUCENE-510 
public	TokenNamepublic	
void	TokenNamevoid	
testInvalidUTF16	TokenNameIdentifier	 test Invalid UT F16
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
Directory	TokenNameIdentifier	 Directory
dir	TokenNameIdentifier	 dir
=	TokenNameEQUAL	
newDirectory	TokenNameIdentifier	 new Directory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexWriter	TokenNameIdentifier	 Index Writer
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
new	TokenNamenew	
IndexWriter	TokenNameIdentifier	 Index Writer
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
newIndexWriterConfig	TokenNameIdentifier	 new Index Writer Config
(	TokenNameLPAREN	
TEST_VERSION_CURRENT	TokenNameIdentifier	 TEST  VERSION  CURRENT
,	TokenNameCOMMA	
new	TokenNamenew	
TestIndexWriter	TokenNameIdentifier	 Test Index Writer
.	TokenNameDOT	
StringSplitAnalyzer	TokenNameIdentifier	 String Split Analyzer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
new	TokenNamenew	
Document	TokenNameIdentifier	 Document
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
utf8Data	TokenNameIdentifier	 utf8 Data
.	TokenNameDOT	
length	TokenNameIdentifier	 length
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
doc	TokenNameIdentifier	 doc
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
newField	TokenNameIdentifier	 new Field
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
utf8Data	TokenNameIdentifier	 utf8 Data
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Store	TokenNameIdentifier	 Store
.	TokenNameDOT	
YES	TokenNameIdentifier	 YES
,	TokenNameCOMMA	
Field	TokenNameIdentifier	 Field
.	TokenNameDOT	
Index	TokenNameIdentifier	 Index
.	TokenNameDOT	
ANALYZED	TokenNameIdentifier	 ANALYZED
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
addDocument	TokenNameIdentifier	 add Document
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
IndexReader	TokenNameIdentifier	 Index Reader
ir	TokenNameIdentifier	 ir
=	TokenNameEQUAL	
IndexReader	TokenNameIdentifier	 Index Reader
.	TokenNameDOT	
open	TokenNameIdentifier	 open
(	TokenNameLPAREN	
dir	TokenNameIdentifier	 dir
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Document	TokenNameIdentifier	 Document
doc2	TokenNameIdentifier	 doc2
=	TokenNameEQUAL	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
document	TokenNameIdentifier	 document
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
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
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field "	TokenNameStringLiteral	field 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" was not indexed correctly"	TokenNameStringLiteral	 was not indexed correctly
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
utf8Data	TokenNameIdentifier	 utf8 Data
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"field "	TokenNameStringLiteral	field 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
" is incorrect"	TokenNameStringLiteral	 is incorrect
,	TokenNameCOMMA	
utf8Data	TokenNameIdentifier	 utf8 Data
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
doc2	TokenNameIdentifier	 doc2
.	TokenNameDOT	
getField	TokenNameIdentifier	 get Field
(	TokenNameLPAREN	
"f"	TokenNameStringLiteral	f
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
stringValue	TokenNameIdentifier	 string Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ir	TokenNameIdentifier	 ir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dir	TokenNameIdentifier	 dir
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// LUCENE-510 	TokenNameCOMMENT_LINE	LUCENE-510 
public	TokenNamepublic	
void	TokenNamevoid	
testIncrementalUnicodeStrings	TokenNameIdentifier	 test Incremental Unicode Strings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Throwable	TokenNameIdentifier	 Throwable
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
expected	TokenNameIdentifier	 expected
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
20	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
utf8	TokenNameIdentifier	 utf8
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8Result	TokenNameIdentifier	 UT F8 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
utf16	TokenNameIdentifier	 utf16
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
utf16a	TokenNameIdentifier	 utf16a
=	TokenNameEQUAL	
new	TokenNamenew	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16Result	TokenNameIdentifier	 UT F16 Result
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
hasIllegal	TokenNameIdentifier	 has Illegal
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
60	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
num	TokenNameIdentifier	 num
=	TokenNameEQUAL	
atLeast	TokenNameIdentifier	 at Least
(	TokenNameLPAREN	
100000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
<	TokenNameLESS	
num	TokenNameIdentifier	 num
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
hasIllegal	TokenNameIdentifier	 has Illegal
)	TokenNameRPAREN	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
nextInt	TokenNameIdentifier	 next Int
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hasIllegal	TokenNameIdentifier	 has Illegal
=	TokenNameEQUAL	
fillUnicode	TokenNameIdentifier	 fill Unicode
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
expected	TokenNameIdentifier	 expected
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
-	TokenNameMINUS	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF16toUTF8	TokenNameIdentifier	 UT F16to UT F8
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasIllegal	TokenNameIdentifier	 has Illegal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
getBytes	TokenNameIdentifier	 get Bytes
(	TokenNameLPAREN	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
b	TokenNameIdentifier	 b
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
bytePrefix	TokenNameIdentifier	 byte Prefix
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
hasIllegal	TokenNameIdentifier	 has Illegal
)	TokenNameRPAREN	
bytePrefix	TokenNameIdentifier	 byte Prefix
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bytePrefix	TokenNameIdentifier	 byte Prefix
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
last	TokenNameIdentifier	 last
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
bytePrefix	TokenNameIdentifier	 byte Prefix
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
bytePrefix	TokenNameIdentifier	 byte Prefix
,	TokenNameCOMMA	
utf16	TokenNameIdentifier	 utf16
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf16	TokenNameIdentifier	 utf16
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
utf16	TokenNameIdentifier	 utf16
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
UnicodeUtil	TokenNameIdentifier	 Unicode Util
.	TokenNameDOT	
UTF8toUTF16	TokenNameIdentifier	 UT F8to UT F16
(	TokenNameLPAREN	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf8	TokenNameIdentifier	 utf8
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
utf16a	TokenNameIdentifier	 utf16a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
utf16a	TokenNameIdentifier	 utf16a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
expected	TokenNameIdentifier	 expected
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
utf16a	TokenNameIdentifier	 utf16a
.	TokenNameDOT	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
