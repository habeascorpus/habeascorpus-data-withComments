/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
analysis	TokenNameIdentifier	 analysis
.	TokenNameDOT	
compound	TokenNameIdentifier	 compound
.	TokenNameDOT	
hyphenation	TokenNameIdentifier	 hyphenation
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
;	TokenNameSEMICOLON	
/** * <h2>Ternary Search Tree.</h2> * * <p> * A ternary search tree is a hybrid between a binary tree and a digital search * tree (trie). Keys are limited to strings. A data value of type char is stored * in each leaf node. It can be used as an index (or pointer) to the data. * Branches that only contain one key are compressed to one node by storing a * pointer to the trailer substring of the key. This class is intended to serve * as base class or helper class to implement Dictionary collections or the * like. Ternary trees have some nice properties as the following: the tree can * be traversed in sorted order, partial matches (wildcard) can be implemented, * retrieval of all keys within a given distance from the target, etc. The * storage requirements are higher than a binary tree but a lot less than a * trie. Performance is comparable with a hash table, sometimes it outperforms a * hash function (most of the time can determine a miss faster than a hash). * </p> * * <p> * The main purpose of this java port is to serve as a base for implementing * TeX's hyphenation algorithm (see The TeXBook, appendix H). Each language * requires from 5000 to 15000 hyphenation patterns which will be keys in this * tree. The strings patterns are usually small (from 2 to 5 characters), but * each char in the tree is stored in a node. Thus memory usage is the main * concern. We will sacrifice 'elegance' to keep memory requirements to the * minimum. Using java's char type as pointer (yes, I know pointer it is a * forbidden word in java) we can keep the size of the node to be just 8 bytes * (3 pointers and the data char). This gives room for about 65000 nodes. In my * tests the english patterns took 7694 nodes and the german patterns 10055 * nodes, so I think we are safe. * </p> * * <p> * All said, this is a map with strings as keys and char as value. Pretty * limited!. It can be extended to a general map by using the string * representation of an object and using the char value as an index to an array * that contains the object values. * </p> * * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. */	TokenNameCOMMENT_JAVADOC	 <h2>Ternary Search Tree.</h2> * <p> A ternary search tree is a hybrid between a binary tree and a digital search tree (trie). Keys are limited to strings. A data value of type char is stored in each leaf node. It can be used as an index (or pointer) to the data. Branches that only contain one key are compressed to one node by storing a pointer to the trailer substring of the key. This class is intended to serve as base class or helper class to implement Dictionary collections or the like. Ternary trees have some nice properties as the following: the tree can be traversed in sorted order, partial matches (wildcard) can be implemented, retrieval of all keys within a given distance from the target, etc. The storage requirements are higher than a binary tree but a lot less than a trie. Performance is comparable with a hash table, sometimes it outperforms a hash function (most of the time can determine a miss faster than a hash). </p> * <p> The main purpose of this java port is to serve as a base for implementing TeX's hyphenation algorithm (see The TeXBook, appendix H). Each language requires from 5000 to 15000 hyphenation patterns which will be keys in this tree. The strings patterns are usually small (from 2 to 5 characters), but each char in the tree is stored in a node. Thus memory usage is the main concern. We will sacrifice 'elegance' to keep memory requirements to the minimum. Using java's char type as pointer (yes, I know pointer it is a forbidden word in java) we can keep the size of the node to be just 8 bytes (3 pointers and the data char). This gives room for about 65000 nodes. In my tests the english patterns took 7694 nodes and the german patterns 10055 nodes, so I think we are safe. </p> * <p> All said, this is a map with strings as keys and char as value. Pretty limited!. It can be extended to a general map by using the string representation of an object and using the char value as an index to an array that contains the object values. </p> * This class has been taken from the Apache FOP project (http://xmlgraphics.apache.org/fop/). They have been slightly modified. 
public	TokenNamepublic	
class	TokenNameclass	
TernaryTree	TokenNameIdentifier	 Ternary Tree
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
Serializable	TokenNameIdentifier	 Serializable
{	TokenNameLBRACE	
/** * We use 4 arrays to represent a node. I guess I should have created a proper * node class, but somehow Knuth's pascal code made me forget we now have a * portable language with virtual memory management and automatic garbage * collection! And now is kind of late, furthermore, if it ain't broken, don't * fix it. */	TokenNameCOMMENT_JAVADOC	 We use 4 arrays to represent a node. I guess I should have created a proper node class, but somehow Knuth's pascal code made me forget we now have a portable language with virtual memory management and automatic garbage collection! And now is kind of late, furthermore, if it ain't broken, don't fix it. 
/** * Pointer to low branch and to rest of the key when it is stored directly in * this node, we don't have unions in java! */	TokenNameCOMMENT_JAVADOC	 Pointer to low branch and to rest of the key when it is stored directly in this node, we don't have unions in java! 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
lo	TokenNameIdentifier	 lo
;	TokenNameSEMICOLON	
/** * Pointer to high branch. */	TokenNameCOMMENT_JAVADOC	 Pointer to high branch. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
hi	TokenNameIdentifier	 hi
;	TokenNameSEMICOLON	
/** * Pointer to equal branch and to data when this node is a string terminator. */	TokenNameCOMMENT_JAVADOC	 Pointer to equal branch and to data when this node is a string terminator. 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
eq	TokenNameIdentifier	 eq
;	TokenNameSEMICOLON	
/** * <P> * The character stored in this node: splitchar. Two special values are * reserved: * </P> * <ul> * <li>0x0000 as string terminator</li> * <li>0xFFFF to indicate that the branch starting at this node is compressed</li> * </ul> * <p> * This shouldn't be a problem if we give the usual semantics to strings since * 0xFFFF is guaranteed not to be an Unicode character. * </p> */	TokenNameCOMMENT_JAVADOC	 <P> The character stored in this node: splitchar. Two special values are reserved: </P> <ul> <li>0x0000 as string terminator</li> <li>0xFFFF to indicate that the branch starting at this node is compressed</li> </ul> <p> This shouldn't be a problem if we give the usual semantics to strings since 0xFFFF is guaranteed not to be an Unicode character. </p> 
protected	TokenNameprotected	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
sc	TokenNameIdentifier	 sc
;	TokenNameSEMICOLON	
/** * This vector holds the trailing of the keys when the branch is compressed. */	TokenNameCOMMENT_JAVADOC	 This vector holds the trailing of the keys when the branch is compressed. 
protected	TokenNameprotected	
CharVector	TokenNameIdentifier	 Char Vector
kv	TokenNameIdentifier	 kv
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
char	TokenNamechar	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
char	TokenNamechar	
freenode	TokenNameIdentifier	 freenode
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// number of items in tree 	TokenNameCOMMENT_LINE	number of items in tree 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
=	TokenNameEQUAL	
2048	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// allocation size for arrays 	TokenNameCOMMENT_LINE	allocation size for arrays 
TernaryTree	TokenNameIdentifier	 Ternary Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
freenode	TokenNameIdentifier	 freenode
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
kv	TokenNameIdentifier	 kv
=	TokenNameEQUAL	
new	TokenNamenew	
CharVector	TokenNameIdentifier	 Char Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Branches are initially compressed, needing one node per key plus the size * of the string key. They are decompressed as needed when another key with * same prefix is inserted. This saves a lot of space, specially for long * keys. */	TokenNameCOMMENT_JAVADOC	 Branches are initially compressed, needing one node per key plus the size of the string key. They are decompressed as needed when another key with same prefix is inserted. This saves a lot of space, specially for long keys. 
public	TokenNamepublic	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
char	TokenNamechar	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// make sure we have enough room in the arrays 	TokenNameCOMMENT_LINE	make sure we have enough room in the arrays 
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// maximum number of nodes that may be generated 	TokenNameCOMMENT_LINE	maximum number of nodes that may be generated 
if	TokenNameif	
(	TokenNameLPAREN	
freenode	TokenNameIdentifier	 freenode
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redimNodeArrays	TokenNameIdentifier	 redim Node Arrays
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
char	TokenNamechar	
strkey	TokenNameIdentifier	 strkey
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
--	TokenNameMINUS_MINUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
strkey	TokenNameIdentifier	 strkey
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strkey	TokenNameIdentifier	 strkey
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
strkey	TokenNameIdentifier	 strkey
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
char	TokenNamechar	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
strlen	TokenNameIdentifier	 strlen
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
freenode	TokenNameIdentifier	 freenode
+	TokenNamePLUS	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
redimNodeArrays	TokenNameIdentifier	 redim Node Arrays
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
BLOCK_SIZE	TokenNameIdentifier	 BLOCK  SIZE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
root	TokenNameIdentifier	 root
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The actual insertion function, recursive version. */	TokenNameCOMMENT_JAVADOC	 The actual insertion function, recursive version. 
private	TokenNameprivate	
char	TokenNamechar	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
char	TokenNamechar	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
char	TokenNamechar	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
strlen	TokenNameIdentifier	 strlen
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// this means there is no branch, this node will start a new branch. 	TokenNameCOMMENT_LINE	this means there is no branch, this node will start a new branch. 
// Instead of doing that, we store the key somewhere else and create 	TokenNameCOMMENT_LINE	Instead of doing that, we store the key somewhere else and create 
// only one node with a pointer to the key 	TokenNameCOMMENT_LINE	only one node with a pointer to the key 
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
freenode	TokenNameIdentifier	 freenode
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
// holds data 	TokenNameCOMMENT_LINE	holds data 
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
// indicates branch is compressed 	TokenNameCOMMENT_LINE	indicates branch is compressed 
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// use 'lo' to hold pointer to key 	TokenNameCOMMENT_LINE	use 'lo' to hold pointer to key 
strcpy	TokenNameIdentifier	 strcpy
(	TokenNameLPAREN	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// branch is compressed: need to decompress 	TokenNameCOMMENT_LINE	branch is compressed: need to decompress 
// this will generate garbage in the external key array 	TokenNameCOMMENT_LINE	this will generate garbage in the external key array 
// but we can do some garbage collection later 	TokenNameCOMMENT_LINE	but we can do some garbage collection later 
char	TokenNamechar	
pp	TokenNameIdentifier	 pp
=	TokenNameEQUAL	
freenode	TokenNameIdentifier	 freenode
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// previous pointer to key 	TokenNameCOMMENT_LINE	previous pointer to key 
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// previous pointer to data 	TokenNameCOMMENT_LINE	previous pointer to data 
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// key completly decompressed leaving garbage in key array 	TokenNameCOMMENT_LINE	key completly decompressed leaving garbage in key array 
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// we only got first char of key, rest is still there 	TokenNameCOMMENT_LINE	we only got first char of key, rest is still there 
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// In this case we can save a node by swapping the new node 	TokenNameCOMMENT_LINE	In this case we can save a node by swapping the new node 
// with the compressed node 	TokenNameCOMMENT_LINE	with the compressed node 
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
pp	TokenNameIdentifier	 pp
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0xFFFF	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
pp	TokenNameIdentifier	 pp
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
length	TokenNameIdentifier	 length
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
char	TokenNamechar	
s	TokenNameIdentifier	 s
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
<	TokenNameLESS	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
==	TokenNameEQUAL_EQUAL	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
s	TokenNameIdentifier	 s
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// key already in tree, overwrite data 	TokenNameCOMMENT_LINE	key already in tree, overwrite data 
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
val	TokenNameIdentifier	 val
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
start	TokenNameIdentifier	 start
,	TokenNameCOMMA	
val	TokenNameIdentifier	 val
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares 2 null terminated char arrays */	TokenNameCOMMENT_JAVADOC	 Compares 2 null terminated char arrays 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
strcmp	TokenNameIdentifier	 strcmp
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
startA	TokenNameIdentifier	 start A
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
int	TokenNameint	
startB	TokenNameIdentifier	 start B
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
startA	TokenNameIdentifier	 start A
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
startB	TokenNameIdentifier	 start B
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
startA	TokenNameIdentifier	 start A
++	TokenNamePLUS_PLUS	
,	TokenNameCOMMA	
startB	TokenNameIdentifier	 start B
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
startA	TokenNameIdentifier	 start A
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
startA	TokenNameIdentifier	 start A
]	TokenNameRBRACKET	
-	TokenNameMINUS	
b	TokenNameIdentifier	 b
[	TokenNameLBRACKET	
startB	TokenNameIdentifier	 start B
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Compares a string with null terminated char array */	TokenNameCOMMENT_JAVADOC	 Compares a string with null terminated char array 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
strcmp	TokenNameIdentifier	 strcmp
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
d	TokenNameIdentifier	 d
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
(	TokenNameLPAREN	
int	TokenNameint	
)	TokenNameRPAREN	
str	TokenNameIdentifier	 str
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
start	TokenNameIdentifier	 start
+	TokenNamePLUS	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
strcpy	TokenNameIdentifier	 strcpy
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
dst	TokenNameIdentifier	 dst
,	TokenNameCOMMA	
int	TokenNameint	
di	TokenNameIdentifier	 di
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
src	TokenNameIdentifier	 src
,	TokenNameCOMMA	
int	TokenNameint	
si	TokenNameIdentifier	 si
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
src	TokenNameIdentifier	 src
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
di	TokenNameIdentifier	 di
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
src	TokenNameIdentifier	 src
[	TokenNameLBRACKET	
si	TokenNameIdentifier	 si
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
dst	TokenNameIdentifier	 dst
[	TokenNameLBRACKET	
di	TokenNameIdentifier	 di
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
strlen	TokenNameIdentifier	 strlen
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
a	TokenNameIdentifier	 a
.	TokenNameDOT	
length	TokenNameIdentifier	 length
&&	TokenNameAND_AND	
a	TokenNameIdentifier	 a
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
len	TokenNameIdentifier	 len
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
len	TokenNameIdentifier	 len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
strlen	TokenNameIdentifier	 strlen
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
a	TokenNameIdentifier	 a
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
strlen	TokenNameIdentifier	 strlen
(	TokenNameLPAREN	
a	TokenNameIdentifier	 a
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
strkey	TokenNameIdentifier	 strkey
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
key	TokenNameIdentifier	 key
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
,	TokenNameCOMMA	
strkey	TokenNameIdentifier	 strkey
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strkey	TokenNameIdentifier	 strkey
[	TokenNameLBRACKET	
len	TokenNameIdentifier	 len
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
strkey	TokenNameIdentifier	 strkey
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
int	TokenNameint	
start	TokenNameIdentifier	 start
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
d	TokenNameIdentifier	 d
;	TokenNameSEMICOLON	
char	TokenNamechar	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
start	TokenNameIdentifier	 start
;	TokenNameSEMICOLON	
char	TokenNamechar	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
strcmp	TokenNameIdentifier	 strcmp
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
key	TokenNameIdentifier	 key
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
d	TokenNameIdentifier	 d
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
-	TokenNameMINUS	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
d	TokenNameIdentifier	 d
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
knows	TokenNameIdentifier	 knows
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// redimension the arrays 	TokenNameCOMMENT_LINE	redimension the arrays 
private	TokenNameprivate	
void	TokenNamevoid	
redimNodeArrays	TokenNameIdentifier	 redim Node Arrays
(	TokenNameLPAREN	
int	TokenNameint	
newsize	TokenNameIdentifier	 newsize
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
newsize	TokenNameIdentifier	 newsize
<	TokenNameLESS	
lo	TokenNameIdentifier	 lo
.	TokenNameDOT	
length	TokenNameIdentifier	 length
?	TokenNameQUESTION	
newsize	TokenNameIdentifier	 newsize
:	TokenNameCOLON	
lo	TokenNameIdentifier	 lo
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
na	TokenNameIdentifier	 na
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
lo	TokenNameIdentifier	 lo
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
na	TokenNameIdentifier	 na
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
na	TokenNameIdentifier	 na
;	TokenNameSEMICOLON	
na	TokenNameIdentifier	 na
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
hi	TokenNameIdentifier	 hi
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
na	TokenNameIdentifier	 na
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
na	TokenNameIdentifier	 na
;	TokenNameSEMICOLON	
na	TokenNameIdentifier	 na
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
eq	TokenNameIdentifier	 eq
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
na	TokenNameIdentifier	 na
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
eq	TokenNameIdentifier	 eq
=	TokenNameEQUAL	
na	TokenNameIdentifier	 na
;	TokenNameSEMICOLON	
na	TokenNameIdentifier	 na
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
newsize	TokenNameIdentifier	 newsize
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
na	TokenNameIdentifier	 na
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
na	TokenNameIdentifier	 na
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TernaryTree	TokenNameIdentifier	 Ternary Tree
t	TokenNameIdentifier	 t
=	TokenNameEQUAL	
new	TokenNamenew	
TernaryTree	TokenNameIdentifier	 Ternary Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
lo	TokenNameIdentifier	 lo
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
hi	TokenNameIdentifier	 hi
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
eq	TokenNameIdentifier	 eq
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
sc	TokenNameIdentifier	 sc
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
kv	TokenNameIdentifier	 kv
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CharVector	TokenNameIdentifier	 Char Vector
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
root	TokenNameIdentifier	 root
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
freenode	TokenNameIdentifier	 freenode
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
freenode	TokenNameIdentifier	 freenode
;	TokenNameSEMICOLON	
t	TokenNameIdentifier	 t
.	TokenNameDOT	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
t	TokenNameIdentifier	 t
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Recursively insert the median first and then the median of the lower and * upper halves, and so on in order to get a balanced tree. The array of keys * is assumed to be sorted in ascending order. */	TokenNameCOMMENT_JAVADOC	 Recursively insert the median first and then the median of the lower and upper halves, and so on in order to get a balanced tree. The array of keys is assumed to be sorted in ascending order. 
protected	TokenNameprotected	
void	TokenNamevoid	
insertBalanced	TokenNameIdentifier	 insert Balanced
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
m	TokenNameIdentifier	 m
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m	TokenNameIdentifier	 m
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
>>	TokenNameRIGHT_SHIFT	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertBalanced	TokenNameIdentifier	 insert Balanced
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
m	TokenNameIdentifier	 m
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertBalanced	TokenNameIdentifier	 insert Balanced
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
m	TokenNameIdentifier	 m
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
-	TokenNameMINUS	
m	TokenNameIdentifier	 m
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Balance the tree for best search performance */	TokenNameCOMMENT_JAVADOC	 Balance the tree for best search performance 
public	TokenNamepublic	
void	TokenNamevoid	
balance	TokenNameIdentifier	 balance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// System.out.print("Before root splitchar = "); 	TokenNameCOMMENT_LINE	System.out.print("Before root splitchar = "); 
// System.out.println(sc[root]); 	TokenNameCOMMENT_LINE	System.out.println(sc[root]); 
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
n	TokenNameIdentifier	 n
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
v	TokenNameIdentifier	 v
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
k	TokenNameIdentifier	 k
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
insertBalanced	TokenNameIdentifier	 insert Balanced
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
v	TokenNameIdentifier	 v
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// With uniform letter distribution sc[root] should be around 'm' 	TokenNameCOMMENT_LINE	With uniform letter distribution sc[root] should be around 'm' 
// System.out.print("After root splitchar = "); 	TokenNameCOMMENT_LINE	System.out.print("After root splitchar = "); 
// System.out.println(sc[root]); 	TokenNameCOMMENT_LINE	System.out.println(sc[root]); 
}	TokenNameRBRACE	
/** * Each node stores a character (splitchar) which is part of some key(s). In a * compressed branch (one that only contain a single string key) the trailer * of the key which is not already in nodes is stored externally in the kv * array. As items are inserted, key substrings decrease. Some substrings may * completely disappear when the whole branch is totally decompressed. The * tree is traversed to find the key substrings actually used. In addition, * duplicate substrings are removed using a map (implemented with a * TernaryTree!). * */	TokenNameCOMMENT_JAVADOC	 Each node stores a character (splitchar) which is part of some key(s). In a compressed branch (one that only contain a single string key) the trailer of the key which is not already in nodes is stored externally in the kv array. As items are inserted, key substrings decrease. Some substrings may completely disappear when the whole branch is totally decompressed. The tree is traversed to find the key substrings actually used. In addition, duplicate substrings are removed using a map (implemented with a TernaryTree!). 
public	TokenNamepublic	
void	TokenNamevoid	
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first balance the tree for best performance 	TokenNameCOMMENT_LINE	first balance the tree for best performance 
balance	TokenNameIdentifier	 balance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// redimension the node arrays 	TokenNameCOMMENT_LINE	redimension the node arrays 
redimNodeArrays	TokenNameIdentifier	 redim Node Arrays
(	TokenNameLPAREN	
freenode	TokenNameIdentifier	 freenode
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// ok, compact kv array 	TokenNameCOMMENT_LINE	ok, compact kv array 
CharVector	TokenNameIdentifier	 Char Vector
kx	TokenNameIdentifier	 kx
=	TokenNameEQUAL	
new	TokenNamenew	
CharVector	TokenNameIdentifier	 Char Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kx	TokenNameIdentifier	 kx
.	TokenNameDOT	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
TernaryTree	TokenNameIdentifier	 Ternary Tree
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
new	TokenNamenew	
TernaryTree	TokenNameIdentifier	 Ternary Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
kx	TokenNameIdentifier	 kx
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
root	TokenNameIdentifier	 root
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
kv	TokenNameIdentifier	 kv
=	TokenNameEQUAL	
kx	TokenNameIdentifier	 kx
;	TokenNameSEMICOLON	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
CharVector	TokenNameIdentifier	 Char Vector
kx	TokenNameIdentifier	 kx
,	TokenNameCOMMA	
TernaryTree	TokenNameIdentifier	 Ternary Tree
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
char	TokenNamechar	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
k	TokenNameIdentifier	 k
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
k	TokenNameIdentifier	 k
=	TokenNameEQUAL	
kx	TokenNameIdentifier	 kx
.	TokenNameDOT	
alloc	TokenNameIdentifier	 alloc
(	TokenNameLPAREN	
strlen	TokenNameIdentifier	 strlen
(	TokenNameLPAREN	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
strcpy	TokenNameIdentifier	 strcpy
(	TokenNameLPAREN	
kx	TokenNameIdentifier	 kx
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
kx	TokenNameIdentifier	 kx
.	TokenNameDOT	
getArray	TokenNameIdentifier	 get Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
k	TokenNameIdentifier	 k
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
k	TokenNameIdentifier	 k
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
kx	TokenNameIdentifier	 kx
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
kx	TokenNameIdentifier	 kx
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
compact	TokenNameIdentifier	 compact
(	TokenNameLPAREN	
kx	TokenNameIdentifier	 kx
,	TokenNameCOMMA	
map	TokenNameIdentifier	 map
,	TokenNameCOMMA	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
p	TokenNameIdentifier	 p
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
Enumeration	TokenNameIdentifier	 Enumeration
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
Iterator	TokenNameIdentifier	 Iterator
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
<	TokenNameLESS	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
{	TokenNameLBRACE	
/** * current node index */	TokenNameCOMMENT_JAVADOC	 current node index 
int	TokenNameint	
cur	TokenNameIdentifier	 cur
;	TokenNameSEMICOLON	
/** * current key */	TokenNameCOMMENT_JAVADOC	 current key 
String	TokenNameIdentifier	 String
curkey	TokenNameIdentifier	 curkey
;	TokenNameSEMICOLON	
private	TokenNameprivate	
class	TokenNameclass	
Item	TokenNameIdentifier	 Item
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
{	TokenNameLBRACE	
char	TokenNamechar	
parent	TokenNameIdentifier	 parent
;	TokenNameSEMICOLON	
char	TokenNamechar	
child	TokenNameIdentifier	 child
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Item	TokenNameIdentifier	 Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Item	TokenNameIdentifier	 Item
(	TokenNameLPAREN	
char	TokenNamechar	
p	TokenNameIdentifier	 p
,	TokenNameCOMMA	
char	TokenNamechar	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
p	TokenNameIdentifier	 p
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
@	TokenNameAT	
Override	TokenNameIdentifier	 Override
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Item	TokenNameIdentifier	 Item
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Node stack */	TokenNameCOMMENT_JAVADOC	 Node stack 
Stack	TokenNameIdentifier	 Stack
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
ns	TokenNameIdentifier	 ns
;	TokenNameSEMICOLON	
/** * key stack implemented with a StringBuilder */	TokenNameCOMMENT_JAVADOC	 key stack implemented with a StringBuilder 
StringBuilder	TokenNameIdentifier	 String Builder
ks	TokenNameIdentifier	 ks
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cur	TokenNameIdentifier	 cur
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
<	TokenNameLESS	
Item	TokenNameIdentifier	 Item
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ks	TokenNameIdentifier	 ks
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rewind	TokenNameIdentifier	 rewind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
rewind	TokenNameIdentifier	 rewind
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ks	TokenNameIdentifier	 ks
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cur	TokenNameIdentifier	 cur
=	TokenNameEQUAL	
root	TokenNameIdentifier	 root
;	TokenNameSEMICOLON	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
String	TokenNameIdentifier	 String
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
curkey	TokenNameIdentifier	 curkey
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
cur	TokenNameIdentifier	 cur
=	TokenNameEQUAL	
up	TokenNameIdentifier	 up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
char	TokenNamechar	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cur	TokenNameIdentifier	 cur
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
cur	TokenNameIdentifier	 cur
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
cur	TokenNameIdentifier	 cur
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * traverse upwards */	TokenNameCOMMENT_JAVADOC	 traverse upwards 
private	TokenNameprivate	
int	TokenNameint	
up	TokenNameIdentifier	 up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Item	TokenNameIdentifier	 Item
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
new	TokenNamenew	
Item	TokenNameIdentifier	 Item
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cur	TokenNameIdentifier	 cur
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
cur	TokenNameIdentifier	 cur
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
cur	TokenNameIdentifier	 cur
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
climb	TokenNameIdentifier	 climb
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
climb	TokenNameIdentifier	 climb
)	TokenNameRPAREN	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
child	TokenNameIdentifier	 child
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
child	TokenNameIdentifier	 child
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
1	TokenNameIntegerLiteral	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
eq	TokenNameIdentifier	 eq
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Item	TokenNameIdentifier	 Item
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ks	TokenNameIdentifier	 ks
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
child	TokenNameIdentifier	 child
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Item	TokenNameIdentifier	 Item
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
climb	TokenNameIdentifier	 climb
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
2	TokenNameIntegerLiteral	
:	TokenNameCOLON	
res	TokenNameIdentifier	 res
=	TokenNameEQUAL	
hi	TokenNameIdentifier	 hi
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
parent	TokenNameIdentifier	 parent
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Item	TokenNameIdentifier	 Item
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ks	TokenNameIdentifier	 ks
.	TokenNameDOT	
setLength	TokenNameIdentifier	 set Length
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pop 	TokenNameCOMMENT_LINE	pop 
}	TokenNameRBRACE	
climb	TokenNameIdentifier	 climb
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
climb	TokenNameIdentifier	 climb
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
res	TokenNameIdentifier	 res
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * traverse the tree to find next key */	TokenNameCOMMENT_JAVADOC	 traverse the tree to find next key 
private	TokenNameprivate	
int	TokenNameint	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cur	TokenNameIdentifier	 cur
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
leaf	TokenNameIdentifier	 leaf
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// first go down on low branch until leaf or compressed branch 	TokenNameCOMMENT_LINE	first go down on low branch until leaf or compressed branch 
while	TokenNamewhile	
(	TokenNameLPAREN	
cur	TokenNameIdentifier	 cur
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
cur	TokenNameIdentifier	 cur
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leaf	TokenNameIdentifier	 leaf
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
ns	TokenNameIdentifier	 ns
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
new	TokenNamenew	
Item	TokenNameIdentifier	 Item
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
cur	TokenNameIdentifier	 cur
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
cur	TokenNameIdentifier	 cur
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
leaf	TokenNameIdentifier	 leaf
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
cur	TokenNameIdentifier	 cur
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
cur	TokenNameIdentifier	 cur
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
leaf	TokenNameIdentifier	 leaf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// nothing found, go up one node and try again 	TokenNameCOMMENT_LINE	nothing found, go up one node and try again 
cur	TokenNameIdentifier	 cur
=	TokenNameEQUAL	
up	TokenNameIdentifier	 up
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cur	TokenNameIdentifier	 cur
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// The current node should be a data node and 	TokenNameCOMMENT_LINE	The current node should be a data node and 
// the key should be in the key stack (at least partially) 	TokenNameCOMMENT_LINE	the key should be in the key stack (at least partially) 
StringBuilder	TokenNameIdentifier	 String Builder
buf	TokenNameIdentifier	 buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuilder	TokenNameIdentifier	 String Builder
(	TokenNameLPAREN	
ks	TokenNameIdentifier	 ks
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
[	TokenNameLBRACKET	
cur	TokenNameIdentifier	 cur
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
0xFFFF	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
p	TokenNameIdentifier	 p
=	TokenNameEQUAL	
lo	TokenNameIdentifier	 lo
[	TokenNameLBRACKET	
cur	TokenNameIdentifier	 cur
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
p	TokenNameIdentifier	 p
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
curkey	TokenNameIdentifier	 curkey
=	TokenNameEQUAL	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
printStats	TokenNameIdentifier	 print Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Number of keys = "	TokenNameStringLiteral	Number of keys = 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Node count = "	TokenNameStringLiteral	Node count = 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
freenode	TokenNameIdentifier	 freenode
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// System.out.println("Array length = " + Integer.toString(eq.length)); 	TokenNameCOMMENT_LINE	System.out.println("Array length = " + Integer.toString(eq.length)); 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Key Array length = "	TokenNameStringLiteral	Key Array length = 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
kv	TokenNameIdentifier	 kv
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* * for(int i=0; i<kv.length(); i++) if ( kv.get(i) != 0 ) * System.out.print(kv.get(i)); else System.out.println(""); * System.out.println("Keys:"); for(Enumeration enum = keys(); * enum.hasMoreElements(); ) System.out.println(enum.nextElement()); */	TokenNameCOMMENT_BLOCK	 for(int i=0; i<kv.length(); i++) if ( kv.get(i) != 0 ) System.out.print(kv.get(i)); else System.out.println(""); System.out.println("Keys:"); for(Enumeration enum = keys(); enum.hasMoreElements(); ) System.out.println(enum.nextElement()); 
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
TernaryTree	TokenNameIdentifier	 Ternary Tree
tt	TokenNameIdentifier	 tt
=	TokenNameEQUAL	
new	TokenNamenew	
TernaryTree	TokenNameIdentifier	 Ternary Tree
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
"Carlos"	TokenNameStringLiteral	Carlos
,	TokenNameCOMMA	
'C'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
"Car"	TokenNameStringLiteral	Car
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
"palos"	TokenNameStringLiteral	palos
,	TokenNameCOMMA	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
insert	TokenNameIdentifier	 insert
(	TokenNameLPAREN	
"pa"	TokenNameStringLiteral	pa
,	TokenNameCOMMA	
'p'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
trimToSize	TokenNameIdentifier	 trim To Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
"Car"	TokenNameStringLiteral	Car
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
"Carlos"	TokenNameStringLiteral	Carlos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
find	TokenNameIdentifier	 find
(	TokenNameLPAREN	
"alto"	TokenNameStringLiteral	alto
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tt	TokenNameIdentifier	 tt
.	TokenNameDOT	
printStats	TokenNameIdentifier	 print Stats
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
