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
util	TokenNameIdentifier	 util
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
Collection	TokenNameIdentifier	 Collection
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
Dictionary	TokenNameIdentifier	 Dictionary
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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Vector	TokenNameIdentifier	 Vector
;	TokenNameSEMICOLON	
// CheckStyle:HideUtilityClassConstructorCheck OFF - bc 	TokenNameCOMMENT_LINE	CheckStyle:HideUtilityClassConstructorCheck OFF - bc 
/** * A set of helper methods related to collection manipulation. * * @since Ant 1.5 */	TokenNameCOMMENT_JAVADOC	 A set of helper methods related to collection manipulation. * @since Ant 1.5 
public	TokenNamepublic	
class	TokenNameclass	
CollectionUtils	TokenNameIdentifier	 Collection Utils
{	TokenNameLBRACE	
/** * Collections.emptyList() is Java5+. */	TokenNameCOMMENT_JAVADOC	 Collections.emptyList() is Java5+. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
List	TokenNameIdentifier	 List
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
=	TokenNameEQUAL	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
unmodifiableList	TokenNameIdentifier	 unmodifiable List
(	TokenNameLPAREN	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Please use Vector.equals() or List.equals(). * @param v1 the first vector. * @param v2 the second vector. * @return true if the vectors are equal. * @since Ant 1.5 * @deprecated since 1.6.x. */	TokenNameCOMMENT_JAVADOC	 Please use Vector.equals() or List.equals(). @param v1 the first vector. @param v2 the second vector. @return true if the vectors are equal. @since Ant 1.5 @deprecated since 1.6.x. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Vector	TokenNameIdentifier	 Vector
v1	TokenNameIdentifier	 v1
,	TokenNameCOMMA	
Vector	TokenNameIdentifier	 Vector
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
==	TokenNameEQUAL_EQUAL	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
v1	TokenNameIdentifier	 v1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
v2	TokenNameIdentifier	 v2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
v1	TokenNameIdentifier	 v1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
v2	TokenNameIdentifier	 v2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dictionary does not have an equals. * Please use Map.equals(). * * <p>Follows the equals contract of Java 2's Map.</p> * @param d1 the first directory. * @param d2 the second directory. * @return true if the directories are equal. * @since Ant 1.5 * @deprecated since 1.6.x. */	TokenNameCOMMENT_JAVADOC	 Dictionary does not have an equals. Please use Map.equals(). * <p>Follows the equals contract of Java 2's Map.</p> @param d1 the first directory. @param d2 the second directory. @return true if the directories are equal. @since Ant 1.5 @deprecated since 1.6.x. 
public	TokenNamepublic	
static	TokenNamestatic	
boolean	TokenNameboolean	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
Dictionary	TokenNameIdentifier	 Dictionary
d1	TokenNameIdentifier	 d1
,	TokenNameCOMMA	
Dictionary	TokenNameIdentifier	 Dictionary
d2	TokenNameIdentifier	 d2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
==	TokenNameEQUAL_EQUAL	
d2	TokenNameIdentifier	 d2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
d2	TokenNameIdentifier	 d2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
d2	TokenNameIdentifier	 d2
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Enumeration	TokenNameIdentifier	 Enumeration
e1	TokenNameIdentifier	 e1
=	TokenNameEQUAL	
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value1	TokenNameIdentifier	 value1
=	TokenNameEQUAL	
d1	TokenNameIdentifier	 d1
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
value2	TokenNameIdentifier	 value2
=	TokenNameEQUAL	
d2	TokenNameIdentifier	 d2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
value2	TokenNameIdentifier	 value2
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
value1	TokenNameIdentifier	 value1
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value2	TokenNameIdentifier	 value2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// don't need the opposite check as the Dictionaries have the 	TokenNameCOMMENT_LINE	don't need the opposite check as the Dictionaries have the 
// same size, so we've also covered all keys of d2 already. 	TokenNameCOMMENT_LINE	same size, so we've also covered all keys of d2 already. 
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Creates a comma separated list of all values held in the given * collection. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Creates a comma separated list of all values held in the given collection. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
flattenToString	TokenNameIdentifier	 flatten To String
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
first	TokenNameIdentifier	 first
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
","	TokenNameStringLiteral	,
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
first	TokenNameIdentifier	 first
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Dictionary does not know the putAll method. Please use Map.putAll(). * @param m1 the to directory. * @param m2 the from directory. * @since Ant 1.6 * @deprecated since 1.6.x. */	TokenNameCOMMENT_JAVADOC	 Dictionary does not know the putAll method. Please use Map.putAll(). @param m1 the to directory. @param m2 the from directory. @since Ant 1.6 @deprecated since 1.6.x. 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
putAll	TokenNameIdentifier	 put All
(	TokenNameLPAREN	
Dictionary	TokenNameIdentifier	 Dictionary
m1	TokenNameIdentifier	 m1
,	TokenNameCOMMA	
Dictionary	TokenNameIdentifier	 Dictionary
m2	TokenNameIdentifier	 m2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m1	TokenNameIdentifier	 m1
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
m2	TokenNameIdentifier	 m2
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * An empty enumeration. * @since Ant 1.6 */	TokenNameCOMMENT_JAVADOC	 An empty enumeration. @since Ant 1.6 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
EmptyEnumeration	TokenNameIdentifier	 Empty Enumeration
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
/** Constructor for the EmptyEnumeration */	TokenNameCOMMENT_JAVADOC	 Constructor for the EmptyEnumeration 
public	TokenNamepublic	
EmptyEnumeration	TokenNameIdentifier	 Empty Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * @return false always. */	TokenNameCOMMENT_JAVADOC	 @return false always. 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @return nothing. * @throws NoSuchElementException always. */	TokenNameCOMMENT_JAVADOC	 @return nothing. @throws NoSuchElementException always. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Append one enumeration to another. * Elements are evaluated lazily. * @param e1 the first enumeration. * @param e2 the subsequent enumeration. * @return an enumeration representing e1 followed by e2. * @since Ant 1.6.3 */	TokenNameCOMMENT_JAVADOC	 Append one enumeration to another. Elements are evaluated lazily. @param e1 the first enumeration. @param e2 the subsequent enumeration. @return an enumeration representing e1 followed by e2. @since Ant 1.6.3 
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e1	TokenNameIdentifier	 e1
,	TokenNameCOMMA	
Enumeration	TokenNameIdentifier	 Enumeration
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
CompoundEnumeration	TokenNameIdentifier	 Compound Enumeration
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adapt the specified Iterator to the Enumeration interface. * @param iter the Iterator to adapt. * @return an Enumeration. */	TokenNameCOMMENT_JAVADOC	 Adapt the specified Iterator to the Enumeration interface. @param iter the Iterator to adapt. @return an Enumeration. 
public	TokenNamepublic	
static	TokenNamestatic	
Enumeration	TokenNameIdentifier	 Enumeration
asEnumeration	TokenNameIdentifier	 as Enumeration
(	TokenNameLPAREN	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Enumeration	TokenNameIdentifier	 Enumeration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adapt the specified Enumeration to the Iterator interface. * @param e the Enumeration to adapt. * @return an Iterator. */	TokenNameCOMMENT_JAVADOC	 Adapt the specified Enumeration to the Iterator interface. @param e the Enumeration to adapt. @return an Iterator. 
public	TokenNamepublic	
static	TokenNamestatic	
Iterator	TokenNameIdentifier	 Iterator
asIterator	TokenNameIdentifier	 as Iterator
(	TokenNameLPAREN	
final	TokenNamefinal	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
Iterator	TokenNameIdentifier	 Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
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
return	TokenNamereturn	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a collection containing all elements of the iterator. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Returns a collection containing all elements of the iterator. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
Collection	TokenNameIdentifier	 Collection
asCollection	TokenNameIdentifier	 as Collection
(	TokenNameLPAREN	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
l	TokenNameIdentifier	 l
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
l	TokenNameIdentifier	 l
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
class	TokenNameclass	
CompoundEnumeration	TokenNameIdentifier	 Compound Enumeration
implements	TokenNameimplements	
Enumeration	TokenNameIdentifier	 Enumeration
{	TokenNameLBRACE	
private	TokenNameprivate	
final	TokenNamefinal	
Enumeration	TokenNameIdentifier	 Enumeration
e1	TokenNameIdentifier	 e1
,	TokenNameCOMMA	
e2	TokenNameIdentifier	 e2
;	TokenNameSEMICOLON	
public	TokenNamepublic	
CompoundEnumeration	TokenNameIdentifier	 Compound Enumeration
(	TokenNameLPAREN	
Enumeration	TokenNameIdentifier	 Enumeration
e1	TokenNameIdentifier	 e1
,	TokenNameCOMMA	
Enumeration	TokenNameIdentifier	 Enumeration
e2	TokenNameIdentifier	 e2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
e1	TokenNameIdentifier	 e1
=	TokenNameEQUAL	
e1	TokenNameIdentifier	 e1
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
e2	TokenNameIdentifier	 e2
=	TokenNameEQUAL	
e2	TokenNameIdentifier	 e2
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
boolean	TokenNameboolean	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
NoSuchElementException	TokenNameIdentifier	 No Such Element Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
e1	TokenNameIdentifier	 e1
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
e2	TokenNameIdentifier	 e2
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Counts how often the given Object occurs in the given * collection using equals() for comparison. * * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 Counts how often the given Object occurs in the given collection using equals() for comparison. * @since Ant 1.8.0 
public	TokenNamepublic	
static	TokenNamestatic	
int	TokenNameint	
frequency	TokenNameIdentifier	 frequency
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// same as Collections.frequency introduced with JDK 1.5 	TokenNameCOMMENT_LINE	same as Collections.frequency introduced with JDK 1.5 
int	TokenNameint	
freq	TokenNameIdentifier	 freq
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
test	TokenNameIdentifier	 test
=	TokenNameEQUAL	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
test	TokenNameIdentifier	 test
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
:	TokenNameCOLON	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
test	TokenNameIdentifier	 test
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
freq	TokenNameIdentifier	 freq
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
freq	TokenNameIdentifier	 freq
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
