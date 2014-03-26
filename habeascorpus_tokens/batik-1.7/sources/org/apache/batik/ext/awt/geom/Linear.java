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
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
/** * A class representing a linear path segment. * * @version $Id: Linear.java 478249 2006-11-22 17:29:37Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A class representing a linear path segment. * @version $Id: Linear.java 478249 2006-11-22 17:29:37Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
Linear	TokenNameIdentifier	 Linear
implements	TokenNameimplements	
Segment	TokenNameIdentifier	 Segment
{	TokenNameLBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Linear	TokenNameIdentifier	 Linear
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
}	TokenNameRBRACE	
public	TokenNamepublic	
Linear	TokenNameIdentifier	 Linear
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
}	TokenNameRBRACE	
public	TokenNamepublic	
Linear	TokenNameIdentifier	 Linear
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
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Linear	TokenNameIdentifier	 Linear
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
Linear	TokenNameIdentifier	 Linear
(	TokenNameLPAREN	
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
public	TokenNamepublic	
double	TokenNamedouble	
minX	TokenNameIdentifier	 min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
return	TokenNamereturn	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
maxX	TokenNameIdentifier	 max X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
return	TokenNamereturn	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
minY	TokenNameIdentifier	 min Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
return	TokenNamereturn	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
maxY	TokenNameIdentifier	 max Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
>	TokenNameGREATER	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
return	TokenNamereturn	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
w	TokenNameIdentifier	 w
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
h	TokenNameIdentifier	 h
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
.	TokenNameDOT	
Double	TokenNameIdentifier	 Double
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
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
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
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
Segment	TokenNameIdentifier	 Segment
.	TokenNameDOT	
SplitResults	TokenNameIdentifier	 Split Results
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<=	TokenNameLESS_EQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<=	TokenNameLESS_EQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
>=	TokenNameGREATER_EQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
>=	TokenNameGREATER_EQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// This should be checked for numerical stability. So you 	TokenNameCOMMENT_LINE	This should be checked for numerical stability. So you 
// need to ensure that p2.y-p1.y retains enough bits to be 	TokenNameCOMMENT_LINE	need to ensure that p2.y-p1.y retains enough bits to be 
// useful. 	TokenNameCOMMENT_LINE	useful. 
double	TokenNamedouble	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
-	TokenNameMINUS	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
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
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t0	TokenNameIdentifier	 t0
=	TokenNameEQUAL	
{	TokenNameLBRACE	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
Segment	TokenNameIdentifier	 Segment
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
{	TokenNameLBRACE	
getSegment	TokenNameIdentifier	 get Segment
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
.	TokenNameDOT	
SplitResults	TokenNameIdentifier	 Split Results
(	TokenNameLPAREN	
t0	TokenNameIdentifier	 t0
,	TokenNameCOMMA	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Segment	TokenNameIdentifier	 Segment
.	TokenNameDOT	
SplitResults	TokenNameIdentifier	 Split Results
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
,	TokenNameCOMMA	
t0	TokenNameIdentifier	 t0
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
np2	TokenNameIdentifier	 np2
=	TokenNameEQUAL	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Linear	TokenNameIdentifier	 Linear
(	TokenNameLPAREN	
np1	TokenNameIdentifier	 np1
,	TokenNameCOMMA	
np2	TokenNameIdentifier	 np2
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
new	TokenNamenew	
Linear	TokenNameIdentifier	 Linear
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
,	TokenNameCOMMA	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
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
new	TokenNamenew	
Linear	TokenNameIdentifier	 Linear
(	TokenNameLPAREN	
eval	TokenNameIdentifier	 eval
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
,	TokenNameCOMMA	
p2	TokenNameIdentifier	 p2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subdivides this Linear segment into two segments at t = 0.5. * can be done with getSegment but this is more efficent. * @param s0 if non-null contains portion of curve from 0->.5 * @param s1 if non-null contains portion of curve from .5->1 */	TokenNameCOMMENT_JAVADOC	 Subdivides this Linear segment into two segments at t = 0.5. can be done with getSegment but this is more efficent. @param s0 if non-null contains portion of curve from 0->.5 @param s1 if non-null contains portion of curve from .5->1 
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
Linear	TokenNameIdentifier	 Linear
l0	TokenNameIdentifier	 l0
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
l1	TokenNameIdentifier	 l1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s0	TokenNameIdentifier	 s0
instanceof	TokenNameinstanceof	
Linear	TokenNameIdentifier	 Linear
)	TokenNameRPAREN	
l0	TokenNameIdentifier	 l0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Linear	TokenNameIdentifier	 Linear
)	TokenNameRPAREN	
s0	TokenNameIdentifier	 s0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
instanceof	TokenNameinstanceof	
Linear	TokenNameIdentifier	 Linear
)	TokenNameRPAREN	
l1	TokenNameIdentifier	 l1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Linear	TokenNameIdentifier	 Linear
)	TokenNameRPAREN	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
l0	TokenNameIdentifier	 l0
,	TokenNameCOMMA	
l1	TokenNameIdentifier	 l1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subdivides this Linear segment into two segments at given t. * @param s0 if non-null contains portion of curve from 0->t. * @param s1 if non-null contains portion of curve from t->1. */	TokenNameCOMMENT_JAVADOC	 Subdivides this Linear segment into two segments at given t. @param s0 if non-null contains portion of curve from 0->t. @param s1 if non-null contains portion of curve from t->1. 
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
Linear	TokenNameIdentifier	 Linear
l0	TokenNameIdentifier	 l0
=	TokenNameEQUAL	
null	TokenNamenull	
,	TokenNameCOMMA	
l1	TokenNameIdentifier	 l1
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s0	TokenNameIdentifier	 s0
instanceof	TokenNameinstanceof	
Linear	TokenNameIdentifier	 Linear
)	TokenNameRPAREN	
l0	TokenNameIdentifier	 l0
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Linear	TokenNameIdentifier	 Linear
)	TokenNameRPAREN	
s0	TokenNameIdentifier	 s0
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s1	TokenNameIdentifier	 s1
instanceof	TokenNameinstanceof	
Linear	TokenNameIdentifier	 Linear
)	TokenNameRPAREN	
l1	TokenNameIdentifier	 l1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Linear	TokenNameIdentifier	 Linear
)	TokenNameRPAREN	
s1	TokenNameIdentifier	 s1
;	TokenNameSEMICOLON	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
l0	TokenNameIdentifier	 l0
,	TokenNameCOMMA	
l1	TokenNameIdentifier	 l1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Subdivides this Cubic curve into two curves at t = 0.5. * Can be done with getSegment but this is more efficent. * @param l0 if non-null contains portion of curve from 0->.5 * @param l1 if non-null contains portion of curve from .5->1 */	TokenNameCOMMENT_JAVADOC	 Subdivides this Cubic curve into two curves at t = 0.5. Can be done with getSegment but this is more efficent. @param l0 if non-null contains portion of curve from 0->.5 @param l1 if non-null contains portion of curve from .5->1 
public	TokenNamepublic	
void	TokenNamevoid	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
Linear	TokenNameIdentifier	 Linear
l0	TokenNameIdentifier	 l0
,	TokenNameCOMMA	
Linear	TokenNameIdentifier	 Linear
l1	TokenNameIdentifier	 l1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
l0	TokenNameIdentifier	 l0
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
l1	TokenNameIdentifier	 l1
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
+	TokenNamePLUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
(	TokenNameLPAREN	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
.5	TokenNameDoubleLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l0	TokenNameIdentifier	 l0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l0	TokenNameIdentifier	 l0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
l0	TokenNameIdentifier	 l0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
l0	TokenNameIdentifier	 l0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
l0	TokenNameIdentifier	 l0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
l1	TokenNameIdentifier	 l1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Subdivides this Cubic curve into two curves. * Can be done with getSegment but this is more efficent. * @param t position to split the curve * @param l0 if non-null contains portion of curve from 0->t * @param l1 if non-null contains portion of curve from t->1 */	TokenNameCOMMENT_JAVADOC	 Subdivides this Cubic curve into two curves. Can be done with getSegment but this is more efficent. @param t position to split the curve @param l0 if non-null contains portion of curve from 0->t @param l1 if non-null contains portion of curve from t->1 
public	TokenNamepublic	
void	TokenNamevoid	
subdivide	TokenNameIdentifier	 subdivide
(	TokenNameLPAREN	
double	TokenNamedouble	
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Linear	TokenNameIdentifier	 Linear
l0	TokenNameIdentifier	 l0
,	TokenNameCOMMA	
Linear	TokenNameIdentifier	 Linear
l1	TokenNameIdentifier	 l1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
l0	TokenNameIdentifier	 l0
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
l1	TokenNameIdentifier	 l1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
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
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
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
if	TokenNameif	
(	TokenNameLPAREN	
l0	TokenNameIdentifier	 l0
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l0	TokenNameIdentifier	 l0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
l0	TokenNameIdentifier	 l0
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
l0	TokenNameIdentifier	 l0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
l0	TokenNameIdentifier	 l0
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
l1	TokenNameIdentifier	 l1
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
p1	TokenNameIdentifier	 p1
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
l1	TokenNameIdentifier	 l1
.	TokenNameDOT	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
p2	TokenNameIdentifier	 p2
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
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
double	TokenNamedouble	
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
return	TokenNamereturn	
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
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
double	TokenNamedouble	
maxErr	TokenNameIdentifier	 max Err
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
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
'L'	TokenNameCharacterLiteral	
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* public static boolean epsEq(double a, double b) { final double eps = 0.000001; return (((a + eps) > b) && ((a-eps) < b)); } public static void sub(Linear orig, Linear curr, double t, double inc, int lev) { Linear left=new Linear(); Linear right=new Linear(); curr.subdivide(left, right); Point2D.Double ptl = left.eval(.5); Point2D.Double ptr = right.eval(.5); Point2D.Double pt1 = orig.eval(t-inc); Point2D.Double pt2 = orig.eval(t+inc); int steps = 100; Point2D.Double l, r, o; for (int i=0; i<=steps; i++) { l = left.eval(i/(double)steps); o = orig.eval(t-(2*inc)*(1-i/(double)steps)); if (!epsEq(l.x, o.x) || !epsEq(l.y, o.y)) System.err.println("Lf Pt: [" + l.x + "," + l.y + "] Orig: [" + o.x + "," + o.y +"]"); r = right.eval(i/(double)steps); o = orig.eval(t+(2*inc*i/(double)steps)); if (!epsEq(r.x, o.x) || !epsEq(r.y, o.y)) System.err.println("Rt Pt: [" + r.x + "," + r.y + "] Orig: [" + o.x + "," + o.y +"]"); } if (lev != 0) { sub(orig, left, t-inc, inc/2, lev-1); sub(orig, right, t+inc, inc/2, lev-1); } } public static void eval(Linear l) { System.err.println("Length : " + l.getLength()); } public static void main(String args[]) { Linear l; l = new Linear(0,0, 30,0); sub(l, l, .5, .25, 3); eval(l); l = new Linear(0,0, 0,30); sub(l, l, .5, .25, 3); eval(l); l = new Linear(0,0, 20,30); sub(l, l, .5, .25, 3); eval(l); } */	TokenNameCOMMENT_BLOCK	 public static boolean epsEq(double a, double b) { final double eps = 0.000001; return (((a + eps) > b) && ((a-eps) < b)); } public static void sub(Linear orig, Linear curr, double t, double inc, int lev) { Linear left=new Linear(); Linear right=new Linear(); curr.subdivide(left, right); Point2D.Double ptl = left.eval(.5); Point2D.Double ptr = right.eval(.5); Point2D.Double pt1 = orig.eval(t-inc); Point2D.Double pt2 = orig.eval(t+inc); int steps = 100; Point2D.Double l, r, o; for (int i=0; i<=steps; i++) { l = left.eval(i/(double)steps); o = orig.eval(t-(2*inc)*(1-i/(double)steps)); if (!epsEq(l.x, o.x) || !epsEq(l.y, o.y)) System.err.println("Lf Pt: [" + l.x + "," + l.y + "] Orig: [" + o.x + "," + o.y +"]"); r = right.eval(i/(double)steps); o = orig.eval(t+(2*inc*i/(double)steps)); if (!epsEq(r.x, o.x) || !epsEq(r.y, o.y)) System.err.println("Rt Pt: [" + r.x + "," + r.y + "] Orig: [" + o.x + "," + o.y +"]"); } if (lev != 0) { sub(orig, left, t-inc, inc/2, lev-1); sub(orig, right, t+inc, inc/2, lev-1); } } public static void eval(Linear l) { System.err.println("Length : " + l.getLength()); } public static void main(String args[]) { Linear l; l = new Linear(0,0, 30,0); sub(l, l, .5, .25, 3); eval(l); l = new Linear(0,0, 0,30); sub(l, l, .5, .25, 3); eval(l); l = new Linear(0,0, 20,30); sub(l, l, .5, .25, 3); eval(l); } 
}	TokenNameRBRACE	
