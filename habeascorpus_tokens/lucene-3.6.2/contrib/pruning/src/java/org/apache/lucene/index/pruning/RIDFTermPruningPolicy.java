package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
index	TokenNameIdentifier	 index
.	TokenNameDOT	
pruning	TokenNameIdentifier	 pruning
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Map	TokenNameIdentifier	 Map
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
TermEnum	TokenNameIdentifier	 Term Enum
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
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
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
/** * Implementation of {@link TermPruningPolicy} that uses "residual IDF" * metric to determine the postings of terms to keep/remove, as defined in * <a href="">http://www.dc.fi.udc.es/~barreiro/publications/blanco_barreiro_ecir2007.pdf</a>. * <p>Residual IDF measures a difference between a collection-wide IDF of a term * (which assumes a uniform distribution of occurrences) and the actual * observed total number of occurrences of a term in all documents. Positive * values indicate that a term is informative (e.g. for rare terms), negative * values indicate that a term is not informative (e.g. too popular to offer * good selectivity). * <p>This metric produces small values close to [-1, 1], so useful ranges for * thresholds under this metrics are somewhere between [0, 1]. The higher the * threshold the more informative (and more rare) terms will be retained. For * filtering of common words a value of close to or slightly below 0 (e.g. -0.1) * should be a good starting point. * */	TokenNameCOMMENT_JAVADOC	 Implementation of {@link TermPruningPolicy} that uses "residual IDF" metric to determine the postings of terms to keep/remove, as defined in <a href="">http://www.dc.fi.udc.es/~barreiro/publications/blanco_barreiro_ecir2007.pdf</a>. <p>Residual IDF measures a difference between a collection-wide IDF of a term (which assumes a uniform distribution of occurrences) and the actual observed total number of occurrences of a term in all documents. Positive values indicate that a term is informative (e.g. for rare terms), negative values indicate that a term is not informative (e.g. too popular to offer good selectivity). <p>This metric produces small values close to [-1, 1], so useful ranges for thresholds under this metrics are somewhere between [0, 1]. The higher the threshold the more informative (and more rare) terms will be retained. For filtering of common words a value of close to or slightly below 0 (e.g. -0.1) should be a good starting point. 
public	TokenNamepublic	
class	TokenNameclass	
RIDFTermPruningPolicy	TokenNameIdentifier	 RIDF Term Pruning Policy
extends	TokenNameextends	
TermPruningPolicy	TokenNameIdentifier	 Term Pruning Policy
{	TokenNameLBRACE	
double	TokenNamedouble	
defThreshold	TokenNameIdentifier	 def Threshold
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
thresholds	TokenNameIdentifier	 thresholds
;	TokenNameSEMICOLON	
double	TokenNamedouble	
idf	TokenNameIdentifier	 idf
;	TokenNameSEMICOLON	
double	TokenNamedouble	
maxDoc	TokenNameIdentifier	 max Doc
;	TokenNameSEMICOLON	
double	TokenNamedouble	
ridf	TokenNameIdentifier	 ridf
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RIDFTermPruningPolicy	TokenNameIdentifier	 RIDF Term Pruning Policy
(	TokenNameLPAREN	
IndexReader	TokenNameIdentifier	 Index Reader
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
fieldFlags	TokenNameIdentifier	 field Flags
,	TokenNameCOMMA	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Double	TokenNameIdentifier	 Double
>	TokenNameGREATER	
thresholds	TokenNameIdentifier	 thresholds
,	TokenNameCOMMA	
double	TokenNamedouble	
defThreshold	TokenNameIdentifier	 def Threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
fieldFlags	TokenNameIdentifier	 field Flags
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
defThreshold	TokenNameIdentifier	 def Threshold
=	TokenNameEQUAL	
defThreshold	TokenNameIdentifier	 def Threshold
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thresholds	TokenNameIdentifier	 thresholds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
thresholds	TokenNameIdentifier	 thresholds
=	TokenNameEQUAL	
thresholds	TokenNameIdentifier	 thresholds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
thresholds	TokenNameIdentifier	 thresholds
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
emptyMap	TokenNameIdentifier	 empty Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
maxDoc	TokenNameIdentifier	 max Doc
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
maxDoc	TokenNameIdentifier	 max Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
initPositionsTerm	TokenNameIdentifier	 init Positions Term
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
tp	TokenNameIdentifier	 tp
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// from formula [2], not the formula [1] 	TokenNameCOMMENT_LINE	from formula [2], not the formula [1] 
// 	TokenNameCOMMENT_LINE	 
idf	TokenNameIdentifier	 idf
=	TokenNameEQUAL	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
docFreq	TokenNameIdentifier	 doc Freq
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// calculate total number of occurrences 	TokenNameCOMMENT_LINE	calculate total number of occurrences 
int	TokenNameint	
totalFreq	TokenNameIdentifier	 total Freq
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
totalFreq	TokenNameIdentifier	 total Freq
+=	TokenNamePLUS_EQUAL	
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reposition the enum 	TokenNameCOMMENT_LINE	reposition the enum 
tp	TokenNameIdentifier	 tp
.	TokenNameDOT	
seek	TokenNameIdentifier	 seek
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// rest of the formula [2] in the paper 	TokenNameCOMMENT_LINE	rest of the formula [2] in the paper 
ridf	TokenNameIdentifier	 ridf
=	TokenNameEQUAL	
idf	TokenNameIdentifier	 idf
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
E	TokenNameIdentifier	 E
,	TokenNameCOMMA	
-	TokenNameMINUS	
totalFreq	TokenNameIdentifier	 total Freq
/	TokenNameDIVIDE	
maxDoc	TokenNameIdentifier	 max Doc
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
pruneTermEnum	TokenNameIdentifier	 prune Term Enum
(	TokenNameLPAREN	
TermEnum	TokenNameIdentifier	 Term Enum
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
pruneAllPositions	TokenNameIdentifier	 prune All Positions
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
termPositions	TokenNameIdentifier	 term Positions
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
double	TokenNamedouble	
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
defThreshold	TokenNameIdentifier	 def Threshold
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
text	TokenNameIdentifier	 text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ridf	TokenNameIdentifier	 ridf
>	TokenNameGREATER	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// keep 	TokenNameCOMMENT_LINE	keep 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
pruneTermVectorTerms	TokenNameIdentifier	 prune Term Vector Terms
(	TokenNameLPAREN	
int	TokenNameint	
docNumber	TokenNameIdentifier	 doc Number
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
field	TokenNameIdentifier	 field
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
terms	TokenNameIdentifier	 terms
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
freqs	TokenNameIdentifier	 freqs
,	TokenNameCOMMA	
TermFreqVector	TokenNameIdentifier	 Term Freq Vector
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
pruneSomePositions	TokenNameIdentifier	 prune Some Positions
(	TokenNameLPAREN	
int	TokenNameint	
docNum	TokenNameIdentifier	 doc Num
,	TokenNameCOMMA	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
positions	TokenNameIdentifier	 positions
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
curTerm	TokenNameIdentifier	 cur Term
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//this policy either prunes all or none, so nothing to prune here 	TokenNameCOMMENT_LINE	this policy either prunes all or none, so nothing to prune here 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
