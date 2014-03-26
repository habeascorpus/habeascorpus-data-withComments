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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
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
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Comparator	TokenNameIdentifier	 Comparator
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
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
/** * RectListManager is a class to manage a list of rectangular regions. * This class contains methods to add new rectangles to the List, to * merge rectangles in the list (based on a cost function), and * functions to subract one RectListManager from another. The main * purpose of this class is to manage dirty regions on a display (for * this reason it uses Rectangle not Rectangle2D). * * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> * @version $Id: RectListManager.java 501844 2007-01-31 13:54:05Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 RectListManager is a class to manage a list of rectangular regions. This class contains methods to add new rectangles to the List, to merge rectangles in the list (based on a cost function), and functions to subract one RectListManager from another. The main purpose of this class is to manage dirty regions on a display (for this reason it uses Rectangle not Rectangle2D). * @author <a href="mailto:deweese@apache.org">Thomas DeWeese</a> @version $Id: RectListManager.java 501844 2007-01-31 13:54:05Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
RectListManager	TokenNameIdentifier	 Rect List Manager
implements	TokenNameimplements	
Collection	TokenNameIdentifier	 Collection
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rects	TokenNameIdentifier	 rects
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
dump	TokenNameIdentifier	 dump
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"RLM: "	TokenNameStringLiteral	RLM: 
+	TokenNamePLUS	
this	TokenNamethis	
+	TokenNamePLUS	
" Sz: "	TokenNameStringLiteral	 Sz: 
+	TokenNamePLUS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Bounds: "	TokenNameStringLiteral	Bounds: 
+	TokenNamePLUS	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" ["	TokenNameStringLiteral	 [
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
+	TokenNamePLUS	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The comparator used to sort the elements of this List. * Sorts on x value of Rectangle. */	TokenNameCOMMENT_JAVADOC	 The comparator used to sort the elements of this List. Sorts on x value of Rectangle. 
public	TokenNamepublic	
static	TokenNamestatic	
Comparator	TokenNameIdentifier	 Comparator
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
new	TokenNamenew	
RectXComparator	TokenNameIdentifier	 Rect X Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Construct a <tt>RectListManager</tt> from a Collection of Rectangles * @param rects Collection that must only contain rectangles. */	TokenNameCOMMENT_JAVADOC	 Construct a <tt>RectListManager</tt> from a Collection of Rectangles @param rects Collection that must only contain rectangles. 
public	TokenNamepublic	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
rects	TokenNameIdentifier	 rects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// todo can be replaced by rects.toArray() 	TokenNameCOMMENT_LINE	todo can be replaced by rects.toArray() 
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a <tt>RectListManager</tt> from an Array of * <tt>Rectangles</tt> * @param rects Array of <tt>Rectangles</tt>, must not contain * any null entries. */	TokenNameCOMMENT_JAVADOC	 Construct a <tt>RectListManager</tt> from an Array of <tt>Rectangles</tt> @param rects Array of <tt>Rectangles</tt>, must not contain any null entries. 
public	TokenNamepublic	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rects	TokenNameIdentifier	 rects
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a <tt>RectListManager</tt> from an Array of * <tt>Rectangles</tt> * @param rects Array of <tt>Rectangles</tt>, must not contain * any null entries in the range [off, off+sz-1]. * @param off The offset to start copying from in rects. * @param sz The number of entries to copy from rects. */	TokenNameCOMMENT_JAVADOC	 Construct a <tt>RectListManager</tt> from an Array of <tt>Rectangles</tt> @param rects Array of <tt>Rectangles</tt>, must not contain any null entries in the range [off, off+sz-1]. @param off The offset to start copying from in rects. @param sz The number of entries to copy from rects. 
public	TokenNamepublic	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
int	TokenNameint	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
sz	TokenNameIdentifier	 sz
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
sz	TokenNameIdentifier	 sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
off	TokenNameIdentifier	 off
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a <tt>RectListManager</tt> from another * <tt>RectListManager</tt> (data is copied). * @param rlm RectListManager to copy. */	TokenNameCOMMENT_JAVADOC	 Construct a <tt>RectListManager</tt> from another <tt>RectListManager</tt> (data is copied). @param rlm RectListManager to copy. 
public	TokenNamepublic	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
rlm	TokenNameIdentifier	 rlm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a <tt>RectListManager</tt> with one rectangle * @param rect The rectangle to put in this rlm. */	TokenNameCOMMENT_JAVADOC	 Construct a <tt>RectListManager</tt> with one rectangle @param rect The rectangle to put in this rlm. 
public	TokenNamepublic	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an initially empty <tt>RectListManager</tt>. */	TokenNameCOMMENT_JAVADOC	 Construct an initially empty <tt>RectListManager</tt>. 
public	TokenNamepublic	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
10	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct an initially empty <tt>RectListManager</tt>, * with initial <tt>capacity</tt>. * @param capacity The inital capacity for the list. Setting * this appropriately can save reallocations. */	TokenNameCOMMENT_JAVADOC	 Construct an initially empty <tt>RectListManager</tt>, with initial <tt>capacity</tt>. @param capacity The inital capacity for the list. Setting this appropriately can save reallocations. 
public	TokenNamepublic	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
capacity	TokenNameIdentifier	 capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Rectangle	TokenNameIdentifier	 Rectangle
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
bounds	TokenNameIdentifier	 bounds
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
<	TokenNameLESS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
)	TokenNameRPAREN	
{	TokenNameLBRACE	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
>	TokenNameGREATER	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
>	TokenNameGREATER	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
)	TokenNameRPAREN	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
height	TokenNameIdentifier	 height
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
bounds	TokenNameIdentifier	 bounds
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
bounds	TokenNameIdentifier	 bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Standard <tt>Object</tt> clone method. */	TokenNameCOMMENT_JAVADOC	 Standard <tt>Object</tt> clone method. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Similar to clone only strongly typed */	TokenNameCOMMENT_JAVADOC	 Similar to clone only strongly typed 
public	TokenNamepublic	
RectListManager	TokenNameIdentifier	 Rect List Manager
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of elements currently stored in this collection. */	TokenNameCOMMENT_JAVADOC	 Returns the number of elements currently stored in this collection. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this collection contains no elements. */	TokenNameCOMMENT_JAVADOC	 Returns true if this collection contains no elements. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an iterator over the elements in this collection */	TokenNameCOMMENT_JAVADOC	 Returns an iterator over the elements in this collection 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RLMIterator	TokenNameIdentifier	 RLM Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a list iterator of the elements in this list * (in proper sequence). */	TokenNameCOMMENT_JAVADOC	 Returns a list iterator of the elements in this list (in proper sequence). 
public	TokenNamepublic	
ListIterator	TokenNameIdentifier	 List Iterator
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
RLMIterator	TokenNameIdentifier	 RLM Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ret	TokenNameIdentifier	 ret
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * fill the given array a with values from my internal <code>rects</code>. * when a is not large enough, a new array is allocated, filled and returned. * the method works only, when a is a Object[] or a Rectange[]. * When this is not the case, the a[] is just cleared. * * @param a array to fill (must not be null!) * @return the content of rects, either in a[] or a fresh array. */	TokenNameCOMMENT_JAVADOC	 fill the given array a with values from my internal <code>rects</code>. when a is not large enough, a new array is allocated, filled and returned. the method works only, when a is a Object[] or a Rectange[]. When this is not the case, the a[] is just cleared. * @param a array to fill (must not be null!) @return the content of rects, either in a[] or a fresh array. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Class	TokenNameIdentifier	 Class
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getComponentType	TokenNameIdentifier	 get Component Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
Object	TokenNameIdentifier	 Object
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
Rectangle	TokenNameIdentifier	 Rectangle
.	TokenNameDOT	
class	TokenNameclass	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Nothing here for it... 	TokenNameCOMMENT_LINE	Nothing here for it... 
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
a	TokenNameIdentifier	 a
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
fill	TokenNameIdentifier	 fill
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensures that this collection contains the specified element * @param rect The rectangle to add */	TokenNameCOMMENT_JAVADOC	 Ensures that this collection contains the specified element @param rect The rectangle to add 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Ensures that this collection contains the specified element * l is the lower bound index for insertion r is upper * bound index for insertion. * @param rect The rectangle to add * @param l the lowest possible index for a rect with * greater 'x' coord. * @param r the highest possible index for a rect with * greater 'x' coord. */	TokenNameCOMMENT_JAVADOC	 Ensures that this collection contains the specified element l is the lower bound index for insertion r is upper bound index for insertion. @param rect The rectangle to add @param l the lowest possible index for a rect with greater 'x' coord. @param r the highest possible index for a rect with greater 'x' coord. 
protected	TokenNameprotected	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
,	TokenNameCOMMA	
int	TokenNameint	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
int	TokenNameint	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
<=	TokenNameLESS_EQUAL	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// All 'null' from center to r so skip them 	TokenNameCOMMENT_LINE	All 'null' from center to r so skip them 
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
>	TokenNameGREATER	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rect	TokenNameIdentifier	 rect
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<=	TokenNameLESS_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if (idx!=0) System.out.print(rects[idx-1].x); 	TokenNameCOMMENT_LINE	if (idx!=0) System.out.print(rects[idx-1].x); 
// else System.out.print("[First]"); 	TokenNameCOMMENT_LINE	else System.out.print("[First]"); 
// System.out.print(" " + rect.x + " "); 	TokenNameCOMMENT_LINE	System.out.print(" " + rect.x + " "); 
// if (idx<size) System.out.print(rects[idx+1].x); 	TokenNameCOMMENT_LINE	if (idx<size) System.out.print(rects[idx+1].x); 
// else System.out.print("[last]"); 	TokenNameCOMMENT_LINE	else System.out.print("[last]"); 
// System.out.println(""); 	TokenNameCOMMENT_LINE	System.out.println(""); 
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rect	TokenNameIdentifier	 rect
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
RectListManager	TokenNameIdentifier	 Rect List Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
<=	TokenNameLESS_EQUAL	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<=	TokenNameLESS_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Didn't find any rect with the same x value. 	TokenNameCOMMENT_LINE	Didn't find any rect with the same x value. 
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Search towards 0 from idx for rect that matches 	TokenNameCOMMENT_LINE	Search towards 0 from idx for rect that matches 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Search towards size from idx for rect that matches 	TokenNameCOMMENT_LINE	Search towards size from idx for rect that matches 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// No match... 	TokenNameCOMMENT_LINE	No match... 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns true if this collection contains all of the elements in * the specified collection. */	TokenNameCOMMENT_JAVADOC	 Returns true if this collection contains all of the elements in the specified collection. 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsAll	TokenNameIdentifier	 contains All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
RectListManager	TokenNameIdentifier	 Rect List Manager
)	TokenNameRPAREN	
return	TokenNamereturn	
containsAll	TokenNameIdentifier	 contains All
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
containsAll	TokenNameIdentifier	 contains All
(	TokenNameLPAREN	
new	TokenNamenew	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
containsAll	TokenNameIdentifier	 contains All
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
rlm	TokenNameIdentifier	 rlm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
xChange	TokenNameIdentifier	 x Change
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
xChange	TokenNameIdentifier	 x Change
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xChange	TokenNameIdentifier	 x Change
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// out of rects 	TokenNameCOMMENT_LINE	out of rects 
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// out of the zone. 	TokenNameCOMMENT_LINE	out of the zone. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a single instance of the specified element from this * collection, if it is present. * @param o Object to remove an matching instance of. */	TokenNameCOMMENT_JAVADOC	 Removes a single instance of the specified element from this collection, if it is present. @param o Object to remove an matching instance of. 
public	TokenNamepublic	
boolean	TokenNameboolean	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes a single instance of the specified Rectangle from this * collection, if it is present. * @param rect Rectangle to remove an matching instance of. */	TokenNameCOMMENT_JAVADOC	 Removes a single instance of the specified Rectangle from this collection, if it is present. @param rect Rectangle to remove an matching instance of. 
public	TokenNamepublic	
boolean	TokenNameboolean	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
<=	TokenNameLESS_EQUAL	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
==	TokenNameEQUAL_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<=	TokenNameLESS_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Didn't find any rect with the same x value. 	TokenNameCOMMENT_LINE	Didn't find any rect with the same x value. 
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// Search towards 0 from idx for rect that matches 	TokenNameCOMMENT_LINE	Search towards 0 from idx for rect that matches 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Search towards size from idx for rect that matches 	TokenNameCOMMENT_LINE	Search towards size from idx for rect that matches 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rect	TokenNameIdentifier	 rect
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rect	TokenNameIdentifier	 rect
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// No match... 	TokenNameCOMMENT_LINE	No match... 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
RectListManager	TokenNameIdentifier	 Rect List Manager
)	TokenNameRPAREN	
return	TokenNamereturn	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
new	TokenNamenew	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
rlm	TokenNameIdentifier	 rlm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
xChange	TokenNameIdentifier	 x Change
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
xChange	TokenNameIdentifier	 x Change
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
xChange	TokenNameIdentifier	 x Change
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// out of rects 	TokenNameCOMMENT_LINE	out of rects 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// out of rects 	TokenNameCOMMENT_LINE	out of rects 
if	TokenNameif	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// out of the zone. 	TokenNameCOMMENT_LINE	out of the zone. 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now we will go through collapsing the nulled entries. 	TokenNameCOMMENT_LINE	Now we will go through collapsing the nulled entries. 
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
RectListManager	TokenNameIdentifier	 Rect List Manager
)	TokenNameRPAREN	
return	TokenNamereturn	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
new	TokenNamenew	
RectListManager	TokenNameIdentifier	 Rect List Manager
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
rlm	TokenNameIdentifier	 rlm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
x	TokenNameIdentifier	 x
,	TokenNameCOMMA	
xChange	TokenNameIdentifier	 x Change
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
xChange	TokenNameIdentifier	 x Change
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// No more rects will match anything from rlm 	TokenNameCOMMENT_LINE	No more rects will match anything from rlm 
// so remove them from this RLM. 	TokenNameCOMMENT_LINE	so remove them from this RLM. 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
xChange	TokenNameIdentifier	 x Change
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
x	TokenNameIdentifier	 x
=	TokenNameEQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
x	TokenNameIdentifier	 x
!=	TokenNameNOT_EQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Out of zone or rects 	TokenNameCOMMENT_LINE	Out of zone or rects 
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now we will go through collapsing the nulled entries. 	TokenNameCOMMENT_LINE	Now we will go through collapsing the nulled entries. 
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds the contents of <tt>rlm</tt> to this RectListManager. No * collapsing of rectangles is done here the contents are simply * added (you should generally call 'mergeRects' some time after * this operation before using the contents of this * RectListManager. * @param rlm The RectListManager to add the contents of. */	TokenNameCOMMENT_JAVADOC	 Adds the contents of <tt>rlm</tt> to this RectListManager. No collapsing of rectangles is done here the contents are simply added (you should generally call 'mergeRects' some time after this operation before using the contents of this RectListManager. @param rlm The RectListManager to add the contents of. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
rlm	TokenNameIdentifier	 rlm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dst	TokenNameIdentifier	 dst
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dst	TokenNameIdentifier	 dst
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
,	TokenNameCOMMA	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
src1	TokenNameIdentifier	 src1
=	TokenNameEQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
;	TokenNameSEMICOLON	
int	TokenNameint	
src1Sz	TokenNameIdentifier	 src1 Sz
=	TokenNameEQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
int	TokenNameint	
src1I	TokenNameIdentifier	 src1 I
=	TokenNameEQUAL	
src1Sz	TokenNameIdentifier	 src1 Sz
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
src2	TokenNameIdentifier	 src2
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
;	TokenNameSEMICOLON	
int	TokenNameint	
src2Sz	TokenNameIdentifier	 src2 Sz
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
int	TokenNameint	
src2I	TokenNameIdentifier	 src2 I
=	TokenNameEQUAL	
src2Sz	TokenNameIdentifier	 src2 Sz
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
dstI	TokenNameIdentifier	 dst I
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
src1	TokenNameIdentifier	 src1
[	TokenNameLBRACKET	
src1I	TokenNameIdentifier	 src1 I
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
src2	TokenNameIdentifier	 src2
[	TokenNameLBRACKET	
src2I	TokenNameIdentifier	 src2 I
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
dstI	TokenNameIdentifier	 dst I
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
x1	TokenNameIdentifier	 x1
<=	TokenNameLESS_EQUAL	
x2	TokenNameIdentifier	 x2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
dstI	TokenNameIdentifier	 dst I
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src2	TokenNameIdentifier	 src2
[	TokenNameLBRACKET	
src2I	TokenNameIdentifier	 src2 I
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
src2I	TokenNameIdentifier	 src2 I
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
src1	TokenNameIdentifier	 src1
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
src1I	TokenNameIdentifier	 src1 I
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
src2I	TokenNameIdentifier	 src2 I
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
x2	TokenNameIdentifier	 x2
=	TokenNameEQUAL	
src2	TokenNameIdentifier	 src2
[	TokenNameLBRACKET	
src2I	TokenNameIdentifier	 src2 I
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
dstI	TokenNameIdentifier	 dst I
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src1	TokenNameIdentifier	 src1
[	TokenNameLBRACKET	
src1I	TokenNameIdentifier	 src1 I
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
src1I	TokenNameIdentifier	 src1 I
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
src2	TokenNameIdentifier	 src2
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
src2I	TokenNameIdentifier	 src2 I
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
src1I	TokenNameIdentifier	 src1 I
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
x1	TokenNameIdentifier	 x1
=	TokenNameEQUAL	
src1	TokenNameIdentifier	 src1
[	TokenNameLBRACKET	
src1I	TokenNameIdentifier	 src1 I
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dstI	TokenNameIdentifier	 dst I
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rects	TokenNameIdentifier	 rects
=	TokenNameEQUAL	
dst	TokenNameIdentifier	 dst
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
mergeRects	TokenNameIdentifier	 merge Rects
(	TokenNameLPAREN	
int	TokenNameint	
overhead	TokenNameIdentifier	 overhead
,	TokenNameCOMMA	
int	TokenNameint	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
mr	TokenNameIdentifier	 mr
;	TokenNameSEMICOLON	
int	TokenNameint	
cost1	TokenNameIdentifier	 cost1
,	TokenNameCOMMA	
cost2	TokenNameIdentifier	 cost2
,	TokenNameCOMMA	
cost3	TokenNameIdentifier	 cost3
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splits	TokenNameIdentifier	 splits
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
cost1	TokenNameIdentifier	 cost1
=	TokenNameEQUAL	
(	TokenNameLPAREN	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
int	TokenNameint	
maxX	TokenNameIdentifier	 max X
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
+	TokenNamePLUS	
overhead	TokenNameIdentifier	 overhead
/	TokenNameDIVIDE	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cr	TokenNameIdentifier	 cr
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
==	TokenNameEQUAL_EQUAL	
r	TokenNameIdentifier	 r
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>=	TokenNameGREATER_EQUAL	
maxX	TokenNameIdentifier	 max X
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// No more merges can happen. 	TokenNameCOMMENT_LINE	No more merges can happen. 
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cost2	TokenNameIdentifier	 cost2
=	TokenNameEQUAL	
(	TokenNameLPAREN	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
cr	TokenNameIdentifier	 cr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mr	TokenNameIdentifier	 mr
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
union	TokenNameIdentifier	 union
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cost3	TokenNameIdentifier	 cost3
=	TokenNameEQUAL	
(	TokenNameLPAREN	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
mr	TokenNameIdentifier	 mr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cost3	TokenNameIdentifier	 cost3
<=	TokenNameLESS_EQUAL	
cost1	TokenNameIdentifier	 cost1
+	TokenNamePLUS	
cost2	TokenNameIdentifier	 cost2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
mr	TokenNameIdentifier	 mr
;	TokenNameSEMICOLON	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
cost1	TokenNameIdentifier	 cost1
=	TokenNameEQUAL	
cost3	TokenNameIdentifier	 cost3
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
splitRect	TokenNameIdentifier	 split Rect
(	TokenNameLPAREN	
cr	TokenNameIdentifier	 cr
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
splits	TokenNameIdentifier	 splits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
splitCost	TokenNameIdentifier	 split Cost
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Collapse null entries in first three 	TokenNameCOMMENT_LINE	Collapse null entries in first three 
// (That share common 'x'). 	TokenNameCOMMENT_LINE	(That share common 'x'). 
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
;	TokenNameSEMICOLON	
splitCost	TokenNameIdentifier	 split Cost
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
splitCost	TokenNameIdentifier	 split Cost
>=	TokenNameGREATER_EQUAL	
cost2	TokenNameIdentifier	 cost2
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Insert the splits. 	TokenNameCOMMENT_LINE	Insert the splits. 
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// only third split may be left (no common 'x'). 	TokenNameCOMMENT_LINE	only third split may be left (no common 'x'). 
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
insertRects	TokenNameIdentifier	 insert Rects
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
j	TokenNameIdentifier	 j
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if we merged it with another rect then 	TokenNameCOMMENT_LINE	if we merged it with another rect then 
// we need to check all the rects up to i again, 	TokenNameCOMMENT_LINE	we need to check all the rects up to i again, 
// against the merged rect. 	TokenNameCOMMENT_LINE	against the merged rect. 
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
!=	TokenNameNOT_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Now we will go through collapsing the nulled entries. 	TokenNameCOMMENT_LINE	Now we will go through collapsing the nulled entries. 
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
float	TokenNamefloat	
area	TokenNameIdentifier	 area
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
area	TokenNameIdentifier	 area
+=	TokenNamePLUS_EQUAL	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
getBounds	TokenNameIdentifier	 get Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
<	TokenNameLESS	
area	TokenNameIdentifier	 area
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
subtract	TokenNameIdentifier	 subtract
(	TokenNameLPAREN	
RectListManager	TokenNameIdentifier	 Rect List Manager
rlm	TokenNameIdentifier	 rlm
,	TokenNameCOMMA	
int	TokenNameint	
overhead	TokenNameIdentifier	 overhead
,	TokenNameCOMMA	
int	TokenNameint	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
sr	TokenNameIdentifier	 sr
;	TokenNameSEMICOLON	
int	TokenNameint	
cost	TokenNameIdentifier	 cost
;	TokenNameSEMICOLON	
int	TokenNameint	
jMin	TokenNameIdentifier	 j Min
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splits	TokenNameIdentifier	 splits
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
4	TokenNameIntegerLiteral	
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
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Canidate rect... 	TokenNameCOMMENT_LINE	Canidate rect... 
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
(	TokenNameLPAREN	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
jMin	TokenNameIdentifier	 j Min
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sr	TokenNameIdentifier	 sr
=	TokenNameEQUAL	
rlm	TokenNameIdentifier	 rlm
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// subtraction rect. 	TokenNameCOMMENT_LINE	subtraction rect. 
// Check if the canidate rect starts after 	TokenNameCOMMENT_LINE	Check if the canidate rect starts after 
// the end of this rect in 'x' if so 	TokenNameCOMMENT_LINE	the end of this rect in 'x' if so 
// go to the next one. 	TokenNameCOMMENT_LINE	go to the next one. 
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
<	TokenNameLESS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// If this was jMin then increment jMin (no 	TokenNameCOMMENT_LINE	If this was jMin then increment jMin (no 
// future canidate rect will intersect this rect). 	TokenNameCOMMENT_LINE	future canidate rect will intersect this rect). 
if	TokenNameif	
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
==	TokenNameEQUAL_EQUAL	
jMin	TokenNameIdentifier	 j Min
)	TokenNameRPAREN	
jMin	TokenNameIdentifier	 j Min
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Check if the rest of the rects from rlm are past 	TokenNameCOMMENT_LINE	Check if the rest of the rects from rlm are past 
// the end of the canidate rect. If so we are 	TokenNameCOMMENT_LINE	the end of the canidate rect. If so we are 
// done with this canidate rect. 	TokenNameCOMMENT_LINE	done with this canidate rect. 
if	TokenNameif	
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
// If they don't insersect then go to next sub rect. 	TokenNameCOMMENT_LINE	If they don't insersect then go to next sub rect. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
sr	TokenNameIdentifier	 sr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Now we know they intersect one another lets 	TokenNameCOMMENT_LINE	Now we know they intersect one another lets 
// figure out how... 	TokenNameCOMMENT_LINE	figure out how... 
splitRect	TokenNameIdentifier	 split Rect
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
sr	TokenNameIdentifier	 sr
,	TokenNameCOMMA	
splits	TokenNameIdentifier	 splits
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
splitCost	TokenNameIdentifier	 split Cost
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
tmpR	TokenNameIdentifier	 tmp R
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
4	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tmpR	TokenNameIdentifier	 tmp R
=	TokenNameEQUAL	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tmpR	TokenNameIdentifier	 tmp R
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
splitCost	TokenNameIdentifier	 split Cost
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
tmpR	TokenNameIdentifier	 tmp R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
tmpR	TokenNameIdentifier	 tmp R
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
tmpR	TokenNameIdentifier	 tmp R
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
splitCost	TokenNameIdentifier	 split Cost
>=	TokenNameGREATER_EQUAL	
cost	TokenNameIdentifier	 cost
)	TokenNameRPAREN	
// This isn't ideal as depending on the order 	TokenNameCOMMENT_LINE	This isn't ideal as depending on the order 
// Stuff is done in we might later kill some of 	TokenNameCOMMENT_LINE	Stuff is done in we might later kill some of 
// these rectangles (hence lowering the cost). 	TokenNameCOMMENT_LINE	these rectangles (hence lowering the cost). 
// For this reason it is probably best of the 	TokenNameCOMMENT_LINE	For this reason it is probably best of the 
// subtract list has been merged as this will help 	TokenNameCOMMENT_LINE	subtract list has been merged as this will help 
// reduce the instances where this will happen. 	TokenNameCOMMENT_LINE	reduce the instances where this will happen. 
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
// Collapse null entries in first three elements 	TokenNameCOMMENT_LINE	Collapse null entries in first three elements 
// split 0, 1, 2 (entries that share a common 'x'). 	TokenNameCOMMENT_LINE	split 0, 1, 2 (entries that share a common 'x'). 
int	TokenNameint	
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
l	TokenNameIdentifier	 l
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
k	TokenNameIdentifier	 k
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Fully covered (or only split 3 survived which we 	TokenNameCOMMENT_LINE	Fully covered (or only split 3 survived which we 
// will visit later) this canidate rect goes away. 	TokenNameCOMMENT_LINE	will visit later) this canidate rect goes away. 
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// Insert the third split (if any) at the 	TokenNameCOMMENT_LINE	Insert the third split (if any) at the 
// proper place in rects list. 	TokenNameCOMMENT_LINE	proper place in rects list. 
if	TokenNameif	
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Otherwise replace the canidate with the top of 	TokenNameCOMMENT_LINE	Otherwise replace the canidate with the top of 
// the split, since it only shrunk it didn't grow, 	TokenNameCOMMENT_LINE	the split, since it only shrunk it didn't grow, 
// we know that the previous subtract rects don't 	TokenNameCOMMENT_LINE	we know that the previous subtract rects don't 
// intersect it. 	TokenNameCOMMENT_LINE	intersect it. 
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
cost	TokenNameIdentifier	 cost
=	TokenNameEQUAL	
(	TokenNameLPAREN	
overhead	TokenNameIdentifier	 overhead
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
lineOverhead	TokenNameIdentifier	 line Overhead
)	TokenNameRPAREN	
+	TokenNamePLUS	
(	TokenNameLPAREN	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
*	TokenNameMULTIPLY	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Add the remainder of the rects that 	TokenNameCOMMENT_LINE	Add the remainder of the rects that 
// share 'r.x' (if any). Possible 	TokenNameCOMMENT_LINE	share 'r.x' (if any). Possible 
// are split 1, and split 2. 	TokenNameCOMMENT_LINE	are split 1, and split 2. 
if	TokenNameif	
(	TokenNameLPAREN	
l	TokenNameIdentifier	 l
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
insertRects	TokenNameIdentifier	 insert Rects
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
l	TokenNameIdentifier	 l
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Insert the third split (if any) at the 	TokenNameCOMMENT_LINE	Insert the third split (if any) at the 
// proper place in rects list. 	TokenNameCOMMENT_LINE	proper place in rects list. 
if	TokenNameif	
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
l	TokenNameIdentifier	 l
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Now we will go through collapsing the nulled entries. 	TokenNameCOMMENT_LINE	Now we will go through collapsing the nulled entries. 
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
width	TokenNameIdentifier	 width
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
else	TokenNameelse	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
j	TokenNameIdentifier	 j
;	TokenNameSEMICOLON	
bounds	TokenNameIdentifier	 bounds
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
splitRect	TokenNameIdentifier	 split Rect
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
sr	TokenNameIdentifier	 sr
,	TokenNameCOMMA	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
splits	TokenNameIdentifier	 splits
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We split the canidate rectrect into four parts. In 	TokenNameCOMMENT_LINE	We split the canidate rectrect into four parts. In 
// many cases one or more of these will be empty. 	TokenNameCOMMENT_LINE	many cases one or more of these will be empty. 
// 	TokenNameCOMMENT_LINE	 
// +-------------------------------------+ ry0 	TokenNameCOMMENT_LINE	+-------------------------------------+ ry0 
// | | 	TokenNameCOMMENT_LINE	| | 
// | | 	TokenNameCOMMENT_LINE	| | 
// | Split 0 | 	TokenNameCOMMENT_LINE	| Split 0 | 
// | | 	TokenNameCOMMENT_LINE	| | 
// | | 	TokenNameCOMMENT_LINE	| | 
// ------------+-----------------+--------------- sry0 	TokenNameCOMMENT_LINE	------------+-----------------+--------------- sry0 
// | | | | 	TokenNameCOMMENT_LINE	| | | | 
// | Split2 | subtracted | Split 3 | 	TokenNameCOMMENT_LINE	| Split2 | subtracted | Split 3 | 
// | | rect | | 	TokenNameCOMMENT_LINE	| | rect | | 
// | | | | 	TokenNameCOMMENT_LINE	| | | | 
// ------------+-----------------+--------------- sry1 	TokenNameCOMMENT_LINE	------------+-----------------+--------------- sry1 
// | srx0 srx1 | 	TokenNameCOMMENT_LINE	| srx0 srx1 | 
// | | 	TokenNameCOMMENT_LINE	| | 
// | Split 1 | 	TokenNameCOMMENT_LINE	| Split 1 | 
// | | 	TokenNameCOMMENT_LINE	| | 
// +-------------------------------------+ ry1 	TokenNameCOMMENT_LINE	+-------------------------------------+ ry1 
// rx0 rx1 	TokenNameCOMMENT_LINE	rx0 rx1 
int	TokenNameint	
rx0	TokenNameIdentifier	 rx0
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
rx1	TokenNameIdentifier	 rx1
=	TokenNameEQUAL	
rx0	TokenNameIdentifier	 rx0
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
ry0	TokenNameIdentifier	 ry0
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
int	TokenNameint	
ry1	TokenNameIdentifier	 ry1
=	TokenNameEQUAL	
ry0	TokenNameIdentifier	 ry0
+	TokenNamePLUS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
srx0	TokenNameIdentifier	 srx0
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
int	TokenNameint	
srx1	TokenNameIdentifier	 srx1
=	TokenNameEQUAL	
srx0	TokenNameIdentifier	 srx0
+	TokenNamePLUS	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
width	TokenNameIdentifier	 width
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sry0	TokenNameIdentifier	 sry0
=	TokenNameEQUAL	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
y	TokenNameIdentifier	 y
;	TokenNameSEMICOLON	
int	TokenNameint	
sry1	TokenNameIdentifier	 sry1
=	TokenNameEQUAL	
sry0	TokenNameIdentifier	 sry0
+	TokenNamePLUS	
sr	TokenNameIdentifier	 sr
.	TokenNameDOT	
height	TokenNameIdentifier	 height
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ry0	TokenNameIdentifier	 ry0
<	TokenNameLESS	
sry0	TokenNameIdentifier	 sry0
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ry1	TokenNameIdentifier	 ry1
>=	TokenNameGREATER_EQUAL	
sry0	TokenNameIdentifier	 sry0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
,	TokenNameCOMMA	
ry0	TokenNameIdentifier	 ry0
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
sry0	TokenNameIdentifier	 sry0
-	TokenNameMINUS	
ry0	TokenNameIdentifier	 ry0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ry0	TokenNameIdentifier	 ry0
=	TokenNameEQUAL	
sry0	TokenNameIdentifier	 sry0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ry0	TokenNameIdentifier	 ry0
<=	TokenNameLESS_EQUAL	
sry1	TokenNameIdentifier	 sry1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
ry1	TokenNameIdentifier	 ry1
>	TokenNameGREATER	
sry1	TokenNameIdentifier	 sry1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
,	TokenNameCOMMA	
sry1	TokenNameIdentifier	 sry1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
width	TokenNameIdentifier	 width
,	TokenNameCOMMA	
ry1	TokenNameIdentifier	 ry1
-	TokenNameMINUS	
sry1	TokenNameIdentifier	 sry1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ry1	TokenNameIdentifier	 ry1
=	TokenNameEQUAL	
sry1	TokenNameIdentifier	 sry1
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
<	TokenNameLESS	
srx0	TokenNameIdentifier	 srx0
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
rx1	TokenNameIdentifier	 rx1
>=	TokenNameGREATER_EQUAL	
srx0	TokenNameIdentifier	 srx0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
,	TokenNameCOMMA	
ry0	TokenNameIdentifier	 ry0
,	TokenNameCOMMA	
srx0	TokenNameIdentifier	 srx0
-	TokenNameMINUS	
rx0	TokenNameIdentifier	 rx0
,	TokenNameCOMMA	
ry1	TokenNameIdentifier	 ry1
-	TokenNameMINUS	
ry0	TokenNameIdentifier	 ry0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
rx0	TokenNameIdentifier	 rx0
<=	TokenNameLESS_EQUAL	
srx1	TokenNameIdentifier	 srx1
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
rx1	TokenNameIdentifier	 rx1
>	TokenNameGREATER	
srx1	TokenNameIdentifier	 srx1
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
(	TokenNameLPAREN	
srx1	TokenNameIdentifier	 srx1
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ry0	TokenNameIdentifier	 ry0
,	TokenNameCOMMA	
rx1	TokenNameIdentifier	 rx1
-	TokenNameMINUS	
srx1	TokenNameIdentifier	 srx1
,	TokenNameCOMMA	
ry1	TokenNameIdentifier	 ry1
-	TokenNameMINUS	
ry0	TokenNameIdentifier	 ry0
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
splits	TokenNameIdentifier	 splits
[	TokenNameLBRACKET	
3	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
insertRects	TokenNameIdentifier	 insert Rects
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
int	TokenNameint	
srcPos	TokenNameIdentifier	 src Pos
,	TokenNameCOMMA	
int	TokenNameint	
dstPos	TokenNameIdentifier	 dst Pos
,	TokenNameCOMMA	
int	TokenNameint	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// Make sure we have room. 	TokenNameCOMMENT_LINE	Make sure we have room. 
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Move everything after pos up... 	TokenNameCOMMENT_LINE	Move everything after pos up... 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
dstPos	TokenNameIdentifier	 dst Pos
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Put the new rects in. 	TokenNameCOMMENT_LINE	Put the new rects in. 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
srcPos	TokenNameIdentifier	 src Pos
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
dstPos	TokenNameIdentifier	 dst Pos
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
int	TokenNameint	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sz	TokenNameIdentifier	 sz
<=	TokenNameLESS_EQUAL	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
nSz	TokenNameIdentifier	 n Sz
=	TokenNameEQUAL	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
nSz	TokenNameIdentifier	 n Sz
<	TokenNameLESS	
sz	TokenNameIdentifier	 sz
)	TokenNameRPAREN	
nSz	TokenNameIdentifier	 n Sz
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
nSz	TokenNameIdentifier	 n Sz
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
nRects	TokenNameIdentifier	 n Rects
=	TokenNameEQUAL	
new	TokenNamenew	
Rectangle	TokenNameIdentifier	 Rectangle
[	TokenNameLBRACKET	
nSz	TokenNameIdentifier	 n Sz
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
nRects	TokenNameIdentifier	 n Rects
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rects	TokenNameIdentifier	 rects
=	TokenNameEQUAL	
nRects	TokenNameIdentifier	 n Rects
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Comparator for ordering rects in X. * * Note: this comparator imposes orderings that are inconsistent * with equals. */	TokenNameCOMMENT_JAVADOC	 Comparator for ordering rects in X. * Note: this comparator imposes orderings that are inconsistent with equals. 
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
RectXComparator	TokenNameIdentifier	 Rect X Comparator
implements	TokenNameimplements	
Comparator	TokenNameIdentifier	 Comparator
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
RectXComparator	TokenNameIdentifier	 Rect X Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
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
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
o1	TokenNameIdentifier	 o1
)	TokenNameRPAREN	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
-	TokenNameMINUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
RLMIterator	TokenNameIdentifier	 RLM Iterator
implements	TokenNameimplements	
ListIterator	TokenNameIdentifier	 List Iterator
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
removeOk	TokenNameIdentifier	 remove Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
forward	TokenNameIdentifier	 forward
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
RLMIterator	TokenNameIdentifier	 RLM Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
nextIndex	TokenNameIdentifier	 next Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
"No Next Element"	TokenNameStringLiteral	No Next Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
forward	TokenNameIdentifier	 forward
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
removeOk	TokenNameIdentifier	 remove Ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasPrevious	TokenNameIdentifier	 has Previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
previousIndex	TokenNameIdentifier	 previous Index
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
previous	TokenNameIdentifier	 previous
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
"No Previous Element"	TokenNameStringLiteral	No Previous Element
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
forward	TokenNameIdentifier	 forward
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
removeOk	TokenNameIdentifier	 remove Ok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
removeOk	TokenNameIdentifier	 remove Ok
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"remove can only be called directly after next/previous"	TokenNameStringLiteral	remove can only be called directly after next/previous
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
size	TokenNameIdentifier	 size
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
removeOk	TokenNameIdentifier	 remove Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
removeOk	TokenNameIdentifier	 remove Ok
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"set can only be called directly after next/previous"	TokenNameStringLiteral	set can only be called directly after next/previous
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
forward	TokenNameIdentifier	 forward
)	TokenNameRPAREN	
idx	TokenNameIdentifier	 idx
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"RectListManager entries must be sorted"	TokenNameStringLiteral	RectListManager entries must be sorted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"RectListManager entries must be sorted"	TokenNameStringLiteral	RectListManager entries must be sorted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
removeOk	TokenNameIdentifier	 remove Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Rectangle	TokenNameIdentifier	 Rectangle
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Rectangle	TokenNameIdentifier	 Rectangle
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
<	TokenNameLESS	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"RectListManager entries must be sorted"	TokenNameStringLiteral	RectListManager entries must be sorted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
x	TokenNameIdentifier	 x
>	TokenNameGREATER	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
x	TokenNameIdentifier	 x
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
"RectListManager entries must be sorted"	TokenNameStringLiteral	RectListManager entries must be sorted
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ensureCapacity	TokenNameIdentifier	 ensure Capacity
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
!=	TokenNameNOT_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
rects	TokenNameIdentifier	 rects
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
-	TokenNameMINUS	
idx	TokenNameIdentifier	 idx
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rects	TokenNameIdentifier	 rects
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
idx	TokenNameIdentifier	 idx
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
removeOk	TokenNameIdentifier	 remove Ok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
