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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
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
tools	TokenNameIdentifier	 tools
.	TokenNameDOT	
ant	TokenNameIdentifier	 ant
.	TokenNameDOT	
Project	TokenNameIdentifier	 Project
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
/** * ResourceCollection representing the union of multiple nested ResourceCollections. * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 ResourceCollection representing the union of multiple nested ResourceCollections. @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Union	TokenNameIdentifier	 Union
extends	TokenNameextends	
BaseResourceCollectionContainer	TokenNameIdentifier	 Base Resource Collection Container
{	TokenNameLBRACE	
/** * Static convenience method to union an arbitrary set of Resources. * @param rc a ResourceCollection. * @return a Union. */	TokenNameCOMMENT_JAVADOC	 Static convenience method to union an arbitrary set of Resources. @param rc a ResourceCollection. @return a Union. 
public	TokenNamepublic	
static	TokenNamestatic	
Union	TokenNameIdentifier	 Union
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
rc	TokenNameIdentifier	 rc
instanceof	TokenNameinstanceof	
Union	TokenNameIdentifier	 Union
?	TokenNameQUESTION	
(	TokenNameLPAREN	
Union	TokenNameIdentifier	 Union
)	TokenNameRPAREN	
rc	TokenNameIdentifier	 rc
:	TokenNameCOLON	
new	TokenNamenew	
Union	TokenNameIdentifier	 Union
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
Union	TokenNameIdentifier	 Union
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create a new Union. * @param project owning Project */	TokenNameCOMMENT_JAVADOC	 Create a new Union. @param project owning Project 
public	TokenNamepublic	
Union	TokenNameIdentifier	 Union
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience constructor. * @param rc the ResourceCollection to add. */	TokenNameCOMMENT_JAVADOC	 Convenience constructor. @param rc the ResourceCollection to add. 
public	TokenNamepublic	
Union	TokenNameIdentifier	 Union
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
.	TokenNameDOT	
getProject	TokenNameIdentifier	 get Project
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
,	TokenNameCOMMA	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience constructor. * @param project owning Project * @param rc the ResourceCollection to add. */	TokenNameCOMMENT_JAVADOC	 Convenience constructor. @param project owning Project @param rc the ResourceCollection to add. 
public	TokenNamepublic	
Union	TokenNameIdentifier	 Union
(	TokenNameLPAREN	
Project	TokenNameIdentifier	 Project
project	TokenNameIdentifier	 project
,	TokenNameCOMMA	
ResourceCollection	TokenNameIdentifier	 Resource Collection
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
project	TokenNameIdentifier	 project
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns all Resources in String format. Provided for * convenience in implementing Path. * @return String array of Resources. */	TokenNameCOMMENT_JAVADOC	 Returns all Resources in String format. Provided for convenience in implementing Path. @return String array of Resources. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Union	TokenNameIdentifier	 Union
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
list	TokenNameIdentifier	 list
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collection	TokenNameIdentifier	 Collection
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getCollection	TokenNameIdentifier	 get Collection
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Convenience method. * @return Resource[] */	TokenNameCOMMENT_JAVADOC	 Convenience method. @return Resource[] 
public	TokenNamepublic	
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
listResources	TokenNameIdentifier	 list Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Union	TokenNameIdentifier	 Union
)	TokenNameRPAREN	
getCheckedRef	TokenNameIdentifier	 get Checked Ref
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
listResources	TokenNameIdentifier	 list Resources
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Collection	TokenNameIdentifier	 Collection
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
getCollection	TokenNameIdentifier	 get Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
(	TokenNameLPAREN	
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
new	TokenNamenew	
Resource	TokenNameIdentifier	 Resource
[	TokenNameLBRACKET	
result	TokenNameIdentifier	 result
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Unify the contained Resources. * @return a Collection of Resources. */	TokenNameCOMMENT_JAVADOC	 Unify the contained Resources. @return a Collection of Resources. 
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
getCollection	TokenNameIdentifier	 get Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getCollection	TokenNameIdentifier	 get Collection
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Unify the contained Resources. * @param asString indicates whether the resulting Collection * should contain Strings instead of Resources. * @return a Collection of Resources. */	TokenNameCOMMENT_JAVADOC	 Unify the contained Resources. @param asString indicates whether the resulting Collection should contain Strings instead of Resources. @return a Collection of Resources. 
protected	TokenNameprotected	
Collection	TokenNameIdentifier	 Collection
getCollection	TokenNameIdentifier	 get Collection
(	TokenNameLPAREN	
boolean	TokenNameboolean	
asString	TokenNameIdentifier	 as String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
getResourceCollections	TokenNameIdentifier	 get Resource Collections
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_LIST	TokenNameIdentifier	 EMPTY  LIST
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
set	TokenNameIdentifier	 set
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashSet	TokenNameIdentifier	 Linked Hash Set
(	TokenNameLPAREN	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
*	TokenNameMULTIPLY	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
rcIter	TokenNameIdentifier	 rc Iter
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rcIter	TokenNameIdentifier	 rc Iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
nextRC	TokenNameIdentifier	 next RC
(	TokenNameLPAREN	
rcIter	TokenNameIdentifier	 rc Iter
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
r	TokenNameIdentifier	 r
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
asString	TokenNameIdentifier	 as String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
o	TokenNameIdentifier	 o
=	TokenNameEQUAL	
o	TokenNameIdentifier	 o
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
set	TokenNameIdentifier	 set
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
set	TokenNameIdentifier	 set
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
ResourceCollection	TokenNameIdentifier	 Resource Collection
nextRC	TokenNameIdentifier	 next RC
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
ResourceCollection	TokenNameIdentifier	 Resource Collection
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
