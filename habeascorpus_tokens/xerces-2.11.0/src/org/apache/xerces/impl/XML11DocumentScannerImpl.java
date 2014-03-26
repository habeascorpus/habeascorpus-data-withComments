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
XML11Char	TokenNameIdentifier	 XM L11 Char
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
/** * This class is responsible for scanning XML document structure * and content. The scanner acts as the source for the document * information which is communicated to the document handler. * <p> * This component requires the following features and properties from the * component manager that uses it: * <ul> * <li>http://xml.org/sax/features/namespaces</li> * <li>http://xml.org/sax/features/validation</li> * <li>http://apache.org/xml/features/nonvalidating/load-external-dtd</li> * <li>http://apache.org/xml/features/scanner/notify-char-refs</li> * <li>http://apache.org/xml/features/scanner/notify-builtin-refs</li> * <li>http://apache.org/xml/properties/internal/symbol-table</li> * <li>http://apache.org/xml/properties/internal/error-reporter</li> * <li>http://apache.org/xml/properties/internal/entity-manager</li> * <li>http://apache.org/xml/properties/internal/dtd-scanner</li> * </ul> * * @xerces.internal * * @author Glenn Marcy, IBM * @author Andy Clark, IBM * @author Arnaud Le Hors, IBM * @author Eric Ye, IBM * * @version $Id: XML11DocumentScannerImpl.java 572055 2007-09-02 17:55:43Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is responsible for scanning XML document structure and content. The scanner acts as the source for the document information which is communicated to the document handler. <p> This component requires the following features and properties from the component manager that uses it: <ul> <li>http://xml.org/sax/features/namespaces</li> <li>http://xml.org/sax/features/validation</li> <li>http://apache.org/xml/features/nonvalidating/load-external-dtd</li> <li>http://apache.org/xml/features/scanner/notify-char-refs</li> <li>http://apache.org/xml/features/scanner/notify-builtin-refs</li> <li>http://apache.org/xml/properties/internal/symbol-table</li> <li>http://apache.org/xml/properties/internal/error-reporter</li> <li>http://apache.org/xml/properties/internal/entity-manager</li> <li>http://apache.org/xml/properties/internal/dtd-scanner</li> </ul> * @xerces.internal * @author Glenn Marcy, IBM @author Andy Clark, IBM @author Arnaud Le Hors, IBM @author Eric Ye, IBM * @version $Id: XML11DocumentScannerImpl.java 572055 2007-09-02 17:55:43Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11DocumentScannerImpl	TokenNameIdentifier	 XM L11 Document Scanner Impl
extends	TokenNameextends	
XMLDocumentScannerImpl	TokenNameIdentifier	 XML Document Scanner Impl
{	TokenNameLBRACE	
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
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
XML11DocumentScannerImpl	TokenNameIdentifier	 XM L11 Document Scanner Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// overridden methods 	TokenNameCOMMENT_LINE	overridden methods 
// 	TokenNameCOMMENT_LINE	 
// XMLDocumentFragmentImpl methods 	TokenNameCOMMENT_LINE	XMLDocumentFragmentImpl methods 
/** * Scans element content. * * @return Returns the next character on the stream. */	TokenNameCOMMENT_JAVADOC	 Scans element content. * @return Returns the next character on the stream. 
protected	TokenNameprotected	
int	TokenNameint	
scanContent	TokenNameIdentifier	 scan Content
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
,	TokenNameCOMMA	
XNIException	TokenNameIdentifier	 XNI Exception
{	TokenNameLBRACE	
XMLString	TokenNameIdentifier	 XML String
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
fString	TokenNameIdentifier	 f String
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanContent	TokenNameIdentifier	 scan Content
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// happens when there is the character reference &#13; 	TokenNameCOMMENT_LINE	happens when there is the character reference &#13; 
// but scanContent doesn't do entity expansions... 	TokenNameCOMMENT_LINE	but scanContent doesn't do entity expansions... 
// is this *really* necessary??? - NG 	TokenNameCOMMENT_LINE	is this *really* necessary??? - NG 
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fString	TokenNameIdentifier	 f String
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
content	TokenNameIdentifier	 content
=	TokenNameEQUAL	
fStringBuffer	TokenNameIdentifier	 f String Buffer
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
content	TokenNameIdentifier	 content
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
']'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
fString	TokenNameIdentifier	 f String
.	TokenNameDOT	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
clear	TokenNameIdentifier	 clear
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
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// remember where we are in case we get an endEntity before we 	TokenNameCOMMENT_LINE	remember where we are in case we get an endEntity before we 
// could flush the buffer out - this happens when we're parsing an 	TokenNameCOMMENT_LINE	could flush the buffer out - this happens when we're parsing an 
// entity which ends with a ] 	TokenNameCOMMENT_LINE	entity which ends with a ] 
fInScanContent	TokenNameIdentifier	 f In Scan Content
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// We work on a single character basis to handle cases such as: 	TokenNameCOMMENT_LINE	We work on a single character basis to handle cases such as: 
// ']]]>' which we might otherwise miss. 	TokenNameCOMMENT_LINE	']]]>' which we might otherwise miss. 
// 	TokenNameCOMMENT_LINE	 
if	TokenNameif	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fEntityScanner	TokenNameIdentifier	 f Entity Scanner
.	TokenNameDOT	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
']'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
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
"CDEndInContent"	TokenNameStringLiteral	CDEndInContent
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fStringBuffer	TokenNameIdentifier	 f String Buffer
.	TokenNameDOT	
length	TokenNameIdentifier	 length
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fDocumentHandler	TokenNameIdentifier	 f Document Handler
.	TokenNameDOT	
characters	TokenNameIdentifier	 characters
(	TokenNameLPAREN	
fStringBuffer	TokenNameIdentifier	 f String Buffer
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fInScanContent	TokenNameIdentifier	 f In Scan Content
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanContent():int 	TokenNameCOMMENT_LINE	scanContent():int 
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
// note that none of these characters should ever get through 	TokenNameCOMMENT_LINE	note that none of these characters should ever get through 
// XML11EntityScanner. Not sure why 	TokenNameCOMMENT_LINE	XML11EntityScanner. Not sure why 
// this check was originally necessary. - NG 	TokenNameCOMMENT_LINE	this check was originally necessary. - NG 
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
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
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
// 	TokenNameCOMMENT_LINE	 
// XMLScanner methods 	TokenNameCOMMENT_LINE	XMLScanner methods 
// 	TokenNameCOMMENT_LINE	 
// NOTE: this is a carbon copy of the code in XML11DTDScannerImpl; 	TokenNameCOMMENT_LINE	NOTE: this is a carbon copy of the code in XML11DTDScannerImpl; 
// we need to override these methods in both places. 	TokenNameCOMMENT_LINE	we need to override these methods in both places. 
// this needs to be refactored!!! - NG 	TokenNameCOMMENT_LINE	this needs to be refactored!!! - NG 
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
// REVISIT: none of these except \n and 0x20 should make it past the entity scanner 	TokenNameCOMMENT_LINE	REVISIT: none of these except \n and 0x20 should make it past the entity scanner 
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
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x85	TokenNameIntegerLiteral	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
0x2028	TokenNameIntegerLiteral	
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
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
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
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Invalid	TokenNameIdentifier	 is XM L11 Invalid
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
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11ValidLiteral	TokenNameIdentifier	 is XM L11 Valid Literal
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Name	TokenNameIdentifier	 is XM L11 Name
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameStart	TokenNameIdentifier	 is XM L11 Name Start
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NCName	TokenNameIdentifier	 is XM L11 NC Name
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
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11NameHighSurrogate	TokenNameIdentifier	 is XM L11 Name High Surrogate
(	TokenNameLPAREN	
value	TokenNameIdentifier	 value
)	TokenNameRPAREN	
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
(	TokenNameLPAREN	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// versionSupported(String): boolean 	TokenNameCOMMENT_LINE	versionSupported(String): boolean 
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
"VersionNotSupported11"	TokenNameStringLiteral	VersionNotSupported11
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getVersionNotSupportedKey: String 	TokenNameCOMMENT_LINE	getVersionNotSupportedKey: String 
}	TokenNameRBRACE	
// class XML11DocumentScannerImpl 	TokenNameCOMMENT_LINE	class XML11DocumentScannerImpl 
