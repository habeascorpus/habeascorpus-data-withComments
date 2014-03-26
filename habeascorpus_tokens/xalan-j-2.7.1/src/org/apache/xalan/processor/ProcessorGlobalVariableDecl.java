/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorGlobalVariableDecl.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorGlobalVariableDecl.java 468640 2006-10-28 06:53:53Z minchau $ 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
processor	TokenNameIdentifier	 processor
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
ElemVariable	TokenNameIdentifier	 Elem Variable
;	TokenNameSEMICOLON	
/** * This class processes parse events for an xsl:variable element. * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> * @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 This class processes parse events for an xsl:variable element. @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> @see <a href="http://www.w3.org/TR/xslt#top-level-variables">top-level-variables in XSLT Specification</a> 
class	TokenNameclass	
ProcessorGlobalVariableDecl	TokenNameIdentifier	 Processor Global Variable Decl
extends	TokenNameextends	
ProcessorTemplateElem	TokenNameIdentifier	 Processor Template Elem
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5954332402269819582L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Append the current template element to the current * template element, and then push it onto the current template * element stack. * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param elem The non-null reference to the ElemVariable element. * * @throws org.xml.sax.SAXException Any SAX exception, possibly * wrapping another exception. */	TokenNameCOMMENT_JAVADOC	 Append the current template element to the current template element, and then push it onto the current template element stack. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param elem The non-null reference to the ElemVariable element. * @throws org.xml.sax.SAXException Any SAX exception, possibly wrapping another exception. 
protected	TokenNameprotected	
void	TokenNamevoid	
appendAndPush	TokenNameIdentifier	 append And Push
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
ElemTemplateElement	TokenNameIdentifier	 Elem Template Element
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
// Just push, but don't append. 	TokenNameCOMMENT_LINE	Just push, but don't append. 
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
elem	TokenNameIdentifier	 elem
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * @param name The element type name. * @param attributes The specified or defaulted attributes. * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * @param rawName The qualified name (with prefix). */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * @param name The element type name. @param attributes The specified or defaulted attributes. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. @param rawName The qualified name (with prefix). 
public	TokenNamepublic	
void	TokenNamevoid	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
{	TokenNameLBRACE	
ElemVariable	TokenNameIdentifier	 Elem Variable
v	TokenNameIdentifier	 v
=	TokenNameEQUAL	
(	TokenNameLPAREN	
ElemVariable	TokenNameIdentifier	 Elem Variable
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getElemTemplateElement	TokenNameIdentifier	 get Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
appendChild	TokenNameIdentifier	 append Child
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setVariable	TokenNameIdentifier	 set Variable
(	TokenNameLPAREN	
v	TokenNameIdentifier	 v
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
super	TokenNamesuper	
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
