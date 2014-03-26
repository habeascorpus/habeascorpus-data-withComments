/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: StringToStringTableVector.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: StringToStringTableVector.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
;	TokenNameSEMICOLON	
/** * A very simple table that stores a list of StringToStringTables, optimized * for small lists. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 A very simple table that stores a list of StringToStringTables, optimized for small lists. @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
StringToStringTableVector	TokenNameIdentifier	 String To String Table Vector
{	TokenNameLBRACE	
/** Size of blocks to allocate */	TokenNameCOMMENT_JAVADOC	 Size of blocks to allocate 
private	TokenNameprivate	
int	TokenNameint	
m_blocksize	TokenNameIdentifier	 m blocksize
;	TokenNameSEMICOLON	
/** Array of StringToStringTable objects */	TokenNameCOMMENT_JAVADOC	 Array of StringToStringTable objects 
private	TokenNameprivate	
StringToStringTable	TokenNameIdentifier	 String To String Table
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
/** Number of StringToStringTable objects in this array */	TokenNameCOMMENT_JAVADOC	 Number of StringToStringTable objects in this array 
private	TokenNameprivate	
int	TokenNameint	
m_firstFree	TokenNameIdentifier	 m first Free
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Size of this array */	TokenNameCOMMENT_JAVADOC	 Size of this array 
private	TokenNameprivate	
int	TokenNameint	
m_mapSize	TokenNameIdentifier	 m map Size
;	TokenNameSEMICOLON	
/** * Default constructor. Note that the default * block size is very small, for small lists. */	TokenNameCOMMENT_JAVADOC	 Default constructor. Note that the default block size is very small, for small lists. 
public	TokenNamepublic	
StringToStringTableVector	TokenNameIdentifier	 String To String Table Vector
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
StringToStringTable	TokenNameIdentifier	 String To String Table
[	TokenNameLBRACKET	
m_blocksize	TokenNameIdentifier	 m blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Construct a StringToStringTableVector, using the given block size. * * @param blocksize Size of blocks to allocate */	TokenNameCOMMENT_JAVADOC	 Construct a StringToStringTableVector, using the given block size. * @param blocksize Size of blocks to allocate 
public	TokenNamepublic	
StringToStringTableVector	TokenNameIdentifier	 String To String Table Vector
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
StringToStringTable	TokenNameIdentifier	 String To String Table
[	TokenNameLBRACKET	
blocksize	TokenNameIdentifier	 blocksize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return Number of StringToStringTable objects in the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return Number of StringToStringTable objects in the list 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_firstFree	TokenNameIdentifier	 m first Free
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the list. * * @return Number of StringToStringTable objects in the list */	TokenNameCOMMENT_JAVADOC	 Get the length of the list. * @return Number of StringToStringTable objects in the list 
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
/** * Append a StringToStringTable object onto the vector. * * @param value StringToStringTable object to add */	TokenNameCOMMENT_JAVADOC	 Append a StringToStringTable object onto the vector. * @param value StringToStringTable object to add 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
StringToStringTable	TokenNameIdentifier	 String To String Table
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
StringToStringTable	TokenNameIdentifier	 String To String Table
newMap	TokenNameIdentifier	 new Map
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
StringToStringTable	TokenNameIdentifier	 String To String Table
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
/** * Given a string, find the last added occurance value * that matches the key. * * @param key String to look up * * @return the last added occurance value that matches the key * or null if not found. */	TokenNameCOMMENT_JAVADOC	 Given a string, find the last added occurance value that matches the key. * @param key String to look up * @return the last added occurance value that matches the key or null if not found. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
nsuri	TokenNameIdentifier	 nsuri
=	TokenNameEQUAL	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nsuri	TokenNameIdentifier	 nsuri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
nsuri	TokenNameIdentifier	 nsuri
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a string, find out if there is a value in this table * that matches the key. * * @param key String to look for * * @return True if the string was found in table, null if not */	TokenNameCOMMENT_JAVADOC	 Given a string, find out if there is a value in this table that matches the key. * @param key String to look for * @return True if the string was found in table, null if not 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
m_firstFree	TokenNameIdentifier	 m first Free
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove the last element. */	TokenNameCOMMENT_JAVADOC	 Remove the last element. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
removeLastElem	TokenNameIdentifier	 remove Last Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_firstFree	TokenNameIdentifier	 m first Free
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_map	TokenNameIdentifier	 m map
[	TokenNameLBRACKET	
m_firstFree	TokenNameIdentifier	 m first Free
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_firstFree	TokenNameIdentifier	 m first Free
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the nth element. * * @param i Index of element to find * * @return The StringToStringTable object at the given index */	TokenNameCOMMENT_JAVADOC	 Get the nth element. * @param i Index of element to find * @return The StringToStringTable object at the given index 
public	TokenNamepublic	
final	TokenNamefinal	
StringToStringTable	TokenNameIdentifier	 String To String Table
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
/** * Tell if the table contains the given StringToStringTable. * * @param s The StringToStringTable to find * * @return True if the StringToStringTable is found */	TokenNameCOMMENT_JAVADOC	 Tell if the table contains the given StringToStringTable. * @param s The StringToStringTable to find * @return True if the StringToStringTable is found 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
StringToStringTable	TokenNameIdentifier	 String To String Table
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
}	TokenNameRBRACE	
