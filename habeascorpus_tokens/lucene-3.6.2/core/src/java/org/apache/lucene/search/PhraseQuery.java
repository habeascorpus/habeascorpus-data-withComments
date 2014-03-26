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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Set	TokenNameIdentifier	 Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
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
Term	TokenNameIdentifier	 Term
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
TermPositions	TokenNameIdentifier	 Term Positions
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
IndexReader	TokenNameIdentifier	 Index Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Explanation	TokenNameIdentifier	 Explanation
.	TokenNameDOT	
IDFExplanation	TokenNameIdentifier	 IDF Explanation
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
ToStringUtils	TokenNameIdentifier	 To String Utils
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
ArrayUtil	TokenNameIdentifier	 Array Util
;	TokenNameSEMICOLON	
/** A Query that matches documents containing a particular sequence of terms. * A PhraseQuery is built by QueryParser for input like <code>"new york"</code>. * * <p>This query may be combined with other terms or queries with a {@link BooleanQuery}. */	TokenNameCOMMENT_JAVADOC	 A Query that matches documents containing a particular sequence of terms. A PhraseQuery is built by QueryParser for input like <code>"new york"</code>. * <p>This query may be combined with other terms or queries with a {@link BooleanQuery}. 
public	TokenNamepublic	
class	TokenNameclass	
PhraseQuery	TokenNameIdentifier	 Phrase Query
extends	TokenNameextends	
Query	TokenNameIdentifier	 Query
{	TokenNameLBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
positions	TokenNameIdentifier	 positions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxPosition	TokenNameIdentifier	 max Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Constructs an empty phrase query. */	TokenNameCOMMENT_JAVADOC	 Constructs an empty phrase query. 
public	TokenNamepublic	
PhraseQuery	TokenNameIdentifier	 Phrase Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** Sets the number of other words permitted between words in query phrase. If zero, then this is an exact phrase search. For larger values this works like a <code>WITHIN</code> or <code>NEAR</code> operator. <p>The slop is in fact an edit-distance, where the units correspond to moves of terms in the query phrase out of position. For example, to switch the order of two words requires two moves (the first move places the words atop one another), so to permit re-orderings of phrases, the slop must be at least two. <p>More exact matches are scored higher than sloppier matches, thus search results are sorted by exactness. <p>The slop is zero by default, requiring exact matches.*/	TokenNameCOMMENT_JAVADOC	 Sets the number of other words permitted between words in query phrase. If zero, then this is an exact phrase search. For larger values this works like a <code>WITHIN</code> or <code>NEAR</code> operator. <p>The slop is in fact an edit-distance, where the units correspond to moves of terms in the query phrase out of position. For example, to switch the order of two words requires two moves (the first move places the words atop one another), so to permit re-orderings of phrases, the slop must be at least two. <p>More exact matches are scored higher than sloppier matches, thus search results are sorted by exactness. <p>The slop is zero by default, requiring exact matches.
public	TokenNamepublic	
void	TokenNamevoid	
setSlop	TokenNameIdentifier	 set Slop
(	TokenNameLPAREN	
int	TokenNameint	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
slop	TokenNameIdentifier	 slop
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the slop. See setSlop(). */	TokenNameCOMMENT_JAVADOC	 Returns the slop. See setSlop(). 
public	TokenNamepublic	
int	TokenNameint	
getSlop	TokenNameIdentifier	 get Slop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
slop	TokenNameIdentifier	 slop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a term to the end of the query phrase. * The relative position of the term is the one immediately after the last term added. */	TokenNameCOMMENT_JAVADOC	 Adds a term to the end of the query phrase. The relative position of the term is the one immediately after the last term added. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a term to the end of the query phrase. * The relative position of the term within the phrase is specified explicitly. * This allows e.g. phrases with more than one term at the same position * or phrases with gaps (e.g. in connection with stopwords). * * @param term * @param position */	TokenNameCOMMENT_JAVADOC	 Adds a term to the end of the query phrase. The relative position of the term within the phrase is specified explicitly. This allows e.g. phrases with more than one term at the same position or phrases with gaps (e.g. in connection with stopwords). * @param term @param position 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
field	TokenNameIdentifier	 field
=	TokenNameEQUAL	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"All phrase terms must be in the same field: "	TokenNameStringLiteral	All phrase terms must be in the same field: 
+	TokenNamePLUS	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
maxPosition	TokenNameIdentifier	 max Position
)	TokenNameRPAREN	
maxPosition	TokenNameIdentifier	 max Position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the set of terms in this phrase. */	TokenNameCOMMENT_JAVADOC	 Returns the set of terms in this phrase. 
public	TokenNamepublic	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getTerms	TokenNameIdentifier	 get Terms
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the relative positions of terms in this phrase. */	TokenNameCOMMENT_JAVADOC	 Returns the relative positions of terms in this phrase. 
public	TokenNamepublic	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getPositions	TokenNameIdentifier	 get Positions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
result	TokenNameIdentifier	 result
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TermQuery	TokenNameIdentifier	 Term Query
tq	TokenNameIdentifier	 tq
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tq	TokenNameIdentifier	 tq
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
tq	TokenNameIdentifier	 tq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
return	TokenNamereturn	
super	TokenNamesuper	
.	TokenNameDOT	
rewrite	TokenNameIdentifier	 rewrite
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
implements	TokenNameimplements	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
>	TokenNameGREATER	
{	TokenNameLBRACE	
final	TokenNamefinal	
TermPositions	TokenNameIdentifier	 Term Positions
postings	TokenNameIdentifier	 postings
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
nTerms	TokenNameIdentifier	 n Terms
;	TokenNameSEMICOLON	
// for faster comparisons 	TokenNameCOMMENT_LINE	for faster comparisons 
public	TokenNamepublic	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
postings	TokenNameIdentifier	 postings
,	TokenNameCOMMA	
int	TokenNameint	
docFreq	TokenNameIdentifier	 doc Freq
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
...	TokenNameELLIPSIS	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
postings	TokenNameIdentifier	 postings
=	TokenNameEQUAL	
postings	TokenNameIdentifier	 postings
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
=	TokenNameEQUAL	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
nTerms	TokenNameIdentifier	 n Terms
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nTerms	TokenNameIdentifier	 n Terms
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms2	TokenNameIdentifier	 terms2
=	TokenNameEQUAL	
new	TokenNamenew	
Term	TokenNameIdentifier	 Term
[	TokenNameLBRACKET	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
terms2	TokenNameIdentifier	 terms2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
terms2	TokenNameIdentifier	 terms2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
terms2	TokenNameIdentifier	 terms2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
docFreq	TokenNameIdentifier	 doc Freq
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docFreq	TokenNameIdentifier	 doc Freq
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nTerms	TokenNameIdentifier	 n Terms
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
nTerms	TokenNameIdentifier	 n Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
nTerms	TokenNameIdentifier	 n Terms
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
nTerms	TokenNameIdentifier	 n Terms
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nTerms	TokenNameIdentifier	 n Terms
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
res	TokenNameIdentifier	 res
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
docFreq	TokenNameIdentifier	 doc Freq
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
position	TokenNameIdentifier	 position
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
nTerms	TokenNameIdentifier	 n Terms
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
docFreq	TokenNameIdentifier	 doc Freq
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
PhraseWeight	TokenNameIdentifier	 Phrase Weight
extends	TokenNameextends	
Weight	TokenNameIdentifier	 Weight
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
idf	TokenNameIdentifier	 idf
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
queryNorm	TokenNameIdentifier	 query Norm
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
queryWeight	TokenNameIdentifier	 query Weight
;	TokenNameSEMICOLON	
private	TokenNameprivate	
IDFExplanation	TokenNameIdentifier	 IDF Explanation
idfExp	TokenNameIdentifier	 idf Exp
;	TokenNameSEMICOLON	
public	TokenNamepublic	
PhraseWeight	TokenNameIdentifier	 Phrase Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
similarity	TokenNameIdentifier	 similarity
=	TokenNameEQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idfExp	TokenNameIdentifier	 idf Exp
=	TokenNameEQUAL	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
idfExplain	TokenNameIdentifier	 idf Explain
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
idf	TokenNameIdentifier	 idf
=	TokenNameEQUAL	
idfExp	TokenNameIdentifier	 idf Exp
.	TokenNameDOT	
getIdf	TokenNameIdentifier	 get Idf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"weight("	TokenNameStringLiteral	weight(
+	TokenNamePLUS	
PhraseQuery	TokenNameIdentifier	 Phrase Query
.	TokenNameDOT	
this	TokenNamethis	
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Query	TokenNameIdentifier	 Query
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
PhraseQuery	TokenNameIdentifier	 Phrase Query
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
sumOfSquaredWeights	TokenNameIdentifier	 sum Of Squared Weights
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queryWeight	TokenNameIdentifier	 query Weight
=	TokenNameEQUAL	
idf	TokenNameIdentifier	 idf
*	TokenNameMULTIPLY	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// compute query weight 	TokenNameCOMMENT_LINE	compute query weight 
return	TokenNamereturn	
queryWeight	TokenNameIdentifier	 query Weight
*	TokenNameMULTIPLY	
queryWeight	TokenNameIdentifier	 query Weight
;	TokenNameSEMICOLON	
// square it 	TokenNameCOMMENT_LINE	square it 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
normalize	TokenNameIdentifier	 normalize
(	TokenNameLPAREN	
float	TokenNamefloat	
queryNorm	TokenNameIdentifier	 query Norm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryNorm	TokenNameIdentifier	 query Norm
=	TokenNameEQUAL	
queryNorm	TokenNameIdentifier	 query Norm
;	TokenNameSEMICOLON	
queryWeight	TokenNameIdentifier	 query Weight
*=	TokenNameMULTIPLY_EQUAL	
queryNorm	TokenNameIdentifier	 query Norm
;	TokenNameSEMICOLON	
// normalize query weight 	TokenNameCOMMENT_LINE	normalize query weight 
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
queryWeight	TokenNameIdentifier	 query Weight
*	TokenNameMULTIPLY	
idf	TokenNameIdentifier	 idf
;	TokenNameSEMICOLON	
// idf for document 	TokenNameCOMMENT_LINE	idf for document 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
boolean	TokenNameboolean	
scoreDocsInOrder	TokenNameIdentifier	 score Docs In Order
,	TokenNameCOMMA	
boolean	TokenNameboolean	
topScorer	TokenNameIdentifier	 top Scorer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// optimize zero-term case 	TokenNameCOMMENT_LINE	optimize zero-term case 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
postingsFreqs	TokenNameIdentifier	 postings Freqs
=	TokenNameEQUAL	
new	TokenNamenew	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
[	TokenNameLBRACKET	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TermPositions	TokenNameIdentifier	 Term Positions
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
termPositions	TokenNameIdentifier	 term Positions
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
postingsFreqs	TokenNameIdentifier	 postings Freqs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
PostingsAndFreq	TokenNameIdentifier	 Postings And Freq
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
,	TokenNameCOMMA	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// sort by increasing docFreq order 	TokenNameCOMMENT_LINE	sort by increasing docFreq order 
if	TokenNameif	
(	TokenNameLPAREN	
slop	TokenNameIdentifier	 slop
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
postingsFreqs	TokenNameIdentifier	 postings Freqs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
slop	TokenNameIdentifier	 slop
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// optimize exact case 	TokenNameCOMMENT_LINE	optimize exact case 
ExactPhraseScorer	TokenNameIdentifier	 Exact Phrase Scorer
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
new	TokenNamenew	
ExactPhraseScorer	TokenNameIdentifier	 Exact Phrase Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
postingsFreqs	TokenNameIdentifier	 postings Freqs
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
noDocs	TokenNameIdentifier	 no Docs
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SloppyPhraseScorer	TokenNameIdentifier	 Sloppy Phrase Scorer
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
postingsFreqs	TokenNameIdentifier	 postings Freqs
,	TokenNameCOMMA	
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
slop	TokenNameIdentifier	 slop
,	TokenNameCOMMA	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
ComplexExplanation	TokenNameIdentifier	 Complex Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"weight("	TokenNameStringLiteral	weight(
+	TokenNamePLUS	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
"), product of:"	TokenNameStringLiteral	), product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
docFreqs	TokenNameIdentifier	 doc Freqs
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
query	TokenNameIdentifier	 query
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
docFreqs	TokenNameIdentifier	 doc Freqs
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
idfExp	TokenNameIdentifier	 idf Exp
.	TokenNameDOT	
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
query	TokenNameIdentifier	 query
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
idfExpl	TokenNameIdentifier	 idf Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
idf	TokenNameIdentifier	 idf
,	TokenNameCOMMA	
"idf("	TokenNameStringLiteral	idf(
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
docFreqs	TokenNameIdentifier	 doc Freqs
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// explain query weight 	TokenNameCOMMENT_LINE	explain query weight 
Explanation	TokenNameIdentifier	 Explanation
queryExpl	TokenNameIdentifier	 query Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"queryWeight("	TokenNameStringLiteral	queryWeight(
+	TokenNamePLUS	
getQuery	TokenNameIdentifier	 get Query
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"), product of:"	TokenNameStringLiteral	), product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
boostExpl	TokenNameIdentifier	 boost Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
"boost"	TokenNameStringLiteral	boost
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
1.0f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
boostExpl	TokenNameIdentifier	 boost Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
idfExpl	TokenNameIdentifier	 idf Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
queryNormExpl	TokenNameIdentifier	 query Norm Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
queryNorm	TokenNameIdentifier	 query Norm
,	TokenNameCOMMA	
"queryNorm"	TokenNameStringLiteral	queryNorm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
queryNormExpl	TokenNameIdentifier	 query Norm Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
boostExpl	TokenNameIdentifier	 boost Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
idfExpl	TokenNameIdentifier	 idf Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
queryNormExpl	TokenNameIdentifier	 query Norm Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
queryExpl	TokenNameIdentifier	 query Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// explain field weight 	TokenNameCOMMENT_LINE	explain field weight 
Explanation	TokenNameIdentifier	 Explanation
fieldExpl	TokenNameIdentifier	 field Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"fieldWeight("	TokenNameStringLiteral	fieldWeight(
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
query	TokenNameIdentifier	 query
+	TokenNamePLUS	
" in "	TokenNameStringLiteral	 in 
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
"), product of:"	TokenNameStringLiteral	), product of:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
(	TokenNameLPAREN	
reader	TokenNameIdentifier	 reader
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scorer	TokenNameIdentifier	 scorer
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
0.0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
"no matching docs"	TokenNameStringLiteral	no matching docs
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Explanation	TokenNameIdentifier	 Explanation
tfExplanation	TokenNameIdentifier	 tf Explanation
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
phraseFreq	TokenNameIdentifier	 phrase Freq
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
phraseFreq	TokenNameIdentifier	 phrase Freq
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
phraseFreq	TokenNameIdentifier	 phrase Freq
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
tfExplanation	TokenNameIdentifier	 tf Explanation
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
phraseFreq	TokenNameIdentifier	 phrase Freq
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tfExplanation	TokenNameIdentifier	 tf Explanation
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"tf(phraseFreq="	TokenNameStringLiteral	tf(phraseFreq=
+	TokenNamePLUS	
phraseFreq	TokenNameIdentifier	 phrase Freq
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
tfExplanation	TokenNameIdentifier	 tf Explanation
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
idfExpl	TokenNameIdentifier	 idf Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Explanation	TokenNameIdentifier	 Explanation
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fieldNorms	TokenNameIdentifier	 field Norms
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
fieldNorm	TokenNameIdentifier	 field Norm
=	TokenNameEQUAL	
fieldNorms	TokenNameIdentifier	 field Norms
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
similarity	TokenNameIdentifier	 similarity
.	TokenNameDOT	
decodeNormValue	TokenNameIdentifier	 decode Norm Value
(	TokenNameLPAREN	
fieldNorms	TokenNameIdentifier	 field Norms
[	TokenNameLBRACKET	
doc	TokenNameIdentifier	 doc
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
:	TokenNameCOLON	
1.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
fieldNorm	TokenNameIdentifier	 field Norm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
.	TokenNameDOT	
setDescription	TokenNameIdentifier	 set Description
(	TokenNameLPAREN	
"fieldNorm(field="	TokenNameStringLiteral	fieldNorm(field=
+	TokenNamePLUS	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
", doc="	TokenNameStringLiteral	, doc=
+	TokenNamePLUS	
doc	TokenNameIdentifier	 doc
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
tfExplanation	TokenNameIdentifier	 tf Explanation
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
idfExpl	TokenNameIdentifier	 idf Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
fieldNormExpl	TokenNameIdentifier	 field Norm Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
addDetail	TokenNameIdentifier	 add Detail
(	TokenNameLPAREN	
fieldExpl	TokenNameIdentifier	 field Expl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// combine them 	TokenNameCOMMENT_LINE	combine them 
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
queryExpl	TokenNameIdentifier	 query Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
fieldExpl	TokenNameIdentifier	 field Expl
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
setMatch	TokenNameIdentifier	 set Match
(	TokenNameLPAREN	
tfExplanation	TokenNameIdentifier	 tf Explanation
.	TokenNameDOT	
isMatch	TokenNameIdentifier	 is Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Weight	TokenNameIdentifier	 Weight
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
Searcher	TokenNameIdentifier	 Searcher
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// optimize one-term case 	TokenNameCOMMENT_LINE	optimize one-term case 
Term	TokenNameIdentifier	 Term
term	TokenNameIdentifier	 term
=	TokenNameEQUAL	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Query	TokenNameIdentifier	 Query
termQuery	TokenNameIdentifier	 term Query
=	TokenNameEQUAL	
new	TokenNamenew	
TermQuery	TokenNameIdentifier	 Term Query
(	TokenNameLPAREN	
term	TokenNameIdentifier	 term
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
termQuery	TokenNameIdentifier	 term Query
.	TokenNameDOT	
setBoost	TokenNameIdentifier	 set Boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
termQuery	TokenNameIdentifier	 term Query
.	TokenNameDOT	
createWeight	TokenNameIdentifier	 create Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
PhraseWeight	TokenNameIdentifier	 Phrase Weight
(	TokenNameLPAREN	
searcher	TokenNameIdentifier	 searcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see org.apache.lucene.search.Query#extractTerms(Set) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.lucene.search.Query#extractTerms(Set) 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
extractTerms	TokenNameIdentifier	 extract Terms
(	TokenNameLPAREN	
Set	TokenNameIdentifier	 Set
<	TokenNameLESS	
Term	TokenNameIdentifier	 Term
>	TokenNameGREATER	
queryTerms	TokenNameIdentifier	 query Terms
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queryTerms	TokenNameIdentifier	 query Terms
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Prints a user-readable version of this query. */	TokenNameCOMMENT_JAVADOC	 Prints a user-readable version of this query. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
buffer	TokenNameIdentifier	 buffer
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
field	TokenNameIdentifier	 field
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
":"	TokenNameStringLiteral	:
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pieces	TokenNameIdentifier	 pieces
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
maxPosition	TokenNameIdentifier	 max Position
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
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
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"|"	TokenNameStringLiteral	|
+	TokenNamePLUS	
(	TokenNameLPAREN	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pieces	TokenNameIdentifier	 pieces
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
pieces	TokenNameIdentifier	 pieces
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
slop	TokenNameIdentifier	 slop
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"~"	TokenNameStringLiteral	~
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
slop	TokenNameIdentifier	 slop
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ToStringUtils	TokenNameIdentifier	 To String Utils
.	TokenNameDOT	
boost	TokenNameIdentifier	 boost
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns true iff <code>o</code> is equal to this. */	TokenNameCOMMENT_JAVADOC	 Returns true iff <code>o</code> is equal to this. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
PhraseQuery	TokenNameIdentifier	 Phrase Query
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
PhraseQuery	TokenNameIdentifier	 Phrase Query
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PhraseQuery	TokenNameIdentifier	 Phrase Query
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
slop	TokenNameIdentifier	 slop
==	TokenNameEQUAL_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
slop	TokenNameIdentifier	 slop
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
terms	TokenNameIdentifier	 terms
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
this	TokenNamethis	
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
positions	TokenNameIdentifier	 positions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns a hash code value for this object.*/	TokenNameCOMMENT_JAVADOC	 Returns a hash code value for this object.
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Float	TokenNameIdentifier	 Float
.	TokenNameDOT	
floatToIntBits	TokenNameIdentifier	 float To Int Bits
(	TokenNameLPAREN	
getBoost	TokenNameIdentifier	 get Boost
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
slop	TokenNameIdentifier	 slop
^	TokenNameXOR	
terms	TokenNameIdentifier	 terms
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
^	TokenNameXOR	
positions	TokenNameIdentifier	 positions
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
