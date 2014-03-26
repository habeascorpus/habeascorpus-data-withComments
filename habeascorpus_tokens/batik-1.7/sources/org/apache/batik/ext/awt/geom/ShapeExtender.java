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
Rectangle	TokenNameIdentifier	 Rectangle
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Shape	TokenNameIdentifier	 Shape
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
AffineTransform	TokenNameIdentifier	 Affine Transform
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
geom	TokenNameIdentifier	 geom
.	TokenNameDOT	
PathIterator	TokenNameIdentifier	 Path Iterator
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
/** * This class wraps a normal path into an extended path. * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: ShapeExtender.java 475477 2006-11-15 22:44:28Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class wraps a normal path into an extended path. @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: ShapeExtender.java 475477 2006-11-15 22:44:28Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
ShapeExtender	TokenNameIdentifier	 Shape Extender
implements	TokenNameimplements	
ExtendedShape	TokenNameIdentifier	 Extended Shape
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
public	TokenNamepublic	
ShapeExtender	TokenNameIdentifier	 Shape Extender
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
shape	TokenNameIdentifier	 shape
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
shape	TokenNameIdentifier	 shape
=	TokenNameEQUAL	
shape	TokenNameIdentifier	 shape
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
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
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Point2D	TokenNameIdentifier	 Point2 D
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PathIterator	TokenNameIdentifier	 Path Iterator
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
PathIterator	TokenNameIdentifier	 Path Iterator
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
AffineTransform	TokenNameIdentifier	 Affine Transform
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
double	TokenNamedouble	
flatness	TokenNameIdentifier	 flatness
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
at	TokenNameIdentifier	 at
,	TokenNameCOMMA	
flatness	TokenNameIdentifier	 flatness
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
getExtendedPathIterator	TokenNameIdentifier	 get Extended Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EPIWrap	TokenNameIdentifier	 EPI Wrap
(	TokenNameLPAREN	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
w	TokenNameIdentifier	 w
,	TokenNameCOMMA	
double	TokenNamedouble	
h	TokenNameIdentifier	 h
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
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
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
shape	TokenNameIdentifier	 shape
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
EPIWrap	TokenNameIdentifier	 EPI Wrap
implements	TokenNameimplements	
ExtendedPathIterator	TokenNameIdentifier	 Extended Path Iterator
{	TokenNameLBRACE	
PathIterator	TokenNameIdentifier	 Path Iterator
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
EPIWrap	TokenNameIdentifier	 EPI Wrap
(	TokenNameLPAREN	
PathIterator	TokenNameIdentifier	 Path Iterator
pi	TokenNameIdentifier	 pi
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
