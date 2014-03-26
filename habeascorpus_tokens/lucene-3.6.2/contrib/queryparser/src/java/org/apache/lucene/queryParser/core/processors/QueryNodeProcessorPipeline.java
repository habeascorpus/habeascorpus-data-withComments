package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
;	TokenNameSEMICOLON	
/** * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_JAVADOC	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
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
Iterator	TokenNameIdentifier	 Iterator
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
List	TokenNameIdentifier	 List
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
ListIterator	TokenNameIdentifier	 List Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
config	TokenNameIdentifier	 config
.	TokenNameDOT	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
lucene	TokenNameIdentifier	 lucene
.	TokenNameDOT	
queryParser	TokenNameIdentifier	 query Parser
.	TokenNameDOT	
core	TokenNameIdentifier	 core
.	TokenNameDOT	
nodes	TokenNameIdentifier	 nodes
.	TokenNameDOT	
QueryNode	TokenNameIdentifier	 Query Node
;	TokenNameSEMICOLON	
/** * A {@link QueryNodeProcessorPipeline} class should be used to build a query * node processor pipeline. * * When a query node tree is processed using this class, it passes the query * node tree to each processor on the pipeline and the result from each * processor is passed to the next one, always following the order the * processors were on the pipeline. * * When a {@link QueryConfigHandler} object is set on a * {@link QueryNodeProcessorPipeline}, it also takes care of setting this * {@link QueryConfigHandler} on all processor on pipeline. * */	TokenNameCOMMENT_JAVADOC	 A {@link QueryNodeProcessorPipeline} class should be used to build a query node processor pipeline. * When a query node tree is processed using this class, it passes the query node tree to each processor on the pipeline and the result from each processor is passed to the next one, always following the order the processors were on the pipeline. * When a {@link QueryConfigHandler} object is set on a {@link QueryNodeProcessorPipeline}, it also takes care of setting this {@link QueryConfigHandler} on all processor on pipeline. 
public	TokenNamepublic	
class	TokenNameclass	
QueryNodeProcessorPipeline	TokenNameIdentifier	 Query Node Processor Pipeline
implements	TokenNameimplements	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
,	TokenNameCOMMA	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
{	TokenNameLBRACE	
private	TokenNameprivate	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
processors	TokenNameIdentifier	 processors
=	TokenNameEQUAL	
new	TokenNamenew	
LinkedList	TokenNameIdentifier	 Linked List
<	TokenNameLESS	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
queryConfig	TokenNameIdentifier	 query Config
;	TokenNameSEMICOLON	
/** * Constructs an empty query node processor pipeline. */	TokenNameCOMMENT_JAVADOC	 Constructs an empty query node processor pipeline. 
public	TokenNamepublic	
QueryNodeProcessorPipeline	TokenNameIdentifier	 Query Node Processor Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// empty constructor 	TokenNameCOMMENT_LINE	empty constructor 
}	TokenNameRBRACE	
/** * Constructs with a {@link QueryConfigHandler} object. */	TokenNameCOMMENT_JAVADOC	 Constructs with a {@link QueryConfigHandler} object. 
public	TokenNamepublic	
QueryNodeProcessorPipeline	TokenNameIdentifier	 Query Node Processor Pipeline
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
queryConfigHandler	TokenNameIdentifier	 query Config Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
=	TokenNameEQUAL	
queryConfigHandler	TokenNameIdentifier	 query Config Handler
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For reference about this method check: * {@link QueryNodeProcessor#getQueryConfigHandler()}. * * @return QueryConfigHandler the query configuration handler to be set. * * @see QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler) * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 For reference about this method check: {@link QueryNodeProcessor#getQueryConfigHandler()}. * @return QueryConfigHandler the query configuration handler to be set. * @see QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler) @see QueryConfigHandler 
public	TokenNamepublic	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
getQueryConfigHandler	TokenNameIdentifier	 get Query Config Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For reference about this method check: * {@link QueryNodeProcessor#process(QueryNode)}. * * @param queryTree the query node tree to be processed * * @throws QueryNodeException if something goes wrong during the query node * processing * * @see QueryNode */	TokenNameCOMMENT_JAVADOC	 For reference about this method check: {@link QueryNodeProcessor#process(QueryNode)}. * @param queryTree the query node tree to be processed * @throws QueryNodeException if something goes wrong during the query node processing * @see QueryNode 
public	TokenNamepublic	
QueryNode	TokenNameIdentifier	 Query Node
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
QueryNode	TokenNameIdentifier	 Query Node
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
throws	TokenNamethrows	
QueryNodeException	TokenNameIdentifier	 Query Node Exception
{	TokenNameLBRACE	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
queryTree	TokenNameIdentifier	 query Tree
=	TokenNameEQUAL	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
process	TokenNameIdentifier	 process
(	TokenNameLPAREN	
queryTree	TokenNameIdentifier	 query Tree
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
queryTree	TokenNameIdentifier	 query Tree
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Adds a processor to the pipeline, it's always added to the end of the * pipeline. * * @deprecated this class now conforms to {@link List} interface, so use * {@link #add(QueryNodeProcessor)} instead * * @param processor the processor to be added */	TokenNameCOMMENT_JAVADOC	 Adds a processor to the pipeline, it's always added to the end of the pipeline. * @deprecated this class now conforms to {@link List} interface, so use {@link #add(QueryNodeProcessor)} instead * @param processor the processor to be added 
@	TokenNameAT	
Deprecated	TokenNameIdentifier	 Deprecated
public	TokenNamepublic	
void	TokenNamevoid	
addProcessor	TokenNameIdentifier	 add Processor
(	TokenNameLPAREN	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * For reference about this method check: * {@link QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler)}. * * @param queryConfigHandler the query configuration handler to be set. * * @see QueryNodeProcessor#getQueryConfigHandler() * @see QueryConfigHandler */	TokenNameCOMMENT_JAVADOC	 For reference about this method check: {@link QueryNodeProcessor#setQueryConfigHandler(QueryConfigHandler)}. * @param queryConfigHandler the query configuration handler to be set. * @see QueryNodeProcessor#getQueryConfigHandler() @see QueryConfigHandler 
public	TokenNamepublic	
void	TokenNamevoid	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
QueryConfigHandler	TokenNameIdentifier	 Query Config Handler
queryConfigHandler	TokenNameIdentifier	 query Config Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
=	TokenNameEQUAL	
queryConfigHandler	TokenNameIdentifier	 query Config Handler
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
:	TokenNameCOLON	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * @see List#add(Object) */	TokenNameCOMMENT_JAVADOC	 @see List#add(Object) 
public	TokenNamepublic	
boolean	TokenNameboolean	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
added	TokenNameIdentifier	 added
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
added	TokenNameIdentifier	 added
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
added	TokenNameIdentifier	 added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#add(int, Object) */	TokenNameCOMMENT_JAVADOC	 @see List#add(int, Object) 
public	TokenNamepublic	
void	TokenNamevoid	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
add	TokenNameIdentifier	 add
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#addAll(Collection) */	TokenNameCOMMENT_JAVADOC	 @see List#addAll(Collection) 
public	TokenNamepublic	
boolean	TokenNameboolean	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
anyAdded	TokenNameIdentifier	 any Added
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
anyAdded	TokenNameIdentifier	 any Added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#addAll(int, Collection) */	TokenNameCOMMENT_JAVADOC	 @see List#addAll(int, Collection) 
public	TokenNamepublic	
boolean	TokenNameboolean	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
extends	TokenNameextends	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
anyAdded	TokenNameIdentifier	 any Added
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
addAll	TokenNameIdentifier	 add All
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
:	TokenNameCOLON	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
anyAdded	TokenNameIdentifier	 any Added
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#clear() */	TokenNameCOMMENT_JAVADOC	 @see List#clear() 
public	TokenNamepublic	
void	TokenNamevoid	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#contains(Object) */	TokenNameCOMMENT_JAVADOC	 @see List#contains(Object) 
public	TokenNamepublic	
boolean	TokenNameboolean	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#containsAll(Collection) */	TokenNameCOMMENT_JAVADOC	 @see List#containsAll(Collection) 
public	TokenNamepublic	
boolean	TokenNameboolean	
containsAll	TokenNameIdentifier	 contains All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
containsAll	TokenNameIdentifier	 contains All
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#get(int) */	TokenNameCOMMENT_JAVADOC	 @see List#get(int) 
public	TokenNamepublic	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#indexOf(Object) */	TokenNameCOMMENT_JAVADOC	 @see List#indexOf(Object) 
public	TokenNamepublic	
int	TokenNameint	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
indexOf	TokenNameIdentifier	 index Of
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#isEmpty() */	TokenNameCOMMENT_JAVADOC	 @see List#isEmpty() 
public	TokenNamepublic	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#iterator() */	TokenNameCOMMENT_JAVADOC	 @see List#iterator() 
public	TokenNamepublic	
Iterator	TokenNameIdentifier	 Iterator
<	TokenNameLESS	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#lastIndexOf(Object) */	TokenNameCOMMENT_JAVADOC	 @see List#lastIndexOf(Object) 
public	TokenNamepublic	
int	TokenNameint	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
lastIndexOf	TokenNameIdentifier	 last Index Of
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#listIterator() */	TokenNameCOMMENT_JAVADOC	 @see List#listIterator() 
public	TokenNamepublic	
ListIterator	TokenNameIdentifier	 List Iterator
<	TokenNameLESS	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#listIterator(int) */	TokenNameCOMMENT_JAVADOC	 @see List#listIterator(int) 
public	TokenNamepublic	
ListIterator	TokenNameIdentifier	 List Iterator
<	TokenNameLESS	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
listIterator	TokenNameIdentifier	 list Iterator
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#remove(Object) */	TokenNameCOMMENT_JAVADOC	 @see List#remove(Object) 
public	TokenNamepublic	
boolean	TokenNameboolean	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
o	TokenNameIdentifier	 o
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#remove(int) */	TokenNameCOMMENT_JAVADOC	 @see List#remove(int) 
public	TokenNamepublic	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#removeAll(Collection) */	TokenNameCOMMENT_JAVADOC	 @see List#removeAll(Collection) 
public	TokenNamepublic	
boolean	TokenNameboolean	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
removeAll	TokenNameIdentifier	 remove All
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#retainAll(Collection) */	TokenNameCOMMENT_JAVADOC	 @see List#retainAll(Collection) 
public	TokenNamepublic	
boolean	TokenNameboolean	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
Collection	TokenNameIdentifier	 Collection
<	TokenNameLESS	
?	TokenNameQUESTION	
>	TokenNameGREATER	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
retainAll	TokenNameIdentifier	 retain All
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#set(int, Object) */	TokenNameCOMMENT_JAVADOC	 @see List#set(int, Object) 
public	TokenNamepublic	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
oldProcessor	TokenNameIdentifier	 old Processor
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
set	TokenNameIdentifier	 set
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
,	TokenNameCOMMA	
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
oldProcessor	TokenNameIdentifier	 old Processor
!=	TokenNameNOT_EQUAL	
processor	TokenNameIdentifier	 processor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
processor	TokenNameIdentifier	 processor
.	TokenNameDOT	
setQueryConfigHandler	TokenNameIdentifier	 set Query Config Handler
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
queryConfig	TokenNameIdentifier	 query Config
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
oldProcessor	TokenNameIdentifier	 old Processor
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#size() */	TokenNameCOMMENT_JAVADOC	 @see List#size() 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#subList(int, int) */	TokenNameCOMMENT_JAVADOC	 @see List#subList(int, int) 
public	TokenNamepublic	
List	TokenNameIdentifier	 List
<	TokenNameLESS	
QueryNodeProcessor	TokenNameIdentifier	 Query Node Processor
>	TokenNameGREATER	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
int	TokenNameint	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
subList	TokenNameIdentifier	 sub List
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
,	TokenNameCOMMA	
toIndex	TokenNameIdentifier	 to Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#toArray(Object[]) */	TokenNameCOMMENT_JAVADOC	 @see List#toArray(Object[]) 
public	TokenNamepublic	
<	TokenNameLESS	
T	TokenNameIdentifier	 T
>	TokenNameGREATER	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
T	TokenNameIdentifier	 T
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
array	TokenNameIdentifier	 array
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * @see List#toArray() */	TokenNameCOMMENT_JAVADOC	 @see List#toArray() 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
processors	TokenNameIdentifier	 processors
.	TokenNameDOT	
toArray	TokenNameIdentifier	 to Array
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
