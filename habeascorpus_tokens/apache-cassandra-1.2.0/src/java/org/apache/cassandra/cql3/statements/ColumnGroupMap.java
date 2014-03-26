/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
cql3	TokenNameIdentifier	 cql3
.	TokenNameDOT	
statements	TokenNameIdentifier	 statements
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
ArrayList	TokenNameIdentifier	 Array List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
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
IColumn	TokenNameIdentifier	 I Column
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
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Pair	TokenNameIdentifier	 Pair
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ColumnGroupMap	TokenNameIdentifier	 Column Group Map
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fullPath	TokenNameIdentifier	 full Path
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Map	TokenNameIdentifier	 Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
>	TokenNameGREATER	
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
Value	TokenNameIdentifier	 Value
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ColumnGroupMap	TokenNameIdentifier	 Column Group Map
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fullPath	TokenNameIdentifier	 full Path
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
fullPath	TokenNameIdentifier	 full Path
=	TokenNameEQUAL	
fullPath	TokenNameIdentifier	 full Path
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fullName	TokenNameIdentifier	 full Name
,	TokenNameCOMMA	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
columnName	TokenNameIdentifier	 column Name
=	TokenNameEQUAL	
fullName	TokenNameIdentifier	 full Name
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// It's a collection 	TokenNameCOMMENT_LINE	It's a collection 
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
Collection	TokenNameIdentifier	 Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assert	TokenNameassert	
v	TokenNameIdentifier	 v
instanceof	TokenNameinstanceof	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
fullName	TokenNameIdentifier	 full Name
[	TokenNameLBRACKET	
idx	TokenNameIdentifier	 idx
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
assert	TokenNameassert	
!	TokenNameNOT	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
columnName	TokenNameIdentifier	 column Name
,	TokenNameCOMMA	
new	TokenNamenew	
Simple	TokenNameIdentifier	 Simple
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
getKeyComponent	TokenNameIdentifier	 get Key Component
(	TokenNameLPAREN	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fullPath	TokenNameIdentifier	 full Path
[	TokenNameLBRACKET	
pos	TokenNameIdentifier	 pos
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IColumn	TokenNameIdentifier	 I Column
getSimple	TokenNameIdentifier	 get Simple
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v	TokenNameIdentifier	 v
instanceof	TokenNameinstanceof	
Simple	TokenNameIdentifier	 Simple
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Simple	TokenNameIdentifier	 Simple
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
.	TokenNameDOT	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>>	TokenNameRIGHT_SHIFT	
getCollection	TokenNameIdentifier	 get Collection
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Value	TokenNameIdentifier	 Value
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
v	TokenNameIdentifier	 v
instanceof	TokenNameinstanceof	
Collection	TokenNameIdentifier	 Collection
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>>	TokenNameRIGHT_SHIFT	
)	TokenNameRPAREN	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
interface	TokenNameinterface	
Value	TokenNameIdentifier	 Value
{	TokenNameLBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Simple	TokenNameIdentifier	 Simple
implements	TokenNameimplements	
Value	TokenNameIdentifier	 Value
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
Simple	TokenNameIdentifier	 Simple
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
column	TokenNameIdentifier	 column
=	TokenNameEQUAL	
column	TokenNameIdentifier	 column
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
Collection	TokenNameIdentifier	 Collection
extends	TokenNameextends	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
,	TokenNameCOMMA	
IColumn	TokenNameIdentifier	 I Column
>>	TokenNameRIGHT_SHIFT	
implements	TokenNameimplements	
Value	TokenNameIdentifier	 Value
{	TokenNameLBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Builder	TokenNameIdentifier	 Builder
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CompositeType	TokenNameIdentifier	 Composite Type
composite	TokenNameIdentifier	 composite
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
previous	TokenNameIdentifier	 previous
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ColumnGroupMap	TokenNameIdentifier	 Column Group Map
>	TokenNameGREATER	
groups	TokenNameIdentifier	 groups
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
ColumnGroupMap	TokenNameIdentifier	 Column Group Map
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ColumnGroupMap	TokenNameIdentifier	 Column Group Map
currentGroup	TokenNameIdentifier	 current Group
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Builder	TokenNameIdentifier	 Builder
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
composite	TokenNameIdentifier	 composite
,	TokenNameCOMMA	
boolean	TokenNameboolean	
hasCollections	TokenNameIdentifier	 has Collections
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
composite	TokenNameIdentifier	 composite
=	TokenNameEQUAL	
composite	TokenNameIdentifier	 composite
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
(	TokenNameLPAREN	
hasCollections	TokenNameIdentifier	 has Collections
?	TokenNameQUESTION	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
isMarkedForDelete	TokenNameIdentifier	 is Marked For Delete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
composite	TokenNameIdentifier	 composite
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnGroupMap	TokenNameIdentifier	 Column Group Map
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentGroup	TokenNameIdentifier	 current Group
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSameGroup	TokenNameIdentifier	 is Same Group
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
new	TokenNamenew	
ColumnGroupMap	TokenNameIdentifier	 Column Group Map
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
currentGroup	TokenNameIdentifier	 current Group
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For sparse composite, returns wheter the column belong to the same * cqlRow than the previously added, based on the full list of component * in the name. * Two columns do belong together if they differ only by the last * component. */	TokenNameCOMMENT_JAVADOC	 For sparse composite, returns wheter the column belong to the same cqlRow than the previously added, based on the full list of component in the name. Two columns do belong together if they differ only by the last component. 
private	TokenNameprivate	
boolean	TokenNameboolean	
isSameGroup	TokenNameIdentifier	 is Same Group
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
c	TokenNameIdentifier	 c
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
idx	TokenNameIdentifier	 idx
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
c	TokenNameIdentifier	 c
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
ColumnGroupMap	TokenNameIdentifier	 Column Group Map
>	TokenNameGREATER	
groups	TokenNameIdentifier	 groups
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
groups	TokenNameIdentifier	 groups
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
currentGroup	TokenNameIdentifier	 current Group
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentGroup	TokenNameIdentifier	 current Group
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
groups	TokenNameIdentifier	 groups
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
