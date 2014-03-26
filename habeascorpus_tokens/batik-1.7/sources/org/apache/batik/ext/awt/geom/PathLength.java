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
FlatteningPathIterator	TokenNameIdentifier	 Flattening Path Iterator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
/** * Utilitiy class for length calculations of paths. * <p> * PathLength is a utility class for calculating the length * of a path, the location of a point at a particular length * along the path, and the angle of the tangent to the path * at a given length. * </p> * <p> * It uses a FlatteningPathIterator to create a flattened version * of the Path. This means the values returned are not always * exact (in fact, they rarely are), but in most cases they * are reasonably accurate. * </p> * * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> * @version $Id: PathLength.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 Utilitiy class for length calculations of paths. <p> PathLength is a utility class for calculating the length of a path, the location of a point at a particular length along the path, and the angle of the tangent to the path at a given length. </p> <p> It uses a FlatteningPathIterator to create a flattened version of the Path. This means the values returned are not always exact (in fact, they rarely are), but in most cases they are reasonably accurate. </p> * @author <a href="mailto:dean.jackson@cmis.csiro.au">Dean Jackson</a> @version $Id: PathLength.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
PathLength	TokenNameIdentifier	 Path Length
{	TokenNameLBRACE	
/** * The path to use for calculations. */	TokenNameCOMMENT_JAVADOC	 The path to use for calculations. 
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
/** * The list of flattened path segments. */	TokenNameCOMMENT_JAVADOC	 The list of flattened path segments. 
protected	TokenNameprotected	
List	TokenNameIdentifier	 List
segments	TokenNameIdentifier	 segments
;	TokenNameSEMICOLON	
/** * Array where the index is the index of the original path segment * and the value is the index of the first of the flattened segments * in {@link #segments} that corresponds to that original path segment. */	TokenNameCOMMENT_JAVADOC	 Array where the index is the index of the original path segment and the value is the index of the first of the flattened segments in {@link #segments} that corresponds to that original path segment. 
protected	TokenNameprotected	
int	TokenNameint	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segmentIndexes	TokenNameIdentifier	 segment Indexes
;	TokenNameSEMICOLON	
/** * Cached copy of the path length. */	TokenNameCOMMENT_JAVADOC	 Cached copy of the path length. 
protected	TokenNameprotected	
float	TokenNamefloat	
pathLength	TokenNameIdentifier	 path Length
;	TokenNameSEMICOLON	
/** * Whether this path been flattened yet. */	TokenNameCOMMENT_JAVADOC	 Whether this path been flattened yet. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
initialised	TokenNameIdentifier	 initialised
;	TokenNameSEMICOLON	
/** * Creates a new PathLength object for the specified {@link Shape}. * @param path The Path (or Shape) to use. */	TokenNameCOMMENT_JAVADOC	 Creates a new PathLength object for the specified {@link Shape}. @param path The Path (or Shape) to use. 
public	TokenNamepublic	
PathLength	TokenNameIdentifier	 Path Length
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
path	TokenNameIdentifier	 path
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the path to use for calculations. * @return Path used in calculations. */	TokenNameCOMMENT_JAVADOC	 Returns the path to use for calculations. @return Path used in calculations. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getPath	TokenNameIdentifier	 get Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
path	TokenNameIdentifier	 path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the path to use for calculations. * @param v Path to be used in calculations. */	TokenNameCOMMENT_JAVADOC	 Sets the path to use for calculations. @param v Path to be used in calculations. 
public	TokenNamepublic	
void	TokenNamevoid	
setPath	TokenNameIdentifier	 set Path
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
path	TokenNameIdentifier	 path
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
initialised	TokenNameIdentifier	 initialised
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the length of the path used by this PathLength object. * @return The length of the path. */	TokenNameCOMMENT_JAVADOC	 Returns the length of the path used by this PathLength object. @return The length of the path. 
public	TokenNamepublic	
float	TokenNamefloat	
lengthOfPath	TokenNameIdentifier	 length Of Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initialised	TokenNameIdentifier	 initialised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialise	TokenNameIdentifier	 initialise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pathLength	TokenNameIdentifier	 path Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Flattens the path and determines the path length. */	TokenNameCOMMENT_JAVADOC	 Flattens the path and determines the path length. 
protected	TokenNameprotected	
void	TokenNamevoid	
initialise	TokenNameIdentifier	 initialise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pathLength	TokenNameIdentifier	 path Length
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
PathIterator	TokenNameIdentifier	 Path Iterator
pi	TokenNameIdentifier	 pi
=	TokenNameEQUAL	
path	TokenNameIdentifier	 path
.	TokenNameDOT	
getPathIterator	TokenNameIdentifier	 get Path Iterator
(	TokenNameLPAREN	
new	TokenNamenew	
AffineTransform	TokenNameIdentifier	 Affine Transform
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
SingleSegmentPathIterator	TokenNameIdentifier	 Single Segment Path Iterator
sspi	TokenNameIdentifier	 sspi
=	TokenNameEQUAL	
new	TokenNamenew	
SingleSegmentPathIterator	TokenNameIdentifier	 Single Segment Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segments	TokenNameIdentifier	 segments
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
indexes	TokenNameIdentifier	 indexes
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
origIndex	TokenNameIdentifier	 orig Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lastMoveX	TokenNameIdentifier	 last Move X
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
lastMoveY	TokenNameIdentifier	 last Move Y
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
new	TokenNamenew	
float	TokenNamefloat	
[	TokenNameLBRACKET	
6	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
segType	TokenNameIdentifier	 seg Type
;	TokenNameSEMICOLON	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
PathSegment	TokenNameIdentifier	 Path Segment
(	TokenNameLPAREN	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
0f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
origIndex	TokenNameIdentifier	 orig Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
origIndex	TokenNameIdentifier	 orig Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
:	TokenNameCOLON	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
PathSegment	TokenNameIdentifier	 Path Segment
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
pathLength	TokenNameIdentifier	 path Length
,	TokenNameCOMMA	
origIndex	TokenNameIdentifier	 orig Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
lastMoveX	TokenNameIdentifier	 last Move X
=	TokenNameEQUAL	
currentX	TokenNameIdentifier	 current X
;	TokenNameSEMICOLON	
lastMoveY	TokenNameIdentifier	 last Move Y
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
:	TokenNameCOLON	
pathLength	TokenNameIdentifier	 path Length
+=	TokenNamePLUS_EQUAL	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
(	TokenNameLPAREN	
currentX	TokenNameIdentifier	 current X
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
PathSegment	TokenNameIdentifier	 Path Segment
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
pathLength	TokenNameIdentifier	 path Length
,	TokenNameCOMMA	
origIndex	TokenNameIdentifier	 orig Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_CLOSE	TokenNameIdentifier	 SEG  CLOSE
:	TokenNameCOLON	
pathLength	TokenNameIdentifier	 path Length
+=	TokenNamePLUS_EQUAL	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
(	TokenNameLPAREN	
currentX	TokenNameIdentifier	 current X
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
,	TokenNameCOMMA	
lastMoveX	TokenNameIdentifier	 last Move X
,	TokenNameCOMMA	
lastMoveY	TokenNameIdentifier	 last Move Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
PathSegment	TokenNameIdentifier	 Path Segment
(	TokenNameLPAREN	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
,	TokenNameCOMMA	
lastMoveX	TokenNameIdentifier	 last Move X
,	TokenNameCOMMA	
lastMoveY	TokenNameIdentifier	 last Move Y
,	TokenNameCOMMA	
pathLength	TokenNameIdentifier	 path Length
,	TokenNameCOMMA	
origIndex	TokenNameIdentifier	 orig Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
lastMoveX	TokenNameIdentifier	 last Move X
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
lastMoveY	TokenNameIdentifier	 last Move Y
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
pi	TokenNameIdentifier	 pi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
sspi	TokenNameIdentifier	 sspi
.	TokenNameDOT	
setPathIterator	TokenNameIdentifier	 set Path Iterator
(	TokenNameLPAREN	
pi	TokenNameIdentifier	 pi
,	TokenNameCOMMA	
currentX	TokenNameIdentifier	 current X
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FlatteningPathIterator	TokenNameIdentifier	 Flattening Path Iterator
fpi	TokenNameIdentifier	 fpi
=	TokenNameEQUAL	
new	TokenNamenew	
FlatteningPathIterator	TokenNameIdentifier	 Flattening Path Iterator
(	TokenNameLPAREN	
sspi	TokenNameIdentifier	 sspi
,	TokenNameCOMMA	
0.01f	TokenNameFloatingPointLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
fpi	TokenNameIdentifier	 fpi
.	TokenNameDOT	
isDone	TokenNameIdentifier	 is Done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
fpi	TokenNameIdentifier	 fpi
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
==	TokenNameEQUAL_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_LINETO	TokenNameIdentifier	 SEG  LINETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pathLength	TokenNameIdentifier	 path Length
+=	TokenNamePLUS_EQUAL	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
distance	TokenNameIdentifier	 distance
(	TokenNameLPAREN	
currentX	TokenNameIdentifier	 current X
,	TokenNameCOMMA	
currentY	TokenNameIdentifier	 current Y
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
PathSegment	TokenNameIdentifier	 Path Segment
(	TokenNameLPAREN	
segType	TokenNameIdentifier	 seg Type
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
pathLength	TokenNameIdentifier	 path Length
,	TokenNameCOMMA	
origIndex	TokenNameIdentifier	 orig Index
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentX	TokenNameIdentifier	 current X
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fpi	TokenNameIdentifier	 fpi
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
segmentIndexes	TokenNameIdentifier	 segment Indexes
=	TokenNameEQUAL	
new	TokenNamenew	
int	TokenNameint	
[	TokenNameLBRACKET	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
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
segmentIndexes	TokenNameIdentifier	 segment Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
segmentIndexes	TokenNameIdentifier	 segment Indexes
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
)	TokenNameRPAREN	
indexes	TokenNameIdentifier	 indexes
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
intValue	TokenNameIdentifier	 int Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
initialised	TokenNameIdentifier	 initialised
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of segments in the path. */	TokenNameCOMMENT_JAVADOC	 Returns the number of segments in the path. 
public	TokenNamepublic	
int	TokenNameint	
getNumberOfSegments	TokenNameIdentifier	 get Number Of Segments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initialised	TokenNameIdentifier	 initialised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialise	TokenNameIdentifier	 initialise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
segmentIndexes	TokenNameIdentifier	 segment Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the length at the start of the segment given by the specified * index. */	TokenNameCOMMENT_JAVADOC	 Returns the length at the start of the segment given by the specified index. 
public	TokenNamepublic	
float	TokenNamefloat	
getLengthAtSegment	TokenNameIdentifier	 get Length At Segment
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initialised	TokenNameIdentifier	 initialised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialise	TokenNameIdentifier	 initialise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
segmentIndexes	TokenNameIdentifier	 segment Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
pathLength	TokenNameIdentifier	 path Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
segmentIndexes	TokenNameIdentifier	 segment Indexes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index of the segment at the given distance along the path. */	TokenNameCOMMENT_JAVADOC	 Returns the index of the segment at the given distance along the path. 
public	TokenNamepublic	
int	TokenNameint	
segmentAtLength	TokenNameIdentifier	 segment At Length
(	TokenNameLPAREN	
float	TokenNamefloat	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upperIndex	TokenNameIdentifier	 upper Index
=	TokenNameEQUAL	
findUpperIndex	TokenNameIdentifier	 find Upper Index
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Length is off the end of the path. 	TokenNameCOMMENT_LINE	Length is off the end of the path. 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Length was probably zero, so return the upper segment. 	TokenNameCOMMENT_LINE	Length was probably zero, so return the upper segment. 
PathSegment	TokenNameIdentifier	 Path Segment
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the point that is the given proportion along the path segment * given by the specified index. */	TokenNameCOMMENT_JAVADOC	 Returns the point that is the given proportion along the path segment given by the specified index. 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
pointAtLength	TokenNameIdentifier	 point At Length
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
float	TokenNamefloat	
proportion	TokenNameIdentifier	 proportion
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initialised	TokenNameIdentifier	 initialised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialise	TokenNameIdentifier	 initialise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
segmentIndexes	TokenNameIdentifier	 segment Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
segmentIndexes	TokenNameIdentifier	 segment Indexes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
segmentIndexes	TokenNameIdentifier	 segment Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
pathLength	TokenNameIdentifier	 path Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
segmentIndexes	TokenNameIdentifier	 segment Indexes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
pointAtLength	TokenNameIdentifier	 point At Length
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
proportion	TokenNameIdentifier	 proportion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the point that is at the given length along the path. * @param length The length along the path * @return The point at the given length */	TokenNameCOMMENT_JAVADOC	 Returns the point that is at the given length along the path. @param length The length along the path @return The point at the given length 
public	TokenNamepublic	
Point2D	TokenNameIdentifier	 Point2 D
pointAtLength	TokenNameIdentifier	 point At Length
(	TokenNameLPAREN	
float	TokenNamefloat	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upperIndex	TokenNameIdentifier	 upper Index
=	TokenNameEQUAL	
findUpperIndex	TokenNameIdentifier	 find Upper Index
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Length is off the end of the path. 	TokenNameCOMMENT_LINE	Length is off the end of the path. 
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Length was probably zero, so return the upper point. 	TokenNameCOMMENT_LINE	Length was probably zero, so return the upper point. 
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Now work out where along the line would be the length. 	TokenNameCOMMENT_LINE	Now work out where along the line would be the length. 
float	TokenNamefloat	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute the slope. 	TokenNameCOMMENT_LINE	Compute the slope. 
double	TokenNamedouble	
theta	TokenNameIdentifier	 theta
=	TokenNameEQUAL	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
xPoint	TokenNameIdentifier	 x Point
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
cos	TokenNameIdentifier	 cos
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
yPoint	TokenNameIdentifier	 y Point
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
*	TokenNameMULTIPLY	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
sin	TokenNameIdentifier	 sin
(	TokenNameLPAREN	
theta	TokenNameIdentifier	 theta
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Point2D	TokenNameIdentifier	 Point2 D
.	TokenNameDOT	
Float	TokenNameIdentifier	 Float
(	TokenNameLPAREN	
xPoint	TokenNameIdentifier	 x Point
,	TokenNameCOMMA	
yPoint	TokenNameIdentifier	 y Point
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the slope of the path at the specified length. * @param index The segment number * @param proportion The proportion along the given segment * @return the angle in radians, in the range [-{@link Math#PI}, * {@link Math#PI}]. */	TokenNameCOMMENT_JAVADOC	 Returns the slope of the path at the specified length. @param index The segment number @param proportion The proportion along the given segment @return the angle in radians, in the range [-{@link Math#PI}, {@link Math#PI}]. 
public	TokenNamepublic	
float	TokenNamefloat	
angleAtLength	TokenNameIdentifier	 angle At Length
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
float	TokenNamefloat	
proportion	TokenNameIdentifier	 proportion
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initialised	TokenNameIdentifier	 initialised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialise	TokenNameIdentifier	 initialise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
segmentIndexes	TokenNameIdentifier	 segment Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
segmentIndexes	TokenNameIdentifier	 segment Indexes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
segmentIndexes	TokenNameIdentifier	 segment Indexes
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
pathLength	TokenNameIdentifier	 path Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
segmentIndexes	TokenNameIdentifier	 segment Indexes
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
angleAtLength	TokenNameIdentifier	 angle At Length
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
proportion	TokenNameIdentifier	 proportion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the slope of the path at the specified length. * @param length The length along the path * @return the angle in radians, in the range [-{@link Math#PI}, * {@link Math#PI}]. */	TokenNameCOMMENT_JAVADOC	 Returns the slope of the path at the specified length. @param length The length along the path @return the angle in radians, in the range [-{@link Math#PI}, {@link Math#PI}]. 
public	TokenNamepublic	
float	TokenNamefloat	
angleAtLength	TokenNameIdentifier	 angle At Length
(	TokenNameLPAREN	
float	TokenNamefloat	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
upperIndex	TokenNameIdentifier	 upper Index
=	TokenNameEQUAL	
findUpperIndex	TokenNameIdentifier	 find Upper Index
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Length is off the end of the path. 	TokenNameCOMMENT_LINE	Length is off the end of the path. 
return	TokenNamereturn	
0f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
upper	TokenNameIdentifier	 upper
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Length was probably zero, so return the angle between the first 	TokenNameCOMMENT_LINE	Length was probably zero, so return the angle between the first 
// and second segments. 	TokenNameCOMMENT_LINE	and second segments. 
upperIndex	TokenNameIdentifier	 upper Index
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
lower	TokenNameIdentifier	 lower
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Compute the slope. 	TokenNameCOMMENT_LINE	Compute the slope. 
return	TokenNamereturn	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
atan2	TokenNameIdentifier	 atan2
(	TokenNameLPAREN	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
upper	TokenNameIdentifier	 upper
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
lower	TokenNameIdentifier	 lower
.	TokenNameDOT	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the index of the path segment that bounds the specified * length along the path. * @param length The length along the path * @return The path segment index, or -1 if there is not such segment */	TokenNameCOMMENT_JAVADOC	 Returns the index of the path segment that bounds the specified length along the path. @param length The length along the path @return The path segment index, or -1 if there is not such segment 
public	TokenNamepublic	
int	TokenNameint	
findUpperIndex	TokenNameIdentifier	 find Upper Index
(	TokenNameLPAREN	
float	TokenNamefloat	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
initialised	TokenNameIdentifier	 initialised
)	TokenNameRPAREN	
{	TokenNameLBRACE	
initialise	TokenNameIdentifier	 initialise
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
pathLength	TokenNameIdentifier	 path Length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Length is outside the path, so return -1. 	TokenNameCOMMENT_LINE	Length is outside the path, so return -1. 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Find the two segments that are each side of the length. 	TokenNameCOMMENT_LINE	Find the two segments that are each side of the length. 
int	TokenNameint	
lb	TokenNameIdentifier	 lb
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
ub	TokenNameIdentifier	 ub
=	TokenNameEQUAL	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
lb	TokenNameIdentifier	 lb
!=	TokenNameNOT_EQUAL	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
curr	TokenNameIdentifier	 curr
=	TokenNameEQUAL	
(	TokenNameLPAREN	
lb	TokenNameIdentifier	 lb
+	TokenNamePLUS	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
PathSegment	TokenNameIdentifier	 Path Segment
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
curr	TokenNameIdentifier	 curr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ub	TokenNameIdentifier	 ub
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
lb	TokenNameIdentifier	 lb
=	TokenNameEQUAL	
curr	TokenNameIdentifier	 curr
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ub	TokenNameIdentifier	 ub
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getSegType	TokenNameIdentifier	 get Seg Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
||	TokenNameOR_OR	
ub	TokenNameIdentifier	 ub
==	TokenNameEQUAL_EQUAL	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ub	TokenNameIdentifier	 ub
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
upperIndex	TokenNameIdentifier	 upper Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
currentIndex	TokenNameIdentifier	 current Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
numSegments	TokenNameIdentifier	 num Segments
=	TokenNameEQUAL	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
upperIndex	TokenNameIdentifier	 upper Index
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
currentIndex	TokenNameIdentifier	 current Index
<	TokenNameLESS	
numSegments	TokenNameIdentifier	 num Segments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PathSegment	TokenNameIdentifier	 Path Segment
ps	TokenNameIdentifier	 ps
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PathSegment	TokenNameIdentifier	 Path Segment
)	TokenNameRPAREN	
segments	TokenNameIdentifier	 segments
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentIndex	TokenNameIdentifier	 current Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
ps	TokenNameIdentifier	 ps
.	TokenNameDOT	
getSegType	TokenNameIdentifier	 get Seg Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
PathIterator	TokenNameIdentifier	 Path Iterator
.	TokenNameDOT	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
)	TokenNameRPAREN	
{	TokenNameLBRACE	
upperIndex	TokenNameIdentifier	 upper Index
=	TokenNameEQUAL	
currentIndex	TokenNameIdentifier	 current Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentIndex	TokenNameIdentifier	 current Index
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
upperIndex	TokenNameIdentifier	 upper Index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * A {@link PathIterator} that returns only the next path segment from * another {@link PathIterator}. */	TokenNameCOMMENT_JAVADOC	 A {@link PathIterator} that returns only the next path segment from another {@link PathIterator}. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
SingleSegmentPathIterator	TokenNameIdentifier	 Single Segment Path Iterator
implements	TokenNameimplements	
PathIterator	TokenNameIdentifier	 Path Iterator
{	TokenNameLBRACE	
/** * The path iterator being wrapped. */	TokenNameCOMMENT_JAVADOC	 The path iterator being wrapped. 
protected	TokenNameprotected	
PathIterator	TokenNameIdentifier	 Path Iterator
it	TokenNameIdentifier	 it
;	TokenNameSEMICOLON	
/** * Whether the single segment has been passed. */	TokenNameCOMMENT_JAVADOC	 Whether the single segment has been passed. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
;	TokenNameSEMICOLON	
/** * Whether the generated move command has been returned. */	TokenNameCOMMENT_JAVADOC	 Whether the generated move command has been returned. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
moveDone	TokenNameIdentifier	 move Done
;	TokenNameSEMICOLON	
/** * The x coordinate of the next move command. */	TokenNameCOMMENT_JAVADOC	 The x coordinate of the next move command. 
protected	TokenNameprotected	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The y coordinate of the next move command. */	TokenNameCOMMENT_JAVADOC	 The y coordinate of the next move command. 
protected	TokenNameprotected	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * Sets the path iterator to use and the initial SEG_MOVETO command * to return before it. */	TokenNameCOMMENT_JAVADOC	 Sets the path iterator to use and the initial SEG_MOVETO command to return before it. 
public	TokenNamepublic	
void	TokenNamevoid	
setPathIterator	TokenNameIdentifier	 set Path Iterator
(	TokenNameLPAREN	
PathIterator	TokenNameIdentifier	 Path Iterator
it	TokenNameIdentifier	 it
,	TokenNameCOMMA	
double	TokenNamedouble	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
moveDone	TokenNameIdentifier	 move Done
=	TokenNameEQUAL	
false	TokenNamefalse	
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
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
moveDone	TokenNameIdentifier	 move Done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
return	TokenNamereturn	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
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
int	TokenNameint	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
currentSegment	TokenNameIdentifier	 current Segment
(	TokenNameLPAREN	
coords	TokenNameIdentifier	 coords
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
moveDone	TokenNameIdentifier	 move Done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
coords	TokenNameIdentifier	 coords
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
float	TokenNamefloat	
)	TokenNameRPAREN	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
return	TokenNamereturn	
SEG_MOVETO	TokenNameIdentifier	 SEG  MOVETO
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getWindingRule	TokenNameIdentifier	 get Winding Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
it	TokenNameIdentifier	 it
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
done	TokenNameIdentifier	 done
||	TokenNameOR_OR	
it	TokenNameIdentifier	 it
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
done	TokenNameIdentifier	 done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
moveDone	TokenNameIdentifier	 move Done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
moveDone	TokenNameIdentifier	 move Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
done	TokenNameIdentifier	 done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A single path segment in the flattened version of the path. * This is a local helper class. PathSegment-objects are stored in * the {@link PathLength#segments} - list. * This is used as an immutable value-object. */	TokenNameCOMMENT_JAVADOC	 A single path segment in the flattened version of the path. This is a local helper class. PathSegment-objects are stored in the {@link PathLength#segments} - list. This is used as an immutable value-object. 
protected	TokenNameprotected	
static	TokenNamestatic	
class	TokenNameclass	
PathSegment	TokenNameIdentifier	 Path Segment
{	TokenNameLBRACE	
/** * The path segment type. */	TokenNameCOMMENT_JAVADOC	 The path segment type. 
protected	TokenNameprotected	
final	TokenNamefinal	
int	TokenNameint	
segType	TokenNameIdentifier	 seg Type
;	TokenNameSEMICOLON	
/** * The x coordinate of the path segment. */	TokenNameCOMMENT_JAVADOC	 The x coordinate of the path segment. 
protected	TokenNameprotected	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
/** * The y coordinate of the path segment. */	TokenNameCOMMENT_JAVADOC	 The y coordinate of the path segment. 
protected	TokenNameprotected	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
/** * The length of the path segment, accumulated from the start. */	TokenNameCOMMENT_JAVADOC	 The length of the path segment, accumulated from the start. 
protected	TokenNameprotected	
float	TokenNamefloat	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
/** * The index of the original path segment this flattened segment is a * part of. */	TokenNameCOMMENT_JAVADOC	 The index of the original path segment this flattened segment is a part of. 
protected	TokenNameprotected	
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
/** * Creates a new PathSegment with the specified parameters. * @param segType The segment type * @param x The x coordinate * @param y The y coordinate * @param len The segment length * @param idx The index of the original path segment this flattened * segment is a part of */	TokenNameCOMMENT_JAVADOC	 Creates a new PathSegment with the specified parameters. @param segType The segment type @param x The x coordinate @param y The y coordinate @param len The segment length @param idx The index of the original path segment this flattened segment is a part of 
PathSegment	TokenNameIdentifier	 Path Segment
(	TokenNameLPAREN	
int	TokenNameint	
segType	TokenNameIdentifier	 seg Type
,	TokenNameCOMMA	
float	TokenNamefloat	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
float	TokenNamefloat	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
float	TokenNamefloat	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
segType	TokenNameIdentifier	 seg Type
=	TokenNameEQUAL	
segType	TokenNameIdentifier	 seg Type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the segment type. */	TokenNameCOMMENT_JAVADOC	 Returns the segment type. 
public	TokenNamepublic	
int	TokenNameint	
getSegType	TokenNameIdentifier	 get Seg Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
segType	TokenNameIdentifier	 seg Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the x coordinate of the path segment. */	TokenNameCOMMENT_JAVADOC	 Returns the x coordinate of the path segment. 
public	TokenNamepublic	
float	TokenNamefloat	
getX	TokenNameIdentifier	 get X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the x coordinate of the path segment. */	TokenNameCOMMENT_JAVADOC	 Sets the x coordinate of the path segment. 
public	TokenNamepublic	
void	TokenNamevoid	
setX	TokenNameIdentifier	 set X
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the y coordinate of the path segment. */	TokenNameCOMMENT_JAVADOC	 Returns the y coordinate of the path segment. 
public	TokenNamepublic	
float	TokenNamefloat	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the y coordinate of the path segment. */	TokenNameCOMMENT_JAVADOC	 Sets the y coordinate of the path segment. 
public	TokenNamepublic	
void	TokenNamevoid	
setY	TokenNameIdentifier	 set Y
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the length of the path segment. */	TokenNameCOMMENT_JAVADOC	 Returns the length of the path segment. 
public	TokenNamepublic	
float	TokenNamefloat	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the length of the path segment. */	TokenNameCOMMENT_JAVADOC	 Sets the length of the path segment. 
public	TokenNamepublic	
void	TokenNamevoid	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
float	TokenNamefloat	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the segment index. */	TokenNameCOMMENT_JAVADOC	 Returns the segment index. 
public	TokenNamepublic	
int	TokenNameint	
getIndex	TokenNameIdentifier	 get Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the segment index. */	TokenNameCOMMENT_JAVADOC	 Sets the segment index. 
public	TokenNamepublic	
void	TokenNamevoid	
setIndex	TokenNameIdentifier	 set Index
(	TokenNameLPAREN	
int	TokenNameint	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
