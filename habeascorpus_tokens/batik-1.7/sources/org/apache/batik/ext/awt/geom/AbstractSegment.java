/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Point2D	TokenNameIdentifier	 Point2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
/** * An abstract class for path segments. * * @version $Id: AbstractSegment.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 An abstract class for path segments. * @version $Id: AbstractSegment.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractSegment	TokenNameIdentifier	 Abstract Segment
implements	TokenNameimplements	
Segment	TokenNameIdentifier	 Segment
{	TokenNameLBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
int	TokenNameint	
findRoots	TokenNameIdentifier	 find Roots
(	TokenNameLPAREN	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Segment	TokenNameIdentifier	 Segment
.	TokenNameDOT	
SplitResults	TokenNameIdentifier	 Split Results
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
roots	TokenNameIdentifier	 roots
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
numSol	TokenNameIdentifier	 num Sol
=	TokenNameEQUAL	
findRoots	TokenNameIdentifier	 find Roots
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSol	TokenNameIdentifier	 num Sol
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// No split 	TokenNameCOMMENT_LINE	No split 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
roots	TokenNameIdentifier	 roots
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
numSol	TokenNameIdentifier	 num Sol
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segs	TokenNameIdentifier	 segs
=	TokenNameEQUAL	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
numSol	TokenNameIdentifier	 num Sol
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
numSegments	TokenNameIdentifier	 num Segments
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
numSegments	TokenNameIdentifier	 num Segments
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
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
numSol	TokenNameIdentifier	 num Sol
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<=	TokenNameLESS_EQUAL	
0.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>=	TokenNameGREATER_EQUAL	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
numSegments	TokenNameIdentifier	 num Segments
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
numSegments	TokenNameIdentifier	 num Segments
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
numSegments	TokenNameIdentifier	 num Segments
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
numSegments	TokenNameIdentifier	 num Segments
==	TokenNameEQUAL_EQUAL	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// System.err.println("Y: " + y + "#Seg: " + numSegments + 	TokenNameCOMMENT_LINE	System.err.println("Y: " + y + "#Seg: " + numSegments + 
// " Seg: " + this); 	TokenNameCOMMENT_LINE	" Seg: " + this); 
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
parts	TokenNameIdentifier	 parts
=	TokenNameEQUAL	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
numSegments	TokenNameIdentifier	 num Segments
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
pT	TokenNameIdentifier	 p T
=	TokenNameEQUAL	
0.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
pIdx	TokenNameIdentifier	 p Idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
firstAbove	TokenNameIdentifier	 first Above
=	TokenNameEQUAL	
false	TokenNamefalse	
,	TokenNameCOMMA	
prevAbove	TokenNameIdentifier	 prev Above
=	TokenNameEQUAL	
false	TokenNamefalse	
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
numSegments	TokenNameIdentifier	 num Segments
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("Segs: " + segs[i-1]+", "+segs[i]); 	TokenNameCOMMENT_LINE	System.err.println("Segs: " + segs[i-1]+", "+segs[i]); 
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
pIdx	TokenNameIdentifier	 p Idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
pt	TokenNameIdentifier	 pt
=	TokenNameEQUAL	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
pIdx	TokenNameIdentifier	 p Idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
0.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("Pt: " + pt); 	TokenNameCOMMENT_LINE	System.err.println("Pt: " + pt); 
if	TokenNameif	
(	TokenNameLPAREN	
pIdx	TokenNameIdentifier	 p Idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pIdx	TokenNameIdentifier	 p Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
firstAbove	TokenNameIdentifier	 first Above
=	TokenNameEQUAL	
prevAbove	TokenNameIdentifier	 prev Above
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
above	TokenNameIdentifier	 above
=	TokenNameEQUAL	
(	TokenNameLPAREN	
pt	TokenNameIdentifier	 pt
.	TokenNameDOT	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prevAbove	TokenNameIdentifier	 prev Above
==	TokenNameEQUAL_EQUAL	
above	TokenNameIdentifier	 above
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Merge segments 	TokenNameCOMMENT_LINE	Merge segments 
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
pIdx	TokenNameIdentifier	 p Idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
pT	TokenNameIdentifier	 p T
,	TokenNameCOMMA	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
pIdx	TokenNameIdentifier	 p Idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pT	TokenNameIdentifier	 p T
=	TokenNameEQUAL	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
prevAbove	TokenNameIdentifier	 prev Above
=	TokenNameEQUAL	
above	TokenNameIdentifier	 above
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pIdx	TokenNameIdentifier	 p Idx
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
below	TokenNameIdentifier	 below
,	TokenNameCOMMA	
above	TokenNameIdentifier	 above
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
firstAbove	TokenNameIdentifier	 first Above
)	TokenNameRPAREN	
{	TokenNameLBRACE	
above	TokenNameIdentifier	 above
=	TokenNameEQUAL	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
pIdx	TokenNameIdentifier	 p Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
below	TokenNameIdentifier	 below
=	TokenNameEQUAL	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
pIdx	TokenNameIdentifier	 p Idx
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
above	TokenNameIdentifier	 above
=	TokenNameEQUAL	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
pIdx	TokenNameIdentifier	 p Idx
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
below	TokenNameIdentifier	 below
=	TokenNameEQUAL	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
pIdx	TokenNameIdentifier	 p Idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ai	TokenNameIdentifier	 ai
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
bi	TokenNameIdentifier	 bi
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
pIdx	TokenNameIdentifier	 p Idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
firstAbove	TokenNameIdentifier	 first Above
)	TokenNameRPAREN	
above	TokenNameIdentifier	 above
[	TokenNameLBRACKET	
ai	TokenNameIdentifier	 ai
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
else	TokenNameelse	
below	TokenNameIdentifier	 below
[	TokenNameLBRACKET	
bi	TokenNameIdentifier	 bi
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
parts	TokenNameIdentifier	 parts
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
firstAbove	TokenNameIdentifier	 first Above
=	TokenNameEQUAL	
!	TokenNameNOT	
firstAbove	TokenNameIdentifier	 first Above
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
SplitResults	TokenNameIdentifier	 Split Results
(	TokenNameLPAREN	
below	TokenNameIdentifier	 below
,	TokenNameCOMMA	
above	TokenNameIdentifier	 above
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Segment	TokenNameIdentifier	 Segment
splitBefore	TokenNameIdentifier	 split Before
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
0.0	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Segment	TokenNameIdentifier	 Segment
splitAfter	TokenNameIdentifier	 split After
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
1.0	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Doubles have 48bit precision 	TokenNameCOMMENT_LINE	Doubles have 48bit precision 
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
eps	TokenNameIdentifier	 eps
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
double	TokenNamedouble	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
1L	TokenNameLongLiteral	
<<	TokenNameLEFT_SHIFT	
48	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
double	TokenNamedouble	
tol	TokenNameIdentifier	 tol
=	TokenNameEQUAL	
4.0	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
eps	TokenNameIdentifier	 eps
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
solveLine	TokenNameIdentifier	 solve Line
(	TokenNameLPAREN	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// No intersection. 	TokenNameCOMMENT_LINE	No intersection. 
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// All pts intersect just return 0. 	TokenNameCOMMENT_LINE	All pts intersect just return 0. 
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
/	TokenNameDIVIDE	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
solveQuad	TokenNameIdentifier	 solve Quad
(	TokenNameLPAREN	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
double	TokenNamedouble	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("Quad: " + a +"t^2 + " + b +"t + " + c); 	TokenNameCOMMENT_LINE	System.err.println("Quad: " + a +"t^2 + " + b +"t + " + c); 
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no square term. 	TokenNameCOMMENT_LINE	no square term. 
return	TokenNamereturn	
solveLine	TokenNameIdentifier	 solve Line
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
det	TokenNameIdentifier	 det
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
-	TokenNameMINUS	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
*	TokenNameMULTIPLY	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
// System.err.println("Det: " + det); 	TokenNameCOMMENT_LINE	System.err.println("Det: " + det); 
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
det	TokenNameIdentifier	 det
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
tol	TokenNameIdentifier	 tol
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
*	TokenNameMULTIPLY	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// one real root (det doesn't contain any useful info) 	TokenNameCOMMENT_LINE	one real root (det doesn't contain any useful info) 
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
det	TokenNameIdentifier	 det
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// No real roots 	TokenNameCOMMENT_LINE	No real roots 
// Two real roots 	TokenNameCOMMENT_LINE	Two real roots 
det	TokenNameIdentifier	 det
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
det	TokenNameIdentifier	 det
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
+	TokenNamePLUS	
matchSign	TokenNameIdentifier	 match Sign
(	TokenNameLPAREN	
det	TokenNameIdentifier	 det
,	TokenNameCOMMA	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
w	TokenNameIdentifier	 w
;	TokenNameSEMICOLON	
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
w	TokenNameIdentifier	 w
/	TokenNameDIVIDE	
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
double	TokenNamedouble	
matchSign	TokenNameIdentifier	 match Sign
(	TokenNameLPAREN	
double	TokenNamedouble	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
b	TokenNameIdentifier	 b
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
a	TokenNameIdentifier	 a
:	TokenNameCOLON	
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
a	TokenNameIdentifier	 a
:	TokenNameCOLON	
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
solveCubic	TokenNameIdentifier	 solve Cubic
(	TokenNameLPAREN	
double	TokenNamedouble	
a3	TokenNameIdentifier	 a3
,	TokenNameCOMMA	
double	TokenNamedouble	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
double	TokenNamedouble	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
double	TokenNamedouble	
a0	TokenNameIdentifier	 a0
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("Cubic: " + a3 + "t^3 + " + 	TokenNameCOMMENT_LINE	System.err.println("Cubic: " + a3 + "t^3 + " + 
// a2 +"t^2 + " + 	TokenNameCOMMENT_LINE	a2 +"t^2 + " + 
// a1 +"t + " + a0); 	TokenNameCOMMENT_LINE	a1 +"t + " + a0); 
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dRoots	TokenNameIdentifier	 d Roots
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
dCnt	TokenNameIdentifier	 d Cnt
=	TokenNameEQUAL	
solveQuad	TokenNameIdentifier	 solve Quad
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
a3	TokenNameIdentifier	 a3
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
a2	TokenNameIdentifier	 a2
,	TokenNameCOMMA	
a1	TokenNameIdentifier	 a1
,	TokenNameCOMMA	
dRoots	TokenNameIdentifier	 d Roots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
yVals	TokenNameIdentifier	 y Vals
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tVals	TokenNameIdentifier	 t Vals
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
yCnt	TokenNameIdentifier	 y Cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
yVals	TokenNameIdentifier	 y Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a0	TokenNameIdentifier	 a0
;	TokenNameSEMICOLON	
tVals	TokenNameIdentifier	 t Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
dCnt	TokenNameIdentifier	 d Cnt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yVals	TokenNameIdentifier	 y Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a3	TokenNameIdentifier	 a3
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a0	TokenNameIdentifier	 a0
;	TokenNameSEMICOLON	
tVals	TokenNameIdentifier	 t Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yVals	TokenNameIdentifier	 y Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a3	TokenNameIdentifier	 a3
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a0	TokenNameIdentifier	 a0
;	TokenNameSEMICOLON	
tVals	TokenNameIdentifier	 t Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
dRoots	TokenNameIdentifier	 d Roots
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
yVals	TokenNameIdentifier	 y Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a3	TokenNameIdentifier	 a3
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
a0	TokenNameIdentifier	 a0
;	TokenNameSEMICOLON	
tVals	TokenNameIdentifier	 t Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
yVals	TokenNameIdentifier	 y Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
a3	TokenNameIdentifier	 a3
+	TokenNamePLUS	
a2	TokenNameIdentifier	 a2
+	TokenNamePLUS	
a1	TokenNameIdentifier	 a1
+	TokenNamePLUS	
a0	TokenNameIdentifier	 a0
;	TokenNameSEMICOLON	
tVals	TokenNameIdentifier	 t Vals
[	TokenNameLBRACKET	
yCnt	TokenNameIdentifier	 y Cnt
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
1.0	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
ret	TokenNameIdentifier	 ret
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
yCnt	TokenNameIdentifier	 y Cnt
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
yVals	TokenNameIdentifier	 y Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
tVals	TokenNameIdentifier	 t Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
yVals	TokenNameIdentifier	 y Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
tVals	TokenNameIdentifier	 t Vals
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y0	TokenNameIdentifier	 y0
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y0	TokenNameIdentifier	 y0
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y0	TokenNameIdentifier	 y0
>	TokenNameGREATER	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// swap so y0 < 0 and y1 > 0 	TokenNameCOMMENT_LINE	swap so y0 < 0 and y1 > 0 
double	TokenNamedouble	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
y1	TokenNameIdentifier	 y1
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
t0	TokenNameIdentifier	 t0
;	TokenNameSEMICOLON	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
y0	TokenNameIdentifier	 y0
<	TokenNameLESS	
tol	TokenNameIdentifier	 tol
*	TokenNameMULTIPLY	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
ret	TokenNameIdentifier	 ret
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t0	TokenNameIdentifier	 t0
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
<	TokenNameLESS	
-	TokenNameMINUS	
tol	TokenNameIdentifier	 tol
*	TokenNameMULTIPLY	
y0	TokenNameIdentifier	 y0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
ret	TokenNameIdentifier	 ret
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
epsZero	TokenNameIdentifier	 eps Zero
=	TokenNameEQUAL	
tol	TokenNameIdentifier	 tol
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
-	TokenNameMINUS	
y0	TokenNameIdentifier	 y0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cnt	TokenNameIdentifier	 cnt
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cnt	TokenNameIdentifier	 cnt
<	TokenNameLESS	
20	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
cnt	TokenNameIdentifier	 cnt
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
-	TokenNameMINUS	
t0	TokenNameIdentifier	 t0
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
y1	TokenNameIdentifier	 y1
-	TokenNameMINUS	
y0	TokenNameIdentifier	 y0
;	TokenNameSEMICOLON	
// double t = (t0+t1)/2; 	TokenNameCOMMENT_LINE	double t = (t0+t1)/2; 
// double t= t0+Math.abs(y0/dy)*dt; 	TokenNameCOMMENT_LINE	double t= t0+Math.abs(y0/dy)*dt; 
// This tends to make sure that we come up 	TokenNameCOMMENT_LINE	This tends to make sure that we come up 
// a little short each time this generaly allows 	TokenNameCOMMENT_LINE	a little short each time this generaly allows 
// you to eliminate as much of the range as possible 	TokenNameCOMMENT_LINE	you to eliminate as much of the range as possible 
// without overshooting (in which case you may eliminate 	TokenNameCOMMENT_LINE	without overshooting (in which case you may eliminate 
// almost nothing). 	TokenNameCOMMENT_LINE	almost nothing). 
double	TokenNamedouble	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
t0	TokenNameIdentifier	 t0
+	TokenNamePLUS	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
y0	TokenNameIdentifier	 y0
/	TokenNameDIVIDE	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
99	TokenNameIntegerLiteral	
+	TokenNamePLUS	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
dt	TokenNameIdentifier	 dt
/	TokenNameDIVIDE	
100	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
a3	TokenNameIdentifier	 a3
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
a2	TokenNameIdentifier	 a2
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
a1	TokenNameIdentifier	 a1
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
a0	TokenNameIdentifier	 a0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
abs	TokenNameIdentifier	 abs
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
<	TokenNameLESS	
epsZero	TokenNameIdentifier	 eps Zero
)	TokenNameRPAREN	
{	TokenNameLBRACE	
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
ret	TokenNameIdentifier	 ret
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
y0	TokenNameIdentifier	 y0
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
y1	TokenNameIdentifier	 y1
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cnt	TokenNameIdentifier	 cnt
==	TokenNameEQUAL_EQUAL	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
roots	TokenNameIdentifier	 roots
[	TokenNameLBRACKET	
ret	TokenNameIdentifier	 ret
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
t0	TokenNameIdentifier	 t0
+	TokenNamePLUS	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public static void check(Segment seg, float y, PrintStream ps) { ps.println("<path fill=\"none\" stroke=\"black\" " + " stroke-width=\"3\" d=\"" + seg + "\"/>"); ps.println("<line x1=\"-1000\" y1=\""+y+ "\" x2=\"1000\" y2=\""+y+"\" fill=\"none\" stroke=\"orange\"/>\n"); SplitResults sr = seg.split(y); if (sr == null) return; Segment [] above = sr.getAbove(); Segment [] below = sr.getBelow(); for (int i=0; i<above.length; i++) { ps.println("<path fill=\"none\" stroke=\"blue\" " + " stroke-width=\"2.5\" " + " d=\"" + above[i] + "\"/>"); } for (int i=0; i<below.length; i++) { ps.println("<path fill=\"none\" stroke=\"red\" " + " stroke-width=\"2\" " + "d=\"" + below[i] + "\"/>"); } } public static void main(String [] args) { PrintStream ps; double [] roots = { 0, 0, 0 }; int n = solveCubic (-0.10000991821289062, 9.600013732910156, -35.70000457763672, 58.0, roots); for (int i=0; i<n; i++) System.err.println("Root: " + roots[i]); Cubic c; c = new Cubic(new Point2D.Double(153.6999969482422,5.099999904632568), new Point2D.Double(156.6999969482422,4.099999904632568), new Point2D.Double(160.39999389648438,2.3999998569488525), new Point2D.Double(164.6999969482422,0.0)); c.split(0); c = new Cubic(new Point2D.Double(24.899999618530273,23.10000228881836), new Point2D.Double(41.5,8.399999618530273), new Point2D.Double(64.69999694824219,1.0), new Point2D.Double(94.5999984741211,1.0)); c.split(0); try { ps = new PrintStream(new FileOutputStream(args[0])); } catch(java.io.IOException ioe) { ioe.printStackTrace(); return; } ps.println("<?xml version=\"1.0\" standalone=\"no\"?>\n" + "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.0//EN\"\n" + "\"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd\">\n" + "<svg width=\"450\" height=\"500\"\n" + " viewBox=\"-100 -100 450 500\"\n" + " xmlns=\"http://www.w3.org/2000/svg\"\n" + " xmlns:xlink=\"http://www.w3.org/1999/xlink\">"); check(new Cubic(new Point2D.Double(0, 0), new Point2D.Double(100, 100), new Point2D.Double(-50, 100), new Point2D.Double(50, 0)), 40, ps); check(new Cubic(new Point2D.Double(100, 0), new Point2D.Double(200, 100), new Point2D.Double(50, -50), new Point2D.Double(150, 30)), 20, ps); check(new Cubic(new Point2D.Double(200, 0), new Point2D.Double(300, 100), new Point2D.Double(150, 100), new Point2D.Double(250, 0)), 75, ps); check(new Quadradic(new Point2D.Double(0, 100), new Point2D.Double(50,150), new Point2D.Double(10,100)), 115, ps); check(new Linear(new Point2D.Double(100, 100), new Point2D.Double(150,150)), 115, ps); ps.println("</svg>"); } */	TokenNameCOMMENT_BLOCK	 public static void check(Segment seg, float y, PrintStream ps) { ps.println("<path fill=\"none\" stroke=\"black\" " + " stroke-width=\"3\" d=\"" + seg + "\"/>"); ps.println("<line x1=\"-1000\" y1=\""+y+ "\" x2=\"1000\" y2=\""+y+"\" fill=\"none\" stroke=\"orange\"/>\n"); SplitResults sr = seg.split(y); if (sr == null) return; Segment [] above = sr.getAbove(); Segment [] below = sr.getBelow(); for (int i=0; i<above.length; i++) { ps.println("<path fill=\"none\" stroke=\"blue\" " + " stroke-width=\"2.5\" " + " d=\"" + above[i] + "\"/>"); } for (int i=0; i<below.length; i++) { ps.println("<path fill=\"none\" stroke=\"red\" " + " stroke-width=\"2\" " + "d=\"" + below[i] + "\"/>"); } } public static void main(String [] args) { PrintStream ps; double [] roots = { 0, 0, 0 }; int n = solveCubic (-0.10000991821289062, 9.600013732910156, -35.70000457763672, 58.0, roots); for (int i=0; i<n; i++) System.err.println("Root: " + roots[i]); Cubic c; c = new Cubic(new Point2D.Double(153.6999969482422,5.099999904632568), new Point2D.Double(156.6999969482422,4.099999904632568), new Point2D.Double(160.39999389648438,2.3999998569488525), new Point2D.Double(164.6999969482422,0.0)); c.split(0); c = new Cubic(new Point2D.Double(24.899999618530273,23.10000228881836), new Point2D.Double(41.5,8.399999618530273), new Point2D.Double(64.69999694824219,1.0), new Point2D.Double(94.5999984741211,1.0)); c.split(0); try { ps = new PrintStream(new FileOutputStream(args[0])); } catch(java.io.IOException ioe) { ioe.printStackTrace(); return; } ps.println("<?xml version=\"1.0\" standalone=\"no\"?>\n" + "<!DOCTYPE svg PUBLIC \"-//W3C//DTD SVG 1.0//EN\"\n" + "\"http://www.w3.org/TR/2001/REC-SVG-20010904/DTD/svg10.dtd\">\n" + "<svg width=\"450\" height=\"500\"\n" + " viewBox=\"-100 -100 450 500\"\n" + " xmlns=\"http://www.w3.org/2000/svg\"\n" + " xmlns:xlink=\"http://www.w3.org/1999/xlink\">"); check(new Cubic(new Point2D.Double(0, 0), new Point2D.Double(100, 100), new Point2D.Double(-50, 100), new Point2D.Double(50, 0)), 40, ps); check(new Cubic(new Point2D.Double(100, 0), new Point2D.Double(200, 100), new Point2D.Double(50, -50), new Point2D.Double(150, 30)), 20, ps); check(new Cubic(new Point2D.Double(200, 0), new Point2D.Double(300, 100), new Point2D.Double(150, 100), new Point2D.Double(250, 0)), 75, ps); check(new Quadradic(new Point2D.Double(0, 100), new Point2D.Double(50,150), new Point2D.Double(10,100)), 115, ps); check(new Linear(new Point2D.Double(100, 100), new Point2D.Double(150,150)), 115, ps); ps.println("</svg>"); } 
}	TokenNameRBRACE	
