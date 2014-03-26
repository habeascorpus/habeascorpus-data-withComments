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
/** * Levenstein edit distance class. */	TokenNameCOMMENT_JAVADOC	 Levenstein edit distance class. 
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
LevensteinDistance	TokenNameIdentifier	 Levenstein Distance
implements	TokenNameimplements	
StringDistance	TokenNameIdentifier	 String Distance
{	TokenNameLBRACE	
/** * Optimized to run a bit faster than the static getDistance(). * In one benchmark times were 5.3sec using ctr vs 8.5sec w/ static method, thus 37% faster. */	TokenNameCOMMENT_JAVADOC	 Optimized to run a bit faster than the static getDistance(). In one benchmark times were 5.3sec using ctr vs 8.5sec w/ static method, thus 37% faster. 
public	TokenNamepublic	
LevensteinDistance	TokenNameIdentifier	 Levenstein Distance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
//***************************** 	TokenNameCOMMENT_LINE	***************************** 
// Compute Levenshtein distance: see org.apache.commons.lang.StringUtils#getLevenshteinDistance(String, String) 	TokenNameCOMMENT_LINE	Compute Levenshtein distance: see org.apache.commons.lang.StringUtils#getLevenshteinDistance(String, String) 
//***************************** 	TokenNameCOMMENT_LINE	***************************** 
public	TokenNamepublic	
float	TokenNamefloat	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sa	TokenNameIdentifier	 sa
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
int	TokenNameint	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//'previous' cost array, horizontally 	TokenNameCOMMENT_LINE	'previous' cost array, horizontally 
int	TokenNameint	
d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// cost array, horizontally 	TokenNameCOMMENT_LINE	cost array, horizontally 
int	TokenNameint	
_d	TokenNameIdentifier	 d
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
//placeholder to assist in swapping p and d 	TokenNameCOMMENT_LINE	placeholder to assist in swapping p and d 
/* The difference between this impl. and the previous is that, rather than creating and retaining a matrix of size s.length()+1 by t.length()+1, we maintain two single-dimensional arrays of length s.length()+1. The first, d, is the 'current working' distance array that maintains the newest distance cost counts as we iterate through the characters of String s. Each time we increment the index of String t we are comparing, d is copied to p, the second int[]. Doing so allows us to retain the previous cost counts as required by the algorithm (taking the minimum of the cost count to the left, up one, and diagonally up and to the left of the current cost count being calculated). (Note that the arrays aren't really copied anymore, just switched...this is clearly much better than cloning an array or doing a System.arraycopy() each time through the outer loop.) Effectively, the difference between the two implementations is this one does not cause an out of memory condition when calculating the LD over two very large strings. */	TokenNameCOMMENT_BLOCK	 The difference between this impl. and the previous is that, rather than creating and retaining a matrix of size s.length()+1 by t.length()+1, we maintain two single-dimensional arrays of length s.length()+1. The first, d, is the 'current working' distance array that maintains the newest distance cost counts as we iterate through the characters of String s. Each time we increment the index of String t we are comparing, d is copied to p, the second int[]. Doing so allows us to retain the previous cost counts as required by the algorithm (taking the minimum of the cost count to the left, up one, and diagonally up and to the left of the current cost count being calculated). (Note that the arrays aren't really copied anymore, just switched...this is clearly much better than cloning an array or doing a System.arraycopy() each time through the outer loop.) Effectively, the difference between the two implementations is this one does not cause an out of memory condition when calculating the LD over two very large strings. 
sa	TokenNameIdentifier	 sa
=	TokenNameEQUAL	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
toCharArray	TokenNameIdentifier	 to Char Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
m	TokenNameIdentifier	 m
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
// indexes into strings s and t 	TokenNameCOMMENT_LINE	indexes into strings s and t 
int	TokenNameint	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
// iterates through s 	TokenNameCOMMENT_LINE	iterates through s 
int	TokenNameint	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
// iterates through t 	TokenNameCOMMENT_LINE	iterates through t 
char	TokenNamechar	
t_j	TokenNameIdentifier	 t j
;	TokenNameSEMICOLON	
// jth character of t 	TokenNameCOMMENT_LINE	jth character of t 
int	TokenNameint	
cost	TokenNameIdentifier	 cost
;	TokenNameSEMICOLON	
// cost 	TokenNameCOMMENT_LINE	cost 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<=	TokenNameLESS_EQUAL	
n	TokenNameIdentifier	 n
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
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t_j	TokenNameIdentifier	 t j
=	TokenNameEQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
sa	TokenNameIdentifier	 sa
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
t_j	TokenNameIdentifier	 t j
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
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
cost	TokenNameIdentifier	 cost
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
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
p	TokenNameIdentifier	 p
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
sa	TokenNameIdentifier	 sa
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
