/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
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
Comparator	TokenNameIdentifier	 Comparator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
IPartitioner	TokenNameIdentifier	 I Partitioner
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
dht	TokenNameIdentifier	 dht
.	TokenNameDOT	
Token	TokenNameIdentifier	 Token
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
/** * Represents a decorated key, handy for certain operations * where just working with strings gets slow. * * We do a lot of sorting of DecoratedKeys, so for speed, we assume that tokens correspond one-to-one with keys. * This is not quite correct in the case of RandomPartitioner (which uses MD5 to hash keys to tokens); * if this matters, you can subclass RP to use a stronger hash, or use a non-lossy tokenization scheme (as in the * OrderPreservingPartitioner classes). */	TokenNameCOMMENT_JAVADOC	 Represents a decorated key, handy for certain operations where just working with strings gets slow. * We do a lot of sorting of DecoratedKeys, so for speed, we assume that tokens correspond one-to-one with keys. This is not quite correct in the case of RandomPartitioner (which uses MD5 to hash keys to tokens); if this matters, you can subclass RP to use a stronger hash, or use a non-lossy tokenization scheme (as in the OrderPreservingPartitioner classes). 
public	TokenNamepublic	
class	TokenNameclass	
DecoratedKey	TokenNameIdentifier	 Decorated Key
extends	TokenNameextends	
RowPosition	TokenNameIdentifier	 Row Position
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
comparator	TokenNameIdentifier	 comparator
=	TokenNameEQUAL	
new	TokenNamenew	
Comparator	TokenNameIdentifier	 Comparator
<	TokenNameLESS	
DecoratedKey	TokenNameIdentifier	 Decorated Key
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
int	TokenNameint	
compare	TokenNameIdentifier	 compare
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
o1	TokenNameIdentifier	 o1
,	TokenNameCOMMA	
DecoratedKey	TokenNameIdentifier	 Decorated Key
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
o1	TokenNameIdentifier	 o1
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
o2	TokenNameIdentifier	 o2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DecoratedKey	TokenNameIdentifier	 Decorated Key
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
token	TokenNameIdentifier	 token
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
key	TokenNameIdentifier	 key
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
int	TokenNameint	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// hash of key is enough 	TokenNameCOMMENT_LINE	hash of key is enough 
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
this	TokenNamethis	
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
DecoratedKey	TokenNameIdentifier	 Decorated Key
other	TokenNameIdentifier	 other
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
compareUnsigned	TokenNameIdentifier	 compare Unsigned
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
other	TokenNameIdentifier	 other
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// we compare faster than BB.equals for array backed BB 	TokenNameCOMMENT_LINE	we compare faster than BB.equals for array backed BB 
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
RowPosition	TokenNameIdentifier	 Row Position
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// delegate to Token.KeyBound if needed 	TokenNameCOMMENT_LINE	delegate to Token.KeyBound if needed 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
instanceof	TokenNameinstanceof	
DecoratedKey	TokenNameIdentifier	 Decorated Key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
-	TokenNameMINUS	
pos	TokenNameIdentifier	 pos
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DecoratedKey	TokenNameIdentifier	 Decorated Key
otherKey	TokenNameIdentifier	 other Key
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DecoratedKey	TokenNameIdentifier	 Decorated Key
)	TokenNameRPAREN	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
int	TokenNameint	
cmp	TokenNameIdentifier	 cmp
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
.	TokenNameDOT	
compareTo	TokenNameIdentifier	 compare To
(	TokenNameLPAREN	
otherKey	TokenNameIdentifier	 other Key
.	TokenNameDOT	
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
cmp	TokenNameIdentifier	 cmp
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
compareUnsigned	TokenNameIdentifier	 compare Unsigned
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
otherKey	TokenNameIdentifier	 other Key
.	TokenNameDOT	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
:	TokenNameCOLON	
cmp	TokenNameIdentifier	 cmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isMinimum	TokenNameIdentifier	 is Minimum
(	TokenNameLPAREN	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// A DecoratedKey can never be the minimum position on the ring 	TokenNameCOMMENT_LINE	A DecoratedKey can never be the minimum position on the ring 
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
RowPosition	TokenNameIdentifier	 Row Position
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
kind	TokenNameIdentifier	 kind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
RowPosition	TokenNameIdentifier	 Row Position
.	TokenNameDOT	
Kind	TokenNameIdentifier	 Kind
.	TokenNameDOT	
ROW_KEY	TokenNameIdentifier	 ROW  KEY
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
String	TokenNameIdentifier	 String
keystring	TokenNameIdentifier	 keystring
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
"null"	TokenNameStringLiteral	null
:	TokenNameCOLON	
ByteBufferUtil	TokenNameIdentifier	 Byte Buffer Util
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
"DecoratedKey("	TokenNameStringLiteral	DecoratedKey(
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
keystring	TokenNameIdentifier	 keystring
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Token	TokenNameIdentifier	 Token
getToken	TokenNameIdentifier	 get Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
