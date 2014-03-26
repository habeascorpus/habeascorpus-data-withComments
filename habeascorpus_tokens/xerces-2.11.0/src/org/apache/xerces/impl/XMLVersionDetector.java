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
CharConversionException	TokenNameIdentifier	 Char Conversion Exception
;	TokenNameSEMICOLON	
import	TokenNameimport	
java	TokenNameIdentifier	 java
.	TokenNameDOT	
io	TokenNameIdentifier	 io
.	TokenNameDOT	
EOFException	TokenNameIdentifier	 EOF Exception
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
io	TokenNameIdentifier	 io
.	TokenNameDOT	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
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
XMLInputSource	TokenNameIdentifier	 XML Input Source
;	TokenNameSEMICOLON	
/** * This class scans the version of the document to determine * which scanner to use: XML 1.1 or XML 1.0. * The version is scanned using XML 1.1. scanner. * * @xerces.internal * * @author Neil Graham, IBM * @author Elena Litani, IBM * @version $Id: XMLVersionDetector.java 699892 2008-09-28 21:08:27Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class scans the version of the document to determine which scanner to use: XML 1.1 or XML 1.0. The version is scanned using XML 1.1. scanner. * @xerces.internal * @author Neil Graham, IBM @author Elena Litani, IBM @version $Id: XMLVersionDetector.java 699892 2008-09-28 21:08:27Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLVersionDetector	TokenNameIdentifier	 XML Version Detector
{	TokenNameLBRACE	
// 	TokenNameCOMMENT_LINE	 
// Constants 	TokenNameCOMMENT_LINE	Constants 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
XML11_VERSION	TokenNameIdentifier	 XM L11  VERSION
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
{	TokenNameLBRACE	
'1'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'.'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'1'	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
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
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
/** Symbol: "version". */	TokenNameCOMMENT_JAVADOC	 Symbol: "version". 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fVersionSymbol	TokenNameIdentifier	 f Version Symbol
=	TokenNameEQUAL	
"version"	TokenNameStringLiteral	version
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// symbol: [xml]: 	TokenNameCOMMENT_LINE	symbol: [xml]: 
protected	TokenNameprotected	
static	TokenNamestatic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
fXMLSymbol	TokenNameIdentifier	 f XML Symbol
=	TokenNameEQUAL	
"[xml]"	TokenNameStringLiteral	[xml]
.	TokenNameDOT	
intern	TokenNameIdentifier	 intern
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
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
protected	TokenNameprotected	
String	TokenNameIdentifier	 String
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
final	TokenNamefinal	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
=	TokenNameEQUAL	
{	TokenNameLBRACE	
'<'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'?'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'x'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'm'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'l'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'v'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'e'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'r'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
's'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'i'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'o'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'n'	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
'='	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
,	TokenNameCOMMA	
' '	TokenNameCharacterLiteral	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
/** * * * @param componentManager The component manager. * * @throws XNIException Throws exception if required features and * properties cannot be found. */	TokenNameCOMMENT_JAVADOC	 * @param componentManager The component manager. * @throws XNIException Throws exception if required features and properties cannot be found. 
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
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
14	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset(XMLComponentManager) 	TokenNameCOMMENT_LINE	reset(XMLComponentManager) 
/** * Reset the reference to the appropriate scanner given the version of the * document and start document scanning. * @param scanner - the scanner to use * @param version - the version of the document (XML 1.1 or XML 1.0). */	TokenNameCOMMENT_JAVADOC	 Reset the reference to the appropriate scanner given the version of the document and start document scanning. @param scanner - the scanner to use @param version - the version of the document (XML 1.1 or XML 1.0). 
public	TokenNamepublic	
void	TokenNamevoid	
startDocumentParsing	TokenNameIdentifier	 start Document Parsing
(	TokenNameLPAREN	
XMLEntityHandler	TokenNameIdentifier	 XML Entity Handler
scanner	TokenNameIdentifier	 scanner
,	TokenNameCOMMA	
short	TokenNameshort	
version	TokenNameIdentifier	 version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
==	TokenNameEQUAL_EQUAL	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
setScannerVersion	TokenNameIdentifier	 set Scanner Version
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
setScannerVersion	TokenNameIdentifier	 set Scanner Version
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_1	TokenNameIdentifier	 XML  VERSION 1 1
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// Make sure the locator used by the error reporter is the current entity scanner. 	TokenNameCOMMENT_LINE	Make sure the locator used by the error reporter is the current entity scanner. 
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
setDocumentLocator	TokenNameIdentifier	 set Document Locator
(	TokenNameLPAREN	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
getEntityScanner	TokenNameIdentifier	 get Entity Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Note: above we reset fEntityScanner in the entity manager, thus in startEntity 	TokenNameCOMMENT_LINE	Note: above we reset fEntityScanner in the entity manager, thus in startEntity 
// in each scanner fEntityScanner field must be reset to reflect the change. 	TokenNameCOMMENT_LINE	in each scanner fEntityScanner field must be reset to reflect the change. 
// 	TokenNameCOMMENT_LINE	 
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
setEntityHandler	TokenNameIdentifier	 set Entity Handler
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
startEntity	TokenNameIdentifier	 start Entity
(	TokenNameLPAREN	
fXMLSymbol	TokenNameIdentifier	 f XML Symbol
,	TokenNameCOMMA	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
getCurrentResourceIdentifier	TokenNameIdentifier	 get Current Resource Identifier
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
fEncoding	TokenNameIdentifier	 f Encoding
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/** * This methods scans the XML declaration to find out the version * (and provisional encoding) of the document. * The scanning is doing using XML 1.1 scanner. * @param inputSource * @return short - Constants.XML_VERSION_1_1 if document version 1.1, * otherwise Constants.XML_VERSION_1_0 * @throws IOException */	TokenNameCOMMENT_JAVADOC	 This methods scans the XML declaration to find out the version (and provisional encoding) of the document. The scanning is doing using XML 1.1 scanner. @param inputSource @return short - Constants.XML_VERSION_1_1 if document version 1.1, otherwise Constants.XML_VERSION_1_0 @throws IOException 
public	TokenNamepublic	
short	TokenNameshort	
determineDocVersion	TokenNameIdentifier	 determine Doc Version
(	TokenNameLPAREN	
XMLInputSource	TokenNameIdentifier	 XML Input Source
inputSource	TokenNameIdentifier	 input Source
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
fEncoding	TokenNameIdentifier	 f Encoding
=	TokenNameEQUAL	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
setupCurrentEntity	TokenNameIdentifier	 setup Current Entity
(	TokenNameLPAREN	
fXMLSymbol	TokenNameIdentifier	 f XML Symbol
,	TokenNameCOMMA	
inputSource	TokenNameIdentifier	 input Source
,	TokenNameCOMMA	
false	TokenNamefalse	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Must use XML 1.0 scanner to handle whitespace correctly 	TokenNameCOMMENT_LINE	Must use XML 1.0 scanner to handle whitespace correctly 
// in the XML declaration. 	TokenNameCOMMENT_LINE	in the XML declaration. 
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
setScannerVersion	TokenNameIdentifier	 set Scanner Version
(	TokenNameLPAREN	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityScanner	TokenNameIdentifier	 XML Entity Scanner
scanner	TokenNameIdentifier	 scanner
=	TokenNameEQUAL	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
getEntityScanner	TokenNameIdentifier	 get Entity Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
try	TokenNametry	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
skipString	TokenNameIdentifier	 skip String
(	TokenNameLPAREN	
"<?xml"	TokenNameStringLiteral	<?xml
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// definitely not a well-formed 1.1 doc! 	TokenNameCOMMENT_LINE	definitely not a well-formed 1.1 doc! 
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
skipDeclSpaces	TokenNameIdentifier	 skip Decl Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fixupCurrentEntity	TokenNameIdentifier	 fixup Current Entity
(	TokenNameLPAREN	
fEntityManager	TokenNameIdentifier	 f Entity Manager
,	TokenNameCOMMA	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
,	TokenNameCOMMA	
5	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
skipString	TokenNameIdentifier	 skip String
(	TokenNameLPAREN	
"version"	TokenNameStringLiteral	version
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fixupCurrentEntity	TokenNameIdentifier	 fixup Current Entity
(	TokenNameLPAREN	
fEntityManager	TokenNameIdentifier	 f Entity Manager
,	TokenNameCOMMA	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
,	TokenNameCOMMA	
6	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
skipDeclSpaces	TokenNameIdentifier	 skip Decl Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// Check if the next character is '='. If it is then consume it. 	TokenNameCOMMENT_LINE	Check if the next character is '='. If it is then consume it. 
if	TokenNameif	
(	TokenNameLPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
'='	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fixupCurrentEntity	TokenNameIdentifier	 fixup Current Entity
(	TokenNameLPAREN	
fEntityManager	TokenNameIdentifier	 f Entity Manager
,	TokenNameCOMMA	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
,	TokenNameCOMMA	
13	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
skipDeclSpaces	TokenNameIdentifier	 skip Decl Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
quoteChar	TokenNameIdentifier	 quote Char
=	TokenNameEQUAL	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
[	TokenNameLBRACKET	
14	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
quoteChar	TokenNameIdentifier	 quote Char
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
versionPos	TokenNameIdentifier	 version Pos
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
versionPos	TokenNameIdentifier	 version Pos
<	TokenNameLESS	
XML11_VERSION	TokenNameIdentifier	 XM L11  VERSION
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
versionPos	TokenNameIdentifier	 version Pos
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
[	TokenNameLBRACKET	
15	TokenNameIntegerLiteral	
+	TokenNamePLUS	
versionPos	TokenNameIdentifier	 version Pos
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// REVISIT: should we check whether this equals quoteChar? 	TokenNameCOMMENT_LINE	REVISIT: should we check whether this equals quoteChar? 
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
[	TokenNameLBRACKET	
18	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
scanner	TokenNameIdentifier	 scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fixupCurrentEntity	TokenNameIdentifier	 fixup Current Entity
(	TokenNameLPAREN	
fEntityManager	TokenNameIdentifier	 f Entity Manager
,	TokenNameCOMMA	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
,	TokenNameCOMMA	
19	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
matched	TokenNameIdentifier	 matched
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
;	TokenNameSEMICOLON	
matched	TokenNameIdentifier	 matched
<	TokenNameLESS	
XML11_VERSION	TokenNameIdentifier	 XM L11  VERSION
.	TokenNameDOT	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
matched	TokenNameIdentifier	 matched
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fExpectedVersionString	TokenNameIdentifier	 f Expected Version String
[	TokenNameLBRACKET	
15	TokenNameIntegerLiteral	
+	TokenNamePLUS	
matched	TokenNameIdentifier	 matched
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
XML11_VERSION	TokenNameIdentifier	 XM L11  VERSION
[	TokenNameLBRACKET	
matched	TokenNameIdentifier	 matched
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
matched	TokenNameIdentifier	 matched
==	TokenNameEQUAL_EQUAL	
XML11_VERSION	TokenNameIdentifier	 XM L11  VERSION
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
?	TokenNameQUESTION	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_1	TokenNameIdentifier	 XML  VERSION 1 1
:	TokenNameCOLON	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_1_0	TokenNameIdentifier	 XML  VERSION 1 0
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// encoding errors 	TokenNameCOMMENT_LINE	encoding errors 
catch	TokenNamecatch	
(	TokenNameLPAREN	
MalformedByteSequenceException	TokenNameIdentifier	 Malformed Byte Sequence Exception
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
.	TokenNameDOT	
reportError	TokenNameIdentifier	 report Error
(	TokenNameLPAREN	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getDomain	TokenNameIdentifier	 get Domain
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getKey	TokenNameIdentifier	 get Key
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
.	TokenNameDOT	
getArguments	TokenNameIdentifier	 get Arguments
(	TokenNameLPAREN	
)	TokenNameRPAREN	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_ERROR	TokenNameIdentifier	 XML  VERSION  ERROR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
catch	TokenNamecatch	
(	TokenNameLPAREN	
CharConversionException	TokenNameIdentifier	 Char Conversion Exception
e	TokenNameIdentifier	 e
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
"CharConversionFailure"	TokenNameStringLiteral	CharConversionFailure
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
,	TokenNameCOMMA	
e	TokenNameIdentifier	 e
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_ERROR	TokenNameIdentifier	 XML  VERSION  ERROR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// premature end of file 	TokenNameCOMMENT_LINE	premature end of file 
catch	TokenNamecatch	
(	TokenNameLPAREN	
EOFException	TokenNameIdentifier	 EOF Exception
e	TokenNameIdentifier	 e
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
"PrematureEOF"	TokenNameStringLiteral	PrematureEOF
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
Constants	TokenNameIdentifier	 Constants
.	TokenNameDOT	
XML_VERSION_ERROR	TokenNameIdentifier	 XML  VERSION  ERROR
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// This method prepends "length" chars from the char array, 	TokenNameCOMMENT_LINE	This method prepends "length" chars from the char array, 
// from offset 0, to the manager's fCurrentEntity.ch. 	TokenNameCOMMENT_LINE	from offset 0, to the manager's fCurrentEntity.ch. 
private	TokenNameprivate	
void	TokenNamevoid	
fixupCurrentEntity	TokenNameIdentifier	 fixup Current Entity
(	TokenNameLPAREN	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
manager	TokenNameIdentifier	 manager
,	TokenNameCOMMA	
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
scannedChars	TokenNameIdentifier	 scanned Chars
,	TokenNameCOMMA	
int	TokenNameint	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
ScannedEntity	TokenNameIdentifier	 Scanned Entity
currentEntity	TokenNameIdentifier	 current Entity
=	TokenNameEQUAL	
manager	TokenNameIdentifier	 manager
.	TokenNameDOT	
getCurrentEntity	TokenNameIdentifier	 get Current Entity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
//resize array; this case is hard to imagine... 	TokenNameCOMMENT_LINE	resize array; this case is hard to imagine... 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tempCh	TokenNameIdentifier	 temp Ch
=	TokenNameEQUAL	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
;	TokenNameSEMICOLON	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
length	TokenNameIdentifier	 length
+	TokenNamePLUS	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
tempCh	TokenNameIdentifier	 temp Ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
tempCh	TokenNameIdentifier	 temp Ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// have to move sensitive stuff out of the way... 	TokenNameCOMMENT_LINE	have to move sensitive stuff out of the way... 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// have to reintroduce some whitespace so this parses: 	TokenNameCOMMENT_LINE	have to reintroduce some whitespace so this parses: 
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
' '	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// prepend contents... 	TokenNameCOMMENT_LINE	prepend contents... 
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
scannedChars	TokenNameIdentifier	 scanned Chars
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
currentEntity	TokenNameIdentifier	 current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// class XMLVersionDetector 	TokenNameCOMMENT_LINE	class XMLVersionDetector 
