/* * Licensed to the Apache Software Foundation (ASF) under one or more * contributor license agreements. See the NOTICE file distributed with * this work for additional information regarding copyright ownership. * The ASF licenses this file to You under the Apache License, Version 2.0 * (the "License"); you may not use this file except in compliance with * the License. You may obtain a copy of the License at * * http://www.apache.org/licenses/LICENSE-2.0 * * Unless required by applicable law or agreed to in writing, software * distributed under the License is distributed on an "AS IS" BASIS, * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. * See the License for the specific language governing permissions and * limitations under the License. */	TokenNameCOMMENT_BLOCK	 Licensed to the Apache Software Foundation (ASF) under one or more contributor license agreements. See the NOTICE file distributed with this work for additional information regarding copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License. You may obtain a copy of the License at * http://www.apache.org/licenses/LICENSE-2.0 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions and limitations under the License. 
package	TokenNamepackage	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
IOException	TokenNameIdentifier	 IO Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
dtd	TokenNameIdentifier	 dtd
.	TokenNameDOT	
XMLDTDValidatorFilter	TokenNameIdentifier	 XMLDTD Validator Filter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
impl	TokenNameIdentifier	 impl
.	TokenNameDOT	
msg	TokenNameIdentifier	 msg
.	TokenNameDOT	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLAttributesImpl	TokenNameIdentifier	 XML Attributes Impl
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
XMLSymbols	TokenNameIdentifier	 XML Symbols
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
NamespaceContext	TokenNameIdentifier	 Namespace Context
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
QName	TokenNameIdentifier	 Q Name
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
XNIException	TokenNameIdentifier	 XNI Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
org	TokenNameIdentifier	 org
.	TokenNameDOT	
apache	TokenNameIdentifier	 apache
.	TokenNameDOT	
xerces	TokenNameIdentifier	 xerces
.	TokenNameDOT	
xni	TokenNameIdentifier	 xni
.	TokenNameDOT	
parser	TokenNameIdentifier	 parser
.	TokenNameDOT	
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
;	TokenNameSEMICOLON	
/** * The scanner acts as the source for the document * information which is communicated to the document handler. * * This class scans an XML document, checks if document has a DTD, and if * DTD is not found the scanner will remove the DTD Validator from the pipeline and perform * namespace binding. * * Note: This scanner should only be used when the namespace processing is on! * * <p> * This component requires the following features and properties from the * component manager that uses it: * <ul> * <li>http://xml.org/sax/features/namespaces {true} -- if the value of this * feature is set to false this scanner must not be used.</li> * <li>http://xml.org/sax/features/validation</li> * <li>http://apache.org/xml/features/nonvalidating/load-external-dtd</li> * <li>http://apache.org/xml/features/scanner/notify-char-refs</li> * <li>http://apache.org/xml/features/scanner/notify-builtin-refs</li> * <li>http://apache.org/xml/properties/internal/symbol-table</li> * <li>http://apache.org/xml/properties/internal/error-reporter</li> * <li>http://apache.org/xml/properties/internal/entity-manager</li> * <li>http://apache.org/xml/properties/internal/dtd-scanner</li> * </ul> * * @xerces.internal * * @author Elena Litani, IBM * @author Michael Glavassevich, IBM * * @version $Id: XML11NSDocumentScannerImpl.java 495747 2007-01-12 21:48:00Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 The scanner acts as the source for the document information which is communicated to the document handler. * This class scans an XML document, checks if document has a DTD, and if DTD is not found the scanner will remove the DTD Validator from the pipeline and perform namespace binding. * Note: This scanner should only be used when the namespace processing is on! * <p> This component requires the following features and properties from the component manager that uses it: <ul> <li>http://xml.org/sax/features/namespaces {true} -- if the value of this feature is set to false this scanner must not be used.</li> <li>http://xml.org/sax/features/validation</li> <li>http://apache.org/xml/features/nonvalidating/load-external-dtd</li> <li>http://apache.org/xml/features/scanner/notify-char-refs</li> <li>http://apache.org/xml/features/scanner/notify-builtin-refs</li> <li>http://apache.org/xml/properties/internal/symbol-table</li> <li>http://apache.org/xml/properties/internal/error-reporter</li> <li>http://apache.org/xml/properties/internal/entity-manager</li> <li>http://apache.org/xml/properties/internal/dtd-scanner</li> </ul> * @xerces.internal * @author Elena Litani, IBM @author Michael Glavassevich, IBM * @version $Id: XML11NSDocumentScannerImpl.java 495747 2007-01-12 21:48:00Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11NSDocumentScannerImpl	TokenNameIdentifier	 XM L11 NS Document Scanner Impl
extends	TokenNameextends	
XML11DocumentScannerImpl	TokenNameIdentifier	 XM L11 Document Scanner Impl
{	TokenNameLBRACE	
/** * If is true, the dtd validator is no longer in the pipeline * and the scanner should bind namespaces */	TokenNameCOMMENT_JAVADOC	 If is true, the dtd validator is no longer in the pipeline and the scanner should bind namespaces 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
;	TokenNameSEMICOLON	
/** * If validating parser, make sure we report an error in the * scanner if DTD grammar is missing. */	TokenNameCOMMENT_JAVADOC	 If validating parser, make sure we report an error in the scanner if DTD grammar is missing. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fPerformValidation	TokenNameIdentifier	 f Perform Validation
;	TokenNameSEMICOLON	
// private data 	TokenNameCOMMENT_LINE	private data 
// 	TokenNameCOMMENT_LINE	 
/** DTD validator */	TokenNameCOMMENT_JAVADOC	 DTD validator 
private	TokenNameprivate	
XMLDTDValidatorFilter	TokenNameIdentifier	 XMLDTD Validator Filter
fDTDValidator	TokenNameIdentifier	 f DTD Validator
;	TokenNameSEMICOLON	
/** * Saw spaces after element name or between attributes. * * This is reserved for the case where scanning of a start element spans * several methods, as is the case when scanning the start of a root element * where a DTD external subset may be read after scanning the element name. */	TokenNameCOMMENT_JAVADOC	 Saw spaces after element name or between attributes. * This is reserved for the case where scanning of a start element spans several methods, as is the case when scanning the start of a root element where a DTD external subset may be read after scanning the element name. 
private	TokenNameprivate	
boolean	TokenNameboolean	
fSawSpace	TokenNameIdentifier	 f Saw Space
;	TokenNameSEMICOLON	
/** * The scanner is responsible for removing DTD validator * from the pipeline if it is not needed. * * @param validator the DTD validator from the pipeline */	TokenNameCOMMENT_JAVADOC	 The scanner is responsible for removing DTD validator from the pipeline if it is not needed. * @param validator the DTD validator from the pipeline 
public	TokenNamepublic	
void	TokenNamevoid	
setDTDValidator	TokenNameIdentifier	 set DTD Validator
(	TokenNameLPAREN	
XMLDTDValidatorFilter	TokenNameIdentifier	 XMLDTD Validator Filter
validator	TokenNameIdentifier	 validator
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
=	TokenNameEQUAL	
validator	TokenNameIdentifier	 validator
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans a start element. This method will handle the binding of * namespace information and notifying the handler of the start * of the element. * <p> * <pre> * [44] EmptyElemTag ::= '&lt;' Name (S Attribute)* S? '/>' * [40] STag ::= '&lt;' Name (S Attribute)* S? '>' * </pre> * <p> * <strong>Note:</strong> This method assumes that the leading * '&lt;' character has been consumed. * <p> * <strong>Note:</strong> This method uses the fElementQName and * fAttributes variables. The contents of these variables will be * destroyed. The caller should copy important information out of * these variables before calling this method. * * @return True if element is empty. (i.e. It matches * production [44]. */	TokenNameCOMMENT_JAVADOC	 Scans a start element. This method will handle the binding of namespace information and notifying the handler of the start of the element. <p> <pre> [44] EmptyElemTag ::= '&lt;' Name (S Attribute)* S? '/>' [40] STag ::= '&lt;' Name (S Attribute)* S? '>' </pre> <p> <strong>Note:</strong> This method assumes that the leading '&lt;' character has been consumed. <p> <strong>Note:</strong> This method uses the fElementQName and fAttributes variables. The contents of these variables will be destroyed. The caller should copy important information out of these variables before calling this method. * @return True if element is empty. (i.e. It matches production [44]. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
scanStartElement	TokenNameIdentifier	 scan Start Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_CONTENT_SCANNING	TokenNameIdentifier	 DEBUG  CONTENT  SCANNING
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
">>> scanStartElementNS()"	TokenNameStringLiteral	>>> scanStartElementNS()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note: namespace processing is on by default 	TokenNameCOMMENT_LINE	Note: namespace processing is on by default 
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanQName	TokenNameIdentifier	 scan Q Name
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT - [Q] Why do we need this local variable? -- mrglavas 	TokenNameCOMMENT_LINE	REVISIT - [Q] Why do we need this local variable? -- mrglavas 
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fScannerState	TokenNameIdentifier	 f Scanner State
==	TokenNameEQUAL_EQUAL	
SCANNER_STATE_ROOT_ELEMENT	TokenNameIdentifier	 SCANNER  STATE  ROOT  ELEMENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fPerformValidation	TokenNameIdentifier	 f Perform Validation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_GRAMMAR_NOT_FOUND"	TokenNameStringLiteral	MSG_GRAMMAR_NOT_FOUND
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDoctypeName	TokenNameIdentifier	 f Doctype Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
fDoctypeName	TokenNameIdentifier	 f Doctype Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"RootElementTypeMustMatchDoctypedecl"	TokenNameStringLiteral	RootElementTypeMustMatchDoctypedecl
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fDoctypeName	TokenNameIdentifier	 f Doctype Name
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// push element stack 	TokenNameCOMMENT_LINE	push element stack 
fCurrentElement	TokenNameIdentifier	 f Current Element
=	TokenNameEQUAL	
fElementStack	TokenNameIdentifier	 f Element Stack
.	TokenNameDOT	
pushElement	TokenNameIdentifier	 push Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// attributes 	TokenNameCOMMENT_LINE	attributes 
boolean	TokenNameboolean	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
removeAllAttributes	TokenNameIdentifier	 remove All Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
// spaces 	TokenNameCOMMENT_LINE	spaces 
boolean	TokenNameboolean	
sawSpace	TokenNameIdentifier	 saw Space
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// end tag? 	TokenNameCOMMENT_LINE	end tag? 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ElementUnterminated"	TokenNameStringLiteral	ElementUnterminated
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValidNameStartChar	TokenNameIdentifier	 is Valid Name Start Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
sawSpace	TokenNameIdentifier	 saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Second chance. Check if this character is a high 	TokenNameCOMMENT_LINE	Second chance. Check if this character is a high 
// surrogate of a valid name start character. 	TokenNameCOMMENT_LINE	surrogate of a valid name start character. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValidNameStartHighSurrogate	TokenNameIdentifier	 is Valid Name Start High Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
sawSpace	TokenNameIdentifier	 saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ElementUnterminated"	TokenNameStringLiteral	ElementUnterminated
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// attributes 	TokenNameCOMMENT_LINE	attributes 
scanAttribute	TokenNameIdentifier	 scan Attribute
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: is it required? forbit xmlns prefix for element 	TokenNameCOMMENT_LINE	REVISIT: is it required? forbit xmlns prefix for element 
if	TokenNameif	
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"ElementXMLNSPrefix"	TokenNameStringLiteral	ElementXMLNSPrefix
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bind the element 	TokenNameCOMMENT_LINE	bind the element 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
// assign uri to the element 	TokenNameCOMMENT_LINE	assign uri to the element 
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure that object in the element stack is updated as well 	TokenNameCOMMENT_LINE	make sure that object in the element stack is updated as well 
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
// making sure that the object in the element stack is updated too. 	TokenNameCOMMENT_LINE	making sure that the object in the element stack is updated too. 
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"ElementPrefixUnbound"	TokenNameStringLiteral	ElementPrefixUnbound
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bind attributes (xmlns are already bound bellow) 	TokenNameCOMMENT_LINE	bind attributes (xmlns are already bound bellow) 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
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
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
aprefix	TokenNameIdentifier	 aprefix
=	TokenNameEQUAL	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
aprefix	TokenNameIdentifier	 aprefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: try removing the first "if" and see if it is faster. 	TokenNameCOMMENT_LINE	REVISIT: try removing the first "if" and see if it is faster. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aprefix	TokenNameIdentifier	 aprefix
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"AttributePrefixUnbound"	TokenNameStringLiteral	AttributePrefixUnbound
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
aprefix	TokenNameIdentifier	 aprefix
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
checkDuplicatesNS	TokenNameIdentifier	 check Duplicates NS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"AttributeNSNotUnique"	TokenNameStringLiteral	AttributeNSNotUnique
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"AttributeNotUnique"	TokenNameStringLiteral	AttributeNotUnique
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// call handler 	TokenNameCOMMENT_LINE	call handler 
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//decrease the markup depth.. 	TokenNameCOMMENT_LINE	decrease the markup depth.. 
fMarkupDepth	TokenNameIdentifier	 f Markup Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// check that this element was opened in the same entity 	TokenNameCOMMENT_LINE	check that this element was opened in the same entity 
if	TokenNameif	
(	TokenNameLPAREN	
fMarkupDepth	TokenNameIdentifier	 f Markup Depth
<	TokenNameLESS	
fEntityStack	TokenNameIdentifier	 f Entity Stack
[	TokenNameLBRACKET	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ElementEntityMismatch"	TokenNameStringLiteral	ElementEntityMismatch
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//pop the element off the stack.. 	TokenNameCOMMENT_LINE	pop the element off the stack.. 
fElementStack	TokenNameIdentifier	 f Element Stack
.	TokenNameDOT	
popElement	TokenNameIdentifier	 pop Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_CONTENT_SCANNING	TokenNameIdentifier	 DEBUG  CONTENT  SCANNING
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<<< scanStartElement(): "	TokenNameStringLiteral	<<< scanStartElement(): 
+	TokenNamePLUS	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
empty	TokenNameIdentifier	 empty
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanStartElement():boolean 	TokenNameCOMMENT_LINE	scanStartElement():boolean 
/** * Scans the name of an element in a start or empty tag. * * @see #scanStartElement() */	TokenNameCOMMENT_JAVADOC	 Scans the name of an element in a start or empty tag. * @see #scanStartElement() 
protected	TokenNameprotected	
void	TokenNamevoid	
scanStartElementName	TokenNameIdentifier	 scan Start Element Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// Note: namespace processing is on by default 	TokenNameCOMMENT_LINE	Note: namespace processing is on by default 
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanQName	TokenNameIdentifier	 scan Q Name
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must skip spaces here because the DTD scanner 	TokenNameCOMMENT_LINE	Must skip spaces here because the DTD scanner 
// would consume them at the end of the external subset. 	TokenNameCOMMENT_LINE	would consume them at the end of the external subset. 
fSawSpace	TokenNameIdentifier	 f Saw Space
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanStartElementName() 	TokenNameCOMMENT_LINE	scanStartElementName() 
/** * Scans the remainder of a start or empty tag after the element name. * * @see #scanStartElement * @return True if element is empty. */	TokenNameCOMMENT_JAVADOC	 Scans the remainder of a start or empty tag after the element name. * @see #scanStartElement @return True if element is empty. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
scanStartElementAfterName	TokenNameIdentifier	 scan Start Element After Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// REVISIT - [Q] Why do we need this local variable? -- mrglavas 	TokenNameCOMMENT_LINE	REVISIT - [Q] Why do we need this local variable? -- mrglavas 
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
pushContext	TokenNameIdentifier	 push Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fScannerState	TokenNameIdentifier	 f Scanner State
==	TokenNameEQUAL_EQUAL	
SCANNER_STATE_ROOT_ELEMENT	TokenNameIdentifier	 SCANNER  STATE  ROOT  ELEMENT
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fPerformValidation	TokenNameIdentifier	 f Perform Validation
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"MSG_GRAMMAR_NOT_FOUND"	TokenNameStringLiteral	MSG_GRAMMAR_NOT_FOUND
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fDoctypeName	TokenNameIdentifier	 f Doctype Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
fDoctypeName	TokenNameIdentifier	 f Doctype Name
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
"RootElementTypeMustMatchDoctypedecl"	TokenNameStringLiteral	RootElementTypeMustMatchDoctypedecl
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fDoctypeName	TokenNameIdentifier	 f Doctype Name
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// push element stack 	TokenNameCOMMENT_LINE	push element stack 
fCurrentElement	TokenNameIdentifier	 f Current Element
=	TokenNameEQUAL	
fElementStack	TokenNameIdentifier	 f Element Stack
.	TokenNameDOT	
pushElement	TokenNameIdentifier	 push Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// attributes 	TokenNameCOMMENT_LINE	attributes 
boolean	TokenNameboolean	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
removeAllAttributes	TokenNameIdentifier	 remove All Attributes
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
// end tag? 	TokenNameCOMMENT_LINE	end tag? 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'/'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ElementUnterminated"	TokenNameStringLiteral	ElementUnterminated
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
empty	TokenNameIdentifier	 empty
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValidNameStartChar	TokenNameIdentifier	 is Valid Name Start Char
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
fSawSpace	TokenNameIdentifier	 f Saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Second chance. Check if this character is a high 	TokenNameCOMMENT_LINE	Second chance. Check if this character is a high 
// surrogate of a valid name start character. 	TokenNameCOMMENT_LINE	surrogate of a valid name start character. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isValidNameStartHighSurrogate	TokenNameIdentifier	 is Valid Name Start High Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
!	TokenNameNOT	
fSawSpace	TokenNameIdentifier	 f Saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ElementUnterminated"	TokenNameStringLiteral	ElementUnterminated
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// attributes 	TokenNameCOMMENT_LINE	attributes 
scanAttribute	TokenNameIdentifier	 scan Attribute
(	TokenNameLPAREN	
fAttributes	TokenNameIdentifier	 f Attributes
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// spaces 	TokenNameCOMMENT_LINE	spaces 
fSawSpace	TokenNameIdentifier	 f Saw Space
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: is it required? forbit xmlns prefix for element 	TokenNameCOMMENT_LINE	REVISIT: is it required? forbit xmlns prefix for element 
if	TokenNameif	
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"ElementXMLNSPrefix"	TokenNameStringLiteral	ElementXMLNSPrefix
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bind the element 	TokenNameCOMMENT_LINE	bind the element 
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
// assign uri to the element 	TokenNameCOMMENT_LINE	assign uri to the element 
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// make sure that object in the element stack is updated as well 	TokenNameCOMMENT_LINE	make sure that object in the element stack is updated as well 
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
// making sure that the object in the element stack is updated too. 	TokenNameCOMMENT_LINE	making sure that the object in the element stack is updated too. 
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"ElementPrefixUnbound"	TokenNameStringLiteral	ElementPrefixUnbound
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// bind attributes (xmlns are already bound bellow) 	TokenNameCOMMENT_LINE	bind attributes (xmlns are already bound bellow) 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
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
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
getName	TokenNameIdentifier	 get Name
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
aprefix	TokenNameIdentifier	 aprefix
=	TokenNameEQUAL	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
aprefix	TokenNameIdentifier	 aprefix
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: try removing the first "if" and see if it is faster. 	TokenNameCOMMENT_LINE	REVISIT: try removing the first "if" and see if it is faster. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
{	TokenNameLBRACE	
continue	TokenNamecontinue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
aprefix	TokenNameIdentifier	 aprefix
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
uri	TokenNameIdentifier	 uri
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"AttributePrefixUnbound"	TokenNameStringLiteral	AttributePrefixUnbound
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
aprefix	TokenNameIdentifier	 aprefix
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
QName	TokenNameIdentifier	 Q Name
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
fAttributes	TokenNameIdentifier	 f Attributes
.	TokenNameDOT	
checkDuplicatesNS	TokenNameIdentifier	 check Duplicates NS
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"AttributeNSNotUnique"	TokenNameStringLiteral	AttributeNSNotUnique
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
uri	TokenNameIdentifier	 uri
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"AttributeNotUnique"	TokenNameStringLiteral	AttributeNotUnique
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// call handler 	TokenNameCOMMENT_LINE	call handler 
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//decrease the markup depth.. 	TokenNameCOMMENT_LINE	decrease the markup depth.. 
fMarkupDepth	TokenNameIdentifier	 f Markup Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// check that this element was opened in the same entity 	TokenNameCOMMENT_LINE	check that this element was opened in the same entity 
if	TokenNameif	
(	TokenNameLPAREN	
fMarkupDepth	TokenNameIdentifier	 f Markup Depth
<	TokenNameLESS	
fEntityStack	TokenNameIdentifier	 f Entity Stack
[	TokenNameLBRACKET	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ElementEntityMismatch"	TokenNameStringLiteral	ElementEntityMismatch
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
emptyElement	TokenNameIdentifier	 empty Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//pop the element off the stack.. 	TokenNameCOMMENT_LINE	pop the element off the stack.. 
fElementStack	TokenNameIdentifier	 f Element Stack
.	TokenNameDOT	
popElement	TokenNameIdentifier	 pop Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
startElement	TokenNameIdentifier	 start Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
,	TokenNameCOMMA	
fAttributes	TokenNameIdentifier	 f Attributes
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_CONTENT_SCANNING	TokenNameIdentifier	 DEBUG  CONTENT  SCANNING
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<<< scanStartElementAfterName(): "	TokenNameStringLiteral	<<< scanStartElementAfterName(): 
+	TokenNamePLUS	
empty	TokenNameIdentifier	 empty
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
empty	TokenNameIdentifier	 empty
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanStartElementAfterName() 	TokenNameCOMMENT_LINE	scanStartElementAfterName() 
/** * Scans an attribute. * <p> * <pre> * [41] Attribute ::= Name Eq AttValue * </pre> * <p> * <strong>Note:</strong> This method assumes that the next * character on the stream is the first character of the attribute * name. * <p> * <strong>Note:</strong> This method uses the fAttributeQName and * fQName variables. The contents of these variables will be * destroyed. * * @param attributes The attributes list for the scanned attribute. */	TokenNameCOMMENT_JAVADOC	 Scans an attribute. <p> <pre> [41] Attribute ::= Name Eq AttValue </pre> <p> <strong>Note:</strong> This method assumes that the next character on the stream is the first character of the attribute name. <p> <strong>Note:</strong> This method uses the fAttributeQName and fQName variables. The contents of these variables will be destroyed. * @param attributes The attributes list for the scanned attribute. 
protected	TokenNameprotected	
void	TokenNamevoid	
scanAttribute	TokenNameIdentifier	 scan Attribute
(	TokenNameLPAREN	
XMLAttributesImpl	TokenNameIdentifier	 XML Attributes Impl
attributes	TokenNameIdentifier	 attributes
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_CONTENT_SCANNING	TokenNameIdentifier	 DEBUG  CONTENT  SCANNING
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
">>> scanAttribute()"	TokenNameStringLiteral	>>> scanAttribute()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// name 	TokenNameCOMMENT_LINE	name 
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanQName	TokenNameIdentifier	 scan Q Name
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// equals 	TokenNameCOMMENT_LINE	equals 
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"EqRequiredInAttribute"	TokenNameStringLiteral	EqRequiredInAttribute
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// content 	TokenNameCOMMENT_LINE	content 
int	TokenNameint	
attrIndex	TokenNameIdentifier	 attr Index
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attrIndex	TokenNameIdentifier	 attr Index
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
addAttributeNS	TokenNameIdentifier	 add Attribute NS
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
,	TokenNameCOMMA	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
fCDATASymbol	TokenNameIdentifier	 f CDATA Symbol
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
int	TokenNameint	
oldLen	TokenNameIdentifier	 old Len
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attrIndex	TokenNameIdentifier	 attr Index
=	TokenNameEQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
addAttribute	TokenNameIdentifier	 add Attribute
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
,	TokenNameCOMMA	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
fCDATASymbol	TokenNameIdentifier	 f CDATA Symbol
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// WFC: Unique Att Spec 	TokenNameCOMMENT_LINE	WFC: Unique Att Spec 
if	TokenNameif	
(	TokenNameLPAREN	
oldLen	TokenNameIdentifier	 old Len
==	TokenNameEQUAL_EQUAL	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
getLength	TokenNameIdentifier	 get Length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"AttributeNotUnique"	TokenNameStringLiteral	AttributeNotUnique
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// Scan attribute value and return true if the non-normalized and normalized value are the same 	TokenNameCOMMENT_LINE	Scan attribute value and return true if the non-normalized and normalized value are the same 
boolean	TokenNameboolean	
isSameNormalizedAttr	TokenNameIdentifier	 is Same Normalized Attr
=	TokenNameEQUAL	
scanAttributeValue	TokenNameIdentifier	 scan Attribute Value
(	TokenNameLPAREN	
this	TokenNamethis	
.	TokenNameDOT	
fTempString	TokenNameIdentifier	 f Temp String
,	TokenNameCOMMA	
fTempString2	TokenNameIdentifier	 f Temp String2
,	TokenNameCOMMA	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
fIsEntityDeclaredVC	TokenNameIdentifier	 f Is Entity Declared VC
,	TokenNameCOMMA	
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
fTempString	TokenNameIdentifier	 f Temp String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setValue	TokenNameIdentifier	 set Value
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// If the non-normalized and normalized value are the same, avoid creating a new string. 	TokenNameCOMMENT_LINE	If the non-normalized and normalized value are the same, avoid creating a new string. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
isSameNormalizedAttr	TokenNameIdentifier	 is Same Normalized Attr
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setNonNormalizedValue	TokenNameIdentifier	 set Non Normalized Value
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
fTempString2	TokenNameIdentifier	 f Temp String2
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setSpecified	TokenNameIdentifier	 set Specified
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// record namespace declarations if any. 	TokenNameCOMMENT_LINE	record namespace declarations if any. 
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
localpart	TokenNameIdentifier	 localpart
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
?	TokenNameQUESTION	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
// when it's of form xmlns="..." or xmlns:prefix="...", 	TokenNameCOMMENT_LINE	when it's of form xmlns="..." or xmlns:prefix="...", 
// it's a namespace declaration. but prefix:xmlns="..." isn't. 	TokenNameCOMMENT_LINE	it's a namespace declaration. but prefix:xmlns="..." isn't. 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
||	TokenNameOR_OR	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
&&	TokenNameAND_AND	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// get the internalized value of this attribute 	TokenNameCOMMENT_LINE	get the internalized value of this attribute 
String	TokenNameIdentifier	 String
uri	TokenNameIdentifier	 uri
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 1. "xmlns" can't be bound to any namespace 	TokenNameCOMMENT_LINE	1. "xmlns" can't be bound to any namespace 
if	TokenNameif	
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
&&	TokenNameAND_AND	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"CantBindXMLNS"	TokenNameStringLiteral	CantBindXMLNS
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 2. the namespace for "xmlns" can't be bound to any prefix 	TokenNameCOMMENT_LINE	2. the namespace for "xmlns" can't be bound to any prefix 
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XMLNS_URI	TokenNameIdentifier	 XMLNS  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"CantBindXMLNS"	TokenNameStringLiteral	CantBindXMLNS
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 3. "xml" can't be bound to any other namespace than it's own 	TokenNameCOMMENT_LINE	3. "xml" can't be bound to any other namespace than it's own 
if	TokenNameif	
(	TokenNameLPAREN	
localpart	TokenNameIdentifier	 localpart
==	TokenNameEQUAL_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XML	TokenNameIdentifier	 PREFIX  XML
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
!=	TokenNameNOT_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XML_URI	TokenNameIdentifier	 XML  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"CantBindXML"	TokenNameStringLiteral	CantBindXML
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// 4. the namespace for "xml" can't be bound to any other prefix 	TokenNameCOMMENT_LINE	4. the namespace for "xml" can't be bound to any other prefix 
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
uri	TokenNameIdentifier	 uri
==	TokenNameEQUAL_EQUAL	
NamespaceContext	TokenNameIdentifier	 Namespace Context
.	TokenNameDOT	
XML_URI	TokenNameIdentifier	 XML  URI
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XMLNS_DOMAIN	TokenNameIdentifier	 XMLNS  DOMAIN
,	TokenNameCOMMA	
"CantBindXML"	TokenNameStringLiteral	CantBindXML
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
localpart	TokenNameIdentifier	 localpart
!=	TokenNameNOT_EQUAL	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
?	TokenNameQUESTION	
localpart	TokenNameIdentifier	 localpart
:	TokenNameCOLON	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
EMPTY_STRING	TokenNameIdentifier	 EMPTY  STRING
;	TokenNameSEMICOLON	
// Declare prefix in context. Removing the association between a prefix and a 	TokenNameCOMMENT_LINE	Declare prefix in context. Removing the association between a prefix and a 
// namespace name is permitted in XML 1.1, so if the uri value is the empty string, 	TokenNameCOMMENT_LINE	namespace name is permitted in XML 1.1, so if the uri value is the empty string, 
// the prefix is being unbound. -- mrglavas 	TokenNameCOMMENT_LINE	the prefix is being unbound. -- mrglavas 
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
declarePrefix	TokenNameIdentifier	 declare Prefix
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
uri	TokenNameIdentifier	 uri
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
?	TokenNameQUESTION	
uri	TokenNameIdentifier	 uri
:	TokenNameCOLON	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// bind namespace attribute to a namespace 	TokenNameCOMMENT_LINE	bind namespace attribute to a namespace 
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
XMLSymbols	TokenNameIdentifier	 XML Symbols
.	TokenNameDOT	
PREFIX_XMLNS	TokenNameIdentifier	 PREFIX  XMLNS
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// attempt to bind attribute 	TokenNameCOMMENT_LINE	attempt to bind attribute 
if	TokenNameif	
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
attributes	TokenNameIdentifier	 attributes
.	TokenNameDOT	
setURI	TokenNameIdentifier	 set URI
(	TokenNameLPAREN	
attrIndex	TokenNameIdentifier	 attr Index
,	TokenNameCOMMA	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
getURI	TokenNameIdentifier	 get URI
(	TokenNameLPAREN	
fAttributeQName	TokenNameIdentifier	 f Attribute Q Name
.	TokenNameDOT	
prefix	TokenNameIdentifier	 prefix
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_CONTENT_SCANNING	TokenNameIdentifier	 DEBUG  CONTENT  SCANNING
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"<<< scanAttribute()"	TokenNameStringLiteral	<<< scanAttribute()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanAttribute(XMLAttributes) 	TokenNameCOMMENT_LINE	scanAttribute(XMLAttributes) 
/** * Scans an end element. * <p> * <pre> * [42] ETag ::= '&lt;/' Name S? '>' * </pre> * <p> * <strong>Note:</strong> This method uses the fElementQName variable. * The contents of this variable will be destroyed. The caller should * copy the needed information out of this variable before calling * this method. * * @return The element depth. */	TokenNameCOMMENT_JAVADOC	 Scans an end element. <p> <pre> [42] ETag ::= '&lt;/' Name S? '>' </pre> <p> <strong>Note:</strong> This method uses the fElementQName variable. The contents of this variable will be destroyed. The caller should copy the needed information out of this variable before calling this method. * @return The element depth. 
protected	TokenNameprotected	
int	TokenNameint	
scanEndElement	TokenNameIdentifier	 scan End Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_CONTENT_SCANNING	TokenNameIdentifier	 DEBUG  CONTENT  SCANNING
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
">>> scanEndElement()"	TokenNameStringLiteral	>>> scanEndElement()
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// pop context 	TokenNameCOMMENT_LINE	pop context 
fElementStack	TokenNameIdentifier	 f Element Stack
.	TokenNameDOT	
popElement	TokenNameIdentifier	 pop Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Take advantage of the fact that next string _should_ be "fElementQName.rawName", 	TokenNameCOMMENT_LINE	Take advantage of the fact that next string _should_ be "fElementQName.rawName", 
//In scanners most of the time is consumed on checks done for XML characters, we can 	TokenNameCOMMENT_LINE	In scanners most of the time is consumed on checks done for XML characters, we can 
// optimize on it and avoid the checks done for endElement, 	TokenNameCOMMENT_LINE	optimize on it and avoid the checks done for endElement, 
//we will also avoid symbol table lookup - neeraj.bajaj@sun.com 	TokenNameCOMMENT_LINE	we will also avoid symbol table lookup - neeraj.bajaj@sun.com 
// this should work both for namespace processing true or false... 	TokenNameCOMMENT_LINE	this should work both for namespace processing true or false... 
//REVISIT: if the string is not the same as expected.. we need to do better error handling.. 	TokenNameCOMMENT_LINE	REVISIT: if the string is not the same as expected.. we need to do better error handling.. 
//We can skip this for now... In any case if the string doesn't match -- document is not well formed. 	TokenNameCOMMENT_LINE	We can skip this for now... In any case if the string doesn't match -- document is not well formed. 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipString	TokenNameIdentifier	 skip String
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ETagRequired"	TokenNameStringLiteral	ETagRequired
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// end 	TokenNameCOMMENT_LINE	end 
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ETagUnterminated"	TokenNameStringLiteral	ETagUnterminated
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fElementQName	TokenNameIdentifier	 f Element Q Name
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fMarkupDepth	TokenNameIdentifier	 f Markup Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
//we have increased the depth for two markup "<" characters 	TokenNameCOMMENT_LINE	we have increased the depth for two markup "<" characters 
fMarkupDepth	TokenNameIdentifier	 f Markup Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
// check that this element was opened in the same entity 	TokenNameCOMMENT_LINE	check that this element was opened in the same entity 
if	TokenNameif	
(	TokenNameLPAREN	
fMarkupDepth	TokenNameIdentifier	 f Markup Depth
<	TokenNameLESS	
fEntityStack	TokenNameIdentifier	 f Entity Stack
[	TokenNameLBRACKET	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ElementEntityMismatch"	TokenNameStringLiteral	ElementEntityMismatch
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
fCurrentElement	TokenNameIdentifier	 f Current Element
.	TokenNameDOT	
rawname	TokenNameIdentifier	 rawname
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// call handler 	TokenNameCOMMENT_LINE	call handler 
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
endElement	TokenNameIdentifier	 end Element
(	TokenNameLPAREN	
fElementQName	TokenNameIdentifier	 f Element Q Name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaceContext	TokenNameIdentifier	 f Namespace Context
.	TokenNameDOT	
popContext	TokenNameIdentifier	 pop Context
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
fMarkupDepth	TokenNameIdentifier	 f Markup Depth
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanEndElement():int 	TokenNameCOMMENT_LINE	scanEndElement():int 
public	TokenNamepublic	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
XMLComponentManager	TokenNameIdentifier	 XML Component Manager
componentManager	TokenNameIdentifier	 component Manager
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
super	TokenNamesuper	
.	TokenNameDOT	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
componentManager	TokenNameIdentifier	 component Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fPerformValidation	TokenNameIdentifier	 f Perform Validation
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** Creates a content dispatcher. */	TokenNameCOMMENT_JAVADOC	 Creates a content dispatcher. 
protected	TokenNameprotected	
Dispatcher	TokenNameIdentifier	 Dispatcher
createContentDispatcher	TokenNameIdentifier	 create Content Dispatcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
new	TokenNamenew	
NS11ContentDispatcher	TokenNameIdentifier	 N S11 Content Dispatcher
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// createContentDispatcher():Dispatcher 	TokenNameCOMMENT_LINE	createContentDispatcher():Dispatcher 
/** * Dispatcher to handle content scanning. */	TokenNameCOMMENT_JAVADOC	 Dispatcher to handle content scanning. 
protected	TokenNameprotected	
final	TokenNamefinal	
class	TokenNameclass	
NS11ContentDispatcher	TokenNameIdentifier	 N S11 Content Dispatcher
extends	TokenNameextends	
ContentDispatcher	TokenNameIdentifier	 Content Dispatcher
{	TokenNameLBRACE	
/** * Scan for root element hook. This method is a hook for * subclasses to add code that handles scanning for the root * element. This method will also attempt to remove DTD validator * from the pipeline, if there is no DTD grammar. If DTD validator * is no longer in the pipeline bind namespaces in the scanner. * * * @return True if the caller should stop and return true which * allows the scanner to switch to a new scanning * dispatcher. A return value of false indicates that * the content dispatcher should continue as normal. */	TokenNameCOMMENT_JAVADOC	 Scan for root element hook. This method is a hook for subclasses to add code that handles scanning for the root element. This method will also attempt to remove DTD validator from the pipeline, if there is no DTD grammar. If DTD validator is no longer in the pipeline bind namespaces in the scanner. * @return True if the caller should stop and return true which allows the scanner to switch to a new scanning dispatcher. A return value of false indicates that the content dispatcher should continue as normal. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
scanRootElementHook	TokenNameIdentifier	 scan Root Element Hook
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fExternalSubsetResolver	TokenNameIdentifier	 f External Subset Resolver
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
fSeenDoctypeDecl	TokenNameIdentifier	 f Seen Doctype Decl
&&	TokenNameAND_AND	
!	TokenNameNOT	
fDisallowDoctype	TokenNameIdentifier	 f Disallow Doctype
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fValidation	TokenNameIdentifier	 f Validation
||	TokenNameOR_OR	
fLoadExternalDTD	TokenNameIdentifier	 f Load External DTD
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanStartElementName	TokenNameIdentifier	 scan Start Element Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
resolveExternalSubsetAndRead	TokenNameIdentifier	 resolve External Subset And Read
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reconfigurePipeline	TokenNameIdentifier	 reconfigure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scanStartElementAfterName	TokenNameIdentifier	 scan Start Element After Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setScannerState	TokenNameIdentifier	 set Scanner State
(	TokenNameLPAREN	
SCANNER_STATE_TRAILING_MISC	TokenNameIdentifier	 SCANNER  STATE  TRAILING  MISC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDispatcher	TokenNameIdentifier	 set Dispatcher
(	TokenNameLPAREN	
fTrailingMiscDispatcher	TokenNameIdentifier	 f Trailing Misc Dispatcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reconfigurePipeline	TokenNameIdentifier	 reconfigure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scanStartElement	TokenNameIdentifier	 scan Start Element
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
setScannerState	TokenNameIdentifier	 set Scanner State
(	TokenNameLPAREN	
SCANNER_STATE_TRAILING_MISC	TokenNameIdentifier	 SCANNER  STATE  TRAILING  MISC
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
setDispatcher	TokenNameIdentifier	 set Dispatcher
(	TokenNameLPAREN	
fTrailingMiscDispatcher	TokenNameIdentifier	 f Trailing Misc Dispatcher
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanRootElementHook():boolean 	TokenNameCOMMENT_LINE	scanRootElementHook():boolean 
/** * Re-configures pipeline by removing the DTD validator * if no DTD grammar exists. If no validator exists in the * pipeline or there is no DTD grammar, namespace binding * is performed by the scanner in the enclosing class. */	TokenNameCOMMENT_JAVADOC	 Re-configures pipeline by removing the DTD validator if no DTD grammar exists. If no validator exists in the pipeline or there is no DTD grammar, namespace binding is performed by the scanner in the enclosing class. 
private	TokenNameprivate	
void	TokenNamevoid	
reconfigurePipeline	TokenNameIdentifier	 reconfigure Pipeline
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
.	TokenNameDOT	
hasGrammar	TokenNameIdentifier	 has Grammar
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fBindNamespaces	TokenNameIdentifier	 f Bind Namespaces
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fPerformValidation	TokenNameIdentifier	 f Perform Validation
=	TokenNameEQUAL	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
.	TokenNameDOT	
validate	TokenNameIdentifier	 validate
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// re-configure pipeline 	TokenNameCOMMENT_LINE	re-configure pipeline 
XMLDocumentSource	TokenNameIdentifier	 XML Document Source
source	TokenNameIdentifier	 source
=	TokenNameEQUAL	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
.	TokenNameDOT	
getDocumentSource	TokenNameIdentifier	 get Document Source
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLDocumentHandler	TokenNameIdentifier	 XML Document Handler
handler	TokenNameIdentifier	 handler
=	TokenNameEQUAL	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
.	TokenNameDOT	
getDocumentHandler	TokenNameIdentifier	 get Document Handler
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
source	TokenNameIdentifier	 source
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
handler	TokenNameIdentifier	 handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
handler	TokenNameIdentifier	 handler
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
source	TokenNameIdentifier	 source
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
.	TokenNameDOT	
setDocumentSource	TokenNameIdentifier	 set Document Source
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fDTDValidator	TokenNameIdentifier	 f DTD Validator
.	TokenNameDOT	
setDocumentHandler	TokenNameIdentifier	 set Document Handler
(	TokenNameLPAREN	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// reconfigurePipeline() 	TokenNameCOMMENT_LINE	reconfigurePipeline() 
}	TokenNameRBRACE	
}	TokenNameRBRACE	
