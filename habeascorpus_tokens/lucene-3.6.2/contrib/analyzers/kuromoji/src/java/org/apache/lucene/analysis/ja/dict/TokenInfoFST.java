package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
ja	TokenNameIdentifier	 ja
.	TokenNameDOT	
dict	TokenNameIdentifier	 dict
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
FST	TokenNameIdentifier	 FST
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
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
;	TokenNameSEMICOLON	
/** * Thin wrapper around an FST with root-arc caching for Japanese. * <p> * Depending upon fasterButMoreRam, either just kana (191 arcs), * or kana and han (28,607 arcs) are cached. The latter offers * additional performance at the cost of more RAM. */	TokenNameCOMMENT_JAVADOC	 Thin wrapper around an FST with root-arc caching for Japanese. <p> Depending upon fasterButMoreRam, either just kana (191 arcs), or kana and han (28,607 arcs) are cached. The latter offers additional performance at the cost of more RAM. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
TokenInfoFST	TokenNameIdentifier	 Token Info FST
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
// depending upon fasterButMoreRam, we cache root arcs for either 	TokenNameCOMMENT_LINE	depending upon fasterButMoreRam, we cache root arcs for either 
// kana (0x3040-0x30FF) or kana + han (0x3040-0x9FFF) 	TokenNameCOMMENT_LINE	kana (0x3040-0x30FF) or kana + han (0x3040-0x9FFF) 
// false: 191 arcs 	TokenNameCOMMENT_LINE	false: 191 arcs 
// true: 28,607 arcs (costs ~1.5MB) 	TokenNameCOMMENT_LINE	true: 28,607 arcs (costs ~1.5MB) 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
cacheCeiling	TokenNameIdentifier	 cache Ceiling
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
rootCache	TokenNameIdentifier	 root Cache
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Long	TokenNameIdentifier	 Long
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TokenInfoFST	TokenNameIdentifier	 Token Info FST
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
fst	TokenNameIdentifier	 fst
,	TokenNameCOMMA	
boolean	TokenNameboolean	
fasterButMoreRam	TokenNameIdentifier	 faster But More Ram
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fst	TokenNameIdentifier	 fst
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cacheCeiling	TokenNameIdentifier	 cache Ceiling
=	TokenNameEQUAL	
fasterButMoreRam	TokenNameIdentifier	 faster But More Ram
?	TokenNameQUESTION	
0x9FFF	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0x30FF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
NO_OUTPUT	TokenNameIdentifier	 NO  OUTPUT
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
outputs	TokenNameIdentifier	 outputs
.	TokenNameDOT	
getNoOutput	TokenNameIdentifier	 get No Output
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rootCache	TokenNameIdentifier	 root Cache
=	TokenNameEQUAL	
cacheRootArcs	TokenNameIdentifier	 cache Root Arcs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
SuppressWarnings	TokenNameIdentifier	 Suppress Warnings
(	TokenNameLPAREN	
"unchecked"	TokenNameStringLiteral	unchecked
)	TokenNameRPAREN	
private	TokenNameprivate	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
cacheRootArcs	TokenNameIdentifier	 cache Root Arcs
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
rootCache	TokenNameIdentifier	 root Cache
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
(	TokenNameLPAREN	
cacheCeiling	TokenNameIdentifier	 cache Ceiling
-	TokenNameMINUS	
0x3040	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
firstArc	TokenNameIdentifier	 first Arc
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
firstArc	TokenNameIdentifier	 first Arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
fstReader	TokenNameIdentifier	 fst Reader
=	TokenNameEQUAL	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO: jump to 3040, readNextRealArc to ceiling? (just be careful we don't add bugs) 	TokenNameCOMMENT_LINE	TODO: jump to 3040, readNextRealArc to ceiling? (just be careful we don't add bugs) 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
rootCache	TokenNameIdentifier	 root Cache
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
findTargetArc	TokenNameIdentifier	 find Target Arc
(	TokenNameLPAREN	
0x3040	TokenNameIntegerLiteral	
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
firstArc	TokenNameIdentifier	 first Arc
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
fstReader	TokenNameIdentifier	 fst Reader
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rootCache	TokenNameIdentifier	 root Cache
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
rootCache	TokenNameIdentifier	 root Cache
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
findTargetArc	TokenNameIdentifier	 find Target Arc
(	TokenNameLPAREN	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
follow	TokenNameIdentifier	 follow
,	TokenNameCOMMA	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
boolean	TokenNameboolean	
useCache	TokenNameIdentifier	 use Cache
,	TokenNameCOMMA	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
fstReader	TokenNameIdentifier	 fst Reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
useCache	TokenNameIdentifier	 use Cache
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
>=	TokenNameGREATER_EQUAL	
0x3040	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<=	TokenNameLESS_EQUAL	
cacheCeiling	TokenNameIdentifier	 cache Ceiling
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
END_LABEL	TokenNameIdentifier	 END  LABEL
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
rootCache	TokenNameIdentifier	 root Cache
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
0x3040	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
arc	TokenNameIdentifier	 arc
.	TokenNameDOT	
copyFrom	TokenNameIdentifier	 copy From
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
arc	TokenNameIdentifier	 arc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
findTargetArc	TokenNameIdentifier	 find Target Arc
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
follow	TokenNameIdentifier	 follow
,	TokenNameCOMMA	
arc	TokenNameIdentifier	 arc
,	TokenNameCOMMA	
fstReader	TokenNameIdentifier	 fst Reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
Arc	TokenNameIdentifier	 Arc
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getFirstArc	TokenNameIdentifier	 get First Arc
(	TokenNameLPAREN	
arc	TokenNameIdentifier	 arc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FST	TokenNameIdentifier	 FST
.	TokenNameDOT	
BytesReader	TokenNameIdentifier	 Bytes Reader
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
.	TokenNameDOT	
getBytesReader	TokenNameIdentifier	 get Bytes Reader
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** @lucene.internal for testing only */	TokenNameCOMMENT_JAVADOC	 @lucene.internal for testing only 
FST	TokenNameIdentifier	 FST
<	TokenNameLESS	
Long	TokenNameIdentifier	 Long
>	TokenNameGREATER	
getInternalFST	TokenNameIdentifier	 get Internal FST
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fst	TokenNameIdentifier	 fst
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
