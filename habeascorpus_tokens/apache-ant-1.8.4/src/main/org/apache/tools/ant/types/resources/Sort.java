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
List	TokenNameIdentifier	 List
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Iterator	TokenNameIdentifier	 Iterator
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
BuildException	TokenNameIdentifier	 Build Exception
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
DataType	TokenNameIdentifier	 Data Type
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
ResourceComparator	TokenNameIdentifier	 Resource Comparator
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
resources	TokenNameIdentifier	 resources
.	TokenNameDOT	
comparators	TokenNameIdentifier	 comparators
.	TokenNameDOT	
DelegatedResourceComparator	TokenNameIdentifier	 Delegated Resource Comparator
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
util	TokenNameIdentifier	 util
.	TokenNameDOT	
CollectionUtils	TokenNameIdentifier	 Collection Utils
;	TokenNameSEMICOLON	
/** * ResourceCollection that sorts another ResourceCollection. * * Note that Sort must not be used in cases where the ordering of the objects * being sorted might change during the sorting process. * * @since Ant 1.7 */	TokenNameCOMMENT_JAVADOC	 ResourceCollection that sorts another ResourceCollection. * Note that Sort must not be used in cases where the ordering of the objects being sorted might change during the sorting process. * @since Ant 1.7 
public	TokenNamepublic	
class	TokenNameclass	
Sort	TokenNameIdentifier	 Sort
extends	TokenNameextends	
BaseResourceCollectionWrapper	TokenNameIdentifier	 Base Resource Collection Wrapper
{	TokenNameLBRACE	
private	TokenNameprivate	
DelegatedResourceComparator	TokenNameIdentifier	 Delegated Resource Comparator
comp	TokenNameIdentifier	 comp
=	TokenNameEQUAL	
new	TokenNamenew	
DelegatedResourceComparator	TokenNameIdentifier	 Delegated Resource Comparator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Sort the contained elements. * @return a Collection of Resources. */	TokenNameCOMMENT_JAVADOC	 Sort the contained elements. @return a Collection of Resources. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
Collection	TokenNameIdentifier	 Collection
getCollection	TokenNameIdentifier	 get Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ResourceCollection	TokenNameIdentifier	 Resource Collection
rc	TokenNameIdentifier	 rc
=	TokenNameEQUAL	
getResourceCollection	TokenNameIdentifier	 get Resource Collection
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
rc	TokenNameIdentifier	 rc
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
EMPTY_SET	TokenNameIdentifier	 EMPTY  SET
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
)	TokenNameRPAREN	
CollectionUtils	TokenNameIdentifier	 Collection Utils
.	TokenNameDOT	
asCollection	TokenNameIdentifier	 as Collection
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Collections	TokenNameIdentifier	 Collections
.	TokenNameDOT	
sort	TokenNameIdentifier	 sort
(	TokenNameLPAREN	
result	TokenNameIdentifier	 result
,	TokenNameCOMMA	
comp	TokenNameIdentifier	 comp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
result	TokenNameIdentifier	 result
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Add a ResourceComparator to this Sort ResourceCollection. * If multiple ResourceComparators are added, they will be processed in LIFO order. * @param c the ResourceComparator to add. */	TokenNameCOMMENT_JAVADOC	 Add a ResourceComparator to this Sort ResourceCollection. If multiple ResourceComparators are added, they will be processed in LIFO order. @param c the ResourceComparator to add. 
public	TokenNamepublic	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
ResourceComparator	TokenNameIdentifier	 Resource Comparator
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
noChildrenAllowed	TokenNameIdentifier	 no Children Allowed
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
comp	TokenNameIdentifier	 comp
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
FailFast	TokenNameIdentifier	 Fail Fast
.	TokenNameDOT	
invalidate	TokenNameIdentifier	 invalidate
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Overrides the BaseResourceCollectionContainer version * to recurse on nested ResourceComparators. * @param stk the stack of data types to use (recursively). * @param p the project to use to dereference the references. * @throws BuildException on error. */	TokenNameCOMMENT_JAVADOC	 Overrides the BaseResourceCollectionContainer version to recurse on nested ResourceComparators. @param stk the stack of data types to use (recursively). @param p the project to use to dereference the references. @throws BuildException on error. 
protected	TokenNameprotected	
synchronized	TokenNamesynchronized	
void	TokenNamevoid	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
Project	TokenNameIdentifier	 Project
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
throws	TokenNamethrows	
BuildException	TokenNameIdentifier	 Build Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isChecked	TokenNameIdentifier	 is Checked
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// check nested collection 	TokenNameCOMMENT_LINE	check nested collection 
super	TokenNamesuper	
.	TokenNameDOT	
dieOnCircularReference	TokenNameIdentifier	 die On Circular Reference
(	TokenNameLPAREN	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isReference	TokenNameIdentifier	 is Reference
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
DataType	TokenNameIdentifier	 Data Type
.	TokenNameDOT	
pushAndInvokeCircularReferenceCheck	TokenNameIdentifier	 push And Invoke Circular Reference Check
(	TokenNameLPAREN	
comp	TokenNameIdentifier	 comp
,	TokenNameCOMMA	
stk	TokenNameIdentifier	 stk
,	TokenNameCOMMA	
p	TokenNameIdentifier	 p
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setChecked	TokenNameIdentifier	 set Checked
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
