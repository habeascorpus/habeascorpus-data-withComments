/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: TraceManager.java 468644 2006-10-28 06:56:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: TraceManager.java 468644 2006-10-28 06:56:42Z minchau $ 
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
TooManyListenersException	TokenNameIdentifier	 Too Many Listeners Exception
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
/** * This class manages trace listeners, and acts as an * interface for the tracing functionality in Xalan. */	TokenNameCOMMENT_JAVADOC	 This class manages trace listeners, and acts as an interface for the tracing functionality in Xalan. 
public	TokenNamepublic	
class	TokenNameclass	
TraceManager	TokenNameIdentifier	 Trace Manager
{	TokenNameLBRACE	
/** A transformer instance */	TokenNameCOMMENT_JAVADOC	 A transformer instance 
private	TokenNameprivate	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
/** * Constructor for the trace manager. * * @param transformer a non-null instance of a transformer */	TokenNameCOMMENT_JAVADOC	 Constructor for the trace manager. * @param transformer a non-null instance of a transformer 
public	TokenNamepublic	
TraceManager	TokenNameIdentifier	 Trace Manager
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * List of listeners who are interested in tracing what's * being generated. */	TokenNameCOMMENT_JAVADOC	 List of listeners who are interested in tracing what's being generated. 
private	TokenNameprivate	
Vector	TokenNameIdentifier	 Vector
m_traceListeners	TokenNameIdentifier	 m trace Listeners
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Add a trace listener for the purposes of debugging and diagnosis. * @param tl Trace listener to be added. * * @throws TooManyListenersException */	TokenNameCOMMENT_JAVADOC	 Add a trace listener for the purposes of debugging and diagnosis. @param tl Trace listener to be added. * @throws TooManyListenersException 
public	TokenNamepublic	
void	TokenNamevoid	
addTraceListener	TokenNameIdentifier	 add Trace Listener
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
throws	TokenNamethrows	
TooManyListenersException	TokenNameIdentifier	 Too Many Listeners Exception
{	TokenNameLBRACE	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
setDebug	TokenNameIdentifier	 set Debug
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
=	TokenNameEQUAL	
new	TokenNamenew	
Vector	TokenNameIdentifier	 Vector
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
addElement	TokenNameIdentifier	 add Element
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Remove a trace listener. * @param tl Trace listener to be removed. */	TokenNameCOMMENT_JAVADOC	 Remove a trace listener. @param tl Trace listener to be removed. 
public	TokenNamepublic	
void	TokenNamevoid	
removeTraceListener	TokenNameIdentifier	 remove Trace Listener
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
removeElement	TokenNameIdentifier	 remove Element
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The following line added to fix the bug#5140: hasTraceListeners() returns true 	TokenNameCOMMENT_LINE	The following line added to fix the bug#5140: hasTraceListeners() returns true 
// after adding and removing a listener. 	TokenNameCOMMENT_LINE	after adding and removing a listener. 
// Check: if m_traceListeners is empty, then set it to NULL. 	TokenNameCOMMENT_LINE	Check: if m_traceListeners is empty, then set it to NULL. 
if	TokenNameif	
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
==	TokenNameEQUAL_EQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire a generate event. * * @param te Generate Event to fire */	TokenNameCOMMENT_JAVADOC	 Fire a generate event. * @param te Generate Event to fire 
public	TokenNamepublic	
void	TokenNamevoid	
fireGenerateEvent	TokenNameIdentifier	 fire Generate Event
(	TokenNameLPAREN	
GenerateEvent	TokenNameIdentifier	 Generate Event
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
generated	TokenNameIdentifier	 generated
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Tell if trace listeners are present. * * @return True if there are trace listeners */	TokenNameCOMMENT_JAVADOC	 Tell if trace listeners are present. * @return True if there are trace listeners 
public	TokenNamepublic	
boolean	TokenNameboolean	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Fire a trace event. * * @param styleNode Stylesheet template node */	TokenNameCOMMENT_JAVADOC	 Fire a trace event. * @param styleNode Stylesheet template node 
public	TokenNamepublic	
void	TokenNamevoid	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
styleNode	TokenNameIdentifier	 style Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
getDOMNodeFromDTM	TokenNameIdentifier	 get DOM Node From DTM
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
new	TokenNamenew	
TracerEvent	TokenNameIdentifier	 Tracer Event
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/*sourceNode, mode,*/	TokenNameCOMMENT_BLOCK	sourceNode, mode,
styleNode	TokenNameIdentifier	 style Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire a end trace event, after all children of an element have been * executed. * * @param styleNode Stylesheet template node */	TokenNameCOMMENT_JAVADOC	 Fire a end trace event, after all children of an element have been executed. * @param styleNode Stylesheet template node 
public	TokenNamepublic	
void	TokenNamevoid	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
styleNode	TokenNameIdentifier	 style Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getCurrentNode	TokenNameIdentifier	 get Current Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
getDOMNodeFromDTM	TokenNameIdentifier	 get DOM Node From DTM
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
new	TokenNamenew	
TracerEvent	TokenNameIdentifier	 Tracer Event
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getMode	TokenNameIdentifier	 get Mode
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
/*sourceNode, mode,*/	TokenNameCOMMENT_BLOCK	sourceNode, mode,
styleNode	TokenNameIdentifier	 style Node
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire a trace event. * * @param te Trace event to fire */	TokenNameCOMMENT_JAVADOC	 Fire a trace event. * @param te Trace event to fire 
public	TokenNamepublic	
void	TokenNamevoid	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
TracerEvent	TokenNameIdentifier	 Tracer Event
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
instanceof	TokenNameinstanceof	
TraceListenerEx2	TokenNameIdentifier	 Trace Listener Ex2
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TraceListenerEx2	TokenNameIdentifier	 Trace Listener Ex2
)	TokenNameRPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
.	TokenNameDOT	
traceEnd	TokenNameIdentifier	 trace End
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire a trace event. * * @param te Trace event to fire */	TokenNameCOMMENT_JAVADOC	 Fire a trace event. * @param te Trace event to fire 
public	TokenNamepublic	
void	TokenNamevoid	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
TracerEvent	TokenNameIdentifier	 Tracer Event
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire a selection event. * * @param sourceNode Current source node * @param styleNode node in the style tree reference for the event. * @param attributeName The attribute name from which the selection is made. * @param xpath The XPath that executed the selection. * @param selection The result of the selection. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Fire a selection event. * @param sourceNode Current source node @param styleNode node in the style tree reference for the event. @param attributeName The attribute name from which the selection is made. @param xpath The XPath that executed the selection. @param selection The result of the selection. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
fireSelectedEvent	TokenNameIdentifier	 fire Selected Event
(	TokenNameLPAREN	
int	TokenNameint	
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
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
getDOMNodeFromDTM	TokenNameIdentifier	 get DOM Node From DTM
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireSelectedEvent	TokenNameIdentifier	 fire Selected Event
(	TokenNameLPAREN	
new	TokenNamenew	
SelectionEvent	TokenNameIdentifier	 Selection Event
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
selection	TokenNameIdentifier	 selection
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire a selection event. * * @param sourceNode Current source node * @param styleNode node in the style tree reference for the event. * @param attributeName The attribute name from which the selection is made. * @param xpath The XPath that executed the selection. * @param selection The result of the selection. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Fire a selection event. * @param sourceNode Current source node @param styleNode node in the style tree reference for the event. @param attributeName The attribute name from which the selection is made. @param xpath The XPath that executed the selection. @param selection The result of the selection. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
fireSelectedEndEvent	TokenNameIdentifier	 fire Selected End Event
(	TokenNameLPAREN	
int	TokenNameint	
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
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Node	TokenNameIdentifier	 Node
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
getDOMNodeFromDTM	TokenNameIdentifier	 get DOM Node From DTM
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fireSelectedEndEvent	TokenNameIdentifier	 fire Selected End Event
(	TokenNameLPAREN	
new	TokenNamenew	
EndSelectionEvent	TokenNameIdentifier	 End Selection Event
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
,	TokenNameCOMMA	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
attributeName	TokenNameIdentifier	 attribute Name
,	TokenNameCOMMA	
xpath	TokenNameIdentifier	 xpath
,	TokenNameCOMMA	
selection	TokenNameIdentifier	 selection
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire a selection event. * * @param se Selection event to fire * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Fire a selection event. * @param se Selection event to fire * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
fireSelectedEndEvent	TokenNameIdentifier	 fire Selected End Event
(	TokenNameLPAREN	
EndSelectionEvent	TokenNameIdentifier	 End Selection Event
se	TokenNameIdentifier	 se
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
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
instanceof	TokenNameinstanceof	
TraceListenerEx	TokenNameIdentifier	 Trace Listener Ex
)	TokenNameRPAREN	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TraceListenerEx	TokenNameIdentifier	 Trace Listener Ex
)	TokenNameRPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
.	TokenNameDOT	
selectEnd	TokenNameIdentifier	 select End
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire a selection event. * * @param se Selection event to fire * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Fire a selection event. * @param se Selection event to fire * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
fireSelectedEvent	TokenNameIdentifier	 fire Selected Event
(	TokenNameLPAREN	
SelectionEvent	TokenNameIdentifier	 Selection Event
se	TokenNameIdentifier	 se
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
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
tl	TokenNameIdentifier	 tl
.	TokenNameDOT	
selected	TokenNameIdentifier	 selected
(	TokenNameLPAREN	
se	TokenNameIdentifier	 se
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire an end extension event. * * @see java.lang.reflect.Method#invoke * * @param method The java method about to be executed * @param instance The instance the method will be executed on * @param arguments Parameters passed to the method. */	TokenNameCOMMENT_JAVADOC	 Fire an end extension event. * @see java.lang.reflect.Method#invoke * @param method The java method about to be executed @param instance The instance the method will be executed on @param arguments Parameters passed to the method. 
public	TokenNamepublic	
void	TokenNamevoid	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtensionEvent	TokenNameIdentifier	 Extension Event
ee	TokenNameIdentifier	 ee
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
,	TokenNameCOMMA	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
instanceof	TokenNameinstanceof	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
)	TokenNameRPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
.	TokenNameDOT	
extensionEnd	TokenNameIdentifier	 extension End
(	TokenNameLPAREN	
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire an end extension event. * * @see java.lang.reflect.Method#invoke * * @param method The java method about to be executed * @param instance The instance the method will be executed on * @param arguments Parameters passed to the method. */	TokenNameCOMMENT_JAVADOC	 Fire an end extension event. * @see java.lang.reflect.Method#invoke * @param method The java method about to be executed @param instance The instance the method will be executed on @param arguments Parameters passed to the method. 
public	TokenNamepublic	
void	TokenNamevoid	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ExtensionEvent	TokenNameIdentifier	 Extension Event
ee	TokenNameIdentifier	 ee
=	TokenNameEQUAL	
new	TokenNamenew	
ExtensionEvent	TokenNameIdentifier	 Extension Event
(	TokenNameLPAREN	
m_transformer	TokenNameIdentifier	 m transformer
,	TokenNameCOMMA	
method	TokenNameIdentifier	 method
,	TokenNameCOMMA	
instance	TokenNameIdentifier	 instance
,	TokenNameCOMMA	
arguments	TokenNameIdentifier	 arguments
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
instanceof	TokenNameinstanceof	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
)	TokenNameRPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
(	TokenNameLPAREN	
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire an end extension event. * * @see java.lang.reflect.Method#invoke * * @param ee the ExtensionEvent to fire */	TokenNameCOMMENT_JAVADOC	 Fire an end extension event. * @see java.lang.reflect.Method#invoke * @param ee the ExtensionEvent to fire 
public	TokenNamepublic	
void	TokenNamevoid	
fireExtensionEndEvent	TokenNameIdentifier	 fire Extension End Event
(	TokenNameLPAREN	
ExtensionEvent	TokenNameIdentifier	 Extension Event
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
instanceof	TokenNameinstanceof	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
)	TokenNameRPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
.	TokenNameDOT	
extensionEnd	TokenNameIdentifier	 extension End
(	TokenNameLPAREN	
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Fire an end extension event. * * @see java.lang.reflect.Method#invoke * * @param ee the ExtensionEvent to fire */	TokenNameCOMMENT_JAVADOC	 Fire an end extension event. * @see java.lang.reflect.Method#invoke * @param ee the ExtensionEvent to fire 
public	TokenNamepublic	
void	TokenNamevoid	
fireExtensionEvent	TokenNameIdentifier	 fire Extension Event
(	TokenNameLPAREN	
ExtensionEvent	TokenNameIdentifier	 Extension Event
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
hasTraceListeners	TokenNameIdentifier	 has Trace Listeners
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nListeners	TokenNameIdentifier	 n Listeners
=	TokenNameEQUAL	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
size	TokenNameIdentifier	 size
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
nListeners	TokenNameIdentifier	 n Listeners
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TraceListener	TokenNameIdentifier	 Trace Listener
tl	TokenNameIdentifier	 tl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TraceListener	TokenNameIdentifier	 Trace Listener
)	TokenNameRPAREN	
m_traceListeners	TokenNameIdentifier	 m trace Listeners
.	TokenNameDOT	
elementAt	TokenNameIdentifier	 element At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
tl	TokenNameIdentifier	 tl
instanceof	TokenNameinstanceof	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
)	TokenNameRPAREN	
{	TokenNameLBRACE	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
)	TokenNameRPAREN	
tl	TokenNameIdentifier	 tl
)	TokenNameRPAREN	
.	TokenNameDOT	
extension	TokenNameIdentifier	 extension
(	TokenNameLPAREN	
ee	TokenNameIdentifier	 ee
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Get the DOM Node of the current XPath context, which is possibly null. * @param sourceNode the handle on the node used by a DTM. */	TokenNameCOMMENT_JAVADOC	 Get the DOM Node of the current XPath context, which is possibly null. @param sourceNode the handle on the node used by a DTM. 
private	TokenNameprivate	
Node	TokenNameIdentifier	 Node
getDOMNodeFromDTM	TokenNameIdentifier	 get DOM Node From DTM
(	TokenNameLPAREN	
int	TokenNameint	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
{	TokenNameLBRACE	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
Node	TokenNameIdentifier	 Node
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
null	TokenNamenull	
:	TokenNameCOLON	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNode	TokenNameIdentifier	 get Node
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
source	TokenNameIdentifier	 source
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
