/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: EndSelectionEvent.java 468644 2006-10-28 06:56:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: EndSelectionEvent.java 468644 2006-10-28 06:56:42Z minchau $ 
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
/** * Event triggered by completion of a xsl:for-each selection or a * xsl:apply-templates selection. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Event triggered by completion of a xsl:for-each selection or a xsl:apply-templates selection. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
EndSelectionEvent	TokenNameIdentifier	 End Selection Event
extends	TokenNameextends	
SelectionEvent	TokenNameIdentifier	 Selection Event
{	TokenNameLBRACE	
/** * Create an EndSelectionEvent. * * @param processor The XSLT TransformerFactory. * @param sourceNode The current context node. * @param styleNode node in the style tree reference for the event. * Should not be null. That is not enforced. * @param attributeName The attribute name from which the selection is made. * @param xpath The XPath that executed the selection. * @param selection The result of the selection. */	TokenNameCOMMENT_JAVADOC	 Create an EndSelectionEvent. * @param processor The XSLT TransformerFactory. @param sourceNode The current context node. @param styleNode node in the style tree reference for the event. Should not be null. That is not enforced. @param attributeName The attribute name from which the selection is made. @param xpath The XPath that executed the selection. @param selection The result of the selection. 
public	TokenNamepublic	
EndSelectionEvent	TokenNameIdentifier	 End Selection Event
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
super	TokenNamesuper	
(	TokenNameLPAREN	
processor	TokenNameIdentifier	 processor
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
selection	TokenNameIdentifier	 selection
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
