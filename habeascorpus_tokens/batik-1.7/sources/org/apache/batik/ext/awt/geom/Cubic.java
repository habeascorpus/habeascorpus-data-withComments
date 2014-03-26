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
CubicCurve2D	TokenNameIdentifier	 Cubic Curve2 D
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
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
QuadCurve2D	TokenNameIdentifier	 Quad Curve2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
/** * A class representing a cubic path segment. * * @version $Id: Cubic.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A class representing a cubic path segment. * @version $Id: Cubic.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Cubic	TokenNameIdentifier	 Cubic
extends	TokenNameextends	
AbstractSegment	TokenNameIdentifier	 Abstract Segment
{	TokenNameLBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Cubic	TokenNameIdentifier	 Cubic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p3	TokenNameIdentifier	 p3
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p4	TokenNameIdentifier	 p4
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Cubic	TokenNameIdentifier	 Cubic
(	TokenNameLPAREN	
double	TokenNamedouble	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
double	TokenNamedouble	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
double	TokenNamedouble	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
double	TokenNamedouble	
y2	TokenNameIdentifier	 y2
,	TokenNameCOMMA	
double	TokenNamedouble	
x3	TokenNameIdentifier	 x3
,	TokenNameCOMMA	
double	TokenNamedouble	
y3	TokenNameIdentifier	 y3
,	TokenNameCOMMA	
double	TokenNamedouble	
x4	TokenNameIdentifier	 x4
,	TokenNameCOMMA	
double	TokenNamedouble	
y4	TokenNameIdentifier	 y4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p3	TokenNameIdentifier	 p3
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
x3	TokenNameIdentifier	 x3
,	TokenNameCOMMA	
y3	TokenNameIdentifier	 y3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
p4	TokenNameIdentifier	 p4
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
x4	TokenNameIdentifier	 x4
,	TokenNameCOMMA	
y4	TokenNameIdentifier	 y4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Cubic	TokenNameIdentifier	 Cubic
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p3	TokenNameIdentifier	 p3
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p4	TokenNameIdentifier	 p4
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Cubic	TokenNameIdentifier	 Cubic
(	TokenNameLPAREN	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Segment	TokenNameIdentifier	 Segment
reverse	TokenNameIdentifier	 reverse
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Cubic	TokenNameIdentifier	 Cubic
(	TokenNameLPAREN	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
getMinMax	TokenNameIdentifier	 get Min Max
(	TokenNameLPAREN	
double	TokenNamedouble	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
double	TokenNamedouble	
p2	TokenNameIdentifier	 p2
,	TokenNameCOMMA	
double	TokenNamedouble	
p3	TokenNameIdentifier	 p3
,	TokenNameCOMMA	
double	TokenNamedouble	
p4	TokenNameIdentifier	 p4
,	TokenNameCOMMA	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minMax	TokenNameIdentifier	 min Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
>	TokenNameGREATER	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
;	TokenNameSEMICOLON	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
;	TokenNameSEMICOLON	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
double	TokenNamedouble	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
6	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
-	TokenNameMINUS	
p3	TokenNameIdentifier	 p3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eqn	TokenNameIdentifier	 eqn
=	TokenNameEQUAL	
{	TokenNameLBRACE	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
c2	TokenNameIdentifier	 c2
-	TokenNameMINUS	
c1	TokenNameIdentifier	 c1
+	TokenNamePLUS	
c0	TokenNameIdentifier	 c0
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
int	TokenNameint	
roots	TokenNameIdentifier	 roots
=	TokenNameEQUAL	
QuadCurve2D	TokenNameIdentifier	 Quad Curve2 D
.	TokenNameDOT	
solveQuadratic	TokenNameIdentifier	 solve Quadratic
(	TokenNameLPAREN	
eqn	TokenNameIdentifier	 eqn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
<	TokenNameLESS	
roots	TokenNameIdentifier	 roots
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
eqn	TokenNameIdentifier	 eqn
[	TokenNameLBRACKET	
r	TokenNameIdentifier	 r
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
tv	TokenNameIdentifier	 tv
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
tv	TokenNameIdentifier	 tv
>=	TokenNameGREATER_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p1	TokenNameIdentifier	 p1
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
tv	TokenNameIdentifier	 tv
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
tv	TokenNameIdentifier	 tv
*	TokenNameMULTIPLY	
tv	TokenNameIdentifier	 tv
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
tv	TokenNameIdentifier	 tv
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p3	TokenNameIdentifier	 p3
+	TokenNamePLUS	
tv	TokenNameIdentifier	 tv
*	TokenNameMULTIPLY	
tv	TokenNameIdentifier	 tv
*	TokenNameMULTIPLY	
tv	TokenNameIdentifier	 tv
*	TokenNameMULTIPLY	
p4	TokenNameIdentifier	 p4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tv	TokenNameIdentifier	 tv
<	TokenNameLESS	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tv	TokenNameIdentifier	 tv
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
tv	TokenNameIdentifier	 tv
>	TokenNameGREATER	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
tv	TokenNameIdentifier	 tv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
minX	TokenNameIdentifier	 min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minMax	TokenNameIdentifier	 min Max
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getMinMax	TokenNameIdentifier	 get Min Max
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
minMax	TokenNameIdentifier	 min Max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
maxX	TokenNameIdentifier	 max X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minMax	TokenNameIdentifier	 min Max
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getMinMax	TokenNameIdentifier	 get Min Max
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
minMax	TokenNameIdentifier	 min Max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
minY	TokenNameIdentifier	 min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minMax	TokenNameIdentifier	 min Max
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getMinMax	TokenNameIdentifier	 get Min Max
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
minMax	TokenNameIdentifier	 min Max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
maxY	TokenNameIdentifier	 max Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minMax	TokenNameIdentifier	 min Max
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getMinMax	TokenNameIdentifier	 get Min Max
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
minMax	TokenNameIdentifier	 min Max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minMaxX	TokenNameIdentifier	 min Max X
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getMinMax	TokenNameIdentifier	 get Min Max
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
minMaxX	TokenNameIdentifier	 min Max X
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minMaxY	TokenNameIdentifier	 min Max Y
=	TokenNameEQUAL	
{	TokenNameLBRACE	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
getMinMax	TokenNameIdentifier	 get Min Max
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
minMaxY	TokenNameIdentifier	 min Max Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
minMaxX	TokenNameIdentifier	 min Max X
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minMaxY	TokenNameIdentifier	 min Max Y
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minMaxX	TokenNameIdentifier	 min Max X
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
minMaxX	TokenNameIdentifier	 min Max X
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
minMaxY	TokenNameIdentifier	 min Max Y
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
minMaxY	TokenNameIdentifier	 min Max Y
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
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
{	TokenNameLBRACE	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eqn	TokenNameIdentifier	 eqn
=	TokenNameEQUAL	
{	TokenNameLBRACE	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
CubicCurve2D	TokenNameIdentifier	 Cubic Curve2 D
.	TokenNameDOT	
solveCubic	TokenNameIdentifier	 solve Cubic
(	TokenNameLPAREN	
eqn	TokenNameIdentifier	 eqn
,	TokenNameCOMMA	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return solveCubic(eqn[3], eqn[2], eqn[1], eqn[0], roots); 	TokenNameCOMMENT_LINE	return solveCubic(eqn[3], eqn[2], eqn[1], eqn[0], roots); 
}	TokenNameRBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
evalDt	TokenNameIdentifier	 eval Dt
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
*	TokenNameMULTIPLY	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subdivides this Cubic curve into two curves at t = 0.5. * can be done with getSegment but this is more efficent. * @param s0 if non-null contains portion of curve from 0->.5 * @param s1 if non-null contains portion of curve from .5->1 */	TokenNameCOMMENT_JAVADOC	 Subdivides this Cubic curve into two curves at t = 0.5. can be done with getSegment but this is more efficent. @param s0 if non-null contains portion of curve from 0->.5 @param s1 if non-null contains portion of curve from .5->1 
public	TokenNamepublic	
void	TokenNamevoid	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
Segment	TokenNameIdentifier	 Segment
s0	TokenNameIdentifier	 s0
,	TokenNameCOMMA	
Segment	TokenNameIdentifier	 Segment
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Cubic	TokenNameIdentifier	 Cubic
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s0	TokenNameIdentifier	 s0
instanceof	TokenNameinstanceof	
Cubic	TokenNameIdentifier	 Cubic
)	TokenNameRPAREN	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Cubic	TokenNameIdentifier	 Cubic
)	TokenNameRPAREN	
s0	TokenNameIdentifier	 s0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
instanceof	TokenNameinstanceof	
Cubic	TokenNameIdentifier	 Cubic
)	TokenNameRPAREN	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Cubic	TokenNameIdentifier	 Cubic
)	TokenNameRPAREN	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subdivides this Cubic curve into two curves at given t. * @param s0 if non-null contains portion of curve from 0->t. * @param s1 if non-null contains portion of curve from t->1. */	TokenNameCOMMENT_JAVADOC	 Subdivides this Cubic curve into two curves at given t. @param s0 if non-null contains portion of curve from 0->t. @param s1 if non-null contains portion of curve from t->1. 
public	TokenNamepublic	
void	TokenNamevoid	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Segment	TokenNameIdentifier	 Segment
s0	TokenNameIdentifier	 s0
,	TokenNameCOMMA	
Segment	TokenNameIdentifier	 Segment
s1	TokenNameIdentifier	 s1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Cubic	TokenNameIdentifier	 Cubic
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s0	TokenNameIdentifier	 s0
instanceof	TokenNameinstanceof	
Cubic	TokenNameIdentifier	 Cubic
)	TokenNameRPAREN	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Cubic	TokenNameIdentifier	 Cubic
)	TokenNameRPAREN	
s0	TokenNameIdentifier	 s0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
instanceof	TokenNameinstanceof	
Cubic	TokenNameIdentifier	 Cubic
)	TokenNameRPAREN	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Cubic	TokenNameIdentifier	 Cubic
)	TokenNameRPAREN	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subdivides this Cubic curve into two curves at t = 0.5. * can be done with getSegment but this is more efficent. * @param c0 if non-null contains portion of curve from 0->.5 * @param c1 if non-null contains portion of curve from .5->1 */	TokenNameCOMMENT_JAVADOC	 Subdivides this Cubic curve into two curves at t = 0.5. can be done with getSegment but this is more efficent. @param c0 if non-null contains portion of curve from 0->.5 @param c1 if non-null contains portion of curve from .5->1 
public	TokenNamepublic	
void	TokenNamevoid	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
Cubic	TokenNameIdentifier	 Cubic
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
Cubic	TokenNameIdentifier	 Cubic
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
npX	TokenNameIdentifier	 np X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.125	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
npY	TokenNameIdentifier	 np Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.125	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
npdx	TokenNameIdentifier	 npdx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.125	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
npdy	TokenNameIdentifier	 npdy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.125	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
npX	TokenNameIdentifier	 np X
-	TokenNameMINUS	
npdx	TokenNameIdentifier	 npdx
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
npY	TokenNameIdentifier	 np Y
-	TokenNameMINUS	
npdy	TokenNameIdentifier	 npdy
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
npX	TokenNameIdentifier	 np X
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
npY	TokenNameIdentifier	 np Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
npX	TokenNameIdentifier	 np X
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
npY	TokenNameIdentifier	 np Y
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
npX	TokenNameIdentifier	 np X
+	TokenNamePLUS	
npdx	TokenNameIdentifier	 npdx
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
npY	TokenNameIdentifier	 np Y
+	TokenNamePLUS	
npdy	TokenNameIdentifier	 npdy
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Subdivides this Cubic curve into two curves at given t. * @param c0 if non-null contains portion of curve from 0->t. * @param c1 if non-null contains portion of curve from t->1. */	TokenNameCOMMENT_JAVADOC	 Subdivides this Cubic curve into two curves at given t. @param c0 if non-null contains portion of curve from 0->t. @param c1 if non-null contains portion of curve from t->1. 
public	TokenNamepublic	
void	TokenNamevoid	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Cubic	TokenNameIdentifier	 Cubic
c0	TokenNameIdentifier	 c0
,	TokenNameCOMMA	
Cubic	TokenNameIdentifier	 Cubic
c1	TokenNameIdentifier	 c1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
np	TokenNameIdentifier	 np
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
npd	TokenNameIdentifier	 npd
=	TokenNameEQUAL	
evalDt	TokenNameIdentifier	 eval Dt
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
(	TokenNameLPAREN	
npd	TokenNameIdentifier	 npd
.	TokenNameDOT	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
(	TokenNameLPAREN	
npd	TokenNameIdentifier	 npd
.	TokenNameDOT	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
c0	TokenNameIdentifier	 c0
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c1	TokenNameIdentifier	 c1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
(	TokenNameLPAREN	
npd	TokenNameIdentifier	 npd
.	TokenNameDOT	
x	TokenNameIdentifier	 x
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
(	TokenNameLPAREN	
npd	TokenNameIdentifier	 npd
.	TokenNameDOT	
y	TokenNameIdentifier	 y
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
-	TokenNameMINUS	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
c1	TokenNameIdentifier	 c1
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Segment	TokenNameIdentifier	 Segment
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
double	TokenNamedouble	
t0	TokenNameIdentifier	 t0
,	TokenNameCOMMA	
double	TokenNamedouble	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
dt	TokenNameIdentifier	 dt
=	TokenNameEQUAL	
t1	TokenNameIdentifier	 t1
-	TokenNameMINUS	
t0	TokenNameIdentifier	 t0
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
np1	TokenNameIdentifier	 np1
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t0	TokenNameIdentifier	 t0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
dp1	TokenNameIdentifier	 dp1
=	TokenNameEQUAL	
evalDt	TokenNameIdentifier	 eval Dt
(	TokenNameLPAREN	
t0	TokenNameIdentifier	 t0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
np2	TokenNameIdentifier	 np2
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
np1	TokenNameIdentifier	 np1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
dt	TokenNameIdentifier	 dt
*	TokenNameMULTIPLY	
dp1	TokenNameIdentifier	 dp1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
np1	TokenNameIdentifier	 np1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
dt	TokenNameIdentifier	 dt
*	TokenNameMULTIPLY	
dp1	TokenNameIdentifier	 dp1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
np4	TokenNameIdentifier	 np4
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
dp4	TokenNameIdentifier	 dp4
=	TokenNameEQUAL	
evalDt	TokenNameIdentifier	 eval Dt
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
np3	TokenNameIdentifier	 np3
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
np4	TokenNameIdentifier	 np4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
dt	TokenNameIdentifier	 dt
*	TokenNameMULTIPLY	
dp4	TokenNameIdentifier	 dp4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
np4	TokenNameIdentifier	 np4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
dt	TokenNameIdentifier	 dt
*	TokenNameMULTIPLY	
dp4	TokenNameIdentifier	 dp4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
/	TokenNameDIVIDE	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Cubic	TokenNameIdentifier	 Cubic
(	TokenNameLPAREN	
np1	TokenNameIdentifier	 np1
,	TokenNameCOMMA	
np2	TokenNameIdentifier	 np2
,	TokenNameCOMMA	
np3	TokenNameIdentifier	 np3
,	TokenNameCOMMA	
np4	TokenNameIdentifier	 np4
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
double	TokenNamedouble	
subLength	TokenNameIdentifier	 sub Length
(	TokenNameLPAREN	
double	TokenNamedouble	
leftLegLen	TokenNameIdentifier	 left Leg Len
,	TokenNameCOMMA	
double	TokenNamedouble	
rightLegLen	TokenNameIdentifier	 right Leg Len
,	TokenNameCOMMA	
double	TokenNamedouble	
maxErr	TokenNameIdentifier	 max Err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cldx	TokenNameIdentifier	 cldx
,	TokenNameCOMMA	
cldy	TokenNameIdentifier	 cldy
,	TokenNameCOMMA	
cdx	TokenNameIdentifier	 cdx
,	TokenNameCOMMA	
cdy	TokenNameIdentifier	 cdy
;	TokenNameSEMICOLON	
cldx	TokenNameIdentifier	 cldx
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
cldy	TokenNameIdentifier	 cldy
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
crossLegLen	TokenNameIdentifier	 cross Leg Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
cldx	TokenNameIdentifier	 cldx
*	TokenNameMULTIPLY	
cldx	TokenNameIdentifier	 cldx
+	TokenNamePLUS	
cldy	TokenNameIdentifier	 cldy
*	TokenNameMULTIPLY	
cldy	TokenNameIdentifier	 cldy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cdx	TokenNameIdentifier	 cdx
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
cdy	TokenNameIdentifier	 cdy
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cordLen	TokenNameIdentifier	 cord Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
cdx	TokenNameIdentifier	 cdx
*	TokenNameMULTIPLY	
cdx	TokenNameIdentifier	 cdx
+	TokenNamePLUS	
cdy	TokenNameIdentifier	 cdy
*	TokenNameMULTIPLY	
cdy	TokenNameIdentifier	 cdy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
hullLen	TokenNameIdentifier	 hull Len
=	TokenNameEQUAL	
leftLegLen	TokenNameIdentifier	 left Leg Len
+	TokenNamePLUS	
rightLegLen	TokenNameIdentifier	 right Leg Len
+	TokenNamePLUS	
crossLegLen	TokenNameIdentifier	 cross Leg Len
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hullLen	TokenNameIdentifier	 hull Len
<	TokenNameLESS	
maxErr	TokenNameIdentifier	 max Err
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
hullLen	TokenNameIdentifier	 hull Len
+	TokenNamePLUS	
cordLen	TokenNameIdentifier	 cord Len
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
err	TokenNameIdentifier	 err
=	TokenNameEQUAL	
(	TokenNameLPAREN	
hullLen	TokenNameIdentifier	 hull Len
-	TokenNameMINUS	
cordLen	TokenNameIdentifier	 cord Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
err	TokenNameIdentifier	 err
<	TokenNameLESS	
maxErr	TokenNameIdentifier	 max Err
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
hullLen	TokenNameIdentifier	 hull Len
+	TokenNamePLUS	
cordLen	TokenNameIdentifier	 cord Len
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Cubic	TokenNameIdentifier	 Cubic
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
new	TokenNamenew	
Cubic	TokenNameIdentifier	 Cubic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
npX	TokenNameIdentifier	 np X
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
+	TokenNamePLUS	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.125	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
npY	TokenNameIdentifier	 np Y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
3	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
+	TokenNamePLUS	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
0.125	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
npdx	TokenNameIdentifier	 npdx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
cldx	TokenNameIdentifier	 cldx
+	TokenNamePLUS	
cdx	TokenNameIdentifier	 cdx
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.125	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
npdy	TokenNameIdentifier	 npdy
=	TokenNameEQUAL	
(	TokenNameLPAREN	
cldy	TokenNameIdentifier	 cldy
+	TokenNamePLUS	
cdy	TokenNameIdentifier	 cdy
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.125	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
npX	TokenNameIdentifier	 np X
-	TokenNameMINUS	
npdx	TokenNameIdentifier	 npdx
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
npY	TokenNameIdentifier	 np Y
-	TokenNameMINUS	
npdy	TokenNameIdentifier	 npdy
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
npX	TokenNameIdentifier	 np X
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
npY	TokenNameIdentifier	 np Y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
midLen	TokenNameIdentifier	 mid Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
npdx	TokenNameIdentifier	 npdx
*	TokenNameMULTIPLY	
npdx	TokenNameIdentifier	 npdx
+	TokenNamePLUS	
npdy	TokenNameIdentifier	 npdy
*	TokenNameMULTIPLY	
npdy	TokenNameIdentifier	 npdy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
subLength	TokenNameIdentifier	 sub Length
(	TokenNameLPAREN	
leftLegLen	TokenNameIdentifier	 left Leg Len
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
midLen	TokenNameIdentifier	 mid Len
,	TokenNameCOMMA	
maxErr	TokenNameIdentifier	 max Err
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
npX	TokenNameIdentifier	 np X
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
npY	TokenNameIdentifier	 np Y
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
npX	TokenNameIdentifier	 np X
+	TokenNamePLUS	
npdx	TokenNameIdentifier	 npdx
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
npY	TokenNameIdentifier	 np Y
+	TokenNamePLUS	
npdy	TokenNameIdentifier	 npdy
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
+=	TokenNamePLUS_EQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
subLength	TokenNameIdentifier	 sub Length
(	TokenNameLPAREN	
midLen	TokenNameIdentifier	 mid Len
,	TokenNameCOMMA	
rightLegLen	TokenNameIdentifier	 right Leg Len
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
maxErr	TokenNameIdentifier	 max Err
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
0.000001	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
double	TokenNamedouble	
maxErr	TokenNameIdentifier	 max Err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
,	TokenNameCOMMA	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
leftLegLen	TokenNameIdentifier	 left Leg Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
rightLegLen	TokenNameIdentifier	 right Leg Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
crossLegLen	TokenNameIdentifier	 cross Leg Len
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sqrt	TokenNameIdentifier	 sqrt
(	TokenNameLPAREN	
dx	TokenNameIdentifier	 dx
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
eps	TokenNameIdentifier	 eps
=	TokenNameEQUAL	
maxErr	TokenNameIdentifier	 max Err
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
leftLegLen	TokenNameIdentifier	 left Leg Len
+	TokenNamePLUS	
rightLegLen	TokenNameIdentifier	 right Leg Len
+	TokenNamePLUS	
crossLegLen	TokenNameIdentifier	 cross Leg Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
subLength	TokenNameIdentifier	 sub Length
(	TokenNameLPAREN	
leftLegLen	TokenNameIdentifier	 left Leg Len
,	TokenNameCOMMA	
rightLegLen	TokenNameIdentifier	 right Leg Len
,	TokenNameCOMMA	
eps	TokenNameIdentifier	 eps
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"M"	TokenNameStringLiteral	M
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
'C'	TokenNameCharacterLiteral	
+	TokenNamePLUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
' '	TokenNameCharacterLiteral	
+	TokenNamePLUS	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
','	TokenNameCharacterLiteral	
+	TokenNamePLUS	
p4	TokenNameIdentifier	 p4
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public static boolean epsEq(double a, double b) { final double eps = 0.000001; return (((a + eps) > b) && ((a-eps) < b)); } public static void sub(Cubic orig, Cubic curr, double t, double inc, int lev) { Cubic left=new Cubic(); Cubic right=new Cubic(); curr.subdivide(left, right); Point2D.Double ptl = left.eval(.5); Point2D.Double ptr = right.eval(.5); Point2D.Double pt1 = orig.eval(t-inc); Point2D.Double pt2 = orig.eval(t+inc); int steps = 100; Point2D.Double l, r, o; for (int i=0; i<=steps; i++) { l = left.eval(i/(double)steps); o = orig.eval(t-(2*inc)*(1-i/(double)steps)); if (!epsEq(l.x, o.x) || !epsEq(l.y, o.y)) System.err.println("Lf Pt: [" + l.x + "," + l.y + "] Orig: [" + o.x + "," + o.y +"]"); r = right.eval(i/(double)steps); o = orig.eval(t+(2*inc*i/(double)steps)); if (!epsEq(r.x, o.x) || !epsEq(r.y, o.y)) System.err.println("Rt Pt: [" + r.x + "," + r.y + "] Orig: [" + o.x + "," + o.y +"]"); } if (lev != 0) { sub(orig, left, t-inc, inc/2, lev-1); sub(orig, right, t+inc, inc/2, lev-1); } } public static void evalCubic(Cubic c) { int steps = 1000000; Point2D.Double oldP = c.eval(0); Point2D.Double newP; double len = 0; for (int i=1; i<=steps; i++) { newP = c.eval(i/(double)steps); double dx = newP.x-oldP.x; double dy = newP.y-oldP.y; len += Math.sqrt(dx*dx + dy*dy); oldP = newP; } System.err.println("Length(.1): " + c.getLength(.001) + " x " + count); count = 0; System.err.println("Length : " + c.getLength() + " x " + count); count = 0; System.err.println("D Len : " + len); } public static void main(String args[]) { Cubic c; c = new Cubic(0,0, 10,10, 20,-10, 30,0); sub(c, c, .5, .25, 3); evalCubic(c); c = new Cubic(0,0, 1,0, 2,-1, 3,0); sub(c, c, .5, .25, 3); evalCubic(c); } */	TokenNameCOMMENT_BLOCK	 public static boolean epsEq(double a, double b) { final double eps = 0.000001; return (((a + eps) > b) && ((a-eps) < b)); } public static void sub(Cubic orig, Cubic curr, double t, double inc, int lev) { Cubic left=new Cubic(); Cubic right=new Cubic(); curr.subdivide(left, right); Point2D.Double ptl = left.eval(.5); Point2D.Double ptr = right.eval(.5); Point2D.Double pt1 = orig.eval(t-inc); Point2D.Double pt2 = orig.eval(t+inc); int steps = 100; Point2D.Double l, r, o; for (int i=0; i<=steps; i++) { l = left.eval(i/(double)steps); o = orig.eval(t-(2*inc)*(1-i/(double)steps)); if (!epsEq(l.x, o.x) || !epsEq(l.y, o.y)) System.err.println("Lf Pt: [" + l.x + "," + l.y + "] Orig: [" + o.x + "," + o.y +"]"); r = right.eval(i/(double)steps); o = orig.eval(t+(2*inc*i/(double)steps)); if (!epsEq(r.x, o.x) || !epsEq(r.y, o.y)) System.err.println("Rt Pt: [" + r.x + "," + r.y + "] Orig: [" + o.x + "," + o.y +"]"); } if (lev != 0) { sub(orig, left, t-inc, inc/2, lev-1); sub(orig, right, t+inc, inc/2, lev-1); } } public static void evalCubic(Cubic c) { int steps = 1000000; Point2D.Double oldP = c.eval(0); Point2D.Double newP; double len = 0; for (int i=1; i<=steps; i++) { newP = c.eval(i/(double)steps); double dx = newP.x-oldP.x; double dy = newP.y-oldP.y; len += Math.sqrt(dx*dx + dy*dy); oldP = newP; } System.err.println("Length(.1): " + c.getLength(.001) + " x " + count); count = 0; System.err.println("Length : " + c.getLength() + " x " + count); count = 0; System.err.println("D Len : " + len); } public static void main(String args[]) { Cubic c; c = new Cubic(0,0, 10,10, 20,-10, 30,0); sub(c, c, .5, .25, 3); evalCubic(c); c = new Cubic(0,0, 1,0, 2,-1, 3,0); sub(c, c, .5, .25, 3); evalCubic(c); } 
}	TokenNameRBRACE	
