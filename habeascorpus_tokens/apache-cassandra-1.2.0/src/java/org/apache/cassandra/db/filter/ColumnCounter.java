/* * * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. * */	TokenNameCOMMENT_BLOCK	 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
filter	TokenNameIdentifier	 filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
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
IColumnContainer	TokenNameIdentifier	 I Column Container
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
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
ColumnCounter	TokenNameIdentifier	 Column Counter
{	TokenNameLBRACE	
protected	TokenNameprotected	
int	TokenNameint	
live	TokenNameIdentifier	 live
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
ignored	TokenNameIdentifier	 ignored
;	TokenNameSEMICOLON	
public	TokenNamepublic	
void	TokenNamevoid	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
IColumnContainer	TokenNameIdentifier	 I Column Container
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ignored	TokenNameIdentifier	 ignored
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
else	TokenNameelse	
live	TokenNameIdentifier	 live
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
static	TokenNamestatic	
boolean	TokenNameboolean	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
IColumnContainer	TokenNameIdentifier	 I Column Container
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
container	TokenNameIdentifier	 container
.	TokenNameDOT	
deletionInfo	TokenNameIdentifier	 deletion Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isDeleted	TokenNameIdentifier	 is Deleted
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
live	TokenNameIdentifier	 live
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
live	TokenNameIdentifier	 live
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
ignored	TokenNameIdentifier	 ignored
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ignored	TokenNameIdentifier	 ignored
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
GroupByPrefix	TokenNameIdentifier	 Group By Prefix
extends	TokenNameextends	
ColumnCounter	TokenNameIdentifier	 Column Counter
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
CompositeType	TokenNameIdentifier	 Composite Type
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
int	TokenNameint	
toGroup	TokenNameIdentifier	 to Group
;	TokenNameSEMICOLON	
private	TokenNameprivate	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
last	TokenNameIdentifier	 last
;	TokenNameSEMICOLON	
/** * A column counter that count only 1 for all the columns sharing a * given prefix of the key. * * @param type the type of the column name. This can be null if {@code * toGroup} is 0, otherwise it should be a composite. * @param toGroup the number of composite components on which to group * column. If 0, all columns are grouped, otherwise we group * those for which the {@code toGroup} first component are equals. */	TokenNameCOMMENT_JAVADOC	 A column counter that count only 1 for all the columns sharing a given prefix of the key. * @param type the type of the column name. This can be null if {@code toGroup} is 0, otherwise it should be a composite. @param toGroup the number of composite components on which to group column. If 0, all columns are grouped, otherwise we group those for which the {@code toGroup} first component are equals. 
public	TokenNamepublic	
GroupByPrefix	TokenNameIdentifier	 Group By Prefix
(	TokenNameLPAREN	
CompositeType	TokenNameIdentifier	 Composite Type
type	TokenNameIdentifier	 type
,	TokenNameCOMMA	
int	TokenNameint	
toGroup	TokenNameIdentifier	 to Group
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
type	TokenNameIdentifier	 type
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
toGroup	TokenNameIdentifier	 to Group
=	TokenNameEQUAL	
toGroup	TokenNameIdentifier	 to Group
;	TokenNameSEMICOLON	
assert	TokenNameassert	
toGroup	TokenNameIdentifier	 to Group
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
type	TokenNameIdentifier	 type
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
count	TokenNameIdentifier	 count
(	TokenNameLPAREN	
IColumn	TokenNameIdentifier	 I Column
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
IColumnContainer	TokenNameIdentifier	 I Column Container
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isLive	TokenNameIdentifier	 is Live
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
,	TokenNameCOMMA	
container	TokenNameIdentifier	 container
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ignored	TokenNameIdentifier	 ignored
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
toGroup	TokenNameIdentifier	 to Group
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
live	TokenNameIdentifier	 live
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
type	TokenNameIdentifier	 type
.	TokenNameDOT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
column	TokenNameIdentifier	 column
.	TokenNameDOT	
name	TokenNameIdentifier	 name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assert	TokenNameassert	
current	TokenNameIdentifier	 current
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>=	TokenNameGREATER_EQUAL	
toGroup	TokenNameIdentifier	 to Group
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isSameGroup	TokenNameIdentifier	 is Same Group
=	TokenNameEQUAL	
true	TokenNametrue	
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
toGroup	TokenNameIdentifier	 to Group
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
compareUnsigned	TokenNameIdentifier	 compare Unsigned
(	TokenNameLPAREN	
last	TokenNameIdentifier	 last
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
current	TokenNameIdentifier	 current
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
isSameGroup	TokenNameIdentifier	 is Same Group
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isSameGroup	TokenNameIdentifier	 is Same Group
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
live	TokenNameIdentifier	 live
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
last	TokenNameIdentifier	 last
=	TokenNameEQUAL	
current	TokenNameIdentifier	 current
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
