/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TransformSnapshotImpl.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TransformSnapshotImpl.java 468645 2006-10-28 06:57:24Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
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
Stack	TokenNameIdentifier	 Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
BoolStack	TokenNameIdentifier	 Bool Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
IntStack	TokenNameIdentifier	 Int Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
NamespaceSupport2	TokenNameIdentifier	 Namespace Support2
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
NodeVector	TokenNameIdentifier	 Node Vector
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
ObjectStack	TokenNameIdentifier	 Object Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
VariableStack	TokenNameIdentifier	 Variable Stack
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathContext	TokenNameIdentifier	 X Path Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
helpers	TokenNameIdentifier	 helpers
.	TokenNameDOT	
NamespaceSupport	TokenNameIdentifier	 Namespace Support
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
SerializationHandler	TokenNameIdentifier	 Serialization Handler
;	TokenNameSEMICOLON	
/** * This class holds a "snapshot" of it's current transformer state, * which can later be restored. * * This only saves state which can change over the course of the side-effect-free * (i.e. no extensions that call setURIResolver, etc.). * * @deprecated It doesn't look like this code, which is for tooling, has * functioned propery for a while, so it doesn't look like it is being used. */	TokenNameCOMMENT_JAVADOC	 This class holds a "snapshot" of it's current transformer state, which can later be restored. * This only saves state which can change over the course of the side-effect-free (i.e. no extensions that call setURIResolver, etc.). * @deprecated It doesn't look like this code, which is for tooling, has functioned propery for a while, so it doesn't look like it is being used. 
class	TokenNameclass	
TransformSnapshotImpl	TokenNameIdentifier	 Transform Snapshot Impl
implements	TokenNameimplements	
TransformSnapshot	TokenNameIdentifier	 Transform Snapshot
{	TokenNameLBRACE	
/** * The stack of Variable stack frames. */	TokenNameCOMMENT_JAVADOC	 The stack of Variable stack frames. 
private	TokenNameprivate	
VariableStack	TokenNameIdentifier	 Variable Stack
m_variableStacks	TokenNameIdentifier	 m variable Stacks
;	TokenNameSEMICOLON	
/** * The stack of <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a> objects. * Not to be confused with the current node list. */	TokenNameCOMMENT_JAVADOC	 The stack of <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a> objects. Not to be confused with the current node list. 
private	TokenNameprivate	
IntStack	TokenNameIdentifier	 Int Stack
m_currentNodes	TokenNameIdentifier	 m current Nodes
;	TokenNameSEMICOLON	
/** A stack of the current sub-expression nodes. */	TokenNameCOMMENT_JAVADOC	 A stack of the current sub-expression nodes. 
private	TokenNameprivate	
IntStack	TokenNameIdentifier	 Int Stack
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
;	TokenNameSEMICOLON	
/** * The current context node lists stack. */	TokenNameCOMMENT_JAVADOC	 The current context node lists stack. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
;	TokenNameSEMICOLON	
/** * The current context node list. */	TokenNameCOMMENT_JAVADOC	 The current context node list. 
private	TokenNameprivate	
DTMIterator	TokenNameIdentifier	 DTM Iterator
m_contextNodeList	TokenNameIdentifier	 m context Node List
;	TokenNameSEMICOLON	
/** * Stack of AxesIterators. */	TokenNameCOMMENT_JAVADOC	 Stack of AxesIterators. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
;	TokenNameSEMICOLON	
/** * Is > 0 when we're processing a for-each. */	TokenNameCOMMENT_JAVADOC	 Is > 0 when we're processing a for-each. 
private	TokenNameprivate	
BoolStack	TokenNameIdentifier	 Bool Stack
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
;	TokenNameSEMICOLON	
/** * A node vector used as a stack to track the current * ElemTemplateElement. Needed for the * org.apache.xalan.transformer.TransformState interface, * so a tool can discover the calling template. */	TokenNameCOMMENT_JAVADOC	 A node vector used as a stack to track the current ElemTemplateElement. Needed for the org.apache.xalan.transformer.TransformState interface, so a tool can discover the calling template. 
private	TokenNameprivate	
ObjectStack	TokenNameIdentifier	 Object Stack
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
;	TokenNameSEMICOLON	
/** * A node vector used as a stack to track the current * ElemTemplate that was matched, as well as the node that * was matched. Needed for the * org.apache.xalan.transformer.TransformState interface, * so a tool can discover the matched template, and matched * node. */	TokenNameCOMMENT_JAVADOC	 A node vector used as a stack to track the current ElemTemplate that was matched, as well as the node that was matched. Needed for the org.apache.xalan.transformer.TransformState interface, so a tool can discover the matched template, and matched node. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
;	TokenNameSEMICOLON	
/** * A node vector used as a stack to track the current * ElemTemplate that was matched, as well as the node that * was matched. Needed for the * org.apache.xalan.transformer.TransformState interface, * so a tool can discover the matched template, and matched * node. */	TokenNameCOMMENT_JAVADOC	 A node vector used as a stack to track the current ElemTemplate that was matched, as well as the node that was matched. Needed for the org.apache.xalan.transformer.TransformState interface, so a tool can discover the matched template, and matched node. 
private	TokenNameprivate	
NodeVector	TokenNameIdentifier	 Node Vector
m_currentMatchNodes	TokenNameIdentifier	 m current Match Nodes
;	TokenNameSEMICOLON	
/** * The table of counters for xsl:number support. * @see ElemNumber */	TokenNameCOMMENT_JAVADOC	 The table of counters for xsl:number support. @see ElemNumber 
private	TokenNameprivate	
CountersTable	TokenNameIdentifier	 Counters Table
m_countersTable	TokenNameIdentifier	 m counters Table
;	TokenNameSEMICOLON	
/** * Stack for the purposes of flagging infinite recursion with * attribute sets. */	TokenNameCOMMENT_JAVADOC	 Stack for the purposes of flagging infinite recursion with attribute sets. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
;	TokenNameSEMICOLON	
/** Indicate whether a namespace context was pushed */	TokenNameCOMMENT_JAVADOC	 Indicate whether a namespace context was pushed 
boolean	TokenNameboolean	
m_nsContextPushed	TokenNameIdentifier	 m ns Context Pushed
;	TokenNameSEMICOLON	
/** * Use the SAX2 helper class to track result namespaces. */	TokenNameCOMMENT_JAVADOC	 Use the SAX2 helper class to track result namespaces. 
private	TokenNameprivate	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
m_nsSupport	TokenNameIdentifier	 m ns Support
;	TokenNameSEMICOLON	
/** The number of events queued */	TokenNameCOMMENT_JAVADOC	 The number of events queued 
// int m_eventCount; 	TokenNameCOMMENT_LINE	int m_eventCount; 
/** * Constructor TransformSnapshotImpl * Take a snapshot of the currently executing context. * * @param transformer Non null transformer instance * @deprecated It doesn't look like this code, which is for tooling, has * functioned propery for a while, so it doesn't look like it is being used. */	TokenNameCOMMENT_JAVADOC	 Constructor TransformSnapshotImpl Take a snapshot of the currently executing context. * @param transformer Non null transformer instance @deprecated It doesn't look like this code, which is for tooling, has functioned propery for a while, so it doesn't look like it is being used. 
TransformSnapshotImpl	TokenNameIdentifier	 Transform Snapshot Impl
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Are all these clones deep enough? 	TokenNameCOMMENT_LINE	Are all these clones deep enough? 
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rtf	TokenNameIdentifier	 rtf
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
{	TokenNameLBRACE	
// save serializer fields 	TokenNameCOMMENT_LINE	save serializer fields 
m_nsSupport	TokenNameIdentifier	 m ns Support
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
)	TokenNameRPAREN	
rtf	TokenNameIdentifier	 rtf
.	TokenNameDOT	
getNamespaceMappings	TokenNameIdentifier	 get Namespace Mappings
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Do other fields need to be saved/restored? 	TokenNameCOMMENT_LINE	Do other fields need to be saved/restored? 
}	TokenNameRBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xpc	TokenNameIdentifier	 xpc
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_variableStacks	TokenNameIdentifier	 m variable Stacks
=	TokenNameEQUAL	
(	TokenNameLPAREN	
VariableStack	TokenNameIdentifier	 Variable Stack
)	TokenNameRPAREN	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentNodes	TokenNameIdentifier	 m current Nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntStack	TokenNameIdentifier	 Int Stack
)	TokenNameRPAREN	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
getCurrentNodeStack	TokenNameIdentifier	 get Current Node Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IntStack	TokenNameIdentifier	 Int Stack
)	TokenNameRPAREN	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
getCurrentExpressionNodeStack	TokenNameIdentifier	 get Current Expression Node Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
getContextNodeListsStack	TokenNameIdentifier	 get Context Node Lists Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
.	TokenNameDOT	
empty	TokenNameIdentifier	 empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_contextNodeList	TokenNameIdentifier	 m context Node List
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
getAxesIteratorStackStacks	TokenNameIdentifier	 get Axes Iterator Stack Stacks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BoolStack	TokenNameIdentifier	 Bool Stack
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectStack	TokenNameIdentifier	 Object Stack
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentMatchNodes	TokenNameIdentifier	 m current Match Nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_currentMatchedNodes	TokenNameIdentifier	 m current Matched Nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_countersTable	TokenNameIdentifier	 m counters Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CountersTable	TokenNameIdentifier	 Counters Table
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getCountersTable	TokenNameIdentifier	 get Counters Table
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This will reset the stylesheet to a given execution context * based on some previously taken snapshot where we can then start execution * * @param transformer Non null transformer instance * * @deprecated It doesn't look like this code, which is for tooling, has * functioned propery for a while, so it doesn't look like it is being used. */	TokenNameCOMMENT_JAVADOC	 This will reset the stylesheet to a given execution context based on some previously taken snapshot where we can then start execution * @param transformer Non null transformer instance * @deprecated It doesn't look like this code, which is for tooling, has functioned propery for a while, so it doesn't look like it is being used. 
void	TokenNamevoid	
apply	TokenNameIdentifier	 apply
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
// Are all these clones deep enough? 	TokenNameCOMMENT_LINE	Are all these clones deep enough? 
SerializationHandler	TokenNameIdentifier	 Serialization Handler
rtf	TokenNameIdentifier	 rtf
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getResultTreeHandler	TokenNameIdentifier	 get Result Tree Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
rtf	TokenNameIdentifier	 rtf
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// restore serializer fields 	TokenNameCOMMENT_LINE	restore serializer fields 
rtf	TokenNameIdentifier	 rtf
.	TokenNameDOT	
setNamespaceMappings	TokenNameIdentifier	 set Namespace Mappings
(	TokenNameLPAREN	
(	TokenNameLPAREN	
NamespaceMappings	TokenNameIdentifier	 Namespace Mappings
)	TokenNameRPAREN	
m_nsSupport	TokenNameIdentifier	 m ns Support
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
XPathContext	TokenNameIdentifier	 X Path Context
xpc	TokenNameIdentifier	 xpc
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
setVarStack	TokenNameIdentifier	 set Var Stack
(	TokenNameLPAREN	
(	TokenNameLPAREN	
VariableStack	TokenNameIdentifier	 Variable Stack
)	TokenNameRPAREN	
m_variableStacks	TokenNameIdentifier	 m variable Stacks
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
setCurrentNodeStack	TokenNameIdentifier	 set Current Node Stack
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IntStack	TokenNameIdentifier	 Int Stack
)	TokenNameRPAREN	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
setCurrentExpressionNodeStack	TokenNameIdentifier	 set Current Expression Node Stack
(	TokenNameLPAREN	
(	TokenNameLPAREN	
IntStack	TokenNameIdentifier	 Int Stack
)	TokenNameRPAREN	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
setContextNodeListsStack	TokenNameIdentifier	 set Context Node Lists Stack
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_contextNodeList	TokenNameIdentifier	 m context Node List
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
pushContextNodeList	TokenNameIdentifier	 push Context Node List
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_contextNodeList	TokenNameIdentifier	 m context Node List
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
xpc	TokenNameIdentifier	 xpc
.	TokenNameDOT	
setAxesIteratorStackStacks	TokenNameIdentifier	 set Axes Iterator Stack Stacks
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
=	TokenNameEQUAL	
(	TokenNameLPAREN	
BoolStack	TokenNameIdentifier	 Bool Stack
)	TokenNameRPAREN	
m_currentTemplateRuleIsNull	TokenNameIdentifier	 m current Template Rule Is Null
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ObjectStack	TokenNameIdentifier	 Object Stack
)	TokenNameRPAREN	
m_currentTemplateElements	TokenNameIdentifier	 m current Template Elements
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
m_currentMatchTemplates	TokenNameIdentifier	 m current Match Templates
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_currentMatchedNodes	TokenNameIdentifier	 m current Matched Nodes
=	TokenNameEQUAL	
(	TokenNameLPAREN	
NodeVector	TokenNameIdentifier	 Node Vector
)	TokenNameRPAREN	
m_currentMatchNodes	TokenNameIdentifier	 m current Match Nodes
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_countersTable	TokenNameIdentifier	 m counters Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
CountersTable	TokenNameIdentifier	 Counters Table
)	TokenNameRPAREN	
m_countersTable	TokenNameIdentifier	 m counters Table
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
=	TokenNameEQUAL	
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
)	TokenNameRPAREN	
m_attrSetStack	TokenNameIdentifier	 m attr Set Stack
.	TokenNameDOT	
clone	TokenNameIdentifier	 clone
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
WrappedRuntimeException	TokenNameIdentifier	 Wrapped Runtime Exception
(	TokenNameLPAREN	
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
