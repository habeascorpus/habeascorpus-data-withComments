package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
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
index	TokenNameIdentifier	 index
.	TokenNameDOT	
TermDocs	TokenNameIdentifier	 Term Docs
;	TokenNameSEMICOLON	
/** Expert: A <code>Scorer</code> for documents matching a <code>Term</code>. */	TokenNameCOMMENT_JAVADOC	 Expert: A <code>Scorer</code> for documents matching a <code>Term</code>. 
final	TokenNamefinal	
class	TokenNameclass	
TermScorer	TokenNameIdentifier	 Term Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
TermDocs	TokenNameIdentifier	 Term Docs
termDocs	TokenNameIdentifier	 term Docs
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
weightValue	TokenNameIdentifier	 weight Value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
docs	TokenNameIdentifier	 docs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// buffered doc numbers 	TokenNameCOMMENT_LINE	buffered doc numbers 
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
32	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// buffered term freqs 	TokenNameCOMMENT_LINE	buffered term freqs 
private	TokenNameprivate	
int	TokenNameint	
pointer	TokenNameIdentifier	 pointer
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
pointerMax	TokenNameIdentifier	 pointer Max
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
SCORE_CACHE_SIZE	TokenNameIdentifier	 SCORE  CACHE  SIZE
=	TokenNameEQUAL	
32	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scoreCache	TokenNameIdentifier	 score Cache
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
SCORE_CACHE_SIZE	TokenNameIdentifier	 SCORE  CACHE  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** * Construct a <code>TermScorer</code>. * * @param weight * The weight of the <code>Term</code> in the query. * @param td * An iterator over the documents matching the <code>Term</code>. * @param similarity * The </code>Similarity</code> implementation to be used for score * computations. * @param norms * The field norms of the document fields for the <code>Term</code>. */	TokenNameCOMMENT_JAVADOC	 Construct a <code>TermScorer</code>. * @param weight The weight of the <code>Term</code> in the query. @param td An iterator over the documents matching the <code>Term</code>. @param similarity The </code>Similarity</code> implementation to be used for score computations. @param norms The field norms of the document fields for the <code>Term</code>. 
TermScorer	TokenNameIdentifier	 Term Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
TermDocs	TokenNameIdentifier	 Term Docs
td	TokenNameIdentifier	 td
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
=	TokenNameEQUAL	
td	TokenNameIdentifier	 td
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
norms	TokenNameIdentifier	 norms
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
weightValue	TokenNameIdentifier	 weight Value
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
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
SCORE_CACHE_SIZE	TokenNameIdentifier	 SCORE  CACHE  SIZE
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
scoreCache	TokenNameIdentifier	 score Cache
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
weightValue	TokenNameIdentifier	 weight Value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// firstDocID is ignored since nextDoc() sets 'doc' 	TokenNameCOMMENT_LINE	firstDocID is ignored since nextDoc() sets 'doc' 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
protected	TokenNameprotected	
boolean	TokenNameboolean	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
Collector	TokenNameIdentifier	 Collector
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
,	TokenNameCOMMA	
int	TokenNameint	
firstDocID	TokenNameIdentifier	 first Doc ID
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
setScorer	TokenNameIdentifier	 set Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
<	TokenNameLESS	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// for docs in window 	TokenNameCOMMENT_LINE	for docs in window 
c	TokenNameIdentifier	 c
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// collect score 	TokenNameCOMMENT_LINE	collect score 
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
pointer	TokenNameIdentifier	 pointer
>=	TokenNameGREATER_EQUAL	
pointerMax	TokenNameIdentifier	 pointer Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointerMax	TokenNameIdentifier	 pointer Max
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// refill buffers 	TokenNameCOMMENT_LINE	refill buffers 
if	TokenNameif	
(	TokenNameLPAREN	
pointerMax	TokenNameIdentifier	 pointer Max
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close stream 	TokenNameCOMMENT_LINE	close stream 
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
// set to sentinel value 	TokenNameCOMMENT_LINE	set to sentinel value 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Advances to the next document matching the query. <br> * The iterator over the matching documents is buffered using * {@link TermDocs#read(int[],int[])}. * * @return the document matching the query or NO_MORE_DOCS if there are no more documents. */	TokenNameCOMMENT_JAVADOC	 Advances to the next document matching the query. <br> The iterator over the matching documents is buffered using {@link TermDocs#read(int[],int[])}. * @return the document matching the query or NO_MORE_DOCS if there are no more documents. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
>=	TokenNameGREATER_EQUAL	
pointerMax	TokenNameIdentifier	 pointer Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointerMax	TokenNameIdentifier	 pointer Max
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
,	TokenNameCOMMA	
freqs	TokenNameIdentifier	 freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// refill buffer 	TokenNameCOMMENT_LINE	refill buffer 
if	TokenNameif	
(	TokenNameLPAREN	
pointerMax	TokenNameIdentifier	 pointer Max
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// close stream 	TokenNameCOMMENT_LINE	close stream 
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
doc	TokenNameIdentifier	 doc
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
raw	TokenNameIdentifier	 raw
=	TokenNameEQUAL	
// compute tf(f)*weight 	TokenNameCOMMENT_LINE	compute tf(f)*weight 
freq	TokenNameIdentifier	 freq
<	TokenNameLESS	
SCORE_CACHE_SIZE	TokenNameIdentifier	 SCORE  CACHE  SIZE
// check cache 	TokenNameCOMMENT_LINE	check cache 
?	TokenNameQUESTION	
scoreCache	TokenNameIdentifier	 score Cache
[	TokenNameLBRACKET	
freq	TokenNameIdentifier	 freq
]	TokenNameRBRACKET	
// cache hit 	TokenNameCOMMENT_LINE	cache hit 
:	TokenNameCOLON	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
weightValue	TokenNameIdentifier	 weight Value
;	TokenNameSEMICOLON	
// cache miss 	TokenNameCOMMENT_LINE	cache miss 
return	TokenNamereturn	
norms	TokenNameIdentifier	 norms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
raw	TokenNameIdentifier	 raw
:	TokenNameCOLON	
raw	TokenNameIdentifier	 raw
*	TokenNameMULTIPLY	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
decodeNormValue	TokenNameIdentifier	 decode Norm Value
(	TokenNameLPAREN	
norms	TokenNameIdentifier	 norms
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// normalize for field 	TokenNameCOMMENT_LINE	normalize for field 
}	TokenNameRBRACE	
/** * Advances to the first match beyond the current whose document number is * greater than or equal to a given target. <br> * The implementation uses {@link TermDocs#skipTo(int)}. * * @param target * The target document number. * @return the matching document or NO_MORE_DOCS if none exist. */	TokenNameCOMMENT_JAVADOC	 Advances to the first match beyond the current whose document number is greater than or equal to a given target. <br> The implementation uses {@link TermDocs#skipTo(int)}. * @param target The target document number. @return the matching document or NO_MORE_DOCS if none exist. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
int	TokenNameint	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// first scan in cache 	TokenNameCOMMENT_LINE	first scan in cache 
for	TokenNamefor	
(	TokenNameLPAREN	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pointer	TokenNameIdentifier	 pointer
<	TokenNameLESS	
pointerMax	TokenNameIdentifier	 pointer Max
;	TokenNameSEMICOLON	
pointer	TokenNameIdentifier	 pointer
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docs	TokenNameIdentifier	 docs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
>=	TokenNameGREATER_EQUAL	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
docs	TokenNameIdentifier	 docs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// not found in cache, seek underlying stream 	TokenNameCOMMENT_LINE	not found in cache, seek underlying stream 
boolean	TokenNameboolean	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pointerMax	TokenNameIdentifier	 pointer Max
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
pointer	TokenNameIdentifier	 pointer
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
docs	TokenNameIdentifier	 docs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
pointer	TokenNameIdentifier	 pointer
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
termDocs	TokenNameIdentifier	 term Docs
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a string representation of this <code>TermScorer</code>. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of this <code>TermScorer</code>. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"scorer("	TokenNameStringLiteral	scorer(
+	TokenNamePLUS	
weight	TokenNameIdentifier	 weight
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
