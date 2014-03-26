/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ExpandedNameTable.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ExpandedNameTable.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
;	TokenNameSEMICOLON	
/** * This is a default implementation of a table that manages mappings from * expanded names to expandedNameIDs. * * %OPT% The performance of the getExpandedTypeID() method is very important * to DTM building. To get the best performance out of this class, we implement * a simple hash algorithm directly into this class, instead of using the * inefficient java.util.Hashtable. The code for the get and put operations * are combined in getExpandedTypeID() method to share the same hash calculation * code. We only need to implement the rehash() interface which is used to * expand the hash table. */	TokenNameCOMMENT_JAVADOC	 This is a default implementation of a table that manages mappings from expanded names to expandedNameIDs. * %OPT% The performance of the getExpandedTypeID() method is very important to DTM building. To get the best performance out of this class, we implement a simple hash algorithm directly into this class, instead of using the inefficient java.util.Hashtable. The code for the get and put operations are combined in getExpandedTypeID() method to share the same hash calculation code. We only need to implement the rehash() interface which is used to expand the hash table. 
public	TokenNamepublic	
class	TokenNameclass	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
{	TokenNameLBRACE	
/** Array of extended types for this document */	TokenNameCOMMENT_JAVADOC	 Array of extended types for this document 
private	TokenNameprivate	
ExtendedType	TokenNameIdentifier	 Extended Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_extendedTypes	TokenNameIdentifier	 m extended Types
;	TokenNameSEMICOLON	
/** The initial size of the m_extendedTypes array */	TokenNameCOMMENT_JAVADOC	 The initial size of the m_extendedTypes array 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
m_initialSize	TokenNameIdentifier	 m initial Size
=	TokenNameEQUAL	
128	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Next available extended type */	TokenNameCOMMENT_JAVADOC	 Next available extended type 
// %REVIEW% Since this is (should be) always equal 	TokenNameCOMMENT_LINE	%REVIEW% Since this is (should be) always equal 
// to the length of m_extendedTypes, do we need this? 	TokenNameCOMMENT_LINE	to the length of m_extendedTypes, do we need this? 
private	TokenNameprivate	
int	TokenNameint	
m_nextType	TokenNameIdentifier	 m next Type
;	TokenNameSEMICOLON	
// These are all the types prerotated, for caller convenience. 	TokenNameCOMMENT_LINE	These are all the types prerotated, for caller convenience. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ELEMENT	TokenNameIdentifier	 ELEMENT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ELEMENT_NODE	TokenNameIdentifier	 ELEMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ATTRIBUTE	TokenNameIdentifier	 ATTRIBUTE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ATTRIBUTE_NODE	TokenNameIdentifier	 ATTRIBUTE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
TEXT	TokenNameIdentifier	 TEXT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
TEXT_NODE	TokenNameIdentifier	 TEXT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CDATA_SECTION	TokenNameIdentifier	 CDATA  SECTION
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
CDATA_SECTION_NODE	TokenNameIdentifier	 CDATA  SECTION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY_REFERENCE	TokenNameIdentifier	 ENTITY  REFERENCE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_REFERENCE_NODE	TokenNameIdentifier	 ENTITY  REFERENCE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
ENTITY	TokenNameIdentifier	 ENTITY
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
ENTITY_NODE	TokenNameIdentifier	 ENTITY  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PROCESSING_INSTRUCTION	TokenNameIdentifier	 PROCESSING  INSTRUCTION
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
PROCESSING_INSTRUCTION_NODE	TokenNameIdentifier	 PROCESSING  INSTRUCTION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
COMMENT	TokenNameIdentifier	 COMMENT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
COMMENT_NODE	TokenNameIdentifier	 COMMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCUMENT	TokenNameIdentifier	 DOCUMENT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_NODE	TokenNameIdentifier	 DOCUMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCUMENT_TYPE	TokenNameIdentifier	 DOCUMENT  TYPE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_TYPE_NODE	TokenNameIdentifier	 DOCUMENT  TYPE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
DOCUMENT_FRAGMENT	TokenNameIdentifier	 DOCUMENT  FRAGMENT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
DOCUMENT_FRAGMENT_NODE	TokenNameIdentifier	 DOCUMENT  FRAGMENT  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NOTATION	TokenNameIdentifier	 NOTATION
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NOTATION_NODE	TokenNameIdentifier	 NOTATION  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
NAMESPACE	TokenNameIdentifier	 NAMESPACE
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NAMESPACE_NODE	TokenNameIdentifier	 NAMESPACE  NODE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Workspace for lookup. NOT THREAD SAFE! * */	TokenNameCOMMENT_JAVADOC	 Workspace for lookup. NOT THREAD SAFE! 
ExtendedType	TokenNameIdentifier	 Extended Type
hashET	TokenNameIdentifier	 hash ET
=	TokenNameEQUAL	
new	TokenNamenew	
ExtendedType	TokenNameIdentifier	 Extended Type
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The array to store the default extended types. */	TokenNameCOMMENT_JAVADOC	 The array to store the default extended types. 
private	TokenNameprivate	
static	TokenNamestatic	
ExtendedType	TokenNameIdentifier	 Extended Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_defaultExtendedTypes	TokenNameIdentifier	 m default Extended Types
;	TokenNameSEMICOLON	
/** * The default load factor of the Hashtable. * This is used to calcualte the threshold. */	TokenNameCOMMENT_JAVADOC	 The default load factor of the Hashtable. This is used to calcualte the threshold. 
private	TokenNameprivate	
static	TokenNamestatic	
float	TokenNamefloat	
m_loadFactor	TokenNameIdentifier	 m load Factor
=	TokenNameEQUAL	
0.75f	TokenNameFloatingPointLiteral	
;	TokenNameSEMICOLON	
/** * The initial capacity of the hash table. Use a bigger number * to avoid the cost of expanding the table. */	TokenNameCOMMENT_JAVADOC	 The initial capacity of the hash table. Use a bigger number to avoid the cost of expanding the table. 
private	TokenNameprivate	
static	TokenNamestatic	
int	TokenNameint	
m_initialCapacity	TokenNameIdentifier	 m initial Capacity
=	TokenNameEQUAL	
203	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * The capacity of the hash table, i.e. the size of the * internal HashEntry array. */	TokenNameCOMMENT_JAVADOC	 The capacity of the hash table, i.e. the size of the internal HashEntry array. 
private	TokenNameprivate	
int	TokenNameint	
m_capacity	TokenNameIdentifier	 m capacity
;	TokenNameSEMICOLON	
/** * The threshold of the hash table, which is equal to capacity * loadFactor. * If the number of entries in the hash table is bigger than the threshold, * the hash table needs to be expanded. */	TokenNameCOMMENT_JAVADOC	 The threshold of the hash table, which is equal to capacity loadFactor. If the number of entries in the hash table is bigger than the threshold, the hash table needs to be expanded. 
private	TokenNameprivate	
int	TokenNameint	
m_threshold	TokenNameIdentifier	 m threshold
;	TokenNameSEMICOLON	
/** * The internal array to store the hash entries. * Each array member is a slot for a hash bucket. */	TokenNameCOMMENT_JAVADOC	 The internal array to store the hash entries. Each array member is a slot for a hash bucket. 
private	TokenNameprivate	
HashEntry	TokenNameIdentifier	 Hash Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
m_table	TokenNameIdentifier	 m table
;	TokenNameSEMICOLON	
/** * Init default values */	TokenNameCOMMENT_JAVADOC	 Init default values 
static	TokenNamestatic	
{	TokenNameLBRACE	
m_defaultExtendedTypes	TokenNameIdentifier	 m default Extended Types
=	TokenNameEQUAL	
new	TokenNamenew	
ExtendedType	TokenNameIdentifier	 Extended Type
[	TokenNameLBRACKET	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
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
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_defaultExtendedTypes	TokenNameIdentifier	 m default Extended Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
ExtendedType	TokenNameIdentifier	 Extended Type
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
,	TokenNameCOMMA	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Create an expanded name table. */	TokenNameCOMMENT_JAVADOC	 Create an expanded name table. 
public	TokenNamepublic	
ExpandedNameTable	TokenNameIdentifier	 Expanded Name Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_capacity	TokenNameIdentifier	 m capacity
=	TokenNameEQUAL	
m_initialCapacity	TokenNameIdentifier	 m initial Capacity
;	TokenNameSEMICOLON	
m_threshold	TokenNameIdentifier	 m threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
m_capacity	TokenNameIdentifier	 m capacity
*	TokenNameMULTIPLY	
m_loadFactor	TokenNameIdentifier	 m load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_table	TokenNameIdentifier	 m table
=	TokenNameEQUAL	
new	TokenNamenew	
HashEntry	TokenNameIdentifier	 Hash Entry
[	TokenNameLBRACKET	
m_capacity	TokenNameIdentifier	 m capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
initExtendedTypes	TokenNameIdentifier	 init Extended Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the vector of extended types with the * basic DOM node types. */	TokenNameCOMMENT_JAVADOC	 Initialize the vector of extended types with the basic DOM node types. 
private	TokenNameprivate	
void	TokenNamevoid	
initExtendedTypes	TokenNameIdentifier	 init Extended Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_extendedTypes	TokenNameIdentifier	 m extended Types
=	TokenNameEQUAL	
new	TokenNamenew	
ExtendedType	TokenNameIdentifier	 Extended Type
[	TokenNameLBRACKET	
m_initialSize	TokenNameIdentifier	 m initial Size
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
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
m_defaultExtendedTypes	TokenNameIdentifier	 m default Extended Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_table	TokenNameIdentifier	 m table
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
HashEntry	TokenNameIdentifier	 Hash Entry
(	TokenNameLPAREN	
m_defaultExtendedTypes	TokenNameIdentifier	 m default Extended Types
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_nextType	TokenNameIdentifier	 m next Type
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NTYPES	TokenNameIdentifier	 NTYPES
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded name represented by namespace, local name and node type, * return an ID. If the expanded-name does not exist in the internal tables, * the entry will be created, and the ID will be returned. Any additional * nodes that are created that have this expanded name will use this ID. * * @param namespace The namespace * @param localName The local name * @param type The node type * * @return the expanded-name id of the node. */	TokenNameCOMMENT_JAVADOC	 Given an expanded name represented by namespace, local name and node type, return an ID. If the expanded-name does not exist in the internal tables, the entry will be created, and the ID will be returned. Any additional nodes that are created that have this expanded name will use this ID. * @param namespace The namespace @param localName The local name @param type The node type * @return the expanded-name id of the node. 
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded name represented by namespace, local name and node type, * return an ID. If the expanded-name does not exist in the internal tables, * the entry will be created, and the ID will be returned. Any additional * nodes that are created that have this expanded name will use this ID. * <p> * If searchOnly is true, we will return -1 if the name is not found in the * table, otherwise the name is added to the table and the expanded name id * of the new entry is returned. * * @param namespace The namespace * @param localName The local name * @param type The node type * @param searchOnly If it is true, we will only search for the expanded name. * -1 is return is the name is not found. * * @return the expanded-name id of the node. */	TokenNameCOMMENT_JAVADOC	 Given an expanded name represented by namespace, local name and node type, return an ID. If the expanded-name does not exist in the internal tables, the entry will be created, and the ID will be returned. Any additional nodes that are created that have this expanded name will use this ID. <p> If searchOnly is true, we will return -1 if the name is not found in the table, otherwise the name is added to the table and the expanded name id of the new entry is returned. * @param namespace The namespace @param localName The local name @param type The node type @param searchOnly If it is true, we will only search for the expanded name. -1 is return is the name is not found. * @return the expanded-name id of the node. 
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
int	TokenNameint	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
boolean	TokenNameboolean	
searchOnly	TokenNameIdentifier	 search Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
localName	TokenNameIdentifier	 local Name
)	TokenNameRPAREN	
localName	TokenNameIdentifier	 local Name
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
// Calculate the hash code 	TokenNameCOMMENT_LINE	Calculate the hash code 
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
+	TokenNamePLUS	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
localName	TokenNameIdentifier	 local Name
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Redefine the hashET object to represent the new expanded name. 	TokenNameCOMMENT_LINE	Redefine the hashET object to represent the new expanded name. 
hashET	TokenNameIdentifier	 hash ET
.	TokenNameDOT	
redefine	TokenNameIdentifier	 redefine
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Calculate the index into the HashEntry table. 	TokenNameCOMMENT_LINE	Calculate the index into the HashEntry table. 
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
m_capacity	TokenNameIdentifier	 m capacity
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// Look up the expanded name in the hash table. Return the id if 	TokenNameCOMMENT_LINE	Look up the expanded name in the hash table. Return the id if 
// the expanded name is already in the hash table. 	TokenNameCOMMENT_LINE	the expanded name is already in the hash table. 
for	TokenNamefor	
(	TokenNameLPAREN	
HashEntry	TokenNameIdentifier	 Hash Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
m_table	TokenNameIdentifier	 m table
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
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
hash	TokenNameIdentifier	 hash
&&	TokenNameAND_AND	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
hashET	TokenNameIdentifier	 hash ET
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
searchOnly	TokenNameIdentifier	 search Only
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Expand the internal HashEntry array if necessary. 	TokenNameCOMMENT_LINE	Expand the internal HashEntry array if necessary. 
if	TokenNameif	
(	TokenNameLPAREN	
m_nextType	TokenNameIdentifier	 m next Type
>	TokenNameGREATER	
m_threshold	TokenNameIdentifier	 m threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
m_capacity	TokenNameIdentifier	 m capacity
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Create a new ExtendedType object 	TokenNameCOMMENT_LINE	Create a new ExtendedType object 
ExtendedType	TokenNameIdentifier	 Extended Type
newET	TokenNameIdentifier	 new ET
=	TokenNameEQUAL	
new	TokenNamenew	
ExtendedType	TokenNameIdentifier	 Extended Type
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
namespace	TokenNameIdentifier	 namespace
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Expand the m_extendedTypes array if necessary. 	TokenNameCOMMENT_LINE	Expand the m_extendedTypes array if necessary. 
if	TokenNameif	
(	TokenNameLPAREN	
m_extendedTypes	TokenNameIdentifier	 m extended Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
m_nextType	TokenNameIdentifier	 m next Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtendedType	TokenNameIdentifier	 Extended Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newArray	TokenNameIdentifier	 new Array
=	TokenNameEQUAL	
new	TokenNamenew	
ExtendedType	TokenNameIdentifier	 Extended Type
[	TokenNameLBRACKET	
m_extendedTypes	TokenNameIdentifier	 m extended Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
m_extendedTypes	TokenNameIdentifier	 m extended Types
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
newArray	TokenNameIdentifier	 new Array
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
m_extendedTypes	TokenNameIdentifier	 m extended Types
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_extendedTypes	TokenNameIdentifier	 m extended Types
=	TokenNameEQUAL	
newArray	TokenNameIdentifier	 new Array
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
m_nextType	TokenNameIdentifier	 m next Type
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
newET	TokenNameIdentifier	 new ET
;	TokenNameSEMICOLON	
// Create a new hash entry for the new ExtendedType and put it into 	TokenNameCOMMENT_LINE	Create a new hash entry for the new ExtendedType and put it into 
// the table. 	TokenNameCOMMENT_LINE	the table. 
HashEntry	TokenNameIdentifier	 Hash Entry
entry	TokenNameIdentifier	 entry
=	TokenNameEQUAL	
new	TokenNamenew	
HashEntry	TokenNameIdentifier	 Hash Entry
(	TokenNameLPAREN	
newET	TokenNameIdentifier	 new ET
,	TokenNameCOMMA	
m_nextType	TokenNameIdentifier	 m next Type
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
m_table	TokenNameIdentifier	 m table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_table	TokenNameIdentifier	 m table
[	TokenNameLBRACKET	
index	TokenNameIdentifier	 index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
entry	TokenNameIdentifier	 entry
;	TokenNameSEMICOLON	
return	TokenNamereturn	
m_nextType	TokenNameIdentifier	 m next Type
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Increases the capacity of and internally reorganizes the hashtable, * in order to accommodate and access its entries more efficiently. * This method is called when the number of keys in the hashtable exceeds * this hashtable's capacity and load factor. */	TokenNameCOMMENT_JAVADOC	 Increases the capacity of and internally reorganizes the hashtable, in order to accommodate and access its entries more efficiently. This method is called when the number of keys in the hashtable exceeds this hashtable's capacity and load factor. 
private	TokenNameprivate	
void	TokenNamevoid	
rehash	TokenNameIdentifier	 rehash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
oldCapacity	TokenNameIdentifier	 old Capacity
=	TokenNameEQUAL	
m_capacity	TokenNameIdentifier	 m capacity
;	TokenNameSEMICOLON	
HashEntry	TokenNameIdentifier	 Hash Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
oldTable	TokenNameIdentifier	 old Table
=	TokenNameEQUAL	
m_table	TokenNameIdentifier	 m table
;	TokenNameSEMICOLON	
int	TokenNameint	
newCapacity	TokenNameIdentifier	 new Capacity
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
oldCapacity	TokenNameIdentifier	 old Capacity
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_capacity	TokenNameIdentifier	 m capacity
=	TokenNameEQUAL	
newCapacity	TokenNameIdentifier	 new Capacity
;	TokenNameSEMICOLON	
m_threshold	TokenNameIdentifier	 m threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
newCapacity	TokenNameIdentifier	 new Capacity
*	TokenNameMULTIPLY	
m_loadFactor	TokenNameIdentifier	 m load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_table	TokenNameIdentifier	 m table
=	TokenNameEQUAL	
new	TokenNamenew	
HashEntry	TokenNameIdentifier	 Hash Entry
[	TokenNameLBRACKET	
newCapacity	TokenNameIdentifier	 new Capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
oldCapacity	TokenNameIdentifier	 old Capacity
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
HashEntry	TokenNameIdentifier	 Hash Entry
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
HashEntry	TokenNameIdentifier	 Hash Entry
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
newIndex	TokenNameIdentifier	 new Index
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
%	TokenNameREMAINDER	
newCapacity	TokenNameIdentifier	 new Capacity
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
newIndex	TokenNameIdentifier	 new Index
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
newIndex	TokenNameIdentifier	 new Index
=	TokenNameEQUAL	
-	TokenNameMINUS	
newIndex	TokenNameIdentifier	 new Index
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
m_table	TokenNameIdentifier	 m table
[	TokenNameLBRACKET	
newIndex	TokenNameIdentifier	 new Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
m_table	TokenNameIdentifier	 m table
[	TokenNameLBRACKET	
newIndex	TokenNameIdentifier	 new Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given a type, return an expanded name ID.Any additional nodes that are * created that have this expanded name will use this ID. * * @return the expanded-name id of the node. */	TokenNameCOMMENT_JAVADOC	 Given a type, return an expanded name ID.Any additional nodes that are created that have this expanded name will use this ID. * @return the expanded-name id of the node. 
public	TokenNamepublic	
int	TokenNameint	
getExpandedTypeID	TokenNameIdentifier	 get Expanded Type ID
(	TokenNameLPAREN	
int	TokenNameint	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the local name part. * * @param ExpandedNameID an ID that represents an expanded-name. * @return String Local name of this node, or null if the node has no name. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the local name part. * @param ExpandedNameID an ID that represents an expanded-name. @return String Local name of this node, or null if the node has no name. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the local name ID. * * @param ExpandedNameID an ID that represents an expanded-name. * @return The id of this local name. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the local name ID. * @param ExpandedNameID an ID that represents an expanded-name. @return The id of this local name. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getLocalNameID	TokenNameIdentifier	 get Local Name ID
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ExtendedType etype = m_extendedTypes[ExpandedNameID]; 	TokenNameCOMMENT_LINE	ExtendedType etype = m_extendedTypes[ExpandedNameID]; 
if	TokenNameif	
(	TokenNameLPAREN	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
]	TokenNameRBRACKET	
.	TokenNameDOT	
getLocalName	TokenNameIdentifier	 get Local Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the namespace URI part. * * @param ExpandedNameID an ID that represents an expanded-name. * @return String URI value of this node's namespace, or null if no * namespace was resolved. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the namespace URI part. * @param ExpandedNameID an ID that represents an expanded-name. @return String URI value of this node's namespace, or null if no namespace was resolved. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
namespace	TokenNameIdentifier	 namespace
=	TokenNameEQUAL	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
namespace	TokenNameIdentifier	 namespace
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
namespace	TokenNameIdentifier	 namespace
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the namespace URI ID. * * @param ExpandedNameID an ID that represents an expanded-name. * @return The id of this namespace. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the namespace URI ID. * @param ExpandedNameID an ID that represents an expanded-name. @return The id of this namespace. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getNamespaceID	TokenNameIdentifier	 get Namespace ID
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ExtendedType etype = m_extendedTypes[ExpandedNameID]; 	TokenNameCOMMENT_LINE	ExtendedType etype = m_extendedTypes[ExpandedNameID]; 
if	TokenNameif	
(	TokenNameLPAREN	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNamespace	TokenNameIdentifier	 get Namespace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given an expanded-name ID, return the local name ID. * * @param ExpandedNameID an ID that represents an expanded-name. * @return The id of this local name. */	TokenNameCOMMENT_JAVADOC	 Given an expanded-name ID, return the local name ID. * @param ExpandedNameID an ID that represents an expanded-name. @return The id of this local name. 
public	TokenNamepublic	
final	TokenNamefinal	
short	TokenNameshort	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
int	TokenNameint	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//ExtendedType etype = m_extendedTypes[ExpandedNameID]; 	TokenNameCOMMENT_LINE	ExtendedType etype = m_extendedTypes[ExpandedNameID]; 
return	TokenNamereturn	
(	TokenNameLPAREN	
short	TokenNameshort	
)	TokenNameRPAREN	
m_extendedTypes	TokenNameIdentifier	 m extended Types
[	TokenNameLBRACKET	
ExpandedNameID	TokenNameIdentifier	 Expanded Name ID
]	TokenNameRBRACKET	
.	TokenNameDOT	
getNodeType	TokenNameIdentifier	 get Node Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the size of the ExpandedNameTable * * @return The size of the ExpandedNameTable */	TokenNameCOMMENT_JAVADOC	 Return the size of the ExpandedNameTable * @return The size of the ExpandedNameTable 
public	TokenNamepublic	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_nextType	TokenNameIdentifier	 m next Type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the array of extended types * * @return The array of extended types */	TokenNameCOMMENT_JAVADOC	 Return the array of extended types * @return The array of extended types 
public	TokenNamepublic	
ExtendedType	TokenNameIdentifier	 Extended Type
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getExtendedTypes	TokenNameIdentifier	 get Extended Types
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_extendedTypes	TokenNameIdentifier	 m extended Types
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Inner class which represents a hash table entry. * The field next points to the next entry which is hashed into * the same bucket in the case of "hash collision". */	TokenNameCOMMENT_JAVADOC	 Inner class which represents a hash table entry. The field next points to the next entry which is hashed into the same bucket in the case of "hash collision". 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
HashEntry	TokenNameIdentifier	 Hash Entry
{	TokenNameLBRACE	
ExtendedType	TokenNameIdentifier	 Extended Type
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
int	TokenNameint	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
HashEntry	TokenNameIdentifier	 Hash Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
HashEntry	TokenNameIdentifier	 Hash Entry
(	TokenNameLPAREN	
ExtendedType	TokenNameIdentifier	 Extended Type
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
HashEntry	TokenNameIdentifier	 Hash Entry
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
