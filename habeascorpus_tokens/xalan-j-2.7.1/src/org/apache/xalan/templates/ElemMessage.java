/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ElemMessage.java 468643 2006-10-28 06:56:03Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ElemMessage.java 468643 2006-10-28 06:56:03Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
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
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
res	TokenNameIdentifier	 res
.	TokenNameDOT	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
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
/** * Implement xsl:message. * <pre> * <!ELEMENT xsl:message %template;> * <!ATTLIST xsl:message * %space-att; * terminate (yes|no) "no" * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#message">message in XSLT Specification</a> * @xsl.usage advanced */	TokenNameCOMMENT_JAVADOC	 Implement xsl:message. <pre> <!ELEMENT xsl:message %template;> <!ATTLIST xsl:message %space-att; terminate (yes|no) "no" > </pre> @see <a href="http://www.w3.org/TR/xslt#message">message in XSLT Specification</a> @xsl.usage advanced 
public	TokenNamepublic	
class	TokenNameclass	
ElemMessage	TokenNameIdentifier	 Elem Message
extends	TokenNameextends	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
1530472462155060023L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * If the terminate attribute has the value yes, then the * XSLT transformer should terminate processing after sending * the message. The default value is no. * @serial */	TokenNameCOMMENT_JAVADOC	 If the terminate attribute has the value yes, then the XSLT transformer should terminate processing after sending the message. The default value is no. @serial 
private	TokenNameprivate	
boolean	TokenNameboolean	
m_terminate	TokenNameIdentifier	 m terminate
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ATTRVAL_NO	TokenNameIdentifier	 ATTRVAL  NO
;	TokenNameSEMICOLON	
// default value 	TokenNameCOMMENT_LINE	default value 
/** * Set the "terminate" attribute. * If the terminate attribute has the value yes, then the * XSLT transformer should terminate processing after sending * the message. The default value is no. * * @param v Value to set for "terminate" attribute. */	TokenNameCOMMENT_JAVADOC	 Set the "terminate" attribute. If the terminate attribute has the value yes, then the XSLT transformer should terminate processing after sending the message. The default value is no. * @param v Value to set for "terminate" attribute. 
public	TokenNamepublic	
void	TokenNamevoid	
setTerminate	TokenNameIdentifier	 set Terminate
(	TokenNameLPAREN	
boolean	TokenNameboolean	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_terminate	TokenNameIdentifier	 m terminate
=	TokenNameEQUAL	
v	TokenNameIdentifier	 v
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the "terminate" attribute. * If the terminate attribute has the value yes, then the * XSLT transformer should terminate processing after sending * the message. The default value is no. * * @return value of "terminate" attribute. */	TokenNameCOMMENT_JAVADOC	 Get the "terminate" attribute. If the terminate attribute has the value yes, then the XSLT transformer should terminate processing after sending the message. The default value is no. * @return value of "terminate" attribute. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getTerminate	TokenNameIdentifier	 get Terminate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
m_terminate	TokenNameIdentifier	 m terminate
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an int constant identifying the type of element. * @see org.apache.xalan.templates.Constants * * @return The token ID for this element */	TokenNameCOMMENT_JAVADOC	 Get an int constant identifying the type of element. @see org.apache.xalan.templates.Constants * @return The token ID for this element 
public	TokenNamepublic	
int	TokenNameint	
getXSLToken	TokenNameIdentifier	 get XSL Token
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_MESSAGE	TokenNameIdentifier	 ELEMNAME  MESSAGE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Return the node name. * * @return name of the element */	TokenNameCOMMENT_JAVADOC	 Return the node name. * @return name of the element 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getNodeName	TokenNameIdentifier	 get Node Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ELEMNAME_MESSAGE_STRING	TokenNameIdentifier	 ELEMNAME  MESSAGE  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Send a message to diagnostics. * The xsl:message instruction sends a message in a way that * is dependent on the XSLT transformer. The content of the xsl:message * instruction is a template. The xsl:message is instantiated by * instantiating the content to create an XML fragment. This XML * fragment is the content of the message. * * @param transformer non-null reference to the the current transform-time state. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Send a message to diagnostics. The xsl:message instruction sends a message in a way that is dependent on the XSLT transformer. The content of the xsl:message instruction is a template. The xsl:message is instantiated by instantiating the content to create an XML fragment. This XML fragment is the content of the message. * @param transformer non-null reference to the the current transform-time state. * @throws TransformerException 
public	TokenNamepublic	
void	TokenNamevoid	
execute	TokenNameIdentifier	 execute
(	TokenNameLPAREN	
TransformerImpl	TokenNameIdentifier	 Transformer Impl
transformer	TokenNameIdentifier	 transformer
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEvent	TokenNameIdentifier	 fire Trace Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
data	TokenNameIdentifier	 data
=	TokenNameEQUAL	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transformToString	TokenNameIdentifier	 transform To String
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getMsgMgr	TokenNameIdentifier	 get Msg Mgr
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
message	TokenNameIdentifier	 message
(	TokenNameLPAREN	
this	TokenNamethis	
,	TokenNameCOMMA	
data	TokenNameIdentifier	 data
,	TokenNameCOMMA	
m_terminate	TokenNameIdentifier	 m terminate
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_terminate	TokenNameIdentifier	 m terminate
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
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
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_STYLESHEET_DIRECTED_TERMINATION	TokenNameIdentifier	 ER  STYLESHEET  DIRECTED  TERMINATION
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Stylesheet directed termination")); 	TokenNameCOMMENT_LINE	"Stylesheet directed termination")); 
if	TokenNameif	
(	TokenNameLPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getDebug	TokenNameIdentifier	 get Debug
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
getTraceManager	TokenNameIdentifier	 get Trace Manager
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
fireTraceEndEvent	TokenNameIdentifier	 fire Trace End Event
(	TokenNameLPAREN	
this	TokenNamethis	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
