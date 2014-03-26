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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataInput	TokenNameIdentifier	 Data Input
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
DataOutput	TokenNameIdentifier	 Data Output
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
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
*	TokenNameMULTIPLY	
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
DecoratedKey	TokenNameIdentifier	 Decorated Key
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
TypeSizes	TokenNameIdentifier	 Type Sizes
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MessagingService	TokenNameIdentifier	 Messaging Service
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
abstract	TokenNameabstract	
class	TokenNameclass	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
T	TokenNameIdentifier	 T
extends	TokenNameextends	
RingPosition	TokenNameIdentifier	 Ring Position
>	TokenNameGREATER	
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
AbstractBoundsSerializer	TokenNameIdentifier	 Abstract Bounds Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
AbstractBoundsSerializer	TokenNameIdentifier	 Abstract Bounds Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
enum	TokenNameenum	
Type	TokenNameIdentifier	 Type
{	TokenNameLBRACE	
RANGE	TokenNameIdentifier	 RANGE
,	TokenNameCOMMA	
BOUNDS	TokenNameIdentifier	 BOUNDS
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
T	TokenNameIdentifier	 T
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
transient	TokenNametransient	
final	TokenNamefinal	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
public	TokenNamepublic	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
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
this	TokenNamethis	
.	TokenNameDOT	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
left	TokenNameIdentifier	 left
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given token T and AbstractBounds ?L,R?, returns Pair(?L,T], (T,R?), * where ? means that the same type of AbstractBounds is returned as the original. * * Put another way, returns a Pair of everything this AbstractBounds contains * up to and including the split position, and everything it contains after * (not including the split position). * * The original AbstractBounds must either contain the position T, or T * should be equals to the left bound L. * * If the split would only yield the same AbstractBound, null is returned * instead. */	TokenNameCOMMENT_JAVADOC	 Given token T and AbstractBounds ?L,R?, returns Pair(?L,T], (T,R?), where ? means that the same type of AbstractBounds is returned as the original. * Put another way, returns a Pair of everything this AbstractBounds contains up to and including the split position, and everything it contains after (not including the split position). * The original AbstractBounds must either contain the position T, or T should be equals to the left bound L. * If the split would only yield the same AbstractBound, null is returned instead. 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
31	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
left	TokenNameIdentifier	 left
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** return true if @param range intersects any of the given @param ranges */	TokenNameCOMMENT_JAVADOC	 return true if @param range intersects any of the given @param ranges 
public	TokenNamepublic	
boolean	TokenNameboolean	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>>	TokenNameRIGHT_SHIFT	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
range2	TokenNameIdentifier	 range2
:	TokenNameCOLON	
ranges	TokenNameIdentifier	 ranges
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
range2	TokenNameIdentifier	 range2
.	TokenNameDOT	
intersects	TokenNameIdentifier	 intersects
(	TokenNameLPAREN	
this	TokenNamethis	
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
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
keyValidator	TokenNameIdentifier	 key Validator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getOpeningString	TokenNameIdentifier	 get Opening String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
keyValidator	TokenNameIdentifier	 key Validator
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
keyValidator	TokenNameIdentifier	 key Validator
)	TokenNameRPAREN	
+	TokenNamePLUS	
getClosingString	TokenNameIdentifier	 get Closing String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
format	TokenNameIdentifier	 format
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
AbstractType	TokenNameIdentifier	 Abstract Type
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
keyValidator	TokenNameIdentifier	 key Validator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
instanceof	TokenNameinstanceof	
DecoratedKey	TokenNameIdentifier	 Decorated Key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
keyValidator	TokenNameIdentifier	 key Validator
.	TokenNameDOT	
getString	TokenNameIdentifier	 get String
(	TokenNameLPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getOpeningString	TokenNameIdentifier	 get Opening String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
abstract	TokenNameabstract	
String	TokenNameIdentifier	 String
getClosingString	TokenNameIdentifier	 get Closing String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Transform this abstract bounds to equivalent covering bounds of row positions. * If this abstract bounds was already an abstractBounds of row positions, this is a noop. */	TokenNameCOMMENT_JAVADOC	 Transform this abstract bounds to equivalent covering bounds of row positions. If this abstract bounds was already an abstractBounds of row positions, this is a noop. 
public	TokenNamepublic	
abstract	TokenNameabstract	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
RowPosition	TokenNameIdentifier	 Row Position
>	TokenNameGREATER	
toRowBounds	TokenNameIdentifier	 to Row Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Transform this abstract bounds to a token abstract bounds. * If this abstract bounds was already an abstractBounds of token, this is a noop, otherwise this use the row position tokens. */	TokenNameCOMMENT_JAVADOC	 Transform this abstract bounds to a token abstract bounds. If this abstract bounds was already an abstractBounds of token, this is a noop, otherwise this use the row position tokens. 
public	TokenNamepublic	
abstract	TokenNameabstract	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
toTokenBounds	TokenNameIdentifier	 to Token Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
AbstractBoundsSerializer	TokenNameIdentifier	 Abstract Bounds Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
?	TokenNameQUESTION	
>>	TokenNameRIGHT_SHIFT	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
out	TokenNameIdentifier	 out
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// Older version don't know how to handle abstract bounds of keys 	TokenNameCOMMENT_LINE	Older version don't know how to handle abstract bounds of keys 
// However, the serialization has been designed so that token bounds are serialized the same way that before 1.1 	TokenNameCOMMENT_LINE	However, the serialization has been designed so that token bounds are serialized the same way that before 1.1 
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
<	TokenNameLESS	
MessagingService	TokenNameIdentifier	 Messaging Service
.	TokenNameDOT	
VERSION_11	TokenNameIdentifier	 VERSION 11
)	TokenNameRPAREN	
range	TokenNameIdentifier	 range
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
toTokenBounds	TokenNameIdentifier	 to Token Bounds
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * The first int tells us if it's a range or bounds (depending on the value) _and_ if it's tokens or keys (depending on the * sign). We use negative kind for keys so as to preserve the serialization of token from older version. */	TokenNameCOMMENT_BLOCK	 The first int tells us if it's a range or bounds (depending on the value) _and_ if it's tokens or keys (depending on the sign). We use negative kind for keys so as to preserve the serialization of token from older version. 
out	TokenNameIdentifier	 out
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
kindInt	TokenNameIdentifier	 kind Int
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
RowPosition	TokenNameIdentifier	 Row Position
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RowPosition	TokenNameIdentifier	 Row Position
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
out	TokenNameIdentifier	 out
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
int	TokenNameint	
kindInt	TokenNameIdentifier	 kind Int
(	TokenNameLPAREN	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
ab	TokenNameIdentifier	 ab
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
ab	TokenNameIdentifier	 ab
instanceof	TokenNameinstanceof	
Range	TokenNameIdentifier	 Range
?	TokenNameQUESTION	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
RANGE	TokenNameIdentifier	 RANGE
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
BOUNDS	TokenNameIdentifier	 BOUNDS
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
)	TokenNameRPAREN	
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
kind	TokenNameIdentifier	 kind
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
in	TokenNameIdentifier	 in
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
in	TokenNameIdentifier	 in
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
isToken	TokenNameIdentifier	 is Token
=	TokenNameEQUAL	
kind	TokenNameIdentifier	 kind
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isToken	TokenNameIdentifier	 is Token
)	TokenNameRPAREN	
kind	TokenNameIdentifier	 kind
=	TokenNameEQUAL	
-	TokenNameMINUS	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
RingPosition	TokenNameIdentifier	 Ring Position
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
isToken	TokenNameIdentifier	 is Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
RowPosition	TokenNameIdentifier	 Row Position
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
RowPosition	TokenNameIdentifier	 Row Position
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
kind	TokenNameIdentifier	 kind
==	TokenNameEQUAL_EQUAL	
Type	TokenNameIdentifier	 Type
.	TokenNameDOT	
RANGE	TokenNameIdentifier	 RANGE
.	TokenNameDOT	
ordinal	TokenNameIdentifier	 ordinal
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Bounds	TokenNameIdentifier	 Bounds
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
AbstractBounds	TokenNameIdentifier	 Abstract Bounds
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
ab	TokenNameIdentifier	 ab
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
kindInt	TokenNameIdentifier	 kind Int
(	TokenNameLPAREN	
ab	TokenNameIdentifier	 ab
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
left	TokenNameIdentifier	 left
instanceof	TokenNameinstanceof	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
)	TokenNameRPAREN	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
RowPosition	TokenNameIdentifier	 Row Position
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
RowPosition	TokenNameIdentifier	 Row Position
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
)	TokenNameRPAREN	
ab	TokenNameIdentifier	 ab
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
