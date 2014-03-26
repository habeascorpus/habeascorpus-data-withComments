package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Methods for manipulating strings. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Methods for manipulating strings. * @lucene.internal 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
StringHelper	TokenNameIdentifier	 String Helper
{	TokenNameLBRACE	
/** * Expert: * The StringInterner implementation used by Lucene. * This shouldn't be changed to an incompatible implementation after other Lucene APIs have been used. */	TokenNameCOMMENT_JAVADOC	 Expert: The StringInterner implementation used by Lucene. This shouldn't be changed to an incompatible implementation after other Lucene APIs have been used. 
public	TokenNamepublic	
static	TokenNamestatic	
StringInterner	TokenNameIdentifier	 String Interner
interner	TokenNameIdentifier	 interner
=	TokenNameEQUAL	
new	TokenNamenew	
SimpleStringInterner	TokenNameIdentifier	 Simple String Interner
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Return the same string object for all equal strings */	TokenNameCOMMENT_JAVADOC	 Return the same string object for all equal strings 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
interner	TokenNameIdentifier	 interner
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares two byte[] arrays, element by element, and returns the * number of elements common to both arrays. * * @param bytes1 The first byte[] to compare * @param bytes2 The second byte[] to compare * @return The number of common elements. */	TokenNameCOMMENT_JAVADOC	 Compares two byte[] arrays, element by element, and returns the number of elements common to both arrays. * @param bytes1 The first byte[] to compare @param bytes2 The second byte[] to compare @return The number of common elements. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
bytesDifference	TokenNameIdentifier	 bytes Difference
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes1	TokenNameIdentifier	 bytes1
,	TokenNameCOMMA	
int	TokenNameint	
len1	TokenNameIdentifier	 len1
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
bytes2	TokenNameIdentifier	 bytes2
,	TokenNameCOMMA	
int	TokenNameint	
len2	TokenNameIdentifier	 len2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
len1	TokenNameIdentifier	 len1
<	TokenNameLESS	
len2	TokenNameIdentifier	 len2
?	TokenNameQUESTION	
len1	TokenNameIdentifier	 len1
:	TokenNameCOLON	
len2	TokenNameIdentifier	 len2
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
if	TokenNameif	
(	TokenNameLPAREN	
bytes1	TokenNameIdentifier	 bytes1
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
bytes2	TokenNameIdentifier	 bytes2
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
StringHelper	TokenNameIdentifier	 String Helper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return a Comparator over versioned strings such as X.YY.Z * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 @return a Comparator over versioned strings such as X.YY.Z @lucene.internal 
public	TokenNamepublic	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
getVersionComparator	TokenNameIdentifier	 get Version Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
versionComparator	TokenNameIdentifier	 version Comparator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
versionComparator	TokenNameIdentifier	 version Comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
aTokens	TokenNameIdentifier	 a Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
bTokens	TokenNameIdentifier	 b Tokens
=	TokenNameEQUAL	
new	TokenNamenew	
StringTokenizer	TokenNameIdentifier	 String Tokenizer
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
"."	TokenNameStringLiteral	.
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
aTokens	TokenNameIdentifier	 a Tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
aToken	TokenNameIdentifier	 a Token
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
aTokens	TokenNameIdentifier	 a Tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
bTokens	TokenNameIdentifier	 b Tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bToken	TokenNameIdentifier	 b Token
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
bTokens	TokenNameIdentifier	 b Tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
aToken	TokenNameIdentifier	 a Token
!=	TokenNameNOT_EQUAL	
bToken	TokenNameIdentifier	 b Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
aToken	TokenNameIdentifier	 a Token
<	TokenNameLESS	
bToken	TokenNameIdentifier	 b Token
?	TokenNameQUESTION	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// a has some extra trailing tokens. if these are all zeroes, thats ok. 	TokenNameCOMMENT_LINE	a has some extra trailing tokens. if these are all zeroes, thats ok. 
if	TokenNameif	
(	TokenNameLPAREN	
aToken	TokenNameIdentifier	 a Token
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// b has some extra trailing tokens. if these are all zeroes, thats ok. 	TokenNameCOMMENT_LINE	b has some extra trailing tokens. if these are all zeroes, thats ok. 
while	TokenNamewhile	
(	TokenNameLPAREN	
bTokens	TokenNameIdentifier	 b Tokens
.	TokenNameDOT	
hasMoreTokens	TokenNameIdentifier	 has More Tokens
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
bTokens	TokenNameIdentifier	 b Tokens
.	TokenNameDOT	
nextToken	TokenNameIdentifier	 next Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
