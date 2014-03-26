package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
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
search	TokenNameIdentifier	 search
.	TokenNameDOT	
Explanation	TokenNameIdentifier	 Explanation
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
Weight	TokenNameIdentifier	 Weight
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
Scorer	TokenNameIdentifier	 Scorer
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
Similarity	TokenNameIdentifier	 Similarity
;	TokenNameSEMICOLON	
/** * Public for extension only. */	TokenNameCOMMENT_JAVADOC	 Public for extension only. 
public	TokenNamepublic	
class	TokenNameclass	
SpanScorer	TokenNameIdentifier	 Span Scorer
extends	TokenNameextends	
Scorer	TokenNameIdentifier	 Scorer
{	TokenNameLBRACE	
protected	TokenNameprotected	
Spans	TokenNameIdentifier	 Spans
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
float	TokenNamefloat	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SpanScorer	TokenNameIdentifier	 Span Scorer
(	TokenNameLPAREN	
Spans	TokenNameIdentifier	 Spans
spans	TokenNameIdentifier	 spans
,	TokenNameCOMMA	
Weight	TokenNameIdentifier	 Weight
weight	TokenNameIdentifier	 weight
,	TokenNameCOMMA	
Similarity	TokenNameIdentifier	 Similarity
similarity	TokenNameIdentifier	 similarity
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
norms	TokenNameIdentifier	 norms
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
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
spans	TokenNameIdentifier	 spans
=	TokenNameEQUAL	
spans	TokenNameIdentifier	 spans
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
norms	TokenNameIdentifier	 norms
=	TokenNameEQUAL	
norms	TokenNameIdentifier	 norms
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
weight	TokenNameIdentifier	 weight
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
!	TokenNameNOT	
setFreqCurrentDoc	TokenNameIdentifier	 set Freq Current Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
!	TokenNameNOT	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
NO_MORE_DOCS	TokenNameIdentifier	 NO  MORE  DOCS
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// setFreqCurrentDoc() leaves spans.doc() ahead 	TokenNameCOMMENT_LINE	setFreqCurrentDoc() leaves spans.doc() ahead 
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
skipTo	TokenNameIdentifier	 skip To
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
setFreqCurrentDoc	TokenNameIdentifier	 set Freq Current Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
protected	TokenNameprotected	
boolean	TokenNameboolean	
setFreqCurrentDoc	TokenNameIdentifier	 set Freq Current Doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
more	TokenNameIdentifier	 more
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
doc	TokenNameIdentifier	 doc
=	TokenNameEQUAL	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
matchLength	TokenNameIdentifier	 match Length
=	TokenNameEQUAL	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
end	TokenNameIdentifier	 end
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
freq	TokenNameIdentifier	 freq
+=	TokenNamePLUS_EQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
sloppyFreq	TokenNameIdentifier	 sloppy Freq
(	TokenNameLPAREN	
matchLength	TokenNameIdentifier	 match Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
more	TokenNameIdentifier	 more
=	TokenNameEQUAL	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
more	TokenNameIdentifier	 more
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
==	TokenNameEQUAL_EQUAL	
spans	TokenNameIdentifier	 spans
.	TokenNameDOT	
doc	TokenNameIdentifier	 doc
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
score	TokenNameIdentifier	 score
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
float	TokenNamefloat	
raw	TokenNameIdentifier	 raw
=	TokenNameEQUAL	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
tf	TokenNameIdentifier	 tf
(	TokenNameLPAREN	
freq	TokenNameIdentifier	 freq
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// raw score 	TokenNameCOMMENT_LINE	raw score 
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
// normalize 	TokenNameCOMMENT_LINE	normalize 
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
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** This method is no longer an official member of {@link Scorer}, * but it is needed by SpanWeight to build an explanation. */	TokenNameCOMMENT_JAVADOC	 This method is no longer an official member of {@link Scorer}, but it is needed by SpanWeight to build an explanation. 
protected	TokenNameprotected	
Explanation	TokenNameIdentifier	 Explanation
explain	TokenNameIdentifier	 explain
(	TokenNameLPAREN	
final	TokenNamefinal	
int	TokenNameint	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
Explanation	TokenNameIdentifier	 Explanation
tfExplanation	TokenNameIdentifier	 tf Explanation
=	TokenNameEQUAL	
new	TokenNamenew	
Explanation	TokenNameIdentifier	 Explanation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
expDoc	TokenNameIdentifier	 exp Doc
=	TokenNameEQUAL	
advance	TokenNameIdentifier	 advance
(	TokenNameLPAREN	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
phraseFreq	TokenNameIdentifier	 phrase Freq
=	TokenNameEQUAL	
(	TokenNameLPAREN	
expDoc	TokenNameIdentifier	 exp Doc
==	TokenNameEQUAL_EQUAL	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
?	TokenNameQUESTION	
freq	TokenNameIdentifier	 freq
:	TokenNameCOLON	
0.0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
tfExplanation	TokenNameIdentifier	 tf Explanation
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
getSimilarity	TokenNameIdentifier	 get Similarity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
return	TokenNamereturn	
tfExplanation	TokenNameIdentifier	 tf Explanation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
