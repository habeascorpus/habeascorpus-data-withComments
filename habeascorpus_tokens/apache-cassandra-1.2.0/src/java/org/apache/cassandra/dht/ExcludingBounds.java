/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Collections	TokenNameIdentifier	 Collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
List	TokenNameIdentifier	 List
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
RowPosition	TokenNameIdentifier	 Row Position
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
service	TokenNameIdentifier	 service
.	TokenNameDOT	
StorageService	TokenNameIdentifier	 Storage Service
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
/** * AbstractBounds containing neither of its endpoints: (left, right). Used by CQL key > X AND key < Y range scans. */	TokenNameCOMMENT_JAVADOC	 AbstractBounds containing neither of its endpoints: (left, right). Used by CQL key > X AND key < Y range scans. 
public	TokenNamepublic	
class	TokenNameclass	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
extends	TokenNameextends	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
StorageService	TokenNameIdentifier	 Storage Service
.	TokenNameDOT	
getPartitioner	TokenNameIdentifier	 get Partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
T	TokenNameIdentifier	 T
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// unlike a Range, an ExcludingBounds may not wrap, nor be empty 	TokenNameCOMMENT_LINE	unlike a Range, an ExcludingBounds may not wrap, nor be empty 
assert	TokenNameassert	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
isMinimum	TokenNameIdentifier	 is Minimum
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
:	TokenNameCOLON	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Range	TokenNameIdentifier	 Range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Pair	TokenNameIdentifier	 Pair
<	TokenNameLESS	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
,	TokenNameCOMMA	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
||	TokenNameOR_OR	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
lb	TokenNameIdentifier	 lb
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
rb	TokenNameIdentifier	 rb
=	TokenNameEQUAL	
new	TokenNamenew	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
(	TokenNameLPAREN	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Pair	TokenNameIdentifier	 Pair
.	TokenNameDOT	
create	TokenNameIdentifier	 create
(	TokenNameLPAREN	
lb	TokenNameIdentifier	 lb
,	TokenNameCOMMA	
rb	TokenNameIdentifier	 rb
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
unwrap	TokenNameIdentifier	 unwrap
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ExcludingBounds objects never wrap 	TokenNameCOMMENT_LINE	ExcludingBounds objects never wrap 
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
<	TokenNameLESS	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
singletonList	TokenNameIdentifier	 singleton List
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
instanceof	TokenNameinstanceof	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
rhs	TokenNameIdentifier	 rhs
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
)	TokenNameRPAREN	
o	TokenNameIdentifier	 o
;	TokenNameSEMICOLON	
return	TokenNamereturn	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rhs	TokenNameIdentifier	 rhs
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"("	TokenNameStringLiteral	(
+	TokenNamePLUS	
left	TokenNameIdentifier	 left
+	TokenNamePLUS	
","	TokenNameStringLiteral	,
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getOpeningString	TokenNameIdentifier	 get Opening String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"("	TokenNameStringLiteral	(
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getClosingString	TokenNameIdentifier	 get Closing String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compute a bounds of keys corresponding to a given bounds of token. */	TokenNameCOMMENT_JAVADOC	 Compute a bounds of keys corresponding to a given bounds of token. 
private	TokenNameprivate	
static	TokenNamestatic	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
makeRowBounds	TokenNameIdentifier	 make Row Bounds
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
maxKeyBound	TokenNameIdentifier	 max Key Bound
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
minKeyBound	TokenNameIdentifier	 min Key Bound
(	TokenNameLPAREN	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
toRowBounds	TokenNameIdentifier	 to Row Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
?	TokenNameQUESTION	
makeRowBounds	TokenNameIdentifier	 make Row Bounds
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
toTokenBounds	TokenNameIdentifier	 to Token Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
?	TokenNameQUESTION	
new	TokenNamenew	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
:	TokenNameCOLON	
(	TokenNameLPAREN	
ExcludingBounds	TokenNameIdentifier	 Excluding Bounds
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
)	TokenNameRPAREN	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
