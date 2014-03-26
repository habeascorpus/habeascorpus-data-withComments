package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Simple lockless and memory barrier free String intern cache that is guaranteed * to return the same String instance as String.intern() * does. * * @lucene.internal */	TokenNameCOMMENT_JAVADOC	 Simple lockless and memory barrier free String intern cache that is guaranteed to return the same String instance as String.intern() does. * @lucene.internal 
public	TokenNamepublic	
class	TokenNameclass	
SimpleStringInterner	TokenNameIdentifier	 Simple String Interner
extends	TokenNameextends	
StringInterner	TokenNameIdentifier	 String Interner
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
final	TokenNamefinal	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
final	TokenNamefinal	
private	TokenNameprivate	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cache	TokenNameIdentifier	 cache
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
maxChainLength	TokenNameIdentifier	 max Chain Length
;	TokenNameSEMICOLON	
/** * @param tableSize Size of the hash table, should be a power of two. * @param maxChainLength Maximum length of each bucket, after which the oldest item inserted is dropped. */	TokenNameCOMMENT_JAVADOC	 @param tableSize Size of the hash table, should be a power of two. @param maxChainLength Maximum length of each bucket, after which the oldest item inserted is dropped. 
public	TokenNamepublic	
SimpleStringInterner	TokenNameIdentifier	 Simple String Interner
(	TokenNameLPAREN	
int	TokenNameint	
tableSize	TokenNameIdentifier	 table Size
,	TokenNameCOMMA	
int	TokenNameint	
maxChainLength	TokenNameIdentifier	 max Chain Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cache	TokenNameIdentifier	 cache
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
BitUtil	TokenNameIdentifier	 Bit Util
.	TokenNameDOT	
nextHighestPowerOfTwo	TokenNameIdentifier	 next Highest Power Of Two
(	TokenNameLPAREN	
tableSize	TokenNameIdentifier	 table Size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxChainLength	TokenNameIdentifier	 max Chain Length
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxChainLength	TokenNameIdentifier	 max Chain Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// In the future, it may be worth augmenting the string hash 	TokenNameCOMMENT_LINE	In the future, it may be worth augmenting the string hash 
// if the lower bits need better distribution. 	TokenNameCOMMENT_LINE	if the lower bits need better distribution. 
int	TokenNameint	
slot	TokenNameIdentifier	 slot
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
&	TokenNameAND	
(	TokenNameLPAREN	
cache	TokenNameIdentifier	 cache
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
nextToLast	TokenNameIdentifier	 next To Last
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
chainLength	TokenNameIdentifier	 chain Length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
h	TokenNameIdentifier	 h
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
str	TokenNameIdentifier	 str
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
||	TokenNameOR_OR	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if (e.str == s || (e.hash == h && e.str.compareTo(s)==0)) { 	TokenNameCOMMENT_LINE	if (e.str == s || (e.hash == h && e.str.compareTo(s)==0)) { 
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
str	TokenNameIdentifier	 str
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
chainLength	TokenNameIdentifier	 chain Length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nextToLast	TokenNameIdentifier	 next To Last
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// insertion-order cache: add new entry at head 	TokenNameCOMMENT_LINE	insertion-order cache: add new entry at head 
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cache	TokenNameIdentifier	 cache
[	TokenNameLBRACKET	
slot	TokenNameIdentifier	 slot
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
chainLength	TokenNameIdentifier	 chain Length
>=	TokenNameGREATER_EQUAL	
maxChainLength	TokenNameIdentifier	 max Chain Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// prune last entry 	TokenNameCOMMENT_LINE	prune last entry 
nextToLast	TokenNameIdentifier	 next To Last
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
