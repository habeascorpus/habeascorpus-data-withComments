/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the * "License"); you may not use this file except in compliance * with the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
db	TokenNameIdentifier	 db
.	TokenNameDOT	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
nio	TokenNameIdentifier	 nio
.	TokenNameDOT	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
cassandra	TokenNameIdentifier	 cassandra
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
Allocator	TokenNameIdentifier	 Allocator
;	TokenNameSEMICOLON	
/** * An opaque commutative context. * * Maintains a ByteBuffer context that represents a partitioned commutative value. */	TokenNameCOMMENT_JAVADOC	 An opaque commutative context. * Maintains a ByteBuffer context that represents a partitioned commutative value. 
public	TokenNamepublic	
interface	TokenNameinterface	
IContext	TokenNameIdentifier	 I Context
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
enum	TokenNameenum	
ContextRelationship	TokenNameIdentifier	 Context Relationship
{	TokenNameLBRACE	
EQUAL	TokenNameIdentifier	 EQUAL
,	TokenNameCOMMA	
GREATER_THAN	TokenNameIdentifier	 GREATER  THAN
,	TokenNameCOMMA	
LESS_THAN	TokenNameIdentifier	 LESS  THAN
,	TokenNameCOMMA	
DISJOINT	TokenNameIdentifier	 DISJOINT
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * Determine the relationship between two contexts. * * EQUAL: Equal set of nodes and every count is equal. * GREATER_THAN: Superset of nodes and every count is equal or greater than its corollary. * LESS_THAN: Subset of nodes and every count is equal or less than its corollary. * DISJOINT: Node sets are not equal and/or counts are not all greater or less than. * * @param left * context. * @param right * context. * @return the ContextRelationship between the contexts. */	TokenNameCOMMENT_JAVADOC	 Determine the relationship between two contexts. * EQUAL: Equal set of nodes and every count is equal. GREATER_THAN: Superset of nodes and every count is equal or greater than its corollary. LESS_THAN: Subset of nodes and every count is equal or less than its corollary. DISJOINT: Node sets are not equal and/or counts are not all greater or less than. * @param left context. @param right context. @return the ContextRelationship between the contexts. 
public	TokenNamepublic	
ContextRelationship	TokenNameIdentifier	 Context Relationship
diff	TokenNameIdentifier	 diff
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
right	TokenNameIdentifier	 right
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return a context w/ an aggregated count for each node id. * * @param left * context. * @param right * context. * @param allocator * an allocator to allocate the new context from. */	TokenNameCOMMENT_JAVADOC	 Return a context w/ an aggregated count for each node id. * @param left context. @param right context. @param allocator an allocator to allocate the new context from. 
public	TokenNamepublic	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
merge	TokenNameIdentifier	 merge
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
left	TokenNameIdentifier	 left
,	TokenNameCOMMA	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
right	TokenNameIdentifier	 right
,	TokenNameCOMMA	
Allocator	TokenNameIdentifier	 Allocator
allocator	TokenNameIdentifier	 allocator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Human-readable String from context. * * @param context * context. * @return a human-readable String of the context. */	TokenNameCOMMENT_JAVADOC	 Human-readable String from context. * @param context context. @return a human-readable String of the context. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
ByteBuffer	TokenNameIdentifier	 Byte Buffer
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
