package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
project	TokenNameIdentifier	 project
;	TokenNameSEMICOLON	
/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, * software distributed under the License is distributed on an * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY * KIND, either express or implied. See the License for the * specific language governing permissions and limitations * under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Iterator	TokenNameIdentifier	 Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
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
Map	TokenNameIdentifier	 Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TreeMap	TokenNameIdentifier	 Tree Map
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Dependency	TokenNameIdentifier	 Dependency
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Plugin	TokenNameIdentifier	 Plugin
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
PluginContainer	TokenNameIdentifier	 Plugin Container
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
PluginExecution	TokenNameIdentifier	 Plugin Execution
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
maven	TokenNameIdentifier	 maven
.	TokenNameDOT	
model	TokenNameIdentifier	 model
.	TokenNameDOT	
Repository	TokenNameIdentifier	 Repository
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
codehaus	TokenNameIdentifier	 codehaus
.	TokenNameDOT	
plexus	TokenNameIdentifier	 plexus
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
;	TokenNameSEMICOLON	
/** @deprecated */	TokenNameCOMMENT_JAVADOC	 @deprecated 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
final	TokenNamefinal	
class	TokenNameclass	
ModelUtils	TokenNameIdentifier	 Model Utils
{	TokenNameLBRACE	
/** * This should be the resulting ordering of plugins after merging: * <p/> * Given: * <p/> * parent: X -> A -> B -> D -> E * child: Y -> A -> C -> D -> F * <p/> * Result: * <p/> * X -> Y -> A -> B -> C -> D -> E -> F */	TokenNameCOMMENT_JAVADOC	 This should be the resulting ordering of plugins after merging: <p/> Given: <p/> parent: X -> A -> B -> D -> E child: Y -> A -> C -> D -> F <p/> Result: <p/> X -> Y -> A -> B -> C -> D -> E -> F 
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
mergePluginLists	TokenNameIdentifier	 merge Plugin Lists
(	TokenNameLPAREN	
PluginContainer	TokenNameIdentifier	 Plugin Container
childContainer	TokenNameIdentifier	 child Container
,	TokenNameCOMMA	
PluginContainer	TokenNameIdentifier	 Plugin Container
parentContainer	TokenNameIdentifier	 parent Container
,	TokenNameCOMMA	
boolean	TokenNameboolean	
handleAsInheritance	TokenNameIdentifier	 handle As Inheritance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
childContainer	TokenNameIdentifier	 child Container
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
parentContainer	TokenNameIdentifier	 parent Container
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing to do. 	TokenNameCOMMENT_LINE	nothing to do. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
parentPlugins	TokenNameIdentifier	 parent Plugins
=	TokenNameEQUAL	
parentContainer	TokenNameIdentifier	 parent Container
.	TokenNameDOT	
getPlugins	TokenNameIdentifier	 get Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
parentPlugins	TokenNameIdentifier	 parent Plugins
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
parentPlugins	TokenNameIdentifier	 parent Plugins
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentPlugins	TokenNameIdentifier	 parent Plugins
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
parentPlugins	TokenNameIdentifier	 parent Plugins
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we're processing this merge as an inheritance, we have to build up a list of 	TokenNameCOMMENT_LINE	If we're processing this merge as an inheritance, we have to build up a list of 
// plugins that were considered for inheritance. 	TokenNameCOMMENT_LINE	plugins that were considered for inheritance. 
if	TokenNameif	
(	TokenNameLPAREN	
handleAsInheritance	TokenNameIdentifier	 handle As Inheritance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
parentPlugins	TokenNameIdentifier	 parent Plugins
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
plugin	TokenNameIdentifier	 plugin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
inherited	TokenNameIdentifier	 inherited
=	TokenNameEQUAL	
plugin	TokenNameIdentifier	 plugin
.	TokenNameDOT	
getInherited	TokenNameIdentifier	 get Inherited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inherited	TokenNameIdentifier	 inherited
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
inherited	TokenNameIdentifier	 inherited
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
assembledPlugins	TokenNameIdentifier	 assembled Plugins
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
childPlugins	TokenNameIdentifier	 child Plugins
=	TokenNameEQUAL	
childContainer	TokenNameIdentifier	 child Container
.	TokenNameDOT	
getPluginsAsMap	TokenNameIdentifier	 get Plugins As Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
parentPlugins	TokenNameIdentifier	 parent Plugins
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
parentPlugin	TokenNameIdentifier	 parent Plugin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
parentInherited	TokenNameIdentifier	 parent Inherited
=	TokenNameEQUAL	
parentPlugin	TokenNameIdentifier	 parent Plugin
.	TokenNameDOT	
getInherited	TokenNameIdentifier	 get Inherited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// only merge plugin definition from the parent if at least one 	TokenNameCOMMENT_LINE	only merge plugin definition from the parent if at least one 
// of these is true: 	TokenNameCOMMENT_LINE	of these is true: 
// 1. we're not processing the plugins in an inheritance-based merge 	TokenNameCOMMENT_LINE	1. we're not processing the plugins in an inheritance-based merge 
// 2. the parent's <inherited/> flag is not set 	TokenNameCOMMENT_LINE	2. the parent's <inherited/> flag is not set 
// 3. the parent's <inherited/> flag is set to true 	TokenNameCOMMENT_LINE	3. the parent's <inherited/> flag is set to true 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
handleAsInheritance	TokenNameIdentifier	 handle As Inheritance
||	TokenNameOR_OR	
(	TokenNameLPAREN	
parentInherited	TokenNameIdentifier	 parent Inherited
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
parentInherited	TokenNameIdentifier	 parent Inherited
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
childPlugin	TokenNameIdentifier	 child Plugin
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
)	TokenNameRPAREN	
childPlugins	TokenNameIdentifier	 child Plugins
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parentPlugin	TokenNameIdentifier	 parent Plugin
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
childPlugin	TokenNameIdentifier	 child Plugin
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
assembledPlugins	TokenNameIdentifier	 assembled Plugins
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
childPlugin	TokenNameIdentifier	 child Plugin
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Plugin	TokenNameIdentifier	 Plugin
assembledPlugin	TokenNameIdentifier	 assembled Plugin
=	TokenNameEQUAL	
childPlugin	TokenNameIdentifier	 child Plugin
;	TokenNameSEMICOLON	
mergePluginDefinitions	TokenNameIdentifier	 merge Plugin Definitions
(	TokenNameLPAREN	
childPlugin	TokenNameIdentifier	 child Plugin
,	TokenNameCOMMA	
parentPlugin	TokenNameIdentifier	 parent Plugin
,	TokenNameCOMMA	
handleAsInheritance	TokenNameIdentifier	 handle As Inheritance
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// fix for MNG-2221 (assembly cache was not being populated for later reference): 	TokenNameCOMMENT_LINE	fix for MNG-2221 (assembly cache was not being populated for later reference): 
assembledPlugins	TokenNameIdentifier	 assembled Plugins
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
assembledPlugin	TokenNameIdentifier	 assembled Plugin
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// if we're processing this as an inheritance-based merge, and 	TokenNameCOMMENT_LINE	if we're processing this as an inheritance-based merge, and 
// the parent's <inherited/> flag is not set, then we need to 	TokenNameCOMMENT_LINE	the parent's <inherited/> flag is not set, then we need to 
// clear the inherited flag in the merge result. 	TokenNameCOMMENT_LINE	clear the inherited flag in the merge result. 
if	TokenNameif	
(	TokenNameLPAREN	
handleAsInheritance	TokenNameIdentifier	 handle As Inheritance
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
parentInherited	TokenNameIdentifier	 parent Inherited
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentPlugin	TokenNameIdentifier	 parent Plugin
.	TokenNameDOT	
unsetInheritanceApplied	TokenNameIdentifier	 unset Inheritance Applied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// very important to use the parentPlugins List, rather than parentContainer.getPlugins() 	TokenNameCOMMENT_LINE	very important to use the parentPlugins List, rather than parentContainer.getPlugins() 
// since this list is a local one, and may have been modified during processing. 	TokenNameCOMMENT_LINE	since this list is a local one, and may have been modified during processing. 
List	TokenNameIdentifier	 List
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
ModelUtils	TokenNameIdentifier	 Model Utils
.	TokenNameDOT	
orderAfterMerge	TokenNameIdentifier	 order After Merge
(	TokenNameLPAREN	
assembledPlugins	TokenNameIdentifier	 assembled Plugins
,	TokenNameCOMMA	
parentPlugins	TokenNameIdentifier	 parent Plugins
,	TokenNameCOMMA	
childContainer	TokenNameIdentifier	 child Container
.	TokenNameDOT	
getPlugins	TokenNameIdentifier	 get Plugins
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childContainer	TokenNameIdentifier	 child Container
.	TokenNameDOT	
setPlugins	TokenNameIdentifier	 set Plugins
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childContainer	TokenNameIdentifier	 child Container
.	TokenNameDOT	
flushPluginMap	TokenNameIdentifier	 flush Plugin Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
orderAfterMerge	TokenNameIdentifier	 order After Merge
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
merged	TokenNameIdentifier	 merged
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
highPrioritySource	TokenNameIdentifier	 high Priority Source
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
lowPrioritySource	TokenNameIdentifier	 low Priority Source
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
results	TokenNameIdentifier	 results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
merged	TokenNameIdentifier	 merged
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
merged	TokenNameIdentifier	 merged
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
missingFromResults	TokenNameIdentifier	 missing From Results
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
sources	TokenNameIdentifier	 sources
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
highPrioritySource	TokenNameIdentifier	 high Priority Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
lowPrioritySource	TokenNameIdentifier	 low Priority Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
sourceIterator	TokenNameIdentifier	 source Iterator
=	TokenNameEQUAL	
sources	TokenNameIdentifier	 sources
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sourceIterator	TokenNameIdentifier	 source Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
)	TokenNameRPAREN	
sourceIterator	TokenNameIdentifier	 source Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
item	TokenNameIdentifier	 item
=	TokenNameEQUAL	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
missingFromResults	TokenNameIdentifier	 missing From Results
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
idx	TokenNameIdentifier	 idx
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
idx	TokenNameIdentifier	 idx
,	TokenNameCOMMA	
missingFromResults	TokenNameIdentifier	 missing From Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
missingFromResults	TokenNameIdentifier	 missing From Results
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
missingFromResults	TokenNameIdentifier	 missing From Results
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
item	TokenNameIdentifier	 item
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
missingFromResults	TokenNameIdentifier	 missing From Results
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
results	TokenNameIdentifier	 results
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
missingFromResults	TokenNameIdentifier	 missing From Results
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
missingFromResults	TokenNameIdentifier	 missing From Results
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
results	TokenNameIdentifier	 results
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
mergePluginDefinitions	TokenNameIdentifier	 merge Plugin Definitions
(	TokenNameLPAREN	
Plugin	TokenNameIdentifier	 Plugin
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
Plugin	TokenNameIdentifier	 Plugin
parent	TokenNameIdentifier	 parent
,	TokenNameCOMMA	
boolean	TokenNameboolean	
handleAsInheritance	TokenNameIdentifier	 handle As Inheritance
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// nothing to do. 	TokenNameCOMMENT_LINE	nothing to do. 
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
isExtensions	TokenNameIdentifier	 is Extensions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setExtensions	TokenNameIdentifier	 set Extensions
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setVersion	TokenNameIdentifier	 set Version
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getVersion	TokenNameIdentifier	 get Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
childConfiguration	TokenNameIdentifier	 child Configuration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
parentConfiguration	TokenNameIdentifier	 parent Configuration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childConfiguration	TokenNameIdentifier	 child Configuration
=	TokenNameEQUAL	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
.	TokenNameDOT	
mergeXpp3Dom	TokenNameIdentifier	 merge Xpp3 Dom
(	TokenNameLPAREN	
childConfiguration	TokenNameIdentifier	 child Configuration
,	TokenNameCOMMA	
parentConfiguration	TokenNameIdentifier	 parent Configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
childConfiguration	TokenNameIdentifier	 child Configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setDependencies	TokenNameIdentifier	 set Dependencies
(	TokenNameLPAREN	
mergeDependencyList	TokenNameIdentifier	 merge Dependency List
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getDependencies	TokenNameIdentifier	 get Dependencies
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// from here to the end of the method is dealing with merging of the <executions/> section. 	TokenNameCOMMENT_LINE	from here to the end of the method is dealing with merging of the <executions/> section. 
String	TokenNameIdentifier	 String
parentInherited	TokenNameIdentifier	 parent Inherited
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getInherited	TokenNameIdentifier	 get Inherited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
parentIsInherited	TokenNameIdentifier	 parent Is Inherited
=	TokenNameEQUAL	
(	TokenNameLPAREN	
parentInherited	TokenNameIdentifier	 parent Inherited
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
parentInherited	TokenNameIdentifier	 parent Inherited
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
parentExecutions	TokenNameIdentifier	 parent Executions
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getExecutions	TokenNameIdentifier	 get Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
parentExecutions	TokenNameIdentifier	 parent Executions
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
parentExecutions	TokenNameIdentifier	 parent Executions
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
mergedExecutions	TokenNameIdentifier	 merged Executions
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
assembledExecutions	TokenNameIdentifier	 assembled Executions
=	TokenNameEQUAL	
new	TokenNamenew	
TreeMap	TokenNameIdentifier	 Tree Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Map	TokenNameIdentifier	 Map
childExecutions	TokenNameIdentifier	 child Executions
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getExecutionsAsMap	TokenNameIdentifier	 get Executions As Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
parentExecutions	TokenNameIdentifier	 parent Executions
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PluginExecution	TokenNameIdentifier	 Plugin Execution
parentExecution	TokenNameIdentifier	 parent Execution
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PluginExecution	TokenNameIdentifier	 Plugin Execution
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
inherited	TokenNameIdentifier	 inherited
=	TokenNameEQUAL	
parentExecution	TokenNameIdentifier	 parent Execution
.	TokenNameDOT	
getInherited	TokenNameIdentifier	 get Inherited
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
parentExecInherited	TokenNameIdentifier	 parent Exec Inherited
=	TokenNameEQUAL	
parentIsInherited	TokenNameIdentifier	 parent Is Inherited
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
inherited	TokenNameIdentifier	 inherited
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
Boolean	TokenNameIdentifier	 Boolean
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
inherited	TokenNameIdentifier	 inherited
)	TokenNameRPAREN	
.	TokenNameDOT	
booleanValue	TokenNameIdentifier	 boolean Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
handleAsInheritance	TokenNameIdentifier	 handle As Inheritance
||	TokenNameOR_OR	
parentExecInherited	TokenNameIdentifier	 parent Exec Inherited
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PluginExecution	TokenNameIdentifier	 Plugin Execution
assembled	TokenNameIdentifier	 assembled
=	TokenNameEQUAL	
parentExecution	TokenNameIdentifier	 parent Execution
;	TokenNameSEMICOLON	
PluginExecution	TokenNameIdentifier	 Plugin Execution
childExecution	TokenNameIdentifier	 child Execution
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PluginExecution	TokenNameIdentifier	 Plugin Execution
)	TokenNameRPAREN	
childExecutions	TokenNameIdentifier	 child Executions
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
parentExecution	TokenNameIdentifier	 parent Execution
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
childExecution	TokenNameIdentifier	 child Execution
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergePluginExecutionDefinitions	TokenNameIdentifier	 merge Plugin Execution Definitions
(	TokenNameLPAREN	
childExecution	TokenNameIdentifier	 child Execution
,	TokenNameCOMMA	
parentExecution	TokenNameIdentifier	 parent Execution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
assembled	TokenNameIdentifier	 assembled
=	TokenNameEQUAL	
childExecution	TokenNameIdentifier	 child Execution
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
handleAsInheritance	TokenNameIdentifier	 handle As Inheritance
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
parentInherited	TokenNameIdentifier	 parent Inherited
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
parentExecution	TokenNameIdentifier	 parent Execution
.	TokenNameDOT	
unsetInheritanceApplied	TokenNameIdentifier	 unset Inheritance Applied
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
assembledExecutions	TokenNameIdentifier	 assembled Executions
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
assembled	TokenNameIdentifier	 assembled
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
assembled	TokenNameIdentifier	 assembled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
mergedExecutions	TokenNameIdentifier	 merged Executions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
assembled	TokenNameIdentifier	 assembled
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getExecutions	TokenNameIdentifier	 get Executions
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
PluginExecution	TokenNameIdentifier	 Plugin Execution
childExecution	TokenNameIdentifier	 child Execution
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PluginExecution	TokenNameIdentifier	 Plugin Execution
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
assembledExecutions	TokenNameIdentifier	 assembled Executions
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
childExecution	TokenNameIdentifier	 child Execution
.	TokenNameDOT	
getId	TokenNameIdentifier	 get Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
mergedExecutions	TokenNameIdentifier	 merged Executions
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
childExecution	TokenNameIdentifier	 child Execution
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setExecutions	TokenNameIdentifier	 set Executions
(	TokenNameLPAREN	
mergedExecutions	TokenNameIdentifier	 merged Executions
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
flushExecutionMap	TokenNameIdentifier	 flush Execution Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
void	TokenNamevoid	
mergePluginExecutionDefinitions	TokenNameIdentifier	 merge Plugin Execution Definitions
(	TokenNameLPAREN	
PluginExecution	TokenNameIdentifier	 Plugin Execution
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
PluginExecution	TokenNameIdentifier	 Plugin Execution
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setPhase	TokenNameIdentifier	 set Phase
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getPhase	TokenNameIdentifier	 get Phase
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
List	TokenNameIdentifier	 List
parentGoals	TokenNameIdentifier	 parent Goals
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getGoals	TokenNameIdentifier	 get Goals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
childGoals	TokenNameIdentifier	 child Goals
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getGoals	TokenNameIdentifier	 get Goals
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
List	TokenNameIdentifier	 List
goals	TokenNameIdentifier	 goals
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
childGoals	TokenNameIdentifier	 child Goals
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
childGoals	TokenNameIdentifier	 child Goals
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goals	TokenNameIdentifier	 goals
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
childGoals	TokenNameIdentifier	 child Goals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
parentGoals	TokenNameIdentifier	 parent Goals
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
goalIterator	TokenNameIdentifier	 goal Iterator
=	TokenNameEQUAL	
parentGoals	TokenNameIdentifier	 parent Goals
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
goalIterator	TokenNameIdentifier	 goal Iterator
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
goal	TokenNameIdentifier	 goal
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
goalIterator	TokenNameIdentifier	 goal Iterator
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
goals	TokenNameIdentifier	 goals
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
goal	TokenNameIdentifier	 goal
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
goals	TokenNameIdentifier	 goals
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
goal	TokenNameIdentifier	 goal
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setGoals	TokenNameIdentifier	 set Goals
(	TokenNameLPAREN	
goals	TokenNameIdentifier	 goals
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
childConfiguration	TokenNameIdentifier	 child Configuration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
parentConfiguration	TokenNameIdentifier	 parent Configuration
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
)	TokenNameRPAREN	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
getConfiguration	TokenNameIdentifier	 get Configuration
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
childConfiguration	TokenNameIdentifier	 child Configuration
=	TokenNameEQUAL	
Xpp3Dom	TokenNameIdentifier	 Xpp3 Dom
.	TokenNameDOT	
mergeXpp3Dom	TokenNameIdentifier	 merge Xpp3 Dom
(	TokenNameLPAREN	
childConfiguration	TokenNameIdentifier	 child Configuration
,	TokenNameCOMMA	
parentConfiguration	TokenNameIdentifier	 parent Configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
setConfiguration	TokenNameIdentifier	 set Configuration
(	TokenNameLPAREN	
childConfiguration	TokenNameIdentifier	 child Configuration
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
mergeRepositoryLists	TokenNameIdentifier	 merge Repository Lists
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
dominant	TokenNameIdentifier	 dominant
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
recessive	TokenNameIdentifier	 recessive
)	TokenNameRPAREN	
{	TokenNameLBRACE	
List	TokenNameIdentifier	 List
repositories	TokenNameIdentifier	 repositories
=	TokenNameEQUAL	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
dominant	TokenNameIdentifier	 dominant
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
repositories	TokenNameIdentifier	 repositories
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
recessive	TokenNameIdentifier	 recessive
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Repository	TokenNameIdentifier	 Repository
repository	TokenNameIdentifier	 repository
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Repository	TokenNameIdentifier	 Repository
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
repositories	TokenNameIdentifier	 repositories
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
repositories	TokenNameIdentifier	 repositories
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
repository	TokenNameIdentifier	 repository
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
repositories	TokenNameIdentifier	 repositories
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
mergeFilterLists	TokenNameIdentifier	 merge Filter Lists
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
childFilters	TokenNameIdentifier	 child Filters
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
parentFilters	TokenNameIdentifier	 parent Filters
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
parentFilters	TokenNameIdentifier	 parent Filters
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
String	TokenNameIdentifier	 String
f	TokenNameIdentifier	 f
=	TokenNameEQUAL	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
i	TokenNameIdentifier	 i
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
childFilters	TokenNameIdentifier	 child Filters
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
childFilters	TokenNameIdentifier	 child Filters
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
f	TokenNameIdentifier	 f
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
List	TokenNameIdentifier	 List
mergeDependencyList	TokenNameIdentifier	 merge Dependency List
(	TokenNameLPAREN	
List	TokenNameIdentifier	 List
child	TokenNameIdentifier	 child
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Map	TokenNameIdentifier	 Map
depsMap	TokenNameIdentifier	 deps Map
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedHashMap	TokenNameIdentifier	 Linked Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depsMap	TokenNameIdentifier	 deps Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getManagementKey	TokenNameIdentifier	 get Management Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
child	TokenNameIdentifier	 child
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
Iterator	TokenNameIdentifier	 Iterator
it	TokenNameIdentifier	 it
=	TokenNameEQUAL	
child	TokenNameIdentifier	 child
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
hasNext	TokenNameIdentifier	 has Next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Dependency	TokenNameIdentifier	 Dependency
dependency	TokenNameIdentifier	 dependency
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Dependency	TokenNameIdentifier	 Dependency
)	TokenNameRPAREN	
it	TokenNameIdentifier	 it
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
depsMap	TokenNameIdentifier	 deps Map
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
dependency	TokenNameIdentifier	 dependency
.	TokenNameDOT	
getManagementKey	TokenNameIdentifier	 get Management Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
dependency	TokenNameIdentifier	 dependency
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
new	TokenNamenew	
ArrayList	TokenNameIdentifier	 Array List
(	TokenNameLPAREN	
depsMap	TokenNameIdentifier	 deps Map
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
