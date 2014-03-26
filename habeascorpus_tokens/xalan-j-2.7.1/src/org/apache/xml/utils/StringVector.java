/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StringVector.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StringVector.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * A very simple table that stores a list of strings, optimized * for small lists. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A very simple table that stores a list of strings, optimized for small lists. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
StringVector	TokenNameIdentifier	 String Vector
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
4995234972032919748L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** @serial Size of blocks to allocate */	TokenNameCOMMENT_JAVADOC	 @serial Size of blocks to allocate 
protected	TokenNameprotected	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
/** @serial Array of strings this contains */	TokenNameCOMMENT_JAVADOC	 @serial Array of strings this contains 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** @serial Number of strings this contains */	TokenNameCOMMENT_JAVADOC	 @serial Number of strings this contains 
protected	TokenNameprotected	
int	TokenNameint	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** @serial Size of the array */	TokenNameCOMMENT_JAVADOC	 @serial Size of the array 
protected	TokenNameprotected	
int	TokenNameint	
m_mapSize	TokenNameIdentifier	 m map Size
;	TokenNameSEMICOLON	
/** * Default constructor. Note that the default * block size is very small, for small lists. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Note that the default block size is very small, for small lists. 
public	TokenNamepublic	
StringVector	TokenNameIdentifier	 String Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
8	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a StringVector, using the given block size. * * @param blocksize Size of the blocks to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a StringVector, using the given block size. * @param blocksize Size of the blocks to allocate 
public	TokenNamepublic	
StringVector	TokenNameIdentifier	 String Vector
(	TokenNameLPAREN	
int	TokenNameint	
blocksize	TokenNameIdentifier	 blocksize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_blocksize	TokenNameIdentifier	 m blocksize
=	TokenNameEQUAL	
blocksize	TokenNameIdentifier	 blocksize
;	TokenNameSEMICOLON	
m_mapSize	TokenNameIdentifier	 m map Size
=	TokenNameEQUAL	
blocksize	TokenNameIdentifier	 blocksize
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
blocksize	TokenNameIdentifier	 blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return Number of strings in the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return Number of strings in the list 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return Number of strings in the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return Number of strings in the list 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Append a string onto the vector. * * @param value Sting to add to the vector */	TokenNameCOMMENT_JAVADOC	 Append a string onto the vector. * @param value Sting to add to the vector 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the nth element. * * @param i Index of string to find * * @return String at given index */	TokenNameCOMMENT_JAVADOC	 Get the nth element. * @param i Index of string to find * @return String at given index 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given string. * * @param s String to look for * * @return True if the string is in this table */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given string. * @param s String to look for * @return True if the string is in this table 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given string. Ignore case. * * @param s String to find * * @return True if the String is in this vector */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given string. Ignore case. * @param s String to find * @return True if the String is in this vector 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
containsIgnoreCase	TokenNameIdentifier	 contains Ignore Case
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
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
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equalsIgnoreCase	TokenNameIdentifier	 equals Ignore Case
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the table contains the given string. * * @param s String to push into the vector */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given string. * @param s String to push into the vector 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
m_mapSize	TokenNameIdentifier	 m map Size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_mapSize	TokenNameIdentifier	 m map Size
+=	TokenNamePLUS_EQUAL	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
m_mapSize	TokenNameIdentifier	 m map Size
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newMap	TokenNameIdentifier	 new Map
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_firstFree	TokenNameIdentifier	 m first Free
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
=	TokenNameEQUAL	
newMap	TokenNameIdentifier	 new Map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the tail of this vector. * * @return The String last added to this vector or null not found. * The string is removed from the vector. */	TokenNameCOMMENT_JAVADOC	 Pop the tail of this vector. * @return The String last added to this vector or null not found. The string is removed from the vector. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the string at the tail of this vector without popping. * * @return The string at the tail of this vector. */	TokenNameCOMMENT_JAVADOC	 Get the string at the tail of this vector without popping. * @return The string at the tail of this vector. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
