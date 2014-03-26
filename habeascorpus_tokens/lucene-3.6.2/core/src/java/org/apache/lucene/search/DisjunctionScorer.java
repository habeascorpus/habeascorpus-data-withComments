package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * Base class for Scorers that score disjunctions. * Currently this just provides helper methods to manage the heap. */	TokenNameCOMMENT_JAVADOC	 Base class for Scorers that score disjunctions. Currently this just provides helper methods to manage the heap. 
abstract	TokenNameabstract	
class	TokenNameclass	
DisjunctionScorer	TokenNameIdentifier	 Disjunction Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
Scorer	TokenNameIdentifier	 Scorer
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
numScorers	TokenNameIdentifier	 num Scorers
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
DisjunctionScorer	TokenNameIdentifier	 Disjunction Scorer
(	TokenNameLPAREN	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Scorer	TokenNameIdentifier	 Scorer
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
int	TokenNameint	
numScorers	TokenNameIdentifier	 num Scorers
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
subScorers	TokenNameIdentifier	 sub Scorers
=	TokenNameEQUAL	
subScorers	TokenNameIdentifier	 sub Scorers
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
numScorers	TokenNameIdentifier	 num Scorers
=	TokenNameEQUAL	
numScorers	TokenNameIdentifier	 num Scorers
;	TokenNameSEMICOLON	
heapify	TokenNameIdentifier	 heapify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Organize subScorers into a min heap with scorers generating the earliest document on top. */	TokenNameCOMMENT_JAVADOC	 Organize subScorers into a min heap with scorers generating the earliest document on top. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
heapify	TokenNameIdentifier	 heapify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
numScorers	TokenNameIdentifier	 num Scorers
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
heapAdjust	TokenNameIdentifier	 heap Adjust
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The subtree of subScorers at root is a min heap except possibly for its root element. * Bubble the root down as required to make the subtree a heap. */	TokenNameCOMMENT_JAVADOC	 The subtree of subScorers at root is a min heap except possibly for its root element. Bubble the root down as required to make the subtree a heap. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
heapAdjust	TokenNameIdentifier	 heap Adjust
(	TokenNameLPAREN	
int	TokenNameint	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Scorer	TokenNameIdentifier	 Scorer
scorer	TokenNameIdentifier	 scorer
=	TokenNameEQUAL	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
root	TokenNameIdentifier	 root
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
(	TokenNameLPAREN	
numScorers	TokenNameIdentifier	 num Scorers
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
lchild	TokenNameIdentifier	 lchild
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
lscorer	TokenNameIdentifier	 lscorer
=	TokenNameEQUAL	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
lchild	TokenNameIdentifier	 lchild
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
ldoc	TokenNameIdentifier	 ldoc
=	TokenNameEQUAL	
lscorer	TokenNameIdentifier	 lscorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rdoc	TokenNameIdentifier	 rdoc
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
,	TokenNameCOMMA	
rchild	TokenNameIdentifier	 rchild
=	TokenNameEQUAL	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Scorer	TokenNameIdentifier	 Scorer
rscorer	TokenNameIdentifier	 rscorer
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rchild	TokenNameIdentifier	 rchild
<	TokenNameLESS	
numScorers	TokenNameIdentifier	 num Scorers
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rscorer	TokenNameIdentifier	 rscorer
=	TokenNameEQUAL	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
rchild	TokenNameIdentifier	 rchild
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rdoc	TokenNameIdentifier	 rdoc
=	TokenNameEQUAL	
rscorer	TokenNameIdentifier	 rscorer
.	TokenNameDOT	
docID	TokenNameIdentifier	 doc ID
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ldoc	TokenNameIdentifier	 ldoc
<	TokenNameLESS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rdoc	TokenNameIdentifier	 rdoc
<	TokenNameLESS	
ldoc	TokenNameIdentifier	 ldoc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rscorer	TokenNameIdentifier	 rscorer
;	TokenNameSEMICOLON	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
rchild	TokenNameIdentifier	 rchild
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
rchild	TokenNameIdentifier	 rchild
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lscorer	TokenNameIdentifier	 lscorer
;	TokenNameSEMICOLON	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
lchild	TokenNameIdentifier	 lchild
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
lchild	TokenNameIdentifier	 lchild
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rdoc	TokenNameIdentifier	 rdoc
<	TokenNameLESS	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rscorer	TokenNameIdentifier	 rscorer
;	TokenNameSEMICOLON	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
rchild	TokenNameIdentifier	 rchild
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
scorer	TokenNameIdentifier	 scorer
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
rchild	TokenNameIdentifier	 rchild
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Remove the root Scorer from subScorers and re-establish it as a heap */	TokenNameCOMMENT_JAVADOC	 Remove the root Scorer from subScorers and re-establish it as a heap 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
heapRemoveRoot	TokenNameIdentifier	 heap Remove Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numScorers	TokenNameIdentifier	 num Scorers
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
numScorers	TokenNameIdentifier	 num Scorers
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
numScorers	TokenNameIdentifier	 num Scorers
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
subScorers	TokenNameIdentifier	 sub Scorers
[	TokenNameLBRACKET	
numScorers	TokenNameIdentifier	 num Scorers
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
numScorers	TokenNameIdentifier	 num Scorers
;	TokenNameSEMICOLON	
heapAdjust	TokenNameIdentifier	 heap Adjust
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
