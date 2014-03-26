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
SymbolTable	TokenNameIdentifier	 Symbol Table
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
XMLChar	TokenNameIdentifier	 XML Char
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
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
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
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
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
Augmentations	TokenNameIdentifier	 Augmentations
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
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
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
XMLString	TokenNameIdentifier	 XML String
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
XMLComponent	TokenNameIdentifier	 XML Component
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
/** * This class is responsible for holding scanning methods common to * scanning the XML document structure and content as well as the DTD * structure and content. Both XMLDocumentScanner and XMLDTDScanner inherit * from this base class. * * <p> * This component requires the following features and properties from the * component manager that uses it: * <ul> * <li>http://xml.org/sax/features/validation</li> * <li>http://xml.org/sax/features/namespaces</li> * <li>http://apache.org/xml/features/scanner/notify-char-refs</li> * <li>http://apache.org/xml/properties/internal/symbol-table</li> * <li>http://apache.org/xml/properties/internal/error-reporter</li> * <li>http://apache.org/xml/properties/internal/entity-manager</li> * </ul> * * @xerces.internal * * @author Andy Clark, IBM * @author Arnaud Le Hors, IBM * @author Eric Ye, IBM * * @version $Id: XMLScanner.java 965250 2010-07-18 16:04:58Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is responsible for holding scanning methods common to scanning the XML document structure and content as well as the DTD structure and content. Both XMLDocumentScanner and XMLDTDScanner inherit from this base class. * <p> This component requires the following features and properties from the component manager that uses it: <ul> <li>http://xml.org/sax/features/validation</li> <li>http://xml.org/sax/features/namespaces</li> <li>http://apache.org/xml/features/scanner/notify-char-refs</li> <li>http://apache.org/xml/properties/internal/symbol-table</li> <li>http://apache.org/xml/properties/internal/error-reporter</li> <li>http://apache.org/xml/properties/internal/entity-manager</li> </ul> * @xerces.internal * @author Andy Clark, IBM @author Arnaud Le Hors, IBM @author Eric Ye, IBM * @version $Id: XMLScanner.java 965250 2010-07-18 16:04:58Z mrglavas $ 
public	TokenNamepublic	
abstract	TokenNameabstract	
class	TokenNameclass	
XMLScanner	TokenNameIdentifier	 XML Scanner
implements	TokenNameimplements	
XMLComponent	TokenNameIdentifier	 XML Component
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
// feature identifiers 	TokenNameCOMMENT_LINE	feature identifiers 
/** Feature identifier: validation. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: validation. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
VALIDATION	TokenNameIdentifier	 VALIDATION
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SAX_FEATURE_PREFIX	TokenNameIdentifier	 SAX  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
VALIDATION_FEATURE	TokenNameIdentifier	 VALIDATION  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: namespaces. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: namespaces. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NAMESPACES	TokenNameIdentifier	 NAMESPACES
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SAX_FEATURE_PREFIX	TokenNameIdentifier	 SAX  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NAMESPACES_FEATURE	TokenNameIdentifier	 NAMESPACES  FEATURE
;	TokenNameSEMICOLON	
/** Feature identifier: notify character references. */	TokenNameCOMMENT_JAVADOC	 Feature identifier: notify character references. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
NOTIFY_CHAR_REFS	TokenNameIdentifier	 NOTIFY  CHAR  REFS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
NOTIFY_CHAR_REFS_FEATURE	TokenNameIdentifier	 NOTIFY  CHAR  REFS  FEATURE
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
PARSER_SETTINGS	TokenNameIdentifier	 PARSER  SETTINGS
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_FEATURE_PREFIX	TokenNameIdentifier	 XERCES  FEATURE  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
PARSER_SETTINGS	TokenNameIdentifier	 PARSER  SETTINGS
;	TokenNameSEMICOLON	
// property identifiers 	TokenNameCOMMENT_LINE	property identifiers 
/** Property identifier: symbol table. */	TokenNameCOMMENT_JAVADOC	 Property identifier: symbol table. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
SYMBOL_TABLE	TokenNameIdentifier	 SYMBOL  TABLE
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: error reporter. */	TokenNameCOMMENT_JAVADOC	 Property identifier: error reporter. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ERROR_REPORTER	TokenNameIdentifier	 ERROR  REPORTER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
;	TokenNameSEMICOLON	
/** Property identifier: entity manager. */	TokenNameCOMMENT_JAVADOC	 Property identifier: entity manager. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
ENTITY_MANAGER	TokenNameIdentifier	 ENTITY  MANAGER
=	TokenNameEQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
+	TokenNamePLUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ENTITY_MANAGER_PROPERTY	TokenNameIdentifier	 ENTITY  MANAGER  PROPERTY
;	TokenNameSEMICOLON	
// debugging 	TokenNameCOMMENT_LINE	debugging 
/** Debug attribute normalization. */	TokenNameCOMMENT_JAVADOC	 Debug attribute normalization. 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
// features 	TokenNameCOMMENT_LINE	features 
/** * Validation. This feature identifier is: * http://xml.org/sax/features/validation */	TokenNameCOMMENT_JAVADOC	 Validation. This feature identifier is: http://xml.org/sax/features/validation 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fValidation	TokenNameIdentifier	 f Validation
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Namespaces. */	TokenNameCOMMENT_JAVADOC	 Namespaces. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fNamespaces	TokenNameIdentifier	 f Namespaces
;	TokenNameSEMICOLON	
/** Character references notification. */	TokenNameCOMMENT_JAVADOC	 Character references notification. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fNotifyCharRefs	TokenNameIdentifier	 f Notify Char Refs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** Internal parser-settings feature */	TokenNameCOMMENT_JAVADOC	 Internal parser-settings feature 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fParserSettings	TokenNameIdentifier	 f Parser Settings
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// properties 	TokenNameCOMMENT_LINE	properties 
/** Symbol table. */	TokenNameCOMMENT_JAVADOC	 Symbol table. 
protected	TokenNameprotected	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
;	TokenNameSEMICOLON	
/** Error reporter. */	TokenNameCOMMENT_JAVADOC	 Error reporter. 
protected	TokenNameprotected	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
fErrorReporter	TokenNameIdentifier	 f Error Reporter
;	TokenNameSEMICOLON	
/** Entity manager. */	TokenNameCOMMENT_JAVADOC	 Entity manager. 
protected	TokenNameprotected	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
fEntityManager	TokenNameIdentifier	 f Entity Manager
;	TokenNameSEMICOLON	
// protected data 	TokenNameCOMMENT_LINE	protected data 
/** Entity scanner. */	TokenNameCOMMENT_JAVADOC	 Entity scanner. 
protected	TokenNameprotected	
XMLEntityScanner	TokenNameIdentifier	 XML Entity Scanner
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
;	TokenNameSEMICOLON	
/** Entity depth. */	TokenNameCOMMENT_JAVADOC	 Entity depth. 
protected	TokenNameprotected	
int	TokenNameint	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
;	TokenNameSEMICOLON	
/** Literal value of the last character refence scanned. */	TokenNameCOMMENT_JAVADOC	 Literal value of the last character refence scanned. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fCharRefLiteral	TokenNameIdentifier	 f Char Ref Literal
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
/** Scanning attribute. */	TokenNameCOMMENT_JAVADOC	 Scanning attribute. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fScanningAttribute	TokenNameIdentifier	 f Scanning Attribute
;	TokenNameSEMICOLON	
/** Report entity boundary. */	TokenNameCOMMENT_JAVADOC	 Report entity boundary. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
fReportEntity	TokenNameIdentifier	 f Report Entity
;	TokenNameSEMICOLON	
// symbols 	TokenNameCOMMENT_LINE	symbols 
/** Symbol: "version". */	TokenNameCOMMENT_JAVADOC	 Symbol: "version". 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fVersionSymbol	TokenNameIdentifier	 f Version Symbol
=	TokenNameEQUAL	
"version"	TokenNameStringLiteral	version
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Symbol: "encoding". */	TokenNameCOMMENT_JAVADOC	 Symbol: "encoding". 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fEncodingSymbol	TokenNameIdentifier	 f Encoding Symbol
=	TokenNameEQUAL	
"encoding"	TokenNameStringLiteral	encoding
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Symbol: "standalone". */	TokenNameCOMMENT_JAVADOC	 Symbol: "standalone". 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fStandaloneSymbol	TokenNameIdentifier	 f Standalone Symbol
=	TokenNameEQUAL	
"standalone"	TokenNameStringLiteral	standalone
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Symbol: "amp". */	TokenNameCOMMENT_JAVADOC	 Symbol: "amp". 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fAmpSymbol	TokenNameIdentifier	 f Amp Symbol
=	TokenNameEQUAL	
"amp"	TokenNameStringLiteral	amp
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Symbol: "lt". */	TokenNameCOMMENT_JAVADOC	 Symbol: "lt". 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fLtSymbol	TokenNameIdentifier	 f Lt Symbol
=	TokenNameEQUAL	
"lt"	TokenNameStringLiteral	lt
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Symbol: "gt". */	TokenNameCOMMENT_JAVADOC	 Symbol: "gt". 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fGtSymbol	TokenNameIdentifier	 f Gt Symbol
=	TokenNameEQUAL	
"gt"	TokenNameStringLiteral	gt
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Symbol: "quot". */	TokenNameCOMMENT_JAVADOC	 Symbol: "quot". 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fQuotSymbol	TokenNameIdentifier	 f Quot Symbol
=	TokenNameEQUAL	
"quot"	TokenNameStringLiteral	quot
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** Symbol: "apos". */	TokenNameCOMMENT_JAVADOC	 Symbol: "apos". 
protected	TokenNameprotected	
final	TokenNamefinal	
static	TokenNamestatic	
String	TokenNameIdentifier	 String
fAposSymbol	TokenNameIdentifier	 f Apos Symbol
=	TokenNameEQUAL	
"apos"	TokenNameStringLiteral	apos
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// temporary variables 	TokenNameCOMMENT_LINE	temporary variables 
// NOTE: These objects are private to help prevent accidental modification 	TokenNameCOMMENT_LINE	NOTE: These objects are private to help prevent accidental modification 
// of values by a subclass. If there were protected *and* the sub- 	TokenNameCOMMENT_LINE	of values by a subclass. If there were protected *and* the sub- 
// modified the values, it would be difficult to track down the real 	TokenNameCOMMENT_LINE	modified the values, it would be difficult to track down the real 
// cause of the bug. By making these private, we avoid this 	TokenNameCOMMENT_LINE	cause of the bug. By making these private, we avoid this 
// possibility. 	TokenNameCOMMENT_LINE	possibility. 
/** String. */	TokenNameCOMMENT_JAVADOC	 String. 
private	TokenNameprivate	
final	TokenNamefinal	
XMLString	TokenNameIdentifier	 XML String
fString	TokenNameIdentifier	 f String
=	TokenNameEQUAL	
new	TokenNamenew	
XMLString	TokenNameIdentifier	 XML String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** String buffer. */	TokenNameCOMMENT_JAVADOC	 String buffer. 
private	TokenNameprivate	
final	TokenNamefinal	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
fStringBuffer	TokenNameIdentifier	 f String Buffer
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** String buffer. */	TokenNameCOMMENT_JAVADOC	 String buffer. 
private	TokenNameprivate	
final	TokenNamefinal	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
/** String buffer. */	TokenNameCOMMENT_JAVADOC	 String buffer. 
private	TokenNameprivate	
final	TokenNamefinal	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// temporary location for Resource identification information. 	TokenNameCOMMENT_LINE	temporary location for Resource identification information. 
protected	TokenNameprotected	
final	TokenNamefinal	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
fResourceIdentifier	TokenNameIdentifier	 f Resource Identifier
=	TokenNameEQUAL	
new	TokenNamenew	
XMLResourceIdentifierImpl	TokenNameIdentifier	 XML Resource Identifier Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// XMLComponent methods 	TokenNameCOMMENT_LINE	XMLComponent methods 
// 	TokenNameCOMMENT_LINE	 
/** * * * @param componentManager The component manager. * * @throws SAXException Throws exception if required features and * properties cannot be found. */	TokenNameCOMMENT_JAVADOC	 * @param componentManager The component manager. * @throws SAXException Throws exception if required features and properties cannot be found. 
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
try	TokenNametry	
{	TokenNameLBRACE	
fParserSettings	TokenNameIdentifier	 f Parser Settings
=	TokenNameEQUAL	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
PARSER_SETTINGS	TokenNameIdentifier	 PARSER  SETTINGS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fParserSettings	TokenNameIdentifier	 f Parser Settings
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fParserSettings	TokenNameIdentifier	 f Parser Settings
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// parser settings have not been changed 	TokenNameCOMMENT_LINE	parser settings have not been changed 
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Xerces properties 	TokenNameCOMMENT_LINE	Xerces properties 
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
)	TokenNameRPAREN	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
SYMBOL_TABLE	TokenNameIdentifier	 SYMBOL  TABLE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
)	TokenNameRPAREN	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ERROR_REPORTER	TokenNameIdentifier	 ERROR  REPORTER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityManager	TokenNameIdentifier	 f Entity Manager
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
)	TokenNameRPAREN	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getProperty	TokenNameIdentifier	 get Property
(	TokenNameLPAREN	
ENTITY_MANAGER	TokenNameIdentifier	 ENTITY  MANAGER
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// sax features 	TokenNameCOMMENT_LINE	sax features 
try	TokenNametry	
{	TokenNameLBRACE	
fValidation	TokenNameIdentifier	 f Validation
=	TokenNameEQUAL	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
VALIDATION	TokenNameIdentifier	 VALIDATION
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fValidation	TokenNameIdentifier	 f Validation
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
NAMESPACES	TokenNameIdentifier	 NAMESPACES
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNamespaces	TokenNameIdentifier	 f Namespaces
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
try	TokenNametry	
{	TokenNameLBRACE	
fNotifyCharRefs	TokenNameIdentifier	 f Notify Char Refs
=	TokenNameEQUAL	
componentManager	TokenNameIdentifier	 component Manager
.	TokenNameDOT	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
NOTIFY_CHAR_REFS	TokenNameIdentifier	 NOTIFY  CHAR  REFS
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNotifyCharRefs	TokenNameIdentifier	 f Notify Char Refs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset(XMLComponentManager) 	TokenNameCOMMENT_LINE	reset(XMLComponentManager) 
/** * Sets the value of a property during parsing. * * @param propertyId * @param value */	TokenNameCOMMENT_JAVADOC	 Sets the value of a property during parsing. * @param propertyId @param value 
public	TokenNamepublic	
void	TokenNamevoid	
setProperty	TokenNameIdentifier	 set Property
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
propertyId	TokenNameIdentifier	 property Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
// Xerces properties 	TokenNameCOMMENT_LINE	Xerces properties 
if	TokenNameif	
(	TokenNameLPAREN	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
final	TokenNamefinal	
int	TokenNameint	
suffixLength	TokenNameIdentifier	 suffix Length
=	TokenNameEQUAL	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
-	TokenNameMINUS	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XERCES_PROPERTY_PREFIX	TokenNameIdentifier	 XERCES  PROPERTY  PREFIX
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
SYMBOL_TABLE_PROPERTY	TokenNameIdentifier	 SYMBOL  TABLE  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ERROR_REPORTER_PROPERTY	TokenNameIdentifier	 ERROR  REPORTER  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
suffixLength	TokenNameIdentifier	 suffix Length
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ENTITY_MANAGER_PROPERTY	TokenNameIdentifier	 ENTITY  MANAGER  PROPERTY
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
propertyId	TokenNameIdentifier	 property Id
.	TokenNameDOT	
endsWith	TokenNameIdentifier	 ends With
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
ENTITY_MANAGER_PROPERTY	TokenNameIdentifier	 ENTITY  MANAGER  PROPERTY
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityManager	TokenNameIdentifier	 f Entity Manager
=	TokenNameEQUAL	
(	TokenNameLPAREN	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setProperty(String,Object) 	TokenNameCOMMENT_LINE	setProperty(String,Object) 
/* * Sets the feature of the scanner. */	TokenNameCOMMENT_BLOCK	 Sets the feature of the scanner. 
public	TokenNamepublic	
void	TokenNamevoid	
setFeature	TokenNameIdentifier	 set Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
,	TokenNameCOMMA	
boolean	TokenNameboolean	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VALIDATION	TokenNameIdentifier	 VALIDATION
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fValidation	TokenNameIdentifier	 f Validation
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
NOTIFY_CHAR_REFS	TokenNameIdentifier	 NOTIFY  CHAR  REFS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fNotifyCharRefs	TokenNameIdentifier	 f Notify Char Refs
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/* * Gets the state of the feature of the scanner. */	TokenNameCOMMENT_BLOCK	 Gets the state of the feature of the scanner. 
public	TokenNamepublic	
boolean	TokenNameboolean	
getFeature	TokenNameIdentifier	 get Feature
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
VALIDATION	TokenNameIdentifier	 VALIDATION
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fValidation	TokenNameIdentifier	 f Validation
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
NOTIFY_CHAR_REFS	TokenNameIdentifier	 NOTIFY  CHAR  REFS
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fNotifyCharRefs	TokenNameIdentifier	 f Notify Char Refs
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
throw	TokenNamethrow	
new	TokenNamenew	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
(	TokenNameLPAREN	
XMLConfigurationException	TokenNameIdentifier	 XML Configuration Exception
.	TokenNameDOT	
NOT_RECOGNIZED	TokenNameIdentifier	 NOT  RECOGNIZED
,	TokenNameCOMMA	
featureId	TokenNameIdentifier	 feature Id
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Protected methods 	TokenNameCOMMENT_LINE	Protected methods 
// 	TokenNameCOMMENT_LINE	 
// anybody calling this had better have set Symtoltable! 	TokenNameCOMMENT_LINE	anybody calling this had better have set Symtoltable! 
protected	TokenNameprotected	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// DTD preparsing defaults: 	TokenNameCOMMENT_LINE	DTD preparsing defaults: 
fValidation	TokenNameIdentifier	 f Validation
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fNotifyCharRefs	TokenNameIdentifier	 f Notify Char Refs
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// common scanning methods 	TokenNameCOMMENT_LINE	common scanning methods 
/** * Scans an XML or text declaration. * <p> * <pre> * [23] XMLDecl ::= '<?xml' VersionInfo EncodingDecl? SDDecl? S? '?>' * [24] VersionInfo ::= S 'version' Eq (' VersionNum ' | " VersionNum ") * [80] EncodingDecl ::= S 'encoding' Eq ('"' EncName '"' | "'" EncName "'" ) * [81] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')* * [32] SDDecl ::= S 'standalone' Eq (("'" ('yes' | 'no') "'") * | ('"' ('yes' | 'no') '"')) * * [77] TextDecl ::= '<?xml' VersionInfo? EncodingDecl S? '?>' * </pre> * * @param scanningTextDecl True if a text declaration is to * be scanned instead of an XML * declaration. * @param pseudoAttributeValues An array of size 3 to return the version, * encoding and standalone pseudo attribute values * (in that order). * * <strong>Note:</strong> This method uses fString, anything in it * at the time of calling is lost. */	TokenNameCOMMENT_JAVADOC	 Scans an XML or text declaration. <p> <pre> [23] XMLDecl ::= '<?xml' VersionInfo EncodingDecl? SDDecl? S? '?>' [24] VersionInfo ::= S 'version' Eq (' VersionNum ' | " VersionNum ") [80] EncodingDecl ::= S 'encoding' Eq ('"' EncName '"' | "'" EncName "'" ) [81] EncName ::= [A-Za-z] ([A-Za-z0-9._] | '-')* [32] SDDecl ::= S 'standalone' Eq (("'" ('yes' | 'no') "'") | ('"' ('yes' | 'no') '"')) * [77] TextDecl ::= '<?xml' VersionInfo? EncodingDecl S? '?>' </pre> * @param scanningTextDecl True if a text declaration is to be scanned instead of an XML declaration. @param pseudoAttributeValues An array of size 3 to return the version, encoding and standalone pseudo attribute values (in that order). * <strong>Note:</strong> This method uses fString, anything in it at the time of calling is lost. 
protected	TokenNameprotected	
void	TokenNamevoid	
scanXMLDeclOrTextDecl	TokenNameIdentifier	 scan XML Decl Or Text Decl
(	TokenNameLPAREN	
boolean	TokenNameboolean	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
pseudoAttributeValues	TokenNameIdentifier	 pseudo Attribute Values
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// pseudo-attribute values 	TokenNameCOMMENT_LINE	pseudo-attribute values 
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
standalone	TokenNameIdentifier	 standalone
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// scan pseudo-attributes 	TokenNameCOMMENT_LINE	scan pseudo-attributes 
final	TokenNamefinal	
int	TokenNameint	
STATE_VERSION	TokenNameIdentifier	 STATE  VERSION
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
STATE_ENCODING	TokenNameIdentifier	 STATE  ENCODING
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
STATE_STANDALONE	TokenNameIdentifier	 STATE  STANDALONE
=	TokenNameEQUAL	
2	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
final	TokenNamefinal	
int	TokenNameint	
STATE_DONE	TokenNameIdentifier	 STATE  DONE
=	TokenNameEQUAL	
3	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
STATE_VERSION	TokenNameIdentifier	 STATE  VERSION
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dataFoundForTarget	TokenNameIdentifier	 data Found For Target
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
sawSpace	TokenNameIdentifier	 saw Space
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipDeclSpaces	TokenNameIdentifier	 skip Decl Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// since pseudoattributes are *not* attributes, 	TokenNameCOMMENT_LINE	since pseudoattributes are *not* attributes, 
// their quotes don't need to be preserved in external parameter entities. 	TokenNameCOMMENT_LINE	their quotes don't need to be preserved in external parameter entities. 
// the XMLEntityScanner#scanLiteral method will continue to 	TokenNameCOMMENT_LINE	the XMLEntityScanner#scanLiteral method will continue to 
// emit -1 in such cases when it finds a quote; this is 	TokenNameCOMMENT_LINE	emit -1 in such cases when it finds a quote; this is 
// fine for other methods that parse scanned entities, 	TokenNameCOMMENT_LINE	fine for other methods that parse scanned entities, 
// but not for the scanning of pseudoattributes. So, 	TokenNameCOMMENT_LINE	but not for the scanning of pseudoattributes. So, 
// temporarily, we must mark the current entity as not being "literal" 	TokenNameCOMMENT_LINE	temporarily, we must mark the current entity as not being "literal" 
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
ScannedEntity	TokenNameIdentifier	 Scanned Entity
currEnt	TokenNameIdentifier	 curr Ent
=	TokenNameEQUAL	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
getCurrentEntity	TokenNameIdentifier	 get Current Entity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
currLiteral	TokenNameIdentifier	 curr Literal
=	TokenNameEQUAL	
currEnt	TokenNameIdentifier	 curr Ent
.	TokenNameDOT	
literal	TokenNameIdentifier	 literal
;	TokenNameSEMICOLON	
currEnt	TokenNameIdentifier	 curr Ent
.	TokenNameDOT	
literal	TokenNameIdentifier	 literal
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
dataFoundForTarget	TokenNameIdentifier	 data Found For Target
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
scanPseudoAttribute	TokenNameIdentifier	 scan Pseudo Attribute
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
,	TokenNameCOMMA	
fString	TokenNameIdentifier	 f String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
switch	TokenNameswitch	
(	TokenNameLPAREN	
state	TokenNameIdentifier	 state
)	TokenNameRPAREN	
{	TokenNameLBRACE	
case	TokenNamecase	
STATE_VERSION	TokenNameIdentifier	 STATE  VERSION
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
fVersionSymbol	TokenNameIdentifier	 f Version Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sawSpace	TokenNameIdentifier	 saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
"SpaceRequiredBeforeVersionInTextDecl"	TokenNameStringLiteral	SpaceRequiredBeforeVersionInTextDecl
:	TokenNameCOLON	
"SpaceRequiredBeforeVersionInXMLDecl"	TokenNameStringLiteral	SpaceRequiredBeforeVersionInXMLDecl
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
version	TokenNameIdentifier	 version
=	TokenNameEQUAL	
fString	TokenNameIdentifier	 f String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
STATE_ENCODING	TokenNameIdentifier	 STATE  ENCODING
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
versionSupported	TokenNameIdentifier	 version Supported
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
getVersionNotSupportedKey	TokenNameIdentifier	 get Version Not Supported Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
version	TokenNameIdentifier	 version
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
fEncodingSymbol	TokenNameIdentifier	 f Encoding Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"VersionInfoRequired"	TokenNameStringLiteral	VersionInfoRequired
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sawSpace	TokenNameIdentifier	 saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
"SpaceRequiredBeforeEncodingInTextDecl"	TokenNameStringLiteral	SpaceRequiredBeforeEncodingInTextDecl
:	TokenNameCOLON	
"SpaceRequiredBeforeEncodingInXMLDecl"	TokenNameStringLiteral	SpaceRequiredBeforeEncodingInXMLDecl
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
fString	TokenNameIdentifier	 f String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
STATE_DONE	TokenNameIdentifier	 STATE  DONE
:	TokenNameCOLON	
STATE_STANDALONE	TokenNameIdentifier	 STATE  STANDALONE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"EncodingDeclRequired"	TokenNameStringLiteral	EncodingDeclRequired
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"VersionInfoRequired"	TokenNameStringLiteral	VersionInfoRequired
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
STATE_ENCODING	TokenNameIdentifier	 STATE  ENCODING
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
fEncodingSymbol	TokenNameIdentifier	 f Encoding Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sawSpace	TokenNameIdentifier	 saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
"SpaceRequiredBeforeEncodingInTextDecl"	TokenNameStringLiteral	SpaceRequiredBeforeEncodingInTextDecl
:	TokenNameCOLON	
"SpaceRequiredBeforeEncodingInXMLDecl"	TokenNameStringLiteral	SpaceRequiredBeforeEncodingInXMLDecl
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
fString	TokenNameIdentifier	 f String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
STATE_DONE	TokenNameIdentifier	 STATE  DONE
:	TokenNameCOLON	
STATE_STANDALONE	TokenNameIdentifier	 STATE  STANDALONE
;	TokenNameSEMICOLON	
// TODO: check encoding name; set encoding on 	TokenNameCOMMENT_LINE	TODO: check encoding name; set encoding on 
// entity scanner 	TokenNameCOMMENT_LINE	entity scanner 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
&&	TokenNameAND_AND	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
fStandaloneSymbol	TokenNameIdentifier	 f Standalone Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sawSpace	TokenNameIdentifier	 saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SpaceRequiredBeforeStandalone"	TokenNameStringLiteral	SpaceRequiredBeforeStandalone
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
standalone	TokenNameIdentifier	 standalone
=	TokenNameEQUAL	
fString	TokenNameIdentifier	 f String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
STATE_DONE	TokenNameIdentifier	 STATE  DONE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
standalone	TokenNameIdentifier	 standalone
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
standalone	TokenNameIdentifier	 standalone
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"no"	TokenNameStringLiteral	no
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SDDeclInvalid"	TokenNameStringLiteral	SDDeclInvalid
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
standalone	TokenNameIdentifier	 standalone
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"EncodingDeclRequired"	TokenNameStringLiteral	EncodingDeclRequired
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
case	TokenNamecase	
STATE_STANDALONE	TokenNameIdentifier	 STATE  STANDALONE
:	TokenNameCOLON	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
fStandaloneSymbol	TokenNameIdentifier	 f Standalone Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
sawSpace	TokenNameIdentifier	 saw Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SpaceRequiredBeforeStandalone"	TokenNameStringLiteral	SpaceRequiredBeforeStandalone
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
standalone	TokenNameIdentifier	 standalone
=	TokenNameEQUAL	
fString	TokenNameIdentifier	 f String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
state	TokenNameIdentifier	 state
=	TokenNameEQUAL	
STATE_DONE	TokenNameIdentifier	 STATE  DONE
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
standalone	TokenNameIdentifier	 standalone
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"yes"	TokenNameStringLiteral	yes
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
standalone	TokenNameIdentifier	 standalone
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"no"	TokenNameStringLiteral	no
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SDDeclInvalid"	TokenNameStringLiteral	SDDeclInvalid
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
standalone	TokenNameIdentifier	 standalone
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"EncodingDeclRequired"	TokenNameStringLiteral	EncodingDeclRequired
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
default	TokenNamedefault	
:	TokenNameCOLON	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"NoMorePseudoAttributes"	TokenNameStringLiteral	NoMorePseudoAttributes
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
sawSpace	TokenNameIdentifier	 saw Space
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipDeclSpaces	TokenNameIdentifier	 skip Decl Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// restore original literal value 	TokenNameCOMMENT_LINE	restore original literal value 
if	TokenNameif	
(	TokenNameLPAREN	
currLiteral	TokenNameIdentifier	 curr Literal
)	TokenNameRPAREN	
currEnt	TokenNameIdentifier	 curr Ent
.	TokenNameDOT	
literal	TokenNameIdentifier	 literal
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// REVISIT: should we remove this error reporting? 	TokenNameCOMMENT_LINE	REVISIT: should we remove this error reporting? 
if	TokenNameif	
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
&&	TokenNameAND_AND	
state	TokenNameIdentifier	 state
!=	TokenNameNOT_EQUAL	
STATE_DONE	TokenNameIdentifier	 STATE  DONE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"MorePseudoAttributes"	TokenNameStringLiteral	MorePseudoAttributes
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// If there is no data in the xml or text decl then we fail to report error 	TokenNameCOMMENT_LINE	If there is no data in the xml or text decl then we fail to report error 
// for version or encoding info above. 	TokenNameCOMMENT_LINE	for version or encoding info above. 
if	TokenNameif	
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dataFoundForTarget	TokenNameIdentifier	 data Found For Target
&&	TokenNameAND_AND	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"EncodingDeclRequired"	TokenNameStringLiteral	EncodingDeclRequired
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
dataFoundForTarget	TokenNameIdentifier	 data Found For Target
&&	TokenNameAND_AND	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"VersionInfoRequired"	TokenNameStringLiteral	VersionInfoRequired
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end 	TokenNameCOMMENT_LINE	end 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
'?'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"XMLDeclUnterminated"	TokenNameStringLiteral	XMLDeclUnterminated
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
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
"XMLDeclUnterminated"	TokenNameStringLiteral	XMLDeclUnterminated
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fill in return array 	TokenNameCOMMENT_LINE	fill in return array 
pseudoAttributeValues	TokenNameIdentifier	 pseudo Attribute Values
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
version	TokenNameIdentifier	 version
;	TokenNameSEMICOLON	
pseudoAttributeValues	TokenNameIdentifier	 pseudo Attribute Values
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
pseudoAttributeValues	TokenNameIdentifier	 pseudo Attribute Values
[	TokenNameLBRACKET	
2	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
standalone	TokenNameIdentifier	 standalone
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanXMLDeclOrTextDecl(boolean) 	TokenNameCOMMENT_LINE	scanXMLDeclOrTextDecl(boolean) 
/** * Scans a pseudo attribute. * * @param scanningTextDecl True if scanning this pseudo-attribute for a * TextDecl; false if scanning XMLDecl. This * flag is needed to report the correct type of * error. * @param value The string to fill in with the attribute * value. * * @return The name of the attribute * * <strong>Note:</strong> This method uses fStringBuffer2, anything in it * at the time of calling is lost. */	TokenNameCOMMENT_JAVADOC	 Scans a pseudo attribute. * @param scanningTextDecl True if scanning this pseudo-attribute for a TextDecl; false if scanning XMLDecl. This flag is needed to report the correct type of error. @param value The string to fill in with the attribute value. * @return The name of the attribute * <strong>Note:</strong> This method uses fStringBuffer2, anything in it at the time of calling is lost. 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
scanPseudoAttribute	TokenNameIdentifier	 scan Pseudo Attribute
(	TokenNameLPAREN	
boolean	TokenNameboolean	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// REVISIT: This method is used for generic scanning of 	TokenNameCOMMENT_LINE	REVISIT: This method is used for generic scanning of 
// pseudo attributes, but since there are only three such 	TokenNameCOMMENT_LINE	pseudo attributes, but since there are only three such 
// attributes: version, encoding, and standalone there are 	TokenNameCOMMENT_LINE	attributes: version, encoding, and standalone there are 
// for performant ways of scanning them. Every decl must 	TokenNameCOMMENT_LINE	for performant ways of scanning them. Every decl must 
// have a version, and in TextDecls this version must 	TokenNameCOMMENT_LINE	have a version, and in TextDecls this version must 
// be followed by an encoding declaration. Also the 	TokenNameCOMMENT_LINE	be followed by an encoding declaration. Also the 
// methods we invoke on the scanners allow non-ASCII 	TokenNameCOMMENT_LINE	methods we invoke on the scanners allow non-ASCII 
// characters to be parsed in the decls, but since 	TokenNameCOMMENT_LINE	characters to be parsed in the decls, but since 
// we don't even know what the actual encoding of the 	TokenNameCOMMENT_LINE	we don't even know what the actual encoding of the 
// document is until we scan the encoding declaration 	TokenNameCOMMENT_LINE	document is until we scan the encoding declaration 
// you cannot reliably read any characters outside 	TokenNameCOMMENT_LINE	you cannot reliably read any characters outside 
// of the ASCII range here. -- mrglavas 	TokenNameCOMMENT_LINE	of the ASCII range here. -- mrglavas 
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanName	TokenNameIdentifier	 scan Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
getCurrentEntity	TokenNameIdentifier	 get Current Entity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
name	TokenNameIdentifier	 name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"PseudoAttrNameExpected"	TokenNameStringLiteral	PseudoAttrNameExpected
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipDeclSpaces	TokenNameIdentifier	 skip Decl Spaces
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
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
"EqRequiredInTextDecl"	TokenNameStringLiteral	EqRequiredInTextDecl
:	TokenNameCOLON	
"EqRequiredInXMLDecl"	TokenNameStringLiteral	EqRequiredInXMLDecl
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipDeclSpaces	TokenNameIdentifier	 skip Decl Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
quote	TokenNameIdentifier	 quote
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
quote	TokenNameIdentifier	 quote
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
"QuoteRequiredInTextDecl"	TokenNameStringLiteral	QuoteRequiredInTextDecl
:	TokenNameCOLON	
"QuoteRequiredInXMLDecl"	TokenNameStringLiteral	QuoteRequiredInXMLDecl
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanLiteral	TokenNameIdentifier	 scan Literal
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// REVISIT: Even if you could reliably read non-ASCII chars 	TokenNameCOMMENT_LINE	REVISIT: Even if you could reliably read non-ASCII chars 
// why bother scanning for surrogates here? Only ASCII chars 	TokenNameCOMMENT_LINE	why bother scanning for surrogates here? Only ASCII chars 
// match the productions in XMLDecls and TextDecls. -- mrglavas 	TokenNameCOMMENT_LINE	match the productions in XMLDecls and TextDecls. -- mrglavas 
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanSurrogates	TokenNameIdentifier	 scan Surrogates
(	TokenNameLPAREN	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isInvalidLiteral	TokenNameIdentifier	 is Invalid Literal
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
key	TokenNameIdentifier	 key
=	TokenNameEQUAL	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
"InvalidCharInTextDecl"	TokenNameStringLiteral	InvalidCharInTextDecl
:	TokenNameCOLON	
"InvalidCharInXMLDecl"	TokenNameStringLiteral	InvalidCharInXMLDecl
;	TokenNameSEMICOLON	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
key	TokenNameIdentifier	 key
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanLiteral	TokenNameIdentifier	 scan Literal
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
scanningTextDecl	TokenNameIdentifier	 scanning Text Decl
?	TokenNameQUESTION	
"CloseQuoteMissingInTextDecl"	TokenNameStringLiteral	CloseQuoteMissingInTextDecl
:	TokenNameCOLON	
"CloseQuoteMissingInXMLDecl"	TokenNameStringLiteral	CloseQuoteMissingInXMLDecl
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
name	TokenNameIdentifier	 name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// return 	TokenNameCOMMENT_LINE	return 
return	TokenNamereturn	
name	TokenNameIdentifier	 name
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanPseudoAttribute(XMLString):String 	TokenNameCOMMENT_LINE	scanPseudoAttribute(XMLString):String 
/** * Scans a processing instruction. * <p> * <pre> * [16] PI ::= '&lt;?' PITarget (S (Char* - (Char* '?>' Char*)))? '?>' * [17] PITarget ::= Name - (('X' | 'x') ('M' | 'm') ('L' | 'l')) * </pre> * <strong>Note:</strong> This method uses fString, anything in it * at the time of calling is lost. */	TokenNameCOMMENT_JAVADOC	 Scans a processing instruction. <p> <pre> [16] PI ::= '&lt;?' PITarget (S (Char* - (Char* '?>' Char*)))? '?>' [17] PITarget ::= Name - (('X' | 'x') ('M' | 'm') ('L' | 'l')) </pre> <strong>Note:</strong> This method uses fString, anything in it at the time of calling is lost. 
protected	TokenNameprotected	
void	TokenNamevoid	
scanPI	TokenNameIdentifier	 scan PI
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// target 	TokenNameCOMMENT_LINE	target 
fReportEntity	TokenNameIdentifier	 f Report Entity
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaces	TokenNameIdentifier	 f Namespaces
)	TokenNameRPAREN	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
target	TokenNameIdentifier	 target
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanName	TokenNameIdentifier	 scan Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"PITargetRequired"	TokenNameStringLiteral	PITargetRequired
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan data 	TokenNameCOMMENT_LINE	scan data 
scanPIData	TokenNameIdentifier	 scan PI Data
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
fString	TokenNameIdentifier	 f String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fReportEntity	TokenNameIdentifier	 f Report Entity
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanPI() 	TokenNameCOMMENT_LINE	scanPI() 
/** * Scans a processing data. This is needed to handle the situation * where a document starts with a processing instruction whose * target name <em>starts with</em> "xml". (e.g. xmlfoo) * * <strong>Note:</strong> This method uses fStringBuffer, anything in it * at the time of calling is lost. * * @param target The PI target * @param data The string to fill in with the data */	TokenNameCOMMENT_JAVADOC	 Scans a processing data. This is needed to handle the situation where a document starts with a processing instruction whose target name <em>starts with</em> "xml". (e.g. xmlfoo) * <strong>Note:</strong> This method uses fStringBuffer, anything in it at the time of calling is lost. * @param target The PI target @param data The string to fill in with the data 
protected	TokenNameprotected	
void	TokenNamevoid	
scanPIData	TokenNameIdentifier	 scan PI Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
target	TokenNameIdentifier	 target
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
data	TokenNameIdentifier	 data
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// check target 	TokenNameCOMMENT_LINE	check target 
if	TokenNameif	
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
3	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c0	TokenNameIdentifier	 c0
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c1	TokenNameIdentifier	 c1
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
c2	TokenNameIdentifier	 c2
=	TokenNameEQUAL	
Character	TokenNameIdentifier	 Character
.	TokenNameDOT	
toLowerCase	TokenNameIdentifier	 to Lower Case
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
2	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c0	TokenNameIdentifier	 c0
==	TokenNameEQUAL_EQUAL	
'x'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c1	TokenNameIdentifier	 c1
==	TokenNameEQUAL_EQUAL	
'm'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c2	TokenNameIdentifier	 c2
==	TokenNameEQUAL_EQUAL	
'l'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ReservedPITarget"	TokenNameStringLiteral	ReservedPITarget
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// spaces 	TokenNameCOMMENT_LINE	spaces 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipString	TokenNameIdentifier	 skip String
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// we found the end, there is no data 	TokenNameCOMMENT_LINE	we found the end, there is no data 
data	TokenNameIdentifier	 data
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fNamespaces	TokenNameIdentifier	 f Namespaces
&&	TokenNameAND_AND	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
colonName	TokenNameIdentifier	 colon Name
=	TokenNameEQUAL	
new	TokenNamenew	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
(	TokenNameLPAREN	
target	TokenNameIdentifier	 target
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
colonName	TokenNameIdentifier	 colon Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
str	TokenNameIdentifier	 str
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanName	TokenNameIdentifier	 scan Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
colonName	TokenNameIdentifier	 colon Name
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
str	TokenNameIdentifier	 str
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ColonNotLegalWithNS"	TokenNameStringLiteral	ColonNotLegalWithNS
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
colonName	TokenNameIdentifier	 colon Name
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// if there is data there should be some space 	TokenNameCOMMENT_LINE	if there is data there should be some space 
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SpaceRequiredInPI"	TokenNameStringLiteral	SpaceRequiredInPI
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// data 	TokenNameCOMMENT_LINE	data 
if	TokenNameif	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanData	TokenNameIdentifier	 scan Data
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
,	TokenNameCOMMA	
fStringBuffer	TokenNameIdentifier	 f String Buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
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
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanSurrogates	TokenNameIdentifier	 scan Surrogates
(	TokenNameLPAREN	
fStringBuffer	TokenNameIdentifier	 f String Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isInvalidLiteral	TokenNameIdentifier	 is Invalid Literal
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharInPI"	TokenNameStringLiteral	InvalidCharInPI
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
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanData	TokenNameIdentifier	 scan Data
(	TokenNameLPAREN	
"?>"	TokenNameStringLiteral	?>
,	TokenNameCOMMA	
fStringBuffer	TokenNameIdentifier	 f String Buffer
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
data	TokenNameIdentifier	 data
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fStringBuffer	TokenNameIdentifier	 f String Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanPIData(String,XMLString) 	TokenNameCOMMENT_LINE	scanPIData(String,XMLString) 
/** * Scans a comment. * <p> * <pre> * [15] Comment ::= '&lt!--' ((Char - '-') | ('-' (Char - '-')))* '-->' * </pre> * <p> * <strong>Note:</strong> Called after scanning past '&lt;!--' * <strong>Note:</strong> This method uses fString, anything in it * at the time of calling is lost. * * @param text The buffer to fill in with the text. */	TokenNameCOMMENT_JAVADOC	 Scans a comment. <p> <pre> [15] Comment ::= '&lt!--' ((Char - '-') | ('-' (Char - '-')))* '-->' </pre> <p> <strong>Note:</strong> Called after scanning past '&lt;!--' <strong>Note:</strong> This method uses fString, anything in it at the time of calling is lost. * @param text The buffer to fill in with the text. 
protected	TokenNameprotected	
void	TokenNamevoid	
scanComment	TokenNameIdentifier	 scan Comment
(	TokenNameLPAREN	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// text 	TokenNameCOMMENT_LINE	text 
// REVISIT: handle invalid character, eof 	TokenNameCOMMENT_LINE	REVISIT: handle invalid character, eof 
text	TokenNameIdentifier	 text
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanData	TokenNameIdentifier	 scan Data
(	TokenNameLPAREN	
"--"	TokenNameStringLiteral	--
,	TokenNameCOMMA	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
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
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanSurrogates	TokenNameIdentifier	 scan Surrogates
(	TokenNameLPAREN	
text	TokenNameIdentifier	 text
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isInvalidLiteral	TokenNameIdentifier	 is Invalid Literal
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharInComment"	TokenNameStringLiteral	InvalidCharInComment
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
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
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
"DashDashInComment"	TokenNameStringLiteral	DashDashInComment
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// scanComment() 	TokenNameCOMMENT_LINE	scanComment() 
/** * Scans an attribute value and normalizes whitespace converting all * whitespace characters to space characters. * * [10] AttValue ::= '"' ([^<&"] | Reference)* '"' | "'" ([^<&'] | Reference)* "'" * * @param value The XMLString to fill in with the value. * @param nonNormalizedValue The XMLString to fill in with the * non-normalized value. * @param atName The name of the attribute being parsed (for error msgs). * @param checkEntities true if undeclared entities should be reported as VC violation, * false if undeclared entities should be reported as WFC violation. * @param eleName The name of element to which this attribute belongs. * * @return true if the non-normalized and normalized value are the same * * <strong>Note:</strong> This method uses fStringBuffer2, anything in it * at the time of calling is lost. **/	TokenNameCOMMENT_JAVADOC	 Scans an attribute value and normalizes whitespace converting all whitespace characters to space characters. * [10] AttValue ::= '"' ([^<&"] | Reference)* '"' | "'" ([^<&'] | Reference)* "'" * @param value The XMLString to fill in with the value. @param nonNormalizedValue The XMLString to fill in with the non-normalized value. @param atName The name of the attribute being parsed (for error msgs). @param checkEntities true if undeclared entities should be reported as VC violation, false if undeclared entities should be reported as WFC violation. @param eleName The name of element to which this attribute belongs. * @return true if the non-normalized and normalized value are the same * <strong>Note:</strong> This method uses fStringBuffer2, anything in it at the time of calling is lost. *
protected	TokenNameprotected	
boolean	TokenNameboolean	
scanAttributeValue	TokenNameIdentifier	 scan Attribute Value
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
atName	TokenNameIdentifier	 at Name
,	TokenNameCOMMA	
boolean	TokenNameboolean	
checkEntities	TokenNameIdentifier	 check Entities
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
eleName	TokenNameIdentifier	 ele Name
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// quote 	TokenNameCOMMENT_LINE	quote 
int	TokenNameint	
quote	TokenNameIdentifier	 quote
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
quote	TokenNameIdentifier	 quote
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"OpenQuoteExpected"	TokenNameStringLiteral	OpenQuoteExpected
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
eleName	TokenNameIdentifier	 ele Name
,	TokenNameCOMMA	
atName	TokenNameIdentifier	 at Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
entityDepth	TokenNameIdentifier	 entity Depth
=	TokenNameEQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanLiteral	TokenNameIdentifier	 scan Literal
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** scanLiteral -> ""	TokenNameStringLiteral	** scanLiteral -> "
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
quote	TokenNameIdentifier	 quote
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
fromIndex	TokenNameIdentifier	 from Index
=	TokenNameEQUAL	
isUnchangedByNormalization	TokenNameIdentifier	 is Unchanged By Normalization
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
/** Both the non-normalized and normalized attribute values are equal. **/	TokenNameCOMMENT_JAVADOC	 Both the non-normalized and normalized attribute values are equal. *
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
cquote	TokenNameIdentifier	 cquote
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cquote	TokenNameIdentifier	 cquote
!=	TokenNameNOT_EQUAL	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"CloseQuoteExpected"	TokenNameStringLiteral	CloseQuoteExpected
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
eleName	TokenNameIdentifier	 ele Name
,	TokenNameCOMMA	
atName	TokenNameIdentifier	 at Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
normalizeWhitespace	TokenNameIdentifier	 normalize Whitespace
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** normalizeWhitespace -> ""	TokenNameStringLiteral	** normalizeWhitespace -> "
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fScanningAttribute	TokenNameIdentifier	 f Scanning Attribute
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** value2: ""	TokenNameStringLiteral	** value2: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'#'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
scanCharReferenceValue	TokenNameIdentifier	 scan Char Reference Value
(	TokenNameLPAREN	
fStringBuffer	TokenNameIdentifier	 f String Buffer
,	TokenNameCOMMA	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ch	TokenNameIdentifier	 ch
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** value3: ""	TokenNameStringLiteral	** value3: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
entityName	TokenNameIdentifier	 entity Name
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanName	TokenNameIdentifier	 scan Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"NameRequiredInReference"	TokenNameStringLiteral	NameRequiredInReference
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SemicolonRequiredInReference"	TokenNameStringLiteral	SemicolonRequiredInReference
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
entityName	TokenNameIdentifier	 entity Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
==	TokenNameEQUAL_EQUAL	
fAmpSymbol	TokenNameIdentifier	 f Amp Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'&'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** value5: ""	TokenNameStringLiteral	** value5: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
==	TokenNameEQUAL_EQUAL	
fAposSymbol	TokenNameIdentifier	 f Apos Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\''	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** value7: ""	TokenNameStringLiteral	** value7: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
==	TokenNameEQUAL_EQUAL	
fLtSymbol	TokenNameIdentifier	 f Lt Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** value9: ""	TokenNameStringLiteral	** value9: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
==	TokenNameEQUAL_EQUAL	
fGtSymbol	TokenNameIdentifier	 f Gt Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'>'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** valueB: ""	TokenNameStringLiteral	** valueB: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
==	TokenNameEQUAL_EQUAL	
fQuotSymbol	TokenNameIdentifier	 f Quot Symbol
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** valueD: ""	TokenNameStringLiteral	** valueD: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
isExternalEntity	TokenNameIdentifier	 is External Entity
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"ReferenceToExternalEntity"	TokenNameStringLiteral	ReferenceToExternalEntity
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
entityName	TokenNameIdentifier	 entity Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
isDeclaredEntity	TokenNameIdentifier	 is Declared Entity
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//WFC & VC: Entity Declared 	TokenNameCOMMENT_LINE	WFC & VC: Entity Declared 
if	TokenNameif	
(	TokenNameLPAREN	
checkEntities	TokenNameIdentifier	 check Entities
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fValidation	TokenNameIdentifier	 f Validation
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
"EntityNotDeclared"	TokenNameStringLiteral	EntityNotDeclared
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
entityName	TokenNameIdentifier	 entity Name
}	TokenNameRBRACE	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_ERROR	TokenNameIdentifier	 SEVERITY  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"EntityNotDeclared"	TokenNameStringLiteral	EntityNotDeclared
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
entityName	TokenNameIdentifier	 entity Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
entityName	TokenNameIdentifier	 entity Name
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'<'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"LessthanInAttValue"	TokenNameStringLiteral	LessthanInAttValue
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
eleName	TokenNameIdentifier	 ele Name
,	TokenNameCOMMA	
atName	TokenNameIdentifier	 at Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** valueF: ""	TokenNameStringLiteral	** valueF: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
scanSurrogates	TokenNameIdentifier	 scan Surrogates
(	TokenNameLPAREN	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** valueI: ""	TokenNameStringLiteral	** valueI: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
isInvalidLiteral	TokenNameIdentifier	 is Invalid Literal
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharInAttValue"	TokenNameStringLiteral	InvalidCharInAttValue
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
eleName	TokenNameIdentifier	 ele Name
,	TokenNameCOMMA	
atName	TokenNameIdentifier	 at Name
,	TokenNameCOMMA	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanLiteral	TokenNameIdentifier	 scan Literal
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
entityDepth	TokenNameIdentifier	 entity Depth
==	TokenNameEQUAL_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
normalizeWhitespace	TokenNameIdentifier	 normalize Whitespace
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
quote	TokenNameIdentifier	 quote
||	TokenNameOR_OR	
entityDepth	TokenNameIdentifier	 entity Depth
!=	TokenNameNOT_EQUAL	
fEntityDepth	TokenNameIdentifier	 f Entity Depth
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ATTR_NORMALIZATION	TokenNameIdentifier	 DEBUG  ATTR  NORMALIZATION
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"** valueN: ""	TokenNameStringLiteral	** valueN: "
+	TokenNamePLUS	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"""	TokenNameStringLiteral	"
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fStringBuffer	TokenNameIdentifier	 f String Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fScanningAttribute	TokenNameIdentifier	 f Scanning Attribute
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fStringBuffer2	TokenNameIdentifier	 f String Buffer2
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// quote 	TokenNameCOMMENT_LINE	quote 
int	TokenNameint	
cquote	TokenNameIdentifier	 cquote
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cquote	TokenNameIdentifier	 cquote
!=	TokenNameNOT_EQUAL	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"CloseQuoteExpected"	TokenNameStringLiteral	CloseQuoteExpected
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
eleName	TokenNameIdentifier	 ele Name
,	TokenNameCOMMA	
atName	TokenNameIdentifier	 at Name
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
nonNormalizedValue	TokenNameIdentifier	 non Normalized Value
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanAttributeValue() 	TokenNameCOMMENT_LINE	scanAttributeValue() 
/** * Scans External ID and return the public and system IDs. * * @param identifiers An array of size 2 to return the system id, * and public id (in that order). * @param optionalSystemId Specifies whether the system id is optional. * * <strong>Note:</strong> This method uses fString and fStringBuffer, * anything in them at the time of calling is lost. */	TokenNameCOMMENT_JAVADOC	 Scans External ID and return the public and system IDs. * @param identifiers An array of size 2 to return the system id, and public id (in that order). @param optionalSystemId Specifies whether the system id is optional. * <strong>Note:</strong> This method uses fString and fStringBuffer, anything in them at the time of calling is lost. 
protected	TokenNameprotected	
void	TokenNamevoid	
scanExternalID	TokenNameIdentifier	 scan External ID
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
identifiers	TokenNameIdentifier	 identifiers
,	TokenNameCOMMA	
boolean	TokenNameboolean	
optionalSystemId	TokenNameIdentifier	 optional System Id
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipString	TokenNameIdentifier	 skip String
(	TokenNameLPAREN	
"PUBLIC"	TokenNameStringLiteral	PUBLIC
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SpaceRequiredAfterPUBLIC"	TokenNameStringLiteral	SpaceRequiredAfterPUBLIC
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanPubidLiteral	TokenNameIdentifier	 scan Pubid Literal
(	TokenNameLPAREN	
fString	TokenNameIdentifier	 f String
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
publicId	TokenNameIdentifier	 public Id
=	TokenNameEQUAL	
fString	TokenNameIdentifier	 f String
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
!	TokenNameNOT	
optionalSystemId	TokenNameIdentifier	 optional System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SpaceRequiredBetweenPublicAndSystem"	TokenNameStringLiteral	SpaceRequiredBetweenPublicAndSystem
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipString	TokenNameIdentifier	 skip String
(	TokenNameLPAREN	
"SYSTEM"	TokenNameStringLiteral	SYSTEM
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SpaceRequiredAfterSYSTEM"	TokenNameStringLiteral	SpaceRequiredAfterSYSTEM
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
quote	TokenNameIdentifier	 quote
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
quote	TokenNameIdentifier	 quote
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
publicId	TokenNameIdentifier	 public Id
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
optionalSystemId	TokenNameIdentifier	 optional System Id
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// looks like we don't have any system id 	TokenNameCOMMENT_LINE	looks like we don't have any system id 
// simply return the public id 	TokenNameCOMMENT_LINE	simply return the public id 
identifiers	TokenNameIdentifier	 identifiers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
identifiers	TokenNameIdentifier	 identifiers
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"QuoteRequiredInSystemID"	TokenNameStringLiteral	QuoteRequiredInSystemID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLString	TokenNameIdentifier	 XML String
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
fString	TokenNameIdentifier	 f String
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanLiteral	TokenNameIdentifier	 scan Literal
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
,	TokenNameCOMMA	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isMarkup	TokenNameIdentifier	 is Markup
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isHighSurrogate	TokenNameIdentifier	 is High Surrogate
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
scanSurrogates	TokenNameIdentifier	 scan Surrogates
(	TokenNameLPAREN	
fStringBuffer	TokenNameIdentifier	 f String Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
isInvalidLiteral	TokenNameIdentifier	 is Invalid Literal
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharInSystemID"	TokenNameStringLiteral	InvalidCharInSystemID
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
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanLiteral	TokenNameIdentifier	 scan Literal
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
,	TokenNameCOMMA	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
ident	TokenNameIdentifier	 ident
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
ident	TokenNameIdentifier	 ident
=	TokenNameEQUAL	
fStringBuffer	TokenNameIdentifier	 f String Buffer
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
systemId	TokenNameIdentifier	 system Id
=	TokenNameEQUAL	
ident	TokenNameIdentifier	 ident
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
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
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SystemIDUnterminated"	TokenNameStringLiteral	SystemIDUnterminated
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// store result in array 	TokenNameCOMMENT_LINE	store result in array 
identifiers	TokenNameIdentifier	 identifiers
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
systemId	TokenNameIdentifier	 system Id
;	TokenNameSEMICOLON	
identifiers	TokenNameIdentifier	 identifiers
[	TokenNameLBRACKET	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
publicId	TokenNameIdentifier	 public Id
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Scans public ID literal. * * [12] PubidLiteral ::= '"' PubidChar* '"' | "'" (PubidChar - "'")* "'" * [13] PubidChar::= #x20 | #xD | #xA | [a-zA-Z0-9] | [-'()+,./:=?;!*#@$_%] * * The returned string is normalized according to the following rule, * from http://www.w3.org/TR/REC-xml#dt-pubid: * * Before a match is attempted, all strings of white space in the public * identifier must be normalized to single space characters (#x20), and * leading and trailing white space must be removed. * * @param literal The string to fill in with the public ID literal. * @return True on success. * * <strong>Note:</strong> This method uses fStringBuffer, anything in it at * the time of calling is lost. */	TokenNameCOMMENT_JAVADOC	 Scans public ID literal. * [12] PubidLiteral ::= '"' PubidChar* '"' | "'" (PubidChar - "'")* "'" [13] PubidChar::= #x20 | #xD | #xA | [a-zA-Z0-9] | [-'()+,./:=?;!*#@$_%] * The returned string is normalized according to the following rule, from http://www.w3.org/TR/REC-xml#dt-pubid: * Before a match is attempted, all strings of white space in the public identifier must be normalized to single space characters (#x20), and leading and trailing white space must be removed. * @param literal The string to fill in with the public ID literal. @return True on success. * <strong>Note:</strong> This method uses fStringBuffer, anything in it at the time of calling is lost. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
scanPubidLiteral	TokenNameIdentifier	 scan Pubid Literal
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
literal	TokenNameIdentifier	 literal
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
int	TokenNameint	
quote	TokenNameIdentifier	 quote
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
quote	TokenNameIdentifier	 quote
!=	TokenNameNOT_EQUAL	
'\''	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
quote	TokenNameIdentifier	 quote
!=	TokenNameNOT_EQUAL	
'"'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"QuoteRequiredInPublicID"	TokenNameStringLiteral	QuoteRequiredInPublicID
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// skip leading whitespace 	TokenNameCOMMENT_LINE	skip leading whitespace 
boolean	TokenNameboolean	
skipSpace	TokenNameIdentifier	 skip Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
dataok	TokenNameIdentifier	 dataok
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
true	TokenNametrue	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
' '	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
skipSpace	TokenNameIdentifier	 skip Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// take the first whitespace as a space and skip the others 	TokenNameCOMMENT_LINE	take the first whitespace as a space and skip the others 
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
' '	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpace	TokenNameIdentifier	 skip Space
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
quote	TokenNameIdentifier	 quote
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
skipSpace	TokenNameIdentifier	 skip Space
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if we finished on a space let's trim it 	TokenNameCOMMENT_LINE	if we finished on a space let's trim it 
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
literal	TokenNameIdentifier	 literal
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fStringBuffer	TokenNameIdentifier	 f String Buffer
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isPubid	TokenNameIdentifier	 is Pubid
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
skipSpace	TokenNameIdentifier	 skip Space
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"PublicIDUnterminated"	TokenNameStringLiteral	PublicIDUnterminated
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
dataok	TokenNameIdentifier	 dataok
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharInPublicID"	TokenNameStringLiteral	InvalidCharInPublicID
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
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
dataok	TokenNameIdentifier	 dataok
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * Normalize whitespace in an XMLString converting all whitespace * characters to space characters. */	TokenNameCOMMENT_JAVADOC	 Normalize whitespace in an XMLString converting all whitespace characters to space characters. 
protected	TokenNameprotected	
void	TokenNamevoid	
normalizeWhitespace	TokenNameIdentifier	 normalize Whitespace
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Performance: For XML 1.0 documents take advantage of 	TokenNameCOMMENT_LINE	Performance: For XML 1.0 documents take advantage of 
// the fact that the only legal characters below 0x20 	TokenNameCOMMENT_LINE	the fact that the only legal characters below 0x20 
// are 0x09 (TAB), 0x0A (LF) and 0x0D (CR). Since we've 	TokenNameCOMMENT_LINE	are 0x09 (TAB), 0x0A (LF) and 0x0D (CR). Since we've 
// already determined the well-formedness of these 	TokenNameCOMMENT_LINE	already determined the well-formedness of these 
// characters it is sufficient (and safe) to check 	TokenNameCOMMENT_LINE	characters it is sufficient (and safe) to check 
// against 0x20. -- mrglavas 	TokenNameCOMMENT_LINE	against 0x20. -- mrglavas 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Normalize whitespace in an XMLString converting all whitespace * characters to space characters. */	TokenNameCOMMENT_JAVADOC	 Normalize whitespace in an XMLString converting all whitespace characters to space characters. 
protected	TokenNameprotected	
void	TokenNamevoid	
normalizeWhitespace	TokenNameIdentifier	 normalize Whitespace
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
value	TokenNameIdentifier	 value
,	TokenNameCOMMA	
int	TokenNameint	
fromIndex	TokenNameIdentifier	 from Index
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
fromIndex	TokenNameIdentifier	 from Index
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Performance: For XML 1.0 documents take advantage of 	TokenNameCOMMENT_LINE	Performance: For XML 1.0 documents take advantage of 
// the fact that the only legal characters below 0x20 	TokenNameCOMMENT_LINE	the fact that the only legal characters below 0x20 
// are 0x09 (TAB), 0x0A (LF) and 0x0D (CR). Since we've 	TokenNameCOMMENT_LINE	are 0x09 (TAB), 0x0A (LF) and 0x0D (CR). Since we've 
// already determined the well-formedness of these 	TokenNameCOMMENT_LINE	already determined the well-formedness of these 
// characters it is sufficient (and safe) to check 	TokenNameCOMMENT_LINE	characters it is sufficient (and safe) to check 
// against 0x20. -- mrglavas 	TokenNameCOMMENT_LINE	against 0x20. -- mrglavas 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/** * Checks whether this string would be unchanged by normalization. * * @return -1 if the value would be unchanged by normalization, * otherwise the index of the first whitespace character which * would be transformed. */	TokenNameCOMMENT_JAVADOC	 Checks whether this string would be unchanged by normalization. * @return -1 if the value would be unchanged by normalization, otherwise the index of the first whitespace character which would be transformed. 
protected	TokenNameprotected	
int	TokenNameint	
isUnchangedByNormalization	TokenNameIdentifier	 is Unchanged By Normalization
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
end	TokenNameIdentifier	 end
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
end	TokenNameIdentifier	 end
;	TokenNameSEMICOLON	
++	TokenNamePLUS_PLUS	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// Performance: For XML 1.0 documents take advantage of 	TokenNameCOMMENT_LINE	Performance: For XML 1.0 documents take advantage of 
// the fact that the only legal characters below 0x20 	TokenNameCOMMENT_LINE	the fact that the only legal characters below 0x20 
// are 0x09 (TAB), 0x0A (LF) and 0x0D (CR). Since we've 	TokenNameCOMMENT_LINE	are 0x09 (TAB), 0x0A (LF) and 0x0D (CR). Since we've 
// already determined the well-formedness of these 	TokenNameCOMMENT_LINE	already determined the well-formedness of these 
// characters it is sufficient (and safe) to check 	TokenNameCOMMENT_LINE	characters it is sufficient (and safe) to check 
// against 0x20. -- mrglavas 	TokenNameCOMMENT_LINE	against 0x20. -- mrglavas 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
<	TokenNameLESS	
0x20	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
value	TokenNameIdentifier	 value
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLEntityHandler methods 	TokenNameCOMMENT_LINE	XMLEntityHandler methods 
// 	TokenNameCOMMENT_LINE	 
/** * This method notifies of the start of an entity. The document entity * has the pseudo-name of "[xml]" the DTD has the pseudo-name of "[dtd]" * parameter entity names start with '%'; and general entities are just * specified by their name. * * @param name The name of the entity. * @param identifier The resource identifier. * @param encoding The auto-detected IANA encoding name of the entity * stream. This value will be null in those situations * where the entity encoding is not auto-detected (e.g. * internal entities or a document entity that is * parsed from a java.io.Reader). * @param augs Additional information that may include infoset augmentations * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies of the start of an entity. The document entity has the pseudo-name of "[xml]" the DTD has the pseudo-name of "[dtd]" parameter entity names start with '%'; and general entities are just specified by their name. * @param name The name of the entity. @param identifier The resource identifier. @param encoding The auto-detected IANA encoding name of the entity stream. This value will be null in those situations where the entity encoding is not auto-detected (e.g. internal entities or a document entity that is parsed from a java.io.Reader). @param augs Additional information that may include infoset augmentations * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
XMLResourceIdentifier	TokenNameIdentifier	 XML Resource Identifier
identifier	TokenNameIdentifier	 identifier
,	TokenNameCOMMA	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// keep track of the entity depth 	TokenNameCOMMENT_LINE	keep track of the entity depth 
fEntityDepth	TokenNameIdentifier	 f Entity Depth
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
// must reset entity scanner 	TokenNameCOMMENT_LINE	must reset entity scanner 
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
=	TokenNameEQUAL	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
getEntityScanner	TokenNameIdentifier	 get Entity Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// startEntity(String,XMLResourceIdentifier,String) 	TokenNameCOMMENT_LINE	startEntity(String,XMLResourceIdentifier,String) 
/** * This method notifies the end of an entity. The document entity has * the pseudo-name of "[xml]" the DTD has the pseudo-name of "[dtd]" * parameter entity names start with '%'; and general entities are just * specified by their name. * * @param name The name of the entity. * @param augs Additional information that may include infoset augmentations * * @throws XNIException Thrown by handler to signal an error. */	TokenNameCOMMENT_JAVADOC	 This method notifies the end of an entity. The document entity has the pseudo-name of "[xml]" the DTD has the pseudo-name of "[dtd]" parameter entity names start with '%'; and general entities are just specified by their name. * @param name The name of the entity. @param augs Additional information that may include infoset augmentations * @throws XNIException Thrown by handler to signal an error. 
public	TokenNamepublic	
void	TokenNamevoid	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
Augmentations	TokenNameIdentifier	 Augmentations
augs	TokenNameIdentifier	 augs
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// keep track of the entity depth 	TokenNameCOMMENT_LINE	keep track of the entity depth 
fEntityDepth	TokenNameIdentifier	 f Entity Depth
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// endEntity(String) 	TokenNameCOMMENT_LINE	endEntity(String) 
/** * Scans a character reference and append the corresponding chars to the * specified buffer. * * <p> * <pre> * [66] CharRef ::= '&#' [0-9]+ ';' | '&#x' [0-9a-fA-F]+ ';' * </pre> * * <strong>Note:</strong> This method uses fStringBuffer, anything in it * at the time of calling is lost. * * @param buf the character buffer to append chars to * @param buf2 the character buffer to append non-normalized chars to * * @return the character value or (-1) on conversion failure */	TokenNameCOMMENT_JAVADOC	 Scans a character reference and append the corresponding chars to the specified buffer. * <p> <pre> [66] CharRef ::= '&#' [0-9]+ ';' | '&#x' [0-9a-fA-F]+ ';' </pre> * <strong>Note:</strong> This method uses fStringBuffer, anything in it at the time of calling is lost. * @param buf the character buffer to append chars to @param buf2 the character buffer to append non-normalized chars to * @return the character value or (-1) on conversion failure 
protected	TokenNameprotected	
int	TokenNameint	
scanCharReferenceValue	TokenNameIdentifier	 scan Char Reference Value
(	TokenNameLPAREN	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
buf	TokenNameIdentifier	 buf
,	TokenNameCOMMA	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
buf2	TokenNameIdentifier	 buf2
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
// scan hexadecimal value 	TokenNameCOMMENT_LINE	scan hexadecimal value 
boolean	TokenNameboolean	
hex	TokenNameIdentifier	 hex
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf2	TokenNameIdentifier	 buf2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf2	TokenNameIdentifier	 buf2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
hex	TokenNameIdentifier	 hex
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf2	TokenNameIdentifier	 buf2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf2	TokenNameIdentifier	 buf2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'a'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'f'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'A'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'F'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf2	TokenNameIdentifier	 buf2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf2	TokenNameIdentifier	 buf2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"HexdigitRequiredInCharRef"	TokenNameStringLiteral	HexdigitRequiredInCharRef
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// scan decimal value 	TokenNameCOMMENT_LINE	scan decimal value 
else	TokenNameelse	
{	TokenNameLBRACE	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf2	TokenNameIdentifier	 buf2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf2	TokenNameIdentifier	 buf2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
digit	TokenNameIdentifier	 digit
=	TokenNameEQUAL	
c	TokenNameIdentifier	 c
>=	TokenNameGREATER_EQUAL	
'0'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
<=	TokenNameLESS_EQUAL	
'9'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf2	TokenNameIdentifier	 buf2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf2	TokenNameIdentifier	 buf2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
digit	TokenNameIdentifier	 digit
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"DigitRequiredInCharRef"	TokenNameStringLiteral	DigitRequiredInCharRef
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end 	TokenNameCOMMENT_LINE	end 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"SemicolonRequiredInCharRef"	TokenNameStringLiteral	SemicolonRequiredInCharRef
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
buf2	TokenNameIdentifier	 buf2
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf2	TokenNameIdentifier	 buf2
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
';'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// convert string to number 	TokenNameCOMMENT_LINE	convert string to number 
int	TokenNameint	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
value	TokenNameIdentifier	 value
=	TokenNameEQUAL	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
parseInt	TokenNameIdentifier	 parse Int
(	TokenNameLPAREN	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
hex	TokenNameIdentifier	 hex
?	TokenNameQUESTION	
16	TokenNameIntegerLiteral	
:	TokenNameCOLON	
10	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// character reference must be a valid XML character 	TokenNameCOMMENT_LINE	character reference must be a valid XML character 
if	TokenNameif	
(	TokenNameLPAREN	
isInvalid	TokenNameIdentifier	 is Invalid
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
StringBuffer	TokenNameIdentifier	 String Buffer
errorBuf	TokenNameIdentifier	 error Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hex	TokenNameIdentifier	 hex
)	TokenNameRPAREN	
errorBuf	TokenNameIdentifier	 error Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorBuf	TokenNameIdentifier	 error Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharRef"	TokenNameStringLiteral	InvalidCharRef
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
errorBuf	TokenNameIdentifier	 error Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
NumberFormatException	TokenNameIdentifier	 Number Format Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// Conversion failed, let -1 value drop through. 	TokenNameCOMMENT_LINE	Conversion failed, let -1 value drop through. 
// If we end up here, the character reference was invalid. 	TokenNameCOMMENT_LINE	If we end up here, the character reference was invalid. 
StringBuffer	TokenNameIdentifier	 String Buffer
errorBuf	TokenNameIdentifier	 error Buf
=	TokenNameEQUAL	
new	TokenNamenew	
StringBuffer	TokenNameIdentifier	 String Buffer
(	TokenNameLPAREN	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
hex	TokenNameIdentifier	 hex
)	TokenNameRPAREN	
errorBuf	TokenNameIdentifier	 error Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
'x'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
errorBuf	TokenNameIdentifier	 error Buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharRef"	TokenNameStringLiteral	InvalidCharRef
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
errorBuf	TokenNameIdentifier	 error Buf
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// append corresponding chars to the given buffer 	TokenNameCOMMENT_LINE	append corresponding chars to the given buffer 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isSupplemental	TokenNameIdentifier	 is Supplemental
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// character is supplemental, split it into surrogate chars 	TokenNameCOMMENT_LINE	character is supplemental, split it into surrogate chars 
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
highSurrogate	TokenNameIdentifier	 high Surrogate
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
lowSurrogate	TokenNameIdentifier	 low Surrogate
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// char refs notification code 	TokenNameCOMMENT_LINE	char refs notification code 
if	TokenNameif	
(	TokenNameLPAREN	
fNotifyCharRefs	TokenNameIdentifier	 f Notify Char Refs
&&	TokenNameAND_AND	
value	TokenNameIdentifier	 value
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
literal	TokenNameIdentifier	 literal
=	TokenNameEQUAL	
"#"	TokenNameStringLiteral	#
+	TokenNamePLUS	
(	TokenNameLPAREN	
hex	TokenNameIdentifier	 hex
?	TokenNameQUESTION	
"x"	TokenNameStringLiteral	x
:	TokenNameCOLON	
""	TokenNameStringLiteral	 
)	TokenNameRPAREN	
+	TokenNamePLUS	
fStringBuffer3	TokenNameIdentifier	 f String Buffer3
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fScanningAttribute	TokenNameIdentifier	 f Scanning Attribute
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCharRefLiteral	TokenNameIdentifier	 f Char Ref Literal
=	TokenNameEQUAL	
literal	TokenNameIdentifier	 literal
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
value	TokenNameIdentifier	 value
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// returns true if the given character is not 	TokenNameCOMMENT_LINE	returns true if the given character is not 
// valid with respect to the version of 	TokenNameCOMMENT_LINE	valid with respect to the version of 
// XML understood by this scanner. 	TokenNameCOMMENT_LINE	XML understood by this scanner. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isInvalid	TokenNameIdentifier	 is Invalid
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isInvalid	TokenNameIdentifier	 is Invalid
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isInvalid(int): boolean 	TokenNameCOMMENT_LINE	isInvalid(int): boolean 
// returns true if the given character is not 	TokenNameCOMMENT_LINE	returns true if the given character is not 
// valid or may not be used outside a character reference 	TokenNameCOMMENT_LINE	valid or may not be used outside a character reference 
// with respect to the version of XML understood by this scanner. 	TokenNameCOMMENT_LINE	with respect to the version of XML understood by this scanner. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isInvalidLiteral	TokenNameIdentifier	 is Invalid Literal
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isInvalid	TokenNameIdentifier	 is Invalid
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isInvalidLiteral(int): boolean 	TokenNameCOMMENT_LINE	isInvalidLiteral(int): boolean 
// returns true if the given character is 	TokenNameCOMMENT_LINE	returns true if the given character is 
// a valid nameChar with respect to the version of 	TokenNameCOMMENT_LINE	a valid nameChar with respect to the version of 
// XML understood by this scanner. 	TokenNameCOMMENT_LINE	XML understood by this scanner. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidNameChar	TokenNameIdentifier	 is Valid Name Char
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidNameChar(int): boolean 	TokenNameCOMMENT_LINE	isValidNameChar(int): boolean 
// returns true if the given character is 	TokenNameCOMMENT_LINE	returns true if the given character is 
// a valid nameStartChar with respect to the version of 	TokenNameCOMMENT_LINE	a valid nameStartChar with respect to the version of 
// XML understood by this scanner. 	TokenNameCOMMENT_LINE	XML understood by this scanner. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidNameStartChar	TokenNameIdentifier	 is Valid Name Start Char
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNameStart	TokenNameIdentifier	 is Name Start
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidNameStartChar(int): boolean 	TokenNameCOMMENT_LINE	isValidNameStartChar(int): boolean 
// returns true if the given character is 	TokenNameCOMMENT_LINE	returns true if the given character is 
// a valid NCName character with respect to the version of 	TokenNameCOMMENT_LINE	a valid NCName character with respect to the version of 
// XML understood by this scanner. 	TokenNameCOMMENT_LINE	XML understood by this scanner. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidNCName	TokenNameIdentifier	 is Valid NC Name
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNCName	TokenNameIdentifier	 is NC Name
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidNCName(int): boolean 	TokenNameCOMMENT_LINE	isValidNCName(int): boolean 
// returns true if the given character is 	TokenNameCOMMENT_LINE	returns true if the given character is 
// a valid high surrogate for a nameStartChar 	TokenNameCOMMENT_LINE	a valid high surrogate for a nameStartChar 
// with respect to the version of XML understood 	TokenNameCOMMENT_LINE	with respect to the version of XML understood 
// by this scanner. 	TokenNameCOMMENT_LINE	by this scanner. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
isValidNameStartHighSurrogate	TokenNameIdentifier	 is Valid Name Start High Surrogate
(	TokenNameLPAREN	
int	TokenNameint	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isValidNameStartHighSurrogate(int): boolean 	TokenNameCOMMENT_LINE	isValidNameStartHighSurrogate(int): boolean 
protected	TokenNameprotected	
boolean	TokenNameboolean	
versionSupported	TokenNameIdentifier	 version Supported
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// version Supported 	TokenNameCOMMENT_LINE	version Supported 
// returns the error message key for unsupported 	TokenNameCOMMENT_LINE	returns the error message key for unsupported 
// versions of XML with respect to the version of 	TokenNameCOMMENT_LINE	versions of XML with respect to the version of 
// XML understood by this scanner. 	TokenNameCOMMENT_LINE	XML understood by this scanner. 
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
getVersionNotSupportedKey	TokenNameIdentifier	 get Version Not Supported Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
"VersionNotSupported"	TokenNameStringLiteral	VersionNotSupported
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getVersionNotSupportedKey: String 	TokenNameCOMMENT_LINE	getVersionNotSupportedKey: String 
/** * Scans surrogates and append them to the specified buffer. * <p> * <strong>Note:</strong> This assumes the current char has already been * identified as a high surrogate. * * @param buf The StringBuffer to append the read surrogates to. * @return True if it succeeded. */	TokenNameCOMMENT_JAVADOC	 Scans surrogates and append them to the specified buffer. <p> <strong>Note:</strong> This assumes the current char has already been identified as a high surrogate. * @param buf The StringBuffer to append the read surrogates to. @return True if it succeeded. 
protected	TokenNameprotected	
boolean	TokenNameboolean	
scanSurrogates	TokenNameIdentifier	 scan Surrogates
(	TokenNameLPAREN	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
buf	TokenNameIdentifier	 buf
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
int	TokenNameint	
high	TokenNameIdentifier	 high
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
low	TokenNameIdentifier	 low
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isLowSurrogate	TokenNameIdentifier	 is Low Surrogate
(	TokenNameLPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharInContent"	TokenNameStringLiteral	InvalidCharInContent
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// convert surrogates to supplemental character 	TokenNameCOMMENT_LINE	convert surrogates to supplemental character 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
supplemental	TokenNameIdentifier	 supplemental
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
high	TokenNameIdentifier	 high
,	TokenNameCOMMA	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// supplemental character must be a valid XML character 	TokenNameCOMMENT_LINE	supplemental character must be a valid XML character 
if	TokenNameif	
(	TokenNameLPAREN	
isInvalid	TokenNameIdentifier	 is Invalid
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
"InvalidCharInContent"	TokenNameStringLiteral	InvalidCharInContent
,	TokenNameCOMMA	
new	TokenNamenew	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
Integer	TokenNameIdentifier	 Integer
.	TokenNameDOT	
toString	TokenNameIdentifier	 to String
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
,	TokenNameCOMMA	
16	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
}	TokenNameRBRACE	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// fill in the buffer 	TokenNameCOMMENT_LINE	fill in the buffer 
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
high	TokenNameIdentifier	 high
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
buf	TokenNameIdentifier	 buf
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
low	TokenNameIdentifier	 low
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanSurrogates():boolean 	TokenNameCOMMENT_LINE	scanSurrogates():boolean 
/** * Convenience function used in all XML scanners. */	TokenNameCOMMENT_JAVADOC	 Convenience function used in all XML scanners. 
protected	TokenNameprotected	
void	TokenNamevoid	
reportFatalError	TokenNameIdentifier	 report Fatal Error
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
msgId	TokenNameIdentifier	 msg Id
,	TokenNameCOMMA	
Object	TokenNameIdentifier	 Object
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
args	TokenNameIdentifier	 args
)	TokenNameRPAREN	
throws	TokenNamethrows	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
XMLMessageFormatter	TokenNameIdentifier	 XML Message Formatter
.	TokenNameDOT	
XML_DOMAIN	TokenNameIdentifier	 XML  DOMAIN
,	TokenNameCOMMA	
msgId	TokenNameIdentifier	 msg Id
,	TokenNameCOMMA	
args	TokenNameIdentifier	 args
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// private methods 	TokenNameCOMMENT_LINE	private methods 
private	TokenNameprivate	
void	TokenNamevoid	
init	TokenNameIdentifier	 init
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
// initialize vars 	TokenNameCOMMENT_LINE	initialize vars 
fEntityDepth	TokenNameIdentifier	 f Entity Depth
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fReportEntity	TokenNameIdentifier	 f Report Entity
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
fResourceIdentifier	TokenNameIdentifier	 f Resource Identifier
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XMLScanner 	TokenNameCOMMENT_LINE	class XMLScanner 
