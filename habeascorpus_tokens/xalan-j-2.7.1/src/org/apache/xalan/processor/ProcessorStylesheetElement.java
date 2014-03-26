/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorStylesheetElement.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorStylesheetElement.java 468640 2006-10-28 06:53:53Z minchau $ 
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
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xalan	TokenNameIdentifier	 xalan
.	TokenNameDOT	
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
Stylesheet	TokenNameIdentifier	 Stylesheet
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
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
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
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
Attributes	TokenNameIdentifier	 Attributes
;	TokenNameSEMICOLON	
/** * TransformerFactory for xsl:stylesheet or xsl:transform markup. * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> * @see <a href="http://www.w3.org/TR/xslt#stylesheet-element">stylesheet-element in XSLT Specification</a> * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 TransformerFactory for xsl:stylesheet or xsl:transform markup. @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> @see <a href="http://www.w3.org/TR/xslt#stylesheet-element">stylesheet-element in XSLT Specification</a> * @xsl.usage internal 
public	TokenNamepublic	
class	TokenNameclass	
ProcessorStylesheetElement	TokenNameIdentifier	 Processor Stylesheet Element
extends	TokenNameextends	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
877798927447840792L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Receive notification of the start of an strip-space element. * * @param handler The calling StylesheetHandler/TemplatesBuilder. * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param rawName The raw XML 1.0 name (with prefix), or the * empty string if raw names are not available. * @param attributes The attributes attached to the element. If * there are no attributes, it shall be an empty * Attributes object. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of an strip-space element. * @param handler The calling StylesheetHandler/TemplatesBuilder. @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param rawName The raw XML 1.0 name (with prefix), or the empty string if raw names are not available. @param attributes The attributes attached to the element. If there are no attributes, it shall be an empty Attributes object. 
public	TokenNamepublic	
void	TokenNamevoid	
startElement	TokenNameIdentifier	 start Element
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
,	TokenNameCOMMA	
Attributes	TokenNameIdentifier	 Attributes
attributes	TokenNameIdentifier	 attributes
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
super	TokenNamesuper	
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
,	TokenNameCOMMA	
localName	TokenNameIdentifier	 local Name
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
int	TokenNameint	
stylesheetType	TokenNameIdentifier	 stylesheet Type
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheetType	TokenNameIdentifier	 get Stylesheet Type
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
Stylesheet	TokenNameIdentifier	 Stylesheet
stylesheet	TokenNameIdentifier	 stylesheet
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stylesheetType	TokenNameIdentifier	 stylesheet Type
==	TokenNameEQUAL_EQUAL	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
.	TokenNameDOT	
STYPE_ROOT	TokenNameIdentifier	 STYPE  ROOT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
tfe	TokenNameIdentifier	 tfe
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
TransformerException	TokenNameIdentifier	 Transformer Exception
(	TokenNameLPAREN	
tfe	TokenNameIdentifier	 tfe
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
Stylesheet	TokenNameIdentifier	 Stylesheet
parent	TokenNameIdentifier	 parent
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
stylesheetType	TokenNameIdentifier	 stylesheet Type
==	TokenNameEQUAL_EQUAL	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
.	TokenNameDOT	
STYPE_IMPORT	TokenNameIdentifier	 STYPE  IMPORT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
sc	TokenNameIdentifier	 sc
=	TokenNameEQUAL	
new	TokenNamenew	
StylesheetComposed	TokenNameIdentifier	 Stylesheet Composed
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setImport	TokenNameIdentifier	 set Import
(	TokenNameLPAREN	
sc	TokenNameIdentifier	 sc
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
sc	TokenNameIdentifier	 sc
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
new	TokenNamenew	
Stylesheet	TokenNameIdentifier	 Stylesheet
(	TokenNameLPAREN	
parent	TokenNameIdentifier	 parent
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
parent	TokenNameIdentifier	 parent
.	TokenNameDOT	
setInclude	TokenNameIdentifier	 set Include
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setDOMBackPointer	TokenNameIdentifier	 set DOM Back Pointer
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getOriginatingNode	TokenNameIdentifier	 get Originating Node
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setLocaterInfo	TokenNameIdentifier	 set Locater Info
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getLocator	TokenNameIdentifier	 get Locator
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setPrefixes	TokenNameIdentifier	 set Prefixes
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getNamespaceSupport	TokenNameIdentifier	 get Namespace Support
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
pushStylesheet	TokenNameIdentifier	 push Stylesheet
(	TokenNameLPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setPropertiesFromAttributes	TokenNameIdentifier	 set Properties From Attributes
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
pushElemTemplateElement	TokenNameIdentifier	 push Elem Template Element
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
TransformerException	TokenNameIdentifier	 Transformer Exception
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
xml	TokenNameIdentifier	 xml
.	TokenNameDOT	
sax	TokenNameIdentifier	 sax
.	TokenNameDOT	
SAXException	TokenNameIdentifier	 SAX Exception
(	TokenNameLPAREN	
te	TokenNameIdentifier	 te
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * This method can be over-ridden by a class that extends this one. * @param handler The calling StylesheetHandler/TemplatesBuilder. */	TokenNameCOMMENT_JAVADOC	 This method can be over-ridden by a class that extends this one. @param handler The calling StylesheetHandler/TemplatesBuilder. 
protected	TokenNameprotected	
Stylesheet	TokenNameIdentifier	 Stylesheet
getStylesheetRoot	TokenNameIdentifier	 get Stylesheet Root
(	TokenNameLPAREN	
StylesheetHandler	TokenNameIdentifier	 Stylesheet Handler
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
throws	TokenNamethrows	
TransformerConfigurationException	TokenNameIdentifier	 Transformer Configuration Exception
{	TokenNameLBRACE	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
stylesheet	TokenNameIdentifier	 stylesheet
;	TokenNameSEMICOLON	
stylesheet	TokenNameIdentifier	 stylesheet
=	TokenNameEQUAL	
new	TokenNamenew	
StylesheetRoot	TokenNameIdentifier	 Stylesheet Root
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getSchema	TokenNameIdentifier	 get Schema
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheetProcessor	TokenNameIdentifier	 get Stylesheet Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
getErrorListener	TokenNameIdentifier	 get Error Listener
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheetProcessor	TokenNameIdentifier	 get Stylesheet Processor
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
isSecureProcessing	TokenNameIdentifier	 is Secure Processing
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
stylesheet	TokenNameIdentifier	 stylesheet
.	TokenNameDOT	
setSecureProcessing	TokenNameIdentifier	 set Secure Processing
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
stylesheet	TokenNameIdentifier	 stylesheet
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Receive notification of the end of an element. * * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. * @param uri The Namespace URI, or an empty string. * @param localName The local name (without prefix), or empty string if not namespace processing. * @param rawName The qualified name (with prefix). */	TokenNameCOMMENT_JAVADOC	 Receive notification of the end of an element. * @param handler non-null reference to current StylesheetHandler that is constructing the Templates. @param uri The Namespace URI, or an empty string. @param localName The local name (without prefix), or empty string if not namespace processing. @param rawName The qualified name (with prefix). 
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
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
popElemTemplateElement	TokenNameIdentifier	 pop Elem Template Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
popStylesheet	TokenNameIdentifier	 pop Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
