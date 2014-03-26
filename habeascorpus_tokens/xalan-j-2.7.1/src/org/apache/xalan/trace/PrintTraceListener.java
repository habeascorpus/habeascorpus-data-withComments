/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: PrintTraceListener.java 468644 2006-10-28 06:56:42Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: PrintTraceListener.java 468644 2006-10-28 06:56:42Z minchau $ 
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
Constructor	TokenNameIdentifier	 Constructor
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
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
SourceLocator	TokenNameIdentifier	 Source Locator
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
Constants	TokenNameIdentifier	 Constants
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
ElemTemplate	TokenNameIdentifier	 Elem Template
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
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
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
ref	TokenNameIdentifier	 ref
.	TokenNameDOT	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
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
SerializerTrace	TokenNameIdentifier	 Serializer Trace
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
/** * Implementation of the TraceListener interface that * prints each event to standard out as it occurs. * * @see org.apache.xalan.trace.TracerEvent * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implementation of the TraceListener interface that prints each event to standard out as it occurs. * @see org.apache.xalan.trace.TracerEvent @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
PrintTraceListener	TokenNameIdentifier	 Print Trace Listener
implements	TokenNameimplements	
TraceListenerEx3	TokenNameIdentifier	 Trace Listener Ex3
{	TokenNameLBRACE	
/** * Construct a trace listener. * * @param pw PrintWriter to use for tracing events */	TokenNameCOMMENT_JAVADOC	 Construct a trace listener. * @param pw PrintWriter to use for tracing events 
public	TokenNamepublic	
PrintTraceListener	TokenNameIdentifier	 Print Trace Listener
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
=	TokenNameEQUAL	
pw	TokenNameIdentifier	 pw
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The print writer where the events should be written. */	TokenNameCOMMENT_JAVADOC	 The print writer where the events should be written. 
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
m_pw	TokenNameIdentifier	 m pw
;	TokenNameSEMICOLON	
/** * This needs to be set to true if the listener is to print an event whenever a template is invoked. */	TokenNameCOMMENT_JAVADOC	 This needs to be set to true if the listener is to print an event whenever a template is invoked. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_traceTemplates	TokenNameIdentifier	 m trace Templates
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set to true if the listener is to print events that occur as each node is 'executed' in the stylesheet. */	TokenNameCOMMENT_JAVADOC	 Set to true if the listener is to print events that occur as each node is 'executed' in the stylesheet. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_traceElements	TokenNameIdentifier	 m trace Elements
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set to true if the listener is to print information after each result-tree generation event. */	TokenNameCOMMENT_JAVADOC	 Set to true if the listener is to print information after each result-tree generation event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_traceGeneration	TokenNameIdentifier	 m trace Generation
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set to true if the listener is to print information after each selection event. */	TokenNameCOMMENT_JAVADOC	 Set to true if the listener is to print information after each selection event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_traceSelection	TokenNameIdentifier	 m trace Selection
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Set to true if the listener is to print information after each extension event. */	TokenNameCOMMENT_JAVADOC	 Set to true if the listener is to print information after each extension event. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_traceExtension	TokenNameIdentifier	 m trace Extension
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Print information about a TracerEvent. * * @param ev the trace event. */	TokenNameCOMMENT_JAVADOC	 Print information about a TracerEvent. * @param ev the trace event. 
public	TokenNamepublic	
void	TokenNamevoid	
_trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
TracerEvent	TokenNameIdentifier	 Tracer Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEXTLITERALRESULT	TokenNameIdentifier	 ELEMNAME  TEXTLITERALRESULT
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_traceElements	TokenNameIdentifier	 m trace Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Line #"	TokenNameStringLiteral	 Line #
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
"Column #"	TokenNameStringLiteral	Column #
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" -- "	TokenNameStringLiteral	 -- 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
etl	TokenNameIdentifier	 etl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTextLiteral	TokenNameIdentifier	 Elem Text Literal
)	TokenNameRPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
etl	TokenNameIdentifier	 etl
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
etl	TokenNameIdentifier	 etl
.	TokenNameDOT	
getChars	TokenNameIdentifier	 get Chars
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
chars	TokenNameIdentifier	 chars
.	TokenNameDOT	
trim	TokenNameIdentifier	 trim
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_TEMPLATE	TokenNameIdentifier	 ELEMNAME  TEMPLATE
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_traceTemplates	TokenNameIdentifier	 m trace Templates
||	TokenNameOR_OR	
m_traceElements	TokenNameIdentifier	 m trace Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplate	TokenNameIdentifier	 Elem Template
et	TokenNameIdentifier	 et
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplate	TokenNameIdentifier	 Elem Template
)	TokenNameRPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
et	TokenNameIdentifier	 et
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Line #"	TokenNameStringLiteral	 Line #
+	TokenNamePLUS	
et	TokenNameIdentifier	 et
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
"Column #"	TokenNameStringLiteral	Column #
+	TokenNamePLUS	
et	TokenNameIdentifier	 et
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
et	TokenNameIdentifier	 et
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
et	TokenNameIdentifier	 et
.	TokenNameDOT	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"match='"	TokenNameStringLiteral	match='
+	TokenNamePLUS	
et	TokenNameIdentifier	 et
.	TokenNameDOT	
getMatch	TokenNameIdentifier	 get Match
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' "	TokenNameStringLiteral	' 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
et	TokenNameIdentifier	 et
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"name='"	TokenNameStringLiteral	name='
+	TokenNamePLUS	
et	TokenNameIdentifier	 et
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"' "	TokenNameStringLiteral	' 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
default	TokenNamedefault	
:	TokenNameCOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_traceElements	TokenNameIdentifier	 m trace Elements
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Line #"	TokenNameStringLiteral	 Line #
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
"Column #"	TokenNameStringLiteral	Column #
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
m_indent	TokenNameIdentifier	 m indent
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
/** * Print information about a TracerEvent. * * @param ev the trace event. */	TokenNameCOMMENT_JAVADOC	 Print information about a TracerEvent. * @param ev the trace event. 
public	TokenNamepublic	
void	TokenNamevoid	
trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
TracerEvent	TokenNameIdentifier	 Tracer Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// m_traceElements = true; 	TokenNameCOMMENT_LINE	m_traceElements = true; 
// m_traceTemplates = true; 	TokenNameCOMMENT_LINE	m_traceTemplates = true; 
// 	TokenNameCOMMENT_LINE	 
// for(int i = 0; i < m_indent; i++) 	TokenNameCOMMENT_LINE	for(int i = 0; i < m_indent; i++) 
// m_pw.print(" "); 	TokenNameCOMMENT_LINE	m_pw.print(" "); 
// m_indent = m_indent+2; 	TokenNameCOMMENT_LINE	m_indent = m_indent+2; 
// m_pw.print("trace: "); 	TokenNameCOMMENT_LINE	m_pw.print("trace: "); 
_trace	TokenNameIdentifier	 trace
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Method that is called when the end of a trace event occurs. * The method is blocking. It must return before processing continues. * * @param ev the trace event. */	TokenNameCOMMENT_JAVADOC	 Method that is called when the end of a trace event occurs. The method is blocking. It must return before processing continues. * @param ev the trace event. 
public	TokenNamepublic	
void	TokenNamevoid	
traceEnd	TokenNameIdentifier	 trace End
(	TokenNameLPAREN	
TracerEvent	TokenNameIdentifier	 Tracer Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// m_traceElements = true; 	TokenNameCOMMENT_LINE	m_traceElements = true; 
// m_traceTemplates = true; 	TokenNameCOMMENT_LINE	m_traceTemplates = true; 
// 	TokenNameCOMMENT_LINE	 
// m_indent = m_indent-2; 	TokenNameCOMMENT_LINE	m_indent = m_indent-2; 
// for(int i = 0; i < m_indent; i++) 	TokenNameCOMMENT_LINE	for(int i = 0; i < m_indent; i++) 
// m_pw.print(" "); 	TokenNameCOMMENT_LINE	m_pw.print(" "); 
// m_pw.print("etrac: "); 	TokenNameCOMMENT_LINE	m_pw.print("etrac: "); 
// _trace(ev); 	TokenNameCOMMENT_LINE	_trace(ev); 
}	TokenNameRBRACE	
/** * Method that is called just after a select attribute has been evaluated. * * @param ev the generate event. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Method that is called just after a select attribute has been evaluated. * @param ev the generate event. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
selected	TokenNameIdentifier	 selected
(	TokenNameLPAREN	
SelectionEvent	TokenNameIdentifier	 Selection Event
ev	TokenNameIdentifier	 ev
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
m_traceSelection	TokenNameIdentifier	 m trace Selection
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
ete	TokenNameIdentifier	 ete
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
;	TokenNameSEMICOLON	
Node	TokenNameIdentifier	 Node
sourceNode	TokenNameIdentifier	 source Node
=	TokenNameEQUAL	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_sourceNode	TokenNameIdentifier	 m source Node
;	TokenNameSEMICOLON	
SourceLocator	TokenNameIdentifier	 Source Locator
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
sourceNode	TokenNameIdentifier	 source Node
instanceof	TokenNameinstanceof	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
nodeHandler	TokenNameIdentifier	 node Handler
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTMNodeNumber	TokenNameIdentifier	 get DTM Node Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
locator	TokenNameIdentifier	 locator
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
DTMNodeProxy	TokenNameIdentifier	 DTM Node Proxy
)	TokenNameRPAREN	
sourceNode	TokenNameIdentifier	 source Node
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getSourceLocatorFor	TokenNameIdentifier	 get Source Locator For
(	TokenNameLPAREN	
nodeHandler	TokenNameIdentifier	 node Handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
locator	TokenNameIdentifier	 locator
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Selected source node '"	TokenNameStringLiteral	Selected source node '
+	TokenNamePLUS	
sourceNode	TokenNameIdentifier	 source Node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"', at "	TokenNameStringLiteral	', at 
+	TokenNamePLUS	
locator	TokenNameIdentifier	 locator
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Selected source node '"	TokenNameStringLiteral	Selected source node '
+	TokenNamePLUS	
sourceNode	TokenNameIdentifier	 source Node
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// You may not have line numbers if the selection is occuring from a 	TokenNameCOMMENT_LINE	You may not have line numbers if the selection is occuring from a 
// default template. 	TokenNameCOMMENT_LINE	default template. 
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
)	TokenNameRPAREN	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getParentElem	TokenNameIdentifier	 get Parent Elem
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefaultRootRule	TokenNameIdentifier	 get Default Root Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(default root rule) "	TokenNameStringLiteral	(default root rule) 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefaultTextRule	TokenNameIdentifier	 get Default Text Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(default text rule) "	TokenNameStringLiteral	(default text rule) 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
==	TokenNameEQUAL_EQUAL	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDefaultRule	TokenNameIdentifier	 get Default Rule
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(default rule) "	TokenNameStringLiteral	(default rule) 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_attributeName	TokenNameIdentifier	 m attribute Name
+	TokenNamePLUS	
"='"	TokenNameStringLiteral	='
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getSystemId	TokenNameIdentifier	 get System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
" Line #"	TokenNameStringLiteral	 Line #
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
"Column #"	TokenNameStringLiteral	Column #
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_styleNode	TokenNameIdentifier	 m style Node
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
+	TokenNamePLUS	
ete	TokenNameIdentifier	 ete
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_attributeName	TokenNameIdentifier	 m attribute Name
+	TokenNamePLUS	
"='"	TokenNameStringLiteral	='
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_xpath	TokenNameIdentifier	 m xpath
.	TokenNameDOT	
getPatternString	TokenNameIdentifier	 get Pattern String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_selection	TokenNameIdentifier	 m selection
.	TokenNameDOT	
getType	TokenNameIdentifier	 get Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_selection	TokenNameIdentifier	 m selection
.	TokenNameDOT	
CLASS_NODESET	TokenNameIdentifier	 CLASS  NODESET
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
nl	TokenNameIdentifier	 nl
=	TokenNameEQUAL	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_selection	TokenNameIdentifier	 m selection
.	TokenNameDOT	
iter	TokenNameIdentifier	 iter
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// The following lines are added to fix bug#16222. 	TokenNameCOMMENT_LINE	The following lines are added to fix bug#16222. 
// The main cause is that the following loop change the state of iterator, which is shared 	TokenNameCOMMENT_LINE	The main cause is that the following loop change the state of iterator, which is shared 
// with the transformer. The fix is that we record the initial state before looping, then 	TokenNameCOMMENT_LINE	with the transformer. The fix is that we record the initial state before looping, then 
// restore the state when we finish it, which is done in the following lines added. 	TokenNameCOMMENT_LINE	restore the state when we finish it, which is done in the following lines added. 
int	TokenNameint	
currentPos	TokenNameIdentifier	 current Pos
=	TokenNameEQUAL	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
;	TokenNameSEMICOLON	
currentPos	TokenNameIdentifier	 current Pos
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
getCurrentPos	TokenNameIdentifier	 get Current Pos
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
setShouldCacheNodes	TokenNameIdentifier	 set Should Cache Nodes
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// This MUST be done before we clone the iterator! 	TokenNameCOMMENT_LINE	This MUST be done before we clone the iterator! 
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
DTMIterator	TokenNameIdentifier	 DTM Iterator
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// End of block 	TokenNameCOMMENT_LINE	End of block 
try	TokenNametry	
{	TokenNameLBRACE	
clone	TokenNameIdentifier	 clone
=	TokenNameEQUAL	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
cloneWithReset	TokenNameIdentifier	 clone With Reset
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
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" [Can't trace nodelist because it it threw a CloneNotSupportedException]"	TokenNameStringLiteral	 [Can't trace nodelist because it it threw a CloneNotSupportedException]
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DTM	TokenNameIdentifier	 DTM
.	TokenNameDOT	
NULL	TokenNameIdentifier	 NULL
==	TokenNameEQUAL_EQUAL	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" [empty node list]"	TokenNameStringLiteral	 [empty node list]
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
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// m_pw.println(" " + ev.m_processor.getXPathContext().getDTM(pos).getNode(pos)); 	TokenNameCOMMENT_LINE	m_pw.println(" " + ev.m_processor.getXPathContext().getDTM(pos).getNode(pos)); 
DTM	TokenNameIdentifier	 DTM
dtm	TokenNameIdentifier	 dtm
=	TokenNameEQUAL	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_processor	TokenNameIdentifier	 m processor
.	TokenNameDOT	
getXPathContext	TokenNameIdentifier	 get X Path Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getDTM	TokenNameIdentifier	 get DTM
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
" "	TokenNameStringLiteral	 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
dtm	TokenNameIdentifier	 dtm
.	TokenNameDOT	
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
pos	TokenNameIdentifier	 pos
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
pos	TokenNameIdentifier	 pos
=	TokenNameEQUAL	
clone	TokenNameIdentifier	 clone
.	TokenNameDOT	
nextNode	TokenNameIdentifier	 next Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Restore the initial state of the iterator, part of fix for bug#16222. 	TokenNameCOMMENT_LINE	Restore the initial state of the iterator, part of fix for bug#16222. 
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
runTo	TokenNameIdentifier	 run To
(	TokenNameLPAREN	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
nl	TokenNameIdentifier	 nl
.	TokenNameDOT	
setCurrentPos	TokenNameIdentifier	 set Current Pos
(	TokenNameLPAREN	
currentPos	TokenNameIdentifier	 current Pos
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// End of fix for bug#16222 	TokenNameCOMMENT_LINE	End of fix for bug#16222 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_selection	TokenNameIdentifier	 m selection
.	TokenNameDOT	
str	TokenNameIdentifier	 str
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Method that is called after an xsl:apply-templates or xsl:for-each * selection occurs. * * @param ev the generate event. * * @throws javax.xml.transform.TransformerException */	TokenNameCOMMENT_JAVADOC	 Method that is called after an xsl:apply-templates or xsl:for-each selection occurs. * @param ev the generate event. * @throws javax.xml.transform.TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
selectEnd	TokenNameIdentifier	 select End
(	TokenNameLPAREN	
EndSelectionEvent	TokenNameIdentifier	 End Selection Event
ev	TokenNameIdentifier	 ev
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
// Nothing for right now. 	TokenNameCOMMENT_LINE	Nothing for right now. 
}	TokenNameRBRACE	
/** * Print information about a Generate event. * * @param ev the trace event. */	TokenNameCOMMENT_JAVADOC	 Print information about a Generate event. * @param ev the trace event. 
public	TokenNamepublic	
void	TokenNamevoid	
generated	TokenNameIdentifier	 generated
(	TokenNameLPAREN	
GenerateEvent	TokenNameIdentifier	 Generate Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_traceGeneration	TokenNameIdentifier	 m trace Generation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_eventtype	TokenNameIdentifier	 m eventtype
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_STARTDOCUMENT	TokenNameIdentifier	 EVENTTYPE  STARTDOCUMENT
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"STARTDOCUMENT"	TokenNameStringLiteral	STARTDOCUMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_ENDDOCUMENT	TokenNameIdentifier	 EVENTTYPE  ENDDOCUMENT
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ENDDOCUMENT"	TokenNameStringLiteral	ENDDOCUMENT
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_STARTELEMENT	TokenNameIdentifier	 EVENTTYPE  STARTELEMENT
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"STARTELEMENT: "	TokenNameStringLiteral	STARTELEMENT: 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_ENDELEMENT	TokenNameIdentifier	 EVENTTYPE  ENDELEMENT
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ENDELEMENT: "	TokenNameStringLiteral	ENDELEMENT: 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_CHARACTERS	TokenNameIdentifier	 EVENTTYPE  CHARACTERS
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_characters	TokenNameIdentifier	 m characters
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_start	TokenNameIdentifier	 m start
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"CHARACTERS: "	TokenNameStringLiteral	CHARACTERS: 
+	TokenNamePLUS	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_CDATA	TokenNameIdentifier	 EVENTTYPE  CDATA
:	TokenNameCOLON	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
chars	TokenNameIdentifier	 chars
=	TokenNameEQUAL	
new	TokenNamenew	
String	TokenNameIdentifier	 String
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_characters	TokenNameIdentifier	 m characters
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_start	TokenNameIdentifier	 m start
,	TokenNameCOMMA	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_length	TokenNameIdentifier	 m length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"CDATA: "	TokenNameStringLiteral	CDATA: 
+	TokenNamePLUS	
chars	TokenNameIdentifier	 chars
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_COMMENT	TokenNameIdentifier	 EVENTTYPE  COMMENT
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"COMMENT: "	TokenNameStringLiteral	COMMENT: 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_data	TokenNameIdentifier	 m data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_PI	TokenNameIdentifier	 EVENTTYPE  PI
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"PI: "	TokenNameStringLiteral	PI: 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_data	TokenNameIdentifier	 m data
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_ENTITYREF	TokenNameIdentifier	 EVENTTYPE  ENTITYREF
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"ENTITYREF: "	TokenNameStringLiteral	ENTITYREF: 
+	TokenNamePLUS	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_name	TokenNameIdentifier	 m name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
SerializerTrace	TokenNameIdentifier	 Serializer Trace
.	TokenNameDOT	
EVENTTYPE_IGNORABLEWHITESPACE	TokenNameIdentifier	 EVENTTYPE  IGNORABLEWHITESPACE
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"IGNORABLEWHITESPACE"	TokenNameStringLiteral	IGNORABLEWHITESPACE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Print information about an extension event. * * @param ev the extension event to print information about */	TokenNameCOMMENT_JAVADOC	 Print information about an extension event. * @param ev the extension event to print information about 
public	TokenNamepublic	
void	TokenNamevoid	
extension	TokenNameIdentifier	 extension
(	TokenNameLPAREN	
ExtensionEvent	TokenNameIdentifier	 Extension Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
m_traceExtension	TokenNameIdentifier	 m trace Extension
)	TokenNameRPAREN	
{	TokenNameLBRACE	
switch	TokenNameswitch	
(	TokenNameLPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_callType	TokenNameIdentifier	 m call Type
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
ExtensionEvent	TokenNameIdentifier	 Extension Event
.	TokenNameDOT	
DEFAULT_CONSTRUCTOR	TokenNameIdentifier	 DEFAULT  CONSTRUCTOR
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"EXTENSION: "	TokenNameStringLiteral	EXTENSION: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Class	TokenNameIdentifier	 Class
)	TokenNameRPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_method	TokenNameIdentifier	 m method
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#<init>"	TokenNameStringLiteral	#<init>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ExtensionEvent	TokenNameIdentifier	 Extension Event
.	TokenNameDOT	
METHOD	TokenNameIdentifier	 METHOD
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"EXTENSION: "	TokenNameStringLiteral	EXTENSION: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
)	TokenNameRPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_method	TokenNameIdentifier	 m method
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeclaringClass	TokenNameIdentifier	 get Declaring Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Method	TokenNameIdentifier	 Method
)	TokenNameRPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_method	TokenNameIdentifier	 m method
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
case	TokenNamecase	
ExtensionEvent	TokenNameIdentifier	 Extension Event
.	TokenNameDOT	
CONSTRUCTOR	TokenNameIdentifier	 CONSTRUCTOR
:	TokenNameCOLON	
m_pw	TokenNameIdentifier	 m pw
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"EXTENSION: "	TokenNameStringLiteral	EXTENSION: 
+	TokenNamePLUS	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
Constructor	TokenNameIdentifier	 Constructor
)	TokenNameRPAREN	
ev	TokenNameIdentifier	 ev
.	TokenNameDOT	
m_method	TokenNameIdentifier	 m method
)	TokenNameRPAREN	
.	TokenNameDOT	
getDeclaringClass	TokenNameIdentifier	 get Declaring Class
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"#<init>"	TokenNameStringLiteral	#<init>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Print information about an extension event. * * @param ev the extension event to print information about */	TokenNameCOMMENT_JAVADOC	 Print information about an extension event. * @param ev the extension event to print information about 
public	TokenNamepublic	
void	TokenNamevoid	
extensionEnd	TokenNameIdentifier	 extension End
(	TokenNameLPAREN	
ExtensionEvent	TokenNameIdentifier	 Extension Event
ev	TokenNameIdentifier	 ev
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// do nothing 	TokenNameCOMMENT_LINE	do nothing 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
