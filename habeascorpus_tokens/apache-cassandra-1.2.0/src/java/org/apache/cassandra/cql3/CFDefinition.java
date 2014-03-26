/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
base	TokenNameIdentifier	 base
.	TokenNameDOT	
Joiner	TokenNameIdentifier	 Joiner
;	TokenNameSEMICOLON	
import	TokenNameimport	
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
CFMetaData	TokenNameIdentifier	 CF Meta Data
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
ColumnDefinition	TokenNameIdentifier	 Column Definition
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
AbstractType	TokenNameIdentifier	 Abstract Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
CompositeType	TokenNameIdentifier	 Composite Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
marshal	TokenNameIdentifier	 marshal
.	TokenNameDOT	
UTF8Type	TokenNameIdentifier	 UT F8 Type
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
exceptions	TokenNameIdentifier	 exceptions
.	TokenNameDOT	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
/** * Holds metadata on a CF preprocessed for use by CQL queries. */	TokenNameCOMMENT_JAVADOC	 Holds metadata on a CF preprocessed for use by CQL queries. 
public	TokenNamepublic	
class	TokenNameclass	
CFDefinition	TokenNameIdentifier	 CF Definition
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
CFDefinition	TokenNameIdentifier	 CF Definition
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
definitionType	TokenNameIdentifier	 definition Type
=	TokenNameEQUAL	
UTF8Type	TokenNameIdentifier	 UT F8 Type
.	TokenNameDOT	
instance	TokenNameIdentifier	 instance
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_KEY_ALIAS	TokenNameIdentifier	 DEFAULT  KEY  ALIAS
=	TokenNameEQUAL	
"key"	TokenNameStringLiteral	key
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_COLUMN_ALIAS	TokenNameIdentifier	 DEFAULT  COLUMN  ALIAS
=	TokenNameEQUAL	
"column"	TokenNameStringLiteral	column
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
DEFAULT_VALUE_ALIAS	TokenNameIdentifier	 DEFAULT  VALUE  ALIAS
=	TokenNameEQUAL	
"value"	TokenNameStringLiteral	value
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
;	TokenNameSEMICOLON	
// LinkedHashMap because the order does matter (it is the order in the composite type) 	TokenNameCOMMENT_LINE	LinkedHashMap because the order does matter (it is the order in the composite type) 
public	TokenNamepublic	
final	TokenNamefinal	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
columns	TokenNameIdentifier	 columns
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
<	TokenNameLESS	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Name	TokenNameIdentifier	 Name
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
// Keep metadata lexicographically ordered so that wildcard expansion have a deterministic order 	TokenNameCOMMENT_LINE	Keep metadata lexicographically ordered so that wildcard expansion have a deterministic order 
public	TokenNamepublic	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
metadata	TokenNameIdentifier	 metadata
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
<	TokenNameLESS	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isComposite	TokenNameIdentifier	 is Composite
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasCompositeKey	TokenNameIdentifier	 has Composite Key
;	TokenNameSEMICOLON	
// Note that isCompact means here that no componet of the comparator correspond to the column names 	TokenNameCOMMENT_LINE	Note that isCompact means here that no componet of the comparator correspond to the column names 
// defined in the CREATE TABLE QUERY. This is not exactly equivalent to the 'WITH COMPACT STORAGE' 	TokenNameCOMMENT_LINE	defined in the CREATE TABLE QUERY. This is not exactly equivalent to the 'WITH COMPACT STORAGE' 
// option when creating a table in that "static CF" without a composite type will have isCompact == false 	TokenNameCOMMENT_LINE	option when creating a table in that "static CF" without a composite type will have isCompact == false 
// even though one must use 'WITH COMPACT STORAGE' to declare them. 	TokenNameCOMMENT_LINE	even though one must use 'WITH COMPACT STORAGE' to declare them. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isCompact	TokenNameIdentifier	 is Compact
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
hasCollections	TokenNameIdentifier	 has Collections
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CFDefinition	TokenNameIdentifier	 CF Definition
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
cfm	TokenNameIdentifier	 cfm
=	TokenNameEQUAL	
cfm	TokenNameIdentifier	 cfm
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyValidator	TokenNameIdentifier	 get Key Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
instanceof	TokenNameinstanceof	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hasCompositeKey	TokenNameIdentifier	 has Composite Key
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
CompositeType	TokenNameIdentifier	 Composite Type
keyComposite	TokenNameIdentifier	 key Composite
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyValidator	TokenNameIdentifier	 get Key Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
keyComposite	TokenNameIdentifier	 key Composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
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
keyComposite	TokenNameIdentifier	 key Composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getKeyId	TokenNameIdentifier	 get Key Id
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
KEY_ALIAS	TokenNameIdentifier	 KEY  ALIAS
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
keyComposite	TokenNameIdentifier	 key Composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hasCompositeKey	TokenNameIdentifier	 has Composite Key
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getKeyId	TokenNameIdentifier	 get Key Id
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
KEY_ALIAS	TokenNameIdentifier	 KEY  ALIAS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyValidator	TokenNameIdentifier	 get Key Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
instanceof	TokenNameinstanceof	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isComposite	TokenNameIdentifier	 is Composite
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
CompositeType	TokenNameIdentifier	 Composite Type
composite	TokenNameIdentifier	 composite
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
/* * We are a "sparse" composite, i.e. a non-compact one, if either: * - the last type of the composite is a ColumnToCollectionType * - or we have one less alias than of composite types and the last type is UTF8Type. * * Note that this is not perfect: if someone upgrading from thrift "renames" all but * the last column alias, the cf will be considered "sparse" and he will be stuck with * that even though that might not be what he wants. But the simple workaround is * for that user to rename all the aliases at the same time in the first place. */	TokenNameCOMMENT_BLOCK	 We are a "sparse" composite, i.e. a non-compact one, if either: - the last type of the composite is a ColumnToCollectionType - or we have one less alias than of composite types and the last type is UTF8Type. * Note that this is not perfect: if someone upgrading from thrift "renames" all but the last column alias, the cf will be considered "sparse" and he will be stuck with that even though that might not be what he wants. But the simple workaround is for that user to rename all the aliases at the same time in the first place. 
int	TokenNameint	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
lastType	TokenNameIdentifier	 last Type
=	TokenNameEQUAL	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lastType	TokenNameIdentifier	 last Type
instanceof	TokenNameinstanceof	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
||	TokenNameOR_OR	
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnAliases	TokenNameIdentifier	 get Column Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
last	TokenNameIdentifier	 last
&&	TokenNameAND_AND	
lastType	TokenNameIdentifier	 last Type
instanceof	TokenNameinstanceof	
UTF8Type	TokenNameIdentifier	 UT F8 Type
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// "sparse" composite 	TokenNameCOMMENT_LINE	"sparse" composite 
this	TokenNamethis	
.	TokenNameDOT	
isCompact	TokenNameIdentifier	 is Compact
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getValueAlias	TokenNameIdentifier	 get Value Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// check for collection type 	TokenNameCOMMENT_LINE	check for collection type 
if	TokenNameif	
(	TokenNameLPAREN	
lastType	TokenNameIdentifier	 last Type
instanceof	TokenNameinstanceof	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
--	TokenNameMINUS_MINUS	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasCollections	TokenNameIdentifier	 has Collections
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hasCollections	TokenNameIdentifier	 has Collections
=	TokenNameEQUAL	
false	TokenNamefalse	
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
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getColumnId	TokenNameIdentifier	 get Column Id
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
COLUMN_ALIAS	TokenNameIdentifier	 COLUMN  ALIAS
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
ColumnDefinition	TokenNameIdentifier	 Column Definition
>	TokenNameGREATER	
def	TokenNameIdentifier	 def
:	TokenNameCOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumn_metadata	TokenNameIdentifier	 get Column metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnDefinitionComparator	TokenNameIdentifier	 get Column Definition Comparator
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
COLUMN_METADATA	TokenNameIdentifier	 COLUMN  METADATA
,	TokenNameCOMMA	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValidator	TokenNameIdentifier	 get Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// "dense" composite 	TokenNameCOMMENT_LINE	"dense" composite 
this	TokenNamethis	
.	TokenNameDOT	
isCompact	TokenNameIdentifier	 is Compact
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasCollections	TokenNameIdentifier	 has Collections
=	TokenNameEQUAL	
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
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getColumnId	TokenNameIdentifier	 get Column Id
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
COLUMN_ALIAS	TokenNameIdentifier	 COLUMN  ALIAS
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
createValue	TokenNameIdentifier	 create Value
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
isComposite	TokenNameIdentifier	 is Composite
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hasCollections	TokenNameIdentifier	 has Collections
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnAliases	TokenNameIdentifier	 get Column Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumn_metadata	TokenNameIdentifier	 get Column metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// dynamic CF 	TokenNameCOMMENT_LINE	dynamic CF 
this	TokenNamethis	
.	TokenNameDOT	
isCompact	TokenNameIdentifier	 is Compact
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
getColumnId	TokenNameIdentifier	 get Column Id
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Name	TokenNameIdentifier	 Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
new	TokenNamenew	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
COLUMN_ALIAS	TokenNameIdentifier	 COLUMN  ALIAS
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
createValue	TokenNameIdentifier	 create Value
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// static CF 	TokenNameCOMMENT_LINE	static CF 
this	TokenNamethis	
.	TokenNameDOT	
isCompact	TokenNameIdentifier	 is Compact
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getValueAlias	TokenNameIdentifier	 get Value Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnAliases	TokenNameIdentifier	 get Column Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnAliases	TokenNameIdentifier	 get Column Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
ColumnDefinition	TokenNameIdentifier	 Column Definition
>	TokenNameGREATER	
def	TokenNameIdentifier	 def
:	TokenNameCOLON	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumn_metadata	TokenNameIdentifier	 get Column metadata
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
entrySet	TokenNameIdentifier	 entry Set
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
id	TokenNameIdentifier	 id
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnDefinitionComparator	TokenNameIdentifier	 get Column Definition Comparator
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
new	TokenNamenew	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
id	TokenNameIdentifier	 id
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
COLUMN_METADATA	TokenNameIdentifier	 COLUMN  METADATA
,	TokenNameCOMMA	
def	TokenNameIdentifier	 def
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getValidator	TokenNameIdentifier	 get Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
assert	TokenNameassert	
value	TokenNameIdentifier	 value
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
getKeyId	TokenNameIdentifier	 get Key Id
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
definedNames	TokenNameIdentifier	 defined Names
=	TokenNameEQUAL	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyAliases	TokenNameIdentifier	 get Key Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// For compatibility sake, non-composite key default alias is 'key', not 'key1'. 	TokenNameCOMMENT_LINE	For compatibility sake, non-composite key default alias is 'key', not 'key1'. 
return	TokenNamereturn	
definedNames	TokenNameIdentifier	 defined Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
definedNames	TokenNameIdentifier	 defined Names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyAliases	TokenNameIdentifier	 get Key Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
DEFAULT_KEY_ALIAS	TokenNameIdentifier	 DEFAULT  KEY  ALIAS
:	TokenNameCOLON	
DEFAULT_KEY_ALIAS	TokenNameIdentifier	 DEFAULT  KEY  ALIAS
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyAliases	TokenNameIdentifier	 get Key Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
definitionType	TokenNameIdentifier	 definition Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
getColumnId	TokenNameIdentifier	 get Column Id
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
,	TokenNameCOMMA	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
definedNames	TokenNameIdentifier	 defined Names
=	TokenNameEQUAL	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnAliases	TokenNameIdentifier	 get Column Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
definedNames	TokenNameIdentifier	 defined Names
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
i	TokenNameIdentifier	 i
>=	TokenNameGREATER_EQUAL	
definedNames	TokenNameIdentifier	 defined Names
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnAliases	TokenNameIdentifier	 get Column Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
DEFAULT_COLUMN_ALIAS	TokenNameIdentifier	 DEFAULT  COLUMN  ALIAS
+	TokenNamePLUS	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getColumnAliases	TokenNameIdentifier	 get Column Aliases
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
,	TokenNameCOMMA	
definitionType	TokenNameIdentifier	 definition Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
getValueId	TokenNameIdentifier	 get Value Id
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getValueAlias	TokenNameIdentifier	 get Value Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
DEFAULT_VALUE_ALIAS	TokenNameIdentifier	 DEFAULT  VALUE  ALIAS
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getValueAlias	TokenNameIdentifier	 get Value Alias
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
definitionType	TokenNameIdentifier	 definition Type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
getCollectionType	TokenNameIdentifier	 get Collection Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
hasCollections	TokenNameIdentifier	 has Collections
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
CompositeType	TokenNameIdentifier	 Composite Type
composite	TokenNameIdentifier	 composite
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
ColumnToCollectionType	TokenNameIdentifier	 Column To Collection Type
)	TokenNameRPAREN	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
Name	TokenNameIdentifier	 Name
createValue	TokenNameIdentifier	 create Value
(	TokenNameLPAREN	
CFMetaData	TokenNameIdentifier	 CF Meta Data
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
alias	TokenNameIdentifier	 alias
=	TokenNameEQUAL	
getValueId	TokenNameIdentifier	 get Value Id
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// That's how we distinguish between 'no value alias because coming from thrift' and 'I explicitely did not 	TokenNameCOMMENT_LINE	That's how we distinguish between 'no value alias because coming from thrift' and 'I explicitely did not 
// define a value' (see CreateColumnFamilyStatement) 	TokenNameCOMMENT_LINE	define a value' (see CreateColumnFamilyStatement) 
return	TokenNamereturn	
alias	TokenNameIdentifier	 alias
.	TokenNameDOT	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
alias	TokenNameIdentifier	 alias
,	TokenNameCOMMA	
Name	TokenNameIdentifier	 Name
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
VALUE_ALIAS	TokenNameIdentifier	 VALUE  ALIAS
,	TokenNameCOMMA	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getDefaultValidator	TokenNameIdentifier	 get Default Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Name	TokenNameIdentifier	 Name
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
{	TokenNameLBRACE	
CFDefinition	TokenNameIdentifier	 CF Definition
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
kdef	TokenNameIdentifier	 kdef
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kdef	TokenNameIdentifier	 kdef
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
kdef	TokenNameIdentifier	 kdef
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
CFDefinition	TokenNameIdentifier	 CF Definition
.	TokenNameDOT	
Name	TokenNameIdentifier	 Name
def	TokenNameIdentifier	 def
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
def	TokenNameIdentifier	 def
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
def	TokenNameIdentifier	 def
;	TokenNameSEMICOLON	
return	TokenNamereturn	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
<	TokenNameLESS	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
keyIter	TokenNameIdentifier	 key Iter
=	TokenNameEQUAL	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
columnIter	TokenNameIdentifier	 column Iter
=	TokenNameEQUAL	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
boolean	TokenNameboolean	
valueDone	TokenNameIdentifier	 value Done
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Name	TokenNameIdentifier	 Name
>	TokenNameGREATER	
metadataIter	TokenNameIdentifier	 metadata Iter
=	TokenNameEQUAL	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Name	TokenNameIdentifier	 Name
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
keyIter	TokenNameIdentifier	 key Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
keyIter	TokenNameIdentifier	 key Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
columnIter	TokenNameIdentifier	 column Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
columnIter	TokenNameIdentifier	 column Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
valueDone	TokenNameIdentifier	 value Done
)	TokenNameRPAREN	
{	TokenNameLBRACE	
valueDone	TokenNameIdentifier	 value Done
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
metadataIter	TokenNameIdentifier	 metadata Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
metadataIter	TokenNameIdentifier	 metadata Iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
endOfData	TokenNameIdentifier	 end Of Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
getKeyNameBuilder	TokenNameIdentifier	 get Key Name Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hasCompositeKey	TokenNameIdentifier	 has Composite Key
?	TokenNameQUESTION	
new	TokenNamenew	
CompositeType	TokenNameIdentifier	 Composite Type
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyValidator	TokenNameIdentifier	 get Key Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
getKeyValidator	TokenNameIdentifier	 get Key Validator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
getColumnNameBuilder	TokenNameIdentifier	 get Column Name Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
isComposite	TokenNameIdentifier	 is Composite
?	TokenNameQUESTION	
new	TokenNamenew	
CompositeType	TokenNameIdentifier	 Composite Type
.	TokenNameDOT	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
)	TokenNameRPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
(	TokenNameLPAREN	
cfm	TokenNameIdentifier	 cfm
.	TokenNameDOT	
comparator	TokenNameIdentifier	 comparator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Name	TokenNameIdentifier	 Name
extends	TokenNameextends	
ColumnSpecification	TokenNameIdentifier	 Column Specification
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
Kind	TokenNameIdentifier	 Kind
{	TokenNameLBRACE	
KEY_ALIAS	TokenNameIdentifier	 KEY  ALIAS
,	TokenNameCOMMA	
COLUMN_ALIAS	TokenNameIdentifier	 COLUMN  ALIAS
,	TokenNameCOMMA	
VALUE_ALIAS	TokenNameIdentifier	 VALUE  ALIAS
,	TokenNameCOMMA	
COLUMN_METADATA	TokenNameIdentifier	 COLUMN  METADATA
}	TokenNameRBRACE	
private	TokenNameprivate	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
kind	TokenNameIdentifier	 kind
,	TokenNameCOMMA	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Name	TokenNameIdentifier	 Name
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
ColumnIdentifier	TokenNameIdentifier	 Column Identifier
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
,	TokenNameCOMMA	
int	TokenNameint	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
ksName	TokenNameIdentifier	 ks Name
,	TokenNameCOMMA	
cfName	TokenNameIdentifier	 cf Name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
kind	TokenNameIdentifier	 kind
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
// only make sense for KEY_ALIAS and COLUMN_ALIAS 	TokenNameCOMMENT_LINE	only make sense for KEY_ALIAS and COLUMN_ALIAS 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuilder	TokenNameIdentifier	 String Builder
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Joiner	TokenNameIdentifier	 Joiner
.	TokenNameDOT	
on	TokenNameIdentifier	 on
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
keys	TokenNameIdentifier	 keys
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Joiner	TokenNameIdentifier	 Joiner
.	TokenNameDOT	
on	TokenNameIdentifier	 on
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
columns	TokenNameIdentifier	 columns
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" => "	TokenNameStringLiteral	 => 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
name	TokenNameIdentifier	 name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"{"	TokenNameStringLiteral	{
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Joiner	TokenNameIdentifier	 Joiner
.	TokenNameDOT	
on	TokenNameIdentifier	 on
(	TokenNameLPAREN	
", "	TokenNameStringLiteral	, 
)	TokenNameRPAREN	
.	TokenNameDOT	
join	TokenNameIdentifier	 join
(	TokenNameLPAREN	
metadata	TokenNameIdentifier	 metadata
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" }"	TokenNameStringLiteral	 }
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
implements	TokenNameimplements	
ColumnNameBuilder	TokenNameIdentifier	 Column Name Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
;	TokenNameSEMICOLON	
private	TokenNameprivate	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
bb	TokenNameIdentifier	 bb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Column name is already constructed"	TokenNameStringLiteral	Column name is already constructed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
bb	TokenNameIdentifier	 bb
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Term	TokenNameIdentifier	 Term
t	TokenNameIdentifier	 t
,	TokenNameCOMMA	
Relation	TokenNameIdentifier	 Relation
.	TokenNameDOT	
Type	TokenNameIdentifier	 Type
op	TokenNameIdentifier	 op
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
>	TokenNameGREATER	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
throws	TokenNamethrows	
InvalidRequestException	TokenNameIdentifier	 Invalid Request Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalStateException	TokenNameIdentifier	 Illegal State Exception
(	TokenNameLPAREN	
"Column name is already constructed"	TokenNameStringLiteral	Column name is already constructed
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We don't support the relation type yet, i.e., there is no distinction between x > 3 and x >= 3. 	TokenNameCOMMENT_LINE	We don't support the relation type yet, i.e., there is no distinction between x > 3 and x >= 3. 
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
getByteBuffer	TokenNameIdentifier	 get Byte Buffer
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
variables	TokenNameIdentifier	 variables
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
componentCount	TokenNameIdentifier	 component Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnName	TokenNameIdentifier	 column Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
0	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
remainingCount	TokenNameIdentifier	 remaining Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnName	TokenNameIdentifier	 column Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
columnName	TokenNameIdentifier	 column Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
EMPTY_BYTE_BUFFER	TokenNameIdentifier	 EMPTY  BYTE  BUFFER
:	TokenNameCOLON	
columnName	TokenNameIdentifier	 column Name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
buildAsEndOfRange	TokenNameIdentifier	 build As End Of Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
build	TokenNameIdentifier	 build
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
newBuilder	TokenNameIdentifier	 new Builder
=	TokenNameEQUAL	
new	TokenNamenew	
NonCompositeBuilder	TokenNameIdentifier	 Non Composite Builder
(	TokenNameLPAREN	
type	TokenNameIdentifier	 type
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
newBuilder	TokenNameIdentifier	 new Builder
.	TokenNameDOT	
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
columnName	TokenNameIdentifier	 column Name
;	TokenNameSEMICOLON	
return	TokenNamereturn	
newBuilder	TokenNameIdentifier	 new Builder
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
