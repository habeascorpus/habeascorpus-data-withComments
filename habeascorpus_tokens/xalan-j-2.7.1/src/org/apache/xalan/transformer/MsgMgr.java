/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: MsgMgr.java 468645 2006-10-28 06:57:24Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: MsgMgr.java 468645 2006-10-28 06:57:24Z minchau $ 
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
w3c	TokenNameIdentifier	 w3c
.	TokenNameDOT	
dom	TokenNameIdentifier	 dom
.	TokenNameDOT	
Node	TokenNameIdentifier	 Node
;	TokenNameSEMICOLON	
/** * This class will manage error messages, warning messages, and other types of * message events. */	TokenNameCOMMENT_JAVADOC	 This class will manage error messages, warning messages, and other types of message events. 
public	TokenNamepublic	
class	TokenNameclass	
MsgMgr	TokenNameIdentifier	 Msg Mgr
{	TokenNameLBRACE	
/** * Create a message manager object. * * @param transformer non transformer instance */	TokenNameCOMMENT_JAVADOC	 Create a message manager object. * @param transformer non transformer instance 
public	TokenNamepublic	
MsgMgr	TokenNameIdentifier	 Msg Mgr
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
/** Transformer instance */	TokenNameCOMMENT_JAVADOC	 Transformer instance 
private	TokenNameprivate	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
m_transformer	TokenNameIdentifier	 m transformer
;	TokenNameSEMICOLON	
/** * Warn the user of a problem. * This is public for access by extensions. * * @param msg The message text to issue * @param terminate Flag indicating whether to terminate this process * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Warn the user of a problem. This is public for access by extensions. * @param msg The message text to issue @param terminate Flag indicating whether to terminate this process @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
boolean	TokenNameboolean	
terminate	TokenNameIdentifier	 terminate
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
ErrorListener	TokenNameIdentifier	 Error Listener
errHandler	TokenNameIdentifier	 err Handler
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
errHandler	TokenNameIdentifier	 err Handler
)	TokenNameRPAREN	
{	TokenNameLBRACE	
errHandler	TokenNameIdentifier	 err Handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
srcLctr	TokenNameIdentifier	 src Lctr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
terminate	TokenNameIdentifier	 terminate
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
srcLctr	TokenNameIdentifier	 src Lctr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Warn the user of a problem. * * @param msg Message text to issue * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Warn the user of a problem. * @param msg Message text to issue @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Warn the user of a problem. * * @param msg Message text to issue * @param args Arguments to pass to the message * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Warn the user of a problem. * @param msg Message text to issue @param args Arguments to pass to the message @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Warn the user of a problem. * * * @param styleNode Stylesheet node * @param sourceNode Source tree node * @param msg Message text to issue * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Warn the user of a problem. * @param styleNode Stylesheet node @param sourceNode Source tree node @param msg Message text to issue @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Warn the user of a problem. * * @param styleNode Stylesheet node * @param sourceNode Source tree node * @param msg Message text to issue * @param args Arguments to pass to the message * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Warn the user of a problem. * @param styleNode Stylesheet node @param sourceNode Source tree node @param msg Message text to issue @param args Arguments to pass to the message @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
warn	TokenNameIdentifier	 warn
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formattedMsg	TokenNameIdentifier	 formatted Msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createWarning	TokenNameIdentifier	 create Warning
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ErrorListener	TokenNameIdentifier	 Error Listener
errHandler	TokenNameIdentifier	 err Handler
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
errHandler	TokenNameIdentifier	 err Handler
)	TokenNameRPAREN	
errHandler	TokenNameIdentifier	 err Handler
.	TokenNameDOT	
warning	TokenNameIdentifier	 warning
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
srcLctr	TokenNameIdentifier	 src Lctr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/* This method is not properly i18nized. We need to use the following method * Tell the user of an error, and probably throw an * exception. * * @param msg Message text to issue * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * public void error(SourceLocator srcLctr, String msg) throws TransformerException { // Locator locator = m_stylesheetLocatorStack.isEmpty() // ? null : // ((Locator)m_stylesheetLocatorStack.peek()); // Locator locator = null; ErrorListener errHandler = m_transformer.getErrorListener(); if (null != errHandler) errHandler.fatalError(new TransformerException(msg, srcLctr)); else throw new TransformerException(msg, srcLctr); } * @xsl.usage internal */	TokenNameCOMMENT_BLOCK	 This method is not properly i18nized. We need to use the following method Tell the user of an error, and probably throw an exception. * @param msg Message text to issue @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException public void error(SourceLocator srcLctr, String msg) throws TransformerException { // Locator locator = m_stylesheetLocatorStack.isEmpty() // ? null : // ((Locator)m_stylesheetLocatorStack.peek()); // Locator locator = null; ErrorListener errHandler = m_transformer.getErrorListener(); if (null != errHandler) errHandler.fatalError(new TransformerException(msg, srcLctr)); else throw new TransformerException(msg, srcLctr); } @xsl.usage internal 
/** * Tell the user of an error, and probably throw an * exception. * * @param msg Message text to issue * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg Message text to issue @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param msg Message text to issue * @param args Arguments to be passed to the message * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg Message text to issue @param args Arguments to be passed to the message @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param msg Message text to issue * @param e Exception to throw * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg Message text to issue @param e Exception to throw @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param msg Message text to issue * @param args Arguments to use in message * @param e Exception to throw * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param msg Message text to issue @param args Arguments to use in message @param e Exception to throw @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
,	TokenNameCOMMA	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
//msg = (null == msg) ? XSLTErrorResources.ER_PROCESSOR_ERROR : msg; 	TokenNameCOMMENT_LINE	msg = (null == msg) ? XSLTErrorResources.ER_PROCESSOR_ERROR : msg; 
String	TokenNameIdentifier	 String
formattedMsg	TokenNameIdentifier	 formatted Msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Locator locator = m_stylesheetLocatorStack.isEmpty() 	TokenNameCOMMENT_LINE	Locator locator = m_stylesheetLocatorStack.isEmpty() 
// ? null : 	TokenNameCOMMENT_LINE	? null : 
// ((Locator)m_stylesheetLocatorStack.peek()); 	TokenNameCOMMENT_LINE	((Locator)m_stylesheetLocatorStack.peek()); 
// Locator locator = null; 	TokenNameCOMMENT_LINE	Locator locator = null; 
ErrorListener	TokenNameIdentifier	 Error Listener
errHandler	TokenNameIdentifier	 err Handler
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
errHandler	TokenNameIdentifier	 err Handler
)	TokenNameRPAREN	
errHandler	TokenNameIdentifier	 err Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
srcLctr	TokenNameIdentifier	 src Lctr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
srcLctr	TokenNameIdentifier	 src Lctr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param styleNode Stylesheet node * @param sourceNode Source tree node * @param msg Message text to issue * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param styleNode Stylesheet node @param sourceNode Source tree node @param msg Message text to issue @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Tell the user of an error, and probably throw an * exception. * * @param styleNode Stylesheet node * @param sourceNode Source tree node * @param msg Message text to issue * @param args Arguments to use in message * @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide * the error condition is severe enough to halt processing. * * @throws TransformerException * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Tell the user of an error, and probably throw an exception. * @param styleNode Stylesheet node @param sourceNode Source tree node @param msg Message text to issue @param args Arguments to use in message @throws XSLProcessorException thrown if the active ProblemListener and XPathContext decide the error condition is severe enough to halt processing. * @throws TransformerException @xsl.usage internal 
public	TokenNamepublic	
void	TokenNamevoid	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
SourceLocator	TokenNameIdentifier	 Source Locator
srcLctr	TokenNameIdentifier	 src Lctr
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
styleNode	TokenNameIdentifier	 style Node
,	TokenNameCOMMA	
Node	TokenNameIdentifier	 Node
sourceNode	TokenNameIdentifier	 source Node
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
args	TokenNameIdentifier	 args
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
formattedMsg	TokenNameIdentifier	 formatted Msg
=	TokenNameEQUAL	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Locator locator = m_stylesheetLocatorStack.isEmpty() 	TokenNameCOMMENT_LINE	Locator locator = m_stylesheetLocatorStack.isEmpty() 
// ? null : 	TokenNameCOMMENT_LINE	? null : 
// ((Locator)m_stylesheetLocatorStack.peek()); 	TokenNameCOMMENT_LINE	((Locator)m_stylesheetLocatorStack.peek()); 
// Locator locator = null; 	TokenNameCOMMENT_LINE	Locator locator = null; 
ErrorListener	TokenNameIdentifier	 Error Listener
errHandler	TokenNameIdentifier	 err Handler
=	TokenNameEQUAL	
m_transformer	TokenNameIdentifier	 m transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
errHandler	TokenNameIdentifier	 err Handler
)	TokenNameRPAREN	
errHandler	TokenNameIdentifier	 err Handler
.	TokenNameDOT	
fatalError	TokenNameIdentifier	 fatal Error
(	TokenNameLPAREN	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
srcLctr	TokenNameIdentifier	 src Lctr
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
else	TokenNameelse	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
formattedMsg	TokenNameIdentifier	 formatted Msg
,	TokenNameCOMMA	
srcLctr	TokenNameIdentifier	 src Lctr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
