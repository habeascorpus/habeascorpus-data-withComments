/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: SelectionEvent.java 468644 2006-10-28 06:56:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: SelectionEvent.java 468644 2006-10-28 06:56:42Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
XPath	TokenNameIdentifier	 X Path
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * Event triggered by selection of a node in the style stree. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Event triggered by selection of a node in the style stree. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
SelectionEvent	TokenNameIdentifier	 Selection Event
implements	TokenNameimplements	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
EventListener	TokenNameIdentifier	 Event Listener
{	TokenNameLBRACE	
/** * The node in the style tree where the event occurs. */	TokenNameCOMMENT_JAVADOC	 The node in the style tree where the event occurs. 
public	TokenNamepublic	
final	TokenNamefinal	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
m_styleNode	TokenNameIdentifier	 m style Node
;	TokenNameSEMICOLON	
/** * The XSLT processor instance. */	TokenNameCOMMENT_JAVADOC	 The XSLT processor instance. 
public	TokenNamepublic	
final	TokenNamefinal	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_processor	TokenNameIdentifier	 m processor
;	TokenNameSEMICOLON	
/** * The current context node. */	TokenNameCOMMENT_JAVADOC	 The current context node. 
public	TokenNamepublic	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
m_sourceNode	TokenNameIdentifier	 m source Node
;	TokenNameSEMICOLON	
/** * The attribute name from which the selection is made. */	TokenNameCOMMENT_JAVADOC	 The attribute name from which the selection is made. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
m_attributeName	TokenNameIdentifier	 m attribute Name
;	TokenNameSEMICOLON	
/** * The XPath that executed the selection. */	TokenNameCOMMENT_JAVADOC	 The XPath that executed the selection. 
public	TokenNamepublic	
final	TokenNamefinal	
XPath	TokenNameIdentifier	 X Path
m_xpath	TokenNameIdentifier	 m xpath
;	TokenNameSEMICOLON	
/** * The result of the selection. */	TokenNameCOMMENT_JAVADOC	 The result of the selection. 
public	TokenNamepublic	
final	TokenNamefinal	
XObject	TokenNameIdentifier	 X Object
m_selection	TokenNameIdentifier	 m selection
;	TokenNameSEMICOLON	
/** * Create an event originating at the given node of the style tree. * * @param processor The XSLT TransformerFactory. * @param sourceNode The current context node. * @param styleNode node in the style tree reference for the event. * Should not be null. That is not enforced. * @param attributeName The attribute name from which the selection is made. * @param xpath The XPath that executed the selection. * @param selection The result of the selection. */	TokenNameCOMMENT_JAVADOC	 Create an event originating at the given node of the style tree. * @param processor The XSLT TransformerFactory. @param sourceNode The current context node. @param styleNode node in the style tree reference for the event. Should not be null. That is not enforced. @param attributeName The attribute name from which the selection is made. @param xpath The XPath that executed the selection. @param selection The result of the selection. 
public	TokenNamepublic	
SelectionEvent	TokenNameIdentifier	 Selection Event
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
processor	TokenNameIdentifier	 processor
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
XPath	TokenNameIdentifier	 X Path
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
XObject	TokenNameIdentifier	 X Object
selection	TokenNameIdentifier	 selection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
m_processor	TokenNameIdentifier	 m processor
=	TokenNameEQUAL	
processor	TokenNameIdentifier	 processor
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_sourceNode	TokenNameIdentifier	 m source Node
=	TokenNameEQUAL	
sourceNode	TokenNameIdentifier	 source Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
=	TokenNameEQUAL	
styleNode	TokenNameIdentifier	 style Node
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_attributeName	TokenNameIdentifier	 m attribute Name
=	TokenNameEQUAL	
attributeName	TokenNameIdentifier	 attribute Name
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_xpath	TokenNameIdentifier	 m xpath
=	TokenNameEQUAL	
xpath	TokenNameIdentifier	 xpath
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_selection	TokenNameIdentifier	 m selection
=	TokenNameEQUAL	
selection	TokenNameIdentifier	 selection
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
