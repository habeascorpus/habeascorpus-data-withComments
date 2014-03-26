/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
benchmark	TokenNameIdentifier	 benchmark
.	TokenNameDOT	
quality	TokenNameIdentifier	 quality
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
text	TokenNameIdentifier	 text
.	TokenNameDOT	
NumberFormat	TokenNameIdentifier	 Number Format
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * Results of quality benchmark run for a single query or for a set of queries. */	TokenNameCOMMENT_JAVADOC	 Results of quality benchmark run for a single query or for a set of queries. 
public	TokenNamepublic	
class	TokenNameclass	
QualityStats	TokenNameIdentifier	 Quality Stats
{	TokenNameLBRACE	
/** Number of points for which precision is computed. */	TokenNameCOMMENT_JAVADOC	 Number of points for which precision is computed. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
=	TokenNameEQUAL	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
maxGoodPoints	TokenNameIdentifier	 max Good Points
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
recall	TokenNameIdentifier	 recall
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
pAt	TokenNameIdentifier	 p At
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
pReleventSum	TokenNameIdentifier	 p Relevent Sum
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
numGoodPoints	TokenNameIdentifier	 num Good Points
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
mrr	TokenNameIdentifier	 mrr
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
searchTime	TokenNameIdentifier	 search Time
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
docNamesExtractTime	TokenNameIdentifier	 doc Names Extract Time
;	TokenNameSEMICOLON	
/** * A certain rank in which a relevant doc was found. */	TokenNameCOMMENT_JAVADOC	 A certain rank in which a relevant doc was found. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
RecallPoint	TokenNameIdentifier	 Recall Point
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
rank	TokenNameIdentifier	 rank
;	TokenNameSEMICOLON	
private	TokenNameprivate	
double	TokenNamedouble	
recall	TokenNameIdentifier	 recall
;	TokenNameSEMICOLON	
private	TokenNameprivate	
RecallPoint	TokenNameIdentifier	 Recall Point
(	TokenNameLPAREN	
int	TokenNameint	
rank	TokenNameIdentifier	 rank
,	TokenNameCOMMA	
double	TokenNamedouble	
recall	TokenNameIdentifier	 recall
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rank	TokenNameIdentifier	 rank
=	TokenNameEQUAL	
rank	TokenNameIdentifier	 rank
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
recall	TokenNameIdentifier	 recall
=	TokenNameEQUAL	
recall	TokenNameIdentifier	 recall
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the rank: where on the list of returned docs this relevant doc appeared. */	TokenNameCOMMENT_JAVADOC	 Returns the rank: where on the list of returned docs this relevant doc appeared. 
public	TokenNamepublic	
int	TokenNameint	
getRank	TokenNameIdentifier	 get Rank
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rank	TokenNameIdentifier	 rank
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Returns the recall: how many relevant docs were returned up to this point, inclusive. */	TokenNameCOMMENT_JAVADOC	 Returns the recall: how many relevant docs were returned up to this point, inclusive. 
public	TokenNamepublic	
double	TokenNamedouble	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recall	TokenNameIdentifier	 recall
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
RecallPoint	TokenNameIdentifier	 Recall Point
>	TokenNameGREATER	
recallPoints	TokenNameIdentifier	 recall Points
;	TokenNameSEMICOLON	
/** * Construct a QualityStats object with anticipated maximal number of relevant hits. * @param maxGoodPoints maximal possible relevant hits. */	TokenNameCOMMENT_JAVADOC	 Construct a QualityStats object with anticipated maximal number of relevant hits. @param maxGoodPoints maximal possible relevant hits. 
public	TokenNamepublic	
QualityStats	TokenNameIdentifier	 Quality Stats
(	TokenNameLPAREN	
double	TokenNamedouble	
maxGoodPoints	TokenNameIdentifier	 max Good Points
,	TokenNameCOMMA	
long	TokenNamelong	
searchTime	TokenNameIdentifier	 search Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxGoodPoints	TokenNameIdentifier	 max Good Points
=	TokenNameEQUAL	
maxGoodPoints	TokenNameIdentifier	 max Good Points
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
searchTime	TokenNameIdentifier	 search Time
=	TokenNameEQUAL	
searchTime	TokenNameIdentifier	 search Time
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
recallPoints	TokenNameIdentifier	 recall Points
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
RecallPoint	TokenNameIdentifier	 Recall Point
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pAt	TokenNameIdentifier	 p At
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// pAt[0] unused. 	TokenNameCOMMENT_LINE	pAt[0] unused. 
}	TokenNameRBRACE	
/** * Add a (possibly relevant) doc. * @param n rank of the added doc (its ordinal position within the query results). * @param isRelevant true if the added doc is relevant, false otherwise. */	TokenNameCOMMENT_JAVADOC	 Add a (possibly relevant) doc. @param n rank of the added doc (its ordinal position within the query results). @param isRelevant true if the added doc is relevant, false otherwise. 
public	TokenNamepublic	
void	TokenNamevoid	
addResult	TokenNameIdentifier	 add Result
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
boolean	TokenNameboolean	
isRelevant	TokenNameIdentifier	 is Relevant
,	TokenNameCOMMA	
long	TokenNamelong	
docNameExtractTime	TokenNameIdentifier	 doc Name Extract Time
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
numPoints	TokenNameIdentifier	 num Points
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
>	TokenNameGREATER	
1E-6	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"point "	TokenNameStringLiteral	point 
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
" illegal after "	TokenNameStringLiteral	 illegal after 
+	TokenNamePLUS	
numPoints	TokenNameIdentifier	 num Points
+	TokenNamePLUS	
" points!"	TokenNameStringLiteral	 points!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isRelevant	TokenNameIdentifier	 is Relevant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numGoodPoints	TokenNameIdentifier	 num Good Points
+=	TokenNamePLUS_EQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
recallPoints	TokenNameIdentifier	 recall Points
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
RecallPoint	TokenNameIdentifier	 Recall Point
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
numGoodPoints	TokenNameIdentifier	 num Good Points
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
recallPoints	TokenNameIdentifier	 recall Points
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
n	TokenNameIdentifier	 n
<=	TokenNameLESS_EQUAL	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first point, but only within 5 top scores. 	TokenNameCOMMENT_LINE	first point, but only within 5 top scores. 
mrr	TokenNameIdentifier	 mrr
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
/	TokenNameDIVIDE	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
numPoints	TokenNameIdentifier	 num Points
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
double	TokenNamedouble	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
numGoodPoints	TokenNameIdentifier	 num Good Points
/	TokenNameDIVIDE	
numPoints	TokenNameIdentifier	 num Points
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isRelevant	TokenNameIdentifier	 is Relevant
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pReleventSum	TokenNameIdentifier	 p Relevent Sum
+=	TokenNamePLUS_EQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
pAt	TokenNameIdentifier	 p At
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pAt	TokenNameIdentifier	 p At
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
recall	TokenNameIdentifier	 recall
=	TokenNameEQUAL	
maxGoodPoints	TokenNameIdentifier	 max Good Points
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
p	TokenNameIdentifier	 p
:	TokenNameCOLON	
numGoodPoints	TokenNameIdentifier	 num Good Points
/	TokenNameDIVIDE	
maxGoodPoints	TokenNameIdentifier	 max Good Points
;	TokenNameSEMICOLON	
docNamesExtractTime	TokenNameIdentifier	 doc Names Extract Time
+=	TokenNamePLUS_EQUAL	
docNameExtractTime	TokenNameIdentifier	 doc Name Extract Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the precision at rank n: * |{relevant hits within first <code>n</code> hits}| / <code>n</code>. * @param n requested precision point, must be at least 1 and at most {@link #MAX_POINTS}. */	TokenNameCOMMENT_JAVADOC	 Return the precision at rank n: |{relevant hits within first <code>n</code> hits}| / <code>n</code>. @param n requested precision point, must be at least 1 and at most {@link #MAX_POINTS}. 
public	TokenNamepublic	
double	TokenNamedouble	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"n="	TokenNameStringLiteral	n=
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
" - but it must be in [1,"	TokenNameStringLiteral	 - but it must be in [1,
+	TokenNamePLUS	
MAX_POINTS	TokenNameIdentifier	 MAX  POINTS
+	TokenNamePLUS	
"] range!"	TokenNameStringLiteral	] range!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
>	TokenNameGREATER	
numPoints	TokenNameIdentifier	 num Points
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
numPoints	TokenNameIdentifier	 num Points
*	TokenNameMULTIPLY	
pAt	TokenNameIdentifier	 p At
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
numPoints	TokenNameIdentifier	 num Points
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pAt	TokenNameIdentifier	 p At
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the average precision at recall points. */	TokenNameCOMMENT_JAVADOC	 Return the average precision at recall points. 
public	TokenNamepublic	
double	TokenNamedouble	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxGoodPoints	TokenNameIdentifier	 max Good Points
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
pReleventSum	TokenNameIdentifier	 p Relevent Sum
/	TokenNameDIVIDE	
maxGoodPoints	TokenNameIdentifier	 max Good Points
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the recall: |{relevant hits found}| / |{relevant hits existing}|. */	TokenNameCOMMENT_JAVADOC	 Return the recall: |{relevant hits found}| / |{relevant hits existing}|. 
public	TokenNamepublic	
double	TokenNamedouble	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recall	TokenNameIdentifier	 recall
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Log information on this QualityStats object. * @param logger Logger. * @param prefix prefix before each log line. */	TokenNameCOMMENT_JAVADOC	 Log information on this QualityStats object. @param logger Logger. @param prefix prefix before each log line. 
public	TokenNamepublic	
void	TokenNamevoid	
log	TokenNameIdentifier	 log
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
title	TokenNameIdentifier	 title
,	TokenNameCOMMA	
int	TokenNameint	
paddLines	TokenNameIdentifier	 padd Lines
,	TokenNameCOMMA	
PrintWriter	TokenNameIdentifier	 Print Writer
logger	TokenNameIdentifier	 logger
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
paddLines	TokenNameIdentifier	 padd Lines
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
title	TokenNameIdentifier	 title
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
title	TokenNameIdentifier	 title
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
prefix	TokenNameIdentifier	 prefix
;	TokenNameSEMICOLON	
NumberFormat	TokenNameIdentifier	 Number Format
nf	TokenNameIdentifier	 nf
=	TokenNameEQUAL	
NumberFormat	TokenNameIdentifier	 Number Format
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
setMaximumFractionDigits	TokenNameIdentifier	 set Maximum Fraction Digits
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
setMinimumFractionDigits	TokenNameIdentifier	 set Minimum Fraction Digits
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
setGroupingUsed	TokenNameIdentifier	 set Grouping Used
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
M	TokenNameIdentifier	 M
=	TokenNameEQUAL	
19	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Search Seconds: "	TokenNameStringLiteral	Search Seconds: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
searchTime	TokenNameIdentifier	 search Time
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"DocName Seconds: "	TokenNameStringLiteral	DocName Seconds: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
docNamesExtractTime	TokenNameIdentifier	 doc Names Extract Time
/	TokenNameDIVIDE	
1000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Num Points: "	TokenNameStringLiteral	Num Points: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
numPoints	TokenNameIdentifier	 num Points
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Num Good Points: "	TokenNameStringLiteral	Num Good Points: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
numGoodPoints	TokenNameIdentifier	 num Good Points
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Max Good Points: "	TokenNameStringLiteral	Max Good Points: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
maxGoodPoints	TokenNameIdentifier	 max Good Points
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Average Precision: "	TokenNameStringLiteral	Average Precision: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"MRR: "	TokenNameStringLiteral	MRR: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getMRR	TokenNameIdentifier	 get MRR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Recall: "	TokenNameStringLiteral	Recall: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getRecall	TokenNameIdentifier	 get Recall
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
numPoints	TokenNameIdentifier	 num Points
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
pAt	TokenNameIdentifier	 p At
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
"Precision At "	TokenNameStringLiteral	Precision At 
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
,	TokenNameCOMMA	
M	TokenNameIdentifier	 M
)	TokenNameRPAREN	
+	TokenNamePLUS	
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
nf	TokenNameIdentifier	 nf
.	TokenNameDOT	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
paddLines	TokenNameIdentifier	 padd Lines
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
logger	TokenNameIdentifier	 logger
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
padd	TokenNameIdentifier	 padd
=	TokenNameEQUAL	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
int	TokenNameint	
minLen	TokenNameIdentifier	 min Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
""	TokenNameStringLiteral	 
:	TokenNameCOLON	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
minLen	TokenNameIdentifier	 min Len
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
padd	TokenNameIdentifier	 padd
)	TokenNameRPAREN	
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
fracFormat	TokenNameIdentifier	 frac Format
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
frac	TokenNameIdentifier	 frac
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
frac	TokenNameIdentifier	 frac
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
'.'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
padd	TokenNameIdentifier	 padd
+	TokenNamePLUS	
frac	TokenNameIdentifier	 frac
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
s1	TokenNameIdentifier	 s1
=	TokenNameEQUAL	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s1	TokenNameIdentifier	 s1
+	TokenNamePLUS	
frac	TokenNameIdentifier	 frac
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a QualityStats object that is the average of the input QualityStats objects. * @param stats array of input stats to be averaged. * @return an average over the input stats. */	TokenNameCOMMENT_JAVADOC	 Create a QualityStats object that is the average of the input QualityStats objects. @param stats array of input stats to be averaged. @return an average over the input stats. 
public	TokenNamepublic	
static	TokenNamestatic	
QualityStats	TokenNameIdentifier	 Quality Stats
average	TokenNameIdentifier	 average
(	TokenNameLPAREN	
QualityStats	TokenNameIdentifier	 Quality Stats
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
stats	TokenNameIdentifier	 stats
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QualityStats	TokenNameIdentifier	 Quality Stats
avg	TokenNameIdentifier	 avg
=	TokenNameEQUAL	
new	TokenNamenew	
QualityStats	TokenNameIdentifier	 Quality Stats
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// weired, no stats to average! 	TokenNameCOMMENT_LINE	weired, no stats to average! 
return	TokenNamereturn	
avg	TokenNameIdentifier	 avg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// queries with positive judgements 	TokenNameCOMMENT_LINE	queries with positive judgements 
// aggregate 	TokenNameCOMMENT_LINE	aggregate 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
searchTime	TokenNameIdentifier	 search Time
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
searchTime	TokenNameIdentifier	 search Time
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
docNamesExtractTime	TokenNameIdentifier	 doc Names Extract Time
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
docNamesExtractTime	TokenNameIdentifier	 doc Names Extract Time
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
maxGoodPoints	TokenNameIdentifier	 max Good Points
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m	TokenNameIdentifier	 m
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
numGoodPoints	TokenNameIdentifier	 num Good Points
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
numGoodPoints	TokenNameIdentifier	 num Good Points
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
pReleventSum	TokenNameIdentifier	 p Relevent Sum
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getAvp	TokenNameIdentifier	 get Avp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
recall	TokenNameIdentifier	 recall
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
recall	TokenNameIdentifier	 recall
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
mrr	TokenNameIdentifier	 mrr
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getMRR	TokenNameIdentifier	 get MRR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
maxGoodPoints	TokenNameIdentifier	 max Good Points
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
maxGoodPoints	TokenNameIdentifier	 max Good Points
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
pAt	TokenNameIdentifier	 p At
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
pAt	TokenNameIdentifier	 p At
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
+=	TokenNamePLUS_EQUAL	
stats	TokenNameIdentifier	 stats
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
getPrecisionAt	TokenNameIdentifier	 get Precision At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
m	TokenNameIdentifier	 m
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
"Fishy: no "good" queries!"	TokenNameStringLiteral	Fishy: no "good" queries!
;	TokenNameSEMICOLON	
// take average: times go by all queries, other measures go by "good" queries only. 	TokenNameCOMMENT_LINE	take average: times go by all queries, other measures go by "good" queries only. 
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
searchTime	TokenNameIdentifier	 search Time
/=	TokenNameDIVIDE_EQUAL	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
docNamesExtractTime	TokenNameIdentifier	 doc Names Extract Time
/=	TokenNameDIVIDE_EQUAL	
stats	TokenNameIdentifier	 stats
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
numGoodPoints	TokenNameIdentifier	 num Good Points
/=	TokenNameDIVIDE_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
numPoints	TokenNameIdentifier	 num Points
/=	TokenNameDIVIDE_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
recall	TokenNameIdentifier	 recall
/=	TokenNameDIVIDE_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
mrr	TokenNameIdentifier	 mrr
/=	TokenNameDIVIDE_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
maxGoodPoints	TokenNameIdentifier	 max Good Points
/=	TokenNameDIVIDE_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
pAt	TokenNameIdentifier	 p At
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
pAt	TokenNameIdentifier	 p At
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
/=	TokenNameDIVIDE_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
pReleventSum	TokenNameIdentifier	 p Relevent Sum
/=	TokenNameDIVIDE_EQUAL	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
// this is actually avgp now 	TokenNameCOMMENT_LINE	this is actually avgp now 
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
pReleventSum	TokenNameIdentifier	 p Relevent Sum
*=	TokenNameMULTIPLY_EQUAL	
avg	TokenNameIdentifier	 avg
.	TokenNameDOT	
maxGoodPoints	TokenNameIdentifier	 max Good Points
;	TokenNameSEMICOLON	
// so that getAvgP() would be correct 	TokenNameCOMMENT_LINE	so that getAvgP() would be correct 
return	TokenNamereturn	
avg	TokenNameIdentifier	 avg
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the time it took to extract doc names for judging the measured query, in milliseconds. */	TokenNameCOMMENT_JAVADOC	 Returns the time it took to extract doc names for judging the measured query, in milliseconds. 
public	TokenNamepublic	
long	TokenNamelong	
getDocNamesExtractTime	TokenNameIdentifier	 get Doc Names Extract Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
docNamesExtractTime	TokenNameIdentifier	 doc Names Extract Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the maximal number of good points. * This is the number of relevant docs known by the judge for the measured query. */	TokenNameCOMMENT_JAVADOC	 Returns the maximal number of good points. This is the number of relevant docs known by the judge for the measured query. 
public	TokenNamepublic	
double	TokenNamedouble	
getMaxGoodPoints	TokenNameIdentifier	 get Max Good Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxGoodPoints	TokenNameIdentifier	 max Good Points
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of good points (only relevant points). */	TokenNameCOMMENT_JAVADOC	 Returns the number of good points (only relevant points). 
public	TokenNamepublic	
double	TokenNamedouble	
getNumGoodPoints	TokenNameIdentifier	 get Num Good Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numGoodPoints	TokenNameIdentifier	 num Good Points
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of points (both relevant and irrelevant points). */	TokenNameCOMMENT_JAVADOC	 Returns the number of points (both relevant and irrelevant points). 
public	TokenNamepublic	
double	TokenNamedouble	
getNumPoints	TokenNameIdentifier	 get Num Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
numPoints	TokenNameIdentifier	 num Points
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the recallPoints. */	TokenNameCOMMENT_JAVADOC	 Returns the recallPoints. 
public	TokenNamepublic	
RecallPoint	TokenNameIdentifier	 Recall Point
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getRecallPoints	TokenNameIdentifier	 get Recall Points
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
recallPoints	TokenNameIdentifier	 recall Points
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
RecallPoint	TokenNameIdentifier	 Recall Point
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the Mean reciprocal rank over the queries or RR for a single query. * <p> * Reciprocal rank is defined as <code>1/r</code> where <code>r</code> is the * rank of the first correct result, or <code>0</code> if there are no correct * results within the top 5 results. * <p> * This follows the definition in * <a href="http://www.cnlp.org/publications/02cnlptrec10.pdf"> * Question Answering - CNLP at the TREC-10 Question Answering Track</a>. */	TokenNameCOMMENT_JAVADOC	 Returns the Mean reciprocal rank over the queries or RR for a single query. <p> Reciprocal rank is defined as <code>1/r</code> where <code>r</code> is the rank of the first correct result, or <code>0</code> if there are no correct results within the top 5 results. <p> This follows the definition in <a href="http://www.cnlp.org/publications/02cnlptrec10.pdf"> Question Answering - CNLP at the TREC-10 Question Answering Track</a>. 
public	TokenNamepublic	
double	TokenNamedouble	
getMRR	TokenNameIdentifier	 get MRR
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
mrr	TokenNameIdentifier	 mrr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the search time in milliseconds for the measured query. */	TokenNameCOMMENT_JAVADOC	 Returns the search time in milliseconds for the measured query. 
public	TokenNamepublic	
long	TokenNamelong	
getSearchTime	TokenNameIdentifier	 get Search Time
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
searchTime	TokenNameIdentifier	 search Time
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
