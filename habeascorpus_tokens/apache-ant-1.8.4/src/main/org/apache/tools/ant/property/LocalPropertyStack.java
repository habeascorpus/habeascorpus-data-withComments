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
property	TokenNameIdentifier	 property
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedList	TokenNameIdentifier	 Linked List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
HashMap	TokenNameIdentifier	 Hash Map
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
Map	TokenNameIdentifier	 Map
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
PropertyHelper	TokenNameIdentifier	 Property Helper
;	TokenNameSEMICOLON	
/** * A stack of local property maps. * There is a map for each scope (target, sequential, macro). * @since Ant 1.8.0 */	TokenNameCOMMENT_JAVADOC	 A stack of local property maps. There is a map for each scope (target, sequential, macro). @since Ant 1.8.0 
public	TokenNamepublic	
class	TokenNameclass	
LocalPropertyStack	TokenNameIdentifier	 Local Property Stack
{	TokenNameLBRACE	
private	TokenNameprivate	
LinkedList	TokenNameIdentifier	 Linked List
stack	TokenNameIdentifier	 stack
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// Local property adding and scoping 	TokenNameCOMMENT_LINE	Local property adding and scoping 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
/** * Add a local property. * @param property the name of the local proeprty. */	TokenNameCOMMENT_JAVADOC	 Add a local property. @param property the name of the local proeprty. 
public	TokenNamepublic	
void	TokenNamevoid	
addLocal	TokenNameIdentifier	 add Local
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
getFirst	TokenNameIdentifier	 get First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
NullReturn	TokenNameIdentifier	 Null Return
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Enter the local scope. */	TokenNameCOMMENT_JAVADOC	 Enter the local scope. 
public	TokenNamepublic	
void	TokenNamevoid	
enterScope	TokenNameIdentifier	 enter Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
addFirst	TokenNameIdentifier	 add First
(	TokenNameLPAREN	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Exit the local scope. */	TokenNameCOMMENT_JAVADOC	 Exit the local scope. 
public	TokenNamepublic	
void	TokenNamevoid	
exitScope	TokenNameIdentifier	 exit Scope
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
HashMap	TokenNameIdentifier	 Hash Map
)	TokenNameRPAREN	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
removeFirst	TokenNameIdentifier	 remove First
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// Copy - used in parallel to make a new stack 	TokenNameCOMMENT_LINE	Copy - used in parallel to make a new stack 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
/** * Copy the stack for a parallel thread. * @return a copy. */	TokenNameCOMMENT_JAVADOC	 Copy the stack for a parallel thread. @return a copy. 
public	TokenNamepublic	
LocalPropertyStack	TokenNameIdentifier	 Local Property Stack
copy	TokenNameIdentifier	 copy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
LocalPropertyStack	TokenNameIdentifier	 Local Property Stack
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
new	TokenNamenew	
LocalPropertyStack	TokenNameIdentifier	 Local Property Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ret	TokenNameIdentifier	 ret
.	TokenNameDOT	
stack	TokenNameIdentifier	 stack
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
stack	TokenNameIdentifier	 stack
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
// 	TokenNameCOMMENT_LINE	 
// PropertyHelper delegate methods 	TokenNameCOMMENT_LINE	PropertyHelper delegate methods 
// 	TokenNameCOMMENT_LINE	 
// -------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------- 
/** * Evaluate a property. * @param property the property's String "identifier". * @param helper the invoking PropertyHelper. * @return Object value. */	TokenNameCOMMENT_JAVADOC	 Evaluate a property. @param property the property's String "identifier". @param helper the invoking PropertyHelper. @return Object value. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
evaluate	TokenNameIdentifier	 evaluate
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
helper	TokenNameIdentifier	 helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
stack	TokenNameIdentifier	 stack
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
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
ret	TokenNameIdentifier	 ret
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ret	TokenNameIdentifier	 ret
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
ret	TokenNameIdentifier	 ret
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a *new" property. * @param property the property's String "identifier". * @param value the value to set. * @param propertyHelper the invoking PropertyHelper. * @return true if this entity 'owns' the property. */	TokenNameCOMMENT_JAVADOC	 Set a *new" property. @param property the property's String "identifier". @param value the value to set. @param propertyHelper the invoking PropertyHelper. @return true if this entity 'owns' the property. 
public	TokenNamepublic	
boolean	TokenNameboolean	
setNew	TokenNameIdentifier	 set New
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
getMapForProperty	TokenNameIdentifier	 get Map For Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Object	TokenNameIdentifier	 Object
currValue	TokenNameIdentifier	 curr Value
=	TokenNameEQUAL	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currValue	TokenNameIdentifier	 curr Value
==	TokenNameEQUAL_EQUAL	
NullReturn	TokenNameIdentifier	 Null Return
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a property. * @param property the property's String "identifier". * @param value the value to set. * @param propertyHelper the invoking PropertyHelper. * @return true if this entity 'owns' the property. */	TokenNameCOMMENT_JAVADOC	 Set a property. @param property the property's String "identifier". @param value the value to set. @param propertyHelper the invoking PropertyHelper. @return true if this entity 'owns' the property. 
public	TokenNamepublic	
boolean	TokenNameboolean	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
PropertyHelper	TokenNameIdentifier	 Property Helper
propertyHelper	TokenNameIdentifier	 property Helper
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
getMapForProperty	TokenNameIdentifier	 get Map For Property
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
Map	TokenNameIdentifier	 Map
getMapForProperty	TokenNameIdentifier	 get Map For Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
stack	TokenNameIdentifier	 stack
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
Map	TokenNameIdentifier	 Map
map	TokenNameIdentifier	 map
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Map	TokenNameIdentifier	 Map
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
map	TokenNameIdentifier	 map
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
property	TokenNameIdentifier	 property
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
map	TokenNameIdentifier	 map
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
