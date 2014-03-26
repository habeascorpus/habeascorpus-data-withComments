package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
collections	TokenNameIdentifier	 collections
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
junit	TokenNameIdentifier	 junit
.	TokenNameDOT	
Test	TokenNameIdentifier	 Test
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
collections	TokenNameIdentifier	 collections
.	TokenNameDOT	
LRUHashMap	TokenNameIdentifier	 LRU Hash Map
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
public	TokenNamepublic	
class	TokenNameclass	
TestLRUHashMap	TokenNameIdentifier	 Test LRU Hash Map
extends	TokenNameextends	
LuceneTestCase	TokenNameIdentifier	 Lucene Test Case
{	TokenNameLBRACE	
// testLRU() tests that the specified size limit is indeed honored, and 	TokenNameCOMMENT_LINE	testLRU() tests that the specified size limit is indeed honored, and 
// the remaining objects in the map are indeed those that have been most 	TokenNameCOMMENT_LINE	the remaining objects in the map are indeed those that have been most 
// recently used 	TokenNameCOMMENT_LINE	recently used 
@	TokenNameAT	
Test	TokenNameIdentifier	 Test
public	TokenNamepublic	
void	TokenNamevoid	
testLRU	TokenNameIdentifier	 test LRU
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
LRUHashMap	TokenNameIdentifier	 LRU Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
lru	TokenNameIdentifier	 lru
=	TokenNameEQUAL	
new	TokenNamenew	
LRUHashMap	TokenNameIdentifier	 LRU Hash Map
<	TokenNameLESS	
String	TokenNameIdentifier	 String
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
>	TokenNameGREATER	
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
,	TokenNameCOMMA	
"Hello world"	TokenNameStringLiteral	Hello world
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
,	TokenNameCOMMA	
"Hi man"	TokenNameStringLiteral	Hi man
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
,	TokenNameCOMMA	
"Bonjour"	TokenNameStringLiteral	Bonjour
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
,	TokenNameCOMMA	
"Shalom"	TokenNameStringLiteral	Shalom
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"five"	TokenNameStringLiteral	five
,	TokenNameCOMMA	
"Yo!"	TokenNameStringLiteral	Yo!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// three was last used, so it got removed 	TokenNameCOMMENT_LINE	three was last used, so it got removed 
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"five"	TokenNameStringLiteral	five
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"six"	TokenNameStringLiteral	six
,	TokenNameCOMMA	
"hi"	TokenNameStringLiteral	hi
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
"seven"	TokenNameStringLiteral	seven
,	TokenNameCOMMA	
"hey dude"	TokenNameStringLiteral	hey dude
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertEquals	TokenNameIdentifier	 assert Equals
(	TokenNameLPAREN	
3	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"one"	TokenNameStringLiteral	one
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"two"	TokenNameStringLiteral	two
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"three"	TokenNameStringLiteral	three
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"four"	TokenNameStringLiteral	four
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNull	TokenNameIdentifier	 assert Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"five"	TokenNameStringLiteral	five
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"six"	TokenNameStringLiteral	six
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assertNotNull	TokenNameIdentifier	 assert Not Null
(	TokenNameLPAREN	
lru	TokenNameIdentifier	 lru
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
"seven"	TokenNameStringLiteral	seven
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
