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
/** * This class is responsible for scanning the declarations found * in the internal and external subsets of a DTD in an XML document. * The scanner acts as the sources for the DTD information which is * communicated to the DTD handlers. * <p> * This component requires the following features and properties from the * component manager that uses it: * <ul> * <li>http://xml.org/sax/features/validation</li> * <li>http://apache.org/xml/features/scanner/notify-char-refs</li> * <li>http://apache.org/xml/properties/internal/symbol-table</li> * <li>http://apache.org/xml/properties/internal/error-reporter</li> * <li>http://apache.org/xml/properties/internal/entity-manager</li> * </ul> * * @xerces.internal * * @author Arnaud Le Hors, IBM * @author Andy Clark, IBM * @author Glenn Marcy, IBM * @author Eric Ye, IBM * * @version $Id: XML11DTDScannerImpl.java 572055 2007-09-02 17:55:43Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 This class is responsible for scanning the declarations found in the internal and external subsets of a DTD in an XML document. The scanner acts as the sources for the DTD information which is communicated to the DTD handlers. <p> This component requires the following features and properties from the component manager that uses it: <ul> <li>http://xml.org/sax/features/validation</li> <li>http://apache.org/xml/features/scanner/notify-char-refs</li> <li>http://apache.org/xml/properties/internal/symbol-table</li> <li>http://apache.org/xml/properties/internal/error-reporter</li> <li>http://apache.org/xml/properties/internal/entity-manager</li> </ul> * @xerces.internal * @author Arnaud Le Hors, IBM @author Andy Clark, IBM @author Glenn Marcy, IBM @author Eric Ye, IBM * @version $Id: XML11DTDScannerImpl.java 572055 2007-09-02 17:55:43Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XML11DTDScannerImpl	TokenNameIdentifier	 XM L11 DTD Scanner Impl
extends	TokenNameextends	
XMLDTDScannerImpl	TokenNameIdentifier	 XMLDTD Scanner Impl
{	TokenNameLBRACE	
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
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
XML11DTDScannerImpl	TokenNameIdentifier	 XM L11 DTD Scanner Impl
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
/** Constructor for he use of non-XMLComponentManagers. */	TokenNameCOMMENT_JAVADOC	 Constructor for he use of non-XMLComponentManagers. 
public	TokenNamepublic	
XML11DTDScannerImpl	TokenNameIdentifier	 XM L11 DTD Scanner Impl
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
errorReporter	TokenNameIdentifier	 error Reporter
,	TokenNameCOMMA	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
entityManager	TokenNameIdentifier	 entity Manager
)	TokenNameRPAREN	
{	TokenNameLBRACE	
super	TokenNamesuper	
(	TokenNameLPAREN	
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
errorReporter	TokenNameIdentifier	 error Reporter
,	TokenNameCOMMA	
entityManager	TokenNameIdentifier	 entity Manager
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// XMLDTDScanner methods 	TokenNameCOMMENT_LINE	XMLDTDScanner methods 
// 	TokenNameCOMMENT_LINE	 
// 	TokenNameCOMMENT_LINE	 
// XMLScanner methods 	TokenNameCOMMENT_LINE	XMLScanner methods 
// 	TokenNameCOMMENT_LINE	 
// NOTE: this is a carbon copy of the code in XML11DocumentScannerImpl; 	TokenNameCOMMENT_LINE	NOTE: this is a carbon copy of the code in XML11DocumentScannerImpl; 
// we need to override these methods in both places. Ah for 	TokenNameCOMMENT_LINE	we need to override these methods in both places. Ah for 
// multiple inheritance... 	TokenNameCOMMENT_LINE	multiple inheritance... 
// This needs to be refactored!!! - NG 	TokenNameCOMMENT_LINE	This needs to be refactored!!! - NG 
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
// REVISIT: it could really only be \n or 0x20; all else is normalized, no? - neilg 	TokenNameCOMMENT_LINE	REVISIT: it could really only be \n or 0x20; all else is normalized, no? - neilg 
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
!	TokenNameNOT	
XML11Char	TokenNameIdentifier	 XM L11 Char
.	TokenNameDOT	
isXML11Valid	TokenNameIdentifier	 is XM L11 Valid
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
// note that, according to 4.3.4 of the XML 1.1 spec, XML 1.1 	TokenNameCOMMENT_LINE	note that, according to 4.3.4 of the XML 1.1 spec, XML 1.1 
// documents may invoke 1.0 entities; thus either version decl (or none!) 	TokenNameCOMMENT_LINE	documents may invoke 1.0 entities; thus either version decl (or none!) 
// is allowed to appear in this context 	TokenNameCOMMENT_LINE	is allowed to appear in this context 
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
"1.1"	TokenNameStringLiteral	1.1
)	TokenNameRPAREN	
||	TokenNameOR_OR	
version	TokenNameIdentifier	 version
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"1.0"	TokenNameStringLiteral	1.0
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
// class XML11DTDScannerImpl 	TokenNameCOMMENT_LINE	class XML11DTDScannerImpl 
