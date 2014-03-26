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
font	TokenNameIdentifier	 font
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
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
SoftReference	TokenNameIdentifier	 Soft Reference
;	TokenNameSEMICOLON	
/** * This class represents a doubly indexed hash table, which holds * soft references to the contained glyph geometry informations. * * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> * @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> * @version $Id: AWTGlyphGeometryCache.java 489226 2006-12-21 00:05:36Z cam $ */	TokenNameCOMMENT_JAVADOC	 This class represents a doubly indexed hash table, which holds soft references to the contained glyph geometry informations. * @author <a href="mailto:stephane@hillion.org">Stephane Hillion</a> @author <a href="mailto:tkormann@ilog.fr">Thierry Kormann</a> @version $Id: AWTGlyphGeometryCache.java 489226 2006-12-21 00:05:36Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
{	TokenNameLBRACE	
/** * The initial capacity */	TokenNameCOMMENT_JAVADOC	 The initial capacity 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
INITIAL_CAPACITY	TokenNameIdentifier	 INITIAL  CAPACITY
=	TokenNameEQUAL	
71	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The underlying array */	TokenNameCOMMENT_JAVADOC	 The underlying array 
protected	TokenNameprotected	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
/** * The number of entries */	TokenNameCOMMENT_JAVADOC	 The number of entries 
protected	TokenNameprotected	
int	TokenNameint	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
/** * The reference queue. */	TokenNameCOMMENT_JAVADOC	 The reference queue. 
protected	TokenNameprotected	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
referenceQueue	TokenNameIdentifier	 reference Queue
=	TokenNameEQUAL	
new	TokenNamenew	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Creates a new AWTGlyphGeometryCache. */	TokenNameCOMMENT_JAVADOC	 Creates a new AWTGlyphGeometryCache. 
public	TokenNamepublic	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
INITIAL_CAPACITY	TokenNameIdentifier	 INITIAL  CAPACITY
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a new AWTGlyphGeometryCache. * @param c The inital capacity. */	TokenNameCOMMENT_JAVADOC	 Creates a new AWTGlyphGeometryCache. @param c The inital capacity. 
public	TokenNamepublic	
AWTGlyphGeometryCache	TokenNameIdentifier	 AWT Glyph Geometry Cache
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
c	TokenNameIdentifier	 c
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the size of this table. */	TokenNameCOMMENT_JAVADOC	 Returns the size of this table. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Gets the value of a variable * @return the value or null */	TokenNameCOMMENT_JAVADOC	 Gets the value of a variable @return the value or null 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets a new value for the given variable * @return the old value or null */	TokenNameCOMMENT_JAVADOC	 Sets a new value for the given variable @return the old value or null 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
removeClearedEntries	TokenNameIdentifier	 remove Cleared Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
&	TokenNameAND	
0x7FFFFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
)	TokenNameRPAREN	
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Entry	TokenNameIdentifier	 Entry
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Value	TokenNameIdentifier	 Value
)	TokenNameRPAREN	
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// The key is not in the hash table 	TokenNameCOMMENT_LINE	The key is not in the hash table 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
++	TokenNamePLUS_PLUS	
>=	TokenNameGREATER_EQUAL	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
-	TokenNameMINUS	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>>	TokenNameRIGHT_SHIFT	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// more than 75% loaded: grow 	TokenNameCOMMENT_LINE	more than 75% loaded: grow 
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Clears the table. */	TokenNameCOMMENT_JAVADOC	 Clears the table. 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
INITIAL_CAPACITY	TokenNameIdentifier	 INITIAL  CAPACITY
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
referenceQueue	TokenNameIdentifier	 reference Queue
=	TokenNameEQUAL	
new	TokenNamenew	
ReferenceQueue	TokenNameIdentifier	 Reference Queue
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Rehash the table */	TokenNameCOMMENT_JAVADOC	 Rehash the table 
protected	TokenNameprotected	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldTable	TokenNameIdentifier	 old Table
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
oldTable	TokenNameIdentifier	 old Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
oldTable	TokenNameIdentifier	 old Table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
oldTable	TokenNameIdentifier	 old Table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
old	TokenNameIdentifier	 old
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
;	TokenNameSEMICOLON	
old	TokenNameIdentifier	 old
=	TokenNameEQUAL	
old	TokenNameIdentifier	 old
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Computes a hash code corresponding to the given objects. */	TokenNameCOMMENT_JAVADOC	 Computes a hash code corresponding to the given objects. 
protected	TokenNameprotected	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes the cleared entries. */	TokenNameCOMMENT_JAVADOC	 Removes the cleared entries. 
protected	TokenNameprotected	
void	TokenNamevoid	
removeClearedEntries	TokenNameIdentifier	 remove Cleared Entries
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
)	TokenNameRPAREN	
referenceQueue	TokenNameIdentifier	 reference Queue
.	TokenNameDOT	
poll	TokenNameIdentifier	 poll
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
table	TokenNameIdentifier	 table
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
t	TokenNameIdentifier	 t
==	TokenNameEQUAL_EQUAL	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
table	TokenNameIdentifier	 table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
loop	TokenNameIdentifier	 loop
:	TokenNameCOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
break	TokenNamebreak	
loop	TokenNameIdentifier	 loop
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
count	TokenNameIdentifier	 count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * The object that holds glyph geometry. */	TokenNameCOMMENT_JAVADOC	 The object that holds glyph geometry. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Value	TokenNameIdentifier	 Value
{	TokenNameLBRACE	
protected	TokenNameprotected	
Shape	TokenNameIdentifier	 Shape
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
gmB	TokenNameIdentifier	 gm B
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
outlineBounds	TokenNameIdentifier	 outline Bounds
;	TokenNameSEMICOLON	
/** * Constructs a new Value with the specified parameter. */	TokenNameCOMMENT_JAVADOC	 Constructs a new Value with the specified parameter. 
public	TokenNamepublic	
Value	TokenNameIdentifier	 Value
(	TokenNameLPAREN	
Shape	TokenNameIdentifier	 Shape
outline	TokenNameIdentifier	 outline
,	TokenNameCOMMA	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
gmB	TokenNameIdentifier	 gm B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
outline	TokenNameIdentifier	 outline
=	TokenNameEQUAL	
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
outlineBounds	TokenNameIdentifier	 outline Bounds
=	TokenNameEQUAL	
outline	TokenNameIdentifier	 outline
.	TokenNameDOT	
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
gmB	TokenNameIdentifier	 gm B
=	TokenNameEQUAL	
gmB	TokenNameIdentifier	 gm B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the outline of the glyph. */	TokenNameCOMMENT_JAVADOC	 Returns the outline of the glyph. 
public	TokenNamepublic	
Shape	TokenNameIdentifier	 Shape
getOutline	TokenNameIdentifier	 get Outline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outline	TokenNameIdentifier	 outline
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the glyph according to its glyph metrics. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the glyph according to its glyph metrics. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getBounds2D	TokenNameIdentifier	 get Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
gmB	TokenNameIdentifier	 gm B
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the bounds of the outline. */	TokenNameCOMMENT_JAVADOC	 Returns the bounds of the outline. 
public	TokenNamepublic	
Rectangle2D	TokenNameIdentifier	 Rectangle2 D
getOutlineBounds2D	TokenNameIdentifier	 get Outline Bounds2 D
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
outlineBounds	TokenNameIdentifier	 outline Bounds
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * To manage collisions */	TokenNameCOMMENT_JAVADOC	 To manage collisions 
protected	TokenNameprotected	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
extends	TokenNameextends	
SoftReference	TokenNameIdentifier	 Soft Reference
{	TokenNameLBRACE	
/** * The hash code */	TokenNameCOMMENT_JAVADOC	 The hash code 
public	TokenNamepublic	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
/** * The character */	TokenNameCOMMENT_JAVADOC	 The character 
public	TokenNamepublic	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
/** * The next entry */	TokenNameCOMMENT_JAVADOC	 The next entry 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
/** * Creates a new entry */	TokenNameCOMMENT_JAVADOC	 Creates a new entry 
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
char	TokenNamechar	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
referenceQueue	TokenNameIdentifier	 reference Queue
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Whether this entry match the given keys. */	TokenNameCOMMENT_JAVADOC	 Whether this entry match the given keys. 
public	TokenNamepublic	
boolean	TokenNameboolean	
match	TokenNameIdentifier	 match
(	TokenNameLPAREN	
char	TokenNamechar	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
