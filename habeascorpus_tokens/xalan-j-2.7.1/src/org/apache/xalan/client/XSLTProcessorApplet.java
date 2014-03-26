/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: XSLTProcessorApplet.java 469316 2006-10-30 23:32:59Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: XSLTProcessorApplet.java 469316 2006-10-30 23:32:59Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
client	TokenNameIdentifier	 client
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
applet	TokenNameIdentifier	 applet
.	TokenNameDOT	
Applet	TokenNameIdentifier	 Applet
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
awt	TokenNameIdentifier	 awt
.	TokenNameDOT	
Graphics	TokenNameIdentifier	 Graphics
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
PrintWriter	TokenNameIdentifier	 Print Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringReader	TokenNameIdentifier	 String Reader
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
StringWriter	TokenNameIdentifier	 String Writer
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
net	TokenNameIdentifier	 net
.	TokenNameDOT	
URL	TokenNameIdentifier	 URL
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Hashtable	TokenNameIdentifier	 Hashtable
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Enumeration	TokenNameIdentifier	 Enumeration
;	TokenNameSEMICOLON	
import	TokenNameimport	
javax	TokenNameIdentifier	 javax
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
.	TokenNameDOT	
Templates	TokenNameIdentifier	 Templates
;	TokenNameSEMICOLON	
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
/** * Provides applet host for the XSLT processor. To perform transformations on an HTML client: * <ol> * <li>Use an &lt;applet&gt; tag to embed this applet in the HTML client.</li> * <li>Use the DocumentURL and StyleURL PARAM tags or the {@link #setDocumentURL} and * {@link #setStyleURL} methods to specify the XML source document and XSL stylesheet.</li> * <li>Call the {@link #getHtmlText} method (or one of the transformToHtml() methods) * to perform the transformation and return the result as a String.</li> * </ol> * * This class extends Applet which ultimately causes this class to implement Serializable. * This is a serious restriction on this class. All fields that are not transient and not * static are written-out/read-in during serialization. So even private fields essentially * become part of the API. Developers need to take care when modifying fields. * @xsl.usage general */	TokenNameCOMMENT_JAVADOC	 Provides applet host for the XSLT processor. To perform transformations on an HTML client: <ol> <li>Use an &lt;applet&gt; tag to embed this applet in the HTML client.</li> <li>Use the DocumentURL and StyleURL PARAM tags or the {@link #setDocumentURL} and {@link #setStyleURL} methods to specify the XML source document and XSL stylesheet.</li> <li>Call the {@link #getHtmlText} method (or one of the transformToHtml() methods) to perform the transformation and return the result as a String.</li> </ol> * This class extends Applet which ultimately causes this class to implement Serializable. This is a serious restriction on this class. All fields that are not transient and not static are written-out/read-in during serialization. So even private fields essentially become part of the API. Developers need to take care when modifying fields. @xsl.usage general 
public	TokenNamepublic	
class	TokenNameclass	
XSLTProcessorApplet	TokenNameIdentifier	 XSLT Processor Applet
extends	TokenNameextends	
Applet	TokenNameIdentifier	 Applet
{	TokenNameLBRACE	
/** * The stylesheet processor. * This field is now transient because a * javax.xml.transform.TransformerFactory from JAXP * makes no claims to be serializable. */	TokenNameCOMMENT_JAVADOC	 The stylesheet processor. This field is now transient because a javax.xml.transform.TransformerFactory from JAXP makes no claims to be serializable. 
transient	TokenNametransient	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
m_tfactory	TokenNameIdentifier	 m tfactory
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * @serial */	TokenNameCOMMENT_JAVADOC	 @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_styleURL	TokenNameIdentifier	 m style URL
;	TokenNameSEMICOLON	
/** * @serial */	TokenNameCOMMENT_JAVADOC	 @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_documentURL	TokenNameIdentifier	 m document URL
;	TokenNameSEMICOLON	
// Parameter names. To change a name of a parameter, you need only make 	TokenNameCOMMENT_LINE	Parameter names. To change a name of a parameter, you need only make 
// a single change. Simply modify the value of the parameter string below. 	TokenNameCOMMENT_LINE	a single change. Simply modify the value of the parameter string below. 
//-------------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	-------------------------------------------------------------------------- 
/** * @serial */	TokenNameCOMMENT_JAVADOC	 @serial 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PARAM_styleURL	TokenNameIdentifier	 PARAM style URL
=	TokenNameEQUAL	
"styleURL"	TokenNameStringLiteral	styleURL
;	TokenNameSEMICOLON	
/** * @serial */	TokenNameCOMMENT_JAVADOC	 @serial 
private	TokenNameprivate	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PARAM_documentURL	TokenNameIdentifier	 PARAM document URL
=	TokenNameEQUAL	
"documentURL"	TokenNameStringLiteral	documentURL
;	TokenNameSEMICOLON	
// We'll keep the DOM trees around, so tell which trees 	TokenNameCOMMENT_LINE	We'll keep the DOM trees around, so tell which trees 
// are cached. 	TokenNameCOMMENT_LINE	are cached. 
/** * @serial */	TokenNameCOMMENT_JAVADOC	 @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_styleURLOfCached	TokenNameIdentifier	 m style URL Of Cached
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * @serial */	TokenNameCOMMENT_JAVADOC	 @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_documentURLOfCached	TokenNameIdentifier	 m document URL Of Cached
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Save this for use on the worker thread; may not be necessary. * @serial */	TokenNameCOMMENT_JAVADOC	 Save this for use on the worker thread; may not be necessary. @serial 
private	TokenNameprivate	
URL	TokenNameIdentifier	 URL
m_codeBase	TokenNameIdentifier	 m code Base
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * @serial */	TokenNameCOMMENT_JAVADOC	 @serial 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_treeURL	TokenNameIdentifier	 m tree URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * DocumentBase URL * @serial */	TokenNameCOMMENT_JAVADOC	 DocumentBase URL @serial 
private	TokenNameprivate	
URL	TokenNameIdentifier	 URL
m_documentBase	TokenNameIdentifier	 m document Base
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Thread stuff for the trusted worker thread. */	TokenNameCOMMENT_JAVADOC	 Thread stuff for the trusted worker thread. 
transient	TokenNametransient	
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
m_callThread	TokenNameIdentifier	 m call Thread
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
transient	TokenNametransient	
private	TokenNameprivate	
TrustedAgent	TokenNameIdentifier	 Trusted Agent
m_trustedAgent	TokenNameIdentifier	 m trusted Agent
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Thread for running TrustedAgent. */	TokenNameCOMMENT_JAVADOC	 Thread for running TrustedAgent. 
transient	TokenNametransient	
private	TokenNameprivate	
Thread	TokenNameIdentifier	 Thread
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Where the worker thread puts the HTML text. */	TokenNameCOMMENT_JAVADOC	 Where the worker thread puts the HTML text. 
transient	TokenNametransient	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_htmlText	TokenNameIdentifier	 m html Text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Where the worker thread puts the document/stylesheet text. */	TokenNameCOMMENT_JAVADOC	 Where the worker thread puts the document/stylesheet text. 
transient	TokenNametransient	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_sourceText	TokenNameIdentifier	 m source Text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * Stylesheet attribute name and value that the caller can set. */	TokenNameCOMMENT_JAVADOC	 Stylesheet attribute name and value that the caller can set. 
transient	TokenNametransient	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_nameOfIDAttrOfElemToModify	TokenNameIdentifier	 m name Of ID Attr Of Elem To Modify
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
transient	TokenNametransient	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_elemIdToModify	TokenNameIdentifier	 m elem Id To Modify
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
transient	TokenNametransient	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_attrNameToSet	TokenNameIdentifier	 m attr Name To Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** */	TokenNameCOMMENT_JAVADOC	 
transient	TokenNametransient	
private	TokenNameprivate	
String	TokenNameIdentifier	 String
m_attrValueToSet	TokenNameIdentifier	 m attr Value To Set
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** * The XSLTProcessorApplet constructor takes no arguments. */	TokenNameCOMMENT_JAVADOC	 The XSLTProcessorApplet constructor takes no arguments. 
public	TokenNamepublic	
XSLTProcessorApplet	TokenNameIdentifier	 XSLT Processor Applet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Get basic information about the applet * @return A String with the applet name and author. */	TokenNameCOMMENT_JAVADOC	 Get basic information about the applet @return A String with the applet name and author. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getAppletInfo	TokenNameIdentifier	 get Applet Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"Name: XSLTProcessorApplet "	TokenNameStringLiteral	Name: XSLTProcessorApplet 
+	TokenNamePLUS	
"Author: Scott Boag"	TokenNameStringLiteral	Author: Scott Boag
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get descriptions of the applet parameters. * @return A two-dimensional array of Strings with Name, Type, and Description * for each parameter. */	TokenNameCOMMENT_JAVADOC	 Get descriptions of the applet parameters. @return A two-dimensional array of Strings with Name, Type, and Description for each parameter. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
getParameterInfo	TokenNameIdentifier	 get Parameter Info
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
info	TokenNameIdentifier	 info
=	TokenNameEQUAL	
{	TokenNameLBRACE	
{	TokenNameLBRACE	
PARAM_styleURL	TokenNameIdentifier	 PARAM style URL
,	TokenNameCOMMA	
"String"	TokenNameStringLiteral	String
,	TokenNameCOMMA	
"URL to an XSL stylesheet"	TokenNameStringLiteral	URL to an XSL stylesheet
}	TokenNameRBRACE	
,	TokenNameCOMMA	
{	TokenNameLBRACE	
PARAM_documentURL	TokenNameIdentifier	 PARAM document URL
,	TokenNameCOMMA	
"String"	TokenNameStringLiteral	String
,	TokenNameCOMMA	
"URL to an XML document"	TokenNameStringLiteral	URL to an XML document
}	TokenNameRBRACE	
,	TokenNameCOMMA	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
info	TokenNameIdentifier	 info
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Standard applet initialization. */	TokenNameCOMMENT_JAVADOC	 Standard applet initialization. 
public	TokenNamepublic	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// PARAMETER SUPPORT 	TokenNameCOMMENT_LINE	PARAMETER SUPPORT 
// The following code retrieves the value of each parameter 	TokenNameCOMMENT_LINE	The following code retrieves the value of each parameter 
// specified with the <PARAM> tag and stores it in a member 	TokenNameCOMMENT_LINE	specified with the <PARAM> tag and stores it in a member 
// variable. 	TokenNameCOMMENT_LINE	variable. 
//---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
String	TokenNameIdentifier	 String
param	TokenNameIdentifier	 param
;	TokenNameSEMICOLON	
// styleURL: Parameter description 	TokenNameCOMMENT_LINE	styleURL: Parameter description 
//---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
PARAM_styleURL	TokenNameIdentifier	 PARAM style URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// stylesheet parameters 	TokenNameCOMMENT_LINE	stylesheet parameters 
m_parameters	TokenNameIdentifier	 m parameters
=	TokenNameEQUAL	
new	TokenNamenew	
Hashtable	TokenNameIdentifier	 Hashtable
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
setStyleURL	TokenNameIdentifier	 set Style URL
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// documentURL: Parameter description 	TokenNameCOMMENT_LINE	documentURL: Parameter description 
//---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
param	TokenNameIdentifier	 param
=	TokenNameEQUAL	
getParameter	TokenNameIdentifier	 get Parameter
(	TokenNameLPAREN	
PARAM_documentURL	TokenNameIdentifier	 PARAM document URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
setDocumentURL	TokenNameIdentifier	 set Document URL
(	TokenNameLPAREN	
param	TokenNameIdentifier	 param
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_codeBase	TokenNameIdentifier	 m code Base
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getCodeBase	TokenNameIdentifier	 get Code Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_documentBase	TokenNameIdentifier	 m document Base
=	TokenNameEQUAL	
this	TokenNamethis	
.	TokenNameDOT	
getDocumentBase	TokenNameIdentifier	 get Document Base
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If you use a ResourceWizard-generated "control creator" class to 	TokenNameCOMMENT_LINE	If you use a ResourceWizard-generated "control creator" class to 
// arrange controls in your applet, you may want to call its 	TokenNameCOMMENT_LINE	arrange controls in your applet, you may want to call its 
// CreateControls() method from within this method. Remove the following 	TokenNameCOMMENT_LINE	CreateControls() method from within this method. Remove the following 
// call to resize() before adding the call to CreateControls(); 	TokenNameCOMMENT_LINE	call to resize() before adding the call to CreateControls(); 
// CreateControls() does its own resizing. 	TokenNameCOMMENT_LINE	CreateControls() does its own resizing. 
//---------------------------------------------------------------------- 	TokenNameCOMMENT_LINE	---------------------------------------------------------------------- 
resize	TokenNameIdentifier	 resize
(	TokenNameLPAREN	
320	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
240	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Automatically called when the HTML client containing the applet loads. * This method starts execution of the applet thread. */	TokenNameCOMMENT_JAVADOC	 Automatically called when the HTML client containing the applet loads. This method starts execution of the applet thread. 
public	TokenNamepublic	
void	TokenNamevoid	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_trustedAgent	TokenNameIdentifier	 m trusted Agent
=	TokenNameEQUAL	
new	TokenNamenew	
TrustedAgent	TokenNameIdentifier	 Trusted Agent
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Thread	TokenNameIdentifier	 Thread
currentThread	TokenNameIdentifier	 current Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
=	TokenNameEQUAL	
new	TokenNamenew	
Thread	TokenNameIdentifier	 Thread
(	TokenNameLPAREN	
currentThread	TokenNameIdentifier	 current Thread
.	TokenNameDOT	
getThreadGroup	TokenNameIdentifier	 get Thread Group
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
m_trustedAgent	TokenNameIdentifier	 m trusted Agent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
.	TokenNameDOT	
start	TokenNameIdentifier	 start
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
m_tfactory	TokenNameIdentifier	 m tfactory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
showStatus	TokenNameIdentifier	 show Status
(	TokenNameLPAREN	
"Causing Transformer and Parser to Load and JIT..."	TokenNameStringLiteral	Causing Transformer and Parser to Load and JIT...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Prime the pump so that subsequent transforms are faster. 	TokenNameCOMMENT_LINE	Prime the pump so that subsequent transforms are faster. 
StringReader	TokenNameIdentifier	 String Reader
xmlbuf	TokenNameIdentifier	 xmlbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"<?xml version='1.0'?><foo/>"	TokenNameStringLiteral	<?xml version='1.0'?><foo/>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StringReader	TokenNameIdentifier	 String Reader
xslbuf	TokenNameIdentifier	 xslbuf
=	TokenNameEQUAL	
new	TokenNamenew	
StringReader	TokenNameIdentifier	 String Reader
(	TokenNameLPAREN	
"<?xml version='1.0'?><xsl:stylesheet xmlns:xsl='http://www.w3.org/1999/XSL/Transform' version='1.0'><xsl:template match='foo'><out/></xsl:template></xsl:stylesheet>"	TokenNameStringLiteral	<?xml version='1.0'?><xsl:stylesheet xmlns:xsl='http://www.w3.org/1999/XSL/Transform' version='1.0'><xsl:template match='foo'><out/></xsl:template></xsl:stylesheet>
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_tfactory	TokenNameIdentifier	 m tfactory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Templates	TokenNameIdentifier	 Templates
templates	TokenNameIdentifier	 templates
=	TokenNameEQUAL	
m_tfactory	TokenNameIdentifier	 m tfactory
.	TokenNameDOT	
newTemplates	TokenNameIdentifier	 new Templates
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
xslbuf	TokenNameIdentifier	 xslbuf
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
xmlbuf	TokenNameIdentifier	 xmlbuf
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Primed the pump!"	TokenNameStringLiteral	Primed the pump!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
showStatus	TokenNameIdentifier	 show Status
(	TokenNameLPAREN	
"Ready to go!"	TokenNameStringLiteral	Ready to go!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
this	TokenNamethis	
.	TokenNameDOT	
showStatus	TokenNameIdentifier	 show Status
(	TokenNameLPAREN	
"Could not prime the pump!"	TokenNameStringLiteral	Could not prime the pump!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"Could not prime the pump!"	TokenNameStringLiteral	Could not prime the pump!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Do not call; this applet contains no UI or visual components. * */	TokenNameCOMMENT_JAVADOC	 Do not call; this applet contains no UI or visual components. 
public	TokenNamepublic	
void	TokenNamevoid	
paint	TokenNameIdentifier	 paint
(	TokenNameLPAREN	
Graphics	TokenNameIdentifier	 Graphics
g	TokenNameIdentifier	 g
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
/** * Automatically called when the HTML page containing the applet is no longer * on the screen. Stops execution of the applet thread. */	TokenNameCOMMENT_JAVADOC	 Automatically called when the HTML page containing the applet is no longer on the screen. Stops execution of the applet thread. 
public	TokenNamepublic	
void	TokenNamevoid	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// m_trustedWorker.destroy(); 	TokenNameCOMMENT_LINE	m_trustedWorker.destroy(); 
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_styleURLOfCached	TokenNameIdentifier	 m style URL Of Cached
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_documentURLOfCached	TokenNameIdentifier	 m document URL Of Cached
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Cleanup; called when applet is terminated and unloaded. */	TokenNameCOMMENT_JAVADOC	 Cleanup; called when applet is terminated and unloaded. 
public	TokenNamepublic	
void	TokenNamevoid	
destroy	TokenNameIdentifier	 destroy
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
.	TokenNameDOT	
stop	TokenNameIdentifier	 stop
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// m_trustedWorker.destroy(); 	TokenNameCOMMENT_LINE	m_trustedWorker.destroy(); 
m_trustedWorker	TokenNameIdentifier	 m trusted Worker
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_styleURLOfCached	TokenNameIdentifier	 m style URL Of Cached
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_documentURLOfCached	TokenNameIdentifier	 m document URL Of Cached
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the URL to the XSL stylesheet that will be used * to transform the input XML. No processing is done yet. * @param urlString valid URL string for XSL stylesheet. */	TokenNameCOMMENT_JAVADOC	 Set the URL to the XSL stylesheet that will be used to transform the input XML. No processing is done yet. @param urlString valid URL string for XSL stylesheet. 
public	TokenNamepublic	
void	TokenNamevoid	
setStyleURL	TokenNameIdentifier	 set Style URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlString	TokenNameIdentifier	 url String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_styleURL	TokenNameIdentifier	 m style URL
=	TokenNameEQUAL	
urlString	TokenNameIdentifier	 url String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set the URL to the XML document that will be transformed * with the XSL stylesheet. No processing is done yet. * @param urlString valid URL string for XML document. */	TokenNameCOMMENT_JAVADOC	 Set the URL to the XML document that will be transformed with the XSL stylesheet. No processing is done yet. @param urlString valid URL string for XML document. 
public	TokenNamepublic	
void	TokenNamevoid	
setDocumentURL	TokenNameIdentifier	 set Document URL
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
urlString	TokenNameIdentifier	 url String
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_documentURL	TokenNameIdentifier	 m document URL
=	TokenNameEQUAL	
urlString	TokenNameIdentifier	 url String
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * The processor keeps a cache of the source and * style trees, so call this method if they have changed * or you want to do garbage collection. */	TokenNameCOMMENT_JAVADOC	 The processor keeps a cache of the source and style trees, so call this method if they have changed or you want to do garbage collection. 
public	TokenNamepublic	
void	TokenNamevoid	
freeCache	TokenNameIdentifier	 free Cache
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_styleURLOfCached	TokenNameIdentifier	 m style URL Of Cached
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_documentURLOfCached	TokenNameIdentifier	 m document URL Of Cached
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Set an attribute in the stylesheet, which gives the ability * to have some dynamic selection control. * @param nameOfIDAttrOfElemToModify The name of an attribute to search for a unique id. * @param elemId The unique ID to look for. * @param attrName Once the element is found, the name of the attribute to set. * @param value The value to set the attribute to. */	TokenNameCOMMENT_JAVADOC	 Set an attribute in the stylesheet, which gives the ability to have some dynamic selection control. @param nameOfIDAttrOfElemToModify The name of an attribute to search for a unique id. @param elemId The unique ID to look for. @param attrName Once the element is found, the name of the attribute to set. @param value The value to set the attribute to. 
public	TokenNamepublic	
void	TokenNamevoid	
setStyleSheetAttribute	TokenNameIdentifier	 set Style Sheet Attribute
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
nameOfIDAttrOfElemToModify	TokenNameIdentifier	 name Of ID Attr Of Elem To Modify
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
elemId	TokenNameIdentifier	 elem Id
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
attrName	TokenNameIdentifier	 attr Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_nameOfIDAttrOfElemToModify	TokenNameIdentifier	 m name Of ID Attr Of Elem To Modify
=	TokenNameEQUAL	
nameOfIDAttrOfElemToModify	TokenNameIdentifier	 name Of ID Attr Of Elem To Modify
;	TokenNameSEMICOLON	
m_elemIdToModify	TokenNameIdentifier	 m elem Id To Modify
=	TokenNameEQUAL	
elemId	TokenNameIdentifier	 elem Id
;	TokenNameSEMICOLON	
m_attrNameToSet	TokenNameIdentifier	 m attr Name To Set
=	TokenNameEQUAL	
attrName	TokenNameIdentifier	 attr Name
;	TokenNameSEMICOLON	
m_attrValueToSet	TokenNameIdentifier	 m attr Value To Set
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Stylesheet parameter key/value pair stored in a hashtable */	TokenNameCOMMENT_JAVADOC	 Stylesheet parameter key/value pair stored in a hashtable 
transient	TokenNametransient	
Hashtable	TokenNameIdentifier	 Hashtable
m_parameters	TokenNameIdentifier	 m parameters
;	TokenNameSEMICOLON	
/** * Submit a stylesheet parameter. * * @param key stylesheet parameter key * @param expr the parameter expression to be submitted. * @see javax.xml.transform.Transformer#setParameter(String,Object) */	TokenNameCOMMENT_JAVADOC	 Submit a stylesheet parameter. * @param key stylesheet parameter key @param expr the parameter expression to be submitted. @see javax.xml.transform.Transformer#setParameter(String,Object) 
public	TokenNamepublic	
void	TokenNamevoid	
setStylesheetParam	TokenNameIdentifier	 set Stylesheet Param
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_parameters	TokenNameIdentifier	 m parameters
.	TokenNameDOT	
put	TokenNameIdentifier	 put
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
expr	TokenNameIdentifier	 expr
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Given a String containing markup, escape the markup so it * can be displayed in the browser. * * @param s String to escape * * The escaped string. */	TokenNameCOMMENT_JAVADOC	 Given a String containing markup, escape the markup so it can be displayed in the browser. * @param s String to escape * The escaped string. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
escapeString	TokenNameIdentifier	 escape String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
sb	TokenNameIdentifier	 sb
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&lt;"	TokenNameStringLiteral	&lt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&gt;"	TokenNameStringLiteral	&gt;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
==	TokenNameEQUAL_EQUAL	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&amp;"	TokenNameStringLiteral	&amp;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
0xd800	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
ch	TokenNameIdentifier	 ch
&&	TokenNameAND_AND	
ch	TokenNameIdentifier	 ch
<	TokenNameLESS	
0xdc00	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// UTF-16 surrogate 	TokenNameCOMMENT_LINE	UTF-16 surrogate 
int	TokenNameint	
next	TokenNameIdentifier	 next
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
>=	TokenNameGREATER_EQUAL	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Invalid UTF-16 surrogate detected: " 	TokenNameCOMMENT_LINE	"Invalid UTF-16 surrogate detected: " 
//+Integer.toHexString(ch)+ " ?"); 	TokenNameCOMMENT_LINE	+Integer.toHexString(ch)+ " ?"); 
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
(	TokenNameLPAREN	
0xdc00	TokenNameIntegerLiteral	
<=	TokenNameLESS_EQUAL	
next	TokenNameIdentifier	 next
&&	TokenNameAND_AND	
next	TokenNameIdentifier	 next
<	TokenNameLESS	
0xe000	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
XSLMessages	TokenNameIdentifier	 XSL Messages
.	TokenNameDOT	
createMessage	TokenNameIdentifier	 create Message
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_INVALID_UTF16_SURROGATE	TokenNameIdentifier	 ER  INVALID  UT F16  SURROGATE
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
+	TokenNamePLUS	
" "	TokenNameStringLiteral	 
+	TokenNamePLUS	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
//"Invalid UTF-16 surrogate detected: " 	TokenNameCOMMENT_LINE	"Invalid UTF-16 surrogate detected: " 
//+Integer.toHexString(ch)+" "+Integer.toHexString(next)); 	TokenNameCOMMENT_LINE	+Integer.toHexString(ch)+" "+Integer.toHexString(next)); 
next	TokenNameIdentifier	 next
=	TokenNameEQUAL	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
-	TokenNameMINUS	
0xd800	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
<<	TokenNameLEFT_SHIFT	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
next	TokenNameIdentifier	 next
-	TokenNameMINUS	
0xdc00	TokenNameIntegerLiteral	
+	TokenNamePLUS	
0x00010000	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
"&#x"	TokenNameStringLiteral	&#x
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toHexString	TokenNameIdentifier	 to Hex String
(	TokenNameLPAREN	
next	TokenNameIdentifier	 next
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
";"	TokenNameStringLiteral	;
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
sb	TokenNameIdentifier	 sb
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Assuming the stylesheet URL and the input XML URL have been set, * perform the transformation and return the result as a String. * * @return A string that contains the contents pointed to by the URL. * */	TokenNameCOMMENT_JAVADOC	 Assuming the stylesheet URL and the input XML URL have been set, perform the transformation and return the result as a String. * @return A string that contains the contents pointed to by the URL. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getHtmlText	TokenNameIdentifier	 get Html Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_trustedAgent	TokenNameIdentifier	 m trusted Agent
.	TokenNameDOT	
m_getData	TokenNameIdentifier	 m get Data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_callThread	TokenNameIdentifier	 m call Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_callThread	TokenNameIdentifier	 m call Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_callThread	TokenNameIdentifier	 m call Thread
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_htmlText	TokenNameIdentifier	 m html Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get an XML document (or stylesheet) * * @param treeURL valid URL string for the document. * * @return document * * @throws IOException */	TokenNameCOMMENT_JAVADOC	 Get an XML document (or stylesheet) * @param treeURL valid URL string for the document. * @return document * @throws IOException 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getTreeAsText	TokenNameIdentifier	 get Tree As Text
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
treeURL	TokenNameIdentifier	 tree URL
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
m_treeURL	TokenNameIdentifier	 m tree URL
=	TokenNameEQUAL	
treeURL	TokenNameIdentifier	 tree URL
;	TokenNameSEMICOLON	
m_trustedAgent	TokenNameIdentifier	 m trusted Agent
.	TokenNameDOT	
m_getData	TokenNameIdentifier	 m get Data
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_trustedAgent	TokenNameIdentifier	 m trusted Agent
.	TokenNameDOT	
m_getSource	TokenNameIdentifier	 m get Source
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
m_callThread	TokenNameIdentifier	 m call Thread
=	TokenNameEQUAL	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
currentThread	TokenNameIdentifier	 current Thread
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_callThread	TokenNameIdentifier	 m call Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_callThread	TokenNameIdentifier	 m call Thread
.	TokenNameDOT	
wait	TokenNameIdentifier	 wait
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
ie	TokenNameIdentifier	 ie
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
m_sourceText	TokenNameIdentifier	 m source Text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Use a Transformer to copy the source document * to a StreamResult. * * @return the document as a string */	TokenNameCOMMENT_JAVADOC	 Use a Transformer to copy the source document to a StreamResult. * @return the document as a string 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
StringWriter	TokenNameIdentifier	 String Writer
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
osw	TokenNameIdentifier	 osw
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
docURL	TokenNameIdentifier	 doc URL
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
m_documentBase	TokenNameIdentifier	 m document Base
,	TokenNameCOMMA	
m_treeURL	TokenNameIdentifier	 m tree URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_tfactory	TokenNameIdentifier	 m tfactory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
m_tfactory	TokenNameIdentifier	 m tfactory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamSource	TokenNameIdentifier	 Stream Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
docURL	TokenNameIdentifier	 doc URL
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamResult	TokenNameIdentifier	 Stream Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
text	TokenNameIdentifier	 text
=	TokenNameEQUAL	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
any_error	TokenNameIdentifier	 any error
)	TokenNameRPAREN	
{	TokenNameLBRACE	
any_error	TokenNameIdentifier	 any error
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
text	TokenNameIdentifier	 text
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the XML source Tree as a text string suitable * for display in a browser. Note that this is for display of the * XML itself, not for rendering of HTML by the browser. * * @return XML source document as a string. * @throws Exception thrown if tree can not be converted. */	TokenNameCOMMENT_JAVADOC	 Get the XML source Tree as a text string suitable for display in a browser. Note that this is for display of the XML itself, not for rendering of HTML by the browser. * @return XML source document as a string. @throws Exception thrown if tree can not be converted. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getSourceTreeAsText	TokenNameIdentifier	 get Source Tree As Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getTreeAsText	TokenNameIdentifier	 get Tree As Text
(	TokenNameLPAREN	
m_documentURL	TokenNameIdentifier	 m document URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the XSL style Tree as a text string suitable * for display in a browser. Note that this is for display of the * XML itself, not for rendering of HTML by the browser. * * @return The XSL stylesheet as a string. * @throws Exception thrown if tree can not be converted. */	TokenNameCOMMENT_JAVADOC	 Get the XSL style Tree as a text string suitable for display in a browser. Note that this is for display of the XML itself, not for rendering of HTML by the browser. * @return The XSL stylesheet as a string. @throws Exception thrown if tree can not be converted. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getStyleTreeAsText	TokenNameIdentifier	 get Style Tree As Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
getTreeAsText	TokenNameIdentifier	 get Tree As Text
(	TokenNameLPAREN	
m_styleURL	TokenNameIdentifier	 m style URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Get the HTML result Tree as a text string suitable * for display in a browser. Note that this is for display of the * XML itself, not for rendering of HTML by the browser. * * @return Transformation result as unmarked text. * @throws Exception thrown if tree can not be converted. */	TokenNameCOMMENT_JAVADOC	 Get the HTML result Tree as a text string suitable for display in a browser. Note that this is for display of the XML itself, not for rendering of HTML by the browser. * @return Transformation result as unmarked text. @throws Exception thrown if tree can not be converted. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
getResultTreeAsText	TokenNameIdentifier	 get Result Tree As Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
Exception	TokenNameIdentifier	 Exception
{	TokenNameLBRACE	
return	TokenNamereturn	
escapeString	TokenNameIdentifier	 escape String
(	TokenNameLPAREN	
getHtmlText	TokenNameIdentifier	 get Html Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a document and a stylesheet and return * the transformation result. If one of these is null, the * existing value (of a previous transformation) is not affected. * * @param doc URL string to XML document * @param style URL string to XSL stylesheet * * @return HTML transformation result */	TokenNameCOMMENT_JAVADOC	 Process a document and a stylesheet and return the transformation result. If one of these is null, the existing value (of a previous transformation) is not affected. * @param doc URL string to XML document @param style URL string to XSL stylesheet * @return HTML transformation result 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
transformToHtml	TokenNameIdentifier	 transform To Html
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doc	TokenNameIdentifier	 doc
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_documentURL	TokenNameIdentifier	 m document URL
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
style	TokenNameIdentifier	 style
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_styleURL	TokenNameIdentifier	 m style URL
=	TokenNameEQUAL	
style	TokenNameIdentifier	 style
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
getHtmlText	TokenNameIdentifier	 get Html Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process a document and a stylesheet and return * the transformation result. Use the xsl:stylesheet PI to find the * document, if one exists. * * @param doc URL string to XML document containing an xsl:stylesheet PI. * * @return HTML transformation result */	TokenNameCOMMENT_JAVADOC	 Process a document and a stylesheet and return the transformation result. Use the xsl:stylesheet PI to find the document, if one exists. * @param doc URL string to XML document containing an xsl:stylesheet PI. * @return HTML transformation result 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
transformToHtml	TokenNameIdentifier	 transform To Html
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
!=	TokenNameNOT_EQUAL	
doc	TokenNameIdentifier	 doc
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_documentURL	TokenNameIdentifier	 m document URL
=	TokenNameEQUAL	
doc	TokenNameIdentifier	 doc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
m_styleURL	TokenNameIdentifier	 m style URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
getHtmlText	TokenNameIdentifier	 get Html Text
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Process the transformation. * * @return The transformation result as a string. * * @throws TransformerException */	TokenNameCOMMENT_JAVADOC	 Process the transformation. * @return The transformation result as a string. * @throws TransformerException 
private	TokenNameprivate	
String	TokenNameIdentifier	 String
processTransformation	TokenNameIdentifier	 process Transformation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
htmlData	TokenNameIdentifier	 html Data
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
showStatus	TokenNameIdentifier	 show Status
(	TokenNameLPAREN	
"Waiting for Transformer and Parser to finish loading and JITing..."	TokenNameStringLiteral	Waiting for Transformer and Parser to finish loading and JITing...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_tfactory	TokenNameIdentifier	 m tfactory
)	TokenNameRPAREN	
{	TokenNameLBRACE	
URL	TokenNameIdentifier	 URL
documentURL	TokenNameIdentifier	 document URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
URL	TokenNameIdentifier	 URL
styleURL	TokenNameIdentifier	 style URL
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
StringWriter	TokenNameIdentifier	 String Writer
osw	TokenNameIdentifier	 osw
=	TokenNameEQUAL	
new	TokenNamenew	
StringWriter	TokenNameIdentifier	 String Writer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
PrintWriter	TokenNameIdentifier	 Print Writer
pw	TokenNameIdentifier	 pw
=	TokenNameEQUAL	
new	TokenNamenew	
PrintWriter	TokenNameIdentifier	 Print Writer
(	TokenNameLPAREN	
osw	TokenNameIdentifier	 osw
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamResult	TokenNameIdentifier	 Stream Result
result	TokenNameIdentifier	 result
=	TokenNameEQUAL	
new	TokenNamenew	
StreamResult	TokenNameIdentifier	 Stream Result
(	TokenNameLPAREN	
pw	TokenNameIdentifier	 pw
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
this	TokenNamethis	
.	TokenNameDOT	
showStatus	TokenNameIdentifier	 show Status
(	TokenNameLPAREN	
"Begin Transformation..."	TokenNameStringLiteral	Begin Transformation...
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
documentURL	TokenNameIdentifier	 document URL
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
m_codeBase	TokenNameIdentifier	 m code Base
,	TokenNameCOMMA	
m_documentURL	TokenNameIdentifier	 m document URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamSource	TokenNameIdentifier	 Stream Source
xmlSource	TokenNameIdentifier	 xml Source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
documentURL	TokenNameIdentifier	 document URL
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
styleURL	TokenNameIdentifier	 style URL
=	TokenNameEQUAL	
new	TokenNamenew	
URL	TokenNameIdentifier	 URL
(	TokenNameLPAREN	
m_codeBase	TokenNameIdentifier	 m code Base
,	TokenNameCOMMA	
m_styleURL	TokenNameIdentifier	 m style URL
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
StreamSource	TokenNameIdentifier	 Stream Source
xslSource	TokenNameIdentifier	 xsl Source
=	TokenNameEQUAL	
new	TokenNamenew	
StreamSource	TokenNameIdentifier	 Stream Source
(	TokenNameLPAREN	
styleURL	TokenNameIdentifier	 style URL
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Transformer	TokenNameIdentifier	 Transformer
transformer	TokenNameIdentifier	 transformer
=	TokenNameEQUAL	
m_tfactory	TokenNameIdentifier	 m tfactory
.	TokenNameDOT	
newTransformer	TokenNameIdentifier	 new Transformer
(	TokenNameLPAREN	
xslSource	TokenNameIdentifier	 xsl Source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Enumeration	TokenNameIdentifier	 Enumeration
m_keys	TokenNameIdentifier	 m keys
=	TokenNameEQUAL	
m_parameters	TokenNameIdentifier	 m parameters
.	TokenNameDOT	
keys	TokenNameIdentifier	 keys
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
hasMoreElements	TokenNameIdentifier	 has More Elements
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Object	TokenNameIdentifier	 Object
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
m_keys	TokenNameIdentifier	 m keys
.	TokenNameDOT	
nextElement	TokenNameIdentifier	 next Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Object	TokenNameIdentifier	 Object
expression	TokenNameIdentifier	 expression
=	TokenNameEQUAL	
m_parameters	TokenNameIdentifier	 m parameters
.	TokenNameDOT	
get	TokenNameIdentifier	 get
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
setParameter	TokenNameIdentifier	 set Parameter
(	TokenNameLPAREN	
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
)	TokenNameRPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
expression	TokenNameIdentifier	 expression
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
transformer	TokenNameIdentifier	 transformer
.	TokenNameDOT	
transform	TokenNameIdentifier	 transform
(	TokenNameLPAREN	
xmlSource	TokenNameIdentifier	 xml Source
,	TokenNameCOMMA	
result	TokenNameIdentifier	 result
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
tfe	TokenNameIdentifier	 tfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
tfe	TokenNameIdentifier	 tfe
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
tfe	TokenNameIdentifier	 tfe
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedURLException	TokenNameIdentifier	 Malformed URL Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
throw	TokenNamethrow	
new	TokenNamenew	
RuntimeException	TokenNameIdentifier	 Runtime Exception
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getMessage	TokenNameIdentifier	 get Message
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
this	TokenNamethis	
.	TokenNameDOT	
showStatus	TokenNameIdentifier	 show Status
(	TokenNameLPAREN	
"Transformation Done!"	TokenNameStringLiteral	Transformation Done!
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
htmlData	TokenNameIdentifier	 html Data
=	TokenNameEQUAL	
osw	TokenNameIdentifier	 osw
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
htmlData	TokenNameIdentifier	 html Data
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This class maintains a worker thread that that is * trusted and can do things like access data. You need * this because the thread that is called by the browser * is not trusted and can't access data from the URLs. */	TokenNameCOMMENT_JAVADOC	 This class maintains a worker thread that that is trusted and can do things like access data. You need this because the thread that is called by the browser is not trusted and can't access data from the URLs. 
class	TokenNameclass	
TrustedAgent	TokenNameIdentifier	 Trusted Agent
implements	TokenNameimplements	
Runnable	TokenNameIdentifier	 Runnable
{	TokenNameLBRACE	
/** * Specifies whether the worker thread should perform a transformation. */	TokenNameCOMMENT_JAVADOC	 Specifies whether the worker thread should perform a transformation. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_getData	TokenNameIdentifier	 m get Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * Specifies whether the worker thread should get an XML document or XSL stylesheet. */	TokenNameCOMMENT_JAVADOC	 Specifies whether the worker thread should get an XML document or XSL stylesheet. 
public	TokenNamepublic	
boolean	TokenNameboolean	
m_getSource	TokenNameIdentifier	 m get Source
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * The real work is done from here. * */	TokenNameCOMMENT_JAVADOC	 The real work is done from here. 
public	TokenNamepublic	
void	TokenNamevoid	
run	TokenNameIdentifier	 run
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
yield	TokenNameIdentifier	 yield
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_getData	TokenNameIdentifier	 m get Data
)	TokenNameRPAREN	
// Perform a transformation or get a document. 	TokenNameCOMMENT_LINE	Perform a transformation or get a document. 
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
m_getData	TokenNameIdentifier	 m get Data
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_htmlText	TokenNameIdentifier	 m html Text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
m_sourceText	TokenNameIdentifier	 m source Text
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
m_getSource	TokenNameIdentifier	 m get Source
)	TokenNameRPAREN	
// Get a document. 	TokenNameCOMMENT_LINE	Get a document. 
{	TokenNameLBRACE	
m_getSource	TokenNameIdentifier	 m get Source
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
m_sourceText	TokenNameIdentifier	 m source Text
=	TokenNameEQUAL	
getSource	TokenNameIdentifier	 get Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
// Perform a transformation. 	TokenNameCOMMENT_LINE	Perform a transformation. 
m_htmlText	TokenNameIdentifier	 m html Text
=	TokenNameEQUAL	
processTransformation	TokenNameIdentifier	 process Transformation
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
Exception	TokenNameIdentifier	 Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
finally	TokenNamefinally	
{	TokenNameLBRACE	
synchronized	TokenNamesynchronized	
(	TokenNameLPAREN	
m_callThread	TokenNameIdentifier	 m call Thread
)	TokenNameRPAREN	
{	TokenNameLBRACE	
m_callThread	TokenNameIdentifier	 m call Thread
.	TokenNameDOT	
notify	TokenNameIdentifier	 notify
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
Thread	TokenNameIdentifier	 Thread
.	TokenNameDOT	
sleep	TokenNameIdentifier	 sleep
(	TokenNameLPAREN	
50	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
InterruptedException	TokenNameIdentifier	 Interrupted Exception
ie	TokenNameIdentifier	 ie
)	TokenNameRPAREN	
{	TokenNameLBRACE	
ie	TokenNameIdentifier	 ie
.	TokenNameDOT	
printStackTrace	TokenNameIdentifier	 print Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// For compatiblity with old serialized objects 	TokenNameCOMMENT_LINE	For compatiblity with old serialized objects 
// We will change non-serialized fields and change methods 	TokenNameCOMMENT_LINE	We will change non-serialized fields and change methods 
// and not have this break us. 	TokenNameCOMMENT_LINE	and not have this break us. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
4618876841979251422L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
// For compatibility when de-serializing old objects 	TokenNameCOMMENT_LINE	For compatibility when de-serializing old objects 
private	TokenNameprivate	
void	TokenNamevoid	
readObject	TokenNameIdentifier	 read Object
(	TokenNameLPAREN	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
ObjectInputStream	TokenNameIdentifier	 Object Input Stream
inStream	TokenNameIdentifier	 in Stream
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
ClassNotFoundException	TokenNameIdentifier	 Class Not Found Exception
{	TokenNameLBRACE	
inStream	TokenNameIdentifier	 in Stream
.	TokenNameDOT	
defaultReadObject	TokenNameIdentifier	 default Read Object
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Needed assignment of non-serialized fields 	TokenNameCOMMENT_LINE	Needed assignment of non-serialized fields 
// A TransformerFactory is not guaranteed to be serializable, 	TokenNameCOMMENT_LINE	A TransformerFactory is not guaranteed to be serializable, 
// so we create one here 	TokenNameCOMMENT_LINE	so we create one here 
m_tfactory	TokenNameIdentifier	 m tfactory
=	TokenNameEQUAL	
TransformerFactory	TokenNameIdentifier	 Transformer Factory
.	TokenNameDOT	
newInstance	TokenNameIdentifier	 new Instance
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
