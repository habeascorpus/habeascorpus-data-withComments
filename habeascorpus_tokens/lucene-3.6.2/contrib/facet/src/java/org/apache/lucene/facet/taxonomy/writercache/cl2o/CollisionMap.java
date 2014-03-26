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
.	TokenNameDOT	
writercache	TokenNameIdentifier	 writercache
.	TokenNameDOT	
cl2o	TokenNameIdentifier	 cl2o
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
facet	TokenNameIdentifier	 facet
.	TokenNameDOT	
taxonomy	TokenNameIdentifier	 taxonomy
.	TokenNameDOT	
CategoryPath	TokenNameIdentifier	 Category Path
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/** * HashMap to store colliding labels. See {@link CompactLabelToOrdinal} for * details. * * @lucene.experimental */	TokenNameCOMMENT_JAVADOC	 HashMap to store colliding labels. See {@link CompactLabelToOrdinal} for details. * @lucene.experimental 
public	TokenNamepublic	
class	TokenNameclass	
CollisionMap	TokenNameIdentifier	 Collision Map
{	TokenNameLBRACE	
private	TokenNameprivate	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
private	TokenNameprivate	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
threshold	TokenNameIdentifier	 threshold
;	TokenNameSEMICOLON	
static	TokenNamestatic	
class	TokenNameclass	
Entry	TokenNameIdentifier	 Entry
{	TokenNameLBRACE	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
int	TokenNameint	
cid	TokenNameIdentifier	 cid
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
int	TokenNameint	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
cid	TokenNameIdentifier	 cid
=	TokenNameEQUAL	
cid	TokenNameIdentifier	 cid
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
h	TokenNameIdentifier	 h
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
CharBlockArray	TokenNameIdentifier	 Char Block Array
labelRepository	TokenNameIdentifier	 label Repository
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CollisionMap	TokenNameIdentifier	 Collision Map
(	TokenNameLPAREN	
CharBlockArray	TokenNameIdentifier	 Char Block Array
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
16	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
1024	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
0.75f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
CollisionMap	TokenNameIdentifier	 Collision Map
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
CharBlockArray	TokenNameIdentifier	 Char Block Array
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
0.75f	TokenNameFloatingPointLiteral	
,	TokenNameCOMMA	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
CollisionMap	TokenNameIdentifier	 Collision Map
(	TokenNameLPAREN	
int	TokenNameint	
initialCapacity	TokenNameIdentifier	 initial Capacity
,	TokenNameCOMMA	
float	TokenNamefloat	
loadFactor	TokenNameIdentifier	 load Factor
,	TokenNameCOMMA	
CharBlockArray	TokenNameIdentifier	 Char Block Array
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
=	TokenNameEQUAL	
labelRepository	TokenNameIdentifier	 label Repository
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
=	TokenNameEQUAL	
loadFactor	TokenNameIdentifier	 load Factor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
CompactLabelToOrdinal	TokenNameIdentifier	 Compact Label To Ordinal
.	TokenNameDOT	
determineCapacity	TokenNameIdentifier	 determine Capacity
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
initialCapacity	TokenNameIdentifier	 initial Capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
capacity	TokenNameIdentifier	 capacity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
newCapacity	TokenNameIdentifier	 new Capacity
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
newEntries	TokenNameIdentifier	 new Entries
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
newCapacity	TokenNameIdentifier	 new Capacity
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
src	TokenNameIdentifier	 src
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
j	TokenNameIdentifier	 j
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
<	TokenNameLESS	
src	TokenNameIdentifier	 src
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
j	TokenNameIdentifier	 j
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
src	TokenNameIdentifier	 src
[	TokenNameLBRACKET	
j	TokenNameIdentifier	 j
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
newCapacity	TokenNameIdentifier	 new Capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
newEntries	TokenNameIdentifier	 new Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
newEntries	TokenNameIdentifier	 new Entries
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
=	TokenNameEQUAL	
newCapacity	TokenNameIdentifier	 new Capacity
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
=	TokenNameEQUAL	
newEntries	TokenNameIdentifier	 new Entries
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
*	TokenNameMULTIPLY	
this	TokenNamethis	
.	TokenNameDOT	
loadFactor	TokenNameIdentifier	 load Factor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bucketIndex	TokenNameIdentifier	 bucket Index
=	TokenNameEQUAL	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
bucketIndex	TokenNameIdentifier	 bucket Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
&&	TokenNameAND_AND	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equalsToSerialized	TokenNameIdentifier	 equals To Serialized
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
.	TokenNameDOT	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cid	TokenNameIdentifier	 cid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bucketIndex	TokenNameIdentifier	 bucket Index
=	TokenNameEQUAL	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
bucketIndex	TokenNameIdentifier	 bucket Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
&&	TokenNameAND_AND	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equalsToSerialized	TokenNameIdentifier	 equals To Serialized
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
LabelToOrdinal	TokenNameIdentifier	 Label To Ordinal
.	TokenNameDOT	
InvalidOrdinal	TokenNameIdentifier	 Invalid Ordinal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cid	TokenNameIdentifier	 cid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
cid	TokenNameIdentifier	 cid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bucketIndex	TokenNameIdentifier	 bucket Index
=	TokenNameEQUAL	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
bucketIndex	TokenNameIdentifier	 bucket Index
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
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equalsToSerialized	TokenNameIdentifier	 equals To Serialized
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cid	TokenNameIdentifier	 cid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// new string; add to label repository 	TokenNameCOMMENT_LINE	new string; add to label repository 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
serializeAppendTo	TokenNameIdentifier	 serialize Append To
(	TokenNameLPAREN	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen, because labelRepository.append() doesn't throw an exception 	TokenNameCOMMENT_LINE	can't happen, because labelRepository.append() doesn't throw an exception 
}	TokenNameRBRACE	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
bucketIndex	TokenNameIdentifier	 bucket Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cid	TokenNameIdentifier	 cid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
addLabel	TokenNameIdentifier	 add Label
(	TokenNameLPAREN	
CategoryPath	TokenNameIdentifier	 Category Path
label	TokenNameIdentifier	 label
,	TokenNameCOMMA	
int	TokenNameint	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
cid	TokenNameIdentifier	 cid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bucketIndex	TokenNameIdentifier	 bucket Index
=	TokenNameEQUAL	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
bucketIndex	TokenNameIdentifier	 bucket Index
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
label	TokenNameIdentifier	 label
.	TokenNameDOT	
equalsToSerialized	TokenNameIdentifier	 equals To Serialized
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
cid	TokenNameIdentifier	 cid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// new string; add to label repository 	TokenNameCOMMENT_LINE	new string; add to label repository 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
labelRepository	TokenNameIdentifier	 label Repository
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
label	TokenNameIdentifier	 label
.	TokenNameDOT	
serializeAppendTo	TokenNameIdentifier	 serialize Append To
(	TokenNameLPAREN	
prefixLen	TokenNameIdentifier	 prefix Len
,	TokenNameCOMMA	
labelRepository	TokenNameIdentifier	 label Repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
IOException	TokenNameIdentifier	 IO Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// can't happen, because labelRepository.append() doesn't throw an exception 	TokenNameCOMMENT_LINE	can't happen, because labelRepository.append() doesn't throw an exception 
}	TokenNameRBRACE	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
bucketIndex	TokenNameIdentifier	 bucket Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cid	TokenNameIdentifier	 cid
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This method does not check if the same value is already * in the map because we pass in an char-array offset, so * so we now that we're in resize-mode here. */	TokenNameCOMMENT_JAVADOC	 This method does not check if the same value is already in the map because we pass in an char-array offset, so so we now that we're in resize-mode here. 
public	TokenNamepublic	
void	TokenNamevoid	
addLabelOffset	TokenNameIdentifier	 add Label Offset
(	TokenNameLPAREN	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
cid	TokenNameIdentifier	 cid
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
bucketIndex	TokenNameIdentifier	 bucket Index
=	TokenNameEQUAL	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
this	TokenNamethis	
.	TokenNameDOT	
capacity	TokenNameIdentifier	 capacity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
bucketIndex	TokenNameIdentifier	 bucket Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
addEntry	TokenNameIdentifier	 add Entry
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
int	TokenNameint	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
int	TokenNameint	
bucketIndex	TokenNameIdentifier	 bucket Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
bucketIndex	TokenNameIdentifier	 bucket Index
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
[	TokenNameLBRACKET	
bucketIndex	TokenNameIdentifier	 bucket Index
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
Entry	TokenNameIdentifier	 Entry
(	TokenNameLPAREN	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
cid	TokenNameIdentifier	 cid
,	TokenNameCOMMA	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
>=	TokenNameGREATER_EQUAL	
this	TokenNamethis	
.	TokenNameDOT	
threshold	TokenNameIdentifier	 threshold
)	TokenNameRPAREN	
{	TokenNameLBRACE	
grow	TokenNameIdentifier	 grow
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
CollisionMap	TokenNameIdentifier	 Collision Map
.	TokenNameDOT	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
entryIterator	TokenNameIdentifier	 entry Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
EntryIterator	TokenNameIdentifier	 Entry Iterator
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
,	TokenNameCOMMA	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns index for hash code h. */	TokenNameCOMMENT_JAVADOC	 Returns index for hash code h. 
static	TokenNamestatic	
int	TokenNameint	
indexFor	TokenNameIdentifier	 index For
(	TokenNameLPAREN	
int	TokenNameint	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
h	TokenNameIdentifier	 h
&	TokenNameAND	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns an estimate of the memory usage of this CollisionMap. * @return The approximate number of bytes used by this structure. */	TokenNameCOMMENT_JAVADOC	 Returns an estimate of the memory usage of this CollisionMap. @return The approximate number of bytes used by this structure. 
int	TokenNameint	
getMemoryUsage	TokenNameIdentifier	 get Memory Usage
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
memoryUsage	TokenNameIdentifier	 memory Usage
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
memoryUsage	TokenNameIdentifier	 memory Usage
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
ee	TokenNameIdentifier	 ee
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
ee	TokenNameIdentifier	 ee
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
ee	TokenNameIdentifier	 ee
=	TokenNameEQUAL	
ee	TokenNameIdentifier	 ee
.	TokenNameDOT	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
memoryUsage	TokenNameIdentifier	 memory Usage
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
4	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
memoryUsage	TokenNameIdentifier	 memory Usage
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
EntryIterator	TokenNameIdentifier	 Entry Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
Entry	TokenNameIdentifier	 Entry
>	TokenNameGREATER	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
// next entry to return 	TokenNameCOMMENT_LINE	next entry to return 
int	TokenNameint	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
// current slot 	TokenNameCOMMENT_LINE	current slot 
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
ents	TokenNameIdentifier	 ents
;	TokenNameSEMICOLON	
EntryIterator	TokenNameIdentifier	 Entry Iterator
(	TokenNameLPAREN	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
entries	TokenNameIdentifier	 entries
,	TokenNameCOMMA	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
ents	TokenNameIdentifier	 ents
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
entries	TokenNameIdentifier	 entries
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// advance to first entry 	TokenNameCOMMENT_LINE	advance to first entry 
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// advance 	TokenNameCOMMENT_LINE	advance 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Entry	TokenNameIdentifier	 Entry
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Entry	TokenNameIdentifier	 Entry
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
Entry	TokenNameIdentifier	 Entry
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
ents	TokenNameIdentifier	 ents
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
t	TokenNameIdentifier	 t
[	TokenNameLBRACKET	
--	TokenNameMINUS_MINUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
UnsupportedOperationException	TokenNameIdentifier	 Unsupported Operation Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
