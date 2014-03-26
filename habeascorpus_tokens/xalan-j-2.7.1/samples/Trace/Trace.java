/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: Trace.java 470245 2006-11-02 06:34:33Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: Trace.java 470245 2006-11-02 06:34:33Z minchau $ 
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Transformer	TokenNameIdentifier	 Transformer
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
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
TransformerFactory	TokenNameIdentifier	 Transformer Factory
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamResult	TokenNameIdentifier	 Stream Result
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
.	TokenNameDOT	
StreamSource	TokenNameIdentifier	 Stream Source
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
.	TokenNameDOT	
PrintTraceListener	TokenNameIdentifier	 Print Trace Listener
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
trace	TokenNameIdentifier	 trace
.	TokenNameDOT	
TraceManager	TokenNameIdentifier	 Trace Manager
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
/** * Sample for demonstrating Xalan "trace" interface. * Usage: run in Trace directory: java Trace * For an extensions trace sample, run in extensions * directory: java Trace 3-java-namespace */	TokenNameCOMMENT_JAVADOC	 Sample for demonstrating Xalan "trace" interface. Usage: run in Trace directory: java Trace For an extensions trace sample, run in extensions directory: java Trace 3-java-namespace 
public	TokenNamepublic	
class	TokenNameclass	
Trace	TokenNameIdentifier	 Trace
{	TokenNameLBRACE	
public	TokenNamepublic	
static	TokenNamestatic	
void	TokenNamevoid	
main	TokenNameIdentifier	 main
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
TransformerException	TokenNameIdentifier	 Transformer Exception
,	TokenNameCOMMA	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
,	TokenNameCOMMA	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
TooManyListenersException	TokenNameIdentifier	 Too Many Listeners Exception
,	TokenNameCOMMA	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
"foo"	TokenNameStringLiteral	foo
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
args	TokenNameIdentifier	 args
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
fileName	TokenNameIdentifier	 file Name
=	TokenNameEQUAL	
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Set up a PrintTraceListener object to print to a file. 	TokenNameCOMMENT_LINE	Set up a PrintTraceListener object to print to a file. 
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
fw	TokenNameIdentifier	 fw
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
"events.log"	TokenNameStringLiteral	events.log
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
fw	TokenNameIdentifier	 fw
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintTraceListener	TokenNameIdentifier	 Print Trace Listener
ptl	TokenNameIdentifier	 ptl
=	TokenNameEQUAL	
new	TokenNamenew	
PrintTraceListener	TokenNameIdentifier	 Print Trace Listener
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Print information as each node is 'executed' in the stylesheet. 	TokenNameCOMMENT_LINE	Print information as each node is 'executed' in the stylesheet. 
ptl	TokenNameIdentifier	 ptl
.	TokenNameDOT	
m_traceElements	TokenNameIdentifier	 m trace Elements
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Print information after each result-tree generation event. 	TokenNameCOMMENT_LINE	Print information after each result-tree generation event. 
ptl	TokenNameIdentifier	 ptl
.	TokenNameDOT	
m_traceGeneration	TokenNameIdentifier	 m trace Generation
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Print information after each selection event. 	TokenNameCOMMENT_LINE	Print information after each selection event. 
ptl	TokenNameIdentifier	 ptl
.	TokenNameDOT	
m_traceSelection	TokenNameIdentifier	 m trace Selection
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Print information whenever a template is invoked. 	TokenNameCOMMENT_LINE	Print information whenever a template is invoked. 
ptl	TokenNameIdentifier	 ptl
.	TokenNameDOT	
m_traceTemplates	TokenNameIdentifier	 m trace Templates
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Print information whenever an extension call is made. 	TokenNameCOMMENT_LINE	Print information whenever an extension call is made. 
ptl	TokenNameIdentifier	 ptl
.	TokenNameDOT	
m_traceExtension	TokenNameIdentifier	 m trace Extension
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// Set up the transformation 	TokenNameCOMMENT_LINE	Set up the transformation 
TransformerFactory	TokenNameIdentifier	 Transformer Factory
tFactory	TokenNameIdentifier	 t Factory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
tFactory	TokenNameIdentifier	 t Factory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
".xsl"	TokenNameStringLiteral	.xsl
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Cast the Transformer object to TransformerImpl. 	TokenNameCOMMENT_LINE	Cast the Transformer object to TransformerImpl. 
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
instanceof	TokenNameinstanceof	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformerImpl	TokenNameIdentifier	 transformer Impl
=	TokenNameEQUAL	
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
;	TokenNameSEMICOLON	
// Register the TraceListener with a TraceManager associated 	TokenNameCOMMENT_LINE	Register the TraceListener with a TraceManager associated 
// with the TransformerImpl. 	TokenNameCOMMENT_LINE	with the TransformerImpl. 
TraceManager	TokenNameIdentifier	 Trace Manager
trMgr	TokenNameIdentifier	 tr Mgr
=	TokenNameEQUAL	
transformerImpl	TokenNameIdentifier	 transformer Impl
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
trMgr	TokenNameIdentifier	 tr Mgr
.	TokenNameDOT	
addTraceListener	TokenNameIdentifier	 add Trace Listener
(	TokenNameLPAREN	
ptl	TokenNameIdentifier	 ptl
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Perform the transformation --printing information to 	TokenNameCOMMENT_LINE	Perform the transformation --printing information to 
// the events log during the process. 	TokenNameCOMMENT_LINE	the events log during the process. 
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
".xml"	TokenNameStringLiteral	.xml
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
new	TokenNamenew	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
FileWriter	TokenNameIdentifier	 File Writer
(	TokenNameLPAREN	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
".out"	TokenNameStringLiteral	.out
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Close the PrintWriter and FileWriter. 	TokenNameCOMMENT_LINE	Close the PrintWriter and FileWriter. 
pw	TokenNameIdentifier	 pw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fw	TokenNameIdentifier	 fw
.	TokenNameDOT	
close	TokenNameIdentifier	 close
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"**The output is in "	TokenNameStringLiteral	**The output is in 
+	TokenNamePLUS	
fileName	TokenNameIdentifier	 file Name
+	TokenNamePLUS	
".out; the log is in events.log ****"	TokenNameStringLiteral	.out; the log is in events.log ****
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
