/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorDecimalFormat.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorDecimalFormat.java 468640 2006-10-28 06:53:53Z minchau $ 
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
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
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
/** * Process xsl:decimal-format by creating a DecimalFormatProperties * object and passing it to the stylesheet. * * @see org.apache.xalan.templates.Stylesheet#setDecimalFormat * @see org.apache.xalan.templates.DecimalFormatProperties * @see <a href="http://www.w3.org/TR/xslt#format-number">format-number in XSLT Specification</a> * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 Process xsl:decimal-format by creating a DecimalFormatProperties object and passing it to the stylesheet. * @see org.apache.xalan.templates.Stylesheet#setDecimalFormat @see org.apache.xalan.templates.DecimalFormatProperties @see <a href="http://www.w3.org/TR/xslt#format-number">format-number in XSLT Specification</a> @xsl.usage internal 
class	TokenNameclass	
ProcessorDecimalFormat	TokenNameIdentifier	 Processor Decimal Format
extends	TokenNameextends	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
5052904382662921627L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Receive notification of the start of an element. * * @param handler The calling StylesheetHandler/TemplatesBuilder. * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param rawName The raw XML 1.0 name (with prefix), or the * empty string if raw names are not available. * @param attributes The attributes attached to the element. If * there are no attributes, it shall be an empty * Attributes object. * @see org.apache.xalan.processor.StylesheetHandler#startElement * @see org.apache.xalan.processor.StylesheetHandler#endElement * @see org.xml.sax.ContentHandler#startElement * @see org.xml.sax.ContentHandler#endElement * @see org.xml.sax.Attributes */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of an element. * @param handler The calling StylesheetHandler/TemplatesBuilder. @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param rawName The raw XML 1.0 name (with prefix), or the empty string if raw names are not available. @param attributes The attributes attached to the element. If there are no attributes, it shall be an empty Attributes object. @see org.apache.xalan.processor.StylesheetHandler#startElement @see org.apache.xalan.processor.StylesheetHandler#endElement @see org.xml.sax.ContentHandler#startElement @see org.xml.sax.ContentHandler#endElement @see org.xml.sax.Attributes 
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
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
dfp	TokenNameIdentifier	 dfp
=	TokenNameEQUAL	
new	TokenNamenew	
DecimalFormatProperties	TokenNameIdentifier	 Decimal Format Properties
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
nextUid	TokenNameIdentifier	 next Uid
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
dfp	TokenNameIdentifier	 dfp
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
dfp	TokenNameIdentifier	 dfp
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
setPropertiesFromAttributes	TokenNameIdentifier	 set Properties From Attributes
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
,	TokenNameCOMMA	
rawName	TokenNameIdentifier	 raw Name
,	TokenNameCOMMA	
attributes	TokenNameIdentifier	 attributes
,	TokenNameCOMMA	
dfp	TokenNameIdentifier	 dfp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setDecimalFormat	TokenNameIdentifier	 set Decimal Format
(	TokenNameLPAREN	
dfp	TokenNameIdentifier	 dfp
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
dfp	TokenNameIdentifier	 dfp
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
