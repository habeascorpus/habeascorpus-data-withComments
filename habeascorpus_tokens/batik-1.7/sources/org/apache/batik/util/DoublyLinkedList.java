/* Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0 Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
batik	TokenNameIdentifier	 batik
.	TokenNameDOT	
util	TokenNameIdentifier	 util
;	TokenNameSEMICOLON	
/** * A simple Doubly Linked list class, designed to avoid * O(n) behaviour on insert and delete. * * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> * @version $Id: DoublyLinkedList.java 475685 2006-11-16 11:16:05Z cam $ */	TokenNameCOMMENT_JAVADOC	 A simple Doubly Linked list class, designed to avoid O(n) behaviour on insert and delete. * @author <a href="mailto:thomas.deweese@kodak.com">Thomas DeWeese</a> @version $Id: DoublyLinkedList.java 475685 2006-11-16 11:16:05Z cam $ 
public	TokenNamepublic	
class	TokenNameclass	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
{	TokenNameLBRACE	
/** * Basic doubly linked list node interface. */	TokenNameCOMMENT_JAVADOC	 Basic doubly linked list node interface. 
public	TokenNamepublic	
static	TokenNamestatic	
class	TokenNameclass	
Node	TokenNameIdentifier	 Node
{	TokenNameLBRACE	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
prev	TokenNameIdentifier	 prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newNext	TokenNameIdentifier	 new Next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
newNext	TokenNameIdentifier	 new Next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
setPrev	TokenNameIdentifier	 set Prev
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
newPrev	TokenNameIdentifier	 new Prev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prev	TokenNameIdentifier	 prev
=	TokenNameEQUAL	
newPrev	TokenNameIdentifier	 new Prev
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Unlink this node from it's current list... */	TokenNameCOMMENT_JAVADOC	 Unlink this node from it's current list... 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setPrev	TokenNameIdentifier	 set Prev
(	TokenNameLPAREN	
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPrev	TokenNameIdentifier	 set Prev
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Link this node in, infront of nde (unlinks it's self * before hand if needed). * @param nde the node to link in before. */	TokenNameCOMMENT_JAVADOC	 Link this node in, infront of nde (unlinks it's self before hand if needed). @param nde the node to link in before. 
protected	TokenNameprotected	
final	TokenNamefinal	
void	TokenNamevoid	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Already here... 	TokenNameCOMMENT_LINE	Already here... 
if	TokenNameif	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Actually insert this node... 	TokenNameCOMMENT_LINE	Actually insert this node... 
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty lst... 	TokenNameCOMMENT_LINE	empty lst... 
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPrev	TokenNameIdentifier	 set Prev
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPrev	TokenNameIdentifier	 set Prev
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
setPrev	TokenNameIdentifier	 set Prev
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNext	TokenNameIdentifier	 set Next
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
int	TokenNameint	
size	TokenNameIdentifier	 size
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
DoublyLinkedList	TokenNameIdentifier	 Doubly Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Returns the number of elements currently in the list. */	TokenNameCOMMENT_JAVADOC	 Returns the number of elements currently in the list. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
int	TokenNameint	
getSize	TokenNameIdentifier	 get Size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes all elements from the list. */	TokenNameCOMMENT_JAVADOC	 Removes all elements from the list. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
size	TokenNameIdentifier	 size
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current head element * @return The current 'first' element in list. */	TokenNameCOMMENT_JAVADOC	 Get the current head element @return The current 'first' element in list. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getHead	TokenNameIdentifier	 get Head
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current tail element * @return The current 'last' element in list. */	TokenNameCOMMENT_JAVADOC	 Get the current tail element @return The current 'last' element in list. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
getTail	TokenNameIdentifier	 get Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getPrev	TokenNameIdentifier	 get Prev
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Moves <tt>nde</tt> to the head of the list (equivilent to * remove(nde); add(nde); but faster. */	TokenNameCOMMENT_JAVADOC	 Moves <tt>nde</tt> to the head of the list (equivilent to remove(nde); add(nde); but faster. 
public	TokenNamepublic	
void	TokenNamevoid	
touch	TokenNameIdentifier	 touch
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
nde	TokenNameIdentifier	 nde
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// This makes it the first element in the list. 	TokenNameCOMMENT_LINE	This makes it the first element in the list. 
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
nde	TokenNameIdentifier	 nde
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
==	TokenNameEQUAL_EQUAL	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Because the list is circular this 	TokenNameCOMMENT_LINE	Because the list is circular this 
// makes it the last element in the list. 	TokenNameCOMMENT_LINE	makes it the last element in the list. 
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
after	TokenNameIdentifier	 after
=	TokenNameEQUAL	
after	TokenNameIdentifier	 after
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
index	TokenNameIdentifier	 index
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
after	TokenNameIdentifier	 after
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds <tt>nde</tt> to the head of the list. * In perl this is called an 'unpop'. <tt>nde</tt> should * not currently be part of any list. * @param nde the node to add to the list. */	TokenNameCOMMENT_JAVADOC	 Adds <tt>nde</tt> to the head of the list. In perl this is called an 'unpop'. <tt>nde</tt> should not currently be part of any list. @param nde the node to add to the list. 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
nde	TokenNameIdentifier	 nde
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes nde from the list it is part of (should be this * one, otherwise results are undefined). If nde is the * current head element, then the next element becomes head, * if there are no more elements the list becomes empty. * @param nde node to remove. */	TokenNameCOMMENT_JAVADOC	 Removes nde from the list it is part of (should be this one, otherwise results are undefined). If nde is the current head element, then the next element becomes head, if there are no more elements the list becomes empty. @param nde node to remove. 
public	TokenNamepublic	
void	TokenNamevoid	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// Last node... 	TokenNameCOMMENT_LINE	Last node... 
else	TokenNameelse	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
.	TokenNameDOT	
getNext	TokenNameIdentifier	 get Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
unlink	TokenNameIdentifier	 unlink
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes 'head' from list and returns it. Returns null if list is empty. * @return current head element, next element becomes head. */	TokenNameCOMMENT_JAVADOC	 Removes 'head' from list and returns it. Returns null if list is empty. @return current head element, next element becomes head. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
head	TokenNameIdentifier	 head
;	TokenNameSEMICOLON	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nde	TokenNameIdentifier	 nde
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Removes 'tail' from list and returns it. Returns null if list is empty. * @return current tail element. */	TokenNameCOMMENT_JAVADOC	 Removes 'tail' from list and returns it. Returns null if list is empty. @return current tail element. 
public	TokenNamepublic	
Node	TokenNameIdentifier	 Node
unpush	TokenNameIdentifier	 unpush
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
=	TokenNameEQUAL	
getTail	TokenNameIdentifier	 get Tail
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nde	TokenNameIdentifier	 nde
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds <tt>nde</tt> to tail of list */	TokenNameCOMMENT_JAVADOC	 Adds <tt>nde</tt> to tail of list 
public	TokenNamepublic	
void	TokenNamevoid	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
nde	TokenNameIdentifier	 nde
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds <tt>nde</tt> to head of list */	TokenNameCOMMENT_JAVADOC	 Adds <tt>nde</tt> to head of list 
public	TokenNamepublic	
void	TokenNamevoid	
unpop	TokenNameIdentifier	 unpop
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
nde	TokenNameIdentifier	 nde
)	TokenNameRPAREN	
{	TokenNameLBRACE	
nde	TokenNameIdentifier	 nde
.	TokenNameDOT	
insertBefore	TokenNameIdentifier	 insert Before
(	TokenNameLPAREN	
head	TokenNameIdentifier	 head
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
head	TokenNameIdentifier	 head
=	TokenNameEQUAL	
nde	TokenNameIdentifier	 nde
;	TokenNameSEMICOLON	
size	TokenNameIdentifier	 size
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
