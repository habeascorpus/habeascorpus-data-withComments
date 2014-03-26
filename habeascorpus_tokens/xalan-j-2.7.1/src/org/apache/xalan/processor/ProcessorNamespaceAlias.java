/* * Licensed to the Apache Software Foundation (ASF) under one * or more contributor license agreements. See the NOTICE file * distributed with this work for additional information * regarding copyright ownership. The ASF licenses this file * to you under the Apache License, Version 2.0 (the "License"); * you may not use this file except in compliance with the License. * You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to you under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
/* * $Id: ProcessorNamespaceAlias.java 468640 2006-10-28 06:53:53Z minchau $ */	TokenNameCOMMENT_BLOCK	 $Id: ProcessorNamespaceAlias.java 468640 2006-10-28 06:53:53Z minchau $ 
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
templates	TokenNameIdentifier	 templates
.	TokenNameDOT	
NamespaceAlias	TokenNameIdentifier	 Namespace Alias
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
/** * TransformerFactory for xsl:namespace-alias markup. * A stylesheet can use the xsl:namespace-alias element to * declare that one namespace URI is an alias for another namespace URI. * <pre> * <!ELEMENT xsl:namespace-alias EMPTY> * <!ATTLIST xsl:namespace-alias * stylesheet-prefix CDATA #REQUIRED * result-prefix CDATA #REQUIRED * > * </pre> * @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> * @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> */	TokenNameCOMMENT_JAVADOC	 TransformerFactory for xsl:namespace-alias markup. A stylesheet can use the xsl:namespace-alias element to declare that one namespace URI is an alias for another namespace URI. <pre> <!ELEMENT xsl:namespace-alias EMPTY> <!ATTLIST xsl:namespace-alias stylesheet-prefix CDATA #REQUIRED result-prefix CDATA #REQUIRED > </pre> @see <a href="http://www.w3.org/TR/xslt#dtd">XSLT DTD</a> @see <a href="http://www.w3.org/TR/xslt#literal-result-element">literal-result-element in XSLT Specification</a> 
class	TokenNameclass	
ProcessorNamespaceAlias	TokenNameIdentifier	 Processor Namespace Alias
extends	TokenNameextends	
XSLTElementProcessor	TokenNameIdentifier	 XSLT Element Processor
{	TokenNameLBRACE	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
-	TokenNameMINUS	
6309867839007018964L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
/** * Receive notification of the start of an xsl:namespace-alias element. * * @param handler The calling StylesheetHandler/TemplatesBuilder. * @param uri The Namespace URI, or the empty string if the * element has no Namespace URI or if Namespace * processing is not being performed. * @param localName The local name (without prefix), or the * empty string if Namespace processing is not being * performed. * @param rawName The raw XML 1.0 name (with prefix), or the * empty string if raw names are not available. * @param attributes The attributes attached to the element. If * there are no attributes, it shall be an empty * Attributes object. */	TokenNameCOMMENT_JAVADOC	 Receive notification of the start of an xsl:namespace-alias element. * @param handler The calling StylesheetHandler/TemplatesBuilder. @param uri The Namespace URI, or the empty string if the element has no Namespace URI or if Namespace processing is not being performed. @param localName The local name (without prefix), or the empty string if Namespace processing is not being performed. @param rawName The raw XML 1.0 name (with prefix), or the empty string if raw names are not available. @param attributes The attributes attached to the element. If there are no attributes, it shall be an empty Attributes object. 
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
final	TokenNamefinal	
String	TokenNameIdentifier	 String
resultNS	TokenNameIdentifier	 result NS
;	TokenNameSEMICOLON	
NamespaceAlias	TokenNameIdentifier	 Namespace Alias
na	TokenNameIdentifier	 na
=	TokenNameEQUAL	
new	TokenNamenew	
NamespaceAlias	TokenNameIdentifier	 Namespace Alias
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
nextUid	TokenNameIdentifier	 next Uid
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
na	TokenNameIdentifier	 na
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
na	TokenNameIdentifier	 na
.	TokenNameDOT	
getStylesheetPrefix	TokenNameIdentifier	 get Stylesheet Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"#default"	TokenNameStringLiteral	#default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
na	TokenNameIdentifier	 na
.	TokenNameDOT	
setStylesheetPrefix	TokenNameIdentifier	 set Stylesheet Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
String	TokenNameIdentifier	 String
stylesheetNS	TokenNameIdentifier	 stylesheet NS
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
na	TokenNameIdentifier	 na
.	TokenNameDOT	
setStylesheetNamespace	TokenNameIdentifier	 set Stylesheet Namespace
(	TokenNameLPAREN	
stylesheetNS	TokenNameIdentifier	 stylesheet NS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
na	TokenNameIdentifier	 na
.	TokenNameDOT	
getResultPrefix	TokenNameIdentifier	 get Result Prefix
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"#default"	TokenNameStringLiteral	#default
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
""	TokenNameStringLiteral	 
;	TokenNameSEMICOLON	
na	TokenNameIdentifier	 na
.	TokenNameDOT	
setResultPrefix	TokenNameIdentifier	 set Result Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resultNS	TokenNameIdentifier	 result NS
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
resultNS	TokenNameIdentifier	 result NS
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX_FOR_DEFAULT	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX  FOR  DEFAULT
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
resultNS	TokenNameIdentifier	 result NS
=	TokenNameEQUAL	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getNamespaceForPrefix	TokenNameIdentifier	 get Namespace For Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
null	TokenNamenull	
==	TokenNameEQUAL_EQUAL	
resultNS	TokenNameIdentifier	 result NS
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
error	TokenNameIdentifier	 error
(	TokenNameLPAREN	
XSLTErrorResources	TokenNameIdentifier	 XSLT Error Resources
.	TokenNameDOT	
ER_INVALID_NAMESPACE_URI_VALUE_FOR_RESULT_PREFIX	TokenNameIdentifier	 ER  INVALID  NAMESPACE  URI  VALUE  FOR  RESULT  PREFIX
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
prefix	TokenNameIdentifier	 prefix
}	TokenNameRBRACE	
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
na	TokenNameIdentifier	 na
.	TokenNameDOT	
setResultNamespace	TokenNameIdentifier	 set Result Namespace
(	TokenNameLPAREN	
resultNS	TokenNameIdentifier	 result NS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
getStylesheet	TokenNameIdentifier	 get Stylesheet
(	TokenNameLPAREN	
)	TokenNameRPAREN	
.	TokenNameDOT	
setNamespaceAlias	TokenNameIdentifier	 set Namespace Alias
(	TokenNameLPAREN	
na	TokenNameIdentifier	 na
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
na	TokenNameIdentifier	 na
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
