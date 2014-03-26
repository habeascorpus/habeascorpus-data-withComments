/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
gvt	TokenNameIdentifier	 gvt
.	TokenNameDOT	
flow	TokenNameIdentifier	 flow
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Arrays	TokenNameIdentifier	 Arrays
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
SegmentList	TokenNameIdentifier	 Segment List
;	TokenNameSEMICOLON	
import	TokenNameimport	
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
.	TokenNameDOT	
Segment	TokenNameIdentifier	 Segment
;	TokenNameSEMICOLON	
/** * A class to hold flow region information for a given shape. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: FlowRegions.java 522271 2007-03-25 14:42:45Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 A class to hold flow region information for a given shape. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: FlowRegions.java 522271 2007-03-25 14:42:45Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
FlowRegions	TokenNameIdentifier	 Flow Regions
{	TokenNameLBRACE	
Shape	TokenNameIdentifier	 Shape
flowShape	TokenNameIdentifier	 flow Shape
;	TokenNameSEMICOLON	
SegmentList	TokenNameIdentifier	 Segment List
sl	TokenNameIdentifier	 sl
;	TokenNameSEMICOLON	
SegmentList	TokenNameIdentifier	 Segment List
.	TokenNameDOT	
SplitResults	TokenNameIdentifier	 Split Results
sr	TokenNameIdentifier	 sr
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
validRanges	TokenNameIdentifier	 valid Ranges
;	TokenNameSEMICOLON	
int	TokenNameint	
currentRange	TokenNameIdentifier	 current Range
;	TokenNameSEMICOLON	
double	TokenNamedouble	
currentY	TokenNameIdentifier	 current Y
,	TokenNameCOMMA	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
public	TokenNamepublic	
FlowRegions	TokenNameIdentifier	 Flow Regions
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getY	TokenNameIdentifier	 get Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
FlowRegions	TokenNameIdentifier	 Flow Regions
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
s	TokenNameIdentifier	 s
,	TokenNameCOMMA	
double	TokenNamedouble	
startY	TokenNameIdentifier	 start Y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
flowShape	TokenNameIdentifier	 flow Shape
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
new	TokenNamenew	
SegmentList	TokenNameIdentifier	 Segment List
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
startY	TokenNameIdentifier	 start Y
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
gotoY	TokenNameIdentifier	 goto Y
(	TokenNameLPAREN	
startY	TokenNameIdentifier	 start Y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getCurrentY	TokenNameIdentifier	 get Current Y
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
currentY	TokenNameIdentifier	 current Y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
getLineHeight	TokenNameIdentifier	 get Line Height
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
gotoY	TokenNameIdentifier	 goto Y
(	TokenNameLPAREN	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
currentY	TokenNameIdentifier	 current Y
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"New Y can not be lower than old Y "	TokenNameStringLiteral	New Y can not be lower than old Y 
+	TokenNamePLUS	
"Old Y: "	TokenNameStringLiteral	Old Y: 
+	TokenNamePLUS	
currentY	TokenNameIdentifier	 current Y
+	TokenNamePLUS	
" New Y: "	TokenNameStringLiteral	 New Y: 
+	TokenNamePLUS	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
==	TokenNameEQUAL_EQUAL	
currentY	TokenNameIdentifier	 current Y
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
sl	TokenNameIdentifier	 sl
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
getBelow	TokenNameIdentifier	 get Below
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
newLineHeight	TokenNameIdentifier	 new Line Height
(	TokenNameLPAREN	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
newLineHeight	TokenNameIdentifier	 new Line Height
(	TokenNameLPAREN	
double	TokenNamedouble	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
lineHeight	TokenNameIdentifier	 line Height
=	TokenNameEQUAL	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
sl	TokenNameIdentifier	 sl
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
currentY	TokenNameIdentifier	 current Y
+	TokenNamePLUS	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
getAbove	TokenNameIdentifier	 get Above
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sortRow	TokenNameIdentifier	 sort Row
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
getAbove	TokenNameIdentifier	 get Above
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentRange	TokenNameIdentifier	 current Range
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getNumRangeOnLine	TokenNameIdentifier	 get Num Range On Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
validRanges	TokenNameIdentifier	 valid Ranges
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
validRanges	TokenNameIdentifier	 valid Ranges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
resetRange	TokenNameIdentifier	 reset Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentRange	TokenNameIdentifier	 current Range
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nextRange	TokenNameIdentifier	 next Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentRange	TokenNameIdentifier	 current Range
>=	TokenNameGREATER_EQUAL	
validRanges	TokenNameIdentifier	 valid Ranges
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
validRanges	TokenNameIdentifier	 valid Ranges
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
currentRange	TokenNameIdentifier	 current Range
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
endLine	TokenNameIdentifier	 end Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
getBelow	TokenNameIdentifier	 get Below
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
newLine	TokenNameIdentifier	 new Line
(	TokenNameLPAREN	
double	TokenNamedouble	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
getBelow	TokenNameIdentifier	 get Below
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
+=	TokenNamePLUS_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
lineHeight	TokenNameIdentifier	 line Height
;	TokenNameSEMICOLON	
newLineHeight	TokenNameIdentifier	 new Line Height
(	TokenNameLPAREN	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
newLineAt	TokenNameIdentifier	 new Line At
(	TokenNameLPAREN	
double	TokenNamedouble	
y	TokenNameIdentifier	 y
,	TokenNameCOMMA	
double	TokenNamedouble	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sl	TokenNameIdentifier	 sl
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
getBelow	TokenNameIdentifier	 get Below
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
currentY	TokenNameIdentifier	 current Y
=	TokenNameEQUAL	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
newLineHeight	TokenNameIdentifier	 new Line Height
(	TokenNameLPAREN	
lineHeight	TokenNameIdentifier	 line Height
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
done	TokenNameIdentifier	 done
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
sl	TokenNameIdentifier	 sl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
sortRow	TokenNameIdentifier	 sort Row
(	TokenNameLPAREN	
SegmentList	TokenNameIdentifier	 Segment List
sl	TokenNameIdentifier	 sl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.err.println("sorting: " + sl.size()); 	TokenNameCOMMENT_LINE	System.err.println("sorting: " + sl.size()); 
Transition	TokenNameIdentifier	 Transition
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
segs	TokenNameIdentifier	 segs
=	TokenNameEQUAL	
new	TokenNamenew	
Transition	TokenNameIdentifier	 Transition
[	TokenNameLBRACKET	
sl	TokenNameIdentifier	 sl
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
sl	TokenNameIdentifier	 sl
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Segment	TokenNameIdentifier	 Segment
seg	TokenNameIdentifier	 seg
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Segment	TokenNameIdentifier	 Segment
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Transition	TokenNameIdentifier	 Transition
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
minX	TokenNameIdentifier	 min X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Transition	TokenNameIdentifier	 Transition
(	TokenNameLPAREN	
seg	TokenNameIdentifier	 seg
.	TokenNameDOT	
maxX	TokenNameIdentifier	 max X
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.err.println("Seg: " + seg.minX() + ", " + seg.maxX()); 	TokenNameCOMMENT_LINE	System.err.println("Seg: " + seg.minX() + ", " + seg.maxX()); 
}	TokenNameRBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
segs	TokenNameIdentifier	 segs
,	TokenNameCOMMA	
TransitionComp	TokenNameIdentifier	 Transition Comp
.	TokenNameDOT	
COMP	TokenNameIdentifier	 COMP
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
validRanges	TokenNameIdentifier	 valid Ranges
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
openStart	TokenNameIdentifier	 open Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Skip the first one as it always starts a geometry block. 	TokenNameCOMMENT_LINE	Skip the first one as it always starts a geometry block. 
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
segs	TokenNameIdentifier	 segs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Transition	TokenNameIdentifier	 Transition
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
segs	TokenNameIdentifier	 segs
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
up	TokenNameIdentifier	 up
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
double	TokenNamedouble	
cx	TokenNameIdentifier	 cx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
openStart	TokenNameIdentifier	 open Start
+	TokenNamePLUS	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
double	TokenNamedouble	
cy	TokenNameIdentifier	 cy
=	TokenNameEQUAL	
currentY	TokenNameIdentifier	 current Y
+	TokenNamePLUS	
lineHeight	TokenNameIdentifier	 line Height
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// System.err.println("PT: " + cx+", "+cy); 	TokenNameCOMMENT_LINE	System.err.println("PT: " + cx+", "+cy); 
if	TokenNameif	
(	TokenNameLPAREN	
flowShape	TokenNameIdentifier	 flow Shape
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
cx	TokenNameIdentifier	 cx
,	TokenNameCOMMA	
cy	TokenNameIdentifier	 cy
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
validRanges	TokenNameIdentifier	 valid Ranges
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
double	TokenNamedouble	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
openStart	TokenNameIdentifier	 open Start
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
count	TokenNameIdentifier	 count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
openStart	TokenNameIdentifier	 open Start
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
Transition	TokenNameIdentifier	 Transition
{	TokenNameLBRACE	
public	TokenNamepublic	
double	TokenNamedouble	
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
public	TokenNamepublic	
boolean	TokenNameboolean	
up	TokenNameIdentifier	 up
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Transition	TokenNameIdentifier	 Transition
(	TokenNameLPAREN	
double	TokenNamedouble	
loc	TokenNameIdentifier	 loc
,	TokenNameCOMMA	
boolean	TokenNameboolean	
up	TokenNameIdentifier	 up
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
=	TokenNameEQUAL	
loc	TokenNameIdentifier	 loc
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
up	TokenNameIdentifier	 up
=	TokenNameEQUAL	
up	TokenNameIdentifier	 up
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
TransitionComp	TokenNameIdentifier	 Transition Comp
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
COMP	TokenNameIdentifier	 COMP
=	TokenNameEQUAL	
new	TokenNamenew	
TransitionComp	TokenNameIdentifier	 Transition Comp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TransitionComp	TokenNameIdentifier	 Transition Comp
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Transition	TokenNameIdentifier	 Transition
t1	TokenNameIdentifier	 t1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Transition	TokenNameIdentifier	 Transition
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
;	TokenNameSEMICOLON	
Transition	TokenNameIdentifier	 Transition
t2	TokenNameIdentifier	 t2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Transition	TokenNameIdentifier	 Transition
)	TokenNameRPAREN	
o2	TokenNameIdentifier	 o2
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
<	TokenNameLESS	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
>	TokenNameGREATER	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
loc	TokenNameIdentifier	 loc
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Locs are equal. 	TokenNameCOMMENT_LINE	Locs are equal. 
if	TokenNameif	
(	TokenNameLPAREN	
t1	TokenNameIdentifier	 t1
.	TokenNameDOT	
up	TokenNameIdentifier	 up
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
up	TokenNameIdentifier	 up
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// everything equal. 	TokenNameCOMMENT_LINE	everything equal. 
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// always list ups first 	TokenNameCOMMENT_LINE	always list ups first 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
t2	TokenNameIdentifier	 t2
.	TokenNameDOT	
up	TokenNameIdentifier	 up
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
