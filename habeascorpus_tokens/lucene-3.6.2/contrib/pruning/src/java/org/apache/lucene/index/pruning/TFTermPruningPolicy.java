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
TermDocs	TokenNameIdentifier	 Term Docs
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
/** * Policy for producing smaller index out of an input index, by removing postings data * for those terms where their in-document frequency is below a specified * threshold. * <p> * Larger threshold value will produce a smaller index. * See {@link TermPruningPolicy} for size vs performance considerations. * <p> * This implementation uses simple term frequency thresholds to remove all postings * from documents where a given term occurs rarely (i.e. its TF in a document * is smaller than the threshold). * <p> * Threshold values in this method are expressed as absolute term frequencies. */	TokenNameCOMMENT_JAVADOC	 Policy for producing smaller index out of an input index, by removing postings data for those terms where their in-document frequency is below a specified threshold. <p> Larger threshold value will produce a smaller index. See {@link TermPruningPolicy} for size vs performance considerations. <p> This implementation uses simple term frequency thresholds to remove all postings from documents where a given term occurs rarely (i.e. its TF in a document is smaller than the threshold). <p> Threshold values in this method are expressed as absolute term frequencies. 
public	TokenNamepublic	
class	TokenNameclass	
TFTermPruningPolicy	TokenNameIdentifier	 TF Term Pruning Policy
extends	TokenNameextends	
TermPruningPolicy	TokenNameIdentifier	 Term Pruning Policy
{	TokenNameLBRACE	
protected	TokenNameprotected	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
thresholds	TokenNameIdentifier	 thresholds
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
defThreshold	TokenNameIdentifier	 def Threshold
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
curThr	TokenNameIdentifier	 cur Thr
;	TokenNameSEMICOLON	
public	TokenNamepublic	
TFTermPruningPolicy	TokenNameIdentifier	 TF Term Pruning Policy
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
Integer	TokenNameIdentifier	 Integer
>	TokenNameGREATER	
thresholds	TokenNameIdentifier	 thresholds
,	TokenNameCOMMA	
int	TokenNameint	
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
// check that at least one doc exceeds threshold 	TokenNameCOMMENT_LINE	check that at least one doc exceeds threshold 
int	TokenNameint	
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
defThreshold	TokenNameIdentifier	 def Threshold
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
termKey	TokenNameIdentifier	 term Key
=	TokenNameEQUAL	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
termKey	TokenNameIdentifier	 term Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
termKey	TokenNameIdentifier	 term Key
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
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
field	TokenNameIdentifier	 field
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TermDocs	TokenNameIdentifier	 Term Docs
td	TokenNameIdentifier	 td
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
termDocs	TokenNameIdentifier	 term Docs
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
.	TokenNameDOT	
term	TokenNameIdentifier	 term
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
pass	TokenNameIdentifier	 pass
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
thr	TokenNameIdentifier	 thr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pass	TokenNameIdentifier	 pass
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
td	TokenNameIdentifier	 td
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
!	TokenNameNOT	
pass	TokenNameIdentifier	 pass
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
void	TokenNamevoid	
initPositionsTerm	TokenNameIdentifier	 init Positions Term
(	TokenNameLPAREN	
TermPositions	TokenNameIdentifier	 Term Positions
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// set threshold for this field 	TokenNameCOMMENT_LINE	set threshold for this field 
curThr	TokenNameIdentifier	 cur Thr
=	TokenNameEQUAL	
defThreshold	TokenNameIdentifier	 def Threshold
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
termKey	TokenNameIdentifier	 term Key
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
termKey	TokenNameIdentifier	 term Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
curThr	TokenNameIdentifier	 cur Thr
=	TokenNameEQUAL	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
termKey	TokenNameIdentifier	 term Key
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
curThr	TokenNameIdentifier	 cur Thr
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
if	TokenNameif	
(	TokenNameLPAREN	
termPositions	TokenNameIdentifier	 term Positions
.	TokenNameDOT	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
curThr	TokenNameIdentifier	 cur Thr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
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
tfv	TokenNameIdentifier	 tfv
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
defThreshold	TokenNameIdentifier	 def Threshold
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
thr	TokenNameIdentifier	 thr
=	TokenNameEQUAL	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
field	TokenNameIdentifier	 field
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
removed	TokenNameIdentifier	 removed
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// check per-term thresholds 	TokenNameCOMMENT_LINE	check per-term thresholds 
int	TokenNameint	
termThr	TokenNameIdentifier	 term Thr
=	TokenNameEQUAL	
thr	TokenNameIdentifier	 thr
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
field	TokenNameIdentifier	 field
+	TokenNamePLUS	
":"	TokenNameStringLiteral	:
+	TokenNamePLUS	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
termThr	TokenNameIdentifier	 term Thr
=	TokenNameEQUAL	
thresholds	TokenNameIdentifier	 thresholds
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
freqs	TokenNameIdentifier	 freqs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
<	TokenNameLESS	
termThr	TokenNameIdentifier	 term Thr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
terms	TokenNameIdentifier	 terms
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
removed	TokenNameIdentifier	 removed
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
removed	TokenNameIdentifier	 removed
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
