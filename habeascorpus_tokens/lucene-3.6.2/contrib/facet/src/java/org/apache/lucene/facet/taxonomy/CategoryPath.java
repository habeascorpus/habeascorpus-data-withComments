package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * A CategoryPath holds a sequence of string components, specifying the * hierarchical name of a category. * <P> * CategoryPath is designed to reduce the number of object allocations, in two * ways: First, it keeps the components internally in two arrays, rather than * keeping individual strings. Second, it allows reusing the same CategoryPath * object (which can be clear()ed and new components add()ed again) and of * add()'s parameter (which can be a reusable object, not just a string). * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 A CategoryPath holds a sequence of string components, specifying the hierarchical name of a category. <P> CategoryPath is designed to reduce the number of object allocations, in two ways: First, it keeps the components internally in two arrays, rather than keeping individual strings. Second, it allows reusing the same CategoryPath object (which can be clear()ed and new components add()ed again) and of add()'s parameter (which can be a reusable object, not just a string). * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CategoryPath	TokenNameIdentifier	 Category Path
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Comparable	TokenNameIdentifier	 Comparable
<	TokenNameLESS	
CategoryPath	TokenNameIdentifier	 Category Path
>	TokenNameGREATER	
{	TokenNameLBRACE	
// A category path is a sequence of string components. It is kept 	TokenNameCOMMENT_LINE	A category path is a sequence of string components. It is kept 
// internally as one large character array "chars" with all the string 	TokenNameCOMMENT_LINE	internally as one large character array "chars" with all the string 
// concatenated (without separators), and an array of integers "ends" 	TokenNameCOMMENT_LINE	concatenated (without separators), and an array of integers "ends" 
// pointing to the/ end of each component. Both arrays may be larger 	TokenNameCOMMENT_LINE	pointing to the/ end of each component. Both arrays may be larger 
// than actually in use. An additional integer, "ncomponents" specifies 	TokenNameCOMMENT_LINE	than actually in use. An additional integer, "ncomponents" specifies 
// how many components are actually set. 	TokenNameCOMMENT_LINE	how many components are actually set. 
// We use shorts instead of ints for "ends" to save a bit of space. This 	TokenNameCOMMENT_LINE	We use shorts instead of ints for "ends" to save a bit of space. This 
// means that our path lengths are limited to 32767 characters - which 	TokenNameCOMMENT_LINE	means that our path lengths are limited to 32767 characters - which 
// should not be a problem in any realistic scenario. 	TokenNameCOMMENT_LINE	should not be a problem in any realistic scenario. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
chars	TokenNameIdentifier	 chars
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ends	TokenNameIdentifier	 ends
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
short	TokenNameshort	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
/** * Return the number of components in the facet path. Note that this is * <I>not</I> the number of characters, but the number of components. */	TokenNameCOMMENT_JAVADOC	 Return the number of components in the facet path. Note that this is <I>not</I> the number of characters, but the number of components. 
public	TokenNamepublic	
short	TokenNameshort	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Trim the last components from the path. * * @param nTrim * Number of components to trim. If larger than the number of * components this path has, the entire path will be cleared. */	TokenNameCOMMENT_JAVADOC	 Trim the last components from the path. * @param nTrim Number of components to trim. If larger than the number of components this path has, the entire path will be cleared. 
public	TokenNamepublic	
void	TokenNamevoid	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
int	TokenNameint	
nTrim	TokenNameIdentifier	 n Trim
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nTrim	TokenNameIdentifier	 n Trim
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
nTrim	TokenNameIdentifier	 n Trim
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
-=	TokenNameMINUS_EQUAL	
nTrim	TokenNameIdentifier	 n Trim
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the current character capacity of the CategoryPath. The character * capacity is the size of the internal buffer used to hold the characters * of all the path's components. When a component is added and the capacity * is not big enough, the buffer is automatically grown, and capacityChars() * increases. */	TokenNameCOMMENT_JAVADOC	 Returns the current character capacity of the CategoryPath. The character capacity is the size of the internal buffer used to hold the characters of all the path's components. When a component is added and the capacity is not big enough, the buffer is automatically grown, and capacityChars() increases. 
public	TokenNamepublic	
int	TokenNameint	
capacityChars	TokenNameIdentifier	 capacity Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the current component capacity of the CategoryPath. The component * capacity is the maximum number of components that the internal buffer can * currently hold. When a component is added beyond this capacity, the * buffer is automatically grown, and capacityComponents() increases. */	TokenNameCOMMENT_JAVADOC	 Returns the current component capacity of the CategoryPath. The component capacity is the maximum number of components that the internal buffer can currently hold. When a component is added beyond this capacity, the buffer is automatically grown, and capacityComponents() increases. 
public	TokenNamepublic	
int	TokenNameint	
capacityComponents	TokenNameIdentifier	 capacity Components
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new empty CategoryPath object. CategoryPath objects are meant * to be reused, by add()ing components, and later clear()ing, and add()ing * components again. The CategoryPath object is created with a buffer * pre-allocated for a given number of characters and components, but the * buffer will grow as necessary (see {@link #capacityChars()} and * {@link #capacityComponents()}). */	TokenNameCOMMENT_JAVADOC	 Construct a new empty CategoryPath object. CategoryPath objects are meant to be reused, by add()ing components, and later clear()ing, and add()ing components again. The CategoryPath object is created with a buffer pre-allocated for a given number of characters and components, but the buffer will grow as necessary (see {@link #capacityChars()} and {@link #capacityComponents()}). 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
int	TokenNameint	
capacityChars	TokenNameIdentifier	 capacity Chars
,	TokenNameCOMMA	
int	TokenNameint	
capacityComponents	TokenNameIdentifier	 capacity Components
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
capacityChars	TokenNameIdentifier	 capacity Chars
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
capacityComponents	TokenNameIdentifier	 capacity Components
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an empty CategoryPath object. Equivalent to the constructor * {@link #CategoryPath(int, int)} with the two initial-capacity arguments * set to zero. */	TokenNameCOMMENT_JAVADOC	 Create an empty CategoryPath object. Equivalent to the constructor {@link #CategoryPath(int, int)} with the two initial-capacity arguments set to zero. 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the given component to the end of the path. * <P> * Note that when a String object is passed to this method, a reference to * it is not saved (rather, its content is copied), which will lead to that * String object being gc'ed. To reduce the number of garbage objects, you * can pass a mutable CharBuffer instead of an immutable String to this * method. */	TokenNameCOMMENT_JAVADOC	 Add the given component to the end of the path. <P> Note that when a String object is passed to this method, a reference to it is not saved (rather, its content is copied), which will lead to that String object being gc'ed. To reduce the number of garbage objects, you can pass a mutable CharBuffer instead of an immutable String to this method. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
component	TokenNameIdentifier	 component
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Set the new end, increasing the "ends" array sizes if necessary: 	TokenNameCOMMENT_LINE	Set the new end, increasing the "ends" array sizes if necessary: 
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
>=	TokenNameGREATER_EQUAL	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newends	TokenNameIdentifier	 newends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newends	TokenNameIdentifier	 newends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
newends	TokenNameIdentifier	 newends
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
short	TokenNameshort	
prevend	TokenNameIdentifier	 prevend
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
cmplen	TokenNameIdentifier	 cmplen
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
prevend	TokenNameIdentifier	 prevend
+	TokenNamePLUS	
cmplen	TokenNameIdentifier	 cmplen
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Copy the new component's characters, increasing the "chars" array 	TokenNameCOMMENT_LINE	Copy the new component's characters, increasing the "chars" array 
// sizes if necessary: 	TokenNameCOMMENT_LINE	sizes if necessary: 
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
]	TokenNameRBRACKET	
>	TokenNameGREATER	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newchars	TokenNameIdentifier	 newchars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
]	TokenNameRBRACKET	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newchars	TokenNameIdentifier	 newchars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
newchars	TokenNameIdentifier	 newchars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
cmplen	TokenNameIdentifier	 cmplen
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
prevend	TokenNameIdentifier	 prevend
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
component	TokenNameIdentifier	 component
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ncomponents	TokenNameIdentifier	 ncomponents
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Empty the CategoryPath object, so that it has zero components. The * capacity of the object (see {@link #capacityChars()} and * {@link #capacityComponents()}) is not reduced, so that the object can be * reused without frequent reallocations. */	TokenNameCOMMENT_JAVADOC	 Empty the CategoryPath object, so that it has zero components. The capacity of the object (see {@link #capacityChars()} and {@link #capacityComponents()}) is not reduced, so that the object can be reused without frequent reallocations. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Build a string representation of the path, with its components separated * by the given delimiter character. The resulting string is appended to a * given Appendable, e.g., a StringBuilder, CharBuffer or Writer. * <P> * Note that the two cases of zero components and one component with zero * length produce indistinguishable results (both of them append nothing). * This is normally not a problem, because components should not normally * have zero lengths. * <P> * An IOException can be thrown if the given Appendable's append() throws * this exception. */	TokenNameCOMMENT_JAVADOC	 Build a string representation of the path, with its components separated by the given delimiter character. The resulting string is appended to a given Appendable, e.g., a StringBuilder, CharBuffer or Writer. <P> Note that the two cases of zero components and one component with zero length produce indistinguishable results (both of them append nothing). This is normally not a problem, because components should not normally have zero lengths. <P> An IOException can be thrown if the given Appendable's append() throws this exception. 
public	TokenNamepublic	
void	TokenNamevoid	
appendTo	TokenNameIdentifier	 append To
(	TokenNameLPAREN	
Appendable	TokenNameIdentifier	 Appendable
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// just append nothing... 	TokenNameCOMMENT_LINE	just append nothing... 
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * like {@link #appendTo(Appendable, char)}, but takes only a prefix of the * path, rather than the whole path. * <P> * If the given prefix length is negative or bigger than the path's actual * length, the whole path is taken. */	TokenNameCOMMENT_JAVADOC	 like {@link #appendTo(Appendable, char)}, but takes only a prefix of the path, rather than the whole path. <P> If the given prefix length is negative or bigger than the path's actual length, the whole path is taken. 
public	TokenNamepublic	
void	TokenNamevoid	
appendTo	TokenNameIdentifier	 append To
(	TokenNameLPAREN	
Appendable	TokenNameIdentifier	 Appendable
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefixLen	TokenNameIdentifier	 prefix Len
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixLen	TokenNameIdentifier	 prefix Len
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// just append nothing... 	TokenNameCOMMENT_LINE	just append nothing... 
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
prefixLen	TokenNameIdentifier	 prefix Len
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * like {@link #appendTo(Appendable, char)}, but takes only a part of the * path, rather than the whole path. * <P> * <code>start</code> specifies the first component in the subpath, and * <code>end</code> is one past the last component. If <code>start</code> is * negative, 0 is assumed, and if <code>end</code> is negative or past the * end of the path, the path is taken until the end. Otherwise, if * <code>end<=start</code>, nothing is appended. Nothing is appended also in * the case that the path is empty. */	TokenNameCOMMENT_JAVADOC	 like {@link #appendTo(Appendable, char)}, but takes only a part of the path, rather than the whole path. <P> <code>start</code> specifies the first component in the subpath, and <code>end</code> is one past the last component. If <code>start</code> is negative, 0 is assumed, and if <code>end</code> is negative or past the end of the path, the path is taken until the end. Otherwise, if <code>end<=start</code>, nothing is appended. Nothing is appended also in the case that the path is empty. 
public	TokenNamepublic	
void	TokenNamevoid	
appendTo	TokenNameIdentifier	 append To
(	TokenNameLPAREN	
Appendable	TokenNameIdentifier	 Appendable
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<=	TokenNameLESS_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// just append nothing... 	TokenNameCOMMENT_LINE	just append nothing... 
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Build a string representation of the path, with its components separated * by the given delimiter character. The resulting string is returned as a * new String object. To avoid this temporary object creation, consider * using {@link #appendTo(Appendable, char)} instead. * <P> * Note that the two cases of zero components and one component with zero * length produce indistinguishable results (both of them return an empty * string). This is normally not a problem, because components should not * normally have zero lengths. */	TokenNameCOMMENT_JAVADOC	 Build a string representation of the path, with its components separated by the given delimiter character. The resulting string is returned as a new String object. To avoid this temporary object creation, consider using {@link #appendTo(Appendable, char)} instead. <P> Note that the two cases of zero components and one component with zero length produce indistinguishable results (both of them return an empty string). This is normally not a problem, because components should not normally have zero lengths. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
appendTo	TokenNameIdentifier	 append To
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen, because StringBuilder.append() never actually 	TokenNameCOMMENT_LINE	can't happen, because StringBuilder.append() never actually 
// throws an exception! 	TokenNameCOMMENT_LINE	throws an exception! 
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method, an implementation of the {@link Object#toString()} * interface, is to allow simple printing of a CategoryPath, for debugging * purposes. When possible, it recommended to avoid using it it, and rather, * if you want to output the path with its components separated by a * delimiter character, specify the delimiter explicitly, with * {@link #toString(char)}. */	TokenNameCOMMENT_JAVADOC	 This method, an implementation of the {@link Object#toString()} interface, is to allow simple printing of a CategoryPath, for debugging purposes. When possible, it recommended to avoid using it it, and rather, if you want to output the path with its components separated by a delimiter character, specify the delimiter explicitly, with {@link #toString(char)}. 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * like {@link #toString(char)}, but takes only a prefix with a given number * of components, rather than the whole path. * <P> * If the given length is negative or bigger than the path's actual length, * the whole path is taken. */	TokenNameCOMMENT_JAVADOC	 like {@link #toString(char)}, but takes only a prefix with a given number of components, rather than the whole path. <P> If the given length is negative or bigger than the path's actual length, the whole path is taken. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefixLen	TokenNameIdentifier	 prefix Len
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixLen	TokenNameIdentifier	 prefix Len
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
prefixLen	TokenNameIdentifier	 prefix Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
appendTo	TokenNameIdentifier	 append To
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen, because sb.append() never actually throws an 	TokenNameCOMMENT_LINE	can't happen, because sb.append() never actually throws an 
// exception 	TokenNameCOMMENT_LINE	exception 
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * like {@link #toString(char)}, but takes only a part of the path, rather * than the whole path. * <P> * <code>start</code> specifies the first component in the subpath, and * <code>end</code> is one past the last component. If <code>start</code> is * negative, 0 is assumed, and if <code>end</code> is negative or past the * end of the path, the path is taken until the end. Otherwise, if * <code>end<=start</code>, an empty string is returned. An emptry string is * returned also in the case that the path is empty. */	TokenNameCOMMENT_JAVADOC	 like {@link #toString(char)}, but takes only a part of the path, rather than the whole path. <P> <code>start</code> specifies the first component in the subpath, and <code>end</code> is one past the last component. If <code>start</code> is negative, 0 is assumed, and if <code>end</code> is negative or past the end of the path, the path is taken until the end. Otherwise, if <code>end<=start</code>, an empty string is returned. An emptry string is returned also in the case that the path is empty. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
int	TokenNameint	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
start	TokenNameIdentifier	 start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
end	TokenNameIdentifier	 end
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
<=	TokenNameLESS_EQUAL	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
startchar	TokenNameIdentifier	 startchar
=	TokenNameEQUAL	
(	TokenNameLPAREN	
start	TokenNameIdentifier	 start
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
startchar	TokenNameIdentifier	 startchar
+	TokenNamePLUS	
(	TokenNameLPAREN	
end	TokenNameIdentifier	 end
-	TokenNameMINUS	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
appendTo	TokenNameIdentifier	 append To
(	TokenNameLPAREN	
sb	TokenNameIdentifier	 sb
,	TokenNameCOMMA	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
end	TokenNameIdentifier	 end
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen, because sb.append() never actually throws an 	TokenNameCOMMENT_LINE	can't happen, because sb.append() never actually throws an 
// exception 	TokenNameCOMMENT_LINE	exception 
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the i'th component of the path, in a new String object. If there * is no i'th component, a null is returned. */	TokenNameCOMMENT_JAVADOC	 Return the i'th component of the path, in a new String object. If there is no i'th component, a null is returned. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getComponent	TokenNameIdentifier	 get Component
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
-	TokenNameMINUS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the last component of the path, in a new String object. If the * path is empty, a null is returned. */	TokenNameCOMMENT_JAVADOC	 Return the last component of the path, in a new String object. If the path is empty, a null is returned. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
lastComponent	TokenNameIdentifier	 last Component
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
-	TokenNameMINUS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Copies the specified number of components from this category path to the * specified character array, with the components separated by a given * delimiter character. The array must be large enough to hold the * components and separators - the amount of needed space can be calculated * with {@link #charsNeededForFullPath()}. * <P> * This method returns the number of characters written to the array. * * @param outputBuffer * The destination character array. * @param outputBufferStart * The first location to write in the output array. * @param numberOfComponentsToCopy * The number of path components to write to the destination * buffer. * @param separatorChar * The separator inserted between every pair of path components * in the output buffer. * @see #charsNeededForFullPath() */	TokenNameCOMMENT_JAVADOC	 Copies the specified number of components from this category path to the specified character array, with the components separated by a given delimiter character. The array must be large enough to hold the components and separators - the amount of needed space can be calculated with {@link #charsNeededForFullPath()}. <P> This method returns the number of characters written to the array. * @param outputBuffer The destination character array. @param outputBufferStart The first location to write in the output array. @param numberOfComponentsToCopy The number of path components to write to the destination buffer. @param separatorChar The separator inserted between every pair of path components in the output buffer. @see #charsNeededForFullPath() 
public	TokenNamepublic	
int	TokenNameint	
copyToCharArray	TokenNameIdentifier	 copy To Char Array
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
outputBuffer	TokenNameIdentifier	 output Buffer
,	TokenNameCOMMA	
int	TokenNameint	
outputBufferStart	TokenNameIdentifier	 output Buffer Start
,	TokenNameCOMMA	
int	TokenNameint	
numberOfComponentsToCopy	TokenNameIdentifier	 number Of Components To Copy
,	TokenNameCOMMA	
char	TokenNamechar	
separatorChar	TokenNameIdentifier	 separator Char
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numberOfComponentsToCopy	TokenNameIdentifier	 number Of Components To Copy
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
numberOfComponentsToCopy	TokenNameIdentifier	 number Of Components To Copy
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
numberOfComponentsToCopy	TokenNameIdentifier	 number Of Components To Copy
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
numberOfComponentsToCopy	TokenNameIdentifier	 number Of Components To Copy
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
outputBufferInitialStart	TokenNameIdentifier	 output Buffer Initial Start
=	TokenNameEQUAL	
outputBufferStart	TokenNameIdentifier	 output Buffer Start
;	TokenNameSEMICOLON	
// for calculating 	TokenNameCOMMENT_LINE	for calculating 
// chars copied. 	TokenNameCOMMENT_LINE	chars copied. 
int	TokenNameint	
sourceStart	TokenNameIdentifier	 source Start
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
sourceLength	TokenNameIdentifier	 source Length
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
component	TokenNameIdentifier	 component
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
component	TokenNameIdentifier	 component
<	TokenNameLESS	
numberOfComponentsToCopy	TokenNameIdentifier	 number Of Components To Copy
;	TokenNameSEMICOLON	
component	TokenNameIdentifier	 component
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
component	TokenNameIdentifier	 component
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sourceStart	TokenNameIdentifier	 source Start
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
component	TokenNameIdentifier	 component
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sourceLength	TokenNameIdentifier	 source Length
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
component	TokenNameIdentifier	 component
]	TokenNameRBRACKET	
-	TokenNameMINUS	
sourceStart	TokenNameIdentifier	 source Start
;	TokenNameSEMICOLON	
outputBuffer	TokenNameIdentifier	 output Buffer
[	TokenNameLBRACKET	
outputBufferStart	TokenNameIdentifier	 output Buffer Start
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
separatorChar	TokenNameIdentifier	 separator Char
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
sourceStart	TokenNameIdentifier	 source Start
,	TokenNameCOMMA	
outputBuffer	TokenNameIdentifier	 output Buffer
,	TokenNameCOMMA	
outputBufferStart	TokenNameIdentifier	 output Buffer Start
,	TokenNameCOMMA	
sourceLength	TokenNameIdentifier	 source Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
outputBufferStart	TokenNameIdentifier	 output Buffer Start
+=	TokenNamePLUS_EQUAL	
sourceLength	TokenNameIdentifier	 source Length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
outputBufferStart	TokenNameIdentifier	 output Buffer Start
-	TokenNameMINUS	
outputBufferInitialStart	TokenNameIdentifier	 output Buffer Initial Start
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the number of characters required to represent this entire * category path, if written using * {@link #copyToCharArray(char[], int, int, char)} or * {@link #appendTo(Appendable, char)}. This includes the number of * characters in all the components, plus the number of separators between * them (each one character in the aforementioned methods). */	TokenNameCOMMENT_JAVADOC	 Returns the number of characters required to represent this entire category path, if written using {@link #copyToCharArray(char[], int, int, char)} or {@link #appendTo(Appendable, char)}. This includes the number of characters in all the components, plus the number of separators between them (each one character in the aforementioned methods). 
public	TokenNamepublic	
int	TokenNameint	
charsNeededForFullPath	TokenNameIdentifier	 chars Needed For Full Path
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new CategoryPath object, given a single string with * components separated by a given delimiter character. * <P> * The initial capacity of the constructed object will be exactly what is * needed to hold the given path. This fact is convenient when creating a * temporary object that will not be reused later. */	TokenNameCOMMENT_JAVADOC	 Construct a new CategoryPath object, given a single string with components separated by a given delimiter character. <P> The initial capacity of the constructed object will be exactly what is needed to hold the given path. This fact is convenient when creating a temporary object that will not be reused later. 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
pathString	TokenNameIdentifier	 path String
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// This constructor is often used for creating a temporary object 	TokenNameCOMMENT_LINE	This constructor is often used for creating a temporary object 
// (one which will not be reused to hold multiple paths), so we want 	TokenNameCOMMENT_LINE	(one which will not be reused to hold multiple paths), so we want 
// to do our best to allocate exactly the needed size - not less (to 	TokenNameCOMMENT_LINE	to do our best to allocate exactly the needed size - not less (to 
// avoid reallocation) and not more (so as not to waste space). 	TokenNameCOMMENT_LINE	avoid reallocation) and not more (so as not to waste space). 
// To do this, we unfortunately need to make an additional pass on the 	TokenNameCOMMENT_LINE	To do this, we unfortunately need to make an additional pass on the 
// given string: 	TokenNameCOMMENT_LINE	given string: 
int	TokenNameint	
nparts	TokenNameIdentifier	 nparts
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nparts	TokenNameIdentifier	 nparts
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
nparts	TokenNameIdentifier	 nparts
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
nparts	TokenNameIdentifier	 nparts
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
pathString	TokenNameIdentifier	 path String
,	TokenNameCOMMA	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add the given components to the end of the path. The components are given * in a single string, separated by a given delimiter character. If the * given string is empty, it is assumed to refer to the root (empty) * category, and nothing is added to the path (rather than adding a single * empty component). * <P> * Note that when a String object is passed to this method, a reference to * it is not saved (rather, its content is copied), which will lead to that * String object being gc'ed. To reduce the number of garbage objects, you * can pass a mutable CharBuffer instead of an immutable String to this * method. */	TokenNameCOMMENT_JAVADOC	 Add the given components to the end of the path. The components are given in a single string, separated by a given delimiter character. If the given string is empty, it is assumed to refer to the root (empty) category, and nothing is added to the path (rather than adding a single empty component). <P> Note that when a String object is passed to this method, a reference to it is not saved (rather, its content is copied), which will lead to that String object being gc'ed. To reduce the number of garbage objects, you can pass a mutable CharBuffer instead of an immutable String to this method. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
pathString	TokenNameIdentifier	 path String
,	TokenNameCOMMA	
char	TokenNamechar	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// assume root category meant, so add nothing. 	TokenNameCOMMENT_LINE	assume root category meant, so add nothing. 
}	TokenNameRBRACE	
short	TokenNameshort	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
pathString	TokenNameIdentifier	 path String
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
delimiter	TokenNameIdentifier	 delimiter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
>=	TokenNameGREATER_EQUAL	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newends	TokenNameIdentifier	 newends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newends	TokenNameIdentifier	 newends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
newends	TokenNameIdentifier	 newends
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
>=	TokenNameGREATER_EQUAL	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newchars	TokenNameIdentifier	 newchars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newchars	TokenNameIdentifier	 newchars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
newchars	TokenNameIdentifier	 newchars
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Don't forget to count the last component! 	TokenNameCOMMENT_LINE	Don't forget to count the last component! 
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
>=	TokenNameGREATER_EQUAL	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
short	TokenNameshort	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newends	TokenNameIdentifier	 newends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newends	TokenNameIdentifier	 newends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
newends	TokenNameIdentifier	 newends
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new CategoryPath object, copying an existing path given as an * array of strings. * <P> * The new object occupies exactly the space it needs, without any spare * capacity. This is the expected behavior in the typical use case, where * this constructor is used to create a temporary object which is never * reused. */	TokenNameCOMMENT_JAVADOC	 Construct a new CategoryPath object, copying an existing path given as an array of strings. <P> The new object occupies exactly the space it needs, without any spare capacity. This is the expected behavior in the typical use case, where this constructor is used to create a temporary object which is never reused. 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
...	TokenNameELLIPSIS	
components	TokenNameIdentifier	 components
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
components	TokenNameIdentifier	 components
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
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
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
+	TokenNamePLUS	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
CharSequence	TokenNameIdentifier	 Char Sequence
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cs	TokenNameIdentifier	 cs
=	TokenNameEQUAL	
components	TokenNameIdentifier	 components
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cs	TokenNameIdentifier	 cs
instanceof	TokenNameinstanceof	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
cs	TokenNameIdentifier	 cs
)	TokenNameRPAREN	
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
cs	TokenNameIdentifier	 cs
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
j	TokenNameIdentifier	 j
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Construct a new CategoryPath object, copying the path given in an * existing CategoryPath object. * <P> * This copy-constructor is handy when you need to save a reference to a * CategoryPath (e.g., when it serves as a key to a hash-table), but cannot * save a reference to the original object because its contents can be * changed later by the user. Copying the contents into a new object is a * solution. * <P> * This constructor </I>does not</I> copy the capacity (spare buffer size) * of the existing CategoryPath. Rather, the new object occupies exactly the * space it needs, without any spare. This is the expected behavior in the * typical use case outlined in the previous paragraph. */	TokenNameCOMMENT_JAVADOC	 Construct a new CategoryPath object, copying the path given in an existing CategoryPath object. <P> This copy-constructor is handy when you need to save a reference to a CategoryPath (e.g., when it serves as a key to a hash-table), but cannot save a reference to the original object because its contents can be changed later by the user. Copying the contents into a new object is a solution. <P> This constructor </I>does not</I> copy the capacity (spare buffer size) of the existing CategoryPath. Rather, the new object occupies exactly the space it needs, without any spare. This is the expected behavior in the typical use case outlined in the previous paragraph. 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
existing	TokenNameIdentifier	 existing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a new CategoryPath object, copying a prefix with the given * number of components of the path given in an existing CategoryPath * object. * <P> * If the given length is negative or bigger than the given path's actual * length, the full path is taken. * <P> * This constructor is often convenient for creating a temporary object with * a path's prefix, but this practice is wasteful, and therefore * inadvisable. Rather, the application should be written in a way that * allows considering only a prefix of a given path, without needing to make * a copy of that path. */	TokenNameCOMMENT_JAVADOC	 Construct a new CategoryPath object, copying a prefix with the given number of components of the path given in an existing CategoryPath object. <P> If the given length is negative or bigger than the given path's actual length, the full path is taken. <P> This constructor is often convenient for creating a temporary object with a path's prefix, but this practice is wasteful, and therefore inadvisable. Rather, the application should be written in a way that allows considering only a prefix of a given path, without needing to make a copy of that path. 
public	TokenNamepublic	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
existing	TokenNameIdentifier	 existing
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefixLen	TokenNameIdentifier	 prefix Len
>	TokenNameGREATER	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
existing	TokenNameIdentifier	 existing
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CategoryPath	TokenNameIdentifier	 Category Path
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compare the given CategoryPath to another one. For two category paths to * be considered equal, only the path they contain needs to be identical The * unused capacity of the objects is not considered in the comparison. */	TokenNameCOMMENT_JAVADOC	 Compare the given CategoryPath to another one. For two category paths to be considered equal, only the path they contain needs to be identical The unused capacity of the objects is not considered in the comparison. 
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
obj	TokenNameIdentifier	 obj
instanceof	TokenNameinstanceof	
CategoryPath	TokenNameIdentifier	 Category Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CategoryPath	TokenNameIdentifier	 Category Path
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
!=	TokenNameNOT_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Unfortunately, Arrays.equal() can only compare entire arrays, 	TokenNameCOMMENT_LINE	Unfortunately, Arrays.equal() can only compare entire arrays, 
// and in our case we potentially have unused parts of the arrays 	TokenNameCOMMENT_LINE	and in our case we potentially have unused parts of the arrays 
// that must not be compared... I wish that some future version 	TokenNameCOMMENT_LINE	that must not be compared... I wish that some future version 
// of Java has a offset and length parameter to Arrays.equal 	TokenNameCOMMENT_LINE	of Java has a offset and length parameter to Arrays.equal 
// (sort of like System.arraycopy()). 	TokenNameCOMMENT_LINE	(sort of like System.arraycopy()). 
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// nothing to compare... 	TokenNameCOMMENT_LINE	nothing to compare... 
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Test whether this object is a descendant of another CategoryPath. This is * true if the other CategoryPath is the prefix of this. */	TokenNameCOMMENT_JAVADOC	 Test whether this object is a descendant of another CategoryPath. This is true if the other CategoryPath is the prefix of this. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDescendantOf	TokenNameIdentifier	 is Descendant Of
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
j	TokenNameIdentifier	 j
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
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate a hashCode for this path, used when a CategoryPath serves as a * hash-table key. If two objects are equal(), their hashCodes need to be * equal, so like in equal(), hashCode does not consider unused portions of * the internal buffers in its calculation. * <P> * The hash function used is modeled after Java's String.hashCode() - a * simple multiplicative hash function with the multiplier 31. The same hash * function also appeared in Kernighan & Ritchie's second edition of * "The C Programming Language" (1988). */	TokenNameCOMMENT_JAVADOC	 Calculate a hashCode for this path, used when a CategoryPath serves as a hash-table key. If two objects are equal(), their hashCodes need to be equal, so like in equal(), hashCode does not consider unused portions of the internal buffers in its calculation. <P> The hash function used is modeled after Java's String.hashCode() - a simple multiplicative hash function with the multiplier 31. The same hash function also appeared in Kernighan & Ritchie's second edition of "The C Programming Language" (1988). 
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
// Unfortunately, Arrays.hashCode() can only calculate a hash code 	TokenNameCOMMENT_LINE	Unfortunately, Arrays.hashCode() can only calculate a hash code 
// for an entire arrays, and in our case we potentially have unused 	TokenNameCOMMENT_LINE	for an entire arrays, and in our case we potentially have unused 
// parts of the arrays that must be ignored, so must use our own loop 	TokenNameCOMMENT_LINE	parts of the arrays that must be ignored, so must use our own loop 
// over the characters. I wish that some future version of Java will 	TokenNameCOMMENT_LINE	over the characters. I wish that some future version of Java will 
// add offset and length parameters to Arrays.hashCode (sort of like 	TokenNameCOMMENT_LINE	add offset and length parameters to Arrays.hashCode (sort of like 
// System.arraycopy()'s parameters). 	TokenNameCOMMENT_LINE	System.arraycopy()'s parameters). 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Like {@link #hashCode()}, but find the hash function of a prefix with the * given number of components, rather than of the entire path. */	TokenNameCOMMENT_JAVADOC	 Like {@link #hashCode()}, but find the hash function of a prefix with the given number of components, rather than of the entire path. 
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefixLen	TokenNameIdentifier	 prefix Len
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixLen	TokenNameIdentifier	 prefix Len
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
prefixLen	TokenNameIdentifier	 prefix Len
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
prefixLen	TokenNameIdentifier	 prefix Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
prefixLen	TokenNameIdentifier	 prefix Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Calculate a 64-bit hash function for this path. Unlike * {@link #hashCode()}, this method is not part of the Java standard, and is * only used if explicitly called by the user. * <P> * If two objects are equal(), their hash codes need to be equal, so like in * {@link #equals(Object)}, longHashCode does not consider unused portions * of the internal buffers in its calculation. * <P> * The hash function used is a simple multiplicative hash function, with the * multiplier 65599. While Java's standard multiplier 31 (used in * {@link #hashCode()}) gives a good distribution for ASCII strings, it * turns out that for foreign-language strings (with 16-bit characters) it * gives too many collisions, and a bigger multiplier produces fewer * collisions in this case. */	TokenNameCOMMENT_JAVADOC	 Calculate a 64-bit hash function for this path. Unlike {@link #hashCode()}, this method is not part of the Java standard, and is only used if explicitly called by the user. <P> If two objects are equal(), their hash codes need to be equal, so like in {@link #equals(Object)}, longHashCode does not consider unused portions of the internal buffers in its calculation. <P> The hash function used is a simple multiplicative hash function, with the multiplier 65599. While Java's standard multiplier 31 (used in {@link #hashCode()}) gives a good distribution for ASCII strings, it turns out that for foreign-language strings (with 16-bit characters) it gives too many collisions, and a bigger multiplier produces fewer collisions in this case. 
public	TokenNamepublic	
long	TokenNamelong	
longHashCode	TokenNameIdentifier	 long Hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
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
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
65599	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
65599	TokenNameIntegerLiteral	
+	TokenNamePLUS	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Like {@link #longHashCode()}, but find the hash function of a prefix with * the given number of components, rather than of the entire path. */	TokenNameCOMMENT_JAVADOC	 Like {@link #longHashCode()}, but find the hash function of a prefix with the given number of components, rather than of the entire path. 
public	TokenNamepublic	
long	TokenNamelong	
longHashCode	TokenNameIdentifier	 long Hash Code
(	TokenNameLPAREN	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefixLen	TokenNameIdentifier	 prefix Len
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixLen	TokenNameIdentifier	 prefix Len
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
long	TokenNamelong	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
prefixLen	TokenNameIdentifier	 prefix Len
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
prefixLen	TokenNameIdentifier	 prefix Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
65599	TokenNameIntegerLiteral	
+	TokenNamePLUS	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
prefixLen	TokenNameIdentifier	 prefix Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
65599	TokenNameIntegerLiteral	
+	TokenNamePLUS	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Write out a serialized (as a character sequence) representation of the * path to a given Appendable (e.g., a StringBuilder, CharBuffer, Writer, or * something similar. * <P> * This method may throw a IOException if the given Appendable threw this * exception while appending. */	TokenNameCOMMENT_JAVADOC	 Write out a serialized (as a character sequence) representation of the path to a given Appendable (e.g., a StringBuilder, CharBuffer, Writer, or something similar. <P> This method may throw a IOException if the given Appendable threw this exception while appending. 
public	TokenNamepublic	
void	TokenNamevoid	
serializeAppendTo	TokenNameIdentifier	 serialize Append To
(	TokenNameLPAREN	
Appendable	TokenNameIdentifier	 Appendable
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Note that we use the fact that ncomponents and ends[] are shorts, 	TokenNameCOMMENT_LINE	Note that we use the fact that ncomponents and ends[] are shorts, 
// so we can write them as chars: 	TokenNameCOMMENT_LINE	so we can write them as chars: 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
usedchars	TokenNameIdentifier	 usedchars
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
usedchars	TokenNameIdentifier	 usedchars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Just like {@link #serializeAppendTo(Appendable)}, but writes only a * prefix of the CategoryPath. */	TokenNameCOMMENT_JAVADOC	 Just like {@link #serializeAppendTo(Appendable)}, but writes only a prefix of the CategoryPath. 
public	TokenNamepublic	
void	TokenNamevoid	
serializeAppendTo	TokenNameIdentifier	 serialize Append To
(	TokenNameLPAREN	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
Appendable	TokenNameIdentifier	 Appendable
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefixLen	TokenNameIdentifier	 prefix Len
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixLen	TokenNameIdentifier	 prefix Len
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Note that we use the fact that ncomponents and ends[] are shorts, 	TokenNameCOMMENT_LINE	Note that we use the fact that ncomponents and ends[] are shorts, 
// so we can write them as chars: 	TokenNameCOMMENT_LINE	so we can write them as chars: 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
prefixLen	TokenNameIdentifier	 prefix Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
usedchars	TokenNameIdentifier	 usedchars
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
prefixLen	TokenNameIdentifier	 prefix Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
usedchars	TokenNameIdentifier	 usedchars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set a CategoryPath from a character-sequence representation written by * {@link #serializeAppendTo(Appendable)}. * <P> * Reading starts at the given offset into the given character sequence, and * the offset right after the end of this path is returned. */	TokenNameCOMMENT_JAVADOC	 Set a CategoryPath from a character-sequence representation written by {@link #serializeAppendTo(Appendable)}. <P> Reading starts at the given offset into the given character sequence, and the offset right after the end of this path is returned. 
public	TokenNamepublic	
int	TokenNameint	
setFromSerialized	TokenNameIdentifier	 set From Serialized
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
>=	TokenNameGREATER_EQUAL	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
usedchars	TokenNameIdentifier	 usedchars
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
usedchars	TokenNameIdentifier	 usedchars
>	TokenNameGREATER	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
max	TokenNameIdentifier	 max
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
usedchars	TokenNameIdentifier	 usedchars
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
usedchars	TokenNameIdentifier	 usedchars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Check whether the current path is identical to the one serialized (with * {@link #serializeAppendTo(Appendable)}) in the given buffer, at the given * offset. */	TokenNameCOMMENT_JAVADOC	 Check whether the current path is identical to the one serialized (with {@link #serializeAppendTo(Appendable)}) in the given buffer, at the given offset. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equalsToSerialized	TokenNameIdentifier	 equals To Serialized
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
usedchars	TokenNameIdentifier	 usedchars
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
usedchars	TokenNameIdentifier	 usedchars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just like {@link #equalsToSerialized(CharSequence, int)}, but compare to * a prefix of the CategoryPath, instead of the whole CategoryPath. */	TokenNameCOMMENT_JAVADOC	 Just like {@link #equalsToSerialized(CharSequence, int)}, but compare to a prefix of the CategoryPath, instead of the whole CategoryPath. 
public	TokenNamepublic	
boolean	TokenNameboolean	
equalsToSerialized	TokenNameIdentifier	 equals To Serialized
(	TokenNameLPAREN	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
CharSequence	TokenNameIdentifier	 Char Sequence
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
prefixLen	TokenNameIdentifier	 prefix Len
>	TokenNameGREATER	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefixLen	TokenNameIdentifier	 prefix Len
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
prefixLen	TokenNameIdentifier	 prefix Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
usedchars	TokenNameIdentifier	 usedchars
=	TokenNameEQUAL	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
prefixLen	TokenNameIdentifier	 prefix Len
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
usedchars	TokenNameIdentifier	 usedchars
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method calculates a hash function of a path that has been written to * (using {@link #serializeAppendTo(Appendable)}) a character buffer. It is * guaranteed that the value returned is identical to that which * {@link #hashCode()} would have produced for the original object before it * was serialized. */	TokenNameCOMMENT_JAVADOC	 This method calculates a hash function of a path that has been written to (using {@link #serializeAppendTo(Appendable)}) a character buffer. It is guaranteed that the value returned is identical to that which {@link #hashCode()} would have produced for the original object before it was serialized. 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
hashCodeOfSerialized	TokenNameIdentifier	 hash Code Of Serialized
(	TokenNameLPAREN	
CharSequence	TokenNameIdentifier	 Char Sequence
buffer	TokenNameIdentifier	 buffer
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Note: the algorithm here must be identical to that of hashCode(), 	TokenNameCOMMENT_LINE	Note: the algorithm here must be identical to that of hashCode(), 
// in order that they produce identical results! 	TokenNameCOMMENT_LINE	in order that they produce identical results! 
int	TokenNameint	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ncomponents	TokenNameIdentifier	 ncomponents
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
ncomponents	TokenNameIdentifier	 ncomponents
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
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
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
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
*	TokenNameMULTIPLY	
31	TokenNameIntegerLiteral	
+	TokenNamePLUS	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serializes the content of this CategoryPath to a byte stream, using UTF-8 * encoding to convert characters to bytes, and treating the ends as 16-bit * characters. * * @param osw * The output byte stream. * @throws IOException * If there are encoding errors. */	TokenNameCOMMENT_JAVADOC	 Serializes the content of this CategoryPath to a byte stream, using UTF-8 encoding to convert characters to bytes, and treating the ends as 16-bit characters. * @param osw The output byte stream. @throws IOException If there are encoding errors. 
// TODO (Facet): consolidate all de/serialize method names to 	TokenNameCOMMENT_LINE	TODO (Facet): consolidate all de/serialize method names to 
// serialize() and unserialize() 	TokenNameCOMMENT_LINE	serialize() and unserialize() 
public	TokenNamepublic	
void	TokenNamevoid	
serializeToStreamWriter	TokenNameIdentifier	 serialize To Stream Writer
(	TokenNameLPAREN	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
osw	TokenNameIdentifier	 osw
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Serializes the content of this CategoryPath to a byte stream, using UTF-8 * encoding to convert characters to bytes, and treating the ends as 16-bit * characters. * * @param isr * The input stream. * @throws IOException * If there are encoding errors. */	TokenNameCOMMENT_JAVADOC	 Serializes the content of this CategoryPath to a byte stream, using UTF-8 encoding to convert characters to bytes, and treating the ends as 16-bit characters. * @param isr The input stream. @throws IOException If there are encoding errors. 
public	TokenNamepublic	
void	TokenNamevoid	
deserializeFromStreamReader	TokenNameIdentifier	 deserialize From Stream Reader
(	TokenNameLPAREN	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
isr	TokenNameIdentifier	 isr
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
isr	TokenNameIdentifier	 isr
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
=	TokenNameEQUAL	
new	TokenNamenew	
short	TokenNameshort	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
isr	TokenNameIdentifier	 isr
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
>	TokenNameGREATER	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
isr	TokenNameIdentifier	 isr
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
ncomponents	TokenNameIdentifier	 ncomponents
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
writeObject	TokenNameIdentifier	 write Object
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectOutputStream	TokenNameIdentifier	 Object Output Stream
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
new	TokenNamenew	
OutputStreamWriter	TokenNameIdentifier	 Output Stream Writer
(	TokenNameLPAREN	
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
serializeToStreamWriter	TokenNameIdentifier	 serialize To Stream Writer
(	TokenNameLPAREN	
osw	TokenNameIdentifier	 osw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
isr	TokenNameIdentifier	 isr
=	TokenNameEQUAL	
new	TokenNamenew	
InputStreamReader	TokenNameIdentifier	 Input Stream Reader
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
"UTF-8"	TokenNameStringLiteral	UTF-8
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
deserializeFromStreamReader	TokenNameIdentifier	 deserialize From Stream Reader
(	TokenNameLPAREN	
isr	TokenNameIdentifier	 isr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares this CategoryPath with the other CategoryPath for lexicographic * order. * Returns a negative integer, zero, or a positive integer as this * CategoryPath lexicographically precedes, equals to, or lexicographically follows * the other CategoryPath. */	TokenNameCOMMENT_JAVADOC	 Compares this CategoryPath with the other CategoryPath for lexicographic order. Returns a negative integer, zero, or a positive integer as this CategoryPath lexicographically precedes, equals to, or lexicographically follows the other CategoryPath. 
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
other	TokenNameIdentifier	 other
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
minlength	TokenNameIdentifier	 minlength
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
co	TokenNameIdentifier	 co
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
co	TokenNameIdentifier	 co
<	TokenNameLESS	
minlength	TokenNameIdentifier	 minlength
;	TokenNameSEMICOLON	
co	TokenNameIdentifier	 co
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
co	TokenNameIdentifier	 co
]	TokenNameRBRACKET	
<=	TokenNameLESS_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
co	TokenNameIdentifier	 co
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
co	TokenNameIdentifier	 co
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
co	TokenNameIdentifier	 co
]	TokenNameRBRACKET	
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
co	TokenNameIdentifier	 co
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
/* this.ends[co] > other.ends[co] */	TokenNameCOMMENT_BLOCK	 this.ends[co] > other.ends[co] 
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
ends	TokenNameIdentifier	 ends
[	TokenNameLBRACKET	
co	TokenNameIdentifier	 co
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ch	TokenNameIdentifier	 ch
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
chars	TokenNameIdentifier	 chars
[	TokenNameLBRACKET	
ch	TokenNameIdentifier	 ch
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// one is a prefix of the other 	TokenNameCOMMENT_LINE	one is a prefix of the other 
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
