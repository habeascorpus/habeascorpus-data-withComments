/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
ext	TokenNameIdentifier	 ext
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
image	TokenNameIdentifier	 image
.	TokenNameDOT	
rendered	TokenNameIdentifier	 rendered
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
;	TokenNameSEMICOLON	
/** * * @version $Id: LRUCache.java 498740 2007-01-22 18:35:57Z dvholten $ */	TokenNameCOMMENT_JAVADOC	 * @version $Id: LRUCache.java 498740 2007-01-22 18:35:57Z dvholten $ 
public	TokenNamepublic	
class	TokenNameclass	
LRUCache	TokenNameIdentifier	 LRU Cache
{	TokenNameLBRACE	
/** * Interface for object participating in the LRU Cache. These * inform the object of key events in the status of the object in * the LRU cache. */	TokenNameCOMMENT_JAVADOC	 Interface for object participating in the LRU Cache. These inform the object of key events in the status of the object in the LRU cache. 
public	TokenNamepublic	
interface	TokenNameinterface	
LRUObj	TokenNameIdentifier	 LRU Obj
{	TokenNameLBRACE	
/** * Called when the object first becomes active in the LRU cache. * @param nde The LRU cache node associated with this object. * should be remembered so it can be returned by * <tt>lruGet</tt>. */	TokenNameCOMMENT_JAVADOC	 Called when the object first becomes active in the LRU cache. @param nde The LRU cache node associated with this object. should be remembered so it can be returned by <tt>lruGet</tt>. 
void	TokenNamevoid	
lruSet	TokenNameIdentifier	 lru Set
(	TokenNameLPAREN	
LRUNode	TokenNameIdentifier	 LRU Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called to get the LRU node for this object. Should return the * node passed in to lruSet. */	TokenNameCOMMENT_JAVADOC	 Called to get the LRU node for this object. Should return the node passed in to lruSet. 
LRUNode	TokenNameIdentifier	 LRU Node
lruGet	TokenNameIdentifier	 lru Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Called to inform the object that it is no longer in the cache. */	TokenNameCOMMENT_JAVADOC	 Called to inform the object that it is no longer in the cache. 
void	TokenNamevoid	
lruRemove	TokenNameIdentifier	 lru Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Interface for nodes in the LRU cache, basicly nodes in a doubly * linked list. */	TokenNameCOMMENT_JAVADOC	 Interface for nodes in the LRU cache, basicly nodes in a doubly linked list. 
public	TokenNamepublic	
class	TokenNameclass	
LRUNode	TokenNameIdentifier	 LRU Node
extends	TokenNameextends	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
{	TokenNameLBRACE	
private	TokenNameprivate	
LRUObj	TokenNameIdentifier	 LRU Obj
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LRUObj	TokenNameIdentifier	 LRU Obj
getObj	TokenNameIdentifier	 get Obj
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
obj	TokenNameIdentifier	 obj
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
void	TokenNamevoid	
setObj	TokenNameIdentifier	 set Obj
(	TokenNameLPAREN	
LRUObj	TokenNameIdentifier	 LRU Obj
newObj	TokenNameIdentifier	 new Obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
lruRemove	TokenNameIdentifier	 lru Remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
obj	TokenNameIdentifier	 obj
=	TokenNameEQUAL	
newObj	TokenNameIdentifier	 new Obj
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
lruSet	TokenNameIdentifier	 lru Set
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
free	TokenNameIdentifier	 free
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
used	TokenNameIdentifier	 used
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
LRUCache	TokenNameIdentifier	 LRU Cache
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
<=	TokenNameLESS_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
free	TokenNameIdentifier	 free
=	TokenNameEQUAL	
new	TokenNamenew	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
used	TokenNameIdentifier	 used
=	TokenNameEQUAL	
new	TokenNamenew	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
free	TokenNameIdentifier	 free
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LRUNode	TokenNameIdentifier	 LRU Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
int	TokenNameint	
getUsed	TokenNameIdentifier	 get Used
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
setSize	TokenNameIdentifier	 set Size
(	TokenNameLPAREN	
int	TokenNameint	
newSz	TokenNameIdentifier	 new Sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
<	TokenNameLESS	
newSz	TokenNameIdentifier	 new Sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// list grew... 	TokenNameCOMMENT_LINE	list grew... 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
maxSize	TokenNameIdentifier	 max Size
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
newSz	TokenNameIdentifier	 new Sz
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
free	TokenNameIdentifier	 free
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
new	TokenNamenew	
LRUNode	TokenNameIdentifier	 LRU Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
maxSize	TokenNameIdentifier	 max Size
>	TokenNameGREATER	
newSz	TokenNameIdentifier	 new Sz
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
>	TokenNameGREATER	
newSz	TokenNameIdentifier	 new Sz
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
--	TokenNameMINUS_MINUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LRUNode	TokenNameIdentifier	 LRU Node
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LRUNode	TokenNameIdentifier	 LRU Node
)	TokenNameRPAREN	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
getTail	TokenNameIdentifier	 get Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
setObj	TokenNameIdentifier	 set Obj
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
maxSize	TokenNameIdentifier	 max Size
=	TokenNameEQUAL	
newSz	TokenNameIdentifier	 new Sz
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
flush	TokenNameIdentifier	 flush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LRUNode	TokenNameIdentifier	 LRU Node
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LRUNode	TokenNameIdentifier	 LRU Node
)	TokenNameRPAREN	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
setObj	TokenNameIdentifier	 set Obj
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
free	TokenNameIdentifier	 free
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
LRUObj	TokenNameIdentifier	 LRU Obj
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LRUNode	TokenNameIdentifier	 LRU Node
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
lruGet	TokenNameIdentifier	 lru Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
setObj	TokenNameIdentifier	 set Obj
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
free	TokenNameIdentifier	 free
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
LRUObj	TokenNameIdentifier	 LRU Obj
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LRUNode	TokenNameIdentifier	 LRU Node
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
lruGet	TokenNameIdentifier	 lru Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
LRUObj	TokenNameIdentifier	 LRU Obj
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LRUNode	TokenNameIdentifier	 LRU Node
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
obj	TokenNameIdentifier	 obj
.	TokenNameDOT	
lruGet	TokenNameIdentifier	 lru Get
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// already linked in... 	TokenNameCOMMENT_LINE	already linked in... 
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
free	TokenNameIdentifier	 free
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LRUNode	TokenNameIdentifier	 LRU Node
)	TokenNameRPAREN	
free	TokenNameIdentifier	 free
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
setObj	TokenNameIdentifier	 set Obj
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LRUNode	TokenNameIdentifier	 LRU Node
)	TokenNameRPAREN	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
getTail	TokenNameIdentifier	 get Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
setObj	TokenNameIdentifier	 set Obj
(	TokenNameLPAREN	
obj	TokenNameIdentifier	 obj
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"In Use: "	TokenNameStringLiteral	In Use: 
+	TokenNamePLUS	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Free: "	TokenNameStringLiteral	 Free: 
+	TokenNamePLUS	
free	TokenNameIdentifier	 free
.	TokenNameDOT	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LRUNode	TokenNameIdentifier	 LRU Node
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LRUNode	TokenNameIdentifier	 LRU Node
)	TokenNameRPAREN	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
getObj	TokenNameIdentifier	 get Obj
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LRUNode	TokenNameIdentifier	 LRU Node
)	TokenNameRPAREN	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
!=	TokenNameNOT_EQUAL	
used	TokenNameIdentifier	 used
.	TokenNameDOT	
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
