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
java	TokenNameIdentifier	 java
.	TokenNameDOT	
util	TokenNameIdentifier	 util
.	TokenNameDOT	
Locale	TokenNameIdentifier	 Locale
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
UCSReader	TokenNameIdentifier	 UCS Reader
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
XMLLocator	TokenNameIdentifier	 XML Locator
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
/** * Implements the entity scanner methods. * * @xerces.internal * * @author Andy Clark, IBM * @author Neil Graham, IBM * @version $Id: XMLEntityScanner.java 616011 2008-01-28 19:33:38Z mrglavas $ */	TokenNameCOMMENT_JAVADOC	 Implements the entity scanner methods. * @xerces.internal * @author Andy Clark, IBM @author Neil Graham, IBM @version $Id: XMLEntityScanner.java 616011 2008-01-28 19:33:38Z mrglavas $ 
public	TokenNamepublic	
class	TokenNameclass	
XMLEntityScanner	TokenNameIdentifier	 XML Entity Scanner
implements	TokenNameimplements	
XMLLocator	TokenNameIdentifier	 XML Locator
{	TokenNameLBRACE	
// constants 	TokenNameCOMMENT_LINE	constants 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_ENCODINGS	TokenNameIdentifier	 DEBUG  ENCODINGS
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
boolean	TokenNameboolean	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
/** * To signal the end of the document entity, this exception will be thrown. */	TokenNameCOMMENT_JAVADOC	 To signal the end of the document entity, this exception will be thrown. 
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
EOFException	TokenNameIdentifier	 EOF Exception
END_OF_DOCUMENT_ENTITY	TokenNameIdentifier	 END  OF  DOCUMENT  ENTITY
=	TokenNameEQUAL	
new	TokenNamenew	
EOFException	TokenNameIdentifier	 EOF Exception
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
private	TokenNameprivate	
static	TokenNamestatic	
final	TokenNamefinal	
long	TokenNamelong	
serialVersionUID	TokenNameIdentifier	 serial Version UID
=	TokenNameEQUAL	
980337771224675268L	TokenNameLongLiteral	
;	TokenNameSEMICOLON	
public	TokenNamepublic	
Throwable	TokenNameIdentifier	 Throwable
fillInStackTrace	TokenNameIdentifier	 fill In Stack Trace
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
this	TokenNamethis	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Data 	TokenNameCOMMENT_LINE	Data 
// 	TokenNameCOMMENT_LINE	 
private	TokenNameprivate	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
fEntityManager	TokenNameIdentifier	 f Entity Manager
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
ScannedEntity	TokenNameIdentifier	 Scanned Entity
fCurrentEntity	TokenNameIdentifier	 f Current Entity
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
SymbolTable	TokenNameIdentifier	 Symbol Table
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
protected	TokenNameprotected	
int	TokenNameint	
fBufferSize	TokenNameIdentifier	 f Buffer Size
=	TokenNameEQUAL	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
DEFAULT_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  BUFFER  SIZE
;	TokenNameSEMICOLON	
/** * Error reporter. This property identifier is: * http://apache.org/xml/properties/internal/error-reporter */	TokenNameCOMMENT_JAVADOC	 Error reporter. This property identifier is: http://apache.org/xml/properties/internal/error-reporter 
protected	TokenNameprotected	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
fErrorReporter	TokenNameIdentifier	 f Error Reporter
;	TokenNameSEMICOLON	
// 	TokenNameCOMMENT_LINE	 
// Constructors 	TokenNameCOMMENT_LINE	Constructors 
// 	TokenNameCOMMENT_LINE	 
/** Default constructor. */	TokenNameCOMMENT_JAVADOC	 Default constructor. 
public	TokenNamepublic	
XMLEntityScanner	TokenNameIdentifier	 XML Entity Scanner
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
}	TokenNameRBRACE	
// <init>() 	TokenNameCOMMENT_LINE	<init>() 
// 	TokenNameCOMMENT_LINE	 
// XMLEntityScanner methods 	TokenNameCOMMENT_LINE	XMLEntityScanner methods 
// 	TokenNameCOMMENT_LINE	 
/** * Returns the base system identifier of the currently scanned * entity, or null if none is available. */	TokenNameCOMMENT_JAVADOC	 Returns the base system identifier of the currently scanned entity, or null if none is available. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getBaseSystemId	TokenNameIdentifier	 get Base System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getBaseSystemId():String 	TokenNameCOMMENT_LINE	getBaseSystemId():String 
/** * Sets the encoding of the scanner. This method is used by the * scanners if the XMLDecl or TextDecl line contains an encoding * pseudo-attribute. * <p> * <strong>Note:</strong> The underlying character reader on the * current entity will be changed to accomodate the new encoding. * However, the new encoding is ignored if the current reader was * not constructed from an input stream (e.g. an external entity * that is resolved directly to the appropriate java.io.Reader * object). * * @param encoding The IANA encoding name of the new encoding. * * @throws IOException Thrown if the new encoding is not supported. * * @see org.apache.xerces.util.EncodingMap */	TokenNameCOMMENT_JAVADOC	 Sets the encoding of the scanner. This method is used by the scanners if the XMLDecl or TextDecl line contains an encoding pseudo-attribute. <p> <strong>Note:</strong> The underlying character reader on the current entity will be changed to accomodate the new encoding. However, the new encoding is ignored if the current reader was not constructed from an input stream (e.g. an external entity that is resolved directly to the appropriate java.io.Reader object). * @param encoding The IANA encoding name of the new encoding. * @throws IOException Thrown if the new encoding is not supported. * @see org.apache.xerces.util.EncodingMap 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setEncoding	TokenNameIdentifier	 set Encoding
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ENCODINGS	TokenNameIdentifier	 DEBUG  ENCODINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"$$$ setEncoding: "	TokenNameStringLiteral	$$$ setEncoding: 
+	TokenNamePLUS	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// if the encoding is the same, don't change the reader and 	TokenNameCOMMENT_LINE	if the encoding is the same, don't change the reader and 
// re-use the original reader used by the OneCharReader 	TokenNameCOMMENT_LINE	re-use the original reader used by the OneCharReader 
// NOTE: Besides saving an object, this overcomes deficiencies 	TokenNameCOMMENT_LINE	NOTE: Besides saving an object, this overcomes deficiencies 
// in the UTF-16 reader supplied with the standard Java 	TokenNameCOMMENT_LINE	in the UTF-16 reader supplied with the standard Java 
// distribution (up to and including 1.3). The UTF-16 	TokenNameCOMMENT_LINE	distribution (up to and including 1.3). The UTF-16 
// decoder buffers 8K blocks even when only asked to read 	TokenNameCOMMENT_LINE	decoder buffers 8K blocks even when only asked to read 
// a single char! -Ac 	TokenNameCOMMENT_LINE	a single char! -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
||	TokenNameOR_OR	
!	TokenNameNOT	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
encoding	TokenNameIdentifier	 encoding
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// UTF-16 is a bit of a special case. If the encoding is UTF-16, 	TokenNameCOMMENT_LINE	UTF-16 is a bit of a special case. If the encoding is UTF-16, 
// and we know the endian-ness, we shouldn't change readers. 	TokenNameCOMMENT_LINE	and we know the endian-ness, we shouldn't change readers. 
// If it's ISO-10646-UCS-(2|4), then we'll have to deduce 	TokenNameCOMMENT_LINE	If it's ISO-10646-UCS-(2|4), then we'll have to deduce 
// the endian-ness from the encoding we presently have. 	TokenNameCOMMENT_LINE	the endian-ness from the encoding we presently have. 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
startsWith	TokenNameIdentifier	 starts With
(	TokenNameLPAREN	
"UTF-16"	TokenNameStringLiteral	UTF-16
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
ENCODING	TokenNameIdentifier	 ENCODING
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
toUpperCase	TokenNameIdentifier	 to Upper Case
(	TokenNameLPAREN	
Locale	TokenNameIdentifier	 Locale
.	TokenNameDOT	
ENGLISH	TokenNameIdentifier	 ENGLISH
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ENCODING	TokenNameIdentifier	 ENCODING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"UTF-16"	TokenNameStringLiteral	UTF-16
)	TokenNameRPAREN	
)	TokenNameRPAREN	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
ENCODING	TokenNameIdentifier	 ENCODING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ISO-10646-UCS-4"	TokenNameStringLiteral	ISO-10646-UCS-4
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"UTF-16BE"	TokenNameStringLiteral	UTF-16BE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
UCSReader	TokenNameIdentifier	 UCS Reader
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
UCSReader	TokenNameIdentifier	 UCS Reader
.	TokenNameDOT	
UCS4BE	TokenNameIdentifier	 UC S4 BE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
UCSReader	TokenNameIdentifier	 UCS Reader
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
UCSReader	TokenNameIdentifier	 UCS Reader
.	TokenNameDOT	
UCS4LE	TokenNameIdentifier	 UC S4 LE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
ENCODING	TokenNameIdentifier	 ENCODING
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"ISO-10646-UCS-2"	TokenNameStringLiteral	ISO-10646-UCS-2
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
.	TokenNameDOT	
equals	TokenNameIdentifier	 equals
(	TokenNameLPAREN	
"UTF-16BE"	TokenNameStringLiteral	UTF-16BE
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
UCSReader	TokenNameIdentifier	 UCS Reader
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
UCSReader	TokenNameIdentifier	 UCS Reader
.	TokenNameDOT	
UCS2BE	TokenNameIdentifier	 UC S2 BE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
=	TokenNameEQUAL	
new	TokenNamenew	
UCSReader	TokenNameIdentifier	 UCS Reader
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
UCSReader	TokenNameIdentifier	 UCS Reader
.	TokenNameDOT	
UCS2LE	TokenNameIdentifier	 UC S2 LE
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// wrap a new reader around the input stream, changing 	TokenNameCOMMENT_LINE	wrap a new reader around the input stream, changing 
// the encoding 	TokenNameCOMMENT_LINE	the encoding 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ENCODINGS	TokenNameIdentifier	 DEBUG  ENCODINGS
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"$$$ creating new reader from stream: "	TokenNameStringLiteral	$$$ creating new reader from stream: 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
//fCurrentEntity.stream.reset(); 	TokenNameCOMMENT_LINE	fCurrentEntity.stream.reset(); 
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
setReader	TokenNameIdentifier	 set Reader
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
stream	TokenNameIdentifier	 stream
,	TokenNameCOMMA	
encoding	TokenNameIdentifier	 encoding
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
=	TokenNameEQUAL	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_ENCODINGS	TokenNameIdentifier	 DEBUG  ENCODINGS
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
"$$$ reusing old reader on stream"	TokenNameStringLiteral	$$$ reusing old reader on stream
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// setEncoding(String) 	TokenNameCOMMENT_LINE	setEncoding(String) 
/** * Sets the XML version. This method is used by the * scanners to report the value of the version pseudo-attribute * in an XML or text declaration. * * @param xmlVersion the XML version of the current entity */	TokenNameCOMMENT_JAVADOC	 Sets the XML version. This method is used by the scanners to report the value of the version pseudo-attribute in an XML or text declaration. * @param xmlVersion the XML version of the current entity 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setXMLVersion	TokenNameIdentifier	 set XML Version
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
xmlVersion	TokenNameIdentifier	 xml Version
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
xmlVersion	TokenNameIdentifier	 xml Version
=	TokenNameEQUAL	
xmlVersion	TokenNameIdentifier	 xml Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// setXMLVersion(String) 	TokenNameCOMMENT_LINE	setXMLVersion(String) 
/** Returns true if the current entity being scanned is external. */	TokenNameCOMMENT_JAVADOC	 Returns true if the current entity being scanned is external. 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// isExternal():boolean 	TokenNameCOMMENT_LINE	isExternal():boolean 
/** * Returns the next character on the input. * <p> * <strong>Note:</strong> The character is <em>not</em> consumed. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Returns the next character on the input. <p> <strong>Note:</strong> The character is <em>not</em> consumed. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
int	TokenNameint	
peekChar	TokenNameIdentifier	 peek Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(peekChar: "	TokenNameStringLiteral	(peekChar: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// peek at character 	TokenNameCOMMENT_LINE	peek at character 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// return peeked character 	TokenNameCOMMENT_LINE	return peeked character 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")peekChar: "	TokenNameStringLiteral	)peekChar: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> '"	TokenNameStringLiteral	 -> '
+	TokenNamePLUS	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'\r'	TokenNameCharacterLiteral	
?	TokenNameQUESTION	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> '"	TokenNameStringLiteral	 -> '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
'\r'	TokenNameCharacterLiteral	
?	TokenNameQUESTION	
c	TokenNameIdentifier	 c
:	TokenNameCOLON	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// peekChar():int 	TokenNameCOMMENT_LINE	peekChar():int 
/** * Returns the next character on the input. * <p> * <strong>Note:</strong> The character is consumed. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Returns the next character on the input. <p> <strong>Note:</strong> The character is consumed. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
int	TokenNameint	
scanChar	TokenNameIdentifier	 scan Char
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(scanChar: "	TokenNameStringLiteral	(scanChar: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan character 	TokenNameCOMMENT_LINE	scan character 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// return character that was scanned 	TokenNameCOMMENT_LINE	return character that was scanned 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanChar: "	TokenNameStringLiteral	)scanChar: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> '"	TokenNameStringLiteral	 -> '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanChar():int 	TokenNameCOMMENT_LINE	scanChar():int 
/** * Returns a string matching the NMTOKEN production appearing immediately * on the input as a symbol, or null if NMTOKEN Name string is present. * <p> * <strong>Note:</strong> The NMTOKEN characters are consumed. * <p> * <strong>Note:</strong> The string returned must be a symbol. The * SymbolTable can be used for this purpose. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.SymbolTable * @see org.apache.xerces.util.XMLChar#isName */	TokenNameCOMMENT_JAVADOC	 Returns a string matching the NMTOKEN production appearing immediately on the input as a symbol, or null if NMTOKEN Name string is present. <p> <strong>Note:</strong> The NMTOKEN characters are consumed. <p> <strong>Note:</strong> The string returned must be a symbol. The SymbolTable can be used for this purpose. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.SymbolTable @see org.apache.xerces.util.XMLChar#isName 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
scanNmtoken	TokenNameIdentifier	 scan Nmtoken
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(scanNmtoken: "	TokenNameStringLiteral	(scanNmtoken: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan nmtoken 	TokenNameCOMMENT_LINE	scan nmtoken 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// return nmtoken 	TokenNameCOMMENT_LINE	return nmtoken 
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanNmtoken: "	TokenNameStringLiteral	)scanNmtoken: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanNmtoken():String 	TokenNameCOMMENT_LINE	scanNmtoken():String 
/** * Returns a string matching the Name production appearing immediately * on the input as a symbol, or null if no Name string is present. * <p> * <strong>Note:</strong> The Name characters are consumed. * <p> * <strong>Note:</strong> The string returned must be a symbol. The * SymbolTable can be used for this purpose. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.SymbolTable * @see org.apache.xerces.util.XMLChar#isName * @see org.apache.xerces.util.XMLChar#isNameStart */	TokenNameCOMMENT_JAVADOC	 Returns a string matching the Name production appearing immediately on the input as a symbol, or null if no Name string is present. <p> <strong>Note:</strong> The Name characters are consumed. <p> <strong>Note:</strong> The string returned must be a symbol. The SymbolTable can be used for this purpose. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.SymbolTable @see org.apache.xerces.util.XMLChar#isName @see org.apache.xerces.util.XMLChar#isNameStart 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
scanName	TokenNameIdentifier	 scan Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(scanName: "	TokenNameStringLiteral	(scanName: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan name 	TokenNameCOMMENT_LINE	scan name 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNameStart	TokenNameIdentifier	 is Name Start
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanName: "	TokenNameStringLiteral	)scanName: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// return name 	TokenNameCOMMENT_LINE	return name 
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanName: "	TokenNameStringLiteral	)scanName: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanName():String 	TokenNameCOMMENT_LINE	scanName():String 
/** * Returns a string matching the NCName production appearing immediately * on the input as a symbol, or null if no NCName string is present. * <p> * <strong>Note:</strong> The NCName characters are consumed. * <p> * <strong>Note:</strong> The string returned must be a symbol. The * SymbolTable can be used for this purpose. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.SymbolTable * @see org.apache.xerces.util.XMLChar#isNCName * @see org.apache.xerces.util.XMLChar#isNCNameStart */	TokenNameCOMMENT_JAVADOC	 Returns a string matching the NCName production appearing immediately on the input as a symbol, or null if no NCName string is present. <p> <strong>Note:</strong> The NCName characters are consumed. <p> <strong>Note:</strong> The string returned must be a symbol. The SymbolTable can be used for this purpose. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.SymbolTable @see org.apache.xerces.util.XMLChar#isNCName @see org.apache.xerces.util.XMLChar#isNCNameStart 
public	TokenNamepublic	
String	TokenNameIdentifier	 String
scanNCName	TokenNameIdentifier	 scan NC Name
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(scanNCName: "	TokenNameStringLiteral	(scanNCName: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan name 	TokenNameCOMMENT_LINE	scan name 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNCNameStart	TokenNameIdentifier	 is NC Name Start
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanNCName: "	TokenNameStringLiteral	)scanNCName: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNCName	TokenNameIdentifier	 is NC Name
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
// return name 	TokenNameCOMMENT_LINE	return name 
String	TokenNameIdentifier	 String
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
symbol	TokenNameIdentifier	 symbol
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanNCName: "	TokenNameStringLiteral	)scanNCName: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
String	TokenNameIdentifier	 String
.	TokenNameDOT	
valueOf	TokenNameIdentifier	 value Of
(	TokenNameLPAREN	
symbol	TokenNameIdentifier	 symbol
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
symbol	TokenNameIdentifier	 symbol
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanNCName():String 	TokenNameCOMMENT_LINE	scanNCName():String 
/** * Scans a qualified name from the input, setting the fields of the * QName structure appropriately. * <p> * <strong>Note:</strong> The qualified name characters are consumed. * <p> * <strong>Note:</strong> The strings used to set the values of the * QName structure must be symbols. The SymbolTable can be used for * this purpose. * * @param qname The qualified name structure to fill. * * @return Returns true if a qualified name appeared immediately on * the input and was scanned, false otherwise. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.SymbolTable * @see org.apache.xerces.util.XMLChar#isName * @see org.apache.xerces.util.XMLChar#isNameStart */	TokenNameCOMMENT_JAVADOC	 Scans a qualified name from the input, setting the fields of the QName structure appropriately. <p> <strong>Note:</strong> The qualified name characters are consumed. <p> <strong>Note:</strong> The strings used to set the values of the QName structure must be symbols. The SymbolTable can be used for this purpose. * @param qname The qualified name structure to fill. * @return Returns true if a qualified name appeared immediately on the input and was scanned, false otherwise. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.SymbolTable @see org.apache.xerces.util.XMLChar#isName @see org.apache.xerces.util.XMLChar#isNameStart 
public	TokenNamepublic	
boolean	TokenNameboolean	
scanQName	TokenNameIdentifier	 scan Q Name
(	TokenNameLPAREN	
QName	TokenNameIdentifier	 Q Name
qname	TokenNameIdentifier	 qname
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(scanQName, "	TokenNameStringLiteral	(scanQName, 
+	TokenNamePLUS	
qname	TokenNameIdentifier	 qname
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scan qualified name 	TokenNameCOMMENT_LINE	scan qualified name 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNCNameStart	TokenNameIdentifier	 is NC Name Start
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
name	TokenNameIdentifier	 name
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
null	TokenNamenull	
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
name	TokenNameIdentifier	 name
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanQName, "	TokenNameStringLiteral	)scanQName, 
+	TokenNamePLUS	
qname	TokenNameIdentifier	 qname
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> true"	TokenNameStringLiteral	 -> true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isName	TokenNameIdentifier	 is Name
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
':'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// bad luck we have to resize our buffer 	TokenNameCOMMENT_LINE	bad luck we have to resize our buffer 
char	TokenNamechar	
[	TokenNameLBRACKET	
]	TokenNameRBRACKET	
tmp	TokenNameIdentifier	 tmp
=	TokenNameEQUAL	
new	TokenNamenew	
char	TokenNamechar	
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
<<	TokenNameLEFT_SHIFT	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
tmp	TokenNameIdentifier	 tmp
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
=	TokenNameEQUAL	
tmp	TokenNameIdentifier	 tmp
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
index	TokenNameIdentifier	 index
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
String	TokenNameIdentifier	 String
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
String	TokenNameIdentifier	 String
rawname	TokenNameIdentifier	 rawname
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
index	TokenNameIdentifier	 index
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
int	TokenNameint	
prefixLength	TokenNameIdentifier	 prefix Length
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
prefix	TokenNameIdentifier	 prefix
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
prefixLength	TokenNameIdentifier	 prefix Length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
len	TokenNameIdentifier	 len
=	TokenNameEQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
prefixLength	TokenNameIdentifier	 prefix Length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
int	TokenNameint	
startLocal	TokenNameIdentifier	 start Local
=	TokenNameEQUAL	
index	TokenNameIdentifier	 index
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isNCNameStart	TokenNameIdentifier	 is NC Name Start
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
startLocal	TokenNameIdentifier	 start Local
]	TokenNameRBRACKET	
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
"IllegalQName"	TokenNameStringLiteral	IllegalQName
,	TokenNameCOMMA	
null	TokenNamenull	
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
.	TokenNameDOT	
SEVERITY_FATAL_ERROR	TokenNameIdentifier	 SEVERITY  FATAL  ERROR
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
.	TokenNameDOT	
addSymbol	TokenNameIdentifier	 add Symbol
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
startLocal	TokenNameIdentifier	 start Local
,	TokenNameCOMMA	
len	TokenNameIdentifier	 len
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
localpart	TokenNameIdentifier	 localpart
=	TokenNameEQUAL	
rawname	TokenNameIdentifier	 rawname
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
qname	TokenNameIdentifier	 qname
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
prefix	TokenNameIdentifier	 prefix
,	TokenNameCOMMA	
localpart	TokenNameIdentifier	 localpart
,	TokenNameCOMMA	
rawname	TokenNameIdentifier	 rawname
,	TokenNameCOMMA	
null	TokenNamenull	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanQName, "	TokenNameStringLiteral	)scanQName, 
+	TokenNamePLUS	
qname	TokenNameIdentifier	 qname
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> true"	TokenNameStringLiteral	 -> true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// no qualified name found 	TokenNameCOMMENT_LINE	no qualified name found 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanQName, "	TokenNameStringLiteral	)scanQName, 
+	TokenNamePLUS	
qname	TokenNameIdentifier	 qname
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> false"	TokenNameStringLiteral	 -> false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanQName(QName):boolean 	TokenNameCOMMENT_LINE	scanQName(QName):boolean 
/** * Scans a range of parsed character data, setting the fields of the * XMLString structure, appropriately. * <p> * <strong>Note:</strong> The characters are consumed. * <p> * <strong>Note:</strong> This method does not guarantee to return * the longest run of parsed character data. This method may return * before markup due to reaching the end of the input buffer or any * other reason. * <p> * <strong>Note:</strong> The fields contained in the XMLString * structure are not guaranteed to remain valid upon subsequent calls * to the entity scanner. Therefore, the caller is responsible for * immediately using the returned character data or making a copy of * the character data. * * @param content The content structure to fill. * * @return Returns the next character on the input, if known. This * value may be -1 but this does <em>note</em> designate * end of file. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Scans a range of parsed character data, setting the fields of the XMLString structure, appropriately. <p> <strong>Note:</strong> The characters are consumed. <p> <strong>Note:</strong> This method does not guarantee to return the longest run of parsed character data. This method may return before markup due to reaching the end of the input buffer or any other reason. <p> <strong>Note:</strong> The fields contained in the XMLString structure are not guaranteed to remain valid upon subsequent calls to the entity scanner. Therefore, the caller is responsible for immediately using the returned character data or making a copy of the character data. * @param content The content structure to fill. * @return Returns the next character on the input, if known. This value may be -1 but this does <em>note</em> designate end of file. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
int	TokenNameint	
scanContent	TokenNameIdentifier	 scan Content
(	TokenNameLPAREN	
XMLString	TokenNameIdentifier	 XML String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(scanContent: "	TokenNameStringLiteral	(scanContent: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize newlines 	TokenNameCOMMENT_LINE	normalize newlines 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
newlines	TokenNameIdentifier	 newlines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"[newline, "	TokenNameStringLiteral	[newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** NEWLINE NORMALIZATION ***/	TokenNameCOMMENT_JAVADOC	* NEWLINE NORMALIZATION **
else	TokenNameelse	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"]newline, "	TokenNameStringLiteral	]newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"]newline, "	TokenNameStringLiteral	]newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// inner loop, scanning for content 	TokenNameCOMMENT_LINE	inner loop, scanning for content 
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isContent	TokenNameIdentifier	 is Content
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return next character 	TokenNameCOMMENT_LINE	return next character 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
!=	TokenNameNOT_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// REVISIT: Does this need to be updated to fix the 	TokenNameCOMMENT_LINE	REVISIT: Does this need to be updated to fix the 
// #x0D ^#x0A newline normalization problem? -Ac 	TokenNameCOMMENT_LINE	#x0D ^#x0A newline normalization problem? -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanContent: "	TokenNameStringLiteral	)scanContent: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> '"	TokenNameStringLiteral	 -> '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanContent(XMLString):int 	TokenNameCOMMENT_LINE	scanContent(XMLString):int 
/** * Scans a range of attribute value data, setting the fields of the * XMLString structure, appropriately. * <p> * <strong>Note:</strong> The characters are consumed. * <p> * <strong>Note:</strong> This method does not guarantee to return * the longest run of attribute value data. This method may return * before the quote character due to reaching the end of the input * buffer or any other reason. * <p> * <strong>Note:</strong> The fields contained in the XMLString * structure are not guaranteed to remain valid upon subsequent calls * to the entity scanner. Therefore, the caller is responsible for * immediately using the returned character data or making a copy of * the character data. * * @param quote The quote character that signifies the end of the * attribute value data. * @param content The content structure to fill. * * @return Returns the next character on the input, if known. This * value may be -1 but this does <em>note</em> designate * end of file. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Scans a range of attribute value data, setting the fields of the XMLString structure, appropriately. <p> <strong>Note:</strong> The characters are consumed. <p> <strong>Note:</strong> This method does not guarantee to return the longest run of attribute value data. This method may return before the quote character due to reaching the end of the input buffer or any other reason. <p> <strong>Note:</strong> The fields contained in the XMLString structure are not guaranteed to remain valid upon subsequent calls to the entity scanner. Therefore, the caller is responsible for immediately using the returned character data or making a copy of the character data. * @param quote The quote character that signifies the end of the attribute value data. @param content The content structure to fill. * @return Returns the next character on the input, if known. This value may be -1 but this does <em>note</em> designate end of file. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
int	TokenNameint	
scanLiteral	TokenNameIdentifier	 scan Literal
(	TokenNameLPAREN	
int	TokenNameint	
quote	TokenNameIdentifier	 quote
,	TokenNameCOMMA	
XMLString	TokenNameIdentifier	 XML String
content	TokenNameIdentifier	 content
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(scanLiteral, '"	TokenNameStringLiteral	(scanLiteral, '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
quote	TokenNameIdentifier	 quote
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize newlines 	TokenNameCOMMENT_LINE	normalize newlines 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
newlines	TokenNameIdentifier	 newlines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"[newline, "	TokenNameStringLiteral	[newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** NEWLINE NORMALIZATION ***/	TokenNameCOMMENT_JAVADOC	* NEWLINE NORMALIZATION **
else	TokenNameelse	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/***/	TokenNameCOMMENT_JAVADOC	 
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"]newline, "	TokenNameStringLiteral	]newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"]newline, "	TokenNameStringLiteral	]newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// scan literal value 	TokenNameCOMMENT_LINE	scan literal value 
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
quote	TokenNameIdentifier	 quote
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
literal	TokenNameIdentifier	 literal
||	TokenNameOR_OR	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
||	TokenNameOR_OR	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'%'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
!	TokenNameNOT	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isContent	TokenNameIdentifier	 is Content
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
content	TokenNameIdentifier	 content
.	TokenNameDOT	
setValues	TokenNameIdentifier	 set Values
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return next character 	TokenNameCOMMENT_LINE	return next character 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
!=	TokenNameNOT_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
// NOTE: We don't want to accidentally signal the 	TokenNameCOMMENT_LINE	NOTE: We don't want to accidentally signal the 
// end of the literal if we're expanding an 	TokenNameCOMMENT_LINE	end of the literal if we're expanding an 
// entity appearing in the literal. -Ac 	TokenNameCOMMENT_LINE	entity appearing in the literal. -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
quote	TokenNameIdentifier	 quote
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
literal	TokenNameIdentifier	 literal
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanLiteral, '"	TokenNameStringLiteral	)scanLiteral, '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
quote	TokenNameIdentifier	 quote
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> '"	TokenNameStringLiteral	 -> '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"'"	TokenNameStringLiteral	'
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanLiteral(int,XMLString):int 	TokenNameCOMMENT_LINE	scanLiteral(int,XMLString):int 
/** * Scans a range of character data up to the specified delimiter, * setting the fields of the XMLString structure, appropriately. * <p> * <strong>Note:</strong> The characters are consumed. * <p> * <strong>Note:</strong> This assumes that the internal buffer is * at least the same size, or bigger, than the length of the delimiter * and that the delimiter contains at least one character. * <p> * <strong>Note:</strong> This method does not guarantee to return * the longest run of character data. This method may return before * the delimiter due to reaching the end of the input buffer or any * other reason. * <p> * <strong>Note:</strong> The fields contained in the XMLString * structure are not guaranteed to remain valid upon subsequent calls * to the entity scanner. Therefore, the caller is responsible for * immediately using the returned character data or making a copy of * the character data. * * @param delimiter The string that signifies the end of the character * data to be scanned. * @param buffer The XMLStringBuffer to fill. * * @return Returns true if there is more data to scan, false otherwise. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Scans a range of character data up to the specified delimiter, setting the fields of the XMLString structure, appropriately. <p> <strong>Note:</strong> The characters are consumed. <p> <strong>Note:</strong> This assumes that the internal buffer is at least the same size, or bigger, than the length of the delimiter and that the delimiter contains at least one character. <p> <strong>Note:</strong> This method does not guarantee to return the longest run of character data. This method may return before the delimiter due to reaching the end of the input buffer or any other reason. <p> <strong>Note:</strong> The fields contained in the XMLString structure are not guaranteed to remain valid upon subsequent calls to the entity scanner. Therefore, the caller is responsible for immediately using the returned character data or making a copy of the character data. * @param delimiter The string that signifies the end of the character data to be scanned. @param buffer The XMLStringBuffer to fill. * @return Returns true if there is more data to scan, false otherwise. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
boolean	TokenNameboolean	
scanData	TokenNameIdentifier	 scan Data
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
delimiter	TokenNameIdentifier	 delimiter
,	TokenNameCOMMA	
XMLStringBuffer	TokenNameIdentifier	 XML String Buffer
buffer	TokenNameIdentifier	 buffer
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
// REVISIT: This method does not need to use a string buffer. 	TokenNameCOMMENT_LINE	REVISIT: This method does not need to use a string buffer. 
// The change would avoid the array copies and increase 	TokenNameCOMMENT_LINE	The change would avoid the array copies and increase 
// performance. -Ac 	TokenNameCOMMENT_LINE	performance. -Ac 
// 	TokenNameCOMMENT_LINE	 
// Currently, this method is called for scanning CDATA 	TokenNameCOMMENT_LINE	Currently, this method is called for scanning CDATA 
// sections, comments, and processing instruction data. 	TokenNameCOMMENT_LINE	sections, comments, and processing instruction data. 
// So if this code is updated to NOT buffer, the scanning 	TokenNameCOMMENT_LINE	So if this code is updated to NOT buffer, the scanning 
// code for comments and processing instructions will 	TokenNameCOMMENT_LINE	code for comments and processing instructions will 
// need to be updated to do its own buffering. The code 	TokenNameCOMMENT_LINE	need to be updated to do its own buffering. The code 
// for CDATA sections is safe as-is. -Ac 	TokenNameCOMMENT_LINE	for CDATA sections is safe as-is. -Ac 
boolean	TokenNameboolean	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
int	TokenNameint	
delimLen	TokenNameIdentifier	 delim Len
=	TokenNameEQUAL	
delimiter	TokenNameIdentifier	 delimiter
.	TokenNameDOT	
length	TokenNameIdentifier	 length
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
char	TokenNamechar	
charAt0	TokenNameIdentifier	 char At0
=	TokenNameEQUAL	
delimiter	TokenNameIdentifier	 delimiter
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(scanData: "	TokenNameStringLiteral	(scanData: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
boolean	TokenNameboolean	
bNextEntity	TokenNameIdentifier	 b Next Entity
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
delimLen	TokenNameIdentifier	 delim Len
)	TokenNameRPAREN	
&&	TokenNameAND_AND	
(	TokenNameLPAREN	
!	TokenNameNOT	
bNextEntity	TokenNameIdentifier	 b Next Entity
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
bNextEntity	TokenNameIdentifier	 b Next Entity
=	TokenNameEQUAL	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
>	TokenNameGREATER	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
delimLen	TokenNameIdentifier	 delim Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// something must be wrong with the input: e.g., file ends in an unterminated comment 	TokenNameCOMMENT_LINE	something must be wrong with the input: e.g., file ends in an unterminated comment 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// normalize newlines 	TokenNameCOMMENT_LINE	normalize newlines 
int	TokenNameint	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
offset	TokenNameIdentifier	 offset
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
int	TokenNameint	
newlines	TokenNameIdentifier	 newlines
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"[newline, "	TokenNameStringLiteral	[newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
do	TokenNamedo	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
offset	TokenNameIdentifier	 offset
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
/*** NEWLINE NORMALIZATION ***/	TokenNameCOMMENT_JAVADOC	* NEWLINE NORMALIZATION **
else	TokenNameelse	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
newlines	TokenNameIdentifier	 newlines
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
offset	TokenNameIdentifier	 offset
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
newlines	TokenNameIdentifier	 newlines
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
i	TokenNameIdentifier	 i
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
'\n'	TokenNameCharacterLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"]newline, "	TokenNameStringLiteral	]newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"]newline, "	TokenNameStringLiteral	]newline, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
", "	TokenNameStringLiteral	, 
+	TokenNamePLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// iterate over buffer looking for delimiter 	TokenNameCOMMENT_LINE	iterate over buffer looking for delimiter 
OUTER	TokenNameIdentifier	 OUTER
:	TokenNameCOLON	
while	TokenNamewhile	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
<	TokenNameLESS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
charAt0	TokenNameIdentifier	 char At0
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// looks like we just hit the delimiter 	TokenNameCOMMENT_LINE	looks like we just hit the delimiter 
int	TokenNameint	
delimOffset	TokenNameIdentifier	 delim Offset
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
for	TokenNamefor	
(	TokenNameLPAREN	
int	TokenNameint	
i	TokenNameIdentifier	 i
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
delimLen	TokenNameIdentifier	 delim Len
;	TokenNameSEMICOLON	
i	TokenNameIdentifier	 i
++	TokenNamePLUS_PLUS	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
;	TokenNameSEMICOLON	
break	TokenNamebreak	
OUTER	TokenNameIdentifier	 OUTER
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
delimiter	TokenNameIdentifier	 delimiter
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
delimOffset	TokenNameIdentifier	 delim Offset
+	TokenNamePLUS	
delimLen	TokenNameIdentifier	 delim Len
)	TokenNameRPAREN	
{	TokenNameLBRACE	
found	TokenNameIdentifier	 found
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
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
(	TokenNameLPAREN	
external	TokenNameIdentifier	 external
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
break	TokenNamebreak	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isInvalid	TokenNameIdentifier	 is Invalid
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
newlines	TokenNameIdentifier	 newlines
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
-=	TokenNameMINUS_EQUAL	
delimLen	TokenNameIdentifier	 delim Len
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
buffer	TokenNameIdentifier	 buffer
.	TokenNameDOT	
append	TokenNameIdentifier	 append
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// return true if string was skipped 	TokenNameCOMMENT_LINE	return true if string was skipped 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")scanData: "	TokenNameStringLiteral	)scanData: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> "	TokenNameStringLiteral	 -> 
+	TokenNamePLUS	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
!	TokenNameNOT	
found	TokenNameIdentifier	 found
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// scanData(String,XMLString):boolean 	TokenNameCOMMENT_LINE	scanData(String,XMLString):boolean 
/** * Skips a character appearing immediately on the input. * <p> * <strong>Note:</strong> The character is consumed only if it matches * the specified character. * * @param c The character to skip. * * @return Returns true if the character was skipped. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Skips a character appearing immediately on the input. <p> <strong>Note:</strong> The character is consumed only if it matches the specified character. * @param c The character to skip. * @return Returns true if the character was skipped. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipChar	TokenNameIdentifier	 skip Char
(	TokenNameLPAREN	
int	TokenNameint	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(skipChar, '"	TokenNameStringLiteral	(skipChar, '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip character 	TokenNameCOMMENT_LINE	skip character 
int	TokenNameint	
cc	TokenNameIdentifier	 cc
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
c	TokenNameIdentifier	 c
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipChar, '"	TokenNameStringLiteral	)skipChar, '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> true"	TokenNameStringLiteral	 -> true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
cc	TokenNameIdentifier	 cc
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// handle newlines 	TokenNameCOMMENT_LINE	handle newlines 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
cc	TokenNameIdentifier	 cc
;	TokenNameSEMICOLON	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipChar, '"	TokenNameStringLiteral	)skipChar, '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> true"	TokenNameStringLiteral	 -> true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// character was not skipped 	TokenNameCOMMENT_LINE	character was not skipped 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipChar, '"	TokenNameStringLiteral	)skipChar, '
+	TokenNamePLUS	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
+	TokenNamePLUS	
"': "	TokenNameStringLiteral	': 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> false"	TokenNameStringLiteral	 -> false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skipChar(int):boolean 	TokenNameCOMMENT_LINE	skipChar(int):boolean 
/** * Skips space characters appearing immediately on the input. * <p> * <strong>Note:</strong> The characters are consumed only if they are * space characters. * * @return Returns true if at least one space character was skipped. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.XMLChar#isSpace */	TokenNameCOMMENT_JAVADOC	 Skips space characters appearing immediately on the input. <p> <strong>Note:</strong> The characters are consumed only if they are space characters. * @return Returns true if at least one space character was skipped. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.XMLChar#isSpace 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipSpaces	TokenNameIdentifier	 skip Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(skipSpaces: "	TokenNameStringLiteral	(skipSpaces: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip spaces 	TokenNameCOMMENT_LINE	skip spaces 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
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
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// handle newlines 	TokenNameCOMMENT_LINE	handle newlines 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
external	TokenNameIdentifier	 external
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entityChanged	TokenNameIdentifier	 entity Changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the load change the position to be 1, 	TokenNameCOMMENT_LINE	the load change the position to be 1, 
// need to restore it when entity not changed 	TokenNameCOMMENT_LINE	need to restore it when entity not changed 
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: Does this need to be updated to fix the 	TokenNameCOMMENT_LINE	REVISIT: Does this need to be updated to fix the 
// #x0D ^#x0A newline normalization problem? -Ac 	TokenNameCOMMENT_LINE	#x0D ^#x0A newline normalization problem? -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*** NEWLINE NORMALIZATION *** else { if (fCurrentEntity.ch[fCurrentEntity.position + 1] == '\r' && external) { fCurrentEntity.position++; } } /***/	TokenNameCOMMENT_JAVADOC	* NEWLINE NORMALIZATION *** else { if (fCurrentEntity.ch[fCurrentEntity.position + 1] == '\r' && external) { fCurrentEntity.position++; } } /**
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entityChanged	TokenNameIdentifier	 entity Changed
)	TokenNameRPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipSpaces: "	TokenNameStringLiteral	)skipSpaces: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> true"	TokenNameStringLiteral	 -> true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// no spaces were found 	TokenNameCOMMENT_LINE	no spaces were found 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipSpaces: "	TokenNameStringLiteral	)skipSpaces: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> false"	TokenNameStringLiteral	 -> false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skipSpaces():boolean 	TokenNameCOMMENT_LINE	skipSpaces():boolean 
/** * Skips space characters appearing immediately on the input that would * match non-terminal S (0x09, 0x0A, 0x0D, 0x20) before end of line * normalization is performed. This is useful when scanning structures * such as the XMLDecl and TextDecl that can only contain US-ASCII * characters. * <p> * <strong>Note:</strong> The characters are consumed only if they would * match non-terminal S before end of line normalization is performed. * * @return Returns true if at least one space character was skipped. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. * * @see org.apache.xerces.util.XMLChar#isSpace */	TokenNameCOMMENT_JAVADOC	 Skips space characters appearing immediately on the input that would match non-terminal S (0x09, 0x0A, 0x0D, 0x20) before end of line normalization is performed. This is useful when scanning structures such as the XMLDecl and TextDecl that can only contain US-ASCII characters. <p> <strong>Note:</strong> The characters are consumed only if they would match non-terminal S before end of line normalization is performed. * @return Returns true if at least one space character was skipped. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. * @see org.apache.xerces.util.XMLChar#isSpace 
public	TokenNamepublic	
final	TokenNamefinal	
boolean	TokenNameboolean	
skipDeclSpaces	TokenNameIdentifier	 skip Decl Spaces
(	TokenNameLPAREN	
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(skipDeclSpaces: "	TokenNameStringLiteral	(skipDeclSpaces: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip spaces 	TokenNameCOMMENT_LINE	skip spaces 
int	TokenNameint	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
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
boolean	TokenNameboolean	
external	TokenNameIdentifier	 external
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
do	TokenNamedo	
{	TokenNameLBRACE	
boolean	TokenNameboolean	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
// handle newlines 	TokenNameCOMMENT_LINE	handle newlines 
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\n'	TokenNameCharacterLiteral	
||	TokenNameOR_OR	
(	TokenNameLPAREN	
external	TokenNameIdentifier	 external
&&	TokenNameAND_AND	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
=	TokenNameEQUAL	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
0	TokenNameIntegerLiteral	
]	TokenNameRBRACKET	
=	TokenNameEQUAL	
(	TokenNameLPAREN	
char	TokenNamechar	
)	TokenNameRPAREN	
c	TokenNameIdentifier	 c
;	TokenNameSEMICOLON	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entityChanged	TokenNameIdentifier	 entity Changed
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// the load change the position to be 1, 	TokenNameCOMMENT_LINE	the load change the position to be 1, 
// need to restore it when entity not changed 	TokenNameCOMMENT_LINE	need to restore it when entity not changed 
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
0	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
==	TokenNameEQUAL_EQUAL	
'\r'	TokenNameCharacterLiteral	
&&	TokenNameAND_AND	
external	TokenNameIdentifier	 external
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: Does this need to be updated to fix the 	TokenNameCOMMENT_LINE	REVISIT: Does this need to be updated to fix the 
// #x0D ^#x0A newline normalization problem? -Ac 	TokenNameCOMMENT_LINE	#x0D ^#x0A newline normalization problem? -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
++	TokenNamePLUS_PLUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
!=	TokenNameNOT_EQUAL	
'\n'	TokenNameCharacterLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
--	TokenNameMINUS_MINUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
/*** NEWLINE NORMALIZATION *** else { if (fCurrentEntity.ch[fCurrentEntity.position + 1] == '\r' && external) { fCurrentEntity.position++; } } /***/	TokenNameCOMMENT_JAVADOC	* NEWLINE NORMALIZATION *** else { if (fCurrentEntity.ch[fCurrentEntity.position + 1] == '\r' && external) { fCurrentEntity.position++; } } /**
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
entityChanged	TokenNameIdentifier	 entity Changed
)	TokenNameRPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
while	TokenNamewhile	
(	TokenNameLPAREN	
XMLChar	TokenNameIdentifier	 XML Char
.	TokenNameDOT	
isSpace	TokenNameIdentifier	 is Space
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
]	TokenNameRBRACKET	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipDeclSpaces: "	TokenNameStringLiteral	)skipDeclSpaces: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> true"	TokenNameStringLiteral	 -> true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// no spaces were found 	TokenNameCOMMENT_LINE	no spaces were found 
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipDeclSpaces: "	TokenNameStringLiteral	)skipDeclSpaces: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> false"	TokenNameStringLiteral	 -> false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skipDeclSpaces():boolean 	TokenNameCOMMENT_LINE	skipDeclSpaces():boolean 
/** * Skips the specified string appearing immediately on the input. * <p> * <strong>Note:</strong> The characters are consumed only if they are * space characters. * * @param s The string to skip. * * @return Returns true if the string was skipped. * * @throws IOException Thrown if i/o error occurs. * @throws EOFException Thrown on end of file. */	TokenNameCOMMENT_JAVADOC	 Skips the specified string appearing immediately on the input. <p> <strong>Note:</strong> The characters are consumed only if they are space characters. * @param s The string to skip. * @return Returns true if the string was skipped. * @throws IOException Thrown if i/o error occurs. @throws EOFException Thrown on end of file. 
public	TokenNamepublic	
boolean	TokenNameboolean	
skipString	TokenNameIdentifier	 skip String
(	TokenNameLPAREN	
String	TokenNameIdentifier	 String
s	TokenNameIdentifier	 s
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(skipString, ""	TokenNameStringLiteral	(skipString, "
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"": "	TokenNameStringLiteral	": 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load more characters, if needed 	TokenNameCOMMENT_LINE	load more characters, if needed 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skip string 	TokenNameCOMMENT_LINE	skip string 
final	TokenNamefinal	
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
length	TokenNameIdentifier	 length
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
char	TokenNamechar	
c	TokenNameIdentifier	 c
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
[	TokenNameLBRACKET	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
++	TokenNamePLUS_PLUS	
]	TokenNameRBRACKET	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
c	TokenNameIdentifier	 c
!=	TokenNameNOT_EQUAL	
s	TokenNameIdentifier	 s
.	TokenNameDOT	
charAt	TokenNameIdentifier	 char At
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipString, ""	TokenNameStringLiteral	)skipString, "
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"": "	TokenNameStringLiteral	": 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> false"	TokenNameStringLiteral	 -> false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
<	TokenNameLESS	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
arraycopy	TokenNameIdentifier	 arraycopy
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
-	TokenNameMINUS	
i	TokenNameIdentifier	 i
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// REVISIT: Can a string to be skipped cross an 	TokenNameCOMMENT_LINE	REVISIT: Can a string to be skipped cross an 
// entity boundary? -Ac 	TokenNameCOMMENT_LINE	entity boundary? -Ac 
if	TokenNameif	
(	TokenNameLPAREN	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
false	TokenNamefalse	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-=	TokenNameMINUS_EQUAL	
i	TokenNameIdentifier	 i
+	TokenNamePLUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipString, ""	TokenNameStringLiteral	)skipString, "
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"": "	TokenNameStringLiteral	": 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> false"	TokenNameStringLiteral	 -> false
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")skipString, ""	TokenNameStringLiteral	)skipString, "
+	TokenNamePLUS	
s	TokenNameIdentifier	 s
+	TokenNamePLUS	
"": "	TokenNameStringLiteral	": 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" -> true"	TokenNameStringLiteral	 -> true
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
+=	TokenNamePLUS_EQUAL	
length	TokenNameIdentifier	 length
;	TokenNameSEMICOLON	
return	TokenNamereturn	
true	TokenNametrue	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// skipString(String):boolean 	TokenNameCOMMENT_LINE	skipString(String):boolean 
// 	TokenNameCOMMENT_LINE	 
// Locator methods 	TokenNameCOMMENT_LINE	Locator methods 
// 	TokenNameCOMMENT_LINE	 
/** * Return the public identifier for the current document event. * <p> * The return value is the public identifier of the document * entity or of the external parsed entity in which the markup * triggering the event appears. * * @return A string containing the public identifier, or * null if none is available. */	TokenNameCOMMENT_JAVADOC	 Return the public identifier for the current document event. <p> The return value is the public identifier of the document entity or of the external parsed entity in which the markup triggering the event appears. * @return A string containing the public identifier, or null if none is available. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
?	TokenNameQUESTION	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
.	TokenNameDOT	
getPublicId	TokenNameIdentifier	 get Public Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
:	TokenNameCOLON	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getPublicId():String 	TokenNameCOMMENT_LINE	getPublicId():String 
/** * Return the expanded system identifier for the current document event. * <p> * The return value is the expanded system identifier of the document * entity or of the external parsed entity in which the markup * triggering the event appears. * <p> * If the system identifier is a URL, the parser must resolve it * fully before passing it to the application. * * @return A string containing the expanded system identifier, or null * if none is available. */	TokenNameCOMMENT_JAVADOC	 Return the expanded system identifier for the current document event. <p> The return value is the expanded system identifier of the document entity or of the external parsed entity in which the markup triggering the event appears. <p> If the system identifier is a URL, the parser must resolve it fully before passing it to the application. * @return A string containing the expanded system identifier, or null if none is available. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// get the current entity to return something appropriate: 	TokenNameCOMMENT_LINE	get the current entity to return something appropriate: 
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
getExpandedSystemId	TokenNameIdentifier	 get Expanded System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getExpandedSystemId():String 	TokenNameCOMMENT_LINE	getExpandedSystemId():String 
/** * Return the literal system identifier for the current document event. * <p> * The return value is the literal system identifier of the document * entity or of the external parsed entity in which the markup * triggering the event appears. * <p> * @return A string containing the literal system identifier, or null * if none is available. */	TokenNameCOMMENT_JAVADOC	 Return the literal system identifier for the current document event. <p> The return value is the literal system identifier of the document entity or of the external parsed entity in which the markup triggering the event appears. <p> @return A string containing the literal system identifier, or null if none is available. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
&&	TokenNameAND_AND	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
.	TokenNameDOT	
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
entityLocation	TokenNameIdentifier	 entity Location
.	TokenNameDOT	
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// get the current entity to do it: 	TokenNameCOMMENT_LINE	get the current entity to do it: 
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
getLiteralSystemId	TokenNameIdentifier	 get Literal System Id
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLiteralSystemId():String 	TokenNameCOMMENT_LINE	getLiteralSystemId():String 
/** * Returns the line number where the current document event ends. * <p> * <strong>Warning:</strong> The return value from the method * is intended only as an approximation for the sake of error * reporting; it is not intended to provide sufficient information * to edit the character content of the original XML document. * <p> * The return value is an approximation of the line number * in the document entity or external parsed entity where the * markup triggering the event appears. * <p> * If possible, the line position of the first character after the * text associated with the document event should be provided. * The first line in the document is line 1. * * @return The line number, or -1 if none is available. */	TokenNameCOMMENT_JAVADOC	 Returns the line number where the current document event ends. <p> <strong>Warning:</strong> The return value from the method is intended only as an approximation for the sake of error reporting; it is not intended to provide sufficient information to edit the character content of the original XML document. <p> The return value is an approximation of the line number in the document entity or external parsed entity where the markup triggering the event appears. <p> If possible, the line position of the first character after the text associated with the document event should be provided. The first line in the document is line 1. * @return The line number, or -1 if none is available. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
lineNumber	TokenNameIdentifier	 line Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ask the current entity to return something appropriate: 	TokenNameCOMMENT_LINE	ask the current entity to return something appropriate: 
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
getLineNumber	TokenNameIdentifier	 get Line Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getLineNumber():int 	TokenNameCOMMENT_LINE	getLineNumber():int 
/** * Returns the column number where the current document event ends. * <p> * <strong>Warning:</strong> The return value from the method * is intended only as an approximation for the sake of error * reporting; it is not intended to provide sufficient information * to edit the character content of the original XML document. * <p> * The return value is an approximation of the column number * in the document entity or external parsed entity where the * markup triggering the event appears. * <p> * If possible, the line position of the first character after the * text associated with the document event should be provided. * The first column in each line is column 1. * * @return The column number, or -1 if none is available. */	TokenNameCOMMENT_JAVADOC	 Returns the column number where the current document event ends. <p> <strong>Warning:</strong> The return value from the method is intended only as an approximation for the sake of error reporting; it is not intended to provide sufficient information to edit the character content of the original XML document. <p> The return value is an approximation of the column number in the document entity or external parsed entity where the markup triggering the event appears. <p> If possible, the line position of the first character after the text associated with the document event should be provided. The first column in each line is column 1. * @return The column number, or -1 if none is available. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
columnNumber	TokenNameIdentifier	 column Number
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ask current entity to find appropriate column number 	TokenNameCOMMENT_LINE	ask current entity to find appropriate column number 
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
getColumnNumber	TokenNameIdentifier	 get Column Number
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getColumnNumber():int 	TokenNameCOMMENT_LINE	getColumnNumber():int 
/** * Returns the character offset where the current document event ends. * <p> * <strong>Warning:</strong> The return value from the method * is intended only as an approximation for the sake of error * reporting; it is not intended to provide sufficient information * to edit the character content of the original XML document. * <p> * The return value is an approximation of the character offset * in the document entity or external parsed entity where the * markup triggering the event appears. * <p> * If possible, the character offset of the first character after the * text associated with the document event should be provided. * * @return The character offset, or -1 if none is available. */	TokenNameCOMMENT_JAVADOC	 Returns the character offset where the current document event ends. <p> <strong>Warning:</strong> The return value from the method is intended only as an approximation for the sake of error reporting; it is not intended to provide sufficient information to edit the character content of the original XML document. <p> The return value is an approximation of the character offset in the document entity or external parsed entity where the markup triggering the event appears. <p> If possible, the character offset of the first character after the text associated with the document event should be provided. * @return The character offset, or -1 if none is available. 
public	TokenNamepublic	
final	TokenNamefinal	
int	TokenNameint	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+	TokenNamePLUS	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ask current entity to find appropriate character offset 	TokenNameCOMMENT_LINE	ask current entity to find appropriate character offset 
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
getCharacterOffset	TokenNameIdentifier	 get Character Offset
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getCharacterOffset():int 	TokenNameCOMMENT_LINE	getCharacterOffset():int 
/** * Returns the encoding of the current entity. * Note that, for a given entity, this value can only be * considered final once the encoding declaration has been read (or once it * has been determined that there is no such declaration) since, no encoding * having been specified on the XMLInputSource, the parser * will make an initial "guess" which could be in error. */	TokenNameCOMMENT_JAVADOC	 Returns the encoding of the current entity. Note that, for a given entity, this value can only be considered final once the encoding declaration has been read (or once it has been determined that there is no such declaration) since, no encoding having been specified on the XMLInputSource, the parser will make an initial "guess" which could be in error. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
encoding	TokenNameIdentifier	 encoding
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ask current entity to find appropriate encoding 	TokenNameCOMMENT_LINE	ask current entity to find appropriate encoding 
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
getEncoding	TokenNameIdentifier	 get Encoding
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getEncoding():String 	TokenNameCOMMENT_LINE	getEncoding():String 
/** * Returns the XML version of the current entity. This will normally be the * value from the XML or text declaration or defaulted by the parser. Note that * that this value may be different than the version of the processing rules * applied to the current entity. For instance, an XML 1.1 document may refer to * XML 1.0 entities. In such a case the rules of XML 1.1 are applied to the entire * document. Also note that, for a given entity, this value can only be considered * final once the XML or text declaration has been read or once it has been * determined that there is no such declaration. */	TokenNameCOMMENT_JAVADOC	 Returns the XML version of the current entity. This will normally be the value from the XML or text declaration or defaulted by the parser. Note that that this value may be different than the version of the processing rules applied to the current entity. For instance, an XML 1.1 document may refer to XML 1.0 entities. In such a case the rules of XML 1.1 are applied to the entire document. Also note that, for a given entity, this value can only be considered final once the XML or text declaration has been read or once it has been determined that there is no such declaration. 
public	TokenNamepublic	
final	TokenNamefinal	
String	TokenNameIdentifier	 String
getXMLVersion	TokenNameIdentifier	 get XML Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
!=	TokenNameNOT_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
isExternal	TokenNameIdentifier	 is External
(	TokenNameLPAREN	
)	TokenNameRPAREN	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
xmlVersion	TokenNameIdentifier	 xml Version
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
else	TokenNameelse	
{	TokenNameLBRACE	
// ask current entity to find the appropriate XML version 	TokenNameCOMMENT_LINE	ask current entity to find the appropriate XML version 
return	TokenNamereturn	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
getXMLVersion	TokenNameIdentifier	 get XML Version
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
return	TokenNamereturn	
null	TokenNamenull	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// getXMLVersion():String 	TokenNameCOMMENT_LINE	getXMLVersion():String 
// allow entity manager to tell us what the current entityis: 	TokenNameCOMMENT_LINE	allow entity manager to tell us what the current entityis: 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setCurrentEntity	TokenNameIdentifier	 set Current Entity
(	TokenNameLPAREN	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
ScannedEntity	TokenNameIdentifier	 Scanned Entity
ent	TokenNameIdentifier	 ent
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
=	TokenNameEQUAL	
ent	TokenNameIdentifier	 ent
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// set buffer size: 	TokenNameCOMMENT_LINE	set buffer size: 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
setBufferSize	TokenNameIdentifier	 set Buffer Size
(	TokenNameLPAREN	
int	TokenNameint	
size	TokenNameIdentifier	 size
)	TokenNameRPAREN	
{	TokenNameLBRACE	
// REVISIT: Buffer size passed to entity scanner 	TokenNameCOMMENT_LINE	REVISIT: Buffer size passed to entity scanner 
// was not being kept in synch with the actual size 	TokenNameCOMMENT_LINE	was not being kept in synch with the actual size 
// of the buffers in each scanned entity. If any 	TokenNameCOMMENT_LINE	of the buffers in each scanned entity. If any 
// of the buffers were actually resized, it was possible 	TokenNameCOMMENT_LINE	of the buffers were actually resized, it was possible 
// that the parser would throw an ArrayIndexOutOfBoundsException 	TokenNameCOMMENT_LINE	that the parser would throw an ArrayIndexOutOfBoundsException 
// for documents which contained names which are longer than 	TokenNameCOMMENT_LINE	for documents which contained names which are longer than 
// the current buffer size. Conceivably the buffer size passed 	TokenNameCOMMENT_LINE	the current buffer size. Conceivably the buffer size passed 
// to entity scanner could be used to determine a minimum size 	TokenNameCOMMENT_LINE	to entity scanner could be used to determine a minimum size 
// for resizing, if doubling its size is smaller than this 	TokenNameCOMMENT_LINE	for resizing, if doubling its size is smaller than this 
// minimum. -- mrglavas 	TokenNameCOMMENT_LINE	minimum. -- mrglavas 
fBufferSize	TokenNameIdentifier	 f Buffer Size
=	TokenNameEQUAL	
size	TokenNameIdentifier	 size
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// reset what little state we have... 	TokenNameCOMMENT_LINE	reset what little state we have... 
public	TokenNamepublic	
final	TokenNamefinal	
void	TokenNamevoid	
reset	TokenNameIdentifier	 reset
(	TokenNameLPAREN	
SymbolTable	TokenNameIdentifier	 Symbol Table
symbolTable	TokenNameIdentifier	 symbol Table
,	TokenNameCOMMA	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
entityManager	TokenNameIdentifier	 entity Manager
,	TokenNameCOMMA	
XMLErrorReporter	TokenNameIdentifier	 XML Error Reporter
reporter	TokenNameIdentifier	 reporter
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
=	TokenNameEQUAL	
null	TokenNamenull	
;	TokenNameSEMICOLON	
fSymbolTable	TokenNameIdentifier	 f Symbol Table
=	TokenNameEQUAL	
symbolTable	TokenNameIdentifier	 symbol Table
;	TokenNameSEMICOLON	
fEntityManager	TokenNameIdentifier	 f Entity Manager
=	TokenNameEQUAL	
entityManager	TokenNameIdentifier	 entity Manager
;	TokenNameSEMICOLON	
fErrorReporter	TokenNameIdentifier	 f Error Reporter
=	TokenNameEQUAL	
reporter	TokenNameIdentifier	 reporter
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// 	TokenNameCOMMENT_LINE	 
// Private methods 	TokenNameCOMMENT_LINE	Private methods 
// 	TokenNameCOMMENT_LINE	 
/** * Loads a chunk of text. * * @param offset The offset into the character buffer to * read the next batch of characters. * @param changeEntity True if the load should change entities * at the end of the entity, otherwise leave * the current entity in place and the entity * boundary will be signaled by the return * value. * * @returns Returns true if the entity changed as a result of this * load operation. */	TokenNameCOMMENT_JAVADOC	 Loads a chunk of text. * @param offset The offset into the character buffer to read the next batch of characters. @param changeEntity True if the load should change entities at the end of the entity, otherwise leave the current entity in place and the entity boundary will be signaled by the return value. * @returns Returns true if the entity changed as a result of this load operation. 
final	TokenNamefinal	
boolean	TokenNameboolean	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
int	TokenNameint	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
boolean	TokenNameboolean	
changeEntity	TokenNameIdentifier	 change Entity
)	TokenNameRPAREN	
throws	TokenNamethrows	
IOException	TokenNameIdentifier	 IO Exception
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
"(load, "	TokenNameStringLiteral	(load, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
baseCharOffset	TokenNameIdentifier	 base Char Offset
+=	TokenNamePLUS_EQUAL	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
-	TokenNameMINUS	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// read characters 	TokenNameCOMMENT_LINE	read characters 
int	TokenNameint	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
.	TokenNameDOT	
length	TokenNameIdentifier	 length
-	TokenNameMINUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
!	TokenNameNOT	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
mayReadChunks	TokenNameIdentifier	 may Read Chunks
&&	TokenNameAND_AND	
length	TokenNameIdentifier	 length
>	TokenNameGREATER	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
DEFAULT_XMLDECL_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  XMLDECL  BUFFER  SIZE
)	TokenNameRPAREN	
{	TokenNameLBRACE	
length	TokenNameIdentifier	 length
=	TokenNameEQUAL	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
DEFAULT_XMLDECL_BUFFER_SIZE	TokenNameIdentifier	 DEFAULT  XMLDECL  BUFFER  SIZE
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" length to try to read: "	TokenNameStringLiteral	 length to try to read: 
+	TokenNamePLUS	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
int	TokenNameint	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
reader	TokenNameIdentifier	 reader
.	TokenNameDOT	
read	TokenNameIdentifier	 read
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
ch	TokenNameIdentifier	 ch
,	TokenNameCOMMA	
offset	TokenNameIdentifier	 offset
,	TokenNameCOMMA	
length	TokenNameIdentifier	 length
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
" length actually read: "	TokenNameStringLiteral	 length actually read: 
+	TokenNamePLUS	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
// reset count and position 	TokenNameCOMMENT_LINE	reset count and position 
boolean	TokenNameboolean	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
false	TokenNamefalse	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
!=	TokenNameNOT_EQUAL	
-	TokenNameMINUS	
1	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
count	TokenNameIdentifier	 count
!=	TokenNameNOT_EQUAL	
0	TokenNameIntegerLiteral	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
count	TokenNameIdentifier	 count
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
// end of this entity 	TokenNameCOMMENT_LINE	end of this entity 
else	TokenNameelse	
{	TokenNameLBRACE	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
startPosition	TokenNameIdentifier	 start Position
=	TokenNameEQUAL	
offset	TokenNameIdentifier	 offset
;	TokenNameSEMICOLON	
entityChanged	TokenNameIdentifier	 entity Changed
=	TokenNameEQUAL	
true	TokenNametrue	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
changeEntity	TokenNameIdentifier	 change Entity
)	TokenNameRPAREN	
{	TokenNameLBRACE	
fEntityManager	TokenNameIdentifier	 f Entity Manager
.	TokenNameDOT	
endEntity	TokenNameIdentifier	 end Entity
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
==	TokenNameEQUAL_EQUAL	
null	TokenNamenull	
)	TokenNameRPAREN	
{	TokenNameLBRACE	
throw	TokenNamethrow	
END_OF_DOCUMENT_ENTITY	TokenNameIdentifier	 END  OF  DOCUMENT  ENTITY
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// handle the trailing edges 	TokenNameCOMMENT_LINE	handle the trailing edges 
if	TokenNameif	
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
position	TokenNameIdentifier	 position
==	TokenNameEQUAL_EQUAL	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
.	TokenNameDOT	
count	TokenNameIdentifier	 count
)	TokenNameRPAREN	
{	TokenNameLBRACE	
load	TokenNameIdentifier	 load
(	TokenNameLPAREN	
0	TokenNameIntegerLiteral	
,	TokenNameCOMMA	
true	TokenNametrue	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
}	TokenNameRBRACE	
if	TokenNameif	
(	TokenNameLPAREN	
DEBUG_BUFFER	TokenNameIdentifier	 DEBUG  BUFFER
)	TokenNameRPAREN	
{	TokenNameLBRACE	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
")load, "	TokenNameStringLiteral	)load, 
+	TokenNamePLUS	
offset	TokenNameIdentifier	 offset
+	TokenNamePLUS	
": "	TokenNameStringLiteral	: 
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
XMLEntityManager	TokenNameIdentifier	 XML Entity Manager
.	TokenNameDOT	
print	TokenNameIdentifier	 print
(	TokenNameLPAREN	
fCurrentEntity	TokenNameIdentifier	 f Current Entity
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
System	TokenNameIdentifier	 System
.	TokenNameDOT	
out	TokenNameIdentifier	 out
.	TokenNameDOT	
println	TokenNameIdentifier	 println
(	TokenNameLPAREN	
)	TokenNameRPAREN	
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
return	TokenNamereturn	
entityChanged	TokenNameIdentifier	 entity Changed
;	TokenNameSEMICOLON	
}	TokenNameRBRACE	
// load(int, boolean):boolean 	TokenNameCOMMENT_LINE	load(int, boolean):boolean 
}	TokenNameRBRACE	
// class XMLEntityScanner 	TokenNameCOMMENT_LINE	class XMLEntityScanner 
