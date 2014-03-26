/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: QueuedEvents.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: QueuedEvents.java 468645 2006-10-28 06:57:24Z minchau $ 
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
Vector	TokenNameIdentifier	 Vector
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
MutableAttrListImpl	TokenNameIdentifier	 Mutable Attr List Impl
;	TokenNameSEMICOLON	
/** * This class acts as a base for ResultTreeHandler, and keeps * queud stack events. In truth, we don't need a stack, * so I may change this down the line a bit. */	TokenNameCOMMENT_JAVADOC	 This class acts as a base for ResultTreeHandler, and keeps queud stack events. In truth, we don't need a stack, so I may change this down the line a bit. 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
QueuedEvents	TokenNameIdentifier	 Queued Events
{	TokenNameLBRACE	
/** The number of events queued */	TokenNameCOMMENT_JAVADOC	 The number of events queued 
protected	TokenNameprotected	
int	TokenNameint	
m_eventCount	TokenNameIdentifier	 m event Count
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** Queued start document */	TokenNameCOMMENT_JAVADOC	 Queued start document 
// QueuedStartDocument m_startDoc = new QueuedStartDocument(); 	TokenNameCOMMENT_LINE	QueuedStartDocument m_startDoc = new QueuedStartDocument(); 
/** Queued start element */	TokenNameCOMMENT_JAVADOC	 Queued start element 
// QueuedStartElement m_startElement = new QueuedStartElement(); 	TokenNameCOMMENT_LINE	QueuedStartElement m_startElement = new QueuedStartElement(); 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_docPending	TokenNameIdentifier	 m doc Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_docEnded	TokenNameIdentifier	 m doc Ended
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Flag indicating that an event is pending. Public for * fast access by ElemForEach. */	TokenNameCOMMENT_JAVADOC	 Flag indicating that an event is pending. Public for fast access by ElemForEach. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_elemIsPending	TokenNameIdentifier	 m elem Is Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Flag indicating that an event is ended */	TokenNameCOMMENT_JAVADOC	 Flag indicating that an event is ended 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_elemIsEnded	TokenNameIdentifier	 m elem Is Ended
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The pending attributes. We have to delay the call to * m_flistener.startElement(name, atts) because of the * xsl:attribute and xsl:copy calls. In other words, * the attributes have to be fully collected before you * can call startElement. */	TokenNameCOMMENT_JAVADOC	 The pending attributes. We have to delay the call to m_flistener.startElement(name, atts) because of the xsl:attribute and xsl:copy calls. In other words, the attributes have to be fully collected before you can call startElement. 
protected	TokenNameprotected	
MutableAttrListImpl	TokenNameIdentifier	 Mutable Attr List Impl
m_attributes	TokenNameIdentifier	 m attributes
=	TokenNameEQUAL	
new	TokenNamenew	
MutableAttrListImpl	TokenNameIdentifier	 Mutable Attr List Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** * Flag to try and get the xmlns decls to the attribute list * before other attributes are added. */	TokenNameCOMMENT_JAVADOC	 Flag to try and get the xmlns decls to the attribute list before other attributes are added. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
m_nsDeclsHaveBeenAdded	TokenNameIdentifier	 m ns Decls Have Been Added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The pending element, namespace, and local name. */	TokenNameCOMMENT_JAVADOC	 The pending element, namespace, and local name. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_name	TokenNameIdentifier	 m name
;	TokenNameSEMICOLON	
/** Namespace URL of the element */	TokenNameCOMMENT_JAVADOC	 Namespace URL of the element 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_url	TokenNameIdentifier	 m url
;	TokenNameSEMICOLON	
/** Local part of qualified name of the element */	TokenNameCOMMENT_JAVADOC	 Local part of qualified name of the element 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
m_localName	TokenNameIdentifier	 m local Name
;	TokenNameSEMICOLON	
/** Vector of namespaces for this element */	TokenNameCOMMENT_JAVADOC	 Vector of namespaces for this element 
protected	TokenNameprotected	
Vector	TokenNameIdentifier	 Vector
m_namespaces	TokenNameIdentifier	 m namespaces
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// /** 	TokenNameCOMMENT_LINE	/** 
// * Get the queued element. 	TokenNameCOMMENT_LINE	* Get the queued element. 
// * 	TokenNameCOMMENT_LINE	* 
// * @return the queued element. 	TokenNameCOMMENT_LINE	* @return the queued element. 
// */ 	TokenNameCOMMENT_LINE	*/ 
// QueuedStartElement getQueuedElem() 	TokenNameCOMMENT_LINE	QueuedStartElement getQueuedElem() 
// { 	TokenNameCOMMENT_LINE	{ 
// return (m_eventCount > 1) ? m_startElement : null; 	TokenNameCOMMENT_LINE	return (m_eventCount > 1) ? m_startElement : null; 
// } 	TokenNameCOMMENT_LINE	} 
/** * To re-initialize the document and element events * */	TokenNameCOMMENT_JAVADOC	 To re-initialize the document and element events 
protected	TokenNameprotected	
void	TokenNamevoid	
reInitEvents	TokenNameIdentifier	 re Init Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Push document event and re-initialize events * */	TokenNameCOMMENT_JAVADOC	 Push document event and re-initialize events 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
pushDocumentEvent	TokenNameIdentifier	 push Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reInitEvents	TokenNameIdentifier	 re Init Events
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Push the document event. This never gets popped. */	TokenNameCOMMENT_JAVADOC	 Push the document event. This never gets popped. 
void	TokenNamevoid	
pushDocumentEvent	TokenNameIdentifier	 push Document Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// m_startDoc.setPending(true); 	TokenNameCOMMENT_LINE	m_startDoc.setPending(true); 
// initQSE(m_startDoc); 	TokenNameCOMMENT_LINE	initQSE(m_startDoc); 
m_docPending	TokenNameIdentifier	 m doc Pending
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_eventCount	TokenNameIdentifier	 m event Count
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Pop element event * */	TokenNameCOMMENT_JAVADOC	 Pop element event 
void	TokenNamevoid	
popEvent	TokenNameIdentifier	 pop Event
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_elemIsPending	TokenNameIdentifier	 m elem Is Pending
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_attributes	TokenNameIdentifier	 m attributes
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_nsDeclsHaveBeenAdded	TokenNameIdentifier	 m ns Decls Have Been Added
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_name	TokenNameIdentifier	 m name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_url	TokenNameIdentifier	 m url
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_localName	TokenNameIdentifier	 m local Name
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_namespaces	TokenNameIdentifier	 m namespaces
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_eventCount	TokenNameIdentifier	 m event Count
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Instance of a serializer */	TokenNameCOMMENT_JAVADOC	 Instance of a serializer 
private	TokenNameprivate	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
m_serializer	TokenNameIdentifier	 m serializer
;	TokenNameSEMICOLON	
/** * This is only for use of object pooling, so that * it can be reset. * * @param s non-null instance of a serializer */	TokenNameCOMMENT_JAVADOC	 This is only for use of object pooling, so that it can be reset. * @param s non-null instance of a serializer 
void	TokenNamevoid	
setSerializer	TokenNameIdentifier	 set Serializer
(	TokenNameLPAREN	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_serializer	TokenNameIdentifier	 m serializer
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This is only for use of object pooling, so the that * it can be reset. * * @return The serializer */	TokenNameCOMMENT_JAVADOC	 This is only for use of object pooling, so the that it can be reset. * @return The serializer 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
serializer	TokenNameIdentifier	 serializer
.	TokenNameDOT	
Serializer	TokenNameIdentifier	 Serializer
getSerializer	TokenNameIdentifier	 get Serializer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_serializer	TokenNameIdentifier	 m serializer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
