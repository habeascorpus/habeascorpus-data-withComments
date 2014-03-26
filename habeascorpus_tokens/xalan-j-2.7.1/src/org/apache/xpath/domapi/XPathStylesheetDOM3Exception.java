/* * Copyright (c) 2002 World Wide Web Consortium, * (Massachusetts Institute of Technology, Institut National de * Recherche en Informatique et en Automatique, Keio University). All * Rights Reserved. This program is distributed under the W3C's Software * Intellectual Property License. This program is distributed in the * hope that it will be useful, but WITHOUT ANY WARRANTY; without even * the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR * PURPOSE. * See W3C License http://www.w3.org/Consortium/Legal/ for more details. */	TokenNameCOMMENT_BLOCK	 Copyright (c) 2002 World Wide Web Consortium, (Massachusetts Institute of Technology, Institut National de Recherche en Informatique et en Automatique, Keio University). All Rights Reserved. This program is distributed under the W3C's Software Intellectual Property License. This program is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See W3C License http://www.w3.org/Consortium/Legal/ for more details. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xpath	TokenNameIdentifier	 xpath
.	TokenNameDOT	
domapi	TokenNameIdentifier	 domapi
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
/** * * A new exception to add support for DOM Level 3 XPath API. * This class is needed to throw a org.w3c.dom.DOMException with proper error code in * createExpression method of XPathEvaluatorImpl (a DOM Level 3 class). * * This class extends TransformerException because the error message includes information * about where the XPath problem is in the stylesheet as well as the XPath expression itself. * * @xsl.usage internal */	TokenNameCOMMENT_JAVADOC	 * A new exception to add support for DOM Level 3 XPath API. This class is needed to throw a org.w3c.dom.DOMException with proper error code in createExpression method of XPathEvaluatorImpl (a DOM Level 3 class). * This class extends TransformerException because the error message includes information about where the XPath problem is in the stylesheet as well as the XPath expression itself. * @xsl.usage internal 
final	TokenNamefinal	
public	TokenNamepublic	
class	TokenNameclass	
XPathStylesheetDOM3Exception	TokenNameIdentifier	 X Path Stylesheet DO M3 Exception
extends	TokenNameextends	
TransformerException	TokenNameIdentifier	 Transformer Exception
{	TokenNameLBRACE	
public	TokenNamepublic	
XPathStylesheetDOM3Exception	TokenNameIdentifier	 X Path Stylesheet DO M3 Exception
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
SourceLocator	TokenNameIdentifier	 Source Locator
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
msg	TokenNameIdentifier	 msg
,	TokenNameCOMMA	
arg1	TokenNameIdentifier	 arg1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
