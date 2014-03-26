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
/** * A class representing a quadratic path segment. * * @version $Id: Quadradic.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A class representing a quadratic path segment. * @version $Id: Quadradic.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Quadradic	TokenNameIdentifier	 Quadradic
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
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Quadradic	TokenNameIdentifier	 Quadradic
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
}	TokenNameRBRACE	
public	TokenNamepublic	
Quadradic	TokenNameIdentifier	 Quadradic
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
}	TokenNameRBRACE	
public	TokenNamepublic	
Quadradic	TokenNameIdentifier	 Quadradic
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
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Quadradic	TokenNameIdentifier	 Quadradic
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
Quadradic	TokenNameIdentifier	 Quadradic
(	TokenNameLPAREN	
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
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
minMax	TokenNameIdentifier	 min Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p3	TokenNameIdentifier	 p3
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
p3	TokenNameIdentifier	 p3
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
minMax	TokenNameIdentifier	 min Max
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
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
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
b	TokenNameIdentifier	 b
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
/	TokenNameDIVIDE	
a	TokenNameIdentifier	 a
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
return	TokenNamereturn	
;	TokenNameSEMICOLON	
tv	TokenNameIdentifier	 tv
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tv	TokenNameIdentifier	 tv
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
tv	TokenNameIdentifier	 tv
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
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
2	TokenNameIntegerLiteral	
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
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
QuadCurve2D	TokenNameIdentifier	 Quad Curve2 D
.	TokenNameDOT	
solveQuadratic	TokenNameIdentifier	 solve Quadratic
(	TokenNameLPAREN	
eqn	TokenNameIdentifier	 eqn
,	TokenNameCOMMA	
roots	TokenNameIdentifier	 roots
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return solveQuad(eqn[2], eqn[1], eqn[0], roots); 	TokenNameCOMMENT_LINE	return solveQuad(eqn[2], eqn[1], eqn[0], roots); 
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
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
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
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
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
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
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
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
t	TokenNameIdentifier	 t
+	TokenNamePLUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
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
.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
dt	TokenNameIdentifier	 dt
*	TokenNameMULTIPLY	
dp1	TokenNameIdentifier	 dp1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
np1	TokenNameIdentifier	 np1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
.5	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
dt	TokenNameIdentifier	 dt
*	TokenNameMULTIPLY	
dp1	TokenNameIdentifier	 dp1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
np3	TokenNameIdentifier	 np3
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Quadradic	TokenNameIdentifier	 Quadradic
(	TokenNameLPAREN	
np1	TokenNameIdentifier	 np1
,	TokenNameCOMMA	
np2	TokenNameIdentifier	 np2
,	TokenNameCOMMA	
np3	TokenNameIdentifier	 np3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subdivides this Quadradic curve into two curves at t = 0.5. * can be done with getSegment but this is more efficent. * @param q0 if non-null contains portion of curve from 0->.5 * @param q1 if non-null contains portion of curve from .5->1 */	TokenNameCOMMENT_JAVADOC	 Subdivides this Quadradic curve into two curves at t = 0.5. can be done with getSegment but this is more efficent. @param q0 if non-null contains portion of curve from 0->.5 @param q1 if non-null contains portion of curve from .5->1 
public	TokenNamepublic	
void	TokenNamevoid	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
Quadradic	TokenNameIdentifier	 Quadradic
q0	TokenNameIdentifier	 q0
,	TokenNameCOMMA	
Quadradic	TokenNameIdentifier	 Quadradic
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
q0	TokenNameIdentifier	 q0
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.25	TokenNameDoubleLiteral	
+	TokenNamePLUS	
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
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
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
*	TokenNameMULTIPLY	
.25	TokenNameDoubleLiteral	
+	TokenNamePLUS	
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
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.25	TokenNameDoubleLiteral	
+	TokenNamePLUS	
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
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
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
*	TokenNameMULTIPLY	
.25	TokenNameDoubleLiteral	
+	TokenNamePLUS	
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
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
q0	TokenNameIdentifier	 q0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
q1	TokenNameIdentifier	 q1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Subdivides this Quadradic curve into two curves at given t. * @param q0 if non-null contains portion of curve from 0->t. * @param q1 if non-null contains portion of curve from t->1. */	TokenNameCOMMENT_JAVADOC	 Subdivides this Quadradic curve into two curves at given t. @param q0 if non-null contains portion of curve from 0->t. @param q1 if non-null contains portion of curve from t->1. 
public	TokenNamepublic	
void	TokenNamevoid	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Quadradic	TokenNameIdentifier	 Quadradic
q0	TokenNameIdentifier	 q0
,	TokenNameCOMMA	
Quadradic	TokenNameIdentifier	 Quadradic
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
q0	TokenNameIdentifier	 q0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
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
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
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
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q0	TokenNameIdentifier	 q0
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
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
q1	TokenNameIdentifier	 q1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
np	TokenNameIdentifier	 np
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
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
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
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
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q1	TokenNameIdentifier	 q1
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Subdivides this Quadradic curve into two curves at t = 0.5. * can be done with getSegment but this is more efficent. * @param s0 if non-null contains portion of curve from 0->.5 * @param s1 if non-null contains portion of curve from .5->1 */	TokenNameCOMMENT_JAVADOC	 Subdivides this Quadradic curve into two curves at t = 0.5. can be done with getSegment but this is more efficent. @param s0 if non-null contains portion of curve from 0->.5 @param s1 if non-null contains portion of curve from .5->1 
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
Quadradic	TokenNameIdentifier	 Quadradic
q0	TokenNameIdentifier	 q0
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s0	TokenNameIdentifier	 s0
instanceof	TokenNameinstanceof	
Quadradic	TokenNameIdentifier	 Quadradic
)	TokenNameRPAREN	
q0	TokenNameIdentifier	 q0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Quadradic	TokenNameIdentifier	 Quadradic
)	TokenNameRPAREN	
s0	TokenNameIdentifier	 s0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
instanceof	TokenNameinstanceof	
Quadradic	TokenNameIdentifier	 Quadradic
)	TokenNameRPAREN	
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Quadradic	TokenNameIdentifier	 Quadradic
)	TokenNameRPAREN	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
q0	TokenNameIdentifier	 q0
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subdivides this Quadradic curve into two curves at t. * can be done with getSegment but this is more efficent. * @param s0 if non-null contains portion of curve from 0->.5 * @param s1 if non-null contains portion of curve from .5->1 */	TokenNameCOMMENT_JAVADOC	 Subdivides this Quadradic curve into two curves at t. can be done with getSegment but this is more efficent. @param s0 if non-null contains portion of curve from 0->.5 @param s1 if non-null contains portion of curve from .5->1 
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
Quadradic	TokenNameIdentifier	 Quadradic
q0	TokenNameIdentifier	 q0
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s0	TokenNameIdentifier	 s0
instanceof	TokenNameinstanceof	
Quadradic	TokenNameIdentifier	 Quadradic
)	TokenNameRPAREN	
q0	TokenNameIdentifier	 q0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Quadradic	TokenNameIdentifier	 Quadradic
)	TokenNameRPAREN	
s0	TokenNameIdentifier	 s0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
instanceof	TokenNameinstanceof	
Quadradic	TokenNameIdentifier	 Quadradic
)	TokenNameRPAREN	
q1	TokenNameIdentifier	 q1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Quadradic	TokenNameIdentifier	 Quadradic
)	TokenNameRPAREN	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
q0	TokenNameIdentifier	 q0
,	TokenNameCOMMA	
q1	TokenNameIdentifier	 q1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
dx	TokenNameIdentifier	 dx
,	TokenNameCOMMA	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
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
hullLen	TokenNameIdentifier	 hull Len
=	TokenNameEQUAL	
leftLegLen	TokenNameIdentifier	 left Leg Len
+	TokenNamePLUS	
rightLegLen	TokenNameIdentifier	 right Leg Len
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
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
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
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
Quadradic	TokenNameIdentifier	 Quadradic
q	TokenNameIdentifier	 q
=	TokenNameEQUAL	
new	TokenNamenew	
Quadradic	TokenNameIdentifier	 Quadradic
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.25	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
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
*	TokenNameMULTIPLY	
.25	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
dx	TokenNameIdentifier	 dx
=	TokenNameEQUAL	
.25	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
dy	TokenNameIdentifier	 dy
=	TokenNameEQUAL	
.25	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
double	TokenNamedouble	
midLen	TokenNameIdentifier	 mid Len
=	TokenNameEQUAL	
.25	TokenNameDoubleLiteral	
*	TokenNameMULTIPLY	
cordLen	TokenNameIdentifier	 cord Len
;	TokenNameSEMICOLON	
double	TokenNamedouble	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
subLength	TokenNameIdentifier	 sub Length
(	TokenNameLPAREN	
leftLegLen	TokenNameIdentifier	 left Leg Len
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
midLen	TokenNameIdentifier	 mid Len
,	TokenNameCOMMA	
maxErr	TokenNameIdentifier	 max Err
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
dx	TokenNameIdentifier	 dx
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
dy	TokenNameIdentifier	 dy
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p3	TokenNameIdentifier	 p3
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
len	TokenNameIdentifier	 len
+=	TokenNamePLUS_EQUAL	
q	TokenNameIdentifier	 q
.	TokenNameDOT	
subLength	TokenNameIdentifier	 sub Length
(	TokenNameLPAREN	
midLen	TokenNameIdentifier	 mid Len
,	TokenNameCOMMA	
rightLegLen	TokenNameIdentifier	 right Leg Len
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
,	TokenNameCOMMA	
maxErr	TokenNameIdentifier	 max Err
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
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
double	TokenNamedouble	
eps	TokenNameIdentifier	 eps
=	TokenNameEQUAL	
maxErr	TokenNameIdentifier	 max Err
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
leftLegLen	TokenNameIdentifier	 left Leg Len
+	TokenNamePLUS	
rightLegLen	TokenNameIdentifier	 right Leg Len
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
'Q'	TokenNameCharacterLiteral	
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public static boolean epsEq(double a, double b) { final double eps = 0.00001; return (((a + eps) > b) && ((a-eps) < b)); } public static void sub(Quadradic orig, Quadradic curr, double t, double inc, int lev) { Quadradic left=new Quadradic(); Quadradic right=new Quadradic(); curr.subdivide(left, right); Point2D.Double ptl = left.eval(.5); Point2D.Double ptr = right.eval(.5); Point2D.Double pt1 = orig.eval(t-inc); Point2D.Double pt2 = orig.eval(t+inc); int steps = 100; Point2D.Double l, r, o; for (int i=0; i<=steps; i++) { l = left.eval(i/(double)steps); o = orig.eval(t-(2*inc)*(1-i/(double)steps)); if (!epsEq(l.x, o.x) || !epsEq(l.y, o.y)) System.err.println("Lf Pt: [" + l.x + "," + l.y + "] Orig: [" + o.x + "," + o.y +"]"); r = right.eval(i/(double)steps); o = orig.eval(t+(2*inc*i/(double)steps)); if (!epsEq(r.x, o.x) || !epsEq(r.y, o.y)) System.err.println("Rt Pt: [" + r.x + "," + r.y + "] Orig: [" + o.x + "," + o.y +"]"); } if (lev != 0) { sub(orig, left, t-inc, inc/2, lev-1); sub(orig, right, t+inc, inc/2, lev-1); } } public static void evalQuad(Quadradic q) { int steps = 1000000; Point2D.Double oldP = q.eval(0); Point2D.Double newP; double len = 0; for (int i=1; i<=steps; i++) { newP = q.eval(i/(double)steps); double dx = newP.x-oldP.x; double dy = newP.y-oldP.y; len += Math.sqrt(dx*dx + dy*dy); oldP = newP; } System.err.println("Length(.1): " + q.getLength(.001) + " x " + count); count = 0; System.err.println("Length : " + q.getLength() + " x " + count); count = 0; System.err.println("D Len : " + len); } public static void main(String args[]) { Quadradic q; q = new Quadradic(0,0, 10,10, 30,0); sub(q, q, .5, .25, 3); evalQuad(q); q = new Quadradic(0,0, 1,2, 3,0); sub(q, q, .5, .25, 3); evalQuad(q); } */	TokenNameCOMMENT_BLOCK	 public static boolean epsEq(double a, double b) { final double eps = 0.00001; return (((a + eps) > b) && ((a-eps) < b)); } public static void sub(Quadradic orig, Quadradic curr, double t, double inc, int lev) { Quadradic left=new Quadradic(); Quadradic right=new Quadradic(); curr.subdivide(left, right); Point2D.Double ptl = left.eval(.5); Point2D.Double ptr = right.eval(.5); Point2D.Double pt1 = orig.eval(t-inc); Point2D.Double pt2 = orig.eval(t+inc); int steps = 100; Point2D.Double l, r, o; for (int i=0; i<=steps; i++) { l = left.eval(i/(double)steps); o = orig.eval(t-(2*inc)*(1-i/(double)steps)); if (!epsEq(l.x, o.x) || !epsEq(l.y, o.y)) System.err.println("Lf Pt: [" + l.x + "," + l.y + "] Orig: [" + o.x + "," + o.y +"]"); r = right.eval(i/(double)steps); o = orig.eval(t+(2*inc*i/(double)steps)); if (!epsEq(r.x, o.x) || !epsEq(r.y, o.y)) System.err.println("Rt Pt: [" + r.x + "," + r.y + "] Orig: [" + o.x + "," + o.y +"]"); } if (lev != 0) { sub(orig, left, t-inc, inc/2, lev-1); sub(orig, right, t+inc, inc/2, lev-1); } } public static void evalQuad(Quadradic q) { int steps = 1000000; Point2D.Double oldP = q.eval(0); Point2D.Double newP; double len = 0; for (int i=1; i<=steps; i++) { newP = q.eval(i/(double)steps); double dx = newP.x-oldP.x; double dy = newP.y-oldP.y; len += Math.sqrt(dx*dx + dy*dy); oldP = newP; } System.err.println("Length(.1): " + q.getLength(.001) + " x " + count); count = 0; System.err.println("Length : " + q.getLength() + " x " + count); count = 0; System.err.println("D Len : " + len); } public static void main(String args[]) { Quadradic q; q = new Quadradic(0,0, 10,10, 30,0); sub(q, q, .5, .25, 3); evalQuad(q); q = new Quadradic(0,0, 1,2, 3,0); sub(q, q, .5, .25, 3); evalQuad(q); } 
}	TokenNameRBRACE	
