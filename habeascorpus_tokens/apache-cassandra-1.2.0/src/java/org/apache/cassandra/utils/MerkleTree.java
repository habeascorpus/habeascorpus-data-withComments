/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
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
com	TokenNameIdentifier	 com
.	TokenNameDOT	
google	TokenNameIdentifier	 google
.	TokenNameDOT	
common	TokenNameIdentifier	 common
.	TokenNameDOT	
collect	TokenNameIdentifier	 collect
.	TokenNameDOT	
PeekingIterator	TokenNameIdentifier	 Peeking Iterator
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
Range	TokenNameIdentifier	 Range
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
;	TokenNameSEMICOLON	
/** * A MerkleTree implemented as a binary tree. * * A MerkleTree is a full binary tree that represents a perfect binary tree of * depth 'hashdepth'. In a perfect binary tree, each leaf contains a * sequentially hashed range, and each inner node contains the binary hash of * its two children. In the MerkleTree, many ranges will not be split to the * full depth of the perfect binary tree: the leaves of this tree are Leaf objects, * which contain the computed values of the nodes that would be below them if * the tree were perfect. * * The hash values of the inner nodes of the MerkleTree are calculated lazily based * on their children when the hash of a range is requested with hash(range). * * Inputs passed to TreeRange.validate should be calculated using a very secure hash, * because all hashing internal to the tree is accomplished using XOR. * * If two MerkleTrees have the same hashdepth, they represent a perfect tree * of the same depth, and can always be compared, regardless of size or splits. */	TokenNameCOMMENT_JAVADOC	 A MerkleTree implemented as a binary tree. * A MerkleTree is a full binary tree that represents a perfect binary tree of depth 'hashdepth'. In a perfect binary tree, each leaf contains a sequentially hashed range, and each inner node contains the binary hash of its two children. In the MerkleTree, many ranges will not be split to the full depth of the perfect binary tree: the leaves of this tree are Leaf objects, which contain the computed values of the nodes that would be below them if the tree were perfect. * The hash values of the inner nodes of the MerkleTree are calculated lazily based on their children when the hash of a range is requested with hash(range). * Inputs passed to TreeRange.validate should be calculated using a very secure hash, because all hashing internal to the tree is accomplished using XOR. * If two MerkleTrees have the same hashdepth, they represent a perfect tree of the same depth, and can always be compared, regardless of size or splits. 
public	TokenNamepublic	
class	TokenNameclass	
MerkleTree	TokenNameIdentifier	 Merkle Tree
implements	TokenNameimplements	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
MerkleTreeSerializer	TokenNameIdentifier	 Merkle Tree Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
MerkleTreeSerializer	TokenNameIdentifier	 Merkle Tree Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
2L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
RECOMMENDED_DEPTH	TokenNameIdentifier	 RECOMMENDED  DEPTH
=	TokenNameEQUAL	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
CONSISTENT	TokenNameIdentifier	 CONSISTENT
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
PARTIALLY_INCONSISTENT	TokenNameIdentifier	 PARTIALLY  INCONSISTENT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
hashdepth	TokenNameIdentifier	 hashdepth
;	TokenNameSEMICOLON	
/** * The top level range that this MerkleTree covers. * In a perfect world, this should be final and *not* transient. However * this would break serialization with version &gte; 0.7 because it uses * java serialization. We are moreover always shipping the fullRange will * the request so we can add it back post-deserialization (as for the * partitioner). */	TokenNameCOMMENT_JAVADOC	 The top level range that this MerkleTree covers. In a perfect world, this should be final and *not* transient. However this would break serialization with version &gte; 0.7 because it uses java serialization. We are moreover always shipping the fullRange will the request so we can add it back post-deserialization (as for the partitioner). 
public	TokenNamepublic	
transient	TokenNametransient	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
fullRange	TokenNameIdentifier	 full Range
;	TokenNameSEMICOLON	
// TODO This is broken; Token serialization assumes system partitioner, so if this doesn't match all hell breaks loose 	TokenNameCOMMENT_LINE	TODO This is broken; Token serialization assumes system partitioner, so if this doesn't match all hell breaks loose 
private	TokenNameprivate	
transient	TokenNametransient	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
maxsize	TokenNameIdentifier	 maxsize
;	TokenNameSEMICOLON	
private	TokenNameprivate	
long	TokenNamelong	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashable	TokenNameIdentifier	 Hashable
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
MerkleTreeSerializer	TokenNameIdentifier	 Merkle Tree Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
MerkleTree	TokenNameIdentifier	 Merkle Tree
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
MerkleTree	TokenNameIdentifier	 Merkle Tree
mt	TokenNameIdentifier	 mt
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
hashdepth	TokenNameIdentifier	 hashdepth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
maxsize	TokenNameIdentifier	 maxsize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeLong	TokenNameIdentifier	 write Long
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
MerkleTree	TokenNameIdentifier	 Merkle Tree
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
hashdepth	TokenNameIdentifier	 hashdepth
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
maxsize	TokenNameIdentifier	 maxsize
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
long	TokenNamelong	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readLong	TokenNameIdentifier	 read Long
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
MerkleTree	TokenNameIdentifier	 Merkle Tree
mt	TokenNameIdentifier	 mt
=	TokenNameEQUAL	
new	TokenNamenew	
MerkleTree	TokenNameIdentifier	 Merkle Tree
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
hashdepth	TokenNameIdentifier	 hashdepth
,	TokenNameCOMMA	
maxsize	TokenNameIdentifier	 maxsize
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
mt	TokenNameIdentifier	 mt
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
MerkleTree	TokenNameIdentifier	 Merkle Tree
mt	TokenNameIdentifier	 mt
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
// mt.hashdepth 	TokenNameCOMMENT_LINE	mt.hashdepth 
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
maxsize	TokenNameIdentifier	 maxsize
)	TokenNameRPAREN	
+	TokenNamePLUS	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
+	TokenNamePLUS	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
mt	TokenNameIdentifier	 mt
.	TokenNameDOT	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @param partitioner The partitioner in use. * @param range the range this tree covers * @param hashdepth The maximum depth of the tree. 100/(2^depth) is the % * of the key space covered by each subrange of a fully populated tree. * @param maxsize The maximum number of subranges in the tree. */	TokenNameCOMMENT_JAVADOC	 @param partitioner The partitioner in use. @param range the range this tree covers @param hashdepth The maximum depth of the tree. 100/(2^depth) is the % of the key space covered by each subrange of a fully populated tree. @param maxsize The maximum number of subranges in the tree. 
public	TokenNamepublic	
MerkleTree	TokenNameIdentifier	 Merkle Tree
(	TokenNameLPAREN	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
,	TokenNameCOMMA	
byte	TokenNamebyte	
hashdepth	TokenNameIdentifier	 hashdepth
,	TokenNameCOMMA	
long	TokenNamelong	
maxsize	TokenNameIdentifier	 maxsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
hashdepth	TokenNameIdentifier	 hashdepth
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
=	TokenNameEQUAL	
range	TokenNameIdentifier	 range
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hashdepth	TokenNameIdentifier	 hashdepth
=	TokenNameEQUAL	
hashdepth	TokenNameIdentifier	 hashdepth
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
maxsize	TokenNameIdentifier	 maxsize
=	TokenNameEQUAL	
maxsize	TokenNameIdentifier	 maxsize
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
new	TokenNamenew	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
static	TokenNamestatic	
byte	TokenNamebyte	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
byte	TokenNamebyte	
in	TokenNameIdentifier	 in
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
in	TokenNameIdentifier	 in
<	TokenNameLESS	
Byte	TokenNameIdentifier	 Byte
.	TokenNameDOT	
MAX_VALUE	TokenNameIdentifier	 MAX  VALUE
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
in	TokenNameIdentifier	 in
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initializes this tree by splitting it until hashdepth is reached, * or until an additional level of splits would violate maxsize. * * NB: Replaces all nodes in the tree. */	TokenNameCOMMENT_JAVADOC	 Initializes this tree by splitting it until hashdepth is reached, or until an additional level of splits would violate maxsize. * NB: Replaces all nodes in the tree. 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// determine the depth to which we can safely split the tree 	TokenNameCOMMENT_LINE	determine the depth to which we can safely split the tree 
byte	TokenNamebyte	
sizedepth	TokenNameIdentifier	 sizedepth
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log10	TokenNameIdentifier	 log10
(	TokenNameLPAREN	
maxsize	TokenNameIdentifier	 maxsize
)	TokenNameRPAREN	
/	TokenNameDIVIDE	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
log10	TokenNameIdentifier	 log10
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
min	TokenNameIdentifier	 min
(	TokenNameLPAREN	
sizedepth	TokenNameIdentifier	 sizedepth
,	TokenNameCOMMA	
hashdepth	TokenNameIdentifier	 hashdepth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
initHelper	TokenNameIdentifier	 init Helper
(	TokenNameLPAREN	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
(	TokenNameLPAREN	
long	TokenNamelong	
)	TokenNameRPAREN	
Math	TokenNameIdentifier	 Math
.	TokenNameDOT	
pow	TokenNameIdentifier	 pow
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Hashable	TokenNameIdentifier	 Hashable
initHelper	TokenNameIdentifier	 init Helper
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
byte	TokenNamebyte	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
byte	TokenNamebyte	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
==	TokenNameEQUAL_EQUAL	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
// we've reached the leaves 	TokenNameCOMMENT_LINE	we've reached the leaves 
return	TokenNamereturn	
new	TokenNamenew	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
midpoint	TokenNameIdentifier	 midpoint
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
midpoint	TokenNameIdentifier	 midpoint
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
||	TokenNameOR_OR	
midpoint	TokenNameIdentifier	 midpoint
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
new	TokenNamenew	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashable	TokenNameIdentifier	 Hashable
lchild	TokenNameIdentifier	 lchild
=	TokenNameEQUAL	
initHelper	TokenNameIdentifier	 init Helper
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
midpoint	TokenNameIdentifier	 midpoint
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashable	TokenNameIdentifier	 Hashable
rchild	TokenNameIdentifier	 rchild
=	TokenNameEQUAL	
initHelper	TokenNameIdentifier	 init Helper
(	TokenNameLPAREN	
midpoint	TokenNameIdentifier	 midpoint
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
max	TokenNameIdentifier	 max
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Inner	TokenNameIdentifier	 Inner
(	TokenNameLPAREN	
midpoint	TokenNameIdentifier	 midpoint
,	TokenNameCOMMA	
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
rchild	TokenNameIdentifier	 rchild
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Hashable	TokenNameIdentifier	 Hashable
root	TokenNameIdentifier	 root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of distinct ranges contained in this tree. This is a reasonable * measure of the memory usage of the tree (assuming 'this.order' is significant). */	TokenNameCOMMENT_JAVADOC	 The number of distinct ranges contained in this tree. This is a reasonable measure of the memory usage of the tree (assuming 'this.order' is significant). 
public	TokenNamepublic	
long	TokenNamelong	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
maxsize	TokenNameIdentifier	 maxsize
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
maxsize	TokenNameIdentifier	 maxsize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
maxsize	TokenNameIdentifier	 maxsize
(	TokenNameLPAREN	
long	TokenNamelong	
maxsize	TokenNameIdentifier	 maxsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
maxsize	TokenNameIdentifier	 maxsize
=	TokenNameEQUAL	
maxsize	TokenNameIdentifier	 maxsize
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TODO: Find another way to use the local partitioner after serialization. */	TokenNameCOMMENT_JAVADOC	 TODO: Find another way to use the local partitioner after serialization. 
public	TokenNamepublic	
void	TokenNamevoid	
partitioner	TokenNameIdentifier	 partitioner
(	TokenNameLPAREN	
IPartitioner	TokenNameIdentifier	 I Partitioner
partitioner	TokenNameIdentifier	 partitioner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param ltree First tree. * @param rtree Second tree. * @return A list of the largest contiguous ranges where the given trees disagree. */	TokenNameCOMMENT_JAVADOC	 @param ltree First tree. @param rtree Second tree. @return A list of the largest contiguous ranges where the given trees disagree. 
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
difference	TokenNameIdentifier	 difference
(	TokenNameLPAREN	
MerkleTree	TokenNameIdentifier	 Merkle Tree
ltree	TokenNameIdentifier	 ltree
,	TokenNameCOMMA	
MerkleTree	TokenNameIdentifier	 Merkle Tree
rtree	TokenNameIdentifier	 rtree
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
ltree	TokenNameIdentifier	 ltree
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rtree	TokenNameIdentifier	 rtree
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
"Difference only make sense on tree covering the same range (but "	TokenNameStringLiteral	Difference only make sense on tree covering the same range (but 
+	TokenNamePLUS	
ltree	TokenNameIdentifier	 ltree
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
+	TokenNamePLUS	
" != "	TokenNameStringLiteral	 != 
+	TokenNamePLUS	
rtree	TokenNameIdentifier	 rtree
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
+	TokenNamePLUS	
")"	TokenNameStringLiteral	)
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
diff	TokenNameIdentifier	 diff
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TreeRange	TokenNameIdentifier	 Tree Range
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
new	TokenNamenew	
TreeRange	TokenNameIdentifier	 Tree Range
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
ltree	TokenNameIdentifier	 ltree
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
ltree	TokenNameIdentifier	 ltree
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lhash	TokenNameIdentifier	 lhash
=	TokenNameEQUAL	
ltree	TokenNameIdentifier	 ltree
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rhash	TokenNameIdentifier	 rhash
=	TokenNameEQUAL	
rtree	TokenNameIdentifier	 rtree
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lhash	TokenNameIdentifier	 lhash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhash	TokenNameIdentifier	 rhash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lhash	TokenNameIdentifier	 lhash
,	TokenNameCOMMA	
rhash	TokenNameIdentifier	 rhash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
==	TokenNameEQUAL_EQUAL	
differenceHelper	TokenNameIdentifier	 difference Helper
(	TokenNameLPAREN	
ltree	TokenNameIdentifier	 ltree
,	TokenNameCOMMA	
rtree	TokenNameIdentifier	 rtree
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
lhash	TokenNameIdentifier	 lhash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
rhash	TokenNameIdentifier	 rhash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
diff	TokenNameIdentifier	 diff
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * TODO: This function could be optimized into a depth first traversal of * the two trees in parallel. * * Takes two trees and a range for which they have hashes, but are inconsistent. * @return FULLY_INCONSISTENT if active is inconsistent, PARTIALLY_INCONSISTENT if only a subrange is inconsistent. */	TokenNameCOMMENT_JAVADOC	 TODO: This function could be optimized into a depth first traversal of the two trees in parallel. * Takes two trees and a range for which they have hashes, but are inconsistent. @return FULLY_INCONSISTENT if active is inconsistent, PARTIALLY_INCONSISTENT if only a subrange is inconsistent. 
static	TokenNamestatic	
int	TokenNameint	
differenceHelper	TokenNameIdentifier	 difference Helper
(	TokenNameLPAREN	
MerkleTree	TokenNameIdentifier	 Merkle Tree
ltree	TokenNameIdentifier	 ltree
,	TokenNameCOMMA	
MerkleTree	TokenNameIdentifier	 Merkle Tree
rtree	TokenNameIdentifier	 rtree
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
diff	TokenNameIdentifier	 diff
,	TokenNameCOMMA	
TreeRange	TokenNameIdentifier	 Tree Range
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
midpoint	TokenNameIdentifier	 midpoint
=	TokenNameEQUAL	
ltree	TokenNameIdentifier	 ltree
.	TokenNameDOT	
partitioner	TokenNameIdentifier	 partitioner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TreeRange	TokenNameIdentifier	 Tree Range
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
new	TokenNamenew	
TreeRange	TokenNameIdentifier	 Tree Range
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
midpoint	TokenNameIdentifier	 midpoint
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TreeRange	TokenNameIdentifier	 Tree Range
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
new	TokenNamenew	
TreeRange	TokenNameIdentifier	 Tree Range
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
midpoint	TokenNameIdentifier	 midpoint
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lhash	TokenNameIdentifier	 lhash
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rhash	TokenNameIdentifier	 rhash
;	TokenNameSEMICOLON	
// see if we should recurse left 	TokenNameCOMMENT_LINE	see if we should recurse left 
lhash	TokenNameIdentifier	 lhash
=	TokenNameEQUAL	
ltree	TokenNameIdentifier	 ltree
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhash	TokenNameIdentifier	 rhash
=	TokenNameEQUAL	
rtree	TokenNameIdentifier	 rtree
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
ldiff	TokenNameIdentifier	 ldiff
=	TokenNameEQUAL	
CONSISTENT	TokenNameIdentifier	 CONSISTENT
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
lreso	TokenNameIdentifier	 lreso
=	TokenNameEQUAL	
lhash	TokenNameIdentifier	 lhash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhash	TokenNameIdentifier	 rhash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
lreso	TokenNameIdentifier	 lreso
&&	TokenNameAND_AND	
!	TokenNameNOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lhash	TokenNameIdentifier	 lhash
,	TokenNameCOMMA	
rhash	TokenNameIdentifier	 rhash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
ldiff	TokenNameIdentifier	 ldiff
=	TokenNameEQUAL	
differenceHelper	TokenNameIdentifier	 difference Helper
(	TokenNameLPAREN	
ltree	TokenNameIdentifier	 ltree
,	TokenNameCOMMA	
rtree	TokenNameIdentifier	 rtree
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
,	TokenNameCOMMA	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
lreso	TokenNameIdentifier	 lreso
)	TokenNameRPAREN	
ldiff	TokenNameIdentifier	 ldiff
=	TokenNameEQUAL	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
;	TokenNameSEMICOLON	
// see if we should recurse right 	TokenNameCOMMENT_LINE	see if we should recurse right 
lhash	TokenNameIdentifier	 lhash
=	TokenNameEQUAL	
ltree	TokenNameIdentifier	 ltree
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rhash	TokenNameIdentifier	 rhash
=	TokenNameEQUAL	
rtree	TokenNameIdentifier	 rtree
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
rdiff	TokenNameIdentifier	 rdiff
=	TokenNameEQUAL	
CONSISTENT	TokenNameIdentifier	 CONSISTENT
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
rreso	TokenNameIdentifier	 rreso
=	TokenNameEQUAL	
lhash	TokenNameIdentifier	 lhash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
rhash	TokenNameIdentifier	 rhash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rreso	TokenNameIdentifier	 rreso
&&	TokenNameAND_AND	
!	TokenNameNOT	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
lhash	TokenNameIdentifier	 lhash
,	TokenNameCOMMA	
rhash	TokenNameIdentifier	 rhash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
rdiff	TokenNameIdentifier	 rdiff
=	TokenNameEQUAL	
differenceHelper	TokenNameIdentifier	 difference Helper
(	TokenNameLPAREN	
ltree	TokenNameIdentifier	 ltree
,	TokenNameCOMMA	
rtree	TokenNameIdentifier	 rtree
,	TokenNameCOMMA	
diff	TokenNameIdentifier	 diff
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
rreso	TokenNameIdentifier	 rreso
)	TokenNameRPAREN	
rdiff	TokenNameIdentifier	 rdiff
=	TokenNameEQUAL	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ldiff	TokenNameIdentifier	 ldiff
==	TokenNameEQUAL_EQUAL	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
&&	TokenNameAND_AND	
rdiff	TokenNameIdentifier	 rdiff
==	TokenNameEQUAL_EQUAL	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// both children are fully inconsistent 	TokenNameCOMMENT_LINE	both children are fully inconsistent 
return	TokenNamereturn	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
ldiff	TokenNameIdentifier	 ldiff
==	TokenNameEQUAL_EQUAL	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
PARTIALLY_INCONSISTENT	TokenNameIdentifier	 PARTIALLY  INCONSISTENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rdiff	TokenNameIdentifier	 rdiff
==	TokenNameEQUAL_EQUAL	
FULLY_INCONSISTENT	TokenNameIdentifier	 FULLY  INCONSISTENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
diff	TokenNameIdentifier	 diff
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
PARTIALLY_INCONSISTENT	TokenNameIdentifier	 PARTIALLY  INCONSISTENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
PARTIALLY_INCONSISTENT	TokenNameIdentifier	 PARTIALLY  INCONSISTENT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For testing purposes. * Gets the smallest range containing the token. */	TokenNameCOMMENT_JAVADOC	 For testing purposes. Gets the smallest range containing the token. 
public	TokenNamepublic	
TreeRange	TokenNameIdentifier	 Tree Range
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
TreeRange	TokenNameIdentifier	 Tree Range
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
hashable	TokenNameIdentifier	 hashable
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
pright	TokenNameIdentifier	 pright
,	TokenNameCOMMA	
byte	TokenNamebyte	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hashable	TokenNameIdentifier	 hashable
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we've reached a hash: wrap it up and deliver it 	TokenNameCOMMENT_LINE	we've reached a hash: wrap it up and deliver it 
return	TokenNamereturn	
new	TokenNamenew	
TreeRange	TokenNameIdentifier	 Tree Range
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
pright	TokenNameIdentifier	 pright
,	TokenNameCOMMA	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
hashable	TokenNameIdentifier	 hashable
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else: node. 	TokenNameCOMMENT_LINE	else: node. 
Inner	TokenNameIdentifier	 Inner
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
hashable	TokenNameIdentifier	 hashable
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// left child contains token 	TokenNameCOMMENT_LINE	left child contains token 
return	TokenNamereturn	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// else: right child contains token 	TokenNameCOMMENT_LINE	else: right child contains token 
return	TokenNamereturn	
getHelper	TokenNameIdentifier	 get Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
pright	TokenNameIdentifier	 pright
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Invalidates the ranges containing the given token. * Useful for testing. */	TokenNameCOMMENT_JAVADOC	 Invalidates the ranges containing the given token. Useful for testing. 
public	TokenNamepublic	
void	TokenNamevoid	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
invalidateHelper	TokenNameIdentifier	 invalidate Helper
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
invalidateHelper	TokenNameIdentifier	 invalidate Helper
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
hashable	TokenNameIdentifier	 hashable
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hashable	TokenNameIdentifier	 hashable
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hashable	TokenNameIdentifier	 hashable
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
// else: node. 	TokenNameCOMMENT_LINE	else: node. 
Inner	TokenNameIdentifier	 Inner
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
hashable	TokenNameIdentifier	 hashable
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// left child contains token 	TokenNameCOMMENT_LINE	left child contains token 
invalidateHelper	TokenNameIdentifier	 invalidate Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
// right child contains token 	TokenNameCOMMENT_LINE	right child contains token 
invalidateHelper	TokenNameIdentifier	 invalidate Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Hash the given range in the tree. The range must have been generated * with recursive applications of partitioner.midpoint(). * * NB: Currently does not support wrapping ranges that do not end with * partitioner.getMinimumToken(). * * @return Null if any subrange of the range is invalid, or if the exact * range cannot be calculated using this tree. */	TokenNameCOMMENT_JAVADOC	 Hash the given range in the tree. The range must have been generated with recursive applications of partitioner.midpoint(). * NB: Currently does not support wrapping ranges that do not end with partitioner.getMinimumToken(). * @return Null if any subrange of the range is invalid, or if the exact range cannot be calculated using this tree. 
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
return	TokenNamereturn	
hashHelper	TokenNameIdentifier	 hash Helper
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StopRecursion	TokenNameIdentifier	 Stop Recursion
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @throws StopRecursion If no match could be found for the range. */	TokenNameCOMMENT_JAVADOC	 @throws StopRecursion If no match could be found for the range. 
private	TokenNameprivate	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hashHelper	TokenNameIdentifier	 hash Helper
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
hashable	TokenNameIdentifier	 hashable
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
active	TokenNameIdentifier	 active
,	TokenNameCOMMA	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
throws	TokenNamethrows	
StopRecursion	TokenNameIdentifier	 Stop Recursion
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hashable	TokenNameIdentifier	 hashable
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// we are not fully contained in this range! 	TokenNameCOMMENT_LINE	we are not fully contained in this range! 
throw	TokenNamethrow	
new	TokenNamenew	
StopRecursion	TokenNameIdentifier	 Stop Recursion
.	TokenNameDOT	
BadRange	TokenNameIdentifier	 Bad Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
hashable	TokenNameIdentifier	 hashable
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else: node. 	TokenNameCOMMENT_LINE	else: node. 
Inner	TokenNameIdentifier	 Inner
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
hashable	TokenNameIdentifier	 hashable
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
leftactive	TokenNameIdentifier	 leftactive
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
rightactive	TokenNameIdentifier	 rightactive
=	TokenNameEQUAL	
new	TokenNamenew	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this node is fully contained in the range 	TokenNameCOMMENT_LINE	this node is fully contained in the range 
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
// we had a cached value 	TokenNameCOMMENT_LINE	we had a cached value 
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// continue recursing to hash our children 	TokenNameCOMMENT_LINE	continue recursing to hash our children 
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lhash	TokenNameIdentifier	 lhash
=	TokenNameEQUAL	
hashHelper	TokenNameIdentifier	 hash Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
leftactive	TokenNameIdentifier	 leftactive
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
rhash	TokenNameIdentifier	 rhash
=	TokenNameEQUAL	
hashHelper	TokenNameIdentifier	 hash Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rightactive	TokenNameIdentifier	 rightactive
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// cache the computed value (even if it is null) 	TokenNameCOMMENT_LINE	cache the computed value (even if it is null) 
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
lhash	TokenNameIdentifier	 lhash
,	TokenNameCOMMA	
rhash	TokenNameIdentifier	 rhash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else: one of our children contains the range 	TokenNameCOMMENT_LINE	else: one of our children contains the range 
if	TokenNameif	
(	TokenNameLPAREN	
leftactive	TokenNameIdentifier	 leftactive
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// left child contains/matches the range 	TokenNameCOMMENT_LINE	left child contains/matches the range 
return	TokenNamereturn	
hashHelper	TokenNameIdentifier	 hash Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
leftactive	TokenNameIdentifier	 leftactive
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
rightactive	TokenNameIdentifier	 rightactive
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// right child contains/matches the range 	TokenNameCOMMENT_LINE	right child contains/matches the range 
return	TokenNamereturn	
hashHelper	TokenNameIdentifier	 hash Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
,	TokenNameCOMMA	
rightactive	TokenNameIdentifier	 rightactive
,	TokenNameCOMMA	
range	TokenNameIdentifier	 range
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
StopRecursion	TokenNameIdentifier	 Stop Recursion
.	TokenNameDOT	
BadRange	TokenNameIdentifier	 Bad Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Splits the range containing the given token, if no tree limits would be * violated. If the range would be split to a depth below hashdepth, or if * the tree already contains maxsize subranges, this operation will fail. * * @return True if the range was successfully split. */	TokenNameCOMMENT_JAVADOC	 Splits the range containing the given token, if no tree limits would be violated. If the range would be split to a depth below hashdepth, or if the tree already contains maxsize subranges, this operation will fail. * @return True if the range was successfully split. 
public	TokenNamepublic	
boolean	TokenNameboolean	
split	TokenNameIdentifier	 split
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<	TokenNameLESS	
maxsize	TokenNameIdentifier	 maxsize
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
splitHelper	TokenNameIdentifier	 split Helper
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
StopRecursion	TokenNameIdentifier	 Stop Recursion
.	TokenNameDOT	
TooDeep	TokenNameIdentifier	 Too Deep
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Hashable	TokenNameIdentifier	 Hashable
splitHelper	TokenNameIdentifier	 split Helper
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
hashable	TokenNameIdentifier	 hashable
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
pright	TokenNameIdentifier	 pright
,	TokenNameCOMMA	
byte	TokenNamebyte	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
throws	TokenNamethrows	
StopRecursion	TokenNameIdentifier	 Stop Recursion
.	TokenNameDOT	
TooDeep	TokenNameIdentifier	 Too Deep
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
>=	TokenNameGREATER_EQUAL	
hashdepth	TokenNameIdentifier	 hashdepth
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
StopRecursion	TokenNameIdentifier	 Stop Recursion
.	TokenNameDOT	
TooDeep	TokenNameIdentifier	 Too Deep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hashable	TokenNameIdentifier	 hashable
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Token	TokenNameIdentifier	 Token
midpoint	TokenNameIdentifier	 midpoint
=	TokenNameEQUAL	
partitioner	TokenNameIdentifier	 partitioner
.	TokenNameDOT	
midpoint	TokenNameIdentifier	 midpoint
(	TokenNameLPAREN	
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
pright	TokenNameIdentifier	 pright
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// We should not create a non-sensical range where start and end are the same token (this is non-sensical because range are 	TokenNameCOMMENT_LINE	We should not create a non-sensical range where start and end are the same token (this is non-sensical because range are 
// start exclusive). Note that we shouldn't hit that unless the full range is very small or we are fairly deep 	TokenNameCOMMENT_LINE	start exclusive). Note that we shouldn't hit that unless the full range is very small or we are fairly deep 
if	TokenNameif	
(	TokenNameLPAREN	
midpoint	TokenNameIdentifier	 midpoint
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pleft	TokenNameIdentifier	 pleft
)	TokenNameRPAREN	
||	TokenNameOR_OR	
midpoint	TokenNameIdentifier	 midpoint
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
pright	TokenNameIdentifier	 pright
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
StopRecursion	TokenNameIdentifier	 Stop Recursion
.	TokenNameDOT	
TooDeep	TokenNameIdentifier	 Too Deep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// split 	TokenNameCOMMENT_LINE	split 
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Inner	TokenNameIdentifier	 Inner
(	TokenNameLPAREN	
midpoint	TokenNameIdentifier	 midpoint
,	TokenNameCOMMA	
new	TokenNamenew	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// else: node. 	TokenNameCOMMENT_LINE	else: node. 
// recurse on the matching child 	TokenNameCOMMENT_LINE	recurse on the matching child 
Inner	TokenNameIdentifier	 Inner
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
hashable	TokenNameIdentifier	 hashable
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Range	TokenNameIdentifier	 Range
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// left child contains token 	TokenNameCOMMENT_LINE	left child contains token 
node	TokenNameIdentifier	 node
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
(	TokenNameLPAREN	
splitHelper	TokenNameIdentifier	 split Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
pleft	TokenNameIdentifier	 pleft
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
// else: right child contains token 	TokenNameCOMMENT_LINE	else: right child contains token 
node	TokenNameIdentifier	 node
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
(	TokenNameLPAREN	
splitHelper	TokenNameIdentifier	 split Helper
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
pright	TokenNameIdentifier	 pright
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
t	TokenNameIdentifier	 t
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
node	TokenNameIdentifier	 node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a lazy iterator of invalid TreeRanges that need to be filled * in order to make the given Range valid. */	TokenNameCOMMENT_JAVADOC	 Returns a lazy iterator of invalid TreeRanges that need to be filled in order to make the given Range valid. 
public	TokenNamepublic	
TreeRangeIterator	TokenNameIdentifier	 Tree Range Iterator
invalids	TokenNameIdentifier	 invalids
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
TreeRangeIterator	TokenNameIdentifier	 Tree Range Iterator
(	TokenNameLPAREN	
this	TokenNamethis	
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
StringBuilder	TokenNameIdentifier	 String Builder
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"#<MerkleTree root="	TokenNameStringLiteral	#<MerkleTree root=
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
8	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The public interface to a range in the tree. * * NB: A TreeRange should not be returned by a public method unless the * parents of the range it represents are already invalidated, since it * will allow someone to modify the hash. Alternatively, a TreeRange * may be created with a null tree, indicating that it is read only. */	TokenNameCOMMENT_JAVADOC	 The public interface to a range in the tree. * NB: A TreeRange should not be returned by a public method unless the parents of the range it represents are already invalidated, since it will allow someone to modify the hash. Alternatively, a TreeRange may be created with a null tree, indicating that it is read only. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TreeRange	TokenNameIdentifier	 Tree Range
extends	TokenNameextends	
Range	TokenNameIdentifier	 Range
<	TokenNameLESS	
Token	TokenNameIdentifier	 Token
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
MerkleTree	TokenNameIdentifier	 Merkle Tree
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
Hashable	TokenNameIdentifier	 Hashable
hashable	TokenNameIdentifier	 hashable
;	TokenNameSEMICOLON	
TreeRange	TokenNameIdentifier	 Tree Range
(	TokenNameLPAREN	
MerkleTree	TokenNameIdentifier	 Merkle Tree
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
Token	TokenNameIdentifier	 Token
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
byte	TokenNamebyte	
depth	TokenNameIdentifier	 depth
,	TokenNameCOMMA	
Hashable	TokenNameIdentifier	 Hashable
hashable	TokenNameIdentifier	 hashable
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
=	TokenNameEQUAL	
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
=	TokenNameEQUAL	
depth	TokenNameIdentifier	 depth
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hashable	TokenNameIdentifier	 hashable
=	TokenNameEQUAL	
hashable	TokenNameIdentifier	 hashable
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
tree	TokenNameIdentifier	 tree
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"Not intended for modification!"	TokenNameStringLiteral	Not intended for modification!
;	TokenNameSEMICOLON	
hashable	TokenNameIdentifier	 hashable
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hashable	TokenNameIdentifier	 hashable
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @param entry Row to mix into the hash for this range. */	TokenNameCOMMENT_JAVADOC	 @param entry Row to mix into the hash for this range. 
public	TokenNamepublic	
void	TokenNamevoid	
addHash	TokenNameIdentifier	 add Hash
(	TokenNameLPAREN	
RowHash	TokenNameIdentifier	 Row Hash
entry	TokenNameIdentifier	 entry
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assert	TokenNameassert	
tree	TokenNameIdentifier	 tree
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
"Not intended for modification!"	TokenNameStringLiteral	Not intended for modification!
;	TokenNameSEMICOLON	
assert	TokenNameassert	
hashable	TokenNameIdentifier	 hashable
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
;	TokenNameSEMICOLON	
hashable	TokenNameIdentifier	 hashable
.	TokenNameDOT	
addHash	TokenNameIdentifier	 add Hash
(	TokenNameLPAREN	
entry	TokenNameIdentifier	 entry
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
RowHash	TokenNameIdentifier	 Row Hash
>	TokenNameGREATER	
entries	TokenNameIdentifier	 entries
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
addHash	TokenNameIdentifier	 add Hash
(	TokenNameLPAREN	
entries	TokenNameIdentifier	 entries
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
StringBuilder	TokenNameIdentifier	 String Builder
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
"#<TreeRange "	TokenNameStringLiteral	#<TreeRange 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
super	TokenNamesuper	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" depth="	TokenNameStringLiteral	 depth=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
">"	TokenNameStringLiteral	>
)	TokenNameRPAREN	
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Returns the leaf (range) of a given tree in increasing order. * If the full range covered by the tree don't wrap, then it will return the * ranges in increasing order. * If the full range wrap, the first *and* last range returned by the * iterator will be the wrapping range. It is the only case where the same * leaf will be returned twice. */	TokenNameCOMMENT_JAVADOC	 Returns the leaf (range) of a given tree in increasing order. If the full range covered by the tree don't wrap, then it will return the ranges in increasing order. If the full range wrap, the first *and* last range returned by the iterator will be the wrapping range. It is the only case where the same leaf will be returned twice. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
TreeRangeIterator	TokenNameIdentifier	 Tree Range Iterator
extends	TokenNameextends	
AbstractIterator	TokenNameIdentifier	 Abstract Iterator
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
implements	TokenNameimplements	
Iterable	TokenNameIdentifier	 Iterable
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
,	TokenNameCOMMA	
PeekingIterator	TokenNameIdentifier	 Peeking Iterator
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
{	TokenNameLBRACE	
// stack of ranges to visit 	TokenNameCOMMENT_LINE	stack of ranges to visit 
private	TokenNameprivate	
final	TokenNamefinal	
ArrayDeque	TokenNameIdentifier	 Array Deque
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
tovisit	TokenNameIdentifier	 tovisit
;	TokenNameSEMICOLON	
// interesting range 	TokenNameCOMMENT_LINE	interesting range 
private	TokenNameprivate	
final	TokenNamefinal	
MerkleTree	TokenNameIdentifier	 Merkle Tree
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
TreeRangeIterator	TokenNameIdentifier	 Tree Range Iterator
(	TokenNameLPAREN	
MerkleTree	TokenNameIdentifier	 Merkle Tree
tree	TokenNameIdentifier	 tree
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tovisit	TokenNameIdentifier	 tovisit
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayDeque	TokenNameIdentifier	 Array Deque
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
TreeRange	TokenNameIdentifier	 Tree Range
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
fullRange	TokenNameIdentifier	 full Range
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
(	TokenNameLPAREN	
byte	TokenNamebyte	
)	TokenNameRPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tree	TokenNameIdentifier	 tree
.	TokenNameDOT	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
tree	TokenNameIdentifier	 tree
=	TokenNameEQUAL	
tree	TokenNameIdentifier	 tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Find the next TreeRange. * * @return The next TreeRange. */	TokenNameCOMMENT_JAVADOC	 Find the next TreeRange. * @return The next TreeRange. 
public	TokenNamepublic	
TreeRange	TokenNameIdentifier	 Tree Range
computeNext	TokenNameIdentifier	 compute Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
!	TokenNameNOT	
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TreeRange	TokenNameIdentifier	 Tree Range
active	TokenNameIdentifier	 active
=	TokenNameEQUAL	
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
hashable	TokenNameIdentifier	 hashable
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// found a leaf invalid range 	TokenNameCOMMENT_LINE	found a leaf invalid range 
if	TokenNameif	
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
// put to be taken again last 	TokenNameCOMMENT_LINE	put to be taken again last 
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
addLast	TokenNameIdentifier	 add Last
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
active	TokenNameIdentifier	 active
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Inner	TokenNameIdentifier	 Inner
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
hashable	TokenNameIdentifier	 hashable
;	TokenNameSEMICOLON	
TreeRange	TokenNameIdentifier	 Tree Range
left	TokenNameIdentifier	 left
=	TokenNameEQUAL	
new	TokenNamenew	
TreeRange	TokenNameIdentifier	 Tree Range
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TreeRange	TokenNameIdentifier	 Tree Range
right	TokenNameIdentifier	 right
=	TokenNameEQUAL	
new	TokenNamenew	
TreeRange	TokenNameIdentifier	 Tree Range
(	TokenNameLPAREN	
tree	TokenNameIdentifier	 tree
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
inc	TokenNameIdentifier	 inc
(	TokenNameLPAREN	
active	TokenNameIdentifier	 active
.	TokenNameDOT	
depth	TokenNameIdentifier	 depth
)	TokenNameRPAREN	
,	TokenNameCOMMA	
node	TokenNameIdentifier	 node
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
.	TokenNameDOT	
isWrapAround	TokenNameIdentifier	 is Wrap Around
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// whatever is on the left is 'after' everything we have seen so far (it has greater tokens) 	TokenNameCOMMENT_LINE	whatever is on the left is 'after' everything we have seen so far (it has greater tokens) 
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
addLast	TokenNameIdentifier	 add Last
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
addFirst	TokenNameIdentifier	 add First
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// do left first then right 	TokenNameCOMMENT_LINE	do left first then right 
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
addFirst	TokenNameIdentifier	 add First
(	TokenNameLPAREN	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tovisit	TokenNameIdentifier	 tovisit
.	TokenNameDOT	
addFirst	TokenNameIdentifier	 add First
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
endOfData	TokenNameIdentifier	 end Of Data
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
TreeRange	TokenNameIdentifier	 Tree Range
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An inner node in the MerkleTree. Inners can contain cached hash values, which * are the binary hash of their two children. */	TokenNameCOMMENT_JAVADOC	 An inner node in the MerkleTree. Inners can contain cached hash values, which are the binary hash of their two children. 
static	TokenNamestatic	
class	TokenNameclass	
Inner	TokenNameIdentifier	 Inner
extends	TokenNameextends	
Hashable	TokenNameIdentifier	 Hashable
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
IDENT	TokenNameIdentifier	 IDENT
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashable	TokenNameIdentifier	 Hashable
lchild	TokenNameIdentifier	 lchild
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Hashable	TokenNameIdentifier	 Hashable
rchild	TokenNameIdentifier	 rchild
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
InnerSerializer	TokenNameIdentifier	 Inner Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
InnerSerializer	TokenNameIdentifier	 Inner Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructs an Inner with the given token and children, and a null hash. */	TokenNameCOMMENT_JAVADOC	 Constructs an Inner with the given token and children, and a null hash. 
public	TokenNamepublic	
Inner	TokenNameIdentifier	 Inner
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
Hashable	TokenNameIdentifier	 Hashable
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
Hashable	TokenNameIdentifier	 Hashable
rchild	TokenNameIdentifier	 rchild
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
=	TokenNameEQUAL	
lchild	TokenNameIdentifier	 lchild
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
=	TokenNameEQUAL	
rchild	TokenNameIdentifier	 rchild
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Hashable	TokenNameIdentifier	 Hashable
lchild	TokenNameIdentifier	 lchild
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lchild	TokenNameIdentifier	 lchild
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Hashable	TokenNameIdentifier	 Hashable
rchild	TokenNameIdentifier	 rchild
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rchild	TokenNameIdentifier	 rchild
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
lchild	TokenNameIdentifier	 lchild
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lchild	TokenNameIdentifier	 lchild
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
rchild	TokenNameIdentifier	 rchild
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rchild	TokenNameIdentifier	 rchild
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recursive toString. */	TokenNameCOMMENT_JAVADOC	 Recursive toString. 
public	TokenNamepublic	
void	TokenNamevoid	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
int	TokenNameint	
maxdepth	TokenNameIdentifier	 maxdepth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"#<"	TokenNameStringLiteral	#<
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSimpleName	TokenNameIdentifier	 get Simple Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" hash="	TokenNameStringLiteral	 hash=
)	TokenNameRPAREN	
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" children=["	TokenNameStringLiteral	 children=[
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
maxdepth	TokenNameIdentifier	 maxdepth
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"#"	TokenNameStringLiteral	#
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
lchild	TokenNameIdentifier	 lchild
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
lchild	TokenNameIdentifier	 lchild
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
maxdepth	TokenNameIdentifier	 maxdepth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rchild	TokenNameIdentifier	 rchild
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"null"	TokenNameStringLiteral	null
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
rchild	TokenNameIdentifier	 rchild
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
maxdepth	TokenNameIdentifier	 maxdepth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"]>"	TokenNameStringLiteral	]>
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
StringBuilder	TokenNameIdentifier	 String Builder
buff	TokenNameIdentifier	 buff
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
InnerSerializer	TokenNameIdentifier	 Inner Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
Inner	TokenNameIdentifier	 Inner
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
inner	TokenNameIdentifier	 inner
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Inner	TokenNameIdentifier	 Inner
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
hashLen	TokenNameIdentifier	 hash Len
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashLen	TokenNameIdentifier	 hash Len
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
hashLen	TokenNameIdentifier	 hash Len
]	TokenNameRBRACKET	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashable	TokenNameIdentifier	 Hashable
lchild	TokenNameIdentifier	 lchild
=	TokenNameEQUAL	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Hashable	TokenNameIdentifier	 Hashable
rchild	TokenNameIdentifier	 rchild
=	TokenNameEQUAL	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Inner	TokenNameIdentifier	 Inner
(	TokenNameLPAREN	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
rchild	TokenNameIdentifier	 rchild
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
inner	TokenNameIdentifier	 inner
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
+=	TokenNamePLUS_EQUAL	
Token	TokenNameIdentifier	 Token
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
)	TokenNameRPAREN	
+	TokenNamePLUS	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
lchild	TokenNameIdentifier	 lchild
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
+	TokenNamePLUS	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
inner	TokenNameIdentifier	 inner
.	TokenNameDOT	
rchild	TokenNameIdentifier	 rchild
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * A leaf node in the MerkleTree. Because the MerkleTree represents a much * larger perfect binary tree of depth hashdepth, a Leaf object contains * the value that would be contained in the perfect tree at its position. * * When rows are added to the MerkleTree using TreeRange.validate(), the * tree extending below the Leaf is generated in memory, but only the root * is stored in the Leaf. */	TokenNameCOMMENT_JAVADOC	 A leaf node in the MerkleTree. Because the MerkleTree represents a much larger perfect binary tree of depth hashdepth, a Leaf object contains the value that would be contained in the perfect tree at its position. * When rows are added to the MerkleTree using TreeRange.validate(), the tree extending below the Leaf is generated in memory, but only the root is stored in the Leaf. 
static	TokenNamestatic	
class	TokenNameclass	
Leaf	TokenNameIdentifier	 Leaf
extends	TokenNameextends	
Hashable	TokenNameIdentifier	 Hashable
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
static	TokenNamestatic	
final	TokenNamefinal	
byte	TokenNamebyte	
IDENT	TokenNameIdentifier	 IDENT
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
LeafSerializer	TokenNameIdentifier	 Leaf Serializer
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
LeafSerializer	TokenNameIdentifier	 Leaf Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Constructs a null hash. */	TokenNameCOMMENT_JAVADOC	 Constructs a null hash. 
public	TokenNamepublic	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lefthash	TokenNameIdentifier	 lefthash
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
righthash	TokenNameIdentifier	 righthash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
binaryHash	TokenNameIdentifier	 binary Hash
(	TokenNameLPAREN	
lefthash	TokenNameIdentifier	 lefthash
,	TokenNameCOMMA	
righthash	TokenNameIdentifier	 righthash
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
int	TokenNameint	
maxdepth	TokenNameIdentifier	 maxdepth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buff	TokenNameIdentifier	 buff
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
"#<Leaf "	TokenNameStringLiteral	#<Leaf 
+	TokenNamePLUS	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
LeafSerializer	TokenNameIdentifier	 Leaf Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
Leaf	TokenNameIdentifier	 Leaf
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Leaf	TokenNameIdentifier	 Leaf
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeInt	TokenNameIdentifier	 write Int
(	TokenNameLPAREN	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
write	TokenNameIdentifier	 write
(	TokenNameLPAREN	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Leaf	TokenNameIdentifier	 Leaf
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
int	TokenNameint	
hashLen	TokenNameIdentifier	 hash Len
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readInt	TokenNameIdentifier	 read Int
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hashLen	TokenNameIdentifier	 hash Len
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
new	TokenNamenew	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
hashLen	TokenNameIdentifier	 hash Len
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readFully	TokenNameIdentifier	 read Fully
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
Leaf	TokenNameIdentifier	 Leaf
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
Leaf	TokenNameIdentifier	 Leaf
leaf	TokenNameIdentifier	 leaf
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
:	TokenNameCOLON	
TypeSizes	TokenNameIdentifier	 Type Sizes
.	TokenNameDOT	
NATIVE	TokenNameIdentifier	 NATIVE
.	TokenNameDOT	
sizeof	TokenNameIdentifier	 sizeof
(	TokenNameLPAREN	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
+	TokenNamePLUS	
leaf	TokenNameIdentifier	 leaf
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Hash value representing a row, to be used to pass hashes to the MerkleTree. * The byte[] hash value should contain a digest of the key and value of the row * created using a very strong hash function. */	TokenNameCOMMENT_JAVADOC	 Hash value representing a row, to be used to pass hashes to the MerkleTree. The byte[] hash value should contain a digest of the key and value of the row created using a very strong hash function. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
RowHash	TokenNameIdentifier	 Row Hash
{	TokenNameLBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
public	TokenNamepublic	
RowHash	TokenNameIdentifier	 Row Hash
(	TokenNameLPAREN	
Token	TokenNameIdentifier	 Token
token	TokenNameIdentifier	 token
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
token	TokenNameIdentifier	 token
=	TokenNameEQUAL	
token	TokenNameIdentifier	 token
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
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
"#<RowHash "	TokenNameStringLiteral	#<RowHash 
+	TokenNamePLUS	
token	TokenNameIdentifier	 token
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
Hashable	TokenNameIdentifier	 Hashable
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
+	TokenNamePLUS	
">"	TokenNameStringLiteral	>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Abstract class containing hashing logic, and containing a single hash field. */	TokenNameCOMMENT_JAVADOC	 Abstract class containing hashing logic, and containing a single hash field. 
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
Hashable	TokenNameIdentifier	 Hashable
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
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
Hashable	TokenNameIdentifier	 Hashable
>	TokenNameGREATER	
serializer	TokenNameIdentifier	 serializer
=	TokenNameEQUAL	
new	TokenNamenew	
HashableSerializer	TokenNameIdentifier	 Hashable Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
Hashable	TokenNameIdentifier	 Hashable
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
void	TokenNamevoid	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
hash	TokenNameIdentifier	 hash
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the value of this hash to binaryHash of its children. * @param lefthash Hash of left child. * @param righthash Hash of right child. */	TokenNameCOMMENT_JAVADOC	 Sets the value of this hash to binaryHash of its children. @param lefthash Hash of left child. @param righthash Hash of right child. 
void	TokenNamevoid	
hash	TokenNameIdentifier	 hash
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lefthash	TokenNameIdentifier	 lefthash
,	TokenNameCOMMA	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
righthash	TokenNameIdentifier	 righthash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
binaryHash	TokenNameIdentifier	 binary Hash
(	TokenNameLPAREN	
lefthash	TokenNameIdentifier	 lefthash
,	TokenNameCOMMA	
righthash	TokenNameIdentifier	 righthash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Mixes the given value into our hash. If our hash is null, * our hash will become the given value. */	TokenNameCOMMENT_JAVADOC	 Mixes the given value into our hash. If our hash is null, our hash will become the given value. 
void	TokenNamevoid	
addHash	TokenNameIdentifier	 add Hash
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
righthash	TokenNameIdentifier	 righthash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
righthash	TokenNameIdentifier	 righthash
;	TokenNameSEMICOLON	
else	TokenNameelse	
hash	TokenNameIdentifier	 hash
=	TokenNameEQUAL	
binaryHash	TokenNameIdentifier	 binary Hash
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
,	TokenNameCOMMA	
righthash	TokenNameIdentifier	 righthash
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The primitive with which all hashing should be accomplished: hashes * a left and right value together. */	TokenNameCOMMENT_JAVADOC	 The primitive with which all hashing should be accomplished: hashes a left and right value together. 
static	TokenNamestatic	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
binaryHash	TokenNameIdentifier	 binary Hash
(	TokenNameLPAREN	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
final	TokenNamefinal	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
FBUtilities	TokenNameIdentifier	 FB Utilities
.	TokenNameDOT	
xor	TokenNameIdentifier	 xor
(	TokenNameLPAREN	
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
abstract	TokenNameabstract	
void	TokenNamevoid	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
StringBuilder	TokenNameIdentifier	 String Builder
buff	TokenNameIdentifier	 buff
,	TokenNameCOMMA	
int	TokenNameint	
maxdepth	TokenNameIdentifier	 maxdepth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
byte	TokenNamebyte	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
"null"	TokenNameStringLiteral	null
;	TokenNameSEMICOLON	
return	TokenNamereturn	
"["	TokenNameStringLiteral	[
+	TokenNamePLUS	
Hex	TokenNameIdentifier	 Hex
.	TokenNameDOT	
bytesToHex	TokenNameIdentifier	 bytes To Hex
(	TokenNameLPAREN	
hash	TokenNameIdentifier	 hash
)	TokenNameRPAREN	
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
class	TokenNameclass	
HashableSerializer	TokenNameIdentifier	 Hashable Serializer
implements	TokenNameimplements	
IVersionedSerializer	TokenNameIdentifier	 I Versioned Serializer
<	TokenNameLESS	
Hashable	TokenNameIdentifier	 Hashable
>	TokenNameGREATER	
{	TokenNameLBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
DataOutput	TokenNameIdentifier	 Data Output
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
instanceof	TokenNameinstanceof	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
.	TokenNameDOT	
IDENT	TokenNameIdentifier	 IDENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Inner	TokenNameIdentifier	 Inner
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dos	TokenNameIdentifier	 dos
.	TokenNameDOT	
writeByte	TokenNameIdentifier	 write Byte
(	TokenNameLPAREN	
Leaf	TokenNameIdentifier	 Leaf
.	TokenNameDOT	
IDENT	TokenNameIdentifier	 IDENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Leaf	TokenNameIdentifier	 Leaf
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serialize	TokenNameIdentifier	 serialize
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
dos	TokenNameIdentifier	 dos
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Unexpected Hashable: "	TokenNameStringLiteral	Unexpected Hashable: 
+	TokenNamePLUS	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCanonicalName	TokenNameIdentifier	 get Canonical Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Hashable	TokenNameIdentifier	 Hashable
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
DataInput	TokenNameIdentifier	 Data Input
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
byte	TokenNamebyte	
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
dis	TokenNameIdentifier	 dis
.	TokenNameDOT	
readByte	TokenNameIdentifier	 read Byte
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
.	TokenNameDOT	
IDENT	TokenNameIdentifier	 IDENT
==	TokenNameEQUAL_EQUAL	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
return	TokenNamereturn	
Inner	TokenNameIdentifier	 Inner
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
Leaf	TokenNameIdentifier	 Leaf
.	TokenNameDOT	
IDENT	TokenNameIdentifier	 IDENT
==	TokenNameEQUAL_EQUAL	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
return	TokenNamereturn	
Leaf	TokenNameIdentifier	 Leaf
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
deserialize	TokenNameIdentifier	 deserialize
(	TokenNameLPAREN	
dis	TokenNameIdentifier	 dis
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
IOException	TokenNameIdentifier	 IO Exception
(	TokenNameLPAREN	
"Unexpected Hashable: "	TokenNameStringLiteral	Unexpected Hashable: 
+	TokenNamePLUS	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
long	TokenNamelong	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
Hashable	TokenNameIdentifier	 Hashable
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
int	TokenNameint	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
instanceof	TokenNameinstanceof	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Inner	TokenNameIdentifier	 Inner
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Inner	TokenNameIdentifier	 Inner
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
instanceof	TokenNameinstanceof	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
return	TokenNamereturn	
1	TokenNameIntegerLiteral	
+	TokenNamePLUS	
Leaf	TokenNameIdentifier	 Leaf
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
serializedSize	TokenNameIdentifier	 serialized Size
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Leaf	TokenNameIdentifier	 Leaf
)	TokenNameRPAREN	
h	TokenNameIdentifier	 h
,	TokenNameCOMMA	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
AssertionError	TokenNameIdentifier	 Assertion Error
(	TokenNameLPAREN	
h	TokenNameIdentifier	 h
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Exceptions that stop recursion early when we are sure that no answer * can be found. */	TokenNameCOMMENT_JAVADOC	 Exceptions that stop recursion early when we are sure that no answer can be found. 
static	TokenNamestatic	
abstract	TokenNameabstract	
class	TokenNameclass	
StopRecursion	TokenNameIdentifier	 Stop Recursion
extends	TokenNameextends	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
static	TokenNamestatic	
class	TokenNameclass	
BadRange	TokenNameIdentifier	 Bad Range
extends	TokenNameextends	
StopRecursion	TokenNameIdentifier	 Stop Recursion
{	TokenNameLBRACE	
public	TokenNamepublic	
BadRange	TokenNameIdentifier	 Bad Range
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
InvalidHash	TokenNameIdentifier	 Invalid Hash
extends	TokenNameextends	
StopRecursion	TokenNameIdentifier	 Stop Recursion
{	TokenNameLBRACE	
public	TokenNamepublic	
InvalidHash	TokenNameIdentifier	 Invalid Hash
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
static	TokenNamestatic	
class	TokenNameclass	
TooDeep	TokenNameIdentifier	 Too Deep
extends	TokenNameextends	
StopRecursion	TokenNameIdentifier	 Stop Recursion
{	TokenNameLBRACE	
public	TokenNamepublic	
TooDeep	TokenNameIdentifier	 Too Deep
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
