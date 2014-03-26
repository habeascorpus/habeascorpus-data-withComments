/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
spatial	TokenNameIdentifier	 spatial
.	TokenNameDOT	
geometry	TokenNameIdentifier	 geometry
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
/** * Rectangle shape. * * <p><font color="red"><b>NOTE:</b> This API is still in * flux and might change in incompatible ways in the next * release.</font> */	TokenNameCOMMENT_JAVADOC	 Rectangle shape. * <p><font color="red"><b>NOTE:</b> This API is still in flux and might change in incompatible ways in the next release.</font> 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
class	TokenNameclass	
Rectangle	TokenNameIdentifier	 Rectangle
implements	TokenNameimplements	
Geometry2D	TokenNameIdentifier	 Geometry2 D
{	TokenNameLBRACE	
private	TokenNameprivate	
Point2D	TokenNameIdentifier	 Point2 D
ptMin	TokenNameIdentifier	 pt Min
,	TokenNameCOMMA	
ptMax	TokenNameIdentifier	 pt Max
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ptMin	TokenNameIdentifier	 pt Min
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ptMax	TokenNameIdentifier	 pt Max
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
ptMin	TokenNameIdentifier	 pt Min
,	TokenNameCOMMA	
Point2D	TokenNameIdentifier	 Point2 D
ptMax	TokenNameIdentifier	 pt Max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ptMin	TokenNameIdentifier	 pt Min
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
ptMin	TokenNameIdentifier	 pt Min
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ptMax	TokenNameIdentifier	 pt Max
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
ptMax	TokenNameIdentifier	 pt Max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
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
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
ptMin	TokenNameIdentifier	 pt Min
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
ptMax	TokenNameIdentifier	 pt Max
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
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
this	TokenNamethis	
.	TokenNameDOT	
ptMin	TokenNameIdentifier	 pt Min
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ptMax	TokenNameIdentifier	 pt Max
=	TokenNameEQUAL	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
,	TokenNameCOMMA	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
,	TokenNameCOMMA	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
y1	TokenNameIdentifier	 y1
,	TokenNameCOMMA	
y2	TokenNameIdentifier	 y2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
area	TokenNameIdentifier	 area
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
(	TokenNameLPAREN	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
centroid	TokenNameIdentifier	 centroid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
p	TokenNameIdentifier	 p
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<=	TokenNameLESS_EQUAL	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
translate	TokenNameIdentifier	 translate
(	TokenNameLPAREN	
Vector2D	TokenNameIdentifier	 Vector2 D
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Point2D	TokenNameIdentifier	 Point2 D
MinPt	TokenNameIdentifier	 Min Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ptMin	TokenNameIdentifier	 pt Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Point2D	TokenNameIdentifier	 Point2 D
MaxPt	TokenNameIdentifier	 Max Pt
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ptMax	TokenNameIdentifier	 pt Max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IntersectCase	TokenNameIdentifier	 Intersect Case
intersect	TokenNameIdentifier	 intersect
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// TODO 	TokenNameCOMMENT_LINE	TODO 
}	TokenNameRBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getMaxPoint	TokenNameIdentifier	 get Max Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ptMax	TokenNameIdentifier	 pt Max
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
getMinPoint	TokenNameIdentifier	 get Min Point
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ptMin	TokenNameIdentifier	 pt Min
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
prime	TokenNameIdentifier	 prime
=	TokenNameEQUAL	
31	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ptMax	TokenNameIdentifier	 pt Max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
prime	TokenNameIdentifier	 prime
*	TokenNameMULTIPLY	
result	TokenNameIdentifier	 result
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ptMin	TokenNameIdentifier	 pt Min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ptMax	TokenNameIdentifier	 pt Max
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ptMax	TokenNameIdentifier	 pt Max
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ptMax	TokenNameIdentifier	 pt Max
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ptMax	TokenNameIdentifier	 pt Max
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ptMin	TokenNameIdentifier	 pt Min
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ptMin	TokenNameIdentifier	 pt Min
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ptMin	TokenNameIdentifier	 pt Min
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ptMin	TokenNameIdentifier	 pt Min
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
