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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * Similarity measure for short strings such as person names. * <p> * @see <a href="http://en.wikipedia.org/wiki/Jaro%E2%80%93Winkler_distance">http://en.wikipedia.org/wiki/Jaro%E2%80%93Winkler_distance</a> */	TokenNameCOMMENT_JAVADOC	 Similarity measure for short strings such as person names. <p> @see <a href="http://en.wikipedia.org/wiki/Jaro%E2%80%93Winkler_distance">http://en.wikipedia.org/wiki/Jaro%E2%80%93Winkler_distance</a> 
public	TokenNamepublic	
class	TokenNameclass	
JaroWinklerDistance	TokenNameIdentifier	 Jaro Winkler Distance
implements	TokenNameimplements	
StringDistance	TokenNameIdentifier	 String Distance
{	TokenNameLBRACE	
private	TokenNameprivate	
float	TokenNamefloat	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
0.7f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
max	TokenNameIdentifier	 max
,	TokenNameCOMMA	
min	TokenNameIdentifier	 min
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
s2	TokenNameIdentifier	 s2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
max	TokenNameIdentifier	 max
=	TokenNameEQUAL	
s2	TokenNameIdentifier	 s2
;	TokenNameSEMICOLON	
min	TokenNameIdentifier	 min
=	TokenNameEQUAL	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matchIndexes	TokenNameIdentifier	 match Indexes
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
matchIndexes	TokenNameIdentifier	 match Indexes
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
matchFlags	TokenNameIdentifier	 match Flags
=	TokenNameEQUAL	
new	TokenNamenew	
boolean	TokenNameboolean	
[	TokenNameLBRACKET	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
matches	TokenNameIdentifier	 matches
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
<	TokenNameLESS	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
xi	TokenNameIdentifier	 xi
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
-	TokenNameMINUS	
range	TokenNameIdentifier	 range
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xn	TokenNameIdentifier	 xn
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
+	TokenNamePLUS	
range	TokenNameIdentifier	 range
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xi	TokenNameIdentifier	 xi
<	TokenNameLESS	
xn	TokenNameIdentifier	 xn
;	TokenNameSEMICOLON	
xi	TokenNameIdentifier	 xi
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
matchFlags	TokenNameIdentifier	 match Flags
[	TokenNameLBRACKET	
xi	TokenNameIdentifier	 xi
]	TokenNameRBRACKET	
&&	TokenNameAND_AND	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
xi	TokenNameIdentifier	 xi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
matchIndexes	TokenNameIdentifier	 match Indexes
[	TokenNameLBRACKET	
mi	TokenNameIdentifier	 mi
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
xi	TokenNameIdentifier	 xi
;	TokenNameSEMICOLON	
matchFlags	TokenNameIdentifier	 match Flags
[	TokenNameLBRACKET	
xi	TokenNameIdentifier	 xi
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
matches	TokenNameIdentifier	 matches
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ms1	TokenNameIdentifier	 ms1
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
matches	TokenNameIdentifier	 matches
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ms2	TokenNameIdentifier	 ms2
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
matches	TokenNameIdentifier	 matches
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchIndexes	TokenNameIdentifier	 match Indexes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ms1	TokenNameIdentifier	 ms1
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
si	TokenNameIdentifier	 si
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
matchFlags	TokenNameIdentifier	 match Flags
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ms2	TokenNameIdentifier	 ms2
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
si	TokenNameIdentifier	 si
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
transpositions	TokenNameIdentifier	 transpositions
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
<	TokenNameLESS	
ms1	TokenNameIdentifier	 ms1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ms1	TokenNameIdentifier	 ms1
[	TokenNameLBRACKET	
mi	TokenNameIdentifier	 mi
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
ms2	TokenNameIdentifier	 ms2
[	TokenNameLBRACKET	
mi	TokenNameIdentifier	 mi
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
transpositions	TokenNameIdentifier	 transpositions
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
mi	TokenNameIdentifier	 mi
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
<	TokenNameLESS	
min	TokenNameIdentifier	 min
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mi	TokenNameIdentifier	 mi
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
mi	TokenNameIdentifier	 mi
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
matches	TokenNameIdentifier	 matches
,	TokenNameCOMMA	
transpositions	TokenNameIdentifier	 transpositions
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
float	TokenNamefloat	
getDistance	TokenNameIdentifier	 get Distance
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
mtp	TokenNameIdentifier	 mtp
=	TokenNameEQUAL	
matches	TokenNameIdentifier	 matches
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
,	TokenNameCOMMA	
s2	TokenNameIdentifier	 s2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
mtp	TokenNameIdentifier	 mtp
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
float	TokenNamefloat	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
/	TokenNameDIVIDE	
s1	TokenNameIdentifier	 s1
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
/	TokenNameDIVIDE	
s2	TokenNameIdentifier	 s2
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
m	TokenNameIdentifier	 m
-	TokenNameMINUS	
mtp	TokenNameIdentifier	 mtp
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
jw	TokenNameIdentifier	 jw
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
j	TokenNameIdentifier	 j
:	TokenNameCOLON	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
0.1f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
1f	TokenNameFloatingPointLiteral	
/	TokenNameDIVIDE	
mtp	TokenNameIdentifier	 mtp
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
mtp	TokenNameIdentifier	 mtp
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
jw	TokenNameIdentifier	 jw
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the threshold used to determine when Winkler bonus should be used. * Set to a negative value to get the Jaro distance. * @param threshold the new value of the threshold */	TokenNameCOMMENT_JAVADOC	 Sets the threshold used to determine when Winkler bonus should be used. Set to a negative value to get the Jaro distance. @param threshold the new value of the threshold 
public	TokenNamepublic	
void	TokenNamevoid	
setThreshold	TokenNameIdentifier	 set Threshold
(	TokenNameLPAREN	
float	TokenNamefloat	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current value of the threshold used for adding the Winkler bonus. * The default value is 0.7. * @return the current value of the threshold */	TokenNameCOMMENT_JAVADOC	 Returns the current value of the threshold used for adding the Winkler bonus. The default value is 0.7. @return the current value of the threshold 
public	TokenNamepublic	
float	TokenNamefloat	
getThreshold	TokenNameIdentifier	 get Threshold
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
