/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: DTMManager.java 468653 2006-10-28 07:07:05Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: DTMManager.java 468653 2006-10-28 07:07:05Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XMLMessages	TokenNameIdentifier	 XML Messages
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
XMLStringFactory	TokenNameIdentifier	 XML String Factory
;	TokenNameSEMICOLON	
/** * A DTMManager instance can be used to create DTM and * DTMIterator objects, and manage the DTM objects in the system. * * <p>The system property that determines which Factory implementation * to create is named "org.apache.xml.utils.DTMFactory". This * property names a concrete subclass of the DTMFactory abstract * class. If the property is not defined, a platform default is be used.</p> * * <p>An instance of this class <emph>must</emph> be safe to use across * thread instances. It is expected that a client will create a single instance * of a DTMManager to use across multiple threads. This will allow sharing * of DTMs across multiple processes.</p> * * <p>Note: this class is incomplete right now. It will be pretty much * modeled after javax.xml.transform.TransformerFactory in terms of its * factory support.</p> * * <p>State: In progress!!</p> */	TokenNameCOMMENT_JAVADOC	 A DTMManager instance can be used to create DTM and DTMIterator objects, and manage the DTM objects in the system. * <p>The system property that determines which Factory implementation to create is named "org.apache.xml.utils.DTMFactory". This property names a concrete subclass of the DTMFactory abstract class. If the property is not defined, a platform default is be used.</p> * <p>An instance of this class <emph>must</emph> be safe to use across thread instances. It is expected that a client will create a single instance of a DTMManager to use across multiple threads. This will allow sharing of DTMs across multiple processes.</p> * <p>Note: this class is incomplete right now. It will be pretty much modeled after javax.xml.transform.TransformerFactory in terms of its factory support.</p> * <p>State: In progress!!</p> 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
DTMManager	TokenNameIdentifier	 DTM Manager
{	TokenNameLBRACE	
/** The default property name to load the manager. */	TokenNameCOMMENT_JAVADOC	 The default property name to load the manager. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
defaultPropName	TokenNameIdentifier	 default Prop Name
=	TokenNameEQUAL	
"org.apache.xml.dtm.DTMManager"	TokenNameStringLiteral	org.apache.xml.dtm.DTMManager
;	TokenNameSEMICOLON	
/** The default class name to use as the manager. */	TokenNameCOMMENT_JAVADOC	 The default class name to use as the manager. 
private	TokenNameprivate	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
defaultClassName	TokenNameIdentifier	 default Class Name
=	TokenNameEQUAL	
"org.apache.xml.dtm.ref.DTMManagerDefault"	TokenNameStringLiteral	org.apache.xml.dtm.ref.DTMManagerDefault
;	TokenNameSEMICOLON	
/** * Factory for creating XMLString objects. * %TBD% Make this set by the caller. */	TokenNameCOMMENT_JAVADOC	 Factory for creating XMLString objects. %TBD% Make this set by the caller. 
protected	TokenNameprotected	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
m_xsf	TokenNameIdentifier	 m xsf
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Default constructor is protected on purpose. */	TokenNameCOMMENT_JAVADOC	 Default constructor is protected on purpose. 
protected	TokenNameprotected	
DTMManager	TokenNameIdentifier	 DTM Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get the XMLStringFactory used for the DTMs. * * * @return a valid XMLStringFactory object, or null if it hasn't been set yet. */	TokenNameCOMMENT_JAVADOC	 Get the XMLStringFactory used for the DTMs. * @return a valid XMLStringFactory object, or null if it hasn't been set yet. 
public	TokenNamepublic	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
getXMLStringFactory	TokenNameIdentifier	 get XML String Factory
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_xsf	TokenNameIdentifier	 m xsf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the XMLStringFactory used for the DTMs. * * * @param xsf a valid XMLStringFactory object, should not be null. */	TokenNameCOMMENT_JAVADOC	 Set the XMLStringFactory used for the DTMs. * @param xsf a valid XMLStringFactory object, should not be null. 
public	TokenNamepublic	
void	TokenNamevoid	
setXMLStringFactory	TokenNameIdentifier	 set XML String Factory
(	TokenNameLPAREN	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xsf	TokenNameIdentifier	 xsf
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_xsf	TokenNameIdentifier	 m xsf
=	TokenNameEQUAL	
xsf	TokenNameIdentifier	 xsf
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Obtain a new instance of a <code>DTMManager</code>. * This static method creates a new factory instance * This method uses the following ordered lookup procedure to determine * the <code>DTMManager</code> implementation class to * load: * <ul> * <li> * Use the <code>org.apache.xml.dtm.DTMManager</code> system * property. * </li> * <li> * Use the JAVA_HOME(the parent directory where jdk is * installed)/lib/xalan.properties for a property file that contains the * name of the implementation class keyed on the same value as the * system property defined above. * </li> * <li> * Use the Services API (as detailed in the JAR specification), if * available, to determine the classname. The Services API will look * for a classname in the file * <code>META-INF/services/org.apache.xml.dtm.DTMManager</code> * in jars available to the runtime. * </li> * <li> * Use the default <code>DTMManager</code> classname, which is * <code>org.apache.xml.dtm.ref.DTMManagerDefault</code>. * </li> * </ul> * * Once an application has obtained a reference to a <code> * DTMManager</code> it can use the factory to configure * and obtain parser instances. * * @return new DTMManager instance, never null. * * @throws DTMConfigurationException * if the implementation is not available or cannot be instantiated. */	TokenNameCOMMENT_JAVADOC	 Obtain a new instance of a <code>DTMManager</code>. This static method creates a new factory instance This method uses the following ordered lookup procedure to determine the <code>DTMManager</code> implementation class to load: <ul> <li> Use the <code>org.apache.xml.dtm.DTMManager</code> system property. </li> <li> Use the JAVA_HOME(the parent directory where jdk is installed)/lib/xalan.properties for a property file that contains the name of the implementation class keyed on the same value as the system property defined above. </li> <li> Use the Services API (as detailed in the JAR specification), if available, to determine the classname. The Services API will look for a classname in the file <code>META-INF/services/org.apache.xml.dtm.DTMManager</code> in jars available to the runtime. </li> <li> Use the default <code>DTMManager</code> classname, which is <code>org.apache.xml.dtm.ref.DTMManagerDefault</code>. </li> </ul> * Once an application has obtained a reference to a <code> DTMManager</code> it can use the factory to configure and obtain parser instances. * @return new DTMManager instance, never null. * @throws DTMConfigurationException if the implementation is not available or cannot be instantiated. 
public	TokenNamepublic	
static	TokenNamestatic	
DTMManager	TokenNameIdentifier	 DTM Manager
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
XMLStringFactory	TokenNameIdentifier	 XML String Factory
xsf	TokenNameIdentifier	 xsf
)	TokenNameRPAREN	
throws	TokenNamethrows	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
{	TokenNameLBRACE	
DTMManager	TokenNameIdentifier	 DTM Manager
factoryImpl	TokenNameIdentifier	 factory Impl
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
factoryImpl	TokenNameIdentifier	 factory Impl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
DTMManager	TokenNameIdentifier	 DTM Manager
)	TokenNameRPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
createObject	TokenNameIdentifier	 create Object
(	TokenNameLPAREN	
defaultPropName	TokenNameIdentifier	 default Prop Name
,	TokenNameCOMMA	
defaultClassName	TokenNameIdentifier	 default Class Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
ObjectFactory	TokenNameIdentifier	 Object Factory
.	TokenNameDOT	
ConfigurationError	TokenNameIdentifier	 Configuration Error
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_DEFAULT_IMPL	TokenNameIdentifier	 ER  NO  DEFAULT  IMPL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getException	TokenNameIdentifier	 get Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"No default implementation found"); 	TokenNameCOMMENT_LINE	"No default implementation found"); 
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
factoryImpl	TokenNameIdentifier	 factory Impl
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
DTMConfigurationException	TokenNameIdentifier	 DTM Configuration Exception
(	TokenNameLPAREN	
XMLMessages	TokenNameIdentifier	 XML Messages
.	TokenNameDOT	
createXMLMessage	TokenNameIdentifier	 create XML Message
(	TokenNameLPAREN	
XMLErrorResources	TokenNameIdentifier	 XML Error Resources
.	TokenNameDOT	
ER_NO_DEFAULT_IMPL	TokenNameIdentifier	 ER  NO  DEFAULT  IMPL
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"No default implementation found"); 	TokenNameCOMMENT_LINE	"No default implementation found"); 
}	TokenNameRBRACE	
factoryImpl	TokenNameIdentifier	 factory Impl
.	TokenNameDOT	
setXMLStringFactory	TokenNameIdentifier	 set XML String Factory
(	TokenNameLPAREN	
xsf	TokenNameIdentifier	 xsf
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
factoryImpl	TokenNameIdentifier	 factory Impl
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an instance of a DTM, loaded with the content from the * specified source. If the unique flag is true, a new instance will * always be returned. Otherwise it is up to the DTMManager to return a * new instance or an instance that it already created and may be being used * by someone else. * * (More parameters may eventually need to be added for error handling * and entity resolution, and to better control selection of implementations.) * * @param source the specification of the source object, which may be null, * in which case it is assumed that node construction will take * by some other means. * @param unique true if the returned DTM must be unique, probably because it * is going to be mutated. * @param whiteSpaceFilter Enables filtering of whitespace nodes, and may * be null. * @param incremental true if the DTM should be built incrementally, if * possible. * @param doIndexing true if the caller considers it worth it to use * indexing schemes. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get an instance of a DTM, loaded with the content from the specified source. If the unique flag is true, a new instance will always be returned. Otherwise it is up to the DTMManager to return a new instance or an instance that it already created and may be being used by someone else. * (More parameters may eventually need to be added for error handling and entity resolution, and to better control selection of implementations.) * @param source the specification of the source object, which may be null, in which case it is assumed that node construction will take by some other means. @param unique true if the returned DTM must be unique, probably because it is going to be mutated. @param whiteSpaceFilter Enables filtering of whitespace nodes, and may be null. @param incremental true if the DTM should be built incrementally, if possible. @param doIndexing true if the caller considers it worth it to use indexing schemes. * @return a non-null DTM reference. 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
whiteSpaceFilter	TokenNameIdentifier	 white Space Filter
,	TokenNameCOMMA	
boolean	TokenNameboolean	
incremental	TokenNameIdentifier	 incremental
,	TokenNameCOMMA	
boolean	TokenNameboolean	
doIndexing	TokenNameIdentifier	 do Indexing
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Get the instance of DTM that "owns" a node handle. * * @param nodeHandle the nodeHandle. * * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Get the instance of DTM that "owns" a node handle. * @param nodeHandle the nodeHandle. * @return a non-null DTM reference. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DTM	TokenNameIdentifier	 DTM
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
int	TokenNameint	
nodeHandle	TokenNameIdentifier	 node Handle
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Given a W3C DOM node, try and return a DTM handle. * Note: calling this may be non-optimal. * * @param node Non-null reference to a DOM node. * * @return a valid DTM handle. */	TokenNameCOMMENT_JAVADOC	 Given a W3C DOM node, try and return a DTM handle. Note: calling this may be non-optimal. * @param node Non-null reference to a DOM node. * @return a valid DTM handle. 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * Creates a DTM representing an empty <code>DocumentFragment</code> object. * @return a non-null DTM reference. */	TokenNameCOMMENT_JAVADOC	 Creates a DTM representing an empty <code>DocumentFragment</code> object. @return a non-null DTM reference. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DTM	TokenNameIdentifier	 DTM
createDocumentFragment	TokenNameIdentifier	 create Document Fragment
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Release a DTM either to a lru pool, or completely remove reference. * DTMs without system IDs are always hard deleted. * State: experimental. * * @param dtm The DTM to be released. * @param shouldHardDelete True if the DTM should be removed no matter what. * @return true if the DTM was removed, false if it was put back in a lru pool. */	TokenNameCOMMENT_JAVADOC	 Release a DTM either to a lru pool, or completely remove reference. DTMs without system IDs are always hard deleted. State: experimental. * @param dtm The DTM to be released. @param shouldHardDelete True if the DTM should be removed no matter what. @return true if the DTM was removed, false if it was put back in a lru pool. 
public	TokenNamepublic	
abstract	TokenNameabstract	
boolean	TokenNameboolean	
release	TokenNameIdentifier	 release
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
,	TokenNameCOMMA	
boolean	TokenNameboolean	
shouldHardDelete	TokenNameIdentifier	 should Hard Delete
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new <code>DTMIterator</code> based on an XPath * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * * @param xpathCompiler ??? Somehow we need to pass in a subpart of the * expression. I hate to do this with strings, since the larger expression * has already been parsed. * * @param pos The position in the expression. * @return The newly created <code>DTMIterator</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMIterator</code> based on an XPath <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * @param xpathCompiler ??? Somehow we need to pass in a subpart of the expression. I hate to do this with strings, since the larger expression has already been parsed. * @param pos The position in the expression. @return The newly created <code>DTMIterator</code>. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DTMIterator	TokenNameIdentifier	 DTM Iterator
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
Object	TokenNameIdentifier	 Object
xpathCompiler	TokenNameIdentifier	 xpath Compiler
,	TokenNameCOMMA	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new <code>DTMIterator</code> based on an XPath * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * * @param xpathString Must be a valid string expressing a * <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or * a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * * @param presolver An object that can resolve prefixes to namespace URLs. * * @return The newly created <code>DTMIterator</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMIterator</code> based on an XPath <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * @param xpathString Must be a valid string expressing a <a href="http://www.w3.org/TR/xpath#NT-LocationPath>LocationPath</a> or a <a href="http://www.w3.org/TR/xpath#NT-UnionExpr">UnionExpr</a>. * @param presolver An object that can resolve prefixes to namespace URLs. * @return The newly created <code>DTMIterator</code>. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DTMIterator	TokenNameIdentifier	 DTM Iterator
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xpathString	TokenNameIdentifier	 xpath String
,	TokenNameCOMMA	
PrefixResolver	TokenNameIdentifier	 Prefix Resolver
presolver	TokenNameIdentifier	 presolver
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Create a new <code>DTMIterator</code> based only on a whatToShow * and a DTMFilter. The traversal semantics are defined as the * descendant access. * <p> * Note that DTMIterators may not be an exact match to DOM * NodeIterators. They are initialized and used in much the same way * as a NodeIterator, but their response to document mutation is not * currently defined. * * @param whatToShow This flag specifies which node types may appear in * the logical view of the tree presented by the iterator. See the * description of <code>NodeFilter</code> for the set of possible * <code>SHOW_</code> values.These flags can be combined using * <code>OR</code>. * @param filter The <code>NodeFilter</code> to be used with this * <code>DTMFilter</code>, or <code>null</code> to indicate no filter. * @param entityReferenceExpansion The value of this flag determines * whether entity reference nodes are expanded. * * @return The newly created <code>DTMIterator</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMIterator</code> based only on a whatToShow and a DTMFilter. The traversal semantics are defined as the descendant access. <p> Note that DTMIterators may not be an exact match to DOM NodeIterators. They are initialized and used in much the same way as a NodeIterator, but their response to document mutation is not currently defined. * @param whatToShow This flag specifies which node types may appear in the logical view of the tree presented by the iterator. See the description of <code>NodeFilter</code> for the set of possible <code>SHOW_</code> values.These flags can be combined using <code>OR</code>. @param filter The <code>NodeFilter</code> to be used with this <code>DTMFilter</code>, or <code>null</code> to indicate no filter. @param entityReferenceExpansion The value of this flag determines whether entity reference nodes are expanded. * @return The newly created <code>DTMIterator</code>. 
public	TokenNamepublic	
abstract	TokenNameabstract	
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
;	TokenNameSEMICOLON	
/** * Create a new <code>DTMIterator</code> that holds exactly one node. * * @param node The node handle that the DTMIterator will iterate to. * * @return The newly created <code>DTMIterator</code>. */	TokenNameCOMMENT_JAVADOC	 Create a new <code>DTMIterator</code> that holds exactly one node. * @param node The node handle that the DTMIterator will iterate to. * @return The newly created <code>DTMIterator</code>. 
public	TokenNamepublic	
abstract	TokenNameabstract	
DTMIterator	TokenNameIdentifier	 DTM Iterator
createDTMIterator	TokenNameIdentifier	 create DTM Iterator
(	TokenNameLPAREN	
int	TokenNameint	
node	TokenNameIdentifier	 node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/* Flag indicating whether an incremental transform is desired */	TokenNameCOMMENT_BLOCK	 Flag indicating whether an incremental transform is desired 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/* * Flag set by FEATURE_SOURCE_LOCATION. * This feature specifies whether the transformation phase should * keep track of line and column numbers for the input source * document. */	TokenNameCOMMENT_BLOCK	 Flag set by FEATURE_SOURCE_LOCATION. This feature specifies whether the transformation phase should keep track of line and column numbers for the input source document. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Get a flag indicating whether an incremental transform is desired * @return incremental boolean. * */	TokenNameCOMMENT_JAVADOC	 Get a flag indicating whether an incremental transform is desired @return incremental boolean. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getIncremental	TokenNameIdentifier	 get Incremental
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_incremental	TokenNameIdentifier	 m incremental
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a flag indicating whether an incremental transform is desired * This flag should have the same value as the FEATURE_INCREMENTAL feature * which is set by the TransformerFactory.setAttribut() method before a * DTMManager is created * @param incremental boolean to use to set m_incremental. * */	TokenNameCOMMENT_JAVADOC	 Set a flag indicating whether an incremental transform is desired This flag should have the same value as the FEATURE_INCREMENTAL feature which is set by the TransformerFactory.setAttribut() method before a DTMManager is created @param incremental boolean to use to set m_incremental. 
public	TokenNamepublic	
void	TokenNamevoid	
setIncremental	TokenNameIdentifier	 set Incremental
(	TokenNameLPAREN	
boolean	TokenNameboolean	
incremental	TokenNameIdentifier	 incremental
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_incremental	TokenNameIdentifier	 m incremental
=	TokenNameEQUAL	
incremental	TokenNameIdentifier	 incremental
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get a flag indicating whether the transformation phase should * keep track of line and column numbers for the input source * document. * @return source location boolean * */	TokenNameCOMMENT_JAVADOC	 Get a flag indicating whether the transformation phase should keep track of line and column numbers for the input source document. @return source location boolean 
public	TokenNamepublic	
boolean	TokenNameboolean	
getSource_location	TokenNameIdentifier	 get Source location
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_source_location	TokenNameIdentifier	 m source location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set a flag indicating whether the transformation phase should * keep track of line and column numbers for the input source * document. * This flag should have the same value as the FEATURE_SOURCE_LOCATION feature * which is set by the TransformerFactory.setAttribut() method before a * DTMManager is created * @param sourceLocation boolean to use to set m_source_location */	TokenNameCOMMENT_JAVADOC	 Set a flag indicating whether the transformation phase should keep track of line and column numbers for the input source document. This flag should have the same value as the FEATURE_SOURCE_LOCATION feature which is set by the TransformerFactory.setAttribut() method before a DTMManager is created @param sourceLocation boolean to use to set m_source_location 
public	TokenNamepublic	
void	TokenNamevoid	
setSource_location	TokenNameIdentifier	 set Source location
(	TokenNameLPAREN	
boolean	TokenNameboolean	
sourceLocation	TokenNameIdentifier	 source Location
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_source_location	TokenNameIdentifier	 m source location
=	TokenNameEQUAL	
sourceLocation	TokenNameIdentifier	 source Location
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// -------------------- private methods -------------------- 	TokenNameCOMMENT_LINE	-------------------- private methods -------------------- 
/** * Temp debug code - this will be removed after we test everything */	TokenNameCOMMENT_JAVADOC	 Temp debug code - this will be removed after we test everything 
private	TokenNameprivate	
static	TokenNamestatic	
boolean	TokenNameboolean	
debug	TokenNameIdentifier	 debug
;	TokenNameSEMICOLON	
static	TokenNamestatic	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
debug	TokenNameIdentifier	 debug
=	TokenNameEQUAL	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
"dtm.debug"	TokenNameStringLiteral	dtm.debug
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
SecurityException	TokenNameIdentifier	 Security Exception
ex	TokenNameIdentifier	 ex
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** This value, set at compile time, controls how many bits of the * DTM node identifier numbers are used to identify a node within a * document, and thus sets the maximum number of nodes per * document. The remaining bits are used to identify the DTM * document which contains this node. * * If you change IDENT_DTM_NODE_BITS, be sure to rebuild _ALL_ the * files which use it... including the IDKey testcases. * * (FuncGenerateKey currently uses the node identifier directly and * thus is affected when this changes. The IDKEY results will still be * _correct_ (presuming no other breakage), but simple equality * comparison against the previous "golden" files will probably * complain.) * */	TokenNameCOMMENT_JAVADOC	 This value, set at compile time, controls how many bits of the DTM node identifier numbers are used to identify a node within a document, and thus sets the maximum number of nodes per document. The remaining bits are used to identify the DTM document which contains this node. * If you change IDENT_DTM_NODE_BITS, be sure to rebuild _ALL_ the files which use it... including the IDKey testcases. * (FuncGenerateKey currently uses the node identifier directly and thus is affected when this changes. The IDKEY results will still be _correct_ (presuming no other breakage), but simple equality comparison against the previous "golden" files will probably complain.) 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
=	TokenNameEQUAL	
16	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** When this bitmask is ANDed with a DTM node handle number, the result * is the low bits of the node's index number within that DTM. To obtain * the high bits, add the DTM ID portion's offset as assigned in the DTM * Manager. */	TokenNameCOMMENT_JAVADOC	 When this bitmask is ANDed with a DTM node handle number, the result is the low bits of the node's index number within that DTM. To obtain the high bits, add the DTM ID portion's offset as assigned in the DTM Manager. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IDENT_NODE_DEFAULT	TokenNameIdentifier	 IDENT  NODE  DEFAULT
=	TokenNameEQUAL	
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
<<	TokenNameLEFT_SHIFT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** When this bitmask is ANDed with a DTM node handle number, the result * is the DTM's document identity number. */	TokenNameCOMMENT_JAVADOC	 When this bitmask is ANDed with a DTM node handle number, the result is the DTM's document identity number. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IDENT_DTM_DEFAULT	TokenNameIdentifier	 IDENT  DTM  DEFAULT
=	TokenNameEQUAL	
~	TokenNameTWIDDLE	
IDENT_NODE_DEFAULT	TokenNameIdentifier	 IDENT  NODE  DEFAULT
;	TokenNameSEMICOLON	
/** This is the maximum number of DTMs available. The highest DTM is * one less than this. */	TokenNameCOMMENT_JAVADOC	 This is the maximum number of DTMs available. The highest DTM is one less than this. 
public	TokenNamepublic	
static	TokenNamestatic	
final	TokenNamefinal	
int	TokenNameint	
IDENT_MAX_DTMS	TokenNameIdentifier	 IDENT  MAX  DTMS
=	TokenNameEQUAL	
(	TokenNameLPAREN	
IDENT_DTM_DEFAULT	TokenNameIdentifier	 IDENT  DTM  DEFAULT
>>>	TokenNameUNSIGNED_RIGHT_SHIFT	
IDENT_DTM_NODE_BITS	TokenNameIdentifier	 IDENT  DTM  NODE  BITS
)	TokenNameRPAREN	
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * %TBD% Doc * * NEEDSDOC @param dtm * * NEEDSDOC ($objectName$) @return */	TokenNameCOMMENT_JAVADOC	 %TBD% Doc * NEEDSDOC @param dtm * NEEDSDOC ($objectName$) @return 
public	TokenNamepublic	
abstract	TokenNameabstract	
int	TokenNameint	
getDTMIdentity	TokenNameIdentifier	 get DTM Identity
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * %TBD% Doc * * NEEDSDOC ($objectName$) @return */	TokenNameCOMMENT_JAVADOC	 %TBD% Doc * NEEDSDOC ($objectName$) @return 
public	TokenNamepublic	
int	TokenNameint	
getDTMIdentityMask	TokenNameIdentifier	 get DTM Identity Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
IDENT_DTM_DEFAULT	TokenNameIdentifier	 IDENT  DTM  DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * %TBD% Doc * * NEEDSDOC ($objectName$) @return */	TokenNameCOMMENT_JAVADOC	 %TBD% Doc * NEEDSDOC ($objectName$) @return 
public	TokenNamepublic	
int	TokenNameint	
getNodeIdentityMask	TokenNameIdentifier	 get Node Identity Mask
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
IDENT_NODE_DEFAULT	TokenNameIdentifier	 IDENT  NODE  DEFAULT
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
