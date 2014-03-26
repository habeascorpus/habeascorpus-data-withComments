package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
search	TokenNameIdentifier	 search
.	TokenNameDOT	
spell	TokenNameIdentifier	 spell
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * N-Gram version of edit distance based on paper by Grzegorz Kondrak, * "N-gram similarity and distance". Proceedings of the Twelfth International * Conference on String Processing and Information Retrieval (SPIRE 2005), pp. 115-126, * Buenos Aires, Argentina, November 2005. * http://www.cs.ualberta.ca/~kondrak/papers/spire05.pdf * * This implementation uses the position-based optimization to compute partial * matches of n-gram sub-strings and adds a null-character prefix of size n-1 * so that the first character is contained in the same number of n-grams as * a middle character. Null-character prefix matches are discounted so that * strings with no matching characters will return a distance of 0. * */	TokenNameCOMMENT_JAVADOC	 N-Gram version of edit distance based on paper by Grzegorz Kondrak, "N-gram similarity and distance". Proceedings of the Twelfth International Conference on String Processing and Information Retrieval (SPIRE 2005), pp. 115-126, Buenos Aires, Argentina, November 2005. http://www.cs.ualberta.ca/~kondrak/papers/spire05.pdf * This implementation uses the position-based optimization to compute partial matches of n-gram sub-strings and adds a null-character prefix of size n-1 so that the first character is contained in the same number of n-grams as a middle character. Null-character prefix matches are discounted so that strings with no matching characters will return a distance of 0. 
public	TokenNamepublic	
class	TokenNameclass	
NGramDistance	TokenNameIdentifier	 N Gram Distance
implements	TokenNameimplements	
StringDistance	TokenNameIdentifier	 String Distance
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
/** * Creates an N-Gram distance measure using n-grams of the specified size. * @param size The size of the n-gram to be used to compute the string distance. */	TokenNameCOMMENT_JAVADOC	 Creates an N-Gram distance measure using n-grams of the specified size. @param size The size of the n-gram to be used to compute the string distance. 
public	TokenNamepublic	
NGramDistance	TokenNameIdentifier	 N Gram Distance
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates an N-Gram distance measure using n-grams of size 2. */	TokenNameCOMMENT_JAVADOC	 Creates an N-Gram distance measure using n-grams of size 2. 
public	TokenNamepublic	
NGramDistance	TokenNameIdentifier	 N Gram Distance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
tl	TokenNameIdentifier	 tl
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
==	TokenNameEQUAL_EQUAL	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
<	TokenNameLESS	
n	TokenNameIdentifier	 n
||	TokenNameOR_OR	
tl	TokenNameIdentifier	 tl
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
,	TokenNameCOMMA	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ni	TokenNameIdentifier	 ni
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cost	TokenNameIdentifier	 cost
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
cost	TokenNameIdentifier	 cost
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
,	TokenNameCOMMA	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sa	TokenNameIdentifier	 sa
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
sl	TokenNameIdentifier	 sl
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//'previous' cost array, horizontally 	TokenNameCOMMENT_LINE	'previous' cost array, horizontally 
float	TokenNamefloat	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// cost array, horizontally 	TokenNameCOMMENT_LINE	cost array, horizontally 
float	TokenNamefloat	
_d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//placeholder to assist in swapping p and d 	TokenNameCOMMENT_LINE	placeholder to assist in swapping p and d 
//construct sa with prefix 	TokenNameCOMMENT_LINE	construct sa with prefix 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
sa	TokenNameIdentifier	 sa
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
<	TokenNameLESS	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sa	TokenNameIdentifier	 sa
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//add prefix 	TokenNameCOMMENT_LINE	add prefix 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sa	TokenNameIdentifier	 sa
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
sl	TokenNameIdentifier	 sl
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
sl	TokenNameIdentifier	 sl
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// indexes into strings s and t 	TokenNameCOMMENT_LINE	indexes into strings s and t 
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// iterates through source 	TokenNameCOMMENT_LINE	iterates through source 
int	TokenNameint	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
// iterates through target 	TokenNameCOMMENT_LINE	iterates through target 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t_j	TokenNameIdentifier	 t j
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// jth n-gram of t 	TokenNameCOMMENT_LINE	jth n-gram of t 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
sl	TokenNameIdentifier	 sl
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<=	TokenNameLESS_EQUAL	
tl	TokenNameIdentifier	 tl
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//construct t_j n-gram 	TokenNameCOMMENT_LINE	construct t_j n-gram 
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
<	TokenNameLESS	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t_j	TokenNameIdentifier	 t j
[	TokenNameLBRACKET	
ti	TokenNameIdentifier	 ti
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
//add prefix 	TokenNameCOMMENT_LINE	add prefix 
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ti	TokenNameIdentifier	 ti
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ti	TokenNameIdentifier	 ti
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t_j	TokenNameIdentifier	 t j
[	TokenNameLBRACKET	
ti	TokenNameIdentifier	 ti
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
ti	TokenNameIdentifier	 ti
-	TokenNameMINUS	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t_j	TokenNameIdentifier	 t j
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
substring	TokenNameIdentifier	 substring
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
n	TokenNameIdentifier	 n
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
sl	TokenNameIdentifier	 sl
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
tn	TokenNameIdentifier	 tn
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
//compare sa to t_j 	TokenNameCOMMENT_LINE	compare sa to t_j 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
ni	TokenNameIdentifier	 ni
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ni	TokenNameIdentifier	 ni
<	TokenNameLESS	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
ni	TokenNameIdentifier	 ni
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sa	TokenNameIdentifier	 sa
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ni	TokenNameIdentifier	 ni
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
t_j	TokenNameIdentifier	 t j
[	TokenNameLBRACKET	
ni	TokenNameIdentifier	 ni
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cost	TokenNameIdentifier	 cost
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
sa	TokenNameIdentifier	 sa
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ni	TokenNameIdentifier	 ni
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//discount matches on prefix 	TokenNameCOMMENT_LINE	discount matches on prefix 
tn	TokenNameIdentifier	 tn
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
float	TokenNamefloat	
ec	TokenNameIdentifier	 ec
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
cost	TokenNameIdentifier	 cost
/	TokenNameDIVIDE	
tn	TokenNameIdentifier	 tn
;	TokenNameSEMICOLON	
// minimum of cell to the left+1, to the top+1, diagonally left and up +cost 	TokenNameCOMMENT_LINE	minimum of cell to the left+1, to the top+1, diagonally left and up +cost 
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ec	TokenNameIdentifier	 ec
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// copy current distance counts to 'previous row' distance counts 	TokenNameCOMMENT_LINE	copy current distance counts to 'previous row' distance counts 
_d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
_d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// our last action in the above loop was to switch d and p, so p now 	TokenNameCOMMENT_LINE	our last action in the above loop was to switch d and p, so p now 
// actually has the most recent cost counts 	TokenNameCOMMENT_LINE	actually has the most recent cost counts 
return	TokenNamereturn	
1.0f	TokenNameFloatingPointLiteral	
-	TokenNameMINUS	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
sl	TokenNameIdentifier	 sl
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
,	TokenNameCOMMA	
sl	TokenNameIdentifier	 sl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
