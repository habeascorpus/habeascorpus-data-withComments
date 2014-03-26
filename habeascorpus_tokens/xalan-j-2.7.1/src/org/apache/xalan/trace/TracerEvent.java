/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TracerEvent.java 468644 2006-10-28 06:56:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TracerEvent.java 468644 2006-10-28 06:56:42Z minchau $ 
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
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
utils	TokenNameIdentifier	 utils
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Attr	TokenNameIdentifier	 Attr
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Element	TokenNameIdentifier	 Element
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
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
NodeList	TokenNameIdentifier	 Node List
;	TokenNameSEMICOLON	
/** * Parent class of events generated for tracing the * progress of the XSL processor. * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Parent class of events generated for tracing the progress of the XSL processor. @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
TracerEvent	TokenNameIdentifier	 Tracer Event
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
/** * The current mode. */	TokenNameCOMMENT_JAVADOC	 The current mode. 
public	TokenNamepublic	
final	TokenNamefinal	
QName	TokenNameIdentifier	 Q Name
m_mode	TokenNameIdentifier	 m mode
;	TokenNameSEMICOLON	
/** * Create an event originating at the given node of the style tree. * @param processor The XSLT TransformerFactory. * @param sourceNode The current context node. * @param mode The current mode. * @param styleNode The stylesheet element that is executing. */	TokenNameCOMMENT_JAVADOC	 Create an event originating at the given node of the style tree. @param processor The XSLT TransformerFactory. @param sourceNode The current context node. @param mode The current mode. @param styleNode The stylesheet element that is executing. 
public	TokenNamepublic	
TracerEvent	TokenNameIdentifier	 Tracer Event
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
processor	TokenNameIdentifier	 processor
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
QName	TokenNameIdentifier	 Q Name
mode	TokenNameIdentifier	 mode
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
styleNode	TokenNameIdentifier	 style Node
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
m_mode	TokenNameIdentifier	 m mode
=	TokenNameEQUAL	
mode	TokenNameIdentifier	 mode
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
=	TokenNameEQUAL	
styleNode	TokenNameIdentifier	 style Node
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of the node. * The string returned for elements will contain the element name * and any attributes enclosed in angle brackets. * The string returned for attributes will be of form, "name=value." * * @param n any DOM node. Must not be null. * * @return a string representation of the given node. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of the node. The string returned for elements will contain the element name and any attributes enclosed in angle brackets. The string returned for attributes will be of form, "name=value." * @param n any DOM node. Must not be null. * @return a string representation of the given node. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
printNode	TokenNameIdentifier	 print Node
(	TokenNameLPAREN	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
instanceof	TokenNameinstanceof	
Element	TokenNameIdentifier	 Element
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
"<"	TokenNameStringLiteral	<
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getFirstChild	TokenNameIdentifier	 get First Child
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
instanceof	TokenNameinstanceof	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
printNode	TokenNameIdentifier	 print Node
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
.	TokenNameDOT	
getNextSibling	TokenNameIdentifier	 get Next Sibling
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
">"	TokenNameStringLiteral	>
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
instanceof	TokenNameinstanceof	
Attr	TokenNameIdentifier	 Attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"="	TokenNameStringLiteral	=
+	TokenNamePLUS	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeValue	TokenNameIdentifier	 get Node Value
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
n	TokenNameIdentifier	 n
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Returns a string representation of the node list. * The string will contain the list of nodes inside square braces. * Elements will contain the element name * and any attributes enclosed in angle brackets. * Attributes will be of form, "name=value." * * @param l any DOM node list. Must not be null. * * @return a string representation of the given node list. */	TokenNameCOMMENT_JAVADOC	 Returns a string representation of the node list. The string will contain the list of nodes inside square braces. Elements will contain the element name and any attributes enclosed in angle brackets. Attributes will be of form, "name=value." * @param l any DOM node list. Must not be null. * @return a string representation of the given node list. 
public	TokenNamepublic	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
printNodeList	TokenNameIdentifier	 print Node List
(	TokenNameLPAREN	
NodeList	TokenNameIdentifier	 Node List
l	TokenNameIdentifier	 l
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
r	TokenNameIdentifier	 r
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
hashCode	TokenNameIdentifier	 hash Code
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"["	TokenNameStringLiteral	[
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
printNode	TokenNameIdentifier	 print Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
==	TokenNameEQUAL_EQUAL	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
n	TokenNameIdentifier	 n
=	TokenNameEQUAL	
l	TokenNameIdentifier	 l
.	TokenNameDOT	
item	TokenNameIdentifier	 item
(	TokenNameLPAREN	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
{	TokenNameLBRACE	
r	TokenNameIdentifier	 r
+=	TokenNamePLUS_EQUAL	
printNode	TokenNameIdentifier	 print Node
(	TokenNameLPAREN	
n	TokenNameIdentifier	 n
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
r	TokenNameIdentifier	 r
+	TokenNamePLUS	
"]"	TokenNameStringLiteral	]
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
