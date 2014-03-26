/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. * */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
resources	TokenNameIdentifier	 resources
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
Arrays	TokenNameIdentifier	 Arrays
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
framework	TokenNameIdentifier	 framework
.	TokenNameDOT	
TestCase	TokenNameIdentifier	 Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
Resource	TokenNameIdentifier	 Resource
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
types	TokenNameIdentifier	 types
.	TokenNameDOT	
ResourceCollection	TokenNameIdentifier	 Resource Collection
;	TokenNameSEMICOLON	
public	TokenNamepublic	
class	TokenNameclass	
LazyResourceCollectionTest	TokenNameIdentifier	 Lazy Resource Collection Test
extends	TokenNameextends	
TestCase	TokenNameIdentifier	 Test Case
{	TokenNameLBRACE	
private	TokenNameprivate	
class	TokenNameclass	
StringResourceCollection	TokenNameIdentifier	 String Resource Collection
implements	TokenNameimplements	
ResourceCollection	TokenNameIdentifier	 Resource Collection
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
resources	TokenNameIdentifier	 resources
=	TokenNameEQUAL	
Arrays	TokenNameIdentifier	 Arrays
.	TokenNameDOT	
asList	TokenNameIdentifier	 as List
(	TokenNameLPAREN	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
createdIterators	TokenNameIdentifier	 created Iterators
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringResourceIterator	TokenNameIdentifier	 String Resource Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
new	TokenNamenew	
StringResourceIterator	TokenNameIdentifier	 String Resource Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
createdIterators	TokenNameIdentifier	 created Iterators
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
it	TokenNameIdentifier	 it
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
it	TokenNameIdentifier	 it
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
isFilesystemOnly	TokenNameIdentifier	 is Filesystem Only
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
class	TokenNameclass	
StringResourceIterator	TokenNameIdentifier	 String Resource Iterator
implements	TokenNameimplements	
Iterator	TokenNameIdentifier	 Iterator
{	TokenNameLBRACE	
int	TokenNameint	
cursor	TokenNameIdentifier	 cursor
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
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
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
cursor	TokenNameIdentifier	 cursor
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
cursor	TokenNameIdentifier	 cursor
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
new	TokenNamenew	
StringResource	TokenNameIdentifier	 String Resource
(	TokenNameLPAREN	
"r"	TokenNameStringLiteral	r
+	TokenNamePLUS	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
cursor	TokenNameIdentifier	 cursor
<	TokenNameLESS	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testLazyLoading	TokenNameIdentifier	 test Lazy Loading
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringResourceCollection	TokenNameIdentifier	 String Resource Collection
collectionTest	TokenNameIdentifier	 collection Test
=	TokenNameEQUAL	
new	TokenNamenew	
StringResourceCollection	TokenNameIdentifier	 String Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LazyResourceCollectionWrapper	TokenNameIdentifier	 Lazy Resource Collection Wrapper
lazyCollection	TokenNameIdentifier	 lazy Collection
=	TokenNameEQUAL	
new	TokenNamenew	
LazyResourceCollectionWrapper	TokenNameIdentifier	 Lazy Resource Collection Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lazyCollection	TokenNameIdentifier	 lazy Collection
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
collectionTest	TokenNameIdentifier	 collection Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
lazyCollection	TokenNameIdentifier	 lazy Collection
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOneCreatedIterator	TokenNameIdentifier	 assert One Created Iterator
(	TokenNameLPAREN	
collectionTest	TokenNameIdentifier	 collection Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringResourceIterator	TokenNameIdentifier	 String Resource Iterator
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResourceIterator	TokenNameIdentifier	 String Resource Iterator
)	TokenNameRPAREN	
collectionTest	TokenNameIdentifier	 collection Test
.	TokenNameDOT	
createdIterators	TokenNameIdentifier	 created Iterators
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A resource was loaded without iterating"	TokenNameStringLiteral	A resource was loaded without iterating
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringResource	TokenNameIdentifier	 String Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOneCreatedIterator	TokenNameIdentifier	 assert One Created Iterator
(	TokenNameLPAREN	
collectionTest	TokenNameIdentifier	 collection Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r1"	TokenNameStringLiteral	r1
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iterating once load more than 1 resource"	TokenNameStringLiteral	Iterating once load more than 1 resource
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOneCreatedIterator	TokenNameIdentifier	 assert One Created Iterator
(	TokenNameLPAREN	
collectionTest	TokenNameIdentifier	 collection Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r2"	TokenNameStringLiteral	r2
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iterating twice load more than 2 resources"	TokenNameStringLiteral	Iterating twice load more than 2 resources
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOneCreatedIterator	TokenNameIdentifier	 assert One Created Iterator
(	TokenNameLPAREN	
collectionTest	TokenNameIdentifier	 collection Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r3"	TokenNameStringLiteral	r3
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iterating 3 times load more than 3 resources"	TokenNameStringLiteral	Iterating 3 times load more than 3 resources
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"NoSuchElementException shoudl have been raised"	TokenNameStringLiteral	NoSuchElementException shoudl have been raised
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ok 	TokenNameCOMMENT_LINE	ok 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
void	TokenNamevoid	
assertOneCreatedIterator	TokenNameIdentifier	 assert One Created Iterator
(	TokenNameLPAREN	
StringResourceCollection	TokenNameIdentifier	 String Resource Collection
testCollection	TokenNameIdentifier	 test Collection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"More than one iterator has been created"	TokenNameStringLiteral	More than one iterator has been created
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
testCollection	TokenNameIdentifier	 test Collection
.	TokenNameDOT	
createdIterators	TokenNameIdentifier	 created Iterators
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
testCaching	TokenNameIdentifier	 test Caching
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
StringResourceCollection	TokenNameIdentifier	 String Resource Collection
collectionTest	TokenNameIdentifier	 collection Test
=	TokenNameEQUAL	
new	TokenNamenew	
StringResourceCollection	TokenNameIdentifier	 String Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
LazyResourceCollectionWrapper	TokenNameIdentifier	 Lazy Resource Collection Wrapper
lazyCollection	TokenNameIdentifier	 lazy Collection
=	TokenNameEQUAL	
new	TokenNamenew	
LazyResourceCollectionWrapper	TokenNameIdentifier	 Lazy Resource Collection Wrapper
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lazyCollection	TokenNameIdentifier	 lazy Collection
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
collectionTest	TokenNameIdentifier	 collection Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertTrue	TokenNameIdentifier	 assert True
(	TokenNameLPAREN	
lazyCollection	TokenNameIdentifier	 lazy Collection
.	TokenNameDOT	
isCache	TokenNameIdentifier	 is Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it1	TokenNameIdentifier	 it1
=	TokenNameEQUAL	
lazyCollection	TokenNameIdentifier	 lazy Collection
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOneCreatedIterator	TokenNameIdentifier	 assert One Created Iterator
(	TokenNameLPAREN	
collectionTest	TokenNameIdentifier	 collection Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
it2	TokenNameIdentifier	 it2
=	TokenNameEQUAL	
lazyCollection	TokenNameIdentifier	 lazy Collection
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertOneCreatedIterator	TokenNameIdentifier	 assert One Created Iterator
(	TokenNameLPAREN	
collectionTest	TokenNameIdentifier	 collection Test
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringResourceIterator	TokenNameIdentifier	 String Resource Iterator
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResourceIterator	TokenNameIdentifier	 String Resource Iterator
)	TokenNameRPAREN	
collectionTest	TokenNameIdentifier	 collection Test
.	TokenNameDOT	
createdIterators	TokenNameIdentifier	 created Iterators
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"A resource was loaded without iterating"	TokenNameStringLiteral	A resource was loaded without iterating
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringResource	TokenNameIdentifier	 String Resource
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r1"	TokenNameStringLiteral	r1
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iterating once load more than 1 resource"	TokenNameStringLiteral	Iterating once load more than 1 resource
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r1"	TokenNameStringLiteral	r1
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The second iterator did not lookup in the cache for a resource"	TokenNameStringLiteral	The second iterator did not lookup in the cache for a resource
,	TokenNameCOMMA	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r2"	TokenNameStringLiteral	r2
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iterating twice load more than 2 resources"	TokenNameStringLiteral	Iterating twice load more than 2 resources
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r2"	TokenNameStringLiteral	r2
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The first iterator did not lookup in the cache for a resource"	TokenNameStringLiteral	The first iterator did not lookup in the cache for a resource
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r3"	TokenNameStringLiteral	r3
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"Iterating 3 times load more than 3 resources"	TokenNameStringLiteral	Iterating 3 times load more than 3 resources
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
(	TokenNameLPAREN	
StringResource	TokenNameIdentifier	 String Resource
)	TokenNameRPAREN	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"r3"	TokenNameStringLiteral	r3
,	TokenNameCOMMA	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
getValue	TokenNameIdentifier	 get Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
"The first iterator did not lookup in the cache for a resource"	TokenNameStringLiteral	The first iterator did not lookup in the cache for a resource
,	TokenNameCOMMA	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
stringResourceIterator	TokenNameIdentifier	 string Resource Iterator
.	TokenNameDOT	
cursor	TokenNameIdentifier	 cursor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
it1	TokenNameIdentifier	 it1
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"NoSuchElementException should have been raised"	TokenNameStringLiteral	NoSuchElementException should have been raised
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ok 	TokenNameCOMMENT_LINE	ok 
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
it2	TokenNameIdentifier	 it2
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fail	TokenNameIdentifier	 fail
(	TokenNameLPAREN	
"NoSuchElementException should have been raised"	TokenNameStringLiteral	NoSuchElementException should have been raised
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// ok 	TokenNameCOMMENT_LINE	ok 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
