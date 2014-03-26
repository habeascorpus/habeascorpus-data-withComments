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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
/** Scorer for conjunctions, sets of queries, all of which are required. */	TokenNameCOMMENT_JAVADOC	 Scorer for conjunctions, sets of queries, all of which are required. 
class	TokenNameclass	
ConjunctionScorer	TokenNameIdentifier	 Conjunction Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scorers	TokenNameIdentifier	 scorers
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ConjunctionScorer	TokenNameIdentifier	 Conjunction Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
scorers	TokenNameIdentifier	 scorers
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Scorer	TokenNameIdentifier	 Scorer
[	TokenNameLBRACKET	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ConjunctionScorer	TokenNameIdentifier	 Conjunction Scorer
(	TokenNameLPAREN	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
...	TokenNameELLIPSIS	
scorers	TokenNameIdentifier	 scorers
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
weight	TokenNameIdentifier	 weight
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
scorers	TokenNameIdentifier	 scorers
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
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
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If even one of the sub-scorers does not have any documents, this 	TokenNameCOMMENT_LINE	If even one of the sub-scorers does not have any documents, this 
// scorer should not attempt to do any more work. 	TokenNameCOMMENT_LINE	scorer should not attempt to do any more work. 
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Sort the array the first time... 	TokenNameCOMMENT_LINE	Sort the array the first time... 
// We don't need to sort the array in any future calls because we know 	TokenNameCOMMENT_LINE	We don't need to sort the array in any future calls because we know 
// it will already start off sorted (all scorers on same doc). 	TokenNameCOMMENT_LINE	it will already start off sorted (all scorers on same doc). 
// Note that this comparator is not consistent with equals! 	TokenNameCOMMENT_LINE	Note that this comparator is not consistent with equals! 
// Also we use mergeSort here to be stable (so order of Scoreres that 	TokenNameCOMMENT_LINE	Also we use mergeSort here to be stable (so order of Scoreres that 
// match on first document keeps preserved): 	TokenNameCOMMENT_LINE	match on first document keeps preserved): 
ArrayUtil	TokenNameIdentifier	 Array Util
.	TokenNameDOT	
mergeSort	TokenNameIdentifier	 merge Sort
(	TokenNameLPAREN	
scorers	TokenNameIdentifier	 scorers
,	TokenNameCOMMA	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
Scorer	TokenNameIdentifier	 Scorer
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// sort the array 	TokenNameCOMMENT_LINE	sort the array 
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Scorer	TokenNameIdentifier	 Scorer
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
o2	TokenNameIdentifier	 o2
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// NOTE: doNext() must be called before the re-sorting of the array later on. 	TokenNameCOMMENT_LINE	NOTE: doNext() must be called before the re-sorting of the array later on. 
// The reason is this: assume there are 5 scorers, whose first docs are 1, 	TokenNameCOMMENT_LINE	The reason is this: assume there are 5 scorers, whose first docs are 1, 
// 2, 3, 5, 5 respectively. Sorting (above) leaves the array as is. Calling 	TokenNameCOMMENT_LINE	2, 3, 5, 5 respectively. Sorting (above) leaves the array as is. Calling 
// doNext() here advances all the first scorers to 5 (or a larger doc ID 	TokenNameCOMMENT_LINE	doNext() here advances all the first scorers to 5 (or a larger doc ID 
// they all agree on). 	TokenNameCOMMENT_LINE	they all agree on). 
// However, if we re-sort before doNext() is called, the order will be 5, 3, 	TokenNameCOMMENT_LINE	However, if we re-sort before doNext() is called, the order will be 5, 3, 
// 2, 1, 5 and then doNext() will stop immediately, since the first scorer's 	TokenNameCOMMENT_LINE	2, 1, 5 and then doNext() will stop immediately, since the first scorer's 
// docs equals the last one. So the invariant that after calling doNext() 	TokenNameCOMMENT_LINE	docs equals the last one. So the invariant that after calling doNext() 
// all scorers are on the same doc ID is broken. 	TokenNameCOMMENT_LINE	all scorers are on the same doc ID is broken. 
if	TokenNameif	
(	TokenNameLPAREN	
doNext	TokenNameIdentifier	 do Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// The scorers did not agree on any document. 	TokenNameCOMMENT_LINE	The scorers did not agree on any document. 
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If first-time skip distance is any predictor of 	TokenNameCOMMENT_LINE	If first-time skip distance is any predictor of 
// scorer sparseness, then we should always try to skip first on 	TokenNameCOMMENT_LINE	scorer sparseness, then we should always try to skip first on 
// those scorers. 	TokenNameCOMMENT_LINE	those scorers. 
// Keep last scorer in it's last place (it will be the first 	TokenNameCOMMENT_LINE	Keep last scorer in it's last place (it will be the first 
// to be skipped on), but reverse all of the others so that 	TokenNameCOMMENT_LINE	to be skipped on), but reverse all of the others so that 
// they will be skipped on in order of original high skip. 	TokenNameCOMMENT_LINE	they will be skipped on in order of original high skip. 
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
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
max	TokenNameIdentifier	 max
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
doNext	TokenNameIdentifier	 do Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
firstScorer	TokenNameIdentifier	 first Scorer
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
firstScorer	TokenNameIdentifier	 first Scorer
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
first	TokenNameIdentifier	 first
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
firstScorer	TokenNameIdentifier	 first Scorer
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
first	TokenNameIdentifier	 first
==	TokenNameEQUAL_EQUAL	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
first	TokenNameIdentifier	 first
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
lastDoc	TokenNameIdentifier	 last Doc
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastDoc	TokenNameIdentifier	 last Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
.	TokenNameDOT	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
doNext	TokenNameIdentifier	 do Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
lastDoc	TokenNameIdentifier	 last Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
if	TokenNameif	
(	TokenNameLPAREN	
lastDoc	TokenNameIdentifier	 last Doc
==	TokenNameEQUAL_EQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastDoc	TokenNameIdentifier	 last Doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lastDoc	TokenNameIdentifier	 last Doc
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
.	TokenNameDOT	
nextDoc	TokenNameIdentifier	 next Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lastDoc	TokenNameIdentifier	 last Doc
=	TokenNameEQUAL	
doNext	TokenNameIdentifier	 do Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
sum	TokenNameIdentifier	 sum
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
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
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sum	TokenNameIdentifier	 sum
+=	TokenNamePLUS_EQUAL	
scorers	TokenNameIdentifier	 scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sum	TokenNameIdentifier	 sum
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
scorers	TokenNameIdentifier	 scorers
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
