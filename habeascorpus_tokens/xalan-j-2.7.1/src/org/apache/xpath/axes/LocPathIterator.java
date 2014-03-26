/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: LocPathIterator.java 468655 2006-10-28 07:12:06Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: LocPathIterator.java 468655 2006-10-28 07:12:06Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLMessages	TokenNameIdentifier	 XSL Messages
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
DTM	TokenNameIdentifier	 DTM
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
DTMFilter	TokenNameIdentifier	 DTM Filter
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
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMManager	TokenNameIdentifier	 DTM Manager
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
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
compiler	TokenNameIdentifier	 compiler
.	TokenNameDOT	
Compiler	TokenNameIdentifier	 Compiler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XNodeSet	TokenNameIdentifier	 X Node Set
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XObject	TokenNameIdentifier	 X Object
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
;	TokenNameSEMICOLON	
/** * This class extends NodeSetDTM, which implements NodeIterator, * and fetches nodes one at a time in document order based on a XPath * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a>. * * <p>If setShouldCacheNodes(true) is called, * as each node is iterated via nextNode(), the node is also stored * in the NodeVector, so that previousNode() can easily be done, except in * the case where the LocPathIterator is "owned" by a UnionPathIterator, * in which case the UnionPathIterator will cache the nodes.</p> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 This class extends NodeSetDTM, which implements NodeIterator, and fetches nodes one at a time in document order based on a XPath <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a>. * <p>If setShouldCacheNodes(true) is called, as each node is iterated via nextNode(), the node is also stored in the NodeVector, so that previousNode() can easily be done, except in the case where the LocPathIterator is "owned" by a UnionPathIterator, in which case the UnionPathIterator will cache the nodes.</p> @xsl.usage advanced 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
extends	TokenNameextends	
PredicatedNodeTest	TokenNameIdentifier	 Predicated Node Test
implements	TokenNameimplements	
Cloneable	TokenNameIdentifier	 Cloneable
,	TokenNameCOMMA	
DTMIterator	TokenNameIdentifier	 DTM Iterator
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
Serializable	TokenNameIdentifier	 Serializable
,	TokenNameCOMMA	
PathComponent	TokenNameIdentifier	 Path Component
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
4602476357268405754L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Create a LocPathIterator object. * */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object. 
protected	TokenNameprotected	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Create a LocPathIterator object. * * @param nscontext The namespace context for this iterator, * should be OK if null. */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object. * @param nscontext The namespace context for this iterator, should be OK if null. 
protected	TokenNameprotected	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nscontext	TokenNameIdentifier	 nscontext
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setLocPathIterator	TokenNameIdentifier	 set Loc Path Iterator
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prefixResolver	TokenNameIdentifier	 m prefix Resolver
=	TokenNameEQUAL	
nscontext	TokenNameIdentifier	 nscontext
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a LocPathIterator object, including creation * of step walkers from the opcode list, and call back * into the Compiler to create predicate expressions. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object, including creation of step walkers from the opcode list, and call back into the Compiler to create predicate expressions. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
analysis	TokenNameIdentifier	 analysis
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
analysis	TokenNameIdentifier	 analysis
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a LocPathIterator object, including creation * of step walkers from the opcode list, and call back * into the Compiler to create predicate expressions. * * @param compiler The Compiler which is creating * this expression. * @param opPos The position of this iterator in the * opcode list from the compiler. * @param shouldLoadWalkers True if walkers should be * loaded, or false if this is a derived iterator and * it doesn't wish to load child walkers. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Create a LocPathIterator object, including creation of step walkers from the opcode list, and call back into the Compiler to create predicate expressions. * @param compiler The Compiler which is creating this expression. @param opPos The position of this iterator in the opcode list from the compiler. @param shouldLoadWalkers True if walkers should be loaded, or false if this is a derived iterator and it doesn't wish to load child walkers. * @throws javax.xml.transform.TransformerException 
protected	TokenNameprotected	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
(	TokenNameLPAREN	
Compiler	TokenNameIdentifier	 Compiler
compiler	TokenNameIdentifier	 compiler
,	TokenNameCOMMA	
int	TokenNameint	
opPos	TokenNameIdentifier	 op Pos
,	TokenNameCOMMA	
int	TokenNameint	
analysis	TokenNameIdentifier	 analysis
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldLoadWalkers	TokenNameIdentifier	 should Load Walkers
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
setLocPathIterator	TokenNameIdentifier	 set Loc Path Iterator
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the analysis bits for this walker, as defined in the WalkerFactory. * @return One of WalkerFactory#BIT_DESCENDANT, etc. */	TokenNameCOMMENT_JAVADOC	 Get the analysis bits for this walker, as defined in the WalkerFactory. @return One of WalkerFactory#BIT_DESCENDANT, etc. 
public	TokenNamepublic	
int	TokenNameint	
getAnalysisBits	TokenNameIdentifier	 get Analysis Bits
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
axis	TokenNameIdentifier	 axis
=	TokenNameEQUAL	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
bit	TokenNameIdentifier	 bit
=	TokenNameEQUAL	
WalkerFactory	TokenNameIdentifier	 Walker Factory
.	TokenNameDOT	
getAnalysisBitFromAxes	TokenNameIdentifier	 get Analysis Bit From Axes
(	TokenNameLPAREN	
axis	TokenNameIdentifier	 axis
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
bit	TokenNameIdentifier	 bit
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Read the object from a serialization stream. * * @param stream Input stream to read from * * @throws java.io.IOException * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Read the object from a serialization stream. * @param stream Input stream to read from * @throws java.io.IOException @throws javax.xml.transform.TransformerException 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_clones	TokenNameIdentifier	 m clones
=	TokenNameEQUAL	
new	TokenNamenew	
IteratorPool	TokenNameIdentifier	 Iterator Pool
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
cnfe	TokenNameIdentifier	 cnfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Set the environment in which this iterator operates, which should provide: * a node (the context node... same value as "root" defined below) * a pair of non-zero positive integers (the context position and the context size) * a set of variable bindings * a function library * the set of namespace declarations in scope for the expression. * * <p>At this time the exact implementation of this environment is application * dependent. Probably a proper interface will be created fairly soon.</p> * * @param environment The environment object. */	TokenNameCOMMENT_JAVADOC	 Set the environment in which this iterator operates, which should provide: a node (the context node... same value as "root" defined below) a pair of non-zero positive integers (the context position and the context size) a set of variable bindings a function library the set of namespace declarations in scope for the expression. * <p>At this time the exact implementation of this environment is application dependent. Probably a proper interface will be created fairly soon.</p> * @param environment The environment object. 
public	TokenNamepublic	
void	TokenNamevoid	
setEnvironment	TokenNameIdentifier	 set Environment
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// no-op for now. 	TokenNameCOMMENT_LINE	no-op for now. 
}	TokenNameRBRACE	
/** * Get an instance of a DTM that "owns" a node handle. Since a node * iterator may be passed without a DTMManager, this allows the * caller to easily get the DTM using just the iterator. * * @param nodeHandle the nodeHandle. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM that "owns" a node handle. Since a node iterator may be passed without a DTMManager, this allows the caller to easily get the DTM using just the iterator. * @param nodeHandle the nodeHandle. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %OPT% 	TokenNameCOMMENT_LINE	%OPT% 
return	TokenNamereturn	
m_execContext	TokenNameIdentifier	 m exec Context
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of the DTMManager. Since a node * iterator may be passed without a DTMManager, this allows the * caller to easily get the DTMManager using just the iterator. * * @return a non-null DTMManager reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of the DTMManager. Since a node iterator may be passed without a DTMManager, this allows the caller to easily get the DTMManager using just the iterator. * @return a non-null DTMManager reference. 
public	TokenNamepublic	
DTMManager	TokenNameIdentifier	 DTM Manager
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_execContext	TokenNameIdentifier	 m exec Context
.	TokenNameDOT	
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute this iterator, meaning create a clone that can * store state, and initialize it for fast execution from * the current runtime state. When this is called, no actual * query from the current context node is performed. * * @param xctxt The XPath execution context. * * @return An XNodeSet reference that holds this iterator. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Execute this iterator, meaning create a clone that can store state, and initialize it for fast execution from the current runtime state. When this is called, no actual query from the current context node is performed. * @param xctxt The XPath execution context. * @return An XNodeSet reference that holds this iterator. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
XObject	TokenNameIdentifier	 X Object
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XNodeSet	TokenNameIdentifier	 X Node Set
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
new	TokenNamenew	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
m_clones	TokenNameIdentifier	 m clones
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Execute an expression in the XPath runtime context, and return the * result of the expression. * * * @param xctxt The XPath runtime context. * @param handler The target content handler. * * @return The result of the expression in the form of a <code>XObject</code>. * * @throws javax.xml.transform.TransformerException if a runtime exception * occurs. * @throws org.xml.sax.SAXException */	TokenNameCOMMENT_JAVADOC	 Execute an expression in the XPath runtime context, and return the result of the expression. * @param xctxt The XPath runtime context. @param handler The target content handler. * @return The result of the expression in the form of a <code>XObject</code>. * @throws javax.xml.transform.TransformerException if a runtime exception occurs. @throws org.xml.sax.SAXException 
public	TokenNamepublic	
void	TokenNamevoid	
executeCharsToContentHandler	TokenNameIdentifier	 execute Chars To Content Handler
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
ContentHandler	TokenNameIdentifier	 Content Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
m_clones	TokenNameIdentifier	 m clones
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
node	TokenNameIdentifier	 node
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
dispatchCharactersEvents	TokenNameIdentifier	 dispatch Characters Events
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Given an select expression and a context, evaluate the XPath * and return the resulting iterator. * * @param xctxt The execution context. * @param contextNode The node that "." expresses. * @throws TransformerException thrown if the active ProblemListener decides * the error condition is severe enough to halt processing. * * @throws javax.xml.transform.TransformerException * @xsl.usage experimental */	TokenNameCOMMENT_JAVADOC	 Given an select expression and a context, evaluate the XPath and return the resulting iterator. * @param xctxt The execution context. @param contextNode The node that "." expresses. @throws TransformerException thrown if the active ProblemListener decides the error condition is severe enough to halt processing. * @throws javax.xml.transform.TransformerException @xsl.usage experimental 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
asIterator	TokenNameIdentifier	 as Iterator
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
,	TokenNameCOMMA	
int	TokenNameint	
contextNode	TokenNameIdentifier	 context Node
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
XNodeSet	TokenNameIdentifier	 X Node Set
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
new	TokenNamenew	
XNodeSet	TokenNameIdentifier	 X Node Set
(	TokenNameLPAREN	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
m_clones	TokenNameIdentifier	 m clones
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
contextNode	TokenNameIdentifier	 context Node
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell if the expression is a nodeset expression. * * @return true if the expression can be represented as a nodeset. */	TokenNameCOMMENT_JAVADOC	 Tell if the expression is a nodeset expression. * @return true if the expression can be represented as a nodeset. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isNodesetExpr	TokenNameIdentifier	 is Nodeset Expr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the first node out of the nodeset, if this expression is * a nodeset expression. This is the default implementation for * nodesets. Derived classes should try and override this and return a * value without having to do a clone operation. * @param xctxt The XPath runtime context. * @return the first node out of the nodeset, or DTM.NULL. */	TokenNameCOMMENT_JAVADOC	 Return the first node out of the nodeset, if this expression is a nodeset expression. This is the default implementation for nodesets. Derived classes should try and override this and return a value without having to do a clone operation. @param xctxt The XPath runtime context. @return the first node out of the nodeset, or DTM.NULL. 
public	TokenNamepublic	
int	TokenNameint	
asNode	TokenNameIdentifier	 as Node
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_clones	TokenNameIdentifier	 m clones
.	TokenNameDOT	
getInstance	TokenNameIdentifier	 get Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
current	TokenNameIdentifier	 current
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
current	TokenNameIdentifier	 current
,	TokenNameCOMMA	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// m_clones.freeInstance(iter); 	TokenNameCOMMENT_LINE	m_clones.freeInstance(iter); 
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Evaluate this operation directly to a boolean. * * @param xctxt The runtime execution context. * * @return The result of the operation as a boolean. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Evaluate this operation directly to a boolean. * @param xctxt The runtime execution context. * @return The result of the operation as a boolean. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
boolean	TokenNameboolean	
bool	TokenNameIdentifier	 bool
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
throws	TokenNamethrows	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
asNode	TokenNameIdentifier	 as Node
(	TokenNameLPAREN	
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set if this is an iterator at the upper level of * the XPath. * * @param b true if this location path is at the top level of the * expression. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Set if this is an iterator at the upper level of the XPath. * @param b true if this location path is at the top level of the expression. @xsl.usage advanced 
public	TokenNamepublic	
void	TokenNamevoid	
setIsTopLevel	TokenNameIdentifier	 set Is Top Level
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
=	TokenNameEQUAL	
b	TokenNameIdentifier	 b
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get if this is an iterator at the upper level of * the XPath. * * @return true if this location path is at the top level of the * expression. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Get if this is an iterator at the upper level of the XPath. * @return true if this location path is at the top level of the expression. @xsl.usage advanced 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIsTopLevel	TokenNameIdentifier	 get Is Top Level
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Initialize the context values for this expression * after it is cloned. * * @param context The XPath runtime context for this * transformation. */	TokenNameCOMMENT_JAVADOC	 Initialize the context values for this expression after it is cloned. * @param context The XPath runtime context for this transformation. 
public	TokenNamepublic	
void	TokenNamevoid	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
int	TokenNameint	
context	TokenNameIdentifier	 context
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
environment	TokenNameIdentifier	 environment
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_context	TokenNameIdentifier	 m context
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
)	TokenNameRPAREN	
environment	TokenNameIdentifier	 environment
;	TokenNameSEMICOLON	
m_execContext	TokenNameIdentifier	 m exec Context
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
;	TokenNameSEMICOLON	
m_cdtm	TokenNameIdentifier	 m cdtm
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentContextNode	TokenNameIdentifier	 m current Context Node
=	TokenNameEQUAL	
context	TokenNameIdentifier	 context
;	TokenNameSEMICOLON	
// only if top level? 	TokenNameCOMMENT_LINE	only if top level? 
// Yech, shouldn't have to do this. -sb 	TokenNameCOMMENT_LINE	Yech, shouldn't have to do this. -sb 
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_prefixResolver	TokenNameIdentifier	 m prefix Resolver
)	TokenNameRPAREN	
m_prefixResolver	TokenNameIdentifier	 m prefix Resolver
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_pos	TokenNameIdentifier	 m pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_length	TokenNameIdentifier	 m length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
m_stackFrame	TokenNameIdentifier	 m stack Frame
=	TokenNameEQUAL	
xctxt	TokenNameIdentifier	 xctxt
.	TokenNameDOT	
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getStackFrame	TokenNameIdentifier	 get Stack Frame
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset(); 	TokenNameCOMMENT_LINE	reset(); 
}	TokenNameRBRACE	
/** * Set the next position index of this iterator. * * @param next A value greater than or equal to zero that indicates the next * node position to fetch. */	TokenNameCOMMENT_JAVADOC	 Set the next position index of this iterator. * @param next A value greater than or equal to zero that indicates the next node position to fetch. 
protected	TokenNameprotected	
void	TokenNamevoid	
setNextPosition	TokenNameIdentifier	 set Next Position
(	TokenNameLPAREN	
int	TokenNameint	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"setNextPosition not supported in this iterator!"	TokenNameStringLiteral	setNextPosition not supported in this iterator!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current position, which is one less than * the next nextNode() call will retrieve. i.e. if * you call getCurrentPos() and the return is 0, the next * fetch will take place at index 1. * * @return A value greater than or equal to zero that indicates the next * node position to fetch. */	TokenNameCOMMENT_JAVADOC	 Get the current position, which is one less than the next nextNode() call will retrieve. i.e. if you call getCurrentPos() and the return is 0, the next fetch will take place at index 1. * @return A value greater than or equal to zero that indicates the next node position to fetch. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_pos	TokenNameIdentifier	 m pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If setShouldCacheNodes(true) is called, then nodes will * be cached. They are not cached by default. * * @param b True if this iterator should cache nodes. */	TokenNameCOMMENT_JAVADOC	 If setShouldCacheNodes(true) is called, then nodes will be cached. They are not cached by default. * @param b True if this iterator should cache nodes. 
public	TokenNamepublic	
void	TokenNamevoid	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"setShouldCacheNodes not supported by this iterater!"	TokenNameStringLiteral	setShouldCacheNodes not supported by this iterater!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this iterator can have nodes added to it or set via * the <code>setItem(int node, int index)</code> method. * * @return True if the nodelist can be mutated. */	TokenNameCOMMENT_JAVADOC	 Tells if this iterator can have nodes added to it or set via the <code>setItem(int node, int index)</code> method. * @return True if the nodelist can be mutated. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isMutable	TokenNameIdentifier	 is Mutable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current position in the node set. * * @param i Must be a valid index greater * than or equal to zero and less than m_cachedNodes.size(). */	TokenNameCOMMENT_JAVADOC	 Set the current position in the node set. * @param i Must be a valid index greater than or equal to zero and less than m_cachedNodes.size(). 
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"setCurrentPos not supported by this iterator!"	TokenNameStringLiteral	setCurrentPos not supported by this iterator!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Increment the current position in the node set. */	TokenNameCOMMENT_JAVADOC	 Increment the current position in the node set. 
public	TokenNamepublic	
void	TokenNamevoid	
incrementCurrentPos	TokenNameIdentifier	 increment Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pos	TokenNameIdentifier	 m pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the length of the cached nodes. * * <p>Note: for the moment at least, this only returns * the size of the nodes that have been fetched to date, * it doesn't attempt to run to the end to make sure we * have found everything. This should be reviewed.</p> * * @return The size of the current cache list. */	TokenNameCOMMENT_JAVADOC	 Get the length of the cached nodes. * <p>Note: for the moment at least, this only returns the size of the nodes that have been fetched to date, it doesn't attempt to run to the end to make sure we have found everything. This should be reviewed.</p> * @return The size of the current cache list. 
public	TokenNamepublic	
int	TokenNameint	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"size() not supported by this iterator!"	TokenNameStringLiteral	size() not supported by this iterator!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the <code>index</code> th item in the collection. If * <code>index</code> is greater than or equal to the number of nodes in * the list, this returns <code>null</code> . * @param index Index into the collection. * @return The node at the <code>index</code> th position in the * <code>NodeList</code> , or <code>null</code> if that is not a valid * index. */	TokenNameCOMMENT_JAVADOC	 Returns the <code>index</code> th item in the collection. If <code>index</code> is greater than or equal to the number of nodes in the list, this returns <code>null</code> . @param index Index into the collection. @return The node at the <code>index</code> th position in the <code>NodeList</code> , or <code>null</code> if that is not a valid index. 
public	TokenNamepublic	
int	TokenNameint	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"item(int index) not supported by this iterator!"	TokenNameStringLiteral	item(int index) not supported by this iterator!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Sets the node at the specified index of this vector to be the * specified node. The previous component at that position is discarded. * * <p>The index must be a value greater than or equal to 0 and less * than the current size of the vector. * The iterator must be in cached mode.</p> * * <p>Meant to be used for sorted iterators.</p> * * @param node Node to set * @param index Index of where to set the node */	TokenNameCOMMENT_JAVADOC	 Sets the node at the specified index of this vector to be the specified node. The previous component at that position is discarded. * <p>The index must be a value greater than or equal to 0 and less than the current size of the vector. The iterator must be in cached mode.</p> * <p>Meant to be used for sorted iterators.</p> * @param node Node to set @param index Index of where to set the node 
public	TokenNamepublic	
void	TokenNamevoid	
setItem	TokenNameIdentifier	 set Item
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"setItem not supported by this iterator!"	TokenNameStringLiteral	setItem not supported by this iterator!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The number of nodes in the list. The range of valid child node indices * is 0 to <code>length-1</code> inclusive. * * @return The number of nodes in the list, always greater or equal to zero. */	TokenNameCOMMENT_JAVADOC	 The number of nodes in the list. The range of valid child node indices is 0 to <code>length-1</code> inclusive. * @return The number of nodes in the list, always greater or equal to zero. 
public	TokenNamepublic	
int	TokenNameint	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Tell if this is being called from within a predicate. 	TokenNameCOMMENT_LINE	Tell if this is being called from within a predicate. 
boolean	TokenNameboolean	
isPredicateTest	TokenNameIdentifier	 is Predicate Test
=	TokenNameEQUAL	
(	TokenNameLPAREN	
this	TokenNamethis	
==	TokenNameEQUAL_EQUAL	
m_execContext	TokenNameIdentifier	 m exec Context
.	TokenNameDOT	
getSubContextList	TokenNameIdentifier	 get Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// And get how many total predicates are part of this step. 	TokenNameCOMMENT_LINE	And get how many total predicates are part of this step. 
int	TokenNameint	
predCount	TokenNameIdentifier	 pred Count
=	TokenNameEQUAL	
getPredicateCount	TokenNameIdentifier	 get Predicate Count
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If we have already calculated the length, and the current predicate 	TokenNameCOMMENT_LINE	If we have already calculated the length, and the current predicate 
// is the first predicate, then return the length. We don't cache 	TokenNameCOMMENT_LINE	is the first predicate, then return the length. We don't cache 
// the anything but the length of the list to the first predicate. 	TokenNameCOMMENT_LINE	the anything but the length of the list to the first predicate. 
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
!=	TokenNameNOT_EQUAL	
m_length	TokenNameIdentifier	 m length
&&	TokenNameAND_AND	
isPredicateTest	TokenNameIdentifier	 is Predicate Test
&&	TokenNameAND_AND	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
m_length	TokenNameIdentifier	 m length
;	TokenNameSEMICOLON	
// I'm a bit worried about this one, since it doesn't have the 	TokenNameCOMMENT_LINE	I'm a bit worried about this one, since it doesn't have the 
// checks found above. I suspect it's fine. -sb 	TokenNameCOMMENT_LINE	checks found above. I suspect it's fine. -sb 
if	TokenNameif	
(	TokenNameLPAREN	
m_foundLast	TokenNameIdentifier	 m found Last
)	TokenNameRPAREN	
return	TokenNamereturn	
m_pos	TokenNameIdentifier	 m pos
;	TokenNameSEMICOLON	
// Create a clone, and count from the current position to the end 	TokenNameCOMMENT_LINE	Create a clone, and count from the current position to the end 
// of the list, not taking into account the current predicate and 	TokenNameCOMMENT_LINE	of the list, not taking into account the current predicate and 
// predicates after the current one. 	TokenNameCOMMENT_LINE	predicates after the current one. 
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
getProximityPosition	TokenNameIdentifier	 get Proximity Position
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
m_pos	TokenNameIdentifier	 m pos
;	TokenNameSEMICOLON	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
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
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// We want to clip off the last predicate, but only if we are a sub 	TokenNameCOMMENT_LINE	We want to clip off the last predicate, but only if we are a sub 
// context node list, NOT if we are a context list. See pos68 test, 	TokenNameCOMMENT_LINE	context node list, NOT if we are a context list. See pos68 test, 
// also test against bug4638. 	TokenNameCOMMENT_LINE	also test against bug4638. 
if	TokenNameif	
(	TokenNameLPAREN	
predCount	TokenNameIdentifier	 pred Count
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isPredicateTest	TokenNameIdentifier	 is Predicate Test
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Don't call setPredicateCount, because it clones and is slower. 	TokenNameCOMMENT_LINE	Don't call setPredicateCount, because it clones and is slower. 
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_predCount	TokenNameIdentifier	 m pred Count
=	TokenNameEQUAL	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
;	TokenNameSEMICOLON	
// The line above used to be: 	TokenNameCOMMENT_LINE	The line above used to be: 
// clone.m_predCount = predCount - 1; 	TokenNameCOMMENT_LINE	clone.m_predCount = predCount - 1; 
// ...which looks like a dumb bug to me. -sb 	TokenNameCOMMENT_LINE	...which looks like a dumb bug to me. -sb 
}	TokenNameRBRACE	
int	TokenNameint	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pos	TokenNameIdentifier	 pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
isPredicateTest	TokenNameIdentifier	 is Predicate Test
&&	TokenNameAND_AND	
m_predicateIndex	TokenNameIdentifier	 m predicate Index
<	TokenNameLESS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
m_length	TokenNameIdentifier	 m length
=	TokenNameEQUAL	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
return	TokenNamereturn	
pos	TokenNameIdentifier	 pos
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tells if this NodeSetDTM is "fresh", in other words, if * the first nextNode() that is called will return the * first node in the set. * * @return true of nextNode has not been called. */	TokenNameCOMMENT_JAVADOC	 Tells if this NodeSetDTM is "fresh", in other words, if the first nextNode() that is called will return the first node in the set. * @return true of nextNode has not been called. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isFresh	TokenNameIdentifier	 is Fresh
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
m_pos	TokenNameIdentifier	 m pos
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the previous node in the set and moves the position of the * iterator backwards in the set. * @return The previous <code>Node</code> in the set being iterated over, * or<code>null</code> if there are no more members in that set. */	TokenNameCOMMENT_JAVADOC	 Returns the previous node in the set and moves the position of the iterator backwards in the set. @return The previous <code>Node</code> in the set being iterated over, or<code>null</code> if there are no more members in that set. 
public	TokenNamepublic	
int	TokenNameint	
previousNode	TokenNameIdentifier	 previous Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NODESETDTM_CANNOT_ITERATE	TokenNameIdentifier	 ER  NODESETDTM  CANNOT  ITERATE
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"This NodeSetDTM can not iterate to a previous node!"); 	TokenNameCOMMENT_LINE	"This NodeSetDTM can not iterate to a previous node!"); 
}	TokenNameRBRACE	
/** * This attribute determines which node types are presented via the * iterator. The available set of constants is defined in the * <code>NodeFilter</code> interface. * * <p>This is somewhat useless at this time, since it doesn't * really return information that tells what this iterator will * show. It is here only to fullfill the DOM NodeIterator * interface.</p> * * @return For now, always NodeFilter.SHOW_ALL & ~NodeFilter.SHOW_ENTITY_REFERENCE. * @see org.w3c.dom.traversal.NodeIterator */	TokenNameCOMMENT_JAVADOC	 This attribute determines which node types are presented via the iterator. The available set of constants is defined in the <code>NodeFilter</code> interface. * <p>This is somewhat useless at this time, since it doesn't really return information that tells what this iterator will show. It is here only to fullfill the DOM NodeIterator interface.</p> * @return For now, always NodeFilter.SHOW_ALL & ~NodeFilter.SHOW_ENTITY_REFERENCE. @see org.w3c.dom.traversal.NodeIterator 
public	TokenNamepublic	
int	TokenNameint	
getWhatToShow	TokenNameIdentifier	 get What To Show
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// TODO: ?? 	TokenNameCOMMENT_LINE	TODO: ?? 
return	TokenNamereturn	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ALL	TokenNameIdentifier	 SHOW  ALL
&	TokenNameAND	
~	TokenNameTWIDDLE	
DTMFilter	TokenNameIdentifier	 DTM Filter
.	TokenNameDOT	
SHOW_ENTITY_REFERENCE	TokenNameIdentifier	 SHOW  ENTITY  REFERENCE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The filter used to screen nodes. Not used at this time, * this is here only to fullfill the DOM NodeIterator * interface. * * @return Always null. * @see org.w3c.dom.traversal.NodeIterator */	TokenNameCOMMENT_JAVADOC	 The filter used to screen nodes. Not used at this time, this is here only to fullfill the DOM NodeIterator interface. * @return Always null. @see org.w3c.dom.traversal.NodeIterator 
public	TokenNamepublic	
DTMFilter	TokenNameIdentifier	 DTM Filter
getFilter	TokenNameIdentifier	 get Filter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The root node of the Iterator, as specified when it was created. * * @return The "root" of this iterator, which, in XPath terms, * is the node context for this iterator. */	TokenNameCOMMENT_JAVADOC	 The root node of the Iterator, as specified when it was created. * @return The "root" of this iterator, which, in XPath terms, is the node context for this iterator. 
public	TokenNamepublic	
int	TokenNameint	
getRoot	TokenNameIdentifier	 get Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_context	TokenNameIdentifier	 m context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The value of this flag determines whether the children of entity * reference nodes are visible to the iterator. If false, they will be * skipped over. * <br> To produce a view of the document that has entity references * expanded and does not expose the entity reference node itself, use the * whatToShow flags to hide the entity reference node and set * expandEntityReferences to true when creating the iterator. To produce * a view of the document that has entity reference nodes but no entity * expansion, use the whatToShow flags to show the entity reference node * and set expandEntityReferences to false. * * @return Always true, since entity reference nodes are not * visible in the XPath model. */	TokenNameCOMMENT_JAVADOC	 The value of this flag determines whether the children of entity reference nodes are visible to the iterator. If false, they will be skipped over. <br> To produce a view of the document that has entity references expanded and does not expose the entity reference node itself, use the whatToShow flags to hide the entity reference node and set expandEntityReferences to true when creating the iterator. To produce a view of the document that has entity reference nodes but no entity expansion, use the whatToShow flags to show the entity reference node and set expandEntityReferences to false. * @return Always true, since entity reference nodes are not visible in the XPath model. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getExpandEntityReferences	TokenNameIdentifier	 get Expand Entity References
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Control over whether it is OK for detach to reset the iterator. */	TokenNameCOMMENT_JAVADOC	 Control over whether it is OK for detach to reset the iterator. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_allowDetach	TokenNameIdentifier	 m allow Detach
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
/** * Specify if it's OK for detach to release the iterator for reuse. * * @param allowRelease true if it is OK for detach to release this iterator * for pooling. */	TokenNameCOMMENT_JAVADOC	 Specify if it's OK for detach to release the iterator for reuse. * @param allowRelease true if it is OK for detach to release this iterator for pooling. 
public	TokenNamepublic	
void	TokenNamevoid	
allowDetachToRelease	TokenNameIdentifier	 allow Detach To Release
(	TokenNameLPAREN	
boolean	TokenNameboolean	
allowRelease	TokenNameIdentifier	 allow Release
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_allowDetach	TokenNameIdentifier	 m allow Detach
=	TokenNameEQUAL	
allowRelease	TokenNameIdentifier	 allow Release
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Detaches the iterator from the set which it iterated over, releasing * any computational resources and placing the iterator in the INVALID * state. After<code>detach</code> has been invoked, calls to * <code>nextNode</code> or<code>previousNode</code> will raise the * exception INVALID_STATE_ERR. */	TokenNameCOMMENT_JAVADOC	 Detaches the iterator from the set which it iterated over, releasing any computational resources and placing the iterator in the INVALID state. After<code>detach</code> has been invoked, calls to <code>nextNode</code> or<code>previousNode</code> will raise the exception INVALID_STATE_ERR. 
public	TokenNamepublic	
void	TokenNamevoid	
detach	TokenNameIdentifier	 detach
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_allowDetach	TokenNameIdentifier	 m allow Detach
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// sb: allow reusing of cached nodes when possible? 	TokenNameCOMMENT_LINE	sb: allow reusing of cached nodes when possible? 
// m_cachedNodes = null; 	TokenNameCOMMENT_LINE	m_cachedNodes = null; 
m_execContext	TokenNameIdentifier	 m exec Context
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// m_prefixResolver = null; sb: Why would this ever want to be null? 	TokenNameCOMMENT_LINE	m_prefixResolver = null; sb: Why would this ever want to be null? 
m_cdtm	TokenNameIdentifier	 m cdtm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_length	TokenNameIdentifier	 m length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_pos	TokenNameIdentifier	 m pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_context	TokenNameIdentifier	 m context
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_currentContextNode	TokenNameIdentifier	 m current Context Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
m_clones	TokenNameIdentifier	 m clones
.	TokenNameDOT	
freeInstance	TokenNameIdentifier	 free Instance
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reset the iterator. */	TokenNameCOMMENT_JAVADOC	 Reset the iterator. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
false	TokenNamefalse	
,	TokenNameCOMMA	
"This iterator can not reset!"	TokenNameStringLiteral	This iterator can not reset!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a cloned Iterator that is reset to the beginning * of the query. * * @return A cloned NodeIterator set of the start of the query. * * @throws CloneNotSupportedException */	TokenNameCOMMENT_JAVADOC	 Get a cloned Iterator that is reset to the beginning of the query. * @return A cloned NodeIterator set of the start of the query. * @throws CloneNotSupportedException 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
{	TokenNameLBRACE	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
// clone = (LocPathIterator) clone(); 	TokenNameCOMMENT_LINE	clone = (LocPathIterator) clone(); 
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
(	TokenNameLPAREN	
LocPathIterator	TokenNameIdentifier	 Loc Path Iterator
)	TokenNameRPAREN	
m_clones	TokenNameIdentifier	 m clones
.	TokenNameDOT	
getInstanceOrThrow	TokenNameIdentifier	 get Instance Or Throw
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_execContext	TokenNameIdentifier	 m exec Context
=	TokenNameEQUAL	
m_execContext	TokenNameIdentifier	 m exec Context
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_cdtm	TokenNameIdentifier	 m cdtm
=	TokenNameEQUAL	
m_cdtm	TokenNameIdentifier	 m cdtm
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_context	TokenNameIdentifier	 m context
=	TokenNameEQUAL	
m_context	TokenNameIdentifier	 m context
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_currentContextNode	TokenNameIdentifier	 m current Context Node
=	TokenNameEQUAL	
m_currentContextNode	TokenNameIdentifier	 m current Context Node
;	TokenNameSEMICOLON	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
m_stackFrame	TokenNameIdentifier	 m stack Frame
=	TokenNameEQUAL	
m_stackFrame	TokenNameIdentifier	 m stack Frame
;	TokenNameSEMICOLON	
// clone.reset(); 	TokenNameCOMMENT_LINE	clone.reset(); 
return	TokenNamereturn	
clone	TokenNameIdentifier	 clone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Get a cloned LocPathIterator that holds the same 	TokenNameCOMMENT_LINE	* Get a cloned LocPathIterator that holds the same 
// * position as this iterator. 	TokenNameCOMMENT_LINE	* position as this iterator. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return A clone of this iterator that holds the same node position. 	TokenNameCOMMENT_LINE	* @return A clone of this iterator that holds the same node position. 
// * 	TokenNameCOMMENT_LINE	* 
// * @throws CloneNotSupportedException 	TokenNameCOMMENT_LINE	* @throws CloneNotSupportedException 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public Object clone() throws CloneNotSupportedException 	TokenNameCOMMENT_LINE	public Object clone() throws CloneNotSupportedException 
// { 	TokenNameCOMMENT_LINE	{ 
// 	TokenNameCOMMENT_LINE	 
// LocPathIterator clone = (LocPathIterator) super.clone(); 	TokenNameCOMMENT_LINE	LocPathIterator clone = (LocPathIterator) super.clone(); 
// 	TokenNameCOMMENT_LINE	 
// return clone; 	TokenNameCOMMENT_LINE	return clone; 
// } 	TokenNameCOMMENT_LINE	} 
/** * Returns the next node in the set and advances the position of the * iterator in the set. After a NodeIterator is created, the first call * to nextNode() returns the first node in the set. * @return The next <code>Node</code> in the set being iterated over, or * <code>null</code> if there are no more members in that set. */	TokenNameCOMMENT_JAVADOC	 Returns the next node in the set and advances the position of the iterator in the set. After a NodeIterator is created, the first call to nextNode() returns the first node in the set. @return The next <code>Node</code> in the set being iterated over, or <code>null</code> if there are no more members in that set. 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Bottleneck the return of a next node, to make returns * easier from nextNode(). * * @param nextNode The next node found, may be null. * * @return The same node that was passed as an argument. */	TokenNameCOMMENT_JAVADOC	 Bottleneck the return of a next node, to make returns easier from nextNode(). * @param nextNode The next node found, may be null. * @return The same node that was passed as an argument. 
protected	TokenNameprotected	
int	TokenNameint	
returnNextNode	TokenNameIdentifier	 return Next Node
(	TokenNameLPAREN	
int	TokenNameint	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pos	TokenNameIdentifier	 m pos
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
nextNode	TokenNameIdentifier	 next Node
)	TokenNameRPAREN	
m_foundLast	TokenNameIdentifier	 m found Last
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
nextNode	TokenNameIdentifier	 next Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the last fetched node. Needed to support the UnionPathIterator. * * @return The last fetched node, or null if the last fetch was null. */	TokenNameCOMMENT_JAVADOC	 Return the last fetched node. Needed to support the UnionPathIterator. * @return The last fetched node, or null if the last fetch was null. 
public	TokenNamepublic	
int	TokenNameint	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_lastFetched	TokenNameIdentifier	 m last Fetched
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * If an index is requested, NodeSetDTM will call this method * to run the iterator to the index. By default this sets * m_next to the index. If the index argument is -1, this * signals that the iterator should be run to the end. * * @param index The index to run to, or -1 if the iterator * should run to the end. */	TokenNameCOMMENT_JAVADOC	 If an index is requested, NodeSetDTM will call this method to run the iterator to the index. By default this sets m_next to the index. If the index argument is -1, this signals that the iterator should be run to the end. * @param index The index to run to, or -1 if the iterator should run to the end. 
public	TokenNamepublic	
void	TokenNamevoid	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
int	TokenNameint	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_foundLast	TokenNameIdentifier	 m found Last
||	TokenNameOR_OR	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
<=	TokenNameLESS_EQUAL	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
int	TokenNameint	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
!=	TokenNameNOT_EQUAL	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>=	TokenNameGREATER_EQUAL	
index	TokenNameIdentifier	 index
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tells if we've found the last node yet. * * @return true if the last nextNode returned null. */	TokenNameCOMMENT_JAVADOC	 Tells if we've found the last node yet. * @return true if the last nextNode returned null. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
getFoundLast	TokenNameIdentifier	 get Found Last
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_foundLast	TokenNameIdentifier	 m found Last
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The XPath execution context we are operating on. * * @return XPath execution context this iterator is operating on, * or null if setRoot has not been called. */	TokenNameCOMMENT_JAVADOC	 The XPath execution context we are operating on. * @return XPath execution context this iterator is operating on, or null if setRoot has not been called. 
public	TokenNamepublic	
final	TokenNamefinal	
XPathContext	TokenNameIdentifier	 X Path Context
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_execContext	TokenNameIdentifier	 m exec Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The node context for the iterator. * * @return The node context, same as getRoot(). */	TokenNameCOMMENT_JAVADOC	 The node context for the iterator. * @return The node context, same as getRoot(). 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getContext	TokenNameIdentifier	 get Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_context	TokenNameIdentifier	 m context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The node context from where the expression is being * executed from (i.e. for current() support). * * @return The top-level node context of the entire expression. */	TokenNameCOMMENT_JAVADOC	 The node context from where the expression is being executed from (i.e. for current() support). * @return The top-level node context of the entire expression. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getCurrentContextNode	TokenNameIdentifier	 get Current Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentContextNode	TokenNameIdentifier	 m current Context Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current context node for this iterator. * * @param n Must be a non-null reference to the node context. */	TokenNameCOMMENT_JAVADOC	 Set the current context node for this iterator. * @param n Must be a non-null reference to the node context. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setCurrentContextNode	TokenNameIdentifier	 set Current Context Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentContextNode	TokenNameIdentifier	 m current Context Node
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Set the current context node for this iterator. 	TokenNameCOMMENT_LINE	* Set the current context node for this iterator. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param n Must be a non-null reference to the node context. 	TokenNameCOMMENT_LINE	* @param n Must be a non-null reference to the node context. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// public void setRoot(int n) 	TokenNameCOMMENT_LINE	public void setRoot(int n) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_context = n; 	TokenNameCOMMENT_LINE	m_context = n; 
// m_cdtm = m_execContext.getDTM(n); 	TokenNameCOMMENT_LINE	m_cdtm = m_execContext.getDTM(n); 
// } 	TokenNameCOMMENT_LINE	} 
/** * Return the saved reference to the prefix resolver that * was in effect when this iterator was created. * * @return The prefix resolver or this iterator, which may be null. */	TokenNameCOMMENT_JAVADOC	 Return the saved reference to the prefix resolver that was in effect when this iterator was created. * @return The prefix resolver or this iterator, which may be null. 
public	TokenNamepublic	
final	TokenNamefinal	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
getPrefixResolver	TokenNameIdentifier	 get Prefix Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_prefixResolver	TokenNameIdentifier	 m prefix Resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixResolver	TokenNameIdentifier	 m prefix Resolver
=	TokenNameEQUAL	
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
)	TokenNameRPAREN	
getExpressionOwner	TokenNameIdentifier	 get Expression Owner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_prefixResolver	TokenNameIdentifier	 m prefix Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Get the analysis pattern built by the WalkerFactory. 	TokenNameCOMMENT_LINE	* Get the analysis pattern built by the WalkerFactory. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return The analysis pattern built by the WalkerFactory. 	TokenNameCOMMENT_LINE	* @return The analysis pattern built by the WalkerFactory. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// int getAnalysis() 	TokenNameCOMMENT_LINE	int getAnalysis() 
// { 	TokenNameCOMMENT_LINE	{ 
// return m_analysis; 	TokenNameCOMMENT_LINE	return m_analysis; 
// } 	TokenNameCOMMENT_LINE	} 
// /** 	TokenNameCOMMENT_LINE	/** 
// * Set the analysis pattern built by the WalkerFactory. 	TokenNameCOMMENT_LINE	* Set the analysis pattern built by the WalkerFactory. 
// * 	TokenNameCOMMENT_LINE	* 
// * @param a The analysis pattern built by the WalkerFactory. 	TokenNameCOMMENT_LINE	* @param a The analysis pattern built by the WalkerFactory. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// void setAnalysis(int a) 	TokenNameCOMMENT_LINE	void setAnalysis(int a) 
// { 	TokenNameCOMMENT_LINE	{ 
// m_analysis = a; 	TokenNameCOMMENT_LINE	m_analysis = a; 
// } 	TokenNameCOMMENT_LINE	} 
/** * @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) */	TokenNameCOMMENT_JAVADOC	 @see org.apache.xpath.XPathVisitable#callVisitors(ExpressionOwner, XPathVisitor) 
public	TokenNamepublic	
void	TokenNamevoid	
callVisitors	TokenNameIdentifier	 call Visitors
(	TokenNameLPAREN	
ExpressionOwner	TokenNameIdentifier	 Expression Owner
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
XPathVisitor	TokenNameIdentifier	 X Path Visitor
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitLocationPath	TokenNameIdentifier	 visit Location Path
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
visitor	TokenNameIdentifier	 visitor
.	TokenNameDOT	
visitStep	TokenNameIdentifier	 visit Step
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
callPredicateVisitors	TokenNameIdentifier	 call Predicate Visitors
(	TokenNameLPAREN	
visitor	TokenNameIdentifier	 visitor
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//============= State Data ============= 	TokenNameCOMMENT_LINE	============= State Data ============= 
/** * The pool for cloned iterators. Iterators need to be cloned * because the hold running state, and thus the original iterator * expression from the stylesheet pool can not be used. */	TokenNameCOMMENT_JAVADOC	 The pool for cloned iterators. Iterators need to be cloned because the hold running state, and thus the original iterator expression from the stylesheet pool can not be used. 
transient	TokenNametransient	
protected	TokenNameprotected	
IteratorPool	TokenNameIdentifier	 Iterator Pool
m_clones	TokenNameIdentifier	 m clones
=	TokenNameEQUAL	
new	TokenNamenew	
IteratorPool	TokenNameIdentifier	 Iterator Pool
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The dtm of the context node. Careful about using this... it may not * be the dtm of the current node. */	TokenNameCOMMENT_JAVADOC	 The dtm of the context node. Careful about using this... it may not be the dtm of the current node. 
transient	TokenNametransient	
protected	TokenNameprotected	
DTM	TokenNameIdentifier	 DTM
m_cdtm	TokenNameIdentifier	 m cdtm
;	TokenNameSEMICOLON	
/** * The stack frame index for this iterator. */	TokenNameCOMMENT_JAVADOC	 The stack frame index for this iterator. 
transient	TokenNametransient	
int	TokenNameint	
m_stackFrame	TokenNameIdentifier	 m stack Frame
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Value determined at compile time, indicates that this is an * iterator at the top level of the expression, rather than inside * a predicate. * @serial */	TokenNameCOMMENT_JAVADOC	 Value determined at compile time, indicates that this is an iterator at the top level of the expression, rather than inside a predicate. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isTopLevel	TokenNameIdentifier	 m is Top Level
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** The last node that was fetched, usually by nextNode. */	TokenNameCOMMENT_JAVADOC	 The last node that was fetched, usually by nextNode. 
transient	TokenNametransient	
public	TokenNamepublic	
int	TokenNameint	
m_lastFetched	TokenNameIdentifier	 m last Fetched
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * The context node for this iterator, which doesn't change through * the course of the iteration. */	TokenNameCOMMENT_JAVADOC	 The context node for this iterator, which doesn't change through the course of the iteration. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_context	TokenNameIdentifier	 m context
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * The node context from where the expression is being * executed from (i.e. for current() support). Different * from m_context in that this is the context for the entire * expression, rather than the context for the subexpression. */	TokenNameCOMMENT_JAVADOC	 The node context from where the expression is being executed from (i.e. for current() support). Different from m_context in that this is the context for the entire expression, rather than the context for the subexpression. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_currentContextNode	TokenNameIdentifier	 m current Context Node
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
/** * The current position of the context node. */	TokenNameCOMMENT_JAVADOC	 The current position of the context node. 
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_pos	TokenNameIdentifier	 m pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
transient	TokenNametransient	
protected	TokenNameprotected	
int	TokenNameint	
m_length	TokenNameIdentifier	 m length
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Fast access to the current prefix resolver. It isn't really * clear that this is needed. * @serial */	TokenNameCOMMENT_JAVADOC	 Fast access to the current prefix resolver. It isn't really clear that this is needed. @serial 
private	TokenNameprivate	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
m_prefixResolver	TokenNameIdentifier	 m prefix Resolver
;	TokenNameSEMICOLON	
/** * The XPathContext reference, needed for execution of many * operations. */	TokenNameCOMMENT_JAVADOC	 The XPathContext reference, needed for execution of many operations. 
transient	TokenNametransient	
protected	TokenNameprotected	
XPathContext	TokenNameIdentifier	 X Path Context
m_execContext	TokenNameIdentifier	 m exec Context
;	TokenNameSEMICOLON	
/** * Returns true if all the nodes in the iteration well be returned in document * order. * * @return true as a default. */	TokenNameCOMMENT_JAVADOC	 Returns true if all the nodes in the iteration well be returned in document order. * @return true as a default. 
public	TokenNamepublic	
boolean	TokenNameboolean	
isDocOrdered	TokenNameIdentifier	 is Doc Ordered
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns the axis being iterated, if it is known. * * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple * types. */	TokenNameCOMMENT_JAVADOC	 Returns the axis being iterated, if it is known. * @return Axis.CHILD, etc., or -1 if the axis is not known or is of multiple types. 
public	TokenNamepublic	
int	TokenNameint	
getAxis	TokenNameIdentifier	 get Axis
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// /** 	TokenNameCOMMENT_LINE	/** 
// * The analysis pattern built by the WalkerFactory. 	TokenNameCOMMENT_LINE	* The analysis pattern built by the WalkerFactory. 
// * TODO: Move to LocPathIterator. 	TokenNameCOMMENT_LINE	* TODO: Move to LocPathIterator. 
// * @see org.apache.xpath.axes.WalkerFactory 	TokenNameCOMMENT_LINE	* @see org.apache.xpath.axes.WalkerFactory 
// * @serial 	TokenNameCOMMENT_LINE	* @serial 
// */ 	TokenNameCOMMENT_LINE	*/ 
// protected int m_analysis = 0x00000000; 	TokenNameCOMMENT_LINE	protected int m_analysis = 0x00000000; 
/** * @see PredicatedNodeTest#getLastPos(XPathContext) */	TokenNameCOMMENT_JAVADOC	 @see PredicatedNodeTest#getLastPos(XPathContext) 
public	TokenNamepublic	
int	TokenNameint	
getLastPos	TokenNameIdentifier	 get Last Pos
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
xctxt	TokenNameIdentifier	 xctxt
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
