/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XPathContext.java 524809 2007-04-02 15:51:51Z zongaro $ */	TokenNameCOMMENT_BLOCK	 $Id: XPathContext.java 524809 2007-04-02 15:51:51Z zongaro $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
lang	TokenNameIdentifier	 lang
.	TokenNameDOT	
reflect	TokenNameIdentifier	 reflect
.	TokenNameDOT	
Method	TokenNameIdentifier	 Method
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
Vector	TokenNameIdentifier	 Vector
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
ErrorListener	TokenNameIdentifier	 Error Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerException	TokenNameIdentifier	 Transformer Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
URIResolver	TokenNameIdentifier	 URI Resolver
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
extensions	TokenNameIdentifier	 extensions
.	TokenNameDOT	
ExpressionContext	TokenNameIdentifier	 Expression Context
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
Axis	TokenNameIdentifier	 Axis
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
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
sax2dtm	TokenNameIdentifier	 sax2dtm
.	TokenNameDOT	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
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
XMLString	TokenNameIdentifier	 XML String
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
SubContextList	TokenNameIdentifier	 Sub Context List
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
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
DTMXRTreeFrag	TokenNameIdentifier	 DTMXR Tree Frag
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
XString	TokenNameIdentifier	 X String
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
XMLReader	TokenNameIdentifier	 XML Reader
;	TokenNameSEMICOLON	
/** * Default class for the runtime execution context for XPath. * * <p>This class extends DTMManager but does not directly implement it.</p> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Default class for the runtime execution context for XPath. * <p>This class extends DTMManager but does not directly implement it.</p> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
XPathContext	TokenNameIdentifier	 X Path Context
extends	TokenNameextends	
DTMManager	TokenNameIdentifier	 DTM Manager
// implements ExpressionContext 	TokenNameCOMMENT_LINE	implements ExpressionContext 
{	TokenNameLBRACE	
IntStack	TokenNameIdentifier	 Int Stack
m_last_pushed_rtfdtm	TokenNameIdentifier	 m last pushed rtfdtm
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Stack of cached "reusable" DTMs for Result Tree Fragments. * This is a kluge to handle the problem of starting an RTF before * the old one is complete. * * %REVIEW% I'm using a Vector rather than Stack so we can reuse * the DTMs if the problem occurs multiple times. I'm not sure that's * really a net win versus discarding the DTM and starting a new one... * but the retained RTF DTM will have been tail-pruned so should be small. */	TokenNameCOMMENT_JAVADOC	 Stack of cached "reusable" DTMs for Result Tree Fragments. This is a kluge to handle the problem of starting an RTF before the old one is complete. * %REVIEW% I'm using a Vector rather than Stack so we can reuse the DTMs if the problem occurs multiple times. I'm not sure that's really a net win versus discarding the DTM and starting a new one... but the retained RTF DTM will have been tail-pruned so should be small. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Index of currently active RTF DTM in m_rtfdtm_stack */	TokenNameCOMMENT_JAVADOC	 Index of currently active RTF DTM in m_rtfdtm_stack 
private	TokenNameprivate	
int	TokenNameint	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Most recent "reusable" DTM for Global Result Tree Fragments. No stack is * required since we're never going to pop these. */	TokenNameCOMMENT_JAVADOC	 Most recent "reusable" DTM for Global Result Tree Fragments. No stack is required since we're never going to pop these. 
private	TokenNameprivate	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
m_global_rtfdtm	TokenNameIdentifier	 m global rtfdtm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * HashMap of cached the DTMXRTreeFrag objects, which are identified by DTM IDs. * The object are just wrappers for DTMs which are used in XRTreeFrag. */	TokenNameCOMMENT_JAVADOC	 HashMap of cached the DTMXRTreeFrag objects, which are identified by DTM IDs. The object are just wrappers for DTMs which are used in XRTreeFrag. 
private	TokenNameprivate	
HashMap	TokenNameIdentifier	 Hash Map
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * state of the secure processing feature. */	TokenNameCOMMENT_JAVADOC	 state of the secure processing feature. 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Though XPathContext context extends * the DTMManager, it really is a proxy for this object, which * is the real DTMManager. */	TokenNameCOMMENT_JAVADOC	 Though XPathContext context extends the DTMManager, it really is a proxy for this object, which is the real DTMManager. 
protected	TokenNameprotected	
DTMManager	TokenNameIdentifier	 DTM Manager
m_dtmManager	TokenNameIdentifier	 m dtm Manager
=	TokenNameEQUAL	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XMLStringFactoryImpl	TokenNameIdentifier	 XML String Factory Impl
.	TokenNameDOT	
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Return the DTMManager object. Though XPathContext context extends * the DTMManager, it really is a proxy for the real DTMManager. If a * caller needs to make a lot of calls to the DTMManager, it is faster * if it gets the real one from this function. */	TokenNameCOMMENT_JAVADOC	 Return the DTMManager object. Though XPathContext context extends the DTMManager, it really is a proxy for the real DTMManager. If a caller needs to make a lot of calls to the DTMManager, it is faster if it gets the real one from this function. 
public	TokenNamepublic	
DTMManager	TokenNameIdentifier	 DTM Manager
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the state of the secure processing feature */	TokenNameCOMMENT_JAVADOC	 Set the state of the secure processing feature 
public	TokenNamepublic	
void	TokenNamevoid	
setSecureProcessing	TokenNameIdentifier	 set Secure Processing
(	TokenNameLPAREN	
boolean	TokenNameboolean	
flag	TokenNameIdentifier	 flag
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
=	TokenNameEQUAL	
flag	TokenNameIdentifier	 flag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the state of the secure processing feature */	TokenNameCOMMENT_JAVADOC	 Return the state of the secure processing feature 
public	TokenNamepublic	
boolean	TokenNameboolean	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_isSecureProcessing	TokenNameIdentifier	 m is Secure Processing
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM, loaded with the content from the * specified source. If the unique flag is true, a new instance will * always be returned. Otherwise it is up to the DTMManager to return a * new instance or an instance that it already created and may be being used * by someone else. * (I think more parameters will need to be added for error handling, and entity * resolution). * * @param source the specification of the source object, which may be null, * in which case it is assumed that node construction will take * by some other means. * @param unique true if the returned DTM must be unique, probably because it * is going to be mutated. * @param wsfilter Enables filtering of whitespace nodes, and may be null. * @param incremental true if the construction should try and be incremental. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM, loaded with the content from the specified source. If the unique flag is true, a new instance will always be returned. Otherwise it is up to the DTMManager to return a new instance or an instance that it already created and may be being used by someone else. (I think more parameters will need to be added for error handling, and entity resolution). * @param source the specification of the source object, which may be null, in which case it is assumed that node construction will take by some other means. @param unique true if the returned DTM must be unique, probably because it is going to be mutated. @param wsfilter Enables filtering of whitespace nodes, and may be null. @param incremental true if the construction should try and be incremental. @param doIndexing true if the caller considers it worth it to use indexing schemes. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Source	TokenNameIdentifier	 Source
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
boolean	TokenNameboolean	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
DTMWSFilter	TokenNameIdentifier	 DTMWS Filter
wsfilter	TokenNameIdentifier	 wsfilter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
unique	TokenNameIdentifier	 unique
,	TokenNameCOMMA	
wsfilter	TokenNameIdentifier	 wsfilter
,	TokenNameCOMMA	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM that "owns" a node handle. * * @param nodeHandle the nodeHandle. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM that "owns" a node handle. * @param nodeHandle the nodeHandle. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a W3C DOM node, try and return a DTM handle. * Note: calling this may be non-optimal. * * @param node Non-null reference to a DOM node. * * @return a valid DTM handle. */	TokenNameCOMMENT_JAVADOC	 Given a W3C DOM node, try and return a DTM handle. Note: calling this may be non-optimal. * @param node Non-null reference to a DOM node. * @return a valid DTM handle. 
public	TokenNamepublic	
int	TokenNameint	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
/** * %TBD% Doc */	TokenNameCOMMENT_JAVADOC	 %TBD% Doc 
public	TokenNamepublic	
int	TokenNameint	
getDTMIdentity	TokenNameIdentifier	 get DTM Identity
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
getDTMIdentity	TokenNameIdentifier	 get DTM Identity
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
/** * Creates an empty <code>DocumentFragment</code> object. * @return A new <code>DocumentFragment handle</code>. */	TokenNameCOMMENT_JAVADOC	 Creates an empty <code>DocumentFragment</code> object. @return A new <code>DocumentFragment handle</code>. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
/** * Release a DTM either to a lru pool, or completely remove reference. * DTMs without system IDs are always hard deleted. * State: experimental. * * @param dtm The DTM to be released. * @param shouldHardDelete True if the DTM should be removed no matter what. * @return true if the DTM was removed, false if it was put back in a lru pool. */	TokenNameCOMMENT_JAVADOC	 Release a DTM either to a lru pool, or completely remove reference. DTMs without system IDs are always hard deleted. State: experimental. * @param dtm The DTM to be released. @param shouldHardDelete True if the DTM should be removed no matter what. @return true if the DTM was removed, false if it was put back in a lru pool. 
public	TokenNamepublic	
boolean	TokenNameboolean	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldHardDelete	TokenNameIdentifier	 should Hard Delete
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% If it's a DTM which may contain multiple Result Tree 	TokenNameCOMMENT_LINE	%REVIEW% If it's a DTM which may contain multiple Result Tree 
// Fragments, we can't discard it unless we know not only that it 	TokenNameCOMMENT_LINE	Fragments, we can't discard it unless we know not only that it 
// is empty, but that the XPathContext itself is going away. So do 	TokenNameCOMMENT_LINE	is empty, but that the XPathContext itself is going away. So do 
// _not_ accept the request. (May want to do it as part of 	TokenNameCOMMENT_LINE	_not_ accept the request. (May want to do it as part of 
// reset(), though.) 	TokenNameCOMMENT_LINE	reset(), though.) 
if	TokenNameif	
(	TokenNameLPAREN	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
contains	TokenNameIdentifier	 contains
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
shouldHardDelete	TokenNameIdentifier	 should Hard Delete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new <code>DTMIterator</code> based on an XPath * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * * @param xpathCompiler ??? Somehow we need to pass in a subpart of the * expression. I hate to do this with strings, since the larger expression * has already been parsed. * * @param pos The position in the expression. * @return The newly created <code>DTMIterator</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMIterator</code> based on an XPath <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * @param xpathCompiler ??? Somehow we need to pass in a subpart of the expression. I hate to do this with strings, since the larger expression has already been parsed. * @param pos The position in the expression. @return The newly created <code>DTMIterator</code>. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
xpathCompiler	TokenNameIdentifier	 xpath Compiler
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
xpathCompiler	TokenNameIdentifier	 xpath Compiler
,	TokenNameCOMMA	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
/** * Create a new <code>DTMIterator</code> based on an XPath * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * * @param xpathString Must be a valid string expressing a * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * * @param presolver An object that can resolve prefixes to namespace URLs. * * @return The newly created <code>DTMIterator</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMIterator</code> based on an XPath <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * @param xpathString Must be a valid string expressing a <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * @param presolver An object that can resolve prefixes to namespace URLs. * @return The newly created <code>DTMIterator</code>. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xpathString	TokenNameIdentifier	 xpath String
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
presolver	TokenNameIdentifier	 presolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
xpathString	TokenNameIdentifier	 xpath String
,	TokenNameCOMMA	
presolver	TokenNameIdentifier	 presolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
/** * Create a new <code>DTMIterator</code> based only on a whatToShow and * a DTMFilter. The traversal semantics are defined as the descendant * access. * * @param whatToShow This flag specifies which node types may appear in * the logical view of the tree presented by the iterator. See the * description of <code>NodeFilter</code> for the set of possible * <code>SHOW_</code> values.These flags can be combined using * <code>OR</code>. * @param filter The <code>NodeFilter</code> to be used with this * <code>TreeWalker</code>, or <code>null</code> to indicate no filter. * @param entityReferenceExpansion The value of this flag determines * whether entity reference nodes are expanded. * * @return The newly created <code>NodeIterator</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMIterator</code> based only on a whatToShow and a DTMFilter. The traversal semantics are defined as the descendant access. * @param whatToShow This flag specifies which node types may appear in the logical view of the tree presented by the iterator. See the description of <code>NodeFilter</code> for the set of possible <code>SHOW_</code> values.These flags can be combined using <code>OR</code>. @param filter The <code>NodeFilter</code> to be used with this <code>TreeWalker</code>, or <code>null</code> to indicate no filter. @param entityReferenceExpansion The value of this flag determines whether entity reference nodes are expanded. * @return The newly created <code>NodeIterator</code>. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
int	TokenNameint	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
DTMFilter	TokenNameIdentifier	 DTM Filter
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
whatToShow	TokenNameIdentifier	 what To Show
,	TokenNameCOMMA	
filter	TokenNameIdentifier	 filter
,	TokenNameCOMMA	
entityReferenceExpansion	TokenNameIdentifier	 entity Reference Expansion
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create a new <code>DTMIterator</code> that holds exactly one node. * * @param node The node handle that the DTMIterator will iterate to. * * @return The newly created <code>DTMIterator</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMIterator</code> that holds exactly one node. * @param node The node handle that the DTMIterator will iterate to. * @return The newly created <code>DTMIterator</code>. 
public	TokenNamepublic	
DTMIterator	TokenNameIdentifier	 DTM Iterator
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// DescendantIterator iter = new DescendantIterator(); 	TokenNameCOMMENT_LINE	DescendantIterator iter = new DescendantIterator(); 
DTMIterator	TokenNameIdentifier	 DTM Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
OneStepIteratorForward	TokenNameIdentifier	 One Step Iterator Forward
(	TokenNameLPAREN	
Axis	TokenNameIdentifier	 Axis
.	TokenNameDOT	
SELF	TokenNameIdentifier	 SELF
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
setRoot	TokenNameIdentifier	 set Root
(	TokenNameLPAREN	
node	TokenNameIdentifier	 node
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
iter	TokenNameIdentifier	 iter
;	TokenNameSEMICOLON	
// return m_dtmManager.createDTMIterator(node); 	TokenNameCOMMENT_LINE	return m_dtmManager.createDTMIterator(node); 
}	TokenNameRBRACE	
/** * Create an XPathContext instance. This is equivalent to calling * the {@link #XPathContext(boolean)} constructor with the value * <code>true</code>. */	TokenNameCOMMENT_JAVADOC	 Create an XPathContext instance. This is equivalent to calling the {@link #XPathContext(boolean)} constructor with the value <code>true</code>. 
public	TokenNamepublic	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XPathContext instance. * @param recursiveVarContext A <code>boolean</code> value indicating whether * the XPath context needs to support pushing of scopes for * variable resolution */	TokenNameCOMMENT_JAVADOC	 Create an XPathContext instance. @param recursiveVarContext A <code>boolean</code> value indicating whether the XPath context needs to support pushing of scopes for variable resolution 
public	TokenNamepublic	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
boolean	TokenNameboolean	
recursiveVarContext	TokenNameIdentifier	 recursive Var Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_saxLocations	TokenNameIdentifier	 m sax Locations
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_variableStacks	TokenNameIdentifier	 m variable Stacks
=	TokenNameEQUAL	
recursiveVarContext	TokenNameIdentifier	 recursive Var Context
?	TokenNameQUESTION	
new	TokenNamenew	
VariableStack	TokenNameIdentifier	 Variable Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
new	TokenNamenew	
VariableStack	TokenNameIdentifier	 Variable Stack
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XPathContext instance. This is equivalent to calling the * constructor {@link #XPathContext(java.lang.Object,boolean)} with the * value of the second parameter set to <code>true</code>. * @param owner Value that can be retrieved via the getOwnerObject() method. * @see #getOwnerObject */	TokenNameCOMMENT_JAVADOC	 Create an XPathContext instance. This is equivalent to calling the constructor {@link #XPathContext(java.lang.Object,boolean)} with the value of the second parameter set to <code>true</code>. @param owner Value that can be retrieved via the getOwnerObject() method. @see #getOwnerObject 
public	TokenNamepublic	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
owner	TokenNameIdentifier	 owner
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Create an XPathContext instance. * @param owner Value that can be retrieved via the getOwnerObject() method. * @see #getOwnerObject * @param recursiveVarContext A <code>boolean</code> value indicating whether * the XPath context needs to support pushing of scopes for * variable resolution */	TokenNameCOMMENT_JAVADOC	 Create an XPathContext instance. @param owner Value that can be retrieved via the getOwnerObject() method. @see #getOwnerObject @param recursiveVarContext A <code>boolean</code> value indicating whether the XPath context needs to support pushing of scopes for variable resolution 
public	TokenNamepublic	
XPathContext	TokenNameIdentifier	 X Path Context
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
owner	TokenNameIdentifier	 owner
,	TokenNameCOMMA	
boolean	TokenNameboolean	
recursiveVarContext	TokenNameIdentifier	 recursive Var Context
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
(	TokenNameLPAREN	
recursiveVarContext	TokenNameIdentifier	 recursive Var Context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_owner	TokenNameIdentifier	 m owner
=	TokenNameEQUAL	
owner	TokenNameIdentifier	 owner
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_ownerGetErrorListener	TokenNameIdentifier	 m owner Get Error Listener
=	TokenNameEQUAL	
m_owner	TokenNameIdentifier	 m owner
.	TokenNameDOT	
getClass	TokenNameIdentifier	 get Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getMethod	TokenNameIdentifier	 get Method
(	TokenNameLPAREN	
"getErrorListener"	TokenNameStringLiteral	getErrorListener
,	TokenNameCOMMA	
new	TokenNamenew	
Class	TokenNameIdentifier	 Class
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NoSuchMethodException	TokenNameIdentifier	 No Such Method Exception
nsme	TokenNameIdentifier	 nsme
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Reset for new run. */	TokenNameCOMMENT_JAVADOC	 Reset for new run. 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
releaseDTMXRTreeFrags	TokenNameIdentifier	 release DTMXR Tree Frags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// These couldn't be disposed of earlier (see comments in release()); zap them now. 	TokenNameCOMMENT_LINE	These couldn't be disposed of earlier (see comments in release()); zap them now. 
if	TokenNameif	
(	TokenNameLPAREN	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
for	TokenNamefor	
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
e	TokenNameIdentifier	 e
=	TokenNameEQUAL	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
elements	TokenNameIdentifier	 elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
)	TokenNameRPAREN	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
)	TokenNameRPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// drop our references too 	TokenNameCOMMENT_LINE	drop our references too 
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_global_rtfdtm	TokenNameIdentifier	 m global rtfdtm
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
m_global_rtfdtm	TokenNameIdentifier	 m global rtfdtm
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_global_rtfdtm	TokenNameIdentifier	 m global rtfdtm
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
=	TokenNameEQUAL	
DTMManager	TokenNameIdentifier	 DTM Manager
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
objects	TokenNameIdentifier	 objects
.	TokenNameDOT	
XMLStringFactoryImpl	TokenNameIdentifier	 XML String Factory Impl
.	TokenNameDOT	
getFactory	TokenNameIdentifier	 get Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_saxLocations	TokenNameIdentifier	 m sax Locations
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_iteratorRoots	TokenNameIdentifier	 m iterator Roots
.	TokenNameDOT	
RemoveAllNoClear	TokenNameIdentifier	 Remove All No Clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_predicatePos	TokenNameIdentifier	 m predicate Pos
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_predicateRoots	TokenNameIdentifier	 m predicate Roots
.	TokenNameDOT	
RemoveAllNoClear	TokenNameIdentifier	 Remove All No Clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
removeAllElements	TokenNameIdentifier	 remove All Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_saxLocations	TokenNameIdentifier	 m sax Locations
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The current stylesheet locator. */	TokenNameCOMMENT_JAVADOC	 The current stylesheet locator. 
ObjectStack	TokenNameIdentifier	 Object Stack
m_saxLocations	TokenNameIdentifier	 m sax Locations
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectStack	TokenNameIdentifier	 Object Stack
(	TokenNameLPAREN	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Set the current locater in the stylesheet. * * @param location The location within the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Set the current locater in the stylesheet. * @param location The location within the stylesheet. 
public	TokenNamepublic	
void	TokenNamevoid	
setSAXLocator	TokenNameIdentifier	 set SAX Locator
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_saxLocations	TokenNameIdentifier	 m sax Locations
.	TokenNameDOT	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current locater in the stylesheet. * * @param location The location within the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Set the current locater in the stylesheet. * @param location The location within the stylesheet. 
public	TokenNamepublic	
void	TokenNamevoid	
pushSAXLocator	TokenNameIdentifier	 push SAX Locator
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_saxLocations	TokenNameIdentifier	 m sax Locations
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
location	TokenNameIdentifier	 location
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push a slot on the locations stack so that setSAXLocator can be * repeatedly called. * */	TokenNameCOMMENT_JAVADOC	 Push a slot on the locations stack so that setSAXLocator can be repeatedly called. 
public	TokenNamepublic	
void	TokenNamevoid	
pushSAXLocatorNull	TokenNameIdentifier	 push SAX Locator Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_saxLocations	TokenNameIdentifier	 m sax Locations
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current locater. */	TokenNameCOMMENT_JAVADOC	 Pop the current locater. 
public	TokenNamepublic	
void	TokenNamevoid	
popSAXLocator	TokenNameIdentifier	 pop SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_saxLocations	TokenNameIdentifier	 m sax Locations
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current locater in the stylesheet. * * @return The location within the stylesheet, or null if not known. */	TokenNameCOMMENT_JAVADOC	 Get the current locater in the stylesheet. * @return The location within the stylesheet, or null if not known. 
public	TokenNamepublic	
SourceLocator	TokenNameIdentifier	 Source Locator
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
)	TokenNameRPAREN	
m_saxLocations	TokenNameIdentifier	 m sax Locations
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** The owner context of this XPathContext. In the case of XSLT, this will be a * Transformer object. */	TokenNameCOMMENT_JAVADOC	 The owner context of this XPathContext. In the case of XSLT, this will be a Transformer object. 
private	TokenNameprivate	
Object	TokenNameIdentifier	 Object
m_owner	TokenNameIdentifier	 m owner
;	TokenNameSEMICOLON	
/** The owner context of this XPathContext. In the case of XSLT, this will be a * Transformer object. */	TokenNameCOMMENT_JAVADOC	 The owner context of this XPathContext. In the case of XSLT, this will be a Transformer object. 
private	TokenNameprivate	
Method	TokenNameIdentifier	 Method
m_ownerGetErrorListener	TokenNameIdentifier	 m owner Get Error Listener
;	TokenNameSEMICOLON	
/** * Get the "owner" context of this context, which should be, * in the case of XSLT, the Transformer object. This is needed * so that XSLT functions can get the Transformer. * @return The owner object passed into the constructor, or null. */	TokenNameCOMMENT_JAVADOC	 Get the "owner" context of this context, which should be, in the case of XSLT, the Transformer object. This is needed so that XSLT functions can get the Transformer. @return The owner object passed into the constructor, or null. 
public	TokenNamepublic	
Object	TokenNameIdentifier	 Object
getOwnerObject	TokenNameIdentifier	 get Owner Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_owner	TokenNameIdentifier	 m owner
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================ VarStack =================== 	TokenNameCOMMENT_LINE	================ VarStack =================== 
/** * The stack of Variable stacks. A VariableStack will be * pushed onto this stack for each template invocation. */	TokenNameCOMMENT_JAVADOC	 The stack of Variable stacks. A VariableStack will be pushed onto this stack for each template invocation. 
private	TokenNameprivate	
VariableStack	TokenNameIdentifier	 Variable Stack
m_variableStacks	TokenNameIdentifier	 m variable Stacks
;	TokenNameSEMICOLON	
/** * Get the variable stack, which is in charge of variables and * parameters. * * @return the variable stack, which should not be null. */	TokenNameCOMMENT_JAVADOC	 Get the variable stack, which is in charge of variables and parameters. * @return the variable stack, which should not be null. 
public	TokenNamepublic	
final	TokenNamefinal	
VariableStack	TokenNameIdentifier	 Variable Stack
getVarStack	TokenNameIdentifier	 get Var Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_variableStacks	TokenNameIdentifier	 m variable Stacks
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the variable stack, which is in charge of variables and * parameters. * * @param varStack non-null reference to the variable stack. */	TokenNameCOMMENT_JAVADOC	 Get the variable stack, which is in charge of variables and parameters. * @param varStack non-null reference to the variable stack. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setVarStack	TokenNameIdentifier	 set Var Stack
(	TokenNameLPAREN	
VariableStack	TokenNameIdentifier	 Variable Stack
varStack	TokenNameIdentifier	 var Stack
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_variableStacks	TokenNameIdentifier	 m variable Stacks
=	TokenNameEQUAL	
varStack	TokenNameIdentifier	 var Stack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================ SourceTreeManager =================== 	TokenNameCOMMENT_LINE	================ SourceTreeManager =================== 
/** The source tree manager, which associates Source objects to source * tree nodes. */	TokenNameCOMMENT_JAVADOC	 The source tree manager, which associates Source objects to source tree nodes. 
private	TokenNameprivate	
SourceTreeManager	TokenNameIdentifier	 Source Tree Manager
m_sourceTreeManager	TokenNameIdentifier	 m source Tree Manager
=	TokenNameEQUAL	
new	TokenNamenew	
SourceTreeManager	TokenNameIdentifier	 Source Tree Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the SourceTreeManager associated with this execution context. * * @return the SourceTreeManager associated with this execution context. */	TokenNameCOMMENT_JAVADOC	 Get the SourceTreeManager associated with this execution context. * @return the SourceTreeManager associated with this execution context. 
public	TokenNamepublic	
final	TokenNamefinal	
SourceTreeManager	TokenNameIdentifier	 Source Tree Manager
getSourceTreeManager	TokenNameIdentifier	 get Source Tree Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_sourceTreeManager	TokenNameIdentifier	 m source Tree Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the SourceTreeManager associated with this execution context. * * @param mgr the SourceTreeManager to be associated with this * execution context. */	TokenNameCOMMENT_JAVADOC	 Set the SourceTreeManager associated with this execution context. * @param mgr the SourceTreeManager to be associated with this execution context. 
public	TokenNamepublic	
void	TokenNamevoid	
setSourceTreeManager	TokenNameIdentifier	 set Source Tree Manager
(	TokenNameLPAREN	
SourceTreeManager	TokenNameIdentifier	 Source Tree Manager
mgr	TokenNameIdentifier	 mgr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_sourceTreeManager	TokenNameIdentifier	 m source Tree Manager
=	TokenNameEQUAL	
mgr	TokenNameIdentifier	 mgr
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================================================= 	TokenNameCOMMENT_LINE	================================================= 
/** The ErrorListener where errors and warnings are to be reported. */	TokenNameCOMMENT_JAVADOC	 The ErrorListener where errors and warnings are to be reported. 
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
m_errorListener	TokenNameIdentifier	 m error Listener
;	TokenNameSEMICOLON	
/** A default ErrorListener in case our m_errorListener was not specified and our * owner either does not have an ErrorListener or has a null one. */	TokenNameCOMMENT_JAVADOC	 A default ErrorListener in case our m_errorListener was not specified and our owner either does not have an ErrorListener or has a null one. 
private	TokenNameprivate	
ErrorListener	TokenNameIdentifier	 Error Listener
m_defaultErrorListener	TokenNameIdentifier	 m default Error Listener
;	TokenNameSEMICOLON	
/** * Get the ErrorListener where errors and warnings are to be reported. * * @return A non-null ErrorListener reference. */	TokenNameCOMMENT_JAVADOC	 Get the ErrorListener where errors and warnings are to be reported. * @return A non-null ErrorListener reference. 
public	TokenNamepublic	
final	TokenNamefinal	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_errorListener	TokenNameIdentifier	 m error Listener
)	TokenNameRPAREN	
return	TokenNamereturn	
m_errorListener	TokenNameIdentifier	 m error Listener
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_ownerGetErrorListener	TokenNameIdentifier	 m owner Get Error Listener
)	TokenNameRPAREN	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ErrorListener	TokenNameIdentifier	 Error Listener
)	TokenNameRPAREN	
m_ownerGetErrorListener	TokenNameIdentifier	 m owner Get Error Listener
.	TokenNameDOT	
invoke	TokenNameIdentifier	 invoke
(	TokenNameLPAREN	
m_owner	TokenNameIdentifier	 m owner
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
retval	TokenNameIdentifier	 retval
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_defaultErrorListener	TokenNameIdentifier	 m default Error Listener
)	TokenNameRPAREN	
m_defaultErrorListener	TokenNameIdentifier	 m default Error Listener
=	TokenNameEQUAL	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
DefaultErrorHandler	TokenNameIdentifier	 Default Error Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
retval	TokenNameIdentifier	 retval
=	TokenNameEQUAL	
m_defaultErrorListener	TokenNameIdentifier	 m default Error Listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
retval	TokenNameIdentifier	 retval
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the ErrorListener where errors and warnings are to be reported. * * @param listener A non-null ErrorListener reference. */	TokenNameCOMMENT_JAVADOC	 Set the ErrorListener where errors and warnings are to be reported. * @param listener A non-null ErrorListener reference. 
public	TokenNamepublic	
void	TokenNamevoid	
setErrorListener	TokenNameIdentifier	 set Error Listener
(	TokenNameLPAREN	
ErrorListener	TokenNameIdentifier	 Error Listener
listener	TokenNameIdentifier	 listener
)	TokenNameRPAREN	
throws	TokenNamethrows	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
listener	TokenNameIdentifier	 listener
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
IllegalArgumentException	TokenNameIdentifier	 Illegal Argument Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createXPATHMessage	TokenNameIdentifier	 create XPATH Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_NULL_ERROR_HANDLER	TokenNameIdentifier	 ER  NULL  ERROR  HANDLER
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Null error handler"); 	TokenNameCOMMENT_LINE	"Null error handler"); 
m_errorListener	TokenNameIdentifier	 m error Listener
=	TokenNameEQUAL	
listener	TokenNameIdentifier	 listener
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================================================= 	TokenNameCOMMENT_LINE	================================================= 
/** The TrAX URI Resolver for resolving URIs from the document(...) * function to source tree nodes. */	TokenNameCOMMENT_JAVADOC	 The TrAX URI Resolver for resolving URIs from the document(...) function to source tree nodes. 
private	TokenNameprivate	
URIResolver	TokenNameIdentifier	 URI Resolver
m_uriResolver	TokenNameIdentifier	 m uri Resolver
;	TokenNameSEMICOLON	
/** * Get the URIResolver associated with this execution context. * * @return a URI resolver, which may be null. */	TokenNameCOMMENT_JAVADOC	 Get the URIResolver associated with this execution context. * @return a URI resolver, which may be null. 
public	TokenNamepublic	
final	TokenNamefinal	
URIResolver	TokenNameIdentifier	 URI Resolver
getURIResolver	TokenNameIdentifier	 get URI Resolver
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the URIResolver associated with this execution context. * * @param resolver the URIResolver to be associated with this * execution context, may be null to clear an already set resolver. */	TokenNameCOMMENT_JAVADOC	 Set the URIResolver associated with this execution context. * @param resolver the URIResolver to be associated with this execution context, may be null to clear an already set resolver. 
public	TokenNamepublic	
void	TokenNamevoid	
setURIResolver	TokenNameIdentifier	 set URI Resolver
(	TokenNameLPAREN	
URIResolver	TokenNameIdentifier	 URI Resolver
resolver	TokenNameIdentifier	 resolver
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_uriResolver	TokenNameIdentifier	 m uri Resolver
=	TokenNameEQUAL	
resolver	TokenNameIdentifier	 resolver
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================================================= 	TokenNameCOMMENT_LINE	================================================= 
/** The reader of the primary source tree. */	TokenNameCOMMENT_JAVADOC	 The reader of the primary source tree. 
public	TokenNamepublic	
XMLReader	TokenNameIdentifier	 XML Reader
m_primaryReader	TokenNameIdentifier	 m primary Reader
;	TokenNameSEMICOLON	
/** * Get primary XMLReader associated with this execution context. * * @return The reader of the primary source tree. */	TokenNameCOMMENT_JAVADOC	 Get primary XMLReader associated with this execution context. * @return The reader of the primary source tree. 
public	TokenNamepublic	
final	TokenNamefinal	
XMLReader	TokenNameIdentifier	 XML Reader
getPrimaryReader	TokenNameIdentifier	 get Primary Reader
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_primaryReader	TokenNameIdentifier	 m primary Reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set primary XMLReader associated with this execution context. * * @param reader The reader of the primary source tree. */	TokenNameCOMMENT_JAVADOC	 Set primary XMLReader associated with this execution context. * @param reader The reader of the primary source tree. 
public	TokenNamepublic	
void	TokenNamevoid	
setPrimaryReader	TokenNameIdentifier	 set Primary Reader
(	TokenNameLPAREN	
XMLReader	TokenNameIdentifier	 XML Reader
reader	TokenNameIdentifier	 reader
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_primaryReader	TokenNameIdentifier	 m primary Reader
=	TokenNameEQUAL	
reader	TokenNameIdentifier	 reader
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// ================================================= 	TokenNameCOMMENT_LINE	================================================= 
/** Misnamed string manager for XPath messages. */	TokenNameCOMMENT_JAVADOC	 Misnamed string manager for XPath messages. 
// private static XSLMessages m_XSLMessages = new XSLMessages(); 	TokenNameCOMMENT_LINE	private static XSLMessages m_XSLMessages = new XSLMessages(); 
/** * Tell the user of an assertion error, and probably throw an * exception. * * @param b If false, a TransformerException will be thrown. * @param msg The assertion message, which should be informative. * * @throws javax.xml.transform.TransformerException if b is false. */	TokenNameCOMMENT_JAVADOC	 Tell the user of an assertion error, and probably throw an exception. * @param b If false, a TransformerException will be thrown. @param msg The assertion message, which should be informative. * @throws javax.xml.transform.TransformerException if b is false. 
private	TokenNameprivate	
void	TokenNamevoid	
assertion	TokenNameIdentifier	 assertion
(	TokenNameLPAREN	
boolean	TokenNameboolean	
b	TokenNameIdentifier	 b
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
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
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
b	TokenNameIdentifier	 b
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ErrorListener	TokenNameIdentifier	 Error Listener
errorHandler	TokenNameIdentifier	 error Handler
=	TokenNameEQUAL	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
errorHandler	TokenNameIdentifier	 error Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errorHandler	TokenNameIdentifier	 error Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XPATHErrorResources	TokenNameIdentifier	 XPATH Error Resources
.	TokenNameDOT	
ER_INCORRECT_PROGRAMMER_ASSERTION	TokenNameIdentifier	 ER  INCORRECT  PROGRAMMER  ASSERTION
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
msg	TokenNameIdentifier	 msg
}	TokenNameRBRACE	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
(	TokenNameLPAREN	
SAXSourceLocator	TokenNameIdentifier	 SAX Source Locator
)	TokenNameRPAREN	
this	TokenNamethis	
.	TokenNameDOT	
getSAXLocator	TokenNameIdentifier	 get SAX Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
// SECTION: Execution context state tracking 	TokenNameCOMMENT_LINE	SECTION: Execution context state tracking 
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
/** * The current context node list. */	TokenNameCOMMENT_JAVADOC	 The current context node list. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Stack	TokenNameIdentifier	 Stack
getContextNodeListsStack	TokenNameIdentifier	 get Context Node Lists Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setContextNodeListsStack	TokenNameIdentifier	 set Context Node Lists Stack
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current context node list. * * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>, * also refered to here as a <term>context node list</term>. */	TokenNameCOMMENT_JAVADOC	 Get the current context node list. * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>, also refered to here as a <term>context node list</term>. 
public	TokenNamepublic	
final	TokenNamefinal	
DTMIterator	TokenNameIdentifier	 DTM Iterator
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
return	TokenNamereturn	
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
)	TokenNameRPAREN	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current context node list. * * @param nl the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>, * also refered to here as a <term>context node list</term>. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Set the current context node list. * @param nl the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>, also refered to here as a <term>context node list</term>. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushContextNodeList	TokenNameIdentifier	 push Context Node List
(	TokenNameLPAREN	
DTMIterator	TokenNameIdentifier	 DTM Iterator
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
nl	TokenNameIdentifier	 nl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current context node list. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Pop the current context node list. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popContextNodeList	TokenNameIdentifier	 pop Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
err	TokenNameIdentifier	 err
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Warning: popContextNodeList when stack is empty!"	TokenNameStringLiteral	Warning: popContextNodeList when stack is empty!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_contextNodeLists	TokenNameIdentifier	 m context Node Lists
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The ammount to use for stacks that record information during the * recursive execution. */	TokenNameCOMMENT_JAVADOC	 The ammount to use for stacks that record information during the recursive execution. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1024	TokenNameIntegerLiteral	
*	TokenNameMULTIPLY	
4	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** The stack of <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a> objects. * Not to be confused with the current node list. %REVIEW% Note that there * are no bounds check and resize for this stack, so if it is blown, it's all * over. */	TokenNameCOMMENT_JAVADOC	 The stack of <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a> objects. Not to be confused with the current node list. %REVIEW% Note that there are no bounds check and resize for this stack, so if it is blown, it's all over. 
private	TokenNameprivate	
IntStack	TokenNameIdentifier	 Int Stack
m_currentNodes	TokenNameIdentifier	 m current Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// private NodeVector m_currentNodes = new NodeVector(); 	TokenNameCOMMENT_LINE	private NodeVector m_currentNodes = new NodeVector(); 
public	TokenNamepublic	
IntStack	TokenNameIdentifier	 Int Stack
getCurrentNodeStack	TokenNameIdentifier	 get Current Node Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentNodes	TokenNameIdentifier	 m current Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentNodeStack	TokenNameIdentifier	 set Current Node Stack
(	TokenNameLPAREN	
IntStack	TokenNameIdentifier	 Int Stack
nv	TokenNameIdentifier	 nv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNodes	TokenNameIdentifier	 m current Nodes
=	TokenNameEQUAL	
nv	TokenNameIdentifier	 nv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current context node. * * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. */	TokenNameCOMMENT_JAVADOC	 Get the current context node. * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current context node and expression node. * * @param cn the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. * @param en the sub-expression context node. */	TokenNameCOMMENT_JAVADOC	 Set the current context node and expression node. * @param cn the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. @param en the sub-expression context node. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushCurrentNodeAndExpression	TokenNameIdentifier	 push Current Node And Expression
(	TokenNameLPAREN	
int	TokenNameint	
cn	TokenNameIdentifier	 cn
,	TokenNameCOMMA	
int	TokenNameint	
en	TokenNameIdentifier	 en
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
cn	TokenNameIdentifier	 cn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
cn	TokenNameIdentifier	 cn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current context node. */	TokenNameCOMMENT_JAVADOC	 Set the current context node. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popCurrentNodeAndExpression	TokenNameIdentifier	 pop Current Node And Expression
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push the current context node, expression node, and prefix resolver. * * @param cn the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. * @param en the sub-expression context node. * @param nc the namespace context (prefix resolver. */	TokenNameCOMMENT_JAVADOC	 Push the current context node, expression node, and prefix resolver. * @param cn the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. @param en the sub-expression context node. @param nc the namespace context (prefix resolver. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushExpressionState	TokenNameIdentifier	 push Expression State
(	TokenNameLPAREN	
int	TokenNameint	
cn	TokenNameIdentifier	 cn
,	TokenNameCOMMA	
int	TokenNameint	
en	TokenNameIdentifier	 en
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
nc	TokenNameIdentifier	 nc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
cn	TokenNameIdentifier	 cn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
cn	TokenNameIdentifier	 cn
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
nc	TokenNameIdentifier	 nc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current context node, expression node, and prefix resolver. */	TokenNameCOMMENT_JAVADOC	 Pop the current context node, expression node, and prefix resolver. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popExpressionState	TokenNameIdentifier	 pop Expression State
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current context node. * * @param n the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. */	TokenNameCOMMENT_JAVADOC	 Set the current context node. * @param n the <a href="http://www.w3.org/TR/xslt#dt-current-node">current node</a>. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushCurrentNode	TokenNameIdentifier	 push Current Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current context node. */	TokenNameCOMMENT_JAVADOC	 Pop the current context node. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popCurrentNode	TokenNameIdentifier	 pop Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentNodes	TokenNameIdentifier	 m current Nodes
.	TokenNameDOT	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current predicate root. */	TokenNameCOMMENT_JAVADOC	 Set the current predicate root. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushPredicateRoot	TokenNameIdentifier	 push Predicate Root
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicateRoots	TokenNameIdentifier	 m predicate Roots
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current predicate root. */	TokenNameCOMMENT_JAVADOC	 Pop the current predicate root. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popPredicateRoot	TokenNameIdentifier	 pop Predicate Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicateRoots	TokenNameIdentifier	 m predicate Roots
.	TokenNameDOT	
popQuick	TokenNameIdentifier	 pop Quick
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current predicate root. */	TokenNameCOMMENT_JAVADOC	 Get the current predicate root. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getPredicateRoot	TokenNameIdentifier	 get Predicate Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_predicateRoots	TokenNameIdentifier	 m predicate Roots
.	TokenNameDOT	
peepOrNull	TokenNameIdentifier	 peep Or Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current location path iterator root. */	TokenNameCOMMENT_JAVADOC	 Set the current location path iterator root. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushIteratorRoot	TokenNameIdentifier	 push Iterator Root
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_iteratorRoots	TokenNameIdentifier	 m iterator Roots
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current location path iterator root. */	TokenNameCOMMENT_JAVADOC	 Pop the current location path iterator root. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popIteratorRoot	TokenNameIdentifier	 pop Iterator Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_iteratorRoots	TokenNameIdentifier	 m iterator Roots
.	TokenNameDOT	
popQuick	TokenNameIdentifier	 pop Quick
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current location path iterator root. */	TokenNameCOMMENT_JAVADOC	 Get the current location path iterator root. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getIteratorRoot	TokenNameIdentifier	 get Iterator Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_iteratorRoots	TokenNameIdentifier	 m iterator Roots
.	TokenNameDOT	
peepOrNull	TokenNameIdentifier	 peep Or Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** A stack of the current sub-expression nodes. */	TokenNameCOMMENT_JAVADOC	 A stack of the current sub-expression nodes. 
private	TokenNameprivate	
NodeVector	TokenNameIdentifier	 Node Vector
m_iteratorRoots	TokenNameIdentifier	 m iterator Roots
=	TokenNameEQUAL	
new	TokenNamenew	
NodeVector	TokenNameIdentifier	 Node Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A stack of the current sub-expression nodes. */	TokenNameCOMMENT_JAVADOC	 A stack of the current sub-expression nodes. 
private	TokenNameprivate	
NodeVector	TokenNameIdentifier	 Node Vector
m_predicateRoots	TokenNameIdentifier	 m predicate Roots
=	TokenNameEQUAL	
new	TokenNamenew	
NodeVector	TokenNameIdentifier	 Node Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** A stack of the current sub-expression nodes. */	TokenNameCOMMENT_JAVADOC	 A stack of the current sub-expression nodes. 
private	TokenNameprivate	
IntStack	TokenNameIdentifier	 Int Stack
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
IntStack	TokenNameIdentifier	 Int Stack
getCurrentExpressionNodeStack	TokenNameIdentifier	 get Current Expression Node Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setCurrentExpressionNodeStack	TokenNameIdentifier	 set Current Expression Node Stack
(	TokenNameLPAREN	
IntStack	TokenNameIdentifier	 Int Stack
nv	TokenNameIdentifier	 nv
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
=	TokenNameEQUAL	
nv	TokenNameIdentifier	 nv
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
IntStack	TokenNameIdentifier	 Int Stack
m_predicatePos	TokenNameIdentifier	 m predicate Pos
=	TokenNameEQUAL	
new	TokenNamenew	
IntStack	TokenNameIdentifier	 Int Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getPredicatePos	TokenNameIdentifier	 get Predicate Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_predicatePos	TokenNameIdentifier	 m predicate Pos
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushPredicatePos	TokenNameIdentifier	 push Predicate Pos
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicatePos	TokenNameIdentifier	 m predicate Pos
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popPredicatePos	TokenNameIdentifier	 pop Predicate Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_predicatePos	TokenNameIdentifier	 m predicate Pos
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current node that is the expression's context (i.e. for current() support). * * @return The current sub-expression node. */	TokenNameCOMMENT_JAVADOC	 Get the current node that is the expression's context (i.e. for current() support). * @return The current sub-expression node. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getCurrentExpressionNode	TokenNameIdentifier	 get Current Expression Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the current node that is the expression's context (i.e. for current() support). * * @param n The sub-expression node to be current. */	TokenNameCOMMENT_JAVADOC	 Set the current node that is the expression's context (i.e. for current() support). * @param n The sub-expression node to be current. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushCurrentExpressionNode	TokenNameIdentifier	 push Current Expression Node
(	TokenNameLPAREN	
int	TokenNameint	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current node that is the expression's context * (i.e. for current() support). */	TokenNameCOMMENT_JAVADOC	 Pop the current node that is the expression's context (i.e. for current() support). 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popCurrentExpressionNode	TokenNameIdentifier	 pop Current Expression Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_currentExpressionNodes	TokenNameIdentifier	 m current Expression Nodes
.	TokenNameDOT	
quickPop	TokenNameIdentifier	 quick Pop
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
private	TokenNameprivate	
ObjectStack	TokenNameIdentifier	 Object Stack
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
=	TokenNameEQUAL	
new	TokenNamenew	
ObjectStack	TokenNameIdentifier	 Object Stack
(	TokenNameLPAREN	
RECURSIONLIMIT	TokenNameIdentifier	 RECURSIONLIMIT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the current namespace context for the xpath. * * @return the current prefix resolver for resolving prefixes to * namespace URLs. */	TokenNameCOMMENT_JAVADOC	 Get the current namespace context for the xpath. * @return the current prefix resolver for resolving prefixes to namespace URLs. 
public	TokenNamepublic	
final	TokenNamefinal	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
getNamespaceContext	TokenNameIdentifier	 get Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
)	TokenNameRPAREN	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current namespace context for the xpath. * * @param pr the prefix resolver to be used for resolving prefixes to * namespace URLs. */	TokenNameCOMMENT_JAVADOC	 Get the current namespace context for the xpath. * @param pr the prefix resolver to be used for resolving prefixes to namespace URLs. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setNamespaceContext	TokenNameIdentifier	 set Namespace Context
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
pr	TokenNameIdentifier	 pr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
setTop	TokenNameIdentifier	 set Top
(	TokenNameLPAREN	
pr	TokenNameIdentifier	 pr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push a current namespace context for the xpath. * * @param pr the prefix resolver to be used for resolving prefixes to * namespace URLs. */	TokenNameCOMMENT_JAVADOC	 Push a current namespace context for the xpath. * @param pr the prefix resolver to be used for resolving prefixes to namespace URLs. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushNamespaceContext	TokenNameIdentifier	 push Namespace Context
(	TokenNameLPAREN	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
pr	TokenNameIdentifier	 pr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
pr	TokenNameIdentifier	 pr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Just increment the namespace contest stack, so that setNamespaceContext * can be used on the slot. */	TokenNameCOMMENT_JAVADOC	 Just increment the namespace contest stack, so that setNamespaceContext can be used on the slot. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushNamespaceContextNull	TokenNameIdentifier	 push Namespace Context Null
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the current namespace context for the xpath. */	TokenNameCOMMENT_JAVADOC	 Pop the current namespace context for the xpath. 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popNamespaceContext	TokenNameIdentifier	 pop Namespace Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_prefixResolvers	TokenNameIdentifier	 m prefix Resolvers
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
// SECTION: Current TreeWalker contexts (for internal use) 	TokenNameCOMMENT_LINE	SECTION: Current TreeWalker contexts (for internal use) 
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
/** * Stack of AxesIterators. */	TokenNameCOMMENT_JAVADOC	 Stack of AxesIterators. 
private	TokenNameprivate	
Stack	TokenNameIdentifier	 Stack
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
=	TokenNameEQUAL	
new	TokenNamenew	
Stack	TokenNameIdentifier	 Stack
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Stack	TokenNameIdentifier	 Stack
getAxesIteratorStackStacks	TokenNameIdentifier	 get Axes Iterator Stack Stacks
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
void	TokenNamevoid	
setAxesIteratorStackStacks	TokenNameIdentifier	 set Axes Iterator Stack Stacks
(	TokenNameLPAREN	
Stack	TokenNameIdentifier	 Stack
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push a TreeWalker on the stack. * * @param iter A sub-context AxesWalker. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Push a TreeWalker on the stack. * @param iter A sub-context AxesWalker. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
pushSubContextList	TokenNameIdentifier	 push Sub Context List
(	TokenNameLPAREN	
SubContextList	TokenNameIdentifier	 Sub Context List
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
iter	TokenNameIdentifier	 iter
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop the last pushed axes iterator. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Pop the last pushed axes iterator. @xsl.usage internal 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
popSubContextList	TokenNameIdentifier	 pop Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current axes iterator, or return null if none. * * @return the sub-context node list. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the current axes iterator, or return null if none. * @return the sub-context node list. @xsl.usage internal 
public	TokenNamepublic	
SubContextList	TokenNameIdentifier	 Sub Context List
getSubContextList	TokenNameIdentifier	 get Sub Context List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
(	TokenNameLPAREN	
SubContextList	TokenNameIdentifier	 Sub Context List
)	TokenNameRPAREN	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
.	TokenNameDOT	
peek	TokenNameIdentifier	 peek
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a> * as defined by the XSLT spec. * * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>. * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Get the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a> as defined by the XSLT spec. * @return the <a href="http://www.w3.org/TR/xslt#dt-current-node-list">current node list</a>. @xsl.usage internal 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
axes	TokenNameIdentifier	 axes
.	TokenNameDOT	
SubContextList	TokenNameIdentifier	 Sub Context List
getCurrentNodeList	TokenNameIdentifier	 get Current Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
.	TokenNameDOT	
isEmpty	TokenNameIdentifier	 is Empty
(	TokenNameLPAREN	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
(	TokenNameLPAREN	
SubContextList	TokenNameIdentifier	 Sub Context List
)	TokenNameRPAREN	
m_axesIteratorStack	TokenNameIdentifier	 m axes Iterator Stack
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
// SECTION: Implementation of ExpressionContext interface 	TokenNameCOMMENT_LINE	SECTION: Implementation of ExpressionContext interface 
//========================================================== 	TokenNameCOMMENT_LINE	========================================================== 
/** * Get the current context node. * @return The current context node. */	TokenNameCOMMENT_JAVADOC	 Get the current context node. @return The current context node. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current context node list. * @return An iterator for the current context list, as * defined in XSLT. */	TokenNameCOMMENT_JAVADOC	 Get the current context node list. @return An iterator for the current context list, as defined in XSLT. 
public	TokenNamepublic	
final	TokenNamefinal	
DTMIterator	TokenNameIdentifier	 DTM Iterator
getContextNodes	TokenNameIdentifier	 get Context Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
DTMIterator	TokenNameIdentifier	 DTM Iterator
cnl	TokenNameIdentifier	 cnl
=	TokenNameEQUAL	
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
cnl	TokenNameIdentifier	 cnl
)	TokenNameRPAREN	
return	TokenNamereturn	
cnl	TokenNameIdentifier	 cnl
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// for now... this might ought to be an empty iterator. 	TokenNameCOMMENT_LINE	for now... this might ought to be an empty iterator. 
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CloneNotSupportedException	TokenNameIdentifier	 Clone Not Supported Exception
cnse	TokenNameIdentifier	 cnse
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// error reporting? 	TokenNameCOMMENT_LINE	error reporting? 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
XPathExpressionContext	TokenNameIdentifier	 X Path Expression Context
expressionContext	TokenNameIdentifier	 expression Context
=	TokenNameEQUAL	
new	TokenNamenew	
XPathExpressionContext	TokenNameIdentifier	 X Path Expression Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * The the expression context for extensions for this context. * * @return An object that implements the ExpressionContext. */	TokenNameCOMMENT_JAVADOC	 The the expression context for extensions for this context. * @return An object that implements the ExpressionContext. 
public	TokenNamepublic	
ExpressionContext	TokenNameIdentifier	 Expression Context
getExpressionContext	TokenNameIdentifier	 get Expression Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
expressionContext	TokenNameIdentifier	 expression Context
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
public	TokenNamepublic	
class	TokenNameclass	
XPathExpressionContext	TokenNameIdentifier	 X Path Expression Context
implements	TokenNameimplements	
ExpressionContext	TokenNameIdentifier	 Expression Context
{	TokenNameLBRACE	
/** * Return the XPathContext associated with this XPathExpressionContext. * Extensions should use this judiciously and only when special processing * requirements cannot be met another way. Consider requesting an enhancement * to the ExpressionContext interface to avoid having to call this method. * @return the XPathContext associated with this XPathExpressionContext. */	TokenNameCOMMENT_JAVADOC	 Return the XPathContext associated with this XPathExpressionContext. Extensions should use this judiciously and only when special processing requirements cannot be met another way. Consider requesting an enhancement to the ExpressionContext interface to avoid having to call this method. @return the XPathContext associated with this XPathExpressionContext. 
public	TokenNamepublic	
XPathContext	TokenNameIdentifier	 X Path Context
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XPathContext	TokenNameIdentifier	 X Path Context
.	TokenNameDOT	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the DTMManager object. Though XPathContext context extends * the DTMManager, it really is a proxy for the real DTMManager. If a * caller needs to make a lot of calls to the DTMManager, it is faster * if it gets the real one from this function. */	TokenNameCOMMENT_JAVADOC	 Return the DTMManager object. Though XPathContext context extends the DTMManager, it really is a proxy for the real DTMManager. If a caller needs to make a lot of calls to the DTMManager, it is faster if it gets the real one from this function. 
public	TokenNamepublic	
DTMManager	TokenNameIdentifier	 DTM Manager
getDTMManager	TokenNameIdentifier	 get DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current context node. * @return The current context node. */	TokenNameCOMMENT_JAVADOC	 Get the current context node. @return The current context node. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
getContextNode	TokenNameIdentifier	 get Context Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
context	TokenNameIdentifier	 context
=	TokenNameEQUAL	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
context	TokenNameIdentifier	 context
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the current context node list. * @return An iterator for the current context list, as * defined in XSLT. */	TokenNameCOMMENT_JAVADOC	 Get the current context node list. @return An iterator for the current context list, as defined in XSLT. 
public	TokenNamepublic	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
traversal	TokenNameIdentifier	 traversal
.	TokenNameDOT	
NodeIterator	TokenNameIdentifier	 Node Iterator
getContextNodes	TokenNameIdentifier	 get Context Nodes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeIterator	TokenNameIdentifier	 DTM Node Iterator
(	TokenNameLPAREN	
getContextNodeList	TokenNameIdentifier	 get Context Node List
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the error listener. * @return The registered error listener. */	TokenNameCOMMENT_JAVADOC	 Get the error listener. @return The registered error listener. 
public	TokenNamepublic	
ErrorListener	TokenNameIdentifier	 Error Listener
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
XPathContext	TokenNameIdentifier	 X Path Context
.	TokenNameDOT	
this	TokenNamethis	
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of a node as a number. * @param n Node to be converted to a number. May be null. * @return value of n as a number. */	TokenNameCOMMENT_JAVADOC	 Get the value of a node as a number. @param n Node to be converted to a number. May be null. @return value of n as a number. 
public	TokenNamepublic	
double	TokenNamedouble	
toNumber	TokenNameIdentifier	 to Number
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% You can't get much uglier than this... 	TokenNameCOMMENT_LINE	%REVIEW% You can't get much uglier than this... 
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
=	TokenNameEQUAL	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XString	TokenNameIdentifier	 X String
xobj	TokenNameIdentifier	 xobj
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XString	TokenNameIdentifier	 X String
)	TokenNameRPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
xobj	TokenNameIdentifier	 xobj
.	TokenNameDOT	
num	TokenNameIdentifier	 num
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the value of a node as a string. * @param n Node to be converted to a string. May be null. * @return value of n as a string, or an empty string if n is null. */	TokenNameCOMMENT_JAVADOC	 Get the value of a node as a string. @param n Node to be converted to a string. May be null. @return value of n as a string, or an empty string if n is null. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// %REVIEW% You can't get much uglier than this... 	TokenNameCOMMENT_LINE	%REVIEW% You can't get much uglier than this... 
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
=	TokenNameEQUAL	
getDTMHandleFromNode	TokenNameIdentifier	 get DTM Handle From Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLString	TokenNameIdentifier	 XML String
strVal	TokenNameIdentifier	 str Val
=	TokenNameEQUAL	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getStringValue	TokenNameIdentifier	 get String Value
(	TokenNameLPAREN	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
strVal	TokenNameIdentifier	 str Val
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a variable based on it's qualified name. * @param qname The qualified name of the variable. * @return The evaluated value of the variable. * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Get a variable based on it's qualified name. @param qname The qualified name of the variable. @return The evaluated value of the variable. @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
final	TokenNamefinal	
XObject	TokenNameIdentifier	 X Object
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
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
m_variableStacks	TokenNameIdentifier	 m variable Stacks
.	TokenNameDOT	
getVariableOrParam	TokenNameIdentifier	 get Variable Or Param
(	TokenNameLPAREN	
XPathContext	TokenNameIdentifier	 X Path Context
.	TokenNameDOT	
this	TokenNamethis	
,	TokenNameCOMMA	
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get a DTM to be used as a container for a global Result Tree * Fragment. This will always be an instance of (derived from? equivalent to?) * SAX2DTM, since each RTF is constructed by temporarily redirecting our SAX * output to it. It may be a single DTM containing for multiple fragments, * if the implementation supports that. * * Note: The distinction between this method and getRTFDTM() is that the latter * allocates space from the dynamic variable stack (m_rtfdtm_stack), which may * be pruned away again as the templates which defined those variables are exited. * Global variables may be bound late (see XUnresolvedVariable), and never want to * be discarded, hence we need to allocate them separately and don't actually need * a stack to track them. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get a DTM to be used as a container for a global Result Tree Fragment. This will always be an instance of (derived from? equivalent to?) SAX2DTM, since each RTF is constructed by temporarily redirecting our SAX output to it. It may be a single DTM containing for multiple fragments, if the implementation supports that. * Note: The distinction between this method and getRTFDTM() is that the latter allocates space from the dynamic variable stack (m_rtfdtm_stack), which may be pruned away again as the templates which defined those variables are exited. Global variables may be bound late (see XUnresolvedVariable), and never want to be discarded, hence we need to allocate them separately and don't actually need a stack to track them. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getGlobalRTFDTM	TokenNameIdentifier	 get Global RTFDTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// We probably should _NOT_ be applying whitespace filtering at this stage! 	TokenNameCOMMENT_LINE	We probably should _NOT_ be applying whitespace filtering at this stage! 
// 	TokenNameCOMMENT_LINE	 
// Some magic has been applied in DTMManagerDefault to recognize this set of options 	TokenNameCOMMENT_LINE	Some magic has been applied in DTMManagerDefault to recognize this set of options 
// and generate an instance of DTM which can contain multiple documents 	TokenNameCOMMENT_LINE	and generate an instance of DTM which can contain multiple documents 
// (SAX2RTFDTM). Perhaps not the optimal way of achieving that result, but 	TokenNameCOMMENT_LINE	(SAX2RTFDTM). Perhaps not the optimal way of achieving that result, but 
// I didn't want to change the manager API at this time, or expose 	TokenNameCOMMENT_LINE	I didn't want to change the manager API at this time, or expose 
// too many dependencies on its internals. (Ideally, I'd like to move 	TokenNameCOMMENT_LINE	too many dependencies on its internals. (Ideally, I'd like to move 
// isTreeIncomplete all the way up to DTM, so we wouldn't need to explicitly 	TokenNameCOMMENT_LINE	isTreeIncomplete all the way up to DTM, so we wouldn't need to explicitly 
// specify the subclass here.) 	TokenNameCOMMENT_LINE	specify the subclass here.) 
// If it doesn't exist, or if the one already existing is in the middle of 	TokenNameCOMMENT_LINE	If it doesn't exist, or if the one already existing is in the middle of 
// being constructed, we need to obtain a new DTM to write into. I'm not sure 	TokenNameCOMMENT_LINE	being constructed, we need to obtain a new DTM to write into. I'm not sure 
// the latter will ever arise, but I'd rather be just a bit paranoid.. 	TokenNameCOMMENT_LINE	the latter will ever arise, but I'd rather be just a bit paranoid.. 
if	TokenNameif	
(	TokenNameLPAREN	
m_global_rtfdtm	TokenNameIdentifier	 m global rtfdtm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
m_global_rtfdtm	TokenNameIdentifier	 m global rtfdtm
.	TokenNameDOT	
isTreeIncomplete	TokenNameIdentifier	 is Tree Incomplete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_global_rtfdtm	TokenNameIdentifier	 m global rtfdtm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_global_rtfdtm	TokenNameIdentifier	 m global rtfdtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a DTM to be used as a container for a dynamic Result Tree * Fragment. This will always be an instance of (derived from? equivalent to?) * SAX2DTM, since each RTF is constructed by temporarily redirecting our SAX * output to it. It may be a single DTM containing for multiple fragments, * if the implementation supports that. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get a DTM to be used as a container for a dynamic Result Tree Fragment. This will always be an instance of (derived from? equivalent to?) SAX2DTM, since each RTF is constructed by temporarily redirecting our SAX output to it. It may be a single DTM containing for multiple fragments, if the implementation supports that. * @return a non-null DTM reference. 
public	TokenNamepublic	
DTM	TokenNameIdentifier	 DTM
getRTFDTM	TokenNameIdentifier	 get RTFDTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
rtfdtm	TokenNameIdentifier	 rtfdtm
;	TokenNameSEMICOLON	
// We probably should _NOT_ be applying whitespace filtering at this stage! 	TokenNameCOMMENT_LINE	We probably should _NOT_ be applying whitespace filtering at this stage! 
// 	TokenNameCOMMENT_LINE	 
// Some magic has been applied in DTMManagerDefault to recognize this set of options 	TokenNameCOMMENT_LINE	Some magic has been applied in DTMManagerDefault to recognize this set of options 
// and generate an instance of DTM which can contain multiple documents 	TokenNameCOMMENT_LINE	and generate an instance of DTM which can contain multiple documents 
// (SAX2RTFDTM). Perhaps not the optimal way of achieving that result, but 	TokenNameCOMMENT_LINE	(SAX2RTFDTM). Perhaps not the optimal way of achieving that result, but 
// I didn't want to change the manager API at this time, or expose 	TokenNameCOMMENT_LINE	I didn't want to change the manager API at this time, or expose 
// too many dependencies on its internals. (Ideally, I'd like to move 	TokenNameCOMMENT_LINE	too many dependencies on its internals. (Ideally, I'd like to move 
// isTreeIncomplete all the way up to DTM, so we wouldn't need to explicitly 	TokenNameCOMMENT_LINE	isTreeIncomplete all the way up to DTM, so we wouldn't need to explicitly 
// specify the subclass here.) 	TokenNameCOMMENT_LINE	specify the subclass here.) 
if	TokenNameif	
(	TokenNameLPAREN	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
rtfdtm	TokenNameIdentifier	 rtfdtm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
rtfdtm	TokenNameIdentifier	 rtfdtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
<	TokenNameLESS	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
rtfdtm	TokenNameIdentifier	 rtfdtm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
rtfdtm	TokenNameIdentifier	 rtfdtm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// It might already be under construction -- the classic example would be 	TokenNameCOMMENT_LINE	It might already be under construction -- the classic example would be 
// an xsl:variable which uses xsl:call-template as part of its value. To 	TokenNameCOMMENT_LINE	an xsl:variable which uses xsl:call-template as part of its value. To 
// handle this recursion, we have to start a new RTF DTM, pushing the old 	TokenNameCOMMENT_LINE	handle this recursion, we have to start a new RTF DTM, pushing the old 
// one onto a stack so we can return to it. This is not as uncommon a case 	TokenNameCOMMENT_LINE	one onto a stack so we can return to it. This is not as uncommon a case 
// as we might wish, unfortunately, as some folks insist on coding XSLT 	TokenNameCOMMENT_LINE	as we might wish, unfortunately, as some folks insist on coding XSLT 
// as if it were a procedural language... 	TokenNameCOMMENT_LINE	as if it were a procedural language... 
if	TokenNameif	
(	TokenNameLPAREN	
rtfdtm	TokenNameIdentifier	 rtfdtm
.	TokenNameDOT	
isTreeIncomplete	TokenNameIdentifier	 is Tree Incomplete
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
<	TokenNameLESS	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
rtfdtm	TokenNameIdentifier	 rtfdtm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
{	TokenNameLBRACE	
rtfdtm	TokenNameIdentifier	 rtfdtm
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
m_dtmManager	TokenNameIdentifier	 m dtm Manager
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
true	TokenNametrue	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
rtfdtm	TokenNameIdentifier	 rtfdtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
rtfdtm	TokenNameIdentifier	 rtfdtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Push the RTFDTM's context mark, to allows discarding RTFs added after this * point. (If it doesn't exist we don't push, since we might still be able to * get away with not creating it. That requires that excessive pops be harmless.) * */	TokenNameCOMMENT_JAVADOC	 Push the RTFDTM's context mark, to allows discarding RTFs added after this point. (If it doesn't exist we don't push, since we might still be able to get away with not creating it. That requires that excessive pops be harmless.) 
public	TokenNamepublic	
void	TokenNamevoid	
pushRTFContext	TokenNameIdentifier	 push RTF Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_last_pushed_rtfdtm	TokenNameIdentifier	 m last pushed rtfdtm
.	TokenNameDOT	
push	TokenNameIdentifier	 push
(	TokenNameLPAREN	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
(	TokenNameLPAREN	
getRTFDTM	TokenNameIdentifier	 get RTFDTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
pushRewindMark	TokenNameIdentifier	 push Rewind Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Pop the RTFDTM's context mark. This discards any RTFs added after the last * mark was set. * * If there is no RTF DTM, there's nothing to pop so this * becomes a no-op. If pushes were issued before this was called, we count on * the fact that popRewindMark is defined such that overpopping just resets * to empty. * * Complicating factor: We need to handle the case of popping back to a previous * RTF DTM, if one of the weird produce-an-RTF-to-build-an-RTF cases arose. * Basically: If pop says this DTM is now empty, then return to the previous * if one exists, in whatever state we left it in. UGLY, but hopefully the * situation which forces us to consider this will arise exceedingly rarely. * */	TokenNameCOMMENT_JAVADOC	 Pop the RTFDTM's context mark. This discards any RTFs added after the last mark was set. * If there is no RTF DTM, there's nothing to pop so this becomes a no-op. If pushes were issued before this was called, we count on the fact that popRewindMark is defined such that overpopping just resets to empty. * Complicating factor: We need to handle the case of popping back to a previous RTF DTM, if one of the weird produce-an-RTF-to-build-an-RTF cases arose. Basically: If pop says this DTM is now empty, then return to the previous if one exists, in whatever state we left it in. UGLY, but hopefully the situation which forces us to consider this will arise exceedingly rarely. 
public	TokenNamepublic	
void	TokenNamevoid	
popRTFContext	TokenNameIdentifier	 pop RTF Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
previous	TokenNameIdentifier	 previous
=	TokenNameEQUAL	
m_last_pushed_rtfdtm	TokenNameIdentifier	 m last pushed rtfdtm
.	TokenNameDOT	
pop	TokenNameIdentifier	 pop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
==	TokenNameEQUAL_EQUAL	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
>=	TokenNameGREATER_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
// guard against none-active 	TokenNameCOMMENT_LINE	guard against none-active 
{	TokenNameLBRACE	
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
(	TokenNameLPAREN	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
popRewindMark	TokenNameIdentifier	 pop Rewind Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
while	TokenNamewhile	
(	TokenNameLPAREN	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
!=	TokenNameNOT_EQUAL	
previous	TokenNameIdentifier	 previous
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Empty each DTM before popping, so it's ready for reuse 	TokenNameCOMMENT_LINE	Empty each DTM before popping, so it's ready for reuse 
// _DON'T_ pop the previous, since it's still open (which is why we 	TokenNameCOMMENT_LINE	_DON'T_ pop the previous, since it's still open (which is why we 
// stacked up more of these) and did not receive a mark. 	TokenNameCOMMENT_LINE	stacked up more of these) and did not receive a mark. 
boolean	TokenNameboolean	
isEmpty	TokenNameIdentifier	 is Empty
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
SAX2RTFDTM	TokenNameIdentifier	 SA X2 RTFDTM
)	TokenNameRPAREN	
(	TokenNameLPAREN	
m_rtfdtm_stack	TokenNameIdentifier	 m rtfdtm stack
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
popRewindMark	TokenNameIdentifier	 pop Rewind Mark
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
--	TokenNameMINUS_MINUS	
m_which_rtfdtm	TokenNameIdentifier	 m which rtfdtm
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Gets DTMXRTreeFrag object if one has already been created. * Creates new DTMXRTreeFrag object and adds to m_DTMXRTreeFrags HashMap, * otherwise. * @param dtmIdentity * @return DTMXRTreeFrag */	TokenNameCOMMENT_JAVADOC	 Gets DTMXRTreeFrag object if one has already been created. Creates new DTMXRTreeFrag object and adds to m_DTMXRTreeFrags HashMap, otherwise. @param dtmIdentity @return DTMXRTreeFrag 
public	TokenNamepublic	
DTMXRTreeFrag	TokenNameIdentifier	 DTMXR Tree Frag
getDTMXRTreeFrag	TokenNameIdentifier	 get DTMXR Tree Frag
(	TokenNameLPAREN	
int	TokenNameint	
dtmIdentity	TokenNameIdentifier	 dtm Identity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
=	TokenNameEQUAL	
new	TokenNamenew	
HashMap	TokenNameIdentifier	 Hash Map
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
.	TokenNameDOT	
containsKey	TokenNameIdentifier	 contains Key
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
dtmIdentity	TokenNameIdentifier	 dtm Identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
DTMXRTreeFrag	TokenNameIdentifier	 DTMXR Tree Frag
)	TokenNameRPAREN	
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
dtmIdentity	TokenNameIdentifier	 dtm Identity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
final	TokenNamefinal	
DTMXRTreeFrag	TokenNameIdentifier	 DTMXR Tree Frag
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
new	TokenNamenew	
DTMXRTreeFrag	TokenNameIdentifier	 DTMXR Tree Frag
(	TokenNameLPAREN	
dtmIdentity	TokenNameIdentifier	 dtm Identity
,	TokenNameCOMMA	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
new	TokenNamenew	
Integer	TokenNameIdentifier	 Integer
(	TokenNameLPAREN	
dtmIdentity	TokenNameIdentifier	 dtm Identity
)	TokenNameRPAREN	
,	TokenNameCOMMA	
frag	TokenNameIdentifier	 frag
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
frag	TokenNameIdentifier	 frag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Cleans DTMXRTreeFrag objects by removing references * to DTM and XPathContext objects. */	TokenNameCOMMENT_JAVADOC	 Cleans DTMXRTreeFrag objects by removing references to DTM and XPathContext objects. 
private	TokenNameprivate	
final	TokenNamefinal	
void	TokenNamevoid	
releaseDTMXRTreeFrags	TokenNameIdentifier	 release DTMXR Tree Frags
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
final	TokenNamefinal	
Iterator	TokenNameIdentifier	 Iterator
iter	TokenNameIdentifier	 iter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
.	TokenNameDOT	
values	TokenNameIdentifier	 values
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
iterator	TokenNameIdentifier	 iterator
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
DTMXRTreeFrag	TokenNameIdentifier	 DTMXR Tree Frag
frag	TokenNameIdentifier	 frag
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMXRTreeFrag	TokenNameIdentifier	 DTMXR Tree Frag
)	TokenNameRPAREN	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
next	TokenNameIdentifier	 next
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
frag	TokenNameIdentifier	 frag
.	TokenNameDOT	
destruct	TokenNameIdentifier	 destruct
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
iter	TokenNameIdentifier	 iter
.	TokenNameDOT	
remove	TokenNameIdentifier	 remove
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_DTMXRTreeFrags	TokenNameIdentifier	 m  DTMXR Tree Frags
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
